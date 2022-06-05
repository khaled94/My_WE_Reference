package com.ucare.we.model.FMCModel;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public class FMCMemebrsResponseBody {
    @cqh(a = "beginRecord")
    int beginRecord;
    @cqh(a = "groupMembers")
    ArrayList<FMCGroupMember> groupMembers;
    @cqh(a = "resultRecords")
    int resultRecords;
    @cqh(a = "totalRecords")
    int totalRecords;

    public ArrayList<FMCGroupMember> getGroupMembers() {
        return this.groupMembers;
    }

    public void setGroupMembers(ArrayList<FMCGroupMember> arrayList) {
        this.groupMembers = arrayList;
    }

    public int getTotalRecords() {
        return this.totalRecords;
    }

    public void setTotalRecords(int i) {
        this.totalRecords = i;
    }

    public int getBeginRecord() {
        return this.beginRecord;
    }

    public void setBeginRecord(int i) {
        this.beginRecord = i;
    }

    public int getResultRecords() {
        return this.resultRecords;
    }

    public void setResultRecords(int i) {
        this.resultRecords = i;
    }
}
