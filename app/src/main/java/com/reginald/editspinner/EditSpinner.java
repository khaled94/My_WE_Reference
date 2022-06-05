package com.reginald.editspinner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListPopupWindow;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public class EditSpinner extends EditText {
    ListPopupWindow a;
    boolean b;
    private ListAdapter c;
    private int d;
    private Drawable e;
    private PopupWindow.OnDismissListener f;
    private d g;
    private AdapterView.OnItemClickListener h;
    private b i;
    private boolean j = true;
    private long k = 0;
    private boolean l = false;
    private boolean m;
    private KeyListener n;

    /* loaded from: classes.dex */
    public interface b {
        String a();
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    public EditSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = true;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.EditSpinner, 0, 0);
        ListPopupWindow listPopupWindow = new ListPopupWindow(context, attributeSet);
        this.a = listPopupWindow;
        listPopupWindow.setSoftInputMode(16);
        this.a.setPromptPosition(1);
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.EditSpinner_dropDownSelector);
        if (drawable != null) {
            this.a.setListSelector(drawable);
        }
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.EditSpinner_dropDownAnimStyle, -1);
        if (resourceId > 0) {
            setDropDownAnimationStyle(resourceId);
        }
        this.e = obtainStyledAttributes.getDrawable(R.styleable.EditSpinner_dropDownDrawable);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.EditSpinner_dropDownDrawableSpacing, 0);
        if (this.e != null) {
            a(this.e, obtainStyledAttributes.getDimensionPixelOffset(R.styleable.EditSpinner_dropDownDrawableWidth, -1), obtainStyledAttributes.getDimensionPixelOffset(R.styleable.EditSpinner_dropDownDrawableHeight, -1));
            setDropDownDrawableSpacing(dimensionPixelOffset);
        }
        this.d = obtainStyledAttributes.getResourceId(R.styleable.EditSpinner_dropDownAnchor, -1);
        this.a.setWidth(obtainStyledAttributes.getLayoutDimension(R.styleable.EditSpinner_dropDownWidth, -2));
        this.a.setHeight(obtainStyledAttributes.getLayoutDimension(R.styleable.EditSpinner_dropDownHeight, -2));
        this.a.setOnItemClickListener(new a(this, (byte) 0));
        this.a.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.reginald.editspinner.EditSpinner.1
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                EditSpinner.this.k = SystemClock.elapsedRealtime();
                if (EditSpinner.this.f != null) {
                    EditSpinner.this.f.onDismiss();
                }
            }
        });
        obtainStyledAttributes.recycle();
        this.m = getKeyListener() != null;
        setFocusable(true);
        addTextChangedListener(new c(this, (byte) 0));
    }

    public void setEditable(boolean z) {
        if (this.m == z) {
            return;
        }
        this.m = z;
        if (z) {
            KeyListener keyListener = this.n;
            if (keyListener == null) {
                return;
            }
            setKeyListener(keyListener);
            return;
        }
        this.n = getKeyListener();
        setKeyListener(null);
    }

    public int getDropDownWidth() {
        return this.a.getWidth();
    }

    public void setDropDownWidth(int i) {
        this.a.setWidth(i);
    }

    public int getDropDownHeight() {
        return this.a.getHeight();
    }

    public void setDropDownHeight(int i) {
        this.a.setHeight(i);
    }

    public int getDropDownAnchor() {
        return this.d;
    }

    public void setDropDownAnchor(int i) {
        this.d = i;
        this.a.setAnchorView(null);
    }

    public Drawable getDropDownBackground() {
        return this.a.getBackground();
    }

    public void setDropDownBackgroundDrawable(Drawable drawable) {
        this.a.setBackgroundDrawable(drawable);
    }

    public void setDropDownBackgroundResource(int i) {
        this.a.setBackgroundDrawable(getContext().getResources().getDrawable(i));
    }

    public int getDropDownVerticalOffset() {
        return this.a.getVerticalOffset();
    }

    public void setDropDownVerticalOffset(int i) {
        this.a.setVerticalOffset(i);
    }

    public int getDropDownHorizontalOffset() {
        return this.a.getHorizontalOffset();
    }

    public void setDropDownHorizontalOffset(int i) {
        this.a.setHorizontalOffset(i);
    }

    public int getDropDownAnimationStyle() {
        return this.a.getAnimationStyle();
    }

    public void setDropDownAnimationStyle(int i) {
        this.a.setAnimationStyle(i);
    }

    public void setDropDownDismissedOnCompletion(boolean z) {
        this.j = z;
    }

    public int getListSelection() {
        return this.a.getSelectedItemPosition();
    }

    public void setListSelection(int i) {
        this.a.setSelection(i);
    }

    public void setDropDownDrawable(Drawable drawable) {
        a(drawable, -1, -1);
    }

    private void a(Drawable drawable, int i, int i2) {
        this.e = drawable;
        if (i >= 0 && i2 >= 0) {
            drawable.setBounds(new Rect(0, 0, i, i2));
            setCompoundDrawables(null, null, drawable, null);
            return;
        }
        setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
    }

    private void a() {
        if (this.a.getAnchorView() == null) {
            if (this.d != -1) {
                this.a.setAnchorView(getRootView().findViewById(this.d));
            } else {
                this.a.setAnchorView(this);
            }
        }
        if (!this.a.isShowing()) {
            this.a.setInputMethodMode(1);
        }
        requestFocus();
        this.a.show();
        this.a.getListView().setOverScrollMode(0);
    }

    public void setAdapter(ListAdapter listAdapter) {
        this.c = listAdapter;
        this.a.setAdapter(listAdapter);
    }

    public void setDropDownDrawableSpacing(int i) {
        setCompoundDrawablePadding(i);
    }

    public int getDropDownDrawableSpacing() {
        return getCompoundDrawablePadding();
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f = onDismissListener;
    }

    public void setOnShowListener(d dVar) {
        this.g = dVar;
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.h = onItemClickListener;
    }

    public void setItemConverter(b bVar) {
        this.i = bVar;
    }

    private void b() {
        a((View) null, -1, -1L);
    }

    @Override // android.view.View
    protected void onDisplayHint(int i) {
        super.onDisplayHint(i);
        if (i != 4) {
            return;
        }
        this.a.dismiss();
    }

    @Override // android.widget.TextView
    protected boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        if (this.a.isShowing()) {
            a();
        }
        return frame;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z) {
            this.a.dismiss();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        new StringBuilder("onTouchEvent() event = ").append(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            if (a(motionEvent)) {
                this.l = true;
                return true;
            }
            this.l = false;
        } else if (action == 1 && this.l && a(motionEvent)) {
            if (SystemClock.elapsedRealtime() - this.k > 200) {
                clearFocus();
                a();
                return true;
            }
            this.a.dismiss();
        }
        return super.onTouchEvent(motionEvent);
    }

    private boolean a(MotionEvent motionEvent) {
        int width = this.m ? getWidth() - getCompoundPaddingRight() : 0;
        int width2 = getWidth();
        int height = getHeight();
        String.format("x = %d, y = %d, areaLeft = %d, areaRight = %d, areaTop = %d, areaBottom = %d", Integer.valueOf((int) motionEvent.getX()), Integer.valueOf((int) motionEvent.getY()), Integer.valueOf(width), Integer.valueOf(width2), 0, Integer.valueOf(height));
        return motionEvent.getX() > ((float) width) && motionEvent.getX() < ((float) width2) && motionEvent.getY() > 0.0f && motionEvent.getY() < ((float) height);
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.a.onKeyUp(i, keyEvent) && (i == 23 || i == 61 || i == 66)) {
            if (keyEvent.hasNoModifiers()) {
                b();
            }
            return true;
        } else if (this.a.isShowing() && i == 61 && keyEvent.hasNoModifiers()) {
            b();
            return true;
        } else {
            return super.onKeyUp(i, keyEvent);
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.a.onKeyDown(i, keyEvent)) {
            return true;
        }
        if (this.a.isShowing() && i == 61 && keyEvent.hasNoModifiers()) {
            return true;
        }
        boolean onKeyDown = super.onKeyDown(i, keyEvent);
        if (onKeyDown && this.a.isShowing()) {
            this.a.clearListSelection();
        }
        return onKeyDown;
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        Drawable drawable5 = this.e;
        if (drawable5 != null) {
            drawable3 = drawable5;
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    /* loaded from: classes.dex */
    class c implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        private c() {
        }

        /* synthetic */ c(EditSpinner editSpinner, byte b) {
            this();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            EditSpinner editSpinner = EditSpinner.this;
            StringBuilder sb = new StringBuilder("after text changed: openBefore=");
            sb.append(editSpinner.b);
            sb.append(" open=");
            sb.append(editSpinner.a.isShowing());
            if ((!editSpinner.b || editSpinner.a.isShowing()) && editSpinner.a.isShowing()) {
                editSpinner.a.dismiss();
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            EditSpinner editSpinner = EditSpinner.this;
            editSpinner.b = editSpinner.a.isShowing();
            new StringBuilder("before text changed: open=").append(editSpinner.b);
        }
    }

    /* loaded from: classes.dex */
    class a implements AdapterView.OnItemClickListener {
        private a() {
        }

        /* synthetic */ a(EditSpinner editSpinner, byte b) {
            this();
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
            EditSpinner.this.a(view, i, j);
        }
    }

    private void a(Object obj) {
        String str;
        if (obj != null) {
            b bVar = this.i;
            if (bVar != null) {
                str = bVar.a();
            } else {
                str = obj.toString();
            }
            clearComposingText();
            setText(str);
            Editable text = getText();
            Selection.setSelection(text, text.length());
        }
    }

    protected final void a(View view, int i, long j) {
        Object obj;
        if (this.a.isShowing()) {
            if (i < 0) {
                obj = this.a.getSelectedItem();
            } else {
                obj = this.c.getItem(i);
            }
            if (obj == null) {
                return;
            }
            a(obj);
            if (this.h != null) {
                ListPopupWindow listPopupWindow = this.a;
                if (view == null || i < 0) {
                    view = listPopupWindow.getSelectedView();
                    i = listPopupWindow.getSelectedItemPosition();
                    j = listPopupWindow.getSelectedItemId();
                }
                this.h.onItemClick(listPopupWindow.getListView(), view, i, j);
            }
        }
        if (this.j) {
            this.a.dismiss();
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        this.a.dismiss();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4 && this.a.isShowing()) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            } else if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    this.a.dismiss();
                    return true;
                }
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }
}
