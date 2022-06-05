package com.ucare.we.preferrednumber;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.volley.VolleyError;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.PreferedNumberModel.AddPreferredNumberResponse;
import com.ucare.we.paybillpostpaidvoucher.ResponseActivity;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import defpackage.au;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AddNewPreferredNumberConfirmActivity extends dae implements dju {
    int a;
    String c;
    private TextView h;
    private TextView i;
    private TextInputEditText j;
    private TextInputLayout k;
    private ImageView l;
    private final int g = 1;
    View.OnClickListener b = new View.OnClickListener() { // from class: com.ucare.we.preferrednumber.AddNewPreferredNumberConfirmActivity.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            AddNewPreferredNumberConfirmActivity.this.finish();
        }
    };
    au.b<JSONObject> d = new au.b<JSONObject>() { // from class: com.ucare.we.preferrednumber.AddNewPreferredNumberConfirmActivity.2
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            AddPreferredNumberResponse addPreferredNumberResponse = (AddPreferredNumberResponse) new Gson().a(jSONObject.toString(), (Class<Object>) AddPreferredNumberResponse.class);
            if (addPreferredNumberResponse.getHeader().getResponseCode().equals("0")) {
                AddNewPreferredNumberConfirmActivity addNewPreferredNumberConfirmActivity = AddNewPreferredNumberConfirmActivity.this;
                ResponseActivity.a(addNewPreferredNumberConfirmActivity, addNewPreferredNumberConfirmActivity.getString(R.string.successfully), addPreferredNumberResponse.getHeader().getResponseMessage(), false);
                AddNewPreferredNumberConfirmActivity.this.finish();
            } else if (addPreferredNumberResponse.getHeader().getResponseCode().equals("1200")) {
                AddNewPreferredNumberConfirmActivity.this.b(1);
            } else {
                UnNavigateResponseActivity.a(AddNewPreferredNumberConfirmActivity.this, addPreferredNumberResponse.getHeader().getResponseMessage(), AddNewPreferredNumberConfirmActivity.this.getString(R.string.please_try_again), true);
            }
        }
    };
    au.a e = new au.a() { // from class: com.ucare.we.preferrednumber.AddNewPreferredNumberConfirmActivity.3
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
        }
    };
    View.OnClickListener f = new View.OnClickListener() { // from class: com.ucare.we.preferrednumber.AddNewPreferredNumberConfirmActivity.4
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            try {
                if (AddNewPreferredNumberConfirmActivity.this.j.getText().length() == 11 && AddNewPreferredNumberConfirmActivity.this.j.getText().toString().startsWith("01")) {
                    AddNewPreferredNumberConfirmActivity.b(AddNewPreferredNumberConfirmActivity.this);
                    Integer.valueOf(AddNewPreferredNumberConfirmActivity.this.j.getText().toString().trim()).intValue();
                    AddNewPreferredNumberConfirmActivity addNewPreferredNumberConfirmActivity = AddNewPreferredNumberConfirmActivity.this;
                    int intValue = Integer.valueOf(AddNewPreferredNumberConfirmActivity.this.j.getText().toString().trim()).intValue();
                    addNewPreferredNumberConfirmActivity.a = intValue;
                    try {
                        djl.a(addNewPreferredNumberConfirmActivity.getApplicationContext()).c(addNewPreferredNumberConfirmActivity.c, String.valueOf(intValue), addNewPreferredNumberConfirmActivity.d, addNewPreferredNumberConfirmActivity.e);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    AddNewPreferredNumberConfirmActivity.this.finish();
                    return;
                }
                AddNewPreferredNumberConfirmActivity.a(AddNewPreferredNumberConfirmActivity.this, AddNewPreferredNumberConfirmActivity.this.getString(R.string.mobile_number_should_start));
            } catch (NumberFormatException unused) {
                AddNewPreferredNumberConfirmActivity addNewPreferredNumberConfirmActivity2 = AddNewPreferredNumberConfirmActivity.this;
                AddNewPreferredNumberConfirmActivity.a(addNewPreferredNumberConfirmActivity2, addNewPreferredNumberConfirmActivity2.getString(R.string.wrong_number_format));
            }
        }
    };

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_add_new_preferred_number_confirm);
        this.c = getIntent().getExtras().getString("FMC_SELECTED_MSISDN");
        this.h = (TextView) findViewById(R.id.txtOK);
        this.i = (TextView) findViewById(R.id.txtCancel);
        this.j = (TextInputEditText) findViewById(R.id.edtMobileNumber);
        this.k = (TextInputLayout) findViewById(R.id.etServiceNumber);
        this.l = (ImageView) findViewById(R.id.iv_close);
        this.h.setOnClickListener(this.f);
        this.i.setOnClickListener(this.b);
        this.l.setOnClickListener(this.b);
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        try {
            djl.a(getApplicationContext()).c(this.c, String.valueOf(this.a), this.d, this.e);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    static /* synthetic */ void b(AddNewPreferredNumberConfirmActivity addNewPreferredNumberConfirmActivity) {
        TextInputEditText textInputEditText = addNewPreferredNumberConfirmActivity.j;
        textInputEditText.setBackgroundDrawable(addNewPreferredNumberConfirmActivity.getResources().getDrawable(R.drawable.text_input_white_background_success));
        textInputEditText.setHintTextColor(addNewPreferredNumberConfirmActivity.getResources().getColor(R.color.color_grey_new));
        addNewPreferredNumberConfirmActivity.k.setError(null);
        addNewPreferredNumberConfirmActivity.k.setErrorEnabled(false);
    }

    static /* synthetic */ void a(AddNewPreferredNumberConfirmActivity addNewPreferredNumberConfirmActivity, String str) {
        addNewPreferredNumberConfirmActivity.k.setErrorEnabled(true);
        TextInputEditText textInputEditText = addNewPreferredNumberConfirmActivity.j;
        textInputEditText.setBackgroundDrawable(addNewPreferredNumberConfirmActivity.getResources().getDrawable(R.drawable.text_input_white_background_error));
        textInputEditText.setHintTextColor(addNewPreferredNumberConfirmActivity.getResources().getColor(R.color.color_grey_new));
        addNewPreferredNumberConfirmActivity.k.setError(str);
    }
}
