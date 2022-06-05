package com.google.android.gms.internal.places;

import java.io.IOException;

/* loaded from: classes.dex */
public class zzbk extends IOException {
    public bdh a = null;

    public zzbk(String str) {
        super(str);
    }

    public static zzbk a() {
        return new zzbk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static zzbk b() {
        return new zzbk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzbk c() {
        return new zzbk("Protocol message contained an invalid tag (zero).");
    }

    public static zzbj d() {
        return new zzbj("Protocol message tag had invalid wire type.");
    }

    public static zzbk e() {
        return new zzbk("Failed to parse the message.");
    }

    public static zzbk f() {
        return new zzbk("Protocol message had invalid UTF-8.");
    }
}
