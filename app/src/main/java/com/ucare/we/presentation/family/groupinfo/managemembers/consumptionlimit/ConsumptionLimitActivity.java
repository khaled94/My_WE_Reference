package com.ucare.we.presentation.family.groupinfo.managemembers.consumptionlimit;

import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ucare.we.R;
import com.ucare.we.model.ServerResponse;
import com.ucare.we.model.family.FamilySharedLimitDetails;
import com.ucare.we.model.local.managepaymentlimit.ManageConsumptionLimitRequestBody;
import com.ucare.we.model.remote.familygroupmember.GroupMember;
import com.ucare.we.presentation.genericconfirmation.GlobalConfirmationActivity;
import com.ucare.we.presentation.offers.UnNavigateResponseActivity;
import de.hdodenhof.circleimageview.CircleImageView;
import java.util.Arrays;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u00101\u001a\u000202H\u0002J\u0012\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000102H\u0002J\b\u00106\u001a\u000207H\u0002J\u0010\u00108\u001a\u0002092\u0006\u0010:\u001a\u000202H\u0002J\b\u0010;\u001a\u000207H\u0002J\u0010\u0010<\u001a\u0002072\u0006\u0010=\u001a\u000204H\u0002J\u0006\u0010>\u001a\u00020?J\b\u0010@\u001a\u000207H\u0002J\b\u0010A\u001a\u000204H\u0002J\b\u0010B\u001a\u000204H\u0002J\b\u0010C\u001a\u000207H\u0002J\"\u0010D\u001a\u0002072\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020F2\b\u0010H\u001a\u0004\u0018\u00010IH\u0014J\u0010\u0010J\u001a\u0002072\u0006\u0010K\u001a\u00020LH\u0016J\u0012\u0010M\u001a\u0002072\b\u0010N\u001a\u0004\u0018\u00010OH\u0014J\u001a\u0010P\u001a\u0002072\u0006\u0010Q\u001a\u00020F2\b\u0010R\u001a\u0004\u0018\u000102H\u0016J\u0016\u0010S\u001a\u0002072\f\u0010T\u001a\b\u0012\u0004\u0012\u0002020UH\u0016J\b\u0010V\u001a\u000207H\u0002J\b\u0010W\u001a\u000207H\u0002J\u000e\u0010X\u001a\u0002072\u0006\u0010Y\u001a\u000204R\u001a\u0010\u0005\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010%\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020,X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020,X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020,X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020,X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020,X\u0082.¢\u0006\u0002\n\u0000¨\u0006Z"}, d2 = {"Lcom/ucare/we/presentation/family/groupinfo/managemembers/consumptionlimit/ConsumptionLimitActivity;", "Lcom/ucare/we/injection/BaseActivity;", "Landroid/view/View$OnClickListener;", "Lcom/ucare/we/presentation/family/groupinfo/managemembers/consumptionlimit/ManageConsumptionLimitListener;", "()V", "backClickListener", "getBackClickListener", "()Landroid/view/View$OnClickListener;", "setBackClickListener", "(Landroid/view/View$OnClickListener;)V", "btnMemberRemoveLimit", "Landroid/widget/Button;", "btnMemberSetLimit", "chkLimitType", "Landroid/widget/CheckBox;", "cnlGroupLimitValue", "Landroidx/constraintlayout/widget/ConstraintLayout;", "etLimitValue", "Landroid/widget/EditText;", "familySharedLimitDetails", "Lcom/ucare/we/model/family/FamilySharedLimitDetails;", "getFamilySharedLimitDetails", "()Lcom/ucare/we/model/family/FamilySharedLimitDetails;", "setFamilySharedLimitDetails", "(Lcom/ucare/we/model/family/FamilySharedLimitDetails;)V", "groupMember", "Lcom/ucare/we/model/remote/familygroupmember/GroupMember;", "imgBackButton", "Landroid/widget/ImageView;", "ivContactProfile", "Lde/hdodenhof/circleimageview/CircleImageView;", "manageMemberConsumptionLimitProvider", "Lcom/ucare/we/presentation/family/groupinfo/managemembers/consumptionlimit/ManageMemberConsumptionLimitProvider;", "getManageMemberConsumptionLimitProvider", "()Lcom/ucare/we/presentation/family/groupinfo/managemembers/consumptionlimit/ManageMemberConsumptionLimitProvider;", "setManageMemberConsumptionLimitProvider", "(Lcom/ucare/we/presentation/family/groupinfo/managemembers/consumptionlimit/ManageMemberConsumptionLimitProvider;)V", "progressHandler", "Lcom/ucare/we/util/ProgressHandler;", "getProgressHandler", "()Lcom/ucare/we/util/ProgressHandler;", "setProgressHandler", "(Lcom/ucare/we/util/ProgressHandler;)V", "tvContactName", "Landroid/widget/TextView;", "tvContactNumber", "tvFreeUnitMeasure", "tvFreeUnitName", "txtTitle", "calcLimitValue", "", "checkIsEnabled", "", "str", "createOrUpdateConsumptionLimit", "", "createRequestBody", "Lcom/ucare/we/model/local/managepaymentlimit/ManageConsumptionLimitRequestBody;", "actionType", "deleteConsumptionLimit", "enableSetLimit", "isEnabled", "getUserInput", "", "initViews", "isCreateLimit", "isUnlimited", "loadData", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onClick", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFamilyManageConsumptionLimitFailure", "failureReason", "failureMessage", "onFamilyManageConsumptionLimitSuccess", "response", "Lcom/ucare/we/model/ServerResponse;", "preloadInput", "setListeners", "toggleViews", "isChecked", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ConsumptionLimitActivity extends czy implements View.OnClickListener, deu {
    @Inject
    public djg a;
    @Inject
    public dev b;
    private View.OnClickListener c = new View.OnClickListener() { // from class: com.ucare.we.presentation.family.groupinfo.managemembers.consumptionlimit.-$$Lambda$ConsumptionLimitActivity$QAzuECUkLFOLh5NDQfAZTp5ZXsc
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ConsumptionLimitActivity.lambda$QAzuECUkLFOLh5NDQfAZTp5ZXsc(ConsumptionLimitActivity.this, view);
        }
    };
    private GroupMember d;
    private ImageView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private CircleImageView i;
    private EditText j;
    private TextView k;
    private TextView l;
    private CheckBox m;
    private Button n;
    private Button o;
    private ConstraintLayout p;
    private FamilySharedLimitDetails q;

    /* renamed from: lambda$DA36h0aGyqjoF2ablRjI-hKDU-k */
    public static /* synthetic */ void m48lambda$DA36h0aGyqjoF2ablRjIhKDUk(ConsumptionLimitActivity consumptionLimitActivity, CompoundButton compoundButton, boolean z) {
        a(consumptionLimitActivity, compoundButton, z);
    }

    public static /* synthetic */ void lambda$QAzuECUkLFOLh5NDQfAZTp5ZXsc(ConsumptionLimitActivity consumptionLimitActivity, View view) {
        a(consumptionLimitActivity, view);
    }

    private djg a() {
        djg djgVar = this.a;
        if (djgVar != null) {
            return djgVar;
        }
        dqc.a("progressHandler");
        throw null;
    }

    private dev b() {
        dev devVar = this.b;
        if (devVar != null) {
            return devVar;
        }
        dqc.a("manageMemberConsumptionLimitProvider");
        throw null;
    }

    public static final void a(ConsumptionLimitActivity consumptionLimitActivity, View view) {
        dqc.d(consumptionLimitActivity, "this$0");
        consumptionLimitActivity.finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x021c  */
    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ucare.we.presentation.family.groupinfo.managemembers.consumptionlimit.ConsumptionLimitActivity.onCreate(android.os.Bundle):void");
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ucare/we/presentation/family/groupinfo/managemembers/consumptionlimit/ConsumptionLimitActivity$loadData$2", "Landroid/text/TextWatcher;", "afterTextChanged", "", "p0", "Landroid/text/Editable;", "beforeTextChanged", "", "p1", "", "p2", "p3", "onTextChanged", "str", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        a() {
            ConsumptionLimitActivity.this = r1;
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String valueOf = charSequence == null || charSequence.length() == 0 ? "0" : String.valueOf((int) Double.parseDouble(charSequence.toString()));
            ConsumptionLimitActivity consumptionLimitActivity = ConsumptionLimitActivity.this;
            consumptionLimitActivity.a(ConsumptionLimitActivity.a(consumptionLimitActivity, valueOf));
        }
    }

    public static final void a(ConsumptionLimitActivity consumptionLimitActivity, CompoundButton compoundButton, boolean z) {
        dqc.d(consumptionLimitActivity, "this$0");
        consumptionLimitActivity.b(z);
        consumptionLimitActivity.a(z);
    }

    private final boolean c() {
        FamilySharedLimitDetails familySharedLimitDetails = this.q;
        Float f = null;
        if ((familySharedLimitDetails == null ? null : familySharedLimitDetails.getLimitAmount()) != null) {
            FamilySharedLimitDetails familySharedLimitDetails2 = this.q;
            if (familySharedLimitDetails2 != null) {
                f = familySharedLimitDetails2.getLimitAmount();
            }
            return dqc.a(f, -1.0f);
        }
        return true;
    }

    public final void a(boolean z) {
        Button button = this.n;
        if (button == null) {
            dqc.a("btnMemberSetLimit");
            throw null;
        }
        button.setAlpha(z ? 1.0f : 0.5f);
        Button button2 = this.n;
        if (button2 != null) {
            button2.setEnabled(z);
        } else {
            dqc.a("btnMemberSetLimit");
            throw null;
        }
    }

    private final ManageConsumptionLimitRequestBody a(String str) {
        GroupMember groupMember = this.d;
        String serviceNumber = groupMember == null ? null : groupMember.getServiceNumber();
        String id = n().P().getId();
        FamilySharedLimitDetails familySharedLimitDetails = this.q;
        String freeUnitType = familySharedLimitDetails == null ? null : familySharedLimitDetails.getFreeUnitType();
        FamilySharedLimitDetails familySharedLimitDetails2 = this.q;
        String measureUnitId = familySharedLimitDetails2 == null ? null : familySharedLimitDetails2.getMeasureUnitId();
        FamilySharedLimitDetails familySharedLimitDetails3 = this.q;
        return new ManageConsumptionLimitRequestBody(serviceNumber, id, freeUnitType, measureUnitId, str, familySharedLimitDetails3 == null ? null : familySharedLimitDetails3.getLimitAmount());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        dqc.d(view, "view");
        StringBuilder sb = new StringBuilder();
        GroupMember groupMember = this.d;
        String str4 = "";
        if (groupMember == null || (str = groupMember.getServiceNumber()) == null) {
            str = str4;
        }
        sb.append(str);
        sb.append(' ');
        GroupMember groupMember2 = this.d;
        if (dqc.a(groupMember2 == null ? null : Boolean.valueOf(groupMember2.isOwner()), Boolean.FALSE)) {
            GroupMember groupMember3 = this.d;
            str4 = groupMember3 == null ? null : groupMember3.getContactNameOnDevice();
        }
        sb.append((Object) str4);
        String sb2 = sb.toString();
        Boolean l = n().l();
        dqc.b(l, "repository.isEnglish");
        if (l.booleanValue()) {
            FamilySharedLimitDetails familySharedLimitDetails = this.q;
            if (familySharedLimitDetails != null) {
                str2 = familySharedLimitDetails.getFreeUnitNameEn();
            }
            str2 = null;
        } else {
            FamilySharedLimitDetails familySharedLimitDetails2 = this.q;
            if (familySharedLimitDetails2 != null) {
                str2 = familySharedLimitDetails2.getFreeUnitNameAr();
            }
            str2 = null;
        }
        String a2 = dqc.a("\n", (Object) str2);
        Boolean l2 = n().l();
        dqc.b(l2, "repository.isEnglish");
        if (l2.booleanValue()) {
            FamilySharedLimitDetails familySharedLimitDetails3 = this.q;
            if (familySharedLimitDetails3 != null) {
                str3 = familySharedLimitDetails3.getMeasurementNameEn();
            }
            str3 = null;
        } else {
            FamilySharedLimitDetails familySharedLimitDetails4 = this.q;
            if (familySharedLimitDetails4 != null) {
                str3 = familySharedLimitDetails4.getMeasurementNameAr();
            }
            str3 = null;
        }
        String str5 = f() + ' ' + dqc.a(str3, (Object) "\n");
        switch (view.getId()) {
            case R.id.btnMemberRemoveLimit /* 2131361974 */:
                GlobalConfirmationActivity.a aVar = GlobalConfirmationActivity.a;
                GlobalConfirmationActivity.a.a(this, getString(R.string.remove_consumption_limit), getString(R.string.are_you_sure_to_remove_consumption_limit) + '(' + sb2 + ")?", 106);
                return;
            case R.id.btnMemberSetLimit /* 2131361975 */:
                String string = getString(R.string.add_consumption_limit);
                dqc.b(string, "getString(R.string.add_consumption_limit)");
                String string2 = getString(R.string.are_you_sure_to_add_consumption_limit);
                dqc.b(string2, "getString(R.string.are_you_sure_to_add_consumption_limit)");
                String string3 = getString(R.string.are_you_sure_to_update_consumption_limit_to_open);
                dqc.b(string3, "getString(R.string.are_you_sure_to_update_consumption_limit_to_open)");
                String format = String.format(string3, Arrays.copyOf(new Object[]{sb2, a2}, 2));
                dqc.b(format, "java.lang.String.format(this, *args)");
                CheckBox checkBox = this.m;
                if (checkBox == null) {
                    dqc.a("chkLimitType");
                    throw null;
                }
                if (!checkBox.isChecked()) {
                    format = String.format(string2, Arrays.copyOf(new Object[]{str5, sb2, a2}, 3));
                    dqc.b(format, "java.lang.String.format(this, *args)");
                }
                GlobalConfirmationActivity.a aVar2 = GlobalConfirmationActivity.a;
                GlobalConfirmationActivity.a.a(this, string, format, 105);
                return;
            default:
                return;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            return;
        }
        if (i != 105) {
            if (i != 106) {
                return;
            }
            a().a(this, getString(R.string.loading));
            ManageConsumptionLimitRequestBody a2 = a("delete");
            a2.setLimitAmount(Float.valueOf((float) f()));
            b().a(a2);
            b().a(this);
            return;
        }
        a().a(this, getString(R.string.loading));
        FamilySharedLimitDetails familySharedLimitDetails = this.q;
        ManageConsumptionLimitRequestBody a3 = a((familySharedLimitDetails == null ? null : familySharedLimitDetails.getLimitAmount()) == null ? "add" : "update");
        CheckBox checkBox = this.m;
        if (checkBox != null) {
            a3.setLimitAmount(Float.valueOf(checkBox.isChecked() ? -1.0f : (float) f()));
            b().a(a3);
            b().a(this);
            return;
        }
        dqc.a("chkLimitType");
        throw null;
    }

    private void b(boolean z) {
        if (z) {
            ConstraintLayout constraintLayout = this.p;
            if (constraintLayout == null) {
                dqc.a("cnlGroupLimitValue");
                throw null;
            }
            constraintLayout.setAlpha(0.5f);
            EditText editText = this.j;
            if (editText == null) {
                dqc.a("etLimitValue");
                throw null;
            }
            editText.setInputType(0);
            EditText editText2 = this.j;
            if (editText2 == null) {
                dqc.a("etLimitValue");
                throw null;
            }
            Editable text = editText2.getText();
            if (text != null) {
                text.clear();
            }
            EditText editText3 = this.j;
            if (editText3 != null) {
                editText3.clearFocus();
                return;
            } else {
                dqc.a("etLimitValue");
                throw null;
            }
        }
        d();
        ConstraintLayout constraintLayout2 = this.p;
        if (constraintLayout2 == null) {
            dqc.a("cnlGroupLimitValue");
            throw null;
        }
        constraintLayout2.setAlpha(1.0f);
        EditText editText4 = this.j;
        if (editText4 == null) {
            dqc.a("etLimitValue");
            throw null;
        }
        editText4.setInputType(2);
        EditText editText5 = this.j;
        if (editText5 != null) {
            editText5.requestFocus();
        } else {
            dqc.a("etLimitValue");
            throw null;
        }
    }

    private final void d() {
        String e = c() ? "" : e();
        EditText editText = this.j;
        if (editText != null) {
            editText.setText(e);
        } else {
            dqc.a("etLimitValue");
            throw null;
        }
    }

    private final String e() {
        Float limitAmount;
        FamilySharedLimitDetails familySharedLimitDetails = this.q;
        if (familySharedLimitDetails != null) {
            double d = 0.0d;
            double groupRemainingAmount = familySharedLimitDetails.getGroupRemainingAmount() + (familySharedLimitDetails.getLimitAmount() == null ? 0.0d : limitAmount.floatValue());
            Float remainingAmount = familySharedLimitDetails.getRemainingAmount();
            if (remainingAmount != null) {
                d = remainingAmount.floatValue();
            }
            return String.valueOf((int) (groupRemainingAmount - d));
        }
        return "0";
    }

    private long f() {
        EditText editText = this.j;
        if (editText == null) {
            dqc.a("etLimitValue");
            throw null;
        }
        String obj = editText.getText().toString();
        if (!(obj.length() == 0)) {
            return (long) Double.parseDouble(obj);
        }
        return 0L;
    }

    @Override // defpackage.deu
    public final void a(ServerResponse<String> serverResponse) {
        dqc.d(serverResponse, "response");
        a().a();
        finish();
        UnNavigateResponseActivity.a(this, 0, serverResponse.getHeader().getResponseMessage(), "", false, false, false, 9009, false);
    }

    @Override // defpackage.deu
    public final void a(int i, String str) {
        a().a();
        finish();
        UnNavigateResponseActivity.a(this, i, "", str, false, false, true, 9009, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (r6.isChecked() != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ boolean a(com.ucare.we.presentation.family.groupinfo.managemembers.consumptionlimit.ConsumptionLimitActivity r5, java.lang.String r6) {
        /*
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.lang.String r1 = r5.e()
            boolean r0 = defpackage.dqc.a(r0, r1)
            r1 = 1
            r2 = 0
            r3 = 0
            java.lang.String r4 = "chkLimitType"
            if (r0 != 0) goto L33
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            int r6 = r6.length()
            if (r6 <= 0) goto L21
            r6 = 1
            goto L22
        L21:
            r6 = 0
        L22:
            if (r6 == 0) goto L33
            android.widget.CheckBox r6 = r5.m
            if (r6 == 0) goto L2f
            boolean r6 = r6.isChecked()
            if (r6 == 0) goto L3d
            goto L33
        L2f:
            defpackage.dqc.a(r4)
            throw r3
        L33:
            android.widget.CheckBox r5 = r5.m
            if (r5 == 0) goto L3f
            boolean r5 = r5.isChecked()
            if (r5 == 0) goto L3e
        L3d:
            return r1
        L3e:
            return r2
        L3f:
            defpackage.dqc.a(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ucare.we.presentation.family.groupinfo.managemembers.consumptionlimit.ConsumptionLimitActivity.a(com.ucare.we.presentation.family.groupinfo.managemembers.consumptionlimit.ConsumptionLimitActivity, java.lang.String):boolean");
    }
}
