package com.ucare.we.presentation.fmcuser.FMCMSISDNSelector;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.FMCModel.FMCMemebrsResponse;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import defpackage.au;
import defpackage.das;
import java.util.ArrayList;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class FMCMSISDNSelector extends czy implements dju {
    TextView a;
    TextView b;
    ImageView c;
    RecyclerView d;
    @Inject
    djg e;
    das f;
    private FMCMemebrsResponse g;
    private int h;
    private au.b<JSONObject> i = new au.b<JSONObject>() { // from class: com.ucare.we.presentation.fmcuser.FMCMSISDNSelector.FMCMSISDNSelector.1
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            FMCMSISDNSelector.this.a(false);
            Gson gson = new Gson();
            FMCMSISDNSelector.this.g = (FMCMemebrsResponse) gson.a(jSONObject.toString(), (Class<Object>) FMCMemebrsResponse.class);
            if (!FMCMSISDNSelector.this.g.getHeader().getResponseCode().equals("0")) {
                if (FMCMSISDNSelector.this.g.getHeader().getResponseCode().equals("1200")) {
                    FMCMSISDNSelector.this.b(1);
                    return;
                }
                FMCMSISDNSelector fMCMSISDNSelector = FMCMSISDNSelector.this;
                UnNavigateResponseActivity.a(fMCMSISDNSelector, fMCMSISDNSelector.g.getHeader().getResponseMessage(), FMCMSISDNSelector.this.getString(R.string.try_again), true);
                return;
            }
            final ArrayList arrayList = new ArrayList();
            for (int i = 0; i < FMCMSISDNSelector.this.g.getBody().getGroupMembers().size(); i++) {
                if (FMCMSISDNSelector.this.h == 0) {
                    arrayList.add(FMCMSISDNSelector.this.g.getBody().getGroupMembers().get(i).getServiceNumber());
                } else if (FMCMSISDNSelector.this.h == 1) {
                    if (FMCMSISDNSelector.this.g.getBody().getGroupMembers().get(i).getNetworkType().equalsIgnoreCase("MOBILE")) {
                        arrayList.add(FMCMSISDNSelector.this.g.getBody().getGroupMembers().get(i).getServiceNumber());
                    }
                } else if (FMCMSISDNSelector.this.h == 2 && FMCMSISDNSelector.this.g.getBody().getGroupMembers().get(i).getNetworkType().equalsIgnoreCase("BROADBAND")) {
                    arrayList.add(FMCMSISDNSelector.this.g.getBody().getGroupMembers().get(i).getServiceNumber());
                }
            }
            final FMCMSISDNSelector fMCMSISDNSelector2 = FMCMSISDNSelector.this;
            if (arrayList.size() > 0) {
                fMCMSISDNSelector2.b.setVisibility(8);
                fMCMSISDNSelector2.d.setVisibility(0);
                fMCMSISDNSelector2.f = new das(fMCMSISDNSelector2, arrayList);
                fMCMSISDNSelector2.d.setLayoutManager(new LinearLayoutManager(fMCMSISDNSelector2));
                fMCMSISDNSelector2.d.setHasFixedSize(false);
                fMCMSISDNSelector2.d.setAdapter(fMCMSISDNSelector2.f);
                fMCMSISDNSelector2.f.a = new das.a() { // from class: com.ucare.we.presentation.fmcuser.FMCMSISDNSelector.FMCMSISDNSelector.4
                    @Override // defpackage.das.a
                    public final void onItemClick(int i2) {
                        Intent intent = new Intent();
                        intent.putExtra("FMC_SELECTED_MSISDN", (String) arrayList.get(i2));
                        FMCMSISDNSelector.this.setResult(-1, intent);
                        FMCMSISDNSelector.this.finish();
                    }
                };
                return;
            }
            fMCMSISDNSelector2.b.setVisibility(0);
            fMCMSISDNSelector2.d.setVisibility(8);
        }
    };
    private au.a j = new au.a() { // from class: com.ucare.we.presentation.fmcuser.FMCMSISDNSelector.FMCMSISDNSelector.2
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            FMCMSISDNSelector.this.a(false);
            FMCMSISDNSelector fMCMSISDNSelector = FMCMSISDNSelector.this;
            UnNavigateResponseActivity.a(fMCMSISDNSelector, fMCMSISDNSelector.getString(R.string.check_network_connection), FMCMSISDNSelector.this.getString(R.string.try_again), true);
            FMCMSISDNSelector.this.finish();
        }
    };

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_fmcmsisdnselector);
        a(getString(R.string.choose_service_number), false, false);
        this.h = getIntent().getIntExtra("FMC_NUMBER_TYPE", 0);
        this.a = (TextView) findViewById(R.id.txtTitle);
        this.b = (TextView) findViewById(R.id.tvNoDataAvailable);
        this.c = (ImageView) findViewById(R.id.imgBackButton);
        this.d = (RecyclerView) findViewById(R.id.rvGroupMSISDN);
        this.a.setText(R.string.choose_service_number);
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.fmcuser.FMCMSISDNSelector.FMCMSISDNSelector.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FMCMSISDNSelector.this.finish();
            }
        });
        try {
            a(true);
            djl.a(this).y(this.i, this.j);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void a(boolean z) {
        if (z) {
            this.e.a(this, getString(R.string.loading));
        } else {
            this.e.a();
        }
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        if (i != 1) {
            return;
        }
        try {
            djl.a(this).y(this.i, this.j);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
