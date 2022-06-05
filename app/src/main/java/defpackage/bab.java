package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* renamed from: bab  reason: default package */
/* loaded from: classes.dex */
public final class bab extends apc implements axz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public bab(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // defpackage.axz
    public final void initialize(afn afnVar, baz bazVar, long j) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, afnVar);
        ard.a(k_, bazVar);
        k_.writeLong(j);
        b(1, k_);
    }

    @Override // defpackage.axz
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel k_ = k_();
        k_.writeString(str);
        k_.writeString(str2);
        ard.a(k_, bundle);
        ard.a(k_, z);
        ard.a(k_, z2);
        k_.writeLong(j);
        b(2, k_);
    }

    @Override // defpackage.axz
    public final void logEventAndBundle(String str, String str2, Bundle bundle, bas basVar, long j) throws RemoteException {
        Parcel k_ = k_();
        k_.writeString(str);
        k_.writeString(str2);
        ard.a(k_, bundle);
        ard.a(k_, basVar);
        k_.writeLong(j);
        b(3, k_);
    }

    @Override // defpackage.axz
    public final void setUserProperty(String str, String str2, afn afnVar, boolean z, long j) throws RemoteException {
        Parcel k_ = k_();
        k_.writeString(str);
        k_.writeString(str2);
        ard.a(k_, afnVar);
        ard.a(k_, z);
        k_.writeLong(j);
        b(4, k_);
    }

    @Override // defpackage.axz
    public final void getUserProperties(String str, String str2, boolean z, bas basVar) throws RemoteException {
        Parcel k_ = k_();
        k_.writeString(str);
        k_.writeString(str2);
        ard.a(k_, z);
        ard.a(k_, basVar);
        b(5, k_);
    }

    @Override // defpackage.axz
    public final void getMaxUserProperties(String str, bas basVar) throws RemoteException {
        Parcel k_ = k_();
        k_.writeString(str);
        ard.a(k_, basVar);
        b(6, k_);
    }

    @Override // defpackage.axz
    public final void setUserId(String str, long j) throws RemoteException {
        Parcel k_ = k_();
        k_.writeString(str);
        k_.writeLong(j);
        b(7, k_);
    }

    @Override // defpackage.axz
    public final void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, bundle);
        k_.writeLong(j);
        b(8, k_);
    }

    @Override // defpackage.axz
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel k_ = k_();
        k_.writeString(str);
        k_.writeString(str2);
        ard.a(k_, bundle);
        b(9, k_);
    }

    @Override // defpackage.axz
    public final void getConditionalUserProperties(String str, String str2, bas basVar) throws RemoteException {
        Parcel k_ = k_();
        k_.writeString(str);
        k_.writeString(str2);
        ard.a(k_, basVar);
        b(10, k_);
    }

    @Override // defpackage.axz
    public final void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, z);
        k_.writeLong(j);
        b(11, k_);
    }

    @Override // defpackage.axz
    public final void resetAnalyticsData(long j) throws RemoteException {
        Parcel k_ = k_();
        k_.writeLong(j);
        b(12, k_);
    }

    @Override // defpackage.axz
    public final void setMinimumSessionDuration(long j) throws RemoteException {
        Parcel k_ = k_();
        k_.writeLong(j);
        b(13, k_);
    }

    @Override // defpackage.axz
    public final void setSessionTimeoutDuration(long j) throws RemoteException {
        Parcel k_ = k_();
        k_.writeLong(j);
        b(14, k_);
    }

    @Override // defpackage.axz
    public final void setCurrentScreen(afn afnVar, String str, String str2, long j) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, afnVar);
        k_.writeString(str);
        k_.writeString(str2);
        k_.writeLong(j);
        b(15, k_);
    }

    @Override // defpackage.axz
    public final void getCurrentScreenName(bas basVar) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, basVar);
        b(16, k_);
    }

    @Override // defpackage.axz
    public final void getCurrentScreenClass(bas basVar) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, basVar);
        b(17, k_);
    }

    @Override // defpackage.axz
    public final void setInstanceIdProvider(bax baxVar) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, baxVar);
        b(18, k_);
    }

    @Override // defpackage.axz
    public final void getCachedAppInstanceId(bas basVar) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, basVar);
        b(19, k_);
    }

    @Override // defpackage.axz
    public final void getAppInstanceId(bas basVar) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, basVar);
        b(20, k_);
    }

    @Override // defpackage.axz
    public final void getGmpAppId(bas basVar) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, basVar);
        b(21, k_);
    }

    @Override // defpackage.axz
    public final void generateEventId(bas basVar) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, basVar);
        b(22, k_);
    }

    @Override // defpackage.axz
    public final void beginAdUnitExposure(String str, long j) throws RemoteException {
        Parcel k_ = k_();
        k_.writeString(str);
        k_.writeLong(j);
        b(23, k_);
    }

    @Override // defpackage.axz
    public final void endAdUnitExposure(String str, long j) throws RemoteException {
        Parcel k_ = k_();
        k_.writeString(str);
        k_.writeLong(j);
        b(24, k_);
    }

    @Override // defpackage.axz
    public final void onActivityStarted(afn afnVar, long j) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, afnVar);
        k_.writeLong(j);
        b(25, k_);
    }

    @Override // defpackage.axz
    public final void onActivityStopped(afn afnVar, long j) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, afnVar);
        k_.writeLong(j);
        b(26, k_);
    }

    @Override // defpackage.axz
    public final void onActivityCreated(afn afnVar, Bundle bundle, long j) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, afnVar);
        ard.a(k_, bundle);
        k_.writeLong(j);
        b(27, k_);
    }

    @Override // defpackage.axz
    public final void onActivityDestroyed(afn afnVar, long j) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, afnVar);
        k_.writeLong(j);
        b(28, k_);
    }

    @Override // defpackage.axz
    public final void onActivityPaused(afn afnVar, long j) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, afnVar);
        k_.writeLong(j);
        b(29, k_);
    }

    @Override // defpackage.axz
    public final void onActivityResumed(afn afnVar, long j) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, afnVar);
        k_.writeLong(j);
        b(30, k_);
    }

    @Override // defpackage.axz
    public final void onActivitySaveInstanceState(afn afnVar, bas basVar, long j) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, afnVar);
        ard.a(k_, basVar);
        k_.writeLong(j);
        b(31, k_);
    }

    @Override // defpackage.axz
    public final void performAction(Bundle bundle, bas basVar, long j) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, bundle);
        ard.a(k_, basVar);
        k_.writeLong(j);
        b(32, k_);
    }

    @Override // defpackage.axz
    public final void logHealthData(int i, String str, afn afnVar, afn afnVar2, afn afnVar3) throws RemoteException {
        Parcel k_ = k_();
        k_.writeInt(i);
        k_.writeString(str);
        ard.a(k_, afnVar);
        ard.a(k_, afnVar2);
        ard.a(k_, afnVar3);
        b(33, k_);
    }

    @Override // defpackage.axz
    public final void setEventInterceptor(bat batVar) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, batVar);
        b(34, k_);
    }

    @Override // defpackage.axz
    public final void registerOnMeasurementEventListener(bat batVar) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, batVar);
        b(35, k_);
    }

    @Override // defpackage.axz
    public final void unregisterOnMeasurementEventListener(bat batVar) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, batVar);
        b(36, k_);
    }

    @Override // defpackage.axz
    public final void initForTests(Map map) throws RemoteException {
        Parcel k_ = k_();
        k_.writeMap(map);
        b(37, k_);
    }

    @Override // defpackage.axz
    public final void getTestFlag(bas basVar, int i) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, basVar);
        k_.writeInt(i);
        b(38, k_);
    }

    @Override // defpackage.axz
    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, z);
        b(39, k_);
    }

    @Override // defpackage.axz
    public final void isDataCollectionEnabled(bas basVar) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, basVar);
        b(40, k_);
    }

    @Override // defpackage.axz
    public final void getDeepLink(bas basVar) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, basVar);
        b(41, k_);
    }
}
