package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class FirebaseInstanceId {
    public static cnt a;
    private static final long g = TimeUnit.HOURS.toSeconds(8);
    private static ScheduledThreadPoolExecutor h;
    public final Executor b;
    public final cgw c;
    public final cni d;
    public cmv e;
    public final cnn f;
    private final cnx i;
    private boolean j;
    private final a k;

    public static FirebaseInstanceId a() {
        return getInstance(cgw.d());
    }

    public static FirebaseInstanceId getInstance(cgw cgwVar) {
        return (FirebaseInstanceId) cgwVar.a(FirebaseInstanceId.class);
    }

    public FirebaseInstanceId(cgw cgwVar, cmt cmtVar, cpn cpnVar) {
        this(cgwVar, new cni(cgwVar.a()), cod.b(), cod.b(), cmtVar, cpnVar);
    }

    /* loaded from: classes.dex */
    public class a {
        private final boolean b = c();
        private final cmt c;
        private cmr<cgv> d;
        private Boolean e;

        a(cmt cmtVar) {
            FirebaseInstanceId.this = r2;
            this.c = cmtVar;
            Boolean b = b();
            this.e = b;
            if (b != null || !this.b) {
                return;
            }
            cmr<cgv> cmrVar = new cmr(this) { // from class: com
                private final FirebaseInstanceId.a a;

                {
                    this.a = this;
                }

                @Override // defpackage.cmr
                public final void a(cmq cmqVar) {
                    FirebaseInstanceId.a aVar = this.a;
                    synchronized (aVar) {
                        if (aVar.a()) {
                            FirebaseInstanceId.b(FirebaseInstanceId.this);
                        }
                    }
                }
            };
            this.d = cmrVar;
            cmtVar.a(cgv.class, cmrVar);
        }

        public final synchronized boolean a() {
            if (this.e != null) {
                return this.e.booleanValue();
            }
            return this.b && FirebaseInstanceId.this.c.e();
        }

        private final Boolean b() {
            ApplicationInfo applicationInfo;
            Context a = FirebaseInstanceId.this.c.a();
            SharedPreferences sharedPreferences = a.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = a.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(a.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled")) {
                    return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                }
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        private final boolean c() {
            try {
                Class.forName("coy");
                return true;
            } catch (ClassNotFoundException unused) {
                Context a = FirebaseInstanceId.this.c.a();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(a.getPackageName());
                ResolveInfo resolveService = a.getPackageManager().resolveService(intent, 0);
                return (resolveService == null || resolveService.serviceInfo == null) ? false : true;
            }
        }
    }

    private FirebaseInstanceId(cgw cgwVar, cni cniVar, Executor executor, Executor executor2, cmt cmtVar, cpn cpnVar) {
        this.j = false;
        if (cni.a(cgwVar) == null) {
            throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        }
        synchronized (FirebaseInstanceId.class) {
            if (a == null) {
                a = new cnt(cgwVar.a());
            }
        }
        this.c = cgwVar;
        this.d = cniVar;
        if (this.e == null) {
            cmv cmvVar = (cmv) cgwVar.a(cmv.class);
            if (cmvVar != null && cmvVar.a()) {
                this.e = cmvVar;
            } else {
                this.e = new con(cgwVar, cniVar, executor, cpnVar);
            }
        }
        this.e = this.e;
        this.b = executor2;
        this.i = new cnx(a);
        this.k = new a(cmtVar);
        this.f = new cnn(executor);
        if (!this.k.a()) {
            return;
        }
        b();
    }

    public final void b() {
        if (a(f()) || this.i.a()) {
            c();
        }
    }

    public final synchronized void a(boolean z) {
        this.j = z;
    }

    public final synchronized void c() {
        if (!this.j) {
            a(0L);
        }
    }

    public final synchronized void a(long j) {
        a(new cnv(this, this.i, Math.min(Math.max(30L, j << 1), g)), j);
        this.j = true;
    }

    public static void a(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (h == null) {
                h = new ScheduledThreadPoolExecutor(1, new aei("FirebaseInstanceId"));
            }
            h.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    public static String d() {
        return cni.a(a.b("").a);
    }

    public final bwl<cmu> e() {
        return a(cni.a(this.c), "*");
    }

    public final bwl<cmu> a(String str, String str2) {
        return bwo.a((Object) null).b(this.b, new bwf(this, str, a(str2)) { // from class: cok
            private final FirebaseInstanceId a;
            private final String b;
            private final String c;

            {
                this.a = this;
                this.b = str;
                this.c = r3;
            }

            @Override // defpackage.bwf
            public final Object a(bwl bwlVar) {
                final FirebaseInstanceId firebaseInstanceId = this.a;
                final String str3 = this.b;
                final String str4 = this.c;
                final String d = FirebaseInstanceId.d();
                cns b = FirebaseInstanceId.b(str3, str4);
                if (!firebaseInstanceId.a(b)) {
                    return bwo.a(new cou(d, b.a));
                }
                final String a2 = cns.a(b);
                return firebaseInstanceId.f.a(str3, str4, new cnp(firebaseInstanceId, d, a2, str3, str4) { // from class: coj
                    private final FirebaseInstanceId a;
                    private final String b;
                    private final String c;
                    private final String d;
                    private final String e;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.a = firebaseInstanceId;
                        this.b = d;
                        this.c = a2;
                        this.d = str3;
                        this.e = str4;
                    }

                    @Override // defpackage.cnp
                    public final bwl a() {
                        final FirebaseInstanceId firebaseInstanceId2 = this.a;
                        final String str5 = this.b;
                        final String str6 = this.d;
                        final String str7 = this.e;
                        return firebaseInstanceId2.e.a(str5, str6, str7).a(firebaseInstanceId2.b, new bwk(firebaseInstanceId2, str6, str7, str5) { // from class: col
                            private final FirebaseInstanceId a;
                            private final String b;
                            private final String c;
                            private final String d;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.a = firebaseInstanceId2;
                                this.b = str6;
                                this.c = str7;
                                this.d = str5;
                            }

                            @Override // defpackage.bwk
                            public final bwl a(Object obj) {
                                FirebaseInstanceId firebaseInstanceId3 = this.a;
                                String str8 = this.b;
                                String str9 = this.c;
                                String str10 = this.d;
                                String str11 = (String) obj;
                                FirebaseInstanceId.a.a("", str8, str9, str11, firebaseInstanceId3.d.b());
                                return bwo.a(new cou(str10, str11));
                            }
                        });
                    }
                });
            }
        });
    }

    public final cns f() {
        return b(cni.a(this.c), "*");
    }

    public static cns b(String str, String str2) {
        return a.a("", str, str2);
    }

    public final <T> T a(bwl<T> bwlVar) throws IOException {
        try {
            return (T) bwo.a(bwlVar, 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    h();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        }
    }

    public static boolean g() {
        if (!Log.isLoggable("FirebaseInstanceId", 3)) {
            return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3);
        }
        return true;
    }

    public final synchronized void h() {
        a.b();
        if (this.k.a()) {
            c();
        }
    }

    private static String a(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    public final boolean a(cns cnsVar) {
        return cnsVar == null || cnsVar.b(this.d.b());
    }

    public static /* synthetic */ void b(FirebaseInstanceId firebaseInstanceId) {
        firebaseInstanceId.b();
    }
}
