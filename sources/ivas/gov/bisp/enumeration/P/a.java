package ivas.gov.bisp.enumeration.P;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p088k.B;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static int a = 1;
    private static int b;
    public static final int[] c = {R.attr.colorPrimary};
    public static final int[] d = {R.attr.colorPrimaryVariant};

    static {
        int i = -(-93);
        int i2 = (i << 1) - i;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        int i5 = ((i3 | 37) << 1) - (i3 ^ 37);
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0061  */
    /* JADX WARN: Code duplicated, block: B:20:0x0098  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:9:0x0042  */
    public static void b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedValue typedValue;
        Resources.Theme theme;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = (i6 ^ 121) + ((i6 & 121) << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ivas.gov.bisp.enumeration.O.r.G, i, i2);
        int i9 = a;
        int i10 = i9 & 67;
        int i11 = (i9 | 67) & (~i10);
        int i12 = -(-(i10 << 1));
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        b = i13 % 128;
        if (i13 % 2 != 0) {
            boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
            typedArrayObtainStyledAttributes.recycle();
            if (z) {
                typedValue = new TypedValue();
                theme = context.getTheme();
                int i14 = a;
                int i15 = ((i14 | 85) << 1) - (i14 ^ 85);
                b = i15 % 128;
                int i16 = i15 % 2;
                if (theme.resolveAttribute(R.attr.isMaterialTheme, typedValue, true)) {
                    int i17 = a;
                    int i18 = (i17 & (-26)) | ((~i17) & 25);
                    int i19 = -(-((i17 & 25) << 1));
                    int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                    b = i20 % 128;
                    i3 = i20 % 2;
                    int i21 = typedValue.type;
                    if (i3 != 0 ? i21 == 18 : i21 == 71) {
                        int i22 = b;
                        int i23 = i22 & 49;
                        int i24 = (i22 ^ 49) | i23;
                        i4 = ((i23 | i24) << 1) - (i24 ^ i23);
                        a = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i25 = 80 / 0;
                            if (typedValue.data == 0) {
                                d(context, d, "Theme.MaterialComponents");
                                int i26 = a + 125;
                                b = i26 % 128;
                                int i27 = i26 % 2;
                            }
                        } else if (typedValue.data == 0) {
                            d(context, d, "Theme.MaterialComponents");
                            int i28 = a + 125;
                            b = i28 % 128;
                            int i29 = i28 % 2;
                        }
                    }
                } else {
                    d(context, d, "Theme.MaterialComponents");
                    int i210 = a + 125;
                    b = i210 % 128;
                    int i211 = i210 % 2;
                }
            }
        } else {
            boolean z2 = typedArrayObtainStyledAttributes.getBoolean(1, false);
            typedArrayObtainStyledAttributes.recycle();
            if (z2) {
                typedValue = new TypedValue();
                theme = context.getTheme();
                int i110 = a;
                int i111 = ((i110 | 85) << 1) - (i110 ^ 85);
                b = i111 % 128;
                int i112 = i111 % 2;
                if (theme.resolveAttribute(R.attr.isMaterialTheme, typedValue, true)) {
                    int i113 = a;
                    int i114 = (i113 & (-26)) | ((~i113) & 25);
                    int i115 = -(-((i113 & 25) << 1));
                    int i212 = (i114 ^ i115) + ((i115 & i114) << 1);
                    b = i212 % 128;
                    i3 = i212 % 2;
                    int i213 = typedValue.type;
                    if (i3 != 0) {
                        int i214 = b;
                        int i215 = i214 & 49;
                        int i216 = (i214 ^ 49) | i215;
                        i4 = ((i215 | i216) << 1) - (i216 ^ i215);
                        a = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i217 = 80 / 0;
                            if (typedValue.data == 0) {
                                d(context, d, "Theme.MaterialComponents");
                                int i218 = a + 125;
                                b = i218 % 128;
                                int i219 = i218 % 2;
                            }
                        } else if (typedValue.data == 0) {
                            d(context, d, "Theme.MaterialComponents");
                            int i2110 = a + 125;
                            b = i2110 % 128;
                            int i2111 = i2110 % 2;
                        }
                    } else {
                        int i2112 = b;
                        int i2113 = i2112 & 49;
                        int i2114 = (i2112 ^ 49) | i2113;
                        i4 = ((i2113 | i2114) << 1) - (i2114 ^ i2113);
                        a = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i2115 = 80 / 0;
                            if (typedValue.data == 0) {
                                d(context, d, "Theme.MaterialComponents");
                                int i2116 = a + 125;
                                b = i2116 % 128;
                                int i2117 = i2116 % 2;
                            }
                        } else if (typedValue.data == 0) {
                            d(context, d, "Theme.MaterialComponents");
                            int i2118 = a + 125;
                            b = i2118 % 128;
                            int i2119 = i2118 % 2;
                        }
                    }
                } else {
                    d(context, d, "Theme.MaterialComponents");
                    int i21110 = a + 125;
                    b = i21110 % 128;
                    int i21111 = i21110 % 2;
                }
            }
        }
        d(context, c, "Theme.AppCompat");
        int i30 = b;
        int i31 = i30 & 99;
        int i32 = (((i30 ^ 99) | i31) << 1) - ((i30 | 99) & (~i31));
        a = i32 % 128;
        if (i32 % 2 == 0) {
            throw null;
        }
    }

    public static TypedArray e(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (i4 ^ 75) + ((i4 & 75) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        b(context, attributeSet, i, i2);
        int i7 = b;
        int i8 = ((i7 & 100) + (i7 | 100)) - 1;
        a = i8 % 128;
        if (i8 % 2 != 0) {
            c(context, attributeSet, iArr, i, i2, iArr2);
            return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        }
        c(context, attributeSet, iArr, i, i2, iArr2);
        context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        throw null;
    }

    public static void d(Context context, int[] iArr, String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 111;
        int i4 = i3 + ((i2 ^ 111) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        int i6 = 0;
        while (i6 < iArr.length) {
            int i7 = b;
            int i8 = ((i7 | 3) << 1) - (i7 ^ 3);
            a = i8 % 128;
            int i9 = i8 % 2;
            if (!typedArrayObtainStyledAttributes.hasValue(i6)) {
                int i10 = a;
                int i11 = (i10 ^ 15) + ((i10 & 15) << 1);
                b = i11 % 128;
                int i12 = i11 % 2;
                typedArrayObtainStyledAttributes.recycle();
                boolean z = i12 != 0;
                int i13 = a;
                int i14 = ((i13 | 37) << 1) - (i13 ^ 37);
                b = i14 % 128;
                int i15 = i14 % 2;
                if (!z) {
                    throw new IllegalArgumentException(ivas.gov.bisp.enumeration.p091n.j.t("The style on this component requires your app theme to be ", str, " (or a descendant)."));
                }
                int i16 = b;
                int i17 = i16 & 37;
                int i18 = (i16 | 37) & (~i17);
                int i19 = i17 << 1;
                int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
                a = i20 % 128;
                int i21 = i20 % 2;
            }
            int i22 = (-2) - ((i6 + 55) ^ (-1));
            i6 = ((i22 & (-53)) << 1) + ((i22 & 52) | ((~i22) & (-53)));
            int i23 = a;
            int i24 = i23 ^ 39;
            int i25 = ((i23 & 39) | i24) << 1;
            int i26 = -i24;
            int i27 = (i25 & i26) + (i25 | i26);
            b = i27 % 128;
            int i28 = i27 % 2;
        }
        typedArrayObtainStyledAttributes.recycle();
        int i29 = b + 117;
        a = i29 % 128;
        int i30 = i29 % 2;
        int i110 = b;
        int i111 = i110 & 37;
        int i112 = (i110 | 37) & (~i111);
        int i113 = i111 << 1;
        int i210 = ((i112 | i113) << 1) - (i112 ^ i113);
        a = i210 % 128;
        int i211 = i210 % 2;
    }

    public static B f(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = ((i4 | 37) << 1) - (i4 ^ 37);
        a = i5 % 128;
        int i6 = i5 % 2;
        b(context, attributeSet, i, i2);
        c(context, attributeSet, iArr, i, i2, iArr2);
        B b2 = new B(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
        int i7 = b;
        int i8 = i7 & 15;
        int i9 = (((i7 ^ 15) | i8) << 1) - ((i7 | 15) & (~i8));
        a = i9 % 128;
        int i10 = i9 % 2;
        return b2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r2.getBoolean(2, false) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r15 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        r6 = ivas.gov.bisp.enumeration.P.a.a;
        r7 = r6 & 121;
        r8 = ((~r7) & (r6 | 121)) + (r7 << 1);
        ivas.gov.bisp.enumeration.P.a.b = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if ((r8 % 2) != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r15.length == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        r6 = r6 + 81;
        ivas.gov.bisp.enumeration.P.a.b = r6 % 128;
        r6 = r6 % 2;
        r10 = r10.obtainStyledAttributes(r11, r12, r13, r14);
        r11 = ivas.gov.bisp.enumeration.P.a.b;
        r12 = r11 & 87;
        r12 = (r12 - (~((r11 ^ 87) | r12))) - 1;
        ivas.gov.bisp.enumeration.P.a.a = r12 % 128;
        r12 = r12 % 2;
        r12 = r15.length;
        r13 = r11 ^ 85;
        r11 = (((r11 & 85) | r13) << 1) - r13;
        ivas.gov.bisp.enumeration.P.a.a = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
    
        if ((r11 % 2) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        r11 = 5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        if (r11 >= r12) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        r13 = ivas.gov.bisp.enumeration.P.a.a;
        r14 = r13 & 31;
        r14 = (r14 - (~(-(-((r13 ^ 31) | r14))))) - 1;
        ivas.gov.bisp.enumeration.P.a.b = r14 % 128;
        r14 = r14 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
    
        if (r10.getResourceId(r15[r11], -1) != (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a5, code lost:
    
        r11 = ivas.gov.bisp.enumeration.P.a.a;
        r12 = ((r11 | 19) << 1) - (r11 ^ 19);
        ivas.gov.bisp.enumeration.P.a.b = r12 % 128;
        r12 = r12 % 2;
        r10.recycle();
        r10 = ivas.gov.bisp.enumeration.P.a.a;
        r11 = (r10 ^ 55) + ((r10 & 55) << 1);
        ivas.gov.bisp.enumeration.P.a.b = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c3, code lost:
    
        r11 = r11 + 1;
        r13 = ivas.gov.bisp.enumeration.P.a.a;
        r14 = ((r13 & 102) + (r13 | 102)) - 1;
        ivas.gov.bisp.enumeration.P.a.b = r14 % 128;
        r14 = r14 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d3, code lost:
    
        r10.recycle();
        r10 = ivas.gov.bisp.enumeration.P.a.a;
        r11 = r10 & 107;
        r10 = -(-((r10 ^ 107) | r11));
        r12 = (r11 ^ r10) + ((r10 & r11) << 1);
        ivas.gov.bisp.enumeration.P.a.b = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ea, code lost:
    
        r10 = r15.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00eb, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f0, code lost:
    
        if (r2.getResourceId(0, -1) == (-1)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f2, code lost:
    
        r10 = ivas.gov.bisp.enumeration.P.a.a;
        r11 = r10 & 17;
        r10 = -(-(r10 | 17));
        r12 = (r11 & r10) + (r10 | r11);
        ivas.gov.bisp.enumeration.P.a.b = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0103, code lost:
    
        if ((r12 % 2) == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0105, code lost:
    
        r10 = 4 / 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0108, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0109, code lost:
    
        r2.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010c, code lost:
    
        if (r1 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010e, code lost:
    
        r10 = ivas.gov.bisp.enumeration.P.a.b;
        r11 = (r10 & (-76)) | ((~r10) & 75);
        r10 = -(-((r10 & 75) << 1));
        r12 = (r11 ^ r10) + ((r10 & r11) << 1);
        ivas.gov.bisp.enumeration.P.a.a = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0125, code lost:
    
        if ((r12 % 2) == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0127, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0128, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0133, code lost:
    
        throw new java.lang.IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0134, code lost:
    
        r10 = ivas.gov.bisp.enumeration.P.a.a;
        r11 = (r10 & (-102)) | ((~r10) & 101);
        r10 = (r10 & 101) << 1;
        r12 = ((r11 | r10) << 1) - (r10 ^ r11);
        ivas.gov.bisp.enumeration.P.a.b = r12 % 128;
        r12 = r12 % 2;
        r2.recycle();
        r10 = ivas.gov.bisp.enumeration.P.a.b + 39;
        ivas.gov.bisp.enumeration.P.a.a = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0155, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if ((!r2.getBoolean(2, false)) != false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(android.content.Context r10, android.util.AttributeSet r11, int[] r12, int r13, int r14, int... r15) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.P.a.c(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }
}
