package defpackage;

import android.os.Handler;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.mb;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0002J\b\u0010\u0019\u001a\u00020\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\u0012\u0010\u001b\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J \u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0016J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010#\u001a\u00020!H\u0016R\u001e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/facebook/ProgressOutputStream;", "Ljava/io/FilterOutputStream;", "Lcom/facebook/RequestOutputStream;", "out", "Ljava/io/OutputStream;", "requests", "Lcom/facebook/GraphRequestBatch;", "progressMap", "", "Lcom/facebook/GraphRequest;", "Lcom/facebook/RequestProgress;", "maxProgress", "", "(Ljava/io/OutputStream;Lcom/facebook/GraphRequestBatch;Ljava/util/Map;J)V", "<set-?>", "batchProgress", "getBatchProgress", "()J", "currentRequestProgress", "lastReportedProgress", "getMaxProgress", "threshold", "addProgress", "", "size", "close", "reportBatchProgress", "setCurrentRequest", "request", "write", "buffer", "", TypedValues.Cycle.S_WAVE_OFFSET, "", "length", "oneByte", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: mk  reason: default package */
/* loaded from: classes2.dex */
public final class mk extends FilterOutputStream implements ml {
    private final long a = ly.b();
    private long b;
    private long c;
    private mm d;
    private final mb e;
    private final Map<lz, mm> f;
    private final long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk(OutputStream outputStream, mb mbVar, Map<lz, mm> map, long j) {
        super(outputStream);
        dqc.d(outputStream, "out");
        dqc.d(mbVar, "requests");
        dqc.d(map, "progressMap");
        this.e = mbVar;
        this.f = map;
        this.g = j;
    }

    private final void a(long j) {
        mm mmVar = this.d;
        if (mmVar != null) {
            mmVar.b += j;
            if (mmVar.b >= mmVar.c + mmVar.a || mmVar.b >= mmVar.d) {
                mmVar.a();
            }
        }
        long j2 = this.b + j;
        this.b = j2;
        if (j2 >= this.c + this.a || j2 >= this.g) {
            a();
        }
    }

    private final void a() {
        Handler handler;
        if (this.b > this.c) {
            for (mb.a aVar : this.e.e) {
                if ((aVar instanceof mb.c) && (handler = this.e.a) != null) {
                    handler.post(new a(aVar));
                }
            }
            this.c = this.b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: mk$a */
    /* loaded from: classes2.dex */
    public static final class a implements Runnable {
        final /* synthetic */ mb.a b;

        a(mb.a aVar) {
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (qx.a(this)) {
                return;
            }
            try {
                mb unused = mk.this.e;
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    @Override // defpackage.ml
    public final void a(lz lzVar) {
        this.d = lzVar != null ? this.f.get(lzVar) : null;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        dqc.d(bArr, "buffer");
        this.out.write(bArr);
        a(bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        dqc.d(bArr, "buffer");
        this.out.write(bArr, i, i2);
        a(i2);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        this.out.write(i);
        a(1L);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        for (mm mmVar : this.f.values()) {
            mmVar.a();
        }
        a();
    }
}
