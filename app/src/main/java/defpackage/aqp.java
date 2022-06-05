package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: aqp  reason: default package */
/* loaded from: classes.dex */
public abstract class aqp<T> {
    private static final Object a = new Object();
    private static Context b = null;
    private static boolean c = false;
    private static final AtomicInteger g = new AtomicInteger();
    private final aqw d;
    private final String e;
    private final T f;
    private volatile int h;
    private volatile T i;

    public static void a(Context context) {
        synchronized (a) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (b != context) {
                synchronized (aqe.class) {
                    aqe.a.clear();
                }
                synchronized (aqv.class) {
                    aqv.a.clear();
                }
                synchronized (aqm.class) {
                    aqm.a = null;
                }
                g.incrementAndGet();
                b = context;
            }
        }
    }

    abstract T a(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a() {
        g.incrementAndGet();
    }

    private aqp(aqw aqwVar, String str, T t) {
        this.h = -1;
        if (aqwVar.a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.d = aqwVar;
        this.e = str;
        this.f = t;
    }

    private final String a(String str) {
        if (str == null || !str.isEmpty()) {
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf(this.e);
            return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        return this.e;
    }

    public final String b() {
        return a(this.d.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095 A[Catch: all -> 0x00c2, TryCatch #0 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0013, B:11:0x0023, B:17:0x0035, B:19:0x003b, B:21:0x0047, B:23:0x0058, B:25:0x0060, B:27:0x006a, B:28:0x006f, B:30:0x0078, B:32:0x0088, B:33:0x008c, B:37:0x0095, B:39:0x00a9, B:42:0x00b1, B:43:0x00b3, B:44:0x00b8, B:45:0x00bf, B:46:0x00c0), top: B:53:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T c() {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = defpackage.aqp.g
            int r0 = r0.get()
            int r1 = r5.h
            if (r1 >= r0) goto Lc5
            monitor-enter(r5)
            int r1 = r5.h     // Catch: java.lang.Throwable -> Lc2
            if (r1 >= r0) goto Lc0
            android.content.Context r1 = defpackage.aqp.b     // Catch: java.lang.Throwable -> Lc2
            if (r1 == 0) goto Lb8
            android.content.Context r1 = defpackage.aqp.b     // Catch: java.lang.Throwable -> Lc2
            aqm r1 = defpackage.aqm.a(r1)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r2 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype"
            java.lang.Object r1 = r1.a(r2)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lc2
            if (r1 == 0) goto L31
            java.util.regex.Pattern r2 = defpackage.aqc.b     // Catch: java.lang.Throwable -> Lc2
            java.util.regex.Matcher r1 = r2.matcher(r1)     // Catch: java.lang.Throwable -> Lc2
            boolean r1 = r1.matches()     // Catch: java.lang.Throwable -> Lc2
            if (r1 == 0) goto L31
            r1 = 1
            goto L32
        L31:
            r1 = 0
        L32:
            r2 = 0
            if (r1 != 0) goto L6f
            aqw r1 = r5.d     // Catch: java.lang.Throwable -> Lc2
            android.net.Uri r1 = r1.a     // Catch: java.lang.Throwable -> Lc2
            if (r1 == 0) goto L58
            android.content.Context r1 = defpackage.aqp.b     // Catch: java.lang.Throwable -> Lc2
            aqw r3 = r5.d     // Catch: java.lang.Throwable -> Lc2
            android.net.Uri r3 = r3.a     // Catch: java.lang.Throwable -> Lc2
            boolean r1 = defpackage.aqn.a(r1, r3)     // Catch: java.lang.Throwable -> Lc2
            if (r1 == 0) goto L56
            android.content.Context r1 = defpackage.aqp.b     // Catch: java.lang.Throwable -> Lc2
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Throwable -> Lc2
            aqw r3 = r5.d     // Catch: java.lang.Throwable -> Lc2
            android.net.Uri r3 = r3.a     // Catch: java.lang.Throwable -> Lc2
            aqe r1 = defpackage.aqe.a(r1, r3)     // Catch: java.lang.Throwable -> Lc2
            goto L5e
        L56:
            r1 = r2
            goto L5e
        L58:
            android.content.Context r1 = defpackage.aqp.b     // Catch: java.lang.Throwable -> Lc2
            aqv r1 = defpackage.aqv.a(r1)     // Catch: java.lang.Throwable -> Lc2
        L5e:
            if (r1 == 0) goto L91
            java.lang.String r3 = r5.b()     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r1 = r1.a(r3)     // Catch: java.lang.Throwable -> Lc2
            if (r1 == 0) goto L91
            java.lang.Object r1 = r5.a(r1)     // Catch: java.lang.Throwable -> Lc2
            goto L92
        L6f:
            java.lang.String r1 = "PhenotypeFlag"
            r3 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r3)     // Catch: java.lang.Throwable -> Lc2
            if (r1 == 0) goto L91
            java.lang.String r1 = "Bypass reading Phenotype values for flag: "
            java.lang.String r3 = r5.b()     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> Lc2
            int r4 = r3.length()     // Catch: java.lang.Throwable -> Lc2
            if (r4 == 0) goto L8c
            r1.concat(r3)     // Catch: java.lang.Throwable -> Lc2
            goto L91
        L8c:
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> Lc2
            r3.<init>(r1)     // Catch: java.lang.Throwable -> Lc2
        L91:
            r1 = r2
        L92:
            if (r1 == 0) goto L95
            goto Lb3
        L95:
            android.content.Context r1 = defpackage.aqp.b     // Catch: java.lang.Throwable -> Lc2
            aqm r1 = defpackage.aqm.a(r1)     // Catch: java.lang.Throwable -> Lc2
            aqw r3 = r5.d     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r3 = r3.b     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r3 = r5.a(r3)     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r1 = r1.a(r3)     // Catch: java.lang.Throwable -> Lc2
            if (r1 == 0) goto Lad
            java.lang.Object r2 = r5.a(r1)     // Catch: java.lang.Throwable -> Lc2
        Lad:
            if (r2 == 0) goto Lb1
            r1 = r2
            goto Lb3
        Lb1:
            T r1 = r5.f     // Catch: java.lang.Throwable -> Lc2
        Lb3:
            r5.i = r1     // Catch: java.lang.Throwable -> Lc2
            r5.h = r0     // Catch: java.lang.Throwable -> Lc2
            goto Lc0
        Lb8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r1 = "Must call PhenotypeFlag.init() first"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc2
            throw r0     // Catch: java.lang.Throwable -> Lc2
        Lc0:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lc2
            goto Lc5
        Lc2:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lc2
            throw r0
        Lc5:
            T r0 = r5.i
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqp.c():java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ aqp(aqw aqwVar, String str, Object obj, byte b2) {
        this(aqwVar, str, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ aqp a(aqw aqwVar, String str, long j) {
        return new aqs(aqwVar, str, Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ aqp a(aqw aqwVar, String str, boolean z) {
        return new aqr(aqwVar, str, Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ aqp a(aqw aqwVar, String str) {
        return new aqu(aqwVar, str, Double.valueOf(-3.0d));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ aqp a(aqw aqwVar, String str, String str2) {
        return new aqt(aqwVar, str, str2);
    }
}
