package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.R;
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.internal.MDRootLayout;
import defpackage.r;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: w  reason: default package */
/* loaded from: classes2.dex */
public final class w extends t implements View.OnClickListener, r.b {
    protected final a b;
    protected ImageView c;
    protected TextView d;
    protected TextView e;
    public EditText f;
    RecyclerView g;
    View h;
    FrameLayout i;
    ProgressBar j;
    TextView k;
    TextView l;
    TextView m;
    CheckBox n;
    MDButton o;
    MDButton p;
    MDButton q;
    int r;
    List<Integer> s;
    private final Handler t = new Handler();

    /* renamed from: w$c */
    /* loaded from: classes2.dex */
    public interface c {
        void a(CharSequence charSequence);
    }

    /* renamed from: w$d */
    /* loaded from: classes2.dex */
    public interface d {
        void a(int i);
    }

    /* renamed from: w$e */
    /* loaded from: classes2.dex */
    public interface e {
        boolean a();
    }

    /* renamed from: w$f */
    /* loaded from: classes2.dex */
    public interface f {
        boolean a(int i);
    }

    /* renamed from: w$g */
    /* loaded from: classes2.dex */
    public interface g {
        boolean a();
    }

    /* renamed from: w$i */
    /* loaded from: classes2.dex */
    public interface i {
        void onClick(w wVar, s sVar);
    }

    @Override // defpackage.t, android.app.Dialog
    public final /* bridge */ /* synthetic */ View findViewById(int i2) {
        return super.findViewById(i2);
    }

    @Override // defpackage.t, android.app.Dialog
    @Deprecated
    public final /* bridge */ /* synthetic */ void setContentView(int i2) throws IllegalAccessError {
        super.setContentView(i2);
    }

    @Override // defpackage.t, android.app.Dialog
    @Deprecated
    public final /* bridge */ /* synthetic */ void setContentView(View view) throws IllegalAccessError {
        super.setContentView(view);
    }

    @Override // defpackage.t, android.app.Dialog
    @Deprecated
    public final /* bridge */ /* synthetic */ void setContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessError {
        super.setContentView(view, layoutParams);
    }

    protected w(a aVar) {
        super(aVar.a, u.a(aVar));
        this.b = aVar;
        this.a = (MDRootLayout) LayoutInflater.from(aVar.a).inflate(u.b(aVar), (ViewGroup) null);
        u.a(this);
    }

    public final a b() {
        return this.b;
    }

    public static void a(TextView textView, Typeface typeface) {
        if (typeface == null) {
            return;
        }
        textView.setPaintFlags(textView.getPaintFlags() | 128);
        textView.setTypeface(typeface);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        if (this.g == null) {
            return;
        }
        if ((this.b.l == null || this.b.l.size() == 0) && this.b.W == null) {
            return;
        }
        if (this.b.X == null) {
            this.b.X = new LinearLayoutManager(getContext());
        }
        if (this.g.getLayoutManager() == null) {
            this.g.setLayoutManager(this.b.X);
        }
        this.g.setAdapter(this.b.W);
        if (this.r == 0) {
            return;
        }
        ((r) this.b.W).a = this;
    }

