package com.ucare.we.model.FirebaseNotificationModel;

/* loaded from: classes2.dex */
public class FirebaseNotificationRequestBody {
    @cqh(a = "action")
    String action;
    @cqh(a = "deviceID")
    String deviceIMEI;
    @cqh(a = "deviceProperties")
    DeviceProperties deviceProperties;
    @cqh(a = "fireBaseToken")
    String fireBaseToken;

    public DeviceProperties getDeviceProperties() {
        return this.deviceProperties;
    }

    public void setDeviceProperties(DeviceProperties deviceProperties) {
        this.deviceProperties = deviceProperties;
    }

    public String getFireBaseToken() {
        return this.fireBaseToken;
    }

    public void setFireBaseToken(String str) {
        this.fireBaseToken = str;
    }

    public String getAction() {
        return this.action;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public String getDeviceIMEI() {
        return this.deviceIMEI;
    }

    public void setDeviceIMEI(String str) {
        this.deviceIMEI = str;
    }
}
