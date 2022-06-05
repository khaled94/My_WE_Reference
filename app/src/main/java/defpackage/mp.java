package defpackage;

import android.preference.PreferenceManager;
import defpackage.mv;
import defpackage.na;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0007J\u0012\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/appevents/AnalyticsUserIDStore;", "", "()V", "ANALYTICS_USER_ID_KEY", "", "TAG", "initialized", "", "lock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "userID", "getUserID", "initAndWait", "", "initStore", "setUserID", "id", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: mp  reason: default package */
/* loaded from: classes2.dex */
public final class mp {
    private static final String b;
    private static String d;
    private static volatile boolean e;
    public static final mp a = new mp();
    private static final ReentrantReadWriteLock c = new ReentrantReadWriteLock();

    static {
        String simpleName = mp.class.getSimpleName();
        dqc.b(simpleName, "AnalyticsUserIDStore::class.java.simpleName");
        b = simpleName;
    }

    private mp() {
    }

    public static final void a() {
        if (e) {
            return;
        }
        na.a aVar = na.b;
        mv.a aVar2 = mv.b;
        if (mv.e() == null) {
            mv.a.c();
        }
        ScheduledThreadPoolExecutor e2 = mv.e();
        if (e2 != null) {
            e2.execute(a.a);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: mp$a */
    /* loaded from: classes2.dex */
    public static final class a implements Runnable {
        public static final a a = new a();

        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (qx.a(this)) {
                return;
            }
            try {
                mp mpVar = mp.a;
                mp.d();
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    public static final String b() {
        if (!e) {
            d();
        }
        c.readLock().lock();
        try {
            return d;
        } finally {
            c.readLock().unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d() {
        if (e) {
            return;
        }
        c.writeLock().lock();
        try {
            if (!e) {
                d = PreferenceManager.getDefaultSharedPreferences(ly.k()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
                e = true;
            }
        } finally {
            c.writeLock().unlock();
        }
    }
}
