package dagger.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class BuiltInBinding<T> extends djz<T> {
    private final String e;
    private djz<?> f;

    public BuiltInBinding(String str, Object obj, String str2) {
        super(str, null, false, obj);
        this.e = str2;
    }

    @Override // defpackage.djz
    public final void a(Linker linker) {
        this.f = linker.a(this.e, this.d, true);
    }

    @Override // defpackage.djz, dagger.MembersInjector
    public final void injectMembers(T t) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.djz, javax.inject.Provider
    public final T get() {
        return (T) this.f;
    }
}
