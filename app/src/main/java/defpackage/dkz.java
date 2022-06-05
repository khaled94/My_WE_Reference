package defpackage;

import io.realm.internal.UncheckedRow;

/* renamed from: dkz  reason: default package */
/* loaded from: classes2.dex */
public final class dkz extends UncheckedRow {
    private UncheckedRow a;

    private dkz(UncheckedRow uncheckedRow) {
        super(uncheckedRow);
        this.a = uncheckedRow;
    }

    public static dkz a(UncheckedRow uncheckedRow) {
        return new dkz(uncheckedRow);
    }
}
