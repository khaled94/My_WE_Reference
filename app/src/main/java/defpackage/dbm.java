package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0004J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J>\u0010\u0018\u001a\u00020\u000e2\b\b\u0003\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0!H\u0004J\r\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u00028\u0000X\u0086.¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\""}, d2 = {"Lcom/ucare/we/newHome/core/platfrom/BaseFragment;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/viewbinding/ViewBinding;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/ucare/we/databinding/FragmentBaseBinding;", "viewBinding", "getViewBinding", "()Landroidx/viewbinding/ViewBinding;", "setViewBinding", "(Landroidx/viewbinding/ViewBinding;)V", "Landroidx/viewbinding/ViewBinding;", "hideError", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "showError", "drawable", "", "message", "", "showRetry", "", "action", "onRetry", "Lkotlin/Function0;", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dbm  reason: default package */
/* loaded from: classes2.dex */
public abstract class dbm<V extends ViewBinding> extends Fragment {
    public V a;
    private cym b;

    public abstract V b();

    public final V a() {
        V v = this.a;
        if (v != null) {
            return v;
        }
        dqc.a("viewBinding");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        dqc.d(layoutInflater, "inflater");
        cym a = cym.a(getLayoutInflater());
        dqc.b(a, "inflate(layoutInflater)");
        this.b = a;
        if (a != null) {
            FrameLayout frameLayout = a.c;
            dqc.b(frameLayout, "binding.flContainer");
            V b = b();
            dqc.d(b, "<set-?>");
            this.a = b;
            frameLayout.addView(a().getRoot());
            cym cymVar = this.b;
            if (cymVar != null) {
                return cymVar.a;
            }
            dqc.a("binding");
            throw null;
        }
        dqc.a("binding");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        dad.a().a.inject(this);
    }
}
