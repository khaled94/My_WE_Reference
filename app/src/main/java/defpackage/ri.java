package defpackage;

import android.content.ComponentName;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Lcom/facebook/login/CustomTabPrefetchHelper;", "Landroidx/browser/customtabs/CustomTabsServiceConnection;", "()V", "onCustomTabsServiceConnected", "", "name", "Landroid/content/ComponentName;", "newClient", "Landroidx/browser/customtabs/CustomTabsClient;", "onServiceDisconnected", "componentName", "Companion", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: ri */
/* loaded from: classes2.dex */
public final class ri extends CustomTabsServiceConnection {
    private static CustomTabsClient b;
    private static CustomTabsSession c;
    public static final a a = new a((byte) 0);
    private static final ReentrantLock d = new ReentrantLock();

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        dqc.d(componentName, "componentName");
    }

    public static final /* synthetic */ ReentrantLock a() {
        return d;
    }

    public static final /* synthetic */ void a(CustomTabsSession customTabsSession) {
        c = customTabsSession;
    }

    public static final /* synthetic */ CustomTabsSession b() {
        return c;
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        dqc.d(componentName, "name");
        dqc.d(customTabsClient, "newClient");
        customTabsClient.warmup(0L);
        b = customTabsClient;
        a.a();
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\u000bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/facebook/login/CustomTabPrefetchHelper$Companion;", "", "()V", "client", "Landroidx/browser/customtabs/CustomTabsClient;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "session", "Landroidx/browser/customtabs/CustomTabsSession;", "getPreparedSessionOnce", "mayLaunchUrl", "", "url", "Landroid/net/Uri;", "prepareSession", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: ri$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        static void a() {
            CustomTabsClient customTabsClient;
            ri.d.lock();
            if (ri.c == null && (customTabsClient = ri.b) != null) {
                ri.c = customTabsClient.newSession(null);
            }
            ri.d.unlock();
        }
    }

    public static final void a(Uri uri) {
        dqc.d(uri, "url");
        a.a();
        d.lock();
        CustomTabsSession customTabsSession = c;
        if (customTabsSession != null) {
            customTabsSession.mayLaunchUrl(uri, null, null);
        }
        d.unlock();
    }
}
