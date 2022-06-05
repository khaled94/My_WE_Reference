package com.ucare.we.model.GetCreditCardInfoFinalize;

/* loaded from: classes2.dex */
public class GetCreditCardInfoResponseBody {
    @cqh(a = "cardBankReference")
    @cqf
    public String cardBankReference;
    @cqh(a = "cardHolderName")
    @cqf
    public String cardHolderName;
    @cqh(a = "cardType")
    @cqf
    public String cardType;
    @cqh(a = "expiryMonth")
    @cqf
    public String expiryMonth;
    @cqh(a = "expiryYear")
    @cqf
    public String expiryYear;
    @cqh(a = "maskedCardNumber")
    @cqf
    public String maskedCardNumber;

    public String getCardBankReference() {
        return this.cardBankReference;
    }

    public void setCardBankReference(String str) {
        this.cardBankReference = str;
    }

    public String getMaskedCardNumber() {
        return this.maskedCardNumber;
    }

    public void setMaskedCardNumber(String str) {
        this.maskedCardNumber = str;
    }

    public String getCardHolderName() {
        return this.cardHolderName;
    }

    public void setCardHolderName(String str) {
        this.cardHolderName = str;
    }

    public String getCardType() {
        return this.cardType;
    }

    public void setCardType(String str) {
        this.cardType = str;
    }

    public String getExpiryMonth() {
        return this.expiryMonth;
    }

    public void setExpiryMonth(String str) {
        this.expiryMonth = str;
    }

    public String getExpiryYear() {
        return this.expiryYear;
    }

    public void setExpiryYear(String str) {
        this.expiryYear = str;
    }
}
