package defpackage;

/* renamed from: bjw  reason: default package */
/* loaded from: classes2.dex */
public final class bjw {
    public static Boolean a(byte b) {
        if (b != 0) {
            if (b == 1) {
                return Boolean.TRUE;
            }
            return null;
        }
        return Boolean.FALSE;
    }

    public static byte a(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue() ? (byte) 1 : (byte) 0;
        }
        return (byte) -1;
    }
}
