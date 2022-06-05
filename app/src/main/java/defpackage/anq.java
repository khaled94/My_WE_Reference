package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: anq  reason: default package */
/* loaded from: classes.dex */
public final class anq extends abb {
    public static final Parcelable.Creator<anq> CREATOR = new anr();
    final int a;
    final ano b;
    final bit c;
    final PendingIntent d;
    final biq e;
    final anc f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public anq(int i, ano anoVar, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        this.a = i;
        this.b = anoVar;
        anc ancVar = null;
        this.c = iBinder == null ? null : bis.a(iBinder);
        this.d = pendingIntent;
        this.e = iBinder2 == null ? null : bip.a(iBinder2);
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            ancVar = queryLocalInterface instanceof anc ? (anc) queryLocalInterface : new anb(iBinder3);
        }
        this.f = ancVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static anq a(biq biqVar) {
        return new anq(2, null, null, null, biqVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static anq a(bit bitVar) {
        return new anq(2, null, bitVar, null, null, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.a(parcel, 2, this.b, i);
        bit bitVar = this.c;
        IBinder iBinder = null;
        abc.a(parcel, 3, bitVar == null ? null : bitVar.asBinder());
        abc.a(parcel, 4, this.d, i);
        biq biqVar = this.e;
        abc.a(parcel, 5, biqVar == null ? null : biqVar.asBinder());
        anc ancVar = this.f;
        if (ancVar != null) {
            iBinder = ancVar.asBinder();
        }
        abc.a(parcel, 6, iBinder);
        abc.b(parcel, a);
    }
}
