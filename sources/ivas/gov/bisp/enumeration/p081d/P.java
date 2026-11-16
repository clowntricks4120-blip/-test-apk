package ivas.gov.bisp.enumeration.p081d;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public class P {
    private static int a = 1;
    private static int b;
    public ViewParent c;
    public ViewParent d;
    public final View e;
    public boolean f;
    public int[] g;

    public P(View view) {
        this.e = view;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a5  */
    public boolean d(float f, float f2, boolean z) {
        boolean zOnNestedFling;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 21;
        int i4 = ((i2 & 21) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        int i7 = i6 % 128;
        b = i7;
        if (i6 % 2 == 0 ? !this.f : (!this.f)) {
            zOnNestedFling = false;
        } else {
            int i8 = i7 & 105;
            int i9 = ((i7 | 105) & (~i8)) + (i8 << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            ViewParent viewParentJ = j(0);
            if (viewParentJ != null) {
                int i11 = b;
                int i12 = i11 & 93;
                int i13 = ((i11 ^ 93) | i12) << 1;
                int i14 = -((i11 | 93) & (~i12));
                int i15 = (i13 & i14) + (i14 | i13);
                a = i15 % 128;
                try {
                    if (i15 % 2 == 0) {
                        viewParentJ.onNestedFling(this.e, f, f2, z);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    zOnNestedFling = viewParentJ.onNestedFling(this.e, f, f2, z);
                    int i16 = a;
                    int i17 = (i16 & (-16)) | ((~i16) & 15);
                    int i18 = (i16 & 15) << 1;
                    int i19 = (i17 & i18) + (i18 | i17);
                    int i20 = i19 % 128;
                    b = i20;
                    int i21 = i19 % 2;
                    int i22 = i20 ^ 9;
                    int i23 = (i20 & 9) << 1;
                    int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                    a = i24 % 128;
                    if (i24 % 2 == 0) {
                        int i25 = 2 / 2;
                    }
                } catch (AbstractMethodError e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ViewParent ");
                    sb.append(viewParentJ);
                    sb.append(" does not implement interface method onNestedFling");
                    Log.e("ViewParentCompat", sb.toString(), e);
                    zOnNestedFling = false;
                }
            } else {
                zOnNestedFling = false;
            }
        }
        int i26 = a + 54;
        int i27 = (i26 ^ (-1)) + (i26 << 1);
        b = i27 % 128;
        if (i27 % 2 != 0) {
            int i28 = 61 / 0;
        }
        return zOnNestedFling;
    }

    public void g(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        int i6 = 2 % 2;
        int i7 = a;
        int i8 = i7 & 47;
        int i9 = (~i8) & (i7 | 47);
        int i10 = -(-(i8 << 1));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        b = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        int i12 = ((i7 & 88) + (i7 | 88)) - 1;
        b = i12 % 128;
        if (i12 % 2 == 0) {
            h(i, i2, i3, i4, null, i5, iArr2);
        } else {
            h(i, i2, i3, i4, null, i5, iArr2);
            throw null;
        }
    }

    public boolean i(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = 2 % 2;
        int i6 = a;
        int i7 = i6 | 81;
        int i8 = (i7 << 1) - ((~(i6 & 81)) & i7);
        b = i8 % 128;
        int i9 = i8 % 2;
        boolean zH = h(i, i2, i3, i4, iArr, 0, null);
        int i10 = b + 54;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        a = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 23 / 0;
        }
        return zH;
    }

    public boolean k(int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = a + 51;
        b = i3 % 128;
        int i4 = i3 % 2;
        if (j(i) != null) {
            int i5 = b;
            int i6 = ((i5 | 9) << 1) - (i5 ^ 9);
            a = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 & 33;
            int i9 = ((i5 ^ 33) | i8) << 1;
            int i10 = -((i5 | 33) & (~i8));
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            a = i11 % 128;
            int i12 = i11 % 2;
            z = true;
        } else {
            int i13 = a + 3;
            b = i13 % 128;
            int i14 = i13 % 2;
            z = false;
        }
        int i15 = b;
        int i16 = (i15 | 111) << 1;
        int i17 = -(((~i15) & 111) | (i15 & (-112)));
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        a = i18 % 128;
        int i19 = i18 % 2;
        return z;
    }

    public final ViewParent j(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 67;
        int i5 = (i3 | 67) & (~i4);
        int i6 = -(-(i4 << 1));
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        int i8 = i7 % 128;
        a = i8;
        int i9 = i7 % 2;
        if (i == 0) {
            ViewParent viewParent = this.c;
            int i10 = (((i8 | 107) << 1) - (~(-(((~i8) & 107) | (i8 & (-108)))))) - 1;
            b = i10 % 128;
            if (i10 % 2 == 0) {
                return viewParent;
            }
            throw null;
        }
        int i11 = ((i8 ^ 110) + ((i8 & 110) << 1)) - 1;
        int i12 = i11 % 128;
        b = i12;
        int i13 = i11 % 2;
        if (i == 1) {
            ViewParent viewParent2 = this.d;
            int i14 = ((i12 ^ 123) | (i12 & 123)) << 1;
            int i15 = -(((~i12) & 123) | (i12 & (-124)));
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            a = i16 % 128;
            int i17 = i16 % 2;
            return viewParent2;
        }
        int i18 = ((i12 ^ 23) | (i12 & 23)) << 1;
        int i19 = -((i12 & (-24)) | ((~i12) & 23));
        int i20 = (i18 & i19) + (i18 | i19);
        a = i20 % 128;
        int i21 = i20 % 2;
        int i22 = (i12 ^ 31) + ((i12 & 31) << 1);
        a = i22 % 128;
        int i23 = i22 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0088 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0089  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    public boolean e(float f, float f2) {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 112) + (i3 | 112);
        boolean zOnNestedPreFling = true;
        int i5 = i4 - 1;
        a = i5 % 128;
        if (i5 % 2 == 0) {
            if (this.f) {
            }
            int i6 = b;
            int i7 = i6 & 13;
            i = i7 + ((i6 ^ 13) | i7);
            a = i % 128;
            if (i % 2 != 0) {
                return zOnNestedPreFling;
            }
            throw null;
        }
        if (!this.f) {
            zOnNestedPreFling = false;
        }
        int i8 = b;
        int i9 = i8 & 13;
        i = i9 + ((i8 ^ 13) | i9);
        a = i % 128;
        if (i % 2 != 0) {
            return zOnNestedPreFling;
        }
        throw null;
        ViewParent viewParentJ = j(0);
        if (viewParentJ != null) {
            int i10 = b;
            int i11 = i10 & 43;
            int i12 = ((((i10 ^ 43) | i11) << 1) - (~(-((i10 | 43) & (~i11))))) - 1;
            a = i12 % 128;
            int i13 = i12 % 2;
            try {
                try {
                    zOnNestedPreFling = viewParentJ.onNestedPreFling(this.e, f, f2);
                    int i14 = a + 39;
                    int i15 = i14 % 128;
                    b = i15;
                    if (i14 % 2 != 0) {
                        int i16 = 47 / 0;
                    }
                    int i17 = i15 + 57;
                    a = i17 % 128;
                    int i18 = i17 % 2;
                } catch (RuntimeException e) {
                    throw e;
                }
            } catch (AbstractMethodError e2) {
                StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParentJ);
                sb.append(" does not implement interface method onNestedPreFling");
                Log.e("ViewParentCompat", sb.toString(), e2);
                zOnNestedPreFling = false;
            }
        } else {
            zOnNestedPreFling = false;
        }
        int i19 = b;
        int i20 = i19 & 13;
        i = i20 + ((i19 ^ 13) | i20);
        a = i % 128;
        if (i % 2 != 0) {
            return zOnNestedPreFling;
        }
        throw null;
    }

    public boolean c(int i, int i2) {
        boolean zOnStartNestedScroll;
        int i3 = 2 % 2;
        int i4 = a + 111;
        b = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            j(i2);
            obj.hashCode();
            throw null;
        }
        if (j(i2) != null) {
            int i5 = a;
            int i6 = (i5 & 123) + (i5 | 123);
            int i7 = i6 % 128;
            b = i7;
            int i8 = i6 % 2;
            int i9 = i7 & 69;
            int i10 = i9 + ((i7 ^ 69) | i9);
            a = i10 % 128;
            int i11 = i10 % 2;
            int i12 = i7 & 23;
            int i13 = ((i7 ^ 23) | i12) << 1;
            int i14 = -((i7 | 23) & (~i12));
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            a = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 61 / 0;
            }
            return true;
        }
        int i17 = b;
        int i18 = i17 & 5;
        int i19 = -(-((i17 ^ 5) | i18));
        int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
        int i21 = i20 % 128;
        a = i21;
        int i22 = i20 % 2;
        if (this.f) {
            int i23 = i21 & 17;
            int i24 = ((i21 ^ 17) | i23) << 1;
            int i25 = -((i21 | 17) & (~i23));
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            b = i26 % 128;
            int i27 = i26 % 2;
            ViewParent parent = this.e.getParent();
            View view = this.e;
            int i28 = b;
            int i29 = i28 & 107;
            int i30 = i29 + ((i28 ^ 107) | i29);
            a = i30 % 128;
            if (i30 % 2 == 0) {
                int i31 = 70 / 0;
            }
            View view2 = view;
            ViewParent parent2 = parent;
            while (parent2 != null) {
                int i32 = a;
                int i33 = i32 | 123;
                int i34 = ((i33 << 1) - (~(-((~(i32 & 123)) & i33)))) - 1;
                int i35 = i34 % 128;
                b = i35;
                if (i34 % 2 != 0) {
                    boolean z = parent2 instanceof InterfaceC0289t;
                    obj.hashCode();
                    throw null;
                }
                View view3 = this.e;
                boolean z2 = parent2 instanceof InterfaceC0289t;
                if (z2) {
                    int i36 = i35 & 3;
                    int i37 = -(-((i35 ^ 3) | i36));
                    int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
                    a = i38 % 128;
                    if (i38 % 2 == 0) {
                        ((InterfaceC0289t) parent2).j(view2, view3, i, i2);
                        throw null;
                    }
                    zOnStartNestedScroll = ((InterfaceC0289t) parent2).j(view2, view3, i, i2);
                    int i39 = b;
                    int i40 = ((i39 & 24) + (i39 | 24)) - 1;
                    int i41 = i40 % 128;
                    a = i41;
                    int i42 = i40 % 2;
                    int i43 = ((i41 | 55) << 1) - (i41 ^ 55);
                    b = i43 % 128;
                    int i44 = i43 % 2;
                } else if (i2 == 0) {
                    int i45 = ((i35 | 120) << 1) - (i35 ^ 120);
                    int i46 = (i45 ^ (-1)) + (i45 << 1);
                    a = i46 % 128;
                    if (i46 % 2 == 0) {
                        parent2.onStartNestedScroll(view2, view3, i);
                        obj.hashCode();
                        throw null;
                    }
                    try {
                        zOnStartNestedScroll = parent2.onStartNestedScroll(view2, view3, i);
                        int i47 = a + 69;
                        b = i47 % 128;
                        int i48 = i47 % 2;
                    } catch (AbstractMethodError e) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("ViewParent ");
                        sb.append(parent2);
                        sb.append(" does not implement interface method onStartNestedScroll");
                        Log.e("ViewParentCompat", sb.toString(), e);
                        int i49 = b;
                        int i50 = (i49 & (-50)) | (49 & (~i49));
                        int i51 = -(-((i49 & 49) << 1));
                        int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
                        a = i52 % 128;
                        int i53 = i52 % 2;
                        zOnStartNestedScroll = false;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("ViewParent ");
                    sb2.append(parent2);
                    sb2.append(" does not implement interface method onStartNestedScroll");
                    Log.e("ViewParentCompat", sb2.toString(), e);
                    int i410 = b;
                    int i54 = (i410 & (-50)) | (49 & (~i410));
                    int i55 = -(-((i410 & 49) << 1));
                    int i56 = (i54 ^ i55) + ((i55 & i54) << 1);
                    a = i56 % 128;
                    int i57 = i56 % 2;
                    zOnStartNestedScroll = false;
                } else {
                    int i411 = b;
                    int i58 = (i411 & (-50)) | (49 & (~i411));
                    int i59 = -(-((i411 & 49) << 1));
                    int i510 = (i58 ^ i59) + ((i59 & i58) << 1);
                    a = i510 % 128;
                    int i511 = i510 % 2;
                    zOnStartNestedScroll = false;
                }
                if (!(!zOnStartNestedScroll)) {
                    int i60 = b;
                    int i61 = i60 & 121;
                    int i62 = (i61 - (~(-(-((i60 ^ 121) | i61))))) - 1;
                    a = i62 % 128;
                    int i63 = i62 % 2;
                    if (i2 != 0) {
                        int i64 = i60 & 95;
                        int i65 = (i64 - (~(-(-((i60 ^ 95) | i64))))) - 1;
                        int i66 = i65 % 128;
                        a = i66;
                        if (i65 % 2 != 0 ? i2 == 1 : i2 == 1) {
                            this.d = parent2;
                            int i67 = ((i66 | 21) << 1) - ((21 & (~i66)) | (i66 & (-22)));
                            b = i67 % 128;
                            int i68 = i67 % 2;
                        }
                    } else {
                        this.c = parent2;
                        int i69 = i60 + 123;
                        a = i69 % 128;
                        int i70 = i69 % 2;
                    }
                    View view4 = this.e;
                    if (z2) {
                        int i71 = a;
                        int i72 = ((i71 & (-92)) | ((~i71) & 91)) + ((91 & i71) << 1);
                        b = i72 % 128;
                        if (i72 % 2 != 0) {
                            ((InterfaceC0289t) parent2).n(view2, view4, i, i2);
                            obj.hashCode();
                            throw null;
                        }
                        ((InterfaceC0289t) parent2).n(view2, view4, i, i2);
                        int i73 = b;
                        int i74 = (i73 & (-36)) | ((~i73) & 35);
                        int i75 = (i73 & 35) << 1;
                        int i76 = (i74 ^ i75) + ((i75 & i74) << 1);
                        a = i76 % 128;
                        int i77 = i76 % 2;
                    } else if (i2 == 0) {
                        int i78 = a;
                        int i79 = (i78 & 47) + (i78 | 47);
                        b = i79 % 128;
                        int i80 = i79 % 2;
                        try {
                            parent2.onNestedScrollAccepted(view2, view4, i);
                            int i81 = a + 43;
                            b = i81 % 128;
                            if (i81 % 2 != 0) {
                                int i82 = 4 % 5;
                            }
                        } catch (AbstractMethodError e2) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("ViewParent ");
                            sb3.append(parent2);
                            sb3.append(" does not implement interface method onNestedScrollAccepted");
                            Log.e("ViewParentCompat", sb3.toString(), e2);
                        }
                    }
                    int i83 = b;
                    int i84 = i83 | 89;
                    int i85 = (i84 << 1) - ((~(i83 & 89)) & i84);
                    a = i85 % 128;
                    if (i85 % 2 == 0) {
                        int i86 = 79 / 0;
                    }
                    return true;
                }
                if (parent2 instanceof View) {
                    int i87 = b;
                    int i88 = (i87 ^ 111) + ((i87 & 111) << 1);
                    int i89 = i88 % 128;
                    a = i89;
                    int i90 = i88 % 2;
                    view2 = (View) parent2;
                    int i91 = i89 + 51;
                    b = i91 % 128;
                    int i92 = i91 % 2;
                }
                parent2 = parent2.getParent();
                int i93 = a + 29;
                b = i93 % 128;
                int i94 = i93 % 2;
            }
        }
        int i95 = b;
        int i96 = (i95 & (-92)) | ((~i95) & 91);
        int i97 = -(-((i95 & 91) << 1));
        int i98 = (i96 & i97) + (i97 | i96);
        a = i98 % 128;
        if (i98 % 2 != 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:54:0x0202  */
    /* JADX WARN: Code duplicated, block: B:57:0x0222  */
    /* JADX WARN: Code duplicated, block: B:66:0x0251  */
    /* JADX WARN: Code duplicated, block: B:67:0x0253  */
    /* JADX WARN: Code duplicated, block: B:69:0x026b  */
    /* JADX WARN: Code duplicated, block: B:77:0x02e0  */
    public final boolean h(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        int i6;
        int i7;
        int[] iArr3;
        int i8;
        int i9;
        InterfaceC0289t interfaceC0289t;
        int i10;
        int i11 = i5;
        int i12 = 2 % 2;
        int i13 = a;
        int i14 = i13 + 41;
        b = i14 % 128;
        int i15 = i14 % 2;
        if (!(!this.f)) {
            int i16 = i13 & 51;
            int i17 = (i13 ^ 51) | i16;
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            b = i18 % 128;
            int i19 = i18 % 2;
            ViewParent viewParentJ = j(i11);
            if (viewParentJ == null) {
                int i20 = a;
                int i21 = i20 & 85;
                int i22 = (~i21) & (i20 | 85);
                int i23 = i21 << 1;
                int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                b = i24 % 128;
                int i25 = i24 % 2;
                int i26 = ((i20 ^ 110) + ((i20 & 110) << 1)) - 1;
                b = i26 % 128;
                int i27 = i26 % 2;
                return false;
            }
            Object obj = null;
            if (i == 0) {
                int i28 = a;
                int i29 = i28 & 107;
                int i30 = (i28 ^ 107) | i29;
                int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
                int i32 = i31 % 128;
                b = i32;
                if (i31 % 2 != 0) {
                    throw null;
                }
                if (i2 == 0) {
                    int i33 = (i32 & 13) + (i32 | 13);
                    int i34 = i33 % 128;
                    a = i34;
                    int i35 = i33 % 2;
                    if (i3 == 0) {
                        int i36 = i34 + 71;
                        int i37 = i36 % 128;
                        b = i37;
                        int i38 = i36 % 2;
                        if (i4 == 0) {
                            int i39 = ((i37 | 43) << 1) - (i37 ^ 43);
                            a = i39 % 128;
                            int i40 = i39 % 2;
                            if (iArr != null) {
                                int i41 = ((i37 | 73) << 1) - (i37 ^ 73);
                                a = i41 % 128;
                                int i42 = i41 % 2;
                                iArr[0] = 0;
                                iArr[1] = 0;
                                int i43 = (i37 & 45) + (i37 | 45);
                                a = i43 % 128;
                                int i44 = i43 % 2;
                            }
                        }
                    }
                }
            }
            if (iArr != null) {
                int i45 = a;
                int i46 = ((i45 | 37) << 1) - (i45 ^ 37);
                b = i46 % 128;
                int i47 = i46 % 2;
                this.e.getLocationInWindow(iArr);
                int i48 = iArr[0];
                int i49 = a;
                int i50 = (i49 & (-90)) | ((~i49) & 89);
                int i51 = -(-((i49 & 89) << 1));
                int i52 = (i50 ^ i51) + ((i50 & i51) << 1);
                b = i52 % 128;
                int i53 = i52 % 2 != 0 ? iArr[1] : iArr[1];
                int i54 = (i49 & (-24)) | ((~i49) & 23);
                int i55 = (i49 & 23) << 1;
                int i56 = ((i54 | i55) << 1) - (i55 ^ i54);
                b = i56 % 128;
                int i57 = i56 % 2;
                i7 = i48;
                i6 = i53;
            } else {
                int i58 = b;
                int i59 = (i58 ^ 90) + ((i58 & 90) << 1);
                int i60 = (i59 ^ (-1)) + (i59 << 1);
                a = i60 % 128;
                int i61 = i60 % 2;
                i6 = 0;
                i7 = 0;
            }
            if (iArr2 == null) {
                int i62 = b;
                int i63 = ((i62 ^ 27) | (i62 & 27)) << 1;
                int i64 = -(((~i62) & 27) | (i62 & (-28)));
                int i65 = (i63 ^ i64) + ((i64 & i63) << 1);
                int i66 = i65 % 128;
                a = i66;
                int i67 = i65 % 2;
                if (this.g == null) {
                    int i68 = i66 & 23;
                    int i69 = (i66 ^ 23) | i68;
                    int i70 = (i68 & i69) + (i68 | i69);
                    b = i70 % 128;
                    if (i70 % 2 != 0) {
                        this.g = new int[4];
                    } else {
                        this.g = new int[2];
                    }
                }
                int[] iArr4 = this.g;
                iArr4[0] = 0;
                iArr4[1] = 0;
                int i71 = (i66 ^ 58) + ((i66 & 58) << 1);
                int i72 = (i71 ^ (-1)) + (i71 << 1);
                b = i72 % 128;
                int i73 = i72 % 2;
                iArr3 = iArr4;
            } else {
                iArr3 = iArr2;
            }
            View view = this.e;
            if (viewParentJ instanceof u) {
                int i74 = a;
                int i75 = i74 ^ 1;
                int i76 = (((i74 & 1) | i75) << 1) - i75;
                b = i76 % 128;
                int i77 = i76 % 2;
                u uVar = (u) viewParentJ;
                int i78 = ((i74 | 1) << 1) - (i74 ^ 1);
                b = i78 % 128;
                if (i78 % 2 != 0) {
                    uVar.r(view, i, i2, i3, i4, i5, iArr3);
                    int i79 = 3 / 0;
                } else {
                    uVar.r(view, i, i2, i3, i4, i5, iArr3);
                }
                i8 = i6;
            } else {
                int i80 = iArr3[0];
                int i81 = -(~i3);
                iArr3[0] = ((i80 ^ i81) + ((i80 & i81) << 1)) - 1;
                int i82 = a;
                int i83 = (i82 | 55) << 1;
                int i84 = -((i82 & (-56)) | (55 & (~i82)));
                int i85 = (i83 & i84) + (i83 | i84);
                int i86 = i85 % 128;
                b = i86;
                if (i85 % 2 != 0) {
                    iArr3[1] = iArr3[1] >> i4;
                    if (!(!(viewParentJ instanceof InterfaceC0289t))) {
                        interfaceC0289t = (InterfaceC0289t) viewParentJ;
                        i10 = (((i86 & (-88)) | ((~i86) & 87)) - (~(-(-((i86 & 87) << 1))))) - 1;
                        a = i10 % 128;
                        if (i10 % 2 != 0) {
                            interfaceC0289t.q(view, i, i2, i3, i4, i5);
                            obj.hashCode();
                            throw null;
                        }
                        i8 = i6;
                        interfaceC0289t.q(view, i, i2, i3, i4, i5);
                        int i87 = a;
                        int i88 = i87 & 41;
                        int i89 = -(-((i87 ^ 41) | i88));
                        int i90 = ((i88 | i89) << 1) - (i89 ^ i88);
                        b = i90 % 128;
                        int i91 = i90 % 2;
                    } else if (i11 == 0) {
                        int i92 = ((i82 ^ 1) | (i82 & 1)) << 1;
                        int i93 = -(((~i82) & 1) | (i82 & (-2)));
                        i9 = (i92 ^ i93) + ((i93 & i92) << 1);
                        b = i9 % 128;
                        try {
                            if (i9 % 2 == 0) {
                                viewParentJ.onNestedScroll(view, i, i2, i3, i4);
                                throw null;
                            }
                            i11 = i6;
                            viewParentJ.onNestedScroll(view, i, i2, i3, i4);
                            int i94 = b;
                            int i95 = i94 & 119;
                            int i96 = -(-((i94 ^ 119) | i95));
                            int i97 = (i95 & i96) + (i96 | i95);
                            a = i97 % 128;
                            int i98 = i97 % 2;
                            i8 = i11;
                        } catch (AbstractMethodError e) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("ViewParent ");
                            sb.append(viewParentJ);
                            sb.append(" does not implement interface method onNestedScroll");
                            Log.e("ViewParentCompat", sb.toString(), e);
                        }
                    } else {
                        i8 = i6;
                    }
                } else {
                    int i99 = iArr3[1];
                    int i100 = i99 ^ i4;
                    int i101 = -(-((i99 & i4) << 1));
                    iArr3[1] = (i100 & i101) + (i101 | i100);
                    if (!(!(viewParentJ instanceof InterfaceC0289t))) {
                        interfaceC0289t = (InterfaceC0289t) viewParentJ;
                        i10 = (((i86 & (-88)) | ((~i86) & 87)) - (~(-(-((i86 & 87) << 1))))) - 1;
                        a = i10 % 128;
                        if (i10 % 2 != 0) {
                            interfaceC0289t.q(view, i, i2, i3, i4, i5);
                            obj.hashCode();
                            throw null;
                        }
                        i8 = i6;
                        interfaceC0289t.q(view, i, i2, i3, i4, i5);
                        int i810 = a;
                        int i811 = i810 & 41;
                        int i812 = -(-((i810 ^ 41) | i811));
                        int i910 = ((i811 | i812) << 1) - (i812 ^ i811);
                        b = i910 % 128;
                        int i911 = i910 % 2;
                    } else if (i11 == 0) {
                        int i912 = ((i82 ^ 1) | (i82 & 1)) << 1;
                        int i913 = -(((~i82) & 1) | (i82 & (-2)));
                        i9 = (i912 ^ i913) + ((i913 & i912) << 1);
                        b = i9 % 128;
                        if (i9 % 2 == 0) {
                            viewParentJ.onNestedScroll(view, i, i2, i3, i4);
                            throw null;
                        }
                        i11 = i6;
                        viewParentJ.onNestedScroll(view, i, i2, i3, i4);
                        int i914 = b;
                        int i915 = i914 & 119;
                        int i916 = -(-((i914 ^ 119) | i915));
                        int i917 = (i915 & i916) + (i916 | i915);
                        a = i917 % 128;
                        int i918 = i917 % 2;
                        i8 = i11;
                    } else {
                        i8 = i6;
                    }
                }
            }
            if (iArr != null) {
                int i102 = b;
                int i103 = ((i102 | 73) << 1) - (i102 ^ 73);
                a = i103 % 128;
                int i104 = i103 % 2;
                this.e.getLocationInWindow(iArr);
                int i105 = b + 35;
                int i106 = i105 % 128;
                a = i106;
                int i107 = i105 % 2;
                iArr[0] = (-2) - ((iArr[0] - (~(-i7))) ^ (-1));
                int i108 = iArr[1];
                int i109 = i106 + 99;
                b = i109 % 128;
                if (i109 % 2 != 0) {
                    iArr[1] = i108 << i8;
                } else {
                    int i110 = -i8;
                    int i111 = ((~i110) & i108) | ((~i108) & i110);
                    int i112 = (i108 & i110) << 1;
                    iArr[1] = (i111 ^ i112) + ((i112 & i111) << 1);
                }
            }
            int i113 = a;
            int i114 = (i113 ^ 89) + ((i113 & 89) << 1);
            b = i114 % 128;
            int i115 = i114 % 2;
            return true;
        }
        int i116 = b;
        int i117 = i116 & 101;
        int i118 = ((((i116 ^ 101) | i117) << 1) - (~(-((i116 | 101) & (~i117))))) - 1;
        a = i118 % 128;
        int i119 = i118 % 2;
        return false;
    }

    public void l(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 13;
        int i5 = (i3 | 13) & (~i4);
        int i6 = i4 << 1;
        int i7 = (i5 & i6) + (i5 | i6);
        a = i7 % 128;
        Object obj = null;
        if (i7 % 2 == 0) {
            j(i);
            throw null;
        }
        ViewParent viewParentJ = j(i);
        if (viewParentJ != null) {
            View view = this.e;
            if (viewParentJ instanceof InterfaceC0289t) {
                int i8 = b;
                int i9 = ((i8 & 66) + (i8 | 66)) - 1;
                a = i9 % 128;
                if (i9 % 2 == 0) {
                    ((InterfaceC0289t) viewParentJ).h(view, i);
                    int i10 = 34 / 0;
                } else {
                    ((InterfaceC0289t) viewParentJ).h(view, i);
                }
            } else if (i == 0) {
                int i11 = b;
                int i12 = i11 ^ 19;
                int i13 = -(-((i11 & 19) << 1));
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                a = i14 % 128;
                try {
                    if (i14 % 2 == 0) {
                        viewParentJ.onStopNestedScroll(view);
                        throw null;
                    }
                    viewParentJ.onStopNestedScroll(view);
                    int i15 = a + 13;
                    b = i15 % 128;
                    int i16 = i15 % 2;
                } catch (AbstractMethodError e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ViewParent ");
                    sb.append(viewParentJ);
                    sb.append(" does not implement interface method onStopNestedScroll");
                    Log.e("ViewParentCompat", sb.toString(), e);
                }
            }
            if (i != 0) {
                int i17 = a;
                int i18 = i17 & 27;
                int i19 = (((i17 ^ 27) | i18) << 1) - ((i17 | 27) & (~i18));
                int i20 = i19 % 128;
                b = i20;
                int i21 = i19 % 2;
                if (i == 1) {
                    int i22 = i20 + 31;
                    a = i22 % 128;
                    int i23 = i22 % 2;
                    this.d = null;
                    if (i23 != 0) {
                        return;
                    }
                    obj.hashCode();
                    throw null;
                }
            } else {
                this.c = null;
                int i24 = b + 57;
                a = i24 % 128;
                int i25 = i24 % 2;
            }
        }
        int i26 = b;
        int i27 = i26 & 79;
        int i28 = (i27 - (~((i26 ^ 79) | i27))) - 1;
        a = i28 % 128;
        int i29 = i28 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x007e  */
    /* JADX WARN: Code duplicated, block: B:25:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00de  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:35:0x0104  */
    /* JADX WARN: Code duplicated, block: B:37:0x0108  */
    /* JADX WARN: Code duplicated, block: B:39:0x0126  */
    /* JADX WARN: Code duplicated, block: B:41:0x012a  */
    /* JADX WARN: Code duplicated, block: B:44:0x013d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0141  */
    /* JADX WARN: Code duplicated, block: B:47:0x0168 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x016a  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:56:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:57:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:61:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:65:0x020a  */
    /* JADX WARN: Code duplicated, block: B:66:0x020d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    public boolean f(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        int i4;
        int i5;
        int[] iArr3;
        View view;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = 2 % 2;
        int i14 = a;
        boolean z = true;
        int i15 = (-2) - ((((i14 | 44) << 1) - (i14 ^ 44)) ^ (-1));
        b = i15 % 128;
        if (i15 % 2 == 0 ? (!this.f) : !this.f) {
            z = false;
        } else {
            ViewParent viewParentJ = j(i3);
            Object obj = null;
            if (viewParentJ == null) {
                int i16 = a;
                int i17 = i16 & 99;
                int i18 = (i16 | 99) & (~i17);
                int i19 = i17 << 1;
                int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
                int i21 = i20 % 128;
                b = i21;
                int i22 = i20 % 2;
                int i23 = i21 & 57;
                int i24 = (i21 ^ 57) | i23;
                int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                a = i25 % 128;
                if (i25 % 2 != 0) {
                    return false;
                }
                throw null;
            }
            if (i == 0) {
                int i26 = b;
                int i27 = (i26 & (-70)) | ((~i26) & 69);
                int i28 = (i26 & 69) << 1;
                int i29 = (i27 & i28) + (i27 | i28);
                a = i29 % 128;
                if (i29 % 2 == 0) {
                    int i30 = 70 / 0;
                    if (i2 != 0) {
                        if (iArr2 != null) {
                            int i31 = b;
                            int i32 = i31 & 51;
                            int i33 = -(-((i31 ^ 51) | i32));
                            i12 = (i32 & i33) + (i33 | i32);
                            a = i12 % 128;
                            if (i12 % 2 == 0) {
                                this.e.getLocationInWindow(iArr2);
                                obj.hashCode();
                                throw null;
                            }
                            this.e.getLocationInWindow(iArr2);
                            int i34 = iArr2[0];
                            int i35 = iArr2[1];
                            int i36 = b;
                            int i37 = (((i36 | 65) << 1) - (~(-(((~i36) & 65) | (i36 & (-66)))))) - 1;
                            a = i37 % 128;
                            int i38 = i37 % 2;
                            i4 = i34;
                            i5 = i35;
                        } else {
                            int i39 = a;
                            int i40 = i39 & 65;
                            int i41 = (((i39 | 65) & (~i40)) - (~(-(-(i40 << 1))))) - 1;
                            b = i41 % 128;
                            int i42 = i41 % 2;
                            i4 = 0;
                            i5 = 0;
                        }
                        if (iArr == null) {
                            int i43 = b;
                            i10 = ((i43 | 87) << 1) - (i43 ^ 87);
                            i11 = i10 % 128;
                            a = i11;
                            if (i10 % 2 == 0) {
                                obj.hashCode();
                                throw null;
                            }
                            if (this.g == null) {
                                this.g = new int[2];
                                int i44 = (i11 ^ 27) + ((i11 & 27) << 1);
                                b = i44 % 128;
                                int i45 = i44 % 2;
                            }
                            int[] iArr4 = this.g;
                            int i46 = ((i11 | 7) << 1) - (i11 ^ 7);
                            b = i46 % 128;
                            int i47 = i46 % 2;
                            iArr3 = iArr4;
                        } else {
                            iArr3 = iArr;
                        }
                        iArr3[0] = 0;
                        iArr3[1] = 0;
                        view = this.e;
                        i6 = b;
                        i7 = i6 + 77;
                        a = i7 % 128;
                        if (i7 % 2 == 0) {
                            boolean z2 = viewParentJ instanceof InterfaceC0289t;
                            throw null;
                        }
                        if (viewParentJ instanceof InterfaceC0289t) {
                            ((InterfaceC0289t) viewParentJ).o(view, i, i2, iArr3, i3);
                            int i48 = b;
                            int i49 = ((i48 ^ 77) | (i48 & 77)) << 1;
                            int i50 = -(((~i48) & 77) | (i48 & (-78)));
                            int i51 = (i49 ^ i50) + ((i50 & i49) << 1);
                            a = i51 % 128;
                            int i52 = i51 % 2;
                        } else if (i3 == 0) {
                            int i53 = i6 & 33;
                            int i54 = i53 + ((i6 ^ 33) | i53);
                            a = i54 % 128;
                            int i55 = i54 % 2;
                            try {
                                viewParentJ.onNestedPreScroll(view, i, i2, iArr3);
                                int i56 = b + 69;
                                a = i56 % 128;
                                int i57 = i56 % 2;
                            } catch (AbstractMethodError e) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("ViewParent ");
                                sb.append(viewParentJ);
                                sb.append(" does not implement interface method onNestedPreScroll");
                                Log.e("ViewParentCompat", sb.toString(), e);
                            }
                        }
                        if (iArr2 != null) {
                            int i58 = a;
                            int i59 = (i58 ^ 47) + ((i58 & 47) << 1);
                            b = i59 % 128;
                            int i60 = i59 % 2;
                            this.e.getLocationInWindow(iArr2);
                            int i61 = b;
                            int i62 = i61 ^ 87;
                            int i63 = ((i61 & 87) | i62) << 1;
                            int i64 = -i62;
                            i9 = (i63 & i64) + (i64 | i63);
                            a = i9 % 128;
                            if (i9 % 2 == 0) {
                                iArr2[0] = iArr2[0] % i4;
                            } else {
                                iArr2[0] = iArr2[0] - i4;
                            }
                            iArr2[1] = (iArr2[1] - (~(-i5))) - 1;
                            int i65 = i61 + 85;
                            a = i65 % 128;
                            int i66 = i65 % 2;
                        }
                        if (iArr3[0] == 0) {
                            int i67 = b;
                            int i68 = i67 & 75;
                            int i69 = ((i67 ^ 75) | i68) << 1;
                            int i70 = -((i67 | 75) & (~i68));
                            int i71 = (i69 & i70) + (i70 | i69);
                            a = i71 % 128;
                            int i72 = i71 % 2;
                            if (iArr3[1] == 0) {
                            }
                        }
                        i8 = a + 17;
                        b = i8 % 128;
                        if (i8 % 2 != 0) {
                            int i73 = 3 % 3;
                        }
                    } else if (iArr2 != null) {
                        int i74 = i26 & 13;
                        int i75 = i74 + ((i26 ^ 13) | i74);
                        int i76 = i75 % 128;
                        a = i76;
                        int i77 = i75 % 2;
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                        int i78 = i76 & 11;
                        int i79 = (i76 | 11) & (~i78);
                        int i80 = i78 << 1;
                        int i81 = ((i79 | i80) << 1) - (i80 ^ i79);
                        b = i81 % 128;
                        int i82 = i81 % 2;
                    }
                    z = false;
                } else {
                    if (i2 != 0) {
                        if (iArr2 != null) {
                            int i310 = b;
                            int i311 = i310 & 51;
                            int i312 = -(-((i310 ^ 51) | i311));
                            i12 = (i311 & i312) + (i312 | i311);
                            a = i12 % 128;
                            if (i12 % 2 == 0) {
                                this.e.getLocationInWindow(iArr2);
                                obj.hashCode();
                                throw null;
                            }
                            this.e.getLocationInWindow(iArr2);
                            int i313 = iArr2[0];
                            int i314 = iArr2[1];
                            int i315 = b;
                            int i316 = (((i315 | 65) << 1) - (~(-(((~i315) & 65) | (i315 & (-66)))))) - 1;
                            a = i316 % 128;
                            int i317 = i316 % 2;
                            i4 = i313;
                            i5 = i314;
                        } else {
                            int i318 = a;
                            int i410 = i318 & 65;
                            int i411 = (((i318 | 65) & (~i410)) - (~(-(-(i410 << 1))))) - 1;
                            b = i411 % 128;
                            int i412 = i411 % 2;
                            i4 = 0;
                            i5 = 0;
                        }
                        if (iArr == null) {
                            int i413 = b;
                            i10 = ((i413 | 87) << 1) - (i413 ^ 87);
                            i11 = i10 % 128;
                            a = i11;
                            if (i10 % 2 == 0) {
                                obj.hashCode();
                                throw null;
                            }
                            if (this.g == null) {
                                this.g = new int[2];
                                int i414 = (i11 ^ 27) + ((i11 & 27) << 1);
                                b = i414 % 128;
                                int i415 = i414 % 2;
                            }
                            int[] iArr5 = this.g;
                            int i416 = ((i11 | 7) << 1) - (i11 ^ 7);
                            b = i416 % 128;
                            int i417 = i416 % 2;
                            iArr3 = iArr5;
                        } else {
                            iArr3 = iArr;
                        }
                        iArr3[0] = 0;
                        iArr3[1] = 0;
                        view = this.e;
                        i6 = b;
                        i7 = i6 + 77;
                        a = i7 % 128;
                        if (i7 % 2 == 0) {
                            boolean z3 = viewParentJ instanceof InterfaceC0289t;
                            throw null;
                        }
                        if (viewParentJ instanceof InterfaceC0289t) {
                            ((InterfaceC0289t) viewParentJ).o(view, i, i2, iArr3, i3);
                            int i418 = b;
                            int i419 = ((i418 ^ 77) | (i418 & 77)) << 1;
                            int i510 = -(((~i418) & 77) | (i418 & (-78)));
                            int i511 = (i419 ^ i510) + ((i510 & i419) << 1);
                            a = i511 % 128;
                            int i512 = i511 % 2;
                        } else if (i3 == 0) {
                            int i513 = i6 & 33;
                            int i514 = i513 + ((i6 ^ 33) | i513);
                            a = i514 % 128;
                            int i515 = i514 % 2;
                            viewParentJ.onNestedPreScroll(view, i, i2, iArr3);
                            int i516 = b + 69;
                            a = i516 % 128;
                            int i517 = i516 % 2;
                        }
                        if (iArr2 != null) {
                            int i518 = a;
                            int i519 = (i518 ^ 47) + ((i518 & 47) << 1);
                            b = i519 % 128;
                            int i610 = i519 % 2;
                            this.e.getLocationInWindow(iArr2);
                            int i611 = b;
                            int i612 = i611 ^ 87;
                            int i613 = ((i611 & 87) | i612) << 1;
                            int i614 = -i612;
                            i9 = (i613 & i614) + (i614 | i613);
                            a = i9 % 128;
                            if (i9 % 2 == 0) {
                                iArr2[0] = iArr2[0] % i4;
                            } else {
                                iArr2[0] = iArr2[0] - i4;
                            }
                            iArr2[1] = (iArr2[1] - (~(-i5))) - 1;
                            int i615 = i611 + 85;
                            a = i615 % 128;
                            int i616 = i615 % 2;
                        }
                        if (iArr3[0] == 0) {
                            int i617 = b;
                            int i618 = i617 & 75;
                            int i619 = ((i617 ^ 75) | i618) << 1;
                            int i710 = -((i617 | 75) & (~i618));
                            int i711 = (i619 & i710) + (i710 | i619);
                            a = i711 % 128;
                            int i712 = i711 % 2;
                            if (iArr3[1] == 0) {
                            }
                        }
                        i8 = a + 17;
                        b = i8 % 128;
                        if (i8 % 2 != 0) {
                            int i713 = 3 % 3;
                        }
                    } else if (iArr2 != null) {
                        int i714 = i26 & 13;
                        int i715 = i714 + ((i26 ^ 13) | i714);
                        int i716 = i715 % 128;
                        a = i716;
                        int i717 = i715 % 2;
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                        int i718 = i716 & 11;
                        int i719 = (i716 | 11) & (~i718);
                        int i83 = i718 << 1;
                        int i84 = ((i719 | i83) << 1) - (i83 ^ i719);
                        b = i84 % 128;
                        int i85 = i84 % 2;
                    }
                    z = false;
                }
            } else {
                if (iArr2 != null) {
                    int i319 = b;
                    int i3110 = i319 & 51;
                    int i3111 = -(-((i319 ^ 51) | i3110));
                    i12 = (i3110 & i3111) + (i3111 | i3110);
                    a = i12 % 128;
                    if (i12 % 2 == 0) {
                        this.e.getLocationInWindow(iArr2);
                        obj.hashCode();
                        throw null;
                    }
                    this.e.getLocationInWindow(iArr2);
                    int i3112 = iArr2[0];
                    int i3113 = iArr2[1];
                    int i3114 = b;
                    int i3115 = (((i3114 | 65) << 1) - (~(-(((~i3114) & 65) | (i3114 & (-66)))))) - 1;
                    a = i3115 % 128;
                    int i3116 = i3115 % 2;
                    i4 = i3112;
                    i5 = i3113;
                } else {
                    int i3117 = a;
                    int i4110 = i3117 & 65;
                    int i4111 = (((i3117 | 65) & (~i4110)) - (~(-(-(i4110 << 1))))) - 1;
                    b = i4111 % 128;
                    int i4112 = i4111 % 2;
                    i4 = 0;
                    i5 = 0;
                }
                if (iArr == null) {
                    int i4113 = b;
                    i10 = ((i4113 | 87) << 1) - (i4113 ^ 87);
                    i11 = i10 % 128;
                    a = i11;
                    if (i10 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (this.g == null) {
                        this.g = new int[2];
                        int i4114 = (i11 ^ 27) + ((i11 & 27) << 1);
                        b = i4114 % 128;
                        int i4115 = i4114 % 2;
                    }
                    int[] iArr6 = this.g;
                    int i4116 = ((i11 | 7) << 1) - (i11 ^ 7);
                    b = i4116 % 128;
                    int i4117 = i4116 % 2;
                    iArr3 = iArr6;
                } else {
                    iArr3 = iArr;
                }
                iArr3[0] = 0;
                iArr3[1] = 0;
                view = this.e;
                i6 = b;
                i7 = i6 + 77;
                a = i7 % 128;
                if (i7 % 2 == 0) {
                    boolean z4 = viewParentJ instanceof InterfaceC0289t;
                    throw null;
                }
                if (viewParentJ instanceof InterfaceC0289t) {
                    ((InterfaceC0289t) viewParentJ).o(view, i, i2, iArr3, i3);
                    int i4118 = b;
                    int i4119 = ((i4118 ^ 77) | (i4118 & 77)) << 1;
                    int i5110 = -(((~i4118) & 77) | (i4118 & (-78)));
                    int i5111 = (i4119 ^ i5110) + ((i5110 & i4119) << 1);
                    a = i5111 % 128;
                    int i5112 = i5111 % 2;
                } else if (i3 == 0) {
                    int i5113 = i6 & 33;
                    int i5114 = i5113 + ((i6 ^ 33) | i5113);
                    a = i5114 % 128;
                    int i5115 = i5114 % 2;
                    viewParentJ.onNestedPreScroll(view, i, i2, iArr3);
                    int i5116 = b + 69;
                    a = i5116 % 128;
                    int i5117 = i5116 % 2;
                }
                if (iArr2 != null) {
                    int i5118 = a;
                    int i5119 = (i5118 ^ 47) + ((i5118 & 47) << 1);
                    b = i5119 % 128;
                    int i6110 = i5119 % 2;
                    this.e.getLocationInWindow(iArr2);
                    int i6111 = b;
                    int i6112 = i6111 ^ 87;
                    int i6113 = ((i6111 & 87) | i6112) << 1;
                    int i6114 = -i6112;
                    i9 = (i6113 & i6114) + (i6114 | i6113);
                    a = i9 % 128;
                    if (i9 % 2 == 0) {
                        iArr2[0] = iArr2[0] % i4;
                    } else {
                        iArr2[0] = iArr2[0] - i4;
                    }
                    iArr2[1] = (iArr2[1] - (~(-i5))) - 1;
                    int i6115 = i6111 + 85;
                    a = i6115 % 128;
                    int i6116 = i6115 % 2;
                }
                if (iArr3[0] == 0) {
                    int i6117 = b;
                    int i6118 = i6117 & 75;
                    int i6119 = ((i6117 ^ 75) | i6118) << 1;
                    int i7110 = -((i6117 | 75) & (~i6118));
                    int i7111 = (i6119 & i7110) + (i7110 | i6119);
                    a = i7111 % 128;
                    int i7112 = i7111 % 2;
                    if (iArr3[1] == 0) {
                        z = false;
                    }
                }
                i8 = a + 17;
                b = i8 % 128;
                if (i8 % 2 != 0) {
                    int i7113 = 3 % 3;
                }
            }
        }
        int i86 = a + 35;
        b = i86 % 128;
        int i87 = i86 % 2;
        return z;
    }
}
