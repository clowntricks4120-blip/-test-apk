package ivas.gov.bisp.enumeration.L;

import android.view.View;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class e {
    private static int a = 1;
    private static int b;
    public final View c;
    public int d;
    public int e;
    public int f;
    public int g;

    public e(View view) {
        this.c = view;
    }

    public void c() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 6) + ((i2 & 6) << 1)) - 1;
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.c.getTop();
            obj.hashCode();
            throw null;
        }
        View view = this.c;
        int i4 = this.f;
        int top = view.getTop();
        int i5 = a;
        int i6 = i5 & 77;
        int i7 = (i5 | 77) & (~i6);
        int i8 = i6 << 1;
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            WeakHashMap<View, R> weakHashMap = T.c;
            obj.hashCode();
            throw null;
        }
        int i10 = this.d;
        WeakHashMap<View, R> weakHashMap2 = T.c;
        int i11 = -i10;
        int i12 = top ^ i11;
        int i13 = (top & i11) << 1;
        int i14 = -(((i12 | i13) << 1) - (i13 ^ i12));
        int i15 = i4 & i14;
        int i16 = (i4 | i14) & (~i15);
        int i17 = -(-(i15 << 1));
        view.offsetTopAndBottom((i16 ^ i17) + ((i16 & i17) << 1));
        View view2 = this.c;
        int i18 = this.g;
        int i19 = b;
        int i20 = (i19 & 115) + (i19 | 115);
        a = i20 % 128;
        int i21 = i20 % 2;
        int left = view2.getLeft();
        int i22 = this.e;
        int i23 = b + 21;
        a = i23 % 128;
        if (i23 % 2 == 0) {
            int i24 = -(~(left % i22));
            view2.offsetLeftAndRight(((i18 & i24) + (i18 | i24)) - 1);
        } else {
            int i25 = -(~(-i22));
            int i26 = -(((left ^ i25) + ((left & i25) << 1)) - 1);
            int i27 = i18 & i26;
            int i28 = ((i18 ^ i26) | i27) << 1;
            int i29 = -((i18 | i26) & (~i27));
            view2.offsetLeftAndRight((i28 ^ i29) + ((i29 & i28) << 1));
        }
        int i30 = b;
        int i31 = (i30 & 102) + (i30 | 102);
        int i32 = (i31 ^ (-1)) + (i31 << 1);
        a = i32 % 128;
        if (i32 % 2 == 0) {
            throw null;
        }
    }
}
