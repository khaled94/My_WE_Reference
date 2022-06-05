package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* renamed from: eaj  reason: default package */
/* loaded from: classes2.dex */
public final class eaj {
    final boolean e;
    public final boolean f;
    final String[] g;
    final String[] h;
    private static final eag[] i = {eag.bl, eag.bm, eag.bn, eag.aX, eag.bb, eag.aY, eag.bc, eag.bi, eag.bh};
    private static final eag[] j = {eag.bl, eag.bm, eag.bn, eag.aX, eag.bb, eag.aY, eag.bc, eag.bi, eag.bh, eag.aI, eag.aJ, eag.ag, eag.ah, eag.E, eag.I, eag.i};
    public static final eaj a = new a(true).a(i).a(ebf.TLS_1_3, ebf.TLS_1_2).a().b();
    public static final eaj b = new a(true).a(j).a(ebf.TLS_1_3, ebf.TLS_1_2).a().b();
    public static final eaj c = new a(true).a(j).a(ebf.TLS_1_3, ebf.TLS_1_2, ebf.TLS_1_1, ebf.TLS_1_0).a().b();
    public static final eaj d = new a(false).b();

    eaj(a aVar) {
        this.e = aVar.a;
        this.g = aVar.b;
        this.h = aVar.c;
        this.f = aVar.d;
    }

    public final boolean a(SSLSocket sSLSocket) {
        if (!this.e) {
            return false;
        }
        if (this.h != null && !ebk.b(ebk.g, this.h, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        return this.g == null || ebk.b(eag.a, this.g, sSLSocket.getEnabledCipherSuites());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eaj)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        eaj eajVar = (eaj) obj;
        boolean z = this.e;
        if (z != eajVar.e) {
            return false;
        }
        return !z || (Arrays.equals(this.g, eajVar.g) && Arrays.equals(this.h, eajVar.h) && this.f == eajVar.f);
    }

    public final int hashCode() {
        if (this.e) {
            return ((((Arrays.hashCode(this.g) + 527) * 31) + Arrays.hashCode(this.h)) * 31) + (!this.f ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        if (!this.e) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        String[] strArr = this.g;
        List<ebf> list = null;
        sb.append(Objects.toString(strArr != null ? eag.a(strArr) : null, "[all enabled]"));
        sb.append(", tlsVersions=");
        String[] strArr2 = this.h;
        if (strArr2 != null) {
            list = ebf.forJavaNames(strArr2);
        }
        sb.append(Objects.toString(list, "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: eaj$a */
    /* loaded from: classes2.dex */
    public static final class a {
        boolean a;
        String[] b;
        String[] c;
        boolean d;

        a(boolean z) {
            this.a = z;
        }

        public a(eaj eajVar) {
            this.a = eajVar.e;
            this.b = eajVar.g;
            this.c = eajVar.h;
            this.d = eajVar.f;
        }

        public final a a(eag... eagVarArr) {
            if (!this.a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[eagVarArr.length];
            for (int i = 0; i < eagVarArr.length; i++) {
                strArr[i] = eagVarArr[i].bq;
            }
            return a(strArr);
        }

        public final a a(String... strArr) {
            if (!this.a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.b = (String[]) strArr.clone();
            return this;
        }

        public final a a(ebf... ebfVarArr) {
            if (!this.a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            String[] strArr = new String[ebfVarArr.length];
            for (int i = 0; i < ebfVarArr.length; i++) {
                strArr[i] = ebfVarArr[i].javaName;
            }
            return b(strArr);
        }

        public final a b(String... strArr) {
            if (!this.a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.c = (String[]) strArr.clone();
            return this;
        }

        public final a a() {
            if (!this.a) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.d = true;
            return this;
        }

        public final eaj b() {
            return new eaj(this);
        }
    }
}
