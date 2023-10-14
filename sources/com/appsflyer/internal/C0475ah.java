package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;

/* renamed from: com.appsflyer.internal.ah */
public final class C0475ah {
    public static C0481e AFInAppEventParameterName = null;
    public static long valueOf = 500;

    /* renamed from: com.appsflyer.internal.ah$e */
    public interface C0481e {
        void valueOf(Activity activity);

        void valueOf(Context context);
    }

    static void AFKeystoreWrapper(Context context, C0481e eVar, final Executor executor) {
        AFInAppEventParameterName = eVar;
        C04764 r1 = new Application.ActivityLifecycleCallbacks() {
            boolean AFInAppEventParameterName = true;
            boolean valueOf;

            public final void onActivityDestroyed(Activity activity) {
            }

            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public final void onActivityStarted(Activity activity) {
            }

            public final void onActivityStopped(Activity activity) {
            }

            public final void onActivityResumed(final Activity activity) {
                executor.execute(new Runnable() {
                    public final void run() {
                        if (!C04764.this.valueOf) {
                            try {
                                C0475ah.AFInAppEventParameterName.valueOf(activity);
                            } catch (Exception e) {
                                AFLogger.AFInAppEventParameterName("Listener thrown an exception: ", (Throwable) e);
                            }
                        }
                        C04764.this.AFInAppEventParameterName = false;
                        C04764.this.valueOf = true;
                    }
                });
            }

            public final void onActivityPaused(final Activity activity) {
                executor.execute(new Runnable() {
                    public final void run() {
                        C04764.this.AFInAppEventParameterName = true;
                        final Context applicationContext = activity.getApplicationContext();
                        try {
                            new Timer().schedule(new TimerTask() {
                                public final void run() {
                                    if (C04764.this.valueOf && C04764.this.AFInAppEventParameterName) {
                                        C04764.this.valueOf = false;
                                        try {
                                            C0475ah.AFInAppEventParameterName.valueOf(applicationContext);
                                        } catch (Exception e) {
                                            AFLogger.valueOf("Listener threw exception! ", e);
                                        }
                                    }
                                }
                            }, C0475ah.valueOf);
                        } catch (Throwable th) {
                            AFLogger.valueOf("Background task failed with a throwable: ", th);
                        }
                    }
                });
            }

            public final void onActivityCreated(final Activity activity, Bundle bundle) {
                executor.execute(new Runnable() {
                    public final void run() {
                        C0600f.valueOf();
                        Intent intent = activity.getIntent();
                        if (C0600f.AFKeystoreWrapper(intent) != null && intent != C0600f.valueOf) {
                            C0600f.valueOf = intent;
                        }
                    }
                });
            }
        };
        if (context instanceof Activity) {
            r1.onActivityResumed((Activity) context);
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(r1);
    }
}
