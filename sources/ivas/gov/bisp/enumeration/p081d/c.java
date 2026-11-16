package ivas.gov.bisp.enumeration.p081d;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    private static int a = 1;
    private static int b;
    public aJa c;

    public interface aJa {
    }

    public c(Context context) {
    }

    public boolean c() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 37) << 1) - (i2 ^ 37);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        int i6 = i4 & 25;
        int i7 = (((i4 | 25) & (~i6)) - (~(i6 << 1))) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public boolean d() {
        int i = 2 % 2;
        int i2 = b + 48;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        int i6 = (((i4 ^ 13) | (i4 & 13)) << 1) - (((~i4) & 13) | (i4 & (-14)));
        b = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    public abstract View e();

    public View f(MenuItem menuItem) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 45;
        int i4 = ((i2 ^ 45) | i3) << 1;
        int i5 = -((i2 | 45) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            return e();
        }
        e();
        throw null;
    }

    public void g(SubMenu subMenu) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 73;
        int i4 = -(-(i2 | 73));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
    }

    public boolean h() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 7;
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 73;
        a = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public boolean i() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 46) << 1) - (i2 ^ 46)) - 1;
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        int i6 = ((i4 & (-122)) | ((~i4) & 121)) + ((i4 & 121) << 1);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 16 / 0;
        }
        return false;
    }

    public void j(aJa aja) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 113;
        int i4 = (((i2 | 113) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        this.c = aja;
        if (i5 == 0) {
            int i6 = 41 / 0;
        }
    }
}
