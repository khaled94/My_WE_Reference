package com.ucare.we.presentation.family.creategroup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.ucare.we.FamilyMoreDetailActivity;
import com.ucare.we.R;
import com.ucare.we.manageplanspostpaid.ManagePostPaidPlanActivity;
import com.ucare.we.model.ResponseHeader;
import com.ucare.we.model.ServerRequest;
import com.ucare.we.model.ServerResponse;
import com.ucare.we.model.SignInModel.GroupFamilyModel;
import com.ucare.we.model.family.FamilyChangeMainPlanBody;
import com.ucare.we.model.family.FamilyCreateGroupResponseBody;
import com.ucare.we.model.family.FamilyPlansResponseBody;
import com.ucare.we.presentation.family.groupinfo.GroupInfoActivity;
import com.ucare.we.presentation.family.groupinfo.managemembers.addmember.AddMemberActivity;
import com.ucare.we.presentation.genericconfirmation.GlobalConfirmationActivity;
import com.ucare.we.presentation.offers.UnNavigateResponseActivity;
import java.util.ArrayList;
import java.util.Arrays;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010>\u001a\u00020?H\u0002J\"\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020B2\b\u0010D\u001a\u0004\u0018\u00010EH\u0014J\u001a\u0010F\u001a\u00020?2\u0006\u0010G\u001a\u00020B2\b\u0010H\u001a\u0004\u0018\u00010\u000eH\u0016J'\u0010I\u001a\u00020?2\b\u0010J\u001a\u0004\u0018\u00010B2\u000e\u0010K\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010LH\u0016¢\u0006\u0002\u0010NJ\u0012\u0010O\u001a\u00020?2\b\u0010P\u001a\u0004\u0018\u00010QH\u0014J\u0018\u0010R\u001a\u00020?2\u0006\u0010G\u001a\u00020B2\u0006\u0010H\u001a\u00020\u000eH\u0016J\u0016\u0010S\u001a\u00020?2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020U0LH\u0016J\u0018\u0010V\u001a\u00020?2\u0006\u0010G\u001a\u00020B2\u0006\u0010H\u001a\u00020\u000eH\u0016J \u0010W\u001a\u00020?2\u0016\u0010X\u001a\u0012\u0012\u0004\u0012\u00020$0#j\b\u0012\u0004\u0012\u00020$`%H\u0016J\u0018\u0010Y\u001a\u00020?2\u0006\u0010Z\u001a\u00020\u000e2\u0006\u0010[\u001a\u00020\u000eH\u0016J\u0018\u0010\\\u001a\u00020?2\u0006\u0010]\u001a\u00020B2\u0006\u0010^\u001a\u00020$H\u0016J\u0010\u0010_\u001a\u00020?2\u0006\u0010`\u001a\u00020\u001cH\u0002R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR.\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020$\u0018\u00010#j\n\u0012\u0004\u0012\u00020$\u0018\u0001`%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R.\u0010*\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010#j\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R\u001c\u0010-\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0010\"\u0004\b/\u0010\u0012R\u001c\u00100\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0010\"\u0004\b2\u0010\u0012R\u001e\u00103\u001a\u0002048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u000e\u00109\u001a\u00020:X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020=X\u0082.¢\u0006\u0002\n\u0000¨\u0006a"}, d2 = {"Lcom/ucare/we/presentation/family/creategroup/CreateFamilyGroupPlansActivity;", "Lcom/ucare/we/injection/BaseActivity;", "Lcom/ucare/we/presentation/family/creategroup/OnFamilyPlanClickListener;", "Lcom/ucare/we/presentation/family/provider/FamilyPrimaryOffersListener;", "Lcom/ucare/we/presentation/family/provider/CreateGroupListener;", "Lcom/ucare/we/presentation/family/groupinfo/provider/ChangePlanListener;", "()V", "familyProvider", "Lcom/ucare/we/presentation/family/provider/FamilyProvider;", "getFamilyProvider", "()Lcom/ucare/we/presentation/family/provider/FamilyProvider;", "setFamilyProvider", "(Lcom/ucare/we/presentation/family/provider/FamilyProvider;)V", "groupId", "", "getGroupId", "()Ljava/lang/String;", "setGroupId", "(Ljava/lang/String;)V", "groupInfoProvider", "Lcom/ucare/we/presentation/family/groupinfo/provider/GroupInfoProvider;", "getGroupInfoProvider", "()Lcom/ucare/we/presentation/family/groupinfo/provider/GroupInfoProvider;", "setGroupInfoProvider", "(Lcom/ucare/we/presentation/family/groupinfo/provider/GroupInfoProvider;)V", "imgBackButton", "Landroid/widget/ImageView;", "isCreateNewGroup", "", "()Z", "setCreateNewGroup", "(Z)V", "isOffersAddons", "setOffersAddons", "list", "Ljava/util/ArrayList;", "Lcom/ucare/we/model/family/FamilyPlansResponseBody;", "Lkotlin/collections/ArrayList;", "getList", "()Ljava/util/ArrayList;", "setList", "(Ljava/util/ArrayList;)V", "numberList", "getNumberList", "setNumberList", "offerId", "getOfferId", "setOfferId", "parentOfferId", "getParentOfferId", "setParentOfferId", "progressHandler", "Lcom/ucare/we/util/ProgressHandler;", "getProgressHandler", "()Lcom/ucare/we/util/ProgressHandler;", "setProgressHandler", "(Lcom/ucare/we/util/ProgressHandler;)V", "rvPlans", "Landroidx/recyclerview/widget/RecyclerView;", "screenTitle", "tvPlansEmpty", "Landroid/widget/TextView;", "init", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onChangeMainPlanFailure", "failureReason", "failureMessage", "onChangeMainPlanSuccess", "responseCode", "result", "Lcom/ucare/we/model/ServerResponse;", "", "(Ljava/lang/Integer;Lcom/ucare/we/model/ServerResponse;)V", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateGroupFailure", "onCreateGroupSuccess", "familyCreateGroupResponse", "Lcom/ucare/we/model/family/FamilyCreateGroupResponseBody;", "onFamilyPrimaryOffersFailure", "onFamilyPrimaryOffersSuccess", "familyPrimaryOfferList", "onMoreDetailsClick", "urlEn", "urlAr", "onSubscribeClick", "position", "item", "togglePlansList", "shown", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CreateFamilyGroupPlansActivity extends czy implements deh, dfd, dfm, dfo {
    @Inject
    public dfp a;
    @Inject
    public dff b;
    @Inject
    public djg c;
    private String d;
    private ArrayList<FamilyPlansResponseBody> e;
    private ArrayList<String> f;
    private boolean g;
    private String h;
    private String i;
    private String j;
    private RecyclerView k;
    private ImageView l;
    private TextView m;

    public static /* synthetic */ void lambda$A1hzFposclpRiJRtWiN4H5TeLPs(CreateFamilyGroupPlansActivity createFamilyGroupPlansActivity, View view) {
        a(createFamilyGroupPlansActivity, view);
    }

    private dfp a() {
        dfp dfpVar = this.a;
        if (dfpVar != null) {
            return dfpVar;
        }
        dqc.a("familyProvider");
        throw null;
    }

    private dff b() {
        dff dffVar = this.b;
        if (dffVar != null) {
            return dffVar;
        }
        dqc.a("groupInfoProvider");
        throw null;
    }

    private djg c() {
        djg djgVar = this.c;
        if (djgVar != null) {
            return djgVar;
        }
        dqc.a("progressHandler");
        throw null;
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        super.onCreate(bundle);
        setContentView(R.layout.activity_create_family_group_plans);
        boolean booleanExtra = getIntent().getBooleanExtra("IS_CREATE_GROUP", true);
        this.g = booleanExtra;
        if (booleanExtra) {
            str = getString(R.string.create_group);
            str2 = "getString(R.string.create_group)";
        } else {
            str = getString(R.string.change_plan);
            str2 = "getString(R.string.change_plan)";
        }
        dqc.b(str, str2);
        this.d = str;
        if (str != null) {
            a(str, false, false);
            View findViewById = findViewById(R.id.rvPlans);
            dqc.b(findViewById, "findViewById(R.id.rvPlans)");
            this.k = (RecyclerView) findViewById;
            View findViewById2 = findViewById(R.id.imgBackButton);
            dqc.b(findViewById2, "findViewById(R.id.imgBackButton)");
            this.l = (ImageView) findViewById2;
            View findViewById3 = findViewById(R.id.tvNoConsumptionAvailable);
            dqc.b(findViewById3, "findViewById(R.id.tvNoConsumptionAvailable)");
            this.m = (TextView) findViewById3;
            ImageView imageView = this.l;
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.family.creategroup.-$$Lambda$CreateFamilyGroupPlansActivity$A1hzFposclpRiJRtWiN4H5TeLPs
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CreateFamilyGroupPlansActivity.lambda$A1hzFposclpRiJRtWiN4H5TeLPs(CreateFamilyGroupPlansActivity.this, view);
                    }
                });
                c().a(this, getString(R.string.loading));
                a().a();
                a().a((dfo) this);
                a().a((dfm) this);
                b().b = this;
                return;
            }
            dqc.a("imgBackButton");
            throw null;
        }
        dqc.a("screenTitle");
        throw null;
    }

    public static final void a(CreateFamilyGroupPlansActivity createFamilyGroupPlansActivity, View view) {
        dqc.d(createFamilyGroupPlansActivity, "this$0");
        createFamilyGroupPlansActivity.finish();
    }

    @Override // defpackage.deh
    public final void a(String str, String str2) {
        String str3;
        dqc.d(str, "urlEn");
        dqc.d(str2, "urlAr");
        if (o().f()) {
            str = str2;
        }
        if (this.g) {
            str3 = getString(R.string.createGroup);
            dqc.b(str3, "{\n            getString(R.string.createGroup)\n        }");
        } else {
            str3 = getString(R.string.chaneg_plan);
            dqc.b(str3, "{\n            getString(R.string.chaneg_plan)\n        }");
        }
        Intent intent = new Intent(this, FamilyMoreDetailActivity.class);
        intent.putExtra(FamilyMoreDetailActivity.a, str);
        intent.putExtra(FamilyMoreDetailActivity.b, str3);
        startActivity(intent);
    }

    @Override // defpackage.deh
    public final void a(int i, FamilyPlansResponseBody familyPlansResponseBody) {
        FamilyPlansResponseBody familyPlansResponseBody2;
        FamilyPlansResponseBody familyPlansResponseBody3;
        dqc.d(familyPlansResponseBody, "item");
        String string = getString(R.string.are_you_sure_to_migrate_to_new_plan);
        dqc.b(string, "getString(R.string.are_you_sure_to_migrate_to_new_plan)");
        Object[] objArr = new Object[2];
        ArrayList<FamilyPlansResponseBody> arrayList = this.e;
        objArr[0] = (arrayList == null || (familyPlansResponseBody3 = arrayList.get(i)) == null) ? null : familyPlansResponseBody3.getOfferEnName();
        String maxMemberLimit = familyPlansResponseBody.getMaxMemberLimit();
        if (maxMemberLimit == null) {
            maxMemberLimit = "0";
        }
        objArr[1] = maxMemberLimit;
        String format = String.format(string, Arrays.copyOf(objArr, 2));
        dqc.b(format, "java.lang.String.format(this, *args)");
        StringBuilder sb = new StringBuilder();
        sb.append(getString(R.string.are_you_sure_to_subscribe));
        sb.append(' ');
        ArrayList<FamilyPlansResponseBody> arrayList2 = this.e;
        sb.append((Object) ((arrayList2 == null || (familyPlansResponseBody2 = arrayList2.get(i)) == null) ? null : familyPlansResponseBody2.getOfferEnName()));
        sb.append(getString(R.string.quest));
        String sb2 = sb.toString();
        if (this.g) {
            format = sb2;
        }
        this.h = n().P().getId();
        this.i = familyPlansResponseBody.getOfferId();
        this.j = familyPlansResponseBody.getParentOfferId();
        Intent intent = new Intent(this, GlobalConfirmationActivity.class);
        String str = this.d;
        if (str == null) {
            dqc.a("screenTitle");
            throw null;
        }
        intent.putExtra("confirmation_title", str);
        intent.putExtra("confirmation_hint", format);
        startActivityForResult(intent, this.g ? 100 : 101);
    }

    @Override // defpackage.dfo
    public final void a(ArrayList<FamilyPlansResponseBody> arrayList) {
        dqc.d(arrayList, "familyPrimaryOfferList");
        c().a();
        this.e = arrayList;
        CreateFamilyGroupPlansActivity createFamilyGroupPlansActivity = this;
        def defVar = new def(createFamilyGroupPlansActivity, Boolean.valueOf(this.g), this.e, this);
        RecyclerView recyclerView = this.k;
        if (recyclerView == null) {
            dqc.a("rvPlans");
            throw null;
        }
        int i = 0;
        recyclerView.setLayoutManager(new LinearLayoutManager(createFamilyGroupPlansActivity, 1, false));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(defVar);
        ArrayList<FamilyPlansResponseBody> arrayList2 = this.e;
        boolean z = !(arrayList2 == null || arrayList2.isEmpty());
        RecyclerView recyclerView2 = this.k;
        if (recyclerView2 == null) {
            dqc.a("rvPlans");
            throw null;
        }
        if (!z) {
            i = 8;
        }
        recyclerView2.setVisibility(i);
        TextView textView = this.m;
        if (textView != null) {
            textView.setText(getString(z ? R.string.choose_plan_family_plan_empty : R.string.createGroupPlanEmpty));
        } else {
            dqc.a("tvPlansEmpty");
            throw null;
        }
    }

    @Override // defpackage.dfo
    public final void g(String str) {
        dqc.d(str, "failureMessage");
        c().a();
    }

    @Override // defpackage.dfm
    public final void a(ServerResponse<FamilyCreateGroupResponseBody> serverResponse) {
        dqc.d(serverResponse, "familyCreateGroupResponse");
        c().a();
        new Gson().a(serverResponse);
        UnNavigateResponseActivity.a(this, 0, getString(R.string.successful), serverResponse.getHeader().getResponseMessage(), false, true, false, 9010, false);
        GroupFamilyModel groupFamilyModel = new GroupFamilyModel();
        groupFamilyModel.setId(serverResponse.getBody().getGroupId());
        groupFamilyModel.setOwner(true);
        groupFamilyModel.setSubscribed(true);
        n().x(new Gson().a(groupFamilyModel));
    }

    @Override // defpackage.dfm
    public final void a(int i, String str) {
        dqc.d(str, "failureMessage");
        c().a();
        UnNavigateResponseActivity.a(this, i, str, getString(R.string.please_try_again), i == 3259 || i == 3239 || i == 9001 || i == 8001, false, true, 9010, false);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i == 100) {
                c().a(this, getString(R.string.loading));
                a().a(this.i);
            } else if (i == 101) {
                c().a(this, getString(R.string.loading));
                dff b = b();
                ServerRequest<FamilyChangeMainPlanBody> createServerRequest = ServerRequest.createServerRequest(b.a().m(), b.b().c.k(), new FamilyChangeMainPlanBody(this.h, this.i, this.j));
                new Gson().a(createServerRequest);
                eey<ServerResponse> w = b.c().w("https://api-my.te.eg/api/services/change/family/mainoffers", b.a().I(), createServerRequest);
                if (w == null) {
                    return;
                }
                w.a(b.h);
            } else if (i == 8000) {
                finish();
                Intent intent2 = new Intent(this, GroupInfoActivity.class);
                intent2.setFlags(603979776);
                startActivity(intent2);
            } else if (i != 9010 || intent == null) {
            } else {
                if (intent.getBooleanExtra("fromAddMemberClick", false)) {
                    finish();
                    startActivity(new Intent(this, AddMemberActivity.class));
                    return;
                }
                Intent intent3 = new Intent(this, ManagePostPaidPlanActivity.class);
                intent3.setFlags(603979776);
                startActivity(intent3);
            }
        }
    }

    @Override // defpackage.dfd
    public final void a(Integer num, ServerResponse<Object> serverResponse) {
        ResponseHeader header;
        ResponseHeader header2;
        c().a();
        String str = null;
        if (num != null && num.intValue() == 3258) {
            this.f = (ArrayList) (serverResponse == null ? null : serverResponse.getBody());
            CreateFamilyGroupPlansActivity createFamilyGroupPlansActivity = this;
            if (serverResponse != null && (header2 = serverResponse.getHeader()) != null) {
                str = header2.getResponseMessage();
            }
            UnNavigateResponseActivity.a(createFamilyGroupPlansActivity, "", str, this.f, num.intValue());
            return;
        }
        CreateFamilyGroupPlansActivity createFamilyGroupPlansActivity2 = this;
        String string = getString(R.string.successful);
        if (serverResponse != null && (header = serverResponse.getHeader()) != null) {
            str = header.getResponseMessage();
        }
        UnNavigateResponseActivity.a(createFamilyGroupPlansActivity2, 0, string, str, false, false, false, 9010, false);
    }

    @Override // defpackage.dfd
    public final void b(int i, String str) {
        c().a();
        UnNavigateResponseActivity.a(this, i, str, getString(R.string.please_try_again), i == 3259 || i == 3239 || i == 9001 || i == 8001, false, true, 8000, false);
    }
}
