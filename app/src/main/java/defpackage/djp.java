package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.ucare.we.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0014\u0010\u0006\u001a\u00020\u0007*\u0004\u0018\u00010\b2\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0014\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0014\u0010\n\u001a\u0004\u0018\u00010\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003\u001a\n\u0010\u000b\u001a\u00020\u0007*\u00020\b\u001a\u0012\u0010\f\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\r"}, d2 = {"getBitmapFromVectorDrawable", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "drawableId", "", "contactExists", "", "", "contactImage", "contactName", "isNumeric", "retrieveContactPhoto", "app_googleProductionRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* renamed from: djp  reason: default package */
/* loaded from: classes2.dex */
public final class djp {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Throwable] */
    public static final String a(String str, Context context) {
        dqc.d(str, "<this>");
        dqc.d(context, "context");
        Uri withAppendedPath = Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(str));
        dqc.b(withAppendedPath, "withAppendedPath(PhoneLookup.CONTENT_FILTER_URI, Uri.encode(this))");
        Cursor query = context.getContentResolver().query(withAppendedPath, new String[]{"_id", "number", "display_name"}, null, null, null);
        try {
            Cursor cursor = query;
            th = 0;
            if (dqc.a(cursor == null ? th : Boolean.valueOf(cursor.moveToFirst()), Boolean.TRUE)) {
                return cursor == null ? th : cursor.getString(cursor.getColumnIndex("display_name"));
            }
            dmg dmgVar = dmg.a;
            dor.a(query, th);
            return "";
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public static final Bitmap a(Context context) {
        dqc.a(context);
        Drawable drawable = ContextCompat.getDrawable(context, R.drawable.img_demo);
        if (Build.VERSION.SDK_INT < 21) {
            drawable = drawable == null ? null : DrawableCompat.wrap(drawable).mutate();
        }
        dqc.a(drawable);
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
        r8.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.graphics.Bitmap b(java.lang.String r7, android.content.Context r8) {
        /*
            java.lang.String r0 = "<this>"
            defpackage.dqc.d(r7, r0)
            java.lang.String r0 = "context"
            defpackage.dqc.d(r8, r0)
            android.content.ContentResolver r1 = r8.getContentResolver()
            android.net.Uri r0 = android.provider.ContactsContract.PhoneLookup.CONTENT_FILTER_URI
            java.lang.String r7 = android.net.Uri.encode(r7)
            android.net.Uri r2 = android.net.Uri.withAppendedPath(r0, r7)
            java.lang.String r7 = "display_name"
            java.lang.String r0 = "_id"
            java.lang.String[] r3 = new java.lang.String[]{r7, r0}
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r7 = r1.query(r2, r3, r4, r5, r6)
            r1 = 0
            if (r7 == 0) goto L3c
        L2a:
            boolean r2 = r7.moveToNext()
            if (r2 == 0) goto L39
            int r1 = r7.getColumnIndexOrThrow(r0)
            java.lang.String r1 = r7.getString(r1)
            goto L2a
        L39:
            r7.close()
        L3c:
            android.graphics.Bitmap r7 = a(r8)
            if (r7 == 0) goto L83
            if (r1 == 0) goto L82
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch: java.io.IOException -> L7e
            android.net.Uri r0 = android.provider.ContactsContract.Contacts.CONTENT_URI     // Catch: java.io.IOException -> L7e
            long r1 = java.lang.Long.parseLong(r1)     // Catch: java.io.IOException -> L7e
            android.net.Uri r0 = android.content.ContentUris.withAppendedId(r0, r1)     // Catch: java.io.IOException -> L7e
            java.io.InputStream r8 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r8, r0)     // Catch: java.io.IOException -> L7e
            if (r8 == 0) goto L62
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r8)     // Catch: java.io.IOException -> L7e
            java.lang.String r1 = "decodeStream(inputStream)"
            defpackage.dqc.b(r0, r1)     // Catch: java.io.IOException -> L7e
            r7 = r0
        L62:
            if (r8 == 0) goto L66
            r0 = 1
            goto L67
        L66:
            r0 = 0
        L67:
            boolean r1 = defpackage.dmh.a     // Catch: java.io.IOException -> L7e
            if (r1 == 0) goto L78
            if (r0 == 0) goto L6e
            goto L78
        L6e:
            java.lang.String r8 = "Assertion failed"
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.io.IOException -> L7e
            r0.<init>(r8)     // Catch: java.io.IOException -> L7e
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.io.IOException -> L7e
            throw r0     // Catch: java.io.IOException -> L7e
        L78:
            if (r8 == 0) goto L82
            r8.close()     // Catch: java.io.IOException -> L7e
            goto L82
        L7e:
            r8 = move-exception
            r8.printStackTrace()
        L82:
            return r7
        L83:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "null cannot be cast to non-null type android.graphics.Bitmap"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djp.b(java.lang.String, android.content.Context):android.graphics.Bitmap");
    }
}
