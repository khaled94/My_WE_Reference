package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ucare.we.R;

/* renamed from: cxw  reason: default package */
/* loaded from: classes2.dex */
public class cxw extends dab implements cxy, dju {
    public TextView a;
    View.OnClickListener b = new View.OnClickListener() { // from class: cxw.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cxw.this.a.setVisibility(8);
            cxw.this.g.setVisibility(0);
            cxw.this.h.setVisibility(8);
            cxw.this.i.setVisibility(0);
            cxw.this.f.setText("");
        }
    };
    View.OnClickListener c = new View.OnClickListener() { // from class: cxw.2
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!TextUtils.isEmpty(cxw.this.f.getText())) {
                cxw.this.d();
                cxw.this.l.a(cxw.this.f.getText().toString().trim());
                return;
            }
            cxw cxwVar = cxw.this;
            cxwVar.a(cxwVar.getString(R.string.wrong_amount));
        }
    };
    View.OnClickListener d = new View.OnClickListener() { // from class: cxw.3
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cxw.this.l.a();
            cxw.this.i.setOnClickListener(cxw.this.c);
            cxw.this.a.setText("");
            cxw cxwVar = cxw.this;
            cxw.a(cxwVar, cxwVar.f);
        }
    };
    View.OnClickListener e = new View.OnClickListener() { // from class: cxw.4
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (cxw.this.g.getVisibility() == 0) {
                if (!TextUtils.isEmpty(cxw.this.f.getText())) {
                    cxw.this.d();
                    cxw.this.l.a(Integer.parseInt(cxw.this.f.getText().toString().trim()));
                    return;
                }
                cxw cxwVar = cxw.this;
                cxwVar.a(cxwVar.getString(R.string.wrong_amount));
                return;
            }
            cxw.this.g.setVisibility(0);
            cxw.this.f.setText(cxw.this.a.getText().toString());
            cxw.this.a.setVisibility(8);
            cxw.this.k.setVisibility(8);
            cxw.this.j.setVisibility(8);
            cxw.this.i.setVisibility(0);
            cxw.this.i.setOnClickListener(cxw.this.e);
            cxw cxwVar2 = cxw.this;
            cxw.a(cxwVar2, cxwVar2.f);
        }
    };
    private TextInputEditText f;
    private TextInputLayout g;
    private Button h;
    private Button i;
    private Button j;
    private Button k;
    private cxx l;
    private djw m;

    public static cxw a() {
        cxw cxwVar = new cxw();
        new Bundle();
        return cxwVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_bill_limit, viewGroup, false);
        this.a = (TextView) inflate.findViewById(R.id.tv_bill_limit_value_text);
        this.f = (TextInputEditText) inflate.findViewById(R.id.et_bill_limit_value);
        this.g = (TextInputLayout) inflate.findViewById(R.id.til_bill_limit_value);
        this.h = (Button) inflate.findViewById(R.id.btn_set_limit_value);
        this.j = (Button) inflate.findViewById(R.id.btn_edit_limit_value);
        this.k = (Button) inflate.findViewById(R.id.btn_reset_limit_value);
        Button button = (Button) inflate.findViewById(R.id.btn_save_limit_value);
        this.i = button;
        button.setOnClickListener(this.c);
        this.h.setOnClickListener(this.b);
        this.j.setOnClickListener(this.e);
        this.k.setOnClickListener(this.d);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.m = new djw();
        cxx cxxVar = new cxx(getActivity(), this, this);
        this.l = cxxVar;
        cxxVar.b();
    }

    @Override // defpackage.cxy
    public final void b() {
        if (this.f != null) {
            a("Couldn't connect to server!");
        }
    }

    @Override // defpackage.cxy
    public final void a(int i) {
        TextView textView = this.a;
        if (textView != null) {
            textView.setVisibility(0);
            this.a.setText(String.valueOf(i));
            this.g.setVisibility(8);
            this.h.setVisibility(8);
            this.i.setVisibility(8);
            this.k.setVisibility(0);
            this.j.setVisibility(0);
        }
    }

    @Override // defpackage.cxy
    public final void c() {
        TextView textView = this.a;
        if (textView != null) {
            textView.setVisibility(0);
            this.a.setHint(getContext().getString(R.string.bill_limit_default_text));
            this.a.setText("");
            this.g.setVisibility(8);
            this.h.setVisibility(0);
            this.i.setVisibility(8);
            this.k.setVisibility(8);
            this.j.setVisibility(8);
        }
    }

    @Override // defpackage.cxy
    public final void c(int i) {
        TextView textView = this.a;
        if (textView != null) {
            textView.setVisibility(0);
            this.a.setText(String.valueOf(i));
            this.g.setVisibility(8);
            this.h.setVisibility(8);
            this.i.setVisibility(8);
            this.k.setVisibility(0);
            this.j.setVisibility(0);
        }
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(getContext(), this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        if (i == 1) {
            if (TextUtils.isEmpty(this.f.getText())) {
                a(getString(R.string.wrong_amount));
                return;
            }
            d();
            this.l.a(this.f.getText().toString().trim());
        } else if (i == 2) {
            this.l.a();
        } else if (i != 3) {
            if (i != 4) {
                return;
            }
            this.l.b();
        } else if (TextUtils.isEmpty(this.f.getText())) {
            a(getString(R.string.wrong_amount));
        } else {
            d();
            this.l.a(Integer.parseInt(this.f.getText().toString().trim()));
        }
    }

    private void a(TextInputEditText textInputEditText) {
        textInputEditText.setBackgroundDrawable(getContext().getResources().getDrawable(R.drawable.text_input_white_background_error));
        textInputEditText.setHintTextColor(getContext().getResources().getColor(R.color.color_grey_new));
    }

    private void b(TextInputEditText textInputEditText) {
        textInputEditText.setBackgroundDrawable(getContext().getResources().getDrawable(R.drawable.text_input_white_background_success));
        textInputEditText.setHintTextColor(getContext().getResources().getColor(R.color.color_grey_new));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        this.g.setError(str);
        this.g.setErrorEnabled(true);
        a(this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        b(this.f);
        this.g.setError(null);
        this.g.setErrorEnabled(false);
    }

    static /* synthetic */ void a(cxw cxwVar, TextInputEditText textInputEditText) {
        textInputEditText.setBackgroundDrawable(cxwVar.getContext().getResources().getDrawable(R.drawable.text_input_white_background_normal));
        textInputEditText.setHintTextColor(cxwVar.getContext().getResources().getColor(R.color.color_grey_new));
    }
}
