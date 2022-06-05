package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: crm  reason: default package */
/* loaded from: classes2.dex */
public final class crm extends cro {
    private final short c;
    private final short d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public crm(cro croVar, int i, int i2) {
        super(croVar);
        this.c = (short) i;
        this.d = (short) i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.cro
    public final void a(crp crpVar, byte[] bArr) {
        crpVar.a(this.c, this.d);
    }

    public final String toString() {
        short s = this.c;
        short s2 = this.d;
        int i = (s & ((1 << s2) - 1)) | (1 << s2);
        return "<" + Integer.toBinaryString(i | (1 << this.d)).substring(1) + '>';
    }
}
