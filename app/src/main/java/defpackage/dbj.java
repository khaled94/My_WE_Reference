package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.MoreBundleModel.ResponseUnsubscribeFromMoreBundle;
import com.ucare.we.paybillpostpaidvoucher.ResponseActivity;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import defpackage.au;
import org.json.JSONObject;

/* renamed from: dbj  reason: default package */
/* loaded from: classes2.dex */
public final class dbj {
    Context a;
    String b;
    private dbk c;
    private au.b<JSONObject> d = new au.b<JSONObject>() { // from class: dbj.1
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            ResponseUnsubscribeFromMoreBundle responseUnsubscribeFromMoreBundle = (ResponseUnsubscribeFromMoreBundle) new Gson().a(jSONObject.toString(), (Class<Object>) ResponseUnsubscribeFromMoreBundle.class);
            if (responseUnsubscribeFromMoreBundle.getHeader().getResponseCode().equals("0")) {
                ResponseActivity.a(dbj.this.a, dbj.this.a.getString(R.string.successfully), dbj.this.a.getString(R.string.subscribe_to_service) + dbj.this.b, false);
                return;
            }
            UnNavigateResponseActivity.a(dbj.this.a, responseUnsubscribeFromMoreBundle.getHeader().getResponseMessage(), dbj.this.a.getString(R.string.please_try_again), true);
        }
    };
    private au.a e = new au.a() { // from class: dbj.2
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            Toast.makeText(dbj.this.a, "Something Went Wrong", 0).show();
        }
    };

    public dbj(Context context, dbk dbkVar) {
        this.a = context;
        this.c = dbkVar;
    }
}
