package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/facebook/appevents/codeless/ViewIndexingTrigger;", "Landroid/hardware/SensorEventListener;", "()V", "onShakeListener", "Lcom/facebook/appevents/codeless/ViewIndexingTrigger$OnShakeListener;", "onAccuracyChanged", "", "sensor", "Landroid/hardware/Sensor;", "accuracy", "", "onSensorChanged", NotificationCompat.CATEGORY_EVENT, "Landroid/hardware/SensorEvent;", "setOnShakeListener", "listener", "Companion", "OnShakeListener", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: nn  reason: default package */
/* loaded from: classes2.dex */
public final class nn implements SensorEventListener {
    public static final a b = new a((byte) 0);
    b a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/facebook/appevents/codeless/ViewIndexingTrigger$OnShakeListener;", "", "onShake", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: nn$b */
    /* loaded from: classes2.dex */
    public interface b {
        void a();
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (qx.a(this)) {
            return;
        }
        try {
            dqc.d(sensorEvent, NotificationCompat.CATEGORY_EVENT);
            b bVar = this.a;
            if (bVar == null) {
                return;
            }
            double d = sensorEvent.values[0] / 9.80665f;
            double d2 = sensorEvent.values[1] / 9.80665f;
            double d3 = sensorEvent.values[2] / 9.80665f;
            if (Math.sqrt((d * d) + (d2 * d2) + (d3 * d3)) <= 2.3d) {
                return;
            }
            bVar.a();
        } catch (Throwable th) {
            qx.a(th, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        if (qx.a(this)) {
            return;
        }
        try {
            dqc.d(sensor, "sensor");
        } catch (Throwable th) {
            qx.a(th, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/facebook/appevents/codeless/ViewIndexingTrigger$Companion;", "", "()V", "SHAKE_THRESHOLD_GRAVITY", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: nn$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }
}
