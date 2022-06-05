package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: anz  reason: default package */
/* loaded from: classes.dex */
public final class anz extends abb {
    public static final Parcelable.Creator<anz> CREATOR = new aoa();
    final int a;
    final anx b;
    final bin c;
    final anc d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public anz(int i, anx anxVar, IBinder iBinder, IBinder iBinder2) {
        this.a = i;
        this.b = anxVar;
        anc ancVar = null;
        this.c = iBinder == null ? null : bim.a(iBinder);
        if (iBinder2 != null) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface instanceof anc) {
                ancVar = (anc) queryLocalInterface;
            } else {
                ancVar = new anb(iBinder2);
            }
        }
        this.d = ancVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.a(parcel, 2, this.b, i);
        bin binVar = this.c;
        IBinder iBinder = null;
        abc.a(parcel, 3, binVar == null ? null : binVar.asBinder());
        anc ancVar = this.d;
        if (ancVar != null) {
            iBinder = ancVar.asBinder();
        }
        abc.a(parcel, 4, iBinder);
        abc.b(parcel, a);
    }
}
