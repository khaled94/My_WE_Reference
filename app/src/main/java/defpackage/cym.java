package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.ucare.we.R;
import com.ucare.we.view.AppCompatTextView;

/* renamed from: cym  reason: default package */
/* loaded from: classes2.dex */
public final class cym implements ViewBinding {
    public final RelativeLayout a;
    public final cyo b;
    public final FrameLayout c;
    public final cyp d;

    private cym(RelativeLayout relativeLayout, cyo cyoVar, FrameLayout frameLayout, cyp cypVar) {
        this.a = relativeLayout;
        this.b = cyoVar;
        this.c = frameLayout;
        this.d = cypVar;
    }

    public static cym a(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.fragment_base, (ViewGroup) null, false);
        int i = R.id.errorView;
        View findViewById = inflate.findViewById(R.id.errorView);
        if (findViewById != null) {
            int i2 = R.id.btnRetry;
            Button button = (Button) findViewById.findViewById(R.id.btnRetry);
            if (button != null) {
                ImageView imageView = (ImageView) findViewById.findViewById(R.id.connectionLogoIV);
                if (imageView != null) {
                    AppCompatTextView appCompatTextView = (AppCompatTextView) findViewById.findViewById(R.id.connectionTitleTV);
                    if (appCompatTextView != null) {
                        ImageView imageView2 = (ImageView) findViewById.findViewById(R.id.ivError);
                        if (imageView2 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) findViewById;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) findViewById.findViewById(R.id.tvError);
                            if (appCompatTextView2 != null) {
                                cyo cyoVar = new cyo(constraintLayout, button, imageView, appCompatTextView, imageView2, constraintLayout, appCompatTextView2);
                                FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.flContainer);
                                if (frameLayout != null) {
                                    View findViewById2 = inflate.findViewById(R.id.loadingView);
                                    if (findViewById2 != null) {
                                        ProgressBar progressBar = (ProgressBar) findViewById2.findViewById(R.id.ivLoading);
                                        if (progressBar != null) {
                                            RelativeLayout relativeLayout = (RelativeLayout) findViewById2;
                                            return new cym((RelativeLayout) inflate, cyoVar, frameLayout, new cyp(relativeLayout, progressBar, relativeLayout));
                                        }
                                        throw new NullPointerException("Missing required view with ID: ".concat(findViewById2.getResources().getResourceName(R.id.ivLoading)));
                                    }
                                    i = R.id.loadingView;
                                } else {
                                    i = R.id.flContainer;
                                }
                            } else {
                                i2 = R.id.tvError;
                            }
                        } else {
                            i2 = R.id.ivError;
                        }
                    } else {
                        i2 = R.id.connectionTitleTV;
                    }
                } else {
                    i2 = R.id.connectionLogoIV;
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i2)));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.a;
    }
}
