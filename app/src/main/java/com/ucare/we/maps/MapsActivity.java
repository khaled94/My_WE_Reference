package com.ucare.we.maps;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.ucare.we.R;
import com.ucare.we.model.StoreResponseBody;
import java.util.Objects;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class MapsActivity extends AppCompatActivity implements bjh {
    @Inject
    djg a;
    private bjf b;
    private StoreResponseBody c;
    private MapView d;
    private bko e;
    private djw f;
    private ImageView g;

    /* renamed from: lambda$tmn9t83GkOE70z-U91SrobN1o-A */
    public static /* synthetic */ void m23lambda$tmn9t83GkOE70zU91SrobN1oA(MapsActivity mapsActivity, View view) {
        mapsActivity.a(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    /* JADX WARN: Finally extract failed */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_maps);
        this.f = new djw();
        this.g = (ImageView) findViewById(R.id.imgBackButton);
        if (this.f.k().equals("ar")) {
            this.g.setRotation(180.0f);
        }
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.maps.-$$Lambda$MapsActivity$tmn9t83GkOE70z-U91SrobN1o-A
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MapsActivity.m23lambda$tmn9t83GkOE70zU91SrobN1oA(MapsActivity.this, view);
            }
        });
        if (getIntent().hasExtra("RESPONSE_BODY_FOR_MAP")) {
            this.c = (StoreResponseBody) ((Bundle) Objects.requireNonNull(getIntent().getExtras())).getParcelable("RESPONSE_BODY_FOR_MAP");
        }
        new StringBuilder("onCreate: ").append(this.c.toString());
        this.d = (MapView) findViewById(R.id.mapView);
        Bundle bundle2 = null;
        if (bundle != null) {
            bundle2 = bundle.getBundle("MapViewBundleKey");
        }
        MapView mapView = this.d;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            mapView.a.a(bundle2);
            if (mapView.a.a == 0) {
                afm.a(mapView);
            }
            StrictMode.setThreadPolicy(threadPolicy);
            MapView mapView2 = this.d;
            bjh bjhVar = new bjh() { // from class: com.ucare.we.maps.-$$Lambda$ymkROKBt020M3MP0BJuWfOmNmgI
                @Override // defpackage.bjh
                public final void onMapReady(bjf bjfVar) {
                    MapsActivity.this.onMapReady(bjfVar);
                }
            };
            aat.b("getMapAsync() must be called on the main thread");
            MapView.b bVar = mapView2.a;
            if (bVar.a != 0) {
                ((MapView.a) bVar.a).a(bjhVar);
            } else {
                bVar.d.add(bjhVar);
            }
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }

    public /* synthetic */ void a(View view) {
        onBackPressed();
    }

    @Override // defpackage.bjh
    public void onMapReady(bjf bjfVar) {
        String str;
        String str2;
        cze.a.a();
        this.b = bjfVar;
        try {
            bjfVar.a.b();
            try {
                this.b.a.a();
                try {
                    this.b.a().a.b();
                    try {
                        this.b.a().a.a();
                        LatLng latLng = new LatLng(this.c.getLatitude(), this.c.getLongitude());
                        if (this.f.k().equals("en")) {
                            str2 = this.c.getEnBranchName();
                            str = this.c.getEnBranchAddress();
                        } else {
                            str2 = this.c.getArBranchName();
                            str = this.c.getArBranchAddress();
                        }
                        bko bkoVar = this.e;
                        if (bkoVar != null) {
                            try {
                                bkoVar.a.a();
                            } catch (RemoteException e) {
                                throw new RuntimeRemoteException(e);
                            }
                        }
                        bkp bkpVar = new bkp();
                        bkpVar.a = latLng;
                        bkpVar.b = str2;
                        bkpVar.c = str;
                        this.e = this.b.a(bkpVar);
                        try {
                            this.b.a.a(bje.a(latLng).a);
                        } catch (RemoteException e2) {
                            throw new RuntimeRemoteException(e2);
                        }
                    } catch (RemoteException e3) {
                        throw new RuntimeRemoteException(e3);
                    }
                } catch (RemoteException e4) {
                    throw new RuntimeRemoteException(e4);
                }
            } catch (RemoteException e5) {
                throw new RuntimeRemoteException(e5);
            }
        } catch (RemoteException e6) {
            throw new RuntimeRemoteException(e6);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.d.a.f();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.d.a.e();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.d.a.g();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.d.a.a();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        this.d.a.d();
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.d.a.c();
    }
}
