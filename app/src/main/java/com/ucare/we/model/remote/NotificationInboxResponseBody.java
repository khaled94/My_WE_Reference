package com.ucare.we.model.remote;

import java.util.List;

/* loaded from: classes2.dex */
public class NotificationInboxResponseBody {
    @cqh(a = "count")
    @cqf
    private Integer count;
    @cqh(a = "pushNotificationInbox")
    @cqf
    private List<PushNotificationInbox> pushNotificationInbox = null;

    public Integer getCount() {
        return this.count;
    }

    public void setCount(Integer num) {
        this.count = num;
    }

    public List<PushNotificationInbox> getPushNotificationInbox() {
        return this.pushNotificationInbox;
    }

    public void setPushNotificationInbox(List<PushNotificationInbox> list) {
        this.pushNotificationInbox = list;
    }
}
