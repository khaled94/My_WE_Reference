package defpackage;

import com.google.android.gms.internal.places.zzbk;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bbk  reason: default package */
/* loaded from: classes2.dex */
public final class bbk extends bbj {
    private final byte[] a;
    private final boolean b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;

    private bbk(byte[] bArr, int i) {
        super((byte) 0);
        this.g = Integer.MAX_VALUE;
        this.a = bArr;
        this.c = i + 0;
        this.e = 0;
        this.f = 0;
        this.b = false;
    }

    @Override // defpackage.bbj
    public final int a(int i) throws zzbk {
        if (i < 0) {
            throw zzbk.b();
        }
        int a = i + a();
        int i2 = this.g;
        if (a > i2) {
            throw zzbk.a();
        }
        this.g = a;
        int i3 = this.c + this.d;
        this.c = i3;
        int i4 = i3 - this.f;
        if (i4 > a) {
            int i5 = i4 - a;
            this.d = i5;
            this.c = i3 - i5;
        } else {
            this.d = 0;
        }
        return i2;
    }

    @Override // defpackage.bbj
    public final int a() {
        return this.e - this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ bbk(byte[] bArr, int i, byte b) {
        this(bArr, i);
    }
}
