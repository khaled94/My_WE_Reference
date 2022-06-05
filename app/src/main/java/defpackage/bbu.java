package defpackage;

import com.google.android.gms.internal.places.zzaj;
import defpackage.bbw;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bbu  reason: default package */
/* loaded from: classes2.dex */
public final class bbu<FieldDescriptorType extends bbw<FieldDescriptorType>> {
    private static final bbu d = new bbu((byte) 0);
    boolean b;
    boolean c = false;
    final bdz<FieldDescriptorType, Object> a = bdz.a(16);

    private bbu() {
    }

    private bbu(byte b) {
        b();
    }

    public static <T extends bbw<T>> bbu<T> a() {
        return d;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        this.a.a();
        this.b = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bbu) {
            return this.a.equals(((bbu) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> c() {
        if (this.c) {
            return new bcn(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }

    private final Object a(FieldDescriptorType fielddescriptortype) {
        Object obj = this.a.get(fielddescriptortype);
        return obj instanceof bcj ? bcj.a() : obj;
    }

    private final void b(FieldDescriptorType fielddescriptortype, Object obj) {
        if (fielddescriptortype.d()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                a(fielddescriptortype.b(), obj2);
            }
            obj = arrayList;
        } else {
            a(fielddescriptortype.b(), obj);
        }
        if (obj instanceof bcj) {
            this.c = true;
        }
        this.a.a((bdz<FieldDescriptorType, Object>) fielddescriptortype, (FieldDescriptorType) obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        if ((r3 instanceof defpackage.bcg) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        if ((r3 instanceof byte[]) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        if ((r3 instanceof defpackage.bcj) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        r0 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(defpackage.bfc r2, java.lang.Object r3) {
        /*
            defpackage.bcd.a(r3)
            int[] r0 = defpackage.bbt.a
            bfj r2 = r2.zzdr()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L41;
                case 2: goto L3e;
                case 3: goto L3b;
                case 4: goto L38;
                case 5: goto L35;
                case 6: goto L32;
                case 7: goto L29;
                case 8: goto L20;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            goto L44
        L15:
            boolean r2 = r3 instanceof defpackage.bdh
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof defpackage.bcj
            if (r2 == 0) goto L1e
            goto L43
        L1e:
            r0 = 0
            goto L43
        L20:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof defpackage.bcg
            if (r2 == 0) goto L1e
            goto L43
        L29:
            boolean r2 = r3 instanceof defpackage.bgb
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L1e
            goto L43
        L32:
            boolean r0 = r3 instanceof java.lang.String
            goto L43
        L35:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L43
        L38:
            boolean r0 = r3 instanceof java.lang.Double
            goto L43
        L3b:
            boolean r0 = r3 instanceof java.lang.Float
            goto L43
        L3e:
            boolean r0 = r3 instanceof java.lang.Long
            goto L43
        L41:
            boolean r0 = r3 instanceof java.lang.Integer
        L43:
            r1 = r0
        L44:
            if (r1 == 0) goto L47
            return
        L47:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbu.a(bfc, java.lang.Object):void");
    }

    public final boolean d() {
        for (int i = 0; i < this.a.b(); i++) {
            if (!c(this.a.b(i))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.a.c()) {
            if (!c(entry)) {
                return false;
            }
        }
        return true;
    }

    private static boolean c(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.c() == bfj.MESSAGE) {
            if (key.d()) {
                for (bdh bdhVar : (List) entry.getValue()) {
                    if (!bdhVar.b()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof bdh) {
                    if (!((bdh) value).b()) {
                        return false;
                    }
                } else if (value instanceof bcj) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    private static Object a(Object obj) {
        if (obj instanceof bdm) {
            return ((bdm) obj).a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Map.Entry<FieldDescriptorType, Object> entry) {
        bdh bdhVar;
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof bcj) {
            value = bcj.a();
        }
        if (key.d()) {
            Object a = a((bbu<FieldDescriptorType>) key);
            if (a == null) {
                a = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) a).add(a(obj));
            }
            this.a.a((bdz<FieldDescriptorType, Object>) key, (FieldDescriptorType) a);
        } else if (key.c() == bfj.MESSAGE) {
            Object a2 = a((bbu<FieldDescriptorType>) key);
            if (a2 == null) {
                this.a.a((bdz<FieldDescriptorType, Object>) key, (FieldDescriptorType) a(value));
                return;
            }
            if (a2 instanceof bdm) {
                bdhVar = key.g();
            } else {
                ((bdh) a2).e();
                bdhVar = key.f().d();
            }
            this.a.a((bdz<FieldDescriptorType, Object>) key, (FieldDescriptorType) bdhVar);
        } else {
            this.a.a((bdz<FieldDescriptorType, Object>) key, (FieldDescriptorType) a(value));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(zzaj zzajVar, bfc bfcVar, int i, Object obj) throws IOException {
        if (bfcVar == bfc.GROUP) {
            bcd.a();
            zzajVar.a(i, 3);
            ((bdh) obj).a(zzajVar);
            zzajVar.a(i, 4);
            return;
        }
        zzajVar.a(i, bfcVar.zzds());
        switch (bbt.b[bfcVar.ordinal()]) {
            case 1:
                zzajVar.a(((Double) obj).doubleValue());
                return;
            case 2:
                zzajVar.a(((Float) obj).floatValue());
                return;
            case 3:
                zzajVar.a(((Long) obj).longValue());
                return;
            case 4:
                zzajVar.a(((Long) obj).longValue());
                return;
            case 5:
                zzajVar.a(((Integer) obj).intValue());
                return;
            case 6:
                zzajVar.c(((Long) obj).longValue());
                return;
            case 7:
                zzajVar.d(((Integer) obj).intValue());
                return;
            case 8:
                zzajVar.a(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((bdh) obj).a(zzajVar);
                return;
            case 10:
                zzajVar.a((bdh) obj);
                return;
            case 11:
                if (obj instanceof bgb) {
                    zzajVar.a((bgb) obj);
                    return;
                } else {
                    zzajVar.a((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof bgb) {
                    zzajVar.a((bgb) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzajVar.a(bArr, bArr.length);
                return;
            case 13:
                zzajVar.b(((Integer) obj).intValue());
                return;
            case 14:
                zzajVar.d(((Integer) obj).intValue());
                return;
            case 15:
                zzajVar.c(((Long) obj).longValue());
                return;
            case 16:
                zzajVar.c(((Integer) obj).intValue());
                return;
            case 17:
                zzajVar.b(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof bcg) {
                    zzajVar.a(((bcg) obj).a());
                    return;
                } else {
                    zzajVar.a(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (key.c() == bfj.MESSAGE && !key.d() && !key.e()) {
            if (value instanceof bcj) {
                return zzaj.b(entry.getKey().a(), (bcj) value);
            }
            return zzaj.b(entry.getKey().a(), (bdh) value);
        }
        return a((bbw<?>) key, value);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(bfc bfcVar, int i, Object obj) {
        int l = zzaj.l(i);
        if (bfcVar == bfc.GROUP) {
            bcd.a();
            l <<= 1;
        }
        return l + b(bfcVar, obj);
    }

    private static int b(bfc bfcVar, Object obj) {
        switch (bbt.b[bfcVar.ordinal()]) {
            case 1:
                ((Double) obj).doubleValue();
                return zzaj.f();
            case 2:
                ((Float) obj).floatValue();
                return zzaj.e();
            case 3:
                return zzaj.d(((Long) obj).longValue());
            case 4:
                return zzaj.e(((Long) obj).longValue());
            case 5:
                return zzaj.m(((Integer) obj).intValue());
            case 6:
                ((Long) obj).longValue();
                return zzaj.c();
            case 7:
                ((Integer) obj).intValue();
                return zzaj.a();
            case 8:
                ((Boolean) obj).booleanValue();
                return zzaj.g();
            case 9:
                return zzaj.c((bdh) obj);
            case 10:
                if (obj instanceof bcj) {
                    return zzaj.a((bcj) obj);
                }
                return zzaj.b((bdh) obj);
            case 11:
                if (obj instanceof bgb) {
                    return zzaj.b((bgb) obj);
                }
                return zzaj.b((String) obj);
            case 12:
                if (obj instanceof bgb) {
                    return zzaj.b((bgb) obj);
                }
                return zzaj.b((byte[]) obj);
            case 13:
                return zzaj.n(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                return zzaj.b();
            case 15:
                ((Long) obj).longValue();
                return zzaj.d();
            case 16:
                return zzaj.o(((Integer) obj).intValue());
            case 17:
                return zzaj.f(((Long) obj).longValue());
            case 18:
                if (obj instanceof bcg) {
                    return zzaj.p(((bcg) obj).a());
                }
                return zzaj.p(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int a(bbw<?> bbwVar, Object obj) {
        bfc b = bbwVar.b();
        int a = bbwVar.a();
        if (bbwVar.d()) {
            int i = 0;
            if (bbwVar.e()) {
                for (Object obj2 : (List) obj) {
                    i += b(b, obj2);
                }
                return zzaj.l(a) + i + zzaj.q(i);
            }
            for (Object obj3 : (List) obj) {
                i += a(b, a, obj3);
            }
            return i;
        }
        return a(b, a, obj);
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        bbu bbuVar = new bbu();
        for (int i = 0; i < this.a.b(); i++) {
            Map.Entry<FieldDescriptorType, Object> b = this.a.b(i);
            bbuVar.b((bbu) b.getKey(), b.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.a.c()) {
            bbuVar.b((bbu) entry.getKey(), entry.getValue());
        }
        bbuVar.c = this.c;
        return bbuVar;
    }
}
