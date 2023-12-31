package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: com.appsflyer.internal.dc */
public final class C0578dc {
    public final FutureTask<List<String>> AFInAppEventParameterName;

    public C0578dc(final Context context) {
        this.AFInAppEventParameterName = new FutureTask<>(new Callable<List<String>>() {
            /* access modifiers changed from: private */
            /* renamed from: AFInAppEventType */
            public List<String> call() {
                List<ResolveInfo> queryIntentContentProviders;
                ArrayList arrayList = new ArrayList();
                try {
                    if (Build.VERSION.SDK_INT >= 19 && (queryIntentContentProviders = context.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.oem.PRELOAD_PROVIDER"), 0)) != null) {
                        if (!queryIntentContentProviders.isEmpty()) {
                            for (ResolveInfo resolveInfo : queryIntentContentProviders) {
                                String str = resolveInfo.providerInfo.authority;
                                StringBuilder sb = new StringBuilder("content://");
                                sb.append(str);
                                sb.append("/preload_id");
                                Cursor query = context.getContentResolver().query(Uri.parse(sb.toString()), (String[]) null, (String) null, (String[]) null, (String) null);
                                if (query != null) {
                                    query.moveToFirst();
                                    arrayList.add(query.getString(query.getColumnIndex("preload_id")));
                                    query.close();
                                }
                            }
                            return arrayList;
                        }
                    }
                    return null;
                } catch (Exception e) {
                    AFLogger.valueOf(e.getMessage(), e);
                }
            }
        });
    }

    public final List<String> values() {
        try {
            if (AFKeystoreWrapper()) {
                return this.AFInAppEventParameterName.get();
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        return null;
    }

    public final boolean AFKeystoreWrapper() {
        return this.AFInAppEventParameterName.isDone();
    }
}
