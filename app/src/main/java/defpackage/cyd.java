package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.billsummary.ConfirmDownloadingBillSummaryActivity;
import com.ucare.we.model.BillSummaryModel.ResponseBillSummaryBody;
import com.ucare.we.model.BillSummaryModel.ResponseFinalizeBillSummary;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import defpackage.au;
import defpackage.cyc;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Objects;
import javax.inject.Inject;
import org.json.JSONException;

/* renamed from: cyd */
/* loaded from: classes2.dex */
public class cyd extends dab implements cyf, dju {
    @Inject
    djg a;
    @Inject
    djw b;
    String c;
    byte[] d;
    private RecyclerView f;
    private cyc g;
    private Context h;
    private cye i;
    private TextView j;
    private final int e = 3;
    private au.b<byte[]> k = new au.b<byte[]>() { // from class: cyd.1
        {
            cyd.this = this;
        }

        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(byte[] bArr) {
            byte[] bArr2 = bArr;
            cyd.this.a.a();
            new String(bArr2);
            cyd.this.d = bArr2;
            if (cyd.this.d()) {
                if (Build.VERSION.SDK_INT >= 30) {
                    new cyh(cyd.this.getActivity()).a("bill_summary.pdf", cyd.this.d);
                    return;
                } else {
                    cyd.this.c();
                    return;
                }
            }
            cyd.this.b();
        }
    };
    private au.a l = new au.a() { // from class: cyd.2
        {
            cyd.this = this;
        }

        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            cyd.this.a.a();
            if (volleyError.a != null && volleyError.a.a != 404) {
                if (volleyError.a.a == 500) {
                    cyd.this.b(3);
                    return;
                } else if (volleyError.a.a != 400 && volleyError.a.a != 502) {
                    return;
                }
            }
            UnNavigateResponseActivity.a(cyd.this.h, cyd.this.getString(R.string.file_not_found), cyd.this.getString(R.string.please_try_again), true);
        }
    };

    public static /* synthetic */ void lambda$DYzOuumAXbUReg6vUyCHqNgL3js(cyd cydVar, ArrayList arrayList, int i) {
        cydVar.a(arrayList, i);
    }

    public static cyd a() {
        Bundle bundle = new Bundle();
        cyd cydVar = new cyd();
        cydVar.setArguments(bundle);
        return cydVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.bill_summary_fragment, viewGroup, false);
        this.f = (RecyclerView) inflate.findViewById(R.id.rvBillSummary);
        this.j = (TextView) inflate.findViewById(R.id.txtNoSummary);
        b();
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        this.h = activity;
        cye cyeVar = new cye(activity, this, this);
        this.i = cyeVar;
        try {
            cyeVar.a();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.cyf
    public final void a(final ArrayList<ResponseBillSummaryBody> arrayList) {
        if (arrayList.size() == 0) {
            this.j.setVisibility(0);
            this.f.setVisibility(8);
            this.j.setText(getString(R.string.no_bill_summary));
            return;
        }
        this.j.setVisibility(8);
        this.f.setVisibility(0);
        this.g = new cyc(this.h, arrayList);
        this.f.setLayoutManager(new LinearLayoutManager(this.h));
        this.f.setHasFixedSize(false);
        this.f.setAdapter(this.g);
        this.g.a = new cyc.a() { // from class: -$$Lambda$cyd$DYzOuumAXbUReg6vUyCHqNgL3js
            @Override // defpackage.cyc.a
            public final void onItemClick(int i) {
                cyd.lambda$DYzOuumAXbUReg6vUyCHqNgL3js(cyd.this, arrayList, i);
            }
        };
    }

    public /* synthetic */ void a(ArrayList arrayList, int i) {
        if (d()) {
            if (((ResponseBillSummaryBody) arrayList.get(i)).getInvoiceNo() == null) {
                return;
            }
            String D = this.b.D();
            this.c = D;
            if (!(D != null && !D.isEmpty() && !D.equals(""))) {
                Intent intent = new Intent(this.h, ConfirmDownloadingBillSummaryActivity.class);
                intent.putExtra("invoiceNo", ((ResponseBillSummaryBody) arrayList.get(i)).getInvoiceNo());
                startActivity(intent);
                return;
            }
            ResponseFinalizeBillSummary responseFinalizeBillSummary = (ResponseFinalizeBillSummary) new Gson().a(this.c, (Class<Object>) ResponseFinalizeBillSummary.class);
            String invoiceNo = responseFinalizeBillSummary.getBody().get(i).getInvoiceNo();
            for (int i2 = 0; i2 < responseFinalizeBillSummary.getBody().size(); i2++) {
                if (responseFinalizeBillSummary.getBody().get(i2).getInvoiceNo().equals(invoiceNo)) {
                    if (responseFinalizeBillSummary.getBody().get(i2).getInvoiceURL() != null) {
                        responseFinalizeBillSummary.getBody().get(i2).getInvoiceURL();
                        String invoiceURL = responseFinalizeBillSummary.getBody().get(i2).getInvoiceURL();
                        try {
                            this.a.a(this.h, this.h.getString(R.string.downloading));
                            djl.a(this.h).b(invoiceURL, this.k, this.l);
                            return;
                        } catch (JSONException e) {
                            e.printStackTrace();
                            return;
                        }
                    }
                    UnNavigateResponseActivity.a(this.h, getString(R.string.error), getString(R.string.unavailable_link), true);
                    return;
                }
            }
            return;
        }
        b();
    }

    @Override // defpackage.cyf
    public final void a(boolean z) {
        if (z) {
            djg djgVar = this.a;
            Context context = this.h;
            djgVar.a(context, context.getString(R.string.loading));
            return;
        }
        this.a.a();
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this.h, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        try {
            this.i.a();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void b() {
        ActivityCompat.requestPermissions(getActivity(), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 1) {
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            if (Build.VERSION.SDK_INT >= 30) {
                new cyh((Activity) Objects.requireNonNull(getActivity())).a("bill_summary.pdf", this.d);
                return;
            } else {
                c();
                return;
            }
        }
        Toast.makeText(this.h, "Permission denied to write on your External storage", 0).show();
    }

    public boolean d() {
        return ContextCompat.checkSelfPermission((Context) Objects.requireNonNull(getActivity()), "android.permission.READ_EXTERNAL_STORAGE") == 0 && ContextCompat.checkSelfPermission((Context) Objects.requireNonNull(getActivity()), "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public final void c() {
        try {
            if (this.d == null) {
                return;
            }
            String file = Environment.getExternalStorageDirectory().toString();
            File file2 = new File(file + "/saved_bills_summary");
            file2.mkdirs();
            File file3 = new File(file2, "bill_summary.pdf");
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                fileOutputStream.write(this.d);
                fileOutputStream.close();
                this.a.a();
                a(file3);
            } catch (Exception unused) {
                this.a.a();
                UnNavigateResponseActivity.a(this.h, getString(R.string.file_not_found), getString(R.string.please_try_again), true);
            }
        } catch (Exception unused2) {
            this.a.a();
            UnNavigateResponseActivity.a(this.h, getString(R.string.file_not_found), getString(R.string.please_try_again), true);
        }
    }

    private void a(File file) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setFlags(1);
            intent.setDataAndType(FileProvider.getUriForFile(getActivity(), "com.ucare.we.provider", file), "application/pdf");
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Context context = this.h;
            Toast.makeText(context, "File Location:" + file.toString(), 1).show();
        }
    }
}
