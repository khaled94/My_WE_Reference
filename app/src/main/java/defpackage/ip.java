package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ip  reason: default package */
/* loaded from: classes2.dex */
public final class ip {
    private final List<a<?, ?>> a = new ArrayList();

    public final synchronized <Z, R> void a(Class<Z> cls, Class<R> cls2, io<Z, R> ioVar) {
        this.a.add(new a<>(cls, cls2, ioVar));
    }

    public final synchronized <Z, R> io<Z, R> a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return iq.a();
        }
        for (a<?, ?> aVar : this.a) {
            if (aVar.a(cls, cls2)) {
                return (io<Z, R>) aVar.c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public final synchronized <Z, R> List<Class<R>> b(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a<?, ?> aVar : this.a) {
            if (aVar.a(cls, cls2) && !arrayList.contains(aVar.b)) {
                arrayList.add(aVar.b);
            }
        }
        return arrayList;
    }

    /* renamed from: ip$a */
    /* loaded from: classes2.dex */
    static final class a<Z, R> {
        final Class<Z> a;
        final Class<R> b;
        final io<Z, R> c;

        a(Class<Z> cls, Class<R> cls2, io<Z, R> ioVar) {
            this.a = cls;
            this.b = cls2;
            this.c = ioVar;
        }

        public final boolean a(Class<?> cls, Class<?> cls2) {
            return this.a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.b);
        }
    }
}
