package defpackage;

import java.util.Arrays;

/* renamed from: adv  reason: default package */
/* loaded from: classes.dex */
public final class adv {
    private adv() {
    }

    public static boolean a(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean a(T[] tArr, T t) {
        int length = tArr != null ? tArr.length : 0;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (!aar.a(tArr[i], t)) {
                i++;
            } else if (i >= 0) {
                return true;
            }
        }
        return false;
    }

    public static <T> T[] a(T[]... tArr) {
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            i += tArr[i2].length;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr[0], i);
        int length = tArr[0].length;
        for (int i3 = 1; i3 < 2; i3++) {
            T[] tArr3 = tArr[1];
            System.arraycopy(tArr3, 0, tArr2, length, tArr3.length);
        }
        return tArr2;
    }
}
