package defpackage;

import defpackage.cu;
import defpackage.fw;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: fk  reason: default package */
/* loaded from: classes2.dex */
public final class fk<Data> implements fw<byte[], Data> {
    private final b<Data> a;

    /* renamed from: fk$b */
    /* loaded from: classes2.dex */
    public interface b<Data> {
        Class<Data> a();

        Data a(byte[] bArr);
    }

    @Override // defpackage.fw
    public final /* bridge */ /* synthetic */ boolean a(byte[] bArr) {
        return true;
    }

    @Override // defpackage.fw
    public final /* synthetic */ fw.a a(byte[] bArr, int i, int i2, cm cmVar) {
        byte[] bArr2 = bArr;
        return new fw.a(new ku(bArr2), new c(bArr2, this.a));
    }

    public fk(b<Data> bVar) {
        this.a = bVar;
    }

    /* renamed from: fk$c */
    /* loaded from: classes2.dex */
    static class c<Data> implements cu<Data> {
        private final byte[] a;
        private final b<Data> b;

        @Override // defpackage.cu
        public final void b() {
        }

        @Override // defpackage.cu
        public final void c() {
        }

        c(byte[] bArr, b<Data> bVar) {
            this.a = bArr;
            this.b = bVar;
        }

        @Override // defpackage.cu
        public final void a(bt btVar, cu.a<? super Data> aVar) {
            aVar.a((cu.a<? super Data>) ((Data) this.b.a(this.a)));
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

    /* renamed from: fk$a */
    /* loaded from: classes2.dex */
    public static class a implements fx<byte[], ByteBuffer> {
        @Override // defpackage.fx
        public final fw<byte[], ByteBuffer> a(ga gaVar) {
            return new fk(new b<ByteBuffer>() { // from class: fk.a.1
                @Override // defpackage.fk.b
                public final Class<ByteBuffer> a() {
                    return ByteBuffer.class;
                }

                @Override // defpackage.fk.b
                public final /* synthetic */ ByteBuffer a(byte[] bArr) {
                    return ByteBuffer.wrap(bArr);
                }
            });
        }
    }

    /* renamed from: fk$d */
    /* loaded from: classes2.dex */
    public static class d implements fx<byte[], InputStream> {
        @Override // defpackage.fx
        public final fw<byte[], InputStream> a(ga gaVar) {
            return new fk(new b<InputStream>() { // from class: fk.d.1
                @Override // defpackage.fk.b
                public final Class<InputStream> a() {
                    return InputStream.class;
                }

                @Override // defpackage.fk.b
                public final /* synthetic */ InputStream a(byte[] bArr) {
                    return new ByteArrayInputStream(bArr);
                }
            });
        }
    }
}
