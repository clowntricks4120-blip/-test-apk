package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.Oooo000 implements RecyclerView.o0OOO0o.OooO0O0 {
    public final OooO00o A;
    public int B;
    public final OooO0O0 C;
    public int[] D;
    public int p;
    public g q;
    public OooO0OO r;
    public boolean s;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public OooO0o y;
    public int z;

    public static class OooO00o {
        public g a;
        public int b;
        public int c;
        public boolean d;
        public boolean e;

        public OooO00o() {
            e();
        }

        public void b() {
            this.c = this.d ? this.a.i() : this.a.l();
        }

        public void c(View view, int i) {
            if (this.d) {
                this.c = this.a.o() + this.a.d(view);
            } else {
                this.c = this.a.h(view);
            }
            this.b = i;
        }

        public void d(View view, int i) {
            int iO = this.a.o();
            if (iO >= 0) {
                c(view, i);
                return;
            }
            this.b = i;
            if (this.d) {
                int i2 = (this.a.i() - iO) - this.a.d(view);
                this.c = this.a.i() - i2;
                if (i2 > 0) {
                    int iE = this.a.e(view);
                    int i3 = this.c;
                    int iL = this.a.l();
                    int iMin = (i3 - iE) - (Math.min(this.a.h(view) - iL, 0) + iL);
                    if (iMin < 0) {
                        this.c = Math.min(i2, -iMin) + this.c;
                        return;
                    }
                    return;
                }
                return;
            }
            int iH = this.a.h(view);
            int iL2 = iH - this.a.l();
            this.c = iH;
            if (iL2 > 0) {
                int iE2 = this.a.e(view);
                int i4 = (this.a.i() - Math.min(0, (this.a.i() - iO) - this.a.d(view))) - (iE2 + iH);
                if (i4 < 0) {
                    this.c -= Math.min(iL2, -i4);
                }
            }
        }

        public void e() {
            this.b = -1;
            this.c = Integer.MIN_VALUE;
            this.d = false;
            this.e = false;
        }

        public String toString() {
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("AnchorInfo{mPosition=");
            sbW.append(this.b);
            sbW.append(", mCoordinate=");
            sbW.append(this.c);
            sbW.append(", mLayoutFromEnd=");
            sbW.append(this.d);
            sbW.append(", mValid=");
            sbW.append(this.e);
            sbW.append('}');
            return sbW.toString();
        }
    }

    public static class OooO0O0 {
        public int a;
        public boolean b;
        public boolean c;
        public boolean d;
    }

    public static class OooO0OO {
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int j;
        public boolean l;
        public boolean b = true;
        public int i = 0;
        public int a = 0;
        public List<RecyclerView.o0O0O00> k = null;

        public void b(View view) {
            int iF;
            int size = this.k.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.k.get(i2).c;
                RecyclerView.Oooo0 oooo0 = (RecyclerView.Oooo0) view3.getLayoutParams();
                if (view3 != view && !oooo0.h() && (iF = (oooo0.f() - this.e) * this.g) >= 0 && iF < i) {
                    view2 = view3;
                    if (iF == 0) {
                        break;
                    } else {
                        i = iF;
                    }
                }
            }
            if (view2 == null) {
                this.e = -1;
            } else {
                this.e = ((RecyclerView.Oooo0) view2.getLayoutParams()).f();
            }
        }

        public boolean c(RecyclerView.o0Oo0oo o0oo0oo) {
            int i = this.e;
            return i >= 0 && i < o0oo0oo.c();
        }

        public View d(RecyclerView.o00Ooo o00ooo) {
            List<RecyclerView.o0O0O00> list = this.k;
            if (list == null) {
                View view = o00ooo.k(this.e, false, Long.MAX_VALUE).c;
                this.e += this.g;
                return view;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view2 = this.k.get(i).c;
                RecyclerView.Oooo0 oooo0 = (RecyclerView.Oooo0) view2.getLayoutParams();
                if (!oooo0.h() && this.e == oooo0.f()) {
                    b(view2);
                    return view2;
                }
            }
            return null;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class OooO0o implements Parcelable {
        public static final Parcelable.Creator<OooO0o> CREATOR = new OooO00o();
        public int b;
        public int c;
        public boolean d;

        public class OooO00o implements Parcelable.Creator<OooO0o> {
            @Override // android.os.Parcelable.Creator
            public OooO0o createFromParcel(Parcel parcel) {
                return new OooO0o(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public OooO0o[] newArray(int i) {
                return new OooO0o[i];
            }
        }

        public OooO0o() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean e() {
            return this.b >= 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d ? 1 : 0);
        }

        public OooO0o(Parcel parcel) {
            this.b = parcel.readInt();
            this.c = parcel.readInt();
            this.d = parcel.readInt() == 1;
        }

        public OooO0o(OooO0o oooO0o) {
            this.b = oooO0o.b;
            this.c = oooO0o.c;
            this.d = oooO0o.d;
        }
    }

    public LinearLayoutManager(Context context) {
        this(1, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public boolean V() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void aB(int i) {
        this.t = i;
        this.z = Integer.MIN_VALUE;
        OooO0o oooO0o = this.y;
        if (oooO0o != null) {
            oooO0o.b = -1;
        }
        aF();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public int aC(int i, RecyclerView.o00Ooo o00ooo, RecyclerView.o0Oo0oo o0oo0oo) {
        if (this.p == 0) {
            return 0;
        }
        return bm(i, o00ooo, o0oo0oo);
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:113:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:114:0x0203  */
    /* JADX WARN: Code duplicated, block: B:79:0x017a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0180  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ab  */
    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void aD(RecyclerView.o00Ooo o00ooo, RecyclerView.o0Oo0oo o0oo0oo) {
        int iC;
        View viewL;
        boolean z;
        boolean z2;
        View viewAX;
        RecyclerView.Oooo0 oooo0;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int iAZ;
        int i6;
        View viewV;
        int iH;
        int i7;
        int i8 = -1;
        if (!(this.y == null && this.t == -1) && o0oo0oo.c() == 0) {
            av(o00ooo);
            return;
        }
        OooO0o oooO0o = this.y;
        if (oooO0o != null && oooO0o.e()) {
            this.t = this.y.b;
        }
        aV();
        this.r.b = false;
        bl();
        View viewL2 = L();
        OooO00o oooO00o = this.A;
        if (!oooO00o.e || this.t != -1 || this.y != null) {
            oooO00o.e();
            OooO00o oooO00o2 = this.A;
            oooO00o2.d = this.u ^ this.w;
            if (o0oo0oo.h || (i = this.t) == -1) {
                if (w() == 0) {
                    oooO00o2.b();
                    if (this.w) {
                        iC = o0oo0oo.c() - 1;
                    } else {
                        iC = 0;
                    }
                    oooO00o2.b = iC;
                } else {
                    viewL = L();
                    if (viewL != null) {
                        oooo0 = (RecyclerView.Oooo0) viewL.getLayoutParams();
                        if (!oooo0.h() || oooo0.f() < 0 || oooo0.f() >= o0oo0oo.c()) {
                            z = this.s;
                            z2 = this.w;
                            if (z == z2 || (viewAX = aX(o00ooo, o0oo0oo, oooO00o2.d, z2)) == null) {
                                oooO00o2.b();
                                if (this.w) {
                                    iC = o0oo0oo.c() - 1;
                                } else {
                                    iC = 0;
                                }
                                oooO00o2.b = iC;
                            } else {
                                oooO00o2.c(viewAX, T(viewAX));
                                if (!o0oo0oo.h && aq()) {
                                    int iH2 = this.q.h(viewAX);
                                    int iD = this.q.d(viewAX);
                                    int iL = this.q.l();
                                    int i9 = this.q.i();
                                    boolean z3 = iD <= iL && iH2 < iL;
                                    boolean z4 = iH2 >= i9 && iD > i9;
                                    if (z3 || z4) {
                                        if (oooO00o2.d) {
                                            iL = i9;
                                        }
                                        oooO00o2.c = iL;
                                    }
                                }
                            }
                        } else {
                            oooO00o2.d(viewL, T(viewL));
                        }
                    } else {
                        z = this.s;
                        z2 = this.w;
                        if (z == z2) {
                            oooO00o2.b();
                            if (this.w) {
                                iC = o0oo0oo.c() - 1;
                            } else {
                                iC = 0;
                            }
                            oooO00o2.b = iC;
                        } else {
                            oooO00o2.b();
                            if (this.w) {
                                iC = o0oo0oo.c() - 1;
                            } else {
                                iC = 0;
                            }
                            oooO00o2.b = iC;
                        }
                    }
                }
            } else if (i < 0 || i >= o0oo0oo.c()) {
                this.t = -1;
                this.z = Integer.MIN_VALUE;
                if (w() == 0) {
                    oooO00o2.b();
                    if (this.w) {
                        iC = o0oo0oo.c() - 1;
                    } else {
                        iC = 0;
                    }
                    oooO00o2.b = iC;
                } else {
                    viewL = L();
                    if (viewL != null) {
                        oooo0 = (RecyclerView.Oooo0) viewL.getLayoutParams();
                        if (oooo0.h()) {
                            z = this.s;
                            z2 = this.w;
                            if (z == z2) {
                                oooO00o2.b();
                                if (this.w) {
                                    iC = o0oo0oo.c() - 1;
                                } else {
                                    iC = 0;
                                }
                                oooO00o2.b = iC;
                            } else {
                                oooO00o2.b();
                                if (this.w) {
                                    iC = o0oo0oo.c() - 1;
                                } else {
                                    iC = 0;
                                }
                                oooO00o2.b = iC;
                            }
                        } else {
                            z = this.s;
                            z2 = this.w;
                            if (z == z2) {
                                oooO00o2.b();
                                if (this.w) {
                                    iC = o0oo0oo.c() - 1;
                                } else {
                                    iC = 0;
                                }
                                oooO00o2.b = iC;
                            } else {
                                oooO00o2.b();
                                if (this.w) {
                                    iC = o0oo0oo.c() - 1;
                                } else {
                                    iC = 0;
                                }
                                oooO00o2.b = iC;
                            }
                        }
                    } else {
                        z = this.s;
                        z2 = this.w;
                        if (z == z2) {
                            oooO00o2.b();
                            if (this.w) {
                                iC = o0oo0oo.c() - 1;
                            } else {
                                iC = 0;
                            }
                            oooO00o2.b = iC;
                        } else {
                            oooO00o2.b();
                            if (this.w) {
                                iC = o0oo0oo.c() - 1;
                            } else {
                                iC = 0;
                            }
                            oooO00o2.b = iC;
                        }
                    }
                }
            } else {
                oooO00o2.b = this.t;
                OooO0o oooO0o2 = this.y;
                if (oooO0o2 != null && oooO0o2.e()) {
                    boolean z5 = this.y.d;
                    oooO00o2.d = z5;
                    if (z5) {
                        oooO00o2.c = this.q.i() - this.y.c;
                    } else {
                        oooO00o2.c = this.q.l() + this.y.c;
                    }
                } else if (this.z == Integer.MIN_VALUE) {
                    View viewV2 = v(this.t);
                    if (viewV2 == null) {
                        if (w() > 0) {
                            oooO00o2.d = (this.t < T(A(0))) == this.u;
                        }
                        oooO00o2.b();
                    } else if (this.q.e(viewV2) > this.q.m()) {
                        oooO00o2.b();
                    } else if (this.q.h(viewV2) - this.q.l() < 0) {
                        oooO00o2.c = this.q.l();
                        oooO00o2.d = false;
                    } else if (this.q.i() - this.q.d(viewV2) < 0) {
                        oooO00o2.c = this.q.i();
                        oooO00o2.d = true;
                    } else {
                        oooO00o2.c = oooO00o2.d ? this.q.o() + this.q.d(viewV2) : this.q.h(viewV2);
                    }
                } else {
                    boolean z6 = this.u;
                    oooO00o2.d = z6;
                    if (z6) {
                        oooO00o2.c = this.q.i() - this.z;
                    } else {
                        oooO00o2.c = this.q.l() + this.z;
                    }
                }
            }
            this.A.e = true;
        } else if (viewL2 != null && (this.q.h(viewL2) >= this.q.i() || this.q.d(viewL2) <= this.q.l())) {
            this.A.d(viewL2, T(viewL2));
        }
        OooO0OO oooO0OO = this.r;
        oooO0OO.f = oooO0OO.j >= 0 ? 1 : -1;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        aP(o0oo0oo, iArr);
        int iL2 = this.q.l() + Math.max(0, this.D[0]);
        int iJ = this.q.j() + Math.max(0, this.D[1]);
        if (o0oo0oo.h && (i6 = this.t) != -1 && this.z != Integer.MIN_VALUE && (viewV = v(i6)) != null) {
            if (this.u) {
                i7 = this.q.i() - this.q.d(viewV);
                iH = this.z;
            } else {
                iH = this.q.h(viewV) - this.q.l();
                i7 = this.z;
            }
            int i10 = i7 - iH;
            if (i10 > 0) {
                iL2 += i10;
            } else {
                iJ -= i10;
            }
        }
        OooO00o oooO00o3 = this.A;
        if (!oooO00o3.d ? !this.u : this.u) {
            i8 = 1;
        }
        bh(o00ooo, o0oo0oo, oooO00o3, i8);
        u(o00ooo);
        this.r.l = bk();
        Objects.requireNonNull(this.r);
        this.r.a = 0;
        OooO00o oooO00o4 = this.A;
        if (oooO00o4.d) {
            bs(oooO00o4.b, oooO00o4.c);
            OooO0OO oooO0OO2 = this.r;
            oooO0OO2.i = iL2;
            bn(o00ooo, oooO0OO2, o0oo0oo, false);
            OooO0OO oooO0OO3 = this.r;
            i3 = oooO0OO3.c;
            int i11 = oooO0OO3.e;
            int i12 = oooO0OO3.d;
            if (i12 > 0) {
                iJ += i12;
            }
            OooO00o oooO00o5 = this.A;
            bq(oooO00o5.b, oooO00o5.c);
            OooO0OO oooO0OO4 = this.r;
            oooO0OO4.i = iJ;
            oooO0OO4.e += oooO0OO4.g;
            bn(o00ooo, oooO0OO4, o0oo0oo, false);
            OooO0OO oooO0OO5 = this.r;
            i2 = oooO0OO5.c;
            int i13 = oooO0OO5.d;
            if (i13 > 0) {
                bs(i11, i3);
                OooO0OO oooO0OO6 = this.r;
                oooO0OO6.i = i13;
                bn(o00ooo, oooO0OO6, o0oo0oo, false);
                i3 = this.r.c;
            }
        } else {
            bq(oooO00o4.b, oooO00o4.c);
            OooO0OO oooO0OO7 = this.r;
            oooO0OO7.i = iJ;
            bn(o00ooo, oooO0OO7, o0oo0oo, false);
            OooO0OO oooO0OO8 = this.r;
            i2 = oooO0OO8.c;
            int i14 = oooO0OO8.e;
            int i15 = oooO0OO8.d;
            if (i15 > 0) {
                iL2 += i15;
            }
            OooO00o oooO00o6 = this.A;
            bs(oooO00o6.b, oooO00o6.c);
            OooO0OO oooO0OO9 = this.r;
            oooO0OO9.i = iL2;
            oooO0OO9.e += oooO0OO9.g;
            bn(o00ooo, oooO0OO9, o0oo0oo, false);
            OooO0OO oooO0OO10 = this.r;
            int i16 = oooO0OO10.c;
            int i17 = oooO0OO10.d;
            if (i17 > 0) {
                bq(i14, i2);
                OooO0OO oooO0OO11 = this.r;
                oooO0OO11.i = i17;
                bn(o00ooo, oooO0OO11, o0oo0oo, false);
                i2 = this.r.c;
            }
            i3 = i16;
        }
        if (w() > 0) {
            if (this.u ^ this.w) {
                int iAZ2 = aZ(i2, o00ooo, o0oo0oo, true);
                i4 = i3 + iAZ2;
                i5 = i2 + iAZ2;
                iAZ = ba(i4, o00ooo, o0oo0oo, false);
            } else {
                int iBa = ba(i3, o00ooo, o0oo0oo, true);
                i4 = i3 + iBa;
                i5 = i2 + iBa;
                iAZ = aZ(i5, o00ooo, o0oo0oo, false);
            }
            i3 = i4 + iAZ;
            i2 = i5 + iAZ;
        }
        if (o0oo0oo.k && w() != 0 && !o0oo0oo.h && aq()) {
            List<RecyclerView.o0O0O00> list = o00ooo.d;
            int size = list.size();
            int iT = T(A(0));
            int iE = 0;
            int iE2 = 0;
            for (int i18 = 0; i18 < size; i18++) {
                RecyclerView.o0O0O00 o0o0o00 = list.get(i18);
                if (!o0o0o00.p()) {
                    if ((o0o0o00.h() < iT) != this.u) {
                        iE += this.q.e(o0o0o00.c);
                    } else {
                        iE2 += this.q.e(o0o0o00.c);
                    }
                }
            }
            this.r.k = list;
            if (iE > 0) {
                bs(T(bb()), i3);
                OooO0OO oooO0OO12 = this.r;
                oooO0OO12.i = iE;
                oooO0OO12.d = 0;
                oooO0OO12.b(null);
                bn(o00ooo, this.r, o0oo0oo, false);
            }
            if (iE2 > 0) {
                bq(T(bc()), i2);
                OooO0OO oooO0OO13 = this.r;
                oooO0OO13.i = iE2;
                oooO0OO13.d = 0;
                oooO0OO13.b(null);
                bn(o00ooo, this.r, o0oo0oo, false);
            }
            this.r.k = null;
        }
        if (o0oo0oo.h) {
            this.A.e();
        } else {
            g gVar = this.q;
            gVar.b = gVar.m();
        }
        this.s = this.w;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public int aG(int i, RecyclerView.o00Ooo o00ooo, RecyclerView.o0Oo0oo o0oo0oo) {
        if (this.p == 1) {
            return 0;
        }
        return bm(i, o00ooo, o0oo0oo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void aJ(RecyclerView.o0Oo0oo o0oo0oo) {
        this.y = null;
        this.t = -1;
        this.z = Integer.MIN_VALUE;
        this.A.e();
    }

    public final void aK(int i, int i2, boolean z, RecyclerView.o0Oo0oo o0oo0oo) {
        int iL;
        this.r.l = bk();
        this.r.f = i;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        aP(o0oo0oo, iArr);
        int iMax = Math.max(0, this.D[0]);
        int iMax2 = Math.max(0, this.D[1]);
        boolean z2 = i == 1;
        OooO0OO oooO0OO = this.r;
        int i3 = z2 ? iMax2 : iMax;
        oooO0OO.i = i3;
        if (!z2) {
            iMax = iMax2;
        }
        oooO0OO.a = iMax;
        if (z2) {
            oooO0OO.i = this.q.j() + i3;
            View viewBc = bc();
            OooO0OO oooO0OO2 = this.r;
            oooO0OO2.g = this.u ? -1 : 1;
            int iT = T(viewBc);
            OooO0OO oooO0OO3 = this.r;
            oooO0OO2.e = iT + oooO0OO3.g;
            oooO0OO3.c = this.q.d(viewBc);
            iL = this.q.d(viewBc) - this.q.i();
        } else {
            View viewBb = bb();
            OooO0OO oooO0OO4 = this.r;
            oooO0OO4.i = this.q.l() + oooO0OO4.i;
            OooO0OO oooO0OO5 = this.r;
            oooO0OO5.g = this.u ? 1 : -1;
            int iT2 = T(viewBb);
            OooO0OO oooO0OO6 = this.r;
            oooO0OO5.e = iT2 + oooO0OO6.g;
            oooO0OO6.c = this.q.h(viewBb);
            iL = (-this.q.h(viewBb)) + this.q.l();
        }
        OooO0OO oooO0OO7 = this.r;
        oooO0OO7.d = i2;
        if (z) {
            oooO0OO7.d = i2 - iL;
        }
        oooO0OO7.h = iL;
    }

    public int aL(int i) {
        if (i == 1) {
            return (this.p != 1 && bd()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.p != 1 && bd()) ? -1 : 1;
        }
        if (i == 17) {
            return this.p != 0 ? Integer.MIN_VALUE : -1;
        }
        if (i == 33) {
            return this.p != 1 ? Integer.MIN_VALUE : -1;
        }
        if (i != 66) {
            return (i == 130 && this.p == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.p == 0 ? 1 : Integer.MIN_VALUE;
    }

    public void aP(RecyclerView.o0Oo0oo o0oo0oo, int[] iArr) {
        int i;
        int iM = o0oo0oo.b != -1 ? this.q.m() : 0;
        if (this.r.f == -1) {
            i = 0;
        } else {
            i = iM;
            iM = 0;
        }
        iArr[0] = iM;
        iArr[1] = i;
    }

    public void aQ(RecyclerView.o0Oo0oo o0oo0oo, OooO0OO oooO0OO, RecyclerView.Oooo000.OooO0OO oooO0OO2) {
        int i = oooO0OO.e;
        if (i < 0 || i >= o0oo0oo.c()) {
            return;
        }
        ((q.aNf) oooO0OO2).b(i, Math.max(0, oooO0OO.h));
    }

    public final int aR(RecyclerView.o0Oo0oo o0oo0oo) {
        if (w() == 0) {
            return 0;
        }
        aV();
        return i.b(o0oo0oo, this.q, aU(!this.x, true), bj(!this.x, true), this, this.x, this.u);
    }

    public final int aS(RecyclerView.o0Oo0oo o0oo0oo) {
        if (w() == 0) {
            return 0;
        }
        aV();
        return i.c(o0oo0oo, this.q, aU(!this.x, true), bj(!this.x, true), this, this.x);
    }

    public View aT(int i, int i2) {
        int i3;
        int i4;
        aV();
        if (i2 <= i && i2 >= i) {
            return A(i);
        }
        if (this.q.h(A(i)) < this.q.l()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.p == 0 ? this.d.b(i, i2, i3, i4) : this.e.b(i, i2, i3, i4);
    }

    public View aU(boolean z, boolean z2) {
        return this.u ? aY(w() - 1, -1, z, z2) : aY(0, w(), z, z2);
    }

    public void aV() {
        if (this.r == null) {
            this.r = new OooO0OO();
        }
    }

    public int aW() {
        View viewAY = aY(0, w(), false, true);
        if (viewAY == null) {
            return -1;
        }
        return T(viewAY);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    public View aX(RecyclerView.o00Ooo o00ooo, RecyclerView.o0Oo0oo o0oo0oo, boolean z, boolean z2) {
        int i;
        int iW;
        int i2;
        aV();
        int iW2 = w();
        if (z2) {
            iW = w() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iW2;
            iW = 0;
            i2 = 1;
        }
        int iC = o0oo0oo.c();
        int iL = this.q.l();
        int i3 = this.q.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iW != i) {
            View viewA = A(iW);
            int iT = T(viewA);
            int iH = this.q.h(viewA);
            int iD = this.q.d(viewA);
            if (iT >= 0 && iT < iC) {
                if (!((RecyclerView.Oooo0) viewA.getLayoutParams()).h()) {
                    boolean z3 = iD <= iL && iH < iL;
                    boolean z4 = iH >= i3 && iD > i3;
                    if (!z3 && !z4) {
                        return viewA;
                    }
                    if (z) {
                        if (z4) {
                            view2 = viewA;
                        } else if (view == null) {
                            view = viewA;
                        }
                    } else if (z3) {
                        view2 = viewA;
                    } else if (view == null) {
                        view = viewA;
                    }
                } else if (view3 == null) {
                    view3 = viewA;
                }
            }
            iW += i2;
        }
        if (view == null) {
            return view2 != null ? view2 : view3;
        }
        return view;
    }

    public View aY(int i, int i2, boolean z, boolean z2) {
        aV();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        return this.p == 0 ? this.d.b(i, i2, i3, i4) : this.e.b(i, i2, i3, i4);
    }

    public final int aZ(int i, RecyclerView.o00Ooo o00ooo, RecyclerView.o0Oo0oo o0oo0oo, boolean z) {
        int i2;
        int i3 = this.q.i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -bm(-i3, o00ooo, o0oo0oo);
        if (!z || (i2 = this.q.i() - (i + i4)) <= 0) {
            return i4;
        }
        this.q.q(i2);
        return i2 + i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void aa(RecyclerView recyclerView, RecyclerView.o00Ooo o00ooo) {
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004e  */
    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public View ab(View view, int i, RecyclerView.o00Ooo o00ooo, RecyclerView.o0Oo0oo o0oo0oo) {
        int iAL;
        View viewAT;
        bl();
        if (w() == 0 || (iAL = aL(i)) == Integer.MIN_VALUE) {
            return null;
        }
        aV();
        aK(iAL, (int) (this.q.m() * 0.33333334f), false, o0oo0oo);
        OooO0OO oooO0OO = this.r;
        oooO0OO.h = Integer.MIN_VALUE;
        oooO0OO.b = false;
        bn(o00ooo, oooO0OO, o0oo0oo, true);
        if (iAL == -1) {
            if (this.u) {
                viewAT = aT(w() - 1, -1);
            } else {
                viewAT = aT(0, w());
            }
        } else if (this.u) {
            viewAT = aT(0, w());
        } else {
            viewAT = aT(w() - 1, -1);
        }
        View viewBb = iAL == -1 ? bb() : bc();
        if (!viewBb.hasFocusable()) {
            return viewAT;
        }
        if (viewAT == null) {
            return null;
        }
        return viewBb;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void ac(AccessibilityEvent accessibilityEvent) {
        super.ac(accessibilityEvent);
        if (w() > 0) {
            accessibilityEvent.setFromIndex(aW());
            accessibilityEvent.setToIndex(br());
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002b  */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public boolean an() {
        boolean z;
        if (this.n == 1073741824 || this.l == 1073741824) {
            return false;
        }
        int iW = w();
        for (int i = 0; i < iW; i++) {
            ViewGroup.LayoutParams layoutParams = A(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                z = true;
                if (z) {
                    return true;
                }
                return false;
            }
        }
        z = false;
        if (z) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public boolean aq() {
        return this.y == null && this.s == this.w;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void as(Parcelable parcelable) {
        if (parcelable instanceof OooO0o) {
            OooO0o oooO0o = (OooO0o) parcelable;
            this.y = oooO0o;
            if (this.t != -1) {
                oooO0o.b = -1;
            }
            aF();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public Parcelable at() {
        OooO0o oooO0o = this.y;
        if (oooO0o != null) {
            return new OooO0o(oooO0o);
        }
        OooO0o oooO0o2 = new OooO0o();
        if (w() > 0) {
            aV();
            boolean z = this.s ^ this.u;
            oooO0o2.d = z;
            if (z) {
                View viewBc = bc();
                oooO0o2.c = this.q.i() - this.q.d(viewBc);
                oooO0o2.b = T(viewBc);
            } else {
                View viewBb = bb();
                oooO0o2.b = T(viewBb);
                oooO0o2.c = this.q.h(viewBb) - this.q.l();
            }
        } else {
            oooO0o2.b = -1;
        }
        return oooO0o2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0OOO0o.OooO0O0
    public PointF b(int i) {
        if (w() == 0) {
            return null;
        }
        int i2 = (i < T(A(0))) != this.u ? -1 : 1;
        return this.p == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    public final int ba(int i, RecyclerView.o00Ooo o00ooo, RecyclerView.o0Oo0oo o0oo0oo, boolean z) {
        int iL;
        int iL2 = i - this.q.l();
        if (iL2 <= 0) {
            return 0;
        }
        int i2 = -bm(iL2, o00ooo, o0oo0oo);
        if (!z || (iL = (i + i2) - this.q.l()) <= 0) {
            return i2;
        }
        this.q.q(-iL);
        return i2 - iL;
    }

    public final View bb() {
        return A(this.u ? w() - 1 : 0);
    }

    public final View bc() {
        return A(this.u ? 0 : w() - 1);
    }

    public boolean bd() {
        return M() == 1;
    }

    public final int be(RecyclerView.o0Oo0oo o0oo0oo) {
        if (w() == 0) {
            return 0;
        }
        aV();
        return i.a(o0oo0oo, this.q, aU(!this.x, true), bj(!this.x, true), this, this.x);
    }

    public final void bf(RecyclerView.o00Ooo o00ooo, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                ax(i, o00ooo);
                i--;
            }
        } else {
            while (true) {
                i2--;
                if (i2 < i) {
                    return;
                } else {
                    ax(i2, o00ooo);
                }
            }
        }
    }

    public void bg(RecyclerView.o00Ooo o00ooo, RecyclerView.o0Oo0oo o0oo0oo, OooO0OO oooO0OO, OooO0O0 oooO0O0) {
        int iF;
        int i;
        int iF2;
        int i2;
        int iQ;
        View viewD = oooO0OO.d(o00ooo);
        if (viewD == null) {
            oooO0O0.b = true;
            return;
        }
        RecyclerView.Oooo0 oooo0 = (RecyclerView.Oooo0) viewD.getLayoutParams();
        if (oooO0OO.k == null) {
            if (this.u == (oooO0OO.f == -1)) {
                h(viewD, -1, false);
            } else {
                h(viewD, 0, false);
            }
        } else {
            if (this.u == (oooO0OO.f == -1)) {
                h(viewD, -1, true);
            } else {
                h(viewD, 0, true);
            }
        }
        RecyclerView.Oooo0 oooo1 = (RecyclerView.Oooo0) viewD.getLayoutParams();
        Rect rectQ = this.c.Q(viewD);
        int i3 = rectQ.left;
        int i4 = rectQ.right;
        int i5 = rectQ.top;
        int i6 = rectQ.bottom;
        int i7 = this.m;
        int i8 = this.l;
        int iQ2 = Q();
        int iR = R();
        int iC = RecyclerView.Oooo000.c(i7, i8, iR + iQ2 + ((ViewGroup.MarginLayoutParams) oooo1).leftMargin + ((ViewGroup.MarginLayoutParams) oooo1).rightMargin + i3 + i4, ((ViewGroup.MarginLayoutParams) oooo1).width, k());
        int i9 = this.f26o;
        int i10 = this.n;
        int iH = H();
        int iO = O();
        int iC2 = RecyclerView.Oooo000.c(i9, i10, iO + iH + ((ViewGroup.MarginLayoutParams) oooo1).topMargin + ((ViewGroup.MarginLayoutParams) oooo1).bottomMargin + i5 + i6, ((ViewGroup.MarginLayoutParams) oooo1).height, j());
        if (am(viewD, iC, iC2, oooo1)) {
            viewD.measure(iC, iC2);
        }
        oooO0O0.a = this.q.e(viewD);
        if (this.p == 1) {
            if (bd()) {
                iF2 = this.m - R();
                iQ = iF2 - this.q.f(viewD);
            } else {
                iQ = Q();
                iF2 = this.q.f(viewD) + iQ;
            }
            if (oooO0OO.f == -1) {
                int i11 = oooO0OO.c;
                i2 = i11 - oooO0O0.a;
                iF = i11;
            } else {
                int i12 = oooO0OO.c;
                iF = oooO0O0.a + i12;
                i2 = i12;
            }
            i = iQ;
        } else {
            int iH2 = H();
            iF = this.q.f(viewD) + iH2;
            if (oooO0OO.f == -1) {
                int i13 = oooO0OO.c;
                iF2 = i13;
                i = i13 - oooO0O0.a;
            } else {
                i = oooO0OO.c;
                iF2 = oooO0O0.a + i;
            }
            i2 = iH2;
        }
        W(viewD, i, i2, iF2, iF);
        if (oooo0.h() || oooo0.g()) {
            oooO0O0.c = true;
        }
        oooO0O0.d = viewD.hasFocusable();
    }

    public void bh(RecyclerView.o00Ooo o00ooo, RecyclerView.o0Oo0oo o0oo0oo, OooO00o oooO00o, int i) {
    }

    public final void bi(RecyclerView.o00Ooo o00ooo, OooO0OO oooO0OO) {
        if (!oooO0OO.b || oooO0OO.l) {
            return;
        }
        int i = oooO0OO.h;
        int i2 = oooO0OO.a;
        if (oooO0OO.f == -1) {
            int iW = w();
            if (i >= 0) {
                int iG = (this.q.g() - i) + i2;
                if (this.u) {
                    for (int i3 = 0; i3 < iW; i3++) {
                        View viewA = A(i3);
                        if (this.q.h(viewA) < iG || this.q.p(viewA) < iG) {
                            bf(o00ooo, 0, i3);
                            return;
                        }
                    }
                    return;
                }
                int i4 = iW - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View viewA2 = A(i5);
                    if (this.q.h(viewA2) < iG || this.q.p(viewA2) < iG) {
                        bf(o00ooo, i4, i5);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i >= 0) {
            int i6 = i - i2;
            int iW2 = w();
            if (!this.u) {
                for (int i7 = 0; i7 < iW2; i7++) {
                    View viewA3 = A(i7);
                    if (this.q.d(viewA3) > i6 || this.q.n(viewA3) > i6) {
                        bf(o00ooo, 0, i7);
                        return;
                    }
                }
                return;
            }
            int i8 = iW2 - 1;
            for (int i9 = i8; i9 >= 0; i9--) {
                View viewA4 = A(i9);
                if (this.q.d(viewA4) > i6 || this.q.n(viewA4) > i6) {
                    bf(o00ooo, i8, i9);
                    return;
                }
            }
        }
    }

    public View bj(boolean z, boolean z2) {
        return this.u ? aY(0, w(), z, z2) : aY(w() - 1, -1, z, z2);
    }

    public boolean bk() {
        return this.q.c() == 0 && this.q.g() == 0;
    }

    public final void bl() {
        if (this.p == 1 || !bd()) {
            this.u = this.v;
        } else {
            this.u = !this.v;
        }
    }

    public int bm(int i, RecyclerView.o00Ooo o00ooo, RecyclerView.o0Oo0oo o0oo0oo) {
        if (w() == 0 || i == 0) {
            return 0;
        }
        aV();
        this.r.b = true;
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        aK(i2, iAbs, true, o0oo0oo);
        OooO0OO oooO0OO = this.r;
        int iBn = bn(o00ooo, oooO0OO, o0oo0oo, false) + oooO0OO.h;
        if (iBn < 0) {
            return 0;
        }
        if (iAbs > iBn) {
            i = i2 * iBn;
        }
        this.q.q(-i);
        this.r.j = i;
        return i;
    }

    public int bn(RecyclerView.o00Ooo o00ooo, OooO0OO oooO0OO, RecyclerView.o0Oo0oo o0oo0oo, boolean z) {
        int i = oooO0OO.d;
        int i2 = oooO0OO.h;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                oooO0OO.h = i2 + i;
            }
            bi(o00ooo, oooO0OO);
        }
        int i3 = oooO0OO.d + oooO0OO.i;
        OooO0O0 oooO0O0 = this.C;
        while (true) {
            if ((!oooO0OO.l && i3 <= 0) || !oooO0OO.c(o0oo0oo)) {
                break;
            }
            oooO0O0.a = 0;
            oooO0O0.b = false;
            oooO0O0.c = false;
            oooO0O0.d = false;
            bg(o00ooo, o0oo0oo, oooO0OO, oooO0O0);
            if (!oooO0O0.b) {
                int i4 = oooO0OO.c;
                int i5 = oooO0O0.a;
                oooO0OO.c = (oooO0OO.f * i5) + i4;
                if (!oooO0O0.c || oooO0OO.k != null || !o0oo0oo.h) {
                    oooO0OO.d -= i5;
                    i3 -= i5;
                }
                int i6 = oooO0OO.h;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    oooO0OO.h = i7;
                    int i8 = oooO0OO.d;
                    if (i8 < 0) {
                        oooO0OO.h = i7 + i8;
                    }
                    bi(o00ooo, oooO0OO);
                }
                if (z && oooO0O0.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - oooO0OO.d;
    }

    public void bo(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(ivas.gov.bisp.enumeration.p091n.j.o("invalid orientation:", i));
        }
        i(null);
        if (i != this.p || this.q == null) {
            g gVarB = g.b(this, i);
            this.q = gVarB;
            this.A.a = gVarB;
            this.p = i;
            aF();
        }
    }

    public void bp(boolean z) {
        i(null);
        if (this.w == z) {
            return;
        }
        this.w = z;
        aF();
    }

    public final void bq(int i, int i2) {
        this.r.d = this.q.i() - i2;
        OooO0OO oooO0OO = this.r;
        oooO0OO.g = this.u ? -1 : 1;
        oooO0OO.e = i;
        oooO0OO.f = 1;
        oooO0OO.c = i2;
        oooO0OO.h = Integer.MIN_VALUE;
    }

    public int br() {
        View viewAY = aY(w() - 1, -1, false, true);
        if (viewAY != null) {
            return T(viewAY);
        }
        return -1;
    }

    public final void bs(int i, int i2) {
        this.r.d = i2 - this.q.l();
        OooO0OO oooO0OO = this.r;
        oooO0OO.e = i;
        oooO0OO.g = this.u ? 1 : -1;
        oooO0OO.f = -1;
        oooO0OO.c = i2;
        oooO0OO.h = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void f(int i, int i2, RecyclerView.o0Oo0oo o0oo0oo, RecyclerView.Oooo000.OooO0OO oooO0OO) {
        if (this.p != 0) {
            i = i2;
        }
        if (w() == 0 || i == 0) {
            return;
        }
        aV();
        aK(i > 0 ? 1 : -1, Math.abs(i), true, o0oo0oo);
        aQ(o0oo0oo, this.r, oooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void i(String str) {
        RecyclerView recyclerView;
        if (this.y != null || (recyclerView = this.c) == null) {
            return;
        }
        recyclerView.l(str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public boolean j() {
        return this.p == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public boolean k() {
        return this.p == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void m(int i, RecyclerView.Oooo000.OooO0OO oooO0OO) {
        boolean z;
        int i2;
        OooO0o oooO0o = this.y;
        if (oooO0o == null || !oooO0o.e()) {
            bl();
            z = this.u;
            i2 = this.t;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            OooO0o oooO0o2 = this.y;
            z = oooO0o2.d;
            i2 = oooO0o2.b;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.B && i2 >= 0 && i2 < i; i4++) {
            ((q.aNf) oooO0OO).b(i2, 0);
            i2 += i3;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public int n(RecyclerView.o0Oo0oo o0oo0oo) {
        return be(o0oo0oo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public int o(RecyclerView.o0Oo0oo o0oo0oo) {
        return aR(o0oo0oo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public int p(RecyclerView.o0Oo0oo o0oo0oo) {
        return be(o0oo0oo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public int q(RecyclerView.o0Oo0oo o0oo0oo) {
        return aS(o0oo0oo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public int r(RecyclerView.o0Oo0oo o0oo0oo) {
        return aR(o0oo0oo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public int s(RecyclerView.o0Oo0oo o0oo0oo) {
        return aS(o0oo0oo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public View v(int i) {
        int iW = w();
        if (iW == 0) {
            return null;
        }
        int iT = i - T(A(0));
        if (iT >= 0 && iT < iW) {
            View viewA = A(iT);
            if (T(viewA) == i) {
                return viewA;
            }
        }
        return super.v(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public RecyclerView.Oooo0 y() {
        return new RecyclerView.Oooo0(-2, -2);
    }

    public LinearLayoutManager(int i, boolean z) {
        this.p = 1;
        this.v = false;
        this.u = false;
        this.w = false;
        this.x = true;
        this.t = -1;
        this.z = Integer.MIN_VALUE;
        this.y = null;
        this.A = new OooO00o();
        this.C = new OooO0O0();
        this.B = 2;
        this.D = new int[2];
        bo(i);
        i(null);
        if (z != this.v) {
            this.v = z;
            aF();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void ap(RecyclerView recyclerView, RecyclerView.o0Oo0oo o0oo0oo, int i) {
        r rVar = new r(recyclerView.getContext());
        rVar.a = i;
        ao(rVar);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = 1;
        this.v = false;
        this.u = false;
        this.w = false;
        this.x = true;
        this.t = -1;
        this.z = Integer.MIN_VALUE;
        this.y = null;
        this.A = new OooO00o();
        this.C = new OooO0O0();
        this.B = 2;
        this.D = new int[2];
        RecyclerView.Oooo000.OooO0o oooO0oD = RecyclerView.Oooo000.d(context, attributeSet, i, i2);
        bo(oooO0oD.a);
        boolean z = oooO0oD.c;
        i(null);
        if (z != this.v) {
            this.v = z;
            aF();
        }
        bp(oooO0oD.d);
    }
}
