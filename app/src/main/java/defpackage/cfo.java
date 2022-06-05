package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: cfo  reason: default package */
/* loaded from: classes2.dex */
public final class cfo extends cgh {
    private final int a;
    private final String b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final String g;
    private final byte[] h;

    @Override // defpackage.cgh, defpackage.byd
    public final /* bridge */ /* synthetic */ InputStream a(InputStream inputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        return super.a(inputStream, bArr);
    }

    @Override // defpackage.cgh, defpackage.byd
    public final /* bridge */ /* synthetic */ OutputStream a(OutputStream outputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        return super.a(outputStream, bArr);
    }

    public cfo(byte[] bArr, String str, int i, String str2, int i2, int i3) throws InvalidAlgorithmParameterException {
        int length = bArr.length;
        if (length < 16 || length < i) {
            throw new InvalidAlgorithmParameterException("ikm too short, must be >= " + Math.max(16, i));
        }
        cgs.a(i);
        if (i2 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small ".concat(String.valueOf(i2)));
        }
        if ((str2.equals("HmacSha1") && i2 > 20) || ((str2.equals("HmacSha256") && i2 > 32) || (str2.equals("HmacSha512") && i2 > 64))) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        if (((((i3 + 0) - i2) - i) - 7) - 1 > 0) {
            this.h = Arrays.copyOf(bArr, bArr.length);
            this.g = str;
            this.a = i;
            this.b = str2;
            this.c = i2;
            this.d = i3;
            this.f = 0;
            this.e = i3 - i2;
            return;
        }
        throw new InvalidAlgorithmParameterException("ciphertextSegmentSize too small");
    }

    @Override // defpackage.cgh
    public final int a() {
        return this.d;
    }

    @Override // defpackage.cgh
    public final int b() {
        return this.e;
    }

    @Override // defpackage.cgh
    public final int c() {
        return this.a + 1 + 7;
    }

    @Override // defpackage.cgh
    public final int d() {
        return c() + this.f;
    }

    /* renamed from: cfo$b */
    /* loaded from: classes2.dex */
    class b implements cgo {
        private final SecretKeySpec b;
        private final SecretKeySpec c;
        private final Mac e;
        private ByteBuffer g;
        private long h;
        private final Cipher d = cfo.f();
        private final byte[] f = cgm.a(7);

        public b(byte[] bArr) throws GeneralSecurityException {
            this.h = 0L;
            this.e = cfo.a(cfo.this);
            this.h = 0L;
            byte[] b = cfo.b(cfo.this);
            ByteBuffer allocate = ByteBuffer.allocate(cfo.this.c());
            this.g = allocate;
            allocate.put((byte) cfo.this.c());
            this.g.put(b);
            this.g.put(this.f);
            this.g.flip();
            byte[] a = cfo.a(cfo.this, b, bArr);
            this.b = cfo.a(cfo.this, a);
            this.c = cfo.b(cfo.this, a);
        }

        @Override // defpackage.cgo
        public final ByteBuffer a() {
            return this.g.asReadOnlyBuffer();
        }

        @Override // defpackage.cgo
        public final synchronized void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
            int position = byteBuffer2.position();
            byte[] a = cfo.a(this.f, this.h, true);
            this.d.init(1, this.b, new IvParameterSpec(a));
            this.h++;
            this.d.doFinal(byteBuffer, byteBuffer2);
            ByteBuffer duplicate = byteBuffer2.duplicate();
            duplicate.flip();
            duplicate.position(position);
            this.e.init(this.c);
            this.e.update(a);
            this.e.update(duplicate);
            byteBuffer2.put(this.e.doFinal(), 0, cfo.this.c);
        }

