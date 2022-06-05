package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import defpackage.sv;
import defpackage.sv.a;
import java.util.Set;

/* renamed from: sv  reason: default package */
/* loaded from: classes2.dex */
public abstract class sv<P extends sv, E extends a> implements sr {
    final Bundle b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public sv(a<P, E> aVar) {
        this.b = (Bundle) aVar.a.clone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public sv(Parcel parcel) {
        this.b = parcel.readBundle(a.class.getClassLoader());
    }

    public final Object a(String str) {
        return this.b.get(str);
    }

    public final Set<String> b() {
        return this.b.keySet();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.b);
    }

    /* renamed from: sv$a */
    /* loaded from: classes2.dex */
    public static abstract class a<P extends sv, E extends a> {
        Bundle a = new Bundle();

        public E a(P p) {
            if (p != null) {
                this.a.putAll((Bundle) p.b.clone());
            }
            return this;
        }
    }
}
