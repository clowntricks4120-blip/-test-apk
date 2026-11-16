package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class w extends n implements SubMenu {
    public u A;
    public n z;

    public w(Context context, n nVar, u uVar) {
        super(context);
        this.z = nVar;
        this.A = uVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean g(u uVar) {
        return this.z.g(uVar);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.A;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean h(u uVar) {
        return this.z.h(uVar);
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean i(n nVar, MenuItem menuItem) {
        return super.i(nVar, menuItem) || this.z.i(nVar, menuItem);
    }

    @Override // androidx.appcompat.view.menu.n
    public String l() {
        u uVar = this.A;
        int i = uVar != null ? uVar.b : 0;
        if (i == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("android:menu:actionviewstates");
        sb.append(":");
        sb.append(i);
        return sb.toString();
    }

    @Override // androidx.appcompat.view.menu.n
    public n m() {
        return this.z.m();
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean o() {
        return this.z.o();
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean p() {
        return this.z.p();
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean q() {
        return this.z.q();
    }

    @Override // androidx.appcompat.view.menu.n, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        z(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        z(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        z(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.n, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        z(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        z(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }
}
