package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: blj  reason: default package */
/* loaded from: classes2.dex */
public final class blj implements Parcelable.Creator<blh> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ blh[] newArray(int i) {
        return new blh[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ blh createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if (((char) readInt) == 2) {
                bundle = SafeParcelReader.g(parcel, readInt);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new blh(bundle);
    }
}
