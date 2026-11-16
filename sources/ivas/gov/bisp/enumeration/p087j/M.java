package ivas.gov.bisp.enumeration.p087j;

import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p100w.r;

/* JADX INFO: loaded from: classes.dex */
public class M implements Runnable {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ LayoutInflaterFactory2C0312o c;

    public class aQD extends r {
        private static int a = 0;
        private static int b = 1;

        public aQD() {
        }

        @Override // ivas.gov.bisp.enumeration.p100w.r, ivas.gov.bisp.enumeration.p081d.v
        public void c(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 ^ 3;
            int i4 = (((i2 & 3) | i3) << 1) - i3;
            b = i4 % 128;
            ActionBarContextView actionBarContextView = (i4 % 2 == 0 ? M.this : M.this).c.u;
            int i5 = a;
            int i6 = i5 & 119;
            int i7 = (((i5 | 119) & (~i6)) - (~(-(-(i6 << 1))))) - 1;
            b = i7 % 128;
            if (i7 % 2 == 0) {
                actionBarContextView.setVisibility(0);
                int i8 = 40 / 0;
            } else {
                actionBarContextView.setVisibility(0);
            }
            int i9 = a;
            int i10 = i9 & 35;
            int i11 = (i10 - (~(-(-((i9 ^ 35) | i10))))) - 1;
            b = i11 % 128;
            if (i11 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.p081d.v
        public void e(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 93;
            int i4 = i3 + ((i2 ^ 93) | i3);
            a = i4 % 128;
            int i5 = i4 % 2;
            M.this.c.u.setAlpha(1.0f);
            int i6 = b + 83;
            a = i6 % 128;
            if (i6 % 2 != 0) {
                M.this.c.x.f(null);
                throw null;
            }
            M.this.c.x.f(null);
            int i7 = b;
            int i8 = (i7 & 37) + (i7 | 37);
            a = i8 % 128;
            int i9 = i8 % 2;
            M.this.c.x = null;
            int i10 = a;
            int i11 = (i10 | 25) << 1;
            int i12 = -(i10 ^ 25);
            int i13 = (i11 & i12) + (i12 | i11);
            b = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
        }
    }

    public M(LayoutInflaterFactory2C0312o layoutInflaterFactory2C0312o) {
        this.c = layoutInflaterFactory2C0312o;
    }

    @Override // java.lang.Runnable
    public void run() {
        PopupWindow popupWindow;
        ActionBarContextView actionBarContextView;
        int i;
        R rD;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 85;
        int i5 = (i3 ^ 85) | i4;
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            LayoutInflaterFactory2C0312o layoutInflaterFactory2C0312o = this.c;
            popupWindow = layoutInflaterFactory2C0312o.w;
            actionBarContextView = layoutInflaterFactory2C0312o.u;
            i = 87;
        } else {
            LayoutInflaterFactory2C0312o layoutInflaterFactory2C0312o2 = this.c;
            popupWindow = layoutInflaterFactory2C0312o2.w;
            actionBarContextView = layoutInflaterFactory2C0312o2.u;
            i = 55;
        }
        int i7 = a;
        int i8 = (i7 & 111) + (i7 | 111);
        b = i8 % 128;
        int i9 = i8 % 2;
        popupWindow.showAtLocation(actionBarContextView, i, 0, 0);
        this.c.L();
        if (this.c.W()) {
            int i10 = a;
            int i11 = ((i10 & 4) + (i10 | 4)) - 1;
            b = i11 % 128;
            int i12 = i11 % 2;
            this.c.u.setAlpha(0.0f);
            LayoutInflaterFactory2C0312o layoutInflaterFactory2C0312o3 = this.c;
            int i13 = b;
            int i14 = (i13 & 7) + (i13 | 7);
            a = i14 % 128;
            if (i14 % 2 != 0) {
                rD = T.d(layoutInflaterFactory2C0312o3.u);
                rD.c(1.0f);
            } else {
                rD = T.d(layoutInflaterFactory2C0312o3.u);
                rD.c(1.0f);
            }
            layoutInflaterFactory2C0312o3.x = rD;
            R r = this.c.x;
            aQD aqd = new aQD();
            int i15 = b;
            int i16 = ((((i15 ^ 5) | (i15 & 5)) << 1) - (~(-(((~i15) & 5) | (i15 & (-6)))))) - 1;
            a = i16 % 128;
            int i17 = i16 % 2;
            View view = r.c.get();
            if (view != null) {
                int i18 = b + 50;
                int i19 = (i18 ^ (-1)) + (i18 << 1);
                a = i19 % 128;
                if (i19 % 2 == 0) {
                    r.h(view, aqd);
                    return;
                } else {
                    r.h(view, aqd);
                    int i20 = 90 / 0;
                    return;
                }
            }
        } else {
            this.c.u.setAlpha(1.0f);
            int i21 = a;
            int i22 = i21 & 81;
            int i23 = (i22 - (~((i21 ^ 81) | i22))) - 1;
            b = i23 % 128;
            int i24 = i23 % 2;
            this.c.u.setVisibility(0);
            int i25 = a + 43;
            b = i25 % 128;
            int i26 = i25 % 2;
        }
        int i27 = a;
        int i28 = i27 ^ 121;
        int i29 = (((i27 & 121) | i28) << 1) - i28;
        b = i29 % 128;
        if (i29 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
