package defpackage;

import android.util.Log;

/* renamed from: aak  reason: default package */
/* loaded from: classes.dex */
public final class aak {
    private final String a;
    private final String b;

    public aak(String str) {
        this(str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a(String str) {
        String str2 = this.b;
        return str2 == null ? str : str2.concat(str);
    }

    public final boolean a(int i) {
        return Log.isLoggable(this.a, i);
    }

    public aak(String str, String str2) {
        aat.a(str, (Object) "log tag cannot be null");
        aat.a(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.a = str;
        if (str2 == null || str2.length() <= 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }
}
