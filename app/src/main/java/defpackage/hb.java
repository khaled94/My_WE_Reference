package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* renamed from: hb  reason: default package */
/* loaded from: classes2.dex */
final class hb {
    private static final en a = new eo() { // from class: hb.1
        @Override // defpackage.eo, defpackage.en
        public final void a(Bitmap bitmap) {
        }
    };

    private hb() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ee<Bitmap> a(en enVar, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            bitmap = b(enVar, current, i, i2);
            z = true;
        } else {
            bitmap = null;
        }
        if (!z) {
            enVar = a;
        }
        return gt.a(bitmap, enVar);
    }

    private static Bitmap b(en enVar, Drawable drawable, int i, int i2) {
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                StringBuilder sb = new StringBuilder("Unable to draw ");
                sb.append(drawable);
                sb.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        } else if (i2 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                StringBuilder sb2 = new StringBuilder("Unable to draw ");
                sb2.append(drawable);
                sb2.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        } else {
            if (drawable.getIntrinsicWidth() > 0) {
                i = drawable.getIntrinsicWidth();
            }
            if (drawable.getIntrinsicHeight() > 0) {
                i2 = drawable.getIntrinsicHeight();
            }
            Lock a2 = hn.a();
            a2.lock();
            Bitmap a3 = enVar.a(i, i2, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(a3);
                drawable.setBounds(0, 0, i, i2);
                drawable.draw(canvas);
                canvas.setBitmap(null);
                return a3;
            } finally {
                a2.unlock();
            }
        }
    }
}
