package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: aoa  reason: default package */
/* loaded from: classes.dex */
public final class aoa implements Parcelable.Creator<anz> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ anz createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        anx anxVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        int i = 1;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = SafeParcelReader.d(parcel, readInt);
            } else if (c == 2) {
                anxVar = (anx) SafeParcelReader.a(parcel, readInt, anx.CREATOR);
            } else if (c == 3) {
                iBinder = SafeParcelReader.h(parcel, readInt);
            } else if (c == 4) {
                iBinder2 = SafeParcelReader.h(parcel, readInt);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new anz(i, anxVar, iBinder, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ anz[] newArray(int i) {
        return new anz[i];
    }
}
