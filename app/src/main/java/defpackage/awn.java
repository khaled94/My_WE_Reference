package defpackage;

import com.google.android.gms.internal.measurement.zzee;
import com.google.android.gms.internal.measurement.zzin;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* renamed from: awn  reason: default package */
/* loaded from: classes.dex */
public final class awn {
    private final ByteBuffer a;
    private zzee b;
    private int c;

    public awn(byte[] bArr, int i) {
        this(ByteBuffer.wrap(bArr, 0, i));
    }

    public static int c(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    private awn(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    public static awn a(byte[] bArr) {
        return new awn(bArr, bArr.length);
    }

    public final void a(int i, int i2) throws IOException {
        c(i, 0);
        if (i2 >= 0) {
            b(i2);
        } else {
            a(i2);
        }
    }

    public final void a(int i, boolean z) throws IOException {
        c(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        if (!this.a.hasRemaining()) {
            throw new zzin(this.a.position(), this.a.limit());
        }
        this.a.put(b);
    }

    public final void a(int i, String str) throws IOException {
        c(i, 2);
        try {
            int c = c(str.length());
            if (c == c(str.length() * 3)) {
                int position = this.a.position();
                if (this.a.remaining() < c) {
                    throw new zzin(position + c, this.a.limit());
                }
                this.a.position(position + c);
                a(str, this.a);
                int position2 = this.a.position();
                this.a.position(position);
                b((position2 - position) - c);
                this.a.position(position2);
                return;
            }
            b(a(str));
            a(str, this.a);
        } catch (BufferOverflowException e) {
            zzin zzinVar = new zzin(this.a.position(), this.a.limit());
            zzinVar.initCause(e);
            throw zzinVar;
        }
    }

    public final void a(int i, awu awuVar) throws IOException {
        c(i, 2);
        if (awuVar.h < 0) {
            awuVar.d();
        }
        b(awuVar.h);
        awuVar.a(this);
    }

    public final void a(int i, aui auiVar) throws IOException {
        if (this.b == null) {
            this.b = zzee.a(this.a);
            this.c = this.a.position();
        } else if (this.c != this.a.position()) {
            this.b.b(this.a.array(), this.c, this.a.position() - this.c);
            this.c = this.a.position();
        }
        zzee zzeeVar = this.b;
        zzeeVar.a(i, auiVar);
        zzeeVar.h();
        this.c = this.a.position();
    }

    private static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i2);
                                throw new IllegalArgumentException(sb.toString());
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(i3 + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    private static void a(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int i2;
        char charAt;
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        int i3 = 0;
        if (byteBuffer.hasArray()) {
            try {
                byte[] array = byteBuffer.array();
                int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                int remaining = byteBuffer.remaining();
                int length = charSequence.length();
                int i4 = remaining + arrayOffset;
                while (i3 < length) {
                    int i5 = i3 + arrayOffset;
                    if (i5 >= i4 || (charAt = charSequence.charAt(i3)) >= 128) {
                        break;
                    }
                    array[i5] = (byte) charAt;
                    i3++;
                }
                if (i3 == length) {
                    i = arrayOffset + length;
                } else {
                    i = arrayOffset + i3;
                    while (i3 < length) {
                        char charAt2 = charSequence.charAt(i3);
                        if (charAt2 >= 128 || i >= i4) {
                            if (charAt2 < 2048 && i <= i4 - 2) {
                                int i6 = i + 1;
                                array[i] = (byte) ((charAt2 >>> 6) | 960);
                                i = i6 + 1;
                                array[i6] = (byte) ((charAt2 & '?') | 128);
                            } else if ((charAt2 >= 55296 && 57343 >= charAt2) || i > i4 - 3) {
                                if (i <= i4 - 4) {
                                    int i7 = i3 + 1;
                                    if (i7 != charSequence.length()) {
                                        char charAt3 = charSequence.charAt(i7);
                                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                                            int i8 = i + 1;
                                            array[i] = (byte) ((codePoint >>> 18) | 240);
                                            int i9 = i8 + 1;
                                            array[i8] = (byte) (((codePoint >>> 12) & 63) | 128);
                                            int i10 = i9 + 1;
                                            array[i9] = (byte) (((codePoint >>> 6) & 63) | 128);
                                            i = i10 + 1;
                                            array[i10] = (byte) ((codePoint & 63) | 128);
                                            i3 = i7;
                                        } else {
                                            i3 = i7;
                                        }
                                    }
                                    StringBuilder sb = new StringBuilder(39);
                                    sb.append("Unpaired surrogate at index ");
                                    sb.append(i3 - 1);
                                    throw new IllegalArgumentException(sb.toString());
                                }
                                StringBuilder sb2 = new StringBuilder(37);
                                sb2.append("Failed writing ");
                                sb2.append(charAt2);
                                sb2.append(" at index ");
                                sb2.append(i);
                                throw new ArrayIndexOutOfBoundsException(sb2.toString());
                            } else {
                                int i11 = i + 1;
                                array[i] = (byte) ((charAt2 >>> '\f') | 480);
                                int i12 = i11 + 1;
                                array[i11] = (byte) (((charAt2 >>> 6) & 63) | 128);
                                i2 = i12 + 1;
                                array[i12] = (byte) ((charAt2 & '?') | 128);
                            }
                            i3++;
                        } else {
                            i2 = i + 1;
                            array[i] = (byte) charAt2;
                        }
                        i = i2;
                        i3++;
                    }
                }
                byteBuffer.position(i - byteBuffer.arrayOffset());
                return;
            } catch (ArrayIndexOutOfBoundsException e) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e);
                throw bufferOverflowException;
            }
        }
        int length2 = charSequence.length();
        while (i3 < length2) {
            char charAt4 = charSequence.charAt(i3);
            if (charAt4 < 128) {
                byteBuffer.put((byte) charAt4);
            } else if (charAt4 < 2048) {
                byteBuffer.put((byte) ((charAt4 >>> 6) | 960));
                byteBuffer.put((byte) ((charAt4 & '?') | 128));
            } else if (charAt4 < 55296 || 57343 < charAt4) {
                byteBuffer.put((byte) ((charAt4 >>> '\f') | 480));
                byteBuffer.put((byte) (((charAt4 >>> 6) & 63) | 128));
                byteBuffer.put((byte) ((charAt4 & '?') | 128));
            } else {
                int i13 = i3 + 1;
                if (i13 != charSequence.length()) {
                    char charAt5 = charSequence.charAt(i13);
                    if (Character.isSurrogatePair(charAt4, charAt5)) {
                        int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                        byteBuffer.put((byte) ((codePoint2 >>> 18) | 240));
                        byteBuffer.put((byte) (((codePoint2 >>> 12) & 63) | 128));
                        byteBuffer.put((byte) (((codePoint2 >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((codePoint2 & 63) | 128));
                        i3 = i13;
                    } else {
                        i3 = i13;
                    }
                }
                StringBuilder sb3 = new StringBuilder(39);
                sb3.append("Unpaired surrogate at index ");
                sb3.append(i3 - 1);
                throw new IllegalArgumentException(sb3.toString());
            }
            i3++;
        }
    }

    public static int a(int i) {
        if (i >= 0) {
            return c(i);
        }
        return 10;
    }

    private final void d(int i) throws IOException {
        byte b = (byte) i;
        if (!this.a.hasRemaining()) {
            throw new zzin(this.a.position(), this.a.limit());
        }
        this.a.put(b);
    }

    public final void b(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this.a.remaining() >= length) {
            this.a.put(bArr, 0, length);
            return;
        }
        throw new zzin(this.a.position(), this.a.limit());
    }

    public final void c(int i, int i2) throws IOException {
        b((i << 3) | i2);
    }

    public final void b(int i) throws IOException {
        while ((i & (-128)) != 0) {
            d((i & 127) | 128);
            i >>>= 7;
        }
        d(i);
    }

    public final void a(long j) throws IOException {
        while (((-128) & j) != 0) {
            d((((int) j) & 127) | 128);
            j >>>= 7;
        }
        d((int) j);
    }

    public static int b(int i, int i2) {
        return c(i << 3) + a(i2);
    }

    public static int b(int i, String str) {
        int c = c(i << 3);
        int a = a(str);
        return c + c(a) + a;
    }

    public static int b(int i, awu awuVar) {
        int c = c(i << 3);
        int d = awuVar.d();
        return c + c(d) + d;
    }
}
