package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ez  reason: default package */
/* loaded from: classes2.dex */
final class ez {
    final Map<String, a> a = new HashMap();
    final b b = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str) {
        a aVar;
        synchronized (this) {
            aVar = (a) lf.a(this.a.get(str), "Argument must not be null");
            if (aVar.b <= 0) {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.b);
            }
            aVar.b--;
            if (aVar.b == 0) {
                a remove = this.a.remove(str);
                if (!remove.equals(aVar)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", safeKey: " + str);
                }
                b bVar = this.b;
                synchronized (bVar.a) {
                    if (bVar.a.size() < 10) {
                        bVar.a.offer(remove);
                    }
                }
            }
        }
        aVar.a.unlock();
    }

    /* renamed from: ez$a */
    /* loaded from: classes2.dex */
    static class a {
        final Lock a = new ReentrantLock();
        int b;

        a() {
        }
    }

    /* renamed from: ez$b */
    /* loaded from: classes2.dex */
    static class b {
        final Queue<a> a = new ArrayDeque();

        b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final a a() {
            a poll;
            synchronized (this.a) {
                poll = this.a.poll();
            }
            return poll == null ? new a() : poll;
        }
    }
}
