package defpackage;

import android.os.Build;
import android.os.Bundle;
import com.facebook.FacebookException;
import defpackage.qc;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 '2\u00020\u0001:\u0002'(BE\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eB)\b\u0012\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0013J\b\u0010\u001d\u001a\u00020\u0003H\u0002J\u0006\u0010\u001e\u001a\u00020\nJ\u0006\u0010\u001f\u001a\u00020\u0017J;\u0010 \u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u0003H\u0016J\u001e\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030$2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010%\u001a\u00020&H\u0002R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006)"}, d2 = {"Lcom/facebook/appevents/AppEvent;", "Ljava/io/Serializable;", "contextName", "", "eventName", "valueToSum", "", "parameters", "Landroid/os/Bundle;", "isImplicitlyLogged", "", "isInBackground", "currentSessionId", "Ljava/util/UUID;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;ZZLjava/util/UUID;)V", "jsonString", "isImplicit", "inBackground", "checksum", "(Ljava/lang/String;ZZLjava/lang/String;)V", "isChecksumValid", "()Z", "jsonObject", "Lorg/json/JSONObject;", "getJsonObject", "()Lorg/json/JSONObject;", "name", "getName", "()Ljava/lang/String;", "calculateChecksum", "getIsImplicit", "getJSONObject", "getJSONObjectForAppEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;Ljava/util/UUID;)Lorg/json/JSONObject;", "toString", "validateParameters", "", "writeReplace", "", "Companion", "SerializationProxyV2", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: mq  reason: default package */
/* loaded from: classes2.dex */
public final class mq implements Serializable {
    public static final a d = new a((byte) 0);
    private static final HashSet<String> g = new HashSet<>();
    public final JSONObject a;
    public final boolean b;
    public final String c;
    private final boolean e;
    private final String f;

    public /* synthetic */ mq(String str, boolean z, boolean z2, String str2, byte b2) {
        this(str, z, z2, str2);
    }

    public mq(String str, String str2, Double d2, Bundle bundle, boolean z, boolean z2, UUID uuid) throws JSONException, FacebookException {
        dqc.d(str, "contextName");
        dqc.d(str2, "eventName");
        this.b = z;
        this.e = z2;
        this.c = str2;
        this.a = a(str, str2, d2, bundle, uuid);
        this.f = c();
    }

    private mq(String str, boolean z, boolean z2, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        this.a = jSONObject;
        this.b = z;
        String optString = jSONObject.optString("_eventName");
        dqc.b(optString, "jsonObject.optString(Con…nts.EVENT_NAME_EVENT_KEY)");
        this.c = optString;
        this.f = str2;
        this.e = z2;
    }

    public final boolean a() {
        if (this.f == null) {
            return true;
        }
        return dqc.a((Object) c(), (Object) this.f);
    }

