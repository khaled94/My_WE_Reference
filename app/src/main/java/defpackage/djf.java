package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0096\u0002J\u0018\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ucare/we/util/PasswordCharSequence;", "", "mSource", "(Ljava/lang/CharSequence;)V", "length", "", "getLength", "()I", "get", "", "index", "subSequence", "startIndex", "endIndex", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: djf  reason: default package */
/* loaded from: classes2.dex */
final class djf implements CharSequence {
    private CharSequence a;

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return '*';
    }

    public djf(CharSequence charSequence) {
        dqc.d(charSequence, "mSource");
        this.a = charSequence;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.a.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return this.a.length();
    }
}
