package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* renamed from: iz  reason: default package */
/* loaded from: classes2.dex */
final class iz implements ComponentCallbacks2, jb {
    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(20);
    }
}
