package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.morebundle.MoreBundleActivity;
import defpackage.das;
import java.util.ArrayList;
import javax.inject.Inject;

/* renamed from: dat */
/* loaded from: classes2.dex */
public class dat extends dab implements dav, dju {
    public static String a = "FMCMemberMSISDN";
    @Inject
    djg b;
    private dau c;
    private RecyclerView d;
    private TextView e;
    private das f;
    private Context g;

    public static /* synthetic */ void lambda$vbY3D6D0d53YabykuxNvRfjcUo4(dat datVar, ArrayList arrayList, int i) {
        datVar.a(arrayList, i);
    }

    public static dat a() {
        return new dat();
    }

    @Override // defpackage.dab, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.g = getActivity();
        this.c.a();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_fcmmsisdnpicker, viewGroup, false);
        this.d = (RecyclerView) inflate.findViewById(R.id.rvGroupMSISDN);
        this.e = (TextView) inflate.findViewById(R.id.tvNoDataAvailable);
        this.c = new dau(getContext(), this, this);
        return inflate;
    }

    @Override // defpackage.dav
    public final void a(boolean z) {
        if (z) {
            this.b.a(getContext(), getContext().getString(R.string.loading));
        } else {
            this.b.a();
        }
    }

    @Override // defpackage.dav
    public final void a(final ArrayList<String> arrayList) {
        if (arrayList.size() > 0) {
            this.e.setVisibility(8);
            this.d.setVisibility(0);
            this.f = new das(this.g, arrayList);
            this.d.setLayoutManager(new LinearLayoutManager(this.g));
            this.d.setHasFixedSize(false);
            this.d.setAdapter(this.f);
            this.f.a = new das.a() { // from class: -$$Lambda$dat$vbY3D6D0d53YabykuxNvRfjcUo4
                @Override // defpackage.das.a
                public final void onItemClick(int i) {
                    dat.lambda$vbY3D6D0d53YabykuxNvRfjcUo4(dat.this, arrayList, i);
                }
            };
            return;
        }
        this.e.setVisibility(0);
        this.d.setVisibility(8);
    }

    public /* synthetic */ void a(ArrayList arrayList, int i) {
        Intent intent = new Intent(this.g, MoreBundleActivity.class);
        intent.putExtra(a, (String) arrayList.get(i));
        startActivity(intent);
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(getContext(), this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        this.c.a();
    }

    @Override // defpackage.dav
    public final void b() {
        getActivity().finish();
    }
}
