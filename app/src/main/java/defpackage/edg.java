package defpackage;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: edg  reason: default package */
/* loaded from: classes2.dex */
public class edg extends edk {
    private final Class<?> a;
    private final Class<?> b;
    private final Method d;
    private final Method e;
    private final Method f;
    private final Method g;
    private final b h = b.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public edg(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        this.a = cls;
        this.b = cls2;
        this.d = method;
        this.e = method2;
        this.f = method3;
        this.g = method4;
    }

    @Override // defpackage.edk
    public final void a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (!ebk.a(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e2);
            }
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.edk
    public final X509TrustManager a(SSLSocketFactory sSLSocketFactory) {
        Object a2 = a(sSLSocketFactory, this.a, "sslParameters");
        if (a2 == null) {
            try {
                a2 = a(sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters");
            } catch (ClassNotFoundException unused) {
                return super.a(sSLSocketFactory);
            }
        }
        X509TrustManager x509TrustManager = (X509TrustManager) a(a2, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager != null ? x509TrustManager : (X509TrustManager) a(a2, X509TrustManager.class, "trustManager");
    }

    @Override // defpackage.edk
    public void a(SSLSocket sSLSocket, String str, List<eay> list) throws IOException {
        if (!this.b.isInstance(sSLSocket)) {
            return;
        }
        if (str != null) {
            try {
                this.d.invoke(sSLSocket, Boolean.TRUE);
                this.e.invoke(sSLSocket, str);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new AssertionError(e);
            }
        }
        Method method = this.g;
        Object[] objArr = new Object[1];
        edu eduVar = new edu();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            eay eayVar = list.get(i);
            if (eayVar != eay.HTTP_1_0) {
                eduVar.h(eayVar.toString().length());
                eduVar.b(eayVar.toString());
            }
        }
        objArr[0] = eduVar.p();
        method.invoke(sSLSocket, objArr);
    }

    @Override // defpackage.edk
    public String a(SSLSocket sSLSocket) {
        if (!this.b.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, StandardCharsets.UTF_8);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.edk
    public final void a(int i, String str, Throwable th) {
        int min;
        int i2 = 5;
        if (i != 5) {
            i2 = 3;
        }
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int i3 = 0;
        int length = str.length();
        while (i3 < length) {
            int indexOf = str.indexOf(10, i3);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i3 + 4000);
                Log.println(i2, "OkHttp", str.substring(i3, min));
                if (min >= indexOf) {
                    break;
                }
                i3 = min;
            }
            i3 = min + 1;
        }
    }

    @Override // defpackage.edk
    public final Object a(String str) {
        return this.h.a(str);
    }

    @Override // defpackage.edk
    public final void a(String str, Object obj) {
        if (!this.h.a(obj)) {
            a(5, str, (Throwable) null);
        }
    }

    @Override // defpackage.edk
    public final boolean b(String str) {
        Throwable e;
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return a(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.b(str);
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new AssertionError("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e3) {
            e = e3;
            throw new AssertionError("unable to determine cleartext support", e);
        } catch (InvocationTargetException e4) {
            e = e4;
            throw new AssertionError("unable to determine cleartext support", e);
        }
    }

    private boolean a(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            return b(str, cls, obj);
        }
    }

    private boolean b(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.b(str);
        }
    }

    @Override // defpackage.edk
    public final edo a(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new a(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.a(x509TrustManager);
        }
    }

    public static edk b() {
        if (!edk.g()) {
            return null;
        }
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            Class<?> cls2 = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    return new edg(cls, cls2, cls2.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE), cls2.getMethod("setHostname", String.class), cls2.getMethod("getAlpnSelectedProtocol", new Class[0]), cls2.getMethod("setAlpnProtocols", byte[].class));
                } catch (NoSuchMethodException unused) {
                }
            }
            throw new IllegalStateException("Expected Android API level 21+ but was " + Build.VERSION.SDK_INT);
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }

    @Override // defpackage.edk
    public final edq b(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new c(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.b(x509TrustManager);
        }
    }

    /* renamed from: edg$a */
    /* loaded from: classes2.dex */
    static final class a extends edo {
        private final Object a;
        private final Method b;

        public final int hashCode() {
            return 0;
        }

        a(Object obj, Method method) {
            this.a = obj;
            this.b = method;
        }

        @Override // defpackage.edo
        public final List<Certificate> a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                return (List) this.b.invoke(this.a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
                sSLPeerUnverifiedException.initCause(e2);
                throw sSLPeerUnverifiedException;
            }
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }
    }

    /* renamed from: edg$b */
    /* loaded from: classes2.dex */
    static final class b {
        private final Method a;
        private final Method b;
        private final Method c;

        private b(Method method, Method method2, Method method3) {
            this.a = method;
            this.b = method2;
            this.c = method3;
        }

        final Object a(String str) {
            Method method = this.a;
            if (method != null) {
                try {
                    Object invoke = method.invoke(null, new Object[0]);
                    this.b.invoke(invoke, str);
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        final boolean a(Object obj) {
            if (obj != null) {
                try {
                    this.c.invoke(obj, new Object[0]);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
            return false;
        }

        static b a() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method = cls.getMethod("open", String.class);
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method2 = null;
                method = null;
            }
            return new b(method3, method, method2);
        }
    }

    /* renamed from: edg$c */
    /* loaded from: classes2.dex */
    static final class c implements edq {
        private final X509TrustManager a;
        private final Method b;

        c(X509TrustManager x509TrustManager, Method method) {
            this.b = method;
            this.a = x509TrustManager;
        }

        @Override // defpackage.edq
        public final X509Certificate a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.b.invoke(this.a, x509Certificate);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
            }
            return null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && this.b.equals(cVar.b);
        }

        public final int hashCode() {
            return this.a.hashCode() + (this.b.hashCode() * 31);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000b, code lost:
        if (android.os.Build.VERSION.SDK_INT < 22) goto L10;
     */
    @Override // defpackage.edk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final javax.net.ssl.SSLContext c() {
        /*
            r3 = this;
            r0 = 1
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.NoClassDefFoundError -> L10
            r2 = 16
            if (r1 < r2) goto Le
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.NoClassDefFoundError -> L10
            r2 = 22
            if (r1 >= r2) goto Le
            goto L11
        Le:
            r0 = 0
            goto L11
        L10:
        L11:
            if (r0 == 0) goto L1a
            java.lang.String r0 = "TLSv1.2"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L1a
            return r0
        L1a:
            java.lang.String r0 = "TLS"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L21
            return r0
        L21:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "No TLS provider"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edg.c():javax.net.ssl.SSLContext");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            return 0;
        }
    }
}
