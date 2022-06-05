package defpackage;

import android.os.Handler;
import defpackage.lz;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bJ\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bJ\u0006\u0010\u0014\u001a\u00020\u0011R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/facebook/RequestProgress;", "", "callbackHandler", "Landroid/os/Handler;", "request", "Lcom/facebook/GraphRequest;", "(Landroid/os/Handler;Lcom/facebook/GraphRequest;)V", "lastReportedProgress", "", "<set-?>", "maxProgress", "getMaxProgress", "()J", "progress", "getProgress", "threshold", "addProgress", "", "size", "addToMax", "reportProgress", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: mm  reason: default package */
/* loaded from: classes2.dex */
public final class mm {
    final long a = ly.b();
    long b;
    long c;
    long d;
    private final Handler e;
    private final lz f;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: mm$a */
    /* loaded from: classes2.dex */
    public static final class a implements Runnable {
        final /* synthetic */ lz.b a;
        final /* synthetic */ long b;
        final /* synthetic */ long c;

        a(lz.b bVar, long j, long j2) {
            this.a = bVar;
            this.b = j;
            this.c = j2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (qx.a(this)) {
            }
        }
    }

    public mm(Handler handler, lz lzVar) {
        dqc.d(lzVar, "request");
        this.e = handler;
        this.f = lzVar;
    }

    public final void a(long j) {
        this.d += j;
    }

    public final void a() {
        if (this.b > this.c) {
            lz.b bVar = this.f.f;
            long j = this.d;
            if (j <= 0 || !(bVar instanceof lz.f)) {
                return;
            }
            long j2 = this.b;
            Handler handler = this.e;
            if (handler != null) {
                handler.post(new a(bVar, j2, j));
            }
            this.c = this.b;
        }
    }
}
