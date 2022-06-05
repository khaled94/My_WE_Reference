package com.ucare.we.presentation.family.groupinfo.managemembers.managegrouppaymentrelation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.ServerRequest;
import com.ucare.we.model.ServerResponse;
import com.ucare.we.model.family.FamilySharedLimitDetails;
import com.ucare.we.model.local.managegrouppaymentrelation.ManageGroupPaymentRelationRequest;
import com.ucare.we.model.remote.familygroupmember.GroupMember;
import com.ucare.we.model.remote.grouppaymentrelation.FamilyPaymentRelationResponse;
import com.ucare.we.presentation.family.groupinfo.managemembers.consumptionlimit.ConsumptionLimitActivity;
import com.ucare.we.presentation.family.groupinfo.managemembers.paymentlimit.PaymentLimitActivity;
import de.hdodenhof.circleimageview.CircleImageView;
import defpackage.det;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u00104\u001a\u00020\u001c2\u0006\u00105\u001a\u00020\u000eH\u0002J\b\u00106\u001a\u000207H\u0002J\u0012\u00108\u001a\u0002072\b\u00109\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010:\u001a\u0002072\b\u0010;\u001a\u0004\u0018\u00010<H\u0014J\u001a\u0010=\u001a\u0002072\u0006\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010\u001cH\u0016J\u0016\u0010A\u001a\u0002072\f\u00105\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u001a\u0010B\u001a\u0002072\u0006\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010\u001cH\u0016J\u001c\u0010C\u001a\u0002072\u0012\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0DH\u0016J\b\u0010E\u001a\u000207H\u0014J\u000e\u0010F\u001a\u0004\u0018\u00010\u001c*\u00020\u001cH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010'\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u000e\u0010-\u001a\u00020.X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000200X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000200X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000200X\u0082.¢\u0006\u0002\n\u0000¨\u0006G"}, d2 = {"Lcom/ucare/we/presentation/family/groupinfo/managemembers/managegrouppaymentrelation/ManageMemberLimitsActivity;", "Lcom/ucare/we/injection/BaseActivity;", "Lcom/ucare/we/presentation/family/groupinfo/managemembers/managegrouppaymentrelation/ManagePaymentRelationListener;", "Lcom/ucare/we/presentation/family/provider/FamilyQueryConsumptionLimitListener;", "Lcom/ucare/we/presentation/family/groupinfo/managemembers/FamilyConsumptionLimitAdapter$ConsumptionAdapterOnClickHandler;", "()V", "adapter", "Lcom/ucare/we/presentation/family/groupinfo/managemembers/FamilyConsumptionLimitAdapter;", "btnGroupMemberSetLimit", "Landroid/widget/Button;", "familyLimitList", "Ljava/util/ArrayList;", "Lcom/ucare/we/model/family/FamilySharedLimitDetails;", "familyPaymentRelationResponse", "Lcom/ucare/we/model/remote/grouppaymentrelation/FamilyPaymentRelationResponse;", "familyProvider", "Lcom/ucare/we/presentation/family/provider/FamilyProvider;", "getFamilyProvider", "()Lcom/ucare/we/presentation/family/provider/FamilyProvider;", "setFamilyProvider", "(Lcom/ucare/we/presentation/family/provider/FamilyProvider;)V", "groupMember", "Lcom/ucare/we/model/remote/familygroupmember/GroupMember;", "imgBackButton", "Landroid/widget/ImageView;", "ivContactProfile", "Lde/hdodenhof/circleimageview/CircleImageView;", "mServiceNumber", "", "getMServiceNumber", "()Ljava/lang/String;", "setMServiceNumber", "(Ljava/lang/String;)V", "manageGroupPaymentRelationProvider", "Lcom/ucare/we/presentation/family/groupinfo/managemembers/managegrouppaymentrelation/ManageGroupPaymentRelationProvider;", "getManageGroupPaymentRelationProvider", "()Lcom/ucare/we/presentation/family/groupinfo/managemembers/managegrouppaymentrelation/ManageGroupPaymentRelationProvider;", "setManageGroupPaymentRelationProvider", "(Lcom/ucare/we/presentation/family/groupinfo/managemembers/managegrouppaymentrelation/ManageGroupPaymentRelationProvider;)V", "progressHandler", "Lcom/ucare/we/util/ProgressHandler;", "getProgressHandler", "()Lcom/ucare/we/util/ProgressHandler;", "setProgressHandler", "(Lcom/ucare/we/util/ProgressHandler;)V", "rvConsumedLimit", "Landroidx/recyclerview/widget/RecyclerView;", "tvContactName", "Landroid/widget/TextView;", "tvContactNumber", "tvRemaining", "txtTitle", "getAllRemainingText", "serverResponse", "initView", "", "onClick", "item", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFamilyQueryConsumptionLimitFailure", "failureReason", "", "failureMessage", "onFamilyQueryConsumptionLimitSuccess", "onManagePaymentRelationFailure", "onManagePaymentRelationSuccess", "Lcom/ucare/we/model/ServerResponse;", "onResume", "formatDouble", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ManageMemberLimitsActivity extends czy implements det.a, dex, dfq {
    @Inject
    public djg a;
    public String b;
    @Inject
    public dew c;
    @Inject
    public dfp d;
    private det e;
    private ImageView f;
    private TextView g;
    private ArrayList<FamilySharedLimitDetails> h;
    private TextView i;
    private TextView j;
    private TextView k;
    private CircleImageView l;
    private Button m;
    private RecyclerView n;
    private GroupMember o;
    private FamilyPaymentRelationResponse p;

    public static /* synthetic */ void lambda$9oHxOq4N4cnlSR7Fx1PdMsk3dpQ(ManageMemberLimitsActivity manageMemberLimitsActivity, View view) {
        a(manageMemberLimitsActivity, view);
    }

    /* renamed from: lambda$PLwwiTw9xTaP-4ymunIcAB9Ax_g */
    public static /* synthetic */ void m49lambda$PLwwiTw9xTaP4ymunIcAB9Ax_g(ManageMemberLimitsActivity manageMemberLimitsActivity, View view) {
        b(manageMemberLimitsActivity, view);
    }

    private djg c() {
        djg djgVar = this.a;
        if (djgVar != null) {
            return djgVar;
        }
        dqc.a("progressHandler");
        throw null;
    }

    private dew d() {
        dew dewVar = this.c;
        if (dewVar != null) {
            return dewVar;
        }
        dqc.a("manageGroupPaymentRelationProvider");
        throw null;
    }

    private dfp e() {
        dfp dfpVar = this.d;
        if (dfpVar != null) {
            return dfpVar;
        }
        dqc.a("familyProvider");
        throw null;
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_manage_member_limits);
        a(getString(R.string.manage_member_limits), false, false);
        View findViewById = findViewById(R.id.txtTitle);
        dqc.b(findViewById, "findViewById(R.id.txtTitle)");
        this.g = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.imgBackButton);
        dqc.b(findViewById2, "findViewById(R.id.imgBackButton)");
        this.f = (ImageView) findViewById2;
        View findViewById3 = findViewById(R.id.tvContactNumber);
        dqc.b(findViewById3, "findViewById(R.id.tvContactNumber)");
        this.i = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.tvContactName);
        dqc.b(findViewById4, "findViewById(R.id.tvContactName)");
        this.j = (TextView) findViewById4;
        View findViewById5 = findViewById(R.id.ivContactProfile);
        dqc.b(findViewById5, "findViewById(R.id.ivContactProfile)");
        this.l = (CircleImageView) findViewById5;
        View findViewById6 = findViewById(R.id.tvRemaining);
        dqc.b(findViewById6, "findViewById(R.id.tvRemaining)");
        this.k = (TextView) findViewById6;
        View findViewById7 = findViewById(R.id.btnGroupMemberSetLimit);
        dqc.b(findViewById7, "findViewById(R.id.btnGroupMemberSetLimit)");
        this.m = (Button) findViewById7;
        View findViewById8 = findViewById(R.id.rvConsumedLimit);
        dqc.b(findViewById8, "findViewById(R.id.rvConsumedLimit)");
        this.n = (RecyclerView) findViewById8;
        TextView textView = this.g;
        if (textView == null) {
            dqc.a("txtTitle");
            throw null;
        }
        textView.setText(R.string.manage_member_limits);
        ImageView imageView = this.f;
        if (imageView == null) {
            dqc.a("imgBackButton");
            throw null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.family.groupinfo.managemembers.managegrouppaymentrelation.-$$Lambda$ManageMemberLimitsActivity$9oHxOq4N4cnlSR7Fx1PdMsk3dpQ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ManageMemberLimitsActivity.lambda$9oHxOq4N4cnlSR7Fx1PdMsk3dpQ(ManageMemberLimitsActivity.this, view);
            }
        });
        Button button = this.m;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.family.groupinfo.managemembers.managegrouppaymentrelation.-$$Lambda$ManageMemberLimitsActivity$PLwwiTw9xTaP-4ymunIcAB9Ax_g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ManageMemberLimitsActivity.m49lambda$PLwwiTw9xTaP4ymunIcAB9Ax_g(ManageMemberLimitsActivity.this, view);
                }
            });
            GroupMember groupMember = (GroupMember) getIntent().getParcelableExtra("GROUP_MEMBER_ITEM");
            this.o = groupMember;
            if (groupMember == null) {
                return;
            }
            TextView textView2 = this.i;
            if (textView2 == null) {
                dqc.a("tvContactNumber");
                throw null;
            }
            textView2.setText(groupMember.getServiceNumber());
            String serviceNumber = groupMember.getServiceNumber();
            dqc.d(serviceNumber, "<set-?>");
            this.b = serviceNumber;
            TextView textView3 = this.j;
            if (textView3 == null) {
                dqc.a("tvContactName");
                throw null;
            }
            textView3.setText(!groupMember.isOwner() ? groupMember.getContactNameOnDevice() : "");
            CircleImageView circleImageView = this.l;
            if (circleImageView == null) {
                dqc.a("ivContactProfile");
                throw null;
            }
            circleImageView.setImageBitmap(groupMember.getContactImageOnDevice());
            c().a(this, getString(R.string.loading));
            return;
        }
        dqc.a("btnGroupMemberSetLimit");
        throw null;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        String serviceNumber;
        super.onResume();
        dew d = d();
        GroupMember groupMember = this.o;
        String str = "";
        if (groupMember != null && (serviceNumber = groupMember.getServiceNumber()) != null) {
            str = serviceNumber;
        }
        dqc.d(str, "mssisdn");
        ManageGroupPaymentRelationRequest manageGroupPaymentRelationRequest = new ManageGroupPaymentRelationRequest(d.a().P().getId(), str);
        String m = d.a().m();
        djb djbVar = d.b;
        if (djbVar != null) {
            ServerRequest<ManageGroupPaymentRelationRequest> createServerRequest = ServerRequest.createServerRequest(m, djbVar.c.k(), manageGroupPaymentRelationRequest);
            diq diqVar = d.c;
            if (diqVar != null) {
                diqVar.k("https://api-my.te.eg/api/family/payment-relation", d.a().I(), createServerRequest).a(d.f);
                d().e = this;
                dfp e = e();
                String str2 = this.b;
                if (str2 != null) {
                    e.b(str2);
                    e().a(this);
                    return;
                }
                dqc.a("mServiceNumber");
                throw null;
            }
            dqc.a("apiInterface");
            throw null;
        }
        dqc.a("languageSwitcher");
        throw null;
    }

    public static final void a(ManageMemberLimitsActivity manageMemberLimitsActivity, View view) {
        dqc.d(manageMemberLimitsActivity, "this$0");
        manageMemberLimitsActivity.finish();
    }

    public static final void b(ManageMemberLimitsActivity manageMemberLimitsActivity, View view) {
        dqc.d(manageMemberLimitsActivity, "this$0");
        Intent intent = new Intent(manageMemberLimitsActivity, PaymentLimitActivity.class);
        intent.putExtra("GROUP_MEMBER_ITEM", manageMemberLimitsActivity.o);
        intent.putExtra("GROUP_PAYMENT_RELATION", manageMemberLimitsActivity.p);
        manageMemberLimitsActivity.startActivity(intent);
    }

    @Override // defpackage.dex
    public final void a(ServerResponse<ArrayList<FamilyPaymentRelationResponse>> serverResponse) {
        ArrayList<FamilyPaymentRelationResponse> body;
        String str;
        dqc.d(serverResponse, "serverResponse");
        c().a();
        dqc.b(serverResponse.getBody(), "serverResponse.body");
        if (!body.isEmpty()) {
            TextView textView = this.k;
            if (textView == null) {
                dqc.a("tvRemaining");
                throw null;
            }
            FamilyPaymentRelationResponse familyPaymentRelationResponse = serverResponse.getBody().get(0);
            dqc.b(familyPaymentRelationResponse, "serverResponse.body[0]");
            FamilyPaymentRelationResponse familyPaymentRelationResponse2 = familyPaymentRelationResponse;
            if (familyPaymentRelationResponse2.getLimitValueType().equals(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS)) {
                StringBuilder sb = new StringBuilder();
                dqi dqiVar = dqi.a;
                String format = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(familyPaymentRelationResponse2.getLimitValue())}, 1));
                dqc.b(format, "java.lang.String.format(locale, format, *args)");
                sb.append((Object) a(format));
                sb.append(' ');
                sb.append(getString(R.string.egp));
                str = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append((int) familyPaymentRelationResponse2.getLimitValue());
                sb2.append('%');
                str = sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            String string = getString(R.string.payment_rel_consumed_limit);
            dqc.b(string, "getString(R.string.payment_rel_consumed_limit)");
            dqi dqiVar2 = dqi.a;
            String format2 = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(familyPaymentRelationResponse2.getUsageAmount())}, 1));
            dqc.b(format2, "java.lang.String.format(locale, format, *args)");
            String format3 = String.format(string, Arrays.copyOf(new Object[]{a(format2)}, 1));
            dqc.b(format3, "java.lang.String.format(this, *args)");
            sb3.append(format3);
            sb3.append(' ');
            sb3.append(getString(R.string.egp));
            textView.setText((getString(R.string.limit) + ' ' + str) + '\n' + sb3.toString());
            this.p = serverResponse.getBody().get(0);
            return;
        }
        TextView textView2 = this.k;
        if (textView2 == null) {
            dqc.a("tvRemaining");
            throw null;
        }
        textView2.setText(getString(R.string.noPaymentRelation));
        this.p = null;
    }

    private static String a(String str) {
        return new DecimalFormat("#.##", new DecimalFormatSymbols(Locale.ENGLISH)).format(Double.parseDouble(str)).toString();
    }

    @Override // defpackage.dex
    public final void a() {
        c().a();
    }

    @Override // defpackage.dfq
    public final void a(ArrayList<FamilySharedLimitDetails> arrayList) {
        dqc.d(arrayList, "serverResponse");
        c().a();
        this.h = arrayList;
        ManageMemberLimitsActivity manageMemberLimitsActivity = this;
        ManageMemberLimitsActivity manageMemberLimitsActivity2 = this;
        if (arrayList != null) {
            det detVar = new det(manageMemberLimitsActivity, manageMemberLimitsActivity2, arrayList, this);
            this.e = detVar;
            RecyclerView recyclerView = this.n;
            if (recyclerView == null) {
                dqc.a("rvConsumedLimit");
                throw null;
            } else if (detVar != null) {
                recyclerView.setAdapter(detVar);
                return;
            } else {
                dqc.a("adapter");
                throw null;
            }
        }
        dqc.a("familyLimitList");
        throw null;
    }

    @Override // defpackage.dfq
    public final void b() {
        c().a();
    }

    @Override // defpackage.det.a
    public final void a(FamilySharedLimitDetails familySharedLimitDetails) {
        String.valueOf(familySharedLimitDetails);
        Intent intent = new Intent(this, ConsumptionLimitActivity.class);
        intent.putExtra("GROUP_CONSUMPTION_LIMIT", familySharedLimitDetails);
        intent.putExtra("GROUP_MEMBER_ITEM", this.o);
        startActivity(intent);
    }
}
