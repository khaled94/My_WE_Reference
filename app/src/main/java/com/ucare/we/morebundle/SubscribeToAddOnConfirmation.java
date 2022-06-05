package com.ucare.we.morebundle;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.MoreBundleModel.Offer;
import com.ucare.we.model.MoreBundleModel.ResponseUnsubscribeFromMoreBundle;
import com.ucare.we.paybillpostpaidvoucher.ResponseActivity;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import defpackage.au;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u00109\u001a\u00020:H\u0002J\b\u0010;\u001a\u00020:H\u0002J\u0012\u0010<\u001a\u00020:2\b\u0010=\u001a\u0004\u0018\u00010>H\u0014J\u0018\u0010?\u001a\u00020:2\u0006\u0010@\u001a\u00020\u001e2\u0006\u0010A\u001a\u00020\u0005H\u0016J\b\u0010B\u001a\u00020:H\u0002J\b\u0010C\u001a\u00020:H\u0002J\u0010\u0010D\u001a\u00020:2\u0006\u0010A\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\"0!j\b\u0012\u0004\u0012\u00020\"`#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0012\"\u0004\b*\u0010\u0014R\u001e\u0010+\u001a\u00020,8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u000e\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00103\u001a\b\u0012\u0004\u0012\u00020504X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000207X\u0082.¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"Lcom/ucare/we/morebundle/SubscribeToAddOnConfirmation;", "Lcom/ucare/we/injection/TransparentActivity;", "Lcom/ucare/we/util/onSessionExpired;", "()V", "SUBSCRIBE", "", "authenticationProvider", "Lcom/ucare/we/provider/auth/AuthenticationProvider;", "getAuthenticationProvider", "()Lcom/ucare/we/provider/auth/AuthenticationProvider;", "setAuthenticationProvider", "(Lcom/ucare/we/provider/auth/AuthenticationProvider;)V", "btnCancel", "Landroid/widget/Button;", "btnOK", "cancelClickListener", "Landroid/view/View$OnClickListener;", "getCancelClickListener", "()Landroid/view/View$OnClickListener;", "setCancelClickListener", "(Landroid/view/View$OnClickListener;)V", "configurationProvider", "Lcom/ucare/we/provider/ConfigurationProvider;", "getConfigurationProvider", "()Lcom/ucare/we/provider/ConfigurationProvider;", "setConfigurationProvider", "(Lcom/ucare/we/provider/ConfigurationProvider;)V", "context", "Landroid/content/Context;", "id", "", "name", "offerArrayList", "Ljava/util/ArrayList;", "Lcom/ucare/we/model/MoreBundleModel/Offer;", "Lkotlin/collections/ArrayList;", "getOfferArrayList", "()Ljava/util/ArrayList;", "setOfferArrayList", "(Ljava/util/ArrayList;)V", "okClickListener", "getOkClickListener", "setOkClickListener", "progressHandler", "Lcom/ucare/we/util/ProgressHandler;", "getProgressHandler", "()Lcom/ucare/we/util/ProgressHandler;", "setProgressHandler", "(Lcom/ucare/we/util/ProgressHandler;)V", "subscribeToMoreBundleErrorListner", "Lcom/android/volley/Response$ErrorListener;", "subscribeToMoreBundleSuccessListener", "Lcom/android/volley/Response$Listener;", "Lorg/json/JSONObject;", "txtMessage", "Landroid/widget/TextView;", "txtMessageDetails", "getExtras", "", "initViews", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onLoginResponse", "jsonResponse", "which", "setListeners", "setViews", "startLogin", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SubscribeToAddOnConfirmation extends dae implements dju {
    @Inject
    public djg a;
    @Inject
    public dhn b;
    @Inject
    public dio c;
    private TextView e;
    private TextView f;
    private Button g;
    private Button h;
    private String i;
    private String j;
    private Context k;
    private ArrayList<Offer> d = new ArrayList<>();
    private final int l = 1;
    private final au.b<JSONObject> m = new au.b() { // from class: com.ucare.we.morebundle.-$$Lambda$SubscribeToAddOnConfirmation$gdF9B-oKnFLa5cHOcc4rzq36K0g
        @Override // defpackage.au.b
        public final void onResponse(Object obj) {
            SubscribeToAddOnConfirmation.m24lambda$gdF9BoKnFLa5cHOcc4rzq36K0g(SubscribeToAddOnConfirmation.this, (JSONObject) obj);
        }
    };
    private final au.a n = new au.a() { // from class: com.ucare.we.morebundle.-$$Lambda$SubscribeToAddOnConfirmation$j63N5ApnxiuGfZnwfPkcPm5sY70
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            SubscribeToAddOnConfirmation.lambda$j63N5ApnxiuGfZnwfPkcPm5sY70(SubscribeToAddOnConfirmation.this, volleyError);
        }
    };
    private View.OnClickListener o = new View.OnClickListener() { // from class: com.ucare.we.morebundle.-$$Lambda$SubscribeToAddOnConfirmation$pios343LKR6r0DmZIh_7N3zpsAw
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SubscribeToAddOnConfirmation.lambda$pios343LKR6r0DmZIh_7N3zpsAw(SubscribeToAddOnConfirmation.this, view);
        }
    };
    private View.OnClickListener p = new View.OnClickListener() { // from class: com.ucare.we.morebundle.-$$Lambda$SubscribeToAddOnConfirmation$XbETDsNbUuSLCDRMrpvRkXWdiMg
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SubscribeToAddOnConfirmation.lambda$XbETDsNbUuSLCDRMrpvRkXWdiMg(SubscribeToAddOnConfirmation.this, view);
        }
    };

    public static /* synthetic */ void lambda$XbETDsNbUuSLCDRMrpvRkXWdiMg(SubscribeToAddOnConfirmation subscribeToAddOnConfirmation, View view) {
        b(subscribeToAddOnConfirmation, view);
    }

    /* renamed from: lambda$gdF9B-oKnFLa5cHOcc4rzq36K0g */
    public static /* synthetic */ void m24lambda$gdF9BoKnFLa5cHOcc4rzq36K0g(SubscribeToAddOnConfirmation subscribeToAddOnConfirmation, JSONObject jSONObject) {
        a(subscribeToAddOnConfirmation, jSONObject);
    }

    public static /* synthetic */ void lambda$j63N5ApnxiuGfZnwfPkcPm5sY70(SubscribeToAddOnConfirmation subscribeToAddOnConfirmation, VolleyError volleyError) {
        a(subscribeToAddOnConfirmation, volleyError);
    }

    public static /* synthetic */ void lambda$pios343LKR6r0DmZIh_7N3zpsAw(SubscribeToAddOnConfirmation subscribeToAddOnConfirmation, View view) {
        a(subscribeToAddOnConfirmation, view);
    }

    private djg a() {
        djg djgVar = this.a;
        if (djgVar != null) {
            return djgVar;
        }
        dqc.a("progressHandler");
        throw null;
    }

    private dhn b() {
        dhn dhnVar = this.b;
        if (dhnVar != null) {
            return dhnVar;
        }
        dqc.a("configurationProvider");
        throw null;
    }

    public static final void a(SubscribeToAddOnConfirmation subscribeToAddOnConfirmation, JSONObject jSONObject) {
        String str;
        dqc.d(subscribeToAddOnConfirmation, "this$0");
        subscribeToAddOnConfirmation.a().a();
        ResponseUnsubscribeFromMoreBundle responseUnsubscribeFromMoreBundle = (ResponseUnsubscribeFromMoreBundle) new Gson().a(jSONObject.toString(), (Class<Object>) ResponseUnsubscribeFromMoreBundle.class);
        String str2 = null;
        if (dqc.a((Object) responseUnsubscribeFromMoreBundle.getHeader().getResponseCode(), (Object) "0")) {
            Context context = subscribeToAddOnConfirmation.k;
            if (context != null) {
                str2 = context.getString(R.string.subscribe_to_service);
            }
            dqc.a(str2, (Object) subscribeToAddOnConfirmation.j);
            ResponseActivity.a(subscribeToAddOnConfirmation.k, subscribeToAddOnConfirmation.getString(R.string.successful), responseUnsubscribeFromMoreBundle.getHeader().getResponseMessage(), false);
        } else if (dqc.a((Object) responseUnsubscribeFromMoreBundle.getHeader().getResponseCode(), (Object) "1200")) {
            subscribeToAddOnConfirmation.b(subscribeToAddOnConfirmation.l);
            return;
        } else if (dqc.a((Object) responseUnsubscribeFromMoreBundle.getHeader().getResponseCode(), (Object) "9001") || dqc.a((Object) responseUnsubscribeFromMoreBundle.getHeader().getResponseCode(), (Object) "8001")) {
            if (dsg.b(subscribeToAddOnConfirmation.n().v(), "postpaid")) {
                if (dqc.a((Object) subscribeToAddOnConfirmation.n().k(), (Object) "ar")) {
                    str = subscribeToAddOnConfirmation.b().f.getMaximumBillLimitAr();
                } else {
                    str = subscribeToAddOnConfirmation.b().f.getMaximumBillLimitEn();
                }
                dqc.b(str, "{\n                if (repository.currentLanguage == \"ar\") {\n                    configurationProvider.configurationFile.maximumBillLimitAr\n                } else {\n                    configurationProvider.configurationFile.maximumBillLimitEn\n                }\n            }");
            } else {
                str = responseUnsubscribeFromMoreBundle.getHeader().getResponseMessage();
                dqc.b(str, "{\n                responseUnsubscribeFromMoreBundle.header.responseMessage\n            }");
            }
            Intent intent = new Intent(subscribeToAddOnConfirmation.k, UnNavigateResponseActivity.class);
            Context context2 = subscribeToAddOnConfirmation.k;
            if (context2 != null) {
                str2 = context2.getString(R.string.please_try_again);
            }
            intent.putExtra("success_msg_details", str2);
            intent.putExtra("success_msg", str);
            intent.putExtra("isError", true);
            intent.putExtra("showRecharge", true);
            Context context3 = subscribeToAddOnConfirmation.k;
            if (context3 != null) {
                context3.startActivity(intent);
            }
            subscribeToAddOnConfirmation.finish();
            return;
        } else {
            String responseMessage = responseUnsubscribeFromMoreBundle.getHeader().getResponseMessage();
            Intent intent2 = new Intent(subscribeToAddOnConfirmation.k, UnNavigateResponseActivity.class);
            Context context4 = subscribeToAddOnConfirmation.k;
            if (context4 != null) {
                str2 = context4.getString(R.string.please_try_again);
            }
            intent2.putExtra("success_msg_details", str2);
            intent2.putExtra("success_msg", responseMessage);
            intent2.putExtra("isError", true);
            Context context5 = subscribeToAddOnConfirmation.k;
            if (context5 != null) {
                context5.startActivity(intent2);
            }
        }
        subscribeToAddOnConfirmation.finish();
    }

    public static final void a(SubscribeToAddOnConfirmation subscribeToAddOnConfirmation, VolleyError volleyError) {
        dqc.d(subscribeToAddOnConfirmation, "this$0");
        subscribeToAddOnConfirmation.a().a();
        ResponseActivity.a(subscribeToAddOnConfirmation.k, subscribeToAddOnConfirmation.getString(R.string.something_went_wrong), subscribeToAddOnConfirmation.getString(R.string.please_try_again), true);
    }

    public static final void a(SubscribeToAddOnConfirmation subscribeToAddOnConfirmation, View view) {
        dqc.d(subscribeToAddOnConfirmation, "this$0");
        subscribeToAddOnConfirmation.finish();
    }

    public static final void b(SubscribeToAddOnConfirmation subscribeToAddOnConfirmation, View view) {
        dqc.d(subscribeToAddOnConfirmation, "this$0");
        Button button = subscribeToAddOnConfirmation.g;
        if (button == null) {
            dqc.a("btnOK");
            throw null;
        }
        button.setClickable(false);
        subscribeToAddOnConfirmation.a().a(subscribeToAddOnConfirmation, subscribeToAddOnConfirmation.getString(R.string.loading));
        ArrayList<Offer> arrayList = new ArrayList<>();
        if (arrayList.size() == 0) {
            arrayList.add(new Offer(subscribeToAddOnConfirmation.i, "add"));
        }
        try {
            djl.a(subscribeToAddOnConfirmation).a(arrayList, subscribeToAddOnConfirmation.m, subscribeToAddOnConfirmation.n);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_subscribe_to_add_on_confirmation);
        this.k = this;
        if (getIntent().getExtras() != null) {
            Bundle extras = getIntent().getExtras();
            this.i = extras == null ? null : extras.getString("id");
            Bundle extras2 = getIntent().getExtras();
            this.j = extras2 == null ? null : extras2.getString("name");
        }
        View findViewById = findViewById(R.id.txtMessage);
        dqc.b(findViewById, "findViewById(R.id.txtMessage)");
        this.e = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.txtMessageDetails);
        dqc.b(findViewById2, "findViewById(R.id.txtMessageDetails)");
        this.f = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.btn_ok);
        dqc.b(findViewById3, "findViewById(R.id.btn_ok)");
        this.g = (Button) findViewById3;
        View findViewById4 = findViewById(R.id.btn_cancel);
        dqc.b(findViewById4, "findViewById(R.id.btn_cancel)");
        this.h = (Button) findViewById4;
        TextView textView = this.e;
        if (textView == null) {
            dqc.a("txtMessage");
            throw null;
        }
        textView.setText(getString(R.string.subscribe_to_bundle));
        TextView textView2 = this.f;
        if (textView2 == null) {
            dqc.a("txtMessageDetails");
            throw null;
        }
        textView2.setText(getString(R.string.subscribe_to) + ((Object) this.j) + getString(R.string.quest));
        Button button = this.g;
        if (button == null) {
            dqc.a("btnOK");
            throw null;
        }
        button.setOnClickListener(this.p);
        Button button2 = this.h;
        if (button2 != null) {
            button2.setOnClickListener(this.o);
        } else {
            dqc.a("btnCancel");
            throw null;
        }
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this.k, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        dqc.d(str, "jsonResponse");
        ArrayList<Offer> arrayList = new ArrayList<>();
        arrayList.add(new Offer(this.i, "add"));
        try {
            djl.a(this).a(arrayList, this.m, this.n);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
