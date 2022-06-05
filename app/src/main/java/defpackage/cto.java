package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.zxing.WriterException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* renamed from: cto  reason: default package */
/* loaded from: classes2.dex */
final class cto {
    private static final byte[] a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};
    private static final byte[] b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};
    private static final byte[] c = new byte[128];
    private static final byte[] d = new byte[128];
    private static final Charset e = StandardCharsets.ISO_8859_1;

    private static boolean a(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    private static boolean b(char c2) {
        if (c2 != ' ') {
            return c2 >= 'A' && c2 <= 'Z';
        }
        return true;
    }

    private static boolean c(char c2) {
        if (c2 != ' ') {
            return c2 >= 'a' && c2 <= 'z';
        }
        return true;
    }

    static {
        Arrays.fill(c, (byte) -1);
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = a;
            if (i2 >= bArr.length) {
                break;
            }
            byte b2 = bArr[i2];
            if (b2 > 0) {
                c[b2] = (byte) i2;
            }
            i2++;
        }
        Arrays.fill(d, (byte) -1);
        while (true) {
            byte[] bArr2 = b;
            if (i < bArr2.length) {
                byte b3 = bArr2[i];
                if (b3 > 0) {
                    d[b3] = (byte) i;
                }
                i++;
            } else {
                return;
            }
        }
    }

    private cto() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str, ctk ctkVar, Charset charset) throws WriterException {
        int a2;
        crr characterSetECIByName;
        StringBuilder sb = new StringBuilder(str.length());
        if (charset == null) {
            charset = e;
        } else if (!e.equals(charset) && (characterSetECIByName = crr.getCharacterSetECIByName(charset.name())) != null) {
            int value = characterSetECIByName.getValue();
            if (value >= 0 && value < 900) {
                sb.append((char) 927);
                sb.append((char) value);
            } else if (value < 810900) {
                sb.append((char) 926);
                sb.append((char) ((value / TypedValues.Custom.TYPE_INT) - 1));
                sb.append((char) (value % TypedValues.Custom.TYPE_INT));
            } else if (value < 811800) {
                sb.append((char) 925);
                sb.append((char) (810900 - value));
            } else {
                throw new WriterException("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(value)));
            }
        }
        int length = str.length();
        int i = AnonymousClass1.a[ctkVar.ordinal()];
        if (i == 1) {
            a(str, 0, length, sb, 0);
        } else if (i == 2) {
            byte[] bytes = str.getBytes(charset);
            a(bytes, bytes.length, 1, sb);
        } else if (i != 3) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                int i4 = 0;
                while (i2 < length) {
                    a2 = a(str, i2);
                    if (a2 >= 13) {
                        break;
                    }
                    int b2 = b(str, i2);
                    if (b2 >= 5 || a2 == length) {
                        if (i3 != 0) {
                            sb.append((char) 900);
                            i3 = 0;
                            i4 = 0;
                        }
                        i4 = a(str, i2, b2, sb, i4);
                        i2 += b2;
                    } else {
                        int a3 = a(str, i2, charset);
                        if (a3 == 0) {
                            a3 = 1;
                        }
                        int i5 = a3 + i2;
                        byte[] bytes2 = str.substring(i2, i5).getBytes(charset);
                        if (bytes2.length == 1 && i3 == 0) {
                            a(bytes2, 1, 0, sb);
                        } else {
                            a(bytes2, bytes2.length, i3, sb);
                            i3 = 1;
                            i4 = 0;
                        }
                        i2 = i5;
                    }
                }
                sb.append((char) 902);
                a(str, i2, a2, sb);
                i2 += a2;
                i3 = 2;
            }
        } else {
            sb.append((char) 902);
            a(str, 0, length, sb);
        }
        return sb.toString();
    }

    /* renamed from: cto$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ctk.values().length];
            a = iArr;
            try {
                iArr[ctk.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ctk.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ctk.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x00f6 A[EDGE_INSN: B:92:0x00f6->B:55:0x00f6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0011 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int a(java.lang.CharSequence r16, int r17, int r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cto.a(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }

    private static void a(byte[] bArr, int i, int i2, StringBuilder sb) {
        int i3;
        if (i == 1 && i2 == 0) {
            sb.append((char) 913);
        } else if (i % 6 == 0) {
            sb.append((char) 924);
        } else {
            sb.append((char) 901);
        }
        if (i >= 6) {
            char[] cArr = new char[5];
            i3 = 0;
            while ((i + 0) - i3 >= 6) {
                long j = 0;
                for (int i4 = 0; i4 < 6; i4++) {
                    j = (j << 8) + (bArr[i3 + i4] & 255);
                }
                for (int i5 = 0; i5 < 5; i5++) {
                    cArr[i5] = (char) (j % 900);
                    j /= 900;
                }
                for (int i6 = 4; i6 >= 0; i6--) {
                    sb.append(cArr[i6]);
                }
                i3 += 6;
            }
        } else {
            i3 = 0;
        }
        while (i3 < i + 0) {
            sb.append((char) (bArr[i3] & 255));
            i3++;
        }
    }

    private static void a(String str, int i, int i2, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i2 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900L);
        BigInteger valueOf2 = BigInteger.valueOf(0L);
        int i3 = 0;
        while (i3 < i2) {
            sb2.setLength(0);
            int min = Math.min(44, i2 - i3);
            StringBuilder sb3 = new StringBuilder("1");
            int i4 = i + i3;
            sb3.append(str.substring(i4, i4 + min));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb2.length() - 1; length >= 0; length--) {
                sb.append(sb2.charAt(length));
            }
            i3 += min;
        }
    }

    private static boolean d(char c2) {
        return c[c2] != -1;
    }

    private static boolean e(char c2) {
        return d[c2] != -1;
    }

    private static int a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            char charAt = charSequence.charAt(i);
            while (a(charAt) && i < length) {
                i2++;
                i++;
                if (i < length) {
                    charAt = charSequence.charAt(i);
                }
            }
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
        return (r1 - r8) - r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int b(java.lang.CharSequence r7, int r8) {
        /*
            int r0 = r7.length()
            r1 = r8
        L5:
            if (r1 >= r0) goto L47
            char r2 = r7.charAt(r1)
            r3 = 0
            r4 = 0
        Ld:
            r5 = 13
            if (r4 >= r5) goto L24
            boolean r6 = a(r2)
            if (r6 == 0) goto L24
            if (r1 >= r0) goto L24
            int r4 = r4 + 1
            int r1 = r1 + 1
            if (r1 >= r0) goto Ld
            char r2 = r7.charAt(r1)
            goto Ld
        L24:
            if (r4 < r5) goto L29
            int r1 = r1 - r8
            int r1 = r1 - r4
            return r1
        L29:
            if (r4 > 0) goto L5
            char r2 = r7.charAt(r1)
            r4 = 9
            if (r2 == r4) goto L41
            r4 = 10
            if (r2 == r4) goto L41
            if (r2 == r5) goto L41
            r4 = 32
            if (r2 < r4) goto L42
            r4 = 126(0x7e, float:1.77E-43)
            if (r2 > r4) goto L42
        L41:
            r3 = 1
        L42:
            if (r3 == 0) goto L47
            int r1 = r1 + 1
            goto L5
        L47:
            int r1 = r1 - r8
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cto.b(java.lang.CharSequence, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
        return r1 - r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int a(java.lang.String r5, int r6, java.nio.charset.Charset r7) throws com.google.zxing.WriterException {
        /*
            java.nio.charset.CharsetEncoder r7 = r7.newEncoder()
            int r0 = r5.length()
            r1 = r6
        L9:
            if (r1 >= r0) goto L57
            char r2 = r5.charAt(r1)
            r3 = 0
        L10:
            r4 = 13
            if (r3 >= r4) goto L25
            boolean r2 = a(r2)
            if (r2 == 0) goto L25
            int r3 = r3 + 1
            int r2 = r1 + r3
            if (r2 >= r0) goto L25
            char r2 = r5.charAt(r2)
            goto L10
        L25:
            if (r3 < r4) goto L29
            int r1 = r1 - r6
            return r1
        L29:
            char r2 = r5.charAt(r1)
            boolean r3 = r7.canEncode(r2)
            if (r3 == 0) goto L36
            int r1 = r1 + 1
            goto L9
        L36:
            com.google.zxing.WriterException r5 = new com.google.zxing.WriterException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Non-encodable character detected: "
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r7 = " (Unicode: "
            r6.append(r7)
            r6.append(r2)
            r7 = 41
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L57:
            int r1 = r1 - r6
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cto.a(java.lang.String, int, java.nio.charset.Charset):int");
    }
}
