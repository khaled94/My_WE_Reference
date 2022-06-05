package defpackage;

import android.util.Base64;
import defpackage.cu;
import defpackage.fw;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: fn  reason: default package */
/* loaded from: classes2.dex */
public final class fn<Model, Data> implements fw<Model, Data> {
    private final a<Data> a;

    /* renamed from: fn$a */
    /* loaded from: classes2.dex */
    public interface a<Data> {
        Class<Data> a();

        Data a(String str) throws IllegalArgumentException;

        void a(Data data) throws IOException;
    }

    public fn(a<Data> aVar) {
        this.a = aVar;
    }

    @Override // defpackage.fw
    public final fw.a<Data> a(Model model, int i, int i2, cm cmVar) {
        return new fw.a<>(new ku(model), new b(model.toString(), this.a));
    }

    @Override // defpackage.fw
    public final boolean a(Model model) {
        return model.toString().startsWith("data:image");
    }

    /* renamed from: fn$b */
    /* loaded from: classes2.dex */
    static final class b<Data> implements cu<Data> {
        private final String a;
        private final a<Data> b;
        private Data c;

        @Override // defpackage.cu
        public final void c() {
        }

        b(String str, a<Data> aVar) {
            this.a = str;
            this.b = aVar;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, Data] */
        @Override // defpackage.cu
        public final void a(bt btVar, cu.a<? super Data> aVar) {
            try {
                Data a = this.b.a(this.a);
                this.c = a;
                aVar.a((cu.a<? super Data>) a);
            } catch (IllegalArgumentException e) {
                aVar.a((Exception) e);
            }
        }

        @Override // defpackage.cu
        public final void b() {
            try {
                this.b.a((a<Data>) this.c);
            } catch (IOException unused) {
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

    /* renamed from: fn$c */
    /* loaded from: classes2.dex */
    public static final class c<Model> implements fx<Model, InputStream> {
        private final a<InputStream> a = new a<InputStream>() { // from class: fn.c.1
            @Override // defpackage.fn.a
            public final /* synthetic */ void a(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // defpackage.fn.a
            public final Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // defpackage.fn.a
            public final /* synthetic */ InputStream a(String str) throws IllegalArgumentException {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int indexOf = str.indexOf(44);
                if (indexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (!str.substring(0, indexOf).endsWith(";base64")) {
                    throw new IllegalArgumentException("Not a base64 image data URL.");
                }
                return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
            }
        };

        @Override // defpackage.fx
        public final fw<Model, InputStream> a(ga gaVar) {
            return new fn(this.a);
        }
    }
}
