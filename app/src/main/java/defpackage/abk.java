package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: abk  reason: default package */
/* loaded from: classes.dex */
public final class abk implements Parcelable.Creator<aae> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ aae createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = SafeParcelReader.d(parcel, readInt);
            } else if (c == 2) {
                str = SafeParcelReader.l(parcel, readInt);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new aae(i, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ aae[] newArray(int i) {
        return new aae[i];
    }
}
