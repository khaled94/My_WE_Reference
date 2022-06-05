package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ucare.we.R;
import java.util.regex.Pattern;
import javax.inject.Inject;

/* renamed from: ddn */
/* loaded from: classes2.dex */
public final class ddn extends dab {
    cwi a;
    TextInputEditText b;
    TextInputEditText c;
    TextInputLayout d;
    TextInputLayout e;
    CheckBox f;
    TextView g;
    TextView h;
    @Inject
    dhn i;
    @Inject
    djx j;
    @Inject
    djb k;
    private Button l;
    private LinearLayout m;
    private int n;

    /* renamed from: lambda$KtKDCV4L37Vk1Na0ut_2tM-awmo */
    public static /* synthetic */ void m102lambda$KtKDCV4L37Vk1Na0ut_2tMawmo(ddn ddnVar, View view) {
        ddnVar.a(view);
    }

    public static /* synthetic */ void lambda$P_YrInGr7aYJ8GK2FI27ihaE0Dk(ddn ddnVar, View view, boolean z) {
        ddnVar.a(view, z);
    }

    public ddn(cwi cwiVar) {
        this.a = cwiVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_second_registration_new, viewGroup, false);
        this.m = (LinearLayout) inflate.findViewById(R.id.layout_agree);
        int intExtra = getActivity().getIntent().getIntExtra("mode", 0);
        this.n = intExtra;
        if (intExtra == 1) {
            this.m.setVisibility(8);
        }
        this.b = (TextInputEditText) inflate.findViewById(R.id.et_password_1);
        this.d = (TextInputLayout) inflate.findViewById(R.id.tiPassword_1);
        this.c = (TextInputEditText) inflate.findViewById(R.id.et_password_2);
        this.e = (TextInputLayout) inflate.findViewById(R.id.tiPassword_2);
        this.b.setCustomSelectionActionModeCallback(new ActionMode.Callback() { // from class: ddn.1
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
                ddn.this = this;
            }
        });
        this.b.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: -$$Lambda$ddn$P_YrInGr7aYJ8GK2FI27ihaE0Dk
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                ddn.lambda$P_YrInGr7aYJ8GK2FI27ihaE0Dk(ddn.this, view, z);
            }
        });
        this.c.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: ddn.2
            {
                ddn.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                if (!z) {
                    ddn.this.b();
                    return;
                }
                ddn.this.d.setErrorEnabled(ddn.this.d.getError() != null);
                ddn.this.e.setError(null);
                ddn ddnVar = ddn.this;
                ddnVar.b(ddnVar.c);
            }
        });
        this.c.setCustomSelectionActionModeCallback(new ActionMode.Callback() { // from class: ddn.3
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
                ddn.this = this;
            }
        });
        this.h = (TextView) inflate.findViewById(R.id.tv_error);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_terms_and_conditions);
        this.g = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: ddn.4
            {
                ddn.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final ddn ddnVar = ddn.this;
                AlertDialog create = new AlertDialog.Builder(ddnVar.getActivity()).create();
                create.setTitle(R.string.terms_and_conditions_title);
                create.setMessage(ddnVar.getString(R.string.terms_and_conditions_text));
                create.setButton(-1, ddnVar.getActivity().getString(R.string.ok), new DialogInterface.OnClickListener() { // from class: ddn.6
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                create.show();
            }
        });
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.cb_terms_and_conditions);
        this.f = checkBox;
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ddn.5
            {
                ddn.this = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (z) {
                    ddn.b(ddn.this);
                }
            }
        });
        Button button = (Button) inflate.findViewById(R.id.btn_continue_3);
        this.l = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$ddn$KtKDCV4L37Vk1Na0ut_2tM-awmo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ddn.m102lambda$KtKDCV4L37Vk1Na0ut_2tMawmo(ddn.this, view);
            }
        });
        return inflate;
    }

    public /* synthetic */ void a(View view, boolean z) {
        if (!z) {
            a();
            return;
        }
        this.d.setErrorEnabled(false);
        this.d.setError(null);
        b(this.b);
    }

    private boolean a() {
        if (TextUtils.isEmpty(this.b.getText().toString())) {
            this.d.setError(getResources().getString(R.string.password_at_least_on_character));
            a(this.b);
            return false;
        } else if (this.b.getText().toString().length() < 8) {
            this.d.setError(getResources().getString(R.string.password_at_least_on_character));
            a(this.b);
            return false;
        } else {
            String trim = this.b.getText().toString().trim();
            if (!(Pattern.compile("((?=.*\\d)(?=.*[\\u0621-\\u064A\\u0660-\\u0669 ]+$).{8,20})").matcher(trim).matches() || Pattern.compile("((?=.*\\d)(?=.*[a-zA-Z]).{8,20})").matcher(trim).matches())) {
                this.d.setError(getResources().getString(R.string.password_at_least_on_character));
                a(this.b);
                return false;
            }
            c(this.b);
            this.d.setError(null);
            this.d.setErrorEnabled(false);
            return true;
        }
    }

    public boolean b() {
        if (TextUtils.isEmpty(this.c.getText().toString())) {
            this.e.setError(getResources().getString(R.string.new_should_equale_old));
            a(this.c);
            return false;
        } else if (!this.b.getText().toString().equals(this.c.getText().toString())) {
            this.e.setError(getResources().getString(R.string.password_dont_match));
            a(this.c);
            return false;
        } else {
            c(this.c);
            this.e.setError(null);
            return true;
        }
    }

    private void a(TextInputEditText textInputEditText) {
        textInputEditText.setBackgroundDrawable(getContext().getDrawable(R.drawable.text_input_white_background_error));
        textInputEditText.setHintTextColor(getContext().getResources().getColor(R.color.color_grey_new));
    }

    public void b(TextInputEditText textInputEditText) {
        textInputEditText.setBackgroundDrawable(getContext().getDrawable(R.drawable.text_input_white_background_focused));
        textInputEditText.setHintTextColor(getContext().getResources().getColor(R.color.color_grey_new));
    }

    private void c(TextInputEditText textInputEditText) {
        textInputEditText.setBackgroundDrawable(getContext().getDrawable(R.drawable.text_input_white_background_success));
        textInputEditText.setHintTextColor(getContext().getResources().getColor(R.color.color_grey_new));
    }

    public /* synthetic */ void a(View view) {
        boolean z;
        boolean z2 = false;
        if (a() && b()) {
            if (this.n != 0 || this.f.isChecked()) {
                z = true;
            } else {
                String string = getString(R.string.agree_to_terms);
                this.h.setVisibility(0);
                this.h.setText(string);
                this.h.setFocusable(true);
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        this.a.b(1, 3, this.b.getText().toString());
    }

    static /* synthetic */ void b(ddn ddnVar) {
        ddnVar.h.setVisibility(8);
    }
}
