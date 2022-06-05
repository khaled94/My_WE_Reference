package com.ucare.we.presentation.auth.signin;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

/* loaded from: classes2.dex */
public class NoMenuEditText extends EditText {
    private final Context a;

    @Override // android.widget.TextView
    public boolean isSuggestionsEnabled() {
        return false;
    }

    public NoMenuEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = context;
        setCustomSelectionActionModeCallback(new a((byte) 0));
        setLongClickable(false);
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        Editable text = getText();
        if (text != null && (i != text.length() || i2 != text.length())) {
            setSelection(text.length(), text.length());
        } else {
            super.onSelectionChanged(i, i2);
        }
    }

    @Override // android.widget.TextView
    public int getSelectionStart() {
        StackTraceElement[] stackTrace;
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            stackTraceElement.getMethodName();
            if (stackTraceElement.getMethodName().equals("canPaste") || stackTraceElement.getMethodName().equals("canCut") || stackTraceElement.getMethodName().equals("canCopy")) {
                return -1;
            }
        }
        return super.getSelectionStart();
    }

    /* loaded from: classes2.dex */
    static class a implements ActionMode.Callback {
        private final String a;

        @Override // android.view.ActionMode.Callback
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public final void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        private a() {
            this.a = NoMenuEditText.class.getSimpleName();
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }
}
