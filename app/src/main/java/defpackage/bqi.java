package defpackage;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bqi  reason: default package */
/* loaded from: classes2.dex */
public final class bqi extends Thread {
    private final Object a = new Object();
    private final BlockingQueue<bqj<?>> b;
    private final /* synthetic */ bqe c;

    public bqi(bqe bqeVar, String str, BlockingQueue<bqj<?>> blockingQueue) {
        this.c = bqeVar;
        aat.a(str);
        aat.a(blockingQueue);
        this.b = blockingQueue;
        setName(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        bqi bqiVar;
        bqi bqiVar2;
        Object obj3;
        Object obj4;
        Semaphore semaphore2;
        Object obj5;
        bqi bqiVar3;
        bqi bqiVar4;
        boolean z;
        Semaphore semaphore3;
        boolean z2 = false;
        while (!z2) {
            try {
                semaphore3 = this.c.h;
                semaphore3.acquire();
                z2 = true;
            } catch (InterruptedException e) {
                a(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                bqj<?> poll = this.b.poll();
                if (poll != null) {
                    Process.setThreadPriority(poll.a ? threadPriority : 10);
                    poll.run();
                } else {
                    synchronized (this.a) {
                        if (this.b.peek() == null) {
                            z = this.c.i;
                            if (!z) {
                                try {
                                    this.a.wait(30000L);
                                } catch (InterruptedException e2) {
                                    a(e2);
                                }
                            }
                        }
                    }
                    obj3 = this.c.g;
                    synchronized (obj3) {
                        if (this.b.peek() == null) {
                            break;
                        }
                    }
                }
            }
            obj4 = this.c.g;
            synchronized (obj4) {
                semaphore2 = this.c.h;
                semaphore2.release();
                obj5 = this.c.g;
                obj5.notifyAll();
                bqiVar3 = this.c.a;
                if (this == bqiVar3) {
                    this.c.a = null;
                } else {
                    bqiVar4 = this.c.b;
                    if (this != bqiVar4) {
                        this.c.q().c.a("Current scheduler thread is neither worker nor network");
                    } else {
                        this.c.b = null;
                    }
                }
            }
        } catch (Throwable th) {
            obj = this.c.g;
            synchronized (obj) {
                semaphore = this.c.h;
                semaphore.release();
                obj2 = this.c.g;
                obj2.notifyAll();
                bqiVar = this.c.a;
                if (this == bqiVar) {
                    this.c.a = null;
                } else {
                    bqiVar2 = this.c.b;
                    if (this != bqiVar2) {
                        this.c.q().c.a("Current scheduler thread is neither worker nor network");
                    } else {
                        this.c.b = null;
                    }
                }
                throw th;
            }
        }
    }

    public final void a() {
        synchronized (this.a) {
            this.a.notifyAll();
        }
    }

    private final void a(InterruptedException interruptedException) {
        this.c.q().f.a(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }
}
