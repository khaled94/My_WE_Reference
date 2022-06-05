package defpackage;

import defpackage.oo;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u001b\u0010\b\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0007¢\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0007J \u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J+\u0010\u000f\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0013H\u0007J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0013H\u0007J\u0018\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0007J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u001e"}, d2 = {"Lcom/facebook/appevents/ml/Operator;", "", "()V", "addmv", "", "x", "Lcom/facebook/appevents/ml/MTensor;", "b", "concatenate", "tensors", "", "([Lcom/facebook/appevents/ml/MTensor;)Lcom/facebook/appevents/ml/MTensor;", "conv1D", "w", "dense", "embedding", "texts", "", "seqLength", "", "([Ljava/lang/String;ILcom/facebook/appevents/ml/MTensor;)Lcom/facebook/appevents/ml/MTensor;", "flatten", "startDim", "maxPool1D", "poolSize", "mul", "relu", "softmax", "transpose2D", "transpose3D", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: ot  reason: default package */
/* loaded from: classes2.dex */
public final class ot {
    public static final ot a = new ot();

    private ot() {
    }

    public static final oo a(oo[] ooVarArr) {
        if (qx.a(ot.class)) {
            return null;
        }
        try {
            dqc.d(ooVarArr, "tensors");
            int i = ooVarArr[0].c[0];
            int i2 = 0;
            for (int i3 = 0; i3 < 4; i3++) {
                i2 += ooVarArr[i3].c[1];
            }
            oo ooVar = new oo(new int[]{i, i2});
            float[] fArr = ooVar.b;
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = i4 * i2;
                for (int i6 = 0; i6 < 4; i6++) {
                    float[] fArr2 = ooVarArr[i6].b;
                    int i7 = ooVarArr[i6].c[1];
                    System.arraycopy(fArr2, i4 * i7, fArr, i5, i7);
                    i5 += i7;
                }
            }
            return ooVar;
        } catch (Throwable th) {
            qx.a(th, ot.class);
            return null;
        }
    }

    public static final oo a(String[] strArr, oo ooVar) {
        if (qx.a(ot.class)) {
            return null;
        }
        try {
            dqc.d(strArr, "texts");
            dqc.d(ooVar, "w");
            int length = strArr.length;
            int i = ooVar.c[1];
            oo ooVar2 = new oo(new int[]{length, 128, i});
            float[] fArr = ooVar2.b;
            float[] fArr2 = ooVar.b;
            for (int i2 = 0; i2 < length; i2++) {
                int[] a2 = ou.a.a(strArr[i2]);
                for (int i3 = 0; i3 < 128; i3++) {
                    System.arraycopy(fArr2, a2[i3] * i, fArr, (i * 128 * i2) + (i * i3), i);
                }
            }
            return ooVar2;
        } catch (Throwable th) {
            qx.a(th, ot.class);
            return null;
        }
    }

    public static final void a(oo ooVar, oo ooVar2) {
        if (qx.a(ot.class)) {
            return;
        }
        try {
            dqc.d(ooVar, "x");
            dqc.d(ooVar2, "b");
            int i = ooVar.c[0];
            int i2 = ooVar.c[1];
            int i3 = ooVar.c[2];
            float[] fArr = ooVar.b;
            float[] fArr2 = ooVar2.b;
            for (int i4 = 0; i4 < i; i4++) {
                for (int i5 = 0; i5 < i2; i5++) {
                    for (int i6 = 0; i6 < i3; i6++) {
                        int i7 = (i4 * i2 * i3) + (i5 * i3) + i6;
                        fArr[i7] = fArr[i7] + fArr2[i6];
                    }
                }
            }
        } catch (Throwable th) {
            qx.a(th, ot.class);
        }
    }

    private static oo c(oo ooVar, oo ooVar2) {
        if (qx.a(ot.class)) {
            return null;
        }
        try {
            dqc.d(ooVar, "x");
            dqc.d(ooVar2, "w");
            int i = ooVar.c[0];
            int i2 = ooVar2.c[0];
            int i3 = ooVar2.c[1];
            oo ooVar3 = new oo(new int[]{i, i3});
            float[] fArr = ooVar.b;
            float[] fArr2 = ooVar2.b;
            float[] fArr3 = ooVar3.b;
            for (int i4 = 0; i4 < i; i4++) {
                for (int i5 = 0; i5 < i3; i5++) {
                    int i6 = (i4 * i3) + i5;
                    fArr3[i6] = 0.0f;
                    for (int i7 = 0; i7 < i2; i7++) {
                        fArr3[i6] = fArr3[i6] + (fArr[(i4 * i2) + i7] * fArr2[(i7 * i3) + i5]);
                    }
                }
            }
            return ooVar3;
        } catch (Throwable th) {
            qx.a(th, ot.class);
            return null;
        }
    }

    public static final void a(oo ooVar) {
        if (qx.a(ot.class)) {
            return;
        }
        try {
            dqc.d(ooVar, "x");
            float[] fArr = ooVar.b;
            int length = fArr.length;
            for (int i = 0; i < length; i++) {
                if (fArr[i] < 0.0f) {
                    fArr[i] = 0.0f;
                }
            }
        } catch (Throwable th) {
            qx.a(th, ot.class);
        }
    }

    public static final void b(oo ooVar) {
        if (qx.a(ot.class)) {
            return;
        }
        try {
            dqc.d(ooVar, "x");
            if (1 >= ooVar.c.length) {
                return;
            }
            int length = ooVar.c.length;
            int i = 1;
            for (int i2 = 1; i2 < length; i2++) {
                i *= ooVar.c[i2];
            }
            int[] iArr = new int[2];
            for (int i3 = 0; i3 <= 0; i3++) {
                iArr[i3] = ooVar.c[i3];
            }
            iArr[1] = i;
            dqc.d(iArr, "shape");
            ooVar.c = iArr;
            oo.a aVar = oo.d;
            int a2 = oo.a.a(iArr);
            float[] fArr = new float[a2];
            System.arraycopy(ooVar.b, 0, fArr, 0, Math.min(ooVar.a, a2));
            ooVar.b = fArr;
            ooVar.a = a2;
        } catch (Throwable th) {
            qx.a(th, ot.class);
        }
    }

    public static final void c(oo ooVar) {
        if (qx.a(ot.class)) {
            return;
        }
        try {
            dqc.d(ooVar, "x");
            int i = ooVar.c[0];
            int i2 = ooVar.c[1];
            float[] fArr = ooVar.b;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * i2;
                int i5 = i4 + i2;
                float f = Float.MIN_VALUE;
                float f2 = 0.0f;
                for (int i6 = i4; i6 < i5; i6++) {
                    if (fArr[i6] > f) {
                        f = fArr[i6];
                    }
                }
                for (int i7 = i4; i7 < i5; i7++) {
                    fArr[i7] = (float) Math.exp(fArr[i7] - f);
                    f2 += fArr[i7];
                }
                while (i4 < i5) {
                    fArr[i4] = fArr[i4] / f2;
                    i4++;
                }
            }
        } catch (Throwable th) {
            qx.a(th, ot.class);
        }
    }

    public static final oo a(oo ooVar, oo ooVar2, oo ooVar3) {
        if (qx.a(ot.class)) {
            return null;
        }
        try {
            dqc.d(ooVar, "x");
            dqc.d(ooVar2, "w");
            dqc.d(ooVar3, "b");
            int i = ooVar.c[0];
            int i2 = ooVar3.c[0];
            oo c = c(ooVar, ooVar2);
            float[] fArr = ooVar3.b;
            float[] fArr2 = c.b;
            for (int i3 = 0; i3 < i; i3++) {
                for (int i4 = 0; i4 < i2; i4++) {
                    int i5 = (i3 * i2) + i4;
                    fArr2[i5] = fArr2[i5] + fArr[i4];
                }
            }
            return c;
        } catch (Throwable th) {
            qx.a(th, ot.class);
            return null;
        }
    }

    public static final oo d(oo ooVar) {
        if (qx.a(ot.class)) {
            return null;
        }
        try {
            dqc.d(ooVar, "x");
            int i = ooVar.c[0];
            int i2 = ooVar.c[1];
            oo ooVar2 = new oo(new int[]{i2, i});
            float[] fArr = ooVar.b;
            float[] fArr2 = ooVar2.b;
            for (int i3 = 0; i3 < i; i3++) {
                for (int i4 = 0; i4 < i2; i4++) {
                    fArr2[(i4 * i) + i3] = fArr[(i3 * i2) + i4];
                }
            }
            return ooVar2;
        } catch (Throwable th) {
            qx.a(th, ot.class);
            return null;
        }
    }

    public static final oo e(oo ooVar) {
        if (qx.a(ot.class)) {
            return null;
        }
        try {
            dqc.d(ooVar, "x");
            int i = ooVar.c[0];
            int i2 = ooVar.c[1];
            int i3 = ooVar.c[2];
            oo ooVar2 = new oo(new int[]{i3, i2, i});
            float[] fArr = ooVar.b;
            float[] fArr2 = ooVar2.b;
            for (int i4 = 0; i4 < i; i4++) {
                for (int i5 = 0; i5 < i2; i5++) {
                    for (int i6 = 0; i6 < i3; i6++) {
                        fArr2[(i6 * i * i2) + (i5 * i) + i4] = fArr[(i4 * i2 * i3) + (i5 * i3) + i6];
                    }
                }
            }
            return ooVar2;
        } catch (Throwable th) {
            qx.a(th, ot.class);
            return null;
        }
    }

    public static final oo b(oo ooVar, oo ooVar2) {
        if (qx.a(ot.class)) {
            return null;
        }
        try {
            dqc.d(ooVar, "x");
            dqc.d(ooVar2, "w");
            int i = 0;
            int i2 = ooVar.c[0];
            int i3 = ooVar.c[1];
            int i4 = ooVar.c[2];
            int i5 = ooVar2.c[0];
            int i6 = (i3 - i5) + 1;
            int i7 = ooVar2.c[2];
            oo ooVar3 = new oo(new int[]{i2, i6, i7});
            float[] fArr = ooVar.b;
            float[] fArr2 = ooVar3.b;
            float[] fArr3 = ooVar2.b;
            int i8 = 0;
            while (i8 < i2) {
                int i9 = 0;
                while (i9 < i7) {
                    int i10 = 0;
                    while (i10 < i6) {
                        float f = 0.0f;
                        while (i < i5) {
                            for (int i11 = 0; i11 < i4; i11++) {
                                f += fArr[(i3 * i4 * i8) + ((i + i10) * i4) + i11] * fArr3[(((i * i4) + i11) * i7) + i9];
                            }
                            i++;
                        }
                        fArr2[(i6 * i7 * i8) + (i10 * i7) + i9] = f;
                        i10++;
                        i = 0;
                    }
                    i9++;
                    i = 0;
                }
                i8++;
                i = 0;
            }
            return ooVar3;
        } catch (Throwable th) {
            qx.a(th, ot.class);
            return null;
        }
    }

    public static final oo a(oo ooVar, int i) {
        if (qx.a(ot.class)) {
            return null;
        }
        try {
            dqc.d(ooVar, "x");
            int i2 = ooVar.c[0];
            int i3 = ooVar.c[1];
            int i4 = ooVar.c[2];
            int i5 = (i3 - i) + 1;
            oo ooVar2 = new oo(new int[]{i2, i5, i4});
            float[] fArr = ooVar.b;
            float[] fArr2 = ooVar2.b;
            for (int i6 = 0; i6 < i2; i6++) {
                for (int i7 = 0; i7 < i4; i7++) {
                    for (int i8 = 0; i8 < i5; i8++) {
                        int i9 = i8 * i4;
                        int i10 = (i6 * i5 * i4) + i9 + i7;
                        int i11 = (i6 * i3 * i4) + i9 + i7;
                        fArr2[i10] = Float.MIN_VALUE;
                        for (int i12 = 0; i12 < i; i12++) {
                            fArr2[i10] = Math.max(fArr2[i10], fArr[i11 + (i12 * i4)]);
                        }
                    }
                }
            }
            return ooVar2;
        } catch (Throwable th) {
            qx.a(th, ot.class);
            return null;
        }
    }
}
