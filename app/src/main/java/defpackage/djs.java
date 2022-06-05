package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u0005¢\u0006\u0002\u0010\u0006J:\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0002R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ucare/we/util/extentions/MinMaxFilter;", "Landroid/text/InputFilter;", "minValue", "", "maxValue", "(II)V", "()V", "intMax", "intMin", "filter", "", "source", "start", "end", "dest", "Landroid/text/Spanned;", "dStart", "dEnd", "isInRange", "", "a", "b", "c", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: djs  reason: default package */
/* loaded from: classes2.dex */
public final class djs implements InputFilter {
    private int a;
    private int b;

    public djs() {
    }

    public djs(int i) {
        this();
        this.a = 1;
        this.b = i;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        dqc.d(charSequence, "source");
        dqc.d(spanned, "dest");
        try {
            StringBuilder sb = new StringBuilder();
            sb.append((Object) spanned);
            sb.append((Object) charSequence);
            int parseInt = Integer.parseInt(sb.toString());
            int i5 = this.a;
            int i6 = this.b;
            boolean z = true;
            if (i6 <= i5 ? i6 > parseInt || parseInt > i5 : i5 > parseInt || parseInt > i6) {
                z = false;
            }
            if (z) {
                return null;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return "";
    }
}
