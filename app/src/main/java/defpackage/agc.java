package defpackage;

import dalvik.system.PathClassLoader;

/* renamed from: agc  reason: default package */
/* loaded from: classes.dex */
public final class agc extends PathClassLoader {
    public agc(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    @Override // java.lang.ClassLoader
    protected final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}
