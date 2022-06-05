package defpackage;

import com.google.android.gms.internal.places.zzbk;

/* renamed from: bbj  reason: default package */
/* loaded from: classes2.dex */
public abstract class bbj {
    private int a;
    private int b;
    private boolean c;

    public static long a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bbj a(byte[] bArr, int i) {
        bbk bbkVar = new bbk(bArr, i, (byte) 0);
        try {
            bbkVar.a(i);
            return bbkVar;
        } catch (zzbk e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public abstract int a();

    public abstract int a(int i) throws zzbk;

    private bbj() {
        this.a = 100;
        this.b = Integer.MAX_VALUE;
        this.c = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ bbj(byte b) {
        this();
    }
}
