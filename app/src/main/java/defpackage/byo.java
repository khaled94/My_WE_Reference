package defpackage;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: byo  reason: default package */
/* loaded from: classes2.dex */
public final class byo implements bxm {
    private static final byte[] a = new byte[0];
    private final cbp b;
    private final bxm c;

    public byo(cbp cbpVar, bxm bxmVar) {
        this.b = cbpVar;
        this.c = bxmVar;
    }

    @Override // defpackage.bxm
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] g = byc.b(this.b).g();
        byte[] a2 = this.c.a(g, a);
        byte[] a3 = ((bxm) byc.a(this.b.typeUrl_, g, bxm.class)).a(bArr, bArr2);
        return ByteBuffer.allocate(a2.length + 4 + a3.length).putInt(a2.length).put(a2).put(a3).array();
    }

    @Override // defpackage.bxm
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((bxm) byc.a(this.b.typeUrl_, this.c.b(bArr3, a), bxm.class)).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
