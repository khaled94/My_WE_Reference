package defpackage;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: eee  reason: default package */
/* loaded from: classes2.dex */
public final class eee extends AbstractList<edx> implements RandomAccess {
    final edx[] a;
    final int[] b;

    private eee(edx[] edxVarArr, int[] iArr) {
        this.a = edxVarArr;
        this.b = iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a3, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.eee a(defpackage.edx... r10) {
        /*
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.List r0 = java.util.Arrays.asList(r10)
            r4.<init>(r0)
            java.util.Collections.sort(r4)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = 0
            r0 = 0
        L13:
            int r1 = r4.size()
            if (r0 >= r1) goto L24
            r1 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r7.add(r1)
            int r0 = r0 + 1
            goto L13
        L24:
            r0 = 0
        L25:
            int r1 = r4.size()
            if (r0 >= r1) goto L3b
            r1 = r10[r0]
            int r1 = java.util.Collections.binarySearch(r4, r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r7.set(r1, r2)
            int r0 = r0 + 1
            goto L25
        L3b:
            java.lang.Object r0 = r4.get(r8)
            edx r0 = (defpackage.edx) r0
            int r0 = r0.g()
            if (r0 == 0) goto Ldf
            r0 = 0
        L48:
            int r1 = r4.size()
            if (r0 >= r1) goto La5
            java.lang.Object r1 = r4.get(r0)
            edx r1 = (defpackage.edx) r1
            int r2 = r0 + 1
            r3 = r2
        L57:
            int r5 = r4.size()
            if (r3 >= r5) goto La3
            java.lang.Object r5 = r4.get(r3)
            edx r5 = (defpackage.edx) r5
            boolean r6 = r5.a(r1)
            if (r6 == 0) goto La3
            int r6 = r5.g()
            int r9 = r1.g()
            if (r6 == r9) goto L93
            java.lang.Object r5 = r7.get(r3)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Object r6 = r7.get(r0)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r5 <= r6) goto L90
            r4.remove(r3)
            r7.remove(r3)
            goto L57
        L90:
            int r3 = r3 + 1
            goto L57
        L93:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "duplicate option: "
            java.lang.String r0 = r1.concat(r0)
            r10.<init>(r0)
            throw r10
        La3:
            r0 = r2
            goto L48
        La5:
            edu r9 = new edu
            r9.<init>()
            r0 = 0
            r3 = 0
            r5 = 0
            int r6 = r4.size()
            r2 = r9
            a(r0, r2, r3, r4, r5, r6, r7)
            int r0 = a(r9)
            int[] r1 = new int[r0]
        Lbc:
            if (r8 >= r0) goto Lc7
            int r2 = r9.i()
            r1[r8] = r2
            int r8 = r8 + 1
            goto Lbc
        Lc7:
            boolean r0 = r9.d()
            if (r0 == 0) goto Ld9
            eee r0 = new eee
            java.lang.Object r10 = r10.clone()
            edx[] r10 = (defpackage.edx[]) r10
            r0.<init>(r10, r1)
            return r0
        Ld9:
            java.lang.AssertionError r10 = new java.lang.AssertionError
            r10.<init>()
            throw r10
        Ldf:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "the empty byte string is not a supported option"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eee.a(edx[]):eee");
    }

    private static void a(long j, edu eduVar, int i, List<edx> list, int i2, int i3, List<Integer> list2) {
        int i4;
        int i5;
        int i6;
        edu eduVar2;
        int i7 = i2;
        if (i7 >= i3) {
            throw new AssertionError();
        }
        for (int i8 = i7; i8 < i3; i8++) {
            if (list.get(i8).g() < i) {
                throw new AssertionError();
            }
        }
        edx edxVar = list.get(i2);
        edx edxVar2 = list.get(i3 - 1);
        int i9 = -1;
        if (i == edxVar.g()) {
            i9 = list2.get(i7).intValue();
            i7++;
            edxVar = list.get(i7);
        }
        int i10 = i7;
        if (edxVar.a(i) != edxVar2.a(i)) {
            int i11 = 1;
            for (int i12 = i10 + 1; i12 < i3; i12++) {
                if (list.get(i12 - 1).a(i) != list.get(i12).a(i)) {
                    i11++;
                }
            }
            long a = j + a(eduVar) + 2 + (i11 * 2);
            eduVar.f(i11);
            eduVar.f(i9);
            for (int i13 = i10; i13 < i3; i13++) {
                byte a2 = list.get(i13).a(i);
                if (i13 == i10 || a2 != list.get(i13 - 1).a(i)) {
                    eduVar.f(a2 & 255);
                }
            }
            edu eduVar3 = new edu();
            int i14 = i10;
            while (i14 < i3) {
                byte a3 = list.get(i14).a(i);
                int i15 = i14 + 1;
                int i16 = i15;
                while (true) {
                    if (i16 >= i3) {
                        i5 = i3;
                        break;
                    } else if (a3 != list.get(i16).a(i)) {
                        i5 = i16;
                        break;
                    } else {
                        i16++;
                    }
                }
                if (i15 == i5 && i + 1 == list.get(i14).g()) {
                    eduVar.f(list2.get(i14).intValue());
                    i6 = i5;
                    eduVar2 = eduVar3;
                } else {
                    eduVar.f((int) ((a(eduVar3) + a) * (-1)));
                    i6 = i5;
                    eduVar2 = eduVar3;
                    a(a, eduVar3, i + 1, list, i14, i5, list2);
                }
                eduVar3 = eduVar2;
                i14 = i6;
            }
            edu eduVar4 = eduVar3;
            eduVar.a_(eduVar4, eduVar4.b);
            return;
        }
        int i17 = 0;
        int min = Math.min(edxVar.g(), edxVar2.g());
        for (int i18 = i; i18 < min && edxVar.a(i18) == edxVar2.a(i18); i18++) {
            i17++;
        }
        long a4 = 1 + j + a(eduVar) + 2 + i17;
        eduVar.f(-i17);
        eduVar.f(i9);
        int i19 = i;
        while (true) {
            i4 = i + i17;
            if (i19 >= i4) {
                break;
            }
            eduVar.f(edxVar.a(i19) & 255);
            i19++;
        }
        if (i10 + 1 == i3) {
            if (i4 != list.get(i10).g()) {
                throw new AssertionError();
            }
            eduVar.f(list2.get(i10).intValue());
            return;
        }
        edu eduVar5 = new edu();
        eduVar.f((int) ((a(eduVar5) + a4) * (-1)));
        a(a4, eduVar5, i4, list, i10, i3, list2);
        eduVar.a_(eduVar5, eduVar5.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.length;
    }

    private static int a(edu eduVar) {
        return (int) (eduVar.b / 4);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.a[i];
    }
}
