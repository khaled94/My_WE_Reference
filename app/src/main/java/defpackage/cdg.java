package defpackage;

import com.google.crypto.tink.shaded.protobuf.CodedOutputStream;
import defpackage.cdg.a;
import defpackage.cdm;
import defpackage.cdo;
import defpackage.cec;
import defpackage.cff;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cdg  reason: default package */
/* loaded from: classes2.dex */
public final class cdg<T extends a<T>> {
    private static final cdg d = new cdg((byte) 0);
    final cew<T, Object> a;
    boolean b;
    boolean c;

    /* renamed from: cdg$a */
    /* loaded from: classes2.dex */
    public interface a<T extends a<T>> extends Comparable<T> {
        int a();

        cec.a a(cec.a aVar, cec cecVar);

        cff.a b();

        cff.b c();

        boolean d();

        boolean e();
    }

    private cdg() {
        this.a = cew.a(16);
    }

    private cdg(byte b) {
        this(cew.a(0));
        b();
    }

    private cdg(cew<T, Object> cewVar) {
        this.a = cewVar;
        b();
    }

    public static <T extends a<T>> cdg<T> a() {
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
        if (obj instanceof cdg) {
            return this.a.equals(((cdg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> d() {
        if (this.c) {
            return new cdo.b(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }

    public final Object a(T t) {
        Object obj = this.a.get(t);
        return obj instanceof cdo ? ((cdo) obj).a() : obj;
    }

    public final void a(T t, Object obj) {
        if (t.d()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList<Object> arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            for (Object obj2 : arrayList) {
                a(t.b(), obj2);
            }
            obj = arrayList;
        } else {
            a(t.b(), obj);
        }
        if (obj instanceof cdo) {
            this.c = true;
        }
        this.a.a((cew<T, Object>) t, (T) obj);
    }

    public final void b(T t, Object obj) {
        List list;
        if (!t.d()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        a(t.b(), obj);
        Object a2 = a((cdg<T>) t);
        if (a2 == null) {
            list = new ArrayList();
            this.a.a((cew<T, Object>) t, (T) list);
        } else {
            list = (List) a2;
        }
        list.add(obj);
    }

    private static void a(cff.a aVar, Object obj) {
        if (b(aVar, obj)) {
            return;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static boolean b(cff.a aVar, Object obj) {
        cdm.a(obj);
        switch (AnonymousClass1.a[aVar.getJavaType().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof ccu) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof cdm.c);
            case 9:
                return (obj instanceof cec) || (obj instanceof cdo);
            default:
                return false;
        }
    }

    public final boolean e() {
        for (int i = 0; i < this.a.b(); i++) {
            if (!c(this.a.b(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.a.c()) {
            if (!c(entry)) {
                return false;
            }
        }
        return true;
    }

    private static <T extends a<T>> boolean c(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.c() == cff.b.MESSAGE) {
            if (key.d()) {
                for (cec cecVar : (List) entry.getValue()) {
                    if (!cecVar.m()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof cec) {
                    if (!((cec) value).m()) {
                        return false;
                    }
                } else if (value instanceof cdo) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    private static Object a(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof cdo) {
            value = ((cdo) value).a();
        }
        if (key.d()) {
            Object a2 = a((cdg<T>) key);
            if (a2 == null) {
                a2 = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) a2).add(a(obj));
            }
            this.a.a((cew<T, Object>) key, (T) a2);
        } else if (key.c() == cff.b.MESSAGE) {
            Object a3 = a((cdg<T>) key);
            if (a3 == null) {
                this.a.a((cew<T, Object>) key, (T) a(value));
                return;
            }
            this.a.a((cew<T, Object>) key, (T) key.a(((cec) a3).q(), (cec) value).g());
        } else {
            this.a.a((cew<T, Object>) key, (T) a(value));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(CodedOutputStream codedOutputStream, cff.a aVar, int i, Object obj) throws IOException {
        if (aVar != cff.a.GROUP) {
            codedOutputStream.a(i, aVar.getWireType());
            switch (AnonymousClass1.b[aVar.ordinal()]) {
                case 1:
                    codedOutputStream.a(((Double) obj).doubleValue());
                    return;
                case 2:
                    codedOutputStream.a(((Float) obj).floatValue());
                    return;
                case 3:
                    codedOutputStream.a(((Long) obj).longValue());
                    return;
                case 4:
                    codedOutputStream.a(((Long) obj).longValue());
                    return;
                case 5:
                    codedOutputStream.a(((Integer) obj).intValue());
                    return;
                case 6:
                    codedOutputStream.c(((Long) obj).longValue());
                    return;
                case 7:
                    codedOutputStream.d(((Integer) obj).intValue());
                    return;
                case 8:
                    codedOutputStream.a(((Boolean) obj).booleanValue());
                    return;
                case 9:
                    ((cec) obj).a(codedOutputStream);
                    return;
                case 10:
                    codedOutputStream.a((cec) obj);
                    return;
                case 11:
                    if (obj instanceof ccu) {
                        codedOutputStream.a((ccu) obj);
                        return;
                    } else {
                        codedOutputStream.a((String) obj);
                        return;
                    }
                case 12:
                    if (obj instanceof ccu) {
                        codedOutputStream.a((ccu) obj);
                        return;
                    }
                    byte[] bArr = (byte[]) obj;
                    codedOutputStream.a(bArr, bArr.length);
                    return;
                case 13:
                    codedOutputStream.b(((Integer) obj).intValue());
                    return;
                case 14:
                    codedOutputStream.d(((Integer) obj).intValue());
                    return;
                case 15:
                    codedOutputStream.c(((Long) obj).longValue());
                    return;
                case 16:
                    codedOutputStream.c(((Integer) obj).intValue());
                    return;
                case 17:
                    codedOutputStream.b(((Long) obj).longValue());
                    return;
                case 18:
                    if (obj instanceof cdm.c) {
                        codedOutputStream.a(((cdm.c) obj).getNumber());
                        return;
                    } else {
                        codedOutputStream.a(((Integer) obj).intValue());
                        return;
                    }
                default:
                    return;
            }
        }
        codedOutputStream.a(i, 3);
        ((cec) obj).a(codedOutputStream);
        codedOutputStream.a(i, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cdg$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[cff.a.values().length];
            b = iArr;
            try {
                iArr[cff.a.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[cff.a.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[cff.a.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[cff.a.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[cff.a.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[cff.a.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[cff.a.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[cff.a.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[cff.a.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[cff.a.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[cff.a.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[cff.a.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[cff.a.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[cff.a.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[cff.a.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[cff.a.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[cff.a.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[cff.a.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[cff.b.values().length];
            a = iArr2;
            try {
                iArr2[cff.b.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[cff.b.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[cff.b.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[cff.b.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[cff.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                a[cff.b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                a[cff.b.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[cff.b.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[cff.b.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.c() == cff.b.MESSAGE && !key.d() && !key.e()) {
            if (value instanceof cdo) {
                return CodedOutputStream.b(entry.getKey().a(), (cdo) value);
            }
            return CodedOutputStream.b(entry.getKey().a(), (cec) value);
        }
        return c((a<?>) key, value);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(cff.a aVar, int i, Object obj) {
        int l = CodedOutputStream.l(i);
        if (aVar == cff.a.GROUP) {
            l *= 2;
        }
        return l + c(aVar, obj);
    }

    private static int c(cff.a aVar, Object obj) {
        switch (AnonymousClass1.b[aVar.ordinal()]) {
            case 1:
                ((Double) obj).doubleValue();
                return CodedOutputStream.f();
            case 2:
                ((Float) obj).floatValue();
                return CodedOutputStream.e();
            case 3:
                return CodedOutputStream.d(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.e(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.m(((Integer) obj).intValue());
            case 6:
                ((Long) obj).longValue();
                return CodedOutputStream.c();
            case 7:
                ((Integer) obj).intValue();
                return CodedOutputStream.a();
            case 8:
                ((Boolean) obj).booleanValue();
                return CodedOutputStream.g();
            case 9:
                return CodedOutputStream.c((cec) obj);
            case 10:
                if (obj instanceof cdo) {
                    return CodedOutputStream.a((cdo) obj);
                }
                return CodedOutputStream.b((cec) obj);
            case 11:
                if (obj instanceof ccu) {
                    return CodedOutputStream.b((ccu) obj);
                }
                return CodedOutputStream.b((String) obj);
            case 12:
                if (obj instanceof ccu) {
                    return CodedOutputStream.b((ccu) obj);
                }
                return CodedOutputStream.b((byte[]) obj);
            case 13:
                return CodedOutputStream.n(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                return CodedOutputStream.b();
            case 15:
                ((Long) obj).longValue();
                return CodedOutputStream.d();
            case 16:
                return CodedOutputStream.o(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.f(((Long) obj).longValue());
            case 18:
                if (obj instanceof cdm.c) {
                    return CodedOutputStream.p(((cdm.c) obj).getNumber());
                }
                return CodedOutputStream.p(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int c(a<?> aVar, Object obj) {
        cff.a b = aVar.b();
        int a2 = aVar.a();
        if (aVar.d()) {
            int i = 0;
            if (aVar.e()) {
                for (Object obj2 : (List) obj) {
                    i += c(b, obj2);
                }
                return CodedOutputStream.l(a2) + i + CodedOutputStream.r(i);
            }
            for (Object obj3 : (List) obj) {
                i += a(b, a2, obj3);
            }
            return i;
        }
        return a(b, a2, obj);
    }

    /* renamed from: c */
    public final cdg<T> clone() {
        cdg<T> cdgVar = new cdg<>();
        for (int i = 0; i < this.a.b(); i++) {
            Map.Entry<T, Object> b = this.a.b(i);
            cdgVar.a((cdg<T>) b.getKey(), b.getValue());
        }
        for (Map.Entry<T, Object> entry : this.a.c()) {
            cdgVar.a((cdg<T>) entry.getKey(), entry.getValue());
        }
        cdgVar.c = this.c;
        return cdgVar;
    }
}
