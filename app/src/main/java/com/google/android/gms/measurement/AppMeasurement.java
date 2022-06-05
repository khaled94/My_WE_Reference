package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public class AppMeasurement {
    private static volatile AppMeasurement d;
    public final bql a;
    public final bsk b;
    public final boolean c;

    /* loaded from: classes.dex */
    public static final class a extends bro {
        private a() {
        }
    }

    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        return a(context);
    }

    private static AppMeasurement a(Context context) {
        if (d == null) {
            synchronized (AppMeasurement.class) {
                if (d == null) {
                    bsk b = b(context, null);
                    if (b != null) {
                        d = new AppMeasurement(b);
                    } else {
                        d = new AppMeasurement(bql.a(context, (Bundle) null));
                    }
                }
            }
        }
        return d;
    }

    public static AppMeasurement a(Context context, Bundle bundle) {
        if (d == null) {
            synchronized (AppMeasurement.class) {
                if (d == null) {
                    bsk b = b(context, bundle);
                    if (b != null) {
                        d = new AppMeasurement(b);
                    } else {
                        d = new AppMeasurement(bql.a(context, bundle));
                    }
                }
            }
        }
        return d;
    }

    private static bsk b(Context context, Bundle bundle) {
        try {
            return (bsk) Class.forName("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, bundle);
        } catch (ClassNotFoundException | Exception unused) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;

        public ConditionalUserProperty() {
        }

        private ConditionalUserProperty(Bundle bundle) {
            aat.a(bundle);
            this.mAppId = (String) brj.a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) brj.a(bundle, "origin", String.class, null);
            this.mName = (String) brj.a(bundle, "name", String.class, null);
            this.mValue = brj.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) brj.a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) brj.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) brj.a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) brj.a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) brj.a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) brj.a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) brj.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) brj.a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) brj.a(bundle, "expired_event_params", Bundle.class, null);
        }

        /* synthetic */ ConditionalUserProperty(Bundle bundle, byte b) {
            this(bundle);
        }

        static /* synthetic */ Bundle a(ConditionalUserProperty conditionalUserProperty) {
            Bundle bundle = new Bundle();
            String str = conditionalUserProperty.mAppId;
            if (str != null) {
                bundle.putString("app_id", str);
            }
            String str2 = conditionalUserProperty.mOrigin;
            if (str2 != null) {
                bundle.putString("origin", str2);
            }
            String str3 = conditionalUserProperty.mName;
            if (str3 != null) {
                bundle.putString("name", str3);
            }
            Object obj = conditionalUserProperty.mValue;
            if (obj != null) {
                brj.a(bundle, obj);
            }
            String str4 = conditionalUserProperty.mTriggerEventName;
            if (str4 != null) {
                bundle.putString("trigger_event_name", str4);
            }
            bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
            String str5 = conditionalUserProperty.mTimedOutEventName;
            if (str5 != null) {
                bundle.putString("timed_out_event_name", str5);
            }
            Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
            if (bundle2 != null) {
                bundle.putBundle("timed_out_event_params", bundle2);
            }
            String str6 = conditionalUserProperty.mTriggeredEventName;
            if (str6 != null) {
                bundle.putString("triggered_event_name", str6);
            }
            Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
            if (bundle3 != null) {
                bundle.putBundle("triggered_event_params", bundle3);
            }
            bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
            String str7 = conditionalUserProperty.mExpiredEventName;
            if (str7 != null) {
                bundle.putString("expired_event_name", str7);
            }
            Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
            if (bundle4 != null) {
                bundle.putBundle("expired_event_params", bundle4);
            }
            bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
            bundle.putBoolean("active", conditionalUserProperty.mActive);
            bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
            return bundle;
        }
    }

    private AppMeasurement(bql bqlVar) {
        aat.a(bqlVar);
        this.a = bqlVar;
        this.b = null;
        this.c = false;
    }

    private AppMeasurement(bsk bskVar) {
        aat.a(bskVar);
        this.b = bskVar;
        this.a = null;
        this.c = true;
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        if (this.c) {
            this.b.a(str, str2, bundle);
        } else {
            this.a.d().a(str, str2, bundle);
        }
    }

    public String getCurrentScreenName() {
        if (this.c) {
            return this.b.a();
        }
        return this.a.d().y();
    }

    public String getCurrentScreenClass() {
        if (this.c) {
            return this.b.b();
        }
        return this.a.d().z();
    }

    public String getAppInstanceId() {
        if (this.c) {
            return this.b.c();
        }
        return this.a.d().w();
    }

    public String getGmpAppId() {
        if (this.c) {
            return this.b.d();
        }
        return this.a.d().E();
    }

    public long generateEventId() {
        if (this.c) {
            return this.b.e();
        }
        return this.a.e().f();
    }

    public void beginAdUnitExposure(String str) {
        if (this.c) {
            this.b.a(str);
        } else {
            this.a.n().a(str, this.a.l().b());
        }
    }

    public void endAdUnitExposure(String str) {
        if (this.c) {
            this.b.b(str);
        } else {
            this.a.n().b(str, this.a.l().b());
        }
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        aat.a(conditionalUserProperty);
        if (this.c) {
            this.b.a(ConditionalUserProperty.a(conditionalUserProperty));
            return;
        }
        brs d2 = this.a.d();
        d2.a(ConditionalUserProperty.a(conditionalUserProperty), d2.l().a());
    }

    protected void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        aat.a(conditionalUserProperty);
        if (this.c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        brs d2 = this.a.d();
        Bundle a2 = ConditionalUserProperty.a(conditionalUserProperty);
        aat.a(a2);
        aat.a(a2.getString("app_id"));
        d2.a();
        d2.b(new Bundle(a2), d2.l().a());
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (this.c) {
            this.b.b(str, str2, bundle);
        } else {
            this.a.d().b(str, str2, bundle);
        }
    }

    protected void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        if (this.c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        brs d2 = this.a.d();
        aat.a(str);
        d2.a();
        d2.a(str, str2, str3, bundle);
    }

    protected Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        if (this.c) {
            return this.b.a(str, str2, z);
        }
        return this.a.d().a((String) null, str, str2, z);
    }

    protected Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        if (this.c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        brs d2 = this.a.d();
        aat.a(str);
        d2.a();
        return d2.a(str, str2, str3, z);
    }

    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> list;
        if (this.c) {
            list = this.b.a(str, str2);
        } else {
            list = this.a.d().a((String) null, str, str2);
        }
        ArrayList arrayList = new ArrayList(list == null ? 0 : list.size());
        for (Bundle bundle : list) {
            arrayList.add(new ConditionalUserProperty(bundle, (byte) 0));
        }
        return arrayList;
    }

    protected List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        if (this.c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        brs d2 = this.a.d();
        aat.a(str);
        d2.a();
        ArrayList<Bundle> a2 = d2.a(str, str2, str3);
        ArrayList arrayList = new ArrayList(a2 == null ? 0 : a2.size());
        ArrayList<Bundle> arrayList2 = a2;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Bundle bundle = arrayList2.get(i);
            i++;
            arrayList.add(new ConditionalUserProperty(bundle, (byte) 0));
        }
        return arrayList;
    }

    public int getMaxUserProperties(String str) {
        if (this.c) {
            return this.b.c(str);
        }
        this.a.d();
        aat.a(str);
        return 25;
    }
}
