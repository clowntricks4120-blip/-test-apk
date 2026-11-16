package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v4.media.session.IMediaSession;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import ivas.gov.bisp.enumeration.B.A;
import ivas.gov.bisp.enumeration.B.C;
import ivas.gov.bisp.enumeration.B.D;
import ivas.gov.bisp.enumeration.B.W;
import ivas.gov.bisp.enumeration.B.X;
import ivas.gov.bisp.enumeration.B.Y;
import ivas.gov.bisp.enumeration.B.am;
import ivas.gov.bisp.enumeration.OooOo.OooO;
import ivas.gov.bisp.enumeration.p003ac.P;
import ivas.gov.bisp.enumeration.p003ac.i;
import ivas.gov.bisp.enumeration.p004ad.C0087m;
import ivas.gov.bisp.enumeration.p004ad.L;
import ivas.gov.bisp.enumeration.p004ad.N;
import ivas.gov.bisp.enumeration.p004ad.O;
import ivas.gov.bisp.enumeration.p004ad.Q;
import ivas.gov.bisp.enumeration.p004ad.R;
import ivas.gov.bisp.enumeration.p004ad.S;
import ivas.gov.bisp.enumeration.p004ad.T;
import ivas.gov.bisp.enumeration.p006af.h;
import ivas.gov.bisp.enumeration.p100w.c;
import ivas.gov.bisp.enumeration.p100w.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public boolean a;
    public SparseArray<View> b;
    public ArrayList<androidx.constraintlayout.widget.OooO00o> c;
    public O d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public b j;
    public c k;
    public HashMap<String, Integer> l;
    public int m;
    public SparseArray<C0087m> n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public OooO0O0 f15o;

    public class OooO0O0 implements A.aJL {
        public ConstraintLayout a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public OooO0O0(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
            this.a = constraintLayout2;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x015c  */
        /* JADX WARN: Code duplicated, block: B:103:0x0160  */
        /* JADX WARN: Code duplicated, block: B:106:0x0168  */
        /* JADX WARN: Code duplicated, block: B:108:0x016b  */
        /* JADX WARN: Code duplicated, block: B:111:0x0173  */
        /* JADX WARN: Code duplicated, block: B:114:0x017e A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:121:0x0192  */
        /* JADX WARN: Code duplicated, block: B:123:0x0196  */
        /* JADX WARN: Code duplicated, block: B:126:0x01a1  */
        /* JADX WARN: Code duplicated, block: B:129:0x01b2  */
        /* JADX WARN: Code duplicated, block: B:130:0x01bd  */
        /* JADX WARN: Code duplicated, block: B:132:0x01c9  */
        /* JADX WARN: Code duplicated, block: B:133:0x01d3  */
        /* JADX WARN: Code duplicated, block: B:136:0x01e0  */
        /* JADX WARN: Code duplicated, block: B:137:0x01e5  */
        /* JADX WARN: Code duplicated, block: B:140:0x01ea  */
        /* JADX WARN: Code duplicated, block: B:143:0x01f2  */
        /* JADX WARN: Code duplicated, block: B:144:0x01f7  */
        /* JADX WARN: Code duplicated, block: B:147:0x01fc  */
        /* JADX WARN: Code duplicated, block: B:150:0x0204 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:152:0x0212 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:153:0x0214 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:155:0x021d  */
        /* JADX WARN: Code duplicated, block: B:158:0x0221 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:161:0x0229  */
        /* JADX WARN: Code duplicated, block: B:163:0x022d  */
        /* JADX WARN: Code duplicated, block: B:165:0x0233  */
        /* JADX WARN: Code duplicated, block: B:168:0x024f  */
        /* JADX WARN: Code duplicated, block: B:169:0x0251  */
        /* JADX WARN: Code duplicated, block: B:172:0x0257  */
        /* JADX WARN: Code duplicated, block: B:175:0x025e  */
        /* JADX WARN: Code duplicated, block: B:178:0x0265  */
        /* JADX WARN: Code duplicated, block: B:180:0x0268  */
        /* JADX WARN: Code duplicated, block: B:50:0x00bb A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:51:0x00bd A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:52:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:54:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:55:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:57:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:58:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:61:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:63:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:65:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:66:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:69:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:81:0x0123  */
        /* JADX WARN: Code duplicated, block: B:83:0x0128  */
        /* JADX WARN: Code duplicated, block: B:84:0x0137  */
        /* JADX WARN: Code duplicated, block: B:87:0x0146  */
        /* JADX WARN: Code duplicated, block: B:88:0x0148  */
        /* JADX WARN: Code duplicated, block: B:90:0x014b  */
        /* JADX WARN: Code duplicated, block: B:91:0x014d  */
        /* JADX WARN: Code duplicated, block: B:94:0x0151 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:96:0x0155  */
        /* JADX WARN: Code duplicated, block: B:98:0x0158 A[ADDED_TO_REGION] */
        /* JADX WARN: Multi-variable type inference failed */
        @SuppressLint({"WrongCall"})
        public final void b(C0087m c0087m, A.aUq auq) {
            int iMakeMeasureSpec;
            boolean z;
            int iC;
            int i;
            int iMakeMeasureSpec2;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            OooO00o oooO00o;
            int measuredWidth;
            int measuredHeight;
            int i2;
            int i3;
            int iMin;
            int i4;
            int i5;
            int iMin2;
            int i6;
            int i7;
            int i8;
            int i9;
            int measuredHeight2;
            int i10;
            int baseline;
            int i11;
            boolean z9;
            boolean z10;
            boolean z11;
            int[] iArr;
            int i12;
            if (c0087m == null) {
                return;
            }
            if (c0087m.Y == 8 && !c0087m.v) {
                auq.g = 0;
                auq.f = 0;
                auq.h = 0;
                return;
            }
            int i13 = auq.b;
            int i14 = auq.c;
            int i15 = auq.d;
            int i16 = auq.e;
            int i17 = this.b + this.c;
            int i18 = this.d;
            View view = (View) c0087m.X;
            int iC2 = P.c(i13);
            if (iC2 != 0) {
                if (iC2 == 1) {
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.e, i18, -2);
                    c0087m.j[2] = -2;
                } else if (iC2 == 2) {
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.e, i18, -2);
                    boolean z12 = c0087m.l == 1;
                    int[] iArr2 = c0087m.j;
                    iArr2[2] = 0;
                    if (auq.j) {
                        boolean z13 = !(!z12 || iArr2[3] == 0 || iArr2[0] == c0087m.p()) || (view instanceof OooO0o);
                        if (!z12 || z13) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c0087m.p(), 1073741824);
                        }
                    }
                } else if (iC2 != 3) {
                    iMakeMeasureSpec = 0;
                } else {
                    int i19 = this.e;
                    N n = c0087m.B;
                    int i20 = n != null ? n.h : 0;
                    N n2 = c0087m.C;
                    if (n2 != null) {
                        i20 += n2.h;
                    }
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i19, i18 + i20, -1);
                    c0087m.j[2] = -1;
                }
                z = true;
                iC = P.c(i14);
                if (iC != 0) {
                    if (iC != 1) {
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i17, -2);
                        i = 3;
                        c0087m.j[3] = -2;
                        z2 = true;
                    } else if (iC != 2) {
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i17, -2);
                        if (c0087m.m == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        iArr = c0087m.j;
                        iArr[3] = 0;
                        if (auq.j) {
                            boolean z14 = !(z11 || iArr[2] == 0 || iArr[1] == c0087m.c()) || (view instanceof OooO0o);
                            if (z11 || z14) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c0087m.c(), 1073741824);
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                        } else {
                            z2 = true;
                        }
                        i = 3;
                    } else if (iC != 3) {
                        i = 3;
                        iMakeMeasureSpec2 = 0;
                    } else {
                        int i21 = this.g;
                        if (c0087m.B != null) {
                            i12 = c0087m.A.h;
                        } else {
                            i12 = 0;
                        }
                        if (c0087m.C != null) {
                            i12 += c0087m.E.h;
                        }
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i21, i17 + i12, -1);
                        i = 3;
                        c0087m.j[3] = -1;
                    }
                    if (i13 == i) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (i14 == i) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (i14 != 4 || i14 == 1) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (i13 != 4 || i13 == 1) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z3 || c0087m.Q <= 0.0f) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    if (z4 || c0087m.Q <= 0.0f) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    oooO00o = (OooO00o) view.getLayoutParams();
                    if (auq.j && z3 && c0087m.l == 0 && z4 && c0087m.m == 0) {
                        i10 = 0;
                        measuredHeight2 = 0;
                        i9 = -1;
                        baseline = 0;
                        i2 = 0;
                    } else {
                        if ((view instanceof OooO) || !(c0087m instanceof L)) {
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        }
                        measuredWidth = view.getMeasuredWidth();
                        measuredHeight = view.getMeasuredHeight();
                        int baseline2 = view.getBaseline();
                        if (z) {
                            int[] iArr3 = c0087m.j;
                            i2 = 0;
                            iArr3[0] = measuredWidth;
                            iArr3[2] = measuredHeight;
                        } else {
                            i2 = 0;
                            int[] iArr4 = c0087m.j;
                            iArr4[0] = 0;
                            iArr4[2] = 0;
                        }
                        if (z2) {
                            int[] iArr5 = c0087m.j;
                            iArr5[1] = measuredHeight;
                            iArr5[3] = measuredWidth;
                        } else {
                            int[] iArr6 = c0087m.j;
                            iArr6[1] = i2;
                            iArr6[3] = i2;
                        }
                        i3 = c0087m.p;
                        if (i3 > 0) {
                            iMin = Math.max(i3, measuredWidth);
                        } else {
                            iMin = measuredWidth;
                        }
                        i4 = c0087m.f65o;
                        if (i4 > 0) {
                            iMin = Math.min(i4, iMin);
                        }
                        i5 = c0087m.r;
                        if (i5 > 0) {
                            iMin2 = Math.max(i5, measuredHeight);
                        } else {
                            iMin2 = measuredHeight;
                        }
                        i6 = c0087m.t;
                        if (i6 > 0) {
                            iMin2 = Math.min(i6, iMin2);
                        }
                        if (z7 || !z5) {
                            if (z8 || !z6) {
                                i7 = iMin2;
                            } else {
                                i7 = (int) ((iMin / c0087m.Q) + 0.5f);
                            }
                            i8 = iMin;
                        } else {
                            int i22 = iMin2;
                            i8 = (int) ((iMin2 * c0087m.Q) + 0.5f);
                            i7 = i22;
                        }
                        if (measuredWidth == i8 || measuredHeight != i7) {
                            if (measuredWidth != i8) {
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                            }
                            if (measuredHeight != i7) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                            }
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            int measuredWidth2 = view.getMeasuredWidth();
                            i9 = -1;
                            measuredHeight2 = view.getMeasuredHeight();
                            i10 = measuredWidth2;
                            baseline = view.getBaseline();
                        } else {
                            measuredHeight2 = i7;
                            i10 = i8;
                            baseline = baseline2;
                            i9 = -1;
                        }
                    }
                    if (baseline != i9) {
                        i11 = 1;
                    } else {
                        i11 = i2;
                    }
                    if (i10 == auq.d || measuredHeight2 != auq.e) {
                        z9 = 1;
                    } else {
                        z9 = i2;
                    }
                    auq.a = z9;
                    z10 = i11;
                    if (oooO00o.W) {
                        z10 = 1;
                    }
                    if (z10 != 0 && baseline != -1 && c0087m.T != baseline) {
                        auq.a = true;
                    }
                    auq.g = i10;
                    auq.f = measuredHeight2;
                    auq.i = z10;
                    auq.h = baseline;
                }
                i = 3;
                int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                c0087m.j[3] = i16;
                iMakeMeasureSpec2 = iMakeMeasureSpec3;
                z2 = false;
                if (i13 == i) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i14 == i) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (i14 != 4) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                if (i13 != 4) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (z3) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                if (z4) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                oooO00o = (OooO00o) view.getLayoutParams();
                if (auq.j) {
                    if (view instanceof OooO) {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    } else {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    int baseline3 = view.getBaseline();
                    if (z) {
                        int[] iArr7 = c0087m.j;
                        i2 = 0;
                        iArr7[0] = measuredWidth;
                        iArr7[2] = measuredHeight;
                    } else {
                        i2 = 0;
                        int[] iArr8 = c0087m.j;
                        iArr8[0] = 0;
                        iArr8[2] = 0;
                    }
                    if (z2) {
                        int[] iArr9 = c0087m.j;
                        iArr9[1] = measuredHeight;
                        iArr9[3] = measuredWidth;
                    } else {
                        int[] iArr10 = c0087m.j;
                        iArr10[1] = i2;
                        iArr10[3] = i2;
                    }
                    i3 = c0087m.p;
                    if (i3 > 0) {
                        iMin = Math.max(i3, measuredWidth);
                    } else {
                        iMin = measuredWidth;
                    }
                    i4 = c0087m.f65o;
                    if (i4 > 0) {
                        iMin = Math.min(i4, iMin);
                    }
                    i5 = c0087m.r;
                    if (i5 > 0) {
                        iMin2 = Math.max(i5, measuredHeight);
                    } else {
                        iMin2 = measuredHeight;
                    }
                    i6 = c0087m.t;
                    if (i6 > 0) {
                        iMin2 = Math.min(i6, iMin2);
                    }
                    if (z7) {
                        if (z8) {
                            i7 = iMin2;
                        } else {
                            i7 = iMin2;
                        }
                        i8 = iMin;
                    } else {
                        if (z8) {
                            i7 = iMin2;
                        } else {
                            i7 = iMin2;
                        }
                        i8 = iMin;
                    }
                    if (measuredWidth == i8) {
                        if (measuredWidth != i8) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                        }
                        if (measuredHeight != i7) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        int measuredWidth3 = view.getMeasuredWidth();
                        i9 = -1;
                        measuredHeight2 = view.getMeasuredHeight();
                        i10 = measuredWidth3;
                        baseline = view.getBaseline();
                    } else {
                        if (measuredWidth != i8) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                        }
                        if (measuredHeight != i7) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        int measuredWidth4 = view.getMeasuredWidth();
                        i9 = -1;
                        measuredHeight2 = view.getMeasuredHeight();
                        i10 = measuredWidth4;
                        baseline = view.getBaseline();
                    }
                } else {
                    if (view instanceof OooO) {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    } else {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    int baseline4 = view.getBaseline();
                    if (z) {
                        int[] iArr11 = c0087m.j;
                        i2 = 0;
                        iArr11[0] = measuredWidth;
                        iArr11[2] = measuredHeight;
                    } else {
                        i2 = 0;
                        int[] iArr12 = c0087m.j;
                        iArr12[0] = 0;
                        iArr12[2] = 0;
                    }
                    if (z2) {
                        int[] iArr13 = c0087m.j;
                        iArr13[1] = measuredHeight;
                        iArr13[3] = measuredWidth;
                    } else {
                        int[] iArr14 = c0087m.j;
                        iArr14[1] = i2;
                        iArr14[3] = i2;
                    }
                    i3 = c0087m.p;
                    if (i3 > 0) {
                        iMin = Math.max(i3, measuredWidth);
                    } else {
                        iMin = measuredWidth;
                    }
                    i4 = c0087m.f65o;
                    if (i4 > 0) {
                        iMin = Math.min(i4, iMin);
                    }
                    i5 = c0087m.r;
                    if (i5 > 0) {
                        iMin2 = Math.max(i5, measuredHeight);
                    } else {
                        iMin2 = measuredHeight;
                    }
                    i6 = c0087m.t;
                    if (i6 > 0) {
                        iMin2 = Math.min(i6, iMin2);
                    }
                    if (z7) {
                        if (z8) {
                            i7 = iMin2;
                        } else {
                            i7 = iMin2;
                        }
                        i8 = iMin;
                    } else {
                        if (z8) {
                            i7 = iMin2;
                        } else {
                            i7 = iMin2;
                        }
                        i8 = iMin;
                    }
                    if (measuredWidth == i8) {
                        if (measuredWidth != i8) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                        }
                        if (measuredHeight != i7) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        int measuredWidth5 = view.getMeasuredWidth();
                        i9 = -1;
                        measuredHeight2 = view.getMeasuredHeight();
                        i10 = measuredWidth5;
                        baseline = view.getBaseline();
                    } else {
                        if (measuredWidth != i8) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                        }
                        if (measuredHeight != i7) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        int measuredWidth6 = view.getMeasuredWidth();
                        i9 = -1;
                        measuredHeight2 = view.getMeasuredHeight();
                        i10 = measuredWidth6;
                        baseline = view.getBaseline();
                    }
                }
                if (baseline != i9) {
                    i11 = 1;
                } else {
                    i11 = i2;
                }
                if (i10 == auq.d) {
                    z9 = 1;
                } else {
                    z9 = 1;
                }
                auq.a = z9;
                z10 = i11;
                if (oooO00o.W) {
                    z10 = 1;
                }
                if (z10 != 0) {
                    auq.a = true;
                }
                auq.g = i10;
                auq.f = measuredHeight2;
                auq.i = z10;
                auq.h = baseline;
            }
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
            c0087m.j[2] = i15;
            iMakeMeasureSpec = iMakeMeasureSpec4;
            z = false;
            iC = P.c(i14);
            if (iC != 0) {
                if (iC != 1) {
                    iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i17, -2);
                    i = 3;
                    c0087m.j[3] = -2;
                    z2 = true;
                } else if (iC != 2) {
                    iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i17, -2);
                    if (c0087m.m == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    iArr = c0087m.j;
                    iArr[3] = 0;
                    if (auq.j) {
                        z2 = true;
                    } else {
                        if (z11) {
                        }
                        if (z11) {
                        }
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c0087m.c(), 1073741824);
                        z2 = false;
                    }
                    i = 3;
                } else if (iC != 3) {
                    i = 3;
                    iMakeMeasureSpec2 = 0;
                } else {
                    int i23 = this.g;
                    if (c0087m.B != null) {
                        i12 = c0087m.A.h;
                    } else {
                        i12 = 0;
                    }
                    if (c0087m.C != null) {
                        i12 += c0087m.E.h;
                    }
                    iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i23, i17 + i12, -1);
                    i = 3;
                    c0087m.j[3] = -1;
                }
                if (i13 == i) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i14 == i) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (i14 != 4) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                if (i13 != 4) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (z3) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                if (z4) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                oooO00o = (OooO00o) view.getLayoutParams();
                if (auq.j) {
                    if (view instanceof OooO) {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    } else {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    int baseline5 = view.getBaseline();
                    if (z) {
                        int[] iArr15 = c0087m.j;
                        i2 = 0;
                        iArr15[0] = measuredWidth;
                        iArr15[2] = measuredHeight;
                    } else {
                        i2 = 0;
                        int[] iArr16 = c0087m.j;
                        iArr16[0] = 0;
                        iArr16[2] = 0;
                    }
                    if (z2) {
                        int[] iArr17 = c0087m.j;
                        iArr17[1] = measuredHeight;
                        iArr17[3] = measuredWidth;
                    } else {
                        int[] iArr18 = c0087m.j;
                        iArr18[1] = i2;
                        iArr18[3] = i2;
                    }
                    i3 = c0087m.p;
                    if (i3 > 0) {
                        iMin = Math.max(i3, measuredWidth);
                    } else {
                        iMin = measuredWidth;
                    }
                    i4 = c0087m.f65o;
                    if (i4 > 0) {
                        iMin = Math.min(i4, iMin);
                    }
                    i5 = c0087m.r;
                    if (i5 > 0) {
                        iMin2 = Math.max(i5, measuredHeight);
                    } else {
                        iMin2 = measuredHeight;
                    }
                    i6 = c0087m.t;
                    if (i6 > 0) {
                        iMin2 = Math.min(i6, iMin2);
                    }
                    if (z7) {
                        if (z8) {
                            i7 = iMin2;
                        } else {
                            i7 = iMin2;
                        }
                        i8 = iMin;
                    } else {
                        if (z8) {
                            i7 = iMin2;
                        } else {
                            i7 = iMin2;
                        }
                        i8 = iMin;
                    }
                    if (measuredWidth == i8) {
                        if (measuredWidth != i8) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                        }
                        if (measuredHeight != i7) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        int measuredWidth7 = view.getMeasuredWidth();
                        i9 = -1;
                        measuredHeight2 = view.getMeasuredHeight();
                        i10 = measuredWidth7;
                        baseline = view.getBaseline();
                    } else {
                        if (measuredWidth != i8) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                        }
                        if (measuredHeight != i7) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        int measuredWidth8 = view.getMeasuredWidth();
                        i9 = -1;
                        measuredHeight2 = view.getMeasuredHeight();
                        i10 = measuredWidth8;
                        baseline = view.getBaseline();
                    }
                } else {
                    if (view instanceof OooO) {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    } else {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    int baseline6 = view.getBaseline();
                    if (z) {
                        int[] iArr19 = c0087m.j;
                        i2 = 0;
                        iArr19[0] = measuredWidth;
                        iArr19[2] = measuredHeight;
                    } else {
                        i2 = 0;
                        int[] iArr110 = c0087m.j;
                        iArr110[0] = 0;
                        iArr110[2] = 0;
                    }
                    if (z2) {
                        int[] iArr111 = c0087m.j;
                        iArr111[1] = measuredHeight;
                        iArr111[3] = measuredWidth;
                    } else {
                        int[] iArr112 = c0087m.j;
                        iArr112[1] = i2;
                        iArr112[3] = i2;
                    }
                    i3 = c0087m.p;
                    if (i3 > 0) {
                        iMin = Math.max(i3, measuredWidth);
                    } else {
                        iMin = measuredWidth;
                    }
                    i4 = c0087m.f65o;
                    if (i4 > 0) {
                        iMin = Math.min(i4, iMin);
                    }
                    i5 = c0087m.r;
                    if (i5 > 0) {
                        iMin2 = Math.max(i5, measuredHeight);
                    } else {
                        iMin2 = measuredHeight;
                    }
                    i6 = c0087m.t;
                    if (i6 > 0) {
                        iMin2 = Math.min(i6, iMin2);
                    }
                    if (z7) {
                        if (z8) {
                            i7 = iMin2;
                        } else {
                            i7 = iMin2;
                        }
                        i8 = iMin;
                    } else {
                        if (z8) {
                            i7 = iMin2;
                        } else {
                            i7 = iMin2;
                        }
                        i8 = iMin;
                    }
                    if (measuredWidth == i8) {
                        if (measuredWidth != i8) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                        }
                        if (measuredHeight != i7) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        int measuredWidth9 = view.getMeasuredWidth();
                        i9 = -1;
                        measuredHeight2 = view.getMeasuredHeight();
                        i10 = measuredWidth9;
                        baseline = view.getBaseline();
                    } else {
                        if (measuredWidth != i8) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                        }
                        if (measuredHeight != i7) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        int measuredWidth10 = view.getMeasuredWidth();
                        i9 = -1;
                        measuredHeight2 = view.getMeasuredHeight();
                        i10 = measuredWidth10;
                        baseline = view.getBaseline();
                    }
                }
                if (baseline != i9) {
                    i11 = 1;
                } else {
                    i11 = i2;
                }
                if (i10 == auq.d) {
                    z9 = 1;
                } else {
                    z9 = 1;
                }
                auq.a = z9;
                z10 = i11;
                if (oooO00o.W) {
                    z10 = 1;
                }
                if (z10 != 0) {
                    auq.a = true;
                }
                auq.g = i10;
                auq.f = measuredHeight2;
                auq.i = z10;
                auq.h = baseline;
            }
            i = 3;
            int iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
            c0087m.j[3] = i16;
            iMakeMeasureSpec2 = iMakeMeasureSpec5;
            z2 = false;
            if (i13 == i) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (i14 == i) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i14 != 4) {
                z5 = true;
            } else {
                z5 = true;
            }
            if (i13 != 4) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (z3) {
                z7 = false;
            } else {
                z7 = false;
            }
            if (z4) {
                z8 = false;
            } else {
                z8 = false;
            }
            oooO00o = (OooO00o) view.getLayoutParams();
            if (auq.j) {
                if (view instanceof OooO) {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                measuredWidth = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                int baseline7 = view.getBaseline();
                if (z) {
                    int[] iArr113 = c0087m.j;
                    i2 = 0;
                    iArr113[0] = measuredWidth;
                    iArr113[2] = measuredHeight;
                } else {
                    i2 = 0;
                    int[] iArr114 = c0087m.j;
                    iArr114[0] = 0;
                    iArr114[2] = 0;
                }
                if (z2) {
                    int[] iArr115 = c0087m.j;
                    iArr115[1] = measuredHeight;
                    iArr115[3] = measuredWidth;
                } else {
                    int[] iArr116 = c0087m.j;
                    iArr116[1] = i2;
                    iArr116[3] = i2;
                }
                i3 = c0087m.p;
                if (i3 > 0) {
                    iMin = Math.max(i3, measuredWidth);
                } else {
                    iMin = measuredWidth;
                }
                i4 = c0087m.f65o;
                if (i4 > 0) {
                    iMin = Math.min(i4, iMin);
                }
                i5 = c0087m.r;
                if (i5 > 0) {
                    iMin2 = Math.max(i5, measuredHeight);
                } else {
                    iMin2 = measuredHeight;
                }
                i6 = c0087m.t;
                if (i6 > 0) {
                    iMin2 = Math.min(i6, iMin2);
                }
                if (z7) {
                    if (z8) {
                        i7 = iMin2;
                    } else {
                        i7 = iMin2;
                    }
                    i8 = iMin;
                } else {
                    if (z8) {
                        i7 = iMin2;
                    } else {
                        i7 = iMin2;
                    }
                    i8 = iMin;
                }
                if (measuredWidth == i8) {
                    if (measuredWidth != i8) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                    }
                    if (measuredHeight != i7) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    int measuredWidth11 = view.getMeasuredWidth();
                    i9 = -1;
                    measuredHeight2 = view.getMeasuredHeight();
                    i10 = measuredWidth11;
                    baseline = view.getBaseline();
                } else {
                    if (measuredWidth != i8) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                    }
                    if (measuredHeight != i7) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    int measuredWidth12 = view.getMeasuredWidth();
                    i9 = -1;
                    measuredHeight2 = view.getMeasuredHeight();
                    i10 = measuredWidth12;
                    baseline = view.getBaseline();
                }
            } else {
                if (view instanceof OooO) {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                measuredWidth = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                int baseline8 = view.getBaseline();
                if (z) {
                    int[] iArr117 = c0087m.j;
                    i2 = 0;
                    iArr117[0] = measuredWidth;
                    iArr117[2] = measuredHeight;
                } else {
                    i2 = 0;
                    int[] iArr118 = c0087m.j;
                    iArr118[0] = 0;
                    iArr118[2] = 0;
                }
                if (z2) {
                    int[] iArr119 = c0087m.j;
                    iArr119[1] = measuredHeight;
                    iArr119[3] = measuredWidth;
                } else {
                    int[] iArr1110 = c0087m.j;
                    iArr1110[1] = i2;
                    iArr1110[3] = i2;
                }
                i3 = c0087m.p;
                if (i3 > 0) {
                    iMin = Math.max(i3, measuredWidth);
                } else {
                    iMin = measuredWidth;
                }
                i4 = c0087m.f65o;
                if (i4 > 0) {
                    iMin = Math.min(i4, iMin);
                }
                i5 = c0087m.r;
                if (i5 > 0) {
                    iMin2 = Math.max(i5, measuredHeight);
                } else {
                    iMin2 = measuredHeight;
                }
                i6 = c0087m.t;
                if (i6 > 0) {
                    iMin2 = Math.min(i6, iMin2);
                }
                if (z7) {
                    if (z8) {
                        i7 = iMin2;
                    } else {
                        i7 = iMin2;
                    }
                    i8 = iMin;
                } else {
                    if (z8) {
                        i7 = iMin2;
                    } else {
                        i7 = iMin2;
                    }
                    i8 = iMin;
                }
                if (measuredWidth == i8) {
                    if (measuredWidth != i8) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                    }
                    if (measuredHeight != i7) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    int measuredWidth13 = view.getMeasuredWidth();
                    i9 = -1;
                    measuredHeight2 = view.getMeasuredHeight();
                    i10 = measuredWidth13;
                    baseline = view.getBaseline();
                } else {
                    if (measuredWidth != i8) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                    }
                    if (measuredHeight != i7) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    int measuredWidth14 = view.getMeasuredWidth();
                    i9 = -1;
                    measuredHeight2 = view.getMeasuredHeight();
                    i10 = measuredWidth14;
                    baseline = view.getBaseline();
                }
            }
            if (baseline != i9) {
                i11 = 1;
            } else {
                i11 = i2;
            }
            if (i10 == auq.d) {
                z9 = 1;
            } else {
                z9 = 1;
            }
            auq.a = z9;
            z10 = i11;
            if (oooO00o.W) {
                z10 = 1;
            }
            if (z10 != 0) {
                auq.a = true;
            }
            auq.g = i10;
            auq.f = measuredHeight2;
            auq.i = z10;
            auq.h = baseline;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new SparseArray<>();
        this.c = new ArrayList<>(4);
        this.d = new O();
        this.f = 0;
        this.e = 0;
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.a = true;
        this.i = 263;
        this.j = null;
        this.k = null;
        this.m = -1;
        this.l = new HashMap<>();
        this.n = new SparseArray<>();
        this.f15o = new OooO0O0(this, this);
        h(attributeSet, 0, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof OooO00o;
    }

    /* JADX WARN: Code duplicated, block: B:258:0x0510  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a6  */
    public final boolean d() {
        boolean z;
        boolean z2;
        char c;
        int i;
        int i2;
        C0087m c0087m;
        C0087m c0087m2;
        C0087m c0087m3;
        C0087m c0087m4;
        int i3;
        int i4;
        float fAbs;
        int i5;
        String str;
        int iF;
        C0087m c0087m5;
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            z = true;
            if (i7 >= childCount) {
                z2 = false;
                break;
            }
            if (getChildAt(i7).isLayoutRequested()) {
                z2 = true;
                break;
            }
            i7++;
        }
        if (z2) {
            boolean zIsInEditMode = isInEditMode();
            int childCount2 = getChildCount();
            for (int i8 = 0; i8 < childCount2; i8++) {
                C0087m c0087mI = i(getChildAt(i8));
                if (c0087mI != null) {
                    c0087mI.v();
                }
            }
            Object obj = null;
            int i9 = -1;
            if (zIsInEditMode) {
                for (int i10 = 0; i10 < childCount2; i10++) {
                    View childAt = getChildAt(i10);
                    try {
                        String resourceName = getResources().getResourceName(childAt.getId());
                        k(0, resourceName, Integer.valueOf(childAt.getId()));
                        int iIndexOf = resourceName.indexOf(47);
                        if (iIndexOf != -1) {
                            resourceName = resourceName.substring(iIndexOf + 1);
                        }
                        int id = childAt.getId();
                        if (id == 0) {
                            c0087m5 = this.d;
                        } else {
                            View viewFindViewById = this.b.get(id);
                            if (viewFindViewById == null && (viewFindViewById = findViewById(id)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
                                onViewAdded(viewFindViewById);
                            }
                            c0087m5 = viewFindViewById == this ? this.d : viewFindViewById == null ? null : ((OooO00o) viewFindViewById.getLayoutParams()).al;
                        }
                        c0087m5.Z = resourceName;
                    } catch (Resources.NotFoundException unused) {
                    }
                }
            }
            if (this.m != -1) {
                for (int i11 = 0; i11 < childCount2; i11++) {
                    View childAt2 = getChildAt(i11);
                    if (childAt2.getId() == this.m && (childAt2 instanceof OooO0OO)) {
                        this.j = ((OooO0OO) childAt2).getConstraintSet();
                    }
                }
            }
            b bVar = this.j;
            if (bVar != null) {
                bVar.c(this, true);
            }
            this.d.ag.clear();
            int size = this.c.size();
            char c2 = 2;
            if (size > 0) {
                int i12 = 0;
                while (i12 < size) {
                    androidx.constraintlayout.widget.OooO00o oooO00o = this.c.get(i12);
                    if (oooO00o.isInEditMode()) {
                        oooO00o.setIds(oooO00o.d);
                    }
                    T t = oooO00o.e;
                    if (t != null) {
                        S s = (S) t;
                        s.ah = i6;
                        Arrays.fill(s.ag, obj);
                        for (int i13 = i6; i13 < oooO00o.b; i13++) {
                            int i14 = oooO00o.a[i13];
                            View viewG = g(i14);
                            if (viewG == null && (iF = oooO00o.f(this, (str = oooO00o.f.get(Integer.valueOf(i14))))) != 0) {
                                oooO00o.a[i13] = iF;
                                oooO00o.f.put(Integer.valueOf(iF), str);
                                viewG = g(iF);
                            }
                            if (viewG != null) {
                                T t2 = oooO00o.e;
                                C0087m c0087mI2 = i(viewG);
                                S s2 = (S) t2;
                                Objects.requireNonNull(s2);
                                if (c0087mI2 != s2 && c0087mI2 != null) {
                                    int i15 = s2.ah;
                                    C0087m[] c0087mArr = s2.ag;
                                    if (i15 + 1 > c0087mArr.length) {
                                        s2.ag = (C0087m[]) Arrays.copyOf(c0087mArr, c0087mArr.length * 2);
                                    }
                                    C0087m[] c0087mArr2 = s2.ag;
                                    int i16 = s2.ah;
                                    c0087mArr2[i16] = c0087mI2;
                                    s2.ah = i16 + 1;
                                }
                            }
                        }
                        oooO00o.e.b(this.d);
                    }
                    i12++;
                    i6 = 0;
                    obj = null;
                }
            }
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt3 = getChildAt(i17);
                if (childAt3 instanceof OooO0o) {
                    OooO0o oooO0o = (OooO0o) childAt3;
                    if (oooO0o.a == -1 && !oooO0o.isInEditMode()) {
                        oooO0o.setVisibility(oooO0o.c);
                    }
                    View viewFindViewById2 = findViewById(oooO0o.a);
                    oooO0o.b = viewFindViewById2;
                    if (viewFindViewById2 != null) {
                        ((OooO00o) viewFindViewById2.getLayoutParams()).Z = true;
                        oooO0o.b.setVisibility(0);
                        oooO0o.setVisibility(0);
                    }
                }
            }
            this.n.clear();
            this.n.put(0, this.d);
            this.n.put(getId(), this.d);
            for (int i18 = 0; i18 < childCount2; i18++) {
                View childAt4 = getChildAt(i18);
                this.n.put(childAt4.getId(), i(childAt4));
            }
            int i19 = 0;
            while (i19 < childCount2) {
                View childAt5 = getChildAt(i19);
                C0087m c0087mI3 = i(childAt5);
                if (c0087mI3 != null) {
                    OooO00o oooO00o2 = (OooO00o) childAt5.getLayoutParams();
                    O o2 = this.d;
                    o2.ag.add(c0087mI3);
                    C0087m c0087m6 = c0087mI3.N;
                    if (c0087m6 != null) {
                        ((R) c0087m6).ag.remove(c0087mI3);
                        c0087mI3.N = null;
                    }
                    c0087mI3.N = o2;
                    SparseArray<C0087m> sparseArray = this.n;
                    N.aTW atw = N.aTW.f;
                    N.aTW atw2 = N.aTW.d;
                    N.aTW atw3 = N.aTW.h;
                    N.aTW atw4 = N.aTW.e;
                    oooO00o2.d();
                    c0087mI3.Y = childAt5.getVisibility();
                    if (oooO00o2.Z) {
                        c0087mI3.v = z;
                        c0087mI3.Y = 8;
                    }
                    c0087mI3.X = childAt5;
                    if (childAt5 instanceof androidx.constraintlayout.widget.OooO00o) {
                        ((androidx.constraintlayout.widget.OooO00o) childAt5).g(c0087mI3, this.d.ak);
                    }
                    if (oooO00o2.X) {
                        Q q = (Q) c0087mI3;
                        int i20 = oooO00o2.ah;
                        int i21 = oooO00o2.ai;
                        float f = oooO00o2.ak;
                        if (f != -1.0f) {
                            if (f > -1.0f) {
                                q.ag = f;
                                q.ah = i9;
                                q.aj = i9;
                            }
                        } else if (i20 != i9) {
                            if (i20 >= 0) {
                                q.ag = -1.0f;
                                q.ah = i20;
                                q.aj = i9;
                            }
                        } else if (i21 != i9 && i21 >= 0) {
                            q.ag = -1.0f;
                            q.ah = i9;
                            q.aj = i21;
                        }
                        c = 2;
                    } else {
                        int i22 = oooO00o2.aa;
                        int i23 = oooO00o2.ab;
                        int i24 = oooO00o2.ac;
                        int i25 = oooO00o2.ad;
                        childCount2 = childCount2;
                        int i26 = oooO00o2.ae;
                        z2 = z2;
                        int i27 = oooO00o2.ag;
                        i19 = i19;
                        float f2 = oooO00o2.af;
                        zIsInEditMode = zIsInEditMode;
                        int i28 = oooO00o2.n;
                        if (i28 != -1) {
                            C0087m c0087m7 = sparseArray.get(i28);
                            if (c0087m7 != null) {
                                float f3 = oooO00o2.f16o;
                                int i29 = oooO00o2.m;
                                N.aTW atw5 = N.aTW.i;
                                c0087mI3.g(atw5).c(c0087m7.g(atw5), i29, 0, true);
                                c0087mI3.y = f3;
                            }
                        } else {
                            if (i22 != -1) {
                                C0087m c0087m8 = sparseArray.get(i22);
                                if (c0087m8 != null) {
                                    c0087mI3.g(atw2).c(c0087m8.g(atw2), ((ViewGroup.MarginLayoutParams) oooO00o2).leftMargin, i26, true);
                                    i2 = -1;
                                } else {
                                    i2 = -1;
                                }
                            } else {
                                i2 = -1;
                                if (i23 != -1 && (c0087m = sparseArray.get(i23)) != null) {
                                    c0087mI3.g(atw2).c(c0087m.g(atw), ((ViewGroup.MarginLayoutParams) oooO00o2).leftMargin, i26, true);
                                    i2 = -1;
                                }
                            }
                            if (i24 != i2) {
                                C0087m c0087m9 = sparseArray.get(i24);
                                if (c0087m9 != null) {
                                    c0087mI3.g(atw).c(c0087m9.g(atw2), ((ViewGroup.MarginLayoutParams) oooO00o2).rightMargin, i27, true);
                                }
                            } else if (i25 != i2 && (c0087m2 = sparseArray.get(i25)) != null) {
                                c0087mI3.g(atw).c(c0087m2.g(atw), ((ViewGroup.MarginLayoutParams) oooO00o2).rightMargin, i27, true);
                            }
                            int i30 = oooO00o2.i;
                            if (i30 != -1) {
                                C0087m c0087m10 = sparseArray.get(i30);
                                if (c0087m10 != null) {
                                    c0087mI3.g(atw4).c(c0087m10.g(atw4), ((ViewGroup.MarginLayoutParams) oooO00o2).topMargin, oooO00o2.u, true);
                                }
                            } else {
                                int i31 = oooO00o2.a;
                                if (i31 != -1 && (c0087m3 = sparseArray.get(i31)) != null) {
                                    c0087mI3.g(atw4).c(c0087m3.g(atw3), ((ViewGroup.MarginLayoutParams) oooO00o2).topMargin, oooO00o2.u, true);
                                }
                            }
                            int i32 = oooO00o2.j;
                            if (i32 != -1) {
                                C0087m c0087m11 = sparseArray.get(i32);
                                if (c0087m11 != null) {
                                    c0087mI3.g(atw3).c(c0087m11.g(atw4), ((ViewGroup.MarginLayoutParams) oooO00o2).bottomMargin, oooO00o2.x, true);
                                }
                            } else {
                                int i33 = oooO00o2.k;
                                if (i33 != -1 && (c0087m4 = sparseArray.get(i33)) != null) {
                                    c0087mI3.g(atw3).c(c0087m4.g(atw3), ((ViewGroup.MarginLayoutParams) oooO00o2).bottomMargin, oooO00o2.x, true);
                                }
                            }
                            int i34 = oooO00o2.l;
                            if (i34 != -1) {
                                View view = this.b.get(i34);
                                C0087m c0087m12 = sparseArray.get(oooO00o2.l);
                                if (c0087m12 != null && view != null && (view.getLayoutParams() instanceof OooO00o)) {
                                    OooO00o oooO00o3 = (OooO00o) view.getLayoutParams();
                                    oooO00o2.W = true;
                                    oooO00o3.W = true;
                                    N.aTW atw6 = N.aTW.g;
                                    c0087mI3.g(atw6).c(c0087m12.g(atw6), 0, -1, true);
                                    c0087mI3.z = true;
                                    oooO00o3.al.z = true;
                                    c0087mI3.g(atw4).h();
                                    c0087mI3.g(atw3).h();
                                }
                            }
                            if (f2 >= 0.0f) {
                                c0087mI3.W = f2;
                            }
                            float f4 = oooO00o2.A;
                            if (f4 >= 0.0f) {
                                c0087mI3.af = f4;
                            }
                        }
                        if (zIsInEditMode && ((i5 = oooO00o2.F) != -1 || oooO00o2.S != -1)) {
                            int i35 = oooO00o2.S;
                            c0087mI3.H = i5;
                            c0087mI3.U = i35;
                        }
                        if (oooO00o2.aj) {
                            c0087mI3.M[0] = 1;
                            c0087mI3.D(((ViewGroup.MarginLayoutParams) oooO00o2).width);
                            if (((ViewGroup.MarginLayoutParams) oooO00o2).width == -2) {
                                c0087mI3.M[0] = 2;
                            }
                        } else if (((ViewGroup.MarginLayoutParams) oooO00o2).width == -1) {
                            if (oooO00o2.T) {
                                c0087mI3.M[0] = 3;
                            } else {
                                c0087mI3.M[0] = 4;
                            }
                            c0087mI3.g(atw2).h = ((ViewGroup.MarginLayoutParams) oooO00o2).leftMargin;
                            c0087mI3.g(atw).h = ((ViewGroup.MarginLayoutParams) oooO00o2).rightMargin;
                        } else {
                            c0087mI3.M[0] = 3;
                            c0087mI3.D(0);
                        }
                        if (oooO00o2.V) {
                            i = -1;
                            c0087mI3.M[1] = 1;
                            c0087mI3.y(((ViewGroup.MarginLayoutParams) oooO00o2).height);
                            if (((ViewGroup.MarginLayoutParams) oooO00o2).height == -2) {
                                c0087mI3.M[1] = 2;
                            }
                        } else {
                            i = -1;
                            if (((ViewGroup.MarginLayoutParams) oooO00o2).height == -1) {
                                if (oooO00o2.Q) {
                                    c0087mI3.M[1] = 3;
                                } else {
                                    c0087mI3.M[1] = 4;
                                }
                                c0087mI3.g(atw4).h = ((ViewGroup.MarginLayoutParams) oooO00o2).topMargin;
                                c0087mI3.g(atw3).h = ((ViewGroup.MarginLayoutParams) oooO00o2).bottomMargin;
                            } else {
                                c0087mI3.M[1] = 3;
                                c0087mI3.y(0);
                            }
                        }
                        String str2 = oooO00o2.C;
                        if (str2 == null || str2.length() == 0) {
                            c0087mI3.Q = 0.0f;
                        } else {
                            int length = str2.length();
                            int iIndexOf2 = str2.indexOf(44);
                            if (iIndexOf2 <= 0 || iIndexOf2 >= length - 1) {
                                i3 = i;
                                i4 = 0;
                            } else {
                                String strSubstring = str2.substring(0, iIndexOf2);
                                i3 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : i;
                                i4 = iIndexOf2 + 1;
                            }
                            int iIndexOf3 = str2.indexOf(58);
                            if (iIndexOf3 < 0 || iIndexOf3 >= length - 1) {
                                String strSubstring2 = str2.substring(i4);
                                if (strSubstring2.length() > 0) {
                                    fAbs = Float.parseFloat(strSubstring2);
                                } else {
                                    fAbs = 0.0f;
                                }
                            } else {
                                String strSubstring3 = str2.substring(i4, iIndexOf3);
                                String strSubstring4 = str2.substring(iIndexOf3 + 1);
                                if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                    fAbs = 0.0f;
                                } else {
                                    try {
                                        float f5 = Float.parseFloat(strSubstring3);
                                        float f6 = Float.parseFloat(strSubstring4);
                                        if (f5 <= 0.0f || f6 <= 0.0f) {
                                            fAbs = 0.0f;
                                        } else {
                                            fAbs = i3 == 1 ? Math.abs(f6 / f5) : Math.abs(f5 / f6);
                                        }
                                    } catch (NumberFormatException unused2) {
                                    }
                                }
                            }
                            if (fAbs > 0.0f) {
                                c0087mI3.Q = fAbs;
                                c0087mI3.R = i3;
                            }
                        }
                        float f7 = oooO00o2.D;
                        float[] fArr = c0087mI3.ac;
                        fArr[0] = f7;
                        z = true;
                        fArr[1] = oooO00o2.E;
                        c0087mI3.aa = oooO00o2.H;
                        c0087mI3.ab = oooO00o2.I;
                        int i36 = oooO00o2.J;
                        int i37 = oooO00o2.K;
                        int i38 = oooO00o2.N;
                        float f8 = oooO00o2.O;
                        c0087mI3.l = i36;
                        c0087mI3.p = i37;
                        if (i38 == Integer.MAX_VALUE) {
                            i38 = 0;
                        }
                        c0087mI3.f65o = i38;
                        c0087mI3.q = f8;
                        if (f8 > 0.0f && f8 < 1.0f && i36 == 0) {
                            c0087mI3.l = 2;
                        }
                        int i39 = oooO00o2.G;
                        int i40 = oooO00o2.L;
                        int i41 = oooO00o2.M;
                        float f9 = oooO00o2.P;
                        c0087mI3.m = i39;
                        c0087mI3.r = i40;
                        if (i41 == Integer.MAX_VALUE) {
                            i41 = 0;
                        }
                        c0087mI3.t = i41;
                        c0087mI3.s = f9;
                        if (f9 <= 0.0f || f9 >= 1.0f || i39 != 0) {
                            c = 2;
                        } else {
                            c = 2;
                            c0087mI3.m = 2;
                        }
                    }
                    c2 = c;
                    i9 = i;
                    childCount2 = childCount2;
                    z2 = z2;
                    zIsInEditMode = zIsInEditMode;
                    i19++;
                } else {
                    c = c2;
                }
                i = i9;
                c2 = c;
                i9 = i;
                childCount2 = childCount2;
                z2 = z2;
                zIsInEditMode = zIsInEditMode;
                i19++;
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.OooO00o> arrayList = this.c;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                Objects.requireNonNull(this.c.get(i));
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        int i8 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + i8;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public OooO00o generateDefaultLayoutParams() {
        return new OooO00o(-2, -2);
    }

    public Object f(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.l;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.l.get(str);
    }

    @Override // android.view.View
    public void forceLayout() {
        this.a = true;
        super.forceLayout();
    }

    public View g(int i) {
        return this.b.get(i);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new OooO00o(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.h;
    }

    public int getMaxWidth() {
        return this.g;
    }

    public int getMinHeight() {
        return this.e;
    }

    public int getMinWidth() {
        return this.f;
    }

    public int getOptimizationLevel() {
        return this.d.ar;
    }

    public final void h(AttributeSet attributeSet, int i, int i2) {
        O o2 = this.d;
        o2.X = this;
        OooO0O0 oooO0O0 = this.f15o;
        o2.ai = oooO0O0;
        o2.aj.g = oooO0O0;
        this.b.put(getId(), this);
        this.j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.g, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == 9) {
                    this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                } else if (index == 10) {
                    this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                } else if (index == 7) {
                    this.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                } else if (index == 8) {
                    this.h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.h);
                } else if (index == 89) {
                    this.i = typedArrayObtainStyledAttributes.getInt(index, this.i);
                } else if (index == 38) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            this.k = new c(getContext(), this, resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.k = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        b bVar = new b();
                        this.j = bVar;
                        bVar.g(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.j = null;
                    }
                    this.m = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.d.K(this.i);
    }

    public final C0087m i(View view) {
        if (view == this) {
            return this.d;
        }
        if (view == null) {
            return null;
        }
        return ((OooO00o) view.getLayoutParams()).al;
    }

    public boolean j() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    public void k(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.l == null) {
                this.l = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.l.put(strSubstring, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            OooO00o oooO00o = (OooO00o) childAt.getLayoutParams();
            C0087m c0087m = oooO00o.al;
            if ((childAt.getVisibility() != 8 || oooO00o.X || oooO00o.Y || zIsInEditMode) && !oooO00o.Z) {
                int iQ = c0087m.q();
                int iS = c0087m.s();
                int iP = c0087m.p() + iQ;
                int iC = c0087m.c() + iS;
                childAt.layout(iQ, iS, iP, iC);
                if ((childAt instanceof OooO0o) && (content = ((OooO0o) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iQ, iS, iP, iC);
                }
            }
        }
        int size = this.c.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                Objects.requireNonNull(this.c.get(i6));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0204 A[PHI: r7
  0x0204: PHI (r7v3 boolean) = (r7v2 boolean), (r7v53 boolean) binds: [B:69:0x01a8, B:376:0x0204] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x020a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:103:0x020c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x0215  */
    /* JADX WARN: Code duplicated, block: B:110:0x022f  */
    /* JADX WARN: Code duplicated, block: B:114:0x023d  */
    /* JADX WARN: Code duplicated, block: B:118:0x024b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:195:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:197:0x040a  */
    /* JADX WARN: Code duplicated, block: B:200:0x0418 A[LOOP:12: B:198:0x0412->B:200:0x0418, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:202:0x0459  */
    /* JADX WARN: Code duplicated, block: B:205:0x0479  */
    /* JADX WARN: Code duplicated, block: B:206:0x0484  */
    /* JADX WARN: Code duplicated, block: B:208:0x0489  */
    /* JADX WARN: Code duplicated, block: B:209:0x0497  */
    /* JADX WARN: Code duplicated, block: B:211:0x049b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:212:0x049d  */
    /* JADX WARN: Code duplicated, block: B:213:0x049f  */
    /* JADX WARN: Code duplicated, block: B:215:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:216:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:218:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:220:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:224:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:226:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:228:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:231:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:236:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:239:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:245:0x0502  */
    /* JADX WARN: Code duplicated, block: B:249:0x0514  */
    /* JADX WARN: Code duplicated, block: B:251:0x051e  */
    /* JADX WARN: Code duplicated, block: B:253:0x0524  */
    /* JADX WARN: Code duplicated, block: B:255:0x0540  */
    /* JADX WARN: Code duplicated, block: B:258:0x0553  */
    /* JADX WARN: Code duplicated, block: B:263:0x056f  */
    /* JADX WARN: Code duplicated, block: B:265:0x0572 A[LOOP:6: B:264:0x0570->B:265:0x0572, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:268:0x058c  */
    /* JADX WARN: Code duplicated, block: B:270:0x0591  */
    /* JADX WARN: Code duplicated, block: B:272:0x0598  */
    /* JADX WARN: Code duplicated, block: B:273:0x059a  */
    /* JADX WARN: Code duplicated, block: B:276:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:277:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:280:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:282:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:284:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:286:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:289:0x060e  */
    /* JADX WARN: Code duplicated, block: B:291:0x0613  */
    /* JADX WARN: Code duplicated, block: B:293:0x0617  */
    /* JADX WARN: Code duplicated, block: B:295:0x061c  */
    /* JADX WARN: Code duplicated, block: B:298:0x0637  */
    /* JADX WARN: Code duplicated, block: B:300:0x063c  */
    /* JADX WARN: Code duplicated, block: B:302:0x0643  */
    /* JADX WARN: Code duplicated, block: B:306:0x0665  */
    /* JADX WARN: Code duplicated, block: B:308:0x066b  */
    /* JADX WARN: Code duplicated, block: B:310:0x0679  */
    /* JADX WARN: Code duplicated, block: B:312:0x067d  */
    /* JADX WARN: Code duplicated, block: B:318:0x0693  */
    /* JADX WARN: Code duplicated, block: B:349:0x0734  */
    /* JADX WARN: Code duplicated, block: B:350:0x0739  */
    /* JADX WARN: Code duplicated, block: B:354:0x074c  */
    /* JADX WARN: Code duplicated, block: B:356:0x0755  */
    /* JADX WARN: Code duplicated, block: B:357:0x075a  */
    /* JADX WARN: Code duplicated, block: B:360:0x0761  */
    /* JADX WARN: Code duplicated, block: B:361:0x0765 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:364:0x076d  */
    /* JADX WARN: Code duplicated, block: B:368:0x07b0  */
    /* JADX WARN: Code duplicated, block: B:370:0x07b3  */
    /* JADX WARN: Code duplicated, block: B:376:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:407:0x0562 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:408:0x0562 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:46:0x0103  */
    /* JADX WARN: Code duplicated, block: B:47:0x0106  */
    /* JADX WARN: Code duplicated, block: B:48:0x0110 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0112  */
    /* JADX WARN: Code duplicated, block: B:50:0x011c  */
    /* JADX WARN: Code duplicated, block: B:51:0x011e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0121  */
    /* JADX WARN: Code duplicated, block: B:54:0x0128  */
    /* JADX WARN: Code duplicated, block: B:58:0x0130  */
    /* JADX WARN: Code duplicated, block: B:62:0x013c  */
    /* JADX WARN: Code duplicated, block: B:65:0x019d  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:70:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:74:0x01be  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:81:0x01cc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:88:0x01de A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x01e0  */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int iMax;
        int i3;
        int iMin;
        int i4;
        int i5;
        int iMax2;
        int i6;
        int i7;
        A a;
        N.aTW atw;
        N.aTW atw2;
        A.aJL ajl;
        int size;
        int iP;
        int iC;
        boolean zI;
        boolean z;
        boolean z2;
        int i8;
        N.aTW atw3;
        boolean z3;
        int i9;
        int i10;
        int size2;
        O o2;
        int i11;
        boolean z4;
        boolean z5;
        int iMax3;
        int iMax4;
        int i12;
        boolean z6;
        A.aJL ajl2;
        int i13;
        int i14;
        int i15;
        boolean z7;
        boolean zC;
        int i16;
        O o3;
        int i17;
        C0087m c0087m;
        int i18;
        O o4;
        int i19;
        C0087m c0087m2;
        N.aTW atw4;
        N.aTW atw5;
        A.aJL ajl3;
        int iP2;
        int iC2;
        int iP3;
        boolean z8;
        int iC3;
        int size3;
        A.aJL ajl4;
        int i20;
        OooO0O0 oooO0O0;
        int childCount;
        int i21;
        int size4;
        int i22;
        View childAt;
        OooO0o oooO0o;
        OooO00o oooO00o;
        OooO00o oooO00o2;
        C0087m c0087m3;
        int iJ;
        boolean z9;
        boolean z10;
        int iMin2;
        int iMin3;
        int iMin4;
        int iMin5;
        C c;
        int i23;
        int i24;
        int i25;
        boolean zJ;
        int i26;
        boolean z11;
        boolean z12;
        int i27;
        boolean z13;
        int i28;
        C0087m c0087m4;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        this.d.ak = j();
        if (this.a) {
            this.a = false;
            if (d()) {
                O o5 = this.d;
                A a2 = o5.ah;
                a2.c.clear();
                int size5 = o5.ag.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    C0087m c0087m5 = o5.ag.get(i29);
                    if (c0087m5.k() == 3 || c0087m5.k() == 4 || c0087m5.n() == 3 || c0087m5.n() == 4) {
                        a2.c.add(c0087m5);
                    }
                }
                o5.G();
            }
        }
        O o6 = this.d;
        int i30 = this.i;
        int mode = View.MeasureSpec.getMode(i);
        int size6 = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size7 = View.MeasureSpec.getSize(i2);
        int iMax5 = Math.max(0, getPaddingTop());
        int iMax6 = Math.max(0, getPaddingBottom());
        int i31 = iMax5 + iMax6;
        int paddingWidth = getPaddingWidth();
        OooO0O0 oooO0O1 = this.f15o;
        oooO0O1.b = iMax5;
        oooO0O1.c = iMax6;
        oooO0O1.d = paddingWidth;
        oooO0O1.f = i31;
        oooO0O1.e = i;
        oooO0O1.g = i2;
        int iMax7 = Math.max(0, getPaddingStart());
        int iMax8 = Math.max(0, getPaddingEnd());
        if (iMax7 <= 0 && iMax8 <= 0) {
            iMax7 = Math.max(0, getPaddingLeft());
        } else if (j()) {
            iMax7 = iMax8;
        }
        int i32 = size6 - paddingWidth;
        int i33 = size7 - i31;
        OooO0O0 oooO0O2 = this.f15o;
        int i34 = oooO0O2.f;
        int i35 = oooO0O2.d;
        int childCount2 = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                iMax = childCount2 == 0 ? Math.max(0, this.f) : 0;
            } else if (mode != 1073741824) {
                iMax = 0;
                i3 = 1;
                i5 = Integer.MIN_VALUE;
                int i36 = i3;
                iMin = iMax;
                i4 = i36;
            } else {
                iMin = Math.min(this.g - i35, i32);
                i5 = Integer.MIN_VALUE;
                i4 = 1;
            }
            if (mode2 != i5) {
                if (mode2 != 0) {
                    if (mode2 != 1073741824) {
                        i6 = 1;
                        iMax2 = 0;
                    } else {
                        iMax2 = Math.min(this.h - i34, i33);
                        i6 = 1;
                    }
                } else if (childCount2 == 0) {
                    iMax2 = Math.max(0, this.e);
                } else {
                    iMax2 = 0;
                }
                if (iMin == o6.p() || iMax2 != o6.c()) {
                    o6.aj.e = true;
                    i7 = 0;
                } else {
                    i7 = 0;
                }
                o6.H = i7;
                o6.U = i7;
                int i37 = this.g;
                int[] iArr = o6.w;
                iArr[i7] = i37 - i35;
                iArr[1] = this.h - i34;
                o6.z(i7);
                o6.A(i7);
                o6.M[i7] = i4;
                o6.D(iMin);
                o6.M[1] = i6;
                o6.y(iMax2);
                o6.z(this.f - i35);
                o6.A(this.e - i34);
                o6.as = iMax7;
                o6.au = iMax5;
                a = o6.ah;
                Objects.requireNonNull(a);
                atw = N.aTW.h;
                atw2 = N.aTW.f;
                ajl = o6.ai;
                size = o6.ag.size();
                iP = o6.p();
                iC = o6.c();
                zI = h.i(i30, 128);
                if (!zI || h.i(i30, 64)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i28 = 0;
                    while (true) {
                        if (i28 < size) {
                            c0087m4 = o6.ag.get(i28);
                            z14 = z;
                            if (c0087m4.k() == 3) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (c0087m4.n() == 3) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (z15 || !z16 || c0087m4.Q <= 0.0f) {
                                z17 = false;
                            } else {
                                z17 = true;
                            }
                            if ((c0087m4.t() || !z17) && !((c0087m4.w() && z17) || (c0087m4 instanceof L) || c0087m4.t() || c0087m4.w())) {
                                i28++;
                                z = z14;
                            } else {
                                i8 = 1073741824;
                                z2 = false;
                            }
                        } else {
                            z2 = z;
                            i8 = 1073741824;
                        }
                    }
                } else {
                    z2 = z;
                    i8 = 1073741824;
                }
                if (z2 && ((mode != i8 && mode2 == i8) || zI)) {
                    iMin4 = Math.min(o6.w[0], i32);
                    iMin5 = Math.min(o6.w[1], i33);
                    if (mode == 1073741824 && o6.p() != iMin4) {
                        o6.D(iMin4);
                        o6.G();
                    }
                    if (mode2 == 1073741824 && o6.c() != iMin5) {
                        o6.y(iMin5);
                        o6.G();
                    }
                    if (mode == 1073741824 || mode2 != 1073741824) {
                        atw3 = atw;
                        atw2 = atw2;
                        ajl = ajl;
                        c = o6.aj;
                        if (c.d) {
                            for (C0087m c0087m6 : c.c.ag) {
                                c0087m6.d = false;
                                D d = c0087m6.g;
                                d.i.l = false;
                                d.j = false;
                                d.o();
                                X x = c0087m6.i;
                                x.i.l = false;
                                x.j = false;
                                x.o();
                            }
                            i23 = 0;
                            O o7 = c.c;
                            o7.d = false;
                            D d2 = o7.g;
                            d2.i.l = false;
                            d2.j = false;
                            d2.o();
                            X x2 = c.c.i;
                            x2.i.l = false;
                            x2.j = false;
                            x2.o();
                            c.e();
                        } else {
                            i23 = 0;
                        }
                        c.d(c.f);
                        O o8 = c.c;
                        o8.H = i23;
                        o8.U = i23;
                        o8.g.k.e(i23);
                        c.c.i.k.e(i23);
                        i24 = 1073741824;
                        if (mode == 1073741824) {
                            i25 = 1;
                            i26 = 1;
                            zJ = o6.J(zI, i23) & true;
                        } else {
                            i25 = 1;
                            zJ = true;
                            i26 = 0;
                        }
                        if (mode2 == 1073741824) {
                            boolean zJ2 = zJ & o6.J(zI, i25);
                            i9 = i26 + 1;
                            z3 = zJ2;
                        } else {
                            i9 = i26;
                            z3 = zJ;
                        }
                    } else {
                        C c2 = o6.aj;
                        boolean z18 = zI & true;
                        if (c2.d || c2.e) {
                            for (C0087m c0087m7 : c2.c.ag) {
                                c0087m7.d = false;
                                c0087m7.g.o();
                                c0087m7.i.o();
                            }
                            i27 = 0;
                            O o9 = c2.c;
                            o9.d = false;
                            o9.g.o();
                            c2.c.i.o();
                            c2.e = false;
                        } else {
                            i27 = 0;
                        }
                        c2.d(c2.f);
                        O o10 = c2.c;
                        o10.H = i27;
                        o10.U = i27;
                        int iJ2 = o10.j(i27);
                        int iJ3 = c2.c.j(1);
                        if (c2.d) {
                            c2.e();
                        }
                        int iQ = c2.c.q();
                        int iS = c2.c.s();
                        atw3 = atw;
                        c2.c.g.k.e(iQ);
                        c2.c.i.k.e(iS);
                        c2.i();
                        if (iJ2 == 2 || iJ3 == 2) {
                            if (z18) {
                                Iterator<Y> it = c2.h.iterator();
                                while (it.hasNext()) {
                                    if (!it.next().m()) {
                                        z18 = false;
                                        break;
                                    }
                                }
                            }
                            if (z18 && iJ2 == 2) {
                                O o11 = c2.c;
                                o11.M[0] = 1;
                                o11.D(c2.f(o11, 0));
                                O o12 = c2.c;
                                o12.g.i.e(o12.p());
                            }
                            if (z18 && iJ3 == 2) {
                                O o13 = c2.c;
                                o13.M[1] = 1;
                                o13.y(c2.f(o13, 1));
                                O o14 = c2.c;
                                o14.i.i.e(o14.c());
                            }
                        } else {
                            atw2 = atw2;
                            ajl = ajl;
                        }
                        O o15 = c2.c;
                        int i38 = o15.M[0];
                        if (i38 == 1 || i38 == 4) {
                            int iP4 = o15.p() + iQ;
                            c2.c.g.c.e(iP4);
                            c2.c.g.i.e(iP4 - iQ);
                            c2.i();
                            O o16 = c2.c;
                            int i39 = o16.M[1];
                            if (i39 == 1 || i39 == 4) {
                                int iC4 = o16.c() + iS;
                                c2.c.i.c.e(iC4);
                                c2.c.i.i.e(iC4 - iS);
                            }
                            c2.i();
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        for (Y y : c2.h) {
                            if (y.e != c2.c || y.j) {
                                y.i();
                            }
                        }
                        Iterator<Y> it2 = c2.h.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z3 = true;
                                break;
                            }
                            Y next = it2.next();
                            if (z13 || next.e != c2.c) {
                                if (!next.k.l || ((!next.c.l && !(next instanceof W)) || (!next.i.l && !(next instanceof am) && !(next instanceof W)))) {
                                    z3 = false;
                                    break;
                                }
                            }
                        }
                        c2.c.u(iJ2);
                        c2.c.B(iJ3);
                        i24 = 1073741824;
                        i9 = 2;
                    }
                    if (z3) {
                        if (mode == i24) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (mode2 == i24) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        o6.C(z11, z12);
                    }
                } else {
                    atw3 = atw;
                    atw2 = atw2;
                    ajl = ajl;
                    z3 = false;
                    i9 = 0;
                }
                if (z3 || i9 != 2) {
                    if (size > 0) {
                        size3 = o6.ag.size();
                        ajl4 = o6.ai;
                        for (i20 = 0; i20 < size3; i20++) {
                            c0087m3 = o6.ag.get(i20);
                            if ((c0087m3 instanceof Q) && (!c0087m3.g.i.l || !c0087m3.i.i.l)) {
                                iJ = c0087m3.j(0);
                                int iJ4 = c0087m3.j(1);
                                if (iJ == 3 || c0087m3.l == 1 || iJ4 != 3 || c0087m3.m == 1) {
                                    a.c(ajl4, c0087m3, false);
                                }
                            }
                        }
                        oooO0O0 = (OooO0O0) ajl4;
                        childCount = oooO0O0.a.getChildCount();
                        for (i21 = 0; i21 < childCount; i21++) {
                            childAt = oooO0O0.a.getChildAt(i21);
                            if (childAt instanceof OooO0o) {
                                oooO0o = (OooO0o) childAt;
                                if (oooO0o.b != null) {
                                    oooO00o = (OooO00o) oooO0o.getLayoutParams();
                                    oooO00o2 = (OooO00o) oooO0o.b.getLayoutParams();
                                    oooO00o2.al.Y = 0;
                                    if (oooO00o.al.k() != 1) {
                                        oooO00o.al.D(oooO00o2.al.p());
                                    }
                                    if (oooO00o.al.n() != 1) {
                                        oooO00o.al.y(oooO00o2.al.c());
                                    }
                                    oooO00o2.al.Y = 8;
                                }
                            }
                        }
                        size4 = oooO0O0.a.c.size();
                        if (size4 > 0) {
                            for (i22 = 0; i22 < size4; i22++) {
                                Objects.requireNonNull(oooO0O0.a.c.get(i22));
                            }
                        }
                    }
                    i10 = o6.ar;
                    size2 = a.c.size();
                    if (size > 0) {
                        a.d(o6, iP, iC);
                    }
                    if (size2 > 0) {
                        if (o6.k() == 2) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (o6.n() == 2) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        iMax3 = Math.max(o6.p(), a.e.V);
                        iMax4 = Math.max(o6.c(), a.e.S);
                        i12 = 0;
                        z6 = false;
                        while (i12 < size2) {
                            c0087m2 = a.c.get(i12);
                            if (c0087m2 instanceof L) {
                                iP2 = c0087m2.p();
                                iC2 = c0087m2.c();
                                ajl3 = ajl;
                                boolean zC2 = a.c(ajl3, c0087m2, true);
                                iP3 = c0087m2.p();
                                z8 = z6 | zC2;
                                iC3 = c0087m2.c();
                                if (iP3 != iP2) {
                                    c0087m2.D(iP3);
                                    if (z4 || c0087m2.o() <= iMax3) {
                                        atw5 = atw2;
                                    } else {
                                        atw5 = atw2;
                                        iMax3 = Math.max(iMax3, c0087m2.g(atw5).d() + c0087m2.o());
                                    }
                                    z8 = true;
                                } else {
                                    atw5 = atw2;
                                }
                                if (iC3 != iC2) {
                                    c0087m2.y(iC3);
                                    if (z5 || c0087m2.i() <= iMax4) {
                                        atw4 = atw3;
                                    } else {
                                        atw4 = atw3;
                                        iMax4 = Math.max(iMax4, c0087m2.g(atw4).d() + c0087m2.i());
                                    }
                                    z8 = true;
                                } else {
                                    atw4 = atw3;
                                }
                                z6 = z8;
                            } else {
                                atw4 = atw3;
                                atw5 = atw2;
                                ajl3 = ajl;
                            }
                            i12++;
                            ajl = ajl3;
                            atw2 = atw5;
                            atw3 = atw4;
                            i10 = i10;
                        }
                        int i40 = i10;
                        N.aTW atw6 = atw3;
                        N.aTW atw7 = atw2;
                        ajl2 = ajl;
                        i13 = 0;
                        i14 = 2;
                        while (i13 < i14) {
                            int iMax9 = iMax4;
                            int iMax10 = iMax3;
                            zC = z6;
                            i16 = 0;
                            while (i16 < size2) {
                                c0087m = a.c.get(i16);
                                int i41 = size2;
                                if (((c0087m instanceof T) || (c0087m instanceof L)) && !(c0087m instanceof Q)) {
                                    i18 = i13;
                                    if (c0087m.Y == 8 && ((!c0087m.g.i.l || !c0087m.i.i.l) && !(c0087m instanceof L))) {
                                        int iP5 = c0087m.p();
                                        int iC5 = c0087m.c();
                                        o4 = o6;
                                        int i42 = c0087m.T;
                                        i19 = iP;
                                        zC |= a.c(ajl2, c0087m, true);
                                        int iP6 = c0087m.p();
                                        ajl2 = ajl2;
                                        int iC6 = c0087m.c();
                                        if (iP6 != iP5) {
                                            c0087m.D(iP6);
                                            if (z4 && c0087m.o() > iMax10) {
                                                iMax10 = Math.max(iMax10, c0087m.g(atw7).d() + c0087m.o());
                                            }
                                            zC = true;
                                        }
                                        if (iC6 != iC5) {
                                            c0087m.y(iC6);
                                            if (z5 && c0087m.i() > iMax9) {
                                                iMax9 = Math.max(iMax9, c0087m.g(atw6).d() + c0087m.i());
                                            }
                                            zC = true;
                                        }
                                        if (c0087m.z && i42 != c0087m.T) {
                                            zC = true;
                                        }
                                    }
                                    i16++;
                                    size2 = i41;
                                    i13 = i18;
                                    o6 = o4;
                                    iP = i19;
                                    ajl2 = ajl2;
                                } else {
                                    i18 = i13;
                                }
                                o4 = o6;
                                i19 = iP;
                                i16++;
                                size2 = i41;
                                i13 = i18;
                                o6 = o4;
                                iP = i19;
                                ajl2 = ajl2;
                            }
                            A.aJL ajl5 = ajl2;
                            int i43 = i13;
                            o3 = o6;
                            int i44 = size2;
                            i17 = iP;
                            if (zC) {
                                a.d(o3, i17, iC);
                                z6 = false;
                            } else {
                                z6 = zC;
                            }
                            iP = i17;
                            i13 = i43 + 1;
                            iMax3 = iMax10;
                            iMax4 = iMax9;
                            size2 = i44;
                            i14 = 2;
                            o6 = o3;
                            ajl2 = ajl5;
                        }
                        o2 = o6;
                        i15 = iP;
                        if (z6) {
                            a.d(o2, i15, iC);
                            if (o2.p() < iMax3) {
                                o2.D(iMax3);
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (o2.c() < iMax4) {
                                o2.y(iMax4);
                            } else if (z7) {
                            }
                            a.d(o2, i15, iC);
                        }
                        i11 = i40;
                    } else {
                        o2 = o6;
                        i11 = i10;
                    }
                    o2.K(i11);
                }
                int iP7 = this.d.p();
                int iC7 = this.d.c();
                O o17 = this.d;
                z9 = o17.at;
                z10 = o17.aq;
                OooO0O0 oooO0O3 = this.f15o;
                int i45 = oooO0O3.f;
                int iResolveSizeAndState = ViewGroup.resolveSizeAndState(iP7 + oooO0O3.d, i, 0);
                int iResolveSizeAndState2 = ViewGroup.resolveSizeAndState(iC7 + i45, i2, 0);
                iMin2 = Math.min(this.g, iResolveSizeAndState & 16777215);
                iMin3 = Math.min(this.h, iResolveSizeAndState2 & 16777215);
                if (z9) {
                    iMin2 |= 16777216;
                }
                if (z10) {
                    iMin3 |= 16777216;
                }
                setMeasuredDimension(iMin2, iMin3);
            }
            if (childCount2 == 0) {
                iMax2 = Math.max(0, this.e);
            } else {
                iMax2 = i33;
            }
            i6 = 2;
            if (iMin == o6.p()) {
                o6.aj.e = true;
                i7 = 0;
            } else {
                o6.aj.e = true;
                i7 = 0;
            }
            o6.H = i7;
            o6.U = i7;
            int i310 = this.g;
            int[] iArr2 = o6.w;
            iArr2[i7] = i310 - i35;
            iArr2[1] = this.h - i34;
            o6.z(i7);
            o6.A(i7);
            o6.M[i7] = i4;
            o6.D(iMin);
            o6.M[1] = i6;
            o6.y(iMax2);
            o6.z(this.f - i35);
            o6.A(this.e - i34);
            o6.as = iMax7;
            o6.au = iMax5;
            a = o6.ah;
            Objects.requireNonNull(a);
            atw = N.aTW.h;
            atw2 = N.aTW.f;
            ajl = o6.ai;
            size = o6.ag.size();
            iP = o6.p();
            iC = o6.c();
            zI = h.i(i30, 128);
            if (zI) {
                z = true;
            } else {
                z = true;
            }
            if (z) {
                i28 = 0;
                while (true) {
                    if (i28 < size) {
                        c0087m4 = o6.ag.get(i28);
                        z14 = z;
                        if (c0087m4.k() == 3) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (c0087m4.n() == 3) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (z15) {
                            z17 = false;
                        } else {
                            z17 = false;
                        }
                        if (c0087m4.t()) {
                            i28++;
                            z = z14;
                        } else {
                            i28++;
                            z = z14;
                        }
                        i8 = 1073741824;
                        z2 = false;
                    } else {
                        z2 = z;
                        i8 = 1073741824;
                    }
                }
            } else {
                z2 = z;
                i8 = 1073741824;
            }
            if (z2 && ((mode != i8 && mode2 == i8) || zI)) {
                iMin4 = Math.min(o6.w[0], i32);
                iMin5 = Math.min(o6.w[1], i33);
                if (mode == 1073741824) {
                    o6.D(iMin4);
                    o6.G();
                }
                if (mode2 == 1073741824) {
                    o6.y(iMin5);
                    o6.G();
                }
                if (mode == 1073741824) {
                    atw3 = atw;
                    atw2 = atw2;
                    ajl = ajl;
                    c = o6.aj;
                    if (c.d) {
                        while (r2.hasNext()) {
                            c0087m6.d = false;
                            D d3 = c0087m6.g;
                            d3.i.l = false;
                            d3.j = false;
                            d3.o();
                            X x3 = c0087m6.i;
                            x3.i.l = false;
                            x3.j = false;
                            x3.o();
                        }
                        i23 = 0;
                        O o18 = c.c;
                        o18.d = false;
                        D d4 = o18.g;
                        d4.i.l = false;
                        d4.j = false;
                        d4.o();
                        X x4 = c.c.i;
                        x4.i.l = false;
                        x4.j = false;
                        x4.o();
                        c.e();
                    } else {
                        i23 = 0;
                    }
                    c.d(c.f);
                    O o19 = c.c;
                    o19.H = i23;
                    o19.U = i23;
                    o19.g.k.e(i23);
                    c.c.i.k.e(i23);
                    i24 = 1073741824;
                    if (mode == 1073741824) {
                        i25 = 1;
                        i26 = 1;
                        zJ = o6.J(zI, i23) & true;
                    } else {
                        i25 = 1;
                        zJ = true;
                        i26 = 0;
                    }
                    if (mode2 == 1073741824) {
                        boolean zJ3 = zJ & o6.J(zI, i25);
                        i9 = i26 + 1;
                        z3 = zJ3;
                    } else {
                        i9 = i26;
                        z3 = zJ;
                    }
                } else {
                    atw3 = atw;
                    atw2 = atw2;
                    ajl = ajl;
                    c = o6.aj;
                    if (c.d) {
                        while (r2.hasNext()) {
                            c0087m6.d = false;
                            D d5 = c0087m6.g;
                            d5.i.l = false;
                            d5.j = false;
                            d5.o();
                            X x5 = c0087m6.i;
                            x5.i.l = false;
                            x5.j = false;
                            x5.o();
                        }
                        i23 = 0;
                        O o110 = c.c;
                        o110.d = false;
                        D d6 = o110.g;
                        d6.i.l = false;
                        d6.j = false;
                        d6.o();
                        X x6 = c.c.i;
                        x6.i.l = false;
                        x6.j = false;
                        x6.o();
                        c.e();
                    } else {
                        i23 = 0;
                    }
                    c.d(c.f);
                    O o111 = c.c;
                    o111.H = i23;
                    o111.U = i23;
                    o111.g.k.e(i23);
                    c.c.i.k.e(i23);
                    i24 = 1073741824;
                    if (mode == 1073741824) {
                        i25 = 1;
                        i26 = 1;
                        zJ = o6.J(zI, i23) & true;
                    } else {
                        i25 = 1;
                        zJ = true;
                        i26 = 0;
                    }
                    if (mode2 == 1073741824) {
                        boolean zJ4 = zJ & o6.J(zI, i25);
                        i9 = i26 + 1;
                        z3 = zJ4;
                    } else {
                        i9 = i26;
                        z3 = zJ;
                    }
                }
                if (z3) {
                    if (mode == i24) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (mode2 == i24) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    o6.C(z11, z12);
                }
            } else {
                atw3 = atw;
                atw2 = atw2;
                ajl = ajl;
                z3 = false;
                i9 = 0;
            }
            if (z3) {
                if (size > 0) {
                    size3 = o6.ag.size();
                    ajl4 = o6.ai;
                    while (i20 < size3) {
                        c0087m3 = o6.ag.get(i20);
                        if (c0087m3 instanceof Q) {
                            iJ = c0087m3.j(0);
                            int iJ5 = c0087m3.j(1);
                            if (iJ == 3) {
                                a.c(ajl4, c0087m3, false);
                            } else {
                                a.c(ajl4, c0087m3, false);
                            }
                        }
                    }
                    oooO0O0 = (OooO0O0) ajl4;
                    childCount = oooO0O0.a.getChildCount();
                    while (i21 < childCount) {
                        childAt = oooO0O0.a.getChildAt(i21);
                        if (childAt instanceof OooO0o) {
                            oooO0o = (OooO0o) childAt;
                            if (oooO0o.b != null) {
                                oooO00o = (OooO00o) oooO0o.getLayoutParams();
                                oooO00o2 = (OooO00o) oooO0o.b.getLayoutParams();
                                oooO00o2.al.Y = 0;
                                if (oooO00o.al.k() != 1) {
                                    oooO00o.al.D(oooO00o2.al.p());
                                }
                                if (oooO00o.al.n() != 1) {
                                    oooO00o.al.y(oooO00o2.al.c());
                                }
                                oooO00o2.al.Y = 8;
                            }
                        }
                    }
                    size4 = oooO0O0.a.c.size();
                    if (size4 > 0) {
                        while (i22 < size4) {
                            Objects.requireNonNull(oooO0O0.a.c.get(i22));
                        }
                    }
                }
                i10 = o6.ar;
                size2 = a.c.size();
                if (size > 0) {
                    a.d(o6, iP, iC);
                }
                if (size2 > 0) {
                    if (o6.k() == 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (o6.n() == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    iMax3 = Math.max(o6.p(), a.e.V);
                    iMax4 = Math.max(o6.c(), a.e.S);
                    i12 = 0;
                    z6 = false;
                    while (i12 < size2) {
                        c0087m2 = a.c.get(i12);
                        if (c0087m2 instanceof L) {
                            iP2 = c0087m2.p();
                            iC2 = c0087m2.c();
                            ajl3 = ajl;
                            boolean zC3 = a.c(ajl3, c0087m2, true);
                            iP3 = c0087m2.p();
                            z8 = z6 | zC3;
                            iC3 = c0087m2.c();
                            if (iP3 != iP2) {
                                c0087m2.D(iP3);
                                if (z4) {
                                    atw5 = atw2;
                                } else {
                                    atw5 = atw2;
                                }
                                z8 = true;
                            } else {
                                atw5 = atw2;
                            }
                            if (iC3 != iC2) {
                                c0087m2.y(iC3);
                                if (z5) {
                                    atw4 = atw3;
                                } else {
                                    atw4 = atw3;
                                }
                                z8 = true;
                            } else {
                                atw4 = atw3;
                            }
                            z6 = z8;
                        } else {
                            atw4 = atw3;
                            atw5 = atw2;
                            ajl3 = ajl;
                        }
                        i12++;
                        ajl = ajl3;
                        atw2 = atw5;
                        atw3 = atw4;
                        i10 = i10;
                    }
                    int i46 = i10;
                    N.aTW atw8 = atw3;
                    N.aTW atw9 = atw2;
                    ajl2 = ajl;
                    i13 = 0;
                    i14 = 2;
                    while (i13 < i14) {
                        int iMax11 = iMax4;
                        int iMax12 = iMax3;
                        zC = z6;
                        i16 = 0;
                        while (i16 < size2) {
                            c0087m = a.c.get(i16);
                            int i47 = size2;
                            if (c0087m instanceof T) {
                                i18 = i13;
                                if (c0087m.Y == 8) {
                                }
                                o4 = o6;
                                i19 = iP;
                            } else {
                                i18 = i13;
                                if (c0087m.Y == 8) {
                                }
                                o4 = o6;
                                i19 = iP;
                            }
                            i16++;
                            size2 = i47;
                            i13 = i18;
                            o6 = o4;
                            iP = i19;
                            ajl2 = ajl2;
                        }
                        A.aJL ajl6 = ajl2;
                        int i48 = i13;
                        o3 = o6;
                        int i49 = size2;
                        i17 = iP;
                        if (zC) {
                            a.d(o3, i17, iC);
                            z6 = false;
                        } else {
                            z6 = zC;
                        }
                        iP = i17;
                        i13 = i48 + 1;
                        iMax3 = iMax12;
                        iMax4 = iMax11;
                        size2 = i49;
                        i14 = 2;
                        o6 = o3;
                        ajl2 = ajl6;
                    }
                    o2 = o6;
                    i15 = iP;
                    if (z6) {
                        a.d(o2, i15, iC);
                        if (o2.p() < iMax3) {
                            o2.D(iMax3);
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (o2.c() < iMax4) {
                            o2.y(iMax4);
                        } else if (z7) {
                        }
                        a.d(o2, i15, iC);
                    }
                    i11 = i46;
                } else {
                    o2 = o6;
                    i11 = i10;
                }
                o2.K(i11);
            } else {
                if (size > 0) {
                    size3 = o6.ag.size();
                    ajl4 = o6.ai;
                    while (i20 < size3) {
                        c0087m3 = o6.ag.get(i20);
                        if (c0087m3 instanceof Q) {
                            iJ = c0087m3.j(0);
                            int iJ6 = c0087m3.j(1);
                            if (iJ == 3) {
                                a.c(ajl4, c0087m3, false);
                            } else {
                                a.c(ajl4, c0087m3, false);
                            }
                        }
                    }
                    oooO0O0 = (OooO0O0) ajl4;
                    childCount = oooO0O0.a.getChildCount();
                    while (i21 < childCount) {
                        childAt = oooO0O0.a.getChildAt(i21);
                        if (childAt instanceof OooO0o) {
                            oooO0o = (OooO0o) childAt;
                            if (oooO0o.b != null) {
                                oooO00o = (OooO00o) oooO0o.getLayoutParams();
                                oooO00o2 = (OooO00o) oooO0o.b.getLayoutParams();
                                oooO00o2.al.Y = 0;
                                if (oooO00o.al.k() != 1) {
                                    oooO00o.al.D(oooO00o2.al.p());
                                }
                                if (oooO00o.al.n() != 1) {
                                    oooO00o.al.y(oooO00o2.al.c());
                                }
                                oooO00o2.al.Y = 8;
                            }
                        }
                    }
                    size4 = oooO0O0.a.c.size();
                    if (size4 > 0) {
                        while (i22 < size4) {
                            Objects.requireNonNull(oooO0O0.a.c.get(i22));
                        }
                    }
                }
                i10 = o6.ar;
                size2 = a.c.size();
                if (size > 0) {
                    a.d(o6, iP, iC);
                }
                if (size2 > 0) {
                    if (o6.k() == 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (o6.n() == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    iMax3 = Math.max(o6.p(), a.e.V);
                    iMax4 = Math.max(o6.c(), a.e.S);
                    i12 = 0;
                    z6 = false;
                    while (i12 < size2) {
                        c0087m2 = a.c.get(i12);
                        if (c0087m2 instanceof L) {
                            iP2 = c0087m2.p();
                            iC2 = c0087m2.c();
                            ajl3 = ajl;
                            boolean zC4 = a.c(ajl3, c0087m2, true);
                            iP3 = c0087m2.p();
                            z8 = z6 | zC4;
                            iC3 = c0087m2.c();
                            if (iP3 != iP2) {
                                c0087m2.D(iP3);
                                if (z4) {
                                    atw5 = atw2;
                                } else {
                                    atw5 = atw2;
                                }
                                z8 = true;
                            } else {
                                atw5 = atw2;
                            }
                            if (iC3 != iC2) {
                                c0087m2.y(iC3);
                                if (z5) {
                                    atw4 = atw3;
                                } else {
                                    atw4 = atw3;
                                }
                                z8 = true;
                            } else {
                                atw4 = atw3;
                            }
                            z6 = z8;
                        } else {
                            atw4 = atw3;
                            atw5 = atw2;
                            ajl3 = ajl;
                        }
                        i12++;
                        ajl = ajl3;
                        atw2 = atw5;
                        atw3 = atw4;
                        i10 = i10;
                    }
                    int i410 = i10;
                    N.aTW atw10 = atw3;
                    N.aTW atw11 = atw2;
                    ajl2 = ajl;
                    i13 = 0;
                    i14 = 2;
                    while (i13 < i14) {
                        int iMax13 = iMax4;
                        int iMax14 = iMax3;
                        zC = z6;
                        i16 = 0;
                        while (i16 < size2) {
                            c0087m = a.c.get(i16);
                            int i411 = size2;
                            if (c0087m instanceof T) {
                                i18 = i13;
                                if (c0087m.Y == 8) {
                                }
                                o4 = o6;
                                i19 = iP;
                            } else {
                                i18 = i13;
                                if (c0087m.Y == 8) {
                                }
                                o4 = o6;
                                i19 = iP;
                            }
                            i16++;
                            size2 = i411;
                            i13 = i18;
                            o6 = o4;
                            iP = i19;
                            ajl2 = ajl2;
                        }
                        A.aJL ajl7 = ajl2;
                        int i412 = i13;
                        o3 = o6;
                        int i413 = size2;
                        i17 = iP;
                        if (zC) {
                            a.d(o3, i17, iC);
                            z6 = false;
                        } else {
                            z6 = zC;
                        }
                        iP = i17;
                        i13 = i412 + 1;
                        iMax3 = iMax14;
                        iMax4 = iMax13;
                        size2 = i413;
                        i14 = 2;
                        o6 = o3;
                        ajl2 = ajl7;
                    }
                    o2 = o6;
                    i15 = iP;
                    if (z6) {
                        a.d(o2, i15, iC);
                        if (o2.p() < iMax3) {
                            o2.D(iMax3);
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (o2.c() < iMax4) {
                            o2.y(iMax4);
                        } else if (z7) {
                        }
                        a.d(o2, i15, iC);
                    }
                    i11 = i410;
                } else {
                    o2 = o6;
                    i11 = i10;
                }
                o2.K(i11);
            }
            int iP8 = this.d.p();
            int iC8 = this.d.c();
            O o112 = this.d;
            z9 = o112.at;
            z10 = o112.aq;
            OooO0O0 oooO0O4 = this.f15o;
            int i414 = oooO0O4.f;
            int iResolveSizeAndState3 = ViewGroup.resolveSizeAndState(iP8 + oooO0O4.d, i, 0);
            int iResolveSizeAndState4 = ViewGroup.resolveSizeAndState(iC8 + i414, i2, 0);
            iMin2 = Math.min(this.g, iResolveSizeAndState3 & 16777215);
            iMin3 = Math.min(this.h, iResolveSizeAndState4 & 16777215);
            if (z9) {
                iMin2 |= 16777216;
            }
            if (z10) {
                iMin3 |= 16777216;
            }
            setMeasuredDimension(iMin2, iMin3);
        }
        iMax = childCount2 == 0 ? Math.max(0, this.f) : i32;
        i3 = 2;
        i5 = Integer.MIN_VALUE;
        int i311 = i3;
        iMin = iMax;
        i4 = i311;
        if (mode2 != i5) {
            if (mode2 != 0) {
                if (mode2 != 1073741824) {
                    i6 = 1;
                    iMax2 = 0;
                } else {
                    iMax2 = Math.min(this.h - i34, i33);
                    i6 = 1;
                }
            } else if (childCount2 == 0) {
                iMax2 = Math.max(0, this.e);
            } else {
                iMax2 = 0;
            }
            if (iMin == o6.p()) {
                o6.aj.e = true;
                i7 = 0;
            } else {
                o6.aj.e = true;
                i7 = 0;
            }
            o6.H = i7;
            o6.U = i7;
            int i312 = this.g;
            int[] iArr3 = o6.w;
            iArr3[i7] = i312 - i35;
            iArr3[1] = this.h - i34;
            o6.z(i7);
            o6.A(i7);
            o6.M[i7] = i4;
            o6.D(iMin);
            o6.M[1] = i6;
            o6.y(iMax2);
            o6.z(this.f - i35);
            o6.A(this.e - i34);
            o6.as = iMax7;
            o6.au = iMax5;
            a = o6.ah;
            Objects.requireNonNull(a);
            atw = N.aTW.h;
            atw2 = N.aTW.f;
            ajl = o6.ai;
            size = o6.ag.size();
            iP = o6.p();
            iC = o6.c();
            zI = h.i(i30, 128);
            if (zI) {
                z = true;
            } else {
                z = true;
            }
            if (z) {
                i28 = 0;
                while (true) {
                    if (i28 < size) {
                        c0087m4 = o6.ag.get(i28);
                        z14 = z;
                        if (c0087m4.k() == 3) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (c0087m4.n() == 3) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (z15) {
                            z17 = false;
                        } else {
                            z17 = false;
                        }
                        if (c0087m4.t()) {
                            i28++;
                            z = z14;
                        } else {
                            i28++;
                            z = z14;
                        }
                        i8 = 1073741824;
                        z2 = false;
                    } else {
                        z2 = z;
                        i8 = 1073741824;
                    }
                }
            } else {
                z2 = z;
                i8 = 1073741824;
            }
            if (z2 && ((mode != i8 && mode2 == i8) || zI)) {
                iMin4 = Math.min(o6.w[0], i32);
                iMin5 = Math.min(o6.w[1], i33);
                if (mode == 1073741824) {
                    o6.D(iMin4);
                    o6.G();
                }
                if (mode2 == 1073741824) {
                    o6.y(iMin5);
                    o6.G();
                }
                if (mode == 1073741824) {
                    atw3 = atw;
                    atw2 = atw2;
                    ajl = ajl;
                    c = o6.aj;
                    if (c.d) {
                        while (r2.hasNext()) {
                            c0087m6.d = false;
                            D d7 = c0087m6.g;
                            d7.i.l = false;
                            d7.j = false;
                            d7.o();
                            X x7 = c0087m6.i;
                            x7.i.l = false;
                            x7.j = false;
                            x7.o();
                        }
                        i23 = 0;
                        O o113 = c.c;
                        o113.d = false;
                        D d8 = o113.g;
                        d8.i.l = false;
                        d8.j = false;
                        d8.o();
                        X x8 = c.c.i;
                        x8.i.l = false;
                        x8.j = false;
                        x8.o();
                        c.e();
                    } else {
                        i23 = 0;
                    }
                    c.d(c.f);
                    O o114 = c.c;
                    o114.H = i23;
                    o114.U = i23;
                    o114.g.k.e(i23);
                    c.c.i.k.e(i23);
                    i24 = 1073741824;
                    if (mode == 1073741824) {
                        i25 = 1;
                        i26 = 1;
                        zJ = o6.J(zI, i23) & true;
                    } else {
                        i25 = 1;
                        zJ = true;
                        i26 = 0;
                    }
                    if (mode2 == 1073741824) {
                        boolean zJ5 = zJ & o6.J(zI, i25);
                        i9 = i26 + 1;
                        z3 = zJ5;
                    } else {
                        i9 = i26;
                        z3 = zJ;
                    }
                } else {
                    atw3 = atw;
                    atw2 = atw2;
                    ajl = ajl;
                    c = o6.aj;
                    if (c.d) {
                        while (r2.hasNext()) {
                            c0087m6.d = false;
                            D d9 = c0087m6.g;
                            d9.i.l = false;
                            d9.j = false;
                            d9.o();
                            X x9 = c0087m6.i;
                            x9.i.l = false;
                            x9.j = false;
                            x9.o();
                        }
                        i23 = 0;
                        O o115 = c.c;
                        o115.d = false;
                        D d10 = o115.g;
                        d10.i.l = false;
                        d10.j = false;
                        d10.o();
                        X x10 = c.c.i;
                        x10.i.l = false;
                        x10.j = false;
                        x10.o();
                        c.e();
                    } else {
                        i23 = 0;
                    }
                    c.d(c.f);
                    O o116 = c.c;
                    o116.H = i23;
                    o116.U = i23;
                    o116.g.k.e(i23);
                    c.c.i.k.e(i23);
                    i24 = 1073741824;
                    if (mode == 1073741824) {
                        i25 = 1;
                        i26 = 1;
                        zJ = o6.J(zI, i23) & true;
                    } else {
                        i25 = 1;
                        zJ = true;
                        i26 = 0;
                    }
                    if (mode2 == 1073741824) {
                        boolean zJ6 = zJ & o6.J(zI, i25);
                        i9 = i26 + 1;
                        z3 = zJ6;
                    } else {
                        i9 = i26;
                        z3 = zJ;
                    }
                }
                if (z3) {
                    if (mode == i24) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (mode2 == i24) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    o6.C(z11, z12);
                }
            } else {
                atw3 = atw;
                atw2 = atw2;
                ajl = ajl;
                z3 = false;
                i9 = 0;
            }
            if (z3) {
                if (size > 0) {
                    size3 = o6.ag.size();
                    ajl4 = o6.ai;
                    while (i20 < size3) {
                        c0087m3 = o6.ag.get(i20);
                        if (c0087m3 instanceof Q) {
                            iJ = c0087m3.j(0);
                            int iJ7 = c0087m3.j(1);
                            if (iJ == 3) {
                                a.c(ajl4, c0087m3, false);
                            } else {
                                a.c(ajl4, c0087m3, false);
                            }
                        }
                    }
                    oooO0O0 = (OooO0O0) ajl4;
                    childCount = oooO0O0.a.getChildCount();
                    while (i21 < childCount) {
                        childAt = oooO0O0.a.getChildAt(i21);
                        if (childAt instanceof OooO0o) {
                            oooO0o = (OooO0o) childAt;
                            if (oooO0o.b != null) {
                                oooO00o = (OooO00o) oooO0o.getLayoutParams();
                                oooO00o2 = (OooO00o) oooO0o.b.getLayoutParams();
                                oooO00o2.al.Y = 0;
                                if (oooO00o.al.k() != 1) {
                                    oooO00o.al.D(oooO00o2.al.p());
                                }
                                if (oooO00o.al.n() != 1) {
                                    oooO00o.al.y(oooO00o2.al.c());
                                }
                                oooO00o2.al.Y = 8;
                            }
                        }
                    }
                    size4 = oooO0O0.a.c.size();
                    if (size4 > 0) {
                        while (i22 < size4) {
                            Objects.requireNonNull(oooO0O0.a.c.get(i22));
                        }
                    }
                }
                i10 = o6.ar;
                size2 = a.c.size();
                if (size > 0) {
                    a.d(o6, iP, iC);
                }
                if (size2 > 0) {
                    if (o6.k() == 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (o6.n() == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    iMax3 = Math.max(o6.p(), a.e.V);
                    iMax4 = Math.max(o6.c(), a.e.S);
                    i12 = 0;
                    z6 = false;
                    while (i12 < size2) {
                        c0087m2 = a.c.get(i12);
                        if (c0087m2 instanceof L) {
                            iP2 = c0087m2.p();
                            iC2 = c0087m2.c();
                            ajl3 = ajl;
                            boolean zC5 = a.c(ajl3, c0087m2, true);
                            iP3 = c0087m2.p();
                            z8 = z6 | zC5;
                            iC3 = c0087m2.c();
                            if (iP3 != iP2) {
                                c0087m2.D(iP3);
                                if (z4) {
                                    atw5 = atw2;
                                } else {
                                    atw5 = atw2;
                                }
                                z8 = true;
                            } else {
                                atw5 = atw2;
                            }
                            if (iC3 != iC2) {
                                c0087m2.y(iC3);
                                if (z5) {
                                    atw4 = atw3;
                                } else {
                                    atw4 = atw3;
                                }
                                z8 = true;
                            } else {
                                atw4 = atw3;
                            }
                            z6 = z8;
                        } else {
                            atw4 = atw3;
                            atw5 = atw2;
                            ajl3 = ajl;
                        }
                        i12++;
                        ajl = ajl3;
                        atw2 = atw5;
                        atw3 = atw4;
                        i10 = i10;
                    }
                    int i415 = i10;
                    N.aTW atw12 = atw3;
                    N.aTW atw13 = atw2;
                    ajl2 = ajl;
                    i13 = 0;
                    i14 = 2;
                    while (i13 < i14) {
                        int iMax15 = iMax4;
                        int iMax16 = iMax3;
                        zC = z6;
                        i16 = 0;
                        while (i16 < size2) {
                            c0087m = a.c.get(i16);
                            int i416 = size2;
                            if (c0087m instanceof T) {
                                i18 = i13;
                                if (c0087m.Y == 8) {
                                }
                                o4 = o6;
                                i19 = iP;
                            } else {
                                i18 = i13;
                                if (c0087m.Y == 8) {
                                }
                                o4 = o6;
                                i19 = iP;
                            }
                            i16++;
                            size2 = i416;
                            i13 = i18;
                            o6 = o4;
                            iP = i19;
                            ajl2 = ajl2;
                        }
                        A.aJL ajl8 = ajl2;
                        int i417 = i13;
                        o3 = o6;
                        int i418 = size2;
                        i17 = iP;
                        if (zC) {
                            a.d(o3, i17, iC);
                            z6 = false;
                        } else {
                            z6 = zC;
                        }
                        iP = i17;
                        i13 = i417 + 1;
                        iMax3 = iMax16;
                        iMax4 = iMax15;
                        size2 = i418;
                        i14 = 2;
                        o6 = o3;
                        ajl2 = ajl8;
                    }
                    o2 = o6;
                    i15 = iP;
                    if (z6) {
                        a.d(o2, i15, iC);
                        if (o2.p() < iMax3) {
                            o2.D(iMax3);
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (o2.c() < iMax4) {
                            o2.y(iMax4);
                        } else if (z7) {
                        }
                        a.d(o2, i15, iC);
                    }
                    i11 = i415;
                } else {
                    o2 = o6;
                    i11 = i10;
                }
                o2.K(i11);
            } else {
                if (size > 0) {
                    size3 = o6.ag.size();
                    ajl4 = o6.ai;
                    while (i20 < size3) {
                        c0087m3 = o6.ag.get(i20);
                        if (c0087m3 instanceof Q) {
                            iJ = c0087m3.j(0);
                            int iJ8 = c0087m3.j(1);
                            if (iJ == 3) {
                                a.c(ajl4, c0087m3, false);
                            } else {
                                a.c(ajl4, c0087m3, false);
                            }
                        }
                    }
                    oooO0O0 = (OooO0O0) ajl4;
                    childCount = oooO0O0.a.getChildCount();
                    while (i21 < childCount) {
                        childAt = oooO0O0.a.getChildAt(i21);
                        if (childAt instanceof OooO0o) {
                            oooO0o = (OooO0o) childAt;
                            if (oooO0o.b != null) {
                                oooO00o = (OooO00o) oooO0o.getLayoutParams();
                                oooO00o2 = (OooO00o) oooO0o.b.getLayoutParams();
                                oooO00o2.al.Y = 0;
                                if (oooO00o.al.k() != 1) {
                                    oooO00o.al.D(oooO00o2.al.p());
                                }
                                if (oooO00o.al.n() != 1) {
                                    oooO00o.al.y(oooO00o2.al.c());
                                }
                                oooO00o2.al.Y = 8;
                            }
                        }
                    }
                    size4 = oooO0O0.a.c.size();
                    if (size4 > 0) {
                        while (i22 < size4) {
                            Objects.requireNonNull(oooO0O0.a.c.get(i22));
                        }
                    }
                }
                i10 = o6.ar;
                size2 = a.c.size();
                if (size > 0) {
                    a.d(o6, iP, iC);
                }
                if (size2 > 0) {
                    if (o6.k() == 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (o6.n() == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    iMax3 = Math.max(o6.p(), a.e.V);
                    iMax4 = Math.max(o6.c(), a.e.S);
                    i12 = 0;
                    z6 = false;
                    while (i12 < size2) {
                        c0087m2 = a.c.get(i12);
                        if (c0087m2 instanceof L) {
                            iP2 = c0087m2.p();
                            iC2 = c0087m2.c();
                            ajl3 = ajl;
                            boolean zC6 = a.c(ajl3, c0087m2, true);
                            iP3 = c0087m2.p();
                            z8 = z6 | zC6;
                            iC3 = c0087m2.c();
                            if (iP3 != iP2) {
                                c0087m2.D(iP3);
                                if (z4) {
                                    atw5 = atw2;
                                } else {
                                    atw5 = atw2;
                                }
                                z8 = true;
                            } else {
                                atw5 = atw2;
                            }
                            if (iC3 != iC2) {
                                c0087m2.y(iC3);
                                if (z5) {
                                    atw4 = atw3;
                                } else {
                                    atw4 = atw3;
                                }
                                z8 = true;
                            } else {
                                atw4 = atw3;
                            }
                            z6 = z8;
                        } else {
                            atw4 = atw3;
                            atw5 = atw2;
                            ajl3 = ajl;
                        }
                        i12++;
                        ajl = ajl3;
                        atw2 = atw5;
                        atw3 = atw4;
                        i10 = i10;
                    }
                    int i419 = i10;
                    N.aTW atw14 = atw3;
                    N.aTW atw15 = atw2;
                    ajl2 = ajl;
                    i13 = 0;
                    i14 = 2;
                    while (i13 < i14) {
                        int iMax17 = iMax4;
                        int iMax18 = iMax3;
                        zC = z6;
                        i16 = 0;
                        while (i16 < size2) {
                            c0087m = a.c.get(i16);
                            int i4110 = size2;
                            if (c0087m instanceof T) {
                                i18 = i13;
                                if (c0087m.Y == 8) {
                                }
                                o4 = o6;
                                i19 = iP;
                            } else {
                                i18 = i13;
                                if (c0087m.Y == 8) {
                                }
                                o4 = o6;
                                i19 = iP;
                            }
                            i16++;
                            size2 = i4110;
                            i13 = i18;
                            o6 = o4;
                            iP = i19;
                            ajl2 = ajl2;
                        }
                        A.aJL ajl9 = ajl2;
                        int i4111 = i13;
                        o3 = o6;
                        int i4112 = size2;
                        i17 = iP;
                        if (zC) {
                            a.d(o3, i17, iC);
                            z6 = false;
                        } else {
                            z6 = zC;
                        }
                        iP = i17;
                        i13 = i4111 + 1;
                        iMax3 = iMax18;
                        iMax4 = iMax17;
                        size2 = i4112;
                        i14 = 2;
                        o6 = o3;
                        ajl2 = ajl9;
                    }
                    o2 = o6;
                    i15 = iP;
                    if (z6) {
                        a.d(o2, i15, iC);
                        if (o2.p() < iMax3) {
                            o2.D(iMax3);
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (o2.c() < iMax4) {
                            o2.y(iMax4);
                        } else if (z7) {
                        }
                        a.d(o2, i15, iC);
                    }
                    i11 = i419;
                } else {
                    o2 = o6;
                    i11 = i10;
                }
                o2.K(i11);
            }
            int iP9 = this.d.p();
            int iC9 = this.d.c();
            O o117 = this.d;
            z9 = o117.at;
            z10 = o117.aq;
            OooO0O0 oooO0O5 = this.f15o;
            int i4113 = oooO0O5.f;
            int iResolveSizeAndState5 = ViewGroup.resolveSizeAndState(iP9 + oooO0O5.d, i, 0);
            int iResolveSizeAndState6 = ViewGroup.resolveSizeAndState(iC9 + i4113, i2, 0);
            iMin2 = Math.min(this.g, iResolveSizeAndState5 & 16777215);
            iMin3 = Math.min(this.h, iResolveSizeAndState6 & 16777215);
            if (z9) {
                iMin2 |= 16777216;
            }
            if (z10) {
                iMin3 |= 16777216;
            }
            setMeasuredDimension(iMin2, iMin3);
        }
        if (childCount2 == 0) {
            iMax2 = Math.max(0, this.e);
        } else {
            iMax2 = i33;
        }
        i6 = 2;
        if (iMin == o6.p()) {
            o6.aj.e = true;
            i7 = 0;
        } else {
            o6.aj.e = true;
            i7 = 0;
        }
        o6.H = i7;
        o6.U = i7;
        int i313 = this.g;
        int[] iArr4 = o6.w;
        iArr4[i7] = i313 - i35;
        iArr4[1] = this.h - i34;
        o6.z(i7);
        o6.A(i7);
        o6.M[i7] = i4;
        o6.D(iMin);
        o6.M[1] = i6;
        o6.y(iMax2);
        o6.z(this.f - i35);
        o6.A(this.e - i34);
        o6.as = iMax7;
        o6.au = iMax5;
        a = o6.ah;
        Objects.requireNonNull(a);
        atw = N.aTW.h;
        atw2 = N.aTW.f;
        ajl = o6.ai;
        size = o6.ag.size();
        iP = o6.p();
        iC = o6.c();
        zI = h.i(i30, 128);
        if (zI) {
            z = true;
        } else {
            z = true;
        }
        if (z) {
            i28 = 0;
            while (true) {
                if (i28 < size) {
                    c0087m4 = o6.ag.get(i28);
                    z14 = z;
                    if (c0087m4.k() == 3) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0087m4.n() == 3) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (z15) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    if (c0087m4.t()) {
                        i28++;
                        z = z14;
                    } else {
                        i28++;
                        z = z14;
                    }
                    i8 = 1073741824;
                    z2 = false;
                } else {
                    z2 = z;
                    i8 = 1073741824;
                }
            }
        } else {
            z2 = z;
            i8 = 1073741824;
        }
        if (z2 && ((mode != i8 && mode2 == i8) || zI)) {
            iMin4 = Math.min(o6.w[0], i32);
            iMin5 = Math.min(o6.w[1], i33);
            if (mode == 1073741824) {
                o6.D(iMin4);
                o6.G();
            }
            if (mode2 == 1073741824) {
                o6.y(iMin5);
                o6.G();
            }
            if (mode == 1073741824) {
                atw3 = atw;
                atw2 = atw2;
                ajl = ajl;
                c = o6.aj;
                if (c.d) {
                    while (r2.hasNext()) {
                        c0087m6.d = false;
                        D d11 = c0087m6.g;
                        d11.i.l = false;
                        d11.j = false;
                        d11.o();
                        X x11 = c0087m6.i;
                        x11.i.l = false;
                        x11.j = false;
                        x11.o();
                    }
                    i23 = 0;
                    O o118 = c.c;
                    o118.d = false;
                    D d12 = o118.g;
                    d12.i.l = false;
                    d12.j = false;
                    d12.o();
                    X x12 = c.c.i;
                    x12.i.l = false;
                    x12.j = false;
                    x12.o();
                    c.e();
                } else {
                    i23 = 0;
                }
                c.d(c.f);
                O o119 = c.c;
                o119.H = i23;
                o119.U = i23;
                o119.g.k.e(i23);
                c.c.i.k.e(i23);
                i24 = 1073741824;
                if (mode == 1073741824) {
                    i25 = 1;
                    i26 = 1;
                    zJ = o6.J(zI, i23) & true;
                } else {
                    i25 = 1;
                    zJ = true;
                    i26 = 0;
                }
                if (mode2 == 1073741824) {
                    boolean zJ7 = zJ & o6.J(zI, i25);
                    i9 = i26 + 1;
                    z3 = zJ7;
                } else {
                    i9 = i26;
                    z3 = zJ;
                }
            } else {
                atw3 = atw;
                atw2 = atw2;
                ajl = ajl;
                c = o6.aj;
                if (c.d) {
                    while (r2.hasNext()) {
                        c0087m6.d = false;
                        D d13 = c0087m6.g;
                        d13.i.l = false;
                        d13.j = false;
                        d13.o();
                        X x13 = c0087m6.i;
                        x13.i.l = false;
                        x13.j = false;
                        x13.o();
                    }
                    i23 = 0;
                    O o1110 = c.c;
                    o1110.d = false;
                    D d14 = o1110.g;
                    d14.i.l = false;
                    d14.j = false;
                    d14.o();
                    X x14 = c.c.i;
                    x14.i.l = false;
                    x14.j = false;
                    x14.o();
                    c.e();
                } else {
                    i23 = 0;
                }
                c.d(c.f);
                O o1111 = c.c;
                o1111.H = i23;
                o1111.U = i23;
                o1111.g.k.e(i23);
                c.c.i.k.e(i23);
                i24 = 1073741824;
                if (mode == 1073741824) {
                    i25 = 1;
                    i26 = 1;
                    zJ = o6.J(zI, i23) & true;
                } else {
                    i25 = 1;
                    zJ = true;
                    i26 = 0;
                }
                if (mode2 == 1073741824) {
                    boolean zJ8 = zJ & o6.J(zI, i25);
                    i9 = i26 + 1;
                    z3 = zJ8;
                } else {
                    i9 = i26;
                    z3 = zJ;
                }
            }
            if (z3) {
                if (mode == i24) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (mode2 == i24) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                o6.C(z11, z12);
            }
        } else {
            atw3 = atw;
            atw2 = atw2;
            ajl = ajl;
            z3 = false;
            i9 = 0;
        }
        if (z3) {
            if (size > 0) {
                size3 = o6.ag.size();
                ajl4 = o6.ai;
                while (i20 < size3) {
                    c0087m3 = o6.ag.get(i20);
                    if (c0087m3 instanceof Q) {
                        iJ = c0087m3.j(0);
                        int iJ9 = c0087m3.j(1);
                        if (iJ == 3) {
                            a.c(ajl4, c0087m3, false);
                        } else {
                            a.c(ajl4, c0087m3, false);
                        }
                    }
                }
                oooO0O0 = (OooO0O0) ajl4;
                childCount = oooO0O0.a.getChildCount();
                while (i21 < childCount) {
                    childAt = oooO0O0.a.getChildAt(i21);
                    if (childAt instanceof OooO0o) {
                        oooO0o = (OooO0o) childAt;
                        if (oooO0o.b != null) {
                            oooO00o = (OooO00o) oooO0o.getLayoutParams();
                            oooO00o2 = (OooO00o) oooO0o.b.getLayoutParams();
                            oooO00o2.al.Y = 0;
                            if (oooO00o.al.k() != 1) {
                                oooO00o.al.D(oooO00o2.al.p());
                            }
                            if (oooO00o.al.n() != 1) {
                                oooO00o.al.y(oooO00o2.al.c());
                            }
                            oooO00o2.al.Y = 8;
                        }
                    }
                }
                size4 = oooO0O0.a.c.size();
                if (size4 > 0) {
                    while (i22 < size4) {
                        Objects.requireNonNull(oooO0O0.a.c.get(i22));
                    }
                }
            }
            i10 = o6.ar;
            size2 = a.c.size();
            if (size > 0) {
                a.d(o6, iP, iC);
            }
            if (size2 > 0) {
                if (o6.k() == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (o6.n() == 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                iMax3 = Math.max(o6.p(), a.e.V);
                iMax4 = Math.max(o6.c(), a.e.S);
                i12 = 0;
                z6 = false;
                while (i12 < size2) {
                    c0087m2 = a.c.get(i12);
                    if (c0087m2 instanceof L) {
                        iP2 = c0087m2.p();
                        iC2 = c0087m2.c();
                        ajl3 = ajl;
                        boolean zC7 = a.c(ajl3, c0087m2, true);
                        iP3 = c0087m2.p();
                        z8 = z6 | zC7;
                        iC3 = c0087m2.c();
                        if (iP3 != iP2) {
                            c0087m2.D(iP3);
                            if (z4) {
                                atw5 = atw2;
                            } else {
                                atw5 = atw2;
                            }
                            z8 = true;
                        } else {
                            atw5 = atw2;
                        }
                        if (iC3 != iC2) {
                            c0087m2.y(iC3);
                            if (z5) {
                                atw4 = atw3;
                            } else {
                                atw4 = atw3;
                            }
                            z8 = true;
                        } else {
                            atw4 = atw3;
                        }
                        z6 = z8;
                    } else {
                        atw4 = atw3;
                        atw5 = atw2;
                        ajl3 = ajl;
                    }
                    i12++;
                    ajl = ajl3;
                    atw2 = atw5;
                    atw3 = atw4;
                    i10 = i10;
                }
                int i4114 = i10;
                N.aTW atw16 = atw3;
                N.aTW atw17 = atw2;
                ajl2 = ajl;
                i13 = 0;
                i14 = 2;
                while (i13 < i14) {
                    int iMax19 = iMax4;
                    int iMax110 = iMax3;
                    zC = z6;
                    i16 = 0;
                    while (i16 < size2) {
                        c0087m = a.c.get(i16);
                        int i4115 = size2;
                        if (c0087m instanceof T) {
                            i18 = i13;
                            if (c0087m.Y == 8) {
                            }
                            o4 = o6;
                            i19 = iP;
                        } else {
                            i18 = i13;
                            if (c0087m.Y == 8) {
                            }
                            o4 = o6;
                            i19 = iP;
                        }
                        i16++;
                        size2 = i4115;
                        i13 = i18;
                        o6 = o4;
                        iP = i19;
                        ajl2 = ajl2;
                    }
                    A.aJL ajl10 = ajl2;
                    int i4116 = i13;
                    o3 = o6;
                    int i4117 = size2;
                    i17 = iP;
                    if (zC) {
                        a.d(o3, i17, iC);
                        z6 = false;
                    } else {
                        z6 = zC;
                    }
                    iP = i17;
                    i13 = i4116 + 1;
                    iMax3 = iMax110;
                    iMax4 = iMax19;
                    size2 = i4117;
                    i14 = 2;
                    o6 = o3;
                    ajl2 = ajl10;
                }
                o2 = o6;
                i15 = iP;
                if (z6) {
                    a.d(o2, i15, iC);
                    if (o2.p() < iMax3) {
                        o2.D(iMax3);
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (o2.c() < iMax4) {
                        o2.y(iMax4);
                    } else if (z7) {
                    }
                    a.d(o2, i15, iC);
                }
                i11 = i4114;
            } else {
                o2 = o6;
                i11 = i10;
            }
            o2.K(i11);
        } else {
            if (size > 0) {
                size3 = o6.ag.size();
                ajl4 = o6.ai;
                while (i20 < size3) {
                    c0087m3 = o6.ag.get(i20);
                    if (c0087m3 instanceof Q) {
                        iJ = c0087m3.j(0);
                        int iJ10 = c0087m3.j(1);
                        if (iJ == 3) {
                            a.c(ajl4, c0087m3, false);
                        } else {
                            a.c(ajl4, c0087m3, false);
                        }
                    }
                }
                oooO0O0 = (OooO0O0) ajl4;
                childCount = oooO0O0.a.getChildCount();
                while (i21 < childCount) {
                    childAt = oooO0O0.a.getChildAt(i21);
                    if (childAt instanceof OooO0o) {
                        oooO0o = (OooO0o) childAt;
                        if (oooO0o.b != null) {
                            oooO00o = (OooO00o) oooO0o.getLayoutParams();
                            oooO00o2 = (OooO00o) oooO0o.b.getLayoutParams();
                            oooO00o2.al.Y = 0;
                            if (oooO00o.al.k() != 1) {
                                oooO00o.al.D(oooO00o2.al.p());
                            }
                            if (oooO00o.al.n() != 1) {
                                oooO00o.al.y(oooO00o2.al.c());
                            }
                            oooO00o2.al.Y = 8;
                        }
                    }
                }
                size4 = oooO0O0.a.c.size();
                if (size4 > 0) {
                    while (i22 < size4) {
                        Objects.requireNonNull(oooO0O0.a.c.get(i22));
                    }
                }
            }
            i10 = o6.ar;
            size2 = a.c.size();
            if (size > 0) {
                a.d(o6, iP, iC);
            }
            if (size2 > 0) {
                if (o6.k() == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (o6.n() == 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                iMax3 = Math.max(o6.p(), a.e.V);
                iMax4 = Math.max(o6.c(), a.e.S);
                i12 = 0;
                z6 = false;
                while (i12 < size2) {
                    c0087m2 = a.c.get(i12);
                    if (c0087m2 instanceof L) {
                        iP2 = c0087m2.p();
                        iC2 = c0087m2.c();
                        ajl3 = ajl;
                        boolean zC8 = a.c(ajl3, c0087m2, true);
                        iP3 = c0087m2.p();
                        z8 = z6 | zC8;
                        iC3 = c0087m2.c();
                        if (iP3 != iP2) {
                            c0087m2.D(iP3);
                            if (z4) {
                                atw5 = atw2;
                            } else {
                                atw5 = atw2;
                            }
                            z8 = true;
                        } else {
                            atw5 = atw2;
                        }
                        if (iC3 != iC2) {
                            c0087m2.y(iC3);
                            if (z5) {
                                atw4 = atw3;
                            } else {
                                atw4 = atw3;
                            }
                            z8 = true;
                        } else {
                            atw4 = atw3;
                        }
                        z6 = z8;
                    } else {
                        atw4 = atw3;
                        atw5 = atw2;
                        ajl3 = ajl;
                    }
                    i12++;
                    ajl = ajl3;
                    atw2 = atw5;
                    atw3 = atw4;
                    i10 = i10;
                }
                int i4118 = i10;
                N.aTW atw18 = atw3;
                N.aTW atw19 = atw2;
                ajl2 = ajl;
                i13 = 0;
                i14 = 2;
                while (i13 < i14) {
                    int iMax111 = iMax4;
                    int iMax112 = iMax3;
                    zC = z6;
                    i16 = 0;
                    while (i16 < size2) {
                        c0087m = a.c.get(i16);
                        int i4119 = size2;
                        if (c0087m instanceof T) {
                            i18 = i13;
                            if (c0087m.Y == 8) {
                            }
                            o4 = o6;
                            i19 = iP;
                        } else {
                            i18 = i13;
                            if (c0087m.Y == 8) {
                            }
                            o4 = o6;
                            i19 = iP;
                        }
                        i16++;
                        size2 = i4119;
                        i13 = i18;
                        o6 = o4;
                        iP = i19;
                        ajl2 = ajl2;
                    }
                    A.aJL ajl11 = ajl2;
                    int i41110 = i13;
                    o3 = o6;
                    int i41111 = size2;
                    i17 = iP;
                    if (zC) {
                        a.d(o3, i17, iC);
                        z6 = false;
                    } else {
                        z6 = zC;
                    }
                    iP = i17;
                    i13 = i41110 + 1;
                    iMax3 = iMax112;
                    iMax4 = iMax111;
                    size2 = i41111;
                    i14 = 2;
                    o6 = o3;
                    ajl2 = ajl11;
                }
                o2 = o6;
                i15 = iP;
                if (z6) {
                    a.d(o2, i15, iC);
                    if (o2.p() < iMax3) {
                        o2.D(iMax3);
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (o2.c() < iMax4) {
                        o2.y(iMax4);
                    } else if (z7) {
                    }
                    a.d(o2, i15, iC);
                }
                i11 = i4118;
            } else {
                o2 = o6;
                i11 = i10;
            }
            o2.K(i11);
        }
        int iP10 = this.d.p();
        int iC10 = this.d.c();
        O o1112 = this.d;
        z9 = o1112.at;
        z10 = o1112.aq;
        OooO0O0 oooO0O6 = this.f15o;
        int i41112 = oooO0O6.f;
        int iResolveSizeAndState7 = ViewGroup.resolveSizeAndState(iP10 + oooO0O6.d, i, 0);
        int iResolveSizeAndState8 = ViewGroup.resolveSizeAndState(iC10 + i41112, i2, 0);
        iMin2 = Math.min(this.g, iResolveSizeAndState7 & 16777215);
        iMin3 = Math.min(this.h, iResolveSizeAndState8 & 16777215);
        if (z9) {
            iMin2 |= 16777216;
        }
        if (z10) {
            iMin3 |= 16777216;
        }
        setMeasuredDimension(iMin2, iMin3);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C0087m c0087mI = i(view);
        if ((view instanceof Guideline) && !(c0087mI instanceof Q)) {
            OooO00o oooO00o = (OooO00o) view.getLayoutParams();
            Q q = new Q();
            oooO00o.al = q;
            oooO00o.X = true;
            q.F(oooO00o.R);
        }
        if (view instanceof androidx.constraintlayout.widget.OooO00o) {
            androidx.constraintlayout.widget.OooO00o oooO00o2 = (androidx.constraintlayout.widget.OooO00o) view;
            oooO00o2.i();
            ((OooO00o) view.getLayoutParams()).Y = true;
            if (!this.c.contains(oooO00o2)) {
                this.c.add(oooO00o2);
            }
        }
        this.b.put(view.getId(), view);
        this.a = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.b.remove(view.getId());
        C0087m c0087mI = i(view);
        this.d.ag.remove(c0087mI);
        c0087mI.N = null;
        this.c.remove(view);
        this.a = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.a = true;
        super.requestLayout();
    }

    public void setConstraintSet(b bVar) {
        this.j = bVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        this.b.remove(getId());
        super.setId(i);
        this.b.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.h) {
            return;
        }
        this.h = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.g) {
            return;
        }
        this.g = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.e) {
            return;
        }
        this.e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f) {
            return;
        }
        this.f = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(ivas.gov.bisp.enumeration.p100w.h hVar) {
        c cVar = this.k;
        if (cVar != null) {
            Objects.requireNonNull(cVar);
        }
    }

    public void setOptimizationLevel(int i) {
        this.i = i;
        this.d.ar = i;
        i.d = h.i(i, 256);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new OooO00o(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new SparseArray<>();
        this.c = new ArrayList<>(4);
        this.d = new O();
        this.f = 0;
        this.e = 0;
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.a = true;
        this.i = 263;
        this.j = null;
        this.k = null;
        this.m = -1;
        this.l = new HashMap<>();
        this.n = new SparseArray<>();
        this.f15o = new OooO0O0(this, this);
        h(attributeSet, i, 0);
    }

    public static class OooO00o extends ViewGroup.MarginLayoutParams {
        public float A;
        public int B;
        public String C;
        public float D;
        public float E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public float O;
        public float P;
        public boolean Q;
        public int R;
        public int S;
        public boolean T;
        public String U;
        public boolean V;
        public boolean W;
        public boolean X;
        public boolean Y;
        public boolean Z;
        public int a;
        public int aa;
        public int ab;
        public int ac;
        public int ad;
        public int ae;
        public float af;
        public int ag;
        public int ah;
        public int ai;
        public boolean aj;
        public float ak;
        public C0087m al;
        public int b;
        public int c;
        public float d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float f16o;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;
        public int w;
        public int x;
        public float y;
        public int z;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C0001OooO00o {
            public static final SparseIntArray a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                a = sparseIntArray;
                sparseIntArray.append(63, 8);
                sparseIntArray.append(64, 9);
                sparseIntArray.append(66, 10);
                sparseIntArray.append(67, 11);
                sparseIntArray.append(73, 12);
                sparseIntArray.append(72, 13);
                sparseIntArray.append(45, 14);
                sparseIntArray.append(44, 15);
                sparseIntArray.append(42, 16);
                sparseIntArray.append(46, 2);
                sparseIntArray.append(48, 3);
                sparseIntArray.append(47, 4);
                sparseIntArray.append(81, 49);
                sparseIntArray.append(82, 50);
                sparseIntArray.append(52, 5);
                sparseIntArray.append(53, 6);
                sparseIntArray.append(54, 7);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(68, 17);
                sparseIntArray.append(69, 18);
                sparseIntArray.append(51, 19);
                sparseIntArray.append(50, 20);
                sparseIntArray.append(85, 21);
                sparseIntArray.append(88, 22);
                sparseIntArray.append(86, 23);
                sparseIntArray.append(83, 24);
                sparseIntArray.append(87, 25);
                sparseIntArray.append(84, 26);
                sparseIntArray.append(59, 29);
                sparseIntArray.append(74, 30);
                sparseIntArray.append(49, 44);
                sparseIntArray.append(61, 45);
                sparseIntArray.append(76, 46);
                sparseIntArray.append(60, 47);
                sparseIntArray.append(75, 48);
                sparseIntArray.append(40, 27);
                sparseIntArray.append(39, 28);
                sparseIntArray.append(77, 31);
                sparseIntArray.append(55, 32);
                sparseIntArray.append(79, 33);
                sparseIntArray.append(78, 34);
                sparseIntArray.append(80, 35);
                sparseIntArray.append(57, 36);
                sparseIntArray.append(56, 37);
                sparseIntArray.append(58, 38);
                sparseIntArray.append(62, 39);
                sparseIntArray.append(71, 40);
                sparseIntArray.append(65, 41);
                sparseIntArray.append(43, 42);
                sparseIntArray.append(41, 43);
                sparseIntArray.append(70, 51);
            }
        }

        public OooO00o(Context context, AttributeSet attributeSet) {
            int i;
            super(context, attributeSet);
            this.b = -1;
            this.c = -1;
            this.d = -1.0f;
            this.e = -1;
            this.g = -1;
            this.f = -1;
            this.h = -1;
            this.i = -1;
            this.a = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.n = -1;
            this.m = 0;
            this.f16o = 0.0f;
            this.p = -1;
            this.r = -1;
            this.q = -1;
            this.s = -1;
            this.v = -1;
            this.u = -1;
            this.w = -1;
            this.x = -1;
            this.t = -1;
            this.z = -1;
            this.y = 0.5f;
            this.A = 0.5f;
            this.C = null;
            this.B = 1;
            this.D = -1.0f;
            this.E = -1.0f;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.G = 0;
            this.K = 0;
            this.L = 0;
            this.N = 0;
            this.M = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.F = -1;
            this.S = -1;
            this.R = -1;
            this.T = false;
            this.Q = false;
            this.U = null;
            this.aj = true;
            this.V = true;
            this.W = false;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.aa = -1;
            this.ab = -1;
            this.ac = -1;
            this.ad = -1;
            this.ae = -1;
            this.ag = -1;
            this.af = 0.5f;
            this.al = new C0087m();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.g);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                int i3 = C0001OooO00o.a.get(index);
                switch (i3) {
                    case 1:
                        this.R = typedArrayObtainStyledAttributes.getInt(index, this.R);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.n);
                        this.n = resourceId;
                        if (resourceId == -1) {
                            this.n = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.m);
                        break;
                    case 4:
                        float f = typedArrayObtainStyledAttributes.getFloat(index, this.f16o) % 360.0f;
                        this.f16o = f;
                        if (f < 0.0f) {
                            this.f16o = (360.0f - f) % 360.0f;
                        }
                        break;
                    case 5:
                        this.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                        break;
                    case 6:
                        this.c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.c);
                        break;
                    case 7:
                        this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.e);
                        this.e = resourceId2;
                        if (resourceId2 == -1) {
                            this.e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.g);
                        this.g = resourceId3;
                        if (resourceId3 == -1) {
                            this.g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f);
                        this.f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.h);
                        this.h = resourceId5;
                        if (resourceId5 == -1) {
                            this.h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.i);
                        this.i = resourceId6;
                        if (resourceId6 == -1) {
                            this.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.a);
                        this.a = resourceId7;
                        if (resourceId7 == -1) {
                            this.a = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case IMediaSession.Stub.TRANSACTION_playFromMediaId /* 14 */:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                        this.j = resourceId8;
                        if (resourceId8 == -1) {
                            this.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case IMediaSession.Stub.TRANSACTION_playFromSearch /* 15 */:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.k);
                        this.k = resourceId9;
                        if (resourceId9 == -1) {
                            this.k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.l);
                        this.l = resourceId10;
                        if (resourceId10 == -1) {
                            this.l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case IMediaSession.Stub.TRANSACTION_skipToQueueItem /* 17 */:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.p);
                        this.p = resourceId11;
                        if (resourceId11 == -1) {
                            this.p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case IMediaSession.Stub.TRANSACTION_pause /* 18 */:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.r);
                        this.r = resourceId12;
                        if (resourceId12 == -1) {
                            this.r = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case IMediaSession.Stub.TRANSACTION_stop /* 19 */:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.q);
                        this.q = resourceId13;
                        if (resourceId13 == -1) {
                            this.q = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case IMediaSession.Stub.TRANSACTION_next /* 20 */:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId14;
                        if (resourceId14 == -1) {
                            this.s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case IMediaSession.Stub.TRANSACTION_previous /* 21 */:
                        this.v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.v);
                        break;
                    case IMediaSession.Stub.TRANSACTION_fastForward /* 22 */:
                        this.u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.u);
                        break;
                    case IMediaSession.Stub.TRANSACTION_rewind /* 23 */:
                        this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        break;
                    case IMediaSession.Stub.TRANSACTION_seekTo /* 24 */:
                        this.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        break;
                    case IMediaSession.Stub.TRANSACTION_rate /* 25 */:
                        this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.t);
                        break;
                    case IMediaSession.Stub.TRANSACTION_sendCustomAction /* 26 */:
                        this.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.z);
                        break;
                    case IMediaSession.Stub.TRANSACTION_getMetadata /* 27 */:
                        this.T = typedArrayObtainStyledAttributes.getBoolean(index, this.T);
                        break;
                    case IMediaSession.Stub.TRANSACTION_getPlaybackState /* 28 */:
                        this.Q = typedArrayObtainStyledAttributes.getBoolean(index, this.Q);
                        break;
                    case IMediaSession.Stub.TRANSACTION_getQueue /* 29 */:
                        this.y = typedArrayObtainStyledAttributes.getFloat(index, this.y);
                        break;
                    case IMediaSession.Stub.TRANSACTION_getQueueTitle /* 30 */:
                        this.A = typedArrayObtainStyledAttributes.getFloat(index, this.A);
                        break;
                    case IMediaSession.Stub.TRANSACTION_getExtras /* 31 */:
                        int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.J = i4;
                        if (i4 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case IMediaSession.Stub.TRANSACTION_getRatingType /* 32 */:
                        int i5 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.G = i5;
                        if (i5 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case IMediaSession.Stub.TRANSACTION_prepare /* 33 */:
                        try {
                            this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.K) == -2) {
                                this.K = -2;
                            }
                        }
                        break;
                    case IMediaSession.Stub.TRANSACTION_prepareFromMediaId /* 34 */:
                        try {
                            this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                            }
                        }
                        break;
                    case IMediaSession.Stub.TRANSACTION_prepareFromSearch /* 35 */:
                        this.O = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.O));
                        this.J = 2;
                        break;
                    case IMediaSession.Stub.TRANSACTION_prepareFromUri /* 36 */:
                        try {
                            this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.L) == -2) {
                                this.L = -2;
                            }
                        }
                        break;
                    case IMediaSession.Stub.TRANSACTION_getRepeatMode /* 37 */:
                        try {
                            this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.M) == -2) {
                                this.M = -2;
                            }
                        }
                        break;
                    case IMediaSession.Stub.TRANSACTION_isShuffleModeEnabledRemoved /* 38 */:
                        this.P = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.P));
                        this.G = 2;
                        break;
                    default:
                        switch (i3) {
                            case IMediaSession.Stub.TRANSACTION_removeQueueItemAt /* 44 */:
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                this.C = string;
                                this.B = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int iIndexOf = this.C.indexOf(44);
                                    if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String strSubstring = this.C.substring(0, iIndexOf);
                                        if (strSubstring.equalsIgnoreCase("W")) {
                                            this.B = 0;
                                        } else if (strSubstring.equalsIgnoreCase("H")) {
                                            this.B = 1;
                                        }
                                        i = iIndexOf + 1;
                                    }
                                    int iIndexOf2 = this.C.indexOf(58);
                                    if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                        String strSubstring2 = this.C.substring(i);
                                        if (strSubstring2.length() > 0) {
                                            Float.parseFloat(strSubstring2);
                                        }
                                    } else {
                                        String strSubstring3 = this.C.substring(i, iIndexOf2);
                                        String strSubstring4 = this.C.substring(iIndexOf2 + 1);
                                        if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                            try {
                                                float f2 = Float.parseFloat(strSubstring3);
                                                Float.parseFloat(strSubstring4);
                                                int i6 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                                            } catch (NumberFormatException unused5) {
                                            }
                                        }
                                    }
                                }
                                break;
                            case IMediaSession.Stub.TRANSACTION_isCaptioningEnabled /* 45 */:
                                this.D = typedArrayObtainStyledAttributes.getFloat(index, this.D);
                                break;
                            case IMediaSession.Stub.TRANSACTION_setCaptioningEnabled /* 46 */:
                                this.E = typedArrayObtainStyledAttributes.getFloat(index, this.E);
                                break;
                            case IMediaSession.Stub.TRANSACTION_getShuffleMode /* 47 */:
                                this.H = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case IMediaSession.Stub.TRANSACTION_setShuffleMode /* 48 */:
                                this.I = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.F = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.F);
                                break;
                            case 50:
                                this.S = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.S);
                                break;
                            case IMediaSession.Stub.TRANSACTION_rateWithExtras /* 51 */:
                                this.U = typedArrayObtainStyledAttributes.getString(index);
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            d();
        }

        public void d() {
            this.X = false;
            this.aj = true;
            this.V = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.T) {
                this.aj = false;
                if (this.J == 0) {
                    this.J = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.Q) {
                this.V = false;
                if (this.G == 0) {
                    this.G = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.aj = false;
                if (i == 0 && this.J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.T = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.V = false;
                if (i2 == 0 && this.G == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.Q = true;
                }
            }
            if (this.d == -1.0f && this.b == -1 && this.c == -1) {
                return;
            }
            this.X = true;
            this.aj = true;
            this.V = true;
            if (!(this.al instanceof Q)) {
                this.al = new Q();
            }
            ((Q) this.al).F(this.R);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0047  */
        /* JADX WARN: Code duplicated, block: B:20:0x004e  */
        /* JADX WARN: Code duplicated, block: B:23:0x0055  */
        /* JADX WARN: Code duplicated, block: B:26:0x005b  */
        /* JADX WARN: Code duplicated, block: B:29:0x0061  */
        /* JADX WARN: Code duplicated, block: B:36:0x0073  */
        /* JADX WARN: Code duplicated, block: B:37:0x007b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:38:0x007d  */
        /* JADX WARN: Code duplicated, block: B:39:0x0084 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:40:0x0086  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @TargetApi(IMediaSession.Stub.TRANSACTION_skipToQueueItem)
        public void resolveLayoutDirection(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i);
            boolean z = false;
            boolean z2 = 1 == getLayoutDirection();
            this.ac = -1;
            this.ad = -1;
            this.aa = -1;
            this.ab = -1;
            this.ae = this.v;
            this.ag = this.w;
            float f = this.y;
            this.af = f;
            int i8 = this.b;
            this.ah = i8;
            int i9 = this.c;
            this.ai = i9;
            float f2 = this.d;
            this.ak = f2;
            if (z2) {
                int i10 = this.p;
                if (i10 != -1) {
                    this.ac = i10;
                } else {
                    int i11 = this.r;
                    if (i11 != -1) {
                        this.ad = i11;
                    } else {
                        i2 = this.q;
                        if (i2 != -1) {
                            this.ab = i2;
                            z = true;
                        }
                        i3 = this.s;
                        if (i3 != -1) {
                            this.aa = i3;
                            z = true;
                        }
                        i4 = this.t;
                        if (i4 != -1) {
                            this.ag = i4;
                        }
                        i5 = this.z;
                        if (i5 != -1) {
                            this.ae = i5;
                        }
                        if (z) {
                            this.af = 1.0f - f;
                        }
                        if (this.X && this.R == 1) {
                            if (f2 != -1.0f) {
                                this.ak = 1.0f - f2;
                                this.ah = -1;
                                this.ai = -1;
                            } else if (i8 != -1) {
                                this.ai = i8;
                                this.ah = -1;
                                this.ak = -1.0f;
                            } else if (i9 != -1) {
                                this.ah = i9;
                                this.ai = -1;
                                this.ak = -1.0f;
                            }
                        }
                    }
                }
                z = true;
                i2 = this.q;
                if (i2 != -1) {
                    this.ab = i2;
                    z = true;
                }
                i3 = this.s;
                if (i3 != -1) {
                    this.aa = i3;
                    z = true;
                }
                i4 = this.t;
                if (i4 != -1) {
                    this.ag = i4;
                }
                i5 = this.z;
                if (i5 != -1) {
                    this.ae = i5;
                }
                if (z) {
                    this.af = 1.0f - f;
                }
                if (this.X) {
                    if (f2 != -1.0f) {
                        this.ak = 1.0f - f2;
                        this.ah = -1;
                        this.ai = -1;
                    } else if (i8 != -1) {
                        this.ai = i8;
                        this.ah = -1;
                        this.ak = -1.0f;
                    } else if (i9 != -1) {
                        this.ah = i9;
                        this.ai = -1;
                        this.ak = -1.0f;
                    }
                }
            } else {
                int i12 = this.p;
                if (i12 != -1) {
                    this.ab = i12;
                }
                int i13 = this.r;
                if (i13 != -1) {
                    this.aa = i13;
                }
                int i14 = this.q;
                if (i14 != -1) {
                    this.ac = i14;
                }
                int i15 = this.s;
                if (i15 != -1) {
                    this.ad = i15;
                }
                int i16 = this.t;
                if (i16 != -1) {
                    this.ae = i16;
                }
                int i17 = this.z;
                if (i17 != -1) {
                    this.ag = i17;
                }
            }
            if (this.q == -1 && this.s == -1 && this.r == -1 && this.p == -1) {
                int i18 = this.f;
                if (i18 != -1) {
                    this.ac = i18;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                } else {
                    int i19 = this.h;
                    if (i19 != -1) {
                        this.ad = i19;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                        }
                    }
                }
                int i20 = this.e;
                if (i20 != -1) {
                    this.aa = i20;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                    return;
                }
                int i21 = this.g;
                if (i21 != -1) {
                    this.ab = i21;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                }
            }
        }

        public OooO00o(int i, int i2) {
            super(i, i2);
            this.b = -1;
            this.c = -1;
            this.d = -1.0f;
            this.e = -1;
            this.g = -1;
            this.f = -1;
            this.h = -1;
            this.i = -1;
            this.a = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.n = -1;
            this.m = 0;
            this.f16o = 0.0f;
            this.p = -1;
            this.r = -1;
            this.q = -1;
            this.s = -1;
            this.v = -1;
            this.u = -1;
            this.w = -1;
            this.x = -1;
            this.t = -1;
            this.z = -1;
            this.y = 0.5f;
            this.A = 0.5f;
            this.C = null;
            this.B = 1;
            this.D = -1.0f;
            this.E = -1.0f;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.G = 0;
            this.K = 0;
            this.L = 0;
            this.N = 0;
            this.M = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.F = -1;
            this.S = -1;
            this.R = -1;
            this.T = false;
            this.Q = false;
            this.U = null;
            this.aj = true;
            this.V = true;
            this.W = false;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.aa = -1;
            this.ab = -1;
            this.ac = -1;
            this.ad = -1;
            this.ae = -1;
            this.ag = -1;
            this.af = 0.5f;
            this.al = new C0087m();
        }

        public OooO00o(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = -1;
            this.c = -1;
            this.d = -1.0f;
            this.e = -1;
            this.g = -1;
            this.f = -1;
            this.h = -1;
            this.i = -1;
            this.a = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.n = -1;
            this.m = 0;
            this.f16o = 0.0f;
            this.p = -1;
            this.r = -1;
            this.q = -1;
            this.s = -1;
            this.v = -1;
            this.u = -1;
            this.w = -1;
            this.x = -1;
            this.t = -1;
            this.z = -1;
            this.y = 0.5f;
            this.A = 0.5f;
            this.C = null;
            this.B = 1;
            this.D = -1.0f;
            this.E = -1.0f;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.G = 0;
            this.K = 0;
            this.L = 0;
            this.N = 0;
            this.M = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.F = -1;
            this.S = -1;
            this.R = -1;
            this.T = false;
            this.Q = false;
            this.U = null;
            this.aj = true;
            this.V = true;
            this.W = false;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.aa = -1;
            this.ab = -1;
            this.ac = -1;
            this.ad = -1;
            this.ae = -1;
            this.ag = -1;
            this.af = 0.5f;
            this.al = new C0087m();
        }
    }
}
