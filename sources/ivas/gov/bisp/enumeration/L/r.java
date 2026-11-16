package ivas.gov.bisp.enumeration.L;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
public class r<V extends View> extends CoordinatorLayout.OooO0OO<V> {
    private static int a = 1;
    private static int b;
    public e c;
    public int d;

    public r() {
        this.d = 0;
    }

    public void w(CoordinatorLayout coordinatorLayout, V v, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & (-44)) | ((~i3) & 43);
        int i5 = -(-((i3 & 43) << 1));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        coordinatorLayout.z(v, i);
        int i8 = a + 97;
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    public int u() {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & (-4)) | ((~i3) & 3);
        int i5 = (i3 & 3) << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        e eVar = this.c;
        if (eVar != null) {
            int i9 = i7 ^ 109;
            int i10 = ((i7 & 109) | i9) << 1;
            int i11 = -i9;
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            a = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = eVar.f;
                throw null;
            }
            i = eVar.f;
        } else {
            int i14 = i3 & 93;
            int i15 = (((i3 ^ 93) | i14) << 1) - ((i3 | 93) & (~i14));
            b = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 5 / 2;
            }
            i = 0;
        }
        int i17 = a;
        int i18 = i17 & 31;
        int i19 = ((i17 ^ 31) | i18) << 1;
        int i20 = -((i17 | 31) & (~i18));
        int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
        b = i21 % 128;
        if (i21 % 2 == 0) {
            return i;
        }
        throw null;
    }

    public r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0;
    }

    public boolean v(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 59;
        int i5 = ((i3 ^ 59) | i4) << 1;
        int i6 = -((~i4) & (i3 | 59));
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        e eVar = this.c;
        boolean z = false;
        if (eVar == null) {
            this.d = i;
            int i9 = i3 + 83;
            a = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        int i11 = i3 ^ 55;
        int i12 = (i3 & 55) << 1;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        a = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = eVar.f;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (eVar.f != i) {
            int i15 = b;
            int i16 = ((i15 & 124) + (i15 | 124)) - 1;
            a = i16 % 128;
            int i17 = i16 % 2;
            eVar.f = i;
            eVar.c();
            int i18 = a;
            int i19 = ((i18 & (-116)) | ((~i18) & 115)) + ((i18 & 115) << 1);
            b = i19 % 128;
            int i20 = i19 % 2;
            z = true;
        }
        int i21 = a;
        int i22 = ((i21 ^ 49) | (i21 & 49)) << 1;
        int i23 = -(((~i21) & 49) | (i21 & (-50)));
        int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
        b = i24 % 128;
        int i25 = i24 % 2;
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0OO
    public boolean k(CoordinatorLayout coordinatorLayout, V v, int i) {
        int i2 = 2 % 2;
        int i3 = b + 41;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            w(coordinatorLayout, v, i);
            int i4 = 23 / 0;
            if (this.c == null) {
                this.c = new e(v);
                int i5 = b;
                int i6 = ((i5 ^ 113) | (i5 & 113)) << 1;
                int i7 = -(((~i5) & 113) | (i5 & (-114)));
                int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
                a = i8 % 128;
                int i9 = i8 % 2;
            }
        } else {
            w(coordinatorLayout, v, i);
            if (this.c == null) {
                this.c = new e(v);
                int i10 = b;
                int i11 = ((i10 ^ 113) | (i10 & 113)) << 1;
                int i12 = -(((~i10) & 113) | (i10 & (-114)));
                int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                a = i13 % 128;
                int i14 = i13 % 2;
            }
        }
        e eVar = this.c;
        eVar.d = eVar.c.getTop();
        int i15 = (-2) - ((a + 8) ^ (-1));
        b = i15 % 128;
        int i16 = i15 % 2;
        eVar.e = eVar.c.getLeft();
        e eVar2 = this.c;
        int i17 = b;
        int i18 = ((i17 ^ 63) | (i17 & 63)) << 1;
        int i19 = -(((~i17) & 63) | (i17 & (-64)));
        int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
        a = i20 % 128;
        int i21 = i20 % 2;
        eVar2.c();
        int i22 = this.d;
        if (i22 != 0) {
            int i23 = a;
            int i24 = i23 & 59;
            int i25 = ((i23 ^ 59) | i24) << 1;
            int i26 = -((i23 | 59) & (~i24));
            int i27 = (i25 & i26) + (i26 | i25);
            b = i27 % 128;
            if (i27 % 2 != 0) {
                int i28 = this.c.f;
                throw null;
            }
            e eVar3 = this.c;
            if (eVar3.f != i22) {
                int i29 = b + 115;
                a = i29 % 128;
                if (i29 % 2 == 0) {
                    eVar3.f = i22;
                    eVar3.c();
                    throw null;
                }
                eVar3.f = i22;
                eVar3.c();
            }
            this.d = 0;
            int i30 = b;
            int i31 = i30 & 115;
            int i32 = -(-((i30 ^ 115) | i31));
            int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
            a = i33 % 128;
            if (i33 % 2 == 0) {
                int i34 = 5 % 3;
            }
        }
        int i35 = b;
        int i36 = i35 ^ 9;
        int i37 = ((i35 & 9) | i36) << 1;
        int i38 = -i36;
        int i39 = (i37 & i38) + (i37 | i38);
        a = i39 % 128;
        if (i39 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
