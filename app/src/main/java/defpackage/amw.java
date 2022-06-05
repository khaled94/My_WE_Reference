package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* renamed from: amw  reason: default package */
/* loaded from: classes.dex */
public class amw {
    private static final ClassLoader a = amw.class.getClassLoader();

    private amw() {
    }

    public static boolean a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static void a(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
