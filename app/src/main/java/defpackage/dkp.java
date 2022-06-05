package defpackage;

import io.realm.exceptions.RealmException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* renamed from: dkp  reason: default package */
/* loaded from: classes2.dex */
public final class dkp extends dkl {
    private static final Object f = new Object();

    /* renamed from: dkp$a */
    /* loaded from: classes2.dex */
    public interface a {
    }

    @Override // defpackage.dkl
    public final /* bridge */ /* synthetic */ String a() {
        return super.a();
    }

    @Override // defpackage.dkl, java.io.Closeable, java.lang.AutoCloseable
    public final /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    public static Object c() {
        try {
            Constructor<?> constructor = Class.forName("io.realm.DefaultRealmModule").getDeclaredConstructors()[0];
            constructor.setAccessible(true);
            return constructor.newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (IllegalAccessException e) {
            throw new RealmException("Could not create an instance of ".concat("io.realm.DefaultRealmModule"), e);
        } catch (InstantiationException e2) {
            throw new RealmException("Could not create an instance of ".concat("io.realm.DefaultRealmModule"), e2);
        } catch (InvocationTargetException e3) {
            throw new RealmException("Could not create an instance of ".concat("io.realm.DefaultRealmModule"), e3);
        }
    }
}
