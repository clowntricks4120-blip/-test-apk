package ivas.gov.bisp.enumeration.p095o0000oO;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.StateSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.p;
import ivas.gov.bisp.enumeration.O.C0019p;
import ivas.gov.bisp.enumeration.O.j;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.P.a;
import ivas.gov.bisp.enumeration.aK.S;
import ivas.gov.bisp.enumeration.aL.h;
import ivas.gov.bisp.enumeration.aQ.J;
import ivas.gov.bisp.enumeration.aW.t;
import ivas.gov.bisp.enumeration.aW.z;
import ivas.gov.bisp.enumeration.o000OOo.OooO0OO;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p088k.B;
import ivas.gov.bisp.enumeration.p099u.i;
import ivas.gov.bisp.enumeration.p103z.l;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooOo00 extends FrameLayout {
    private static int a = 1;
    private static int b;
    public final z c;
    public final OooOOO d;
    public final t e;
    public MenuInflater f;
    public ColorStateList g;
    public aNP h;
    public aNO i;

    public interface aNO {
        void b(MenuItem menuItem);
    }

    public interface aNP {
        boolean b(MenuItem menuItem);
    }

    public static class bhq extends l {
        public static final Parcelable.Creator<bhq> CREATOR = new bhr();
        private static int b = 1;
        private static int c;
        public Bundle f;

        public static final class bhr implements Parcelable.ClassLoaderCreator<bhq> {
            private static int a = 1;
            private static int b;

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final bhq createFromParcel(Parcel parcel, ClassLoader classLoader) {
                int i = 2 % 2;
                bhq bhqVar = new bhq(parcel, classLoader);
                int i2 = a;
                int i3 = ((i2 & 53) - (~(-(-(i2 | 53))))) - 1;
                b = i3 % 128;
                if (i3 % 2 == 0) {
                    return bhqVar;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = a;
                int i4 = (i3 ^ 71) + ((i3 & 71) << 1);
                b = i4 % 128;
                int i5 = i4 % 2;
                bhq[] bhqVarArr = new bhq[i];
                int i6 = ((i3 | 85) << 1) - (i3 ^ 85);
                b = i6 % 128;
                if (i6 % 2 == 0) {
                    return bhqVarArr;
                }
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                bhq bhqVar = new bhq(parcel, null);
                int i2 = b + 43;
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 85 / 0;
                }
                return bhqVar;
            }
        }

        static {
            int i = c;
            int i2 = (i & 126) + (i | 126);
            int i3 = (i2 ^ (-1)) + (i2 << 1);
            b = i3 % 128;
            int i4 = i3 % 2;
        }

        public bhq(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // ivas.gov.bisp.enumeration.p103z.l, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = b + 123;
            c = i3 % 128;
            int i4 = i3 % 2;
            parcel.writeParcelable(this.e, i);
            Bundle bundle = this.f;
            int i5 = b;
            int i6 = i5 & 13;
            int i7 = (i5 ^ 13) | i6;
            int i8 = (i6 & i7) + (i7 | i6);
            c = i8 % 128;
            if (i8 % 2 != 0) {
                parcel.writeBundle(bundle);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            parcel.writeBundle(bundle);
            int i9 = b;
            int i10 = i9 & 87;
            int i11 = (i9 ^ 87) | i10;
            int i12 = (i10 & i11) + (i11 | i10);
            c = i12 % 128;
            int i13 = i12 % 2;
        }

        public bhq(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = bhq.class.getClassLoader();
                int i = c;
                int i2 = ((i & 86) + (i | 86)) - 1;
                b = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            this.f = parcel.readBundle(classLoader);
            int i5 = c;
            int i6 = ((i5 ^ 25) | (i5 & 25)) << 1;
            int i7 = -(((~i5) & 25) | (i5 & (-26)));
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0491  */
    /* JADX WARN: Code duplicated, block: B:36:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:38:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:40:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:41:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:45:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:48:0x0210  */
    /* JADX WARN: Code duplicated, block: B:50:0x0226  */
    /* JADX WARN: Code duplicated, block: B:51:0x022d  */
    public OooOo00(Context context, AttributeSet attributeSet, int i, int i2) {
        C0019p c0019p;
        Drawable background;
        C0019p.bfp bfpVar;
        S s;
        int i3;
        int i4;
        ColorStateList colorStateListValueOf;
        int i5;
        int i6;
        TypedArray typedArrayObtainStyledAttributes;
        int dimensionPixelSize;
        super(J.b(context, attributeSet, i, i2), attributeSet, i);
        t tVar = new t();
        this.e = tVar;
        Context context2 = getContext();
        B bF = a.f(context2, attributeSet, r.K, i, i2, 10, 9);
        z zVar = new z(context2, getClass(), getMaxItemCount());
        this.c = zVar;
        OooO0OO oooO0OO = new OooO0OO(context2);
        this.d = oooO0OO;
        tVar.c = oooO0OO;
        tVar.e = 1;
        oooO0OO.setPresenter(tVar);
        zVar.e(tVar, zVar.c);
        getContext();
        tVar.c.E = zVar;
        if (bF.t(5)) {
            oooO0OO.setIconTintList(bF.h(5));
            int i7 = b;
            int i8 = i7 & 27;
            int i9 = -(-((i7 ^ 27) | i8));
            int i10 = (i8 & i9) + (i9 | i8);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 2 % 2;
            }
        } else {
            ColorStateList colorStateListH = oooO0OO.h(R.attr.textColorSecondary);
            int i12 = b + 97;
            a = i12 % 128;
            int i13 = i12 % 2;
            oooO0OO.setIconTintList(colorStateListH);
            int i14 = b + 45;
            a = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 2 % 2;
            }
        }
        int iJ = bF.j(4, getResources().getDimensionPixelSize(ivas.gov.bisp.enumeration.R.dimen.mtrl_navigation_bar_item_default_icon_size));
        int i16 = b;
        int i17 = (i16 | 79) << 1;
        int i18 = -(i16 ^ 79);
        int i19 = (i17 & i18) + (i18 | i17);
        a = i19 % 128;
        int i20 = i19 % 2;
        setItemIconSize(iJ);
        if (bF.t(10)) {
            int i21 = b;
            int i22 = i21 ^ 43;
            int i23 = ((i21 & 43) | i22) << 1;
            int i24 = -i22;
            int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
            a = i25 % 128;
            setItemTextAppearanceInactive(i25 % 2 == 0 ? bF.r(33, 1) : bF.r(10, 0));
            int i26 = a;
            int i27 = i26 & 125;
            int i28 = ((((i26 ^ 125) | i27) << 1) - (~(-((i26 | 125) & (~i27))))) - 1;
            b = i28 % 128;
            int i29 = i28 % 2;
            int i30 = 2 % 2;
        }
        if (!(!bF.t(9))) {
            int i31 = b;
            int i32 = i31 & 27;
            int i33 = (i31 ^ 27) | i32;
            int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
            a = i34 % 128;
            int i35 = i34 % 2;
            int iR = bF.r(9, 0);
            int i36 = a;
            int i37 = (i36 & (-98)) | ((~i36) & 97);
            int i38 = (i36 & 97) << 1;
            int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
            b = i39 % 128;
            int i40 = i39 % 2;
            setItemTextAppearanceActive(iR);
            int i41 = a;
            int i42 = i41 & 55;
            int i43 = -(-(i41 | 55));
            int i44 = (i42 & i43) + (i43 | i42);
            b = i44 % 128;
            if (i44 % 2 == 0) {
                int i45 = 2 % 2;
            }
        }
        if (bF.t(11)) {
            int i46 = a;
            int i47 = (i46 & 57) + (i46 | 57);
            b = i47 % 128;
            setItemTextColor(bF.h(i47 % 2 != 0 ? 82 : 11));
            int i48 = b;
            int i49 = i48 & 101;
            int i50 = ((i48 ^ 101) | i49) << 1;
            int i51 = -((i48 | 101) & (~i49));
            int i52 = (i50 & i51) + (i51 | i50);
            a = i52 % 128;
            int i53 = i52 % 2;
            int i54 = 2 % 2;
        }
        if (getBackground() != null) {
            int i55 = b;
            int i56 = i55 & 43;
            int i57 = -(-((i55 ^ 43) | i56));
            int i58 = (i56 ^ i57) + ((i57 & i56) << 1);
            a = i58 % 128;
            int i59 = i58 % 2;
            if (getBackground() instanceof ColorDrawable) {
                c0019p = new C0019p();
                background = getBackground();
                if (!(!(background instanceof ColorDrawable))) {
                    int i60 = a;
                    int i61 = ((i60 | 65) << 1) - (i60 ^ 65);
                    b = i61 % 128;
                    int i62 = i61 % 2;
                    colorStateListValueOf = ColorStateList.valueOf(((ColorDrawable) background).getColor());
                    int i63 = a;
                    i5 = (-2) - (((i63 ^ 122) + ((i63 & 122) << 1)) ^ (-1));
                    b = i5 % 128;
                    if (i5 % 2 != 0) {
                        c0019p.u(colorStateListValueOf);
                        int i64 = 11 / 0;
                    } else {
                        c0019p.u(colorStateListValueOf);
                    }
                    int i65 = a;
                    int i66 = i65 ^ 83;
                    i6 = (((i65 & 83) | i66) << 1) - i66;
                    b = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i67 = 2 % 2;
                    }
                }
                bfpVar = c0019p.e;
                s = new S(context2);
                int i68 = b;
                i3 = (i68 ^ 85) + ((i68 & 85) << 1);
                a = i3 % 128;
                if (i3 % 2 != 0) {
                    Object obj = null;
                    bfpVar.e = s;
                    c0019p.w();
                    WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
                    obj.hashCode();
                    throw null;
                }
                bfpVar.e = s;
                c0019p.w();
                WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap2 = T.c;
                int i69 = b;
                i4 = ((i69 | 29) << 1) - (i69 ^ 29);
                a = i4 % 128;
                if (i4 % 2 == 0) {
                    T.aWX.s(this, c0019p);
                    int i70 = 45 / 0;
                } else {
                    T.aWX.s(this, c0019p);
                }
                int i71 = a;
                int i72 = (i71 & 27) + (i71 | 27);
                b = i72 % 128;
                int i73 = i72 % 2;
                int i74 = 2 % 2;
            }
        } else {
            c0019p = new C0019p();
            background = getBackground();
            if (!(!(background instanceof ColorDrawable))) {
                int i610 = a;
                int i611 = ((i610 | 65) << 1) - (i610 ^ 65);
                b = i611 % 128;
                int i612 = i611 % 2;
                colorStateListValueOf = ColorStateList.valueOf(((ColorDrawable) background).getColor());
                int i613 = a;
                i5 = (-2) - (((i613 ^ 122) + ((i613 & 122) << 1)) ^ (-1));
                b = i5 % 128;
                if (i5 % 2 != 0) {
                    c0019p.u(colorStateListValueOf);
                    int i614 = 11 / 0;
                } else {
                    c0019p.u(colorStateListValueOf);
                }
                int i615 = a;
                int i616 = i615 ^ 83;
                i6 = (((i615 & 83) | i616) << 1) - i616;
                b = i6 % 128;
                if (i6 % 2 == 0) {
                    int i617 = 2 % 2;
                }
            }
            bfpVar = c0019p.e;
            s = new S(context2);
            int i618 = b;
            i3 = (i618 ^ 85) + ((i618 & 85) << 1);
            a = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj2 = null;
                bfpVar.e = s;
                c0019p.w();
                WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap3 = T.c;
                obj2.hashCode();
                throw null;
            }
            bfpVar.e = s;
            c0019p.w();
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap4 = T.c;
            int i619 = b;
            i4 = ((i619 | 29) << 1) - (i619 ^ 29);
            a = i4 % 128;
            if (i4 % 2 == 0) {
                T.aWX.s(this, c0019p);
                int i75 = 45 / 0;
            } else {
                T.aWX.s(this, c0019p);
            }
            int i76 = a;
            int i77 = (i76 & 27) + (i76 | 27);
            b = i77 % 128;
            int i78 = i77 % 2;
            int i79 = 2 % 2;
        }
        if (bF.t(7)) {
            int i80 = a + 21;
            b = i80 % 128;
            int i81 = i80 % 2;
            setItemPaddingTop(bF.j(7, 0));
            int i82 = b + 17;
            a = i82 % 128;
            if (i82 % 2 != 0) {
                int i83 = 2 % 2;
            }
        }
        if (bF.t(6)) {
            int i84 = a;
            int i85 = (i84 & 67) + (i84 | 67);
            b = i85 % 128;
            setItemPaddingBottom(i85 % 2 != 0 ? bF.j(95, 0) : bF.j(6, 0));
            int i86 = 2 % 2;
        }
        if (bF.t(1)) {
            int i87 = b;
            int i88 = i87 & 117;
            int i89 = -(-((i87 ^ 117) | i88));
            int i90 = (i88 ^ i89) + ((i89 & i88) << 1);
            a = i90 % 128;
            setElevation(i90 % 2 == 0 ? bF.j(0, 1) : bF.j(1, 0));
            int i91 = a;
            int i92 = i91 & 1;
            int i93 = (i91 ^ 1) | i92;
            int i94 = (i92 ^ i93) + ((i93 & i92) << 1);
            b = i94 % 128;
            int i95 = i94 % 2;
            int i96 = 2 % 2;
        }
        ColorStateList colorStateListC = h.c(context2, bF, 0);
        Drawable drawableMutate = getBackground().mutate();
        int i97 = a;
        int i98 = i97 & 85;
        int i99 = (i97 ^ 85) | i98;
        int i100 = ((i98 | i99) << 1) - (i99 ^ i98);
        b = i100 % 128;
        int i101 = i100 % 2;
        drawableMutate.setTintList(colorStateListC);
        int iO = bF.o(12, -1);
        int i102 = a + 31;
        b = i102 % 128;
        int i103 = i102 % 2;
        setLabelVisibilityMode(iO);
        int iR2 = bF.r(3, 0);
        if (iR2 != 0) {
            int i104 = b;
            int i105 = (((i104 | 95) << 1) - (~(-(((~i104) & 95) | (i104 & (-96)))))) - 1;
            a = i105 % 128;
            int i106 = i105 % 2;
            oooO0OO.setItemBackgroundRes(iR2);
            int i107 = b + 90;
            int i108 = (i107 ^ (-1)) + (i107 << 1);
            a = i108 % 128;
            int i109 = i108 % 2;
            int i110 = 2 % 2;
        } else {
            ColorStateList colorStateListC2 = h.c(context2, bF, 8);
            int i111 = b;
            int i112 = i111 & 125;
            int i113 = (i111 ^ 125) | i112;
            int i114 = (i112 & i113) + (i113 | i112);
            a = i114 % 128;
            if (i114 % 2 == 0) {
                setItemRippleColor(colorStateListC2);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            setItemRippleColor(colorStateListC2);
            int i115 = 2 % 2;
        }
        int iR3 = bF.r(2, 0);
        if (iR3 != 0) {
            int i116 = b + 55;
            a = i116 % 128;
            int i117 = i116 % 2;
            setItemActiveIndicatorEnabled(true);
            int[] iArr = r.J;
            int i118 = b;
            int i119 = i118 & 39;
            int i120 = (i118 ^ 39) | i119;
            int i121 = (i119 ^ i120) + ((i120 & i119) << 1);
            a = i121 % 128;
            if (i121 % 2 == 0) {
                typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iR3, iArr);
                dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            } else {
                typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iR3, iArr);
                dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
            }
            setItemActiveIndicatorWidth(dimensionPixelSize);
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0));
            int i122 = a;
            int i123 = (i122 & (-112)) | ((~i122) & 111);
            int i124 = (i122 & 111) << 1;
            int i125 = ((i123 | i124) << 1) - (i124 ^ i123);
            b = i125 % 128;
            int i126 = i125 % 2;
            setItemActiveIndicatorMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
            int i127 = b;
            int i128 = (i127 | 93) << 1;
            int i129 = -(((~i127) & 93) | (i127 & (-94)));
            int i130 = (i128 & i129) + (i129 | i128);
            a = i130 % 128;
            setItemActiveIndicatorColor(i130 % 2 == 0 ? h.b(context2, typedArrayObtainStyledAttributes, 4) : h.b(context2, typedArrayObtainStyledAttributes, 2));
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(4, 0);
            j jVar = new j(0.0f);
            int i131 = a;
            int i132 = (((i131 | 12) << 1) - (12 ^ i131)) - 1;
            b = i132 % 128;
            int i133 = i132 % 2;
            setItemActiveIndicatorShapeAppearance(ivas.gov.bisp.enumeration.O.t.d(context2, resourceId, 0, jVar).e());
            int i134 = b + 84;
            int i135 = (i134 ^ (-1)) + (i134 << 1);
            a = i135 % 128;
            if (i135 % 2 == 0) {
                typedArrayObtainStyledAttributes.recycle();
                throw null;
            }
            typedArrayObtainStyledAttributes.recycle();
            int i136 = 2 % 2;
        }
        if (!(!bF.t(13))) {
            int i137 = a;
            int i138 = i137 & 65;
            int i139 = -(-(i137 | 65));
            int i140 = ((i138 | i139) << 1) - (i139 ^ i138);
            b = i140 % 128;
            int i141 = i140 % 2;
            int iR4 = bF.r(13, 0);
            tVar.d = true;
            int i142 = a;
            int i143 = i142 & 17;
            int i144 = i143 + ((i142 ^ 17) | i143);
            b = i144 % 128;
            if (i144 % 2 != 0) {
                getMenuInflater().inflate(iR4, zVar);
                tVar.d = true;
            } else {
                getMenuInflater().inflate(iR4, zVar);
                tVar.d = false;
            }
            tVar.q(true);
            int i145 = a;
            int i146 = i145 & 123;
            int i147 = (i145 | 123) & (~i146);
            int i148 = i146 << 1;
            int i149 = (i147 & i148) + (i147 | i148);
            b = i149 % 128;
            if (i149 % 2 == 0) {
                int i150 = 2 % 2;
            }
        }
        bF.d.recycle();
        addView(oooO0OO);
        bhp bhpVar = new bhp();
        int i151 = a + 35;
        b = i151 % 128;
        int i152 = i151 % 2;
        zVar.h = bhpVar;
        int i153 = a;
        int i154 = (i153 | 31) << 1;
        int i155 = -(i153 ^ 31);
        int i156 = (i154 & i155) + (i155 | i154);
        b = i156 % 128;
        int i157 = i156 % 2;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 19;
        int i4 = ((((i2 ^ 19) | i3) << 1) - (~(-((i2 | 19) & (~i3))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        ColorStateList itemActiveIndicatorColor = this.d.getItemActiveIndicatorColor();
        if (i5 != 0) {
            int i6 = 6 / 0;
        }
        int i7 = b;
        int i8 = (((i7 | 112) << 1) - (i7 ^ 112)) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
        return itemActiveIndicatorColor;
    }

    public int getItemActiveIndicatorHeight() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 113) | (i2 & 113)) << 1;
        int i4 = -(((~i2) & 113) | (i2 & (-114)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        int itemActiveIndicatorHeight = this.d.getItemActiveIndicatorHeight();
        int i7 = a;
        int i8 = (((i7 ^ 9) | (i7 & 9)) << 1) - (((~i7) & 9) | (i7 & (-10)));
        b = i8 % 128;
        int i9 = i8 % 2;
        return itemActiveIndicatorHeight;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 71;
        int i4 = ((((i2 & 71) | i3) << 1) - (~(-i3))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        int itemActiveIndicatorMarginHorizontal = this.d.getItemActiveIndicatorMarginHorizontal();
        if (i5 == 0) {
            int i6 = 9 / 0;
        }
        return itemActiveIndicatorMarginHorizontal;
    }

    public ivas.gov.bisp.enumeration.O.t getItemActiveIndicatorShapeAppearance() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 99) | (i2 & 99)) << 1;
        int i4 = -(((~i2) & 99) | (i2 & (-100)));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        ivas.gov.bisp.enumeration.O.t itemActiveIndicatorShapeAppearance = this.d.getItemActiveIndicatorShapeAppearance();
        if (i6 == 0) {
            int i7 = 16 / 0;
        }
        return itemActiveIndicatorShapeAppearance;
    }

    public int getItemActiveIndicatorWidth() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 15) + ((i2 & 15) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        int itemActiveIndicatorWidth = this.d.getItemActiveIndicatorWidth();
        int i5 = b;
        int i6 = i5 & 119;
        int i7 = i6 + ((i5 ^ 119) | i6);
        a = i7 % 128;
        int i8 = i7 % 2;
        return itemActiveIndicatorWidth;
    }

    public Drawable getItemBackground() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 27;
        int i4 = ((i2 ^ 27) | i3) << 1;
        int i5 = -((i2 | 27) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        Drawable itemBackground = this.d.getItemBackground();
        int i8 = a;
        int i9 = (i8 & 39) + (i8 | 39);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            return itemBackground;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public int getItemBackgroundResource() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - (((i2 ^ 96) + ((i2 & 96) << 1)) ^ (-1));
        b = i3 % 128;
        int i4 = i3 % 2;
        OooOOO oooOOO = this.d;
        if (i4 == 0) {
            return oooOOO.getItemBackgroundRes();
        }
        oooOOO.getItemBackgroundRes();
        throw null;
    }

    public int getItemIconSize() {
        int i = 2 % 2;
        int i2 = b + 77;
        a = i2 % 128;
        int i3 = i2 % 2;
        int itemIconSize = this.d.getItemIconSize();
        int i4 = a;
        int i5 = ((i4 & (-20)) | ((~i4) & 19)) + ((i4 & 19) << 1);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return itemIconSize;
        }
        throw null;
    }

    public ColorStateList getItemIconTintList() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 17;
        int i4 = (i3 - (~((i2 ^ 17) | i3))) - 1;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            return this.d.getIconTintList();
        }
        this.d.getIconTintList();
        throw null;
    }

    public int getItemPaddingBottom() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((((i2 ^ 71) | (i2 & 71)) << 1) - (~(-(((~i2) & 71) | (i2 & (-72)))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        int itemPaddingBottom = this.d.getItemPaddingBottom();
        int i5 = b;
        int i6 = i5 & 21;
        int i7 = (i5 | 21) & (~i6);
        int i8 = i6 << 1;
        int i9 = (i7 & i8) + (i7 | i8);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            return itemPaddingBottom;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getItemPaddingTop() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-100)) | ((~i2) & 99);
        int i4 = -(-((i2 & 99) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        int itemPaddingTop = this.d.getItemPaddingTop();
        int i7 = b;
        int i8 = i7 & 83;
        int i9 = (i7 | 83) & (~i8);
        int i10 = -(-(i8 << 1));
        int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
        a = i11 % 128;
        if (i11 % 2 != 0) {
            return itemPaddingTop;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ColorStateList getItemRippleColor() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 53;
        int i4 = ((i2 ^ 53) | i3) << 1;
        int i5 = -((~i3) & (i2 | 53));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        ColorStateList colorStateList = this.g;
        int i8 = i2 & 27;
        int i9 = -(-((i2 ^ 27) | i8));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        b = i10 % 128;
        if (i10 % 2 == 0) {
            return colorStateList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getItemTextAppearanceActive() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 81) + (i2 | 81);
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.d.getItemTextAppearanceActive();
            throw null;
        }
        int itemTextAppearanceActive = this.d.getItemTextAppearanceActive();
        int i4 = a;
        int i5 = i4 & 79;
        int i6 = (((i4 | 79) & (~i5)) - (~(i5 << 1))) - 1;
        b = i6 % 128;
        if (i6 % 2 == 0) {
            return itemTextAppearanceActive;
        }
        obj.hashCode();
        throw null;
    }

    public int getItemTextAppearanceInactive() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 3;
        int i4 = (i2 ^ 3) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        int itemTextAppearanceInactive = this.d.getItemTextAppearanceInactive();
        int i7 = a;
        int i8 = i7 & 119;
        int i9 = (i7 | 119) & (~i8);
        int i10 = i8 << 1;
        int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
        b = i11 % 128;
        if (i11 % 2 == 0) {
            return itemTextAppearanceInactive;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ColorStateList getItemTextColor() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-76)) | ((~i2) & 75);
        int i4 = (i2 & 75) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        ColorStateList itemTextColor = this.d.getItemTextColor();
        int i7 = b;
        int i8 = (i7 & 13) + (i7 | 13);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 26 / 0;
        }
        return itemTextColor;
    }

    public int getLabelVisibilityMode() {
        int labelVisibilityMode;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 53;
        int i4 = (i3 - (~(-(-((i2 ^ 53) | i3))))) - 1;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            labelVisibilityMode = this.d.getLabelVisibilityMode();
            int i5 = 33 / 0;
        } else {
            labelVisibilityMode = this.d.getLabelVisibilityMode();
        }
        int i6 = b;
        int i7 = i6 ^ 17;
        int i8 = (((i6 & 17) | i7) << 1) - i7;
        a = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 81 / 0;
        }
        return labelVisibilityMode;
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 77) + ((i2 & 77) << 1);
        a = i3 % 128;
        if (i3 % 2 != 0) {
            return this.c;
        }
        int i4 = 28 / 0;
        return this.c;
    }

    public m getMenuView() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 109;
        int i4 = (i2 | 109) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        OooOOO oooOOO = this.d;
        int i9 = i7 & 41;
        int i10 = (((i7 ^ 41) | i9) << 1) - ((i7 | 41) & (~i9));
        a = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 31 / 0;
        }
        return oooOOO;
    }

    public t getPresenter() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 25) << 1) - (i2 ^ 25);
        b = i3 % 128;
        int i4 = i3 % 2;
        t tVar = this.e;
        int i5 = ((i2 ^ 5) | (i2 & 5)) << 1;
        int i6 = -(((~i2) & 5) | (i2 & (-6)));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            return tVar;
        }
        throw null;
    }

    public int getSelectedItemId() {
        int i = 2 % 2;
        int i2 = a + 9;
        b = i2 % 128;
        int i3 = i2 % 2;
        int selectedItemId = this.d.getSelectedItemId();
        int i4 = b;
        int i5 = i4 ^ 17;
        int i6 = (((i4 & 17) | i5) << 1) - i5;
        a = i6 % 128;
        int i7 = i6 % 2;
        return selectedItemId;
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 109;
        int i4 = (i2 | 109) & (~i3);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            this.d.setItemActiveIndicatorColor(colorStateList);
        } else {
            this.d.setItemActiveIndicatorColor(colorStateList);
            int i7 = 10 / 0;
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 95;
        int i4 = -(-((i2 & 95) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.d.setItemActiveIndicatorEnabled(z);
        int i7 = b;
        int i8 = ((i7 & (-92)) | ((~i7) & 91)) + ((i7 & 91) << 1);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    public void setItemActiveIndicatorHeight(int i) {
        int i2 = 2 % 2;
        int i3 = a + 99;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.d.setItemActiveIndicatorHeight(i);
        int i5 = a;
        int i6 = ((i5 ^ 29) - (~(-(-((i5 & 29) << 1))))) - 1;
        b = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 123) | (i3 & 123)) << 1;
        int i5 = -(((~i3) & 123) | (i3 & (-124)));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            this.d.setItemActiveIndicatorMarginHorizontal(i);
        } else {
            this.d.setItemActiveIndicatorMarginHorizontal(i);
            int i7 = 18 / 0;
        }
    }

    public void setItemActiveIndicatorShapeAppearance(ivas.gov.bisp.enumeration.O.t tVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 5;
        int i4 = (i2 ^ 5) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.d.setItemActiveIndicatorShapeAppearance(tVar);
        if (i6 == 0) {
            throw null;
        }
    }

    public void setItemActiveIndicatorWidth(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 111;
        int i5 = -(-((i3 ^ 111) | i4));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        this.d.setItemActiveIndicatorWidth(i);
        int i8 = b;
        int i9 = (i8 & 111) + (i8 | 111);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    public void setItemIconSize(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 25;
        int i5 = (i3 | 25) & (~i4);
        int i6 = i4 << 1;
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            this.d.setItemIconSize(i);
            int i8 = 90 / 0;
        } else {
            this.d.setItemIconSize(i);
        }
        int i9 = a + 51;
        b = i9 % 128;
        int i10 = i9 % 2;
    }

    public void setItemIconSizeRes(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 ^ 77;
        int i5 = -(-((i3 & 77) << 1));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            setItemIconSize(getResources().getDimensionPixelSize(i));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setItemIconSize(getResources().getDimensionPixelSize(i));
        int i7 = a;
        int i8 = (i7 & 37) + (i7 | 37);
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = a + 115;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.d.setIconTintList(colorStateList);
        int i4 = b;
        int i5 = (i4 & 115) + (i4 | 115);
        a = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setItemPaddingBottom(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 93) + ((i3 & 93) << 1);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            this.d.setItemPaddingBottom(i);
            throw null;
        }
        this.d.setItemPaddingBottom(i);
        int i5 = b;
        int i6 = i5 & 15;
        int i7 = -(-((i5 ^ 15) | i6));
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setItemPaddingTop(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 & (-120)) | ((~i3) & 119)) + ((i3 & 119) << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        this.d.setItemPaddingTop(i);
        if (i5 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setItemTextAppearanceActive(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 ^ 105;
        int i5 = ((i3 & 105) | i4) << 1;
        int i6 = -i4;
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        this.d.setItemTextAppearanceActive(i);
        int i9 = b + 67;
        a = i9 % 128;
        int i10 = i9 % 2;
    }

    public void setItemTextAppearanceInactive(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 113;
        int i5 = (i4 - (~((i3 ^ 113) | i4))) - 1;
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            this.d.setItemTextAppearanceInactive(i);
            throw null;
        }
        this.d.setItemTextAppearanceInactive(i);
        int i6 = a;
        int i7 = i6 & 125;
        int i8 = (i6 | 125) & (~i7);
        int i9 = -(-(i7 << 1));
        int i10 = (i8 & i9) + (i8 | i9);
        b = i10 % 128;
        if (i10 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 81;
        int i4 = (((i2 | 81) & (~i3)) - (~(i3 << 1))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        this.d.setItemTextColor(colorStateList);
        int i6 = b;
        int i7 = (i6 & 80) + (i6 | 80);
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setLabelVisibilityMode(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 113;
        int i5 = (i3 ^ 113) | i4;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            this.d.getLabelVisibilityMode();
            throw null;
        }
        if (this.d.getLabelVisibilityMode() != i) {
            this.d.setLabelVisibilityMode(i);
            t tVar = this.e;
            int i7 = a + 26;
            int i8 = (i7 ^ (-1)) + (i7 << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
            tVar.q(false);
            int i10 = b + 27;
            a = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = b;
        int i13 = ((i12 | 37) << 1) - (i12 ^ 37);
        a = i13 % 128;
        int i14 = i13 % 2;
    }

    public void setOnItemReselectedListener(aNO ano) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 41) << 1) - (i2 ^ 41);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        this.i = ano;
        int i6 = ((i4 & 35) - (~(i4 | 35))) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setOnItemSelectedListener(aNP anp) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 63;
        int i4 = (i3 - (~((i2 ^ 63) | i3))) - 1;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            this.h = anp;
        } else {
            this.h = anp;
            int i5 = 70 / 0;
        }
    }

    public class bhp implements n.aII {
        private static int a = 0;
        private static int b = 1;

        public bhp() {
        }

        @Override // androidx.appcompat.view.menu.n.aII
        public void e(n nVar) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 25;
            int i4 = -(-((i2 & 25) << 1));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x007d  */
        @Override // androidx.appcompat.view.menu.n.aII
        public boolean b(n nVar, MenuItem menuItem) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (((i2 & (-18)) | ((~i2) & 17)) - (~(-(-((i2 & 17) << 1))))) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            boolean z = false;
            if (OooOo00.this.i != null) {
                int i5 = b;
                int i6 = i5 & 9;
                int i7 = ((i5 | 9) & (~i6)) + (i6 << 1);
                a = i7 % 128;
                int i8 = i7 % 2;
                if (menuItem.getItemId() == OooOo00.this.getSelectedItemId()) {
                    int i9 = a;
                    int i10 = i9 & 17;
                    int i11 = i9 | 17;
                    int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
                    b = i12 % 128;
                    if (i12 % 2 == 0) {
                        OooOo00.this.i.b(menuItem);
                        return false;
                    }
                    OooOo00.this.i.b(menuItem);
                    return true;
                }
            }
            aNP anp = OooOo00.this.h;
            if (anp != null) {
                int i13 = b + 89;
                a = i13 % 128;
                if (i13 % 2 != 0) {
                    anp.b(menuItem);
                    throw null;
                }
                if (!anp.b(menuItem)) {
                    z = true;
                } else {
                    int i14 = a;
                    int i15 = ((i14 ^ 111) | (i14 & 111)) << 1;
                    int i16 = -(((~i14) & 111) | (i14 & (-112)));
                    int i17 = (i15 & i16) + (i16 | i15);
                    b = i17 % 128;
                    int i18 = i17 % 2;
                }
            } else {
                int i19 = a;
                int i110 = ((i19 ^ 111) | (i19 & 111)) << 1;
                int i111 = -(((~i19) & 111) | (i19 & (-112)));
                int i112 = (i110 & i111) + (i111 | i110);
                b = i112 % 128;
                int i113 = i112 % 2;
            }
            int i20 = b;
            int i21 = i20 ^ 105;
            int i22 = -(-((i20 & 105) << 1));
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            a = i23 % 128;
            if (i23 % 2 == 0) {
                return z;
            }
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    private MenuInflater getMenuInflater() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 49) + (i2 | 49);
        b = i3 % 128;
        int i4 = i3 % 2;
        MenuInflater menuInflater = this.f;
        if (i4 != 0) {
            int i5 = 15 / 0;
            if (menuInflater == null) {
                this.f = new i(getContext());
                int i6 = b;
                int i7 = i6 & 109;
                int i8 = -(-(i6 | 109));
                int i9 = (i7 & i8) + (i8 | i7);
                a = i9 % 128;
                int i10 = i9 % 2;
            }
        } else if (menuInflater == null) {
            this.f = new i(getContext());
            int i11 = b;
            int i12 = i11 & 109;
            int i13 = -(-(i11 | 109));
            int i14 = (i12 & i13) + (i13 | i12);
            a = i14 % 128;
            int i15 = i14 % 2;
        }
        MenuInflater menuInflater2 = this.f;
        int i16 = a;
        int i17 = (((i16 | 74) << 1) - (i16 ^ 74)) - 1;
        b = i17 % 128;
        int i18 = i17 % 2;
        return menuInflater2;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        int i = 2 % 2;
        int i2 = a + 121;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            super.setElevation(f);
            r.A(this, f);
            int i3 = 3 / 0;
        } else {
            super.setElevation(f);
            r.A(this, f);
        }
        int i4 = b;
        int i5 = ((i4 ^ 87) | (i4 & 87)) << 1;
        int i6 = -(((~i4) & 87) | (i4 & (-88)));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setItemBackground(Drawable drawable) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 33;
        int i4 = i3 + ((i2 ^ 33) | i3);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            this.d.setItemBackground(drawable);
            this.g = null;
        } else {
            this.d.setItemBackground(drawable);
            this.g = null;
            throw null;
        }
    }

    public void setItemBackgroundResource(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (((i3 ^ 75) | (i3 & 75)) << 1) - (((~i3) & 75) | (i3 & (-76)));
        b = i4 % 128;
        if (i4 % 2 != 0) {
            this.d.setItemBackgroundRes(i);
            this.g = null;
            throw null;
        }
        this.d.setItemBackgroundRes(i);
        this.g = null;
        int i5 = b;
        int i6 = i5 & 95;
        int i7 = ((i5 | 95) & (~i6)) + (i6 << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 65;
        int i4 = (i3 - (~((i2 ^ 65) | i3))) - 1;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            super.onAttachedToWindow();
            boolean z = getBackground() instanceof C0019p;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C0019p) {
            r.C(this, (C0019p) background);
            int i5 = a;
            int i6 = ((i5 | 121) << 1) - (i5 ^ 121);
            b = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 4 / 4;
            }
        }
        int i8 = b;
        int i9 = (((i8 ^ 17) | (i8 & 17)) << 1) - (((~i8) & 17) | (i8 & (-18)));
        a = i9 % 128;
        int i10 = i9 % 2;
    }

    public void setSelectedItemId(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 45;
        int i5 = (((i3 | 45) & (~i4)) - (~(-(-(i4 << 1))))) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        MenuItem menuItemFindItem = this.c.findItem(i);
        if (menuItemFindItem != null) {
            int i7 = a;
            int i8 = i7 ^ 67;
            int i9 = ((i7 & 67) | i8) << 1;
            int i10 = -i8;
            int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
            b = i11 % 128;
            int i12 = i11 % 2;
            if (!this.c.s(menuItemFindItem, this.e, 0)) {
                int i13 = a;
                int i14 = (i13 ^ 79) + ((i13 & 79) << 1);
                b = i14 % 128;
                if (i14 % 2 != 0) {
                    menuItemFindItem.setChecked(false);
                } else {
                    menuItemFindItem.setChecked(true);
                }
                int i15 = b + 123;
                a = i15 % 128;
                int i16 = i15 % 2;
            }
        }
        int i17 = a;
        int i18 = i17 & 15;
        int i19 = (i17 ^ 15) | i18;
        int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
        b = i20 % 128;
        int i21 = i20 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    /* JADX WARN: Code duplicated, block: B:17:0x006b  */
    public void setItemRippleColor(ColorStateList colorStateList) {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 103;
        int i5 = -(-((i3 ^ 103) | i4));
        int i6 = (i4 & i5) + (i4 | i5);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        Object obj = null;
        if (this.g == colorStateList) {
            int i9 = (i3 & 62) + (i3 | 62);
            int i10 = (i9 ^ (-1)) + (i9 << 1);
            b = i10 % 128;
            if (i10 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (colorStateList == null) {
                int i11 = (i3 & 67) + (i3 | 67);
                b = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 89 / 0;
                    if (this.d.getItemBackground() != null) {
                        int i13 = b;
                        int i14 = i13 & 43;
                        int i15 = -(-(i13 | 43));
                        i = ((i14 | i15) << 1) - (i15 ^ i14);
                        a = i % 128;
                        if (i % 2 == 0) {
                            this.d.setItemBackground(null);
                            int i16 = 20 / 0;
                        } else {
                            this.d.setItemBackground(null);
                        }
                    }
                } else if (this.d.getItemBackground() != null) {
                    int i17 = b;
                    int i18 = i17 & 43;
                    int i19 = -(-(i17 | 43));
                    i = ((i18 | i19) << 1) - (i19 ^ i18);
                    a = i % 128;
                    if (i % 2 == 0) {
                        this.d.setItemBackground(null);
                        int i110 = 20 / 0;
                    } else {
                        this.d.setItemBackground(null);
                    }
                }
            }
            int i20 = b;
            int i21 = i20 & 89;
            int i22 = (i20 | 89) & (~i21);
            int i23 = i21 << 1;
            int i24 = (i22 & i23) + (i22 | i23);
            a = i24 % 128;
            int i25 = i24 % 2;
            return;
        }
        this.g = colorStateList;
        if (colorStateList == null) {
            int i26 = (i7 & 31) + (i7 | 31);
            a = i26 % 128;
            if (i26 % 2 == 0) {
                this.d.setItemBackground(null);
                obj.hashCode();
                throw null;
            }
            this.d.setItemBackground(null);
            int i27 = b;
            int i28 = i27 & 27;
            int i29 = -(-((i27 ^ 27) | i28));
            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
            a = i30 % 128;
            int i31 = i30 % 2;
            return;
        }
        int[] iArr = ivas.gov.bisp.enumeration.p041bn.j.e;
        int i32 = a + 57;
        b = i32 % 128;
        int i33 = i32 % 2;
        int i34 = a;
        int i35 = ((i34 & 6) + (i34 | 6)) - 1;
        b = i35 % 128;
        int i36 = i35 % 2;
        ColorStateList colorStateList2 = new ColorStateList(new int[][]{iArr, StateSet.NOTHING}, new int[]{ivas.gov.bisp.enumeration.p041bn.j.b(colorStateList, ivas.gov.bisp.enumeration.p041bn.j.d), ivas.gov.bisp.enumeration.p041bn.j.b(colorStateList, ivas.gov.bisp.enumeration.p041bn.j.c)});
        OooOOO oooOOO = this.d;
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList2, null, null);
        int i37 = b;
        int i38 = i37 & 79;
        int i39 = (i38 - (~((i37 ^ 79) | i38))) - 1;
        a = i39 % 128;
        int i40 = i39 % 2;
        oooOOO.setItemBackground(rippleDrawable);
        int i41 = a;
        int i42 = i41 & 77;
        int i43 = (i41 | 77) & (~i42);
        int i44 = i42 << 1;
        int i45 = ((i43 | i44) << 1) - (i43 ^ i44);
        b = i45 % 128;
        if (i45 % 2 != 0) {
            int i46 = 46 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0128  */
    /* JADX WARN: Code duplicated, block: B:50:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x010a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0 A[SYNTHETIC] */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        z zVar;
        Bundle bundle;
        p pVar;
        int iC;
        int i;
        Parcelable parcelable2;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 ^ 69;
        int i6 = (((i4 & 69) | i5) << 1) - i5;
        a = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            boolean z = parcelable instanceof bhq;
            throw null;
        }
        if (!(parcelable instanceof bhq)) {
            int i7 = (i4 & 15) + (i4 | 15);
            a = i7 % 128;
            if (i7 % 2 != 0) {
                super.onRestoreInstanceState(parcelable);
                return;
            } else {
                super.onRestoreInstanceState(parcelable);
                throw null;
            }
        }
        bhq bhqVar = (bhq) parcelable;
        Parcelable parcelable3 = bhqVar.e;
        int i8 = b;
        int i9 = (i8 & 87) + (i8 | 87);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            super.onRestoreInstanceState(parcelable3);
            zVar = this.c;
            bundle = bhqVar.f;
            int i10 = 91 / 0;
        } else {
            super.onRestoreInstanceState(parcelable3);
            zVar = this.c;
            bundle = bhqVar.f;
        }
        Objects.requireNonNull(zVar);
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        int i11 = b;
        int i12 = i11 & 53;
        int i13 = (((i11 | 53) & (~i12)) - (~(-(-(i12 << 1))))) - 1;
        a = i13 % 128;
        if (i13 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (sparseParcelableArray != null && (!zVar.v.isEmpty())) {
            int i14 = b;
            int i15 = i14 & 113;
            int i16 = -(-((i14 ^ 113) | i15));
            int i17 = (i15 & i16) + (i16 | i15);
            a = i17 % 128;
            int i18 = i17 % 2;
            Iterator<WeakReference<p>> it = zVar.v.iterator();
            int i19 = b;
            int i20 = ((i19 ^ 71) | (i19 & 71)) << 1;
            int i21 = -(((~i19) & 71) | (i19 & (-72)));
            int i22 = (i20 & i21) + (i21 | i20);
            a = i22 % 128;
            int i23 = i22 % 2;
            while (!(!it.hasNext())) {
                int i24 = b;
                int i25 = (-2) - (((i24 & 52) + (i24 | 52)) ^ (-1));
                a = i25 % 128;
                int i26 = i25 % 2;
                WeakReference<p> next = it.next();
                int i27 = a + 89;
                b = i27 % 128;
                if (i27 % 2 != 0) {
                    pVar = next.get();
                    int i28 = 81 / 0;
                    if (pVar == null) {
                        zVar.v.remove(next);
                        int i29 = a;
                        i2 = (-2) - ((((i29 | 124) << 1) - (i29 ^ 124)) ^ (-1));
                        b = i2 % 128;
                        if (i2 % 2 != 0) {
                            int i30 = 4 / 2;
                        }
                    } else {
                        iC = pVar.c();
                        if (iC > 0) {
                            int i31 = b;
                            int i32 = ((i31 | 122) << 1) - (i31 ^ 122);
                            i = (i32 ^ (-1)) + (i32 << 1);
                            a = i % 128;
                            if (i % 2 != 0) {
                                obj.hashCode();
                                throw null;
                            }
                            parcelable2 = (Parcelable) sparseParcelableArray.get(iC);
                            if (parcelable2 != null) {
                                int i33 = a;
                                int i34 = i33 & 115;
                                int i35 = ((i33 ^ 115) | i34) << 1;
                                int i36 = -((i33 | 115) & (~i34));
                                int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
                                b = i37 % 128;
                                int i38 = i37 % 2;
                                pVar.n(parcelable2);
                                int i39 = b;
                                int i40 = ((i39 ^ 3) - (~(-(-((i39 & 3) << 1))))) - 1;
                                a = i40 % 128;
                                int i41 = i40 % 2;
                            }
                        } else {
                            continue;
                        }
                    }
                } else {
                    pVar = next.get();
                    if (pVar == null) {
                        zVar.v.remove(next);
                        int i210 = a;
                        i2 = (-2) - ((((i210 | 124) << 1) - (i210 ^ 124)) ^ (-1));
                        b = i2 % 128;
                        if (i2 % 2 != 0) {
                            int i310 = 4 / 2;
                        }
                    } else {
                        iC = pVar.c();
                        if (iC > 0) {
                            int i311 = b;
                            int i312 = ((i311 | 122) << 1) - (i311 ^ 122);
                            i = (i312 ^ (-1)) + (i312 << 1);
                            a = i % 128;
                            if (i % 2 != 0) {
                                obj.hashCode();
                                throw null;
                            }
                            parcelable2 = (Parcelable) sparseParcelableArray.get(iC);
                            if (parcelable2 != null) {
                                int i313 = a;
                                int i314 = i313 & 115;
                                int i315 = ((i313 ^ 115) | i314) << 1;
                                int i316 = -((i313 | 115) & (~i314));
                                int i317 = ((i315 | i316) << 1) - (i316 ^ i315);
                                b = i317 % 128;
                                int i318 = i317 % 2;
                                pVar.n(parcelable2);
                                int i319 = b;
                                int i42 = ((i319 ^ 3) - (~(-(-((i319 & 3) << 1))))) - 1;
                                a = i42 % 128;
                                int i43 = i42 % 2;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        int i44 = b;
        int i45 = ((i44 ^ 49) | (i44 & 49)) << 1;
        int i46 = -(((~i44) & 49) | (i44 & (-50)));
        int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
        a = i47 % 128;
        int i48 = i47 % 2;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        int i = 2 % 2;
        bhq bhqVar = new bhq(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        int i2 = a;
        int i3 = i2 ^ 59;
        int i4 = -(-((i2 & 59) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            bhqVar.f = bundle;
            CopyOnWriteArrayList<WeakReference<p>> copyOnWriteArrayList = this.c.v;
            obj.hashCode();
            throw null;
        }
        bhqVar.f = bundle;
        z zVar = this.c;
        if (!zVar.v.isEmpty()) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            CopyOnWriteArrayList<WeakReference<p>> copyOnWriteArrayList2 = zVar.v;
            int i6 = a;
            int i7 = i6 & 65;
            int i8 = i6 | 65;
            int i9 = (i7 & i8) + (i8 | i7);
            b = i9 % 128;
            int i10 = i9 % 2;
            int i11 = b;
            int i12 = ((i11 & 56) + (i11 | 56)) - 1;
            a = i12 % 128;
            int i13 = i12 % 2;
            for (WeakReference<p> weakReference : copyOnWriteArrayList2) {
                int i14 = a;
                int i15 = (i14 & (-114)) | ((~i14) & 113);
                int i16 = (i14 & 113) << 1;
                int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                b = i17 % 128;
                int i18 = i17 % 2;
                p pVar = weakReference.get();
                int i19 = b;
                int i20 = ((i19 ^ 71) - (~(-(-((i19 & 71) << 1))))) - 1;
                int i21 = i20 % 128;
                a = i21;
                int i22 = i20 % 2;
                p pVar2 = pVar;
                if (pVar2 == null) {
                    int i23 = (i21 & 113) + (i21 | 113);
                    b = i23 % 128;
                    if (i23 % 2 != 0) {
                        zVar.v.remove(weakReference);
                        obj.hashCode();
                        throw null;
                    }
                    zVar.v.remove(weakReference);
                } else {
                    int iC = pVar2.c();
                    if (iC > 0) {
                        int i24 = a;
                        int i25 = ((i24 | 11) << 1) - (i24 ^ 11);
                        b = i25 % 128;
                        if (i25 % 2 != 0) {
                            pVar2.a();
                            throw null;
                        }
                        Parcelable parcelableA = pVar2.a();
                        if (parcelableA != null) {
                            sparseArray.put(iC, parcelableA);
                            int i26 = b;
                            int i27 = (((i26 | 58) << 1) - (i26 ^ 58)) - 1;
                            a = i27 % 128;
                            int i28 = i27 % 2;
                        }
                    } else {
                        continue;
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
            int i29 = b;
            int i30 = ((i29 | 11) << 1) - (i29 ^ 11);
            a = i30 % 128;
            int i31 = i30 % 2;
        }
        int i32 = a;
        int i33 = (i32 & (-106)) | ((~i32) & 105);
        int i34 = -(-((i32 & 105) << 1));
        int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
        b = i35 % 128;
        if (i35 % 2 == 0) {
            return bhqVar;
        }
        obj.hashCode();
        throw null;
    }
}
