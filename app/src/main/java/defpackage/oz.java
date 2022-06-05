package defpackage;

import android.util.Patterns;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0006H\u0007J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0019\u001a\u00020\u0012H\u0002J \u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0007J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0007J\u0010\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u0012H\u0002J\b\u0010#\u001a\u00020\u000fH\u0007J)\u0010$\u001a\u00020\u000f2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060&H\u0002¢\u0006\u0002\u0010(J0\u0010)\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0002J\u0010\u0010.\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u0012H\u0002J\u0018\u0010/\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010*\u001a\u00020+H\u0002J\u0018\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0006H\u0002J(\u00100\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0006H\u0002J\u0018\u00106\u001a\u00020\u001e2\u0006\u00107\u001a\u00020\u00152\u0006\u00108\u001a\u00020\u0015H\u0002J(\u00109\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00122\n\u0010:\u001a\u00060;j\u0002`<2\n\u0010=\u001a\u00060;j\u0002`<H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\rX\u0082.¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/facebook/appevents/suggestedevents/FeatureExtractor;", "", "()V", "NUM_OF_FEATURES", "", "REGEX_ADD_TO_CART_BUTTON_TEXT", "", "REGEX_ADD_TO_CART_PAGE_TITLE", "REGEX_CR_HAS_CONFIRM_PASSWORD_FIELD", "REGEX_CR_HAS_LOG_IN_KEYWORDS", "REGEX_CR_HAS_SIGN_ON_KEYWORDS", "REGEX_CR_PASSWORD_FIELD", "eventInfo", "", "initialized", "", "languageInfo", "rules", "Lorg/json/JSONObject;", "textTypeInfo", "getDenseFeatures", "", "viewHierarchy", "appName", "getInteractedNode", "view", "getTextFeature", "buttonText", "activityName", "initialize", "", "file", "Ljava/io/File;", "isButton", "node", "isInitialized", "matchIndicators", "indicators", "", "values", "([Ljava/lang/String;[Ljava/lang/String;)Z", "nonparseFeatures", "siblings", "Lorg/json/JSONArray;", "screenName", "formFieldsJSON", "parseFeatures", "pruneTree", "regexMatched", "pattern", "matchText", "language", NotificationCompat.CATEGORY_EVENT, "textType", "sum", "a", "b", "updateHintAndTextRecursively", "textSB", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "hintSB", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: oz  reason: default package */
/* loaded from: classes2.dex */
public final class oz {
    public static final oz a = new oz();
    private static Map<String, String> b;
    private static Map<String, String> c;
    private static Map<String, String> d;
    private static JSONObject e;
    private static boolean f;

    private oz() {
    }

    public static final boolean a() {
        if (qx.a(oz.class)) {
            return false;
        }
        try {
            return f;
        } catch (Throwable th) {
            qx.a(th, oz.class);
            return false;
        }
    }

    public static final void a(File file) {
        if (qx.a(oz.class)) {
            return;
        }
        try {
            try {
                e = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                e = new JSONObject(new String(bArr, dsd.a));
                b = dnh.a(dme.a("ENGLISH", "1"), dme.a("GERMAN", ExifInterface.GPS_MEASUREMENT_2D), dme.a("SPANISH", ExifInterface.GPS_MEASUREMENT_3D), dme.a("JAPANESE", "4"));
                c = dnh.a(dme.a("VIEW_CONTENT", "0"), dme.a("SEARCH", "1"), dme.a("ADD_TO_CART", ExifInterface.GPS_MEASUREMENT_2D), dme.a("ADD_TO_WISHLIST", ExifInterface.GPS_MEASUREMENT_3D), dme.a("INITIATE_CHECKOUT", "4"), dme.a("ADD_PAYMENT_INFO", "5"), dme.a("PURCHASE", "6"), dme.a("LEAD", "7"), dme.a("COMPLETE_REGISTRATION", "8"));
                d = dnh.a(dme.a("BUTTON_TEXT", "1"), dme.a("PAGE_TITLE", ExifInterface.GPS_MEASUREMENT_2D), dme.a("RESOLVED_DOCUMENT_LINK", ExifInterface.GPS_MEASUREMENT_3D), dme.a("BUTTON_ID", "4"));
                f = true;
            } catch (Throwable th) {
                qx.a(th, oz.class);
            }
        } catch (Exception unused) {
        }
    }

