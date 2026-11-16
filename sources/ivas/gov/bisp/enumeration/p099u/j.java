package ivas.gov.bisp.enumeration.p099u;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public Object a;
    public boolean b;

    public interface aQr {
        boolean b(j jVar, Menu menu);

        void c(j jVar);

        boolean d(j jVar, Menu menu);

        boolean e(j jVar, MenuItem menuItem);
    }

    public abstract void c();

    public abstract void d();

    public abstract View e();

    public abstract MenuInflater f();

    public abstract Menu g();

    public abstract CharSequence h();

    public abstract CharSequence i();

    public abstract boolean j();

    public abstract void k(View view);

    public abstract void l(int i);

    public abstract void m(int i);

    public abstract void n(CharSequence charSequence);

    public abstract void o(CharSequence charSequence);

    public abstract void p(boolean z);
}
