package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* renamed from: gq  reason: default package */
/* loaded from: classes2.dex */
public final class gq implements cp<BitmapDrawable> {
    private final en a;
    private final cp<Bitmap> b;

    @Override // defpackage.ci
    public final /* synthetic */ boolean a(Object obj, File file, cm cmVar) {
        return this.b.a(new gt(((BitmapDrawable) ((ee) obj).b()).getBitmap(), this.a), file, cmVar);
    }

    public gq(en enVar, cp<Bitmap> cpVar) {
        this.a = enVar;
        this.b = cpVar;
    }

    @Override // defpackage.cp
    public final ch a(cm cmVar) {
        return this.b.a(cmVar);
    }
}
