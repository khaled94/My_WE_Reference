package com.ucare.we.model.usagedetails;

import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class HomePageResponseBody {
    @cqh(a = "detailedLineUsageList")
    private List<DetailedLineUsageItem> detailedLineUsageList;
    @cqh(a = "summarizedLineUsageList")
    private List<SummarizedLineUsageItem> summarizedLineUsageList;
    @cqh(a = "tabLineUsages")
    private Set<TabLineUsage> tabLineUsages;

    public Set<TabLineUsage> getTabLineUsages() {
        return this.tabLineUsages;
    }

    public void setTabLineUsages(Set<TabLineUsage> set) {
        this.tabLineUsages = set;
    }

    public List<DetailedLineUsageItem> getDetailedLineUsageList() {
        return this.detailedLineUsageList;
    }

    public void setDetailedLineUsageList(List<DetailedLineUsageItem> list) {
        this.detailedLineUsageList = list;
    }

    public List<SummarizedLineUsageItem> getSummarizedLineUsageList() {
        return this.summarizedLineUsageList;
    }

    public void setSummarizedLineUsageList(List<SummarizedLineUsageItem> list) {
        this.summarizedLineUsageList = list;
    }
}
