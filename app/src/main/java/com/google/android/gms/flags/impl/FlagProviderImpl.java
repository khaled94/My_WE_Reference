package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;

/* loaded from: classes.dex */
public class FlagProviderImpl extends ahg {
    private boolean a = false;
    private SharedPreferences b;

    @Override // defpackage.ahf
    public void init(afn afnVar) {
        Context context = (Context) afp.a(afnVar);
        if (this.a) {
            return;
        }
        try {
            this.b = ahc.a(context.createPackageContext("com.google.android.gms", 0));
            this.a = true;
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                "Could not retrieve sdk flags, continuing with defaults: ".concat(valueOf);
            } else {
                new String("Could not retrieve sdk flags, continuing with defaults: ");
            }
        }
    }

    @Override // defpackage.ahf
    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        return !this.a ? z : agu.a(this.b, str, Boolean.valueOf(z)).booleanValue();
    }

    @Override // defpackage.ahf
    public int getIntFlagValue(String str, int i, int i2) {
        return !this.a ? i : agw.a(this.b, str, Integer.valueOf(i)).intValue();
    }

    @Override // defpackage.ahf
    public long getLongFlagValue(String str, long j, int i) {
        return !this.a ? j : agy.a(this.b, str, Long.valueOf(j)).longValue();
    }

    @Override // defpackage.ahf
    public String getStringFlagValue(String str, String str2, int i) {
        return !this.a ? str2 : aha.a(this.b, str, str2);
    }
}
