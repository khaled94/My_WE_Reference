package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aar;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ConnectionResult extends abb {
    public static final int SUCCESS = 0;
    final int b;
    public final int c;
    public final PendingIntent d;
    public final String e;
    public static final ConnectionResult a = new ConnectionResult(0);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new aer();

    public ConnectionResult(int i) {
        this(i, null, null);
    }

    public ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.b = i;
        this.c = i2;
        this.d = pendingIntent;
        this.e = str;
    }

    public static String a(int i) {
        if (i != 99) {
            if (i == 1500) {
                return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
            }
            switch (i) {
                case -1:
                    return "UNKNOWN";
                case 0:
                    return "SUCCESS";
                case 1:
                    return "SERVICE_MISSING";
                case 2:
                    return "SERVICE_VERSION_UPDATE_REQUIRED";
                case 3:
                    return "SERVICE_DISABLED";
                case 4:
                    return "SIGN_IN_REQUIRED";
                case 5:
                    return "INVALID_ACCOUNT";
                case 6:
                    return "RESOLUTION_REQUIRED";
                case 7:
                    return "NETWORK_ERROR";
                case 8:
                    return "INTERNAL_ERROR";
                case 9:
                    return "SERVICE_INVALID";
                case 10:
                    return "DEVELOPER_ERROR";
                case 11:
                    return "LICENSE_CHECK_FAILED";
                default:
                    switch (i) {
                        case 13:
                            return "CANCELED";
                        case 14:
                            return "TIMEOUT";
                        case 15:
                            return "INTERRUPTED";
                        case 16:
                            return "API_UNAVAILABLE";
                        case 17:
                            return "SIGN_IN_FAILED";
                        case 18:
                            return "SERVICE_UPDATING";
                        case 19:
                            return "SERVICE_MISSING_PERMISSION";
                        case 20:
                            return "RESTRICTED_PROFILE";
                        case 21:
                            return "API_VERSION_UPDATE_REQUIRED";
                        case 22:
                            return "RESOLUTION_ACTIVITY_NOT_FOUND";
                        case 23:
                            return "API_DISABLED";
                        case 24:
                            return "API_DISABLED_FOR_CONNECTION";
                        default:
                            StringBuilder sb = new StringBuilder(31);
                            sb.append("UNKNOWN_ERROR_CODE(");
                            sb.append(i);
                            sb.append(")");
                            return sb.toString();
                    }
            }
        }
        return "UNFINISHED";
    }

    public final boolean a() {
        return (this.c == 0 || this.d == null) ? false : true;
    }

    public final boolean b() {
        return this.c == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.c == connectionResult.c && aar.a(this.d, connectionResult.d) && aar.a(this.e, connectionResult.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), this.d, this.e});
    }

    public final String toString() {
        aar.a a2 = aar.a(this);
        a2.a("statusCode", a(this.c));
        a2.a("resolution", this.d);
        a2.a("message", this.e);
        return a2.toString();
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.b);
        abc.a(parcel, 2, this.c);
        abc.a(parcel, 3, this.d, i);
        abc.a(parcel, 4, this.e);
        abc.b(parcel, a2);
    }
}
