package defpackage;

import androidx.core.location.LocationRequestCompat;
import defpackage.ear;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.AccessControlException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: ebk */
/* loaded from: classes2.dex */
public final class ebk {
    private static final Method k;
    private static final Pattern l;
    public static final byte[] a = new byte[0];
    public static final String[] b = new String[0];
    public static final ear c = ear.a(new String[0]);
    public static final ebd d = ebd.a(a);
    public static final ebb e = ebb.a(a);
    private static final eee h = eee.a(edx.c("efbbbf"), edx.c("feff"), edx.c("fffe"), edx.c("0000ffff"), edx.c("ffff0000"));
    private static final Charset i = Charset.forName("UTF-32BE");
    private static final Charset j = Charset.forName("UTF-32LE");
    public static final TimeZone f = TimeZone.getTimeZone("GMT");
    public static final Comparator<String> g = $$Lambda$TEfSBt3hRUlBSSARfPEHsJesTtE.INSTANCE;

    public static int a(char c2) {
        if (c2 < '0' || c2 > '9') {
            char c3 = 'a';
            if (c2 < 'a' || c2 > 'f') {
                c3 = 'A';
                if (c2 < 'A' || c2 > 'F') {
                    return -1;
                }
            }
            return (c2 - c3) + 10;
        }
        return c2 - '0';
    }

    public static /* synthetic */ Thread lambda$X398XOpHPTqarUCcH77oPLBEyA8(String str, boolean z, Runnable runnable) {
        return a(str, z, runnable);
    }

