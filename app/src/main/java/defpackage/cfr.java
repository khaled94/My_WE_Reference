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
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: cfr  reason: default package */
/* loaded from: classes2.dex */
public final class cfr extends cgh {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final String e;
    private final byte[] f;

    @Override // defpackage.cgh, defpackage.byd
    public final /* bridge */ /* synthetic */ InputStream a(InputStream inputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        return super.a(inputStream, bArr);
    }

    @Override // defpackage.cgh, defpackage.byd
    public final /* bridge */ /* synthetic */ OutputStream a(OutputStream outputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        return super.a(outputStream, bArr);
    }

    public cfr(byte[] bArr, String str, int i, int i2) throws InvalidAlgorithmParameterException {
        if (bArr.length < 16 || bArr.length < i) {
            throw new InvalidAlgorithmParameterException("ikm too short, must be >= " + Math.max(16, i));
        }
        cgs.a(i);
        if (i2 <= c() + 0 + 16) {
            throw new InvalidAlgorithmParameterException("ciphertextSegmentSize too small");
        }
        this.f = Arrays.copyOf(bArr, bArr.length);
        this.e = str;
        this.a = i;
        this.b = i2;
        this.d = 0;
        this.c = i2 - 16;
    }

    @Override // defpackage.cgh
    public final int b() {
        return this.c;
    }

    @Override // defpackage.cgh
    public final int a() {
        return this.b;
    }

    @Override // defpackage.cgh
    public final int c() {
        return this.a + 1 + 7;
    }

    @Override // defpackage.cgh
    public final int d() {
        return c() + this.d;
    }

    /* renamed from: cfr$b */
    /* loaded from: classes2.dex */
    class b implements cgo {
        private final SecretKeySpec b;
        private final Cipher c = cfr.f();
        private final byte[] d = cgm.a(7);
        private final ByteBuffer e;
        private long f;

        public b(byte[] bArr) throws GeneralSecurityException {
            this.f = 0L;
            this.f = 0L;
            byte[] a = cfr.a(cfr.this);
            ByteBuffer allocate = ByteBuffer.allocate(cfr.this.c());
            this.e = allocate;
            allocate.put((byte) cfr.this.c());
            this.e.put(a);
            this.e.put(this.d);
            this.e.flip();
            this.b = cfr.a(cfr.this, a, bArr);
        }

        @Override // defpackage.cgo
        public final ByteBuffer a() {
            return this.e.asReadOnlyBuffer();
        }

        @Override // defpackage.cgo
        public final synchronized void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
            this.c.init(1, this.b, cfr.a(this.d, this.f, true));
            this.f++;
            this.c.doFinal(byteBuffer, byteBuffer2);
        }

        @Override // defpackage.cgo
        public final synchronized void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) throws GeneralSecurityException {
            this.c.init(1, this.b, cfr.a(this.d, this.f, false));
            this.f++;
            if (byteBuffer2.hasRemaining()) {
                this.c.update(byteBuffer, byteBuffer3);
                this.c.doFinal(byteBuffer2, byteBuffer3);
                return;
            }
            this.c.doFinal(byteBuffer, byteBuffer3);
        }
    }

    /* renamed from: cfr$a */
    /* loaded from: classes2.dex */
    class a implements cgn {
        private SecretKeySpec b;
        private Cipher c;
        private byte[] d;

        a() {
        }

        @Override // defpackage.cgn
        public final synchronized void a(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
            if (byteBuffer.remaining() != cfr.this.c()) {
                throw new InvalidAlgorithmParameterException("Invalid header length");
            }
            if (byteBuffer.get() != cfr.this.c()) {
                throw new GeneralSecurityException("Invalid ciphertext");
            }
            this.d = new byte[7];
            byte[] bArr2 = new byte[cfr.this.a];
            byteBuffer.get(bArr2);
            byteBuffer.get(this.d);
            this.b = cfr.a(cfr.this, bArr2, bArr);
            this.c = cfr.f();
        }

        @Override // defpackage.cgn
        public final synchronized void a(ByteBuffer byteBuffer, int i, boolean z, ByteBuffer byteBuffer2) throws GeneralSecurityException {
            this.c.init(2, this.b, cfr.a(this.d, i, z));
            this.c.doFinal(byteBuffer, byteBuffer2);
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
        return cgc.a.a("AES/GCM/NoPadding");
    }

    static /* synthetic */ byte[] a(cfr cfrVar) {
        return cgm.a(cfrVar.a);
    }

    static /* synthetic */ SecretKeySpec a(cfr cfrVar, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return new SecretKeySpec(cgf.a(cfrVar.e, cfrVar.f, bArr, bArr2, cfrVar.a), "AES");
    }

    static /* synthetic */ GCMParameterSpec a(byte[] bArr, long j, boolean z) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(12);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.put(bArr);
        cgr.a(allocate, j);
        allocate.put(z ? (byte) 1 : (byte) 0);
        return new GCMParameterSpec(128, allocate.array());
    }
}
