package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: biy  reason: default package */
/* loaded from: classes2.dex */
public final class biy extends abb {
    public static final Parcelable.Creator<biy> CREATOR = new biz();
    public final int a;
    public final int b;
    public final long c;
    public final long d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public biy(int i, int i2, long j, long j2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof biy) {
            biy biyVar = (biy) obj;
            if (this.a == biyVar.a && this.b == biyVar.b && this.c == biyVar.c && this.d == biyVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a), Long.valueOf(this.d), Long.valueOf(this.c)});
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.a + " Cell status: " + this.b + " elapsed time NS: " + this.d + " system time ms: " + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.a(parcel, 2, this.b);
        abc.a(parcel, 3, this.c);
        abc.a(parcel, 4, this.d);
        abc.b(parcel, a);
    }
}
