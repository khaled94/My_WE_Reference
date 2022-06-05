package defpackage;

import defpackage.eap;
import defpackage.ear;
import defpackage.eas;
import defpackage.eav;
import defpackage.eba;
import java.io.IOException;
import java.util.regex.Pattern;

/* renamed from: efl  reason: default package */
/* loaded from: classes2.dex */
final class efl {
    String b;
    final eba.a c = new eba.a();
    final ear.a d;
    eav.a e;
    ebb f;
    private final String h;
    private final eas i;
    private eas.a j;
    private eau k;
    private final boolean l;
    private eap.a m;
    private static final char[] g = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    static final Pattern a = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: Access modifiers changed from: package-private */
    public efl(String str, eas easVar, String str2, ear earVar, eau eauVar, boolean z, boolean z2, boolean z3) {
        this.h = str;
        this.i = easVar;
        this.b = str2;
        this.k = eauVar;
        this.l = z;
        if (earVar != null) {
            this.d = earVar.b();
        } else {
            this.d = new ear.a();
        }
        if (z2) {
            this.m = new eap.a();
        } else if (!z3) {
        } else {
            eav.a aVar = new eav.a();
            this.e = aVar;
            aVar.a(eav.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.k = eau.a(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Malformed content type: ".concat(String.valueOf(str2)), e);
            }
        }
        this.d.a(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt >= 32 && codePointAt < 127 && " \"<>^`{}|\\?#".indexOf(codePointAt) == -1 && (z || (codePointAt != 47 && codePointAt != 37))) {
                i += Character.charCount(codePointAt);
            } else {
                edu eduVar = new edu();
                eduVar.a(str, 0, i);
                edu eduVar2 = null;
                while (i < length) {
                    int codePointAt2 = str.codePointAt(i);
                    if (!z || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 < 32 || codePointAt2 >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt2) != -1 || (!z && (codePointAt2 == 47 || codePointAt2 == 37))) {
                            if (eduVar2 == null) {
                                eduVar2 = new edu();
                            }
                            eduVar2.a(codePointAt2);
                            while (!eduVar2.d()) {
                                int g2 = eduVar2.g() & 255;
                                eduVar.h(37);
                                eduVar.h((int) g[(g2 >> 4) & 15]);
                                eduVar.h((int) g[g2 & 15]);
                            }
                        } else {
                            eduVar.a(codePointAt2);
                        }
                    }
                    i += Character.charCount(codePointAt2);
                }
                return eduVar.n();
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, String str2, boolean z) {
        String str3 = this.b;
        if (str3 != null) {
            eas.a d = this.i.d(str3);
            this.j = d;
            if (d == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.i + ", Relative: " + this.b);
            }
            this.b = null;
        }
        if (z) {
            this.j.b(str, str2);
        } else {
            this.j.a(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(String str, String str2, boolean z) {
        if (z) {
            this.m.b(str, str2);
        } else {
            this.m.a(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ear earVar, ebb ebbVar) {
        this.e.a(earVar, ebbVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final eba.a a() {
        eas easVar;
        eas.a aVar = this.j;
        if (aVar != null) {
            easVar = aVar.b();
        } else {
            easVar = this.i.c(this.b);
            if (easVar == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.i + ", Relative: " + this.b);
            }
        }
        a aVar2 = this.f;
        if (aVar2 == null) {
            eap.a aVar3 = this.m;
            if (aVar3 == null) {
                eav.a aVar4 = this.e;
                if (aVar4 != null) {
                    aVar2 = aVar4.a();
                } else if (this.l) {
                    aVar2 = ebb.a(new byte[0]);
                }
            } else {
                aVar2 = new eap(aVar3.a, aVar3.b);
            }
        }
        eau eauVar = this.k;
        if (eauVar != null) {
            if (aVar2 != null) {
                aVar2 = new a(aVar2, eauVar);
            } else {
                this.d.a("Content-Type", eauVar.toString());
            }
        }
        return this.c.a(easVar).a(this.d.a()).a(this.h, aVar2);
    }

    /* renamed from: efl$a */
    /* loaded from: classes2.dex */
    static class a extends ebb {
        private final ebb a;
        private final eau b;

        a(ebb ebbVar, eau eauVar) {
            this.a = ebbVar;
            this.b = eauVar;
        }

        @Override // defpackage.ebb
        public final eau a() {
            return this.b;
        }

        @Override // defpackage.ebb
        public final long b() throws IOException {
            return this.a.b();
        }

        @Override // defpackage.ebb
        public final void a(edv edvVar) throws IOException {
            this.a.a(edvVar);
        }
    }
}
