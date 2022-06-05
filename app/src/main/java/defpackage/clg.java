package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: clg  reason: default package */
/* loaded from: classes2.dex */
public final class clg implements Parcelable.Creator<chu> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ chu[] newArray(int i) {
        return new chu[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ chu createFromParcel(Parcel parcel) {
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
        return new chu(str);
    }
}
