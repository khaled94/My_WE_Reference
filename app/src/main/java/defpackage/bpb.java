package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bpb  reason: default package */
/* loaded from: classes2.dex */
public final class bpb extends apc implements boz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public bpb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // defpackage.boz
    public final void a(bli bliVar, bva bvaVar) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, bliVar);
        ard.a(k_, bvaVar);
        b(1, k_);
    }

    @Override // defpackage.boz
    public final void a(buq buqVar, bva bvaVar) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, buqVar);
        ard.a(k_, bvaVar);
        b(2, k_);
    }

    @Override // defpackage.boz
    public final void a(bva bvaVar) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, bvaVar);
        b(4, k_);
    }

    @Override // defpackage.boz
    public final void a(bli bliVar, String str, String str2) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, bliVar);
        k_.writeString(str);
        k_.writeString(str2);
        b(5, k_);
    }

    @Override // defpackage.boz
    public final void b(bva bvaVar) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, bvaVar);
        b(6, k_);
    }

    @Override // defpackage.boz
    public final List<buq> a(bva bvaVar, boolean z) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, bvaVar);
        ard.a(k_, z);
        Parcel a = a(7, k_);
        ArrayList createTypedArrayList = a.createTypedArrayList(buq.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.boz
    public final byte[] a(bli bliVar, String str) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, bliVar);
        k_.writeString(str);
        Parcel a = a(9, k_);
        byte[] createByteArray = a.createByteArray();
        a.recycle();
        return createByteArray;
    }

    @Override // defpackage.boz
    public final void a(long j, String str, String str2, String str3) throws RemoteException {
        Parcel k_ = k_();
        k_.writeLong(j);
        k_.writeString(str);
        k_.writeString(str2);
        k_.writeString(str3);
        b(10, k_);
    }

    @Override // defpackage.boz
    public final String c(bva bvaVar) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, bvaVar);
        Parcel a = a(11, k_);
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    @Override // defpackage.boz
    public final void a(bvd bvdVar, bva bvaVar) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, bvdVar);
        ard.a(k_, bvaVar);
        b(12, k_);
    }

    @Override // defpackage.boz
    public final void a(bvd bvdVar) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, bvdVar);
        b(13, k_);
    }

    @Override // defpackage.boz
    public final List<buq> a(String str, String str2, boolean z, bva bvaVar) throws RemoteException {
        Parcel k_ = k_();
        k_.writeString(str);
        k_.writeString(str2);
        ard.a(k_, z);
        ard.a(k_, bvaVar);
        Parcel a = a(14, k_);
        ArrayList createTypedArrayList = a.createTypedArrayList(buq.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.boz
    public final List<buq> a(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel k_ = k_();
        k_.writeString(str);
        k_.writeString(str2);
        k_.writeString(str3);
        ard.a(k_, z);
        Parcel a = a(15, k_);
        ArrayList createTypedArrayList = a.createTypedArrayList(buq.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.boz
    public final List<bvd> a(String str, String str2, bva bvaVar) throws RemoteException {
        Parcel k_ = k_();
        k_.writeString(str);
        k_.writeString(str2);
        ard.a(k_, bvaVar);
        Parcel a = a(16, k_);
        ArrayList createTypedArrayList = a.createTypedArrayList(bvd.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.boz
    public final List<bvd> a(String str, String str2, String str3) throws RemoteException {
        Parcel k_ = k_();
        k_.writeString(str);
        k_.writeString(str2);
        k_.writeString(str3);
        Parcel a = a(17, k_);
        ArrayList createTypedArrayList = a.createTypedArrayList(bvd.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.boz
    public final void d(bva bvaVar) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, bvaVar);
        b(18, k_);
    }
}
