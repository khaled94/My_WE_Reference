package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: alh  reason: default package */
/* loaded from: classes.dex */
public final class alh implements Parcelable.Creator<alf> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ alf[] newArray(int i) {
        return new alf[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ alf createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        String str2 = null;
        Long l = null;
        String str3 = null;
        Long l2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = SafeParcelReader.l(parcel, readInt);
            } else if (c == 3) {
                str2 = SafeParcelReader.l(parcel, readInt);
            } else if (c == 4) {
                l = SafeParcelReader.k(parcel, readInt);
            } else if (c == 5) {
                str3 = SafeParcelReader.l(parcel, readInt);
            } else if (c == 6) {
                l2 = SafeParcelReader.k(parcel, readInt);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new alf(str, str2, l, str3, l2);
    }
}
