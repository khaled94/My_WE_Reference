package com.ucare.we.model.family;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÂ\u0003J-\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ucare/we/model/family/FamilyChangeMainPlanBody;", "", "groupId", "", "offerId", "parentOfferId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FamilyChangeMainPlanBody {
    @cqh(a = "groupId")
    private final String groupId;
    @cqh(a = "offerId")
    private final String offerId;
    @cqh(a = "parentOfferId")
    private final String parentOfferId;

    public FamilyChangeMainPlanBody() {
        this(null, null, null, 7, null);
    }

    private final String component1() {
        return this.groupId;
    }

    private final String component2() {
        return this.offerId;
    }

    private final String component3() {
        return this.parentOfferId;
    }

    public static /* synthetic */ FamilyChangeMainPlanBody copy$default(FamilyChangeMainPlanBody familyChangeMainPlanBody, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = familyChangeMainPlanBody.groupId;
        }
        if ((i & 2) != 0) {
            str2 = familyChangeMainPlanBody.offerId;
        }
        if ((i & 4) != 0) {
            str3 = familyChangeMainPlanBody.parentOfferId;
        }
        return familyChangeMainPlanBody.copy(str, str2, str3);
    }

    public final FamilyChangeMainPlanBody copy(String str, String str2, String str3) {
        return new FamilyChangeMainPlanBody(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FamilyChangeMainPlanBody)) {
            return false;
        }
        FamilyChangeMainPlanBody familyChangeMainPlanBody = (FamilyChangeMainPlanBody) obj;
        return dqc.a((Object) this.groupId, (Object) familyChangeMainPlanBody.groupId) && dqc.a((Object) this.offerId, (Object) familyChangeMainPlanBody.offerId) && dqc.a((Object) this.parentOfferId, (Object) familyChangeMainPlanBody.parentOfferId);
    }

    public final int hashCode() {
        String str = this.groupId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.offerId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.parentOfferId;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "FamilyChangeMainPlanBody(groupId=" + ((Object) this.groupId) + ", offerId=" + ((Object) this.offerId) + ", parentOfferId=" + ((Object) this.parentOfferId) + ')';
    }

    public FamilyChangeMainPlanBody(String str, String str2, String str3) {
        this.groupId = str;
        this.offerId = str2;
        this.parentOfferId = str3;
    }

    public /* synthetic */ FamilyChangeMainPlanBody(String str, String str2, String str3, int i, dpx dpxVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