    private final Map<String, String> a(Bundle bundle) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            dqc.b(str, "key");
            a.a(str);
            Object obj = bundle.get(str);
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                dqi dqiVar = dqi.a;
                String format = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, str}, 2));
                dqc.b(format, "java.lang.String.format(format, *args)");
                throw new FacebookException(format);
            }
            hashMap.put(str, obj.toString());
        }
        od.a(hashMap);
        oy.a(dqj.a(hashMap), this.c);
        nu.a(dqj.a(hashMap), this.c);
        return hashMap;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/facebook/appevents/AppEvent$SerializationProxyV2;", "Ljava/io/Serializable;", "jsonString", "", "isImplicit", "", "inBackground", "checksum", "(Ljava/lang/String;ZZLjava/lang/String;)V", "readResolve", "", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: mq$b */
    /* loaded from: classes2.dex */
    public static final class b implements Serializable {
        public static final a a = new a((byte) 0);
        private final String b;
        private final boolean c;
        private final boolean d;
        private final String e;

        public b(String str, boolean z, boolean z2, String str2) {
            dqc.d(str, "jsonString");
            this.b = str;
            this.c = z;
            this.d = z2;
            this.e = str2;
        }

        private final Object readResolve() throws JSONException, ObjectStreamException {
            return new mq(this.b, this.c, this.d, this.e, (byte) 0);
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/facebook/appevents/AppEvent$SerializationProxyV2$Companion;", "", "()V", "serialVersionUID", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
        /* renamed from: mq$b$a */
        /* loaded from: classes2.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }
    }

    private final Object writeReplace() throws ObjectStreamException {
        String jSONObject = this.a.toString();
        dqc.b(jSONObject, "jsonObject.toString()");
        return new b(jSONObject, this.b, this.e, this.f);
    }

    public final String toString() {
        dqi dqiVar = dqi.a;
        String format = String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{this.a.optString("_eventName"), Boolean.valueOf(this.b), this.a.toString()}, 3));
        dqc.b(format, "java.lang.String.format(format, *args)");
        return format;
    }

    private final String c() {
        if (Build.VERSION.SDK_INT > 19) {
            String jSONObject = this.a.toString();
            dqc.b(jSONObject, "jsonObject.toString()");
            return a.b(jSONObject);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = this.a.keys();
        while (keys.hasNext()) {
            arrayList.add(keys.next());
        }
        dmq.c((List) arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            sb.append(str);
            sb.append(" = ");
            sb.append(this.a.optString(str));
            sb.append('\n');
        }
        String sb2 = sb.toString();
        dqc.b(sb2, "sb.toString()");
        return a.b(sb2);
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/appevents/AppEvent$Companion;", "", "()V", "MAX_IDENTIFIER_LENGTH", "", "serialVersionUID", "", "validatedIdentifiers", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "md5Checksum", "toHash", "validateIdentifier", "", "identifier", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: mq$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        static void a(String str) {
            boolean contains;
            if (str != null) {
                String str2 = str;
                if (!(str2.length() == 0) && str.length() <= 40) {
                    synchronized (mq.g) {
                        contains = mq.g.contains(str);
                        dmg dmgVar = dmg.a;
                    }
                    if (contains) {
                        return;
                    }
                    if (new dsf("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").a(str2)) {
                        synchronized (mq.g) {
                            mq.g.add(str);
                        }
                        return;
                    }
                    dqi dqiVar = dqi.a;
                    String format = String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{str}, 1));
                    dqc.b(format, "java.lang.String.format(format, *args)");
                    throw new FacebookException(format);
                }
            }
            if (str == null) {
                str = "<None Provided>";
            }
            dqi dqiVar2 = dqi.a;
            String format2 = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2));
            dqc.b(format2, "java.lang.String.format(locale, format, *args)");
            throw new FacebookException(format2);
        }

        static String b(String str) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                Charset forName = Charset.forName("UTF-8");
                dqc.b(forName, "Charset.forName(charsetName)");
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes = str.getBytes(forName);
                dqc.b(bytes, "(this as java.lang.String).getBytes(charset)");
                messageDigest.update(bytes, 0, bytes.length);
                byte[] digest = messageDigest.digest();
                dqc.b(digest, "digest.digest()");
                return of.a(digest);
            } catch (UnsupportedEncodingException e) {
                qi.a("Failed to generate checksum: ", (Exception) e);
                return "1";
            } catch (NoSuchAlgorithmException e2) {
                qi.a("Failed to generate checksum: ", (Exception) e2);
                return "0";
            }
        }
    }

    private final JSONObject a(String str, String str2, Double d2, Bundle bundle, UUID uuid) {
        a.a(str2);
        JSONObject jSONObject = new JSONObject();
        String a2 = oy.a(str2);
        jSONObject.put("_eventName", a2);
        jSONObject.put("_eventName_md5", a.b(a2));
        jSONObject.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            Map<String, String> a3 = a(bundle);
            for (String str3 : a3.keySet()) {
                jSONObject.put(str3, a3.get(str3));
            }
        }
        if (d2 != null) {
            jSONObject.put("_valueToSum", d2.doubleValue());
        }
        if (this.e) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.b) {
            jSONObject.put("_implicitlyLogged", "1");
        } else {
            qc.a aVar = qc.a;
            mf mfVar = mf.APP_EVENTS;
            String jSONObject2 = jSONObject.toString();
            dqc.b(jSONObject2, "eventObject.toString()");
            aVar.a(mfVar, "AppEvents", "Created app event '%s'", jSONObject2);
        }
        return jSONObject;
    }
}
