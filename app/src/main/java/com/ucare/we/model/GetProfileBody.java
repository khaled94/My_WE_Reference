package com.ucare.we.model;

import androidx.core.app.NotificationCompat;
import java.util.List;

/* loaded from: classes2.dex */
public class GetProfileBody {
    @cqh(a = "contactAddress")
    private List<String> contactAddress;
    @cqh(a = "customerId")
    private String customerId;
    @cqh(a = "customerName")
    private String customerName;
    @cqh(a = NotificationCompat.CATEGORY_EMAIL)
    private String email;
    @cqh(a = "msisdn")
    private String msisdn;
    @cqh(a = "nationalId")
    private String nationalId;
    @cqh(a = "subscriberStatus")
    private String subscriberStatus;

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
