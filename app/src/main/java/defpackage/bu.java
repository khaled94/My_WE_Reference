package defpackage;

import android.content.Context;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: bu  reason: default package */
/* loaded from: classes2.dex */
public final class bu<TranscodeType> extends jw<bu<TranscodeType>> implements Cloneable {
    protected static final kb a = new kb().a(dt.c).a(bt.LOW).c();
    private final Context A;
    private final bv B;
    private final Class<TranscodeType> C;
    private final bo D;
    private final bq E;
    private bw<?, ? super TranscodeType> F;
    private Object G;
    private List<ka<TranscodeType>> H;
    private bu<TranscodeType> I;
    private bu<TranscodeType> J;
    private Float K;
    private boolean L = true;
    private boolean M;
    private boolean N;

    @Override // defpackage.jw
    public final /* synthetic */ jw b(jw jwVar) {
        return a((jw<?>) jwVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public bu(bo boVar, bv bvVar, Class<TranscodeType> cls, Context context) {
        this.D = boVar;
        this.B = bvVar;
        this.C = cls;
        this.A = context;
        this.F = bvVar.a(cls);
        this.E = boVar.b;
        for (ka<Object> kaVar : bvVar.d) {
            bu<TranscodeType> buVar = this;
            while (buVar.v) {
                buVar = buVar.clone();
            }
            if (kaVar != null) {
                if (buVar.H == null) {
                    buVar.H = new ArrayList();
                }
                buVar.H.add(kaVar);
            }
            buVar.e();
        }
        a((jw<?>) bvVar.e());
    }

    public final bu<TranscodeType> a(Object obj) {
        return b(obj);
    }

    public final bu<TranscodeType> a(String str) {
        return b(str);
    }

    public final bu<TranscodeType> a(Integer num) {
        return b(num).a((jw<?>) kb.b(kr.a(this.A)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public bu<TranscodeType> clone() {
        bu<TranscodeType> buVar = (bu) super.clone();
        buVar.F = (bw<?, ? super TranscodeType>) buVar.F.clone();
        if (buVar.H != null) {
            buVar.H = new ArrayList(buVar.H);
        }
        bu<TranscodeType> buVar2 = buVar.I;
        if (buVar2 != null) {
            buVar.I = buVar2.clone();
        }
        bu<TranscodeType> buVar3 = buVar.J;
        if (buVar3 != null) {
            buVar.J = buVar3.clone();
        }
        return buVar;
    }

    public final <Y extends km<TranscodeType>> Y a(Y y) {
        return (Y) a((bu<TranscodeType>) y, this, kz.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.kn<android.widget.ImageView, TranscodeType> a(android.widget.ImageView r4) {
        /*
            r3 = this;
            defpackage.lg.a()
            java.lang.String r0 = "Argument must not be null"
            defpackage.lf.a(r4, r0)
            r0 = 2048(0x800, float:2.87E-42)
            boolean r0 = super.c(r0)
            if (r0 != 0) goto L5c
            boolean r0 = r3.n
            if (r0 == 0) goto L5c
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            if (r0 == 0) goto L5c
            int[] r0 = defpackage.bu.AnonymousClass1.a
            android.widget.ImageView$ScaleType r1 = r4.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L4c;
                case 2: goto L43;
                case 3: goto L33;
                case 4: goto L33;
                case 5: goto L33;
                case 6: goto L2a;
                default: goto L29;
            }
        L29:
            goto L5c
        L2a:
            jw r0 = r3.clone()
            jw r0 = r0.d()
            goto L5d
        L33:
            jw r0 = r3.clone()
            gz r1 = defpackage.gz.c
            he r2 = new he
            r2.<init>()
            jw r0 = super.b(r1, r2)
            goto L5d
        L43:
            jw r0 = r3.clone()
            jw r0 = r0.d()
            goto L5d
        L4c:
            jw r0 = r3.clone()
            gz r1 = defpackage.gz.e
            gx r2 = new gx
            r2.<init>()
            jw r0 = r0.a(r1, r2)
            goto L5d
        L5c:
            r0 = r3
        L5d:
            java.lang.Class<TranscodeType> r1 = r3.C
            java.lang.Class<android.graphics.Bitmap> r2 = android.graphics.Bitmap.class
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L6d
            kg r1 = new kg
            r1.<init>(r4)
            goto L7a
        L6d:
            java.lang.Class<android.graphics.drawable.Drawable> r2 = android.graphics.drawable.Drawable.class
            boolean r2 = r2.isAssignableFrom(r1)
            if (r2 == 0) goto L85
            ki r1 = new ki
            r1.<init>(r4)
        L7a:
            java.util.concurrent.Executor r4 = defpackage.kz.a()
            km r4 = r3.a(r1, r0, r4)
            kn r4 = (defpackage.kn) r4
            return r4
        L85:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Unhandled class: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r1 = ", try .as*(Class).transcode(ResourceTranscoder)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bu.a(android.widget.ImageView):kn");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bu$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[bt.values().length];
            b = iArr;
            try {
                iArr[bt.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[bt.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[bt.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[bt.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private bt b(bt btVar) {
        int i = AnonymousClass1.b[btVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return bt.HIGH;
            }
            if (i == 3 || i == 4) {
                return bt.IMMEDIATE;
            }
            throw new IllegalArgumentException("unknown priority: " + this.d);
        }
        return bt.NORMAL;
    }

    private jy b(km<TranscodeType> kmVar, jw<?> jwVar, Executor executor) {
        return a(new Object(), kmVar, (ka) null, (jz) null, this.F, jwVar.d, jwVar.k, jwVar.j, jwVar, executor);
    }

    private jy a(Object obj, km<TranscodeType> kmVar, ka<TranscodeType> kaVar, jz jzVar, bw<?, ? super TranscodeType> bwVar, bt btVar, int i, int i2, jw<?> jwVar, Executor executor) {
        jx jxVar;
        jx jxVar2;
        if (this.J != null) {
            jxVar2 = new jx(obj, jzVar);
            jxVar = jxVar2;
        } else {
            jxVar = null;
            jxVar2 = jzVar;
        }
        jy b = b(obj, kmVar, kaVar, jxVar2, bwVar, btVar, i, i2, jwVar, executor);
        if (jxVar == null) {
            return b;
        }
        int i3 = this.J.k;
        int i4 = this.J.j;
        if (lg.a(i, i2) && !this.J.f()) {
            i3 = jwVar.k;
            i4 = jwVar.j;
        }
        bu<TranscodeType> buVar = this.J;
        jx jxVar3 = jxVar;
        jxVar3.a(b, buVar.a(obj, kmVar, kaVar, jxVar3, buVar.F, buVar.d, i3, i4, this.J, executor));
        return jxVar3;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [jw] */
    private jy b(Object obj, km<TranscodeType> kmVar, ka<TranscodeType> kaVar, jz jzVar, bw<?, ? super TranscodeType> bwVar, bt btVar, int i, int i2, jw<?> jwVar, Executor executor) {
        bt btVar2;
        bu<TranscodeType> buVar = this.I;
        if (buVar != null) {
            if (this.N) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            bw<?, ? super TranscodeType> bwVar2 = buVar.L ? bwVar : buVar.F;
            if (!super.c(8)) {
                btVar2 = b(btVar);
            } else {
                btVar2 = this.I.d;
            }
            bt btVar3 = btVar2;
            int i3 = this.I.k;
            int i4 = this.I.j;
            if (lg.a(i, i2) && !this.I.f()) {
                i3 = jwVar.k;
                i4 = jwVar.j;
            }
            ke keVar = new ke(obj, jzVar);
            jy a2 = a(obj, kmVar, kaVar, jwVar, keVar, bwVar, btVar, i, i2, executor);
            this.N = true;
            bu<TranscodeType> buVar2 = this.I;
            jy a3 = buVar2.a(obj, kmVar, kaVar, keVar, bwVar2, btVar3, i3, i4, buVar2, executor);
            this.N = false;
            keVar.a(a2, a3);
            return keVar;
        } else if (this.K != null) {
            ke keVar2 = new ke(obj, jzVar);
            keVar2.a(a(obj, kmVar, kaVar, jwVar, keVar2, bwVar, btVar, i, i2, executor), a(obj, kmVar, kaVar, jwVar.clone().a(this.K.floatValue()), keVar2, bwVar, b(btVar), i, i2, executor));
            return keVar2;
        } else {
            return a(obj, kmVar, kaVar, jwVar, jzVar, bwVar, btVar, i, i2, executor);
        }
    }

    private jy a(Object obj, km<TranscodeType> kmVar, ka<TranscodeType> kaVar, jw<?> jwVar, jz jzVar, bw<?, ? super TranscodeType> bwVar, bt btVar, int i, int i2, Executor executor) {
        Context context = this.A;
        bq bqVar = this.E;
        return kd.a(context, bqVar, obj, this.G, this.C, jwVar, i, i2, btVar, kmVar, kaVar, this.H, jzVar, bqVar.f, bwVar.a, executor);
    }

    public final bu<TranscodeType> a(jw<?> jwVar) {
        lf.a(jwVar, "Argument must not be null");
        return (bu) super.b(jwVar);
    }

    private bu<TranscodeType> b(Object obj) {
        bu<TranscodeType> buVar = this;
        while (buVar.v) {
            buVar = buVar.clone();
        }
        buVar.G = obj;
        buVar.M = true;
        return buVar.e();
    }

    private <Y extends km<TranscodeType>> Y a(Y y, jw<?> jwVar, Executor executor) {
        lf.a(y, "Argument must not be null");
        if (!this.M) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        jy b = b(y, jwVar, executor);
        jy d = y.d();
        if (b.a(d) && !a(jwVar, d)) {
            if (!((jy) lf.a(d, "Argument must not be null")).d()) {
                d.a();
            }
            return y;
        }
        this.B.a((km<?>) y);
        y.a(b);
        this.B.a(y, b);
        return y;
    }

    private static boolean a(jw<?> jwVar, jy jyVar) {
        return !jwVar.i && jyVar.e();
    }
}
