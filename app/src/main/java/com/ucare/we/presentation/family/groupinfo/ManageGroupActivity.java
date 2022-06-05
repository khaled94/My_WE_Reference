package com.ucare.we.presentation.family.groupinfo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import com.ucare.we.R;
import com.ucare.we.presentation.family.groupinfo.managebundle.ManageFamilyBundleActivity;
import com.ucare.we.presentation.family.groupinfo.managemembers.ManageMembersActivity;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J-\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00042\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0016¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ucare/we/presentation/family/groupinfo/ManageGroupActivity;", "Lcom/ucare/we/injection/BaseActivity;", "()V", "MY_PERMISSIONS_REQUEST_IMEI", "", "btnGroupInfo", "Landroid/widget/Button;", "btnMangeBundle", "btnMangeMembers", "imgBackButton", "Landroid/widget/ImageView;", "txtTitle", "Landroid/widget/TextView;", "getPermissions", "", "initViews", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ManageGroupActivity extends czy {
    private ImageView a;
    private TextView b;
    private Button c;
    private Button d;
    private Button e;
    private final int f = 20;

    public static /* synthetic */ void lambda$FOLJO32SjWZZo0BRnzGK2QozfXU(ManageGroupActivity manageGroupActivity, View view) {
        c(manageGroupActivity, view);
    }

    public static /* synthetic */ void lambda$H9isb2zJOPAUyUlFcxNeQZ_nmEs(ManageGroupActivity manageGroupActivity, View view) {
        d(manageGroupActivity, view);
    }

    /* renamed from: lambda$Yqqxh4cCIT49KeFj78SMXYll-rE */
    public static /* synthetic */ void m44lambda$Yqqxh4cCIT49KeFj78SMXYllrE(ManageGroupActivity manageGroupActivity, View view) {
        a(manageGroupActivity, view);
    }

    public static /* synthetic */ void lambda$tsEuxmJk4ILoHEiKLnWiPF6l6QI(ManageGroupActivity manageGroupActivity, View view) {
        b(manageGroupActivity, view);
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activitiy_manage_group_member);
        a(getString(R.string.manage_group), false, false);
        View findViewById = findViewById(R.id.txtTitle);
        dqc.b(findViewById, "findViewById(R.id.txtTitle)");
        this.b = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.imgBackButton);
        dqc.b(findViewById2, "findViewById(R.id.imgBackButton)");
        this.a = (ImageView) findViewById2;
        View findViewById3 = findViewById(R.id.btnGroupInfo);
        dqc.b(findViewById3, "findViewById(R.id.btnGroupInfo)");
        this.c = (Button) findViewById3;
        View findViewById4 = findViewById(R.id.btnMangeMembers);
        dqc.b(findViewById4, "findViewById(R.id.btnMangeMembers)");
        this.d = (Button) findViewById4;
        View findViewById5 = findViewById(R.id.btnMangeBundle);
        dqc.b(findViewById5, "findViewById(R.id.btnMangeBundle)");
        this.e = (Button) findViewById5;
        TextView textView = this.b;
        if (textView == null) {
            dqc.a("txtTitle");
            throw null;
        }
        textView.setText(R.string.manage_group);
        ImageView imageView = this.a;
        if (imageView == null) {
            dqc.a("imgBackButton");
            throw null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.family.groupinfo.-$$Lambda$ManageGroupActivity$H9isb2zJOPAUyUlFcxNeQZ_nmEs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ManageGroupActivity.lambda$H9isb2zJOPAUyUlFcxNeQZ_nmEs(ManageGroupActivity.this, view);
            }
        });
        ActivityCompat.requestPermissions(this, new String[]{"android.permission.READ_CONTACTS"}, this.f);
        Button button = this.c;
        if (button == null) {
            dqc.a("btnGroupInfo");
            throw null;
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.family.groupinfo.-$$Lambda$ManageGroupActivity$Yqqxh4cCIT49KeFj78SMXYll-rE
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ManageGroupActivity.m44lambda$Yqqxh4cCIT49KeFj78SMXYllrE(ManageGroupActivity.this, view);
            }
        });
        Button button2 = this.d;
        if (button2 == null) {
            dqc.a("btnMangeMembers");
            throw null;
        }
        button2.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.family.groupinfo.-$$Lambda$ManageGroupActivity$tsEuxmJk4ILoHEiKLnWiPF6l6QI
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ManageGroupActivity.lambda$tsEuxmJk4ILoHEiKLnWiPF6l6QI(ManageGroupActivity.this, view);
            }
        });
        Button button3 = this.e;
        if (button3 != null) {
            button3.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.family.groupinfo.-$$Lambda$ManageGroupActivity$FOLJO32SjWZZo0BRnzGK2QozfXU
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ManageGroupActivity.lambda$FOLJO32SjWZZo0BRnzGK2QozfXU(ManageGroupActivity.this, view);
                }
            });
        } else {
            dqc.a("btnMangeBundle");
            throw null;
        }
    }

    public static final void a(ManageGroupActivity manageGroupActivity, View view) {
        dqc.d(manageGroupActivity, "this$0");
        manageGroupActivity.startActivity(new Intent(manageGroupActivity, GroupInfoActivity.class));
    }

    public static final void b(ManageGroupActivity manageGroupActivity, View view) {
        dqc.d(manageGroupActivity, "this$0");
        manageGroupActivity.startActivity(new Intent(manageGroupActivity, ManageMembersActivity.class));
    }

    public static final void c(ManageGroupActivity manageGroupActivity, View view) {
        dqc.d(manageGroupActivity, "this$0");
        manageGroupActivity.startActivity(new Intent(manageGroupActivity, ManageFamilyBundleActivity.class));
    }

    public static final void d(ManageGroupActivity manageGroupActivity, View view) {
        dqc.d(manageGroupActivity, "this$0");
        manageGroupActivity.finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        dqc.d(strArr, "permissions");
        dqc.d(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == this.f) {
        }
    }
}
