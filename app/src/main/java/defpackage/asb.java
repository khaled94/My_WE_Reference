package defpackage;

import com.google.android.gms.internal.measurement.zzee;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: asb  reason: default package */
/* loaded from: classes.dex */
public final class asb {
    final zzee a;
    private final byte[] b;

    private asb(int i) {
        byte[] bArr = new byte[i];
        this.b = bArr;
        this.a = zzee.a(bArr);
    }

    public final art a() {
        this.a.j();
        return new asd(this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ asb(int i, byte b) {
        this(i);
    }
}
