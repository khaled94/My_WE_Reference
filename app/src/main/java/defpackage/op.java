package defpackage;

import defpackage.oq;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001b\b\u0002\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J+\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00172\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/facebook/appevents/ml/Model;", "", "weights", "", "", "Lcom/facebook/appevents/ml/MTensor;", "(Ljava/util/Map;)V", "convs0Bias", "convs0Weight", "convs1Bias", "convs1Weight", "convs2Bias", "convs2Weight", "embedding", "fc1Bias", "fc1Weight", "fc2Bias", "fc2Weight", "finalWeights", "", "predictOnMTML", "dense", "texts", "", "task", "(Lcom/facebook/appevents/ml/MTensor;[Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/appevents/ml/MTensor;", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: op  reason: default package */
/* loaded from: classes2.dex */
public final class op {
    public static final a a = new a((byte) 0);
    private static final Map<String, String> n = dnh.b(dme.a("embedding.weight", "embed.weight"), dme.a("dense1.weight", "fc1.weight"), dme.a("dense2.weight", "fc2.weight"), dme.a("dense3.weight", "fc3.weight"), dme.a("dense1.bias", "fc1.bias"), dme.a("dense2.bias", "fc2.bias"), dme.a("dense3.bias", "fc3.bias"));
    private final oo b;
    private final oo c;
    private final oo d;
    private final oo e;
    private final oo f;
    private final oo g;
    private final oo h;
    private final oo i;
    private final oo j;
    private final oo k;
    private final oo l;
    private final Map<String, oo> m;

    private op(Map<String, oo> map) {
        oo ooVar = map.get("embed.weight");
        if (ooVar == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.b = ooVar;
        oo ooVar2 = map.get("convs.0.weight");
        if (ooVar2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.c = ot.e(ooVar2);
        oo ooVar3 = map.get("convs.1.weight");
        if (ooVar3 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.d = ot.e(ooVar3);
        oo ooVar4 = map.get("convs.2.weight");
        if (ooVar4 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.e = ot.e(ooVar4);
        oo ooVar5 = map.get("convs.0.bias");
        if (ooVar5 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f = ooVar5;
        oo ooVar6 = map.get("convs.1.bias");
        if (ooVar6 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.g = ooVar6;
        oo ooVar7 = map.get("convs.2.bias");
        if (ooVar7 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.h = ooVar7;
        oo ooVar8 = map.get("fc1.weight");
        if (ooVar8 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.i = ot.d(ooVar8);
        oo ooVar9 = map.get("fc2.weight");
        if (ooVar9 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.j = ot.d(ooVar9);
        oo ooVar10 = map.get("fc1.bias");
        if (ooVar10 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.k = ooVar10;
        oo ooVar11 = map.get("fc2.bias");
        if (ooVar11 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.l = ooVar11;
        this.m = new HashMap();
        for (String str : dnm.a((Object[]) new String[]{oq.a.MTML_INTEGRITY_DETECT.toKey(), oq.a.MTML_APP_EVENT_PREDICTION.toKey()})) {
            String str2 = str + ".weight";
            String str3 = str + ".bias";
            oo ooVar12 = map.get(str2);
            oo ooVar13 = map.get(str3);
            if (ooVar12 != null) {
                this.m.put(str2, ot.d(ooVar12));
            }
            if (ooVar13 != null) {
                this.m.put(str3, ooVar13);
            }
        }
    }

    public /* synthetic */ op(Map map, byte b) {
        this(map);
    }

    public static final /* synthetic */ Map a() {
        if (qx.a(op.class)) {
            return null;
        }
        try {
            return n;
        } catch (Throwable th) {
            qx.a(th, op.class);
            return null;
        }
    }

    public final oo a(oo ooVar, String[] strArr, String str) {
        if (qx.a(this)) {
            return null;
        }
        try {
            dqc.d(ooVar, "dense");
            dqc.d(strArr, "texts");
            dqc.d(str, "task");
            oo b = ot.b(ot.a(strArr, this.b), this.c);
            ot.a(b, this.f);
            ot.a(b);
            oo b2 = ot.b(b, this.d);
            ot.a(b2, this.g);
            ot.a(b2);
            oo a2 = ot.a(b2, 2);
            oo b3 = ot.b(a2, this.e);
            ot.a(b3, this.h);
            ot.a(b3);
            oo a3 = ot.a(b, b.c[1]);
            oo a4 = ot.a(a2, a2.c[1]);
            oo a5 = ot.a(b3, b3.c[1]);
            ot.b(a3);
            ot.b(a4);
            ot.b(a5);
            oo a6 = ot.a(ot.a(new oo[]{a3, a4, a5, ooVar}), this.i, this.k);
            ot.a(a6);
            oo a7 = ot.a(a6, this.j, this.l);
            ot.a(a7);
            Map<String, oo> map = this.m;
            oo ooVar2 = map.get(str + ".weight");
            Map<String, oo> map2 = this.m;
            oo ooVar3 = map2.get(str + ".bias");
            if (ooVar2 != null && ooVar3 != null) {
                oo a8 = ot.a(a7, ooVar2, ooVar3);
                ot.c(a8);
                return a8;
            }
            return null;
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bJ\u001e\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/facebook/appevents/ml/Model$Companion;", "", "()V", "SEQ_LEN", "", "mapping", "", "", "build", "Lcom/facebook/appevents/ml/Model;", "file", "Ljava/io/File;", "parse", "Lcom/facebook/appevents/ml/MTensor;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: op$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static defpackage.op a(java.io.File r6) {
            /*
                java.lang.String r0 = "file"
                defpackage.dqc.d(r6, r0)
                java.util.Map r6 = defpackage.ou.a(r6)
                r0 = 0
                if (r6 == 0) goto L50
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                java.util.Map r1 = (java.util.Map) r1
                java.util.Map r2 = defpackage.op.a()
                java.util.Set r6 = r6.entrySet()
                java.util.Iterator r6 = r6.iterator()
            L1f:
                boolean r3 = r6.hasNext()
                if (r3 == 0) goto L51
                java.lang.Object r3 = r6.next()
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                java.lang.Object r4 = r3.getKey()
                java.lang.String r4 = (java.lang.String) r4
                java.lang.Object r5 = r3.getKey()
                boolean r5 = r2.containsKey(r5)
                if (r5 == 0) goto L48
                java.lang.Object r4 = r3.getKey()
                java.lang.Object r4 = r2.get(r4)
                java.lang.String r4 = (java.lang.String) r4
                if (r4 != 0) goto L48
                goto L50
            L48:
                java.lang.Object r3 = r3.getValue()
                r1.put(r4, r3)
                goto L1f
            L50:
                r1 = r0
            L51:
                if (r1 != 0) goto L54
                return r0
            L54:
                op r6 = new op     // Catch: java.lang.Exception -> L5b
                r2 = 0
                r6.<init>(r1, r2)     // Catch: java.lang.Exception -> L5b
                return r6
            L5b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.op.a.a(java.io.File):op");
        }
    }
}
