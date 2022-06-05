package defpackage;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlinx.coroutines.internal.UndeliveredElementException;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B'\u0012 \u0010\u0003\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u0018\u001a\u00020\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0014J\u0015\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00028\u00002\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030 H\u0014¢\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\rH\u0014J\n\u0010$\u001a\u0004\u0018\u00010\u0017H\u0014J\u0016\u0010%\u001a\u0004\u0018\u00010\u00172\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030 H\u0014J\u0014\u0010&\u001a\u0004\u0018\u00010'2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0017H\u0002R\u0014\u0010\b\u001a\u00020\t8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0012\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lkotlinx/coroutines/channels/ConflatedChannel;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/AbstractChannel;", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(Lkotlin/jvm/functions/Function1;)V", "bufferDebugString", "", "getBufferDebugString", "()Ljava/lang/String;", "isBufferAlwaysEmpty", "", "()Z", "isBufferAlwaysFull", "isBufferEmpty", "isBufferFull", "isEmpty", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "value", "", "enqueueReceiveInternal", "receive", "Lkotlinx/coroutines/channels/Receive;", "offerInternal", "element", "(Ljava/lang/Object;)Ljava/lang/Object;", "offerSelectInternal", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "onCancelIdempotent", "wasClosed", "pollInternal", "pollSelectInternal", "updateValueLocked", "Lkotlinx/coroutines/internal/UndeliveredElementException;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dww  reason: default package */
/* loaded from: classes2.dex */
public final class dww<E> extends dwk<E> {
    private final ReentrantLock c = new ReentrantLock();
    private Object d = dwl.a;

    @Override // defpackage.dwk
    protected final boolean a() {
        return false;
    }

    @Override // defpackage.dwk
    protected final boolean b() {
        return this.d == dwl.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dwm
    public final Object b(E e) {
        dxd<E> f;
        dyy b;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            dwv<?> g = g();
            if (g != null) {
                return g;
            }
            if (this.d == dwl.a) {
                do {
                    f = f();
                    if (f != null) {
                        if (f instanceof dwv) {
                            return f;
                        }
                        b = f.b(e);
                    }
                } while (b == null);
                if (dug.a()) {
                    if (!(b == dth.a)) {
                        throw new AssertionError();
                    }
                }
                dmg dmgVar = dmg.a;
                reentrantLock.unlock();
                f.c(e);
                return f.f();
            }
            UndeliveredElementException e2 = e(e);
            if (e2 != null) {
                throw e2;
            }
            return dwl.b;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.dwk
    protected final Object c() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            if (this.d == dwl.a) {
                Object g = g();
                if (g == null) {
                    g = dwl.d;
                }
                return g;
            }
            Object obj = this.d;
            this.d = dwl.a;
            dmg dmgVar = dmg.a;
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Finally extract failed */
    @Override // defpackage.dwk
    public final void a(boolean z) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            UndeliveredElementException e = e(dwl.a);
            dmg dmgVar = dmg.a;
            reentrantLock.unlock();
            super.a(z);
            if (e != null) {
                throw e;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    private final UndeliveredElementException e(Object obj) {
        dow<E, dmg> dowVar;
        Object obj2 = this.d;
        UndeliveredElementException undeliveredElementException = null;
        if (obj2 != dwl.a && (dowVar = this.a_) != null) {
            undeliveredElementException = dyt.a((dow<? super Object, dmg>) dowVar, obj2, (UndeliveredElementException) null);
        }
        this.d = obj;
        return undeliveredElementException;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dwk
    public final boolean a(dxb<? super E> dxbVar) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            return super.a((dxb) dxbVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.dwm
    protected final String j() {
        return "(value=" + this.d + ')';
    }
}
