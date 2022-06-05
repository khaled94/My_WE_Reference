package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0004H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0005H\u0087\b¨\u0006\u0006"}, d2 = {"toAdaptiveIcon", "Landroid/graphics/drawable/Icon;", "Landroid/graphics/Bitmap;", "toIcon", "Landroid/net/Uri;", "", "core-ktx_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class IconKt {
    public static final Icon toAdaptiveIcon(Bitmap bitmap) {
        dqc.d(bitmap, "<this>");
        Icon createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(bitmap);
        dqc.b(createWithAdaptiveBitmap, "createWithAdaptiveBitmap(this)");
        return createWithAdaptiveBitmap;
    }

    public static final Icon toIcon(Bitmap bitmap) {
        dqc.d(bitmap, "<this>");
        Icon createWithBitmap = Icon.createWithBitmap(bitmap);
        dqc.b(createWithBitmap, "createWithBitmap(this)");
        return createWithBitmap;
    }

    public static final Icon toIcon(Uri uri) {
        dqc.d(uri, "<this>");
        Icon createWithContentUri = Icon.createWithContentUri(uri);
        dqc.b(createWithContentUri, "createWithContentUri(this)");
        return createWithContentUri;
    }

    public static final Icon toIcon(byte[] bArr) {
        dqc.d(bArr, "<this>");
        Icon createWithData = Icon.createWithData(bArr, 0, bArr.length);
        dqc.b(createWithData, "createWithData(this, 0, size)");
        return createWithData;
    }
}