        @Override // defpackage.cgo
        public final synchronized void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) throws GeneralSecurityException {
            int position = byteBuffer3.position();
            byte[] a = cfo.a(this.f, this.h, false);
            this.d.init(1, this.b, new IvParameterSpec(a));
            this.h++;
            this.d.update(byteBuffer, byteBuffer3);
            this.d.doFinal(byteBuffer2, byteBuffer3);
            ByteBuffer duplicate = byteBuffer3.duplicate();
            duplicate.flip();
            duplicate.position(position);
            this.e.init(this.c);
            this.e.update(a);
            this.e.update(duplicate);
            byteBuffer3.put(this.e.doFinal(), 0, cfo.this.c);
        }
    }

    /* renamed from: cfo$a */
    /* loaded from: classes2.dex */
    class a implements cgn {
        static final /* synthetic */ boolean a = !cfo.class.desiredAssertionStatus();
        private SecretKeySpec c;
        private SecretKeySpec d;
        private Cipher e;
        private Mac f;
        private byte[] g;

        a() {
        }

        @Override // defpackage.cgn
        public final synchronized void a(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
            if (byteBuffer.remaining() != cfo.this.c()) {
                throw new InvalidAlgorithmParameterException("Invalid header length");
            }
            if (byteBuffer.get() != cfo.this.c()) {
                throw new GeneralSecurityException("Invalid ciphertext");
            }
            this.g = new byte[7];
            byte[] bArr2 = new byte[cfo.this.a];
            byteBuffer.get(bArr2);
            byteBuffer.get(this.g);
            byte[] a2 = cfo.a(cfo.this, bArr2, bArr);
            this.c = cfo.a(cfo.this, a2);
            this.d = cfo.b(cfo.this, a2);
            this.e = cfo.f();
            this.f = cfo.a(cfo.this);
        }

        @Override // defpackage.cgn
        public final synchronized void a(ByteBuffer byteBuffer, int i, boolean z, ByteBuffer byteBuffer2) throws GeneralSecurityException {
            int position = byteBuffer.position();
            byte[] a2 = cfo.a(this.g, i, z);
            int remaining = byteBuffer.remaining();
            if (remaining >= cfo.this.c) {
                int i2 = position + (remaining - cfo.this.c);
                ByteBuffer duplicate = byteBuffer.duplicate();
                duplicate.limit(i2);
                ByteBuffer duplicate2 = byteBuffer.duplicate();
                duplicate2.position(i2);
                if (!a && this.f == null) {
                    throw new AssertionError();
                }
                if (!a && this.d == null) {
                    throw new AssertionError();
                }
                this.f.init(this.d);
                this.f.update(a2);
                this.f.update(duplicate);
                byte[] copyOf = Arrays.copyOf(this.f.doFinal(), cfo.this.c);
                int i3 = cfo.this.c;
                byte[] bArr = new byte[i3];
                if (!a && duplicate2.remaining() != cfo.this.c) {
                    throw new AssertionError();
                }
                duplicate2.get(bArr);
                if (!a && i3 != copyOf.length) {
                    throw new AssertionError();
                }
                if (!cfw.a(bArr, copyOf)) {
                    throw new GeneralSecurityException("Tag mismatch");
                }
                byteBuffer.limit(i2);
                this.e.init(1, this.c, new IvParameterSpec(a2));
                this.e.doFinal(byteBuffer, byteBuffer2);
            } else {
                throw new GeneralSecurityException("Ciphertext too short");
            }
        }
    }

    @Override // defpackage.cgh
    public final /* synthetic */ cgn e() throws GeneralSecurityException {
        return new a();
    }

    @Override // defpackage.cgh
    public final /* synthetic */ cgo a(byte[] bArr) throws GeneralSecurityException {
        return new b(bArr);
    }

    static /* synthetic */ Cipher f() throws GeneralSecurityException {
        return cgc.a.a("AES/CTR/NoPadding");
    }

    static /* synthetic */ Mac a(cfo cfoVar) throws GeneralSecurityException {
        return cgc.b.a(cfoVar.b);
    }

    static /* synthetic */ byte[] b(cfo cfoVar) {
        return cgm.a(cfoVar.a);
    }

    static /* synthetic */ byte[] a(cfo cfoVar, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return cgf.a(cfoVar.g, cfoVar.h, bArr, bArr2, cfoVar.a + 32);
    }

    static /* synthetic */ SecretKeySpec a(cfo cfoVar, byte[] bArr) throws GeneralSecurityException {
        return new SecretKeySpec(bArr, 0, cfoVar.a, "AES");
    }

    static /* synthetic */ SecretKeySpec b(cfo cfoVar, byte[] bArr) throws GeneralSecurityException {
        return new SecretKeySpec(bArr, cfoVar.a, 32, cfoVar.b);
    }

    static /* synthetic */ byte[] a(byte[] bArr, long j, boolean z) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(16);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.put(bArr);
        cgr.a(allocate, j);
        allocate.put(z ? (byte) 1 : (byte) 0);
        allocate.putInt(0);
        return allocate.array();
    }
}
