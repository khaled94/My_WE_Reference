package dagger;

import dagger.internal.Linker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class ObjectGraph {
    public abstract <T> T get(Class<T> cls);

    public abstract <T> T inject(T t);

    public abstract void injectStatics();

    public abstract ObjectGraph plus(Object... objArr);

    public abstract void validate();

    ObjectGraph() {
    }

    public static ObjectGraph create(Object... objArr) {
        return DaggerObjectGraph.makeGraph(null, new dkf(new dkj(), new dkk()), objArr);
    }

    /* loaded from: classes2.dex */
    static class DaggerObjectGraph extends ObjectGraph {
        private final DaggerObjectGraph base;
        private final Map<String, Class<?>> injectableTypes;
        private final Linker linker;
        private final dkd plugin;
        private final Map<Class<?>, dkg> staticInjections;

        DaggerObjectGraph(DaggerObjectGraph daggerObjectGraph, Linker linker, dkd dkdVar, Map<Class<?>, dkg> map, Map<String, Class<?>> map2) {
            if (linker != null) {
                if (dkdVar == null) {
                    throw new NullPointerException("plugin");
                }
                if (map == null) {
                    throw new NullPointerException("staticInjections");
                }
                if (map2 == null) {
                    throw new NullPointerException("injectableTypes");
                }
                this.base = daggerObjectGraph;
                this.linker = linker;
                this.plugin = dkdVar;
                this.staticInjections = map;
                this.injectableTypes = map2;
                return;
            }
            throw new NullPointerException("linker");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ObjectGraph makeGraph(DaggerObjectGraph daggerObjectGraph, dkd dkdVar, Object... objArr) {
            Linker linker;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            dki dkiVar = new dki();
            dki dkiVar2 = new dki();
            Iterator<dkc<?>> it = dkf.a(dkdVar, objArr).values().iterator();
            while (true) {
                linker = null;
                if (!it.hasNext()) {
                    break;
                }
                dkc<?> next = it.next();
                for (String str : next.a) {
                    linkedHashMap.put(str, next.b().getClass());
                }
                for (Class<?> cls : next.b) {
                    linkedHashMap2.put(cls, null);
                }
                next.a(next.c ? dkiVar2 : dkiVar);
            }
            if (daggerObjectGraph != null) {
                linker = daggerObjectGraph.linker;
            }
            Linker linker2 = new Linker(linker, dkdVar, new dkh());
            linker2.a(dkiVar);
            linker2.a(dkiVar2);
            return new DaggerObjectGraph(daggerObjectGraph, linker2, dkdVar, linkedHashMap2, linkedHashMap);
        }

        @Override // dagger.ObjectGraph
        public ObjectGraph plus(Object... objArr) {
            linkEverything();
            return makeGraph(this, this.plugin, objArr);
        }

        private void linkStaticInjections() {
            for (Map.Entry<Class<?>, dkg> entry : this.staticInjections.entrySet()) {
                dkg value = entry.getValue();
                if (value == null) {
                    value = this.plugin.a(entry.getKey());
                    entry.setValue(value);
                }
                value.a(this.linker);
            }
        }

        private void linkInjectableTypes() {
            for (Map.Entry<String, Class<?>> entry : this.injectableTypes.entrySet()) {
                this.linker.a(entry.getKey(), (Object) entry.getValue(), false);
            }
        }

        @Override // dagger.ObjectGraph
        public void validate() {
            Map<String, djz<?>> linkEverything = linkEverything();
            new dke();
            Collection<djz<?>> values = linkEverything.values();
            dke.a(values, new ArrayList());
            dke.a(values);
        }

        private Map<String, djz<?>> linkEverything() {
            Map<String, djz<?>> map;
            synchronized (this.linker) {
                linkStaticInjections();
                linkInjectableTypes();
                Linker linker = this.linker;
                for (djz<?> djzVar : linker.b.values()) {
                    if (!djzVar.b()) {
                        linker.a.add(djzVar);
                    }
                }
                linker.a();
                map = linker.b;
            }
            return map;
        }

        @Override // dagger.ObjectGraph
        public void injectStatics() {
            synchronized (this.linker) {
                linkStaticInjections();
                this.linker.a();
                linkStaticInjections();
            }
            for (Map.Entry<Class<?>, dkg> entry : this.staticInjections.entrySet()) {
                entry.getValue().a();
            }
        }

        @Override // dagger.ObjectGraph
        public <T> T get(Class<T> cls) {
            String a = dka.a(cls);
            return (T) getInjectableTypeBinding(cls.isInterface() ? a : dka.a((Class<?>) cls), a).get();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // dagger.ObjectGraph
        public <T> T inject(T t) {
            String a = dka.a(t.getClass());
            getInjectableTypeBinding(a, a).injectMembers(t);
            return t;
        }

        private djz<?> getInjectableTypeBinding(String str, String str2) {
            djz<?> a;
            Class<?> cls = null;
            for (DaggerObjectGraph daggerObjectGraph = this; daggerObjectGraph != null; daggerObjectGraph = daggerObjectGraph.base) {
                cls = daggerObjectGraph.injectableTypes.get(str);
                if (cls != null) {
                    break;
                }
            }
            if (cls == null) {
                throw new IllegalArgumentException("No inject registered for " + str + ". You must explicitly add it to the 'injects' option in one of your modules.");
            }
            synchronized (this.linker) {
                a = this.linker.a(str2, (Object) cls, false);
                if (a == null || !a.b()) {
                    this.linker.a();
                    a = this.linker.a(str2, (Object) cls, false);
                }
            }
            return a;
        }
    }
}
