package com.ucare.we;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;
import com.google.android.material.textfield.TextInputEditText;
import com.google.gson.Gson;
import com.reginald.editspinner.EditSpinner;
import com.ucare.we.model.TroubleTicket.TroubleTicketResponse;
import com.ucare.we.model.TroubleTicket.TroubleTicketResponseBody;
import com.ucare.we.model.ticket.QueryTicketResponse;
import com.ucare.we.model.ticket.QueyTicketRequest;
import com.ucare.we.paybillpostpaidvoucher.ResponseActivity;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import defpackage.au;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class QueryTicketActivity extends czy implements dif {
    @BindView(R.id.btn_send_ticket)
    Button btnSendTicket;
    Context d;
    @Inject
    djw e;
    @Inject
    dij f;
    @BindView(R.id.fromDateEditText)
    EditText fromDateEditText;
    @Inject
    djg g;
    String h;
    @BindView(R.id.imgBackButton)
    ImageView imgBackButton;
    private ArrayList<String> j;
    @BindView(R.id.statusEditSpinner)
    EditSpinner statusEditSpinner;
    @BindView(R.id.ticketIDEditText)
    TextInputEditText ticketIDEditText;
    @BindView(R.id.toDateEditText)
    EditText toDateEditText;
    @BindView(R.id.txtTitle)
    TextView txtTitle;
    private final TextWatcher i = new TextWatcher() { // from class: com.ucare.we.QueryTicketActivity.1
        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            if (QueryTicketActivity.this.fromDateEditText.getText().toString().length() == 0 || QueryTicketActivity.this.toDateEditText.getText().toString().length() == 0) {
                QueryTicketActivity.this.btnSendTicket.setAlpha(0.6f);
                QueryTicketActivity.this.btnSendTicket.setEnabled(false);
                return;
            }
            QueryTicketActivity.this.btnSendTicket.setAlpha(1.0f);
            QueryTicketActivity.this.btnSendTicket.setEnabled(true);
        }
    };
    String a = "";
    String b = "";
    String c = "";
    private au.b<JSONObject> k = new au.b<JSONObject>() { // from class: com.ucare.we.QueryTicketActivity.2
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            QueryTicketActivity.this.g.a();
            TroubleTicketResponse troubleTicketResponse = (TroubleTicketResponse) new Gson().a(jSONObject.toString(), (Class<Object>) TroubleTicketResponse.class);
            if (troubleTicketResponse != null) {
                QueryTicketActivity.a(QueryTicketActivity.this, troubleTicketResponse.getTroubleTicketResponseBodyArrayList());
            } else {
                ResponseActivity.a(QueryTicketActivity.this.d, QueryTicketActivity.this.getString(R.string.something_went_wrong), QueryTicketActivity.this.getString(R.string.please_try_again), true);
            }
        }
    };
    private au.a l = new au.a() { // from class: com.ucare.we.QueryTicketActivity.3
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            QueryTicketActivity.this.g.a();
            ResponseActivity.a(QueryTicketActivity.this.d, QueryTicketActivity.this.getString(R.string.something_went_wrong), QueryTicketActivity.this.getString(R.string.please_try_again), true);
        }
    };

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.query_ticket_activity);
        ButterKnife.bind(this);
        a(getString(R.string.query_ticket), false, false);
        this.d = this;
        this.j = new ArrayList<>();
        this.txtTitle.setText(getString(R.string.query_ticket));
        this.btnSendTicket.setAlpha(0.6f);
        this.btnSendTicket.setEnabled(false);
        this.h = djv.a("LANGUAGE", "");
        this.statusEditSpinner.setEditable(false);
        this.f.b = this;
        this.imgBackButton.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.QueryTicketActivity.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QueryTicketActivity.this.finish();
                djm.a((Activity) QueryTicketActivity.this);
            }
        });
        try {
            this.g.a(this.d, getString(R.string.loading));
            final djl a = djl.a(this);
            bj bjVar = new bj("https://api-my.te.eg/api/files/read?fileName=tt_status.json", this.k, this.l) { // from class: djl.75
                @Override // defpackage.as
                public final Map<String, String> c() throws AuthFailureError {
                    HashMap hashMap = new HashMap();
                    hashMap.put("Jwt", djl.this.d.I());
                    return hashMap;
                }
            };
            bjVar.j = new am(60000, 0, 0.0f);
            a.b.a((as) bjVar);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.fromDateEditText.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.QueryTicketActivity.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                czb czbVar = new czb();
                Bundle bundle2 = new Bundle();
                bundle2.putString("PICKER_TYPE", "FROM_PICKER");
                czbVar.setArguments(bundle2);
                czbVar.show(QueryTicketActivity.this.getSupportFragmentManager(), "datePicker");
            }
        });
        this.toDateEditText.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.QueryTicketActivity.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                czb czbVar = new czb();
                Bundle bundle2 = new Bundle();
                bundle2.putString("PICKER_TYPE", "TO_PICKER");
                czbVar.setArguments(bundle2);
                czbVar.show(QueryTicketActivity.this.getSupportFragmentManager(), "datePicker");
            }
        });
        this.imgBackButton.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.QueryTicketActivity.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QueryTicketActivity.this.finish();
                djm.a((Activity) QueryTicketActivity.this);
            }
        });
        this.btnSendTicket.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.QueryTicketActivity.8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                djg djgVar = QueryTicketActivity.this.g;
                QueryTicketActivity queryTicketActivity = QueryTicketActivity.this;
                djgVar.a(queryTicketActivity, queryTicketActivity.getString(R.string.loading));
                QueyTicketRequest queyTicketRequest = new QueyTicketRequest();
                queyTicketRequest.setCurrentPageNo("1");
                queyTicketRequest.setPageLength("10");
                queyTicketRequest.setStartTime(QueryTicketActivity.this.fromDateEditText.getText().toString());
                queyTicketRequest.setEndTime(QueryTicketActivity.this.toDateEditText.getText().toString());
                queyTicketRequest.setRequestNo(QueryTicketActivity.this.ticketIDEditText.getText().toString());
                queyTicketRequest.setServiceNo(QueryTicketActivity.this.e.m());
                queyTicketRequest.setStatus(QueryTicketActivity.this.c);
                QueryTicketActivity.this.f.a(queyTicketRequest);
            }
        });
        this.toDateEditText.addTextChangedListener(this.i);
        this.fromDateEditText.addTextChangedListener(this.i);
        this.ticketIDEditText.addTextChangedListener(this.i);
    }

    @Override // defpackage.dif
    public final void a(String str) {
        this.fromDateEditText.setText(str);
    }

    @Override // defpackage.dif
    public final void b(String str) {
        this.toDateEditText.setText(str);
    }

    @Override // defpackage.dif
    public final void a(ArrayList<QueryTicketResponse> arrayList) {
        this.g.a();
        Intent intent = new Intent(this, TicketsListActivity.class);
        intent.putParcelableArrayListExtra("TICKETS_LIST", arrayList);
        startActivity(intent);
    }

    @Override // defpackage.dif
    public final void c(String str) {
        this.g.a();
        UnNavigateResponseActivity.a(this, str, getString(R.string.please_try_again), true);
    }

    static /* synthetic */ void a(QueryTicketActivity queryTicketActivity, final ArrayList arrayList) {
        int i = 0;
        if (queryTicketActivity.h.equals("en")) {
            while (i < arrayList.size()) {
                queryTicketActivity.j.add(((TroubleTicketResponseBody) arrayList.get(i)).getEn());
                i++;
            }
        } else {
            while (i < arrayList.size()) {
                queryTicketActivity.j.add(((TroubleTicketResponseBody) arrayList.get(i)).getAr());
                i++;
            }
        }
        queryTicketActivity.statusEditSpinner.setAdapter(new ArrayAdapter(queryTicketActivity, 17367049, queryTicketActivity.j));
        queryTicketActivity.statusEditSpinner.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.ucare.we.QueryTicketActivity.9
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                QueryTicketActivity.this.c = ((TroubleTicketResponseBody) arrayList.get(i2)).getId();
            }
        });
    }
}
