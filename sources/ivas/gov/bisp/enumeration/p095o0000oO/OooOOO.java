package ivas.gov.bisp.enumeration.p095o0000oO;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import ivas.gov.bisp.enumeration.M.al;
import ivas.gov.bisp.enumeration.O.C0019p;
import ivas.gov.bisp.enumeration.O.t;
import ivas.gov.bisp.enumeration.P.u;
import ivas.gov.bisp.enumeration.Y.A;
import ivas.gov.bisp.enumeration.aM.O;
import ivas.gov.bisp.enumeration.aM.P;
import ivas.gov.bisp.enumeration.dc.j;
import ivas.gov.bisp.enumeration.p010aj.L;
import ivas.gov.bisp.enumeration.p010aj.S;
import ivas.gov.bisp.enumeration.p028ba.l;
import ivas.gov.bisp.enumeration.p081d.T;
import java.util.HashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooOOO extends ViewGroup implements m {
    private static int a = 0;
    private static int b = 1;
    public static final int[] c = {R.attr.state_checked};
    public static final int[] d;
    public int A;
    public boolean B;
    public t C;
    public ColorStateList D;
    public n E;
    public ivas.gov.bisp.enumeration.aW.t F;
    public int e;
    public final O f;
    public final View.OnClickListener g;
    public final S h;
    public int i;
    public final SparseArray<View.OnTouchListener> j;
    public OooOO0[] k;
    public int l;
    public ColorStateList m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ColorStateList f108o;
    public int p;
    public final ColorStateList q;
    public int r;
    public Drawable s;
    public SparseArray<j> t;
    public int u;
    public int v;
    public int w;
    public boolean x;
    public int y;
    public int z;

    static {
        int i = (~0) & 31;
        b = i % 128;
        if (i % 2 == 0) {
            int[] iArr = new int[1];
            iArr[1] = -16842910;
            d = iArr;
        } else {
            d = new int[]{-16842910};
        }
        int i2 = (0 - (-94)) - 1;
        b = i2 % 128;
        int i3 = i2 % 2;
    }

    public OooOOO(Context context) {
        super(context);
        this.h = new L(5);
        this.j = new SparseArray<>(5);
        this.l = 0;
        this.e = 0;
        this.t = new SparseArray<>(5);
        this.v = -1;
        this.y = -1;
        this.B = false;
        this.q = h(R.attr.textColorSecondary);
        P p = new P();
        this.f = p;
        p.O(0);
        p.M(l.d(getContext(), ivas.gov.bisp.enumeration.R.attr.motionDurationLong1, getResources().getInteger(ivas.gov.bisp.enumeration.R.integer.material_motion_duration_long_1)));
        p.N(l.e(getContext(), ivas.gov.bisp.enumeration.R.attr.motionEasingStandard, ivas.gov.bisp.enumeration.T.j.d));
        p.L(new u());
        this.g = new bhk();
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        T.aWX.t(this, 1);
    }

    @Override // androidx.appcompat.view.menu.m
    public void e(n nVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 | 23) << 1;
        int i4 = -(i2 ^ 23);
        int i5 = (i3 & i4) + (i3 | i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.E = nVar;
        int i7 = i2 + 45;
        a = i7 % 128;
        int i8 = i7 % 2;
    }

    public SparseArray<j> getBadgeDrawables() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 107;
        int i4 = i2 | 107;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        SparseArray<j> sparseArray = this.t;
        int i7 = (i2 ^ 63) + ((i2 & 63) << 1);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            return sparseArray;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ColorStateList getIconTintList() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 17;
        int i4 = (~i3) & (i2 | 17);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        ColorStateList colorStateList = this.m;
        int i8 = ((i2 | 49) << 1) - (i2 ^ 49);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return colorStateList;
        }
        throw null;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 | 5;
        int i4 = (i3 << 1) - (i3 & (~(i2 & 5)));
        b = i4 % 128;
        int i5 = i4 % 2;
        ColorStateList colorStateList = this.D;
        int i6 = i2 + 21;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return colorStateList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean getItemActiveIndicatorEnabled() {
        int i = 2 % 2;
        int i2 = a + 102;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return this.x;
        }
        throw null;
    }

    public int getItemActiveIndicatorHeight() {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 & (-116)) | ((~i3) & 115)) + ((i3 & 115) << 1);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            i = this.A;
            int i5 = 59 / 0;
        } else {
            i = this.A;
        }
        int i6 = (i3 & 101) + (i3 | 101);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return i;
        }
        throw null;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 25;
        int i4 = (i2 ^ 25) | i3;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = this.w;
        int i8 = ((i2 | 79) << 1) - (i2 ^ 79);
        a = i8 % 128;
        int i9 = i8 % 2;
        return i7;
    }

    public t getItemActiveIndicatorShapeAppearance() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 89) | (i2 & 89)) << 1;
        int i4 = -(((~i2) & 89) | (i2 & (-90)));
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        t tVar = this.C;
        int i8 = ((i6 | 119) << 1) - (i6 ^ 119);
        b = i8 % 128;
        int i9 = i8 % 2;
        return tVar;
    }

    public int getItemActiveIndicatorWidth() {
        int i = 2 % 2;
        int i2 = b + 35;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            return this.z;
        }
        throw null;
    }

    public Drawable getItemBackground() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 39;
        int i4 = i3 + ((i2 ^ 39) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        OooOO0[] oooOO0Arr = this.k;
        if (oooOO0Arr != null) {
            int i6 = i2 & 107;
            int i7 = ((((i2 ^ 107) | i6) << 1) - (~(-((~i6) & (i2 | 107))))) - 1;
            int i8 = i7 % 128;
            b = i8;
            int i9 = i7 % 2;
            if (oooOO0Arr.length > 0) {
                int i10 = i8 & 1;
                int i11 = -(-((i8 ^ 1) | i10));
                int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
                a = i12 % 128;
                int i13 = i12 % 2;
                Drawable background = oooOO0Arr[0].getBackground();
                int i14 = a;
                int i15 = i14 & 41;
                int i16 = (i15 - (~(-(-((i14 ^ 41) | i15))))) - 1;
                b = i16 % 128;
                int i17 = i16 % 2;
                return background;
            }
        }
        Drawable drawable = this.s;
        int i18 = ((i2 | 89) << 1) - (i2 ^ 89);
        b = i18 % 128;
        if (i18 % 2 != 0) {
            return drawable;
        }
        throw null;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 97;
        int i4 = (i2 | 97) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            return this.u;
        }
        int i7 = 24 / 0;
        return this.u;
    }

    public int getItemIconSize() {
        int i = 2 % 2;
        int i2 = b + 61;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        int i5 = this.n;
        int i6 = i3 ^ 107;
        int i7 = ((i3 & 107) | i6) << 1;
        int i8 = -i6;
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getItemPaddingBottom() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 119;
        int i4 = ((i2 | 119) & (~i3)) + (i3 << 1);
        int i5 = i4 % 128;
        a = i5;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i6 = this.y;
        int i7 = i5 & 23;
        int i8 = (i7 - (~((i5 ^ 23) | i7))) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
        return i6;
    }

    public int getItemPaddingTop() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 95;
        int i4 = ((~i3) & (i2 | 95)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.v;
        if (i5 == 0) {
            int i7 = 18 / 0;
        }
        int i8 = ((i2 ^ 37) - (~((i2 & 37) << 1))) - 1;
        b = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 89 / 0;
        }
        return i6;
    }

    public int getItemTextAppearanceActive() {
        int i;
        int i2 = 2 % 2;
        int i3 = b + 123;
        int i4 = i3 % 128;
        a = i4;
        if (i3 % 2 != 0) {
            i = this.r;
            int i5 = 48 / 0;
        } else {
            i = this.r;
        }
        int i6 = i4 & 37;
        int i7 = (((i4 ^ 37) | i6) << 1) - ((i4 | 37) & (~i6));
        b = i7 % 128;
        int i8 = i7 % 2;
        return i;
    }

    public int getItemTextAppearanceInactive() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 3;
        int i4 = -(-((i2 & 3) << 1));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        int i7 = this.p;
        int i8 = i2 & 35;
        int i9 = (i8 - (~((i2 ^ 35) | i8))) - 1;
        b = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 68 / 0;
        }
        return i7;
    }

    public ColorStateList getItemTextColor() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 25;
        int i4 = i3 + ((i2 ^ 25) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        ColorStateList colorStateList = this.f108o;
        int i6 = i2 & 57;
        int i7 = ((i2 ^ 57) | i6) << 1;
        int i8 = -((i2 | 57) & (~i6));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            return colorStateList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getLabelVisibilityMode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 11) + (i2 | 11);
        int i4 = i3 % 128;
        a = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i5 = this.i;
        int i6 = i4 + 83;
        b = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public n getMenu() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 105;
        int i4 = ((i2 | 105) & (~i3)) + (i3 << 1);
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        n nVar = this.E;
        int i7 = (i5 | 15) << 1;
        int i8 = -(((~i5) & 15) | (i5 & (-16)));
        int i9 = (i7 & i8) + (i8 | i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        return nVar;
    }

    public int getSelectedItemId() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 45;
        int i4 = -(-(i2 | 45));
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        int i8 = this.l;
        int i9 = i6 + 105;
        a = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 82 / 0;
        }
        return i8;
    }

    public int getSelectedItemPosition() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 27;
        int i4 = (i2 | 27) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        int i8 = this.e;
        if (i7 != 0) {
            int i9 = 22 / 0;
        }
        return i8;
    }

    public int getWindowAnimations() {
        int i = 2 % 2;
        int i2 = b + 119;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2 != 0 ? 1 : 0;
        int i5 = i3 & 113;
        int i6 = ((i3 | 113) & (~i5)) + (i5 << 1);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 93 / 0;
        }
        return i4;
    }

    public ColorStateList h(int i) {
        int[] iArr;
        int i2 = 2 % 2;
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = getContext().getTheme();
        int i3 = a;
        int i4 = i3 & 91;
        int i5 = -(-(i3 | 91));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        boolean zResolveAttribute = theme.resolveAttribute(i, typedValue, true);
        Object obj = null;
        if (!zResolveAttribute) {
            int i8 = b;
            int i9 = i8 & 39;
            int i10 = (((i8 | 39) & (~i9)) - (~(i9 << 1))) - 1;
            a = i10 % 128;
            if (i10 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        ColorStateList colorStateListB = A.b(getContext(), typedValue.resourceId);
        int i11 = b;
        int i12 = i11 ^ 39;
        int i13 = ((i11 & 39) | i12) << 1;
        int i14 = -i12;
        int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
        a = i15 % 128;
        int i16 = i15 % 2;
        Resources.Theme theme2 = getContext().getTheme();
        int i17 = b;
        int i18 = (i17 ^ 97) + ((i17 & 97) << 1);
        a = i18 % 128;
        int i19 = i18 % 2;
        if (!theme2.resolveAttribute(ivas.gov.bisp.enumeration.R.attr.colorPrimary, typedValue, true)) {
            int i20 = a;
            int i21 = (((i20 ^ 37) | (i20 & 37)) << 1) - (((~i20) & 37) | (i20 & (-38)));
            int i22 = i21 % 128;
            b = i22;
            int i23 = i21 % 2;
            int i24 = (i22 ^ 117) + ((i22 & 117) << 1);
            a = i24 % 128;
            int i25 = i24 % 2;
            return null;
        }
        int i26 = typedValue.data;
        int defaultColor = colorStateListB.getDefaultColor();
        int[][] iArr2 = new int[3][];
        int i27 = b;
        int i28 = ((i27 ^ 103) | (i27 & 103)) << 1;
        int i29 = -((i27 & (-104)) | ((~i27) & 103));
        int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
        a = i30 % 128;
        int i31 = i30 % 2;
        int[] iArr3 = d;
        iArr2[0] = iArr3;
        int i32 = (i27 ^ 94) + ((i27 & 94) << 1);
        int i33 = (i32 ^ (-1)) + (i32 << 1);
        a = i33 % 128;
        if (i33 % 2 != 0) {
            iArr2[0] = c;
            iArr2[3] = ViewGroup.EMPTY_STATE_SET;
            iArr = new int[2];
        } else {
            iArr2[1] = c;
            iArr2[2] = ViewGroup.EMPTY_STATE_SET;
            iArr = new int[3];
        }
        iArr[0] = colorStateListB.getColorForState(iArr3, defaultColor);
        iArr[1] = i26;
        iArr[2] = defaultColor;
        ColorStateList colorStateList = new ColorStateList(iArr2, iArr);
        int i34 = b;
        int i35 = i34 & 115;
        int i36 = i34 | 115;
        int i37 = (i35 & i36) + (i36 | i35);
        a = i37 % 128;
        if (i37 % 2 == 0) {
            return colorStateList;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    public boolean j(int i, int i2) {
        boolean z;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (-2) - (((i4 & 102) + (i4 | 102)) ^ (-1));
        a = i5 % 128;
        int i6 = i5 % 2;
        if (i == -1) {
            int i7 = ((i4 | 113) << 1) - (i4 ^ 113);
            int i8 = i7 % 128;
            a = i8;
            if (i7 % 2 == 0 ? i2 <= 3 : i2 <= 3) {
                int i9 = a;
                int i10 = ((i9 ^ 85) - (~((i9 & 85) << 1))) - 1;
                b = i10 % 128;
                int i11 = i10 % 2;
                z = false;
            } else {
                int i12 = ((i8 | 3) << 1) - (i8 ^ 3);
                b = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 3 % 4;
                }
                z = true;
            }
        } else if (i != 0) {
            int i14 = a;
            int i15 = ((i14 ^ 85) - (~((i14 & 85) << 1))) - 1;
            b = i15 % 128;
            int i16 = i15 % 2;
            z = false;
        } else {
            z = true;
        }
        int i17 = a;
        int i18 = i17 & 67;
        int i19 = ((i17 ^ 67) | i18) << 1;
        int i20 = -((i17 | 67) & (~i18));
        int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
        b = i21 % 128;
        if (i21 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public abstract OooOO0 k(Context context);

    public void setItemActiveIndicatorHeight(int i) {
        int length;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 45;
        int i6 = ((i4 ^ 45) | i5) << 1;
        int i7 = -((i4 | 45) & (~i5));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        int i9 = i8 % 128;
        b = i9;
        int i10 = i8 % 2;
        this.A = i;
        OooOO0[] oooOO0Arr = this.k;
        if (oooOO0Arr != null) {
            int i11 = ((i9 ^ 5) | (i9 & 5)) << 1;
            int i12 = -(((~i9) & 5) | (i9 & (-6)));
            int i13 = (i11 & i12) + (i12 | i11);
            a = i13 % 128;
            if (i13 % 2 != 0) {
                length = oooOO0Arr.length;
                i2 = 1;
            } else {
                length = oooOO0Arr.length;
                i2 = 0;
            }
            while (i2 < length) {
                int i14 = b;
                int i15 = i14 & 19;
                int i16 = (i15 - (~(-(-((i14 ^ 19) | i15))))) - 1;
                a = i16 % 128;
                int i17 = i16 % 2;
                oooOO0Arr[i2].setActiveIndicatorHeight(i);
                int i18 = i2 - 14;
                int i19 = i18 ^ 15;
                i2 = (((i18 & 15) | i19) << 1) - i19;
                int i20 = a;
                int i21 = i20 ^ 107;
                int i22 = ((((i20 & 107) | i21) << 1) - (~(-i21))) - 1;
                b = i22 % 128;
                int i23 = i22 % 2;
            }
        }
        int i24 = a;
        int i25 = i24 ^ 17;
        int i26 = ((i24 & 17) | i25) << 1;
        int i27 = -i25;
        int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
        b = i28 % 128;
        if (i28 % 2 == 0) {
            int i29 = 0 / 0;
        }
    }

    public void setItemBackgroundRes(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 + 35;
        b = i4 % 128;
        int i5 = i4 % 2;
        this.u = i;
        OooOO0[] oooOO0Arr = this.k;
        if (oooOO0Arr != null) {
            int i6 = (i3 & 89) + (i3 | 89);
            int i7 = i6 % 128;
            b = i7;
            int i8 = i6 % 2;
            int length = oooOO0Arr.length;
            int i9 = i7 & 5;
            int i10 = i9 + ((i7 ^ 5) | i9);
            a = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 0;
            while (i12 < length) {
                int i13 = a;
                int i14 = i13 & 27;
                int i15 = (i14 - (~((i13 ^ 27) | i14))) - 1;
                b = i15 % 128;
                if (i15 % 2 == 0) {
                    oooOO0Arr[i12].setItemBackground(i);
                    int i16 = i12 & 102;
                    int i17 = (i12 | 102) & (~i16);
                    int i18 = i16 << 1;
                    i12 = ((i17 ^ i18) + ((i17 & i18) << 1)) - 15;
                } else {
                    oooOO0Arr[i12].setItemBackground(i);
                    int i19 = i12 & 1;
                    i12 = (((i12 ^ 1) | i19) << 1) - ((i12 | 1) & (~i19));
                }
            }
        }
        int i20 = b;
        int i21 = (i20 & 99) + (i20 | 99);
        a = i21 % 128;
        int i22 = i21 % 2;
    }

    public void setLabelVisibilityMode(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (-2) - (((i3 ^ 78) + ((i3 & 78) << 1)) ^ (-1));
        a = i4 % 128;
        if (i4 % 2 != 0) {
            this.i = i;
            int i5 = 66 / 0;
        } else {
            this.i = i;
        }
        int i6 = i3 & 121;
        int i7 = -(-((i3 ^ 121) | i6));
        int i8 = (i6 & i7) + (i6 | i7);
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setPresenter(ivas.gov.bisp.enumeration.aW.t tVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 69;
        int i4 = i3 + ((i2 ^ 69) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.F = tVar;
        int i6 = i2 & 115;
        int i7 = i2 | 115;
        int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private OooOO0 getNewItem() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 35) << 1) - (i2 ^ 35);
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        OooOO0 oooOO0K = (OooOO0) this.h.e();
        if (oooOO0K == null) {
            int i4 = a + 89;
            b = i4 % 128;
            if (i4 % 2 == 0) {
                oooOO0K = k(getContext());
                int i5 = 91 / 0;
            } else {
                oooOO0K = k(getContext());
            }
        }
        int i6 = b;
        int i7 = i6 & 97;
        int i8 = ((((i6 ^ 97) | i7) << 1) - (~(-((i6 | 97) & (~i7))))) - 1;
        a = i8 % 128;
        if (i8 % 2 == 0) {
            return oooOO0K;
        }
        obj.hashCode();
        throw null;
    }

    public void setBadgeDrawables(SparseArray<j> sparseArray) {
        int i = 2 % 2;
        int i2 = b + 89;
        int i3 = i2 % 128;
        a = i3;
        if (i2 % 2 != 0) {
            this.t = sparseArray;
            throw null;
        }
        this.t = sparseArray;
        OooOO0[] oooOO0Arr = this.k;
        if (oooOO0Arr != null) {
            int length = oooOO0Arr.length;
            int i4 = (i3 ^ 53) + ((i3 & 53) << 1);
            b = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 0;
            while (i6 < length) {
                int i7 = a;
                int i8 = i7 & 103;
                int i9 = i8 + ((i7 ^ 103) | i8);
                b = i9 % 128;
                if (i9 % 2 == 0) {
                    oooOO0Arr[i6].getId();
                    throw null;
                }
                OooOO0 oooOO0 = oooOO0Arr[i6];
                int id = oooOO0.getId();
                int i10 = a;
                int i11 = ((i10 | 57) << 1) - (i10 ^ 57);
                b = i11 % 128;
                if (i11 % 2 == 0) {
                    oooOO0.setBadge(sparseArray.get(id));
                    int i12 = (i6 ^ (-77)) + ((i6 & (-77)) << 1);
                    i6 = ((i12 | 126) << 1) - (i12 ^ 126);
                } else {
                    oooOO0.setBadge(sparseArray.get(id));
                    int i13 = (i6 & 32) | ((~i6) & (-33));
                    int i14 = -(-((i6 & (-33)) << 1));
                    int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
                    i6 = ((i15 ^ 35) + ((i15 & 35) << 1)) - 1;
                }
            }
        }
        int i16 = b;
        int i17 = (-2) - (((i16 & 38) + (i16 | 38)) ^ (-1));
        a = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = 36 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041 A[LOOP:0: B:10:0x003f->B:11:0x0041, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:9:0x0024 A[PHI: r3
  0x0024: PHI (r3v4 ivas.gov.bisp.enumeration.o0000oO.OooOO0[]) = (r3v3 ivas.gov.bisp.enumeration.o0000oO.OooOO0[]), (r3v6 ivas.gov.bisp.enumeration.o0000oO.OooOO0[]) binds: [B:8:0x0022, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    public void setItemActiveIndicatorMarginHorizontal(int i) {
        OooOO0[] oooOO0Arr;
        int length;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 + 92;
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        b = i5 % 128;
        int i6 = 0;
        if (i5 % 2 == 0) {
            this.w = i;
            oooOO0Arr = this.k;
            int i7 = 41 / 0;
            if (oooOO0Arr != null) {
                int i8 = (i3 & (-38)) | ((~i3) & 37);
                int i9 = (i3 & 37) << 1;
                int i10 = (i8 & i9) + (i9 | i8);
                int i11 = i10 % 128;
                b = i11;
                int i12 = i10 % 2;
                length = oooOO0Arr.length;
                int i13 = i11 + 79;
                a = i13 % 128;
                int i14 = i13 % 2;
                while (i6 < length) {
                    int i15 = b;
                    int i16 = i15 & 89;
                    int i17 = ((((i15 ^ 89) | i16) << 1) - (~(-((i15 | 89) & (~i16))))) - 1;
                    a = i17 % 128;
                    int i18 = i17 % 2;
                    oooOO0Arr[i6].setActiveIndicatorMarginHorizontal(i);
                    i6 = (i6 | 1) + (i6 & 1);
                    int i19 = (-2) - ((b + 76) ^ (-1));
                    a = i19 % 128;
                    int i20 = i19 % 2;
                }
            }
        } else {
            this.w = i;
            oooOO0Arr = this.k;
            if (oooOO0Arr != null) {
                int i21 = (i3 & (-38)) | ((~i3) & 37);
                int i22 = (i3 & 37) << 1;
                int i110 = (i21 & i22) + (i22 | i21);
                int i111 = i110 % 128;
                b = i111;
                int i112 = i110 % 2;
                length = oooOO0Arr.length;
                int i113 = i111 + 79;
                a = i113 % 128;
                int i114 = i113 % 2;
                while (i6 < length) {
                    int i115 = b;
                    int i116 = i115 & 89;
                    int i117 = ((((i115 ^ 89) | i116) << 1) - (~(-((i115 | 89) & (~i116))))) - 1;
                    a = i117 % 128;
                    int i118 = i117 % 2;
                    oooOO0Arr[i6].setActiveIndicatorMarginHorizontal(i);
                    i6 = (i6 | 1) + (i6 & 1);
                    int i119 = (-2) - ((b + 76) ^ (-1));
                    a = i119 % 128;
                    int i23 = i119 % 2;
                }
            }
        }
        int i24 = b;
        int i25 = ((i24 ^ 45) | (i24 & 45)) << 1;
        int i26 = -(((~i24) & 45) | (i24 & (-46)));
        int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
        a = i27 % 128;
        if (i27 % 2 != 0) {
            throw null;
        }
    }

    public void setItemActiveIndicatorWidth(int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = i5 & 17;
        int i7 = i5 | 17;
        int i8 = (i6 & i7) + (i6 | i7);
        b = i8 % 128;
        Object obj = null;
        if (i8 % 2 == 0) {
            this.z = i;
            throw null;
        }
        this.z = i;
        OooOO0[] oooOO0Arr = this.k;
        if (oooOO0Arr != null) {
            int length = oooOO0Arr.length;
            int i9 = (i5 & 57) + (i5 | 57);
            b = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 0;
            while (i11 < length) {
                int i12 = b + 96;
                int i13 = (i12 ^ (-1)) + (i12 << 1);
                a = i13 % 128;
                if (i13 % 2 != 0) {
                    oooOO0Arr[i11].setActiveIndicatorWidth(i);
                    i2 = i11 ^ 67;
                    i3 = (i11 & 67) << 1;
                } else {
                    oooOO0Arr[i11].setActiveIndicatorWidth(i);
                    int i14 = i11 + 119;
                    i2 = i14 & (-118);
                    i3 = i14 | (-118);
                }
                i11 = i2 + i3;
                int i15 = (-2) - ((a + 102) ^ (-1));
                b = i15 % 128;
                int i16 = i15 % 2;
            }
        }
        int i17 = b + 39;
        a = i17 % 128;
        if (i17 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void setItemIconSize(int i) {
        int i2 = 2 % 2;
        int i3 = (-2) - ((b + 4) ^ (-1));
        int i4 = i3 % 128;
        a = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.n = i;
            throw null;
        }
        this.n = i;
        OooOO0[] oooOO0Arr = this.k;
        if (oooOO0Arr != null) {
            int i5 = i4 + 67;
            b = i5 % 128;
            int i6 = i5 % 2;
            int length = oooOO0Arr.length;
            int i7 = 0;
            while (i7 < length) {
                int i8 = a;
                int i9 = (i8 & 91) + (i8 | 91);
                b = i9 % 128;
                int i10 = i9 % 2;
                oooOO0Arr[i7].setIconSize(i);
                i7++;
                int i11 = a;
                int i12 = (i11 | 113) << 1;
                int i13 = -(((~i11) & 113) | (i11 & (-114)));
                int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                b = i14 % 128;
                int i15 = i14 % 2;
            }
        }
        int i16 = a;
        int i17 = i16 ^ 53;
        int i18 = -(-((i16 & 53) << 1));
        int i19 = (i17 & i18) + (i18 | i17);
        b = i19 % 128;
        if (i19 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void setItemPaddingTop(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 | 89) << 1) - (i3 ^ 89);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.v = i;
        OooOO0[] oooOO0Arr = this.k;
        if (oooOO0Arr != null) {
            int i6 = (-2) - ((i3 + 54) ^ (-1));
            a = i6 % 128;
            int i7 = i6 % 2;
            int length = oooOO0Arr.length;
            int i8 = 0;
            while (i8 < length) {
                int i9 = a;
                int i10 = ((i9 & (-76)) | ((~i9) & 75)) + ((i9 & 75) << 1);
                b = i10 % 128;
                int i11 = i10 % 2;
                oooOO0Arr[i8].setItemPaddingTop(i);
                int i12 = i8 ^ 95;
                int i13 = ((i8 & 95) | i12) << 1;
                int i14 = -i12;
                int i15 = (i13 & i14) + (i13 | i14);
                i8 = ((i15 & 93) | ((~i15) & (-94))) + ((i15 & (-94)) << 1);
                int i16 = a;
                int i17 = ((i16 | 35) << 1) - (((~i16) & 35) | (i16 & (-36)));
                b = i17 % 128;
                if (i17 % 2 == 0) {
                    int i18 = 3 % 4;
                }
            }
        }
        int i19 = b;
        int i20 = i19 & 87;
        int i21 = ((((i19 ^ 87) | i20) << 1) - (~(-((i19 | 87) & (~i20))))) - 1;
        a = i21 % 128;
        int i22 = i21 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035  */
    /* JADX WARN: Code duplicated, block: B:13:0x005d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0024 A[PHI: r2
  0x0024: PHI (r2v4 ivas.gov.bisp.enumeration.o0000oO.OooOO0[]) = (r2v3 ivas.gov.bisp.enumeration.o0000oO.OooOO0[]), (r2v8 ivas.gov.bisp.enumeration.o0000oO.OooOO0[]) binds: [B:8:0x0022, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    public void setItemTextAppearanceActive(int i) {
        OooOO0[] oooOO0Arr;
        int length;
        OooOO0 oooOO0;
        ColorStateList colorStateList;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (i4 ^ 51) + ((i4 & 51) << 1);
        int i6 = i5 % 128;
        b = i6;
        int i7 = 0;
        if (i5 % 2 == 0) {
            this.r = i;
            oooOO0Arr = this.k;
            int i8 = 95 / 0;
            if (oooOO0Arr != null) {
                length = oooOO0Arr.length;
                int i9 = (((i6 | 6) << 1) - (i6 ^ 6)) - 1;
                a = i9 % 128;
                int i10 = i9 % 2;
                while (i7 < length) {
                    int i11 = b;
                    int i12 = i11 & 27;
                    int i13 = i12 + ((i11 ^ 27) | i12);
                    a = i13 % 128;
                    int i14 = i13 % 2;
                    oooOO0 = oooOO0Arr[i7];
                    oooOO0.setTextAppearanceActive(i);
                    colorStateList = this.f108o;
                    i2 = b;
                    int i15 = (-2) - ((((i2 | 54) << 1) - (i2 ^ 54)) ^ (-1));
                    a = i15 % 128;
                    int i16 = i15 % 2;
                    if (colorStateList != null) {
                        int i17 = (i2 | 39) << 1;
                        int i18 = -(((~i2) & 39) | (i2 & (-40)));
                        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                        a = i19 % 128;
                        int i20 = i19 % 2;
                        oooOO0.setTextColor(colorStateList);
                        int i21 = a;
                        int i22 = (i21 ^ 59) + ((i21 & 59) << 1);
                        b = i22 % 128;
                        int i23 = i22 % 2;
                    }
                    i7++;
                    int i24 = a;
                    int i25 = i24 & 37;
                    int i26 = (i24 | 37) & (~i25);
                    int i27 = -(-(i25 << 1));
                    int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
                    b = i28 % 128;
                    int i29 = i28 % 2;
                }
            }
        } else {
            this.r = i;
            oooOO0Arr = this.k;
            if (oooOO0Arr != null) {
                length = oooOO0Arr.length;
                int i30 = (((i6 | 6) << 1) - (i6 ^ 6)) - 1;
                a = i30 % 128;
                int i110 = i30 % 2;
                while (i7 < length) {
                    int i111 = b;
                    int i112 = i111 & 27;
                    int i113 = i112 + ((i111 ^ 27) | i112);
                    a = i113 % 128;
                    int i114 = i113 % 2;
                    oooOO0 = oooOO0Arr[i7];
                    oooOO0.setTextAppearanceActive(i);
                    colorStateList = this.f108o;
                    i2 = b;
                    int i115 = (-2) - ((((i2 | 54) << 1) - (i2 ^ 54)) ^ (-1));
                    a = i115 % 128;
                    int i116 = i115 % 2;
                    if (colorStateList != null) {
                        int i117 = (i2 | 39) << 1;
                        int i118 = -(((~i2) & 39) | (i2 & (-40)));
                        int i119 = (i117 ^ i118) + ((i118 & i117) << 1);
                        a = i119 % 128;
                        int i210 = i119 % 2;
                        oooOO0.setTextColor(colorStateList);
                        int i211 = a;
                        int i212 = (i211 ^ 59) + ((i211 & 59) << 1);
                        b = i212 % 128;
                        int i213 = i212 % 2;
                    }
                    i7++;
                    int i214 = a;
                    int i215 = i214 & 37;
                    int i216 = (i214 | 37) & (~i215);
                    int i217 = -(-(i215 << 1));
                    int i218 = ((i216 | i217) << 1) - (i216 ^ i217);
                    b = i218 % 128;
                    int i219 = i218 % 2;
                }
            }
        }
        int i31 = a;
        int i32 = i31 & 53;
        int i33 = -(-((i31 ^ 53) | i32));
        int i34 = (i32 & i33) + (i33 | i32);
        b = i34 % 128;
        int i35 = i34 % 2;
    }

    private void setBadgeIfNeeded(OooOO0 oooOO0) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 126) + ((i2 & 126) << 1);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        int id = oooOO0.getId();
        if (id != -1) {
            int i6 = a;
            int i7 = ((i6 | 114) << 1) - (i6 ^ 114);
            int i8 = (i7 ^ (-1)) + (i7 << 1);
            b = i8 % 128;
            if (i8 % 2 != 0) {
                j jVar = this.t.get(id);
                if (jVar != null) {
                    int i9 = a;
                    int i10 = i9 & 77;
                    int i11 = (i9 | 77) & (~i10);
                    int i12 = i10 << 1;
                    int i13 = (i11 & i12) + (i11 | i12);
                    b = i13 % 128;
                    int i14 = i13 % 2;
                    oooOO0.setBadge(jVar);
                    int i15 = b;
                    int i16 = i15 & 87;
                    int i17 = ((i15 ^ 87) | i16) << 1;
                    int i18 = -((i15 | 87) & (~i16));
                    int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                    a = i19 % 128;
                    int i20 = i19 % 2;
                }
                int i21 = a;
                int i22 = (i21 ^ 121) + ((i21 & 121) << 1);
                b = i22 % 128;
                if (i22 % 2 == 0) {
                    int i23 = 93 / 0;
                    return;
                }
                return;
            }
        } else {
            int i24 = a;
            int i25 = ((i24 ^ 21) - (~(-(-((i24 & 21) << 1))))) - 1;
            b = i25 % 128;
            if (i25 % 2 == 0) {
                int i26 = 4 / 4;
            }
        }
        int i27 = a;
        int i28 = (i27 ^ 67) + ((i27 & 67) << 1);
        b = i28 % 128;
        int i29 = i28 % 2;
    }

    public final Drawable i() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 79) + ((i2 & 79) << 1);
        int i4 = i3 % 128;
        b = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (this.C == null || this.D == null) {
            int i5 = ((i4 ^ 68) + ((i4 & 68) << 1)) - 1;
            a = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
        C0019p c0019p = new C0019p(this.C);
        ColorStateList colorStateList = this.D;
        int i7 = b + 83;
        a = i7 % 128;
        int i8 = i7 % 2;
        c0019p.u(colorStateList);
        int i9 = a;
        int i10 = (-2) - (((i9 ^ 86) + ((i9 & 86) << 1)) ^ (-1));
        b = i10 % 128;
        int i11 = i10 % 2;
        return c0019p;
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & (-66)) | ((~i2) & 65)) + ((i2 & 65) << 1);
        int i4 = i3 % 128;
        b = i4;
        if (i3 % 2 == 0) {
            this.D = colorStateList;
            throw null;
        }
        this.D = colorStateList;
        OooOO0[] oooOO0Arr = this.k;
        if (oooOO0Arr != null) {
            int length = oooOO0Arr.length;
            int i5 = ((i4 ^ 46) + ((i4 & 46) << 1)) - 1;
            a = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 0;
            while (i7 < length) {
                int i8 = b;
                int i9 = (i8 ^ 11) + ((i8 & 11) << 1);
                a = i9 % 128;
                int i10 = i9 % 2;
                oooOO0Arr[i7].setActiveIndicatorDrawable(i());
                i7 = (((i7 | 2) << 1) - (i7 ^ 2)) - 1;
                int i11 = a;
                int i12 = i11 & 77;
                int i13 = (i11 ^ 77) | i12;
                int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                b = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = 3 % 4;
                }
            }
        }
        int i16 = a;
        int i17 = ((i16 ^ 11) | (i16 & 11)) << 1;
        int i18 = -(((~i16) & 11) | (i16 & (-12)));
        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
        b = i19 % 128;
        if (i19 % 2 == 0) {
            int i20 = 14 / 0;
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = b + 33;
        int i3 = i2 % 128;
        a = i3;
        if (i2 % 2 != 0) {
            this.x = z;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.x = z;
        OooOO0[] oooOO0Arr = this.k;
        if (oooOO0Arr != null) {
            int i4 = (i3 & 33) + (i3 | 33);
            b = i4 % 128;
            int i5 = i4 % 2;
            int length = oooOO0Arr.length;
            int i6 = i3 ^ 49;
            int i7 = ((((i3 & 49) | i6) << 1) - (~(-i6))) - 1;
            b = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 0;
            while (i9 < length) {
                int i10 = b;
                int i11 = i10 & 119;
                int i12 = (i10 | 119) & (~i11);
                int i13 = i11 << 1;
                int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
                a = i14 % 128;
                if (i14 % 2 != 0) {
                    oooOO0Arr[i9].setActiveIndicatorEnabled(z);
                    int i15 = (i9 | 128) << 1;
                    int i16 = -(((~i9) & 128) | (i9 & (-129)));
                    int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                    int i18 = i17 & (-125);
                    int i19 = (i17 ^ (-125)) | i18;
                    i9 = ((i18 | i19) << 1) - (i18 ^ i19);
                } else {
                    oooOO0Arr[i9].setActiveIndicatorEnabled(z);
                    int i20 = (-2) - ((((i9 | 120) << 1) - (i9 ^ 120)) ^ (-1));
                    i9 = ((((i20 ^ (-118)) | (i20 & (-118))) << 1) - (~(-(((~i20) & (-118)) | (i20 & 117))))) - 1;
                }
            }
        }
        int i21 = b;
        int i22 = (i21 & 67) + (i21 | 67);
        a = i22 % 128;
        int i23 = i22 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0042 A[LOOP:0: B:10:0x0040->B:11:0x0042, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:9:0x002f A[PHI: r3
  0x002f: PHI (r3v6 ivas.gov.bisp.enumeration.o0000oO.OooOO0[]) = (r3v5 ivas.gov.bisp.enumeration.o0000oO.OooOO0[]), (r3v7 ivas.gov.bisp.enumeration.o0000oO.OooOO0[]) binds: [B:8:0x002d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    public void setItemActiveIndicatorResizeable(boolean z) {
        OooOO0[] oooOO0Arr;
        int length;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 43;
        int i4 = ((i2 ^ 43) | i3) << 1;
        int i5 = -((i2 | 43) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        int i7 = i6 % 128;
        a = i7;
        int i8 = 0;
        if (i6 % 2 != 0) {
            this.B = z;
            oooOO0Arr = this.k;
            int i9 = 62 / 0;
            if (oooOO0Arr != null) {
                length = oooOO0Arr.length;
                int i10 = i7 & 119;
                int i11 = (i7 ^ 119) | i10;
                int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
                b = i12 % 128;
                int i13 = i12 % 2;
                while (i8 < length) {
                    int i14 = a;
                    int i15 = (i14 & (-82)) | ((~i14) & 81);
                    int i16 = (i14 & 81) << 1;
                    int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                    b = i17 % 128;
                    int i18 = i17 % 2;
                    oooOO0Arr[i8].setActiveIndicatorResizeable(z);
                    int i19 = i8 ^ 51;
                    int i20 = ((i8 & 51) | i19) << 1;
                    int i21 = -i19;
                    int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                    int i23 = i22 & (-50);
                    i8 = ((~i23) & (i22 | (-50))) + (i23 << 1);
                    int i24 = b;
                    int i25 = i24 ^ 35;
                    int i26 = ((i24 & 35) | i25) << 1;
                    int i27 = -i25;
                    int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
                    a = i28 % 128;
                    int i29 = i28 % 2;
                }
            }
        } else {
            this.B = z;
            oooOO0Arr = this.k;
            if (oooOO0Arr != null) {
                length = oooOO0Arr.length;
                int i110 = i7 & 119;
                int i111 = (i7 ^ 119) | i110;
                int i112 = (i110 ^ i111) + ((i111 & i110) << 1);
                b = i112 % 128;
                int i113 = i112 % 2;
                while (i8 < length) {
                    int i114 = a;
                    int i115 = (i114 & (-82)) | ((~i114) & 81);
                    int i116 = (i114 & 81) << 1;
                    int i117 = ((i115 | i116) << 1) - (i116 ^ i115);
                    b = i117 % 128;
                    int i118 = i117 % 2;
                    oooOO0Arr[i8].setActiveIndicatorResizeable(z);
                    int i119 = i8 ^ 51;
                    int i210 = ((i8 & 51) | i119) << 1;
                    int i211 = -i119;
                    int i212 = ((i210 | i211) << 1) - (i211 ^ i210);
                    int i213 = i212 & (-50);
                    i8 = ((~i213) & (i212 | (-50))) + (i213 << 1);
                    int i214 = b;
                    int i215 = i214 ^ 35;
                    int i216 = ((i214 & 35) | i215) << 1;
                    int i217 = -i215;
                    int i218 = (i216 ^ i217) + ((i216 & i217) << 1);
                    a = i218 % 128;
                    int i219 = i218 % 2;
                }
            }
        }
        int i30 = a + 67;
        b = i30 % 128;
        int i31 = i30 % 2;
    }

    public void setItemPaddingBottom(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 53;
        int i5 = -(-((i3 ^ 53) | i4));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        int i7 = i6 % 128;
        a = i7;
        Object obj = null;
        if (i6 % 2 != 0) {
            this.y = i;
            throw null;
        }
        this.y = i;
        OooOO0[] oooOO0Arr = this.k;
        if (oooOO0Arr != null) {
            int i8 = i7 & 17;
            int i9 = -(-((i7 ^ 17) | i8));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            b = i10 % 128;
            int i11 = i10 % 2;
            int length = oooOO0Arr.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = b;
                int i14 = ((i13 ^ 13) | (i13 & 13)) << 1;
                int i15 = -(((~i13) & 13) | (i13 & (-14)));
                int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                a = i16 % 128;
                int i17 = i16 % 2;
                oooOO0Arr[i12].setItemPaddingBottom(i);
                i12++;
                int i18 = a;
                int i19 = (i18 | 53) << 1;
                int i20 = -(((~i18) & 53) | (i18 & (-54)));
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                b = i21 % 128;
                if (i21 % 2 == 0) {
                    int i22 = 3 / 5;
                }
            }
        }
        int i23 = b;
        int i24 = i23 & 57;
        int i25 = ((i23 ^ 57) | i24) << 1;
        int i26 = -((i23 | 57) & (~i24));
        int i27 = (i25 & i26) + (i26 | i25);
        a = i27 % 128;
        if (i27 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 59) + ((i2 & 59) << 1);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        this.m = colorStateList;
        OooOO0[] oooOO0Arr = this.k;
        if (oooOO0Arr != null) {
            int i6 = (i4 & 11) + (i4 | 11);
            b = i6 % 128;
            int i7 = i6 % 2;
            int length = oooOO0Arr.length;
            int i8 = i4 & 49;
            int i9 = (i4 | 49) & (~i8);
            int i10 = i8 << 1;
            int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
            b = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 0;
            while (i13 < length) {
                int i14 = b;
                int i15 = (i14 ^ 63) + ((i14 & 63) << 1);
                a = i15 % 128;
                int i16 = i15 % 2;
                oooOO0Arr[i13].setIconTintList(colorStateList);
                int i17 = i13 + 91;
                i13 = ((i17 | (-90)) << 1) - (i17 ^ (-90));
                int i18 = b;
                int i19 = ((i18 & 13) - (~(-(-(i18 | 13))))) - 1;
                a = i19 % 128;
                int i20 = i19 % 2;
            }
        }
        int i21 = a;
        int i22 = i21 & 75;
        int i23 = (i21 | 75) & (~i22);
        int i24 = i22 << 1;
        int i25 = (i23 & i24) + (i23 | i24);
        b = i25 % 128;
        if (i25 % 2 == 0) {
            throw null;
        }
    }

    public void setItemActiveIndicatorShapeAppearance(t tVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 62) << 1) - (i2 ^ 62)) - 1;
        int i4 = i3 % 128;
        a = i4;
        if (i3 % 2 != 0) {
            this.C = tVar;
            throw null;
        }
        this.C = tVar;
        OooOO0[] oooOO0Arr = this.k;
        if (oooOO0Arr != null) {
            int length = oooOO0Arr.length;
            int i5 = i4 + 37;
            b = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 0;
            while (i7 < length) {
                int i8 = b + 63;
                a = i8 % 128;
                if (i8 % 2 != 0) {
                    oooOO0Arr[i7].setActiveIndicatorDrawable(i());
                    i7 += 98;
                } else {
                    oooOO0Arr[i7].setActiveIndicatorDrawable(i());
                    int i9 = i7 & 1;
                    int i10 = (i7 ^ 1) | i9;
                    i7 = (i9 ^ i10) + ((i10 & i9) << 1);
                }
                int i11 = b;
                int i12 = i11 & 107;
                int i13 = i12 + ((i11 ^ 107) | i12);
                a = i13 % 128;
                int i14 = i13 % 2;
            }
        }
        int i15 = b;
        int i16 = (i15 & 55) + (i15 | 55);
        a = i16 % 128;
        int i17 = i16 % 2;
    }

    public void setItemBackground(Drawable drawable) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 63) + ((i2 & 63) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        this.s = drawable;
        OooOO0[] oooOO0Arr = this.k;
        if (oooOO0Arr != null) {
            int i5 = ((i2 & (-42)) | ((~i2) & 41)) + ((i2 & 41) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            int length = oooOO0Arr.length;
            int i7 = i2 & 23;
            int i8 = i7 + ((i2 ^ 23) | i7);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 2 % 3;
            }
            int i10 = 0;
            while (i10 < length) {
                int i11 = b;
                int i12 = i11 & 7;
                int i13 = (i11 ^ 7) | i12;
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                a = i14 % 128;
                if (i14 % 2 != 0) {
                    oooOO0Arr[i10].setItemBackground(drawable);
                    int i15 = i10 & 147;
                    int i16 = i15 + ((i10 ^ 147) | i15);
                    int i17 = i16 ^ (-124);
                    int i18 = -(-((i16 & (-124)) << 1));
                    i10 = ((i17 | i18) << 1) - (i17 ^ i18);
                } else {
                    oooOO0Arr[i10].setItemBackground(drawable);
                    i10 = (((i10 | 47) << 1) - (i10 ^ 47)) - 46;
                }
            }
        }
        int i19 = a;
        int i20 = ((i19 ^ 9) - (~(-(-((i19 & 9) << 1))))) - 1;
        b = i20 % 128;
        if (i20 % 2 == 0) {
            throw null;
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        int length;
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 107;
        int i5 = (i4 - (~((i3 ^ 107) | i4))) - 1;
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        this.f108o = colorStateList;
        OooOO0[] oooOO0Arr = this.k;
        if (oooOO0Arr != null) {
            int i8 = ((i6 & (-68)) | ((~i6) & 67)) + ((i6 & 67) << 1);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                length = oooOO0Arr.length;
                i = 1;
            } else {
                length = oooOO0Arr.length;
                i = 0;
            }
            while (i < length) {
                int i9 = b;
                int i10 = i9 & 97;
                int i11 = ((i9 ^ 97) | i10) << 1;
                int i12 = -((i9 | 97) & (~i10));
                int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                a = i13 % 128;
                if (i13 % 2 != 0) {
                    oooOO0Arr[i].setTextColor(colorStateList);
                    int i14 = ((i ^ 59) | (i & 59)) << 1;
                    int i15 = -(((~i) & 59) | (i & (-60)));
                    i = (i14 ^ i15) + ((i15 & i14) << 1);
                } else {
                    oooOO0Arr[i].setTextColor(colorStateList);
                    i = (((i & (-109)) | ((~i) & 108)) - (~(-(-((i & 108) << 1))))) - 108;
                }
            }
        }
        int i16 = b;
        int i17 = ((i16 & 25) - (~(-(-(i16 | 25))))) - 1;
        a = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = 75 / 0;
        }
    }

    public class bhk implements View.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public bhk() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i = 2 % 2;
            int i2 = a + 89;
            b = i2 % 128;
            int i3 = i2 % 2;
            androidx.appcompat.view.menu.u itemData = ((OooOO0) view).getItemData();
            OooOOO oooOOO = OooOOO.this;
            n nVar = oooOOO.E;
            int i4 = a + 101;
            b = i4 % 128;
            if (i4 % 2 != 0 ? !nVar.s(itemData, oooOOO.F, 0) : !nVar.s(itemData, oooOOO.F, 1)) {
                itemData.setChecked(true);
                int i5 = b;
                int i6 = i5 & 11;
                int i7 = i6 + ((i5 ^ 11) | i6);
                a = i7 % 128;
                int i8 = i7 % 2;
            }
            int i9 = b;
            int i10 = i9 & 5;
            int i11 = -(-(i9 | 5));
            int i12 = (i10 & i11) + (i11 | i10);
            a = i12 % 128;
            if (i12 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0048  */
    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x006d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0023 A[PHI: r2
  0x0023: PHI (r2v5 ivas.gov.bisp.enumeration.o0000oO.OooOO0[]) = (r2v4 ivas.gov.bisp.enumeration.o0000oO.OooOO0[]), (r2v6 ivas.gov.bisp.enumeration.o0000oO.OooOO0[]) binds: [B:8:0x0021, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    public void setItemTextAppearanceInactive(int i) {
        OooOO0[] oooOO0Arr;
        int length;
        int i2;
        int i3;
        OooOO0 oooOO0;
        ColorStateList colorStateList;
        int i4;
        int i5 = 2 % 2;
        int i6 = a;
        int i7 = (-2) - ((i6 + 24) ^ (-1));
        b = i7 % 128;
        if (i7 % 2 == 0) {
            this.p = i;
            oooOO0Arr = this.k;
            int i8 = 15 / 0;
            if (oooOO0Arr != null) {
                length = oooOO0Arr.length;
                int i9 = i6 + 89;
                b = i9 % 128;
                int i10 = i9 % 2;
                i2 = 0;
                while (i2 < length) {
                    int i11 = a;
                    int i12 = i11 & 27;
                    i3 = i12 + ((i11 ^ 27) | i12);
                    b = i3 % 128;
                    if (i3 % 2 != 0) {
                        oooOO0Arr[i2].setTextAppearanceInactive(i);
                        throw null;
                    }
                    oooOO0 = oooOO0Arr[i2];
                    oooOO0.setTextAppearanceInactive(i);
                    colorStateList = this.f108o;
                    if (colorStateList != null) {
                        int i13 = b;
                        int i14 = i13 | 87;
                        i4 = (i14 << 1) - ((~(i13 & 87)) & i14);
                        a = i4 % 128;
                        if (i4 % 2 == 0) {
                            oooOO0.setTextColor(colorStateList);
                            throw null;
                        }
                        oooOO0.setTextColor(colorStateList);
                        int i15 = a + 67;
                        b = i15 % 128;
                        int i16 = i15 % 2;
                    }
                    int i17 = i2 ^ 46;
                    int i18 = ((i2 & 46) | i17) << 1;
                    int i19 = -i17;
                    int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
                    int i21 = i20 & (-45);
                    i2 = (((~i21) & (i20 | (-45))) - (~(i21 << 1))) - 1;
                    int i22 = a + 64;
                    int i23 = (i22 ^ (-1)) + (i22 << 1);
                    b = i23 % 128;
                    int i24 = i23 % 2;
                }
            }
        } else {
            this.p = i;
            oooOO0Arr = this.k;
            if (oooOO0Arr != null) {
                length = oooOO0Arr.length;
                int i25 = i6 + 89;
                b = i25 % 128;
                int i110 = i25 % 2;
                i2 = 0;
                while (i2 < length) {
                    int i111 = a;
                    int i112 = i111 & 27;
                    i3 = i112 + ((i111 ^ 27) | i112);
                    b = i3 % 128;
                    if (i3 % 2 != 0) {
                        oooOO0Arr[i2].setTextAppearanceInactive(i);
                        throw null;
                    }
                    oooOO0 = oooOO0Arr[i2];
                    oooOO0.setTextAppearanceInactive(i);
                    colorStateList = this.f108o;
                    if (colorStateList != null) {
                        int i113 = b;
                        int i114 = i113 | 87;
                        i4 = (i114 << 1) - ((~(i113 & 87)) & i114);
                        a = i4 % 128;
                        if (i4 % 2 == 0) {
                            oooOO0.setTextColor(colorStateList);
                            throw null;
                        }
                        oooOO0.setTextColor(colorStateList);
                        int i115 = a + 67;
                        b = i115 % 128;
                        int i116 = i115 % 2;
                    }
                    int i117 = i2 ^ 46;
                    int i118 = ((i2 & 46) | i117) << 1;
                    int i119 = -i117;
                    int i26 = ((i118 | i119) << 1) - (i118 ^ i119);
                    int i27 = i26 & (-45);
                    i2 = (((~i27) & (i26 | (-45))) - (~(i27 << 1))) - 1;
                    int i28 = a + 64;
                    int i29 = (i28 ^ (-1)) + (i28 << 1);
                    b = i29 % 128;
                    int i210 = i29 % 2;
                }
            }
        }
        int i30 = a + 44;
        int i31 = (i30 ^ (-1)) + (i30 << 1);
        b = i31 % 128;
        if (i31 % 2 == 0) {
            int i32 = 53 / 0;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 83) - (~(i2 | 83))) - 1;
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            this.E.n();
            obj.hashCode();
            throw null;
        }
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        Object obj2 = al.aXD.c(1, this.E.n().size(), false, 1).c;
        int i4 = b + 39;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) obj2);
        } else {
            accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) obj2);
            obj.hashCode();
            throw null;
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void f() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 105) | (i2 & 105)) << 1;
        int i4 = -(((~i2) & 105) | (i2 & (-106)));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        removeAllViews();
        OooOO0[] oooOO0Arr = this.k;
        Object obj = null;
        if (oooOO0Arr != null) {
            int i7 = a;
            int i8 = i7 ^ 33;
            int i9 = ((i7 & 33) | i8) << 1;
            int i10 = -i8;
            int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
            int i12 = i11 % 128;
            b = i12;
            int i13 = i11 % 2;
            int length = oooOO0Arr.length;
            int i14 = (i12 & 111) + (i12 | 111);
            a = i14 % 128;
            int i15 = i14 % 2;
            int i16 = 0;
            while (i16 < length) {
                int i17 = b;
                int i18 = ((i17 ^ 43) | (i17 & 43)) << 1;
                int i19 = -((i17 & (-44)) | ((~i17) & 43));
                int i20 = (i18 & i19) + (i18 | i19);
                a = i20 % 128;
                if (i20 % 2 != 0) {
                    OooOO0 oooOO0 = oooOO0Arr[i16];
                    throw null;
                }
                OooOO0 oooOO1 = oooOO0Arr[i16];
                if (oooOO1 != null) {
                    int i21 = (-2) - ((((i17 | 52) << 1) - (i17 ^ 52)) ^ (-1));
                    a = i21 % 128;
                    int i22 = i21 % 2;
                    this.h.g(oooOO1);
                    ImageView imageView = oooOO1.p;
                    int i23 = a;
                    int i24 = ((i23 | 12) << 1) - (i23 ^ 12);
                    int i25 = (i24 ^ (-1)) + (i24 << 1);
                    b = i25 % 128;
                    int i26 = i25 % 2;
                    if (oooOO1.l()) {
                        int i27 = a;
                        int i28 = i27 & 21;
                        int i29 = (i27 ^ 21) | i28;
                        int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                        b = i30 % 128;
                        if (i30 % 2 == 0) {
                            throw null;
                        }
                        if (imageView != null) {
                            oooOO1.setClipChildren(true);
                            oooOO1.setClipToPadding(true);
                            j jVar = oooOO1.F;
                            if (jVar != null) {
                                int i31 = b;
                                int i32 = ((i31 | 125) << 1) - (i31 ^ 125);
                                a = i32 % 128;
                                int i33 = i32 % 2;
                                if (jVar.e() != null) {
                                    int i34 = a;
                                    int i35 = (i34 & 113) + (i34 | 113);
                                    b = i35 % 128;
                                    if (i35 % 2 == 0) {
                                        jVar.e().setForeground(null);
                                        throw null;
                                    }
                                    jVar.e().setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(jVar);
                                    int i36 = b;
                                    int i37 = i36 & 37;
                                    int i38 = (i36 ^ 37) | i37;
                                    int i39 = (i37 & i38) + (i38 | i37);
                                    a = i39 % 128;
                                    if (i39 % 2 != 0) {
                                        int i40 = 4 % 5;
                                    }
                                }
                            }
                        }
                        oooOO1.F = null;
                    }
                    oooOO1.v = null;
                    oooOO1.B = 0.0f;
                    int i41 = b + 11;
                    a = i41 % 128;
                    if (i41 % 2 != 0) {
                        oooOO1.g = true;
                    } else {
                        oooOO1.g = false;
                    }
                }
                int i42 = i16 & 1;
                i16 = ((i16 ^ 1) | i42) + i42;
                int i43 = a;
                int i44 = i43 & 45;
                int i45 = -(-((i43 ^ 45) | i44));
                int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
                b = i46 % 128;
                int i47 = i46 % 2;
            }
        }
        if (this.E.size() == 0) {
            int i48 = b;
            int i49 = (i48 & 91) + (i48 | 91);
            a = i49 % 128;
            int i50 = i49 % 2;
            this.l = 0;
            this.e = 0;
            this.k = null;
            int i51 = (i48 & 15) + (i48 | 15);
            a = i51 % 128;
            if (i51 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        HashSet hashSet = new HashSet();
        int i52 = b;
        int i53 = i52 & 21;
        int i54 = (i52 ^ 21) | i53;
        int i55 = (i53 & i54) + (i54 | i53);
        a = i55 % 128;
        int i56 = i55 % 2;
        int i57 = 0;
        while (i57 < this.E.size()) {
            int i58 = a;
            int i59 = ((i58 | 77) << 1) - (i58 ^ 77);
            b = i59 % 128;
            int i60 = i59 % 2;
            Integer numValueOf = Integer.valueOf(this.E.getItem(i57).getItemId());
            int i61 = b;
            int i62 = i61 & 71;
            int i63 = (i61 | 71) & (~i62);
            int i64 = i62 << 1;
            int i65 = (i63 & i64) + (i63 | i64);
            a = i65 % 128;
            int i66 = i65 % 2;
            hashSet.add(numValueOf);
            int i67 = (i57 & 88) + (i57 | 88);
            i57 = (((i67 & 86) | ((~i67) & (-87))) - (~(-(-((i67 & (-87)) << 1))))) - 1;
            int i68 = a;
            int i69 = i68 & 109;
            int i70 = ((i68 | 109) & (~i69)) + (i69 << 1);
            b = i70 % 128;
            int i71 = i70 % 2;
        }
        int i72 = a;
        int i73 = ((((i72 ^ 121) | (i72 & 121)) << 1) - (~(-(((~i72) & 121) | (i72 & (-122)))))) - 1;
        b = i73 % 128;
        int i74 = i73 % 2;
        int i75 = 0;
        while (i75 < this.t.size()) {
            int iKeyAt = this.t.keyAt(i75);
            Integer numValueOf2 = Integer.valueOf(iKeyAt);
            int i76 = b;
            int i77 = (((i76 | 16) << 1) - (i76 ^ 16)) - 1;
            a = i77 % 128;
            int i78 = i77 % 2;
            if (!hashSet.contains(numValueOf2)) {
                this.t.delete(iKeyAt);
                int i79 = a + 76;
                int i80 = (i79 ^ (-1)) + (i79 << 1);
                b = i80 % 128;
                int i81 = i80 % 2;
            }
            int i82 = i75 ^ 1;
            int i83 = ((i75 & 1) | i82) << 1;
            int i84 = -i82;
            i75 = (i83 | i84) + (i83 & i84);
            int i85 = b;
            int i86 = ((i85 | 67) << 1) - (i85 ^ 67);
            a = i86 % 128;
            int i87 = i86 % 2;
        }
        this.k = new OooOO0[this.E.size()];
        int i88 = this.i;
        int size = this.E.n().size();
        int i89 = a;
        int i90 = i89 & 79;
        int i91 = i89 | 79;
        int i92 = (i90 & i91) + (i91 | i90);
        b = i92 % 128;
        int i93 = i92 % 2;
        boolean zJ = j(i88, size);
        int i94 = a;
        int i95 = i94 ^ 111;
        int i96 = -(-((i94 & 111) << 1));
        int i97 = (i95 ^ i96) + ((i96 & i95) << 1);
        b = i97 % 128;
        int i98 = i97 % 2;
        int i99 = 0;
        while (i99 < this.E.size()) {
            int i100 = a;
            int i101 = (i100 & 23) + (i100 | 23);
            b = i101 % 128;
            int i102 = i101 % 2;
            this.F.d = true;
            this.E.getItem(i99).setCheckable(true);
            this.F.d = false;
            int i103 = a;
            int i104 = i103 & 117;
            int i105 = i104 + ((i103 ^ 117) | i104);
            b = i105 % 128;
            if (i105 % 2 == 0) {
                this.k[i99] = getNewItem();
                obj.hashCode();
                throw null;
            }
            OooOO0 newItem = getNewItem();
            this.k[i99] = newItem;
            newItem.setIconTintList(this.m);
            newItem.setIconSize(this.n);
            int i106 = b;
            int i107 = ((i106 ^ 2) + ((i106 & 2) << 1)) - 1;
            a = i107 % 128;
            if (i107 % 2 != 0) {
                newItem.setTextColor(this.q);
                newItem.setTextAppearanceInactive(this.p);
                obj.hashCode();
                throw null;
            }
            newItem.setTextColor(this.q);
            newItem.setTextAppearanceInactive(this.p);
            int i108 = a;
            int i109 = i108 & 29;
            int i110 = (i109 - (~((i108 ^ 29) | i109))) - 1;
            b = i110 % 128;
            int i111 = i110 % 2;
            newItem.setTextAppearanceActive(this.r);
            newItem.setTextColor(this.f108o);
            int i112 = b;
            int i113 = ((i112 | 40) << 1) - (i112 ^ 40);
            int i114 = (i113 ^ (-1)) + (i113 << 1);
            a = i114 % 128;
            int i115 = i114 % 2;
            int i116 = this.v;
            if (i116 != -1) {
                int i117 = i112 + 93;
                a = i117 % 128;
                int i118 = i117 % 2;
                newItem.setItemPaddingTop(i116);
                int i119 = a;
                int i120 = ((i119 ^ 94) + ((i119 & 94) << 1)) - 1;
                b = i120 % 128;
                int i121 = i120 % 2;
            }
            int i122 = this.y;
            if (i122 != -1) {
                int i123 = b + 35;
                a = i123 % 128;
                if (i123 % 2 != 0) {
                    newItem.setItemPaddingBottom(i122);
                    int i124 = 8 / 0;
                } else {
                    newItem.setItemPaddingBottom(i122);
                }
                int i125 = b;
                int i126 = ((i125 ^ 18) + ((i125 & 18) << 1)) - 1;
                a = i126 % 128;
                int i127 = i126 % 2;
            }
            newItem.setActiveIndicatorWidth(this.z);
            int i128 = a;
            int i129 = i128 ^ 9;
            int i130 = -(-((i128 & 9) << 1));
            int i131 = (i129 & i130) + (i130 | i129);
            b = i131 % 128;
            if (i131 % 2 == 0) {
                newItem.setActiveIndicatorHeight(this.A);
                throw null;
            }
            newItem.setActiveIndicatorHeight(this.A);
            newItem.setActiveIndicatorMarginHorizontal(this.w);
            newItem.setActiveIndicatorDrawable(i());
            int i132 = a;
            int i133 = i132 & 61;
            int i134 = ((i132 ^ 61) | i133) << 1;
            int i135 = -((i132 | 61) & (~i133));
            int i136 = ((i134 | i135) << 1) - (i135 ^ i134);
            b = i136 % 128;
            int i137 = i136 % 2;
            newItem.setActiveIndicatorResizeable(this.B);
            newItem.setActiveIndicatorEnabled(this.x);
            Drawable drawable = this.s;
            if (drawable != null) {
                int i138 = b;
                int i139 = i138 & 39;
                int i140 = ((i138 ^ 39) | i139) << 1;
                int i141 = -((i138 | 39) & (~i139));
                int i142 = ((i140 | i141) << 1) - (i141 ^ i140);
                a = i142 % 128;
                int i143 = i142 % 2;
                newItem.setItemBackground(drawable);
                int i144 = b;
                int i145 = (i144 ^ 95) + ((i144 & 95) << 1);
                a = i145 % 128;
                int i146 = i145 % 2;
            } else {
                newItem.setItemBackground(this.u);
                int i147 = a;
                int i148 = i147 ^ 109;
                int i149 = ((i147 & 109) | i148) << 1;
                int i150 = -i148;
                int i151 = (i149 ^ i150) + ((i149 & i150) << 1);
                b = i151 % 128;
                int i152 = i151 % 2;
            }
            newItem.setShifting(zJ);
            int i153 = this.i;
            int i154 = b;
            int i155 = i154 & 77;
            int i156 = -(-((i154 ^ 77) | i155));
            int i157 = (i155 ^ i156) + ((i156 & i155) << 1);
            a = i157 % 128;
            int i158 = i157 % 2;
            newItem.setLabelVisibilityMode(i153);
            androidx.appcompat.view.menu.u uVar = (androidx.appcompat.view.menu.u) this.E.getItem(i99);
            int i159 = b;
            int i160 = i159 & 35;
            int i161 = (((i159 ^ 35) | i160) << 1) - ((i159 | 35) & (~i160));
            a = i161 % 128;
            if (i161 % 2 != 0) {
                newItem.d(uVar, 1);
            } else {
                newItem.d(uVar, 0);
            }
            newItem.setItemPosition(i99);
            int i162 = b;
            int i163 = ((i162 | 19) << 1) - (i162 ^ 19);
            a = i163 % 128;
            int i164 = i163 % 2;
            int i165 = uVar.b;
            SparseArray<View.OnTouchListener> sparseArray = this.j;
            int i166 = b;
            int i167 = i166 | 85;
            int i168 = (i167 << 1) - ((~(i166 & 85)) & i167);
            a = i168 % 128;
            int i169 = i168 % 2;
            newItem.setOnTouchListener(sparseArray.get(i165));
            int i170 = b;
            int i171 = i170 & 71;
            int i172 = -(-(i170 | 71));
            int i173 = ((i171 | i172) << 1) - (i172 ^ i171);
            a = i173 % 128;
            int i174 = i173 % 2;
            newItem.setOnClickListener(this.g);
            int i175 = this.l;
            if (i175 != 0) {
                int i176 = b;
                int i177 = i176 | 15;
                int i178 = i177 << 1;
                int i179 = -((~(i176 & 15)) & i177);
                int i180 = (i178 & i179) + (i179 | i178);
                int i181 = i180 % 128;
                a = i181;
                int i182 = i180 % 2;
                if (i165 == i175) {
                    int i183 = ((i181 ^ 61) - (~(-(-((i181 & 61) << 1))))) - 1;
                    b = i183 % 128;
                    int i184 = i183 % 2;
                    this.e = i99;
                    int i185 = i181 + 5;
                    b = i185 % 128;
                    int i186 = i185 % 2;
                }
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
            int i187 = a;
            int i188 = (((i187 | 68) << 1) - (i187 ^ 68)) - 1;
            b = i188 % 128;
            int i189 = i188 % 2;
            int i190 = i99 & 1;
            int i191 = (i99 | 1) & (~i190);
            int i192 = -(-(i190 << 1));
            i99 = ((i191 & i192) << 1) + (i191 ^ i192);
        }
        int size2 = this.E.size();
        int i193 = (size2 ^ (-1)) + (size2 << 1);
        int i194 = this.e;
        int i195 = b;
        int i196 = ((i195 | 55) << 1) - (i195 ^ 55);
        a = i196 % 128;
        int i197 = i196 % 2;
        int iMin = Math.min(i193, i194);
        this.e = iMin;
        n nVar = this.E;
        int i198 = b;
        int i199 = (i198 & (-122)) | ((~i198) & 121);
        int i200 = -(-((i198 & 121) << 1));
        int i201 = (i199 ^ i200) + ((i200 & i199) << 1);
        a = i201 % 128;
        int i202 = i201 % 2;
        nVar.getItem(iMin).setChecked(true);
        int i203 = a;
        int i204 = i203 ^ 101;
        int i205 = (((i203 & 101) | i204) << 1) - i204;
        b = i205 % 128;
        int i206 = i205 % 2;
    }
}
