package defpackage;

import defpackage.dkp;
import io.realm.CompactOnLaunchCallback;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsRealmConfig;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: dks  reason: default package */
/* loaded from: classes2.dex */
public final class dks {
    protected static final dlj a;
    private static final Object j;
    public final String b;
    public final byte[] c;
    public final long d;
    public final boolean e;
    public final OsRealmConfig.b f;
    public final boolean g;
    public final CompactOnLaunchCallback h;
    public final boolean i;
    private final File k;
    private final String l;
    private final String m;
    private final dkt n;
    private final dlj o;
    private final dlq p;
    private final dkp.a q;

    static {
        Object c = dkp.c();
        j = c;
        if (c != null) {
            dlj a2 = a(c.getClass().getCanonicalName());
            if (!a2.b()) {
                throw new ExceptionInInitializerError("RealmTransformer doesn't seem to be applied. Please update the project configuration to use the Realm Gradle plugin. See https://realm.io/news/android-installation-change/");
            }
            a = a2;
            return;
        }
        a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dks dksVar = (dks) obj;
            if (this.d != dksVar.d || this.e != dksVar.e || this.g != dksVar.g || this.i != dksVar.i) {
                return false;
            }
            File file = this.k;
            if (file == null ? dksVar.k != null : !file.equals(dksVar.k)) {
                return false;
            }
            String str = this.l;
            if (str == null ? dksVar.l != null : !str.equals(dksVar.l)) {
                return false;
            }
            if (!this.b.equals(dksVar.b)) {
                return false;
            }
            String str2 = this.m;
            if (str2 == null ? dksVar.m != null : !str2.equals(dksVar.m)) {
                return false;
            }
            if (!Arrays.equals(this.c, dksVar.c)) {
                return false;
            }
            dkt dktVar = this.n;
            if (dktVar == null ? dksVar.n != null : !dktVar.equals(dksVar.n)) {
                return false;
            }
            if (this.f != dksVar.f || !this.o.equals(dksVar.o)) {
                return false;
            }
            dlq dlqVar = this.p;
            if (dlqVar == null ? dksVar.p != null : !dlqVar.equals(dksVar.p)) {
                return false;
            }
            dkp.a aVar = this.q;
            if (aVar == null ? dksVar.q != null : !aVar.equals(dksVar.q)) {
                return false;
            }
            CompactOnLaunchCallback compactOnLaunchCallback = this.h;
            CompactOnLaunchCallback compactOnLaunchCallback2 = dksVar.h;
            if (compactOnLaunchCallback != null) {
                return compactOnLaunchCallback.equals(compactOnLaunchCallback2);
            }
            if (compactOnLaunchCallback2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        File file = this.k;
        int i = 0;
        int hashCode = (file != null ? file.hashCode() : 0) * 31;
        String str = this.l;
        int hashCode2 = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.b.hashCode()) * 31;
        String str2 = this.m;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        long j2 = this.d;
        int hashCode4 = (((((hashCode2 + hashCode3) * 31) + Arrays.hashCode(this.c)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        dkt dktVar = this.n;
        int hashCode5 = (((((((hashCode4 + (dktVar != null ? dktVar.hashCode() : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f.hashCode()) * 31) + this.o.hashCode()) * 31;
        dlq dlqVar = this.p;
        int hashCode6 = (hashCode5 + (dlqVar != null ? dlqVar.hashCode() : 0)) * 31;
        dkp.a aVar = this.q;
        int hashCode7 = (((hashCode6 + (aVar != null ? aVar.hashCode() : 0)) * 31) + (this.g ? 1 : 0)) * 31;
        CompactOnLaunchCallback compactOnLaunchCallback = this.h;
        if (compactOnLaunchCallback != null) {
            i = compactOnLaunchCallback.hashCode();
        }
        return ((hashCode7 + i) * 31) + (this.i ? 1 : 0);
    }

    private static dlj a(String str) {
        String[] split = str.split("\\.");
        String format = String.format(Locale.US, "io.realm.%s%s", split[split.length - 1], "Mediator");
        try {
            Constructor<?> constructor = Class.forName(format).getDeclaredConstructors()[0];
            constructor.setAccessible(true);
            return (dlj) constructor.newInstance(new Object[0]);
        } catch (ClassNotFoundException e) {
            throw new RealmException("Could not find ".concat(String.valueOf(format)), e);
        } catch (IllegalAccessException e2) {
            throw new RealmException("Could not create an instance of ".concat(String.valueOf(format)), e2);
        } catch (InstantiationException e3) {
            throw new RealmException("Could not create an instance of ".concat(String.valueOf(format)), e3);
        } catch (InvocationTargetException e4) {
            throw new RealmException("Could not create an instance of ".concat(String.valueOf(format)), e4);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("realmDirectory: ");
        File file = this.k;
        sb.append(file != null ? file.toString() : "");
        sb.append("\n");
        sb.append("realmFileName : ");
        sb.append(this.l);
        sb.append("\n");
        sb.append("canonicalPath: ");
        sb.append(this.b);
        sb.append("\n");
        sb.append("key: [length: ");
        sb.append(this.c == null ? 0 : 64);
        sb.append("]");
        sb.append("\n");
        sb.append("schemaVersion: ");
        sb.append(Long.toString(this.d));
        sb.append("\n");
        sb.append("migration: ");
        sb.append(this.n);
        sb.append("\n");
        sb.append("deleteRealmIfMigrationNeeded: ");
        sb.append(this.e);
        sb.append("\n");
        sb.append("durability: ");
        sb.append(this.f);
        sb.append("\n");
        sb.append("schemaMediator: ");
        sb.append(this.o);
        sb.append("\n");
        sb.append("readOnly: ");
        sb.append(this.g);
        sb.append("\n");
        sb.append("compactOnLaunch: ");
        sb.append(this.h);
        return sb.toString();
    }
}
