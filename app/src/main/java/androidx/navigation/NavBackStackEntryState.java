package androidx.navigation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavBackStackEntryState implements Parcelable {
    public static final Parcelable.Creator<NavBackStackEntryState> CREATOR = new Parcelable.Creator<NavBackStackEntryState>() { // from class: androidx.navigation.NavBackStackEntryState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NavBackStackEntryState createFromParcel(Parcel parcel) {
            return new NavBackStackEntryState(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NavBackStackEntryState[] newArray(int i) {
            return new NavBackStackEntryState[i];
        }
    };
    private final Bundle mArgs;
    private final int mDestinationId;
    private final Bundle mSavedState;
    private final UUID mUUID;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NavBackStackEntryState(NavBackStackEntry navBackStackEntry) {
        this.mUUID = navBackStackEntry.mId;
        this.mDestinationId = navBackStackEntry.getDestination().getId();
        this.mArgs = navBackStackEntry.getArguments();
        Bundle bundle = new Bundle();
        this.mSavedState = bundle;
        navBackStackEntry.saveState(bundle);
    }

    NavBackStackEntryState(Parcel parcel) {
        this.mUUID = UUID.fromString(parcel.readString());
        this.mDestinationId = parcel.readInt();
        this.mArgs = parcel.readBundle(getClass().getClassLoader());
        this.mSavedState = parcel.readBundle(getClass().getClassLoader());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final UUID getUUID() {
        return this.mUUID;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int getDestinationId() {
        return this.mDestinationId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle getArgs() {
        return this.mArgs;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle getSavedState() {
        return this.mSavedState;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mUUID.toString());
        parcel.writeInt(this.mDestinationId);
        parcel.writeBundle(this.mArgs);
        parcel.writeBundle(this.mSavedState);
    }
}