    public static final String a(String str, String str2, String str3) {
        if (qx.a(oz.class)) {
            return null;
        }
        try {
            dqc.d(str, "buttonText");
            dqc.d(str2, "activityName");
            dqc.d(str3, "appName");
            String str4 = str3 + " | " + str2 + ", " + str;
            if (str4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = str4.toLowerCase();
            dqc.b(lowerCase, "(this as java.lang.String).toLowerCase()");
            return lowerCase;
        } catch (Throwable th) {
            qx.a(th, oz.class);
            return null;
        }
    }

    public static final float[] a(JSONObject jSONObject, String str) {
        String lowerCase;
        JSONObject jSONObject2;
        String optString;
        JSONArray jSONArray;
        JSONObject c2;
        if (qx.a(oz.class)) {
            return null;
        }
        try {
            dqc.d(jSONObject, "viewHierarchy");
            dqc.d(str, "appName");
            if (!f) {
                return null;
            }
            float[] fArr = new float[30];
            for (int i = 0; i < 30; i++) {
                fArr[i] = 0.0f;
            }
            try {
                lowerCase = str.toLowerCase();
                dqc.b(lowerCase, "(this as java.lang.String).toLowerCase()");
                jSONObject2 = new JSONObject(jSONObject.optJSONObject("view").toString());
                optString = jSONObject.optString("screenname");
                jSONArray = new JSONArray();
                a.a(jSONObject2, jSONArray);
                a.a(fArr, a.a(jSONObject2));
                c2 = a.c(jSONObject2);
            } catch (JSONException unused) {
            }
            if (c2 == null) {
                return null;
            }
            oz ozVar = a;
            dqc.b(optString, "screenName");
            String jSONObject3 = jSONObject2.toString();
            dqc.b(jSONObject3, "viewTree.toString()");
            a.a(fArr, ozVar.a(c2, jSONArray, optString, jSONObject3, lowerCase));
            return fArr;
        } catch (Throwable th) {
            qx.a(th, oz.class);
            return null;
        }
    }

    private final float[] a(JSONObject jSONObject) {
        boolean a2;
        boolean a3;
        boolean a4;
        if (qx.a(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i = 0; i < 30; i++) {
                fArr[i] = 0.0f;
            }
            String optString = jSONObject.optString("text");
            dqc.b(optString, "node.optString(TEXT_KEY)");
            if (optString == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = optString.toLowerCase();
            dqc.b(lowerCase, "(this as java.lang.String).toLowerCase()");
            String optString2 = jSONObject.optString("hint");
            dqc.b(optString2, "node.optString(HINT_KEY)");
            if (optString2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase2 = optString2.toLowerCase();
            dqc.b(lowerCase2, "(this as java.lang.String).toLowerCase()");
            String optString3 = jSONObject.optString("classname");
            dqc.b(optString3, "node.optString(CLASS_NAME_KEY)");
            if (optString3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase3 = optString3.toLowerCase();
            dqc.b(lowerCase3, "(this as java.lang.String).toLowerCase()");
            int optInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (a(new String[]{"$", "amount", "price", "total"}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (a(new String[]{"password", "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (a(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (a(new String[]{"search"}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (optInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (optInt == 3 || optInt == 2) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (optInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            a2 = dsg.a((CharSequence) lowerCase3, (CharSequence) "checkbox");
            if (a2) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (a(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            a3 = dsg.a((CharSequence) lowerCase3, (CharSequence) "radio");
            if (a3) {
                a4 = dsg.a((CharSequence) lowerCase3, (CharSequence) "button");
                if (a4) {
                    fArr[12] = fArr[12] + 1.0f;
                }
            }
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                int length = optJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                    dqc.b(jSONObject2, "childViews.getJSONObject(i)");
                    a(fArr, a(jSONObject2));
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    private final float[] a(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        boolean a2;
        if (qx.a(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i = 0; i < 30; i++) {
                fArr[i] = 0.0f;
            }
            int length = jSONArray.length();
            fArr[3] = length > 1 ? length - 1.0f : 0.0f;
            try {
                int length2 = jSONArray.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    dqc.b(jSONObject2, "siblings.getJSONObject(i)");
                    if (b(jSONObject2)) {
                        fArr[9] = fArr[9] + 1.0f;
                    }
                }
            } catch (JSONException unused) {
            }
            fArr[13] = -1.0f;
            fArr[14] = -1.0f;
            String str4 = str + '|' + str3;
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            a(jSONObject, sb2, sb);
            String sb3 = sb.toString();
            dqc.b(sb3, "hintSB.toString()");
            String sb4 = sb2.toString();
            dqc.b(sb4, "textSB.toString()");
            fArr[15] = a("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_TEXT", sb4) ? 1.0f : 0.0f;
            fArr[16] = a("ENGLISH", "COMPLETE_REGISTRATION", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            fArr[17] = a("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_ID", sb3) ? 1.0f : 0.0f;
            a2 = dsg.a((CharSequence) str2, (CharSequence) "password");
            fArr[18] = a2 ? 1.0f : 0.0f;
            fArr[19] = a("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2) ? 1.0f : 0.0f;
            fArr[20] = a("(?i)(sign in)|login|signIn", str2) ? 1.0f : 0.0f;
            fArr[21] = a("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2) ? 1.0f : 0.0f;
            fArr[22] = a("ENGLISH", "PURCHASE", "BUTTON_TEXT", sb4) ? 1.0f : 0.0f;
            fArr[24] = a("ENGLISH", "PURCHASE", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            fArr[25] = a("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", sb4) ? 1.0f : 0.0f;
            fArr[27] = a("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4) ? 1.0f : 0.0f;
            fArr[28] = a("ENGLISH", "LEAD", "BUTTON_TEXT", sb4) ? 1.0f : 0.0f;
            fArr[29] = a("ENGLISH", "LEAD", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            return fArr;
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:5:0x0008, B:7:0x000c, B:8:0x0011, B:10:0x0019, B:12:0x001d, B:13:0x0022, B:15:0x002e, B:17:0x0036, B:19:0x003a, B:20:0x003f, B:22:0x004b, B:24:0x0053, B:26:0x0057, B:27:0x005c, B:31:0x006b), top: B:36:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean a(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            boolean r0 = defpackage.qx.a(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            org.json.JSONObject r0 = defpackage.oz.e     // Catch: java.lang.Throwable -> L70
            if (r0 != 0) goto L11
            java.lang.String r2 = "rules"
            defpackage.dqc.a(r2)     // Catch: java.lang.Throwable -> L70
        L11:
            java.lang.String r2 = "rulesForLanguage"
            org.json.JSONObject r0 = r0.optJSONObject(r2)     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L67
            java.util.Map<java.lang.String, java.lang.String> r2 = defpackage.oz.b     // Catch: java.lang.Throwable -> L70
            if (r2 != 0) goto L22
            java.lang.String r3 = "languageInfo"
            defpackage.dqc.a(r3)     // Catch: java.lang.Throwable -> L70
        L22:
            java.lang.Object r5 = r2.get(r5)     // Catch: java.lang.Throwable -> L70
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L70
            org.json.JSONObject r5 = r0.optJSONObject(r5)     // Catch: java.lang.Throwable -> L70
            if (r5 == 0) goto L67
            java.lang.String r0 = "rulesForEvent"
            org.json.JSONObject r5 = r5.optJSONObject(r0)     // Catch: java.lang.Throwable -> L70
            if (r5 == 0) goto L67
            java.util.Map<java.lang.String, java.lang.String> r0 = defpackage.oz.c     // Catch: java.lang.Throwable -> L70
            if (r0 != 0) goto L3f
            java.lang.String r2 = "eventInfo"
            defpackage.dqc.a(r2)     // Catch: java.lang.Throwable -> L70
        L3f:
            java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.Throwable -> L70
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L70
            org.json.JSONObject r5 = r5.optJSONObject(r6)     // Catch: java.lang.Throwable -> L70
            if (r5 == 0) goto L67
            java.lang.String r6 = "positiveRules"
            org.json.JSONObject r5 = r5.optJSONObject(r6)     // Catch: java.lang.Throwable -> L70
            if (r5 == 0) goto L67
            java.util.Map<java.lang.String, java.lang.String> r6 = defpackage.oz.d     // Catch: java.lang.Throwable -> L70
            if (r6 != 0) goto L5c
            java.lang.String r0 = "textTypeInfo"
            defpackage.dqc.a(r0)     // Catch: java.lang.Throwable -> L70
        L5c:
            java.lang.Object r6 = r6.get(r7)     // Catch: java.lang.Throwable -> L70
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L70
            java.lang.String r5 = r5.optString(r6)     // Catch: java.lang.Throwable -> L70
            goto L68
        L67:
            r5 = 0
        L68:
            if (r5 != 0) goto L6b
            return r1
        L6b:
            boolean r5 = r4.a(r5, r8)     // Catch: java.lang.Throwable -> L70
            return r5
        L70:
            r5 = move-exception
            defpackage.qx.a(r5, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oz.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    private final boolean a(String str, String str2) {
        if (qx.a(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th) {
            qx.a(th, this);
            return false;
        }
    }

    private final boolean a(String[] strArr, String[] strArr2) {
        if (qx.a(this)) {
            return false;
        }
        try {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (dsg.a((CharSequence) str2, (CharSequence) str)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            qx.a(th, this);
            return false;
        }
    }

    private final boolean a(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z;
        boolean z2;
        if (qx.a(this)) {
            return false;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            int length = optJSONArray.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    z2 = false;
                    break;
                } else if (optJSONArray.getJSONObject(i).optBoolean("is_interacted")) {
                    z = true;
                    z2 = true;
                    break;
                } else {
                    i++;
                }
            }
            JSONArray jSONArray2 = new JSONArray();
            if (z) {
                int length2 = optJSONArray.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    jSONArray.put(optJSONArray.getJSONObject(i2));
                }
            } else {
                int length3 = optJSONArray.length();
                for (int i3 = 0; i3 < length3; i3++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i3);
                    dqc.b(jSONObject2, "child");
                    if (a(jSONObject2, jSONArray)) {
                        jSONArray2.put(jSONObject2);
                        z2 = true;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
            }
            return z2;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th) {
            qx.a(th, this);
            return false;
        }
    }

    private final void a(float[] fArr, float[] fArr2) {
        if (qx.a(this)) {
            return;
        }
        for (int i = 0; i < 30; i++) {
            try {
                fArr[i] = fArr[i] + fArr2[i];
            } catch (Throwable th) {
                qx.a(th, this);
                return;
            }
        }
    }

    private final boolean b(JSONObject jSONObject) {
        if (qx.a(this)) {
            return false;
        }
        try {
            return ((jSONObject.optInt("classtypebitmask") & 1) << 5) > 0;
        } catch (Throwable th) {
            qx.a(th, this);
            return false;
        }
    }

    private final void a(JSONObject jSONObject, StringBuilder sb, StringBuilder sb2) {
        if (qx.a(this)) {
            return;
        }
        try {
            String optString = jSONObject.optString("text", "");
            dqc.b(optString, "view.optString(TEXT_KEY, \"\")");
            if (optString == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = optString.toLowerCase();
            dqc.b(lowerCase, "(this as java.lang.String).toLowerCase()");
            String optString2 = jSONObject.optString("hint", "");
            dqc.b(optString2, "view.optString(HINT_KEY, \"\")");
            if (optString2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase2 = optString2.toLowerCase();
            dqc.b(lowerCase2, "(this as java.lang.String).toLowerCase()");
            boolean z = true;
            if (lowerCase.length() > 0) {
                sb.append(lowerCase);
                sb.append(" ");
            }
            if (lowerCase2.length() <= 0) {
                z = false;
            }
            if (z) {
                sb2.append(lowerCase2);
                sb2.append(" ");
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            if (optJSONArray == null) {
                return;
            }
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    dqc.b(jSONObject2, "currentChildView");
                    a(jSONObject2, sb, sb2);
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th) {
            qx.a(th, this);
        }
    }

    private final JSONObject c(JSONObject jSONObject) {
        if (qx.a(this)) {
            return null;
        }
        try {
        } catch (JSONException unused) {
        } catch (Throwable th) {
            qx.a(th, this);
        }
        if (jSONObject.optBoolean("is_interacted")) {
            return jSONObject;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
        if (optJSONArray == null) {
            return null;
        }
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
            dqc.b(jSONObject2, "children.getJSONObject(i)");
            JSONObject c2 = c(jSONObject2);
            if (c2 != null) {
                return c2;
            }
        }
        return null;
    }
}
