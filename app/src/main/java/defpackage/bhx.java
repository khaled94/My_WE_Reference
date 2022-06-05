package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

/* renamed from: bhx  reason: default package */
/* loaded from: classes2.dex */
public interface bhx extends IInterface {
    void a(String str, LatLngBounds latLngBounds, AutocompleteFilter autocompleteFilter, bhk bhkVar, bia biaVar) throws RemoteException;

    void a(List<String> list, bhk bhkVar, bia biaVar) throws RemoteException;
}
