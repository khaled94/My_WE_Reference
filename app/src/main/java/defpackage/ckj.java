package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: ckj  reason: default package */
/* loaded from: classes2.dex */
public final class ckj implements Parcelable.Creator<ckk> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ckk[] newArray(int i) {
        return new ckk[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ckk createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        ckq ckqVar = null;
        cki ckiVar = null;
        cll cllVar = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                ckqVar = (ckq) SafeParcelReader.a(parcel, readInt, ckq.CREATOR);
            } else if (c == 2) {
                ckiVar = (cki) SafeParcelReader.a(parcel, readInt, cki.CREATOR);
            } else if (c == 3) {
                cllVar = (cll) SafeParcelReader.a(parcel, readInt, cll.CREATOR);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new ckk(ckqVar, ckiVar, cllVar);
    }
}
