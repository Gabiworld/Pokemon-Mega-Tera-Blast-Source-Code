package com.quickgame.android.sdk.p036f;

import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.quickgame.android.sdk.f.e */
class C1434e {

    /* renamed from: com.quickgame.android.sdk.f.e$a */
    class C1435a implements HostnameVerifier {
        C1435a() {
        }

        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    /* renamed from: com.quickgame.android.sdk.f.e$b */
    static class C1436b implements TrustManager, X509TrustManager {
        C1436b() {
        }

        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }
    }

    /* renamed from: a */
    static void m1708a() throws Exception {
        C1435a aVar = new C1435a();
        m1709b();
        HttpsURLConnection.setDefaultHostnameVerifier(aVar);
    }

    /* renamed from: b */
    private static void m1709b() throws Exception {
        TrustManager[] trustManagerArr = {new C1436b()};
        SSLContext instance = SSLContext.getInstance("SSL");
        instance.init((KeyManager[]) null, trustManagerArr, (SecureRandom) null);
        HttpsURLConnection.setDefaultSSLSocketFactory(instance.getSocketFactory());
    }
}
