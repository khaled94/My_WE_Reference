package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ucare.we.R;

/* renamed from: dai  reason: default package */
/* loaded from: classes2.dex */
public class dai extends dab {
    public static dai a() {
        Bundle bundle = new Bundle();
        dai daiVar = new dai();
        daiVar.setArguments(bundle);
        return daiVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.login_with_account_fragment, viewGroup, false);
    }
}
