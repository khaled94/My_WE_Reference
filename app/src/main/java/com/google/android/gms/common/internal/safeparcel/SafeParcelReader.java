package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.internal.view.SupportMenu;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class SafeParcelReader {

    /* loaded from: classes.dex */
    public static class ParseException extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public ParseException(java.lang.String r4, android.os.Parcel r5) {
            /*
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r4)
                int r1 = r1.length()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                int r1 = r1 + 41
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    private SafeParcelReader() {
    }

    public static byte a(Parcel parcel, int i) {
        b(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static <T extends Parcelable> T a(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int e = e(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (e == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + e);
        return createFromParcel;
    }

    public static void a(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        String hexString = Integer.toHexString(i);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(i);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new ParseException(sb.toString(), parcel);
    }

    public static double b(Parcel parcel, int i) {
        b(parcel, i, 8);
        return parcel.readDouble();
    }

    public static <T> ArrayList<T> b(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int e = e(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (e == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + e);
        return createTypedArrayList;
    }

    private static void b(Parcel parcel, int i, int i2) {
        int e = e(parcel, i);
        if (e == i2) {
            return;
        }
        String hexString = Integer.toHexString(e);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(e);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new ParseException(sb.toString(), parcel);
    }

    public static float c(Parcel parcel, int i) {
        b(parcel, i, 4);
        return parcel.readFloat();
    }

    public static <T> T[] c(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int e = e(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (e == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + e);
        return tArr;
    }

    public static int d(Parcel parcel, int i) {
        b(parcel, i, 4);
        return parcel.readInt();
    }

    public static int e(Parcel parcel, int i) {
        return (i & SupportMenu.CATEGORY_MASK) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static long f(Parcel parcel, int i) {
        b(parcel, i, 8);
        return parcel.readLong();
    }

    public static Bundle g(Parcel parcel, int i) {
        int e = e(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (e == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + e);
        return readBundle;
    }

    public static IBinder h(Parcel parcel, int i) {
        int e = e(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (e == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + e);
        return readStrongBinder;
    }

    public static Boolean i(Parcel parcel, int i) {
        int e = e(parcel, i);
        if (e == 0) {
            return null;
        }
        a(parcel, e, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static Float j(Parcel parcel, int i) {
        int e = e(parcel, i);
        if (e == 0) {
            return null;
        }
        a(parcel, e, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static Long k(Parcel parcel, int i) {
        int e = e(parcel, i);
        if (e == 0) {
            return null;
        }
        a(parcel, e, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static String l(Parcel parcel, int i) {
        int e = e(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (e == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + e);
        return readString;
    }

    public static ArrayList<Integer> m(Parcel parcel, int i) {
        int e = e(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (e == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + e);
        return arrayList;
    }

    public static ArrayList<String> n(Parcel parcel, int i) {
        int e = e(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (e == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + e);
        return createStringArrayList;
    }

    public static void o(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(i);
        throw new ParseException(sb.toString(), parcel);
    }

    public static void p(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + e(parcel, i));
    }

    public static boolean q(Parcel parcel, int i) {
        b(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static int[] r(Parcel parcel, int i) {
        int e = e(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (e == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + e);
        return createIntArray;
    }

    public static int a(Parcel parcel) {
        int readInt = parcel.readInt();
        int e = e(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if (((char) readInt) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            throw new ParseException(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i = e + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new ParseException(sb.toString(), parcel);
    }
}
