package com.ucare.we.presentation.promisetopayandsalefny;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.volley.AuthFailureError;
import com.ucare.we.R;
import com.ucare.we.model.DefaultRequest;
import com.ucare.we.model.RequestHeader;
import defpackage.au;
import defpackage.djl;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PromiseToPayAndSalefnyActivity extends dae implements dgu, dju {
    @Inject
    djw a;
    @Inject
    dhn b;
    @Inject
    dio c;
    View.OnClickListener d = new View.OnClickListener() { // from class: com.ucare.we.presentation.promisetopayandsalefny.PromiseToPayAndSalefnyActivity.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PromiseToPayAndSalefnyActivity.this.finish();
        }
    };
    View.OnClickListener e = new View.OnClickListener() { // from class: com.ucare.we.presentation.promisetopayandsalefny.PromiseToPayAndSalefnyActivity.2
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PromiseToPayAndSalefnyActivity.this.c.d()) {
                PromiseToPayAndSalefnyActivity.this.g.a();
            } else if (!PromiseToPayAndSalefnyActivity.this.c.e()) {
            } else {
                PromiseToPayAndSalefnyActivity.this.finish();
            }
        }
    };
    private Context f;
    private dgt g;
    private ImageView h;
    private ImageView i;
    private Button j;
    private TextView k;
    private TextView l;

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_promise_to_pay_and_salefny);
        this.f = this;
        this.h = (ImageView) findViewById(R.id.ivSalefny);
        this.i = (ImageView) findViewById(R.id.ivClose);
        this.j = (Button) findViewById(R.id.btnSalefny);
        this.k = (TextView) findViewById(R.id.tvTitleSalefny);
        this.l = (TextView) findViewById(R.id.tvMessageSalefny);
        if (this.c.d()) {
            this.h.setImageResource(R.drawable.salefny);
            this.k.setText(R.string.salefny);
            this.l.setText(((Object) getText(R.string.salefny_disclaimer)) + " " + this.b.f.getSalefny_prices() + " " + ((Object) getText(R.string.salefny_disclaimer2)) + this.b.f.getSalefny_gb() + ((Object) getText(R.string.salefny_disclaimer3)));
            this.j.setText(getString(R.string.subscribe));
        } else if (this.c.e()) {
            this.h.setImageResource(R.drawable.promise_to_pay);
            this.k.setText(R.string.promise_to_pay);
            this.l.setText(R.string.promise_to_pay_disclaimer);
            this.j.setText(getString(R.string.ok));
        }
        this.i.setOnClickListener(this.d);
        this.j.setOnClickListener(this.e);
        this.c = new dio();
        this.g = new dgt(this.f, this, this);
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this.f, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        if (i == 1) {
            this.g.a();
        } else if (i != 2) {
        } else {
            dgt dgtVar = this.g;
            try {
                final djl a = djl.a(dgtVar.a);
                au.b<JSONObject> bVar = dgtVar.c;
                au.a aVar = dgtVar.d;
                RequestHeader requestHeader = new RequestHeader();
                requestHeader.setLocale(a.c.c.k());
                requestHeader.setMsisdn(a.d.m());
                DefaultRequest defaultRequest = new DefaultRequest();
                defaultRequest.setHeader(requestHeader);
                bj bjVar = new bj("https://api-my.te.eg/api/line/promisetopay", new JSONObject(a.a.a(defaultRequest)), bVar, aVar) { // from class: djl.62
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
}
