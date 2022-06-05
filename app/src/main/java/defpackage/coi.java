package defpackage;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: coi  reason: default package */
/* loaded from: classes2.dex */
public class coi implements Parcelable {
    public static final Parcelable.Creator<coi> CREATOR = new coh();
    private Messenger a;
    private coq b;

    /* renamed from: coi$a */
    /* loaded from: classes2.dex */
    public static final class a extends ClassLoader {
        @Override // java.lang.ClassLoader
        protected final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
            if ("com.google.android.gms.iid.MessengerCompat".equals(str)) {
                FirebaseInstanceId.g();
                return coi.class;
            }
            return super.loadClass(str, z);
        }
    }

    public coi(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.a = new Messenger(iBinder);
        } else {
            this.b = new cos(iBinder);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void a(Message message) throws RemoteException {
        Messenger messenger = this.a;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.b.a(message);
        }
    }

    private final IBinder a() {
        Messenger messenger = this.a;
        return messenger != null ? messenger.getBinder() : this.b.asBinder();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((coi) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return a().hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.a;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.b.asBinder());
        }
    }
}
