package com.ucare.we.model.remote.pushnotification;

/* loaded from: classes2.dex */
public class NotificationCount {
    @cqh(a = "count")
    @cqf
    private Integer count;
    @cqh(a = "pushNotificationInbox")
    @cqf
    private Object pushNotificationInbox;

    public Integer getCount() {
        return this.count;
    }

    public void setCount(Integer num) {
        this.count = num;
    }

    public Object getPushNotificationInbox() {
        return this.pushNotificationInbox;
    }

    public void setPushNotificationInbox(Object obj) {
        this.pushNotificationInbox = obj;
    }
}
