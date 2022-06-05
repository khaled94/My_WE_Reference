package defpackage;

import java.nio.charset.Charset;
import org.apache.commons.codec.DecoderException;

/* renamed from: eet  reason: default package */
/* loaded from: classes2.dex */
public final class eet {
    public static final Charset a = eeq.f;
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final Charset d = a;

    private static int a(char c2, int i) throws DecoderException {
        int digit = Character.digit(c2, 16);
        if (digit != -1) {
            return digit;
        }
        throw new DecoderException("Illegal hexadecimal character " + c2 + " at index " + i);
    }

    public static Object a(Object obj) throws DecoderException {
        while (obj instanceof String) {
            obj = ((String) obj).toCharArray();
        }
        try {
            char[] cArr = (char[]) obj;
            int length = cArr.length;
            if ((length & 1) != 0) {
                throw new DecoderException("Odd number of characters.");
            }
            byte[] bArr = new byte[length >> 1];
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i + 1;
                i = i3 + 1;
                bArr[i2] = (byte) (((a(cArr[i], i) << 4) | a(cArr[i3], i3)) & 255);
                i2++;
            }
            return bArr;
        } catch (ClassCastException e) {
            throw new DecoderException(e.getMessage(), e);
        }
    }

    public final String toString() {
        return super.toString() + "[charsetName=" + this.d + "]";
    }
}
