package com.appsflyer.internal;

/* renamed from: com.appsflyer.internal.bm */
public final class C0526bm {
    private final int AFKeystoreWrapper;

    public C0526bm(int i) {
        this.AFKeystoreWrapper = i;
    }

    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v6, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0129 A[Catch:{ Exception -> 0x01be, all -> 0x01bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0216  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.appsflyer.internal.C0531br<java.lang.String> AFInAppEventType(com.appsflyer.internal.C0630z r21) throws java.io.IOException {
        /*
            r20 = this;
            r1 = r21
            java.lang.String r2 = "ms"
            java.lang.String r3 = "\n took "
            java.lang.String r4 = "] "
            java.lang.String r5 = "HTTP: ["
            long r6 = java.lang.System.currentTimeMillis()
            r8 = 0
            byte[] r0 = r21.AFKeystoreWrapper()     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            r10.<init>()     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            java.lang.String r11 = r1.AFKeystoreWrapper     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            r10.append(r11)     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            java.lang.String r11 = ":"
            r10.append(r11)     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            java.lang.String r11 = r1.values     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            r10.append(r11)     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            r9.<init>(r10)     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            byte[] r10 = r21.AFKeystoreWrapper()     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            if (r10 == 0) goto L_0x004d
            boolean r11 = r21.AFInAppEventType()     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            if (r11 == 0) goto L_0x003f
            java.lang.String r10 = "<encrypted>"
            goto L_0x0045
        L_0x003f:
            java.lang.String r11 = new java.lang.String     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            r11.<init>(r10)     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            r10 = r11
        L_0x0045:
            java.lang.String r11 = "\n payload: "
            r9.append(r11)     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            r9.append(r10)     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
        L_0x004d:
            java.util.Map<java.lang.String, java.lang.String> r10 = r1.AFInAppEventType     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            java.util.Set r10 = r10.entrySet()     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
        L_0x0057:
            boolean r11 = r10.hasNext()     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            if (r11 == 0) goto L_0x0080
            java.lang.Object r11 = r10.next()     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            java.lang.String r12 = "\n "
            r9.append(r12)     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            java.lang.Object r12 = r11.getKey()     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            r9.append(r12)     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            java.lang.String r12 = ": "
            r9.append(r12)     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            java.lang.Object r11 = r11.getValue()     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            r9.append(r11)     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            goto L_0x0057
        L_0x0080:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            r10.<init>(r5)     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            int r11 = r21.hashCode()     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            r10.append(r11)     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            r10.append(r4)     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            r10.append(r9)     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            java.lang.String r9 = r10.toString()     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            com.appsflyer.AFLogger.AFInAppEventParameterName(r9)     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            java.net.URL r9 = new java.net.URL     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            java.lang.String r10 = r1.values     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            r9.<init>(r10)     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            java.net.URLConnection r9 = r9.openConnection()     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            java.net.HttpURLConnection r9 = (java.net.HttpURLConnection) r9     // Catch:{ Exception -> 0x01ce, all -> 0x01ca }
            java.lang.String r10 = r1.AFKeystoreWrapper     // Catch:{ Exception -> 0x01c5, all -> 0x01c0 }
            r9.setRequestMethod(r10)     // Catch:{ Exception -> 0x01c5, all -> 0x01c0 }
            boolean r10 = r21.values()     // Catch:{ Exception -> 0x01c5, all -> 0x01c0 }
            r11 = 0
            if (r10 == 0) goto L_0x00b5
            r9.setUseCaches(r11)     // Catch:{ Exception -> 0x01c5, all -> 0x01c0 }
        L_0x00b5:
            r10 = r20
            int r12 = r10.AFKeystoreWrapper     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            int r13 = r1.valueOf     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            r14 = -1
            if (r13 == r14) goto L_0x00bf
            r12 = r13
        L_0x00bf:
            r9.setConnectTimeout(r12)     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            r9.setReadTimeout(r12)     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            boolean r12 = r21.AFInAppEventType()     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            if (r12 == 0) goto L_0x00ce
            java.lang.String r12 = "application/octet-stream"
            goto L_0x00d0
        L_0x00ce:
            java.lang.String r12 = "application/json"
        L_0x00d0:
            java.lang.String r13 = "Content-Type"
            r9.addRequestProperty(r13, r12)     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            java.util.Map<java.lang.String, java.lang.String> r12 = r1.AFInAppEventType     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            java.util.Set r12 = r12.entrySet()     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
        L_0x00df:
            boolean r13 = r12.hasNext()     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            if (r13 == 0) goto L_0x00fb
            java.lang.Object r13 = r12.next()     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            java.lang.Object r14 = r13.getKey()     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            java.lang.Object r13 = r13.getValue()     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            r9.setRequestProperty(r14, r13)     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            goto L_0x00df
        L_0x00fb:
            r12 = 1
            if (r0 == 0) goto L_0x012d
            r9.setDoOutput(r12)     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            java.lang.String r13 = "Content-Length"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            r14.<init>()     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            int r15 = r0.length     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            r14.append(r15)     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            r9.setRequestProperty(r13, r14)     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            java.io.BufferedOutputStream r13 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0126 }
            java.io.OutputStream r14 = r9.getOutputStream()     // Catch:{ all -> 0x0126 }
            r13.<init>(r14)     // Catch:{ all -> 0x0126 }
            r13.write(r0)     // Catch:{ all -> 0x0123 }
            r13.close()     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            goto L_0x012d
        L_0x0123:
            r0 = move-exception
            r8 = r13
            goto L_0x0127
        L_0x0126:
            r0 = move-exception
        L_0x0127:
            if (r8 == 0) goto L_0x012c
            r8.close()     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
        L_0x012c:
            throw r0     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
        L_0x012d:
            int r0 = r9.getResponseCode()     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            int r0 = r0 / 100
            r13 = 2
            if (r0 != r13) goto L_0x0137
            r11 = 1
        L_0x0137:
            boolean r0 = r21.AFInAppEventParameterName()     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            java.lang.String r12 = ""
            if (r0 == 0) goto L_0x0145
            java.lang.String r0 = AFInAppEventParameterName(r9, r11)     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            r15 = r0
            goto L_0x0146
        L_0x0145:
            r15 = r12
        L_0x0146:
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            long r12 = r12 - r6
            com.appsflyer.internal.bk r0 = new com.appsflyer.internal.bk     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            r0.<init>(r12)     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            java.lang.String r13 = "response code:"
            r12.<init>(r13)     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            int r13 = r9.getResponseCode()     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            r12.append(r13)     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            java.lang.String r13 = " "
            r12.append(r13)     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            java.lang.String r13 = r9.getResponseMessage()     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            r12.append(r13)     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            java.lang.String r13 = "\n body:"
            r12.append(r13)     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            r12.append(r15)     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            r12.append(r3)     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            long r13 = r0.AFKeystoreWrapper     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            r12.append(r13)     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            r12.append(r2)     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            r13.<init>(r5)     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            int r14 = r21.hashCode()     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            r13.append(r14)     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            r13.append(r4)     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            r13.append(r12)     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            java.lang.String r12 = r13.toString()     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            com.appsflyer.AFLogger.AFInAppEventParameterName(r12)     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            java.util.HashMap r12 = new java.util.HashMap     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            java.util.Map r13 = r9.getHeaderFields()     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            r12.<init>(r13)     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            r12.remove(r8)     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            com.appsflyer.internal.br r8 = new com.appsflyer.internal.br     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            int r16 = r9.getResponseCode()     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            r14 = r8
            r17 = r11
            r18 = r12
            r19 = r0
            r14.<init>(r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x01be, all -> 0x01bc }
            if (r9 == 0) goto L_0x01bb
            r9.disconnect()
        L_0x01bb:
            return r8
        L_0x01bc:
            r0 = move-exception
            goto L_0x01c3
        L_0x01be:
            r0 = move-exception
            goto L_0x01c8
        L_0x01c0:
            r0 = move-exception
            r10 = r20
        L_0x01c3:
            r8 = r9
            goto L_0x0214
        L_0x01c5:
            r0 = move-exception
            r10 = r20
        L_0x01c8:
            r8 = r9
            goto L_0x01d1
        L_0x01ca:
            r0 = move-exception
            r10 = r20
            goto L_0x0214
        L_0x01ce:
            r0 = move-exception
            r10 = r20
        L_0x01d1:
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0213 }
            long r11 = r11 - r6
            com.appsflyer.internal.bk r6 = new com.appsflyer.internal.bk     // Catch:{ all -> 0x0213 }
            r6.<init>(r11)     // Catch:{ all -> 0x0213 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0213 }
            java.lang.String r9 = "error: "
            r7.<init>(r9)     // Catch:{ all -> 0x0213 }
            r7.append(r0)     // Catch:{ all -> 0x0213 }
            r7.append(r3)     // Catch:{ all -> 0x0213 }
            long r11 = r6.AFKeystoreWrapper     // Catch:{ all -> 0x0213 }
            r7.append(r11)     // Catch:{ all -> 0x0213 }
            r7.append(r2)     // Catch:{ all -> 0x0213 }
            java.lang.String r2 = r7.toString()     // Catch:{ all -> 0x0213 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0213 }
            r3.<init>(r5)     // Catch:{ all -> 0x0213 }
            int r1 = r21.hashCode()     // Catch:{ all -> 0x0213 }
            r3.append(r1)     // Catch:{ all -> 0x0213 }
            r3.append(r4)     // Catch:{ all -> 0x0213 }
            r3.append(r2)     // Catch:{ all -> 0x0213 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0213 }
            com.appsflyer.AFLogger.valueOf(r1, r0)     // Catch:{ all -> 0x0213 }
            com.appsflyer.internal.components.network.http.exceptions.HttpException r1 = new com.appsflyer.internal.components.network.http.exceptions.HttpException     // Catch:{ all -> 0x0213 }
            r1.<init>(r0, r6)     // Catch:{ all -> 0x0213 }
            throw r1     // Catch:{ all -> 0x0213 }
        L_0x0213:
            r0 = move-exception
        L_0x0214:
            if (r8 == 0) goto L_0x0219
            r8.disconnect()
        L_0x0219:
            goto L_0x021b
        L_0x021a:
            throw r0
        L_0x021b:
            goto L_0x021a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0526bm.AFInAppEventType(com.appsflyer.internal.z):com.appsflyer.internal.br");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String AFInAppEventParameterName(java.net.HttpURLConnection r4, boolean r5) throws java.io.IOException {
        /*
            r0 = 0
            if (r5 == 0) goto L_0x0008
            java.io.InputStream r4 = r4.getInputStream()     // Catch:{ all -> 0x0048 }
            goto L_0x000c
        L_0x0008:
            java.io.InputStream r4 = r4.getErrorStream()     // Catch:{ all -> 0x0048 }
        L_0x000c:
            if (r4 != 0) goto L_0x0011
            java.lang.String r4 = ""
            return r4
        L_0x0011:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0048 }
            r5.<init>()     // Catch:{ all -> 0x0048 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ all -> 0x0048 }
            r1.<init>(r4)     // Catch:{ all -> 0x0048 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x0044 }
            r4.<init>(r1)     // Catch:{ all -> 0x0044 }
            r0 = 1
        L_0x0021:
            java.lang.String r2 = r4.readLine()     // Catch:{ all -> 0x003e }
            if (r2 == 0) goto L_0x0033
            if (r0 != 0) goto L_0x002e
            r0 = 10
            r5.append(r0)     // Catch:{ all -> 0x003e }
        L_0x002e:
            r5.append(r2)     // Catch:{ all -> 0x003e }
            r0 = 0
            goto L_0x0021
        L_0x0033:
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x003e }
            r1.close()
            r4.close()
            return r5
        L_0x003e:
            r5 = move-exception
            r0 = r1
            r3 = r5
            r5 = r4
            r4 = r3
            goto L_0x004a
        L_0x0044:
            r4 = move-exception
            r5 = r0
            r0 = r1
            goto L_0x004a
        L_0x0048:
            r4 = move-exception
            r5 = r0
        L_0x004a:
            if (r0 == 0) goto L_0x004f
            r0.close()
        L_0x004f:
            if (r5 == 0) goto L_0x0054
            r5.close()
        L_0x0054:
            goto L_0x0056
        L_0x0055:
            throw r4
        L_0x0056:
            goto L_0x0055
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0526bm.AFInAppEventParameterName(java.net.HttpURLConnection, boolean):java.lang.String");
    }
}
