package com.ucare.we.util;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import com.ucare.we.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\"\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0010\u00101\u001a\u00020)2\u0006\u00102\u001a\u00020\u0007H\u0002J\u0010\u00103\u001a\u00020)2\u0006\u00102\u001a\u00020\u0007H\u0002J\u0010\u00104\u001a\u00020)2\u0006\u00105\u001a\u00020\u000bH\u0002J\u000e\u00106\u001a\u00020)2\u0006\u00107\u001a\u00020\u000bJ\b\u00108\u001a\u00020\u000fH\u0002J\u000e\u00109\u001a\u00020)2\u0006\u0010:\u001a\u00020\u0007J\u0006\u0010;\u001a\u00020\rJ\b\u0010<\u001a\u00020)H\u0002J\u0006\u0010=\u001a\u00020\u000bJ\u0010\u0010>\u001a\u00020)2\u0006\u0010?\u001a\u00020\u000bH\u0016J\u001a\u0010@\u001a\u00020)2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020)0(J\u001a\u0010B\u001a\u00020)2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020)0(J\u000e\u0010C\u001a\u00020)2\u0006\u0010D\u001a\u00020\rJ\u0018\u00107\u001a\u00020)2\u0006\u0010E\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u0014H\u0002J\u0010\u0010G\u001a\u00020)2\u0006\u0010F\u001a\u00020\u0014H\u0002J\b\u0010H\u001a\u00020)H\u0002J\u0010\u0010I\u001a\u00020)2\u0006\u0010F\u001a\u00020\u0014H\u0002J\u0010\u0010J\u001a\u00020)2\u0006\u0010F\u001a\u00020\u0014H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020)0(X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020)0(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010.\u001a\u00020\u0007*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u0006K"}, d2 = {"Lcom/ucare/we/util/OTPView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "allCaps", "", "autofillHints", "", "backgroundImage", "Landroid/graphics/drawable/Drawable;", "cursorColor", "disableEditListener", "editTexts", "", "Landroid/widget/EditText;", "filledBackgroundImage", "filledFont", "Landroid/graphics/Typeface;", "filledTextColor", "filledTextSize", "focusIndex", "font", "highlightedBackgroundImage", "highlightedFont", "highlightedTextColor", "highlightedTextSize", "importantForAutofillLocal", "inputType", "isPassword", "itemCount", "itemHeight", "itemWidth", "marginBetween", "onCharacterUpdatedFunction", "Lkotlin/Function1;", "", "onFinishFunction", "showCursor", "textColor", "textSizeDefault", "dpTopx", "getDpTopx", "(I)I", "addEditText", "index", "addListenerForIndex", "changeFocus", "increment", "clearText", "showKeyboard", "customBackground", "fitToWidth", "width", "getStringFromFields", "initEditTexts", "isFilled", "setEnabled", "enabled", "setOnCharacterUpdatedListener", "func", "setOnFinishListener", "setText", "str", "show", "editText", "styleDefault", "styleEditTexts", "styleFilled", "styleHighlighted", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class OTPView extends LinearLayout {
    private int A;
    private boolean B;
    private Typeface a;
    private final int b;
    private final boolean c;
    private final int d;
    private final int e;
    private final String f;
    private int g;
    private int h;
    private final int i;
    private final boolean j;
    private final int k;
    private final boolean l;
    private final int m;
    private final int n;
    private final Drawable o;
    private final int p;
    private final int q;
    private final Drawable r;
    private final Typeface s;
    private final int t;
    private final int u;
    private final Drawable v;
    private final Typeface w;
    private dow<? super String, dmg> x;
    private dow<? super Boolean, dmg> y;
    private final List<EditText> z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OTPView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        dqc.d(context, "context");
    }

    public static /* synthetic */ void lambda$0fHeq3tTWpO7Bit7flPdLnovLsA(EditText editText) {
        d(editText);
    }

    public static /* synthetic */ void lambda$ERTa9A8uVD_3lOz5uta3aJBOrWQ(EditText editText, View view, boolean z) {
        a(editText, view, z);
    }

    public static /* synthetic */ boolean lambda$ILyVHwnD6cwGcumw0EvzLoLTMgc(OTPView oTPView, int i, View view, int i2, KeyEvent keyEvent) {
        return a(oTPView, i, view, i2, keyEvent);
    }

    public static /* synthetic */ void lambda$RqncpbwZzZlHqX4t9KJrCsIfBa4(OTPView oTPView) {
        c(oTPView);
    }

    /* renamed from: lambda$WjKwe-gWB96gLBvNqyN3gEYJc_Y */
    public static /* synthetic */ void m74lambda$WjKwegWB96gLBvNqyN3gEYJc_Y(OTPView oTPView, int i, View view, boolean z) {
        a(oTPView, i, view, z);
    }

    public static /* synthetic */ void lambda$ojr4emKxrBkG4rlBVpytD2Dc0Fk(OTPView oTPView) {
        d(oTPView);
    }

    private /* synthetic */ OTPView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private OTPView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0, 0);
        dqc.d(context, "context");
        this.x = c.a;
        this.y = b.a;
        this.z = new ArrayList();
        LayoutInflater.from(context).inflate(R.layout.otp_view_layout, (ViewGroup) this, true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.OTPView, 0, 0);
        try {
            this.b = obtainStyledAttributes.getInteger(16, 1);
            this.c = obtainStyledAttributes.getBoolean(20, false);
            this.d = obtainStyledAttributes.getInteger(0, 0);
            this.e = obtainStyledAttributes.getInteger(2, 0);
            this.f = obtainStyledAttributes.getString(1);
            this.g = obtainStyledAttributes.getDimensionPixelSize(18, 44);
            this.h = obtainStyledAttributes.getDimensionPixelSize(17, 44);
            this.i = obtainStyledAttributes.getColor(6, ViewCompat.MEASURED_STATE_MASK);
            this.j = obtainStyledAttributes.getBoolean(4, false);
            this.k = obtainStyledAttributes.getDimensionPixelSize(19, b(8));
            this.l = obtainStyledAttributes.getBoolean(15, false);
            this.m = obtainStyledAttributes.getDimensionPixelSize(22, b(14));
            this.n = obtainStyledAttributes.getInteger(21, ViewCompat.MEASURED_STATE_MASK);
            GradientDrawable drawable = obtainStyledAttributes.getDrawable(5);
            if (drawable == null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(b(8));
                gradientDrawable.setColor(-1);
                gradientDrawable.setStroke(b(2), ViewCompat.MEASURED_STATE_MASK);
                drawable = gradientDrawable;
            }
            this.o = drawable;
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(R.styleable.TextAppearance);
            dqc.b(obtainStyledAttributes2, "context.obtainStyledAttributes(R.styleable.TextAppearance)");
            obtainStyledAttributes2.getResourceId(3, 0);
            obtainStyledAttributes2.getResourceId(10, R.font.montserrat_regular);
            this.a = ResourcesCompat.getFont(context, R.font.montserrat_regular);
            this.p = obtainStyledAttributes.getDimensionPixelSize(14, this.m);
            this.q = obtainStyledAttributes.getInteger(13, this.n);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(11);
            this.r = drawable2 == null ? this.o : drawable2;
            this.s = this.a;
            this.t = obtainStyledAttributes.getDimensionPixelSize(10, this.m);
            this.u = obtainStyledAttributes.getInteger(9, this.n);
            Drawable drawable3 = obtainStyledAttributes.getDrawable(7);
            this.v = drawable3 == null ? this.o : drawable3;
            this.w = this.a;
            a();
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c extends dqd implements dow<String, dmg> {
        public static final c a = new c();

        c() {
            super(1);
        }

        @Override // defpackage.dow
        public final /* synthetic */ dmg invoke(String str) {
            dqc.d(str, "it");
            return dmg.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b extends dqd implements dow<Boolean, dmg> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // defpackage.dow
        public final /* synthetic */ dmg invoke(Boolean bool) {
            bool.booleanValue();
            return dmg.a;
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", "after", "onTextChanged", "before", "core-ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements TextWatcher {
        final /* synthetic */ int b;

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public a(int i) {
            OTPView.this = r1;
            this.b = i;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            Character ch;
            if (!OTPView.this.B) {
                Editable text = ((EditText) OTPView.this.z.get(this.b)).getText();
                dqc.b(text, "editTexts[index].text");
                boolean z = true;
                if (text.length() == 0) {
                    OTPView.this.a(false);
                } else if (((EditText) OTPView.this.z.get(this.b)).getText().length() > 1) {
                    EditText editText = (EditText) OTPView.this.z.get(this.b);
                    if (editable == null) {
                        ch = null;
                    } else {
                        Editable editable2 = editable;
                        dqc.d(editable2, "$this$first");
                        if (editable2.length() != 0) {
                            z = false;
                        }
                        if (!z) {
                            ch = Character.valueOf(editable2.charAt(0));
                        } else {
                            throw new NoSuchElementException("Char sequence is empty.");
                        }
                    }
                    editText.setText(String.valueOf(ch));
                } else {
                    OTPView.this.a(true);
                }
            }
        }
    }

    private final void a() {
        int i = this.b;
        if (i > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                final EditText editText = new EditText(getContext());
                editText.setCursorVisible(this.c);
                editText.setInputType(this.d);
                if (Build.VERSION.SDK_INT >= 26) {
                    editText.setImportantForAutofill(this.e);
                    editText.setAutofillHints(new String[]{this.f});
                }
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.g, this.h);
                editText.setAllCaps(this.j);
                layoutParams.setMargins(i2 == 0 ? b(8) : b(0), b(8), this.k, b(8));
                editText.setLayoutParams(layoutParams);
                editText.setGravity(17);
                a(editText);
                editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.ucare.we.util.-$$Lambda$OTPView$ERTa9A8uVD_3lOz5uta3aJBOrWQ
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z) {
                        OTPView.lambda$ERTa9A8uVD_3lOz5uta3aJBOrWQ(editText, view, z);
                    }
                });
                this.z.add(editText);
                ((LinearLayout) findViewById(R.id.otp_wrapper)).addView(editText);
                a(i2);
                if (i3 >= i) {
                    break;
                }
                i2 = i3;
            }
        }
        b();
        this.z.get(0).postDelayed(new Runnable() { // from class: com.ucare.we.util.-$$Lambda$OTPView$RqncpbwZzZlHqX4t9KJrCsIfBa4
            @Override // java.lang.Runnable
            public final void run() {
                OTPView.lambda$RqncpbwZzZlHqX4t9KJrCsIfBa4(OTPView.this);
            }
        }, 100L);
    }

    public static final void c(OTPView oTPView) {
        dqc.d(oTPView, "this$0");
        EditText editText = oTPView.z.get(oTPView.A);
        editText.requestFocus();
        oTPView.b();
        oTPView.a(true, editText);
    }

    private final void a(final int i) {
        this.z.get(i).addTextChangedListener(new a(i));
        this.z.get(i).setOnKeyListener(new View.OnKeyListener() { // from class: com.ucare.we.util.-$$Lambda$OTPView$ILyVHwnD6cwGcumw0EvzLoLTMgc
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                return OTPView.lambda$ILyVHwnD6cwGcumw0EvzLoLTMgc(OTPView.this, i, view, i2, keyEvent);
            }
        });
        this.z.get(i).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.ucare.we.util.-$$Lambda$OTPView$WjKwe-gWB96gLBvNqyN3gEYJc_Y
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                OTPView.m74lambda$WjKwegWB96gLBvNqyN3gEYJc_Y(OTPView.this, i, view, z);
            }
        });
        if (this.l) {
            for (EditText editText : this.z) {
                editText.setTransformationMethod(new div());
            }
        }
    }

    public static final boolean a(OTPView oTPView, int i, View view, int i2, KeyEvent keyEvent) {
        dqc.d(oTPView, "this$0");
        if (i2 == 67 && keyEvent.getAction() == 0) {
            oTPView.B = true;
            oTPView.z.get(i).setText("");
            oTPView.a(false);
            oTPView.B = false;
        }
        if (keyEvent.getAction() == 0 && i2 == 66 && oTPView.c()) {
            oTPView.x.invoke(oTPView.getStringFromFields());
        }
        return false;
    }

    public static final void a(OTPView oTPView, int i, View view, boolean z) {
        dqc.d(oTPView, "this$0");
        if (z) {
            oTPView.A = i;
        }
        oTPView.b();
        view.post(new Runnable() { // from class: com.ucare.we.util.-$$Lambda$OTPView$ojr4emKxrBkG4rlBVpytD2Dc0Fk
            @Override // java.lang.Runnable
            public final void run() {
                OTPView.lambda$ojr4emKxrBkG4rlBVpytD2Dc0Fk(OTPView.this);
            }
        });
    }

    public static final void d(OTPView oTPView) {
        dqc.d(oTPView, "this$0");
        if (oTPView.A < oTPView.z.size()) {
            oTPView.z.get(oTPView.A).setSelection(0);
        }
    }

    public final void a(boolean z) {
        this.A = z ? this.A + 1 : this.A - 1;
        int i = this.A;
        if (i < 0) {
            this.A = 0;
        } else if (i < this.z.size()) {
            this.z.get(this.A).requestFocus();
        } else {
            for (EditText editText : this.z) {
                editText.clearFocus();
            }
            a(false, (EditText) dmq.d((List<? extends Object>) this.z));
            if (c()) {
                this.x.invoke(getStringFromFields());
            }
        }
        this.y.invoke(Boolean.valueOf(c()));
        b();
    }

    public static final void a(final EditText editText, View view, boolean z) {
        dqc.d(editText, "$et");
        if (z) {
            editText.post(new Runnable() { // from class: com.ucare.we.util.-$$Lambda$OTPView$0fHeq3tTWpO7Bit7flPdLnovLsA
                @Override // java.lang.Runnable
                public final void run() {
                    OTPView.lambda$0fHeq3tTWpO7Bit7flPdLnovLsA(editText);
                }
            });
        }
    }

    public static final void d(EditText editText) {
        dqc.d(editText, "$et");
        editText.setSelection(0);
    }

    private final void b() {
        int size = this.z.size();
        if (size > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                EditText editText = this.z.get(i);
                int i3 = this.A;
                if (i < i3) {
                    c(editText);
                } else if (i == i3) {
                    b(editText);
                } else if (i > i3) {
                    a(editText);
                }
                if (i2 >= size) {
                    return;
                }
                i = i2;
            }
        }
    }

    private final void a(EditText editText) {
        editText.setTextSize(0, this.m);
        editText.setTextColor(this.n);
        editText.setBackground(this.o);
        editText.setTypeface(this.a);
    }

    private final void b(EditText editText) {
        editText.setTextSize(0, this.p);
        editText.setTextColor(this.q);
        editText.setBackground(this.r);
        editText.setTypeface(this.s);
    }

    private final void c(EditText editText) {
        editText.setTextSize(0, this.t);
        editText.setTextColor(this.u);
        editText.setBackground(this.v);
        editText.setTypeface(this.w);
    }

    private static int b(int i) {
        return (int) (i * Resources.getSystem().getDisplayMetrics().density);
    }

    private final void a(boolean z, EditText editText) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (z) {
            if (inputMethodManager == null) {
                return;
            }
            inputMethodManager.showSoftInput(editText, 0);
        } else if (inputMethodManager == null) {
        } else {
            inputMethodManager.hideSoftInputFromWindow(editText.getApplicationWindowToken(), 0);
        }
    }

    private boolean c() {
        boolean z;
        Iterator<T> it = this.z.iterator();
        do {
            z = true;
            if (!it.hasNext()) {
                return true;
            }
            Editable text = ((EditText) it.next()).getText();
            if (text != null && !dsg.a(text)) {
                z = false;
                continue;
            }
        } while (!z);
        return false;
    }

    public final String getStringFromFields() {
        String str = "";
        for (EditText editText : this.z) {
            Editable text = editText.getText();
            dqc.b(text, "it.text");
            Editable editable = text;
            dqc.d(editable, "$this$firstOrNull");
            str = dqc.a(str, (Object) (editable.length() == 0 ? null : Character.valueOf(editable.charAt(0))));
        }
        return str;
    }

    public final void setOnFinishListener(dow<? super String, dmg> dowVar) {
        dqc.d(dowVar, "func");
        this.x = dowVar;
    }

    public final void setOnCharacterUpdatedListener(dow<? super Boolean, dmg> dowVar) {
        dqc.d(dowVar, "func");
        this.y = dowVar;
    }

    public final void setText(String str) {
        dqc.d(str, "str");
        this.B = true;
        int size = this.z.size();
        if (size > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i < str.length()) {
                    this.z.get(i).setText(String.valueOf(str.charAt(i)));
                } else {
                    this.z.get(i).setText("");
                }
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
        }
        String str2 = str;
        if (str2.length() < this.z.size()) {
            int length = str2.length();
            this.A = length;
            this.B = false;
            a(true, this.z.get(length));
        } else {
            for (EditText editText : this.z) {
                editText.clearFocus();
            }
            this.A = this.z.size();
            this.B = false;
            a(false, (EditText) dmq.d((List<? extends Object>) this.z));
        }
        b();
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        for (EditText editText : this.z) {
            editText.setEnabled(z);
        }
    }
}
