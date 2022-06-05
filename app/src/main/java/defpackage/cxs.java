package defpackage;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.BalanceTransferHistoryModel.BalanceTransferHistoryResponse;
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

/* renamed from: cxs  reason: default package */
/* loaded from: classes2.dex */
public final class cxs {
    @Inject
    djx a;
    Context b;
    cxt c;
    ArrayList<String> d;
    ArrayList<Boolean> e;
    ArrayList<String> f;
    String[] g;
    dju h;
    private au.b<JSONObject> i = new au.b<JSONObject>() { // from class: cxs.1
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            cxs.this.c.a(false);
            BalanceTransferHistoryResponse balanceTransferHistoryResponse = (BalanceTransferHistoryResponse) new Gson().a(jSONObject.toString(), (Class<Object>) BalanceTransferHistoryResponse.class);
            if (balanceTransferHistoryResponse != null && balanceTransferHistoryResponse.header != null && balanceTransferHistoryResponse.header.responseCode.equals("0")) {
                if (balanceTransferHistoryResponse.body == null) {
                    return;
                }
                cxs.this.c.a(balanceTransferHistoryResponse.body);
            } else if (balanceTransferHistoryResponse == null || balanceTransferHistoryResponse.header == null || !balanceTransferHistoryResponse.header.responseCode.equals("1200")) {
            } else {
                cxs.this.h.b(1);
            }
        }
    };
    private au.a j = new au.a() { // from class: cxs.2
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            cxs.this.c.a(false);
            UnNavigateResponseActivity.a(cxs.this.b, cxs.this.b.getString(R.string.check_network_connection), cxs.this.b.getString(R.string.please_try_again), true);
        }
    };

    public cxs(Context context, cxt cxtVar, dju djuVar) {
        this.b = context;
        this.c = cxtVar;
        this.h = djuVar;
    }

    public final void a(String str, int i) throws JSONException {
        this.c.a(true);
        djl.a(this.b).a(str, b(i, this.e.get(i).booleanValue()), a(i, this.e.get(i).booleanValue()), this.i, this.j);
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
        int i3 = Calendar.getInstance().get(2) - 2;
        if (z) {
            i2--;
            i3 += 12;
        }
        return i2 + "-" + (i + i3 + 1) + "-1";
    }
}
