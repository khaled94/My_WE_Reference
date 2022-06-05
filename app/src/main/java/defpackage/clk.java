package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: clk  reason: default package */
/* loaded from: classes2.dex */
public final class clk implements Parcelable.Creator<cll> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ cll[] newArray(int i) {
        return new cll[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ cll createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        alr alrVar = null;
        String str4 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = SafeParcelReader.l(parcel, readInt);
            } else if (c == 2) {
                str2 = SafeParcelReader.l(parcel, readInt);
            } else if (c == 3) {
                str3 = SafeParcelReader.l(parcel, readInt);
            } else if (c == 4) {
                alrVar = (alr) SafeParcelReader.a(parcel, readInt, alr.CREATOR);
            } else if (c == 5) {
                str4 = SafeParcelReader.l(parcel, readInt);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new cll(str, str2, str3, alrVar, str4);
    }
}
