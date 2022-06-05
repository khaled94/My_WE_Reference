package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: aae  reason: default package */
/* loaded from: classes.dex */
public final class aae extends abb {
    public static final Parcelable.Creator<aae> CREATOR = new abk();
    public final int a;
    public final String b;

    public aae(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aae)) {
            return false;
        }
        aae aaeVar = (aae) obj;
        return aaeVar.a == this.a && aar.a(aaeVar.b, this.b);
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.a(parcel, 2, this.b);
        abc.b(parcel, a);
    }
}
