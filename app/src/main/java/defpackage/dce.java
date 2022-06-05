package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.VolleyError;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.OpenInvoicesBody;
import com.ucare.we.model.PostPaidBalanceResponse;
import com.ucare.we.paybillpostpaidvoucher.ResponseActivity;
import com.ucare.we.view.AppCompatTextView;
import defpackage.au;
import java.util.List;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dce  reason: default package */
/* loaded from: classes2.dex */
public class dce extends dab implements dcd, dju {
    String a;
    String b;
    @Inject
    djg d;
    private RecyclerView h;
    private AppCompatTextView i;
    private AppCompatTextView j;
    private dcc k;
    private Context l;
    private Button m;
    private TextInputEditText n;
    private TextInputLayout o;
    private LinearLayout p;
    private LinearLayout q;
    boolean c = false;
    View.OnClickListener e = new View.OnClickListener() { // from class: dce.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dce dceVar = dce.this;
            dceVar.a = dceVar.n.getText().toString().trim();
            if (dce.this.a.length() == 16) {
                try {
                    dce.b(dce.this);
                    dce.this.d.a(dce.this.l, dce.this.l.getString(R.string.loading));
                    dce.this.k.a(dce.this.a, dce.this.b);
                    return;
                } catch (JSONException e) {
                    e.printStackTrace();
                    return;
                }
            }
            dce dceVar2 = dce.this;
            dce.a(dceVar2, dceVar2.l.getString(R.string.fill_voucher));
        }
    };
    au.a f = new au.a() { // from class: dce.2
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
        }
    };
    au.b<JSONObject> g = new au.b<JSONObject>() { // from class: dce.3
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            new Gson();
        }
    };

    public static dce a(Bundle bundle) {
        dce dceVar = new dce();
        dceVar.setArguments(bundle);
        return dceVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.voucher_pay_bill_fragment, viewGroup, false);
        this.h = (RecyclerView) inflate.findViewById(R.id.rvPaymentMethods);
        this.i = (AppCompatTextView) inflate.findViewById(R.id.txtOutStandingAmount);
        this.m = (Button) inflate.findViewById(R.id.btnPayBill);
        this.n = (TextInputEditText) inflate.findViewById(R.id.edtAmount);
        this.o = (TextInputLayout) inflate.findViewById(R.id.tlAmount);
        this.q = (LinearLayout) inflate.findViewById(R.id.lnrTitles);
        this.j = (AppCompatTextView) inflate.findViewById(R.id.txtNoBills);
        this.p = (LinearLayout) inflate.findViewById(R.id.ll_outStandingAmount);
        if (getArguments() != null) {
            this.b = getArguments().getString("targetNumber");
            this.c = getArguments().getBoolean("CURRENT_NUMBER_FLAG", false);
        }
        if (!this.c) {
            this.p.setVisibility(8);
            this.h.setVisibility(8);
        }
        this.m.setOnClickListener(this.e);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        this.l = activity;
        dcc dccVar = new dcc(activity, this, this);
        this.k = dccVar;
        try {
            dccVar.a();
            this.k.b();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.dcd
    public final void a(List<OpenInvoicesBody> list) {
        if (list.size() > 0) {
            dca dcaVar = new dca(this.l, list);
            this.h.setLayoutManager(new LinearLayoutManager(this.l));
            this.h.setAdapter(dcaVar);
            if (this.c) {
                this.h.setVisibility(0);
                this.q.setVisibility(0);
            }
            this.j.setVisibility(8);
            return;
        }
        this.h.setVisibility(8);
        this.q.setVisibility(8);
        this.j.setVisibility(0);
    }

    @Override // defpackage.dcd
    public final void a(PostPaidBalanceResponse postPaidBalanceResponse) {
        AppCompatTextView appCompatTextView = this.i;
        appCompatTextView.setText(String.valueOf(postPaidBalanceResponse.body.outstandingAmount) + " " + this.l.getString(R.string.egp));
    }

    @Override // defpackage.dcd
    public final void b(String str) {
        this.d.a();
        Context context = this.l;
        ResponseActivity.a(context, str, context.getString(R.string.please_try_again), true);
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this.l, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        if (i == 1) {
            try {
                this.k.a();
                this.k.b();
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else if (i == 2) {
            try {
                this.k.a();
                this.k.b();
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        } else if (i != 3) {
        } else {
            try {
                this.d.a(this.l, this.l.getString(R.string.loading));
                this.k.a(this.a, this.b);
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
    }

    @Override // defpackage.dcd
    public final void a(String str) {
        try {
            djl.a(this.l).k(this.g, this.f);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.d.a();
        Context context = this.l;
        ResponseActivity.a(context, context.getString(R.string.voucher_success), str, false);
    }

    static /* synthetic */ void b(dce dceVar) {
        TextInputEditText textInputEditText = dceVar.n;
        textInputEditText.setBackgroundDrawable(dceVar.getContext().getDrawable(R.drawable.text_input_white_background_success));
        textInputEditText.setHintTextColor(dceVar.getContext().getResources().getColor(R.color.color_grey_new));
        dceVar.o.setError(null);
        dceVar.o.setErrorEnabled(false);
    }

    static /* synthetic */ void a(dce dceVar, String str) {
        dceVar.o.setErrorEnabled(true);
        dceVar.o.setError(str);
        TextInputEditText textInputEditText = dceVar.n;
        textInputEditText.setBackgroundDrawable(dceVar.getContext().getDrawable(R.drawable.text_input_white_background_error));
        textInputEditText.setHintTextColor(dceVar.getContext().getResources().getColor(R.color.color_grey_new));
    }
}
