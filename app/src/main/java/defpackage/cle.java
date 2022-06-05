package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: cle  reason: default package */
/* loaded from: classes2.dex */
public final class cle implements Parcelable.Creator<clf> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ clf[] newArray(int i) {
        return new clf[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ clf createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = SafeParcelReader.l(parcel, readInt);
            } else if (c == 2) {
                str2 = SafeParcelReader.l(parcel, readInt);
            } else if (c == 3) {
                j = SafeParcelReader.f(parcel, readInt);
            } else if (c == 4) {
                str3 = SafeParcelReader.l(parcel, readInt);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new clf(str, str2, j, str3);
    }
}
