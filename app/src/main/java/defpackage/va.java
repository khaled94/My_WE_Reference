package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

/* renamed from: va  reason: default package */
/* loaded from: classes2.dex */
public class va {
    private static va b;
    public final Context a;
    private volatile String c;

    private va(Context context) {
        this.a = context.getApplicationContext();
    }

    private static aey a(PackageInfo packageInfo, aey... aeyVarArr) {
        if (packageInfo.signatures != null && packageInfo.signatures.length == 1) {
            aez aezVar = new aez(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < aeyVarArr.length; i++) {
                if (aeyVarArr[i].equals(aezVar)) {
                    return aeyVarArr[i];
                }
            }
            return null;
        }
        return null;
    }

    private final afl a(String str) {
        afl a;
        if (str == null) {
            return afl.a("null pkg");
        }
        if (!str.equals(this.c)) {
            if (afc.a()) {
                a = afc.a(str, uz.honorsDebugCertificates(this.a));
            } else {
                try {
                    PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(str, 64);
                    boolean honorsDebugCertificates = uz.honorsDebugCertificates(this.a);
                    if (packageInfo == null) {
                        a = afl.a("null pkg");
                    } else if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
                        a = afl.a("single cert required");
                    } else {
                        aez aezVar = new aez(packageInfo.signatures[0].toByteArray());
                        String str2 = packageInfo.packageName;
                        afl a2 = afc.a(str2, aezVar, honorsDebugCertificates, false);
                        a = (!a2.a || packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 2) == 0 || !afc.a(str2, aezVar, false, true).a) ? a2 : afl.a("debuggable release cert app rejected");
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    return afl.a(str.length() != 0 ? "no pkg ".concat(str) : new String("no pkg "), e);
                }
            }
            if (a.a) {
                this.c = str;
            }
            return a;
        }
        return afl.b();
    }

    public static va a(Context context) {
        aat.a(context);
        synchronized (va.class) {
            if (b == null) {
                afc.a(context);
                b = new va(context);
            }
        }
        return b;
    }

    public static final boolean a(PackageInfo packageInfo, boolean z) {
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? a(packageInfo, afb.a) : a(packageInfo, afb.a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(int i) {
        afl aflVar;
        int length;
        String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            aflVar = null;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    aflVar = a(packagesForUid[i2]);
                    if (aflVar.a) {
                        break;
                    }
                    i2++;
                } else {
                    aat.a(aflVar);
                    break;
                }
            }
        } else {
            aflVar = afl.a("no pkgs");
        }
        if (!aflVar.a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (aflVar.c != null) {
                aflVar.a();
            } else {
                aflVar.a();
            }
        }
        return aflVar.a;
    }
}
