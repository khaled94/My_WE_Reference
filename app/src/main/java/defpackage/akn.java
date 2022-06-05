package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: akn  reason: default package */
/* loaded from: classes.dex */
public final class akn implements Parcelable.Creator<ako> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ako[] newArray(int i) {
        return new ako[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ako createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        alr alrVar = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = SafeParcelReader.l(parcel, readInt);
            } else if (c == 2) {
                alrVar = (alr) SafeParcelReader.a(parcel, readInt, alr.CREATOR);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new ako(str, alrVar);
    }
}
