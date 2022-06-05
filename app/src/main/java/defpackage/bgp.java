package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

@Deprecated
/* renamed from: bgp  reason: default package */
/* loaded from: classes2.dex */
public final class bgp extends zu<bgo> implements vi {
    private final Status b;
    private final String c;

    public bgp(DataHolder dataHolder) {
        super(dataHolder);
        this.b = bgu.b(dataHolder.d);
        if (dataHolder != null && dataHolder.e != null) {
            this.c = dataHolder.e.getString("com.google.android.gms.location.places.PlaceBuffer.ATTRIBUTIONS_EXTRA_KEY");
        } else {
            this.c = null;
        }
    }

    /* renamed from: b */
    public final bgo a(int i) {
        return new bhi(this.a, i);
    }

    @Override // defpackage.vi
    public final Status a() {
        return this.b;
    }
}
