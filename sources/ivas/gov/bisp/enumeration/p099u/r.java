package ivas.gov.bisp.enumeration.p099u;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.a;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class r extends j implements n.aII {
    private static int c = 1;
    private static int d;
    public n e;
    public Context f;
    public j.aQr g;
    public ActionBarContextView h;
    public WeakReference<View> i;
    public boolean j;

    public r(Context context, ActionBarContextView actionBarContextView, j.aQr aqr, boolean z) {
        this.f = context;
        this.h = actionBarContextView;
        this.g = aqr;
        n nVar = new n(actionBarContextView.getContext());
        nVar.m = 1;
        this.e = nVar;
        nVar.h = this;
    }

    @Override // androidx.appcompat.view.menu.n.aII
    public boolean b(n nVar, MenuItem menuItem) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = (i2 ^ 51) + ((i2 & 51) << 1);
        d = i3 % 128;
        int i4 = i3 % 2;
        boolean zE = this.g.e(this, menuItem);
        int i5 = d;
        int i6 = ((i5 ^ 65) | (i5 & 65)) << 1;
        int i7 = -(((~i5) & 65) | (i5 & (-66)));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        c = i8 % 128;
        int i9 = i8 % 2;
        return zE;
    }

    @Override // ivas.gov.bisp.enumeration.p099u.j
    public void c() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 & 29;
        int i4 = (i3 - (~(-(-((i2 ^ 29) | i3))))) - 1;
        d = i4 % 128;
        int i5 = i4 % 2;
        this.g.d(this, this.e);
        int i6 = d;
        int i7 = i6 & 9;
        int i8 = ((((i6 ^ 9) | i7) << 1) - (~(-((i6 | 9) & (~i7))))) - 1;
        c = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p099u.j
    public void d() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 & 77;
        int i4 = i2 | 77;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        d = i6;
        if (i5 % 2 != 0) {
            throw null;
        }
        if (this.j) {
            int i7 = (i6 & 57) + (i6 | 57);
            c = i7 % 128;
            int i8 = i7 % 2;
        } else {
            this.j = true;
            this.g.c(this);
            int i9 = c + 75;
            d = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p099u.j
    public View e() {
        View view;
        int i = 2 % 2;
        int i2 = d;
        int i3 = (-2) - ((i2 + 90) ^ (-1));
        c = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        WeakReference<View> weakReference = this.i;
        if (weakReference != null) {
            view = weakReference.get();
            int i4 = d + 37;
            c = i4 % 128;
            int i5 = i4 % 2;
        } else {
            int i6 = ((((i2 ^ 125) | (i2 & 125)) << 1) - (~(-(((~i2) & 125) | (i2 & (-126)))))) - 1;
            c = i6 % 128;
            int i7 = i6 % 2;
            view = null;
        }
        int i8 = d;
        int i9 = (i8 ^ 115) + ((i8 & 115) << 1);
        c = i9 % 128;
        if (i9 % 2 != 0) {
            return view;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p099u.j
    public MenuInflater f() {
        int i = 2 % 2;
        i iVar = new i(this.h.getContext());
        int i2 = d;
        int i3 = (((i2 ^ 35) | (i2 & 35)) << 1) - (((~i2) & 35) | (i2 & (-36)));
        c = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 66 / 0;
        }
        return iVar;
    }

    @Override // ivas.gov.bisp.enumeration.p099u.j
    public Menu g() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = ((i2 ^ 68) + ((i2 & 68) << 1)) - 1;
        c = i3 % 128;
        int i4 = i3 % 2;
        n nVar = this.e;
        int i5 = (i2 | 99) << 1;
        int i6 = -(((~i2) & 99) | (i2 & (-100)));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        c = i7 % 128;
        int i8 = i7 % 2;
        return nVar;
    }

    @Override // ivas.gov.bisp.enumeration.p099u.j
    public CharSequence h() {
        int i = 2 % 2;
        int i2 = c + 81;
        d = i2 % 128;
        int i3 = i2 % 2;
        CharSequence subtitle = this.h.getSubtitle();
        int i4 = d;
        int i5 = i4 & 111;
        int i6 = i5 + ((i4 ^ 111) | i5);
        c = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 54 / 0;
        }
        return subtitle;
    }

    @Override // ivas.gov.bisp.enumeration.p099u.j
    public CharSequence i() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 & 67;
        int i4 = i3 + ((i2 ^ 67) | i3);
        c = i4 % 128;
        int i5 = i4 % 2;
        CharSequence title = this.h.getTitle();
        int i6 = c + 97;
        d = i6 % 128;
        if (i6 % 2 == 0) {
            return title;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p099u.j
    public void k(View view) {
        WeakReference<View> weakReference;
        int i = 2 % 2;
        int i2 = c;
        int i3 = ((i2 & 120) + (i2 | 120)) - 1;
        d = i3 % 128;
        int i4 = i3 % 2;
        this.h.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference<>(view);
            int i5 = d;
            int i6 = ((i5 | 71) << 1) - (i5 ^ 71);
            c = i6 % 128;
            int i7 = i6 % 2;
        } else {
            int i8 = d;
            int i9 = i8 & 33;
            int i10 = (i8 | 33) & (~i9);
            int i11 = -(-(i9 << 1));
            int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
            c = i12 % 128;
            int i13 = i12 % 2;
            weakReference = null;
        }
        this.i = weakReference;
        int i14 = c;
        int i15 = i14 & 85;
        int i16 = -(-((i14 ^ 85) | i15));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        d = i17 % 128;
        int i18 = i17 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p099u.j
    public void n(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 | 39;
        int i4 = (i3 << 1) - ((~(i2 & 39)) & i3);
        c = i4 % 128;
        int i5 = i4 % 2;
        this.h.setSubtitle(charSequence);
        int i6 = d;
        int i7 = ((i6 & 103) - (~(-(-(i6 | 103))))) - 1;
        c = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p099u.j
    public void o(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 & 1;
        int i4 = (i2 ^ 1) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        d = i5 % 128;
        int i6 = i5 % 2;
        this.h.setTitle(charSequence);
        if (i6 != 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p099u.j
    public boolean j() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 & 89;
        int i4 = (i2 | 89) & (~i3);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        d = i6 % 128;
        int i7 = i6 % 2;
        boolean z = this.h.t;
        int i8 = d;
        int i9 = ((i8 | 103) << 1) - (i8 ^ 103);
        c = i9 % 128;
        int i10 = i9 % 2;
        return z;
    }

    @Override // ivas.gov.bisp.enumeration.p099u.j
    public void l(int i) {
        int i2 = 2 % 2;
        int i3 = c;
        int i4 = i3 & 33;
        int i5 = ((i3 ^ 33) | i4) << 1;
        int i6 = -((i3 | 33) & (~i4));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        d = i7 % 128;
        int i8 = i7 % 2;
        this.h.setSubtitle(this.f.getString(i));
        int i9 = c;
        int i10 = (i9 & 37) + (i9 | 37);
        d = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 25 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p099u.j
    public void m(int i) {
        int i2 = 2 % 2;
        int i3 = c;
        int i4 = ((i3 ^ 100) + ((i3 & 100) << 1)) - 1;
        d = i4 % 128;
        int i5 = i4 % 2;
        this.h.setTitle(this.f.getString(i));
        int i6 = c + 19;
        d = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p099u.j
    public void p(boolean z) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = ((i2 | 45) << 1) - (i2 ^ 45);
        d = i3 % 128;
        int i4 = i3 % 2;
        this.b = z;
        this.h.setTitleOptional(z);
        int i5 = d;
        int i6 = i5 ^ 87;
        int i7 = -(-((i5 & 87) << 1));
        int i8 = (i6 & i7) + (i7 | i6);
        c = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x003e  */
    @Override // androidx.appcompat.view.menu.n.aII
    public void e(n nVar) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = (i2 | 15) << 1;
        int i4 = -(((~i2) & 15) | (i2 & (-16)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        c = i5 % 128;
        int i6 = i5 % 2;
        c();
        a aVar = this.h.h;
        int i7 = d;
        int i8 = (-2) - ((((i7 | 44) << 1) - (i7 ^ 44)) ^ (-1));
        c = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 3 / 0;
            if (aVar != null) {
                int i10 = (i7 & 63) + (i7 | 63);
                c = i10 % 128;
                int i11 = i10 % 2;
                aVar.u();
                int i12 = d;
                int i13 = i12 & 35;
                int i14 = ((i12 ^ 35) | i13) << 1;
                int i15 = -((i12 | 35) & (~i13));
                int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
                c = i16 % 128;
                int i17 = i16 % 2;
            }
        } else if (aVar != null) {
            int i18 = (i7 & 63) + (i7 | 63);
            c = i18 % 128;
            int i19 = i18 % 2;
            aVar.u();
            int i110 = d;
            int i111 = i110 & 35;
            int i112 = ((i110 ^ 35) | i111) << 1;
            int i113 = -((i110 | 35) & (~i111));
            int i114 = (i112 ^ i113) + ((i113 & i112) << 1);
            c = i114 % 128;
            int i115 = i114 % 2;
        }
        int i20 = d;
        int i21 = (i20 ^ 15) + ((i20 & 15) << 1);
        c = i21 % 128;
        int i22 = i21 % 2;
    }
}
