package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import defpackage.dmb;
import defpackage.dwt;
import defpackage.dyn;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0007STUVWXYB'\u0012 \u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u0019\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J\u0016\u0010\u0019\u001a\u00020\u00062\u000e\u0010\u001a\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001dJ\u0017\u0010\u001e\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0002\b\u001fJ\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0004J\u0016\u0010\"\u001a\u00020\n2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0002J\u0016\u0010%\u001a\u00020\n2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0014JR\u0010&\u001a\u00020\n\"\u0004\b\u0001\u0010'2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H'0)2$\u0010*\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0-\u0012\u0006\u0012\u0004\u0018\u00010,0+2\u0006\u0010.\u001a\u00020/H\u0002ø\u0001\u0000¢\u0006\u0002\u00100J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00028\u000002H\u0086\u0002J\u0010\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u00020\nH\u0014J/\u00105\u001a\u00020\u00062\f\u00106\u001a\b\u0012\u0004\u0012\u000208072\n\u00109\u001a\u0006\u0012\u0002\b\u00030:H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b;\u0010<J\b\u0010=\u001a\u00020\u0006H\u0014J\b\u0010>\u001a\u00020\u0006H\u0014J\n\u0010?\u001a\u0004\u0018\u00010,H\u0014J\u0016\u0010@\u001a\u0004\u0018\u00010,2\n\u0010(\u001a\u0006\u0012\u0002\b\u00030)H\u0014J\u0011\u0010#\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010AJ\"\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\bC\u0010AJ\u001f\u0010D\u001a\u0002H'\"\u0004\b\u0001\u0010'2\u0006\u0010.\u001a\u00020/H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010EJR\u0010F\u001a\u00020\u0006\"\u0004\b\u0001\u0010'2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H'0)2\u0006\u0010.\u001a\u00020/2$\u0010*\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0-\u0012\u0006\u0012\u0004\u0018\u00010,0+H\u0002ø\u0001\u0000¢\u0006\u0002\u0010GJ \u0010H\u001a\u00020\u00062\n\u0010I\u001a\u0006\u0012\u0002\b\u00030J2\n\u0010#\u001a\u0006\u0012\u0002\b\u00030$H\u0002J\u0010\u0010K\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010LH\u0014J\u001c\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\bN\u0010OJX\u0010P\u001a\u00020\u0006\"\u0004\b\u0001\u0010'* \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0-\u0012\u0006\u0012\u0004\u0018\u00010,0+2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H'0)2\u0006\u0010.\u001a\u00020/2\b\u0010Q\u001a\u0004\u0018\u00010,H\u0002ø\u0001\u0000¢\u0006\u0002\u0010RR\u0014\u0010\t\u001a\u00020\n8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\nX¤\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0012\u0010\u000e\u001a\u00020\nX¤\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u00138Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Z"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/AbstractSendChannel;", "Lkotlinx/coroutines/channels/Channel;", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(Lkotlin/jvm/functions/Function1;)V", "hasReceiveOrClosed", "", "getHasReceiveOrClosed", "()Z", "isBufferAlwaysEmpty", "isBufferEmpty", "isClosedForReceive", "isEmpty", "isEmptyImpl", "onReceive", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "onReceiveCatching", "Lkotlinx/coroutines/channels/ChannelResult;", "getOnReceiveCatching", "cancel", "cause", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancelInternal", "cancelInternal$kotlinx_coroutines_core", "describeTryPoll", "Lkotlinx/coroutines/channels/AbstractChannel$TryPollDesc;", "enqueueReceive", "receive", "Lkotlinx/coroutines/channels/Receive;", "enqueueReceiveInternal", "enqueueReceiveSelect", "R", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "receiveMode", "", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;I)Z", "iterator", "Lkotlinx/coroutines/channels/ChannelIterator;", "onCancelIdempotent", "wasClosed", "onCancelIdempotentList", "list", "Lkotlinx/coroutines/internal/InlineList;", "Lkotlinx/coroutines/channels/Send;", "closed", "Lkotlinx/coroutines/channels/Closed;", "onCancelIdempotentList-w-w6eGU", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/Closed;)V", "onReceiveDequeued", "onReceiveEnqueued", "pollInternal", "pollSelectInternal", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveCatching", "receiveCatching-JP2dKIU", "receiveSuspend", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerSelectReceiveMode", "(Lkotlinx/coroutines/selects/SelectInstance;ILkotlin/jvm/functions/Function2;)V", "removeReceiveOnCancel", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "takeFirstReceiveOrPeekClosed", "Lkotlinx/coroutines/channels/ReceiveOrClosed;", "tryReceive", "tryReceive-PtdJZtk", "()Ljava/lang/Object;", "tryStartBlockUnintercepted", "value", "(Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/selects/SelectInstance;ILjava/lang/Object;)V", "Itr", "ReceiveElement", "ReceiveElementWithUndeliveredHandler", "ReceiveHasNext", "ReceiveSelect", "RemoveReceiveOnCancel", "TryPollDesc", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dwk  reason: default package */
/* loaded from: classes2.dex */
public abstract class dwk<E> extends dwm<E> implements dwp<E> {
    protected abstract boolean a();

