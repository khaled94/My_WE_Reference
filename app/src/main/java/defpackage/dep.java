package defpackage;

import androidx.recyclerview.widget.DiffUtil;
import com.ucare.we.model.remote.transferunits.DetailedLineUsage;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/ucare/we/presentation/family/groupinfo/managebundle/adapter/TransferUnitsBundleDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/ucare/we/model/remote/transferunits/DetailedLineUsage;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dep  reason: default package */
/* loaded from: classes2.dex */
public final class dep extends DiffUtil.ItemCallback<DetailedLineUsage> {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final /* synthetic */ boolean areContentsTheSame(DetailedLineUsage detailedLineUsage, DetailedLineUsage detailedLineUsage2) {
        DetailedLineUsage detailedLineUsage3 = detailedLineUsage;
        DetailedLineUsage detailedLineUsage4 = detailedLineUsage2;
        dqc.d(detailedLineUsage3, "oldItem");
        dqc.d(detailedLineUsage4, "newItem");
        return dqc.a(detailedLineUsage3, detailedLineUsage4);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final /* synthetic */ boolean areItemsTheSame(DetailedLineUsage detailedLineUsage, DetailedLineUsage detailedLineUsage2) {
        DetailedLineUsage detailedLineUsage3 = detailedLineUsage;
        DetailedLineUsage detailedLineUsage4 = detailedLineUsage2;
        dqc.d(detailedLineUsage3, "oldItem");
        dqc.d(detailedLineUsage4, "newItem");
        return dqc.a((Object) detailedLineUsage3.getItemCode(), (Object) detailedLineUsage4.getItemCode());
    }
}
