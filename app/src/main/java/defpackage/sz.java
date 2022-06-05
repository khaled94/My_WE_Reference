package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: sz  reason: default package */
/* loaded from: classes2.dex */
public final class sz {
    private SharedPreferences a;

    public sz(Context context) {
        try {
            Context remoteContext = uz.getRemoteContext(context);
            this.a = remoteContext == null ? null : remoteContext.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable unused) {
            this.a = null;
        }
    }

    public final String a(String str, String str2) {
        try {
            return this.a == null ? str2 : this.a.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public final boolean a(String str) {
        try {
            if (this.a != null) {
                return this.a.getBoolean(str, false);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final float b(String str) {
        try {
            if (this.a != null) {
                return this.a.getFloat(str, 0.0f);
            }
            return 0.0f;
        } catch (Throwable unused) {
            return 0.0f;
        }
    }
}
