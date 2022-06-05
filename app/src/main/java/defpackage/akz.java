package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: akz  reason: default package */
/* loaded from: classes.dex */
public final class akz implements Parcelable.Creator<ala> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ala[] newArray(int i) {
        return new ala[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ala createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        ArrayList arrayList = null;
        cll cllVar = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = SafeParcelReader.l(parcel, readInt);
            } else if (c == 2) {
                arrayList = SafeParcelReader.b(parcel, readInt, alg.CREATOR);
            } else if (c == 3) {
                cllVar = (cll) SafeParcelReader.a(parcel, readInt, cll.CREATOR);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new ala(str, arrayList, cllVar);
    }
}
