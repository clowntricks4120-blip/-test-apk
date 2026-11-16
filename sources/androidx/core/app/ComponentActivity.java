package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.c;
import ivas.gov.bisp.enumeration.OooOOoo.OooOOOO;
import ivas.gov.bisp.enumeration.p001aa.t;
import ivas.gov.bisp.enumeration.p027b.d;
import ivas.gov.bisp.enumeration.p081d.e;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends Activity implements d, e.aIl {
    public OooOOOO<Class<? extends OooO00o>, OooO00o> a = new t();
    public c b = new c(this);

    @Deprecated
    public static class OooO00o {
    }

    @Override // ivas.gov.bisp.enumeration.d.e.aIl
    public boolean a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !e.b(decorView, keyEvent)) {
            return e.c(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !e.b(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    public androidx.lifecycle.d getLifecycle() {
        return this.b;
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ReportFragment.c(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        c cVar = this.b;
        androidx.lifecycle.d.aMa ama = androidx.lifecycle.d.aMa.CREATED;
        cVar.i("markState");
        cVar.i("setCurrentState");
        cVar.k(ama);
        super.onSaveInstanceState(bundle);
    }
}
