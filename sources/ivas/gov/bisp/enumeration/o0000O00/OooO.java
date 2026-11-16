package ivas.gov.bisp.enumeration.o0000O00;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class OooO extends ViewGroup {
    private static int a = 1;
    private static int b;
    public int c;
    public int d;
    public boolean e;
    public int f;

    public OooO(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean d() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 17) + (i2 | 17);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            return this.e;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getItemSpacing() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 107;
        int i4 = ((((i2 ^ 107) | i3) << 1) - (~(-((~i3) & (i2 | 107))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.d;
        int i7 = i2 + 103;
        b = i7 % 128;
        if (i7 % 2 == 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getLineSpacing() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 33;
        int i4 = i2 | 33;
        int i5 = (i3 & i4) + (i3 | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        int i7 = this.c;
        if (i6 != 0) {
            int i8 = 4 / 0;
        }
        int i9 = i2 | 19;
        int i10 = (i9 << 1) - ((~(i2 & 19)) & i9);
        b = i10 % 128;
        int i11 = i10 % 2;
        return i7;
    }

    public int getRowCount() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 126) + ((i2 & 126) << 1)) - 1;
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        int i6 = this.f;
        int i7 = (i4 ^ 39) + ((i4 & 39) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public void setItemSpacing(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 | 23) << 1) - (i3 ^ 23);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.d = i;
        int i6 = (((i3 & (-16)) | ((~i3) & 15)) - (~(-(-((i3 & 15) << 1))))) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setLineSpacing(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 121;
        int i5 = ((i3 ^ 121) | i4) << 1;
        int i6 = -((~i4) & (i3 | 121));
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        this.c = i;
        if (i8 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i9 = i3 & 71;
        int i10 = i9 + ((i3 ^ 71) | i9);
        b = i10 % 128;
        int i11 = i10 % 2;
    }

    public void setSingleLine(boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 21) << 1) - (i2 ^ 21);
        a = i3 % 128;
        int i4 = i3 % 2;
        this.e = z;
        int i5 = ((i2 ^ 39) - (~(-(-((i2 & 39) << 1))))) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
    }

    public OooO(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = false;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, r.w, 0, 0);
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x01f3 A[PHI: r17
  0x01f3: PHI (r17v4 boolean) = (r17v1 boolean), (r17v5 boolean) binds: [B:48:0x01f1, B:45:0x01e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:54:0x0202  */
    /* JADX WARN: Code duplicated, block: B:56:0x0217 A[PHI: r5
  0x0217: PHI (r5v39 int) = (r5v38 int), (r5v1 int) binds: [B:55:0x0215, B:52:0x01ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x022f  */
    /* JADX WARN: Code duplicated, block: B:59:0x023c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0280  */
    /* JADX WARN: Code duplicated, block: B:66:0x028d  */
    /* JADX WARN: Code duplicated, block: B:69:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:71:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:72:0x0305  */
    /* JADX WARN: Code duplicated, block: B:73:0x0315  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int paddingLeft;
        int paddingLeft2;
        int marginStart;
        int marginEnd;
        boolean z3;
        Integer numValueOf;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = 2;
        int i19 = 2 % 2;
        int i20 = b + 3;
        a = i20 % 128;
        if (i20 % 2 == 0) {
            getChildCount();
            throw null;
        }
        int i21 = 1;
        if (getChildCount() == 0) {
            this.f = 0;
            int i22 = a;
            int i23 = i22 ^ 61;
            int i24 = (i22 & 61) << 1;
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            b = i25 % 128;
            if (i25 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.f = 1;
        WeakHashMap<View, R> weakHashMap = T.c;
        if (T.aWY.f(this) == 1) {
            int i26 = b;
            int i27 = (i26 & (-56)) | ((~i26) & 55);
            int i28 = (i26 & 55) << 1;
            int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
            int i30 = i29 % 128;
            a = i30;
            z2 = !(i29 % 2 == 0);
            int i31 = i30 & 7;
            int i32 = i31 + ((i30 ^ 7) | i31);
            b = i32 % 128;
            int i33 = i32 % 2;
        } else {
            int i34 = b;
            int i35 = i34 & 41;
            int i36 = (i34 | 41) & (~i35);
            int i37 = i35 << 1;
            int i38 = ((i36 | i37) << 1) - (i36 ^ i37);
            a = i38 % 128;
            if (i38 % 2 == 0) {
                int i39 = 5 / 4;
            }
            z2 = false;
        }
        if (z2) {
            int i40 = b + 43;
            a = i40 % 128;
            if (i40 % 2 == 0) {
                getPaddingRight();
                throw null;
            }
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
            int i41 = a;
            int i42 = (i41 & (-84)) | ((~i41) & 83);
            int i43 = (i41 & 83) << 1;
            int i44 = (i42 & i43) + (i43 | i42);
            b = i44 % 128;
            int i45 = i44 % 2;
        }
        if (!z2) {
            paddingLeft2 = getPaddingRight();
            int i46 = a;
            int i47 = ((i46 & 14) + (i46 | 14)) - 1;
            b = i47 % 128;
            int i48 = i47 % 2;
        } else {
            int i49 = b;
            int i50 = ((i49 | 105) << 1) - (((~i49) & 105) | (i49 & (-106)));
            a = i50 % 128;
            int i51 = i50 % 2;
            paddingLeft2 = getPaddingLeft();
            int i52 = a;
            int i53 = ((i52 | 5) << 1) - (5 ^ i52);
            b = i53 % 128;
            int i54 = i53 % 2;
        }
        int paddingTop = getPaddingTop();
        int i55 = -i;
        int i56 = i3 & i55;
        int i57 = (i56 - (~((i3 ^ i55) | i56))) - 1;
        int i58 = -paddingLeft2;
        int i59 = i57 & i58;
        int i60 = ((i58 | i57) & (~i59)) + (i59 << 1);
        int i61 = a;
        int i62 = -1;
        int i63 = (-2) - ((i61 + 112) ^ (-1));
        b = i63 % 128;
        int i64 = i63 % 2;
        int i65 = (i61 & (-76)) | ((~i61) & 75);
        int i66 = (i61 & 75) << 1;
        int i67 = (i65 & i66) + (i66 | i65);
        b = i67 % 128;
        int i68 = i67 % 2;
        int i69 = paddingLeft;
        int i70 = 0;
        int i71 = paddingTop;
        while (i70 < getChildCount()) {
            int i72 = a;
            int i73 = i72 | 107;
            int i74 = (i73 << 1) - ((~(i72 & 107)) & i73);
            b = i74 % 128;
            int i75 = i74 % i18;
            View childAt = getChildAt(i70);
            if (childAt.getVisibility() == 8) {
                int i76 = a;
                int i77 = i76 & 63;
                int i78 = (~i77) & (i76 | 63);
                int i79 = i77 << 1;
                int i80 = (i78 & i79) + (i78 | i79);
                b = i80 % 128;
                int i81 = i80 % i18;
                childAt.setTag(ivas.gov.bisp.enumeration.R.id.row_index_key, Integer.valueOf(i62));
                int i82 = b;
                int i83 = i82 & 63;
                int i84 = (i82 | 63) & (~i83);
                int i85 = -(-(i83 << i21));
                int i86 = ((i84 | i85) << i21) - (i84 ^ i85);
                a = i86 % 128;
                int i87 = i86 % i18;
                z3 = false;
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) != i21) {
                    int i88 = b;
                    int i89 = ((i88 ^ 81) | (i88 & 81)) << i21;
                    int i90 = -(((~i88) & 81) | (i88 & (-82)));
                    int i91 = ((i89 | i90) << i21) - (i90 ^ i89);
                    a = i91 % 128;
                    int i92 = i91 % i18;
                    marginEnd = 0;
                    marginStart = 0;
                } else {
                    int i93 = a;
                    int i94 = ((i93 | 73) << i21) - (i93 ^ 73);
                    b = i94 % 128;
                    int i95 = i94 % i18;
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginStart = marginLayoutParams.getMarginStart();
                    int i96 = b;
                    int i97 = ((i96 | 115) << 1) - (i96 ^ 115);
                    a = i97 % 128;
                    int i98 = i97 % i18;
                    marginEnd = marginLayoutParams.getMarginEnd();
                    int i99 = a;
                    int i100 = (i99 & 41) + (i99 | 41);
                    b = i100 % 128;
                    int i101 = i100 % i18;
                }
                int measuredWidth = childAt.getMeasuredWidth();
                int i102 = a;
                int i103 = i102 ^ 27;
                int i104 = -(-((i102 & 27) << i21));
                int i105 = (i103 & i104) + (i103 | i104);
                int i106 = i105 % 128;
                b = i106;
                if (i105 % i18 != 0) {
                    z3 = false;
                    int i107 = 37 / 0;
                    if (!this.e) {
                        i12 = i106 + 113;
                        i13 = i12 % 128;
                        a = i13;
                        if (i12 % i18 == 0) {
                            int i108 = i69 & marginStart;
                            i14 = -(-((i108 - (~((i69 ^ marginStart) | i108))) - i21));
                            i15 = measuredWidth & i14;
                            i21 = 1;
                            if (((i14 | measuredWidth) & (~i15)) + (i15 << 1) > i60) {
                                int i109 = i13 & 97;
                                int i110 = ((i13 ^ 97) | i109) << i21;
                                int i111 = -((~i109) & (i13 | 97));
                                i16 = (i110 ^ i111) + ((i110 & i111) << i21);
                                int i112 = i16 % 128;
                                b = i112;
                                if (i16 % 2 != 0) {
                                    int i113 = this.c / i71;
                                    int i114 = this.f;
                                    i17 = (i114 ^ (-1)) + (i114 << 1);
                                    paddingTop = i113;
                                } else {
                                    int i115 = this.c;
                                    int i116 = -(~i71);
                                    int i117 = ((i115 & i116) + (i115 | i116)) - 1;
                                    int i118 = this.f;
                                    int i119 = (i118 & (-2)) | ((~i118) & 1);
                                    int i120 = (i118 & 1) << 1;
                                    i17 = (i120 | i119) + (i119 & i120);
                                    paddingTop = i117;
                                }
                                this.f = i17;
                                int i121 = (i112 & 47) + (i112 | 47);
                                a = i121 % 128;
                                int i122 = i121 % 2;
                                i69 = paddingLeft;
                            }
                        } else if (measuredWidth / (i69 * marginStart) > i60) {
                            int i1010 = i13 & 97;
                            int i1110 = ((i13 ^ 97) | i1010) << i21;
                            int i1111 = -((~i1010) & (i13 | 97));
                            i16 = (i1110 ^ i1111) + ((i1110 & i1111) << i21);
                            int i1112 = i16 % 128;
                            b = i1112;
                            if (i16 % 2 != 0) {
                                int i1113 = this.c / i71;
                                int i1114 = this.f;
                                i17 = (i1114 ^ (-1)) + (i1114 << 1);
                                paddingTop = i1113;
                            } else {
                                int i1115 = this.c;
                                int i1116 = -(~i71);
                                int i1117 = ((i1115 & i1116) + (i1115 | i1116)) - 1;
                                int i1118 = this.f;
                                int i1119 = (i1118 & (-2)) | ((~i1118) & 1);
                                int i123 = (i1118 & 1) << 1;
                                i17 = (i123 | i1119) + (i1119 & i123);
                                paddingTop = i1117;
                            }
                            this.f = i17;
                            int i124 = (i1112 & 47) + (i1112 | 47);
                            a = i124 % 128;
                            int i125 = i124 % 2;
                            i69 = paddingLeft;
                        }
                    }
                    int i126 = this.f;
                    numValueOf = Integer.valueOf((i126 ^ (-1)) + (i126 << 1));
                    i5 = b + 37;
                    a = i5 % 128;
                    if (i5 % 2 == 0) {
                        childAt.setTag(ivas.gov.bisp.enumeration.R.id.row_index_key, numValueOf);
                        i6 = i69 / marginStart;
                    } else {
                        childAt.setTag(ivas.gov.bisp.enumeration.R.id.row_index_key, numValueOf);
                        int i127 = -(-marginStart);
                        int i128 = i69 & i127;
                        int i129 = ((i69 ^ i127) | i128) << 1;
                        int i130 = -((i127 | i69) & (~i128));
                        i6 = ((i130 & i129) << 1) + (i129 ^ i130);
                    }
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    int i131 = -(-i6);
                    i7 = (measuredWidth2 & i131) + (measuredWidth2 | i131);
                    int measuredHeight = childAt.getMeasuredHeight();
                    i8 = ((((measuredHeight ^ paddingTop) | (measuredHeight & paddingTop)) << 1) - (~(-(((~paddingTop) & measuredHeight) | ((~measuredHeight) & paddingTop))))) - 1;
                    int i132 = a + 9;
                    i9 = i132 % 128;
                    b = i9;
                    int i133 = i132 % 2;
                    if (!(!z2)) {
                        int i134 = ((i9 | 79) << 1) - (i9 ^ 79);
                        int i135 = i134 % 128;
                        a = i135;
                        int i136 = i134 % 2;
                        int i137 = -i7;
                        int i138 = (i60 | i137) << 1;
                        int i139 = -((i137 & (~i60)) | ((~i137) & i60));
                        i10 = (i138 ^ i139) + ((i139 & i138) << 1);
                        i11 = (i135 ^ 15) + ((i135 & 15) << 1);
                        b = i11 % 128;
                        if (i11 % 2 != 0) {
                            int i140 = i60 * i69;
                            childAt.layout(i10, paddingTop, (i140 ^ marginStart) + ((i140 & marginStart) << 1), i8);
                        } else {
                            int i141 = -i69;
                            int i142 = i60 & i141;
                            childAt.layout(i10, paddingTop, ((((i141 | i60) & (~i142)) + (i142 << 1)) - (~(-marginStart))) - 1, i8);
                        }
                    } else {
                        childAt.layout(i6, paddingTop, i7, i8);
                        int i143 = b;
                        int i144 = (((i143 ^ 95) | (i143 & 95)) << 1) - (((~i143) & 95) | (i143 & (-96)));
                        a = i144 % 128;
                        int i145 = i144 % 2;
                    }
                    int measuredWidth3 = childAt.getMeasuredWidth();
                    int i146 = ((marginStart | marginEnd) << 1) - (marginEnd ^ marginStart);
                    int i147 = a;
                    int i148 = (i147 ^ 91) + ((i147 & 91) << 1);
                    b = i148 % 128;
                    int i149 = i148 % 2;
                    int i150 = -(-i146);
                    int i151 = measuredWidth3 & i150;
                    int i152 = -(-(measuredWidth3 | i150));
                    int i153 = (i151 & i152) + (i152 | i151);
                    int i154 = -(-this.d);
                    int i155 = i153 & i154;
                    int i156 = (i154 | i153) & (~i155);
                    int i157 = i155 << 1;
                    int i158 = -(-(((i156 | i157) << 1) - (i156 ^ i157)));
                    i69 = ((i69 | i158) << 1) - (i158 ^ i69);
                    int i159 = i147 + 120;
                    int i160 = (i159 ^ (-1)) + (i159 << 1);
                    b = i160 % 128;
                    int i161 = i160 % 2;
                    i71 = i8;
                } else {
                    z3 = false;
                    if (this.e != i21) {
                        i12 = i106 + 113;
                        i13 = i12 % 128;
                        a = i13;
                        if (i12 % i18 == 0) {
                            int i1011 = i69 & marginStart;
                            i14 = -(-((i1011 - (~((i69 ^ marginStart) | i1011))) - i21));
                            i15 = measuredWidth & i14;
                            i21 = 1;
                            if (((i14 | measuredWidth) & (~i15)) + (i15 << 1) > i60) {
                                int i1012 = i13 & 97;
                                int i11110 = ((i13 ^ 97) | i1012) << i21;
                                int i11111 = -((~i1012) & (i13 | 97));
                                i16 = (i11110 ^ i11111) + ((i11110 & i11111) << i21);
                                int i11112 = i16 % 128;
                                b = i11112;
                                if (i16 % 2 != 0) {
                                    int i11113 = this.c / i71;
                                    int i11114 = this.f;
                                    i17 = (i11114 ^ (-1)) + (i11114 << 1);
                                    paddingTop = i11113;
                                } else {
                                    int i11115 = this.c;
                                    int i11116 = -(~i71);
                                    int i11117 = ((i11115 & i11116) + (i11115 | i11116)) - 1;
                                    int i11118 = this.f;
                                    int i11119 = (i11118 & (-2)) | ((~i11118) & 1);
                                    int i1210 = (i11118 & 1) << 1;
                                    i17 = (i1210 | i11119) + (i11119 & i1210);
                                    paddingTop = i11117;
                                }
                                this.f = i17;
                                int i1211 = (i11112 & 47) + (i11112 | 47);
                                a = i1211 % 128;
                                int i1212 = i1211 % 2;
                                i69 = paddingLeft;
                            }
                        } else if (measuredWidth / (i69 * marginStart) > i60) {
                            int i1013 = i13 & 97;
                            int i111110 = ((i13 ^ 97) | i1013) << i21;
                            int i111111 = -((~i1013) & (i13 | 97));
                            i16 = (i111110 ^ i111111) + ((i111110 & i111111) << i21);
                            int i111112 = i16 % 128;
                            b = i111112;
                            if (i16 % 2 != 0) {
                                int i111113 = this.c / i71;
                                int i111114 = this.f;
                                i17 = (i111114 ^ (-1)) + (i111114 << 1);
                                paddingTop = i111113;
                            } else {
                                int i111115 = this.c;
                                int i111116 = -(~i71);
                                int i111117 = ((i111115 & i111116) + (i111115 | i111116)) - 1;
                                int i111118 = this.f;
                                int i111119 = (i111118 & (-2)) | ((~i111118) & 1);
                                int i1213 = (i111118 & 1) << 1;
                                i17 = (i1213 | i111119) + (i111119 & i1213);
                                paddingTop = i111117;
                            }
                            this.f = i17;
                            int i1214 = (i111112 & 47) + (i111112 | 47);
                            a = i1214 % 128;
                            int i1215 = i1214 % 2;
                            i69 = paddingLeft;
                        }
                    }
                    int i1216 = this.f;
                    numValueOf = Integer.valueOf((i1216 ^ (-1)) + (i1216 << 1));
                    i5 = b + 37;
                    a = i5 % 128;
                    if (i5 % 2 == 0) {
                        childAt.setTag(ivas.gov.bisp.enumeration.R.id.row_index_key, numValueOf);
                        i6 = i69 / marginStart;
                    } else {
                        childAt.setTag(ivas.gov.bisp.enumeration.R.id.row_index_key, numValueOf);
                        int i1217 = -(-marginStart);
                        int i1218 = i69 & i1217;
                        int i1219 = ((i69 ^ i1217) | i1218) << 1;
                        int i1310 = -((i1217 | i69) & (~i1218));
                        i6 = ((i1310 & i1219) << 1) + (i1219 ^ i1310);
                    }
                    int measuredWidth4 = childAt.getMeasuredWidth();
                    int i1311 = -(-i6);
                    i7 = (measuredWidth4 & i1311) + (measuredWidth4 | i1311);
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    i8 = ((((measuredHeight2 ^ paddingTop) | (measuredHeight2 & paddingTop)) << 1) - (~(-(((~paddingTop) & measuredHeight2) | ((~measuredHeight2) & paddingTop))))) - 1;
                    int i1312 = a + 9;
                    i9 = i1312 % 128;
                    b = i9;
                    int i1313 = i1312 % 2;
                    if (!(!z2)) {
                        int i1314 = ((i9 | 79) << 1) - (i9 ^ 79);
                        int i1315 = i1314 % 128;
                        a = i1315;
                        int i1316 = i1314 % 2;
                        int i1317 = -i7;
                        int i1318 = (i60 | i1317) << 1;
                        int i1319 = -((i1317 & (~i60)) | ((~i1317) & i60));
                        i10 = (i1318 ^ i1319) + ((i1319 & i1318) << 1);
                        i11 = (i1315 ^ 15) + ((i1315 & 15) << 1);
                        b = i11 % 128;
                        if (i11 % 2 != 0) {
                            int i1410 = i60 * i69;
                            childAt.layout(i10, paddingTop, (i1410 ^ marginStart) + ((i1410 & marginStart) << 1), i8);
                        } else {
                            int i1411 = -i69;
                            int i1412 = i60 & i1411;
                            childAt.layout(i10, paddingTop, ((((i1411 | i60) & (~i1412)) + (i1412 << 1)) - (~(-marginStart))) - 1, i8);
                        }
                    } else {
                        childAt.layout(i6, paddingTop, i7, i8);
                        int i1413 = b;
                        int i1414 = (((i1413 ^ 95) | (i1413 & 95)) << 1) - (((~i1413) & 95) | (i1413 & (-96)));
                        a = i1414 % 128;
                        int i1415 = i1414 % 2;
                    }
                    int measuredWidth5 = childAt.getMeasuredWidth();
                    int i1416 = ((marginStart | marginEnd) << 1) - (marginEnd ^ marginStart);
                    int i1417 = a;
                    int i1418 = (i1417 ^ 91) + ((i1417 & 91) << 1);
                    b = i1418 % 128;
                    int i1419 = i1418 % 2;
                    int i1510 = -(-i1416);
                    int i1511 = measuredWidth5 & i1510;
                    int i1512 = -(-(measuredWidth5 | i1510));
                    int i1513 = (i1511 & i1512) + (i1512 | i1511);
                    int i1514 = -(-this.d);
                    int i1515 = i1513 & i1514;
                    int i1516 = (i1514 | i1513) & (~i1515);
                    int i1517 = i1515 << 1;
                    int i1518 = -(-(((i1516 | i1517) << 1) - (i1516 ^ i1517)));
                    i69 = ((i69 | i1518) << 1) - (i1518 ^ i69);
                    int i1519 = i1417 + 120;
                    int i162 = (i1519 ^ (-1)) + (i1519 << 1);
                    b = i162 % 128;
                    int i163 = i162 % 2;
                    i71 = i8;
                }
                int i12110 = this.f;
                numValueOf = Integer.valueOf((i12110 ^ (-1)) + (i12110 << 1));
                i5 = b + 37;
                a = i5 % 128;
                if (i5 % 2 == 0) {
                    childAt.setTag(ivas.gov.bisp.enumeration.R.id.row_index_key, numValueOf);
                    i6 = i69 / marginStart;
                } else {
                    childAt.setTag(ivas.gov.bisp.enumeration.R.id.row_index_key, numValueOf);
                    int i12111 = -(-marginStart);
                    int i12112 = i69 & i12111;
                    int i12113 = ((i69 ^ i12111) | i12112) << 1;
                    int i13110 = -((i12111 | i69) & (~i12112));
                    i6 = ((i13110 & i12113) << 1) + (i12113 ^ i13110);
                }
                int measuredWidth6 = childAt.getMeasuredWidth();
                int i13111 = -(-i6);
                i7 = (measuredWidth6 & i13111) + (measuredWidth6 | i13111);
                int measuredHeight3 = childAt.getMeasuredHeight();
                i8 = ((((measuredHeight3 ^ paddingTop) | (measuredHeight3 & paddingTop)) << 1) - (~(-(((~paddingTop) & measuredHeight3) | ((~measuredHeight3) & paddingTop))))) - 1;
                int i13112 = a + 9;
                i9 = i13112 % 128;
                b = i9;
                int i13113 = i13112 % 2;
                if (!(!z2)) {
                    int i13114 = ((i9 | 79) << 1) - (i9 ^ 79);
                    int i13115 = i13114 % 128;
                    a = i13115;
                    int i13116 = i13114 % 2;
                    int i13117 = -i7;
                    int i13118 = (i60 | i13117) << 1;
                    int i13119 = -((i13117 & (~i60)) | ((~i13117) & i60));
                    i10 = (i13118 ^ i13119) + ((i13119 & i13118) << 1);
                    i11 = (i13115 ^ 15) + ((i13115 & 15) << 1);
                    b = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i14110 = i60 * i69;
                        childAt.layout(i10, paddingTop, (i14110 ^ marginStart) + ((i14110 & marginStart) << 1), i8);
                    } else {
                        int i14111 = -i69;
                        int i14112 = i60 & i14111;
                        childAt.layout(i10, paddingTop, ((((i14111 | i60) & (~i14112)) + (i14112 << 1)) - (~(-marginStart))) - 1, i8);
                    }
                } else {
                    childAt.layout(i6, paddingTop, i7, i8);
                    int i14113 = b;
                    int i14114 = (((i14113 ^ 95) | (i14113 & 95)) << 1) - (((~i14113) & 95) | (i14113 & (-96)));
                    a = i14114 % 128;
                    int i14115 = i14114 % 2;
                }
                int measuredWidth7 = childAt.getMeasuredWidth();
                int i14116 = ((marginStart | marginEnd) << 1) - (marginEnd ^ marginStart);
                int i14117 = a;
                int i14118 = (i14117 ^ 91) + ((i14117 & 91) << 1);
                b = i14118 % 128;
                int i14119 = i14118 % 2;
                int i15110 = -(-i14116);
                int i15111 = measuredWidth7 & i15110;
                int i15112 = -(-(measuredWidth7 | i15110));
                int i15113 = (i15111 & i15112) + (i15112 | i15111);
                int i15114 = -(-this.d);
                int i15115 = i15113 & i15114;
                int i15116 = (i15114 | i15113) & (~i15115);
                int i15117 = i15115 << 1;
                int i15118 = -(-(((i15116 | i15117) << 1) - (i15116 ^ i15117)));
                i69 = ((i69 | i15118) << 1) - (i15118 ^ i69);
                int i15119 = i14117 + 120;
                int i164 = (i15119 ^ (-1)) + (i15119 << 1);
                b = i164 % 128;
                int i165 = i164 % 2;
                i71 = i8;
            }
            int i166 = i70 + 67;
            int i167 = i166 & (-66);
            int i168 = (~i167) & (i166 | (-66));
            int i169 = -(-(i167 << 1));
            i70 = (i168 ^ i169) + ((i169 & i168) << 1);
            int i170 = b;
            int i171 = (i170 & (-20)) | ((~i170) & 19);
            int i172 = (i170 & 19) << 1;
            int i173 = ((i171 | i172) << 1) - (i172 ^ i171);
            a = i173 % 128;
            int i174 = i173 % 2;
            i18 = 2;
            i21 = 1;
            i62 = -1;
        }
        int i175 = a;
        int i176 = i175 & 63;
        int i177 = (i175 ^ 63) | i176;
        int i178 = (i176 ^ i177) + ((i177 & i176) << 1);
        b = i178 % 128;
        int i179 = i178 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0201 A[PHI: r24
  0x0201: PHI (r24v2 int) = (r24v1 int), (r24v5 int) binds: [B:50:0x01ff, B:47:0x01ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x020f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0224  */
    /* JADX WARN: Code duplicated, block: B:56:0x022f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0288  */
    /* JADX WARN: Code duplicated, block: B:64:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:67:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:69:0x02db  */
    /* JADX WARN: Code duplicated, block: B:71:0x030f  */
    /* JADX WARN: Code duplicated, block: B:74:0x035a  */
    /* JADX WARN: Code duplicated, block: B:75:0x035e  */
    /* JADX WARN: Code duplicated, block: B:85:0x03cf A[PHI: r1
  0x03cf: PHI (r1v9 int) = (r1v8 int), (r1v22 int) binds: [B:84:0x03cd, B:81:0x03c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x03db  */
    /* JADX WARN: Code duplicated, block: B:89:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x040f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0419 A[PHI: r1
  0x0419: PHI (r1v21 int) = (r1v8 int), (r1v22 int) binds: [B:84:0x03cd, B:81:0x03c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x042c  */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size;
        int mode;
        int size2;
        int mode2;
        int i3;
        int paddingRight;
        int i4;
        int i5;
        int i6;
        int iMin;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int paddingLeft;
        int i12;
        int i13;
        int measuredHeight;
        int i14;
        int childCount;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = 2;
        int i20 = 2 % 2;
        int i21 = a + 125;
        b = i21 % 128;
        if (i21 % 2 != 0) {
            size = View.MeasureSpec.getSize(i);
            mode = View.MeasureSpec.getMode(i);
            int i22 = 66 / 0;
        } else {
            size = View.MeasureSpec.getSize(i);
            mode = View.MeasureSpec.getMode(i);
        }
        int i23 = b;
        int i24 = 1;
        int i25 = (-2) - (((i23 ^ 56) + ((i23 & 56) << 1)) ^ (-1));
        a = i25 % 128;
        if (i25 % 2 == 0) {
            size2 = View.MeasureSpec.getSize(i2);
            mode2 = View.MeasureSpec.getMode(i2);
            int i26 = 20 / 0;
        } else {
            size2 = View.MeasureSpec.getSize(i2);
            mode2 = View.MeasureSpec.getMode(i2);
        }
        Object obj = null;
        if (mode != Integer.MIN_VALUE) {
            int i27 = b + 121;
            int i28 = i27 % 128;
            a = i28;
            if (i27 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (mode != 1073741824) {
                int i29 = (-2) - (((i28 & 76) + (i28 | 76)) ^ (-1));
                b = i29 % 128;
                if (i29 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                i3 = Integer.MAX_VALUE;
            } else {
                int i30 = a + 71;
                b = i30 % 128;
                int i31 = i30 % 2;
                i3 = size;
            }
        } else {
            int i32 = a + 71;
            b = i32 % 128;
            int i33 = i32 % 2;
            i3 = size;
        }
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i34 = a;
        int i35 = ((i34 ^ 1) | (i34 & 1)) << 1;
        int i36 = -((i34 & (-2)) | ((~i34) & 1));
        int i37 = (i35 & i36) + (i36 | i35);
        b = i37 % 128;
        if (i37 % 2 != 0) {
            paddingRight = getPaddingRight();
            i4 = 1;
        } else {
            paddingRight = getPaddingRight();
            i4 = 0;
        }
        int i38 = b;
        int i39 = (((i38 | 66) << 1) - (i38 ^ 66)) - 1;
        int i40 = i39 % 128;
        a = i40;
        int i41 = i39 % 2;
        int i42 = i40 & 107;
        int i43 = (i42 - (~((i40 ^ 107) | i42))) - 1;
        b = i43 % 128;
        int i44 = i43 % 2;
        int i45 = 0;
        int i46 = paddingTop;
        while (i45 < getChildCount()) {
            int i47 = a + 61;
            b = i47 % 128;
            int i48 = i47 % i19;
            View childAt = getChildAt(i45);
            if (childAt.getVisibility() == 8) {
                int i49 = b;
                int i50 = i49 & 37;
                int i51 = ((~i50) & (i49 | 37)) + (i50 << i24);
                a = i51 % 128;
                if (i51 % 2 == 0) {
                    throw null;
                }
                int i52 = i49 + 95;
                a = i52 % 128;
                if (i52 % 2 == 0) {
                    int i53 = 3 % 5;
                }
                i10 = mode2;
                i17 = i24;
            } else {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                int i54 = a;
                int i55 = i54 & 21;
                int i56 = i46;
                int i57 = (~i55) & (i54 | 21);
                int i58 = -(-(i55 << 1));
                int i59 = ((i57 | i58) << 1) - (i58 ^ i57);
                int i60 = i59 % 128;
                b = i60;
                int i61 = i59 % 2;
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    int i62 = i54 + 93;
                    b = i62 % 128;
                    int i63 = i62 % 2;
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    int i64 = marginLayoutParams.leftMargin;
                    int i65 = (i64 ^ 1) + ((i64 & 1) << 1);
                    int i66 = (i65 ^ (-1)) + (i65 << 1);
                    int i67 = a;
                    int i68 = i67 & 53;
                    int i69 = (((i67 ^ 53) | i68) << 1) - ((~i68) & (i67 | 53));
                    b = i69 % 128;
                    int i70 = i69 % 2;
                    int i71 = (-1) - (~(-(-marginLayoutParams.rightMargin)));
                    int i72 = b;
                    int i73 = i72 ^ 67;
                    int i74 = -(-((i72 & 67) << 1));
                    int i75 = ((i73 | i74) << 1) - (i74 ^ i73);
                    a = i75 % 128;
                    int i76 = i75 % 2;
                    i9 = i71;
                    i8 = i66;
                } else {
                    int i77 = i60 & 55;
                    int i78 = -(-((i60 ^ 55) | i77));
                    int i79 = (i77 & i78) + (i77 | i78);
                    a = i79 % 128;
                    int i80 = i79 % 2;
                    i8 = 0;
                    i9 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth();
                int i81 = a;
                int i82 = i81 & 85;
                int i83 = -(-(i81 | 85));
                int i84 = (i82 & i83) + (i82 | i83);
                int i85 = i84 % 128;
                b = i85;
                if (i84 % 2 != 0) {
                    int i86 = -(-i8);
                    i10 = mode2;
                    int i87 = paddingLeft2 & i86;
                    int i88 = (measuredWidth - (~(-((((paddingLeft2 ^ i86) | i87) << 1) - ((~i87) & (i86 | paddingLeft2)))))) - 1;
                    int i89 = -(-paddingRight);
                    int i90 = i3 & i89;
                    if (i88 > i90 + ((i89 ^ i3) | i90)) {
                        int i91 = i85 + 49;
                        a = i91 % 128;
                        int i92 = i91 % 2;
                        if (!d()) {
                            int i93 = a;
                            int i94 = i93 & 91;
                            i11 = (i94 - (~(-(-((i93 ^ 91) | i94))))) - 1;
                            b = i11 % 128;
                            if (i11 % 2 != 0) {
                                paddingLeft = getPaddingLeft();
                                i12 = this.c;
                                int i95 = 96 / 0;
                            } else {
                                paddingLeft = getPaddingLeft();
                                i12 = this.c;
                            }
                            paddingLeft2 = paddingLeft;
                            int i96 = -(~i12);
                            i46 = ((paddingTop & i96) + (i96 | paddingTop)) - 1;
                            int i97 = b;
                            int i98 = i97 ^ 35;
                            int i99 = -(-((i97 & 35) << 1));
                            int i100 = ((i98 | i99) << 1) - (i98 ^ i99);
                            a = i100 % 128;
                            int i101 = i100 % 2;
                        }
                    }
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    int i102 = paddingLeft2 & i8;
                    int i103 = -(-((i102 - (~((paddingLeft2 ^ i8) | i102))) - 1));
                    int i104 = measuredWidth2 & i103;
                    int i105 = measuredWidth2 | i103;
                    i13 = (i104 ^ i105) + ((i104 & i105) << 1);
                    int i106 = b + 48;
                    int i107 = (i106 ^ (-1)) + (i106 << 1);
                    a = i107 % 128;
                    int i108 = i107 % 2;
                    measuredHeight = childAt.getMeasuredHeight();
                    if (i13 > i4) {
                        int i109 = b;
                        int i110 = i109 & 99;
                        int i111 = (~i110) & (i109 | 99);
                        int i112 = i110 << 1;
                        int i113 = (i111 & i112) + (i111 | i112);
                        a = i113 % 128;
                        int i114 = i113 % 2;
                        int i115 = i109 + 97;
                        a = i115 % 128;
                        int i116 = i115 % 2;
                        i4 = i13;
                    }
                    int measuredWidth3 = childAt.getMeasuredWidth();
                    int i117 = this.d;
                    int i118 = a;
                    int i119 = i118 ^ 23;
                    int i120 = (i118 & 23) << 1;
                    i14 = ((i119 | i120) << 1) - (i120 ^ i119);
                    b = i14 % 128;
                    if (i14 % 2 == 0) {
                        childCount = getChildCount();
                        if (i45 == ((childCount << 1) - childCount) - 1) {
                            int i121 = a;
                            int i122 = i121 ^ 27;
                            int i123 = -(-((i121 & 27) << 1));
                            int i124 = (i122 & i123) + (i123 | i122);
                            int i125 = i124 % 128;
                            b = i125;
                            int i126 = i124 % 2;
                            int i127 = -(-i9);
                            int i128 = i4 & i127;
                            int i129 = -(-(i127 | i4));
                            i4 = (i128 & i129) + (i128 | i129);
                            int i130 = i125 & 105;
                            i15 = (i130 - (~((i125 ^ 105) | i130))) - 1;
                            a = i15 % 128;
                            if (i15 % 2 == 0) {
                                int i131 = 5 % 2;
                            }
                        }
                    } else if (i45 == (getChildCount() << 1)) {
                        int i1210 = a;
                        int i1211 = i1210 ^ 27;
                        int i1212 = -(-((i1210 & 27) << 1));
                        int i1213 = (i1211 & i1212) + (i1212 | i1211);
                        int i1214 = i1213 % 128;
                        b = i1214;
                        int i1215 = i1213 % 2;
                        int i1216 = -(-i9);
                        int i1217 = i4 & i1216;
                        int i1218 = -(-(i1216 | i4));
                        i4 = (i1217 & i1218) + (i1217 | i1218);
                        int i132 = i1214 & 105;
                        i15 = (i132 - (~((i1214 ^ 105) | i132))) - 1;
                        a = i15 % 128;
                        if (i15 % 2 == 0) {
                            int i133 = 5 % 2;
                        }
                    }
                    int i134 = -(-i9);
                    int i135 = i8 & i134;
                    int i136 = (i8 | i134) & (~i135);
                    int i137 = -(-(i135 << 1));
                    int i138 = -(-((i136 ^ i137) + ((i136 & i137) << 1)));
                    int i139 = measuredWidth3 ^ i138;
                    int i140 = ((((i138 & measuredWidth3) | i139) << 1) - (~(-i139))) - 1;
                    int i141 = i140 ^ i117;
                    int i142 = ((i140 & i117) | i141) << 1;
                    int i143 = -i141;
                    int i144 = (i142 ^ i143) + ((i142 & i143) << 1);
                    int i145 = i144 ^ paddingLeft2;
                    int i146 = ((((i144 & paddingLeft2) | i145) << 1) - (~(-i145))) - 1;
                    int i147 = a;
                    int i148 = i147 & 31;
                    int i149 = ((i147 ^ 31) | i148) << 1;
                    int i150 = -((i147 | 31) & (~i148));
                    i16 = (i149 & i150) + (i150 | i149);
                    b = i16 % 128;
                    if (i16 % 2 != 0) {
                        i18 = measuredHeight >> i46;
                        i17 = 1;
                    } else {
                        int i151 = -(-i46);
                        int i152 = measuredHeight & i151;
                        int i153 = i151 | measuredHeight;
                        i17 = 1;
                        i18 = (i153 & (~i152)) + (i152 << 1);
                    }
                    paddingTop = i18;
                    paddingLeft2 = i146;
                } else {
                    i10 = mode2;
                    int i154 = -paddingRight;
                    if (measuredWidth + paddingLeft2 + i8 > ((i3 | i154) << 1) - (i154 ^ i3)) {
                        int i910 = i85 + 49;
                        a = i910 % 128;
                        int i911 = i910 % 2;
                        if (!d()) {
                            int i912 = a;
                            int i913 = i912 & 91;
                            i11 = (i913 - (~(-(-((i912 ^ 91) | i913))))) - 1;
                            b = i11 % 128;
                            if (i11 % 2 != 0) {
                                paddingLeft = getPaddingLeft();
                                i12 = this.c;
                                int i914 = 96 / 0;
                            } else {
                                paddingLeft = getPaddingLeft();
                                i12 = this.c;
                            }
                            paddingLeft2 = paddingLeft;
                            int i915 = -(~i12);
                            i46 = ((paddingTop & i915) + (i915 | paddingTop)) - 1;
                            int i916 = b;
                            int i917 = i916 ^ 35;
                            int i918 = -(-((i916 & 35) << 1));
                            int i1010 = ((i917 | i918) << 1) - (i917 ^ i918);
                            a = i1010 % 128;
                            int i1011 = i1010 % 2;
                        }
                    }
                    int measuredWidth4 = childAt.getMeasuredWidth();
                    int i1012 = paddingLeft2 & i8;
                    int i1013 = -(-((i1012 - (~((paddingLeft2 ^ i8) | i1012))) - 1));
                    int i1014 = measuredWidth4 & i1013;
                    int i1015 = measuredWidth4 | i1013;
                    i13 = (i1014 ^ i1015) + ((i1014 & i1015) << 1);
                    int i1016 = b + 48;
                    int i1017 = (i1016 ^ (-1)) + (i1016 << 1);
                    a = i1017 % 128;
                    int i1018 = i1017 % 2;
                    measuredHeight = childAt.getMeasuredHeight();
                    if (i13 > i4) {
                        int i1019 = b;
                        int i1110 = i1019 & 99;
                        int i1111 = (~i1110) & (i1019 | 99);
                        int i1112 = i1110 << 1;
                        int i1113 = (i1111 & i1112) + (i1111 | i1112);
                        a = i1113 % 128;
                        int i1114 = i1113 % 2;
                        int i1115 = i1019 + 97;
                        a = i1115 % 128;
                        int i1116 = i1115 % 2;
                        i4 = i13;
                    }
                    int measuredWidth5 = childAt.getMeasuredWidth();
                    int i1117 = this.d;
                    int i1118 = a;
                    int i1119 = i1118 ^ 23;
                    int i1219 = (i1118 & 23) << 1;
                    i14 = ((i1119 | i1219) << 1) - (i1219 ^ i1119);
                    b = i14 % 128;
                    if (i14 % 2 == 0) {
                        childCount = getChildCount();
                        if (i45 == ((childCount << 1) - childCount) - 1) {
                            int i12110 = a;
                            int i12111 = i12110 ^ 27;
                            int i12112 = -(-((i12110 & 27) << 1));
                            int i12113 = (i12111 & i12112) + (i12112 | i12111);
                            int i12114 = i12113 % 128;
                            b = i12114;
                            int i12115 = i12113 % 2;
                            int i12116 = -(-i9);
                            int i12117 = i4 & i12116;
                            int i12118 = -(-(i12116 | i4));
                            i4 = (i12117 & i12118) + (i12117 | i12118);
                            int i1310 = i12114 & 105;
                            i15 = (i1310 - (~((i12114 ^ 105) | i1310))) - 1;
                            a = i15 % 128;
                            if (i15 % 2 == 0) {
                                int i1311 = 5 % 2;
                            }
                        }
                    } else if (i45 == (getChildCount() << 1)) {
                        int i12119 = a;
                        int i121110 = i12119 ^ 27;
                        int i121111 = -(-((i12119 & 27) << 1));
                        int i121112 = (i121110 & i121111) + (i121111 | i121110);
                        int i121113 = i121112 % 128;
                        b = i121113;
                        int i121114 = i121112 % 2;
                        int i121115 = -(-i9);
                        int i121116 = i4 & i121115;
                        int i121117 = -(-(i121115 | i4));
                        i4 = (i121116 & i121117) + (i121116 | i121117);
                        int i1312 = i121113 & 105;
                        i15 = (i1312 - (~((i121113 ^ 105) | i1312))) - 1;
                        a = i15 % 128;
                        if (i15 % 2 == 0) {
                            int i1313 = 5 % 2;
                        }
                    }
                    int i1314 = -(-i9);
                    int i1315 = i8 & i1314;
                    int i1316 = (i8 | i1314) & (~i1315);
                    int i1317 = -(-(i1315 << 1));
                    int i1318 = -(-((i1316 ^ i1317) + ((i1316 & i1317) << 1)));
                    int i1319 = measuredWidth5 ^ i1318;
                    int i1410 = ((((i1318 & measuredWidth5) | i1319) << 1) - (~(-i1319))) - 1;
                    int i1411 = i1410 ^ i1117;
                    int i1412 = ((i1410 & i1117) | i1411) << 1;
                    int i1413 = -i1411;
                    int i1414 = (i1412 ^ i1413) + ((i1412 & i1413) << 1);
                    int i1415 = i1414 ^ paddingLeft2;
                    int i1416 = ((((i1414 & paddingLeft2) | i1415) << 1) - (~(-i1415))) - 1;
                    int i1417 = a;
                    int i1418 = i1417 & 31;
                    int i1419 = ((i1417 ^ 31) | i1418) << 1;
                    int i155 = -((i1417 | 31) & (~i1418));
                    i16 = (i1419 & i155) + (i155 | i1419);
                    b = i16 % 128;
                    if (i16 % 2 != 0) {
                        i18 = measuredHeight >> i46;
                        i17 = 1;
                    } else {
                        int i156 = -(-i46);
                        int i157 = measuredHeight & i156;
                        int i158 = i156 | measuredHeight;
                        i17 = 1;
                        i18 = (i158 & (~i157)) + (i157 << 1);
                    }
                    paddingTop = i18;
                    paddingLeft2 = i1416;
                }
                i46 = i56;
                int measuredWidth6 = childAt.getMeasuredWidth();
                int i10110 = paddingLeft2 & i8;
                int i10111 = -(-((i10110 - (~((paddingLeft2 ^ i8) | i10110))) - 1));
                int i10112 = measuredWidth6 & i10111;
                int i10113 = measuredWidth6 | i10111;
                i13 = (i10112 ^ i10113) + ((i10112 & i10113) << 1);
                int i10114 = b + 48;
                int i10115 = (i10114 ^ (-1)) + (i10114 << 1);
                a = i10115 % 128;
                int i10116 = i10115 % 2;
                measuredHeight = childAt.getMeasuredHeight();
                if (i13 > i4) {
                    int i10117 = b;
                    int i11110 = i10117 & 99;
                    int i11111 = (~i11110) & (i10117 | 99);
                    int i11112 = i11110 << 1;
                    int i11113 = (i11111 & i11112) + (i11111 | i11112);
                    a = i11113 % 128;
                    int i11114 = i11113 % 2;
                    int i11115 = i10117 + 97;
                    a = i11115 % 128;
                    int i11116 = i11115 % 2;
                    i4 = i13;
                }
                int measuredWidth7 = childAt.getMeasuredWidth();
                int i11117 = this.d;
                int i11118 = a;
                int i11119 = i11118 ^ 23;
                int i12120 = (i11118 & 23) << 1;
                i14 = ((i11119 | i12120) << 1) - (i12120 ^ i11119);
                b = i14 % 128;
                if (i14 % 2 == 0) {
                    childCount = getChildCount();
                    if (i45 == ((childCount << 1) - childCount) - 1) {
                        int i121118 = a;
                        int i121119 = i121118 ^ 27;
                        int i1211110 = -(-((i121118 & 27) << 1));
                        int i1211111 = (i121119 & i1211110) + (i1211110 | i121119);
                        int i1211112 = i1211111 % 128;
                        b = i1211112;
                        int i1211113 = i1211111 % 2;
                        int i1211114 = -(-i9);
                        int i1211115 = i4 & i1211114;
                        int i1211116 = -(-(i1211114 | i4));
                        i4 = (i1211115 & i1211116) + (i1211115 | i1211116);
                        int i13110 = i1211112 & 105;
                        i15 = (i13110 - (~((i1211112 ^ 105) | i13110))) - 1;
                        a = i15 % 128;
                        if (i15 % 2 == 0) {
                            int i13111 = 5 % 2;
                        }
                    }
                } else if (i45 == (getChildCount() << 1)) {
                    int i1211117 = a;
                    int i1211118 = i1211117 ^ 27;
                    int i1211119 = -(-((i1211117 & 27) << 1));
                    int i12111110 = (i1211118 & i1211119) + (i1211119 | i1211118);
                    int i12111111 = i12111110 % 128;
                    b = i12111111;
                    int i12111112 = i12111110 % 2;
                    int i12111113 = -(-i9);
                    int i12111114 = i4 & i12111113;
                    int i12111115 = -(-(i12111113 | i4));
                    i4 = (i12111114 & i12111115) + (i12111114 | i12111115);
                    int i13112 = i12111111 & 105;
                    i15 = (i13112 - (~((i12111111 ^ 105) | i13112))) - 1;
                    a = i15 % 128;
                    if (i15 % 2 == 0) {
                        int i13113 = 5 % 2;
                    }
                }
                int i13114 = -(-i9);
                int i13115 = i8 & i13114;
                int i13116 = (i8 | i13114) & (~i13115);
                int i13117 = -(-(i13115 << 1));
                int i13118 = -(-((i13116 ^ i13117) + ((i13116 & i13117) << 1)));
                int i13119 = measuredWidth7 ^ i13118;
                int i14110 = ((((i13118 & measuredWidth7) | i13119) << 1) - (~(-i13119))) - 1;
                int i14111 = i14110 ^ i11117;
                int i14112 = ((i14110 & i11117) | i14111) << 1;
                int i14113 = -i14111;
                int i14114 = (i14112 ^ i14113) + ((i14112 & i14113) << 1);
                int i14115 = i14114 ^ paddingLeft2;
                int i14116 = ((((i14114 & paddingLeft2) | i14115) << 1) - (~(-i14115))) - 1;
                int i14117 = a;
                int i14118 = i14117 & 31;
                int i14119 = ((i14117 ^ 31) | i14118) << 1;
                int i159 = -((i14117 | 31) & (~i14118));
                i16 = (i14119 & i159) + (i159 | i14119);
                b = i16 % 128;
                if (i16 % 2 != 0) {
                    i18 = measuredHeight >> i46;
                    i17 = 1;
                } else {
                    int i1510 = -(-i46);
                    int i1511 = measuredHeight & i1510;
                    int i1512 = i1510 | measuredHeight;
                    i17 = 1;
                    i18 = (i1512 & (~i1511)) + (i1511 << 1);
                }
                paddingTop = i18;
                paddingLeft2 = i14116;
            }
            int i160 = ((i45 ^ 77) | (i45 & 77)) << i17;
            int i161 = -((i45 & (-78)) | ((~i45) & 77));
            i45 = (-2) - (((((i160 | i161) << i17) - (i160 ^ i161)) - 75) ^ (-1));
            int i162 = b + 17;
            a = i162 % 128;
            int i163 = i162 % 2;
            size2 = size2;
            mode2 = i10;
            i19 = 2;
            i24 = 1;
        }
        int i164 = size2;
        int i165 = mode2;
        int paddingRight2 = getPaddingRight();
        int i166 = -(-i4);
        int i167 = (paddingRight2 ^ i166) + ((paddingRight2 & i166) << 1);
        int paddingBottom = getPaddingBottom();
        int i168 = b;
        int i169 = i168 & 17;
        int i170 = -(-((i168 ^ 17) | i169));
        int i171 = ((i169 | i170) << 1) - (i169 ^ i170);
        a = i171 % 128;
        if (i171 % 2 == 0) {
            i5 = paddingBottom / paddingTop;
            if (mode != Integer.MIN_VALUE) {
                int i172 = i168 + 29;
                a = i172 % 128;
                int i173 = i172 % 2;
                if (mode != 1073741824) {
                    int i174 = ((i168 ^ 41) | (i168 & 41)) << 1;
                    int i175 = -((i168 & (-42)) | ((~i168) & 41));
                    i6 = (i174 & i175) + (i174 | i175);
                    a = i6 % 128;
                    if (i6 % 2 != 0) {
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    int i176 = ((((i168 ^ 21) | (i168 & 21)) << 1) - (~(-(((~i168) & 21) | (i168 & (-22)))))) - 1;
                    a = i176 % 128;
                    int i177 = i176 % 2;
                    size = i167;
                }
            } else {
                size = Math.min(i167, size);
                int i178 = b;
                i7 = (i178 & 119) + (i178 | 119);
                a = i7 % 128;
                if (i7 % 2 == 0) {
                    int i179 = 4 % 2;
                }
            }
        } else {
            int i180 = paddingBottom & paddingTop;
            i5 = ((paddingBottom ^ paddingTop) | i180) + i180;
            if (mode != Integer.MIN_VALUE) {
                int i1710 = i168 + 29;
                a = i1710 % 128;
                int i1711 = i1710 % 2;
                if (mode != 1073741824) {
                    int i1712 = ((i168 ^ 41) | (i168 & 41)) << 1;
                    int i1713 = -((i168 & (-42)) | ((~i168) & 41));
                    i6 = (i1712 & i1713) + (i1712 | i1713);
                    a = i6 % 128;
                    if (i6 % 2 != 0) {
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    int i1714 = ((((i168 ^ 21) | (i168 & 21)) << 1) - (~(-(((~i168) & 21) | (i168 & (-22)))))) - 1;
                    a = i1714 % 128;
                    int i1715 = i1714 % 2;
                    size = i167;
                }
            } else {
                size = Math.min(i167, size);
                int i1716 = b;
                i7 = (i1716 & 119) + (i1716 | 119);
                a = i7 % 128;
                if (i7 % 2 == 0) {
                    int i1717 = 4 % 2;
                }
            }
        }
        if (i165 != Integer.MIN_VALUE) {
            int i181 = a;
            int i182 = ((i181 ^ 33) | (i181 & 33)) << 1;
            int i183 = -((i181 & (-34)) | ((~i181) & 33));
            int i184 = (i182 ^ i183) + ((i182 & i183) << 1);
            b = i184 % 128;
            int i185 = i184 % 2;
            if (i165 != 1073741824) {
                int i186 = i181 & 15;
                int i187 = (~i186) & (i181 | 15);
                int i188 = -(-(i186 << 1));
                int i189 = (i187 & i188) + (i188 | i187);
                b = i189 % 128;
                int i190 = i189 % 2;
                int i191 = (-2) - ((((i181 | 56) << 1) - (i181 ^ 56)) ^ (-1));
                b = i191 % 128;
                int i192 = i191 % 2;
                iMin = i5;
            } else {
                iMin = i164;
            }
        } else {
            iMin = Math.min(i5, i164);
            int i193 = b;
            int i194 = ((i193 | 91) << 1) - (i193 ^ 91);
            a = i194 % 128;
            int i195 = i194 % 2;
        }
        setMeasuredDimension(size, iMin);
        int i196 = b;
        int i197 = ((i196 ^ 18) + ((i196 & 18) << 1)) - 1;
        a = i197 % 128;
        int i198 = i197 % 2;
    }
}
