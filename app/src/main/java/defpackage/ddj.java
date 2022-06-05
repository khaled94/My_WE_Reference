package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ucare.we.R;
import com.ucare.we.presentation.auth.signin.SignInActivity;
import javax.inject.Inject;

/* renamed from: ddj */
/* loaded from: classes2.dex */
public final class ddj extends dab {
    cwi a;
    TextInputEditText b;
    TextInputLayout c;
    TextView d;
    String e;
    @Inject
    djw f;
    @Inject
    djx g;
    @Inject
    djb h;
    View.OnClickListener i = new View.OnClickListener() { // from class: -$$Lambda$ddj$EPaJf90OQmhy3pvhWBurtLnWXZo
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ddj.lambda$EPaJf90OQmhy3pvhWBurtLnWXZo(ddj.this, view);
        }
    };
    private Button j;

    public static /* synthetic */ void lambda$EPaJf90OQmhy3pvhWBurtLnWXZo(ddj ddjVar, View view) {
        ddjVar.b(view);
    }

    /* renamed from: lambda$gFM-bkhqsq_bCDG-w4fNtcSfe5g */
    public static /* synthetic */ void m101lambda$gFMbkhqsq_bCDGw4fNtcSfe5g(ddj ddjVar, View view) {
        ddjVar.a(view);
    }

    public /* synthetic */ void b(View view) {
        getActivity().startActivity(new Intent(getActivity(), SignInActivity.class));
    }

    public ddj(cwi cwiVar) {
        this.a = cwiVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_first_registration_new, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_sign_in);
        this.d = textView;
        textView.setOnClickListener(this.i);
        djm.b(getActivity());
        if (getArguments() != null) {
            this.e = getArguments().getString("mobile");
        }
        if (getActivity().getIntent().getIntExtra("mode", 0) == 1) {
            this.d.setVisibility(8);
        }
        this.j = (Button) inflate.findViewById(R.id.btn_continue_1);
        this.c = (TextInputLayout) inflate.findViewById(R.id.etServiceNumber);
        TextInputEditText textInputEditText = (TextInputEditText) inflate.findViewById(R.id.etMobile);
        this.b = textInputEditText;
        textInputEditText.setText(this.e);
        this.j.setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$ddj$gFM-bkhqsq_bCDG-w4fNtcSfe5g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ddj.m101lambda$gFMbkhqsq_bCDGw4fNtcSfe5g(ddj.this, view);
            }
        });
        this.b.setCustomSelectionActionModeCallback(new ActionMode.Callback() { // from class: ddj.1
            @Override // android.view.ActionMode.Callback
            public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                return false;
            }

            @Override // android.view.ActionMode.Callback
            public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }

            @Override // android.view.ActionMode.Callback
            public final void onDestroyActionMode(ActionMode actionMode) {
            }

            @Override // android.view.ActionMode.Callback
            public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }

            {
                ddj.this = this;
            }
        });
        return inflate;
    }

    private void a(TextInputEditText textInputEditText) {
        textInputEditText.setBackgroundDrawable(getContext().getDrawable(R.drawable.text_input_white_background_error));
        textInputEditText.setHintTextColor(getContext().getResources().getColor(R.color.color_grey_new));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void a(android.view.View r5) {
        /*
            r4 = this;
            android.content.res.Resources r5 = r4.getResources()
            r0 = 2131231141(0x7f0801a5, float:1.8078355E38)
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r0)
            int r0 = r5.getIntrinsicWidth()
            int r1 = r5.getIntrinsicHeight()
            r2 = 0
            r5.setBounds(r2, r2, r0, r1)
            com.google.android.material.textfield.TextInputEditText r5 = r4.b
            android.text.Editable r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            r0 = 1
            if (r5 == 0) goto L45
            com.google.android.material.textfield.TextInputLayout r5 = r4.c
            android.content.res.Resources r1 = r4.getResources()
            r3 = 2131886827(0x7f1202eb, float:1.9408244E38)
            java.lang.String r1 = r1.getString(r3)
            r5.setError(r1)
            com.google.android.material.textfield.TextInputEditText r5 = r4.b
            r5.requestFocus()
            com.google.android.material.textfield.TextInputEditText r5 = r4.b
            r4.a(r5)
        L42:
            r5 = 0
            goto Lfe
        L45:
            com.google.android.material.textfield.TextInputEditText r5 = r4.b
            android.text.Editable r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            java.lang.String r1 = "027"
            boolean r5 = r5.startsWith(r1)
            if (r5 != 0) goto L8d
            com.google.android.material.textfield.TextInputEditText r5 = r4.b
            android.text.Editable r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            int r5 = r5.length()
            android.content.res.Resources r1 = r4.getResources()
            r3 = 2131427339(0x7f0b000b, float:1.8476291E38)
            int r1 = r1.getInteger(r3)
            if (r5 >= r1) goto L8d
            com.google.android.material.textfield.TextInputLayout r5 = r4.c
            android.content.res.Resources r1 = r4.getResources()
            r3 = 2131886144(0x7f120040, float:1.9406859E38)
            java.lang.String r1 = r1.getString(r3)
            r5.setError(r1)
            com.google.android.material.textfield.TextInputEditText r5 = r4.b
            r5.requestFocus()
            com.google.android.material.textfield.TextInputEditText r5 = r4.b
            r4.a(r5)
            goto L42
        L8d:
            com.google.android.material.textfield.TextInputEditText r5 = r4.b
            android.text.Editable r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.substring(r2, r0)
            java.lang.String r1 = "0"
            boolean r5 = r5.equalsIgnoreCase(r1)
            if (r5 != 0) goto Ld5
            com.google.android.material.textfield.TextInputEditText r5 = r4.b
            android.text.Editable r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.substring(r2, r0)
            java.lang.String r1 = "٠"
            boolean r5 = r5.equalsIgnoreCase(r1)
            if (r5 != 0) goto Ld5
            com.google.android.material.textfield.TextInputLayout r5 = r4.c
            android.content.res.Resources r1 = r4.getResources()
            r3 = 2131886453(0x7f120175, float:1.9407485E38)
            java.lang.String r1 = r1.getString(r3)
            r5.setError(r1)
            com.google.android.material.textfield.TextInputEditText r5 = r4.b
            r5.requestFocus()
            com.google.android.material.textfield.TextInputEditText r5 = r4.b
            r4.a(r5)
            goto L42
        Ld5:
            com.google.android.material.textfield.TextInputEditText r5 = r4.b
            android.content.Context r1 = r4.getContext()
            r3 = 2131231525(0x7f080325, float:1.8079133E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r3)
            r5.setBackgroundDrawable(r1)
            android.content.Context r1 = r4.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131099724(0x7f06004c, float:1.781181E38)
            int r1 = r1.getColor(r3)
            r5.setHintTextColor(r1)
            com.google.android.material.textfield.TextInputLayout r5 = r4.c
            r1 = 0
            r5.setError(r1)
            r5 = 1
        Lfe:
            if (r5 != 0) goto L101
            return
        L101:
            com.google.android.material.textfield.TextInputEditText r5 = r4.b
            android.text.Editable r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            djw r1 = r4.f
            r1.d(r5)
            cwi r1 = r4.a
            r1.b(r2, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddj.a(android.view.View):void");
    }
}
