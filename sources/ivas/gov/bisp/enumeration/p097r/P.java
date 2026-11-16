package ivas.gov.bisp.enumeration.p097r;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import ivas.gov.bisp.enumeration.p081d.c;
import ivas.gov.bisp.enumeration.p086i.l;
import ivas.gov.bisp.enumeration.p092o.r;

/* JADX INFO: loaded from: classes.dex */
public class P implements r {
    private static int a = 1;
    private static int b;
    public Context c;
    public CharSequence d;
    public CharSequence e;
    public Intent f;
    public char g;
    public char h;
    public Drawable k;
    public CharSequence l;
    public CharSequence m;
    public int i = 4096;
    public int j = 4096;
    public ColorStateList n = null;
    public PorterDuff.Mode p = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f109o = false;
    public boolean q = false;
    public int r = 16;

    public P(Context context, int i, int i2, int i3, CharSequence charSequence) {
        this.c = context;
        this.d = charSequence;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r
    public r b(c cVar) {
        int i = 2 % 2;
        throw new UnsupportedOperationException();
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public boolean collapseActionView() {
        int i = 2 % 2;
        int i2 = (-2) - ((a + 84) ^ (-1));
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        int i5 = ((((i3 ^ 53) | (i3 & 53)) << 1) - (~(-(((~i3) & 53) | (i3 & (-54)))))) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r
    public c e() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((((i2 ^ 5) | (i2 & 5)) << 1) - (~(-((i2 & (-6)) | ((~i2) & 5))))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 & 81;
        int i6 = (((i2 ^ 81) | i5) << 1) - ((i2 | 81) & (~i5));
        a = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public boolean expandActionView() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 53) + ((i2 & 53) << 1);
        a = i3 % 128;
        return i3 % 2 == 0;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        int i = 2 % 2;
        throw new UnsupportedOperationException();
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public View getActionView() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 81;
        int i4 = ((i2 | 81) & (~i3)) + (i3 << 1);
        int i5 = i4 % 128;
        b = i5;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i6 = (i5 ^ 111) + ((i5 & 111) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public int getAlphabeticModifiers() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 39;
        int i4 = -(-((i2 ^ 39) | i3));
        int i5 = (i3 & i4) + (i3 | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        int i7 = this.j;
        int i8 = ((i2 | 23) << 1) - (i2 ^ 23);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            return i7;
        }
        throw null;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 35;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        char c = this.h;
        int i4 = ((i2 & 30) + (i2 | 30)) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        return c;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public CharSequence getContentDescription() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 13) + ((i2 & 13) << 1);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            return this.l;
        }
        throw null;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 | 101) << 1;
        int i4 = -(i2 ^ 101);
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 17) + ((i2 & 17) << 1);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            return this.k;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public ColorStateList getIconTintList() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 29;
        int i4 = (((i2 | 29) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return this.n;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        int i = 2 % 2;
        int i2 = a + 105;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return this.p;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 93;
        int i4 = i3 + ((i2 ^ 93) | i3);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return this.f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-70)) | ((~i2) & 69);
        int i4 = -(-((i2 & 69) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        b = i6;
        if (i5 % 2 != 0) {
            int i7 = 92 / 0;
        }
        int i8 = i6 & 57;
        int i9 = (((i6 | 57) & (~i8)) - (~(i8 << 1))) - 1;
        a = i9 % 128;
        int i10 = i9 % 2;
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        int i = 2 % 2;
        int i2 = a + 7;
        int i3 = i2 % 128;
        b = i3;
        if (i2 % 2 != 0) {
            int i4 = 42 / 0;
        }
        int i5 = i3 + 112;
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public int getNumericModifiers() {
        int i = 2 % 2;
        int i2 = a + 85;
        int i3 = i2 % 128;
        b = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = this.i;
        int i5 = i3 & 37;
        int i6 = (((i3 | 37) & (~i5)) - (~(-(-(i5 << 1))))) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        return i4;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 21) << 1;
        int i4 = -(((~i2) & 21) | (i2 & (-22)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        char c = this.g;
        int i8 = i6 + 43;
        a = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 31 / 0;
        }
        return c;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 33;
        int i4 = (i2 | 33) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2 != 0 ? 1 : 0;
        int i9 = (i7 | 45) << 1;
        int i10 = -(i7 ^ 45);
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        a = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 6 / 0;
        }
        return i8;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        int i = 2 % 2;
        int i2 = a + 119;
        int i3 = i2 % 128;
        b = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = (i3 & 3) + (i3 | 3);
        a = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 5) << 1;
        int i4 = -((i2 & (-6)) | ((~i2) & 5));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        CharSequence charSequence = this.d;
        int i7 = ((i2 ^ 55) | (i2 & 55)) << 1;
        int i8 = -(((~i2) & 55) | (i2 & (-56)));
        int i9 = (i7 & i8) + (i8 | i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        return charSequence;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        int i = 2 % 2;
        int i2 = a + 91;
        int i3 = i2 % 128;
        b = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        CharSequence charSequence = this.e;
        if (charSequence == null) {
            charSequence = this.d;
            int i4 = i3 | 33;
            int i5 = i4 << 1;
            int i6 = -(i4 & (~(i3 & 33)));
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            a = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = (i3 ^ 114) + ((i3 & 114) << 1);
        int i10 = (i9 ^ (-1)) + (i9 << 1);
        a = i10 % 128;
        int i11 = i10 % 2;
        return charSequence;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public CharSequence getTooltipText() {
        int i = 2 % 2;
        int i2 = a + 85;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        CharSequence charSequence = this.m;
        int i5 = i3 + 3;
        a = i5 % 128;
        int i6 = i5 % 2;
        return charSequence;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 ^ 13) | (i2 & 13)) << 1) - ((i2 & (-14)) | ((~i2) & 13));
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = ((i2 & (-104)) | ((~i2) & 103)) + ((i2 & 103) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public boolean isActionViewExpanded() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-26)) | ((~i2) & 25);
        int i4 = -(-((i2 & 25) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        if ((r5.r & 1) == 0) goto L10;
     */
    @Override // android.view.MenuItem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isCheckable() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p097r.P.a
            r2 = r1 ^ 119(0x77, float:1.67E-43)
            r1 = r1 & 119(0x77, float:1.67E-43)
            r1 = r1 | r2
            r3 = 1
            int r1 = r1 << r3
            int r1 = r1 - r2
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.p097r.P.b = r2
            int r1 = r1 % r0
            r4 = 0
            if (r1 == 0) goto L1d
            int r1 = r5.r
            r1 = r1 & r3
            if (r1 != 0) goto L1b
            goto L22
        L1b:
            r3 = r4
            goto L2e
        L1d:
            int r1 = r5.r
            r1 = r1 & r3
            if (r1 != 0) goto L2e
        L22:
            r1 = r2 | 117(0x75, float:1.64E-43)
            int r1 = r1 << r3
            r2 = r2 ^ 117(0x75, float:1.64E-43)
            int r1 = r1 - r2
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.p097r.P.a = r2
            int r1 = r1 % r0
            goto L1b
        L2e:
            int r1 = ivas.gov.bisp.enumeration.p097r.P.a
            r2 = r1 & 95
            r1 = r1 ^ 95
            r1 = r1 | r2
            r4 = r2 & r1
            r1 = r1 | r2
            int r4 = r4 + r1
            int r1 = r4 % 128
            ivas.gov.bisp.enumeration.p097r.P.b = r1
            int r4 = r4 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p097r.P.isCheckable():boolean");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0040  */
    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    @Override // android.view.MenuItem
    public boolean isChecked() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 & (-34)) | ((~i2) & 33)) - (~((i2 & 33) << 1))) - 1;
        int i4 = i3 % 128;
        a = i4;
        boolean z = false;
        if (i3 % 2 == 0) {
            int i5 = this.r;
            int i6 = i5 & 4;
            if ((((i5 ^ 4) | i6) & (~i6)) != 0) {
                int i7 = ((i2 & (-66)) | ((~i2) & 65)) + ((i2 & 65) << 1);
                a = i7 % 128;
                z = i7 % 2 != 0;
            } else {
                int i8 = ((i4 | 11) << 1) - (i4 ^ 11);
                b = i8 % 128;
                int i9 = i8 % 2;
            }
        } else if ((this.r & 2) != 0) {
            int i10 = ((i2 & (-66)) | ((~i2) & 65)) + ((i2 & 65) << 1);
            a = i10 % 128;
            z = i10 % 2 != 0;
        } else {
            int i11 = ((i4 | 11) << 1) - (i4 ^ 11);
            b = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = b;
        int i14 = ((i13 & 60) + (i13 | 60)) - 1;
        a = i14 % 128;
        if (i14 % 2 != 0) {
            return z;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    @Override // android.view.MenuItem
    public boolean isEnabled() {
        boolean z;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 67;
        int i4 = (~i3) & (i2 | 67);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = this.r;
            if ((((~i7) & 88) | (i7 & (-89))) != 0) {
                int i8 = i2 + 51;
                b = i8 % 128;
                int i9 = i8 % 2;
                z = true;
            } else {
                int i10 = i2 + 61;
                b = i10 % 128;
                int i11 = i10 % 2;
                z = false;
            }
        } else if ((this.r & 16) != 0) {
            int i12 = i2 + 51;
            b = i12 % 128;
            int i13 = i12 % 2;
            z = true;
        } else {
            int i14 = i2 + 61;
            b = i14 % 128;
            int i15 = i14 % 2;
            z = false;
        }
        int i16 = b;
        int i17 = i16 ^ 51;
        int i18 = ((i16 & 51) | i17) << 1;
        int i19 = -i17;
        int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
        a = i20 % 128;
        int i21 = i20 % 2;
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0043  */
    /* JADX WARN: Code duplicated, block: B:9:0x0030  */
    @Override // android.view.MenuItem
    public boolean isVisible() {
        boolean z;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 73;
        int i4 = (((~i3) & (i2 | 73)) - (~(-(-(i3 << 1))))) - 1;
        int i5 = i4 % 128;
        b = i5;
        if (i4 % 2 != 0) {
            int i6 = this.r;
            int i7 = (i6 & (-115)) | ((~i6) & 114);
            int i8 = i6 & 114;
            if (((i8 & i7) | (i7 ^ i8)) == 0) {
                int i9 = i5 & 27;
                int i10 = -(-((i5 ^ 27) | i9));
                int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
                a = i11 % 128;
                int i12 = i11 % 2;
                z = true;
            } else {
                int i13 = i2 & 3;
                int i14 = (i2 | 3) & (~i13);
                int i15 = i13 << 1;
                int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
                b = i16 % 128;
                int i17 = i16 % 2;
                z = false;
            }
        } else if ((this.r & 8) == 0) {
            int i18 = i5 & 27;
            int i19 = -(-((i5 ^ 27) | i18));
            int i110 = (i18 ^ i19) + ((i18 & i19) << 1);
            a = i110 % 128;
            int i111 = i110 % 2;
            z = true;
        } else {
            int i112 = i2 & 3;
            int i113 = (i2 | 3) & (~i112);
            int i114 = i112 << 1;
            int i115 = (i113 ^ i114) + ((i113 & i114) << 1);
            b = i115 % 128;
            int i116 = i115 % 2;
            z = false;
        }
        int i20 = b + 100;
        int i21 = (i20 ^ (-1)) + (i20 << 1);
        a = i21 % 128;
        if (i21 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        int i = 2 % 2;
        throw new UnsupportedOperationException();
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public MenuItem setActionView(View view) {
        int i = 2 % 2;
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        int i = 2 % 2;
        int i2 = b + 71;
        a = i2 % 128;
        int i3 = i2 % 2;
        this.h = Character.toLowerCase(c);
        if (i3 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (i4 ^ 39) + ((i4 & 39) << 1);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = this.r;
            int i7 = (i6 & (-109)) | ((~i6) & 108);
            int i8 = i6 & 108;
            int i9 = (i8 & i7) | (i7 ^ i8);
            i = (~i9) & (z ? 1 : 0);
            i2 = (~(z ? 1 : 0)) & i9;
        } else {
            int i10 = this.r & (-2);
            i = (z ? 1 : 0) ^ i10;
            i2 = (z ? 1 : 0) & i10;
        }
        this.r = i2 | i;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0040 A[PHI: r2
  0x0040: PHI (r2v5 int) = (r2v4 int), (r2v9 int) binds: [B:8:0x001e, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0020 A[PHI: r2
  0x0020: PHI (r2v8 int) = (r2v4 int), (r2v9 int) binds: [B:8:0x001e, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 3) << 1) - (i3 ^ 3);
        int i5 = i4 % 128;
        b = i5;
        int i6 = 0;
        if (i4 % 2 != 0) {
            i = this.r;
            int i7 = 59 / 0;
            if (!z) {
                int i8 = (((i3 & (-106)) | ((~i3) & 105)) - (~(-(-((i3 & 105) << 1))))) - 1;
                b = i8 % 128;
                int i9 = i8 % 2;
            } else {
                int i10 = (-2) - ((i5 + 98) ^ (-1));
                int i11 = i10 % 128;
                a = i11;
                int i12 = i10 % 2;
                int i13 = (i11 & (-38)) | ((~i11) & 37);
                int i14 = (i11 & 37) << 1;
                int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
                b = i15 % 128;
                int i16 = i15 % 2;
                i6 = 2;
            }
        } else {
            i = this.r;
            if (z) {
                int i17 = (-2) - ((i5 + 98) ^ (-1));
                int i18 = i17 % 128;
                a = i18;
                int i19 = i17 % 2;
                int i110 = (i18 & (-38)) | ((~i18) & 37);
                int i111 = (i18 & 37) << 1;
                int i112 = ((i110 | i111) << 1) - (i110 ^ i111);
                b = i112 % 128;
                int i113 = i112 % 2;
                i6 = 2;
            } else {
                int i20 = (((i3 & (-106)) | ((~i3) & 105)) - (~(-(-((i3 & 105) << 1))))) - 1;
                b = i20 % 128;
                int i21 = i20 % 2;
            }
        }
        int i22 = i & (-3);
        this.r = (i22 & (~i6)) | ((~i22) & i6);
        int i23 = a;
        int i24 = ((i23 | 107) << 1) - (i23 ^ 107);
        b = i24 % 128;
        int i25 = i24 % 2;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = b + 123;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        this.l = charSequence;
        int i5 = ((i3 & (-18)) | ((~i3) & 17)) + ((i3 & 17) << 1);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 11 / 0;
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 89;
        int i5 = -(-((i3 ^ 89) | i4));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        int i9 = this.r;
        if (!z) {
            int i10 = i3 ^ 81;
            int i11 = (((i3 & 81) | i10) << 1) - i10;
            a = i11 % 128;
            int i12 = i11 % 2;
            i = 0;
        } else {
            int i13 = i7 + 110;
            int i14 = (i13 ^ (-1)) + (i13 << 1);
            b = i14 % 128;
            int i15 = i14 % 2;
            int i16 = i7 ^ 95;
            int i17 = ((i7 & 95) | i16) << 1;
            int i18 = -i16;
            int i19 = (i17 & i18) + (i18 | i17);
            b = i19 % 128;
            int i20 = i19 % 2;
            i = 16;
        }
        this.r = i | (i9 & (-17));
        int i21 = b;
        int i22 = i21 & 11;
        int i23 = ((i21 ^ 11) | i22) << 1;
        int i24 = -((i21 | 11) & (~i22));
        int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
        a = i25 % 128;
        if (i25 % 2 != 0) {
            return this;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 46) + (i2 | 46);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.n = colorStateList;
        this.f109o = true;
        f();
        int i6 = a;
        int i7 = ((i6 & 125) - (~(-(-(i6 | 125))))) - 1;
        b = i7 % 128;
        if (i7 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i8 = (i6 & 13) + (i6 | 13);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 52 / 0;
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 87;
        int i4 = ((i2 | 87) & (~i3)) + (i3 << 1);
        a = i4 % 128;
        if (i4 % 2 != 0) {
            this.f = intent;
            return this;
        }
        this.f = intent;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 103;
        int i4 = -(-((i2 ^ 103) | i3));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            this.g = c;
            throw null;
        }
        this.g = c;
        int i6 = (((i2 | 14) << 1) - (i2 ^ 14)) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        int i = 2 % 2;
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 77;
        int i4 = -(-(i2 | 77));
        int i5 = (i3 & i4) + (i3 | i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i2 + 75;
        a = i7 % 128;
        int i8 = i7 % 2;
        return this;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 7) + (i3 | 7);
        a = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 79;
        int i5 = i3 | 79;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        int i9 = i7 & 17;
        int i10 = -(-((i7 ^ 17) | i9));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        a = i11 % 128;
        int i12 = i11 % 2;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 117;
        a = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.d = charSequence;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 115;
        a = i5 % 128;
        if (i5 % 2 != 0) {
            return this;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 3) | (i2 & 3)) << 1;
        int i4 = -(((~i2) & 3) | (i2 & (-4)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        this.e = charSequence;
        int i8 = i6 ^ 95;
        int i9 = (i6 & 95) << 1;
        int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = b + 105;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        this.m = charSequence;
        int i5 = ((i3 ^ 99) - (~((i3 & 99) << 1))) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 3;
        int i5 = (i3 ^ 3) | i4;
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        int i8 = this.r;
        if (z) {
            int i9 = i3 & 99;
            int i10 = i9 + ((i3 ^ 99) | i9);
            b = i10 % 128;
            i = i10 % 2 != 0 ? 1 : 0;
            int i11 = (i3 & (-4)) | ((~i3) & 3);
            int i12 = (i3 & 3) << 1;
            int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
            b = i13 % 128;
            int i14 = i13 % 2;
        } else {
            i = 8;
        }
        int i15 = i8 & 8;
        this.r = (i & i15) | ((~i) & i15) | ((~i15) & i);
        int i16 = i3 & 13;
        int i17 = (i16 - (~((i3 ^ 13) | i16))) - 1;
        b = i17 % 128;
        int i18 = i17 % 2;
        return this;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public MenuItem setActionView(int i) {
        int i2 = 2 % 2;
        throw new UnsupportedOperationException();
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 73) + (i3 | 73);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.h = Character.toLowerCase(c);
        this.j = KeyEvent.normalizeMetaState(i);
        int i6 = b;
        int i7 = i6 & 123;
        int i8 = (((i6 ^ 123) | i7) << 1) - ((i6 | 123) & (~i7));
        a = i8 % 128;
        if (i8 % 2 != 0) {
            return this;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public r setContentDescription(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 34) << 1) - (i2 ^ 34)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.l = charSequence;
        int i5 = ((i2 | 43) << 1) - (i2 ^ 43);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return this;
        }
        throw null;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 79) + (i2 | 79);
        a = i3 % 128;
        int i4 = i3 % 2;
        this.k = drawable;
        f();
        int i5 = b;
        int i6 = (((i5 | 35) << 1) - (~(-(i5 ^ 35)))) - 1;
        a = i6 % 128;
        if (i6 % 2 != 0) {
            return this;
        }
        throw null;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 113;
        int i4 = (i2 | 113) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        this.g = c;
        this.h = Character.toLowerCase(c2);
        int i8 = b;
        int i9 = (((i8 | 72) << 1) - (i8 ^ 72)) - 1;
        a = i9 % 128;
        int i10 = i9 % 2;
        int i11 = (-2) - ((i8 + 82) ^ (-1));
        a = i11 % 128;
        int i12 = i11 % 2;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 117;
        int i5 = i3 | 117;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        this.d = this.c.getResources().getString(i);
        int i8 = a;
        int i9 = (i8 ^ 37) + ((i8 & 37) << 1);
        int i10 = i9 % 128;
        b = i10;
        if (i9 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i11 = ((i10 | 34) << 1) - (i10 ^ 34);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        a = i12 % 128;
        int i13 = i12 % 2;
        return this;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public r setTooltipText(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 95) + (i2 | 95);
        b = i3 % 128;
        int i4 = i3 % 2;
        this.m = charSequence;
        if (i4 != 0) {
            int i5 = 27 / 0;
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    public final void f() {
        Drawable drawableMutate;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 + 113;
        b = i4 % 128;
        int i5 = i4 % 2;
        Drawable drawable = this.k;
        if (drawable != null) {
            int i6 = i3 + 29;
            b = i6 % 128;
            int i7 = i6 % 2;
            if (this.f109o) {
                this.k = drawable;
                drawableMutate = drawable.mutate();
                this.k = drawableMutate;
                i = a;
                int i8 = (i ^ 15) + ((i & 15) << 1);
                b = i8 % 128;
                int i9 = i8 % 2;
                if (this.f109o) {
                    int i10 = i + 9;
                    b = i10 % 128;
                    int i11 = i10 % 2;
                    drawableMutate.setTintList(this.n);
                    int i12 = a;
                    int i13 = i12 & 77;
                    int i14 = i12 | 77;
                    int i15 = (i13 & i14) + (i14 | i13);
                    b = i15 % 128;
                    int i16 = i15 % 2;
                }
                if (this.q) {
                    int i17 = b;
                    int i18 = i17 & 63;
                    int i19 = (i17 | 63) & (~i18);
                    int i20 = -(-(i18 << 1));
                    int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
                    a = i21 % 128;
                    int i22 = i21 % 2;
                    this.k.setTintMode(this.p);
                    int i23 = b;
                    int i24 = i23 & 115;
                    int i25 = -(-((i23 ^ 115) | i24));
                    int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                    a = i26 % 128;
                    int i27 = i26 % 2;
                }
            } else {
                int i28 = (-2) - (((i3 ^ 100) + ((i3 & 100) << 1)) ^ (-1));
                b = i28 % 128;
                if (i28 % 2 != 0) {
                    int i29 = 91 / 0;
                    if (!(!this.q)) {
                        this.k = drawable;
                        drawableMutate = drawable.mutate();
                        this.k = drawableMutate;
                        i = a;
                        int i30 = (i ^ 15) + ((i & 15) << 1);
                        b = i30 % 128;
                        int i31 = i30 % 2;
                        if (this.f109o) {
                            int i110 = i + 9;
                            b = i110 % 128;
                            int i111 = i110 % 2;
                            drawableMutate.setTintList(this.n);
                            int i112 = a;
                            int i113 = i112 & 77;
                            int i114 = i112 | 77;
                            int i115 = (i113 & i114) + (i114 | i113);
                            b = i115 % 128;
                            int i116 = i115 % 2;
                        }
                        if (this.q) {
                            int i117 = b;
                            int i118 = i117 & 63;
                            int i119 = (i117 | 63) & (~i118);
                            int i210 = -(-(i118 << 1));
                            int i211 = ((i119 | i210) << 1) - (i119 ^ i210);
                            a = i211 % 128;
                            int i212 = i211 % 2;
                            this.k.setTintMode(this.p);
                            int i213 = b;
                            int i214 = i213 & 115;
                            int i215 = -(-((i213 ^ 115) | i214));
                            int i216 = (i214 ^ i215) + ((i215 & i214) << 1);
                            a = i216 % 128;
                            int i217 = i216 % 2;
                        }
                    }
                } else if (this.q) {
                    this.k = drawable;
                    drawableMutate = drawable.mutate();
                    this.k = drawableMutate;
                    i = a;
                    int i32 = (i ^ 15) + ((i & 15) << 1);
                    b = i32 % 128;
                    int i33 = i32 % 2;
                    if (this.f109o) {
                        int i1110 = i + 9;
                        b = i1110 % 128;
                        int i1111 = i1110 % 2;
                        drawableMutate.setTintList(this.n);
                        int i1112 = a;
                        int i1113 = i1112 & 77;
                        int i1114 = i1112 | 77;
                        int i1115 = (i1113 & i1114) + (i1114 | i1113);
                        b = i1115 % 128;
                        int i1116 = i1115 % 2;
                    }
                    if (this.q) {
                        int i1117 = b;
                        int i1118 = i1117 & 63;
                        int i1119 = (i1117 | 63) & (~i1118);
                        int i218 = -(-(i1118 << 1));
                        int i219 = ((i1119 | i218) << 1) - (i1119 ^ i218);
                        a = i219 % 128;
                        int i2110 = i219 % 2;
                        this.k.setTintMode(this.p);
                        int i2111 = b;
                        int i2112 = i2111 & 115;
                        int i2113 = -(-((i2111 ^ 115) | i2112));
                        int i2114 = (i2112 ^ i2113) + ((i2113 & i2112) << 1);
                        a = i2114 % 128;
                        int i2115 = i2114 % 2;
                    }
                }
            }
        }
        int i34 = b;
        int i35 = i34 & 67;
        int i36 = i35 + ((i34 ^ 67) | i35);
        a = i36 % 128;
        int i37 = i36 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 113) + (i2 | 113);
        b = i3 % 128;
        int i4 = i3 % 2;
        this.p = mode;
        this.q = true;
        f();
        int i5 = a + 63;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        int i2 = 2 % 2;
        int i3 = b + 65;
        a = i3 % 128;
        int i4 = i3 % 2;
        this.g = c;
        this.i = KeyEvent.normalizeMetaState(i);
        int i5 = b;
        int i6 = (i5 & 45) + (i5 | 45);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 67 / 0;
        }
        int i8 = i5 + 55;
        a = i8 % 128;
        int i9 = i8 % 2;
        return this;
    }

    @Override // ivas.gov.bisp.enumeration.p092o.r, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 81;
        int i6 = (((i4 ^ 81) | i5) << 1) - ((i4 | 81) & (~i5));
        a = i6 % 128;
        if (i6 % 2 == 0) {
            this.g = c;
            this.i = KeyEvent.normalizeMetaState(i);
            int i7 = 67 / 0;
        } else {
            this.g = c;
            this.i = KeyEvent.normalizeMetaState(i);
        }
        int i8 = b;
        int i9 = i8 & 123;
        int i10 = i9 + ((i8 ^ 123) | i9);
        a = i10 % 128;
        int i11 = i10 % 2;
        this.h = Character.toLowerCase(c2);
        int i12 = b;
        int i13 = ((i12 | 126) << 1) - (i12 ^ 126);
        int i14 = (i13 ^ (-1)) + (i13 << 1);
        a = i14 % 128;
        if (i14 % 2 == 0) {
            this.j = KeyEvent.normalizeMetaState(i2);
            int i15 = 39 / 0;
        } else {
            this.j = KeyEvent.normalizeMetaState(i2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 109;
        int i5 = (i3 | 109) & (~i4);
        int i6 = i4 << 1;
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        b = i7 % 128;
        Object obj = null;
        if (i7 % 2 != 0) {
            Context context = this.c;
            Object obj2 = l.c;
            l.aUH.c(context, i);
            throw null;
        }
        Context context2 = this.c;
        Object obj3 = l.c;
        Drawable drawableC = l.aUH.c(context2, i);
        int i8 = b + 30;
        int i9 = (i8 ^ (-1)) + (i8 << 1);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            this.k = drawableC;
            f();
            return this;
        }
        this.k = drawableC;
        f();
        obj.hashCode();
        throw null;
    }
}
