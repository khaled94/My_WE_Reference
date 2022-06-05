package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

/* renamed from: afc */
/* loaded from: classes.dex */
public final class afc {
    private static volatile acl e;
    private static Context g;
    static final afa a = new aeu(aey.a("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
    static final afa b = new aev(aey.a("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
    static final afa c = new aew(aey.a("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
    static final afa d = new aex(aey.a("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
    private static final Object f = new Object();

    public static afl a(String str, aey aeyVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return b(str, aeyVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [afn, android.os.IBinder] */
    public static afl a(String str, boolean z) {
        afl aflVar;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            aat.a(g);
            try {
                b();
                try {
                    afg a2 = e.a(new afd(str, z, false, afp.a(g), false));
                    if (a2.a) {
                        aflVar = afl.b();
                    } else {
                        String str2 = a2.b;
                        if (str2 == null) {
                            str2 = "error checking package certificate";
                        }
                        aflVar = aff.a(a2.c) == 4 ? afl.a(str2, new PackageManager.NameNotFoundException()) : afl.a(str2);
                    }
                } catch (RemoteException e2) {
                    aflVar = afl.a("module call", e2);
                }
            } catch (DynamiteModule.LoadingException e3) {
                String valueOf = String.valueOf(e3.getMessage());
                aflVar = afl.a(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), e3);
            }
            return aflVar;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static /* synthetic */ String a(boolean z, String str, aey aeyVar) throws Exception {
        String str2 = true != (!z && b(str, aeyVar, true, false).a) ? "not allowed" : "debug cert rejected";
        MessageDigest a2 = adu.a("SHA-1");
        aat.a(a2);
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", str2, str, aec.a(a2.digest(aeyVar.d())), Boolean.valueOf(z), "12451000.false");
    }

    public static synchronized void a(Context context) {
        synchronized (afc.class) {
            if (g == null) {
                if (context == null) {
                    return;
                }
                g = context.getApplicationContext();
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public static boolean a() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            b();
            boolean a2 = e.a();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return a2;
        } catch (RemoteException | DynamiteModule.LoadingException unused) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    private static afl b(final String str, final aey aeyVar, final boolean z, boolean z2) {
        try {
            b();
            aat.a(g);
            try {
                return e.a(new afi(str, aeyVar, z, z2), afp.a(g.getPackageManager())) ? afl.b() : new afk(new Callable() { // from class: aet
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return afc.a(z, str, aeyVar);
                    }
                });
            } catch (RemoteException e2) {
                return afl.a("module call", e2);
            }
        } catch (DynamiteModule.LoadingException e3) {
            String valueOf = String.valueOf(e3.getMessage());
            return afl.a(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), e3);
        }
    }

    private static void b() throws DynamiteModule.LoadingException {
        if (e != null) {
            return;
        }
        aat.a(g);
        synchronized (f) {
            if (e == null) {
                e = ack.a(DynamiteModule.a(g, DynamiteModule.e, "com.google.android.gms.googlecertificates").a("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
    }
}
