package com.ucare.we.presentation.family.groupConsumptionSharedDetails;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.family.FamilyConsumptionLimitMembersList;
import com.ucare.we.model.usagedetails.DetailedLineUsageItem;
import com.ucare.we.model.usagedetails.HomePageResponseBody;
import com.ucare.we.presentation.offers.UnNavigateResponseActivity;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class GroupDetailsActivity extends czy implements dei, dhl {
    public RecyclerView a;
    TextView b;
    @Inject
    dfp c;
    @Inject
    djg d;
    @Inject
    dhm e;
    @Inject
    djw f;
    ArrayList<FamilyConsumptionLimitMembersList> g;
    private ImageView h;
    private TextView i;
    private RecyclerView j;

    /* renamed from: lambda$Z0rTSMn__EDboYPPK-S-TV9xFf4 */
    public static /* synthetic */ void m42lambda$Z0rTSMn__EDboYPPKSTV9xFf4(GroupDetailsActivity groupDetailsActivity, View view) {
        groupDetailsActivity.a(view);
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_group_details);
        a(getString(R.string.group_details), false, false);
        this.e.a(this);
        this.a = (RecyclerView) findViewById(R.id.rvPlans);
        this.i = (TextView) findViewById(R.id.txtTitle);
        this.h = (ImageView) findViewById(R.id.imgBackButton);
        this.j = (RecyclerView) findViewById(R.id.rvPlans);
        this.b = (TextView) findViewById(R.id.tvNoConsumptionAvailable);
        this.i.setText(R.string.group_details);
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.family.groupConsumptionSharedDetails.-$$Lambda$GroupDetailsActivity$Z0rTSMn__EDboYPPK-S-TV9xFf4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupDetailsActivity.m42lambda$Z0rTSMn__EDboYPPKSTV9xFf4(GroupDetailsActivity.this, view);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.d.a(this, getString(R.string.loading));
        if (this.f.P().isOwner()) {
            this.e.b();
            return;
        }
        this.c.d();
        this.c.a(this);
    }

    public /* synthetic */ void a(View view) {
        finish();
    }

    @Override // defpackage.dei
    public final void a(ArrayList<FamilyConsumptionLimitMembersList> arrayList) {
        this.d.a();
        this.g = new ArrayList<>();
        this.g = arrayList;
        cww cwwVar = new cww(this, arrayList);
        this.a.setHasFixedSize(true);
        this.a.setAdapter(cwwVar);
        a(Boolean.valueOf(!this.g.isEmpty()));
    }

    @Override // defpackage.dei
    public final void a() {
        this.d.a();
        a(Boolean.FALSE);
    }

    private void a(Boolean bool) {
        int i = 0;
        this.a.setVisibility(bool.booleanValue() ? 0 : 8);
        TextView textView = this.b;
        if (bool.booleanValue()) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    @Override // defpackage.dhl
    public final void a(HomePageResponseBody homePageResponseBody) {
        this.d.a();
        List<DetailedLineUsageItem> detailedLineUsageList = homePageResponseBody.getDetailedLineUsageList();
        this.j.setAdapter(new cwv(this, detailedLineUsageList));
        Boolean valueOf = Boolean.valueOf(!detailedLineUsageList.isEmpty());
        int i = 0;
        this.j.setVisibility(valueOf.booleanValue() ? 0 : 8);
        TextView textView = this.b;
        if (valueOf.booleanValue()) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    @Override // defpackage.dhl
    public final void a(int i, String str) {
        this.d.a();
        UnNavigateResponseActivity.a(this, str, getString(R.string.please_try_again));
    }
}
