package defpackage;

import dagger.MembersInjector;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

/* renamed from: djz  reason: default package */
/* loaded from: classes2.dex */
public abstract class djz<T> implements MembersInjector<T>, Provider<T> {
    public static final djz<Object> a = new djz<Object>() { // from class: dagger.internal.Binding$1
        @Override // defpackage.djz, javax.inject.Provider
        public final Object get() {
            throw new AssertionError("Unresolved binding should never be called to inject.");
        }

        @Override // defpackage.djz, dagger.MembersInjector
        public final void injectMembers(Object obj) {
            throw new AssertionError("Unresolved binding should never be called to inject.");
        }
    };
    public final String b;
    public final String c;
    public final Object d;
    private int e;

    public void a(Linker linker) {
    }

    public void a(Set<djz<?>> set, Set<djz<?>> set2) {
    }

    @Override // dagger.MembersInjector
    public void injectMembers(T t) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public djz(String str, String str2, boolean z, Object obj) {
        if (z && str == null) {
            throw new IllegalArgumentException();
        }
        this.b = str;
        this.c = str2;
        this.d = obj;
        this.e = z ? 1 : 0;
    }

    public T get() {
        throw new UnsupportedOperationException("No injectable constructor on " + getClass().getName());
    }

    public void a() {
        this.e |= 2;
    }

    public boolean b() {
        return (this.e & 2) != 0;
    }

    public boolean c() {
        return (this.e & 1) != 0;
    }

    public boolean d() {
        return (this.e & 4) != 0;
    }

    public void a(boolean z) {
        this.e = z ? this.e | 4 : this.e & (-5);
    }

    public boolean e() {
        return (this.e & 8) != 0;
    }

    public void b(boolean z) {
        this.e = z ? this.e | 8 : this.e & (-9);
    }

    public void c(boolean z) {
        this.e = z ? this.e | 32 : this.e & (-33);
    }

    public boolean f() {
        return (this.e & 32) != 0;
    }

    public void d(boolean z) {
        this.e = z ? this.e | 16 : this.e & (-17);
    }

    public boolean g() {
        return (this.e & 16) != 0;
    }

    public String toString() {
        return getClass().getSimpleName() + "[provideKey=\"" + this.b + "\", memberskey=\"" + this.c + "\"]";
    }
}
