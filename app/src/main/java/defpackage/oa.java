package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import defpackage.pr;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\bH\u0007J\b\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseManager;", "", "()V", "GOOGLE_BILLINGCLIENT_VERSION", "", "enabled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "enableAutoLogging", "", "startTracking", "usingBillingLib2Plus", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: oa  reason: default package */
/* loaded from: classes2.dex */
public final class oa {
    public static final oa a = new oa();
    private static final AtomicBoolean b = new AtomicBoolean(false);

    private oa() {
    }

    public static final void a() {
        if (qx.a(oa.class)) {
            return;
        }
        try {
            b.set(true);
            b();
        } catch (Throwable th) {
            qx.a(th, oa.class);
        }
    }

    public static final void b() {
        if (qx.a(oa.class)) {
            return;
        }
        try {
            if (!b.get()) {
                return;
            }
            if (a.c() && pr.a(pr.b.IapLoggingLib2)) {
                nw.a(ly.k());
            } else {
                nv.a();
            }
        } catch (Throwable th) {
            qx.a(th, oa.class);
        }
    }

    private final boolean c() {
        String string;
        if (qx.a(this)) {
            return false;
        }
        try {
            Context k = ly.k();
            ApplicationInfo applicationInfo = k.getPackageManager().getApplicationInfo(k.getPackageName(), 128);
            if (applicationInfo == null || (string = applicationInfo.metaData.getString("com.google.android.play.billingclient.version")) == null) {
                return false;
            }
            return Integer.parseInt((String) dsg.a(string, new String[]{"."}, 3, 2).get(0)) >= 2;
        } catch (Exception unused) {
        } catch (Throwable th) {
            qx.a(th, this);
        }
        return false;
    }
}
