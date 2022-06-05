package defpackage;

import android.util.Log;
import java.util.Locale;

/* renamed from: adj  reason: default package */
/* loaded from: classes.dex */
public final class adj {
    public final String a;
    private final String b;
    private final aak c;
    private final int d;

    public adj(String str, String... strArr) {
        String str2;
        if (strArr.length == 0) {
            str2 = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str3 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str3);
            }
            sb.append("] ");
            str2 = sb.toString();
        }
        this.b = str2;
        this.a = str;
        this.c = new aak(str);
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.a, i)) {
            i++;
        }
        this.d = i;
    }

    private boolean a(int i) {
        return this.d <= i;
    }

    public final String a(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.b.concat(str);
    }

    public final void b(String str, Object... objArr) {
        if (a(3)) {
            a(str, objArr);
        }
    }

    public final void c(String str, Object... objArr) {
        if (a(2)) {
            a(str, objArr);
        }
    }
}
