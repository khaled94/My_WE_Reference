package defpackage;

import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* renamed from: ul  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class ul implements Comparator {
    public static final /* synthetic */ ul a = new ul();

    private /* synthetic */ ul() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
        return ((Scope) obj).b.compareTo(((Scope) obj2).b);
    }
}
