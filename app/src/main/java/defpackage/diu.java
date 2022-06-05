package defpackage;

import androidx.core.util.ObjectsCompat;
import androidx.recyclerview.widget.DiffUtil;
import com.ucare.we.model.UserCredentials;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/ucare/we/switchaccount/adapter/MyAccountsDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/ucare/we/model/UserCredentials;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: diu  reason: default package */
/* loaded from: classes2.dex */
public final class diu extends DiffUtil.ItemCallback<UserCredentials> {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final /* synthetic */ boolean areContentsTheSame(UserCredentials userCredentials, UserCredentials userCredentials2) {
        UserCredentials userCredentials3 = userCredentials;
        UserCredentials userCredentials4 = userCredentials2;
        dqc.d(userCredentials3, "oldItem");
        dqc.d(userCredentials4, "newItem");
        return ObjectsCompat.equals(userCredentials3, userCredentials4);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final /* synthetic */ boolean areItemsTheSame(UserCredentials userCredentials, UserCredentials userCredentials2) {
        UserCredentials userCredentials3 = userCredentials;
        UserCredentials userCredentials4 = userCredentials2;
        dqc.d(userCredentials3, "oldItem");
        dqc.d(userCredentials4, "newItem");
        return dqc.a((Object) userCredentials3.getMobileNumber(), (Object) userCredentials4.getMobileNumber());
    }
}
