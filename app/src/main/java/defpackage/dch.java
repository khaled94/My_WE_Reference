package defpackage;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.PaymentHistoryPostPaidModels.PaymentHistoryPostPaidResponse;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import defpackage.au;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dch  reason: default package */
/* loaded from: classes2.dex */
public final class dch {
    @Inject
    djx a;
    Context b;
    dci c;
    ArrayList<String> d;
    ArrayList<Boolean> e;
    ArrayList<String> f;
    String[] g;
    dju h;
    private au.b<JSONObject> i = new au.b<JSONObject>() { // from class: dch.1
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dch.this.c.a(false);
            PaymentHistoryPostPaidResponse paymentHistoryPostPaidResponse = (PaymentHistoryPostPaidResponse) new Gson().a(jSONObject.toString(), (Class<Object>) PaymentHistoryPostPaidResponse.class);
            if (paymentHistoryPostPaidResponse != null && paymentHistoryPostPaidResponse.header != null && paymentHistoryPostPaidResponse.header.responseCode.equals("0")) {
                if (paymentHistoryPostPaidResponse.body == null) {
                    return;
                }
                dch.this.c.a(paymentHistoryPostPaidResponse.body);
            } else if (paymentHistoryPostPaidResponse == null || paymentHistoryPostPaidResponse.header == null || !paymentHistoryPostPaidResponse.header.responseCode.equals("1200")) {
            } else {
                dch.this.h.b(1);
            }
        }
    };
    private au.a j = new au.a() { // from class: dch.2
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dch.this.c.a(false);
            UnNavigateResponseActivity.a(dch.this.b, dch.this.b.getString(R.string.check_network_connection), dch.this.b.getString(R.string.please_try_again), true);
        }
    };

    public dch(Context context, dci dciVar, dju djuVar) {
        this.b = context;
        this.c = dciVar;
        this.h = djuVar;
    }

    public final void a(int i) throws JSONException {
        this.c.a(true);
        djl.a(this.b).b(b(i, this.e.get(i).booleanValue()), a(i, this.e.get(i).booleanValue()), this.i, this.j);
    }

    private static String a(int i, boolean z) {
        String b = b(i, z);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        Date date = new Date();
        try {
            date = simpleDateFormat.parse(b);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(2, 1);
        return simpleDateFormat.format(calendar.getTime());
    }

    private static String b(int i, boolean z) {
        int i2 = Calendar.getInstance().get(1);
        int i3 = Calendar.getInstance().get(2) - 5;
        if (z) {
            i2--;
            i3 += 12;
        }
        return i2 + "-" + (i + i3 + 1) + "-1";
    }
}
