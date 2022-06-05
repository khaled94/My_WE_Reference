package defpackage;

/* renamed from: bsq  reason: default package */
/* loaded from: classes2.dex */
public final class bsq {
    public static String a(String str, String[] strArr, String[] strArr2) {
        boolean z;
        aat.a(strArr);
        aat.a(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if (str == null && str2 == null) {
                z = true;
            } else {
                z = str == null ? false : str.equals(str2);
            }
            if (z) {
                return strArr2[i];
            }
        }
        return null;
    }
}
