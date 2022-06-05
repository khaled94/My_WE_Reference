package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

/* renamed from: bhz  reason: default package */
/* loaded from: classes2.dex */
public final class bhz extends bcw implements bhx {
    /* JADX INFO: Access modifiers changed from: package-private */
    public bhz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.places.internal.IGooglePlacesService");
    }

    @Override // defpackage.bhx
    public final void a(List<String> list, bhk bhkVar, bia biaVar) throws RemoteException {
        Parcel a = a();
        a.writeStringList(list);
        bew.a(a, bhkVar);
        bew.a(a, biaVar);
        a(17, a);
    }

    @Override // defpackage.bhx
    public final void a(String str, LatLngBounds latLngBounds, AutocompleteFilter autocompleteFilter, bhk bhkVar, bia biaVar) throws RemoteException {
        Parcel a = a();
        a.writeString(str);
        bew.a(a, latLngBounds);
        a.writeInt(1);
        bew.a(a, autocompleteFilter);
        bew.a(a, bhkVar);
        bew.a(a, biaVar);
        a(28, a);
    }
}
