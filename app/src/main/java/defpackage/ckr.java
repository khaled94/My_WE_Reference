package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: ckr  reason: default package */
/* loaded from: classes2.dex */
public final class ckr implements Parcelable.Creator<cks> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ cks[] newArray(int i) {
        return new cks[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ cks createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                j = SafeParcelReader.f(parcel, readInt);
            } else if (c == 2) {
                j2 = SafeParcelReader.f(parcel, readInt);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new cks(j, j2);
    }
}
