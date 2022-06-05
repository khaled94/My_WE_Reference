package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import defpackage.dmb;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\t\u0010\u0018\u001a\u00020\u0019H\u0096\u0002J\u000e\u0010\u001a\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u001bJ\r\u0010\u001c\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001bJ\u001e\u0010\u001d\u001a\u00020\u00052\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u001fH\u0016ø\u0001\u0000¢\u0006\u0002\u0010 J\u0019\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010#J\u001f\u0010$\u001a\u00020\u00052\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010&R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0012\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lkotlin/sequences/SequenceBuilderIterator;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/sequences/SequenceScope;", "", "Lkotlin/coroutines/Continuation;", "", "()V", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "nextIterator", "nextStep", "getNextStep", "()Lkotlin/coroutines/Continuation;", "setNextStep", "(Lkotlin/coroutines/Continuation;)V", "nextValue", "Ljava/lang/Object;", "state", "", "Lkotlin/sequences/State;", "exceptionalState", "", "hasNext", "", "next", "()Ljava/lang/Object;", "nextNotReady", "resumeWith", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "yield", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "yieldAll", "iterator", "(Ljava/util/Iterator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
/* renamed from: drr  reason: default package */
/* loaded from: classes2.dex */
final class drr<T> extends drs<T> implements dnu<dmg>, dqk, Iterator<T> {
    dnu<? super dmg> a;
    private int b;
    private T c;
    private Iterator<? extends T> d;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.b;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i != 4) {
                        throw a();
                    }
                    return false;
                }
                Iterator<? extends T> it = this.d;
                dqc.a(it);
                if (it.hasNext()) {
                    this.b = 2;
                    return true;
                }
                this.d = null;
            }
            this.b = 5;
            dnu<? super dmg> dnuVar = this.a;
            dqc.a(dnuVar);
            this.a = null;
            dmg dmgVar = dmg.a;
            dmb.a aVar = dmb.a;
            dnuVar.resumeWith(dmb.d(dmgVar));
        }
    }

    @Override // java.util.Iterator
    public final T next() {
        do {
            int i = this.b;
            if (i != 0 && i != 1) {
                if (i == 2) {
                    this.b = 1;
                    Iterator<? extends T> it = this.d;
                    dqc.a(it);
                    return it.next();
                } else if (i == 3) {
                    this.b = 0;
                    T t = this.c;
                    this.c = null;
                    return t;
                } else {
                    throw a();
                }
            }
        } while (hasNext());
        throw new NoSuchElementException();
    }

    private final Throwable a() {
        int i = this.b;
        if (i != 4) {
            if (i == 5) {
                return new IllegalStateException("Iterator has failed.");
            }
            return new IllegalStateException("Unexpected state of the iterator: " + this.b);
        }
        return new NoSuchElementException();
    }

    @Override // defpackage.drs
    public final Object a(T t, dnu<? super dmg> dnuVar) {
        this.c = t;
        this.b = 3;
        this.a = dnuVar;
        dny dnyVar = dny.COROUTINE_SUSPENDED;
        if (dnyVar == dny.COROUTINE_SUSPENDED) {
            dqc.d(dnuVar, TypedValues.Attributes.S_FRAME);
        }
        return dnyVar == dny.COROUTINE_SUSPENDED ? dnyVar : dmg.a;
    }

    @Override // defpackage.drs
    public final Object a(Iterator<? extends T> it, dnu<? super dmg> dnuVar) {
        if (!it.hasNext()) {
            return dmg.a;
        }
        this.d = it;
        this.b = 2;
        this.a = dnuVar;
        dny dnyVar = dny.COROUTINE_SUSPENDED;
        if (dnyVar == dny.COROUTINE_SUSPENDED) {
            dqc.d(dnuVar, TypedValues.Attributes.S_FRAME);
        }
        return dnyVar == dny.COROUTINE_SUSPENDED ? dnyVar : dmg.a;
    }

    @Override // defpackage.dnu
    public final void resumeWith(Object obj) {
        this.b = 4;
    }

    @Override // defpackage.dnu
    public final dnw getContext() {
        return dnx.a;
    }
}
