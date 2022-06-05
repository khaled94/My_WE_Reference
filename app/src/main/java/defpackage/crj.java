package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: crj  reason: default package */
/* loaded from: classes2.dex */
public final class crj extends cro {
    private final short c;
    private final short d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public crj(cro croVar, int i, int i2) {
        super(croVar);
        this.c = (short) i;
        this.d = (short) i2;
    }

    @Override // defpackage.cro
    public final void a(crp crpVar, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.d;
            if (i < s) {
                if (i == 0 || (i == 31 && s <= 62)) {
                    crpVar.a(31, 5);
                    short s2 = this.d;
                    if (s2 > 62) {
                        crpVar.a(s2 - 31, 16);
                    } else if (i == 0) {
                        crpVar.a(Math.min((int) s2, 31), 5);
                    } else {
                        crpVar.a(s2 - 31, 5);
                    }
                }
                crpVar.a(bArr[this.c + i], 8);
                i++;
            } else {
                return;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append((int) this.c);
        sb.append("::");
        sb.append((this.c + this.d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
