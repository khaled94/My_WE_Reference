package defpackage;

import com.google.android.gms.internal.measurement.zzfi;

/* renamed from: awa  reason: default package */
/* loaded from: classes.dex */
final class awa {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean a(byte b) {
        return b < -32;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean b(byte b) {
        return b < -16;
    }

    private static boolean c(byte b) {
        return b > -65;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(byte b, byte b2, char[] cArr, int i) throws zzfi {
        if (b < -62 || c(b2)) {
            throw zzfi.i();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(byte b, byte b2, byte b3, char[] cArr, int i) throws zzfi {
        if (c(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || c(b3)))) {
            throw zzfi.i();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzfi {
        if (c(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || c(b3) || c(b4)) {
            throw zzfi.i();
        }
        int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((i2 >>> 10) + 55232);
        cArr[i + 1] = (char) ((i2 & 1023) + 56320);
    }
}
