package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: tq  reason: default package */
/* loaded from: classes2.dex */
public final class tq implements Parcelable.Creator<tn> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ tn createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        int i = 0;
        Bundle bundle = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = SafeParcelReader.d(parcel, readInt);
            } else if (c == 2) {
                i2 = SafeParcelReader.d(parcel, readInt);
            } else if (c == 3) {
                bundle = SafeParcelReader.g(parcel, readInt);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new tn(i, i2, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ tn[] newArray(int i) {
        return new tn[i];
    }
}
