package defpackage;

import java.util.Objects;

/* renamed from: efn  reason: default package */
/* loaded from: classes2.dex */
public final class efn<T> {
    public final ebc a;
    public final T b;
    public final ebd c;

    public static <T> efn<T> a(T t, ebc ebcVar) {
        Objects.requireNonNull(ebcVar, "rawResponse == null");
        if (!ebcVar.d()) {
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        return new efn<>(ebcVar, t, null);
    }

    public static <T> efn<T> a(ebd ebdVar, ebc ebcVar) {
        Objects.requireNonNull(ebdVar, "body == null");
        Objects.requireNonNull(ebcVar, "rawResponse == null");
        if (ebcVar.d()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new efn<>(ebcVar, null, ebdVar);
    }

    private efn(ebc ebcVar, T t, ebd ebdVar) {
        this.a = ebcVar;
        this.b = t;
        this.c = ebdVar;
    }

    public final String toString() {
        return this.a.toString();
    }
}
