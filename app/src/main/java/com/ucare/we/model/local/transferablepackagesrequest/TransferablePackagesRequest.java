package com.ucare.we.model.local.transferablepackagesrequest;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/ucare/we/model/local/transferablepackagesrequest/TransferablePackagesRequest;", "", "resourceType", "", "freeAmount", "", "(Ljava/lang/String;I)V", "getFreeAmount", "()I", "setFreeAmount", "(I)V", "getResourceType", "()Ljava/lang/String;", "setResourceType", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class TransferablePackagesRequest {
    @cqh(a = "freeAmount")
    private int freeAmount;
    @cqh(a = "resourceType")
    private String resourceType;

    public static /* synthetic */ TransferablePackagesRequest copy$default(TransferablePackagesRequest transferablePackagesRequest, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = transferablePackagesRequest.resourceType;
        }
        if ((i2 & 2) != 0) {
            i = transferablePackagesRequest.freeAmount;
        }
        return transferablePackagesRequest.copy(str, i);
    }

    public final String component1() {
        return this.resourceType;
    }

    public final int component2() {
        return this.freeAmount;
    }

    public final TransferablePackagesRequest copy(String str, int i) {
        dqc.d(str, "resourceType");
        return new TransferablePackagesRequest(str, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferablePackagesRequest)) {
            return false;
        }
        TransferablePackagesRequest transferablePackagesRequest = (TransferablePackagesRequest) obj;
        return dqc.a((Object) this.resourceType, (Object) transferablePackagesRequest.resourceType) && this.freeAmount == transferablePackagesRequest.freeAmount;
    }

    public final int hashCode() {
        return (this.resourceType.hashCode() * 31) + this.freeAmount;
    }

    public final String toString() {
        return "TransferablePackagesRequest(resourceType=" + this.resourceType + ", freeAmount=" + this.freeAmount + ')';
    }

    public TransferablePackagesRequest(String str, int i) {
        dqc.d(str, "resourceType");
        this.resourceType = str;
        this.freeAmount = i;
    }

    public final String getResourceType() {
        return this.resourceType;
    }

    public final void setResourceType(String str) {
        dqc.d(str, "<set-?>");
        this.resourceType = str;
    }

    public final int getFreeAmount() {
        return this.freeAmount;
    }

    public final void setFreeAmount(int i) {
        this.freeAmount = i;
    }
}
