package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.afo;
import java.util.LinkedList;

/* renamed from: afm  reason: default package */
/* loaded from: classes.dex */
public abstract class afm<T extends afo> {
    public T a;
    Bundle b;
    LinkedList<afy> c;
    private final afq<T> d = new afr(this);

    private final void a(int i) {
        while (!this.c.isEmpty() && this.c.getLast().a() >= i) {
            this.c.removeLast();
        }
    }

    private final void a(Bundle bundle, afy afyVar) {
        if (this.a != null) {
            afyVar.b();
            return;
        }
        if (this.c == null) {
            this.c = new LinkedList<>();
        }
        this.c.add(afyVar);
        if (bundle != null) {
            Bundle bundle2 = this.b;
            if (bundle2 == null) {
                this.b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        a(this.d);
    }

    public static void a(FrameLayout frameLayout) {
        ux a = ux.a();
        Context context = frameLayout.getContext();
        int a2 = a.a(context);
        String b = abn.b(context, a2);
        String a3 = abn.a(context, a2);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(b);
        linearLayout.addView(textView);
        Intent a4 = a.a(context, a2, (String) null);
        if (a4 != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(a3);
            linearLayout.addView(button);
            button.setOnClickListener(new afv(context, a4));
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        a(bundle, new afu(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.a == null) {
            a(frameLayout);
        }
        return frameLayout;
    }

    public final void a() {
        T t = this.a;
        if (t != null) {
            t.a();
        } else {
            a(1);
        }
    }

    protected abstract void a(afq<T> afqVar);

    public final void a(Activity activity, Bundle bundle, Bundle bundle2) {
        a(bundle2, new afs(this, activity, bundle, bundle2));
    }

    public final void a(Bundle bundle) {
        a(bundle, new aft(this, bundle));
    }

    public final void b() {
        T t = this.a;
        if (t != null) {
            t.b();
        } else {
            a(2);
        }
    }

    public final void b(Bundle bundle) {
        T t = this.a;
        if (t != null) {
            t.b(bundle);
            return;
        }
        Bundle bundle2 = this.b;
        if (bundle2 == null) {
            return;
        }
        bundle.putAll(bundle2);
    }

    public final void c() {
        T t = this.a;
        if (t != null) {
            t.c();
        }
    }

    public final void d() {
        T t = this.a;
        if (t != null) {
            t.d();
        } else {
            a(5);
        }
    }

    public final void e() {
        a(null, new afx(this));
    }

    public final void f() {
        a(null, new afw(this));
    }

    public final void g() {
        T t = this.a;
        if (t != null) {
            t.g();
        } else {
            a(4);
        }
    }
}
