package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.ccr;
import defpackage.cdk;
import defpackage.cff;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: cdd  reason: default package */
/* loaded from: classes2.dex */
final class cdd extends cdc<cdk.e> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.cdc
    public final boolean a(cec cecVar) {
        return cecVar instanceof cdk.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.cdc
    public final cdg<cdk.e> a(Object obj) {
        return ((cdk.c) obj).extensions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.cdc
    public final cdg<cdk.e> b(Object obj) {
        return ((cdk.c) obj).a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.cdc
    public final <UT, UB> UB a(ces cesVar, Object obj, cdb cdbVar, cdg<cdk.e> cdgVar, UB ub, cez<UT, UB> cezVar) throws IOException {
        Object a;
        ArrayList arrayList;
        cdk.f fVar = (cdk.f) obj;
        int i = fVar.b.b;
        if (fVar.b.d && fVar.b.e) {
            switch (AnonymousClass1.a[fVar.b.c.ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    cesVar.a(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    cesVar.b(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    cesVar.d(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    cesVar.c(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    cesVar.e(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    cesVar.f(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    cesVar.g(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    cesVar.h(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    cesVar.l(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    cesVar.n(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    cesVar.o(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    cesVar.p(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    cesVar.q(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    cesVar.m(arrayList);
                    ub = (UB) cev.a(i, arrayList, fVar.b.a, ub, cezVar);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + fVar.b.c);
            }
            cdgVar.a((cdg<cdk.e>) fVar.b, arrayList);
        } else {
            Object obj2 = null;
            if (fVar.b.c == cff.a.ENUM) {
                int h = cesVar.h();
                if (fVar.b.a.a(h) == null) {
                    return (UB) cev.a(i, h, ub, cezVar);
                }
                obj2 = Integer.valueOf(h);
            } else {
                switch (AnonymousClass1.a[fVar.b.c.ordinal()]) {
                    case 1:
                        obj2 = Double.valueOf(cesVar.d());
                        break;
                    case 2:
                        obj2 = Float.valueOf(cesVar.e());
                        break;
                    case 3:
                        obj2 = Long.valueOf(cesVar.g());
                        break;
                    case 4:
                        obj2 = Long.valueOf(cesVar.f());
                        break;
                    case 5:
                        obj2 = Integer.valueOf(cesVar.h());
                        break;
                    case 6:
                        obj2 = Long.valueOf(cesVar.i());
                        break;
                    case 7:
                        obj2 = Integer.valueOf(cesVar.j());
                        break;
                    case 8:
                        obj2 = Boolean.valueOf(cesVar.k());
                        break;
                    case 9:
                        obj2 = Integer.valueOf(cesVar.o());
                        break;
                    case 10:
                        obj2 = Integer.valueOf(cesVar.q());
                        break;
                    case 11:
                        obj2 = Long.valueOf(cesVar.r());
                        break;
                    case 12:
                        obj2 = Integer.valueOf(cesVar.s());
                        break;
                    case 13:
                        obj2 = Long.valueOf(cesVar.t());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        obj2 = cesVar.n();
                        break;
                    case 16:
                        obj2 = cesVar.l();
                        break;
                    case 17:
                        obj2 = cesVar.b(fVar.a.getClass(), cdbVar);
                        break;
                    case 18:
                        obj2 = cesVar.a(fVar.a.getClass(), cdbVar);
                        break;
                }
            }
            if (fVar.b.d) {
                cdgVar.b((cdg<cdk.e>) fVar.b, obj2);
            } else {
                int i2 = AnonymousClass1.a[fVar.b.c.ordinal()];
                if ((i2 == 17 || i2 == 18) && (a = cdgVar.a((cdg<cdk.e>) fVar.b)) != null) {
                    obj2 = cdm.a(a, obj2);
                }
                cdgVar.a((cdg<cdk.e>) fVar.b, obj2);
            }
        }
        return ub;
    }

    /* renamed from: cdd$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[cff.a.values().length];
            a = iArr;
            try {
                iArr[cff.a.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[cff.a.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[cff.a.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[cff.a.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[cff.a.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[cff.a.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[cff.a.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[cff.a.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[cff.a.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[cff.a.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[cff.a.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[cff.a.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[cff.a.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[cff.a.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[cff.a.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[cff.a.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[cff.a.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[cff.a.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.cdc
    public final int a(Map.Entry<?, ?> entry) {
        return ((cdk.e) entry.getKey()).b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.cdc
    public final void a(cfg cfgVar, Map.Entry<?, ?> entry) throws IOException {
        cdk.e eVar = (cdk.e) entry.getKey();
        if (eVar.d) {
            switch (AnonymousClass1.a[eVar.c.ordinal()]) {
                case 1:
                    cev.a(eVar.b, (List) entry.getValue(), cfgVar, eVar.e);
                    return;
                case 2:
                    cev.b(eVar.b, (List) entry.getValue(), cfgVar, eVar.e);
                    return;
                case 3:
                    cev.c(eVar.b, (List) entry.getValue(), cfgVar, eVar.e);
                    return;
                case 4:
                    cev.d(eVar.b, (List) entry.getValue(), cfgVar, eVar.e);
                    return;
                case 5:
                    cev.h(eVar.b, (List) entry.getValue(), cfgVar, eVar.e);
                    return;
                case 6:
                    cev.f(eVar.b, (List) entry.getValue(), cfgVar, eVar.e);
                    return;
                case 7:
                    cev.k(eVar.b, (List) entry.getValue(), cfgVar, eVar.e);
                    return;
                case 8:
                    cev.n(eVar.b, (List) entry.getValue(), cfgVar, eVar.e);
                    return;
                case 9:
                    cev.i(eVar.b, (List) entry.getValue(), cfgVar, eVar.e);
                    return;
                case 10:
                    cev.l(eVar.b, (List) entry.getValue(), cfgVar, eVar.e);
                    return;
                case 11:
                    cev.g(eVar.b, (List) entry.getValue(), cfgVar, eVar.e);
                    return;
                case 12:
                    cev.j(eVar.b, (List) entry.getValue(), cfgVar, eVar.e);
                    return;
                case 13:
                    cev.e(eVar.b, (List) entry.getValue(), cfgVar, eVar.e);
                    return;
                case 14:
                    cev.h(eVar.b, (List) entry.getValue(), cfgVar, eVar.e);
                    return;
                case 15:
                    cev.b(eVar.b, (List) entry.getValue(), cfgVar);
                    return;
                case 16:
                    cev.a(eVar.b, (List) entry.getValue(), cfgVar);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                    cev.b(eVar.b, (List) entry.getValue(), cfgVar, ceo.a().a((Class) list.get(0).getClass()));
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 == null || list2.isEmpty()) {
                        return;
                    }
                    cev.a(eVar.b, (List) entry.getValue(), cfgVar, ceo.a().a((Class) list2.get(0).getClass()));
                    return;
                default:
                    return;
            }
        }
        switch (AnonymousClass1.a[eVar.c.ordinal()]) {
            case 1:
                cfgVar.a(eVar.b, ((Double) entry.getValue()).doubleValue());
                return;
            case 2:
                cfgVar.a(eVar.b, ((Float) entry.getValue()).floatValue());
                return;
            case 3:
                cfgVar.a(eVar.b, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                cfgVar.c(eVar.b, ((Long) entry.getValue()).longValue());
                return;
            case 5:
                cfgVar.c(eVar.b, ((Integer) entry.getValue()).intValue());
                return;
            case 6:
                cfgVar.d(eVar.b, ((Long) entry.getValue()).longValue());
                return;
            case 7:
                cfgVar.d(eVar.b, ((Integer) entry.getValue()).intValue());
                return;
            case 8:
                cfgVar.a(eVar.b, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 9:
                cfgVar.e(eVar.b, ((Integer) entry.getValue()).intValue());
                return;
            case 10:
                cfgVar.a(eVar.b, ((Integer) entry.getValue()).intValue());
                return;
            case 11:
                cfgVar.b(eVar.b, ((Long) entry.getValue()).longValue());
                return;
            case 12:
                cfgVar.f(eVar.b, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                cfgVar.e(eVar.b, ((Long) entry.getValue()).longValue());
                return;
            case 14:
                cfgVar.c(eVar.b, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                cfgVar.a(eVar.b, (ccu) entry.getValue());
                return;
            case 16:
                cfgVar.a(eVar.b, (String) entry.getValue());
                return;
            case 17:
                cfgVar.b(eVar.b, entry.getValue(), ceo.a().a((Class) entry.getValue().getClass()));
                return;
            case 18:
                cfgVar.a(eVar.b, entry.getValue(), ceo.a().a((Class) entry.getValue().getClass()));
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.cdc
    public final Object a(cdb cdbVar, cec cecVar, int i) {
        return cdbVar.a(cecVar, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.cdc
    public final void a(ces cesVar, Object obj, cdb cdbVar, cdg<cdk.e> cdgVar) throws IOException {
        cdk.f fVar = (cdk.f) obj;
        cdgVar.a((cdg<cdk.e>) fVar.b, cesVar.a(fVar.a.getClass(), cdbVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.cdc
    public final void a(ccu ccuVar, Object obj, cdb cdbVar, cdg<cdk.e> cdgVar) throws IOException {
        cdk.f fVar = (cdk.f) obj;
        cec f = fVar.a.r().f();
        ByteBuffer wrap = ByteBuffer.wrap(ccuVar.c());
        if (wrap.hasArray()) {
            ccr.a aVar = new ccr.a(wrap);
            ceo.a().a((ceo) f).a(f, aVar, cdbVar);
            cdgVar.a((cdg<cdk.e>) fVar.b, f);
            if (aVar.a() != Integer.MAX_VALUE) {
                throw InvalidProtocolBufferException.e();
            }
            return;
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.cdc
    public final void c(Object obj) {
        ((cdk.c) obj).extensions.b();
    }
}
