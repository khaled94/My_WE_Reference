package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import defpackage.cu;
import defpackage.fw;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: ft  reason: default package */
/* loaded from: classes2.dex */
public final class ft implements fw<Uri, File> {
    private final Context a;

    @Override // defpackage.fw
    public final /* synthetic */ fw.a<File> a(Uri uri, int i, int i2, cm cmVar) {
        Uri uri2 = uri;
        return new fw.a<>(new ku(uri2), new b(this.a, uri2));
    }

    @Override // defpackage.fw
    public final /* bridge */ /* synthetic */ boolean a(Uri uri) {
        return dg.a(uri);
    }

    public ft(Context context) {
        this.a = context;
    }

    /* renamed from: ft$b */
    /* loaded from: classes2.dex */
    static class b implements cu<File> {
        private static final String[] a = {"_data"};
        private final Context b;
        private final Uri c;

        @Override // defpackage.cu
        public final void b() {
        }

        @Override // defpackage.cu
        public final void c() {
        }

        b(Context context, Uri uri) {
            this.b = context;
            this.c = uri;
        }

        @Override // defpackage.cu
        public final void a(bt btVar, cu.a<? super File> aVar) {
            Cursor query = this.b.getContentResolver().query(this.c, a, null, null, null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                aVar.a((Exception) new FileNotFoundException("Failed to find file path for: " + this.c));
                return;
            }
            aVar.a((cu.a<? super File>) new File(str));
        }

        @Override // defpackage.cu
        public final Class<File> a() {
            return File.class;
        }

        @Override // defpackage.cu
        public final cf d() {
            return cf.LOCAL;
        }
    }

    /* renamed from: ft$a */
    /* loaded from: classes2.dex */
    public static final class a implements fx<Uri, File> {
        private final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // defpackage.fx
        public final fw<Uri, File> a(ga gaVar) {
            return new ft(this.a);
        }
    }
}
