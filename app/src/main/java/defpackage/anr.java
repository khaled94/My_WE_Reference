package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: anr  reason: default package */
/* loaded from: classes.dex */
public final class anr implements Parcelable.Creator<anq> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ anq createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        ano anoVar = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        int i = 1;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = SafeParcelReader.d(parcel, readInt);
                    break;
                case 2:
                    anoVar = (ano) SafeParcelReader.a(parcel, readInt, ano.CREATOR);
                    break;
                case 3:
                    iBinder = SafeParcelReader.h(parcel, readInt);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) SafeParcelReader.a(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = SafeParcelReader.h(parcel, readInt);
                    break;
                case 6:
                    iBinder3 = SafeParcelReader.h(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel, a);
        return new anq(i, anoVar, iBinder, pendingIntent, iBinder2, iBinder3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ anq[] newArray(int i) {
        return new anq[i];
    }
}
