package defpackage;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: hf  reason: default package */
/* loaded from: classes2.dex */
public final class hf {
    public static final boolean a;
    public static final boolean b;
    private static final File c;
    private static volatile hf d;
    private static volatile int e;
    private final boolean f;
    private final int g;
    private final int h;
    private int i;
    private boolean j = true;
    private final AtomicBoolean k = new AtomicBoolean(false);

    static {
        boolean z = true;
        a = Build.VERSION.SDK_INT < 29;
        if (Build.VERSION.SDK_INT < 26) {
            z = false;
        }
        b = z;
        c = new File("/proc/self/fd");
        e = -1;
    }

    public static hf a() {
        if (d == null) {
            synchronized (hf.class) {
                if (d == null) {
                    d = new hf();
                }
            }
        }
        return d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0056, code lost:
        if ((android.os.Build.VERSION.SDK_INT != 27 ? false : java.util.Arrays.asList("LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM").contains(android.os.Build.MODEL)) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    hf() {
        /*
            r26 = this;
            r0 = r26
            r26.<init>()
            r1 = 1
            r0.j = r1
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r3 = 0
            r2.<init>(r3)
            r0.k = r2
            boolean r2 = c()
            if (r2 != 0) goto L59
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 27
            if (r2 == r4) goto L1e
            r2 = 0
            goto L56
        L1e:
            java.lang.String r5 = "LG-M250"
            java.lang.String r6 = "LG-M320"
            java.lang.String r7 = "LG-Q710AL"
            java.lang.String r8 = "LG-Q710PL"
            java.lang.String r9 = "LGM-K121K"
            java.lang.String r10 = "LGM-K121L"
            java.lang.String r11 = "LGM-K121S"
            java.lang.String r12 = "LGM-X320K"
            java.lang.String r13 = "LGM-X320L"
            java.lang.String r14 = "LGM-X320S"
            java.lang.String r15 = "LGM-X401L"
            java.lang.String r16 = "LGM-X401S"
            java.lang.String r17 = "LM-Q610.FG"
            java.lang.String r18 = "LM-Q610.FGN"
            java.lang.String r19 = "LM-Q617.FG"
            java.lang.String r20 = "LM-Q617.FGN"
            java.lang.String r21 = "LM-Q710.FG"
            java.lang.String r22 = "LM-Q710.FGN"
            java.lang.String r23 = "LM-X220PM"
            java.lang.String r24 = "LM-X220QMA"
            java.lang.String r25 = "LM-X410PM"
            java.lang.String[] r2 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25}
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.lang.String r4 = android.os.Build.MODEL
            boolean r2 = r2.contains(r4)
        L56:
            if (r2 != 0) goto L59
            goto L5a
        L59:
            r1 = 0
        L5a:
            r0.f = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L69
            r1 = 20000(0x4e20, float:2.8026E-41)
            r0.g = r1
            r0.h = r3
            return
        L69:
            r1 = 700(0x2bc, float:9.81E-43)
            r0.g = r1
            r1 = 128(0x80, float:1.794E-43)
            r0.h = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hf.<init>():void");
    }

    public final boolean a(int i, int i2, boolean z, boolean z2) {
        int i3;
        return z && this.f && b && !b() && !z2 && i >= (i3 = this.h) && i2 >= i3 && d();
    }

    private boolean b() {
        return a && !this.k.get();
    }

    private static boolean c() {
        if (Build.VERSION.SDK_INT != 26) {
            return false;
        }
        for (String str : Arrays.asList("SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play")) {
            if (Build.MODEL.startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    private synchronized boolean d() {
        int i;
        boolean z = true;
        int i2 = this.i + 1;
        this.i = i2;
        if (i2 >= 50) {
            this.i = 0;
            int length = c.list().length;
            if (e != -1) {
                i = e;
            } else {
                i = this.g;
            }
            long j = i;
            if (length >= j) {
                z = false;
            }
            this.j = z;
            if (!z && Log.isLoggable("Downsampler", 5)) {
                StringBuilder sb = new StringBuilder("Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ");
                sb.append(length);
                sb.append(", limit ");
                sb.append(j);
            }
        }
        return this.j;
    }
}
