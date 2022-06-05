package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ucare.we.R;
import com.ucare.we.bankcardpaymentpostpaid.PostpaidPaymentActivity;
import com.ucare.we.model.OpenInvoicesBody;
import com.ucare.we.model.PostPaidBalanceResponse;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import java.util.List;
import javax.inject.Inject;
import org.json.JSONException;

/* renamed from: dcb  reason: default package */
/* loaded from: classes2.dex */
public class dcb extends dab implements dcd, dju {
    @Inject
    djg a;
    String b;
    boolean c = false;
    View.OnClickListener d = new View.OnClickListener() { // from class: dcb.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String trim = dcb.this.m.getText().toString().trim();
            if (!TextUtils.isEmpty(trim)) {
                int parseInt = Integer.parseInt(trim);
                if (parseInt >= 10) {
                    dcb.b(dcb.this);
                    Intent intent = new Intent(dcb.this.i, PostpaidPaymentActivity.class);
                    intent.putExtra("amount", parseInt);
                    intent.putExtra("targetNumber", dcb.this.b);
                    dcb.this.startActivity(intent);
                    return;
                }
                dcb dcbVar = dcb.this;
                dcb.a(dcbVar, dcbVar.getString(R.string.invalid_amount));
                return;
            }
            dcb dcbVar2 = dcb.this;
            dcb.a(dcbVar2, dcbVar2.getString(R.string.invalid_amount));
        }
    };
    private RecyclerView e;
    private TextView f;
    private TextView g;
    private dcc h;
    private Context i;
    private Button j;
    private LinearLayout k;
    private LinearLayout l;
    private TextInputEditText m;
    private TextInputLayout n;

    @Override // defpackage.dcd
    public final void a(String str) {
    }

    @Override // defpackage.dcd
    public final void b(String str) {
    }

    public static dcb a(Bundle bundle) {
        dcb dcbVar = new dcb();
        dcbVar.setArguments(bundle);
        return dcbVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.pay_bill_post_paid_fragment, viewGroup, false);
        this.e = (RecyclerView) inflate.findViewById(R.id.rvPaymentMethods);
        this.f = (TextView) inflate.findViewById(R.id.txtOutStandingAmount);
        this.j = (Button) inflate.findViewById(R.id.btnPayBill);
        this.m = (TextInputEditText) inflate.findViewById(R.id.edtAmount);
        this.n = (TextInputLayout) inflate.findViewById(R.id.tlAmount);
        this.k = (LinearLayout) inflate.findViewById(R.id.lnrTitles);
        this.l = (LinearLayout) inflate.findViewById(R.id.ll_outStandingAmount);
        this.g = (TextView) inflate.findViewById(R.id.txtNoBills);
        this.b = getArguments().getString("targetNumber");
        this.c = getArguments().getBoolean("CURRENT_NUMBER_FLAG", false);
        this.m.clearFocus();
        if (!this.c) {
            this.l.setVisibility(8);
            this.e.setVisibility(8);
        }
        this.j.setOnClickListener(this.d);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        this.i = activity;
        dcc dccVar = new dcc(activity, this, this);
        this.h = dccVar;
        try {
            dccVar.a();
            this.h.b();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.dcd
    public final void a(List<OpenInvoicesBody> list) {
        if (list.size() > 0) {
            dca dcaVar = new dca(this.i, list);
            this.e.setLayoutManager(new LinearLayoutManager(this.i));
            this.e.setAdapter(dcaVar);
            if (this.c) {
                this.e.setVisibility(0);
                this.k.setVisibility(0);
            }
            this.g.setVisibility(8);
            return;
        }
        this.e.setVisibility(8);
        this.k.setVisibility(8);
        this.g.setVisibility(0);
    }

    @Override // defpackage.dcd
    public final void a(PostPaidBalanceResponse postPaidBalanceResponse) {
        TextView textView = this.f;
        textView.setText(String.valueOf(postPaidBalanceResponse.body.outstandingAmount) + " " + this.i.getString(R.string.egp));
        if (postPaidBalanceResponse.body.outstandingAmount > 10.0f) {
            this.m.setText(String.valueOf((int) Math.ceil(postPaidBalanceResponse.body.outstandingAmount)));
        }
        TextInputEditText textInputEditText = this.m;
        textInputEditText.setSelection(textInputEditText.getText().length());
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this.i, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        if (i == 1) {
            try {
                this.h.a();
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else if (i != 2) {
        } else {
            try {
                this.h.b();
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    static /* synthetic */ void b(dcb dcbVar) {
        TextInputEditText textInputEditText = dcbVar.m;
        textInputEditText.setBackgroundDrawable(dcbVar.getContext().getDrawable(R.drawable.text_input_white_background_success));
        textInputEditText.setHintTextColor(dcbVar.getContext().getResources().getColor(R.color.color_grey_new));
        dcbVar.n.setError(null);
        dcbVar.n.setErrorEnabled(false);
    }

    static /* synthetic */ void a(dcb dcbVar, String str) {
        TextInputEditText textInputEditText = dcbVar.m;
        textInputEditText.setBackgroundDrawable(dcbVar.getContext().getDrawable(R.drawable.text_input_white_background_focused));
        textInputEditText.setHintTextColor(dcbVar.getContext().getResources().getColor(R.color.color_grey_new));
        UnNavigateResponseActivity.a(dcbVar.getContext(), str, dcbVar.getString(R.string.please_try_again), true);
    }
}
