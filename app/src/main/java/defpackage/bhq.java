package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: bhq  reason: default package */
/* loaded from: classes2.dex */
public final class bhq implements Parcelable.Creator<bhg> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bhg[] newArray(int i) {
        return new bhg[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bhg createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = SafeParcelReader.d(parcel, readInt);
            } else if (c == 2) {
                i2 = SafeParcelReader.d(parcel, readInt);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new bhg(i, i2);
    }
}
