package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.reginald.editspinner.EditSpinner;
import com.ucare.we.QuotaTransfer.QuotaTransferActivity;
import com.ucare.we.R;
import com.ucare.we.model.AssociatedNumberResponseBody;
import com.ucare.we.model.usagedetails.DetailedLineUsageItem;
import java.util.ArrayList;
import javax.inject.Inject;

/* renamed from: cwn  reason: default package */
/* loaded from: classes2.dex */
public class cwn extends dab implements cwp, dju {
    String a;
    String b;
    String c;
    String d;
    @Inject
    djb e;
    @Inject
    djw f;
    View.OnClickListener g = new View.OnClickListener() { // from class: cwn.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cwn cwnVar = cwn.this;
            cwnVar.a = cwnVar.k.getText().toString().trim();
            cwn cwnVar2 = cwn.this;
            cwnVar2.b = cwnVar2.l.getText().toString().trim();
            if (!cwn.c(cwn.this.b)) {
                cwn.this.l.setError(cwn.this.getString(R.string.valid_amount));
                return;
            }
            cwn cwnVar3 = cwn.this;
            String str = cwnVar3.a;
            boolean z = false;
            if (TextUtils.isEmpty(str.toString()) || ((!str.startsWith("027") && str.length() < cwnVar3.getResources().getInteger(R.integer.mobile_number)) || (!str.toString().substring(0, 1).equalsIgnoreCase("0") && !str.substring(0, 1).equalsIgnoreCase("٠")))) {
                z = true;
            }
            if (z) {
                cwn.this.k.setError(cwn.this.getString(R.string.wrong_number_format));
            } else if (cwn.d(cwn.this.c)) {
                cwn.this.q.setError(cwn.this.getString(R.string.write_valid_amount));
            } else {
                cwn.this.h.a(cwn.this.a, cwn.this.b);
            }
        }
    };
    private cwm h;
    private djg i;
    private Context j;
    private EditText k;
    private EditText l;
    private LinearLayout m;
    private TextView n;
    private String o;
    private Button p;
    private EditSpinner q;
    private ArrayList<String> r;

    @Override // defpackage.cwp
    public final void a(ArrayList<AssociatedNumberResponseBody> arrayList) {
    }

    public static cwn b(String str) {
        cwn cwnVar = new cwn();
        Bundle bundle = new Bundle();
        bundle.putString("SELECTED_NUMBER", str);
        cwnVar.setArguments(bundle);
        return cwnVar;
    }

    @Override // defpackage.dab, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.o = getArguments().getString("SELECTED_NUMBER");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        this.j = activity;
        this.h = new cwm(activity, this, this);
        this.i = new djg();
        this.e = new djb();
        this.f = new djw();
        this.h.b();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_quota_transfer_second, viewGroup, false);
        EditSpinner editSpinner = (EditSpinner) inflate.findViewById(R.id.SpnrQuotaTransferOption);
        this.q = editSpinner;
        editSpinner.setEditable(false);
        this.p = (Button) inflate.findViewById(R.id.btnNext);
        this.n = (TextView) inflate.findViewById(R.id.tvNoQuotaTransfer);
        this.m = (LinearLayout) inflate.findViewById(R.id.llQuotaTransferItems);
        this.l = (EditText) inflate.findViewById(R.id.edtAmount);
        this.k = (EditText) inflate.findViewById(R.id.edtMobileNumber);
        if (!TextUtils.isEmpty(this.o)) {
            this.k.setText(this.o);
            this.k.setEnabled(false);
        }
        this.p.setOnClickListener(this.g);
        return inflate;
    }

    @Override // defpackage.cwp
    public final void a(boolean z) {
        if (z) {
            this.i.a(this.j, getString(R.string.loading));
        } else {
            this.i.a();
        }
    }

    @Override // defpackage.cwp
    public final void a(String str) {
        ((QuotaTransferActivity) getActivity()).a(cwo.a(this.a, this.c, this.d, this.b, str), "QUOTA_TRANSFER_SECOND_FRAGMENT");
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this.j, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        if (i == 2) {
            this.h.a(this.a, this.b);
        } else if (i != 4) {
        } else {
            this.h.b();
        }
    }

    public static boolean c(String str) {
        return !str.equals("0") && !str.equals("");
    }

    public static boolean d(String str) {
        return str == null || str.isEmpty() || str.equals("");
    }

    @Override // defpackage.cwp
    public final void b(final ArrayList<DetailedLineUsageItem> arrayList) {
        if (arrayList.size() > 0) {
            this.m.setVisibility(0);
            this.n.setVisibility(8);
        }
        this.r = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (this.e.g().equalsIgnoreCase("en")) {
                this.r.add(arrayList.get(i).getFreeUnitEnName());
            } else {
                this.r.add(arrayList.get(i).getFreeUnitArName());
            }
        }
        this.q.setAdapter(new ArrayAdapter(this.j, 17367049, this.r));
        this.q.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: cwn.2
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                cwn.this.c = ((DetailedLineUsageItem) arrayList.get(i2)).getItemCode();
                cwn.this.d = ((DetailedLineUsageItem) arrayList.get(i2)).getMeasureUnitId();
            }
        });
    }
}
