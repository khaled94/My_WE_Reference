package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Map;

/* renamed from: axz  reason: default package */
/* loaded from: classes.dex */
public interface axz extends IInterface {
    void beginAdUnitExposure(String str, long j) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void endAdUnitExposure(String str, long j) throws RemoteException;

    void generateEventId(bas basVar) throws RemoteException;

    void getAppInstanceId(bas basVar) throws RemoteException;

    void getCachedAppInstanceId(bas basVar) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, bas basVar) throws RemoteException;

    void getCurrentScreenClass(bas basVar) throws RemoteException;

    void getCurrentScreenName(bas basVar) throws RemoteException;

    void getDeepLink(bas basVar) throws RemoteException;

    void getGmpAppId(bas basVar) throws RemoteException;

    void getMaxUserProperties(String str, bas basVar) throws RemoteException;

    void getTestFlag(bas basVar, int i) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z, bas basVar) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(afn afnVar, baz bazVar, long j) throws RemoteException;

    void isDataCollectionEnabled(bas basVar) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, bas basVar, long j) throws RemoteException;

    void logHealthData(int i, String str, afn afnVar, afn afnVar2, afn afnVar3) throws RemoteException;

    void onActivityCreated(afn afnVar, Bundle bundle, long j) throws RemoteException;

    void onActivityDestroyed(afn afnVar, long j) throws RemoteException;

    void onActivityPaused(afn afnVar, long j) throws RemoteException;

    void onActivityResumed(afn afnVar, long j) throws RemoteException;

    void onActivitySaveInstanceState(afn afnVar, bas basVar, long j) throws RemoteException;

    void onActivityStarted(afn afnVar, long j) throws RemoteException;

    void onActivityStopped(afn afnVar, long j) throws RemoteException;

    void performAction(Bundle bundle, bas basVar, long j) throws RemoteException;

    void registerOnMeasurementEventListener(bat batVar) throws RemoteException;

    void resetAnalyticsData(long j) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException;

    void setCurrentScreen(afn afnVar, String str, String str2, long j) throws RemoteException;

    void setDataCollectionEnabled(boolean z) throws RemoteException;

    void setEventInterceptor(bat batVar) throws RemoteException;

    void setInstanceIdProvider(bax baxVar) throws RemoteException;

    void setMeasurementEnabled(boolean z, long j) throws RemoteException;

    void setMinimumSessionDuration(long j) throws RemoteException;

    void setSessionTimeoutDuration(long j) throws RemoteException;

    void setUserId(String str, long j) throws RemoteException;

    void setUserProperty(String str, String str2, afn afnVar, boolean z, long j) throws RemoteException;

    void unregisterOnMeasurementEventListener(bat batVar) throws RemoteException;
}
