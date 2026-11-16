package ivas.gov.bisp.enumeration.L;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ivas.gov.bisp.enumeration.o0Oo0oo.OooO0o;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p081d.am;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends OooO0o<View> {
    private static int a = 1;
    private static int b;
    public final Rect e;
    public final Rect f;
    public int g;
    public int h;

    public h() {
        this.e = new Rect();
        this.f = new Rect();
        this.h = 0;
    }

    public int B(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 33;
        int i4 = (i2 ^ 33) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return view.getMeasuredHeight();
        }
        view.getMeasuredHeight();
        throw null;
    }

    public float x(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - ((((i2 | 50) << 1) - (i2 ^ 50)) ^ (-1));
        b = i3 % 128;
        float f = i3 % 2 != 0 ? 2.0f : 1.0f;
        int i4 = i2 & 115;
        int i5 = -(-((i2 ^ 115) | i4));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public abstract View z(List<View> list);

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0044  */
    public final int A(View view) {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & 115) + (i3 | 115);
        int i5 = i4 % 128;
        b = i5;
        int iQ = 0;
        Object obj = null;
        if (i4 % 2 != 0) {
            if (this.g != 0) {
                i = ((i5 ^ 38) + ((i5 & 38) << 1)) - 1;
                a = i % 128;
                if (i % 2 != 0) {
                    x(view);
                    throw null;
                }
                float fX = x(view);
                int i6 = this.g;
                iQ = ivas.gov.bisp.enumeration.O.r.q((int) (fX * i6), 0, i6);
                int i7 = a + 67;
                b = i7 % 128;
                int i8 = i7 % 2;
            } else {
                iQ = 1;
            }
        } else if (this.g != 0) {
            i = ((i5 ^ 38) + ((i5 & 38) << 1)) - 1;
            a = i % 128;
            if (i % 2 != 0) {
                x(view);
                throw null;
            }
            float fX2 = x(view);
            int i9 = this.g;
            iQ = ivas.gov.bisp.enumeration.O.r.q((int) (fX2 * i9), 0, i9);
            int i10 = a + 67;
            b = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = b;
        int i13 = ((i12 & 50) + (i12 | 50)) - 1;
        a = i13 % 128;
        if (i13 % 2 != 0) {
            return iQ;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004f  */
    /* JADX WARN: Code duplicated, block: B:13:0x006a  */
    /* JADX WARN: Code duplicated, block: B:15:0x0079  */
    /* JADX WARN: Code duplicated, block: B:17:0x007f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0090  */
    /* JADX WARN: Code duplicated, block: B:20:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:22:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:27:0x0102  */
    /* JADX WARN: Code duplicated, block: B:29:0x010f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0112  */
    /* JADX WARN: Code duplicated, block: B:32:0x0116  */
    /* JADX WARN: Code duplicated, block: B:6:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0036  */
    public boolean c(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View viewZ;
        int size;
        Object obj;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        am lastWindowInsets;
        int i10;
        int i11 = 2 % 2;
        int i12 = b;
        int i13 = ((i12 | 67) << 1) - (i12 ^ 67);
        a = i13 % 128;
        int i14 = i13 % 2;
        int i15 = view.getLayoutParams().height;
        if (i15 != -1) {
            int i16 = b;
            int i17 = ((i16 & 101) - (~(i16 | 101))) - 1;
            a = i17 % 128;
            int i18 = i17 % 2;
            if (i15 == -2) {
                viewZ = z(coordinatorLayout.k(view));
                if (viewZ != null) {
                    int i19 = b;
                    int i20 = i19 & 19;
                    int i21 = -(-(i19 | 19));
                    int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                    a = i22 % 128;
                    int i23 = i22 % 2;
                    size = View.MeasureSpec.getSize(i3);
                    obj = null;
                    if (size > 0) {
                        int i24 = b;
                        int i25 = ((i24 & (-102)) | ((~i24) & 101)) + ((i24 & 101) << 1);
                        a = i25 % 128;
                        int i26 = i25 % 2;
                        WeakHashMap<View, R> weakHashMap = T.c;
                        if (T.aWX.d(viewZ)) {
                            int i27 = a;
                            i9 = ((i27 | 61) << 1) - (i27 ^ 61);
                            b = i9 % 128;
                            if (i9 % 2 == 0) {
                                coordinatorLayout.getLastWindowInsets();
                                throw null;
                            }
                            lastWindowInsets = coordinatorLayout.getLastWindowInsets();
                            if (lastWindowInsets != null) {
                                int i28 = b;
                                i10 = (-2) - (((i28 & 32) + (i28 | 32)) ^ (-1));
                                a = i10 % 128;
                                if (i10 % 2 != 0) {
                                    lastWindowInsets.j();
                                    lastWindowInsets.g();
                                    throw null;
                                }
                                int iJ = lastWindowInsets.j();
                                int iG = lastWindowInsets.g();
                                int i29 = -(-iJ);
                                int i30 = iG & i29;
                                int i31 = -(-((i30 - (~((i29 ^ iG) | i30))) - 1));
                                int i32 = size & i31;
                                size = i32 + ((i31 ^ size) | i32);
                                int i33 = a;
                                int i34 = ((i33 ^ 69) | (i33 & 69)) << 1;
                                int i35 = -(((~i33) & 69) | (i33 & (-70)));
                                int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                                b = i36 % 128;
                                int i37 = i36 % 2;
                            }
                        }
                    } else {
                        size = coordinatorLayout.getHeight();
                        int i38 = a;
                        int i39 = i38 ^ 91;
                        int i40 = ((i38 & 91) | i39) << 1;
                        int i41 = -i39;
                        int i42 = (i40 ^ i41) + ((i40 & i41) << 1);
                        b = i42 % 128;
                        int i43 = i42 % 2;
                    }
                    int iB = B(viewZ);
                    int measuredHeight = viewZ.getMeasuredHeight();
                    i5 = b;
                    int i44 = i5 & 85;
                    int i45 = (((i5 ^ 85) | i44) << 1) - ((~i44) & (i5 | 85));
                    i6 = i45 % 128;
                    a = i6;
                    int i46 = i45 % 2;
                    if (i15 == -1) {
                        i8 = ((i6 | 115) << 1) - (i6 ^ 115);
                        b = i8 % 128;
                        if (i8 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        i7 = 1073741824;
                    } else {
                        int i47 = i5 & 117;
                        int i48 = (((~i47) & (i5 | 117)) - (~(i47 << 1))) - 1;
                        a = i48 % 128;
                        int i49 = i48 % 2;
                        i7 = Integer.MIN_VALUE;
                    }
                    int i50 = iB & size;
                    int i51 = -(-((iB ^ size) | i50));
                    int i52 = (i50 & i51) + (i51 | i50);
                    int i53 = -measuredHeight;
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((i52 ^ i53) + ((i53 & i52) << 1), i7);
                    int i54 = b;
                    int i55 = (((i54 | 122) << 1) - (i54 ^ 122)) - 1;
                    a = i55 % 128;
                    int i56 = i55 % 2;
                    coordinatorLayout.C(view, i, i2, iMakeMeasureSpec, i4);
                    int i57 = b + 115;
                    a = i57 % 128;
                    int i58 = i57 % 2;
                    return true;
                }
            }
        } else {
            viewZ = z(coordinatorLayout.k(view));
            if (viewZ != null) {
                int i110 = b;
                int i210 = i110 & 19;
                int i211 = -(-(i110 | 19));
                int i212 = ((i210 | i211) << 1) - (i211 ^ i210);
                a = i212 % 128;
                int i213 = i212 % 2;
                size = View.MeasureSpec.getSize(i3);
                obj = null;
                if (size > 0) {
                    int i214 = b;
                    int i215 = ((i214 & (-102)) | ((~i214) & 101)) + ((i214 & 101) << 1);
                    a = i215 % 128;
                    int i216 = i215 % 2;
                    WeakHashMap<View, R> weakHashMap2 = T.c;
                    if (T.aWX.d(viewZ)) {
                        int i217 = a;
                        i9 = ((i217 | 61) << 1) - (i217 ^ 61);
                        b = i9 % 128;
                        if (i9 % 2 == 0) {
                            coordinatorLayout.getLastWindowInsets();
                            throw null;
                        }
                        lastWindowInsets = coordinatorLayout.getLastWindowInsets();
                        if (lastWindowInsets != null) {
                            int i218 = b;
                            i10 = (-2) - (((i218 & 32) + (i218 | 32)) ^ (-1));
                            a = i10 % 128;
                            if (i10 % 2 != 0) {
                                lastWindowInsets.j();
                                lastWindowInsets.g();
                                throw null;
                            }
                            int iJ2 = lastWindowInsets.j();
                            int iG2 = lastWindowInsets.g();
                            int i219 = -(-iJ2);
                            int i310 = iG2 & i219;
                            int i311 = -(-((i310 - (~((i219 ^ iG2) | i310))) - 1));
                            int i312 = size & i311;
                            size = i312 + ((i311 ^ size) | i312);
                            int i313 = a;
                            int i314 = ((i313 ^ 69) | (i313 & 69)) << 1;
                            int i315 = -(((~i313) & 69) | (i313 & (-70)));
                            int i316 = ((i314 | i315) << 1) - (i315 ^ i314);
                            b = i316 % 128;
                            int i317 = i316 % 2;
                        }
                    }
                } else {
                    size = coordinatorLayout.getHeight();
                    int i318 = a;
                    int i319 = i318 ^ 91;
                    int i410 = ((i318 & 91) | i319) << 1;
                    int i411 = -i319;
                    int i412 = (i410 ^ i411) + ((i410 & i411) << 1);
                    b = i412 % 128;
                    int i413 = i412 % 2;
                }
                int iB2 = B(viewZ);
                int measuredHeight2 = viewZ.getMeasuredHeight();
                i5 = b;
                int i414 = i5 & 85;
                int i415 = (((i5 ^ 85) | i414) << 1) - ((~i414) & (i5 | 85));
                i6 = i415 % 128;
                a = i6;
                int i416 = i415 % 2;
                if (i15 == -1) {
                    i8 = ((i6 | 115) << 1) - (i6 ^ 115);
                    b = i8 % 128;
                    if (i8 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    i7 = 1073741824;
                } else {
                    int i417 = i5 & 117;
                    int i418 = (((~i417) & (i5 | 117)) - (~(i417 << 1))) - 1;
                    a = i418 % 128;
                    int i419 = i418 % 2;
                    i7 = Integer.MIN_VALUE;
                }
                int i59 = iB2 & size;
                int i510 = -(-((iB2 ^ size) | i59));
                int i511 = (i59 & i510) + (i510 | i59);
                int i512 = -measuredHeight2;
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((i511 ^ i512) + ((i512 & i511) << 1), i7);
                int i513 = b;
                int i514 = (((i513 | 122) << 1) - (i513 ^ 122)) - 1;
                a = i514 % 128;
                int i515 = i514 % 2;
                coordinatorLayout.C(view, i, i2, iMakeMeasureSpec2, i4);
                int i516 = b + 115;
                a = i516 % 128;
                int i517 = i516 % 2;
                return true;
            }
        }
        int i60 = b + 29;
        a = i60 % 128;
        int i61 = i60 % 2;
        return false;
    }

    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new Rect();
        this.f = new Rect();
        this.h = 0;
    }

    public void w(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        int bottom;
        int i3;
        int height;
        int bottom2;
        int i4;
        int i5 = 2 % 2;
        int i6 = a;
        int i7 = i6 & 27;
        int i8 = i6 | 27;
        int i9 = (i7 & i8) + (i8 | i7);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            z(coordinatorLayout.k(view));
            throw null;
        }
        View viewZ = z(coordinatorLayout.k(view));
        if (viewZ == null) {
            coordinatorLayout.z(view, i);
            this.h = 0;
            int i10 = a;
            int i11 = (((i10 | 44) << 1) - (i10 ^ 44)) - 1;
            b = i11 % 128;
            int i12 = i11 % 2;
            return;
        }
        CoordinatorLayout.OooOO0 oooOO0 = (CoordinatorLayout.OooOO0) view.getLayoutParams();
        Rect rect = this.e;
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int i13 = (-2) - ((b + 32) ^ (-1));
        a = i13 % 128;
        if (i13 % 2 == 0) {
            i2 = ((ViewGroup.MarginLayoutParams) oooOO0).leftMargin;
            bottom = viewZ.getBottom();
            int i14 = 3 / 0;
        } else {
            i2 = ((ViewGroup.MarginLayoutParams) oooOO0).leftMargin;
            bottom = viewZ.getBottom();
        }
        int i15 = ((ViewGroup.MarginLayoutParams) oooOO0).topMargin;
        int width = coordinatorLayout.getWidth();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int i16 = b;
        int i17 = i16 & 51;
        int i18 = (i16 | 51) & (~i17);
        int i19 = i17 << 1;
        int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
        a = i20 % 128;
        if (i20 % 2 == 0) {
            i3 = ((ViewGroup.MarginLayoutParams) oooOO0).rightMargin;
            height = coordinatorLayout.getHeight();
            bottom2 = viewZ.getBottom();
            int i21 = 12 / 0;
        } else {
            i3 = ((ViewGroup.MarginLayoutParams) oooOO0).rightMargin;
            height = coordinatorLayout.getHeight();
            bottom2 = viewZ.getBottom();
        }
        int i22 = a;
        int i23 = ((i22 ^ 85) | (i22 & 85)) << 1;
        int i24 = -((i22 & (-86)) | ((~i22) & 85));
        int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
        b = i25 % 128;
        if (i25 % 2 != 0) {
            coordinatorLayout.getPaddingBottom();
            int i26 = ((ViewGroup.MarginLayoutParams) oooOO0).bottomMargin;
            throw null;
        }
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int i27 = ((ViewGroup.MarginLayoutParams) oooOO0).bottomMargin;
        int i28 = (paddingLeft & i2) + (paddingLeft | i2);
        int i29 = -(-i15);
        int i30 = (bottom & i29) + (i29 | bottom);
        int i31 = -paddingRight;
        int i32 = (width ^ i31) + ((i31 & width) << 1);
        int i33 = a;
        int i34 = (((i33 ^ 17) | (i33 & 17)) << 1) - (((~i33) & 17) | (i33 & (-18)));
        b = i34 % 128;
        if (i34 % 2 != 0) {
            rect.set(i28, i30, i32 >> i3, ((bottom2 >> height) / paddingBottom) % i27);
        } else {
            int i35 = (-2) - ((i32 - (~(-i3))) ^ (-1));
            int i36 = ((~height) & bottom2) | ((~bottom2) & height);
            int i37 = (bottom2 & height) << 1;
            int i38 = (-2) - (((((i36 ^ i37) + ((i36 & i37) << 1)) - (~(-(~(-paddingBottom))))) - 1) ^ (-1));
            int i39 = -(~(-i27));
            int i40 = (i38 & i39) + (i38 | i39);
            rect.set(i28, i30, i35, (i40 ^ (-1)) + (i40 << 1));
        }
        am lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        int i41 = a;
        int i42 = i41 + 1;
        b = i42 % 128;
        int i43 = i42 % 2;
        if (lastWindowInsets != null) {
            int i44 = (i41 ^ 39) + ((i41 & 39) << 1);
            b = i44 % 128;
            if (i44 % 2 != 0) {
                WeakHashMap<View, R> weakHashMap = T.c;
                T.aWX.d(coordinatorLayout);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            WeakHashMap<View, R> weakHashMap2 = T.c;
            if (!(!T.aWX.d(coordinatorLayout)) && !T.aWX.d(view)) {
                int i45 = a;
                int i46 = (((i45 | 18) << 1) - (i45 ^ 18)) - 1;
                b = i46 % 128;
                int i47 = i46 % 2;
                int i48 = rect.left;
                int iH = lastWindowInsets.h();
                int i49 = a;
                int i50 = ((i49 ^ 53) | (i49 & 53)) << 1;
                int i51 = -(((~i49) & 53) | (i49 & (-54)));
                int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
                b = i52 % 128;
                int i53 = i52 % 2;
                rect.left = iH + i48;
                int i54 = rect.right;
                int i55 = -lastWindowInsets.i();
                int i56 = i54 & i55;
                int i57 = (i55 | i54) & (~i56);
                int i58 = i56 << 1;
                int i59 = ((i57 | i58) << 1) - (i57 ^ i58);
                int i60 = a + 65;
                b = i60 % 128;
                int i61 = i60 % 2;
                rect.right = i59;
                int i62 = b;
                int i63 = (i62 & 47) + (i62 | 47);
                a = i63 % 128;
                if (i63 % 2 == 0) {
                    int i64 = 2 / 5;
                }
            }
        }
        Rect rect2 = this.f;
        int i65 = oooOO0.d;
        int i66 = a;
        int i67 = (i66 & (-6)) | ((~i66) & 5);
        int i68 = (i66 & 5) << 1;
        int i69 = (i67 ^ i68) + ((i68 & i67) << 1);
        int i70 = i69 % 128;
        b = i70;
        int i71 = i69 % 2;
        if (i65 == 0) {
            int i72 = i70 + 33;
            a = i72 % 128;
            int i73 = i72 % 2;
            int i74 = (i70 ^ 79) + ((i70 & 79) << 1);
            a = i74 % 128;
            int i75 = i74 % 2;
            i65 = 8388659;
        }
        int i76 = i65;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i77 = b;
        int i78 = i77 & 91;
        int i79 = ((i77 ^ 91) | i78) << 1;
        int i80 = -((i77 | 91) & (~i78));
        int i81 = ((i79 | i80) << 1) - (i80 ^ i79);
        a = i81 % 128;
        int i82 = i81 % 2;
        Gravity.apply(i76, measuredWidth, measuredHeight, rect, rect2, i);
        int i83 = b;
        int i84 = (i83 & 65) + (i83 | 65);
        a = i84 % 128;
        if (i84 % 2 == 0) {
            A(viewZ);
            int i85 = rect2.left;
            int i86 = rect2.top;
            throw null;
        }
        int iA = A(viewZ);
        int i87 = rect2.left;
        int i88 = rect2.top;
        int i89 = -iA;
        int i90 = i88 & i89;
        int i91 = (((i88 ^ i89) | i90) << 1) - ((i88 | i89) & (~i90));
        int i92 = rect2.right;
        int i93 = rect2.bottom;
        int i94 = i93 & i89;
        view.layout(i87, i91, i92, (i94 - (~(-(-((i89 ^ i93) | i94))))) - 1);
        int i95 = a;
        int i96 = i95 & 3;
        int i97 = (i95 ^ 3) | i96;
        int i98 = ((i96 | i97) << 1) - (i97 ^ i96);
        b = i98 % 128;
        if (i98 % 2 != 0) {
            int i99 = rect2.top;
            int bottom3 = viewZ.getBottom();
            i4 = (i99 ^ bottom3) + ((i99 & bottom3) << 1);
        } else {
            int i100 = rect2.top;
            int i101 = -viewZ.getBottom();
            int i102 = i100 ^ i101;
            int i103 = ((i100 & i101) | i102) << 1;
            int i104 = -i102;
            i4 = ((i103 | i104) << 1) - (i103 ^ i104);
        }
        this.h = i4;
        int i105 = a;
        int i106 = i105 & 123;
        int i107 = (((i105 ^ 123) | i106) << 1) - ((i105 | 123) & (~i106));
        b = i107 % 128;
        int i108 = i107 % 2;
    }
}
