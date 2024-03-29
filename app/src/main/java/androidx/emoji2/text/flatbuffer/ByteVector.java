package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class ByteVector extends BaseVector {
    public final ByteVector __assign(int i, ByteBuffer byteBuffer) {
        __reset(i, 1, byteBuffer);
        return this;
    }

    public final byte get(int i) {
        return this.bb.get(__element(i));
    }

    public final int getAsUnsigned(int i) {
        return get(i) & 255;
    }
}
