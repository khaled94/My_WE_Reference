package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ucare.we.R;
import javax.inject.Inject;

/* renamed from: cwr  reason: default package */
/* loaded from: classes2.dex */
public class cwr extends dab {
    public static final String a = cwr.class.getSimpleName();
    @Inject
    dhn b;
    @Inject
    djb c;
    @Inject
    dio d;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.home_fragment_collapsing, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }
}
