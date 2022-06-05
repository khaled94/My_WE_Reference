package com.ucare.we;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.ucare.we.model.AreasModel.Area;
import com.ucare.we.model.CitiesModel.City;
import com.ucare.we.model.StoreResponseBody;
import com.ucare.we.presentation.search.SearchActivity;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class StoreLocatorActivity extends czy implements czn, czs {
    City b;
    Area c;
    public TextView g;
    private ImageView h;
    private ImageView i;
    View.OnClickListener a = new View.OnClickListener() { // from class: com.ucare.we.-$$Lambda$StoreLocatorActivity$M5O1vaag_XWFon2UoYFF4tERoGQ
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            StoreLocatorActivity.lambda$M5O1vaag_XWFon2UoYFF4tERoGQ(StoreLocatorActivity.this, view);
        }
    };
    boolean d = false;
    FragmentManager e = getSupportFragmentManager();
    View.OnClickListener f = new View.OnClickListener() { // from class: com.ucare.we.-$$Lambda$StoreLocatorActivity$A79qtOQu1bU994e72pSI8hzGL6s
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            StoreLocatorActivity.lambda$A79qtOQu1bU994e72pSI8hzGL6s(StoreLocatorActivity.this, view);
        }
    };
    private FragmentTransaction j = getSupportFragmentManager().beginTransaction();

    public static /* synthetic */ void lambda$A79qtOQu1bU994e72pSI8hzGL6s(StoreLocatorActivity storeLocatorActivity, View view) {
        storeLocatorActivity.a(view);
    }

    public static /* synthetic */ void lambda$M5O1vaag_XWFon2UoYFF4tERoGQ(StoreLocatorActivity storeLocatorActivity, View view) {
        storeLocatorActivity.b(view);
    }

    public /* synthetic */ void b(View view) {
        finish();
    }

    public /* synthetic */ void a(View view) {
        startActivity(new Intent(this, SearchActivity.class));
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.base_activity_store_locator);
        this.g = (TextView) findViewById(R.id.txtTitle);
        this.h = (ImageView) findViewById(R.id.imgBackButton);
        this.i = (ImageView) findViewById(R.id.imgSearchButton);
        this.h.setOnClickListener(this.a);
        this.i.setOnClickListener(this.f);
        getSupportFragmentManager().beginTransaction().replace(R.id.lnrLayoutContainer, czh.a(true)).commit();
        a();
    }

    public final void a() {
        this.g.setText(R.string.title_store_locator);
        a(getString(R.string.title_store_locator), false, false);
    }

    public final void b() {
        a(cyy.a(true), "Select_Location");
        this.g.setText(getString(R.string.choose_location));
        a(getString(R.string.choose_location), false, false);
    }

    private void a(Fragment fragment, String str) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        this.j = beginTransaction;
        beginTransaction.replace(R.id.lnrLayoutContainer, fragment, str);
        if (this.e.findFragmentByTag(str) == null) {
            this.j.addToBackStack(str);
        }
        this.j.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        this.j.commit();
    }

    public final void a(ArrayList<StoreResponseBody> arrayList) {
        a(cze.a(arrayList), "Locator_Result");
        this.g.setText(getString(R.string.title_store_locator));
        a(getString(R.string.title_store_locator), false, false);
    }

    public final void a(Fragment fragment) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        this.j = beginTransaction;
        beginTransaction.replace(R.id.lnrLayoutContainer, fragment);
        this.j.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        this.j.commit();
    }

    @Override // defpackage.czs
    public final City c() {
        return this.b;
    }

    @Override // defpackage.czs
    public final void a(City city) {
        this.b = city;
    }

    @Override // defpackage.czn
    public final Area d() {
        return this.c;
    }

    @Override // defpackage.czn
    public final void a(Area area) {
        this.c = area;
    }
}
