package com.ucare.we.model.ProfileContactInfo;

/* loaded from: classes2.dex */
public class UpdateContactInfoRequestBody {
    @cqh(a = "contactNumber")
    String contactNumber;
    @cqh(a = "preferredLanguage")
    String preferredLanguage;

    public String getContactNumber() {
        return this.contactNumber;
    }

    public void setContactNumber(String str) {
        this.contactNumber = str;
    }

    public String getPreferredLanguage() {
        return this.preferredLanguage;
    }

    public void setPreferredLanguage(String str) {
        this.preferredLanguage = str;
    }
}
