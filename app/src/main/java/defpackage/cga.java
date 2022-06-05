package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.AEADBadTagException;

/* renamed from: cga  reason: default package */
/* loaded from: classes2.dex */
abstract class cga implements bxm {
    private final cfy a;
    private final cfy b;

    abstract cfy a(byte[] bArr, int i) throws InvalidKeyException;

    public cga(byte[] bArr) throws InvalidKeyException {
        this.a = a(bArr, 1);
        this.b = a(bArr, 0);
    }

    @Override // defpackage.bxm
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > (Integer.MAX_VALUE - this.a.a()) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + this.a.a() + 16);
        if (allocate.remaining() < bArr.length + this.a.a() + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int position = allocate.position();
        this.a.a(allocate, bArr);
        allocate.position(position);
        byte[] bArr3 = new byte[this.a.a()];
        allocate.get(bArr3);
        allocate.limit(allocate.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] a = cgi.a(a(bArr3), a(bArr2, allocate));
        allocate.limit(allocate.limit() + 16);
        allocate.put(a);
        return allocate.array();
    }

    @Override // defpackage.bxm
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return a(ByteBuffer.wrap(bArr), bArr2);
    }

    private byte[] a(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
        if (byteBuffer.remaining() < this.a.a() + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int position = byteBuffer.position();
        byte[] bArr2 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr2);
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        byte[] bArr3 = new byte[this.a.a()];
        byteBuffer.get(bArr3);
        if (bArr == null) {
            bArr = new byte[0];
        }
        try {
            if (cfw.a(cgi.a(a(bArr3), a(bArr, byteBuffer)), bArr2)) {
                byteBuffer.position(position);
                return this.a.a(byteBuffer);
            }
            throw new GeneralSecurityException("invalid MAC");
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }

    private byte[] a(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = new byte[32];
        this.b.a(bArr, 0).get(bArr2);
        return bArr2;
    }

    private static byte[] a(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int remaining = byteBuffer.remaining();
        int i = remaining % 16;
        int i2 = (i == 0 ? remaining : (remaining + 16) - i) + length;
        ByteBuffer order = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(length);
        order.put(byteBuffer);
        order.position(i2);
        order.putLong(bArr.length);
        order.putLong(remaining);
        return order.array();
    }
}
