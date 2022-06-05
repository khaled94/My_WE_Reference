package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import defpackage.cu;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: dh  reason: default package */
/* loaded from: classes2.dex */
public final class dh implements cu<InputStream> {
    private final Uri a;
    private final dj b;
    private InputStream c;

    @Override // defpackage.cu
    public final void c() {
    }

    public static dh a(Context context, Uri uri, di diVar) {
        return new dh(uri, new dj(bo.a(context).c.a(), diVar, bo.a(context).d, context.getContentResolver()));
    }

    private dh(Uri uri, dj djVar) {
        this.a = uri;
        this.b = djVar;
    }

    @Override // defpackage.cu
    public final void b() {
        InputStream inputStream = this.c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.cu
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // defpackage.cu
    public final cf d() {
        return cf.LOCAL;
    }

    /* renamed from: dh$b */
    /* loaded from: classes2.dex */
    public static class b implements di {
        private static final String[] b = {"_data"};
        private final ContentResolver a;

        public b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // defpackage.di
        public final Cursor a(Uri uri) {
            return this.a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* renamed from: dh$a */
    /* loaded from: classes2.dex */
    public static class a implements di {
        private static final String[] b = {"_data"};
        private final ContentResolver a;

        public a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // defpackage.di
        public final Cursor a(Uri uri) {
            return this.a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    @Override // defpackage.cu
    public final void a(bt btVar, cu.a<? super InputStream> aVar) {
        try {
            InputStream b2 = this.b.b(this.a);
            int a2 = b2 != null ? this.b.a(this.a) : -1;
            if (a2 != -1) {
                b2 = new cx(b2, a2);
            }
            this.c = b2;
            aVar.a((cu.a<? super InputStream>) b2);
        } catch (FileNotFoundException e) {
            aVar.a((Exception) e);
        }
    }
}
