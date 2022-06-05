package defpackage;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;

/* renamed from: aqn  reason: default package */
/* loaded from: classes.dex */
public final class aqn {
    private static volatile aqz<Boolean> a = aqz.c();
    private static final Object b = new Object();

    private static boolean a(Context context) {
        return (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0;
    }

    public static boolean a(Context context, Uri uri) {
        boolean z;
        ProviderInfo resolveContentProvider;
        String authority = uri.getAuthority();
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            StringBuilder sb = new StringBuilder(String.valueOf(authority).length() + 91);
            sb.append(authority);
            sb.append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            throw new IllegalArgumentException(sb.toString());
        } else if (a.a()) {
            return a.b().booleanValue();
        } else {
            synchronized (b) {
                if (a.a()) {
                    return a.b().booleanValue();
                }
                boolean z2 = false;
                if (!"com.google.android.gms".equals(context.getPackageName()) && ((resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 0)) == null || !"com.google.android.gms".equals(resolveContentProvider.packageName))) {
                    z = false;
                    if (z && a(context)) {
                        z2 = true;
                    }
                    a = aqz.a(Boolean.valueOf(z2));
                    return a.b().booleanValue();
                }
                z = true;
                if (z) {
                    z2 = true;
                }
                a = aqz.a(Boolean.valueOf(z2));
                return a.b().booleanValue();
            }
        }
    }
}
