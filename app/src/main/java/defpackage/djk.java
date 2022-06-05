package defpackage;

import defpackage.eaf;
import defpackage.eaw;
import defpackage.edr;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* renamed from: djk  reason: default package */
/* loaded from: classes2.dex */
public final class djk extends bh {
    public eax a;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(String str, SSLSession sSLSession) {
        return true;
    }

    public djk() {
        this(b());
    }

    private djk(eaw eawVar) {
        if (eawVar == null) {
            throw new NullPointerException("Client must not be null.");
        }
        this.a = new eax(eawVar);
    }

    public static eaw a() {
        try {
            edr edrVar = new edr();
            int i = edr.a.d;
            if (i == 0) {
                throw new NullPointerException("level == null. Use Level.NONE instead.");
            }
            edrVar.a = i;
            eaw.a aVar = new eaw.a();
            eaf a = new eaf.a().a("api-my.te.eg", "sha256/rtATQgun+cVRis33sK7cS8MobUbclgKm4DH2CrNscd4=").a("billing.te.eg", "sha256/rtATQgun+cVRis33sK7cS8MobUbclgKm4DH2CrNscd4=").a();
            eaw.a b = aVar.a(60L, TimeUnit.MINUTES).c(60L, TimeUnit.MINUTES).b(60L, TimeUnit.MINUTES);
            b.e.add(edrVar);
            b.p = a;
            return b.d();
        } catch (Exception unused) {
            return null;
        }
    }

    public static eaw b() {
        try {
            TrustManager[] trustManagerArr = {new X509TrustManager() { // from class: djk.1
                @Override // javax.net.ssl.X509TrustManager
                public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
                }

                @Override // javax.net.ssl.X509TrustManager
                public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
                }

                @Override // javax.net.ssl.X509TrustManager
                public final X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }
            }};
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            eaw.a aVar = new eaw.a();
            X509TrustManager x509TrustManager = (X509TrustManager) trustManagerArr[0];
            if (socketFactory == null) {
                throw new NullPointerException("sslSocketFactory == null");
            }
            if (x509TrustManager == null) {
                throw new NullPointerException("trustManager == null");
            }
            aVar.m = socketFactory;
            aVar.n = edk.e().a(x509TrustManager);
            aVar.a($$Lambda$djk$T9jOiujFHvpLQKCqh8Of3vukCEE.INSTANCE);
            return aVar.d();
        } catch (Exception e) {
            e.getMessage();
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.bh
    public final HttpURLConnection a(URL url) throws IOException {
        return this.a.a(url);
    }
}
