package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: clt  reason: default package */
/* loaded from: classes2.dex */
public final class clt implements Parcelable.Creator<chq> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ chq[] newArray(int i) {
        return new chq[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ chq createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = SafeParcelReader.l(parcel, readInt);
            } else if (c == 2) {
                str2 = SafeParcelReader.l(parcel, readInt);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new chq(str, str2);
    }
}
