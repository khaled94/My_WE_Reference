package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: coh  reason: default package */
/* loaded from: classes2.dex */
final class coh implements Parcelable.Creator<coi> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ coi[] newArray(int i) {
        return new coi[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ coi createFromParcel(Parcel parcel) {
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            return new coi(readStrongBinder);
        }
        return null;
    }
}
