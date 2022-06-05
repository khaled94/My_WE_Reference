package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Arrays;

/* renamed from: bhn  reason: default package */
/* loaded from: classes2.dex */
public final class bhn extends abb {
    public static final Parcelable.Creator<bhn> CREATOR = new bhl();
    final int a;
    final int b;

    public bhn(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final String toString() {
        return aar.a(this).a(TypedValues.Cycle.S_WAVE_OFFSET, Integer.valueOf(this.a)).a("length", Integer.valueOf(this.b)).toString();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhn)) {
            return false;
        }
        bhn bhnVar = (bhn) obj;
        return aar.a(Integer.valueOf(this.a), Integer.valueOf(bhnVar.a)) && aar.a(Integer.valueOf(this.b), Integer.valueOf(bhnVar.b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.a(parcel, 2, this.b);
        abc.b(parcel, a);
    }
}
