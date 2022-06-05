package dagger.internal;

import dagger.Lazy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class LazyBinding<T> extends djz<Lazy<T>> {
    private static final Object e = new Object();
    private final String f;
    private djz<T> g;

    public LazyBinding(String str, Object obj, String str2) {
        super(str, null, false, obj);
        this.f = str2;
    }

    @Override // defpackage.djz
    public final void a(Linker linker) {
        this.g = (djz<T>) linker.a(this.f, this.d, true);
    }

    @Override // defpackage.djz, javax.inject.Provider
    public final /* synthetic */ Object get() {
        return new Lazy<T>() { // from class: dagger.internal.LazyBinding.1
            private volatile Object b = LazyBinding.e;

            @Override // dagger.Lazy
            public final T get() {
                if (this.b == LazyBinding.e) {
                    synchronized (this) {
                        if (this.b == LazyBinding.e) {
                            this.b = LazyBinding.this.g.get();
                        }
                    }
                }
                return (T) this.b;
            }
        };
    }

    @Override // defpackage.djz, dagger.MembersInjector
    public final /* synthetic */ void injectMembers(Object obj) {
        throw new UnsupportedOperationException();
    }
}
