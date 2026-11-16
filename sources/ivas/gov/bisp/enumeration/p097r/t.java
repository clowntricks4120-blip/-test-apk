package ivas.gov.bisp.enumeration.p097r;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import ivas.gov.bisp.enumeration.OooOOoo.OooOOOO;
import ivas.gov.bisp.enumeration.p092o.e;
import ivas.gov.bisp.enumeration.p092o.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    private static int a = 0;
    private static int b = 1;
    public final Context c;
    public OooOOOO<r, MenuItem> d;
    public OooOOOO<e, SubMenu> e;

    public t(Context context) {
        this.c = context;
    }

    public final SubMenu d(SubMenu subMenu) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 41;
        int i4 = (((i2 ^ 41) | i3) << 1) - ((i2 | 41) & (~i3));
        int i5 = i4 % 128;
        a = i5;
        if (i4 % 2 != 0) {
            boolean z = subMenu instanceof e;
            throw null;
        }
        if (!(subMenu instanceof e)) {
            int i6 = i5 & 37;
            int i7 = (i5 | 37) & (~i6);
            int i8 = i6 << 1;
            int i9 = (i7 & i8) + (i7 | i8);
            b = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 51 / 0;
            }
            return subMenu;
        }
        e eVar = (e) subMenu;
        if (this.e == null) {
            this.e = new ivas.gov.bisp.enumeration.p001aa.t();
            int i11 = a;
            int i12 = i11 ^ 93;
            int i13 = ((i11 & 93) | i12) << 1;
            int i14 = -i12;
            int i15 = (i13 & i14) + (i13 | i14);
            b = i15 % 128;
            int i16 = i15 % 2;
        }
        SubMenu j = (SubMenu) this.e.get(eVar);
        if (j == null) {
            j = new J(this.c, eVar);
            OooOOOO<e, SubMenu> oooOOOO = this.e;
            int i17 = b;
            int i18 = i17 & 57;
            int i19 = ((i17 | 57) & (~i18)) + (i18 << 1);
            a = i19 % 128;
            if (i19 % 2 != 0) {
                oooOOOO.put(eVar, j);
                throw null;
            }
            oooOOOO.put(eVar, j);
        }
        int i20 = b;
        int i21 = (i20 & 83) + (i20 | 83);
        a = i21 % 128;
        int i22 = i21 % 2;
        return j;
    }

    public final MenuItem c(MenuItem menuItem) {
        int i = 2 % 2;
        int i2 = a + 89;
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            boolean z = menuItem instanceof r;
            obj.hashCode();
            throw null;
        }
        if (!(!(menuItem instanceof r))) {
            r rVar = (r) menuItem;
            if (this.d == null) {
                this.d = new ivas.gov.bisp.enumeration.p001aa.t();
                int i3 = b;
                int i4 = i3 & 75;
                int i5 = i3 | 75;
                int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
                a = i6 % 128;
                int i7 = i6 % 2;
            }
            menuItem = (MenuItem) this.d.getOrDefault(menuItem, null);
            int i8 = b;
            int i9 = i8 & 67;
            int i10 = (i9 - (~(-(-((i8 ^ 67) | i9))))) - 1;
            a = i10 % 128;
            int i11 = i10 % 2;
            if (menuItem == null) {
                menuItem = new u(this.c, rVar);
                int i12 = a + 45;
                b = i12 % 128;
                int i13 = i12 % 2;
                this.d.put(rVar, menuItem);
                int i14 = b;
                int i15 = i14 & 121;
                int i16 = i14 | 121;
                int i17 = (i15 & i16) + (i16 | i15);
                a = i17 % 128;
                int i18 = i17 % 2;
            }
        }
        int i19 = a;
        int i20 = (i19 | 81) << 1;
        int i21 = -(((~i19) & 81) | (i19 & (-82)));
        int i22 = (i20 & i21) + (i21 | i20);
        b = i22 % 128;
        int i23 = i22 % 2;
        return menuItem;
    }
}
