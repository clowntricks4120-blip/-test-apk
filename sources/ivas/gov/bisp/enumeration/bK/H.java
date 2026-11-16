package ivas.gov.bisp.enumeration.bK;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class H extends RecyclerView.OooOo {
    private static int a = 1;
    private static int b;

    public H(int i, int i2, boolean z) {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0046  */
    /* JADX WARN: Code duplicated, block: B:9:0x002f A[PHI: r7
  0x002f: PHI (r7v2 androidx.recyclerview.widget.RecyclerView$o0O0O00) = (r7v1 androidx.recyclerview.widget.RecyclerView$o0O0O00), (r7v16 androidx.recyclerview.widget.RecyclerView$o0O0O00) binds: [B:8:0x002d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public void b(Rect rect, View view, RecyclerView recyclerView, RecyclerView.o0Oo0oo o0oo0oo) {
        RecyclerView.o0O0O00 o0o0o00J;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & (-20)) | ((~i3) & 19);
        int i5 = (i3 & 19) << 1;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            o0o0o00J = RecyclerView.j(view);
            int i7 = 7 / 0;
            if (o0o0o00J != null) {
                i = o0o0o00J.i();
                int i8 = a;
                int i9 = i8 ^ 27;
                int i10 = (i8 & 27) << 1;
                int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                b = i11 % 128;
                int i12 = i11 % 2;
            } else {
                int i13 = b;
                int i14 = i13 & 25;
                int i15 = (((i13 ^ 25) | i14) << 1) - ((i13 | 25) & (~i14));
                a = i15 % 128;
                int i16 = i15 % 2;
                i = -1;
            }
        } else {
            o0o0o00J = RecyclerView.j(view);
            if (o0o0o00J != null) {
                i = o0o0o00J.i();
                int i17 = a;
                int i18 = i17 ^ 27;
                int i19 = (i17 & 27) << 1;
                int i110 = ((i18 | i19) << 1) - (i19 ^ i18);
                b = i110 % 128;
                int i111 = i110 % 2;
            } else {
                int i112 = b;
                int i113 = i112 & 25;
                int i114 = (((i112 ^ 25) | i113) << 1) - ((i112 | 25) & (~i113));
                a = i114 % 128;
                int i115 = i114 % 2;
                i = -1;
            }
        }
        int i20 = i % 2;
        rect.left = (i20 * 5) / 2;
        int i21 = a;
        int i22 = ((i21 ^ 27) | (i21 & 27)) << 1;
        int i23 = -((27 & (~i21)) | (i21 & (-28)));
        int i24 = (i22 & i23) + (i23 | i22);
        b = i24 % 128;
        int i25 = i24 % 2;
        int i26 = -(((i20 - (-1)) * 5) / 2);
        int i27 = i26 | 5;
        int i28 = i27 << 1;
        int i29 = -((~(i26 & 5)) & i27);
        rect.right = ((i28 | i29) << 1) - (i29 ^ i28);
        int i30 = a;
        int i31 = (((i30 | 50) << 1) - (i30 ^ 50)) - 1;
        b = i31 % 128;
        if (i31 % 2 == 0 ? i >= 2 : i >= 3) {
            rect.top = 5;
            int i32 = b;
            int i33 = i32 & 53;
            int i34 = (i32 | 53) & (~i33);
            int i35 = i33 << 1;
            int i36 = (i34 & i35) + (i34 | i35);
            a = i36 % 128;
            int i37 = i36 % 2;
        }
        int i38 = a;
        int i39 = (-2) - ((((i38 | 30) << 1) - (i38 ^ 30)) ^ (-1));
        b = i39 % 128;
        if (i39 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
