package com.ucare.we.presentation.family.offersAddons;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.ServerResponse;
import com.ucare.we.model.family.FamilyAvailableOffersAddonsList;
import com.ucare.we.model.local.family.OffersRequestArray;
import com.ucare.we.morebundle.FamilySubscribeToMoreBundleActivity;
import com.ucare.we.presentation.family.FamilySelectMoreBundleActivity;
import com.ucare.we.presentation.offers.UnNavigateResponseActivity;
import defpackage.dbg;
import java.io.Serializable;
import java.util.ArrayList;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class FamilyOffersAddonsActivity extends czy implements dfl, dfn {
    public RecyclerView a;
    ArrayList<OffersRequestArray> b;
    @Inject
    dfp c;
    dbg d;
    String e;
    @Inject
    djg f;
    private ImageView g;
    private TextView h;
    private RelativeLayout i;

    public static /* synthetic */ void lambda$NSHJOVM9hZtuop8BwupfLGawzyM(FamilyOffersAddonsActivity familyOffersAddonsActivity, View view) {
        familyOffersAddonsActivity.a(view);
    }

    public static /* synthetic */ void lambda$j1qPSA0Xg8JYAgpsZtfXcAVVP68(FamilyOffersAddonsActivity familyOffersAddonsActivity, ArrayList arrayList, int i) {
        familyOffersAddonsActivity.a(arrayList, i);
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_family_offer_addons);
        a(getString(R.string.familyAddSharedAddon), false, false);
        this.a = (RecyclerView) findViewById(R.id.rvAddons);
        this.i = (RelativeLayout) findViewById(R.id.Rly_noAddons);
        this.h = (TextView) findViewById(R.id.txtTitle);
        this.g = (ImageView) findViewById(R.id.imgBackButton);
        this.h.setText(R.string.familyAddSharedAddon);
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.family.offersAddons.-$$Lambda$FamilyOffersAddonsActivity$NSHJOVM9hZtuop8BwupfLGawzyM
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FamilyOffersAddonsActivity.lambda$NSHJOVM9hZtuop8BwupfLGawzyM(FamilyOffersAddonsActivity.this, view);
            }
        });
        this.f.a(this, getString(R.string.loading));
        this.c.c();
        this.c.a((dfn) this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    public /* synthetic */ void a(View view) {
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i == 102) {
                ArrayList<OffersRequestArray> arrayList = new ArrayList<>();
                this.b = arrayList;
                arrayList.add(new OffersRequestArray(this.e));
                this.c.a(this.b);
                this.c.a((dfl) this);
            }
            this.f.a(this, getString(R.string.loading));
        }
    }

    public /* synthetic */ void a(ArrayList arrayList, int i) {
        Intent intent;
        if (((FamilyAvailableOffersAddonsList) arrayList.get(i)).getChildGroups().size() > 0) {
            intent = new Intent(this, FamilySelectMoreBundleActivity.class);
            intent.putExtra("SUB_BUNDLES", (Serializable) arrayList.get(i));
            intent.putExtra("position", i);
        } else {
            intent = new Intent(this, FamilySubscribeToMoreBundleActivity.class);
            intent.putExtra("ExtrasList", ((FamilyAvailableOffersAddonsList) arrayList.get(i)).getAvailableAddOnOfferingList());
            if (this.w.f()) {
                intent.putExtra("title", ((FamilyAvailableOffersAddonsList) arrayList.get(i)).getGroupArName());
            } else {
                intent.putExtra("title", ((FamilyAvailableOffersAddonsList) arrayList.get(i)).getGroupEnName());
            }
        }
        startActivity(intent);
    }

    @Override // defpackage.dfn
    public final void a(String str) {
        this.f.a();
        UnNavigateResponseActivity.a(this, str, getString(R.string.please_try_again));
    }

    @Override // defpackage.dfl
    public final void a(ServerResponse serverResponse) {
        this.f.a();
        UnNavigateResponseActivity.b(this, getString(R.string.successful), serverResponse.getHeader().getResponseMessage());
    }

    @Override // defpackage.dfl
    public final void a(int i, String str) {
        this.f.a();
        UnNavigateResponseActivity.a(this, str, getString(R.string.please_try_again), i == 3259 || i == 3239 || i == 9001 || i == 8001, i);
    }

    @Override // defpackage.dfn
    public final void a(final ArrayList<FamilyAvailableOffersAddonsList> arrayList) {
        this.f.a();
        this.d = new dbg(this, arrayList);
        this.a.setLayoutManager(new LinearLayoutManager(this));
        this.a.setHasFixedSize(false);
        this.a.setAdapter(this.d);
        this.d.b = new dbg.a() { // from class: com.ucare.we.presentation.family.offersAddons.-$$Lambda$FamilyOffersAddonsActivity$j1qPSA0Xg8JYAgpsZtfXcAVVP68
            @Override // defpackage.dbg.a
            public final void onItemClick(int i) {
                FamilyOffersAddonsActivity.lambda$j1qPSA0Xg8JYAgpsZtfXcAVVP68(FamilyOffersAddonsActivity.this, arrayList, i);
            }
        };
    }
}
