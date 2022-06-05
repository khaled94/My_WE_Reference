package defpackage;

/* renamed from: hr  reason: default package */
/* loaded from: classes2.dex */
public final class hr implements ee<byte[]> {
    private final byte[] a;

    @Override // defpackage.ee
    public final void d() {
    }

    public hr(byte[] bArr) {
        this.a = (byte[]) lf.a(bArr, "Argument must not be null");
    }

    @Override // defpackage.ee
    public final Class<byte[]> a() {
        return byte[].class;
    }

    @Override // defpackage.ee
    public final int c() {
        return this.a.length;
    }

    @Override // defpackage.ee
    public final /* bridge */ /* synthetic */ byte[] b() {
        return this.a;
    }
}
