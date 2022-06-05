package defpackage;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.FMCModel.FMCMemebrsResponse;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import defpackage.au;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dau  reason: default package */
/* loaded from: classes2.dex */
public final class dau {
    dav a;
    Context b;
    dju c;
    FMCMemebrsResponse d;
    private au.b<JSONObject> e = new au.b<JSONObject>() { // from class: dau.1
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dau.this.a.a(false);
            Gson gson = new Gson();
            dau.this.d = (FMCMemebrsResponse) gson.a(jSONObject.toString(), (Class<Object>) FMCMemebrsResponse.class);
            if (!dau.this.d.getHeader().getResponseCode().equals("0")) {
                if (dau.this.d.getHeader().getResponseCode().equals("1200")) {
                    dau.this.c.b(1);
                    return;
                } else {
                    UnNavigateResponseActivity.a(dau.this.b, dau.this.d.getHeader().getResponseMessage(), dau.this.b.getString(R.string.try_again), true);
                    return;
                }
            }
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(dau.this.b.getString(R.string.group));
            for (int i = 0; i < dau.this.d.getBody().getGroupMembers().size(); i++) {
                arrayList.add(dau.this.d.getBody().getGroupMembers().get(i).getServiceNumber());
            }
            dau.this.a.a(arrayList);
        }
    };
    private au.a f = new au.a() { // from class: dau.2
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dau.this.a.a(false);
            UnNavigateResponseActivity.a(dau.this.b, dau.this.b.getString(R.string.check_network_connection), dau.this.b.getString(R.string.try_again), true);
            dau.this.a.b();
        }
    };

    public dau(Context context, dav davVar, dju djuVar) {
        this.b = context;
        this.a = davVar;
        this.c = djuVar;
    }

    public final void a() {
        try {
            this.a.a(true);
            djl.a(this.b).y(this.e, this.f);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
