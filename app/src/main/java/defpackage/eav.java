package defpackage;

import defpackage.ear;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: eav  reason: default package */
/* loaded from: classes2.dex */
public final class eav extends ebb {
    public static final eau a = eau.a("multipart/mixed");
    public static final eau b = eau.a("multipart/alternative");
    public static final eau c = eau.a("multipart/digest");
    public static final eau d = eau.a("multipart/parallel");
    public static final eau e = eau.a("multipart/form-data");
    private static final byte[] f = {58, 32};
    private static final byte[] g = {13, 10};
    private static final byte[] h = {45, 45};
    private final edx i;
    private final eau j;
    private final eau k;
    private final List<b> l;
    private long m = -1;

    eav(edx edxVar, eau eauVar, List<b> list) {
        this.i = edxVar;
        this.j = eauVar;
        this.k = eau.a(eauVar + "; boundary=" + edxVar.a());
        this.l = ebk.a(list);
    }

    @Override // defpackage.ebb
    public final eau a() {
        return this.k;
    }

    @Override // defpackage.ebb
    public final long b() throws IOException {
        long j = this.m;
        if (j != -1) {
            return j;
        }
        long a2 = a((edv) null, true);
        this.m = a2;
        return a2;
    }

    @Override // defpackage.ebb
    public final void a(edv edvVar) throws IOException {
        a(edvVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private long a(edv edvVar, boolean z) throws IOException {
        edu eduVar;
        if (z) {
            edvVar = new edu();
            eduVar = edvVar;
        } else {
            eduVar = 0;
        }
        int size = this.l.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            b bVar = this.l.get(i);
            ear earVar = bVar.a;
            ebb ebbVar = bVar.b;
            edvVar.c(h);
            edvVar.b(this.i);
            edvVar.c(g);
            if (earVar != null) {
                int length = earVar.a.length / 2;
                for (int i2 = 0; i2 < length; i2++) {
                    edvVar.b(earVar.a(i2)).c(f).b(earVar.b(i2)).c(g);
                }
            }
            eau a2 = ebbVar.a();
            if (a2 != null) {
                edvVar.b("Content-Type: ").b(a2.toString()).c(g);
            }
            long b2 = ebbVar.b();
            if (b2 != -1) {
                edvVar.b("Content-Length: ").l(b2).c(g);
            } else if (z) {
                eduVar.q();
                return -1L;
            }
            edvVar.c(g);
            if (z) {
                j += b2;
            } else {
                ebbVar.a(edvVar);
            }
            edvVar.c(g);
        }
        edvVar.c(h);
        edvVar.b(this.i);
        edvVar.c(h);
        edvVar.c(g);
        if (z) {
            long j2 = j + eduVar.b;
            eduVar.q();
            return j2;
        }
        return j;
    }

    static void a(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\n') {
                sb.append("%0A");
            } else if (charAt == '\r') {
                sb.append("%0D");
            } else if (charAt == '\"') {
                sb.append("%22");
            } else {
                sb.append(charAt);
            }
        }
        sb.append('\"');
    }

    /* renamed from: eav$b */
    /* loaded from: classes2.dex */
    public static final class b {
        final ear a;
        final ebb b;

        public static b a(ear earVar, ebb ebbVar) {
            if (ebbVar == null) {
                throw new NullPointerException("body == null");
            }
            if (earVar != null && earVar.a("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            }
            if (earVar != null && earVar.a("Content-Length") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
            return new b(earVar, ebbVar);
        }

        public static b a(String str, String str2) {
            return a(str, null, ebb.a(str2));
        }

        public static b a(String str, String str2, ebb ebbVar) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            StringBuilder sb = new StringBuilder("form-data; name=");
            eav.a(sb, str);
            if (str2 != null) {
                sb.append("; filename=");
                eav.a(sb, str2);
            }
            return a(new ear.a().b("Content-Disposition", sb.toString()).a(), ebbVar);
        }

        private b(ear earVar, ebb ebbVar) {
            this.a = earVar;
            this.b = ebbVar;
        }
    }

    /* renamed from: eav$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private final edx a;
        private eau b;
        private final List<b> c;

        public a() {
            this(UUID.randomUUID().toString());
        }

        private a(String str) {
            this.b = eav.a;
            this.c = new ArrayList();
            this.a = edx.a(str);
        }

        public final a a(ear earVar, ebb ebbVar) {
            return a(b.a(earVar, ebbVar));
        }

        public final a a(String str, String str2) {
            return a(b.a(str, str2));
        }

        public final a a(String str, String str2, ebb ebbVar) {
            return a(b.a(str, str2, ebbVar));
        }

        public final a a(b bVar) {
            if (bVar == null) {
                throw new NullPointerException("part == null");
            }
            this.c.add(bVar);
            return this;
        }

        public final eav a() {
            if (this.c.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new eav(this.a, this.b, this.c);
        }

        public final a a(eau eauVar) {
            if (eauVar == null) {
                throw new NullPointerException("type == null");
            }
            if (!eauVar.a.equals("multipart")) {
                throw new IllegalArgumentException("multipart != ".concat(String.valueOf(eauVar)));
            }
            this.b = eauVar;
            return this;
        }
    }
}
