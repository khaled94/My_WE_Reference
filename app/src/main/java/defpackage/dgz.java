package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.android.volley.AuthFailureError;
import com.ucare.we.R;
import com.ucare.we.dev.RequestStatusResponseActivity;
import com.ucare.we.model.GetTopics.GetTopicResponse;
import com.ucare.we.model.GetTopics.SubCategoriesOne;
import com.ucare.we.model.GetTopics.SubCategoriesTwo;
import com.ucare.we.model.SubmitTicketModel.SubmitTicketRequestBody;
import com.ucare.we.paybillpostpaidvoucher.ResponseActivity;
import defpackage.w;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.inject.Inject;
import org.json.JSONException;

/* renamed from: dgz  reason: default package */
/* loaded from: classes2.dex */
public class dgz extends dab implements dhb, dju {
    @Inject
    djw a;
    @Inject
    djb b;
    Context c;
    GetTopicResponse d;
    List<SubCategoriesOne> f;
    List<SubCategoriesTwo> h;
    private dha k;
    private TextView l;
    private TextView m;
    private TextView n;
    private int o;
    private int p;
    private EditText r;
    private EditText s;
    private EditText t;
    private EditText u;
    private Button v;
    private int q = 0;
    View.OnClickListener e = new View.OnClickListener() { // from class: dgz.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (dgz.a(dgz.this)) {
                String trim = dgz.this.r.getText().toString().trim();
                String trim2 = dgz.this.s.getText().toString().trim();
                String trim3 = dgz.this.t.getText().toString().trim();
                String trim4 = dgz.this.u.getText().toString().trim();
                String trim5 = dgz.this.l.getText().toString().trim();
                String str = dgz.this.d.categories.get(dgz.this.o).subCategories1.get(dgz.this.p).subCategories2.get(dgz.this.q).id;
                dha dhaVar = dgz.this.k;
                String m = dgz.this.a.m();
                dhaVar.c = new SubmitTicketRequestBody();
                dhaVar.c.contactMsisdn = trim2;
                dhaVar.c.msisdn = m;
                dhaVar.c.firstName = trim;
                dhaVar.c.email = trim3;
                dhaVar.c.title = trim5;
                dhaVar.c.type = str;
                dhaVar.c.middleName = "";
                dhaVar.c.lastName = "";
                dhaVar.c.description = trim4;
                dgz.this.k.a();
            }
        }
    };
    View.OnClickListener g = new View.OnClickListener() { // from class: dgz.2
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            final dgz dgzVar = dgz.this;
            if (dgzVar.d == null || dgzVar.d.categories == null || dgzVar.d.categories.size() <= 0) {
                return;
            }
            new w.a(dgzVar.c).a(dgzVar.d.categories).a(new w.f() { // from class: dgz.5
                @Override // defpackage.w.f
                public final boolean a(int i) {
                    if (i != -1) {
                        dgz.this.o = i;
                        if (dgz.this.b.f()) {
                            dgz.this.l.setText(dgz.this.d.categories.get(i).nameAr);
                            dgz dgzVar2 = dgz.this;
                            dgzVar2.f = dgzVar2.d.categories.get(i).subCategories1;
                            dgz.this.m.setText(dgz.this.d.categories.get(i).subCategories1.get(0).nameAr);
                            dgz.this.n.setText(dgz.this.d.categories.get(i).subCategories1.get(0).subCategories2.get(0).nameAr);
                            return true;
                        }
                        dgz.this.l.setText(dgz.this.d.categories.get(i).nameEn);
                        dgz dgzVar3 = dgz.this;
                        dgzVar3.f = dgzVar3.d.categories.get(i).subCategories1;
                        dgz.this.m.setText(dgz.this.d.categories.get(i).subCategories1.get(0).nameEn);
                        dgz.this.n.setText(dgz.this.d.categories.get(i).subCategories1.get(0).subCategories2.get(0).nameEn);
                        return true;
                    }
                    return false;
                }
            }).c(R.string.ok).e();
        }
    };
    View.OnClickListener i = new View.OnClickListener() { // from class: dgz.3
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            final dgz dgzVar = dgz.this;
            if (dgzVar.f == null || dgzVar.f.size() <= 0) {
                return;
            }
            new w.a(dgzVar.c).a(dgzVar.f).a(new w.f() { // from class: dgz.6
                @Override // defpackage.w.f
                public final boolean a(int i) {
                    if (i != -1) {
                        dgz.this.p = i;
                        if (dgz.this.b.f()) {
                            dgz.this.m.setText(dgz.this.d.categories.get(dgz.this.o).subCategories1.get(i).nameAr);
                            dgz dgzVar2 = dgz.this;
                            dgzVar2.h = dgzVar2.d.categories.get(dgz.this.o).subCategories1.get(i).subCategories2;
                            dgz.this.n.setText(dgz.this.d.categories.get(dgz.this.o).subCategories1.get(i).subCategories2.get(0).nameAr);
                            return true;
                        }
                        dgz.this.m.setText(dgz.this.d.categories.get(dgz.this.o).subCategories1.get(i).nameEn);
                        dgz dgzVar3 = dgz.this;
                        dgzVar3.h = dgzVar3.d.categories.get(dgz.this.o).subCategories1.get(i).subCategories2;
                        dgz.this.n.setText(dgz.this.d.categories.get(dgz.this.o).subCategories1.get(i).subCategories2.get(0).nameEn);
                        return true;
                    }
                    return false;
                }
            }).c(R.string.ok).e();
        }
    };
    View.OnClickListener j = new View.OnClickListener() { // from class: dgz.4
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            final dgz dgzVar = dgz.this;
            if (dgzVar.h == null || dgzVar.h.size() <= 0) {
                return;
            }
            new w.a(dgzVar.c).a(dgzVar.h).a(new w.f() { // from class: dgz.7
                @Override // defpackage.w.f
                public final boolean a(int i) {
                    if (i != -1) {
                        dgz.this.q = i;
                        if (dgz.this.b.f()) {
                            dgz.this.n.setText(dgz.this.d.categories.get(dgz.this.o).subCategories1.get(dgz.this.p).subCategories2.get(i).nameAr);
                            dgz.this.n.setText(dgz.this.d.categories.get(dgz.this.o).subCategories1.get(dgz.this.p).subCategories2.get(i).nameAr);
                            return true;
                        }
                        dgz.this.n.setText(dgz.this.d.categories.get(dgz.this.o).subCategories1.get(dgz.this.p).subCategories2.get(i).nameEn);
                        dgz.this.n.setText(dgz.this.d.categories.get(dgz.this.o).subCategories1.get(dgz.this.p).subCategories2.get(i).nameEn);
                        return true;
                    }
                    return false;
                }
            }).c(R.string.ok).e();
        }
    };

    public static dgz a() {
        Bundle bundle = new Bundle();
        dgz dgzVar = new dgz();
        dgzVar.setArguments(bundle);
        return dgzVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.submit_new_request_fragment, viewGroup, false);
        this.l = (TextView) inflate.findViewById(R.id.txtCategories);
        this.m = (TextView) inflate.findViewById(R.id.txtSubCategories);
        this.n = (TextView) inflate.findViewById(R.id.txtThirdCategories);
        EditText editText = (EditText) inflate.findViewById(R.id.edtFullName);
        this.r = editText;
        editText.setSelection(editText.getText().length());
        EditText editText2 = (EditText) inflate.findViewById(R.id.edtMobileNumber);
        this.s = editText2;
        editText2.setSelection(editText2.getText().length());
        EditText editText3 = (EditText) inflate.findViewById(R.id.edtMail);
        this.t = editText3;
        editText3.setSelection(editText3.getText().length());
        EditText editText4 = (EditText) inflate.findViewById(R.id.edtMsg);
        this.u = editText4;
        editText4.setSelection(editText4.getText().length());
        this.v = (Button) inflate.findViewById(R.id.btnSubmit);
        this.l.setOnClickListener(this.g);
        this.m.setOnClickListener(this.i);
        this.n.setOnClickListener(this.j);
        this.v.setOnClickListener(this.e);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        this.c = activity;
        dha dhaVar = new dha(activity, this, this);
        this.k = dhaVar;
        try {
            final djl a = djl.a(dhaVar.a);
            bj bjVar = new bj("https://api-my.te.eg/api/files/read?fileName=SRTypes.json", dhaVar.e, dhaVar.f) { // from class: djl.19
                @Override // defpackage.as
                public final Map<String, String> c() throws AuthFailureError {
                    HashMap hashMap = new HashMap();
                    hashMap.put("Jwt", a.d.I());
                    return hashMap;
                }
            };
            bjVar.j = new am(60000, 0, 0.0f);
            a.b.a((as) bjVar);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.r.setText(this.a.u());
        this.s.setText(this.a.m());
        this.t.setText(this.a.s());
    }

    @Override // defpackage.dhb
    public final void a(GetTopicResponse getTopicResponse) {
        this.d = getTopicResponse;
        if (this.b.f()) {
            this.l.setText(getTopicResponse.categories.get(0).nameAr);
            this.m.setText(getTopicResponse.categories.get(0).subCategories1.get(0).nameAr);
            this.n.setText(getTopicResponse.categories.get(0).subCategories1.get(0).subCategories2.get(0).nameAr);
            this.f = getTopicResponse.categories.get(0).subCategories1;
            this.h = getTopicResponse.categories.get(0).subCategories1.get(0).subCategories2;
            return;
        }
        this.l.setText(getTopicResponse.categories.get(0).nameEn);
        this.m.setText(getTopicResponse.categories.get(0).subCategories1.get(0).nameEn);
        this.n.setText(getTopicResponse.categories.get(0).subCategories1.get(0).subCategories2.get(0).nameEn);
        this.f = getTopicResponse.categories.get(0).subCategories1;
        this.h = getTopicResponse.categories.get(0).subCategories1.get(0).subCategories2;
    }

    @Override // defpackage.dhb
    public final void a(String str, String str2) {
        Context context = this.c;
        RequestStatusResponseActivity.a(context, context.getString(R.string.successfully), str, str2);
        ((Activity) this.c).finish();
    }

    @Override // defpackage.dhb
    public final void a(String str) {
        Context context = this.c;
        ResponseActivity.a(context, context.getString(R.string.error), str, true);
        ((Activity) this.c).finish();
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this.c, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        this.k.a();
    }

    static /* synthetic */ boolean a(dgz dgzVar) {
        if (TextUtils.isEmpty(dgzVar.r.getText().toString().trim())) {
            dgzVar.r.setBackgroundResource(R.drawable.edittext_bg_error);
            return false;
        }
        dgzVar.r.setBackgroundResource(R.drawable.edittext_bg_ticket);
        if (!TextUtils.isEmpty(dgzVar.s.getText().toString().trim())) {
            String trim = dgzVar.s.getText().toString().trim();
            if (trim.length() == 11 && trim.startsWith("01")) {
                dgzVar.r.setBackgroundResource(R.drawable.edittext_bg_ticket);
                if (!TextUtils.isEmpty(dgzVar.t.getText().toString().trim())) {
                    if (Pattern.compile("^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$", 2).matcher(dgzVar.t.getText().toString().trim()).matches()) {
                        dgzVar.t.setBackgroundResource(R.drawable.edittext_bg_ticket);
                        if (TextUtils.isEmpty(dgzVar.u.getText().toString().trim())) {
                            dgzVar.u.setBackgroundResource(R.drawable.edittext_bg_error);
                            return false;
                        }
                        dgzVar.u.setBackgroundResource(R.drawable.edittext_bg_ticket);
                        return true;
                    }
                }
                dgzVar.t.setBackgroundResource(R.drawable.edittext_bg_error);
                return false;
            }
        }
        dgzVar.s.setBackgroundResource(R.drawable.edittext_bg_error);
        Context context = dgzVar.c;
        Toast.makeText(context, context.getString(R.string.mobile_number_prefix), 0).show();
        return false;
    }
}
