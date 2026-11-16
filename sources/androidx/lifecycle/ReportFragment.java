package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import ivas.gov.bisp.enumeration.p027b.ac;

/* JADX INFO: loaded from: classes.dex */
public class ReportFragment extends Fragment {
    public static final /* synthetic */ int a = 0;
    public OooO00o b;

    public interface OooO00o {
    }

    public static class OooO0O0 implements Application.ActivityLifecycleCallbacks {
        public static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new OooO0O0());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            ReportFragment.b(activity, d.aLZ.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            ReportFragment.b(activity, d.aLZ.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            ReportFragment.b(activity, d.aLZ.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            ReportFragment.b(activity, d.aLZ.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            ReportFragment.b(activity, d.aLZ.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            ReportFragment.b(activity, d.aLZ.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Activity activity, d.aLZ alz) {
        if (activity instanceof ac) {
            c lifecycle = ((ac) activity).getLifecycle();
            lifecycle.i("handleLifecycleEvent");
            lifecycle.k(alz.f());
        } else if (activity instanceof ivas.gov.bisp.enumeration.p027b.d) {
            d lifecycle2 = ((ivas.gov.bisp.enumeration.p027b.d) activity).getLifecycle();
            if (lifecycle2 instanceof c) {
                c cVar = (c) lifecycle2;
                cVar.i("handleLifecycleEvent");
                cVar.k(alz.f());
            }
        }
    }

    public static void c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            OooO0O0.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new ReportFragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public final void d(d.aLZ alz) {
        if (Build.VERSION.SDK_INT < 29) {
            b(getActivity(), alz);
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        d(d.aLZ.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        d(d.aLZ.ON_DESTROY);
        this.b = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        d(d.aLZ.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        OooO00o oooO00o = this.b;
        if (oooO00o != null) {
            g.this.c();
        }
        d(d.aLZ.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        OooO00o oooO00o = this.b;
        if (oooO00o != null) {
            g.this.d();
        }
        d(d.aLZ.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        d(d.aLZ.ON_STOP);
    }
}
