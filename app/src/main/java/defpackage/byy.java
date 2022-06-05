package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: byy  reason: default package */
/* loaded from: classes2.dex */
public final class byy implements bxv {
    private final SharedPreferences a;
    private final String b;

    public byy(Context context, String str, String str2) throws IOException {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.b = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.a = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        } else {
            this.a = applicationContext.getSharedPreferences(str2, 0);
        }
    }

    private byte[] c() throws IOException {
        try {
            String string = this.a.getString(this.b, null);
            if (string == null) {
                throw new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", this.b));
            }
            return cge.a(string);
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", this.b));
        }
    }

    @Override // defpackage.bxv
    public final cbt a() throws IOException {
        return cbt.a(c(), cdb.a());
    }

    @Override // defpackage.bxv
    public final cbd b() throws IOException {
        return cbd.a(c(), cdb.a());
    }
}
