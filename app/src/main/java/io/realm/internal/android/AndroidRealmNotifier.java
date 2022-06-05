package io.realm.internal.android;

import android.os.Handler;
import android.os.Looper;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.RealmNotifier;

/* loaded from: classes2.dex */
public class AndroidRealmNotifier extends RealmNotifier {
    private Handler handler;

    public AndroidRealmNotifier(OsSharedRealm osSharedRealm, dky dkyVar) {
        super(osSharedRealm);
        if (dkyVar.a()) {
            this.handler = new Handler(Looper.myLooper());
        } else {
            this.handler = null;
        }
    }

    @Override // io.realm.internal.RealmNotifier
    public boolean post(Runnable runnable) {
        Handler handler = this.handler;
        return handler != null && handler.post(runnable);
    }
}
