package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: edx  reason: default package */
/* loaded from: classes2.dex */
public class edx implements Serializable, Comparable<edx> {
    static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final edx b = a(new byte[0]);
    final byte[] c;
    transient int d;
    transient String e;

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(edx edxVar) {
        edx edxVar2 = edxVar;
        int g = g();
        int g2 = edxVar2.g();
        int min = Math.min(g, g2);
        for (int i = 0; i < min; i++) {
            int a2 = a(i) & 255;
            int a3 = edxVar2.a(i) & 255;
            if (a2 != a3) {
                return a2 < a3 ? -1 : 1;
            }
        }
        if (g == g2) {
            return 0;
        }
        return g < g2 ? -1 : 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public edx(byte[] bArr) {
        this.c = bArr;
    }

    public static edx a(byte... bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("data == null");
        }
        return new edx((byte[]) bArr.clone());
    }

    public static edx a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        edx edxVar = new edx(str.getBytes(eep.a));
        edxVar.e = str;
        return edxVar;
    }

    public String a() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.c, eep.a);
        this.e = str2;
        return str2;
    }

    public String b() {
        return edt.a(this.c);
    }

    public edx c() {
        return d("SHA-1");
    }

    public edx d() {
        return d("SHA-256");
    }

    private edx d(String str) {
        try {
            return a(MessageDigest.getInstance(str).digest(this.c));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static edx b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("base64 == null");
        }
        byte[] a2 = edt.a(str);
        if (a2 == null) {
            return null;
        }
        return new edx(a2);
    }

    public String e() {
        byte[] bArr = this.c;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b2 : bArr) {
            int i2 = i + 1;
            char[] cArr2 = a;
            cArr[i] = cArr2[(b2 >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public static edx c(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(String.valueOf(str)));
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((a(str.charAt(i2)) << 4) + a(str.charAt(i2 + 1)));
        }
        return a(bArr);
    }

    private static int a(char c) {
        if (c < '0' || c > '9') {
            char c2 = 'a';
            if (c < 'a' || c > 'f') {
                c2 = 'A';
                if (c < 'A' || c > 'F') {
                    throw new IllegalArgumentException("Unexpected hex digit: ".concat(String.valueOf(c)));
                }
            }
            return (c - c2) + 10;
        }
        return c - '0';
    }

    public edx f() {
        int i = 0;
        while (true) {
            byte[] bArr = this.c;
            if (i < bArr.length) {
                byte b2 = bArr[i];
                if (b2 >= 65 && b2 <= 90) {
                    byte[] bArr2 = (byte[]) bArr.clone();
                    bArr2[i] = (byte) (b2 + 32);
                    for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                        byte b3 = bArr2[i2];
                        if (b3 >= 65 && b3 <= 90) {
                            bArr2[i2] = (byte) (b3 + 32);
                        }
                    }
                    return new edx(bArr2);
                }
                i++;
            } else {
                return this;
            }
        }
    }

    public edx a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.c;
        if (i2 > bArr.length) {
            throw new IllegalArgumentException("endIndex > length(" + this.c.length + ")");
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (i == 0 && i2 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(this.c, i, bArr2, 0, i3);
        return new edx(bArr2);
    }

    public byte a(int i) {
        return this.c[i];
    }

    public int g() {
        return this.c.length;
    }

    public byte[] h() {
        return (byte[]) this.c.clone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(edu eduVar) {
        byte[] bArr = this.c;
        eduVar.c(bArr, 0, bArr.length);
    }

    public boolean a(int i, edx edxVar, int i2, int i3) {
        return edxVar.a(0, this.c, 0, i3);
    }

    public boolean a(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.c;
            return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && eep.a(bArr2, i, bArr, i2, i3);
        }
        return false;
    }

    public final boolean a(edx edxVar) {
        return a(0, edxVar, 0, edxVar.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edx) {
            edx edxVar = (edx) obj;
            int g = edxVar.g();
            byte[] bArr = this.c;
            if (g == bArr.length && edxVar.a(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.c);
        this.d = hashCode;
        return hashCode;
    }

    public String toString() {
        if (this.c.length == 0) {
            return "[size=0]";
        }
        String a2 = a();
        int length = a2.length();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                i = a2.length();
                break;
            } else if (i2 == 64) {
                break;
            } else {
                int codePointAt = a2.codePointAt(i);
                if ((!Character.isISOControl(codePointAt) || codePointAt == 10 || codePointAt == 13) && codePointAt != 65533) {
                    i2++;
                    i += Character.charCount(codePointAt);
                }
            }
        }
        i = -1;
        if (i == -1) {
            if (this.c.length <= 64) {
                return "[hex=" + e() + "]";
            }
            return "[size=" + this.c.length + " hex=" + a(0, 64).e() + "…]";
        }
        String replace = a2.substring(0, i).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (i < a2.length()) {
            return "[size=" + this.c.length + " text=" + replace + "…]";
        }
        return "[text=" + replace + "]";
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        int readInt = objectInputStream.readInt();
        if (objectInputStream != null) {
            if (readInt < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(readInt)));
            }
            byte[] bArr = new byte[readInt];
            int i = 0;
            while (i < readInt) {
                int read = objectInputStream.read(bArr, i, readInt - i);
                if (read == -1) {
                    throw new EOFException();
                }
                i += read;
            }
            edx edxVar = new edx(bArr);
            try {
                Field declaredField = edx.class.getDeclaredField("c");
                declaredField.setAccessible(true);
                declaredField.set(this, edxVar.c);
                return;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (NoSuchFieldException unused2) {
                throw new AssertionError();
            }
        }
        throw new IllegalArgumentException("in == null");
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.c.length);
        objectOutputStream.write(this.c);
    }
}
