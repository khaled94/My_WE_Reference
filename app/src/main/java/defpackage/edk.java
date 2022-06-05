package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: edk  reason: default package */
/* loaded from: classes2.dex */
public class edk {
    private static final Logger a;
    static final edk c;

    public static String f() {
        return "OkHttp";
    }

    public String a(SSLSocket sSLSocket) {
        return null;
    }

    public void a(SSLSocket sSLSocket, String str, List<eay> list) throws IOException {
    }

    public void b(SSLSocket sSLSocket) {
    }

    public void b(SSLSocketFactory sSLSocketFactory) {
    }

    public boolean b(String str) {
        return true;
    }

    public static edk e() {
        return c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public X509TrustManager a(SSLSocketFactory sSLSocketFactory) {
        try {
            Object a2 = a(sSLSocketFactory, Class.forName("sun.security.ssl.SSLContextImpl"), "context");
            if (a2 != null) {
                return (X509TrustManager) a(a2, X509TrustManager.class, "trustManager");
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public void a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    public void a(int i, String str, Throwable th) {
        a.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public Object a(String str) {
        if (a.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public void a(String str, Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        a(5, str, (Throwable) obj);
    }

    public static List<String> a(List<eay> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            eay eayVar = list.get(i);
            if (eayVar != eay.HTTP_1_0) {
                arrayList.add(eayVar.toString());
            }
        }
        return arrayList;
    }

    public edo a(X509TrustManager x509TrustManager) {
        return new edm(b(x509TrustManager));
    }

    public final edo c(SSLSocketFactory sSLSocketFactory) {
        X509TrustManager a2 = a(sSLSocketFactory);
        if (a2 == null) {
            throw new IllegalStateException("Unable to extract the trust manager on " + c + ", sslSocketFactory is " + sSLSocketFactory.getClass());
        }
        return a(a2);
    }

    public static boolean g() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T a(Object obj, Class<T> cls, String str) {
        do {
            for (Class<?> cls2 = obj.getClass(); cls2 != Object.class; cls2 = cls2.getSuperclass()) {
                try {
                    Field declaredField = cls2.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    if (cls.isInstance(obj2)) {
                        return cls.cast(obj2);
                    }
                    return null;
                } catch (IllegalAccessException unused) {
                    throw new AssertionError();
                } catch (NoSuchFieldException unused2) {
                }
            }
            if (str.equals("delegate")) {
                break;
            }
            obj = a(obj, Object.class, "delegate");
        } while (obj != null);
        return null;
    }

    public SSLContext c() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    public edq b(X509TrustManager x509TrustManager) {
        return new edn(x509TrustManager.getAcceptedIssuers());
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    static {
        edk edkVar;
        if (g()) {
            edkVar = edf.a();
            if (edkVar == null && (edkVar = edg.b()) == null) {
                throw new NullPointerException("No platform found on Android");
            }
        } else {
            if ((!("conscrypt".equals(ebk.d("okhttp.platform")) ? true : "Conscrypt".equals(Security.getProviders()[0].getName())) || (edkVar = edh.a()) == null) && (edkVar = edj.a()) == null && (edkVar = edi.a()) == null) {
                edkVar = new edk();
            }
        }
        c = edkVar;
        a = Logger.getLogger(eaw.class.getName());
    }
}
