package defpackage;

import com.google.android.gms.internal.firebase_auth.zzbl;
import java.util.Collections;
import java.util.Map;

/* renamed from: cjw  reason: default package */
/* loaded from: classes2.dex */
public final class cjw {
    private static final adj a = new adj("GetTokenResultFactory", new String[0]);

    public static cho a(String str) {
        Map<String, Object> map;
        try {
            map = cjv.a(str);
        } catch (zzbl unused) {
            a.a("Error parsing token claims", new Object[0]);
            map = Collections.EMPTY_MAP;
        }
        return new cho(str, map);
    }
}
