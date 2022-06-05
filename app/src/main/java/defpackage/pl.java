package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import androidx.browser.customtabs.CustomTabsService;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0007J\b\u0010\b\u001a\u00020\u0005H\u0007J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0007R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/facebook/internal/CustomTabUtils;", "", "()V", "CHROME_PACKAGES", "", "", "[Ljava/lang/String;", "getChromePackage", "getDefaultRedirectURI", "getValidRedirectURI", "developerDefinedRedirectURI", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: pl  reason: default package */
/* loaded from: classes2.dex */
public final class pl {
    public static final pl a = new pl();
    private static final String[] b = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    private pl() {
    }

    private static String b() {
        if (qx.a(pl.class)) {
            return null;
        }
        try {
            return "fbconnect://cct." + ly.k().getPackageName();
        } catch (Throwable th) {
            qx.a(th, pl.class);
            return null;
        }
    }

    public static final String a(String str) {
        if (qx.a(pl.class)) {
            return null;
        }
        try {
            dqc.d(str, "developerDefinedRedirectURI");
            return qj.a(ly.k(), str) ? str : qj.a(ly.k(), b()) ? b() : "";
        } catch (Throwable th) {
            qx.a(th, pl.class);
            return null;
        }
    }

    public static final String a() {
        if (qx.a(pl.class)) {
            return null;
        }
        try {
            Context k = ly.k();
            List<ResolveInfo> queryIntentServices = k.getPackageManager().queryIntentServices(new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION), 0);
            if (queryIntentServices != null) {
                String[] strArr = b;
                dqc.d(strArr, "$this$toHashSet");
                HashSet hashSet = (HashSet) dmj.a((Object[]) strArr, new HashSet(dnh.a(strArr.length)));
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                        return serviceInfo.packageName;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            qx.a(th, pl.class);
            return null;
        }
    }
}
