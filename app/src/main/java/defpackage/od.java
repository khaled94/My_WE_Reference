package defpackage;

import defpackage.oq;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u001c\u0010\u000f\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/facebook/appevents/integrity/IntegrityManager;", "", "()V", "INTEGRITY_TYPE_ADDRESS", "", "INTEGRITY_TYPE_HEALTH", "INTEGRITY_TYPE_NONE", "RESTRICTIVE_ON_DEVICE_PARAMS_KEY", "enabled", "", "isSampleEnabled", "enable", "", "getIntegrityPredictionResult", "textFeature", "processParameters", "parameters", "", "shouldFilter", "input", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: od  reason: default package */
/* loaded from: classes2.dex */
public final class od {
    public static final od a = new od();
    private static boolean b;
    private static boolean c;

    private od() {
    }

    public static final void a() {
        if (qx.a(od.class)) {
            return;
        }
        try {
            b = true;
            c = pu.a("FBSDKFeatureIntegritySample", ly.m(), false);
        } catch (Throwable th) {
            qx.a(th, od.class);
        }
    }

    public static final void a(Map<String, String> map) {
        if (qx.a(od.class)) {
            return;
        }
        try {
            dqc.d(map, "parameters");
            if (b && !map.isEmpty()) {
                try {
                    List<String> b2 = dmq.b(map.keySet());
                    JSONObject jSONObject = new JSONObject();
                    for (String str : b2) {
                        String str2 = map.get(str);
                        if (str2 == null) {
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                        String str3 = str2;
                        if (a.a(str) || a.a(str3)) {
                            map.remove(str);
                            if (!c) {
                                str3 = "";
                            }
                            jSONObject.put(str, str3);
                        }
                    }
                    if (jSONObject.length() == 0) {
                        return;
                    }
                    String jSONObject2 = jSONObject.toString();
                    dqc.b(jSONObject2, "restrictiveParamJson.toString()");
                    map.put("_onDeviceParams", jSONObject2);
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th) {
            qx.a(th, od.class);
        }
    }

    private final boolean a(String str) {
        if (qx.a(this)) {
            return false;
        }
        try {
            return !dqc.a((Object) "none", (Object) b(str));
        } catch (Throwable th) {
            qx.a(th, this);
            return false;
        }
    }

    private final String b(String str) {
        if (qx.a(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i = 0; i < 30; i++) {
                fArr[i] = 0.0f;
            }
            String[] a2 = oq.a(oq.a.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
            if (a2 != null) {
                String str2 = a2[0];
                if (str2 != null) {
                    return str2;
                }
            }
            return "none";
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }
}
