package com.ucare.we;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import com.skyfishjy.library.RippleBackground;
import java.util.Iterator;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class SliderCoachMarkActivity extends czy {
    @Inject
    dhn a;

    public static /* synthetic */ void lambda$Bi2dnWooA_XZ6GabXICtzeYCH7U(SliderCoachMarkActivity sliderCoachMarkActivity) {
        sliderCoachMarkActivity.a();
    }

    public static /* synthetic */ void lambda$UQtG4hC4IlNpJFxGD9H8GDoKjvg(SliderCoachMarkActivity sliderCoachMarkActivity) {
        sliderCoachMarkActivity.b();
    }

    public static /* synthetic */ void lambda$WLYM9rjfydUPq8ktdz8aaBFv_JA(SliderCoachMarkActivity sliderCoachMarkActivity, View view) {
        sliderCoachMarkActivity.b(view);
    }

    public static /* synthetic */ void lambda$d9tkS9dLcssMJ831cEJ3ePwNv2U(SliderCoachMarkActivity sliderCoachMarkActivity, View view) {
        sliderCoachMarkActivity.a(view);
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT < 26) {
            setRequestedOrientation(1);
        }
        setContentView(R.layout.slider_coach_mark_activity);
        RippleBackground rippleBackground = (RippleBackground) findViewById(R.id.coach_mark_main_image);
        if (!rippleBackground.a) {
            Iterator<RippleBackground.a> it = rippleBackground.c.iterator();
            while (it.hasNext()) {
                it.next().setVisibility(0);
            }
            rippleBackground.b.start();
            rippleBackground.a = true;
        }
        Button button = (Button) findViewById(R.id.Got_it_btn);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.-$$Lambda$SliderCoachMarkActivity$WLYM9rjfydUPq8ktdz8aaBFv_JA
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SliderCoachMarkActivity.lambda$WLYM9rjfydUPq8ktdz8aaBFv_JA(SliderCoachMarkActivity.this, view);
            }
        });
        getApplicationContext();
        djv.a().edit().putBoolean("SHOW_SLIDER_COACH_MARK", false).apply();
        getApplicationContext();
        if (djv.a().getBoolean("SHOW_SLIDER_COACH_MARK", true)) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.-$$Lambda$SliderCoachMarkActivity$d9tkS9dLcssMJ831cEJ3ePwNv2U
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SliderCoachMarkActivity.lambda$d9tkS9dLcssMJ831cEJ3ePwNv2U(SliderCoachMarkActivity.this, view);
                }
            });
        }
        Handler handler = new Handler();
        Long l = 0L;
        try {
            if (this.a.f.getUsageDetailsHintPeriod() != null) {
                l = Long.valueOf(this.a.f.getUsageDetailsHintPeriod());
            }
            handler.postDelayed(new Runnable() { // from class: com.ucare.we.-$$Lambda$SliderCoachMarkActivity$UQtG4hC4IlNpJFxGD9H8GDoKjvg
                @Override // java.lang.Runnable
                public final void run() {
                    SliderCoachMarkActivity.lambda$UQtG4hC4IlNpJFxGD9H8GDoKjvg(SliderCoachMarkActivity.this);
                }
            }, l.longValue() * 1000);
        } catch (Exception unused) {
            Long l2 = 100000L;
            handler.postDelayed(new Runnable() { // from class: com.ucare.we.-$$Lambda$SliderCoachMarkActivity$Bi2dnWooA_XZ6GabXICtzeYCH7U
                @Override // java.lang.Runnable
                public final void run() {
                    SliderCoachMarkActivity.lambda$Bi2dnWooA_XZ6GabXICtzeYCH7U(SliderCoachMarkActivity.this);
                }
            }, l2.longValue() * 1000);
        }
    }

    public /* synthetic */ void b(View view) {
        finish();
    }

    public /* synthetic */ void a(View view) {
        finish();
    }

    public /* synthetic */ void b() {
        finish();
    }

    public /* synthetic */ void a() {
        finish();
    }
}
