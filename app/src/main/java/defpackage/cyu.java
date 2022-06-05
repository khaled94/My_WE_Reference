package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.AuthFailureError;
import com.ucare.we.R;
import com.ucare.we.familynumber.AddNewFamilyNumberConfirmActivity;
import com.ucare.we.familynumber.ConfirmDeleteFamilyNumberActivity;
import com.ucare.we.model.FamilyNumberModel.ViewFamilyNumberRequest;
import com.ucare.we.model.FamilyNumberModel.ViewFamilyNumberRequestBody;
import com.ucare.we.model.FamilyNumberModel.ViewFamilyNumberRequestHeader;
import defpackage.au;
import defpackage.cyt;
import defpackage.djl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cyu  reason: default package */
/* loaded from: classes2.dex */
public class cyu extends dab implements cyw {
    View.OnClickListener a = new View.OnClickListener() { // from class: cyu.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cyu.this.startActivity(new Intent(cyu.this.getContext(), AddNewFamilyNumberConfirmActivity.class));
        }
    };
    private RecyclerView b;
    private ArrayList<String> c;
    private cyt d;
    private Button e;
    private cyv f;

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public static cyu a() {
        return new cyu();
    }

    @Override // defpackage.dab, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_family_number, viewGroup, false);
        this.b = (RecyclerView) inflate.findViewById(R.id.rv_family_number);
        this.e = (Button) inflate.findViewById(R.id.btn_add_new_number);
        this.f = new cyv(getContext(), this);
        ArrayList<String> arrayList = new ArrayList<>();
        this.c = arrayList;
        a(arrayList);
        this.e.setOnClickListener(this.a);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        cyv cyvVar = this.f;
        try {
            final djl a = djl.a(cyvVar.a);
            au.b<JSONObject> bVar = cyvVar.c;
            au.a aVar = cyvVar.d;
            ViewFamilyNumberRequest viewFamilyNumberRequest = new ViewFamilyNumberRequest();
            ViewFamilyNumberRequestHeader viewFamilyNumberRequestHeader = new ViewFamilyNumberRequestHeader();
            viewFamilyNumberRequestHeader.setLocale(a.c.c.k());
            viewFamilyNumberRequestHeader.setMsisdn(a.d.m());
            viewFamilyNumberRequest.setHeader(viewFamilyNumberRequestHeader);
            viewFamilyNumberRequest.setBody(new ViewFamilyNumberRequestBody());
            bj bjVar = new bj("https://api-my.te.eg/api/cug/viewmembers", new JSONObject(a.a.a(viewFamilyNumberRequest)), bVar, aVar) { // from class: djl.29
                @Override // defpackage.as
                public final Map<String, String> c() throws AuthFailureError {
                    HashMap hashMap = new HashMap();
                    hashMap.put("Jwt", a.d.I());
                    return hashMap;
                }
            };
            bjVar.l = djl.a.MAIN_PLAN;
            bjVar.j = new am(60000, 0, 0.0f);
            a.b.a((as) bjVar);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.cyw
    public final void a(ArrayList<String> arrayList) {
        this.c = arrayList;
        this.d = new cyt(getContext(), arrayList);
        this.b.setLayoutManager(new LinearLayoutManager(getContext()));
        this.b.setHasFixedSize(false);
        this.b.setAdapter(this.d);
        this.d.a = new cyt.a() { // from class: cyu.2
            @Override // defpackage.cyt.a
            public final void a(int i) {
                Intent intent = new Intent(cyu.this.getContext(), ConfirmDeleteFamilyNumberActivity.class);
                intent.putExtra("MOBILE_NUMBER", (String) cyu.this.c.get(i));
                intent.putExtra("MOBILE_NUMBER_POSITION", i);
                cyu.this.startActivityForResult(intent, 1);
            }
        };
    }
}
