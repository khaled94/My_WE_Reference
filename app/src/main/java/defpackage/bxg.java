package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bxg  reason: default package */
/* loaded from: classes2.dex */
public final class bxg<TResult> {
    private final Object a = new Object();
    private Queue<bxf<TResult>> b;
    private boolean c;

    public final void a(bwl<TResult> bwlVar) {
        bxf<TResult> poll;
        synchronized (this.a) {
            if (this.b != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.a) {
                        poll = this.b.poll();
                        if (poll == null) {
                            this.c = false;
                            return;
                        }
                    }
                    poll.a(bwlVar);
                }
            }
        }
    }

    public final void a(bxf<TResult> bxfVar) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new ArrayDeque();
            }
            this.b.add(bxfVar);
        }
    }
}
