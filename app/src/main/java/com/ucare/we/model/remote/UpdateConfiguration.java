package com.ucare.we.model.remote;

/* loaded from: classes2.dex */
public class UpdateConfiguration {
    @cqh(a = "androidForcedUpdateAppUrl")
    @cqf
    private String androidForcedUpdateAppUrl;
    @cqh(a = "androidForcedUpdateMinVersion")
    @cqf
    private String androidForcedUpdateMinVersion;
    @cqh(a = "androidHuaweiForcedUpdateAppUrl")
    @cqf
    private String androidHuaweiForcedUpdateAppUrl;
    @cqh(a = "iOSForcedUpdateAppUrl")
    @cqf
    private String iOSForcedUpdateAppUrl;
    @cqh(a = "iOSForcedUpdateMinVersion")
    @cqf
    private String iOSForcedUpdateMinVersion;

    public String getAndroidForcedUpdateAppUrl() {
        return this.androidForcedUpdateAppUrl;
    }

    public void setAndroidForcedUpdateAppUrl(String str) {
        this.androidForcedUpdateAppUrl = str;
    }

    public String getiOSForcedUpdateMinVersion() {
        return this.iOSForcedUpdateMinVersion;
    }

    public void setiOSForcedUpdateMinVersion(String str) {
        this.iOSForcedUpdateMinVersion = str;
    }

    public String getAndroidForcedUpdateMinVersion() {
        return this.androidForcedUpdateMinVersion;
    }

    public void setAndroidForcedUpdateMinVersion(String str) {
        this.androidForcedUpdateMinVersion = str;
    }

    public String getiOSForcedUpdateAppUrl() {
        return this.iOSForcedUpdateAppUrl;
    }

    public void setiOSForcedUpdateAppUrl(String str) {
        this.iOSForcedUpdateAppUrl = str;
    }

    public String getAndroidHuaweiForcedUpdateAppUrl() {
        return this.androidHuaweiForcedUpdateAppUrl;
    }

    public void setAndroidHuaweiForcedUpdateAppUrl(String str) {
        this.androidHuaweiForcedUpdateAppUrl = str;
    }
}
