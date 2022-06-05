package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: eco  reason: default package */
/* loaded from: classes2.dex */
public final class eco {
    static final ecn[] a = {new ecn(ecn.f, ""), new ecn(ecn.c, "GET"), new ecn(ecn.c, "POST"), new ecn(ecn.d, "/"), new ecn(ecn.d, "/index.html"), new ecn(ecn.e, "http"), new ecn(ecn.e, "https"), new ecn(ecn.b, "200"), new ecn(ecn.b, "204"), new ecn(ecn.b, "206"), new ecn(ecn.b, "304"), new ecn(ecn.b, "400"), new ecn(ecn.b, "404"), new ecn(ecn.b, "500"), new ecn("accept-charset", ""), new ecn("accept-encoding", "gzip, deflate"), new ecn("accept-language", ""), new ecn("accept-ranges", ""), new ecn("accept", ""), new ecn("access-control-allow-origin", ""), new ecn("age", ""), new ecn("allow", ""), new ecn("authorization", ""), new ecn("cache-control", ""), new ecn("content-disposition", ""), new ecn("content-encoding", ""), new ecn("content-language", ""), new ecn("content-length", ""), new ecn("content-location", ""), new ecn("content-range", ""), new ecn("content-type", ""), new ecn("cookie", ""), new ecn("date", ""), new ecn("etag", ""), new ecn("expect", ""), new ecn("expires", ""), new ecn(TypedValues.Transition.S_FROM, ""), new ecn("host", ""), new ecn("if-match", ""), new ecn("if-modified-since", ""), new ecn("if-none-match", ""), new ecn("if-range", ""), new ecn("if-unmodified-since", ""), new ecn("last-modified", ""), new ecn("link", ""), new ecn("location", ""), new ecn("max-forwards", ""), new ecn("proxy-authenticate", ""), new ecn("proxy-authorization", ""), new ecn("range", ""), new ecn("referer", ""), new ecn("refresh", ""), new ecn("retry-after", ""), new ecn("server", ""), new ecn("set-cookie", ""), new ecn("strict-transport-security", ""), new ecn("transfer-encoding", ""), new ecn("user-agent", ""), new ecn("vary", ""), new ecn("via", ""), new ecn("www-authenticate", "")};
    static final Map<edx, Integer> b;

    static {
        int i = 0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(a.length);
        while (true) {
            ecn[] ecnVarArr = a;
            if (i >= ecnVarArr.length) {
                b = Collections.unmodifiableMap(linkedHashMap);
                return;
            }
            if (!linkedHashMap.containsKey(ecnVarArr[i].g)) {
                linkedHashMap.put(a[i].g, Integer.valueOf(i));
            }
            i++;
        }
    }

    private eco() {
    }

    /* renamed from: eco$a */
    /* loaded from: classes2.dex */
    static final class a {
        ecn[] a;
        int b;
        int c;
        int d;
        private final List<ecn> e;
        private final edw f;
        private final int g;
        private int h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(een eenVar) {
            this(eenVar, (byte) 0);
        }

        private a(een eenVar, byte b) {
            this.e = new ArrayList();
            ecn[] ecnVarArr = new ecn[8];
            this.a = ecnVarArr;
            this.b = ecnVarArr.length - 1;
            this.c = 0;
            this.d = 0;
            this.g = 4096;
            this.h = 4096;
            this.f = eed.a(eenVar);
        }

        private void c() {
            int i = this.h;
            int i2 = this.d;
            if (i < i2) {
                if (i == 0) {
                    d();
                } else {
                    a(i2 - i);
                }
            }
        }

        private void d() {
            Arrays.fill(this.a, (Object) null);
            this.b = this.a.length - 1;
            this.c = 0;
            this.d = 0;
        }

