package com.p010qg.easyfloat.p018h;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.p010qg.easyfloat.p012c.C0912a;
import com.p010qg.easyfloat.p012c.C0918b;
import com.p010qg.easyfloat.p013d.C0923a;
import com.p010qg.easyfloat.p014e.C0924a;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo13301d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0002J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0002J\b\u0010\u0012\u001a\u0004\u0018\u00010\rJ\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006J#\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo13302d2 = {"Lcom/qg/easyfloat/utils/LifecycleUtils;", "", "()V", "activityCount", "", "application", "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", "setApplication", "(Landroid/app/Application;)V", "mTopActivity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "checkHide", "", "activity", "checkShow", "getTopActivity", "isForeground", "", "setLifecycleCallbacks", "setVisible", "isShow", "tag", "", "(ZLjava/lang/String;)Lkotlin/Unit;", "easyfloat_release"}, mo13303k = 1, mo13304mv = {1, 5, 1}, mo13306xi = 48)
/* renamed from: com.qg.easyfloat.h.d */
public final class C0938d {

    /* renamed from: a */
    public static final C0938d f196a = new C0938d();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static int f197b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static WeakReference<Activity> f198c;

    /* renamed from: com.qg.easyfloat.h.d$a */
    public static final class C0939a implements Application.ActivityLifecycleCallbacks {
        C0939a() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C0940e.f199a.mo11502a("===onActivityCreated");
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
            if (activity != null) {
                WeakReference d = C0938d.f198c;
                if (d != null) {
                    d.clear();
                }
                C0938d dVar = C0938d.f196a;
                C0938d.f198c = new WeakReference(activity);
                C0938d.f196a.m201b(activity);
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (activity != null) {
                C0938d dVar = C0938d.f196a;
                C0938d.f197b = C0938d.f197b + 1;
            }
            C0940e.f199a.mo11502a(Intrinsics.stringPlus("===onActivityStarted ", Integer.valueOf(C0938d.f197b)));
        }

        public void onActivityStopped(Activity activity) {
            if (activity != null) {
                C0938d dVar = C0938d.f196a;
                C0938d.f197b = C0938d.f197b - 1;
                C0938d.f196a.m198a(activity);
            }
        }
    }

    private C0938d() {
    }

    /* renamed from: a */
    public final void mo11492a(Application application) {
        Intrinsics.checkNotNullParameter(application, "<set-?>");
    }

    /* renamed from: b */
    public final void mo11493b(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        mo11492a(application);
        application.registerActivityLifecycleCallbacks(new C0939a());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m201b(Activity activity) {
        for (Map.Entry next : C0918b.f108a.mo11397a().entrySet()) {
            String str = (String) next.getKey();
            C0923a b = ((C0912a) next.getValue()).mo11380b();
            if (b.mo11449w() != C0924a.CURRENT_ACTIVITY) {
                if (b.mo11449w() == C0924a.BACKGROUND) {
                    f196a.m196a(false, str);
                } else if (b.mo11445t()) {
                    f196a.m196a(!b.mo11429f().contains(activity.getComponentName().getClassName()), str);
                }
            }
        }
    }

    /* renamed from: a */
    public final Activity mo11491a() {
        WeakReference<Activity> weakReference = f198c;
        if (weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
        r5 = r5.getDecorView();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m198a(android.app.Activity r8) {
        /*
            r7 = this;
            boolean r0 = r8.isFinishing()
            if (r0 != 0) goto L_0x000d
            boolean r0 = r7.mo11494b()
            if (r0 == 0) goto L_0x000d
            return
        L_0x000d:
            com.qg.easyfloat.c.b r0 = com.p010qg.easyfloat.p012c.C0918b.f108a
            java.util.concurrent.ConcurrentHashMap r0 = r0.mo11397a()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x008d
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            com.qg.easyfloat.c.a r1 = (com.p010qg.easyfloat.p012c.C0912a) r1
            boolean r3 = r8.isFinishing()
            r4 = 1
            if (r3 == 0) goto L_0x0061
            android.view.WindowManager$LayoutParams r3 = r1.mo11383e()
            android.os.IBinder r3 = r3.token
            if (r3 != 0) goto L_0x0043
            goto L_0x0061
        L_0x0043:
            android.view.Window r5 = r8.getWindow()
            if (r5 != 0) goto L_0x004a
            goto L_0x0050
        L_0x004a:
            android.view.View r5 = r5.getDecorView()
            if (r5 != 0) goto L_0x0052
        L_0x0050:
            r5 = 0
            goto L_0x0056
        L_0x0052:
            android.os.IBinder r5 = r5.getWindowToken()
        L_0x0056:
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r5)
            if (r3 == 0) goto L_0x0061
            com.qg.easyfloat.c.b r3 = com.p010qg.easyfloat.p012c.C0918b.f108a
            r3.mo11398a((java.lang.String) r2, (boolean) r4)
        L_0x0061:
            com.qg.easyfloat.d.a r3 = r1.mo11380b()
            com.qg.easyfloat.h.d r5 = f196a
            boolean r6 = r5.mo11494b()
            if (r6 != 0) goto L_0x001b
            com.qg.easyfloat.d.a r1 = r1.mo11380b()
            com.qg.easyfloat.e.a r1 = r1.mo11449w()
            com.qg.easyfloat.e.a r6 = com.p010qg.easyfloat.p014e.C0924a.CURRENT_ACTIVITY
            if (r1 == r6) goto L_0x001b
            com.qg.easyfloat.e.a r1 = r3.mo11449w()
            com.qg.easyfloat.e.a r6 = com.p010qg.easyfloat.p014e.C0924a.FOREGROUND
            if (r1 == r6) goto L_0x0088
            boolean r1 = r3.mo11445t()
            if (r1 == 0) goto L_0x0088
            goto L_0x0089
        L_0x0088:
            r4 = 0
        L_0x0089:
            r5.m196a((boolean) r4, (java.lang.String) r2)
            goto L_0x001b
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p010qg.easyfloat.p018h.C0938d.m198a(android.app.Activity):void");
    }

    /* renamed from: a */
    private final Unit m196a(boolean z, String str) {
        return C0918b.m84a(C0918b.f108a, z, str, false, 4, (Object) null);
    }

    /* renamed from: b */
    public final boolean mo11494b() {
        return f197b > 0;
    }
}
