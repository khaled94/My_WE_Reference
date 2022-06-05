package defpackage;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;

/* renamed from: edh  reason: default package */
/* loaded from: classes2.dex */
public final class edh extends edk {
    private edh() {
    }

    private static Provider b() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    @Override // defpackage.edk
    public final X509TrustManager a(SSLSocketFactory sSLSocketFactory) {
        if (!Conscrypt.isConscrypt(sSLSocketFactory)) {
            return super.a(sSLSocketFactory);
        }
        try {
            Object a = a(sSLSocketFactory, Object.class, "sslParameters");
            if (a == null) {
                return null;
            }
            return (X509TrustManager) a(a, X509TrustManager.class, "x509TrustManager");
        } catch (Exception e) {
            throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on Conscrypt", e);
        }
    }

    @Override // defpackage.edk
    public final void a(SSLSocket sSLSocket, String str, List<eay> list) throws IOException {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) edk.a(list).toArray(new String[0]));
            return;
        }
        super.a(sSLSocket, str, list);
    }

    @Override // defpackage.edk
    public final String a(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.a(sSLSocket);
    }

    @Override // defpackage.edk
    public final SSLContext c() {
        try {
            return SSLContext.getInstance("TLSv1.3", b());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", b());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }

    public static edh a() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (Conscrypt.isAvailable()) {
                return new edh();
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @Override // defpackage.edk
    public final void b(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }
}
