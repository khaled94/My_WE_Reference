package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import java.util.List;
import javax.inject.Inject;

/* renamed from: dag  reason: default package */
/* loaded from: classes2.dex */
public final class dag extends FragmentStatePagerAdapter {
    @Inject
    djb a;
    @Inject
    Context b;
    private List<a> c;

    /* renamed from: dag$a */
    /* loaded from: classes2.dex */
    public class a {
        int a;
        String b;
        String c;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final float getPageWidth(int i) {
        return 1.0f;
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    public final Fragment getItem(int i) {
        daf dafVar = new daf();
        List<a> list = this.c;
        if (list != null && list.size() > i) {
            dafVar.a = this.c.get(i);
        } else {
            dafVar.a = null;
        }
        return dafVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        List<a> list = this.c;
        if (list == null || list.size() <= 0) {
            return 1;
        }
        return this.c.size();
    }
}
