package com.ucare.we.model.remote;

import android.os.Parcel;
import android.os.Parcelable;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* loaded from: classes2.dex */
public class PushNotificationInbox implements Parcelable {
    public static final Parcelable.Creator<PushNotificationInbox> CREATOR = new Parcelable.Creator<PushNotificationInbox>() { // from class: com.ucare.we.model.remote.PushNotificationInbox.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PushNotificationInbox createFromParcel(Parcel parcel) {
            return new PushNotificationInbox(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PushNotificationInbox[] newArray(int i) {
            return new PushNotificationInbox[i];
        }
    };
    @cqh(a = "body")
    @cqf
    private String body;
    @cqh(a = "id")
    @cqf
    private Integer id;
    @cqh(a = "msisdn")
    @cqf
    private String msisdn;
    @cqh(a = "read")
    @cqf
    private Boolean read;
    @cqh(a = "timestamp")
    @cqf
    private String timestamp;
    @cqh(a = "title")
    @cqf
    private String title;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected PushNotificationInbox(Parcel parcel) {
        Boolean bool = null;
        if (parcel.readByte() == 0) {
            this.id = null;
        } else {
            this.id = Integer.valueOf(parcel.readInt());
        }
        this.msisdn = parcel.readString();
        this.title = parcel.readString();
        this.body = parcel.readString();
        this.timestamp = parcel.readString();
        byte readByte = parcel.readByte();
        if (readByte != 0) {
            bool = Boolean.valueOf(readByte != 1 ? false : true);
        }
        this.read = bool;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer num) {
        this.id = num;
    }

    public String getMsisdn() {
        return this.msisdn;
    }

    public void setMsisdn(String str) {
        this.msisdn = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String str) {
        this.body = str;
    }

    public String getTimestamp() {
        String str = this.timestamp;
        return parseDateToddmmyyyy(str.substring(0, str.indexOf(".")));
    }

    public void setTimestamp(String str) {
        this.timestamp = str;
    }

    public Boolean getRead() {
        return this.read;
    }

    public void setRead(Boolean bool) {
        this.read = bool;
    }

    public String parseDateToddMMyyyy(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return new SimpleDateFormat("dd-MMM-yyyy h:mm a").format(simpleDateFormat.parse(str));
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String parseDateToddmmyyyy(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return new SimpleDateFormat("MM-dd-yyyy h:mm a").format(simpleDateFormat.parse(str));
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 0;
        if (this.id == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.id.intValue());
        }
        parcel.writeString(this.msisdn);
        parcel.writeString(this.title);
        parcel.writeString(this.body);
        parcel.writeString(this.timestamp);
        Boolean bool = this.read;
        if (bool != null) {
            i2 = bool.booleanValue() ? 1 : 2;
        }
        parcel.writeByte((byte) i2);
    }
}
