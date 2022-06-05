package defpackage;

import java.util.LinkedList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: crn  reason: default package */
/* loaded from: classes2.dex */
public final class crn {
    static final crn a = new crn(cro.a, 0, 0, 0);
    final int b;
    final int c;
    final int d;
    private final cro e;

    private crn(cro croVar, int i, int i2, int i3) {
        this.e = croVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final crn a(int i, int i2) {
        int i3 = this.d;
        cro croVar = this.e;
        if (i != this.b) {
            int i4 = crl.b[this.b][i];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            croVar = croVar.a(i5, i6);
            i3 += i6;
        }
        int i7 = i == 2 ? 4 : 5;
        return new crn(croVar.a(i2, i7), i, 0, i3 + i7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final crn b(int i, int i2) {
        cro croVar = this.e;
        int i3 = this.b == 2 ? 4 : 5;
        return new crn(croVar.a(crl.c[this.b][i], i3).a(i2, 5), this.b, 0, this.d + i3 + 5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final crn a(int i) {
        cro croVar = this.e;
        int i2 = this.b;
        int i3 = this.d;
        if (i2 == 4 || i2 == 2) {
            int i4 = crl.b[i2][0];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            croVar = croVar.a(i5, i6);
            i3 += i6;
            i2 = 0;
        }
        int i7 = this.c;
        crn crnVar = new crn(croVar, i2, this.c + 1, i3 + ((i7 == 0 || i7 == 31) ? 18 : i7 == 62 ? 9 : 8));
        return crnVar.c == 2078 ? crnVar.b(i + 1) : crnVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final crn b(int i) {
        int i2 = this.c;
        return i2 == 0 ? this : new crn(this.e.b(i - i2, i2), this.b, 0, this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(crn crnVar) {
        int i;
        int i2 = this.d + (crl.b[this.b][crnVar.b] >> 16);
        int i3 = crnVar.c;
        if (i3 > 0 && ((i = this.c) == 0 || i > i3)) {
            i2 += 10;
        }
        return i2 <= crnVar.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final crp a(byte[] bArr) {
        LinkedList<cro> linkedList = new LinkedList();
        for (cro croVar = b(bArr.length).e; croVar != null; croVar = croVar.b) {
            linkedList.addFirst(croVar);
        }
        crp crpVar = new crp();
        for (cro croVar2 : linkedList) {
            croVar2.a(crpVar, bArr);
        }
        return crpVar;
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", crl.a[this.b], Integer.valueOf(this.d), Integer.valueOf(this.c));
    }
}
