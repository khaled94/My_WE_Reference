package defpackage;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlinx.coroutines.internal.UndeliveredElementException;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000BB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012 \u0010\t\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\r\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\u00020\u00172\u0006\u0010\r\u001a\u00028\u00002\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001eH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0012H\u0014¢\u0006\u0004\b#\u0010$J\u0011\u0010%\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u0004\u0018\u00010\u00172\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001eH\u0014¢\u0006\u0004\b'\u0010(J\u0019\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b*\u0010+R\u001e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00103R\u0016\u00104\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00103R\u0014\u00105\u001a\u00020\u00128DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00128DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b7\u00106R\u0014\u00108\u001a\u00020\u00128DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b8\u00106R\u0014\u00109\u001a\u00020\u00128DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b9\u00106R\u0014\u0010:\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00106R\u0014\u0010;\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00106R\u0018\u0010>\u001a\u00060<j\u0002`=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010@¨\u0006A"}, d2 = {"Lkotlinx/coroutines/channels/ArrayChannel;", ExifInterface.LONGITUDE_EAST, "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;)V", "currentSize", "element", "enqueueElement", "(ILjava/lang/Object;)V", "Lkotlinx/coroutines/channels/Receive;", "receive", "", "enqueueReceiveInternal", "(Lkotlinx/coroutines/channels/Receive;)Z", "Lkotlinx/coroutines/channels/Send;", "send", "", "enqueueSend", "(Lkotlinx/coroutines/channels/Send;)Ljava/lang/Object;", "ensureCapacity", "(I)V", "offerInternal", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "offerSelectInternal", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "wasClosed", "onCancelIdempotent", "(Z)V", "pollInternal", "()Ljava/lang/Object;", "pollSelectInternal", "(Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/Symbol;", "updateBufferSize", "(I)Lkotlinx/coroutines/internal/Symbol;", "", "buffer", "[Ljava/lang/Object;", "", "getBufferDebugString", "()Ljava/lang/String;", "bufferDebugString", "I", "head", "isBufferAlwaysEmpty", "()Z", "isBufferAlwaysFull", "isBufferEmpty", "isBufferFull", "isClosedForReceive", "isEmpty", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/channels/BufferOverflow;", "kotlinx-coroutines-core", "Lkotlinx/coroutines/channels/AbstractChannel;"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dwn  reason: default package */
/* loaded from: classes2.dex */
public final class dwn<E> extends dwk<E> {
    private final int c;
    private final dwo d;
    private final ReentrantLock e;
    private Object[] f;
    private int g;
    private volatile /* synthetic */ int size;

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dwn$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[dwo.values().length];
            iArr[dwo.SUSPEND.ordinal()] = 1;
            iArr[dwo.DROP_LATEST.ordinal()] = 2;
            iArr[dwo.DROP_OLDEST.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // defpackage.dwk
    protected final boolean a() {
        return false;
    }

    public dwn(int i, dwo dwoVar) {
        this.c = i;
        this.d = dwoVar;
        if (!(i > 0)) {
            throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + this.c + " was specified").toString());
        }
        this.e = new ReentrantLock();
        int min = Math.min(this.c, 8);
        Object[] objArr = new Object[min];
        dmj.a(objArr, dwl.a, 0, min);
        dmg dmgVar = dmg.a;
        this.f = objArr;
        this.size = 0;
    }

    @Override // defpackage.dwk
    protected final boolean b() {
        return this.size == 0;
    }

    @Override // defpackage.dwk
    public final boolean d() {
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            return super.d();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    @Override // defpackage.dwm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(E r8) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwn.b(java.lang.Object):java.lang.Object");
    }

    private final void a(int i) {
        Object[] objArr = this.f;
        if (i >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.c);
            Object[] objArr2 = new Object[min];
            if (i > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    Object[] objArr3 = this.f;
                    objArr2[i2] = objArr3[(this.g + i2) % objArr3.length];
                    if (i3 >= i) {
                        break;
                    }
                    i2 = i3;
                }
            }
            dmj.a(objArr2, dwl.a, i, min);
            this.f = objArr2;
            this.g = 0;
        }
    }

    @Override // defpackage.dwk
    protected final Object c() {
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                Object g = g();
                if (g == null) {
                    g = dwl.d;
                }
                return g;
            }
            Object obj = this.f[this.g];
            dxf dxfVar = null;
            this.f[this.g] = null;
            this.size = i - 1;
            Object obj2 = dwl.d;
            boolean z = false;
            if (i == this.c) {
                while (true) {
                    dxf h = h();
                    if (h == null) {
                        break;
                    }
                    dyy b = h.b();
                    if (b != null) {
                        if (dug.a()) {
                            if (b == dth.a) {
                                z = true;
                            }
                            if (!z) {
                                throw new AssertionError();
                            }
                        }
                        obj2 = h.a();
                        dxfVar = h;
                        z = true;
                    } else {
                        dxfVar = h;
                    }
                }
            }
            if (obj2 != dwl.d && !(obj2 instanceof dwv)) {
                this.size = i;
                this.f[(this.g + i) % this.f.length] = obj2;
            }
            this.g = (this.g + 1) % this.f.length;
            dmg dmgVar = dmg.a;
            if (z) {
                dqc.a(dxfVar);
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dwk
    public final boolean a(dxb<? super E> dxbVar) {
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            return super.a((dxb) dxbVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Finally extract failed */
    @Override // defpackage.dwk
    public final void a(boolean z) {
        dow<E, dmg> dowVar = this.a_;
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            int i = this.size;
            UndeliveredElementException undeliveredElementException = null;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = this.f[this.g];
                if (dowVar != null && obj != dwl.a) {
                    undeliveredElementException = dyt.a((dow<? super Object, dmg>) dowVar, obj, undeliveredElementException);
                }
                this.f[this.g] = dwl.a;
                this.g = (this.g + 1) % this.f.length;
            }
            this.size = 0;
            dmg dmgVar = dmg.a;
            reentrantLock.unlock();
            super.a(z);
            if (undeliveredElementException != null) {
                throw undeliveredElementException;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.dwm
    protected final String j() {
        return "(buffer:capacity=" + this.c + ",size=" + this.size + ')';
    }
}
