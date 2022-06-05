package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.cdk;
import defpackage.cdm;
import defpackage.cff;
import java.io.IOException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ccq  reason: default package */
/* loaded from: classes2.dex */
public final class ccq {
    ccq() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ccq$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public int a;
        public long b;
        public Object c;
        public final cdb d;

        a() {
            this.d = cdb.a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(cdb cdbVar) {
            if (cdbVar == null) {
                throw null;
            }
            this.d = cdbVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(byte[] bArr, int i, a aVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            aVar.a = b;
            return i2;
        }
        return a(b, bArr, i2, aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, byte[] bArr, int i2, a aVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            aVar.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            aVar.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            aVar.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            aVar.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                aVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(byte[] bArr, int i, a aVar) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            aVar.b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (b & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        aVar.b = j2;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long b(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double c(byte[] bArr, int i) {
        return Double.longBitsToDouble(b(bArr, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float d(byte[] bArr, int i) {
        return Float.intBitsToFloat(a(bArr, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(byte[] bArr, int i, a aVar) throws InvalidProtocolBufferException {
        int a2 = a(bArr, i, aVar);
        int i2 = aVar.a;
        if (i2 >= 0) {
            if (i2 == 0) {
                aVar.c = "";
                return a2;
            }
            aVar.c = new String(bArr, a2, i2, cdm.a);
            return a2 + i2;
        }
        throw InvalidProtocolBufferException.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(byte[] bArr, int i, a aVar) throws InvalidProtocolBufferException {
        int a2 = a(bArr, i, aVar);
        int i2 = aVar.a;
        if (i2 >= 0) {
            if (i2 == 0) {
                aVar.c = "";
                return a2;
            }
            aVar.c = cfe.b(bArr, a2, i2);
            return a2 + i2;
        }
        throw InvalidProtocolBufferException.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(byte[] bArr, int i, a aVar) throws InvalidProtocolBufferException {
        int a2 = a(bArr, i, aVar);
        int i2 = aVar.a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.b();
        }
        if (i2 > bArr.length - a2) {
            throw InvalidProtocolBufferException.a();
        }
        if (i2 == 0) {
            aVar.c = ccu.a;
            return a2;
        }
        aVar.c = ccu.a(bArr, a2, i2);
        return a2 + i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(cet cetVar, byte[] bArr, int i, int i2, a aVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = a(i4, bArr, i3, aVar);
            i4 = aVar.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw InvalidProtocolBufferException.a();
        }
        Object a2 = cetVar.a();
        int i6 = i4 + i5;
        cetVar.a(a2, bArr, i5, i6, aVar);
        cetVar.d(a2);
        aVar.c = a2;
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(cet cetVar, byte[] bArr, int i, int i2, int i3, a aVar) throws IOException {
        cef cefVar = (cef) cetVar;
        Object a2 = cefVar.a();
        int a3 = cefVar.a((cef) a2, bArr, i, i2, i3, aVar);
        cefVar.d((cef) a2);
        aVar.c = a2;
        return a3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, byte[] bArr, int i2, int i3, cdm.i<?> iVar, a aVar) {
        cdl cdlVar = (cdl) iVar;
        int a2 = a(bArr, i2, aVar);
        cdlVar.c(aVar.a);
        while (a2 < i3) {
            int a3 = a(bArr, a2, aVar);
            if (i != aVar.a) {
                break;
            }
            a2 = a(bArr, a3, aVar);
            cdlVar.c(aVar.a);
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i, byte[] bArr, int i2, int i3, cdm.i<?> iVar, a aVar) {
        cdl cdlVar = (cdl) iVar;
        int a2 = a(bArr, i2, aVar);
        cdlVar.c(ccv.e(aVar.a));
        while (a2 < i3) {
            int a3 = a(bArr, a2, aVar);
            if (i != aVar.a) {
                break;
            }
            a2 = a(bArr, a3, aVar);
            cdlVar.c(ccv.e(aVar.a));
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i, byte[] bArr, int i2, int i3, cdm.i<?> iVar, a aVar) {
        cdt cdtVar = (cdt) iVar;
        int b = b(bArr, i2, aVar);
        cdtVar.a(ccv.a(aVar.b));
        while (b < i3) {
            int a2 = a(bArr, b, aVar);
            if (i != aVar.a) {
                break;
            }
            b = b(bArr, a2, aVar);
            cdtVar.a(ccv.a(aVar.b));
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(byte[] bArr, int i, cdm.i<?> iVar, a aVar) throws IOException {
        cdl cdlVar = (cdl) iVar;
        int a2 = a(bArr, i, aVar);
        int i2 = aVar.a + a2;
        while (a2 < i2) {
            a2 = a(bArr, a2, aVar);
            cdlVar.c(aVar.a);
        }
        if (a2 == i2) {
            return a2;
        }
        throw InvalidProtocolBufferException.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(byte[] bArr, int i, cdm.i<?> iVar, a aVar) throws IOException {
        cdt cdtVar = (cdt) iVar;
        int a2 = a(bArr, i, aVar);
        int i2 = aVar.a + a2;
        while (a2 < i2) {
            a2 = b(bArr, a2, aVar);
            cdtVar.a(aVar.b);
        }
        if (a2 == i2) {
            return a2;
        }
        throw InvalidProtocolBufferException.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(byte[] bArr, int i, cdm.i<?> iVar, a aVar) throws IOException {
        cdl cdlVar = (cdl) iVar;
        int a2 = a(bArr, i, aVar);
        int i2 = aVar.a + a2;
        while (a2 < i2) {
            cdlVar.c(a(bArr, a2));
            a2 += 4;
        }
        if (a2 == i2) {
            return a2;
        }
        throw InvalidProtocolBufferException.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(byte[] bArr, int i, cdm.i<?> iVar, a aVar) throws IOException {
        cdt cdtVar = (cdt) iVar;
        int a2 = a(bArr, i, aVar);
        int i2 = aVar.a + a2;
        while (a2 < i2) {
            cdtVar.a(b(bArr, a2));
            a2 += 8;
        }
        if (a2 == i2) {
            return a2;
        }
        throw InvalidProtocolBufferException.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(byte[] bArr, int i, cdm.i<?> iVar, a aVar) throws IOException {
        cdi cdiVar = (cdi) iVar;
        int a2 = a(bArr, i, aVar);
        int i2 = aVar.a + a2;
        while (a2 < i2) {
            cdiVar.a(d(bArr, a2));
            a2 += 4;
        }
        if (a2 == i2) {
            return a2;
        }
        throw InvalidProtocolBufferException.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(byte[] bArr, int i, cdm.i<?> iVar, a aVar) throws IOException {
        ccy ccyVar = (ccy) iVar;
        int a2 = a(bArr, i, aVar);
        int i2 = aVar.a + a2;
        while (a2 < i2) {
            ccyVar.a(c(bArr, a2));
            a2 += 8;
        }
        if (a2 == i2) {
            return a2;
        }
        throw InvalidProtocolBufferException.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(byte[] bArr, int i, cdm.i<?> iVar, a aVar) throws IOException {
        ccs ccsVar = (ccs) iVar;
        int a2 = a(bArr, i, aVar);
        int i2 = aVar.a + a2;
        while (a2 < i2) {
            a2 = b(bArr, a2, aVar);
            ccsVar.a(aVar.b != 0);
        }
        if (a2 == i2) {
            return a2;
        }
        throw InvalidProtocolBufferException.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(byte[] bArr, int i, cdm.i<?> iVar, a aVar) throws IOException {
        cdl cdlVar = (cdl) iVar;
        int a2 = a(bArr, i, aVar);
        int i2 = aVar.a + a2;
        while (a2 < i2) {
            a2 = a(bArr, a2, aVar);
            cdlVar.c(ccv.e(aVar.a));
        }
        if (a2 == i2) {
            return a2;
        }
        throw InvalidProtocolBufferException.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(byte[] bArr, int i, cdm.i<?> iVar, a aVar) throws IOException {
        cdt cdtVar = (cdt) iVar;
        int a2 = a(bArr, i, aVar);
        int i2 = aVar.a + a2;
        while (a2 < i2) {
            a2 = b(bArr, a2, aVar);
            cdtVar.a(ccv.a(aVar.b));
        }
        if (a2 == i2) {
            return a2;
        }
        throw InvalidProtocolBufferException.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0023). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int d(int r5, byte[] r6, int r7, int r8, defpackage.cdm.i<?> r9, defpackage.ccq.a r10) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        /*
            int r7 = a(r6, r7, r10)
            int r0 = r10.a
            if (r0 < 0) goto L5e
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
            r9.add(r1)
            goto L23
        L10:
            int r2 = r7 + r0
            boolean r3 = defpackage.cfe.a(r6, r7, r2)
            if (r3 == 0) goto L59
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = defpackage.cdm.a
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
        L22:
            r7 = r2
        L23:
            if (r7 >= r8) goto L58
            int r0 = a(r6, r7, r10)
            int r2 = r10.a
            if (r5 != r2) goto L58
            int r7 = a(r6, r0, r10)
            int r0 = r10.a
            if (r0 < 0) goto L53
            if (r0 != 0) goto L3b
            r9.add(r1)
            goto L23
        L3b:
            int r2 = r7 + r0
            boolean r3 = defpackage.cfe.a(r6, r7, r2)
            if (r3 == 0) goto L4e
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = defpackage.cdm.a
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
            goto L22
        L4e:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r5 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.i()
            throw r5
        L53:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r5 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.b()
            throw r5
        L58:
            return r7
        L59:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r5 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.i()
            throw r5
        L5e:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r5 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.b()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccq.d(int, byte[], int, int, cdm$i, ccq$a):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x001b -> B:10:0x001c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int e(int r2, byte[] r3, int r4, int r5, defpackage.cdm.i<?> r6, defpackage.ccq.a r7) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        /*
            int r4 = a(r3, r4, r7)
            int r0 = r7.a
            if (r0 < 0) goto L52
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L4d
            if (r0 != 0) goto L14
            ccu r0 = defpackage.ccu.a
            r6.add(r0)
            goto L1c
        L14:
            ccu r1 = defpackage.ccu.a(r3, r4, r0)
            r6.add(r1)
        L1b:
            int r4 = r4 + r0
        L1c:
            if (r4 >= r5) goto L4c
            int r0 = a(r3, r4, r7)
            int r1 = r7.a
            if (r2 != r1) goto L4c
            int r4 = a(r3, r0, r7)
            int r0 = r7.a
            if (r0 < 0) goto L47
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L42
            if (r0 != 0) goto L3a
            ccu r0 = defpackage.ccu.a
            r6.add(r0)
            goto L1c
        L3a:
            ccu r1 = defpackage.ccu.a(r3, r4, r0)
            r6.add(r1)
            goto L1b
        L42:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.a()
            throw r2
        L47:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.b()
            throw r2
        L4c:
            return r4
        L4d:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.a()
            throw r2
        L52:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.b()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccq.e(int, byte[], int, int, cdm$i, ccq$a):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(cet<?> cetVar, int i, byte[] bArr, int i2, int i3, cdm.i<?> iVar, a aVar) throws IOException {
        int a2 = a(cetVar, bArr, i2, i3, aVar);
        iVar.add(aVar.c);
        while (a2 < i3) {
            int a3 = a(bArr, a2, aVar);
            if (i != aVar.a) {
                break;
            }
            a2 = a(cetVar, bArr, a3, i3, aVar);
            iVar.add(aVar.c);
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(cet cetVar, int i, byte[] bArr, int i2, int i3, cdm.i<?> iVar, a aVar) throws IOException {
        int i4 = (i & (-8)) | 4;
        int a2 = a(cetVar, bArr, i2, i3, i4, aVar);
        iVar.add(aVar.c);
        while (a2 < i3) {
            int a3 = a(bArr, a2, aVar);
            if (i != aVar.a) {
                break;
            }
            a2 = a(cetVar, bArr, a3, i3, i4, aVar);
            iVar.add(aVar.c);
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, byte[] bArr, int i2, int i3, Object obj, cec cecVar, cez<cfa, cfa> cezVar, a aVar) throws IOException {
        cdt cdtVar;
        int i4;
        Object a2;
        int i5 = i >>> 3;
        cdk.f a3 = aVar.d.a(cecVar, i5);
        if (a3 == null) {
            return a(i, bArr, i2, i3, cef.c(obj), aVar);
        }
        cdk.c cVar = (cdk.c) obj;
        cVar.a();
        cdg<cdk.e> cdgVar = cVar.extensions;
        Object obj2 = null;
        if (a3.b.d && a3.b.e) {
            switch (AnonymousClass1.a[a3.b.c.ordinal()]) {
                case 1:
                    ccy ccyVar = new ccy();
                    i4 = f(bArr, i2, ccyVar, aVar);
                    cdtVar = ccyVar;
                    break;
                case 2:
                    cdi cdiVar = new cdi();
                    i4 = e(bArr, i2, cdiVar, aVar);
                    cdtVar = cdiVar;
                    break;
                case 3:
                case 4:
                    cdt cdtVar2 = new cdt();
                    i4 = b(bArr, i2, cdtVar2, aVar);
                    cdtVar = cdtVar2;
                    break;
                case 5:
                case 6:
                    cdl cdlVar = new cdl();
                    i4 = a(bArr, i2, cdlVar, aVar);
                    cdtVar = cdlVar;
                    break;
                case 7:
                case 8:
                    cdt cdtVar3 = new cdt();
                    i4 = d(bArr, i2, cdtVar3, aVar);
                    cdtVar = cdtVar3;
                    break;
                case 9:
                case 10:
                    cdl cdlVar2 = new cdl();
                    i4 = c(bArr, i2, cdlVar2, aVar);
                    cdtVar = cdlVar2;
                    break;
                case 11:
                    ccs ccsVar = new ccs();
                    i4 = g(bArr, i2, ccsVar, aVar);
                    cdtVar = ccsVar;
                    break;
                case 12:
                    cdl cdlVar3 = new cdl();
                    i4 = h(bArr, i2, cdlVar3, aVar);
                    cdtVar = cdlVar3;
                    break;
                case 13:
                    cdt cdtVar4 = new cdt();
                    i4 = i(bArr, i2, cdtVar4, aVar);
                    cdtVar = cdtVar4;
                    break;
                case 14:
                    cdl cdlVar4 = new cdl();
                    int a4 = a(bArr, i2, cdlVar4, aVar);
                    cfa cfaVar = cVar.unknownFields;
                    if (cfaVar != cfa.a()) {
                        obj2 = cfaVar;
                    }
                    cfa cfaVar2 = (cfa) cev.a(i5, (List<Integer>) cdlVar4, a3.b.a, obj2, (cez<UT, Object>) cezVar);
                    if (cfaVar2 != null) {
                        cVar.unknownFields = cfaVar2;
                    }
                    cdgVar.a((cdg<cdk.e>) a3.b, cdlVar4);
                    return a4;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + a3.b.c);
            }
        } else {
            if (a3.b.c == cff.a.ENUM) {
                i2 = a(bArr, i2, aVar);
                if (a3.b.a.a(aVar.a) == null) {
                    cfa cfaVar3 = cVar.unknownFields;
                    if (cfaVar3 == cfa.a()) {
                        cfaVar3 = cfa.b();
                        cVar.unknownFields = cfaVar3;
                    }
                    cev.a(i5, aVar.a, cfaVar3, (cez<UT, cfa>) cezVar);
                    return i2;
                }
                obj2 = Integer.valueOf(aVar.a);
            } else {
                switch (AnonymousClass1.a[a3.b.c.ordinal()]) {
                    case 1:
                        obj2 = Double.valueOf(c(bArr, i2));
                        i2 += 8;
                        break;
                    case 2:
                        obj2 = Float.valueOf(d(bArr, i2));
                        i2 += 4;
                        break;
                    case 3:
                    case 4:
                        i2 = b(bArr, i2, aVar);
                        obj2 = Long.valueOf(aVar.b);
                        break;
                    case 5:
                    case 6:
                        i2 = a(bArr, i2, aVar);
                        obj2 = Integer.valueOf(aVar.a);
                        break;
                    case 7:
                    case 8:
                        obj2 = Long.valueOf(b(bArr, i2));
                        i2 += 8;
                        break;
                    case 9:
                    case 10:
                        obj2 = Integer.valueOf(a(bArr, i2));
                        i2 += 4;
                        break;
                    case 11:
                        i2 = b(bArr, i2, aVar);
                        obj2 = Boolean.valueOf(aVar.b != 0);
                        break;
                    case 12:
                        i2 = a(bArr, i2, aVar);
                        obj2 = Integer.valueOf(ccv.e(aVar.a));
                        break;
                    case 13:
                        i2 = b(bArr, i2, aVar);
                        obj2 = Long.valueOf(ccv.a(aVar.b));
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        i2 = e(bArr, i2, aVar);
                        obj2 = aVar.c;
                        break;
                    case 16:
                        i2 = c(bArr, i2, aVar);
                        obj2 = aVar.c;
                        break;
                    case 17:
                        i2 = a(ceo.a().a((Class) a3.a.getClass()), bArr, i2, i3, (i5 << 3) | 4, aVar);
                        obj2 = aVar.c;
                        break;
                    case 18:
                        i2 = a(ceo.a().a((Class) a3.a.getClass()), bArr, i2, i3, aVar);
                        obj2 = aVar.c;
                        break;
                }
            }
            if (a3.b.d) {
                cdgVar.b((cdg<cdk.e>) a3.b, obj2);
                return i2;
            }
            int i6 = AnonymousClass1.a[a3.b.c.ordinal()];
            if ((i6 == 17 || i6 == 18) && (a2 = cdgVar.a((cdg<cdk.e>) a3.b)) != null) {
                Object a5 = cdm.a(a2, obj2);
                i4 = i2;
                cdtVar = a5;
            } else {
                i4 = i2;
                cdtVar = obj2;
            }
        }
        cdgVar.a((cdg<cdk.e>) a3.b, cdtVar);
        return i4;
    }

    /* renamed from: ccq$1  reason: invalid class name */
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
                a[cff.a.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[cff.a.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[cff.a.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[cff.a.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[cff.a.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[cff.a.BOOL.ordinal()] = 11;
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
    public static int a(int i, byte[] bArr, int i2, int i3, cfa cfaVar, a aVar) throws InvalidProtocolBufferException {
        if (cff.b(i) == 0) {
            throw InvalidProtocolBufferException.d();
        }
        int a2 = cff.a(i);
        if (a2 == 0) {
            int b = b(bArr, i2, aVar);
            cfaVar.a(i, Long.valueOf(aVar.b));
            return b;
        } else if (a2 == 1) {
            cfaVar.a(i, Long.valueOf(b(bArr, i2)));
            return i2 + 8;
        } else if (a2 == 2) {
            int a3 = a(bArr, i2, aVar);
            int i4 = aVar.a;
            if (i4 < 0) {
                throw InvalidProtocolBufferException.b();
            }
            if (i4 > bArr.length - a3) {
                throw InvalidProtocolBufferException.a();
            }
            if (i4 == 0) {
                cfaVar.a(i, ccu.a);
            } else {
                cfaVar.a(i, ccu.a(bArr, a3, i4));
            }
            return a3 + i4;
        } else if (a2 != 3) {
            if (a2 == 5) {
                cfaVar.a(i, Integer.valueOf(a(bArr, i2)));
                return i2 + 4;
            }
            throw InvalidProtocolBufferException.d();
        } else {
            cfa b2 = cfa.b();
            int i5 = (i & (-8)) | 4;
            int i6 = 0;
            while (true) {
                if (i2 >= i3) {
                    break;
                }
                int a4 = a(bArr, i2, aVar);
                int i7 = aVar.a;
                i6 = i7;
                if (i7 == i5) {
                    i2 = a4;
                    break;
                }
                int a5 = a(i6, bArr, a4, i3, b2, aVar);
                i6 = i7;
                i2 = a5;
            }
            if (i2 > i3 || i6 != i5) {
                throw InvalidProtocolBufferException.h();
            }
            cfaVar.a(i, b2);
            return i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, byte[] bArr, int i2, int i3, a aVar) throws InvalidProtocolBufferException {
        if (cff.b(i) == 0) {
            throw InvalidProtocolBufferException.d();
        }
        int a2 = cff.a(i);
        if (a2 == 0) {
            return b(bArr, i2, aVar);
        }
        if (a2 == 1) {
            return i2 + 8;
        }
        if (a2 == 2) {
            return a(bArr, i2, aVar) + aVar.a;
        }
        if (a2 != 3) {
            if (a2 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            return i2 + 4;
        }
        int i4 = (i & (-8)) | 4;
        int i5 = 0;
        while (i2 < i3) {
            i2 = a(bArr, i2, aVar);
            i5 = aVar.a;
            if (i5 == i4) {
                break;
            }
            i2 = a(i5, bArr, i2, i3, aVar);
        }
        if (i2 <= i3 && i5 == i4) {
            return i2;
        }
        throw InvalidProtocolBufferException.h();
    }
}
