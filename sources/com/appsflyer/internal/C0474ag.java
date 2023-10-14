package com.appsflyer.internal;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.UByte;

/* renamed from: com.appsflyer.internal.ag */
public final class C0474ag {
    private static long AFInAppEventParameterName = 4947486484342868501L;
    private static int valueOf = 0;
    private static int values = 1;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        r1 = e;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String valueOf(java.lang.String r6) {
        /*
            int r0 = values
            int r0 = r0 + 3
            int r1 = r0 % 128
            valueOf = r1
            int r0 = r0 % 2
            r1 = 81
            if (r0 == 0) goto L_0x0011
            r0 = 97
            goto L_0x0013
        L_0x0011:
            r0 = 81
        L_0x0013:
            java.lang.String r2 = "UTF-8"
            r3 = 0
            java.lang.String r4 = "SHA-1"
            r5 = 0
            if (r0 == r1) goto L_0x0037
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r4)     // Catch:{ Exception -> 0x004e }
            r0.reset()     // Catch:{ Exception -> 0x004e }
            byte[] r1 = r6.getBytes(r2)     // Catch:{ Exception -> 0x004e }
            r0.update(r1)     // Catch:{ Exception -> 0x004e }
            byte[] r0 = r0.digest()     // Catch:{ Exception -> 0x004e }
            java.lang.String r0 = values((byte[]) r0)     // Catch:{ Exception -> 0x004e }
            int r6 = r5.length     // Catch:{ Exception -> 0x0035, all -> 0x0033 }
            goto L_0x006b
        L_0x0033:
            r6 = move-exception
            throw r6
        L_0x0035:
            r1 = move-exception
            goto L_0x0050
        L_0x0037:
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r4)     // Catch:{ Exception -> 0x004e }
            r0.reset()     // Catch:{ Exception -> 0x004e }
            byte[] r1 = r6.getBytes(r2)     // Catch:{ Exception -> 0x004e }
            r0.update(r1)     // Catch:{ Exception -> 0x004e }
            byte[] r0 = r0.digest()     // Catch:{ Exception -> 0x004e }
            java.lang.String r0 = values((byte[]) r0)     // Catch:{ Exception -> 0x004e }
            goto L_0x006b
        L_0x004e:
            r1 = move-exception
            r0 = r5
        L_0x0050:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Error turning "
            r2.<init>(r4)
            r4 = 6
            java.lang.String r6 = r6.substring(r3, r4)
            r2.append(r6)
            java.lang.String r6 = ".. to SHA1"
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            com.appsflyer.AFLogger.valueOf(r6, r1)
        L_0x006b:
            int r6 = values
            int r6 = r6 + 47
            int r1 = r6 % 128
            valueOf = r1
            int r6 = r6 % 2
            r1 = 25
            if (r6 == 0) goto L_0x007b
            r3 = 25
        L_0x007b:
            if (r3 == r1) goto L_0x007e
            return r0
        L_0x007e:
            super.hashCode()     // Catch:{ all -> 0x0082 }
            return r0
        L_0x0082:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0474ag.valueOf(java.lang.String):java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        r1 = e;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String AFKeystoreWrapper(java.lang.String r7) {
        /*
            int r0 = valueOf
            int r0 = r0 + 51
            int r1 = r0 % 128
            values = r1
            int r0 = r0 % 2
            r1 = 43
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = 1
            goto L_0x0013
        L_0x0011:
            r0 = 43
        L_0x0013:
            java.lang.String r3 = "UTF-8"
            java.lang.String r4 = "MD5"
            r5 = 0
            r6 = 0
            if (r0 == r1) goto L_0x003c
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r4)     // Catch:{ Exception -> 0x0039 }
            r0.reset()     // Catch:{ Exception -> 0x0039 }
            byte[] r1 = r7.getBytes(r3)     // Catch:{ Exception -> 0x0039 }
            r0.update(r1)     // Catch:{ Exception -> 0x0039 }
            byte[] r0 = r0.digest()     // Catch:{ Exception -> 0x0039 }
            java.lang.String r0 = values((byte[]) r0)     // Catch:{ Exception -> 0x0039 }
            r1 = 85
            int r1 = r1 / r5
            goto L_0x006e
        L_0x0035:
            r7 = move-exception
            throw r7
        L_0x0037:
            r1 = move-exception
            goto L_0x0053
        L_0x0039:
            r1 = move-exception
            r0 = r6
            goto L_0x0053
        L_0x003c:
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r4)     // Catch:{ Exception -> 0x0039 }
            r0.reset()     // Catch:{ Exception -> 0x0039 }
            byte[] r1 = r7.getBytes(r3)     // Catch:{ Exception -> 0x0039 }
            r0.update(r1)     // Catch:{ Exception -> 0x0039 }
            byte[] r0 = r0.digest()     // Catch:{ Exception -> 0x0039 }
            java.lang.String r0 = values((byte[]) r0)     // Catch:{ Exception -> 0x0039 }
            goto L_0x006e
        L_0x0053:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Error turning "
            r3.<init>(r4)
            r4 = 6
            java.lang.String r7 = r7.substring(r5, r4)
            r3.append(r7)
            java.lang.String r7 = ".. to MD5"
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            com.appsflyer.AFLogger.valueOf(r7, r1)
        L_0x006e:
            int r7 = valueOf
            int r7 = r7 + 63
            int r1 = r7 % 128
            values = r1
            int r7 = r7 % 2
            if (r7 != 0) goto L_0x007b
            goto L_0x007c
        L_0x007b:
            r5 = 1
        L_0x007c:
            if (r5 == r2) goto L_0x0082
            int r7 = r6.length     // Catch:{ all -> 0x0080 }
            return r0
        L_0x0080:
            r7 = move-exception
            throw r7
        L_0x0082:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0474ag.AFKeystoreWrapper(java.lang.String):java.lang.String");
    }

    public static String AFInAppEventParameterName(String str) {
        int i = valueOf + 45;
        values = i % 128;
        int i2 = i % 2;
        String str2 = null;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes());
            str2 = AFInAppEventParameterName(instance.digest());
            int i3 = valueOf + 51;
            values = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to SHA-256");
            AFLogger.valueOf(sb.toString(), e);
        }
        return str2;
    }

    private static String AFInAppEventParameterName(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        int length = bArr.length;
        int i = valueOf + 59;
        values = i % 128;
        int i2 = i % 2;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                return sb.toString();
            }
            int i4 = valueOf + 21;
            values = i4 % 128;
            int i5 = i4 % 2;
            sb.append(Integer.toString((bArr[i3] & UByte.MAX_VALUE) + UByte.MIN_VALUE, 16).substring(1));
            i3++;
        }
    }

    private static String values(byte[] bArr) {
        Formatter formatter = new Formatter();
        int length = bArr.length;
        int i = 0;
        while (true) {
            if ((i < length ? 'Z' : 13) != 'Z') {
                String obj = formatter.toString();
                formatter.close();
                int i2 = values + 31;
                valueOf = i2 % 128;
                int i3 = i2 % 2;
                return obj;
            }
            int i4 = valueOf + 95;
            values = i4 % 128;
            if (i4 % 2 == 0) {
                Object[] objArr = new Object[0];
                objArr[1] = Byte.valueOf(bArr[i]);
                formatter.format("%02x", objArr);
                i += 28;
            } else {
                formatter.format("%02x", new Object[]{Byte.valueOf(bArr[i])});
                i++;
            }
        }
    }

    public static String valueOf(String str, String str2) {
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(new SecretKeySpec(str2.getBytes(), "HmacSHA256"));
            String lowerCase = AFInAppEventParameterName(instance.doFinal(str.getBytes())).toLowerCase();
            int i = values + 85;
            valueOf = i % 128;
            if ((i % 2 != 0 ? (char) 16 : 0) == 0) {
                return lowerCase;
            }
            int i2 = 9 / 0;
            return lowerCase;
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            AFLogger.AFInAppEventParameterName(e.getMessage(), e);
            return e.getMessage();
        }
    }

    public static String values(Map<String, Object> map) {
        String str = (String) map.get(AFKeystoreWrapper("詴憦巠䤞┨ᅑಎ퓉쀉밪ꡂ", 60373 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern());
        StringBuilder sb = new StringBuilder();
        sb.append(((String) map.get("appsflyerKey")).substring(0, 7));
        sb.append(((String) map.get("uid")).substring(0, 7));
        sb.append(str.substring(str.length() - 7));
        String valueOf2 = valueOf(sb.toString());
        int i = valueOf + 79;
        values = i % 128;
        int i2 = i % 2;
        return valueOf2;
    }

    public static String AFInAppEventParameterName(Map<String, Object> map) {
        StringBuilder sb = new StringBuilder();
        sb.append((String) map.get("appsflyerKey"));
        sb.append(map.get(AFKeystoreWrapper("詴憦巠䤞┨ᅑಎ퓉쀉밪ꡂ", 60373 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern()));
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append(map.get("uid"));
        String obj2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj2);
        sb3.append(map.get("installDate"));
        String obj3 = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(obj3);
        sb4.append(map.get("counter"));
        String obj4 = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(obj4);
        sb5.append(map.get("iaecounter"));
        String valueOf2 = valueOf(AFKeystoreWrapper(sb5.toString()));
        int i = valueOf + 15;
        values = i % 128;
        int i2 = i % 2;
        return valueOf2;
    }

    public static String AFInAppEventParameterName(String... strArr) {
        int i = values + 29;
        valueOf = i % 128;
        boolean z = i % 2 == 0;
        String join = TextUtils.join("⁣", strArr);
        if (!z) {
            Object obj = null;
            super.hashCode();
        }
        int i2 = values + 29;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        return join;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: char[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.String} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String AFKeystoreWrapper(java.lang.String r6, int r7) {
        /*
            if (r6 == 0) goto L_0x0006
            char[] r6 = r6.toCharArray()
        L_0x0006:
            char[] r6 = (char[]) r6
            java.lang.Object r0 = com.appsflyer.internal.C0593dn.valueOf
            monitor-enter(r0)
            com.appsflyer.internal.C0593dn.AFInAppEventType = r7     // Catch:{ all -> 0x003b }
            int r7 = r6.length     // Catch:{ all -> 0x003b }
            char[] r7 = new char[r7]     // Catch:{ all -> 0x003b }
            r1 = 0
            com.appsflyer.internal.C0593dn.values = r1     // Catch:{ all -> 0x003b }
        L_0x0013:
            int r1 = com.appsflyer.internal.C0593dn.values     // Catch:{ all -> 0x003b }
            int r2 = r6.length     // Catch:{ all -> 0x003b }
            if (r1 >= r2) goto L_0x0034
            int r1 = com.appsflyer.internal.C0593dn.values     // Catch:{ all -> 0x003b }
            int r2 = com.appsflyer.internal.C0593dn.values     // Catch:{ all -> 0x003b }
            char r2 = r6[r2]     // Catch:{ all -> 0x003b }
            int r3 = com.appsflyer.internal.C0593dn.values     // Catch:{ all -> 0x003b }
            int r4 = com.appsflyer.internal.C0593dn.AFInAppEventType     // Catch:{ all -> 0x003b }
            int r3 = r3 * r4
            r2 = r2 ^ r3
            long r2 = (long) r2     // Catch:{ all -> 0x003b }
            long r4 = AFInAppEventParameterName     // Catch:{ all -> 0x003b }
            long r2 = r2 ^ r4
            int r3 = (int) r2     // Catch:{ all -> 0x003b }
            char r2 = (char) r3     // Catch:{ all -> 0x003b }
            r7[r1] = r2     // Catch:{ all -> 0x003b }
            int r1 = com.appsflyer.internal.C0593dn.values     // Catch:{ all -> 0x003b }
            int r1 = r1 + 1
            com.appsflyer.internal.C0593dn.values = r1     // Catch:{ all -> 0x003b }
            goto L_0x0013
        L_0x0034:
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x003b }
            r6.<init>(r7)     // Catch:{ all -> 0x003b }
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return r6
        L_0x003b:
            r6 = move-exception
            monitor-exit(r0)
            goto L_0x003f
        L_0x003e:
            throw r6
        L_0x003f:
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0474ag.AFKeystoreWrapper(java.lang.String, int):java.lang.String");
    }
}
