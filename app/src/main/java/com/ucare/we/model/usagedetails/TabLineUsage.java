package com.ucare.we.model.usagedetails;

/* loaded from: classes2.dex */
public class TabLineUsage {
    @cqh(a = "tabArName")
    private String tabArName;
    @cqh(a = "tabEnName")
    private String tabEnName;
    @cqh(a = "tabId")
    private Long tabId;

    public Long getTabId() {
        return this.tabId;
    }

    public void setTabId(Long l) {
        this.tabId = l;
    }

    public String getTabEnName() {
        return this.tabEnName;
    }

    public void setTabEnName(String str) {
        this.tabEnName = str;
    }

    public String getTabArName() {
        return this.tabArName;
    }

    public void setTabArName(String str) {
        this.tabArName = str;
    }

    public String toString() {
        return "tabId=" + this.tabId;
    }
}
