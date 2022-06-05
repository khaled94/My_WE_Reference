package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.lang.ref.WeakReference;
import java.util.function.Predicate;

/* compiled from: lambda */
/* renamed from: androidx.core.location.-$$Lambda$LocationManagerCompat$LocationListenerTransport$zMh1sPVITlcw-eMtdIvv_D4_SCM  reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class $$Lambda$LocationManagerCompat$LocationListenerTransport$zMh1sPVITlcweMtdIvv_D4_SCM implements Predicate {
    public static final /* synthetic */ $$Lambda$LocationManagerCompat$LocationListenerTransport$zMh1sPVITlcweMtdIvv_D4_SCM INSTANCE = new $$Lambda$LocationManagerCompat$LocationListenerTransport$zMh1sPVITlcweMtdIvv_D4_SCM();

    private /* synthetic */ $$Lambda$LocationManagerCompat$LocationListenerTransport$zMh1sPVITlcweMtdIvv_D4_SCM() {
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return LocationManagerCompat.LocationListenerTransport.lambda$unregister$1((WeakReference) obj);
    }
}
