package com.ucare.we.familynumber;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.FamilyNumberModel.DeleteFamilyNumberRequest;
import com.ucare.we.model.FamilyNumberModel.DeleteFamilyNumberRequestBody;
import com.ucare.we.model.FamilyNumberModel.DeleteFamilyNumberRequestHeader;
import com.ucare.we.model.FamilyNumberModel.DeleteFamilyNumberResponse;
import defpackage.au;
import defpackage.djl;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010#\u001a\u00020$2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010%\u001a\u00020$H\u0002J\b\u0010&\u001a\u00020$H\u0002J\u0012\u0010'\u001a\u00020$2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\b\u0010*\u001a\u00020$H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\t\"\u0004\b\u0019\u0010\u000bR\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020!X\u0082.¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ucare/we/familynumber/ConfirmDeleteFamilyNumberActivity;", "Lcom/ucare/we/injection/TransparentActivity;", "()V", "btnCancel", "Landroid/widget/Button;", "btnOK", "cancelClickListener", "Landroid/view/View$OnClickListener;", "getCancelClickListener", "()Landroid/view/View$OnClickListener;", "setCancelClickListener", "(Landroid/view/View$OnClickListener;)V", "deleteFamilyNumberErrorListener", "Lcom/android/volley/Response$ErrorListener;", "deleteFamilyNumberSuccessListener", "Lcom/android/volley/Response$Listener;", "Lorg/json/JSONObject;", "mobileNumber", "", "getMobileNumber", "()Ljava/lang/String;", "setMobileNumber", "(Ljava/lang/String;)V", "okClickListener", "getOkClickListener", "setOkClickListener", "position", "", "getPosition", "()I", "setPosition", "(I)V", "txtMessage", "Landroid/widget/TextView;", "txtMessageDetails", "deleteFamilyNumberAPI", "", "getExtras", "initViews", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setListeners", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ConfirmDeleteFamilyNumberActivity extends dae {
    private String a;
    private int b;
    private TextView c;
    private TextView d;
    private Button e;
    private Button f;
    private final au.b<JSONObject> g = new au.b() { // from class: com.ucare.we.familynumber.-$$Lambda$ConfirmDeleteFamilyNumberActivity$ltvZbz_zgHRvC6CByPyQ99ogyqU
        @Override // defpackage.au.b
        public final void onResponse(Object obj) {
            ConfirmDeleteFamilyNumberActivity.lambda$ltvZbz_zgHRvC6CByPyQ99ogyqU(ConfirmDeleteFamilyNumberActivity.this, (JSONObject) obj);
        }
    };
    private final au.a h = new au.a() { // from class: com.ucare.we.familynumber.-$$Lambda$ConfirmDeleteFamilyNumberActivity$vryc1c7wCDz_fvqrXHBI4_WOQq4
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            ConfirmDeleteFamilyNumberActivity.lambda$vryc1c7wCDz_fvqrXHBI4_WOQq4(ConfirmDeleteFamilyNumberActivity.this, volleyError);
        }
    };
    private View.OnClickListener i = new View.OnClickListener() { // from class: com.ucare.we.familynumber.-$$Lambda$ConfirmDeleteFamilyNumberActivity$6LPy4w_2BhN5QLAI2Jgibcr_jiA
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ConfirmDeleteFamilyNumberActivity.lambda$6LPy4w_2BhN5QLAI2Jgibcr_jiA(ConfirmDeleteFamilyNumberActivity.this, view);
        }
    };
    private View.OnClickListener j = new View.OnClickListener() { // from class: com.ucare.we.familynumber.-$$Lambda$ConfirmDeleteFamilyNumberActivity$EniMCOvjAF-4tCZ0eK76B2ZZ4ys
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ConfirmDeleteFamilyNumberActivity.m20lambda$EniMCOvjAF4tCZ0eK76B2ZZ4ys(ConfirmDeleteFamilyNumberActivity.this, view);
        }
    };

    public static /* synthetic */ void lambda$6LPy4w_2BhN5QLAI2Jgibcr_jiA(ConfirmDeleteFamilyNumberActivity confirmDeleteFamilyNumberActivity, View view) {
        a(confirmDeleteFamilyNumberActivity, view);
    }

    /* renamed from: lambda$EniMCOvjAF-4tCZ0eK76B2ZZ4ys */
    public static /* synthetic */ void m20lambda$EniMCOvjAF4tCZ0eK76B2ZZ4ys(ConfirmDeleteFamilyNumberActivity confirmDeleteFamilyNumberActivity, View view) {
        b(confirmDeleteFamilyNumberActivity, view);
    }

    public static /* synthetic */ void lambda$ltvZbz_zgHRvC6CByPyQ99ogyqU(ConfirmDeleteFamilyNumberActivity confirmDeleteFamilyNumberActivity, JSONObject jSONObject) {
        a(confirmDeleteFamilyNumberActivity, jSONObject);
    }

    public static /* synthetic */ void lambda$vryc1c7wCDz_fvqrXHBI4_WOQq4(ConfirmDeleteFamilyNumberActivity confirmDeleteFamilyNumberActivity, VolleyError volleyError) {
        a(confirmDeleteFamilyNumberActivity, volleyError);
    }

    public static final void a(ConfirmDeleteFamilyNumberActivity confirmDeleteFamilyNumberActivity, JSONObject jSONObject) {
        dqc.d(confirmDeleteFamilyNumberActivity, "this$0");
        DeleteFamilyNumberResponse deleteFamilyNumberResponse = (DeleteFamilyNumberResponse) new Gson().a(jSONObject.toString(), (Class<Object>) DeleteFamilyNumberResponse.class);
        if (dqc.a((Object) deleteFamilyNumberResponse.getHeader().getResponseCode(), (Object) "0")) {
            Intent intent = new Intent();
            intent.putExtra("result", String.valueOf(confirmDeleteFamilyNumberActivity.b));
            confirmDeleteFamilyNumberActivity.setResult(-1, intent);
            confirmDeleteFamilyNumberActivity.finish();
            return;
        }
        Toast.makeText(confirmDeleteFamilyNumberActivity.getApplicationContext(), deleteFamilyNumberResponse.getHeader().getResponseMessage(), 0).show();
        confirmDeleteFamilyNumberActivity.setResult(0, new Intent());
        confirmDeleteFamilyNumberActivity.finish();
    }

    public static final void a(ConfirmDeleteFamilyNumberActivity confirmDeleteFamilyNumberActivity, VolleyError volleyError) {
        dqc.d(confirmDeleteFamilyNumberActivity, "this$0");
        Toast.makeText(confirmDeleteFamilyNumberActivity.getApplicationContext(), "Failed!", 1).show();
    }

    public static final void a(ConfirmDeleteFamilyNumberActivity confirmDeleteFamilyNumberActivity, View view) {
        dqc.d(confirmDeleteFamilyNumberActivity, "this$0");
        confirmDeleteFamilyNumberActivity.finish();
    }

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_confirm_delete_family_number);
        if (getIntent().getExtras() != null) {
            this.a = getIntent().getStringExtra("MOBILE_NUMBER");
            this.b = getIntent().getIntExtra("MOBILE_NUMBER_POSITION", 0);
        }
        View findViewById = findViewById(R.id.txtMessage);
        dqc.b(findViewById, "findViewById(R.id.txtMessage)");
        this.c = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.txtMessageDetails);
        dqc.b(findViewById2, "findViewById(R.id.txtMessageDetails)");
        this.d = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.btn_ok);
        dqc.b(findViewById3, "findViewById(R.id.btn_ok)");
        this.e = (Button) findViewById3;
        View findViewById4 = findViewById(R.id.btn_cancel);
        dqc.b(findViewById4, "findViewById(R.id.btn_cancel)");
        this.f = (Button) findViewById4;
        TextView textView = this.c;
        if (textView == null) {
            dqc.a("txtMessage");
            throw null;
        }
        textView.setText(getString(R.string.confirmation_title));
        TextView textView2 = this.d;
        if (textView2 == null) {
            dqc.a("txtMessageDetails");
            throw null;
        }
        textView2.setText(getString(R.string.remove_preferred_number_confirmation_text));
        Button button = this.e;
        if (button == null) {
            dqc.a("btnOK");
            throw null;
        }
        button.setOnClickListener(this.j);
        Button button2 = this.f;
        if (button2 != null) {
            button2.setOnClickListener(this.i);
        } else {
            dqc.a("btnCancel");
            throw null;
        }
    }

    public static final void b(ConfirmDeleteFamilyNumberActivity confirmDeleteFamilyNumberActivity, View view) {
        dqc.d(confirmDeleteFamilyNumberActivity, "this$0");
        String str = confirmDeleteFamilyNumberActivity.a;
        try {
            final djl a = djl.a(confirmDeleteFamilyNumberActivity.getApplicationContext());
            au.b<JSONObject> bVar = confirmDeleteFamilyNumberActivity.g;
            au.a aVar = confirmDeleteFamilyNumberActivity.h;
            DeleteFamilyNumberRequest deleteFamilyNumberRequest = new DeleteFamilyNumberRequest();
            DeleteFamilyNumberRequestHeader deleteFamilyNumberRequestHeader = new DeleteFamilyNumberRequestHeader();
            deleteFamilyNumberRequestHeader.setLocale(a.c.c.k());
            deleteFamilyNumberRequestHeader.setMsisdn(a.d.m());
            deleteFamilyNumberRequest.setHeader(deleteFamilyNumberRequestHeader);
            DeleteFamilyNumberRequestBody deleteFamilyNumberRequestBody = new DeleteFamilyNumberRequestBody();
            deleteFamilyNumberRequestBody.setMobileNumber(str);
            deleteFamilyNumberRequest.setBody(deleteFamilyNumberRequestBody);
            bj bjVar = new bj("https://api-my.te.eg/api/cug/deletemember", new JSONObject(a.a.a(deleteFamilyNumberRequest)), bVar, aVar) { // from class: djl.31
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
}
