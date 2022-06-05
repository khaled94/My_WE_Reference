package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Process;

/* renamed from: aeo  reason: default package */
/* loaded from: classes.dex */
public final class aeo {
    protected final Context a;

    public aeo(Context context) {
        this.a = context;
    }

    public final int a(String str) {
        return this.a.checkCallingOrSelfPermission(str);
    }

    public final ApplicationInfo a(String str, int i) throws PackageManager.NameNotFoundException {
        return this.a.getPackageManager().getApplicationInfo(str, i);
    }

    public final boolean a() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return aen.a(this.a);
        }
        if (aee.d() && (nameForUid = this.a.getPackageManager().getNameForUid(Binder.getCallingUid())) != null) {
            return this.a.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }

    public final PackageInfo b(String str, int i) throws PackageManager.NameNotFoundException {
        return this.a.getPackageManager().getPackageInfo(str, i);
    }

    public final CharSequence b(String str) throws PackageManager.NameNotFoundException {
        return this.a.getPackageManager().getApplicationLabel(this.a.getPackageManager().getApplicationInfo(str, 0));
    }

    public final boolean a(int i, String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.a.getSystemService("appops");
                if (appOpsManager == null) {
                    throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
                }
                appOpsManager.checkPackage(i, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
