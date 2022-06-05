package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: bhh  reason: default package */
/* loaded from: classes2.dex */
public final class bhh implements Parcelable.Creator<bhd> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bhd[] newArray(int i) {
        return new bhd[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bhd createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                arrayList = SafeParcelReader.b(parcel, readInt, bhg.CREATOR);
            } else if (c == 2) {
                arrayList2 = SafeParcelReader.b(parcel, readInt, bhf.CREATOR);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new bhd(arrayList, arrayList2);
    }
}
