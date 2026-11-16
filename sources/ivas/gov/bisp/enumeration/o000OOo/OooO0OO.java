package ivas.gov.bisp.enumeration.o000OOo;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.n;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p095o0000oO.OooOO0;
import ivas.gov.bisp.enumeration.p095o0000oO.OooOOO;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class OooO0OO extends OooOOO {
    private static int a = 0;
    private static int b = 1;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public boolean K;
    public int[] L;

    public OooO0OO(Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.H = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.I = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.J = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.G = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
        this.L = new int[5];
    }

    @Override // ivas.gov.bisp.enumeration.p095o0000oO.OooOOO
    public OooOO0 k(Context context) {
        int i = 2 % 2;
        OooO0O0 oooO0O0 = new OooO0O0(context);
        int i2 = a + 60;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 65 / 0;
        }
        return oooO0O0;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 7;
        int i4 = (((~i3) & (i2 | 7)) - (~(-(-(i3 << 1))))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        this.K = z;
        int i6 = i2 + 37;
        a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 79 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0074 A[PHI: r4
  0x0074: PHI (r4v13 android.view.View) = (r4v5 android.view.View), (r4v20 android.view.View) binds: [B:16:0x0072, B:13:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x007c  */
    /* JADX WARN: Code duplicated, block: B:21:0x008c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0090  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:28:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:30:0x0111  */
    /* JADX WARN: Code duplicated, block: B:31:0x0118  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount;
        int i5;
        View childAt;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = 2 % 2;
        int i12 = a;
        int i13 = (i12 & 75) + (i12 | 75);
        b = i13 % 128;
        if (i13 % 2 == 0) {
            childCount = getChildCount();
            i5 = (-2) - ((i4 - (~i2)) ^ (-1));
        } else {
            childCount = getChildCount();
            int i14 = -i2;
            int i15 = i4 & i14;
            int i16 = -(-(i14 | i4));
            i5 = ((i15 | i16) << 1) - (i16 ^ i15);
        }
        int i17 = a;
        int i18 = i17 & 99;
        int i19 = (i17 ^ 99) | i18;
        int i20 = (i18 & i19) + (i19 | i18);
        b = i20 % 128;
        if (i20 % 2 == 0) {
            throw null;
        }
        int i21 = 0;
        int i22 = 0;
        while (i21 < childCount) {
            int i23 = a;
            int i24 = (((i23 ^ 95) | (i23 & 95)) << 1) - (((~i23) & 95) | (i23 & (-96)));
            b = i24 % 128;
            if (i24 % 2 == 0) {
                childAt = getChildAt(i21);
                if (childAt.getVisibility() != 96) {
                    WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
                    if (T.aWY.f(this) == 1) {
                        int i25 = b;
                        i8 = ((i25 | 125) << 1) - (i25 ^ 125);
                        int i26 = i8 % 128;
                        a = i26;
                        if (i8 % 2 != 0) {
                            i9 = (i3 % i) % i22;
                        } else {
                            int i27 = -i;
                            int i28 = ((((i3 ^ i27) | (i3 & i27)) << 1) - (~(-((i27 & (~i3)) | ((~i27) & i3))))) - 1;
                            int i29 = -i22;
                            int i30 = i28 | i29;
                            int i31 = i30 << 1;
                            int i32 = -((~(i29 & i28)) & i30);
                            i9 = (i32 | i31) + (i31 & i32);
                        }
                        int i33 = i26 & 123;
                        int i34 = -(-((i26 ^ 123) | i33));
                        i10 = ((i33 | i34) << 1) - (i34 ^ i33);
                        b = i10 % 128;
                        if (i10 % 2 == 0) {
                            childAt.layout(i9 >>> childAt.getMeasuredWidth(), 0, i9, i5);
                        } else {
                            int i35 = -childAt.getMeasuredWidth();
                            int i36 = ((~i35) & i9) | ((~i9) & i35);
                            int i37 = -(-((i35 & i9) << 1));
                            childAt.layout((i36 & i37) + (i37 | i36), 0, i9, i5);
                        }
                        int i38 = a;
                        int i39 = i38 ^ 83;
                        int i40 = ((((i38 & 83) | i39) << 1) - (~(-i39))) - 1;
                        b = i40 % 128;
                        int i41 = i40 % 2;
                    } else {
                        int measuredWidth = childAt.getMeasuredWidth();
                        int i42 = -(-i22);
                        int i43 = measuredWidth ^ i42;
                        int i44 = ((measuredWidth & i42) | i43) << 1;
                        int i45 = -i43;
                        i6 = (i44 & i45) + (i44 | i45);
                        int i46 = a;
                        i7 = ((i46 & 78) + (i46 | 78)) - 1;
                        b = i7 % 128;
                        if (i7 % 2 == 0) {
                            childAt.layout(i22, 0, i6, i5);
                            int i47 = 92 / 0;
                        } else {
                            childAt.layout(i22, 0, i6, i5);
                        }
                    }
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    int i48 = i22 & measuredWidth2;
                    int i49 = -(-((i22 ^ measuredWidth2) | i48));
                    i22 = (i49 | i48) + (i48 & i49);
                    int i50 = a;
                    int i51 = (i50 ^ 81) + ((i50 & 81) << 1);
                    b = i51 % 128;
                    int i52 = i51 % 2;
                }
            } else {
                childAt = getChildAt(i21);
                if (childAt.getVisibility() != 8) {
                    WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap2 = T.c;
                    if (T.aWY.f(this) == 1) {
                        int i210 = b;
                        i8 = ((i210 | 125) << 1) - (i210 ^ 125);
                        int i211 = i8 % 128;
                        a = i211;
                        if (i8 % 2 != 0) {
                            i9 = (i3 % i) % i22;
                        } else {
                            int i212 = -i;
                            int i213 = ((((i3 ^ i212) | (i3 & i212)) << 1) - (~(-((i212 & (~i3)) | ((~i212) & i3))))) - 1;
                            int i214 = -i22;
                            int i310 = i213 | i214;
                            int i311 = i310 << 1;
                            int i312 = -((~(i214 & i213)) & i310);
                            i9 = (i312 | i311) + (i311 & i312);
                        }
                        int i313 = i211 & 123;
                        int i314 = -(-((i211 ^ 123) | i313));
                        i10 = ((i313 | i314) << 1) - (i314 ^ i313);
                        b = i10 % 128;
                        if (i10 % 2 == 0) {
                            childAt.layout(i9 >>> childAt.getMeasuredWidth(), 0, i9, i5);
                        } else {
                            int i315 = -childAt.getMeasuredWidth();
                            int i316 = ((~i315) & i9) | ((~i9) & i315);
                            int i317 = -(-((i315 & i9) << 1));
                            childAt.layout((i316 & i317) + (i317 | i316), 0, i9, i5);
                        }
                        int i318 = a;
                        int i319 = i318 ^ 83;
                        int i410 = ((((i318 & 83) | i319) << 1) - (~(-i319))) - 1;
                        b = i410 % 128;
                        int i411 = i410 % 2;
                    } else {
                        int measuredWidth3 = childAt.getMeasuredWidth();
                        int i412 = -(-i22);
                        int i413 = measuredWidth3 ^ i412;
                        int i414 = ((measuredWidth3 & i412) | i413) << 1;
                        int i415 = -i413;
                        i6 = (i414 & i415) + (i414 | i415);
                        int i416 = a;
                        i7 = ((i416 & 78) + (i416 | 78)) - 1;
                        b = i7 % 128;
                        if (i7 % 2 == 0) {
                            childAt.layout(i22, 0, i6, i5);
                            int i417 = 92 / 0;
                        } else {
                            childAt.layout(i22, 0, i6, i5);
                        }
                    }
                    int measuredWidth4 = childAt.getMeasuredWidth();
                    int i418 = i22 & measuredWidth4;
                    int i419 = -(-((i22 ^ measuredWidth4) | i418));
                    i22 = (i419 | i418) + (i418 & i419);
                    int i53 = a;
                    int i54 = (i53 ^ 81) + ((i53 & 81) << 1);
                    b = i54 % 128;
                    int i55 = i54 % 2;
                }
            }
            int i56 = (i21 ^ (-19)) + ((i21 & (-19)) << 1);
            i21 = (i56 & 20) + (i56 | 20);
            int i57 = a;
            int i58 = (i57 ^ 3) + ((i57 & 3) << 1);
            b = i58 % 128;
            int i59 = i58 % 2;
        }
        int i60 = a;
        int i61 = i60 & 81;
        int i62 = (((i60 ^ 81) | i61) << 1) - ((i60 | 81) & (~i61));
        b = i62 % 128;
        int i63 = i62 % 2;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        n menu;
        int size;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = 2 % 2;
        int i13 = a + 11;
        b = i13 % 128;
        if (i13 % 2 == 0) {
            menu = getMenu();
            size = View.MeasureSpec.getSize(i);
            int i14 = 12 / 0;
        } else {
            menu = getMenu();
            size = View.MeasureSpec.getSize(i);
        }
        int size2 = menu.n().size();
        int childCount = getChildCount();
        int i15 = b;
        int i16 = (-2) - (((i15 & 34) + (i15 | 34)) ^ (-1));
        a = i16 % 128;
        int i17 = i16 % 2;
        int size3 = View.MeasureSpec.getSize(i2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        int i18 = a;
        int i19 = (i18 & (-26)) | ((~i18) & 25);
        int i20 = (i18 & 25) << 1;
        int i21 = (i19 & i20) + (i20 | i19);
        b = i21 % 128;
        if (i21 % 2 == 0) {
            j(getLabelVisibilityMode(), size2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!j(getLabelVisibilityMode(), size2) || (!this.K)) {
            if (size2 == 0) {
                int i22 = b;
                int i23 = ((i22 ^ 96) + ((i22 & 96) << 1)) - 1;
                a = i23 % 128;
                int i24 = i23 % 2;
                int i25 = ((i22 ^ 95) - (~(-(-((i22 & 95) << 1))))) - 1;
                a = i25 % 128;
                int i26 = i25 % 2;
                i3 = 1;
            } else {
                int i27 = b;
                int i28 = (i27 & 9) + (i27 | 9);
                a = i28 % 128;
                int i29 = i28 % 2;
                i3 = size2;
            }
            int iMin = Math.min(size / i3, this.J);
            int i30 = b;
            int i31 = i30 & 99;
            int i32 = -(-(i30 | 99));
            int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
            int i34 = i33 % 128;
            a = i34;
            if (i33 % 2 != 0) {
                i4 = size * (size2 + iMin);
                i5 = 1;
            } else {
                int i35 = -(~(-(size2 * iMin)));
                i4 = ((size ^ i35) + ((i35 & size) << 1)) - 1;
                i5 = 0;
            }
            int i36 = i34 + 113;
            b = i36 % 128;
            int i37 = i36 % 2;
            while (i5 < childCount) {
                int i38 = a;
                int i39 = ((i38 & (-14)) | ((~i38) & 13)) + ((i38 & 13) << 1);
                b = i39 % 128;
                if (i39 % 2 != 0 ? getChildAt(i5).getVisibility() == 8 : getChildAt(i5).getVisibility() == 120) {
                    this.L[i5] = 0;
                    int i40 = b;
                    int i41 = ((i40 ^ 41) - (~((i40 & 41) << 1))) - 1;
                    a = i41 % 128;
                    int i42 = i41 % 2;
                } else {
                    int i43 = b;
                    int i44 = i43 & 119;
                    int i45 = ((~i44) & (i43 | 119)) + (i44 << 1);
                    a = i45 % 128;
                    int i46 = i45 % 2;
                    int[] iArr = this.L;
                    iArr[i5] = iMin;
                    int i47 = i43 & 25;
                    int i48 = (i43 | 25) & (~i47);
                    int i49 = i47 << 1;
                    int i50 = (i48 ^ i49) + ((i48 & i49) << 1);
                    int i51 = i50 % 128;
                    a = i51;
                    int i52 = i50 % 2;
                    if (i4 > 0) {
                        int i53 = i51 + 5;
                        int i54 = i53 % 128;
                        b = i54;
                        int i55 = i53 % 2;
                        iArr[i5] = iMin + 1;
                        int i56 = (i54 & (-26)) | ((~i54) & 25);
                        int i57 = (i54 & 25) << 1;
                        int i58 = (i56 & i57) + (i56 | i57);
                        a = i58 % 128;
                        int i59 = i58 % 2;
                        int i60 = -(-((i4 ^ (-1)) | i4));
                        int i61 = (i4 ^ i60) + ((i4 & i60) << 1);
                        int i62 = i54 & 97;
                        int i63 = i62 + ((i54 ^ 97) | i62);
                        a = i63 % 128;
                        int i64 = i63 % 2;
                        i4 = i61;
                    }
                }
                int i65 = ((i5 ^ 1) | (i5 & 1)) << 1;
                int i66 = -(((~i5) & 1) | (i5 & (-2)));
                i5 = ((i66 & i65) << 1) + (i65 ^ i66);
                int i67 = a;
                int i68 = (((i67 ^ 29) | (i67 & 29)) << 1) - (((~i67) & 29) | (i67 & (-30)));
                b = i68 % 128;
                int i69 = i68 % 2;
            }
        } else {
            int i70 = b;
            int i71 = ((i70 | 83) << 1) - (i70 ^ 83);
            a = i71 % 128;
            if (i71 % 2 != 0) {
                getChildAt(getSelectedItemPosition());
                throw null;
            }
            View childAt = getChildAt(getSelectedItemPosition());
            int iMax = this.G;
            int i72 = a;
            int i73 = i72 ^ 99;
            int i74 = ((i72 & 99) | i73) << 1;
            int i75 = -i73;
            int i76 = (i74 & i75) + (i75 | i74);
            b = i76 % 128;
            int i77 = i76 % 2;
            if (childAt.getVisibility() != 8) {
                int i78 = b;
                int i79 = i78 & 61;
                int i80 = (~i79) & (i78 | 61);
                int i81 = -(-(i79 << 1));
                int i82 = (i80 ^ i81) + ((i80 & i81) << 1);
                a = i82 % 128;
                int i83 = i82 % 2;
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.J, Integer.MIN_VALUE);
                int i84 = a;
                int i85 = i84 & 15;
                int i86 = (i84 ^ 15) | i85;
                int i87 = (i85 ^ i86) + ((i86 & i85) << 1);
                b = i87 % 128;
                int i88 = i87 % 2;
                childAt.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
                int measuredWidth = childAt.getMeasuredWidth();
                int i89 = b;
                int i90 = ((~i89) & 75) | (i89 & (-76));
                int i91 = (i89 & 75) << 1;
                int i92 = (i90 ^ i91) + ((i91 & i90) << 1);
                a = i92 % 128;
                int i93 = i92 % 2;
                iMax = Math.max(iMax, measuredWidth);
                int i94 = b;
                int i95 = ((i94 | 117) << 1) - (i94 ^ 117);
                a = i95 % 128;
                int i96 = i95 % 2;
            }
            if (childAt.getVisibility() != 8) {
                int i97 = b;
                int i98 = ((i97 | 97) << 1) - (i97 ^ 97);
                a = i98 % 128;
                i6 = (i98 % 2 != 0 ? 1 : 0) ^ 1;
                int i99 = (i97 & (-6)) | ((~i97) & 5);
                int i100 = (i97 & 5) << 1;
                int i101 = ((i99 | i100) << 1) - (i100 ^ i99);
                a = i101 % 128;
                int i102 = i101 % 2;
            } else {
                int i103 = b;
                int i104 = ((i103 | 65) << 1) - (i103 ^ 65);
                a = i104 % 128;
                int i105 = i104 % 2;
                i6 = 0;
            }
            int i106 = (size2 - (~(-i6))) - 1;
            int i107 = this.I;
            int i108 = this.J;
            int i109 = a;
            int i110 = (i109 | 101) << 1;
            int i111 = -(i109 ^ 101);
            int i112 = (i110 ^ i111) + ((i111 & i110) << 1);
            b = i112 % 128;
            if (i112 % 2 == 0) {
                i7 = (i107 << i106) * size;
            } else {
                int i113 = -(i107 * i106);
                int i114 = (size | i113) << 1;
                int i115 = -(i113 ^ size);
                i7 = ((i114 | i115) << 1) - (i115 ^ i114);
            }
            int iMin2 = Math.min(i7, Math.min(iMax, i108));
            int i116 = -iMin2;
            int i117 = size & i116;
            int i118 = ((size | i116) & (~i117)) + (i117 << 1);
            if (i106 == 0) {
                int i119 = a;
                int i120 = (i119 ^ 64) + ((i119 & 64) << 1);
                int i121 = (i120 ^ (-1)) + (i120 << 1);
                int i122 = i121 % 128;
                b = i122;
                int i123 = i121 % 2;
                int i124 = (-2) - (((i122 ^ 68) + ((i122 & 68) << 1)) ^ (-1));
                a = i124 % 128;
                int i125 = i124 % 2;
                i8 = 1;
            } else {
                int i126 = a;
                int i127 = i126 & 105;
                int i128 = (i126 | 105) & (~i127);
                int i129 = -(-(i127 << 1));
                int i130 = (i128 ^ i129) + ((i128 & i129) << 1);
                b = i130 % 128;
                int i131 = i130 % 2;
                i8 = i106;
            }
            int iMin3 = Math.min(i118 / i8, this.H);
            int i132 = b + 7;
            int i133 = i132 % 128;
            a = i133;
            if (i132 % 2 != 0) {
                int i134 = -iMin3;
                int i135 = ((i106 ^ i134) | (i106 & i134)) << 1;
                int i136 = -(((~i106) & i134) | ((~i134) & i106));
                i9 = i118 >> ((i135 ^ i136) + ((i136 & i135) << 1));
                i10 = 1;
            } else {
                i9 = (i118 - (~(-(i106 * iMin3)))) - 1;
                i10 = 0;
            }
            int i137 = i133 & 11;
            int i138 = (i133 ^ 11) | i137;
            int i139 = (i137 ^ i138) + ((i137 & i138) << 1);
            b = i139 % 128;
            int i140 = i139 % 2;
            while (i10 < childCount) {
                int i141 = (-2) - ((a + 120) ^ (-1));
                b = i141 % 128;
                if (i141 % 2 != 0 ? getChildAt(i10).getVisibility() == 8 : getChildAt(i10).getVisibility() == 14) {
                    this.L[i10] = 0;
                    int i142 = a;
                    int i143 = (((i142 | 46) << 1) - (i142 ^ 46)) - 1;
                    b = i143 % 128;
                    int i144 = i143 % 2;
                } else {
                    int[] iArr2 = this.L;
                    if (i10 == getSelectedItemPosition()) {
                        int i145 = b;
                        int i146 = i145 & 103;
                        int i147 = (i145 ^ 103) | i146;
                        int i148 = (i146 ^ i147) + ((i147 & i146) << 1);
                        int i149 = i148 % 128;
                        a = i149;
                        if (i148 % 2 != 0) {
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        int i150 = i149 & 21;
                        int i151 = (((i149 ^ 21) | i150) << 1) - ((i149 | 21) & (~i150));
                        b = i151 % 128;
                        int i152 = i151 % 2;
                        i11 = iMin2;
                    } else {
                        int i153 = a + 37;
                        b = i153 % 128;
                        int i154 = i153 % 2;
                        i11 = iMin3;
                    }
                    iArr2[i10] = i11;
                    if (i9 > 0) {
                        int i155 = b;
                        int i156 = i155 | 93;
                        int i157 = ((i156 << 1) - (~(-((~(i155 & 93)) & i156)))) - 1;
                        int i158 = i157 % 128;
                        a = i158;
                        int i159 = i157 % 2;
                        int[] iArr3 = this.L;
                        int i160 = i158 & 3;
                        int i161 = (i160 - (~((i158 ^ 3) | i160))) - 1;
                        b = i161 % 128;
                        int i162 = i161 % 2;
                        int i163 = iArr3[i10];
                        int i164 = i163 & 1;
                        iArr3[i10] = (i164 - (~((i163 ^ 1) | i164))) - 1;
                        int i165 = ((i9 ^ (-1)) | i9) << 1;
                        int i166 = -(~i9);
                        int i167 = (i165 ^ i166) + ((i166 & i165) << 1);
                        int i168 = i158 & 35;
                        int i169 = (i158 ^ 35) | i168;
                        int i170 = ((i168 | i169) << 1) - (i168 ^ i169);
                        b = i170 % 128;
                        int i171 = i170 % 2;
                        i9 = i167;
                    }
                }
                int i172 = i10 & (-74);
                int i173 = i172 + ((i10 ^ (-74)) | i172);
                int i174 = i173 & 75;
                int i175 = -(-(i173 | 75));
                i10 = ((i174 & i175) << 1) + (i174 ^ i175);
            }
        }
        int i176 = 0;
        int i177 = 0;
        while (i176 < childCount) {
            int i178 = a;
            int i179 = i178 & 15;
            int i180 = (i178 ^ 15) | i179;
            int i181 = (i179 & i180) + (i180 | i179);
            b = i181 % 128;
            int i182 = i181 % 2;
            View childAt2 = getChildAt(i176);
            if (childAt2.getVisibility() != 8) {
                int i183 = (-2) - ((a + 86) ^ (-1));
                b = i183 % 128;
                if (i183 % 2 == 0) {
                    View.MeasureSpec.makeMeasureSpec(this.L[i176], 1073741824);
                    throw null;
                }
                int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(this.L[i176], 1073741824);
                int i184 = b;
                int i185 = i184 | 109;
                int i186 = i185 << 1;
                int i187 = -((~(i184 & 109)) & i185);
                int i188 = (i186 ^ i187) + ((i187 & i186) << 1);
                a = i188 % 128;
                if (i188 % 2 != 0) {
                    childAt2.measure(iMakeMeasureSpec3, iMakeMeasureSpec);
                    childAt2.getLayoutParams();
                    childAt2.getMeasuredWidth();
                    throw null;
                }
                childAt2.measure(iMakeMeasureSpec3, iMakeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int i189 = i177 & measuredWidth2;
                int i190 = (i189 - (~((i177 ^ measuredWidth2) | i189))) - 1;
                int i191 = b;
                int i192 = i191 & 97;
                int i193 = (((i191 ^ 97) | i192) << 1) - ((i191 | 97) & (~i192));
                a = i193 % 128;
                int i194 = i193 % 2;
                i177 = i190;
            }
            i176++;
            int i195 = b;
            int i196 = i195 & 65;
            int i197 = (i195 | 65) & (~i196);
            int i198 = i196 << 1;
            int i199 = (i197 ^ i198) + ((i197 & i198) << 1);
            a = i199 % 128;
            int i200 = i199 % 2;
        }
        int iResolveSizeAndState = View.resolveSizeAndState(i177, View.MeasureSpec.makeMeasureSpec(i177, 1073741824), 0);
        int i201 = a;
        int i202 = (i201 & 11) + (i201 | 11);
        b = i202 % 128;
        setMeasuredDimension(iResolveSizeAndState, i202 % 2 == 0 ? View.resolveSizeAndState(size3, i2, 1) : View.resolveSizeAndState(size3, i2, 0));
    }
}
