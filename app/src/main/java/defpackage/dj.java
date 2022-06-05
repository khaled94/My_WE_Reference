package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: dj  reason: default package */
/* loaded from: classes2.dex */
final class dj {
    private static final df a = new df();
    private final df b;
    private final di c;
    private final ek d;
    private final ContentResolver e;
    private final List<ImageHeaderParser> f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public dj(List<ImageHeaderParser> list, di diVar, ek ekVar, ContentResolver contentResolver) {
        this(list, a, diVar, ekVar, contentResolver);
    }

    private dj(List<ImageHeaderParser> list, df dfVar, di diVar, ek ekVar, ContentResolver contentResolver) {
        this.b = dfVar;
        this.c = diVar;
        this.d = ekVar;
        this.e = contentResolver;
        this.f = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = this.e.openInputStream(uri);
                return cj.b(this.f, inputStream, this.d);
            } catch (IOException | NullPointerException unused) {
                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                    new StringBuilder("Failed to open uri: ").append(uri);
                }
                if (inputStream == null) {
                    return -1;
                }
                try {
                    inputStream.close();
                    return -1;
                } catch (IOException unused2) {
                    return -1;
                }
            }
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
        }
    }

    public final InputStream b(Uri uri) throws FileNotFoundException {
        String c = c(uri);
        if (TextUtils.isEmpty(c)) {
            return null;
        }
        File file = new File(c);
        if (!(file.exists() && 0 < file.length())) {
            return null;
        }
        Uri fromFile = Uri.fromFile(file);
        try {
            return this.e.openInputStream(fromFile);
        } catch (NullPointerException e) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String c(android.net.Uri r5) {
        /*
            r4 = this;
            r0 = 0
            di r1 = r4.c     // Catch: java.lang.Throwable -> L20 java.lang.SecurityException -> L22
            android.database.Cursor r1 = r1.a(r5)     // Catch: java.lang.Throwable -> L20 java.lang.SecurityException -> L22
            if (r1 == 0) goto L1a
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.SecurityException -> L23 java.lang.Throwable -> L3c
            if (r2 == 0) goto L1a
            r2 = 0
            java.lang.String r5 = r1.getString(r2)     // Catch: java.lang.SecurityException -> L23 java.lang.Throwable -> L3c
            if (r1 == 0) goto L19
            r1.close()
        L19:
            return r5
        L1a:
            if (r1 == 0) goto L1f
            r1.close()
        L1f:
            return r0
        L20:
            r5 = move-exception
            goto L3e
        L22:
            r1 = r0
        L23:
            java.lang.String r2 = "ThumbStreamOpener"
            r3 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r3)     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L36
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = "Failed to query for thumbnail for Uri: "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3c
            r2.append(r5)     // Catch: java.lang.Throwable -> L3c
        L36:
            if (r1 == 0) goto L3b
            r1.close()
        L3b:
            return r0
        L3c:
            r5 = move-exception
            r0 = r1
        L3e:
            if (r0 == 0) goto L43
            r0.close()
        L43:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dj.c(android.net.Uri):java.lang.String");
    }
}
