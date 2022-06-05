package io.realm.internal;

import defpackage.dlh;
import io.realm.RealmFieldType;
import io.realm.exceptions.RealmException;

/* loaded from: classes2.dex */
public class OsObject implements dlf {
    private static final String OBJECT_ID_COLUMN_NAME = nativeGetObjectIdColumName();
    private static final long nativeFinalizerPtr = nativeGetFinalizerPtr();
    private final long nativePtr;
    private dlh<b> observerPairs = new dlh<>();

    private static native long nativeCreate(long j, long j2);

    private static native long nativeCreateNewObject(long j, long j2);

    private static native long nativeCreateNewObjectWithLongPrimaryKey(long j, long j2, long j3, long j4, boolean z);

    private static native long nativeCreateNewObjectWithStringPrimaryKey(long j, long j2, long j3, String str);

    private static native long nativeCreateRow(long j, long j2);

    private static native long nativeCreateRowWithLongPrimaryKey(long j, long j2, long j3, long j4, boolean z);

    private static native long nativeCreateRowWithStringPrimaryKey(long j, long j2, long j3, String str);

    private static native long nativeGetFinalizerPtr();

    private static native String nativeGetObjectIdColumName();

    private native void nativeStartListening(long j);

    private native void nativeStopListening(long j);

    /* loaded from: classes2.dex */
    static class c {
        final String[] a;
        final boolean b;

        c(String[] strArr, boolean z) {
            this.a = strArr;
            this.b = z;
        }
    }

    /* loaded from: classes2.dex */
    public static class b<T extends dku> extends dlh.b<T, dkv<T>> {
        public b(T t, dkv<T> dkvVar) {
            super(t, dkvVar);
        }
    }

    /* loaded from: classes2.dex */
    static class a implements dlh.a<b> {
        private final String[] a;

        a(String[] strArr) {
            this.a = strArr;
        }

        @Override // defpackage.dlh.a
        public final /* synthetic */ void a(b bVar) {
            boolean z = this.a == null;
            new c(z ? new String[0] : this.a, z);
        }
    }

    public OsObject(OsSharedRealm osSharedRealm, UncheckedRow uncheckedRow) {
        this.nativePtr = nativeCreate(osSharedRealm.getNativePtr(), uncheckedRow.getNativePtr());
        osSharedRealm.context.a(this);
    }

    @Override // defpackage.dlf
    public long getNativePtr() {
        return this.nativePtr;
    }

    @Override // defpackage.dlf
    public long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    public <T extends dku> void addListener(T t, dkv<T> dkvVar) {
        if (this.observerPairs.a()) {
            nativeStartListening(this.nativePtr);
        }
        this.observerPairs.a((dlh<b>) new b(t, dkvVar));
    }

    public <T extends dku> void removeListener(T t) {
        this.observerPairs.a(t);
        if (this.observerPairs.a()) {
            nativeStopListening(this.nativePtr);
        }
    }

    public <T extends dku> void removeListener(T t, dkv<T> dkvVar) {
        this.observerPairs.a(t, dkvVar);
        if (this.observerPairs.a()) {
            nativeStopListening(this.nativePtr);
        }
    }

    public void setObserverPairs(dlh<b> dlhVar) {
        if (!this.observerPairs.a()) {
            throw new IllegalStateException("'observerPairs' is not empty. Listeners have been added before.");
        }
        this.observerPairs = dlhVar;
        if (dlhVar.a()) {
            return;
        }
        nativeStartListening(this.nativePtr);
    }

    public static UncheckedRow createWithPrimaryKey(Table table, Object obj) {
        long andVerifyPrimaryKeyColumnIndex = getAndVerifyPrimaryKeyColumnIndex(table);
        RealmFieldType a2 = table.a(andVerifyPrimaryKeyColumnIndex);
        OsSharedRealm osSharedRealm = table.d;
        if (a2 == RealmFieldType.STRING) {
            if (obj != null && !(obj instanceof String)) {
                throw new IllegalArgumentException("Primary key value is not a String: ".concat(String.valueOf(obj)));
            }
            return new UncheckedRow(osSharedRealm.context, table, nativeCreateNewObjectWithStringPrimaryKey(osSharedRealm.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, (String) obj));
        } else if (a2 == RealmFieldType.INTEGER) {
            return new UncheckedRow(osSharedRealm.context, table, nativeCreateNewObjectWithLongPrimaryKey(osSharedRealm.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, obj == null ? 0L : Long.parseLong(obj.toString()), obj == null));
        } else {
            throw new RealmException("Cannot check for duplicate rows for unsupported primary key type: ".concat(String.valueOf(a2)));
        }
    }

    public static long createRowWithPrimaryKey(Table table, long j, Object obj) {
        RealmFieldType a2 = table.a(j);
        OsSharedRealm osSharedRealm = table.d;
        if (a2 == RealmFieldType.STRING) {
            if (obj != null && !(obj instanceof String)) {
                throw new IllegalArgumentException("Primary key value is not a String: ".concat(String.valueOf(obj)));
            }
            return nativeCreateRowWithStringPrimaryKey(osSharedRealm.getNativePtr(), table.getNativePtr(), j, (String) obj);
        } else if (a2 == RealmFieldType.INTEGER) {
            return nativeCreateRowWithLongPrimaryKey(osSharedRealm.getNativePtr(), table.getNativePtr(), j, obj == null ? 0L : Long.parseLong(obj.toString()), obj == null);
        } else {
            throw new RealmException("Cannot check for duplicate rows for unsupported primary key type: ".concat(String.valueOf(a2)));
        }
    }

    public static boolean isObjectIdColumn(String str) {
        return OBJECT_ID_COLUMN_NAME.equals(str);
    }

    private void notifyChangeListeners(String[] strArr) {
        this.observerPairs.a((dlh.a<b>) new a(strArr));
    }

    public static UncheckedRow create(Table table) {
        OsSharedRealm osSharedRealm = table.d;
        return new UncheckedRow(osSharedRealm.context, table, nativeCreateNewObject(osSharedRealm.getNativePtr(), table.getNativePtr()));
    }

    public static long createRow(Table table) {
        return nativeCreateRow(table.d.getNativePtr(), table.getNativePtr());
    }

    private static long getAndVerifyPrimaryKeyColumnIndex(Table table) {
        String a2 = OsObjectStore.a(table.d, Table.b(table.a()));
        if (a2 == null) {
            throw new IllegalStateException(table.a() + " has no primary key defined.");
        }
        return table.a(a2);
    }
}
