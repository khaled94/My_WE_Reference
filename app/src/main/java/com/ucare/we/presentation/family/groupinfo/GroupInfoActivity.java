package com.ucare.we.presentation.family.groupinfo;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.manageplanspostpaid.ManagePostPaidPlanActivity;
import com.ucare.we.model.ServerRequest;
import com.ucare.we.model.ServerResponse;
import com.ucare.we.model.SignInModel.GroupFamilyModel;
import com.ucare.we.model.local.family.SubscribedFamilyOffersRequestBody;
import com.ucare.we.model.remote.familygroupmember.FamilyGroupMember;
import com.ucare.we.model.remote.familygroupmember.GroupMember;
import com.ucare.we.model.remote.subscribedoffers.FamilySubscribedOffer;
import com.ucare.we.model.usagedetails.DetailedLineUsageItem;
import com.ucare.we.model.usagedetails.HomePageResponseBody;
import com.ucare.we.presentation.family.creategroup.CreateFamilyGroupPlansActivity;
import com.ucare.we.presentation.genericconfirmation.GlobalConfirmationActivity;
import com.ucare.we.presentation.offers.UnNavigateResponseActivity;
import com.ucare.we.view.AppCompatTextView;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0002J\u0010\u0010E\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0002J\u0010\u0010F\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0002J\u0010\u0010G\u001a\u00020B2\u0006\u0010H\u001a\u00020IH\u0002J\u001f\u0010J\u001a\u00020B2\u0012\u0010H\u001a\n\u0012\u0006\b\u0001\u0012\u00020I0K\"\u00020I¢\u0006\u0002\u0010LJ\b\u0010M\u001a\u00020BH\u0002J\u000e\u0010C\u001a\u00020D2\u0006\u0010H\u001a\u00020IJ\"\u0010N\u001a\u00020B2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020P2\b\u0010R\u001a\u0004\u0018\u00010SH\u0014J\u0010\u0010T\u001a\u00020B2\u0006\u0010H\u001a\u00020IH\u0016J\u0012\u0010U\u001a\u00020B2\b\u0010V\u001a\u0004\u0018\u00010WH\u0014J\u001a\u0010X\u001a\u00020B2\u0006\u0010Y\u001a\u00020P2\b\u0010Z\u001a\u0004\u0018\u00010[H\u0016J\u0010\u0010\\\u001a\u00020B2\u0006\u0010]\u001a\u00020^H\u0016J\u001a\u0010_\u001a\u00020B2\u0006\u0010`\u001a\u00020P2\b\u0010Z\u001a\u0004\u0018\u00010[H\u0016J\u0010\u0010a\u001a\u00020B2\u0006\u0010b\u001a\u00020cH\u0016J\u001a\u0010d\u001a\u00020B2\u0006\u0010`\u001a\u00020P2\b\u0010Z\u001a\u0004\u0018\u00010[H\u0016J\u0016\u0010e\u001a\u00020B2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020[0fH\u0016J\u001a\u0010g\u001a\u00020B2\u0006\u0010`\u001a\u00020P2\b\u0010Z\u001a\u0004\u0018\u00010[H\u0016J \u0010h\u001a\u00020B2\u0016\u0010b\u001a\u0012\u0012\u0004\u0012\u00020%0ij\b\u0012\u0004\u0012\u00020%`jH\u0017J)\u0010k\u001a\u00020B2\u0006\u0010l\u001a\u00020m2\u0012\u0010n\u001a\n\u0012\u0006\b\u0001\u0012\u0002060K\"\u000206H\u0002¢\u0006\u0002\u0010oJ!\u0010p\u001a\u00020B2\u0012\u0010q\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0K\"\u00020\u001bH\u0002¢\u0006\u0002\u0010rJ!\u0010s\u001a\u00020B2\u0012\u0010t\u001a\n\u0012\u0006\b\u0001\u0012\u00020u0K\"\u00020uH\u0002¢\u0006\u0002\u0010vJ!\u0010w\u001a\u00020B2\u0012\u0010x\u001a\n\u0012\u0006\b\u0001\u0012\u0002060K\"\u000206H\u0002¢\u0006\u0002\u0010yJ\b\u0010z\u001a\u00020BH\u0002J\b\u0010{\u001a\u00020BH\u0002J\u001f\u0010|\u001a\u00020B2\u0012\u0010H\u001a\n\u0012\u0006\b\u0001\u0012\u00020I0K\"\u00020I¢\u0006\u0002\u0010LJ\u0010\u0010}\u001a\u00020B2\u0006\u0010~\u001a\u00020\u001bH\u0002J\u0011\u0010\u007f\u001a\u00020B2\u0007\u0010\u0080\u0001\u001a\u00020uH\u0002J\u0012\u0010\u0081\u0001\u001a\u00020B2\u0007\u0010\u0082\u0001\u001a\u000203H\u0002J\u0012\u0010\u0083\u0001\u001a\u00020B2\u0007\u0010\u0084\u0001\u001a\u000206H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010&\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u000e\u00102\u001a\u000203X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000203X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000206X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000206X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u000206X\u0082.¢\u0006\u0002\n\u0000R \u0010:\u001a\b\u0012\u0004\u0012\u00020<0;X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006\u0085\u0001"}, d2 = {"Lcom/ucare/we/presentation/family/groupinfo/GroupInfoActivity;", "Lcom/ucare/we/injection/BaseActivity;", "Landroid/view/View$OnClickListener;", "Lcom/ucare/we/presentation/family/groupinfo/provider/GroupInfoListener;", "Lcom/ucare/we/presentation/family/groupinfo/managemembers/provider/ManageNumbersListener;", "Lcom/ucare/we/provider/BundleListener;", "Lcom/ucare/we/presentation/family/groupinfo/managemembers/provider/NumbersActionsListener;", "()V", "addonsAdapter", "Lcom/ucare/we/presentation/family/groupinfo/adapters/GroupInfoAddonsAdapter;", "btnDeleteGroup", "Landroid/widget/Button;", "bundleProvider", "Lcom/ucare/we/provider/BundlesProvider;", "getBundleProvider", "()Lcom/ucare/we/provider/BundlesProvider;", "setBundleProvider", "(Lcom/ucare/we/provider/BundlesProvider;)V", "groupInfoProvider", "Lcom/ucare/we/presentation/family/groupinfo/provider/GroupInfoProvider;", "getGroupInfoProvider", "()Lcom/ucare/we/presentation/family/groupinfo/provider/GroupInfoProvider;", "setGroupInfoProvider", "(Lcom/ucare/we/presentation/family/groupinfo/provider/GroupInfoProvider;)V", "groupMembersAdapter", "Lcom/ucare/we/presentation/family/groupinfo/adapters/GroupInfoMembersAdapter;", "imgBackButton", "Landroid/widget/ImageView;", "lineProvider", "Lcom/ucare/we/provider/LineProvider;", "getLineProvider", "()Lcom/ucare/we/provider/LineProvider;", "setLineProvider", "(Lcom/ucare/we/provider/LineProvider;)V", "llManagePlan", "Landroidx/appcompat/widget/LinearLayoutCompat;", "mainOffer", "Lcom/ucare/we/model/remote/subscribedoffers/FamilySubscribedOffer;", "manageNumbersProvider", "Lcom/ucare/we/presentation/family/groupinfo/managemembers/provider/ManageNumbersProvider;", "getManageNumbersProvider", "()Lcom/ucare/we/presentation/family/groupinfo/managemembers/provider/ManageNumbersProvider;", "setManageNumbersProvider", "(Lcom/ucare/we/presentation/family/groupinfo/managemembers/provider/ManageNumbersProvider;)V", "progressHandler", "Lcom/ucare/we/util/ProgressHandler;", "getProgressHandler", "()Lcom/ucare/we/util/ProgressHandler;", "setProgressHandler", "(Lcom/ucare/we/util/ProgressHandler;)V", "rvGroupInfoAddons", "Landroidx/recyclerview/widget/RecyclerView;", "rvMembers", "tvAddons", "Landroid/widget/TextView;", "tvGroupBundle", "tvMembers", "txtTitle", "usageItem", "", "Lcom/ucare/we/model/usagedetails/DetailedLineUsageItem;", "getUsageItem", "()Ljava/util/List;", "setUsageItem", "(Ljava/util/List;)V", "expandCollapseAddonsFun", "", "isExpanded", "", "expandCollapseBundlesFun", "expandCollapseMembersFun", "handleClick", "view", "Landroid/view/View;", "hideGroupViews", "", "([Landroid/view/View;)V", "initViews", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onClick", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFreeUnitUsageFailure", "failureReson", "failureMessage", "", "onFreeUnitUsageSuccess", "homePageResponseBody", "Lcom/ucare/we/model/usagedetails/HomePageResponseBody;", "onManageNumberFailure", "failureReason", "onManageNumberSuccess", "familySubscribedOfferList", "Lcom/ucare/we/model/remote/familygroupmember/FamilyGroupMember;", "onNumbersActionFailure", "onNumbersActionSuccess", "Lcom/ucare/we/model/ServerResponse;", "onSubscribedOffersFailure", "onSubscribedOffersSuccess", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "resetAlpha", "alpha", "", "textviews", "(F[Landroid/widget/TextView;)V", "resetArrows", "icons", "([Landroid/widget/ImageView;)V", "resetContainers", "containers", "Landroidx/constraintlayout/widget/ConstraintLayout;", "([Landroidx/constraintlayout/widget/ConstraintLayout;)V", "resetTextColors", "texts", "([Landroid/widget/TextView;)V", "setupGroupInfoAddonsAdapter", "setupGroupMembersAdapter", "showGroupViews", "toggleArrow", "icon", "toggleContainer", "layout", "toggleRecyclerView", "recyclerView", "toggleTextColor", "textView", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class GroupInfoActivity extends czy implements View.OnClickListener, dfa, dfc, dfe, dhl {
    @Inject
    public dff a;
    @Inject
    public dhu b;
    @Inject
    public dhm c;
    @Inject
    public dfb d;
    @Inject
    public djg e;
    private FamilySubscribedOffer f;
    private RecyclerView g;
    private RecyclerView h;
    private LinearLayoutCompat i;
    private Button j;
    private TextView k;
    private TextView l;
    private TextView m;
    private TextView n;
    private ImageView o;
    private dem p;
    private dek q;

    /* renamed from: lambda$M008Dm7swurz-0McQTuca1xxM3M */
    public static /* synthetic */ void m43lambda$M008Dm7swurz0McQTuca1xxM3M(GroupInfoActivity groupInfoActivity, View view) {
        b(groupInfoActivity, view);
    }

    public static /* synthetic */ void lambda$d5cI8P45cOIih97E_txKwqnzoWk(GroupInfoActivity groupInfoActivity, View view) {
        a(groupInfoActivity, view);
    }

    public static /* synthetic */ void lambda$sSxW3FQwgyh0uFAElWIZw3kjk4c(GroupInfoActivity groupInfoActivity, View view) {
        c(groupInfoActivity, view);
    }

    private dff a() {
        dff dffVar = this.a;
        if (dffVar != null) {
            return dffVar;
        }
        dqc.a("groupInfoProvider");
        throw null;
    }

    private dhm b() {
        dhm dhmVar = this.c;
        if (dhmVar != null) {
            return dhmVar;
        }
        dqc.a("bundleProvider");
        throw null;
    }

    private dfb c() {
        dfb dfbVar = this.d;
        if (dfbVar != null) {
            return dfbVar;
        }
        dqc.a("manageNumbersProvider");
        throw null;
    }

    private djg d() {
        djg djgVar = this.e;
        if (djgVar != null) {
            return djgVar;
        }
        dqc.a("progressHandler");
        throw null;
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String id;
        super.onCreate(bundle);
        setContentView(R.layout.activity_group_info);
        a(getString(R.string.groupInfo), false, false);
        View findViewById = findViewById(R.id.rvGroupInfoMembers);
        dqc.b(findViewById, "findViewById(R.id.rvGroupInfoMembers)");
        this.g = (RecyclerView) findViewById;
        View findViewById2 = findViewById(R.id.rvGroupInfoAddons);
        dqc.b(findViewById2, "findViewById(R.id.rvGroupInfoAddons)");
        this.h = (RecyclerView) findViewById2;
        View findViewById3 = findViewById(R.id.llManagePlan);
        dqc.b(findViewById3, "findViewById(R.id.llManagePlan)");
        this.i = (LinearLayoutCompat) findViewById3;
        View findViewById4 = findViewById(R.id.btnDeleteGroup);
        dqc.b(findViewById4, "findViewById(R.id.btnDeleteGroup)");
        this.j = (Button) findViewById4;
        View findViewById5 = findViewById(R.id.tvMembers);
        dqc.b(findViewById5, "findViewById(R.id.tvMembers)");
        this.m = (TextView) findViewById5;
        View findViewById6 = findViewById(R.id.tvGroupBundle);
        dqc.b(findViewById6, "findViewById(R.id.tvGroupBundle)");
        this.l = (TextView) findViewById6;
        View findViewById7 = findViewById(R.id.tvAddons);
        dqc.b(findViewById7, "findViewById(R.id.tvAddons)");
        this.k = (TextView) findViewById7;
        View findViewById8 = findViewById(R.id.txtTitle);
        dqc.b(findViewById8, "findViewById(R.id.txtTitle)");
        this.n = (TextView) findViewById8;
        View findViewById9 = findViewById(R.id.imgBackButton);
        dqc.b(findViewById9, "findViewById(R.id.imgBackButton)");
        this.o = (ImageView) findViewById9;
        GroupInfoActivity groupInfoActivity = this;
        ((LinearLayoutCompat) findViewById(R.id.expandCollapseMembers)).setOnClickListener(groupInfoActivity);
        ((LinearLayoutCompat) findViewById(R.id.expandCollapseBundles)).setOnClickListener(groupInfoActivity);
        ((LinearLayoutCompat) findViewById(R.id.expandCollapseAddons)).setOnClickListener(groupInfoActivity);
        TextView textView = this.n;
        if (textView == null) {
            dqc.a("txtTitle");
            throw null;
        }
        textView.setText(R.string.groupInfo);
        ImageView imageView = this.o;
        if (imageView == null) {
            dqc.a("imgBackButton");
            throw null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.family.groupinfo.-$$Lambda$GroupInfoActivity$sSxW3FQwgyh0uFAElWIZw3kjk4c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupInfoActivity.lambda$sSxW3FQwgyh0uFAElWIZw3kjk4c(GroupInfoActivity.this, view);
            }
        });
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvGroupInfoMembers);
        dqc.b(recyclerView, "rvGroupInfoMembers");
        a(a((View) recyclerView));
        this.p = new dem();
        RecyclerView recyclerView2 = this.g;
        if (recyclerView2 == null) {
            dqc.a("rvMembers");
            throw null;
        }
        GroupInfoActivity groupInfoActivity2 = this;
        recyclerView2.setLayoutManager(new LinearLayoutManager(groupInfoActivity2));
        dem demVar = this.p;
        if (demVar == null) {
            dqc.a("groupMembersAdapter");
            throw null;
        }
        recyclerView2.setAdapter(demVar);
        this.q = new dek();
        RecyclerView recyclerView3 = this.h;
        if (recyclerView3 == null) {
            dqc.a("rvGroupInfoAddons");
            throw null;
        }
        recyclerView3.setLayoutManager(new LinearLayoutManager(groupInfoActivity2));
        dek dekVar = this.q;
        if (dekVar == null) {
            dqc.a("addonsAdapter");
            throw null;
        }
        recyclerView3.setAdapter(dekVar);
        c().a = this;
        b().a(this);
        d().a(groupInfoActivity2, getString(R.string.loading));
        c().f = this;
        Button button = this.j;
        if (button == null) {
            dqc.a("btnDeleteGroup");
            throw null;
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.family.groupinfo.-$$Lambda$GroupInfoActivity$d5cI8P45cOIih97E_txKwqnzoWk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupInfoActivity.lambda$d5cI8P45cOIih97E_txKwqnzoWk(GroupInfoActivity.this, view);
            }
        });
        GroupFamilyModel P = n().P();
        if (P != null && (id = P.getId()) != null) {
            dff a = a();
            eey<ServerResponse<ArrayList<FamilySubscribedOffer>>> v = a.c().v("https://api-my.te.eg/api/services/list/family-offers/subscribed", a.a().I(), ServerRequest.createServerRequest(a.a().m(), a.b().c.k(), new SubscribedFamilyOffersRequestBody(id)));
            if (v != null) {
                v.a(a.g);
            }
        }
        a().a = this;
        ((Button) findViewById(R.id.btnChangePlan)).setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.family.groupinfo.-$$Lambda$GroupInfoActivity$M008Dm7swurz-0McQTuca1xxM3M
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupInfoActivity.m43lambda$M008Dm7swurz0McQTuca1xxM3M(GroupInfoActivity.this, view);
            }
        });
    }

    public static final void a(GroupInfoActivity groupInfoActivity, View view) {
        dqc.d(groupInfoActivity, "this$0");
        GlobalConfirmationActivity.a aVar = GlobalConfirmationActivity.a;
        GlobalConfirmationActivity.a.a(groupInfoActivity, groupInfoActivity.getString(R.string.deleteGroup), groupInfoActivity.getString(R.string.deleteGroupConfirmationMessage), 9009);
    }

    public static final void b(GroupInfoActivity groupInfoActivity, View view) {
        dqc.d(groupInfoActivity, "this$0");
        Intent intent = new Intent(groupInfoActivity, CreateFamilyGroupPlansActivity.class);
        intent.putExtra("IS_CREATE_GROUP", false);
        groupInfoActivity.startActivity(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i == 2010) {
                Intent intent2 = new Intent(this, ManagePostPaidPlanActivity.class);
                intent2.setFlags(603979776);
                startActivity(intent2);
            } else if (i != 9009) {
            } else {
                d().a(this, getString(R.string.loading));
                c().a("delete", n().m());
            }
        }
    }

    @Override // defpackage.dfe
    public final void a(ArrayList<FamilySubscribedOffer> arrayList) {
        dqc.d(arrayList, "familySubscribedOfferList");
        d().a();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (dqc.a(arrayList.get(i).getPrimary(), Boolean.TRUE)) {
                    FamilySubscribedOffer familySubscribedOffer = arrayList.get(i);
                    dqc.b(familySubscribedOffer, "familySubscribedOfferList[index]");
                    this.f = familySubscribedOffer;
                } else {
                    arrayList2.add(arrayList.get(i));
                }
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        dek dekVar = this.q;
        if (dekVar == null) {
            dqc.a("addonsAdapter");
            throw null;
        }
        dekVar.submitList(arrayList2);
        if (this.f == null) {
            return;
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) findViewById(R.id.txtMainPlan);
        FamilySubscribedOffer familySubscribedOffer2 = this.f;
        if (familySubscribedOffer2 == null) {
            dqc.a("mainOffer");
            throw null;
        }
        appCompatTextView.setText(familySubscribedOffer2.getOfferEnName());
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) findViewById(R.id.tvCost);
        StringBuilder sb = new StringBuilder();
        sb.append(getString(R.string.price_lbl));
        sb.append(' ');
        FamilySubscribedOffer familySubscribedOffer3 = this.f;
        if (familySubscribedOffer3 == null) {
            dqc.a("mainOffer");
            throw null;
        }
        sb.append(familySubscribedOffer3.getPrice());
        sb.append(' ');
        sb.append(getString(R.string.egp));
        appCompatTextView2.setText(sb.toString());
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) findViewById(R.id.tvRemainingDays);
        FamilySubscribedOffer familySubscribedOffer4 = this.f;
        if (familySubscribedOffer4 == null) {
            dqc.a("mainOffer");
            throw null;
        }
        appCompatTextView3.setText(familySubscribedOffer4.getRemainingDaysWithText());
        AppCompatTextView appCompatTextView4 = (AppCompatTextView) findViewById(R.id.tvRenewalDate);
        Boolean l = n().l();
        dqc.b(l, "repository.isEnglish");
        String str = "";
        if (l.booleanValue()) {
            FamilySubscribedOffer familySubscribedOffer5 = this.f;
            if (familySubscribedOffer5 != null) {
                String renewalDate = familySubscribedOffer5.getRenewalDate();
                if (renewalDate != null) {
                    str = renewalDate;
                }
                str = djm.a(str);
            } else {
                dqc.a("mainOffer");
                throw null;
            }
        } else {
            FamilySubscribedOffer familySubscribedOffer6 = this.f;
            if (familySubscribedOffer6 == null) {
                dqc.a("mainOffer");
                throw null;
            }
            String renewalDate2 = familySubscribedOffer6.getRenewalDate();
            if (renewalDate2 != null) {
                str = renewalDate2;
            }
        }
        appCompatTextView4.setText(str);
    }

    @Override // defpackage.dfe
    public final void a(String str) {
        d().a();
        UnNavigateResponseActivity.a(this, str, getString(R.string.please_try_again));
    }

    public static final void c(GroupInfoActivity groupInfoActivity, View view) {
        dqc.d(groupInfoActivity, "this$0");
        groupInfoActivity.finish();
    }

    private static void a(RecyclerView recyclerView) {
        recyclerView.setVisibility(recyclerView.getVisibility() == 0 ? 8 : 0);
    }

    private static boolean a(View view) {
        dqc.d(view, "view");
        return view.getVisibility() == 0;
    }

    private final void a(boolean z) {
        if (z) {
            TextView[] textViewArr = new TextView[1];
            TextView textView = this.m;
            if (textView == null) {
                dqc.a("tvMembers");
                throw null;
            } else {
                textViewArr[0] = textView;
                a(textViewArr);
            }
        } else {
            TextView textView2 = this.m;
            if (textView2 == null) {
                dqc.a("tvMembers");
                throw null;
            }
            a(textView2);
            View[] viewArr = new View[2];
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvGroupInfoBundles);
            dqc.b(recyclerView, "rvGroupInfoBundles");
            viewArr[0] = recyclerView;
            RecyclerView recyclerView2 = this.h;
            if (recyclerView2 == null) {
                dqc.a("rvGroupInfoAddons");
                throw null;
            }
            viewArr[1] = recyclerView2;
            a(viewArr);
            ImageView imageView = (ImageView) findViewById(R.id.ivAddonsArrow);
            dqc.b(imageView, "ivAddonsArrow");
            ImageView imageView2 = (ImageView) findViewById(R.id.ivBundleArrow);
            dqc.b(imageView2, "ivBundleArrow");
            a(imageView, imageView2);
            TextView[] textViewArr2 = new TextView[2];
            TextView textView3 = this.k;
            if (textView3 == null) {
                dqc.a("tvAddons");
                throw null;
            }
            textViewArr2[0] = textView3;
            TextView textView4 = this.l;
            if (textView4 == null) {
                dqc.a("tvGroupBundle");
                throw null;
            }
            textViewArr2[1] = textView4;
            a(textViewArr2);
            d().a(this, getString(R.string.loading));
            String id = n().P().getId();
            if (id != null) {
                c().a(id);
            }
        }
        RecyclerView recyclerView3 = (RecyclerView) findViewById(R.id.rvGroupInfoMembers);
        dqc.b(recyclerView3, "rvGroupInfoMembers");
        a(recyclerView3);
        ImageView imageView3 = (ImageView) findViewById(R.id.ivMembersArrow);
        dqc.b(imageView3, "ivMembersArrow");
        a(imageView3);
    }

    private final void a(ImageView imageView) {
        int i = 0;
        if (imageView.getRotation() == 0.0f) {
            i = 180;
        }
        imageView.getRotation();
        imageView.setColorFilter(ContextCompat.getColor(this, R.color.color_dark_purple_new), PorterDuff.Mode.SRC_IN);
        imageView.animate().rotation(i).setDuration(0L).start();
    }

    private final void a(TextView textView) {
        textView.setTextColor(getResources().getColor(R.color.color_dark_purple_new));
    }

    @Override // defpackage.dfa
    public final void a(FamilyGroupMember familyGroupMember) {
        dqc.d(familyGroupMember, "familySubscribedOfferList");
        ArrayList<GroupMember> groupMembers = familyGroupMember.getGroupMembers();
        dem demVar = this.p;
        if (demVar == null) {
            dqc.a("groupMembersAdapter");
            throw null;
        }
        demVar.submitList(groupMembers);
        d().a();
    }

    @Override // defpackage.dfa
    public final void b(String str) {
        d().a();
        UnNavigateResponseActivity.a(this, str, getString(R.string.please_try_again));
    }

    @Override // defpackage.dhl
    public final void a(HomePageResponseBody homePageResponseBody) {
        dqc.d(homePageResponseBody, "homePageResponseBody");
        d().a();
        List<DetailedLineUsageItem> detailedLineUsageList = homePageResponseBody.getDetailedLineUsageList();
        dqc.b(detailedLineUsageList, "homePageResponseBody.detailedLineUsageList");
        ((RecyclerView) findViewById(R.id.rvGroupInfoBundles)).setAdapter(new cwv(this, detailedLineUsageList));
    }

    @Override // defpackage.dhl
    public final void a(int i, String str) {
        String.valueOf(i);
        d().a();
        UnNavigateResponseActivity.a(this, str, getString(R.string.please_try_again));
    }

    @Override // defpackage.dfc
    public final void a(ServerResponse<String> serverResponse) {
        dqc.d(serverResponse, "familySubscribedOfferList");
        n().x("");
        d().a();
        UnNavigateResponseActivity.a(this, 0, serverResponse.getHeader().getResponseMessage(), "", false, false, false, 2010, true);
    }

    @Override // defpackage.dfc
    public final void b(int i, String str) {
        d().a();
        UnNavigateResponseActivity.a(this, i, str, getString(R.string.please_try_again), false, false, true, 0, i == 3232);
    }

    private final void a(ImageView... imageViewArr) {
        for (int i = 0; i < 2; i++) {
            ImageView imageView = imageViewArr[i];
            imageView.setColorFilter(ContextCompat.getColor(this, R.color.color_dark_purple_new), PorterDuff.Mode.SRC_IN);
            imageView.animate().rotation(180.0f).setDuration(0L).start();
        }
    }

    private final void a(TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            textView.setTextColor(getResources().getColor(R.color.color_dark_purple_new));
        }
    }

    private static void a(View... viewArr) {
        dqc.d(viewArr, "view");
        for (int i = 0; i < 2; i++) {
            viewArr[i].setVisibility(8);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dqc.d(view, "view");
        switch (view.getId()) {
            case R.id.expandCollapseAddons /* 2131362233 */:
                RecyclerView recyclerView = this.h;
                if (recyclerView == null) {
                    dqc.a("rvGroupInfoAddons");
                    throw null;
                }
                if (a((View) recyclerView)) {
                    TextView[] textViewArr = new TextView[1];
                    TextView textView = this.k;
                    if (textView == null) {
                        dqc.a("tvAddons");
                        throw null;
                    } else {
                        textViewArr[0] = textView;
                        a(textViewArr);
                    }
                } else {
                    TextView textView2 = this.k;
                    if (textView2 == null) {
                        dqc.a("tvAddons");
                        throw null;
                    }
                    a(textView2);
                    TextView[] textViewArr2 = new TextView[2];
                    TextView textView3 = this.l;
                    if (textView3 == null) {
                        dqc.a("tvGroupBundle");
                        throw null;
                    }
                    textViewArr2[0] = textView3;
                    TextView textView4 = this.m;
                    if (textView4 == null) {
                        dqc.a("tvMembers");
                        throw null;
                    }
                    textViewArr2[1] = textView4;
                    a(textViewArr2);
                    RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.rvGroupInfoMembers);
                    dqc.b(recyclerView2, "rvGroupInfoMembers");
                    RecyclerView recyclerView3 = (RecyclerView) findViewById(R.id.rvGroupInfoBundles);
                    dqc.b(recyclerView3, "rvGroupInfoBundles");
                    a(recyclerView2, recyclerView3);
                    ImageView imageView = (ImageView) findViewById(R.id.ivBundleArrow);
                    dqc.b(imageView, "ivBundleArrow");
                    ImageView imageView2 = (ImageView) findViewById(R.id.ivMembersArrow);
                    dqc.b(imageView2, "ivMembersArrow");
                    a(imageView, imageView2);
                }
                RecyclerView recyclerView4 = this.h;
                if (recyclerView4 == null) {
                    dqc.a("rvGroupInfoAddons");
                    throw null;
                }
                a(recyclerView4);
                ImageView imageView3 = (ImageView) findViewById(R.id.ivAddonsArrow);
                dqc.b(imageView3, "ivAddonsArrow");
                a(imageView3);
                return;
            case R.id.expandCollapseBundles /* 2131362234 */:
                RecyclerView recyclerView5 = (RecyclerView) findViewById(R.id.rvGroupInfoBundles);
                dqc.b(recyclerView5, "rvGroupInfoBundles");
                if (a((View) recyclerView5)) {
                    TextView[] textViewArr3 = new TextView[1];
                    TextView textView5 = this.l;
                    if (textView5 == null) {
                        dqc.a("tvGroupBundle");
                        throw null;
                    } else {
                        textViewArr3[0] = textView5;
                        a(textViewArr3);
                    }
                } else {
                    TextView textView6 = this.l;
                    if (textView6 == null) {
                        dqc.a("tvGroupBundle");
                        throw null;
                    }
                    a(textView6);
                    View[] viewArr = new View[2];
                    RecyclerView recyclerView6 = (RecyclerView) findViewById(R.id.rvGroupInfoMembers);
                    dqc.b(recyclerView6, "rvGroupInfoMembers");
                    viewArr[0] = recyclerView6;
                    RecyclerView recyclerView7 = this.h;
                    if (recyclerView7 == null) {
                        dqc.a("rvGroupInfoAddons");
                        throw null;
                    }
                    viewArr[1] = recyclerView7;
                    a(viewArr);
                    ImageView imageView4 = (ImageView) findViewById(R.id.ivAddonsArrow);
                    dqc.b(imageView4, "ivAddonsArrow");
                    ImageView imageView5 = (ImageView) findViewById(R.id.ivMembersArrow);
                    dqc.b(imageView5, "ivMembersArrow");
                    a(imageView4, imageView5);
                    TextView[] textViewArr4 = new TextView[2];
                    TextView textView7 = this.k;
                    if (textView7 == null) {
                        dqc.a("tvAddons");
                        throw null;
                    }
                    textViewArr4[0] = textView7;
                    TextView textView8 = this.m;
                    if (textView8 == null) {
                        dqc.a("tvMembers");
                        throw null;
                    }
                    textViewArr4[1] = textView8;
                    a(textViewArr4);
                    d().a(this, getString(R.string.loading));
                    b().b();
                    b().a(this);
                }
                RecyclerView recyclerView8 = (RecyclerView) findViewById(R.id.rvGroupInfoBundles);
                dqc.b(recyclerView8, "rvGroupInfoBundles");
                a(recyclerView8);
                ImageView imageView6 = (ImageView) findViewById(R.id.ivBundleArrow);
                dqc.b(imageView6, "ivBundleArrow");
                a(imageView6);
                return;
            case R.id.expandCollapseMembers /* 2131362235 */:
                RecyclerView recyclerView9 = (RecyclerView) findViewById(R.id.rvGroupInfoMembers);
                dqc.b(recyclerView9, "rvGroupInfoMembers");
                a(a((View) recyclerView9));
                return;
            default:
                return;
        }
    }
}
