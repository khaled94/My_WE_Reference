package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.ucare.we.AssociatedNumbersActivity;
import com.ucare.we.QuotaTransfer.QuotaTransferActivity;
import com.ucare.we.R;
import com.ucare.we.model.AssociatedNumberResponseBody;
import com.ucare.we.model.usagedetails.DetailedLineUsageItem;
import java.util.ArrayList;

/* renamed from: cwl  reason: default package */
/* loaded from: classes2.dex */
public class cwl extends dab implements cwp, dju {
    public static String a = "QUOTA_EXTRA";
    public static String b = "QUOTA_NUMBER";
    public static String c = "NUMBER";
    public static String d = "IS_PICKING_NUMBER";
    int e;
    TextView f;
    private Button j;
    private Button k;
    private Context l;
    private djg m;
    private cwm n;
    private final int i = 10;
    View.OnClickListener g = new View.OnClickListener() { // from class: cwl.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((QuotaTransferActivity) cwl.this.getActivity()).a("");
        }
    };
    View.OnClickListener h = new View.OnClickListener() { // from class: cwl.2
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cwl.this.n.a();
        }
    };

    @Override // defpackage.cwp
    public final void a(String str) {
    }

    @Override // defpackage.cwp
    public final void b(ArrayList<DetailedLineUsageItem> arrayList) {
    }

    public static cwl a(int i) {
        cwl cwlVar = new cwl();
        Bundle bundle = new Bundle();
        bundle.putInt(c, i);
        cwlVar.setArguments(bundle);
        return cwlVar;
    }

    @Override // defpackage.dab, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.e = getArguments().getInt(c);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_quota_transfer_first, viewGroup, false);
        this.j = (Button) inflate.findViewById(R.id.btnMyNumbers);
        this.k = (Button) inflate.findViewById(R.id.btnOtherNumber);
        TextView textView = (TextView) inflate.findViewById(R.id.tvSubTitle);
        this.f = textView;
        if (this.e == 1) {
            textView.setText(getString(R.string.transfer_balance_to));
        }
        this.j.setOnClickListener(this.h);
        this.k.setOnClickListener(this.g);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.l = getActivity();
        this.m = new djg();
        this.n = new cwm(this.l, this, this);
    }

    @Override // defpackage.cwp
    public final void a(boolean z) {
        if (z) {
            djg djgVar = this.m;
            Context context = this.l;
            djgVar.a(context, context.getString(R.string.loading));
            return;
        }
        this.m.a();
    }

    @Override // defpackage.cwp
    public final void a(ArrayList<AssociatedNumberResponseBody> arrayList) {
        Intent intent = new Intent(this.l, AssociatedNumbersActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("associatedNumbers", arrayList);
        bundle.putString(a, "Quota");
        bundle.putBoolean(d, true);
        intent.putExtras(bundle);
        startActivityForResult(intent, 10);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 10 && i2 == -1) {
            ((QuotaTransferActivity) getActivity()).a(intent.getStringExtra(b));
        }
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this.l, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        this.n.a();
    }
}
