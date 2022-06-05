package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.internal.view.SupportMenu;
import java.util.List;

/* renamed from: abc  reason: default package */
/* loaded from: classes.dex */
public final class abc {
    private abc() {
    }

    public static int a(Parcel parcel, int i) {
        parcel.writeInt(i | SupportMenu.CATEGORY_MASK);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void a(Parcel parcel, int i, byte b) {
        b(parcel, i, 4);
        parcel.writeInt(b);
    }

    public static void a(Parcel parcel, int i, double d) {
        b(parcel, i, 8);
        parcel.writeDouble(d);
    }

    public static void a(Parcel parcel, int i, float f) {
        b(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void a(Parcel parcel, int i, int i2) {
        b(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void a(Parcel parcel, int i, long j) {
        b(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void a(Parcel parcel, int i, boolean z) {
        b(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    private static <T extends Parcelable> void a(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static void b(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static void b(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static void a(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int a = a(parcel, i);
        parcel.writeBundle(bundle);
        b(parcel, a);
    }

    public static void a(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int a = a(parcel, i);
        parcel.writeStrongBinder(iBinder);
        b(parcel, a);
    }

    public static void a(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int a = a(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        b(parcel, a);
    }

    public static void a(Parcel parcel, int i, Boolean bool) {
        if (bool == null) {
            return;
        }
        b(parcel, i, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void a(Parcel parcel, int i, Float f) {
        if (f == null) {
            return;
        }
        b(parcel, i, 4);
        parcel.writeFloat(f.floatValue());
    }

    public static void a(Parcel parcel, int i, Long l) {
        if (l == null) {
            return;
        }
        b(parcel, i, 8);
        parcel.writeLong(l.longValue());
    }

    public static void a(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int a = a(parcel, i);
        parcel.writeString(str);
        b(parcel, a);
    }

    public static void a(Parcel parcel, int i, List<Integer> list) {
        if (list == null) {
            return;
        }
        int a = a(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(list.get(i2).intValue());
        }
        b(parcel, a);
    }

    public static void a(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int a = a(parcel, i);
        parcel.writeIntArray(iArr);
        b(parcel, a);
    }

    public static <T extends Parcelable> void a(Parcel parcel, int i, T[] tArr, int i2) {
        if (tArr == null) {
            return;
        }
        int a = a(parcel, i);
        parcel.writeInt(tArr.length);
        for (T t : tArr) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                a(parcel, t, i2);
            }
        }
        b(parcel, a);
    }

    public static void b(Parcel parcel, int i, List<String> list) {
        if (list == null) {
            return;
        }
        int a = a(parcel, i);
        parcel.writeStringList(list);
        b(parcel, a);
    }

    public static <T extends Parcelable> void c(Parcel parcel, int i, List<T> list) {
        if (list == null) {
            return;
        }
        int a = a(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            T t = list.get(i2);
            if (t == null) {
                parcel.writeInt(0);
            } else {
                a(parcel, t, 0);
            }
        }
        b(parcel, a);
    }
}
