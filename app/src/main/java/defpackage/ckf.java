package defpackage;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ckf  reason: default package */
/* loaded from: classes2.dex */
public final class ckf {
    private static final Map<String, String> a;

    public static void a(Intent intent, Status status) {
        abe.a(status, intent, "com.google.firebase.auth.internal.STATUS");
    }

    public static boolean a(Intent intent) {
        aat.a(intent);
        return intent.hasExtra("com.google.firebase.auth.internal.STATUS");
    }

    public static Status b(Intent intent) {
        aat.a(intent);
        aat.a(a(intent));
        return (Status) abe.a(intent, "com.google.firebase.auth.internal.STATUS", Status.CREATOR);
    }

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        a.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        a.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        a.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        a.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }
}
