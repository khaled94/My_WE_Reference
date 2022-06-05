package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001c\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002J\u001c\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0016J\u0013\u0010\u0017\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010 \u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001e\u0010!\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100#H\u0016J\b\u0010$\u001a\u00020\u0006H\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u0000X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lkotlinx/coroutines/android/HandlerContext;", "Lkotlinx/coroutines/android/HandlerDispatcher;", "Lkotlinx/coroutines/Delay;", "handler", "Landroid/os/Handler;", "name", "", "(Landroid/os/Handler;Ljava/lang/String;)V", "invokeImmediately", "", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "_immediate", "immediate", "getImmediate", "()Lkotlinx/coroutines/android/HandlerContext;", "cancelOnRejection", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatch", "equals", "other", "", "hashCode", "", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "", "isDispatchNeeded", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "toString", "kotlinx-coroutines-android"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dwh  reason: default package */
/* loaded from: classes2.dex */
public final class dwh extends dwi implements duk {
    private volatile dwh _immediate;
    private final Handler b;
    private final String c;
    private final boolean d;
    private final dwh e;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¨\u0006\u0002"}, d2 = {"<anonymous>", "", "kotlinx/coroutines/RunnableKt$Runnable$1"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dwh$a */
    /* loaded from: classes2.dex */
    public static final class a implements Runnable {
        final /* synthetic */ dtf a;
        final /* synthetic */ dwh b;

        public a(dtf dtfVar, dwh dwhVar) {
            this.a = dtfVar;
            this.b = dwhVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.a((dtx) this.b, (dwh) dmg.a);
        }
    }

    private dwh(Handler handler, String str, boolean z) {
        super((byte) 0);
        this.b = handler;
        this.c = str;
        this.d = z;
        this._immediate = z ? this : null;
        dwh dwhVar = this._immediate;
        if (dwhVar == null) {
            dwhVar = new dwh(this.b, this.c, true);
            this._immediate = dwhVar;
            dmg dmgVar = dmg.a;
        }
        this.e = dwhVar;
    }

    public /* synthetic */ dwh(Handler handler, byte b2) {
        this(handler);
    }

    private dwh(Handler handler) {
        this(handler, null, false);
    }

    @Override // defpackage.dtx
    public final boolean isDispatchNeeded(dnw dnwVar) {
        return !this.d || !dqc.a(Looper.myLooper(), this.b.getLooper());
    }

    @Override // defpackage.dtx
    public final void dispatch(dnw dnwVar, Runnable runnable) {
        if (!this.b.post(runnable)) {
            a(dnwVar, runnable);
        }
    }

    private final void a(dnw dnwVar, Runnable runnable) {
        dvm.a(dnwVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        dup.c().dispatch(dnwVar, runnable);
    }

    @Override // defpackage.dvr, defpackage.dtx
    public final String toString() {
        String b2 = b();
        if (b2 == null) {
            dwh dwhVar = this;
            String str = dwhVar.c;
            if (str == null) {
                str = dwhVar.b.toString();
            }
            return dwhVar.d ? dqc.a(str, (Object) ".immediate") : str;
        }
        return b2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dwh) && ((dwh) obj).b == this.b;
    }

    public final int hashCode() {
        return System.identityHashCode(this.b);
    }

    @Override // defpackage.duk
    public final void a(long j, dtf<? super dmg> dtfVar) {
        a aVar = new a(dtfVar, this);
        if (this.b.postDelayed(aVar, drb.a(j, 4611686018427387903L))) {
            dtfVar.a((dow<? super Throwable, dmg>) new b(aVar));
        } else {
            a(dtfVar.getContext(), aVar);
        }
    }

    @Override // defpackage.dvr
    public final /* bridge */ /* synthetic */ dvr a() {
        return this.e;
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dwh$b */
    /* loaded from: classes2.dex */
    static final class b extends dqd implements dow<Throwable, dmg> {
        final /* synthetic */ Runnable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Runnable runnable) {
            super(1);
            this.b = runnable;
        }

        @Override // defpackage.dow
        public final /* synthetic */ dmg invoke(Throwable th) {
            dwh.this.b.removeCallbacks(this.b);
            return dmg.a;
        }
    }
}
