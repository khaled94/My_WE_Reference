package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.internal.PlaceEntity;
import java.util.Arrays;

/* renamed from: bhc  reason: default package */
/* loaded from: classes2.dex */
public final class bhc extends abb {
    public static final Parcelable.Creator<bhc> CREATOR = new bhb();
    public final float a;
    private final PlaceEntity b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bhc(PlaceEntity placeEntity, float f) {
        this.b = placeEntity;
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhc)) {
            return false;
        }
        bhc bhcVar = (bhc) obj;
        return this.b.equals(bhcVar.b) && this.a == bhcVar.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Float.valueOf(this.a)});
    }

    public final String toString() {
        return aar.a(this).a("place", this.b).a("likelihood", Float.valueOf(this.a)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.b, i);
        abc.a(parcel, 2, this.a);
        abc.b(parcel, a);
    }
}
