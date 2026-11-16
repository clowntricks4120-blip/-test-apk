package androidx.fragment.app;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class o implements ivas.gov.bisp.enumeration.H.c.aKS {
    public final /* synthetic */ Fragment a;

    public o(Fragment fragment) {
        this.a = fragment;
    }

    @Override // ivas.gov.bisp.enumeration.H.c.aKS
    public void onCancel() {
        if (this.a.getAnimatingAway() != null) {
            View animatingAway = this.a.getAnimatingAway();
            this.a.setAnimatingAway(null);
            animatingAway.clearAnimation();
        }
        this.a.setAnimator(null);
    }
}
