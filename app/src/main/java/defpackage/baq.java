package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.afn;

/* renamed from: baq  reason: default package */
/* loaded from: classes.dex */
public abstract class baq extends aom implements axz {
    public baq() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static axz asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof axz) {
            return (axz) queryLocalInterface;
        }
        return new bab(iBinder);
    }

    @Override // defpackage.aom
    protected final boolean a(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        bas basVar;
        bas basVar2;
        bas basVar3 = null;
        bas basVar4 = null;
        bas basVar5 = null;
        bas basVar6 = null;
        bat batVar = null;
        bat batVar2 = null;
        bat batVar3 = null;
        bas basVar7 = null;
        bas basVar8 = null;
        bas basVar9 = null;
        bas basVar10 = null;
        bas basVar11 = null;
        bas basVar12 = null;
        bax baxVar = null;
        bas basVar13 = null;
        bas basVar14 = null;
        bas basVar15 = null;
        bas basVar16 = null;
        switch (i) {
            case 1:
                initialize(afn.a.a(parcel.readStrongBinder()), (baz) ard.a(parcel, baz.CREATOR), parcel.readLong());
                break;
            case 2:
                logEvent(parcel.readString(), parcel.readString(), (Bundle) ard.a(parcel, Bundle.CREATOR), ard.a(parcel), ard.a(parcel), parcel.readLong());
                break;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) ard.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    basVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof bas) {
                        basVar2 = (bas) queryLocalInterface;
                    } else {
                        basVar2 = new bau(readStrongBinder);
                    }
                    basVar = basVar2;
                }
                logEventAndBundle(readString, readString2, bundle, basVar, parcel.readLong());
                break;
            case 4:
                setUserProperty(parcel.readString(), parcel.readString(), afn.a.a(parcel.readStrongBinder()), ard.a(parcel), parcel.readLong());
                break;
            case 5:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                boolean a = ard.a(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface2 instanceof bas) {
                        basVar3 = (bas) queryLocalInterface2;
                    } else {
                        basVar3 = new bau(readStrongBinder2);
                    }
                }
                getUserProperties(readString3, readString4, a, basVar3);
                break;
            case 6:
                String readString5 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface3 instanceof bas) {
                        basVar16 = (bas) queryLocalInterface3;
                    } else {
                        basVar16 = new bau(readStrongBinder3);
                    }
                }
                getMaxUserProperties(readString5, basVar16);
                break;
            case 7:
                setUserId(parcel.readString(), parcel.readLong());
                break;
            case 8:
                setConditionalUserProperty((Bundle) ard.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 9:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) ard.a(parcel, Bundle.CREATOR));
                break;
            case 10:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface4 instanceof bas) {
                        basVar15 = (bas) queryLocalInterface4;
                    } else {
                        basVar15 = new bau(readStrongBinder4);
                    }
                }
                getConditionalUserProperties(readString6, readString7, basVar15);
                break;
            case 11:
                setMeasurementEnabled(ard.a(parcel), parcel.readLong());
                break;
            case 12:
                resetAnalyticsData(parcel.readLong());
                break;
            case 13:
                setMinimumSessionDuration(parcel.readLong());
                break;
            case 14:
                setSessionTimeoutDuration(parcel.readLong());
                break;
            case 15:
                setCurrentScreen(afn.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readLong());
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface5 instanceof bas) {
                        basVar14 = (bas) queryLocalInterface5;
                    } else {
                        basVar14 = new bau(readStrongBinder5);
                    }
                }
                getCurrentScreenName(basVar14);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface6 instanceof bas) {
                        basVar13 = (bas) queryLocalInterface6;
                    } else {
                        basVar13 = new bau(readStrongBinder6);
                    }
                }
                getCurrentScreenClass(basVar13);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (queryLocalInterface7 instanceof bax) {
                        baxVar = (bax) queryLocalInterface7;
                    } else {
                        baxVar = new baw(readStrongBinder7);
                    }
                }
                setInstanceIdProvider(baxVar);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface8 instanceof bas) {
                        basVar12 = (bas) queryLocalInterface8;
                    } else {
                        basVar12 = new bau(readStrongBinder8);
                    }
                }
                getCachedAppInstanceId(basVar12);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface9 instanceof bas) {
                        basVar11 = (bas) queryLocalInterface9;
                    } else {
                        basVar11 = new bau(readStrongBinder9);
                    }
                }
                getAppInstanceId(basVar11);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface10 instanceof bas) {
                        basVar10 = (bas) queryLocalInterface10;
                    } else {
                        basVar10 = new bau(readStrongBinder10);
                    }
                }
                getGmpAppId(basVar10);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface11 instanceof bas) {
                        basVar9 = (bas) queryLocalInterface11;
                    } else {
                        basVar9 = new bau(readStrongBinder11);
                    }
                }
                generateEventId(basVar9);
                break;
            case 23:
                beginAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 24:
                endAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 25:
                onActivityStarted(afn.a.a(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 26:
                onActivityStopped(afn.a.a(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 27:
                onActivityCreated(afn.a.a(parcel.readStrongBinder()), (Bundle) ard.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 28:
                onActivityDestroyed(afn.a.a(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 29:
                onActivityPaused(afn.a.a(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 30:
                onActivityResumed(afn.a.a(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 31:
                afn a2 = afn.a.a(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface12 instanceof bas) {
                        basVar8 = (bas) queryLocalInterface12;
                    } else {
                        basVar8 = new bau(readStrongBinder12);
                    }
                }
                onActivitySaveInstanceState(a2, basVar8, parcel.readLong());
                break;
            case 32:
                Bundle bundle2 = (Bundle) ard.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface13 instanceof bas) {
                        basVar7 = (bas) queryLocalInterface13;
                    } else {
                        basVar7 = new bau(readStrongBinder13);
                    }
                }
                performAction(bundle2, basVar7, parcel.readLong());
                break;
            case 33:
                logHealthData(parcel.readInt(), parcel.readString(), afn.a.a(parcel.readStrongBinder()), afn.a.a(parcel.readStrongBinder()), afn.a.a(parcel.readStrongBinder()));
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface14 instanceof bat) {
                        batVar3 = (bat) queryLocalInterface14;
                    } else {
                        batVar3 = new bav(readStrongBinder14);
                    }
                }
                setEventInterceptor(batVar3);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface15 instanceof bat) {
                        batVar2 = (bat) queryLocalInterface15;
                    } else {
                        batVar2 = new bav(readStrongBinder15);
                    }
                }
                registerOnMeasurementEventListener(batVar2);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface16 instanceof bat) {
                        batVar = (bat) queryLocalInterface16;
                    } else {
                        batVar = new bav(readStrongBinder16);
                    }
                }
                unregisterOnMeasurementEventListener(batVar);
                break;
            case 37:
                initForTests(ard.b(parcel));
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface17 instanceof bas) {
                        basVar6 = (bas) queryLocalInterface17;
                    } else {
                        basVar6 = new bau(readStrongBinder17);
                    }
                }
                getTestFlag(basVar6, parcel.readInt());
                break;
            case 39:
                setDataCollectionEnabled(ard.a(parcel));
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface18 instanceof bas) {
                        basVar5 = (bas) queryLocalInterface18;
                    } else {
                        basVar5 = new bau(readStrongBinder18);
                    }
                }
                isDataCollectionEnabled(basVar5);
                break;
            case 41:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface19 instanceof bas) {
                        basVar4 = (bas) queryLocalInterface19;
                    } else {
                        basVar4 = new bau(readStrongBinder19);
                    }
                }
                getDeepLink(basVar4);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
