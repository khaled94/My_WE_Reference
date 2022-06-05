package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.BalanceTransferHistoryModel.BalanceTransferHistoryItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import javax.inject.Inject;
import org.json.JSONException;

/* renamed from: cxr  reason: default package */
/* loaded from: classes2.dex */
public class cxr extends dab implements cxt, dju {
    int a;
    String b;
    @Inject
    djg c;
    Typeface d;
    Typeface e;
    private TextView m;
    private TextView n;
    private TextView o;
    private TextView p;
    private RecyclerView q;
    private Context r;
    private cxs s;
    private ArrayList<String> t;
    private ArrayList<Boolean> u;
    private LinearLayout v;
    private final int g = 0;
    private final int h = 1;
    private final int i = 2;
    private final int j = 3;
    private final int k = 4;
    private final int l = 5;
    View.OnClickListener f = new View.OnClickListener() { // from class: cxr.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (view.getTag() != null) {
                cxr.this.a(((Integer) view.getTag()).intValue());
                cxr.this.q.setAdapter(null);
            }
        }
    };

    public static cxr a(String str) {
        cxr cxrVar = new cxr();
        Bundle bundle = new Bundle();
        bundle.putString("FMC_SELECTED_MSISDN", str);
        cxrVar.setArguments(bundle);
        return cxrVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_balance_transfer_history, viewGroup, false);
        this.d = ResourcesCompat.getFont(getContext(), R.font.montserrat_bold);
        this.e = ResourcesCompat.getFont(getContext(), R.font.montserrat_medium);
        this.d = ResourcesCompat.getFont(getContext(), R.font.montserrat_bold);
        this.e = ResourcesCompat.getFont(getContext(), R.font.montserrat_medium);
        this.m = (TextView) inflate.findViewById(R.id.txtFirstMonth);
        this.n = (TextView) inflate.findViewById(R.id.txtSecondMonth);
        this.o = (TextView) inflate.findViewById(R.id.txtThirdMonth);
        this.p = (TextView) inflate.findViewById(R.id.txtNoData);
        this.q = (RecyclerView) inflate.findViewById(R.id.rvBalanceTransferHistory);
        this.v = (LinearLayout) inflate.findViewById(R.id.lnrTitles);
        this.b = getArguments().getString("FMC_SELECTED_MSISDN");
        this.m.setTag(0);
        this.n.setTag(1);
        this.o.setTag(2);
        this.m.setOnClickListener(this.f);
        this.n.setOnClickListener(this.f);
        this.o.setOnClickListener(this.f);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        this.r = activity;
        cxs cxsVar = new cxs(activity, this, this);
        this.s = cxsVar;
        cxsVar.d = new ArrayList<>();
        cxsVar.e = new ArrayList<>();
        cxsVar.g = cxsVar.b.getResources().getStringArray(R.array.months_names_array);
        cxsVar.f = new ArrayList<>(Arrays.asList(cxsVar.g));
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i = calendar.get(2);
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = i - i2;
            if (i3 >= 0) {
                cxsVar.d.add(0, cxsVar.f.get(i3));
                cxsVar.e.add(0, Boolean.FALSE);
            } else {
                cxsVar.d.add(0, cxsVar.f.get(i3 + 12));
                cxsVar.e.add(0, Boolean.TRUE);
            }
        }
        this.t = this.s.d;
        this.u = this.s.e;
        this.m.setText(this.t.get(0));
        this.n.setText(this.t.get(1));
        this.o.setText(this.t.get(2));
        a(this.t.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (i == 0) {
            this.m.setTypeface(this.d);
            this.m.setTextColor(getResources().getColor(R.color.white));
            this.m.setBackgroundDrawable(getResources().getDrawable(R.drawable.tabs_border_color_purple));
        } else {
            this.m.setTypeface(this.e);
            this.m.setTextColor(getResources().getColor(R.color.secondary_txt_color));
            this.m.setBackgroundDrawable(getResources().getDrawable(R.drawable.stroke_gray_border));
        }
        if (i == 1) {
            this.n.setTypeface(this.d);
            this.n.setTextColor(getResources().getColor(R.color.white));
            this.n.setBackgroundDrawable(getResources().getDrawable(R.drawable.tabs_border_color_purple));
        } else {
            this.n.setTypeface(this.e);
            this.n.setTextColor(getResources().getColor(R.color.secondary_txt_color));
            this.n.setBackgroundDrawable(getResources().getDrawable(R.drawable.stroke_gray_border));
        }
        if (i == 2) {
            this.o.setTypeface(this.d);
            this.o.setTextColor(getResources().getColor(R.color.white));
            this.o.setBackgroundDrawable(getResources().getDrawable(R.drawable.tabs_border_color_purple));
        } else {
            this.o.setTypeface(this.e);
            this.o.setTextColor(getResources().getColor(R.color.secondary_txt_color));
            this.o.setBackgroundDrawable(getResources().getDrawable(R.drawable.stroke_gray_border));
        }
        try {
            this.a = i;
            this.s.a(this.b, i);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.cxt
    public final void a(boolean z) {
        if (z) {
            djg djgVar = this.c;
            Context context = this.r;
            djgVar.a(context, context.getString(R.string.loading));
            return;
        }
        this.c.a();
    }

    @Override // defpackage.cxt
    public final void a(ArrayList<BalanceTransferHistoryItem> arrayList) {
        if (arrayList.size() > 0) {
            cxq cxqVar = new cxq(this.r, arrayList);
            this.q.setLayoutManager(new LinearLayoutManager(this.r));
            this.q.setHasFixedSize(false);
            this.q.setAdapter(cxqVar);
            this.q.setVisibility(0);
            this.p.setVisibility(8);
            this.v.setVisibility(0);
            return;
        }
        this.q.setAdapter(null);
        this.q.setVisibility(8);
        this.p.setVisibility(0);
        this.v.setVisibility(8);
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this.r, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        try {
            this.s.a(this.b, this.a);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
