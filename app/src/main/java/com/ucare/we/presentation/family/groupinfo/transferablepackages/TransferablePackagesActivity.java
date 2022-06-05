package com.ucare.we.presentation.family.groupinfo.transferablepackages;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.ServerRequest;
import com.ucare.we.model.ServerResponse;
import com.ucare.we.model.local.adjustbalance.AdjustBalanceRequest;
import com.ucare.we.model.local.transferablepackagesrequest.TransferablePackagesRequest;
import com.ucare.we.model.remote.transferpackage.TransferablePackages;
import com.ucare.we.model.remote.transferunits.DetailedLineUsage;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import com.ucare.we.presentation.genericconfirmation.GlobalConfirmationActivity;
import java.util.ArrayList;
import java.util.Arrays;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\"\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\u001a\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020!2\b\u0010'\u001a\u0004\u0018\u00010\nH\u0016J\u0016\u0010(\u001a\u00020\u001e2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*H\u0016J\u0012\u0010,\u001a\u00020\u001e2\b\u0010-\u001a\u0004\u0018\u00010.H\u0014J\b\u0010/\u001a\u00020\u001eH\u0014J\u001a\u00100\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020!2\b\u0010'\u001a\u0004\u0018\u00010\nH\u0016J&\u00101\u001a\u00020\u001e2\u001c\u0010)\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020302j\b\u0012\u0004\u0012\u000203`40*H\u0016J\b\u00105\u001a\u00020\u001eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/ucare/we/presentation/family/groupinfo/transferablepackages/TransferablePackagesActivity;", "Lcom/ucare/we/injection/BaseActivity;", "Lcom/ucare/we/presentation/family/groupinfo/transferablepackages/providers/TransferUnitsTransferablePackagesListener;", "Lcom/ucare/we/presentation/family/groupinfo/transferablepackages/providers/AdjustBalanceListener;", "()V", "imgBackButton", "Landroid/widget/ImageView;", "item", "Lcom/ucare/we/model/remote/transferunits/DetailedLineUsage;", "mappingCode", "", "progressHandler", "Lcom/ucare/we/util/ProgressHandler;", "getProgressHandler", "()Lcom/ucare/we/util/ProgressHandler;", "setProgressHandler", "(Lcom/ucare/we/util/ProgressHandler;)V", "rvTransferablePackage", "Landroidx/recyclerview/widget/RecyclerView;", "transferPackagesAdapter", "Lcom/ucare/we/presentation/family/groupinfo/transferablepackages/adapter/TransferPackagesAdapter;", "transferUnitsProvider", "Lcom/ucare/we/presentation/family/groupinfo/transferablepackages/providers/TransferablePackagesProvider;", "getTransferUnitsProvider", "()Lcom/ucare/we/presentation/family/groupinfo/transferablepackages/providers/TransferablePackagesProvider;", "setTransferUnitsProvider", "(Lcom/ucare/we/presentation/family/groupinfo/transferablepackages/providers/TransferablePackagesProvider;)V", "txtTitle", "Landroid/widget/TextView;", "initViews", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onAdjustBalanceListenerFailure", "failureReason", "failureMessage", "onAdjustBalanceListenerSuccess", "response", "Lcom/ucare/we/model/ServerResponse;", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onTransferablePackagesFailure", "onTransferablePackagesSuccess", "Ljava/util/ArrayList;", "Lcom/ucare/we/model/remote/transferpackage/TransferablePackages;", "Lkotlin/collections/ArrayList;", "setupBundlesAdapter", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class TransferablePackagesActivity extends czy implements dfi, dfj {
    @Inject
    public dfk a;
    @Inject
    public djg b;
    private String c;
    private dfg d;
    private ImageView e;
    private TextView f;
    private RecyclerView g;
    private DetailedLineUsage h;

    /* renamed from: lambda$Azxk0zf7sFyzZ-vtgtVIPRdOrgA */
    public static /* synthetic */ void m50lambda$Azxk0zf7sFyzZvtgtVIPRdOrgA(TransferablePackagesActivity transferablePackagesActivity, View view) {
        a(transferablePackagesActivity, view);
    }

    private dfk b() {
        dfk dfkVar = this.a;
        if (dfkVar != null) {
            return dfkVar;
        }
        dqc.a("transferUnitsProvider");
        throw null;
    }

    private djg c() {
        djg djgVar = this.b;
        if (djgVar != null) {
            return djgVar;
        }
        dqc.a("progressHandler");
        throw null;
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_transfer_package);
        a(getString(R.string.family_transfer), false, false);
        View findViewById = findViewById(R.id.txtTitle);
        dqc.b(findViewById, "findViewById(R.id.txtTitle)");
        this.f = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.rvTransferablePackage);
        dqc.b(findViewById2, "findViewById(R.id.rvTransferablePackage)");
        this.g = (RecyclerView) findViewById2;
        View findViewById3 = findViewById(R.id.imgBackButton);
        dqc.b(findViewById3, "findViewById(R.id.imgBackButton)");
        this.e = (ImageView) findViewById3;
        TextView textView = this.f;
        if (textView == null) {
            dqc.a("txtTitle");
            throw null;
        }
        textView.setText(R.string.family_transfer);
        ImageView imageView = this.e;
        if (imageView == null) {
            dqc.a("imgBackButton");
            throw null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.family.groupinfo.transferablepackages.-$$Lambda$TransferablePackagesActivity$Azxk0zf7sFyzZ-vtgtVIPRdOrgA
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferablePackagesActivity.m50lambda$Azxk0zf7sFyzZvtgtVIPRdOrgA(TransferablePackagesActivity.this, view);
            }
        });
        this.d = new dfg(o());
        RecyclerView recyclerView = this.g;
        if (recyclerView == null) {
            dqc.a("rvTransferablePackage");
            throw null;
        }
        TransferablePackagesActivity transferablePackagesActivity = this;
        recyclerView.setLayoutManager(new LinearLayoutManager(transferablePackagesActivity));
        dfg dfgVar = this.d;
        if (dfgVar == null) {
            dqc.a("transferPackagesAdapter");
            throw null;
        }
        recyclerView.setAdapter(dfgVar);
        dfg dfgVar2 = this.d;
        if (dfgVar2 == null) {
            dqc.a("transferPackagesAdapter");
            throw null;
        }
        a aVar = new a();
        dqc.d(aVar, "clickListener");
        dfgVar2.b = aVar;
        c().a(transferablePackagesActivity, getString(R.string.loading));
        this.h = (DetailedLineUsage) getIntent().getParcelableExtra("TRANSFER_UNIT");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        DetailedLineUsage detailedLineUsage = this.h;
        if (detailedLineUsage != null) {
            dfk b = b();
            String itemCode = detailedLineUsage.getItemCode();
            dqc.d(itemCode, "resourceType");
            b.c().i("https://api-my.te.eg/api/family/transferablePackages", b.a().I(), ServerRequest.createServerRequest(b.a().m(), b.b().c.k(), new TransferablePackagesRequest(itemCode, (int) detailedLineUsage.getFreeAmount()))).a(b.g);
        }
        b().e = this;
        b().f = this;
    }

    @Override // defpackage.dfj
    public final void a(ServerResponse<ArrayList<TransferablePackages>> serverResponse) {
        dqc.d(serverResponse, "response");
        c().a();
        dfg dfgVar = this.d;
        if (dfgVar != null) {
            dfgVar.submitList(serverResponse.getBody());
        } else {
            dqc.a("transferPackagesAdapter");
            throw null;
        }
    }

    @Override // defpackage.dfj
    public final void a() {
        c().a();
    }

    public static final void a(TransferablePackagesActivity transferablePackagesActivity, View view) {
        dqc.d(transferablePackagesActivity, "this$0");
        transferablePackagesActivity.finish();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "item", "Lcom/ucare/we/model/remote/transferpackage/TransferablePackages;", "<anonymous parameter 2>", ""}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    static final class a extends dqd implements dpl<View, TransferablePackages, Integer, dmg> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(3);
            TransferablePackagesActivity.this = r1;
        }

        @Override // defpackage.dpl
        public final /* synthetic */ dmg a(View view, TransferablePackages transferablePackages, Integer num) {
            String str;
            StringBuilder sb;
            TransferablePackages transferablePackages2 = transferablePackages;
            num.intValue();
            dqc.d(view, "$noName_0");
            String str2 = null;
            if (TransferablePackagesActivity.this.o().f()) {
                sb = new StringBuilder();
                sb.append(transferablePackages2 == null ? null : Integer.valueOf(transferablePackages2.getDeductedAmount()));
                sb.append(' ');
                if (transferablePackages2 != null) {
                    str = transferablePackages2.getMeasureUnitAr();
                }
                str = null;
            } else {
                sb = new StringBuilder();
                sb.append(transferablePackages2 == null ? null : Integer.valueOf(transferablePackages2.getDeductedAmount()));
                sb.append(' ');
                if (transferablePackages2 != null) {
                    str = transferablePackages2.getMeasureUnit();
                }
                str = null;
            }
            sb.append((Object) str);
            String sb2 = sb.toString();
            GlobalConfirmationActivity.a aVar = GlobalConfirmationActivity.a;
            TransferablePackagesActivity transferablePackagesActivity = TransferablePackagesActivity.this;
            TransferablePackagesActivity transferablePackagesActivity2 = transferablePackagesActivity;
            String string = transferablePackagesActivity.getString(R.string.transfer_confirmation);
            String string2 = TransferablePackagesActivity.this.getString(R.string.confirmationHintTransfer);
            dqc.b(string2, "getString(R.string.confirmationHintTransfer)");
            String format = String.format(string2, Arrays.copyOf(new Object[]{sb2}, 1));
            dqc.b(format, "java.lang.String.format(this, *args)");
            GlobalConfirmationActivity.a.a(transferablePackagesActivity2, string, format, 2009);
            TransferablePackagesActivity transferablePackagesActivity3 = TransferablePackagesActivity.this;
            if (transferablePackages2 != null) {
                str2 = transferablePackages2.getPkgCode();
            }
            transferablePackagesActivity3.c = str2;
            return dmg.a;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 2009) {
            c().a(this, getString(R.string.loading));
            dfk b = b();
            String str = this.c;
            if (str == null) {
                str = "";
            }
            dqc.d(str, "mappingCode");
            String id = b.a().P().getId();
            dqc.b(id, "repository.familyGroup.id");
            b.c().j("https://api-my.te.eg/api/family/transfer", b.a().I(), ServerRequest.createServerRequest(b.a().m(), b.b().c.k(), new AdjustBalanceRequest(id, str))).a(b.h);
        }
    }

    @Override // defpackage.dfi
    public final void b(ServerResponse<Object> serverResponse) {
        dqc.d(serverResponse, "response");
        c().a();
        UnNavigateResponseActivity.a aVar = UnNavigateResponseActivity.a;
        UnNavigateResponseActivity.a.a(this, getString(R.string.successful), serverResponse.getHeader().getResponseMessage(), false);
    }

    @Override // defpackage.dfi
    public final void a(String str) {
        c().a();
        UnNavigateResponseActivity.a aVar = UnNavigateResponseActivity.a;
        UnNavigateResponseActivity.a.a(this, str, getString(R.string.please_try_again), true);
    }
}
