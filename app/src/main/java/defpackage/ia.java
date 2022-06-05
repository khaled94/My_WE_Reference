package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

/* renamed from: ia  reason: default package */
/* loaded from: classes2.dex */
public final class ia implements co<ByteBuffer, ic> {
    private static final a a = new a();
    private static final b b = new b();
    private final Context c;
    private final List<ImageHeaderParser> d;
    private final b e;
    private final a f;
    private final ib g;

    @Override // defpackage.co
    public final /* synthetic */ boolean a(ByteBuffer byteBuffer, cm cmVar) throws IOException {
        return !((Boolean) cmVar.a(ii.b)).booleanValue() && cj.a(this.d, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    public ia(Context context, List<ImageHeaderParser> list, en enVar, ek ekVar) {
        this(context, list, enVar, ekVar, b, a);
    }

    private ia(Context context, List<ImageHeaderParser> list, en enVar, ek ekVar, b bVar, a aVar) {
        this.c = context.getApplicationContext();
        this.d = list;
        this.f = aVar;
        this.g = new ib(enVar, ekVar);
        this.e = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ie a(ByteBuffer byteBuffer, int i, int i2, cm cmVar) {
        cd a2 = this.e.a(byteBuffer);
        try {
            return a(byteBuffer, i, i2, a2, cmVar);
        } finally {
            this.e.a(a2);
        }
    }

    private ie a(ByteBuffer byteBuffer, int i, int i2, cd cdVar, cm cmVar) {
        long a2 = lb.a();
        try {
            if (cdVar.b == null) {
                throw new IllegalStateException("You must call setData() before parseHeader()");
            }
            if (!cdVar.c()) {
                cdVar.b();
                if (!cdVar.c()) {
                    cdVar.a();
                    if (cdVar.c.c < 0) {
                        cdVar.c.b = 1;
                    }
                }
            }
            cc ccVar = cdVar.c;
            if (ccVar.c > 0 && ccVar.b == 0) {
                Bitmap.Config config = cmVar.a(ii.a) == cg.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int min = Math.min(ccVar.g / i2, ccVar.f / i);
                int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
                if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
                    StringBuilder sb = new StringBuilder("Downsampling GIF, sampleSize: ");
                    sb.append(max);
                    sb.append(", target dimens: [");
                    sb.append(i);
                    sb.append("x");
                    sb.append(i2);
                    sb.append("], actual dimens: [");
                    sb.append(ccVar.f);
                    sb.append("x");
                    sb.append(ccVar.g);
                    sb.append("]");
                }
                ce ceVar = new ce(this.g, ccVar, byteBuffer, max);
                ceVar.a(config);
                ceVar.b();
                Bitmap h = ceVar.h();
                if (h == null) {
                    return null;
                }
                ie ieVar = new ie(new ic(this.c, ceVar, go.a(), i, i2, h));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    new StringBuilder("Decoded GIF from stream in ").append(lb.a(a2));
                }
                return ieVar;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                new StringBuilder("Decoded GIF from stream in ").append(lb.a(a2));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                new StringBuilder("Decoded GIF from stream in ").append(lb.a(a2));
            }
        }
    }

    /* renamed from: ia$a */
    /* loaded from: classes2.dex */
    static class a {
        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ia$b */
    /* loaded from: classes2.dex */
    public static class b {
        private final Queue<cd> a = lg.a(0);

        b() {
        }

        final synchronized cd a(ByteBuffer byteBuffer) {
            cd poll;
            poll = this.a.poll();
            if (poll == null) {
                poll = new cd();
            }
            poll.b = null;
            Arrays.fill(poll.a, (byte) 0);
            poll.c = new cc();
            poll.d = 0;
            poll.b = byteBuffer.asReadOnlyBuffer();
            poll.b.position(0);
            poll.b.order(ByteOrder.LITTLE_ENDIAN);
            return poll;
        }

        final synchronized void a(cd cdVar) {
            cdVar.b = null;
            cdVar.c = null;
            this.a.offer(cdVar);
        }
    }
}
