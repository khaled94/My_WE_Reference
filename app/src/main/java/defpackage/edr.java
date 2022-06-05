package defpackage;

import androidx.core.location.LocationRequestCompat;
import defpackage.eat;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;

/* renamed from: edr  reason: default package */
/* loaded from: classes2.dex */
public final class edr implements eat {
    private static final Charset b = Charset.forName("UTF-8");
    public volatile int a;
    private final b c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: edr$a */
    /* loaded from: classes2.dex */
    public static final class a extends Enum<a> {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        private static final /* synthetic */ int[] e = {1, 2, 3, 4};
    }

    /* renamed from: edr$b */
    /* loaded from: classes2.dex */
    public interface b {
        public static final b a = new b() { // from class: edr.b.1
            @Override // defpackage.edr.b
            public final void a(String str) {
                edk.e().a(4, str, (Throwable) null);
            }
        };

        void a(String str);
    }

    public edr() {
        this(b.a);
    }

    private edr(b bVar) {
        this.a = a.a;
        this.c = bVar;
    }

    @Override // defpackage.eat
    public final ebc a(eat.a aVar) throws IOException {
        boolean z;
        ear g;
        boolean z2;
        int i = this.a;
        eba a2 = aVar.a();
        if (i == a.a) {
            return aVar.a(a2);
        }
        boolean z3 = true;
        boolean z4 = i == a.d;
        boolean z5 = z4 || i == a.c;
        ebb d = a2.d();
        if (d == null) {
            z3 = false;
        }
        eah b2 = aVar.b();
        String str = "--> " + a2.b() + ' ' + a2.a() + ' ' + (b2 != null ? b2.c() : eay.HTTP_1_1);
        if (!z5 && z3) {
            str = str + " (" + d.b() + "-byte body)";
        }
        this.c.a(str);
        if (z5) {
            if (z3) {
                if (d.a() != null) {
                    this.c.a("Content-Type: " + d.a());
                }
                if (d.b() != -1) {
                    this.c.a("Content-Length: " + d.b());
                }
            }
            ear c = a2.c();
            int a3 = c.a();
            int i2 = 0;
            while (i2 < a3) {
                String a4 = c.a(i2);
                int i3 = a3;
                if ("Content-Type".equalsIgnoreCase(a4) || "Content-Length".equalsIgnoreCase(a4)) {
                    z2 = z5;
                } else {
                    z2 = z5;
                    this.c.a(a4 + ": " + c.b(i2));
                }
                i2++;
                a3 = i3;
                z5 = z2;
            }
            z = z5;
            if (!z4 || !z3) {
                this.c.a("--> END " + a2.b());
            } else if (a(a2.c())) {
                this.c.a("--> END " + a2.b() + " (encoded body omitted)");
            } else {
                edu eduVar = new edu();
                d.a(eduVar);
                Charset charset = b;
                eau a5 = d.a();
                if (a5 != null) {
                    charset = a5.a(b);
                }
                this.c.a("");
                if (a(eduVar)) {
                    this.c.a(eduVar.a(charset));
                    this.c.a("--> END " + a2.b() + " (" + d.b() + "-byte body)");
                } else {
                    this.c.a("--> END " + a2.b() + " (binary " + d.b() + "-byte body omitted)");
                }
            }
        } else {
            z = z5;
        }
        long nanoTime = System.nanoTime();
        try {
            ebc a6 = aVar.a(a2);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            ebd h = a6.h();
            long b3 = h.b();
            String str2 = b3 != -1 ? b3 + "-byte" : "unknown-length";
            b bVar = this.c;
            StringBuilder sb = new StringBuilder("<-- ");
            sb.append(a6.c());
            sb.append(' ');
            sb.append(a6.e());
            sb.append(' ');
            sb.append(a6.a().a());
            sb.append(" (");
            sb.append(millis);
            sb.append("ms");
            sb.append(!z ? ", " + str2 + " body" : "");
            sb.append(')');
            bVar.a(sb.toString());
            if (z) {
                int a7 = a6.g().a();
                for (int i4 = 0; i4 < a7; i4++) {
                    this.c.a(g.a(i4) + ": " + g.b(i4));
                }
                if (!z4 || !ece.b(a6)) {
                    this.c.a("<-- END HTTP");
                } else if (a(a6.g())) {
                    this.c.a("<-- END HTTP (encoded body omitted)");
                } else {
                    edw d2 = h.d();
                    d2.b(LocationRequestCompat.PASSIVE_INTERVAL);
                    edu b4 = d2.b();
                    Charset charset2 = b;
                    eau a8 = h.a();
                    if (a8 != null) {
                        charset2 = a8.a(b);
                    }
                    if (!a(b4)) {
                        this.c.a("");
                        this.c.a("<-- END HTTP (binary " + b4.b + "-byte body omitted)");
                        return a6;
                    }
                    if (b3 != 0) {
                        this.c.a("");
                        this.c.a(b4.clone().a(charset2));
                    }
                    this.c.a("<-- END HTTP (" + b4.b + "-byte body)");
                }
            }
            return a6;
        } catch (Exception e) {
            this.c.a("<-- HTTP FAILED: ".concat(String.valueOf(e)));
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e5, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean a(defpackage.edu r14) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edr.a(edu):boolean");
    }

    private static boolean a(ear earVar) {
        String a2 = earVar.a("Content-Encoding");
        return a2 != null && !a2.equalsIgnoreCase("identity");
    }
}
