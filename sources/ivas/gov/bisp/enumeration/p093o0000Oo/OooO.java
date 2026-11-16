package ivas.gov.bisp.enumeration.p093o0000Oo;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import ivas.gov.bisp.enumeration.O.C0019p;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.O.t;
import ivas.gov.bisp.enumeration.O.z;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p081d.T;
import java.util.HashMap;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class OooO extends ConstraintLayout {
    private static int p = 1;
    private static int q;
    public int r;
    public final Runnable s;
    public C0019p t;

    public class bfU implements Runnable {
        private static int a = 0;
        private static int b = 1;

        public bfU() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 121;
            int i4 = ((i2 ^ 121) | i3) << 1;
            int i5 = -((i2 | 121) & (~i3));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            a = i6 % 128;
            if (i6 % 2 != 0) {
                OooO.this.l();
                throw null;
            }
            OooO.this.l();
            int i7 = b + 67;
            a = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public OooO(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        int i2 = 2 % 2;
        int i3 = p;
        int i4 = (i3 ^ 115) + ((i3 & 115) << 1);
        q = i4 % 128;
        int i5 = i4 % 2;
        this.t.u(ColorStateList.valueOf(i));
        int i6 = p;
        int i7 = ((i6 | 61) << 1) - (i6 ^ 61);
        q = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public OooO(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        C0019p c0019p = new C0019p();
        this.t = c0019p;
        z zVar = new z(0.5f);
        t tVar = c0019p.e.d;
        Objects.requireNonNull(tVar);
        t.bfu bfuVar = new t.bfu(tVar);
        bfuVar.i = zVar;
        bfuVar.h = zVar;
        bfuVar.j = zVar;
        bfuVar.k = zVar;
        c0019p.e.d = bfuVar.e();
        c0019p.invalidateSelf();
        this.t.u(ColorStateList.valueOf(-1));
        C0019p c0019p2 = this.t;
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        T.aWX.s(this, c0019p2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.H, i, 0);
        this.r = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.s = new bfU();
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        int i = 2 % 2;
        int i2 = q;
        int i3 = ((i2 & 104) + (i2 | 104)) - 1;
        p = i3 % 128;
        if (i3 % 2 != 0) {
            super.onFinishInflate();
            l();
        } else {
            super.onFinishInflate();
            l();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0061  */
    /* JADX WARN: Code duplicated, block: B:9:0x002f A[PHI: r4
  0x002f: PHI (r4v2 android.os.Handler) = (r4v1 android.os.Handler), (r4v16 android.os.Handler) binds: [B:8:0x002d, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        Handler handler;
        int i;
        int i2 = 2 % 2;
        int i3 = q;
        int i4 = ((i3 | 68) << 1) - (i3 ^ 68);
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        p = i5 % 128;
        if (i5 % 2 == 0) {
            super.onViewRemoved(view);
            handler = getHandler();
            int i6 = 91 / 0;
            if (handler != null) {
                int i7 = q;
                int i8 = (i7 ^ 67) + ((i7 & 67) << 1);
                p = i8 % 128;
                int i9 = i8 % 2;
                handler.removeCallbacks(this.s);
                handler.post(this.s);
                int i10 = p;
                int i11 = i10 & 119;
                int i12 = (i10 | 119) & (~i11);
                int i13 = -(-(i11 << 1));
                i = (i12 ^ i13) + ((i12 & i13) << 1);
                q = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }
        } else {
            super.onViewRemoved(view);
            handler = getHandler();
            if (handler != null) {
                int i14 = q;
                int i15 = (i14 ^ 67) + ((i14 & 67) << 1);
                p = i15 % 128;
                int i16 = i15 % 2;
                handler.removeCallbacks(this.s);
                handler.post(this.s);
                int i17 = p;
                int i18 = i17 & 119;
                int i19 = (i17 | 119) & (~i18);
                int i110 = -(-(i18 << 1));
                i = (i19 ^ i110) + ((i19 & i110) << 1);
                q = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }
        }
        int i20 = p;
        int i21 = i20 ^ 27;
        int i22 = ((i20 & 27) | i21) << 1;
        int i23 = -i21;
        int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
        q = i24 % 128;
        int i25 = i24 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void l() {
        float f;
        int i;
        int i2 = 2 % 2;
        int i3 = p + 121;
        q = i3 % 128;
        int i4 = i3 % 2;
        int childCount = getChildCount();
        int i5 = q;
        int i6 = 1;
        int i7 = (i5 ^ 69) + ((i5 & 69) << 1);
        p = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 3 % 2;
        }
        int i9 = 0;
        int i10 = 0;
        int i11 = 1;
        while (true) {
            Object obj = null;
            if (i10 >= childCount) {
                b bVar = new b();
                bVar.d(this);
                int i12 = q;
                int i13 = (i12 ^ 117) + ((i12 & 117) << 1);
                p = i13 % 128;
                if (i13 % 2 == 0) {
                    f = 2.0f;
                    i = 1;
                } else {
                    f = 0.0f;
                    i = 0;
                }
                int i14 = i12 & 1;
                int i15 = (((i12 ^ 1) | i14) << 1) - ((i12 | 1) & (~i14));
                p = i15 % 128;
                int i16 = i15 % 2;
                while (i < childCount) {
                    int i17 = p;
                    int i18 = i17 & 75;
                    int i19 = 75 | i17;
                    int i20 = (i18 & i19) + (i19 | i18);
                    q = i20 % 128;
                    int i21 = i20 % 2;
                    View childAt = getChildAt(i);
                    int id = childAt.getId();
                    int i22 = q;
                    int i23 = i22 | 63;
                    int i24 = i23 << 1;
                    int i25 = -((~(i22 & 63)) & i23);
                    int i26 = ((i24 | i25) << i6) - (i25 ^ i24);
                    p = i26 % 128;
                    int i27 = i26 % 2;
                    if (id != R.id.circle_center) {
                        int i28 = i22 & 19;
                        int i29 = ((((i22 ^ 19) | i28) << i6) - (~(-((i22 | 19) & (~i28))))) - i6;
                        p = i29 % 128;
                        int i30 = i29 % 2;
                        if ("skip".equals(childAt.getTag())) {
                            int i31 = q;
                            int i32 = (i31 & (-106)) | ((~i31) & 105);
                            int i33 = -(-((i31 & 105) << i6));
                            int i34 = ((i32 | i33) << i6) - (i33 ^ i32);
                            p = i34 % 128;
                            if (i34 % 2 == 0) {
                                int i35 = 77 / i9;
                            }
                        } else {
                            int id2 = childAt.getId();
                            int i36 = this.r;
                            int i37 = q;
                            int i38 = (i37 & 121) + (i37 | 121);
                            p = i38 % 128;
                            if (i38 % 2 == 0) {
                                bVar.e.containsKey(Integer.valueOf(id2));
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            if (!bVar.e.containsKey(Integer.valueOf(id2))) {
                                HashMap<Integer, b.aJN> map = bVar.e;
                                Integer numValueOf = Integer.valueOf(id2);
                                b.aJN ajn = new b.aJN();
                                int i39 = q + 79;
                                p = i39 % 128;
                                int i40 = i39 % 2;
                                map.put(numValueOf, ajn);
                                int i41 = (-2) - ((p + 24) ^ (-1));
                                q = i41 % 128;
                                int i42 = i41 % 2;
                            }
                            b.aJN ajn2 = bVar.e.get(Integer.valueOf(id2));
                            int i43 = q + 125;
                            p = i43 % 128;
                            int i44 = i43 % 2;
                            b.aJO ajo = ajn2.d;
                            ajo.u = R.id.circle_center;
                            int i45 = q;
                            int i46 = (-2) - (((i45 ^ 104) + ((i45 & 104) << 1)) ^ (-1));
                            p = i46 % 128;
                            if (i46 % 2 == 0) {
                                ajo.A = i36;
                                ajo.z = f;
                                int i47 = 42 / 0;
                            } else {
                                ajo.A = i36;
                                ajo.z = f;
                            }
                            int i48 = p;
                            int i49 = ((i48 ^ 111) | (i48 & 111)) << 1;
                            int i50 = -((i48 & (-112)) | ((~i48) & 111));
                            int i51 = (i49 ^ i50) + ((i49 & i50) << 1);
                            q = i51 % 128;
                            int i52 = i51 % 2;
                            float f2 = (360.0f / ((childCount - (~(-(~(-i11))))) - 2)) + f;
                            int i53 = i48 + 27;
                            q = i53 % 128;
                            int i54 = i53 % 2;
                            f = f2;
                        }
                    }
                    i = (((i | 2) << 1) - (i ^ 2)) - 1;
                    int i55 = q;
                    int i56 = (i55 | 27) << 1;
                    int i57 = -(((~i55) & 27) | (i55 & (-28)));
                    int i58 = (i56 & i57) + (i57 | i56);
                    p = i58 % 128;
                    int i59 = i58 % 2;
                    i9 = 0;
                    i6 = 1;
                }
                boolean z = i6;
                bVar.c(this, z);
                setConstraintSet(null);
                int i60 = q;
                int i61 = (i60 & (-76)) | ((~i60) & 75);
                int i62 = (i60 & 75) << (z ? 1 : 0);
                int i63 = (i61 & i62) + (i62 | i61);
                p = i63 % 128;
                if (i63 % 2 != 0) {
                    requestLayout();
                    return;
                } else {
                    requestLayout();
                    int i64 = 20 / 0;
                    return;
                }
            }
            int i65 = q;
            int i66 = (i65 ^ 57) + ((i65 & 57) << 1);
            p = i66 % 128;
            if (i66 % 2 == 0) {
                getChildAt(i10);
                obj.hashCode();
                throw null;
            }
            if (!(!"skip".equals(getChildAt(i10).getTag()))) {
                int i67 = p + 59;
                int i68 = i67 % 128;
                q = i68;
                if (i67 % 2 == 0) {
                    i11++;
                }
                int i69 = (i68 & 78) + (i68 | 78);
                int i70 = (i69 ^ (-1)) + (i69 << 1);
                p = i70 % 128;
                int i71 = i70 % 2;
            }
            i10 = ((i10 & 1) << 1) + (i10 ^ 1);
            int i72 = q;
            int i73 = i72 & 35;
            int i74 = (i72 ^ 35) | i73;
            int i75 = ((i73 | i74) << 1) - (i74 ^ i73);
            p = i75 % 128;
            int i76 = i75 % 2;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int i2 = 2 % 2;
        int i3 = p;
        int i4 = i3 & 33;
        int i5 = (i3 | 33) & (~i4);
        int i6 = -(-(i4 << 1));
        int i7 = (i5 & i6) + (i5 | i6);
        q = i7 % 128;
        int i8 = i7 % 2;
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            int i9 = q;
            int i10 = i9 & 117;
            int i11 = (i10 - (~(-(-((i9 ^ 117) | i10))))) - 1;
            p = i11 % 128;
            int i12 = i11 % 2;
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
            view.setId(T.aWY.c());
            int i13 = p;
            int i14 = (i13 & (-114)) | ((~i13) & 113);
            int i15 = -(-((i13 & 113) << 1));
            int i16 = (i14 & i15) + (i15 | i14);
            q = i16 % 128;
            int i17 = i16 % 2;
        }
        Handler handler = getHandler();
        if (handler != null) {
            int i18 = p;
            int i19 = ((i18 ^ 105) - (~((i18 & 105) << 1))) - 1;
            q = i19 % 128;
            int i20 = i19 % 2;
            handler.removeCallbacks(this.s);
            handler.post(this.s);
            int i21 = q + 93;
            int i22 = i21 % 128;
            p = i22;
            if (i21 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i23 = (-2) - ((i22 + 92) ^ (-1));
            q = i23 % 128;
            int i24 = i23 % 2;
        }
        int i25 = q + 104;
        int i26 = (i25 ^ (-1)) + (i25 << 1);
        p = i26 % 128;
        int i27 = i26 % 2;
    }
}
