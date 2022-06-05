package com.google.firebase.auth;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.common.api.Status;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class FirebaseAuth implements cjp {
    public cgw a;
    public cif b;
    public chm c;
    private final List<Object> d;
    private final List<Object> e;
    private List<Object> f;
    private ckn g;
    private final Object h;
    private final Object i;
    private String j;
    private final ckc k;
    private final cjt l;
    private ckb m;
    private ckd n;

    /* loaded from: classes.dex */
    class b implements cjq {
        b() {
        }

        @Override // defpackage.cjq
        public final void a(alf alfVar, chm chmVar) {
            aat.a(alfVar);
            aat.a(chmVar);
            chmVar.a(alfVar);
            FirebaseAuth.this.a(chmVar, alfVar, true);
        }
    }

    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) cgw.d().a(FirebaseAuth.class);
    }

    public static FirebaseAuth getInstance(cgw cgwVar) {
        return (FirebaseAuth) cgwVar.a(FirebaseAuth.class);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FirebaseAuth(defpackage.cgw r7) {
        /*
            r6 = this;
            cjc r0 = new cjc
            cgy r1 = r7.c()
            java.lang.String r1 = r1.a
            r0.<init>(r1)
            cjd r0 = r0.a()
            android.content.Context r1 = r7.a()
            cif r0 = defpackage.cjb.a(r1, r0)
            ckc r1 = new ckc
            android.content.Context r2 = r7.a()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r7.b()
            java.nio.charset.Charset r5 = java.nio.charset.Charset.defaultCharset()
            byte[] r4 = r4.getBytes(r5)
            java.lang.String r4 = defpackage.adw.a(r4)
            r3.append(r4)
            java.lang.String r4 = "+"
            r3.append(r4)
            cgy r4 = r7.c()
            java.lang.String r4 = r4.b
            java.nio.charset.Charset r5 = java.nio.charset.Charset.defaultCharset()
            byte[] r4 = r4.getBytes(r5)
            java.lang.String r4 = defpackage.adw.a(r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r2, r3)
            cjt r2 = defpackage.cjt.a()
            r6.<init>(r7, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.<init>(cgw):void");
    }

    private FirebaseAuth(cgw cgwVar, cif cifVar, ckc ckcVar, cjt cjtVar) {
        bwl<chi> bwlVar;
        bwl<chi> bwlVar2;
        this.h = new Object();
        this.i = new Object();
        this.a = (cgw) aat.a(cgwVar);
        this.b = (cif) aat.a(cifVar);
        this.k = (ckc) aat.a(ckcVar);
        this.g = new ckn();
        this.l = (cjt) aat.a(cjtVar);
        this.d = new CopyOnWriteArrayList();
        this.e = new CopyOnWriteArrayList();
        this.f = new CopyOnWriteArrayList();
        this.n = ckd.a();
        chm a2 = this.k.a();
        this.c = a2;
        boolean z = true;
        if (a2 != null) {
            ckc ckcVar2 = this.k;
            aat.a(a2);
            String string = ckcVar2.a.getString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", a2.a()), null);
            alf a3 = string != null ? alf.a(string) : null;
            if (a3 != null) {
                a(this.c, a3, false);
            }
        }
        cjz cjzVar = this.l.a;
        aat.a(this);
        SharedPreferences sharedPreferences = this.a.a().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0);
        if (this.a.b().equals(sharedPreferences.getString("firebaseAppName", ""))) {
            if (sharedPreferences.contains("verifyAssertionRequest")) {
                String string2 = sharedPreferences.getString("verifyAssertionRequest", "");
                alr alrVar = (alr) abe.a(string2 == null ? null : Base64.decode(string2, 10), alr.CREATOR);
                String string3 = sharedPreferences.getString("operation", "");
                String string4 = sharedPreferences.getString("tenantId", null);
                String string5 = sharedPreferences.getString("firebaseUserUid", "");
                cjzVar.b = sharedPreferences.getLong("timestamp", 0L);
                if (string4 != null) {
                    aat.a(string4);
                    synchronized (this.i) {
                        this.j = string4;
                    }
                    alrVar.b = string4;
                }
                char c = 65535;
                int hashCode = string3.hashCode();
                if (hashCode != -1843829902) {
                    if (hashCode != -286760092) {
                        if (hashCode == 1731327805 && string3.equals("com.google.firebase.auth.internal.SIGN_IN")) {
                            c = 0;
                        }
                    } else if (string3.equals("com.google.firebase.auth.internal.LINK")) {
                        c = 1;
                    }
                } else if (string3.equals("com.google.firebase.auth.internal.REAUTHENTICATE")) {
                    c = 2;
                }
                if (c == 0) {
                    cll a4 = cll.a(alrVar);
                    aat.a(a4);
                    cif cifVar2 = this.b;
                    cir cirVar = (cir) new cir(a4, this.j).a(this.a).a((cjf<chi, cjq>) new b());
                    cjzVar.a = cifVar2.a(cifVar2.b(cirVar), cirVar);
                } else if (c != 1) {
                    if (c == 2) {
                        if (!this.c.a().equals(string5)) {
                            cjzVar.a = null;
                        } else {
                            chm chmVar = this.c;
                            cll a5 = cll.a(alrVar);
                            aat.a(a5);
                            FirebaseAuth firebaseAuth = getInstance(chmVar.f());
                            aat.a(chmVar);
                            aat.a(a5);
                            if (chj.class.isAssignableFrom(a5.getClass())) {
                                chj chjVar = (chj) a5;
                                if ("password".equals(chjVar.b())) {
                                    cif cifVar3 = firebaseAuth.b;
                                    cgw cgwVar2 = firebaseAuth.a;
                                    String str = chjVar.a;
                                    String str2 = chjVar.b;
                                    String g = chmVar.g();
                                    a aVar = new a();
                                    cip cipVar = (cip) new cip(str, str2, g).a(cgwVar2).a(chmVar).a((cjf<chi, cjq>) aVar).a((clc) aVar);
                                    bwlVar2 = cifVar3.a(cifVar3.b(cipVar), cipVar);
                                } else {
                                    cli a6 = cli.a(chjVar.c);
                                    if ((a6 == null || TextUtils.equals(firebaseAuth.j, a6.a)) ? false : z) {
                                        bwlVar2 = bwo.a((Exception) civ.a(new Status(17072)));
                                    } else {
                                        cif cifVar4 = firebaseAuth.b;
                                        cgw cgwVar3 = firebaseAuth.a;
                                        a aVar2 = new a();
                                        cin cinVar = (cin) new cin(chjVar).a(cgwVar3).a(chmVar).a((cjf<chi, cjq>) aVar2).a((clc) aVar2);
                                        bwlVar2 = cifVar4.a(cifVar4.b(cinVar), cinVar);
                                    }
                                }
                            } else {
                                cif cifVar5 = firebaseAuth.b;
                                cgw cgwVar4 = firebaseAuth.a;
                                String g2 = chmVar.g();
                                a aVar3 = new a();
                                cil cilVar = (cil) new cil(a5, g2).a(cgwVar4).a(chmVar).a((cjf<chi, cjq>) aVar3).a((clc) aVar3);
                                bwlVar2 = cifVar5.a(cifVar5.b(cilVar), cilVar);
                            }
                            cjzVar.a = bwlVar2;
                        }
                    } else {
                        cjzVar.a = null;
                    }
                } else if (!this.c.a().equals(string5)) {
                    cjzVar.a = null;
                } else {
                    chm chmVar2 = this.c;
                    cll a7 = cll.a(alrVar);
                    aat.a(a7);
                    FirebaseAuth firebaseAuth2 = getInstance(chmVar2.f());
                    aat.a(a7);
                    aat.a(chmVar2);
                    cif cifVar6 = firebaseAuth2.b;
                    cgw cgwVar5 = firebaseAuth2.a;
                    a aVar4 = new a();
                    aat.a(cgwVar5);
                    aat.a(a7);
                    aat.a(chmVar2);
                    aat.a(aVar4);
                    List<String> c2 = chmVar2.c();
                    if (c2 != null && c2.contains(a7.a())) {
                        bwlVar = bwo.a((Exception) civ.a(new Status(17015)));
                    } else {
                        aat.a(cgwVar5);
                        aat.a(a7);
                        aat.a(chmVar2);
                        aat.a(aVar4);
                        cij cijVar = (cij) new cij(a7).a(cgwVar5).a(chmVar2).a((cjf<chi, cjq>) aVar4).a((clc) aVar4);
                        bwlVar = cifVar6.a(cifVar6.b(cijVar), cijVar);
                    }
                    cjzVar.a = bwlVar;
                }
                cjz.a(sharedPreferences);
            } else if (!sharedPreferences.contains("statusCode")) {
            } else {
                Status status = new Status(sharedPreferences.getInt("statusCode", 17062), sharedPreferences.getString("statusMessage", ""));
                cjzVar.b = sharedPreferences.getLong("timestamp", 0L);
                cjz.a(sharedPreferences);
                cjzVar.a = bwo.a((Exception) civ.a(status));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
        if (r3 == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.chm r6, defpackage.alf r7, boolean r8) {
        /*
            r5 = this;
            defpackage.aat.a(r6)
            defpackage.aat.a(r7)
            chm r0 = r5.c
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Le
        Lc:
            r1 = 1
            goto L34
        Le:
            alf r0 = r0.h()
            java.lang.String r0 = r0.b
            java.lang.String r3 = r7.b
            boolean r0 = r0.equals(r3)
            r0 = r0 ^ r2
            chm r3 = r5.c
            java.lang.String r3 = r3.a()
            java.lang.String r4 = r6.a()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L2f
            if (r0 != 0) goto L2f
            r0 = 0
            goto L30
        L2f:
            r0 = 1
        L30:
            r2 = r0
            if (r3 != 0) goto L34
            goto Lc
        L34:
            defpackage.aat.a(r6)
            chm r0 = r5.c
            if (r0 != 0) goto L3e
            r5.c = r6
            goto L5d
        L3e:
            java.util.List r3 = r6.d()
            r0.a(r3)
            boolean r0 = r6.b()
            if (r0 != 0) goto L50
            chm r0 = r5.c
            r0.e()
        L50:
            clu r0 = r6.l()
            java.util.List r0 = r0.a()
            chm r3 = r5.c
            r3.b(r0)
        L5d:
            if (r8 == 0) goto L66
            ckc r0 = r5.k
            chm r3 = r5.c
            r0.a(r3)
        L66:
            if (r2 == 0) goto L74
            chm r0 = r5.c
            if (r0 == 0) goto L6f
            r0.a(r7)
        L6f:
            chm r0 = r5.c
            r5.a(r0)
        L74:
            if (r1 == 0) goto L7b
            chm r0 = r5.c
            r5.b(r0)
        L7b:
            if (r8 == 0) goto L82
            ckc r8 = r5.k
            r8.a(r6, r7)
        L82:
            ckb r6 = r5.b()
            chm r7 = r5.c
            alf r7 = r7.h()
            r6.a(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.a(chm, alf, boolean):void");
    }

    private final synchronized void a(ckb ckbVar) {
        this.m = ckbVar;
    }

    private final synchronized ckb b() {
        if (this.m == null) {
            a(new ckb(this.a));
        }
        return this.m;
    }

    private final void a(chm chmVar) {
        if (chmVar != null) {
            String a2 = chmVar.a();
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 45);
            sb.append("Notifying id token listeners about user ( ");
            sb.append(a2);
            sb.append(" ).");
        }
        this.n.execute(new clp(this, new cox(chmVar != null ? chmVar.j() : null)));
    }

    private final void b(chm chmVar) {
        if (chmVar != null) {
            String a2 = chmVar.a();
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 47);
            sb.append("Notifying auth state listeners about user ( ");
            sb.append(a2);
            sb.append(" ).");
        }
        this.n.execute(new clo(this));
    }

    /* loaded from: classes.dex */
    class a extends b implements cjq, clc {
        a() {
            super();
        }

        @Override // defpackage.clc
        public final void a(Status status) {
            if (status.i == 17011 || status.i == 17021 || status.i == 17005) {
                FirebaseAuth.this.a();
            }
        }
    }

    public final void a() {
        chm chmVar = this.c;
        if (chmVar != null) {
            ckc ckcVar = this.k;
            aat.a(chmVar);
            ckcVar.a(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", chmVar.a()));
            this.c = null;
        }
        this.k.a("com.google.firebase.auth.FIREBASE_USER");
        a((chm) null);
        b((chm) null);
        ckb ckbVar = this.m;
        if (ckbVar != null) {
            ckbVar.a.b();
        }
    }
}
