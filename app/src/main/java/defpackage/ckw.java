package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: ckw  reason: default package */
/* loaded from: classes2.dex */
public final class ckw implements Parcelable.Creator<ckt> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ckt[] newArray(int i) {
        return new ckt[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ckt createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        ArrayList arrayList = null;
        ckv ckvVar = null;
        String str = null;
        cll cllVar = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                arrayList = SafeParcelReader.b(parcel, readInt, clf.CREATOR);
            } else if (c == 2) {
                ckvVar = (ckv) SafeParcelReader.a(parcel, readInt, ckv.CREATOR);
            } else if (c == 3) {
                str = SafeParcelReader.l(parcel, readInt);
            } else if (c == 4) {
                cllVar = (cll) SafeParcelReader.a(parcel, readInt, cll.CREATOR);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new ckt(arrayList, ckvVar, str, cllVar);
    }
}
