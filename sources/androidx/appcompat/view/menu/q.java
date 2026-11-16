package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes.dex */
public abstract class q implements p {
    public m a;
    public Context b;
    public Context c;
    public n d;
    public p.aIX e;
    public LayoutInflater f;
    public int g;
    public int h;
    public int i;

    public q(Context context, int i, int i2) {
        this.b = context;
        this.f = LayoutInflater.from(context);
        this.g = i;
        this.h = i2;
    }

    @Override // androidx.appcompat.view.menu.p
    public int c() {
        return this.i;
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean h(n nVar, u uVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean o(n nVar, u uVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.p
    public void p(p.aIX aix) {
        this.e = aix;
    }
}
