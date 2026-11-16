package ivas.gov.bisp.enumeration.aD;

import android.support.v4.media.session.IMediaSession;
import ivas.gov.bisp.enumeration.o000O000.o00Ooo;
import ivas.gov.bisp.enumeration.o000O000.o00Ooo.OooO00o;
import ivas.gov.bisp.enumeration.o000O000.o00oOoo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0056m<T extends o00Ooo.OooO00o<T>> {
    private static int a = 1;
    private static int b;
    public static final C0056m c = new C0056m(true);
    public final o00oOoo<T, Object> d;
    public boolean e;
    public boolean f;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.m$bkw */
    public interface bkw<T extends o00Ooo.OooO00o<T>> extends Comparable<T> {
        int c();

        aa.bbq g(aa.bbq bbqVar, aa aaVar);

        boolean o();

        aq r();

        boolean t();

        au u();
    }

    static {
        int i = b + 99;
        a = i % 128;
        int i2 = i % 2;
    }

    public C0056m() {
        int i = C0054k.c;
        this.d = new ap(16);
    }

    public static Object d(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 95;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        if (!(obj instanceof byte[])) {
            int i6 = ((i2 ^ 94) + ((i2 & 94) << 1)) - 1;
            b = i6 % 128;
            int i7 = i6 % 2;
            return obj;
        }
        int i8 = i4 & 31;
        int i9 = ((~i8) & (i4 | 31)) + (i8 << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        int i11 = (i4 ^ 39) + ((i4 & 39) << 1);
        a = i11 % 128;
        int i12 = i11 % 2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public final /* synthetic */ Object clone() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 9) << 1) - (i2 ^ 9);
        a = i3 % 128;
        int i4 = i3 % 2;
        o00Ooo<T> o00oooJ = j();
        int i5 = b;
        int i6 = i5 & 25;
        int i7 = (i6 - (~((i5 ^ 25) | i6))) - 1;
        a = i7 % 128;
        if (i7 % 2 != 0) {
            return o00oooJ;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 27) + ((i2 & 27) << 1);
        b = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i2 & 45;
            int i5 = (((i2 ^ 45) | i4) << 1) - ((i2 | 45) & (~i4));
            b = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(!(obj instanceof C0056m))) {
            boolean zEquals = this.d.equals(((C0056m) obj).d);
            int i7 = b;
            int i8 = ((i7 | 67) << 1) - (i7 ^ 67);
            a = i8 % 128;
            if (i8 % 2 != 0) {
                return zEquals;
            }
            throw null;
        }
        int i9 = i2 ^ 107;
        int i10 = (((i2 & 107) | i9) << 1) - i9;
        b = i10 % 128;
        int i11 = i10 % 2;
        int i12 = (i2 & 41) + (i2 | 41);
        b = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 66 / 0;
        }
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 66) << 1) - (i2 ^ 66)) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            this.d.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.d.hashCode();
        int i4 = b + 93;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
        return iHashCode;
    }

    public final o00Ooo<T> j() {
        Map.Entry entryG;
        Object key;
        int i = 2 % 2;
        C0056m c0056m = new C0056m();
        int i2 = a;
        int i3 = (i2 & 21) + (i2 | 21);
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 0;
        while (i5 < this.d.f()) {
            int i6 = b;
            int i7 = (((i6 & (-60)) | ((~i6) & 59)) - (~(-(-((i6 & 59) << 1))))) - 1;
            a = i7 % 128;
            if (i7 % 2 == 0) {
                entryG = this.d.g(i5);
                key = entryG.getKey();
                int i8 = 89 / 0;
            } else {
                entryG = this.d.g(i5);
                key = entryG.getKey();
            }
            c0056m.p((bkw) key, entryG.getValue());
            int i9 = i5 & (-21);
            int i10 = -(-((i5 ^ (-21)) | i9));
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            int i12 = ((i11 ^ 22) | (i11 & 22)) << 1;
            int i13 = -((i11 & (-23)) | ((~i11) & 22));
            i5 = (i12 | i13) + (i12 & i13);
            int i14 = a;
            int i15 = i14 & 31;
            int i16 = -(-((i14 ^ 31) | i15));
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            b = i17 % 128;
            int i18 = i17 % 2;
        }
        int i19 = a;
        int i20 = i19 & 15;
        int i21 = ((((i19 ^ 15) | i20) << 1) - (~(-((i19 | 15) & (~i20))))) - 1;
        int i22 = i21 % 128;
        b = i22;
        int i23 = i21 % 2;
        int i24 = (-2) - ((((i22 | 56) << 1) - (i22 ^ 56)) ^ (-1));
        a = i24 % 128;
        int i25 = i24 % 2;
        for (Map.Entry entry : this.d.h()) {
            int i26 = b;
            int i27 = i26 & 45;
            int i28 = (i26 ^ 45) | i27;
            int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
            a = i29 % 128;
            int i30 = i29 % 2;
            Object key2 = entry.getKey();
            int i31 = a;
            int i32 = (i31 & 61) + (i31 | 61);
            b = i32 % 128;
            if (i32 % 2 != 0) {
                c0056m.p((bkw) key2, entry.getValue());
                throw null;
            }
            c0056m.p((bkw) key2, entry.getValue());
        }
        c0056m.f = this.f;
        int i33 = (-2) - ((b + 32) ^ (-1));
        a = i33 % 128;
        int i34 = i33 % 2;
        return c0056m;
    }

    public final boolean m() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 41) << 1) - (i2 ^ 41);
        b = i3 % 128;
        int i4 = i3 % 2;
        boolean zIsEmpty = this.d.isEmpty();
        if (i4 != 0) {
            int i5 = 22 / 0;
        }
        return zIsEmpty;
    }

    public final void o() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - ((i2 + 26) ^ (-1));
        a = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this.e) {
            int i4 = (((i2 | 118) << 1) - (i2 ^ 118)) - 1;
            a = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 39 / 0;
                return;
            }
            return;
        }
        this.d.c();
        this.e = true;
        int i6 = b;
        int i7 = ((i6 ^ 122) + ((i6 & 122) << 1)) - 1;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public static int e(aq aqVar, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 ^ 89) + ((i3 & 89) << 1);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            AbstractC0064u.bT(i);
            aq aqVar2 = aq.m;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int iBT = AbstractC0064u.bT(i);
        if (aqVar == aq.m) {
            iBT *= 2;
            int i5 = b;
            int i6 = i5 & 51;
            int i7 = -(-((i5 ^ 51) | i6));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            a = i8 % 128;
            int i9 = i8 % 2;
        }
        int iF = f(aqVar, obj);
        int i10 = ((~iBT) & iF) | ((~iF) & iBT);
        int i11 = -(-((iF & iBT) << 1));
        int i12 = (i10 & i11) + (i11 | i10);
        int i13 = a;
        int i14 = (i13 & 71) + (i13 | 71);
        b = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 12 / 0;
        }
        return i12;
    }

    public final Object k(T t) {
        int i = 2 % 2;
        int i2 = a + 124;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        Object objB = this.d.get(t);
        if (objB instanceof am) {
            int i5 = a;
            int i6 = (i5 ^ 66) + ((i5 & 66) << 1);
            int i7 = (i6 ^ (-1)) + (i6 << 1);
            b = i7 % 128;
            if (i7 % 2 != 0) {
                objB = ((am) objB).b();
                int i8 = 45 / 0;
            } else {
                objB = ((am) objB).b();
            }
            int i9 = a;
            int i10 = i9 ^ 79;
            int i11 = ((i9 & 79) | i10) << 1;
            int i12 = -i10;
            int i13 = (i11 & i12) + (i11 | i12);
            b = i13 % 128;
            int i14 = i13 % 2;
        }
        int i15 = a + 83;
        b = i15 % 128;
        int i16 = i15 % 2;
        return objB;
    }

    public final Iterator<Map.Entry<T, Object>> n() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 55;
        int i4 = ((i2 & 55) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        if (this.f) {
            am.bjV bjv = new am.bjV(this.d.entrySet().iterator());
            int i8 = b;
            int i9 = ((i8 ^ 81) - (~((i8 & 81) << 1))) - 1;
            a = i9 % 128;
            int i10 = i9 % 2;
            return bjv;
        }
        Iterator<Map.Entry<T, Object>> it = this.d.entrySet().iterator();
        int i11 = b;
        int i12 = i11 & 75;
        int i13 = ((i11 ^ 75) | i12) << 1;
        int i14 = -((i11 | 75) & (~i12));
        int i15 = (i13 & i14) + (i14 | i13);
        a = i15 % 128;
        int i16 = i15 % 2;
        return it;
    }

    public final boolean i() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 31;
        int i4 = (i2 & 31) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        int i8 = i6 & 87;
        int i9 = (i6 ^ 87) | i8;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        a = i10 % 128;
        int i11 = i10 % 2;
        int i12 = 0;
        while (true) {
            Object obj = null;
            if (i12 >= this.d.f()) {
                Iterator it = this.d.h().iterator();
                int i13 = b;
                int i14 = (i13 & (-62)) | ((~i13) & 61);
                int i15 = -(-((i13 & 61) << 1));
                int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                a = i16 % 128;
                int i17 = i16 % 2;
                while (!(!it.hasNext())) {
                    int i18 = a;
                    int i19 = ((i18 & (-110)) | ((~i18) & 109)) + ((i18 & 109) << 1);
                    b = i19 % 128;
                    if (i19 % 2 != 0) {
                        h((Map.Entry) it.next());
                        obj.hashCode();
                        throw null;
                    }
                    if (!h((Map.Entry) it.next())) {
                        int i20 = a;
                        int i21 = (i20 & (-64)) | ((~i20) & 63);
                        int i22 = (i20 & 63) << 1;
                        int i23 = (i21 & i22) + (i22 | i21);
                        b = i23 % 128;
                        return i23 % 2 != 0;
                    }
                }
                int i24 = b + 4;
                int i25 = (i24 ^ (-1)) + (i24 << 1);
                a = i25 % 128;
                if (i25 % 2 != 0) {
                    return true;
                }
                obj.hashCode();
                throw null;
            }
            int i26 = a;
            int i27 = i26 & 107;
            int i28 = ((((i26 ^ 107) | i27) << 1) - (~(-((i26 | 107) & (~i27))))) - 1;
            b = i28 % 128;
            if (i28 % 2 != 0) {
                h(this.d.g(i12));
                throw null;
            }
            if (!h(this.d.g(i12))) {
                int i29 = b;
                int i30 = i29 | 59;
                int i31 = ((i30 << 1) - (~(-((~(i29 & 59)) & i30)))) - 1;
                a = i31 % 128;
                return i31 % 2 == 0;
            }
            int i32 = i12 ^ 121;
            int i33 = -(-((i12 & 121) << 1));
            int i34 = (i32 & i33) + (i33 | i32);
            i12 = ((i34 & 119) | ((~i34) & (-120))) + ((i34 & (-120)) << 1);
            int i35 = b;
            int i36 = ((i35 ^ 125) | (i35 & 125)) << 1;
            int i37 = -(((~i35) & 125) | (i35 & (-126)));
            int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
            a = i38 % 128;
            int i39 = i38 % 2;
        }
    }

    public C0056m(boolean z) {
        int i = C0054k.c;
        this.d = new ap(0);
        o();
        o();
    }

    public static int g(o00Ooo.OooO00o<?> oooO00o, Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 117;
        int i4 = i3 + ((i2 ^ 117) | i3);
        b = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 != 0) {
            oooO00o.r();
            oooO00o.c();
            obj2.hashCode();
            throw null;
        }
        aq aqVarR = oooO00o.r();
        int iC = oooO00o.c();
        if (!oooO00o.o()) {
            int iE = e(aqVarR, iC, obj);
            int i5 = a;
            int i6 = (((i5 ^ 87) | (i5 & 87)) << 1) - (((~i5) & 87) | (i5 & (-88)));
            b = i6 % 128;
            if (i6 % 2 == 0) {
                return iE;
            }
            throw null;
        }
        int i7 = a;
        int i8 = (i7 ^ 61) + ((i7 & 61) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        int i10 = 0;
        if (!oooO00o.t()) {
            Iterator it = ((List) obj).iterator();
            int i11 = b;
            int i12 = ((((i11 ^ 47) | (i11 & 47)) << 1) - (~(-(((~i11) & 47) | (i11 & (-48)))))) - 1;
            a = i12 % 128;
            int i13 = i12 % 2;
            while (it.hasNext()) {
                int i14 = b;
                int i15 = (i14 & 47) + (i14 | 47);
                a = i15 % 128;
                int i16 = i15 % 2;
                int iE2 = e(aqVarR, iC, it.next());
                int i17 = b;
                int i18 = (i17 & 113) + (i17 | 113);
                int i19 = i18 % 128;
                a = i19;
                int i20 = i18 % 2;
                int i21 = -(-iE2);
                int i22 = i10 & i21;
                int i23 = -(-(i21 | i10));
                i10 = (i22 ^ i23) + ((i23 & i22) << 1);
                int i24 = i19 & 111;
                int i25 = ((i19 ^ 111) | i24) << 1;
                int i26 = -((i19 | 111) & (~i24));
                int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
                b = i27 % 128;
                int i28 = i27 % 2;
            }
            int i29 = a + 23;
            b = i29 % 128;
            int i30 = i29 % 2;
            return i10;
        }
        int i31 = a;
        int i32 = i31 & 11;
        int i33 = (((i31 | 11) & (~i32)) - (~(-(-(i32 << 1))))) - 1;
        b = i33 % 128;
        int i34 = i33 % 2;
        Iterator it2 = ((List) obj).iterator();
        int i35 = b;
        int i36 = (i35 ^ 49) + ((i35 & 49) << 1);
        a = i36 % 128;
        int i37 = i36 % 2;
        while (!(!it2.hasNext())) {
            int i38 = b + 95;
            a = i38 % 128;
            if (i38 % 2 == 0) {
                f(aqVarR, it2.next());
                throw null;
            }
            int iF = f(aqVarR, it2.next());
            int i39 = b;
            int i40 = ((i39 & (-22)) | ((~i39) & 21)) + ((i39 & 21) << 1);
            a = i40 % 128;
            int i41 = i40 % 2;
            int i42 = -(-iF);
            int i43 = i10 & i42;
            int i44 = (i42 | i10) & (~i43);
            int i45 = -(-(i43 << 1));
            i10 = (i44 ^ i45) + ((i44 & i45) << 1);
            int i46 = ((i39 ^ 41) | (i39 & 41)) << 1;
            int i47 = -(((~i39) & 41) | (i39 & (-42)));
            int i48 = (i46 & i47) + (i46 | i47);
            a = i48 % 128;
            int i49 = i48 % 2;
        }
        int iBT = AbstractC0064u.bT(iC);
        int i50 = -(~(-(-i10)));
        int i51 = (((((iBT | i50) << 1) - (iBT ^ i50)) - 1) - (~AbstractC0064u.bU(i10))) - 1;
        int i52 = a;
        int i53 = ((i52 | 29) << 1) - (i52 ^ 29);
        b = i53 % 128;
        int i54 = i53 % 2;
        return i51;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00d7  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0143, code lost:
    
        if (r7 != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(ivas.gov.bisp.enumeration.aD.aq r7, java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.C0056m.r(ivas.gov.bisp.enumeration.aD.aq, java.lang.Object):void");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0053  */
    /* JADX WARN: Code duplicated, block: B:15:0x007e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0091  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:34:0x0105  */
    /* JADX WARN: Code duplicated, block: B:36:0x0109  */
    /* JADX WARN: Code duplicated, block: B:38:0x011c  */
    /* JADX WARN: Code duplicated, block: B:40:0x011e  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:? A[LOOP:0: B:12:0x0076->B:50:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e0, code lost:
    
        if (((ivas.gov.bisp.enumeration.aD.aa) r8).n() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e9, code lost:
    
        if (((ivas.gov.bisp.enumeration.aD.aa) r8).n() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00eb, code lost:
    
        r8 = ivas.gov.bisp.enumeration.aD.C0056m.a;
        r1 = (r8 & 43) + (r8 | 43);
        r8 = r1 % 128;
        ivas.gov.bisp.enumeration.aD.C0056m.b = r8;
        r1 = r1 % 2;
        r1 = ((r8 ^ 43) - (~((r8 & 43) << 1))) - 1;
        ivas.gov.bisp.enumeration.aD.C0056m.a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0104, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T extends ivas.gov.bisp.enumeration.o000O000.o00Ooo.OooO00o<T>> boolean h(java.util.Map.Entry<T, java.lang.Object> r8) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.C0056m.h(java.util.Map$Entry):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0074  */
    /* JADX WARN: Code duplicated, block: B:17:0x0090 A[LOOP:0: B:12:0x005f->B:17:0x0090, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:22:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public final void p(T t, Object obj) {
        Iterator it;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 77;
        int i5 = -(-((i3 ^ 77) | i4));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 40 / 0;
            if (!t.o()) {
                r(t.r(), obj);
                int i8 = b;
                int i9 = ((i8 | 75) << 1) - (i8 ^ 75);
                a = i9 % 128;
                int i10 = i9 % 2;
            } else {
                if (obj instanceof List) {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                ArrayList arrayList = new ArrayList();
                int i11 = b;
                int i12 = ((i11 & (-24)) | ((~i11) & 23)) + ((i11 & 23) << 1);
                a = i12 % 128;
                int i13 = i12 % 2;
                arrayList.addAll((List) obj);
                it = arrayList.iterator();
                int i14 = a;
                int i15 = (i14 ^ 86) + ((i14 & 86) << 1);
                int i16 = (i15 ^ (-1)) + (i15 << 1);
                b = i16 % 128;
                int i17 = i16 % 2;
                while (it.hasNext()) {
                    int i18 = b;
                    int i19 = ((i18 ^ 51) | (i18 & 51)) << 1;
                    int i20 = -(((~i18) & 51) | (i18 & (-52)));
                    i = ((i19 | i20) << 1) - (i20 ^ i19);
                    a = i % 128;
                    if (i % 2 != 0) {
                        it.next();
                        t.r();
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    r(t.r(), it.next());
                    int i21 = a;
                    int i22 = (i21 & (-50)) | ((~i21) & 49);
                    int i23 = -(-((i21 & 49) << 1));
                    int i24 = (i22 & i23) + (i23 | i22);
                    b = i24 % 128;
                    int i25 = i24 % 2;
                }
                int i26 = b;
                int i27 = (i26 ^ 35) + ((i26 & 35) << 1);
                a = i27 % 128;
                int i28 = i27 % 2;
                obj = arrayList;
            }
        } else if (!t.o()) {
            r(t.r(), obj);
            int i29 = b;
            int i30 = ((i29 | 75) << 1) - (i29 ^ 75);
            a = i30 % 128;
            int i110 = i30 % 2;
        } else {
            if (obj instanceof List) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList2 = new ArrayList();
            int i111 = b;
            int i112 = ((i111 & (-24)) | ((~i111) & 23)) + ((i111 & 23) << 1);
            a = i112 % 128;
            int i113 = i112 % 2;
            arrayList2.addAll((List) obj);
            it = arrayList2.iterator();
            int i114 = a;
            int i115 = (i114 ^ 86) + ((i114 & 86) << 1);
            int i116 = (i115 ^ (-1)) + (i115 << 1);
            b = i116 % 128;
            int i117 = i116 % 2;
            while (it.hasNext()) {
                int i118 = b;
                int i119 = ((i118 ^ 51) | (i118 & 51)) << 1;
                int i210 = -(((~i118) & 51) | (i118 & (-52)));
                i = ((i119 | i210) << 1) - (i210 ^ i119);
                a = i % 128;
                if (i % 2 != 0) {
                    it.next();
                    t.r();
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                r(t.r(), it.next());
                int i211 = a;
                int i212 = (i211 & (-50)) | ((~i211) & 49);
                int i213 = -(-((i211 & 49) << 1));
                int i214 = (i212 & i213) + (i213 | i212);
                b = i214 % 128;
                int i215 = i214 % 2;
            }
            int i216 = b;
            int i217 = (i216 ^ 35) + ((i216 & 35) << 1);
            a = i217 % 128;
            int i218 = i217 % 2;
            obj = arrayList2;
        }
        if (obj instanceof am) {
            int i31 = a;
            int i32 = i31 & 109;
            int i33 = i32 + ((i31 ^ 109) | i32);
            int i34 = i33 % 128;
            b = i34;
            if (i33 % 2 != 0) {
                this.f = false;
            } else {
                this.f = true;
            }
            int i35 = i34 ^ 37;
            int i36 = (i34 & 37) << 1;
            int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
            a = i37 % 128;
            int i38 = i37 % 2;
        }
        this.d.j(t, obj);
        int i39 = a;
        int i40 = i39 & 115;
        int i41 = (i39 ^ 115) | i40;
        int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
        b = i42 % 128;
        if (i42 % 2 != 0) {
            int i43 = 73 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007b  */
    public final void q(Map.Entry<T, Object> entry) {
        Object objK;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 53) + (i2 | 53);
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            entry.getKey();
            entry.getValue();
            throw null;
        }
        bkw key = entry.getKey();
        Object value = entry.getValue();
        int i4 = b + 113;
        int i5 = i4 % 128;
        a = i5;
        if (i4 % 2 == 0) {
            boolean z = value instanceof am;
            throw null;
        }
        if (value instanceof am) {
            int i6 = (i5 & 9) + (i5 | 9);
            b = i6 % 128;
            if (i6 % 2 != 0) {
                value = ((am) value).b();
                int i7 = 99 / 0;
            } else {
                value = ((am) value).b();
            }
        }
        if (!key.o()) {
            if (key.u() != au.k) {
                this.d.j(key, d(value));
                int i8 = b;
                int i9 = (i8 ^ 121) + ((i8 & 121) << 1);
                a = i9 % 128;
                if (i9 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            int i10 = b;
            int i11 = ((i10 & 53) - (~(i10 | 53))) - 1;
            a = i11 % 128;
            if (i11 % 2 == 0) {
                k(key);
                obj.hashCode();
                throw null;
            }
            Object objK2 = k(key);
            if (objK2 == null) {
                this.d.j(key, d(value));
                int i12 = b;
                int i13 = ((i12 ^ 99) | (i12 & 99)) << 1;
                int i14 = -(((~i12) & 99) | (i12 & (-100)));
                int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
                a = i15 % 128;
                if (i15 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            int i16 = b;
            int i17 = (i16 ^ 125) + ((i16 & 125) << 1);
            a = i17 % 128;
            int i18 = i17 % 2;
            S sC = ((S.bbs) key.g(((aa) objK2).f(), (aa) value)).c();
            o00oOoo<T, Object> o00oooo = this.d;
            int i19 = b;
            int i20 = i19 & 7;
            int i21 = (i20 - (~((i19 ^ 7) | i20))) - 1;
            a = i21 % 128;
            if (i21 % 2 == 0) {
                o00oooo.j(key, sC);
                int i22 = 94 / 0;
            } else {
                o00oooo.j(key, sC);
            }
            int i23 = b;
            int i24 = ((i23 | 62) << 1) - (i23 ^ 62);
            int i25 = (i24 ^ (-1)) + (i24 << 1);
            a = i25 % 128;
            int i26 = i25 % 2;
            return;
        }
        int i27 = b;
        int i28 = ((i27 ^ 33) | (i27 & 33)) << 1;
        int i29 = -(((~i27) & 33) | (i27 & (-34)));
        int i30 = (i28 & i29) + (i29 | i28);
        a = i30 % 128;
        if (i30 % 2 == 0) {
            objK = k(key);
            int i31 = 26 / 0;
            if (objK == null) {
                objK = new ArrayList();
                int i32 = a;
                int i33 = ((i32 ^ 2) + ((i32 & 2) << 1)) - 1;
                b = i33 % 128;
                int i34 = i33 % 2;
            }
        } else {
            objK = k(key);
            if (objK == null) {
                objK = new ArrayList();
                int i35 = a;
                int i36 = ((i35 ^ 2) + ((i35 & 2) << 1)) - 1;
                b = i36 % 128;
                int i37 = i36 % 2;
            }
        }
        Iterator it = ((List) value).iterator();
        int i38 = a;
        int i39 = i38 & 41;
        int i40 = i39 + ((i38 ^ 41) | i39);
        b = i40 % 128;
        while (true) {
            int i41 = i40 % 2;
            if (!it.hasNext()) {
                this.d.j(key, objK);
                int i42 = b;
                int i43 = ((i42 & 116) + (i42 | 116)) - 1;
                a = i43 % 128;
                int i44 = i43 % 2;
                return;
            }
            int i45 = b;
            int i46 = i45 & 15;
            int i47 = (((i45 ^ 15) | i46) << 1) - ((i45 | 15) & (~i46));
            a = i47 % 128;
            int i48 = i47 % 2;
            Object next = it.next();
            int i49 = (-2) - ((a + 18) ^ (-1));
            b = i49 % 128;
            int i50 = i49 % 2;
            ((List) objK).add(d(next));
            int i51 = a;
            i40 = ((i51 | 29) << 1) - (i51 ^ 29);
            b = i40 % 128;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0089, code lost:
    
        if ((r2 instanceof ivas.gov.bisp.enumeration.aD.am) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        if ((r2 instanceof ivas.gov.bisp.enumeration.aD.am) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
    
        r4 = r1 & 9;
        r1 = (r1 ^ 9) | r4;
        r6 = (r4 & r1) + (r1 | r4);
        ivas.gov.bisp.enumeration.aD.C0056m.a = r6 % 128;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009f, code lost:
    
        if ((r6 % 2) == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a1, code lost:
    
        r10 = r10.getKey().c();
        r4 = ivas.gov.bisp.enumeration.aD.C0056m.a;
        r6 = ((r4 | 31) << 1) - (r4 ^ 31);
        ivas.gov.bisp.enumeration.aD.C0056m.b = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b8, code lost:
    
        if ((r6 % 2) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ba, code lost:
    
        r2 = (ivas.gov.bisp.enumeration.aD.am) r2;
        r4 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.bT(1);
        r6 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c2, code lost:
    
        r2 = (ivas.gov.bisp.enumeration.aD.am) r2;
        r4 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.bT(1);
        r6 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c9, code lost:
    
        r10 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.bS(r6, r10);
        r5 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.bT(3);
        r2 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.bI(r2);
        r6 = ivas.gov.bisp.enumeration.aD.C0056m.b;
        r7 = ((r6 | 93) << 1) - (r6 ^ 93);
        ivas.gov.bisp.enumeration.aD.C0056m.a = r7 % 128;
        r7 = r7 % 2;
        r5 = -(~(-(-r5)));
        r2 = (-2) - ((((r2 | r5) << 1) - (r2 ^ r5)) ^ (-1));
        r4 = -(-(r4 * 2));
        r5 = (r10 & r4) + (r10 | r4);
        r10 = (r2 ^ r5) + ((r2 & r5) << 1);
        r6 = r6 + 55;
        ivas.gov.bisp.enumeration.aD.C0056m.a = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0102, code lost:
    
        if ((r6 % 2) == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0104, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0105, code lost:
    
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0108, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0109, code lost:
    
        r10.getKey().c();
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0115, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0116, code lost:
    
        r10 = r10.getKey().c();
        r1 = ivas.gov.bisp.enumeration.aD.C0056m.b;
        r4 = (((r1 | 98) << 1) - (r1 ^ 98)) - 1;
        ivas.gov.bisp.enumeration.aD.C0056m.a = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x012e, code lost:
    
        if ((r4 % 2) != 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0130, code lost:
    
        r2 = (ivas.gov.bisp.enumeration.aD.aa) r2;
        r1 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.bT(1);
        r4 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0138, code lost:
    
        r2 = (ivas.gov.bisp.enumeration.aD.aa) r2;
        r1 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.bT(1);
        r4 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x013f, code lost:
    
        r10 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.bS(r4, r10);
        r4 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.bT(3);
        r2 = r2.c();
        r5 = ivas.gov.bisp.enumeration.aD.C0056m.a;
        r5 = (-2) - (((r5 & 74) + (r5 | 74)) ^ (-1));
        ivas.gov.bisp.enumeration.aD.C0056m.b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x015b, code lost:
    
        if ((r5 % 2) == 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x015d, code lost:
    
        r2 = (ivas.gov.bisp.enumeration.aD.AbstractC0064u.bK(r2) >> r4) / (r10 >> (r1 << 4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0167, code lost:
    
        r2 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.bK(r2);
        r4 = -(-r4);
        r5 = r2 ^ r4;
        r2 = ((r2 & r4) | r5) << 1;
        r4 = -r5;
        r5 = (r2 ^ r4) + ((r2 & r4) << 1);
        r10 = -(~((r10 - (~(r1 * 2))) - 1));
        r2 = ((r5 ^ r10) + ((r10 & r5) << 1)) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0185, code lost:
    
        r10 = ivas.gov.bisp.enumeration.aD.C0056m.a;
        r1 = ((r10 | 15) << 1) - (r10 ^ 15);
        ivas.gov.bisp.enumeration.aD.C0056m.b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0192, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int l(java.util.Map.Entry<T, java.lang.Object> r10) {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.C0056m.l(java.util.Map$Entry):int");
    }

    public static int f(aq aqVar, Object obj) {
        int iBG;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 1;
        int i4 = -(-(i2 | 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        Object obj2 = null;
        if (i5 % 2 != 0) {
            aqVar.ordinal();
            obj2.hashCode();
            throw null;
        }
        switch (aqVar.ordinal()) {
            case 0:
                Logger logger = AbstractC0064u.d;
                int i6 = b + 95;
                a = i6 % 128;
                int i7 = i6 % 2;
                return 8;
            case 1:
                Logger logger2 = AbstractC0064u.d;
                int i8 = b;
                int i9 = (i8 & 57) + (i8 | 57);
                a = i9 % 128;
                int i10 = i9 % 2;
                return 4;
            case 2:
                int iBZ = AbstractC0064u.bZ(((Long) obj).longValue());
                int i11 = a;
                int i12 = i11 & 49;
                int i13 = ((i11 ^ 49) | i12) << 1;
                int i14 = -((i11 | 49) & (~i12));
                int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
                b = i15 % 128;
                if (i15 % 2 == 0) {
                    return iBZ;
                }
                throw null;
            case 3:
                int iBZ2 = AbstractC0064u.bZ(((Long) obj).longValue());
                int i16 = a;
                int i17 = (i16 ^ 113) + ((i16 & 113) << 1);
                b = i17 % 128;
                int i18 = i17 % 2;
                return iBZ2;
            case 4:
                int iBG2 = AbstractC0064u.bG(((Integer) obj).intValue());
                int i19 = a;
                int i20 = ((i19 | 9) << 1) - (i19 ^ 9);
                b = i20 % 128;
                if (i20 % 2 != 0) {
                    int i21 = 51 / 0;
                }
                return iBG2;
            case 5:
                Logger logger3 = AbstractC0064u.d;
                int i22 = a;
                int i23 = i22 & 109;
                int i24 = (((i22 | 109) & (~i23)) - (~(-(-(i23 << 1))))) - 1;
                b = i24 % 128;
                if (i24 % 2 == 0) {
                    return 8;
                }
                obj2.hashCode();
                throw null;
            case 6:
                Logger logger4 = AbstractC0064u.d;
                int i25 = a;
                int i26 = i25 & 71;
                int i27 = (((i25 | 71) & (~i26)) - (~(i26 << 1))) - 1;
                b = i27 % 128;
                if (i27 % 2 == 0) {
                    return 4;
                }
                throw null;
            case 7:
                Logger logger5 = AbstractC0064u.d;
                int i28 = a;
                int i29 = i28 & 11;
                int i30 = (((i28 | 11) & (~i29)) - (~(i29 << 1))) - 1;
                b = i30 % 128;
                if (i30 % 2 != 0) {
                    int i31 = 46 / 0;
                }
                return 1;
            case 8:
                if (!(obj instanceof AbstractC0069z)) {
                    int iBR = AbstractC0064u.bR((String) obj);
                    int i32 = a;
                    int i33 = (((i32 | 72) << 1) - (i32 ^ 72)) - 1;
                    b = i33 % 128;
                    if (i33 % 2 == 0) {
                        return iBR;
                    }
                    throw null;
                }
                int i34 = b;
                int i35 = i34 ^ 81;
                int i36 = ((i34 & 81) | i35) << 1;
                int i37 = -i35;
                int i38 = ((i36 | i37) << 1) - (i36 ^ i37);
                a = i38 % 128;
                if (i38 % 2 != 0) {
                    return AbstractC0064u.by((AbstractC0069z) obj);
                }
                int iBy = AbstractC0064u.by((AbstractC0069z) obj);
                int i39 = 83 / 0;
                return iBy;
            case 9:
                Logger logger6 = AbstractC0064u.d;
                int iC = ((aa) obj).c();
                int i40 = a;
                int i41 = (i40 & 101) + (i40 | 101);
                b = i41 % 128;
                if (i41 % 2 == 0) {
                    return iC;
                }
                throw null;
            case 10:
                if (obj instanceof am) {
                    int i42 = a;
                    int i43 = i42 & 13;
                    int i44 = (i42 | 13) & (~i43);
                    int i45 = -(-(i43 << 1));
                    int i46 = (i44 & i45) + (i44 | i45);
                    b = i46 % 128;
                    if (i46 % 2 == 0) {
                        return AbstractC0064u.bI((am) obj);
                    }
                    AbstractC0064u.bI((am) obj);
                    obj2.hashCode();
                    throw null;
                }
                Logger logger7 = AbstractC0064u.d;
                int iC2 = ((aa) obj).c();
                int i47 = (-2) - ((b + 104) ^ (-1));
                a = i47 % 128;
                int i48 = i47 % 2;
                int iBK = AbstractC0064u.bK(iC2);
                int i49 = a + 51;
                b = i49 % 128;
                if (i49 % 2 == 0) {
                    return iBK;
                }
                obj2.hashCode();
                throw null;
            case 11:
                if (!(obj instanceof AbstractC0069z)) {
                    Logger logger8 = AbstractC0064u.d;
                    int iBK2 = AbstractC0064u.bK(((byte[]) obj).length);
                    int i50 = a;
                    int i51 = (i50 & (-40)) | ((~i50) & 39);
                    int i52 = (i50 & 39) << 1;
                    int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
                    b = i53 % 128;
                    if (i53 % 2 != 0) {
                        int i54 = 0 / 0;
                    }
                    return iBK2;
                }
                int i55 = b;
                int i56 = ((i55 | 99) << 1) - (i55 ^ 99);
                a = i56 % 128;
                int i57 = i56 % 2;
                int iBy2 = AbstractC0064u.by((AbstractC0069z) obj);
                int i58 = b;
                int i59 = i58 & 59;
                int i60 = i59 + ((i58 ^ 59) | i59);
                a = i60 % 128;
                int i61 = i60 % 2;
                return iBy2;
            case 12:
                int iBU = AbstractC0064u.bU(((Integer) obj).intValue());
                int i62 = b;
                int i63 = i62 & 49;
                int i64 = ((i62 ^ 49) | i63) << 1;
                int i65 = -((i62 | 49) & (~i63));
                int i66 = (i64 & i65) + (i65 | i64);
                a = i66 % 128;
                if (i66 % 2 == 0) {
                    int i67 = 84 / 0;
                }
                return iBU;
            case 13:
                if (!(obj instanceof R.bcK)) {
                    int iBG3 = AbstractC0064u.bG(((Integer) obj).intValue());
                    int i68 = b;
                    int i69 = i68 & 3;
                    int i70 = -(-((i68 ^ 3) | i69));
                    int i71 = (i69 & i70) + (i70 | i69);
                    a = i71 % 128;
                    int i72 = i71 % 2;
                    return iBG3;
                }
                int i73 = a + 97;
                b = i73 % 128;
                if (i73 % 2 != 0) {
                    iBG = AbstractC0064u.bG(((R.bcK) obj).c());
                    int i74 = 11 / 0;
                } else {
                    iBG = AbstractC0064u.bG(((R.bcK) obj).c());
                }
                int i75 = a;
                int i76 = ((i75 | 113) << 1) - (i75 ^ 113);
                b = i76 % 128;
                if (i76 % 2 == 0) {
                    return iBG;
                }
                obj2.hashCode();
                throw null;
            case IMediaSession.Stub.TRANSACTION_playFromMediaId /* 14 */:
                Logger logger9 = AbstractC0064u.d;
                int i77 = a;
                int i78 = ((i77 ^ 27) | (i77 & 27)) << 1;
                int i79 = -(((~i77) & 27) | (i77 & (-28)));
                int i80 = ((i78 | i79) << 1) - (i79 ^ i78);
                b = i80 % 128;
                if (i80 % 2 != 0) {
                    int i81 = 74 / 0;
                }
                return 4;
            case IMediaSession.Stub.TRANSACTION_playFromSearch /* 15 */:
                Logger logger10 = AbstractC0064u.d;
                int i82 = a;
                int i83 = (i82 ^ 53) + ((i82 & 53) << 1);
                b = i83 % 128;
                int i84 = i83 % 2;
                return 8;
            case 16:
                return AbstractC0064u.bN(((Integer) obj).intValue());
            case IMediaSession.Stub.TRANSACTION_skipToQueueItem /* 17 */:
                return AbstractC0064u.bP(((Long) obj).longValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
