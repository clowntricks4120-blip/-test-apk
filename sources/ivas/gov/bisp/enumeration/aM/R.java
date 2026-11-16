package ivas.gov.bisp.enumeration.aM;

import android.annotation.SuppressLint;
import android.view.View;
import ivas.gov.bisp.enumeration.p006af.h;

/* JADX INFO: loaded from: classes.dex */
public class R extends h {
    public static boolean L = true;
    private static int a = 0x00000000;
    private static int b = 0x00000001;

    @Override // ivas.gov.bisp.enumeration.p006af.h
    public void l(View view) {
        int i = 2 % 2;
        int i2 = b + 21;
        a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p006af.h
    public void n(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 75;
        int i4 = ((((i2 & 75) | i3) << 1) - (~(-i3))) - 1;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v18, types: [int] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v12, types: [int] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [float] */
    /* JADX WARN: Type inference failed for: r8v1, types: [float] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    @Override // ivas.gov.bisp.enumeration.p006af.h
    @SuppressLint({"NewApi"})
    public void q(View view, float f) {
        ?? r8;
        ?? r7;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 89;
        int i4 = ((i2 & 89) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 & i5) + (i4 | i5);
        int i7 = i6 % 128;
        a = i7;
        if (i6 % 2 != 0) {
            throw null;
        }
        if (!(!L)) {
            r7 = view;
            r8 = f;
            int i8 = i7 & 63;
            int i9 = -(-((i7 ^ 63) | i8));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            b = i10 % 128;
            ?? r1 = 0;
            try {
                if (i10 % 2 == 0) {
                    view.setTransitionAlpha(f);
                    int i11 = 34 / 0;
                } else {
                    view.setTransitionAlpha(f);
                }
                int i12 = b;
                f = i12 & 85;
                ?? r9 = (i12 ^ 85) | f;
                int i13 = (f & (r9 == true ? 1 : 0)) + ((r9 == true ? 1 : 0) | f);
                view = i13 % 128;
                a = view;
                r1 = i13 % 2;
                if (r1 != 0) {
                    throw null;
                }
                return;
            } catch (NoSuchMethodError unused) {
                L = r1;
                r7 = view;
                r8 = f;
            }
        }
        r7 = view;
        r8 = f;
        r7.setAlpha(r8);
        int i14 = (-2) - ((b + 6) ^ (-1));
        a = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p006af.h
    @SuppressLint({"NewApi"})
    public float m(View view) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 93;
        int i4 = (i3 - (~(-(-((i2 ^ 93) | i3))))) - 1;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        if (L) {
            int i7 = (i5 & (-56)) | ((~i5) & 55);
            int i8 = (i5 & 55) << 1;
            int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
            b = i9 % 128;
            int i10 = i9 % 2;
            try {
                float transitionAlpha = view.getTransitionAlpha();
                int i11 = b;
                int i12 = i11 & 21;
                int i13 = (i11 ^ 21) | i12;
                int i14 = (i12 & i13) + (i13 | i12);
                a = i14 % 128;
                if (i14 % 2 == 0) {
                    return transitionAlpha;
                }
                throw null;
            } catch (NoSuchMethodError unused) {
                L = false;
            }
        }
        float alpha = view.getAlpha();
        int i15 = a;
        int i16 = i15 & 37;
        int i17 = ((i15 | 37) & (~i16)) + (i16 << 1);
        b = i17 % 128;
        int i18 = i17 % 2;
        return alpha;
    }
}
