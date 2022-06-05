package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: afh  reason: default package */
/* loaded from: classes.dex */
public final class afh implements Parcelable.Creator<afg> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ afg createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        boolean z = false;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                z = SafeParcelReader.q(parcel, readInt);
            } else if (c == 2) {
                str = SafeParcelReader.l(parcel, readInt);
            } else if (c == 3) {
                i = SafeParcelReader.d(parcel, readInt);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new afg(z, str, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ afg[] newArray(int i) {
        return new afg[i];
    }
}
