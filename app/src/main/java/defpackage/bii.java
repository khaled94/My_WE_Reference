package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.places.AutocompleteFilter;
import java.util.ArrayList;

/* renamed from: bii  reason: default package */
/* loaded from: classes2.dex */
public final class bii implements Parcelable.Creator<AutocompleteFilter> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AutocompleteFilter[] newArray(int i) {
        return new AutocompleteFilter[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AutocompleteFilter createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        ArrayList<Integer> arrayList = null;
        String str = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                z = SafeParcelReader.q(parcel, readInt);
            } else if (c == 2) {
                arrayList = SafeParcelReader.m(parcel, readInt);
            } else if (c == 3) {
                str = SafeParcelReader.l(parcel, readInt);
            } else if (c == 1000) {
                i = SafeParcelReader.d(parcel, readInt);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new AutocompleteFilter(i, z, arrayList, str);
    }
}
