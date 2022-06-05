package defpackage;

import java.lang.reflect.Constructor;

/* renamed from: dkj  reason: default package */
/* loaded from: classes2.dex */
public final class dkj implements dkd {
    @Override // defpackage.dkd
    public final <T> dkc<T> a(Class<? extends T> cls, T t) {
        return (dkc) a(cls.getName(), "$$ModuleAdapter");
    }

    @Override // defpackage.dkd
    public final djz<?> a(String str, String str2, boolean z) {
        return (djz) a(str2, "$$InjectAdapter");
    }

    @Override // defpackage.dkd
    public final dkg a(Class<?> cls) {
        return (dkg) a(cls.getName(), "$$StaticInjection");
    }

    private static <T> T a(String str, String str2) {
        String str3 = str + str2;
        try {
            Constructor<?> constructor = Class.forName(str3).getConstructor(new Class[0]);
            constructor.setAccessible(true);
            return (T) constructor.newInstance(new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException("Unexpected failure loading ".concat(String.valueOf(str3)), e);
        }
    }
}
