package defpackage;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: aaa  reason: default package */
/* loaded from: classes.dex */
public final class aaa implements Parcelable.Creator<DataHolder> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DataHolder createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                int e = SafeParcelReader.e(parcel, readInt);
                int dataPosition = parcel.dataPosition();
                if (e == 0) {
                    strArr = null;
                } else {
                    strArr = parcel.createStringArray();
                    parcel.setDataPosition(dataPosition + e);
                }
            } else if (c == 2) {
                cursorWindowArr = (CursorWindow[]) SafeParcelReader.c(parcel, readInt, CursorWindow.CREATOR);
            } else if (c == 3) {
                i2 = SafeParcelReader.d(parcel, readInt);
            } else if (c == 4) {
                bundle = SafeParcelReader.g(parcel, readInt);
            } else if (c == 1000) {
                i = SafeParcelReader.d(parcel, readInt);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        DataHolder dataHolder = new DataHolder(i, strArr, cursorWindowArr, i2, bundle);
        dataHolder.a();
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DataHolder[] newArray(int i) {
        return new DataHolder[i];
    }
}
