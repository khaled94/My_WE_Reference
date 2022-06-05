package com.ucare.we;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.ucare.we.adapters.TicketsListAdapter;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class TicketsListActivity extends czy {
    View.OnClickListener a = new View.OnClickListener() { // from class: com.ucare.we.-$$Lambda$TicketsListActivity$ARqaajNaR6-1fxQ1pzVf0tL4FV4
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            TicketsListActivity.m10lambda$ARqaajNaR61fxQ1pzVf0tL4FV4(TicketsListActivity.this, view);
        }
    };
    TicketsListAdapter b;
    @BindView(R.id.imgBackButton)
    ImageView imgBackButton;
    @BindView(R.id.ticket_list)
    RecyclerView ticketList;
    @BindView(R.id.tvNoData)
    TextView tvNoData;
    @BindView(R.id.txtTitle)
    TextView txtTitle;

    /* renamed from: lambda$ARqaajNaR6-1fxQ1pzVf0tL4FV4 */
    public static /* synthetic */ void m10lambda$ARqaajNaR61fxQ1pzVf0tL4FV4(TicketsListActivity ticketsListActivity, View view) {
        ticketsListActivity.a(view);
    }

    public /* synthetic */ void a(View view) {
        finish();
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ticket_list_activity);
        ButterKnife.bind(this);
        a(getString(R.string.query_ticket), false, false);
        this.imgBackButton.setOnClickListener(this.a);
        this.txtTitle.setText(getString(R.string.query_ticket));
        ArrayList parcelableArrayList = getIntent().getExtras().getParcelableArrayList("TICKETS_LIST");
        if (parcelableArrayList.size() > 0) {
            this.tvNoData.setVisibility(8);
            this.ticketList.setVisibility(0);
            this.b = new TicketsListAdapter(this, parcelableArrayList);
            this.ticketList.setLayoutManager(new LinearLayoutManager(this));
            this.ticketList.setAdapter(this.b);
            return;
        }
        this.tvNoData.setVisibility(0);
        this.ticketList.setVisibility(8);
    }
}
