package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: acv  reason: default package */
/* loaded from: classes.dex */
public final class acv implements Parcelable.Creator<acu> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ acu createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        Bundle bundle = null;
        uw[] uwVarArr = null;
        aag aagVar = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                bundle = SafeParcelReader.g(parcel, readInt);
            } else if (c == 2) {
                uwVarArr = (uw[]) SafeParcelReader.c(parcel, readInt, uw.CREATOR);
            } else if (c == 3) {
                i = SafeParcelReader.d(parcel, readInt);
            } else if (c == 4) {
                aagVar = (aag) SafeParcelReader.a(parcel, readInt, aag.CREATOR);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new acu(bundle, uwVarArr, i, aagVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ acu[] newArray(int i) {
        return new acu[i];
    }
}
