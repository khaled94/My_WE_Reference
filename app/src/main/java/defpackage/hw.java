package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.IOException;
import java.util.List;

/* renamed from: hw  reason: default package */
/* loaded from: classes2.dex */
public final class hw implements co<Uri, Drawable> {
    private final Context a;

    @Override // defpackage.co
    public final /* bridge */ /* synthetic */ ee<Drawable> a(Uri uri, int i, int i2, cm cmVar) throws IOException {
        return a(uri);
    }

    @Override // defpackage.co
    public final /* synthetic */ boolean a(Uri uri, cm cmVar) throws IOException {
        return uri.getScheme().equals("android.resource");
    }

    public hw(Context context) {
        this.a = context.getApplicationContext();
    }

    public final ee<Drawable> a(Uri uri) {
        Context a = a(uri, uri.getAuthority());
        return hv.a(ht.a(this.a, a, a(a, uri)));
    }

    private Context a(Uri uri, String str) {
        if (str.equals(this.a.getPackageName())) {
            return this.a;
        }
        try {
            return this.a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (str.contains(this.a.getPackageName())) {
                return this.a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: ".concat(String.valueOf(uri)), e);
        }
    }

    private static int a(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return b(context, uri);
        }
        if (pathSegments.size() == 1) {
            return b(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: ".concat(String.valueOf(uri)));
    }

    private static int b(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: ".concat(String.valueOf(uri)));
    }

    private static int b(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Unrecognized Uri format: ".concat(String.valueOf(uri)), e);
        }
    }
}
