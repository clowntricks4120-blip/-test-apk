package ivas.gov.bisp.enumeration.p097r;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.n;
import ivas.gov.bisp.enumeration.OooOO0o.OooOo00$OooO0OO;
import ivas.gov.bisp.enumeration.p081d.c;
import ivas.gov.bisp.enumeration.p092o.r;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class u extends t implements MenuItem {
    private static int a = 1;
    private static int b;
    public final r f;
    public Method g;

    public class aRq extends c {
        private static int a = 1;
        private static int b;
        public final ActionProvider d;

        public aRq(Context context, ActionProvider actionProvider) {
            super(context);
            this.d = actionProvider;
        }

        @Override // ivas.gov.bisp.enumeration.p081d.c
        public boolean c() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 5;
            int i4 = -(-((i2 ^ 5) | i3));
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            if (i5 % 2 != 0) {
                this.d.hasSubMenu();
                throw null;
            }
            boolean zHasSubMenu = this.d.hasSubMenu();
            int i6 = a;
            int i7 = i6 & 51;
            int i8 = (((i6 | 51) & (~i7)) - (~(-(-(i7 << 1))))) - 1;
            b = i8 % 128;
            int i9 = i8 % 2;
            return zHasSubMenu;
        }

        @Override // ivas.gov.bisp.enumeration.p081d.c
        public View e() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 123;
            int i4 = i3 + ((i2 ^ 123) | i3);
            b = i4 % 128;
            int i5 = i4 % 2;
            View viewOnCreateActionView = this.d.onCreateActionView();
            int i6 = a;
            int i7 = i6 & 121;
            int i8 = i7 + ((i6 ^ 121) | i7);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                return viewOnCreateActionView;
            }
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.p081d.c
        public void g(SubMenu subMenu) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 9;
            int i4 = -(-((i2 ^ 9) | i3));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            this.d.onPrepareSubMenu(u.this.d(subMenu));
            int i7 = a;
            int i8 = (i7 & 47) + (i7 | 47);
            b = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
        }

        @Override // ivas.gov.bisp.enumeration.p081d.c
        public boolean h() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 97;
            int i4 = -(-((i2 ^ 97) | i3));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            boolean zOnPerformDefaultAction = this.d.onPerformDefaultAction();
            int i7 = b;
            int i8 = i7 & 89;
            int i9 = ((i7 | 89) & (~i8)) + (i8 << 1);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 84 / 0;
            }
            return zOnPerformDefaultAction;
        }
    }

    public class aRs implements MenuItem.OnActionExpandListener {
        private static int a = 1;
        private static int b;
        public final MenuItem.OnActionExpandListener c;

        public aRs(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.c = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            int i = 2 % 2;
            int i2 = b + 23;
            a = i2 % 128;
            int i3 = i2 % 2;
            boolean zOnMenuItemActionCollapse = this.c.onMenuItemActionCollapse(u.this.c(menuItem));
            int i4 = a;
            int i5 = i4 & 63;
            int i6 = -(-((i4 ^ 63) | i5));
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            b = i7 % 128;
            if (i7 % 2 == 0) {
                return zOnMenuItemActionCollapse;
            }
            throw null;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 ^ 61) + ((i2 & 61) << 1);
            b = i3 % 128;
            int i4 = i3 % 2;
            boolean zOnMenuItemActionExpand = this.c.onMenuItemActionExpand(u.this.c(menuItem));
            int i5 = a;
            int i6 = i5 & 99;
            int i7 = i6 + ((i5 ^ 99) | i6);
            b = i7 % 128;
            if (i7 % 2 == 0) {
                return zOnMenuItemActionExpand;
            }
            throw null;
        }
    }

    public class aRt implements MenuItem.OnMenuItemClickListener {
        private static int a = 0;
        private static int b = 1;
        public final MenuItem.OnMenuItemClickListener c;

        public aRt(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.c = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 89;
            int i4 = ((i2 | 89) & (~i3)) + (i3 << 1);
            b = i4 % 128;
            int i5 = i4 % 2;
            MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.c;
            if (i5 != 0) {
                return onMenuItemClickListener.onMenuItemClick(u.this.c(menuItem));
            }
            boolean zOnMenuItemClick = onMenuItemClickListener.onMenuItemClick(u.this.c(menuItem));
            int i6 = 98 / 0;
            return zOnMenuItemClick;
        }
    }

    public u(Context context, r rVar) {
        super(context);
        if (rVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f = rVar;
        int i = b;
        int i2 = i & 55;
        int i3 = (((i | 55) & (~i2)) - (~(i2 << 1))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 100) << 1) - (i2 ^ 100)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        boolean zCollapseActionView = this.f.collapseActionView();
        int i5 = a + 19;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 32 / 0;
        }
        return zCollapseActionView;
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 111;
        int i4 = ((i2 ^ 111) | i3) << 1;
        int i5 = -((i2 | 111) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        boolean zExpandActionView = this.f.expandActionView();
        int i8 = a;
        int i9 = ((i8 & 80) + (i8 | 80)) - 1;
        b = i9 % 128;
        int i10 = i9 % 2;
        return zExpandActionView;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 103;
        int i4 = (((i2 | 103) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            boolean z = this.f.e() instanceof aRq;
            throw null;
        }
        c cVarE = this.f.e();
        if (!(cVarE instanceof aRq)) {
            int i5 = b;
            int i6 = (i5 ^ 57) + ((i5 & 57) << 1);
            a = i6 % 128;
            if (i6 % 2 != 0) {
                return null;
            }
            throw null;
        }
        ActionProvider actionProvider = ((aRq) cVarE).d;
        int i7 = a;
        int i8 = (((i7 & (-112)) | ((~i7) & 111)) - (~(-(-((i7 & 111) << 1))))) - 1;
        b = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 53 / 0;
        }
        return actionProvider;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 75;
        int i4 = -(-((i2 ^ 75) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        r rVar = this.f;
        if (i6 != 0) {
            return rVar.getAlphabeticModifiers();
        }
        rVar.getAlphabeticModifiers();
        throw null;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 67;
        int i4 = ((i2 ^ 67) | i3) << 1;
        int i5 = -((i2 | 67) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        char alphabeticShortcut = this.f.getAlphabeticShortcut();
        if (i7 != 0) {
            int i8 = 3 / 0;
        }
        return alphabeticShortcut;
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        int i = 2 % 2;
        int i2 = b + 99;
        a = i2 % 128;
        int i3 = i2 % 2;
        r rVar = this.f;
        if (i3 != 0) {
            return rVar.getContentDescription();
        }
        rVar.getContentDescription();
        throw null;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 17;
        int i4 = ((i2 ^ 17) | i3) << 1;
        int i5 = -((i2 | 17) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        int groupId = this.f.getGroupId();
        int i8 = b;
        int i9 = i8 & 61;
        int i10 = (i8 | 61) & (~i9);
        int i11 = -(-(i9 << 1));
        int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
        a = i12 % 128;
        int i13 = i12 % 2;
        return groupId;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 98) + (i2 | 98)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        Drawable icon = this.f.getIcon();
        int i5 = a + 63;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return icon;
        }
        throw null;
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 117) + ((i2 & 117) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        ColorStateList iconTintList = this.f.getIconTintList();
        int i5 = b + 27;
        a = i5 % 128;
        int i6 = i5 % 2;
        return iconTintList;
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 19;
        int i4 = (((i2 | 19) & (~i3)) - (~(i3 << 1))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        PorterDuff.Mode iconTintMode = this.f.getIconTintMode();
        int i6 = b;
        int i7 = i6 ^ 51;
        int i8 = ((i6 & 51) | i7) << 1;
        int i9 = -i7;
        int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
        a = i10 % 128;
        int i11 = i10 % 2;
        return iconTintMode;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 58) + ((i2 & 58) << 1);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            this.f.getIntent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intent intent = this.f.getIntent();
        int i5 = b;
        int i6 = (((i5 ^ 41) | (i5 & 41)) << 1) - (((~i5) & 41) | (i5 & (-42)));
        a = i6 % 128;
        int i7 = i6 % 2;
        return intent;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 119;
        int i4 = (i2 | 119) & (~i3);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        int itemId = this.f.getItemId();
        if (i7 == 0) {
            int i8 = 87 / 0;
        }
        return itemId;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - ((((i2 | 106) << 1) - (i2 ^ 106)) ^ (-1));
        b = i3 % 128;
        int i4 = i3 % 2;
        ContextMenu.ContextMenuInfo menuInfo = this.f.getMenuInfo();
        int i5 = a;
        int i6 = ((i5 ^ 30) + ((i5 & 30) << 1)) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        return menuInfo;
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 71) + (i2 | 71);
        a = i3 % 128;
        int i4 = i3 % 2;
        int numericModifiers = this.f.getNumericModifiers();
        int i5 = a;
        int i6 = (i5 ^ 125) + ((i5 & 125) << 1);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 38 / 0;
        }
        return numericModifiers;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-58)) | ((~i2) & 57);
        int i4 = (i2 & 57) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        char numericShortcut = this.f.getNumericShortcut();
        int i7 = a;
        int i8 = i7 & 51;
        int i9 = ((i7 ^ 51) | i8) << 1;
        int i10 = -((i7 | 51) & (~i8));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        b = i11 % 128;
        int i12 = i11 % 2;
        return numericShortcut;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 26) << 1) - (i2 ^ 26)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        int order = this.f.getOrder();
        int i5 = b;
        int i6 = i5 ^ 111;
        int i7 = ((((i5 & 111) | i6) << 1) - (~(-i6))) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
        return order;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 27) << 1;
        int i4 = -(((~i2) & 27) | (i2 & (-28)));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        SubMenu subMenuD = d(this.f.getSubMenu());
        int i7 = b;
        int i8 = i7 & 91;
        int i9 = ((((i7 ^ 91) | i8) << 1) - (~(-((i7 | 91) & (~i8))))) - 1;
        a = i9 % 128;
        int i10 = i9 % 2;
        return subMenuD;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        int i = 2 % 2;
        int i2 = b + 111;
        a = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.f.getTitle();
            obj.hashCode();
            throw null;
        }
        CharSequence title = this.f.getTitle();
        int i3 = a;
        int i4 = i3 ^ 69;
        int i5 = -(-((i3 & 69) << 1));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            return title;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 38) + (i2 | 38)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        CharSequence titleCondensed = this.f.getTitleCondensed();
        int i5 = b;
        int i6 = ((i5 & (-100)) | ((~i5) & 99)) + ((i5 & 99) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        return titleCondensed;
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 107) + ((i2 & 107) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        r rVar = this.f;
        if (i4 != 0) {
            return rVar.getTooltipText();
        }
        rVar.getTooltipText();
        throw null;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 49) + ((i2 & 49) << 1);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            this.f.hasSubMenu();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zHasSubMenu = this.f.hasSubMenu();
        int i4 = b;
        int i5 = (i4 | 119) << 1;
        int i6 = -(i4 ^ 119);
        int i7 = (i5 & i6) + (i6 | i5);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 81 / 0;
        }
        return zHasSubMenu;
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        int i = 2 % 2;
        int i2 = (-2) - ((a + 6) ^ (-1));
        b = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsActionViewExpanded = this.f.isActionViewExpanded();
        int i4 = b + 53;
        a = i4 % 128;
        int i5 = i4 % 2;
        return zIsActionViewExpanded;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 63;
        int i4 = (i2 ^ 63) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        r rVar = this.f;
        if (i6 != 0) {
            return rVar.isCheckable();
        }
        rVar.isCheckable();
        throw null;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        int i = 2 % 2;
        int i2 = b + 93;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            this.f.isChecked();
            throw null;
        }
        boolean zIsChecked = this.f.isChecked();
        int i3 = b;
        int i4 = (i3 & 59) + (i3 | 59);
        a = i4 % 128;
        if (i4 % 2 != 0) {
            return zIsChecked;
        }
        throw null;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 52) + ((i2 & 52) << 1)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        r rVar = this.f;
        if (i4 == 0) {
            return rVar.isEnabled();
        }
        rVar.isEnabled();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        boolean zIsVisible;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 123;
        int i4 = ((i2 & 123) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            zIsVisible = this.f.isVisible();
            int i7 = 17 / 0;
        } else {
            zIsVisible = this.f.isVisible();
        }
        int i8 = b + 69;
        a = i8 % 128;
        int i9 = i8 % 2;
        return zIsVisible;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        int i = 2 % 2;
        aRr arr = new aRr(this, this.c, actionProvider);
        int i2 = b;
        int i3 = i2 & 87;
        int i4 = (i2 ^ 87) | i3;
        int i5 = (i3 & i4) + (i3 | i4);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        r rVar = this.f;
        if (actionProvider != null) {
            int i8 = (-2) - (((i6 & 126) + (i6 | 126)) ^ (-1));
            b = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 74 / 0;
            }
        } else {
            int i10 = i2 & 107;
            int i11 = i10 + ((i2 ^ 107) | i10);
            a = i11 % 128;
            int i12 = i11 % 2;
            arr = null;
        }
        rVar.b(arr);
        int i13 = b;
        int i14 = ((i13 | 115) << 1) - (i13 ^ 115);
        a = i14 % 128;
        int i15 = i14 % 2;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 64) << 1) - (i2 ^ 64);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            this.f.setAlphabeticShortcut(c);
            throw null;
        }
        this.f.setAlphabeticShortcut(c);
        int i5 = b;
        int i6 = (i5 ^ 109) + ((i5 & 109) << 1);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            return this;
        }
        throw null;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 99) + ((i2 & 99) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        this.f.setCheckable(z);
        int i5 = a;
        int i6 = (i5 | 55) << 1;
        int i7 = -(i5 ^ 55);
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        int i9 = i8 % 2;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 85;
        int i4 = ((i2 & 85) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        this.f.setChecked(z);
        int i8 = b;
        int i9 = i8 & 25;
        int i10 = (i8 ^ 25) | i9;
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        a = i11 % 128;
        int i12 = i11 % 2;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = a + 87;
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.f.setContentDescription(charSequence);
            throw null;
        }
        this.f.setContentDescription(charSequence);
        int i3 = a + 113;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            return this;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 33;
        int i4 = (i2 ^ 33) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        this.f.setEnabled(z);
        int i7 = b;
        int i8 = i7 ^ 49;
        int i9 = ((i7 & 49) | i8) << 1;
        int i10 = -i8;
        int i11 = (i9 & i10) + (i9 | i10);
        a = i11 % 128;
        int i12 = i11 % 2;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 89) + (i2 | 89);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            this.f.setIcon(drawable);
            return this;
        }
        this.f.setIcon(drawable);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 57;
        int i4 = ((i2 | 57) & (~i3)) + (i3 << 1);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            this.f.setIconTintList(colorStateList);
            int i5 = 22 / 0;
        } else {
            this.f.setIconTintList(colorStateList);
        }
        int i6 = b;
        int i7 = i6 ^ 33;
        int i8 = ((i6 & 33) | i7) << 1;
        int i9 = -i7;
        int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
        a = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 70 / 0;
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        int i = 2 % 2;
        int i2 = b + 99;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            this.f.setIconTintMode(mode);
            int i3 = 35 / 0;
        } else {
            this.f.setIconTintMode(mode);
        }
        int i4 = a;
        int i5 = i4 & 93;
        int i6 = (i4 | 93) & (~i5);
        int i7 = -(-(i5 << 1));
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 74 / 0;
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 10) << 1) - (i2 ^ 10)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.f.setIntent(intent);
        int i5 = a;
        int i6 = ((i5 | 105) << 1) - (i5 ^ 105);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 57 / 0;
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((((i2 ^ 125) | (i2 & 125)) << 1) - (~(-(((~i2) & 125) | (i2 & (-126)))))) - 1;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            this.f.setNumericShortcut(c);
            throw null;
        }
        this.f.setNumericShortcut(c);
        int i4 = a + 11;
        b = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 3) + (i2 | 3);
        b = i3 % 128;
        int i4 = i3 % 2;
        this.f.setShortcut(c, c2);
        int i5 = b;
        int i6 = (i5 & 55) + (i5 | 55);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        int i9 = i7 & 47;
        int i10 = -(-((i7 ^ 47) | i9));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        b = i11 % 128;
        if (i11 % 2 == 0) {
            return this;
        }
        throw null;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 & 5) - (~(-(-(i3 | 5))))) - 1;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            this.f.setShowAsAction(i);
            throw null;
        }
        this.f.setShowAsAction(i);
        int i5 = b + 87;
        a = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 ^ 37) + ((i3 & 37) << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.f.setShowAsActionFlags(i);
        int i6 = a;
        int i7 = i6 & 109;
        int i8 = ((((i6 ^ 109) | i7) << 1) - (~(-((i6 | 109) & (~i7))))) - 1;
        b = i8 % 128;
        if (i8 % 2 == 0) {
            return this;
        }
        throw null;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 75;
        int i4 = -(-((i2 ^ 75) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        this.f.setTitle(charSequence);
        int i7 = a;
        int i8 = (-2) - (((i7 ^ 44) + ((i7 & 44) << 1)) ^ (-1));
        b = i8 % 128;
        int i9 = i8 % 2;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-120)) | ((~i2) & 119);
        int i4 = (i2 & 119) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.f.setTitleCondensed(charSequence);
        int i7 = b + 97;
        a = i7 % 128;
        int i8 = i7 % 2;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 51) + (i2 | 51);
        a = i3 % 128;
        int i4 = i3 % 2;
        this.f.setTooltipText(charSequence);
        if (i4 != 0) {
            return this;
        }
        throw null;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 105;
        int i4 = (i2 & 105) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        MenuItem visible = this.f.setVisible(z);
        if (i6 != 0) {
            int i7 = 54 / 0;
        }
        int i8 = b;
        int i9 = (i8 & 53) + (i8 | 53);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 37 / 0;
        }
        return visible;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 23) - (~(-(-((i2 & 23) << 1))))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        View actionView = this.f.getActionView();
        int i5 = a;
        int i6 = ((i5 ^ 113) | (i5 & 113)) << 1;
        int i7 = -(((~i5) & 113) | (i5 & (-114)));
        int i8 = (i6 & i7) + (i7 | i6);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            boolean z = actionView instanceof OooOo00$OooO0OO;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (actionView instanceof OooOo00$OooO0OO) {
            actionView = (View) ((OooOo00$OooO0OO) actionView).c;
            int i9 = a;
            int i10 = (i9 | 121) << 1;
            int i11 = -(i9 ^ 121);
            int i12 = (i10 & i11) + (i11 | i10);
            b = i12 % 128;
            int i13 = i12 % 2;
        }
        int i14 = b;
        int i15 = (i14 & (-98)) | ((~i14) & 97);
        int i16 = -(-((i14 & 97) << 1));
        int i17 = (i15 & i16) + (i16 | i15);
        a = i17 % 128;
        if (i17 % 2 == 0) {
            int i18 = 87 / 0;
        }
        return actionView;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 35) << 1;
        int i4 = -(((~i2) & 35) | (i2 & (-36)));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        if (view instanceof CollapsibleActionView) {
            OooOo00$OooO0OO oooOo00$OooO0OO = new OooOo00$OooO0OO(view);
            int i7 = a;
            int i8 = i7 & 23;
            int i9 = (i7 | 23) & (~i8);
            int i10 = i8 << 1;
            int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
            b = i11 % 128;
            int i12 = i11 % 2;
            view = oooOo00$OooO0OO;
        }
        this.f.setActionView(view);
        int i13 = a;
        int i14 = i13 & 107;
        int i15 = (((i13 | 107) & (~i14)) - (~(i14 << 1))) - 1;
        b = i15 % 128;
        int i16 = i15 % 2;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 109;
        int i5 = -(-(i3 | 109));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        this.f.setAlphabeticShortcut(c, i);
        int i8 = b;
        int i9 = i8 & 61;
        int i10 = -(-((i8 ^ 61) | i9));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        a = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 61 / 0;
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 ^ 63;
        int i5 = (i3 & 63) << 1;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        this.f.setIcon(i);
        int i8 = a;
        int i9 = (((i8 & (-48)) | ((~i8) & 47)) - (~(-(-((i8 & 47) << 1))))) - 1;
        b = i9 % 128;
        int i10 = i9 % 2;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 109;
        int i5 = (i4 - (~((i3 ^ 109) | i4))) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        this.f.setNumericShortcut(c, i);
        int i7 = a;
        int i8 = i7 & 35;
        int i9 = ((i7 | 35) & (~i8)) + (i8 << 1);
        int i10 = i9 % 128;
        b = i10;
        if (i9 % 2 != 0) {
            throw null;
        }
        int i11 = ((i10 ^ 90) + ((i10 & 90) << 1)) - 1;
        a = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 94 / 0;
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 13) + (i2 | 13);
        int i4 = i3 % 128;
        b = i4;
        aRs ars = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        r rVar = this.f;
        if (onActionExpandListener != null) {
            ars = new aRs(onActionExpandListener);
            int i5 = a;
            int i6 = (i5 & 54) + (i5 | 54);
            int i7 = (i6 ^ (-1)) + (i6 << 1);
            b = i7 % 128;
            int i8 = i7 % 2;
        } else {
            int i9 = i4 & 115;
            int i10 = -(-((i4 ^ 115) | i9));
            int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
            a = i11 % 128;
            int i12 = i11 % 2;
        }
        rVar.setOnActionExpandListener(ars);
        int i13 = a;
        int i14 = ((i13 ^ 21) - (~((i13 & 21) << 1))) - 1;
        b = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 20 / 0;
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        aRt art;
        int i = 2 % 2;
        int i2 = (-2) - ((a + 82) ^ (-1));
        int i3 = i2 % 128;
        b = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        r rVar = this.f;
        if (onMenuItemClickListener != null) {
            art = new aRt(onMenuItemClickListener);
            int i4 = a + 108;
            int i5 = (i4 ^ (-1)) + (i4 << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
        } else {
            int i7 = i3 & 83;
            int i8 = -(-((i3 ^ 83) | i7));
            int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
            a = i9 % 128;
            int i10 = i9 % 2;
            art = null;
        }
        rVar.setOnMenuItemClickListener(art);
        int i11 = a;
        int i12 = ((i11 & 69) - (~(i11 | 69))) - 1;
        b = i12 % 128;
        if (i12 % 2 == 0) {
            return this;
        }
        throw null;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 15;
        int i6 = (((i4 | 15) & (~i5)) - (~(i5 << 1))) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        this.f.setShortcut(c, c2, i, i2);
        int i8 = a;
        int i9 = (i8 & 81) + (i8 | 81);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            return this;
        }
        throw null;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 & 118) + (i3 | 118)) - 1;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            this.f.setTitle(i);
            throw null;
        }
        this.f.setTitle(i);
        int i5 = a;
        int i6 = i5 ^ 103;
        int i7 = -(-((i5 & 103) << 1));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        int i9 = i8 % 2;
        return this;
    }

    public class aRr extends aRq implements ActionProvider.VisibilityListener {
        private static int a = 1;
        private static int b;
        public c.aJa f;

        public aRr(u uVar, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // ivas.gov.bisp.enumeration.p081d.c
        public boolean d() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 3;
            int i4 = (i3 - (~((i2 ^ 3) | i3))) - 1;
            a = i4 % 128;
            int i5 = i4 % 2;
            boolean zIsVisible = this.d.isVisible();
            if (i5 == 0) {
                int i6 = 32 / 0;
            }
            int i7 = a;
            int i8 = i7 & 89;
            int i9 = (i7 | 89) & (~i8);
            int i10 = i8 << 1;
            int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
            b = i11 % 128;
            if (i11 % 2 == 0) {
                return zIsVisible;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.p081d.c
        public View f(MenuItem menuItem) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 ^ 61) | (i2 & 61)) << 1) - (((~i2) & 61) | (i2 & (-62)));
            a = i3 % 128;
            int i4 = i3 % 2;
            View viewOnCreateActionView = this.d.onCreateActionView(menuItem);
            int i5 = b;
            int i6 = (((i5 & (-112)) | ((~i5) & 111)) - (~((i5 & 111) << 1))) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
            return viewOnCreateActionView;
        }

        @Override // ivas.gov.bisp.enumeration.p081d.c
        public boolean i() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (((i2 | 118) << 1) - (i2 ^ 118)) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            ActionProvider actionProvider = this.d;
            if (i4 == 0) {
                return actionProvider.overridesItemVisibility();
            }
            actionProvider.overridesItemVisibility();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.p081d.c
        public void j(c.aJa aja) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 ^ 69) + ((i2 & 69) << 1);
            b = i3 % 128;
            int i4 = i3 % 2;
            this.f = aja;
            this.d.setVisibilityListener(this);
            int i5 = a;
            int i6 = i5 & 123;
            int i7 = i6 + ((i5 ^ 123) | i6);
            b = i7 % 128;
            int i8 = i7 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0046  */
        /* JADX WARN: Code duplicated, block: B:12:0x004c  */
        /* JADX WARN: Code duplicated, block: B:9:0x0020 A[PHI: r1
  0x0020: PHI (r1v4 ivas.gov.bisp.enumeration.d.c$aJa) = (r1v3 ivas.gov.bisp.enumeration.d.c$aJa), (r1v13 ivas.gov.bisp.enumeration.d.c$aJa) binds: [B:8:0x001e, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            c.aJa aja;
            n nVar;
            int i;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = (i3 ^ 71) + ((i3 & 71) << 1);
            b = i4 % 128;
            if (i4 % 2 != 0) {
                aja = this.f;
                int i5 = 25 / 0;
                if (aja != null) {
                    int i6 = i3 + 32;
                    int i7 = (i6 ^ (-1)) + (i6 << 1);
                    b = i7 % 128;
                    int i8 = i7 % 2;
                    nVar = androidx.appcompat.view.menu.u.this.m;
                    int i9 = a;
                    int i10 = i9 & 95;
                    int i11 = (i9 | 95) & (~i10);
                    int i12 = i10 << 1;
                    i = ((i11 | i12) << 1) - (i11 ^ i12);
                    b = i % 128;
                    if (i % 2 != 0) {
                        nVar.j = true;
                        nVar.r(false);
                    } else {
                        nVar.j = true;
                        nVar.r(true);
                    }
                    int i13 = b + 49;
                    a = i13 % 128;
                    int i14 = i13 % 2;
                }
            } else {
                aja = this.f;
                if (aja != null) {
                    int i15 = i3 + 32;
                    int i16 = (i15 ^ (-1)) + (i15 << 1);
                    b = i16 % 128;
                    int i17 = i16 % 2;
                    nVar = androidx.appcompat.view.menu.u.this.m;
                    int i18 = a;
                    int i19 = i18 & 95;
                    int i110 = (i18 | 95) & (~i19);
                    int i111 = i19 << 1;
                    i = ((i110 | i111) << 1) - (i110 ^ i111);
                    b = i % 128;
                    if (i % 2 != 0) {
                        nVar.j = true;
                        nVar.r(false);
                    } else {
                        nVar.j = true;
                        nVar.r(true);
                    }
                    int i112 = b + 49;
                    a = i112 % 128;
                    int i113 = i112 % 2;
                }
            }
            int i20 = a;
            int i21 = i20 & 5;
            int i22 = -(-(i20 | 5));
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            b = i23 % 128;
            if (i23 % 2 != 0) {
                int i24 = 51 / 0;
            }
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 57;
        int i5 = ((i3 | 57) & (~i4)) + (i4 << 1);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            this.f.setActionView(i);
            throw null;
        }
        this.f.setActionView(i);
        View actionView = this.f.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f.setActionView(new OooOo00$OooO0OO(actionView));
            int i6 = b;
            int i7 = i6 & 81;
            int i8 = (i6 ^ 81) | i7;
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
        }
        int i10 = b;
        int i11 = ((i10 ^ 21) | (i10 & 21)) << 1;
        int i12 = -(((~i10) & 21) | (i10 & (-22)));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        a = i13 % 128;
        int i14 = i13 % 2;
        return this;
    }
}
