package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.IOException;

/* renamed from: hl  reason: default package */
/* loaded from: classes2.dex */
public final class hl implements co<Uri, Bitmap> {
    private final hw a;
    private final en b;

    @Override // defpackage.co
    public final /* synthetic */ ee<Bitmap> a(Uri uri, int i, int i2, cm cmVar) throws IOException {
        ee<Drawable> a = this.a.a(uri);
        if (a == null) {
            return null;
        }
        return hb.a(this.b, a.b(), i, i2);
    }

    @Override // defpackage.co
    public final /* synthetic */ boolean a(Uri uri, cm cmVar) throws IOException {
        return "android.resource".equals(uri.getScheme());
    }

    public hl(hw hwVar, en enVar) {
        this.a = hwVar;
        this.b = enVar;
    }
}
