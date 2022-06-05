package defpackage;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.model.CitiesModel.City;
import defpackage.au;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: czu  reason: default package */
/* loaded from: classes2.dex */
public final class czu {
    Context a;
    czv b;
    au.b<JSONArray> c = new au.b<JSONArray>() { // from class: czu.1
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONArray jSONArray) {
            czu.this.b.c();
            czu.this.b.a((ArrayList) new Gson().a(String.valueOf(jSONArray), new crb<List<City>>() { // from class: czu.1.1
            }.b));
        }
    };
    au.a d = new au.a() { // from class: czu.2
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            czu.this.b.c();
            czu.this.b.a();
        }
    };

    public czu(Context context, czv czvVar) {
        this.a = context;
        this.b = czvVar;
    }
}
