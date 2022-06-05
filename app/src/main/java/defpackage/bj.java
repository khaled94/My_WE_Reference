package defpackage;

import com.android.volley.ParseError;
import defpackage.au;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bj  reason: default package */
/* loaded from: classes2.dex */
public class bj extends bk<JSONObject> {
    public bj(int i, String str, JSONObject jSONObject, au.b<JSONObject> bVar, au.a aVar) {
        super(i, str, jSONObject == null ? null : jSONObject.toString(), bVar, aVar);
    }

    public bj(String str, JSONObject jSONObject, au.b<JSONObject> bVar, au.a aVar) {
        this(jSONObject == null ? 0 : 1, str, jSONObject, bVar, aVar);
    }

    @Override // defpackage.bk, defpackage.as
    public final au<JSONObject> a(ar arVar) {
        try {
            return au.a(new JSONObject(new String(arVar.b, be.a(arVar.c, "utf-8"))), be.a(arVar));
        } catch (UnsupportedEncodingException e) {
            return au.a(new ParseError(e));
        } catch (JSONException e2) {
            return au.a(new ParseError(e2));
        }
    }
}
