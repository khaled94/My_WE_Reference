package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import defpackage.cu;
import defpackage.fw;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: gk  reason: default package */
/* loaded from: classes2.dex */
public final class gk<DataT> implements fw<Uri, DataT> {
    private final Context a;
    private final fw<File, DataT> b;
    private final fw<Uri, DataT> c;
    private final Class<DataT> d;

    @Override // defpackage.fw
    public final /* synthetic */ fw.a a(Uri uri, int i, int i2, cm cmVar) {
        Uri uri2 = uri;
        return new fw.a(new ku(uri2), new d(this.a, this.b, this.c, uri2, i, i2, cmVar, this.d));
    }

    @Override // defpackage.fw
    public final /* bridge */ /* synthetic */ boolean a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && dg.a(uri);
    }

    gk(Context context, fw<File, DataT> fwVar, fw<Uri, DataT> fwVar2, Class<DataT> cls) {
        this.a = context.getApplicationContext();
        this.b = fwVar;
        this.c = fwVar2;
        this.d = cls;
    }

    /* renamed from: gk$d */
    /* loaded from: classes2.dex */
    static final class d<DataT> implements cu<DataT> {
        private static final String[] a = {"_data"};
        private final Context b;
        private final fw<File, DataT> c;
        private final fw<Uri, DataT> d;
        private final Uri e;
        private final int f;
        private final int g;
        private final cm h;
        private final Class<DataT> i;
        private volatile boolean j;
        private volatile cu<DataT> k;

        d(Context context, fw<File, DataT> fwVar, fw<Uri, DataT> fwVar2, Uri uri, int i, int i2, cm cmVar, Class<DataT> cls) {
            this.b = context.getApplicationContext();
            this.c = fwVar;
            this.d = fwVar2;
            this.e = uri;
            this.f = i;
            this.g = i2;
            this.h = cmVar;
            this.i = cls;
        }

        @Override // defpackage.cu
        public final void b() {
            cu<DataT> cuVar = this.k;
            if (cuVar != null) {
                cuVar.b();
            }
        }

        @Override // defpackage.cu
        public final void c() {
            this.j = true;
            cu<DataT> cuVar = this.k;
            if (cuVar != null) {
                cuVar.c();
            }
        }

        @Override // defpackage.cu
        public final Class<DataT> a() {
            return this.i;
        }

        @Override // defpackage.cu
        public final cf d() {
            return cf.LOCAL;
        }

        private File a(Uri uri) throws FileNotFoundException {
            Cursor cursor = null;
            try {
                cursor = this.b.getContentResolver().query(uri, a, null, null, null);
                if (cursor == null || !cursor.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: ".concat(String.valueOf(uri)));
                }
                String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                if (TextUtils.isEmpty(string)) {
                    throw new FileNotFoundException("File path was empty in media store for: ".concat(String.valueOf(uri)));
                }
                return new File(string);
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }

        @Override // defpackage.cu
        public final void a(bt btVar, cu.a<? super DataT> aVar) {
            fw.a<DataT> aVar2;
            try {
                if (Environment.isExternalStorageLegacy()) {
                    aVar2 = this.c.a(a(this.e), this.f, this.g, this.h);
                } else {
                    aVar2 = this.d.a(this.b.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0 ? MediaStore.setRequireOriginal(this.e) : this.e, this.f, this.g, this.h);
                }
                cu<DataT> cuVar = aVar2 != null ? aVar2.c : null;
                if (cuVar == null) {
                    aVar.a((Exception) new IllegalArgumentException("Failed to build fetcher for: " + this.e));
                    return;
                }
                this.k = cuVar;
                if (this.j) {
                    c();
                } else {
                    cuVar.a(btVar, aVar);
                }
            } catch (FileNotFoundException e) {
                aVar.a((Exception) e);
            }
        }
    }

    /* renamed from: gk$c */
    /* loaded from: classes2.dex */
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: gk$b */
    /* loaded from: classes2.dex */
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* renamed from: gk$a */
    /* loaded from: classes2.dex */
    static abstract class a<DataT> implements fx<Uri, DataT> {
        private final Context a;
        private final Class<DataT> b;

        a(Context context, Class<DataT> cls) {
            this.a = context;
            this.b = cls;
        }

        @Override // defpackage.fx
        public final fw<Uri, DataT> a(ga gaVar) {
            return new gk(this.a, gaVar.a(File.class, this.b), gaVar.a(Uri.class, this.b), this.b);
        }
    }
}
