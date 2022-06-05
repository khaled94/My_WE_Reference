package defpackage;

import android.content.res.ColorStateList;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.R;
import defpackage.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r  reason: default package */
/* loaded from: classes2.dex */
public final class r extends RecyclerView.Adapter<a> {
    b a;
    private final w b;
    private final int c;
    private final v d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r$b */
    /* loaded from: classes2.dex */
    public interface b {
        boolean a(View view, int i, boolean z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(a aVar, int i) {
        boolean z;
        a aVar2 = aVar;
        View view = aVar2.itemView;
        Integer valueOf = Integer.valueOf(i);
        Integer[] numArr = this.b.b.P;
        boolean z2 = true;
        if (numArr != null && numArr.length != 0) {
            for (Integer num : numArr) {
                if (num.equals(valueOf)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        int a2 = z ? ah.a(this.b.b.ag, 0.4f) : this.b.b.ag;
        aVar2.itemView.setEnabled(!z);
        int i2 = AnonymousClass1.a[this.b.r - 1];
        if (i2 == 1) {
            RadioButton radioButton = (RadioButton) aVar2.a;
            boolean z3 = this.b.b.N == i;
            if (this.b.b.u != null) {
                af.a(radioButton, this.b.b.u);
            } else {
                int i3 = this.b.b.t;
                int a3 = ah.a(radioButton.getContext());
                z2 = true;
                af.a(radioButton, new ColorStateList(new int[][]{new int[]{16842910, -16842912}, new int[]{16842910, 16842912}, new int[]{-16842910, -16842912}, new int[]{-16842910, 16842912}}, new int[]{ah.a(radioButton.getContext(), R.attr.colorControlNormal, 0), i3, a3, a3}));
            }
            radioButton.setChecked(z3);
            radioButton.setEnabled(z ^ z2);
        } else if (i2 == 2) {
            CheckBox checkBox = (CheckBox) aVar2.a;
            boolean contains = this.b.s.contains(Integer.valueOf(i));
            if (this.b.b.u != null) {
                af.a(checkBox, this.b.b.u);
            } else {
                af.a(checkBox, this.b.b.t);
            }
            checkBox.setChecked(contains);
            checkBox.setEnabled(!z);
        }
        aVar2.b.setText(this.b.b.l.get(i));
        aVar2.b.setTextColor(a2);
        w.a(aVar2.b, this.b.b.R);
        ViewGroup viewGroup = (ViewGroup) view;
        ((LinearLayout) viewGroup).setGravity(this.d.getGravityInt() | 16);
        if (viewGroup.getChildCount() == 2) {
            if (this.d == v.END && !a() && (viewGroup.getChildAt(0) instanceof CompoundButton)) {
                CompoundButton compoundButton = (CompoundButton) viewGroup.getChildAt(0);
                viewGroup.removeView(compoundButton);
                TextView textView = (TextView) viewGroup.getChildAt(0);
                viewGroup.removeView(textView);
                textView.setPadding(textView.getPaddingRight(), textView.getPaddingTop(), textView.getPaddingLeft(), textView.getPaddingBottom());
                viewGroup.addView(textView);
                viewGroup.addView(compoundButton);
            } else if (this.d == v.START && a() && (viewGroup.getChildAt(1) instanceof CompoundButton)) {
                CompoundButton compoundButton2 = (CompoundButton) viewGroup.getChildAt(1);
                viewGroup.removeView(compoundButton2);
                TextView textView2 = (TextView) viewGroup.getChildAt(0);
                viewGroup.removeView(textView2);
                textView2.setPadding(textView2.getPaddingRight(), textView2.getPaddingTop(), textView2.getPaddingRight(), textView2.getPaddingBottom());
                viewGroup.addView(compoundButton2);
                viewGroup.addView(textView2);
            }
        }
        if (this.b.b.au != null) {
            if (i < this.b.b.au.length) {
                view.setId(this.b.b.au[i]);
            } else {
                view.setId(-1);
            }
        }
        if (Build.VERSION.SDK_INT < 21 || viewGroup.getChildCount() != 2) {
            return;
        }
        if (viewGroup.getChildAt(0) instanceof CompoundButton) {
            viewGroup.getChildAt(0).setBackground(null);
        } else if (viewGroup.getChildAt(1) instanceof CompoundButton) {
            viewGroup.getChildAt(1).setBackground(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(w wVar, int i) {
        this.b = wVar;
        this.c = i;
        this.d = wVar.b.f;
    }

    /* renamed from: r$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[w.h.a().length];
            a = iArr;
            try {
                iArr[w.h.b - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[w.h.c - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        if (this.b.b.l != null) {
            return this.b.b.l.size();
        }
        return 0;
    }

    private boolean a() {
        return Build.VERSION.SDK_INT >= 17 && this.b.b().a().getResources().getConfiguration().getLayoutDirection() == 1;
    }

    /* renamed from: r$a */
    /* loaded from: classes2.dex */
    static class a extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
        final CompoundButton a;
        final TextView b;
        final r c;

        a(View view, r rVar) {
            super(view);
            this.a = (CompoundButton) view.findViewById(R.id.md_control);
            this.b = (TextView) view.findViewById(R.id.md_title);
            this.c = rVar;
            view.setOnClickListener(this);
            if (rVar.b.b.E != null) {
                view.setOnLongClickListener(this);
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (this.c.a == null || getAdapterPosition() == -1) {
                return;
            }
            if (this.c.b.b.l != null && getAdapterPosition() < this.c.b.b.l.size()) {
                this.c.b.b.l.get(getAdapterPosition());
            }
            b bVar = this.c.a;
            w unused = this.c.b;
            bVar.a(view, getAdapterPosition(), false);
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            if (this.c.a == null || getAdapterPosition() == -1) {
                return false;
            }
            if (this.c.b.b.l != null && getAdapterPosition() < this.c.b.b.l.size()) {
                this.c.b.b.l.get(getAdapterPosition());
            }
            b bVar = this.c.a;
            w unused = this.c.b;
            return bVar.a(view, getAdapterPosition(), true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.c, viewGroup, false);
        ah.a(inflate, this.b.d());
        return new a(inflate, this);
    }
}
