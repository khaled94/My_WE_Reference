package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.MigrationPlans;
import com.ucare.we.model.MoreBundleModel.ResponseViewMoreBundle;
import com.ucare.we.model.MoreBundleModel.ResponseViewMoreBundleBody;
import com.ucare.we.model.PlansAndBundlesResponseBody;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import defpackage.au;
import java.util.List;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dan  reason: default package */
/* loaded from: classes2.dex */
public final class dan {
    Context b;
    dao d;
    dju f;
    au.a c = new au.a() { // from class: dan.1
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            volleyError.getMessage();
            Toast.makeText(dan.this.b, dan.this.b.getString(R.string.generic_error), 0).show();
        }
    };
    au.a e = new au.a() { // from class: dan.2
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dan.this.d.b(false);
            dan.this.d.b();
        }
    };
    au.b<JSONObject> g = new au.b<JSONObject>() { // from class: dan.3
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dan.this.d.b(false);
            ResponseViewMoreBundle responseViewMoreBundle = (ResponseViewMoreBundle) new Gson().a(jSONObject.toString(), (Class<Object>) ResponseViewMoreBundle.class);
            if (responseViewMoreBundle.getHeader().getResponseCode() != null && responseViewMoreBundle.getHeader().getResponseCode().equals("0")) {
                if (responseViewMoreBundle.getBody().size() != 0) {
                    new ResponseViewMoreBundleBody();
                    int i = 0;
                    while (true) {
                        if (i < responseViewMoreBundle.getBody().size()) {
                            if (responseViewMoreBundle.getBody().get(i).getMain()) {
                                dan.this.d.a(responseViewMoreBundle.getBody().get(i));
                                break;
                            } else {
                                dan.this.d.a(null);
                                i++;
                            }
                        } else {
                            break;
                        }
                    }
                    for (int i2 = 0; i2 < responseViewMoreBundle.getBody().size(); i2++) {
                        if (responseViewMoreBundle.getBody().get(i2).getPrimary()) {
                            dan.this.d.e(responseViewMoreBundle.getBody().get(i2).getOfferId());
                            return;
                        }
                        dan.this.d.a(null);
                    }
                    return;
                }
                dan.this.d.a(null);
            } else if (responseViewMoreBundle.getHeader().getResponseCode() != null && responseViewMoreBundle.getHeader().getResponseCode().equals("1200")) {
                dan.this.f.b(2);
            } else {
                dan.this.d.a(null);
            }
        }
    };
    au.b<JSONObject> h = new au.b<JSONObject>() { // from class: dan.4
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dan.this.d.b(false);
            MigrationPlans migrationPlans = (MigrationPlans) new Gson().a(jSONObject.toString(), (Class<Object>) MigrationPlans.class);
            if (migrationPlans.header.responseCode.equals("0")) {
                dan.this.d.b(migrationPlans.body);
            } else if (migrationPlans.header.responseCode != null && migrationPlans.header.responseCode.equals("1200")) {
                dan.this.f.b(1);
            } else {
                dan.this.d.b((List<PlansAndBundlesResponseBody>) null);
                dan.this.d.b();
                UnNavigateResponseActivity.a(dan.this.b, migrationPlans.header.responseMessage, dan.this.b.getString(R.string.please_try_again), true);
            }
        }
    };
    @Inject
    djw a = new djw();

    public dan(Context context, dao daoVar, dju djuVar) {
        this.b = context;
        this.d = daoVar;
        this.f = djuVar;
    }

    public final void a() throws JSONException {
        this.d.a(this.a.Z());
    }

    public final void b() throws JSONException {
        this.d.b(true);
        djl.a(this.b).b(this.h, this.e);
    }
}
