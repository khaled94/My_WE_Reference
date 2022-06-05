package defpackage;

import androidx.recyclerview.widget.DiffUtil;
import com.ucare.we.model.remote.subscribedoffers.FamilySubscribedOffer;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/ucare/we/presentation/family/groupinfo/adapters/DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/ucare/we/model/remote/subscribedoffers/FamilySubscribedOffer;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dej  reason: default package */
/* loaded from: classes2.dex */
public final class dej extends DiffUtil.ItemCallback<FamilySubscribedOffer> {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final /* synthetic */ boolean areContentsTheSame(FamilySubscribedOffer familySubscribedOffer, FamilySubscribedOffer familySubscribedOffer2) {
        FamilySubscribedOffer familySubscribedOffer3 = familySubscribedOffer;
        FamilySubscribedOffer familySubscribedOffer4 = familySubscribedOffer2;
        dqc.d(familySubscribedOffer3, "oldItem");
        dqc.d(familySubscribedOffer4, "newItem");
        return dqc.a((Object) familySubscribedOffer3.getOfferId(), (Object) familySubscribedOffer4.getOfferId());
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final /* synthetic */ boolean areItemsTheSame(FamilySubscribedOffer familySubscribedOffer, FamilySubscribedOffer familySubscribedOffer2) {
        FamilySubscribedOffer familySubscribedOffer3 = familySubscribedOffer;
        FamilySubscribedOffer familySubscribedOffer4 = familySubscribedOffer2;
        dqc.d(familySubscribedOffer3, "oldItem");
        dqc.d(familySubscribedOffer4, "newItem");
        return dqc.a((Object) familySubscribedOffer3.getOfferId(), (Object) familySubscribedOffer4.getOfferId());
    }
}
