package com.quickgame.android.sdk.p039h;

import android.util.Log;
import com.quickgame.android.sdk.C1128a;
import com.quickgame.android.sdk.bean.QGUserData;
import com.quickgame.android.sdk.model.C1609b;
import com.quickgame.android.sdk.p026b.C1268a;
import com.quickgame.android.sdk.utils.log.QGLog;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.quickgame.android.sdk.h.i */
public class C1544i {
    /* renamed from: a */
    public static boolean m1891a(String str, int i) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            QGLog.m2386d("QGUserDataParser", "content " + jSONObject.toString());
            if (jSONObject.has("authToken")) {
                C1538f.m1861l().mo12840c(jSONObject.getString("authToken"));
            }
            if (jSONObject.has("tips")) {
                C1538f.m1861l().mo12842d(jSONObject.getString("tips"));
            }
            if (jSONObject.has("userData")) {
                C1538f.m1861l().mo12829a(QGUserData.generateFromJson(jSONObject.getJSONObject("userData")));
                if (jSONObject.getJSONObject("userData").optJSONObject("bindInfo") != null) {
                    C1538f.m1861l().mo12828a(m1890a(jSONObject.getJSONObject("userData").getJSONObject("bindInfo")));
                }
            }
            C1609b.m2099d().mo13083a(i);
            if (!C1538f.m1861l().mo12847i().isNewUser()) {
                return true;
            }
            String uid = C1538f.m1861l().mo12847i().getUid();
            String userName = C1538f.m1861l().mo12847i().getUserName();
            String openType = C1538f.m1861l().mo12847i().getOpenType();
            Log.d("QGUserDataParser", "new User:" + uid + " " + openType);
            C1268a.m1316b(uid, userName, openType);
            if (C1128a.m798r().mo11997k() == null) {
                return true;
            }
            C1128a.m798r().mo11997k().succeed(uid, userName);
            return true;
        } catch (JSONException e) {
            Log.e("QGUserDataParser", e.toString());
            QGLog.LogException(e);
            e.printStackTrace();
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x01f5 A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01f7 A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0208 A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x020a A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x021b A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x021d A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x022e A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0230 A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0243 A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0244 A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082 A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0091 A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a0 A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00af A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00be A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cd A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00db A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ea A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f9 A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0108 A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0119 A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x012a A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x013b A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x014c A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0162 A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0164 A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0177 A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0179 A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x018a A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x018c A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x019d A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x019f A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01b0 A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01b2 A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01c3 A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01c5 A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01cf A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01d1 A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01e2 A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01e4 A[Catch:{ Exception -> 0x0250 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.quickgame.android.sdk.bean.QGUserBindInfo m1890a(org.json.JSONObject r22) {
        /*
            r1 = r22
            java.lang.String r2 = "bdMetasens"
            java.lang.String r3 = "bdTapTap"
            java.lang.String r4 = "bdPPID"
            java.lang.String r5 = "bd94hi"
            java.lang.String r6 = "bindPlay"
            java.lang.String r7 = "bindVK"
            java.lang.String r8 = "bindLine"
            java.lang.String r9 = "bindTwitter"
            java.lang.String r10 = "bindGameCenter"
            java.lang.String r11 = "bindNaver"
            java.lang.String r12 = "bindGoogle"
            java.lang.String r13 = "signApple"
            java.lang.String r14 = "bindEmail"
            java.lang.String r15 = "bindFB"
            r16 = r2
            java.lang.String r2 = "otherAccountName"
            r17 = r2
            java.lang.String r2 = "isBind"
            r18 = r2
            java.lang.String r2 = "{\"isBind\":0,\"otherAccountName\":\"\"}"
            if (r1 != 0) goto L_0x0032
            com.quickgame.android.sdk.bean.QGUserBindInfo r0 = new com.quickgame.android.sdk.bean.QGUserBindInfo     // Catch:{ Exception -> 0x0250 }
            r0.<init>()     // Catch:{ Exception -> 0x0250 }
            return r0
        L_0x0032:
            com.quickgame.android.sdk.h.f r0 = com.quickgame.android.sdk.p039h.C1538f.m1861l()     // Catch:{ Exception -> 0x0056 }
            r19 = r3
            com.qg.gson.Gson r3 = new com.qg.gson.Gson     // Catch:{ Exception -> 0x0054 }
            r3.<init>()     // Catch:{ Exception -> 0x0054 }
            r20 = r4
            java.lang.String r4 = r22.toString()     // Catch:{ Exception -> 0x0052 }
            r21 = r5
            java.lang.Class<com.quickgame.android.sdk.innerbean.BindInfo> r5 = com.quickgame.android.sdk.innerbean.BindInfo.class
            java.lang.Object r3 = r3.mo11564a((java.lang.String) r4, r5)     // Catch:{ Exception -> 0x0050 }
            com.quickgame.android.sdk.innerbean.BindInfo r3 = (com.quickgame.android.sdk.innerbean.BindInfo) r3     // Catch:{ Exception -> 0x0050 }
            r0.f1470g = r3     // Catch:{ Exception -> 0x0050 }
            goto L_0x0077
        L_0x0050:
            r0 = move-exception
            goto L_0x005d
        L_0x0052:
            r0 = move-exception
            goto L_0x005b
        L_0x0054:
            r0 = move-exception
            goto L_0x0059
        L_0x0056:
            r0 = move-exception
            r19 = r3
        L_0x0059:
            r20 = r4
        L_0x005b:
            r21 = r5
        L_0x005d:
            java.lang.String r3 = "QGUserDataParser"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0250 }
            r4.<init>()     // Catch:{ Exception -> 0x0250 }
            java.lang.String r5 = "BindInfo Exception "
            r4.append(r5)     // Catch:{ Exception -> 0x0250 }
            java.lang.String r0 = r0.getLocalizedMessage()     // Catch:{ Exception -> 0x0250 }
            r4.append(r0)     // Catch:{ Exception -> 0x0250 }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x0250 }
            android.util.Log.d(r3, r0)     // Catch:{ Exception -> 0x0250 }
        L_0x0077:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x0250 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0250 }
            boolean r3 = r1.has(r15)     // Catch:{ Exception -> 0x0250 }
            if (r3 == 0) goto L_0x0086
            org.json.JSONObject r0 = r1.getJSONObject(r15)     // Catch:{ Exception -> 0x0250 }
        L_0x0086:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0250 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0250 }
            boolean r4 = r1.has(r14)     // Catch:{ Exception -> 0x0250 }
            if (r4 == 0) goto L_0x0095
            org.json.JSONObject r3 = r1.getJSONObject(r14)     // Catch:{ Exception -> 0x0250 }
        L_0x0095:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0250 }
            r4.<init>(r2)     // Catch:{ Exception -> 0x0250 }
            boolean r5 = r1.has(r13)     // Catch:{ Exception -> 0x0250 }
            if (r5 == 0) goto L_0x00a4
            org.json.JSONObject r4 = r1.getJSONObject(r13)     // Catch:{ Exception -> 0x0250 }
        L_0x00a4:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x0250 }
            r5.<init>(r2)     // Catch:{ Exception -> 0x0250 }
            boolean r13 = r1.has(r12)     // Catch:{ Exception -> 0x0250 }
            if (r13 == 0) goto L_0x00b3
            org.json.JSONObject r5 = r1.getJSONObject(r12)     // Catch:{ Exception -> 0x0250 }
        L_0x00b3:
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ Exception -> 0x0250 }
            r12.<init>(r2)     // Catch:{ Exception -> 0x0250 }
            boolean r13 = r1.has(r11)     // Catch:{ Exception -> 0x0250 }
            if (r13 == 0) goto L_0x00c2
            org.json.JSONObject r12 = r1.getJSONObject(r11)     // Catch:{ Exception -> 0x0250 }
        L_0x00c2:
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ Exception -> 0x0250 }
            r11.<init>(r2)     // Catch:{ Exception -> 0x0250 }
            boolean r11 = r1.has(r10)     // Catch:{ Exception -> 0x0250 }
            if (r11 == 0) goto L_0x00d0
            r1.getJSONObject(r10)     // Catch:{ Exception -> 0x0250 }
        L_0x00d0:
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ Exception -> 0x0250 }
            r10.<init>(r2)     // Catch:{ Exception -> 0x0250 }
            boolean r11 = r1.has(r9)     // Catch:{ Exception -> 0x0250 }
            if (r11 == 0) goto L_0x00df
            org.json.JSONObject r10 = r1.getJSONObject(r9)     // Catch:{ Exception -> 0x0250 }
        L_0x00df:
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x0250 }
            r9.<init>(r2)     // Catch:{ Exception -> 0x0250 }
            boolean r11 = r1.has(r8)     // Catch:{ Exception -> 0x0250 }
            if (r11 == 0) goto L_0x00ee
            org.json.JSONObject r9 = r1.getJSONObject(r8)     // Catch:{ Exception -> 0x0250 }
        L_0x00ee:
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x0250 }
            r8.<init>(r2)     // Catch:{ Exception -> 0x0250 }
            boolean r11 = r1.has(r7)     // Catch:{ Exception -> 0x0250 }
            if (r11 == 0) goto L_0x00fd
            org.json.JSONObject r8 = r1.getJSONObject(r7)     // Catch:{ Exception -> 0x0250 }
        L_0x00fd:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x0250 }
            r7.<init>(r2)     // Catch:{ Exception -> 0x0250 }
            boolean r11 = r1.has(r6)     // Catch:{ Exception -> 0x0250 }
            if (r11 == 0) goto L_0x010c
            org.json.JSONObject r7 = r1.getJSONObject(r6)     // Catch:{ Exception -> 0x0250 }
        L_0x010c:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x0250 }
            r6.<init>(r2)     // Catch:{ Exception -> 0x0250 }
            r11 = r21
            boolean r13 = r1.has(r11)     // Catch:{ Exception -> 0x0250 }
            if (r13 == 0) goto L_0x011d
            org.json.JSONObject r6 = r1.getJSONObject(r11)     // Catch:{ Exception -> 0x0250 }
        L_0x011d:
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ Exception -> 0x0250 }
            r11.<init>(r2)     // Catch:{ Exception -> 0x0250 }
            r13 = r20
            boolean r14 = r1.has(r13)     // Catch:{ Exception -> 0x0250 }
            if (r14 == 0) goto L_0x012e
            org.json.JSONObject r11 = r1.getJSONObject(r13)     // Catch:{ Exception -> 0x0250 }
        L_0x012e:
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ Exception -> 0x0250 }
            r13.<init>(r2)     // Catch:{ Exception -> 0x0250 }
            r14 = r19
            boolean r15 = r1.has(r14)     // Catch:{ Exception -> 0x0250 }
            if (r15 == 0) goto L_0x013f
            org.json.JSONObject r13 = r1.getJSONObject(r14)     // Catch:{ Exception -> 0x0250 }
        L_0x013f:
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ Exception -> 0x0250 }
            r14.<init>(r2)     // Catch:{ Exception -> 0x0250 }
            r2 = r16
            boolean r15 = r1.has(r2)     // Catch:{ Exception -> 0x0250 }
            if (r15 == 0) goto L_0x0150
            org.json.JSONObject r14 = r1.getJSONObject(r2)     // Catch:{ Exception -> 0x0250 }
        L_0x0150:
            com.quickgame.android.sdk.bean.QGUserBindInfo r1 = new com.quickgame.android.sdk.bean.QGUserBindInfo     // Catch:{ Exception -> 0x0250 }
            r1.<init>()     // Catch:{ Exception -> 0x0250 }
            r2 = r18
            int r15 = r0.getInt(r2)     // Catch:{ Exception -> 0x0250 }
            r16 = 0
            r18 = r14
            r14 = 1
            if (r15 != r14) goto L_0x0164
            r15 = 1
            goto L_0x0165
        L_0x0164:
            r15 = 0
        L_0x0165:
            r1.setBindFB(r15)     // Catch:{ Exception -> 0x0250 }
            r15 = r17
            java.lang.String r0 = r0.getString(r15)     // Catch:{ Exception -> 0x0250 }
            r1.setFbAccountName(r0)     // Catch:{ Exception -> 0x0250 }
            int r0 = r4.getInt(r2)     // Catch:{ Exception -> 0x0250 }
            if (r0 != r14) goto L_0x0179
            r0 = 1
            goto L_0x017a
        L_0x0179:
            r0 = 0
        L_0x017a:
            r1.setBindApple(r0)     // Catch:{ Exception -> 0x0250 }
            java.lang.String r0 = r4.getString(r15)     // Catch:{ Exception -> 0x0250 }
            r1.setAppleAccountName(r0)     // Catch:{ Exception -> 0x0250 }
            int r0 = r3.getInt(r2)     // Catch:{ Exception -> 0x0250 }
            if (r0 != r14) goto L_0x018c
            r0 = 1
            goto L_0x018d
        L_0x018c:
            r0 = 0
        L_0x018d:
            r1.setBindEmail(r0)     // Catch:{ Exception -> 0x0250 }
            java.lang.String r0 = r3.getString(r15)     // Catch:{ Exception -> 0x0250 }
            r1.setEmailAccountName(r0)     // Catch:{ Exception -> 0x0250 }
            int r0 = r5.getInt(r2)     // Catch:{ Exception -> 0x0250 }
            if (r0 != r14) goto L_0x019f
            r0 = 1
            goto L_0x01a0
        L_0x019f:
            r0 = 0
        L_0x01a0:
            r1.setBindGoogle(r0)     // Catch:{ Exception -> 0x0250 }
            java.lang.String r0 = r5.getString(r15)     // Catch:{ Exception -> 0x0250 }
            r1.setGoogleAccountName(r0)     // Catch:{ Exception -> 0x0250 }
            int r0 = r7.getInt(r2)     // Catch:{ Exception -> 0x0250 }
            if (r0 != r14) goto L_0x01b2
            r0 = 1
            goto L_0x01b3
        L_0x01b2:
            r0 = 0
        L_0x01b3:
            r1.setBindPlay(r0)     // Catch:{ Exception -> 0x0250 }
            java.lang.String r0 = r7.getString(r15)     // Catch:{ Exception -> 0x0250 }
            r1.setPlayAccountName(r0)     // Catch:{ Exception -> 0x0250 }
            int r0 = r6.getInt(r2)     // Catch:{ Exception -> 0x0250 }
            if (r0 != r14) goto L_0x01c5
            r0 = 1
            goto L_0x01c6
        L_0x01c5:
            r0 = 0
        L_0x01c6:
            r1.setBind94Hi(r0)     // Catch:{ Exception -> 0x0250 }
            int r0 = r12.getInt(r2)     // Catch:{ Exception -> 0x0250 }
            if (r0 != r14) goto L_0x01d1
            r0 = 1
            goto L_0x01d2
        L_0x01d1:
            r0 = 0
        L_0x01d2:
            r1.setBindNaver(r0)     // Catch:{ Exception -> 0x0250 }
            java.lang.String r0 = r12.getString(r15)     // Catch:{ Exception -> 0x0250 }
            r1.setNaverAccountName(r0)     // Catch:{ Exception -> 0x0250 }
            int r0 = r10.getInt(r2)     // Catch:{ Exception -> 0x0250 }
            if (r0 != r14) goto L_0x01e4
            r0 = 1
            goto L_0x01e5
        L_0x01e4:
            r0 = 0
        L_0x01e5:
            r1.setBindTwitter(r0)     // Catch:{ Exception -> 0x0250 }
            java.lang.String r0 = r10.getString(r15)     // Catch:{ Exception -> 0x0250 }
            r1.setTwitterAccountName(r0)     // Catch:{ Exception -> 0x0250 }
            int r0 = r9.getInt(r2)     // Catch:{ Exception -> 0x0250 }
            if (r0 != r14) goto L_0x01f7
            r0 = 1
            goto L_0x01f8
        L_0x01f7:
            r0 = 0
        L_0x01f8:
            r1.setBindLine(r0)     // Catch:{ Exception -> 0x0250 }
            java.lang.String r0 = r9.getString(r15)     // Catch:{ Exception -> 0x0250 }
            r1.setLineAccountName(r0)     // Catch:{ Exception -> 0x0250 }
            int r0 = r8.getInt(r2)     // Catch:{ Exception -> 0x0250 }
            if (r0 != r14) goto L_0x020a
            r0 = 1
            goto L_0x020b
        L_0x020a:
            r0 = 0
        L_0x020b:
            r1.setBindVk(r0)     // Catch:{ Exception -> 0x0250 }
            java.lang.String r0 = r8.getString(r15)     // Catch:{ Exception -> 0x0250 }
            r1.setVkAccountName(r0)     // Catch:{ Exception -> 0x0250 }
            int r0 = r11.getInt(r2)     // Catch:{ Exception -> 0x0250 }
            if (r0 != r14) goto L_0x021d
            r0 = 1
            goto L_0x021e
        L_0x021d:
            r0 = 0
        L_0x021e:
            r1.setBindPPID(r0)     // Catch:{ Exception -> 0x0250 }
            java.lang.String r0 = r11.getString(r15)     // Catch:{ Exception -> 0x0250 }
            r1.setPpidAccountName(r0)     // Catch:{ Exception -> 0x0250 }
            int r0 = r13.getInt(r2)     // Catch:{ Exception -> 0x0250 }
            if (r0 != r14) goto L_0x0230
            r0 = 1
            goto L_0x0231
        L_0x0230:
            r0 = 0
        L_0x0231:
            r1.setBindTapTap(r0)     // Catch:{ Exception -> 0x0250 }
            java.lang.String r0 = r13.getString(r15)     // Catch:{ Exception -> 0x0250 }
            r1.setTaptapAccountName(r0)     // Catch:{ Exception -> 0x0250 }
            r0 = r18
            int r2 = r0.getInt(r2)     // Catch:{ Exception -> 0x0250 }
            if (r2 != r14) goto L_0x0244
            goto L_0x0245
        L_0x0244:
            r14 = 0
        L_0x0245:
            r1.setBindMetaSens(r14)     // Catch:{ Exception -> 0x0250 }
            java.lang.String r0 = r0.getString(r15)     // Catch:{ Exception -> 0x0250 }
            r1.setMetaSensAccountName(r0)     // Catch:{ Exception -> 0x0250 }
            return r1
        L_0x0250:
            com.quickgame.android.sdk.bean.QGUserBindInfo r0 = new com.quickgame.android.sdk.bean.QGUserBindInfo
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.quickgame.android.sdk.p039h.C1544i.m1890a(org.json.JSONObject):com.quickgame.android.sdk.bean.QGUserBindInfo");
    }
}
