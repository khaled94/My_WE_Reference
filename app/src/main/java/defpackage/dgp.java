package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ucare.we.R;

/* renamed from: dgp  reason: default package */
/* loaded from: classes2.dex */
public class dgp extends BottomSheetDialogFragment {
    a b;
    private TextView g;
    private TextView h;
    private Button i;
    View.OnClickListener a = new View.OnClickListener() { // from class: dgp.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dgp.this.dismiss();
        }
    };
    private int e = 1;
    private int f = 2;
    View.OnClickListener c = new View.OnClickListener() { // from class: dgp.2
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dgp.this.b.a(dgp.this.f);
            dgp.this.dismiss();
        }
    };
    View.OnClickListener d = new View.OnClickListener() { // from class: dgp.3
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dgp.this.b.a(dgp.this.e);
            dgp.this.dismiss();
        }
    };

    /* renamed from: dgp$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(int i);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.select_language_bottom_sheet, viewGroup, false);
        this.g = (TextView) inflate.findViewById(R.id.tvEnglish);
        this.h = (TextView) inflate.findViewById(R.id.tvArabic);
        this.i = (Button) inflate.findViewById(R.id.btnCancel);
        this.g.setOnClickListener(this.d);
        this.h.setOnClickListener(this.c);
        this.i.setOnClickListener(this.a);
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            this.b = (a) parentFragment;
            return;
        }
        try {
            this.b = (a) context;
        } catch (ClassCastException unused) {
            throw new ClassCastException(context.toString());
        }
    }
}