    @Override // defpackage.r.b
    public final boolean a(View view, int i2, boolean z) {
        boolean z2 = false;
        if (!view.isEnabled()) {
            return false;
        }
        int i3 = this.r;
        if (i3 == 0 || i3 == h.a) {
            if (this.b.Q) {
                dismiss();
            }
            if (!z && this.b.D != null) {
                d dVar = this.b.D;
                this.b.l.get(i2);
                dVar.a(i2);
            }
            if (z && this.b.E != null) {
                g gVar = this.b.E;
                this.b.l.get(i2);
                return gVar.a();
            }
        } else if (this.r == h.c) {
            CheckBox checkBox = (CheckBox) view.findViewById(R.id.md_control);
            if (!checkBox.isEnabled()) {
                return false;
            }
            if (!this.s.contains(Integer.valueOf(i2))) {
                this.s.add(Integer.valueOf(i2));
                if (this.b.H) {
                    if (g()) {
                        checkBox.setChecked(true);
                    } else {
                        this.s.remove(Integer.valueOf(i2));
                    }
                } else {
                    checkBox.setChecked(true);
                }
            } else {
                this.s.remove(Integer.valueOf(i2));
                if (this.b.H && !g()) {
                    this.s.add(Integer.valueOf(i2));
                } else {
                    checkBox.setChecked(false);
                }
            }
        } else if (this.r == h.b) {
            RadioButton radioButton = (RadioButton) view.findViewById(R.id.md_control);
            if (!radioButton.isEnabled()) {
                return false;
            }
            int i4 = this.b.N;
            if (this.b.Q && this.b.m == null) {
                dismiss();
                this.b.N = i2;
                f();
            } else if (this.b.I) {
                this.b.N = i2;
                z2 = f();
                this.b.N = i4;
            } else {
                z2 = true;
            }
            if (z2) {
                this.b.N = i2;
                radioButton.setChecked(true);
                this.b.W.notifyItemChanged(i4);
                this.b.W.notifyItemChanged(i2);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Drawable d() {
        if (this.b.aJ != 0) {
            return ResourcesCompat.getDrawable(this.b.a.getResources(), this.b.aJ, null);
        }
        Drawable b2 = ah.b(this.b.a, R.attr.md_list_selector);
        return b2 != null ? b2 : ah.b(getContext(), R.attr.md_list_selector);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Drawable a(s sVar, boolean z) {
        if (z) {
            if (this.b.aK != 0) {
                return ResourcesCompat.getDrawable(this.b.a.getResources(), this.b.aK, null);
            }
            Drawable b2 = ah.b(this.b.a, R.attr.md_btn_stacked_selector);
            return b2 != null ? b2 : ah.b(getContext(), R.attr.md_btn_stacked_selector);
        }
        int i2 = AnonymousClass3.a[sVar.ordinal()];
        if (i2 == 1) {
            if (this.b.aM != 0) {
                return ResourcesCompat.getDrawable(this.b.a.getResources(), this.b.aM, null);
            }
            Drawable b3 = ah.b(this.b.a, R.attr.md_btn_neutral_selector);
            if (b3 != null) {
                return b3;
            }
            Drawable b4 = ah.b(getContext(), R.attr.md_btn_neutral_selector);
            if (Build.VERSION.SDK_INT >= 21) {
                ai.a(b4, this.b.h);
            }
            return b4;
        } else if (i2 != 2) {
            if (this.b.aL != 0) {
                return ResourcesCompat.getDrawable(this.b.a.getResources(), this.b.aL, null);
            }
            Drawable b5 = ah.b(this.b.a, R.attr.md_btn_positive_selector);
            if (b5 != null) {
                return b5;
            }
            Drawable b6 = ah.b(getContext(), R.attr.md_btn_positive_selector);
            if (Build.VERSION.SDK_INT >= 21) {
                ai.a(b6, this.b.h);
            }
            return b6;
        } else if (this.b.aN != 0) {
            return ResourcesCompat.getDrawable(this.b.a.getResources(), this.b.aN, null);
        } else {
            Drawable b7 = ah.b(this.b.a, R.attr.md_btn_negative_selector);
            if (b7 != null) {
                return b7;
            }
            Drawable b8 = ah.b(getContext(), R.attr.md_btn_negative_selector);
            if (Build.VERSION.SDK_INT >= 21) {
                ai.a(b8, this.b.h);
            }
            return b8;
        }
    }

    private boolean f() {
        if (this.b.F == null) {
            return false;
        }
        if (this.b.N >= 0 && this.b.N < this.b.l.size()) {
            this.b.l.get(this.b.N);
        }
        return this.b.F.a(this.b.N);
    }

    private boolean g() {
        if (this.b.G == null) {
            return false;
        }
        Collections.sort(this.s);
        ArrayList arrayList = new ArrayList();
        for (Integer num : this.s) {
            if (num.intValue() >= 0 && num.intValue() <= this.b.l.size() - 1) {
                arrayList.add(this.b.l.get(num.intValue()));
            }
        }
        e eVar = this.b.G;
        List<Integer> list = this.s;
        list.toArray(new Integer[list.size()]);
        arrayList.toArray(new CharSequence[arrayList.size()]);
        return eVar.a();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        s sVar = (s) view.getTag();
        int i2 = AnonymousClass3.a[sVar.ordinal()];
        if (i2 == 1) {
            if (this.b.B != null) {
                this.b.B.onClick(this, sVar);
            }
            if (this.b.Q) {
                dismiss();
            }
        } else if (i2 == 2) {
            if (this.b.A != null) {
                this.b.A.onClick(this, sVar);
            }
            if (this.b.Q) {
                cancel();
            }
        } else if (i2 == 3) {
            if (this.b.z != null) {
                this.b.z.onClick(this, sVar);
            }
            if (!this.b.I) {
                f();
            }
            if (!this.b.H) {
                g();
            }
            if (this.b.an != null && this.f != null && !this.b.aq) {
                this.b.an.a(this.f.getText());
            }
            if (this.b.Q) {
                dismiss();
            }
        }
        if (this.b.C != null) {
            this.b.C.onClick(this, sVar);
        }
    }

    @Override // android.app.Dialog
    public final void show() {
        try {
            super.show();
        } catch (WindowManager.BadTokenException unused) {
            throw new b("Bad window token, you cannot show a dialog before an Activity is created or after it's hidden.");
        }
    }

    public final MDButton a(s sVar) {
        int i2 = AnonymousClass3.a[sVar.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return this.o;
            }
            return this.q;
        }
        return this.p;
    }

    public final View e() {
        return this.b.s;
    }

    public final void a(s sVar, int i2) {
        CharSequence text = getContext().getText(i2);
        int i3 = AnonymousClass3.a[sVar.ordinal()];
        int i4 = 8;
        if (i3 == 1) {
            this.b.n = text;
            this.p.setText(text);
            MDButton mDButton = this.p;
            if (text != null) {
                i4 = 0;
            }
            mDButton.setVisibility(i4);
        } else if (i3 != 2) {
            this.b.m = text;
            this.o.setText(text);
            MDButton mDButton2 = this.o;
            if (text != null) {
                i4 = 0;
            }
            mDButton2.setVisibility(i4);
        } else {
            this.b.o = text;
            this.q.setText(text);
            MDButton mDButton3 = this.q;
            if (text != null) {
                i4 = 0;
            }
            mDButton3.setVisibility(i4);
        }
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i2) {
        setTitle(this.b.a.getString(i2));
    }

    public final void a(CharSequence... charSequenceArr) {
        if (this.b.W == null) {
            throw new IllegalStateException("This MaterialDialog instance does not yet have an adapter set to it. You cannot use setItems().");
        }
        if (charSequenceArr != null) {
            this.b.l = new ArrayList<>(charSequenceArr.length);
            Collections.addAll(this.b.l, charSequenceArr);
        } else {
            this.b.l = null;
        }
        if (!(this.b.W instanceof r)) {
            throw new IllegalStateException("When using a custom adapter, setItems() cannot be used. Set items through the adapter instead.");
        }
        this.b.W.notifyDataSetChanged();
    }

    @Override // defpackage.t, android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        if (this.f != null) {
            final a aVar = this.b;
            final w wVar = this;
            EditText editText = wVar.f;
            if (editText != null) {
                editText.post(new Runnable() { // from class: ah.1
                    {
                        w.this = wVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        w.this.f.requestFocus();
                        InputMethodManager inputMethodManager = (InputMethodManager) aVar.a().getSystemService("input_method");
                        if (inputMethodManager != null) {
                            inputMethodManager.showSoftInput(w.this.f, 1);
                        }
                    }
                });
            }
            if (this.f.getText().length() > 0) {
                EditText editText2 = this.f;
                editText2.setSelection(editText2.getText().length());
            }
        }
        super.onShow(dialogInterface);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i2, boolean z) {
        if (this.m != null) {
            boolean z2 = false;
            if (this.b.as > 0) {
                this.m.setText(String.format(Locale.getDefault(), "%d/%d", Integer.valueOf(i2), Integer.valueOf(this.b.as)));
                this.m.setVisibility(0);
            } else {
                this.m.setVisibility(8);
            }
            if ((z && i2 == 0) || ((this.b.as > 0 && i2 > this.b.as) || i2 < this.b.ar)) {
                z2 = true;
            }
            a aVar = this.b;
            int i3 = z2 ? aVar.at : aVar.j;
            a aVar2 = this.b;
            int i4 = z2 ? aVar2.at : aVar2.t;
            if (this.b.as > 0) {
                this.m.setTextColor(i3);
            }
            af.a(this.f, i4);
            a(s.POSITIVE).setEnabled(!z2);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        InputMethodManager inputMethodManager;
        if (this.f != null) {
            a aVar = this.b;
            w wVar = this;
            if (wVar.f != null && (inputMethodManager = (InputMethodManager) aVar.a().getSystemService("input_method")) != null) {
                View currentFocus = wVar.getCurrentFocus();
                IBinder iBinder = null;
                if (currentFocus != null) {
                    iBinder = currentFocus.getWindowToken();
                } else if (wVar.a != null) {
                    iBinder = wVar.a.getWindowToken();
                }
                if (iBinder != null) {
                    inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
                }
            }
        }
        super.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: w$h */
    /* loaded from: classes2.dex */
    public static final class h extends Enum<h> {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        private static final /* synthetic */ int[] d = {1, 2, 3};

        public static int[] a() {
            return (int[]) d.clone();
        }

        public static int a(int i) {
            int i2 = AnonymousClass3.b[i - 1];
            if (i2 != 1) {
                if (i2 == 2) {
                    return R.layout.md_listitem_singlechoice;
                }
                if (i2 == 3) {
                    return R.layout.md_listitem_multichoice;
                }
                throw new IllegalArgumentException("Not a valid list type");
            }
            return R.layout.md_listitem;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[h.a().length];
            b = iArr;
            try {
                iArr[h.a - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[h.b - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[h.c - 1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[s.values().length];
            a = iArr2;
            try {
                iArr2[s.NEUTRAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[s.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[s.POSITIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w$b */
    /* loaded from: classes2.dex */
    public static class b extends WindowManager.BadTokenException {
        b(String str) {
            super(str);
        }
    }

    /* renamed from: w$a */
    /* loaded from: classes2.dex */
    public static class a {
        protected i A;
        protected i B;
        protected i C;
        protected d D;
        protected g E;
        protected f F;
        protected e G;
        protected int J;
        protected Typeface R;
        protected Typeface S;
        protected Drawable T;
        protected boolean U;
        protected RecyclerView.Adapter<?> W;
        protected RecyclerView.LayoutManager X;
        protected DialogInterface.OnDismissListener Y;
        protected DialogInterface.OnCancelListener Z;
        protected final Context a;
        protected boolean aA;
        protected int aJ;
        protected int aK;
        protected int aL;
        protected int aM;
        protected int aN;
        protected DialogInterface.OnKeyListener aa;
        protected DialogInterface.OnShowListener ab;
        protected x ac;
        protected boolean ad;
        protected int ae;
        protected int af;
        protected int ag;
        protected boolean ah;
        protected boolean ai;
        protected CharSequence al;
        protected CharSequence am;
        protected c an;
        protected boolean ao;
        protected boolean aq;
        protected int[] au;
        protected CharSequence av;
        protected boolean aw;
        protected CompoundButton.OnCheckedChangeListener ax;
        protected String ay;
        protected NumberFormat az;
        protected CharSequence b;
        protected v c;
        protected v d;
        protected v e;
        protected v f;
        protected v g;
        protected int h;
        protected int i;
        protected int j;
        protected CharSequence k;
        protected ArrayList<CharSequence> l;
        protected CharSequence m;
        protected CharSequence n;
        protected CharSequence o;
        protected boolean p;
        protected boolean q;
        protected boolean r;
        protected View s;
        protected int t;
        protected ColorStateList u;
        protected ColorStateList v;
        protected ColorStateList w;
        protected ColorStateList x;
        protected ColorStateList y;
        protected i z;
        protected boolean H = false;
        protected boolean I = false;
        protected boolean K = true;
        protected boolean L = true;
        protected float M = 1.2f;
        protected int N = -1;
        protected Integer[] O = null;
        protected Integer[] P = null;
        protected boolean Q = true;
        protected int V = -1;
        protected int aj = -2;
        protected int ak = 0;
        protected int ap = -1;
        protected int ar = -1;
        protected int as = -1;
        protected int at = 0;
        protected boolean aB = false;
        protected boolean aC = false;
        protected boolean aD = false;
        protected boolean aE = false;
        protected boolean aF = false;
        protected boolean aG = false;
        protected boolean aH = false;
        protected boolean aI = false;

        public a(Context context) {
            this.c = v.START;
            this.d = v.START;
            this.e = v.END;
            this.f = v.START;
            this.g = v.START;
            this.h = 0;
            this.i = -1;
            this.j = -1;
            this.J = y.a;
            this.a = context;
            this.t = ah.a(context, R.attr.colorAccent, ContextCompat.getColor(context, R.color.md_material_blue_600));
            if (Build.VERSION.SDK_INT >= 21) {
                this.t = ah.a(context, 16843829, this.t);
            }
            this.v = ah.d(context, this.t);
            this.w = ah.d(context, this.t);
            this.x = ah.d(context, this.t);
            this.y = ah.d(context, ah.a(context, R.attr.md_link_color, this.t));
            this.h = ah.a(context, R.attr.md_btn_ripple_color, ah.a(context, R.attr.colorControlHighlight, Build.VERSION.SDK_INT >= 21 ? ah.a(context, 16843820, 0) : 0));
            this.az = NumberFormat.getPercentInstance();
            this.ay = "%1d/%2d";
            this.J = ah.a(ah.a(context, 16842806, 0)) ? y.a : y.b;
            if (ag.a(false) != null) {
                ag a = ag.a(true);
                if (a.a) {
                    this.J = y.b;
                }
                if (a.b != 0) {
                    this.i = a.b;
                }
                if (a.c != 0) {
                    this.j = a.c;
                }
                if (a.d != null) {
                    this.v = a.d;
                }
                if (a.e != null) {
                    this.x = a.e;
                }
                if (a.f != null) {
                    this.w = a.f;
                }
                if (a.h != 0) {
                    this.ag = a.h;
                }
                if (a.i != null) {
                    this.T = a.i;
                }
                if (a.j != 0) {
                    this.af = a.j;
                }
                if (a.k != 0) {
                    this.ae = a.k;
                }
                if (a.n != 0) {
                    this.aK = a.n;
                }
                if (a.m != 0) {
                    this.aJ = a.m;
                }
                if (a.o != 0) {
                    this.aL = a.o;
                }
                if (a.p != 0) {
                    this.aM = a.p;
                }
                if (a.q != 0) {
                    this.aN = a.q;
                }
                if (a.g != 0) {
                    this.t = a.g;
                }
                if (a.l != null) {
                    this.y = a.l;
                }
                this.c = a.r;
                this.d = a.s;
                this.e = a.t;
                this.f = a.u;
                this.g = a.v;
            }
            this.c = ah.a(context, R.attr.md_title_gravity, this.c);
            this.d = ah.a(context, R.attr.md_content_gravity, this.d);
            this.e = ah.a(context, R.attr.md_btnstacked_gravity, this.e);
            this.f = ah.a(context, R.attr.md_items_gravity, this.f);
            this.g = ah.a(context, R.attr.md_buttons_gravity, this.g);
            String a2 = ah.a(context, R.attr.md_medium_font);
            String a3 = ah.a(context, R.attr.md_regular_font);
            if (a2 != null) {
                try {
                    if (!a2.trim().isEmpty()) {
                        Typeface a4 = aj.a(this.a, a2);
                        this.S = a4;
                        if (a4 == null) {
                            throw new IllegalArgumentException("No font asset found for \"" + a2 + "\"");
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            if (a3 != null && !a3.trim().isEmpty()) {
                Typeface a5 = aj.a(this.a, a3);
                this.R = a5;
                if (a5 == null) {
                    throw new IllegalArgumentException("No font asset found for \"" + a3 + "\"");
                }
            }
            if (this.S == null) {
                try {
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.S = Typeface.create("sans-serif-medium", 0);
                    } else {
                        this.S = Typeface.create("sans-serif", 1);
                    }
                } catch (Throwable unused2) {
                    this.S = Typeface.DEFAULT_BOLD;
                }
            }
            if (this.R == null) {
                try {
                    this.R = Typeface.create("sans-serif", 0);
                } catch (Throwable unused3) {
                    Typeface typeface = Typeface.SANS_SERIF;
                    this.R = typeface;
                    if (typeface != null) {
                        return;
                    }
                    this.R = Typeface.DEFAULT;
                }
            }
        }

        public final Context a() {
            return this.a;
        }

        public final a a(int i) {
            this.b = this.a.getText(i);
            return this;
        }

        public final a a(CharSequence charSequence) {
            this.b = charSequence;
            return this;
        }

        public final a b(CharSequence charSequence) {
            if (this.s != null) {
                throw new IllegalStateException("You cannot set content() when you're using a custom view.");
            }
            this.k = charSequence;
            return this;
        }

        public final a a(Collection collection) {
            if (collection.size() > 0) {
                CharSequence[] charSequenceArr = new CharSequence[collection.size()];
                int i = 0;
                for (Object obj : collection) {
                    charSequenceArr[i] = obj.toString();
                    i++;
                }
                a(charSequenceArr);
            } else if (collection.size() == 0) {
                this.l = new ArrayList<>();
            }
            return this;
        }

        public final a a(CharSequence... charSequenceArr) {
            if (this.s != null) {
                throw new IllegalStateException("You cannot set items() when you're using a custom view.");
            }
            ArrayList<CharSequence> arrayList = new ArrayList<>();
            this.l = arrayList;
            Collections.addAll(arrayList, charSequenceArr);
            return this;
        }

        public final a a(d dVar) {
            this.D = dVar;
            this.F = null;
            this.G = null;
            return this;
        }

        public final a a(f fVar) {
            this.N = -1;
            this.D = null;
            this.F = fVar;
            this.G = null;
            return this;
        }

        public final a c(int i) {
            if (i == 0) {
                return this;
            }
            this.m = this.a.getText(i);
            return this;
        }

        public final a c(CharSequence charSequence) {
            this.m = charSequence;
            return this;
        }

        public final a d(int i) {
            if (i == 0) {
                return this;
            }
            this.n = this.a.getText(i);
            return this;
        }

        public final a e(int i) {
            if (i == 0) {
                return this;
            }
            this.o = this.a.getText(i);
            return this;
        }

        public final a f(int i) {
            View inflate = LayoutInflater.from(this.a).inflate(i, (ViewGroup) null);
            if (this.k != null) {
                throw new IllegalStateException("You cannot use customView() when you have content set.");
            }
            if (this.l != null) {
                throw new IllegalStateException("You cannot use customView() when you have items set.");
            }
            if (this.an != null) {
                throw new IllegalStateException("You cannot use customView() with an input dialog");
            }
            if (this.aj > -2 || this.ah) {
                throw new IllegalStateException("You cannot use customView() with a progress dialog");
            }
            if (inflate.getParent() != null && (inflate.getParent() instanceof ViewGroup)) {
                ((ViewGroup) inflate.getParent()).removeView(inflate);
            }
            this.s = inflate;
            this.ad = false;
            return this;
        }

        public final a a(i iVar) {
            this.z = iVar;
            return this;
        }

        public final a b(i iVar) {
            this.A = iVar;
            return this;
        }

        public final a c(i iVar) {
            this.B = iVar;
            return this;
        }

        public final a g(int i) {
            this.J = i;
            return this;
        }

        public final a b() {
            this.K = false;
            this.L = false;
            return this;
        }

        public final a c() {
            this.Q = false;
            return this;
        }

        public final a a(DialogInterface.OnShowListener onShowListener) {
            this.ab = onShowListener;
            return this;
        }

        public final w d() {
            return new w(this);
        }

        public final w e() {
            w d = d();
            d.show();
            return d;
        }

        public final a b(int i) {
            return b(this.a.getText(i));
        }

        public final a a(c cVar) {
            if (this.s != null) {
                throw new IllegalStateException("You cannot set content() when you're using a custom view.");
            }
            this.an = cVar;
            this.am = null;
            this.al = null;
            this.ao = false;
            return this;
        }
    }
}
