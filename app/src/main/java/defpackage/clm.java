package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: clm  reason: default package */
/* loaded from: classes2.dex */
public final class clm implements Parcelable.Creator<chj> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ chj[] newArray(int i) {
        return new chj[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ chj createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z = false;
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
                str4 = SafeParcelReader.l(parcel, readInt);
            } else if (c == 5) {
                z = SafeParcelReader.q(parcel, readInt);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new chj(str, str2, str3, str4, z);
    }
}
