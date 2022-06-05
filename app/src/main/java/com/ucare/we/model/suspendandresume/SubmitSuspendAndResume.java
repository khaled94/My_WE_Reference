package com.ucare.we.model.suspendandresume;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* loaded from: classes2.dex */
public class SubmitSuspendAndResume {
    @cqh(a = "actionType")
    @cqf
    private String actionType;
    @cqh(a = TypedValues.Transition.S_DURATION)
    @cqf
    private Integer duration;
    @cqh(a = "reason")
    @cqf
    private String reason;

    public String getActionType() {
        return this.actionType;
    }

    public void setActionType(String str) {
        this.actionType = str;
    }

    public String getReason() {
        return this.reason;
    }

    public void setReason(String str) {
        this.reason = str;
    }

    public Integer getDuration() {
        return this.duration;
    }

    public void setDuration(Integer num) {
        this.duration = num;
    }
}
