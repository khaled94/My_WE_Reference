package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;

/* renamed from: byz  reason: default package */
/* loaded from: classes2.dex */
public final class byz implements bxw {
    private final SharedPreferences.Editor a;
    private final String b;

    public byz(Context context, String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.b = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.a = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }

    @Override // defpackage.bxw
    public final void a(cbt cbtVar) throws IOException {
        if (this.a.putString(this.b, cge.a(cbtVar.g())).commit()) {
            return;
        }
        throw new IOException("Failed to write to SharedPreferences");
    }

    @Override // defpackage.bxw
    public final void a(cbd cbdVar) throws IOException {
        if (this.a.putString(this.b, cge.a(cbdVar.g())).commit()) {
            return;
        }
        throw new IOException("Failed to write to SharedPreferences");
    }
}
