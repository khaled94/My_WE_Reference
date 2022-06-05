package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: cpg  reason: default package */
/* loaded from: classes2.dex */
public final class cpg implements Parcelable.Creator<cpa> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ cpa[] newArray(int i) {
        return new cpa[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ cpa createFromParcel(Parcel parcel) {
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
        return new cpa(bundle);
    }
}
