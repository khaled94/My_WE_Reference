package defpackage;

/* renamed from: eev  reason: default package */
/* loaded from: classes2.dex */
public interface eev<T> {
    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(eew eewVar);
}
