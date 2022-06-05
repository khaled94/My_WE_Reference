package defpackage;

import android.content.Context;
import com.ucare.we.App;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.sqlcipher.Cursor;

/* renamed from: diz  reason: default package */
/* loaded from: classes2.dex */
public final class diz {
    private static Key a(Context context) throws Exception {
        cwe a = cwe.a(context);
        App.a();
        Cursor rawQuery = a.getWritableDatabase(djv.a("dbPassword", "")).rawQuery("SELECT * FROM 'keys';", (String[]) null);
        if (rawQuery.moveToFirst()) {
            String string = rawQuery.getString(3);
            new eet();
            rawQuery.close();
            return new SecretKeySpec((byte[]) eet.a(string), "AES");
        }
        return null;
    }

    public static String a(String str, Context context) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cwe a = cwe.a(context);
        App.a();
        Cursor rawQuery = a.getWritableDatabase(djv.a("dbPassword", "")).rawQuery("SELECT * FROM 'keys';", (String[]) null);
        if (rawQuery.moveToFirst()) {
            String string = rawQuery.getString(2);
            new eet();
            cipher.init(1, a(context), new IvParameterSpec((byte[]) eet.a(string)));
            byte[] doFinal = cipher.doFinal(str.getBytes("UTF-8"));
            rawQuery.close();
            return new String(eer.a(doFinal));
        }
        return "";
    }
}
