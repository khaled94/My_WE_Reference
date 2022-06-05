package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.StoreResponseBody;
import defpackage.cxh;
import java.util.ArrayList;
import java.util.Locale;
import javax.inject.Inject;

/* renamed from: cze  reason: default package */
/* loaded from: classes2.dex */
public class cze extends dab implements cxh.a {
    @Inject
    public static djg a;
    @Inject
    djb b;
    private cxh c;
    private RecyclerView d;
    private ArrayList<StoreResponseBody> e;
    private Context f;

    public static cze a(ArrayList<StoreResponseBody> arrayList) {
        cze czeVar = new cze();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("STORE_LIST", arrayList);
        czeVar.setArguments(bundle);
        return czeVar;
    }

    @Override // defpackage.dab, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.e = getArguments().getParcelableArrayList("STORE_LIST");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f = getActivity();
        a = new djg();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_location_search_results, viewGroup, false);
        this.d = (RecyclerView) inflate.findViewById(R.id.rv_adsl_stores);
        this.d.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
        this.d.setHasFixedSize(true);
        cxh cxhVar = new cxh(this);
        this.c = cxhVar;
        this.d.setAdapter(cxhVar);
        this.c.a(new ArrayList<>(this.e));
        return inflate;
    }

    @Override // defpackage.cxh.a
    public final void a(StoreResponseBody storeResponseBody) {
        if (storeResponseBody.getLatitude() != 0.0d) {
            if (diw.b(getActivity())) {
                Locale locale = Locale.ENGLISH;
                Object[] objArr = new Object[3];
                objArr[0] = Double.valueOf(storeResponseBody.getLatitude());
                objArr[1] = Double.valueOf(storeResponseBody.getLongitude());
                objArr[2] = this.b.f() ? storeResponseBody.getArBranchName() : storeResponseBody.getEnBranchName();
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format(locale, "geo:0,0?q=%f,%f(%s)", objArr)));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
                return;
            }
            Locale locale2 = Locale.ENGLISH;
            Object[] objArr2 = new Object[3];
            objArr2[0] = Double.valueOf(storeResponseBody.getLatitude());
            objArr2[1] = Double.valueOf(storeResponseBody.getLongitude());
            objArr2[2] = this.b.f() ? storeResponseBody.getArBranchName() : storeResponseBody.getEnBranchName();
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(String.format(locale2, "geo:0,0?q=%f,%f(%s)", objArr2)));
            intent2.setPackage("com.google.android.apps.maps");
            startActivity(intent2);
            return;
        }
        Toast.makeText(this.f, (int) R.string.maps_is_not_available, 1).show();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        a.a();
    }
}
