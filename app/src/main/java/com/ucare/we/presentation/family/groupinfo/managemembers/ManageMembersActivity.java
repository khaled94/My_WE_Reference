package com.ucare.we.presentation.family.groupinfo.managemembers;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.ServerResponse;
import com.ucare.we.model.remote.familygroupmember.FamilyGroupMember;
import com.ucare.we.model.remote.familygroupmember.GroupMember;
import com.ucare.we.presentation.family.groupinfo.managemembers.addmember.AddMemberActivity;
import com.ucare.we.presentation.family.groupinfo.managemembers.managegrouppaymentrelation.ManageMemberLimitsActivity;
import com.ucare.we.presentation.genericconfirmation.GlobalConfirmationActivity;
import com.ucare.we.presentation.offers.UnNavigateResponseActivity;
import java.util.ArrayList;
import java.util.Arrays;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\"\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\u0012\u0010%\u001a\u00020\u001d2\b\u0010&\u001a\u0004\u0018\u00010'H\u0014J\u001a\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020!2\b\u0010*\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020-H\u0016J\u001a\u0010.\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020!2\b\u0010*\u001a\u0004\u0018\u00010\u001aH\u0016J\u0016\u0010/\u001a\u00020\u001d2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001a01H\u0016J\b\u00102\u001a\u00020\u001dH\u0014J\b\u00103\u001a\u00020\u001dH\u0002J\b\u00104\u001a\u00020\u001dH\u0002J\u0010\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u000207H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/ucare/we/presentation/family/groupinfo/managemembers/ManageMembersActivity;", "Lcom/ucare/we/injection/BaseActivity;", "Lcom/ucare/we/presentation/family/groupinfo/managemembers/provider/ManageNumbersListener;", "Lcom/ucare/we/presentation/family/groupinfo/managemembers/provider/NumbersActionsListener;", "()V", "btnAddMember", "Landroid/widget/TextView;", "groupMembersAdapter", "Lcom/ucare/we/presentation/family/groupinfo/adapters/GroupMembersAdapter;", "imgBackButton", "Landroid/widget/ImageView;", "manageNumbersProvider", "Lcom/ucare/we/presentation/family/groupinfo/managemembers/provider/ManageNumbersProvider;", "getManageNumbersProvider", "()Lcom/ucare/we/presentation/family/groupinfo/managemembers/provider/ManageNumbersProvider;", "setManageNumbersProvider", "(Lcom/ucare/we/presentation/family/groupinfo/managemembers/provider/ManageNumbersProvider;)V", "progressHandler", "Lcom/ucare/we/util/ProgressHandler;", "getProgressHandler", "()Lcom/ucare/we/util/ProgressHandler;", "setProgressHandler", "(Lcom/ucare/we/util/ProgressHandler;)V", "rvMembers", "Landroidx/recyclerview/widget/RecyclerView;", "serviceNumber", "", "txtTitle", "hideLoading", "", "initViews", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onManageNumberFailure", "failureReason", "failureMessage", "onManageNumberSuccess", "familySubscribedOfferList", "Lcom/ucare/we/model/remote/familygroupmember/FamilyGroupMember;", "onNumbersActionFailure", "onNumbersActionSuccess", "response", "Lcom/ucare/we/model/ServerResponse;", "onResume", "setupGroupMembersAdapter", "showLoading", "toggleRecyclerMembers", "visibility", "", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ManageMembersActivity extends czy implements dfa, dfc {
    @Inject
    public dfb a;
    @Inject
    public djg b;
    private ImageView c;
    private TextView d;
    private TextView e;
    private RecyclerView f;
    private String g = "";
    private den h;

    public static /* synthetic */ void lambda$B2I1uRGLGKruQZyiGgdNlr_tl8M(ManageMembersActivity manageMembersActivity, View view) {
        a(manageMembersActivity, view);
    }

    public static /* synthetic */ void lambda$FWhm44Ro5dF5dwLTTt_5XGhAJHg(ManageMembersActivity manageMembersActivity, View view) {
        b(manageMembersActivity, view);
    }

    private dfb a() {
        dfb dfbVar = this.a;
        if (dfbVar != null) {
            return dfbVar;
        }
        dqc.a("manageNumbersProvider");
        throw null;
    }

    private djg b() {
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
        setContentView(R.layout.activity_manage_members);
        a(getString(R.string.mangeMembers), false, false);
        View findViewById = findViewById(R.id.txtTitle);
        dqc.b(findViewById, "findViewById(R.id.txtTitle)");
        this.d = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.imgBackButton);
        dqc.b(findViewById2, "findViewById(R.id.imgBackButton)");
        this.c = (ImageView) findViewById2;
        View findViewById3 = findViewById(R.id.btnAddMember);
        dqc.b(findViewById3, "findViewById(R.id.btnAddMember)");
        this.e = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.rvMembers);
        dqc.b(findViewById4, "findViewById(R.id.rvMembers)");
        this.f = (RecyclerView) findViewById4;
        TextView textView = this.d;
        if (textView == null) {
            dqc.a("txtTitle");
            throw null;
        }
        textView.setText(R.string.mangeMembers);
        ImageView imageView = this.c;
        if (imageView == null) {
            dqc.a("imgBackButton");
            throw null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.family.groupinfo.managemembers.-$$Lambda$ManageMembersActivity$FWhm44Ro5dF5dwLTTt_5XGhAJHg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ManageMembersActivity.lambda$FWhm44Ro5dF5dwLTTt_5XGhAJHg(ManageMembersActivity.this, view);
            }
        });
        b().a();
        this.h = new den();
        RecyclerView recyclerView = this.f;
        if (recyclerView == null) {
            dqc.a("rvMembers");
            throw null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        den denVar = this.h;
        if (denVar == null) {
            dqc.a("groupMembersAdapter");
            throw null;
        }
        recyclerView.setAdapter(denVar);
        den denVar2 = this.h;
        if (denVar2 == null) {
            dqc.a("groupMembersAdapter");
            throw null;
        }
        a aVar = new a();
        dqc.d(aVar, "clickListener");
        denVar2.a = aVar;
        TextView textView2 = this.e;
        if (textView2 == null) {
            dqc.a("btnAddMember");
            throw null;
        }
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.family.groupinfo.managemembers.-$$Lambda$ManageMembersActivity$B2I1uRGLGKruQZyiGgdNlr_tl8M
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ManageMembersActivity.lambda$B2I1uRGLGKruQZyiGgdNlr_tl8M(ManageMembersActivity.this, view);
            }
        });
        a().a = this;
        a().f = this;
    }

    public static final void a(ManageMembersActivity manageMembersActivity, View view) {
        dqc.d(manageMembersActivity, "this$0");
        manageMembersActivity.startActivity(new Intent(manageMembersActivity, AddMemberActivity.class));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        c();
        dfb a2 = a();
        String id = n().P().getId();
        dqc.b(id, "repository.familyGroup.id");
        a2.a(id);
    }

    private final void c() {
        b().a(this, getString(R.string.loading));
    }

    public static final void b(ManageMembersActivity manageMembersActivity, View view) {
        dqc.d(manageMembersActivity, "this$0");
        manageMembersActivity.finish();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, d2 = {"<anonymous>", "", "clickedView", "Landroid/view/View;", "item", "Lcom/ucare/we/model/remote/familygroupmember/GroupMember;", "position", ""}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    static final class a extends dqd implements dpl<View, GroupMember, Integer, dmg> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(3);
            ManageMembersActivity.this = r1;
        }

        @Override // defpackage.dpl
        public final /* synthetic */ dmg a(View view, GroupMember groupMember, Integer num) {
            String serviceNumber;
            View view2 = view;
            GroupMember groupMember2 = groupMember;
            num.intValue();
            dqc.d(view2, "clickedView");
            int id = view2.getId();
            if (id == R.id.tvRemoveMember) {
                ManageMembersActivity manageMembersActivity = ManageMembersActivity.this;
                String str = "";
                if (groupMember2 != null && (serviceNumber = groupMember2.getServiceNumber()) != null) {
                    str = serviceNumber;
                }
                manageMembersActivity.g = str;
                GlobalConfirmationActivity.a aVar = GlobalConfirmationActivity.a;
                ManageMembersActivity manageMembersActivity2 = ManageMembersActivity.this;
                ManageMembersActivity manageMembersActivity3 = manageMembersActivity2;
                String string = manageMembersActivity2.getString(R.string.removeFamilyMember);
                String string2 = ManageMembersActivity.this.getString(R.string.deleteFamilyMemberMessage);
                dqc.b(string2, "getString(R.string.deleteFamilyMemberMessage)");
                Object[] objArr = new Object[2];
                String str2 = null;
                objArr[0] = groupMember2 == null ? null : groupMember2.getServiceNumber();
                if (groupMember2 != null) {
                    str2 = groupMember2.getContactNameOnDevice();
                }
                objArr[1] = str2;
                String format = String.format(string2, Arrays.copyOf(objArr, 2));
                dqc.b(format, "java.lang.String.format(this, *args)");
                GlobalConfirmationActivity.a.a(manageMembersActivity3, string, format, 9009);
            } else if (id == R.id.tvSetLimit) {
                Intent intent = new Intent(ManageMembersActivity.this, ManageMemberLimitsActivity.class);
                intent.putExtra("GROUP_MEMBER_ITEM", groupMember2);
                ManageMembersActivity.this.startActivity(intent);
            }
            return dmg.a;
        }
    }

    @Override // defpackage.dfa
    public final void a(FamilyGroupMember familyGroupMember) {
        dqc.d(familyGroupMember, "familySubscribedOfferList");
        ArrayList<GroupMember> groupMembers = familyGroupMember.getGroupMembers();
        den denVar = this.h;
        if (denVar == null) {
            dqc.a("groupMembersAdapter");
            throw null;
        }
        denVar.submitList(groupMembers);
        a(!groupMembers.isEmpty());
        b().a();
    }

    private final void a(boolean z) {
        RecyclerView recyclerView;
        int i;
        if (z) {
            recyclerView = this.f;
            if (recyclerView == null) {
                dqc.a("rvMembers");
                throw null;
            }
            i = 0;
        } else {
            recyclerView = this.f;
            if (recyclerView == null) {
                dqc.a("rvMembers");
                throw null;
            }
            i = 8;
        }
        recyclerView.setVisibility(i);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 9009) {
            c();
            a().a("delete", this.g);
        }
    }

    @Override // defpackage.dfc
    public final void a(ServerResponse<String> serverResponse) {
        dqc.d(serverResponse, "response");
        b().a();
        UnNavigateResponseActivity.a(this, 0, serverResponse.getHeader().getResponseMessage(), "", false, false, false, 9000, false);
    }

    @Override // defpackage.dfc
    public final void b(int i, String str) {
        b().a();
        UnNavigateResponseActivity.a(this, i, str, getString(R.string.please_try_again), false, false, true, 9000, false);
    }

    @Override // defpackage.dfa
    public final void b(String str) {
        b().a();
        a(false);
    }
}
