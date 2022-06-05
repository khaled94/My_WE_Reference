package com.ucare.we.model.ticket;

import androidx.core.app.NotificationCompat;

/* loaded from: classes2.dex */
public class SubmitTicketRequest {
    @cqh(a = "contactMsisdn")
    @cqf
    private String contactMsisdn;
    @cqh(a = "description")
    @cqf
    private String description;
    @cqh(a = NotificationCompat.CATEGORY_EMAIL)
    @cqf
    private String email;
    @cqh(a = "firstName")
    @cqf
    private String firstName;
    @cqh(a = "lastName")
    @cqf
    private String lastName;
    @cqh(a = "middleName")
    @cqf
    private String middleName;
    @cqh(a = "msisdn")
    @cqf
    private String msisdn;
    @cqh(a = "title")
    @cqf
    private String title;
    @cqh(a = "type")
    @cqf
    private String type;

    public String getMsisdn() {
        return this.msisdn;
    }

    public void setMsisdn(String str) {
        this.msisdn = str;
    }

    public String getContactMsisdn() {
        return this.contactMsisdn;
    }

    public void setContactMsisdn(String str) {
        this.contactMsisdn = str;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String str) {
        this.firstName = str;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String str) {
        this.middleName = str;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String str) {
        this.lastName = str;
    }
}
