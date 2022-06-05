package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: ks  reason: default package */
/* loaded from: classes2.dex */
public final class ks {
    private static final ConcurrentMap<String, ck> a = new ConcurrentHashMap();

    public static ck a(Context context) {
        String str;
        String packageName = context.getPackageName();
        ck ckVar = a.get(packageName);
        if (ckVar == null) {
            PackageInfo b = b(context);
            if (b != null) {
                str = String.valueOf(b.versionCode);
            } else {
                str = UUID.randomUUID().toString();
            }
            ku kuVar = new ku(str);
            ck putIfAbsent = a.putIfAbsent(packageName, kuVar);
            return putIfAbsent == null ? kuVar : putIfAbsent;
        }
        return ckVar;
    }

    private static PackageInfo b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            new StringBuilder("Cannot resolve info for").append(context.getPackageName());
            return null;
        }
    }

    private ks() {
    }
}
