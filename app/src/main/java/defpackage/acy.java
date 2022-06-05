package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;

/* renamed from: acy  reason: default package */
/* loaded from: classes.dex */
public final class acy {
    private static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    final String a;
    final ComponentName b = null;
    final int c;
    private final String e;
    private final boolean f;

    public final Intent a(Context context) {
        Bundle bundle;
        if (this.e != null) {
            Intent intent = null;
            if (this.f) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", this.e);
                try {
                    bundle = context.getContentResolver().call(d, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e) {
                    "Dynamic intent resolution failed: ".concat(e.toString());
                    bundle = null;
                }
                if (bundle != null) {
                    intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
                }
                if (intent == null) {
                    String valueOf = String.valueOf(this.e);
                    if (valueOf.length() != 0) {
                        "Dynamic lookup for intent failed for action: ".concat(valueOf);
                    } else {
                        new String("Dynamic lookup for intent failed for action: ");
                    }
                }
            }
            return intent != null ? intent : new Intent(this.e).setPackage(this.a);
        }
        return new Intent().setComponent(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acy)) {
            return false;
        }
        acy acyVar = (acy) obj;
        return aar.a(this.e, acyVar.e) && aar.a(this.a, acyVar.a) && aar.a(this.b, acyVar.b) && this.c == acyVar.c && this.f == acyVar.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.e, this.a, this.b, Integer.valueOf(this.c), Boolean.valueOf(this.f)});
    }

    public final String toString() {
        String str = this.e;
        if (str == null) {
            aat.a(this.b);
            return this.b.flattenToString();
        }
        return str;
    }

    public acy(String str, String str2, int i, boolean z) {
        aat.a(str);
        this.e = str;
        aat.a(str2);
        this.a = str2;
        this.c = i;
        this.f = z;
    }
}
