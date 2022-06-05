package com.ucare.we.model.remote.familygroupmember;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.ucare.we.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 92\u00020\u0001:\u00019B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003JG\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\t\u0010.\u001a\u00020\u0012HÖ\u0001J\u0013\u0010/\u001a\u00020\u00152\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020\u0012HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001J\u0019\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u001aR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u001aR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u001aR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u001aR\u0011\u0010!\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0013R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u001aR\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0010\"\u0004\b&\u0010\u001a¨\u0006:"}, d2 = {"Lcom/ucare/we/model/remote/familygroupmember/GroupMember;", "Landroid/os/Parcelable;", "joinTime", "", "name", "networkType", "paidType", "serviceNumber", NotificationCompat.CATEGORY_STATUS, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "contactImageOnDevice", "Landroid/graphics/Bitmap;", "getContactImageOnDevice", "()Landroid/graphics/Bitmap;", "contactNameOnDevice", "getContactNameOnDevice", "()Ljava/lang/String;", "isMemberNameEmpty", "", "()I", "isOwner", "", "()Z", "isOwnerView", "getJoinTime", "setJoinTime", "(Ljava/lang/String;)V", "getName", "setName", "getNetworkType", "setNetworkType", "getPaidType", "setPaidType", "removeView", "getRemoveView", "getServiceNumber", "setServiceNumber", "getStatus", "setStatus", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class GroupMember implements Parcelable {
    @cqh(a = "joinTime")
    private String joinTime;
    @cqh(a = "name")
    private String name;
    @cqh(a = "networkType")
    private String networkType;
    @cqh(a = "paidType")
    private String paidType;
    @cqh(a = "serviceNumber")
    private String serviceNumber;
    @cqh(a = NotificationCompat.CATEGORY_STATUS)
    private String status;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<GroupMember> CREATOR = new Creator();
    private static djw repository = new djw();

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<GroupMember> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupMember createFromParcel(Parcel parcel) {
            dqc.d(parcel, "parcel");
            return new GroupMember(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupMember[] newArray(int i) {
            return new GroupMember[i];
        }
    }

    public static /* synthetic */ GroupMember copy$default(GroupMember groupMember, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = groupMember.joinTime;
        }
        if ((i & 2) != 0) {
            str2 = groupMember.name;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = groupMember.networkType;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = groupMember.paidType;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = groupMember.serviceNumber;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = groupMember.status;
        }
        return groupMember.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.joinTime;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.networkType;
    }

    public final String component4() {
        return this.paidType;
    }

    public final String component5() {
        return this.serviceNumber;
    }

    public final String component6() {
        return this.status;
    }

    public final GroupMember copy(String str, String str2, String str3, String str4, String str5, String str6) {
        dqc.d(str, "joinTime");
        dqc.d(str3, "networkType");
        dqc.d(str4, "paidType");
        dqc.d(str5, "serviceNumber");
        dqc.d(str6, NotificationCompat.CATEGORY_STATUS);
        return new GroupMember(str, str2, str3, str4, str5, str6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupMember)) {
            return false;
        }
        GroupMember groupMember = (GroupMember) obj;
        return dqc.a((Object) this.joinTime, (Object) groupMember.joinTime) && dqc.a((Object) this.name, (Object) groupMember.name) && dqc.a((Object) this.networkType, (Object) groupMember.networkType) && dqc.a((Object) this.paidType, (Object) groupMember.paidType) && dqc.a((Object) this.serviceNumber, (Object) groupMember.serviceNumber) && dqc.a((Object) this.status, (Object) groupMember.status);
    }

    public final int hashCode() {
        int hashCode = this.joinTime.hashCode() * 31;
        String str = this.name;
        return ((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.networkType.hashCode()) * 31) + this.paidType.hashCode()) * 31) + this.serviceNumber.hashCode()) * 31) + this.status.hashCode();
    }

    public final String toString() {
        return "GroupMember(joinTime=" + this.joinTime + ", name=" + ((Object) this.name) + ", networkType=" + this.networkType + ", paidType=" + this.paidType + ", serviceNumber=" + this.serviceNumber + ", status=" + this.status + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dqc.d(parcel, "out");
        parcel.writeString(this.joinTime);
        parcel.writeString(this.name);
        parcel.writeString(this.networkType);
        parcel.writeString(this.paidType);
        parcel.writeString(this.serviceNumber);
        parcel.writeString(this.status);
    }

    public GroupMember(String str, String str2, String str3, String str4, String str5, String str6) {
        dqc.d(str, "joinTime");
        dqc.d(str3, "networkType");
        dqc.d(str4, "paidType");
        dqc.d(str5, "serviceNumber");
        dqc.d(str6, NotificationCompat.CATEGORY_STATUS);
        this.joinTime = str;
        this.name = str2;
        this.networkType = str3;
        this.paidType = str4;
        this.serviceNumber = str5;
        this.status = str6;
    }

    public final String getJoinTime() {
        return this.joinTime;
    }

    public final void setJoinTime(String str) {
        dqc.d(str, "<set-?>");
        this.joinTime = str;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final String getNetworkType() {
        return this.networkType;
    }

    public final void setNetworkType(String str) {
        dqc.d(str, "<set-?>");
        this.networkType = str;
    }

    public final String getPaidType() {
        return this.paidType;
    }

    public final void setPaidType(String str) {
        dqc.d(str, "<set-?>");
        this.paidType = str;
    }

    public final String getServiceNumber() {
        return this.serviceNumber;
    }

    public final void setServiceNumber(String str) {
        dqc.d(str, "<set-?>");
        this.serviceNumber = str;
    }

    public final String getStatus() {
        return this.status;
    }

    public final void setStatus(String str) {
        dqc.d(str, "<set-?>");
        this.status = str;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ucare/we/model/remote/familygroupmember/GroupMember$Companion;", "", "()V", "repository", "Lcom/ucare/we/util/prefs/Repository;", "getRepository", "()Lcom/ucare/we/util/prefs/Repository;", "setRepository", "(Lcom/ucare/we/util/prefs/Repository;)V", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(dpx dpxVar) {
            this();
        }

        private Companion() {
        }

        public final djw getRepository() {
            return GroupMember.repository;
        }

        public final void setRepository(djw djwVar) {
            dqc.d(djwVar, "<set-?>");
            GroupMember.repository = djwVar;
        }
    }

    public final boolean isOwner() {
        return dqc.a((Object) this.serviceNumber, (Object) repository.m());
    }

    public final String getContactNameOnDevice() {
        String a;
        if (!isOwner()) {
            return (ContextCompat.checkSelfPermission(djq.a(), "android.permission.READ_CONTACTS") != 0 || (a = djp.a(this.serviceNumber, djq.a())) == null) ? "" : a;
        }
        String string = djq.a().getString(R.string.myNumber);
        dqc.b(string, "getContext().getString(R.string.myNumber)");
        return string;
    }

    public final Bitmap getContactImageOnDevice() {
        if (ContextCompat.checkSelfPermission(djq.a(), "android.permission.READ_CONTACTS") == 0) {
            return djp.b(this.serviceNumber, djq.a());
        }
        return djp.a(djq.a());
    }

    public final int isOwnerView() {
        return isOwner() ? 0 : 8;
    }

    public final int getRemoveView() {
        return isOwner() ? 8 : 0;
    }

    public final int isMemberNameEmpty() {
        return dqc.a((Object) getContactNameOnDevice(), (Object) "") ? 8 : 0;
    }
}
