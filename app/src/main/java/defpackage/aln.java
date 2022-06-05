package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: aln  reason: default package */
/* loaded from: classes.dex */
public final class aln implements Parcelable.Creator<alk> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ alk[] newArray(int i) {
        return new alk[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ alk createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if (((char) readInt) == 2) {
                arrayList = SafeParcelReader.b(parcel, readInt, ali.CREATOR);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new alk(arrayList);
    }
}
