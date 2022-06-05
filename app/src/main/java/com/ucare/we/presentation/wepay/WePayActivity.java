package com.ucare.we.presentation.wepay;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.ucare.we.R;
import com.ucare.we.model.remote.faqlist.FaqListResponseBody;
import com.ucare.we.view.AppCompatTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import javax.inject.Inject;
import net.sqlcipher.database.SQLiteDatabase;

/* loaded from: classes2.dex */
public class WePayActivity extends czy implements dhi {
    ExpandableListView a;
    ExpandableListAdapter b;
    @Inject
    dhj c;
    @Inject
    djw d;
    private ImageView f;
    private ImageView g;
    private AppCompatTextView h;
    private LinearLayoutCompat i;
    private AppCompatTextView j;
    private AppBarLayout k;
    private RecyclerView l;
    private final ArrayList<FaqListResponseBody> m = new ArrayList<>();
    private final ArrayList<FaqListResponseBody> n = new ArrayList<>();
    View.OnClickListener e = new View.OnClickListener() { // from class: com.ucare.we.presentation.wepay.-$$Lambda$WePayActivity$O5g9dWV_zn2vccChpNb6mxEDxHw
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            WePayActivity.lambda$O5g9dWV_zn2vccChpNb6mxEDxHw(WePayActivity.this, view);
        }
    };

    /* renamed from: lambda$FOu0waNSf2T13TD-N93ovWVBO9I */
    public static /* synthetic */ boolean m70lambda$FOu0waNSf2T13TDN93ovWVBO9I(WePayActivity wePayActivity, ExpandableListView expandableListView, View view, int i, long j) {
        return wePayActivity.a(expandableListView, view, i, j);
    }

    public static /* synthetic */ void lambda$H5dpHE4XvKxk9exZyiutEZhhQtY(WePayActivity wePayActivity, View view) {
        wePayActivity.a(view);
    }

    public static /* synthetic */ void lambda$O5g9dWV_zn2vccChpNb6mxEDxHw(WePayActivity wePayActivity, View view) {
        wePayActivity.b(view);
    }

    /* renamed from: lambda$V-O2tgtO2zwMi0m7iocAz3GRj1Q */
    public static /* synthetic */ void m71lambda$VO2tgtO2zwMi0m7iocAz3GRj1Q(WePayActivity wePayActivity, View view) {
        wePayActivity.c(view);
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_we_pay);
        a(getString(R.string.wePay), false, false);
        this.f = (ImageView) findViewById(R.id.imgBackButton);
        this.g = (ImageView) findViewById(R.id.tvGetItOnGooglePlay);
        this.j = (AppCompatTextView) findViewById(R.id.tvAboutTitle);
        this.h = (AppCompatTextView) findViewById(R.id.tvAboutContent);
        this.k = (AppBarLayout) findViewById(R.id.app_bar);
        this.l = (RecyclerView) findViewById(R.id.rvFaq);
        this.i = (LinearLayoutCompat) findViewById(R.id.container);
        this.a = (ExpandableListView) findViewById(R.id.expandableListView);
        this.f.setOnClickListener(this.e);
        this.c.a();
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.wepay.-$$Lambda$WePayActivity$V-O2tgtO2zwMi0m7iocAz3GRj1Q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WePayActivity.m71lambda$VO2tgtO2zwMi0m7iocAz3GRj1Q(WePayActivity.this, view);
            }
        });
        if (diw.a(this)) {
            Configuration configuration = getResources().getConfiguration();
            configuration.locale = new Locale(this.d.k());
            DisplayMetrics displayMetrics = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            this.g.setImageDrawable(new Resources(getAssets(), displayMetrics, configuration).getDrawable(R.drawable.ic_get_on_google_play));
            return;
        }
        this.g.setImageResource(R.drawable.ic_get_on_app_gallery);
    }

    public /* synthetic */ void c(View view) {
        a(getApplicationContext(), "com.TE.WEWallet");
    }

    public /* synthetic */ boolean a(ExpandableListView expandableListView, View view, int i, long j) {
        a(expandableListView, i);
        this.k.setExpanded(true);
        return false;
    }

    private static void a(ExpandableListView expandableListView, int i) {
        ExpandableListAdapter expandableListAdapter = expandableListView.getExpandableListAdapter();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(expandableListView.getWidth(), BasicMeasure.EXACTLY);
        int i2 = 0;
        for (int i3 = 0; i3 < expandableListAdapter.getGroupCount(); i3++) {
            View groupView = expandableListAdapter.getGroupView(i3, false, null, expandableListView);
            groupView.measure(makeMeasureSpec, 0);
            i2 += groupView.getMeasuredHeight();
            if ((expandableListView.isGroupExpanded(i3) && i3 != i) || (!expandableListView.isGroupExpanded(i3) && i3 == i)) {
                int i4 = i2;
                for (int i5 = 0; i5 < expandableListAdapter.getChildrenCount(i3); i5++) {
                    View childView = expandableListAdapter.getChildView(i3, i5, false, null, expandableListView);
                    childView.measure(makeMeasureSpec, 0);
                    i4 += childView.getMeasuredHeight();
                }
                i2 = i4;
            }
        }
        ViewGroup.LayoutParams layoutParams = expandableListView.getLayoutParams();
        int dividerHeight = i2 + (expandableListView.getDividerHeight() * (expandableListAdapter.getGroupCount() - 1));
        if (dividerHeight < 10) {
            dividerHeight = ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION;
        }
        layoutParams.height = dividerHeight;
        expandableListView.setLayoutParams(layoutParams);
        expandableListView.requestLayout();
    }

    public /* synthetic */ void b(View view) {
        finish();
    }

    @Override // defpackage.dhi
    public final void a(ArrayList<FaqListResponseBody> arrayList) {
        int i;
        Iterator<FaqListResponseBody> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            FaqListResponseBody next = it.next();
            if (next.getType().equals("H1")) {
                this.m.add(next);
            } else {
                this.n.add(next);
            }
            this.i.setVisibility(0);
        }
        this.j.setText(this.m.get(0).getLocalizedTitle());
        this.h.setText(this.m.get(0).getLocalizedContent());
        dhh dhhVar = new dhh(this, this.n);
        this.b = dhhVar;
        this.a.setAdapter(dhhVar);
        a(this.a, -1);
        this.a.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() { // from class: com.ucare.we.presentation.wepay.-$$Lambda$WePayActivity$FOu0waNSf2T13TD-N93ovWVBO9I
            @Override // android.widget.ExpandableListView.OnGroupClickListener
            public final boolean onGroupClick(ExpandableListView expandableListView, View view, int i2, long j) {
                return WePayActivity.m70lambda$FOu0waNSf2T13TDN93ovWVBO9I(WePayActivity.this, expandableListView, view, i2, j);
            }
        });
        for (i = 0; i < this.n.size(); i++) {
            this.n.get(i).getLocalizedContent();
        }
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.wepay.-$$Lambda$WePayActivity$H5dpHE4XvKxk9exZyiutEZhhQtY
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WePayActivity.lambda$H5dpHE4XvKxk9exZyiutEZhhQtY(WePayActivity.this, view);
            }
        });
    }

    public /* synthetic */ void a(View view) {
        a(getApplicationContext(), "com.TE.WEWallet");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.c.a(this);
    }

    private static void a(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        } else {
            launchIntentForPackage = new Intent("android.intent.action.VIEW");
            launchIntentForPackage.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            launchIntentForPackage.setData(Uri.parse("market://details?id=".concat(String.valueOf(str))));
        }
        context.startActivity(launchIntentForPackage);
    }
}
