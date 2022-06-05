package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.family.FamilyAvailableOffersAddonsList;
import com.ucare.we.morebundle.FamilySelectMoreBundlesActivity;
import com.ucare.we.morebundle.FamilySubscribeToMoreBundleActivity;
import defpackage.dbg;
import java.io.Serializable;
import java.util.ArrayList;
import javax.inject.Inject;

/* renamed from: ddy */
/* loaded from: classes2.dex */
public class ddy extends dab {
    @Inject
    djb a;
    @Inject
    djg b;
    String c;
    private RecyclerView d;
    private dbg e;
    private ArrayList<FamilyAvailableOffersAddonsList> f;

    public static /* synthetic */ void lambda$TbqkPfncY97pjJDHTS9br8guJNk(ddy ddyVar, ArrayList arrayList, int i) {
        ddyVar.a(arrayList, i);
    }

    @Override // defpackage.dab, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.c = getArguments().getString(dat.a);
            this.f = (ArrayList) getArguments().getSerializable("ExtrasList");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_select_more_bundle, viewGroup, false);
        this.d = (RecyclerView) inflate.findViewById(R.id.rv_extra_bundles);
        final ArrayList<FamilyAvailableOffersAddonsList> arrayList = this.f;
        this.e = new dbg(getContext(), arrayList);
        this.d.setLayoutManager(new LinearLayoutManager(getContext()));
        this.d.setHasFixedSize(false);
        this.d.setAdapter(this.e);
        this.e.b = new dbg.a() { // from class: -$$Lambda$ddy$TbqkPfncY97pjJDHTS9br8guJNk
            @Override // defpackage.dbg.a
            public final void onItemClick(int i) {
                ddy.lambda$TbqkPfncY97pjJDHTS9br8guJNk(ddy.this, arrayList, i);
            }
        };
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public /* synthetic */ void a(ArrayList arrayList, int i) {
        Intent intent;
        if (((FamilyAvailableOffersAddonsList) arrayList.get(i)).getChildGroups().size() > 0) {
            if (((FamilyAvailableOffersAddonsList) arrayList.get(i)).getAvailableAddOnOfferingList() == null) {
                return;
            }
            intent = new Intent(getContext(), FamilySelectMoreBundlesActivity.class);
            intent.putExtra("SUB_BUNDLES", (Serializable) arrayList.get(i));
            intent.putExtra("position", i);
        } else {
            intent = new Intent(getContext(), FamilySubscribeToMoreBundleActivity.class);
            intent.putExtra("ExtrasList", ((FamilyAvailableOffersAddonsList) arrayList.get(i)).getAvailableAddOnOfferingList());
            if (this.a.f()) {
                intent.putExtra("title", ((FamilyAvailableOffersAddonsList) arrayList.get(i)).getGroupArName());
            } else {
                intent.putExtra("title", ((FamilyAvailableOffersAddonsList) arrayList.get(i)).getGroupEnName());
            }
        }
        startActivity(intent);
    }
}
