package defpackage;

import android.os.ParcelFileDescriptor;
import defpackage.cu;
import defpackage.fw;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: fo  reason: default package */
/* loaded from: classes2.dex */
public final class fo<Data> implements fw<File, Data> {
    private final d<Data> a;

    /* renamed from: fo$d */
    /* loaded from: classes2.dex */
    public interface d<Data> {
        Class<Data> a();

        Data a(File file) throws FileNotFoundException;

        void a(Data data) throws IOException;
    }

    @Override // defpackage.fw
    public final /* bridge */ /* synthetic */ boolean a(File file) {
        return true;
    }

    @Override // defpackage.fw
    public final /* synthetic */ fw.a a(File file, int i, int i2, cm cmVar) {
        File file2 = file;
        return new fw.a(new ku(file2), new c(file2, this.a));
    }

    public fo(d<Data> dVar) {
        this.a = dVar;
    }

    /* renamed from: fo$c */
    /* loaded from: classes2.dex */
    static final class c<Data> implements cu<Data> {
        private final File a;
        private final d<Data> b;
        private Data c;

        @Override // defpackage.cu
        public final void c() {
        }

        c(File file, d<Data> dVar) {
            this.a = file;
            this.b = dVar;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, Data] */
        @Override // defpackage.cu
        public final void a(bt btVar, cu.a<? super Data> aVar) {
            try {
                Data a = this.b.a(this.a);
                this.c = a;
                aVar.a((cu.a<? super Data>) a);
            } catch (FileNotFoundException e) {
                aVar.a((Exception) e);
            }
        }

        @Override // defpackage.cu
        public final void b() {
            Data data = this.c;
            if (data != null) {
                try {
                    this.b.a((d<Data>) data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // defpackage.cu
        public final Class<Data> a() {
            return this.b.a();
        }

        @Override // defpackage.cu
        public final cf d() {
            return cf.LOCAL;
        }
    }

    /* renamed from: fo$a */
    /* loaded from: classes2.dex */
    public static class a<Data> implements fx<File, Data> {
        private final d<Data> a;

        public a(d<Data> dVar) {
            this.a = dVar;
        }

        @Override // defpackage.fx
        public final fw<File, Data> a(ga gaVar) {
            return new fo(this.a);
        }
    }

    /* renamed from: fo$e */
    /* loaded from: classes2.dex */
    public static class e extends a<InputStream> {
        public e() {
            super(new d<InputStream>() { // from class: fo.e.1
                @Override // defpackage.fo.d
                public final /* synthetic */ void a(InputStream inputStream) throws IOException {
                    inputStream.close();
                }

                @Override // defpackage.fo.d
                public final Class<InputStream> a() {
                    return InputStream.class;
                }

                @Override // defpackage.fo.d
                public final /* synthetic */ InputStream a(File file) throws FileNotFoundException {
                    return new FileInputStream(file);
                }
            });
        }
    }

    /* renamed from: fo$b */
    /* loaded from: classes2.dex */
    public static class b extends a<ParcelFileDescriptor> {
        public b() {
            super(new d<ParcelFileDescriptor>() { // from class: fo.b.1
                @Override // defpackage.fo.d
                public final /* synthetic */ void a(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                    parcelFileDescriptor.close();
                }

                @Override // defpackage.fo.d
                public final Class<ParcelFileDescriptor> a() {
                    return ParcelFileDescriptor.class;
                }

                @Override // defpackage.fo.d
                public final /* synthetic */ ParcelFileDescriptor a(File file) throws FileNotFoundException {
                    return ParcelFileDescriptor.open(file, SQLiteDatabase.CREATE_IF_NECESSARY);
                }
            });
        }
    }
}
