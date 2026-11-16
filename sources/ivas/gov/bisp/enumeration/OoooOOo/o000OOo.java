package ivas.gov.bisp.enumeration.OoooOOo;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import androidx.fragment.app.h;
import androidx.fragment.app.t;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p081d.am;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.ArrayList;
import java.util.Iterator;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class o000OOo extends FrameLayout {
    private static int a = 0;
    private static int b = 1;
    public ArrayList<View> c;
    public ArrayList<View> d;
    public View.OnApplyWindowInsetsListener e;
    public boolean f;

    /* JADX WARN: Code duplicated, block: B:16:0x0070  */
    /* JADX WARN: Code duplicated, block: B:18:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0083  */
    /* JADX WARN: Code duplicated, block: B:22:0x0095  */
    /* JADX WARN: Code duplicated, block: B:23:0x009c  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:32:0x0107  */
    /* JADX WARN: Code duplicated, block: B:35:0x0132  */
    /* JADX WARN: Code duplicated, block: B:36:0x0135  */
    /* JADX WARN: Code duplicated, block: B:38:0x013d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0144  */
    public o000OOo(Context context, AttributeSet attributeSet, h hVar) {
        int i;
        int i2;
        Fragment fragmentE;
        a aVar;
        int i3;
        int i4;
        String strR;
        int i5;
        super(context, attributeSet);
        this.f = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ivas.gov.bisp.enumeration.p006af.h.J);
        if (classAttribute == null) {
            classAttribute = typedArrayObtainStyledAttributes.getString(0);
            int i6 = b;
            int i7 = i6 | 9;
            int i8 = ((i7 << 1) - (~(-((~(i6 & 9)) & i7)))) - 1;
            a = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 2 / 3;
            } else {
                int i10 = 2 % 2;
            }
        }
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int i11 = a;
        int i12 = i11 & 87;
        int i13 = (i12 - (~(-(-((i11 ^ 87) | i12))))) - 1;
        b = i13 % 128;
        int i14 = i13 % 2;
        int id = getId();
        Fragment fragmentL = hVar.L(id);
        Object obj = null;
        if (classAttribute != null) {
            int i15 = a;
            int i16 = i15 ^ 119;
            int i17 = ((((i15 & 119) | i16) << 1) - (~(-i16))) - 1;
            int i18 = i17 % 128;
            b = i18;
            if (i17 % 2 == 0) {
                int i19 = 38 / 0;
                if (fragmentL == null) {
                    int i20 = i18 & 77;
                    i = ((~i20) & (i18 | 77)) + (i20 << 1);
                    i2 = i % 128;
                    a = i2;
                    if (i % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (id <= 0) {
                        if (string != null) {
                            int i21 = i2 & 17;
                            int i22 = i2 | 17;
                            i5 = (i21 ^ i22) + ((i21 & i22) << 1);
                            b = i5 % 128;
                            if (i5 % 2 == 0) {
                                strR = j.r(" with tag ", string);
                                int i23 = 6 / 0;
                            } else {
                                strR = j.r(" with tag ", string);
                            }
                            int i24 = 2 % 2;
                        } else {
                            int i25 = i2 & 123;
                            int i26 = (~i25) & (i2 | 123);
                            int i27 = -(-(i25 << 1));
                            int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
                            b = i28 % 128;
                            int i29 = i28 % 2;
                            int i30 = 2 % 2;
                            strR = BuildConfig.FLAVOR;
                        }
                        throw new IllegalStateException(j.t("FragmentContainerView must have an android:id to add Fragment ", classAttribute, strR));
                    }
                    fragmentE = hVar.N().e(context.getClassLoader(), classAttribute);
                    fragmentE.onInflate(context, attributeSet, (Bundle) null);
                    aVar = new a(hVar);
                    int i31 = b;
                    int i32 = (((i31 & (-96)) | ((~i31) & 95)) - (~(-(-((i31 & 95) << 1))))) - 1;
                    a = i32 % 128;
                    int i33 = i32 % 2;
                    aVar.f23o = true;
                    fragmentE.mContainer = this;
                    i3 = b + 3;
                    a = i3 % 128;
                    if (i3 % 2 == 0) {
                        getId();
                        obj.hashCode();
                        throw null;
                    }
                    aVar.d(getId(), fragmentE, string, 1);
                    if (!aVar.h) {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                    int i34 = a;
                    int i35 = (i34 ^ 47) + ((i34 & 47) << 1);
                    b = i35 % 128;
                    int i36 = i35 % 2;
                    aVar.p.F(aVar, true);
                    int i37 = b;
                    int i38 = i37 & 93;
                    int i39 = ((i37 ^ 93) | i38) << 1;
                    int i40 = -((i37 | 93) & (~i38));
                    i4 = (i39 & i40) + (i40 | i39);
                    a = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i41 = 2 % 2;
                    }
                }
            } else if (fragmentL == null) {
                int i210 = i18 & 77;
                i = ((~i210) & (i18 | 77)) + (i210 << 1);
                i2 = i % 128;
                a = i2;
                if (i % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                if (id <= 0) {
                    if (string != null) {
                        int i211 = i2 & 17;
                        int i212 = i2 | 17;
                        i5 = (i211 ^ i212) + ((i211 & i212) << 1);
                        b = i5 % 128;
                        if (i5 % 2 == 0) {
                            strR = j.r(" with tag ", string);
                            int i213 = 6 / 0;
                        } else {
                            strR = j.r(" with tag ", string);
                        }
                        int i214 = 2 % 2;
                    } else {
                        int i215 = i2 & 123;
                        int i216 = (~i215) & (i2 | 123);
                        int i217 = -(-(i215 << 1));
                        int i218 = ((i216 | i217) << 1) - (i217 ^ i216);
                        b = i218 % 128;
                        int i219 = i218 % 2;
                        int i310 = 2 % 2;
                        strR = BuildConfig.FLAVOR;
                    }
                    throw new IllegalStateException(j.t("FragmentContainerView must have an android:id to add Fragment ", classAttribute, strR));
                }
                fragmentE = hVar.N().e(context.getClassLoader(), classAttribute);
                fragmentE.onInflate(context, attributeSet, (Bundle) null);
                aVar = new a(hVar);
                int i311 = b;
                int i312 = (((i311 & (-96)) | ((~i311) & 95)) - (~(-(-((i311 & 95) << 1))))) - 1;
                a = i312 % 128;
                int i313 = i312 % 2;
                aVar.f23o = true;
                fragmentE.mContainer = this;
                i3 = b + 3;
                a = i3 % 128;
                if (i3 % 2 == 0) {
                    getId();
                    obj.hashCode();
                    throw null;
                }
                aVar.d(getId(), fragmentE, string, 1);
                if (!aVar.h) {
                    throw new IllegalStateException("This transaction is already being added to the back stack");
                }
                int i314 = a;
                int i315 = (i314 ^ 47) + ((i314 & 47) << 1);
                b = i315 % 128;
                int i316 = i315 % 2;
                aVar.p.F(aVar, true);
                int i317 = b;
                int i318 = i317 & 93;
                int i319 = ((i317 ^ 93) | i318) << 1;
                int i42 = -((i317 | 93) & (~i318));
                i4 = (i319 & i42) + (i42 | i319);
                a = i4 % 128;
                if (i4 % 2 == 0) {
                    int i43 = 2 % 2;
                }
            }
        }
        Iterator it = ((ArrayList) hVar.d.h()).iterator();
        int i44 = a;
        int i45 = i44 & 109;
        int i46 = (i44 ^ 109) | i45;
        int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
        b = i47 % 128;
        if (i47 % 2 == 0) {
            throw null;
        }
        int i48 = 2 % 2;
        while (!(!it.hasNext())) {
            int i49 = b;
            int i50 = (i49 ^ 15) + ((i49 & 15) << 1);
            a = i50 % 128;
            if (i50 % 2 != 0) {
                Fragment fragment = ((t) it.next()).c;
                obj.hashCode();
                throw null;
            }
            t tVar = (t) it.next();
            Fragment fragment2 = tVar.c;
            if (fragment2.mContainerId == getId()) {
                int i51 = a + 29;
                b = i51 % 128;
                int i52 = i51 % 2;
                View view = fragment2.mView;
                if (view != null) {
                    int i53 = b + 11;
                    a = i53 % 128;
                    if (i53 % 2 != 0) {
                        view.getParent();
                        throw null;
                    }
                    if (view.getParent() == null) {
                        int i54 = a + 47;
                        b = i54 % 128;
                        if (i54 % 2 == 0) {
                            fragment2.mContainer = this;
                            tVar.f();
                            obj.hashCode();
                            throw null;
                        }
                        fragment2.mContainer = this;
                        tVar.f();
                        int i55 = b;
                        int i56 = i55 & 27;
                        int i57 = ((i55 | 27) & (~i56)) + (i56 << 1);
                        a = i57 % 128;
                        int i58 = i57 % 2;
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        int i59 = b;
        int i60 = i59 & 55;
        int i61 = -(-((i59 ^ 55) | i60));
        int i62 = ((i60 | i61) << 1) - (i61 ^ i60);
        a = i62 % 128;
        if (i62 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    /* JADX WARN: Code duplicated, block: B:14:0x005d A[LOOP:0: B:12:0x0055->B:14:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 93;
        int i6 = -(-(i4 | 93));
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        a = i7 % 128;
        int i8 = i7 % 2;
        boolean z = this.f;
        if (i8 != 0) {
            int i9 = 8 / 0;
            if (z) {
                int i10 = i4 ^ 61;
                int i11 = ((i4 & 61) | i10) << 1;
                int i12 = -i10;
                int i13 = (i11 & i12) + (i11 | i12);
                i = i13 % 128;
                a = i;
                int i14 = i13 % 2;
                if (this.c != null) {
                    int i15 = i & 45;
                    int i16 = -(-((i ^ 45) | i15));
                    int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
                    b = i17 % 128;
                    int i18 = i17 % 2;
                    int i19 = i & 79;
                    int i20 = i19 + ((i ^ 79) | i19);
                    b = i20 % 128;
                    int i21 = i20 % 2;
                    i2 = 0;
                    while (i2 < this.c.size()) {
                        int i22 = a;
                        int i23 = i22 & 113;
                        int i24 = (i22 ^ 113) | i23;
                        int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                        b = i25 % 128;
                        int i26 = i25 % 2;
                        View view = this.c.get(i2);
                        long drawingTime = getDrawingTime();
                        int i27 = b;
                        int i28 = i27 & 99;
                        int i29 = -(-((i27 ^ 99) | i28));
                        int i30 = (i28 & i29) + (i29 | i28);
                        a = i30 % 128;
                        int i31 = i30 % 2;
                        super.drawChild(canvas, view, drawingTime);
                        int i32 = i2 & 1;
                        i2 = (i32 - (~(-(-((i2 ^ 1) | i32))))) - 1;
                        int i33 = b;
                        int i34 = i33 & 43;
                        int i35 = (i33 | 43) & (~i34);
                        int i36 = i34 << 1;
                        int i37 = (i35 & i36) + (i35 | i36);
                        a = i37 % 128;
                        int i38 = i37 % 2;
                    }
                }
            }
        } else if (!(!z)) {
            int i110 = i4 ^ 61;
            int i111 = ((i4 & 61) | i110) << 1;
            int i112 = -i110;
            int i113 = (i111 & i112) + (i111 | i112);
            i = i113 % 128;
            a = i;
            int i114 = i113 % 2;
            if (this.c != null) {
                int i115 = i & 45;
                int i116 = -(-((i ^ 45) | i115));
                int i117 = ((i115 | i116) << 1) - (i115 ^ i116);
                b = i117 % 128;
                int i118 = i117 % 2;
                int i119 = i & 79;
                int i210 = i119 + ((i ^ 79) | i119);
                b = i210 % 128;
                int i211 = i210 % 2;
                i2 = 0;
                while (i2 < this.c.size()) {
                    int i212 = a;
                    int i213 = i212 & 113;
                    int i214 = (i212 ^ 113) | i213;
                    int i215 = ((i213 | i214) << 1) - (i214 ^ i213);
                    b = i215 % 128;
                    int i216 = i215 % 2;
                    View view2 = this.c.get(i2);
                    long drawingTime2 = getDrawingTime();
                    int i217 = b;
                    int i218 = i217 & 99;
                    int i219 = -(-((i217 ^ 99) | i218));
                    int i39 = (i218 & i219) + (i219 | i218);
                    a = i39 % 128;
                    int i310 = i39 % 2;
                    super.drawChild(canvas, view2, drawingTime2);
                    int i311 = i2 & 1;
                    i2 = (i311 - (~(-(-((i2 ^ 1) | i311))))) - 1;
                    int i312 = b;
                    int i313 = i312 & 43;
                    int i314 = (i312 | 43) & (~i313);
                    int i315 = i313 << 1;
                    int i316 = (i314 & i315) + (i314 | i315);
                    a = i316 % 128;
                    int i317 = i316 % 2;
                }
            }
        }
        super.dispatchDraw(canvas);
        int i40 = a;
        int i41 = (i40 | 113) << 1;
        int i42 = -(((~i40) & 113) | (i40 & (-114)));
        int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
        b = i43 % 128;
        if (i43 % 2 == 0) {
            int i44 = 63 / 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 69;
        int i4 = i2 | 69;
        int i5 = (i3 & i4) + (i3 | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        ArrayList<View> arrayList = this.d;
        if (arrayList != null) {
            int i7 = i2 + 89;
            b = i7 % 128;
            int i8 = i7 % 2;
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.c;
            if (arrayList2 != null) {
                int i9 = a;
                int i10 = i9 & 101;
                int i11 = -(-((i9 ^ 101) | i10));
                int i12 = (i10 & i11) + (i11 | i10);
                b = i12 % 128;
                int i13 = i12 % 2;
                if (arrayList2.remove(view)) {
                    int i14 = b;
                    int i15 = i14 & 9;
                    int i16 = (i14 ^ 9) | i15;
                    int i17 = (i15 & i16) + (i16 | i15);
                    int i18 = i17 % 128;
                    a = i18;
                    int i19 = i17 % 2;
                    this.f = true;
                    int i20 = i18 & 3;
                    int i21 = (i18 | 3) & (~i20);
                    int i22 = i20 << 1;
                    int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
                    b = i23 % 128;
                    if (i23 % 2 == 0) {
                        int i24 = 5 % 5;
                    }
                }
            }
        }
        super.endViewTransition(view);
        int i25 = a;
        int i26 = i25 ^ 91;
        int i27 = ((i25 & 91) | i26) << 1;
        int i28 = -i26;
        int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
        b = i29 % 128;
        int i30 = i29 % 2;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - (((i2 ^ 110) + ((i2 & 110) << 1)) ^ (-1));
        a = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = ((((i2 ^ 105) | (i2 & 105)) << 1) - (~(-(((~i2) & 105) | (i2 & (-106)))))) - 1;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount;
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 & 51) - (~(-(-(i3 | 51))))) - 1;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            childCount = getChildCount() >> 1;
        } else {
            int childCount2 = getChildCount();
            childCount = (childCount2 << 1) + (childCount2 ^ (-1));
        }
        int i5 = b;
        int i6 = (i5 | 41) << 1;
        int i7 = -(i5 ^ 41);
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        while (childCount >= 0) {
            int i10 = a;
            int i11 = i10 & 105;
            int i12 = i11 + ((i10 ^ 105) | i11);
            b = i12 % 128;
            if (i12 % 2 == 0) {
                c(getChildAt(childCount));
                int i13 = childCount - 17;
                i = (i13 ^ 48) + ((i13 & 48) << 1);
            } else {
                c(getChildAt(childCount));
                i = ((~childCount) - (~(-(-(childCount << 1))))) - 1;
            }
            childCount = i;
        }
        super.removeAllViewsInLayout();
        int i14 = b + 30;
        int i15 = (i14 ^ (-1)) + (i14 << 1);
        a = i15 % 128;
        int i16 = i15 % 2;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        int i = 2 % 2;
        int i2 = a + 50;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        if (z) {
            int i6 = i4 & 17;
            int i7 = -(-(i4 | 17));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            a = i8 % 128;
            int i9 = i8 % 2;
            c(view);
            int i10 = a;
            int i11 = ((((i10 ^ 101) | (i10 & 101)) << 1) - (~(-(((~i10) & 101) | (i10 & (-102)))))) - 1;
            b = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 4 / 5;
            }
        }
        super.removeDetachedView(view, z);
        int i13 = a + 21;
        b = i13 % 128;
        int i14 = i13 % 2;
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 111) + ((i2 & 111) << 1);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        this.f = z;
        int i6 = ((i4 & 58) + (i4 | 58)) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.view.ViewGroup
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public final void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - ((((i2 | 80) << 1) - (i2 ^ 80)) ^ (-1));
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        this.e = onApplyWindowInsetsListener;
        if (i5 != 0) {
            throw null;
        }
        int i6 = (i4 & 114) + (i4 | 114);
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 40 / 0;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        int i = 2 % 2;
        int i2 = a + 1;
        b = i2 % 128;
        int i3 = i2 % 2;
        c(view);
        super.removeView(view);
        int i4 = a;
        int i5 = i4 & 45;
        int i6 = (i4 ^ 45) | i5;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        b = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-86)) | ((~i2) & 85);
        int i4 = -(-((i2 & 85) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            c(view);
            super.removeViewInLayout(view);
        } else {
            c(view);
            super.removeViewInLayout(view);
            int i6 = 98 / 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = ((i4 | 45) << 1) - (i4 ^ 45);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        int i6 = i;
        while (true) {
            int i7 = i & i2;
            int i8 = -(-(i | i2));
            if (i6 >= (i7 ^ i8) + ((i7 & i8) << 1)) {
                break;
            }
            int i9 = b;
            int i10 = ((i9 & 68) + (i9 | 68)) - 1;
            a = i10 % 128;
            if (i10 % 2 != 0) {
                c(getChildAt(i6));
                int i11 = 10 / 0;
            } else {
                c(getChildAt(i6));
            }
            i6 = ((i6 | 1) << 1) - (i6 ^ 1);
            int i12 = b + 89;
            a = i12 % 128;
            int i13 = i12 % 2;
        }
        super.removeViews(i, i2);
        int i14 = a;
        int i15 = i14 & 41;
        int i16 = i15 + ((i14 ^ 41) | i15);
        b = i16 % 128;
        if (i16 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = ((i4 | 49) << 1) - (i4 ^ 49);
        int i6 = i5 % 128;
        b = i6;
        if (i5 % 2 == 0) {
            int i7 = 1 / 0;
        }
        int i8 = i6 & 81;
        int i9 = i8 + ((i6 ^ 81) | i8);
        a = i9 % 128;
        int i10 = i9 % 2;
        int i11 = i;
        while (true) {
            int i12 = -(~i2);
            if (i11 >= (-2) - ((((i | i12) << 1) - (i12 ^ i)) ^ (-1))) {
                super.removeViewsInLayout(i, i2);
                int i13 = b;
                int i14 = ((i13 & 37) - (~(i13 | 37))) - 1;
                a = i14 % 128;
                int i15 = i14 % 2;
                return;
            }
            int i16 = b + 58;
            int i17 = (i16 ^ (-1)) + (i16 << 1);
            a = i17 % 128;
            if (i17 % 2 != 0) {
                c(getChildAt(i11));
                throw null;
            }
            c(getChildAt(i11));
            int i18 = i11 & 1;
            int i19 = (i11 ^ 1) | i18;
            i11 = (i19 | i18) + (i18 & i19);
            int i20 = a;
            int i21 = i20 & 39;
            int i22 = i21 + ((i20 ^ 39) | i21);
            b = i22 % 128;
            int i23 = i22 % 2;
        }
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        int i = 2 % 2;
        int i2 = a + 117;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            view.getParent();
            throw null;
        }
        if (view.getParent() == this) {
            int i3 = a + 69;
            b = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this.d == null) {
                this.d = new ArrayList<>();
                int i4 = (-2) - ((a + 34) ^ (-1));
                b = i4 % 128;
                int i5 = i4 % 2;
            }
            this.d.add(view);
            int i6 = a;
            int i7 = (i6 & 41) + (i6 | 41);
            b = i7 % 128;
            int i8 = i7 % 2;
        }
        super.startViewTransition(view);
        int i9 = b + 81;
        a = i9 % 128;
        int i10 = i9 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x004f  */
    /* JADX WARN: Code duplicated, block: B:20:0x007f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0082  */
    /* JADX WARN: Code duplicated, block: B:23:0x0086  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020 A[PHI: r2
  0x0020: PHI (r2v4 java.util.ArrayList<android.view.View>) = (r2v3 java.util.ArrayList<android.view.View>), (r2v11 java.util.ArrayList<android.view.View>) binds: [B:8:0x001e, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    public final void c(View view) {
        ArrayList<View> arrayList;
        int i;
        Object obj;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = (i5 ^ 63) + ((i5 & 63) << 1);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            arrayList = this.d;
            int i7 = 34 / 0;
            if (arrayList != null) {
                i = (-2) - ((i5 + 108) ^ (-1));
                b = i % 128;
                obj = null;
                if (i % 2 != 0) {
                    arrayList.contains(view);
                    obj.hashCode();
                    throw null;
                }
                if (arrayList.contains(view)) {
                    int i8 = b;
                    int i9 = i8 ^ 85;
                    int i10 = ((i8 & 85) | i9) << 1;
                    int i11 = -i9;
                    i2 = (i10 ^ i11) + ((i10 & i11) << 1);
                    a = i2 % 128;
                    if (i2 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (this.c == null) {
                        this.c = new ArrayList<>();
                        int i12 = a;
                        int i13 = i12 & 31;
                        int i14 = (i12 | 31) & (~i13);
                        int i15 = -(-(i13 << 1));
                        int i16 = (i14 & i15) + (i14 | i15);
                        b = i16 % 128;
                        int i17 = i16 % 2;
                    }
                    this.c.add(view);
                    int i18 = b;
                    int i19 = i18 & 31;
                    i3 = i19 + ((i18 ^ 31) | i19);
                    a = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i20 = 5 % 2;
                    }
                }
            }
        } else {
            arrayList = this.d;
            if (arrayList != null) {
                i = (-2) - ((i5 + 108) ^ (-1));
                b = i % 128;
                obj = null;
                if (i % 2 != 0) {
                    arrayList.contains(view);
                    obj.hashCode();
                    throw null;
                }
                if (arrayList.contains(view)) {
                    int i21 = b;
                    int i22 = i21 ^ 85;
                    int i110 = ((i21 & 85) | i22) << 1;
                    int i111 = -i22;
                    i2 = (i110 ^ i111) + ((i110 & i111) << 1);
                    a = i2 % 128;
                    if (i2 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (this.c == null) {
                        this.c = new ArrayList<>();
                        int i112 = a;
                        int i113 = i112 & 31;
                        int i114 = (i112 | 31) & (~i113);
                        int i115 = -(-(i113 << 1));
                        int i116 = (i114 & i115) + (i114 | i115);
                        b = i116 % 128;
                        int i117 = i116 % 2;
                    }
                    this.c.add(view);
                    int i118 = b;
                    int i119 = i118 & 31;
                    i3 = i119 + ((i118 ^ 31) | i119);
                    a = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i23 = 5 % 2;
                    }
                }
            }
        }
        int i24 = a;
        int i25 = i24 & 7;
        int i26 = i25 + ((i24 ^ 7) | i25);
        b = i26 % 128;
        int i27 = i26 % 2;
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 25) | (i3 & 25)) << 1;
        int i5 = -(((~i3) & 25) | (i3 & (-26)));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        c(getChildAt(i));
        int i8 = a;
        int i9 = i8 & 1;
        int i10 = -(-((i8 ^ 1) | i9));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        b = i11 % 128;
        int i12 = i11 % 2;
        super.removeViewAt(i);
        if (i12 == 0) {
            int i13 = 5 / 0;
        }
        int i14 = b + 13;
        a = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Fragment fragment;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 81;
        int i5 = -(-((i3 ^ 81) | i4));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            int i8 = a;
            int i9 = (-2) - ((i8 + 6) ^ (-1));
            b = i9 % 128;
            int i10 = i9 % 2;
            fragment = (Fragment) tag;
            int i11 = (i8 ^ 7) + ((i8 & 7) << 1);
            b = i11 % 128;
            int i12 = i11 % 2;
        } else {
            int i13 = a;
            int i14 = i13 & 115;
            int i15 = (i13 ^ 115) | i14;
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            b = i16 % 128;
            int i17 = i16 % 2;
            fragment = null;
        }
        if (fragment == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
            int i18 = b;
            int i19 = (i18 & 117) + (i18 | 117);
            a = i19 % 128;
            int i20 = i19 % 2;
            sb.append(view);
            sb.append(" is not associated with a Fragment.");
            throw new IllegalStateException(sb.toString());
        }
        int i21 = b;
        int i22 = i21 & 39;
        int i23 = (i21 ^ 39) | i22;
        int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
        a = i24 % 128;
        if (i24 % 2 != 0) {
            super.addView(view, i, layoutParams);
            int i25 = 67 / 0;
        } else {
            super.addView(view, i, layoutParams);
        }
        int i26 = a;
        int i27 = i26 ^ 99;
        int i28 = (i26 & 99) << 1;
        int i29 = (i27 & i28) + (i28 | i27);
        b = i29 % 128;
        int i30 = i29 % 2;
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 71) + ((i3 & 71) << 1);
        b = i4 % 128;
        Fragment fragment = null;
        if (i4 % 2 == 0) {
            boolean z2 = view.getTag(R.id.fragment_container_view_tag) instanceof Fragment;
            throw null;
        }
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            int i5 = (-2) - ((b + 48) ^ (-1));
            a = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            fragment = (Fragment) tag;
        } else {
            int i6 = b + 45;
            a = i6 % 128;
            int i7 = i6 % 2;
        }
        if (fragment == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
            int i8 = a;
            int i9 = ((i8 ^ 64) + ((i8 & 64) << 1)) - 1;
            b = i9 % 128;
            int i10 = i9 % 2;
            sb.append(view);
            sb.append(" is not associated with a Fragment.");
            throw new IllegalStateException(sb.toString());
        }
        int i11 = b;
        int i12 = i11 & 53;
        int i13 = -(-((i11 ^ 53) | i12));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        a = i14 % 128;
        int i15 = i14 % 2;
        boolean zAddViewInLayout = super.addViewInLayout(view, i, layoutParams, z);
        int i16 = a;
        int i17 = (i16 & 23) + (i16 | 23);
        b = i17 % 128;
        int i18 = i17 % 2;
        return zAddViewInLayout;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 85) + (i2 | 85);
        a = i3 % 128;
        int i4 = i3 % 2;
        if (!(!this.f)) {
            int i5 = i2 + 25;
            a = i5 % 128;
            if (i5 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ArrayList<View> arrayList = this.c;
            if (arrayList != null) {
                int i6 = i2 & 87;
                int i7 = -(-((i2 ^ 87) | i6));
                int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
                a = i8 % 128;
                int i9 = i8 % 2;
                if (arrayList.size() > 0) {
                    int i10 = b;
                    int i11 = i10 & 21;
                    int i12 = i10 | 21;
                    int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                    a = i13 % 128;
                    int i14 = i13 % 2;
                    if (this.c.contains(view)) {
                        int i15 = a;
                        int i16 = (((i15 | 72) << 1) - (i15 ^ 72)) - 1;
                        b = i16 % 128;
                        int i17 = i16 % 2;
                        int i18 = i15 + 87;
                        b = i18 % 128;
                        int i19 = i18 % 2;
                        return false;
                    }
                }
            }
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        int i20 = a;
        int i21 = ((i20 ^ 75) | (i20 & 75)) << 1;
        int i22 = -(((~i20) & 75) | (i20 & (-76)));
        int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
        b = i23 % 128;
        if (i23 % 2 == 0) {
            int i24 = 20 / 0;
        }
        return zDrawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        am amVarL;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 93;
        int i4 = (i2 ^ 93) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        am amVarD = am.d(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.e;
        if (onApplyWindowInsetsListener != null) {
            int i7 = a + 3;
            b = i7 % 128;
            if (i7 % 2 == 0) {
                am.f(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
                throw null;
            }
            amVarL = am.f(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            amVarL = T.l(this, amVarD);
            int i8 = b;
            int i9 = i8 & 77;
            int i10 = (i8 | 77) & (~i9);
            int i11 = i9 << 1;
            int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
            a = i12 % 128;
            int i13 = i12 % 2;
        }
        if (!amVarL.k()) {
            int i14 = b + 17;
            a = i14 % 128;
            int i15 = i14 % 2;
            int childCount = getChildCount();
            int i16 = b;
            int i17 = (((i16 ^ 11) | (i16 & 11)) << 1) - (((~i16) & 11) | (i16 & (-12)));
            a = i17 % 128;
            int i18 = i17 % 2;
            int i19 = 0;
            while (i19 < childCount) {
                int i20 = a;
                int i21 = i20 | 71;
                int i22 = i21 << 1;
                int i23 = -((~(i20 & 71)) & i21);
                int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                b = i24 % 128;
                if (i24 % 2 == 0) {
                    T.e(getChildAt(i19), amVarL);
                    i19 = ((i19 & 58) + (i19 | 58)) - 1;
                } else {
                    T.e(getChildAt(i19), amVarL);
                    int i25 = i19 & (-34);
                    int i26 = -(-((i19 ^ (-34)) | i25));
                    int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                    int i28 = i27 & 35;
                    int i29 = (i27 ^ 35) | i28;
                    i19 = (i28 ^ i29) + ((i28 & i29) << 1);
                }
                int i30 = b;
                int i31 = i30 & 97;
                int i32 = ((i30 | 97) & (~i31)) + (i31 << 1);
                a = i32 % 128;
                int i33 = i32 % 2;
            }
        }
        int i34 = a + 23;
        b = i34 % 128;
        int i35 = i34 % 2;
        return windowInsets;
    }
}
