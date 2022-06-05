package defpackage;

import android.os.Handler;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0016J\u0012\u0010\u0017\u001a\u00020\u00122\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J \u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000bH\u0016J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u000bH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/facebook/ProgressNoopOutputStream;", "Ljava/io/OutputStream;", "Lcom/facebook/RequestOutputStream;", "callbackHandler", "Landroid/os/Handler;", "(Landroid/os/Handler;)V", "currentRequest", "Lcom/facebook/GraphRequest;", "currentRequestProgress", "Lcom/facebook/RequestProgress;", "<set-?>", "", "maxProgress", "getMaxProgress", "()I", "progressMap", "", "addProgress", "", "size", "", "getProgressMap", "", "setCurrentRequest", "write", "buffer", "", TypedValues.Cycle.S_WAVE_OFFSET, "length", "oneByte", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: mj  reason: default package */
/* loaded from: classes2.dex */
public final class mj extends OutputStream implements ml {
    final Map<lz, mm> a = new HashMap();
    int b;
    private lz c;
    private mm d;
    private final Handler e;

    public mj(Handler handler) {
        this.e = handler;
    }

    @Override // defpackage.ml
    public final void a(lz lzVar) {
        this.c = lzVar;
        this.d = lzVar != null ? this.a.get(lzVar) : null;
    }

    public final void a(long j) {
        lz lzVar = this.c;
        if (lzVar == null) {
            return;
        }
        if (this.d == null) {
            mm mmVar = new mm(this.e, lzVar);
            this.d = mmVar;
            this.a.put(lzVar, mmVar);
        }
        mm mmVar2 = this.d;
        if (mmVar2 != null) {
            mmVar2.a(j);
        }
        this.b += (int) j;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        dqc.d(bArr, "buffer");
        a(bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        dqc.d(bArr, "buffer");
        a(i2);
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        a(1L);
    }
}
