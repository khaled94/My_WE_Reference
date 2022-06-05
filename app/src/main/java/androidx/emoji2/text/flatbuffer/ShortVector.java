package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class ShortVector extends BaseVector {
    public final ShortVector __assign(int i, ByteBuffer byteBuffer) {
        __reset(i, 2, byteBuffer);
        return this;
    }

    public final short get(int i) {
        return this.bb.getShort(__element(i));
    }

    public final int getAsUnsigned(int i) {
        return get(i) & 65535;
    }
}
