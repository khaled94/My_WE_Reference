package defpackage;

import java.io.IOException;

/* renamed from: ecp  reason: default package */
/* loaded from: classes2.dex */
public final class ecp {
    static final edx a = edx.a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    private static final String[] d = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    static final String[] b = new String[64];
    static final String[] c = new String[256];

    static {
        int i;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String[] strArr = c;
            if (i3 >= strArr.length) {
                break;
            }
            strArr[i3] = ebk.a("%8s", Integer.toBinaryString(i3)).replace(' ', '0');
            i3++;
        }
        String[] strArr2 = b;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i4 = 0; i4 <= 0; i4++) {
            b[iArr[i4] | 8] = b[i] + "|PADDED";
        }
        String[] strArr3 = b;
        strArr3[4] = "END_HEADERS";
        strArr3[32] = "PRIORITY";
        strArr3[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 <= 0; i7++) {
                int i8 = iArr[i7];
                int i9 = i8 | i6;
                b[i9] = b[i8] + '|' + b[i6];
                b[i9 | 8] = b[i8] + '|' + b[i6] + "|PADDED";
            }
        }
        while (true) {
            String[] strArr4 = b;
            if (i2 < strArr4.length) {
                if (strArr4[i2] == null) {
                    strArr4[i2] = c[i2];
                }
                i2++;
            } else {
                return;
            }
        }
    }

    private ecp() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static IllegalArgumentException a(String str, Object... objArr) {
        throw new IllegalArgumentException(ebk.a(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static IOException b(String str, Object... objArr) throws IOException {
        throw new IOException(ebk.a(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(boolean z, int i, int i2, byte b2, byte b3) {
        String str;
        String[] strArr = d;
        String a2 = b2 < strArr.length ? strArr[b2] : ebk.a("0x%02x", Byte.valueOf(b2));
        if (b3 == 0) {
            str = "";
        } else {
            if (b2 != 2 && b2 != 3) {
                if (b2 == 4 || b2 == 6) {
                    str = b3 == 1 ? "ACK" : c[b3];
                } else if (b2 != 7 && b2 != 8) {
                    String[] strArr2 = b;
                    String str2 = b3 < strArr2.length ? strArr2[b3] : c[b3];
                    if (b2 == 5 && (b3 & 4) != 0) {
                        str = str2.replace("HEADERS", "PUSH_PROMISE");
                    } else {
                        str = (b2 != 0 || (b3 & 32) == 0) ? str2 : str2.replace("PRIORITY", "COMPRESSED");
                    }
                }
            }
            str = c[b3];
        }
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = a2;
        objArr[4] = str;
        return ebk.a("%s 0x%08x %5d %-13s %s", objArr);
    }
}
