package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0005H\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0006H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/internal/ProfileInformationCache;", "", "()V", "infoCache", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lorg/json/JSONObject;", "getProfileInformation", "accessToken", "putProfileInformation", "", "key", "value", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: qf  reason: default package */
/* loaded from: classes2.dex */
public final class qf {
    public static final qf a = new qf();
    private static final ConcurrentHashMap<String, JSONObject> b = new ConcurrentHashMap<>();

    private qf() {
    }

    public static final JSONObject a(String str) {
        dqc.d(str, "accessToken");
        return b.get(str);
    }

    public static final void a(String str, JSONObject jSONObject) {
        dqc.d(str, "key");
        dqc.d(jSONObject, "value");
        b.put(str, jSONObject);
    }
}
