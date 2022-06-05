package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aar;
import java.util.Arrays;

/* renamed from: uw  reason: default package */
/* loaded from: classes2.dex */
public final class uw extends abb {
    public static final Parcelable.Creator<uw> CREATOR = new aes();
    public final String a;
    @Deprecated
    private final int b;
    private final long c;

    public uw(String str, int i, long j) {
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public uw(String str, long j) {
        this.a = str;
        this.c = j;
        this.b = -1;
    }

    public final long a() {
        long j = this.c;
        return j == -1 ? this.b : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uw) {
            uw uwVar = (uw) obj;
            String str = this.a;
            if (((str != null && str.equals(uwVar.a)) || (this.a == null && uwVar.a == null)) && a() == uwVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        aar.a a = aar.a(this);
        a.a("name", this.a);
        a.a("version", Long.valueOf(a()));
        return a.toString();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(a())});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.a(parcel, 2, this.b);
        abc.a(parcel, 3, a());
        abc.b(parcel, a);
    }
}
