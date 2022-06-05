package defpackage;

import java.io.IOException;

/* renamed from: awv  reason: default package */
/* loaded from: classes.dex */
public final class awv {
    private static final int b = 11;
    private static final int c = 12;
    private static final int d = 16;
    private static final int e = 26;
    private static final int[] f = new int[0];
    private static final long[] g = new long[0];
    private static final float[] h = new float[0];
    private static final double[] i = new double[0];
    private static final boolean[] j = new boolean[0];
    private static final String[] k = new String[0];
    private static final byte[][] l = new byte[0];
    public static final byte[] a = new byte[0];

    public static final int a(awl awlVar, int i2) throws IOException {
        int e2 = awlVar.e();
        awlVar.a(i2);
        int i3 = 1;
        while (awlVar.a() == i2) {
            awlVar.a(i2);
            i3++;
        }
        if (e2 > awlVar.c - awlVar.b) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Position ");
            sb.append(e2);
            sb.append(" is beyond current ");
            sb.append(awlVar.c - awlVar.b);
            throw new IllegalArgumentException(sb.toString());
        } else if (e2 < 0) {
            StringBuilder sb2 = new StringBuilder(24);
            sb2.append("Bad position ");
            sb2.append(e2);
            throw new IllegalArgumentException(sb2.toString());
        } else {
            awlVar.c = awlVar.b + e2;
            awlVar.d = i2;
            return i3;
        }
    }
}
