package defpackage;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: eaz */
/* loaded from: classes2.dex */
public final class eaz implements ead {
    final eaw a;
    ebz b;
    final eba c;
    final boolean d;
    private boolean e;

    public static /* synthetic */ ebz a(eaz eazVar) {
        return eazVar.b;
    }

    private eaz(eaw eawVar, eba ebaVar, boolean z) {
        this.a = eawVar;
        this.c = ebaVar;
        this.d = z;
    }

    public static eaz a(eaw eawVar, eba ebaVar, boolean z) {
        eaz eazVar = new eaz(eawVar, ebaVar, z);
        eazVar.b = new ebz(eawVar, eazVar);
        return eazVar;
    }

    @Override // defpackage.ead
    public final eba a() {
        return this.c;
    }

    @Override // defpackage.ead
    public final ebc b() throws IOException {
        synchronized (this) {
            if (this.e) {
                throw new IllegalStateException("Already Executed");
            }
            this.e = true;
        }
        this.b.e.A_();
        this.b.a();
        try {
            this.a.c.a(this);
            return f();
        } finally {
            this.a.c.b(this);
        }
    }

    @Override // defpackage.ead
    public final void a(eae eaeVar) {
        synchronized (this) {
            if (this.e) {
                throw new IllegalStateException("Already Executed");
            }
            this.e = true;
        }
        this.b.a();
        this.a.c.a(new a(eaeVar));
    }

    @Override // defpackage.ead
    public final void c() {
        this.b.f();
    }

    @Override // defpackage.ead
    public final boolean d() {
        return this.b.g();
    }

    /* renamed from: eaz$a */
    /* loaded from: classes2.dex */
    public final class a extends ebi {
        static final /* synthetic */ boolean c = !eaz.class.desiredAssertionStatus();
        final eae a;
        volatile AtomicInteger b = new AtomicInteger(0);

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(eae eaeVar) {
            super("OkHttp %s", r3.e());
            eaz.this = r3;
            this.a = eaeVar;
        }

        public final String a() {
            return eaz.this.c.a.b;
        }

        @Override // defpackage.ebi
        public final void b() {
            boolean z;
            IOException e;
            eam eamVar;
            Throwable th;
            eaz.this.b.e.A_();
            try {
                try {
                    z = true;
                    try {
                        this.a.a(eaz.this.f());
                        eamVar = eaz.this.a.c;
                    } catch (IOException e2) {
                        e = e2;
                        if (z) {
                            edk e3 = edk.e();
                            StringBuilder sb = new StringBuilder("Callback failure for ");
                            eaz eazVar = eaz.this;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(eazVar.b.g() ? "canceled " : "");
                            sb2.append(eazVar.d ? "web socket" : NotificationCompat.CATEGORY_CALL);
                            sb2.append(" to ");
                            sb2.append(eazVar.e());
                            sb.append(sb2.toString());
                            e3.a(4, sb.toString(), e);
                        } else {
                            this.a.a(e);
                        }
                        eamVar = eaz.this.a.c;
                        eamVar.b(this);
                    } catch (Throwable th2) {
                        th = th2;
                        eaz.this.b.f();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to ".concat(String.valueOf(th)));
                            iOException.addSuppressed(th);
                            this.a.a(iOException);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    eaz.this.a.c.b(this);
                    throw th3;
                }
            } catch (IOException e4) {
                e = e4;
                z = false;
            } catch (Throwable th4) {
                th = th4;
                z = false;
            }
            eamVar.b(this);
        }
    }

    final String e() {
        return this.c.a.i();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final defpackage.ebc f() throws java.io.IOException {
        /*
            r11 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            eaw r0 = r11.a
            java.util.List<eat> r0 = r0.g
            r1.addAll(r0)
            ecj r0 = new ecj
            eaw r2 = r11.a
            r0.<init>(r2)
            r1.add(r0)
            eca r0 = new eca
            eaw r2 = r11.a
            eal r2 = r2.k
            r0.<init>(r2)
            r1.add(r0)
            ebm r0 = new ebm
            eaw r2 = r11.a
            eab r3 = r2.l
            if (r3 == 0) goto L2f
            eab r2 = r2.l
            ebq r2 = r2.a
            goto L31
        L2f:
            ebq r2 = r2.m
        L31:
            r0.<init>(r2)
            r1.add(r0)
            ebr r0 = new ebr
            eaw r2 = r11.a
            r0.<init>(r2)
            r1.add(r0)
            boolean r0 = r11.d
            if (r0 != 0) goto L4c
            eaw r0 = r11.a
            java.util.List<eat> r0 = r0.h
            r1.addAll(r0)
        L4c:
            ecb r0 = new ecb
            boolean r2 = r11.d
            r0.<init>(r2)
            r1.add(r0)
            ecg r10 = new ecg
            ebz r2 = r11.b
            r3 = 0
            r4 = 0
            eba r5 = r11.c
            eaw r0 = r11.a
            int r7 = r0.A
            eaw r0 = r11.a
            int r8 = r0.B
            eaw r0 = r11.a
            int r9 = r0.C
            r0 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 0
            r1 = 0
            eba r2 = r11.c     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L92
            ebc r2 = r10.a(r2)     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L92
            ebz r3 = r11.b     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L92
            boolean r3 = r3.g()     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L92
            if (r3 != 0) goto L85
            ebz r0 = r11.b
            r0.a(r1)
            return r2
        L85:
            defpackage.ebk.a(r2)     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L92
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L92
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L92
            throw r2     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L92
        L90:
            r2 = move-exception
            goto L9e
        L92:
            r0 = move-exception
            r2 = 1
            ebz r3 = r11.b     // Catch: java.lang.Throwable -> L9b
            java.io.IOException r0 = r3.a(r0)     // Catch: java.lang.Throwable -> L9b
            throw r0     // Catch: java.lang.Throwable -> L9b
        L9b:
            r0 = move-exception
            r2 = r0
            r0 = 1
        L9e:
            if (r0 != 0) goto La5
            ebz r0 = r11.b
            r0.a(r1)
        La5:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eaz.f():ebc");
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return a(this.a, this.c, this.d);
    }
}
