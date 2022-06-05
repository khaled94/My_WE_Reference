package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: crl  reason: default package */
/* loaded from: classes2.dex */
public final class crl {
    static final String[] a = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};
    static final int[][] b = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};
    static final int[][] c;
    private static final int[][] e;
    final byte[] d;

    static {
        int[][] iArr = (int[][]) Array.newInstance(int.class, 5, 256);
        e = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            e[0][i] = (i - 65) + 2;
        }
        e[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            e[1][i2] = (i2 - 97) + 2;
        }
        e[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            e[2][i3] = (i3 - 48) + 2;
        }
        int[][] iArr2 = e;
        iArr2[2][44] = 12;
        iArr2[2][46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i4 = 0; i4 < 28; i4++) {
            e[3][iArr3[i4]] = i4;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i5 = 0; i5 < 31; i5++) {
            if (iArr4[i5] > 0) {
                e[4][iArr4[i5]] = i5;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance(int.class, 6, 6);
        c = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = c;
        iArr7[0][4] = 0;
        iArr7[1][4] = 0;
        iArr7[1][0] = 28;
        iArr7[3][4] = 0;
        iArr7[2][4] = 0;
        iArr7[2][0] = 15;
    }

    public crl(byte[] bArr) {
        this.d = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(crn crnVar, int i, Collection<crn> collection) {
        char c2 = (char) (this.d[i] & 255);
        boolean z = e[crnVar.b][c2] > 0;
        crn crnVar2 = null;
        for (int i2 = 0; i2 <= 4; i2++) {
            int i3 = e[i2][c2];
            if (i3 > 0) {
                if (crnVar2 == null) {
                    crnVar2 = crnVar.b(i);
                }
                if (!z || i2 == crnVar.b || i2 == 2) {
                    collection.add(crnVar2.a(i2, i3));
                }
                if (!z && c[crnVar.b][i2] >= 0) {
                    collection.add(crnVar2.b(i2, i3));
                }
            }
        }
        if (crnVar.c > 0 || e[crnVar.b][c2] == 0) {
            collection.add(crnVar.a(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Collection<crn> a(Iterable<crn> iterable, int i, int i2) {
        LinkedList linkedList = new LinkedList();
        for (crn crnVar : iterable) {
            crn b2 = crnVar.b(i);
            linkedList.add(b2.a(4, i2));
            if (crnVar.b != 4) {
                linkedList.add(b2.b(4, i2));
            }
            if (i2 == 3 || i2 == 4) {
                linkedList.add(b2.a(2, 16 - i2).a(2, 1));
            }
            if (crnVar.c > 0) {
                linkedList.add(crnVar.a(i).a(i + 1));
            }
        }
        return a(linkedList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Collection<crn> a(Iterable<crn> iterable) {
        LinkedList linkedList = new LinkedList();
        for (crn crnVar : iterable) {
            boolean z = true;
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                crn crnVar2 = (crn) it.next();
                if (crnVar2.a(crnVar)) {
                    z = false;
                    break;
                } else if (crnVar.a(crnVar2)) {
                    it.remove();
                }
            }
            if (z) {
                linkedList.add(crnVar);
            }
        }
        return linkedList;
    }
}
