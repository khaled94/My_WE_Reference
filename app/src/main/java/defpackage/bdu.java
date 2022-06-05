package defpackage;

import defpackage.bcc;

/* renamed from: bdu  reason: default package */
/* loaded from: classes2.dex */
final class bdu implements bdf {
    final bdh a;
    final String b;
    final Object[] c;
    private final int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bdu(bdh bdhVar, String str, Object[] objArr) {
        this.a = bdhVar;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.d = i | (charAt2 << i2);
                return;
            }
            i |= (charAt2 & 8191) << i2;
            i2 += 13;
            i3 = i4;
        }
    }

    @Override // defpackage.bdf
    public final bdh c() {
        return this.a;
    }

    @Override // defpackage.bdf
    public final int a() {
        return (this.d & 1) == 1 ? bcc.d.h : bcc.d.i;
    }

    @Override // defpackage.bdf
    public final boolean b() {
        return (this.d & 2) == 2;
    }
}
