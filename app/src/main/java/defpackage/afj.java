package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: afj  reason: default package */
/* loaded from: classes.dex */
public final class afj implements Parcelable.Creator<afi> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ afi createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        boolean z = false;
        String str = null;
        IBinder iBinder = null;
        boolean z2 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = SafeParcelReader.l(parcel, readInt);
            } else if (c == 2) {
                iBinder = SafeParcelReader.h(parcel, readInt);
            } else if (c == 3) {
                z = SafeParcelReader.q(parcel, readInt);
            } else if (c == 4) {
                z2 = SafeParcelReader.q(parcel, readInt);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new afi(str, iBinder, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ afi[] newArray(int i) {
        return new afi[i];
    }
}
