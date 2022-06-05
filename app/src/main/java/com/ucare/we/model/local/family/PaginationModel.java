package com.ucare.we.model.local.family;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ucare/we/model/local/family/PaginationModel;", "", "beginRecord", "", "recordsInPage", "(II)V", "getBeginRecord", "()I", "getRecordsInPage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class PaginationModel {
    @cqh(a = "beginRecord")
    private final int beginRecord;
    @cqh(a = "recordsInPage")
    private final int recordsInPage;

    public PaginationModel() {
        this(0, 0, 3, null);
    }

    public static /* synthetic */ PaginationModel copy$default(PaginationModel paginationModel, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = paginationModel.beginRecord;
        }
        if ((i3 & 2) != 0) {
            i2 = paginationModel.recordsInPage;
        }
        return paginationModel.copy(i, i2);
    }

    public final int component1() {
        return this.beginRecord;
    }

    public final int component2() {
        return this.recordsInPage;
    }

    public final PaginationModel copy(int i, int i2) {
        return new PaginationModel(i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaginationModel)) {
            return false;
        }
        PaginationModel paginationModel = (PaginationModel) obj;
        return this.beginRecord == paginationModel.beginRecord && this.recordsInPage == paginationModel.recordsInPage;
    }

    public final int hashCode() {
        return (this.beginRecord * 31) + this.recordsInPage;
    }

    public final String toString() {
        return "PaginationModel(beginRecord=" + this.beginRecord + ", recordsInPage=" + this.recordsInPage + ')';
    }

    public PaginationModel(int i, int i2) {
        this.beginRecord = i;
        this.recordsInPage = i2;
    }

    public /* synthetic */ PaginationModel(int i, int i2, int i3, dpx dpxVar) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public final int getBeginRecord() {
        return this.beginRecord;
    }

    public final int getRecordsInPage() {
        return this.recordsInPage;
    }
}
