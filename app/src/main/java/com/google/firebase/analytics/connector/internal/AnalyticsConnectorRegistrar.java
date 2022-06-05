package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements cmf {
    @Override // defpackage.cmf
    public List<clz<?>> getComponents() {
        return Arrays.asList(clz.a(cgz.class).a(cml.a(cgw.class)).a(cml.a(Context.class)).a(cml.a(cmt.class)).a(chb.a).a(2).a(), cpm.a("fire-analytics", "16.5.0"));
    }
}
