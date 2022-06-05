package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;

/* renamed from: anx  reason: default package */
/* loaded from: classes.dex */
public final class anx extends abb {
    final bja c;
    final List<aae> d;
    final String e;
    static final List<aae> a = Collections.emptyList();
    static final bja b = new bja();
    public static final Parcelable.Creator<anx> CREATOR = new any();

    /* JADX INFO: Access modifiers changed from: package-private */
    public anx(bja bjaVar, List<aae> list, String str) {
        this.c = bjaVar;
        this.d = list;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof anx)) {
            return false;
        }
        anx anxVar = (anx) obj;
        return aar.a(this.c, anxVar.c) && aar.a(this.d, anxVar.d) && aar.a(this.e, anxVar.e);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String str = this.e;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 77 + String.valueOf(valueOf2).length() + String.valueOf(str).length());
        sb.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        sb.append(valueOf);
        sb.append(", clients=");
        sb.append(valueOf2);
        sb.append(", tag='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.c, i);
        abc.c(parcel, 2, this.d);
        abc.a(parcel, 3, this.e);
        abc.b(parcel, a2);
    }
}
