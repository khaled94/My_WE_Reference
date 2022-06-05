package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;

/* renamed from: uy  reason: default package */
/* loaded from: classes2.dex */
public class uy {
    public static final int b = uz.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    private static final uy a = new uy();

    public static uy b() {
        return a;
    }

    public static int c(Context context) {
        return uz.getApkVersion(context);
    }

    public static boolean c(Context context, int i) {
        return uz.isPlayServicesPossiblyUpdating(context, i);
    }

    public static void d(Context context) {
        uz.cancelAvailabilityErrorNotifications(context);
    }

    public static void e(Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        uz.ensurePlayServicesAvailable(context, uz.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public int a(Context context) {
        return a(context, b);
    }

    public PendingIntent a(Context context, int i, int i2) {
        return a(context, i, i2, null);
    }

    public String a(int i) {
        return uz.getErrorString(i);
    }

    public boolean b(int i) {
        return uz.isUserRecoverableError(i);
    }

    public int a(Context context, int i) {
        int isGooglePlayServicesAvailable = uz.isGooglePlayServicesAvailable(context, i);
        if (uz.isPlayServicesPossiblyUpdating(context, isGooglePlayServicesAvailable)) {
            return 18;
        }
        return isGooglePlayServicesAvailable;
    }

    public final PendingIntent a(Context context, int i, int i2, String str) {
        Intent a2 = a(context, i, str);
        if (a2 == null) {
            return null;
        }
        return aix.a(context, i2, a2, aix.a | 134217728);
    }

    public Intent a(Context context, int i, String str) {
        if (i != 1 && i != 2) {
            if (i == 3) {
                return add.b();
            }
            return null;
        } else if (context == null || !aeb.c(context)) {
            StringBuilder sb = new StringBuilder();
            sb.append("gcore_");
            sb.append(b);
            sb.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            sb.append("-");
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append("-");
            if (context != null) {
                try {
                    sb.append(aep.a(context).b(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return add.a(sb.toString());
        } else {
            return add.a();
        }
    }
}
