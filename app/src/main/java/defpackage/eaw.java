package defpackage;

import defpackage.ead;
import defpackage.eaj;
import defpackage.eao;
import defpackage.ear;
import defpackage.ebc;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* renamed from: eaw  reason: default package */
/* loaded from: classes2.dex */
public class eaw implements ead.a, Cloneable {
    static final List<eay> a = ebk.a(eay.HTTP_2, eay.HTTP_1_1);
    static final List<eaj> b = ebk.a(eaj.b, eaj.d);
    final int A;
    final int B;
    final int C;
    public final int D;
    final eam c;
    public final Proxy d;
    public final List<eay> e;
    public final List<eaj> f;
    final List<eat> g;
    final List<eat> h;
    public final eao.a i;
    public final ProxySelector j;
    public final eal k;
    final eab l;
    final ebq m;
    public final SocketFactory n;
    public final SSLSocketFactory o;
    final edo p;
    public final HostnameVerifier q;
    public final eaf r;
    public final eaa s;
    public final eaa t;
    public final eai u;
    public final ean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final int z;

    static {
        ebg.a = new ebg() { // from class: eaw.1
            @Override // defpackage.ebg
            public final void a(ear.a aVar, String str, String str2) {
                aVar.c(str, str2);
            }

            @Override // defpackage.ebg
            public final ebw a(eai eaiVar) {
                return eaiVar.a;
            }

            @Override // defpackage.ebg
            public final boolean a(dzz dzzVar, dzz dzzVar2) {
                return dzzVar.a(dzzVar2);
            }

            @Override // defpackage.ebg
            public final int a(ebc.a aVar) {
                return aVar.c;
            }

            @Override // defpackage.ebg
            public final ebt a(ebc ebcVar) {
                return ebcVar.m;
            }

            @Override // defpackage.ebg
            public final void a(ear.a aVar, String str) {
                int indexOf = str.indexOf(":", 1);
                if (indexOf != -1) {
                    aVar.c(str.substring(0, indexOf), str.substring(indexOf + 1));
                } else if (str.startsWith(":")) {
                    aVar.c("", str.substring(1));
                } else {
                    aVar.c("", str);
                }
            }

            @Override // defpackage.ebg
            public final void a(eaj eajVar, SSLSocket sSLSocket, boolean z) {
                String[] strArr;
                String[] strArr2;
                if (eajVar.g != null) {
                    strArr = ebk.a(eag.a, sSLSocket.getEnabledCipherSuites(), eajVar.g);
                } else {
                    strArr = sSLSocket.getEnabledCipherSuites();
                }
                if (eajVar.h != null) {
                    strArr2 = ebk.a(ebk.g, sSLSocket.getEnabledProtocols(), eajVar.h);
                } else {
                    strArr2 = sSLSocket.getEnabledProtocols();
                }
                String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
                int a2 = ebk.a(eag.a, supportedCipherSuites, "TLS_FALLBACK_SCSV");
                if (z && a2 != -1) {
                    strArr = ebk.a(strArr, supportedCipherSuites[a2]);
                }
                eaj b2 = new eaj.a(eajVar).a(strArr).b(strArr2).b();
                if (b2.h != null) {
                    sSLSocket.setEnabledProtocols(b2.h);
                }
                if (b2.g != null) {
                    sSLSocket.setEnabledCipherSuites(b2.g);
                }
            }

            @Override // defpackage.ebg
            public final void a(ebc.a aVar, ebt ebtVar) {
                aVar.m = ebtVar;
            }
        };
    }

    public eaw() {
        this(new a());
    }

