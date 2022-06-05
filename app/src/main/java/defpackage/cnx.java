package defpackage;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;
import java.util.Map;

/* renamed from: cnx  reason: default package */
/* loaded from: classes2.dex */
public final class cnx {
    private int a = 0;
    private final Map<Integer, bwm<Void>> b = new ArrayMap();
    private final cnt c;

    public cnx(cnt cntVar) {
        this.c = cntVar;
    }

    public final synchronized boolean a() {
        return b() != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(FirebaseInstanceId firebaseInstanceId) {
        bwm<Void> remove;
        while (true) {
            synchronized (this) {
                String b = b();
                if (b == null) {
                    FirebaseInstanceId.g();
                    return true;
                } else if (!a(firebaseInstanceId, b)) {
                    return false;
                } else {
                    synchronized (this) {
                        remove = this.b.remove(Integer.valueOf(this.a));
                        a(b);
                        this.a++;
                    }
                    if (remove != null) {
                        remove.a((bwm<Void>) null);
                    }
                }
            }
        }
    }

    private final String b() {
        String a;
        synchronized (this.c) {
            a = this.c.a();
        }
        if (!TextUtils.isEmpty(a)) {
            String[] split = a.split(",");
            if (split.length > 1 && !TextUtils.isEmpty(split[1])) {
                return split[1];
            }
            return null;
        }
        return null;
    }

    private final synchronized boolean a(String str) {
        synchronized (this.c) {
            String a = this.c.a();
            String valueOf = String.valueOf(str);
            if (a.startsWith(valueOf.length() != 0 ? ",".concat(valueOf) : new String(","))) {
                String valueOf2 = String.valueOf(str);
                this.c.a(a.substring((valueOf2.length() != 0 ? ",".concat(valueOf2) : new String(",")).length()));
                return true;
            }
            return false;
        }
    }

    private static boolean a(FirebaseInstanceId firebaseInstanceId, String str) {
        String[] split = str.split("!");
        if (split.length == 2) {
            String str2 = split[0];
            String str3 = split[1];
            char c = 65535;
            try {
                int hashCode = str2.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85 && str2.equals("U")) {
                        c = 1;
                    }
                } else if (str2.equals(ExifInterface.LATITUDE_SOUTH)) {
                    c = 0;
                }
                if (c == 0) {
                    cns f = firebaseInstanceId.f();
                    if (firebaseInstanceId.a(f)) {
                        throw new IOException("token not available");
                    }
                    firebaseInstanceId.a(firebaseInstanceId.e.b(FirebaseInstanceId.d(), f.a, str3));
                    FirebaseInstanceId.g();
                } else if (c == 1) {
                    cns f2 = firebaseInstanceId.f();
                    if (firebaseInstanceId.a(f2)) {
                        throw new IOException("token not available");
                    }
                    firebaseInstanceId.a(firebaseInstanceId.e.c(FirebaseInstanceId.d(), f2.a, str3));
                    FirebaseInstanceId.g();
                }
            } catch (IOException e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    "Topic sync failed: ".concat(valueOf);
                } else {
                    new String("Topic sync failed: ");
                }
                return false;
            }
        }
        return true;
    }
}
