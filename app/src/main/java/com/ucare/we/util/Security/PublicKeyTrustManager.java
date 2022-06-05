package com.ucare.we.util.Security;

import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes2.dex */
public final class PublicKeyTrustManager implements X509TrustManager {
    private RSAPublicKey a;

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        if (x509CertificateArr == null) {
            throw new IllegalArgumentException("checkServerTrusted: X509Certificate array is null");
        }
        if (x509CertificateArr.length <= 0) {
            throw new IllegalArgumentException("checkServerTrusted: X509Certificate is empty");
        }
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
            trustManagerFactory.init((KeyStore) null);
            for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                ((X509TrustManager) trustManager).checkServerTrusted(x509CertificateArr, str);
            }
            RSAPublicKey rSAPublicKey = (RSAPublicKey) x509CertificateArr[0].getPublicKey();
            if (rSAPublicKey == null || this.a == null || Arrays.equals(rSAPublicKey.getEncoded(), this.a.getEncoded())) {
                return;
            }
            throw new CertificateException();
        } catch (Exception e) {
            throw new NotTrustedCertificateException(e);
        }
    }

    /* loaded from: classes2.dex */
    public static class NotTrustedCertificateException extends RuntimeException {
        public NotTrustedCertificateException(Throwable th) {
            super(th);
        }

        public NotTrustedCertificateException() {
        }
    }
}
