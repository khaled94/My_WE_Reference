package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsSession;
import defpackage.ri;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003R\u001a\u0010\u0007\u001a\u00020\bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/facebook/internal/CustomTab;", "", "action", "", "parameters", "Landroid/os/Bundle;", "(Ljava/lang/String;Landroid/os/Bundle;)V", "uri", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "openCustomTab", "", "activity", "Landroid/app/Activity;", "packageName", "Companion", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: pk  reason: default package */
/* loaded from: classes2.dex */
public class pk {
    public static final a b = new a((byte) 0);
    Uri a;

    public static Uri a(String str, Bundle bundle) {
        if (qx.a(pk.class)) {
            return null;
        }
        try {
            return a.a(str, bundle);
        } catch (Throwable th) {
            qx.a(th, pk.class);
            return null;
        }
    }

    public pk(String str, Bundle bundle) {
        dqc.d(str, "action");
        this.a = a.a(str, bundle == null ? new Bundle() : bundle);
    }

    public final boolean a(Activity activity, String str) {
        if (qx.a(this)) {
            return false;
        }
        try {
            dqc.d(activity, "activity");
            ri.a aVar = ri.a;
            ri.a().lock();
            CustomTabsSession b2 = ri.b();
            ri.a((CustomTabsSession) null);
            ri.a().unlock();
            CustomTabsIntent build = new CustomTabsIntent.Builder(b2).build();
            build.intent.setPackage(str);
            try {
                build.launchUrl(activity, this.a);
                return true;
            } catch (ActivityNotFoundException unused) {
                return false;
            }
        } catch (Throwable th) {
            qx.a(th, this);
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0017¨\u0006\t"}, d2 = {"Lcom/facebook/internal/CustomTab$Companion;", "", "()V", "getURIForAction", "Landroid/net/Uri;", "action", "", "parameters", "Landroid/os/Bundle;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: pk$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static Uri a(String str, Bundle bundle) {
            dqc.d(str, "action");
            String e = qg.e();
            return qi.a(e, ly.e() + "/dialog/" + str, bundle);
        }
    }
}
