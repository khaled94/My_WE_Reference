package defpackage;

import android.os.Parcel;

/* renamed from: ahk  reason: default package */
/* loaded from: classes.dex */
public class ahk {
    private static final ClassLoader a = ahk.class.getClassLoader();

    private ahk() {
    }

    public static boolean a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void b(Parcel parcel) {
        parcel.writeInt(1);
    }
}
