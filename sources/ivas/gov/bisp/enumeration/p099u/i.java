package ivas.gov.bisp.enumeration.p099u;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.u;
import ivas.gov.bisp.enumeration.p081d.c;
import ivas.gov.bisp.enumeration.p092o.h;
import ivas.gov.bisp.enumeration.p092o.r;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class i extends MenuInflater {
    private static int a = 0;
    private static int b = 1;
    public static final Class<?>[] c;
    public static final Class<?>[] d;
    public final Object[] e;
    public final Object[] f;
    public Context g;
    public Object h;

    public static class aRj implements MenuItem.OnMenuItemClickListener {
        private static int a = 0;
        private static int b = 1;
        public static final Class<?>[] c;
        public Object d;
        public Method e;

        static {
            int i = (1 & (-112)) | ((~1) & 111);
            int i2 = (1 & 111) << 1;
            int i3 = ((i | i2) << 1) - (i ^ i2);
            a = i3 % 128;
            int i4 = i3 % 2;
            c = new Class[]{MenuItem.class};
            int i5 = 1 & 97;
            int i6 = (~i5) & (1 | 97);
            int i7 = i5 << 1;
            int i8 = (i6 & i7) + (i7 | i6);
            a = i8 % 128;
            int i9 = i8 % 2;
        }

        public aRj(Object obj, String str) {
            this.d = obj;
            Class<?> cls = obj.getClass();
            try {
                this.e = cls.getMethod(str, c);
            } catch (NullPointerException e) {
                throw e;
            } catch (Exception e2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Couldn't resolve menu item onClick handler ");
                sb.append(str);
                sb.append(" in class ");
                sb.append(cls.getName());
                InflateException inflateException = new InflateException(sb.toString());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            Object[] objArr;
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 | 19) << 1) - (i2 ^ 19);
            b = i3 % 128;
            try {
                if (i3 % 2 == 0) {
                    this.e.getReturnType();
                    Class cls = Boolean.TYPE;
                    throw null;
                }
                if (this.e.getReturnType() == Boolean.TYPE) {
                    Method method = this.e;
                    Object obj = this.d;
                    Object[] objArr2 = new Object[1];
                    int i4 = a;
                    int i5 = (i4 & (-86)) | ((~i4) & 85);
                    int i6 = (i4 & 85) << 1;
                    int i7 = (i5 & i6) + (i6 | i5);
                    b = i7 % 128;
                    int i8 = i7 % 2;
                    objArr2[0] = menuItem;
                    boolean zBooleanValue = ((Boolean) method.invoke(obj, objArr2)).booleanValue();
                    int i9 = a;
                    int i10 = i9 & 87;
                    int i11 = -(-((i9 ^ 87) | i10));
                    int i12 = (i10 & i11) + (i11 | i10);
                    b = i12 % 128;
                    int i13 = i12 % 2;
                    return zBooleanValue;
                }
                Method method2 = this.e;
                Object obj2 = this.d;
                int i14 = a;
                int i15 = (((i14 | 25) << 1) - (~(-(((~i14) & 25) | (i14 & (-26)))))) - 1;
                b = i15 % 128;
                if (i15 % 2 == 0) {
                    objArr = new Object[1];
                    objArr[1] = menuItem;
                } else {
                    objArr = new Object[]{menuItem};
                }
                method2.invoke(obj2, objArr);
                int i16 = a;
                int i17 = i16 & 45;
                int i18 = ((i16 ^ 45) | i17) << 1;
                int i19 = -((i16 | 45) & (~i17));
                int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                b = i20 % 128;
                int i21 = i20 % 2;
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public class aRk {
        private static int a = 0;
        private static int b = 1;
        public c A;
        public String B;
        public CharSequence C;
        public CharSequence E;
        public int c;
        public Menu d;
        public boolean k;
        public int l;
        public CharSequence m;
        public CharSequence n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public char f110o;
        public int p;
        public int q;
        public char r;
        public int s;
        public int t;
        public boolean u;
        public String v;
        public boolean w;
        public boolean x;
        public int y;
        public int z;
        public ColorStateList D = null;
        public PorterDuff.Mode F = null;
        public int e = 0;
        public int f = 0;
        public int g = 0;
        public int i = 0;
        public boolean h = true;
        public boolean j = true;

        public aRk(Menu menu) {
            this.d = menu;
        }

        public final <T> T d(String str, Class<?>[] clsArr, Object[] objArr) {
            T t;
            int i = 2 % 2;
            int i2 = a + 33;
            b = i2 % 128;
            try {
                Constructor<?> constructor = Class.forName(str, false, (i2 % 2 == 0 ? i.this.g : i.this.g).getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                int i3 = b;
                int i4 = (i3 & (-38)) | ((~i3) & 37);
                int i5 = (i3 & 37) << 1;
                int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
                a = i6 % 128;
                if (i6 % 2 != 0) {
                    t = (T) constructor.newInstance(objArr);
                    int i7 = 22 / 0;
                } else {
                    t = (T) constructor.newInstance(objArr);
                }
                int i8 = a;
                int i9 = i8 & 85;
                int i10 = ((i8 ^ 85) | i9) << 1;
                int i11 = -((i8 | 85) & (~i9));
                int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
                b = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 73 / 0;
                }
                return t;
            } catch (Exception unused) {
                return null;
            }
        }

        public SubMenu c() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 103) | (i2 & 103)) << 1;
            int i4 = -(((~i2) & 103) | (i2 & (-104)));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            int i6 = i5 % 128;
            b = i6;
            int i7 = i5 % 2;
            this.k = true;
            Menu menu = this.d;
            int i8 = this.e;
            int i9 = this.c;
            int i10 = this.l;
            CharSequence charSequence = this.m;
            int i11 = ((i6 ^ 101) | (i6 & 101)) << 1;
            int i12 = -(((~i6) & 101) | (i6 & (-102)));
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            a = i13 % 128;
            int i14 = i13 % 2;
            SubMenu subMenuAddSubMenu = menu.addSubMenu(i8, i9, i10, charSequence);
            MenuItem item = subMenuAddSubMenu.getItem();
            int i15 = b;
            int i16 = i15 & 13;
            int i17 = (i16 - (~((i15 ^ 13) | i16))) - 1;
            a = i17 % 128;
            if (i17 % 2 != 0) {
                e(item);
                throw null;
            }
            e(item);
            int i18 = b;
            int i19 = i18 ^ 63;
            int i20 = ((((i18 & 63) | i19) << 1) - (~(-i19))) - 1;
            a = i20 % 128;
            int i21 = i20 % 2;
            return subMenuAddSubMenu;
        }

        public final void e(MenuItem menuItem) {
            MenuItem enabled;
            int i;
            boolean z;
            MenuItem titleCondensed;
            boolean z2;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = (i3 & (-122)) | ((~i3) & 121);
            int i5 = (i3 & 121) << 1;
            int i6 = (i4 & i5) + (i5 | i4);
            a = i6 % 128;
            int i7 = i6 % 2;
            MenuItem checked = menuItem.setChecked(this.u);
            int i8 = a;
            int i9 = i8 & 103;
            int i10 = i9 + ((i8 ^ 103) | i9);
            b = i10 % 128;
            int i11 = i10 % 2;
            MenuItem visible = checked.setVisible(this.x);
            boolean z3 = this.w;
            int i12 = b;
            int i13 = i12 & 117;
            int i14 = (i12 ^ 117) | i13;
            int i15 = (i13 & i14) + (i14 | i13);
            a = i15 % 128;
            if (i15 % 2 != 0) {
                enabled = visible.setEnabled(z3);
                i = this.s;
                int i16 = 65 / 0;
            } else {
                enabled = visible.setEnabled(z3);
                i = this.s;
            }
            if (i > 0) {
                int i17 = b;
                int i18 = i17 & 99;
                int i19 = -(-((i17 ^ 99) | i18));
                int i20 = (i18 & i19) + (i19 | i18);
                int i21 = i20 % 128;
                a = i21;
                z = i20 % 2 == 0;
                int i22 = i21 ^ 107;
                int i23 = (((i21 & 107) | i22) << 1) - i22;
                b = i23 % 128;
                int i24 = i23 % 2;
            } else {
                z = false;
            }
            MenuItem checkable = enabled.setCheckable(z);
            int i25 = b + 97;
            a = i25 % 128;
            if (i25 % 2 != 0) {
                titleCondensed = checkable.setTitleCondensed(this.n);
                int i26 = 15 / 0;
            } else {
                titleCondensed = checkable.setTitleCondensed(this.n);
            }
            titleCondensed.setIcon(this.p);
            int i27 = this.y;
            if (i27 >= 0) {
                int i28 = (-2) - ((b + 114) ^ (-1));
                a = i28 % 128;
                if (i28 % 2 != 0) {
                    menuItem.setShowAsAction(i27);
                    int i29 = 9 / 0;
                } else {
                    menuItem.setShowAsAction(i27);
                }
            }
            if (this.B != null) {
                int i30 = a + 52;
                int i31 = (i30 ^ (-1)) + (i30 << 1);
                b = i31 % 128;
                int i32 = i31 % 2;
                if (i.this.g.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                i iVar = i.this;
                if (iVar.h == null) {
                    int i33 = b;
                    int i34 = i33 & 109;
                    int i35 = ((i33 | 109) & (~i34)) + (i34 << 1);
                    a = i35 % 128;
                    int i36 = i35 % 2;
                    iVar.h = iVar.c(iVar.g);
                    int i37 = a;
                    int i38 = ((i37 ^ 26) + ((i37 & 26) << 1)) - 1;
                    b = i38 % 128;
                    int i39 = i38 % 2;
                }
                aRj arj = new aRj(iVar.h, this.B);
                int i40 = b;
                int i41 = i40 & 75;
                int i42 = (((i40 | 75) & (~i41)) - (~(-(-(i41 << 1))))) - 1;
                a = i42 % 128;
                int i43 = i42 % 2;
                menuItem.setOnMenuItemClickListener(arj);
                int i44 = a;
                int i45 = ((i44 ^ 67) | (i44 & 67)) << 1;
                int i46 = -(((~i44) & 67) | (i44 & (-68)));
                int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
                b = i47 % 128;
                if (i47 % 2 == 0) {
                    int i48 = 2 / 3;
                }
            }
            if (this.s >= 2) {
                int i49 = b;
                int i50 = i49 ^ 87;
                int i51 = (i49 & 87) << 1;
                int i52 = (i50 & i51) + (i51 | i50);
                int i53 = i52 % 128;
                a = i53;
                int i54 = i52 % 2;
                if (menuItem instanceof u) {
                    int i55 = i53 & 13;
                    int i56 = ((i53 ^ 13) | i55) << 1;
                    int i57 = -((i53 | 13) & (~i55));
                    int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
                    b = i58 % 128;
                    int i59 = i58 % 2;
                    ((u) menuItem).m(true);
                } else if (menuItem instanceof ivas.gov.bisp.enumeration.p097r.u) {
                    int i60 = i53 & 123;
                    int i61 = ((((i53 ^ 123) | i60) << 1) - (~(-((i53 | 123) & (~i60))))) - 1;
                    b = i61 % 128;
                    int i62 = i61 % 2;
                    ivas.gov.bisp.enumeration.p097r.u uVar = (ivas.gov.bisp.enumeration.p097r.u) menuItem;
                    try {
                        if (uVar.g == null) {
                            int i63 = a;
                            int i64 = i63 & 101;
                            int i65 = i63 | 101;
                            int i66 = ((i64 | i65) << 1) - (i65 ^ i64);
                            b = i66 % 128;
                            int i67 = i66 % 2;
                            Class<?> cls = uVar.f.getClass();
                            Class<?>[] clsArr = new Class[1];
                            int i68 = b;
                            int i69 = (i68 ^ 25) + ((i68 & 25) << 1);
                            a = i69 % 128;
                            int i70 = i69 % 2;
                            clsArr[0] = Boolean.TYPE;
                            uVar.g = cls.getDeclaredMethod("setExclusiveCheckable", clsArr);
                            int i71 = b;
                            int i72 = (i71 & 35) + (i71 | 35);
                            a = i72 % 128;
                            int i73 = i72 % 2;
                        }
                        Method method = uVar.g;
                        r rVar = uVar.f;
                        Object[] objArr = new Object[1];
                        int i74 = b + 53;
                        a = i74 % 128;
                        int i75 = i74 % 2;
                        objArr[0] = Boolean.TRUE;
                        method.invoke(rVar, objArr);
                        int i76 = a;
                        int i77 = (i76 & 24) + (i76 | 24);
                        int i78 = (i77 ^ (-1)) + (i77 << 1);
                        b = i78 % 128;
                        int i79 = i78 % 2;
                    } catch (Exception unused) {
                    }
                }
            }
            String str = this.v;
            Object obj = null;
            if (str != null) {
                int i80 = b;
                int i81 = i80 & 69;
                int i82 = (i80 ^ 69) | i81;
                int i83 = ((i81 | i82) << 1) - (i82 ^ i81);
                a = i83 % 128;
                if (i83 % 2 != 0) {
                    Class<?>[] clsArr2 = i.d;
                    Object[] objArr2 = i.this.e;
                    obj.hashCode();
                    throw null;
                }
                Class<?>[] clsArr3 = i.d;
                Object[] objArr3 = i.this.e;
                int i84 = b;
                int i85 = ((i84 ^ 39) | (i84 & 39)) << 1;
                int i86 = -(((~i84) & 39) | (i84 & (-40)));
                int i87 = ((i85 | i86) << 1) - (i86 ^ i85);
                a = i87 % 128;
                int i88 = i87 % 2;
                menuItem.setActionView((View) d(str, clsArr3, objArr3));
                int i89 = b;
                int i90 = i89 ^ 91;
                int i91 = (((i89 & 91) | i90) << 1) - i90;
                a = i91 % 128;
                int i92 = i91 % 2;
                int i93 = i89 & 79;
                int i94 = (i89 | 79) & (~i93);
                int i95 = i93 << 1;
                int i96 = (i94 & i95) + (i94 | i95);
                a = i96 % 128;
                int i97 = i96 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            int i98 = this.z;
            if (i98 > 0 && !z2) {
                int i99 = b + 19;
                a = i99 % 128;
                int i100 = i99 % 2;
                menuItem.setActionView(i98);
                int i101 = a + 19;
                b = i101 % 128;
                int i102 = i101 % 2;
            }
            c cVar = this.A;
            if (cVar != null) {
                int i103 = a;
                int i104 = i103 ^ 107;
                int i105 = (i103 & 107) << 1;
                int i106 = (i104 & i105) + (i105 | i104);
                int i107 = i106 % 128;
                b = i107;
                if (i106 % 2 == 0) {
                    boolean z4 = menuItem instanceof r;
                    obj.hashCode();
                    throw null;
                }
                if (!(!(menuItem instanceof r))) {
                    int i108 = (i107 & 107) + (i107 | 107);
                    a = i108 % 128;
                    int i109 = i108 % 2;
                    ((r) menuItem).b(cVar);
                    int i110 = b;
                    int i111 = ((i110 & (-38)) | ((~i110) & 37)) + ((i110 & 37) << 1);
                    a = i111 % 128;
                    if (i111 % 2 != 0) {
                        int i112 = 3 / 3;
                    }
                }
            }
            CharSequence charSequence = this.C;
            boolean z5 = menuItem instanceof r;
            if (z5) {
                int i113 = b + 109;
                a = i113 % 128;
                int i114 = i113 % 2;
                ((r) menuItem).setContentDescription(charSequence);
                int i115 = b + 11;
                a = i115 % 128;
                int i116 = i115 % 2;
            } else if (Build.VERSION.SDK_INT >= 26) {
                int i117 = b;
                int i118 = i117 ^ 33;
                int i119 = ((((i117 & 33) | i118) << 1) - (~(-i118))) - 1;
                a = i119 % 128;
                if (i119 % 2 != 0) {
                    menuItem.setContentDescription(charSequence);
                    int i120 = 97 / 0;
                } else {
                    menuItem.setContentDescription(charSequence);
                }
            }
            CharSequence charSequence2 = this.E;
            if (z5) {
                int i121 = a;
                int i122 = i121 & 25;
                int i123 = -(-((i121 ^ 25) | i122));
                int i124 = (i122 & i123) + (i123 | i122);
                b = i124 % 128;
                int i125 = i124 % 2;
                ((r) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setTooltipText(charSequence2);
                int i126 = b;
                int i127 = i126 & 117;
                int i128 = ((i126 | 117) & (~i127)) + (i127 << 1);
                a = i128 % 128;
                int i129 = i128 % 2;
            }
            char c = this.f110o;
            int i130 = this.q;
            if (!(!z5)) {
                int i131 = b;
                int i132 = i131 & 123;
                int i133 = i132 + ((i131 ^ 123) | i132);
                a = i133 % 128;
                if (i133 % 2 != 0) {
                    ((r) menuItem).setAlphabeticShortcut(c, i130);
                    int i134 = 56 / 0;
                } else {
                    ((r) menuItem).setAlphabeticShortcut(c, i130);
                }
            } else if (Build.VERSION.SDK_INT >= 26) {
                int i135 = b;
                int i136 = i135 & 95;
                int i137 = (i135 ^ 95) | i136;
                int i138 = (i136 & i137) + (i137 | i136);
                a = i138 % 128;
                if (i138 % 2 != 0) {
                    menuItem.setAlphabeticShortcut(c, i130);
                    int i139 = 43 / 0;
                } else {
                    menuItem.setAlphabeticShortcut(c, i130);
                }
                int i140 = a;
                int i141 = i140 & 5;
                int i142 = (i140 | 5) & (~i141);
                int i143 = i141 << 1;
                int i144 = (i142 & i143) + (i142 | i143);
                b = i144 % 128;
                int i145 = i144 % 2;
            }
            char c2 = this.r;
            int i146 = this.t;
            if (z5) {
                ((r) menuItem).setNumericShortcut(c2, i146);
                int i147 = a;
                int i148 = (i147 ^ 117) + ((i147 & 117) << 1);
                b = i148 % 128;
                if (i148 % 2 == 0) {
                    int i149 = 5 % 4;
                }
            } else if (Build.VERSION.SDK_INT >= 26) {
                int i150 = a;
                int i151 = (((i150 ^ 107) | (i150 & 107)) << 1) - (((~i150) & 107) | (i150 & (-108)));
                b = i151 % 128;
                if (i151 % 2 == 0) {
                    menuItem.setNumericShortcut(c2, i146);
                    obj.hashCode();
                    throw null;
                }
                menuItem.setNumericShortcut(c2, i146);
            }
            PorterDuff.Mode mode = this.F;
            if (mode != null) {
                int i152 = a;
                int i153 = (i152 ^ 5) + ((i152 & 5) << 1);
                b = i153 % 128;
                if (i153 % 2 == 0) {
                    throw null;
                }
                if (z5) {
                    int i154 = (i152 & (-120)) | ((~i152) & 119);
                    int i155 = (i152 & 119) << 1;
                    int i156 = (i154 & i155) + (i154 | i155);
                    b = i156 % 128;
                    int i157 = i156 % 2;
                    ((r) menuItem).setIconTintMode(mode);
                    int i158 = b + 124;
                    int i159 = (i158 ^ (-1)) + (i158 << 1);
                    int i160 = i159 % 128;
                    a = i160;
                    int i161 = i159 % 2;
                    int i162 = i160 & 29;
                    int i163 = (i160 ^ 29) | i162;
                    int i164 = ((i162 | i163) << 1) - (i163 ^ i162);
                    b = i164 % 128;
                    int i165 = i164 % 2;
                } else if (Build.VERSION.SDK_INT >= 26) {
                    int i166 = a + 49;
                    b = i166 % 128;
                    int i167 = i166 % 2;
                    menuItem.setIconTintMode(mode);
                }
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                int i168 = b;
                int i169 = i168 & 115;
                int i170 = -(-(i168 | 115));
                int i171 = ((i169 | i170) << 1) - (i169 ^ i170);
                a = i171 % 128;
                int i172 = i171 % 2;
                if (z5) {
                    int i173 = (i168 & 35) + (i168 | 35);
                    a = i173 % 128;
                    int i174 = i173 % 2;
                    ((r) menuItem).setIconTintList(colorStateList);
                    int i175 = b + 37;
                    a = i175 % 128;
                    if (i175 % 2 != 0) {
                        int i176 = 35 / 0;
                        return;
                    }
                    return;
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    int i177 = a + 5;
                    b = i177 % 128;
                    int i178 = i177 % 2;
                    menuItem.setIconTintList(colorStateList);
                    int i179 = a;
                    int i180 = ((i179 | 45) << 1) - (i179 ^ 45);
                    b = i180 % 128;
                    int i181 = i180 % 2;
                }
            }
            int i182 = b + 79;
            a = i182 % 128;
            int i183 = i182 % 2;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        d = clsArr;
        int i = 1 & 95;
        int i2 = (((1 ^ 95) | i) << 1) - ((1 | 95) & (~i));
        a = i2 % 128;
        if (i2 % 2 == 0) {
            c = clsArr;
        } else {
            c = clsArr;
            throw null;
        }
    }

    public i(Context context) {
        super(context);
        this.g = context;
        Object[] objArr = {context};
        this.e = objArr;
        this.f = objArr;
    }

    public final Object c(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 | 81) << 1;
        int i4 = -((i2 & (-82)) | ((~i2) & 81));
        int i5 = (i3 & i4) + (i3 | i4);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            boolean z = obj instanceof Activity;
            throw null;
        }
        if (obj instanceof Activity) {
            int i6 = i2 & 19;
            int i7 = -(-(i2 | 19));
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            int i9 = i8 % 128;
            a = i9;
            int i10 = i8 % 2;
            int i11 = i9 & 117;
            int i12 = ((i9 ^ 117) | i11) << 1;
            int i13 = -((i9 | 117) & (~i11));
            int i14 = (i12 & i13) + (i13 | i12);
            b = i14 % 128;
            int i15 = i14 % 2;
            return obj;
        }
        if (obj instanceof ContextWrapper) {
            int i16 = i2 & 91;
            int i17 = -(-((i2 ^ 91) | i16));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            a = i18 % 128;
            int i19 = i18 % 2;
            obj = c(((ContextWrapper) obj).getBaseContext());
            int i20 = b;
            int i21 = i20 & 83;
            int i22 = ((i20 ^ 83) | i21) << 1;
            int i23 = -((i20 | 83) & (~i21));
            int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
            a = i24 % 128;
            int i25 = i24 % 2;
        }
        int i26 = b;
        int i27 = ((i26 & (-82)) | ((~i26) & 81)) + ((i26 & 81) << 1);
        a = i27 % 128;
        if (i27 % 2 != 0) {
            int i28 = 16 / 0;
        }
        return obj;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) throws Throwable {
        int i2 = 2 % 2;
        int i3 = b + 73;
        int i4 = i3 % 128;
        a = i4;
        XmlResourceParser xmlResourceParser = null;
        if (i3 % 2 != 0) {
            boolean z = menu instanceof h;
            xmlResourceParser.hashCode();
            throw null;
        }
        try {
            if (!(menu instanceof h)) {
                int i5 = i4 ^ 49;
                int i6 = ((i4 & 49) | i5) << 1;
                int i7 = -i5;
                int i8 = (i6 & i7) + (i7 | i6);
                b = i8 % 128;
                int i9 = i8 % 2;
                super.inflate(i, menu);
                int i10 = a;
                int i11 = i10 & 23;
                int i12 = -(-((i10 ^ 23) | i11));
                int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                b = i13 % 128;
                int i14 = i13 % 2;
                return;
            }
            try {
                Resources resources = this.g.getResources();
                int i15 = a;
                int i16 = ((i15 ^ 31) | (i15 & 31)) << 1;
                int i17 = -(((~i15) & 31) | (i15 & (-32)));
                int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                b = i18 % 128;
                int i19 = i18 % 2;
                XmlResourceParser layout = resources.getLayout(i);
                try {
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                    int i20 = a + 5;
                    int i21 = i20 % 128;
                    b = i21;
                    int i22 = i20 % 2;
                    int i23 = (i21 & 37) + (i21 | 37);
                    a = i23 % 128;
                    if (i23 % 2 != 0) {
                        d(layout, attributeSetAsAttributeSet, menu);
                        layout.close();
                        int i24 = 59 / 0;
                    } else {
                        d(layout, attributeSetAsAttributeSet, menu);
                        layout.close();
                    }
                    int i25 = a;
                    int i26 = i25 & 37;
                    int i27 = (i25 | 37) & (~i26);
                    int i28 = -(-(i26 << 1));
                    int i29 = (i27 & i28) + (i27 | i28);
                    b = i29 % 128;
                    if (i29 % 2 == 0) {
                        throw null;
                    }
                } catch (IOException e) {
                    e = e;
                    throw new InflateException("Error inflating menu XML", e);
                } catch (XmlPullParserException e2) {
                    e = e2;
                    throw new InflateException("Error inflating menu XML", e);
                } catch (Throwable th) {
                    th = th;
                    xmlResourceParser = layout;
                    if (xmlResourceParser != null) {
                        int i30 = b;
                        int i31 = ((i30 ^ 32) + ((i30 & 32) << 1)) - 1;
                        a = i31 % 128;
                        int i32 = i31 % 2;
                        xmlResourceParser.close();
                        int i33 = a;
                        int i34 = i33 ^ 47;
                        int i35 = (((i33 & 47) | i34) << 1) - i34;
                        b = i35 % 128;
                        int i36 = i35 % 2;
                    }
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (XmlPullParserException e4) {
                e = e4;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x041c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0426  */
    /* JADX WARN: Code duplicated, block: B:125:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:128:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:35:0x0106  */
    /* JADX WARN: Code duplicated, block: B:36:0x010b  */
    /* JADX WARN: Code duplicated, block: B:39:0x011f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0122  */
    /* JADX WARN: Code duplicated, block: B:42:0x0142  */
    /* JADX WARN: Code duplicated, block: B:44:0x0148  */
    /* JADX WARN: Code duplicated, block: B:47:0x014f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0162  */
    /* JADX WARN: Code duplicated, block: B:58:0x0188  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x01db  */
    /* JADX WARN: Code duplicated, block: B:67:0x01e1  */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        if (r4.equals("menu") != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0055, code lost:
    
        r4 = r20.next();
        r9 = ivas.gov.bisp.enumeration.p099u.i.a;
        r10 = (((r9 | 57) << 1) - (~(-(r9 ^ 57)))) - 1;
        ivas.gov.bisp.enumeration.p099u.i.b = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0075, code lost:
    
        throw new java.lang.RuntimeException(ivas.gov.bisp.enumeration.p091n.j.r("Expecting menu, got ", r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0048, code lost:
    
        if (r4.equals("menu") != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(org.xmlpull.v1.XmlPullParser r20, android.util.AttributeSet r21, android.view.Menu r22) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p099u.i.d(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }
}
