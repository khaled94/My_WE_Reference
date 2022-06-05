package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes.dex */
public final class SignInConfiguration extends abb implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new uj();
    GoogleSignInOptions a;
    private final String b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.b = aat.a(str);
        this.a = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.b.equals(signInConfiguration.b)) {
            GoogleSignInOptions googleSignInOptions = this.a;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.a;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new to().a(this.b).a(this.a).b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 2, this.b);
        abc.a(parcel, 5, this.a, i);
        abc.b(parcel, a);
    }
}
