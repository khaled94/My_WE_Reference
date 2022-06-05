package defpackage;

/* renamed from: csk  reason: default package */
/* loaded from: classes2.dex */
public final class csk extends csx {
    static final char[] a = "0123456789-$:/.+ABCD".toCharArray();
    static final int[] b = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};
    private static final char[] c = {'A', 'B', 'C', 'D'};
    private final StringBuilder d = new StringBuilder(20);
    private int[] e = new int[80];
    private int f = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(char[] cArr, char c2) {
        if (cArr != null) {
            for (char c3 : cArr) {
                if (c3 == c2) {
                    return true;
                }
            }
        }
        return false;
    }
}
