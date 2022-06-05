package com.ucare.we.presentation.family.groupinfo.managemembers.paymentlimit;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import com.ucare.we.R;
import com.ucare.we.model.ServerResponse;
import com.ucare.we.model.local.managepaymentlimit.ManagePaymentLimitRequestBody;
import com.ucare.we.model.local.managepaymentlimit.PaymentRelation;
import com.ucare.we.model.remote.familygroupmember.GroupMember;
import com.ucare.we.model.remote.grouppaymentrelation.FamilyPaymentRelationResponse;
import com.ucare.we.presentation.genericconfirmation.GlobalConfirmationActivity;
import com.ucare.we.presentation.offers.UnNavigateResponseActivity;
import de.hdodenhof.circleimageview.CircleImageView;
import defpackage.dqf;
import java.util.Arrays;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0012\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010(H\u0002J\u0006\u00105\u001a\u000206J\u0010\u00107\u001a\u0002062\u0006\u00108\u001a\u000209H\u0002J\u0010\u0010:\u001a\u0002062\u0006\u00108\u001a\u000209H\u0002J\u0010\u0010;\u001a\u0002062\u0006\u0010<\u001a\u000203H\u0002J\u0006\u0010=\u001a\u00020>J\b\u0010?\u001a\u000206H\u0002J\b\u0010@\u001a\u000206H\u0002J\"\u0010A\u001a\u0002062\u0006\u0010B\u001a\u00020\u00142\u0006\u0010C\u001a\u00020\u00142\b\u0010D\u001a\u0004\u0018\u00010EH\u0014J\u0010\u0010F\u001a\u0002062\u0006\u0010G\u001a\u00020HH\u0016J\u0012\u0010I\u001a\u0002062\b\u0010J\u001a\u0004\u0018\u00010KH\u0014J\u001a\u0010L\u001a\u0002062\u0006\u0010M\u001a\u00020\u00142\b\u0010N\u001a\u0004\u0018\u00010(H\u0016J\u0016\u0010O\u001a\u0002062\f\u0010P\u001a\b\u0012\u0004\u0012\u00020(0QH\u0016J\u0010\u0010R\u001a\u0002062\u0006\u0010S\u001a\u00020\u0014H\u0002J\b\u0010T\u001a\u000206H\u0002J\b\u0010U\u001a\u000206H\u0002J\b\u0010V\u001a\u000206H\u0002R\u001a\u0010\u0005\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020&X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010'\u001a\u00020(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u000e\u0010-\u001a\u00020.X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020.X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020.X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020.X\u0082.¢\u0006\u0002\n\u0000¨\u0006W"}, d2 = {"Lcom/ucare/we/presentation/family/groupinfo/managemembers/paymentlimit/PaymentLimitActivity;", "Lcom/ucare/we/injection/BaseActivity;", "Landroid/view/View$OnClickListener;", "Lcom/ucare/we/presentation/family/groupinfo/managemembers/paymentlimit/ManagePaymentLimitListener;", "()V", "backClickListener", "getBackClickListener", "()Landroid/view/View$OnClickListener;", "setBackClickListener", "(Landroid/view/View$OnClickListener;)V", "btnMemberRemoveLimit", "Landroid/widget/Button;", "btnMemberSetLimit", "etLimitValue", "Landroid/widget/EditText;", "groupMember", "Lcom/ucare/we/model/remote/familygroupmember/GroupMember;", "imgBackButton", "Landroid/widget/ImageView;", "isSelected", "", "ivContactProfile", "Lde/hdodenhof/circleimageview/CircleImageView;", "manageMemberPaymentLimitProvider", "Lcom/ucare/we/presentation/family/groupinfo/managemembers/paymentlimit/ManageMemberPaymentLimitProvider;", "getManageMemberPaymentLimitProvider", "()Lcom/ucare/we/presentation/family/groupinfo/managemembers/paymentlimit/ManageMemberPaymentLimitProvider;", "setManageMemberPaymentLimitProvider", "(Lcom/ucare/we/presentation/family/groupinfo/managemembers/paymentlimit/ManageMemberPaymentLimitProvider;)V", "paymentLimitResponse", "Lcom/ucare/we/model/remote/grouppaymentrelation/FamilyPaymentRelationResponse;", "progressHandler", "Lcom/ucare/we/util/ProgressHandler;", "getProgressHandler", "()Lcom/ucare/we/util/ProgressHandler;", "setProgressHandler", "(Lcom/ucare/we/util/ProgressHandler;)V", "spLimitType", "Landroid/widget/Spinner;", "spinnerSelectedItem", "", "getSpinnerSelectedItem", "()Ljava/lang/String;", "setSpinnerSelectedItem", "(Ljava/lang/String;)V", "tvContactName", "Landroid/widget/TextView;", "tvContactNumber", "tvLimitUnit", "txtTitle", "checkIsEnabled", "", "str", "clearUserInput", "", "createOrUpdatePaymentLimit", "paymentRelation", "Lcom/ucare/we/model/local/managepaymentlimit/PaymentRelation;", "deletePaymentLimit", "enableSetLimit", "isEnabled", "getUserInput", "", "initViews", "loadData", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onClick", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFamilyManagePaymentLimitFailure", "failureReason", "failureMessage", "onFamilyManagePaymentLimitSuccess", "familyPaymentRelationResponse", "Lcom/ucare/we/model/ServerResponse;", "onSpinnerChange", "position", "preloadInput", "resetInput", "setListeners", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class PaymentLimitActivity extends czy implements View.OnClickListener, dez {
    @Inject
    public djg a;
    @Inject
    public dey b;
    private GroupMember d;
    private FamilyPaymentRelationResponse e;
    private ImageView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private CircleImageView k;
    private EditText l;
    private Spinner m;
    private Button n;
    private Button o;
    private TextView p;
    private View.OnClickListener c = new View.OnClickListener() { // from class: com.ucare.we.presentation.family.groupinfo.managemembers.paymentlimit.-$$Lambda$PaymentLimitActivity$W9tJtVR5tlCQvLrKQFPqvbpvxEI
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PaymentLimitActivity.lambda$W9tJtVR5tlCQvLrKQFPqvbpvxEI(PaymentLimitActivity.this, view);
        }
    };
    private String f = ExifInterface.GPS_MEASUREMENT_IN_PROGRESS;
    private int q = -1;

    public static /* synthetic */ void lambda$W9tJtVR5tlCQvLrKQFPqvbpvxEI(PaymentLimitActivity paymentLimitActivity, View view) {
        a(paymentLimitActivity, view);
    }

    private djg a() {
        djg djgVar = this.a;
        if (djgVar != null) {
            return djgVar;
        }
        dqc.a("progressHandler");
        throw null;
    }

    private dey b() {
        dey deyVar = this.b;
        if (deyVar != null) {
            return deyVar;
        }
        dqc.a("manageMemberPaymentLimitProvider");
        throw null;
    }

    public static final void a(PaymentLimitActivity paymentLimitActivity, View view) {
        dqc.d(paymentLimitActivity, "this$0");
        paymentLimitActivity.finish();
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(R.layout.activity_set_payment_limit);
        a(getString(R.string.set_pay_limit), false, false);
        View findViewById = findViewById(R.id.txtTitle);
        dqc.b(findViewById, "findViewById(R.id.txtTitle)");
        this.h = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.imgBackButton);
        dqc.b(findViewById2, "findViewById(R.id.imgBackButton)");
        this.g = (ImageView) findViewById2;
        View findViewById3 = findViewById(R.id.tvContactNumber);
        dqc.b(findViewById3, "findViewById(R.id.tvContactNumber)");
        this.i = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.tvContactName);
        dqc.b(findViewById4, "findViewById(R.id.tvContactName)");
        this.j = (TextView) findViewById4;
        View findViewById5 = findViewById(R.id.ivContactProfile);
        dqc.b(findViewById5, "findViewById(R.id.ivContactProfile)");
        this.k = (CircleImageView) findViewById5;
        View findViewById6 = findViewById(R.id.tvLimitUnit);
        dqc.b(findViewById6, "findViewById(R.id.tvLimitUnit)");
        this.p = (TextView) findViewById6;
        View findViewById7 = findViewById(R.id.etLimitValue);
        dqc.b(findViewById7, "findViewById(R.id.etLimitValue)");
        this.l = (EditText) findViewById7;
        View findViewById8 = findViewById(R.id.spLimitType);
        dqc.b(findViewById8, "findViewById(R.id.spLimitType)");
        this.m = (Spinner) findViewById8;
        View findViewById9 = findViewById(R.id.btnMemberSetLimit);
        dqc.b(findViewById9, "findViewById(R.id.btnMemberSetLimit)");
        this.n = (Button) findViewById9;
        View findViewById10 = findViewById(R.id.btnMemberRemoveLimit);
        dqc.b(findViewById10, "findViewById(R.id.btnMemberRemoveLimit)");
        this.o = (Button) findViewById10;
        Button button = this.n;
        if (button == null) {
            dqc.a("btnMemberSetLimit");
            throw null;
        }
        PaymentLimitActivity paymentLimitActivity = this;
        button.setOnClickListener(paymentLimitActivity);
        Button button2 = this.o;
        if (button2 == null) {
            dqc.a("btnMemberRemoveLimit");
            throw null;
        }
        button2.setOnClickListener(paymentLimitActivity);
        ArrayAdapter<CharSequence> createFromResource = ArrayAdapter.createFromResource(this, R.array.limitTypes, R.layout.simple_spinner_item);
        dqc.b(createFromResource, "createFromResource(\n            this,\n            R.array.limitTypes,\n            R.layout.simple_spinner_item\n        )");
        createFromResource.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        Spinner spinner = this.m;
        if (spinner == null) {
            dqc.a("spLimitType");
            throw null;
        }
        spinner.setAdapter((SpinnerAdapter) createFromResource);
        ImageView imageView = this.g;
        if (imageView == null) {
            dqc.a("imgBackButton");
            throw null;
        }
        imageView.setOnClickListener(this.c);
        TextView textView = this.h;
        if (textView == null) {
            dqc.a("txtTitle");
            throw null;
        }
        textView.setText(getString(R.string.set_pay_limit));
        this.d = (GroupMember) getIntent().getParcelableExtra("GROUP_MEMBER_ITEM");
        this.e = (FamilyPaymentRelationResponse) getIntent().getParcelableExtra("GROUP_PAYMENT_RELATION");
        String.valueOf(this.d);
        GroupMember groupMember = this.d;
        String str2 = "";
        if (groupMember != null) {
            TextView textView2 = this.i;
            if (textView2 == null) {
                dqc.a("tvContactNumber");
                throw null;
            }
            textView2.setText(groupMember.getServiceNumber());
            TextView textView3 = this.j;
            if (textView3 == null) {
                dqc.a("tvContactName");
                throw null;
            }
            textView3.setText(!groupMember.isOwner() ? groupMember.getContactNameOnDevice() : str2);
            CircleImageView circleImageView = this.k;
            if (circleImageView == null) {
                dqc.a("ivContactProfile");
                throw null;
            }
            circleImageView.setImageBitmap(groupMember.getContactImageOnDevice());
        }
        Button button3 = this.o;
        if (button3 != null) {
            button3.setVisibility(this.e != null ? 0 : 8);
            FamilyPaymentRelationResponse familyPaymentRelationResponse = this.e;
            if (familyPaymentRelationResponse == null || (str = familyPaymentRelationResponse.getLimitValueType()) == null) {
                str = str2;
            }
            this.f = str;
            FamilyPaymentRelationResponse familyPaymentRelationResponse2 = this.e;
            if (familyPaymentRelationResponse2 != null) {
                int i = !dqc.a((Object) String.valueOf(familyPaymentRelationResponse2 == null ? null : familyPaymentRelationResponse2.getLimitValueType()), (Object) ExifInterface.GPS_MEASUREMENT_IN_PROGRESS) ? 1 : 0;
                FamilyPaymentRelationResponse familyPaymentRelationResponse3 = this.e;
                if (!dqc.a(familyPaymentRelationResponse3 == null ? null : Double.valueOf(familyPaymentRelationResponse3.getLimitValue()))) {
                    FamilyPaymentRelationResponse familyPaymentRelationResponse4 = this.e;
                    Double valueOf = familyPaymentRelationResponse4 == null ? null : Double.valueOf(familyPaymentRelationResponse4.getLimitValue());
                    str2 = valueOf == null ? null : Integer.valueOf((int) valueOf.doubleValue()).toString();
                }
                EditText editText = this.l;
                if (editText == null) {
                    dqc.a("etLimitValue");
                    throw null;
                }
                editText.setText(str2);
                Spinner spinner2 = this.m;
                if (spinner2 == null) {
                    dqc.a("spLimitType");
                    throw null;
                }
                spinner2.setSelection(i);
                int i2 = i == 0 ? 999999999 : 99;
                EditText editText2 = this.l;
                if (editText2 == null) {
                    dqc.a("etLimitValue");
                    throw null;
                }
                editText2.setFilters(new InputFilter[]{new djs(i2)});
                TextView textView4 = this.p;
                if (textView4 == null) {
                    dqc.a("tvLimitUnit");
                    throw null;
                }
                textView4.setText(i == 0 ? getString(R.string.egp) : "%");
            } else {
                c();
                Spinner spinner3 = this.m;
                if (spinner3 == null) {
                    dqc.a("spLimitType");
                    throw null;
                }
                spinner3.setSelection(-1);
            }
            dqf.a aVar = new dqf.a();
            Spinner spinner4 = this.m;
            if (spinner4 == null) {
                dqc.a("spLimitType");
                throw null;
            }
            aVar.a = spinner4.getSelectedItemPosition();
            Spinner spinner5 = this.m;
            if (spinner5 == null) {
                dqc.a("spLimitType");
                throw null;
            }
            spinner5.setOnItemSelectedListener(new a(aVar, this));
            EditText editText3 = this.l;
            if (editText3 != null) {
                editText3.addTextChangedListener(new b());
                return;
            } else {
                dqc.a("etLimitValue");
                throw null;
            }
        }
        dqc.a("btnMemberRemoveLimit");
        throw null;
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\f\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005H\u0016¨\u0006\r"}, d2 = {"com/ucare/we/presentation/family/groupinfo/managemembers/paymentlimit/PaymentLimitActivity$loadData$2", "Landroid/widget/AdapterView$OnItemSelectedListener;", "onItemSelected", "", "parent", "Landroid/widget/AdapterView;", "view", "Landroid/view/View;", "position", "", "id", "", "onNothingSelected", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements AdapterView.OnItemSelectedListener {
        final /* synthetic */ dqf.a a;
        final /* synthetic */ PaymentLimitActivity b;

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }

        a(dqf.a aVar, PaymentLimitActivity paymentLimitActivity) {
            this.a = aVar;
            this.b = paymentLimitActivity;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            dqc.d(view, "view");
            if (this.a.a != i) {
                PaymentLimitActivity.a(this.b, i);
            }
            this.a.a = i;
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¨\u0006\u000e"}, d2 = {"com/ucare/we/presentation/family/groupinfo/managemembers/paymentlimit/PaymentLimitActivity$loadData$3", "Landroid/text/TextWatcher;", "afterTextChanged", "", "str", "Landroid/text/Editable;", "beforeTextChanged", "p0", "", "p1", "", "p2", "p3", "onTextChanged", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        b() {
            PaymentLimitActivity.this = r1;
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String valueOf = charSequence == null || charSequence.length() == 0 ? "0" : String.valueOf((int) Double.parseDouble(charSequence.toString()));
            PaymentLimitActivity paymentLimitActivity = PaymentLimitActivity.this;
            PaymentLimitActivity.a(paymentLimitActivity, PaymentLimitActivity.a(paymentLimitActivity, valueOf));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        dqc.d(view, "view");
        StringBuilder sb = new StringBuilder("\n(");
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
            str2 = groupMember3 == null ? null : groupMember3.getContactNameOnDevice();
        } else {
            str2 = str4;
        }
        sb.append((Object) str2);
        sb.append(")?");
        String sb2 = sb.toString();
        switch (view.getId()) {
            case R.id.btnMemberRemoveLimit /* 2131361974 */:
                GlobalConfirmationActivity.a aVar = GlobalConfirmationActivity.a;
                GlobalConfirmationActivity.a.a(this, getString(R.string.remove_payment_limit), dqc.a(getString(R.string.are_you_sure_to_remove_pay_limit), (Object) sb2), 104);
                return;
            case R.id.btnMemberSetLimit /* 2131361975 */:
                String string = getString(dqc.a((Object) this.f, (Object) ExifInterface.GPS_MEASUREMENT_IN_PROGRESS) ? R.string.are_you_sure_to_add_pay_limit_amount_new : R.string.are_you_sure_to_add_pay_limit_percent_new);
                dqc.b(string, "if (spinnerSelectedItem == Constants.TYPE_AMOUNT) getString(R.string.are_you_sure_to_add_pay_limit_amount_new) else getString(\n                        R.string.are_you_sure_to_add_pay_limit_percent_new\n                    )");
                Object[] objArr = new Object[3];
                objArr[0] = String.valueOf(d());
                GroupMember groupMember4 = this.d;
                if (groupMember4 == null || (str3 = groupMember4.getServiceNumber()) == null) {
                    str3 = str4;
                }
                objArr[1] = str3;
                GroupMember groupMember5 = this.d;
                if (dqc.a(groupMember5 == null ? null : Boolean.valueOf(groupMember5.isOwner()), Boolean.FALSE)) {
                    GroupMember groupMember6 = this.d;
                    str4 = groupMember6 == null ? null : groupMember6.getContactNameOnDevice();
                }
                objArr[2] = str4;
                String format = String.format(string, Arrays.copyOf(objArr, 3));
                dqc.b(format, "java.lang.String.format(this, *args)");
                String string2 = getString(R.string.add_payment_limit);
                dqc.b(string2, "getString(R.string.add_payment_limit)");
                GlobalConfirmationActivity.a aVar2 = GlobalConfirmationActivity.a;
                GlobalConfirmationActivity.a.a(this, string2, format, 103);
                return;
            default:
                return;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        FamilyPaymentRelationResponse familyPaymentRelationResponse = this.e;
        String str = null;
        Long paymentRelId = familyPaymentRelationResponse == null ? null : familyPaymentRelationResponse.getPaymentRelId();
        GroupMember groupMember = this.d;
        if (groupMember != null) {
            str = groupMember.getServiceNumber();
        }
        PaymentRelation paymentRelation = new PaymentRelation(paymentRelId, str, this.f, Long.valueOf(d()));
        if (i2 != -1) {
            return;
        }
        if (i == 103) {
            a().a(this, getString(R.string.loading));
            b().a(new ManagePaymentLimitRequestBody(n().P().getId(), paymentRelation, this.e == null ? "add" : "update"));
            b().a(this);
        } else if (i != 104) {
            if (i != 9009) {
                return;
            }
            finish();
        } else {
            a().a(this, getString(R.string.loading));
            b().a(new ManagePaymentLimitRequestBody(n().P().getId(), paymentRelation, "delete"));
            b().a(this);
        }
    }

    @Override // defpackage.dez
    public final void a(ServerResponse<String> serverResponse) {
        dqc.d(serverResponse, "familyPaymentRelationResponse");
        a().a();
        UnNavigateResponseActivity.a(this, 0, serverResponse.getHeader().getResponseMessage(), "", false, false, false, 9009, false);
    }

    @Override // defpackage.dez
    public final void a(int i, String str) {
        a().a();
        UnNavigateResponseActivity.a(this, i, str, getString(R.string.please_try_again), false, false, true, 9009, false);
    }

    private void c() {
        EditText editText = this.l;
        if (editText == null) {
            dqc.a("etLimitValue");
            throw null;
        }
        Editable text = editText.getText();
        if (text == null) {
            return;
        }
        text.clear();
    }

    private long d() {
        EditText editText = this.l;
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

    public static final /* synthetic */ void a(PaymentLimitActivity paymentLimitActivity, int i) {
        paymentLimitActivity.f = i == 0 ? ExifInterface.GPS_MEASUREMENT_IN_PROGRESS : "P";
        paymentLimitActivity.c();
        int i2 = i == 0 ? 999999999 : 99;
        EditText editText = paymentLimitActivity.l;
        if (editText == null) {
            dqc.a("etLimitValue");
            throw null;
        }
        editText.setFilters(new InputFilter[]{new djs(i2)});
        TextView textView = paymentLimitActivity.p;
        if (textView != null) {
            textView.setText(i == 0 ? paymentLimitActivity.getString(R.string.egp) : "%");
        } else {
            dqc.a("tvLimitUnit");
            throw null;
        }
    }

    public static final /* synthetic */ void a(PaymentLimitActivity paymentLimitActivity, boolean z) {
        Button button = paymentLimitActivity.n;
        if (button == null) {
            dqc.a("btnMemberSetLimit");
            throw null;
        }
        button.setAlpha(z ? 1.0f : 0.5f);
        Button button2 = paymentLimitActivity.n;
        if (button2 != null) {
            button2.setEnabled(z);
        } else {
            dqc.a("btnMemberSetLimit");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ boolean a(com.ucare.we.presentation.family.groupinfo.managemembers.paymentlimit.PaymentLimitActivity r7, java.lang.String r8) {
        /*
            r0 = r8
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            int r3 = r0.length()
            if (r3 != 0) goto Le
            goto L10
        Le:
            r3 = 0
            goto L11
        L10:
            r3 = 1
        L11:
            if (r3 == 0) goto L15
            r3 = 0
            goto L1d
        L15:
            java.lang.String r3 = r8.toString()
            int r3 = java.lang.Integer.parseInt(r3)
        L1d:
            java.lang.String r4 = r7.f
            java.lang.String r5 = "P"
            boolean r4 = defpackage.dqc.a(r4, r5)
            if (r4 == 0) goto L34
            if (r3 <= 0) goto L2f
            r4 = 99
            if (r3 > r4) goto L2f
            r4 = 1
            goto L30
        L2f:
            r4 = 0
        L30:
            if (r4 == 0) goto L34
            r4 = 1
            goto L35
        L34:
            r4 = 0
        L35:
            java.lang.String r5 = r7.f
            java.lang.String r6 = "A"
            boolean r5 = defpackage.dqc.a(r5, r6)
            if (r5 == 0) goto L43
            if (r3 <= 0) goto L43
            r3 = 1
            goto L44
        L43:
            r3 = 0
        L44:
            if (r4 != 0) goto L48
            if (r3 == 0) goto L7e
        L48:
            r3 = 0
            if (r8 != 0) goto L4d
            r0 = r3
            goto L5a
        L4d:
            int r0 = r0.length()
            if (r0 <= 0) goto L55
            r0 = 1
            goto L56
        L55:
            r0 = 0
        L56:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L5a:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r0 = defpackage.dqc.a(r0, r4)
            if (r0 == 0) goto L7e
            java.lang.String r8 = r8.toString()
            com.ucare.we.model.remote.grouppaymentrelation.FamilyPaymentRelationResponse r7 = r7.e
            if (r7 != 0) goto L6b
            goto L73
        L6b:
            double r3 = r7.getLimitValue()
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
        L73:
            java.lang.String r7 = java.lang.String.valueOf(r3)
            boolean r7 = defpackage.dqc.a(r8, r7)
            if (r7 != 0) goto L7e
            return r1
        L7e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ucare.we.presentation.family.groupinfo.managemembers.paymentlimit.PaymentLimitActivity.a(com.ucare.we.presentation.family.groupinfo.managemembers.paymentlimit.PaymentLimitActivity, java.lang.String):boolean");
    }
}
