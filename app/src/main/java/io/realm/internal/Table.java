package io.realm.internal;

import io.realm.RealmFieldType;

/* loaded from: classes2.dex */
public class Table implements dlf {
    public static final int a;
    private static final String e;
    private static final long f = nativeGetFinalizerPtr();
    public final long b;
    final dle c;
    public final OsSharedRealm d;

    private native long nativeGetColumnCount(long j);

    private native long nativeGetColumnIndex(long j, String str);

    private native String nativeGetColumnName(long j, long j2);

    private native int nativeGetColumnType(long j, long j2);

    private static native long nativeGetFinalizerPtr();

    private native String nativeGetName(long j);

    private native long nativeSize(long j);

    public native long nativeGetLinkTarget(long j, long j2);

    static {
        String a2 = Util.a();
        e = a2;
        a = 63 - a2.length();
    }

    public Table(OsSharedRealm osSharedRealm, long j) {
        dle dleVar = osSharedRealm.context;
        this.c = dleVar;
        this.d = osSharedRealm;
        this.b = j;
        dleVar.a(this);
    }

    @Override // defpackage.dlf
    public long getNativePtr() {
        return this.b;
    }

    @Override // defpackage.dlf
    public long getNativeFinalizerPtr() {
        return f;
    }

    public final long a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Column name can not be null.");
        }
        return nativeGetColumnIndex(this.b, str);
    }

    public final RealmFieldType a(long j) {
        return RealmFieldType.fromNativeValue(nativeGetColumnType(this.b, j));
    }

    public final String a() {
        return nativeGetName(this.b);
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        return !str.startsWith(e) ? str : str.substring(e.length());
    }

    public String toString() {
        long nativeGetColumnCount = nativeGetColumnCount(this.b);
        String a2 = a();
        StringBuilder sb = new StringBuilder("The Table ");
        if (a2 != null && !a2.isEmpty()) {
            sb.append(a());
            sb.append(" ");
        }
        sb.append("contains ");
        sb.append(nativeGetColumnCount);
        sb.append(" columns: ");
        int i = 0;
        while (true) {
            long j = i;
            if (j < nativeGetColumnCount) {
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(nativeGetColumnName(this.b, j));
                i++;
            } else {
                sb.append(".");
                sb.append(" And ");
                sb.append(nativeSize(this.b));
                sb.append(" rows.");
                return sb.toString();
            }
        }
    }
}
