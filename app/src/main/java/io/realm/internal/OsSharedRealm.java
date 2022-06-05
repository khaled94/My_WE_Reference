package io.realm.internal;

import io.realm.internal.OsRealmConfig;
import io.realm.internal.OsResults;
import io.realm.internal.android.AndroidRealmNotifier;
import java.io.Closeable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class OsSharedRealm implements dlf, Closeable {
    public static final byte FILE_EXCEPTION_INCOMPATIBLE_SYNC_FILE = 7;
    public static final byte FILE_EXCEPTION_KIND_ACCESS_ERROR = 0;
    public static final byte FILE_EXCEPTION_KIND_BAD_HISTORY = 1;
    public static final byte FILE_EXCEPTION_KIND_EXISTS = 3;
    public static final byte FILE_EXCEPTION_KIND_FORMAT_UPGRADE_REQUIRED = 6;
    public static final byte FILE_EXCEPTION_KIND_INCOMPATIBLE_LOCK_FILE = 5;
    public static final byte FILE_EXCEPTION_KIND_NOT_FOUND = 4;
    public static final byte FILE_EXCEPTION_KIND_PERMISSION_DENIED = 2;
    private static final long nativeFinalizerPtr = nativeGetFinalizerPtr();
    private static final List<OsSharedRealm> sharedRealmsUnderConstruction = new CopyOnWriteArrayList();
    private static volatile File temporaryDirectory;
    public final dky capabilities;
    public final dle context;
    final List<WeakReference<OsResults.a>> iterators;
    private final long nativePtr;
    private final OsRealmConfig osRealmConfig;
    private final List<WeakReference<dli>> pendingRows;
    public final RealmNotifier realmNotifier;
    private final OsSchemaInfo schemaInfo;
    private final List<OsSharedRealm> tempSharedRealmsForCallback;

    /* loaded from: classes2.dex */
    public interface InitializationCallback {
        void onInit(OsSharedRealm osSharedRealm);
    }

    /* loaded from: classes2.dex */
    public interface MigrationCallback {
        void onMigrationNeeded(OsSharedRealm osSharedRealm, long j, long j2);
    }

    /* loaded from: classes2.dex */
    public interface SchemaChangedCallback {
        void onSchemaChanged();
    }

    private static native void nativeBeginTransaction(long j);

    private static native void nativeCancelTransaction(long j);

    private static native void nativeCloseSharedRealm(long j);

    private static native void nativeCommitTransaction(long j);

    private static native boolean nativeCompact(long j);

    private static native long nativeCreateTable(long j, String str);

    private static native long nativeCreateTableWithPrimaryKeyField(long j, String str, String str2, boolean z, boolean z2);

    private static native int nativeGetClassPrivileges(long j, String str);

    private static native long nativeGetFinalizerPtr();

    private static native int nativeGetObjectPrivileges(long j, long j2);

    private static native int nativeGetRealmPrivileges(long j);

    private static native long nativeGetSchemaInfo(long j);

    private static native long nativeGetSharedRealm(long j, RealmNotifier realmNotifier);

    private static native long nativeGetTable(long j, String str);

    private static native String nativeGetTableName(long j, int i);

    private static native long[] nativeGetVersionID(long j);

    private static native boolean nativeHasTable(long j, String str);

    private static native void nativeInit(String str);

    private static native boolean nativeIsAutoRefresh(long j);

    private static native boolean nativeIsClosed(long j);

    private static native boolean nativeIsEmpty(long j);

    private static native boolean nativeIsInTransaction(long j);

    private static native boolean nativeIsPartial(long j);

    private static native void nativeRefresh(long j);

    private static native void nativeRegisterSchemaChangedCallback(long j, SchemaChangedCallback schemaChangedCallback);

    private static native void nativeRenameTable(long j, String str, String str2);

    private static native void nativeSetAutoRefresh(long j, boolean z);

    private static native long nativeSize(long j);

    private static native void nativeStopWaitForChange(long j);

    private static native boolean nativeWaitForChange(long j);

    private static native void nativeWriteCopy(long j, String str, byte[] bArr);

    /* loaded from: classes2.dex */
    public static class a implements Comparable<a> {
        public final long a;
        public final long b;

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(a aVar) {
            a aVar2 = aVar;
            if (aVar2 == null) {
                throw new IllegalArgumentException("Version cannot be compared to a null value.");
            }
            long j = this.a;
            long j2 = aVar2.a;
            if (j > j2) {
                return 1;
            }
            return j < j2 ? -1 : 0;
        }

        a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public final String toString() {
            return "VersionID{version=" + this.a + ", index=" + this.b + '}';
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                if (this.a == aVar.a && this.b == aVar.b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            long j = this.a;
            long j2 = this.b;
            return (((super.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }
    }

    /* JADX WARN: Finally extract failed */
    private OsSharedRealm(OsRealmConfig osRealmConfig) {
        this.tempSharedRealmsForCallback = new ArrayList();
        this.pendingRows = new CopyOnWriteArrayList();
        this.iterators = new ArrayList();
        dll dllVar = new dll();
        AndroidRealmNotifier androidRealmNotifier = new AndroidRealmNotifier(this, dllVar);
        this.context = osRealmConfig.c;
        sharedRealmsUnderConstruction.add(this);
        try {
            this.nativePtr = nativeGetSharedRealm(osRealmConfig.getNativePtr(), androidRealmNotifier);
            this.tempSharedRealmsForCallback.clear();
            sharedRealmsUnderConstruction.remove(this);
            this.osRealmConfig = osRealmConfig;
            this.schemaInfo = new OsSchemaInfo(nativeGetSchemaInfo(this.nativePtr), this);
            this.context.a(this);
            this.capabilities = dllVar;
            this.realmNotifier = androidRealmNotifier;
            nativeSetAutoRefresh(this.nativePtr, dllVar.a());
        } finally {
            try {
                throw th;
            } catch (Throwable th) {
            }
        }
    }

    private OsSharedRealm(long j, OsRealmConfig osRealmConfig) {
        this.tempSharedRealmsForCallback = new ArrayList();
        this.pendingRows = new CopyOnWriteArrayList();
        this.iterators = new ArrayList();
        this.nativePtr = j;
        this.osRealmConfig = osRealmConfig;
        this.schemaInfo = new OsSchemaInfo(nativeGetSchemaInfo(j), this);
        dle dleVar = osRealmConfig.c;
        this.context = dleVar;
        dleVar.a(this);
        this.capabilities = new dll();
        this.realmNotifier = null;
        boolean z = false;
        nativeSetAutoRefresh(this.nativePtr, false);
        Iterator<OsSharedRealm> it = sharedRealmsUnderConstruction.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            OsSharedRealm next = it.next();
            if (next.context == osRealmConfig.c) {
                z = true;
                next.tempSharedRealmsForCallback.add(this);
                break;
            }
        }
        if (z) {
            return;
        }
        throw new IllegalStateException("Cannot find the parent 'OsSharedRealm' which is under construction.");
    }

    public static OsSharedRealm getInstance(dks dksVar) {
        return getInstance(new OsRealmConfig.a(dksVar));
    }

    public static void initialize(File file) {
        if (temporaryDirectory != null) {
            return;
        }
        String absolutePath = file.getAbsolutePath();
        if (!file.isDirectory() && !file.mkdirs() && !file.isDirectory()) {
            throw new IOException("failed to create temporary directory: ".concat(String.valueOf(absolutePath)));
        }
        if (!absolutePath.endsWith("/")) {
            absolutePath = absolutePath + "/";
        }
        nativeInit(absolutePath);
        temporaryDirectory = file;
    }

    public static File getTemporaryDirectory() {
        return temporaryDirectory;
    }

    public final void beginTransaction() {
        detachIterators();
        executePendingRowQueries();
        nativeBeginTransaction(this.nativePtr);
    }

    public final void commitTransaction() {
        nativeCommitTransaction(this.nativePtr);
    }

    public final void cancelTransaction() {
        nativeCancelTransaction(this.nativePtr);
    }

    public final boolean isInTransaction() {
        return nativeIsInTransaction(this.nativePtr);
    }

    public final boolean hasTable(String str) {
        return nativeHasTable(this.nativePtr, str);
    }

    public final Table getTable(String str) {
        return new Table(this, nativeGetTable(this.nativePtr, str));
    }

    public final Table createTable(String str) {
        return new Table(this, nativeCreateTable(this.nativePtr, str));
    }

    public final Table createTableWithPrimaryKey(String str, String str2, boolean z, boolean z2) {
        return new Table(this, nativeCreateTableWithPrimaryKeyField(this.nativePtr, str, str2, z, z2));
    }

    public final void renameTable(String str, String str2) {
        nativeRenameTable(this.nativePtr, str, str2);
    }

    public final String getTableName(int i) {
        return nativeGetTableName(this.nativePtr, i);
    }

    public final long size() {
        return nativeSize(this.nativePtr);
    }

    public final String getPath() {
        return this.osRealmConfig.a.b;
    }

    public final boolean isEmpty() {
        return nativeIsEmpty(this.nativePtr);
    }

    public final void refresh() {
        nativeRefresh(this.nativePtr);
    }

    public final a getVersionID() {
        long[] nativeGetVersionID = nativeGetVersionID(this.nativePtr);
        return new a(nativeGetVersionID[0], nativeGetVersionID[1]);
    }

    public final boolean isClosed() {
        return nativeIsClosed(this.nativePtr);
    }

    public final void writeCopy(File file, byte[] bArr) {
        if (file.isFile() && file.exists()) {
            throw new IllegalArgumentException("The destination file must not exist");
        }
        nativeWriteCopy(this.nativePtr, file.getAbsolutePath(), bArr);
    }

    public final boolean waitForChange() {
        return nativeWaitForChange(this.nativePtr);
    }

    public final void stopWaitForChange() {
        nativeStopWaitForChange(this.nativePtr);
    }

    public final boolean compact() {
        return nativeCompact(this.nativePtr);
    }

    public final void setAutoRefresh(boolean z) {
        this.capabilities.b();
        nativeSetAutoRefresh(this.nativePtr, z);
    }

    public final boolean isAutoRefresh() {
        return nativeIsAutoRefresh(this.nativePtr);
    }

    public final dks getConfiguration() {
        return this.osRealmConfig.a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        RealmNotifier realmNotifier = this.realmNotifier;
        if (realmNotifier != null) {
            realmNotifier.close();
        }
        synchronized (this.context) {
            nativeCloseSharedRealm(this.nativePtr);
        }
    }

    @Override // defpackage.dlf
    public final long getNativePtr() {
        return this.nativePtr;
    }

    @Override // defpackage.dlf
    public final long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    public final OsSchemaInfo getSchemaInfo() {
        return this.schemaInfo;
    }

    public final void registerSchemaChangedCallback(SchemaChangedCallback schemaChangedCallback) {
        nativeRegisterSchemaChangedCallback(this.nativePtr, schemaChangedCallback);
    }

    public final boolean isPartial() {
        return nativeIsPartial(this.nativePtr);
    }

    public final boolean isSyncRealm() {
        return this.osRealmConfig.b != null;
    }

    final void addIterator(OsResults.a aVar) {
        this.iterators.add(new WeakReference<>(aVar));
    }

    private void detachIterators() {
        for (WeakReference<OsResults.a> weakReference : this.iterators) {
            OsResults.a aVar = weakReference.get();
            if (aVar != null) {
                OsResults osResults = aVar.a;
                if (!osResults.e) {
                    OsResults osResults2 = new OsResults(osResults.b, osResults.c, OsResults.nativeCreateSnapshot(osResults.a));
                    osResults2.e = true;
                    osResults = osResults2;
                }
                aVar.a = osResults;
            }
        }
        this.iterators.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void invalidateIterators() {
        for (WeakReference<OsResults.a> weakReference : this.iterators) {
            OsResults.a aVar = weakReference.get();
            if (aVar != null) {
                aVar.a = null;
            }
        }
        this.iterators.clear();
    }

    final void addPendingRow(dli dliVar) {
        this.pendingRows.add(new WeakReference<>(dliVar));
    }

    public final void removePendingRow(dli dliVar) {
        for (WeakReference<dli> weakReference : this.pendingRows) {
            dli dliVar2 = weakReference.get();
            if (dliVar2 == null || dliVar2 == dliVar) {
                this.pendingRows.remove(weakReference);
            }
        }
    }

    private void executePendingRowQueries() {
        UncheckedRow uncheckedRow;
        for (WeakReference<dli> weakReference : this.pendingRows) {
            dli dliVar = weakReference.get();
            if (dliVar != null) {
                if (dliVar.a == null) {
                    throw new IllegalStateException("The query has been executed. This 'PendingRow' is not valid anymore.");
                }
                if (dliVar.b == null) {
                    throw new IllegalStateException("The 'frontEnd' has not been set.");
                }
                if (dliVar.b.get() != null && OsResults.nativeIsValid(dliVar.a.a)) {
                    OsResults osResults = dliVar.a;
                    long nativeFirstRow = OsResults.nativeFirstRow(osResults.a);
                    if (nativeFirstRow != 0) {
                        Table table = osResults.c;
                        uncheckedRow = UncheckedRow.a(table.c, table, nativeFirstRow);
                    } else {
                        uncheckedRow = null;
                    }
                    dliVar.a();
                    if (uncheckedRow != null) {
                        if (dliVar.c) {
                            dkz.a(uncheckedRow);
                        }
                    } else {
                        dld dldVar = dld.INSTANCE;
                    }
                } else {
                    dliVar.a();
                }
            }
        }
        this.pendingRows.clear();
    }

    private static void runMigrationCallback(long j, OsRealmConfig osRealmConfig, MigrationCallback migrationCallback, long j2) {
        migrationCallback.onMigrationNeeded(new OsSharedRealm(j, osRealmConfig), j2, osRealmConfig.a.d);
    }

    private static void runInitializationCallback(long j, OsRealmConfig osRealmConfig, InitializationCallback initializationCallback) {
        initializationCallback.onInit(new OsSharedRealm(j, osRealmConfig));
    }

    public static OsSharedRealm getInstance(OsRealmConfig.a aVar) {
        OsRealmConfig osRealmConfig = new OsRealmConfig(aVar.a, aVar.f, aVar.e, aVar.b, aVar.c, aVar.d, (byte) 0);
        dlg.c();
        return new OsSharedRealm(osRealmConfig);
    }
}
