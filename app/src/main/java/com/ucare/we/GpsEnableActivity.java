package com.ucare.we;

import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import java.util.List;

/* loaded from: classes2.dex */
public class GpsEnableActivity extends dae implements LocationListener, ActivityCompat.OnRequestPermissionsResultCallback {
    protected LocationManager a;
    Location b;
    double c;
    double d;
    ImageView e;
    Button f;

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT < 26) {
            setRequestedOrientation(1);
        }
        boolean isProviderEnabled = ((LocationManager) getSystemService("location")).isProviderEnabled("gps");
        this.a = (LocationManager) getSystemService("location");
        if (!isProviderEnabled) {
            setContentView(R.layout.activity_gps_enable);
            ImageView imageView = (ImageView) findViewById(R.id.iv_close);
            this.e = imageView;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.GpsEnableActivity.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GpsEnableActivity.this.finish();
                }
            });
            Button button = (Button) findViewById(R.id.btnClose);
            this.f = button;
            button.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.GpsEnableActivity.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GpsEnableActivity.this.finish();
                }
            });
            return;
        }
        ActivityCompat.requestPermissions(this, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 1);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 1) {
            if (iArr.length > 0 && iArr[0] == 0) {
                a();
                Location location = this.b;
                if (location != null) {
                    this.c = location.getLatitude();
                }
                this.c = this.c;
                Location location2 = this.b;
                if (location2 != null) {
                    this.d = location2.getLongitude();
                }
                this.d = this.d;
                Intent intent = new Intent();
                intent.putExtra("lat", this.c);
                intent.putExtra("lng", this.d);
                setResult(-1, intent);
                finish();
                return;
            }
            Toast.makeText(this, getString(R.string.permission_denied), 1).show();
            finish();
        }
    }

    private Location a() {
        try {
            if (ActivityCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                return null;
            }
            this.a.requestLocationUpdates("gps", 3000L, 20.0f, this);
            if (this.a == null) {
                return null;
            }
            this.b = b();
            while (this.b == null && Double.compare(this.b.getLongitude(), 0.0d) != 0 && Double.compare(this.b.getLongitude(), 0.0d) != 0) {
                Location b = b();
                this.b = b;
                if (b != null) {
                    this.c = b.getLatitude();
                    this.d = this.b.getLongitude();
                    return this.b;
                }
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private Location b() {
        List<String> providers = this.a.getProviders(true);
        Location location = null;
        if (ActivityCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            for (String str : providers) {
                Location lastKnownLocation = this.a.getLastKnownLocation(str);
                if (lastKnownLocation != null && (location == null || lastKnownLocation.getAccuracy() < location.getAccuracy())) {
                    if (lastKnownLocation != null && Double.compare(lastKnownLocation.getLongitude(), 0.0d) != 0 && Double.compare(lastKnownLocation.getLongitude(), 0.0d) != 0) {
                        location = lastKnownLocation;
                    }
                }
            }
        }
        return location;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        this.c = location.getLatitude();
        this.d = location.getLongitude();
    }
}
