package com.appsflyer.internal;

import android.content.Context;
import com.facebook.internal.AttributionIdentifiers;

/* renamed from: com.appsflyer.internal.ae */
final class C0472ae extends C0508aw<String> {
    C0472ae(Context context) {
        super(context, AttributionIdentifiers.ATTRIBUTION_ID_CONTENT_PROVIDER, "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b  */
    /* renamed from: valueOf */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String AFInAppEventType() {
        /*
            r9 = this;
            r0 = 0
            java.lang.String r1 = "aid"
            android.content.Context r2 = r9.AFInAppEventParameterName     // Catch:{ all -> 0x0046 }
            android.content.ContentResolver r3 = r2.getContentResolver()     // Catch:{ all -> 0x0046 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0046 }
            java.lang.String r4 = "content://"
            r2.<init>(r4)     // Catch:{ all -> 0x0046 }
            java.lang.String r4 = r9.AFKeystoreWrapper     // Catch:{ all -> 0x0046 }
            r2.append(r4)     // Catch:{ all -> 0x0046 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0046 }
            android.net.Uri r4 = android.net.Uri.parse(r2)     // Catch:{ all -> 0x0046 }
            java.lang.String[] r5 = new java.lang.String[]{r1}     // Catch:{ all -> 0x0046 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0046 }
            if (r2 == 0) goto L_0x0040
            boolean r3 = r2.moveToFirst()     // Catch:{ all -> 0x003e }
            if (r3 == 0) goto L_0x0040
            int r0 = r2.getColumnIndex(r1)     // Catch:{ all -> 0x003e }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x003e }
            if (r2 == 0) goto L_0x003d
            r2.close()
        L_0x003d:
            return r0
        L_0x003e:
            r0 = move-exception
            goto L_0x0049
        L_0x0040:
            if (r2 == 0) goto L_0x0045
            r2.close()
        L_0x0045:
            return r0
        L_0x0046:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L_0x0049:
            if (r2 == 0) goto L_0x004e
            r2.close()
        L_0x004e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0472ae.AFInAppEventType():java.lang.String");
    }

    public final String AFInAppEventParameterName() {
        new Thread(this.AFInAppEventType).start();
        return (String) super.AFKeystoreWrapper();
    }

    public final /* synthetic */ Object AFKeystoreWrapper() {
        new Thread(this.AFInAppEventType).start();
        return (String) super.AFKeystoreWrapper();
    }
}
