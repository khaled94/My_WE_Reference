package com.ucare.we.model.family;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/ucare/we/model/family/RenewalInfo;", "", "remainingLocks", "", "(I)V", "getRemainingLocks", "()I", "setRemainingLocks", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class RenewalInfo {
    @cqh(a = "remainingLocks")
    private int remainingLocks;

    public static /* synthetic */ RenewalInfo copy$default(RenewalInfo renewalInfo, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = renewalInfo.remainingLocks;
        }
        return renewalInfo.copy(i);
    }

    public final int component1() {
        return this.remainingLocks;
    }

    public final RenewalInfo copy(int i) {
        return new RenewalInfo(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RenewalInfo) && this.remainingLocks == ((RenewalInfo) obj).remainingLocks;
    }

    public final int hashCode() {
        return this.remainingLocks;
    }

    public final String toString() {
        return "RenewalInfo(remainingLocks=" + this.remainingLocks + ')';
    }

    public RenewalInfo(int i) {
        this.remainingLocks = i;
    }

    public final int getRemainingLocks() {
        return this.remainingLocks;
    }

    public final void setRemainingLocks(int i) {
        this.remainingLocks = i;
    }
}
