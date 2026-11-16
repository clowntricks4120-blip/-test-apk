package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import ivas.gov.bisp.enumeration.OooOOoo.OooOO0;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p085h.f;
import ivas.gov.bisp.enumeration.p085h.k;
import ivas.gov.bisp.enumeration.p086i.l;
import ivas.gov.bisp.enumeration.p087j.C0313t;
import ivas.gov.bisp.enumeration.p087j.InterfaceC0310l;
import ivas.gov.bisp.enumeration.p087j.LayoutInflaterFactory2C0312o;
import ivas.gov.bisp.enumeration.p087j.u;
import ivas.gov.bisp.enumeration.p087j.z;
import ivas.gov.bisp.enumeration.p088k.ah;
import ivas.gov.bisp.enumeration.p099u.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatActivity extends FragmentActivity implements InterfaceC0310l {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ivas.gov.bisp.enumeration.p087j.a f2o;

    public AppCompatActivity() {
        this.e.b.c("androidx:appcompat", new C0313t(this));
        e(new u(this));
    }

    private void g() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g();
        m().e(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(m().f(context));
    }

    @Override // ivas.gov.bisp.enumeration.p087j.InterfaceC0310l
    public void b(j jVar) {
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        z zVarJ = j();
        if (getWindow().hasFeature(0)) {
            if (zVarJ == null || !zVarJ.d()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        z zVarJ = j();
        if (keyCode == 82 && zVarJ != null && zVarJ.l(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // ivas.gov.bisp.enumeration.p087j.InterfaceC0310l
    public void f(j jVar) {
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) m().h(i);
    }

    @Override // ivas.gov.bisp.enumeration.p087j.InterfaceC0310l
    public j g(j.aQr aqr) {
        return null;
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return m().i();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        int i = ah.a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        m().k();
    }

    public z j() {
        return m().j();
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void l() {
        m().k();
    }

    public ivas.gov.bisp.enumeration.p087j.a m() {
        if (this.f2o == null) {
            OooOO0<WeakReference<ivas.gov.bisp.enumeration.p087j.a>> oooOO0 = ivas.gov.bisp.enumeration.p087j.a.c;
            this.f2o = new LayoutInflaterFactory2C0312o(this, null, this, this);
        }
        return this.f2o;
    }

    public Intent n() {
        return f.b(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m().l(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m().o();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intentB;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        z zVarJ = j();
        if (menuItem.getItemId() == 16908332 && zVarJ != null && (zVarJ.g() & 4) != 0 && (intentB = f.b(this)) != null) {
            if (!shouldUpRecreateTask(intentB)) {
                navigateUpTo(intentB);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentN = n();
            if (intentN == null) {
                intentN = f.b(this);
            }
            if (intentN != null) {
                ComponentName component = intentN.getComponent();
                if (component == null) {
                    component = intentN.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent intentC = f.c(this, component);
                    while (intentC != null) {
                        arrayList.add(size, intentC);
                        intentC = f.c(this, intentC.getComponent());
                    }
                    arrayList.add(intentN);
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e);
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            Object obj = l.c;
            l.aUF.b(this, intentArr, null);
            try {
                int i2 = k.d;
                finishAffinity();
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m().n(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m().p();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        m().s();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        m().r();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m().y(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        z zVarJ = j();
        if (getWindow().hasFeature(0)) {
            if (zVarJ == null || !zVarJ.m()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        g();
        m().u(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        m().z(i);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        g();
        m().w(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g();
        m().x(view, layoutParams);
    }
}
