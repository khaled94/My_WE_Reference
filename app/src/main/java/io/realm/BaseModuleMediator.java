package io.realm;

import io.realm.annotations.RealmModule;
import io.realm.sync.Subscription;
import io.realm.sync.permissions.ClassPermissions;
import io.realm.sync.permissions.Permission;
import io.realm.sync.permissions.PermissionUser;
import io.realm.sync.permissions.RealmPermissions;
import io.realm.sync.permissions.Role;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@RealmModule
/* loaded from: classes2.dex */
class BaseModuleMediator extends dlj {
    private static final Set<Class<? extends dku>> a;

    @Override // defpackage.dlj
    public final boolean b() {
        return true;
    }

    BaseModuleMediator() {
    }

    static {
        HashSet hashSet = new HashSet(6);
        hashSet.add(PermissionUser.class);
        hashSet.add(RealmPermissions.class);
        hashSet.add(ClassPermissions.class);
        hashSet.add(Permission.class);
        hashSet.add(Role.class);
        hashSet.add(Subscription.class);
        a = Collections.unmodifiableSet(hashSet);
    }

    @Override // defpackage.dlj
    public final Set<Class<? extends dku>> a() {
        return a;
    }
}