        private int a(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.a.length;
                while (true) {
                    length--;
                    if (length < this.b || i <= 0) {
                        break;
                    }
                    i -= this.a[length].i;
                    this.d -= this.a[length].i;
                    this.c--;
                    i2++;
                }
                ecn[] ecnVarArr = this.a;
                int i3 = this.b;
                System.arraycopy(ecnVarArr, i3 + 1, ecnVarArr, i3 + 1 + i2, this.c);
                this.b += i2;
            }
            return i2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void a() throws IOException {
            while (!this.f.d()) {
                int g = this.f.g() & 255;
                if (g == 128) {
                    throw new IOException("index == 0");
                }
                if ((g & 128) == 128) {
                    int a = a(g, 127) - 1;
                    if (d(a)) {
                        this.e.add(eco.a[a]);
                    } else {
                        int b = b(a - eco.a.length);
                        if (b >= 0) {
                            ecn[] ecnVarArr = this.a;
                            if (b < ecnVarArr.length) {
                                this.e.add(ecnVarArr[b]);
                            }
                        }
                        throw new IOException("Header index too large " + (a + 1));
                    }
                } else if (g == 64) {
                    a(new ecn(eco.a(f()), f()));
                } else if ((g & 64) == 64) {
                    a(new ecn(c(a(g, 63) - 1), f()));
                } else if ((g & 32) == 32) {
                    int a2 = a(g, 31);
                    this.h = a2;
                    if (a2 < 0 || a2 > this.g) {
                        throw new IOException("Invalid dynamic table size update " + this.h);
                    }
                    c();
                } else if (g == 16 || g == 0) {
                    this.e.add(new ecn(eco.a(f()), f()));
                } else {
                    this.e.add(new ecn(c(a(g, 15) - 1), f()));
                }
            }
        }

        public final List<ecn> b() {
            ArrayList arrayList = new ArrayList(this.e);
            this.e.clear();
            return arrayList;
        }

        private int b(int i) {
            return this.b + 1 + i;
        }

