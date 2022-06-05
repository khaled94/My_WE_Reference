package defpackage;

import com.google.android.gms.internal.places.zzaj;
import com.google.android.gms.internal.places.zzbk;
import defpackage.bcc;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.sqlcipher.database.SQLiteDatabase;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bdl  reason: default package */
/* loaded from: classes2.dex */
public final class bdl<T> implements bdy<T> {
    private static final int[] a = new int[0];
    private static final Unsafe b = beu.c();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final bdh g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final int[] l;
    private final int m;
    private final int n;
    private final bdp o;
    private final bcq p;
    private final beo<?, ?> q;
    private final bbq<?> r;
    private final bda s;

    private bdl(int[] iArr, Object[] objArr, int i, int i2, bdh bdhVar, boolean z, int[] iArr2, int i3, int i4, bdp bdpVar, bcq bcqVar, beo<?, ?> beoVar, bbq<?> bbqVar, bda bdaVar) {
        this.c = iArr;
        this.d = objArr;
        this.e = i;
        this.f = i2;
        this.i = bdhVar instanceof bcc;
        this.j = z;
        this.h = bbqVar != null && bbqVar.a(bdhVar);
        this.k = false;
        this.l = iArr2;
        this.m = i3;
        this.n = i4;
        this.o = bdpVar;
        this.p = bcqVar;
        this.q = beoVar;
        this.r = bbqVar;
        this.g = bdhVar;
        this.s = bdaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> bdl<T> a(bdf bdfVar, bdp bdpVar, bcq bcqVar, beo<?, ?> beoVar, bbq<?> bbqVar, bda bdaVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        int i10;
        int[] iArr2;
        int i11;
        bdu bduVar;
        String str;
        int i12;
        int i13;
        int i14;
        int i15;
        Field field;
        char charAt;
        int i16;
        Field field2;
        Field field3;
        int i17;
        char charAt2;
        int i18;
        char charAt3;
        int i19;
        char charAt4;
        int i20;
        int i21;
        char charAt5;
        int i22;
        char charAt6;
        int i23;
        char charAt7;
        int i24;
        char charAt8;
        int i25;
        char charAt9;
        int i26;
        char charAt10;
        int i27;
        char charAt11;
        int i28;
        char charAt12;
        int i29;
        char charAt13;
        char charAt14;
        if (bdfVar instanceof bdu) {
            bdu bduVar2 = (bdu) bdfVar;
            int i30 = 0;
            boolean z2 = bduVar2.a() == bcc.d.i;
            String str2 = bduVar2.b;
            int length = str2.length();
            int charAt15 = str2.charAt(0);
            if (charAt15 >= 55296) {
                int i31 = charAt15 & 8191;
                int i32 = 1;
                int i33 = 13;
                while (true) {
                    i = i32 + 1;
                    charAt14 = str2.charAt(i32);
                    if (charAt14 < 55296) {
                        break;
                    }
                    i31 |= (charAt14 & 8191) << i33;
                    i33 += 13;
                    i32 = i;
                }
                charAt15 = i31 | (charAt14 << i33);
            } else {
                i = 1;
            }
            int i34 = i + 1;
            int charAt16 = str2.charAt(i);
            if (charAt16 >= 55296) {
                int i35 = charAt16 & 8191;
                int i36 = 13;
                while (true) {
                    i29 = i34 + 1;
                    charAt13 = str2.charAt(i34);
                    if (charAt13 < 55296) {
                        break;
                    }
                    i35 |= (charAt13 & 8191) << i36;
                    i36 += 13;
                    i34 = i29;
                }
                charAt16 = i35 | (charAt13 << i36);
                i34 = i29;
            }
            if (charAt16 == 0) {
                iArr = a;
                i7 = 0;
                i6 = 0;
                i5 = 0;
                i4 = 0;
                i3 = 0;
                i2 = 0;
            } else {
                int i37 = i34 + 1;
                int charAt17 = str2.charAt(i34);
                if (charAt17 >= 55296) {
                    int i38 = charAt17 & 8191;
                    int i39 = 13;
                    while (true) {
                        i28 = i37 + 1;
                        charAt12 = str2.charAt(i37);
                        if (charAt12 < 55296) {
                            break;
                        }
                        i38 |= (charAt12 & 8191) << i39;
                        i39 += 13;
                        i37 = i28;
                    }
                    charAt17 = i38 | (charAt12 << i39);
                    i37 = i28;
                }
                int i40 = i37 + 1;
                int charAt18 = str2.charAt(i37);
                if (charAt18 >= 55296) {
                    int i41 = charAt18 & 8191;
                    int i42 = 13;
                    while (true) {
                        i27 = i40 + 1;
                        charAt11 = str2.charAt(i40);
                        if (charAt11 < 55296) {
                            break;
                        }
                        i41 |= (charAt11 & 8191) << i42;
                        i42 += 13;
                        i40 = i27;
                    }
                    charAt18 = i41 | (charAt11 << i42);
                    i40 = i27;
                }
                int i43 = i40 + 1;
                i5 = str2.charAt(i40);
                if (i5 >= 55296) {
                    int i44 = i5 & 8191;
                    int i45 = 13;
                    while (true) {
                        i26 = i43 + 1;
                        charAt10 = str2.charAt(i43);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i44 |= (charAt10 & 8191) << i45;
                        i45 += 13;
                        i43 = i26;
                    }
                    i5 = i44 | (charAt10 << i45);
                    i43 = i26;
                }
                int i46 = i43 + 1;
                int charAt19 = str2.charAt(i43);
                if (charAt19 >= 55296) {
                    int i47 = charAt19 & 8191;
                    int i48 = 13;
                    while (true) {
                        i25 = i46 + 1;
                        charAt9 = str2.charAt(i46);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i47 |= (charAt9 & 8191) << i48;
                        i48 += 13;
                        i46 = i25;
                    }
                    charAt19 = i47 | (charAt9 << i48);
                    i46 = i25;
                }
                int i49 = i46 + 1;
                i4 = str2.charAt(i46);
                if (i4 >= 55296) {
                    int i50 = i4 & 8191;
                    int i51 = 13;
                    while (true) {
                        i24 = i49 + 1;
                        charAt8 = str2.charAt(i49);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i50 |= (charAt8 & 8191) << i51;
                        i51 += 13;
                        i49 = i24;
                    }
                    i4 = i50 | (charAt8 << i51);
                    i49 = i24;
                }
                int i52 = i49 + 1;
                int charAt20 = str2.charAt(i49);
                if (charAt20 >= 55296) {
                    int i53 = charAt20 & 8191;
                    int i54 = 13;
                    while (true) {
                        i23 = i52 + 1;
                        charAt7 = str2.charAt(i52);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i53 |= (charAt7 & 8191) << i54;
                        i54 += 13;
                        i52 = i23;
                    }
                    charAt20 = i53 | (charAt7 << i54);
                    i52 = i23;
                }
                int i55 = i52 + 1;
                int charAt21 = str2.charAt(i52);
                if (charAt21 >= 55296) {
                    int i56 = charAt21 & 8191;
                    int i57 = i55;
                    int i58 = 13;
                    while (true) {
                        i22 = i57 + 1;
                        charAt6 = str2.charAt(i57);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i56 |= (charAt6 & 8191) << i58;
                        i58 += 13;
                        i57 = i22;
                    }
                    charAt21 = i56 | (charAt6 << i58);
                    i20 = i22;
                } else {
                    i20 = i55;
                }
                int i59 = i20 + 1;
                int charAt22 = str2.charAt(i20);
                if (charAt22 >= 55296) {
                    int i60 = charAt22 & 8191;
                    int i61 = i59;
                    int i62 = 13;
                    while (true) {
                        i21 = i61 + 1;
                        charAt5 = str2.charAt(i61);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i60 |= (charAt5 & 8191) << i62;
                        i62 += 13;
                        i61 = i21;
                    }
                    charAt22 = i60 | (charAt5 << i62);
                    i59 = i21;
                }
                i2 = (charAt17 << 1) + charAt18;
                i6 = charAt19;
                iArr = new int[charAt22 + charAt20 + charAt21];
                i7 = charAt20;
                i3 = charAt22;
                i30 = charAt17;
                i34 = i59;
            }
            Unsafe unsafe = b;
            Object[] objArr = bduVar2.c;
            int i63 = i34;
            Class<?> cls = bduVar2.a.getClass();
            int i64 = i2;
            int[] iArr3 = new int[i4 * 3];
            Object[] objArr2 = new Object[i4 << 1];
            int i65 = i3 + i7;
            int i66 = i3;
            int i67 = i63;
            int i68 = i65;
            int i69 = 0;
            int i70 = 0;
            while (i67 < length) {
                int i71 = i67 + 1;
                int charAt23 = str2.charAt(i67);
                int i72 = length;
                if (charAt23 >= 55296) {
                    int i73 = charAt23 & 8191;
                    int i74 = i71;
                    int i75 = 13;
                    while (true) {
                        i19 = i74 + 1;
                        charAt4 = str2.charAt(i74);
                        i8 = i3;
                        if (charAt4 < 55296) {
                            break;
                        }
                        i73 |= (charAt4 & 8191) << i75;
                        i75 += 13;
                        i74 = i19;
                        i3 = i8;
                    }
                    charAt23 = i73 | (charAt4 << i75);
                    i9 = i19;
                } else {
                    i8 = i3;
                    i9 = i71;
                }
                int i76 = i9 + 1;
                int charAt24 = str2.charAt(i9);
                if (charAt24 >= 55296) {
                    int i77 = charAt24 & 8191;
                    int i78 = i76;
                    int i79 = 13;
                    while (true) {
                        i18 = i78 + 1;
                        charAt3 = str2.charAt(i78);
                        z = z2;
                        if (charAt3 < 55296) {
                            break;
                        }
                        i77 |= (charAt3 & 8191) << i79;
                        i79 += 13;
                        i78 = i18;
                        z2 = z;
                    }
                    charAt24 = i77 | (charAt3 << i79);
                    i10 = i18;
                } else {
                    z = z2;
                    i10 = i76;
                }
                int i80 = charAt24 & 255;
                int i81 = i6;
                if ((charAt24 & 1024) != 0) {
                    iArr[i69] = i70;
                    i69++;
                }
                int i82 = i5;
                if (i80 >= 51) {
                    int i83 = i10 + 1;
                    int charAt25 = str2.charAt(i10);
                    char c = 55296;
                    if (charAt25 >= 55296) {
                        int i84 = charAt25 & 8191;
                        int i85 = 13;
                        while (true) {
                            i17 = i83 + 1;
                            charAt2 = str2.charAt(i83);
                            if (charAt2 < c) {
                                break;
                            }
                            i84 |= (charAt2 & 8191) << i85;
                            i85 += 13;
                            i83 = i17;
                            c = 55296;
                        }
                        charAt25 = i84 | (charAt2 << i85);
                        i83 = i17;
                    }
                    int i86 = i80 - 51;
                    int i87 = i83;
                    if (i86 == 9 || i86 == 17) {
                        objArr2[((i70 / 3) << 1) + 1] = objArr[i64];
                        i64++;
                    } else if (i86 == 12 && (charAt15 & 1) == 1) {
                        objArr2[((i70 / 3) << 1) + 1] = objArr[i64];
                        i64++;
                    }
                    int i88 = charAt25 << 1;
                    Object obj = objArr[i88];
                    if (obj instanceof Field) {
                        field2 = (Field) obj;
                    } else {
                        field2 = a(cls, (String) obj);
                        objArr[i88] = field2;
                    }
                    iArr2 = iArr3;
                    i13 = (int) unsafe.objectFieldOffset(field2);
                    int i89 = i88 + 1;
                    Object obj2 = objArr[i89];
                    if (obj2 instanceof Field) {
                        field3 = (Field) obj2;
                    } else {
                        field3 = a(cls, (String) obj2);
                        objArr[i89] = field3;
                    }
                    i14 = (int) unsafe.objectFieldOffset(field3);
                    bduVar = bduVar2;
                    str = str2;
                    i11 = i87;
                    i12 = 0;
                } else {
                    iArr2 = iArr3;
                    int i90 = i64 + 1;
                    Field a2 = a(cls, (String) objArr[i64]);
                    if (i80 == 9 || i80 == 17) {
                        bduVar = bduVar2;
                        objArr2[((i70 / 3) << 1) + 1] = a2.getType();
                    } else {
                        if (i80 == 27 || i80 == 49) {
                            bduVar = bduVar2;
                            i16 = i90 + 1;
                            objArr2[((i70 / 3) << 1) + 1] = objArr[i90];
                        } else if (i80 == 12 || i80 == 30 || i80 == 44) {
                            bduVar = bduVar2;
                            if ((charAt15 & 1) == 1) {
                                i16 = i90 + 1;
                                objArr2[((i70 / 3) << 1) + 1] = objArr[i90];
                            }
                        } else if (i80 == 50) {
                            int i91 = i66 + 1;
                            iArr[i66] = i70;
                            int i92 = (i70 / 3) << 1;
                            int i93 = i90 + 1;
                            objArr2[i92] = objArr[i90];
                            if ((charAt24 & 2048) != 0) {
                                i90 = i93 + 1;
                                objArr2[i92 + 1] = objArr[i93];
                                bduVar = bduVar2;
                                i66 = i91;
                            } else {
                                i66 = i91;
                                i90 = i93;
                                bduVar = bduVar2;
                            }
                        } else {
                            bduVar = bduVar2;
                        }
                        str = str2;
                        i90 = i16;
                        i13 = (int) unsafe.objectFieldOffset(a2);
                        if ((charAt15 & 1) == 1 || i80 > 17) {
                            i11 = i10;
                            i15 = 0;
                            i12 = 0;
                        } else {
                            int i94 = i10 + 1;
                            String str3 = str;
                            int charAt26 = str3.charAt(i10);
                            if (charAt26 >= 55296) {
                                int i95 = charAt26 & 8191;
                                int i96 = 13;
                                while (true) {
                                    i11 = i94 + 1;
                                    charAt = str3.charAt(i94);
                                    if (charAt < 55296) {
                                        break;
                                    }
                                    i95 |= (charAt & 8191) << i96;
                                    i96 += 13;
                                    i94 = i11;
                                }
                                charAt26 = i95 | (charAt << i96);
                            } else {
                                i11 = i94;
                            }
                            int i97 = (i30 << 1) + (charAt26 / 32);
                            Object obj3 = objArr[i97];
                            if (obj3 instanceof Field) {
                                field = (Field) obj3;
                            } else {
                                field = a(cls, (String) obj3);
                                objArr[i97] = field;
                            }
                            str = str3;
                            i15 = (int) unsafe.objectFieldOffset(field);
                            i12 = charAt26 % 32;
                        }
                        if (i80 >= 18 && i80 <= 49) {
                            iArr[i68] = i13;
                            i68++;
                        }
                        i64 = i90;
                        i14 = i15;
                    }
                    str = str2;
                    i13 = (int) unsafe.objectFieldOffset(a2);
                    if ((charAt15 & 1) == 1) {
                    }
                    i11 = i10;
                    i15 = 0;
                    i12 = 0;
                    if (i80 >= 18) {
                        iArr[i68] = i13;
                        i68++;
                    }
                    i64 = i90;
                    i14 = i15;
                }
                int i98 = i70 + 1;
                iArr2[i70] = charAt23;
                int i99 = i98 + 1;
                iArr2[i98] = ((charAt24 & 256) != 0 ? SQLiteDatabase.CREATE_IF_NECESSARY : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i80 << 20) | i13;
                i70 = i99 + 1;
                iArr2[i99] = (i12 << 20) | i14;
                str2 = str;
                i6 = i81;
                length = i72;
                bduVar2 = bduVar;
                i3 = i8;
                z2 = z;
                i67 = i11;
                i5 = i82;
                iArr3 = iArr2;
            }
            return new bdl<>(iArr3, objArr2, i5, i6, bduVar2.a, z2, iArr, i3, i65, bdpVar, bcqVar, beoVar, bbqVar, bdaVar);
        }
        throw new NoSuchMethodError();
    }

    private static Field a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    @Override // defpackage.bdy
    public final T a() {
        return (T) this.o.a(this.g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
        if (defpackage.bea.a(defpackage.beu.f(r10, r6), defpackage.beu.f(r11, r6)) != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
        if (defpackage.bea.a(defpackage.beu.f(r10, r6), defpackage.beu.f(r11, r6)) != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
        if (defpackage.beu.b(r10, r6) == defpackage.beu.b(r11, r6)) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
        if (defpackage.beu.a(r10, r6) == defpackage.beu.a(r11, r6)) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
        if (defpackage.beu.b(r10, r6) == defpackage.beu.b(r11, r6)) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b6, code lost:
        if (defpackage.beu.a(r10, r6) == defpackage.beu.a(r11, r6)) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
        if (defpackage.beu.a(r10, r6) == defpackage.beu.a(r11, r6)) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00da, code lost:
        if (defpackage.beu.a(r10, r6) == defpackage.beu.a(r11, r6)) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f0, code lost:
        if (defpackage.bea.a(defpackage.beu.f(r10, r6), defpackage.beu.f(r11, r6)) != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0106, code lost:
        if (defpackage.bea.a(defpackage.beu.f(r10, r6), defpackage.beu.f(r11, r6)) != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011c, code lost:
        if (defpackage.bea.a(defpackage.beu.f(r10, r6), defpackage.beu.f(r11, r6)) != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012e, code lost:
        if (defpackage.beu.c(r10, r6) == defpackage.beu.c(r11, r6)) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0140, code lost:
        if (defpackage.beu.a(r10, r6) == defpackage.beu.a(r11, r6)) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0154, code lost:
        if (defpackage.beu.b(r10, r6) == defpackage.beu.b(r11, r6)) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0165, code lost:
        if (defpackage.beu.a(r10, r6) == defpackage.beu.a(r11, r6)) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0178, code lost:
        if (defpackage.beu.b(r10, r6) == defpackage.beu.b(r11, r6)) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018b, code lost:
        if (defpackage.beu.b(r10, r6) == defpackage.beu.b(r11, r6)) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(defpackage.beu.d(r10, r6)) == java.lang.Float.floatToIntBits(defpackage.beu.d(r11, r6))) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(defpackage.beu.e(r10, r6)) == java.lang.Double.doubleToLongBits(defpackage.beu.e(r11, r6))) goto L86;
     */
    @Override // defpackage.bdy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdl.a(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // defpackage.bdy
    public final int a(T t) {
        int i;
        int i2;
        int length = this.c.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int c = c(i4);
            int i5 = this.c[i4];
            long j = 1048575 & c;
            int i6 = 37;
            switch ((c & 267386880) >>> 20) {
                case 0:
                    i2 = i3 * 53;
                    i = bcd.a(Double.doubleToLongBits(beu.e(t, j)));
                    i3 = i2 + i;
                    break;
                case 1:
                    i2 = i3 * 53;
                    i = Float.floatToIntBits(beu.d(t, j));
                    i3 = i2 + i;
                    break;
                case 2:
                    i2 = i3 * 53;
                    i = bcd.a(beu.b(t, j));
                    i3 = i2 + i;
                    break;
                case 3:
                    i2 = i3 * 53;
                    i = bcd.a(beu.b(t, j));
                    i3 = i2 + i;
                    break;
                case 4:
                    i2 = i3 * 53;
                    i = beu.a(t, j);
                    i3 = i2 + i;
                    break;
                case 5:
                    i2 = i3 * 53;
                    i = bcd.a(beu.b(t, j));
                    i3 = i2 + i;
                    break;
                case 6:
                    i2 = i3 * 53;
                    i = beu.a(t, j);
                    i3 = i2 + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    i = bcd.a(beu.c(t, j));
                    i3 = i2 + i;
                    break;
                case 8:
                    i2 = i3 * 53;
                    i = ((String) beu.f(t, j)).hashCode();
                    i3 = i2 + i;
                    break;
                case 9:
                    Object f = beu.f(t, j);
                    if (f != null) {
                        i6 = f.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
                    break;
                case 10:
                    i2 = i3 * 53;
                    i = beu.f(t, j).hashCode();
                    i3 = i2 + i;
                    break;
                case 11:
                    i2 = i3 * 53;
                    i = beu.a(t, j);
                    i3 = i2 + i;
                    break;
                case 12:
                    i2 = i3 * 53;
                    i = beu.a(t, j);
                    i3 = i2 + i;
                    break;
                case 13:
                    i2 = i3 * 53;
                    i = beu.a(t, j);
                    i3 = i2 + i;
                    break;
                case 14:
                    i2 = i3 * 53;
                    i = bcd.a(beu.b(t, j));
                    i3 = i2 + i;
                    break;
                case 15:
                    i2 = i3 * 53;
                    i = beu.a(t, j);
                    i3 = i2 + i;
                    break;
                case 16:
                    i2 = i3 * 53;
                    i = bcd.a(beu.b(t, j));
                    i3 = i2 + i;
                    break;
                case 17:
                    Object f2 = beu.f(t, j);
                    if (f2 != null) {
                        i6 = f2.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i2 = i3 * 53;
                    i = beu.f(t, j).hashCode();
                    i3 = i2 + i;
                    break;
                case 50:
                    i2 = i3 * 53;
                    i = beu.f(t, j).hashCode();
                    i3 = i2 + i;
                    break;
                case 51:
                    if (a((bdl<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = bcd.a(Double.doubleToLongBits(b(t, j)));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (a((bdl<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = Float.floatToIntBits(c(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (a((bdl<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = bcd.a(e(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (a((bdl<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = bcd.a(e(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (a((bdl<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = d(t, j);
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (a((bdl<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = bcd.a(e(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (a((bdl<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = d(t, j);
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (a((bdl<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = bcd.a(f(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (a((bdl<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = ((String) beu.f(t, j)).hashCode();
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (a((bdl<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = beu.f(t, j).hashCode();
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (a((bdl<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = beu.f(t, j).hashCode();
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (a((bdl<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = d(t, j);
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (a((bdl<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = d(t, j);
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (a((bdl<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = d(t, j);
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (a((bdl<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = bcd.a(e(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (a((bdl<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = d(t, j);
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (a((bdl<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = bcd.a(e(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (a((bdl<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = beu.f(t, j).hashCode();
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i3 * 53) + this.q.a(t).hashCode();
        return this.h ? (hashCode * 53) + this.r.a(t).hashCode() : hashCode;
    }

    @Override // defpackage.bdy
    public final void b(T t, T t2) {
        if (t2 == null) {
            throw null;
        }
        for (int i = 0; i < this.c.length; i += 3) {
            int c = c(i);
            long j = 1048575 & c;
            int i2 = this.c[i];
            switch ((c & 267386880) >>> 20) {
                case 0:
                    if (a((bdl<T>) t2, i)) {
                        beu.a(t, j, beu.e(t2, j));
                        b((bdl<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (a((bdl<T>) t2, i)) {
                        beu.a((Object) t, j, beu.d(t2, j));
                        b((bdl<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (a((bdl<T>) t2, i)) {
                        beu.a((Object) t, j, beu.b(t2, j));
                        b((bdl<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (a((bdl<T>) t2, i)) {
                        beu.a((Object) t, j, beu.b(t2, j));
                        b((bdl<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (a((bdl<T>) t2, i)) {
                        beu.a((Object) t, j, beu.a(t2, j));
                        b((bdl<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (a((bdl<T>) t2, i)) {
                        beu.a((Object) t, j, beu.b(t2, j));
                        b((bdl<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (a((bdl<T>) t2, i)) {
                        beu.a((Object) t, j, beu.a(t2, j));
                        b((bdl<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (a((bdl<T>) t2, i)) {
                        beu.a(t, j, beu.c(t2, j));
                        b((bdl<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (a((bdl<T>) t2, i)) {
                        beu.a(t, j, beu.f(t2, j));
                        b((bdl<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    a(t, t2, i);
                    break;
                case 10:
                    if (a((bdl<T>) t2, i)) {
                        beu.a(t, j, beu.f(t2, j));
                        b((bdl<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (a((bdl<T>) t2, i)) {
                        beu.a((Object) t, j, beu.a(t2, j));
                        b((bdl<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (a((bdl<T>) t2, i)) {
                        beu.a((Object) t, j, beu.a(t2, j));
                        b((bdl<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (a((bdl<T>) t2, i)) {
                        beu.a((Object) t, j, beu.a(t2, j));
                        b((bdl<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (a((bdl<T>) t2, i)) {
                        beu.a((Object) t, j, beu.b(t2, j));
                        b((bdl<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (a((bdl<T>) t2, i)) {
                        beu.a((Object) t, j, beu.a(t2, j));
                        b((bdl<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (a((bdl<T>) t2, i)) {
                        beu.a((Object) t, j, beu.b(t2, j));
                        b((bdl<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    a(t, t2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.p.a(t, t2, j);
                    break;
                case 50:
                    bea.a(this.s, t, t2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (a((bdl<T>) t2, i2, i)) {
                        beu.a(t, j, beu.f(t2, j));
                        b((bdl<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    b(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (a((bdl<T>) t2, i2, i)) {
                        beu.a(t, j, beu.f(t2, j));
                        b((bdl<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    b(t, t2, i);
                    break;
            }
        }
        if (this.j) {
            return;
        }
        bea.a(this.q, t, t2);
        if (!this.h) {
            return;
        }
        bea.a(this.r, t, t2);
    }

    private final void a(T t, T t2, int i) {
        long c = c(i) & 1048575;
        if (!a((bdl<T>) t2, i)) {
            return;
        }
        Object f = beu.f(t, c);
        Object f2 = beu.f(t2, c);
        if (f != null && f2 != null) {
            beu.a(t, c, bcd.a(f, f2));
            b((bdl<T>) t, i);
        } else if (f2 == null) {
        } else {
            beu.a(t, c, f2);
            b((bdl<T>) t, i);
        }
    }

    private final void b(T t, T t2, int i) {
        int c = c(i);
        int i2 = this.c[i];
        long j = c & 1048575;
        if (!a((bdl<T>) t2, i2, i)) {
            return;
        }
        Object f = beu.f(t, j);
        Object f2 = beu.f(t2, j);
        if (f != null && f2 != null) {
            beu.a(t, j, bcd.a(f, f2));
            b((bdl<T>) t, i2, i);
        } else if (f2 == null) {
        } else {
            beu.a(t, j, f2);
            b((bdl<T>) t, i2, i);
        }
    }

    @Override // defpackage.bdy
    public final int b(T t) {
        int i;
        int i2;
        int j;
        int i3;
        int i4;
        int i5;
        int j2;
        int i6;
        int i7;
        int i8;
        int i9 = 267386880;
        int i10 = 1048575;
        if (this.j) {
            Unsafe unsafe = b;
            int i11 = 0;
            for (int i12 = 0; i12 < this.c.length; i12 += 3) {
                int c = c(i12);
                int i13 = (c & 267386880) >>> 20;
                int i14 = this.c[i12];
                long j3 = c & 1048575;
                int i15 = (i13 < bbv.DOUBLE_LIST_PACKED.id() || i13 > bbv.SINT64_LIST_PACKED.id()) ? 0 : this.c[i12 + 2] & 1048575;
                switch (i13) {
                    case 0:
                        if (a((bdl<T>) t, i12)) {
                            j2 = zzaj.j(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 1:
                        if (a((bdl<T>) t, i12)) {
                            j2 = zzaj.i(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if (a((bdl<T>) t, i12)) {
                            j2 = zzaj.d(i14, beu.b(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if (a((bdl<T>) t, i12)) {
                            j2 = zzaj.e(i14, beu.b(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if (a((bdl<T>) t, i12)) {
                            j2 = zzaj.f(i14, beu.a(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if (a((bdl<T>) t, i12)) {
                            j2 = zzaj.g(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if (a((bdl<T>) t, i12)) {
                            j2 = zzaj.e(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if (a((bdl<T>) t, i12)) {
                            j2 = zzaj.k(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        if (a((bdl<T>) t, i12)) {
                            Object f = beu.f(t, j3);
                            if (f instanceof bgb) {
                                j2 = zzaj.c(i14, (bgb) f);
                                break;
                            } else {
                                j2 = zzaj.b(i14, (String) f);
                                break;
                            }
                        } else {
                            continue;
                        }
                    case 9:
                        if (a((bdl<T>) t, i12)) {
                            j2 = bea.a(i14, beu.f(t, j3), a(i12));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        if (a((bdl<T>) t, i12)) {
                            j2 = zzaj.c(i14, (bgb) beu.f(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        if (a((bdl<T>) t, i12)) {
                            j2 = zzaj.g(i14, beu.a(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        if (a((bdl<T>) t, i12)) {
                            j2 = zzaj.i(i14, beu.a(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        if (a((bdl<T>) t, i12)) {
                            j2 = zzaj.f(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        if (a((bdl<T>) t, i12)) {
                            j2 = zzaj.h(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if (a((bdl<T>) t, i12)) {
                            j2 = zzaj.h(i14, beu.a(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if (a((bdl<T>) t, i12)) {
                            j2 = zzaj.f(i14, beu.b(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if (a((bdl<T>) t, i12)) {
                            j2 = zzaj.c(i14, (bdh) beu.f(t, j3), a(i12));
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        j2 = bea.i(i14, a(t, j3));
                        break;
                    case 19:
                        j2 = bea.h(i14, a(t, j3));
                        break;
                    case 20:
                        j2 = bea.a(i14, (List<Long>) a(t, j3));
                        break;
                    case 21:
                        j2 = bea.b(i14, a(t, j3));
                        break;
                    case 22:
                        j2 = bea.e(i14, a(t, j3));
                        break;
                    case 23:
                        j2 = bea.i(i14, a(t, j3));
                        break;
                    case 24:
                        j2 = bea.h(i14, a(t, j3));
                        break;
                    case 25:
                        j2 = bea.j(i14, a(t, j3));
                        break;
                    case 26:
                        j2 = bea.k(i14, a(t, j3));
                        break;
                    case 27:
                        j2 = bea.a(i14, a(t, j3), a(i12));
                        break;
                    case 28:
                        j2 = bea.l(i14, a(t, j3));
                        break;
                    case 29:
                        j2 = bea.f(i14, a(t, j3));
                        break;
                    case 30:
                        j2 = bea.d(i14, a(t, j3));
                        break;
                    case 31:
                        j2 = bea.h(i14, a(t, j3));
                        break;
                    case 32:
                        j2 = bea.i(i14, a(t, j3));
                        break;
                    case 33:
                        j2 = bea.g(i14, a(t, j3));
                        break;
                    case 34:
                        j2 = bea.c(i14, a(t, j3));
                        break;
                    case 35:
                        i7 = bea.i((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = zzaj.l(i14);
                            i6 = zzaj.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 36:
                        i7 = bea.h((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = zzaj.l(i14);
                            i6 = zzaj.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 37:
                        i7 = bea.a((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = zzaj.l(i14);
                            i6 = zzaj.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 38:
                        i7 = bea.b((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = zzaj.l(i14);
                            i6 = zzaj.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 39:
                        i7 = bea.e((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = zzaj.l(i14);
                            i6 = zzaj.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 40:
                        i7 = bea.i((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = zzaj.l(i14);
                            i6 = zzaj.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 41:
                        i7 = bea.h((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = zzaj.l(i14);
                            i6 = zzaj.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 42:
                        i7 = bea.j((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = zzaj.l(i14);
                            i6 = zzaj.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 43:
                        i7 = bea.f((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = zzaj.l(i14);
                            i6 = zzaj.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 44:
                        i7 = bea.d((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = zzaj.l(i14);
                            i6 = zzaj.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 45:
                        i7 = bea.h((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = zzaj.l(i14);
                            i6 = zzaj.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 46:
                        i7 = bea.i((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = zzaj.l(i14);
                            i6 = zzaj.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 47:
                        i7 = bea.g((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = zzaj.l(i14);
                            i6 = zzaj.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 48:
                        i7 = bea.c((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = zzaj.l(i14);
                            i6 = zzaj.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 49:
                        j2 = bea.b(i14, (List<bdh>) a(t, j3), a(i12));
                        break;
                    case 50:
                        j2 = this.s.e(beu.f(t, j3));
                        break;
                    case 51:
                        if (a((bdl<T>) t, i14, i12)) {
                            j2 = zzaj.j(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 52:
                        if (a((bdl<T>) t, i14, i12)) {
                            j2 = zzaj.i(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 53:
                        if (a((bdl<T>) t, i14, i12)) {
                            j2 = zzaj.d(i14, e(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 54:
                        if (a((bdl<T>) t, i14, i12)) {
                            j2 = zzaj.e(i14, e(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 55:
                        if (a((bdl<T>) t, i14, i12)) {
                            j2 = zzaj.f(i14, d(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 56:
                        if (a((bdl<T>) t, i14, i12)) {
                            j2 = zzaj.g(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 57:
                        if (a((bdl<T>) t, i14, i12)) {
                            j2 = zzaj.e(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 58:
                        if (a((bdl<T>) t, i14, i12)) {
                            j2 = zzaj.k(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 59:
                        if (a((bdl<T>) t, i14, i12)) {
                            Object f2 = beu.f(t, j3);
                            if (f2 instanceof bgb) {
                                j2 = zzaj.c(i14, (bgb) f2);
                                break;
                            } else {
                                j2 = zzaj.b(i14, (String) f2);
                                break;
                            }
                        } else {
                            continue;
                        }
                    case 60:
                        if (a((bdl<T>) t, i14, i12)) {
                            j2 = bea.a(i14, beu.f(t, j3), a(i12));
                            break;
                        } else {
                            continue;
                        }
                    case 61:
                        if (a((bdl<T>) t, i14, i12)) {
                            j2 = zzaj.c(i14, (bgb) beu.f(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 62:
                        if (a((bdl<T>) t, i14, i12)) {
                            j2 = zzaj.g(i14, d(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 63:
                        if (a((bdl<T>) t, i14, i12)) {
                            j2 = zzaj.i(i14, d(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 64:
                        if (a((bdl<T>) t, i14, i12)) {
                            j2 = zzaj.f(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 65:
                        if (a((bdl<T>) t, i14, i12)) {
                            j2 = zzaj.h(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 66:
                        if (a((bdl<T>) t, i14, i12)) {
                            j2 = zzaj.h(i14, d(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 67:
                        if (a((bdl<T>) t, i14, i12)) {
                            j2 = zzaj.f(i14, e(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 68:
                        if (a((bdl<T>) t, i14, i12)) {
                            j2 = zzaj.c(i14, (bdh) beu.f(t, j3), a(i12));
                            break;
                        } else {
                            continue;
                        }
                    default:
                }
                i11 += j2;
            }
            return i11 + a((beo) this.q, (Object) t);
        }
        Unsafe unsafe2 = b;
        int i16 = -1;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i17 < this.c.length) {
            int c2 = c(i17);
            int[] iArr = this.c;
            int i20 = iArr[i17];
            int i21 = (c2 & i9) >>> 20;
            if (i21 <= 17) {
                i2 = iArr[i17 + 2];
                int i22 = i2 & i10;
                i = 1 << (i2 >>> 20);
                if (i22 != i16) {
                    i19 = unsafe2.getInt(t, i22);
                    i16 = i22;
                }
            } else {
                i2 = (!this.k || i21 < bbv.DOUBLE_LIST_PACKED.id() || i21 > bbv.SINT64_LIST_PACKED.id()) ? 0 : this.c[i17 + 2] & i10;
                i = 0;
            }
            long j4 = c2 & i10;
            switch (i21) {
                case 0:
                    if ((i19 & i) != 0) {
                        j = zzaj.j(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i19 & i) != 0) {
                        j = zzaj.i(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i19 & i) != 0) {
                        j = zzaj.d(i20, unsafe2.getLong(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i19 & i) != 0) {
                        j = zzaj.e(i20, unsafe2.getLong(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i19 & i) != 0) {
                        j = zzaj.f(i20, unsafe2.getInt(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i19 & i) != 0) {
                        j = zzaj.g(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i19 & i) != 0) {
                        j = zzaj.e(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i19 & i) != 0) {
                        j = zzaj.k(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i19 & i) != 0) {
                        Object object = unsafe2.getObject(t, j4);
                        if (object instanceof bgb) {
                            j = zzaj.c(i20, (bgb) object);
                        } else {
                            j = zzaj.b(i20, (String) object);
                        }
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if ((i19 & i) != 0) {
                        j = bea.a(i20, unsafe2.getObject(t, j4), a(i17));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i19 & i) != 0) {
                        j = zzaj.c(i20, (bgb) unsafe2.getObject(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i19 & i) != 0) {
                        j = zzaj.g(i20, unsafe2.getInt(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i19 & i) != 0) {
                        j = zzaj.i(i20, unsafe2.getInt(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i19 & i) != 0) {
                        j = zzaj.f(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i19 & i) != 0) {
                        j = zzaj.h(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i19 & i) != 0) {
                        j = zzaj.h(i20, unsafe2.getInt(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i19 & i) != 0) {
                        j = zzaj.f(i20, unsafe2.getLong(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i19 & i) != 0) {
                        j = zzaj.c(i20, (bdh) unsafe2.getObject(t, j4), a(i17));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    j = bea.i(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 19:
                    j = bea.h(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 20:
                    j = bea.a(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 21:
                    j = bea.b(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 22:
                    j = bea.e(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 23:
                    j = bea.i(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 24:
                    j = bea.h(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 25:
                    j = bea.j(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 26:
                    j = bea.k(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 27:
                    j = bea.a(i20, (List<?>) unsafe2.getObject(t, j4), a(i17));
                    i18 += j;
                    break;
                case 28:
                    j = bea.l(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 29:
                    j = bea.f(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 30:
                    j = bea.d(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 31:
                    j = bea.h(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 32:
                    j = bea.i(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 33:
                    j = bea.g(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 34:
                    j = bea.c(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 35:
                    i5 = bea.i((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = zzaj.l(i20);
                        i3 = zzaj.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 36:
                    i5 = bea.h((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = zzaj.l(i20);
                        i3 = zzaj.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 37:
                    i5 = bea.a((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = zzaj.l(i20);
                        i3 = zzaj.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 38:
                    i5 = bea.b((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = zzaj.l(i20);
                        i3 = zzaj.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 39:
                    i5 = bea.e((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = zzaj.l(i20);
                        i3 = zzaj.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 40:
                    i5 = bea.i((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = zzaj.l(i20);
                        i3 = zzaj.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 41:
                    i5 = bea.h((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = zzaj.l(i20);
                        i3 = zzaj.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 42:
                    i5 = bea.j((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = zzaj.l(i20);
                        i3 = zzaj.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 43:
                    i5 = bea.f((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = zzaj.l(i20);
                        i3 = zzaj.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 44:
                    i5 = bea.d((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = zzaj.l(i20);
                        i3 = zzaj.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 45:
                    i5 = bea.h((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = zzaj.l(i20);
                        i3 = zzaj.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 46:
                    i5 = bea.i((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = zzaj.l(i20);
                        i3 = zzaj.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 47:
                    i5 = bea.g((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = zzaj.l(i20);
                        i3 = zzaj.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 48:
                    i5 = bea.c((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = zzaj.l(i20);
                        i3 = zzaj.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 49:
                    j = bea.b(i20, (List) unsafe2.getObject(t, j4), a(i17));
                    i18 += j;
                    break;
                case 50:
                    j = this.s.e(unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 51:
                    if (a((bdl<T>) t, i20, i17)) {
                        j = zzaj.j(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (a((bdl<T>) t, i20, i17)) {
                        j = zzaj.i(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (a((bdl<T>) t, i20, i17)) {
                        j = zzaj.d(i20, e(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (a((bdl<T>) t, i20, i17)) {
                        j = zzaj.e(i20, e(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (a((bdl<T>) t, i20, i17)) {
                        j = zzaj.f(i20, d(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (a((bdl<T>) t, i20, i17)) {
                        j = zzaj.g(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (a((bdl<T>) t, i20, i17)) {
                        j = zzaj.e(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (a((bdl<T>) t, i20, i17)) {
                        j = zzaj.k(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (a((bdl<T>) t, i20, i17)) {
                        Object object2 = unsafe2.getObject(t, j4);
                        if (object2 instanceof bgb) {
                            j = zzaj.c(i20, (bgb) object2);
                        } else {
                            j = zzaj.b(i20, (String) object2);
                        }
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (a((bdl<T>) t, i20, i17)) {
                        j = bea.a(i20, unsafe2.getObject(t, j4), a(i17));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (a((bdl<T>) t, i20, i17)) {
                        j = zzaj.c(i20, (bgb) unsafe2.getObject(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (a((bdl<T>) t, i20, i17)) {
                        j = zzaj.g(i20, d(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (a((bdl<T>) t, i20, i17)) {
                        j = zzaj.i(i20, d(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (a((bdl<T>) t, i20, i17)) {
                        j = zzaj.f(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (a((bdl<T>) t, i20, i17)) {
                        j = zzaj.h(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (a((bdl<T>) t, i20, i17)) {
                        j = zzaj.h(i20, d(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (a((bdl<T>) t, i20, i17)) {
                        j = zzaj.f(i20, e(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (a((bdl<T>) t, i20, i17)) {
                        j = zzaj.c(i20, (bdh) unsafe2.getObject(t, j4), a(i17));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
            }
            i17 += 3;
            i9 = 267386880;
            i10 = 1048575;
        }
        int a2 = i18 + a((beo) this.q, (Object) t);
        if (!this.h) {
            return a2;
        }
        bbu<?> a3 = this.r.a(t);
        int i23 = 0;
        for (int i24 = 0; i24 < a3.a.b(); i24++) {
            Map.Entry<?, Object> b2 = a3.a.b(i24);
            i23 += bbu.a((bbw) b2.getKey(), b2.getValue());
        }
        for (Map.Entry<?, Object> entry : a3.a.c()) {
            i23 += bbu.a((bbw) entry.getKey(), entry.getValue());
        }
        return a2 + i23;
    }

    private static <UT, UB> int a(beo<UT, UB> beoVar, T t) {
        return beoVar.d(beoVar.a(t));
    }

    private static List<?> a(Object obj, long j) {
        return (List) beu.f(obj, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0a44  */
    @Override // defpackage.bdy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(T r14, defpackage.bfi r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2942
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdl.a(java.lang.Object, bfi):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0496  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b(T r19, defpackage.bfi r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdl.b(java.lang.Object, bfi):void");
    }

    private final <K, V> void a(bfi bfiVar, int i, Object obj) throws IOException {
        if (obj != null) {
            bfiVar.a(i, this.s.b(), this.s.b(obj));
        }
    }

    private static <UT, UB> void a(beo<UT, UB> beoVar, T t, bfi bfiVar) throws IOException {
        beoVar.a((beo<UT, UB>) beoVar.a(t), bfiVar);
    }

    private static ben e(Object obj) {
        bcc bccVar = (bcc) obj;
        ben benVar = bccVar.zzih;
        if (benVar == ben.a()) {
            ben b2 = ben.b();
            bccVar.zzih = b2;
            return b2;
        }
        return benVar;
    }

    private static int a(byte[] bArr, int i, int i2, bfc bfcVar, Class<?> cls, bfw bfwVar) throws IOException {
        switch (bdk.a[bfcVar.ordinal()]) {
            case 1:
                int b2 = bfx.b(bArr, i, bfwVar);
                bfwVar.c = Boolean.valueOf(bfwVar.b != 0);
                return b2;
            case 2:
                return bfx.e(bArr, i, bfwVar);
            case 3:
                bfwVar.c = Double.valueOf(bfx.c(bArr, i));
                return i + 8;
            case 4:
            case 5:
                bfwVar.c = Integer.valueOf(bfx.a(bArr, i));
                return i + 4;
            case 6:
            case 7:
                bfwVar.c = Long.valueOf(bfx.b(bArr, i));
                return i + 8;
            case 8:
                bfwVar.c = Float.valueOf(bfx.d(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int a2 = bfx.a(bArr, i, bfwVar);
                bfwVar.c = Integer.valueOf(bfwVar.a);
                return a2;
            case 12:
            case 13:
                int b3 = bfx.b(bArr, i, bfwVar);
                bfwVar.c = Long.valueOf(bfwVar.b);
                return b3;
            case 14:
                return bfx.a(bds.a().a((Class) cls), bArr, i, i2, bfwVar);
            case 15:
                int a3 = bfx.a(bArr, i, bfwVar);
                bfwVar.c = Integer.valueOf(bbj.b(bfwVar.a));
                return a3;
            case 16:
                int b4 = bfx.b(bArr, i, bfwVar);
                bfwVar.c = Long.valueOf(bbj.a(bfwVar.b));
                return b4;
            case 17:
                return bfx.d(bArr, i, bfwVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01eb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x0236 -> B:113:0x0237). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x016e -> B:64:0x016f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x01e8 -> B:93:0x01e9). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, defpackage.bfw r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1128
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdl.a(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, bfw):int");
    }

    private final <K, V> int a(T t, byte[] bArr, int i, int i2, long j, bfw bfwVar) throws IOException {
        Unsafe unsafe = b;
        Object object = unsafe.getObject(t, j);
        if (this.s.c(object)) {
            Object a2 = this.s.a();
            this.s.a(a2, object);
            unsafe.putObject(t, j, a2);
            object = a2;
        }
        bcy<?, ?> b2 = this.s.b();
        Map<?, ?> a3 = this.s.a(object);
        int a4 = bfx.a(bArr, i, bfwVar);
        int i3 = bfwVar.a;
        if (i3 < 0 || i3 > i2 - a4) {
            throw zzbk.a();
        }
        int i4 = i3 + a4;
        Object obj = (K) b2.b;
        Object obj2 = (V) b2.d;
        while (a4 < i4) {
            int i5 = a4 + 1;
            int i6 = bArr[a4];
            if (i6 < 0) {
                i5 = bfx.a(i6, bArr, i5, bfwVar);
                i6 = bfwVar.a;
            }
            int i7 = i5;
            int i8 = i6 >>> 3;
            int i9 = i6 & 7;
            if (i8 == 1) {
                if (i9 == b2.a.zzds()) {
                    a4 = a(bArr, i7, i2, b2.a, (Class<?>) null, bfwVar);
                    obj = (K) bfwVar.c;
                } else {
                    a4 = bfx.a(i6, bArr, i7, i2, bfwVar);
                }
            } else {
                if (i8 == 2 && i9 == b2.c.zzds()) {
                    a4 = a(bArr, i7, i2, b2.c, b2.d.getClass(), bfwVar);
                    obj2 = (V) bfwVar.c;
                }
                a4 = bfx.a(i6, bArr, i7, i2, bfwVar);
            }
        }
        if (a4 != i4) {
            throw zzbk.e();
        }
        a3.put(obj, obj2);
        return i4;
    }

    private final int a(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, bfw bfwVar) throws IOException {
        int i9;
        Unsafe unsafe = b;
        long j2 = this.c[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Double.valueOf(bfx.c(bArr, i)));
                    i9 = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Float.valueOf(bfx.d(bArr, i)));
                    i9 = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    i9 = bfx.b(bArr, i, bfwVar);
                    unsafe.putObject(t, j, Long.valueOf(bfwVar.b));
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    i9 = bfx.a(bArr, i, bfwVar);
                    unsafe.putObject(t, j, Integer.valueOf(bfwVar.a));
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(bfx.b(bArr, i)));
                    i9 = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(bfx.a(bArr, i)));
                    i9 = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    i9 = bfx.b(bArr, i, bfwVar);
                    unsafe.putObject(t, j, Boolean.valueOf(bfwVar.b != 0));
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    int a2 = bfx.a(bArr, i, bfwVar);
                    int i10 = bfwVar.a;
                    if (i10 == 0) {
                        unsafe.putObject(t, j, "");
                    } else if ((i6 & 536870912) != 0 && !bex.a(bArr, a2, a2 + i10)) {
                        throw zzbk.f();
                    } else {
                        unsafe.putObject(t, j, new String(bArr, a2, i10, bcd.a));
                        a2 += i10;
                    }
                    unsafe.putInt(t, j2, i4);
                    return a2;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    int a3 = bfx.a(a(i8), bArr, i, i2, bfwVar);
                    Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, bfwVar.c);
                    } else {
                        unsafe.putObject(t, j, bcd.a(object, bfwVar.c));
                    }
                    unsafe.putInt(t, j2, i4);
                    return a3;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    i9 = bfx.e(bArr, i, bfwVar);
                    unsafe.putObject(t, j, bfwVar.c);
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int a4 = bfx.a(bArr, i, bfwVar);
                    int i11 = bfwVar.a;
                    bcf b2 = b(i8);
                    if (b2 == null || b2.a()) {
                        unsafe.putObject(t, j, Integer.valueOf(i11));
                        i9 = a4;
                        unsafe.putInt(t, j2, i4);
                        return i9;
                    }
                    e(t).a(i3, Long.valueOf(i11));
                    return a4;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    i9 = bfx.a(bArr, i, bfwVar);
                    unsafe.putObject(t, j, Integer.valueOf(bbj.b(bfwVar.a)));
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    i9 = bfx.b(bArr, i, bfwVar);
                    unsafe.putObject(t, j, Long.valueOf(bbj.a(bfwVar.b)));
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    i9 = bfx.a(a(i8), bArr, i, i2, (i3 & (-8)) | 4, bfwVar);
                    Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j, bfwVar.c);
                    } else {
                        unsafe.putObject(t, j, bcd.a(object2, bfwVar.c));
                    }
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            default:
                return i;
        }
    }

    private final bdy a(int i) {
        int i2 = (i / 3) << 1;
        bdy bdyVar = (bdy) this.d[i2];
        if (bdyVar != null) {
            return bdyVar;
        }
        bdy<T> a2 = bds.a().a((Class) ((Class) this.d[i2 + 1]));
        this.d[i2] = a2;
        return a2;
    }

    private final bcf b(int i) {
        return (bcf) this.d[((i / 3) << 1) + 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(T t, byte[] bArr, int i, int i2, int i3, bfw bfwVar) throws IOException {
        Unsafe unsafe;
        int i4;
        T t2;
        bdl<T> bdlVar;
        int i5;
        int i6;
        int i7;
        int i8;
        bcf b2;
        byte b3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        T t3;
        bfw bfwVar2;
        bfw bfwVar3;
        int i14;
        int i15;
        int i16;
        int i17;
        bfw bfwVar4;
        int i18;
        int i19;
        bfw bfwVar5;
        int i20;
        int i21;
        int i22;
        bdl<T> bdlVar2 = this;
        T t4 = t;
        byte[] bArr2 = bArr;
        int i23 = i2;
        int i24 = i3;
        bfw bfwVar6 = bfwVar;
        Unsafe unsafe2 = b;
        int i25 = i;
        int i26 = -1;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = -1;
        while (true) {
            if (i25 < i23) {
                int i31 = i25 + 1;
                byte b4 = bArr2[i25];
                if (b4 < 0) {
                    i9 = bfx.a(b4, bArr2, i31, bfwVar6);
                    b3 = bfwVar6.a;
                } else {
                    b3 = b4;
                    i9 = i31;
                }
                int i32 = b3 >>> 3;
                int i33 = b3 & 7;
                if (i32 > i26) {
                    i10 = bdlVar2.a(i32, i27 / 3);
                } else {
                    i10 = bdlVar2.e(i32);
                }
                int i34 = i10;
                if (i34 == -1) {
                    i11 = i32;
                    i12 = i9;
                    i6 = b3;
                    unsafe = unsafe2;
                    i4 = i24;
                    i13 = 0;
                } else {
                    int[] iArr = bdlVar2.c;
                    int i35 = iArr[i34 + 1];
                    int i36 = (i35 & 267386880) >>> 20;
                    int i37 = b3;
                    long j = i35 & 1048575;
                    if (i36 <= 17) {
                        int i38 = iArr[i34 + 2];
                        int i39 = 1 << (i38 >>> 20);
                        int i40 = i38 & 1048575;
                        if (i40 != i30) {
                            if (i30 != -1) {
                                unsafe2.putInt(t4, i30, i29);
                            }
                            i29 = unsafe2.getInt(t4, i40);
                            i30 = i40;
                        }
                        switch (i36) {
                            case 0:
                                i14 = i34;
                                i15 = i32;
                                i17 = i30;
                                i16 = i37;
                                bArr2 = bArr;
                                bfwVar4 = bfwVar;
                                i18 = i9;
                                if (i33 == 1) {
                                    beu.a(t4, j, bfx.c(bArr2, i18));
                                    i25 = i18 + 8;
                                    i29 |= i39;
                                    i30 = i17;
                                    i28 = i16;
                                    i27 = i14;
                                    i26 = i15;
                                    bfwVar6 = bfwVar4;
                                    i23 = i2;
                                    i24 = i3;
                                    break;
                                } else {
                                    i12 = i18;
                                    i13 = i14;
                                    unsafe = unsafe2;
                                    i11 = i15;
                                    i30 = i17;
                                    i6 = i16;
                                    i4 = i3;
                                    break;
                                }
                            case 1:
                                i14 = i34;
                                i15 = i32;
                                i17 = i30;
                                i16 = i37;
                                bArr2 = bArr;
                                bfwVar4 = bfwVar;
                                i18 = i9;
                                if (i33 == 5) {
                                    beu.a((Object) t4, j, bfx.d(bArr2, i18));
                                    i25 = i18 + 4;
                                    i29 |= i39;
                                    i30 = i17;
                                    i28 = i16;
                                    i27 = i14;
                                    i26 = i15;
                                    bfwVar6 = bfwVar4;
                                    i23 = i2;
                                    i24 = i3;
                                    break;
                                } else {
                                    i12 = i18;
                                    i13 = i14;
                                    unsafe = unsafe2;
                                    i11 = i15;
                                    i30 = i17;
                                    i6 = i16;
                                    i4 = i3;
                                    break;
                                }
                            case 2:
                            case 3:
                                i14 = i34;
                                i15 = i32;
                                i17 = i30;
                                i16 = i37;
                                bArr2 = bArr;
                                i18 = i9;
                                if (i33 == 0) {
                                    int b5 = bfx.b(bArr2, i18, bfwVar);
                                    unsafe2.putLong(t, j, bfwVar.b);
                                    i29 |= i39;
                                    i25 = b5;
                                    i28 = i16;
                                    i27 = i14;
                                    i26 = i15;
                                    bfwVar6 = bfwVar;
                                    i30 = i17;
                                    i23 = i2;
                                    i24 = i3;
                                    break;
                                } else {
                                    i12 = i18;
                                    i13 = i14;
                                    unsafe = unsafe2;
                                    i11 = i15;
                                    i30 = i17;
                                    i6 = i16;
                                    i4 = i3;
                                    break;
                                }
                            case 4:
                            case 11:
                                i14 = i34;
                                i15 = i32;
                                i17 = i30;
                                i16 = i37;
                                bArr2 = bArr;
                                bfwVar4 = bfwVar;
                                i18 = i9;
                                if (i33 == 0) {
                                    i25 = bfx.a(bArr2, i18, bfwVar4);
                                    unsafe2.putInt(t4, j, bfwVar4.a);
                                    i29 |= i39;
                                    i30 = i17;
                                    i28 = i16;
                                    i27 = i14;
                                    i26 = i15;
                                    bfwVar6 = bfwVar4;
                                    i23 = i2;
                                    i24 = i3;
                                    break;
                                } else {
                                    i12 = i18;
                                    i13 = i14;
                                    unsafe = unsafe2;
                                    i11 = i15;
                                    i30 = i17;
                                    i6 = i16;
                                    i4 = i3;
                                    break;
                                }
                            case 5:
                            case 14:
                                i14 = i34;
                                i15 = i32;
                                i16 = i37;
                                bArr2 = bArr;
                                bfwVar4 = bfwVar;
                                if (i33 == 1) {
                                    i17 = i30;
                                    i18 = i9;
                                    unsafe2.putLong(t, j, bfx.b(bArr2, i9));
                                    i25 = i18 + 8;
                                    i29 |= i39;
                                    i30 = i17;
                                    i28 = i16;
                                    i27 = i14;
                                    i26 = i15;
                                    bfwVar6 = bfwVar4;
                                    i23 = i2;
                                    i24 = i3;
                                    break;
                                } else {
                                    i17 = i30;
                                    i18 = i9;
                                    i12 = i18;
                                    i13 = i14;
                                    unsafe = unsafe2;
                                    i11 = i15;
                                    i30 = i17;
                                    i6 = i16;
                                    i4 = i3;
                                    break;
                                }
                            case 6:
                            case 13:
                                i19 = i2;
                                i14 = i34;
                                i15 = i32;
                                i16 = i37;
                                bArr2 = bArr;
                                bfwVar5 = bfwVar;
                                if (i33 == 5) {
                                    unsafe2.putInt(t4, j, bfx.a(bArr2, i9));
                                    i25 = i9 + 4;
                                    i29 |= i39;
                                    i28 = i16;
                                    i27 = i14;
                                    i26 = i15;
                                    bfwVar6 = bfwVar5;
                                    i24 = i3;
                                    i23 = i19;
                                    break;
                                } else {
                                    i17 = i30;
                                    i18 = i9;
                                    i12 = i18;
                                    i13 = i14;
                                    unsafe = unsafe2;
                                    i11 = i15;
                                    i30 = i17;
                                    i6 = i16;
                                    i4 = i3;
                                    break;
                                }
                            case 7:
                                i19 = i2;
                                i14 = i34;
                                i15 = i32;
                                i16 = i37;
                                bArr2 = bArr;
                                bfwVar5 = bfwVar;
                                if (i33 == 0) {
                                    int b6 = bfx.b(bArr2, i9, bfwVar5);
                                    beu.a(t4, j, bfwVar5.b != 0);
                                    i29 |= i39;
                                    i25 = b6;
                                    i28 = i16;
                                    i27 = i14;
                                    i26 = i15;
                                    bfwVar6 = bfwVar5;
                                    i24 = i3;
                                    i23 = i19;
                                    break;
                                } else {
                                    i17 = i30;
                                    i18 = i9;
                                    i12 = i18;
                                    i13 = i14;
                                    unsafe = unsafe2;
                                    i11 = i15;
                                    i30 = i17;
                                    i6 = i16;
                                    i4 = i3;
                                    break;
                                }
                            case 8:
                                i19 = i2;
                                i14 = i34;
                                i15 = i32;
                                i16 = i37;
                                bArr2 = bArr;
                                bfwVar5 = bfwVar;
                                if (i33 == 2) {
                                    if ((i35 & 536870912) == 0) {
                                        i25 = bfx.c(bArr2, i9, bfwVar5);
                                    } else {
                                        i25 = bfx.d(bArr2, i9, bfwVar5);
                                    }
                                    unsafe2.putObject(t4, j, bfwVar5.c);
                                    i29 |= i39;
                                    i28 = i16;
                                    i27 = i14;
                                    i26 = i15;
                                    bfwVar6 = bfwVar5;
                                    i24 = i3;
                                    i23 = i19;
                                    break;
                                } else {
                                    i17 = i30;
                                    i18 = i9;
                                    i12 = i18;
                                    i13 = i14;
                                    unsafe = unsafe2;
                                    i11 = i15;
                                    i30 = i17;
                                    i6 = i16;
                                    i4 = i3;
                                    break;
                                }
                            case 9:
                                i14 = i34;
                                i15 = i32;
                                i16 = i37;
                                bArr2 = bArr;
                                bfwVar5 = bfwVar;
                                if (i33 == 2) {
                                    i19 = i2;
                                    i25 = bfx.a(bdlVar2.a(i14), bArr2, i9, i19, bfwVar5);
                                    if ((i29 & i39) == 0) {
                                        unsafe2.putObject(t4, j, bfwVar5.c);
                                    } else {
                                        unsafe2.putObject(t4, j, bcd.a(unsafe2.getObject(t4, j), bfwVar5.c));
                                    }
                                    i29 |= i39;
                                    i28 = i16;
                                    i27 = i14;
                                    i26 = i15;
                                    bfwVar6 = bfwVar5;
                                    i24 = i3;
                                    i23 = i19;
                                    break;
                                } else {
                                    i17 = i30;
                                    i18 = i9;
                                    i12 = i18;
                                    i13 = i14;
                                    unsafe = unsafe2;
                                    i11 = i15;
                                    i30 = i17;
                                    i6 = i16;
                                    i4 = i3;
                                    break;
                                }
                            case 10:
                                i14 = i34;
                                i15 = i32;
                                i16 = i37;
                                bArr2 = bArr;
                                bfwVar4 = bfwVar;
                                if (i33 == 2) {
                                    i25 = bfx.e(bArr2, i9, bfwVar4);
                                    unsafe2.putObject(t4, j, bfwVar4.c);
                                    i29 |= i39;
                                    i28 = i16;
                                    i27 = i14;
                                    i26 = i15;
                                    bfwVar6 = bfwVar4;
                                    i23 = i2;
                                    i24 = i3;
                                    break;
                                } else {
                                    i17 = i30;
                                    i18 = i9;
                                    i12 = i18;
                                    i13 = i14;
                                    unsafe = unsafe2;
                                    i11 = i15;
                                    i30 = i17;
                                    i6 = i16;
                                    i4 = i3;
                                    break;
                                }
                            case 12:
                                i14 = i34;
                                i15 = i32;
                                i16 = i37;
                                bArr2 = bArr;
                                bfwVar4 = bfwVar;
                                if (i33 != 0) {
                                    i17 = i30;
                                    i18 = i9;
                                    i12 = i18;
                                    i13 = i14;
                                    unsafe = unsafe2;
                                    i11 = i15;
                                    i30 = i17;
                                    i6 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    i25 = bfx.a(bArr2, i9, bfwVar4);
                                    int i41 = bfwVar4.a;
                                    bcf b7 = bdlVar2.b(i14);
                                    if (b7 == null || b7.a()) {
                                        unsafe2.putInt(t4, j, i41);
                                        i29 |= i39;
                                        i28 = i16;
                                        i27 = i14;
                                        i26 = i15;
                                        bfwVar6 = bfwVar4;
                                        i23 = i2;
                                        i24 = i3;
                                        break;
                                    } else {
                                        e(t).a(i16, Long.valueOf(i41));
                                        i28 = i16;
                                        i27 = i14;
                                        i26 = i15;
                                        bfwVar6 = bfwVar4;
                                        i23 = i2;
                                        i24 = i3;
                                    }
                                }
                                break;
                            case 15:
                                i14 = i34;
                                i15 = i32;
                                i16 = i37;
                                bArr2 = bArr;
                                bfwVar4 = bfwVar;
                                if (i33 == 0) {
                                    i25 = bfx.a(bArr2, i9, bfwVar4);
                                    unsafe2.putInt(t4, j, bbj.b(bfwVar4.a));
                                    i29 |= i39;
                                    i28 = i16;
                                    i27 = i14;
                                    i26 = i15;
                                    bfwVar6 = bfwVar4;
                                    i23 = i2;
                                    i24 = i3;
                                    break;
                                } else {
                                    i17 = i30;
                                    i18 = i9;
                                    i12 = i18;
                                    i13 = i14;
                                    unsafe = unsafe2;
                                    i11 = i15;
                                    i30 = i17;
                                    i6 = i16;
                                    i4 = i3;
                                    break;
                                }
                            case 16:
                                i14 = i34;
                                i15 = i32;
                                i16 = i37;
                                if (i33 == 0) {
                                    bArr2 = bArr;
                                    int b8 = bfx.b(bArr2, i9, bfwVar);
                                    bfwVar4 = bfwVar;
                                    unsafe2.putLong(t, j, bbj.a(bfwVar.b));
                                    i29 |= i39;
                                    i25 = b8;
                                    i28 = i16;
                                    i27 = i14;
                                    i26 = i15;
                                    bfwVar6 = bfwVar4;
                                    i23 = i2;
                                    i24 = i3;
                                    break;
                                } else {
                                    i17 = i30;
                                    i18 = i9;
                                    i12 = i18;
                                    i13 = i14;
                                    unsafe = unsafe2;
                                    i11 = i15;
                                    i30 = i17;
                                    i6 = i16;
                                    i4 = i3;
                                    break;
                                }
                            case 17:
                                if (i33 == 3) {
                                    i25 = bfx.a(bdlVar2.a(i34), bArr, i9, i2, (i32 << 3) | 4, bfwVar);
                                    if ((i29 & i39) == 0) {
                                        bfwVar3 = bfwVar;
                                        unsafe2.putObject(t4, j, bfwVar3.c);
                                    } else {
                                        bfwVar3 = bfwVar;
                                        unsafe2.putObject(t4, j, bcd.a(unsafe2.getObject(t4, j), bfwVar3.c));
                                    }
                                    i29 |= i39;
                                    bArr2 = bArr;
                                    i23 = i2;
                                    i28 = i37;
                                    i27 = i34;
                                    i26 = i32;
                                    i24 = i3;
                                    bfwVar6 = bfwVar3;
                                    break;
                                } else {
                                    i14 = i34;
                                    i15 = i32;
                                    i16 = i37;
                                    i17 = i30;
                                    i18 = i9;
                                    i12 = i18;
                                    i13 = i14;
                                    unsafe = unsafe2;
                                    i11 = i15;
                                    i30 = i17;
                                    i6 = i16;
                                    i4 = i3;
                                    break;
                                }
                            default:
                                i14 = i34;
                                i15 = i32;
                                i17 = i30;
                                i16 = i37;
                                i18 = i9;
                                i12 = i18;
                                i13 = i14;
                                unsafe = unsafe2;
                                i11 = i15;
                                i30 = i17;
                                i6 = i16;
                                i4 = i3;
                                break;
                        }
                    } else {
                        int i42 = i30;
                        int i43 = i9;
                        bArr2 = bArr;
                        bfw bfwVar7 = bfwVar6;
                        if (i36 != 27) {
                            i20 = i29;
                            if (i36 <= 49) {
                                i11 = i32;
                                i22 = i37;
                                i13 = i34;
                                unsafe = unsafe2;
                                i25 = a((bdl<T>) t, bArr, i43, i2, i37, i32, i33, i34, i35, i36, j, bfwVar);
                                if (i25 == i43) {
                                    i4 = i3;
                                    i12 = i25;
                                } else {
                                    bdlVar2 = this;
                                    t4 = t;
                                    bArr2 = bArr;
                                    i23 = i2;
                                    i24 = i3;
                                    bfwVar6 = bfwVar;
                                    i30 = i42;
                                    i27 = i13;
                                    i29 = i20;
                                    i26 = i11;
                                    i28 = i22;
                                    unsafe2 = unsafe;
                                }
                            } else {
                                i11 = i32;
                                i21 = i43;
                                i22 = i37;
                                i13 = i34;
                                unsafe = unsafe2;
                                if (i36 != 50) {
                                    i25 = a((bdl<T>) t, bArr, i21, i2, i22, i11, i33, i35, i36, j, i13, bfwVar);
                                    if (i25 != i21) {
                                        bdlVar2 = this;
                                        t4 = t;
                                        i23 = i2;
                                        i24 = i3;
                                        i28 = i22;
                                        i26 = i11;
                                        i30 = i42;
                                        i27 = i13;
                                        i29 = i20;
                                        unsafe2 = unsafe;
                                        bArr2 = bArr;
                                        bfwVar6 = bfwVar;
                                    }
                                } else if (i33 == 2) {
                                    i25 = a((bdl<T>) t, bArr, i21, i2, j, bfwVar);
                                    if (i25 != i21) {
                                        bdlVar2 = this;
                                        t4 = t;
                                        bArr2 = bArr;
                                        i23 = i2;
                                        i24 = i3;
                                        bfwVar6 = bfwVar;
                                        i30 = i42;
                                        i27 = i13;
                                        i29 = i20;
                                        i26 = i11;
                                        i28 = i22;
                                        unsafe2 = unsafe;
                                    }
                                } else {
                                    i4 = i3;
                                    i12 = i21;
                                }
                                i4 = i3;
                                i12 = i25;
                            }
                        } else if (i33 == 2) {
                            bch bchVar = (bch) unsafe2.getObject(t4, j);
                            if (!bchVar.c()) {
                                int size = bchVar.size();
                                bchVar = bchVar.a(size == 0 ? 10 : size << 1);
                                unsafe2.putObject(t4, j, bchVar);
                            }
                            i25 = bfx.a(bdlVar2.a(i34), i37, bArr, i43, i2, bchVar, bfwVar);
                            i24 = i3;
                            i26 = i32;
                            i28 = i37;
                            i27 = i34;
                            bfwVar6 = bfwVar7;
                            i30 = i42;
                            i29 = i29;
                            i23 = i2;
                        } else {
                            i20 = i29;
                            i11 = i32;
                            i21 = i43;
                            i22 = i37;
                            i13 = i34;
                            unsafe = unsafe2;
                            i4 = i3;
                            i12 = i21;
                        }
                        i30 = i42;
                        i29 = i20;
                        i6 = i22;
                    }
                }
                if (i6 != i4 || i4 == 0) {
                    if (this.h) {
                        bfwVar2 = bfwVar;
                        if (bfwVar2.d != bbo.a()) {
                            int i44 = i11;
                            if (bfwVar2.d.a(this.g, i44) == null) {
                                i25 = bfx.a(i6, bArr, i12, i2, e(t), bfwVar);
                                t4 = t;
                                i23 = i2;
                                i28 = i6;
                                bdlVar2 = this;
                                bfwVar6 = bfwVar2;
                                i26 = i44;
                                i27 = i13;
                                unsafe2 = unsafe;
                                bArr2 = bArr;
                                i24 = i4;
                            } else {
                                ((bcc.b) t).h();
                                throw new NoSuchMethodError();
                            }
                        } else {
                            t3 = t;
                        }
                    } else {
                        t3 = t;
                        bfwVar2 = bfwVar;
                    }
                    i25 = bfx.a(i6, bArr, i12, i2, e(t), bfwVar);
                    i28 = i6;
                    bdlVar2 = this;
                    bfwVar6 = bfwVar2;
                    i26 = i11;
                    t4 = t3;
                    i27 = i13;
                    unsafe2 = unsafe;
                    bArr2 = bArr;
                    i23 = i2;
                    i24 = i4;
                } else {
                    bdlVar = this;
                    t2 = t;
                    i7 = i29;
                    i8 = -1;
                    i5 = i12;
                }
            } else {
                int i45 = i29;
                unsafe = unsafe2;
                i4 = i24;
                t2 = t4;
                bdlVar = bdlVar2;
                i5 = i25;
                i6 = i28;
                i7 = i45;
                i8 = -1;
            }
        }
        if (i30 != i8) {
            unsafe.putInt(t2, i30, i7);
        }
        Object obj = null;
        for (int i46 = bdlVar.m; i46 < bdlVar.n; i46++) {
            int i47 = bdlVar.l[i46];
            beo beoVar = bdlVar.q;
            int i48 = bdlVar.c[i47];
            Object f = beu.f(t2, bdlVar.c(i47) & 1048575);
            if (f != null && (b2 = bdlVar.b(i47)) != null) {
                obj = a(i48, bdlVar.s.a(f), b2, (bcf) obj, (beo<UT, bcf>) beoVar);
            }
            obj = (ben) obj;
        }
        if (obj != null) {
            bdlVar.q.b((Object) t2, (T) obj);
        }
        if (i4 == 0) {
            if (i5 != i2) {
                throw zzbk.e();
            }
        } else if (i5 > i2 || i6 != i4) {
            throw zzbk.e();
        }
        return i5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x022e, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01e2, code lost:
        if (r0 == r15) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x020d, code lost:
        if (r0 == r15) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x022c, code lost:
        if (r0 == r15) goto L100;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [int] */
    @Override // defpackage.bdy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(T r28, byte[] r29, int r30, int r31, defpackage.bfw r32) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdl.a(java.lang.Object, byte[], int, int, bfw):void");
    }

    @Override // defpackage.bdy
    public final void c(T t) {
        int i;
        int i2 = this.m;
        while (true) {
            i = this.n;
            if (i2 >= i) {
                break;
            }
            long c = c(this.l[i2]) & 1048575;
            Object f = beu.f(t, c);
            if (f != null) {
                beu.a(t, c, this.s.d(f));
            }
            i2++;
        }
        int length = this.l.length;
        while (i < length) {
            this.p.a(t, this.l[i]);
            i++;
        }
        this.q.b(t);
        if (this.h) {
            this.r.c(t);
        }
    }

    private final <K, V, UT, UB> UB a(int i, Map<K, V> map, bcf bcfVar, UB ub, beo<UT, UB> beoVar) {
        bcy<?, ?> b2 = this.s.b();
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            ((Integer) next.getValue()).intValue();
            if (!bcfVar.a()) {
                if (ub == null) {
                    ub = beoVar.a();
                }
                bbg d = bgb.d(bcz.a(b2, next.getKey(), next.getValue()));
                try {
                    bcz.a(d.a, b2, next.getKey(), next.getValue());
                    beoVar.a((beo<UT, UB>) ub, i, d.a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [bdy] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17, types: [bdy] */
    /* JADX WARN: Type inference failed for: r6v20 */
    @Override // defpackage.bdy
    public final boolean d(T t) {
        int i;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= this.m) {
                return !this.h || this.r.a(t).d();
            }
            int i5 = this.l[i3];
            int i6 = this.c[i5];
            int c = c(i5);
            if (!this.j) {
                int i7 = this.c[i5 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i2) {
                    i4 = b.getInt(t, i8);
                    i2 = i8;
                }
            } else {
                i = 0;
            }
            if (((268435456 & c) != 0) && !a(t, i5, i4, i)) {
                return false;
            }
            int i9 = (267386880 & c) >>> 20;
            if (i9 == 9 || i9 == 17) {
                if (a(t, i5, i4, i) && !a(t, c, a(i5))) {
                    return false;
                }
            } else {
                if (i9 != 27) {
                    if (i9 == 60 || i9 == 68) {
                        if (a((bdl<T>) t, i6, i5) && !a(t, c, a(i5))) {
                            return false;
                        }
                    } else if (i9 != 49) {
                        if (i9 != 50) {
                            continue;
                        } else {
                            Map<?, ?> b2 = this.s.b(beu.f(t, c & 1048575));
                            if (!b2.isEmpty() && this.s.b().c.zzdr() == bfj.MESSAGE) {
                                bdy<T> bdyVar = 0;
                                Iterator<?> it = b2.values().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    Object next = it.next();
                                    if (bdyVar == null) {
                                        bdyVar = bds.a().a((Class) next.getClass());
                                    }
                                    boolean d = bdyVar.d(next);
                                    bdyVar = bdyVar;
                                    if (!d) {
                                        z = false;
                                        break;
                                    }
                                }
                            }
                            if (!z) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) beu.f(t, c & 1048575);
                if (!list.isEmpty()) {
                    ?? a2 = a(i5);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= list.size()) {
                            break;
                        } else if (!a2.d(list.get(i10))) {
                            z = false;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            }
            i3++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean a(Object obj, int i, bdy bdyVar) {
        return bdyVar.d(beu.f(obj, i & 1048575));
    }

    private static void a(int i, Object obj, bfi bfiVar) throws IOException {
        if (obj instanceof String) {
            bfiVar.a(i, (String) obj);
        } else {
            bfiVar.a(i, (bgb) obj);
        }
    }

    private final int c(int i) {
        return this.c[i + 1];
    }

    private final int d(int i) {
        return this.c[i + 2];
    }

    private static <T> double b(T t, long j) {
        return ((Double) beu.f(t, j)).doubleValue();
    }

    private static <T> float c(T t, long j) {
        return ((Float) beu.f(t, j)).floatValue();
    }

    private static <T> int d(T t, long j) {
        return ((Integer) beu.f(t, j)).intValue();
    }

    private static <T> long e(T t, long j) {
        return ((Long) beu.f(t, j)).longValue();
    }

    private static <T> boolean f(T t, long j) {
        return ((Boolean) beu.f(t, j)).booleanValue();
    }

    private final boolean c(T t, T t2, int i) {
        return a((bdl<T>) t, i) == a((bdl<T>) t2, i);
    }

    private final boolean a(T t, int i, int i2, int i3) {
        if (this.j) {
            return a((bdl<T>) t, i);
        }
        return (i2 & i3) != 0;
    }

    private final boolean a(T t, int i) {
        if (this.j) {
            int c = c(i);
            long j = c & 1048575;
            switch ((c & 267386880) >>> 20) {
                case 0:
                    return beu.e(t, j) != 0.0d;
                case 1:
                    return beu.d(t, j) != 0.0f;
                case 2:
                    return beu.b(t, j) != 0;
                case 3:
                    return beu.b(t, j) != 0;
                case 4:
                    return beu.a(t, j) != 0;
                case 5:
                    return beu.b(t, j) != 0;
                case 6:
                    return beu.a(t, j) != 0;
                case 7:
                    return beu.c(t, j);
                case 8:
                    Object f = beu.f(t, j);
                    if (f instanceof String) {
                        return !((String) f).isEmpty();
                    } else if (!(f instanceof bgb)) {
                        throw new IllegalArgumentException();
                    } else {
                        return !bgb.b.equals(f);
                    }
                case 9:
                    return beu.f(t, j) != null;
                case 10:
                    return !bgb.b.equals(beu.f(t, j));
                case 11:
                    return beu.a(t, j) != 0;
                case 12:
                    return beu.a(t, j) != 0;
                case 13:
                    return beu.a(t, j) != 0;
                case 14:
                    return beu.b(t, j) != 0;
                case 15:
                    return beu.a(t, j) != 0;
                case 16:
                    return beu.b(t, j) != 0;
                case 17:
                    return beu.f(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        }
        int d = d(i);
        return (beu.a(t, (long) (d & 1048575)) & (1 << (d >>> 20))) != 0;
    }

    private final void b(T t, int i) {
        if (this.j) {
            return;
        }
        int d = d(i);
        long j = d & 1048575;
        beu.a((Object) t, j, beu.a(t, j) | (1 << (d >>> 20)));
    }

    private final boolean a(T t, int i, int i2) {
        return beu.a(t, (long) (d(i2) & 1048575)) == i;
    }

    private final void b(T t, int i, int i2) {
        beu.a((Object) t, d(i2) & 1048575, i);
    }

    private final int e(int i) {
        if (i < this.e || i > this.f) {
            return -1;
        }
        return b(i, 0);
    }

    private final int a(int i, int i2) {
        if (i < this.e || i > this.f) {
            return -1;
        }
        return b(i, i2);
    }

    private final int b(int i, int i2) {
        int length = (this.c.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.c[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }
}
