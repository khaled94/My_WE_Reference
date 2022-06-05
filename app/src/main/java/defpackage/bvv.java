package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: bvv  reason: default package */
/* loaded from: classes2.dex */
public final class bvv extends abb implements vi {
    public static final Parcelable.Creator<bvv> CREATOR = new bvw();
    private final List<String> a;
    private final String b;

    public bvv(List<String> list, String str) {
        this.a = list;
        this.b = str;
    }

    @Override // defpackage.vi
    public final Status a() {
        return this.b != null ? Status.a : Status.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.b(parcel, 1, this.a);
        abc.a(parcel, 2, this.b);
        abc.b(parcel, a);
    }
}
