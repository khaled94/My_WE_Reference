package defpackage;

import java.util.Arrays;

/* renamed from: csf  reason: default package */
/* loaded from: classes2.dex */
public final class csf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(char c) {
        return c >= '0' && c <= '9';
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(char c) {
        return c >= 128 && c <= 255;
    }

    private static boolean e(char c) {
        return c == '\r' || c == '*' || c == '>';
    }

    private csf() {
    }

    public static String a(String str, csh cshVar, crd crdVar, crd crdVar2) {
        int i = 0;
        csc[] cscVarArr = {new crw(), new cry(), new csi(), new csj(), new csb(), new crx()};
        csd csdVar = new csd(str);
        csdVar.b = cshVar;
        csdVar.c = crdVar;
        csdVar.d = crdVar2;
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            csdVar.a((char) 236);
            csdVar.i = 2;
            csdVar.f += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            csdVar.a((char) 237);
            csdVar.i = 2;
            csdVar.f += 7;
        }
        while (csdVar.b()) {
            cscVarArr[i].a(csdVar);
            if (csdVar.g >= 0) {
                i = csdVar.g;
                csdVar.g = -1;
            }
        }
        int length = csdVar.e.length();
        csdVar.d();
        int i2 = csdVar.h.b;
        if (length < i2 && i != 0 && i != 5 && i != 4) {
            csdVar.a((char) 254);
        }
        StringBuilder sb = csdVar.e;
        if (sb.length() < i2) {
            sb.append((char) 129);
        }
        while (sb.length() < i2) {
            int length2 = (((sb.length() + 1) * 149) % 253) + 1 + 129;
            if (length2 > 254) {
                length2 -= 254;
            }
            sb.append((char) length2);
        }
        return csdVar.e.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(CharSequence charSequence, int i, int i2) {
        float[] fArr;
        if (i >= charSequence.length()) {
            return i2;
        }
        if (i2 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[]{1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr[i2] = 0.0f;
        }
        int i3 = 0;
        while (true) {
            int i4 = i + i3;
            if (i4 == charSequence.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int a = a(fArr, iArr, Integer.MAX_VALUE, bArr);
                int a2 = a(bArr);
                if (iArr[0] == a) {
                    return 0;
                }
                if (a2 == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (a2 == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (a2 == 1 && bArr[2] > 0) {
                    return 2;
                }
                return (a2 != 1 || bArr[3] <= 0) ? 1 : 3;
            }
            char charAt = charSequence.charAt(i4);
            i3++;
            if (a(charAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (b(charAt)) {
                fArr[0] = (float) Math.ceil(fArr[0]);
                fArr[0] = fArr[0] + 2.0f;
            } else {
                fArr[0] = (float) Math.ceil(fArr[0]);
                fArr[0] = fArr[0] + 1.0f;
            }
            if (charAt == ' ' || (charAt >= '0' && charAt <= '9') || (charAt >= 'A' && charAt <= 'Z')) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (b(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (charAt == ' ' || (charAt >= '0' && charAt <= '9') || (charAt >= 'a' && charAt <= 'z')) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (b(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (d(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (b(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (charAt >= ' ' && charAt <= '^') {
                fArr[4] = fArr[4] + 0.75f;
            } else if (b(charAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            fArr[5] = fArr[5] + 1.0f;
            if (i3 >= 4) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                a(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int a3 = a(bArr2);
                if (iArr2[0] < iArr2[5] && iArr2[0] < iArr2[1] && iArr2[0] < iArr2[2] && iArr2[0] < iArr2[3] && iArr2[0] < iArr2[4]) {
                    return 0;
                }
                if (iArr2[5] < iArr2[0] || bArr2[1] + bArr2[2] + bArr2[3] + bArr2[4] == 0) {
                    return 5;
                }
                if (a3 == 1 && bArr2[4] > 0) {
                    return 4;
                }
                if (a3 == 1 && bArr2[2] > 0) {
                    return 2;
                }
                if (a3 == 1 && bArr2[3] > 0) {
                    return 3;
                }
                if (iArr2[1] + 1 < iArr2[0] && iArr2[1] + 1 < iArr2[5] && iArr2[1] + 1 < iArr2[4] && iArr2[1] + 1 < iArr2[2]) {
                    if (iArr2[1] < iArr2[3]) {
                        return 1;
                    }
                    if (iArr2[1] == iArr2[3]) {
                        for (int i5 = i + i3 + 1; i5 < charSequence.length(); i5++) {
                            char charAt2 = charSequence.charAt(i5);
                            if (e(charAt2)) {
                                return 3;
                            }
                            if (!d(charAt2)) {
                                break;
                            }
                        }
                        return 1;
                    }
                }
            }
        }
    }

    private static int a(float[] fArr, int[] iArr, int i, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i2 = 0; i2 < 6; i2++) {
            iArr[i2] = (int) Math.ceil(fArr[i2]);
            int i3 = iArr[i2];
            if (i > i3) {
                Arrays.fill(bArr, (byte) 0);
                i = i3;
            }
            if (i == i3) {
                bArr[i2] = (byte) (bArr[i2] + 1);
            }
        }
        return i;
    }

    private static int a(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            i += bArr[i2];
        }
        return i;
    }

    private static boolean d(char c) {
        if (e(c) || c == ' ') {
            return true;
        }
        if (c >= '0' && c <= '9') {
            return true;
        }
        return c >= 'A' && c <= 'Z';
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(char c) {
        String hexString;
        throw new IllegalArgumentException("Illegal character: " + c + " (0x" + ("0000".substring(0, 4 - hexString.length()) + Integer.toHexString(c)) + ')');
    }
}
