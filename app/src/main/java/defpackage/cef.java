package defpackage;

import com.google.crypto.tink.shaded.protobuf.CodedOutputStream;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.ccq;
import defpackage.ccu;
import defpackage.cdg;
import defpackage.cdm;
import defpackage.cdv;
import defpackage.cff;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cef  reason: default package */
/* loaded from: classes2.dex */
public final class cef<T> implements cet<T> {
    private static final int[] a = new int[0];
    private static final Unsafe b = cfd.c();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final cec g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final int[] l;
    private final int m;
    private final int n;
    private final ceh o;
    private final cds p;
    private final cez<?, ?> q;
    private final cdc<?> r;
    private final cdx s;

    private static boolean f(int i) {
        return (i & 536870912) != 0;
    }

    private cef(int[] iArr, Object[] objArr, int i, int i2, cec cecVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, ceh cehVar, cds cdsVar, cez<?, ?> cezVar, cdc<?> cdcVar, cdx cdxVar) {
        this.c = iArr;
        this.d = objArr;
        this.e = i;
        this.f = i2;
        this.i = cecVar instanceof cdk;
        this.j = z;
        this.h = cdcVar != null && cdcVar.a(cecVar);
        this.k = z2;
        this.l = iArr2;
        this.m = i3;
        this.n = i4;
        this.o = cehVar;
        this.p = cdsVar;
        this.q = cezVar;
        this.r = cdcVar;
        this.g = cecVar;
        this.s = cdxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0612  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> defpackage.cef<T> a(defpackage.cea r43, defpackage.ceh r44, defpackage.cds r45, defpackage.cez<?, ?> r46, defpackage.cdc<?> r47, defpackage.cdx r48) {
        /*
            Method dump skipped, instructions count: 1684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cef.a(cea, ceh, cds, cez, cdc, cdx):cef");
    }

    private static Field a(Class<?> cls, String str) {
        Field[] declaredFields;
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            for (Field field : cls.getDeclaredFields()) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    @Override // defpackage.cet
    public final T a() {
        return (T) this.o.a(this.g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
        if (defpackage.cev.a(defpackage.cfd.f(r10, r6), defpackage.cfd.f(r11, r6)) != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
        if (defpackage.cev.a(defpackage.cfd.f(r10, r6), defpackage.cfd.f(r11, r6)) != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
        if (defpackage.cfd.b(r10, r6) == defpackage.cfd.b(r11, r6)) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
        if (defpackage.cfd.a(r10, r6) == defpackage.cfd.a(r11, r6)) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a9, code lost:
        if (defpackage.cfd.b(r10, r6) == defpackage.cfd.b(r11, r6)) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bb, code lost:
        if (defpackage.cfd.a(r10, r6) == defpackage.cfd.a(r11, r6)) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cd, code lost:
        if (defpackage.cfd.a(r10, r6) == defpackage.cfd.a(r11, r6)) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00df, code lost:
        if (defpackage.cfd.a(r10, r6) == defpackage.cfd.a(r11, r6)) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f5, code lost:
        if (defpackage.cev.a(defpackage.cfd.f(r10, r6), defpackage.cfd.f(r11, r6)) != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010b, code lost:
        if (defpackage.cev.a(defpackage.cfd.f(r10, r6), defpackage.cfd.f(r11, r6)) != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0121, code lost:
        if (defpackage.cev.a(defpackage.cfd.f(r10, r6), defpackage.cfd.f(r11, r6)) != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0133, code lost:
        if (defpackage.cfd.c(r10, r6) == defpackage.cfd.c(r11, r6)) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0145, code lost:
        if (defpackage.cfd.a(r10, r6) == defpackage.cfd.a(r11, r6)) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0159, code lost:
        if (defpackage.cfd.b(r10, r6) == defpackage.cfd.b(r11, r6)) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016a, code lost:
        if (defpackage.cfd.a(r10, r6) == defpackage.cfd.a(r11, r6)) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017d, code lost:
        if (defpackage.cfd.b(r10, r6) == defpackage.cfd.b(r11, r6)) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0190, code lost:
        if (defpackage.cfd.b(r10, r6) == defpackage.cfd.b(r11, r6)) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a9, code lost:
        if (java.lang.Float.floatToIntBits(defpackage.cfd.d(r10, r6)) == java.lang.Float.floatToIntBits(defpackage.cfd.d(r11, r6))) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c4, code lost:
        if (java.lang.Double.doubleToLongBits(defpackage.cfd.e(r10, r6)) == java.lang.Double.doubleToLongBits(defpackage.cfd.e(r11, r6))) goto L89;
     */
    @Override // defpackage.cet
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cef.a(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // defpackage.cet
    public final int a(T t) {
        int i;
        int i2;
        int length = this.c.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int d = d(i4);
            int i5 = this.c[i4];
            long j = 1048575 & d;
            int i6 = 37;
            switch ((d & 267386880) >>> 20) {
                case 0:
                    i2 = i3 * 53;
                    i = cdm.a(Double.doubleToLongBits(cfd.e(t, j)));
                    i3 = i2 + i;
                    break;
                case 1:
                    i2 = i3 * 53;
                    i = Float.floatToIntBits(cfd.d(t, j));
                    i3 = i2 + i;
                    break;
                case 2:
                    i2 = i3 * 53;
                    i = cdm.a(cfd.b(t, j));
                    i3 = i2 + i;
                    break;
                case 3:
                    i2 = i3 * 53;
                    i = cdm.a(cfd.b(t, j));
                    i3 = i2 + i;
                    break;
                case 4:
                    i2 = i3 * 53;
                    i = cfd.a(t, j);
                    i3 = i2 + i;
                    break;
                case 5:
                    i2 = i3 * 53;
                    i = cdm.a(cfd.b(t, j));
                    i3 = i2 + i;
                    break;
                case 6:
                    i2 = i3 * 53;
                    i = cfd.a(t, j);
                    i3 = i2 + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    i = cdm.a(cfd.c(t, j));
                    i3 = i2 + i;
                    break;
                case 8:
                    i2 = i3 * 53;
                    i = ((String) cfd.f(t, j)).hashCode();
                    i3 = i2 + i;
                    break;
                case 9:
                    Object f = cfd.f(t, j);
                    if (f != null) {
                        i6 = f.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
                    break;
                case 10:
                    i2 = i3 * 53;
                    i = cfd.f(t, j).hashCode();
                    i3 = i2 + i;
                    break;
                case 11:
                    i2 = i3 * 53;
                    i = cfd.a(t, j);
                    i3 = i2 + i;
                    break;
                case 12:
                    i2 = i3 * 53;
                    i = cfd.a(t, j);
                    i3 = i2 + i;
                    break;
                case 13:
                    i2 = i3 * 53;
                    i = cfd.a(t, j);
                    i3 = i2 + i;
                    break;
                case 14:
                    i2 = i3 * 53;
                    i = cdm.a(cfd.b(t, j));
                    i3 = i2 + i;
                    break;
                case 15:
                    i2 = i3 * 53;
                    i = cfd.a(t, j);
                    i3 = i2 + i;
                    break;
                case 16:
                    i2 = i3 * 53;
                    i = cdm.a(cfd.b(t, j));
                    i3 = i2 + i;
                    break;
                case 17:
                    Object f2 = cfd.f(t, j);
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
                    i = cfd.f(t, j).hashCode();
                    i3 = i2 + i;
                    break;
                case 50:
                    i2 = i3 * 53;
                    i = cfd.f(t, j).hashCode();
                    i3 = i2 + i;
                    break;
                case 51:
                    if (a((cef<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = cdm.a(Double.doubleToLongBits(b(t, j)));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (a((cef<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = Float.floatToIntBits(c(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (a((cef<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = cdm.a(e(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (a((cef<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = cdm.a(e(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (a((cef<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = d(t, j);
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (a((cef<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = cdm.a(e(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (a((cef<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = d(t, j);
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (a((cef<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = cdm.a(f(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (a((cef<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = ((String) cfd.f(t, j)).hashCode();
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (a((cef<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = cfd.f(t, j).hashCode();
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (a((cef<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = cfd.f(t, j).hashCode();
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (a((cef<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = d(t, j);
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (a((cef<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = d(t, j);
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (a((cef<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = d(t, j);
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (a((cef<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = cdm.a(e(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (a((cef<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = d(t, j);
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (a((cef<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = cdm.a(e(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (a((cef<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        i = cfd.f(t, j).hashCode();
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

    @Override // defpackage.cet
    public final void b(T t, T t2) {
        if (t2 == null) {
            throw null;
        }
        for (int i = 0; i < this.c.length; i += 3) {
            int d = d(i);
            long j = 1048575 & d;
            int i2 = this.c[i];
            switch ((d & 267386880) >>> 20) {
                case 0:
                    if (a((cef<T>) t2, i)) {
                        cfd.a(t, j, cfd.e(t2, j));
                        b((cef<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (a((cef<T>) t2, i)) {
                        cfd.a((Object) t, j, cfd.d(t2, j));
                        b((cef<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (a((cef<T>) t2, i)) {
                        cfd.a((Object) t, j, cfd.b(t2, j));
                        b((cef<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (a((cef<T>) t2, i)) {
                        cfd.a((Object) t, j, cfd.b(t2, j));
                        b((cef<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (a((cef<T>) t2, i)) {
                        cfd.a((Object) t, j, cfd.a(t2, j));
                        b((cef<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (a((cef<T>) t2, i)) {
                        cfd.a((Object) t, j, cfd.b(t2, j));
                        b((cef<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (a((cef<T>) t2, i)) {
                        cfd.a((Object) t, j, cfd.a(t2, j));
                        b((cef<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (a((cef<T>) t2, i)) {
                        cfd.a(t, j, cfd.c(t2, j));
                        b((cef<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (a((cef<T>) t2, i)) {
                        cfd.a(t, j, cfd.f(t2, j));
                        b((cef<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    a(t, t2, i);
                    break;
                case 10:
                    if (a((cef<T>) t2, i)) {
                        cfd.a(t, j, cfd.f(t2, j));
                        b((cef<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (a((cef<T>) t2, i)) {
                        cfd.a((Object) t, j, cfd.a(t2, j));
                        b((cef<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (a((cef<T>) t2, i)) {
                        cfd.a((Object) t, j, cfd.a(t2, j));
                        b((cef<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (a((cef<T>) t2, i)) {
                        cfd.a((Object) t, j, cfd.a(t2, j));
                        b((cef<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (a((cef<T>) t2, i)) {
                        cfd.a((Object) t, j, cfd.b(t2, j));
                        b((cef<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (a((cef<T>) t2, i)) {
                        cfd.a((Object) t, j, cfd.a(t2, j));
                        b((cef<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (a((cef<T>) t2, i)) {
                        cfd.a((Object) t, j, cfd.b(t2, j));
                        b((cef<T>) t, i);
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
                    cev.a(this.s, t, t2, j);
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
                    if (a((cef<T>) t2, i2, i)) {
                        cfd.a(t, j, cfd.f(t2, j));
                        b((cef<T>) t, i2, i);
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
                    if (a((cef<T>) t2, i2, i)) {
                        cfd.a(t, j, cfd.f(t2, j));
                        b((cef<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    b(t, t2, i);
                    break;
            }
        }
        cev.a(this.q, t, t2);
        if (!this.h) {
            return;
        }
        cev.a(this.r, t, t2);
    }

    private void a(T t, T t2, int i) {
        long d = d(i) & 1048575;
        if (!a((cef<T>) t2, i)) {
            return;
        }
        Object f = cfd.f(t, d);
        Object f2 = cfd.f(t2, d);
        if (f != null && f2 != null) {
            cfd.a(t, d, cdm.a(f, f2));
            b((cef<T>) t, i);
        } else if (f2 == null) {
        } else {
            cfd.a(t, d, f2);
            b((cef<T>) t, i);
        }
    }

    private void b(T t, T t2, int i) {
        int d = d(i);
        int i2 = this.c[i];
        long j = d & 1048575;
        if (!a((cef<T>) t2, i2, i)) {
            return;
        }
        Object f = cfd.f(t, j);
        Object f2 = cfd.f(t2, j);
        if (f != null && f2 != null) {
            cfd.a(t, j, cdm.a(f, f2));
            b((cef<T>) t, i2, i);
        } else if (f2 == null) {
        } else {
            cfd.a(t, j, f2);
            b((cef<T>) t, i2, i);
        }
    }

    @Override // defpackage.cet
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
                int d = d(i12);
                int i13 = (d & 267386880) >>> 20;
                int i14 = this.c[i12];
                long j3 = d & 1048575;
                int i15 = (i13 < cdh.DOUBLE_LIST_PACKED.id() || i13 > cdh.SINT64_LIST_PACKED.id()) ? 0 : this.c[i12 + 2] & 1048575;
                switch (i13) {
                    case 0:
                        if (a((cef<T>) t, i12)) {
                            j2 = CodedOutputStream.j(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 1:
                        if (a((cef<T>) t, i12)) {
                            j2 = CodedOutputStream.i(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if (a((cef<T>) t, i12)) {
                            j2 = CodedOutputStream.d(i14, cfd.b(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if (a((cef<T>) t, i12)) {
                            j2 = CodedOutputStream.e(i14, cfd.b(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if (a((cef<T>) t, i12)) {
                            j2 = CodedOutputStream.f(i14, cfd.a(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if (a((cef<T>) t, i12)) {
                            j2 = CodedOutputStream.g(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if (a((cef<T>) t, i12)) {
                            j2 = CodedOutputStream.e(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if (a((cef<T>) t, i12)) {
                            j2 = CodedOutputStream.k(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        if (a((cef<T>) t, i12)) {
                            Object f = cfd.f(t, j3);
                            if (f instanceof ccu) {
                                j2 = CodedOutputStream.c(i14, (ccu) f);
                                break;
                            } else {
                                j2 = CodedOutputStream.b(i14, (String) f);
                                break;
                            }
                        } else {
                            continue;
                        }
                    case 9:
                        if (a((cef<T>) t, i12)) {
                            j2 = cev.a(i14, cfd.f(t, j3), a(i12));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        if (a((cef<T>) t, i12)) {
                            j2 = CodedOutputStream.c(i14, (ccu) cfd.f(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        if (a((cef<T>) t, i12)) {
                            j2 = CodedOutputStream.g(i14, cfd.a(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        if (a((cef<T>) t, i12)) {
                            j2 = CodedOutputStream.i(i14, cfd.a(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        if (a((cef<T>) t, i12)) {
                            j2 = CodedOutputStream.f(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        if (a((cef<T>) t, i12)) {
                            j2 = CodedOutputStream.h(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if (a((cef<T>) t, i12)) {
                            j2 = CodedOutputStream.h(i14, cfd.a(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if (a((cef<T>) t, i12)) {
                            j2 = CodedOutputStream.f(i14, cfd.b(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if (a((cef<T>) t, i12)) {
                            j2 = CodedOutputStream.c(i14, (cec) cfd.f(t, j3), a(i12));
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        j2 = cev.i(i14, a(t, j3));
                        break;
                    case 19:
                        j2 = cev.h(i14, a(t, j3));
                        break;
                    case 20:
                        j2 = cev.a(i14, (List<Long>) a(t, j3));
                        break;
                    case 21:
                        j2 = cev.b(i14, a(t, j3));
                        break;
                    case 22:
                        j2 = cev.e(i14, a(t, j3));
                        break;
                    case 23:
                        j2 = cev.i(i14, a(t, j3));
                        break;
                    case 24:
                        j2 = cev.h(i14, a(t, j3));
                        break;
                    case 25:
                        j2 = cev.j(i14, a(t, j3));
                        break;
                    case 26:
                        j2 = cev.k(i14, a(t, j3));
                        break;
                    case 27:
                        j2 = cev.a(i14, a(t, j3), a(i12));
                        break;
                    case 28:
                        j2 = cev.l(i14, a(t, j3));
                        break;
                    case 29:
                        j2 = cev.f(i14, a(t, j3));
                        break;
                    case 30:
                        j2 = cev.d(i14, a(t, j3));
                        break;
                    case 31:
                        j2 = cev.h(i14, a(t, j3));
                        break;
                    case 32:
                        j2 = cev.i(i14, a(t, j3));
                        break;
                    case 33:
                        j2 = cev.g(i14, a(t, j3));
                        break;
                    case 34:
                        j2 = cev.c(i14, a(t, j3));
                        break;
                    case 35:
                        i7 = cev.i((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = CodedOutputStream.l(i14);
                            i6 = CodedOutputStream.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 36:
                        i7 = cev.h((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = CodedOutputStream.l(i14);
                            i6 = CodedOutputStream.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 37:
                        i7 = cev.a((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = CodedOutputStream.l(i14);
                            i6 = CodedOutputStream.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 38:
                        i7 = cev.b((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = CodedOutputStream.l(i14);
                            i6 = CodedOutputStream.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 39:
                        i7 = cev.e((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = CodedOutputStream.l(i14);
                            i6 = CodedOutputStream.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 40:
                        i7 = cev.i((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = CodedOutputStream.l(i14);
                            i6 = CodedOutputStream.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 41:
                        i7 = cev.h((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = CodedOutputStream.l(i14);
                            i6 = CodedOutputStream.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 42:
                        i7 = cev.j((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = CodedOutputStream.l(i14);
                            i6 = CodedOutputStream.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 43:
                        i7 = cev.f((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = CodedOutputStream.l(i14);
                            i6 = CodedOutputStream.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 44:
                        i7 = cev.d((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = CodedOutputStream.l(i14);
                            i6 = CodedOutputStream.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 45:
                        i7 = cev.h((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = CodedOutputStream.l(i14);
                            i6 = CodedOutputStream.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 46:
                        i7 = cev.i((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = CodedOutputStream.l(i14);
                            i6 = CodedOutputStream.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 47:
                        i7 = cev.g((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = CodedOutputStream.l(i14);
                            i6 = CodedOutputStream.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 48:
                        i7 = cev.c((List) unsafe.getObject(t, j3));
                        if (i7 > 0) {
                            if (this.k) {
                                unsafe.putInt(t, i15, i7);
                            }
                            i8 = CodedOutputStream.l(i14);
                            i6 = CodedOutputStream.n(i7);
                            j2 = i8 + i6 + i7;
                            break;
                        } else {
                            continue;
                        }
                    case 49:
                        j2 = cev.b(i14, (List<cec>) a(t, j3), a(i12));
                        break;
                    case 50:
                        j2 = this.s.a(i14, cfd.f(t, j3), b(i12));
                        break;
                    case 51:
                        if (a((cef<T>) t, i14, i12)) {
                            j2 = CodedOutputStream.j(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 52:
                        if (a((cef<T>) t, i14, i12)) {
                            j2 = CodedOutputStream.i(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 53:
                        if (a((cef<T>) t, i14, i12)) {
                            j2 = CodedOutputStream.d(i14, e(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 54:
                        if (a((cef<T>) t, i14, i12)) {
                            j2 = CodedOutputStream.e(i14, e(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 55:
                        if (a((cef<T>) t, i14, i12)) {
                            j2 = CodedOutputStream.f(i14, d(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 56:
                        if (a((cef<T>) t, i14, i12)) {
                            j2 = CodedOutputStream.g(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 57:
                        if (a((cef<T>) t, i14, i12)) {
                            j2 = CodedOutputStream.e(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 58:
                        if (a((cef<T>) t, i14, i12)) {
                            j2 = CodedOutputStream.k(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 59:
                        if (a((cef<T>) t, i14, i12)) {
                            Object f2 = cfd.f(t, j3);
                            if (f2 instanceof ccu) {
                                j2 = CodedOutputStream.c(i14, (ccu) f2);
                                break;
                            } else {
                                j2 = CodedOutputStream.b(i14, (String) f2);
                                break;
                            }
                        } else {
                            continue;
                        }
                    case 60:
                        if (a((cef<T>) t, i14, i12)) {
                            j2 = cev.a(i14, cfd.f(t, j3), a(i12));
                            break;
                        } else {
                            continue;
                        }
                    case 61:
                        if (a((cef<T>) t, i14, i12)) {
                            j2 = CodedOutputStream.c(i14, (ccu) cfd.f(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 62:
                        if (a((cef<T>) t, i14, i12)) {
                            j2 = CodedOutputStream.g(i14, d(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 63:
                        if (a((cef<T>) t, i14, i12)) {
                            j2 = CodedOutputStream.i(i14, d(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 64:
                        if (a((cef<T>) t, i14, i12)) {
                            j2 = CodedOutputStream.f(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 65:
                        if (a((cef<T>) t, i14, i12)) {
                            j2 = CodedOutputStream.h(i14);
                            break;
                        } else {
                            continue;
                        }
                    case 66:
                        if (a((cef<T>) t, i14, i12)) {
                            j2 = CodedOutputStream.h(i14, d(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 67:
                        if (a((cef<T>) t, i14, i12)) {
                            j2 = CodedOutputStream.f(i14, e(t, j3));
                            break;
                        } else {
                            continue;
                        }
                    case 68:
                        if (a((cef<T>) t, i14, i12)) {
                            j2 = CodedOutputStream.c(i14, (cec) cfd.f(t, j3), a(i12));
                            break;
                        } else {
                            continue;
                        }
                    default:
                }
                i11 += j2;
            }
            return i11 + a((cez) this.q, (Object) t);
        }
        Unsafe unsafe2 = b;
        int i16 = -1;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i17 < this.c.length) {
            int d2 = d(i17);
            int[] iArr = this.c;
            int i20 = iArr[i17];
            int i21 = (d2 & i9) >>> 20;
            if (i21 <= 17) {
                i2 = iArr[i17 + 2];
                int i22 = i2 & i10;
                i = 1 << (i2 >>> 20);
                if (i22 != i16) {
                    i19 = unsafe2.getInt(t, i22);
                    i16 = i22;
                }
            } else {
                i2 = (!this.k || i21 < cdh.DOUBLE_LIST_PACKED.id() || i21 > cdh.SINT64_LIST_PACKED.id()) ? 0 : this.c[i17 + 2] & i10;
                i = 0;
            }
            long j4 = d2 & i10;
            switch (i21) {
                case 0:
                    if ((i19 & i) != 0) {
                        j = CodedOutputStream.j(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i19 & i) != 0) {
                        j = CodedOutputStream.i(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i19 & i) != 0) {
                        j = CodedOutputStream.d(i20, unsafe2.getLong(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i19 & i) != 0) {
                        j = CodedOutputStream.e(i20, unsafe2.getLong(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i19 & i) != 0) {
                        j = CodedOutputStream.f(i20, unsafe2.getInt(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i19 & i) != 0) {
                        j = CodedOutputStream.g(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i19 & i) != 0) {
                        j = CodedOutputStream.e(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i19 & i) != 0) {
                        j = CodedOutputStream.k(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i19 & i) != 0) {
                        Object object = unsafe2.getObject(t, j4);
                        if (object instanceof ccu) {
                            j = CodedOutputStream.c(i20, (ccu) object);
                        } else {
                            j = CodedOutputStream.b(i20, (String) object);
                        }
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if ((i19 & i) != 0) {
                        j = cev.a(i20, unsafe2.getObject(t, j4), a(i17));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i19 & i) != 0) {
                        j = CodedOutputStream.c(i20, (ccu) unsafe2.getObject(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i19 & i) != 0) {
                        j = CodedOutputStream.g(i20, unsafe2.getInt(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i19 & i) != 0) {
                        j = CodedOutputStream.i(i20, unsafe2.getInt(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i19 & i) != 0) {
                        j = CodedOutputStream.f(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i19 & i) != 0) {
                        j = CodedOutputStream.h(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i19 & i) != 0) {
                        j = CodedOutputStream.h(i20, unsafe2.getInt(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i19 & i) != 0) {
                        j = CodedOutputStream.f(i20, unsafe2.getLong(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i19 & i) != 0) {
                        j = CodedOutputStream.c(i20, (cec) unsafe2.getObject(t, j4), a(i17));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    j = cev.i(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 19:
                    j = cev.h(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 20:
                    j = cev.a(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 21:
                    j = cev.b(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 22:
                    j = cev.e(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 23:
                    j = cev.i(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 24:
                    j = cev.h(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 25:
                    j = cev.j(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 26:
                    j = cev.k(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 27:
                    j = cev.a(i20, (List<?>) unsafe2.getObject(t, j4), a(i17));
                    i18 += j;
                    break;
                case 28:
                    j = cev.l(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 29:
                    j = cev.f(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 30:
                    j = cev.d(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 31:
                    j = cev.h(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 32:
                    j = cev.i(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 33:
                    j = cev.g(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 34:
                    j = cev.c(i20, (List) unsafe2.getObject(t, j4));
                    i18 += j;
                    break;
                case 35:
                    i5 = cev.i((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = CodedOutputStream.l(i20);
                        i3 = CodedOutputStream.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 36:
                    i5 = cev.h((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = CodedOutputStream.l(i20);
                        i3 = CodedOutputStream.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 37:
                    i5 = cev.a((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = CodedOutputStream.l(i20);
                        i3 = CodedOutputStream.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 38:
                    i5 = cev.b((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = CodedOutputStream.l(i20);
                        i3 = CodedOutputStream.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 39:
                    i5 = cev.e((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = CodedOutputStream.l(i20);
                        i3 = CodedOutputStream.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 40:
                    i5 = cev.i((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = CodedOutputStream.l(i20);
                        i3 = CodedOutputStream.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 41:
                    i5 = cev.h((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = CodedOutputStream.l(i20);
                        i3 = CodedOutputStream.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 42:
                    i5 = cev.j((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = CodedOutputStream.l(i20);
                        i3 = CodedOutputStream.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 43:
                    i5 = cev.f((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = CodedOutputStream.l(i20);
                        i3 = CodedOutputStream.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 44:
                    i5 = cev.d((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = CodedOutputStream.l(i20);
                        i3 = CodedOutputStream.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 45:
                    i5 = cev.h((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = CodedOutputStream.l(i20);
                        i3 = CodedOutputStream.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 46:
                    i5 = cev.i((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = CodedOutputStream.l(i20);
                        i3 = CodedOutputStream.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 47:
                    i5 = cev.g((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = CodedOutputStream.l(i20);
                        i3 = CodedOutputStream.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 48:
                    i5 = cev.c((List) unsafe2.getObject(t, j4));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe2.putInt(t, i2, i5);
                        }
                        i4 = CodedOutputStream.l(i20);
                        i3 = CodedOutputStream.n(i5);
                        i18 += i4 + i3 + i5;
                        break;
                    }
                case 49:
                    j = cev.b(i20, (List) unsafe2.getObject(t, j4), a(i17));
                    i18 += j;
                    break;
                case 50:
                    j = this.s.a(i20, unsafe2.getObject(t, j4), b(i17));
                    i18 += j;
                    break;
                case 51:
                    if (a((cef<T>) t, i20, i17)) {
                        j = CodedOutputStream.j(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (a((cef<T>) t, i20, i17)) {
                        j = CodedOutputStream.i(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (a((cef<T>) t, i20, i17)) {
                        j = CodedOutputStream.d(i20, e(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (a((cef<T>) t, i20, i17)) {
                        j = CodedOutputStream.e(i20, e(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (a((cef<T>) t, i20, i17)) {
                        j = CodedOutputStream.f(i20, d(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (a((cef<T>) t, i20, i17)) {
                        j = CodedOutputStream.g(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (a((cef<T>) t, i20, i17)) {
                        j = CodedOutputStream.e(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (a((cef<T>) t, i20, i17)) {
                        j = CodedOutputStream.k(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (a((cef<T>) t, i20, i17)) {
                        Object object2 = unsafe2.getObject(t, j4);
                        if (object2 instanceof ccu) {
                            j = CodedOutputStream.c(i20, (ccu) object2);
                        } else {
                            j = CodedOutputStream.b(i20, (String) object2);
                        }
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (a((cef<T>) t, i20, i17)) {
                        j = cev.a(i20, unsafe2.getObject(t, j4), a(i17));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (a((cef<T>) t, i20, i17)) {
                        j = CodedOutputStream.c(i20, (ccu) unsafe2.getObject(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (a((cef<T>) t, i20, i17)) {
                        j = CodedOutputStream.g(i20, d(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (a((cef<T>) t, i20, i17)) {
                        j = CodedOutputStream.i(i20, d(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (a((cef<T>) t, i20, i17)) {
                        j = CodedOutputStream.f(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (a((cef<T>) t, i20, i17)) {
                        j = CodedOutputStream.h(i20);
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (a((cef<T>) t, i20, i17)) {
                        j = CodedOutputStream.h(i20, d(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (a((cef<T>) t, i20, i17)) {
                        j = CodedOutputStream.f(i20, e(t, j4));
                        i18 += j;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (a((cef<T>) t, i20, i17)) {
                        j = CodedOutputStream.c(i20, (cec) unsafe2.getObject(t, j4), a(i17));
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
        int a2 = i18 + a((cez) this.q, (Object) t);
        if (!this.h) {
            return a2;
        }
        cdg<?> a3 = this.r.a(t);
        int i23 = 0;
        for (int i24 = 0; i24 < a3.a.b(); i24++) {
            Map.Entry<?, Object> b2 = a3.a.b(i24);
            i23 += cdg.c((cdg.a) b2.getKey(), b2.getValue());
        }
        for (Map.Entry<?, Object> entry : a3.a.c()) {
            i23 += cdg.c((cdg.a) entry.getKey(), entry.getValue());
        }
        return a2 + i23;
    }

    private static <UT, UB> int a(cez<UT, UB> cezVar, T t) {
        return cezVar.f(cezVar.b(t));
    }

    private static List<?> a(Object obj, long j) {
        return (List) cfd.f(obj, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0a44  */
    @Override // defpackage.cet
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(T r14, defpackage.cfg r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2942
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cef.a(java.lang.Object, cfg):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0496  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(T r19, defpackage.cfg r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cef.b(java.lang.Object, cfg):void");
    }

    private <K, V> void a(cfg cfgVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            cfgVar.a(i, this.s.e(b(i2)), this.s.b(obj));
        }
    }

    private static <UT, UB> void a(cez<UT, UB> cezVar, T t, cfg cfgVar) throws IOException {
        cezVar.a((cez<UT, UB>) cezVar.b(t), cfgVar);
    }

    @Override // defpackage.cet
    public final void a(T t, ces cesVar, cdb cdbVar) throws IOException {
        if (cdbVar == null) {
            throw null;
        }
        a(this.q, this.r, (cdc) t, cesVar, cdbVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends cdg.a<ET>> void a(cez<UT, UB> cezVar, cdc<ET> cdcVar, T t, ces cesVar, cdb cdbVar) throws IOException {
        cdg<ET> cdgVar = null;
        Object obj = null;
        while (true) {
            try {
                int a2 = cesVar.a();
                int g = g(a2);
                if (g >= 0) {
                    int d = d(g);
                    switch ((267386880 & d) >>> 20) {
                        case 0:
                            cfd.a(t, d & 1048575, cesVar.d());
                            b((cef<T>) t, g);
                            break;
                        case 1:
                            cfd.a((Object) t, d & 1048575, cesVar.e());
                            b((cef<T>) t, g);
                            break;
                        case 2:
                            cfd.a((Object) t, d & 1048575, cesVar.g());
                            b((cef<T>) t, g);
                            break;
                        case 3:
                            cfd.a((Object) t, d & 1048575, cesVar.f());
                            b((cef<T>) t, g);
                            break;
                        case 4:
                            cfd.a((Object) t, d & 1048575, cesVar.h());
                            b((cef<T>) t, g);
                            break;
                        case 5:
                            cfd.a((Object) t, d & 1048575, cesVar.i());
                            b((cef<T>) t, g);
                            break;
                        case 6:
                            cfd.a((Object) t, d & 1048575, cesVar.j());
                            b((cef<T>) t, g);
                            break;
                        case 7:
                            cfd.a(t, d & 1048575, cesVar.k());
                            b((cef<T>) t, g);
                            break;
                        case 8:
                            a(t, d, cesVar);
                            b((cef<T>) t, g);
                            break;
                        case 9:
                            if (a((cef<T>) t, g)) {
                                long j = d & 1048575;
                                cfd.a(t, j, cdm.a(cfd.f(t, j), cesVar.a(a(g), cdbVar)));
                                break;
                            } else {
                                cfd.a(t, d & 1048575, cesVar.a(a(g), cdbVar));
                                b((cef<T>) t, g);
                                break;
                            }
                        case 10:
                            cfd.a(t, d & 1048575, cesVar.n());
                            b((cef<T>) t, g);
                            break;
                        case 11:
                            cfd.a((Object) t, d & 1048575, cesVar.o());
                            b((cef<T>) t, g);
                            break;
                        case 12:
                            int p = cesVar.p();
                            cdm.e c = c(g);
                            if (c != null && !c.a(p)) {
                                obj = cev.a(a2, p, obj, cezVar);
                                break;
                            }
                            cfd.a((Object) t, d & 1048575, p);
                            b((cef<T>) t, g);
                            break;
                        case 13:
                            cfd.a((Object) t, d & 1048575, cesVar.q());
                            b((cef<T>) t, g);
                            break;
                        case 14:
                            cfd.a((Object) t, d & 1048575, cesVar.r());
                            b((cef<T>) t, g);
                            break;
                        case 15:
                            cfd.a((Object) t, d & 1048575, cesVar.s());
                            b((cef<T>) t, g);
                            break;
                        case 16:
                            cfd.a((Object) t, d & 1048575, cesVar.t());
                            b((cef<T>) t, g);
                            break;
                        case 17:
                            if (a((cef<T>) t, g)) {
                                long j2 = d & 1048575;
                                cfd.a(t, j2, cdm.a(cfd.f(t, j2), cesVar.b(a(g), cdbVar)));
                                break;
                            } else {
                                cfd.a(t, d & 1048575, cesVar.b(a(g), cdbVar));
                                b((cef<T>) t, g);
                                break;
                            }
                        case 18:
                            cesVar.a(this.p.a(t, d & 1048575));
                            break;
                        case 19:
                            cesVar.b(this.p.a(t, d & 1048575));
                            break;
                        case 20:
                            cesVar.d(this.p.a(t, d & 1048575));
                            break;
                        case 21:
                            cesVar.c(this.p.a(t, d & 1048575));
                            break;
                        case 22:
                            cesVar.e(this.p.a(t, d & 1048575));
                            break;
                        case 23:
                            cesVar.f(this.p.a(t, d & 1048575));
                            break;
                        case 24:
                            cesVar.g(this.p.a(t, d & 1048575));
                            break;
                        case 25:
                            cesVar.h(this.p.a(t, d & 1048575));
                            break;
                        case 26:
                            if (f(d)) {
                                cesVar.j(this.p.a(t, d & 1048575));
                                break;
                            } else {
                                cesVar.i(this.p.a(t, d & 1048575));
                                break;
                            }
                        case 27:
                            cesVar.a(this.p.a(t, d & 1048575), a(g), cdbVar);
                            break;
                        case 28:
                            cesVar.k(this.p.a(t, d & 1048575));
                            break;
                        case 29:
                            cesVar.l(this.p.a(t, d & 1048575));
                            break;
                        case 30:
                            List<Integer> a3 = this.p.a(t, d & 1048575);
                            cesVar.m(a3);
                            obj = cev.a(a2, a3, c(g), obj, cezVar);
                            break;
                        case 31:
                            cesVar.n(this.p.a(t, d & 1048575));
                            break;
                        case 32:
                            cesVar.o(this.p.a(t, d & 1048575));
                            break;
                        case 33:
                            cesVar.p(this.p.a(t, d & 1048575));
                            break;
                        case 34:
                            cesVar.q(this.p.a(t, d & 1048575));
                            break;
                        case 35:
                            cesVar.a(this.p.a(t, d & 1048575));
                            break;
                        case 36:
                            cesVar.b(this.p.a(t, d & 1048575));
                            break;
                        case 37:
                            cesVar.d(this.p.a(t, d & 1048575));
                            break;
                        case 38:
                            cesVar.c(this.p.a(t, d & 1048575));
                            break;
                        case 39:
                            cesVar.e(this.p.a(t, d & 1048575));
                            break;
                        case 40:
                            cesVar.f(this.p.a(t, d & 1048575));
                            break;
                        case 41:
                            cesVar.g(this.p.a(t, d & 1048575));
                            break;
                        case 42:
                            cesVar.h(this.p.a(t, d & 1048575));
                            break;
                        case 43:
                            cesVar.l(this.p.a(t, d & 1048575));
                            break;
                        case 44:
                            List<Integer> a4 = this.p.a(t, d & 1048575);
                            cesVar.m(a4);
                            obj = cev.a(a2, a4, c(g), obj, cezVar);
                            break;
                        case 45:
                            cesVar.n(this.p.a(t, d & 1048575));
                            break;
                        case 46:
                            cesVar.o(this.p.a(t, d & 1048575));
                            break;
                        case 47:
                            cesVar.p(this.p.a(t, d & 1048575));
                            break;
                        case 48:
                            cesVar.q(this.p.a(t, d & 1048575));
                            break;
                        case 49:
                            cesVar.b(this.p.a(t, d & 1048575), a(g), cdbVar);
                            break;
                        case 50:
                            Object b2 = b(g);
                            long d2 = d(g) & 1048575;
                            Object f = cfd.f(t, d2);
                            if (f == null) {
                                f = this.s.a();
                                cfd.a(t, d2, f);
                            } else if (this.s.c(f)) {
                                Object a5 = this.s.a();
                                this.s.a(a5, f);
                                cfd.a(t, d2, a5);
                                f = a5;
                            }
                            cesVar.a(this.s.a(f), this.s.e(b2), cdbVar);
                            break;
                        case 51:
                            cfd.a(t, d & 1048575, Double.valueOf(cesVar.d()));
                            b((cef<T>) t, a2, g);
                            break;
                        case 52:
                            cfd.a(t, d & 1048575, Float.valueOf(cesVar.e()));
                            b((cef<T>) t, a2, g);
                            break;
                        case 53:
                            cfd.a(t, d & 1048575, Long.valueOf(cesVar.g()));
                            b((cef<T>) t, a2, g);
                            break;
                        case 54:
                            cfd.a(t, d & 1048575, Long.valueOf(cesVar.f()));
                            b((cef<T>) t, a2, g);
                            break;
                        case 55:
                            cfd.a(t, d & 1048575, Integer.valueOf(cesVar.h()));
                            b((cef<T>) t, a2, g);
                            break;
                        case 56:
                            cfd.a(t, d & 1048575, Long.valueOf(cesVar.i()));
                            b((cef<T>) t, a2, g);
                            break;
                        case 57:
                            cfd.a(t, d & 1048575, Integer.valueOf(cesVar.j()));
                            b((cef<T>) t, a2, g);
                            break;
                        case 58:
                            cfd.a(t, d & 1048575, Boolean.valueOf(cesVar.k()));
                            b((cef<T>) t, a2, g);
                            break;
                        case 59:
                            a(t, d, cesVar);
                            b((cef<T>) t, a2, g);
                            break;
                        case 60:
                            if (a((cef<T>) t, a2, g)) {
                                long j3 = d & 1048575;
                                cfd.a(t, j3, cdm.a(cfd.f(t, j3), cesVar.a(a(g), cdbVar)));
                            } else {
                                cfd.a(t, d & 1048575, cesVar.a(a(g), cdbVar));
                                b((cef<T>) t, g);
                            }
                            b((cef<T>) t, a2, g);
                            break;
                        case 61:
                            cfd.a(t, d & 1048575, cesVar.n());
                            b((cef<T>) t, a2, g);
                            break;
                        case 62:
                            cfd.a(t, d & 1048575, Integer.valueOf(cesVar.o()));
                            b((cef<T>) t, a2, g);
                            break;
                        case 63:
                            int p2 = cesVar.p();
                            cdm.e c2 = c(g);
                            if (c2 != null && !c2.a(p2)) {
                                obj = cev.a(a2, p2, obj, cezVar);
                                break;
                            }
                            cfd.a(t, d & 1048575, Integer.valueOf(p2));
                            b((cef<T>) t, a2, g);
                            break;
                        case 64:
                            cfd.a(t, d & 1048575, Integer.valueOf(cesVar.q()));
                            b((cef<T>) t, a2, g);
                            break;
                        case 65:
                            cfd.a(t, d & 1048575, Long.valueOf(cesVar.r()));
                            b((cef<T>) t, a2, g);
                            break;
                        case 66:
                            cfd.a(t, d & 1048575, Integer.valueOf(cesVar.s()));
                            b((cef<T>) t, a2, g);
                            break;
                        case 67:
                            cfd.a(t, d & 1048575, Long.valueOf(cesVar.t()));
                            b((cef<T>) t, a2, g);
                            break;
                        case 68:
                            cfd.a(t, d & 1048575, cesVar.b(a(g), cdbVar));
                            b((cef<T>) t, a2, g);
                            break;
                        default:
                            if (obj == null) {
                                try {
                                    obj = cezVar.a();
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                    if (obj == null) {
                                        obj = cezVar.c(t);
                                    }
                                    if (!cezVar.a((cez<UT, UB>) obj, cesVar)) {
                                        for (int i = this.m; i < this.n; i++) {
                                            obj = a((Object) t, this.l[i], (int) obj, (cez<UT, int>) cezVar);
                                        }
                                        if (obj == null) {
                                            return;
                                        }
                                        cezVar.b((Object) t, (T) obj);
                                        return;
                                    }
                                    break;
                                }
                            }
                            if (!cezVar.a((cez<UT, UB>) obj, cesVar)) {
                                for (int i2 = this.m; i2 < this.n; i2++) {
                                    obj = a((Object) t, this.l[i2], (int) obj, (cez<UT, int>) cezVar);
                                }
                                if (obj == null) {
                                    return;
                                }
                                cezVar.b((Object) t, (T) obj);
                                return;
                            }
                            break;
                    }
                } else if (a2 == Integer.MAX_VALUE) {
                    for (int i3 = this.m; i3 < this.n; i3++) {
                        obj = a((Object) t, this.l[i3], (int) obj, (cez<UT, int>) cezVar);
                    }
                    if (obj == null) {
                        return;
                    }
                    cezVar.b((Object) t, (T) obj);
                    return;
                } else {
                    Object a6 = !this.h ? null : cdcVar.a(cdbVar, this.g, a2);
                    if (a6 != null) {
                        if (cdgVar == null) {
                            cdgVar = cdcVar.b(t);
                        }
                        cdg<ET> cdgVar2 = cdgVar;
                        obj = cdcVar.a(cesVar, a6, cdbVar, cdgVar2, obj, cezVar);
                        cdgVar = cdgVar2;
                    } else {
                        if (obj == null) {
                            obj = cezVar.c(t);
                        }
                        if (!cezVar.a((cez<UT, UB>) obj, cesVar)) {
                            for (int i4 = this.m; i4 < this.n; i4++) {
                                obj = a((Object) t, this.l[i4], (int) obj, (cez<UT, int>) cezVar);
                            }
                            if (obj == null) {
                                return;
                            }
                            cezVar.b((Object) t, (T) obj);
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i5 = this.m; i5 < this.n; i5++) {
                    obj = a((Object) t, this.l[i5], (int) obj, (cez<UT, int>) cezVar);
                }
                if (obj != null) {
                    cezVar.b((Object) t, (T) obj);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cfa c(Object obj) {
        cdk cdkVar = (cdk) obj;
        cfa cfaVar = cdkVar.unknownFields;
        if (cfaVar == cfa.a()) {
            cfa b2 = cfa.b();
            cdkVar.unknownFields = b2;
            return b2;
        }
        return cfaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cef$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[cff.a.values().length];
            a = iArr;
            try {
                iArr[cff.a.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[cff.a.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[cff.a.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[cff.a.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[cff.a.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[cff.a.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[cff.a.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[cff.a.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[cff.a.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[cff.a.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[cff.a.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[cff.a.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[cff.a.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[cff.a.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[cff.a.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[cff.a.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[cff.a.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private static int a(byte[] bArr, int i, int i2, cff.a aVar, Class<?> cls, ccq.a aVar2) throws IOException {
        switch (AnonymousClass1.a[aVar.ordinal()]) {
            case 1:
                int b2 = ccq.b(bArr, i, aVar2);
                aVar2.c = Boolean.valueOf(aVar2.b != 0);
                return b2;
            case 2:
                return ccq.e(bArr, i, aVar2);
            case 3:
                aVar2.c = Double.valueOf(ccq.c(bArr, i));
                return i + 8;
            case 4:
            case 5:
                aVar2.c = Integer.valueOf(ccq.a(bArr, i));
                return i + 4;
            case 6:
            case 7:
                aVar2.c = Long.valueOf(ccq.b(bArr, i));
                return i + 8;
            case 8:
                aVar2.c = Float.valueOf(ccq.d(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int a2 = ccq.a(bArr, i, aVar2);
                aVar2.c = Integer.valueOf(aVar2.a);
                return a2;
            case 12:
            case 13:
                int b3 = ccq.b(bArr, i, aVar2);
                aVar2.c = Long.valueOf(aVar2.b);
                return b3;
            case 14:
                return ccq.a(ceo.a().a((Class) cls), bArr, i, i2, aVar2);
            case 15:
                int a3 = ccq.a(bArr, i, aVar2);
                aVar2.c = Integer.valueOf(ccv.e(aVar2.a));
                return a3;
            case 16:
                int b4 = ccq.b(bArr, i, aVar2);
                aVar2.c = Long.valueOf(ccv.a(aVar2.b));
                return b4;
            case 17:
                return ccq.d(bArr, i, aVar2);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x011b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0118 -> B:47:0x0119). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, defpackage.ccq.a r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cef.a(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, ccq$a):int");
    }

    private <K, V> int a(T t, byte[] bArr, int i, int i2, int i3, long j, ccq.a aVar) throws IOException {
        Unsafe unsafe = b;
        Object b2 = b(i3);
        Object object = unsafe.getObject(t, j);
        if (this.s.c(object)) {
            Object a2 = this.s.a();
            this.s.a(a2, object);
            unsafe.putObject(t, j, a2);
            object = a2;
        }
        cdv.a<?, ?> e = this.s.e(b2);
        Map<?, ?> a3 = this.s.a(object);
        int a4 = ccq.a(bArr, i, aVar);
        int i4 = aVar.a;
        if (i4 < 0 || i4 > i2 - a4) {
            throw InvalidProtocolBufferException.a();
        }
        int i5 = i4 + a4;
        Object obj = (K) e.b;
        Object obj2 = (V) e.d;
        while (a4 < i5) {
            int i6 = a4 + 1;
            int i7 = bArr[a4];
            if (i7 < 0) {
                i6 = ccq.a(i7, bArr, i6, aVar);
                i7 = aVar.a;
            }
            int i8 = i6;
            int i9 = i7 >>> 3;
            int i10 = i7 & 7;
            if (i9 == 1) {
                if (i10 == e.a.getWireType()) {
                    a4 = a(bArr, i8, i2, e.a, (Class<?>) null, aVar);
                    obj = (K) aVar.c;
                } else {
                    a4 = ccq.a(i7, bArr, i8, i2, aVar);
                }
            } else {
                if (i9 == 2 && i10 == e.c.getWireType()) {
                    a4 = a(bArr, i8, i2, e.c, e.d.getClass(), aVar);
                    obj2 = (V) aVar.c;
                }
                a4 = ccq.a(i7, bArr, i8, i2, aVar);
            }
        }
        if (a4 != i5) {
            throw InvalidProtocolBufferException.h();
        }
        a3.put(obj, obj2);
        return i5;
    }

    private int a(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, ccq.a aVar) throws IOException {
        int i9;
        Unsafe unsafe = b;
        long j2 = this.c[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Double.valueOf(ccq.c(bArr, i)));
                    i9 = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Float.valueOf(ccq.d(bArr, i)));
                    i9 = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    i9 = ccq.b(bArr, i, aVar);
                    unsafe.putObject(t, j, Long.valueOf(aVar.b));
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    i9 = ccq.a(bArr, i, aVar);
                    unsafe.putObject(t, j, Integer.valueOf(aVar.a));
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(ccq.b(bArr, i)));
                    i9 = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(ccq.a(bArr, i)));
                    i9 = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    i9 = ccq.b(bArr, i, aVar);
                    unsafe.putObject(t, j, Boolean.valueOf(aVar.b != 0));
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    int a2 = ccq.a(bArr, i, aVar);
                    int i10 = aVar.a;
                    if (i10 == 0) {
                        unsafe.putObject(t, j, "");
                    } else if ((i6 & 536870912) != 0 && !cfe.a(bArr, a2, a2 + i10)) {
                        throw InvalidProtocolBufferException.i();
                    } else {
                        unsafe.putObject(t, j, new String(bArr, a2, i10, cdm.a));
                        a2 += i10;
                    }
                    unsafe.putInt(t, j2, i4);
                    return a2;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    int a3 = ccq.a(a(i8), bArr, i, i2, aVar);
                    Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, aVar.c);
                    } else {
                        unsafe.putObject(t, j, cdm.a(object, aVar.c));
                    }
                    unsafe.putInt(t, j2, i4);
                    return a3;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    i9 = ccq.e(bArr, i, aVar);
                    unsafe.putObject(t, j, aVar.c);
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int a4 = ccq.a(bArr, i, aVar);
                    int i11 = aVar.a;
                    cdm.e c = c(i8);
                    if (c == null || c.a(i11)) {
                        unsafe.putObject(t, j, Integer.valueOf(i11));
                        i9 = a4;
                        unsafe.putInt(t, j2, i4);
                        return i9;
                    }
                    c(t).a(i3, Long.valueOf(i11));
                    return a4;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    i9 = ccq.a(bArr, i, aVar);
                    unsafe.putObject(t, j, Integer.valueOf(ccv.e(aVar.a)));
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    i9 = ccq.b(bArr, i, aVar);
                    unsafe.putObject(t, j, Long.valueOf(ccv.a(aVar.b)));
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    i9 = ccq.a(a(i8), bArr, i, i2, (i3 & (-8)) | 4, aVar);
                    Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j, aVar.c);
                    } else {
                        unsafe.putObject(t, j, cdm.a(object2, aVar.c));
                    }
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            default:
                return i;
        }
    }

    private cet a(int i) {
        int i2 = (i / 3) * 2;
        cet cetVar = (cet) this.d[i2];
        if (cetVar != null) {
            return cetVar;
        }
        cet<T> a2 = ceo.a().a((Class) ((Class) this.d[i2 + 1]));
        this.d[i2] = a2;
        return a2;
    }

    private Object b(int i) {
        return this.d[(i / 3) * 2];
    }

    private cdm.e c(int i) {
        return (cdm.e) this.d[((i / 3) * 2) + 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x034a, code lost:
        if (r0 == r13) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x034e, code lost:
        r15 = r27;
        r14 = r28;
        r12 = r29;
        r13 = r31;
        r11 = r32;
        r9 = r33;
        r6 = r17;
        r1 = r18;
        r2 = r19;
        r7 = r24;
        r3 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0393, code lost:
        if (r0 == r15) goto L127;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(T r28, byte[] r29, int r30, int r31, int r32, defpackage.ccq.a r33) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1184
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cef.a(java.lang.Object, byte[], int, int, int, ccq$a):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0230, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01e2, code lost:
        if (r0 == r15) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x020f, code lost:
        if (r0 == r15) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x022e, code lost:
        if (r0 == r15) goto L100;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [int] */
    @Override // defpackage.cet
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(T r28, byte[] r29, int r30, int r31, defpackage.ccq.a r32) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cef.a(java.lang.Object, byte[], int, int, ccq$a):void");
    }

    @Override // defpackage.cet
    public final void d(T t) {
        int i;
        int i2 = this.m;
        while (true) {
            i = this.n;
            if (i2 >= i) {
                break;
            }
            long d = d(this.l[i2]) & 1048575;
            Object f = cfd.f(t, d);
            if (f != null) {
                cfd.a(t, d, this.s.d(f));
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

    private final <K, V, UT, UB> UB a(int i, int i2, Map<K, V> map, cdm.e eVar, UB ub, cez<UT, UB> cezVar) {
        cdv.a<?, ?> e = this.s.e(b(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = cezVar.a();
                }
                ccu.f d = ccu.d(cdv.a(e, next.getKey(), next.getValue()));
                try {
                    cdv.a(d.a, e, next.getKey(), next.getValue());
                    cezVar.a((cez<UT, UB>) ub, i2, d.a());
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14, types: [cet] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v5, types: [cet] */
    @Override // defpackage.cet
    public final boolean e(T t) {
        int i;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= this.m) {
                return !this.h || this.r.a(t).e();
            }
            int i5 = this.l[i3];
            int i6 = this.c[i5];
            int d = d(i5);
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
            if (((268435456 & d) != 0) && !a((cef<T>) t, i5, i4, i)) {
                return false;
            }
            int i9 = (267386880 & d) >>> 20;
            if (i9 == 9 || i9 == 17) {
                if (a((cef<T>) t, i5, i4, i) && !a(t, d, a(i5))) {
                    return false;
                }
            } else {
                if (i9 != 27) {
                    if (i9 == 60 || i9 == 68) {
                        if (a((cef<T>) t, i6, i5) && !a(t, d, a(i5))) {
                            return false;
                        }
                    } else if (i9 != 49) {
                        if (i9 != 50) {
                            continue;
                        } else {
                            Map<?, ?> b2 = this.s.b(cfd.f(t, d & 1048575));
                            if (!b2.isEmpty()) {
                                if (this.s.e(b(i5)).c.getJavaType() == cff.b.MESSAGE) {
                                    cet<T> cetVar = 0;
                                    Iterator<?> it = b2.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (cetVar == null) {
                                            cetVar = ceo.a().a((Class) next.getClass());
                                        }
                                        boolean e = cetVar.e(next);
                                        cetVar = cetVar;
                                        if (!e) {
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) cfd.f(t, d & 1048575);
                if (!list.isEmpty()) {
                    ?? a2 = a(i5);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= list.size()) {
                            break;
                        } else if (!a2.e(list.get(i10))) {
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
    private static boolean a(Object obj, int i, cet cetVar) {
        return cetVar.e(cfd.f(obj, i & 1048575));
    }

    private static void a(int i, Object obj, cfg cfgVar) throws IOException {
        if (obj instanceof String) {
            cfgVar.a(i, (String) obj);
        } else {
            cfgVar.a(i, (ccu) obj);
        }
    }

    private void a(Object obj, int i, ces cesVar) throws IOException {
        if (f(i)) {
            cfd.a(obj, i & 1048575, cesVar.m());
        } else if (this.i) {
            cfd.a(obj, i & 1048575, cesVar.l());
        } else {
            cfd.a(obj, i & 1048575, cesVar.n());
        }
    }

    private int d(int i) {
        return this.c[i + 1];
    }

    private int e(int i) {
        return this.c[i + 2];
    }

    private static <T> double b(T t, long j) {
        return ((Double) cfd.f(t, j)).doubleValue();
    }

    private static <T> float c(T t, long j) {
        return ((Float) cfd.f(t, j)).floatValue();
    }

    private static <T> int d(T t, long j) {
        return ((Integer) cfd.f(t, j)).intValue();
    }

    private static <T> long e(T t, long j) {
        return ((Long) cfd.f(t, j)).longValue();
    }

    private static <T> boolean f(T t, long j) {
        return ((Boolean) cfd.f(t, j)).booleanValue();
    }

    private boolean c(T t, T t2, int i) {
        return a((cef<T>) t, i) == a((cef<T>) t2, i);
    }

    private boolean a(T t, int i, int i2, int i3) {
        if (this.j) {
            return a((cef<T>) t, i);
        }
        return (i2 & i3) != 0;
    }

    private boolean a(T t, int i) {
        if (this.j) {
            int d = d(i);
            long j = d & 1048575;
            switch ((d & 267386880) >>> 20) {
                case 0:
                    return cfd.e(t, j) != 0.0d;
                case 1:
                    return cfd.d(t, j) != 0.0f;
                case 2:
                    return cfd.b(t, j) != 0;
                case 3:
                    return cfd.b(t, j) != 0;
                case 4:
                    return cfd.a(t, j) != 0;
                case 5:
                    return cfd.b(t, j) != 0;
                case 6:
                    return cfd.a(t, j) != 0;
                case 7:
                    return cfd.c(t, j);
                case 8:
                    Object f = cfd.f(t, j);
                    if (f instanceof String) {
                        return !((String) f).isEmpty();
                    } else if (!(f instanceof ccu)) {
                        throw new IllegalArgumentException();
                    } else {
                        return !ccu.a.equals(f);
                    }
                case 9:
                    return cfd.f(t, j) != null;
                case 10:
                    return !ccu.a.equals(cfd.f(t, j));
                case 11:
                    return cfd.a(t, j) != 0;
                case 12:
                    return cfd.a(t, j) != 0;
                case 13:
                    return cfd.a(t, j) != 0;
                case 14:
                    return cfd.b(t, j) != 0;
                case 15:
                    return cfd.a(t, j) != 0;
                case 16:
                    return cfd.b(t, j) != 0;
                case 17:
                    return cfd.f(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        }
        int e = e(i);
        return (cfd.a(t, (long) (e & 1048575)) & (1 << (e >>> 20))) != 0;
    }

    private void b(T t, int i) {
        if (this.j) {
            return;
        }
        int e = e(i);
        long j = e & 1048575;
        cfd.a((Object) t, j, cfd.a(t, j) | (1 << (e >>> 20)));
    }

    private boolean a(T t, int i, int i2) {
        return cfd.a(t, (long) (e(i2) & 1048575)) == i;
    }

    private void b(T t, int i, int i2) {
        cfd.a((Object) t, e(i2) & 1048575, i);
    }

    private int g(int i) {
        if (i < this.e || i > this.f) {
            return -1;
        }
        return b(i, 0);
    }

    private int a(int i, int i2) {
        if (i < this.e || i > this.f) {
            return -1;
        }
        return b(i, i2);
    }

    private int b(int i, int i2) {
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

    private final <UT, UB> UB a(Object obj, int i, UB ub, cez<UT, UB> cezVar) {
        cdm.e c;
        int i2 = this.c[i];
        Object f = cfd.f(obj, d(i) & 1048575);
        return (f == null || (c = c(i)) == null) ? ub : (UB) a(i, i2, this.s.a(f), c, (cdm.e) ub, (cez<UT, cdm.e>) cezVar);
    }
}
