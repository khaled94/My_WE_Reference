package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/* renamed from: ddi  reason: default package */
/* loaded from: classes2.dex */
public final class ddi extends FragmentPagerAdapter {
    private static int a = 4;
    private String b;
    private int c;
    private cwi d;

    public ddi(FragmentManager fragmentManager, cwi cwiVar, String str, int i) {
        super(fragmentManager);
        this.d = cwiVar;
        this.b = str;
        this.c = i;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return a;
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public final Fragment getItem(int i) {
        if (i == 0) {
            ddj ddjVar = new ddj(this.d);
            Bundle bundle = new Bundle();
            bundle.putString("mobile", this.b);
            ddjVar.setArguments(bundle);
            return ddjVar;
        } else if (i == 1) {
            return new ddn(this.d);
        } else {
            if (i == 2) {
                return new ddo(this.d, this.c);
            }
            if (i == 3) {
                return new ddk(this.d);
            }
            return null;
        }
    }
}
