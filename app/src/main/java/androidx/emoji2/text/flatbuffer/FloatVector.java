package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class FloatVector extends BaseVector {
    public final FloatVector __assign(int i, ByteBuffer byteBuffer) {
        __reset(i, 4, byteBuffer);
        return this;
    }

    public final float get(int i) {
        return this.bb.getFloat(__element(i));
    }
}
