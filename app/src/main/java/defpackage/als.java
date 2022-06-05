package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: als  reason: default package */
/* loaded from: classes.dex */
public final class als implements Parcelable.Creator<alq> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ alq[] newArray(int i) {
        return new alq[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ alq createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        int i = 0;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = SafeParcelReader.d(parcel, readInt);
            } else if (c == 2) {
                arrayList = SafeParcelReader.n(parcel, readInt);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new alq(i, arrayList);
    }
}
