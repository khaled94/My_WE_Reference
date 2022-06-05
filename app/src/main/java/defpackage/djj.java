package defpackage;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* renamed from: djj  reason: default package */
/* loaded from: classes2.dex */
public final class djj implements X509TrustManager {
    private static final X509Certificate[] a = new X509Certificate[0];
    private static TrustManager[] b;

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
    }

    public static void a() {
        SSLContext sSLContext;
        NoSuchAlgorithmException e;
        KeyManagementException e2;
        HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() { // from class: djj.1
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                return true;
            }
        });
        if (b == null) {
            b = new TrustManager[]{new djj()};
        }
        try {
            sSLContext = SSLContext.getInstance("TLS");
        } catch (KeyManagementException e3) {
            sSLContext = null;
            e2 = e3;
        } catch (NoSuchAlgorithmException e4) {
            sSLContext = null;
            e = e4;
        }
        try {
            sSLContext.init(null, b, new SecureRandom());
        } catch (KeyManagementException e5) {
            e2 = e5;
            e2.printStackTrace();
            HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory());
        } catch (NoSuchAlgorithmException e6) {
            e = e6;
            e.printStackTrace();
            HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory());
        }
        HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory());
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return a;
    }
}