        private edx c(int i) throws IOException {
            if (d(i)) {
                return eco.a[i].g;
            }
            int b = b(i - eco.a.length);
            if (b >= 0) {
                ecn[] ecnVarArr = this.a;
                if (b < ecnVarArr.length) {
                    return ecnVarArr[b].g;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private static boolean d(int i) {
            return i >= 0 && i <= eco.a.length - 1;
        }

        private void a(ecn ecnVar) {
            this.e.add(ecnVar);
            int i = ecnVar.i;
            int i2 = this.h;
            if (i > i2) {
                d();
                return;
            }
            a((this.d + i) - i2);
            int i3 = this.c + 1;
            ecn[] ecnVarArr = this.a;
            if (i3 > ecnVarArr.length) {
                ecn[] ecnVarArr2 = new ecn[ecnVarArr.length * 2];
                System.arraycopy(ecnVarArr, 0, ecnVarArr2, ecnVarArr.length, ecnVarArr.length);
                this.b = this.a.length - 1;
                this.a = ecnVarArr2;
            }
            int i4 = this.b;
            this.b = i4 - 1;
            this.a[i4] = ecnVar;
            this.c++;
            this.d += i;
        }

        private int e() throws IOException {
            return this.f.g() & 255;
        }

        private int a(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int e = e();
                if ((e & 128) == 0) {
                    return i2 + (e << i4);
                }
                i2 += (e & 127) << i4;
                i4 += 7;
            }
        }

        private edx f() throws IOException {
            int e = e();
            boolean z = (e & 128) == 128;
            int a = a(e, 127);
            if (z) {
                return edx.a(ecv.a().a(this.f.g(a)));
            }
            return this.f.d(a);
        }
    }

    /* renamed from: eco$b */
    /* loaded from: classes2.dex */
    static final class b {
        int a;
        int b;
        ecn[] c;
        int d;
        int e;
        int f;
        private final edu g;
        private final boolean h;
        private int i;
        private boolean j;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(edu eduVar) {
            this(eduVar, (byte) 0);
        }

        private b(edu eduVar, byte b) {
            this.i = Integer.MAX_VALUE;
            ecn[] ecnVarArr = new ecn[8];
            this.c = ecnVarArr;
            this.d = ecnVarArr.length - 1;
            this.e = 0;
            this.f = 0;
            this.a = 4096;
            this.b = 4096;
            this.h = true;
            this.g = eduVar;
        }

        private void a() {
            Arrays.fill(this.c, (Object) null);
            this.d = this.c.length - 1;
            this.e = 0;
            this.f = 0;
        }

        private int b(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.c.length;
                while (true) {
                    length--;
                    if (length < this.d || i <= 0) {
                        break;
                    }
                    i -= this.c[length].i;
                    this.f -= this.c[length].i;
                    this.e--;
                    i2++;
                }
                ecn[] ecnVarArr = this.c;
                int i3 = this.d;
                System.arraycopy(ecnVarArr, i3 + 1, ecnVarArr, i3 + 1 + i2, this.e);
                ecn[] ecnVarArr2 = this.c;
                int i4 = this.d;
                Arrays.fill(ecnVarArr2, i4 + 1, i4 + 1 + i2, (Object) null);
                this.d += i2;
            }
            return i2;
        }

        private void a(ecn ecnVar) {
            int i = ecnVar.i;
            int i2 = this.b;
            if (i > i2) {
                a();
                return;
            }
            b((this.f + i) - i2);
            int i3 = this.e + 1;
            ecn[] ecnVarArr = this.c;
            if (i3 > ecnVarArr.length) {
                ecn[] ecnVarArr2 = new ecn[ecnVarArr.length * 2];
                System.arraycopy(ecnVarArr, 0, ecnVarArr2, ecnVarArr.length, ecnVarArr.length);
                this.d = this.c.length - 1;
                this.c = ecnVarArr2;
            }
            int i4 = this.d;
            this.d = i4 - 1;
            this.c[i4] = ecnVar;
            this.e++;
            this.f += i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void a(List<ecn> list) throws IOException {
            int i;
            int i2;
            if (this.j) {
                int i3 = this.i;
                if (i3 < this.b) {
                    a(i3, 31, 32);
                }
                this.j = false;
                this.i = Integer.MAX_VALUE;
                a(this.b, 31, 32);
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                ecn ecnVar = list.get(i4);
                edx f = ecnVar.g.f();
                edx edxVar = ecnVar.h;
                Integer num = eco.b.get(f);
                if (num != null) {
                    i2 = num.intValue() + 1;
                    if (i2 > 1 && i2 < 8) {
                        if (Objects.equals(eco.a[i2 - 1].h, edxVar)) {
                            i = i2;
                        } else if (Objects.equals(eco.a[i2].h, edxVar)) {
                            i = i2;
                            i2++;
                        }
                    }
                    i = i2;
                    i2 = -1;
                } else {
                    i2 = -1;
                    i = -1;
                }
                if (i2 == -1) {
                    int i5 = this.d + 1;
                    int length = this.c.length;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        if (Objects.equals(this.c[i5].g, f)) {
                            if (Objects.equals(this.c[i5].h, edxVar)) {
                                i2 = eco.a.length + (i5 - this.d);
                                break;
                            } else if (i == -1) {
                                i = (i5 - this.d) + eco.a.length;
                            }
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    a(i2, 127, 128);
                } else if (i == -1) {
                    this.g.h(64);
                    a(f);
                    a(edxVar);
                    a(ecnVar);
                } else if (f.a(ecn.a) && !ecn.f.equals(f)) {
                    a(i, 15, 0);
                    a(edxVar);
                } else {
                    a(i, 63, 64);
                    a(edxVar);
                    a(ecnVar);
                }
            }
        }

        private void a(int i, int i2, int i3) {
            if (i < i2) {
                this.g.h(i | i3);
                return;
            }
            this.g.h(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.g.h(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.g.h(i4);
        }

        private void a(edx edxVar) throws IOException {
            if (this.h) {
                ecv.a();
                if (ecv.a(edxVar) < edxVar.g()) {
                    edu eduVar = new edu();
                    ecv.a();
                    ecv.a(edxVar, eduVar);
                    edx m = eduVar.m();
                    a(m.g(), 127, 128);
                    this.g.b(m);
                    return;
                }
            }
            a(edxVar.g(), 127, 0);
            this.g.b(edxVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void a(int i) {
            this.a = i;
            int min = Math.min(i, 16384);
            int i2 = this.b;
            if (i2 == min) {
                return;
            }
            if (min < i2) {
                this.i = Math.min(this.i, min);
            }
            this.j = true;
            this.b = min;
            int i3 = this.f;
            if (min >= i3) {
                return;
            }
            if (min == 0) {
                a();
            } else {
                b(i3 - min);
            }
        }
    }

    static edx a(edx edxVar) throws IOException {
        int g = edxVar.g();
        for (int i = 0; i < g; i++) {
            byte a2 = edxVar.a(i);
            if (a2 >= 65 && a2 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + edxVar.a());
            }
        }
        return edxVar;
    }
}
