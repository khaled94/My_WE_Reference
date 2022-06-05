package defpackage;

import android.util.Base64;
import androidx.lifecycle.CoroutineLiveDataKt;
import defpackage.dqf;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0007J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0007J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/facebook/internal/security/OidcSecurityUtil;", "", "()V", "OPENID_KEYS_PATH", "", "getOPENID_KEYS_PATH", "()Ljava/lang/String;", "SIGNATURE_ALGORITHM_SHA256", "TIMEOUT_IN_MILLISECONDS", "", "getPublicKeyFromString", "Ljava/security/PublicKey;", "key", "getRawKeyFromEndPoint", "kid", "verify", "", "publicKey", "data", "signature", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: rg  reason: default package */
/* loaded from: classes2.dex */
public final class rg {
    public static final rg a = new rg();
    private static final String b = "/.well-known/oauth/openid/keys/";

    private rg() {
    }

    /* JADX WARN: Finally extract failed */
    public static final String a(String str) {
        dqc.d(str, "kid");
        URL url = new URL("https", "www." + ly.g(), b);
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        dqf.b bVar = new dqf.b();
        bVar.a = null;
        ly.a().execute(new a(url, bVar, str, reentrantLock, newCondition));
        ReentrantLock reentrantLock2 = reentrantLock;
        reentrantLock2.lock();
        try {
            newCondition.await(CoroutineLiveDataKt.DEFAULT_TIMEOUT, TimeUnit.MILLISECONDS);
            reentrantLock2.unlock();
            return (String) bVar.a;
        } catch (Throwable th) {
            reentrantLock2.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: rg$a */
    /* loaded from: classes2.dex */
    public static final class a implements Runnable {
        final /* synthetic */ URL a;
        final /* synthetic */ dqf.b b;
        final /* synthetic */ String c;
        final /* synthetic */ ReentrantLock d;
        final /* synthetic */ Condition e;

        a(URL url, dqf.b bVar, String str, ReentrantLock reentrantLock, Condition condition) {
            this.a = url;
            this.b = bVar;
            this.c = str;
            this.d = reentrantLock;
            this.e = condition;
        }

        /* JADX WARN: Type inference failed for: r1v9, types: [T, java.lang.String] */
        @Override // java.lang.Runnable
        public final void run() {
            if (qx.a(this)) {
                return;
            }
            try {
                URLConnection openConnection = this.a.openConnection();
                if (openConnection == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    dqc.b(inputStream, "connection.inputStream");
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, dsd.a), 8192);
                    dqc.d(bufferedReader, "$this$readText");
                    StringWriter stringWriter = new StringWriter();
                    dos.a(bufferedReader, stringWriter);
                    String stringWriter2 = stringWriter.toString();
                    dqc.b(stringWriter2, "buffer.toString()");
                    httpURLConnection.getInputStream().close();
                    this.b.a = new JSONObject(stringWriter2).optString(this.c);
                    httpURLConnection.disconnect();
                    ReentrantLock reentrantLock = this.d;
                    reentrantLock.lock();
                    this.e.signal();
                    dmg dmgVar = dmg.a;
                    reentrantLock.unlock();
                } catch (Exception e) {
                    rg.a.getClass().getName();
                    e.getMessage();
                    httpURLConnection.disconnect();
                    ReentrantLock reentrantLock2 = this.d;
                    reentrantLock2.lock();
                    this.e.signal();
                    dmg dmgVar2 = dmg.a;
                    reentrantLock2.unlock();
                }
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    public static final boolean a(PublicKey publicKey, String str, String str2) {
        dqc.d(publicKey, "publicKey");
        dqc.d(str, "data");
        dqc.d(str2, "signature");
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initVerify(publicKey);
            byte[] bytes = str.getBytes(dsd.a);
            dqc.b(bytes, "(this as java.lang.String).getBytes(charset)");
            signature.update(bytes);
            byte[] decode = Base64.decode(str2, 8);
            dqc.b(decode, "Base64.decode(signature, Base64.URL_SAFE)");
            return signature.verify(decode);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final PublicKey b(String str) {
        dqc.d(str, "key");
        byte[] decode = Base64.decode(dsg.a(dsg.a(dsg.a(str, "\n", ""), "-----BEGIN PUBLIC KEY-----", ""), "-----END PUBLIC KEY-----", ""), 0);
        dqc.b(decode, "Base64.decode(pubKeyString, Base64.DEFAULT)");
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode));
        dqc.b(generatePublic, "kf.generatePublic(x509publicKey)");
        return generatePublic;
    }
}
