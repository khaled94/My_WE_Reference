package defpackage;

import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* renamed from: anh  reason: default package */
/* loaded from: classes.dex */
final class anh extends bip {
    private final vw<Object> a;

    @Override // defpackage.biq
    public final void a(LocationAvailability locationAvailability) {
        this.a.a(new ang(locationAvailability));
    }

    @Override // defpackage.biq
    public final void a(LocationResult locationResult) {
        this.a.a(new anf(locationResult));
    }
}
