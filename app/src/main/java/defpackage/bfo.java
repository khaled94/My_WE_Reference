package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: bfo  reason: default package */
/* loaded from: classes2.dex */
public final class bfo implements Parcelable.Creator<bfn> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bfn[] newArray(int i) {
        return new bfn[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bfn createFromParcel(Parcel parcel) {
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
            } else if (c == 6) {
                arrayList = SafeParcelReader.b(parcel, readInt, bfl.CREATOR);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new bfn(str, str2, arrayList);
    }
}
