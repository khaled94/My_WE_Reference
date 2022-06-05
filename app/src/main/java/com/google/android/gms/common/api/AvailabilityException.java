package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class AvailabilityException extends Exception {
    private final ArrayMap<vo<?>, ConnectionResult> a;

    public AvailabilityException(ArrayMap<vo<?>, ConnectionResult> arrayMap) {
        this.a = arrayMap;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (vo<?> voVar : this.a.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) aat.a(this.a.get(voVar));
            z &= !connectionResult.b();
            String str = voVar.a.c;
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(valueOf).length());
            sb.append(str);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
