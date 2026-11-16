package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import ivas.gov.bisp.enumeration.F.C0017v;
import ivas.gov.bisp.enumeration.F.D;
import ivas.gov.bisp.enumeration.F.R;
import ivas.gov.bisp.enumeration.F.U;
import ivas.gov.bisp.enumeration.F.V;
import ivas.gov.bisp.enumeration.OoooOOo.o000000O;
import ivas.gov.bisp.enumeration.p016ap.ao;
import ivas.gov.bisp.enumeration.p027b.InterfaceC0106f;
import ivas.gov.bisp.enumeration.p027b.an;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity implements ivas.gov.bisp.enumeration.h.k.aIu {
    public boolean l;
    public boolean m;
    public final V j = new V(new OooO00o());
    public final androidx.lifecycle.c k = new androidx.lifecycle.c(this);
    public boolean n = true;

    public class OooO00o extends o000000O<FragmentActivity> implements InterfaceC0106f, ivas.gov.bisp.enumeration.p083f.h, ivas.gov.bisp.enumeration.p084g.i, D {
        public OooO00o() {
            super(FragmentActivity.this);
        }

        @Override // ivas.gov.bisp.enumeration.F.D
        public void b(h hVar, Fragment fragment) {
            Objects.requireNonNull(FragmentActivity.this);
        }

        public View c(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        @Override // ivas.gov.bisp.enumeration.p083f.h
        public OnBackPressedDispatcher c() {
            return FragmentActivity.this.h;
        }

        @Override // ivas.gov.bisp.enumeration.p084g.i
        public ActivityResultRegistry d() {
            return FragmentActivity.this.i;
        }

        /* JADX INFO: renamed from: d, reason: collision with other method in class */
        public boolean m0d() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        public boolean e(String str) {
            FragmentActivity fragmentActivity = FragmentActivity.this;
            int i = ivas.gov.bisp.enumeration.p085h.k.d;
            return fragmentActivity.shouldShowRequestPermissionRationale(str);
        }

        public Object f() {
            return FragmentActivity.this;
        }

        public LayoutInflater g() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        @Override // ivas.gov.bisp.enumeration.p027b.d
        public androidx.lifecycle.d getLifecycle() {
            return FragmentActivity.this.k;
        }

        @Override // ivas.gov.bisp.enumeration.p027b.InterfaceC0106f
        public an getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        public boolean h(Fragment fragment) {
            return !FragmentActivity.this.isFinishing();
        }

        public void i() {
            FragmentActivity.this.l();
        }
    }

    public FragmentActivity() {
        this.e.b.c("android:support:fragments", new R(this));
        e(new C0017v(this));
    }

    public static boolean i(h hVar, androidx.lifecycle.d.aMa ama) {
        androidx.lifecycle.d.aMa ama2 = androidx.lifecycle.d.aMa.STARTED;
        boolean zI = false;
        for (Fragment fragment : hVar.d.c()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zI |= i(fragment.getChildFragmentManager(), ama);
                }
                U u = fragment.mViewLifecycleOwner;
                if (u != null) {
                    u.d();
                    if (u.d.b.compareTo(ama2) >= 0) {
                        androidx.lifecycle.c cVar = fragment.mViewLifecycleOwner.d;
                        cVar.i("setCurrentState");
                        cVar.k(ama);
                        zI = true;
                    }
                }
                if (fragment.mLifecycleRegistry.b.compareTo(ama2) >= 0) {
                    androidx.lifecycle.c cVar2 = fragment.mLifecycleRegistry;
                    cVar2.i("setCurrentState");
                    cVar2.k(ama);
                    zI = true;
                }
            }
        }
        return zI;
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("  ");
        String string = sb.toString();
        printWriter.print(string);
        printWriter.print("mCreated=");
        printWriter.print(this.m);
        printWriter.print(" mResumed=");
        printWriter.print(this.l);
        printWriter.print(" mStopped=");
        printWriter.print(this.n);
        if (getApplication() != null) {
            ao.c(this).d(string, fileDescriptor, printWriter, strArr);
        }
        this.j.c.d.B(str, fileDescriptor, printWriter, strArr);
    }

    @Override // ivas.gov.bisp.enumeration.h.k.aIu
    @Deprecated
    public final void e(int i) {
    }

    public h k() {
        return this.j.c.d;
    }

    @Deprecated
    public void l() {
        invalidateOptionsMenu();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.j.c();
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.j.c();
        super.onConfigurationChanged(configuration);
        this.j.c.d.m(configuration);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.k.j(androidx.lifecycle.d.aLZ.ON_CREATE);
        this.j.c.d.p();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        boolean zOnCreatePanelMenu = super.onCreatePanelMenu(i, menu);
        V v = this.j;
        return zOnCreatePanelMenu | v.c.d.o(menu, getMenuInflater());
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = this.j.c.d.f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.j.c.d.q();
        this.k.j(androidx.lifecycle.d.aLZ.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.j.c.d.r();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.j.c.d.s(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.j.c.d.n(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.j.c.d.t(z);
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        this.j.c();
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.j.c.d.u(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.l = false;
        this.j.c.d.z(5);
        this.k.j(androidx.lifecycle.d.aLZ.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.j.c.d.w(z);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.k.j(androidx.lifecycle.d.aLZ.ON_RESUME);
        h hVar = this.j.c.d;
        hVar.C = false;
        hVar.B = false;
        hVar.J.k = false;
        hVar.z(7);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return i == 0 ? super.onPreparePanel(0, view, menu) | this.j.c.d.y(menu) : super.onPreparePanel(i, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.j.c();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.j.c();
        super.onResume();
        this.l = true;
        this.j.c.d.D(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.j.c();
        super.onStart();
        this.n = false;
        if (!this.m) {
            this.m = true;
            h hVar = this.j.c.d;
            hVar.C = false;
            hVar.B = false;
            hVar.J.k = false;
            hVar.z(4);
        }
        this.j.c.d.D(true);
        this.k.j(androidx.lifecycle.d.aLZ.ON_START);
        h hVar2 = this.j.c.d;
        hVar2.C = false;
        hVar2.B = false;
        hVar2.J.k = false;
        hVar2.z(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.j.c();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.n = true;
        while (i(k(), androidx.lifecycle.d.aMa.CREATED)) {
        }
        h hVar = this.j.c.d;
        hVar.B = true;
        hVar.J.k = true;
        hVar.z(4);
        this.k.j(androidx.lifecycle.d.aLZ.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = this.j.c.d.f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }
}
