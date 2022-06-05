package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: eac  reason: default package */
/* loaded from: classes2.dex */
public final class eac {
    public static final eac a;
    public static final eac b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;
    public final boolean k;
    String l;
    private final int m;
    private final boolean n;
    private final boolean o;

    static {
        a aVar = new a();
        aVar.a = true;
        a = aVar.a();
        a aVar2 = new a();
        aVar2.f = true;
        long seconds = TimeUnit.SECONDS.toSeconds(2147483647L);
        aVar2.d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
        b = aVar2.a();
    }

    private eac(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.c = z;
        this.d = z2;
        this.e = i;
        this.m = i2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = i3;
        this.j = i4;
        this.k = z6;
        this.n = z7;
        this.o = z8;
        this.l = str;
    }

    eac(a aVar) {
        this.c = aVar.a;
        this.d = aVar.b;
        this.e = aVar.c;
        this.m = -1;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = aVar.d;
        this.j = aVar.e;
        this.k = aVar.f;
        this.n = aVar.g;
        this.o = aVar.h;
    }

    public final String toString() {
        String str;
        String str2 = this.l;
        if (str2 != null) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        if (this.c) {
            sb.append("no-cache, ");
        }
        if (this.d) {
            sb.append("no-store, ");
        }
        if (this.e != -1) {
            sb.append("max-age=");
            sb.append(this.e);
            sb.append(", ");
        }
        if (this.m != -1) {
            sb.append("s-maxage=");
            sb.append(this.m);
            sb.append(", ");
        }
        if (this.f) {
            sb.append("private, ");
        }
        if (this.g) {
            sb.append("public, ");
        }
        if (this.h) {
            sb.append("must-revalidate, ");
        }
        if (this.i != -1) {
            sb.append("max-stale=");
            sb.append(this.i);
            sb.append(", ");
        }
        if (this.j != -1) {
            sb.append("min-fresh=");
            sb.append(this.j);
            sb.append(", ");
        }
        if (this.k) {
            sb.append("only-if-cached, ");
        }
        if (this.n) {
            sb.append("no-transform, ");
        }
        if (this.o) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            str = "";
        } else {
            sb.delete(sb.length() - 2, sb.length());
            str = sb.toString();
        }
        this.l = str;
        return str;
    }

    /* renamed from: eac$a */
    /* loaded from: classes2.dex */
    public static final class a {
        boolean a;
        boolean b;
        int c = -1;
        int d = -1;
        int e = -1;
        boolean f;
        boolean g;
        boolean h;

        public final eac a() {
            return new eac(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.eac a(defpackage.ear r22) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eac.a(ear):eac");
    }
}
