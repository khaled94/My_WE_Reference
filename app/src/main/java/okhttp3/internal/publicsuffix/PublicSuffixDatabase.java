package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class PublicSuffixDatabase {
    private static final byte[] a = {42};
    private static final String[] b = new String[0];
    private static final String[] c = {"*"};
    private static final PublicSuffixDatabase d = new PublicSuffixDatabase();
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final CountDownLatch f = new CountDownLatch(1);
    private byte[] g;
    private byte[] h;

    public static PublicSuffixDatabase a() {
        return d;
    }

    public final String a(String str) {
        int i;
        int i2;
        if (str == null) {
            throw new NullPointerException("domain == null");
        }
        String[] split = IDN.toUnicode(str).split("\\.");
        String[] a2 = a(split);
        if (split.length == a2.length && a2[0].charAt(0) != '!') {
            return null;
        }
        if (a2[0].charAt(0) == '!') {
            i2 = split.length;
            i = a2.length;
        } else {
            i2 = split.length;
            i = a2.length + 1;
        }
        StringBuilder sb = new StringBuilder();
        String[] split2 = str.split("\\.");
        for (int i3 = i2 - i; i3 < split2.length; i3++) {
            sb.append(split2[i3]);
            sb.append('.');
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    private String[] a(String[] strArr) {
        String str;
        String str2;
        String str3;
        String[] strArr2;
        String[] strArr3;
        InputStream resourceAsStream;
        int i = 0;
        if (this.e.get() || !this.e.compareAndSet(false, true)) {
            try {
                this.f.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        try {
                            resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
                            break;
                        } finally {
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    } catch (IOException e) {
                        edk.e().a(5, "Failed to read public suffix list", e);
                        if (z) {
                        }
                    }
                } catch (InterruptedIOException unused2) {
                    Thread.interrupted();
                    z = true;
                }
            }
            if (resourceAsStream != null) {
                edw a2 = eed.a(new eeb(eed.a(resourceAsStream)));
                try {
                    byte[] bArr = new byte[a2.i()];
                    a2.a(bArr);
                    byte[] bArr2 = new byte[a2.i()];
                    a2.a(bArr2);
                    a2.close();
                    synchronized (this) {
                        this.g = bArr;
                        this.h = bArr2;
                    }
                    this.f.countDown();
                } finally {
                    try {
                        throw th;
                    } catch (Throwable th) {
                        try {
                            a2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                }
            }
        }
        synchronized (this) {
            if (this.g == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr3 = new byte[length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            bArr3[i2] = strArr[i2].getBytes(StandardCharsets.UTF_8);
        }
        int i3 = 0;
        while (true) {
            str = null;
            if (i3 >= length) {
                str2 = null;
                break;
            }
            str2 = a(this.g, bArr3, i3);
            if (str2 != null) {
                break;
            }
            i3++;
        }
        if (length > 1) {
            byte[][] bArr4 = (byte[][]) bArr3.clone();
            for (int i4 = 0; i4 < bArr4.length - 1; i4++) {
                bArr4[i4] = a;
                str3 = a(this.g, bArr4, i4);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            while (true) {
                if (i >= length - 1) {
                    break;
                }
                String a3 = a(this.h, bArr3, i);
                if (a3 != null) {
                    str = a3;
                    break;
                }
                i++;
            }
        }
        if (str != null) {
            return "!".concat(String.valueOf(str)).split("\\.");
        }
        if (str2 == null && str3 == null) {
            return c;
        }
        if (str2 != null) {
            strArr2 = str2.split("\\.");
        } else {
            strArr2 = b;
        }
        if (str3 != null) {
            strArr3 = str3.split("\\.");
        } else {
            strArr3 = b;
        }
        return strArr2.length > strArr3.length ? strArr2 : strArr3;
    }

    private static String a(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int length = bArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 >= 0 && bArr[i6] != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (bArr[i2] == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    z = z2;
                    i3 = bArr2[i10][i11] & 255;
                }
                i4 = i3 - (bArr[i7 + i12] & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                } else if (bArr2[i10].length != i11) {
                    z2 = z;
                } else if (i10 == bArr2.length - 1) {
                    break;
                } else {
                    i10++;
                    z2 = true;
                    i11 = -1;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i13 = i9 - i12;
                    int length2 = bArr2[i10].length - i11;
                    while (true) {
                        i10++;
                        if (i10 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i10].length;
                    }
                    if (length2 >= i13) {
                        if (length2 <= i13) {
                            return new String(bArr, i7, i9, StandardCharsets.UTF_8);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            length = i7 - 1;
        }
        return null;
    }
}
