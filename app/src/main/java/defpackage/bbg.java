package defpackage;

import com.google.android.gms.internal.places.zzaj;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bbg  reason: default package */
/* loaded from: classes.dex */
public final class bbg {
    final zzaj a;
    private final byte[] b;

    private bbg(int i) {
        byte[] bArr = new byte[i];
        this.b = bArr;
        this.a = zzaj.a(bArr);
    }

    public final bgb a() {
        if (this.a.h() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
        return new bbi(this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ bbg(int i, byte b) {
        this(i);
    }
}
