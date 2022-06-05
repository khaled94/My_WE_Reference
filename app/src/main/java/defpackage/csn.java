package defpackage;

import com.google.zxing.WriterException;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: csn  reason: default package */
/* loaded from: classes2.dex */
public final class csn extends csy {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: csn$a */
    /* loaded from: classes2.dex */
    public static final class a extends Enum<a> {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        private static final /* synthetic */ int[] e = {1, 2, 3, 4};
    }

    @Override // defpackage.csy, defpackage.crg
    public final crq a(String str, crc crcVar, int i, int i2, Map<cre, ?> map) throws WriterException {
        if (crcVar != crc.CODE_128) {
            throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(crcVar)));
        }
        return super.a(str, crcVar, i, i2, map);
    }

    @Override // defpackage.csy
    public final boolean[] a(String str) {
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            switch (charAt) {
                case 241:
                case 242:
                case 243:
                case 244:
                    break;
                default:
                    if (charAt > 127) {
                        throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(charAt)));
                    }
                    break;
            }
        }
        ArrayList<int[]> arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (true) {
            int i7 = 103;
            if (i3 < length) {
                int a2 = a(str, i3, i5);
                int i8 = 100;
                if (a2 == i5) {
                    switch (str.charAt(i3)) {
                        case 241:
                            i8 = 102;
                            break;
                        case 242:
                            i8 = 97;
                            break;
                        case 243:
                            i8 = 96;
                            break;
                        case 244:
                            if (i5 == 101) {
                                i8 = 101;
                                break;
                            }
                            break;
                        default:
                            if (i5 != 100) {
                                if (i5 != 101) {
                                    i8 = Integer.parseInt(str.substring(i3, i3 + 2));
                                    i3++;
                                    break;
                                } else {
                                    i8 = str.charAt(i3) - ' ';
                                    if (i8 < 0) {
                                        i8 += 96;
                                        break;
                                    }
                                }
                            } else {
                                i8 = str.charAt(i3) - ' ';
                                break;
                            }
                            break;
                    }
                    i3++;
                } else {
                    if (i5 != 0) {
                        i7 = a2;
                    } else if (a2 == 100) {
                        i7 = 104;
                    } else if (a2 != 101) {
                        i7 = 105;
                    }
                    i8 = i7;
                    i5 = a2;
                }
                arrayList.add(csm.a[i8]);
                i4 += i8 * i6;
                if (i3 != 0) {
                    i6++;
                }
            } else {
                arrayList.add(csm.a[i4 % 103]);
                arrayList.add(csm.a[106]);
                int i9 = 0;
                for (int[] iArr : arrayList) {
                    for (int i10 : iArr) {
                        i9 += i10;
                    }
                }
                boolean[] zArr = new boolean[i9];
                for (int[] iArr2 : arrayList) {
                    i += a(zArr, i, iArr2, true);
                }
                return zArr;
            }
        }
    }

    private static int a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i >= length) {
            return a.a;
        }
        char charAt = charSequence.charAt(i);
        if (charAt == 241) {
            return a.d;
        }
        if (charAt < '0' || charAt > '9') {
            return a.a;
        }
        int i2 = i + 1;
        if (i2 >= length) {
            return a.b;
        }
        char charAt2 = charSequence.charAt(i2);
        if (charAt2 < '0' || charAt2 > '9') {
            return a.b;
        }
        return a.c;
    }

    private static int a(CharSequence charSequence, int i, int i2) {
        int a2;
        int a3;
        char charAt;
        int a4 = a(charSequence, i);
        if (a4 == a.b) {
            return 100;
        }
        if (a4 == a.a) {
            return (i >= charSequence.length() || ((charAt = charSequence.charAt(i)) >= ' ' && (i2 != 101 || charAt >= '`'))) ? 100 : 101;
        } else if (i2 == 99) {
            return 99;
        } else {
            if (i2 == 100) {
                if (a4 == a.d || (a2 = a(charSequence, i + 2)) == a.a || a2 == a.b) {
                    return 100;
                }
                if (a2 == a.d) {
                    return a(charSequence, i + 3) == a.c ? 99 : 100;
                }
                int i3 = i + 4;
                while (true) {
                    a3 = a(charSequence, i3);
                    if (a3 != a.c) {
                        break;
                    }
                    i3 += 2;
                }
                return a3 == a.b ? 100 : 99;
            }
            if (a4 == a.d) {
                a4 = a(charSequence, i + 1);
            }
            return a4 == a.c ? 99 : 100;
        }
    }
}
