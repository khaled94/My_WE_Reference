package com.ucare.we.model;

import androidx.core.app.NotificationCompat;
import java.util.List;

/* loaded from: classes2.dex */
public class CustomerProfile {
    @cqh(a = "birthday")
    @cqf
    public String birthday;
    @cqh(a = "contactAddress")
    @cqf
    public List<String> contactAddress = null;
    @cqh(a = "contactNumber")
    @cqf
    public String contactNumber;
    @cqh(a = "customerId")
    @cqf
    public String customerId;
    @cqh(a = "customerName")
    @cqf
    public String customerName;
    @cqh(a = NotificationCompat.CATEGORY_EMAIL)
    @cqf
    public String email;
    @cqh(a = "gender")
    @cqf
    public String gender;
    @cqh(a = "msisdn")
    @cqf
    public String msisdn;
    @cqh(a = "nationalId")
    @cqf
    public String nationalId;
    @cqh(a = "preferredLanguage")
    @cqf
    public String preferredLanguage;
    @cqh(a = "subscriberStatus")
    @cqf
    public String subscriberStatus;

    public String getGender() {
        return this.gender;
    }

    public void setGender(String str) {
        this.gender = str;
    }

    public String getPreferredLanguage() {
        return this.preferredLanguage;
    }

    public void setPreferredLanguage(String str) {
        this.preferredLanguage = str;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String str) {
        this.birthday = str;
    }

    public String getContactNumber() {
        return this.contactNumber;
    }

    public void setContactNumber(String str) {
        this.contactNumber = str;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(String str) {
        this.customerId = str;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String str) {
        this.customerName = str;
    }

    public String getSubscriberStatus() {
        return this.subscriberStatus;
    }

    public void setSubscriberStatus(String str) {
        this.subscriberStatus = str;
    }

    public List<String> getContactAddress() {
        return this.contactAddress;
    }

    public void setContactAddress(List<String> list) {
        this.contactAddress = list;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public String getMsisdn() {
        return this.msisdn;
    }

    public void setMsisdn(String str) {
        this.msisdn = str;
    }

    public String getNationalId() {
        return this.nationalId;
    }

    public void setNationalId(String str) {
        this.nationalId = str;
    }
}
