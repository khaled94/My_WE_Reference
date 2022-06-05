package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: akl  reason: default package */
/* loaded from: classes.dex */
public final class akl implements Parcelable.Creator<akm> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ akm[] newArray(int i) {
        return new akm[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ akm createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if (((char) readInt) == 1) {
                str = SafeParcelReader.l(parcel, readInt);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new akm(str);
    }
}
