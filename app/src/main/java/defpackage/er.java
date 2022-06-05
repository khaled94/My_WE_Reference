package defpackage;

/* renamed from: er  reason: default package */
/* loaded from: classes2.dex */
public final class er implements ej<int[]> {
    @Override // defpackage.ej
    public final String a() {
        return "IntegerArrayPool";
    }

    @Override // defpackage.ej
    public final int b() {
        return 4;
    }

    @Override // defpackage.ej
    public final /* bridge */ /* synthetic */ int a(int[] iArr) {
        return iArr.length;
    }

    @Override // defpackage.ej
    public final /* bridge */ /* synthetic */ int[] a(int i) {
        return new int[i];
    }
}
