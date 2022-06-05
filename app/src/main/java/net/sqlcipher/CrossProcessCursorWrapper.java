package net.sqlcipher;

import android.database.CrossProcessCursor;
import android.database.CursorWindow;

/* loaded from: classes2.dex */
public class CrossProcessCursorWrapper extends CursorWrapper implements CrossProcessCursor {
    @Override // android.database.CrossProcessCursor
    public CursorWindow getWindow() {
        return null;
    }

    @Override // android.database.CrossProcessCursor
    public boolean onMove(int i, int i2) {
        return true;
    }

    public CrossProcessCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    @Override // android.database.CrossProcessCursor
    public void fillWindow(int i, CursorWindow cursorWindow) {
        DatabaseUtils.cursorFillWindow(this, i, cursorWindow);
    }
}
