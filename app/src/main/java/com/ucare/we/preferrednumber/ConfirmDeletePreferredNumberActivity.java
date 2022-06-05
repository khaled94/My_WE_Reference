package com.ucare.we.preferrednumber;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.PreferedNumberModel.DeletePreferredNumberRequest;
import com.ucare.we.model.PreferedNumberModel.DeletePreferredNumberRequestBody;
import com.ucare.we.model.PreferedNumberModel.DeletePreferredNumberRequestHeader;
import com.ucare.we.model.PreferedNumberModel.DeletePreferredNumberResponse;
import com.ucare.we.paybillpostpaidvoucher.ResponseActivity;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import defpackage.au;
import defpackage.djl;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010&\u001a\u00020'2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010(\u001a\u00020'H\u0002J\b\u0010)\u001a\u00020'H\u0002J\u0012\u0010*\u001a\u00020'2\b\u0010+\u001a\u0004\u0018\u00010,H\u0014J\u0012\u0010-\u001a\u00020'2\b\u0010.\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010/\u001a\u00020'H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\t\"\u0004\b\u001c\u0010\u000bR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020$X\u0082.¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/ucare/we/preferrednumber/ConfirmDeletePreferredNumberActivity;", "Lcom/ucare/we/injection/TransparentActivity;", "()V", "btnCancel", "Landroid/widget/Button;", "btnOK", "cancelClickListener", "Landroid/view/View$OnClickListener;", "getCancelClickListener", "()Landroid/view/View$OnClickListener;", "setCancelClickListener", "(Landroid/view/View$OnClickListener;)V", "deletePreferredNumberErrorListener", "Lcom/android/volley/Response$ErrorListener;", "deletePreferredNumberSuccessListener", "Lcom/android/volley/Response$Listener;", "Lorg/json/JSONObject;", "fmcSelectedMSISDN", "", "getFmcSelectedMSISDN", "()Ljava/lang/String;", "setFmcSelectedMSISDN", "(Ljava/lang/String;)V", "mobileNumber", "getMobileNumber", "setMobileNumber", "okClickListener", "getOkClickListener", "setOkClickListener", "position", "", "getPosition", "()I", "setPosition", "(I)V", "txtMessage", "Landroid/widget/TextView;", "txtMessageDetails", "deletePreferredNumberAPI", "", "getExtras", "initViews", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "removePreferredNumber", "removedPreferredNumber", "setListeners", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ConfirmDeletePreferredNumberActivity extends dae {
    private String a;
    private String b;
    private int c;
    private TextView d;
    private TextView e;
    private Button f;
    private Button g;
    private final au.b<JSONObject> h = new au.b() { // from class: com.ucare.we.preferrednumber.-$$Lambda$ConfirmDeletePreferredNumberActivity$r1ywsV_WlThyYu3ZND-UVOMskUg
        @Override // defpackage.au.b
        public final void onResponse(Object obj) {
            ConfirmDeletePreferredNumberActivity.m29lambda$r1ywsV_WlThyYu3ZNDUVOMskUg(ConfirmDeletePreferredNumberActivity.this, (JSONObject) obj);
        }
    };
    private final au.a i = new au.a() { // from class: com.ucare.we.preferrednumber.-$$Lambda$ConfirmDeletePreferredNumberActivity$4ZFYENUrCDUvwAJXlbcxvIoF39Y
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            ConfirmDeletePreferredNumberActivity.lambda$4ZFYENUrCDUvwAJXlbcxvIoF39Y(ConfirmDeletePreferredNumberActivity.this, volleyError);
        }
    };
    private View.OnClickListener j = new View.OnClickListener() { // from class: com.ucare.we.preferrednumber.-$$Lambda$ConfirmDeletePreferredNumberActivity$UYXYlku4tJ0xuEHOerGZR8yjX2U
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ConfirmDeletePreferredNumberActivity.lambda$UYXYlku4tJ0xuEHOerGZR8yjX2U(ConfirmDeletePreferredNumberActivity.this, view);
        }
    };
    private View.OnClickListener k = new View.OnClickListener() { // from class: com.ucare.we.preferrednumber.-$$Lambda$ConfirmDeletePreferredNumberActivity$novQCRQAK2iZ9gvjWihliamG7-U
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ConfirmDeletePreferredNumberActivity.m28lambda$novQCRQAK2iZ9gvjWihliamG7U(ConfirmDeletePreferredNumberActivity.this, view);
        }
    };

    public static /* synthetic */ void lambda$4ZFYENUrCDUvwAJXlbcxvIoF39Y(ConfirmDeletePreferredNumberActivity confirmDeletePreferredNumberActivity, VolleyError volleyError) {
        a(confirmDeletePreferredNumberActivity, volleyError);
    }

    public static /* synthetic */ void lambda$UYXYlku4tJ0xuEHOerGZR8yjX2U(ConfirmDeletePreferredNumberActivity confirmDeletePreferredNumberActivity, View view) {
        a(confirmDeletePreferredNumberActivity, view);
    }

    /* renamed from: lambda$novQCRQAK2iZ9gvjWihliamG7-U */
    public static /* synthetic */ void m28lambda$novQCRQAK2iZ9gvjWihliamG7U(ConfirmDeletePreferredNumberActivity confirmDeletePreferredNumberActivity, View view) {
        b(confirmDeletePreferredNumberActivity, view);
    }

    /* renamed from: lambda$r1ywsV_WlThyYu3ZND-UVOMskUg */
    public static /* synthetic */ void m29lambda$r1ywsV_WlThyYu3ZNDUVOMskUg(ConfirmDeletePreferredNumberActivity confirmDeletePreferredNumberActivity, JSONObject jSONObject) {
        a(confirmDeletePreferredNumberActivity, jSONObject);
    }

    public static final void a(ConfirmDeletePreferredNumberActivity confirmDeletePreferredNumberActivity, JSONObject jSONObject) {
        dqc.d(confirmDeletePreferredNumberActivity, "this$0");
        DeletePreferredNumberResponse deletePreferredNumberResponse = (DeletePreferredNumberResponse) new Gson().a(jSONObject.toString(), (Class<Object>) DeletePreferredNumberResponse.class);
        if (dqc.a((Object) deletePreferredNumberResponse.getHeader().getResponseCode(), (Object) "0")) {
            ResponseActivity.a(confirmDeletePreferredNumberActivity, confirmDeletePreferredNumberActivity.getString(R.string.successful), deletePreferredNumberResponse.getHeader().getResponseMessage(), false);
            return;
        }
        UnNavigateResponseActivity.a aVar = UnNavigateResponseActivity.a;
        UnNavigateResponseActivity.a.a(confirmDeletePreferredNumberActivity, deletePreferredNumberResponse.getHeader().getResponseMessage(), confirmDeletePreferredNumberActivity.getString(R.string.please_try_again), true);
    }

    public static final void a(ConfirmDeletePreferredNumberActivity confirmDeletePreferredNumberActivity, VolleyError volleyError) {
        dqc.d(confirmDeletePreferredNumberActivity, "this$0");
        UnNavigateResponseActivity.a aVar = UnNavigateResponseActivity.a;
        UnNavigateResponseActivity.a.a(confirmDeletePreferredNumberActivity, volleyError.getMessage(), confirmDeletePreferredNumberActivity.getString(R.string.please_try_again), true);
    }

    public static final void a(ConfirmDeletePreferredNumberActivity confirmDeletePreferredNumberActivity, View view) {
        dqc.d(confirmDeletePreferredNumberActivity, "this$0");
        confirmDeletePreferredNumberActivity.finish();
    }

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_confirm_delete_preferred_number);
        this.a = getIntent().getStringExtra("MOBILE_NUMBER");
        if (getIntent().hasExtra("FMC_SELECTED_MSISDN")) {
            this.b = getIntent().getStringExtra("FMC_SELECTED_MSISDN");
        }
        this.a = getIntent().getStringExtra("MOBILE_NUMBER");
        this.c = getIntent().getIntExtra("MOBILE_NUMBER_POSITION", 0);
        View findViewById = findViewById(R.id.txtMessage);
        dqc.b(findViewById, "findViewById(R.id.txtMessage)");
        this.d = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.txtMessageDetails);
        dqc.b(findViewById2, "findViewById(R.id.txtMessageDetails)");
        this.e = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.btn_ok);
        dqc.b(findViewById3, "findViewById(R.id.btn_ok)");
        this.f = (Button) findViewById3;
        View findViewById4 = findViewById(R.id.btn_cancel);
        dqc.b(findViewById4, "findViewById(R.id.btn_cancel)");
        this.g = (Button) findViewById4;
        TextView textView = this.d;
        if (textView == null) {
            dqc.a("txtMessage");
            throw null;
        }
        textView.setText(getString(R.string.confirmation_title));
        TextView textView2 = this.e;
        if (textView2 == null) {
            dqc.a("txtMessageDetails");
            throw null;
        }
        textView2.setText(getString(R.string.remove_preferred_number_confirmation_text));
        Button button = this.f;
        if (button == null) {
            dqc.a("btnOK");
            throw null;
        }
        button.setOnClickListener(this.k);
        Button button2 = this.g;
        if (button2 != null) {
            button2.setOnClickListener(this.j);
        } else {
            dqc.a("btnCancel");
            throw null;
        }
    }

    public static final void b(ConfirmDeletePreferredNumberActivity confirmDeletePreferredNumberActivity, View view) {
        dqc.d(confirmDeletePreferredNumberActivity, "this$0");
        String str = confirmDeletePreferredNumberActivity.a;
        if (str != null) {
            try {
                final djl a = djl.a(confirmDeletePreferredNumberActivity.getApplicationContext());
                String str2 = confirmDeletePreferredNumberActivity.b;
                au.b<JSONObject> bVar = confirmDeletePreferredNumberActivity.h;
                au.a aVar = confirmDeletePreferredNumberActivity.i;
                DeletePreferredNumberRequest deletePreferredNumberRequest = new DeletePreferredNumberRequest();
                DeletePreferredNumberRequestHeader deletePreferredNumberRequestHeader = new DeletePreferredNumberRequestHeader();
                deletePreferredNumberRequestHeader.setLocale(a.c.c.k());
                if (TextUtils.isEmpty(str2)) {
                    deletePreferredNumberRequestHeader.setMsisdn(a.d.m());
                } else {
                    deletePreferredNumberRequestHeader.setMsisdn(str2);
                }
                deletePreferredNumberRequest.setHeader(deletePreferredNumberRequestHeader);
                DeletePreferredNumberRequestBody deletePreferredNumberRequestBody = new DeletePreferredNumberRequestBody();
                deletePreferredNumberRequestBody.setMobileNumber(str);
                deletePreferredNumberRequest.setBody(deletePreferredNumberRequestBody);
                bj bjVar = new bj("https://api-my.te.eg/api/friendsandfamily/deletemember", new JSONObject(a.a.a(deletePreferredNumberRequest)), bVar, aVar) { // from class: djl.28
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
        }
        confirmDeletePreferredNumberActivity.finish();
    }
}
