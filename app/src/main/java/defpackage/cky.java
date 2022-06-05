package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: cky  reason: default package */
/* loaded from: classes2.dex */
public final class cky implements Parcelable.Creator<ckv> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ckv[] newArray(int i) {
        return new ckv[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ckv createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = SafeParcelReader.l(parcel, readInt);
            } else if (c == 2) {
                str2 = SafeParcelReader.l(parcel, readInt);
            } else if (c == 3) {
                arrayList = SafeParcelReader.b(parcel, readInt, clf.CREATOR);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new ckv(str, str2, arrayList);
    }
}
