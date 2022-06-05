package defpackage;

import com.google.android.gms.common.api.Status;

@Deprecated
/* renamed from: bgu  reason: default package */
/* loaded from: classes2.dex */
public final class bgu extends vd {
    private static String c(int i) {
        if (i != 9051) {
            if (i == 9150) {
                return "PLACEFENCING_NOT_AVAILABLE";
            }
            if (i == 9101) {
                return "PLACE_PROXIMITY_UNKNOWN";
            }
            if (i == 9102) {
                return "NEARBY_ALERTS_NOT_AVAILABLE";
            }
            if (i == 9201) {
                return "PLACES_API_PERSONALIZED_DATA_ACCESS_APPROVED";
            }
            if (i == 9202) {
                return "PLACES_API_PERSONALIZED_DATA_ACCESS_REJECTED";
            }
            switch (i) {
                case 9000:
                    return "PLACES_API_QUOTA_FAILED";
                case 9001:
                    return "PLACES_API_USAGE_LIMIT_EXCEEDED";
                case 9002:
                    return "PLACES_API_KEY_INVALID";
                case 9003:
                    return "PLACES_API_ACCESS_NOT_CONFIGURED";
                case 9004:
                    return "PLACES_API_INVALID_ARGUMENT";
                case 9005:
                    return "PLACES_API_RATE_LIMIT_EXCEEDED";
                case 9006:
                    return "PLACES_API_DEVICE_RATE_LIMIT_EXCEEDED";
                case 9007:
                    return "PLACES_API_KEY_EXPIRED";
                case 9008:
                    return "PLACES_API_INVALID_APP";
                case 9009:
                    return "INSUFFICIENT_LOCATION_PERMISSION_FOR_BACKGROUND_PLACES";
                default:
                    return vd.a(i);
            }
        }
        return "PLACE_ALIAS_NOT_FOUND";
    }

    private bgu() {
    }

    public static Status b(int i) {
        String c = c(i);
        aat.a(c);
        return new Status(i, c);
    }
}
