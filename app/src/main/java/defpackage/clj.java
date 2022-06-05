package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import defpackage.cht;

/* renamed from: clj  reason: default package */
/* loaded from: classes2.dex */
public final class clj implements Parcelable.Creator<cht.a> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ cht.a[] newArray(int i) {
        return new cht.a[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ cht.a createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        while (parcel.dataPosition() < a) {
            SafeParcelReader.p(parcel, parcel.readInt());
        }
        SafeParcelReader.o(parcel, a);
        return new cht.a();
    }
}
