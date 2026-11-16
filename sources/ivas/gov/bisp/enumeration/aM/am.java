package ivas.gov.bisp.enumeration.aM;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class am extends A {
    public static boolean P = true;
    private static int a = 1;
    private static int b;

    @Override // ivas.gov.bisp.enumeration.p006af.h
    @SuppressLint({"NewApi"})
    public void p(View view, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 45) + ((i3 & 45) << 1);
        b = i4 % 128;
        if (i4 % 2 == 0 ? Build.VERSION.SDK_INT == 28 : Build.VERSION.SDK_INT == 28) {
            super.p(view, i);
            int i5 = a;
            int i6 = ((i5 ^ 81) | (i5 & 81)) << 1;
            int i7 = -(((~i5) & 81) | (i5 & (-82)));
            int i8 = (i6 & i7) + (i7 | i6);
            b = i8 % 128;
            int i9 = i8 % 2;
            return;
        }
        if (P) {
            int i10 = b;
            int i11 = ((i10 ^ 61) | (i10 & 61)) << 1;
            int i12 = -(((~i10) & 61) | (i10 & (-62)));
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            a = i13 % 128;
            int i14 = i13 % 2;
            try {
                view.setTransitionVisibility(i);
                int i15 = a;
                int i16 = (i15 & 45) + (i15 | 45);
                b = i16 % 128;
                int i17 = i16 % 2;
                return;
            } catch (NoSuchMethodError unused) {
                P = false;
            }
        }
        int i18 = b;
        int i19 = i18 & 107;
        int i20 = ((i18 ^ 107) | i19) << 1;
        int i21 = -((i18 | 107) & (~i19));
        int i22 = (i20 & i21) + (i21 | i20);
        a = i22 % 128;
        if (i22 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
