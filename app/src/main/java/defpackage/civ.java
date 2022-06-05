package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.zzu;
import java.util.ArrayList;
import java.util.List;

/* renamed from: civ  reason: default package */
/* loaded from: classes2.dex */
public final class civ {
    private static final SparseArray<Pair<String, String>> a;

    public static zzu a(FirebaseAuth firebaseAuth, ala alaVar) {
        ajj.a(firebaseAuth);
        ajj.a(alaVar);
        Pair<String, String> pair = a.get(17078);
        String str = (String) pair.first;
        String str2 = (String) pair.second;
        List<clw> a2 = alaVar.a();
        ArrayList arrayList = new ArrayList();
        for (clw clwVar : a2) {
            if (clwVar instanceof clf) {
                arrayList.add((clf) clwVar);
            }
        }
        return new zzu(str, str2, new ckt(arrayList, ckv.a(alaVar.a(), alaVar.a), firebaseAuth.a.b(), alaVar.b));
    }

    private static String a(int i) {
        Pair<String, String> pair = a.get(i);
        return pair != null ? (String) pair.first : "INTERNAL_ERROR";
    }

    private static String b(int i) {
        Pair<String, String> pair = a.get(i);
        return pair != null ? (String) pair.second : "An internal error has occurred.";
    }

    static {
        SparseArray<Pair<String, String>> sparseArray = new SparseArray<>();
        a = sparseArray;
        sparseArray.put(17000, new Pair<>("ERROR_INVALID_CUSTOM_TOKEN", "The custom token format is incorrect. Please check the documentation."));
        a.put(17002, new Pair<>("ERROR_CUSTOM_TOKEN_MISMATCH", "The custom token corresponds to a different audience."));
        a.put(17004, new Pair<>("ERROR_INVALID_CREDENTIAL", "The supplied auth credential is malformed or has expired."));
        a.put(17008, new Pair<>("ERROR_INVALID_EMAIL", "The email address is badly formatted."));
        a.put(17009, new Pair<>("ERROR_WRONG_PASSWORD", "The password is invalid or the user does not have a password."));
        a.put(17024, new Pair<>("ERROR_USER_MISMATCH", "The supplied credentials do not correspond to the previously signed in user."));
        a.put(17014, new Pair<>("ERROR_REQUIRES_RECENT_LOGIN", "This operation is sensitive and requires recent authentication. Log in again before retrying this request."));
        a.put(17012, new Pair<>("ERROR_ACCOUNT_EXISTS_WITH_DIFFERENT_CREDENTIAL", "An account already exists with the same email address but different sign-in credentials. Sign in using a provider associated with this email address."));
        a.put(17007, new Pair<>("ERROR_EMAIL_ALREADY_IN_USE", "The email address is already in use by another account."));
        a.put(17025, new Pair<>("ERROR_CREDENTIAL_ALREADY_IN_USE", "This credential is already associated with a different user account."));
        a.put(17005, new Pair<>("ERROR_USER_DISABLED", "The user account has been disabled by an administrator."));
        a.put(17021, new Pair<>("ERROR_USER_TOKEN_EXPIRED", "The user's credential is no longer valid. The user must sign in again."));
        a.put(17011, new Pair<>("ERROR_USER_NOT_FOUND", "There is no user record corresponding to this identifier. The user may have been deleted."));
        a.put(17017, new Pair<>("ERROR_INVALID_USER_TOKEN", "This user's credential isn't valid for this project. This can happen if the user's token has been tampered with, or if the user isn't for the project associated with this API key."));
        a.put(17006, new Pair<>("ERROR_OPERATION_NOT_ALLOWED", "The given sign-in provider is disabled for this Firebase project. Enable it in the Firebase console, under the sign-in method tab of the Auth section."));
        a.put(17026, new Pair<>("ERROR_WEAK_PASSWORD", "The given password is invalid."));
        a.put(17029, new Pair<>("ERROR_EXPIRED_ACTION_CODE", "The out of band code has expired."));
        a.put(17030, new Pair<>("ERROR_INVALID_ACTION_CODE", "The out of band code is invalid. This can happen if the code is malformed, expired, or has already been used."));
        a.put(17031, new Pair<>("ERROR_INVALID_MESSAGE_PAYLOAD", "The email template corresponding to this action contains invalid characters in its message. Please fix by going to the Auth email templates section in the Firebase Console."));
        a.put(17033, new Pair<>("ERROR_INVALID_RECIPIENT_EMAIL", "The email corresponding to this action failed to send as the provided recipient email address is invalid."));
        a.put(17032, new Pair<>("ERROR_INVALID_SENDER", "The email template corresponding to this action contains an invalid sender email or name. Please fix by going to the Auth email templates section in the Firebase Console."));
        a.put(17034, new Pair<>("ERROR_MISSING_EMAIL", "An email address must be provided."));
        a.put(17035, new Pair<>("ERROR_MISSING_PASSWORD", "A password must be provided."));
        a.put(17041, new Pair<>("ERROR_MISSING_PHONE_NUMBER", "To send verification codes, provide a phone number for the recipient."));
        a.put(17042, new Pair<>("ERROR_INVALID_PHONE_NUMBER", "The format of the phone number provided is incorrect. Please enter the phone number in a format that can be parsed into E.164 format. E.164 phone numbers are written in the format [+][country code][subscriber number including area code]."));
        a.put(17043, new Pair<>("ERROR_MISSING_VERIFICATION_CODE", "The Phone Auth Credential was created with an empty sms verification Code"));
        a.put(17044, new Pair<>("ERROR_INVALID_VERIFICATION_CODE", "The sms verification code used to create the phone auth credential is invalid. Please resend the verification code sms and be sure use the verification code provided by the user."));
        a.put(17045, new Pair<>("ERROR_MISSING_VERIFICATION_ID", "The Phone Auth Credential was created with an empty verification ID"));
        a.put(17046, new Pair<>("ERROR_INVALID_VERIFICATION_ID", "The verification ID used to create the phone auth credential is invalid."));
        a.put(17049, new Pair<>("ERROR_RETRY_PHONE_AUTH", "An error occurred during authentication using the PhoneAuthCredential. Please retry authentication."));
        a.put(17051, new Pair<>("ERROR_SESSION_EXPIRED", "The sms code has expired. Please re-send the verification code to try again."));
        a.put(17052, new Pair<>("ERROR_QUOTA_EXCEEDED", "The sms quota for this project has been exceeded."));
        a.put(17028, new Pair<>("ERROR_APP_NOT_AUTHORIZED", "This app is not authorized to use Firebase Authentication. Please verifythat the correct package name and SHA-1 are configured in the Firebase Console."));
        a.put(17063, new Pair<>("ERROR_API_NOT_AVAILABLE_WITHOUT_GPS", "The API that you are calling is not available on devices without Google Play Services."));
        a.put(17062, new Pair<>("ERROR_WEB_INTERNAL_ERROR", "There was an internal error in the web widget."));
        a.put(17064, new Pair<>("ERROR_INVALID_CERT_HASH", "There was an error while trying to get your package certificate hash."));
        a.put(17065, new Pair<>("ERROR_WEB_STORAGE_UNSUPPORTED", "This browser is not supported or 3rd party cookies and data may be disabled."));
        a.put(17040, new Pair<>("ERROR_MISSING_CONTINUE_URI", "A continue URL must be provided in the request."));
        a.put(17068, new Pair<>("ERROR_DYNAMIC_LINK_NOT_ACTIVATED", "Please activate Dynamic Links in the Firebase Console and agree to the terms and conditions."));
        a.put(17071, new Pair<>("ERROR_INVALID_PROVIDER_ID", "The provider ID provided for the attempted web operation is invalid."));
        a.put(17057, new Pair<>("ERROR_WEB_CONTEXT_ALREADY_PRESENTED", "A headful operation is already in progress. Please wait for that to finish."));
        a.put(17058, new Pair<>("ERROR_WEB_CONTEXT_CANCELED", "The web operation was canceled by the user."));
        a.put(17072, new Pair<>("ERROR_TENANT_ID_MISMATCH", "The provided tenant ID does not match the Auth instance's tenant ID."));
        a.put(17073, new Pair<>("ERROR_UNSUPPORTED_TENANT_OPERATION", "This operation is not supported in a multi-tenant context."));
        a.put(17074, new Pair<>("ERROR_INVALID_DYNAMIC_LINK_DOMAIN", "The provided dynamic link domain is not configured or authorized for the current project."));
        a.put(17075, new Pair<>("ERROR_REJECTED_CREDENTIAL", "The request contains malformed or mismatching credentials"));
        a.put(17077, new Pair<>("ERROR_PHONE_NUMBER_NOT_FOUND", "The provided phone number does not match any of the second factor phone numbers associated with this user."));
        a.put(17079, new Pair<>("ERROR_INVALID_TENANT_ID", "The Auth instance's tenant ID is invalid."));
        a.put(17078, new Pair<>("ERROR_SECOND_FACTOR_REQUIRED", "Please complete a second factor challenge to finish signing into this account."));
        a.put(17080, new Pair<>("ERROR_API_NOT_AVAILABLE", "The API that you are calling is not available."));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.firebase.FirebaseException a(com.google.android.gms.common.api.Status r3) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.civ.a(com.google.android.gms.common.api.Status):com.google.firebase.FirebaseException");
    }

    public static FirebaseAuthUserCollisionException a(Status status, chh chhVar, String str, String str2) {
        int i = status.i;
        FirebaseAuthUserCollisionException firebaseAuthUserCollisionException = new FirebaseAuthUserCollisionException(a(i), a(b(i), status));
        firebaseAuthUserCollisionException.a = chhVar;
        firebaseAuthUserCollisionException.b = str;
        firebaseAuthUserCollisionException.c = str2;
        return firebaseAuthUserCollisionException;
    }

    private static String a(String str, Status status) {
        return TextUtils.isEmpty(status.j) ? str : String.format(String.valueOf(str).concat(" [ %s ]"), status.j);
    }
}
