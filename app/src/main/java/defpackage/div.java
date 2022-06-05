package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/ucare/we/util/AsteriskPasswordTransformationMethod;", "Landroid/text/method/PasswordTransformationMethod;", "()V", "getTransformation", "", "source", "view", "Landroid/view/View;", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: div  reason: default package */
/* loaded from: classes2.dex */
public final class div extends PasswordTransformationMethod {
    @Override // android.text.method.PasswordTransformationMethod, android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        dqc.a(charSequence);
        return new djf(charSequence);
    }
}
