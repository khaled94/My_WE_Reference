package defpackage;

import android.net.Uri;
import java.util.Set;

/* renamed from: cli  reason: default package */
/* loaded from: classes2.dex */
public final class cli {
    private static final ajx<String, Integer> g = ajx.a("recoverEmail", 2, "resetPassword", 0, "signIn", 4, "verifyEmail", 1);
    public final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;

    private cli(String str) {
        this.b = a(str, "apiKey");
        this.c = a(str, "oobCode");
        String a = a(str, "mode");
        this.d = a;
        if (this.b == null || this.c == null || a == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", "apiKey", "oobCode", "mode"));
        }
        this.e = a(str, "continueUrl");
        this.f = a(str, "languageCode");
        this.a = a(str, "tenantId");
    }

    public static cli a(String str) {
        aat.a(str);
        try {
            return new cli(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private static String a(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (!queryParameterNames.contains("link")) {
                return null;
            }
            return Uri.parse(parse.getQueryParameter("link")).getQueryParameter(str2);
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
