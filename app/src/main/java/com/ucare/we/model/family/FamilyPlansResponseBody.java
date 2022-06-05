package com.ucare.we.model.family;

import androidx.core.app.NotificationCompat;
import com.ucare.we.model.OfferDetails;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bN\b\u0086\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u001aJ\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u000fHÆ\u0003J\t\u0010N\u001a\u00020\u0011HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010T\u001a\u00020\u0006HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010Y\u001a\u00020\u0006HÆ\u0003J\t\u0010Z\u001a\u00020\u0006HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0006HÆ\u0003JÑ\u0001\u0010^\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010_\u001a\u00020\u00032\b\u0010`\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010a\u001a\u00020\u0011HÖ\u0001J\t\u0010b\u001a\u00020\u0006HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u001c\"\u0004\b\u001f\u0010\u001eR \u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#R\u001e\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010!\"\u0004\b-\u0010#R \u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010!\"\u0004\b/\u0010#R \u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010!\"\u0004\b1\u0010#R \u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010!\"\u0004\b3\u0010#R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001e\u0010\u0012\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u001c\"\u0004\b=\u0010\u001eR \u0010\u0013\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR \u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER \u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010!\"\u0004\bG\u0010#R \u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010!\"\u0004\bI\u0010#R\u001e\u0010\u0018\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010!\"\u0004\bK\u0010#¨\u0006c"}, d2 = {"Lcom/ucare/we/model/family/FamilyPlansResponseBody;", "", "alreadySubscribed", "", "isRegional", "offerArName", "", "offerDetails", "Lcom/ucare/we/model/OfferDetails;", "offerEnName", "offerId", "parentOfferArName", "parentOfferEnName", "parentOfferId", "price", "", "remainingDaysForRenewal", "", "renewable", "renewalDate", "renewalInfo", "Lcom/ucare/we/model/family/RenewalInfo;", NotificationCompat.CATEGORY_STATUS, "statusCode", "type", "maxMemberLimit", "(ZZLjava/lang/String;Lcom/ucare/we/model/OfferDetails;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DIZLjava/lang/Object;Lcom/ucare/we/model/family/RenewalInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAlreadySubscribed", "()Z", "setAlreadySubscribed", "(Z)V", "setRegional", "getMaxMemberLimit", "()Ljava/lang/String;", "setMaxMemberLimit", "(Ljava/lang/String;)V", "getOfferArName", "setOfferArName", "getOfferDetails", "()Lcom/ucare/we/model/OfferDetails;", "setOfferDetails", "(Lcom/ucare/we/model/OfferDetails;)V", "getOfferEnName", "setOfferEnName", "getOfferId", "setOfferId", "getParentOfferArName", "setParentOfferArName", "getParentOfferEnName", "setParentOfferEnName", "getParentOfferId", "setParentOfferId", "getPrice", "()D", "setPrice", "(D)V", "getRemainingDaysForRenewal", "()I", "setRemainingDaysForRenewal", "(I)V", "getRenewable", "setRenewable", "getRenewalDate", "()Ljava/lang/Object;", "setRenewalDate", "(Ljava/lang/Object;)V", "getRenewalInfo", "()Lcom/ucare/we/model/family/RenewalInfo;", "setRenewalInfo", "(Lcom/ucare/we/model/family/RenewalInfo;)V", "getStatus", "setStatus", "getStatusCode", "setStatusCode", "getType", "setType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FamilyPlansResponseBody {
    @cqh(a = "alreadySubscribed")
    private boolean alreadySubscribed;
    @cqh(a = "isRegional")
    private boolean isRegional;
    @cqh(a = "maxMemberLimit")
    private String maxMemberLimit;
    @cqh(a = "offerArName")
    private String offerArName;
    @cqh(a = "offerDetails")
    private OfferDetails offerDetails;
    @cqh(a = "offerEnName")
    private String offerEnName;
    @cqh(a = "offerId")
    private String offerId;
    @cqh(a = "parentOfferArName")
    private String parentOfferArName;
    @cqh(a = "parentOfferEnName")
    private String parentOfferEnName;
    @cqh(a = "parentOfferId")
    private String parentOfferId;
    @cqh(a = "price")
    private double price;
    @cqh(a = "remainingDaysForRenewal")
    private int remainingDaysForRenewal;
    @cqh(a = "renewable")
    private boolean renewable;
    @cqh(a = "renewalDate")
    private Object renewalDate;
    @cqh(a = "renewalInfo")
    private RenewalInfo renewalInfo;
    @cqh(a = NotificationCompat.CATEGORY_STATUS)
    private String status;
    @cqh(a = "statusCode")
    private String statusCode;
    @cqh(a = "type")
    private String type;

    public final boolean component1() {
        return this.alreadySubscribed;
    }

    public final double component10() {
        return this.price;
    }

    public final int component11() {
        return this.remainingDaysForRenewal;
    }

    public final boolean component12() {
        return this.renewable;
    }

    public final Object component13() {
        return this.renewalDate;
    }

    public final RenewalInfo component14() {
        return this.renewalInfo;
    }

    public final String component15() {
        return this.status;
    }

    public final String component16() {
        return this.statusCode;
    }

    public final String component17() {
        return this.type;
    }

    public final String component18() {
        return this.maxMemberLimit;
    }

    public final boolean component2() {
        return this.isRegional;
    }

    public final String component3() {
        return this.offerArName;
    }

    public final OfferDetails component4() {
        return this.offerDetails;
    }

    public final String component5() {
        return this.offerEnName;
    }

    public final String component6() {
        return this.offerId;
    }

    public final String component7() {
        return this.parentOfferArName;
    }

    public final String component8() {
        return this.parentOfferEnName;
    }

    public final String component9() {
        return this.parentOfferId;
    }

    public final FamilyPlansResponseBody copy(boolean z, boolean z2, String str, OfferDetails offerDetails, String str2, String str3, String str4, String str5, String str6, double d, int i, boolean z3, Object obj, RenewalInfo renewalInfo, String str7, String str8, String str9, String str10) {
        dqc.d(str2, "offerEnName");
        dqc.d(str3, "offerId");
        dqc.d(str9, "type");
        return new FamilyPlansResponseBody(z, z2, str, offerDetails, str2, str3, str4, str5, str6, d, i, z3, obj, renewalInfo, str7, str8, str9, str10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FamilyPlansResponseBody)) {
            return false;
        }
        FamilyPlansResponseBody familyPlansResponseBody = (FamilyPlansResponseBody) obj;
        return this.alreadySubscribed == familyPlansResponseBody.alreadySubscribed && this.isRegional == familyPlansResponseBody.isRegional && dqc.a((Object) this.offerArName, (Object) familyPlansResponseBody.offerArName) && dqc.a(this.offerDetails, familyPlansResponseBody.offerDetails) && dqc.a((Object) this.offerEnName, (Object) familyPlansResponseBody.offerEnName) && dqc.a((Object) this.offerId, (Object) familyPlansResponseBody.offerId) && dqc.a((Object) this.parentOfferArName, (Object) familyPlansResponseBody.parentOfferArName) && dqc.a((Object) this.parentOfferEnName, (Object) familyPlansResponseBody.parentOfferEnName) && dqc.a((Object) this.parentOfferId, (Object) familyPlansResponseBody.parentOfferId) && dqc.a(Double.valueOf(this.price), Double.valueOf(familyPlansResponseBody.price)) && this.remainingDaysForRenewal == familyPlansResponseBody.remainingDaysForRenewal && this.renewable == familyPlansResponseBody.renewable && dqc.a(this.renewalDate, familyPlansResponseBody.renewalDate) && dqc.a(this.renewalInfo, familyPlansResponseBody.renewalInfo) && dqc.a((Object) this.status, (Object) familyPlansResponseBody.status) && dqc.a((Object) this.statusCode, (Object) familyPlansResponseBody.statusCode) && dqc.a((Object) this.type, (Object) familyPlansResponseBody.type) && dqc.a((Object) this.maxMemberLimit, (Object) familyPlansResponseBody.maxMemberLimit);
    }

    public final int hashCode() {
        boolean z = this.alreadySubscribed;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i2 * 31;
        boolean z2 = this.isRegional;
        if (z2) {
            z2 = true;
        }
        int i5 = z2 ? 1 : 0;
        int i6 = z2 ? 1 : 0;
        int i7 = (i4 + i5) * 31;
        String str = this.offerArName;
        int i8 = 0;
        int hashCode = (i7 + (str == null ? 0 : str.hashCode())) * 31;
        OfferDetails offerDetails = this.offerDetails;
        int hashCode2 = (((((hashCode + (offerDetails == null ? 0 : offerDetails.hashCode())) * 31) + this.offerEnName.hashCode()) * 31) + this.offerId.hashCode()) * 31;
        String str2 = this.parentOfferArName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.parentOfferEnName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.parentOfferId;
        int hashCode5 = (((((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + Double.doubleToLongBits(this.price)) * 31) + this.remainingDaysForRenewal) * 31;
        boolean z3 = this.renewable;
        if (!z3) {
            i = z3 ? 1 : 0;
        }
        int i9 = (hashCode5 + i) * 31;
        Object obj = this.renewalDate;
        int hashCode6 = (i9 + (obj == null ? 0 : obj.hashCode())) * 31;
        RenewalInfo renewalInfo = this.renewalInfo;
        int hashCode7 = (hashCode6 + (renewalInfo == null ? 0 : renewalInfo.hashCode())) * 31;
        String str5 = this.status;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.statusCode;
        int hashCode9 = (((hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.type.hashCode()) * 31;
        String str7 = this.maxMemberLimit;
        if (str7 != null) {
            i8 = str7.hashCode();
        }
        return hashCode9 + i8;
    }

    public final String toString() {
        return "FamilyPlansResponseBody(alreadySubscribed=" + this.alreadySubscribed + ", isRegional=" + this.isRegional + ", offerArName=" + ((Object) this.offerArName) + ", offerDetails=" + this.offerDetails + ", offerEnName=" + this.offerEnName + ", offerId=" + this.offerId + ", parentOfferArName=" + ((Object) this.parentOfferArName) + ", parentOfferEnName=" + ((Object) this.parentOfferEnName) + ", parentOfferId=" + ((Object) this.parentOfferId) + ", price=" + this.price + ", remainingDaysForRenewal=" + this.remainingDaysForRenewal + ", renewable=" + this.renewable + ", renewalDate=" + this.renewalDate + ", renewalInfo=" + this.renewalInfo + ", status=" + ((Object) this.status) + ", statusCode=" + ((Object) this.statusCode) + ", type=" + this.type + ", maxMemberLimit=" + ((Object) this.maxMemberLimit) + ')';
    }

    public FamilyPlansResponseBody(boolean z, boolean z2, String str, OfferDetails offerDetails, String str2, String str3, String str4, String str5, String str6, double d, int i, boolean z3, Object obj, RenewalInfo renewalInfo, String str7, String str8, String str9, String str10) {
        dqc.d(str2, "offerEnName");
        dqc.d(str3, "offerId");
        dqc.d(str9, "type");
        this.alreadySubscribed = z;
        this.isRegional = z2;
        this.offerArName = str;
        this.offerDetails = offerDetails;
        this.offerEnName = str2;
        this.offerId = str3;
        this.parentOfferArName = str4;
        this.parentOfferEnName = str5;
        this.parentOfferId = str6;
        this.price = d;
        this.remainingDaysForRenewal = i;
        this.renewable = z3;
        this.renewalDate = obj;
        this.renewalInfo = renewalInfo;
        this.status = str7;
        this.statusCode = str8;
        this.type = str9;
        this.maxMemberLimit = str10;
    }

    public /* synthetic */ FamilyPlansResponseBody(boolean z, boolean z2, String str, OfferDetails offerDetails, String str2, String str3, String str4, String str5, String str6, double d, int i, boolean z3, Object obj, RenewalInfo renewalInfo, String str7, String str8, String str9, String str10, int i2, dpx dpxVar) {
        this(z, z2, str, (i2 & 8) != 0 ? null : offerDetails, str2, str3, str4, str5, str6, d, i, z3, obj, renewalInfo, str7, str8, str9, (i2 & 131072) != 0 ? "" : str10);
    }

    public final boolean getAlreadySubscribed() {
        return this.alreadySubscribed;
    }

    public final void setAlreadySubscribed(boolean z) {
        this.alreadySubscribed = z;
    }

    public final boolean isRegional() {
        return this.isRegional;
    }

    public final void setRegional(boolean z) {
        this.isRegional = z;
    }

    public final String getOfferArName() {
        return this.offerArName;
    }

    public final void setOfferArName(String str) {
        this.offerArName = str;
    }

    public final OfferDetails getOfferDetails() {
        return this.offerDetails;
    }

    public final void setOfferDetails(OfferDetails offerDetails) {
        this.offerDetails = offerDetails;
    }

    public final String getOfferEnName() {
        return this.offerEnName;
    }

    public final void setOfferEnName(String str) {
        dqc.d(str, "<set-?>");
        this.offerEnName = str;
    }

    public final String getOfferId() {
        return this.offerId;
    }

    public final void setOfferId(String str) {
        dqc.d(str, "<set-?>");
        this.offerId = str;
    }

    public final String getParentOfferArName() {
        return this.parentOfferArName;
    }

    public final void setParentOfferArName(String str) {
        this.parentOfferArName = str;
    }

    public final String getParentOfferEnName() {
        return this.parentOfferEnName;
    }

    public final void setParentOfferEnName(String str) {
        this.parentOfferEnName = str;
    }

    public final String getParentOfferId() {
        return this.parentOfferId;
    }

    public final void setParentOfferId(String str) {
        this.parentOfferId = str;
    }

    public final double getPrice() {
        return this.price;
    }

    public final void setPrice(double d) {
        this.price = d;
    }

    public final int getRemainingDaysForRenewal() {
        return this.remainingDaysForRenewal;
    }

    public final void setRemainingDaysForRenewal(int i) {
        this.remainingDaysForRenewal = i;
    }

    public final boolean getRenewable() {
        return this.renewable;
    }

    public final void setRenewable(boolean z) {
        this.renewable = z;
    }

    public final Object getRenewalDate() {
        return this.renewalDate;
    }

    public final void setRenewalDate(Object obj) {
        this.renewalDate = obj;
    }

    public final RenewalInfo getRenewalInfo() {
        return this.renewalInfo;
    }

    public final void setRenewalInfo(RenewalInfo renewalInfo) {
        this.renewalInfo = renewalInfo;
    }

    public final String getStatus() {
        return this.status;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final void setStatusCode(String str) {
        this.statusCode = str;
    }

    public final String getType() {
        return this.type;
    }

    public final void setType(String str) {
        dqc.d(str, "<set-?>");
        this.type = str;
    }

    public final String getMaxMemberLimit() {
        return this.maxMemberLimit;
    }

    public final void setMaxMemberLimit(String str) {
        this.maxMemberLimit = str;
    }
}
