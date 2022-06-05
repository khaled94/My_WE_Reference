package defpackage;

import com.google.android.gms.internal.measurement.zzee;
import com.google.android.gms.internal.measurement.zzfh;
import com.google.android.gms.internal.measurement.zzfi;
import defpackage.ata;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.sqlcipher.database.SQLiteDatabase;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: aum  reason: default package */
/* loaded from: classes.dex */
public final class aum<T> implements aux<T> {
    private static final int[] a = new int[0];
    private static final Unsafe b = avu.c();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final aui g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final int[] l;
    private final int m;
    private final int n;
    private final auq o;
    private final atr p;
    private final avp<?, ?> q;
    private final asp<?> r;
    private final aub s;

    private aum(int[] iArr, Object[] objArr, int i, int i2, aui auiVar, boolean z, int[] iArr2, int i3, int i4, auq auqVar, atr atrVar, avp<?, ?> avpVar, asp<?> aspVar, aub aubVar) {
        this.c = iArr;
        this.d = objArr;
        this.e = i;
        this.f = i2;
        this.i = auiVar instanceof ata;
        this.j = z;
        this.h = aspVar != null && aspVar.a(auiVar);
        this.k = false;
        this.l = iArr2;
        this.m = i3;
        this.n = i4;
        this.o = auqVar;
        this.p = atrVar;
        this.q = avpVar;
        this.r = aspVar;
        this.g = auiVar;
        this.s = aubVar;
    }

