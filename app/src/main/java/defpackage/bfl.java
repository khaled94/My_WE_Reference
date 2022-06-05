package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

@Deprecated
/* renamed from: bfl  reason: default package */
/* loaded from: classes2.dex */
public final class bfl extends abb {
    public static final Parcelable.Creator<bfl> CREATOR = new bfk();
    private static final bfl a = new bfl("Home");
    private static final bfl b = new bfl("Work");
    private final String c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bfl(String str) {
        this.c = str;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bfl) {
            return aar.a(this.c, ((bfl) obj).c);
        }
        return false;
    }

    public final String toString() {
        return aar.a(this).a("alias", this.c).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.c);
        abc.b(parcel, a2);
    }
}
