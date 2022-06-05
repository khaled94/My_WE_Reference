package com.ucare.we.model.family;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public class ManageConsumptionLimitMembersResponseBody {
    @cqh(a = "detailedLineUsageList")
    ArrayList<FamilyConsumptionLimitMembersList> detailedLineUsageList;

    public ArrayList<FamilyConsumptionLimitMembersList> getDetailedLineUsageList() {
        return this.detailedLineUsageList;
    }

    public void setDetailedLineUsageList(ArrayList<FamilyConsumptionLimitMembersList> arrayList) {
        this.detailedLineUsageList = arrayList;
    }
}
