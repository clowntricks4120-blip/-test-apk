package androidx.lifecycle;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import ivas.gov.bisp.enumeration.p027b.F;

/* JADX INFO: loaded from: classes.dex */
public class h extends F {
    public final /* synthetic */ g this$0;

    public class aMh extends F {
        public aMh() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            h.this.this$0.c();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            h.this.this$0.d();
        }
    }

    public h(g gVar) {
        this.this$0 = gVar;
    }

    @Override // ivas.gov.bisp.enumeration.p027b.F, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i = ReportFragment.a;
            ((ReportFragment) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).b = this.this$0.b;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p027b.F, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        g gVar = this.this$0;
        int i = gVar.d - 1;
        gVar.d = i;
        if (i == 0) {
            gVar.f.postDelayed(gVar.i, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.registerActivityLifecycleCallbacks(new aMh());
    }

    @Override // ivas.gov.bisp.enumeration.p027b.F, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        g gVar = this.this$0;
        int i = gVar.c - 1;
        gVar.c = i;
        if (i == 0 && gVar.e) {
            gVar.h.j(d.aLZ.ON_STOP);
            gVar.g = true;
        }
    }
}
