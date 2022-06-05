package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: acf  reason: default package */
/* loaded from: classes.dex */
public final class acf implements Parcelable.Creator<ace> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ace createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        IBinder iBinder = null;
        ConnectionResult connectionResult = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = SafeParcelReader.d(parcel, readInt);
            } else if (c == 2) {
                iBinder = SafeParcelReader.h(parcel, readInt);
            } else if (c == 3) {
                connectionResult = (ConnectionResult) SafeParcelReader.a(parcel, readInt, ConnectionResult.CREATOR);
            } else if (c == 4) {
                z = SafeParcelReader.q(parcel, readInt);
            } else if (c == 5) {
                z2 = SafeParcelReader.q(parcel, readInt);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new ace(i, iBinder, connectionResult, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ace[] newArray(int i) {
        return new ace[i];
    }
}
