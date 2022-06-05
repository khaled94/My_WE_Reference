package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cmp  reason: default package */
/* loaded from: classes2.dex */
public final class cmp extends cly {
    private final Set<Class<?>> a;
    private final Set<Class<?>> b;
    private final Set<Class<?>> c;
    private final Set<Class<?>> d;
    private final Set<Class<?>> e;
    private final cmc f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cmp(clz<?> clzVar, cmc cmcVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (cml cmlVar : clzVar.b) {
            if (cmlVar.b()) {
                if (cmlVar.a()) {
                    hashSet3.add(cmlVar.a);
                } else {
                    hashSet.add(cmlVar.a);
                }
            } else if (cmlVar.a()) {
                hashSet4.add(cmlVar.a);
            } else {
                hashSet2.add(cmlVar.a);
            }
        }
        if (!clzVar.d.isEmpty()) {
            hashSet.add(cms.class);
        }
        this.a = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        this.c = Collections.unmodifiableSet(hashSet3);
        this.d = Collections.unmodifiableSet(hashSet4);
        this.e = clzVar.d;
        this.f = cmcVar;
    }

    @Override // defpackage.cly, defpackage.cmc
    public final <T> T a(Class<T> cls) {
        if (!this.a.contains(cls)) {
            throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t = (T) this.f.a(cls);
        return !cls.equals(cms.class) ? t : (T) new a(this.e, (cms) t);
    }

    @Override // defpackage.cmc
    public final <T> cow<T> c(Class<T> cls) {
        if (!this.b.contains(cls)) {
            throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
        }
        return this.f.c(cls);
    }

    @Override // defpackage.cmc
    public final <T> cow<Set<T>> d(Class<T> cls) {
        if (!this.d.contains(cls)) {
            throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
        }
        return this.f.d(cls);
    }

    @Override // defpackage.cly, defpackage.cmc
    public final <T> Set<T> b(Class<T> cls) {
        if (!this.c.contains(cls)) {
            throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
        }
        return this.f.b(cls);
    }

    /* renamed from: cmp$a */
    /* loaded from: classes2.dex */
    static class a implements cms {
        private final Set<Class<?>> a;
        private final cms b;

        public a(Set<Class<?>> set, cms cmsVar) {
            this.a = set;
            this.b = cmsVar;
        }
    }
}
