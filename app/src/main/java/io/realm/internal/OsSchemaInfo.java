package io.realm.internal;

/* loaded from: classes2.dex */
public class OsSchemaInfo implements dlf {
    private static final long b = nativeGetFinalizerPtr();
    private long a;
    private final OsSharedRealm c;

    private static native long nativeGetFinalizerPtr();

    /* JADX INFO: Access modifiers changed from: package-private */
    public OsSchemaInfo(long j, OsSharedRealm osSharedRealm) {
        this.a = j;
        this.c = osSharedRealm;
    }

    @Override // defpackage.dlf
    public long getNativePtr() {
        return this.a;
    }

    @Override // defpackage.dlf
    public long getNativeFinalizerPtr() {
        return b;
    }
}
