package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: afe  reason: default package */
/* loaded from: classes.dex */
public final class afe implements Parcelable.Creator<afd> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ afd createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = SafeParcelReader.l(parcel, readInt);
            } else if (c == 2) {
                z = SafeParcelReader.q(parcel, readInt);
            } else if (c == 3) {
                z2 = SafeParcelReader.q(parcel, readInt);
            } else if (c == 4) {
                iBinder = SafeParcelReader.h(parcel, readInt);
            } else if (c == 5) {
                z3 = SafeParcelReader.q(parcel, readInt);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new afd(str, z, z2, iBinder, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ afd[] newArray(int i) {
        return new afd[i];
    }
}
