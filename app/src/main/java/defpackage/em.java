package defpackage;

import defpackage.ev;
import java.util.Queue;

/* renamed from: em  reason: default package */
/* loaded from: classes2.dex */
abstract class em<T extends ev> {
    private final Queue<T> a = lg.a(20);

    abstract T a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final T b() {
        T poll = this.a.poll();
        return poll == null ? a() : poll;
    }

    public final void a(T t) {
        if (this.a.size() < 20) {
            this.a.offer(t);
        }
    }
}
