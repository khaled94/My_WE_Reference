package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.ucare.we.R;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import com.ucare.we.ui.BalanceTransferConfirmationActivity;
import javax.inject.Inject;
import org.json.JSONException;

/* renamed from: cxn  reason: default package */
/* loaded from: classes2.dex */
public class cxn extends dab implements cxp, dju {
    String a;
    String b;
    @Inject
    djg c;
    @Inject
    djw d;
    View.OnClickListener e = new View.OnClickListener() { // from class: cxn.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cxn cxnVar = cxn.this;
            cxnVar.a = cxnVar.g.getText().toString();
            cxn cxnVar2 = cxn.this;
            cxnVar2.b = cxnVar2.f.getText().toString();
            cxo unused = cxn.this.j;
            String str = cxn.this.a;
            if (!str.equals("0") && !str.equals("") && !cxn.this.b.equals("")) {
                try {
                    cxn.this.a(true);
                    cxn.this.j.a(cxn.this.a, cxn.this.b);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            if (TextUtils.isEmpty(cxn.this.f.getText())) {
                cxn.this.f.setError(cxn.this.getString(R.string.enter_mobile_number));
            }
            if (TextUtils.isEmpty(cxn.this.g.getText())) {
                cxn.this.g.setError(cxn.this.getString(R.string.wrong_amount));
            }
        }
    };
    private EditText f;
    private EditText g;
    private Context h;
    private Button i;
    private cxo j;

    public static cxn a() {
        Bundle bundle = new Bundle();
        cxn cxnVar = new cxn();
        cxnVar.setArguments(bundle);
        return cxnVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.balance_transfer_fragment, viewGroup, false);
        this.f = (EditText) inflate.findViewById(R.id.edtMobileNumber);
        this.g = (EditText) inflate.findViewById(R.id.edtAmount);
        Button button = (Button) inflate.findViewById(R.id.btnNext);
        this.i = button;
        button.setOnClickListener(this.e);
        if (this.d.w().equalsIgnoreCase("PREPAID_CORPORATE_PS_FD_USER") || this.d.w().equalsIgnoreCase("PREPAID_INDIVIDUAL_FD_DEFAULT_USER") || this.d.w().equalsIgnoreCase("POSTPAID_CORPORATE_PS_FD_USER") || this.d.w().equalsIgnoreCase("POSTPAID_INDIVIDUAL_FD_DEFAULT_USER")) {
            this.g.setHint(R.string.amount_in_mb);
        }
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        this.h = activity;
        this.j = new cxo(activity, this, this);
        this.d = new djw();
    }

    public final void a(boolean z) {
        if (z) {
            djg djgVar = this.c;
            Context context = this.h;
            djgVar.a(context, context.getString(R.string.loading));
            return;
        }
        this.c.a();
    }

    @Override // defpackage.cxp
    public final void b() {
        a(false);
        Intent intent = new Intent(this.h, BalanceTransferConfirmationActivity.class);
        intent.putExtra("amount", this.g.getText().toString());
        intent.putExtra("targetNumber", this.f.getText().toString());
        startActivity(intent);
    }

    @Override // defpackage.cxp
    public final void a(String str) {
        a(false);
        Context context = this.h;
        UnNavigateResponseActivity.a(context, str, context.getString(R.string.error), true);
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this.h, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        try {
            a(true);
            this.j.a(this.a, this.b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
