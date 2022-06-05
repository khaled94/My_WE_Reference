package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: abl  reason: default package */
/* loaded from: classes.dex */
public final class abl implements Parcelable.Creator<aax> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ aax createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = SafeParcelReader.d(parcel, readInt);
            } else if (c == 2) {
                arrayList = SafeParcelReader.b(parcel, readInt, aaq.CREATOR);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new aax(i, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ aax[] newArray(int i) {
        return new aax[i];
    }
}
