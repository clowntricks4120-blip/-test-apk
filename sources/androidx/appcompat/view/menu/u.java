package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ivas.gov.bisp.enumeration.Y.A;
import ivas.gov.bisp.enumeration.p092o.r;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class u implements r {
    public ivas.gov.bisp.enumeration.p081d.c A;
    public MenuItem.OnActionExpandListener C;
    public ContextMenu.ContextMenuInfo D;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public CharSequence f;
    public CharSequence g;
    public Intent h;
    public char i;
    public char j;
    public Drawable l;
    public n m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public w f7o;
    public MenuItem.OnMenuItemClickListener p;
    public CharSequence q;
    public CharSequence r;
    public View y;
    public int z;
    public int a = 4096;
    public int k = 4096;
    public int n = 0;
    public ColorStateList s = null;
    public PorterDuff.Mode v = null;
    public boolean u = false;
    public boolean w = false;
    public boolean x = false;
    public int t = 16;
    public boolean B = false;

    public class aJd implements ivas.gov.bisp.enumeration.d.c.aJa {
        public aJd() {
        }
    }

    public u(n nVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.m = nVar;
        this.b = i2;
        this.c = i;
        this.d = i3;
        this.e = i4;
        this.g = charSequence;
        this.z = i5;
    }

    public static void c(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r
    public final r b(ivas.gov.bisp.enumeration.p081d.c cVar) {
        ivas.gov.bisp.enumeration.p081d.c cVar2 = this.A;
        if (cVar2 != null) {
            cVar2.c = null;
        }
        this.y = null;
        this.A = cVar;
        this.m.r(true);
        ivas.gov.bisp.enumeration.p081d.c cVar3 = this.A;
        if (cVar3 != null) {
            cVar3.j(new aJd());
        }
        return this;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.z & 8) == 0) {
            return false;
        }
        if (this.y == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.m.g(this);
        }
        return false;
    }

    public final r d(View view) {
        int i;
        this.y = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i = this.b) > 0) {
            view.setId(i);
        }
        n nVar = this.m;
        nVar.l = true;
        nVar.r(true);
        return this;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r
    public final ivas.gov.bisp.enumeration.p081d.c e() {
        return this.A;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public final boolean expandActionView() {
        if (!h()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.m.h(this);
        }
        return false;
    }

    public final Drawable g(Drawable drawable) {
        if (drawable != null && this.x && (this.u || this.w)) {
            drawable = drawable.mutate();
            if (this.u) {
                drawable.setTintList(this.s);
            }
            if (this.w) {
                drawable.setTintMode(this.v);
            }
            this.x = false;
        }
        return drawable;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public final View getActionView() {
        View view = this.y;
        if (view != null) {
            return view;
        }
        ivas.gov.bisp.enumeration.p081d.c cVar = this.A;
        if (cVar == null) {
            return null;
        }
        View viewF = cVar.f(this);
        this.y = viewF;
        return viewF;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.r;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.l;
        if (drawable != null) {
            return g(drawable);
        }
        int i = this.n;
        if (i == 0) {
            return null;
        }
        Drawable drawableC = A.c(this.m.c, i);
        this.n = 0;
        this.l = drawableC;
        return g(drawableC);
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.s;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.v;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.h;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.b;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.D;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.d;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f7o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        return charSequence == null ? this.g : charSequence;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.q;
    }

    public final boolean h() {
        ivas.gov.bisp.enumeration.p081d.c cVar;
        if ((this.z & 8) == 0) {
            return false;
        }
        if (this.y == null && (cVar = this.A) != null) {
            this.y = cVar.f(this);
        }
        return this.y != null;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f7o != null;
    }

    public final char i() {
        return this.m.o() ? this.j : this.i;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.B;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.t & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.t & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ivas.gov.bisp.enumeration.p081d.c cVar = this.A;
        if (cVar == null || !cVar.i()) {
            return (this.t & 8) == 0;
        }
        return (this.t & 8) == 0 && this.A.d();
    }

    public final boolean j() {
        return (this.t & 32) == 32;
    }

    public final boolean k() {
        return (this.t & 4) != 0;
    }

    public final void l(boolean z) {
        int i = this.t;
        int i2 = (z ? 2 : 0) | (i & (-3));
        this.t = i2;
        if (i != i2) {
            this.m.r(false);
        }
    }

    public final void m(boolean z) {
        this.t = (z ? 4 : 0) | (this.t & (-5));
    }

    public final void n(boolean z) {
        if (z) {
            this.t |= 32;
        } else {
            this.t &= -33;
        }
    }

    public final boolean o() {
        return this.m.q() && i() != 0;
    }

    public final boolean p(boolean z) {
        int i = this.t;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.t = i2;
        return i != i2;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public final /* synthetic */ MenuItem setActionView(View view) {
        d(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.j == c) {
            return this;
        }
        this.j = Character.toLowerCase(c);
        this.m.r(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.t;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.t = i2;
        if (i != i2) {
            this.m.r(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        if ((this.t & 4) != 0) {
            n nVar = this.m;
            Objects.requireNonNull(nVar);
            int groupId = getGroupId();
            int size = nVar.g.size();
            nVar.A();
            for (int i = 0; i < size; i++) {
                u uVar = nVar.g.get(i);
                if (uVar.c == groupId && uVar.k() && uVar.isCheckable()) {
                    uVar.l(uVar == this);
                }
            }
            nVar.v();
        } else {
            l(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.r = charSequence;
        this.m.r(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.t |= 16;
        } else {
            this.t &= -17;
        }
        this.m.r(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.n = 0;
        this.l = drawable;
        this.x = true;
        this.m.r(false);
        return this;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.s = colorStateList;
        this.u = true;
        this.x = true;
        this.m.r(false);
        return this;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.v = mode;
        this.w = true;
        this.x = true;
        this.m.r(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.h = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.i == c) {
            return this;
        }
        this.i = c;
        this.m.r(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.i = c;
        this.j = Character.toLowerCase(c2);
        this.m.r(false);
        return this;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.z = i;
        n nVar = this.m;
        nVar.l = true;
        nVar.r(true);
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.g = charSequence;
        this.m.r(false);
        w wVar = this.f7o;
        if (wVar != null) {
            wVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        this.m.r(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.q = charSequence;
        this.m.r(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        if (p(z)) {
            n nVar = this.m;
            nVar.j = true;
            nVar.r(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.g;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public final MenuItem setActionView(int i) {
        Context context = this.m.c;
        d(LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public final r setContentDescription(CharSequence charSequence) {
        this.r = charSequence;
        this.m.r(false);
        return this;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public final r setTooltipText(CharSequence charSequence) {
        this.q = charSequence;
        this.m.r(false);
        return this;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.j == c && this.k == i) {
            return this;
        }
        this.j = Character.toLowerCase(c);
        this.k = KeyEvent.normalizeMetaState(i);
        this.m.r(false);
        return this;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.i == c && this.a == i) {
            return this;
        }
        this.i = c;
        this.a = KeyEvent.normalizeMetaState(i);
        this.m.r(false);
        return this;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.i = c;
        this.a = KeyEvent.normalizeMetaState(i);
        this.j = Character.toLowerCase(c2);
        this.k = KeyEvent.normalizeMetaState(i2);
        this.m.r(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.l = null;
        this.n = i;
        this.x = true;
        this.m.r(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.m.c.getString(i));
        return this;
    }
}
