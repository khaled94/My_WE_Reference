package defpackage;

import defpackage.cbt;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: bxn  reason: default package */
/* loaded from: classes2.dex */
public final class bxn {
    public static final byte[] a = new byte[0];

    /* renamed from: bxn$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ccf.values().length];
            a = iArr;
            try {
                iArr[ccf.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ccf.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ccf.TINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ccf.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static byte[] a(cbt.b bVar) throws GeneralSecurityException {
        int i = AnonymousClass1.a[bVar.c().ordinal()];
        if (i == 1 || i == 2) {
            return ByteBuffer.allocate(5).put((byte) 0).putInt(bVar.keyId_).array();
        }
        if (i == 3) {
            return ByteBuffer.allocate(5).put((byte) 1).putInt(bVar.keyId_).array();
        }
        if (i == 4) {
            return a;
        }
        throw new GeneralSecurityException("unknown output prefix type");
    }
}
