package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: bvw  reason: default package */
/* loaded from: classes2.dex */
public final class bvw implements Parcelable.Creator<bvv> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bvv createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                arrayList = SafeParcelReader.n(parcel, readInt);
            } else if (c == 2) {
                str = SafeParcelReader.l(parcel, readInt);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new bvv(arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bvv[] newArray(int i) {
        return new bvv[i];
    }
}
