package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(d1 = {"kotlinx/coroutines/channels/ChannelsKt__ChannelsKt", "kotlinx/coroutines/channels/ChannelsKt__Channels_commonKt", "kotlinx/coroutines/channels/ChannelsKt__DeprecatedKt"}, k = 4, mv = {1, 5, 1}, xi = 48)
/* renamed from: dwu  reason: default package */
/* loaded from: classes2.dex */
public final class dwu {
    public static final void a(dxc<?> dxcVar, Throwable th) {
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = dux.a("Channel was consumed, consumer had failed", th);
            }
        }
        dxcVar.a(cancellationException);
    }
}
