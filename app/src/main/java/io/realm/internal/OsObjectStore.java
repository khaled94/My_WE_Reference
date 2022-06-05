package io.realm.internal;

/* loaded from: classes2.dex */
public class OsObjectStore {
    private static native String nativeGetPrimaryKeyForObject(long j, String str);

    public static String a(OsSharedRealm osSharedRealm, String str) {
        return nativeGetPrimaryKeyForObject(osSharedRealm.getNativePtr(), str);
    }
}
