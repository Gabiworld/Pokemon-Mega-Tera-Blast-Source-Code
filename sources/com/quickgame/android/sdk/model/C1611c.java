package com.quickgame.android.sdk.model;

/* renamed from: com.quickgame.android.sdk.model.c */
public class C1611c {

    /* renamed from: a */
    private long f1611a;

    /* renamed from: b */
    private String f1612b;

    /* renamed from: c */
    private String f1613c;

    /* renamed from: d */
    private String f1614d;

    /* renamed from: e */
    private boolean f1615e;

    /* renamed from: f */
    private long f1616f;

    private C1611c() {
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.quickgame.android.sdk.model.C1611c m2106a(org.json.JSONObject r6) {
        /*
            java.lang.String r0 = "empty"
            r1 = 0
            if (r6 != 0) goto L_0x0006
            return r1
        L_0x0006:
            com.quickgame.android.sdk.model.c r2 = new com.quickgame.android.sdk.model.c
            r2.<init>()
            java.lang.String r3 = "versionNo"
            java.lang.Object r3 = r6.get(r3)     // Catch:{ JSONException -> 0x00c0 }
            if (r3 == 0) goto L_0x00bf
            boolean r4 = r0.equals(r3)     // Catch:{ JSONException -> 0x00c0 }
            if (r4 != 0) goto L_0x00bf
            boolean r4 = r3 instanceof java.lang.String     // Catch:{ JSONException -> 0x00c0 }
            if (r4 != 0) goto L_0x001f
            goto L_0x00bf
        L_0x001f:
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x00bf }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x00bf }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x00bf }
            long r3 = (long) r3     // Catch:{ Exception -> 0x00bf }
            r2.f1611a = r3     // Catch:{ Exception -> 0x00bf }
            java.lang.String r3 = "versionName"
            java.lang.Object r3 = r6.get(r3)     // Catch:{ JSONException -> 0x00c0 }
            if (r3 == 0) goto L_0x00bf
            boolean r4 = r3 instanceof java.lang.String     // Catch:{ JSONException -> 0x00c0 }
            if (r4 == 0) goto L_0x00bf
            boolean r4 = r0.equals(r3)     // Catch:{ JSONException -> 0x00c0 }
            if (r4 == 0) goto L_0x0040
            goto L_0x00bf
        L_0x0040:
            java.lang.String r3 = (java.lang.String) r3     // Catch:{  }
            r2.f1612b = r3     // Catch:{  }
            java.lang.String r3 = "versionUrl"
            java.lang.Object r3 = r6.get(r3)     // Catch:{ JSONException -> 0x00c0 }
            if (r3 == 0) goto L_0x00bf
            boolean r4 = r3 instanceof java.lang.String     // Catch:{ JSONException -> 0x00c0 }
            if (r4 == 0) goto L_0x00bf
            boolean r4 = r0.equals(r3)     // Catch:{ JSONException -> 0x00c0 }
            if (r4 == 0) goto L_0x0057
            goto L_0x00bf
        L_0x0057:
            java.lang.String r3 = (java.lang.String) r3     // Catch:{  }
            r2.f1613c = r3     // Catch:{  }
            java.lang.String r3 = "isMust"
            java.lang.Object r3 = r6.get(r3)     // Catch:{ JSONException -> 0x00c0 }
            if (r3 == 0) goto L_0x00bf
            boolean r4 = r0.equals(r3)     // Catch:{ JSONException -> 0x00c0 }
            if (r4 == 0) goto L_0x006a
            goto L_0x00bf
        L_0x006a:
            java.lang.String r4 = "1"
            boolean r4 = r4.equals(r3)     // Catch:{ JSONException -> 0x00c0 }
            r5 = 1
            if (r4 != 0) goto L_0x0083
            boolean r4 = r3 instanceof java.lang.Boolean     // Catch:{ JSONException -> 0x00c0 }
            if (r4 == 0) goto L_0x0082
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r5)     // Catch:{ JSONException -> 0x00c0 }
            boolean r3 = r3.equals(r4)     // Catch:{ JSONException -> 0x00c0 }
            if (r3 == 0) goto L_0x0082
            goto L_0x0083
        L_0x0082:
            r5 = 0
        L_0x0083:
            r2.f1615e = r5     // Catch:{ JSONException -> 0x00c0 }
            java.lang.String r3 = "updateTips"
            java.lang.String r3 = r6.getString(r3)     // Catch:{ JSONException -> 0x00c0 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x00c0 }
            if (r4 != 0) goto L_0x009b
            boolean r4 = r0.equals(r3)     // Catch:{ JSONException -> 0x00c0 }
            if (r4 == 0) goto L_0x0098
            goto L_0x009b
        L_0x0098:
            r2.f1614d = r3     // Catch:{ JSONException -> 0x00c0 }
            goto L_0x009f
        L_0x009b:
            java.lang.String r3 = ""
            r2.f1614d = r3     // Catch:{ JSONException -> 0x00c0 }
        L_0x009f:
            java.lang.String r3 = "updateTime"
            java.lang.Object r6 = r6.get(r3)     // Catch:{ JSONException -> 0x00c0 }
            if (r6 == 0) goto L_0x00bf
            boolean r0 = r0.equals(r6)     // Catch:{ JSONException -> 0x00c0 }
            if (r0 != 0) goto L_0x00bf
            boolean r0 = r6 instanceof java.lang.String     // Catch:{ JSONException -> 0x00c0 }
            if (r0 != 0) goto L_0x00b2
            goto L_0x00bf
        L_0x00b2:
            java.lang.String r6 = (java.lang.String) r6     // Catch:{  }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{  }
            long r3 = r6.longValue()     // Catch:{  }
            r2.f1616f = r3     // Catch:{  }
            return r2
        L_0x00bf:
            return r1
        L_0x00c0:
            r6 = move-exception
            r6.printStackTrace()
            com.quickgame.android.sdk.utils.log.QGLog.LogException(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.quickgame.android.sdk.model.C1611c.m2106a(org.json.JSONObject):com.quickgame.android.sdk.model.c");
    }

    /* renamed from: b */
    public long mo13088b() {
        return this.f1611a;
    }

    /* renamed from: c */
    public String mo13089c() {
        return this.f1612b;
    }

    /* renamed from: d */
    public boolean mo13090d() {
        return this.f1615e;
    }

    public String toString() {
        return "{versionCode=" + this.f1611a + ", versionName='" + this.f1612b + '\'' + ", downloadUrl='" + this.f1613c + '\'' + ", updateDesc='" + this.f1614d + '\'' + ", isForceUpdate=" + this.f1615e + ", updateTime=" + this.f1616f + '}';
    }

    /* renamed from: a */
    public String mo13087a() {
        return this.f1613c;
    }
}
