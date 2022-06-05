package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.ErrorHandlerActivity;
import com.ucare.we.R;
import com.ucare.we.model.CreditCardInitResponseBody;
import com.ucare.we.model.PaymentHistoryResponseBody;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;

/* renamed from: dgd  reason: default package */
/* loaded from: classes2.dex */
public class dgd extends dab implements dhz {
    @Inject
    dia a;
    @Inject
    djw b;
    @Inject
    djg c;
    @Inject
    djx d;
    LinearLayout e;
    TextView f;
    private RecyclerView g;
    private cxb h;

    @Override // defpackage.dhz
    public final void a() {
    }

    @Override // defpackage.dhz
    public final void a(CreditCardInitResponseBody creditCardInitResponseBody) {
    }

    @Override // defpackage.dhz
    public final void b() {
    }

    @Override // defpackage.dhz
    public final void b(int i, String str) {
    }

    @Override // defpackage.dhz
    public final void c(int i, String str) {
    }

    @Override // defpackage.dhz
    public final void d(int i, String str) {
    }

    public static dgd a(int i, boolean z) {
        dgd dgdVar = new dgd();
        Bundle bundle = new Bundle();
        bundle.putInt("monthIndex", i);
        bundle.putBoolean("isPrevious", z);
        dgdVar.setArguments(bundle);
        return dgdVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_payment_history, viewGroup, false);
        int i = getArguments().getInt("monthIndex", 0);
        boolean z = getArguments().getBoolean("isPrevious", false);
        this.e = (LinearLayout) inflate.findViewById(R.id.ll_header);
        this.f = (TextView) inflate.findViewById(R.id.tv_no_data);
        this.a.a(c(i, z), b(i, z));
        this.a.a(this);
        this.c.a(getActivity(), getString(R.string.loading));
        new StringBuilder().append(i);
        new StringBuilder().append(z);
        this.g = (RecyclerView) inflate.findViewById(R.id.rv_payment_history);
        this.g.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
        this.g.setHasFixedSize(true);
        cxb cxbVar = new cxb(getActivity());
        this.h = cxbVar;
        this.g.setAdapter(cxbVar);
        return inflate;
    }

    private static String b(int i, boolean z) {
        String c = c(i, z);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        Date date = new Date();
        try {
            date = simpleDateFormat.parse(c);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(2, 1);
        return simpleDateFormat.format(calendar.getTime());
    }

    private static String c(int i, boolean z) {
        int i2 = Calendar.getInstance().get(1);
        int i3 = Calendar.getInstance().get(2) - 5;
        if (z) {
            i2--;
            i3 += 12;
        }
        return i2 + "-" + (i + i3 + 1) + "-1";
    }

    @Override // defpackage.dhz
    public final void a(List<PaymentHistoryResponseBody> list) {
        if (list.size() > 0) {
            this.e.setVisibility(0);
            this.f.setVisibility(8);
        } else {
            this.e.setVisibility(8);
            this.f.setVisibility(0);
        }
        this.c.a();
        cxb cxbVar = this.h;
        cxbVar.a = new ArrayList<>(list);
        cxbVar.notifyDataSetChanged();
    }

    @Override // defpackage.dhz
    public final void a(int i, String str) {
        this.c.a();
        this.d.a(getActivity(), str, i, ErrorHandlerActivity.class);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        this.a.a(this);
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        this.a.b(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }
}
