package defpackage;

import android.graphics.Bitmap;
import defpackage.hg;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: gv  reason: default package */
/* loaded from: classes2.dex */
public final class gv implements co<ByteBuffer, Bitmap> {
    private final ha a;

    @Override // defpackage.co
    public final /* bridge */ /* synthetic */ boolean a(ByteBuffer byteBuffer, cm cmVar) throws IOException {
        return true;
    }

    @Override // defpackage.co
    public final /* synthetic */ ee<Bitmap> a(ByteBuffer byteBuffer, int i, int i2, cm cmVar) throws IOException {
        ha haVar = this.a;
        return haVar.a(new hg.a(byteBuffer, haVar.h, haVar.g), i, i2, cmVar, ha.f);
    }

    public gv(ha haVar) {
        this.a = haVar;
    }
}
