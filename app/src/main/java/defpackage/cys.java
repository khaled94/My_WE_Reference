package defpackage;

import com.ucare.we.model.usagedetails.DetailedLineUsageItem;
import com.ucare.we.model.usagedetails.HomePageResponseBody;
import com.ucare.we.model.usagedetails.SummarizedLineUsageItem;
import com.ucare.we.model.usagedetails.TabLineUsage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: cys  reason: default package */
/* loaded from: classes2.dex */
public final class cys {
    public static cyq a(HomePageResponseBody homePageResponseBody) {
        cyq cyqVar = new cyq();
        HashMap<Long, List<cyr>> hashMap = new HashMap<>();
        List<DetailedLineUsageItem> detailedLineUsageList = homePageResponseBody.getDetailedLineUsageList();
        List<SummarizedLineUsageItem> summarizedLineUsageList = homePageResponseBody.getSummarizedLineUsageList();
        for (TabLineUsage tabLineUsage : homePageResponseBody.getTabLineUsages()) {
            ArrayList arrayList = new ArrayList();
            Long tabId = tabLineUsage.getTabId();
            for (int i = 0; i < summarizedLineUsageList.size(); i++) {
                SummarizedLineUsageItem summarizedLineUsageItem = summarizedLineUsageList.get(i);
                String summaryGroupName = summarizedLineUsageItem.getSummaryGroupName();
                if (tabId == summarizedLineUsageItem.getTabId()) {
                    for (int i2 = 0; i2 < detailedLineUsageList.size(); i2++) {
                        DetailedLineUsageItem detailedLineUsageItem = detailedLineUsageList.get(i2);
                        if (summaryGroupName.equals(detailedLineUsageItem.getSummaryGroupName())) {
                            cyr cyrVar = new cyr();
                            cyrVar.b = detailedLineUsageItem.getFreeAmount();
                            cyrVar.a = detailedLineUsageItem.getInitialTotalAmount();
                            cyrVar.c = detailedLineUsageItem.getFreeUnitEnName();
                            cyrVar.d = detailedLineUsageItem.getFreeUnitArName();
                            cyrVar.e = detailedLineUsageItem.getMeasureUnitEnName();
                            cyrVar.f = detailedLineUsageItem.getMeasureUnitArName();
                            cyrVar.g = detailedLineUsageItem.getSummaryGroupName();
                            cyrVar.j = tabLineUsage.getTabArName();
                            cyrVar.i = tabLineUsage.getTabEnName();
                            cyrVar.h = detailedLineUsageItem.getRenewalDate();
                            cyrVar.k = detailedLineUsageItem.getServiceId();
                            arrayList.add(cyrVar);
                        }
                    }
                    hashMap.put(tabId, arrayList);
                }
            }
        }
        cyqVar.a = hashMap;
        return cyqVar;
    }
}
