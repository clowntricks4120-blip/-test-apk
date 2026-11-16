package ivas.gov.bisp.enumeration.F;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h;
import androidx.fragment.app.i;
import androidx.fragment.app.r;
import androidx.fragment.app.t;
import ivas.gov.bisp.enumeration.OooOOoo.OooOOOO;
import ivas.gov.bisp.enumeration.OoooOOo.o000000O;
import ivas.gov.bisp.enumeration.OoooOOo.o000OOo;
import ivas.gov.bisp.enumeration.p091n.j;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.F.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class LayoutInflaterFactory2C0016s implements LayoutInflater.Factory2 {
    private static int a = 0;
    private static int b = 1;
    public final h c;

    public LayoutInflaterFactory2C0016s(h hVar) {
        this.c = hVar;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 65) | (i2 & 65)) << 1;
        int i4 = -(((~i2) & 65) | (i2 & (-66)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        View viewOnCreateView = onCreateView(null, str, context, attributeSet);
        int i7 = a + 85;
        b = i7 % 128;
        int i8 = i7 % 2;
        return viewOnCreateView;
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.F.s$aYv */
    public class aYv implements View.OnAttachStateChangeListener {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ t c;

        public aYv(t tVar) {
            this.c = tVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 83;
            int i4 = -(-((i2 ^ 83) | i3));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 90 / 0;
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 64) << 1) - (i2 ^ 64);
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            a = i4 % 128;
            int i5 = i4 % 2;
            t tVar = this.c;
            Fragment fragment = tVar.c;
            tVar.n();
            int i6 = a;
            int i7 = i6 & 111;
            int i8 = -(-(i6 | 111));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
            ViewGroup viewGroup = (ViewGroup) fragment.mView.getParent();
            LayoutInflaterFactory2C0016s layoutInflaterFactory2C0016s = LayoutInflaterFactory2C0016s.this;
            int i11 = b;
            int i12 = i11 ^ 73;
            int i13 = ((i11 & 73) | i12) << 1;
            int i14 = -i12;
            int i15 = (i13 & i14) + (i13 | i14);
            a = i15 % 128;
            if (i15 % 2 != 0) {
                i.b(viewGroup, layoutInflaterFactory2C0016s.c).i();
                throw null;
            }
            i.b(viewGroup, layoutInflaterFactory2C0016s.c).i();
            int i16 = b;
            int i17 = (i16 ^ 63) + ((i16 & 63) << 1);
            a = i17 % 128;
            int i18 = i17 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x014d  */
    /* JADX WARN: Code duplicated, block: B:42:0x015a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0175  */
    /* JADX WARN: Code duplicated, block: B:46:0x017f  */
    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes;
        int id;
        Fragment fragmentE;
        t tVarK;
        String hexString;
        int i;
        StringBuilder sb;
        String positionDescription;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 45;
        int i6 = (i4 ^ 45) | i5;
        int i7 = (i5 & i6) + (i6 | i5);
        a = i7 % 128;
        int i8 = i7 % 2;
        Object obj = null;
        if (o000OOo.class.getName().equals(str)) {
            o000OOo o000ooo = new o000OOo(context, attributeSet, this.c);
            int i9 = a;
            int i10 = i9 & 75;
            int i11 = (i10 - (~(-(-((i9 ^ 75) | i10))))) - 1;
            b = i11 % 128;
            if (i11 % 2 != 0) {
                return o000ooo;
            }
            throw null;
        }
        if (!"fragment".equals(str)) {
            int i12 = b;
            int i13 = ((i12 ^ 60) + ((i12 & 60) << 1)) - 1;
            int i14 = i13 % 128;
            a = i14;
            int i15 = i13 % 2;
            int i16 = i14 + 87;
            b = i16 % 128;
            if (i16 % 2 == 0) {
                int i17 = 14 / 0;
            }
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        int i18 = b;
        int i19 = (((i18 & (-116)) | ((~i18) & 115)) - (~((i18 & 115) << 1))) - 1;
        a = i19 % 128;
        if (i19 % 2 != 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ivas.gov.bisp.enumeration.p006af.h.I);
            id = 1;
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ivas.gov.bisp.enumeration.p006af.h.I);
            id = 0;
        }
        if (attributeValue == null) {
            int i20 = b;
            int i21 = (i20 | 97) << 1;
            int i22 = -(i20 ^ 97);
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            a = i23 % 128;
            int i24 = i23 % 2;
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
            int i25 = a;
            int i26 = (i25 ^ 89) + ((i25 & 89) << 1);
            b = i26 % 128;
            int i27 = i26 % 2;
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        int i28 = b;
        int i29 = i28 & 93;
        int i30 = (i28 | 93) & (~i29);
        int i31 = i29 << 1;
        int i32 = (i30 ^ i31) + ((i30 & i31) << 1);
        a = i32 % 128;
        if (i32 % 2 != 0) {
            typedArrayObtainStyledAttributes.recycle();
            obj.hashCode();
            throw null;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue != null) {
            ClassLoader classLoader = context.getClassLoader();
            OooOOOO<ClassLoader, OooOOOO<String, Class<?>>> oooOOOO = r.a;
            int i33 = a;
            int i34 = (i33 | 7) << 1;
            int i35 = -((i33 & (-8)) | ((~i33) & 7));
            int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
            b = i36 % 128;
            try {
                if (i36 % 2 == 0) {
                    Fragment.class.isAssignableFrom(r.c(classLoader, attributeValue));
                    throw null;
                }
                boolean zIsAssignableFrom = Fragment.class.isAssignableFrom(r.c(classLoader, attributeValue));
                int i37 = b;
                int i38 = i37 + 73;
                a = i38 % 128;
                int i39 = i38 % 2;
                if (zIsAssignableFrom) {
                    int i40 = i37 | 107;
                    int i41 = i40 << 1;
                    int i42 = -(i40 & (~(i37 & 107)));
                    int i43 = (i41 & i42) + (i42 | i41);
                    a = i43 % 128;
                    if (i43 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (view != null) {
                        id = view.getId();
                        int i44 = b + 65;
                        a = i44 % 128;
                        int i45 = i44 % 2;
                    }
                    if (id == -1) {
                        int i46 = a;
                        int i47 = i46 & 35;
                        int i48 = i47 + ((i46 ^ 35) | i47);
                        b = i48 % 128;
                        if (i48 % 2 == 0) {
                            int i49 = 87 / 0;
                            if (resourceId == -1) {
                                int i50 = ((i46 & 24) + (i46 | 24)) - 1;
                                b = i50 % 128;
                                int i51 = i50 % 2;
                                if (string == null) {
                                    sb = new StringBuilder();
                                    positionDescription = attributeSet.getPositionDescription();
                                    int i52 = b;
                                    i2 = ((i52 | 93) << 1) - (i52 ^ 93);
                                    a = i2 % 128;
                                    if (i2 % 2 != 0) {
                                        sb.append(positionDescription);
                                        sb.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
                                        obj.hashCode();
                                        throw null;
                                    }
                                    sb.append(positionDescription);
                                    sb.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
                                    sb.append(attributeValue);
                                    throw new IllegalArgumentException(sb.toString());
                                }
                            }
                        } else if (resourceId == -1) {
                            int i53 = ((i46 & 24) + (i46 | 24)) - 1;
                            b = i53 % 128;
                            int i54 = i53 % 2;
                            if (string == null) {
                                sb = new StringBuilder();
                                positionDescription = attributeSet.getPositionDescription();
                                int i55 = b;
                                i2 = ((i55 | 93) << 1) - (i55 ^ 93);
                                a = i2 % 128;
                                if (i2 % 2 != 0) {
                                    sb.append(positionDescription);
                                    sb.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
                                    obj.hashCode();
                                    throw null;
                                }
                                sb.append(positionDescription);
                                sb.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
                                sb.append(attributeValue);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        }
                    }
                    if (resourceId != -1) {
                        int i56 = b;
                        int i57 = i56 & 93;
                        int i58 = i57 + ((i56 ^ 93) | i57);
                        a = i58 % 128;
                        if (i58 % 2 != 0) {
                            this.c.L(resourceId);
                            throw null;
                        }
                        fragmentE = this.c.L(resourceId);
                    } else {
                        fragmentE = null;
                    }
                    if (fragmentE == null) {
                        int i59 = b;
                        int i60 = (i59 & 77) + (i59 | 77);
                        int i61 = i60 % 128;
                        a = i61;
                        int i62 = i60 % 2;
                        if (string != null) {
                            int i63 = ((i61 & 75) - (~(-(-(i61 | 75))))) - 1;
                            b = i63 % 128;
                            int i64 = i63 % 2;
                            fragmentE = this.c.I(string);
                            int i65 = b;
                            int i66 = (i65 & 13) + (i65 | 13);
                            a = i66 % 128;
                            int i67 = i66 % 2;
                        }
                    }
                    if (fragmentE == null) {
                        int i68 = b;
                        int i69 = i68 & 43;
                        int i70 = -(-((i68 ^ 43) | i69));
                        int i71 = (i69 ^ i70) + ((i70 & i69) << 1);
                        a = i71 % 128;
                        if (i71 % 2 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                        if (id != -1) {
                            fragmentE = this.c.L(id);
                            int i72 = b + 7;
                            a = i72 % 128;
                            if (i72 % 2 != 0) {
                                int i73 = 5 / 4;
                            }
                        }
                    }
                    if (fragmentE == null) {
                        int i74 = b;
                        int i75 = i74 & 89;
                        int i76 = ((((i74 ^ 89) | i75) << 1) - (~(-((i74 | 89) & (~i75))))) - 1;
                        a = i76 % 128;
                        if (i76 % 2 != 0) {
                            this.c.N();
                            context.getClassLoader();
                            obj.hashCode();
                            throw null;
                        }
                        fragmentE = this.c.N().e(context.getClassLoader(), attributeValue);
                        fragmentE.mFromLayout = true;
                        if (resourceId != 0) {
                            int i77 = b;
                            int i78 = i77 & 23;
                            int i79 = -(-((i77 ^ 23) | i78));
                            int i80 = ((i78 | i79) << 1) - (i79 ^ i78);
                            int i81 = i80 % 128;
                            a = i81;
                            int i82 = i80 % 2;
                            int i83 = i81 + 47;
                            b = i83 % 128;
                            int i84 = i83 % 2;
                            i = resourceId;
                        } else {
                            int i85 = b;
                            int i86 = ((i85 | 107) << 1) - (i85 ^ 107);
                            a = i86 % 128;
                            if (i86 % 2 != 0) {
                                int i87 = 5 / 4;
                            }
                            i = id;
                        }
                        fragmentE.mFragmentId = i;
                        fragmentE.mContainerId = id;
                        fragmentE.mTag = string;
                        int i88 = a + 48;
                        int i89 = (i88 ^ (-1)) + (i88 << 1);
                        b = i89 % 128;
                        int i90 = i89 % 2;
                        fragmentE.mInLayout = true;
                        h hVar = this.c;
                        fragmentE.mFragmentManager = hVar;
                        int i91 = b;
                        int i92 = i91 & 63;
                        int i93 = ((i91 ^ 63) | i92) << 1;
                        int i94 = -((i91 | 63) & (~i92));
                        int i95 = ((i93 | i94) << 1) - (i94 ^ i93);
                        a = i95 % 128;
                        int i96 = i95 % 2;
                        o000000O<?> o000000o = hVar.r;
                        fragmentE.mHost = o000000o;
                        Context context2 = o000000o.b;
                        int i97 = a;
                        int i98 = ((i97 | 1) << 1) - (i97 ^ 1);
                        b = i98 % 128;
                        if (i98 % 2 == 0) {
                            fragmentE.onInflate(context2, attributeSet, fragmentE.mSavedFragmentState);
                            this.c.d(fragmentE);
                            obj.hashCode();
                            throw null;
                        }
                        fragmentE.onInflate(context2, attributeSet, fragmentE.mSavedFragmentState);
                        tVarK = this.c.d(fragmentE);
                        if (h.b(2)) {
                            int i99 = b + 55;
                            int i100 = i99 % 128;
                            a = i100;
                            int i101 = i99 % 2;
                            int i102 = i100 & 3;
                            int i103 = (((i100 | 3) & (~i102)) - (~(i102 << 1))) - 1;
                            b = i103 % 128;
                            int i104 = i103 % 2;
                        }
                    } else {
                        if (!(!fragmentE.mInLayout)) {
                            StringBuilder sb2 = new StringBuilder();
                            String positionDescription2 = attributeSet.getPositionDescription();
                            int i105 = b;
                            int i106 = i105 & 29;
                            int i107 = -(-((i105 ^ 29) | i106));
                            int i108 = (i106 & i107) + (i107 | i106);
                            a = i108 % 128;
                            int i109 = i108 % 2;
                            sb2.append(positionDescription2);
                            sb2.append(": Duplicate id 0x");
                            int i110 = a + 9;
                            b = i110 % 128;
                            if (i110 % 2 == 0) {
                                sb2.append(Integer.toHexString(resourceId));
                                int i111 = 56 / 0;
                            } else {
                                sb2.append(Integer.toHexString(resourceId));
                            }
                            int i112 = b;
                            int i113 = ((i112 | 105) << 1) - (i112 ^ 105);
                            a = i113 % 128;
                            int i114 = i113 % 2;
                            sb2.append(", tag ");
                            sb2.append(string);
                            int i115 = b;
                            int i116 = i115 & 81;
                            int i117 = i116 + ((i115 ^ 81) | i116);
                            a = i117 % 128;
                            if (i117 % 2 != 0) {
                                sb2.append(", or parent id 0x");
                                hexString = Integer.toHexString(id);
                                int i118 = 94 / 0;
                            } else {
                                sb2.append(", or parent id 0x");
                                hexString = Integer.toHexString(id);
                            }
                            sb2.append(hexString);
                            sb2.append(" with another fragment for ");
                            sb2.append(attributeValue);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                        int i119 = a;
                        int i120 = ((i119 | 105) << 1) - (i119 ^ 105);
                        b = i120 % 128;
                        int i121 = i120 % 2;
                        fragmentE.mInLayout = true;
                        h hVar2 = this.c;
                        fragmentE.mFragmentManager = hVar2;
                        int i122 = b;
                        int i123 = ((i122 | 45) << 1) - (i122 ^ 45);
                        a = i123 % 128;
                        int i124 = i123 % 2;
                        o000000O<?> o000000o2 = hVar2.r;
                        fragmentE.mHost = o000000o2;
                        Context context3 = o000000o2.b;
                        int i125 = a;
                        int i126 = (i125 & (-32)) | ((~i125) & 31);
                        int i127 = (i125 & 31) << 1;
                        int i128 = (i126 & i127) + (i127 | i126);
                        b = i128 % 128;
                        int i129 = i128 % 2;
                        fragmentE.onInflate(context3, attributeSet, fragmentE.mSavedFragmentState);
                        h hVar3 = this.c;
                        int i130 = b;
                        int i131 = ((i130 | 121) << 1) - (i130 ^ 121);
                        a = i131 % 128;
                        int i132 = i131 % 2;
                        tVarK = hVar3.k(fragmentE);
                        if (!(!h.b(2))) {
                            int i133 = a;
                            int i134 = (i133 & 119) + (i133 | 119);
                            int i135 = i134 % 128;
                            b = i135;
                            int i136 = i134 % 2;
                            int i137 = ((i135 | 17) << 1) - (i135 ^ 17);
                            a = i137 % 128;
                            int i138 = i137 % 2;
                        }
                    }
                    fragmentE.mContainer = (ViewGroup) view;
                    tVarK.n();
                    int i139 = b;
                    int i140 = (i139 ^ 120) + ((i139 & 120) << 1);
                    int i141 = (i140 ^ (-1)) + (i140 << 1);
                    a = i141 % 128;
                    int i142 = i141 % 2;
                    tVarK.m();
                    View view2 = fragmentE.mView;
                    if (view2 == null) {
                        throw new IllegalStateException(j.t("Fragment ", attributeValue, " did not create a view."));
                    }
                    int i143 = a;
                    int i144 = i143 ^ 45;
                    int i145 = (i143 & 45) << 1;
                    int i146 = (i144 & i145) + (i144 | i145);
                    b = i146 % 128;
                    int i147 = i146 % 2;
                    if (resourceId != 0) {
                        int i148 = i143 + 10;
                        int i149 = (i148 ^ (-1)) + (i148 << 1);
                        b = i149 % 128;
                        if (i149 % 2 == 0) {
                            view2.setId(resourceId);
                            obj.hashCode();
                            throw null;
                        }
                        view2.setId(resourceId);
                    }
                    if (fragmentE.mView.getTag() == null) {
                        int i150 = a;
                        int i151 = (((i150 | 86) << 1) - (i150 ^ 86)) - 1;
                        b = i151 % 128;
                        int i152 = i151 % 2;
                        fragmentE.mView.setTag(string);
                        int i153 = a + 107;
                        b = i153 % 128;
                        int i154 = i153 % 2;
                    }
                    fragmentE.mView.addOnAttachStateChangeListener(new aYv(tVarK));
                    int i155 = a + 109;
                    b = i155 % 128;
                    int i156 = i155 % 2;
                    View view3 = fragmentE.mView;
                    int i157 = a;
                    int i158 = ((i157 ^ 3) | (i157 & 3)) << 1;
                    int i159 = -(((~i157) & 3) | (i157 & (-4)));
                    int i160 = (i158 ^ i159) + ((i159 & i158) << 1);
                    b = i160 % 128;
                    if (i160 % 2 != 0) {
                        return view3;
                    }
                    throw null;
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        int i161 = b;
        int i162 = (i161 & 5) + (i161 | 5);
        a = i162 % 128;
        int i163 = i162 % 2;
        return null;
    }
}
