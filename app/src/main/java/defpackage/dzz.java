package defpackage;

import defpackage.eas;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: dzz  reason: default package */
/* loaded from: classes2.dex */
public final class dzz {
    public final eas a;
    public final ean b;
    public final SocketFactory c;
    public final eaa d;
    public final List<eay> e;
    public final List<eaj> f;
    public final ProxySelector g;
    public final Proxy h;
    public final SSLSocketFactory i;
    public final HostnameVerifier j;
    public final eaf k;

    public dzz(String str, int i, ean eanVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, eaf eafVar, eaa eaaVar, Proxy proxy, List<eay> list, List<eaj> list2, ProxySelector proxySelector) {
        eas.a aVar = new eas.a();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            aVar.a = "http";
        } else if (str2.equalsIgnoreCase("https")) {
            aVar.a = "https";
        } else {
            throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
        }
        if (str == null) {
            throw new NullPointerException("host == null");
        }
        String a = eas.a.a(str, 0, str.length());
        if (a == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(String.valueOf(str)));
        }
        aVar.d = a;
        if (i <= 0 || i > 65535) {
            throw new IllegalArgumentException("unexpected port: ".concat(String.valueOf(i)));
        }
        aVar.e = i;
        this.a = aVar.b();
        if (eanVar == null) {
            throw new NullPointerException("dns == null");
        }
        this.b = eanVar;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.c = socketFactory;
        if (eaaVar == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.d = eaaVar;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.e = ebk.a(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f = ebk.a(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.g = proxySelector;
        this.h = proxy;
        this.i = sSLSocketFactory;
        this.j = hostnameVerifier;
        this.k = eafVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzz) {
            dzz dzzVar = (dzz) obj;
            return this.a.equals(dzzVar.a) && a(dzzVar);
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + Objects.hashCode(this.h)) * 31) + Objects.hashCode(this.i)) * 31) + Objects.hashCode(this.j)) * 31) + Objects.hashCode(this.k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(dzz dzzVar) {
        return this.b.equals(dzzVar.b) && this.d.equals(dzzVar.d) && this.e.equals(dzzVar.e) && this.f.equals(dzzVar.f) && this.g.equals(dzzVar.g) && Objects.equals(this.h, dzzVar.h) && Objects.equals(this.i, dzzVar.i) && Objects.equals(this.j, dzzVar.j) && Objects.equals(this.k, dzzVar.k) && this.a.c == dzzVar.a.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        sb.append(this.a.b);
        sb.append(":");
        sb.append(this.a.c);
        if (this.h != null) {
            sb.append(", proxy=");
            sb.append(this.h);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.g);
        }
        sb.append("}");
        return sb.toString();
    }
}
