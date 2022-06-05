package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: cix  reason: default package */
/* loaded from: classes2.dex */
public abstract class cix extends aiz implements ciw {
    public cix() {
        super("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
    }

    @Override // defpackage.aiz
    public final boolean a(int i, Parcel parcel) throws RemoteException {
        switch (i) {
            case 1:
                a((alf) akp.a(parcel, alf.CREATOR));
                return true;
            case 2:
                a((alf) akp.a(parcel, alf.CREATOR), (ald) akp.a(parcel, ald.CREATOR));
                return true;
            case 3:
                a((alb) akp.a(parcel, alb.CREATOR));
                return true;
            case 4:
                a((alo) akp.a(parcel, alo.CREATOR));
                return true;
            case 5:
                a((Status) akp.a(parcel, Status.CREATOR));
                return true;
            case 6:
                a();
                return true;
            case 7:
                b();
                return true;
            case 8:
                a(parcel.readString());
                return true;
            case 9:
                b(parcel.readString());
                return true;
            case 10:
                a((chs) akp.a(parcel, chs.CREATOR));
                return true;
            case 11:
                c(parcel.readString());
                return true;
            case 12:
                a((Status) akp.a(parcel, Status.CREATOR), (chs) akp.a(parcel, chs.CREATOR));
                return true;
            case 13:
                c();
                return true;
            case 14:
                a((akx) akp.a(parcel, akx.CREATOR));
                return true;
            case 15:
                a((ala) akp.a(parcel, ala.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
