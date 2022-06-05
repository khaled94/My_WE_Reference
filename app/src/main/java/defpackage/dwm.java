package defpackage;

import androidx.exifinterface.media.ExifInterface;
import defpackage.dwt;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.internal.UndeliveredElementException;

@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u000006:\u0004defgB)\u0012 \u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u000e\u0012\u0002\b\u00030\u0011j\u0006\u0012\u0002\b\u0003`\u00122\u0006\u0010\u0010\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0010\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u00020\u00032\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010!\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00028\u00002\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0002¢\u0006\u0004\b!\u0010\"J\u001b\u0010!\u001a\u00020\b2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0002¢\u0006\u0004\b!\u0010#J)\u0010&\u001a\u00020\u00032\u0018\u0010%\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`$H\u0016¢\u0006\u0004\b&\u0010\u0007J\u0019\u0010'\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00028\u0000H\u0014¢\u0006\u0004\b+\u0010,J#\u0010/\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00028\u00002\n\u0010.\u001a\u0006\u0012\u0002\b\u00030-H\u0014¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u000201H\u0014¢\u0006\u0004\b2\u00103JX\u00109\u001a\u00020\u0003\"\u0004\b\u0001\u001042\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010-2\u0006\u0010\u0010\u001a\u00028\u00002(\u00108\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000107\u0012\u0006\u0012\u0004\u0018\u00010\u001a05H\u0002ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u001b\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010;J\u001d\u0010=\u001a\b\u0012\u0002\b\u0003\u0018\u00010<2\u0006\u0010\u0010\u001a\u00028\u0000H\u0004¢\u0006\u0004\b=\u0010>J\u001b\u0010?\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b?\u0010;J\u0017\u0010@\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010<H\u0014¢\u0006\u0004\b@\u0010AJ\u0011\u0010B\u001a\u0004\u0018\u00010\u0018H\u0004¢\u0006\u0004\bB\u0010CJ\u000f\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bE\u0010FJ$\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00030G2\u0006\u0010\u0010\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bH\u0010,J+\u0010J\u001a\u00020\u0003*\u0006\u0012\u0002\b\u0003072\u0006\u0010\u0010\u001a\u00028\u00002\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0002¢\u0006\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020D8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bL\u0010FR\u001a\u0010P\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u001a\u0010R\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010OR\u0014\u0010S\u001a\u00020\n8$X¤\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020\n8$X¤\u0004¢\u0006\u0006\u001a\u0004\bU\u0010TR\u0011\u0010V\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bV\u0010TR\u0014\u0010W\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010TR#\u0010[\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000060X8F¢\u0006\u0006\u001a\u0004\bY\u0010ZR.\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00048\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\\R\u001a\u0010^\u001a\u00020]8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020D8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u0010F\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006h"}, d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel;", ExifInterface.LONGITUDE_EAST, "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "cause", "", "close", "(Ljava/lang/Throwable;)Z", "", "countQueueSize", "()I", "element", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/internal/AddLastDesc;", "describeSendBuffered", "(Ljava/lang/Object;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/channels/AbstractSendChannel$TryOfferDesc;", "describeTryOffer", "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/AbstractSendChannel$TryOfferDesc;", "Lkotlinx/coroutines/channels/Send;", "send", "", "enqueueSend", "(Lkotlinx/coroutines/channels/Send;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/Closed;", "closed", "helpClose", "(Lkotlinx/coroutines/channels/Closed;)V", "helpCloseAndGetSendException", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/Closed;)Ljava/lang/Throwable;", "(Lkotlinx/coroutines/channels/Closed;)Ljava/lang/Throwable;", "Lkotlinx/coroutines/channels/Handler;", "handler", "invokeOnClose", "invokeOnCloseHandler", "(Ljava/lang/Throwable;)V", "offer", "(Ljava/lang/Object;)Z", "offerInternal", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "offerSelectInternal", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "onClosedIdempotent", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "R", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/SendChannel;", "Lkotlin/coroutines/Continuation;", "block", "registerSelectSend", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ReceiveOrClosed;", "sendBuffered", "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/ReceiveOrClosed;", "sendSuspend", "takeFirstReceiveOrPeekClosed", "()Lkotlinx/coroutines/channels/ReceiveOrClosed;", "takeFirstSendOrPeekClosed", "()Lkotlinx/coroutines/channels/Send;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "trySend", "helpCloseAndResumeWithSendException", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlinx/coroutines/channels/Closed;)V", "getBufferDebugString", "bufferDebugString", "getClosedForReceive", "()Lkotlinx/coroutines/channels/Closed;", "closedForReceive", "getClosedForSend", "closedForSend", "isBufferAlwaysFull", "()Z", "isBufferFull", "isClosedForSend", "isFullImpl", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "onSend", "Lkotlin/jvm/functions/Function1;", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "queue", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "getQueue", "()Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "getQueueDebugStateString", "queueDebugStateString", "SendBuffered", "SendBufferedDesc", "SendSelect", "TryOfferDesc", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dwm  reason: default package */
/* loaded from: classes2.dex */
public abstract class dwm<E> implements dxg<E> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(dwm.class, Object.class, "onCloseHandler");
    protected final dow<E, dmg> a_ = null;
    final dyl b = new dyl();
    private volatile /* synthetic */ Object onCloseHandler = null;

    protected String j() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object b(E e) {
        dxd<E> f;
        dyy b;
        do {
            f = f();
            if (f == null) {
                return dwl.c;
            }
            b = f.b(e);
        } while (b == null);
        if (dug.a()) {
            if (!(b == dth.a)) {
                throw new AssertionError();
            }
        }
        f.c(e);
        return f.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final dwv<?> g() {
        dyn i = this.b.i();
        dwv<?> dwvVar = i instanceof dwv ? (dwv) i : null;
        if (dwvVar == null) {
            return null;
        }
        a(dwvVar);
        return dwvVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
        r1 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.dxf h() {
        /*
            r4 = this;
            dyl r0 = r4.b
            dyn r0 = (defpackage.dyn) r0
        L4:
            java.lang.Object r1 = r0.g()
            dyn r1 = (defpackage.dyn) r1
            r2 = 0
            if (r1 != r0) goto Lf
        Ld:
            r1 = r2
            goto L28
        Lf:
            boolean r3 = r1 instanceof defpackage.dxf
            if (r3 != 0) goto L14
            goto Ld
        L14:
            r2 = r1
            dxf r2 = (defpackage.dxf) r2
            boolean r2 = r2 instanceof defpackage.dwv
            if (r2 == 0) goto L22
            boolean r2 = r1.z_()
            if (r2 != 0) goto L22
            goto L28
        L22:
            dyn r2 = r1.j()
            if (r2 != 0) goto L2b
        L28:
            dxf r1 = (defpackage.dxf) r1
            return r1
        L2b:
            r2.l()
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwm.h():dxf");
    }

    @Override // defpackage.dxg
    public final boolean x_() {
        return g() != null;
    }

    @Override // defpackage.dxg
    public final boolean a_(E e) {
        UndeliveredElementException a2;
        try {
            Object b_ = b_(e);
            if (dwt.a(b_)) {
                return true;
            }
            Throwable d = dwt.d(b_);
            if (d == null) {
                return false;
            }
            throw dyx.a(d);
        } catch (Throwable th) {
            dow<E, dmg> dowVar = this.a_;
            if (dowVar != null && (a2 = dyt.a(dowVar, e, (UndeliveredElementException) null)) != null) {
                dlr.a(a2, th);
                throw a2;
            }
            throw th;
        }
    }

    @Override // defpackage.dxg
    public final Object b_(E e) {
        dwt.c cVar;
        Object b = b((dwm<E>) e);
        if (b != dwl.b) {
            if (b == dwl.c) {
                dwv<?> g = g();
                if (g != null) {
                    dwt.b bVar = dwt.a;
                    return dwt.b.a(b(g));
                }
                dwt.b bVar2 = dwt.a;
                cVar = dwt.c;
                return dwt.e(cVar);
            } else if (b instanceof dwv) {
                dwt.b bVar3 = dwt.a;
                return dwt.b.a(b((dwv<?>) b));
            } else {
                throw new IllegalStateException(dqc.a("trySend returned ", b).toString());
            }
        }
        dwt.b bVar4 = dwt.a;
        return dwt.e(dmg.a);
    }

    private static Throwable b(dwv<?> dwvVar) {
        a(dwvVar);
        return dwvVar.d();
    }

    @Override // defpackage.dxg
    public final boolean a(Throwable th) {
        boolean z;
        Object obj;
        dwv dwvVar = new dwv(th);
        dyl dylVar = this.b;
        while (true) {
            dyn i = dylVar.i();
            if (!(i instanceof dwv)) {
                if (i.a(dwvVar, dylVar)) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            dwvVar = (dwv) this.b.i();
        }
        a(dwvVar);
        if (z && (obj = this.onCloseHandler) != null && obj != dwl.f && c.compareAndSet(this, obj, dwl.f)) {
            ((dow) dqj.a(obj, 1)).invoke(th);
        }
        return z;
    }

    @Override // defpackage.dxg
    public final void a(dow<? super Throwable, dmg> dowVar) {
        if (!c.compareAndSet(this, null, dowVar)) {
            Object obj = this.onCloseHandler;
            if (obj == dwl.f) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            throw new IllegalStateException(dqc.a("Another handler was already registered: ", obj));
        }
        dwv<?> g = g();
        if (g == null || !c.compareAndSet(this, dowVar, dwl.f)) {
            return;
        }
        dowVar.invoke(g.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(dwv<?> dwvVar) {
        Object obj = null;
        while (true) {
            dyn i = dwvVar.i();
            dxb dxbVar = i instanceof dxb ? (dxb) i : null;
            if (dxbVar == null) {
                break;
            } else if (!dxbVar.v_()) {
                dxbVar.k();
            } else {
                obj = dyk.a(obj, dxbVar);
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                ((dxb) obj).a(dwvVar);
            } else if (obj != null) {
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size() - 1;
                if (size < 0) {
                    return;
                }
                while (true) {
                    int i2 = size - 1;
                    ((dxb) arrayList.get(size)).a(dwvVar);
                    if (i2 < 0) {
                        return;
                    }
                    size = i2;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
        r1 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.dxd<E> f() {
        /*
            r4 = this;
            dyl r0 = r4.b
            dyn r0 = (defpackage.dyn) r0
        L4:
            java.lang.Object r1 = r0.g()
            dyn r1 = (defpackage.dyn) r1
            r2 = 0
            if (r1 != r0) goto Lf
        Ld:
            r1 = r2
            goto L28
        Lf:
            boolean r3 = r1 instanceof defpackage.dxd
            if (r3 != 0) goto L14
            goto Ld
        L14:
            r2 = r1
            dxd r2 = (defpackage.dxd) r2
            boolean r2 = r2 instanceof defpackage.dwv
            if (r2 == 0) goto L22
            boolean r2 = r1.z_()
            if (r2 != 0) goto L22
            goto L28
        L22:
            dyn r2 = r1.j()
            if (r2 != 0) goto L2b
        L28:
            dxd r1 = (defpackage.dxd) r1
            return r1
        L2b:
            r2.l()
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwm.f():dxd");
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append('{');
        dyn h = this.b.h();
        if (h == this.b) {
            str = "EmptyQueue";
        } else {
            String dynVar = h instanceof dwv ? h.toString() : h instanceof dxb ? "ReceiveQueued" : h instanceof dxf ? "SendQueued" : dqc.a("UNEXPECTED:", (Object) h);
            dyn i = this.b.i();
            if (i != h) {
                str = dynVar + ",queueSize=" + a();
                if (i instanceof dwv) {
                    str = str + ",closedForSend=" + i;
                }
            } else {
                str = dynVar;
            }
        }
        sb.append(str);
        sb.append('}');
        sb.append(j());
        return sb.toString();
    }

    private final int a() {
        dyl dylVar = this.b;
        int i = 0;
        for (dyn dynVar = (dyn) dylVar.g(); !dqc.a(dynVar, dylVar); dynVar = dym.a(dynVar.g())) {
            if (dynVar instanceof dyn) {
                i++;
            }
        }
        return i;
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0014\u0010\f\u001a\u00020\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u0012\u0010\u0003\u001a\u00028\u00018\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel$SendBuffered;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/Send;", "element", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "pollResult", "", "getPollResult", "()Ljava/lang/Object;", "completeResumeSend", "", "resumeSendClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", "", "tryResumeSend", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dwm$a */
    /* loaded from: classes2.dex */
    public static final class a<E> extends dxf {
        public final E a;

        public a(E e) {
            this.a = e;
        }

        @Override // defpackage.dxf
        public final Object a() {
            return this.a;
        }

        @Override // defpackage.dxf
        public final dyy b() {
            return dth.a;
        }

        @Override // defpackage.dxf
        public final void c() {
            if (!dug.a()) {
                return;
            }
            throw new AssertionError();
        }

        @Override // defpackage.dyn
        public final String toString() {
            return "SendBuffered@" + Integer.toHexString(System.identityHashCode(this)) + '(' + this.a + ')';
        }
    }
}
