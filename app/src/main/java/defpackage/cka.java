package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: cka  reason: default package */
/* loaded from: classes2.dex */
public final class cka implements Parcelable.Creator<cjx> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ cjx[] newArray(int i) {
        return new cjx[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ cjx createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if (((char) readInt) == 1) {
                arrayList = SafeParcelReader.b(parcel, readInt, clf.CREATOR);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new cjx(arrayList);
    }
}
