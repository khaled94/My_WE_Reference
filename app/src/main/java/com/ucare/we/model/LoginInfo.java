package com.ucare.we.model;

import androidx.core.app.NotificationCompat;
import com.ucare.we.model.SignInModel.GroupFMCModel;
import com.ucare.we.model.SignInModel.GroupFamilyModel;
import com.ucare.we.model.SignInModel.GroupsModel;
import com.ucare.we.model.SignInModel.UserProperties;
import java.util.List;

/* loaded from: classes2.dex */
public class LoginInfo {
    @cqh(a = "associatedLines")
    private List<String> associatedLines;
    @cqh(a = "customerName")
    String customerName;
    @cqh(a = "groups")
    GroupsModel groupsModel;
    @cqh(a = "iptv")
    boolean iptv;
    @cqh(a = "msisdn")
    private String msisdn;
    @cqh(a = "role")
    public String role;
    @cqh(a = "type")
    public String type;
    @cqh(a = "properties")
    UserProperties userProperties;
    @cqh(a = NotificationCompat.CATEGORY_STATUS)
    private String status = null;
    @cqh(a = "jwt")
    private String jwt = null;
    @cqh(a = "corporateUserMode")
    private String corporateUserMode = null;

    public String getMsisdn() {
        return this.msisdn;
    }

    public void setMsisdn(String str) {
        this.msisdn = str;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String str) {
        this.customerName = str;
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

    public List<String> getAssociatedLines() {
        return this.associatedLines;
    }

    public void setAssociatedLines(List<String> list) {
        this.associatedLines = list;
    }

    public GroupFMCModel getGroupFmc() {
        GroupsModel groupsModel = this.groupsModel;
        return groupsModel != null ? groupsModel.getGroupFMC() : new GroupFMCModel();
    }

    public void setGroupFmc(GroupFMCModel groupFMCModel) {
        this.groupsModel.setGroupFMC(groupFMCModel);
    }

    public GroupFamilyModel getGroupFamily() {
        GroupsModel groupsModel = this.groupsModel;
        return groupsModel != null ? groupsModel.getGroupFamily() : new GroupFamilyModel();
    }

    public void setGroupFamily(GroupFamilyModel groupFamilyModel) {
        this.groupsModel.setGroupFamily(groupFamilyModel);
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

    public String getCorporateUserMode() {
        return this.corporateUserMode;
    }

    public void setCorporateUserMode(String str) {
        this.corporateUserMode = str;
    }
}
