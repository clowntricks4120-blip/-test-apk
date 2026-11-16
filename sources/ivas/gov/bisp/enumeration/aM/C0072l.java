package ivas.gov.bisp.enumeration.aM;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import ivas.gov.bisp.enumeration.F.K;
import java.util.ArrayList;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aM.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
public class C0072l extends K {
    private static int a = 0;
    private static int b = 1;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aM.l$bHi */
    public class bHi extends J.bHg {
        public bHi(C0072l c0072l, Rect rect) {
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aM.l$bHj */
    public class bHj implements J.InterfaceC0070bHc {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ View c;
        public final /* synthetic */ ArrayList d;

        public bHj(C0072l c0072l, View view, ArrayList arrayList) {
            this.c = view;
            this.d = arrayList;
        }

        @Override // ivas.gov.bisp.enumeration.aM.J.InterfaceC0070bHc
        public void a(J j) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 | 43) << 1;
            int i4 = -(i2 ^ 43);
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.aM.J.InterfaceC0070bHc
        public void b(J j) {
            int i = 2 % 2;
            int i2 = b + 25;
            a = i2 % 128;
            int i3 = i2 % 2;
            j.y(this);
            View view = this.c;
            int i4 = b;
            int i5 = i4 & 103;
            int i6 = (i5 - (~(-(-((i4 ^ 103) | i5))))) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
            view.setVisibility(8);
            int size = this.d.size();
            int i8 = b;
            int i9 = (i8 & 43) + (i8 | 43);
            int i10 = i9 % 128;
            a = i10;
            if (i9 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i11 = i10 & 47;
            int i12 = ((i10 | 47) & (~i11)) + (i11 << 1);
            b = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 3 % 3;
            }
            int i14 = 0;
            while (i14 < size) {
                int i15 = a;
                int i16 = i15 & 11;
                int i17 = ((i15 | 11) & (~i16)) + (i16 << 1);
                b = i17 % 128;
                int i18 = i17 % 2;
                View view2 = (View) this.d.get(i14);
                int i19 = a + 19;
                b = i19 % 128;
                int i20 = i19 % 2;
                view2.setVisibility(0);
                int i21 = (i14 & (-2)) | ((~i14) & 1);
                int i22 = -(-((i14 & 1) << 1));
                i14 = ((i21 | i22) << 1) - (i22 ^ i21);
                int i23 = a;
                int i24 = ((i23 & 20) + (i23 | 20)) - 1;
                b = i24 % 128;
                if (i24 % 2 != 0) {
                    int i25 = 4 % 2;
                }
            }
            int i26 = a + 65;
            b = i26 % 128;
            int i27 = i26 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.aM.J.InterfaceC0070bHc
        public void c(J j) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 83;
            int i4 = ((i2 | 83) & (~i3)) + (i3 << 1);
            a = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.aM.J.InterfaceC0070bHc
        public void d(J j) {
            int i = 2 % 2;
            int i2 = b + 32;
            int i3 = (i2 ^ (-1)) + (i2 << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.aM.J.InterfaceC0070bHc
        public void e(J j) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 23;
            int i4 = (i3 - (~((i2 ^ 23) | i3))) - 1;
            a = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aM.l$bHl */
    public class bHl extends J.bHg {
        public bHl(C0072l c0072l, Rect rect) {
        }
    }

    @Override // ivas.gov.bisp.enumeration.F.K
    public void g(Object obj, View view) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((((i2 ^ 3) | (i2 & 3)) << 1) - (~(-(((~i2) & 3) | (i2 & (-4)))))) - 1;
        a = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (obj != null) {
            ((J) obj).h(view);
            int i4 = a;
            int i5 = i4 & 65;
            int i6 = ((((i4 ^ 65) | i5) << 1) - (~(-((i4 | 65) & (~i5))))) - 1;
            b = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = b;
        int i9 = i8 & 123;
        int i10 = (((i8 ^ 123) | i9) << 1) - ((i8 | 123) & (~i9));
        a = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.F.K
    public void i(ViewGroup viewGroup, Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 29) << 1) - (i2 ^ 29);
        b = i3 % 128;
        int i4 = i3 % 2;
        C0073m.b(viewGroup, (J) obj);
        int i5 = a + 13;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 14 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.F.K
    public boolean k(Object obj) {
        int i = 2 % 2;
        int i2 = b + 36;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return obj instanceof J;
        }
        boolean z = obj instanceof J;
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.F.K
    public Object l(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 51;
        int i4 = i3 + ((i2 ^ 51) | i3);
        int i5 = i4 % 128;
        b = i5;
        J jN = null;
        if (i4 % 2 == 0) {
            jN.hashCode();
            throw null;
        }
        if (obj != null) {
            jN = ((J) obj).n();
            int i6 = b;
            int i7 = ((i6 ^ 68) + ((i6 & 68) << 1)) - 1;
            a = i7 % 128;
            int i8 = i7 % 2;
        } else {
            int i9 = ((i5 ^ 41) - (~(-(-((i5 & 41) << 1))))) - 1;
            a = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = b;
        int i12 = i11 & 31;
        int i13 = i12 + ((i11 ^ 31) | i12);
        a = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 29 / 0;
        }
        return jN;
    }

    @Override // ivas.gov.bisp.enumeration.F.K
    public Object p(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        O o2 = new O();
        Object obj4 = null;
        if (obj != null) {
            int i2 = a;
            int i3 = (i2 | 41) << 1;
            int i4 = -(((~i2) & 41) | (i2 & (-42)));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                o2.L((J) obj);
                obj4.hashCode();
                throw null;
            }
            o2.L((J) obj);
            int i6 = a;
            int i7 = i6 & 1;
            int i8 = -(-((i6 ^ 1) | i7));
            int i9 = (i7 & i8) + (i8 | i7);
            b = i9 % 128;
            int i10 = i9 % 2;
        }
        if (obj2 != null) {
            int i11 = b + 53;
            a = i11 % 128;
            if (i11 % 2 != 0) {
                o2.L((J) obj2);
                obj4.hashCode();
                throw null;
            }
            o2.L((J) obj2);
        }
        if (obj3 != null) {
            int i12 = a;
            int i13 = i12 & 89;
            int i14 = (((i12 | 89) & (~i13)) - (~(-(-(i13 << 1))))) - 1;
            b = i14 % 128;
            int i15 = i14 % 2;
            o2.L((J) obj3);
            int i16 = b;
            int i17 = i16 & 85;
            int i18 = (i17 - (~(-(-((i16 ^ 85) | i17))))) - 1;
            a = i18 % 128;
            int i19 = i18 % 2;
        }
        int i20 = b;
        int i21 = (i20 & (-8)) | ((~i20) & 7);
        int i22 = -(-((i20 & 7) << 1));
        int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
        a = i23 % 128;
        if (i23 % 2 != 0) {
            int i24 = 77 / 0;
        }
        return o2;
    }

    @Override // ivas.gov.bisp.enumeration.F.K
    public void q(Object obj, View view) {
        int i = 2 % 2;
        int i2 = b + 105;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        if (obj != null) {
            int i5 = i3 & 49;
            int i6 = (i5 - (~(-(-((i3 ^ 49) | i5))))) - 1;
            b = i6 % 128;
            if (i6 % 2 == 0) {
                ((J) obj).z(view);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            ((J) obj).z(view);
        }
        int i7 = a + 41;
        b = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.F.K
    public void u(Object obj, Rect rect) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((((i2 ^ 63) | (i2 & 63)) << 1) - (~(-(((~i2) & 63) | (i2 & (-64)))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        if (obj != null) {
            ((J) obj).C(new bHl(this, rect));
            int i5 = a;
            int i6 = ((i5 & 47) - (~(i5 | 47))) - 1;
            b = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 4 / 4;
            }
        }
        int i8 = b;
        int i9 = ((i8 | 67) << 1) - (i8 ^ 67);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        r1 = new ivas.gov.bisp.enumeration.aM.O();
        r1.L((ivas.gov.bisp.enumeration.aM.J) r7);
        r7 = ivas.gov.bisp.enumeration.aM.C0072l.b;
        r3 = r7 ^ 91;
        r4 = (r7 & 91) << 1;
        r5 = ((r3 | r4) << 1) - (r3 ^ r4);
        ivas.gov.bisp.enumeration.aM.C0072l.a = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        if ((r5 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        r3 = 18 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        r3 = r7 & 59;
        r7 = r7 | 59;
        r4 = (r3 & r7) + (r7 | r3);
        ivas.gov.bisp.enumeration.aM.C0072l.a = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        if ((r4 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r7 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r7 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        r7 = ((r1 | 71) << 1) - (((~r1) & 71) | (r1 & (-72)));
        ivas.gov.bisp.enumeration.aM.C0072l.a = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if ((r7 % 2) != 0) goto L11;
     */
    @Override // ivas.gov.bisp.enumeration.F.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.aM.C0072l.a
            r2 = r1 & (-56)
            int r3 = ~r1
            r3 = r3 & 55
            r2 = r2 | r3
            r1 = r1 & 55
            int r1 = r1 << 1
            r3 = r2 & r1
            r1 = r1 | r2
            int r3 = r3 + r1
            int r1 = r3 % 128
            ivas.gov.bisp.enumeration.aM.C0072l.b = r1
            int r3 = r3 % r0
            r2 = 0
            if (r3 != 0) goto L21
            r3 = 6
            int r3 = r3 / 0
            if (r7 != 0) goto L3a
            goto L23
        L21:
            if (r7 != 0) goto L3a
        L23:
            r7 = r1 | 71
            int r7 = r7 << 1
            r3 = r1 & (-72)
            int r1 = ~r1
            r1 = r1 & 71
            r1 = r1 | r3
            int r7 = r7 - r1
            int r1 = r7 % 128
            ivas.gov.bisp.enumeration.aM.C0072l.a = r1
            int r7 = r7 % r0
            if (r7 != 0) goto L36
            return r2
        L36:
            r2.hashCode()
            throw r2
        L3a:
            ivas.gov.bisp.enumeration.aM.O r1 = new ivas.gov.bisp.enumeration.aM.O
            r1.<init>()
            ivas.gov.bisp.enumeration.aM.J r7 = (ivas.gov.bisp.enumeration.aM.J) r7
            r1.L(r7)
            int r7 = ivas.gov.bisp.enumeration.aM.C0072l.b
            r3 = r7 ^ 91
            r4 = r7 & 91
            int r4 = r4 << 1
            r5 = r3 | r4
            int r5 = r5 << 1
            r3 = r3 ^ r4
            int r5 = r5 - r3
            int r3 = r5 % 128
            ivas.gov.bisp.enumeration.aM.C0072l.a = r3
            int r5 = r5 % r0
            if (r5 == 0) goto L5d
            r3 = 18
            int r3 = r3 / 0
        L5d:
            r3 = r7 & 59
            r7 = r7 | 59
            r4 = r3 & r7
            r7 = r7 | r3
            int r4 = r4 + r7
            int r7 = r4 % 128
            ivas.gov.bisp.enumeration.aM.C0072l.a = r7
            int r4 = r4 % r0
            if (r4 != 0) goto L6d
            return r1
        L6d:
            r2.hashCode()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aM.C0072l.A(java.lang.Object):java.lang.Object");
    }

    @Override // ivas.gov.bisp.enumeration.F.K
    public void s(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        int i = 2 % 2;
        J j = (J) obj;
        bHk bhk = new bHk(obj2, arrayList, obj3, arrayList2, obj4, arrayList3);
        int i2 = b;
        int i3 = (i2 & 101) + (i2 | 101);
        a = i3 % 128;
        Object obj5 = null;
        if (i3 % 2 != 0) {
            j.g(bhk);
            throw null;
        }
        j.g(bhk);
        int i4 = b;
        int i5 = (i4 ^ 111) + ((i4 & 111) << 1);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj5.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.F.K
    public void t(Object obj, View view, ArrayList<View> arrayList) {
        int i = 2 % 2;
        J j = (J) obj;
        bHj bhj = new bHj(this, view, arrayList);
        int i2 = a + 35;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            j.g(bhj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        j.g(bhj);
        int i3 = a;
        int i4 = i3 & 57;
        int i5 = (i4 - (~(-(-((i3 ^ 57) | i4))))) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.F.K
    public void x(Object obj, View view) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 31;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 31)) & i3);
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        if (view != null) {
            Rect rect = new Rect();
            m(view, rect);
            bHi bhi = new bHi(this, rect);
            int i8 = a;
            int i9 = (i8 & (-108)) | ((~i8) & 107);
            int i10 = (i8 & 107) << 1;
            int i11 = (i9 & i10) + (i10 | i9);
            b = i11 % 128;
            int i12 = i11 % 2;
            ((J) obj).C(bhi);
            int i13 = b;
            int i14 = i13 ^ 85;
            int i15 = (i13 & 85) << 1;
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            a = i16 % 128;
            int i17 = i16 % 2;
        }
        int i18 = b;
        int i19 = (i18 & 121) + (i18 | 121);
        a = i19 % 128;
        int i20 = i19 % 2;
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aM.l$bHk */
    public class bHk extends N {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ Object c;
        public final /* synthetic */ ArrayList d;
        public final /* synthetic */ Object e;
        public final /* synthetic */ ArrayList f;
        public final /* synthetic */ ArrayList g;
        public final /* synthetic */ Object h;

        public bHk(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.c = obj;
            this.d = arrayList;
            int i = a;
            int i2 = i ^ 37;
            int i3 = (i & 37) << 1;
            int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
            b = i4 % 128;
            int i5 = i4 % 2;
            this.e = obj2;
            this.f = arrayList2;
            this.h = obj3;
            this.g = arrayList3;
        }

        @Override // ivas.gov.bisp.enumeration.aM.J.InterfaceC0070bHc
        public void b(J j) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 55;
            int i4 = ((((i2 ^ 55) | i3) << 1) - (~(-((i2 | 55) & (~i3))))) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
            Object obj = null;
            j.y(this);
            if (i5 == 0) {
                obj.hashCode();
                throw null;
            }
            int i6 = a;
            int i7 = i6 & 93;
            int i8 = i7 + ((i6 ^ 93) | i7);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                throw null;
            }
        }

        @Override // ivas.gov.bisp.enumeration.aM.N, ivas.gov.bisp.enumeration.aM.J.InterfaceC0070bHc
        public void a(J j) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 51;
            int i4 = (i2 | 51) & (~i3);
            int i5 = -(-(i3 << 1));
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            int i7 = i6 % 128;
            a = i7;
            int i8 = i6 % 2;
            Object obj = this.c;
            Object obj2 = null;
            if (obj != null) {
                int i9 = i7 + 69;
                b = i9 % 128;
                int i10 = i9 % 2;
                C0072l.this.r(obj, this.d, null);
                int i11 = a;
                int i12 = (i11 & (-16)) | ((~i11) & 15);
                int i13 = (i11 & 15) << 1;
                int i14 = (i12 & i13) + (i13 | i12);
                b = i14 % 128;
                int i15 = i14 % 2;
            }
            Object obj3 = this.e;
            if (obj3 != null) {
                int i16 = b;
                int i17 = i16 & 109;
                int i18 = (i17 - (~(-(-((i16 ^ 109) | i17))))) - 1;
                a = i18 % 128;
                if (i18 % 2 != 0) {
                    C0072l.this.r(obj3, this.f, null);
                    int i19 = 65 / 0;
                } else {
                    C0072l.this.r(obj3, this.f, null);
                }
                int i20 = b;
                int i21 = i20 & 93;
                int i22 = ((i20 | 93) & (~i21)) + (i21 << 1);
                a = i22 % 128;
                int i23 = i22 % 2;
            }
            Object obj4 = this.h;
            if (obj4 != null) {
                int i24 = a + 39;
                b = i24 % 128;
                if (i24 % 2 == 0) {
                    C0072l.this.r(obj4, this.g, null);
                    obj2.hashCode();
                    throw null;
                }
                C0072l.this.r(obj4, this.g, null);
            }
            int i25 = b;
            int i26 = (i25 | 111) << 1;
            int i27 = -(((~i25) & 111) | (i25 & (-112)));
            int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
            a = i28 % 128;
            if (i28 % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x007a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0089  */
    public static boolean B(J j) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 109;
        int i5 = (i3 | 109) & (~i4);
        int i6 = -(-(i4 << 1));
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            K.e(j.j);
            throw null;
        }
        if (!(!K.e(j.j))) {
            int i8 = b;
            int i9 = ((i8 ^ 73) | (i8 & 73)) << 1;
            int i10 = -(((~i8) & 73) | (i8 & (-74)));
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            a = i11 % 128;
            int i12 = i11 % 2;
            if (!(!K.e(null))) {
                int i13 = b;
                int i14 = ((((i13 ^ 77) | (i13 & 77)) << 1) - (~(-(((~i13) & 77) | (i13 & (-78)))))) - 1;
                a = i14 % 128;
                if (i14 % 2 != 0) {
                    K.e(null);
                    throw null;
                }
                if (K.e(null)) {
                    int i15 = b;
                    int i16 = ((i15 & 102) + (i15 | 102)) - 1;
                    a = i16 % 128;
                    int i17 = i16 % 2;
                    z = false;
                } else {
                    int i18 = b;
                    i = (i18 ^ 15) + ((i18 & 15) << 1);
                    a = i % 128;
                    if (i % 2 != 0) {
                        int i19 = 3 % 5;
                    }
                    z = true;
                }
            } else {
                int i110 = b;
                i = (i110 ^ 15) + ((i110 & 15) << 1);
                a = i % 128;
                if (i % 2 != 0) {
                    int i111 = 3 % 5;
                }
                z = true;
            }
        } else {
            int i112 = b;
            i = (i112 ^ 15) + ((i112 & 15) << 1);
            a = i % 128;
            if (i % 2 != 0) {
                int i113 = 3 % 5;
            }
            z = true;
        }
        int i20 = b;
        int i21 = i20 & 19;
        int i22 = (i21 - (~((i20 ^ 19) | i21))) - 1;
        a = i22 % 128;
        int i23 = i22 % 2;
        return z;
    }

    @Override // ivas.gov.bisp.enumeration.F.K
    public void z(Object obj, View view, ArrayList<View> arrayList) {
        View view2;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (i4 & 71) + (i4 | 71);
        a = i5 % 128;
        int i6 = i5 % 2;
        O o2 = (O) obj;
        ArrayList<View> arrayList2 = o2.l;
        arrayList2.clear();
        int i7 = a;
        int i8 = (i7 | 89) << 1;
        int i9 = -(i7 ^ 89);
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        b = i10 % 128;
        int i11 = i10 % 2;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = a + 75;
            b = i13 % 128;
            if (i13 % 2 == 0) {
                view2 = arrayList.get(i12);
                int i14 = 45 / 0;
            } else {
                view2 = arrayList.get(i12);
            }
            int i15 = b;
            int i16 = ((i15 | 31) << 1) - (i15 ^ 31);
            a = i16 % 128;
            if (i16 % 2 != 0) {
                K.c(arrayList2, view2);
                int i17 = (i12 & 84) + (i12 | 84);
                i = i17 & (-70);
                i2 = i17 | (-70);
            } else {
                K.c(arrayList2, view2);
                int i18 = (i12 & (-18)) + (i12 | (-18));
                i = i18 & 19;
                i2 = i18 | 19;
            }
            i12 = i + i2;
        }
        arrayList2.add(view);
        arrayList.add(view);
        int i19 = a;
        int i20 = i19 & 115;
        int i21 = ((i19 | 115) & (~i20)) + (i20 << 1);
        b = i21 % 128;
        if (i21 % 2 != 0) {
            h(o2, arrayList);
            return;
        }
        h(o2, arrayList);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.F.K
    public void h(Object obj, ArrayList<View> arrayList) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 27;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        J j = (J) obj;
        if (j == null) {
            int i6 = (-2) - (((i2 & 6) + (i2 | 6)) ^ (-1));
            b = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        int i8 = 0;
        if (!(!(j instanceof O))) {
            int i9 = i4 & 75;
            int i10 = -(-((i4 ^ 75) | i9));
            int i11 = (i9 & i10) + (i9 | i10);
            a = i11 % 128;
            int i12 = i11 % 2;
            O o2 = (O) j;
            int size = o2.A.size();
            int i13 = b;
            int i14 = i13 & 29;
            int i15 = ((i13 ^ 29) | i14) << 1;
            int i16 = -((i13 | 29) & (~i14));
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            int i18 = i17 % 128;
            a = i18;
            int i19 = i17 % 2;
            int i20 = i18 & 13;
            int i21 = i20 + ((i18 ^ 13) | i20);
            b = i21 % 128;
            int i22 = i21 % 2;
            while (i8 < size) {
                int i23 = b + 81;
                a = i23 % 128;
                int i24 = i23 % 2;
                h(o2.J(i8), arrayList);
                int i25 = ((i8 | 90) << 1) - (i8 ^ 90);
                i8 = (i25 ^ (-89)) + ((i25 & (-89)) << 1);
                int i26 = a;
                int i27 = i26 ^ 33;
                int i28 = -(-((i26 & 33) << 1));
                int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                b = i29 % 128;
                if (i29 % 2 == 0) {
                    int i30 = 4 % 4;
                }
            }
        } else if (!B(j)) {
            int i31 = a;
            int i32 = (i31 & (-92)) | ((~i31) & 91);
            int i33 = -(-((i31 & 91) << 1));
            int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
            b = i34 % 128;
            int i35 = i34 % 2;
            if (K.e(j.l)) {
                int i36 = a;
                int i37 = ((i36 & 16) + (i36 | 16)) - 1;
                b = i37 % 128;
                int i38 = i37 % 2;
                int size2 = arrayList.size();
                int i39 = a;
                int i40 = i39 | 65;
                int i41 = (i40 << 1) - ((~(i39 & 65)) & i40);
                b = i41 % 128;
                int i42 = i41 % 2;
                while (i8 < size2) {
                    int i43 = b;
                    int i44 = ((i43 | 59) << 1) - (i43 ^ 59);
                    a = i44 % 128;
                    if (i44 % 2 != 0) {
                        j.h(arrayList.get(i8));
                        throw null;
                    }
                    j.h(arrayList.get(i8));
                    int i45 = b;
                    int i46 = i45 & 79;
                    int i47 = ((((i45 ^ 79) | i46) << 1) - (~(-((~i46) & (i45 | 79))))) - 1;
                    a = i47 % 128;
                    int i48 = i47 % 2;
                    int i49 = (i8 ^ (-71)) + ((i8 & (-71)) << 1);
                    i8 = (i49 ^ 72) + ((i49 & 72) << 1);
                    int i50 = i45 + 55;
                    a = i50 % 128;
                    if (i50 % 2 != 0) {
                        int i51 = 3 / 2;
                    }
                }
            }
        }
        int i52 = b;
        int i53 = i52 & 69;
        int i54 = -(-((i52 ^ 69) | i53));
        int i55 = (i53 & i54) + (i54 | i53);
        a = i55 % 128;
        if (i55 % 2 != 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.F.K
    public void v(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 53;
        b = i3 % 128;
        int i4 = i3 % 2;
        O o2 = (O) obj;
        if (o2 != null) {
            int i5 = (-2) - (((i2 & 14) + (i2 | 14)) ^ (-1));
            b = i5 % 128;
            int i6 = i5 % 2;
            o2.l.clear();
            o2.l.addAll(arrayList2);
            int i7 = b;
            int i8 = ((i7 ^ 15) | (i7 & 15)) << 1;
            int i9 = -(((~i7) & 15) | (i7 & (-16)));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                r(o2, arrayList, arrayList2);
                throw null;
            }
            r(o2, arrayList, arrayList2);
            int i11 = a;
            int i12 = i11 & 95;
            int i13 = (i11 | 95) & (~i12);
            int i14 = i12 << 1;
            int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
            b = i15 % 128;
            int i16 = i15 % 2;
        }
        int i17 = a;
        int i18 = i17 & 63;
        int i19 = i18 + ((i17 ^ 63) | i18);
        b = i19 % 128;
        int i20 = i19 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0043  */
    /* JADX WARN: Code duplicated, block: B:12:0x004a  */
    /* JADX WARN: Code duplicated, block: B:15:0x005f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0061  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:8:0x002c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:9:0x002e  */
    @Override // ivas.gov.bisp.enumeration.F.K
    public Object n(Object obj, Object obj2, Object obj3) {
        O o2;
        int i;
        int i2;
        O o3;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = a;
        int i7 = (i6 & 93) + (i6 | 93);
        int i8 = i7 % 128;
        b = i8;
        int i9 = i7 % 2;
        J j = (J) obj;
        J j2 = (J) obj2;
        J j3 = (J) obj3;
        int i10 = i8 + 100;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        a = i11 % 128;
        Object obj4 = null;
        if (i11 % 2 == 0) {
            if (j != null) {
                if (j2 != null) {
                    o2 = new O();
                    o2.L(j);
                    int i12 = a;
                    i = (i12 & 1) + (i12 | 1);
                    b = i % 128;
                    if (i % 2 == 0) {
                        o2.L(j2);
                        o2.O(0);
                    } else {
                        o2.L(j2);
                        o2.O(1);
                    }
                    int i13 = b;
                    int i14 = i13 & 37;
                    i2 = i14 + ((i13 ^ 37) | i14);
                    a = i2 % 128;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                    j = o2;
                }
            }
            if (j3 == null) {
                int i15 = b;
                int i16 = i15 & 115;
                int i17 = (i15 ^ 115) | i16;
                int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                a = i18 % 128;
                int i19 = i18 % 2;
                return j;
            }
            o3 = new O();
            if (j != null) {
                int i20 = b;
                i4 = ((i20 & (-120)) | ((~i20) & 119)) + ((i20 & 119) << 1);
                a = i4 % 128;
                if (i4 % 2 != 0) {
                    o3.L(j);
                    throw null;
                }
                o3.L(j);
            }
            o3.L(j3);
            int i21 = b;
            i3 = (((i21 ^ 65) | (i21 & 65)) << 1) - (((~i21) & 65) | (i21 & (-66)));
            a = i3 % 128;
            if (i3 % 2 == 0) {
                return o3;
            }
            obj4.hashCode();
            throw null;
        }
        int i22 = 4 / 0;
        if (j != null) {
            if (j2 != null) {
                o2 = new O();
                o2.L(j);
                int i110 = a;
                i = (i110 & 1) + (i110 | 1);
                b = i % 128;
                if (i % 2 == 0) {
                    o2.L(j2);
                    o2.O(0);
                } else {
                    o2.L(j2);
                    o2.O(1);
                }
                int i111 = b;
                int i112 = i111 & 37;
                i2 = i112 + ((i111 ^ 37) | i112);
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                j = o2;
            }
        }
        if (j3 == null) {
            int i113 = b;
            int i114 = i113 & 115;
            int i115 = (i113 ^ 115) | i114;
            int i116 = ((i114 | i115) << 1) - (i115 ^ i114);
            a = i116 % 128;
            int i117 = i116 % 2;
            return j;
        }
        o3 = new O();
        if (j != null) {
            int i23 = b;
            i4 = ((i23 & (-120)) | ((~i23) & 119)) + ((i23 & 119) << 1);
            a = i4 % 128;
            if (i4 % 2 != 0) {
                o3.L(j);
                throw null;
            }
            o3.L(j);
        }
        o3.L(j3);
        int i24 = b;
        i3 = (((i24 ^ 65) | (i24 & 65)) << 1) - (((~i24) & 65) | (i24 & (-66)));
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return o3;
        }
        obj4.hashCode();
        throw null;
        if (j == null) {
            int i25 = i8 & 47;
            int i26 = (((~i25) & (i8 | 47)) - (~(-(-(i25 << 1))))) - 1;
            a = i26 % 128;
            int i27 = i26 % 2;
            if (j2 != null) {
                int i28 = (((i8 & (-44)) | ((~i8) & 43)) - (~((i8 & 43) << 1))) - 1;
                int i29 = i28 % 128;
                a = i29;
                int i30 = i28 % 2;
                int i31 = (i29 ^ 33) + ((i29 & 33) << 1);
                b = i31 % 128;
                int i32 = i31 % 2;
                j = j2;
            } else {
                int i33 = i8 & 53;
                int i34 = (i33 - (~((i8 ^ 53) | i33))) - 1;
                a = i34 % 128;
                int i35 = i34 % 2;
                j = null;
            }
        }
        if (j3 == null) {
            int i118 = b;
            int i119 = i118 & 115;
            int i1110 = (i118 ^ 115) | i119;
            int i1111 = ((i119 | i1110) << 1) - (i1110 ^ i119);
            a = i1111 % 128;
            int i1112 = i1111 % 2;
            return j;
        }
        o3 = new O();
        if (j != null) {
            int i210 = b;
            i4 = ((i210 & (-120)) | ((~i210) & 119)) + ((i210 & 119) << 1);
            a = i4 % 128;
            if (i4 % 2 != 0) {
                o3.L(j);
                throw null;
            }
            o3.L(j);
        }
        o3.L(j3);
        int i211 = b;
        i3 = (((i211 ^ 65) | (i211 & 65)) << 1) - (((~i211) & 65) | (i211 & (-66)));
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return o3;
        }
        obj4.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003f  */
    /* JADX WARN: Code duplicated, block: B:12:0x005c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0060  */
    /* JADX WARN: Code duplicated, block: B:16:0x0076  */
    /* JADX WARN: Code duplicated, block: B:18:0x008c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0095  */
    /* JADX WARN: Code duplicated, block: B:23:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:27:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:29:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:31:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:33:0x0101  */
    /* JADX WARN: Code duplicated, block: B:35:0x0115  */
    /* JADX WARN: Code duplicated, block: B:36:0x0133  */
    /* JADX WARN: Code duplicated, block: B:38:0x0142  */
    /* JADX WARN: Code duplicated, block: B:40:0x0146  */
    /* JADX WARN: Code duplicated, block: B:46:0x01b5 A[LOOP:2: B:44:0x019f->B:46:0x01b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x01e6 A[EDGE_INSN: B:65:0x01e6->B:49:0x01e6 BREAK  A[LOOP:2: B:44:0x019f->B:46:0x01b5], SYNTHETIC] */
    @Override // ivas.gov.bisp.enumeration.F.K
    public void r(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        ArrayList<View> arrayList3;
        int i;
        int i2;
        int size;
        int i3;
        int size2;
        int i4;
        int i5;
        O o2;
        int size3;
        int i6;
        int i7;
        int i8;
        int i9 = 2 % 2;
        int i10 = b;
        int i11 = (i10 & 119) + (i10 | 119);
        a = i11 % 128;
        int i12 = i11 % 2;
        J j = (J) obj;
        boolean z = j instanceof O;
        int i13 = i10 & 25;
        int i14 = (i10 ^ 25) | i13;
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        int i16 = i15 % 128;
        a = i16;
        int i17 = 0;
        Object obj2 = null;
        if (i15 % 2 != 0) {
            if (!(!z)) {
                i17 = 1;
                i5 = (-2) - (((i16 & 114) + (i16 | 114)) ^ (-1));
                b = i5 % 128;
                if (i5 % 2 != 0) {
                    ((O) j).A.size();
                    throw null;
                }
                o2 = (O) j;
                size3 = o2.A.size();
                int i18 = a;
                int i19 = i18 & 107;
                int i20 = -(-((i18 ^ 107) | i19));
                i6 = (i19 ^ i20) + ((i20 & i19) << 1);
                b = i6 % 128;
                if (i6 % 2 == 0) {
                    int i21 = 2 / 5;
                }
                while (i17 < size3) {
                    int i22 = a;
                    int i23 = i22 & 77;
                    int i24 = -(-((i22 ^ 77) | i23));
                    i7 = (i23 ^ i24) + ((i24 & i23) << 1);
                    b = i7 % 128;
                    if (i7 % 2 != 0) {
                        r(o2.J(i17), arrayList, arrayList2);
                        obj2.hashCode();
                        throw null;
                    }
                    r(o2.J(i17), arrayList, arrayList2);
                    int i25 = a;
                    i8 = ((i25 & 102) + (i25 | 102)) - 1;
                    b = i8 % 128;
                    if (i8 % 2 == 0) {
                        i17 = ((i17 ^ 36) + ((i17 & 36) << 1)) - 1;
                    } else {
                        int i26 = (((i17 | 7) << 1) - (i17 ^ 7)) - 1;
                        i17 = (((i26 | (-4)) << 1) - (i26 ^ (-4))) - 1;
                    }
                    int i27 = i25 & 27;
                    int i28 = (i27 - (~(-(-((i25 ^ 27) | i27))))) - 1;
                    b = i28 % 128;
                    int i29 = i28 % 2;
                }
            } else if (!B(j)) {
                int i30 = b;
                int i31 = i30 & 57;
                int i32 = -(-((i30 ^ 57) | i31));
                int i33 = (i31 & i32) + (i32 | i31);
                a = i33 % 128;
                int i34 = i33 % 2;
                arrayList3 = j.l;
                if (arrayList3.size() == arrayList.size()) {
                    int i35 = a;
                    i = ((i35 ^ 66) + ((i35 & 66) << 1)) - 1;
                    b = i % 128;
                    if (i % 2 != 0) {
                        arrayList3.containsAll(arrayList);
                        throw null;
                    }
                    if (arrayList3.containsAll(arrayList)) {
                        i2 = a;
                        int i36 = i2 & 125;
                        int i37 = (((i2 ^ 125) | i36) << 1) - ((~i36) & (i2 | 125));
                        b = i37 % 128;
                        int i38 = i37 % 2;
                        if (arrayList2 == null) {
                            int i39 = (((i2 & (-80)) | ((~i2) & 79)) - (~((i2 & 79) << 1))) - 1;
                            b = i39 % 128;
                            int i40 = i39 % 2;
                            int i41 = (i2 ^ 69) + ((i2 & 69) << 1);
                            b = i41 % 128;
                            int i42 = i41 % 2;
                            size = 0;
                        } else {
                            size = arrayList2.size();
                            i3 = a + 65;
                            b = i3 % 128;
                            if (i3 % 2 == 0) {
                                int i43 = 2 / 2;
                            }
                        }
                        while (i17 < size) {
                            int i44 = b;
                            int i45 = i44 ^ 101;
                            int i46 = (((i44 & 101) | i45) << 1) - i45;
                            a = i46 % 128;
                            int i47 = i46 % 2;
                            j.h(arrayList2.get(i17));
                            int i48 = b;
                            int i49 = (i48 & 113) + (i48 | 113);
                            int i50 = i49 % 128;
                            a = i50;
                            int i51 = i49 % 2;
                            int i52 = i17 + 2;
                            i17 = (i52 << 1) + (i52 ^ (-1));
                            int i53 = ((i50 ^ 75) | (i50 & 75)) << 1;
                            int i54 = -(((~i50) & 75) | (i50 & (-76)));
                            i4 = (i53 ^ i54) + ((i54 & i53) << 1);
                            b = i4 % 128;
                            if (i4 % 2 == 0) {
                                int i55 = 5 % 4;
                            }
                        }
                        size2 = arrayList.size();
                        int i56 = b;
                        int i57 = (((i56 | 58) << 1) - (i56 ^ 58)) - 1;
                        a = i57 % 128;
                        int i58 = i57 % 2;
                        while (true) {
                            int i59 = (((size2 | 95) << 1) - (size2 ^ 95)) - 1;
                            int i60 = i59 ^ (-95);
                            int i61 = ((i59 & (-95)) | i60) << 1;
                            int i62 = -i60;
                            size2 = ((i62 & i61) << 1) + (i61 ^ i62);
                            if (size2 >= 0) {
                                break;
                            }
                            int i63 = a;
                            int i64 = ((i63 ^ 93) | (i63 & 93)) << 1;
                            int i65 = -(((~i63) & 93) | (i63 & (-94)));
                            int i66 = (i64 ^ i65) + ((i65 & i64) << 1);
                            b = i66 % 128;
                            int i67 = i66 % 2;
                            j.z(arrayList.get(size2));
                            int i68 = b + 39;
                            a = i68 % 128;
                            int i69 = i68 % 2;
                        }
                    }
                }
            }
        } else if (z) {
            i5 = (-2) - (((i16 & 114) + (i16 | 114)) ^ (-1));
            b = i5 % 128;
            if (i5 % 2 != 0) {
                ((O) j).A.size();
                throw null;
            }
            o2 = (O) j;
            size3 = o2.A.size();
            int i110 = a;
            int i111 = i110 & 107;
            int i210 = -(-((i110 ^ 107) | i111));
            i6 = (i111 ^ i210) + ((i210 & i111) << 1);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                int i211 = 2 / 5;
            }
            while (i17 < size3) {
                int i212 = a;
                int i213 = i212 & 77;
                int i214 = -(-((i212 ^ 77) | i213));
                i7 = (i213 ^ i214) + ((i214 & i213) << 1);
                b = i7 % 128;
                if (i7 % 2 != 0) {
                    r(o2.J(i17), arrayList, arrayList2);
                    obj2.hashCode();
                    throw null;
                }
                r(o2.J(i17), arrayList, arrayList2);
                int i215 = a;
                i8 = ((i215 & 102) + (i215 | 102)) - 1;
                b = i8 % 128;
                if (i8 % 2 == 0) {
                    i17 = ((i17 ^ 36) + ((i17 & 36) << 1)) - 1;
                } else {
                    int i216 = (((i17 | 7) << 1) - (i17 ^ 7)) - 1;
                    i17 = (((i216 | (-4)) << 1) - (i216 ^ (-4))) - 1;
                }
                int i217 = i215 & 27;
                int i218 = (i217 - (~(-(-((i215 ^ 27) | i217))))) - 1;
                b = i218 % 128;
                int i219 = i218 % 2;
            }
        } else if (!B(j)) {
            int i310 = b;
            int i311 = i310 & 57;
            int i312 = -(-((i310 ^ 57) | i311));
            int i313 = (i311 & i312) + (i312 | i311);
            a = i313 % 128;
            int i314 = i313 % 2;
            arrayList3 = j.l;
            if (arrayList3.size() == arrayList.size()) {
                int i315 = a;
                i = ((i315 ^ 66) + ((i315 & 66) << 1)) - 1;
                b = i % 128;
                if (i % 2 != 0) {
                    arrayList3.containsAll(arrayList);
                    throw null;
                }
                if (arrayList3.containsAll(arrayList)) {
                    i2 = a;
                    int i316 = i2 & 125;
                    int i317 = (((i2 ^ 125) | i316) << 1) - ((~i316) & (i2 | 125));
                    b = i317 % 128;
                    int i318 = i317 % 2;
                    if (arrayList2 == null) {
                        int i319 = (((i2 & (-80)) | ((~i2) & 79)) - (~((i2 & 79) << 1))) - 1;
                        b = i319 % 128;
                        int i410 = i319 % 2;
                        int i411 = (i2 ^ 69) + ((i2 & 69) << 1);
                        b = i411 % 128;
                        int i412 = i411 % 2;
                        size = 0;
                    } else {
                        size = arrayList2.size();
                        i3 = a + 65;
                        b = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i413 = 2 / 2;
                        }
                    }
                    while (i17 < size) {
                        int i414 = b;
                        int i415 = i414 ^ 101;
                        int i416 = (((i414 & 101) | i415) << 1) - i415;
                        a = i416 % 128;
                        int i417 = i416 % 2;
                        j.h(arrayList2.get(i17));
                        int i418 = b;
                        int i419 = (i418 & 113) + (i418 | 113);
                        int i510 = i419 % 128;
                        a = i510;
                        int i511 = i419 % 2;
                        int i512 = i17 + 2;
                        i17 = (i512 << 1) + (i512 ^ (-1));
                        int i513 = ((i510 ^ 75) | (i510 & 75)) << 1;
                        int i514 = -(((~i510) & 75) | (i510 & (-76)));
                        i4 = (i513 ^ i514) + ((i514 & i513) << 1);
                        b = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i515 = 5 % 4;
                        }
                    }
                    size2 = arrayList.size();
                    int i516 = b;
                    int i517 = (((i516 | 58) << 1) - (i516 ^ 58)) - 1;
                    a = i517 % 128;
                    int i518 = i517 % 2;
                    while (true) {
                        int i519 = (((size2 | 95) << 1) - (size2 ^ 95)) - 1;
                        int i610 = i519 ^ (-95);
                        int i611 = ((i519 & (-95)) | i610) << 1;
                        int i612 = -i610;
                        size2 = ((i612 & i611) << 1) + (i611 ^ i612);
                        if (size2 >= 0) {
                            break;
                            break;
                        }
                        int i613 = a;
                        int i614 = ((i613 ^ 93) | (i613 & 93)) << 1;
                        int i615 = -(((~i613) & 93) | (i613 & (-94)));
                        int i616 = (i614 ^ i615) + ((i615 & i614) << 1);
                        b = i616 % 128;
                        int i617 = i616 % 2;
                        j.z(arrayList.get(size2));
                        int i618 = b + 39;
                        a = i618 % 128;
                        int i619 = i618 % 2;
                    }
                }
            }
        }
        int i70 = a;
        int i71 = (i70 & 83) + (i70 | 83);
        b = i71 % 128;
        if (i71 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }
}
