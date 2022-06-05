package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import defpackage.k;

/* renamed from: l  reason: default package */
/* loaded from: classes2.dex */
public class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new Parcelable.Creator<l>() { // from class: l.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ l[] newArray(int i) {
            return new l[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }
    };
    final boolean a = false;
    final Handler b = null;
    k c;

    protected void a(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: l$b */
    /* loaded from: classes2.dex */
    class b implements Runnable {
        final int a;
        final Bundle b;

        b(int i, Bundle bundle) {
            this.a = i;
            this.b = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            l.this.a(this.a, this.b);
        }
    }

    /* renamed from: l$a */
    /* loaded from: classes2.dex */
    class a extends k.a {
        a() {
        }

        @Override // defpackage.k
        public final void a(int i, Bundle bundle) {
            if (l.this.b != null) {
                l.this.b.post(new b(i, bundle));
            } else {
                l.this.a(i, bundle);
            }
        }
    }

    public final void b(int i, Bundle bundle) {
        if (this.a) {
            Handler handler = this.b;
            if (handler != null) {
                handler.post(new b(i, bundle));
                return;
            } else {
                a(i, bundle);
                return;
            }
        }
        k kVar = this.c;
        if (kVar == null) {
            return;
        }
        try {
            kVar.a(i, bundle);
        } catch (RemoteException unused) {
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.c == null) {
                this.c = new a();
            }
            parcel.writeStrongBinder(this.c.asBinder());
        }
    }

    l(Parcel parcel) {
        this.c = k.a.a(parcel.readStrongBinder());
    }
}
