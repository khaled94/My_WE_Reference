package io.realm.internal;

/* loaded from: classes2.dex */
public class Util {
    static native String nativeGetTablePrefix();

    public static String a() {
        return nativeGetTablePrefix();
    }
}
