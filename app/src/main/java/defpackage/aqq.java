package defpackage;

import android.net.Uri;

/* renamed from: aqq  reason: default package */
/* loaded from: classes.dex */
public final class aqq {
    public static Uri a(String str) {
        String valueOf = String.valueOf(Uri.encode(str));
        return Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
    }
}
