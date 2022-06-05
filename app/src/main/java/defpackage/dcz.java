package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.preferrednumber.AddNewPreferredNumberConfirmActivity;
import com.ucare.we.preferrednumber.ConfirmDeletePreferredNumberActivity;
import defpackage.dcy;
import java.util.ArrayList;
import javax.inject.Inject;

/* renamed from: dcz  reason: default package */
/* loaded from: classes2.dex */
public class dcz extends dab implements ddb, dju {
    @Inject
    djg a;
    @Inject
    dhn b;
    Activity d;
    private RecyclerView f;
    private ArrayList<String> g;
    private dcy h;
    private Button i;
    private dda j;
    private TextView k;
    private TextView l;
    private LinearLayout m;
    private LinearLayout n;
    private FrameLayout o;
    private String p;
    View.OnClickListener c = new View.OnClickListener() { // from class: dcz.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dcz.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(dcz.this.b.f.getFNF_SUBSCRIBENOW_LINK())));
        }
    };
    View.OnClickListener e = new View.OnClickListener() { // from class: dcz.2
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(dcz.this.getContext(), AddNewPreferredNumberConfirmActivity.class);
            intent.putExtra("FMC_SELECTED_MSISDN", dcz.this.p);
            dcz.this.startActivity(intent);
        }
    };

    public static dcz a(String str) {
        dcz dczVar = new dcz();
        Bundle bundle = new Bundle();
        bundle.putString("FMC_SELECTED_MSISDN", str);
        dczVar.setArguments(bundle);
        return dczVar;
    }

    @Override // defpackage.dab, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d = getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_prefered_number, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.rv_prefered_number);
        this.f = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        this.i = (Button) inflate.findViewById(R.id.btn_add_new_number);
        this.m = (LinearLayout) inflate.findViewById(R.id.linear_layout);
        this.o = (FrameLayout) inflate.findViewById(R.id.fl_add_account);
        this.j = new dda(getContext(), this, this);
        this.k = (TextView) inflate.findViewById(R.id.preferedHeader);
        this.n = (LinearLayout) inflate.findViewById(R.id.lnrNotSubscribed);
        TextView textView = (TextView) inflate.findViewById(R.id.txtHyperLink);
        this.l = textView;
        textView.setPaintFlags(textView.getPaintFlags() | 8);
        this.g = new ArrayList<>();
        this.p = getArguments().getString("FMC_SELECTED_MSISDN");
        ArrayList<String> arrayList = new ArrayList<>();
        this.g = arrayList;
        a(arrayList);
        this.i.setOnClickListener(this.e);
        this.l.setOnClickListener(this.c);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.j.a(this.p);
    }

    @Override // defpackage.ddb
    public final void a(ArrayList<String> arrayList) {
        if (arrayList.size() == 0) {
            this.k.setText(this.d.getString(R.string.no_preferred));
            this.f.setVisibility(8);
            return;
        }
        this.k.setText(getActivity().getString(R.string.here_s_your_prefered_numbers));
        this.f.setVisibility(0);
        this.g = arrayList;
        dcy dcyVar = new dcy(getContext(), this.g);
        this.h = dcyVar;
        this.f.setAdapter(dcyVar);
        this.h.a = new dcy.a() { // from class: dcz.3
            @Override // defpackage.dcy.a
            public final void a(int i) {
                Intent intent = new Intent(dcz.this.getContext(), ConfirmDeletePreferredNumberActivity.class);
                intent.putExtra("MOBILE_NUMBER", (String) dcz.this.g.get(i));
                intent.putExtra("MOBILE_NUMBER_POSITION", i);
                dcz.this.startActivity(intent);
            }
        };
    }

    @Override // defpackage.ddb
    public final void a() {
        this.j.b(this.p);
        this.m.setVisibility(0);
        this.o.setVisibility(0);
        this.n.setVisibility(8);
    }

    @Override // defpackage.ddb
    public final void b() {
        this.m.setVisibility(8);
        this.o.setVisibility(8);
        this.n.setVisibility(0);
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(getContext(), this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        if (i == 1) {
            this.j.b(this.p);
        } else if (i != 2) {
        } else {
            this.j.a(this.p);
        }
    }

    @Override // defpackage.ddb
    public final void a(boolean z) {
        if (z) {
            this.a.a(getActivity(), getString(R.string.loading));
        } else {
            this.a.a();
        }
    }
}
