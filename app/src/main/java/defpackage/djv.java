package defpackage;

import android.content.SharedPreferences;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: djv  reason: default package */
/* loaded from: classes2.dex */
public final class djv {
    static SharedPreferences a;

    public static SharedPreferences a() {
        try {
            a = EncryptedSharedPreferences.create(ly.k(), ly.k().getPackageName(), new MasterKey.Builder(ly.k()).setKeyScheme(MasterKey.KeyScheme.AES256_GCM).build(), EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (GeneralSecurityException e2) {
            e2.printStackTrace();
        }
        return a;
    }

    public static String a(String str, String str2) {
        return a().getString(str, str2);
    }

    public static void b(String str, String str2) {
        a().edit().putString(str, str2).apply();
    }

    public static void a(String str, int i) {
        a().edit().putInt(str, i).apply();
    }

    public static int a(String str) {
        return a().getInt(str, -1);
    }
}
