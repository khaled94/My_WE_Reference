package defpackage;

import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000f\u001a\u00020\u0010J\u001c\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u001a\u0010\f\u001a\u00020\u00122\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0014\u001a\u00020\u0010H\u0002R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/facebook/ProfileManager;", "", "localBroadcastManager", "Landroidx/localbroadcastmanager/content/LocalBroadcastManager;", "profileCache", "Lcom/facebook/ProfileCache;", "(Landroidx/localbroadcastmanager/content/LocalBroadcastManager;Lcom/facebook/ProfileCache;)V", "value", "Lcom/facebook/Profile;", "currentProfile", "getCurrentProfile", "()Lcom/facebook/Profile;", "setCurrentProfile", "(Lcom/facebook/Profile;)V", "currentProfileField", "loadCurrentProfile", "", "sendCurrentProfileChangedBroadcast", "", "oldProfile", "writeToCache", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: mi  reason: default package */
/* loaded from: classes2.dex */
public final class mi {
    public static final a c = new a((byte) 0);
    private static volatile mi e;
    mg a;
    final mh b;
    private final LocalBroadcastManager d;

    public mi(LocalBroadcastManager localBroadcastManager, mh mhVar) {
        dqc.d(localBroadcastManager, "localBroadcastManager");
        dqc.d(mhVar, "profileCache");
        this.d = localBroadcastManager;
        this.b = mhVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(mg mgVar, boolean z) {
        mg mgVar2 = this.a;
        this.a = mgVar;
        if (z) {
            if (mgVar != null) {
                this.b.a(mgVar);
            } else {
                this.b.b();
            }
        }
        if (!qi.a(mgVar2, mgVar)) {
            a(mgVar2, mgVar);
        }
    }

    private final void a(mg mgVar, mg mgVar2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", mgVar);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", mgVar2);
        this.d.sendBroadcast(intent);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/facebook/ProfileManager$Companion;", "", "()V", "ACTION_CURRENT_PROFILE_CHANGED", "", "EXTRA_NEW_PROFILE", "EXTRA_OLD_PROFILE", "instance", "Lcom/facebook/ProfileManager;", "getInstance", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: mi$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public final mi a() {
            if (mi.e == null) {
                synchronized (this) {
                    if (mi.e == null) {
                        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(ly.k());
                        dqc.b(localBroadcastManager, "LocalBroadcastManager.ge…tance(applicationContext)");
                        mi.e = new mi(localBroadcastManager, new mh());
                    }
                    dmg dmgVar = dmg.a;
                }
            }
            mi miVar = mi.e;
            if (miVar != null) {
                return miVar;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
    }
}
