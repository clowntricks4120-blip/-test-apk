package ivas.gov.bisp.enumeration.Q;

import android.view.View;
import com.google.android.material.datepicker.j;

/* JADX INFO: loaded from: classes.dex */
public class Q implements View.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ T d;

    public Q(T t, int i) {
        this.d = t;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        J jC;
        T t;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 51;
        int i4 = ((i2 & 51) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        int i8 = this.c;
        J j = this.d.f.f;
        int i9 = a + 43;
        b = i9 % 128;
        if (i9 % 2 != 0) {
            jC = J.c(i8, j.e);
            t = this.d;
            int i10 = 46 / 0;
        } else {
            jC = J.c(i8, j.e);
            t = this.d;
        }
        int i11 = (-2) - ((b + 100) ^ (-1));
        a = i11 % 128;
        if (i11 % 2 == 0) {
            jC.e(t.f.g.b);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        j jVar = t.f.g;
        if (jC.e(jVar.b) < 0) {
            int i12 = a;
            int i13 = i12 | 13;
            int i14 = ((i13 << 1) - (~(-((~(i12 & 13)) & i13)))) - 1;
            b = i14 % 128;
            int i15 = i14 % 2;
            jC = jVar.b;
            int i16 = a;
            int i17 = (-2) - (((i16 & 28) + (i16 | 28)) ^ (-1));
            b = i17 % 128;
            if (i17 % 2 != 0) {
                int i18 = 3 % 2;
            }
        } else if (jC.e(jVar.c) > 0) {
            int i19 = (-2) - ((b + 62) ^ (-1));
            a = i19 % 128;
            int i20 = i19 % 2;
            jC = jVar.c;
            int i21 = b + 3;
            a = i21 % 128;
            int i22 = i21 % 2;
        }
        this.d.f.g(jC);
        int i23 = a;
        int i24 = i23 & 25;
        int i25 = (i23 | 25) & (~i24);
        int i26 = -(-(i24 << 1));
        int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
        b = i27 % 128;
        if (i27 % 2 != 0) {
            this.d.f.f(0);
        } else {
            this.d.f.f(1);
        }
        int i28 = b;
        int i29 = i28 ^ 101;
        int i30 = ((i28 & 101) | i29) << 1;
        int i31 = -i29;
        int i32 = (i30 & i31) + (i30 | i31);
        a = i32 % 128;
        int i33 = i32 % 2;
    }
}
