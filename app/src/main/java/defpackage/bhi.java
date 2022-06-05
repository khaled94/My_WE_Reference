package defpackage;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.maps.model.LatLng;
import java.util.Collections;
import java.util.List;

/* renamed from: bhi  reason: default package */
/* loaded from: classes2.dex */
public final class bhi extends bhm implements bgo {
    private final String c = a("place_id", "");
    private final bha d;

    public bhi(DataHolder dataHolder, int i) {
        super(dataHolder, i);
        bha bhaVar = null;
        String str = null;
        if (d().size() > 0 || (c() != null && c().length() > 0) || ((e() != null && !e().equals(Uri.EMPTY)) || h("place_rating") >= 0.0f || i("place_price_level") >= 0)) {
            bhaVar = new bha(d(), c() != null ? c().toString() : str, e(), h("place_rating"), i("place_price_level"));
        }
        this.d = bhaVar;
    }

    @Override // defpackage.bgo
    public final LatLng b() {
        Parcelable.Creator<LatLng> creator = LatLng.CREATOR;
        byte[] g = super.g("place_lat_lng");
        return (LatLng) (g == null ? null : abe.a(g, creator));
    }

    @Override // defpackage.bgo
    public final CharSequence a() {
        return a("place_name", "");
    }

    private CharSequence c() {
        return a("place_phone_number", "");
    }

    private List<Integer> d() {
        return a("place_types", Collections.emptyList());
    }

    private Uri e() {
        String a = a("place_website_uri", (String) null);
        if (a == null) {
            return null;
        }
        return Uri.parse(a);
    }
}