    eaw(a aVar) {
        boolean z;
        this.c = aVar.a;
        this.d = aVar.b;
        this.e = aVar.c;
        this.f = aVar.d;
        this.g = ebk.a(aVar.e);
        this.h = ebk.a(aVar.f);
        this.i = aVar.g;
        this.j = aVar.h;
        this.k = aVar.i;
        this.l = aVar.j;
        this.m = aVar.k;
        this.n = aVar.l;
        loop0: while (true) {
            z = false;
            for (eaj eajVar : this.f) {
                z = (z || eajVar.e) ? true : z;
            }
        }
        if (aVar.m != null || !z) {
            this.o = aVar.m;
            this.p = aVar.n;
        } else {
            X509TrustManager a2 = ebk.a();
            this.o = a(a2);
            this.p = edk.e().a(a2);
        }
        if (this.o != null) {
            edk.e().b(this.o);
        }
        this.q = aVar.o;
        eaf eafVar = aVar.p;
        edo edoVar = this.p;
        this.r = !Objects.equals(eafVar.c, edoVar) ? new eaf(eafVar.b, edoVar) : eafVar;
        this.s = aVar.q;
        this.t = aVar.r;
        this.u = aVar.s;
        this.v = aVar.t;
        this.w = aVar.u;
        this.x = aVar.v;
        this.y = aVar.w;
        this.z = aVar.x;
        this.A = aVar.y;
        this.B = aVar.z;
        this.C = aVar.A;
        this.D = aVar.B;
        if (this.g.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.g);
        } else if (this.h.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.h);
        }
    }

    private static SSLSocketFactory a(X509TrustManager x509TrustManager) {
        try {
            SSLContext c = edk.e().c();
            c.init(null, new TrustManager[]{x509TrustManager}, null);
            return c.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS", e);
        }
    }

    public final int a() {
        return this.A;
    }

    public final int b() {
        return this.B;
    }

    public final int c() {
        return this.C;
    }

    public final Proxy d() {
        return this.d;
    }

    public final SSLSocketFactory e() {
        return this.o;
    }

    public final HostnameVerifier f() {
        return this.q;
    }

    public final boolean g() {
        return this.x;
    }

    public final eam h() {
        return this.c;
    }

    @Override // defpackage.ead.a
    public final ead a(eba ebaVar) {
        return eaz.a(this, ebaVar, false);
    }

    public final a i() {
        return new a(this);
    }

    /* renamed from: eaw$a */
    /* loaded from: classes2.dex */
    public static final class a {
        int A;
        int B;
        eam a;
        Proxy b;
        List<eay> c;
        List<eaj> d;
        public final List<eat> e;
        final List<eat> f;
        eao.a g;
        ProxySelector h;
        eal i;
        eab j;
        ebq k;
        SocketFactory l;
        public SSLSocketFactory m;
        public edo n;
        HostnameVerifier o;
        public eaf p;
        eaa q;
        eaa r;
        eai s;
        ean t;
        boolean u;
        boolean v;
        boolean w;
        int x;
        int y;
        int z;

        public a() {
            this.e = new ArrayList();
            this.f = new ArrayList();
            this.a = new eam();
            this.c = eaw.a;
            this.d = eaw.b;
            this.g = eao.a(eao.a);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.h = proxySelector;
            if (proxySelector == null) {
                this.h = new edl();
            }
            this.i = eal.a;
            this.l = SocketFactory.getDefault();
            this.o = edp.a;
            this.p = eaf.a;
            this.q = eaa.a;
            this.r = eaa.a;
            this.s = new eai();
            this.t = ean.a;
            this.u = true;
            this.v = true;
            this.w = true;
            this.x = 0;
            this.y = 10000;
            this.z = 10000;
            this.A = 10000;
            this.B = 0;
        }

        a(eaw eawVar) {
            this.e = new ArrayList();
            this.f = new ArrayList();
            this.a = eawVar.c;
            this.b = eawVar.d;
            this.c = eawVar.e;
            this.d = eawVar.f;
            this.e.addAll(eawVar.g);
            this.f.addAll(eawVar.h);
            this.g = eawVar.i;
            this.h = eawVar.j;
            this.i = eawVar.k;
            this.k = eawVar.m;
            this.j = eawVar.l;
            this.l = eawVar.n;
            this.m = eawVar.o;
            this.n = eawVar.p;
            this.o = eawVar.q;
            this.p = eawVar.r;
            this.q = eawVar.s;
            this.r = eawVar.t;
            this.s = eawVar.u;
            this.t = eawVar.v;
            this.u = eawVar.w;
            this.v = eawVar.x;
            this.w = eawVar.y;
            this.x = eawVar.z;
            this.y = eawVar.A;
            this.z = eawVar.B;
            this.A = eawVar.C;
            this.B = eawVar.D;
        }

        public final a a(long j, TimeUnit timeUnit) {
            this.y = ebk.a("timeout", j, timeUnit);
            return this;
        }

        public final a b(long j, TimeUnit timeUnit) {
            this.z = ebk.a("timeout", j, timeUnit);
            return this;
        }

        public final a c(long j, TimeUnit timeUnit) {
            this.A = ebk.a("timeout", j, timeUnit);
            return this;
        }

        public final a a(Proxy proxy) {
            this.b = proxy;
            return this;
        }

        public final a a() {
            this.j = null;
            this.k = null;
            return this;
        }

        public final a a(SSLSocketFactory sSLSocketFactory) {
            if (sSLSocketFactory == null) {
                throw new NullPointerException("sslSocketFactory == null");
            }
            this.m = sSLSocketFactory;
            this.n = edk.e().c(sSLSocketFactory);
            return this;
        }

        public final a a(HostnameVerifier hostnameVerifier) {
            if (hostnameVerifier == null) {
                throw new NullPointerException("hostnameVerifier == null");
            }
            this.o = hostnameVerifier;
            return this;
        }

        public final a a(boolean z) {
            this.v = z;
            return this;
        }

        public final a a(eam eamVar) {
            this.a = eamVar;
            return this;
        }

        public final List<eat> b() {
            return this.e;
        }

        public final List<eat> c() {
            return this.f;
        }

        public final eaw d() {
            return new eaw(this);
        }
    }
}
