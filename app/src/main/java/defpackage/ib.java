package defpackage;

import android.graphics.Bitmap;
import defpackage.ca;

/* renamed from: ib  reason: default package */
/* loaded from: classes2.dex */
public final class ib implements ca.a {
    private final en a;
    private final ek b;

    public ib(en enVar, ek ekVar) {
        this.a = enVar;
        this.b = ekVar;
    }

    @Override // defpackage.ca.a
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        return this.a.b(i, i2, config);
    }

    @Override // defpackage.ca.a
    public final void a(Bitmap bitmap) {
        this.a.a(bitmap);
    }

    @Override // defpackage.ca.a
    public final byte[] a(int i) {
        ek ekVar = this.b;
        if (ekVar == null) {
            return new byte[i];
        }
        return (byte[]) ekVar.a(i, byte[].class);
    }

    @Override // defpackage.ca.a
    public final void a(byte[] bArr) {
        ek ekVar = this.b;
        if (ekVar == null) {
            return;
        }
        ekVar.a((ek) bArr);
    }

    @Override // defpackage.ca.a
    public final int[] b(int i) {
        ek ekVar = this.b;
        if (ekVar == null) {
            return new int[i];
        }
        return (int[]) ekVar.a(i, int[].class);
    }

    @Override // defpackage.ca.a
    public final void a(int[] iArr) {
        ek ekVar = this.b;
        if (ekVar == null) {
            return;
        }
        ekVar.a((ek) iArr);
    }
}
