package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class DataHolder extends abb implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new aaa();
    private static final a i = new zz(new String[0]);
    final int a;
    public Bundle b;
    public final CursorWindow[] c;
    public final int d;
    public final Bundle e;
    int[] f;
    public int g;
    boolean h;
    private final String[] j;
    private boolean k;

    /* loaded from: classes.dex */
    public static class a {
        final String[] a;
        final ArrayList<HashMap<String, Object>> b = new ArrayList<>();
        private final HashMap<Object, Integer> c = new HashMap<>();
    }

    public DataHolder(int i2, String[] strArr, CursorWindow[] cursorWindowArr, int i3, Bundle bundle) {
        this.h = false;
        this.k = true;
        this.a = i2;
        this.j = strArr;
        this.c = cursorWindowArr;
        this.d = i3;
        this.e = bundle;
    }

    public static DataHolder b(int i2) {
        return new DataHolder(i, i2);
    }

    private boolean b() {
        boolean z;
        synchronized (this) {
            z = this.h;
        }
        return z;
    }

    public final int a(int i2) {
        int length;
        int i3 = 0;
        aat.b(i2 >= 0 && i2 < this.g);
        while (true) {
            int[] iArr = this.f;
            length = iArr.length;
            if (i3 >= length) {
                break;
            } else if (i2 < iArr[i3]) {
                i3--;
                break;
            } else {
                i3++;
            }
        }
        return i3 == length ? i3 - 1 : i3;
    }

    public final void a() {
        this.b = new Bundle();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String[] strArr = this.j;
            if (i3 >= strArr.length) {
                break;
            }
            this.b.putInt(strArr[i3], i3);
            i3++;
        }
        this.f = new int[this.c.length];
        int i4 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.c;
            if (i2 >= cursorWindowArr.length) {
                this.g = i4;
                return;
            }
            this.f[i2] = i4;
            i4 += this.c[i2].getNumRows() - (i4 - cursorWindowArr[i2].getStartPosition());
            i2++;
        }
    }

    public final void a(String str, int i2) {
        Bundle bundle = this.b;
        if (bundle == null || !bundle.containsKey(str)) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "No such column: ".concat(valueOf) : new String("No such column: "));
        } else if (!b()) {
            if (i2 >= 0 && i2 < this.g) {
                return;
            }
            throw new CursorIndexOutOfBoundsException(i2, this.g);
        } else {
            throw new IllegalArgumentException("Buffer is closed.");
        }
    }

    public final byte[] a(String str, int i2, int i3) {
        a(str, i2);
        return this.c[i3].getBlob(i2, this.b.getInt(str));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (!this.h) {
                this.h = true;
                int i2 = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.c;
                    if (i2 >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i2].close();
                    i2++;
                }
            }
        }
    }

    protected final void finalize() throws Throwable {
        try {
            if (this.k && this.c.length > 0 && !b()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(")");
            }
        } finally {
            super.finalize();
        }
    }

    private DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i2) {
        this.h = false;
        this.k = true;
        this.a = 1;
        this.j = (String[]) aat.a(strArr);
        this.c = (CursorWindow[]) aat.a(cursorWindowArr);
        this.d = i2;
        this.e = null;
        a();
    }

    private DataHolder(a aVar, int i2) {
        this(aVar.a, a(aVar), i2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = abc.a(parcel, 20293);
        String[] strArr = this.j;
        if (strArr != null) {
            int a3 = abc.a(parcel, 1);
            parcel.writeStringArray(strArr);
            abc.b(parcel, a3);
        }
        abc.a(parcel, 2, this.c, i2);
        abc.a(parcel, 3, this.d);
        abc.a(parcel, 4, this.e);
        abc.a(parcel, 1000, this.a);
        abc.b(parcel, a2);
        if ((i2 & 1) != 0) {
            close();
        }
    }

    private static CursorWindow[] a(a aVar) {
        if (aVar.a.length == 0) {
            return new CursorWindow[0];
        }
        ArrayList<HashMap<String, Object>> arrayList = aVar.b;
        int size = arrayList.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(cursorWindow);
        cursorWindow.setNumColumns(aVar.a.length);
        int i2 = 0;
        boolean z = false;
        while (i2 < size) {
            try {
                if (!cursorWindow.allocRow()) {
                    StringBuilder sb = new StringBuilder(72);
                    sb.append("Allocating additional cursor window for large data set (row ");
                    sb.append(i2);
                    sb.append(")");
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i2);
                    cursorWindow.setNumColumns(aVar.a.length);
                    arrayList2.add(cursorWindow);
                    if (!cursorWindow.allocRow()) {
                        arrayList2.remove(cursorWindow);
                        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
                    }
                }
                HashMap<String, Object> hashMap = arrayList.get(i2);
                int i3 = 0;
                boolean z2 = true;
                while (true) {
                    if (i3 < aVar.a.length) {
                        if (!z2) {
                            break;
                        }
                        String str = aVar.a[i3];
                        Object obj = hashMap.get(str);
                        if (obj == null) {
                            z2 = cursorWindow.putNull(i2, i3);
                        } else if (obj instanceof String) {
                            z2 = cursorWindow.putString((String) obj, i2, i3);
                        } else if (obj instanceof Long) {
                            z2 = cursorWindow.putLong(((Long) obj).longValue(), i2, i3);
                        } else if (obj instanceof Integer) {
                            z2 = cursorWindow.putLong(((Integer) obj).intValue(), i2, i3);
                        } else if (obj instanceof Boolean) {
                            z2 = cursorWindow.putLong(true != ((Boolean) obj).booleanValue() ? 0L : 1L, i2, i3);
                        } else if (obj instanceof byte[]) {
                            z2 = cursorWindow.putBlob((byte[]) obj, i2, i3);
                        } else if (obj instanceof Double) {
                            z2 = cursorWindow.putDouble(((Double) obj).doubleValue(), i2, i3);
                        } else if (obj instanceof Float) {
                            z2 = cursorWindow.putDouble(((Float) obj).floatValue(), i2, i3);
                        } else {
                            String obj2 = obj.toString();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32 + obj2.length());
                            sb2.append("Unsupported object for column ");
                            sb2.append(str);
                            sb2.append(": ");
                            sb2.append(obj2);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                        i3++;
                    } else if (z2) {
                        z = false;
                    }
                }
                if (!z) {
                    StringBuilder sb3 = new StringBuilder(74);
                    sb3.append("Couldn't populate window data for row ");
                    sb3.append(i2);
                    sb3.append(" - allocating new window.");
                    cursorWindow.freeLastRow();
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i2);
                    cursorWindow.setNumColumns(aVar.a.length);
                    arrayList2.add(cursorWindow);
                    i2--;
                    z = true;
                    i2++;
                } else {
                    throw new zad();
                }
            } catch (RuntimeException e) {
                int size2 = arrayList2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ((CursorWindow) arrayList2.get(i4)).close();
                }
                throw e;
            }
        }
        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
    }
}
