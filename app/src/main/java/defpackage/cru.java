package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: cru  reason: default package */
/* loaded from: classes2.dex */
public final class cru {
    private final crs a;
    private final List<crt> b;

    public cru(crs crsVar) {
        this.a = crsVar;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(new crt(crsVar, new int[]{1}));
    }

    private crt a(int i) {
        if (i >= this.b.size()) {
            List<crt> list = this.b;
            int i2 = 1;
            crt crtVar = list.get(list.size() - 1);
            int size = this.b.size();
            while (size <= i) {
                crs crsVar = this.a;
                int[] iArr = new int[2];
                iArr[0] = i2;
                iArr[i2] = crsVar.i[(size - 1) + crsVar.m];
                crt crtVar2 = new crt(crsVar, iArr);
                if (!crtVar.a.equals(crtVar2.a)) {
                    throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                }
                if (!crtVar.a() && !crtVar2.a()) {
                    int[] iArr2 = crtVar.b;
                    int length = iArr2.length;
                    int[] iArr3 = crtVar2.b;
                    int length2 = iArr3.length;
                    int[] iArr4 = new int[(length + length2) - i2];
                    for (int i3 = 0; i3 < length; i3++) {
                        int i4 = iArr2[i3];
                        for (int i5 = 0; i5 < length2; i5++) {
                            int i6 = i3 + i5;
                            iArr4[i6] = crs.a(iArr4[i6], crtVar.a.b(i4, iArr3[i5]));
                        }
                    }
                    crtVar = new crt(crtVar.a, iArr4);
                } else {
                    crtVar = crtVar.a.k;
                }
                this.b.add(crtVar);
                size++;
                i2 = 1;
            }
        }
        return this.b.get(i);
    }

    public final void a(int[] iArr, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        crt a = a(i);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] iArr3 = new crt(this.a, iArr2).a(i, 1).a(a)[1].b;
        int length2 = i - iArr3.length;
        for (int i2 = 0; i2 < length2; i2++) {
            iArr[length + i2] = 0;
        }
        System.arraycopy(iArr3, 0, iArr, length + length2, iArr3.length);
    }
}
