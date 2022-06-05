package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

@Deprecated
/* renamed from: bfn  reason: default package */
/* loaded from: classes2.dex */
public final class bfn extends abb {
    public static final Parcelable.Creator<bfn> CREATOR = new bfo();
    private final String a;
    private final String b;
    private final List<bfl> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bfn(String str, String str2, List<bfl> list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        return aar.a(this).a("accountName", this.a).a("placeId", this.b).a("placeAliases", this.c).toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfn)) {
            return false;
        }
        bfn bfnVar = (bfn) obj;
        return this.a.equals(bfnVar.a) && this.b.equals(bfnVar.b) && this.c.equals(bfnVar.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.a(parcel, 2, this.b);
        abc.c(parcel, 6, this.c);
        abc.b(parcel, a);
    }
}