    protected abstract boolean b();

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "prepare", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dwk$f */
    /* loaded from: classes2.dex */
    public static final class f extends dyn.a {
        final /* synthetic */ dyn a;
        final /* synthetic */ dwk b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(dyn dynVar, dwk dwkVar) {
            super(dynVar);
            this.a = dynVar;
            this.b = dwkVar;
        }

        @Override // defpackage.dyc
        public final /* synthetic */ Object a() {
            if (this.b.b()) {
                return null;
            }
            return dym.a();
        }
    }

    protected Object c() {
        dxf h;
        dyy b2;
        do {
            h = h();
            if (h == null) {
                return dwl.d;
            }
            b2 = h.b();
        } while (b2 == null);
        if (dug.a()) {
            if (!(b2 == dth.a)) {
                throw new AssertionError();
            }
        }
        return h.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(dxb<? super E> dxbVar) {
        int a2;
        dyn i;
        if (a()) {
            dyl dylVar = this.b;
            do {
                i = dylVar.i();
                if (!(!(i instanceof dxf))) {
                    return false;
                }
            } while (!i.a(dxbVar, dylVar));
            return true;
        }
        dyl dylVar2 = this.b;
        dxb<? super E> dxbVar2 = dxbVar;
        f fVar = new f(dxbVar2, this);
        do {
            dyn i2 = dylVar2.i();
            if (!(!(i2 instanceof dxf))) {
                return false;
            }
            a2 = i2.a(dxbVar2, dylVar2, fVar);
            if (a2 == 1) {
                return true;
            }
        } while (a2 != 2);
        return false;
    }

    @Override // defpackage.dxc
    public final void a(CancellationException cancellationException) {
        if (d()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new CancellationException(dqc.a(getClass().getSimpleName(), (Object) " was cancelled"));
        }
        a(a((Throwable) cancellationException));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(boolean z) {
        dwv<?> g2 = g();
        if (g2 != null) {
            Object obj = null;
            while (true) {
                dyn i = g2.i();
                if (!(i instanceof dyl)) {
                    if (dug.a() && !(i instanceof dxf)) {
                        throw new AssertionError();
                    }
                    if (!i.v_()) {
                        i.k();
                    } else {
                        obj = dyk.a(obj, (dxf) i);
                    }
                } else {
                    a(obj);
                    return;
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen".toString());
        }
    }

    @Override // defpackage.dxc
    public final dwr<E> y_() {
        return new a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dwm
    public final dxd<E> f() {
        return super.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(dtf<?> dtfVar, dxb<?> dxbVar) {
        dtfVar.a((dow<? super Throwable, dmg>) new e(dxbVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$RemoveReceiveOnCancel;", "Lkotlinx/coroutines/BeforeResumeCancelHandler;", "receive", "Lkotlinx/coroutines/channels/Receive;", "(Lkotlinx/coroutines/channels/AbstractChannel;Lkotlinx/coroutines/channels/Receive;)V", "invoke", "", "cause", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dwk$e */
    /* loaded from: classes2.dex */
    public final class e extends dsx {
        private final dxb<?> b;

        public e(dxb<?> dxbVar) {
            this.b = dxbVar;
        }

        @Override // defpackage.dow
        public final /* synthetic */ dmg invoke(Throwable th) {
            a(th);
            return dmg.a;
        }

        @Override // defpackage.dte
        public final void a(Throwable th) {
            this.b.v_();
        }

        public final String toString() {
            return "RemoveReceiveOnCancel[" + this.b + ']';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0011\u0010\f\u001a\u00020\rH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u0011\u0010\u0010\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u0011\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\tR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$Itr;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/ChannelIterator;", "channel", "Lkotlinx/coroutines/channels/AbstractChannel;", "(Lkotlinx/coroutines/channels/AbstractChannel;)V", "result", "", "getResult", "()Ljava/lang/Object;", "setResult", "(Ljava/lang/Object;)V", "hasNext", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasNextResult", "hasNextSuspend", "next", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dwk$a */
    /* loaded from: classes2.dex */
    public static final class a<E> implements dwr<E> {
        public final dwk<E> a;
        Object b = dwl.d;

        public a(dwk<E> dwkVar) {
            this.a = dwkVar;
        }

        private static boolean a(Object obj) {
            if (obj instanceof dwv) {
                dwv dwvVar = (dwv) obj;
                if (dwvVar.a != null) {
                    throw dyx.a(dwvVar.e());
                }
                return false;
            }
            return true;
        }

        @Override // defpackage.dwr
        public final E a() {
            E e = (E) this.b;
            if (e instanceof dwv) {
                throw dyx.a(((dwv) e).e());
            }
            if (e != dwl.d) {
                this.b = dwl.d;
                return e;
            }
            throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
        }

        @Override // defpackage.dwr
        public final Object a(dnu<? super Boolean> dnuVar) {
            if (this.b == dwl.d) {
                Object c = this.a.c();
                this.b = c;
                if (c != dwl.d) {
                    return Boolean.valueOf(a(this.b));
                }
                dtg a = dti.a(dnz.a(dnuVar));
                dtg dtgVar = a;
                d dVar = new d(this, dtgVar);
                while (true) {
                    d dVar2 = dVar;
                    if (this.a.a((dxb) dVar2)) {
                        this.a.a(dtgVar, dVar2);
                        break;
                    }
                    Object c2 = this.a.c();
                    this.b = c2;
                    if (c2 instanceof dwv) {
                        dwv dwvVar = (dwv) c2;
                        if (dwvVar.a == null) {
                            Boolean bool = Boolean.FALSE;
                            dmb.a aVar = dmb.a;
                            dtgVar.resumeWith(dmb.d(bool));
                        } else {
                            Throwable e = dwvVar.e();
                            dmb.a aVar2 = dmb.a;
                            dtgVar.resumeWith(dmb.d(dmc.a(e)));
                        }
                    } else if (c2 != dwl.d) {
                        Boolean bool2 = Boolean.TRUE;
                        dow<E, dmg> dowVar = this.a.a_;
                        dtgVar.b((dtg) bool2, (dow<? super Throwable, dmg>) (dowVar == null ? null : dyt.a((dow<? super Object, dmg>) dowVar, c2, dtgVar.getContext())));
                    }
                }
                Object e2 = a.e();
                if (e2 == dny.COROUTINE_SUSPENDED) {
                    dqc.d(dnuVar, TypedValues.Attributes.S_FRAME);
                }
                return e2;
            }
            return Boolean.valueOf(a(this.b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0012\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u00020\n2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0016J\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016J!\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000b\u001a\u00028\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010\u0018R\u0018\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveElement;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/Receive;", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "receiveMode", "", "(Lkotlinx/coroutines/CancellableContinuation;I)V", "completeResumeReceive", "", "value", "(Ljava/lang/Object;)V", "resumeReceiveClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "resumeValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "toString", "", "tryResumeReceive", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dwk$b */
    /* loaded from: classes2.dex */
    public static class b<E> extends dxb<E> {
        public final dtf<Object> a;
        public final int b = 1;

        public b(dtf<Object> dtfVar) {
            this.a = dtfVar;
        }

        public final Object a(E e) {
            if (this.b == 1) {
                dwt.b bVar = dwt.a;
                return dwt.f(dwt.e(e));
            }
            return e;
        }

        @Override // defpackage.dxd
        public final dyy b(E e) {
            Object a = this.a.a((dtf<Object>) a((b<E>) e), d(e));
            if (a == null) {
                return null;
            }
            if (dug.a()) {
                if (!(a == dth.a)) {
                    throw new AssertionError();
                }
            }
            return dth.a;
        }

        @Override // defpackage.dxd
        public final void c(E e) {
            this.a.b(dth.a);
        }

        @Override // defpackage.dxb
        public final void a(dwv<?> dwvVar) {
            if (this.b != 1) {
                Throwable e = dwvVar.e();
                dmb.a aVar = dmb.a;
                this.a.resumeWith(dmb.d(dmc.a(e)));
                return;
            }
            dwt.b bVar = dwt.a;
            dwt f = dwt.f(dwt.b.a(dwvVar.a));
            dmb.a aVar2 = dmb.a;
            this.a.resumeWith(dmb.d(f));
        }

        @Override // defpackage.dyn
        public String toString() {
            return "ReceiveElement@" + Integer.toHexString(System.identityHashCode(this)) + "[receiveMode=" + this.b + ']';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B;\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00028\u0001`\u000b¢\u0006\u0002\u0010\fJ#\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0010R&\u0010\b\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00028\u0001`\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveElementWithUndeliveredHandler;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/AbstractChannel$ReceiveElement;", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "receiveMode", "", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(Lkotlinx/coroutines/CancellableContinuation;ILkotlin/jvm/functions/Function1;)V", "resumeOnCancellationFun", "", "value", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dwk$c */
    /* loaded from: classes2.dex */
    public static final class c<E> extends b<E> {
        public final dow<E, dmg> c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(dtf<Object> dtfVar, dow<? super E, dmg> dowVar) {
            super(dtfVar);
            this.c = dowVar;
        }

        @Override // defpackage.dxb
        public final dow<Throwable, dmg> d(E e) {
            return dyt.a(this.c, e, this.a.getContext());
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0012\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B!\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fJ#\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\n2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J!\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000b\u001a\u00028\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0002\u0010\u001aR\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveHasNext;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/Receive;", "iterator", "Lkotlinx/coroutines/channels/AbstractChannel$Itr;", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/channels/AbstractChannel$Itr;Lkotlinx/coroutines/CancellableContinuation;)V", "completeResumeReceive", "", "value", "(Ljava/lang/Object;)V", "resumeOnCancellationFun", "Lkotlin/Function1;", "", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "resumeReceiveClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", "", "tryResumeReceive", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dwk$d */
    /* loaded from: classes2.dex */
    static class d<E> extends dxb<E> {
        public final a<E> a;
        public final dtf<Boolean> b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(a<E> aVar, dtf<? super Boolean> dtfVar) {
            this.a = aVar;
            this.b = dtfVar;
        }

        @Override // defpackage.dxd
        public final dyy b(E e) {
            Object a = this.b.a((dtf<Boolean>) Boolean.TRUE, d(e));
            if (a == null) {
                return null;
            }
            if (dug.a()) {
                if (!(a == dth.a)) {
                    throw new AssertionError();
                }
            }
            return dth.a;
        }

        @Override // defpackage.dxd
        public final void c(E e) {
            this.a.b = e;
            this.b.b(dth.a);
        }

        @Override // defpackage.dxb
        public final void a(dwv<?> dwvVar) {
            Object obj;
            if (dwvVar.a != null) {
                obj = this.b.a(dwvVar.e());
            } else {
                obj = this.b.a((dtf<Boolean>) Boolean.FALSE);
            }
            if (obj != null) {
                this.a.b = dwvVar;
                this.b.b(obj);
            }
        }

        @Override // defpackage.dxb
        public final dow<Throwable, dmg> d(E e) {
            dow<E, dmg> dowVar = this.a.a.a_;
            if (dowVar == null) {
                return null;
            }
            return dyt.a(dowVar, e, this.b.getContext());
        }

        @Override // defpackage.dyn
        public final String toString() {
            return dqc.a("ReceiveHasNext@", (Object) Integer.toHexString(System.identityHashCode(this)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dog(b = "AbstractChannel.kt", c = {633}, d = "receiveCatching-JP2dKIU", e = "kotlinx.coroutines.channels.AbstractChannel")
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dwk$g */
    /* loaded from: classes2.dex */
    public static final class g extends doe {
        /* synthetic */ Object a;
        final /* synthetic */ dwk<E> b;
        int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(dwk<E> dwkVar, dnu<? super g> dnuVar) {
            super(dnuVar);
            this.b = dwkVar;
        }

        @Override // defpackage.doc
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            Object a_ = this.b.a_((dnu) this);
            return a_ == dny.COROUTINE_SUSPENDED ? a_ : dwt.f(a_);
        }
    }

    protected void a(Object obj) {
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                ((dxf) obj).c();
            } else if (obj != null) {
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size() - 1;
                if (size < 0) {
                    return;
                }
                while (true) {
                    int i = size - 1;
                    ((dxf) arrayList.get(size)).c();
                    if (i < 0) {
                        return;
                    }
                    size = i;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            }
        }
    }

    public boolean d() {
        dyn a2 = dym.a(this.b.g());
        dwv dwvVar = null;
        dwv dwvVar2 = a2 instanceof dwv ? (dwv) a2 : null;
        if (dwvVar2 != null) {
            dwm.a(dwvVar2);
            dwvVar = dwvVar2;
        }
        return dwvVar != null && b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Type inference failed for: r3v6, types: [dwk$b] */
    /* JADX WARN: Type inference failed for: r6v0, types: [dwk<E>, dwk] */
    @Override // defpackage.dxc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a_(defpackage.dnu<? super defpackage.dwt<? extends E>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.dwk.g
            if (r0 == 0) goto L14
            r0 = r7
            dwk$g r0 = (defpackage.dwk.g) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.c
            int r7 = r7 - r2
            r0.c = r7
            goto L19
        L14:
            dwk$g r0 = new dwk$g
            r0.<init>(r6, r7)
        L19:
            java.lang.Object r7 = r0.a
            dny r1 = defpackage.dny.COROUTINE_SUSPENDED
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L26
            goto La6
        L26:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2e:
            java.lang.Object r7 = r6.c()
            dyy r2 = defpackage.dwl.d
            if (r7 == r2) goto L4c
            boolean r0 = r7 instanceof defpackage.dwv
            if (r0 == 0) goto L45
            dwt$b r0 = defpackage.dwt.a
            dwv r7 = (defpackage.dwv) r7
            java.lang.Throwable r7 = r7.a
            java.lang.Object r7 = defpackage.dwt.b.a(r7)
            return r7
        L45:
            dwt$b r0 = defpackage.dwt.a
            java.lang.Object r7 = defpackage.dwt.e(r7)
            return r7
        L4c:
            r0.c = r3
            dnu r7 = defpackage.dnz.a(r0)
            dtg r7 = defpackage.dti.a(r7)
            r2 = r7
            dtf r2 = (defpackage.dtf) r2
            dow<E, dmg> r3 = r6.a_
            if (r3 != 0) goto L63
            dwk$b r3 = new dwk$b
            r3.<init>(r2)
            goto L6c
        L63:
            dwk$c r3 = new dwk$c
            dow<E, dmg> r4 = r6.a_
            r3.<init>(r2, r4)
            dwk$b r3 = (defpackage.dwk.b) r3
        L6c:
            r4 = r3
            dxb r4 = (defpackage.dxb) r4
            boolean r5 = r6.a(r4)
            if (r5 == 0) goto L79
            r6.a(r2, r4)
            goto L96
        L79:
            java.lang.Object r4 = r6.c()
            boolean r5 = r4 instanceof defpackage.dwv
            if (r5 == 0) goto L87
            dwv r4 = (defpackage.dwv) r4
            r3.a(r4)
            goto L96
        L87:
            dyy r5 = defpackage.dwl.d
            if (r4 == r5) goto L6c
            java.lang.Object r5 = r3.a(r4)
            dow r3 = r3.d(r4)
            r2.b(r5, r3)
        L96:
            java.lang.Object r7 = r7.e()
            dny r2 = defpackage.dny.COROUTINE_SUSPENDED
            if (r7 != r2) goto La3
            java.lang.String r2 = "frame"
            defpackage.dqc.d(r0, r2)
        La3:
            if (r7 != r1) goto La6
            return r1
        La6:
            dwt r7 = (defpackage.dwt) r7
            java.lang.Object r7 = r7.b
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwk.a_(dnu):java.lang.Object");
    }
}
