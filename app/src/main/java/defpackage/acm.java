package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* renamed from: acm  reason: default package */
/* loaded from: classes.dex */
public final class acm {
    private static final Object a = new Object();
    private static boolean b;
    private static String c;
    private static int d;

    public static int a(Context context) {
        c(context);
        return d;
    }

    public static String b(Context context) {
        c(context);
        return c;
    }

    private static void c(Context context) {
        Bundle bundle;
        synchronized (a) {
            if (b) {
                return;
            }
            b = true;
            try {
                bundle = aep.a(context).a(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("MetadataValueReader", "This should never happen.", e);
            }
            if (bundle == null) {
                return;
            }
            c = bundle.getString("com.google.app.id");
            d = bundle.getInt("com.google.android.gms.version");
        }
    }
}
