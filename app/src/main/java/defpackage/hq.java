package defpackage;

import defpackage.cv;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: hq  reason: default package */
/* loaded from: classes2.dex */
public final class hq implements cv<ByteBuffer> {
    private final ByteBuffer a;

    @Override // defpackage.cv
    public final void b() {
    }

    public hq(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    /* renamed from: hq$a */
    /* loaded from: classes2.dex */
    public static class a implements cv.a<ByteBuffer> {
        @Override // defpackage.cv.a
        public final /* synthetic */ cv<ByteBuffer> a(ByteBuffer byteBuffer) {
            return new hq(byteBuffer);
        }

        @Override // defpackage.cv.a
        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }
    }

    @Override // defpackage.cv
    public final /* synthetic */ ByteBuffer a() throws IOException {
        this.a.position(0);
        return this.a;
    }
}
