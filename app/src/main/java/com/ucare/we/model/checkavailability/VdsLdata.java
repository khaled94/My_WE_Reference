package com.ucare.we.model.checkavailability;

/* loaded from: classes2.dex */
public class VdsLdata {
    @cqh(a = "hasVDSLCPE")
    @cqf
    private Boolean hasVDSLCPE;
    @cqh(a = "hasVDSLCard")
    @cqf
    private Boolean hasVDSLCard;
    @cqh(a = "vdslport")
    @cqf
    private Boolean vdslport;

    public Boolean getHasVDSLCPE() {
        return this.hasVDSLCPE;
    }

    public void setHasVDSLCPE(Boolean bool) {
        this.hasVDSLCPE = bool;
    }

    public Boolean getHasVDSLCard() {
        return this.hasVDSLCard;
    }

    public void setHasVDSLCard(Boolean bool) {
        this.hasVDSLCard = bool;
    }

    public Boolean getVdslport() {
        return this.vdslport;
    }

    public void setVdslport(Boolean bool) {
        this.vdslport = bool;
    }
}
