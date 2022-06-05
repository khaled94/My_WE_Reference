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
import com.ucare.we.model.PaymentHistoryPostPaidModels.PaymentHistoryPostPaidResponseBody;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.inject.Inject;
import org.json.JSONException;

/* renamed from: dcf  reason: default package */
/* loaded from: classes2.dex */
public class dcf extends dab implements dci, dju {
    int a;
    @Inject
    djg b;
    Typeface c;
    Typeface d;
    private TextView l;
    private TextView m;
    private TextView n;
    private TextView o;
    private TextView p;
    private TextView q;
    private TextView r;
    private RecyclerView s;
    private Context t;
    private dch u;
    private ArrayList<String> v;
    private ArrayList<Boolean> w;
    private LinearLayout x;
    private final int f = 0;
    private final int g = 1;
    private final int h = 2;
    private final int i = 3;
    private final int j = 4;
    private final int k = 5;
    View.OnClickListener e = new View.OnClickListener() { // from class: dcf.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (view.getTag() != null) {
                dcf.this.a(((Integer) view.getTag()).intValue());
                dcf.this.s.setAdapter(null);
            }
        }
    };

    public static dcf a() {
        Bundle bundle = new Bundle();
        dcf dcfVar = new dcf();
        dcfVar.setArguments(bundle);
        return dcfVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.payment_history_fragment, viewGroup, false);
        this.c = ResourcesCompat.getFont(getContext(), R.font.montserrat_bold);
        this.d = ResourcesCompat.getFont(getContext(), R.font.montserrat_medium);
        this.l = (TextView) inflate.findViewById(R.id.txtFirstMonth);
        this.m = (TextView) inflate.findViewById(R.id.txtSecondMonth);
        this.n = (TextView) inflate.findViewById(R.id.txtThirdMonth);
        this.o = (TextView) inflate.findViewById(R.id.txtFourthMonth);
        this.p = (TextView) inflate.findViewById(R.id.txtFifthMonth);
        this.q = (TextView) inflate.findViewById(R.id.txtSixthMonth);
        this.r = (TextView) inflate.findViewById(R.id.txtNoData);
        this.s = (RecyclerView) inflate.findViewById(R.id.rvPaymentsHistory);
        this.x = (LinearLayout) inflate.findViewById(R.id.lnrTitles);
        this.l.setTag(0);
        this.m.setTag(1);
        this.n.setTag(2);
        this.o.setTag(3);
        this.p.setTag(4);
        this.q.setTag(5);
        this.l.setOnClickListener(this.e);
        this.m.setOnClickListener(this.e);
        this.n.setOnClickListener(this.e);
        this.o.setOnClickListener(this.e);
        this.p.setOnClickListener(this.e);
        this.q.setOnClickListener(this.e);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        this.t = activity;
        dch dchVar = new dch(activity, this, this);
        this.u = dchVar;
        dchVar.d = new ArrayList<>();
        dchVar.e = new ArrayList<>();
        dchVar.g = dchVar.b.getResources().getStringArray(R.array.months_names_array);
        dchVar.f = new ArrayList<>(Arrays.asList(dchVar.g));
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i = calendar.get(2);
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = i - i2;
            if (i3 >= 0) {
                dchVar.d.add(0, dchVar.f.get(i3));
                dchVar.e.add(0, Boolean.FALSE);
            } else {
                dchVar.d.add(0, dchVar.f.get(i3 + 12));
                dchVar.e.add(0, Boolean.TRUE);
            }
        }
        this.v = this.u.d;
        this.w = this.u.e;
        this.l.setText(this.v.get(0));
        this.m.setText(this.v.get(1));
        this.n.setText(this.v.get(2));
        this.o.setText(this.v.get(3));
        this.p.setText(this.v.get(4));
        this.q.setText(this.v.get(5));
        a(5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (i == 0) {
            this.l.setTypeface(this.c);
            this.l.setTextColor(getResources().getColor(R.color.white));
            this.l.setBackgroundDrawable(getResources().getDrawable(R.drawable.tabs_border_color_purple));
        } else {
            this.l.setTypeface(this.d);
            this.l.setTextColor(getResources().getColor(R.color.secondary_txt_color));
            this.l.setBackgroundDrawable(getResources().getDrawable(R.drawable.stroke_gray_border));
        }
        if (i == 1) {
            this.m.setTypeface(this.c);
            this.m.setTextColor(getResources().getColor(R.color.white));
            this.m.setBackgroundDrawable(getResources().getDrawable(R.drawable.tabs_border_color_purple));
        } else {
            this.m.setTypeface(this.d);
            this.m.setTextColor(getResources().getColor(R.color.secondary_txt_color));
            this.m.setBackgroundDrawable(getResources().getDrawable(R.drawable.stroke_gray_border));
        }
        if (i == 2) {
            this.n.setTypeface(this.c);
            this.n.setTextColor(getResources().getColor(R.color.white));
            this.n.setBackgroundDrawable(getResources().getDrawable(R.drawable.tabs_border_color_purple));
        } else {
            this.n.setTypeface(this.d);
            this.n.setTextColor(getResources().getColor(R.color.secondary_txt_color));
            this.n.setBackgroundDrawable(getResources().getDrawable(R.drawable.stroke_gray_border));
        }
        if (i == 3) {
            this.o.setTypeface(this.c);
            this.o.setTextColor(getResources().getColor(R.color.white));
            this.o.setBackgroundDrawable(getResources().getDrawable(R.drawable.tabs_border_color_purple));
        } else {
            this.o.setTypeface(this.d);
            this.o.setTextColor(getResources().getColor(R.color.secondary_txt_color));
            this.o.setBackgroundDrawable(getResources().getDrawable(R.drawable.stroke_gray_border));
        }
        if (i == 4) {
            this.p.setTypeface(this.c);
            this.p.setTextColor(getResources().getColor(R.color.white));
            this.p.setBackgroundDrawable(getResources().getDrawable(R.drawable.tabs_border_color_purple));
        } else {
            this.p.setTypeface(this.d);
            this.p.setTextColor(getResources().getColor(R.color.secondary_txt_color));
            this.p.setBackgroundDrawable(getResources().getDrawable(R.drawable.stroke_gray_border));
        }
        if (i == 5) {
            this.q.setTypeface(this.c);
            this.q.setTextColor(getResources().getColor(R.color.white));
            this.q.setBackgroundDrawable(getResources().getDrawable(R.drawable.tabs_border_color_purple));
        } else {
            this.q.setTypeface(this.d);
            this.q.setTextColor(getResources().getColor(R.color.secondary_txt_color));
            this.q.setBackgroundDrawable(getResources().getDrawable(R.drawable.stroke_gray_border));
        }
        try {
            this.a = i;
            this.u.a(i);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.dci
    public final void a(boolean z) {
        if (z) {
            djg djgVar = this.b;
            Context context = this.t;
            djgVar.a(context, context.getString(R.string.loading));
            return;
        }
        this.b.a();
    }

    @Override // defpackage.dci
    public final void a(List<PaymentHistoryPostPaidResponseBody> list) {
        if (list.size() > 0) {
            dcg dcgVar = new dcg(this.t, list);
            this.s.setLayoutManager(new LinearLayoutManager(this.t));
            this.s.setHasFixedSize(false);
            this.s.setAdapter(dcgVar);
            this.s.setVisibility(0);
            this.r.setVisibility(8);
            this.x.setVisibility(0);
            return;
        }
        this.s.setAdapter(null);
        this.s.setVisibility(8);
        this.r.setVisibility(0);
        this.x.setVisibility(8);
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this.t, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        try {
            this.u.a(this.a);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
