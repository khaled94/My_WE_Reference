package defpackage;

import defpackage.ata;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: auv  reason: default package */
/* loaded from: classes.dex */
public final class auv implements aug {
    final aui a;
    final String b;
    final Object[] c;
    private final int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public auv(aui auiVar, String str, Object[] objArr) {
        this.a = auiVar;
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

    @Override // defpackage.aug
    public final aui c() {
        return this.a;
    }

    @Override // defpackage.aug
    public final int a() {
        return (this.d & 1) == 1 ? ata.d.h : ata.d.i;
    }

    @Override // defpackage.aug
    public final boolean b() {
        return (this.d & 2) == 2;
    }
}
