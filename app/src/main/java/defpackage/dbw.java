package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.PostPaidBalanceResponse;
import com.ucare.we.paybillpaymentmethod.HomeCollectionActivity;
import com.ucare.we.paybillpostpaid.PayBillPostPaidActivity;
import com.ucare.we.paybillpostpaidvoucher.VoucherPayBillPostPaidActivity;
import javax.inject.Inject;
import net.sqlcipher.database.SQLiteDatabase;
import org.json.JSONException;

/* renamed from: dbw  reason: default package */
/* loaded from: classes2.dex */
public class dbw extends dab implements dby, dbz, dju {
    boolean a = false;
    boolean b = false;
    String c;
    @Inject
    dhp d;
    private RecyclerView e;
    private dbx f;
    private TextView g;
    private LinearLayout h;
    private dbv i;
    private Context j;

    public static dbw a(Bundle bundle) {
        dbw dbwVar = new dbw();
        dbwVar.setArguments(bundle);
        return dbwVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.payment_method_fragment, viewGroup, false);
        this.e = (RecyclerView) inflate.findViewById(R.id.rvPaymentMethods);
        this.g = (TextView) inflate.findViewById(R.id.txtOutStandingAmount);
        this.h = (LinearLayout) inflate.findViewById(R.id.llOutstandingContainer);
        this.c = getArguments().getString("targetNumber");
        this.a = getArguments().getBoolean("CURRENT_NUMBER_FLAG", false);
        this.b = getArguments().getBoolean("IS_CURRENT", false);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        int[] iArr;
        String[] strArr;
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        this.j = activity;
        if (this.b) {
            iArr = new int[]{R.drawable.credit_card_icon, R.drawable.recharge_card_icon, R.drawable.home_collection_icon};
            strArr = new String[]{activity.getString(R.string.credit_card), this.j.getString(R.string.recharge_card), this.j.getString(R.string.home_collection)};
        } else {
            iArr = new int[]{R.drawable.credit_card_icon, R.drawable.recharge_card_icon};
            strArr = new String[]{activity.getString(R.string.credit_card), this.j.getString(R.string.recharge_card)};
        }
        this.f = new dbx(this.j, this, this);
        this.i = new dbv(this.j, iArr, strArr, this);
        this.e.setLayoutManager(new LinearLayoutManager(this.j));
        this.e.setAdapter(this.i);
        this.e.setNestedScrollingEnabled(false);
        try {
            this.f.a();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.dby
    public final void a(PostPaidBalanceResponse postPaidBalanceResponse) {
        TextView textView = this.g;
        textView.setText(String.valueOf(postPaidBalanceResponse.body.outstandingAmount) + " " + this.j.getString(R.string.egp));
        this.h.setVisibility(this.d.m().booleanValue() ? 0 : 8);
    }

    @Override // defpackage.dbz
    public final void a(int i) {
        if (!this.b) {
            if (i == 0) {
                Intent intent = new Intent(this.j, PayBillPostPaidActivity.class);
                intent.putExtra("targetNumber", this.c);
                intent.putExtra("CURRENT_NUMBER_FLAG", this.a);
                startActivity(intent);
            } else if (i != 1) {
                if (i != 2) {
                    return;
                }
                a(ly.k(), "com.TE.WEWallet");
            } else {
                Intent intent2 = new Intent(this.j, VoucherPayBillPostPaidActivity.class);
                intent2.putExtra("targetNumber", this.c);
                intent2.putExtra("CURRENT_NUMBER_FLAG", this.a);
                startActivity(intent2);
            }
        } else if (i == 0) {
            Intent intent3 = new Intent(this.j, PayBillPostPaidActivity.class);
            intent3.putExtra("targetNumber", this.c);
            intent3.putExtra("CURRENT_NUMBER_FLAG", this.a);
            startActivity(intent3);
        } else if (i == 1) {
            Intent intent4 = new Intent(this.j, VoucherPayBillPostPaidActivity.class);
            intent4.putExtra("targetNumber", this.c);
            intent4.putExtra("CURRENT_NUMBER_FLAG", this.a);
            startActivity(intent4);
        } else if (i != 2) {
            if (i != 3) {
                return;
            }
            a(ly.k(), "com.TE.WEWallet");
        } else {
            Intent intent5 = new Intent(this.j, HomeCollectionActivity.class);
            intent5.putExtra("targetNumber", this.c);
            intent5.putExtra("CURRENT_NUMBER_FLAG", this.a);
            startActivity(intent5);
        }
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this.j, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        try {
            this.f.a();
        } catch (JSONException e) {
            e.printStackTrace();
        }
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
