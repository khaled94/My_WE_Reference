package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: cfy  reason: default package */
/* loaded from: classes2.dex */
abstract class cfy implements cgg {
    private static final int[] b = c(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});
    int[] a;
    private final int c;

    private static int a(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int a();

    abstract int[] a(int[] iArr, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public cfy(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.a = c(bArr);
        this.c = i;
    }

    @Override // defpackage.cgg
    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length > Integer.MAX_VALUE - a()) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer allocate = ByteBuffer.allocate(a() + bArr.length);
        a(allocate, bArr);
        return allocate.array();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
        if (byteBuffer.remaining() - a() < bArr.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        byte[] a = cgm.a(a());
        byteBuffer.put(a);
        a(a, byteBuffer, ByteBuffer.wrap(bArr));
    }

    @Override // defpackage.cgg
    public final byte[] b(byte[] bArr) throws GeneralSecurityException {
        return a(ByteBuffer.wrap(bArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] a(ByteBuffer byteBuffer) throws GeneralSecurityException {
        if (byteBuffer.remaining() < a()) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr = new byte[a()];
        byteBuffer.get(bArr);
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        a(bArr, allocate, byteBuffer);
        return allocate.array();
    }

    private void a(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        int remaining = byteBuffer2.remaining();
        int i = (remaining / 64) + 1;
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer a = a(bArr, this.c + i2);
            if (i2 == i - 1) {
                cfw.a(byteBuffer, byteBuffer2, a, remaining % 64);
            } else {
                cfw.a(byteBuffer, byteBuffer2, a, 64);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ByteBuffer a(byte[] bArr, int i) {
        int[] a = a(c(bArr), i);
        int[] iArr = (int[]) a.clone();
        a(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            a[i2] = a[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(a, 0, 16);
        return order;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int[] iArr, int[] iArr2) {
        int[] iArr3 = b;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, b.length, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            a(iArr, 0, 4, 8, 12);
            a(iArr, 1, 5, 9, 13);
            a(iArr, 2, 6, 10, 14);
            a(iArr, 3, 7, 11, 15);
            a(iArr, 0, 5, 10, 15);
            a(iArr, 1, 6, 11, 12);
            a(iArr, 2, 7, 8, 13);
            a(iArr, 3, 4, 9, 14);
        }
    }

    private static void a(int[] iArr, int i, int i2, int i3, int i4) {
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = a(iArr[i4] ^ iArr[i], 16);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = a(iArr[i2] ^ iArr[i3], 12);
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = a(iArr[i] ^ iArr[i4], 8);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = a(iArr[i2] ^ iArr[i3], 7);
    }

    private static int[] c(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }
}
