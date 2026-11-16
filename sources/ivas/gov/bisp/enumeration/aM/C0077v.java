package ivas.gov.bisp.enumeration.aM;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aM.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0077v extends R {
    public static boolean M = true;
    public static boolean N = true;
    private static int a = 0;
    private static int b = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:12:0x002c A[Catch: NoSuchMethodError -> 0x0050, TRY_ENTER, TRY_LEAVE, TryCatch #1 {NoSuchMethodError -> 0x0050, blocks: (B:12:0x002c, B:15:0x0047, B:16:0x004a, B:17:0x004d), top: B:27:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0047 A[Catch: NoSuchMethodError -> 0x0050, TRY_ENTER, TRY_LEAVE, TryCatch #1 {NoSuchMethodError -> 0x0050, blocks: (B:12:0x002c, B:15:0x0047, B:16:0x004a, B:17:0x004d), top: B:27:0x002a }] */
    @Override // ivas.gov.bisp.enumeration.p006af.h
    @SuppressLint({"NewApi"})
    public void r(View view, Matrix matrix) {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 67;
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
            if (M) {
                int i6 = i3 & 19;
                i = i6 + ((i3 ^ 19) | i6);
                a = i % 128;
                try {
                    if (i % 2 == 0) {
                        view.transformMatrixToGlobal(matrix);
                        obj.hashCode();
                        throw null;
                    }
                    view.transformMatrixToGlobal(matrix);
                    int i7 = b;
                    int i8 = (i7 | 59) << 1;
                    int i9 = -(((~i7) & 59) | (i7 & (-60)));
                    int i10 = (i8 & i9) + (i9 | i8);
                    a = i10 % 128;
                    int i11 = i10 % 2;
                    return;
                } catch (NoSuchMethodError unused) {
                    M = false;
                }
            }
        } else if (!(!M)) {
            int i12 = i3 & 19;
            i = i12 + ((i3 ^ 19) | i12);
            a = i % 128;
            if (i % 2 == 0) {
                view.transformMatrixToGlobal(matrix);
                obj.hashCode();
                throw null;
            }
            view.transformMatrixToGlobal(matrix);
            int i13 = b;
            int i14 = (i13 | 59) << 1;
            int i15 = -(((~i13) & 59) | (i13 & (-60)));
            int i16 = (i14 & i15) + (i15 | i14);
            a = i16 % 128;
            int i17 = i16 % 2;
            return;
        }
        int i18 = b;
        int i19 = (i18 | 7) << 1;
        int i20 = -(((~i18) & 7) | (i18 & (-8)));
        int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
        a = i21 % 128;
        if (i21 % 2 != 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p006af.h
    @SuppressLint({"NewApi"})
    public void s(View view, Matrix matrix) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 31;
        int i4 = (((i2 ^ 31) | i3) << 1) - ((i2 | 31) & (~i3));
        int i5 = i4 % 128;
        a = i5;
        Object obj = null;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (N) {
            int i6 = ((i5 ^ 22) + ((i5 & 22) << 1)) - 1;
            b = i6 % 128;
            int i7 = i6 % 2;
            try {
                view.transformMatrixToLocal(matrix);
                int i8 = a;
                int i9 = i8 ^ 85;
                int i10 = (i8 & 85) << 1;
                int i11 = (i9 & i10) + (i10 | i9);
                b = i11 % 128;
                if (i11 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            } catch (NoSuchMethodError unused) {
                N = false;
            }
        }
        int i12 = b + 3;
        a = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }
}
