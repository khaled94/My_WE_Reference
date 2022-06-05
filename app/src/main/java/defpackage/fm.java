package defpackage;

import defpackage.cu;
import defpackage.fw;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: fm  reason: default package */
/* loaded from: classes2.dex */
public final class fm implements fw<File, ByteBuffer> {
    @Override // defpackage.fw
    public final /* bridge */ /* synthetic */ boolean a(File file) {
        return true;
    }

    @Override // defpackage.fw
    public final /* synthetic */ fw.a<ByteBuffer> a(File file, int i, int i2, cm cmVar) {
        File file2 = file;
        return new fw.a<>(new ku(file2), new a(file2));
    }

    /* renamed from: fm$b */
    /* loaded from: classes2.dex */
    public static class b implements fx<File, ByteBuffer> {
        @Override // defpackage.fx
        public final fw<File, ByteBuffer> a(ga gaVar) {
            return new fm();
        }
    }

    /* renamed from: fm$a */
    /* loaded from: classes2.dex */
    static final class a implements cu<ByteBuffer> {
        private final File a;

        @Override // defpackage.cu
        public final void b() {
        }

        @Override // defpackage.cu
        public final void c() {
        }

        a(File file) {
            this.a = file;
        }

        @Override // defpackage.cu
        public final void a(bt btVar, cu.a<? super ByteBuffer> aVar) {
            try {
                aVar.a((cu.a<? super ByteBuffer>) kv.a(this.a));
            } catch (IOException e) {
                aVar.a((Exception) e);
            }
        }

        @Override // defpackage.cu
        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // defpackage.cu
        public final cf d() {
            return cf.LOCAL;
        }
    }
}
