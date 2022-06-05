package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.model.FriendsAndFamilyStatusResponse;
import com.ucare.we.model.PreferedNumberModel.ViewPreferredNumberResponse;
import defpackage.au;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dda  reason: default package */
/* loaded from: classes2.dex */
public final class dda {
    Context a;
    ddb b;
    dju c;
    private au.b<JSONObject> d = new au.b<JSONObject>() { // from class: dda.1
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            Gson gson = new Gson();
            ArrayList<String> arrayList = new ArrayList<>();
            ViewPreferredNumberResponse viewPreferredNumberResponse = (ViewPreferredNumberResponse) gson.a(jSONObject.toString(), (Class<Object>) ViewPreferredNumberResponse.class);
            if (viewPreferredNumberResponse.getHeader().getResponseCode().equals("0")) {
                for (int i = 0; i < viewPreferredNumberResponse.getBody().size(); i++) {
                    arrayList.add(viewPreferredNumberResponse.getBody().get(i).getMobileNumber());
                }
                dda.this.b.a(arrayList);
            } else if (viewPreferredNumberResponse.getHeader().getResponseCode().equals("1200")) {
                dda.this.c.b(1);
            } else {
                dda.this.b.a(arrayList);
                Toast.makeText(dda.this.a, viewPreferredNumberResponse.getHeader().getResponseMessage(), 0).show();
            }
            dda.this.b.a(false);
        }
    };
    private au.a e = new au.a() { // from class: dda.2
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dda.this.b.a(false);
        }
    };
    private au.b<JSONObject> f = new au.b<JSONObject>() { // from class: dda.3
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            FriendsAndFamilyStatusResponse friendsAndFamilyStatusResponse = (FriendsAndFamilyStatusResponse) new Gson().a(jSONObject.toString(), (Class<Object>) FriendsAndFamilyStatusResponse.class);
            if (friendsAndFamilyStatusResponse.header.responseCode.equals("0")) {
                if (friendsAndFamilyStatusResponse.body != null && friendsAndFamilyStatusResponse.body.getEnabled().booleanValue()) {
                    dda.this.b.a();
                } else {
                    dda.this.b.b();
                }
            } else if (friendsAndFamilyStatusResponse.header.responseCode.equals("1200")) {
                dda.this.c.b(2);
            }
            dda.this.b.a(false);
        }
    };
    private au.a g = new au.a() { // from class: dda.4
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dda.this.b.a(false);
        }
    };

    public dda(Context context, ddb ddbVar, dju djuVar) {
        this.a = context;
        this.b = ddbVar;
        this.c = djuVar;
    }

    public final void a(String str) {
        try {
            this.b.a(true);
            djl.a(this.a).j(str, this.f, this.g);
        } catch (JSONException e) {
            e.printStackTrace();
            this.b.a(false);
        }
    }

    public final void b(String str) {
        try {
            this.b.a(true);
            djl.a(this.a).f(str, this.d, this.e);
        } catch (JSONException e) {
            e.printStackTrace();
            this.b.a(false);
        }
    }
}
