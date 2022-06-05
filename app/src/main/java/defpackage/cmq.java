package defpackage;

/* renamed from: cmq  reason: default package */
/* loaded from: classes2.dex */
public final class cmq<T> {
    public final Class<T> a;
    public final T b;

    public final String toString() {
        return String.format("Event{type: %s, payload: %s}", this.a, this.b);
    }
}
