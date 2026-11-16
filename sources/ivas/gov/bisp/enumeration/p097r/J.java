package ivas.gov.bisp.enumeration.p097r;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import ivas.gov.bisp.enumeration.p092o.e;

/* JADX INFO: loaded from: classes.dex */
public class J extends a implements SubMenu {
    private static int a = 0;
    private static int b = 1;
    public final e g;

    public J(Context context, e eVar) {
        super(context, eVar);
        this.g = eVar;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 | 39;
        int i4 = ((i3 << 1) - (~(-((~(i2 & 39)) & i3)))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        this.g.clearHeader();
        int i6 = a;
        int i7 = i6 & 105;
        int i8 = i7 + ((i6 ^ 105) | i7);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 41;
        int i4 = (i2 ^ 41) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            c(this.g.getItem());
            throw null;
        }
        MenuItem menuItemC = c(this.g.getItem());
        int i6 = a;
        int i7 = i6 & 63;
        int i8 = ((i6 ^ 63) | i7) << 1;
        int i9 = -((i6 | 63) & (~i7));
        int i10 = (i8 & i9) + (i9 | i8);
        b = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 90 / 0;
        }
        return menuItemC;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 37;
        int i5 = -(-((i3 ^ 37) | i4));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        this.g.setHeaderIcon(i);
        int i8 = a;
        int i9 = (i8 | 85) << 1;
        int i10 = -(i8 ^ 85);
        int i11 = (i9 & i10) + (i10 | i9);
        int i12 = i11 % 128;
        b = i12;
        int i13 = i11 % 2;
        int i14 = i12 & 119;
        int i15 = (i14 - (~((i12 ^ 119) | i14))) - 1;
        a = i15 % 128;
        int i16 = i15 % 2;
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & 17) + (i3 | 17);
        b = i4 % 128;
        int i5 = i4 % 2;
        this.g.setHeaderTitle(i);
        int i6 = a;
        int i7 = i6 & 35;
        int i8 = ((i6 | 35) & (~i7)) + (i7 << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 125) + ((i2 & 125) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        this.g.setHeaderView(view);
        int i5 = b;
        int i6 = (i5 & (-16)) | ((~i5) & 15);
        int i7 = -(-((i5 & 15) << 1));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 & (-82)) | ((~i3) & 81)) + ((i3 & 81) << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.g.setIcon(i);
        int i6 = a;
        int i7 = (i6 & (-80)) | ((~i6) & 79);
        int i8 = -(-((i6 & 79) << 1));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 10 / 0;
        }
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 33;
        int i4 = ((i2 & 33) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        this.g.setHeaderIcon(drawable);
        int i8 = a;
        int i9 = i8 & 35;
        int i10 = -(-((i8 ^ 35) | i9));
        int i11 = (i9 & i10) + (i10 | i9);
        b = i11 % 128;
        int i12 = i11 % 2;
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 17) << 1) - (i2 ^ 17);
        a = i3 % 128;
        if (i3 % 2 != 0) {
            this.g.setHeaderTitle(charSequence);
            throw null;
        }
        this.g.setHeaderTitle(charSequence);
        int i4 = b;
        int i5 = ((i4 | 109) << 1) - (i4 ^ 109);
        a = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-78)) | ((~i2) & 77)) + ((i2 & 77) << 1);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            this.g.setIcon(drawable);
            return this;
        }
        this.g.setIcon(drawable);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
