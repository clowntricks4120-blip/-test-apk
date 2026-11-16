package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import ivas.gov.bisp.enumeration.M.al;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E;
    public final SparseIntArray F;
    public int G;
    public int[] H;
    public View[] I;
    public final SparseIntArray J;
    public OooO0OO K;
    public final Rect L;

    public static final class OooO00o extends OooO0OO {
    }

    public static abstract class OooO0OO {
        public final SparseIntArray a = new SparseIntArray();
        public final SparseIntArray b = new SparseIntArray();

        public int b(int i, int i2) {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i4++;
                if (i4 == i2) {
                    i3++;
                    i4 = 0;
                } else if (i4 > i2) {
                    i3++;
                    i4 = 1;
                }
            }
            return i4 + 1 > i2 ? i3 + 1 : i3;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.E = false;
        this.G = -1;
        this.F = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new OooO00o();
        this.L = new Rect();
        bx(RecyclerView.Oooo000.d(context, attributeSet, i, i2).b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public int B(RecyclerView.o00Ooo o00ooo, RecyclerView.o0Oo0oo o0oo0oo) {
        if (this.p == 1) {
            return this.G;
        }
        if (o0oo0oo.c() <= 0) {
            return 0;
        }
        return by(o00ooo, o0oo0oo, o0oo0oo.c() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public int U(RecyclerView.o00Ooo o00ooo, RecyclerView.o0Oo0oo o0oo0oo) {
        if (this.p == 0) {
            return this.G;
        }
        if (o0oo0oo.c() <= 0) {
            return 0;
        }
        return by(o00ooo, o0oo0oo, o0oo0oo.c() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.Oooo000
    public int aC(int i, RecyclerView.o00Ooo o00ooo, RecyclerView.o0Oo0oo o0oo0oo) {
        bu();
        bz();
        if (this.p == 0) {
            return 0;
        }
        return bm(i, o00ooo, o0oo0oo);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.Oooo000
    public void aD(RecyclerView.o00Ooo o00ooo, RecyclerView.o0Oo0oo o0oo0oo) {
        if (o0oo0oo.h) {
            int iW = w();
            for (int i = 0; i < iW; i++) {
                OooO0O0 oooO0O0 = (OooO0O0) A(i).getLayoutParams();
                int iF = oooO0O0.f();
                this.F.put(iF, oooO0O0.e);
                this.J.put(iF, oooO0O0.f);
            }
        }
        super.aD(o00ooo, o0oo0oo);
        this.F.clear();
        this.J.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.Oooo000
    public int aG(int i, RecyclerView.o00Ooo o00ooo, RecyclerView.o0Oo0oo o0oo0oo) {
        bu();
        bz();
        if (this.p == 1) {
            return 0;
        }
        return bm(i, o00ooo, o0oo0oo);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.Oooo000
    public void aJ(RecyclerView.o0Oo0oo o0oo0oo) {
        this.y = null;
        this.t = -1;
        this.z = Integer.MIN_VALUE;
        this.A.e();
        this.E = false;
    }

    public final void aM(View view, int i, boolean z) {
        int iC;
        int iC2;
        OooO0O0 oooO0O0 = (OooO0O0) view.getLayoutParams();
        Rect rect = oooO0O0.b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) oooO0O0).topMargin + ((ViewGroup.MarginLayoutParams) oooO0O0).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) oooO0O0).leftMargin + ((ViewGroup.MarginLayoutParams) oooO0O0).rightMargin;
        int iBt = bt(oooO0O0.f, oooO0O0.e);
        if (this.p == 1) {
            iC2 = RecyclerView.Oooo000.c(iBt, i, i3, ((ViewGroup.MarginLayoutParams) oooO0O0).width, false);
            iC = RecyclerView.Oooo000.c(this.q.m(), this.n, i2, ((ViewGroup.MarginLayoutParams) oooO0O0).height, true);
        } else {
            int iC3 = RecyclerView.Oooo000.c(iBt, i, i2, ((ViewGroup.MarginLayoutParams) oooO0O0).height, false);
            int iC4 = RecyclerView.Oooo000.c(this.q.m(), this.l, i3, ((ViewGroup.MarginLayoutParams) oooO0O0).width, true);
            iC = iC3;
            iC2 = iC4;
        }
        bv(view, iC2, iC, z);
    }

    public final int aN(RecyclerView.o00Ooo o00ooo, RecyclerView.o0Oo0oo o0oo0oo, int i) {
        if (!o0oo0oo.h) {
            OooO0OO oooO0OO = this.K;
            int i2 = this.G;
            Objects.requireNonNull(oooO0OO);
            return i % i2;
        }
        int i3 = this.J.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int iE = o00ooo.e(i);
        if (iE == -1) {
            return 0;
        }
        OooO0OO oooO0OO2 = this.K;
        int i4 = this.G;
        Objects.requireNonNull(oooO0OO2);
        return iE % i4;
    }

    public final int aO(RecyclerView.o00Ooo o00ooo, RecyclerView.o0Oo0oo o0oo0oo, int i) {
        if (!o0oo0oo.h) {
            Objects.requireNonNull(this.K);
            return 1;
        }
        int i2 = this.F.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (o00ooo.e(i) == -1) {
            return 1;
        }
        Objects.requireNonNull(this.K);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void aQ(RecyclerView.o0Oo0oo o0oo0oo, LinearLayoutManager.OooO0OO oooO0OO, RecyclerView.Oooo000.OooO0OO oooO0OO2) {
        int i = this.G;
        for (int i2 = 0; i2 < this.G && oooO0OO.c(o0oo0oo) && i > 0; i2++) {
            ((q.aNf) oooO0OO2).b(oooO0OO.e, Math.max(0, oooO0OO.h));
            Objects.requireNonNull(this.K);
            i--;
            oooO0OO.e += oooO0OO.g;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View aX(RecyclerView.o00Ooo o00ooo, RecyclerView.o0Oo0oo o0oo0oo, boolean z, boolean z2) {
        int i;
        int iW;
        int iW2 = w();
        int i2 = 1;
        if (z2) {
            iW = w() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iW2;
            iW = 0;
        }
        int iC = o0oo0oo.c();
        aV();
        int iL = this.q.l();
        int i3 = this.q.i();
        View view = null;
        View view2 = null;
        while (iW != i) {
            View viewA = A(iW);
            int iT = T(viewA);
            if (iT >= 0 && iT < iC && aN(o00ooo, o0oo0oo, iT) == 0) {
                if (((RecyclerView.Oooo0) viewA.getLayoutParams()).h()) {
                    if (view2 == null) {
                        view2 = viewA;
                    }
                } else {
                    if (this.q.h(viewA) < i3 && this.q.d(viewA) >= iL) {
                        return viewA;
                    }
                    if (view == null) {
                        view = viewA;
                    }
                }
            }
            iW += i2;
        }
        return view == null ? view2 : view;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:71:0x010b  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c2, code lost:
    
        if (r13 == (r2 > r15)) goto L52;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.Oooo000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View ab(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.o00Ooo r25, androidx.recyclerview.widget.RecyclerView.o0Oo0oo r26) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.ab(android.view.View, int, androidx.recyclerview.widget.RecyclerView$o00Ooo, androidx.recyclerview.widget.RecyclerView$o0Oo0oo):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void ae(RecyclerView.o00Ooo o00ooo, RecyclerView.o0Oo0oo o0oo0oo, View view, al alVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof OooO0O0)) {
            ad(view, alVar);
            return;
        }
        OooO0O0 oooO0O0 = (OooO0O0) layoutParams;
        int iBy = by(o00ooo, o0oo0oo, oooO0O0.f());
        if (this.p == 0) {
            alVar.l(al.aXE.c(oooO0O0.f, oooO0O0.e, iBy, 1, false, false));
        } else {
            alVar.l(al.aXE.c(iBy, 1, oooO0O0.f, oooO0O0.e, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void af(RecyclerView recyclerView, int i, int i2) {
        this.K.a.clear();
        this.K.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void ag(RecyclerView recyclerView, int i, int i2, int i3) {
        this.K.a.clear();
        this.K.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void ah(RecyclerView recyclerView) {
        this.K.a.clear();
        this.K.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void ai(RecyclerView recyclerView, int i, int i2) {
        this.K.a.clear();
        this.K.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void aj(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.K.a.clear();
        this.K.b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.Oooo000
    public boolean aq() {
        return this.y == null && !this.E;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void az(Rect rect, int i, int i2) {
        int iB;
        int iB2;
        if (this.H == null) {
            super.az(rect, i, i2);
        }
        int iR = R() + Q();
        int iO = O() + H();
        if (this.p == 1) {
            iB2 = RecyclerView.Oooo000.b(i2, rect.height() + iO, N());
            int[] iArr = this.H;
            iB = RecyclerView.Oooo000.b(i, iArr[iArr.length - 1] + iR, P());
        } else {
            iB = RecyclerView.Oooo000.b(i, rect.width() + iR, P());
            int[] iArr2 = this.H;
            iB2 = RecyclerView.Oooo000.b(i2, iArr2[iArr2.length - 1] + iO, N());
        }
        this.c.setMeasuredDimension(iB, iB2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v36 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void bg(RecyclerView.o00Ooo o00ooo, RecyclerView.o0Oo0oo o0oo0oo, LinearLayoutManager.OooO0OO oooO0OO, LinearLayoutManager.OooO0O0 oooO0O0) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int iF;
        int iQ;
        int iF2;
        int iC;
        int iC2;
        ?? r8;
        View viewD;
        int iK = this.q.k();
        boolean z = iK != 1073741824;
        int i13 = w() > 0 ? this.H[this.G] : 0;
        if (z) {
            bu();
        }
        boolean z2 = oooO0OO.g == 1;
        int iAN = this.G;
        if (!z2) {
            iAN = aN(o00ooo, o0oo0oo, oooO0OO.e) + aO(o00ooo, o0oo0oo, oooO0OO.e);
        }
        int i14 = 0;
        while (i14 < this.G && oooO0OO.c(o0oo0oo) && iAN > 0) {
            int i15 = oooO0OO.e;
            int iAO = aO(o00ooo, o0oo0oo, i15);
            if (iAO > this.G) {
                StringBuilder sb = new StringBuilder();
                sb.append("Item at position ");
                sb.append(i15);
                sb.append(" requires ");
                sb.append(iAO);
                sb.append(" spans but GridLayoutManager has only ");
                throw new IllegalArgumentException(ivas.gov.bisp.enumeration.p091n.j.s(sb, this.G, " spans."));
            }
            iAN -= iAO;
            if (iAN < 0 || (viewD = oooO0OO.d(o00ooo)) == null) {
                break;
            }
            this.I[i14] = viewD;
            i14++;
        }
        if (i14 == 0) {
            oooO0O0.b = true;
            return;
        }
        if (z2) {
            i3 = 1;
            i2 = i14;
            i = 0;
        } else {
            i = i14 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i16 = 0;
        while (i != i2) {
            View view = this.I[i];
            OooO0O0 oooO0O1 = (OooO0O0) view.getLayoutParams();
            int iAO2 = aO(o00ooo, o0oo0oo, T(view));
            oooO0O1.e = iAO2;
            oooO0O1.f = i16;
            i16 += iAO2;
            i += i3;
        }
        float f = 0.0f;
        int i17 = 0;
        for (int i18 = 0; i18 < i14; i18++) {
            View view2 = this.I[i18];
            if (oooO0OO.k != null) {
                r8 = 0;
                r8 = 0;
                if (z2) {
                    h(view2, -1, true);
                } else {
                    h(view2, 0, true);
                }
            } else if (z2) {
                g(view2);
                r8 = 0;
            } else {
                r8 = 0;
                h(view2, 0, false);
            }
            Rect rect = this.L;
            RecyclerView recyclerView = this.c;
            if (recyclerView == null) {
                rect.set(r8, r8, r8, r8);
            } else {
                rect.set(recyclerView.Q(view2));
            }
            aM(view2, iK, r8);
            int iE = this.q.e(view2);
            if (iE > i17) {
                i17 = iE;
            }
            float f2 = (this.q.f(view2) * 1.0f) / ((OooO0O0) view2.getLayoutParams()).e;
            if (f2 > f) {
                f = f2;
            }
        }
        if (z) {
            bw(Math.max(Math.round(f * this.G), i13));
            i17 = 0;
            for (int i19 = 0; i19 < i14; i19++) {
                View view3 = this.I[i19];
                aM(view3, 1073741824, true);
                int iE2 = this.q.e(view3);
                if (iE2 > i17) {
                    i17 = iE2;
                }
            }
        }
        for (int i20 = 0; i20 < i14; i20++) {
            View view4 = this.I[i20];
            if (this.q.e(view4) != i17) {
                OooO0O0 oooO0O2 = (OooO0O0) view4.getLayoutParams();
                Rect rect2 = oooO0O2.b;
                int i21 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) oooO0O2).topMargin + ((ViewGroup.MarginLayoutParams) oooO0O2).bottomMargin;
                int i22 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) oooO0O2).leftMargin + ((ViewGroup.MarginLayoutParams) oooO0O2).rightMargin;
                int iBt = bt(oooO0O2.f, oooO0O2.e);
                if (this.p == 1) {
                    iC2 = RecyclerView.Oooo000.c(iBt, 1073741824, i22, ((ViewGroup.MarginLayoutParams) oooO0O2).width, false);
                    iC = View.MeasureSpec.makeMeasureSpec(i17 - i21, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - i22, 1073741824);
                    iC = RecyclerView.Oooo000.c(iBt, 1073741824, i21, ((ViewGroup.MarginLayoutParams) oooO0O2).height, false);
                    iC2 = iMakeMeasureSpec;
                }
                bv(view4, iC2, iC, true);
            }
        }
        int i23 = 0;
        oooO0O0.a = i17;
        if (this.p == 1) {
            if (oooO0OO.f == -1) {
                int i24 = oooO0OO.c;
                i9 = i24;
                i8 = i24 - i17;
            } else {
                i8 = oooO0OO.c;
                i9 = i17 + i8;
            }
            i7 = 0;
            i6 = 0;
        } else {
            if (oooO0OO.f == -1) {
                i5 = oooO0OO.c;
                i4 = i5 - i17;
            } else {
                int i25 = oooO0OO.c;
                i4 = i25;
                i5 = i17 + i25;
            }
            i6 = i5;
            i7 = i4;
            i8 = 0;
            i9 = 0;
        }
        while (i23 < i14) {
            View view5 = this.I[i23];
            OooO0O0 oooO0O3 = (OooO0O0) view5.getLayoutParams();
            if (this.p == 1) {
                if (bd()) {
                    iF2 = Q() + this.H[this.G - oooO0O3.f];
                    iQ = iF2 - this.q.f(view5);
                } else {
                    iQ = this.H[oooO0O3.f] + Q();
                    iF2 = this.q.f(view5) + iQ;
                }
                i12 = iF2;
                i11 = iQ;
                iF = i9;
                i10 = i8;
            } else {
                int iH = H() + this.H[oooO0O3.f];
                i10 = iH;
                i11 = i7;
                i12 = i6;
                iF = this.q.f(view5) + iH;
            }
            W(view5, i11, i10, i12, iF);
            if (oooO0O3.h() || oooO0O3.g()) {
                oooO0O0.c = true;
            }
            oooO0O0.d |= view5.hasFocusable();
            i23++;
            i8 = i10;
            i7 = i11;
            i6 = i12;
            i9 = iF;
        }
        Arrays.fill(this.I, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void bh(RecyclerView.o00Ooo o00ooo, RecyclerView.o0Oo0oo o0oo0oo, LinearLayoutManager.OooO00o oooO00o, int i) {
        int i2;
        int iAN;
        bu();
        if (o0oo0oo.c() > 0 && !o0oo0oo.h) {
            boolean z = i == 1;
            int iAN2 = aN(o00ooo, o0oo0oo, oooO00o.b);
            if (z) {
                while (iAN2 > 0) {
                    int i3 = oooO00o.b;
                    if (i3 <= 0) {
                        break;
                    }
                    int i4 = i3 - 1;
                    oooO00o.b = i4;
                    iAN2 = aN(o00ooo, o0oo0oo, i4);
                }
            } else {
                int iC = o0oo0oo.c();
                int i5 = oooO00o.b;
                while (i5 < iC - 1 && (iAN = aN(o00ooo, o0oo0oo, (i2 = i5 + 1))) > iAN2) {
                    i5 = i2;
                    iAN2 = iAN;
                }
                oooO00o.b = i5;
            }
        }
        bz();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void bp(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        i(null);
        if (this.w) {
            this.w = false;
            aF();
        }
    }

    public int bt(int i, int i2) {
        if (this.p != 1 || !bd()) {
            int[] iArr = this.H;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.H;
        int i3 = this.G - i;
        return iArr2[i3] - iArr2[i3 - i2];
    }

    public final void bu() {
        int iO;
        int iH;
        if (this.p == 1) {
            iO = this.m - R();
            iH = Q();
        } else {
            iO = this.f26o - O();
            iH = H();
        }
        bw(iO - iH);
    }

    public final void bv(View view, int i, int i2, boolean z) {
        RecyclerView.Oooo0 oooo0 = (RecyclerView.Oooo0) view.getLayoutParams();
        if (z ? ak(view, i, i2, oooo0) : am(view, i, i2, oooo0)) {
            view.measure(i, i2);
        }
    }

    public final void bw(int i) {
        int i2;
        int[] iArr = this.H;
        int i3 = this.G;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.H = iArr;
    }

    public void bx(int i) {
        if (i == this.G) {
            return;
        }
        this.E = true;
        if (i <= 0) {
            throw new IllegalArgumentException(ivas.gov.bisp.enumeration.p091n.j.o("Span count should be at least 1. Provided ", i));
        }
        this.G = i;
        this.K.a.clear();
        aF();
    }

    public final int by(RecyclerView.o00Ooo o00ooo, RecyclerView.o0Oo0oo o0oo0oo, int i) {
        if (!o0oo0oo.h) {
            return this.K.b(i, this.G);
        }
        int iE = o00ooo.e(i);
        if (iE == -1) {
            return 0;
        }
        return this.K.b(iE, this.G);
    }

    public final void bz() {
        View[] viewArr = this.I;
        if (viewArr == null || viewArr.length != this.G) {
            this.I = new View[this.G];
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public boolean l(RecyclerView.Oooo0 oooo0) {
        return oooo0 instanceof OooO0O0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.Oooo000
    public int o(RecyclerView.o0Oo0oo o0oo0oo) {
        return aR(o0oo0oo);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.Oooo000
    public int q(RecyclerView.o0Oo0oo o0oo0oo) {
        return aS(o0oo0oo);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.Oooo000
    public int r(RecyclerView.o0Oo0oo o0oo0oo) {
        return aR(o0oo0oo);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.Oooo000
    public int s(RecyclerView.o0Oo0oo o0oo0oo) {
        return aS(o0oo0oo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public RecyclerView.Oooo0 x(Context context, AttributeSet attributeSet) {
        return new OooO0O0(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.Oooo000
    public RecyclerView.Oooo0 y() {
        return this.p == 0 ? new OooO0O0(-2, -1) : new OooO0O0(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public RecyclerView.Oooo0 z(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new OooO0O0((ViewGroup.MarginLayoutParams) layoutParams) : new OooO0O0(layoutParams);
    }

    public static class OooO0O0 extends RecyclerView.Oooo0 {
        public int e;
        public int f;

        public OooO0O0(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f = -1;
            this.e = 0;
        }

        public OooO0O0(int i, int i2) {
            super(i, i2);
            this.f = -1;
            this.e = 0;
        }

        public OooO0O0(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f = -1;
            this.e = 0;
        }

        public OooO0O0(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f = -1;
            this.e = 0;
        }
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(i2, z);
        this.E = false;
        this.G = -1;
        this.F = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new OooO00o();
        this.L = new Rect();
        bx(i);
    }
}
