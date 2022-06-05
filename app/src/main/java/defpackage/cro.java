package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cro  reason: default package */
/* loaded from: classes2.dex */
public abstract class cro {
    static final cro a = new crm(null, 0, 0);
    final cro b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(crp crpVar, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: package-private */
    public cro(cro croVar) {
        this.b = croVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final cro a(int i, int i2) {
        return new crm(this, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final cro b(int i, int i2) {
        return new crj(this, i, i2);
    }
}
