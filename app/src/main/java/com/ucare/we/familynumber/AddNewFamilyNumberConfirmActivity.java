package com.ucare.we.familynumber;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.FamilyNumberModel.AddFamilyNumberRequest;
import com.ucare.we.model.FamilyNumberModel.AddFamilyNumberRequestBody;
import com.ucare.we.model.FamilyNumberModel.AddFamilyNumberRequestHeader;
import com.ucare.we.model.FamilyNumberModel.AddFamilyNumberResponse;
import com.ucare.we.paybillpostpaidvoucher.ResponseActivity;
import defpackage.au;
import defpackage.djl;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AddNewFamilyNumberConfirmActivity extends dae {
    View.OnClickListener a = new View.OnClickListener() { // from class: com.ucare.we.familynumber.AddNewFamilyNumberConfirmActivity.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            AddNewFamilyNumberConfirmActivity.this.finish();
        }
    };
    au.b<JSONObject> b = new au.b<JSONObject>() { // from class: com.ucare.we.familynumber.AddNewFamilyNumberConfirmActivity.2
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            AddFamilyNumberResponse addFamilyNumberResponse = (AddFamilyNumberResponse) new Gson().a(jSONObject.toString(), (Class<Object>) AddFamilyNumberResponse.class);
            AddNewFamilyNumberConfirmActivity.this.finish();
            if (addFamilyNumberResponse.getHeader().getResponseCode().equals("0")) {
                AddNewFamilyNumberConfirmActivity addNewFamilyNumberConfirmActivity = AddNewFamilyNumberConfirmActivity.this;
                ResponseActivity.a(addNewFamilyNumberConfirmActivity, addNewFamilyNumberConfirmActivity.getString(R.string.successfully), addFamilyNumberResponse.getHeader().getResponseMessage(), false);
                return;
            }
            AddNewFamilyNumberConfirmActivity addNewFamilyNumberConfirmActivity2 = AddNewFamilyNumberConfirmActivity.this;
            ResponseActivity.a(addNewFamilyNumberConfirmActivity2, addNewFamilyNumberConfirmActivity2.getString(R.string.error), addFamilyNumberResponse.getHeader().getResponseMessage(), true);
        }
    };
    au.a c = new au.a() { // from class: com.ucare.we.familynumber.AddNewFamilyNumberConfirmActivity.3
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            AddNewFamilyNumberConfirmActivity addNewFamilyNumberConfirmActivity = AddNewFamilyNumberConfirmActivity.this;
            ResponseActivity.a(addNewFamilyNumberConfirmActivity, addNewFamilyNumberConfirmActivity.getString(R.string.error), volleyError.getMessage(), true);
        }
    };
    View.OnClickListener d = new View.OnClickListener() { // from class: com.ucare.we.familynumber.AddNewFamilyNumberConfirmActivity.4
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            try {
                if (AddNewFamilyNumberConfirmActivity.this.g.getText().length() != 11 || !AddNewFamilyNumberConfirmActivity.this.g.getText().toString().startsWith("01")) {
                    AddNewFamilyNumberConfirmActivity.this.g.setError("Wrong Number Format");
                    return;
                }
                Integer.valueOf(AddNewFamilyNumberConfirmActivity.this.g.getText().toString().trim()).intValue();
                AddNewFamilyNumberConfirmActivity addNewFamilyNumberConfirmActivity = AddNewFamilyNumberConfirmActivity.this;
                String trim = AddNewFamilyNumberConfirmActivity.this.g.getText().toString().trim();
                try {
                    final djl a = djl.a(addNewFamilyNumberConfirmActivity.getApplicationContext());
                    au.b<JSONObject> bVar = addNewFamilyNumberConfirmActivity.b;
                    au.a aVar = addNewFamilyNumberConfirmActivity.c;
                    AddFamilyNumberRequest addFamilyNumberRequest = new AddFamilyNumberRequest();
                    AddFamilyNumberRequestHeader addFamilyNumberRequestHeader = new AddFamilyNumberRequestHeader();
                    addFamilyNumberRequestHeader.setLocale(a.c.c.k());
                    addFamilyNumberRequestHeader.setMsisdn(a.d.m());
                    addFamilyNumberRequest.setHeader(addFamilyNumberRequestHeader);
                    AddFamilyNumberRequestBody addFamilyNumberRequestBody = new AddFamilyNumberRequestBody();
                    addFamilyNumberRequestBody.setMobileNumber(trim);
                    addFamilyNumberRequest.setBody(addFamilyNumberRequestBody);
                    bj bjVar = new bj("https://api-my.te.eg/api/cug/addmember", new JSONObject(a.a.a(addFamilyNumberRequest)), bVar, aVar) { // from class: djl.30
                        @Override // defpackage.as
                        public final Map<String, String> c() throws AuthFailureError {
                            HashMap hashMap = new HashMap();
                            hashMap.put("Jwt", a.d.I());
                            return hashMap;
                        }
                    };
                    bjVar.l = djl.a.MAIN_PLAN;
                    bjVar.j = new am(60000, 0, 0.0f);
                    a.b.a((as) bjVar);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } catch (NumberFormatException unused) {
                AddNewFamilyNumberConfirmActivity.this.g.setError("Wrong Number Format");
            }
        }
    };
    private TextView e;
    private TextView f;
    private EditText g;
    private ImageView h;

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_add_new_family_number_confirm);
        this.e = (TextView) findViewById(R.id.txtOK);
        this.f = (TextView) findViewById(R.id.txtCancel);
        this.g = (EditText) findViewById(R.id.edtMobileNumber);
        this.h = (ImageView) findViewById(R.id.iv_close);
        this.e.setOnClickListener(this.d);
        this.f.setOnClickListener(this.a);
        this.h.setOnClickListener(this.a);
    }
}
