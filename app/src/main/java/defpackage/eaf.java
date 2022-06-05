package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: eaf  reason: default package */
/* loaded from: classes2.dex */
public final class eaf {
    public static final eaf a = new a().a();
    final Set<b> b;
    final edo c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public eaf(Set<b> set, edo edoVar) {
        this.b = set;
        this.c = edoVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eaf)) {
            return false;
        }
        eaf eafVar = (eaf) obj;
        return Objects.equals(this.c, eafVar.c) && this.b.equals(eafVar.b);
    }

    public final int hashCode() {
        return (Objects.hashCode(this.c) * 31) + this.b.hashCode();
    }

    public static String a(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        return "sha256/" + a((X509Certificate) certificate).b();
    }

    private static edx a(X509Certificate x509Certificate) {
        return edx.a(x509Certificate.getPublicKey().getEncoded()).d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: eaf$b */
    /* loaded from: classes2.dex */
    public static final class b {
        final String a;
        final String b;
        final String c;
        final edx d;

        b(String str, String str2) {
            String str3;
            this.a = str;
            if (str.startsWith("*.")) {
                str3 = eas.e("http://" + str.substring(2)).b;
            } else {
                str3 = eas.e("http://".concat(String.valueOf(str))).b;
            }
            this.b = str3;
            if (str2.startsWith("sha1/")) {
                this.c = "sha1/";
                this.d = edx.b(str2.substring(5));
            } else if (str2.startsWith("sha256/")) {
                this.c = "sha256/";
                this.d = edx.b(str2.substring(7));
            } else {
                throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': ".concat(String.valueOf(str2)));
            }
            if (this.d != null) {
                return;
            }
            throw new IllegalArgumentException("pins must be base64: ".concat(String.valueOf(str2)));
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.a.equals(bVar.a) && this.c.equals(bVar.c) && this.d.equals(bVar.d);
            }
            return false;
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 527) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public final String toString() {
            return this.c + this.d.b();
        }
    }

    /* renamed from: eaf$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private final List<b> a = new ArrayList();

        public final a a(String str, String... strArr) {
            for (int i = 0; i <= 0; i++) {
                this.a.add(new b(str, strArr[0]));
            }
            return this;
        }

        public final eaf a() {
            return new eaf(new LinkedHashSet(this.a), null);
        }
    }

    public final void a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        int i;
        List emptyList = Collections.emptyList();
        Iterator<b> it = this.b.iterator();
        List list2 = emptyList;
        while (true) {
            r10 = false;
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            b next = it.next();
            if (next.a.startsWith("*.")) {
                int indexOf = str.indexOf(46);
                if ((str.length() - indexOf) - 1 == next.b.length() && str.regionMatches(false, indexOf + 1, next.b, 0, next.b.length())) {
                    z = true;
                }
            } else {
                z = str.equals(next.b);
            }
            if (z) {
                if (list2.isEmpty()) {
                    list2 = new ArrayList();
                }
                list2.add(next);
            }
        }
        if (list2.isEmpty()) {
            return;
        }
        edo edoVar = this.c;
        List<Certificate> a2 = edoVar != null ? edoVar.a(list, str) : list;
        int size = a2.size();
        for (int i2 = 0; i2 < size; i2++) {
            X509Certificate x509Certificate = (X509Certificate) a2.get(i2);
            int size2 = list2.size();
            edx edxVar = null;
            edx edxVar2 = null;
            for (int i3 = 0; i3 < size2; i3++) {
                b bVar = (b) list2.get(i3);
                if (bVar.c.equals("sha256/")) {
                    if (edxVar == null) {
                        edxVar = a(x509Certificate);
                    }
                    if (bVar.d.equals(edxVar)) {
                        return;
                    }
                } else if (bVar.c.equals("sha1/")) {
                    if (edxVar2 == null) {
                        edxVar2 = edx.a(x509Certificate.getPublicKey().getEncoded()).c();
                    }
                    if (bVar.d.equals(edxVar2)) {
                        return;
                    }
                } else {
                    throw new AssertionError("unsupported hashAlgorithm: " + bVar.c);
                }
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        int size3 = a2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            X509Certificate x509Certificate2 = (X509Certificate) a2.get(i4);
            sb.append("\n    ");
            sb.append(a((Certificate) x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        int size4 = list2.size();
        for (i = 0; i < size4; i++) {
            sb.append("\n    ");
            sb.append((b) list2.get(i));
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }
}
