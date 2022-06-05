package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;
import com.ucare.we.R;
import com.ucare.we.model.BillLimitModel.RequestSetBillLimitHeader;
import com.ucare.we.model.BillLimitModel.SetBillLimitRequest;
import defpackage.au;
import defpackage.djl;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dgl  reason: default package */
/* loaded from: classes2.dex */
public class dgl extends dae {
    @Inject
    djg a;
    private TextView d;
    private TextView e;
    private TextView f;
    private TextView g;
    private ImageView h;
    private String i;
    private String j;
    View.OnClickListener b = new View.OnClickListener() { // from class: dgl.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dgl.this.finish();
        }
    };
    private au.b<JSONObject> k = new au.b<JSONObject>() { // from class: dgl.2
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dgl.this.a.a();
            dgl.this.finish();
        }
    };
    private au.a l = new au.a() { // from class: dgl.3
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dgl.this.a.a();
            dgl.this.finish();
        }
    };
    View.OnClickListener c = new View.OnClickListener() { // from class: dgl.4
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            try {
                dgl.this.a.a(dgl.this, dgl.this.getString(R.string.loading));
                final djl a = djl.a(dgl.this);
                String str = dgl.this.i;
                au.b bVar = dgl.this.k;
                au.a aVar = dgl.this.l;
                SetBillLimitRequest setBillLimitRequest = new SetBillLimitRequest();
                RequestSetBillLimitHeader requestSetBillLimitHeader = new RequestSetBillLimitHeader();
                requestSetBillLimitHeader.setLocale(a.c.c.k());
                requestSetBillLimitHeader.setMsisdn(str);
                setBillLimitRequest.setHeader(requestSetBillLimitHeader);
                bj bjVar = new bj("https://api-my.te.eg/api/user/status", new JSONObject(a.a.a(setBillLimitRequest)), bVar, aVar) { // from class: djl.35
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
    };

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_notification_method);
        this.d = (TextView) findViewById(R.id.txtDial);
        this.e = (TextView) findViewById(R.id.txtMail);
        this.f = (TextView) findViewById(R.id.txtOK);
        this.g = (TextView) findViewById(R.id.txtCancel);
        this.h = (ImageView) findViewById(R.id.imgClose);
        if (getIntent().getExtras() != null) {
            this.i = getIntent().getExtras().getString("Dial");
            this.j = getIntent().getExtras().getString("Mail");
        }
        if (!TextUtils.isEmpty(this.i)) {
            this.d.setText(this.i);
        }
        if (!TextUtils.isEmpty(this.j)) {
            this.e.setText(this.j);
        }
        this.h.setOnClickListener(this.b);
        this.f.setOnClickListener(this.c);
        this.g.setOnClickListener(this.b);
    }
}
