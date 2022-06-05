package defpackage;

import com.google.zxing.WriterException;
import java.util.Map;

/* renamed from: csy  reason: default package */
/* loaded from: classes2.dex */
public abstract class csy implements crg {
    public int a() {
        return 10;
    }

    public abstract boolean[] a(String str);

    @Override // defpackage.crg
    public crq a(String str, crc crcVar, int i, int i2, Map<cre, ?> map) throws WriterException {
        if (!str.isEmpty()) {
            if (i < 0 || i2 < 0) {
                throw new IllegalArgumentException("Negative size is not allowed. Input: " + i + 'x' + i2);
            }
            int a = a();
            if (map != null && map.containsKey(cre.MARGIN)) {
                a = Integer.parseInt(map.get(cre.MARGIN).toString());
            }
            return a(a(str), i, i2, a);
        }
        throw new IllegalArgumentException("Found empty contents");
    }

    private static crq a(boolean[] zArr, int i, int i2, int i3) {
        int length = zArr.length;
        int i4 = i3 + length;
        int max = Math.max(i, i4);
        int max2 = Math.max(1, i2);
        int i5 = max / i4;
        int i6 = (max - (length * i5)) / 2;
        crq crqVar = new crq(max, max2);
        int i7 = 0;
        while (i7 < length) {
            if (zArr[i7]) {
                crqVar.a(i6, 0, i5, max2);
            }
            i7++;
            i6 += i5;
        }
        return crqVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int a(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }
}
