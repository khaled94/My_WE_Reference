package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* renamed from: buv  reason: default package */
/* loaded from: classes2.dex */
public final class buv extends brh {
    private static final String[] a = {"firebase_", "google_", "ga_"};
    private static final List<String> f = Collections.unmodifiableList(Arrays.asList("source", "medium", "campaign", "term", "content"));
    private SecureRandom b;
    private int d;
    private Integer e = null;
    private final AtomicLong c = new AtomicLong(0);

    /* JADX INFO: Access modifiers changed from: package-private */
    public buv(bql bqlVar) {
        super(bqlVar);
    }

    @Override // defpackage.brh
    protected final boolean d() {
        return true;
    }

    @Override // defpackage.brh
    protected final void e() {
        c();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                q().f.a("Utils falling back to Random for random id");
            }
        }
        this.c.set(nextLong);
    }

    public final long f() {
        long andIncrement;
        long j;
        if (this.c.get() == 0) {
            synchronized (this.c) {
                long nextLong = new Random(System.nanoTime() ^ l().a()).nextLong();
                int i = this.d + 1;
                this.d = i;
                j = nextLong + i;
            }
            return j;
        }
        synchronized (this.c) {
            this.c.compareAndSet(-1L, 1L);
            andIncrement = this.c.getAndIncrement();
        }
        return andIncrement;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SecureRandom g() {
        c();
        if (this.b == null) {
            this.b = new SecureRandom();
        }
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(String str) {
        aat.a(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle a(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str4 = uri.getQueryParameter("utm_campaign");
                str3 = uri.getQueryParameter("utm_source");
                str2 = uri.getQueryParameter("utm_medium");
                str = uri.getQueryParameter("gclid");
            } else {
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("campaign", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("source", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("medium", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("gclid", str);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("aclid", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("cp1", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            q().f.a("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(String str, String str2) {
        if (str2 == null) {
            q().e.a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            q().e.a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                q().e.a("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    q().e.a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(String str, String str2) {
        if (str2 == null) {
            q().e.a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            q().e.a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt) && codePointAt != 95) {
                q().e.a("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    q().e.a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(String str, String[] strArr, String str2) {
        boolean z;
        boolean z2;
        if (str2 == null) {
            q().e.a("Name is required and can't be null. Type", str);
            return false;
        }
        aat.a(str2);
        String[] strArr2 = a;
        int length = strArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (str2.startsWith(strArr2[i])) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            q().e.a("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr != null) {
            aat.a(strArr);
            int length2 = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    z2 = false;
                    break;
                } else if (d(str2, strArr[i2])) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                q().e.a("Name is reserved. Type, name", str, str2);
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(String str, int i, String str2) {
        if (str2 == null) {
            q().e.a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            q().e.a("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(String str) {
        if (!b(NotificationCompat.CATEGORY_EVENT, str)) {
            return 2;
        }
        if (!a(NotificationCompat.CATEGORY_EVENT, brm.a, str)) {
            return 13;
        }
        return !a(NotificationCompat.CATEGORY_EVENT, 40, str) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c(String str) {
        if (!b("user property", str)) {
            return 6;
        }
        if (!a("user property", bro.a, str)) {
            return 15;
        }
        return !a("user property", 24, str) ? 6 : 0;
    }

    private final boolean a(String str, String str2, int i, Object obj, boolean z) {
        Parcelable[] parcelableArr;
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                String valueOf = String.valueOf(obj);
                if (valueOf.codePointCount(0, valueOf.length()) > i) {
                    q().h.a("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                    return false;
                }
            } else if ((obj instanceof Bundle) && z) {
                return true;
            } else {
                if ((obj instanceof Parcelable[]) && z) {
                    for (Parcelable parcelable : (Parcelable[]) obj) {
                        if (!(parcelable instanceof Bundle)) {
                            q().h.a("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                            return false;
                        }
                    }
                    return true;
                } else if (!(obj instanceof ArrayList) || !z) {
                    return false;
                } else {
                    ArrayList arrayList = (ArrayList) obj;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        if (!(obj2 instanceof Bundle)) {
                            q().h.a("All ArrayList elements must be of type Bundle. Value type, name", obj2.getClass(), str2);
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (g(str)) {
                return true;
            }
            if (TextUtils.isEmpty(this.w.a)) {
                q().e.a("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", bpi.a(str));
            }
            return false;
        } else if (!TextUtils.isEmpty(str2)) {
            if (g(str2)) {
                return true;
            }
            q().e.a("Invalid admob_app_id. Analytics disabled.", bpi.a(str2));
            return false;
        } else {
            if (TextUtils.isEmpty(this.w.a)) {
                q().e.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            return !str.equals(str2);
        } else if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else if (isEmpty || !isEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        } else if (TextUtils.isEmpty(str4)) {
            return false;
        } else {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    private static boolean g(String str) {
        aat.a(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    private static Object a(int i, Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return null;
            }
            return a(String.valueOf(obj), i, z);
        }
    }

    public static String a(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (!z) {
            return null;
        }
        return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object a(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            return a(256, obj, true);
        }
        if (!e(str)) {
            i = 100;
        }
        return a(i, obj, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle[] a(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
        if (a("event param", 40, r15) == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle a(java.lang.String r18, java.lang.String r19, android.os.Bundle r20, java.util.List<java.lang.String> r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.buv.a(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean, boolean):android.os.Bundle");
    }

    private static boolean a(Bundle bundle, int i) {
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", i);
            return true;
        }
        return false;
    }

    private static void a(Bundle bundle, Object obj) {
        aat.a(bundle);
        if (obj != null) {
            if (!(obj instanceof String) && !(obj instanceof CharSequence)) {
                return;
            }
            bundle.putLong("_el", String.valueOf(obj).length());
        }
    }

    private static int h(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        return "_id".equals(str) ? 256 : 36;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(String str, Object obj) {
        boolean z;
        if ("_ldl".equals(str)) {
            z = a("user property referrer", str, h(str), obj, false);
        } else {
            z = a("user property", str, h(str), obj, false);
        }
        return z ? 0 : 7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object c(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return a(h(str), obj, true);
        }
        return a(h(str), obj, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (str == null) {
        } else {
            q().h.a("Not putting event parameter. Invalid value type. name, type", n().b(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void a(int i, String str, String str2, int i2) {
        a((String) null, i, str, str2, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        a(bundle, i);
        if (s().d(str, blk.an)) {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                bundle.putString(str2, str3);
            }
        } else if (!TextUtils.isEmpty(str2)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        this.w.d().a("auto", "_err", bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MessageDigest h() {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(byte[] bArr) {
        aat.a(bArr);
        int i = 0;
        aat.b(bArr.length > 0);
        long j = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j += (bArr[length] & 255) << i;
            i += 8;
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Context context) {
        aat.a(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return b(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return b(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    private static boolean b(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d(String str) {
        c();
        if (aep.a(m()).a(str) == 0) {
            return true;
        }
        q().j.a("Permission not granted", str);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str != null) {
            return str.equals(str2);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Boolean bool, Boolean bool2) {
        if (bool == null && bool2 == null) {
            return true;
        }
        if (bool != null) {
            return bool.equals(bool2);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(List<String> list, List<String> list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list != null) {
            return list.equals(list2);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return s().j().equals(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object a2 = a(str, bundle.get(str));
                if (a2 == null) {
                    q().h.a("Param value can't be null", n().b(str));
                } else {
                    a(bundle2, str, a2);
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bli a(String str, String str2, Bundle bundle, String str3, long j) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (b(str2) != 0) {
            q().c.a("Invalid conditional property event name", n().c(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        return new bli(str2, new blh(a(a(str, str2, bundle2, Collections.singletonList("_o"), false, false))), str3, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0065 -> B:16:0x0070). Please submit an issue!!! */
    public final long a(Context context, String str) {
        c();
        aat.a(context);
        aat.a(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest h = h();
        long j = -1;
        if (h == null) {
            q().c.a("Could not get MD5 instance");
        } else {
            if (packageManager != null) {
                try {
                } catch (PackageManager.NameNotFoundException e) {
                    q().c.a("Package name not found", e);
                }
                if (!c(context, str)) {
                    PackageInfo b = aep.a(context).b(m().getPackageName(), 64);
                    if (b.signatures != null && b.signatures.length > 0) {
                        j = a(h.digest(b.signatures[0].toByteArray()));
                    } else {
                        q().f.a("Could not get signatures");
                    }
                }
            }
            j = 0;
        }
        return j;
    }

    private final boolean c(Context context, String str) {
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo b = aep.a(context).b(str, 64);
            if (b == null || b.signatures == null || b.signatures.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(b.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            q().c.a("Package name not found", e);
            return true;
        } catch (CertificateException e2) {
            q().c.a("Error obtaining certificate", e2);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] a(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static Bundle b(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        if (parcelableArr[i] instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelableArr[i]);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        return bundle2;
    }

    public final int i() {
        if (this.e == null) {
            uy.b();
            this.e = Integer.valueOf(uy.c(m()) / 1000);
        }
        return this.e.intValue();
    }

    public final int j() {
        return uy.b().a(m(), uz.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public static long a(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String t() {
        byte[] bArr = new byte[16];
        g().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            q().f.a("Params already contained engagement", Long.valueOf(j2));
        }
        bundle.putLong("_et", j + j2);
    }

    public final void a(bas basVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            basVar.a(bundle);
        } catch (RemoteException e) {
            this.w.q().f.a("Error returning string value to wrapper", e);
        }
    }

    public final void a(bas basVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            basVar.a(bundle);
        } catch (RemoteException e) {
            this.w.q().f.a("Error returning long value to wrapper", e);
        }
    }

    public final void a(bas basVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            basVar.a(bundle);
        } catch (RemoteException e) {
            this.w.q().f.a("Error returning int value to wrapper", e);
        }
    }

    public final void a(bas basVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            basVar.a(bundle);
        } catch (RemoteException e) {
            this.w.q().f.a("Error returning byte array to wrapper", e);
        }
    }

    public final void a(bas basVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            basVar.a(bundle);
        } catch (RemoteException e) {
            this.w.q().f.a("Error returning boolean value to wrapper", e);
        }
    }

    public final void a(bas basVar, Bundle bundle) {
        try {
            basVar.a(bundle);
        } catch (RemoteException e) {
            this.w.q().f.a("Error returning bundle value to wrapper", e);
        }
    }

    public static Bundle a(List<buq> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (buq buqVar : list) {
            if (buqVar.d != null) {
                bundle.putString(buqVar.a, buqVar.d);
            } else if (buqVar.c != null) {
                bundle.putLong(buqVar.a, buqVar.c.longValue());
            } else if (buqVar.f != null) {
                bundle.putDouble(buqVar.a, buqVar.f.doubleValue());
            }
        }
        return bundle;
    }

    public final void a(bas basVar, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            basVar.a(bundle);
        } catch (RemoteException e) {
            this.w.q().f.a("Error returning bundle list to wrapper", e);
        }
    }

    public static ArrayList<Bundle> b(List<bvd> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (bvd bvdVar : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", bvdVar.a);
            bundle.putString("origin", bvdVar.b);
            bundle.putLong("creation_timestamp", bvdVar.d);
            bundle.putString("name", bvdVar.c.a);
            brj.a(bundle, bvdVar.c.a());
            bundle.putBoolean("active", bvdVar.e);
            if (bvdVar.f != null) {
                bundle.putString("trigger_event_name", bvdVar.f);
            }
            if (bvdVar.g != null) {
                bundle.putString("timed_out_event_name", bvdVar.g.a);
                if (bvdVar.g.b != null) {
                    bundle.putBundle("timed_out_event_params", bvdVar.g.b.a());
                }
            }
            bundle.putLong("trigger_timeout", bvdVar.h);
            if (bvdVar.i != null) {
                bundle.putString("triggered_event_name", bvdVar.i.a);
                if (bvdVar.i.b != null) {
                    bundle.putBundle("triggered_event_params", bvdVar.i.b.a());
                }
            }
            bundle.putLong("triggered_timestamp", bvdVar.c.b);
            bundle.putLong("time_to_live", bvdVar.j);
            if (bvdVar.k != null) {
                bundle.putString("expired_event_name", bvdVar.k.a);
                if (bvdVar.k.b != null) {
                    bundle.putBundle("expired_event_params", bvdVar.k.b.a());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public final URL e(String str, String str2) {
        try {
            aat.a(str2);
            aat.a(str);
            return new URL(String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s", String.format("v%s.%s", 16250L, Integer.valueOf(i())), str2, str));
        } catch (IllegalArgumentException | MalformedURLException e) {
            q().c.a("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ blc k() {
        return super.k();
    }

    @Override // defpackage.bri, defpackage.brk
    public final /* bridge */ /* synthetic */ ady l() {
        return super.l();
    }

    @Override // defpackage.bri, defpackage.brk
    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ bpg n() {
        return super.n();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ buv o() {
        return super.o();
    }

    @Override // defpackage.bri, defpackage.brk
    public final /* bridge */ /* synthetic */ bqe p() {
        return super.p();
    }

    @Override // defpackage.bri, defpackage.brk
    public final /* bridge */ /* synthetic */ bpi q() {
        return super.q();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ bpq r() {
        return super.r();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ bvf s() {
        return super.s();
    }
}
