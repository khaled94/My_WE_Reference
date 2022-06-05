package defpackage;

import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: bhr  reason: default package */
/* loaded from: classes2.dex */
public final class bhr implements bgn {
    @Override // defpackage.bgn
    public final vg<bgp> a(vf vfVar, String... strArr) {
        aat.a(true, (Object) "placeIds == null");
        aat.a(true, (Object) "placeIds is empty");
        for (int i = 0; i <= 0; i++) {
            String str = strArr[0];
            aat.a(str != null, "placeId == null");
            aat.a(!str.isEmpty(), "placeId is empty");
        }
        return vfVar.a((vf) new bhs(bgs.a, vfVar, strArr));
    }

    @Override // defpackage.bgn
    public final vg<bgm> a(vf vfVar, String str, LatLngBounds latLngBounds, AutocompleteFilter autocompleteFilter) {
        return vfVar.a((vf) new bht(bgs.a, vfVar, str, latLngBounds, autocompleteFilter));
    }
}
