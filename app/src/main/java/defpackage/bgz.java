package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: bgz  reason: default package */
/* loaded from: classes2.dex */
public final class bgz implements Parcelable.Creator<bha> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bha[] newArray(int i) {
        return new bha[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bha createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        ArrayList<Integer> arrayList = null;
        String str = null;
        Uri uri = null;
        float f = 0.0f;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                arrayList = SafeParcelReader.m(parcel, readInt);
            } else if (c == 2) {
                str = SafeParcelReader.l(parcel, readInt);
            } else if (c == 3) {
                uri = (Uri) SafeParcelReader.a(parcel, readInt, Uri.CREATOR);
            } else if (c == 4) {
                f = SafeParcelReader.c(parcel, readInt);
            } else if (c == 5) {
                i = SafeParcelReader.d(parcel, readInt);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new bha(arrayList, str, uri, f, i);
    }
}
