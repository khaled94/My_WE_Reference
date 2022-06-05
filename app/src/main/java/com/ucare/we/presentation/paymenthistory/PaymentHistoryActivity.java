package com.ucare.we.presentation.paymenthistory;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.ucare.we.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class PaymentHistoryActivity extends czy implements View.OnClickListener {
    String[] a;
    ArrayList<String> b;
    ArrayList<String> c = new ArrayList<>();
    ArrayList<Boolean> d = new ArrayList<>();
    TextView e;
    TextView f;
    TextView g;
    TextView h;
    TextView i;
    TextView j;
    TextView k;
    Button l;
    @Inject
    djw m;
    Typeface n;
    Typeface o;

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_payment_history);
        a(getString(R.string.balance_details), false, false);
        findViewById(R.id.imgBackButton).setOnClickListener(this);
        this.n = ResourcesCompat.getFont(this, R.font.montserrat_bold);
        this.o = ResourcesCompat.getFont(this, R.font.montserrat_medium);
        this.a = getResources().getStringArray(R.array.months_names_array);
        this.b = new ArrayList<>(Arrays.asList(this.a));
        this.l = (Button) findViewById(R.id.btn_current_number);
        this.k = (TextView) findViewById(R.id.txtTitle);
        this.l.setText(this.m.m());
        this.k.setText(getString(R.string.balance_details));
        this.e = (TextView) findViewById(R.id.tv_first_month);
        this.f = (TextView) findViewById(R.id.tv_second_month);
        this.g = (TextView) findViewById(R.id.tv_third_month);
        this.h = (TextView) findViewById(R.id.tv_fourth_month);
        this.i = (TextView) findViewById(R.id.tv_fifth_month);
        this.j = (TextView) findViewById(R.id.tv_sixth_month);
        this.e.setOnClickListener(this);
        this.f.setOnClickListener(this);
        this.g.setOnClickListener(this);
        this.h.setOnClickListener(this);
        this.i.setOnClickListener(this);
        this.j.setOnClickListener(this);
        a();
        this.e.setText(this.c.get(0));
        this.f.setText(this.c.get(1));
        this.g.setText(this.c.get(2));
        this.h.setText(this.c.get(3));
        this.i.setText(this.c.get(4));
        this.j.setText(this.c.get(5));
        a(dgd.a(5, this.d.get(5).booleanValue()));
        a(5);
    }

    private void a(Fragment fragment) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.content, fragment);
        beginTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        beginTransaction.commit();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.imgBackButton) {
            finish();
        } else if (id == R.id.iv_close) {
            finish();
        } else if (id == R.id.tv_first_month) {
            a(dgd.a(0, this.d.get(0).booleanValue()));
            a(0);
        } else if (id == R.id.tv_second_month) {
            a(dgd.a(1, this.d.get(1).booleanValue()));
            a(1);
        } else if (id == R.id.tv_third_month) {
            a(dgd.a(2, this.d.get(2).booleanValue()));
            a(2);
        } else if (id == R.id.tv_fourth_month) {
            a(dgd.a(3, this.d.get(3).booleanValue()));
            a(3);
        } else if (id == R.id.tv_fifth_month) {
            a(dgd.a(4, this.d.get(4).booleanValue()));
            a(4);
        } else if (id != R.id.tv_sixth_month) {
        } else {
            a(dgd.a(5, this.d.get(5).booleanValue()));
            a(5);
        }
    }

    private void a(int i) {
        if (i == 0) {
            this.e.setTextColor(getResources().getColor(R.color.white));
            this.e.setTypeface(this.n);
            this.e.setBackgroundDrawable(getResources().getDrawable(R.drawable.tabs_border_color_purple));
        } else {
            this.e.setTextColor(getResources().getColor(R.color.secondary_txt_color));
            this.e.setTypeface(this.o);
            this.e.setBackgroundDrawable(getResources().getDrawable(R.drawable.stroke_gray_border));
        }
        if (i == 1) {
            this.f.setTextColor(getResources().getColor(R.color.white));
            this.f.setTypeface(this.n);
            this.f.setBackgroundDrawable(getResources().getDrawable(R.drawable.tabs_border_color_purple));
        } else {
            this.f.setTypeface(this.o);
            this.f.setTextColor(getResources().getColor(R.color.secondary_txt_color));
            this.f.setBackgroundDrawable(getResources().getDrawable(R.drawable.stroke_gray_border));
        }
        if (i == 2) {
            this.g.setTextColor(getResources().getColor(R.color.white));
            this.g.setTypeface(this.n);
            this.g.setBackgroundDrawable(getResources().getDrawable(R.drawable.tabs_border_color_purple));
        } else {
            this.g.setTextColor(getResources().getColor(R.color.secondary_txt_color));
            this.g.setTypeface(this.o);
            this.g.setBackgroundDrawable(getResources().getDrawable(R.drawable.stroke_gray_border));
        }
        if (i == 3) {
            this.h.setTextColor(getResources().getColor(R.color.white));
            this.h.setTypeface(this.n);
            this.h.setBackgroundDrawable(getResources().getDrawable(R.drawable.tabs_border_color_purple));
        } else {
            this.h.setTextColor(getResources().getColor(R.color.secondary_txt_color));
            this.h.setTypeface(this.o);
            this.h.setBackgroundDrawable(getResources().getDrawable(R.drawable.stroke_gray_border));
        }
        if (i == 4) {
            this.i.setTextColor(getResources().getColor(R.color.white));
            this.i.setTypeface(this.n);
            this.i.setBackgroundDrawable(getResources().getDrawable(R.drawable.tabs_border_color_purple));
        } else {
            this.i.setTextColor(getResources().getColor(R.color.secondary_txt_color));
            this.i.setTypeface(this.o);
            this.i.setBackgroundDrawable(getResources().getDrawable(R.drawable.stroke_gray_border));
        }
        if (i == 5) {
            this.j.setTextColor(getResources().getColor(R.color.white));
            this.j.setTypeface(this.n);
            this.j.setBackgroundDrawable(getResources().getDrawable(R.drawable.tabs_border_color_purple));
            return;
        }
        this.j.setTextColor(getResources().getColor(R.color.secondary_txt_color));
        this.j.setTypeface(this.o);
        this.j.setBackgroundDrawable(getResources().getDrawable(R.drawable.stroke_gray_border));
    }

    private void a() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i = calendar.get(2);
        new StringBuilder().append(i);
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = i - i2;
            if (i3 >= 0) {
                this.c.add(0, this.b.get(i3));
                this.d.add(0, Boolean.FALSE);
            } else {
                this.c.add(0, this.b.get(i3 + 12));
                this.d.add(0, Boolean.TRUE);
            }
        }
    }
}
