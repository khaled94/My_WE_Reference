package dagger.internal;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class SetBinding<T> extends djz<Set<T>> {
    private final Set<djz<?>> e = new LinkedHashSet();

    public static <T> void a(Map<String, djz<?>> map, String str, djz<?> djzVar) {
        SetBinding setBinding;
        djz<?> djzVar2 = map.get(str);
        if (djzVar2 instanceof SetBinding) {
            setBinding = (SetBinding) djzVar2;
        } else if (djzVar2 != null) {
            throw new IllegalArgumentException("Duplicate:\n    " + djzVar2 + "\n    " + djzVar);
        } else {
            setBinding = new SetBinding(str, djzVar.d);
            map.put(str, setBinding);
        }
        setBinding.e.add(Linker.a(djzVar));
    }

    private SetBinding(String str, Object obj) {
        super(str, null, false, obj);
    }

    @Override // defpackage.djz
    public final void a(Linker linker) {
        for (djz<?> djzVar : this.e) {
            djzVar.a(linker);
        }
    }

    @Override // defpackage.djz
    public final void a(Set<djz<?>> set, Set<djz<?>> set2) {
        set.addAll(this.e);
    }

    @Override // defpackage.djz
    public final String toString() {
        return "SetBinding" + this.e;
    }

    @Override // defpackage.djz, javax.inject.Provider
    public final /* synthetic */ Object get() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.e.size());
        for (djz<?> djzVar : this.e) {
            linkedHashSet.add(djzVar.get());
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    @Override // defpackage.djz, dagger.MembersInjector
    public final /* synthetic */ void injectMembers(Object obj) {
        throw new UnsupportedOperationException("Cannot inject into a Set binding");
    }
}
