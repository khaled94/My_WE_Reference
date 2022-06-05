package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: anu  reason: default package */
/* loaded from: classes.dex */
public final class anu {
    private static final ClassLoader a = anu.class.getClassLoader();

    private anu() {
    }

    public static <T extends Parcelable> T a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    public static void a(Parcel parcel) {
        parcel.writeInt(0);
    }

    public static void a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
