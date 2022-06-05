package com.jakewharton.processphoenix;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ProcessPhoenix extends Activity {
    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("phoenix_restart_intents");
        startActivities((Intent[]) parcelableArrayListExtra.toArray(new Intent[parcelableArrayListExtra.size()]));
        finish();
        Runtime.getRuntime().exit(0);
    }
}
