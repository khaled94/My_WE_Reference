package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: clh  reason: default package */
/* loaded from: classes2.dex */
public final class clh implements Parcelable.Creator<chv> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ chv[] newArray(int i) {
        return new chv[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ chv createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = SafeParcelReader.l(parcel, readInt);
            } else if (c == 2) {
                str2 = SafeParcelReader.l(parcel, readInt);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new chv(str, str2);
    }
}
