package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.model.FamilyNumberModel.ViewFamilyNumberResponse;
import defpackage.au;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: cyv  reason: default package */
/* loaded from: classes2.dex */
public final class cyv {
    Context a;
    cyw b;
    au.b<JSONObject> c = new au.b<JSONObject>() { // from class: cyv.1
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            Gson gson = new Gson();
            ArrayList<String> arrayList = new ArrayList<>();
            ViewFamilyNumberResponse viewFamilyNumberResponse = (ViewFamilyNumberResponse) gson.a(jSONObject.toString(), (Class<Object>) ViewFamilyNumberResponse.class);
            if (viewFamilyNumberResponse.getHeader().getResponseCode().equals("0")) {
                for (int i = 0; i < viewFamilyNumberResponse.getBody().size(); i++) {
                    arrayList.add(viewFamilyNumberResponse.getBody().get(i).getMobileNumber());
                }
                cyv.this.b.a(arrayList);
                return;
            }
            cyv.this.b.a(arrayList);
            Toast.makeText(cyv.this.a, viewFamilyNumberResponse.getHeader().getResponseMessage(), 0).show();
        }
    };
    au.a d = new au.a() { // from class: cyv.2
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            Toast.makeText(cyv.this.a, "Failed!", 1).show();
        }
    };

    public cyv(Context context, cyw cywVar) {
        this.a = context;
        this.b = cywVar;
    }
}
