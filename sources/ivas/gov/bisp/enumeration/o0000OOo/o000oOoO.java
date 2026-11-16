package ivas.gov.bisp.enumeration.o0000OOo;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.OooOOO0.OooO0OO;
import ivas.gov.bisp.enumeration.P.a;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.U.o;
import ivas.gov.bisp.enumeration.aQ.J;
import ivas.gov.bisp.enumeration.p088k.Y;
import java.util.Locale;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class o000oOoO extends OooO0OO {
    private static int a = 0;
    private static int b = 1;
    public final Y g;
    public final AccessibilityManager h;
    public final Rect i;

    public o000oOoO(Context context, AttributeSet attributeSet) {
        super(J.b(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, R.attr.autoCompleteTextViewStyle);
        this.i = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayE = a.e(context2, attributeSet, r.x, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayE.hasValue(0) && typedArrayE.getInt(0, 0) == 0) {
            int i = a;
            int i2 = (i & (-104)) | ((~i) & 103);
            int i3 = (i & 103) << 1;
            int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
            b = i4 % 128;
            int i5 = i4 % 2;
            setKeyListener(null);
            int i6 = a;
            int i7 = (i6 & 125) + (i6 | 125);
            b = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
        }
        this.h = (AccessibilityManager) context2.getSystemService("accessibility");
        Y y = new Y(context2, null, R.attr.listPopupWindowStyle, 0);
        int i10 = b;
        int i11 = i10 ^ 79;
        int i12 = -(-((i10 & 79) << 1));
        int i13 = (i11 & i12) + (i12 | i11);
        a = i13 % 128;
        int i14 = i13 % 2;
        this.g = y;
        y.q(true);
        y.t = this;
        int i15 = a;
        int i16 = i15 ^ 93;
        int i17 = ((i15 & 93) | i16) << 1;
        int i18 = -i16;
        int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
        b = i19 % 128;
        int i20 = i19 % 2;
        y.C.setInputMethodMode(2);
        y.n(getAdapter());
        y.v = new o(this);
        int i21 = b;
        int i22 = i21 & 55;
        int i23 = ((i21 ^ 55) | i22) << 1;
        int i24 = -((i21 | 55) & (~i22));
        int i25 = (i23 & i24) + (i24 | i23);
        a = i25 % 128;
        int i26 = i25 % 2;
        typedArrayE.recycle();
        int i27 = b;
        int i28 = i27 & 77;
        int i29 = (i28 - (~((i27 ^ 77) | i28))) - 1;
        a = i29 % 128;
        int i30 = i29 % 2;
    }

    public static void c(o000oOoO o000oooo, Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 53;
        int i4 = -(-((i2 ^ 53) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        o000oooo.setText(o000oooo.convertSelectionToString(obj), false);
        int i7 = a + 69;
        b = i7 % 128;
        int i8 = i7 % 2;
    }

    public final TextInputLayout d() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 45;
        int i4 = ((i2 & 45) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        ViewParent parent = getParent();
        int i8 = a;
        int i9 = (i8 & (-100)) | ((~i8) & 99);
        int i10 = -(-((i8 & 99) << 1));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        b = i11 % 128;
        int i12 = i11 % 2;
        while (parent != null) {
            int i13 = b;
            int i14 = ((i13 ^ 115) - (~((i13 & 115) << 1))) - 1;
            int i15 = i14 % 128;
            a = i15;
            if (i14 % 2 != 0) {
                boolean z = parent instanceof TextInputLayout;
                throw null;
            }
            if (parent instanceof TextInputLayout) {
                int i16 = i15 & 25;
                int i17 = ((((i15 ^ 25) | i16) << 1) - (~(-((i15 | 25) & (~i16))))) - 1;
                b = i17 % 128;
                if (i17 % 2 != 0) {
                    return (TextInputLayout) parent;
                }
                int i18 = 96 / 0;
                return (TextInputLayout) parent;
            }
            parent = parent.getParent();
            int i19 = (-2) - ((a + 42) ^ (-1));
            b = i19 % 128;
            int i20 = i19 % 2;
        }
        int i21 = a;
        int i22 = (((i21 | 53) << 1) - (~(-(((~i21) & 53) | (i21 & (-54)))))) - 1;
        b = i22 % 128;
        int i23 = i22 % 2;
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 103;
        int i4 = (i2 | 103) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        TextInputLayout textInputLayoutD = d();
        if (textInputLayoutD != null) {
            int i8 = b;
            int i9 = i8 ^ 123;
            int i10 = (i8 & 123) << 1;
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            a = i11 % 128;
            if (i11 % 2 != 0) {
                boolean z = textInputLayoutD.G;
                throw null;
            }
            if (textInputLayoutD.G) {
                CharSequence hint = textInputLayoutD.getHint();
                int i12 = b;
                int i13 = ((i12 & 48) + (i12 | 48)) - 1;
                a = i13 % 128;
                int i14 = i13 % 2;
                return hint;
            }
        }
        CharSequence hint2 = super.getHint();
        int i15 = a;
        int i16 = ((i15 | 99) << 1) - (i15 ^ 99);
        b = i16 % 128;
        if (i16 % 2 != 0) {
            return hint2;
        }
        throw null;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 117;
        int i4 = i3 + ((i2 ^ 117) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutD = d();
        if (textInputLayoutD != null) {
            int i6 = a;
            int i7 = (i6 & 8) + (i6 | 8);
            int i8 = (i7 ^ (-1)) + (i7 << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
            if (textInputLayoutD.G) {
                int i10 = b;
                int i11 = (i10 & (-120)) | ((~i10) & 119);
                int i12 = -(-((i10 & 119) << 1));
                int i13 = (i11 & i12) + (i12 | i11);
                a = i13 % 128;
                int i14 = i13 % 2;
                if (super.getHint() == null) {
                    int i15 = b;
                    int i16 = i15 & 37;
                    int i17 = i16 + ((i15 ^ 37) | i16);
                    a = i17 % 128;
                    int i18 = i17 % 2;
                    if (Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
                        int i19 = b;
                        int i20 = i19 & 1;
                        int i21 = ((((i19 ^ 1) | i20) << 1) - (~(-((i19 | 1) & (~i20))))) - 1;
                        a = i21 % 128;
                        if (i21 % 2 != 0) {
                            setHint(BuildConfig.FLAVOR);
                            throw null;
                        }
                        setHint(BuildConfig.FLAVOR);
                    }
                }
            }
        }
        int i22 = a;
        int i23 = (((i22 & (-24)) | ((~i22) & 23)) - (~((i22 & 23) << 1))) - 1;
        b = i23 % 128;
        if (i23 % 2 == 0) {
            int i24 = 65 / 0;
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 87;
        int i4 = -(-((i2 ^ 87) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            super.setAdapter(t);
            this.g.n(getAdapter());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        super.setAdapter(t);
        this.g.n(getAdapter());
        int i6 = a;
        int i7 = i6 & 49;
        int i8 = i7 + ((i6 ^ 49) | i7);
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() throws Throwable {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 105;
        int i4 = (i3 - (~((i2 ^ 105) | i3))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        AccessibilityManager accessibilityManager = this.h;
        if (accessibilityManager != null) {
            int i6 = ((i2 | 69) << 1) - (i2 ^ 69);
            a = i6 % 128;
            if (i6 % 2 != 0) {
                accessibilityManager.isTouchExplorationEnabled();
                throw null;
            }
            if (accessibilityManager.isTouchExplorationEnabled()) {
                this.g.f();
                int i7 = a;
                int i8 = i7 & 15;
                int i9 = (i7 ^ 15) | i8;
                int i10 = (i8 & i9) + (i9 | i8);
                b = i10 % 128;
                int i11 = i10 % 2;
                return;
            }
        }
        super.showDropDown();
        int i12 = b;
        int i13 = ((((i12 ^ 11) | (i12 & 11)) << 1) - (~(-(((~i12) & 11) | (i12 & (-12)))))) - 1;
        a = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 94 / 0;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int iMin;
        int measuredHeight;
        int selectedItemPosition;
        int iMin2;
        int i4;
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = i6 & 51;
        int i8 = (i6 | 51) & (~i7);
        int i9 = -(-(i7 << 1));
        int i10 = (i8 & i9) + (i8 | i9);
        a = i10 % 128;
        Object obj = null;
        if (i10 % 2 != 0) {
            super.onMeasure(i, i2);
            View.MeasureSpec.getMode(i);
            throw null;
        }
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            int i11 = b;
            int i12 = i11 & 5;
            int i13 = (i11 | 5) & (~i12);
            int i14 = i12 << 1;
            int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
            a = i15 % 128;
            int i16 = i15 % 2;
            TextInputLayout textInputLayoutD = d();
            int i17 = a;
            int i18 = i17 & 103;
            int i19 = -(-((i17 ^ 103) | i18));
            int i20 = (i18 & i19) + (i19 | i18);
            int i21 = i20 % 128;
            b = i21;
            int i22 = i20 % 2;
            if (adapter != null) {
                int i23 = ((i21 & (-102)) | ((~i21) & 101)) + ((i21 & 101) << 1);
                int i24 = i23 % 128;
                a = i24;
                int i25 = i23 % 2;
                if (textInputLayoutD == null) {
                    int i26 = i24 ^ 107;
                    int i27 = (i24 & 107) << 1;
                    int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
                    int i29 = i28 % 128;
                    b = i29;
                    i3 = i28 % 2 == 0 ? 1 : 0;
                    int i30 = i29 ^ 61;
                    int i31 = ((i29 & 61) | i30) << 1;
                    int i32 = -i30;
                    int i33 = (i31 ^ i32) + ((i31 & i32) << 1);
                    a = i33 % 128;
                    int i34 = i33 % 2;
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                    int measuredHeight2 = getMeasuredHeight();
                    int i35 = b;
                    int i36 = (i35 & 119) + (i35 | 119);
                    a = i36 % 128;
                    int iMakeMeasureSpec2 = i36 % 2 != 0 ? View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1) : View.MeasureSpec.makeMeasureSpec(measuredHeight2, 0);
                    Y y = this.g;
                    int i37 = a;
                    int i38 = (i37 & (-12)) | ((~i37) & 11);
                    int i39 = -(-((i37 & 11) << 1));
                    int i40 = (i38 & i39) + (i39 | i38);
                    b = i40 % 128;
                    int i41 = i40 % 2;
                    if (!(!y.e())) {
                        selectedItemPosition = y.i.getSelectedItemPosition();
                        int i42 = b;
                        int i43 = ((((i42 ^ 107) | (i42 & 107)) << 1) - (~(-(((~i42) & 107) | (i42 & (-108)))))) - 1;
                        a = i43 % 128;
                        if (i43 % 2 != 0) {
                            int i44 = 2 % 5;
                        }
                    } else {
                        int i45 = b;
                        int i46 = (i45 & 125) + (i45 | 125);
                        a = i46 % 128;
                        int i47 = i46 % 2;
                        int i48 = (i45 ^ 14) + ((i45 & 14) << 1);
                        selectedItemPosition = -1;
                        int i49 = (-2) - (i48 ^ (-1));
                        a = i49 % 128;
                        int i50 = i49 % 2;
                    }
                    int iMax = Math.max(0, selectedItemPosition);
                    int count = adapter.getCount();
                    int i51 = b;
                    int i52 = i51 | 79;
                    int i53 = ((i52 << 1) - (~(-((~(i51 & 79)) & i52)))) - 1;
                    a = i53 % 128;
                    if (i53 % 2 != 0) {
                        int i54 = iMax & (-73);
                        iMin2 = Math.min(count, i54 + ((iMax ^ (-73)) | i54));
                        i4 = iMin2 << 15;
                    } else {
                        int i55 = iMax & 15;
                        iMin2 = Math.min(count, ((((iMax ^ 15) | i55) << 1) - (~(-((iMax | 15) & (~i55))))) - 1);
                        int i56 = iMin2 ^ (-15);
                        int i57 = (iMin2 & (-15)) << 1;
                        i4 = ((i56 | i57) << 1) - (i56 ^ i57);
                    }
                    int iMax2 = Math.max(0, i4);
                    int i58 = b;
                    int i59 = (i58 & 69) + (i58 | 69);
                    a = i59 % 128;
                    int i60 = i59 % 2;
                    View view = null;
                    int iMax3 = 0;
                    int i61 = 0;
                    while (iMax2 < iMin2) {
                        int i62 = a;
                        int i63 = i62 & 47;
                        int i64 = ((((i62 ^ 47) | i63) << 1) - (~(-((~i63) & (i62 | 47))))) - 1;
                        b = i64 % 128;
                        int i65 = i64 % 2;
                        int itemViewType = adapter.getItemViewType(iMax2);
                        int i66 = b + 103;
                        int i67 = i66 % 128;
                        a = i67;
                        if (i66 % 2 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                        if (itemViewType != i61) {
                            int i68 = i67 + 21;
                            b = i68 % 128;
                            if (i68 % 2 == 0) {
                                throw null;
                            }
                            view = null;
                            i61 = itemViewType;
                        }
                        view = adapter.getView(iMax2, view, textInputLayoutD);
                        if (view.getLayoutParams() == null) {
                            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
                            int i69 = b;
                            int i70 = (((i69 & (-20)) | (19 & (~i69))) - (~(-(-((i69 & 19) << 1))))) - 1;
                            a = i70 % 128;
                            int i71 = i70 % 2;
                            view.setLayoutParams(layoutParams);
                            int i72 = b;
                            int i73 = i72 & 85;
                            int i74 = -(-((i72 ^ 85) | i73));
                            int i75 = (i73 & i74) + (i74 | i73);
                            a = i75 % 128;
                            int i76 = i75 % 2;
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        int measuredWidth2 = view.getMeasuredWidth();
                        int i77 = a + 13;
                        b = i77 % 128;
                        if (i77 % 2 == 0) {
                            iMax2 += 72;
                            iMax3 = Math.max(iMax3, measuredWidth2);
                        } else {
                            int iMax4 = Math.max(iMax3, measuredWidth2);
                            int i78 = iMax2 & 49;
                            int i79 = (i78 - (~((iMax2 ^ 49) | i78))) - 1;
                            iMax3 = iMax4;
                            iMax2 = ((((i79 ^ (-48)) | (i79 & (-48))) << 1) - (~(-(((-48) & (~i79)) | (i79 & 47))))) - 1;
                        }
                    }
                    Drawable drawableC = this.g.c();
                    if (drawableC != null) {
                        int i80 = b;
                        int i81 = (i80 & (-40)) | ((~i80) & 39);
                        int i82 = (i80 & 39) << 1;
                        int i83 = (i81 ^ i82) + ((i82 & i81) << 1);
                        a = i83 % 128;
                        int i84 = i83 % 2;
                        drawableC.getPadding(this.i);
                        Rect rect = this.i;
                        int i85 = a;
                        int i86 = (i85 | 41) << 1;
                        int i87 = -(i85 ^ 41);
                        int i88 = (i86 & i87) + (i87 | i86);
                        b = i88 % 128;
                        if (i88 % 2 == 0) {
                            iMax3 %= rect.left << rect.right;
                        } else {
                            int i89 = rect.left;
                            int i90 = -(-rect.right);
                            int i91 = ((i89 | i90) << 1) - (i90 ^ i89);
                            int i92 = iMax3 ^ i91;
                            int i93 = -(-((iMax3 & i91) << 1));
                            iMax3 = (i92 & i93) + (i92 | i93);
                        }
                        int i94 = a;
                        int i95 = i94 & 57;
                        int i96 = -(-((i94 ^ 57) | i95));
                        int i97 = (i95 ^ i96) + ((i96 & i95) << 1);
                        b = i97 % 128;
                        int i98 = i97 % 2;
                    }
                    int measuredWidth3 = textInputLayoutD.getEndIconView().getMeasuredWidth();
                    int i99 = -(-iMax3);
                    int i100 = measuredWidth3 ^ i99;
                    int i101 = -(-((measuredWidth3 & i99) << 1));
                    i3 = (i100 & i101) + (i101 | i100);
                    int i102 = b;
                    int i103 = i102 & 71;
                    int i104 = i103 + ((i102 ^ 71) | i103);
                    a = i104 % 128;
                    int i105 = i104 % 2;
                }
            } else {
                i3 = 0;
            }
            int iMax5 = Math.max(measuredWidth, i3);
            int size = View.MeasureSpec.getSize(i);
            int i106 = b;
            int i107 = (i106 ^ 63) + ((i106 & 63) << 1);
            a = i107 % 128;
            if (i107 % 2 != 0) {
                iMin = Math.min(iMax5, size);
                measuredHeight = getMeasuredHeight();
                int i108 = 22 / 0;
            } else {
                iMin = Math.min(iMax5, size);
                measuredHeight = getMeasuredHeight();
            }
            int i109 = a;
            int i110 = (i109 ^ 55) + ((i109 & 55) << 1);
            b = i110 % 128;
            int i111 = i110 % 2;
            setMeasuredDimension(iMin, measuredHeight);
            if (i111 == 0) {
                obj.hashCode();
                throw null;
            }
        }
        int i112 = b;
        int i113 = ((((i112 ^ 89) | (i112 & 89)) << 1) - (~(-(((~i112) & 89) | (i112 & (-90)))))) - 1;
        a = i113 % 128;
        int i114 = i113 % 2;
    }
}
