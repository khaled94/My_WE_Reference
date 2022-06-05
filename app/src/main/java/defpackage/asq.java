package defpackage;

import com.google.android.gms.internal.measurement.zzee;
import defpackage.ass;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: asq  reason: default package */
/* loaded from: classes.dex */
public final class asq<FieldDescriptorType extends ass<FieldDescriptorType>> {
    private static final asq d = new asq((byte) 0);
    boolean b;
    boolean c = false;
    final avd<FieldDescriptorType, Object> a = avd.a(16);

    private asq() {
    }

    private asq(byte b) {
        b();
    }

    public static <T extends ass<T>> asq<T> a() {
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
        if (obj instanceof asq) {
            return this.a.equals(((asq) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> c() {
        if (this.c) {
            return new ato(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }

    private final Object a(FieldDescriptorType fielddescriptortype) {
        Object obj = this.a.get(fielddescriptortype);
        return obj instanceof atk ? atk.a() : obj;
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
        if (obj instanceof atk) {
            this.c = true;
        }
        this.a.a((avd<FieldDescriptorType, Object>) fielddescriptortype, (FieldDescriptorType) obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        if ((r3 instanceof defpackage.atf) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        if ((r3 instanceof byte[]) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        if ((r3 instanceof defpackage.atk) == false) goto L8;
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
    private static void a(defpackage.awg r2, java.lang.Object r3) {
        /*
            defpackage.atb.a(r3)
            int[] r0 = defpackage.ast.a
            awj r2 = r2.zzwz()
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
            boolean r2 = r3 instanceof defpackage.aui
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof defpackage.atk
            if (r2 == 0) goto L1e
            goto L43
        L1e:
            r0 = 0
            goto L43
        L20:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof defpackage.atf
            if (r2 == 0) goto L1e
            goto L43
        L29:
            boolean r2 = r3 instanceof defpackage.art
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asq.a(awg, java.lang.Object):void");
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
        if (key.c() == awj.MESSAGE) {
            if (key.d()) {
                for (aui auiVar : (List) entry.getValue()) {
                    if (!auiVar.m()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof aui) {
                    if (!((aui) value).m()) {
                        return false;
                    }
                } else if (value instanceof atk) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    private static Object a(Object obj) {
        if (obj instanceof aun) {
            return ((aun) obj).a();
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
        aui auiVar;
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof atk) {
            value = atk.a();
        }
        if (key.d()) {
            Object a = a((asq<FieldDescriptorType>) key);
            if (a == null) {
                a = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) a).add(a(obj));
            }
            this.a.a((avd<FieldDescriptorType, Object>) key, (FieldDescriptorType) a);
        } else if (key.c() == awj.MESSAGE) {
            Object a2 = a((asq<FieldDescriptorType>) key);
            if (a2 == null) {
                this.a.a((avd<FieldDescriptorType, Object>) key, (FieldDescriptorType) a(value));
                return;
            }
            if (a2 instanceof aun) {
                auiVar = key.g();
            } else {
                ((aui) a2).p();
                auiVar = key.f().v();
            }
            this.a.a((avd<FieldDescriptorType, Object>) key, (FieldDescriptorType) auiVar);
        } else {
            this.a.a((avd<FieldDescriptorType, Object>) key, (FieldDescriptorType) a(value));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(zzee zzeeVar, awg awgVar, int i, Object obj) throws IOException {
        if (awgVar == awg.GROUP) {
            atb.a();
            zzeeVar.a(i, 3);
            ((aui) obj).a(zzeeVar);
            zzeeVar.a(i, 4);
            return;
        }
        zzeeVar.a(i, awgVar.zzxa());
        switch (ast.b[awgVar.ordinal()]) {
            case 1:
                zzeeVar.a(((Double) obj).doubleValue());
                return;
            case 2:
                zzeeVar.a(((Float) obj).floatValue());
                return;
            case 3:
                zzeeVar.a(((Long) obj).longValue());
                return;
            case 4:
                zzeeVar.a(((Long) obj).longValue());
                return;
            case 5:
                zzeeVar.a(((Integer) obj).intValue());
                return;
            case 6:
                zzeeVar.c(((Long) obj).longValue());
                return;
            case 7:
                zzeeVar.d(((Integer) obj).intValue());
                return;
            case 8:
                zzeeVar.a(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((aui) obj).a(zzeeVar);
                return;
            case 10:
                zzeeVar.a((aui) obj);
                return;
            case 11:
                if (obj instanceof art) {
                    zzeeVar.a((art) obj);
                    return;
                } else {
                    zzeeVar.a((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof art) {
                    zzeeVar.a((art) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzeeVar.a(bArr, bArr.length);
                return;
            case 13:
                zzeeVar.b(((Integer) obj).intValue());
                return;
            case 14:
                zzeeVar.d(((Integer) obj).intValue());
                return;
            case 15:
                zzeeVar.c(((Long) obj).longValue());
                return;
            case 16:
                zzeeVar.c(((Integer) obj).intValue());
                return;
            case 17:
                zzeeVar.b(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof atf) {
                    zzeeVar.a(((atf) obj).zzlg());
                    return;
                } else {
                    zzeeVar.a(((Integer) obj).intValue());
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
        if (key.c() == awj.MESSAGE && !key.d() && !key.e()) {
            if (value instanceof atk) {
                return zzee.b(entry.getKey().a(), (atk) value);
            }
            return zzee.d(entry.getKey().a(), (aui) value);
        }
        return a((ass<?>) key, value);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(awg awgVar, int i, Object obj) {
        int l = zzee.l(i);
        if (awgVar == awg.GROUP) {
            atb.a();
            l <<= 1;
        }
        return l + b(awgVar, obj);
    }

    private static int b(awg awgVar, Object obj) {
        switch (ast.b[awgVar.ordinal()]) {
            case 1:
                ((Double) obj).doubleValue();
                return zzee.f();
            case 2:
                ((Float) obj).floatValue();
                return zzee.e();
            case 3:
                return zzee.d(((Long) obj).longValue());
            case 4:
                return zzee.e(((Long) obj).longValue());
            case 5:
                return zzee.m(((Integer) obj).intValue());
            case 6:
                ((Long) obj).longValue();
                return zzee.c();
            case 7:
                ((Integer) obj).intValue();
                return zzee.a();
            case 8:
                ((Boolean) obj).booleanValue();
                return zzee.g();
            case 9:
                return zzee.c((aui) obj);
            case 10:
                if (obj instanceof atk) {
                    return zzee.a((atk) obj);
                }
                return zzee.b((aui) obj);
            case 11:
                if (obj instanceof art) {
                    return zzee.b((art) obj);
                }
                return zzee.b((String) obj);
            case 12:
                if (obj instanceof art) {
                    return zzee.b((art) obj);
                }
                return zzee.b((byte[]) obj);
            case 13:
                return zzee.n(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                return zzee.b();
            case 15:
                ((Long) obj).longValue();
                return zzee.d();
            case 16:
                return zzee.o(((Integer) obj).intValue());
            case 17:
                return zzee.f(((Long) obj).longValue());
            case 18:
                if (obj instanceof atf) {
                    return zzee.p(((atf) obj).zzlg());
                }
                return zzee.p(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int a(ass<?> assVar, Object obj) {
        awg b = assVar.b();
        int a = assVar.a();
        if (assVar.d()) {
            int i = 0;
            if (assVar.e()) {
                for (Object obj2 : (List) obj) {
                    i += b(b, obj2);
                }
                return zzee.l(a) + i + zzee.q(i);
            }
            for (Object obj3 : (List) obj) {
                i += a(b, a, obj3);
            }
            return i;
        }
        return a(b, a, obj);
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        asq asqVar = new asq();
        for (int i = 0; i < this.a.b(); i++) {
            Map.Entry<FieldDescriptorType, Object> b = this.a.b(i);
            asqVar.b((asq) b.getKey(), b.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.a.c()) {
            asqVar.b((asq) entry.getKey(), entry.getValue());
        }
        asqVar.c = this.c;
        return asqVar;
    }
}
