package com.ucare.we.model.remote.transferunits;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/ucare/we/model/remote/transferunits/TabLineUsage;", "", "tabArName", "", "tabEnName", "tabId", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getTabArName", "()Ljava/lang/String;", "setTabArName", "(Ljava/lang/String;)V", "getTabEnName", "setTabEnName", "getTabId", "()I", "setTabId", "(I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class TabLineUsage {
    @cqh(a = "tabArName")
    private String tabArName;
    @cqh(a = "tabEnName")
    private String tabEnName;
    @cqh(a = "tabId")
    private int tabId;

    public static /* synthetic */ TabLineUsage copy$default(TabLineUsage tabLineUsage, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = tabLineUsage.tabArName;
        }
        if ((i2 & 2) != 0) {
            str2 = tabLineUsage.tabEnName;
        }
        if ((i2 & 4) != 0) {
            i = tabLineUsage.tabId;
        }
        return tabLineUsage.copy(str, str2, i);
    }

    public final String component1() {
        return this.tabArName;
    }

    public final String component2() {
        return this.tabEnName;
    }

    public final int component3() {
        return this.tabId;
    }

    public final TabLineUsage copy(String str, String str2, int i) {
        dqc.d(str, "tabArName");
        dqc.d(str2, "tabEnName");
        return new TabLineUsage(str, str2, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabLineUsage)) {
            return false;
        }
        TabLineUsage tabLineUsage = (TabLineUsage) obj;
        return dqc.a((Object) this.tabArName, (Object) tabLineUsage.tabArName) && dqc.a((Object) this.tabEnName, (Object) tabLineUsage.tabEnName) && this.tabId == tabLineUsage.tabId;
    }

    public final int hashCode() {
        return (((this.tabArName.hashCode() * 31) + this.tabEnName.hashCode()) * 31) + this.tabId;
    }

    public final String toString() {
        return "TabLineUsage(tabArName=" + this.tabArName + ", tabEnName=" + this.tabEnName + ", tabId=" + this.tabId + ')';
    }

    public TabLineUsage(String str, String str2, int i) {
        dqc.d(str, "tabArName");
        dqc.d(str2, "tabEnName");
        this.tabArName = str;
        this.tabEnName = str2;
        this.tabId = i;
    }

    public final String getTabArName() {
        return this.tabArName;
    }

    public final void setTabArName(String str) {
        dqc.d(str, "<set-?>");
        this.tabArName = str;
    }

    public final String getTabEnName() {
        return this.tabEnName;
    }

    public final void setTabEnName(String str) {
        dqc.d(str, "<set-?>");
        this.tabEnName = str;
    }

    public final int getTabId() {
        return this.tabId;
    }

    public final void setTabId(int i) {
        this.tabId = i;
    }
}
