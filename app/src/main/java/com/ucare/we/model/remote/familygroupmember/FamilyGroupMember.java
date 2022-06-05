package com.ucare.we.model.remote.familygroupmember;

import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR.\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000e¨\u0006\""}, d2 = {"Lcom/ucare/we/model/remote/familygroupmember/FamilyGroupMember;", "", "beginRecord", "", "groupMembers", "Ljava/util/ArrayList;", "Lcom/ucare/we/model/remote/familygroupmember/GroupMember;", "Lkotlin/collections/ArrayList;", "resultRecords", "totalRecords", "(ILjava/util/ArrayList;II)V", "getBeginRecord", "()I", "setBeginRecord", "(I)V", "getGroupMembers", "()Ljava/util/ArrayList;", "setGroupMembers", "(Ljava/util/ArrayList;)V", "getResultRecords", "setResultRecords", "getTotalRecords", "setTotalRecords", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FamilyGroupMember {
    @cqh(a = "beginRecord")
    private int beginRecord;
    @cqh(a = "groupMembers")
    private ArrayList<GroupMember> groupMembers;
    @cqh(a = "resultRecords")
    private int resultRecords;
    @cqh(a = "totalRecords")
    private int totalRecords;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FamilyGroupMember copy$default(FamilyGroupMember familyGroupMember, int i, ArrayList arrayList, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = familyGroupMember.beginRecord;
        }
        if ((i4 & 2) != 0) {
            arrayList = familyGroupMember.groupMembers;
        }
        if ((i4 & 4) != 0) {
            i2 = familyGroupMember.resultRecords;
        }
        if ((i4 & 8) != 0) {
            i3 = familyGroupMember.totalRecords;
        }
        return familyGroupMember.copy(i, arrayList, i2, i3);
    }

    public final int component1() {
        return this.beginRecord;
    }

    public final ArrayList<GroupMember> component2() {
        return this.groupMembers;
    }

    public final int component3() {
        return this.resultRecords;
    }

    public final int component4() {
        return this.totalRecords;
    }

    public final FamilyGroupMember copy(int i, ArrayList<GroupMember> arrayList, int i2, int i3) {
        dqc.d(arrayList, "groupMembers");
        return new FamilyGroupMember(i, arrayList, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FamilyGroupMember)) {
            return false;
        }
        FamilyGroupMember familyGroupMember = (FamilyGroupMember) obj;
        return this.beginRecord == familyGroupMember.beginRecord && dqc.a(this.groupMembers, familyGroupMember.groupMembers) && this.resultRecords == familyGroupMember.resultRecords && this.totalRecords == familyGroupMember.totalRecords;
    }

    public final int hashCode() {
        return (((((this.beginRecord * 31) + this.groupMembers.hashCode()) * 31) + this.resultRecords) * 31) + this.totalRecords;
    }

    public final String toString() {
        return "FamilyGroupMember(beginRecord=" + this.beginRecord + ", groupMembers=" + this.groupMembers + ", resultRecords=" + this.resultRecords + ", totalRecords=" + this.totalRecords + ')';
    }

    public FamilyGroupMember(int i, ArrayList<GroupMember> arrayList, int i2, int i3) {
        dqc.d(arrayList, "groupMembers");
        this.beginRecord = i;
        this.groupMembers = arrayList;
        this.resultRecords = i2;
        this.totalRecords = i3;
    }

    public final int getBeginRecord() {
        return this.beginRecord;
    }

    public final void setBeginRecord(int i) {
        this.beginRecord = i;
    }

    public final ArrayList<GroupMember> getGroupMembers() {
        return this.groupMembers;
    }

    public final void setGroupMembers(ArrayList<GroupMember> arrayList) {
        dqc.d(arrayList, "<set-?>");
        this.groupMembers = arrayList;
    }

    public final int getResultRecords() {
        return this.resultRecords;
    }

    public final void setResultRecords(int i) {
        this.resultRecords = i;
    }

    public final int getTotalRecords() {
        return this.totalRecords;
    }

    public final void setTotalRecords(int i) {
        this.totalRecords = i;
    }
}
