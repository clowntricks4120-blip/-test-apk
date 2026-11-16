package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.a;
import androidx.lifecycle.c;
import androidx.savedstate.b;
import androidx.savedstate.e;
import ivas.gov.bisp.enumeration.I.r;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p027b.InterfaceC0106f;
import ivas.gov.bisp.enumeration.p027b.an;
import ivas.gov.bisp.enumeration.p027b.d;
import ivas.gov.bisp.enumeration.p054c.j;
import ivas.gov.bisp.enumeration.p082e.g;
import ivas.gov.bisp.enumeration.p083f.h;
import ivas.gov.bisp.enumeration.p084g.i;
import ivas.gov.bisp.enumeration.p084g.p;
import ivas.gov.bisp.enumeration.p085h.k;
import ivas.gov.bisp.enumeration.p085h.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements InterfaceC0106f, g, h, i {
    public final AtomicInteger c;
    public final j d = new j();
    public final e e;
    public final c f;
    public an g;
    public final OnBackPressedDispatcher h;
    public final ActivityResultRegistry i;

    public static final class OooO {
        public an a;
    }

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            }
        }
    }

    public class OooO0O0 extends ActivityResultRegistry {

        public class OooO00o implements Runnable {
            public final /* synthetic */ int a;
            public final /* synthetic */ r.aQb b;

            public OooO00o(int i, r.aQb aqb) {
                this.a = i;
                this.b = aqb;
            }

            @Override // java.lang.Runnable
            public void run() {
                ivas.gov.bisp.enumeration.OooO0Oo.OooO0o<?> oooO0o;
                OooO0O0 oooO0O0 = OooO0O0.this;
                int i = this.a;
                Object obj = this.b.a;
                String str = oooO0O0.b.get(Integer.valueOf(i));
                if (str != null) {
                    oooO0O0.f.remove(str);
                    ActivityResultRegistry.OooO0OO<?> oooO0OO = oooO0O0.e.get(str);
                    if (oooO0OO != null && (oooO0o = oooO0OO.a) != null) {
                        oooO0o.b(obj);
                    } else {
                        oooO0O0.h.remove(str);
                        oooO0O0.g.put(str, obj);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: androidx.activity.ComponentActivity$OooO0O0$OooO0O0, reason: collision with other inner class name */
        public class RunnableC0000OooO0O0 implements Runnable {
            public final /* synthetic */ int a;
            public final /* synthetic */ IntentSender.SendIntentException b;

            public RunnableC0000OooO0O0(int i, IntentSender.SendIntentException sendIntentException) {
                this.a = i;
                this.b = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                OooO0O0.this.b(this.a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.b));
            }
        }

        public OooO0O0() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        public <I, O> void c(int i, ivas.gov.bisp.enumeration.OooO0o0.OooO0o<I, O> oooO0o, I i2, w wVar) {
            Bundle bundle;
            ComponentActivity componentActivity = ComponentActivity.this;
            ivas.gov.bisp.enumeration.OooO0o0.OooO0o.OooO00o<O> oooO00oD = oooO0o.d(componentActivity, i2);
            if (oooO00oD != null) {
                new Handler(Looper.getMainLooper()).post(new OooO00o(i, oooO00oD));
                return;
            }
            Intent intentC = oooO0o.c(componentActivity, i2);
            if (intentC.getExtras() != null && intentC.getExtras().getClassLoader() == null) {
                intentC.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (intentC.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = intentC.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentC.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentC.getAction())) {
                String[] stringArrayExtra = intentC.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                k.c(componentActivity, stringArrayExtra, i);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentC.getAction())) {
                int i3 = k.d;
                componentActivity.startActivityForResult(intentC, i, bundle);
                return;
            }
            p pVar = (p) intentC.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                IntentSender intentSender = pVar.d;
                Intent intent = pVar.e;
                int i4 = pVar.f;
                int i5 = pVar.g;
                int i6 = k.d;
                componentActivity.startIntentSenderForResult(intentSender, i, intent, i4, i5, 0, bundle);
            } catch (IntentSender.SendIntentException e) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0000OooO0O0(i, e));
            }
        }
    }

    public class OooO0OO implements b.aIh {
        public OooO0OO() {
        }

        @Override // androidx.savedstate.b.aIh
        @SuppressLint({"SyntheticAccessor"})
        public Bundle b() {
            Bundle bundle = new Bundle();
            ActivityResultRegistry activityResultRegistry = ComponentActivity.this.i;
            Objects.requireNonNull(activityResultRegistry);
            bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(activityResultRegistry.c.values()));
            bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(activityResultRegistry.c.keySet()));
            bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(activityResultRegistry.f));
            bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) activityResultRegistry.h.clone());
            bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", activityResultRegistry.a);
            return bundle;
        }
    }

    public class OooO0o implements ivas.gov.bisp.enumeration.p054c.c {
        public OooO0o() {
        }

        @Override // ivas.gov.bisp.enumeration.p054c.c
        @SuppressLint({"SyntheticAccessor"})
        public void b(Context context) {
            Bundle bundleB = ComponentActivity.this.e.b.b("android:support:activity-result");
            if (bundleB != null) {
                ActivityResultRegistry activityResultRegistry = ComponentActivity.this.i;
                Objects.requireNonNull(activityResultRegistry);
                ArrayList<Integer> integerArrayList = bundleB.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                ArrayList<String> stringArrayList = bundleB.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                if (stringArrayList == null || integerArrayList == null) {
                    return;
                }
                activityResultRegistry.f = bundleB.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                activityResultRegistry.a = (Random) bundleB.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                activityResultRegistry.h.putAll(bundleB.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                for (int i = 0; i < stringArrayList.size(); i++) {
                    String str = stringArrayList.get(i);
                    if (activityResultRegistry.c.containsKey(str)) {
                        Integer numRemove = activityResultRegistry.c.remove(str);
                        if (!activityResultRegistry.h.containsKey(str)) {
                            activityResultRegistry.b.remove(numRemove);
                        }
                    }
                    int iIntValue = integerArrayList.get(i).intValue();
                    String str2 = stringArrayList.get(i);
                    activityResultRegistry.b.put(Integer.valueOf(iIntValue), str2);
                    activityResultRegistry.c.put(str2, Integer.valueOf(iIntValue));
                }
            }
        }
    }

    public ComponentActivity() {
        c cVar = new c(this);
        this.f = cVar;
        e eVar = new e(this);
        this.e = eVar;
        this.h = new OnBackPressedDispatcher(new OooO00o());
        this.c = new AtomicInteger();
        this.i = new OooO0O0();
        int i = Build.VERSION.SDK_INT;
        cVar.b(new a() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.a
            public void a(d dVar, androidx.lifecycle.d.aLZ alz) {
                if (alz == androidx.lifecycle.d.aLZ.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        cVar.b(new a() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.a
            public void a(d dVar, androidx.lifecycle.d.aLZ alz) {
                if (alz == androidx.lifecycle.d.aLZ.ON_DESTROY) {
                    ComponentActivity.this.d.b = null;
                    if (ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.getViewModelStore().c();
                }
            }
        });
        cVar.b(new a() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.lifecycle.a
            public void a(d dVar, androidx.lifecycle.d.aLZ alz) {
                ComponentActivity.this.f();
                c cVar2 = ComponentActivity.this.f;
                cVar2.i("removeObserver");
                cVar2.a.g(this);
            }
        });
        if (i <= 23) {
            cVar.b(new ImmLeaksCleaner(this));
        }
        eVar.b.c("android:support:activity-result", new OooO0OO());
        e(new OooO0o());
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        g();
        super.addContentView(view, layoutParams);
    }

    @Override // ivas.gov.bisp.enumeration.p083f.h
    public final OnBackPressedDispatcher c() {
        return this.h;
    }

    @Override // ivas.gov.bisp.enumeration.p084g.i
    public final ActivityResultRegistry d() {
        return this.i;
    }

    public final void e(ivas.gov.bisp.enumeration.p054c.c cVar) {
        j jVar = this.d;
        if (jVar.b != null) {
            cVar.b(jVar.b);
        }
        jVar.a.add(cVar);
    }

    public void f() {
        if (this.g == null) {
            OooO oooO = (OooO) getLastNonConfigurationInstance();
            if (oooO != null) {
                this.g = oooO.a;
            }
            if (this.g == null) {
                this.g = new an();
            }
        }
    }

    public final void g() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.core.app.ComponentActivity, ivas.gov.bisp.enumeration.p027b.d
    public androidx.lifecycle.d getLifecycle() {
        return this.f;
    }

    @Override // ivas.gov.bisp.enumeration.p082e.g
    public final b getSavedStateRegistry() {
        return this.e.b;
    }

    @Override // ivas.gov.bisp.enumeration.p027b.InterfaceC0106f
    public an getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        f();
        return this.g;
    }

    public final <I, O> ivas.gov.bisp.enumeration.OooO0Oo.OooO<I> h(ivas.gov.bisp.enumeration.OooO0o0.OooO0o<I, O> oooO0o, ivas.gov.bisp.enumeration.OooO0Oo.OooO0o<O> oooO0o2) {
        ActivityResultRegistry activityResultRegistry = this.i;
        StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("activity_rq#");
        sbW.append(this.c.getAndIncrement());
        return activityResultRegistry.e(sbW.toString(), this, oooO0o, oooO0o2);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.i.b(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.h.c();
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.e.b(bundle);
        j jVar = this.d;
        jVar.b = this;
        Iterator<ivas.gov.bisp.enumeration.p054c.c> it = jVar.a.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
        super.onCreate(bundle);
        ReportFragment.c(this);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.i.b(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        OooO oooO;
        an anVar = this.g;
        if (anVar == null && (oooO = (OooO) getLastNonConfigurationInstance()) != null) {
            anVar = oooO.a;
        }
        if (anVar == null) {
            return null;
        }
        OooO oooO2 = new OooO();
        oooO2.a = anVar;
        return oooO2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        c cVar = this.f;
        if (cVar instanceof c) {
            androidx.lifecycle.d.aMa ama = androidx.lifecycle.d.aMa.CREATED;
            cVar.i("setCurrentState");
            cVar.k(ama);
        }
        super.onSaveInstanceState(bundle);
        this.e.c(bundle);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (ivas.gov.bisp.enumeration.cV.j.b()) {
                StringBuilder sb = new StringBuilder();
                sb.append("reportFullyDrawn() for ");
                sb.append(getComponentName());
                Trace.beginSection(sb.toString());
            }
            super.reportFullyDrawn();
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        g();
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        g();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        g();
        super.setContentView(view, layoutParams);
    }
}
