package defpackage;

import android.util.Base64;

/* renamed from: adw  reason: default package */
/* loaded from: classes.dex */
public final class adw {
    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
