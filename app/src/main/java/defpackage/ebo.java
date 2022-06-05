package defpackage;

import java.util.Date;

/* renamed from: ebo  reason: default package */
/* loaded from: classes2.dex */
public final class ebo {
    public final eba a;
    public final ebc b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ebo(eba ebaVar, ebc ebcVar) {
        this.a = ebaVar;
        this.b = ebcVar;
    }

    /* renamed from: ebo$a */
    /* loaded from: classes2.dex */
    public static class a {
        final long a;
        final eba b;
        final ebc c;
        Date d;
        String e;
        Date f;
        String g;
        Date h;
        long i;
        long j;
        String k;
        int l;

        public a(long j, eba ebaVar, ebc ebcVar) {
            this.l = -1;
            this.a = j;
            this.b = ebaVar;
            this.c = ebcVar;
            if (ebcVar != null) {
                this.i = ebcVar.k;
                this.j = ebcVar.l;
                ear earVar = ebcVar.f;
                int length = earVar.a.length / 2;
                for (int i = 0; i < length; i++) {
                    String a = earVar.a(i);
                    String b = earVar.b(i);
                    if ("Date".equalsIgnoreCase(a)) {
                        this.d = ecd.a(b);
                        this.e = b;
                    } else if ("Expires".equalsIgnoreCase(a)) {
                        this.h = ecd.a(b);
                    } else if ("Last-Modified".equalsIgnoreCase(a)) {
                        this.f = ecd.a(b);
                        this.g = b;
                    } else if ("ETag".equalsIgnoreCase(a)) {
                        this.k = b;
                    } else if ("Age".equalsIgnoreCase(a)) {
                        this.l = ece.b(b, -1);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
        if (r3.l().f == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(defpackage.ebc r3, defpackage.eba r4) {
        /*
            int r0 = r3.c
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L51
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L51
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L51
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L51
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L51
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L51
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L2f
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L51
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L51
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L51
            switch(r0) {
                case 300: goto L51;
                case 301: goto L51;
                case 302: goto L2f;
                default: goto L2e;
            }
        L2e:
            goto L50
        L2f:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.a(r0)
            if (r0 != 0) goto L51
            eac r0 = r3.l()
            int r0 = r0.e
            r1 = -1
            if (r0 != r1) goto L51
            eac r0 = r3.l()
            boolean r0 = r0.g
            if (r0 != 0) goto L51
            eac r0 = r3.l()
            boolean r0 = r0.f
            if (r0 != 0) goto L51
        L50:
            return r2
        L51:
            eac r3 = r3.l()
            boolean r3 = r3.d
            if (r3 != 0) goto L63
            eac r3 = r4.f()
            boolean r3 = r3.d
            if (r3 != 0) goto L63
            r3 = 1
            return r3
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebo.a(ebc, eba):boolean");
    }
}
