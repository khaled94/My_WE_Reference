package com.ucare.we;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.model.PlansAndBundlesResponseBody;
import defpackage.cxd;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class AddMoreBundlesActivity extends czy implements View.OnClickListener, cxd.b, dic {
    ImageView a;
    @Inject
    did b;
    @Inject
    djg c;
    @Inject
    djw d;
    @Inject
    djx e;
    PlansAndBundlesResponseBody f;
    private RecyclerView g;
    private cxd h;

    @Override // defpackage.dic
    public final void a_(int i, String str) {
    }

    @Override // defpackage.dic
    public final void b_(int i, String str) {
    }

    @Override // defpackage.dic
    public final void b_(String str) {
    }

    @Override // defpackage.dic
    public final void c(int i, String str) {
    }

    @Override // defpackage.dic
    public final void c_(String str) {
    }

    @Override // defpackage.dic
    public final void d(int i, String str) {
    }

    @Override // defpackage.dic
    public final void d(String str) {
    }

    @Override // defpackage.dic
    public final void d_(String str) {
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_add_more_bundles);
        a(getString(R.string.add_more_bundles), false, false);
        ImageView imageView = (ImageView) findViewById(R.id.iv_close);
        this.a = imageView;
        imageView.setOnClickListener(this);
        this.g = (RecyclerView) findViewById(R.id.rv_extra_bundles);
        this.g.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.g.setHasFixedSize(true);
        cxd cxdVar = new cxd(this);
        this.h = cxdVar;
        this.g.setAdapter(cxdVar);
        this.b.a(this);
        this.b.a();
        this.c.a(this, getString(R.string.loading));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.b.b(this);
        super.onDestroy();
    }

    @Override // defpackage.cxd.b
    public final void a(PlansAndBundlesResponseBody plansAndBundlesResponseBody) {
        this.f = plansAndBundlesResponseBody;
        if (this.d.z() < plansAndBundlesResponseBody.getPrice()) {
            this.e.a(this, getString(R.string.no_enough_balance_detials), 1, ErrorHandlerActivity.class);
            return;
        }
        Intent intent = new Intent(this, SubscribeToBundleActivity.class);
        intent.putExtra("bundleToBeSubscribed", plansAndBundlesResponseBody);
        startActivityForResult(intent, 111);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 111 && i2 == -1) {
            Intent intent2 = new Intent(this, ManageBundleActivity.class);
            intent2.putExtra("offerId", this.f.getOfferId());
            setResult(-1, intent2);
            finish();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.iv_close) {
            finish();
        }
    }

    @Override // defpackage.dic
    public final void a_(List<PlansAndBundlesResponseBody> list) {
        this.c.a();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getType() != null && list.get(i).getType().equalsIgnoreCase(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS) && !list.get(i).isAlreadySubscribed()) {
                arrayList.add(list.get(i));
            }
        }
        this.h.a(new ArrayList<>(arrayList));
    }

    @Override // defpackage.dic
    public final void o_() {
        this.c.a();
    }
}
