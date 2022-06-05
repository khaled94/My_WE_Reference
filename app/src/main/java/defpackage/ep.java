package defpackage;

/* renamed from: ep  reason: default package */
/* loaded from: classes2.dex */
public final class ep implements ej<byte[]> {
    @Override // defpackage.ej
    public final String a() {
        return "ByteArrayPool";
    }

    @Override // defpackage.ej
    public final int b() {
        return 1;
    }

    @Override // defpackage.ej
    public final /* bridge */ /* synthetic */ int a(byte[] bArr) {
        return bArr.length;
    }

    @Override // defpackage.ej
    public final /* bridge */ /* synthetic */ byte[] a(int i) {
        return new byte[i];
    }
}
