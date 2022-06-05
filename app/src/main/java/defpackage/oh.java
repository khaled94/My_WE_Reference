package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.FacebookException;
import defpackage.mu;
import defpackage.mv;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J.\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J \u0010\u0016\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/facebook/appevents/internal/AutomaticAnalyticsLogger;", "", "()V", "APP_EVENTS_IF_AUTO_LOG_SUBS", "", "TAG", "internalAppEventsLogger", "Lcom/facebook/appevents/InternalAppEventsLogger;", "getPurchaseLoggingParameters", "Lcom/facebook/appevents/internal/AutomaticAnalyticsLogger$PurchaseLoggingParameters;", "purchase", "skuDetails", "extraParameter", "", "isImplicitPurchaseLoggingEnabled", "", "logActivateAppEvent", "", "logActivityTimeSpentEvent", "activityName", "timeSpentInSeconds", "", "logPurchase", "isSubscription", "PurchaseLoggingParameters", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: oh  reason: default package */
/* loaded from: classes2.dex */
public final class oh {
    public static final oh a = new oh();
    private static final String b = oh.class.getCanonicalName();
    private static final na c = new na(ly.k());

    private oh() {
    }

    public static final void a() {
        Context k = ly.k();
        String m = ly.m();
        boolean p = ly.p();
        qj.a((Object) k, "context");
        if (!p || !(k instanceof Application)) {
            return;
        }
        mu.a aVar = mu.b;
        Application application = (Application) k;
        dqc.d(application, "application");
        mv.a aVar2 = mv.b;
        dqc.d(application, "application");
        if (!ly.i()) {
            throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
        }
        mp.a();
        nd.a();
        if (m == null) {
            m = ly.m();
        }
        ly.a(application, m);
        oe.a(application, m);
    }

    public static final void a(String str, long j) {
        Context k = ly.k();
        String m = ly.m();
        qj.a((Object) k, "context");
        pv a2 = pw.a(m, false);
        if (a2 == null || !a2.d || j <= 0) {
            return;
        }
        na naVar = new na(k);
        Bundle bundle = new Bundle(1);
        bundle.putCharSequence("fb_aa_time_spent_view_name", str);
        naVar.a("fb_aa_time_spent_on_view", j, bundle);
    }

    public static final void a(String str, String str2, boolean z) {
        a a2;
        dqc.d(str, "purchase");
        dqc.d(str2, "skuDetails");
        if (b() && (a2 = a(str, str2, new HashMap())) != null) {
            boolean z2 = false;
            if (z && pu.a("app_events_if_auto_log_subs", ly.m(), false)) {
                z2 = true;
            }
            if (z2) {
                String str3 = ny.a.a(str2) ? "StartTrial" : "Subscribe";
                na naVar = c;
                BigDecimal bigDecimal = a2.a;
                Currency currency = a2.b;
                Bundle bundle = a2.c;
                if (!ly.p()) {
                    return;
                }
                mv mvVar = naVar.a;
                if (qx.a(mvVar)) {
                    return;
                }
                try {
                    if (bigDecimal == null || currency == null) {
                        String str4 = mv.a;
                        qi.a();
                        return;
                    }
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    Bundle bundle2 = bundle;
                    bundle2.putString("fb_currency", currency.getCurrencyCode());
                    mvVar.a(str3, Double.valueOf(bigDecimal.doubleValue()), bundle2, true, oe.b());
                    return;
                } catch (Throwable th) {
                    qx.a(th, mvVar);
                    return;
                }
            }
            na naVar2 = c;
            BigDecimal bigDecimal2 = a2.a;
            Currency currency2 = a2.b;
            Bundle bundle3 = a2.c;
            if (!ly.p()) {
                return;
            }
            mv mvVar2 = naVar2.a;
            if (qx.a(mvVar2)) {
                return;
            }
            try {
                if (qx.a(mvVar2)) {
                    return;
                }
                if (bigDecimal2 == null) {
                    mv.a aVar = mv.b;
                    mv.a.a("purchaseAmount cannot be null");
                } else if (currency2 == null) {
                    mv.a aVar2 = mv.b;
                    mv.a.a("currency cannot be null");
                } else {
                    if (bundle3 == null) {
                        bundle3 = new Bundle();
                    }
                    Bundle bundle4 = bundle3;
                    bundle4.putString("fb_currency", currency2.getCurrencyCode());
                    mvVar2.a("fb_mobile_purchase", Double.valueOf(bigDecimal2.doubleValue()), bundle4, true, oe.b());
                    mv.a aVar3 = mv.b;
                    if (mv.a.a() == mu.b.b) {
                        return;
                    }
                    ms.a(mx.EAGER_FLUSHING_EVENT);
                }
            } catch (Throwable th2) {
                qx.a(th2, mvVar2);
            }
        }
    }

    public static final boolean b() {
        pv a2 = pw.a(ly.m());
        return a2 != null && ly.p() && a2.f;
    }

    private static a a(String str, String str2, Map<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            boolean z = true;
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_iap_product_id", jSONObject.getString("productId"));
            bundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
            bundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
            bundle.putCharSequence("fb_iap_package_name", jSONObject.optString("packageName"));
            bundle.putCharSequence("fb_iap_product_title", jSONObject2.optString("title"));
            bundle.putCharSequence("fb_iap_product_description", jSONObject2.optString("description"));
            String optString = jSONObject2.optString("type");
            bundle.putCharSequence("fb_iap_product_type", optString);
            if (dqc.a((Object) optString, (Object) "subs")) {
                bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                String optString2 = jSONObject2.optString("introductoryPriceCycles");
                dqc.b(optString2, "introductoryPriceCycles");
                if (optString2.length() != 0) {
                    z = false;
                }
                if (!z) {
                    bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                    bundle.putCharSequence("fb_intro_price_cycles", optString2);
                }
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                bundle.putCharSequence(entry.getKey(), entry.getValue());
            }
            BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("price_amount_micros") / 1000000.0d);
            Currency currency = Currency.getInstance(jSONObject2.getString("price_currency_code"));
            dqc.b(currency, "Currency.getInstance(sku…g(\"price_currency_code\"))");
            return new a(bigDecimal, currency, bundle);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/facebook/appevents/internal/AutomaticAnalyticsLogger$PurchaseLoggingParameters;", "", "purchaseAmount", "Ljava/math/BigDecimal;", "currency", "Ljava/util/Currency;", "param", "Landroid/os/Bundle;", "(Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;)V", "getCurrency", "()Ljava/util/Currency;", "setCurrency", "(Ljava/util/Currency;)V", "getParam", "()Landroid/os/Bundle;", "setParam", "(Landroid/os/Bundle;)V", "getPurchaseAmount", "()Ljava/math/BigDecimal;", "setPurchaseAmount", "(Ljava/math/BigDecimal;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: oh$a */
    /* loaded from: classes2.dex */
    public static final class a {
        BigDecimal a;
        Currency b;
        Bundle c;

        public a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
            dqc.d(bigDecimal, "purchaseAmount");
            dqc.d(currency, "currency");
            dqc.d(bundle, "param");
            this.a = bigDecimal;
            this.b = currency;
            this.c = bundle;
        }
    }
}
