package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.DialogFragment;
import com.afollestad.materialdialogs.commons.R;
import com.google.android.material.badge.BadgeDrawable;
import defpackage.w;
import java.io.Serializable;

/* renamed from: aa  reason: default package */
/* loaded from: classes.dex */
public class aa extends DialogFragment implements View.OnClickListener, View.OnLongClickListener {
    private int[] a;
    private int[][] b;
    private int c;
    private b d;
    private GridView e;
    private View f;
    private EditText g;
    private View h;
    private TextWatcher i;
    private SeekBar j;
    private TextView k;
    private SeekBar l;
    private TextView m;
    private SeekBar n;
    private TextView o;
    private SeekBar p;
    private TextView q;
    private SeekBar.OnSeekBarChangeListener r;
    private int s;

    /* renamed from: aa$a */
    /* loaded from: classes.dex */
    public static class a implements Serializable {
        protected final int a;
        protected int b;
        protected int c;
        protected int d;
        protected int e;
        protected int f;
        protected int g;
        protected int h;
        protected int[] i;
        protected int[][] j;
        protected int k;
        protected boolean l;
        protected boolean m;
        protected boolean n;
        protected boolean o;
        protected boolean p;
    }

    /* renamed from: aa$b */
    /* loaded from: classes.dex */
    public interface b {
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("top_index", b());
        bundle.putBoolean("in_sub", a());
        bundle.putInt("sub_index", c());
        View view = this.f;
        bundle.putBoolean("in_custom", view != null && view.getVisibility() == 0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof b)) {
            throw new IllegalStateException("ColorChooserDialog needs to be shown from an Activity implementing ColorCallback.");
        }
        this.d = (b) activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        return getArguments().getBoolean("in_sub", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        getArguments().putBoolean("in_sub", z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b() {
        return getArguments().getInt("top_index", -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (i >= 0) {
            a(i, this.a[i]);
        }
        getArguments().putInt("top_index", i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c() {
        if (this.b == null) {
            return -1;
        }
        return getArguments().getInt("sub_index", -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        if (this.b == null) {
            return;
        }
        getArguments().putInt("sub_index", i);
    }

    private int d() {
        a h = h();
        int i = a() ? h.b : h.a;
        return i == 0 ? h.a : i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getTag() != null) {
            int parseInt = Integer.parseInt(((String) view.getTag()).split(":")[0]);
            w wVar = (w) getDialog();
            a h = h();
            if (a()) {
                b(parseInt);
            } else {
                a(parseInt);
                int[][] iArr = this.b;
                if (iArr != null && parseInt < iArr.length) {
                    wVar.a(s.NEGATIVE, h.e);
                    a(true);
                }
            }
            if (h.n) {
                this.s = f();
            }
            e();
            g();
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        if (view.getTag() != null) {
            int parseInt = Integer.parseInt(((String) view.getTag()).split(":")[1]);
            z zVar = (z) view;
            int[] iArr = new int[2];
            Rect rect = new Rect();
            zVar.getLocationOnScreen(iArr);
            zVar.getWindowVisibleDisplayFrame(rect);
            Context context = zVar.getContext();
            int width = zVar.getWidth();
            int height = zVar.getHeight();
            int i = iArr[1] + (height / 2);
            int i2 = iArr[0] + (width / 2);
            if (ViewCompat.getLayoutDirection(zVar) == 0) {
                i2 = context.getResources().getDisplayMetrics().widthPixels - i2;
            }
            Toast makeText = Toast.makeText(context, String.format("#%06X", Integer.valueOf(parseInt & ViewCompat.MEASURED_SIZE_MASK)), 0);
            if (i < rect.height()) {
                makeText.setGravity(BadgeDrawable.TOP_END, i2, (iArr[1] + height) - rect.top);
            } else {
                makeText.setGravity(81, 0, height);
            }
            makeText.show();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        w wVar = (w) getDialog();
        if (wVar != null && h().m) {
            int f = f();
            if (Color.alpha(f) < 64 || (Color.red(f) > 247 && Color.green(f) > 247 && Color.blue(f) > 247)) {
                f = Color.parseColor("#DEDEDE");
            }
            if (h().m) {
                wVar.a(s.POSITIVE).setTextColor(f);
                wVar.a(s.NEGATIVE).setTextColor(f);
                wVar.a(s.NEUTRAL).setTextColor(f);
            }
            if (this.l == null) {
                return;
            }
            if (this.j.getVisibility() == 0) {
                af.a(this.j, f);
            }
            af.a(this.l, f);
            af.a(this.n, f);
            af.a(this.p, f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int f() {
        int i;
        View view = this.f;
        if (view != null && view.getVisibility() == 0) {
            return this.s;
        }
        int i2 = 0;
        if (c() >= 0) {
            i = this.b[b()][c()];
        } else {
            i = b() >= 0 ? this.a[b()] : 0;
        }
        if (i != 0) {
            return i;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            i2 = ah.a(getActivity(), 16843829, 0);
        }
        return ah.a(getActivity(), R.attr.colorAccent, i2);
    }

    private void a(int i, int i2) {
        int[][] iArr = this.b;
        if (iArr == null || iArr.length - 1 < i) {
            return;
        }
        int[] iArr2 = iArr[i];
        for (int i3 = 0; i3 < iArr2.length; i3++) {
            if (iArr2[i3] == i2) {
                b(i3);
                return;
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        int i;
        int i2;
        if (getArguments() == null || !getArguments().containsKey("builder")) {
            throw new IllegalStateException("ColorChooserDialog should be created using its Builder interface.");
        }
        a h = h();
        if (h.i != null) {
            this.a = h.i;
            this.b = h.j;
        } else if (h.l) {
            this.a = ab.c;
            this.b = ab.d;
        } else {
            this.a = ab.a;
            this.b = ab.b;
        }
        if (bundle != null) {
            i = !bundle.getBoolean("in_custom", false);
            i2 = f();
        } else {
            if (h().p) {
                i2 = h().c;
                i = 0;
                if (i2 != 0) {
                    int i3 = 0;
                    while (true) {
                        int[] iArr = this.a;
                        if (i >= iArr.length) {
                            break;
                        } else if (iArr[i] == i2) {
                            a(i);
                            if (h().l) {
                                b(2);
                            } else if (this.b != null) {
                                a(i, i2);
                            } else {
                                b(5);
                            }
                        } else {
                            if (this.b != null) {
                                int i4 = 0;
                                while (true) {
                                    int[][] iArr2 = this.b;
                                    if (i4 >= iArr2[i].length) {
                                        break;
                                    } else if (iArr2[i][i4] == i2) {
                                        a(i);
                                        b(i4);
                                        i3 = 1;
                                        break;
                                    } else {
                                        i4++;
                                    }
                                }
                                if (i3 != 0) {
                                    break;
                                }
                            }
                            i++;
                        }
                    }
                    i = i3;
                }
            } else {
                i2 = ViewCompat.MEASURED_STATE_MASK;
            }
            i = 1;
        }
        this.c = getResources().getDimensionPixelSize(R.dimen.md_colorchooser_circlesize);
        a h2 = h();
        w.a a2 = new w.a(getActivity()).a(d()).c().f(R.layout.md_dialog_colorchooser).e(h2.f).c(h2.d).d(h2.n ? h2.g : 0).a(new w.i() { // from class: aa.4
            @Override // defpackage.w.i
            public final void onClick(w wVar, s sVar) {
                b unused = aa.this.d;
                aa.this.f();
                aa.this.dismiss();
            }
        }).b(new w.i() { // from class: aa.3
            @Override // defpackage.w.i
            public final void onClick(w wVar, s sVar) {
                if (aa.this.a()) {
                    wVar.a(s.NEGATIVE, aa.this.h().f);
                    aa.this.a(false);
                    aa.this.b(-1);
                    aa.this.g();
                    return;
                }
                wVar.cancel();
            }
        }).c(new w.i() { // from class: aa.2
            @Override // defpackage.w.i
            public final void onClick(w wVar, s sVar) {
                aa.this.a(wVar);
            }
        }).a(new DialogInterface.OnShowListener() { // from class: aa.1
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                aa.this.e();
            }
        });
        if (h2.k != 0) {
            a2.g(h2.k);
        }
        w d = a2.d();
        View e = d.e();
        this.e = (GridView) e.findViewById(R.id.md_grid);
        if (h2.n) {
            this.s = i2;
            this.f = e.findViewById(R.id.md_colorChooserCustomFrame);
            this.g = (EditText) e.findViewById(R.id.md_hexInput);
            this.h = e.findViewById(R.id.md_colorIndicator);
            this.j = (SeekBar) e.findViewById(R.id.md_colorA);
            this.k = (TextView) e.findViewById(R.id.md_colorAValue);
            this.l = (SeekBar) e.findViewById(R.id.md_colorR);
            this.m = (TextView) e.findViewById(R.id.md_colorRValue);
            this.n = (SeekBar) e.findViewById(R.id.md_colorG);
            this.o = (TextView) e.findViewById(R.id.md_colorGValue);
            this.p = (SeekBar) e.findViewById(R.id.md_colorB);
            this.q = (TextView) e.findViewById(R.id.md_colorBValue);
            if (!h2.o) {
                e.findViewById(R.id.md_colorALabel).setVisibility(8);
                this.j.setVisibility(8);
                this.k.setVisibility(8);
                this.g.setHint("2196F3");
                this.g.setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
            } else {
                this.g.setHint("FF2196F3");
                this.g.setFilters(new InputFilter[]{new InputFilter.LengthFilter(8)});
            }
            if (i == 0) {
                a(d);
            }
        }
        g();
        return d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(w wVar) {
        if (wVar == null) {
            wVar = (w) getDialog();
        }
        if (this.e.getVisibility() == 0) {
            wVar.setTitle(h().g);
            wVar.a(s.NEUTRAL, h().h);
            wVar.a(s.NEGATIVE, h().f);
            this.e.setVisibility(4);
            this.f.setVisibility(0);
            TextWatcher textWatcher = new TextWatcher() { // from class: aa.5
                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                }

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    try {
                        aa aaVar = aa.this;
                        aaVar.s = Color.parseColor("#" + charSequence.toString());
                    } catch (IllegalArgumentException unused) {
                        aa.this.s = ViewCompat.MEASURED_STATE_MASK;
                    }
                    aa.this.h.setBackgroundColor(aa.this.s);
                    if (aa.this.j.getVisibility() == 0) {
                        int alpha = Color.alpha(aa.this.s);
                        aa.this.j.setProgress(alpha);
                        aa.this.k.setText(String.format("%d", Integer.valueOf(alpha)));
                    }
                    if (aa.this.j.getVisibility() == 0) {
                        aa.this.j.setProgress(Color.alpha(aa.this.s));
                    }
                    aa.this.l.setProgress(Color.red(aa.this.s));
                    aa.this.n.setProgress(Color.green(aa.this.s));
                    aa.this.p.setProgress(Color.blue(aa.this.s));
                    aa.this.a(false);
                    aa.this.a(-1);
                    aa.this.b(-1);
                    aa.this.e();
                }
            };
            this.i = textWatcher;
            this.g.addTextChangedListener(textWatcher);
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = new SeekBar.OnSeekBarChangeListener() { // from class: aa.6
                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStartTrackingTouch(SeekBar seekBar) {
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStopTrackingTouch(SeekBar seekBar) {
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                    if (z) {
                        if (aa.this.h().o) {
                            aa.this.g.setText(String.format("%08X", Integer.valueOf(Color.argb(aa.this.j.getProgress(), aa.this.l.getProgress(), aa.this.n.getProgress(), aa.this.p.getProgress()))));
                        } else {
                            aa.this.g.setText(String.format("%06X", Integer.valueOf(Color.rgb(aa.this.l.getProgress(), aa.this.n.getProgress(), aa.this.p.getProgress()) & ViewCompat.MEASURED_SIZE_MASK)));
                        }
                    }
                    aa.this.k.setText(String.format("%d", Integer.valueOf(aa.this.j.getProgress())));
                    aa.this.m.setText(String.format("%d", Integer.valueOf(aa.this.l.getProgress())));
                    aa.this.o.setText(String.format("%d", Integer.valueOf(aa.this.n.getProgress())));
                    aa.this.q.setText(String.format("%d", Integer.valueOf(aa.this.p.getProgress())));
                }
            };
            this.r = onSeekBarChangeListener;
            this.l.setOnSeekBarChangeListener(onSeekBarChangeListener);
            this.n.setOnSeekBarChangeListener(this.r);
            this.p.setOnSeekBarChangeListener(this.r);
            if (this.j.getVisibility() == 0) {
                this.j.setOnSeekBarChangeListener(this.r);
                this.g.setText(String.format("%08X", Integer.valueOf(this.s)));
                return;
            }
            this.g.setText(String.format("%06X", Integer.valueOf(16777215 & this.s)));
            return;
        }
        wVar.setTitle(h().a);
        wVar.a(s.NEUTRAL, h().g);
        if (a()) {
            wVar.a(s.NEGATIVE, h().e);
        } else {
            wVar.a(s.NEGATIVE, h().f);
        }
        this.e.setVisibility(0);
        this.f.setVisibility(8);
        this.g.removeTextChangedListener(this.i);
        this.i = null;
        this.l.setOnSeekBarChangeListener(null);
        this.n.setOnSeekBarChangeListener(null);
        this.p.setOnSeekBarChangeListener(null);
        this.r = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.e.getAdapter() == null) {
            this.e.setAdapter((ListAdapter) new c());
            this.e.setSelector(ResourcesCompat.getDrawable(getResources(), R.drawable.md_transparent, null));
        } else {
            ((BaseAdapter) this.e.getAdapter()).notifyDataSetChanged();
        }
        if (getDialog() != null) {
            getDialog().setTitle(d());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: aa$c */
    /* loaded from: classes.dex */
    public class c extends BaseAdapter {
        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        public c() {
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            return aa.this.a() ? aa.this.b[aa.this.b()].length : aa.this.a.length;
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            return aa.this.a() ? Integer.valueOf(aa.this.b[aa.this.b()][i]) : Integer.valueOf(aa.this.a[i]);
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = new z(aa.this.getContext());
                view.setLayoutParams(new AbsListView.LayoutParams(aa.this.c, aa.this.c));
            }
            z zVar = (z) view;
            int i2 = aa.this.a() ? aa.this.b[aa.this.b()][i] : aa.this.a[i];
            zVar.setBackgroundColor(i2);
            if (aa.this.a()) {
                zVar.setSelected(aa.this.c() == i);
            } else {
                zVar.setSelected(aa.this.b() == i);
            }
            zVar.setTag(String.format("%d:%d", Integer.valueOf(i), Integer.valueOf(i2)));
            zVar.setOnClickListener(aa.this);
            zVar.setOnLongClickListener(aa.this);
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a h() {
        if (getArguments() == null || !getArguments().containsKey("builder")) {
            return null;
        }
        return (a) getArguments().getSerializable("builder");
    }
}
