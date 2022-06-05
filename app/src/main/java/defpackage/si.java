package defpackage;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

@Deprecated
/* renamed from: si  reason: default package */
/* loaded from: classes2.dex */
public class si extends Fragment {
    private sh a;

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = new sh(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.a.a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.a.a(i, i2, intent);
    }
}
