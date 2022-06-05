package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: bll  reason: default package */
/* loaded from: classes2.dex */
public final class bll implements Parcelable.Creator<bli> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bli[] newArray(int i) {
        return new bli[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bli createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        blh blhVar = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = SafeParcelReader.l(parcel, readInt);
            } else if (c == 3) {
                blhVar = (blh) SafeParcelReader.a(parcel, readInt, blh.CREATOR);
            } else if (c == 4) {
                str2 = SafeParcelReader.l(parcel, readInt);
            } else if (c == 5) {
                j = SafeParcelReader.f(parcel, readInt);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new bli(str, blhVar, str2, j);
    }
}
