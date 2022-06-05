package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.GetTopics.GetTopicResponse;
import com.ucare.we.model.SubmitTicketModel.SubmitTicketRequestBody;
import com.ucare.we.model.SubmitTicketModel.SubmitTicketResponse;
import defpackage.au;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dha  reason: default package */
/* loaded from: classes2.dex */
public final class dha {
    Context a;
    dhb b;
    SubmitTicketRequestBody c;
    dju d;
    au.b<JSONObject> e = new au.b<JSONObject>() { // from class: dha.1
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            GetTopicResponse getTopicResponse = (GetTopicResponse) new Gson().a(jSONObject.toString(), (Class<Object>) GetTopicResponse.class);
            if (getTopicResponse != null && getTopicResponse.categories != null && getTopicResponse.categories.size() > 0) {
                dha.this.b.a(getTopicResponse);
            } else {
                Toast.makeText(dha.this.a, dha.this.a.getString(R.string.generic_error), 0).show();
            }
        }
    };
    au.a f = new au.a() { // from class: dha.2
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            Toast.makeText(dha.this.a, dha.this.a.getString(R.string.generic_error), 0).show();
        }
    };
    private au.b<JSONObject> g = new au.b<JSONObject>() { // from class: dha.3
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            SubmitTicketResponse submitTicketResponse = (SubmitTicketResponse) new Gson().a(jSONObject.toString(), (Class<Object>) SubmitTicketResponse.class);
            if (submitTicketResponse != null && submitTicketResponse.header != null && submitTicketResponse.header.responseCode.equals("0")) {
                dha.this.b.a(submitTicketResponse.header.responseMessage, submitTicketResponse.body);
            } else if (submitTicketResponse != null && submitTicketResponse.header != null && submitTicketResponse.header.responseCode.equals("1200")) {
                dha.this.d.b(1);
            } else {
                dha.this.b.a(submitTicketResponse.header.responseMessage);
            }
        }
    };
    private au.a h = new au.a() { // from class: dha.4
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dha.this.b.a(volleyError.getMessage());
        }
    };

    public dha(Context context, dhb dhbVar, dju djuVar) {
        this.a = context;
        this.b = dhbVar;
        this.d = djuVar;
    }

    public final void a() {
        try {
            djl.a(this.a).a(this.c, this.g, this.h);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
