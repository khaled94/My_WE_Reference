package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: cgr  reason: default package */
/* loaded from: classes2.dex */
public final class cgr {
    public static boolean a() {
        try {
            Class.forName("android.app.Application", false, null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int b() {
        try {
            return Class.forName("android.os.Build$VERSION").getDeclaredField("SDK_INT").getInt(null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return -1;
        }
    }

    public static void a(ByteBuffer byteBuffer, long j) throws GeneralSecurityException {
        if (0 > j || j >= 4294967296L) {
            throw new GeneralSecurityException("Index out of range");
        }
        byteBuffer.putInt((int) j);
    }
}
