package defpackage;

import android.os.RemoteException;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.maps.model.LatLngBounds;
import defpackage.bik;
import defpackage.vc;
import java.util.Arrays;

/* renamed from: bht  reason: default package */
/* loaded from: classes2.dex */
final class bht extends bik.b<bhu> {
    private final /* synthetic */ String g;
    private final /* synthetic */ LatLngBounds h;
    private final /* synthetic */ AutocompleteFilter i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bht(vc vcVar, vf vfVar, String str, LatLngBounds latLngBounds, AutocompleteFilter autocompleteFilter) {
        super(vcVar, vfVar);
        this.g = str;
        this.h = latLngBounds;
        this.i = autocompleteFilter;
    }

    @Override // defpackage.vq.a
    public final /* synthetic */ void a(vc.b bVar) throws RemoteException {
        bhu bhuVar = (bhu) bVar;
        bik bikVar = new bik(this);
        String str = this.g;
        LatLngBounds latLngBounds = this.h;
        AutocompleteFilter autocompleteFilter = this.i;
        aat.a(bikVar, "callback == null");
        if (str == null) {
            str = "";
        }
        String str2 = str;
        if (autocompleteFilter == null) {
            AutocompleteFilter.a aVar = new AutocompleteFilter.a();
            autocompleteFilter = new AutocompleteFilter(1, false, Arrays.asList(Integer.valueOf(aVar.a)), aVar.b);
        }
        ((bhx) bhuVar.q()).a(str2, latLngBounds, autocompleteFilter, bhuVar.a, bikVar);
    }
}
