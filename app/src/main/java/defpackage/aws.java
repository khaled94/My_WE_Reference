package defpackage;

import java.nio.charset.Charset;

/* renamed from: aws  reason: default package */
/* loaded from: classes.dex */
public final class aws {
    protected static final Charset a = Charset.forName("UTF-8");
    private static final Charset c = Charset.forName("ISO-8859-1");
    public static final Object b = new Object();

    public static boolean a(Object[] objArr, Object[] objArr2) {
        int length = objArr == null ? 0 : objArr.length;
        int length2 = objArr2 == null ? 0 : objArr2.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length || objArr[i] != null) {
                while (i2 < length2 && objArr2[i2] == null) {
                    i2++;
                }
                boolean z = i >= length;
                boolean z2 = i2 >= length2;
                if (z && z2) {
                    return true;
                }
                if (z != z2 || !objArr[i].equals(objArr2[i2])) {
                    return false;
                }
                i++;
                i2++;
            } else {
                i++;
            }
        }
    }

    public static int a(Object[] objArr) {
        int length = objArr == null ? 0 : objArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = objArr[i2];
            if (obj != null) {
                i = (i * 31) + obj.hashCode();
            }
        }
        return i;
    }

    public static void a(awp awpVar, awp awpVar2) {
        if (awpVar.g != null) {
            awpVar2.g = (awr) awpVar.g.clone();
        }
    }
}
