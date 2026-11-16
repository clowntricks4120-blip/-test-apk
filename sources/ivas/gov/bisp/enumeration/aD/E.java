package ivas.gov.bisp.enumeration.aD;

import ivas.gov.bisp.enumeration.o000O000.o000OOo0;
import ivas.gov.bisp.enumeration.o000O000.o00O00;
import ivas.gov.bisp.enumeration.o000O000.o0OoOo0;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class E<T> implements o000OOo0<T> {
    private static int a = 0;
    private static int b = 1;
    public final aa c;
    public final o00O00<?, ?> d;
    public final boolean e;
    public final o0OoOo0<?> f;

    public E(o00O00<?, ?> o00o00, o0OoOo0<?> o0oooo0, aa aaVar) {
        this.d = o00o00;
        this.e = o0oooo0.i(aaVar);
        this.f = o0oooo0;
        this.c = aaVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0044 A[PHI: r2
  0x0044: PHI (r2v7 int) = (r2v5 int), (r2v9 int) binds: [B:8:0x0040, B:5:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x006d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0079  */
    /* JADX WARN: Code duplicated, block: B:22:0x00e9 A[LOOP:1: B:22:0x00e9->B:24:0x00ef, LOOP_START, PHI: r5
  0x00e9: PHI (r5v12 int) = (r5v11 int), (r5v22 int) binds: [B:21:0x00e7, B:24:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x00ef A[LOOP:1: B:22:0x00e9->B:24:0x00ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0161  */
    /* JADX WARN: Code duplicated, block: B:32:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final int g(T t) {
        int iC;
        C0056m c0056mF;
        int i;
        int i2;
        int i3;
        Iterator<T> it;
        int i4;
        int iL;
        int i5;
        int i6 = 2 % 2;
        int i7 = b;
        int i8 = ((i7 & 34) + (i7 | 34)) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
        o00O00<?, ?> o00o00 = this.d;
        Object objJ = o00o00.j(t);
        int i10 = b;
        int i11 = (((i10 | 113) << 1) - (~(-(((~i10) & 113) | (i10 & (-114)))))) - 1;
        a = i11 % 128;
        if (i11 % 2 != 0) {
            iC = o00o00.c(objJ);
            if (this.e) {
                int i12 = b;
                int i13 = i12 & 119;
                int i14 = -(-((i12 ^ 119) | i13));
                int i15 = (i13 & i14) + (i14 | i13);
                a = i15 % 128;
                int i16 = i15 % 2;
                c0056mF = this.f.f(t);
                int i17 = b;
                int i18 = i17 & 81;
                i = ((i17 | 81) & (~i18)) + (i18 << 1);
                a = i % 128;
                if (i % 2 != 0) {
                    int i19 = 3 / 3;
                }
                i2 = 0;
                i3 = 0;
                while (i2 < c0056mF.d.f()) {
                    int i20 = b;
                    int i21 = i20 & 93;
                    int i22 = -(-((i20 ^ 93) | i21));
                    int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                    a = i23 % 128;
                    int i24 = i23 % 2;
                    iL = c0056mF.l(c0056mF.d.g(i2));
                    i5 = b + 63;
                    a = i5 % 128;
                    if (i5 % 2 != 0) {
                        i3 *= iL;
                        int i25 = i2 & 93;
                        i2 = (((i2 ^ 93) | i25) << 1) - ((i2 | 93) & (~i25));
                    } else {
                        i3 = (i3 - (~iL)) - 1;
                        int i26 = ((i2 & 7) | ((~i2) & (-8))) + ((i2 & (-8)) << 1);
                        int i27 = i26 ^ 9;
                        int i28 = -(-((i26 & 9) << 1));
                        i2 = ((i27 | i28) << 1) - (i27 ^ i28);
                    }
                }
                it = c0056mF.d.h().iterator();
                int i29 = a;
                int i30 = i29 & 91;
                int i31 = (i29 | 91) & (~i30);
                int i32 = i30 << 1;
                i4 = ((i31 | i32) << 1) - (i31 ^ i32);
                b = i4 % 128;
                if (i4 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                while (it.hasNext()) {
                    int i33 = a;
                    int i34 = (i33 & 89) + (i33 | 89);
                    b = i34 % 128;
                    int i35 = i34 % 2;
                    int iL2 = c0056mF.l((Map.Entry) it.next());
                    int i36 = a;
                    int i37 = (i36 & 33) + (i36 | 33);
                    int i38 = i37 % 128;
                    b = i38;
                    int i39 = i37 % 2;
                    int i40 = i3 & iL2;
                    int i41 = (i3 ^ iL2) | i40;
                    i3 = ((i41 & i40) << 1) + (i40 ^ i41);
                    int i42 = (i38 ^ 125) + ((i38 & 125) << 1);
                    a = i42 % 128;
                    int i43 = i42 % 2;
                }
                int i44 = -(~(-(-i3)));
                iC = ((iC & i44) + (i44 | iC)) - 1;
                int i45 = b;
                int i46 = i45 & 119;
                int i47 = ((i45 ^ 119) | i46) << 1;
                int i48 = -((i45 | 119) & (~i46));
                int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
                a = i49 % 128;
                int i50 = i49 % 2;
            }
        } else {
            iC = o00o00.c(objJ);
            if (!(!this.e)) {
                int i110 = b;
                int i111 = i110 & 119;
                int i112 = -(-((i110 ^ 119) | i111));
                int i113 = (i111 & i112) + (i112 | i111);
                a = i113 % 128;
                int i114 = i113 % 2;
                c0056mF = this.f.f(t);
                int i115 = b;
                int i116 = i115 & 81;
                i = ((i115 | 81) & (~i116)) + (i116 << 1);
                a = i % 128;
                if (i % 2 != 0) {
                    int i117 = 3 / 3;
                }
                i2 = 0;
                i3 = 0;
                while (i2 < c0056mF.d.f()) {
                    int i210 = b;
                    int i211 = i210 & 93;
                    int i212 = -(-((i210 ^ 93) | i211));
                    int i213 = ((i211 | i212) << 1) - (i212 ^ i211);
                    a = i213 % 128;
                    int i214 = i213 % 2;
                    iL = c0056mF.l(c0056mF.d.g(i2));
                    i5 = b + 63;
                    a = i5 % 128;
                    if (i5 % 2 != 0) {
                        i3 *= iL;
                        int i215 = i2 & 93;
                        i2 = (((i2 ^ 93) | i215) << 1) - ((i2 | 93) & (~i215));
                    } else {
                        i3 = (i3 - (~iL)) - 1;
                        int i216 = ((i2 & 7) | ((~i2) & (-8))) + ((i2 & (-8)) << 1);
                        int i217 = i216 ^ 9;
                        int i218 = -(-((i216 & 9) << 1));
                        i2 = ((i217 | i218) << 1) - (i217 ^ i218);
                    }
                }
                it = c0056mF.d.h().iterator();
                int i219 = a;
                int i310 = i219 & 91;
                int i311 = (i219 | 91) & (~i310);
                int i312 = i310 << 1;
                i4 = ((i311 | i312) << 1) - (i311 ^ i312);
                b = i4 % 128;
                if (i4 % 2 != 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                while (it.hasNext()) {
                    int i313 = a;
                    int i314 = (i313 & 89) + (i313 | 89);
                    b = i314 % 128;
                    int i315 = i314 % 2;
                    int iL3 = c0056mF.l((Map.Entry) it.next());
                    int i316 = a;
                    int i317 = (i316 & 33) + (i316 | 33);
                    int i318 = i317 % 128;
                    b = i318;
                    int i319 = i317 % 2;
                    int i410 = i3 & iL3;
                    int i411 = (i3 ^ iL3) | i410;
                    i3 = ((i411 & i410) << 1) + (i410 ^ i411);
                    int i412 = (i318 ^ 125) + ((i318 & 125) << 1);
                    a = i412 % 128;
                    int i413 = i412 % 2;
                }
                int i414 = -(~(-(-i3)));
                iC = ((iC & i414) + (i414 | iC)) - 1;
                int i415 = b;
                int i416 = i415 & 119;
                int i417 = ((i415 ^ 119) | i416) << 1;
                int i418 = -((i415 | 119) & (~i416));
                int i419 = (i417 ^ i418) + ((i418 & i417) << 1);
                a = i419 % 128;
                int i51 = i419 % 2;
            }
        }
        int i52 = b;
        int i53 = i52 & 109;
        int i54 = -(-((i52 ^ 109) | i53));
        int i55 = ((i53 | i54) << 1) - (i54 ^ i53);
        a = i55 % 128;
        if (i55 % 2 != 0) {
            int i56 = 20 / 0;
        }
        return iC;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0054, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
    
        if (r6.e == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
    
        r1 = ivas.gov.bisp.enumeration.aD.E.b;
        r2 = r1 & 121;
        r2 = (r2 - (~((r1 ^ 121) | r2))) - 1;
        ivas.gov.bisp.enumeration.aD.E.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0068, code lost:
    
        if ((r2 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006a, code lost:
    
        r7 = r6.f.f(r7).equals(r6.f.f(r8));
        r8 = ivas.gov.bisp.enumeration.aD.E.b;
        r2 = r8 & 83;
        r1 = ((r8 ^ 83) | r2) << 1;
        r8 = -((r8 | 83) & (~r2));
        r2 = ((r1 | r8) << 1) - (r8 ^ r1);
        ivas.gov.bisp.enumeration.aD.E.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0091, code lost:
    
        if ((r2 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0093, code lost:
    
        r8 = 45 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0096, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0097, code lost:
    
        r6.f.f(r7);
        r7 = null;
        r7.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a1, code lost:
    
        r7 = (-2) - ((ivas.gov.bisp.enumeration.aD.E.b + 54) ^ (-1));
        ivas.gov.bisp.enumeration.aD.E.a = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ae, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0039, code lost:
    
        if (r1 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r1.equals(r2) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        r7 = ivas.gov.bisp.enumeration.aD.E.a;
        r8 = r7 & 5;
        r7 = -(-(r7 | 5));
        r1 = (r8 ^ r7) + ((r7 & r8) << 1);
        ivas.gov.bisp.enumeration.aD.E.b = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(T r7, T r8) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.aD.E.a
            r2 = r1 ^ 123(0x7b, float:1.72E-43)
            r1 = r1 & 123(0x7b, float:1.72E-43)
            r3 = 1
            int r1 = r1 << r3
            int r1 = -r1
            int r1 = -r1
            r4 = r2 & r1
            r1 = r1 | r2
            int r4 = r4 + r1
            int r1 = r4 % 128
            ivas.gov.bisp.enumeration.aD.E.b = r1
            int r4 = r4 % r0
            ivas.gov.bisp.enumeration.o000O000.o00O00<?, ?> r1 = r6.d
            java.lang.Object r1 = r1.j(r7)
            ivas.gov.bisp.enumeration.o000O000.o00O00<?, ?> r2 = r6.d
            java.lang.Object r2 = r2.j(r8)
            int r4 = ivas.gov.bisp.enumeration.aD.E.a
            r5 = r4 | 121(0x79, float:1.7E-43)
            int r5 = r5 << r3
            r4 = r4 ^ 121(0x79, float:1.7E-43)
            int r5 = r5 - r4
            int r4 = r5 % 128
            ivas.gov.bisp.enumeration.aD.E.b = r4
            int r5 = r5 % r0
            r4 = 0
            if (r5 != 0) goto L3c
            boolean r1 = r1.equals(r2)
            r2 = 34
            int r2 = r2 / r4
            if (r1 != 0) goto L55
            goto L42
        L3c:
            boolean r1 = r1.equals(r2)
            if (r1 == r3) goto L55
        L42:
            int r7 = ivas.gov.bisp.enumeration.aD.E.a
            r8 = r7 & 5
            r7 = r7 | 5
            int r7 = -r7
            int r7 = -r7
            r1 = r8 ^ r7
            r7 = r7 & r8
            int r7 = r7 << r3
            int r1 = r1 + r7
            int r7 = r1 % 128
            ivas.gov.bisp.enumeration.aD.E.b = r7
            int r1 = r1 % r0
            return r4
        L55:
            boolean r1 = r6.e
            if (r1 == 0) goto La1
            int r1 = ivas.gov.bisp.enumeration.aD.E.b
            r2 = r1 & 121(0x79, float:1.7E-43)
            r1 = r1 ^ 121(0x79, float:1.7E-43)
            r1 = r1 | r2
            int r1 = ~r1
            int r2 = r2 - r1
            int r2 = r2 - r3
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.aD.E.a = r1
            int r2 = r2 % r0
            if (r2 != 0) goto L97
            ivas.gov.bisp.enumeration.o000O000.o0OoOo0<?> r1 = r6.f
            ivas.gov.bisp.enumeration.aD.m r7 = r1.f(r7)
            ivas.gov.bisp.enumeration.o000O000.o0OoOo0<?> r1 = r6.f
            ivas.gov.bisp.enumeration.aD.m r8 = r1.f(r8)
            boolean r7 = r7.equals(r8)
            int r8 = ivas.gov.bisp.enumeration.aD.E.b
            r1 = r8 ^ 83
            r2 = r8 & 83
            r1 = r1 | r2
            int r1 = r1 << r3
            int r2 = ~r2
            r8 = r8 | 83
            r8 = r8 & r2
            int r8 = -r8
            r2 = r1 | r8
            int r2 = r2 << r3
            r8 = r8 ^ r1
            int r2 = r2 - r8
            int r8 = r2 % 128
            ivas.gov.bisp.enumeration.aD.E.a = r8
            int r2 = r2 % r0
            if (r2 == 0) goto L96
            r8 = 45
            int r8 = r8 / r4
        L96:
            return r7
        L97:
            ivas.gov.bisp.enumeration.o000O000.o0OoOo0<?> r8 = r6.f
            r8.f(r7)
            r7 = 0
            r7.hashCode()
            throw r7
        La1:
            int r7 = ivas.gov.bisp.enumeration.aD.E.b
            int r7 = r7 + 54
            r7 = r7 ^ (-1)
            int r7 = (-2) - r7
            int r8 = r7 % 128
            ivas.gov.bisp.enumeration.aD.E.a = r8
            int r7 = r7 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.E.a(java.lang.Object, java.lang.Object):boolean");
    }

    public final void d(T t, ag agVar, J j) {
        Object objH;
        C0056m c0056mG;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 63;
        b = i3 % 128;
        int i4 = i3 % 2;
        C0050f c0050f = this.d;
        M m = this.f;
        int i5 = i2 + 115;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            objH = c0050f.h(t);
            c0056mG = m.g(t);
            int i6 = 3 / 0;
        } else {
            objH = c0050f.h(t);
            c0056mG = m.g(t);
        }
        C0056m c0056m = c0056mG;
        int i7 = (-2) - ((a + 90) ^ (-1));
        b = i7 % 128;
        int i8 = i7 % 2;
        while (agVar.M() != Integer.MAX_VALUE) {
            try {
                boolean zM = m(agVar, j, m, c0056m, c0050f, objH);
                int i9 = b;
                int i10 = (i9 ^ 12) + ((i9 & 12) << 1);
                int i11 = (i10 ^ (-1)) + (i10 << 1);
                int i12 = i11 % 128;
                a = i12;
                int i13 = i11 % 2;
                if (!zM) {
                    break;
                }
                int i14 = i12 & 55;
                int i15 = ((~i14) & (i12 | 55)) + (i14 << 1);
                b = i15 % 128;
                int i16 = i15 % 2;
            } catch (Throwable th) {
                c0050f.o(t, objH);
                throw th;
            }
        }
        c0050f.o(t, objH);
        int i17 = a;
        int i18 = i17 & 69;
        int i19 = (i17 | 69) & (~i18);
        int i20 = i18 << 1;
        int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
        b = i21 % 128;
        int i22 = i21 % 2;
    }

    public final boolean e(T t) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 4) << 1) - (i2 ^ 4);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        boolean zI = this.f.f(t).i();
        int i6 = b + 17;
        a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 99 / 0;
        }
        return zI;
    }

    public final void h(T t) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 43;
        int i4 = -(-((i2 ^ 43) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.d.l(t);
        this.f.h(t);
        int i7 = b;
        int i8 = (-2) - (((i7 & 30) + (i7 | 30)) ^ (-1));
        a = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    public final T n() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 77;
        int i4 = ((i2 ^ 77) | i3) << 1;
        int i5 = -((i2 | 77) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            ((S.bbs) this.c.d()).e();
            throw null;
        }
        T t = (T) ((S.bbs) this.c.d()).e();
        int i7 = a + 111;
        b = i7 % 128;
        if (i7 % 2 != 0) {
            return t;
        }
        obj.hashCode();
        throw null;
    }

    public final int o(T t) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 58) << 1) - (i2 ^ 58)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.d.j(t).hashCode();
        if (!(!this.e)) {
            int i5 = a;
            int i6 = (i5 ^ 9) + ((i5 & 9) << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
            C0056m c0056mF = this.f.f(t);
            int i8 = (-2) - ((a + 122) ^ (-1));
            b = i8 % 128;
            int i9 = i8 % 2;
            iHashCode = (iHashCode * 53) + c0056mF.hashCode();
            int i10 = a;
            int i11 = ((i10 | 93) << 1) - (i10 ^ 93);
            b = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = b + 53;
        a = i13 % 128;
        int i14 = i13 % 2;
        return iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(T t, T t2) {
        int i = 2 % 2;
        int i2 = b + 33;
        a = i2 % 128;
        int i3 = i2 % 2;
        o00O00<?, ?> o00o00 = this.d;
        Class<?> cls = ak.c;
        Object objJ = o00o00.j(t);
        int i4 = b;
        int i5 = (i4 & 17) + (i4 | 17);
        a = i5 % 128;
        int i6 = i5 % 2;
        Object objM = o00o00.m(objJ, o00o00.j(t2));
        int i7 = b;
        int i8 = i7 & 71;
        int i9 = i7 | 71;
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            o00o00.q(t, objM);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        o00o00.q(t, objM);
        if (this.e) {
            ak.B(this.f, t, t2);
            int i11 = b;
            int i12 = (((i11 | 78) << 1) - (i11 ^ 78)) - 1;
            a = i12 % 128;
            int i13 = i12 % 2;
        }
        int i14 = a + 119;
        b = i14 % 128;
        int i15 = i14 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004e, code lost:
    
        if ((r8 & 7) == 2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
    
        r11 = ((r9 & 68) + (r9 | 68)) - 1;
        ivas.gov.bisp.enumeration.aD.E.a = r11 % 128;
        r11 = r11 % 2;
        r8 = r20.e(r19, r17.c, r8 >>> 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0062, code lost:
    
        if (r8 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:
    
        r5 = ivas.gov.bisp.enumeration.aD.E.a + 95;
        ivas.gov.bisp.enumeration.aD.E.b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
    
        if ((r5 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006f, code lost:
    
        r20.k(r18, r8, r19, r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        r20.k(r18, r8, r19, r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        r1 = r22.n(r23, r18);
        r2 = ivas.gov.bisp.enumeration.aD.E.b;
        r2 = (-2) - (((r2 ^ 52) + ((r2 & 52) << 1)) ^ (-1));
        ivas.gov.bisp.enumeration.aD.E.a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008e, code lost:
    
        r1 = r18.s();
        r2 = ivas.gov.bisp.enumeration.aD.E.a;
        r3 = ((r2 | 89) << 1) - (r2 ^ 89);
        ivas.gov.bisp.enumeration.aD.E.b = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009f, code lost:
    
        if ((r3 % 2) != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a1, code lost:
    
        r2 = 54 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a4, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0049, code lost:
    
        if (((r13 & r14) | (r14 ^ r13)) == 2) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <UT, UB, ET extends ivas.gov.bisp.enumeration.o000O000.o00Ooo.OooO00o<ET>> boolean m(ivas.gov.bisp.enumeration.aD.ag r18, ivas.gov.bisp.enumeration.aD.J r19, ivas.gov.bisp.enumeration.o000O000.o0OoOo0<ET> r20, ivas.gov.bisp.enumeration.o000O000.o00Ooo<ET> r21, ivas.gov.bisp.enumeration.o000O000.o00O00<UT, UB> r22, UB r23) throws ivas.gov.bisp.enumeration.aD.C0065v {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.E.m(ivas.gov.bisp.enumeration.aD.ag, ivas.gov.bisp.enumeration.aD.J, ivas.gov.bisp.enumeration.aD.x, ivas.gov.bisp.enumeration.aD.m, ivas.gov.bisp.enumeration.aD.G, java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(T t, InterfaceC0051g interfaceC0051g) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 3) | (i2 & 3)) << 1;
        int i4 = -(((~i2) & 3) | (i2 & (-4)));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        Iterator itN = this.f.f(t).n();
        int i7 = b;
        int i8 = (-2) - (((i7 & 24) + (i7 | 24)) ^ (-1));
        a = i8 % 128;
        int i9 = i8 % 2;
        while (itN.hasNext()) {
            int i10 = a;
            int i11 = i10 & 5;
            int i12 = ((((i10 ^ 5) | i11) << 1) - (~(-((i10 | 5) & (~i11))))) - 1;
            b = i12 % 128;
            int i13 = i12 % 2;
            Map.Entry entry = (Map.Entry) itN.next();
            int i14 = b;
            int i15 = (((i14 & (-102)) | ((~i14) & 101)) - (~(-(-((i14 & 101) << 1))))) - 1;
            a = i15 % 128;
            int i16 = i15 % 2;
            C0056m.bkw bkwVar = (C0056m.bkw) entry.getKey();
            au auVarU = bkwVar.u();
            int i17 = b;
            int i18 = (((i17 | 92) << 1) - (i17 ^ 92)) - 1;
            a = i18 % 128;
            Object obj = null;
            if (i18 % 2 != 0) {
                au auVar = au.k;
                obj.hashCode();
                throw null;
            }
            if (auVarU == au.k && (!bkwVar.o())) {
                int i19 = b;
                int i20 = (i19 & 41) + (i19 | 41);
                a = i20 % 128;
                int i21 = i20 % 2;
                if (!bkwVar.t()) {
                    int i22 = a;
                    int i23 = i22 ^ 97;
                    int i24 = -(-((i22 & 97) << 1));
                    int i25 = (i23 & i24) + (i24 | i23);
                    int i26 = i25 % 128;
                    b = i26;
                    int i27 = i25 % 2;
                    if (!(entry instanceof am.bjU)) {
                        int iC = bkwVar.c();
                        Object value = entry.getValue();
                        int i28 = a;
                        int i29 = ((i28 & (-68)) | ((~i28) & 67)) + ((i28 & 67) << 1);
                        b = i29 % 128;
                        if (i29 % 2 == 0) {
                            ((C0055l) interfaceC0051g).h(iC, value);
                            obj.hashCode();
                            throw null;
                        }
                        ((C0055l) interfaceC0051g).h(iC, value);
                    } else {
                        int i30 = i26 ^ 35;
                        int i31 = (i26 & 35) << 1;
                        int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
                        a = i32 % 128;
                        int i33 = i32 % 2;
                        int iC2 = bkwVar.c();
                        int i34 = a;
                        int i35 = ((i34 ^ 29) | (i34 & 29)) << 1;
                        int i36 = -(((~i34) & 29) | (i34 & (-30)));
                        int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
                        b = i37 % 128;
                        int i38 = i37 % 2;
                        AbstractC0069z abstractC0069zD = ((am.bjU) entry).c.getValue().d();
                        int i39 = b;
                        int i40 = (((i39 | 50) << 1) - (i39 ^ 50)) - 1;
                        a = i40 % 128;
                        if (i40 % 2 != 0) {
                            ((C0055l) interfaceC0051g).h(iC2, abstractC0069zD);
                            int i41 = 15 / 0;
                        } else {
                            ((C0055l) interfaceC0051g).h(iC2, abstractC0069zD);
                        }
                        int i42 = a;
                        int i43 = (i42 ^ 35) + ((i42 & 35) << 1);
                        b = i43 % 128;
                        if (i43 % 2 == 0) {
                            int i44 = 4 / 4;
                        }
                    }
                }
            }
            throw new IllegalStateException("Found invalid MessageSet item.");
        }
        o00O00<?, ?> o00o00 = this.d;
        o00o00.s(o00o00.j(t), interfaceC0051g);
        int i45 = b;
        int i46 = i45 ^ 27;
        int i47 = (i45 & 27) << 1;
        int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
        a = i48 % 128;
        int i49 = i48 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0289 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0282 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x02ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x02d3 A[EDGE_INSN: B:124:0x02d3->B:89:0x02d3 BREAK  A[LOOP:1: B:41:0x0177->B:86:0x02cb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:24:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:30:0x0116 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0118  */
    /* JADX WARN: Code duplicated, block: B:39:0x0173  */
    /* JADX WARN: Code duplicated, block: B:42:0x0179  */
    /* JADX WARN: Code duplicated, block: B:44:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:47:0x01b4 A[PHI: r11
  0x01b4: PHI (r11v27 int) = (r11v9 int), (r11v39 int) binds: [B:49:0x01bb, B:45:0x01b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:50:0x01bd A[PHI: r5 r11
  0x01bd: PHI (r5v19 int) = (r5v18 int), (r5v39 int) binds: [B:49:0x01bb, B:45:0x01b1] A[DONT_GENERATE, DONT_INLINE]
  0x01bd: PHI (r11v10 int) = (r11v9 int), (r11v39 int) binds: [B:49:0x01bb, B:45:0x01b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:55:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:57:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:59:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:61:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:64:0x0200  */
    /* JADX WARN: Code duplicated, block: B:66:0x0203 A[PHI: r5
  0x0203: PHI (r5v31 char) = (r5v30 char), (r5v32 char) binds: [B:65:0x0201, B:62:0x01fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0227  */
    /* JADX WARN: Code duplicated, block: B:71:0x022b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0244  */
    /* JADX WARN: Code duplicated, block: B:75:0x0271  */
    /* JADX WARN: Code duplicated, block: B:81:0x0293 A[PHI: r5
  0x0293: PHI (r5v34 char) = (r5v20 char), (r5v30 char), (r5v32 char), (r5v33 char), (r5v38 char) binds: [B:69:0x0227, B:65:0x0201, B:62:0x01fd, B:54:0x01d1, B:70:0x0229] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x0297  */
    /* JADX WARN: Code duplicated, block: B:85:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:90:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:92:0x0309  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void f(T t, byte[] bArr, int i, int i2, C0049e.biK bik) throws Throwable {
        char c;
        int i3;
        int i4;
        Object obj;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        char c2;
        int i13;
        int i14;
        int i15;
        int i16;
        Object objE;
        int i17;
        int i18;
        int i19;
        o0OoOo0<?> o0oooo0;
        J j;
        int i20;
        int i21;
        S.bkL bkl;
        int i22;
        int i23 = 2 % 2;
        int i24 = a;
        int i25 = (i24 | 123) << 1;
        int i26 = -(((~i24) & 123) | (i24 & (-124)));
        int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
        b = i27 % 128;
        Throwable th = null;
        if (i27 % 2 == 0) {
            an anVar = ((S) t).unknownFields;
            th.hashCode();
            throw null;
        }
        S s = (S) t;
        an anVarD = s.unknownFields;
        if (anVarD == an.c) {
            int i28 = a;
            int i29 = i28 & 23;
            int i30 = ((i28 ^ 23) | i29) << 1;
            int i31 = -((i28 | 23) & (~i29));
            int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
            b = i32 % 128;
            if (i32 % 2 == 0) {
                s.unknownFields = an.d();
                throw null;
            }
            anVarD = an.d();
            s.unknownFields = anVarD;
            int i33 = b;
            int i34 = ((i33 ^ 24) + ((i33 & 24) << 1)) - 1;
            a = i34 % 128;
            int i35 = i34 % 2;
        }
        an anVar2 = anVarD;
        ((S.bkJ) t).t();
        int i36 = a;
        int i37 = (i36 & 15) + (i36 | 15);
        b = i37 % 128;
        int i38 = i37 % 2;
        int iX = i;
        S.bkL bkl2 = null;
        while (iX < i2) {
            int i39 = b;
            int i40 = (i39 & 71) + (i39 | 71);
            a = i40 % 128;
            int i41 = i40 % 2;
            int iV = C0049e.v(bArr, iX, bik);
            int i42 = bik.a;
            int i43 = b;
            int i44 = i43 & 13;
            int i45 = -(-((i43 ^ 13) | i44));
            int i46 = ((i44 | i45) << 1) - (i44 ^ i45);
            int i47 = i46 % 128;
            a = i47;
            if (i46 % 2 != 0) {
                if (i42 != 71) {
                    i19 = (-2) - ((i47 + 8) ^ (-1));
                    b = i19 % 128;
                    if (i19 % 2 == 0) {
                        if ((i42 & 25) == 5) {
                            o0oooo0 = this.f;
                            j = bik.d;
                            int i48 = b;
                            int i49 = (i48 & (-14)) | ((~i48) & 13);
                            int i50 = -(-((i48 & 13) << 1));
                            i20 = (i49 ^ i50) + ((i50 & i49) << 1);
                            i21 = i20 % 128;
                            a = i21;
                            if (i20 % 2 == 0) {
                                throw th;
                            }
                            aa aaVar = this.c;
                            int i51 = (i21 ^ 119) + ((i21 & 119) << 1);
                            b = i51 % 128;
                            int i52 = i51 % 2;
                            bkl = (S.bkL) o0oooo0.e(j, aaVar, i42 >>> 3);
                            int i53 = a;
                            int i54 = i53 & 87;
                            int i55 = (i53 | 87) & (~i54);
                            int i56 = i54 << 1;
                            i22 = (i55 & i56) + (i55 | i56);
                            b = i22 % 128;
                            if (i22 % 2 != 0) {
                                throw th;
                            }
                            if (bkl == null) {
                                C0046b c0046b = C0046b.c;
                                throw th;
                            }
                            iX = C0049e.r(i42, bArr, iV, i2, anVar2, bik);
                            int i57 = a;
                            int i58 = i57 & 15;
                            int i59 = ((i57 ^ 15) | i58) << 1;
                            int i60 = -((i57 | 15) & (~i58));
                            int i61 = (i59 & i60) + (i60 | i59);
                            b = i61 % 128;
                            int i62 = i61 % 2;
                            bkl2 = bkl;
                        } else {
                            iX = C0049e.x(i42, bArr, iV, i2, bik);
                            int i63 = a;
                            int i64 = i63 & 77;
                            int i65 = ((i63 | 77) & (~i64)) + (i64 << 1);
                            b = i65 % 128;
                            int i66 = i65 % 2;
                        }
                    } else if ((i42 & 7) == 2) {
                        o0oooo0 = this.f;
                        j = bik.d;
                        int i410 = b;
                        int i411 = (i410 & (-14)) | ((~i410) & 13);
                        int i510 = -(-((i410 & 13) << 1));
                        i20 = (i411 ^ i510) + ((i510 & i411) << 1);
                        i21 = i20 % 128;
                        a = i21;
                        if (i20 % 2 == 0) {
                            throw th;
                        }
                        aa aaVar2 = this.c;
                        int i511 = (i21 ^ 119) + ((i21 & 119) << 1);
                        b = i511 % 128;
                        int i512 = i511 % 2;
                        bkl = (S.bkL) o0oooo0.e(j, aaVar2, i42 >>> 3);
                        int i513 = a;
                        int i514 = i513 & 87;
                        int i515 = (i513 | 87) & (~i514);
                        int i516 = i514 << 1;
                        i22 = (i515 & i516) + (i515 | i516);
                        b = i22 % 128;
                        if (i22 % 2 != 0) {
                            throw th;
                        }
                        if (bkl == null) {
                            C0046b c0046b2 = C0046b.c;
                            throw th;
                        }
                        iX = C0049e.r(i42, bArr, iV, i2, anVar2, bik);
                        int i517 = a;
                        int i518 = i517 & 15;
                        int i519 = ((i517 ^ 15) | i518) << 1;
                        int i67 = -((i517 | 15) & (~i518));
                        int i68 = (i519 & i67) + (i67 | i519);
                        b = i68 % 128;
                        int i69 = i68 % 2;
                        bkl2 = bkl;
                    } else {
                        iX = C0049e.x(i42, bArr, iV, i2, bik);
                        int i610 = a;
                        int i611 = i610 & 77;
                        int i612 = ((i610 | 77) & (~i611)) + (i611 << 1);
                        b = i612 % 128;
                        int i613 = i612 % 2;
                    }
                } else {
                    int i70 = ((i43 ^ 3) | (i43 & 3)) << 1;
                    c = 3;
                    int i71 = -(((~i43) & 3) | (i43 & (-4)));
                    i3 = (i70 ^ i71) + ((i70 & i71) << 1);
                    a = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i72 = 4 % 4;
                    }
                    i4 = 0;
                    obj = th;
                    while (iV < i2) {
                        int i73 = a;
                        int i74 = i73 & 101;
                        int i75 = (i73 ^ 101) | i74;
                        int i76 = (i74 ^ i75) + ((i75 & i74) << 1);
                        b = i76 % 128;
                        int i77 = i76 % 2;
                        iV = C0049e.v(bArr, iV, bik);
                        i6 = bik.a;
                        i7 = a;
                        int i78 = i7 & 47;
                        i8 = (i78 - (~(-(-((i7 ^ 47) | i78))))) - 1;
                        b = i8 % 128;
                        if (i8 % 2 == 0) {
                            i9 = i6 >>> 3;
                            i10 = i6 & 7;
                            if (i9 != 2) {
                                c2 = c;
                                if (i10 == 0) {
                                    if (i6 != 12) {
                                        break;
                                        break;
                                    }
                                    int i79 = b;
                                    int i80 = (i79 & (-72)) | ((~i79) & 71);
                                    int i81 = (i79 & 71) << 1;
                                    i15 = ((i80 | i81) << 1) - (i81 ^ i80);
                                    a = i15 % 128;
                                    if (i15 % 2 == 0) {
                                        C0049e.x(i6, bArr, iV, i2, bik);
                                        throw null;
                                    }
                                    iV = C0049e.x(i6, bArr, iV, i2, bik);
                                    int i82 = b;
                                    int i83 = ((i82 & (-30)) | ((~i82) & 29)) + ((i82 & 29) << 1);
                                    a = i83 % 128;
                                    int i84 = i83 % 2;
                                    c = c2;
                                } else {
                                    int i85 = (i7 & (-78)) | ((~i7) & 77);
                                    int i86 = -(-((i7 & 77) << 1));
                                    i16 = (i85 ^ i86) + ((i85 & i86) << 1);
                                    b = i16 % 128;
                                    if (i16 % 2 != 0) {
                                        Object obj2 = null;
                                        C0049e.v(bArr, iV, bik);
                                        int i87 = bik.a;
                                        obj2.hashCode();
                                        throw null;
                                    }
                                    iV = C0049e.v(bArr, iV, bik);
                                    i4 = bik.a;
                                    o0OoOo0<?> o0oooo1 = this.f;
                                    J j2 = bik.d;
                                    int i88 = b + 1;
                                    a = i88 % 128;
                                    int i89 = i88 % 2;
                                    objE = o0oooo1.e(j2, this.c, i4);
                                    i17 = a;
                                    int i90 = i17 & 31;
                                    int i91 = (i17 ^ 31) | i90;
                                    i18 = ((i90 | i91) << 1) - (i90 ^ i91);
                                    b = i18 % 128;
                                    if (i18 % 2 != 0) {
                                        Object obj3 = null;
                                        obj3.hashCode();
                                        throw null;
                                    }
                                    bkl2 = (S.bkL) objE;
                                    int i92 = i17 & 19;
                                    int i93 = i92 + ((i17 ^ 19) | i92);
                                    b = i93 % 128;
                                    int i94 = i93 % 2;
                                    c = c2;
                                }
                            } else {
                                i11 = (((i7 | 10) << 1) - (i7 ^ 10)) - 1;
                                i12 = i11 % 128;
                                b = i12;
                                if (i11 % 2 == 0) {
                                    if (i9 == 5) {
                                        int i95 = i12 & 39;
                                        int i96 = -(-((i12 ^ 39) | i95));
                                        int i97 = (i95 & i96) + (i95 | i96);
                                        i13 = i97 % 128;
                                        a = i13;
                                        int i98 = i97 % 2;
                                        if (bkl2 == null) {
                                            C0046b c0046b3 = C0046b.c;
                                            throw null;
                                        }
                                        i14 = ((i13 ^ 121) - (~(-(-((i13 & 121) << 1))))) - 1;
                                        b = i14 % 128;
                                        if (i14 % 2 == 0) {
                                            c2 = 3;
                                            if (i10 == 3) {
                                                iV = C0049e.c(bArr, iV, bik);
                                                Object obj4 = bik.c;
                                                int i99 = b;
                                                int i100 = i99 & 47;
                                                int i101 = (i100 - (~((i99 ^ 47) | i100))) - 1;
                                                int i102 = i101 % 128;
                                                a = i102;
                                                int i103 = i101 % 2;
                                                obj = (AbstractC0069z) obj4;
                                                int i104 = i102 + 41;
                                                b = i104 % 128;
                                                int i105 = i104 % 2;
                                                c = c2;
                                            }
                                        } else {
                                            c2 = 3;
                                            if (i10 == 2) {
                                                iV = C0049e.c(bArr, iV, bik);
                                                Object obj5 = bik.c;
                                                int i910 = b;
                                                int i106 = i910 & 47;
                                                int i107 = (i106 - (~((i910 ^ 47) | i106))) - 1;
                                                int i108 = i107 % 128;
                                                a = i108;
                                                int i109 = i107 % 2;
                                                obj = (AbstractC0069z) obj5;
                                                int i1010 = i108 + 41;
                                                b = i1010 % 128;
                                                int i1011 = i1010 % 2;
                                                c = c2;
                                            }
                                        }
                                    } else {
                                        c2 = 3;
                                    }
                                } else if (i9 == 3) {
                                    int i911 = i12 & 39;
                                    int i912 = -(-((i12 ^ 39) | i911));
                                    int i913 = (i911 & i912) + (i911 | i912);
                                    i13 = i913 % 128;
                                    a = i13;
                                    int i914 = i913 % 2;
                                    if (bkl2 == null) {
                                        C0046b c0046b4 = C0046b.c;
                                        throw null;
                                    }
                                    i14 = ((i13 ^ 121) - (~(-(-((i13 & 121) << 1))))) - 1;
                                    b = i14 % 128;
                                    if (i14 % 2 == 0) {
                                        c2 = 3;
                                        if (i10 == 3) {
                                            iV = C0049e.c(bArr, iV, bik);
                                            Object obj6 = bik.c;
                                            int i915 = b;
                                            int i1012 = i915 & 47;
                                            int i1013 = (i1012 - (~((i915 ^ 47) | i1012))) - 1;
                                            int i1014 = i1013 % 128;
                                            a = i1014;
                                            int i1015 = i1013 % 2;
                                            obj = (AbstractC0069z) obj6;
                                            int i1016 = i1014 + 41;
                                            b = i1016 % 128;
                                            int i1017 = i1016 % 2;
                                            c = c2;
                                        }
                                    } else {
                                        c2 = 3;
                                        if (i10 == 2) {
                                            iV = C0049e.c(bArr, iV, bik);
                                            Object obj7 = bik.c;
                                            int i916 = b;
                                            int i1018 = i916 & 47;
                                            int i1019 = (i1018 - (~((i916 ^ 47) | i1018))) - 1;
                                            int i10110 = i1019 % 128;
                                            a = i10110;
                                            int i10111 = i1019 % 2;
                                            obj = (AbstractC0069z) obj7;
                                            int i10112 = i10110 + 41;
                                            b = i10112 % 128;
                                            int i10113 = i10112 % 2;
                                            c = c2;
                                        }
                                    }
                                } else {
                                    c2 = 3;
                                }
                                if (i6 != 12) {
                                    break;
                                    break;
                                }
                                int i710 = b;
                                int i810 = (i710 & (-72)) | ((~i710) & 71);
                                int i811 = (i710 & 71) << 1;
                                i15 = ((i810 | i811) << 1) - (i811 ^ i810);
                                a = i15 % 128;
                                if (i15 % 2 == 0) {
                                    C0049e.x(i6, bArr, iV, i2, bik);
                                    throw null;
                                }
                                iV = C0049e.x(i6, bArr, iV, i2, bik);
                                int i812 = b;
                                int i813 = ((i812 & (-30)) | ((~i812) & 29)) + ((i812 & 29) << 1);
                                a = i813 % 128;
                                int i814 = i813 % 2;
                                c = c2;
                            }
                        } else {
                            i9 = i6 - 2;
                            i10 = (i6 ^ 58) | (i6 & 58);
                            if (i9 != 2) {
                                c2 = c;
                                if (i10 == 0) {
                                    if (i6 != 12) {
                                        break;
                                        break;
                                    }
                                    int i711 = b;
                                    int i815 = (i711 & (-72)) | ((~i711) & 71);
                                    int i816 = (i711 & 71) << 1;
                                    i15 = ((i815 | i816) << 1) - (i816 ^ i815);
                                    a = i15 % 128;
                                    if (i15 % 2 == 0) {
                                        C0049e.x(i6, bArr, iV, i2, bik);
                                        throw null;
                                    }
                                    iV = C0049e.x(i6, bArr, iV, i2, bik);
                                    int i817 = b;
                                    int i818 = ((i817 & (-30)) | ((~i817) & 29)) + ((i817 & 29) << 1);
                                    a = i818 % 128;
                                    int i819 = i818 % 2;
                                    c = c2;
                                } else {
                                    int i820 = (i7 & (-78)) | ((~i7) & 77);
                                    int i821 = -(-((i7 & 77) << 1));
                                    i16 = (i820 ^ i821) + ((i820 & i821) << 1);
                                    b = i16 % 128;
                                    if (i16 % 2 != 0) {
                                        Object obj8 = null;
                                        C0049e.v(bArr, iV, bik);
                                        int i822 = bik.a;
                                        obj8.hashCode();
                                        throw null;
                                    }
                                    iV = C0049e.v(bArr, iV, bik);
                                    i4 = bik.a;
                                    o0OoOo0<?> o0oooo2 = this.f;
                                    J j3 = bik.d;
                                    int i823 = b + 1;
                                    a = i823 % 128;
                                    int i824 = i823 % 2;
                                    objE = o0oooo2.e(j3, this.c, i4);
                                    i17 = a;
                                    int i917 = i17 & 31;
                                    int i918 = (i17 ^ 31) | i917;
                                    i18 = ((i917 | i918) << 1) - (i917 ^ i918);
                                    b = i18 % 128;
                                    if (i18 % 2 != 0) {
                                        Object obj9 = null;
                                        obj9.hashCode();
                                        throw null;
                                    }
                                    bkl2 = (S.bkL) objE;
                                    int i919 = i17 & 19;
                                    int i920 = i919 + ((i17 ^ 19) | i919);
                                    b = i920 % 128;
                                    int i921 = i920 % 2;
                                    c = c2;
                                }
                            } else {
                                i11 = (((i7 | 10) << 1) - (i7 ^ 10)) - 1;
                                i12 = i11 % 128;
                                b = i12;
                                if (i11 % 2 == 0) {
                                    if (i9 == 5) {
                                        int i9110 = i12 & 39;
                                        int i9111 = -(-((i12 ^ 39) | i9110));
                                        int i9112 = (i9110 & i9111) + (i9110 | i9111);
                                        i13 = i9112 % 128;
                                        a = i13;
                                        int i9113 = i9112 % 2;
                                        if (bkl2 == null) {
                                            C0046b c0046b5 = C0046b.c;
                                            throw null;
                                        }
                                        i14 = ((i13 ^ 121) - (~(-(-((i13 & 121) << 1))))) - 1;
                                        b = i14 % 128;
                                        if (i14 % 2 == 0) {
                                            c2 = 3;
                                            if (i10 == 3) {
                                                iV = C0049e.c(bArr, iV, bik);
                                                Object obj10 = bik.c;
                                                int i9114 = b;
                                                int i10114 = i9114 & 47;
                                                int i10115 = (i10114 - (~((i9114 ^ 47) | i10114))) - 1;
                                                int i10116 = i10115 % 128;
                                                a = i10116;
                                                int i10117 = i10115 % 2;
                                                obj = (AbstractC0069z) obj10;
                                                int i10118 = i10116 + 41;
                                                b = i10118 % 128;
                                                int i10119 = i10118 % 2;
                                                c = c2;
                                            }
                                        } else {
                                            c2 = 3;
                                            if (i10 == 2) {
                                                iV = C0049e.c(bArr, iV, bik);
                                                Object obj11 = bik.c;
                                                int i9115 = b;
                                                int i101110 = i9115 & 47;
                                                int i101111 = (i101110 - (~((i9115 ^ 47) | i101110))) - 1;
                                                int i101112 = i101111 % 128;
                                                a = i101112;
                                                int i101113 = i101111 % 2;
                                                obj = (AbstractC0069z) obj11;
                                                int i101114 = i101112 + 41;
                                                b = i101114 % 128;
                                                int i101115 = i101114 % 2;
                                                c = c2;
                                            }
                                        }
                                    } else {
                                        c2 = 3;
                                    }
                                } else if (i9 == 3) {
                                    int i9116 = i12 & 39;
                                    int i9117 = -(-((i12 ^ 39) | i9116));
                                    int i9118 = (i9116 & i9117) + (i9116 | i9117);
                                    i13 = i9118 % 128;
                                    a = i13;
                                    int i9119 = i9118 % 2;
                                    if (bkl2 == null) {
                                        C0046b c0046b6 = C0046b.c;
                                        throw null;
                                    }
                                    i14 = ((i13 ^ 121) - (~(-(-((i13 & 121) << 1))))) - 1;
                                    b = i14 % 128;
                                    if (i14 % 2 == 0) {
                                        c2 = 3;
                                        if (i10 == 3) {
                                            iV = C0049e.c(bArr, iV, bik);
                                            Object obj12 = bik.c;
                                            int i91110 = b;
                                            int i101116 = i91110 & 47;
                                            int i101117 = (i101116 - (~((i91110 ^ 47) | i101116))) - 1;
                                            int i101118 = i101117 % 128;
                                            a = i101118;
                                            int i101119 = i101117 % 2;
                                            obj = (AbstractC0069z) obj12;
                                            int i1011110 = i101118 + 41;
                                            b = i1011110 % 128;
                                            int i1011111 = i1011110 % 2;
                                            c = c2;
                                        }
                                    } else {
                                        c2 = 3;
                                        if (i10 == 2) {
                                            iV = C0049e.c(bArr, iV, bik);
                                            Object obj13 = bik.c;
                                            int i91111 = b;
                                            int i1011112 = i91111 & 47;
                                            int i1011113 = (i1011112 - (~((i91111 ^ 47) | i1011112))) - 1;
                                            int i1011114 = i1011113 % 128;
                                            a = i1011114;
                                            int i1011115 = i1011113 % 2;
                                            obj = (AbstractC0069z) obj13;
                                            int i1011116 = i1011114 + 41;
                                            b = i1011116 % 128;
                                            int i1011117 = i1011116 % 2;
                                            c = c2;
                                        }
                                    }
                                } else {
                                    c2 = 3;
                                }
                                if (i6 != 12) {
                                    break;
                                }
                                int i712 = b;
                                int i8110 = (i712 & (-72)) | ((~i712) & 71);
                                int i8111 = (i712 & 71) << 1;
                                i15 = ((i8110 | i8111) << 1) - (i8111 ^ i8110);
                                a = i15 % 128;
                                if (i15 % 2 == 0) {
                                    C0049e.x(i6, bArr, iV, i2, bik);
                                    throw null;
                                }
                                iV = C0049e.x(i6, bArr, iV, i2, bik);
                                int i8112 = b;
                                int i8113 = ((i8112 & (-30)) | ((~i8112) & 29)) + ((i8112 & 29) << 1);
                                a = i8113 % 128;
                                int i8114 = i8113 % 2;
                                c = c2;
                            }
                        }
                    }
                    if (obj != null) {
                        int i110 = b;
                        int i111 = (i110 & (-30)) | ((~i110) & 29);
                        int i112 = -(-((i110 & 29) << 1));
                        int i113 = (i111 & i112) + (i112 | i111);
                        a = i113 % 128;
                        int i114 = i113 % 2;
                        int i115 = i4 << 3;
                        int i116 = (i115 & (-3)) | ((~i115) & 2);
                        int i117 = i115 & 2;
                        anVar2.g((i117 & i116) | (i116 ^ i117), obj);
                        int i118 = a;
                        i5 = (i118 & 51) + (i118 | 51);
                        b = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i119 = 4 % 2;
                        }
                    }
                    int i120 = b;
                    int i121 = i120 & 83;
                    int i122 = ((((i120 ^ 83) | i121) << 1) - (~(-((i120 | 83) & (~i121))))) - 1;
                    a = i122 % 128;
                    int i123 = i122 % 2;
                    iX = iV;
                    th = null;
                }
            } else if (i42 != 11) {
                i19 = (-2) - ((i47 + 8) ^ (-1));
                b = i19 % 128;
                if (i19 % 2 == 0) {
                    if ((i42 & 25) == 5) {
                        o0oooo0 = this.f;
                        j = bik.d;
                        int i412 = b;
                        int i413 = (i412 & (-14)) | ((~i412) & 13);
                        int i5110 = -(-((i412 & 13) << 1));
                        i20 = (i413 ^ i5110) + ((i5110 & i413) << 1);
                        i21 = i20 % 128;
                        a = i21;
                        if (i20 % 2 == 0) {
                            throw th;
                        }
                        aa aaVar3 = this.c;
                        int i5111 = (i21 ^ 119) + ((i21 & 119) << 1);
                        b = i5111 % 128;
                        int i5112 = i5111 % 2;
                        bkl = (S.bkL) o0oooo0.e(j, aaVar3, i42 >>> 3);
                        int i5113 = a;
                        int i5114 = i5113 & 87;
                        int i5115 = (i5113 | 87) & (~i5114);
                        int i5116 = i5114 << 1;
                        i22 = (i5115 & i5116) + (i5115 | i5116);
                        b = i22 % 128;
                        if (i22 % 2 != 0) {
                            throw th;
                        }
                        if (bkl == null) {
                            C0046b c0046b7 = C0046b.c;
                            throw th;
                        }
                        iX = C0049e.r(i42, bArr, iV, i2, anVar2, bik);
                        int i5117 = a;
                        int i5118 = i5117 & 15;
                        int i5119 = ((i5117 ^ 15) | i5118) << 1;
                        int i614 = -((i5117 | 15) & (~i5118));
                        int i615 = (i5119 & i614) + (i614 | i5119);
                        b = i615 % 128;
                        int i616 = i615 % 2;
                        bkl2 = bkl;
                    } else {
                        iX = C0049e.x(i42, bArr, iV, i2, bik);
                        int i617 = a;
                        int i618 = i617 & 77;
                        int i619 = ((i617 | 77) & (~i618)) + (i618 << 1);
                        b = i619 % 128;
                        int i6110 = i619 % 2;
                    }
                } else if ((i42 & 7) == 2) {
                    o0oooo0 = this.f;
                    j = bik.d;
                    int i414 = b;
                    int i415 = (i414 & (-14)) | ((~i414) & 13);
                    int i51110 = -(-((i414 & 13) << 1));
                    i20 = (i415 ^ i51110) + ((i51110 & i415) << 1);
                    i21 = i20 % 128;
                    a = i21;
                    if (i20 % 2 == 0) {
                        throw th;
                    }
                    aa aaVar4 = this.c;
                    int i51111 = (i21 ^ 119) + ((i21 & 119) << 1);
                    b = i51111 % 128;
                    int i51112 = i51111 % 2;
                    bkl = (S.bkL) o0oooo0.e(j, aaVar4, i42 >>> 3);
                    int i51113 = a;
                    int i51114 = i51113 & 87;
                    int i51115 = (i51113 | 87) & (~i51114);
                    int i51116 = i51114 << 1;
                    i22 = (i51115 & i51116) + (i51115 | i51116);
                    b = i22 % 128;
                    if (i22 % 2 != 0) {
                        throw th;
                    }
                    if (bkl == null) {
                        C0046b c0046b8 = C0046b.c;
                        throw th;
                    }
                    iX = C0049e.r(i42, bArr, iV, i2, anVar2, bik);
                    int i51117 = a;
                    int i51118 = i51117 & 15;
                    int i51119 = ((i51117 ^ 15) | i51118) << 1;
                    int i6111 = -((i51117 | 15) & (~i51118));
                    int i6112 = (i51119 & i6111) + (i6111 | i51119);
                    b = i6112 % 128;
                    int i6113 = i6112 % 2;
                    bkl2 = bkl;
                } else {
                    iX = C0049e.x(i42, bArr, iV, i2, bik);
                    int i6114 = a;
                    int i6115 = i6114 & 77;
                    int i6116 = ((i6114 | 77) & (~i6115)) + (i6115 << 1);
                    b = i6116 % 128;
                    int i6117 = i6116 % 2;
                }
            } else {
                int i713 = ((i43 ^ 3) | (i43 & 3)) << 1;
                c = 3;
                int i714 = -(((~i43) & 3) | (i43 & (-4)));
                i3 = (i713 ^ i714) + ((i713 & i714) << 1);
                a = i3 % 128;
                if (i3 % 2 != 0) {
                    int i715 = 4 % 4;
                }
                i4 = 0;
                obj = th;
                while (iV < i2) {
                    int i716 = a;
                    int i717 = i716 & 101;
                    int i718 = (i716 ^ 101) | i717;
                    int i719 = (i717 ^ i718) + ((i718 & i717) << 1);
                    b = i719 % 128;
                    int i720 = i719 % 2;
                    iV = C0049e.v(bArr, iV, bik);
                    i6 = bik.a;
                    i7 = a;
                    int i721 = i7 & 47;
                    i8 = (i721 - (~(-(-((i7 ^ 47) | i721))))) - 1;
                    b = i8 % 128;
                    if (i8 % 2 == 0) {
                        i9 = i6 >>> 3;
                        i10 = i6 & 7;
                        if (i9 != 2) {
                            c2 = c;
                            if (i10 == 0) {
                                if (i6 != 12) {
                                    break;
                                    break;
                                }
                                int i7110 = b;
                                int i8115 = (i7110 & (-72)) | ((~i7110) & 71);
                                int i8116 = (i7110 & 71) << 1;
                                i15 = ((i8115 | i8116) << 1) - (i8116 ^ i8115);
                                a = i15 % 128;
                                if (i15 % 2 == 0) {
                                    C0049e.x(i6, bArr, iV, i2, bik);
                                    throw null;
                                }
                                iV = C0049e.x(i6, bArr, iV, i2, bik);
                                int i8117 = b;
                                int i8118 = ((i8117 & (-30)) | ((~i8117) & 29)) + ((i8117 & 29) << 1);
                                a = i8118 % 128;
                                int i8119 = i8118 % 2;
                                c = c2;
                            } else {
                                int i825 = (i7 & (-78)) | ((~i7) & 77);
                                int i826 = -(-((i7 & 77) << 1));
                                i16 = (i825 ^ i826) + ((i825 & i826) << 1);
                                b = i16 % 128;
                                if (i16 % 2 != 0) {
                                    Object obj14 = null;
                                    C0049e.v(bArr, iV, bik);
                                    int i827 = bik.a;
                                    obj14.hashCode();
                                    throw null;
                                }
                                iV = C0049e.v(bArr, iV, bik);
                                i4 = bik.a;
                                o0OoOo0<?> o0oooo3 = this.f;
                                J j4 = bik.d;
                                int i828 = b + 1;
                                a = i828 % 128;
                                int i829 = i828 % 2;
                                objE = o0oooo3.e(j4, this.c, i4);
                                i17 = a;
                                int i9120 = i17 & 31;
                                int i9121 = (i17 ^ 31) | i9120;
                                i18 = ((i9120 | i9121) << 1) - (i9120 ^ i9121);
                                b = i18 % 128;
                                if (i18 % 2 != 0) {
                                    Object obj15 = null;
                                    obj15.hashCode();
                                    throw null;
                                }
                                bkl2 = (S.bkL) objE;
                                int i9122 = i17 & 19;
                                int i922 = i9122 + ((i17 ^ 19) | i9122);
                                b = i922 % 128;
                                int i923 = i922 % 2;
                                c = c2;
                            }
                        } else {
                            i11 = (((i7 | 10) << 1) - (i7 ^ 10)) - 1;
                            i12 = i11 % 128;
                            b = i12;
                            if (i11 % 2 == 0) {
                                if (i9 == 5) {
                                    int i91112 = i12 & 39;
                                    int i91113 = -(-((i12 ^ 39) | i91112));
                                    int i91114 = (i91112 & i91113) + (i91112 | i91113);
                                    i13 = i91114 % 128;
                                    a = i13;
                                    int i91115 = i91114 % 2;
                                    if (bkl2 == null) {
                                        C0046b c0046b9 = C0046b.c;
                                        throw null;
                                    }
                                    i14 = ((i13 ^ 121) - (~(-(-((i13 & 121) << 1))))) - 1;
                                    b = i14 % 128;
                                    if (i14 % 2 == 0) {
                                        c2 = 3;
                                        if (i10 == 3) {
                                            iV = C0049e.c(bArr, iV, bik);
                                            Object obj16 = bik.c;
                                            int i91116 = b;
                                            int i1011118 = i91116 & 47;
                                            int i1011119 = (i1011118 - (~((i91116 ^ 47) | i1011118))) - 1;
                                            int i10111110 = i1011119 % 128;
                                            a = i10111110;
                                            int i10111111 = i1011119 % 2;
                                            obj = (AbstractC0069z) obj16;
                                            int i10111112 = i10111110 + 41;
                                            b = i10111112 % 128;
                                            int i10111113 = i10111112 % 2;
                                            c = c2;
                                        }
                                    } else {
                                        c2 = 3;
                                        if (i10 == 2) {
                                            iV = C0049e.c(bArr, iV, bik);
                                            Object obj17 = bik.c;
                                            int i91117 = b;
                                            int i10111114 = i91117 & 47;
                                            int i10111115 = (i10111114 - (~((i91117 ^ 47) | i10111114))) - 1;
                                            int i10111116 = i10111115 % 128;
                                            a = i10111116;
                                            int i10111117 = i10111115 % 2;
                                            obj = (AbstractC0069z) obj17;
                                            int i10111118 = i10111116 + 41;
                                            b = i10111118 % 128;
                                            int i10111119 = i10111118 % 2;
                                            c = c2;
                                        }
                                    }
                                } else {
                                    c2 = 3;
                                }
                            } else if (i9 == 3) {
                                int i91118 = i12 & 39;
                                int i91119 = -(-((i12 ^ 39) | i91118));
                                int i911110 = (i91118 & i91119) + (i91118 | i91119);
                                i13 = i911110 % 128;
                                a = i13;
                                int i911111 = i911110 % 2;
                                if (bkl2 == null) {
                                    C0046b c0046b10 = C0046b.c;
                                    throw null;
                                }
                                i14 = ((i13 ^ 121) - (~(-(-((i13 & 121) << 1))))) - 1;
                                b = i14 % 128;
                                if (i14 % 2 == 0) {
                                    c2 = 3;
                                    if (i10 == 3) {
                                        iV = C0049e.c(bArr, iV, bik);
                                        Object obj18 = bik.c;
                                        int i911112 = b;
                                        int i101111110 = i911112 & 47;
                                        int i101111111 = (i101111110 - (~((i911112 ^ 47) | i101111110))) - 1;
                                        int i101111112 = i101111111 % 128;
                                        a = i101111112;
                                        int i101111113 = i101111111 % 2;
                                        obj = (AbstractC0069z) obj18;
                                        int i101111114 = i101111112 + 41;
                                        b = i101111114 % 128;
                                        int i101111115 = i101111114 % 2;
                                        c = c2;
                                    }
                                } else {
                                    c2 = 3;
                                    if (i10 == 2) {
                                        iV = C0049e.c(bArr, iV, bik);
                                        Object obj19 = bik.c;
                                        int i911113 = b;
                                        int i101111116 = i911113 & 47;
                                        int i101111117 = (i101111116 - (~((i911113 ^ 47) | i101111116))) - 1;
                                        int i101111118 = i101111117 % 128;
                                        a = i101111118;
                                        int i101111119 = i101111117 % 2;
                                        obj = (AbstractC0069z) obj19;
                                        int i1011111110 = i101111118 + 41;
                                        b = i1011111110 % 128;
                                        int i1011111111 = i1011111110 % 2;
                                        c = c2;
                                    }
                                }
                            } else {
                                c2 = 3;
                            }
                            if (i6 != 12) {
                                break;
                                break;
                            }
                            int i7111 = b;
                            int i81110 = (i7111 & (-72)) | ((~i7111) & 71);
                            int i81111 = (i7111 & 71) << 1;
                            i15 = ((i81110 | i81111) << 1) - (i81111 ^ i81110);
                            a = i15 % 128;
                            if (i15 % 2 == 0) {
                                C0049e.x(i6, bArr, iV, i2, bik);
                                throw null;
                            }
                            iV = C0049e.x(i6, bArr, iV, i2, bik);
                            int i81112 = b;
                            int i81113 = ((i81112 & (-30)) | ((~i81112) & 29)) + ((i81112 & 29) << 1);
                            a = i81113 % 128;
                            int i81114 = i81113 % 2;
                            c = c2;
                        }
                    } else {
                        i9 = i6 - 2;
                        i10 = (i6 ^ 58) | (i6 & 58);
                        if (i9 != 2) {
                            c2 = c;
                            if (i10 == 0) {
                                if (i6 != 12) {
                                    break;
                                    break;
                                }
                                int i7112 = b;
                                int i81115 = (i7112 & (-72)) | ((~i7112) & 71);
                                int i81116 = (i7112 & 71) << 1;
                                i15 = ((i81115 | i81116) << 1) - (i81116 ^ i81115);
                                a = i15 % 128;
                                if (i15 % 2 == 0) {
                                    C0049e.x(i6, bArr, iV, i2, bik);
                                    throw null;
                                }
                                iV = C0049e.x(i6, bArr, iV, i2, bik);
                                int i81117 = b;
                                int i81118 = ((i81117 & (-30)) | ((~i81117) & 29)) + ((i81117 & 29) << 1);
                                a = i81118 % 128;
                                int i81119 = i81118 % 2;
                                c = c2;
                            } else {
                                int i8210 = (i7 & (-78)) | ((~i7) & 77);
                                int i8211 = -(-((i7 & 77) << 1));
                                i16 = (i8210 ^ i8211) + ((i8210 & i8211) << 1);
                                b = i16 % 128;
                                if (i16 % 2 != 0) {
                                    Object obj110 = null;
                                    C0049e.v(bArr, iV, bik);
                                    int i8212 = bik.a;
                                    obj110.hashCode();
                                    throw null;
                                }
                                iV = C0049e.v(bArr, iV, bik);
                                i4 = bik.a;
                                o0OoOo0<?> o0oooo4 = this.f;
                                J j5 = bik.d;
                                int i8213 = b + 1;
                                a = i8213 % 128;
                                int i8214 = i8213 % 2;
                                objE = o0oooo4.e(j5, this.c, i4);
                                i17 = a;
                                int i9123 = i17 & 31;
                                int i9124 = (i17 ^ 31) | i9123;
                                i18 = ((i9123 | i9124) << 1) - (i9123 ^ i9124);
                                b = i18 % 128;
                                if (i18 % 2 != 0) {
                                    Object obj111 = null;
                                    obj111.hashCode();
                                    throw null;
                                }
                                bkl2 = (S.bkL) objE;
                                int i9125 = i17 & 19;
                                int i924 = i9125 + ((i17 ^ 19) | i9125);
                                b = i924 % 128;
                                int i925 = i924 % 2;
                                c = c2;
                            }
                        } else {
                            i11 = (((i7 | 10) << 1) - (i7 ^ 10)) - 1;
                            i12 = i11 % 128;
                            b = i12;
                            if (i11 % 2 == 0) {
                                if (i9 == 5) {
                                    int i911114 = i12 & 39;
                                    int i911115 = -(-((i12 ^ 39) | i911114));
                                    int i911116 = (i911114 & i911115) + (i911114 | i911115);
                                    i13 = i911116 % 128;
                                    a = i13;
                                    int i911117 = i911116 % 2;
                                    if (bkl2 == null) {
                                        C0046b c0046b11 = C0046b.c;
                                        throw null;
                                    }
                                    i14 = ((i13 ^ 121) - (~(-(-((i13 & 121) << 1))))) - 1;
                                    b = i14 % 128;
                                    if (i14 % 2 == 0) {
                                        c2 = 3;
                                        if (i10 == 3) {
                                            iV = C0049e.c(bArr, iV, bik);
                                            Object obj112 = bik.c;
                                            int i911118 = b;
                                            int i1011111112 = i911118 & 47;
                                            int i1011111113 = (i1011111112 - (~((i911118 ^ 47) | i1011111112))) - 1;
                                            int i1011111114 = i1011111113 % 128;
                                            a = i1011111114;
                                            int i1011111115 = i1011111113 % 2;
                                            obj = (AbstractC0069z) obj112;
                                            int i1011111116 = i1011111114 + 41;
                                            b = i1011111116 % 128;
                                            int i1011111117 = i1011111116 % 2;
                                            c = c2;
                                        }
                                    } else {
                                        c2 = 3;
                                        if (i10 == 2) {
                                            iV = C0049e.c(bArr, iV, bik);
                                            Object obj113 = bik.c;
                                            int i911119 = b;
                                            int i1011111118 = i911119 & 47;
                                            int i1011111119 = (i1011111118 - (~((i911119 ^ 47) | i1011111118))) - 1;
                                            int i10111111110 = i1011111119 % 128;
                                            a = i10111111110;
                                            int i10111111111 = i1011111119 % 2;
                                            obj = (AbstractC0069z) obj113;
                                            int i10111111112 = i10111111110 + 41;
                                            b = i10111111112 % 128;
                                            int i10111111113 = i10111111112 % 2;
                                            c = c2;
                                        }
                                    }
                                } else {
                                    c2 = 3;
                                }
                            } else if (i9 == 3) {
                                int i9111110 = i12 & 39;
                                int i9111111 = -(-((i12 ^ 39) | i9111110));
                                int i9111112 = (i9111110 & i9111111) + (i9111110 | i9111111);
                                i13 = i9111112 % 128;
                                a = i13;
                                int i9111113 = i9111112 % 2;
                                if (bkl2 == null) {
                                    C0046b c0046b12 = C0046b.c;
                                    throw null;
                                }
                                i14 = ((i13 ^ 121) - (~(-(-((i13 & 121) << 1))))) - 1;
                                b = i14 % 128;
                                if (i14 % 2 == 0) {
                                    c2 = 3;
                                    if (i10 == 3) {
                                        iV = C0049e.c(bArr, iV, bik);
                                        Object obj114 = bik.c;
                                        int i9111114 = b;
                                        int i10111111114 = i9111114 & 47;
                                        int i10111111115 = (i10111111114 - (~((i9111114 ^ 47) | i10111111114))) - 1;
                                        int i10111111116 = i10111111115 % 128;
                                        a = i10111111116;
                                        int i10111111117 = i10111111115 % 2;
                                        obj = (AbstractC0069z) obj114;
                                        int i10111111118 = i10111111116 + 41;
                                        b = i10111111118 % 128;
                                        int i10111111119 = i10111111118 % 2;
                                        c = c2;
                                    }
                                } else {
                                    c2 = 3;
                                    if (i10 == 2) {
                                        iV = C0049e.c(bArr, iV, bik);
                                        Object obj115 = bik.c;
                                        int i9111115 = b;
                                        int i101111111110 = i9111115 & 47;
                                        int i101111111111 = (i101111111110 - (~((i9111115 ^ 47) | i101111111110))) - 1;
                                        int i101111111112 = i101111111111 % 128;
                                        a = i101111111112;
                                        int i101111111113 = i101111111111 % 2;
                                        obj = (AbstractC0069z) obj115;
                                        int i101111111114 = i101111111112 + 41;
                                        b = i101111111114 % 128;
                                        int i101111111115 = i101111111114 % 2;
                                        c = c2;
                                    }
                                }
                            } else {
                                c2 = 3;
                            }
                            if (i6 != 12) {
                                break;
                                break;
                            }
                            int i7113 = b;
                            int i811110 = (i7113 & (-72)) | ((~i7113) & 71);
                            int i811111 = (i7113 & 71) << 1;
                            i15 = ((i811110 | i811111) << 1) - (i811111 ^ i811110);
                            a = i15 % 128;
                            if (i15 % 2 == 0) {
                                C0049e.x(i6, bArr, iV, i2, bik);
                                throw null;
                            }
                            iV = C0049e.x(i6, bArr, iV, i2, bik);
                            int i811112 = b;
                            int i811113 = ((i811112 & (-30)) | ((~i811112) & 29)) + ((i811112 & 29) << 1);
                            a = i811113 % 128;
                            int i811114 = i811113 % 2;
                            c = c2;
                        }
                    }
                }
                if (obj != null) {
                    int i1110 = b;
                    int i1111 = (i1110 & (-30)) | ((~i1110) & 29);
                    int i1112 = -(-((i1110 & 29) << 1));
                    int i1113 = (i1111 & i1112) + (i1112 | i1111);
                    a = i1113 % 128;
                    int i1114 = i1113 % 2;
                    int i1115 = i4 << 3;
                    int i1116 = (i1115 & (-3)) | ((~i1115) & 2);
                    int i1117 = i1115 & 2;
                    anVar2.g((i1117 & i1116) | (i1116 ^ i1117), obj);
                    int i1118 = a;
                    i5 = (i1118 & 51) + (i1118 | 51);
                    b = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i1119 = 4 % 2;
                    }
                }
                int i124 = b;
                int i125 = i124 & 83;
                int i126 = ((((i124 ^ 83) | i125) << 1) - (~(-((i124 | 83) & (~i125))))) - 1;
                a = i126 % 128;
                int i127 = i126 % 2;
                iX = iV;
                th = null;
            }
        }
        if (iX != i2) {
            throw C0065v.j();
        }
        int i128 = b;
        int i129 = (i128 ^ 113) + ((i128 & 113) << 1);
        a = i129 % 128;
        if (i129 % 2 != 0) {
            throw null;
        }
    }
}
