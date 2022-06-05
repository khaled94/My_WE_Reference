package com.ucare.we.presentation.family.groupinfo.managebundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.ServerRequest;
import com.ucare.we.model.ServerResponse;
import com.ucare.we.model.local.groupidrequest.GroupIdRequest;
import com.ucare.we.model.remote.transferunits.DetailedLineUsage;
import com.ucare.we.model.remote.transferunits.TransferUnitResponse;
import com.ucare.we.presentation.family.FamilySharedAddons.FamilySelectAddonsActivity;
import com.ucare.we.presentation.family.groupinfo.transferablepackages.TransferablePackagesActivity;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0012\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\b\u0010!\u001a\u00020\u001dH\u0014J\u001a\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0016\u0010'\u001a\u00020\u001d2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)H\u0016J\b\u0010+\u001a\u00020\u001dH\u0002J\u0010\u0010,\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020.H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0019X\u0082.¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/ucare/we/presentation/family/groupinfo/managebundle/ManageFamilyBundleActivity;", "Lcom/ucare/we/injection/BaseActivity;", "Lcom/ucare/we/presentation/family/groupinfo/managebundle/providers/TransferUnitsListener;", "()V", "btnAddSharedAddon", "Landroid/widget/Button;", "imgBackButton", "Landroid/widget/ImageView;", "progressHandler", "Lcom/ucare/we/util/ProgressHandler;", "getProgressHandler", "()Lcom/ucare/we/util/ProgressHandler;", "setProgressHandler", "(Lcom/ucare/we/util/ProgressHandler;)V", "rvTransferableUnits", "Landroidx/recyclerview/widget/RecyclerView;", "transferUnitsBundlesAdapter", "Lcom/ucare/we/presentation/family/groupinfo/managebundle/adapter/TransferUnitsBundlesAdapter;", "transferUnitsProvider", "Lcom/ucare/we/presentation/family/groupinfo/managebundle/providers/TransferUnitsProvider;", "getTransferUnitsProvider", "()Lcom/ucare/we/presentation/family/groupinfo/managebundle/providers/TransferUnitsProvider;", "setTransferUnitsProvider", "(Lcom/ucare/we/presentation/family/groupinfo/managebundle/providers/TransferUnitsProvider;)V", "tvAvailableAddons", "Landroid/widget/TextView;", "tvBundlesEmpty", "txtTitle", "initViews", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onTransferUnitFailure", "failureReason", "", "failureMessage", "", "onTransferUnitSuccess", "response", "Lcom/ucare/we/model/ServerResponse;", "Lcom/ucare/we/model/remote/transferunits/TransferUnitResponse;", "setupBundlesAdapter", "toggleList", "shown", "", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ManageFamilyBundleActivity extends czy implements der {
    @Inject
    public des a;
    @Inject
    public djg b;
    private deq c;
    private Button d;
    private RecyclerView e;
    private ImageView f;
    private TextView g;
    private TextView h;
    private TextView i;

    /* renamed from: lambda$GmHI2gBQ-2jzJShtqRB6pQcfFb8 */
    public static /* synthetic */ void m45lambda$GmHI2gBQ2jzJShtqRB6pQcfFb8(ManageFamilyBundleActivity manageFamilyBundleActivity, View view) {
        b(manageFamilyBundleActivity, view);
    }

    public static /* synthetic */ void lambda$bNRy2VrAyrw0ZkEd4YISJ6Dw5yM(ManageFamilyBundleActivity manageFamilyBundleActivity, View view) {
        a(manageFamilyBundleActivity, view);
    }

    private des b() {
        des desVar = this.a;
        if (desVar != null) {
            return desVar;
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
        setContentView(R.layout.activity_bundle_transfershare);
        a(getString(R.string.transferAndShare), false, false);
        View findViewById = findViewById(R.id.txtTitle);
        dqc.b(findViewById, "findViewById(R.id.txtTitle)");
        this.g = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.rvTransferableUnits);
        dqc.b(findViewById2, "findViewById(R.id.rvTransferableUnits)");
        this.e = (RecyclerView) findViewById2;
        View findViewById3 = findViewById(R.id.imgBackButton);
        dqc.b(findViewById3, "findViewById(R.id.imgBackButton)");
        this.f = (ImageView) findViewById3;
        View findViewById4 = findViewById(R.id.btnAddSharedAddon);
        dqc.b(findViewById4, "findViewById(R.id.btnAddSharedAddon)");
        this.d = (Button) findViewById4;
        View findViewById5 = findViewById(R.id.tvAvailableAddons);
        dqc.b(findViewById5, "findViewById(R.id.tvAvailableAddons)");
        this.h = (TextView) findViewById5;
        View findViewById6 = findViewById(R.id.tvBundlesEmpty);
        dqc.b(findViewById6, "findViewById(R.id.tvBundlesEmpty)");
        this.i = (TextView) findViewById6;
        TextView textView = this.g;
        if (textView == null) {
            dqc.a("txtTitle");
            throw null;
        }
        textView.setText(R.string.transferAndShare);
        ImageView imageView = this.f;
        if (imageView == null) {
            dqc.a("imgBackButton");
            throw null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.family.groupinfo.managebundle.-$$Lambda$ManageFamilyBundleActivity$GmHI2gBQ-2jzJShtqRB6pQcfFb8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ManageFamilyBundleActivity.m45lambda$GmHI2gBQ2jzJShtqRB6pQcfFb8(ManageFamilyBundleActivity.this, view);
            }
        });
        this.c = new deq(o());
        RecyclerView recyclerView = this.e;
        if (recyclerView == null) {
            dqc.a("rvTransferableUnits");
            throw null;
        }
        ManageFamilyBundleActivity manageFamilyBundleActivity = this;
        recyclerView.setLayoutManager(new LinearLayoutManager(manageFamilyBundleActivity));
        deq deqVar = this.c;
        if (deqVar == null) {
            dqc.a("transferUnitsBundlesAdapter");
            throw null;
        }
        recyclerView.setAdapter(deqVar);
        deq deqVar2 = this.c;
        if (deqVar2 == null) {
            dqc.a("transferUnitsBundlesAdapter");
            throw null;
        }
        a aVar = new a();
        dqc.d(aVar, "clickListener");
        deqVar2.b = aVar;
        Button button = this.d;
        if (button == null) {
            dqc.a("btnAddSharedAddon");
            throw null;
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.family.groupinfo.managebundle.-$$Lambda$ManageFamilyBundleActivity$bNRy2VrAyrw0ZkEd4YISJ6Dw5yM
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ManageFamilyBundleActivity.lambda$bNRy2VrAyrw0ZkEd4YISJ6Dw5yM(ManageFamilyBundleActivity.this, view);
            }
        });
        c().a(manageFamilyBundleActivity, getString(R.string.loading));
    }

    public static final void a(ManageFamilyBundleActivity manageFamilyBundleActivity, View view) {
        dqc.d(manageFamilyBundleActivity, "this$0");
        manageFamilyBundleActivity.startActivity(new Intent(manageFamilyBundleActivity, FamilySelectAddonsActivity.class));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        des b = b();
        String id = b.a().P().getId();
        dqc.b(id, "repository.familyGroup.id");
        GroupIdRequest groupIdRequest = new GroupIdRequest(id);
        String m = b.a().m();
        djb djbVar = b.b;
        if (djbVar != null) {
            ServerRequest<GroupIdRequest> createServerRequest = ServerRequest.createServerRequest(m, djbVar.c.k(), groupIdRequest);
            diq diqVar = b.c;
            if (diqVar != null) {
                diqVar.h("https://api-my.te.eg/api/family/transferableFreeUnits", b.a().I(), createServerRequest).a(b.f);
                b().e = this;
                return;
            }
            dqc.a("apiInterface");
            throw null;
        }
        dqc.a("languageSwitcher");
        throw null;
    }

    public static final void b(ManageFamilyBundleActivity manageFamilyBundleActivity, View view) {
        dqc.d(manageFamilyBundleActivity, "this$0");
        manageFamilyBundleActivity.finish();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "item", "Lcom/ucare/we/model/remote/transferunits/DetailedLineUsage;", "<anonymous parameter 2>", ""}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    static final class a extends dqd implements dpl<View, DetailedLineUsage, Integer, dmg> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(3);
            ManageFamilyBundleActivity.this = r1;
        }

        @Override // defpackage.dpl
        public final /* synthetic */ dmg a(View view, DetailedLineUsage detailedLineUsage, Integer num) {
            num.intValue();
            dqc.d(view, "$noName_0");
            Intent intent = new Intent(ManageFamilyBundleActivity.this, TransferablePackagesActivity.class);
            intent.putExtra("TRANSFER_UNIT", detailedLineUsage);
            ManageFamilyBundleActivity.this.startActivity(intent);
            return dmg.a;
        }
    }

    @Override // defpackage.der
    public final void a(ServerResponse<TransferUnitResponse> serverResponse) {
        dqc.d(serverResponse, "response");
        c().a();
        deq deqVar = this.c;
        if (deqVar == null) {
            dqc.a("transferUnitsBundlesAdapter");
            throw null;
        }
        deqVar.submitList(serverResponse.getBody().getDetailedLineUsageList());
        ArrayList<DetailedLineUsage> detailedLineUsageList = serverResponse.getBody().getDetailedLineUsageList();
        a(!(detailedLineUsageList == null || detailedLineUsageList.isEmpty()));
    }

    private final void a(boolean z) {
        RecyclerView recyclerView = this.e;
        if (recyclerView == null) {
            dqc.a("rvTransferableUnits");
            throw null;
        }
        int i = 0;
        recyclerView.setVisibility(z ? 0 : 8);
        TextView textView = this.h;
        if (textView == null) {
            dqc.a("tvAvailableAddons");
            throw null;
        }
        textView.setVisibility(z ? 0 : 8);
        TextView textView2 = this.i;
        if (textView2 == null) {
            dqc.a("tvBundlesEmpty");
            throw null;
        }
        if (z) {
            i = 8;
        }
        textView2.setVisibility(i);
    }

    @Override // defpackage.der
    public final void a() {
        c().a();
        a(false);
    }
}
