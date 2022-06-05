package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class DoubleVector extends BaseVector {
    public final DoubleVector __assign(int i, ByteBuffer byteBuffer) {
        __reset(i, 8, byteBuffer);
        return this;
    }

    public final double get(int i) {
        return this.bb.getDouble(__element(i));
    }
}
