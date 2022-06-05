package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.lang.ref.WeakReference;
import java.util.function.Predicate;

/* compiled from: lambda */
/* renamed from: androidx.core.location.-$$Lambda$LocationManagerCompat$LocationListenerTransport$jzfhrmQYliHWS5OSoND_VPGoB3Y  reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class $$Lambda$LocationManagerCompat$LocationListenerTransport$jzfhrmQYliHWS5OSoND_VPGoB3Y implements Predicate {
    public static final /* synthetic */ $$Lambda$LocationManagerCompat$LocationListenerTransport$jzfhrmQYliHWS5OSoND_VPGoB3Y INSTANCE = new $$Lambda$LocationManagerCompat$LocationListenerTransport$jzfhrmQYliHWS5OSoND_VPGoB3Y();

    private /* synthetic */ $$Lambda$LocationManagerCompat$LocationListenerTransport$jzfhrmQYliHWS5OSoND_VPGoB3Y() {
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return LocationManagerCompat.LocationListenerTransport.lambda$register$0((WeakReference) obj);
    }
}
