package com.ucare.we.model.remote.transferunits;

import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u0005\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0003j\b\u0012\u0004\u0012\u00020\t`\u0005¢\u0006\u0002\u0010\nJ\u0019\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\u0019\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u0005HÆ\u0003J\u0019\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0003j\b\u0012\u0004\u0012\u00020\t`\u0005HÆ\u0003JW\u0010\u0016\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u00052\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0003j\b\u0012\u0004\u0012\u00020\t`\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R.\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR.\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR.\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0003j\b\u0012\u0004\u0012\u00020\t`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/ucare/we/model/remote/transferunits/TransferUnitResponse;", "", "detailedLineUsageList", "Ljava/util/ArrayList;", "Lcom/ucare/we/model/remote/transferunits/DetailedLineUsage;", "Lkotlin/collections/ArrayList;", "summarizedLineUsageList", "Lcom/ucare/we/model/remote/transferunits/SummarizedLineUsage;", "tabLineUsages", "Lcom/ucare/we/model/remote/transferunits/TabLineUsage;", "(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "getDetailedLineUsageList", "()Ljava/util/ArrayList;", "setDetailedLineUsageList", "(Ljava/util/ArrayList;)V", "getSummarizedLineUsageList", "setSummarizedLineUsageList", "getTabLineUsages", "setTabLineUsages", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class TransferUnitResponse {
    @cqh(a = "detailedLineUsageList")
    private ArrayList<DetailedLineUsage> detailedLineUsageList;
    @cqh(a = "summarizedLineUsageList")
    private ArrayList<SummarizedLineUsage> summarizedLineUsageList;
    @cqh(a = "tabLineUsages")
    private ArrayList<TabLineUsage> tabLineUsages;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransferUnitResponse copy$default(TransferUnitResponse transferUnitResponse, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = transferUnitResponse.detailedLineUsageList;
        }
        if ((i & 2) != 0) {
            arrayList2 = transferUnitResponse.summarizedLineUsageList;
        }
        if ((i & 4) != 0) {
            arrayList3 = transferUnitResponse.tabLineUsages;
        }
        return transferUnitResponse.copy(arrayList, arrayList2, arrayList3);
    }

    public final ArrayList<DetailedLineUsage> component1() {
        return this.detailedLineUsageList;
    }

    public final ArrayList<SummarizedLineUsage> component2() {
        return this.summarizedLineUsageList;
    }

    public final ArrayList<TabLineUsage> component3() {
        return this.tabLineUsages;
    }

    public final TransferUnitResponse copy(ArrayList<DetailedLineUsage> arrayList, ArrayList<SummarizedLineUsage> arrayList2, ArrayList<TabLineUsage> arrayList3) {
        dqc.d(arrayList, "detailedLineUsageList");
        dqc.d(arrayList2, "summarizedLineUsageList");
        dqc.d(arrayList3, "tabLineUsages");
        return new TransferUnitResponse(arrayList, arrayList2, arrayList3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferUnitResponse)) {
            return false;
        }
        TransferUnitResponse transferUnitResponse = (TransferUnitResponse) obj;
        return dqc.a(this.detailedLineUsageList, transferUnitResponse.detailedLineUsageList) && dqc.a(this.summarizedLineUsageList, transferUnitResponse.summarizedLineUsageList) && dqc.a(this.tabLineUsages, transferUnitResponse.tabLineUsages);
    }

    public final int hashCode() {
        return (((this.detailedLineUsageList.hashCode() * 31) + this.summarizedLineUsageList.hashCode()) * 31) + this.tabLineUsages.hashCode();
    }

    public final String toString() {
        return "TransferUnitResponse(detailedLineUsageList=" + this.detailedLineUsageList + ", summarizedLineUsageList=" + this.summarizedLineUsageList + ", tabLineUsages=" + this.tabLineUsages + ')';
    }

    public TransferUnitResponse(ArrayList<DetailedLineUsage> arrayList, ArrayList<SummarizedLineUsage> arrayList2, ArrayList<TabLineUsage> arrayList3) {
        dqc.d(arrayList, "detailedLineUsageList");
        dqc.d(arrayList2, "summarizedLineUsageList");
        dqc.d(arrayList3, "tabLineUsages");
        this.detailedLineUsageList = arrayList;
        this.summarizedLineUsageList = arrayList2;
        this.tabLineUsages = arrayList3;
    }

    public final ArrayList<DetailedLineUsage> getDetailedLineUsageList() {
        return this.detailedLineUsageList;
    }

    public final void setDetailedLineUsageList(ArrayList<DetailedLineUsage> arrayList) {
        dqc.d(arrayList, "<set-?>");
        this.detailedLineUsageList = arrayList;
    }

    public final ArrayList<SummarizedLineUsage> getSummarizedLineUsageList() {
        return this.summarizedLineUsageList;
    }

    public final void setSummarizedLineUsageList(ArrayList<SummarizedLineUsage> arrayList) {
        dqc.d(arrayList, "<set-?>");
        this.summarizedLineUsageList = arrayList;
    }

    public final ArrayList<TabLineUsage> getTabLineUsages() {
        return this.tabLineUsages;
    }

    public final void setTabLineUsages(ArrayList<TabLineUsage> arrayList) {
        dqc.d(arrayList, "<set-?>");
        this.tabLineUsages = arrayList;
    }
}
