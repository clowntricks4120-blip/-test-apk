package ivas.gov.bisp.enumeration.aM;

import android.annotation.SuppressLint;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class A extends C0077v {
    public static boolean O = true;
    private static int a = 0;
    private static int b = 1;

    @Override // ivas.gov.bisp.enumeration.p006af.h
    @SuppressLint({"NewApi"})
    public void o(View view, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = (i6 & (-20)) | ((~i6) & 19);
        int i8 = -(-((i6 & 19) << 1));
        int i9 = (i7 & i8) + (i8 | i7);
        a = i9 % 128;
        Object obj = null;
        if (i9 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (O) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
                int i10 = b + 63;
                a = i10 % 128;
                int i11 = i10 % 2;
                return;
            } catch (NoSuchMethodError unused) {
                O = false;
            }
        }
        int i12 = a;
        int i13 = i12 & 59;
        int i14 = ((i12 ^ 59) | i13) << 1;
        int i15 = -((i12 | 59) & (~i13));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        b = i16 % 128;
        if (i16 % 2 == 0) {
            throw null;
        }
    }
}
