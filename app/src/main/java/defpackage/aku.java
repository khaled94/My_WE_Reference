package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: aku  reason: default package */
/* loaded from: classes.dex */
public final class aku implements Parcelable.Creator<akv> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ akv[] newArray(int i) {
        return new akv[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ akv createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        chj chjVar = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if (((char) readInt) == 1) {
                chjVar = (chj) SafeParcelReader.a(parcel, readInt, chj.CREATOR);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new akv(chjVar);
    }
}
