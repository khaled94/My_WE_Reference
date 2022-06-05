package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bsl  reason: default package */
/* loaded from: classes2.dex */
public final class bsl implements Application.ActivityLifecycleCallbacks {
    private final /* synthetic */ brs a;

    private bsl(brs brsVar) {
        this.a = brsVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
        if (r18.a.s().d(null, defpackage.blk.aC) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0188, code lost:
        r18.a.q().j.a("Activity created with data 'referrer' without required params");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0193, code lost:
        r18.a.h().a(r19, r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019c, code lost:
        return;
     */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivityCreated(android.app.Activity r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsl.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.a.h().d.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        bss h = this.a.h();
        bst a = h.a(activity);
        h.c = h.b;
        h.b = null;
        h.p().a(new bsu(h, a));
        bty j = this.a.j();
        j.p().a(new bud(j, j.l().b()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        bss h = this.a.h();
        h.a(activity, h.a(activity), false);
        bkz d = h.d();
        d.p().a(new bpc(d, d.l().b()));
        bty j = this.a.j();
        j.p().a(new bue(j, j.l().b()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        bst bstVar;
        bss h = this.a.h();
        if (bundle == null || (bstVar = h.d.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", bstVar.c);
        bundle2.putString("name", bstVar.a);
        bundle2.putString("referrer_name", bstVar.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ bsl(brs brsVar, byte b) {
        this(brsVar);
    }
}
