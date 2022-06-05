package defpackage;

/* renamed from: eej  reason: default package */
/* loaded from: classes2.dex */
final class eej {
    final byte[] a;
    int b;
    int c;
    boolean d;
    boolean e;
    eej f;
    eej g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public eej() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public eej(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = true;
        this.e = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final eej a() {
        this.d = true;
        return new eej(this.a, this.b, this.c);
    }

    public final eej b() {
        eej eejVar = this.f;
        if (eejVar == this) {
            eejVar = null;
        }
        eej eejVar2 = this.g;
        eejVar2.f = this.f;
        this.f.g = eejVar2;
        this.f = null;
        this.g = null;
        return eejVar;
    }

    public final eej a(eej eejVar) {
        eejVar.g = this;
        eejVar.f = this.f;
        this.f.g = eejVar;
        this.f = eejVar;
        return eejVar;
    }

    public final void a(eej eejVar, int i) {
        if (!eejVar.e) {
            throw new IllegalArgumentException();
        }
        int i2 = eejVar.c;
        if (i2 + i > 8192) {
            if (eejVar.d) {
                throw new IllegalArgumentException();
            }
            int i3 = eejVar.b;
            if ((i2 + i) - i3 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = eejVar.a;
            System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
            eejVar.c -= eejVar.b;
            eejVar.b = 0;
        }
        System.arraycopy(this.a, this.b, eejVar.a, eejVar.c, i);
        eejVar.c += i;
        this.b += i;
    }
}
