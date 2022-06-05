package defpackage;

import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import java.util.Map;

/* renamed from: zb  reason: default package */
/* loaded from: classes2.dex */
public final class zb {
    final ArrayMap<vo<?>, ConnectionResult> a;
    private final ArrayMap<vo<?>, String> b;
    private final bwm<Map<vo<?>, String>> c;
    private int d;
    private boolean e;

    public final void a(vo<?> voVar, ConnectionResult connectionResult, String str) {
        this.a.put(voVar, connectionResult);
        this.b.put(voVar, str);
        this.d--;
        if (!connectionResult.b()) {
            this.e = true;
        }
        if (this.d == 0) {
            if (this.e) {
                this.c.a(new AvailabilityException(this.a));
                return;
            }
            this.c.a((bwm<Map<vo<?>, String>>) this.b);
        }
    }
}