    private static boolean e(int i) {
        return (i & 536870912) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> aum<T> a(aug augVar, auq auqVar, atr atrVar, avp<?, ?> avpVar, asp<?> aspVar, aub aubVar) {
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
        auv auvVar;
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
        if (augVar instanceof auv) {
            auv auvVar2 = (auv) augVar;
            int i30 = 0;
            boolean z2 = auvVar2.a() == ata.d.i;
            String str2 = auvVar2.b;
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
            Object[] objArr = auvVar2.c;
            int i63 = i34;
            Class<?> cls = auvVar2.a.getClass();
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
                    auvVar = auvVar2;
                    str = str2;
                    i11 = i87;
                    i12 = 0;
                } else {
                    iArr2 = iArr3;
                    int i90 = i64 + 1;
                    Field a2 = a(cls, (String) objArr[i64]);
                    if (i80 == 9 || i80 == 17) {
                        auvVar = auvVar2;
                        objArr2[((i70 / 3) << 1) + 1] = a2.getType();
                    } else {
                        if (i80 == 27 || i80 == 49) {
                            auvVar = auvVar2;
                            i16 = i90 + 1;
                            objArr2[((i70 / 3) << 1) + 1] = objArr[i90];
                        } else if (i80 == 12 || i80 == 30 || i80 == 44) {
                            auvVar = auvVar2;
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
                                auvVar = auvVar2;
                                i66 = i91;
                            } else {
                                i66 = i91;
                                i90 = i93;
                                auvVar = auvVar2;
                            }
                        } else {
                            auvVar = auvVar2;
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
                auvVar2 = auvVar;
                i3 = i8;
                z2 = z;
                i67 = i11;
                i5 = i82;
                iArr3 = iArr2;
            }
            return new aum<>(iArr3, objArr2, i5, i6, auvVar2.a, z2, iArr, i3, i65, auqVar, atrVar, avpVar, aspVar, aubVar);
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

    @Override // defpackage.aux
    public final T a() {
        return (T) this.o.a(this.g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
        if (defpackage.auz.a(defpackage.avu.f(r10, r6), defpackage.avu.f(r11, r6)) != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
        if (defpackage.auz.a(defpackage.avu.f(r10, r6), defpackage.avu.f(r11, r6)) != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
        if (defpackage.avu.b(r10, r6) == defpackage.avu.b(r11, r6)) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
        if (defpackage.avu.a(r10, r6) == defpackage.avu.a(r11, r6)) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
        if (defpackage.avu.b(r10, r6) == defpackage.avu.b(r11, r6)) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b6, code lost:
        if (defpackage.avu.a(r10, r6) == defpackage.avu.a(r11, r6)) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
        if (defpackage.avu.a(r10, r6) == defpackage.avu.a(r11, r6)) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00da, code lost:
        if (defpackage.avu.a(r10, r6) == defpackage.avu.a(r11, r6)) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f0, code lost:
        if (defpackage.auz.a(defpackage.avu.f(r10, r6), defpackage.avu.f(r11, r6)) != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0106, code lost:
        if (defpackage.auz.a(defpackage.avu.f(r10, r6), defpackage.avu.f(r11, r6)) != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011c, code lost:
        if (defpackage.auz.a(defpackage.avu.f(r10, r6), defpackage.avu.f(r11, r6)) != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012e, code lost:
        if (defpackage.avu.c(r10, r6) == defpackage.avu.c(r11, r6)) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0140, code lost:
        if (defpackage.avu.a(r10, r6) == defpackage.avu.a(r11, r6)) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0154, code lost:
        if (defpackage.avu.b(r10, r6) == defpackage.avu.b(r11, r6)) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0165, code lost:
        if (defpackage.avu.a(r10, r6) == defpackage.avu.a(r11, r6)) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0178, code lost:
        if (defpackage.avu.b(r10, r6) == defpackage.avu.b(r11, r6)) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018b, code lost:
        if (defpackage.avu.b(r10, r6) == defpackage.avu.b(r11, r6)) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(defpackage.avu.d(r10, r6)) == java.lang.Float.floatToIntBits(defpackage.avu.d(r11, r6))) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(defpackage.avu.e(r10, r6)) == java.lang.Double.doubleToLongBits(defpackage.avu.e(r11, r6))) goto L86;
     */
    @Override // defpackage.aux
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aum.a(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // defpackage.aux
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
                    i = atb.a(Double.doubleToLongBits(avu.e(t, j)));
                    i3 = i2 + i;
                    break;
                case 1:
                    i2 = i3 * 53;
                    i = Float.floatToIntBits(avu.d(t, j));
                    i3 = i2 + i;
                    break;
                case 2:
                    i2 = i3 * 53;
                    i = atb.a(avu.b(t, j));
                    i3 = i2 + i;
                    break;
                case 3:
                    i2 = i3 * 53;
                    i = atb.a(avu.b(t, j));
                    i3 = i2 + i;
                    break;
                case 4:
                    i2 = i3 * 53;
                    i = avu.a(t, j);
                    i3 = i2 + i;
                    break;
                case 5:
                    i2 = i3 * 53;
                    i = atb.a(avu.b(t, j));
                    i3 = i2 + i;
                    break;
                case 6:
                    i2 = i3 * 53;
                    i = avu.a(t, j);
                    i3 = i2 + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    i = atb.a(avu.c(t, j));
                    i3 = i2 + i;
                    break;
                case 8:
                    i2 = i3 * 53;
                    i = ((String) avu.f(t, j)).hashCode();
                    i3 = i2 + i;
                    break;
                case 9:
                    Object f = avu.f(t, j);
                    if (f != null) {
                        i6 = f.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
                    break;
                case 10:
                    i2 = i3 * 53;
                    i = avu.f(t, j).hashCode();
                    i3 = i2 + i;
                    break;
                case 11:
                    i2 = i3 * 53;
                    i = avu.a(t, j);
                    i3 = i2 + i;
                    break;
                case 12:
                    i2 = i3 * 53;
                    i = avu.a(t, j);
                    i3 = i2 + i;
                    break;
                case 13:
                    i2 = i3 * 53;
                    i = avu.a(t, j);
                    i3 = i2 + i;
                    break;
                case 14:
                    i2 = i3 * 53;
                    i = atb.a(avu.b(t, j));
                    i3 = i2 + i;
                    break;
                case 15:
                    i2 = i3 * 53;
                    i = avu.a(t, j);
                    i3 = i2 + i;
                    break;
                case 16:
                    i2 = i3 * 53;
                    i = atb.a(avu.b(t, j));
                    i3 = i2 + i;
                    break;
                case 17:
                    Object f2 = avu.f(t, j);
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
                    i = avu.f(t, j).hashCode();
                    i3 = i2 + i;
                    break;
                case 50:
                    i2 = i3 * 53;
                    i = avu.f(t, j).hashCode();
                    i3 = i2 + i;
                    break;
                case 51:
                    if (a((aum<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = atb.a(Double.doubleToLongBits(b(t, j)));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (a((aum<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = Float.floatToIntBits(c(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (a((aum<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = atb.a(e(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (a((aum<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = atb.a(e(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (a((aum<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = d(t, j);
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (a((aum<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = atb.a(e(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (a((aum<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = d(t, j);
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (a((aum<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = atb.a(f(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (a((aum<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = ((String) avu.f(t, j)).hashCode();
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (a((aum<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = avu.f(t, j).hashCode();
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (a((aum<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = avu.f(t, j).hashCode();
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (a((aum<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = d(t, j);
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (a((aum<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = d(t, j);
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (a((aum<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = d(t, j);
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (a((aum<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = atb.a(e(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (a((aum<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = d(t, j);
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (a((aum<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = atb.a(e(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (a((aum<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = avu.f(t, j).hashCode();
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i3 * 53) + this.q.b(t).hashCode();
        return this.h ? (hashCode * 53) + this.r.a(t).hashCode() : hashCode;
    }

    @Override // defpackage.aux
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
                    if (a((aum<T>) t2, i)) {
                        avu.a(t, j, avu.e(t2, j));
                        b((aum<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (a((aum<T>) t2, i)) {
                        avu.a((Object) t, j, avu.d(t2, j));
                        b((aum<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (a((aum<T>) t2, i)) {
                        avu.a((Object) t, j, avu.b(t2, j));
                        b((aum<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (a((aum<T>) t2, i)) {
                        avu.a((Object) t, j, avu.b(t2, j));
                        b((aum<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (a((aum<T>) t2, i)) {
                        avu.a((Object) t, j, avu.a(t2, j));
                        b((aum<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (a((aum<T>) t2, i)) {
                        avu.a((Object) t, j, avu.b(t2, j));
                        b((aum<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (a((aum<T>) t2, i)) {
                        avu.a((Object) t, j, avu.a(t2, j));
                        b((aum<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (a((aum<T>) t2, i)) {
                        avu.a(t, j, avu.c(t2, j));
                        b((aum<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (a((aum<T>) t2, i)) {
                        avu.a(t, j, avu.f(t2, j));
                        b((aum<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    a(t, t2, i);
                    break;
                case 10:
                    if (a((aum<T>) t2, i)) {
                        avu.a(t, j, avu.f(t2, j));
                        b((aum<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (a((aum<T>) t2, i)) {
                        avu.a((Object) t, j, avu.a(t2, j));
                        b((aum<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (a((aum<T>) t2, i)) {
                        avu.a((Object) t, j, avu.a(t2, j));
                        b((aum<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (a((aum<T>) t2, i)) {
                        avu.a((Object) t, j, avu.a(t2, j));
                        b((aum<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (a((aum<T>) t2, i)) {
                        avu.a((Object) t, j, avu.b(t2, j));
                        b((aum<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (a((aum<T>) t2, i)) {
                        avu.a((Object) t, j, avu.a(t2, j));
                        b((aum<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (a((aum<T>) t2, i)) {
                        avu.a((Object) t, j, avu.b(t2, j));
                        b((aum<T>) t, i);
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
                    auz.a(this.s, t, t2, j);
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
                    if (a((aum<T>) t2, i2, i)) {
                        avu.a(t, j, avu.f(t2, j));
                        b((aum<T>) t, i2, i);
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
                    if (a((aum<T>) t2, i2, i)) {
                        avu.a(t, j, avu.f(t2, j));
                        b((aum<T>) t, i2, i);
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
        auz.a(this.q, t, t2);
        if (!this.h) {
            return;
        }
        auz.a(this.r, t, t2);
    }

    private final void a(T t, T t2, int i) {
        long c = c(i) & 1048575;
        if (!a((aum<T>) t2, i)) {
            return;
        }
        Object f = avu.f(t, c);
        Object f2 = avu.f(t2, c);
        if (f != null && f2 != null) {
            avu.a(t, c, atb.a(f, f2));
            b((aum<T>) t, i);
        } else if (f2 == null) {
        } else {
            avu.a(t, c, f2);
            b((aum<T>) t, i);
        }
    }

    private final void b(T t, T t2, int i) {
        int c = c(i);
        int i2 = this.c[i];
        long j = c & 1048575;
        if (!a((aum<T>) t2, i2, i)) {
            return;
        }
        Object f = avu.f(t, j);
        Object f2 = avu.f(t2, j);
        if (f != null && f2 != null) {
            avu.a(t, j, atb.a(f, f2));
            b((aum<T>) t, i2, i);
        } else if (f2 == null) {
        } else {
            avu.a(t, j, f2);
            b((aum<T>) t, i2, i);
        }
    }

    @Override // defpackage.aux
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
                int i15 = (i13 < asv.DOUBLE_LIST_PACKED.id() || i13 > asv.SINT64_LIST_PACKED.id()) ? 0 : this.c[i12 + 2] & 1048575;
                switch (i13) {
                    case 0:
                        if (a((aum<T>) t, i12)) {
                            j2 = zzee.j(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 1:
                        if (a((aum<T>) t, i12)) {
                            j2 = zzee.i(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if (a((aum<T>) t, i12)) {
                            j2 = zzee.d(i14, avu.b(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if (a((aum<T>) t, i12)) {
                            j2 = zzee.e(i14, avu.b(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if (a((aum<T>) t, i12)) {
                            j2 = zzee.f(i14, avu.a(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if (a((aum<T>) t, i12)) {
                            j2 = zzee.g(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if (a((aum<T>) t, i12)) {
                            j2 = zzee.e(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if (a((aum<T>) t, i12)) {
                            j2 = zzee.k(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        if (a((aum<T>) t, i12)) {
                            Object f = avu.f(t, j3);
                            if (f instanceof art) {
                                j2 = zzee.c(i14, (art) f);
                                break;
                            } else {
                                j2 = zzee.b(i14, (String) f);
                                break;
                            }
                        } else {
                            continue;
                        }
                    case 9:
                        if (a((aum<T>) t, i12)) {
                            j2 = auz.a(i14, avu.f(t, j3), a(i12));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        if (a((aum<T>) t, i12)) {
                            j2 = zzee.c(i14, (art) avu.f(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        if (a((aum<T>) t, i12)) {
                            j2 = zzee.g(i14, avu.a(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        if (a((aum<T>) t, i12)) {
                            j2 = zzee.i(i14, avu.a(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        if (a((aum<T>) t, i12)) {
                            j2 = zzee.f(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        if (a((aum<T>) t, i12)) {
                            j2 = zzee.h(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if (a((aum<T>) t, i12)) {
                            j2 = zzee.h(i14, avu.a(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if (a((aum<T>) t, i12)) {
                            j2 = zzee.f(i14, avu.b(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if (a((aum<T>) t, i12)) {
                            j2 = zzee.c(i14, (aui) avu.f(t, j3), a(i12));
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        j2 = auz.i(i14, a(t, j3));
                        break;
                    case 19:
                        j2 = auz.h(i14, a(t, j3));
                        break;
                    case 20:
                        j2 = auz.a(i14, (List<Long>) a(t, j3));
                        break;
                    case 21:
                        j2 = auz.b(i14, a(t, j3));
                        break;
                    case 22:
                        j2 = auz.e(i14, a(t, j3));
                        break;
                    case 23:
                        j2 = auz.i(i14, a(t, j3));
                        break;
                    case 24:
                        j2 = auz.h(i14, a(t, j3));
                        break;
                    case 25:
                        j2 = auz.j(i14, a(t, j3));
                        break;
                    case 26:
                        j2 = auz.k(i14, a(t, j3));
                        break;
                    case 27:
                        j2 = auz.a(i14, a(t, j3), a(i12));
                        break;
                    case 28:
                        j2 = auz.l(i14, a(t, j3));
                        break;
                    case 29:
                        j2 = auz.f(i14, a(t, j3));
                        break;
                    case 30:
                        j2 = auz.d(i14, a(t, j3));
                        break;
                    case 31:
                        j2 = auz.h(i14, a(t, j3));
                        break;
                    case 32:
                        j2 = auz.i(i14, a(t, j3));
                        break;
                    case 33:
                        j2 = auz.g(i14, a(t, j3));
                        break;
                    case 34:
                        j2 = auz.c(i14, a(t, j3));
                        break;
                    case 35:
                        i7 = auz.i((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = zzee.l(i14);
                            i6 = zzee.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 36:
                        i7 = auz.h((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = zzee.l(i14);
                            i6 = zzee.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 37:
                        i7 = auz.a((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = zzee.l(i14);
                            i6 = zzee.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 38:
                        i7 = auz.b((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = zzee.l(i14);
                            i6 = zzee.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 39:
                        i7 = auz.e((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = zzee.l(i14);
                            i6 = zzee.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 40:
                        i7 = auz.i((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = zzee.l(i14);
                            i6 = zzee.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 41:
                        i7 = auz.h((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = zzee.l(i14);
                            i6 = zzee.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 42:
                        i7 = auz.j((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = zzee.l(i14);
                            i6 = zzee.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 43:
                        i7 = auz.f((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = zzee.l(i14);
                            i6 = zzee.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 44:
                        i7 = auz.d((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = zzee.l(i14);
                            i6 = zzee.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 45:
                        i7 = auz.h((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = zzee.l(i14);
                            i6 = zzee.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 46:
                        i7 = auz.i((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = zzee.l(i14);
                            i6 = zzee.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 47:
                        i7 = auz.g((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = zzee.l(i14);
                            i6 = zzee.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 48:
                        i7 = auz.c((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = zzee.l(i14);
                            i6 = zzee.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 49:
                        j2 = auz.b(i14, (List<aui>) a(t, j3), a(i12));
                        break;
                    case 50:
                        j2 = this.s.e(avu.f(t, j3));
                        break;
                    case 51:
                        if (a((aum<T>) t, i14, i12)) {
                            j2 = zzee.j(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 52:
                        if (a((aum<T>) t, i14, i12)) {
                            j2 = zzee.i(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 53:
                        if (a((aum<T>) t, i14, i12)) {
                            j2 = zzee.d(i14, e(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 54:
                        if (a((aum<T>) t, i14, i12)) {
                            j2 = zzee.e(i14, e(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 55:
                        if (a((aum<T>) t, i14, i12)) {
                            j2 = zzee.f(i14, d(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 56:
                        if (a((aum<T>) t, i14, i12)) {
                            j2 = zzee.g(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 57:
                        if (a((aum<T>) t, i14, i12)) {
                            j2 = zzee.e(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 58:
                        if (a((aum<T>) t, i14, i12)) {
                            j2 = zzee.k(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 59:
                        if (a((aum<T>) t, i14, i12)) {
                            Object f2 = avu.f(t, j3);
                            if (f2 instanceof art) {
                                j2 = zzee.c(i14, (art) f2);
                                break;
                            } else {
                                j2 = zzee.b(i14, (String) f2);
                                break;
                            }
                        } else {
                            continue;
                        }
                    case 60:
                        if (a((aum<T>) t, i14, i12)) {
                            j2 = auz.a(i14, avu.f(t, j3), a(i12));
                            break;
                        } else {
                            continue;
                        }
                    case 61:
                        if (a((aum<T>) t, i14, i12)) {
                            j2 = zzee.c(i14, (art) avu.f(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 62:
                        if (a((aum<T>) t, i14, i12)) {
                            j2 = zzee.g(i14, d(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 63:
                        if (a((aum<T>) t, i14, i12)) {
                            j2 = zzee.i(i14, d(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 64:
                        if (a((aum<T>) t, i14, i12)) {
                            j2 = zzee.f(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 65:
                        if (a((aum<T>) t, i14, i12)) {
                            j2 = zzee.h(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 66:
                        if (a((aum<T>) t, i14, i12)) {
                            j2 = zzee.h(i14, d(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 67:
                        if (a((aum<T>) t, i14, i12)) {
                            j2 = zzee.f(i14, e(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 68:
                        if (a((aum<T>) t, i14, i12)) {
                            j2 = zzee.c(i14, (aui) avu.f(t, j3), a(i12));
                            break;
                        } else {
                            continue;
                        }
                    default:
                }
                i11 += j2;
            }
            return i11 + a((avp) this.q, (Object) t);
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
                i2 = (!this.k || i21 < asv.DOUBLE_LIST_PACKED.id() || i21 > asv.SINT64_LIST_PACKED.id()) ? 0 : this.c[i17 + 2] & i10;
                i = 0;
            }
            long j4 = c2 & i10;
            switch (i21) {
                case 0:
                    if ((i19 & i) != 0) {
                        j = zzee.j(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i19 & i) != 0) {
                        j = zzee.i(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i19 & i) != 0) {
                        j = zzee.d(i20, unsafe2.getLong(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i19 & i) != 0) {
                        j = zzee.e(i20, unsafe2.getLong(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i19 & i) != 0) {
                        j = zzee.f(i20, unsafe2.getInt(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i19 & i) != 0) {
                        j = zzee.g(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i19 & i) != 0) {
                        j = zzee.e(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i19 & i) != 0) {
                        j = zzee.k(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i19 & i) != 0) {
                        Object object = unsafe2.getObject(t, j4);
                        if (object instanceof art) {
                            j = zzee.c(i20, (art) object);
                        } else {
                            j = zzee.b(i20, (String) object);
                        }
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if ((i19 & i) != 0) {
                        j = auz.a(i20, unsafe2.getObject(t, j4), a(i17));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i19 & i) != 0) {
                        j = zzee.c(i20, (art) unsafe2.getObject(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i19 & i) != 0) {
                        j = zzee.g(i20, unsafe2.getInt(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i19 & i) != 0) {
                        j = zzee.i(i20, unsafe2.getInt(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i19 & i) != 0) {
                        j = zzee.f(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i19 & i) != 0) {
                        j = zzee.h(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i19 & i) != 0) {
                        j = zzee.h(i20, unsafe2.getInt(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i19 & i) != 0) {
                        j = zzee.f(i20, unsafe2.getLong(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i19 & i) != 0) {
                        j = zzee.c(i20, (aui) unsafe2.getObject(t, j4), a(i17));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    j = auz.i(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 19:
                    j = auz.h(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 20:
                    j = auz.a(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 21:
                    j = auz.b(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 22:
                    j = auz.e(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 23:
                    j = auz.i(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 24:
                    j = auz.h(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 25:
                    j = auz.j(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 26:
                    j = auz.k(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 27:
                    j = auz.a(i20, (List<?>) unsafe2.getObject(t, j4), a(i17));
                    i18 += j;
                    break;
                case 28:
                    j = auz.l(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 29:
                    j = auz.f(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 30:
                    j = auz.d(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 31:
                    j = auz.h(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 32:
                    j = auz.i(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 33:
                    j = auz.g(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 34:
                    j = auz.c(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 35:
                    i5 = auz.i((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = zzee.l(i20);
                        i3 = zzee.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 36:
                    i5 = auz.h((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = zzee.l(i20);
                        i3 = zzee.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 37:
                    i5 = auz.a((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = zzee.l(i20);
                        i3 = zzee.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 38:
                    i5 = auz.b((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = zzee.l(i20);
                        i3 = zzee.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 39:
                    i5 = auz.e((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = zzee.l(i20);
                        i3 = zzee.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 40:
                    i5 = auz.i((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = zzee.l(i20);
                        i3 = zzee.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 41:
                    i5 = auz.h((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = zzee.l(i20);
                        i3 = zzee.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 42:
                    i5 = auz.j((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = zzee.l(i20);
                        i3 = zzee.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 43:
                    i5 = auz.f((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = zzee.l(i20);
                        i3 = zzee.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 44:
                    i5 = auz.d((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = zzee.l(i20);
                        i3 = zzee.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 45:
                    i5 = auz.h((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = zzee.l(i20);
                        i3 = zzee.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 46:
                    i5 = auz.i((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = zzee.l(i20);
                        i3 = zzee.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 47:
                    i5 = auz.g((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = zzee.l(i20);
                        i3 = zzee.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 48:
                    i5 = auz.c((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = zzee.l(i20);
                        i3 = zzee.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 49:
                    j = auz.b(i20, (List) unsafe2.getObject(t, j4), a(i17));
                    i18 += j;
                    break;
                case 50:
                    j = this.s.e(unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 51:
                    if (a((aum<T>) t, i20, i17)) {
                        j = zzee.j(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (a((aum<T>) t, i20, i17)) {
                        j = zzee.i(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (a((aum<T>) t, i20, i17)) {
                        j = zzee.d(i20, e(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (a((aum<T>) t, i20, i17)) {
                        j = zzee.e(i20, e(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (a((aum<T>) t, i20, i17)) {
                        j = zzee.f(i20, d(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (a((aum<T>) t, i20, i17)) {
                        j = zzee.g(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (a((aum<T>) t, i20, i17)) {
                        j = zzee.e(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (a((aum<T>) t, i20, i17)) {
                        j = zzee.k(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (a((aum<T>) t, i20, i17)) {
                        Object object2 = unsafe2.getObject(t, j4);
                        if (object2 instanceof art) {
                            j = zzee.c(i20, (art) object2);
                        } else {
                            j = zzee.b(i20, (String) object2);
                        }
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (a((aum<T>) t, i20, i17)) {
                        j = auz.a(i20, unsafe2.getObject(t, j4), a(i17));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (a((aum<T>) t, i20, i17)) {
                        j = zzee.c(i20, (art) unsafe2.getObject(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (a((aum<T>) t, i20, i17)) {
                        j = zzee.g(i20, d(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (a((aum<T>) t, i20, i17)) {
                        j = zzee.i(i20, d(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (a((aum<T>) t, i20, i17)) {
                        j = zzee.f(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (a((aum<T>) t, i20, i17)) {
                        j = zzee.h(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (a((aum<T>) t, i20, i17)) {
                        j = zzee.h(i20, d(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (a((aum<T>) t, i20, i17)) {
                        j = zzee.f(i20, e(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (a((aum<T>) t, i20, i17)) {
                        j = zzee.c(i20, (aui) unsafe2.getObject(t, j4), a(i17));
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
        int a2 = i18 + a((avp) this.q, (Object) t);
        if (!this.h) {
            return a2;
        }
        asq<?> a3 = this.r.a(t);
        int i23 = 0;
        for (int i24 = 0; i24 < a3.a.b(); i24++) {
            Map.Entry<?, Object> b2 = a3.a.b(i24);
            i23 += asq.a((ass) b2.getKey(), b2.getValue());
        }
        for (Map.Entry<?, Object> entry : a3.a.c()) {
            i23 += asq.a((ass) entry.getKey(), entry.getValue());
        }
        return a2 + i23;
    }

    private static <UT, UB> int a(avp<UT, UB> avpVar, T t) {
        return avpVar.f(avpVar.b(t));
    }

    private static List<?> a(Object obj, long j) {
        return (List) avu.f(obj, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0a44  */
    @Override // defpackage.aux
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(T r14, defpackage.awm r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2942
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aum.a(java.lang.Object, awm):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0496  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b(T r19, defpackage.awm r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aum.b(java.lang.Object, awm):void");
    }

    private final <K, V> void a(awm awmVar, int i, Object obj) throws IOException {
        if (obj != null) {
            awmVar.a(i, this.s.b(), this.s.b(obj));
        }
    }

    private static <UT, UB> void a(avp<UT, UB> avpVar, T t, awm awmVar) throws IOException {
        avpVar.a((avp<UT, UB>) avpVar.b(t), awmVar);
    }

    @Override // defpackage.aux
    public final void a(T t, auy auyVar, asn asnVar) throws IOException {
        if (asnVar == null) {
            throw null;
        }
        avp avpVar = this.q;
        asp<?> aspVar = this.r;
        Object obj = null;
        asq<?> asqVar = null;
        while (true) {
            try {
                int a2 = auyVar.a();
                int f = f(a2);
                if (f >= 0) {
                    int c = c(f);
                    switch ((267386880 & c) >>> 20) {
                        case 0:
                            avu.a(t, c & 1048575, auyVar.d());
                            b((aum<T>) t, f);
                            break;
                        case 1:
                            avu.a((Object) t, c & 1048575, auyVar.e());
                            b((aum<T>) t, f);
                            break;
                        case 2:
                            avu.a((Object) t, c & 1048575, auyVar.g());
                            b((aum<T>) t, f);
                            break;
                        case 3:
                            avu.a((Object) t, c & 1048575, auyVar.f());
                            b((aum<T>) t, f);
                            break;
                        case 4:
                            avu.a((Object) t, c & 1048575, auyVar.h());
                            b((aum<T>) t, f);
                            break;
                        case 5:
                            avu.a((Object) t, c & 1048575, auyVar.i());
                            b((aum<T>) t, f);
                            break;
                        case 6:
                            avu.a((Object) t, c & 1048575, auyVar.j());
                            b((aum<T>) t, f);
                            break;
                        case 7:
                            avu.a(t, c & 1048575, auyVar.k());
                            b((aum<T>) t, f);
                            break;
                        case 8:
                            a(t, c, auyVar);
                            b((aum<T>) t, f);
                            break;
                        case 9:
                            if (a((aum<T>) t, f)) {
                                long j = c & 1048575;
                                avu.a(t, j, atb.a(avu.f(t, j), auyVar.a(a(f), asnVar)));
                                break;
                            } else {
                                avu.a(t, c & 1048575, auyVar.a(a(f), asnVar));
                                b((aum<T>) t, f);
                                break;
                            }
                        case 10:
                            avu.a(t, c & 1048575, auyVar.n());
                            b((aum<T>) t, f);
                            break;
                        case 11:
                            avu.a((Object) t, c & 1048575, auyVar.o());
                            b((aum<T>) t, f);
                            break;
                        case 12:
                            int p = auyVar.p();
                            ath b2 = b(f);
                            if (b2 != null && !b2.a(p)) {
                                obj = auz.a(a2, p, obj, avpVar);
                                break;
                            }
                            avu.a((Object) t, c & 1048575, p);
                            b((aum<T>) t, f);
                            break;
                        case 13:
                            avu.a((Object) t, c & 1048575, auyVar.q());
                            b((aum<T>) t, f);
                            break;
                        case 14:
                            avu.a((Object) t, c & 1048575, auyVar.r());
                            b((aum<T>) t, f);
                            break;
                        case 15:
                            avu.a((Object) t, c & 1048575, auyVar.s());
                            b((aum<T>) t, f);
                            break;
                        case 16:
                            avu.a((Object) t, c & 1048575, auyVar.t());
                            b((aum<T>) t, f);
                            break;
                        case 17:
                            if (a((aum<T>) t, f)) {
                                long j2 = c & 1048575;
                                avu.a(t, j2, atb.a(avu.f(t, j2), auyVar.b(a(f), asnVar)));
                                break;
                            } else {
                                avu.a(t, c & 1048575, auyVar.b(a(f), asnVar));
                                b((aum<T>) t, f);
                                break;
                            }
                        case 18:
                            auyVar.a(this.p.a(t, c & 1048575));
                            break;
                        case 19:
                            auyVar.b(this.p.a(t, c & 1048575));
                            break;
                        case 20:
                            auyVar.d(this.p.a(t, c & 1048575));
                            break;
                        case 21:
                            auyVar.c(this.p.a(t, c & 1048575));
                            break;
                        case 22:
                            auyVar.e(this.p.a(t, c & 1048575));
                            break;
                        case 23:
                            auyVar.f(this.p.a(t, c & 1048575));
                            break;
                        case 24:
                            auyVar.g(this.p.a(t, c & 1048575));
                            break;
                        case 25:
                            auyVar.h(this.p.a(t, c & 1048575));
                            break;
                        case 26:
                            if (e(c)) {
                                auyVar.j(this.p.a(t, c & 1048575));
                                break;
                            } else {
                                auyVar.i(this.p.a(t, c & 1048575));
                                break;
                            }
                        case 27:
                            auyVar.a(this.p.a(t, c & 1048575), a(f), asnVar);
                            break;
                        case 28:
                            auyVar.k(this.p.a(t, c & 1048575));
                            break;
                        case 29:
                            auyVar.l(this.p.a(t, c & 1048575));
                            break;
                        case 30:
                            List<Integer> a3 = this.p.a(t, c & 1048575);
                            auyVar.m(a3);
                            obj = auz.a(a2, a3, b(f), obj, avpVar);
                            break;
                        case 31:
                            auyVar.n(this.p.a(t, c & 1048575));
                            break;
                        case 32:
                            auyVar.o(this.p.a(t, c & 1048575));
                            break;
                        case 33:
                            auyVar.p(this.p.a(t, c & 1048575));
                            break;
                        case 34:
                            auyVar.q(this.p.a(t, c & 1048575));
                            break;
                        case 35:
                            auyVar.a(this.p.a(t, c & 1048575));
                            break;
                        case 36:
                            auyVar.b(this.p.a(t, c & 1048575));
                            break;
                        case 37:
                            auyVar.d(this.p.a(t, c & 1048575));
                            break;
                        case 38:
                            auyVar.c(this.p.a(t, c & 1048575));
                            break;
                        case 39:
                            auyVar.e(this.p.a(t, c & 1048575));
                            break;
                        case 40:
                            auyVar.f(this.p.a(t, c & 1048575));
                            break;
                        case 41:
                            auyVar.g(this.p.a(t, c & 1048575));
                            break;
                        case 42:
                            auyVar.h(this.p.a(t, c & 1048575));
                            break;
                        case 43:
                            auyVar.l(this.p.a(t, c & 1048575));
                            break;
                        case 44:
                            List<Integer> a4 = this.p.a(t, c & 1048575);
                            auyVar.m(a4);
                            obj = auz.a(a2, a4, b(f), obj, avpVar);
                            break;
                        case 45:
                            auyVar.n(this.p.a(t, c & 1048575));
                            break;
                        case 46:
                            auyVar.o(this.p.a(t, c & 1048575));
                            break;
                        case 47:
                            auyVar.p(this.p.a(t, c & 1048575));
                            break;
                        case 48:
                            auyVar.q(this.p.a(t, c & 1048575));
                            break;
                        case 49:
                            auyVar.b(this.p.a(t, c & 1048575), a(f), asnVar);
                            break;
                        case 50:
                            long c2 = c(f) & 1048575;
                            Object f2 = avu.f(t, c2);
                            if (f2 == null) {
                                f2 = this.s.a();
                                avu.a(t, c2, f2);
                            } else if (this.s.c(f2)) {
                                Object a5 = this.s.a();
                                this.s.a(a5, f2);
                                avu.a(t, c2, a5);
                                f2 = a5;
                            }
                            auyVar.a(this.s.a(f2), this.s.b(), asnVar);
                            break;
                        case 51:
                            avu.a(t, c & 1048575, Double.valueOf(auyVar.d()));
                            b((aum<T>) t, a2, f);
                            break;
                        case 52:
                            avu.a(t, c & 1048575, Float.valueOf(auyVar.e()));
                            b((aum<T>) t, a2, f);
                            break;
                        case 53:
                            avu.a(t, c & 1048575, Long.valueOf(auyVar.g()));
                            b((aum<T>) t, a2, f);
                            break;
                        case 54:
                            avu.a(t, c & 1048575, Long.valueOf(auyVar.f()));
                            b((aum<T>) t, a2, f);
                            break;
                        case 55:
                            avu.a(t, c & 1048575, Integer.valueOf(auyVar.h()));
                            b((aum<T>) t, a2, f);
                            break;
                        case 56:
                            avu.a(t, c & 1048575, Long.valueOf(auyVar.i()));
                            b((aum<T>) t, a2, f);
                            break;
                        case 57:
                            avu.a(t, c & 1048575, Integer.valueOf(auyVar.j()));
                            b((aum<T>) t, a2, f);
                            break;
                        case 58:
                            avu.a(t, c & 1048575, Boolean.valueOf(auyVar.k()));
                            b((aum<T>) t, a2, f);
                            break;
                        case 59:
                            a(t, c, auyVar);
                            b((aum<T>) t, a2, f);
                            break;
                        case 60:
                            if (a((aum<T>) t, a2, f)) {
                                long j3 = c & 1048575;
                                avu.a(t, j3, atb.a(avu.f(t, j3), auyVar.a(a(f), asnVar)));
                            } else {
                                avu.a(t, c & 1048575, auyVar.a(a(f), asnVar));
                                b((aum<T>) t, f);
                            }
                            b((aum<T>) t, a2, f);
                            break;
                        case 61:
                            avu.a(t, c & 1048575, auyVar.n());
                            b((aum<T>) t, a2, f);
                            break;
                        case 62:
                            avu.a(t, c & 1048575, Integer.valueOf(auyVar.o()));
                            b((aum<T>) t, a2, f);
                            break;
                        case 63:
                            int p2 = auyVar.p();
                            ath b3 = b(f);
                            if (b3 != null && !b3.a(p2)) {
                                obj = auz.a(a2, p2, obj, avpVar);
                                break;
                            }
                            avu.a(t, c & 1048575, Integer.valueOf(p2));
                            b((aum<T>) t, a2, f);
                            break;
                        case 64:
                            avu.a(t, c & 1048575, Integer.valueOf(auyVar.q()));
                            b((aum<T>) t, a2, f);
                            break;
                        case 65:
                            avu.a(t, c & 1048575, Long.valueOf(auyVar.r()));
                            b((aum<T>) t, a2, f);
                            break;
                        case 66:
                            avu.a(t, c & 1048575, Integer.valueOf(auyVar.s()));
                            b((aum<T>) t, a2, f);
                            break;
                        case 67:
                            avu.a(t, c & 1048575, Long.valueOf(auyVar.t()));
                            b((aum<T>) t, a2, f);
                            break;
                        case 68:
                            avu.a(t, c & 1048575, auyVar.b(a(f), asnVar));
                            b((aum<T>) t, a2, f);
                            break;
                        default:
                            if (obj == null) {
                                try {
                                    obj = avpVar.a();
                                } catch (zzfh unused) {
                                    if (obj == null) {
                                        obj = avpVar.c(t);
                                    }
                                    if (!avpVar.a((avp) obj, auyVar)) {
                                        for (int i = this.m; i < this.n; i++) {
                                            obj = a((Object) t, this.l[i], (int) obj, (avp<UT, int>) avpVar);
                                        }
                                        if (obj == null) {
                                            return;
                                        }
                                        avpVar.b((Object) t, (T) obj);
                                        return;
                                    }
                                    break;
                                }
                            }
                            if (!avpVar.a((avp) obj, auyVar)) {
                                for (int i2 = this.m; i2 < this.n; i2++) {
                                    obj = a((Object) t, this.l[i2], (int) obj, (avp<UT, int>) avpVar);
                                }
                                if (obj == null) {
                                    return;
                                }
                                avpVar.b((Object) t, (T) obj);
                                return;
                            }
                            break;
                    }
                } else if (a2 == Integer.MAX_VALUE) {
                    for (int i3 = this.m; i3 < this.n; i3++) {
                        obj = a((Object) t, this.l[i3], (int) obj, (avp<UT, int>) avpVar);
                    }
                    if (obj == null) {
                        return;
                    }
                    avpVar.b((Object) t, (T) obj);
                    return;
                } else if ((!this.h ? null : aspVar.a(asnVar, this.g, a2)) != null) {
                    if (asqVar == null) {
                        asqVar = aspVar.b(t);
                    }
                    obj = aspVar.a();
                } else {
                    if (obj == null) {
                        obj = avpVar.c(t);
                    }
                    if (!avpVar.a((avp) obj, auyVar)) {
                        for (int i4 = this.m; i4 < this.n; i4++) {
                            obj = a((Object) t, this.l[i4], (int) obj, (avp<UT, int>) avpVar);
                        }
                        if (obj == null) {
                            return;
                        }
                        avpVar.b((Object) t, (T) obj);
                        return;
                    }
                }
            } catch (Throwable th) {
                for (int i5 = this.m; i5 < this.n; i5++) {
                    obj = a((Object) t, this.l[i5], (int) obj, (avp<UT, int>) avpVar);
                }
                if (obj != null) {
                    avpVar.b((Object) t, (T) obj);
                }
                throw th;
            }
        }
    }

    private static avr e(Object obj) {
        ata ataVar = (ata) obj;
        avr avrVar = ataVar.zzahz;
        if (avrVar == avr.a()) {
            avr b2 = avr.b();
            ataVar.zzahz = b2;
            return b2;
        }
        return avrVar;
    }

    private static int a(byte[] bArr, int i, int i2, awg awgVar, Class<?> cls, aro aroVar) throws IOException {
        switch (aul.a[awgVar.ordinal()]) {
            case 1:
                int b2 = arp.b(bArr, i, aroVar);
                aroVar.c = Boolean.valueOf(aroVar.b != 0);
                return b2;
            case 2:
                return arp.e(bArr, i, aroVar);
            case 3:
                aroVar.c = Double.valueOf(arp.c(bArr, i));
                return i + 8;
            case 4:
            case 5:
                aroVar.c = Integer.valueOf(arp.a(bArr, i));
                return i + 4;
            case 6:
            case 7:
                aroVar.c = Long.valueOf(arp.b(bArr, i));
                return i + 8;
            case 8:
                aroVar.c = Float.valueOf(arp.d(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int a2 = arp.a(bArr, i, aroVar);
                aroVar.c = Integer.valueOf(aroVar.a);
                return a2;
            case 12:
            case 13:
                int b3 = arp.b(bArr, i, aroVar);
                aroVar.c = Long.valueOf(aroVar.b);
                return b3;
            case 14:
                return arp.a(aut.a().a((Class) cls), bArr, i, i2, aroVar);
            case 15:
                int a3 = arp.a(bArr, i, aroVar);
                aroVar.c = Integer.valueOf(asf.f(aroVar.a));
                return a3;
            case 16:
                int b4 = arp.b(bArr, i, aroVar);
                aroVar.c = Long.valueOf(asf.a(aroVar.b));
                return b4;
            case 17:
                return arp.d(bArr, i, aroVar);
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
    private final int a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, defpackage.aro r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1128
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aum.a(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, aro):int");
    }

    private final <K, V> int a(T t, byte[] bArr, int i, int i2, long j, aro aroVar) throws IOException {
        Unsafe unsafe = b;
        Object object = unsafe.getObject(t, j);
        if (this.s.c(object)) {
            Object a2 = this.s.a();
            this.s.a(a2, object);
            unsafe.putObject(t, j, a2);
            object = a2;
        }
        aty<?, ?> b2 = this.s.b();
        Map<?, ?> a3 = this.s.a(object);
        int a4 = arp.a(bArr, i, aroVar);
        int i3 = aroVar.a;
        if (i3 < 0 || i3 > i2 - a4) {
            throw zzfi.a();
        }
        int i4 = i3 + a4;
        Object obj = (K) b2.b;
        Object obj2 = (V) b2.d;
        while (a4 < i4) {
            int i5 = a4 + 1;
            int i6 = bArr[a4];
            if (i6 < 0) {
                i5 = arp.a(i6, bArr, i5, aroVar);
                i6 = aroVar.a;
            }
            int i7 = i5;
            int i8 = i6 >>> 3;
            int i9 = i6 & 7;
            if (i8 == 1) {
                if (i9 == b2.a.zzxa()) {
                    a4 = a(bArr, i7, i2, b2.a, (Class<?>) null, aroVar);
                    obj = (K) aroVar.c;
                } else {
                    a4 = arp.a(i6, bArr, i7, i2, aroVar);
                }
            } else {
                if (i8 == 2 && i9 == b2.c.zzxa()) {
                    a4 = a(bArr, i7, i2, b2.c, b2.d.getClass(), aroVar);
                    obj2 = (V) aroVar.c;
                }
                a4 = arp.a(i6, bArr, i7, i2, aroVar);
            }
        }
        if (a4 != i4) {
            throw zzfi.h();
        }
        a3.put(obj, obj2);
        return i4;
    }

    private final int a(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, aro aroVar) throws IOException {
        int i9;
        Unsafe unsafe = b;
        long j2 = this.c[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Double.valueOf(arp.c(bArr, i)));
                    i9 = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Float.valueOf(arp.d(bArr, i)));
                    i9 = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    i9 = arp.b(bArr, i, aroVar);
                    unsafe.putObject(t, j, Long.valueOf(aroVar.b));
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    i9 = arp.a(bArr, i, aroVar);
                    unsafe.putObject(t, j, Integer.valueOf(aroVar.a));
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(arp.b(bArr, i)));
                    i9 = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(arp.a(bArr, i)));
                    i9 = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    i9 = arp.b(bArr, i, aroVar);
                    unsafe.putObject(t, j, Boolean.valueOf(aroVar.b != 0));
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    int a2 = arp.a(bArr, i, aroVar);
                    int i10 = aroVar.a;
                    if (i10 == 0) {
                        unsafe.putObject(t, j, "");
                    } else if ((i6 & 536870912) != 0 && !avx.a(bArr, a2, a2 + i10)) {
                        throw zzfi.i();
                    } else {
                        unsafe.putObject(t, j, new String(bArr, a2, i10, atb.a));
                        a2 += i10;
                    }
                    unsafe.putInt(t, j2, i4);
                    return a2;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    int a3 = arp.a(a(i8), bArr, i, i2, aroVar);
                    Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, aroVar.c);
                    } else {
                        unsafe.putObject(t, j, atb.a(object, aroVar.c));
                    }
                    unsafe.putInt(t, j2, i4);
                    return a3;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    i9 = arp.e(bArr, i, aroVar);
                    unsafe.putObject(t, j, aroVar.c);
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int a4 = arp.a(bArr, i, aroVar);
                    int i11 = aroVar.a;
                    ath b2 = b(i8);
                    if (b2 == null || b2.a(i11)) {
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
                    i9 = arp.a(bArr, i, aroVar);
                    unsafe.putObject(t, j, Integer.valueOf(asf.f(aroVar.a)));
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    i9 = arp.b(bArr, i, aroVar);
                    unsafe.putObject(t, j, Long.valueOf(asf.a(aroVar.b)));
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    i9 = arp.a(a(i8), bArr, i, i2, (i3 & (-8)) | 4, aroVar);
                    Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j, aroVar.c);
                    } else {
                        unsafe.putObject(t, j, atb.a(object2, aroVar.c));
                    }
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            default:
                return i;
        }
    }

    private final aux a(int i) {
        int i2 = (i / 3) << 1;
        aux auxVar = (aux) this.d[i2];
        if (auxVar != null) {
            return auxVar;
        }
        aux<T> a2 = aut.a().a((Class) ((Class) this.d[i2 + 1]));
        this.d[i2] = a2;
        return a2;
    }

    private final ath b(int i) {
        return (ath) this.d[((i / 3) << 1) + 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(T t, byte[] bArr, int i, int i2, int i3, aro aroVar) throws IOException {
        Unsafe unsafe;
        int i4;
        T t2;
        aum<T> aumVar;
        byte b2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        T t3;
        aro aroVar2;
        aro aroVar3;
        int i11;
        int i12;
        int i13;
        int i14;
        aro aroVar4;
        int i15;
        int i16;
        aro aroVar5;
        int i17;
        int i18;
        int i19;
        aum<T> aumVar2 = this;
        T t4 = t;
        byte[] bArr2 = bArr;
        int i20 = i2;
        int i21 = i3;
        aro aroVar6 = aroVar;
        Unsafe unsafe2 = b;
        int i22 = i;
        int i23 = -1;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = -1;
        while (true) {
            if (i22 < i20) {
                int i28 = i22 + 1;
                byte b3 = bArr2[i22];
                if (b3 < 0) {
                    i5 = arp.a(b3, bArr2, i28, aroVar6);
                    b2 = aroVar6.a;
                } else {
                    b2 = b3;
                    i5 = i28;
                }
                int i29 = b2 >>> 3;
                int i30 = b2 & 7;
                if (i29 > i23) {
                    i6 = aumVar2.a(i29, i24 / 3);
                } else {
                    i6 = aumVar2.f(i29);
                }
                int i31 = i6;
                if (i31 == -1) {
                    i7 = i29;
                    i8 = i5;
                    i9 = b2;
                    unsafe = unsafe2;
                    i4 = i21;
                    i10 = 0;
                } else {
                    int[] iArr = aumVar2.c;
                    int i32 = iArr[i31 + 1];
                    int i33 = (i32 & 267386880) >>> 20;
                    int i34 = b2;
                    long j = i32 & 1048575;
                    if (i33 <= 17) {
                        int i35 = iArr[i31 + 2];
                        int i36 = 1 << (i35 >>> 20);
                        int i37 = i35 & 1048575;
                        if (i37 != i27) {
                            if (i27 != -1) {
                                unsafe2.putInt(t4, i27, i26);
                            }
                            i26 = unsafe2.getInt(t4, i37);
                            i27 = i37;
                        }
                        switch (i33) {
                            case 0:
                                i11 = i31;
                                i12 = i29;
                                i14 = i27;
                                i13 = i34;
                                bArr2 = bArr;
                                aroVar4 = aroVar;
                                i15 = i5;
                                if (i30 == 1) {
                                    avu.a(t4, j, arp.c(bArr2, i15));
                                    i22 = i15 + 8;
                                    i26 |= i36;
                                    i27 = i14;
                                    i25 = i13;
                                    i24 = i11;
                                    i23 = i12;
                                    aroVar6 = aroVar4;
                                    i20 = i2;
                                    i21 = i3;
                                    break;
                                } else {
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 1:
                                i11 = i31;
                                i12 = i29;
                                i14 = i27;
                                i13 = i34;
                                bArr2 = bArr;
                                aroVar4 = aroVar;
                                i15 = i5;
                                if (i30 == 5) {
                                    avu.a((Object) t4, j, arp.d(bArr2, i15));
                                    i22 = i15 + 4;
                                    i26 |= i36;
                                    i27 = i14;
                                    i25 = i13;
                                    i24 = i11;
                                    i23 = i12;
                                    aroVar6 = aroVar4;
                                    i20 = i2;
                                    i21 = i3;
                                    break;
                                } else {
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 2:
                            case 3:
                                i11 = i31;
                                i12 = i29;
                                i14 = i27;
                                i13 = i34;
                                bArr2 = bArr;
                                i15 = i5;
                                if (i30 == 0) {
                                    int b4 = arp.b(bArr2, i15, aroVar);
                                    unsafe2.putLong(t, j, aroVar.b);
                                    i26 |= i36;
                                    i22 = b4;
                                    i25 = i13;
                                    i24 = i11;
                                    i23 = i12;
                                    aroVar6 = aroVar;
                                    i27 = i14;
                                    i20 = i2;
                                    i21 = i3;
                                    break;
                                } else {
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 4:
                            case 11:
                                i11 = i31;
                                i12 = i29;
                                i14 = i27;
                                i13 = i34;
                                bArr2 = bArr;
                                aroVar4 = aroVar;
                                i15 = i5;
                                if (i30 == 0) {
                                    i22 = arp.a(bArr2, i15, aroVar4);
                                    unsafe2.putInt(t4, j, aroVar4.a);
                                    i26 |= i36;
                                    i27 = i14;
                                    i25 = i13;
                                    i24 = i11;
                                    i23 = i12;
                                    aroVar6 = aroVar4;
                                    i20 = i2;
                                    i21 = i3;
                                    break;
                                } else {
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 5:
                            case 14:
                                i11 = i31;
                                i12 = i29;
                                i13 = i34;
                                bArr2 = bArr;
                                aroVar4 = aroVar;
                                if (i30 == 1) {
                                    i14 = i27;
                                    i15 = i5;
                                    unsafe2.putLong(t, j, arp.b(bArr2, i5));
                                    i22 = i15 + 8;
                                    i26 |= i36;
                                    i27 = i14;
                                    i25 = i13;
                                    i24 = i11;
                                    i23 = i12;
                                    aroVar6 = aroVar4;
                                    i20 = i2;
                                    i21 = i3;
                                    break;
                                } else {
                                    i14 = i27;
                                    i15 = i5;
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 6:
                            case 13:
                                i16 = i2;
                                i11 = i31;
                                i12 = i29;
                                i13 = i34;
                                bArr2 = bArr;
                                aroVar5 = aroVar;
                                if (i30 == 5) {
                                    unsafe2.putInt(t4, j, arp.a(bArr2, i5));
                                    i22 = i5 + 4;
                                    i26 |= i36;
                                    i25 = i13;
                                    i24 = i11;
                                    i23 = i12;
                                    aroVar6 = aroVar5;
                                    i21 = i3;
                                    i20 = i16;
                                    break;
                                } else {
                                    i14 = i27;
                                    i15 = i5;
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 7:
                                i16 = i2;
                                i11 = i31;
                                i12 = i29;
                                i13 = i34;
                                bArr2 = bArr;
                                aroVar5 = aroVar;
                                if (i30 == 0) {
                                    int b5 = arp.b(bArr2, i5, aroVar5);
                                    avu.a(t4, j, aroVar5.b != 0);
                                    i26 |= i36;
                                    i22 = b5;
                                    i25 = i13;
                                    i24 = i11;
                                    i23 = i12;
                                    aroVar6 = aroVar5;
                                    i21 = i3;
                                    i20 = i16;
                                    break;
                                } else {
                                    i14 = i27;
                                    i15 = i5;
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 8:
                                i16 = i2;
                                i11 = i31;
                                i12 = i29;
                                i13 = i34;
                                bArr2 = bArr;
                                aroVar5 = aroVar;
                                if (i30 == 2) {
                                    if ((i32 & 536870912) == 0) {
                                        i22 = arp.c(bArr2, i5, aroVar5);
                                    } else {
                                        i22 = arp.d(bArr2, i5, aroVar5);
                                    }
                                    unsafe2.putObject(t4, j, aroVar5.c);
                                    i26 |= i36;
                                    i25 = i13;
                                    i24 = i11;
                                    i23 = i12;
                                    aroVar6 = aroVar5;
                                    i21 = i3;
                                    i20 = i16;
                                    break;
                                } else {
                                    i14 = i27;
                                    i15 = i5;
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 9:
                                i11 = i31;
                                i12 = i29;
                                i13 = i34;
                                bArr2 = bArr;
                                aroVar5 = aroVar;
                                if (i30 == 2) {
                                    i16 = i2;
                                    i22 = arp.a(aumVar2.a(i11), bArr2, i5, i16, aroVar5);
                                    if ((i26 & i36) == 0) {
                                        unsafe2.putObject(t4, j, aroVar5.c);
                                    } else {
                                        unsafe2.putObject(t4, j, atb.a(unsafe2.getObject(t4, j), aroVar5.c));
                                    }
                                    i26 |= i36;
                                    i25 = i13;
                                    i24 = i11;
                                    i23 = i12;
                                    aroVar6 = aroVar5;
                                    i21 = i3;
                                    i20 = i16;
                                    break;
                                } else {
                                    i14 = i27;
                                    i15 = i5;
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 10:
                                i11 = i31;
                                i12 = i29;
                                i13 = i34;
                                bArr2 = bArr;
                                aroVar4 = aroVar;
                                if (i30 == 2) {
                                    i22 = arp.e(bArr2, i5, aroVar4);
                                    unsafe2.putObject(t4, j, aroVar4.c);
                                    i26 |= i36;
                                    i25 = i13;
                                    i24 = i11;
                                    i23 = i12;
                                    aroVar6 = aroVar4;
                                    i20 = i2;
                                    i21 = i3;
                                    break;
                                } else {
                                    i14 = i27;
                                    i15 = i5;
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 12:
                                i11 = i31;
                                i12 = i29;
                                i13 = i34;
                                bArr2 = bArr;
                                aroVar4 = aroVar;
                                if (i30 != 0) {
                                    i14 = i27;
                                    i15 = i5;
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                } else {
                                    i22 = arp.a(bArr2, i5, aroVar4);
                                    int i38 = aroVar4.a;
                                    ath b6 = aumVar2.b(i11);
                                    if (b6 == null || b6.a(i38)) {
                                        unsafe2.putInt(t4, j, i38);
                                        i26 |= i36;
                                        i25 = i13;
                                        i24 = i11;
                                        i23 = i12;
                                        aroVar6 = aroVar4;
                                        i20 = i2;
                                        i21 = i3;
                                        break;
                                    } else {
                                        e(t).a(i13, Long.valueOf(i38));
                                        i25 = i13;
                                        i24 = i11;
                                        i23 = i12;
                                        aroVar6 = aroVar4;
                                        i20 = i2;
                                        i21 = i3;
                                    }
                                }
                                break;
                            case 15:
                                i11 = i31;
                                i12 = i29;
                                i13 = i34;
                                bArr2 = bArr;
                                aroVar4 = aroVar;
                                if (i30 == 0) {
                                    i22 = arp.a(bArr2, i5, aroVar4);
                                    unsafe2.putInt(t4, j, asf.f(aroVar4.a));
                                    i26 |= i36;
                                    i25 = i13;
                                    i24 = i11;
                                    i23 = i12;
                                    aroVar6 = aroVar4;
                                    i20 = i2;
                                    i21 = i3;
                                    break;
                                } else {
                                    i14 = i27;
                                    i15 = i5;
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 16:
                                i11 = i31;
                                i12 = i29;
                                i13 = i34;
                                if (i30 == 0) {
                                    bArr2 = bArr;
                                    int b7 = arp.b(bArr2, i5, aroVar);
                                    aroVar4 = aroVar;
                                    unsafe2.putLong(t, j, asf.a(aroVar.b));
                                    i26 |= i36;
                                    i22 = b7;
                                    i25 = i13;
                                    i24 = i11;
                                    i23 = i12;
                                    aroVar6 = aroVar4;
                                    i20 = i2;
                                    i21 = i3;
                                    break;
                                } else {
                                    i14 = i27;
                                    i15 = i5;
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 17:
                                if (i30 == 3) {
                                    i22 = arp.a(aumVar2.a(i31), bArr, i5, i2, (i29 << 3) | 4, aroVar);
                                    if ((i26 & i36) == 0) {
                                        aroVar3 = aroVar;
                                        unsafe2.putObject(t4, j, aroVar3.c);
                                    } else {
                                        aroVar3 = aroVar;
                                        unsafe2.putObject(t4, j, atb.a(unsafe2.getObject(t4, j), aroVar3.c));
                                    }
                                    i26 |= i36;
                                    bArr2 = bArr;
                                    i20 = i2;
                                    i25 = i34;
                                    i24 = i31;
                                    i23 = i29;
                                    i21 = i3;
                                    aroVar6 = aroVar3;
                                    break;
                                } else {
                                    i11 = i31;
                                    i12 = i29;
                                    i13 = i34;
                                    i14 = i27;
                                    i15 = i5;
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            default:
                                i11 = i31;
                                i12 = i29;
                                i14 = i27;
                                i13 = i34;
                                i15 = i5;
                                i8 = i15;
                                i10 = i11;
                                unsafe = unsafe2;
                                i7 = i12;
                                i27 = i14;
                                i9 = i13;
                                i4 = i3;
                                break;
                        }
                    } else {
                        int i39 = i27;
                        int i40 = i5;
                        bArr2 = bArr;
                        aro aroVar7 = aroVar6;
                        if (i33 != 27) {
                            i17 = i26;
                            if (i33 <= 49) {
                                i7 = i29;
                                i19 = i34;
                                i10 = i31;
                                unsafe = unsafe2;
                                i22 = a((aum<T>) t, bArr, i40, i2, i34, i29, i30, i31, i32, i33, j, aroVar);
                                if (i22 == i40) {
                                    i4 = i3;
                                    i8 = i22;
                                } else {
                                    aumVar2 = this;
                                    t4 = t;
                                    bArr2 = bArr;
                                    i20 = i2;
                                    i21 = i3;
                                    aroVar6 = aroVar;
                                    i27 = i39;
                                    i24 = i10;
                                    i26 = i17;
                                    i23 = i7;
                                    i25 = i19;
                                    unsafe2 = unsafe;
                                }
                            } else {
                                i7 = i29;
                                i18 = i40;
                                i19 = i34;
                                i10 = i31;
                                unsafe = unsafe2;
                                if (i33 != 50) {
                                    i22 = a((aum<T>) t, bArr, i18, i2, i19, i7, i30, i32, i33, j, i10, aroVar);
                                    if (i22 != i18) {
                                        aumVar2 = this;
                                        t4 = t;
                                        i20 = i2;
                                        i21 = i3;
                                        i25 = i19;
                                        i23 = i7;
                                        i27 = i39;
                                        i24 = i10;
                                        i26 = i17;
                                        unsafe2 = unsafe;
                                        bArr2 = bArr;
                                        aroVar6 = aroVar;
                                    }
                                } else if (i30 == 2) {
                                    i22 = a((aum<T>) t, bArr, i18, i2, j, aroVar);
                                    if (i22 != i18) {
                                        aumVar2 = this;
                                        t4 = t;
                                        bArr2 = bArr;
                                        i20 = i2;
                                        i21 = i3;
                                        aroVar6 = aroVar;
                                        i27 = i39;
                                        i24 = i10;
                                        i26 = i17;
                                        i23 = i7;
                                        i25 = i19;
                                        unsafe2 = unsafe;
                                    }
                                } else {
                                    i4 = i3;
                                    i8 = i18;
                                }
                                i4 = i3;
                                i8 = i22;
                            }
                        } else if (i30 == 2) {
                            ati atiVar = (ati) unsafe2.getObject(t4, j);
                            if (!atiVar.a()) {
                                int size = atiVar.size();
                                atiVar = atiVar.a(size == 0 ? 10 : size << 1);
                                unsafe2.putObject(t4, j, atiVar);
                            }
                            i22 = arp.a(aumVar2.a(i31), i34, bArr, i40, i2, atiVar, aroVar);
                            i21 = i3;
                            i23 = i29;
                            i25 = i34;
                            i24 = i31;
                            aroVar6 = aroVar7;
                            i27 = i39;
                            i26 = i26;
                            i20 = i2;
                        } else {
                            i17 = i26;
                            i7 = i29;
                            i18 = i40;
                            i19 = i34;
                            i10 = i31;
                            unsafe = unsafe2;
                            i4 = i3;
                            i8 = i18;
                        }
                        i27 = i39;
                        i26 = i17;
                        i9 = i19;
                    }
                }
                if (i9 != i4 || i4 == 0) {
                    if (this.h) {
                        aroVar2 = aroVar;
                        if (aroVar2.d != asn.a()) {
                            int i41 = i7;
                            if (aroVar2.d.a(this.g, i41) == null) {
                                i22 = arp.a(i9, bArr, i8, i2, e(t), aroVar);
                                t4 = t;
                                i20 = i2;
                                i25 = i9;
                                aumVar2 = this;
                                aroVar6 = aroVar2;
                                i23 = i41;
                                i24 = i10;
                                unsafe2 = unsafe;
                                bArr2 = bArr;
                                i21 = i4;
                            } else {
                                ((ata.b) t).a();
                                throw new NoSuchMethodError();
                            }
                        } else {
                            t3 = t;
                        }
                    } else {
                        t3 = t;
                        aroVar2 = aroVar;
                    }
                    i22 = arp.a(i9, bArr, i8, i2, e(t), aroVar);
                    i25 = i9;
                    aumVar2 = this;
                    aroVar6 = aroVar2;
                    i23 = i7;
                    t4 = t3;
                    i24 = i10;
                    unsafe2 = unsafe;
                    bArr2 = bArr;
                    i20 = i2;
                    i21 = i4;
                } else {
                    aumVar = this;
                    t2 = t;
                    i22 = i8;
                    i25 = i9;
                }
            } else {
                unsafe = unsafe2;
                i4 = i21;
                t2 = t4;
                aumVar = aumVar2;
            }
        }
        if (i27 != -1) {
            unsafe.putInt(t2, i27, i26);
        }
        avr avrVar = null;
        for (int i42 = aumVar.m; i42 < aumVar.n; i42++) {
            avrVar = (avr) aumVar.a((Object) t2, aumVar.l[i42], (int) avrVar, (avp<UT, int>) aumVar.q);
        }
        if (avrVar != null) {
            aumVar.q.b((Object) t2, (T) avrVar);
        }
        if (i4 == 0) {
            if (i22 != i2) {
                throw zzfi.h();
            }
        } else if (i22 > i2 || i25 != i4) {
            throw zzfi.h();
        }
        return i22;
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
    @Override // defpackage.aux
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(T r28, byte[] r29, int r30, int r31, defpackage.aro r32) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aum.a(java.lang.Object, byte[], int, int, aro):void");
    }

    @Override // defpackage.aux
    public final void c(T t) {
        int i;
        int i2 = this.m;
        while (true) {
            i = this.n;
            if (i2 >= i) {
                break;
            }
            long c = c(this.l[i2]) & 1048575;
            Object f = avu.f(t, c);
            if (f != null) {
                avu.a(t, c, this.s.d(f));
            }
            i2++;
        }
        int length = this.l.length;
        while (i < length) {
            this.p.b(t, this.l[i]);
            i++;
        }
        this.q.d(t);
        if (this.h) {
            this.r.c(t);
        }
    }

    private final <UT, UB> UB a(Object obj, int i, UB ub, avp<UT, UB> avpVar) {
        ath b2;
        int i2 = this.c[i];
        Object f = avu.f(obj, c(i) & 1048575);
        return (f == null || (b2 = b(i)) == null) ? ub : (UB) a(i2, this.s.a(f), b2, (ath) ub, (avp<UT, ath>) avpVar);
    }

    private final <K, V, UT, UB> UB a(int i, Map<K, V> map, ath athVar, UB ub, avp<UT, UB> avpVar) {
        aty<?, ?> b2 = this.s.b();
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!athVar.a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = avpVar.a();
                }
                asb d = art.d(aua.a(b2, next.getKey(), next.getValue()));
                try {
                    aua.a(d.a, b2, next.getKey(), next.getValue());
                    avpVar.a((avp<UT, UB>) ub, i, d.a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [aux] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17, types: [aux] */
    /* JADX WARN: Type inference failed for: r6v20 */
    @Override // defpackage.aux
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
            if (((268435456 & c) != 0) && !a((aum<T>) t, i5, i4, i)) {
                return false;
            }
            int i9 = (267386880 & c) >>> 20;
            if (i9 == 9 || i9 == 17) {
                if (a((aum<T>) t, i5, i4, i) && !a(t, c, a(i5))) {
                    return false;
                }
            } else {
                if (i9 != 27) {
                    if (i9 == 60 || i9 == 68) {
                        if (a((aum<T>) t, i6, i5) && !a(t, c, a(i5))) {
                            return false;
                        }
                    } else if (i9 != 49) {
                        if (i9 != 50) {
                            continue;
                        } else {
                            Map<?, ?> b2 = this.s.b(avu.f(t, c & 1048575));
                            if (!b2.isEmpty() && this.s.b().c.zzwz() == awj.MESSAGE) {
                                aux<T> auxVar = 0;
                                Iterator<?> it = b2.values().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    Object next = it.next();
                                    if (auxVar == null) {
                                        auxVar = aut.a().a((Class) next.getClass());
                                    }
                                    boolean d = auxVar.d(next);
                                    auxVar = auxVar;
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
                List list = (List) avu.f(t, c & 1048575);
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
    private static boolean a(Object obj, int i, aux auxVar) {
        return auxVar.d(avu.f(obj, i & 1048575));
    }

    private static void a(int i, Object obj, awm awmVar) throws IOException {
        if (obj instanceof String) {
            awmVar.a(i, (String) obj);
        } else {
            awmVar.a(i, (art) obj);
        }
    }

    private final void a(Object obj, int i, auy auyVar) throws IOException {
        if (e(i)) {
            avu.a(obj, i & 1048575, auyVar.m());
        } else if (this.i) {
            avu.a(obj, i & 1048575, auyVar.l());
        } else {
            avu.a(obj, i & 1048575, auyVar.n());
        }
    }

    private final int c(int i) {
        return this.c[i + 1];
    }

    private final int d(int i) {
        return this.c[i + 2];
    }

    private static <T> double b(T t, long j) {
        return ((Double) avu.f(t, j)).doubleValue();
    }

    private static <T> float c(T t, long j) {
        return ((Float) avu.f(t, j)).floatValue();
    }

    private static <T> int d(T t, long j) {
        return ((Integer) avu.f(t, j)).intValue();
    }

    private static <T> long e(T t, long j) {
        return ((Long) avu.f(t, j)).longValue();
    }

    private static <T> boolean f(T t, long j) {
        return ((Boolean) avu.f(t, j)).booleanValue();
    }

    private final boolean c(T t, T t2, int i) {
        return a((aum<T>) t, i) == a((aum<T>) t2, i);
    }

    private final boolean a(T t, int i, int i2, int i3) {
        if (this.j) {
            return a((aum<T>) t, i);
        }
        return (i2 & i3) != 0;
    }

    private final boolean a(T t, int i) {
        if (this.j) {
            int c = c(i);
            long j = c & 1048575;
            switch ((c & 267386880) >>> 20) {
                case 0:
                    return avu.e(t, j) != 0.0d;
                case 1:
                    return avu.d(t, j) != 0.0f;
                case 2:
                    return avu.b(t, j) != 0;
                case 3:
                    return avu.b(t, j) != 0;
                case 4:
                    return avu.a(t, j) != 0;
                case 5:
                    return avu.b(t, j) != 0;
                case 6:
                    return avu.a(t, j) != 0;
                case 7:
                    return avu.c(t, j);
                case 8:
                    Object f = avu.f(t, j);
                    if (f instanceof String) {
                        return !((String) f).isEmpty();
                    } else if (!(f instanceof art)) {
                        throw new IllegalArgumentException();
                    } else {
                        return !art.a.equals(f);
                    }
                case 9:
                    return avu.f(t, j) != null;
                case 10:
                    return !art.a.equals(avu.f(t, j));
                case 11:
                    return avu.a(t, j) != 0;
                case 12:
                    return avu.a(t, j) != 0;
                case 13:
                    return avu.a(t, j) != 0;
                case 14:
                    return avu.b(t, j) != 0;
                case 15:
                    return avu.a(t, j) != 0;
                case 16:
                    return avu.b(t, j) != 0;
                case 17:
                    return avu.f(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        }
        int d = d(i);
        return (avu.a(t, (long) (d & 1048575)) & (1 << (d >>> 20))) != 0;
    }

    private final void b(T t, int i) {
        if (this.j) {
            return;
        }
        int d = d(i);
        long j = d & 1048575;
        avu.a((Object) t, j, avu.a(t, j) | (1 << (d >>> 20)));
    }

    private final boolean a(T t, int i, int i2) {
        return avu.a(t, (long) (d(i2) & 1048575)) == i;
    }

    private final void b(T t, int i, int i2) {
        avu.a((Object) t, d(i2) & 1048575, i);
    }

    private final int f(int i) {
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