    static {
        Method method;
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
            method = null;
        }
        k = method;
        l = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    public static void a(Throwable th, Throwable th2) {
        Method method = k;
        if (method != null) {
            try {
                method.invoke(th, th2);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    private ebk() {
    }

    public static void a(long j2, long j3) {
        if ((j3 | 0) < 0 || 0 > j2 || j2 - 0 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e2) {
                if (!a(e2)) {
                    throw e2;
                }
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a(een eenVar, TimeUnit timeUnit) {
        try {
            return a(eenVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean a(een eenVar, int i2, TimeUnit timeUnit) throws IOException {
        long nanoTime = System.nanoTime();
        long c2 = eenVar.a().E_() ? eenVar.a().c() - nanoTime : Long.MAX_VALUE;
        eenVar.a().a(Math.min(c2, timeUnit.toNanos(i2)) + nanoTime);
        try {
            edu eduVar = new edu();
            while (eenVar.a(eduVar, 8192L) != -1) {
                eduVar.q();
            }
            if (c2 == LocationRequestCompat.PASSIVE_INTERVAL) {
                eenVar.a().D_();
                return true;
            }
            eenVar.a().a(nanoTime + c2);
            return true;
        } catch (InterruptedIOException unused) {
            if (c2 == LocationRequestCompat.PASSIVE_INTERVAL) {
                eenVar.a().D_();
                return false;
            }
            eenVar.a().a(nanoTime + c2);
            return false;
        } catch (Throwable th) {
            if (c2 == LocationRequestCompat.PASSIVE_INTERVAL) {
                eenVar.a().D_();
            } else {
                eenVar.a().a(nanoTime + c2);
            }
            throw th;
        }
    }

    public static <T> List<T> a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <K, V> Map<K, V> a(Map<K, V> map) {
        if (map.isEmpty()) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    @SafeVarargs
    public static <T> List<T> a(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static ThreadFactory a(final String str, final boolean z) {
        return new ThreadFactory() { // from class: -$$Lambda$ebk$X398XOpHPTqarUCcH77oPLBEyA8
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return ebk.lambda$X398XOpHPTqarUCcH77oPLBEyA8(str, z, runnable);
            }
        };
    }

    public static /* synthetic */ Thread a(String str, boolean z, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    public static String[] a(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i2]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i2++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean b(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static int a(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (comparator.compare(strArr[i2], str) == 0) {
                return i2;
            }
        }
        return -1;
    }

    public static String[] a(String[] strArr, String str) {
        int length = strArr.length + 1;
        String[] strArr2 = new String[length];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length - 1] = str;
        return strArr2;
    }

    public static int a(String str, int i2, int i3) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int b(String str, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            char charAt = str.charAt(i4);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i4 + 1;
            }
        }
        return i2;
    }

    public static String c(String str, int i2, int i3) {
        int a2 = a(str, i2, i3);
        return str.substring(a2, b(str, a2, i3));
    }

    public static int a(String str, int i2, int i3, String str2) {
        while (i2 < i3) {
            if (str2.indexOf(str.charAt(i2)) != -1) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int a(String str, int i2, int i3, char c2) {
        while (i2 < i3) {
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static String a(String str) {
        InetAddress inetAddress;
        if (str.contains(":")) {
            int i2 = 0;
            if (str.startsWith("[") && str.endsWith("]")) {
                inetAddress = d(str, 1, str.length() - 1);
            } else {
                inetAddress = d(str, 0, str.length());
            }
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length != 16) {
                if (address.length == 4) {
                    return inetAddress.getHostAddress();
                }
                throw new AssertionError("Invalid IPv6 address: '" + str + "'");
            }
            int i3 = -1;
            int i4 = 0;
            int i5 = 0;
            while (i4 < address.length) {
                int i6 = i4;
                while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                    i6 += 2;
                }
                int i7 = i6 - i4;
                if (i7 > i5 && i7 >= 4) {
                    i3 = i4;
                    i5 = i7;
                }
                i4 = i6 + 2;
            }
            edu eduVar = new edu();
            while (i2 < address.length) {
                if (i2 == i3) {
                    eduVar.h(58);
                    i2 += i5;
                    if (i2 == 16) {
                        eduVar.h(58);
                    }
                } else {
                    if (i2 > 0) {
                        eduVar.h(58);
                    }
                    eduVar.k(((address[i2] & 255) << 8) | (address[i2 + 1] & 255));
                    i2 += 2;
                }
            }
            return eduVar.n();
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty()) {
                return null;
            }
            if (!e(lowerCase)) {
                return lowerCase;
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private static boolean e(String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }

    public static int b(String str) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127) {
                return i2;
            }
        }
        return -1;
    }

    public static boolean c(String str) {
        return l.matcher(str).matches();
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static Charset a(edw edwVar, Charset charset) throws IOException {
        int a2 = edwVar.a(h);
        if (a2 != -1) {
            if (a2 == 0) {
                return StandardCharsets.UTF_8;
            }
            if (a2 == 1) {
                return StandardCharsets.UTF_16BE;
            }
            if (a2 == 2) {
                return StandardCharsets.UTF_16LE;
            }
            if (a2 == 3) {
                return i;
            }
            if (a2 == 4) {
                return j;
            }
            throw new AssertionError();
        }
        return charset;
    }

    public static int a(String str, long j2, TimeUnit timeUnit) {
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i2 < 0) {
            throw new IllegalArgumentException(str + " < 0");
        } else if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        } else {
            long millis = timeUnit.toMillis(j2);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException(str + " too large.");
            } else if (millis != 0 || i2 <= 0) {
                return (int) millis;
            } else {
                throw new IllegalArgumentException(str + " too small.");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d2, code lost:
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.net.InetAddress d(java.lang.String r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebk.d(java.lang.String, int, int):java.net.InetAddress");
    }

    public static X509TrustManager a() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
            }
            return (X509TrustManager) trustManagers[0];
        } catch (GeneralSecurityException e2) {
            throw new AssertionError("No System TLS", e2);
        }
    }

    public static ear b(List<ecn> list) {
        ear.a aVar = new ear.a();
        for (ecn ecnVar : list) {
            ebg.a.a(aVar, ecnVar.g.a(), ecnVar.h.a());
        }
        return aVar.a();
    }

    public static List<ecn> a(ear earVar) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < earVar.a.length / 2; i2++) {
            arrayList.add(new ecn(earVar.a(i2), earVar.b(i2)));
        }
        return arrayList;
    }

    public static String d(String str) {
        String property;
        try {
            property = System.getProperty(str);
        } catch (AccessControlException unused) {
        }
        if (property != null) {
            return property;
        }
        return null;
    }

    public static String a(eas easVar, boolean z) {
        String str;
        if (easVar.b.contains(":")) {
            str = "[" + easVar.b + "]";
        } else {
            str = easVar.b;
        }
        if (z || easVar.c != eas.a(easVar.a)) {
            return str + ":" + easVar.c;
        }
        return str;
    }

    public static boolean a(eas easVar, eas easVar2) {
        return easVar.b.equals(easVar2.b) && easVar.c == easVar2.c && easVar.a.equals(easVar2.a);
    }
}
