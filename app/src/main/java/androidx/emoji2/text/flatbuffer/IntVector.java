package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class IntVector extends BaseVector {
    public final IntVector __assign(int i, ByteBuffer byteBuffer) {
        __reset(i, 4, byteBuffer);
        return this;
    }

    public final int get(int i) {
        return this.bb.getInt(__element(i));
    }

    public final long getAsUnsigned(int i) {
        return get(i) & 4294967295L;
    }
}
