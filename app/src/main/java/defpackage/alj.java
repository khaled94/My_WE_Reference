package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: alj  reason: default package */
/* loaded from: classes.dex */
public final class alj implements Parcelable.Creator<alg> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ alg[] newArray(int i) {
        return new alg[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ alg createFromParcel(Parcel parcel) {
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
                str3 = SafeParcelReader.l(parcel, readInt);
            } else if (c == 4) {
                j = SafeParcelReader.f(parcel, readInt);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new alg(str, str2, str3, j);
    }
}
