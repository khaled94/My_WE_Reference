package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u001e\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00012\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\u0012"}, d2 = {"Lcom/facebook/share/internal/OpenGraphJSONUtility;", "", "()V", "toJSONArray", "Lorg/json/JSONArray;", "list", "", "photoJSONProcessor", "Lcom/facebook/share/internal/OpenGraphJSONUtility$PhotoJSONProcessor;", "toJSONObject", "Lorg/json/JSONObject;", "action", "Lcom/facebook/share/model/ShareOpenGraphAction;", "graphObject", "Lcom/facebook/share/model/ShareOpenGraphObject;", "toJSONValue", "value", "PhotoJSONProcessor", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: sk  reason: default package */
/* loaded from: classes2.dex */
public final class sk {
    public static final sk a = new sk();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/facebook/share/internal/OpenGraphJSONUtility$PhotoJSONProcessor;", "", "toJSONObject", "Lorg/json/JSONObject;", "photo", "Lcom/facebook/share/model/SharePhoto;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: sk$a */
    /* loaded from: classes2.dex */
    public interface a {
        JSONObject a(sw swVar);
    }

    private sk() {
    }

    public static final JSONObject a(ss ssVar, a aVar) throws JSONException {
        if (ssVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : ssVar.b()) {
            jSONObject.put(str, a(ssVar.a(str), aVar));
        }
        return jSONObject;
    }

    private static JSONArray a(List<?> list, a aVar) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(a(it.next(), aVar));
        }
        return jSONArray;
    }

    private static Object a(Object obj, a aVar) throws JSONException {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long)) {
            return obj;
        }
        if (obj instanceof sw) {
            if (aVar == null) {
                return null;
            }
            return aVar.a((sw) obj);
        } else if (obj instanceof su) {
            su suVar = (su) obj;
            JSONObject jSONObject = new JSONObject();
            for (String str : suVar.b()) {
                jSONObject.put(str, a(suVar.a(str), aVar));
            }
            return jSONObject;
        } else {
            if (obj instanceof List) {
                return a((List<?>) obj, aVar);
            }
            return null;
        }
    }
}
