package defpackage;

import io.realm.exceptions.RealmException;
import java.lang.reflect.InvocationTargetException;

/* renamed from: dlg  reason: default package */
/* loaded from: classes2.dex */
public final class dlg {
    private static final dlg a = new dlg();
    private static dlg b;

    public static Object[] a() {
        return new Object[12];
    }

    static {
        b = null;
        try {
            b = (dlg) Class.forName("io.realm.internal.SyncObjectServerFacade").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
        } catch (IllegalAccessException e) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e);
        } catch (InstantiationException e2) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e2);
        } catch (NoSuchMethodException e3) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e3);
        } catch (InvocationTargetException e4) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e4.getTargetException());
        }
    }

    public static dlg b() {
        return a;
    }

    public static dlg c() {
        dlg dlgVar = b;
        return dlgVar != null ? dlgVar : a;
    }
}
