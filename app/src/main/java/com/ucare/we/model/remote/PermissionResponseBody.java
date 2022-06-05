package com.ucare.we.model.remote;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR&\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR&\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/ucare/we/model/remote/PermissionResponseBody;", "", "()V", "addons", "", "", "getAddons", "()Ljava/util/List;", "setAddons", "(Ljava/util/List;)V", "errorViewRechargeButton", "getErrorViewRechargeButton", "setErrorViewRechargeButton", "moreBundles", "getMoreBundles", "setMoreBundles", "payForOthers", "getPayForOthers", "setPayForOthers", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class PermissionResponseBody {
    @cqh(a = "addons")
    @cqf
    private List<String> addons;
    @cqh(a = "errorViewRechargeButton")
    @cqf
    private List<String> errorViewRechargeButton;
    @cqh(a = "moreBundles")
    @cqf
    private List<String> moreBundles;
    @cqh(a = "payForOthers")
    @cqf
    private List<String> payForOthers;

    public final List<String> getPayForOthers() {
        return this.payForOthers;
    }

    public final void setPayForOthers(List<String> list) {
        this.payForOthers = list;
    }

    public final List<String> getAddons() {
        return this.addons;
    }

    public final void setAddons(List<String> list) {
        this.addons = list;
    }

    public final List<String> getMoreBundles() {
        return this.moreBundles;
    }

    public final void setMoreBundles(List<String> list) {
        this.moreBundles = list;
    }

    public final List<String> getErrorViewRechargeButton() {
        return this.errorViewRechargeButton;
    }

    public final void setErrorViewRechargeButton(List<String> list) {
        this.errorViewRechargeButton = list;
    }
}
