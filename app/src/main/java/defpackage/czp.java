package defpackage;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.model.AreasModel.Area;
import defpackage.au;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: czp  reason: default package */
/* loaded from: classes2.dex */
public final class czp {
    Context a;
    czq b;
    au.b<JSONArray> c = new au.b<JSONArray>() { // from class: czp.1
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONArray jSONArray) {
            czp.this.b.c();
            czp.this.b.a((ArrayList) new Gson().a(String.valueOf(jSONArray), new crb<List<Area>>() { // from class: czp.1.1
            }.b));
        }
    };
    au.a d = new au.a() { // from class: czp.2
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            czp.this.b.c();
            czp.this.b.a();
        }
    };

    public czp(Context context, czq czqVar) {
        this.a = context;
        this.b = czqVar;
    }
}
