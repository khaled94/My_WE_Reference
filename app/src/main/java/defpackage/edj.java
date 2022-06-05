package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: edj  reason: default package */
/* loaded from: classes2.dex */
final class edj extends edk {
    final Method a;
    final Method b;

    private edj(Method method, Method method2) {
        this.a = method;
        this.b = method2;
    }

    @Override // defpackage.edk
    public final void a(SSLSocket sSLSocket, String str, List<eay> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> a = a(list);
            this.a.invoke(sSLParameters, a.toArray(new String[a.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to set SSL parameters", e);
        }
    }

    @Override // defpackage.edk
    public final String a(SSLSocket sSLSocket) {
        try {
            String str = (String) this.b.invoke(sSLSocket, new Object[0]);
            if (str != null) {
                if (!str.equals("")) {
                    return str;
                }
            }
            return null;
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            if (!(e2.getCause() instanceof UnsupportedOperationException)) {
                throw new AssertionError("failed to get ALPN selected protocol", e2);
            }
            return null;
        }
    }

    @Override // defpackage.edk
    public final X509TrustManager a(SSLSocketFactory sSLSocketFactory) {
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }

    public static edj a() {
        try {
            return new edj(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }
}
