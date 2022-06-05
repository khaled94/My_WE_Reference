package defpackage;

import com.android.volley.ParseError;
import defpackage.au;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: bi  reason: default package */
/* loaded from: classes2.dex */
public final class bi extends bk<JSONArray> {
    public bi(String str, au.b<JSONArray> bVar, au.a aVar) {
        super(0, str, null, bVar, aVar);
    }

    @Override // defpackage.bk, defpackage.as
    public final au<JSONArray> a(ar arVar) {
        try {
            return au.a(new JSONArray(new String(arVar.b, be.a(arVar.c, "utf-8"))), be.a(arVar));
        } catch (UnsupportedEncodingException e) {
            return au.a(new ParseError(e));
        } catch (JSONException e2) {
            return au.a(new ParseError(e2));
        }
    }
}
