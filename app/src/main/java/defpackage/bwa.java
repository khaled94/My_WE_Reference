package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: bwa  reason: default package */
/* loaded from: classes2.dex */
public final class bwa implements Parcelable.Creator<bvz> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bvz createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        ConnectionResult connectionResult = null;
        ace aceVar = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = SafeParcelReader.d(parcel, readInt);
            } else if (c == 2) {
                connectionResult = (ConnectionResult) SafeParcelReader.a(parcel, readInt, ConnectionResult.CREATOR);
            } else if (c == 3) {
                aceVar = (ace) SafeParcelReader.a(parcel, readInt, ace.CREATOR);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new bvz(i, connectionResult, aceVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bvz[] newArray(int i) {
        return new bvz[i];
    }
}
