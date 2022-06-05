package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\bR\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/facebook/appevents/codeless/internal/ParameterComponent;", "", "component", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "name", "", "getName", "()Ljava/lang/String;", "path", "", "Lcom/facebook/appevents/codeless/internal/PathComponent;", "getPath", "()Ljava/util/List;", "pathType", "getPathType", "value", "getValue", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: np  reason: default package */
/* loaded from: classes2.dex */
public final class np {
    public static final a e = new a((byte) 0);
    public final String a;
    public final String b;
    public final List<nq> c;
    public final String d;

    public np(JSONObject jSONObject) {
        dqc.d(jSONObject, "component");
        String string = jSONObject.getString("name");
        dqc.b(string, "component.getString(PARAMETER_NAME_KEY)");
        this.a = string;
        String optString = jSONObject.optString("value");
        dqc.b(optString, "component.optString(PARAMETER_VALUE_KEY)");
        this.b = optString;
        String optString2 = jSONObject.optString("path_type", "absolute");
        dqc.b(optString2, "component.optString(Cons…tants.PATH_TYPE_ABSOLUTE)");
        this.d = optString2;
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("path");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                dqc.b(jSONObject2, "jsonPathArray.getJSONObject(i)");
                arrayList.add(new nq(jSONObject2));
            }
        }
        this.c = arrayList;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/facebook/appevents/codeless/internal/ParameterComponent$Companion;", "", "()V", "PARAMETER_NAME_KEY", "", "PARAMETER_PATH_KEY", "PARAMETER_VALUE_KEY", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: np$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }
}
