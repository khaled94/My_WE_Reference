package defpackage;

import android.util.Base64;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* renamed from: djh  reason: default package */
/* loaded from: classes2.dex */
public final class djh {
    private static String a = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA3yQ7N8rL+RBCEN4ZNQ3LKkh1/O6hkRlpGcKmo3pt/RgF0OruluFnggg26y+UfhHkVcWUCKonSu+Wnudm0KoYt6fsWS+vERqmh35Fj7H54LI0/8mkAiuUi0ryIBuhcy9E/AgosoHabpgw1fSv0JKwygan/3EM/hXLt3gOlPuMbkHbLlQ2KOTMFcOEDHvCJ08HEhzI9rlBZeDKy28d10cPTNQhEH1PbpgpMgz+OI/wxtC3q0VpVqECIOYhiP6nmNXqREMGV5aren489gd7DNm+OG4QZgZJGtPPktxSKzT8ZcYYuypMRefWcXl4p6HFCMryurfEkgNndU4MFMB2MXjxMQIDAQAB";

    public static String a(String str) {
        try {
            PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(a, 2)));
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA1AndMGF1Padding");
            cipher.init(1, generatePublic);
            return Base64.encodeToString(cipher.doFinal(str.getBytes()), 2);
        } catch (InvalidKeyException e) {
            e.printStackTrace();
            return "";
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return "";
        } catch (InvalidKeySpecException e3) {
            e3.printStackTrace();
            return "";
        } catch (BadPaddingException e4) {
            e4.printStackTrace();
            return "";
        } catch (IllegalBlockSizeException e5) {
            e5.printStackTrace();
            return "";
        } catch (NoSuchPaddingException e6) {
            e6.printStackTrace();
            return "";
        }
    }
}
