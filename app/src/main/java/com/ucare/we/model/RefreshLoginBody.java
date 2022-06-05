package com.ucare.we.model;

import androidx.core.app.NotificationCompat;
import com.ucare.we.model.SignInModel.GroupFMCModel;
import com.ucare.we.model.SignInModel.GroupFamilyModel;
import com.ucare.we.model.SignInModel.GroupsModel;
import com.ucare.we.model.SignInModel.UserProperties;
import java.util.List;

/* loaded from: classes2.dex */
public class RefreshLoginBody {
    @cqh(a = "associatedLines")
    @cqf
    public List<String> associatedLines = null;
    @cqh(a = "customerName")
    String customerName;
    @cqh(a = "groups")
    GroupsModel groupsModel;
    @cqh(a = "iptv")
    boolean iptv;
    @cqh(a = "jwt")
    @cqf
    public String jwt;
    @cqh(a = "role")
    @cqf
    public String role;
    @cqh(a = NotificationCompat.CATEGORY_STATUS)
    @cqf
    public String status;
    @cqh(a = "type")
    @cqf
    public String type;
    @cqh(a = "properties")
    UserProperties userProperties;
    @cqh(a = "userType")
    @cqf
    public String userType;

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String str) {
        this.customerName = str;
    }

    public UserProperties getUserProperties() {
        return this.userProperties;
    }

    public void setUserProperties(UserProperties userProperties) {
        this.userProperties = userProperties;
    }

    public boolean isIptv() {
        return this.iptv;
    }

    public void setIptv(boolean z) {
        this.iptv = z;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public String getJwt() {
        return this.jwt;
    }

    public void setJwt(String str) {
        this.jwt = str;
    }

    public String getUserType() {
        return this.userType;
    }

    public void setUserType(String str) {
        this.userType = str;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String str) {
        this.role = str;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public List<String> getAssociatedLines() {
        return this.associatedLines;
    }

    public void setAssociatedLines(List<String> list) {
        this.associatedLines = list;
    }

    public GroupFMCModel getGroupFmc() {
        return this.groupsModel.getGroupFMC() != null ? this.groupsModel.getGroupFMC() : new GroupFMCModel();
    }

    public void setGroupFmc(GroupFMCModel groupFMCModel) {
        this.groupsModel.setGroupFMC(groupFMCModel);
    }

    public GroupFamilyModel getGroupFamily() {
        return this.groupsModel.getGroupFamily() != null ? this.groupsModel.getGroupFamily() : new GroupFamilyModel();
    }

    public void setGroupFamily(GroupFamilyModel groupFamilyModel) {
        this.groupsModel.setGroupFamily(groupFamilyModel);
    }
}
