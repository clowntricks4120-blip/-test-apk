package ivas.gov.bisp.enumeration.p097r;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import ivas.gov.bisp.enumeration.OooOOoo.OooOOOO;
import ivas.gov.bisp.enumeration.p092o.e;
import ivas.gov.bisp.enumeration.p092o.h;
import ivas.gov.bisp.enumeration.p092o.r;

/* JADX INFO: loaded from: classes.dex */
public class a extends t implements Menu {
    private static int a = 1;
    private static int b;
    public final h f;

    public a(Context context, h hVar) {
        super(context);
        if (hVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f = hVar;
        int i = a;
        int i2 = i & 9;
        int i3 = -(-((i ^ 9) | i2));
        int i4 = (i2 & i3) + (i3 | i2);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 25) + ((i2 & 25) << 1);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            c(this.f.add(charSequence));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MenuItem menuItemC = c(this.f.add(charSequence));
        int i4 = b;
        int i5 = (((i4 | 110) << 1) - (i4 ^ 110)) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        return menuItemC;
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        MenuItem[] menuItemArr3;
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = (i6 & 47) + (i6 | 47);
        a = i7 % 128;
        int i8 = i7 % 2;
        int i9 = 0;
        Object obj = null;
        if (menuItemArr != null) {
            int i10 = ((i6 ^ 15) - (~((i6 & 15) << 1))) - 1;
            int i11 = i10 % 128;
            a = i11;
            if (i10 % 2 == 0) {
                menuItemArr3 = new MenuItem[menuItemArr.length];
                int i12 = 60 / 0;
            } else {
                menuItemArr3 = new MenuItem[menuItemArr.length];
            }
            int i13 = i11 + 19;
            b = i13 % 128;
            int i14 = i13 % 2;
            menuItemArr2 = menuItemArr3;
        } else {
            int i15 = i6 + 45;
            a = i15 % 128;
            int i16 = i15 % 2;
            menuItemArr2 = null;
        }
        h hVar = this.f;
        int i17 = a;
        int i18 = i17 & 81;
        int i19 = (i18 - (~(-(-((i17 ^ 81) | i18))))) - 1;
        b = i19 % 128;
        if (i19 % 2 != 0) {
            hVar.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
            obj.hashCode();
            throw null;
        }
        int iAddIntentOptions = hVar.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int i20 = b;
            int i21 = i20 & 63;
            int i22 = (((i20 ^ 63) | i21) << 1) - ((~i21) & (i20 | 63));
            a = i22 % 128;
            int i23 = i22 % 2;
            int length = menuItemArr2.length;
            int i24 = i20 + 94;
            int i25 = (i24 ^ (-1)) + (i24 << 1);
            a = i25 % 128;
            int i26 = i25 % 2;
            while (i9 < length) {
                int i27 = b;
                int i28 = ((i27 ^ 84) + ((i27 & 84) << 1)) - 1;
                a = i28 % 128;
                if (i28 % 2 == 0) {
                    menuItemArr[i9] = c(menuItemArr2[i9]);
                    int i29 = i9 & 146;
                    i9 = (((i9 | 146) & (~i29)) - (~(i29 << 1))) - 73;
                } else {
                    menuItemArr[i9] = c(menuItemArr2[i9]);
                    i9 = (i9 ^ 1) + ((i9 & 1) << 1);
                }
            }
        }
        int i30 = b;
        int i31 = (i30 & (-114)) | ((~i30) & 113);
        int i32 = -(-((i30 & 113) << 1));
        int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
        a = i33 % 128;
        int i34 = i33 % 2;
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 105;
        int i4 = (((i2 | 105) & (~i3)) - (~(i3 << 1))) - 1;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            d(this.f.addSubMenu(charSequence));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SubMenu subMenuD = d(this.f.addSubMenu(charSequence));
        int i5 = a;
        int i6 = ((i5 | 1) << 1) - (i5 ^ 1);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 11 / 0;
        }
        return subMenuD;
    }

    @Override // android.view.Menu
    public void close() {
        int i = 2 % 2;
        int i2 = a + 58;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        this.f.close();
        if (i4 != 0) {
            throw null;
        }
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem menuItemC;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & (-16)) | ((~i3) & 15);
        int i5 = (i3 & 15) << 1;
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        MenuItem menuItemFindItem = this.f.findItem(i);
        if (i7 == 0) {
            menuItemC = c(menuItemFindItem);
            int i8 = 13 / 0;
        } else {
            menuItemC = c(menuItemFindItem);
        }
        int i9 = b;
        int i10 = (i9 & 113) + (i9 | 113);
        a = i10 % 128;
        int i11 = i10 % 2;
        return menuItemC;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 41;
        int i5 = (i3 ^ 41) | i4;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        MenuItem item = this.f.getItem(i);
        if (i7 != 0) {
            return c(item);
        }
        c(item);
        throw null;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 70) + (i2 | 70)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        boolean zHasVisibleItems = this.f.hasVisibleItems();
        int i5 = b;
        int i6 = ((i5 & 8) + (i5 | 8)) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        return zHasVisibleItems;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 117) + (i3 | 117);
        a = i4 % 128;
        int i5 = i4 % 2;
        boolean zIsShortcutKey = this.f.isShortcutKey(i, keyEvent);
        int i6 = b;
        int i7 = ((i6 ^ 111) - (~((i6 & 111) << 1))) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
        return zIsShortcutKey;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = a + 1;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            this.f.performIdentifierAction(i, i2);
            throw null;
        }
        boolean zPerformIdentifierAction = this.f.performIdentifierAction(i, i2);
        int i5 = a;
        int i6 = ((i5 ^ 23) | (i5 & 23)) << 1;
        int i7 = -(((~i5) & 23) | (i5 & (-24)));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        int i9 = i8 % 2;
        return zPerformIdentifierAction;
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 125;
        int i6 = (((i4 ^ 125) | i5) << 1) - ((i4 | 125) & (~i5));
        a = i6 % 128;
        int i7 = i6 % 2;
        boolean zPerformShortcut = this.f.performShortcut(i, keyEvent, i2);
        int i8 = b;
        int i9 = (i8 & (-106)) | ((~i8) & 105);
        int i10 = -(-((i8 & 105) << 1));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        a = i11 % 128;
        if (i11 % 2 != 0) {
            return zPerformShortcut;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        r rVar;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 37;
        int i5 = (i3 | 37) & (~i4);
        int i6 = i4 << 1;
        int i7 = (i5 & i6) + (i5 | i6);
        b = i7 % 128;
        int i8 = i7 % 2;
        if (this.d != null) {
            int i9 = a;
            int i10 = ((i9 & 49) - (~(i9 | 49))) - 1;
            int i11 = i10 % 128;
            b = i11;
            int i12 = i10 % 2;
            int i13 = ((i11 ^ 53) - (~(-(-((i11 & 53) << 1))))) - 1;
            a = i13 % 128;
            int i14 = i13 % 2;
            int i15 = 0;
            while (true) {
                OooOOOO<r, MenuItem> oooOOOO = this.d;
                if (i15 >= oooOOOO.i) {
                    break;
                }
                int i16 = b;
                int i17 = ((i16 ^ 50) + ((i16 & 50) << 1)) - 1;
                a = i17 % 128;
                if (i17 % 2 == 0) {
                    rVar = (r) oooOOOO.k(i15);
                    int i18 = 46 / 0;
                } else {
                    rVar = (r) oooOOOO.k(i15);
                }
                if (rVar.getGroupId() == i) {
                    int i19 = b;
                    int i20 = i19 & 115;
                    int i21 = i20 + ((i19 ^ 115) | i20);
                    a = i21 % 128;
                    int i22 = i21 % 2;
                    this.d.l(i15);
                    i15--;
                    int i23 = b;
                    int i24 = i23 ^ 103;
                    int i25 = (((i23 & 103) | i24) << 1) - i24;
                    a = i25 % 128;
                    int i26 = i25 % 2;
                }
                i15 = (((i15 ^ 1) | (i15 & 1)) << 1) - (((~i15) & 1) | (i15 & (-2)));
                int i27 = b;
                int i28 = i27 & 97;
                int i29 = (((i27 | 97) & (~i28)) - (~(i28 << 1))) - 1;
                a = i29 % 128;
                int i30 = i29 % 2;
            }
        }
        this.f.removeGroup(i);
        int i31 = b + 15;
        a = i31 % 128;
        int i32 = i31 % 2;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int i2 = 2 % 2;
        int i3 = a + 123;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.f.setGroupCheckable(i, z, z2);
        int i5 = a;
        int i6 = i5 & 71;
        int i7 = (i5 ^ 71) | i6;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 0 / 0;
        }
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 | 75) << 1) - (i3 ^ 75);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.f.setGroupEnabled(i, z);
        int i6 = a;
        int i7 = i6 & 113;
        int i8 = (i6 | 113) & (~i7);
        int i9 = -(-(i7 << 1));
        int i10 = (i8 & i9) + (i8 | i9);
        b = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 45;
        int i5 = (i4 - (~((i3 ^ 45) | i4))) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        this.f.setGroupVisible(i, z);
        if (i6 != 0) {
            int i7 = 77 / 0;
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 25) + ((i2 & 25) << 1);
        a = i3 % 128;
        if (i3 % 2 != 0) {
            this.f.setQwertyMode(z);
        } else {
            this.f.setQwertyMode(z);
            throw null;
        }
    }

    @Override // android.view.Menu
    public int size() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 38) << 1) - (i2 ^ 38);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        int size = this.f.size();
        int i6 = b;
        int i7 = i6 & 37;
        int i8 = i6 | 37;
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            return size;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (((i3 ^ 49) | (i3 & 49)) << 1) - (((~i3) & 49) | (i3 & (-50)));
        b = i4 % 128;
        int i5 = i4 % 2;
        MenuItem menuItemC = c(this.f.add(i));
        int i6 = b + 87;
        a = i6 % 128;
        if (i6 % 2 != 0) {
            return menuItemC;
        }
        throw null;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 | 89;
        int i5 = i4 << 1;
        int i6 = -((~(i3 & 89)) & i4);
        int i7 = (i5 & i6) + (i6 | i5);
        b = i7 % 128;
        int i8 = i7 % 2;
        SubMenu subMenuAddSubMenu = this.f.addSubMenu(i);
        int i9 = a;
        int i10 = i9 & 117;
        int i11 = -(-(i9 | 117));
        int i12 = (i10 & i11) + (i11 | i10);
        b = i12 % 128;
        Object obj = null;
        if (i12 % 2 != 0) {
            d(subMenuAddSubMenu);
            obj.hashCode();
            throw null;
        }
        SubMenu subMenuD = d(subMenuAddSubMenu);
        int i13 = a;
        int i14 = (((i13 & (-102)) | ((~i13) & 101)) - (~((i13 & 101) << 1))) - 1;
        b = i14 % 128;
        if (i14 % 2 == 0) {
            return subMenuD;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        int i4 = 2 % 2;
        int i5 = b + 25;
        a = i5 % 128;
        if (i5 % 2 == 0) {
            this.f.add(i, i2, i3, charSequence);
            throw null;
        }
        MenuItem menuItemAdd = this.f.add(i, i2, i3, charSequence);
        int i6 = (-2) - ((b + 48) ^ (-1));
        a = i6 % 128;
        if (i6 % 2 != 0) {
            return c(menuItemAdd);
        }
        int i7 = 53 / 0;
        return c(menuItemAdd);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = (i5 ^ 89) + ((i5 & 89) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        SubMenu subMenuAddSubMenu = this.f.addSubMenu(i, i2, i3, charSequence);
        int i8 = a;
        int i9 = ((i8 ^ 71) - (~(-(-((i8 & 71) << 1))))) - 1;
        b = i9 % 128;
        int i10 = i9 % 2;
        SubMenu subMenuD = d(subMenuAddSubMenu);
        int i11 = a;
        int i12 = (((i11 | 64) << 1) - (i11 ^ 64)) - 1;
        b = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 51 / 0;
        }
        return subMenuD;
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = (((i6 | 113) << 1) - (~(-(i6 ^ 113)))) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
        MenuItem menuItemAdd = this.f.add(i, i2, i3, i4);
        int i9 = b;
        int i10 = i9 & 67;
        int i11 = ((i9 ^ 67) | i10) << 1;
        int i12 = -((i9 | 67) & (~i10));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        a = i13 % 128;
        if (i13 % 2 != 0) {
            return c(menuItemAdd);
        }
        c(menuItemAdd);
        throw null;
    }

    @Override // android.view.Menu
    public void clear() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 39;
        int i4 = -(-(i2 | 39));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        OooOOOO<r, MenuItem> oooOOOO = this.d;
        Object obj = null;
        if (oooOOOO != null) {
            int i7 = a;
            int i8 = (i7 & 116) + (i7 | 116);
            int i9 = (i8 ^ (-1)) + (i8 << 1);
            b = i9 % 128;
            if (i9 % 2 != 0) {
                oooOOOO.clear();
                obj.hashCode();
                throw null;
            }
            oooOOOO.clear();
        }
        OooOOOO<e, SubMenu> oooOOOO2 = this.e;
        if (oooOOOO2 != null) {
            int i10 = b;
            int i11 = i10 & 35;
            int i12 = ((i10 ^ 35) | i11) << 1;
            int i13 = -((i10 | 35) & (~i11));
            int i14 = (i12 & i13) + (i13 | i12);
            a = i14 % 128;
            if (i14 % 2 == 0) {
                oooOOOO2.clear();
                int i15 = 25 / 0;
            } else {
                oooOOOO2.clear();
            }
            int i16 = b;
            int i17 = i16 & 95;
            int i18 = -(-((i16 ^ 95) | i17));
            int i19 = (i17 & i18) + (i18 | i17);
            a = i19 % 128;
            int i20 = i19 % 2;
        }
        this.f.clear();
        int i21 = b;
        int i22 = (i21 & 91) + (i21 | 91);
        a = i22 % 128;
        if (i22 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = b + 69;
        a = i6 % 128;
        int i7 = i6 % 2;
        SubMenu subMenuAddSubMenu = this.f.addSubMenu(i, i2, i3, i4);
        int i8 = b + 111;
        a = i8 % 128;
        if (i8 % 2 != 0) {
            return d(subMenuAddSubMenu);
        }
        int i9 = 35 / 0;
        return d(subMenuAddSubMenu);
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        int itemId;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 1;
        int i5 = -(-((i3 ^ 1) | i4));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        if (this.d != null) {
            int i8 = b;
            int i9 = (-2) - (((i8 & 28) + (i8 | 28)) ^ (-1));
            a = i9 % 128;
            int i10 = i9 % 2;
            int i11 = i8 + 35;
            a = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 0;
            while (true) {
                OooOOOO<r, MenuItem> oooOOOO = this.d;
                if (i13 >= oooOOOO.i) {
                    break;
                }
                int i14 = a;
                int i15 = ((i14 | 55) << 1) - (i14 ^ 55);
                b = i15 % 128;
                if (i15 % 2 != 0) {
                    itemId = ((r) oooOOOO.k(i13)).getItemId();
                    int i16 = 5 / 0;
                } else {
                    itemId = ((r) oooOOOO.k(i13)).getItemId();
                }
                int i17 = a;
                int i18 = i17 ^ 13;
                int i19 = ((i17 & 13) | i18) << 1;
                int i20 = -i18;
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                b = i21 % 128;
                int i22 = i21 % 2;
                if (itemId == i) {
                    int i23 = i17 + 61;
                    b = i23 % 128;
                    int i24 = i23 % 2;
                    this.d.l(i13);
                    int i25 = b + 125;
                    a = i25 % 128;
                    int i26 = i25 % 2;
                    break;
                }
                i13 = ((i13 | 1) << 1) - (i13 ^ 1);
                int i27 = i17 & 111;
                int i28 = -(-(i17 | 111));
                int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
                b = i29 % 128;
                int i30 = i29 % 2;
            }
        }
        this.f.removeItem(i);
        int i31 = a;
        int i32 = i31 ^ 79;
        int i33 = -(-((i31 & 79) << 1));
        int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
        b = i34 % 128;
        int i35 = i34 % 2;
    }
}
