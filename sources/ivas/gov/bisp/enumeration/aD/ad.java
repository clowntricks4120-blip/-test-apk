package ivas.gov.bisp.enumeration.aD;

import android.support.v4.media.session.IMediaSession;
import ivas.gov.bisp.enumeration.o000O000.o000O000;
import ivas.gov.bisp.enumeration.o000O000.o000OOo0;
import ivas.gov.bisp.enumeration.o000O000.o00O00;
import ivas.gov.bisp.enumeration.o000O000.o00Ooo;
import ivas.gov.bisp.enumeration.o000O000.o0OoOo0;
import ivas.gov.bisp.enumeration.o000O000.oo0o0Oo;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import net.sqlcipher.BuildConfig;
import net.sqlcipher.database.SQLiteDatabase;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class ad<T> implements o000OOo0<T> {
    private static int a = 0;
    private static int b = 1;
    public static final int[] c = new int[0];
    public static final Unsafe d = ar.q();
    public final boolean e;
    public final int[] f;
    public final Object[] g;
    public final int h;
    public final int i;
    public final boolean j;
    public final aa k;
    public final boolean l;
    public final boolean m;
    public final int[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f56o;
    public final int p;
    public final AbstractC0068y q;
    public final ai r;
    public final o00O00<?, ?> s;
    public final o0OoOo0<?> t;
    public final X u;

    static {
        int i = a;
        int i2 = (i & 4) + (i | 4);
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
    }

    public ad(int[] iArr, Object[] objArr, int i, int i2, aa aaVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, ai aiVar, AbstractC0068y abstractC0068y, o00O00<?, ?> o00o00, o0OoOo0<?> o0oooo0, X x) {
        boolean z3;
        this.f = iArr;
        this.g = objArr;
        this.h = i;
        this.i = i2;
        this.l = aaVar instanceof S;
        this.m = z;
        if (o0oooo0 == null || (!o0oooo0.i(aaVar))) {
            int i5 = a + 79;
            b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            z3 = false;
        } else {
            int i7 = a;
            int i8 = ((i7 ^ 85) - (~(-(-((i7 & 85) << 1))))) - 1;
            int i9 = i8 % 128;
            b = i9;
            int i10 = i8 % 2;
            int i11 = i9 & 49;
            int i12 = ((i9 | 49) & (~i11)) + (i11 << 1);
            a = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 2 % 2;
            } else {
                int i14 = 2 % 2;
            }
            z3 = true;
        }
        this.j = z3;
        this.e = z2;
        int i15 = a;
        int i16 = (-2) - ((i15 + 30) ^ (-1));
        b = i16 % 128;
        if (i16 % 2 == 0) {
            this.n = iArr2;
            this.f56o = i3;
            int i17 = 75 / 0;
        } else {
            this.n = iArr2;
            this.f56o = i3;
        }
        int i18 = ((i15 | 72) << 1) - (i15 ^ 72);
        int i19 = (i18 ^ (-1)) + (i18 << 1);
        int i20 = i19 % 128;
        b = i20;
        Object obj = null;
        if (i19 % 2 == 0) {
            this.p = i4;
            this.r = aiVar;
            obj.hashCode();
            throw null;
        }
        this.p = i4;
        this.r = aiVar;
        int i21 = i20 & 61;
        int i22 = -(-((i20 ^ 61) | i21));
        int i23 = (i21 & i22) + (i22 | i21);
        int i24 = i23 % 128;
        a = i24;
        if (i23 % 2 != 0) {
            this.q = abstractC0068y;
            this.s = o00o00;
            throw null;
        }
        this.q = abstractC0068y;
        this.s = o00o00;
        int i25 = (i24 ^ 122) + ((i24 & 122) << 1);
        int i26 = (i25 ^ (-1)) + (i25 << 1);
        b = i26 % 128;
        if (i26 % 2 == 0) {
            this.t = o0oooo0;
            this.k = aaVar;
            int i27 = 19 / 0;
        } else {
            this.t = o0oooo0;
            this.k = aaVar;
        }
        this.u = x;
        int i28 = ((i24 | 109) << 1) - (i24 ^ 109);
        b = i28 % 128;
        if (i28 % 2 == 0) {
            throw null;
        }
    }

    public static List<?> j(Object obj, long j) {
        int i = 2 % 2;
        int i2 = b + 19;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            return (List) ar.o(obj, j);
        }
        throw null;
    }

    public static ad k(Z z, ai aiVar, AbstractC0068y abstractC0068y, G g, AbstractC0067x abstractC0067x, X x) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 47;
        int i4 = (((i2 | 47) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            boolean z2 = z instanceof ac;
            throw null;
        }
        if (!(z instanceof ac)) {
            throw null;
        }
        ad adVarM = m((ac) z, aiVar, abstractC0068y, g, abstractC0067x, x);
        int i5 = a;
        int i6 = (i5 | 33) << 1;
        int i7 = -(i5 ^ 33);
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 36 / 0;
        }
        return adVarM;
    }

    public static long l(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (((i3 & (-118)) | ((~i3) & 117)) - (~((i3 & 117) << 1))) - 1;
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        long j = i & 1048575;
        int i7 = i5 & 99;
        int i8 = ((i5 ^ 99) | i7) << 1;
        int i9 = -((i5 | 99) & (~i7));
        int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 50 / 0;
        }
        return j;
    }

    public static <T> boolean p(T t, long j) {
        boolean zBooleanValue;
        int i = 2 % 2;
        int i2 = a + 11;
        b = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) ar.o(t, j);
        if (i3 == 0) {
            zBooleanValue = bool.booleanValue();
            int i4 = 99 / 0;
        } else {
            zBooleanValue = bool.booleanValue();
        }
        int i5 = a;
        int i6 = ((i5 & (-82)) | ((~i5) & 81)) + ((i5 & 81) << 1);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 22 / 0;
        }
        return zBooleanValue;
    }

    public static <T> double q(T t, long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 107;
        int i4 = -(-((i2 ^ 107) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        double dDoubleValue = ((Double) ar.o(t, j)).doubleValue();
        int i7 = a;
        int i8 = i7 & 79;
        int i9 = i8 + ((i7 ^ 79) | i8);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            return dDoubleValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static <T> float r(T t, long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 103) + ((i2 & 103) << 1);
        a = i3 % 128;
        if (i3 % 2 != 0) {
            ((Float) ar.o(t, j)).floatValue();
            throw null;
        }
        float fFloatValue = ((Float) ar.o(t, j)).floatValue();
        int i4 = b;
        int i5 = ((i4 | 87) << 1) - (i4 ^ 87);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            return fFloatValue;
        }
        throw null;
    }

    public static <T> int s(T t, long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 ^ 35) | (i2 & 35)) << 1) - (((~i2) & 35) | (i2 & (-36)));
        b = i3 % 128;
        int i4 = i3 % 2;
        int iIntValue = ((Integer) ar.o(t, j)).intValue();
        int i5 = a;
        int i6 = (i5 & 15) + (i5 | 15);
        b = i6 % 128;
        int i7 = i6 % 2;
        return iIntValue;
    }

    public static <T> long t(T t, long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 1) << 1;
        int i4 = -(((~i2) & 1) | (i2 & (-2)));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        long jLongValue = ((Long) ar.o(t, j)).longValue();
        int i7 = a;
        int i8 = ((i7 & (-72)) | ((~i7) & 71)) + ((i7 & 71) << 1);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return jLongValue;
        }
        throw null;
    }

    public static int v(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 45;
        int i5 = (i4 - (~((i3 ^ 45) | i4))) - 1;
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        int i8 = (i & 267386880) >>> 20;
        int i9 = i6 ^ 101;
        int i10 = (i6 & 101) << 1;
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        a = i11 % 128;
        int i12 = i11 % 2;
        return i8;
    }

    public final boolean G(T t, T t2, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 9;
        int i5 = i4 - (~((i3 ^ 9) | i4));
        boolean z = true;
        int i6 = i5 - 1;
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            N(t, i);
            N(t2, i);
            obj.hashCode();
            throw null;
        }
        if (N(t, i) == N(t2, i)) {
            int i7 = a + 9;
            b = i7 % 128;
            int i8 = i7 % 2;
        } else {
            int i9 = a;
            int i10 = i9 | 61;
            int i11 = i10 << 1;
            int i12 = -((~(i9 & 61)) & i10);
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            b = i13 % 128;
            int i14 = i13 % 2;
            z = false;
        }
        int i15 = a;
        int i16 = i15 & 31;
        int i17 = i16 + ((i15 ^ 31) | i16);
        b = i17 % 128;
        if (i17 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final Object I(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (-2) - ((((i3 | 80) << 1) - (i3 ^ 80)) ^ (-1));
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        Object obj = this.g[(i / 3) * 2];
        int i7 = (i5 & (-116)) | ((~i5) & 115);
        int i8 = (i5 & 115) << 1;
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
        return obj;
    }

    public final R.bkH J(int i) {
        Object obj;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 & (-6)) | ((~i3) & 5)) + ((i3 & 5) << 1);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            obj = this.g[((i * 4) >> 4) / 0];
        } else {
            Object[] objArr = this.g;
            int i5 = (i / 3) * 2;
            int i6 = (i5 & (-2)) | ((~i5) & 1);
            int i7 = -(-((i5 & 1) << 1));
            obj = objArr[(i6 & i7) + (i7 | i6)];
        }
        R.bkH bkh = (R.bkH) obj;
        int i8 = i3 + 93;
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return bkh;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final boolean P(T t, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 37;
        boolean z = true;
        int i6 = (((~i5) & (i4 | 37)) - (~(i5 << 1))) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        long j = this.f[i2 + 2] & 1048575;
        int i8 = ((i4 ^ 62) + ((i4 & 62) << 1)) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
        if (ar.n(t, j) == i) {
            int i10 = b;
            int i11 = ((i10 ^ 75) | (i10 & 75)) << 1;
            int i12 = -(((~i10) & 75) | (i10 & (-76)));
            int i13 = (i11 & i12) + (i12 | i11);
            int i14 = i13 % 128;
            a = i14;
            int i15 = i13 % 2;
            int i16 = i14 ^ 111;
            int i17 = (((i14 & 111) | i16) << 1) - i16;
            b = i17 % 128;
            int i18 = i17 % 2;
        } else {
            int i19 = a;
            int i20 = i19 & 25;
            int i21 = i20 + ((i19 ^ 25) | i20);
            b = i21 % 128;
            int i22 = i21 % 2;
            z = false;
        }
        int i23 = b;
        int i24 = (i23 & 3) + (i23 | 3);
        a = i24 % 128;
        if (i24 % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if ((r11 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        return N(r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        N(r9, r10);
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if ((r11 & r12) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        r9 = (r1 & 99) + (r1 | 99);
        ivas.gov.bisp.enumeration.aD.ad.b = r9 % 128;
        r9 = r9 % 2;
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        r9 = ((r1 | 77) << 1) - (r1 ^ 77);
        ivas.gov.bisp.enumeration.aD.ad.b = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        r9 = ivas.gov.bisp.enumeration.aD.ad.b;
        r10 = ((r9 | 95) << 1) - (r9 ^ 95);
        ivas.gov.bisp.enumeration.aD.ad.a = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        if ((r10 % 2) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r8.m != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r8.m != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        r11 = (((r3 | 12) << 1) - (r3 ^ 12)) - 1;
        ivas.gov.bisp.enumeration.aD.ad.a = r11 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean Q(T r9, int r10, int r11, int r12) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.aD.ad.a
            r2 = r1 ^ 35
            r3 = r1 & 35
            r4 = 1
            int r3 = r3 << r4
            int r3 = -r3
            int r3 = -r3
            int r3 = ~r3
            int r2 = r2 - r3
            int r2 = r2 - r4
            int r3 = r2 % 128
            ivas.gov.bisp.enumeration.aD.ad.b = r3
            int r2 = r2 % r0
            r5 = 0
            r6 = 0
            if (r2 != 0) goto L21
            boolean r2 = r8.m
            r7 = 9
            int r7 = r7 / r5
            if (r2 == 0) goto L3f
            goto L25
        L21:
            boolean r2 = r8.m
            if (r2 == 0) goto L3f
        L25:
            r11 = r3 | 12
            int r11 = r11 << r4
            r12 = r3 ^ 12
            int r11 = r11 - r12
            int r11 = r11 - r4
            int r12 = r11 % 128
            ivas.gov.bisp.enumeration.aD.ad.a = r12
            int r11 = r11 % r0
            if (r11 != 0) goto L38
            boolean r9 = r8.N(r9, r10)
            return r9
        L38:
            r8.N(r9, r10)
            r6.hashCode()
            throw r6
        L3f:
            r9 = r11 & r12
            if (r9 == 0) goto L4f
            r9 = r1 & 99
            r10 = r1 | 99
            int r9 = r9 + r10
            int r10 = r9 % 128
            ivas.gov.bisp.enumeration.aD.ad.b = r10
            int r9 = r9 % r0
            r5 = r4
            goto L5a
        L4f:
            r9 = r1 | 77
            int r9 = r9 << r4
            r10 = r1 ^ 77
            int r9 = r9 - r10
            int r10 = r9 % 128
            ivas.gov.bisp.enumeration.aD.ad.b = r10
            int r9 = r9 % r0
        L5a:
            int r9 = ivas.gov.bisp.enumeration.aD.ad.b
            r10 = r9 | 95
            int r10 = r10 << r4
            r9 = r9 ^ 95
            int r10 = r10 - r9
            int r9 = r10 % 128
            ivas.gov.bisp.enumeration.aD.ad.a = r9
            int r10 = r10 % r0
            if (r10 != 0) goto L6a
            return r5
        L6a:
            r6.hashCode()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.ad.Q(java.lang.Object, int, int, int):boolean");
    }

    public final void af(T t, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = ((i4 & 54) + (i4 | 54)) - 1;
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        int i8 = i2 ^ 2;
        int i9 = this.f[((((i2 & 2) | i8) << 1) - (~(-i8))) - 1] & 1048575;
        int i10 = (i6 | 99) << 1;
        int i11 = -(((~i6) & 99) | (i6 & (-100)));
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        a = i12 % 128;
        int i13 = i12 % 2;
        ar.h.q(t, i9, i);
        int i14 = a;
        int i15 = ((((i14 ^ 51) | (i14 & 51)) << 1) - (~(-(((~i14) & 51) | (i14 & (-52)))))) - 1;
        b = i15 % 128;
        int i16 = i15 % 2;
    }

    public final int ag(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 83) + (i3 | 83);
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        int i7 = i & 1;
        int i8 = this.f[(((i ^ 1) | i7) << 1) - ((i | 1) & (~i7))];
        int i9 = (i5 ^ 51) + ((i5 & 51) << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
        return i8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        r9 = ((ivas.gov.bisp.enumeration.aD.C0055l) r9).c;
        r1 = ivas.gov.bisp.enumeration.aD.ad.a;
        r2 = (r1 | 113) << 1;
        r1 = -(((~r1) & 113) | (r1 & (-114)));
        r4 = ((r2 | r1) << 1) - (r1 ^ r2);
        ivas.gov.bisp.enumeration.aD.ad.b = r4 % 128;
        r4 = r4 % 2;
        r9.cc(r7, (ivas.gov.bisp.enumeration.aD.AbstractC0069z) r8);
        r7 = ivas.gov.bisp.enumeration.aD.ad.b;
        r8 = r7 ^ 121;
        r7 = ((r7 & 121) | r8) << 1;
        r8 = -r8;
        r9 = (r7 & r8) + (r7 | r8);
        ivas.gov.bisp.enumeration.aD.ad.a = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        if ((!r1) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if ((!r1) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        ((ivas.gov.bisp.enumeration.aD.C0055l) r9).c.cm(r7, (java.lang.String) r8);
        r7 = ivas.gov.bisp.enumeration.aD.ad.b;
        r8 = r7 ^ 21;
        r7 = -(-((r7 & 21) << 1));
        r9 = (r8 & r7) + (r7 | r8);
        ivas.gov.bisp.enumeration.aD.ad.a = r9 % 128;
        r9 = r9 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void aj(int r7, java.lang.Object r8, ivas.gov.bisp.enumeration.aD.InterfaceC0051g r9) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.aD.ad.b
            r2 = r1 & 109(0x6d, float:1.53E-43)
            int r3 = ~r2
            r1 = r1 | 109(0x6d, float:1.53E-43)
            r1 = r1 & r3
            r3 = 1
            int r2 = r2 << r3
            r4 = r1 & r2
            r1 = r1 | r2
            int r4 = r4 + r1
            int r1 = r4 % 128
            ivas.gov.bisp.enumeration.aD.ad.a = r1
            int r4 = r4 % r0
            boolean r1 = r8 instanceof java.lang.String
            if (r4 == 0) goto L22
            r2 = 71
            int r2 = r2 / 0
            r1 = r1 ^ r3
            if (r1 == r3) goto L41
            goto L25
        L22:
            r1 = r1 ^ r3
            if (r1 == r3) goto L41
        L25:
            java.lang.String r8 = (java.lang.String) r8
            ivas.gov.bisp.enumeration.aD.l r9 = (ivas.gov.bisp.enumeration.aD.C0055l) r9
            ivas.gov.bisp.enumeration.aD.u r9 = r9.c
            r9.cm(r7, r8)
            int r7 = ivas.gov.bisp.enumeration.aD.ad.b
            r8 = r7 ^ 21
            r7 = r7 & 21
            int r7 = r7 << r3
            int r7 = -r7
            int r7 = -r7
            r9 = r8 & r7
            r7 = r7 | r8
            int r9 = r9 + r7
            int r7 = r9 % 128
            ivas.gov.bisp.enumeration.aD.ad.a = r7
            int r9 = r9 % r0
            return
        L41:
            ivas.gov.bisp.enumeration.aD.z r8 = (ivas.gov.bisp.enumeration.aD.AbstractC0069z) r8
            ivas.gov.bisp.enumeration.aD.l r9 = (ivas.gov.bisp.enumeration.aD.C0055l) r9
            ivas.gov.bisp.enumeration.aD.u r9 = r9.c
            int r1 = ivas.gov.bisp.enumeration.aD.ad.a
            r2 = r1 | 113(0x71, float:1.58E-43)
            int r2 = r2 << r3
            r4 = r1 & (-114(0xffffffffffffff8e, float:NaN))
            int r1 = ~r1
            r5 = 113(0x71, float:1.58E-43)
            r1 = r1 & r5
            r1 = r1 | r4
            int r1 = -r1
            r4 = r2 | r1
            int r4 = r4 << r3
            r1 = r1 ^ r2
            int r4 = r4 - r1
            int r1 = r4 % 128
            ivas.gov.bisp.enumeration.aD.ad.b = r1
            int r4 = r4 % r0
            r9.cc(r7, r8)
            int r7 = ivas.gov.bisp.enumeration.aD.ad.b
            r8 = r7 ^ 121(0x79, float:1.7E-43)
            r7 = r7 & 121(0x79, float:1.7E-43)
            r7 = r7 | r8
            int r7 = r7 << r3
            int r8 = -r8
            r9 = r7 & r8
            r7 = r7 | r8
            int r9 = r9 + r7
            int r7 = r9 % 128
            ivas.gov.bisp.enumeration.aD.ad.a = r7
            int r9 = r9 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.ad.aj(int, java.lang.Object, ivas.gov.bisp.enumeration.aD.g):void");
    }

    public final int ak(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = a;
        int i8 = i7 + 83;
        b = i8 % 128;
        if (i8 % 2 == 0) {
            int length = this.f.length;
            i3 = (((length | 5) << 1) - (length ^ 5)) - 1;
        } else {
            int length2 = this.f.length / 3;
            int i9 = -(-((length2 ^ (-1)) | length2));
            i3 = (length2 ^ i9) + ((length2 & i9) << 1);
        }
        int i10 = ((i7 ^ 19) | (i7 & 19)) << 1;
        int i11 = -(((~i7) & 19) | (i7 & (-20)));
        int i12 = i10 ^ i11;
        while (true) {
            int i13 = i12 + ((i11 & i10) << 1);
            b = i13 % 128;
            int i14 = i13 % 2;
            while (true) {
                Object obj = null;
                if (i2 > i3) {
                    int i15 = a;
                    int i16 = i15 & 11;
                    int i17 = (i16 - (~(-(-((i15 ^ 11) | i16))))) - 1;
                    b = i17 % 128;
                    if (i17 % 2 != 0) {
                        return -1;
                    }
                    obj.hashCode();
                    throw null;
                }
                int i18 = b;
                int i19 = (i18 ^ 85) + ((i18 & 85) << 1);
                i4 = i19 % 128;
                a = i4;
                int i20 = i19 % 2;
                int i21 = -(~i2);
                i5 = ((-2) - ((-1) ^ ((i3 ^ i21) + ((i21 & i3) << 1)))) >>> 1;
                int i22 = i5 * 3;
                int[] iArr = this.f;
                int i23 = ((i4 ^ 46) + ((i4 & 46) << 1)) - 1;
                int i24 = i23 % 128;
                b = i24;
                int i25 = i23 % 2;
                int i26 = iArr[i22];
                if (i == i26) {
                    int i27 = ((i24 & (-122)) | ((~i24) & 121)) + ((i24 & 121) << 1);
                    int i28 = i27 % 128;
                    a = i28;
                    int i29 = i27 % 2;
                    int i30 = i28 + 57;
                    b = i30 % 128;
                    if (i30 % 2 != 0) {
                        return i22;
                    }
                    obj.hashCode();
                    throw null;
                }
                if (i < i26) {
                    int i31 = ((i24 & 116) + (i24 | 116)) - 1;
                    a = i31 % 128;
                    if (i31 % 2 != 0) {
                        i3 = i5;
                    } else {
                        int i32 = i5 ^ (-1);
                        int i33 = i5 << 1;
                        i3 = (i32 & i33) + (i33 | i32);
                    }
                    int i34 = i24 + 60;
                    int i35 = (i34 ^ (-1)) + (i34 << 1);
                    a = i35 % 128;
                    int i36 = i35 % 2;
                }
            }
            int i37 = i5 & 1;
            int i38 = (i5 | 1) & (~i37);
            int i39 = -(-(i37 << 1));
            i2 = (i39 | i38) + (i38 & i39);
            i11 = (i4 & (-82)) | ((~i4) & 81);
            i10 = -(-((i4 & 81) << 1));
            i12 = i11 ^ i10;
        }
    }

    public final int g(T t) {
        int iL;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-114)) | ((~i2) & 113);
        int i4 = -(-((i2 & 113) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (!this.m) {
            iL = M(t);
            int i6 = b;
            int i7 = (i6 ^ 75) + ((i6 & 75) << 1);
            a = i7 % 128;
            int i8 = i7 % 2;
        } else {
            iL = L(t);
            int i9 = b;
            int i10 = i9 & 3;
            int i11 = (i9 ^ 3) | i10;
            int i12 = (i10 & i11) + (i11 | i10);
            a = i12 % 128;
            int i13 = i12 % 2;
        }
        int i14 = b;
        int i15 = (i14 & (-16)) | ((~i14) & 15);
        int i16 = (i14 & 15) << 1;
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        a = i17 % 128;
        if (i17 % 2 == 0) {
            return iL;
        }
        throw null;
    }

    public final void h(T t) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 81;
        int i4 = -(-(i2 | 81));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            throw null;
        }
        int i6 = this.f56o;
        while (true) {
            int i7 = this.p;
            if (i6 >= i7) {
                int length = this.n.length;
                int i8 = a;
                int i9 = ((i8 | 63) << 1) - (i8 ^ 63);
                b = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 2 % 5;
                }
                while (i7 < length) {
                    int i11 = b;
                    int i12 = (-2) - ((((i11 | 114) << 1) - (i11 ^ 114)) ^ (-1));
                    a = i12 % 128;
                    if (i12 % 2 != 0) {
                        this.q.c(t, this.n[i7]);
                        obj.hashCode();
                        throw null;
                    }
                    this.q.c(t, this.n[i7]);
                    int i13 = i7 + 19;
                    int i14 = (i13 ^ (-1)) + (i13 << 1);
                    int i15 = i14 & (-17);
                    i7 = (((i14 | (-17)) & (~i15)) - (~(-(-(i15 << 1))))) - 1;
                    int i16 = a;
                    int i17 = (-2) - (((i16 ^ 14) + ((i16 & 14) << 1)) ^ (-1));
                    b = i17 % 128;
                    int i18 = i17 % 2;
                }
                this.s.l(t);
                if (!(!this.j)) {
                    int i19 = b;
                    int i20 = ((i19 ^ 125) | (i19 & 125)) << 1;
                    int i21 = -(((~i19) & 125) | (i19 & (-126)));
                    int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                    a = i22 % 128;
                    if (i22 % 2 != 0) {
                        this.t.h(t);
                        throw null;
                    }
                    this.t.h(t);
                }
                int i23 = b;
                int i24 = i23 & 71;
                int i25 = ((i23 ^ 71) | i24) << 1;
                int i26 = -((i23 | 71) & (~i24));
                int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                a = i27 % 128;
                if (i27 % 2 != 0) {
                    throw null;
                }
                return;
            }
            int i28 = b;
            int i29 = i28 & 109;
            int i30 = (i28 ^ 109) | i29;
            int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
            a = i31 % 128;
            int i32 = i31 % 2;
            long jL = l(ag(this.n[i6]));
            int i33 = b + 87;
            a = i33 % 128;
            if (i33 % 2 != 0) {
                ar.o(t, jL);
                obj.hashCode();
                throw null;
            }
            Object objO = ar.o(t, jL);
            if (objO != null) {
                Object objG = this.u.g(objO);
                ar.bkn bknVar = ar.h;
                int i34 = (-2) - ((b + 78) ^ (-1));
                a = i34 % 128;
                int i35 = i34 % 2;
                bknVar.s(t, jL, objG);
                int i36 = b;
                int i37 = (i36 & (-44)) | ((~i36) & 43);
                int i38 = -(-((i36 & 43) << 1));
                int i39 = (i37 & i38) + (i38 | i37);
                a = i39 % 128;
                int i40 = i39 % 2;
            }
            i6 = ((i6 & 2) + (i6 | 2)) - 1;
            int i41 = b;
            int i42 = (i41 & (-32)) | ((~i41) & 31);
            int i43 = (i41 & 31) << 1;
            int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
            a = i44 % 128;
            int i45 = i44 % 2;
        }
    }

    public final T n() {
        int i = 2 % 2;
        int i2 = b + 83;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            this.r.b(this.k);
            throw null;
        }
        T t = (T) this.r.b(this.k);
        int i3 = b;
        int i4 = ((i3 | 69) << 1) - (i3 ^ 69);
        a = i4 % 128;
        int i5 = i4 % 2;
        return t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0095, code lost:
    
        if (r2 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a5, code lost:
    
        if (r2 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a7, code lost:
    
        r9 = (-2) - ((((r3 | 24) << 1) - (r3 ^ 24)) ^ (-1));
        ivas.gov.bisp.enumeration.aD.ad.b = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b7, code lost:
    
        if ((r9 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b9, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ba, code lost:
    
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bd, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00be, code lost:
    
        r9 = r8.u.a(r9);
        r3 = r8.u;
        r4 = ivas.gov.bisp.enumeration.aD.ad.b;
        r6 = ((r4 ^ 49) | (r4 & 49)) << 1;
        r4 = -(((~r4) & 49) | (r4 & (-50)));
        r7 = ((r6 | r4) << 1) - (r4 ^ r6);
        ivas.gov.bisp.enumeration.aD.ad.a = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e1, code lost:
    
        if ((r7 % 2) != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e3, code lost:
    
        r3.n(r8.g[r10]);
        r9 = r9.entrySet().iterator();
        r10 = ivas.gov.bisp.enumeration.aD.ad.b;
        r3 = ((((r10 ^ 55) | (r10 & 55)) << 1) - (~(-(((~r10) & 55) | (r10 & (-56)))))) - 1;
        ivas.gov.bisp.enumeration.aD.ad.a = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0110, code lost:
    
        if (r9.hasNext() == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0112, code lost:
    
        r10 = ivas.gov.bisp.enumeration.aD.ad.b;
        r3 = r10 & 117;
        r10 = (r10 ^ 117) | r3;
        r4 = (r3 ^ r10) + ((r10 & r3) << 1);
        ivas.gov.bisp.enumeration.aD.ad.a = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0124, code lost:
    
        if ((r4 % 2) == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0126, code lost:
    
        r10 = r9.next();
        r3 = 52 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0131, code lost:
    
        r10 = r9.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0137, code lost:
    
        r3 = ivas.gov.bisp.enumeration.aD.ad.a;
        r3 = (-2) - (((r3 & 94) + (r3 | 94)) ^ (-1));
        ivas.gov.bisp.enumeration.aD.ad.b = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0157, code lost:
    
        if ((!r2.b(((java.lang.Integer) r10.getValue()).intValue())) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0159, code lost:
    
        r9 = ivas.gov.bisp.enumeration.aD.ad.a;
        r2 = (r9 & 42) + (r9 | 42);
        r9 = (r2 ^ (-1)) + (r2 << 1);
        r2 = r9 % 128;
        ivas.gov.bisp.enumeration.aD.ad.b = r2;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x016a, code lost:
    
        if (r11 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x016c, code lost:
    
        r9 = ((r2 | 42) << 1) - (r2 ^ 42);
        r11 = (r9 ^ (-1)) + (r9 << 1);
        ivas.gov.bisp.enumeration.aD.ad.a = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x017d, code lost:
    
        if ((r11 % 2) == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x017f, code lost:
    
        r12.p();
        r1 = 69 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0185, code lost:
    
        r12.p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0188, code lost:
    
        r9 = ivas.gov.bisp.enumeration.aD.ad.b;
        r11 = r9 & 37;
        r9 = (((r9 | 37) & (~r11)) - (~(-(-(r11 << 1))))) - 1;
        ivas.gov.bisp.enumeration.aD.ad.a = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x019d, code lost:
    
        r10.getKey();
        r10.getValue();
        r9 = ivas.gov.bisp.enumeration.aD.ad.a;
        r10 = r9 | 57;
        r11 = r10 << 1;
        r9 = -((~(r9 & 57)) & r10);
        r10 = ((r11 | r9) << 1) - (r9 ^ r11);
        ivas.gov.bisp.enumeration.aD.ad.b = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01b9, code lost:
    
        if ((r10 % 2) != 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01bb, code lost:
    
        java.util.Objects.requireNonNull(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01be, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01bf, code lost:
    
        java.util.Objects.requireNonNull(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01c2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01c3, code lost:
    
        r9 = ivas.gov.bisp.enumeration.aD.ad.a;
        r10 = (r9 | 99) << 1;
        r9 = -(r9 ^ 99);
        r12 = (r10 ^ r9) + ((r9 & r10) << 1);
        ivas.gov.bisp.enumeration.aD.ad.b = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01d7, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01d8, code lost:
    
        r3.n(r8.g[r10]);
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01e2, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <UT, UB> UB H(java.lang.Object r9, int r10, UB r11, ivas.gov.bisp.enumeration.o000O000.o00O00<UT, UB> r12) {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.ad.H(java.lang.Object, int, java.lang.Object, ivas.gov.bisp.enumeration.aD.G):java.lang.Object");
    }

    public final int aa(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 121;
        int i5 = -(-((i3 ^ 121) | i4));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        int i7 = i6 % 128;
        b = i7;
        Object obj = null;
        if (i6 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (i >= this.h) {
            int i8 = i7 & 77;
            int i9 = i8 + ((i7 ^ 77) | i8);
            a = i9 % 128;
            if (i9 % 2 != 0) {
                throw null;
            }
            if (i <= this.i) {
                int iAk = ak(i, 0);
                int i10 = a;
                int i11 = (i10 ^ 101) + ((i10 & 101) << 1);
                b = i11 % 128;
                int i12 = i11 % 2;
                return iAk;
            }
        }
        int i13 = a + 9;
        b = i13 % 128;
        if (i13 % 2 != 0) {
            return -1;
        }
        throw null;
    }

    public final void ac(T t, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 ^ 32) + ((i3 & 32) << 1)) - 1;
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        if (this.m) {
            int i7 = i5 + 7;
            a = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i8 = this.f[i + 2];
        long j = 1048575 & i8;
        int i9 = (i5 ^ 95) + ((i5 & 95) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        int iN = ar.n(t, j);
        ar.bkn bknVar = ar.h;
        int i11 = (-2) - ((a + 76) ^ (-1));
        b = i11 % 128;
        int i12 = i11 % 2;
        int i13 = 1 << (i8 >>> 20);
        bknVar.q(t, j, (i13 & iN) | (iN ^ i13));
        int i14 = a;
        int i15 = (i14 & (-98)) | ((~i14) & 97);
        int i16 = -(-((i14 & 97) << 1));
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        b = i17 % 128;
        int i18 = i17 % 2;
    }

    public final void ad(Object obj, int i, ag agVar) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 64) + ((i3 & 64) << 1)) - 1;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        if ((536870912 & i) != 0) {
            int i7 = (((i5 | 55) << 1) - (~(-(i5 ^ 55)))) - 1;
            b = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = (((i5 & (-20)) | ((~i5) & 19)) - (~((i5 & 19) << 1))) - 1;
                b = i8 % 128;
                if (i8 % 2 == 0) {
                    this.q.e(obj, l(i));
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                List<String> listE = this.q.e(obj, l(i));
                int i9 = a;
                int i10 = i9 & 105;
                int i11 = (i9 ^ 105) | i10;
                int i12 = (i10 & i11) + (i11 | i10);
                b = i12 % 128;
                int i13 = i12 % 2;
                agVar.c(listE);
                int i14 = a;
                int i15 = i14 & 61;
                int i16 = -(-((i14 ^ 61) | i15));
                int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                b = i17 % 128;
                int i18 = i17 % 2;
                return;
            }
        } else {
            int i19 = ((i5 & 15) - (~(i5 | 15))) - 1;
            b = i19 % 128;
            int i20 = i19 % 2;
        }
        agVar.N(this.q.e(obj, l(i)));
        int i21 = a;
        int i22 = i21 ^ 105;
        int i23 = -(-((i21 & 105) << 1));
        int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
        b = i24 % 128;
        int i25 = i24 % 2;
    }

    public final void ae(Object obj, int i, ag agVar) {
        long jL;
        String strF;
        ar.bkn bknVar;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 43;
        int i5 = -(-((i3 ^ 43) | i4));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        int i7 = i6 % 128;
        b = i7;
        Object obj2 = null;
        if (i6 % 2 != 0 ? (536870912 & i) != 0 : (536870912 & i) != 0) {
            int i8 = i7 + 47;
            int i9 = i8 % 128;
            a = i9;
            if (i8 % 2 != 0) {
                int i10 = 2 / 2;
            }
            int i11 = ((i9 | 7) << 1) - (i9 ^ 7);
            b = i11 % 128;
            if (i11 % 2 == 0) {
                l(i);
                agVar.G();
                ar.bkn bknVar2 = ar.h;
                throw null;
            }
            long jL2 = l(i);
            String strG = agVar.G();
            ar.bkn bknVar3 = ar.h;
            int i12 = b;
            int i13 = i12 & 67;
            int i14 = (((i12 | 67) & (~i13)) - (~(-(-(i13 << 1))))) - 1;
            a = i14 % 128;
            int i15 = i14 % 2;
            bknVar3.s(obj, jL2, strG);
            int i16 = b;
            int i17 = ((i16 ^ 93) | (i16 & 93)) << 1;
            int i18 = -(((~i16) & 93) | (i16 & (-94)));
            int i19 = (i17 & i18) + (i18 | i17);
            a = i19 % 128;
            if (i19 % 2 == 0) {
                return;
            }
            obj2.hashCode();
            throw null;
        }
        int i20 = i7 & 53;
        int i21 = -(-((i7 ^ 53) | i20));
        int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
        a = i22 % 128;
        int i23 = i22 % 2;
        if (!this.l) {
            long jL3 = l(i);
            AbstractC0069z abstractC0069zD = agVar.d();
            int i24 = b;
            int i25 = i24 & 3;
            int i26 = (i24 ^ 3) | i25;
            int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
            a = i27 % 128;
            int i28 = i27 % 2;
            ar.h.s(obj, jL3, abstractC0069zD);
            int i29 = a;
            int i30 = i29 & 79;
            int i31 = -(-((i29 ^ 79) | i30));
            int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
            b = i32 % 128;
            if (i32 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i33 = (i7 ^ 123) + ((i7 & 123) << 1);
        a = i33 % 128;
        if (i33 % 2 != 0) {
            jL = l(i);
            strF = agVar.F();
            bknVar = ar.h;
            int i34 = 9 / 0;
        } else {
            jL = l(i);
            strF = agVar.F();
            bknVar = ar.h;
        }
        int i35 = b;
        int i36 = i35 & 115;
        int i37 = (i36 - (~(-(-((i35 ^ 115) | i36))))) - 1;
        a = i37 % 128;
        int i38 = i37 % 2;
        bknVar.s(obj, jL, strF);
        int i39 = b;
        int i40 = i39 | 115;
        int i41 = i40 << 1;
        int i42 = -((~(i39 & 115)) & i40);
        int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
        a = i43 % 128;
        if (i43 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b0, code lost:
    
        if (r10 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b3, code lost:
    
        if (r10 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b5, code lost:
    
        r10 = ivas.gov.bisp.enumeration.aD.ad.a;
        r1 = ((r10 | 34) << 1) - (r10 ^ 34);
        r10 = (r1 ^ (-1)) + (r1 << 1);
        ivas.gov.bisp.enumeration.aD.ad.b = r10 % 128;
        r10 = r10 % 2;
        r9 = r9.next();
        r7 = r7.c;
        r10 = ivas.gov.bisp.enumeration.aD.ad.b;
        r1 = ((r10 | 47) << 1) - (r10 ^ 47);
        ivas.gov.bisp.enumeration.aD.ad.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00de, code lost:
    
        if ((r1 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e0, code lost:
    
        r7.co(r8, 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e3, code lost:
    
        r9.getKey();
        r9.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ea, code lost:
    
        r7.co(r8, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ee, code lost:
    
        r7 = ivas.gov.bisp.enumeration.aD.ad.a;
        r8 = r7 & 97;
        r8 = r8 + ((r7 ^ 97) | r8);
        ivas.gov.bisp.enumeration.aD.ad.b = r8 % 128;
        r8 = r8 % 2;
        java.util.Objects.requireNonNull(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00fe, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <K, V> void ai(ivas.gov.bisp.enumeration.aD.InterfaceC0051g r7, int r8, java.lang.Object r9, int r10) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.ad.ai(ivas.gov.bisp.enumeration.aD.g, int, java.lang.Object, int):void");
    }

    public final void d(T t, ag agVar, J j) throws Throwable {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-24)) | ((~i2) & 23);
        int i4 = -(-((i2 & 23) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        Objects.requireNonNull(j);
        o00O00 o00o00 = this.s;
        o0OoOo0 o0oooo0 = this.t;
        int i7 = b;
        int i8 = i7 & 59;
        int i9 = ((i7 | 59) & (~i8)) + (i8 << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        R(o00o00, o0oooo0, t, agVar, j);
        int i11 = b;
        int i12 = (((i11 | 120) << 1) - (i11 ^ 120)) - 1;
        a = i12 % 128;
        int i13 = i12 % 2;
    }

    public final void f(T t, byte[] bArr, int i, int i2, C0049e.biK bik) throws C0065v {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = ((i4 ^ 14) + ((i4 & 14) << 1)) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        if (!this.m) {
            X(t, bArr, i, i2, 0, bik);
            int i7 = b + 101;
            a = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        int i9 = ((i4 & (-12)) | ((~i4) & 11)) + ((i4 & 11) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        Z(t, bArr, i, i2, bik);
        int i11 = a + 95;
        int i12 = i11 % 128;
        b = i12;
        int i13 = i11 % 2;
        int i14 = i12 & 99;
        int i15 = ((i12 ^ 99) | i14) << 1;
        int i16 = -((i12 | 99) & (~i14));
        int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
        a = i17 % 128;
        if (i17 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void T(T t, T t2, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (i4 & 109) + (i4 | 109);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            i2 = this.f[i % 1];
        } else {
            int i6 = i & 1;
            i2 = this.f[((~i6) & (i | 1)) + (i6 << 1)];
        }
        long jL = l(i2);
        int i7 = a;
        int i8 = (i7 & (-12)) | ((~i7) & 11);
        int i9 = -(-((i7 & 11) << 1));
        int i10 = (i8 & i9) + (i9 | i8);
        b = i10 % 128;
        Object obj = null;
        if (i10 % 2 == 0) {
            N(t2, i);
            obj.hashCode();
            throw null;
        }
        if (!N(t2, i)) {
            int i11 = b + 45;
            a = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 6 / 0;
                return;
            }
            return;
        }
        Object objO = ar.o(t, jL);
        Object objO2 = ar.o(t2, jL);
        if (objO != null) {
            int i13 = a;
            int i14 = i13 ^ 65;
            int i15 = ((i13 & 65) | i14) << 1;
            int i16 = -i14;
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            b = i17 % 128;
            int i18 = i17 % 2;
            if (objO2 != null) {
                int i19 = i13 & 65;
                int i20 = -(-((i13 ^ 65) | i19));
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                b = i21 % 128;
                if (i21 % 2 == 0) {
                    R.d(objO, objO2);
                    ar.bkn bknVar = ar.h;
                    obj.hashCode();
                    throw null;
                }
                ar.h.s(t, jL, R.d(objO, objO2));
                ac(t, i);
                int i22 = a;
                int i23 = (i22 ^ 59) + ((i22 & 59) << 1);
                b = i23 % 128;
                if (i23 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        }
        if (objO2 != null) {
            int i24 = b;
            int i25 = (i24 & (-90)) | ((~i24) & 89);
            int i26 = (i24 & 89) << 1;
            int i27 = (i25 & i26) + (i26 | i25);
            a = i27 % 128;
            int i28 = i27 % 2;
            ar.h.s(t, jL, objO2);
            int i29 = b;
            int i30 = ((i29 ^ 38) + ((i29 & 38) << 1)) - 1;
            a = i30 % 128;
            if (i30 % 2 != 0) {
                ac(t, i);
                throw null;
            }
            ac(t, i);
            int i31 = b;
            int i32 = (i31 & (-88)) | ((~i31) & 87);
            int i33 = -(-((i31 & 87) << 1));
            int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
            a = i34 % 128;
            int i35 = i34 % 2;
        }
        int i36 = a;
        int i37 = i36 & 95;
        int i38 = (i36 | 95) & (~i37);
        int i39 = i37 << 1;
        int i40 = (i38 ^ i39) + ((i38 & i39) << 1);
        b = i40 % 128;
        if (i40 % 2 == 0) {
            int i41 = 42 / 0;
        }
    }

    public final <E> void U(Object obj, int i, ag agVar, o000OOo0<E> o000ooo0, J j) {
        int i2 = 2 % 2;
        int i3 = a + 117;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            l(i);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        agVar.u(this.q.e(obj, l(i)), o000ooo0, j);
        int i4 = a;
        int i5 = i4 & 107;
        int i6 = (i5 - (~((i4 ^ 107) | i5))) - 1;
        b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 67 / 0;
        }
    }

    public final <E> void ab(Object obj, long j, ag agVar, o000OOo0<E> o000ooo0, J j2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 105;
        int i4 = -(-((i2 ^ 105) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        List<T> listE = this.q.e(obj, j);
        int i7 = b + 41;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            agVar.O(listE, o000ooo0, j2);
        } else {
            agVar.O(listE, o000ooo0, j2);
            int i8 = 11 / 0;
        }
    }

    public static an i(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 27) + ((i2 & 27) << 1);
        b = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            an anVar = ((S) obj).unknownFields;
            an anVar2 = an.c;
            obj2.hashCode();
            throw null;
        }
        S s = (S) obj;
        an anVarD = s.unknownFields;
        if (anVarD == an.c) {
            int i4 = a;
            int i5 = i4 & 67;
            int i6 = -(-(i4 | 67));
            int i7 = (i5 & i6) + (i6 | i5);
            b = i7 % 128;
            if (i7 % 2 == 0) {
                s.unknownFields = an.d();
                obj2.hashCode();
                throw null;
            }
            anVarD = an.d();
            s.unknownFields = anVarD;
        }
        int i8 = b + 81;
        a = i8 % 128;
        if (i8 % 2 == 0) {
            return anVarD;
        }
        obj2.hashCode();
        throw null;
    }

    public final ah K(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 51;
        int i5 = (i3 ^ 51) | i4;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        int i9 = (i / 3) * 2;
        Object[] objArr = this.g;
        ah ahVar = (ah) objArr[i9];
        int i10 = i7 & 105;
        int i11 = i10 + ((i7 ^ 105) | i10);
        a = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        if (ahVar != null) {
            int i12 = (-2) - ((i7 + 58) ^ (-1));
            a = i12 % 128;
            if (i12 % 2 == 0) {
                return ahVar;
            }
            throw null;
        }
        ah ahVarC = C0046b.c.c((Class) objArr[((i9 | 1) << 1) - ((i9 & (-2)) | ((~i9) & 1))]);
        int i13 = b;
        int i14 = i13 & 45;
        int i15 = i14 + ((i13 ^ 45) | i14);
        a = i15 % 128;
        int i16 = i15 % 2;
        this.g[i9] = ahVarC;
        int i17 = i13 & 1;
        int i18 = ((i13 ^ 1) | i17) << 1;
        int i19 = -((i13 | 1) & (~i17));
        int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
        a = i20 % 128;
        if (i20 % 2 != 0) {
            int i21 = 52 / 0;
        }
        return ahVarC;
    }

    public final <K, V> void O(Object obj, int i, Object obj2, J j, ag agVar) {
        Object objC;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 77) + ((i3 & 77) << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        int[] iArr = this.f;
        int i6 = i & 1;
        int i7 = ((i ^ 1) | i6) << 1;
        int i8 = -((i | 1) & (~i6));
        long jL = l(iArr[(i7 & i8) + (i8 | i7)]);
        int i9 = b;
        int i10 = i9 & 107;
        int i11 = -(-((i9 ^ 107) | i10));
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        a = i12 % 128;
        int i13 = i12 % 2;
        Object objO = ar.o(obj, jL);
        if (objO == null) {
            int i14 = a;
            int i15 = ((i14 ^ 18) + ((i14 & 18) << 1)) - 1;
            b = i15 % 128;
            if (i15 % 2 == 0) {
                this.u.c(obj2);
                ar.bkn bknVar = ar.h;
                throw null;
            }
            objO = this.u.c(obj2);
            ar.h.s(obj, jL, objO);
            int i16 = a;
            int i17 = i16 & 91;
            int i18 = (i16 ^ 91) | i17;
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            b = i19 % 128;
            int i20 = i19 % 2;
        } else if (!(!this.u.f(objO))) {
            int i21 = a;
            int i22 = ((i21 & 122) + (i21 | 122)) - 1;
            b = i22 % 128;
            if (i22 % 2 == 0) {
                objC = this.u.c(obj2);
                int i23 = 95 / 0;
            } else {
                objC = this.u.c(obj2);
            }
            int i24 = b + 123;
            a = i24 % 128;
            int i25 = i24 % 2;
            this.u.b(objC, objO);
            int i26 = a;
            int i27 = i26 & 79;
            int i28 = ((i26 ^ 79) | i27) << 1;
            int i29 = -((i26 | 79) & (~i27));
            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
            b = i30 % 128;
            if (i30 % 2 == 0) {
                ar.h.s(obj, jL, objC);
                int i31 = 53 / 0;
            } else {
                ar.h.s(obj, jL, objC);
            }
            objO = objC;
        }
        Map<?, ?> mapA = this.u.a(objO);
        X x = this.u;
        int i32 = a;
        int i33 = i32 & 73;
        int i34 = (i32 | 73) & (~i33);
        int i35 = i33 << 1;
        int i36 = (i34 ^ i35) + ((i34 & i35) << 1);
        b = i36 % 128;
        int i37 = i36 % 2;
        x.n(obj2);
        agVar.r(mapA, null, j);
        int i38 = b;
        int i39 = (((i38 ^ 35) | (i38 & 35)) << 1) - (((~i38) & 35) | (i38 & (-36)));
        a = i39 % 128;
        if (i39 % 2 != 0) {
            int i40 = 34 / 0;
        }
    }

    public static Field u(Class<?> cls, String str) {
        Field field;
        String name;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 29;
        int i4 = (i2 ^ 29) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        Object obj = null;
        try {
            Field declaredField = cls.getDeclaredField(str);
            int i7 = b + 53;
            a = i7 % 128;
            if (i7 % 2 == 0) {
                return declaredField;
            }
            obj.hashCode();
            throw null;
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            int length = declaredFields.length;
            int i8 = 0;
            while (i8 < length) {
                int i9 = a;
                int i10 = (i9 & (-74)) | ((~i9) & 73);
                int i11 = (73 & i9) << 1;
                int i12 = (i10 & i11) + (i11 | i10);
                b = i12 % 128;
                if (i12 % 2 == 0) {
                    field = declaredFields[i8];
                    name = field.getName();
                    int i13 = 92 / 0;
                } else {
                    field = declaredFields[i8];
                    name = field.getName();
                }
                if (str.equals(name)) {
                    int i14 = b;
                    int i15 = ((i14 | 111) << 1) - (i14 ^ 111);
                    a = i15 % 128;
                    if (i15 % 2 == 0) {
                        return field;
                    }
                    throw null;
                }
                i8 = ((i8 | 1) << 1) - (i8 ^ 1);
                int i16 = a;
                int i17 = (i16 ^ 37) + ((i16 & 37) << 1);
                b = i17 % 128;
                int i18 = i17 % 2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Field ");
            int i19 = b;
            int i20 = i19 & 23;
            int i21 = i20 + ((i19 ^ 23) | i20);
            a = i21 % 128;
            if (i21 % 2 != 0) {
                sb.append(str);
                sb.append(" for ");
                int i22 = 57 / 0;
            } else {
                sb.append(str);
                sb.append(" for ");
            }
            int i23 = b;
            int i24 = ((i23 ^ 73) | (i23 & 73)) << 1;
            int i25 = -(((~i23) & 73) | (i23 & (-74)));
            int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
            a = i26 % 128;
            int i27 = i26 % 2;
            sb.append(cls.getName());
            int i28 = b;
            int i29 = i28 ^ 101;
            int i30 = -(-((i28 & 101) << 1));
            int i31 = (i29 & i30) + (i30 | i29);
            a = i31 % 128;
            if (i31 % 2 != 0) {
                sb.append(" not found. Known fields are ");
                sb.append(Arrays.toString(declaredFields));
                throw null;
            }
            sb.append(" not found. Known fields are ");
            sb.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sb.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        if (P(r13, r1, r14) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        r12 = ivas.gov.bisp.enumeration.aD.ad.b + 69;
        ivas.gov.bisp.enumeration.aD.ad.a = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if ((r12 % 2) == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        r5 = 83 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        r6 = ivas.gov.bisp.enumeration.aD.ar.o(r12, r2);
        r13 = ivas.gov.bisp.enumeration.aD.ar.o(r13, r2);
        r7 = ivas.gov.bisp.enumeration.aD.ad.a;
        r8 = ((r7 ^ 83) | (r7 & 83)) << 1;
        r5 = -((83 & (~r7)) | (r7 & (-84)));
        r9 = ((r8 | r5) << 1) - (r5 ^ r8);
        ivas.gov.bisp.enumeration.aD.ad.b = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0086, code lost:
    
        if (r6 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:
    
        r5 = r7 & 27;
        r8 = -(-(r7 | 27));
        r9 = (r5 ^ r8) + ((r5 & r8) << 1);
        ivas.gov.bisp.enumeration.aD.ad.b = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
    
        if (r13 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009a, code lost:
    
        r7 = r7 + 115;
        ivas.gov.bisp.enumeration.aD.ad.b = r7 % 128;
        r7 = r7 % 2;
        ivas.gov.bisp.enumeration.aD.ar.h.s(r12, r2, ivas.gov.bisp.enumeration.aD.R.d(r6, r13));
        r13 = ivas.gov.bisp.enumeration.aD.ad.a;
        r13 = (-2) - ((((r13 | 124) << 1) - (r13 ^ 124)) ^ (-1));
        ivas.gov.bisp.enumeration.aD.ad.b = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bb, code lost:
    
        if ((r13 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bd, code lost:
    
        af(r12, r1, r14);
        r12 = 85 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c5, code lost:
    
        af(r12, r1, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c9, code lost:
    
        if (r13 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cb, code lost:
    
        r5 = (r7 & (-14)) | ((~r7) & 13);
        r6 = (r7 & 13) << 1;
        r7 = (r5 & r6) + (r5 | r6);
        ivas.gov.bisp.enumeration.aD.ad.b = r7 % 128;
        r7 = r7 % 2;
        ivas.gov.bisp.enumeration.aD.ar.h.s(r12, r2, r13);
        r13 = ivas.gov.bisp.enumeration.aD.ad.b;
        r2 = ((r13 | 35) << 1) - (r13 ^ 35);
        ivas.gov.bisp.enumeration.aD.ad.a = r2 % 128;
        r2 = r2 % 2;
        af(r12, r1, r14);
        r12 = ivas.gov.bisp.enumeration.aD.ad.b;
        r13 = r12 & 77;
        r12 = (((r12 | 77) & (~r13)) - (~(r13 << 1))) - 1;
        ivas.gov.bisp.enumeration.aD.ad.a = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0103, code lost:
    
        if ((r12 % 2) == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0105, code lost:
    
        r12 = 5 / 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0108, code lost:
    
        r12 = ivas.gov.bisp.enumeration.aD.ad.a;
        r13 = (r12 & 109) + (r12 | 109);
        ivas.gov.bisp.enumeration.aD.ad.b = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0114, code lost:
    
        if ((r13 % 2) == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0116, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0117, code lost:
    
        r12 = null;
        r12.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x011b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004f, code lost:
    
        if (P(r13, r1, r14) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S(T r12, T r13, int r14) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.ad.S(java.lang.Object, java.lang.Object, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0051  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bd, code lost:
    
        if (r9 <= (r11 * r8)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ce, code lost:
    
        if (r9 <= ((((r11 ^ r8) | (r11 & r8)) << 1) - ((r8 & (~r11)) | ((~r8) & r11)))) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d0, code lost:
    
        java.util.Objects.requireNonNull(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d3, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <K, V> int V(T r8, byte[] r9, int r10, int r11, int r12, long r13, ivas.gov.bisp.enumeration.aD.C0049e.biK r15) throws ivas.gov.bisp.enumeration.aD.C0065v {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.ad.V(java.lang.Object, byte[], int, int, int, long, ivas.gov.bisp.enumeration.aD.e$biK):int");
    }

    /* JADX WARN: Code duplicated, block: B:155:0x0643 A[PHI: r4
  0x0643: PHI (r4v109 int) = 
  (r4v0 int)
  (r4v0 int)
  (r4v0 int)
  (r4v0 int)
  (r4v0 int)
  (r4v0 int)
  (r4v0 int)
  (r4v0 int)
  (r4v0 int)
  (r4v0 int)
  (r4v0 int)
  (r4v76 int)
  (r4v76 int)
  (r4v0 int)
  (r4v0 int)
  (r4v0 int)
  (r4v0 int)
 binds: [B:145:0x05f4, B:132:0x0569, B:125:0x051d, B:118:0x04ca, B:115:0x048f, B:112:0x044b, B:102:0x03e7, B:71:0x0302, B:57:0x0276, B:50:0x024e, B:33:0x01b4, B:46:0x0243, B:41:0x020d, B:26:0x016f, B:19:0x011e, B:5:0x0068, B:4:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0226  */
    /* JADX WARN: Code duplicated, block: B:46:0x0243  */
    /* JADX WARN: Code duplicated, block: B:47:0x0248  */
    public final int W(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C0049e.biK bik) throws C0065v {
        int iW;
        int i9;
        Object object;
        int i10;
        int iV = i;
        int i11 = 2 % 2;
        int i12 = b;
        int i13 = (((i12 | 102) << 1) - (i12 ^ 102)) - 1;
        int i14 = i13 % 128;
        a = i14;
        int i15 = i13 % 2;
        Unsafe unsafe = d;
        int[] iArr = this.f;
        int i16 = (i14 & 29) + (i14 | 29);
        int i17 = i16 % 128;
        b = i17;
        int i18 = i16 % 2;
        int i19 = ((~i8) & 2) | (i8 & (-3));
        int i20 = (i8 & 2) << 1;
        long j2 = iArr[(i19 ^ i20) + ((i19 & i20) << 1)] & 1048575;
        boolean z = false;
        Object object2 = null;
        switch (i7) {
            case IMediaSession.Stub.TRANSACTION_rateWithExtras /* 51 */:
                if (i5 == 1) {
                    int i21 = i14 & 105;
                    int i22 = (~i21) & (i14 | 105);
                    int i23 = i21 << 1;
                    int i24 = (i22 & i23) + (i23 | i22);
                    b = i24 % 128;
                    if (i24 % 2 == 0) {
                        Double.longBitsToDouble(C0049e.e(bArr, i));
                        object2.hashCode();
                        throw null;
                    }
                    unsafe.putObject(t, j, Double.valueOf(Double.longBitsToDouble(C0049e.e(bArr, i))));
                    iW = (-2) - ((((iV | 9) << 1) - (iV ^ 9)) ^ (-1));
                    int i25 = a + 73;
                    b = i25 % 128;
                    if (i25 % 2 == 0) {
                        unsafe.putInt(t, j2, i4);
                        object2.hashCode();
                        throw null;
                    }
                    unsafe.putInt(t, j2, i4);
                } else {
                    iW = iV;
                }
                int i26 = a;
                int i27 = i26 & 117;
                int i28 = ((i26 | 117) & (~i27)) + (i27 << 1);
                b = i28 % 128;
                int i29 = i28 % 2;
                return iW;
            case 52:
                if (i5 == 5) {
                    int i30 = (i14 & (-102)) | ((~i14) & 101);
                    int i31 = (i14 & 101) << 1;
                    int i32 = (i30 ^ i31) + ((i30 & i31) << 1);
                    b = i32 % 128;
                    if (i32 % 2 == 0) {
                        Float.intBitsToFloat(C0049e.d(bArr, i));
                        throw null;
                    }
                    float fIntBitsToFloat = Float.intBitsToFloat(C0049e.d(bArr, i));
                    int i33 = b;
                    int i34 = ((i33 | 59) << 1) - (i33 ^ 59);
                    a = i34 % 128;
                    if (i34 % 2 != 0) {
                        unsafe.putObject(t, j, Float.valueOf(fIntBitsToFloat));
                        int i35 = iV + 86;
                        iW = (((i35 & 42) | ((~i35) & (-43))) - (~((i35 & (-43)) << 1))) - 1;
                    } else {
                        unsafe.putObject(t, j, Float.valueOf(fIntBitsToFloat));
                        iW = (iV & 4) + (iV | 4);
                    }
                    int i36 = b;
                    int i37 = (i36 & (-78)) | ((~i36) & 77);
                    int i38 = (i36 & 77) << 1;
                    int i39 = (i37 & i38) + (i38 | i37);
                    a = i39 % 128;
                    int i40 = i39 % 2;
                    unsafe.putInt(t, j2, i4);
                    int i41 = a;
                    int i42 = i41 | 111;
                    int i43 = (i42 << 1) - ((~(i41 & 111)) & i42);
                    b = i43 % 128;
                    if (i43 % 2 == 0) {
                        int i44 = 3 % 3;
                    }
                } else {
                    iW = iV;
                }
                int i210 = a;
                int i211 = i210 & 117;
                int i212 = ((i210 | 117) & (~i211)) + (i211 << 1);
                b = i212 % 128;
                int i213 = i212 % 2;
                return iW;
            case 53:
            case 54:
                if (i5 == 0) {
                    iW = C0049e.w(bArr, iV, bik);
                    int i45 = b;
                    int i46 = ((i45 & (-76)) | (75 & (~i45))) + ((i45 & 75) << 1);
                    a = i46 % 128;
                    int i47 = i46 % 2;
                    unsafe.putObject(t, j, Long.valueOf(bik.b));
                    int i48 = a;
                    int i49 = ((i48 | 63) << 1) - (i48 ^ 63);
                    b = i49 % 128;
                    if (i49 % 2 == 0) {
                        unsafe.putInt(t, j2, i4);
                        object2.hashCode();
                        throw null;
                    }
                    unsafe.putInt(t, j2, i4);
                    int i50 = a;
                    int i51 = ((i50 & 36) + (i50 | 36)) - 1;
                    b = i51 % 128;
                    int i52 = i51 % 2;
                } else {
                    iW = iV;
                }
                int i214 = a;
                int i215 = i214 & 117;
                int i216 = ((i214 | 117) & (~i215)) + (i215 << 1);
                b = i216 % 128;
                int i217 = i216 % 2;
                return iW;
            case 55:
            case 62:
                if (i5 == 0) {
                    int i53 = (i14 & 15) + (i14 | 15);
                    b = i53 % 128;
                    if (i53 % 2 == 0) {
                        iW = C0049e.v(bArr, iV, bik);
                        int i54 = 45 / 0;
                    } else {
                        iW = C0049e.v(bArr, iV, bik);
                    }
                    int i55 = b;
                    int i56 = (((i55 & (-10)) | ((~i55) & 9)) - (~((i55 & 9) << 1))) - 1;
                    a = i56 % 128;
                    int i57 = i56 % 2;
                    unsafe.putObject(t, j, Integer.valueOf(bik.a));
                    int i58 = a;
                    int i59 = i58 & 125;
                    int i60 = (i58 | 125) & (~i59);
                    int i61 = i59 << 1;
                    int i62 = (i60 ^ i61) + ((i60 & i61) << 1);
                    b = i62 % 128;
                    int i63 = i62 % 2;
                    unsafe.putInt(t, j2, i4);
                } else {
                    iW = iV;
                }
                int i218 = a;
                int i219 = i218 & 117;
                int i2110 = ((i218 | 117) & (~i219)) + (i219 << 1);
                b = i2110 % 128;
                int i2111 = i2110 % 2;
                return iW;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(C0049e.e(bArr, i)));
                    int i64 = a;
                    int i65 = ((i64 & 73) - (~(-(-(i64 | 73))))) - 1;
                    b = i65 % 128;
                    int i66 = i65 % 2;
                    int i67 = (((iV ^ 78) | (iV & 78)) << 1) - (((~iV) & 78) | (iV & (-79)));
                    unsafe.putInt(t, j2, i4);
                    iW = (((i67 | (-69)) << 1) - (i67 ^ (-69))) - 1;
                } else {
                    iW = iV;
                }
                int i2112 = a;
                int i2113 = i2112 & 117;
                int i2114 = ((i2112 | 117) & (~i2113)) + (i2113 << 1);
                b = i2114 % 128;
                int i2115 = i2114 % 2;
                return iW;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(C0049e.d(bArr, i)));
                    int i68 = iV & (-98);
                    int i69 = -(-(iV | (-98)));
                    int i70 = ((i68 | i69) << 1) - (i68 ^ i69);
                    int i71 = i70 & 102;
                    int i72 = ((i70 ^ 102) | i71) << 1;
                    int i73 = -((~i71) & (i70 | 102));
                    iW = ((i72 & i73) << 1) + (i72 ^ i73);
                    unsafe.putInt(t, j2, i4);
                    int i74 = b;
                    int i75 = i74 & 59;
                    int i76 = (i74 ^ 59) | i75;
                    int i77 = (i75 ^ i76) + ((i76 & i75) << 1);
                    a = i77 % 128;
                    int i78 = i77 % 2;
                } else {
                    iW = iV;
                }
                int i2116 = a;
                int i2117 = i2116 & 117;
                int i2118 = ((i2116 | 117) & (~i2117)) + (i2117 << 1);
                b = i2118 % 128;
                int i2119 = i2118 % 2;
                return iW;
            case 58:
                if (i5 == 0) {
                    int i79 = i14 & 57;
                    int i80 = -(-(i14 | 57));
                    int i81 = (i79 ^ i80) + ((i79 & i80) << 1);
                    b = i81 % 128;
                    int i82 = i81 % 2;
                    iW = C0049e.w(bArr, iV, bik);
                    long j3 = bik.b;
                    int i83 = a;
                    int i84 = ((i83 | 77) << 1) - (i83 ^ 77);
                    int i85 = i84 % 128;
                    b = i85;
                    int i86 = i84 % 2;
                    if (j3 != 0) {
                        int i87 = i85 & 39;
                        int i88 = -(-(i85 | 39));
                        int i89 = ((i87 | i88) << 1) - (i87 ^ i88);
                        a = i89 % 128;
                        z = !(i89 % 2 != 0);
                    } else {
                        int i90 = i83 + 118;
                        int i91 = (i90 ^ (-1)) + (i90 << 1);
                        b = i91 % 128;
                        int i92 = i91 % 2;
                    }
                    unsafe.putObject(t, j, Boolean.valueOf(z));
                    unsafe.putInt(t, j2, i4);
                } else {
                    iW = iV;
                }
                int i21110 = a;
                int i21111 = i21110 & 117;
                int i21112 = ((i21110 | 117) & (~i21111)) + (i21111 << 1);
                b = i21112 % 128;
                int i21113 = i21112 % 2;
                return iW;
            case 59:
                if (i5 == 2) {
                    int i93 = i17 & 25;
                    int i94 = i93 + ((i17 ^ 25) | i93);
                    a = i94 % 128;
                    if (i94 % 2 != 0) {
                        C0049e.v(bArr, iV, bik);
                        int i95 = bik.a;
                        throw null;
                    }
                    iW = C0049e.v(bArr, iV, bik);
                    int i96 = bik.a;
                    if (i96 == 0) {
                        int i97 = b;
                        int i98 = i97 & 75;
                        int i99 = (i97 ^ 75) | i98;
                        int i100 = (i98 & i99) + (i99 | i98);
                        a = i100 % 128;
                        if (i100 % 2 != 0) {
                            unsafe.putObject(t, j, BuildConfig.FLAVOR);
                            int i101 = 59 / 0;
                        } else {
                            unsafe.putObject(t, j, BuildConfig.FLAVOR);
                        }
                        int i102 = a;
                        int i103 = i102 & 65;
                        int i104 = (i102 | 65) & (~i103);
                        int i105 = -(-(i103 << 1));
                        int i106 = ((i104 | i105) << 1) - (i104 ^ i105);
                        b = i106 % 128;
                        int i107 = i106 % 2;
                    } else {
                        if ((i6 & 536870912) != 0) {
                            int i108 = b;
                            int i109 = i108 & 123;
                            int i110 = ((i108 ^ 123) | i109) << 1;
                            int i111 = -((i108 | 123) & (~i109));
                            int i112 = (i110 & i111) + (i111 | i110);
                            a = i112 % 128;
                            if (i112 % 2 == 0 ? (!as.f(bArr, iW, (iW - (~(-(-i96)))) - 1)) : !as.f(bArr, iW, (iW - (~(-i96))) - 1)) {
                                throw C0065v.f();
                            }
                        }
                        String str = new String(bArr, iW, i96, R.c);
                        int i113 = b;
                        int i114 = i113 ^ 37;
                        int i115 = (i113 & 37) << 1;
                        int i116 = (i114 & i115) + (i115 | i114);
                        a = i116 % 128;
                        int i117 = i116 % 2;
                        unsafe.putObject(t, j, str);
                        int i118 = b + 13;
                        a = i118 % 128;
                        if (i118 % 2 != 0) {
                            int i119 = -(-i96);
                            i9 = (((~i119) & iW) | ((~iW) & i119)) + ((iW & i119) << 1);
                        } else {
                            i9 = (iW & i96) + (iW | i96);
                        }
                        iW = i9;
                    }
                    unsafe.putInt(t, j2, i4);
                    int i120 = b;
                    int i121 = (-2) - (((i120 & 22) + (i120 | 22)) ^ (-1));
                    a = i121 % 128;
                    int i122 = i121 % 2;
                } else {
                    iW = iV;
                }
                int i21114 = a;
                int i21115 = i21114 & 117;
                int i21116 = ((i21114 | 117) & (~i21115)) + (i21115 << 1);
                b = i21116 % 128;
                int i21117 = i21116 % 2;
                return iW;
            case 60:
                if (i5 == 2) {
                    int i123 = i14 + 102;
                    int i124 = (i123 ^ (-1)) + (i123 << 1);
                    b = i124 % 128;
                    int i125 = i124 % 2;
                    iW = C0049e.h(K(i8), bArr, iV, i2, bik);
                    if (unsafe.getInt(t, j2) == i4) {
                        object = unsafe.getObject(t, j);
                        int i126 = b;
                        int i127 = (-2) - (((i126 & 92) + (i126 | 92)) ^ (-1));
                        a = i127 % 128;
                        int i128 = i127 % 2;
                    } else {
                        int i129 = b;
                        int i130 = i129 & 107;
                        int i131 = -(-((i129 ^ 107) | i130));
                        int i132 = (i130 ^ i131) + ((i131 & i130) << 1);
                        a = i132 % 128;
                        int i133 = i132 % 2;
                        object = null;
                    }
                    if (object == null) {
                        unsafe.putObject(t, j, bik.c);
                    } else {
                        Object objD = R.d(object, bik.c);
                        int i134 = b;
                        int i135 = ((i134 & 105) - (~(i134 | 105))) - 1;
                        a = i135 % 128;
                        if (i135 % 2 != 0) {
                            unsafe.putObject(t, j, objD);
                            throw null;
                        }
                        unsafe.putObject(t, j, objD);
                    }
                    unsafe.putInt(t, j2, i4);
                    int i136 = a;
                    int i137 = i136 & 113;
                    int i138 = -(-((i136 ^ 113) | i137));
                    int i139 = (i137 ^ i138) + ((i138 & i137) << 1);
                    b = i139 % 128;
                    int i140 = i139 % 2;
                } else {
                    iW = iV;
                }
                int i21118 = a;
                int i21119 = i21118 & 117;
                int i211110 = ((i21118 | 117) & (~i21119)) + (i21119 << 1);
                b = i211110 % 128;
                int i211111 = i211110 % 2;
                return iW;
            case 61:
                if (i5 == 2) {
                    int i141 = i14 ^ 113;
                    int i142 = (((i14 & 113) | i141) << 1) - i141;
                    b = i142 % 128;
                    if (i142 % 2 == 0) {
                        C0049e.c(bArr, iV, bik);
                        object2.hashCode();
                        throw null;
                    }
                    iW = C0049e.c(bArr, iV, bik);
                    unsafe.putObject(t, j, bik.c);
                    unsafe.putInt(t, j2, i4);
                } else {
                    iW = iV;
                }
                int i211112 = a;
                int i211113 = i211112 & 117;
                int i211114 = ((i211112 | 117) & (~i211113)) + (i211113 << 1);
                b = i211114 % 128;
                int i211115 = i211114 % 2;
                return iW;
            case 63:
                if (i5 == 0) {
                    iV = C0049e.v(bArr, iV, bik);
                    int i143 = bik.a;
                    int i144 = a + 79;
                    int i145 = i144 % 128;
                    b = i145;
                    int i146 = i144 % 2;
                    R.bkH bkh = (R.bkH) this.g[((i8 / 3) * 2) + 1];
                    int i147 = i145 ^ 5;
                    int i148 = (i145 & 5) << 1;
                    int i149 = ((i147 | i148) << 1) - (i147 ^ i148);
                    int i150 = i149 % 128;
                    a = i150;
                    int i151 = i149 % 2;
                    if (bkh != null) {
                        int i152 = i150 + 46;
                        int i153 = (i152 ^ (-1)) + (i152 << 1);
                        b = i153 % 128;
                        int i154 = i153 % 2;
                        if (bkh.b(i143)) {
                            unsafe.putObject(t, j, Integer.valueOf(i143));
                            int i155 = b;
                            int i156 = i155 ^ 107;
                            int i157 = ((i155 & 107) | i156) << 1;
                            int i158 = -i156;
                            i10 = (i157 ^ i158) + ((i157 & i158) << 1);
                            a = i10 % 128;
                            if (i10 % 2 == 0) {
                                unsafe.putInt(t, j2, i4);
                                throw null;
                            }
                            unsafe.putInt(t, j2, i4);
                        } else {
                            int i159 = a;
                            int i160 = (i159 ^ 50) + ((i159 & 50) << 1);
                            int i161 = (i160 ^ (-1)) + (i160 << 1);
                            b = i161 % 128;
                            if (i161 % 2 == 0) {
                                i(t);
                                Long.valueOf(i143);
                                object2.hashCode();
                                throw null;
                            }
                            i(t).g(i3, Long.valueOf(i143));
                        }
                    } else {
                        unsafe.putObject(t, j, Integer.valueOf(i143));
                        int i1510 = b;
                        int i1511 = i1510 ^ 107;
                        int i1512 = ((i1510 & 107) | i1511) << 1;
                        int i1513 = -i1511;
                        i10 = (i1512 ^ i1513) + ((i1512 & i1513) << 1);
                        a = i10 % 128;
                        if (i10 % 2 == 0) {
                            unsafe.putInt(t, j2, i4);
                            throw null;
                        }
                        unsafe.putInt(t, j2, i4);
                    }
                }
                iW = iV;
                int i211116 = a;
                int i211117 = i211116 & 117;
                int i211118 = ((i211116 | 117) & (~i211117)) + (i211117 << 1);
                b = i211118 % 128;
                int i211119 = i211118 % 2;
                return iW;
            case 66:
                if (i5 == 0) {
                    int i162 = (i17 & 22) + (i17 | 22);
                    int i163 = (i162 ^ (-1)) + (i162 << 1);
                    a = i163 % 128;
                    if (i163 % 2 != 0) {
                        C0049e.v(bArr, iV, bik);
                        throw null;
                    }
                    iW = C0049e.v(bArr, iV, bik);
                    unsafe.putObject(t, j, Integer.valueOf(P.c(bik.a)));
                    unsafe.putInt(t, j2, i4);
                    int i164 = a;
                    int i165 = i164 & 69;
                    int i166 = (i164 | 69) & (~i165);
                    int i167 = -(-(i165 << 1));
                    int i168 = ((i166 | i167) << 1) - (i166 ^ i167);
                    b = i168 % 128;
                    int i169 = i168 % 2;
                } else {
                    iW = iV;
                }
                int i2111110 = a;
                int i2111111 = i2111110 & 117;
                int i2111112 = ((i2111110 | 117) & (~i2111111)) + (i2111111 << 1);
                b = i2111112 % 128;
                int i2111113 = i2111112 % 2;
                return iW;
            case 67:
                if (i5 == 0) {
                    iW = C0049e.w(bArr, iV, bik);
                    int i170 = a;
                    int i171 = i170 & 39;
                    int i172 = (((i170 | 39) & (~i171)) - (~(-(-(i171 << 1))))) - 1;
                    b = i172 % 128;
                    if (i172 % 2 == 0) {
                        unsafe.putObject(t, j, Long.valueOf(P.d(bik.b)));
                        throw null;
                    }
                    unsafe.putObject(t, j, Long.valueOf(P.d(bik.b)));
                    int i173 = b;
                    int i174 = ((i173 & 19) - (~(i173 | 19))) - 1;
                    a = i174 % 128;
                    int i175 = i174 % 2;
                    unsafe.putInt(t, j2, i4);
                } else {
                    iW = iV;
                }
                int i2111114 = a;
                int i2111115 = i2111114 & 117;
                int i2111116 = ((i2111114 | 117) & (~i2111115)) + (i2111115 << 1);
                b = i2111116 % 128;
                int i2111117 = i2111116 % 2;
                return iW;
            case 68:
                if (i5 == 3) {
                    int i176 = i14 & 75;
                    int i177 = (~i176) & (i14 | 75);
                    int i178 = -(-(i176 << 1));
                    int i179 = ((i177 | i178) << 1) - (i178 ^ i177);
                    b = i179 % 128;
                    int i180 = i179 % 2;
                    iW = C0049e.f(K(i8), bArr, i, i2, (i3 & (-8)) | ((~(i3 & (-8))) & 4), bik);
                    if (unsafe.getInt(t, j2) == i4) {
                        int i181 = a;
                        int i182 = i181 ^ 97;
                        int i183 = ((i181 & 97) | i182) << 1;
                        int i184 = -i182;
                        int i185 = ((i183 | i184) << 1) - (i183 ^ i184);
                        b = i185 % 128;
                        if (i185 % 2 == 0) {
                            unsafe.getObject(t, j);
                            throw null;
                        }
                        object2 = unsafe.getObject(t, j);
                        int i186 = a;
                        int i187 = ((((i186 ^ 53) | (i186 & 53)) << 1) - (~(-(((~i186) & 53) | (i186 & (-54)))))) - 1;
                        b = i187 % 128;
                        int i188 = i187 % 2;
                    } else {
                        int i189 = b + 57;
                        a = i189 % 128;
                        int i190 = i189 % 2;
                    }
                    Object obj = object2;
                    if (obj == null) {
                        int i191 = a;
                        int i192 = ((i191 ^ 65) | (i191 & 65)) << 1;
                        int i193 = -(((~i191) & 65) | (i191 & (-66)));
                        int i194 = (i192 & i193) + (i193 | i192);
                        b = i194 % 128;
                        int i195 = i194 % 2;
                        unsafe.putObject(t, j, bik.c);
                    } else {
                        Object objD2 = R.d(obj, bik.c);
                        int i196 = b;
                        int i197 = i196 & 13;
                        int i198 = i197 + ((i196 ^ 13) | i197);
                        a = i198 % 128;
                        int i199 = i198 % 2;
                        unsafe.putObject(t, j, objD2);
                    }
                    unsafe.putInt(t, j2, i4);
                } else {
                    iW = iV;
                }
                int i2111118 = a;
                int i2111119 = i2111118 & 117;
                int i21111110 = ((i2111118 | 117) & (~i2111119)) + (i2111119 << 1);
                b = i21111110 % 128;
                int i21111111 = i21111110 % 2;
                return iW;
            default:
                int i200 = (i17 & 61) + (i17 | 61);
                a = i200 % 128;
                int i201 = i200 % 2;
                iW = iV;
                int i21111112 = a;
                int i21111113 = i21111112 & 117;
                int i21111114 = ((i21111112 | 117) & (~i21111113)) + (i21111113 << 1);
                b = i21111114 % 128;
                int i21111115 = i21111114 % 2;
                return iW;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0340  */
    /* JADX WARN: Code duplicated, block: B:103:0x0347  */
    /* JADX WARN: Code duplicated, block: B:105:0x035c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0368  */
    /* JADX WARN: Code duplicated, block: B:109:0x0376  */
    /* JADX WARN: Code duplicated, block: B:110:0x0391  */
    /* JADX WARN: Code duplicated, block: B:112:0x0397  */
    /* JADX WARN: Code duplicated, block: B:114:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:115:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:118:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:120:0x0416  */
    /* JADX WARN: Code duplicated, block: B:125:0x0425  */
    /* JADX WARN: Code duplicated, block: B:127:0x042b  */
    /* JADX WARN: Code duplicated, block: B:129:0x043d  */
    /* JADX WARN: Code duplicated, block: B:132:0x044c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0458  */
    /* JADX WARN: Code duplicated, block: B:137:0x045e  */
    /* JADX WARN: Code duplicated, block: B:140:0x0478  */
    /* JADX WARN: Code duplicated, block: B:143:0x0481  */
    /* JADX WARN: Code duplicated, block: B:145:0x0491  */
    /* JADX WARN: Code duplicated, block: B:147:0x049d  */
    /* JADX WARN: Code duplicated, block: B:150:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:152:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:155:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:157:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:159:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:161:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:164:0x050f  */
    /* JADX WARN: Code duplicated, block: B:166:0x0515  */
    /* JADX WARN: Code duplicated, block: B:168:0x0528  */
    /* JADX WARN: Code duplicated, block: B:173:0x0540  */
    /* JADX WARN: Code duplicated, block: B:175:0x0546  */
    /* JADX WARN: Code duplicated, block: B:177:0x0559  */
    /* JADX WARN: Code duplicated, block: B:17:0x008b  */
    /* JADX WARN: Code duplicated, block: B:180:0x056f  */
    /* JADX WARN: Code duplicated, block: B:183:0x0583  */
    /* JADX WARN: Code duplicated, block: B:185:0x0589  */
    /* JADX WARN: Code duplicated, block: B:187:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:188:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:196:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:19:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:214:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x05d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:220:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x020b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x026e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:230:0x02b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x041e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x04ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x0508 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x0536 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:260:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x0613 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x0613 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x0613 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x0613 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:280:0x0613 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x0613 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x0613 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x0613 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:0x0613 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:0x0613 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:286:0x0613 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x0613 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x0613 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x0613 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:31:0x0104  */
    /* JADX WARN: Code duplicated, block: B:33:0x0121  */
    /* JADX WARN: Code duplicated, block: B:34:0x0144  */
    /* JADX WARN: Code duplicated, block: B:37:0x017c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0182  */
    /* JADX WARN: Code duplicated, block: B:41:0x019a  */
    /* JADX WARN: Code duplicated, block: B:42:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:45:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:48:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:51:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:54:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:56:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:58:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:61:0x0215  */
    /* JADX WARN: Code duplicated, block: B:63:0x021b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0238  */
    /* JADX WARN: Code duplicated, block: B:68:0x023f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0252  */
    /* JADX WARN: Code duplicated, block: B:72:0x025e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0275  */
    /* JADX WARN: Code duplicated, block: B:77:0x027c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0291  */
    /* JADX WARN: Code duplicated, block: B:81:0x029b  */
    /* JADX WARN: Code duplicated, block: B:83:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:86:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:88:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:90:0x02df  */
    /* JADX WARN: Code duplicated, block: B:91:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:93:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:95:0x0313  */
    /* JADX WARN: Code duplicated, block: B:98:0x0321  */
    public final boolean a(T t, T t2) {
        int i;
        int i2;
        long jDoubleToLongBits;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Object objO;
        Object objO2;
        int i8;
        Object objO3;
        Object objO4;
        int i9;
        Object objO5;
        Object objO6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Object objO7;
        Object objO8;
        int i16;
        boolean zD;
        boolean zD2;
        long j;
        int i17;
        int i18;
        boolean z;
        int i19;
        Object objO9;
        Object objO10;
        int i20 = 2 % 2;
        int i21 = a;
        int i22 = i21 & 89;
        int i23 = ((i21 ^ 89) | i22) << 1;
        int i24 = -((i21 | 89) & (~i22));
        int i25 = (i23 & i24) + (i24 | i23);
        b = i25 % 128;
        int i26 = i25 % 2;
        int length = this.f.length;
        int i27 = 0;
        while (true) {
            Object obj = null;
            if (i27 >= length) {
                Object objJ = this.s.j(t);
                Object objJ2 = this.s.j(t2);
                int i28 = b;
                int i29 = i28 & 9;
                int i30 = (i29 - (~(-(-((i28 ^ 9) | i29))))) - 1;
                a = i30 % 128;
                if (i30 % 2 != 0) {
                    objJ.equals(objJ2);
                    obj.hashCode();
                    throw null;
                }
                if (!objJ.equals(objJ2)) {
                    return false;
                }
                if (!this.j) {
                    return true;
                }
                int i31 = b;
                int i32 = i31 & 55;
                int i33 = i32 + ((i31 ^ 55) | i32);
                a = i33 % 128;
                int i34 = i33 % 2;
                C0056m c0056mF = this.t.f(t);
                o0OoOo0<?> o0oooo0 = this.t;
                int i35 = b;
                int i36 = (i35 | 5) << 1;
                int i37 = -(((~i35) & 5) | (i35 & (-6)));
                int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
                a = i38 % 128;
                if (i38 % 2 == 0) {
                    return c0056mF.equals(o0oooo0.f(t2));
                }
                int i39 = 61 / 0;
                return c0056mF.equals(o0oooo0.f(t2));
            }
            int i40 = b;
            int i41 = ((i40 ^ 120) + ((i40 & 120) << 1)) - 1;
            a = i41 % 128;
            if (i41 % 2 != 0) {
                i = this.f[i27 - 1];
            } else {
                int[] iArr = this.f;
                int i42 = (i27 & (-2)) | ((~i27) & 1);
                int i43 = -(-((i27 & 1) << 1));
                i = iArr[(i42 ^ i43) + ((i42 & i43) << 1)];
            }
            long jL = l(i);
            int i44 = a;
            int i45 = (85 & (~i44)) | (i44 & (-86));
            int i46 = -(-((i44 & 85) << 1));
            int i47 = (i45 ^ i46) + ((i45 & i46) << 1);
            b = i47 % 128;
            if (i47 % 2 == 0) {
                int i48 = 32 / 0;
                switch (v(i)) {
                    case 0:
                        if (G(t, t2, i27)) {
                            int i49 = a;
                            int i50 = i49 & 5;
                            int i51 = (i49 | 5) & (~i50);
                            int i52 = -(-(i50 << 1));
                            i2 = ((i51 | i52) << 1) - (i51 ^ i52);
                            b = i2 % 128;
                            if (i2 % 2 == 0) {
                                jDoubleToLongBits = Double.doubleToLongBits(ar.l(t, jL));
                                int i53 = 40 / 0;
                            } else {
                                jDoubleToLongBits = Double.doubleToLongBits(ar.l(t, jL));
                            }
                            if (jDoubleToLongBits != Double.doubleToLongBits(ar.l(t2, jL))) {
                                i27 = (i27 | 3) + (i27 & 3);
                                break;
                            }
                        }
                        int i54 = a;
                        int i55 = (((i54 ^ 5) | (i54 & 5)) << 1) - (((~i54) & 5) | (i54 & (-6)));
                        b = i55 % 128;
                        int i56 = i55 % 2;
                        break;
                    case 1:
                        if (G(t, t2, i27)) {
                            int i57 = b;
                            int i58 = (i57 ^ 58) + ((i57 & 58) << 1);
                            i3 = (i58 ^ (-1)) + (i58 << 1);
                            a = i3 % 128;
                            if (i3 % 2 != 0) {
                                int i59 = 0 / 0;
                                if (Float.floatToIntBits(ar.m(t, jL)) == Float.floatToIntBits(ar.m(t2, jL))) {
                                    i27 = (i27 | 3) + (i27 & 3);
                                    break;
                                }
                            } else if (Float.floatToIntBits(ar.m(t, jL)) == Float.floatToIntBits(ar.m(t2, jL))) {
                                i27 = (i27 | 3) + (i27 & 3);
                                break;
                            }
                        }
                        int i510 = a;
                        int i511 = (((i510 ^ 5) | (i510 & 5)) << 1) - (((~i510) & 5) | (i510 & (-6)));
                        b = i511 % 128;
                        int i512 = i511 % 2;
                        break;
                    case 2:
                        if (G(t, t2, i27)) {
                            int i60 = a;
                            i4 = ((i60 | 121) << 1) - (((~i60) & 121) | (i60 & (-122)));
                            b = i4 % 128;
                            if (i4 % 2 != 0) {
                                ar.p(t, jL);
                                ar.p(t2, jL);
                                obj.hashCode();
                                throw null;
                            }
                            if (ar.p(t, jL) == ar.p(t2, jL)) {
                                i27 = (i27 | 3) + (i27 & 3);
                                break;
                            }
                        }
                        int i513 = a;
                        int i514 = (((i513 ^ 5) | (i513 & 5)) << 1) - (((~i513) & 5) | (i513 & (-6)));
                        b = i514 % 128;
                        int i515 = i514 % 2;
                        break;
                    case 3:
                        if (!(!G(t, t2, i27))) {
                            int i61 = a;
                            i5 = (i61 & 1) + (i61 | 1);
                            b = i5 % 128;
                            if (i5 % 2 != 0) {
                                ar.p(t, jL);
                                ar.p(t2, jL);
                                throw null;
                            }
                            if (ar.p(t, jL) == ar.p(t2, jL)) {
                                int i62 = a;
                                int i63 = i62 & 57;
                                int i64 = (i63 - (~(-(-((i62 ^ 57) | i63))))) - 1;
                                b = i64 % 128;
                                int i65 = i64 % 2;
                                i27 = (i27 | 3) + (i27 & 3);
                                break;
                            }
                        }
                        int i516 = a;
                        int i517 = (((i516 ^ 5) | (i516 & 5)) << 1) - (((~i516) & 5) | (i516 & (-6)));
                        b = i517 % 128;
                        int i518 = i517 % 2;
                        break;
                    case 4:
                        if (!(!G(t, t2, i27))) {
                            int i66 = b;
                            int i67 = ((i66 | 75) << 1) - (i66 ^ 75);
                            a = i67 % 128;
                            int i68 = i67 % 2;
                            if (ar.n(t, jL) == ar.n(t2, jL)) {
                                i27 = (i27 | 3) + (i27 & 3);
                                break;
                            }
                        }
                        int i519 = a;
                        int i5110 = (((i519 ^ 5) | (i519 & 5)) << 1) - (((~i519) & 5) | (i519 & (-6)));
                        b = i5110 % 128;
                        int i5111 = i5110 % 2;
                        break;
                    case 5:
                        if (!G(t, t2, i27)) {
                            int i69 = a;
                            i6 = (((i69 | 104) << 1) - (i69 ^ 104)) - 1;
                            b = i6 % 128;
                            if (i6 % 2 != 0) {
                                ar.p(t, jL);
                                ar.p(t2, jL);
                                throw null;
                            }
                            if (ar.p(t, jL) == ar.p(t2, jL)) {
                                int i70 = b;
                                int i71 = (((i70 | 80) << 1) - (i70 ^ 80)) - 1;
                                a = i71 % 128;
                                int i72 = i71 % 2;
                                i27 = (i27 | 3) + (i27 & 3);
                                break;
                            }
                        }
                        int i5112 = a;
                        int i5113 = (((i5112 ^ 5) | (i5112 & 5)) << 1) - (((~i5112) & 5) | (i5112 & (-6)));
                        b = i5113 % 128;
                        int i5114 = i5113 % 2;
                        break;
                    case 6:
                        if (G(t, t2, i27)) {
                            int i73 = b;
                            int i74 = ((i73 & 11) - (~(i73 | 11))) - 1;
                            a = i74 % 128;
                            int i75 = i74 % 2;
                            if (ar.n(t, jL) == ar.n(t2, jL)) {
                                i27 = (i27 | 3) + (i27 & 3);
                                break;
                            }
                        }
                        int i5115 = a;
                        int i5116 = (((i5115 ^ 5) | (i5115 & 5)) << 1) - (((~i5115) & 5) | (i5115 & (-6)));
                        b = i5116 % 128;
                        int i5117 = i5116 % 2;
                        break;
                    case 7:
                        if (G(t, t2, i27)) {
                            int i76 = b;
                            int i77 = i76 & 53;
                            int i78 = i76 | 53;
                            i7 = (i77 ^ i78) + ((i78 & i77) << 1);
                            a = i7 % 128;
                            if (i7 % 2 != 0) {
                                int i79 = 55 / 0;
                                if (ar.h(t, jL) == ar.h(t2, jL)) {
                                    i27 = (i27 | 3) + (i27 & 3);
                                    break;
                                }
                            } else if (ar.h(t, jL) == ar.h(t2, jL)) {
                                i27 = (i27 | 3) + (i27 & 3);
                                break;
                            }
                        }
                        int i5118 = a;
                        int i5119 = (((i5118 ^ 5) | (i5118 & 5)) << 1) - (((~i5118) & 5) | (i5118 & (-6)));
                        b = i5119 % 128;
                        int i51110 = i5119 % 2;
                        break;
                    case 8:
                        if (!G(t, t2, i27)) {
                            int i80 = a;
                            int i81 = (-2) - (((i80 ^ 68) + ((i80 & 68) << 1)) ^ (-1));
                            b = i81 % 128;
                            int i82 = i81 % 2;
                            objO = ar.o(t, jL);
                            objO2 = ar.o(t2, jL);
                            int i83 = b;
                            int i84 = i83 ^ 115;
                            int i85 = -(-((115 & i83) << 1));
                            i8 = (i84 ^ i85) + ((i85 & i84) << 1);
                            a = i8 % 128;
                            if (i8 % 2 == 0) {
                                ak.D(objO, objO2);
                                obj.hashCode();
                                throw null;
                            }
                            if (ak.D(objO, objO2)) {
                                i27 = (i27 | 3) + (i27 & 3);
                                break;
                            }
                        }
                        int i51111 = a;
                        int i51112 = (((i51111 ^ 5) | (i51111 & 5)) << 1) - (((~i51111) & 5) | (i51111 & (-6)));
                        b = i51112 % 128;
                        int i51113 = i51112 % 2;
                        break;
                    case 9:
                        if (G(t, t2, i27)) {
                            int i86 = b;
                            int i87 = i86 ^ 113;
                            int i88 = -(-((i86 & 113) << 1));
                            int i89 = ((i87 | i88) << 1) - (i88 ^ i87);
                            a = i89 % 128;
                            int i90 = i89 % 2;
                            objO3 = ar.o(t, jL);
                            objO4 = ar.o(t2, jL);
                            int i91 = b;
                            int i92 = i91 & 103;
                            int i93 = -(-((i91 ^ 103) | i92));
                            int i94 = (i92 ^ i93) + ((i93 & i92) << 1);
                            a = i94 % 128;
                            int i95 = i94 % 2;
                            if (ak.D(objO3, objO4)) {
                                int i96 = b;
                                int i97 = i96 & 59;
                                int i98 = -(-((i96 ^ 59) | i97));
                                int i99 = ((i97 | i98) << 1) - (i98 ^ i97);
                                a = i99 % 128;
                                int i100 = i99 % 2;
                                i27 = (i27 | 3) + (i27 & 3);
                                break;
                            }
                        }
                        int i51114 = a;
                        int i51115 = (((i51114 ^ 5) | (i51114 & 5)) << 1) - (((~i51114) & 5) | (i51114 & (-6)));
                        b = i51115 % 128;
                        int i51116 = i51115 % 2;
                        break;
                    case 10:
                        if (!(!G(t, t2, i27))) {
                            int i101 = a;
                            int i102 = i101 & 63;
                            int i103 = -(-((i101 ^ 63) | i102));
                            i9 = (i102 ^ i103) + ((i103 & i102) << 1);
                            b = i9 % 128;
                            if (i9 % 2 == 0) {
                                objO5 = ar.o(t, jL);
                                objO6 = ar.o(t2, jL);
                                int i104 = 24 / 0;
                            } else {
                                objO5 = ar.o(t, jL);
                                objO6 = ar.o(t2, jL);
                            }
                            if (ak.D(objO5, objO6)) {
                                int i105 = b;
                                int i106 = ((i105 ^ 67) | (i105 & 67)) << 1;
                                int i107 = -(((~i105) & 67) | (i105 & (-68)));
                                int i108 = (i106 ^ i107) + ((i107 & i106) << 1);
                                a = i108 % 128;
                                int i109 = i108 % 2;
                                i27 = (i27 | 3) + (i27 & 3);
                                break;
                            }
                        }
                        int i51117 = a;
                        int i51118 = (((i51117 ^ 5) | (i51117 & 5)) << 1) - (((~i51117) & 5) | (i51117 & (-6)));
                        b = i51118 % 128;
                        int i51119 = i51118 % 2;
                        break;
                    case 11:
                        if (G(t, t2, i27)) {
                            int i110 = b;
                            i10 = (((i110 & (-4)) | ((~i110) & 3)) - (~((i110 & 3) << 1))) - 1;
                            a = i10 % 128;
                            if (i10 % 2 != 0) {
                                if (ar.n(t, jL) != ar.n(t2, jL)) {
                                }
                                int i111 = b;
                                int i112 = (((i111 & (-116)) | ((~i111) & 115)) - (~(-(-((i111 & 115) << 1))))) - 1;
                                a = i112 % 128;
                                int i113 = i112 % 2;
                                i27 = (i27 | 3) + (i27 & 3);
                            } else {
                                int i114 = 39 / 0;
                                if (ar.n(t, jL) != ar.n(t2, jL)) {
                                }
                                int i115 = b;
                                int i116 = (((i115 & (-116)) | ((~i115) & 115)) - (~(-(-((i115 & 115) << 1))))) - 1;
                                a = i116 % 128;
                                int i117 = i116 % 2;
                                i27 = (i27 | 3) + (i27 & 3);
                            }
                            break;
                        }
                        int i511110 = a;
                        int i511111 = (((i511110 ^ 5) | (i511110 & 5)) << 1) - (((~i511110) & 5) | (i511110 & (-6)));
                        b = i511111 % 128;
                        int i511112 = i511111 % 2;
                        break;
                    case 12:
                        if (G(t, t2, i27)) {
                            int i118 = b;
                            int i119 = (i118 & 82) + (i118 | 82);
                            int i120 = (i119 ^ (-1)) + (i119 << 1);
                            a = i120 % 128;
                            int i121 = i120 % 2;
                            if (ar.n(t, jL) == ar.n(t2, jL)) {
                                int i122 = b;
                                int i123 = i122 & 113;
                                int i124 = ((i122 ^ 113) | i123) << 1;
                                int i125 = -((i122 | 113) & (~i123));
                                int i126 = (i124 ^ i125) + ((i125 & i124) << 1);
                                a = i126 % 128;
                                int i127 = i126 % 2;
                                i27 = (i27 | 3) + (i27 & 3);
                                break;
                            }
                        }
                        int i511113 = a;
                        int i511114 = (((i511113 ^ 5) | (i511113 & 5)) << 1) - (((~i511113) & 5) | (i511113 & (-6)));
                        b = i511114 % 128;
                        int i511115 = i511114 % 2;
                        break;
                    case 13:
                        if (!(!G(t, t2, i27))) {
                            int i128 = b;
                            int i129 = i128 ^ 19;
                            int i130 = -(-((i128 & 19) << 1));
                            i11 = (i129 ^ i130) + ((i130 & i129) << 1);
                            a = i11 % 128;
                            if (i11 % 2 == 0) {
                                ar.n(t, jL);
                                ar.n(t2, jL);
                                obj.hashCode();
                                throw null;
                            }
                            if (ar.n(t, jL) == ar.n(t2, jL)) {
                                int i131 = a;
                                i12 = (((i131 & (-70)) | ((~i131) & 69)) - (~((i131 & 69) << 1))) - 1;
                                b = i12 % 128;
                                if (i12 % 2 == 0) {
                                    int i132 = 3 / 5;
                                }
                                i27 = (i27 | 3) + (i27 & 3);
                                break;
                            }
                        }
                        int i511116 = a;
                        int i511117 = (((i511116 ^ 5) | (i511116 & 5)) << 1) - (((~i511116) & 5) | (i511116 & (-6)));
                        b = i511117 % 128;
                        int i511118 = i511117 % 2;
                        break;
                    case IMediaSession.Stub.TRANSACTION_playFromMediaId /* 14 */:
                        if (!(!G(t, t2, i27))) {
                            int i133 = a;
                            i13 = (-2) - (((i133 ^ 26) + ((i133 & 26) << 1)) ^ (-1));
                            b = i13 % 128;
                            if (i13 % 2 != 0) {
                                ar.p(t, jL);
                                ar.p(t2, jL);
                                throw null;
                            }
                            if (ar.p(t, jL) == ar.p(t2, jL)) {
                                int i134 = a;
                                int i135 = ((i134 & 18) + (i134 | 18)) - 1;
                                b = i135 % 128;
                                int i136 = i135 % 2;
                                i27 = (i27 | 3) + (i27 & 3);
                                break;
                            }
                        }
                        int i511119 = a;
                        int i5111110 = (((i511119 ^ 5) | (i511119 & 5)) << 1) - (((~i511119) & 5) | (i511119 & (-6)));
                        b = i5111110 % 128;
                        int i5111111 = i5111110 % 2;
                        break;
                    case IMediaSession.Stub.TRANSACTION_playFromSearch /* 15 */:
                        if (G(t, t2, i27)) {
                            int i137 = a;
                            int i138 = i137 & 61;
                            int i139 = -(-((61 ^ i137) | i138));
                            int i140 = (i138 & i139) + (i139 | i138);
                            b = i140 % 128;
                            int i141 = i140 % 2;
                            if (ar.n(t, jL) == ar.n(t2, jL)) {
                                i27 = (i27 | 3) + (i27 & 3);
                                break;
                            }
                        }
                        int i5111112 = a;
                        int i5111113 = (((i5111112 ^ 5) | (i5111112 & 5)) << 1) - (((~i5111112) & 5) | (i5111112 & (-6)));
                        b = i5111113 % 128;
                        int i5111114 = i5111113 % 2;
                        break;
                    case 16:
                        if (!G(t, t2, i27)) {
                            i14 = b + 51;
                            a = i14 % 128;
                            if (i14 % 2 == 0) {
                                ar.p(t, jL);
                                ar.p(t2, jL);
                                obj.hashCode();
                                throw null;
                            }
                            if (ar.p(t, jL) == ar.p(t2, jL)) {
                                int i142 = a;
                                int i143 = i142 | 67;
                                int i144 = i143 << 1;
                                int i145 = -((~(i142 & 67)) & i143);
                                int i146 = ((i144 | i145) << 1) - (i145 ^ i144);
                                b = i146 % 128;
                                int i147 = i146 % 2;
                                i27 = (i27 | 3) + (i27 & 3);
                                break;
                            }
                        }
                        int i5111115 = a;
                        int i5111116 = (((i5111115 ^ 5) | (i5111115 & 5)) << 1) - (((~i5111115) & 5) | (i5111115 & (-6)));
                        b = i5111116 % 128;
                        int i5111117 = i5111116 % 2;
                        break;
                    case IMediaSession.Stub.TRANSACTION_skipToQueueItem /* 17 */:
                        if (G(t, t2, i27)) {
                            int i148 = a;
                            int i149 = (i148 & (-98)) | ((~i148) & 97);
                            int i150 = -(-((i148 & 97) << 1));
                            i15 = (i149 & i150) + (i150 | i149);
                            b = i15 % 128;
                            if (i15 % 2 == 0) {
                                objO7 = ar.o(t, jL);
                                objO8 = ar.o(t2, jL);
                                int i151 = 43 / 0;
                            } else {
                                objO7 = ar.o(t, jL);
                                objO8 = ar.o(t2, jL);
                            }
                            int i152 = b;
                            int i153 = i152 & 27;
                            int i154 = (i152 ^ 27) | i153;
                            i16 = (i153 ^ i154) + ((i154 & i153) << 1);
                            a = i16 % 128;
                            if (i16 % 2 != 0) {
                                zD = ak.D(objO7, objO8);
                                int i155 = 84 / 0;
                                if (zD) {
                                    i27 = (i27 | 3) + (i27 & 3);
                                    break;
                                }
                            } else if (ak.D(objO7, objO8)) {
                                i27 = (i27 | 3) + (i27 & 3);
                                break;
                            }
                        }
                        int i5111118 = a;
                        int i5111119 = (((i5111118 ^ 5) | (i5111118 & 5)) << 1) - (((~i5111118) & 5) | (i5111118 & (-6)));
                        b = i5111119 % 128;
                        int i51111110 = i5111119 % 2;
                        break;
                    case IMediaSession.Stub.TRANSACTION_pause /* 18 */:
                    case IMediaSession.Stub.TRANSACTION_stop /* 19 */:
                    case IMediaSession.Stub.TRANSACTION_next /* 20 */:
                    case IMediaSession.Stub.TRANSACTION_previous /* 21 */:
                    case IMediaSession.Stub.TRANSACTION_fastForward /* 22 */:
                    case IMediaSession.Stub.TRANSACTION_rewind /* 23 */:
                    case IMediaSession.Stub.TRANSACTION_seekTo /* 24 */:
                    case IMediaSession.Stub.TRANSACTION_rate /* 25 */:
                    case IMediaSession.Stub.TRANSACTION_sendCustomAction /* 26 */:
                    case IMediaSession.Stub.TRANSACTION_getMetadata /* 27 */:
                    case IMediaSession.Stub.TRANSACTION_getPlaybackState /* 28 */:
                    case IMediaSession.Stub.TRANSACTION_getQueue /* 29 */:
                    case IMediaSession.Stub.TRANSACTION_getQueueTitle /* 30 */:
                    case IMediaSession.Stub.TRANSACTION_getExtras /* 31 */:
                    case IMediaSession.Stub.TRANSACTION_getRatingType /* 32 */:
                    case IMediaSession.Stub.TRANSACTION_prepare /* 33 */:
                    case IMediaSession.Stub.TRANSACTION_prepareFromMediaId /* 34 */:
                    case IMediaSession.Stub.TRANSACTION_prepareFromSearch /* 35 */:
                    case IMediaSession.Stub.TRANSACTION_prepareFromUri /* 36 */:
                    case IMediaSession.Stub.TRANSACTION_getRepeatMode /* 37 */:
                    case IMediaSession.Stub.TRANSACTION_isShuffleModeEnabledRemoved /* 38 */:
                    case IMediaSession.Stub.TRANSACTION_setRepeatMode /* 39 */:
                    case IMediaSession.Stub.TRANSACTION_setShuffleModeEnabledRemoved /* 40 */:
                    case IMediaSession.Stub.TRANSACTION_addQueueItem /* 41 */:
                    case IMediaSession.Stub.TRANSACTION_addQueueItemAt /* 42 */:
                    case IMediaSession.Stub.TRANSACTION_removeQueueItem /* 43 */:
                    case IMediaSession.Stub.TRANSACTION_removeQueueItemAt /* 44 */:
                    case IMediaSession.Stub.TRANSACTION_isCaptioningEnabled /* 45 */:
                    case IMediaSession.Stub.TRANSACTION_setCaptioningEnabled /* 46 */:
                    case IMediaSession.Stub.TRANSACTION_getShuffleMode /* 47 */:
                    case IMediaSession.Stub.TRANSACTION_setShuffleMode /* 48 */:
                    case 49:
                        Object objO11 = ar.o(t, jL);
                        Object objO12 = ar.o(t2, jL);
                        int i156 = a;
                        int i157 = i156 & 119;
                        int i158 = (((i156 | 119) & (~i157)) - (~(-(-(i157 << 1))))) - 1;
                        b = i158 % 128;
                        int i159 = i158 % 2;
                        zD2 = ak.D(objO11, objO12);
                        int i160 = a;
                        int i161 = (((i160 & (-40)) | ((~i160) & 39)) - (~(-(-((i160 & 39) << 1))))) - 1;
                        b = i161 % 128;
                        int i162 = i161 % 2;
                        if (!zD2) {
                            i27 = (i27 | 3) + (i27 & 3);
                        }
                        break;
                    case 50:
                        Object objO13 = ar.o(t, jL);
                        Object objO14 = ar.o(t2, jL);
                        int i163 = a + 117;
                        b = i163 % 128;
                        int i164 = i163 % 2;
                        zD2 = ak.D(objO13, objO14);
                        int i165 = a;
                        int i166 = i165 & 3;
                        int i167 = i166 + ((i165 ^ 3) | i166);
                        b = i167 % 128;
                        int i168 = i167 % 2;
                        if (!zD2) {
                            i27 = (i27 | 3) + (i27 & 3);
                        }
                        break;
                    case IMediaSession.Stub.TRANSACTION_rateWithExtras /* 51 */:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        j = this.f[(i27 & 2) + (i27 | 2)] & 1048575;
                        int i169 = a;
                        int i170 = ((i169 & 22) + (i169 | 22)) - 1;
                        b = i170 % 128;
                        int i171 = i170 % 2;
                        if (ar.n(t, j) == ar.n(t2, j)) {
                            int i172 = b;
                            int i173 = (i172 & (-20)) | ((~i172) & 19);
                            int i174 = -(-((i172 & 19) << 1));
                            i17 = (i173 & i174) + (i174 | i173);
                            i18 = i17 % 128;
                            a = i18;
                            if (i17 % 2 != 0) {
                                z = false;
                            } else {
                                z = true;
                            }
                            int i175 = i18 & 81;
                            int i176 = (i175 - (~(-(-((i18 ^ 81) | i175))))) - 1;
                            b = i176 % 128;
                            int i177 = i176 % 2;
                            if (z) {
                                int i178 = i18 & 103;
                                i19 = (i178 - (~((i18 ^ 103) | i178))) - 1;
                                b = i19 % 128;
                                if (i19 % 2 == 0) {
                                    objO9 = ar.o(t, jL);
                                    objO10 = ar.o(t2, jL);
                                    int i179 = 5 / 0;
                                } else {
                                    objO9 = ar.o(t, jL);
                                    objO10 = ar.o(t2, jL);
                                }
                                if (ak.D(objO9, objO10)) {
                                    int i180 = b;
                                    int i181 = i180 & 59;
                                    int i182 = (i180 ^ 59) | i181;
                                    int i183 = (i181 & i182) + (i182 | i181);
                                    a = i183 % 128;
                                    int i184 = i183 % 2;
                                    i27 = (i27 | 3) + (i27 & 3);
                                    break;
                                }
                            }
                        } else {
                            int i185 = a + 113;
                            b = i185 % 128;
                            int i186 = i185 % 2;
                        }
                        int i51111111 = a;
                        int i51111112 = (((i51111111 ^ 5) | (i51111111 & 5)) << 1) - (((~i51111111) & 5) | (i51111111 & (-6)));
                        b = i51111112 % 128;
                        int i51111113 = i51111112 % 2;
                        break;
                    default:
                        int i187 = b;
                        int i188 = (i187 & (-62)) | ((~i187) & 61);
                        int i189 = -(-((61 & i187) << 1));
                        int i190 = ((i188 | i189) << 1) - (i189 ^ i188);
                        a = i190 % 128;
                        int i191 = i190 % 2;
                        i27 = (i27 | 3) + (i27 & 3);
                        break;
                }
            } else {
                switch (v(i)) {
                    case 0:
                        if (G(t, t2, i27)) {
                            int i410 = a;
                            int i520 = i410 & 5;
                            int i521 = (i410 | 5) & (~i520);
                            int i522 = -(-(i520 << 1));
                            i2 = ((i521 | i522) << 1) - (i521 ^ i522);
                            b = i2 % 128;
                            if (i2 % 2 == 0) {
                                jDoubleToLongBits = Double.doubleToLongBits(ar.l(t, jL));
                                int i523 = 40 / 0;
                            } else {
                                jDoubleToLongBits = Double.doubleToLongBits(ar.l(t, jL));
                            }
                            if (jDoubleToLongBits != Double.doubleToLongBits(ar.l(t2, jL))) {
                                i27 = (i27 | 3) + (i27 & 3);
                                break;
                            }
                        }
                        int i51111114 = a;
                        int i51111115 = (((i51111114 ^ 5) | (i51111114 & 5)) << 1) - (((~i51111114) & 5) | (i51111114 & (-6)));
                        b = i51111115 % 128;
                        int i51111116 = i51111115 % 2;
                        break;
                    case 1:
                        if (G(t, t2, i27)) {
                            int i524 = b;
                            int i525 = (i524 ^ 58) + ((i524 & 58) << 1);
                            i3 = (i525 ^ (-1)) + (i525 << 1);
                            a = i3 % 128;
                            if (i3 % 2 != 0) {
                                int i526 = 0 / 0;
                                if (Float.floatToIntBits(ar.m(t, jL)) == Float.floatToIntBits(ar.m(t2, jL))) {
                                    i27 = (i27 | 3) + (i27 & 3);
                                    break;
                                }
                            } else if (Float.floatToIntBits(ar.m(t, jL)) == Float.floatToIntBits(ar.m(t2, jL))) {
                                i27 = (i27 | 3) + (i27 & 3);
                                break;
                            }
                        }
                        int i51111117 = a;
                        int i51111118 = (((i51111117 ^ 5) | (i51111117 & 5)) << 1) - (((~i51111117) & 5) | (i51111117 & (-6)));
                        b = i51111118 % 128;
                        int i51111119 = i51111118 % 2;
                        break;
                    case 2:
                        if (G(t, t2, i27)) {
                            int i610 = a;
                            i4 = ((i610 | 121) << 1) - (((~i610) & 121) | (i610 & (-122)));
                            b = i4 % 128;
                            if (i4 % 2 != 0) {
                                ar.p(t, jL);
                                ar.p(t2, jL);
                                obj.hashCode();
                                throw null;
                            }
                            if (ar.p(t, jL) == ar.p(t2, jL)) {
                                i27 = (i27 | 3) + (i27 & 3);
                                break;
                            }
                        }
                        int i511111110 = a;
                        int i511111111 = (((i511111110 ^ 5) | (i511111110 & 5)) << 1) - (((~i511111110) & 5) | (i511111110 & (-6)));
                        b = i511111111 % 128;
                        int i511111112 = i511111111 % 2;
                        break;
                    case 3:
                        if (!(!G(t, t2, i27))) {
                            int i611 = a;
                            i5 = (i611 & 1) + (i611 | 1);
                            b = i5 % 128;
                            if (i5 % 2 != 0) {
                                ar.p(t, jL);
                                ar.p(t2, jL);
                                throw null;
                            }
                            if (ar.p(t, jL) == ar.p(t2, jL)) {
                                int i612 = a;
                                int i613 = i612 & 57;
                                int i614 = (i613 - (~(-(-((i612 ^ 57) | i613))))) - 1;
                                b = i614 % 128;
                                int i615 = i614 % 2;
                                i27 = (i27 | 3) + (i27 & 3);
                                break;
                            }
                        }
                        int i511111113 = a;
                        int i511111114 = (((i511111113 ^ 5) | (i511111113 & 5)) << 1) - (((~i511111113) & 5) | (i511111113 & (-6)));
                        b = i511111114 % 128;
                        int i511111115 = i511111114 % 2;
                        break;
                    case 4:
                        if (!(!G(t, t2, i27))) {
                            int i616 = b;
                            int i617 = ((i616 | 75) << 1) - (i616 ^ 75);
                            a = i617 % 128;
                            int i618 = i617 % 2;
                            if (ar.n(t, jL) == ar.n(t2, jL)) {
                                i27 = (i27 | 3) + (i27 & 3);
                                break;
                            }
                        }
                        int i511111116 = a;
                        int i511111117 = (((i511111116 ^ 5) | (i511111116 & 5)) << 1) - (((~i511111116) & 5) | (i511111116 & (-6)));
                        b = i511111117 % 128;
                        int i511111118 = i511111117 % 2;
                        break;
                    case 5:
                        if (!G(t, t2, i27)) {
                            int i619 = a;
                            i6 = (((i619 | 104) << 1) - (i619 ^ 104)) - 1;
                            b = i6 % 128;
                            if (i6 % 2 != 0) {
                                ar.p(t, jL);
                                ar.p(t2, jL);
                                throw null;
                            }
                            if (ar.p(t, jL) == ar.p(t2, jL)) {
                                int i710 = b;
                                int i711 = (((i710 | 80) << 1) - (i710 ^ 80)) - 1;
                                a = i711 % 128;
                                int i712 = i711 % 2;
                                i27 = (i27 | 3) + (i27 & 3);
                                break;
                            }
                        }
                        int i511111119 = a;
                        int i5111111110 = (((i511111119 ^ 5) | (i511111119 & 5)) << 1) - (((~i511111119) & 5) | (i511111119 & (-6)));
                        b = i5111111110 % 128;
                        int i5111111111 = i5111111110 % 2;
                        break;
                    case 6:
                        if (G(t, t2, i27)) {
                            int i713 = b;
                            int i714 = ((i713 & 11) - (~(i713 | 11))) - 1;
                            a = i714 % 128;
                            int i715 = i714 % 2;
                            if (ar.n(t, jL) == ar.n(t2, jL)) {
                                i27 = (i27 | 3) + (i27 & 3);
                                break;
                            }
                        }
                        int i5111111112 = a;
                        int i5111111113 = (((i5111111112 ^ 5) | (i5111111112 & 5)) << 1) - (((~i5111111112) & 5) | (i5111111112 & (-6)));
                        b = i5111111113 % 128;
                        int i5111111114 = i5111111113 % 2;
                        break;
                    case 7:
                        if (G(t, t2, i27)) {
                            int i716 = b;
                            int i717 = i716 & 53;
                            int i718 = i716 | 53;
                            i7 = (i717 ^ i718) + ((i718 & i717) << 1);
                            a = i7 % 128;
                            if (i7 % 2 != 0) {
                                int i719 = 55 / 0;
                                if (ar.h(t, jL) == ar.h(t2, jL)) {
                                    i27 = (i27 | 3) + (i27 & 3);
                                    break;
                                }
                            } else if (ar.h(t, jL) == ar.h(t2, jL)) {
                                i27 = (i27 | 3) + (i27 & 3);
                                break;
                            }
                        }
                        int i5111111115 = a;
                        int i5111111116 = (((i5111111115 ^ 5) | (i5111111115 & 5)) << 1) - (((~i5111111115) & 5) | (i5111111115 & (-6)));
                        b = i5111111116 % 128;
                        int i5111111117 = i5111111116 % 2;
                        break;
                    case 8:
                        if (!G(t, t2, i27)) {
                            int i810 = a;
                            int i811 = (-2) - (((i810 ^ 68) + ((i810 & 68) << 1)) ^ (-1));
                            b = i811 % 128;
                            int i812 = i811 % 2;
                            objO = ar.o(t, jL);
                            objO2 = ar.o(t2, jL);
                            int i813 = b;
                            int i814 = i813 ^ 115;
                            int i815 = -(-((115 & i813) << 1));
                            i8 = (i814 ^ i815) + ((i815 & i814) << 1);
                            a = i8 % 128;
                            if (i8 % 2 == 0) {
                                ak.D(objO, objO2);
                                obj.hashCode();
                                throw null;
                            }
                            if (ak.D(objO, objO2)) {
                                i27 = (i27 | 3) + (i27 & 3);
                                break;
                            }
                        }
                        int i5111111118 = a;
                        int i5111111119 = (((i5111111118 ^ 5) | (i5111111118 & 5)) << 1) - (((~i5111111118) & 5) | (i5111111118 & (-6)));
                        b = i5111111119 % 128;
                        int i51111111110 = i5111111119 % 2;
                        break;
                    case 9:
                        if (G(t, t2, i27)) {
                            int i816 = b;
                            int i817 = i816 ^ 113;
                            int i818 = -(-((i816 & 113) << 1));
                            int i819 = ((i817 | i818) << 1) - (i818 ^ i817);
                            a = i819 % 128;
                            int i910 = i819 % 2;
                            objO3 = ar.o(t, jL);
                            objO4 = ar.o(t2, jL);
                            int i911 = b;
                            int i912 = i911 & 103;
                            int i913 = -(-((i911 ^ 103) | i912));
                            int i914 = (i912 ^ i913) + ((i913 & i912) << 1);
                            a = i914 % 128;
                            int i915 = i914 % 2;
                            if (ak.D(objO3, objO4)) {
                                int i916 = b;
                                int i917 = i916 & 59;
                                int i918 = -(-((i916 ^ 59) | i917));
                                int i919 = ((i917 | i918) << 1) - (i918 ^ i917);
                                a = i919 % 128;
                                int i1010 = i919 % 2;
                                i27 = (i27 | 3) + (i27 & 3);
                                break;
                            }
                        }
                        int i51111111111 = a;
                        int i51111111112 = (((i51111111111 ^ 5) | (i51111111111 & 5)) << 1) - (((~i51111111111) & 5) | (i51111111111 & (-6)));
                        b = i51111111112 % 128;
                        int i51111111113 = i51111111112 % 2;
                        break;
                    case 10:
                        if (!(!G(t, t2, i27))) {
                            int i1011 = a;
                            int i1012 = i1011 & 63;
                            int i1013 = -(-((i1011 ^ 63) | i1012));
                            i9 = (i1012 ^ i1013) + ((i1013 & i1012) << 1);
                            b = i9 % 128;
                            if (i9 % 2 == 0) {
                                objO5 = ar.o(t, jL);
                                objO6 = ar.o(t2, jL);
                                int i1014 = 24 / 0;
                            } else {
                                objO5 = ar.o(t, jL);
                                objO6 = ar.o(t2, jL);
                            }
                            if (ak.D(objO5, objO6)) {
                                int i1015 = b;
                                int i1016 = ((i1015 ^ 67) | (i1015 & 67)) << 1;
                                int i1017 = -(((~i1015) & 67) | (i1015 & (-68)));
                                int i1018 = (i1016 ^ i1017) + ((i1017 & i1016) << 1);
                                a = i1018 % 128;
                                int i1019 = i1018 % 2;
                                i27 = (i27 | 3) + (i27 & 3);
                                break;
                            }
                        }
                        int i51111111114 = a;
                        int i51111111115 = (((i51111111114 ^ 5) | (i51111111114 & 5)) << 1) - (((~i51111111114) & 5) | (i51111111114 & (-6)));
                        b = i51111111115 % 128;
                        int i51111111116 = i51111111115 % 2;
                        break;
                    case 11:
                        if (G(t, t2, i27)) {
                            int i1110 = b;
                            i10 = (((i1110 & (-4)) | ((~i1110) & 3)) - (~((i1110 & 3) << 1))) - 1;
                            a = i10 % 128;
                            if (i10 % 2 != 0) {
                                if (ar.n(t, jL) != ar.n(t2, jL)) {
                                }
                                int i1111 = b;
                                int i1112 = (((i1111 & (-116)) | ((~i1111) & 115)) - (~(-(-((i1111 & 115) << 1))))) - 1;
                                a = i1112 % 128;
                                int i1113 = i1112 % 2;
                                i27 = (i27 | 3) + (i27 & 3);
                            } else {
                                int i1114 = 39 / 0;
                                if (ar.n(t, jL) != ar.n(t2, jL)) {
                                }
                                int i1115 = b;
                                int i1116 = (((i1115 & (-116)) | ((~i1115) & 115)) - (~(-(-((i1115 & 115) << 1))))) - 1;
                                a = i1116 % 128;
                                int i1117 = i1116 % 2;
                                i27 = (i27 | 3) + (i27 & 3);
                            }
                            break;
                        }
                        int i51111111117 = a;
                        int i51111111118 = (((i51111111117 ^ 5) | (i51111111117 & 5)) << 1) - (((~i51111111117) & 5) | (i51111111117 & (-6)));
                        b = i51111111118 % 128;
                        int i51111111119 = i51111111118 % 2;
                        break;
                    case 12:
                        if (G(t, t2, i27)) {
                            int i1118 = b;
                            int i1119 = (i1118 & 82) + (i1118 | 82);
                            int i1210 = (i1119 ^ (-1)) + (i1119 << 1);
                            a = i1210 % 128;
                            int i1211 = i1210 % 2;
                            if (ar.n(t, jL) == ar.n(t2, jL)) {
                                int i1212 = b;
                                int i1213 = i1212 & 113;
                                int i1214 = ((i1212 ^ 113) | i1213) << 1;
                                int i1215 = -((i1212 | 113) & (~i1213));
                                int i1216 = (i1214 ^ i1215) + ((i1215 & i1214) << 1);
                                a = i1216 % 128;
                                int i1217 = i1216 % 2;
                                i27 = (i27 | 3) + (i27 & 3);
                                break;
                            }
                        }
                        int i511111111110 = a;
                        int i511111111111 = (((i511111111110 ^ 5) | (i511111111110 & 5)) << 1) - (((~i511111111110) & 5) | (i511111111110 & (-6)));
                        b = i511111111111 % 128;
                        int i511111111112 = i511111111111 % 2;
                        break;
                    case 13:
                        if (!(!G(t, t2, i27))) {
                            int i1218 = b;
                            int i1219 = i1218 ^ 19;
                            int i1310 = -(-((i1218 & 19) << 1));
                            i11 = (i1219 ^ i1310) + ((i1310 & i1219) << 1);
                            a = i11 % 128;
                            if (i11 % 2 == 0) {
                                ar.n(t, jL);
                                ar.n(t2, jL);
                                obj.hashCode();
                                throw null;
                            }
                            if (ar.n(t, jL) == ar.n(t2, jL)) {
                                int i1311 = a;
                                i12 = (((i1311 & (-70)) | ((~i1311) & 69)) - (~((i1311 & 69) << 1))) - 1;
                                b = i12 % 128;
                                if (i12 % 2 == 0) {
                                    int i1312 = 3 / 5;
                                }
                                i27 = (i27 | 3) + (i27 & 3);
                                break;
                            }
                        }
                        int i511111111113 = a;
                        int i511111111114 = (((i511111111113 ^ 5) | (i511111111113 & 5)) << 1) - (((~i511111111113) & 5) | (i511111111113 & (-6)));
                        b = i511111111114 % 128;
                        int i511111111115 = i511111111114 % 2;
                        break;
                    case IMediaSession.Stub.TRANSACTION_playFromMediaId /* 14 */:
                        if (!(!G(t, t2, i27))) {
                            int i1313 = a;
                            i13 = (-2) - (((i1313 ^ 26) + ((i1313 & 26) << 1)) ^ (-1));
                            b = i13 % 128;
                            if (i13 % 2 != 0) {
                                ar.p(t, jL);
                                ar.p(t2, jL);
                                throw null;
                            }
                            if (ar.p(t, jL) == ar.p(t2, jL)) {
                                int i1314 = a;
                                int i1315 = ((i1314 & 18) + (i1314 | 18)) - 1;
                                b = i1315 % 128;
                                int i1316 = i1315 % 2;
                                i27 = (i27 | 3) + (i27 & 3);
                                break;
                            }
                        }
                        int i511111111116 = a;
                        int i511111111117 = (((i511111111116 ^ 5) | (i511111111116 & 5)) << 1) - (((~i511111111116) & 5) | (i511111111116 & (-6)));
                        b = i511111111117 % 128;
                        int i511111111118 = i511111111117 % 2;
                        break;
                    case IMediaSession.Stub.TRANSACTION_playFromSearch /* 15 */:
                        if (G(t, t2, i27)) {
                            int i1317 = a;
                            int i1318 = i1317 & 61;
                            int i1319 = -(-((61 ^ i1317) | i1318));
                            int i1410 = (i1318 & i1319) + (i1319 | i1318);
                            b = i1410 % 128;
                            int i1411 = i1410 % 2;
                            if (ar.n(t, jL) == ar.n(t2, jL)) {
                                i27 = (i27 | 3) + (i27 & 3);
                                break;
                            }
                        }
                        int i511111111119 = a;
                        int i5111111111110 = (((i511111111119 ^ 5) | (i511111111119 & 5)) << 1) - (((~i511111111119) & 5) | (i511111111119 & (-6)));
                        b = i5111111111110 % 128;
                        int i5111111111111 = i5111111111110 % 2;
                        break;
                    case 16:
                        if (!G(t, t2, i27)) {
                            i14 = b + 51;
                            a = i14 % 128;
                            if (i14 % 2 == 0) {
                                ar.p(t, jL);
                                ar.p(t2, jL);
                                obj.hashCode();
                                throw null;
                            }
                            if (ar.p(t, jL) == ar.p(t2, jL)) {
                                int i1412 = a;
                                int i1413 = i1412 | 67;
                                int i1414 = i1413 << 1;
                                int i1415 = -((~(i1412 & 67)) & i1413);
                                int i1416 = ((i1414 | i1415) << 1) - (i1415 ^ i1414);
                                b = i1416 % 128;
                                int i1417 = i1416 % 2;
                                i27 = (i27 | 3) + (i27 & 3);
                                break;
                            }
                        }
                        int i5111111111112 = a;
                        int i5111111111113 = (((i5111111111112 ^ 5) | (i5111111111112 & 5)) << 1) - (((~i5111111111112) & 5) | (i5111111111112 & (-6)));
                        b = i5111111111113 % 128;
                        int i5111111111114 = i5111111111113 % 2;
                        break;
                    case IMediaSession.Stub.TRANSACTION_skipToQueueItem /* 17 */:
                        if (G(t, t2, i27)) {
                            int i1418 = a;
                            int i1419 = (i1418 & (-98)) | ((~i1418) & 97);
                            int i1510 = -(-((i1418 & 97) << 1));
                            i15 = (i1419 & i1510) + (i1510 | i1419);
                            b = i15 % 128;
                            if (i15 % 2 == 0) {
                                objO7 = ar.o(t, jL);
                                objO8 = ar.o(t2, jL);
                                int i1511 = 43 / 0;
                            } else {
                                objO7 = ar.o(t, jL);
                                objO8 = ar.o(t2, jL);
                            }
                            int i1512 = b;
                            int i1513 = i1512 & 27;
                            int i1514 = (i1512 ^ 27) | i1513;
                            i16 = (i1513 ^ i1514) + ((i1514 & i1513) << 1);
                            a = i16 % 128;
                            if (i16 % 2 != 0) {
                                zD = ak.D(objO7, objO8);
                                int i1515 = 84 / 0;
                                if (zD) {
                                    i27 = (i27 | 3) + (i27 & 3);
                                    break;
                                }
                            } else if (ak.D(objO7, objO8)) {
                                i27 = (i27 | 3) + (i27 & 3);
                                break;
                            }
                        }
                        int i5111111111115 = a;
                        int i5111111111116 = (((i5111111111115 ^ 5) | (i5111111111115 & 5)) << 1) - (((~i5111111111115) & 5) | (i5111111111115 & (-6)));
                        b = i5111111111116 % 128;
                        int i5111111111117 = i5111111111116 % 2;
                        break;
                    case IMediaSession.Stub.TRANSACTION_pause /* 18 */:
                    case IMediaSession.Stub.TRANSACTION_stop /* 19 */:
                    case IMediaSession.Stub.TRANSACTION_next /* 20 */:
                    case IMediaSession.Stub.TRANSACTION_previous /* 21 */:
                    case IMediaSession.Stub.TRANSACTION_fastForward /* 22 */:
                    case IMediaSession.Stub.TRANSACTION_rewind /* 23 */:
                    case IMediaSession.Stub.TRANSACTION_seekTo /* 24 */:
                    case IMediaSession.Stub.TRANSACTION_rate /* 25 */:
                    case IMediaSession.Stub.TRANSACTION_sendCustomAction /* 26 */:
                    case IMediaSession.Stub.TRANSACTION_getMetadata /* 27 */:
                    case IMediaSession.Stub.TRANSACTION_getPlaybackState /* 28 */:
                    case IMediaSession.Stub.TRANSACTION_getQueue /* 29 */:
                    case IMediaSession.Stub.TRANSACTION_getQueueTitle /* 30 */:
                    case IMediaSession.Stub.TRANSACTION_getExtras /* 31 */:
                    case IMediaSession.Stub.TRANSACTION_getRatingType /* 32 */:
                    case IMediaSession.Stub.TRANSACTION_prepare /* 33 */:
                    case IMediaSession.Stub.TRANSACTION_prepareFromMediaId /* 34 */:
                    case IMediaSession.Stub.TRANSACTION_prepareFromSearch /* 35 */:
                    case IMediaSession.Stub.TRANSACTION_prepareFromUri /* 36 */:
                    case IMediaSession.Stub.TRANSACTION_getRepeatMode /* 37 */:
                    case IMediaSession.Stub.TRANSACTION_isShuffleModeEnabledRemoved /* 38 */:
                    case IMediaSession.Stub.TRANSACTION_setRepeatMode /* 39 */:
                    case IMediaSession.Stub.TRANSACTION_setShuffleModeEnabledRemoved /* 40 */:
                    case IMediaSession.Stub.TRANSACTION_addQueueItem /* 41 */:
                    case IMediaSession.Stub.TRANSACTION_addQueueItemAt /* 42 */:
                    case IMediaSession.Stub.TRANSACTION_removeQueueItem /* 43 */:
                    case IMediaSession.Stub.TRANSACTION_removeQueueItemAt /* 44 */:
                    case IMediaSession.Stub.TRANSACTION_isCaptioningEnabled /* 45 */:
                    case IMediaSession.Stub.TRANSACTION_setCaptioningEnabled /* 46 */:
                    case IMediaSession.Stub.TRANSACTION_getShuffleMode /* 47 */:
                    case IMediaSession.Stub.TRANSACTION_setShuffleMode /* 48 */:
                    case 49:
                        Object objO15 = ar.o(t, jL);
                        Object objO16 = ar.o(t2, jL);
                        int i1516 = a;
                        int i1517 = i1516 & 119;
                        int i1518 = (((i1516 | 119) & (~i1517)) - (~(-(-(i1517 << 1))))) - 1;
                        b = i1518 % 128;
                        int i1519 = i1518 % 2;
                        zD2 = ak.D(objO15, objO16);
                        int i1610 = a;
                        int i1611 = (((i1610 & (-40)) | ((~i1610) & 39)) - (~(-(-((i1610 & 39) << 1))))) - 1;
                        b = i1611 % 128;
                        int i1612 = i1611 % 2;
                        if (!zD2) {
                            i27 = (i27 | 3) + (i27 & 3);
                        }
                        break;
                    case 50:
                        Object objO17 = ar.o(t, jL);
                        Object objO18 = ar.o(t2, jL);
                        int i1613 = a + 117;
                        b = i1613 % 128;
                        int i1614 = i1613 % 2;
                        zD2 = ak.D(objO17, objO18);
                        int i1615 = a;
                        int i1616 = i1615 & 3;
                        int i1617 = i1616 + ((i1615 ^ 3) | i1616);
                        b = i1617 % 128;
                        int i1618 = i1617 % 2;
                        if (!zD2) {
                            i27 = (i27 | 3) + (i27 & 3);
                        }
                        break;
                    case IMediaSession.Stub.TRANSACTION_rateWithExtras /* 51 */:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        j = this.f[(i27 & 2) + (i27 | 2)] & 1048575;
                        int i1619 = a;
                        int i1710 = ((i1619 & 22) + (i1619 | 22)) - 1;
                        b = i1710 % 128;
                        int i1711 = i1710 % 2;
                        if (ar.n(t, j) == ar.n(t2, j)) {
                            int i1712 = b;
                            int i1713 = (i1712 & (-20)) | ((~i1712) & 19);
                            int i1714 = -(-((i1712 & 19) << 1));
                            i17 = (i1713 & i1714) + (i1714 | i1713);
                            i18 = i17 % 128;
                            a = i18;
                            if (i17 % 2 != 0) {
                                z = false;
                            } else {
                                z = true;
                            }
                            int i1715 = i18 & 81;
                            int i1716 = (i1715 - (~(-(-((i18 ^ 81) | i1715))))) - 1;
                            b = i1716 % 128;
                            int i1717 = i1716 % 2;
                            if (z) {
                                int i1718 = i18 & 103;
                                i19 = (i1718 - (~((i18 ^ 103) | i1718))) - 1;
                                b = i19 % 128;
                                if (i19 % 2 == 0) {
                                    objO9 = ar.o(t, jL);
                                    objO10 = ar.o(t2, jL);
                                    int i1719 = 5 / 0;
                                } else {
                                    objO9 = ar.o(t, jL);
                                    objO10 = ar.o(t2, jL);
                                }
                                if (ak.D(objO9, objO10)) {
                                    int i1810 = b;
                                    int i1811 = i1810 & 59;
                                    int i1812 = (i1810 ^ 59) | i1811;
                                    int i1813 = (i1811 & i1812) + (i1812 | i1811);
                                    a = i1813 % 128;
                                    int i1814 = i1813 % 2;
                                    i27 = (i27 | 3) + (i27 & 3);
                                    break;
                                }
                            }
                        } else {
                            int i1815 = a + 113;
                            b = i1815 % 128;
                            int i1816 = i1815 % 2;
                        }
                        int i5111111111118 = a;
                        int i5111111111119 = (((i5111111111118 ^ 5) | (i5111111111118 & 5)) << 1) - (((~i5111111111118) & 5) | (i5111111111118 & (-6)));
                        b = i5111111111119 % 128;
                        int i51111111111110 = i5111111111119 % 2;
                        break;
                    default:
                        int i1817 = b;
                        int i1818 = (i1817 & (-62)) | ((~i1817) & 61);
                        int i1819 = -(-((61 & i1817) << 1));
                        int i192 = ((i1818 | i1819) << 1) - (i1819 ^ i1818);
                        a = i192 % 128;
                        int i193 = i192 % 2;
                        i27 = (i27 | 3) + (i27 & 3);
                        break;
                }
            }
        }
        int i194 = b;
        int i195 = ((i194 ^ 95) | (i194 & 95)) << 1;
        int i196 = -((i194 & (-96)) | ((~i194) & 95));
        int i197 = (i195 & i196) + (i195 | i196);
        a = i197 % 128;
        int i198 = i197 % 2;
        int i199 = (((i194 | 24) << 1) - (i194 ^ 24)) - 1;
        a = i199 % 128;
        if (i199 % 2 != 0) {
            int i200 = 23 / 0;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x036b  */
    /* JADX WARN: Code duplicated, block: B:102:0x0380  */
    /* JADX WARN: Code duplicated, block: B:103:0x038f  */
    /* JADX WARN: Code duplicated, block: B:105:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:106:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:107:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:108:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:109:0x040d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0431  */
    /* JADX WARN: Code duplicated, block: B:111:0x0441  */
    /* JADX WARN: Code duplicated, block: B:112:0x0451  */
    /* JADX WARN: Code duplicated, block: B:114:0x046e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0476  */
    /* JADX WARN: Code duplicated, block: B:116:0x047c  */
    /* JADX WARN: Code duplicated, block: B:117:0x048b  */
    /* JADX WARN: Code duplicated, block: B:118:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:119:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:11:0x0044  */
    /* JADX WARN: Code duplicated, block: B:120:0x04df  */
    /* JADX WARN: Code duplicated, block: B:121:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:122:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:123:0x0512  */
    /* JADX WARN: Code duplicated, block: B:125:0x0526  */
    /* JADX WARN: Code duplicated, block: B:126:0x0553  */
    /* JADX WARN: Code duplicated, block: B:128:0x0572  */
    /* JADX WARN: Code duplicated, block: B:129:0x057a  */
    /* JADX WARN: Code duplicated, block: B:130:0x057f  */
    /* JADX WARN: Code duplicated, block: B:132:0x059f  */
    /* JADX WARN: Code duplicated, block: B:133:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:134:0x05af  */
    /* JADX WARN: Code duplicated, block: B:135:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:137:0x05da  */
    /* JADX WARN: Code duplicated, block: B:138:0x05df  */
    /* JADX WARN: Code duplicated, block: B:139:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:141:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:142:0x060a  */
    /* JADX WARN: Code duplicated, block: B:143:0x0611  */
    /* JADX WARN: Code duplicated, block: B:144:0x0624  */
    /* JADX WARN: Code duplicated, block: B:145:0x0633  */
    /* JADX WARN: Code duplicated, block: B:147:0x0652  */
    /* JADX WARN: Code duplicated, block: B:148:0x0658  */
    /* JADX WARN: Code duplicated, block: B:149:0x065d  */
    /* JADX WARN: Code duplicated, block: B:150:0x066c  */
    /* JADX WARN: Code duplicated, block: B:151:0x067b  */
    /* JADX WARN: Code duplicated, block: B:152:0x068a  */
    /* JADX WARN: Code duplicated, block: B:153:0x0699  */
    /* JADX WARN: Code duplicated, block: B:154:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:156:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:157:0x06da  */
    /* JADX WARN: Code duplicated, block: B:159:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:161:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:164:0x0707  */
    /* JADX WARN: Code duplicated, block: B:166:0x070a  */
    /* JADX WARN: Code duplicated, block: B:168:0x072b  */
    /* JADX WARN: Code duplicated, block: B:171:0x0735  */
    /* JADX WARN: Code duplicated, block: B:173:0x073a  */
    /* JADX WARN: Code duplicated, block: B:174:0x0755  */
    /* JADX WARN: Code duplicated, block: B:176:0x075a  */
    /* JADX WARN: Code duplicated, block: B:178:0x0771  */
    /* JADX WARN: Code duplicated, block: B:181:0x078c  */
    /* JADX WARN: Code duplicated, block: B:183:0x0791  */
    /* JADX WARN: Code duplicated, block: B:185:0x07ab  */
    /* JADX WARN: Code duplicated, block: B:186:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:188:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:190:0x07da  */
    /* JADX WARN: Code duplicated, block: B:191:0x07e8  */
    /* JADX WARN: Code duplicated, block: B:193:0x07ed  */
    /* JADX WARN: Code duplicated, block: B:194:0x0812  */
    /* JADX WARN: Code duplicated, block: B:196:0x0817  */
    /* JADX WARN: Code duplicated, block: B:198:0x0832  */
    /* JADX WARN: Code duplicated, block: B:199:0x083d  */
    /* JADX WARN: Code duplicated, block: B:200:0x0844  */
    /* JADX WARN: Code duplicated, block: B:202:0x0849  */
    /* JADX WARN: Code duplicated, block: B:204:0x0876  */
    /* JADX WARN: Code duplicated, block: B:207:0x0889  */
    /* JADX WARN: Code duplicated, block: B:209:0x088e  */
    /* JADX WARN: Code duplicated, block: B:210:0x08ac  */
    /* JADX WARN: Code duplicated, block: B:212:0x08b1  */
    /* JADX WARN: Code duplicated, block: B:213:0x08be  */
    /* JADX WARN: Code duplicated, block: B:215:0x08c3  */
    /* JADX WARN: Code duplicated, block: B:217:0x08e3  */
    /* JADX WARN: Code duplicated, block: B:218:0x08eb  */
    /* JADX WARN: Code duplicated, block: B:219:0x08ef  */
    /* JADX WARN: Code duplicated, block: B:221:0x08f4  */
    /* JADX WARN: Code duplicated, block: B:223:0x0904  */
    /* JADX WARN: Code duplicated, block: B:225:0x0909  */
    /* JADX WARN: Code duplicated, block: B:227:0x091e  */
    /* JADX WARN: Code duplicated, block: B:228:0x092c  */
    /* JADX WARN: Code duplicated, block: B:230:0x093b  */
    /* JADX WARN: Code duplicated, block: B:231:0x093e  */
    /* JADX WARN: Code duplicated, block: B:233:0x0944  */
    /* JADX WARN: Code duplicated, block: B:234:0x0964  */
    /* JADX WARN: Code duplicated, block: B:236:0x096a  */
    /* JADX WARN: Code duplicated, block: B:237:0x0977  */
    /* JADX WARN: Code duplicated, block: B:239:0x097d  */
    /* JADX WARN: Code duplicated, block: B:241:0x0992  */
    /* JADX WARN: Code duplicated, block: B:243:0x09b3  */
    /* JADX WARN: Code duplicated, block: B:249:0x09c9  */
    /* JADX WARN: Code duplicated, block: B:251:0x09d0  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:261:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x06fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x0730 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x077f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x087e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x09bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x09b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x09da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x012f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0135  */
    /* JADX WARN: Code duplicated, block: B:39:0x0145  */
    /* JADX WARN: Code duplicated, block: B:41:0x014b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0157  */
    /* JADX WARN: Code duplicated, block: B:44:0x015d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0169  */
    /* JADX WARN: Code duplicated, block: B:47:0x016f  */
    /* JADX WARN: Code duplicated, block: B:48:0x017d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0183  */
    /* JADX WARN: Code duplicated, block: B:51:0x0191  */
    /* JADX WARN: Code duplicated, block: B:53:0x0197  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:57:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:60:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:62:0x01da  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:67:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:68:0x020c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0213  */
    /* JADX WARN: Code duplicated, block: B:71:0x0252  */
    /* JADX WARN: Code duplicated, block: B:73:0x0259  */
    /* JADX WARN: Code duplicated, block: B:74:0x0267  */
    /* JADX WARN: Code duplicated, block: B:76:0x026e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0286  */
    /* JADX WARN: Code duplicated, block: B:79:0x028d  */
    /* JADX WARN: Code duplicated, block: B:81:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:82:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:83:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:85:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:86:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:89:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:90:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:92:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:93:0x031d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0323  */
    /* JADX WARN: Code duplicated, block: B:96:0x032f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0335  */
    /* JADX WARN: Code duplicated, block: B:99:0x0362  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void ah(T t, InterfaceC0051g interfaceC0051g) {
        Iterator itN;
        Map.Entry<?, ?> entry;
        int i;
        Map.Entry<?, ?> entry2;
        long jL;
        int i2;
        int i3;
        float fM;
        C0055l c0055l;
        int i4;
        int i5;
        int i6;
        AbstractC0064u abstractC0064u;
        int i7;
        AbstractC0064u abstractC0064u2;
        int i8;
        Object object;
        ah ahVarK;
        int i9;
        AbstractC0069z abstractC0069z;
        C0055l c0055l2;
        int i10;
        int i11;
        int i12;
        C0055l c0055l3;
        int i13;
        long j;
        C0055l c0055l4;
        int i14;
        int i15;
        boolean z;
        int i16;
        List list;
        int i17;
        int i18;
        Object object2;
        int i19;
        int i20;
        List list2;
        int i21;
        boolean z2;
        int i22;
        Object object3;
        int i23;
        int i24;
        List list3;
        int i25;
        int i26;
        Object object4;
        int i27;
        int i28;
        List list4;
        ah ahVarK2;
        long jT;
        AbstractC0064u abstractC0064u3;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33 = 2 % 2;
        Map.Entry<?, ?> entry3 = null;
        if (this.j) {
            C0056m c0056mF = this.t.f(t);
            if (c0056mF.m()) {
                itN = null;
                entry = null;
            } else {
                int i34 = b;
                int i35 = i34 & 93;
                int i36 = (i34 ^ 93) | i35;
                int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                a = i37 % 128;
                if (i37 % 2 != 0) {
                    c0056mF.n().next();
                    entry3.hashCode();
                    throw null;
                }
                itN = c0056mF.n();
                entry = (Map.Entry) itN.next();
            }
        } else {
            itN = null;
            entry = null;
        }
        int length = this.f.length;
        Unsafe unsafe = d;
        int i38 = 0;
        int i39 = -1;
        int i40 = 0;
        while (i38 < length) {
            int iAg = ag(i38);
            int i41 = this.f[i38];
            int iV = v(iAg);
            if (this.m) {
                i = 0;
            } else {
                int i42 = b;
                int i43 = i42 & 91;
                int i44 = -(-((i42 ^ 91) | i43));
                int i45 = ((i43 | i44) << 1) - (i43 ^ i44);
                int i46 = i45 % 128;
                a = i46;
                int i47 = i45 % 2;
                if (iV <= 17) {
                    int i48 = i46 & 37;
                    int i49 = i48 + ((i46 ^ 37) | i48);
                    b = i49 % 128;
                    if (i49 % 2 == 0) {
                        i31 = this.f[(((i38 & 2) | ((-3) & (~i38))) - (~(-(-((i38 & (-3)) << 1))))) - 1];
                        i32 = ((-1048576) & i31) | ((~i31) & 1048575);
                    } else {
                        i31 = this.f[(((i38 | 3) << 1) - (i38 ^ 3)) - 1];
                        i32 = 1048575 & i31;
                    }
                    if (i32 != i39) {
                        i40 = unsafe.getInt(t, i32);
                        int i50 = b;
                        int i51 = (-2) - ((((i50 | 84) << 1) - (i50 ^ 84)) ^ (-1));
                        a = i51 % 128;
                        int i52 = i51 % 2;
                        i39 = i32;
                    }
                    i = 1 << (i31 >>> 20);
                } else {
                    i = 0;
                }
            }
            while (entry != null) {
                int i53 = b;
                int i54 = i53 & 17;
                int i55 = i54 + ((i53 ^ 17) | i54);
                a = i55 % 128;
                int i56 = i55 % 2;
                if (this.t.d(entry) > i41) {
                    entry2 = entry;
                    jL = l(iAg);
                    switch (iV) {
                        case 0:
                            i2 = length;
                            entry3 = null;
                            if ((i & i40) != 0) {
                                ((C0055l) interfaceC0051g).c(i41, ar.l(t, jL));
                            }
                            int i57 = (i38 & (-114)) | ((~i38) & 113);
                            int i58 = -(-((i38 & 113) << 1));
                            int i59 = ((i57 | i58) << 1) - (i57 ^ i58);
                            int i60 = i59 & (-110);
                            int i61 = (i59 ^ (-110)) | i60;
                            i38 = (i60 ^ i61) + ((i60 & i61) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case 1:
                            i2 = length;
                            if ((i & i40) != 0) {
                                int i62 = a;
                                i3 = ((i62 & (-10)) | ((~i62) & 9)) + ((i62 & 9) << 1);
                                b = i3 % 128;
                                if (i3 % 2 != 0) {
                                    Object obj = null;
                                    ar.m(t, jL);
                                    obj.hashCode();
                                    throw null;
                                }
                                fM = ar.m(t, jL);
                                c0055l = (C0055l) interfaceC0051g;
                                int i63 = b;
                                int i64 = (i63 & (-116)) | ((~i63) & 115);
                                int i65 = (i63 & 115) << 1;
                                i4 = (i64 ^ i65) + ((i65 & i64) << 1);
                                a = i4 % 128;
                                if (i4 % 2 == 0) {
                                    c0055l.d(i41, fM);
                                    throw null;
                                }
                                c0055l.d(i41, fM);
                            }
                            entry3 = null;
                            int i510 = (i38 & (-114)) | ((~i38) & 113);
                            int i511 = -(-((i38 & 113) << 1));
                            int i512 = ((i510 | i511) << 1) - (i510 ^ i511);
                            int i66 = i512 & (-110);
                            int i67 = (i512 ^ (-110)) | i66;
                            i38 = (i66 ^ i67) + ((i66 & i67) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case 2:
                            i2 = length;
                            if ((i & i40) != 0) {
                                ((C0055l) interfaceC0051g).c.cr(i41, unsafe.getLong(t, jL));
                            }
                            entry3 = null;
                            int i513 = (i38 & (-114)) | ((~i38) & 113);
                            int i514 = -(-((i38 & 113) << 1));
                            int i515 = ((i513 | i514) << 1) - (i513 ^ i514);
                            int i68 = i515 & (-110);
                            int i69 = (i515 ^ (-110)) | i68;
                            i38 = (i68 ^ i69) + ((i68 & i69) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case 3:
                            i2 = length;
                            if ((i & i40) != 0) {
                                ((C0055l) interfaceC0051g).c.cr(i41, unsafe.getLong(t, jL));
                                int i70 = a;
                                int i71 = i70 & 21;
                                int i72 = (((i70 | 21) & (~i71)) - (~(i71 << 1))) - 1;
                                b = i72 % 128;
                                int i73 = i72 % 2;
                            }
                            entry3 = null;
                            int i516 = (i38 & (-114)) | ((~i38) & 113);
                            int i517 = -(-((i38 & 113) << 1));
                            int i518 = ((i516 | i517) << 1) - (i516 ^ i517);
                            int i610 = i518 & (-110);
                            int i611 = (i518 ^ (-110)) | i610;
                            i38 = (i610 ^ i611) + ((i610 & i611) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case 4:
                            i2 = length;
                            if ((i & i40) != 0) {
                                int i74 = b;
                                int i75 = i74 & 1;
                                int i76 = -(-((i74 ^ 1) | i75));
                                i5 = (i75 & i76) + (i76 | i75);
                                a = i5 % 128;
                                if (i5 % 2 != 0) {
                                    i6 = unsafe.getInt(t, jL);
                                    abstractC0064u = ((C0055l) interfaceC0051g).c;
                                    int i77 = 38 / 0;
                                } else {
                                    i6 = unsafe.getInt(t, jL);
                                    abstractC0064u = ((C0055l) interfaceC0051g).c;
                                }
                                abstractC0064u.ci(i41, i6);
                            }
                            entry3 = null;
                            int i519 = (i38 & (-114)) | ((~i38) & 113);
                            int i5110 = -(-((i38 & 113) << 1));
                            int i5111 = ((i519 | i5110) << 1) - (i519 ^ i5110);
                            int i612 = i5111 & (-110);
                            int i613 = (i5111 ^ (-110)) | i612;
                            i38 = (i612 ^ i613) + ((i612 & i613) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case 5:
                            i2 = length;
                            if ((i & i40) != 0) {
                                ((C0055l) interfaceC0051g).c.cg(i41, unsafe.getLong(t, jL));
                            }
                            entry3 = null;
                            int i5112 = (i38 & (-114)) | ((~i38) & 113);
                            int i5113 = -(-((i38 & 113) << 1));
                            int i5114 = ((i5112 | i5113) << 1) - (i5112 ^ i5113);
                            int i614 = i5114 & (-110);
                            int i615 = (i5114 ^ (-110)) | i614;
                            i38 = (i614 ^ i615) + ((i614 & i615) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case 6:
                            i2 = length;
                            if ((i & i40) != 0) {
                                i7 = unsafe.getInt(t, jL);
                                abstractC0064u2 = ((C0055l) interfaceC0051g).c;
                                int i78 = a;
                                int i79 = i78 & 59;
                                int i80 = (i78 | 59) & (~i79);
                                int i81 = i79 << 1;
                                i8 = (i80 ^ i81) + ((i80 & i81) << 1);
                                b = i8 % 128;
                                if (i8 % 2 == 0) {
                                    abstractC0064u2.ce(i41, i7);
                                    int i82 = 66 / 0;
                                } else {
                                    abstractC0064u2.ce(i41, i7);
                                }
                            }
                            entry3 = null;
                            int i5115 = (i38 & (-114)) | ((~i38) & 113);
                            int i5116 = -(-((i38 & 113) << 1));
                            int i5117 = ((i5115 | i5116) << 1) - (i5115 ^ i5116);
                            int i616 = i5117 & (-110);
                            int i617 = (i5117 ^ (-110)) | i616;
                            i38 = (i616 ^ i617) + ((i616 & i617) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case 7:
                            i2 = length;
                            if ((i & i40) != 0) {
                                ((C0055l) interfaceC0051g).c.cd(i41, ar.h(t, jL));
                            }
                            entry3 = null;
                            int i5118 = (i38 & (-114)) | ((~i38) & 113);
                            int i5119 = -(-((i38 & 113) << 1));
                            int i51110 = ((i5118 | i5119) << 1) - (i5118 ^ i5119);
                            int i618 = i51110 & (-110);
                            int i619 = (i51110 ^ (-110)) | i618;
                            i38 = (i618 ^ i619) + ((i618 & i619) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case 8:
                            i2 = length;
                            if ((i & i40) != 0) {
                                int i83 = a;
                                int i84 = (((i83 ^ 3) | (i83 & 3)) << 1) - ((3 & (~i83)) | (i83 & (-4)));
                                b = i84 % 128;
                                int i85 = i84 % 2;
                                aj(i41, unsafe.getObject(t, jL), interfaceC0051g);
                            }
                            entry3 = null;
                            int i51111 = (i38 & (-114)) | ((~i38) & 113);
                            int i51112 = -(-((i38 & 113) << 1));
                            int i51113 = ((i51111 | i51112) << 1) - (i51111 ^ i51112);
                            int i6110 = i51113 & (-110);
                            int i6111 = (i51113 ^ (-110)) | i6110;
                            i38 = (i6110 ^ i6111) + ((i6110 & i6111) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case 9:
                            i2 = length;
                            if ((i & i40) != 0) {
                                int i86 = a;
                                int i87 = i86 & 43;
                                int i88 = i87 + ((i86 ^ 43) | i87);
                                b = i88 % 128;
                                int i89 = i88 % 2;
                                object = unsafe.getObject(t, jL);
                                ahVarK = K(i38);
                                int i90 = b;
                                int i91 = (i90 & (-120)) | ((~i90) & 119);
                                int i92 = (i90 & 119) << 1;
                                i9 = (i91 & i92) + (i92 | i91);
                                a = i9 % 128;
                                if (i9 % 2 == 0) {
                                    ((C0055l) interfaceC0051g).f(i41, object, ahVarK);
                                    Object obj2 = null;
                                    obj2.hashCode();
                                    throw null;
                                }
                                ((C0055l) interfaceC0051g).f(i41, object, ahVarK);
                            }
                            entry3 = null;
                            int i51114 = (i38 & (-114)) | ((~i38) & 113);
                            int i51115 = -(-((i38 & 113) << 1));
                            int i51116 = ((i51114 | i51115) << 1) - (i51114 ^ i51115);
                            int i6112 = i51116 & (-110);
                            int i6113 = (i51116 ^ (-110)) | i6112;
                            i38 = (i6112 ^ i6113) + ((i6112 & i6113) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case 10:
                            i2 = length;
                            if ((i & i40) != 0) {
                                abstractC0069z = (AbstractC0069z) unsafe.getObject(t, jL);
                                c0055l2 = (C0055l) interfaceC0051g;
                                int i93 = b;
                                i10 = ((i93 ^ 74) + ((i93 & 74) << 1)) - 1;
                                a = i10 % 128;
                                if (i10 % 2 != 0) {
                                    c0055l2.c.cc(i41, abstractC0069z);
                                    int i94 = 27 / 0;
                                } else {
                                    c0055l2.c.cc(i41, abstractC0069z);
                                }
                            }
                            entry3 = null;
                            int i51117 = (i38 & (-114)) | ((~i38) & 113);
                            int i51118 = -(-((i38 & 113) << 1));
                            int i51119 = ((i51117 | i51118) << 1) - (i51117 ^ i51118);
                            int i6114 = i51119 & (-110);
                            int i6115 = (i51119 ^ (-110)) | i6114;
                            i38 = (i6114 ^ i6115) + ((i6114 & i6115) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case 11:
                            i2 = length;
                            if ((i & i40) != 0) {
                                int i95 = a;
                                int i96 = (((i95 ^ 67) | (i95 & 67)) << 1) - (((~i95) & 67) | (i95 & (-68)));
                                b = i96 % 128;
                                int i97 = i96 % 2;
                                ((C0055l) interfaceC0051g).c.cq(i41, unsafe.getInt(t, jL));
                            }
                            entry3 = null;
                            int i511110 = (i38 & (-114)) | ((~i38) & 113);
                            int i511111 = -(-((i38 & 113) << 1));
                            int i511112 = ((i511110 | i511111) << 1) - (i511110 ^ i511111);
                            int i6116 = i511112 & (-110);
                            int i6117 = (i511112 ^ (-110)) | i6116;
                            i38 = (i6116 ^ i6117) + ((i6116 & i6117) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case 12:
                            i2 = length;
                            if ((i & i40) != 0) {
                                ((C0055l) interfaceC0051g).c.ci(i41, unsafe.getInt(t, jL));
                            }
                            entry3 = null;
                            int i511113 = (i38 & (-114)) | ((~i38) & 113);
                            int i511114 = -(-((i38 & 113) << 1));
                            int i511115 = ((i511113 | i511114) << 1) - (i511113 ^ i511114);
                            int i6118 = i511115 & (-110);
                            int i6119 = (i511115 ^ (-110)) | i6118;
                            i38 = (i6118 ^ i6119) + ((i6118 & i6119) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case 13:
                            i2 = length;
                            if ((i & i40) != 0) {
                                int i98 = a;
                                int i99 = i98 & 17;
                                int i100 = (i98 | 17) & (~i99);
                                int i101 = -(-(i99 << 1));
                                i11 = (i100 ^ i101) + ((i100 & i101) << 1);
                                b = i11 % 128;
                                if (i11 % 2 == 0) {
                                    i12 = unsafe.getInt(t, jL);
                                    c0055l3 = (C0055l) interfaceC0051g;
                                    int i102 = 26 / 0;
                                } else {
                                    i12 = unsafe.getInt(t, jL);
                                    c0055l3 = (C0055l) interfaceC0051g;
                                }
                                c0055l3.c.ce(i41, i12);
                                int i103 = a;
                                int i104 = (((i103 | 114) << 1) - (i103 ^ 114)) - 1;
                                b = i104 % 128;
                                int i105 = i104 % 2;
                            }
                            entry3 = null;
                            int i511116 = (i38 & (-114)) | ((~i38) & 113);
                            int i511117 = -(-((i38 & 113) << 1));
                            int i511118 = ((i511116 | i511117) << 1) - (i511116 ^ i511117);
                            int i61110 = i511118 & (-110);
                            int i61111 = (i511118 ^ (-110)) | i61110;
                            i38 = (i61110 ^ i61111) + ((i61110 & i61111) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case IMediaSession.Stub.TRANSACTION_playFromMediaId /* 14 */:
                            i2 = length;
                            if ((i & i40) != 0) {
                                int i106 = b;
                                int i107 = i106 & 47;
                                int i108 = -(-((i106 ^ 47) | i107));
                                i13 = (i107 ^ i108) + ((i108 & i107) << 1);
                                a = i13 % 128;
                                if (i13 % 2 == 0) {
                                    unsafe.getLong(t, jL);
                                    AbstractC0064u abstractC0064u4 = ((C0055l) interfaceC0051g).c;
                                    Object obj3 = null;
                                    obj3.hashCode();
                                    throw null;
                                }
                                ((C0055l) interfaceC0051g).c.cg(i41, unsafe.getLong(t, jL));
                            }
                            entry3 = null;
                            int i511119 = (i38 & (-114)) | ((~i38) & 113);
                            int i5111110 = -(-((i38 & 113) << 1));
                            int i5111111 = ((i511119 | i5111110) << 1) - (i511119 ^ i5111110);
                            int i61112 = i5111111 & (-110);
                            int i61113 = (i5111111 ^ (-110)) | i61112;
                            i38 = (i61112 ^ i61113) + ((i61112 & i61113) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case IMediaSession.Stub.TRANSACTION_playFromSearch /* 15 */:
                            i2 = length;
                            if ((i & i40) != 0) {
                                int i109 = b;
                                int i110 = (i109 ^ 119) + ((i109 & 119) << 1);
                                a = i110 % 128;
                                int i111 = i110 % 2;
                                ((C0055l) interfaceC0051g).g(i41, unsafe.getInt(t, jL));
                            }
                            entry3 = null;
                            int i5111112 = (i38 & (-114)) | ((~i38) & 113);
                            int i5111113 = -(-((i38 & 113) << 1));
                            int i5111114 = ((i5111112 | i5111113) << 1) - (i5111112 ^ i5111113);
                            int i61114 = i5111114 & (-110);
                            int i61115 = (i5111114 ^ (-110)) | i61114;
                            i38 = (i61114 ^ i61115) + ((i61114 & i61115) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case 16:
                            if ((i & i40) != 0) {
                                j = unsafe.getLong(t, jL);
                                c0055l4 = (C0055l) interfaceC0051g;
                                int i112 = b;
                                i2 = length;
                                int i113 = ((~i112) & 55) | (i112 & (-56));
                                int i114 = (i112 & 55) << 1;
                                i14 = (i113 & i114) + (i114 | i113);
                                a = i14 % 128;
                                if (i14 % 2 == 0) {
                                    c0055l4.i(i41, j);
                                    throw null;
                                }
                                c0055l4.i(i41, j);
                            } else {
                                i2 = length;
                            }
                            entry3 = null;
                            int i5111115 = (i38 & (-114)) | ((~i38) & 113);
                            int i5111116 = -(-((i38 & 113) << 1));
                            int i5111117 = ((i5111115 | i5111116) << 1) - (i5111115 ^ i5111116);
                            int i61116 = i5111117 & (-110);
                            int i61117 = (i5111117 ^ (-110)) | i61116;
                            i38 = (i61116 ^ i61117) + ((i61116 & i61117) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case IMediaSession.Stub.TRANSACTION_skipToQueueItem /* 17 */:
                            if ((i & i40) != 0) {
                                int i115 = a;
                                i15 = (i115 & 79) + (i115 | 79);
                                b = i15 % 128;
                                if (i15 % 2 != 0) {
                                    unsafe.getObject(t, jL);
                                    K(i38);
                                    Object obj4 = null;
                                    obj4.hashCode();
                                    throw null;
                                }
                                ((C0055l) interfaceC0051g).e(i41, unsafe.getObject(t, jL), K(i38));
                            }
                            i2 = length;
                            entry3 = null;
                            int i5111118 = (i38 & (-114)) | ((~i38) & 113);
                            int i5111119 = -(-((i38 & 113) << 1));
                            int i51111110 = ((i5111118 | i5111119) << 1) - (i5111118 ^ i5111119);
                            int i61118 = i51111110 & (-110);
                            int i61119 = (i51111110 ^ (-110)) | i61118;
                            i38 = (i61118 ^ i61119) + ((i61118 & i61119) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case IMediaSession.Stub.TRANSACTION_pause /* 18 */:
                            z = false;
                            ak.I(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, false);
                            i2 = length;
                            entry3 = null;
                            int i51111111 = (i38 & (-114)) | ((~i38) & 113);
                            int i51111112 = -(-((i38 & 113) << 1));
                            int i51111113 = ((i51111111 | i51111112) << 1) - (i51111111 ^ i51111112);
                            int i611110 = i51111113 & (-110);
                            int i611111 = (i51111113 ^ (-110)) | i611110;
                            i38 = (i611110 ^ i611111) + ((i611110 & i611111) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case IMediaSession.Stub.TRANSACTION_stop /* 19 */:
                            z = false;
                            ak.L(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, false);
                            i2 = length;
                            entry3 = null;
                            int i51111114 = (i38 & (-114)) | ((~i38) & 113);
                            int i51111115 = -(-((i38 & 113) << 1));
                            int i51111116 = ((i51111114 | i51111115) << 1) - (i51111114 ^ i51111115);
                            int i611112 = i51111116 & (-110);
                            int i611113 = (i51111116 ^ (-110)) | i611112;
                            i38 = (i611112 ^ i611113) + ((i611112 & i611113) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case IMediaSession.Stub.TRANSACTION_next /* 20 */:
                            ak.N(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, false);
                            int i116 = a;
                            int i117 = (i116 ^ 15) + ((i116 & 15) << 1);
                            b = i117 % 128;
                            int i118 = i117 % 2;
                            i2 = length;
                            entry3 = null;
                            int i51111117 = (i38 & (-114)) | ((~i38) & 113);
                            int i51111118 = -(-((i38 & 113) << 1));
                            int i51111119 = ((i51111117 | i51111118) << 1) - (i51111117 ^ i51111118);
                            int i611114 = i51111119 & (-110);
                            int i611115 = (i51111119 ^ (-110)) | i611114;
                            i38 = (i611114 ^ i611115) + ((i611114 & i611115) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case IMediaSession.Stub.TRANSACTION_previous /* 21 */:
                            z = false;
                            ak.V(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, false);
                            i2 = length;
                            entry3 = null;
                            int i511111110 = (i38 & (-114)) | ((~i38) & 113);
                            int i511111111 = -(-((i38 & 113) << 1));
                            int i511111112 = ((i511111110 | i511111111) << 1) - (i511111110 ^ i511111111);
                            int i611116 = i511111112 & (-110);
                            int i611117 = (i511111112 ^ (-110)) | i611116;
                            i38 = (i611116 ^ i611117) + ((i611116 & i611117) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case IMediaSession.Stub.TRANSACTION_fastForward /* 22 */:
                            z = false;
                            ak.O(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, false);
                            i2 = length;
                            entry3 = null;
                            int i511111113 = (i38 & (-114)) | ((~i38) & 113);
                            int i511111114 = -(-((i38 & 113) << 1));
                            int i511111115 = ((i511111113 | i511111114) << 1) - (i511111113 ^ i511111114);
                            int i611118 = i511111115 & (-110);
                            int i611119 = (i511111115 ^ (-110)) | i611118;
                            i38 = (i611118 ^ i611119) + ((i611118 & i611119) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case IMediaSession.Stub.TRANSACTION_rewind /* 23 */:
                            z = false;
                            ak.H(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, false);
                            i2 = length;
                            entry3 = null;
                            int i511111116 = (i38 & (-114)) | ((~i38) & 113);
                            int i511111117 = -(-((i38 & 113) << 1));
                            int i511111118 = ((i511111116 | i511111117) << 1) - (i511111116 ^ i511111117);
                            int i6111110 = i511111118 & (-110);
                            int i6111111 = (i511111118 ^ (-110)) | i6111110;
                            i38 = (i6111110 ^ i6111111) + ((i6111110 & i6111111) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case IMediaSession.Stub.TRANSACTION_seekTo /* 24 */:
                            z = false;
                            ak.K(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, false);
                            i2 = length;
                            entry3 = null;
                            int i511111119 = (i38 & (-114)) | ((~i38) & 113);
                            int i5111111110 = -(-((i38 & 113) << 1));
                            int i5111111111 = ((i511111119 | i5111111110) << 1) - (i511111119 ^ i5111111110);
                            int i6111112 = i5111111111 & (-110);
                            int i6111113 = (i5111111111 ^ (-110)) | i6111112;
                            i38 = (i6111112 ^ i6111113) + ((i6111112 & i6111113) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case IMediaSession.Stub.TRANSACTION_rate /* 25 */:
                            i16 = this.f[i38];
                            int i119 = b + 65;
                            a = i119 % 128;
                            int i120 = i119 % 2;
                            list = (List) unsafe.getObject(t, jL);
                            i17 = b + 103;
                            a = i17 % 128;
                            if (i17 % 2 != 0) {
                                z = false;
                                ak.E(i16, list, interfaceC0051g, false);
                                i2 = length;
                                entry3 = null;
                                int i5111111112 = (i38 & (-114)) | ((~i38) & 113);
                                int i5111111113 = -(-((i38 & 113) << 1));
                                int i5111111114 = ((i5111111112 | i5111111113) << 1) - (i5111111112 ^ i5111111113);
                                int i6111114 = i5111111114 & (-110);
                                int i6111115 = (i5111111114 ^ (-110)) | i6111114;
                                i38 = (i6111114 ^ i6111115) + ((i6111114 & i6111115) << 1);
                                entry = entry2;
                                length = i2;
                            } else {
                                ak.E(i16, list, interfaceC0051g, true);
                                i2 = length;
                                entry3 = null;
                                int i5111111115 = (i38 & (-114)) | ((~i38) & 113);
                                int i5111111116 = -(-((i38 & 113) << 1));
                                int i5111111117 = ((i5111111115 | i5111111116) << 1) - (i5111111115 ^ i5111111116);
                                int i6111116 = i5111111117 & (-110);
                                int i6111117 = (i5111111117 ^ (-110)) | i6111116;
                                i38 = (i6111116 ^ i6111117) + ((i6111116 & i6111117) << 1);
                                entry = entry2;
                                length = i2;
                            }
                            break;
                        case IMediaSession.Stub.TRANSACTION_sendCustomAction /* 26 */:
                            ak.U(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g);
                            i2 = length;
                            entry3 = null;
                            int i5111111118 = (i38 & (-114)) | ((~i38) & 113);
                            int i5111111119 = -(-((i38 & 113) << 1));
                            int i51111111110 = ((i5111111118 | i5111111119) << 1) - (i5111111118 ^ i5111111119);
                            int i6111118 = i51111111110 & (-110);
                            int i6111119 = (i51111111110 ^ (-110)) | i6111118;
                            i38 = (i6111118 ^ i6111119) + ((i6111118 & i6111119) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case IMediaSession.Stub.TRANSACTION_getMetadata /* 27 */:
                            ak.P(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, K(i38));
                            i2 = length;
                            entry3 = null;
                            int i51111111111 = (i38 & (-114)) | ((~i38) & 113);
                            int i51111111112 = -(-((i38 & 113) << 1));
                            int i51111111113 = ((i51111111111 | i51111111112) << 1) - (i51111111111 ^ i51111111112);
                            int i61111110 = i51111111113 & (-110);
                            int i61111111 = (i51111111113 ^ (-110)) | i61111110;
                            i38 = (i61111110 ^ i61111111) + ((i61111110 & i61111111) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case IMediaSession.Stub.TRANSACTION_getPlaybackState /* 28 */:
                            i18 = this.f[i38];
                            object2 = unsafe.getObject(t, jL);
                            int i121 = a;
                            i19 = ((i121 ^ 108) + ((i121 & 108) << 1)) - 1;
                            b = i19 % 128;
                            if (i19 % 2 == 0) {
                                ak.F(i18, (List) object2, interfaceC0051g);
                                int i122 = 26 / 0;
                            } else {
                                ak.F(i18, (List) object2, interfaceC0051g);
                            }
                            i2 = length;
                            entry3 = null;
                            int i51111111114 = (i38 & (-114)) | ((~i38) & 113);
                            int i51111111115 = -(-((i38 & 113) << 1));
                            int i51111111116 = ((i51111111114 | i51111111115) << 1) - (i51111111114 ^ i51111111115);
                            int i61111112 = i51111111116 & (-110);
                            int i61111113 = (i51111111116 ^ (-110)) | i61111112;
                            i38 = (i61111112 ^ i61111113) + ((i61111112 & i61111113) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case IMediaSession.Stub.TRANSACTION_getQueue /* 29 */:
                            i20 = this.f[i38];
                            list2 = (List) unsafe.getObject(t, jL);
                            int i123 = b;
                            i21 = (i123 ^ 119) + ((i123 & 119) << 1);
                            a = i21 % 128;
                            if (i21 % 2 != 0) {
                                z2 = false;
                                ak.R(i20, list2, interfaceC0051g, false);
                                i2 = length;
                                entry3 = null;
                                int i51111111117 = (i38 & (-114)) | ((~i38) & 113);
                                int i51111111118 = -(-((i38 & 113) << 1));
                                int i51111111119 = ((i51111111117 | i51111111118) << 1) - (i51111111117 ^ i51111111118);
                                int i61111114 = i51111111119 & (-110);
                                int i61111115 = (i51111111119 ^ (-110)) | i61111114;
                                i38 = (i61111114 ^ i61111115) + ((i61111114 & i61111115) << 1);
                                entry = entry2;
                                length = i2;
                            } else {
                                ak.R(i20, list2, interfaceC0051g, true);
                                i2 = length;
                                entry3 = null;
                                int i511111111110 = (i38 & (-114)) | ((~i38) & 113);
                                int i511111111111 = -(-((i38 & 113) << 1));
                                int i511111111112 = ((i511111111110 | i511111111111) << 1) - (i511111111110 ^ i511111111111);
                                int i61111116 = i511111111112 & (-110);
                                int i61111117 = (i511111111112 ^ (-110)) | i61111116;
                                i38 = (i61111116 ^ i61111117) + ((i61111116 & i61111117) << 1);
                                entry = entry2;
                                length = i2;
                            }
                            break;
                        case IMediaSession.Stub.TRANSACTION_getQueueTitle /* 30 */:
                            z = false;
                            ak.J(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, false);
                            i2 = length;
                            entry3 = null;
                            int i511111111113 = (i38 & (-114)) | ((~i38) & 113);
                            int i511111111114 = -(-((i38 & 113) << 1));
                            int i511111111115 = ((i511111111113 | i511111111114) << 1) - (i511111111113 ^ i511111111114);
                            int i61111118 = i511111111115 & (-110);
                            int i61111119 = (i511111111115 ^ (-110)) | i61111118;
                            i38 = (i61111118 ^ i61111119) + ((i61111118 & i61111119) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case IMediaSession.Stub.TRANSACTION_getExtras /* 31 */:
                            i22 = this.f[i38];
                            object3 = unsafe.getObject(t, jL);
                            int i124 = a;
                            int i125 = (i124 & (-44)) | ((~i124) & 43);
                            int i126 = -(-((i124 & 43) << 1));
                            i23 = (i125 & i126) + (i126 | i125);
                            b = i23 % 128;
                            if (i23 % 2 == 0) {
                                z = false;
                                ak.Q(i22, (List) object3, interfaceC0051g, false);
                                i2 = length;
                                entry3 = null;
                                int i511111111116 = (i38 & (-114)) | ((~i38) & 113);
                                int i511111111117 = -(-((i38 & 113) << 1));
                                int i511111111118 = ((i511111111116 | i511111111117) << 1) - (i511111111116 ^ i511111111117);
                                int i611111110 = i511111111118 & (-110);
                                int i611111111 = (i511111111118 ^ (-110)) | i611111110;
                                i38 = (i611111110 ^ i611111111) + ((i611111110 & i611111111) << 1);
                                entry = entry2;
                                length = i2;
                            } else {
                                ak.Q(i22, (List) object3, interfaceC0051g, true);
                                i2 = length;
                                entry3 = null;
                                int i511111111119 = (i38 & (-114)) | ((~i38) & 113);
                                int i5111111111110 = -(-((i38 & 113) << 1));
                                int i5111111111111 = ((i511111111119 | i5111111111110) << 1) - (i511111111119 ^ i5111111111110);
                                int i611111112 = i5111111111111 & (-110);
                                int i611111113 = (i5111111111111 ^ (-110)) | i611111112;
                                i38 = (i611111112 ^ i611111113) + ((i611111112 & i611111113) << 1);
                                entry = entry2;
                                length = i2;
                            }
                            break;
                        case IMediaSession.Stub.TRANSACTION_getRatingType /* 32 */:
                            i24 = this.f[i38];
                            list3 = (List) unsafe.getObject(t, jL);
                            int i127 = a;
                            int i128 = (i127 | 65) << 1;
                            int i129 = -(i127 ^ 65);
                            i25 = (i128 & i129) + (i129 | i128);
                            b = i25 % 128;
                            if (i25 % 2 == 0) {
                                z2 = false;
                                ak.G(i24, list3, interfaceC0051g, false);
                                int i130 = 81 / 0;
                            } else {
                                z2 = false;
                                ak.G(i24, list3, interfaceC0051g, false);
                            }
                            i2 = length;
                            entry3 = null;
                            int i5111111111112 = (i38 & (-114)) | ((~i38) & 113);
                            int i5111111111113 = -(-((i38 & 113) << 1));
                            int i5111111111114 = ((i5111111111112 | i5111111111113) << 1) - (i5111111111112 ^ i5111111111113);
                            int i611111114 = i5111111111114 & (-110);
                            int i611111115 = (i5111111111114 ^ (-110)) | i611111114;
                            i38 = (i611111114 ^ i611111115) + ((i611111114 & i611111115) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case IMediaSession.Stub.TRANSACTION_prepare /* 33 */:
                            int i131 = this.f[i38];
                            Object object5 = unsafe.getObject(t, jL);
                            int i132 = a;
                            int i133 = i132 & 41;
                            int i134 = -(-((i132 ^ 41) | i133));
                            int i135 = ((i133 | i134) << 1) - (i134 ^ i133);
                            b = i135 % 128;
                            int i136 = i135 % 2;
                            ak.T(i131, (List) object5, interfaceC0051g, false);
                            int i137 = b + 103;
                            a = i137 % 128;
                            int i138 = i137 % 2;
                            i2 = length;
                            entry3 = null;
                            int i5111111111115 = (i38 & (-114)) | ((~i38) & 113);
                            int i5111111111116 = -(-((i38 & 113) << 1));
                            int i5111111111117 = ((i5111111111115 | i5111111111116) << 1) - (i5111111111115 ^ i5111111111116);
                            int i611111116 = i5111111111117 & (-110);
                            int i611111117 = (i5111111111117 ^ (-110)) | i611111116;
                            i38 = (i611111116 ^ i611111117) + ((i611111116 & i611111117) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case IMediaSession.Stub.TRANSACTION_prepareFromMediaId /* 34 */:
                            int i139 = this.f[i38];
                            List list5 = (List) unsafe.getObject(t, jL);
                            z2 = false;
                            ak.S(i139, list5, interfaceC0051g, false);
                            i2 = length;
                            entry3 = null;
                            int i5111111111118 = (i38 & (-114)) | ((~i38) & 113);
                            int i5111111111119 = -(-((i38 & 113) << 1));
                            int i51111111111110 = ((i5111111111118 | i5111111111119) << 1) - (i5111111111118 ^ i5111111111119);
                            int i611111118 = i51111111111110 & (-110);
                            int i611111119 = (i51111111111110 ^ (-110)) | i611111118;
                            i38 = (i611111118 ^ i611111119) + ((i611111118 & i611111119) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case IMediaSession.Stub.TRANSACTION_prepareFromSearch /* 35 */:
                            int i140 = this.f[i38];
                            Object object6 = unsafe.getObject(t, jL);
                            int i141 = b;
                            int i142 = i141 & 5;
                            int i143 = (i141 ^ 5) | i142;
                            int i144 = ((i142 | i143) << 1) - (i143 ^ i142);
                            a = i144 % 128;
                            int i145 = i144 % 2;
                            ak.I(i140, (List) object6, interfaceC0051g, true);
                            i2 = length;
                            entry3 = null;
                            int i51111111111111 = (i38 & (-114)) | ((~i38) & 113);
                            int i51111111111112 = -(-((i38 & 113) << 1));
                            int i51111111111113 = ((i51111111111111 | i51111111111112) << 1) - (i51111111111111 ^ i51111111111112);
                            int i6111111110 = i51111111111113 & (-110);
                            int i6111111111 = (i51111111111113 ^ (-110)) | i6111111110;
                            i38 = (i6111111110 ^ i6111111111) + ((i6111111110 & i6111111111) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case IMediaSession.Stub.TRANSACTION_prepareFromUri /* 36 */:
                            ak.L(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, true);
                            i2 = length;
                            entry3 = null;
                            int i51111111111114 = (i38 & (-114)) | ((~i38) & 113);
                            int i51111111111115 = -(-((i38 & 113) << 1));
                            int i51111111111116 = ((i51111111111114 | i51111111111115) << 1) - (i51111111111114 ^ i51111111111115);
                            int i6111111112 = i51111111111116 & (-110);
                            int i6111111113 = (i51111111111116 ^ (-110)) | i6111111112;
                            i38 = (i6111111112 ^ i6111111113) + ((i6111111112 & i6111111113) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case IMediaSession.Stub.TRANSACTION_getRepeatMode /* 37 */:
                            ak.N(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, true);
                            int i146 = a;
                            int i147 = i146 & 23;
                            int i148 = ((i146 ^ 23) | i147) << 1;
                            int i149 = -((i146 | 23) & (~i147));
                            int i150 = ((i148 | i149) << 1) - (i149 ^ i148);
                            b = i150 % 128;
                            int i151 = i150 % 2;
                            i2 = length;
                            entry3 = null;
                            int i51111111111117 = (i38 & (-114)) | ((~i38) & 113);
                            int i51111111111118 = -(-((i38 & 113) << 1));
                            int i51111111111119 = ((i51111111111117 | i51111111111118) << 1) - (i51111111111117 ^ i51111111111118);
                            int i6111111114 = i51111111111119 & (-110);
                            int i6111111115 = (i51111111111119 ^ (-110)) | i6111111114;
                            i38 = (i6111111114 ^ i6111111115) + ((i6111111114 & i6111111115) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case IMediaSession.Stub.TRANSACTION_isShuffleModeEnabledRemoved /* 38 */:
                            ak.V(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, true);
                            i2 = length;
                            entry3 = null;
                            int i511111111111110 = (i38 & (-114)) | ((~i38) & 113);
                            int i511111111111111 = -(-((i38 & 113) << 1));
                            int i511111111111112 = ((i511111111111110 | i511111111111111) << 1) - (i511111111111110 ^ i511111111111111);
                            int i6111111116 = i511111111111112 & (-110);
                            int i6111111117 = (i511111111111112 ^ (-110)) | i6111111116;
                            i38 = (i6111111116 ^ i6111111117) + ((i6111111116 & i6111111117) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case IMediaSession.Stub.TRANSACTION_setRepeatMode /* 39 */:
                            ak.O(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, true);
                            int i152 = a;
                            int i153 = (((i152 | 98) << 1) - (i152 ^ 98)) - 1;
                            b = i153 % 128;
                            int i154 = i153 % 2;
                            i2 = length;
                            entry3 = null;
                            int i511111111111113 = (i38 & (-114)) | ((~i38) & 113);
                            int i511111111111114 = -(-((i38 & 113) << 1));
                            int i511111111111115 = ((i511111111111113 | i511111111111114) << 1) - (i511111111111113 ^ i511111111111114);
                            int i6111111118 = i511111111111115 & (-110);
                            int i6111111119 = (i511111111111115 ^ (-110)) | i6111111118;
                            i38 = (i6111111118 ^ i6111111119) + ((i6111111118 & i6111111119) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case IMediaSession.Stub.TRANSACTION_setShuffleModeEnabledRemoved /* 40 */:
                            ak.H(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, true);
                            i2 = length;
                            entry3 = null;
                            int i511111111111116 = (i38 & (-114)) | ((~i38) & 113);
                            int i511111111111117 = -(-((i38 & 113) << 1));
                            int i511111111111118 = ((i511111111111116 | i511111111111117) << 1) - (i511111111111116 ^ i511111111111117);
                            int i61111111110 = i511111111111118 & (-110);
                            int i61111111111 = (i511111111111118 ^ (-110)) | i61111111110;
                            i38 = (i61111111110 ^ i61111111111) + ((i61111111110 & i61111111111) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case IMediaSession.Stub.TRANSACTION_addQueueItem /* 41 */:
                            i26 = this.f[i38];
                            object4 = unsafe.getObject(t, jL);
                            int i155 = b;
                            int i156 = i155 & 101;
                            int i157 = (i155 ^ 101) | i156;
                            i27 = (i156 ^ i157) + ((i157 & i156) << 1);
                            a = i27 % 128;
                            if (i27 % 2 != 0) {
                                ak.K(i26, (List) object4, interfaceC0051g, false);
                            } else {
                                ak.K(i26, (List) object4, interfaceC0051g, true);
                            }
                            i2 = length;
                            entry3 = null;
                            int i511111111111119 = (i38 & (-114)) | ((~i38) & 113);
                            int i5111111111111110 = -(-((i38 & 113) << 1));
                            int i5111111111111111 = ((i511111111111119 | i5111111111111110) << 1) - (i511111111111119 ^ i5111111111111110);
                            int i61111111112 = i5111111111111111 & (-110);
                            int i61111111113 = (i5111111111111111 ^ (-110)) | i61111111112;
                            i38 = (i61111111112 ^ i61111111113) + ((i61111111112 & i61111111113) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case IMediaSession.Stub.TRANSACTION_addQueueItemAt /* 42 */:
                            ak.E(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, true);
                            i2 = length;
                            entry3 = null;
                            int i5111111111111112 = (i38 & (-114)) | ((~i38) & 113);
                            int i5111111111111113 = -(-((i38 & 113) << 1));
                            int i5111111111111114 = ((i5111111111111112 | i5111111111111113) << 1) - (i5111111111111112 ^ i5111111111111113);
                            int i61111111114 = i5111111111111114 & (-110);
                            int i61111111115 = (i5111111111111114 ^ (-110)) | i61111111114;
                            i38 = (i61111111114 ^ i61111111115) + ((i61111111114 & i61111111115) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case IMediaSession.Stub.TRANSACTION_removeQueueItem /* 43 */:
                            ak.R(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, true);
                            i2 = length;
                            entry3 = null;
                            int i5111111111111115 = (i38 & (-114)) | ((~i38) & 113);
                            int i5111111111111116 = -(-((i38 & 113) << 1));
                            int i5111111111111117 = ((i5111111111111115 | i5111111111111116) << 1) - (i5111111111111115 ^ i5111111111111116);
                            int i61111111116 = i5111111111111117 & (-110);
                            int i61111111117 = (i5111111111111117 ^ (-110)) | i61111111116;
                            i38 = (i61111111116 ^ i61111111117) + ((i61111111116 & i61111111117) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case IMediaSession.Stub.TRANSACTION_removeQueueItemAt /* 44 */:
                            int i158 = this.f[i38];
                            List list6 = (List) unsafe.getObject(t, jL);
                            int i159 = b;
                            int i160 = i159 & 33;
                            int i161 = -(-((i159 ^ 33) | i160));
                            int i162 = (i160 ^ i161) + ((i161 & i160) << 1);
                            a = i162 % 128;
                            int i163 = i162 % 2;
                            ak.J(i158, list6, interfaceC0051g, true);
                            i2 = length;
                            entry3 = null;
                            int i5111111111111118 = (i38 & (-114)) | ((~i38) & 113);
                            int i5111111111111119 = -(-((i38 & 113) << 1));
                            int i51111111111111110 = ((i5111111111111118 | i5111111111111119) << 1) - (i5111111111111118 ^ i5111111111111119);
                            int i61111111118 = i51111111111111110 & (-110);
                            int i61111111119 = (i51111111111111110 ^ (-110)) | i61111111118;
                            i38 = (i61111111118 ^ i61111111119) + ((i61111111118 & i61111111119) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case IMediaSession.Stub.TRANSACTION_isCaptioningEnabled /* 45 */:
                            ak.Q(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, true);
                            int i164 = b + 49;
                            a = i164 % 128;
                            int i165 = i164 % 2;
                            i2 = length;
                            entry3 = null;
                            int i51111111111111111 = (i38 & (-114)) | ((~i38) & 113);
                            int i51111111111111112 = -(-((i38 & 113) << 1));
                            int i51111111111111113 = ((i51111111111111111 | i51111111111111112) << 1) - (i51111111111111111 ^ i51111111111111112);
                            int i611111111110 = i51111111111111113 & (-110);
                            int i611111111111 = (i51111111111111113 ^ (-110)) | i611111111110;
                            i38 = (i611111111110 ^ i611111111111) + ((i611111111110 & i611111111111) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case IMediaSession.Stub.TRANSACTION_setCaptioningEnabled /* 46 */:
                            ak.G(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, true);
                            i2 = length;
                            entry3 = null;
                            int i51111111111111114 = (i38 & (-114)) | ((~i38) & 113);
                            int i51111111111111115 = -(-((i38 & 113) << 1));
                            int i51111111111111116 = ((i51111111111111114 | i51111111111111115) << 1) - (i51111111111111114 ^ i51111111111111115);
                            int i611111111112 = i51111111111111116 & (-110);
                            int i611111111113 = (i51111111111111116 ^ (-110)) | i611111111112;
                            i38 = (i611111111112 ^ i611111111113) + ((i611111111112 & i611111111113) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case IMediaSession.Stub.TRANSACTION_getShuffleMode /* 47 */:
                            int i166 = this.f[i38];
                            Object object7 = unsafe.getObject(t, jL);
                            int i167 = a;
                            int i168 = (((i167 & (-4)) | (3 & (~i167))) - (~(-(-((i167 & 3) << 1))))) - 1;
                            b = i168 % 128;
                            int i169 = i168 % 2;
                            ak.T(i166, (List) object7, interfaceC0051g, true);
                            i2 = length;
                            entry3 = null;
                            int i51111111111111117 = (i38 & (-114)) | ((~i38) & 113);
                            int i51111111111111118 = -(-((i38 & 113) << 1));
                            int i51111111111111119 = ((i51111111111111117 | i51111111111111118) << 1) - (i51111111111111117 ^ i51111111111111118);
                            int i611111111114 = i51111111111111119 & (-110);
                            int i611111111115 = (i51111111111111119 ^ (-110)) | i611111111114;
                            i38 = (i611111111114 ^ i611111111115) + ((i611111111114 & i611111111115) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case IMediaSession.Stub.TRANSACTION_setShuffleMode /* 48 */:
                            ak.S(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, true);
                            i2 = length;
                            entry3 = null;
                            int i511111111111111110 = (i38 & (-114)) | ((~i38) & 113);
                            int i511111111111111111 = -(-((i38 & 113) << 1));
                            int i511111111111111112 = ((i511111111111111110 | i511111111111111111) << 1) - (i511111111111111110 ^ i511111111111111111);
                            int i611111111116 = i511111111111111112 & (-110);
                            int i611111111117 = (i511111111111111112 ^ (-110)) | i611111111116;
                            i38 = (i611111111116 ^ i611111111117) + ((i611111111116 & i611111111117) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case 49:
                            int i170 = this.f[i38];
                            int i171 = a;
                            i28 = (i171 ^ 123) + ((i171 & 123) << 1);
                            b = i28 % 128;
                            if (i28 % 2 == 0) {
                                list4 = (List) unsafe.getObject(t, jL);
                                ahVarK2 = K(i38);
                                int i172 = 46 / 0;
                            } else {
                                list4 = (List) unsafe.getObject(t, jL);
                                ahVarK2 = K(i38);
                            }
                            ak.M(i170, list4, interfaceC0051g, ahVarK2);
                            int i173 = a;
                            int i174 = (i173 ^ 39) + ((i173 & 39) << 1);
                            b = i174 % 128;
                            int i175 = i174 % 2;
                            i2 = length;
                            entry3 = null;
                            int i511111111111111113 = (i38 & (-114)) | ((~i38) & 113);
                            int i511111111111111114 = -(-((i38 & 113) << 1));
                            int i511111111111111115 = ((i511111111111111113 | i511111111111111114) << 1) - (i511111111111111113 ^ i511111111111111114);
                            int i611111111118 = i511111111111111115 & (-110);
                            int i611111111119 = (i511111111111111115 ^ (-110)) | i611111111118;
                            i38 = (i611111111118 ^ i611111111119) + ((i611111111118 & i611111111119) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case 50:
                            ai(interfaceC0051g, i41, unsafe.getObject(t, jL), i38);
                            i2 = length;
                            entry3 = null;
                            int i511111111111111116 = (i38 & (-114)) | ((~i38) & 113);
                            int i511111111111111117 = -(-((i38 & 113) << 1));
                            int i511111111111111118 = ((i511111111111111116 | i511111111111111117) << 1) - (i511111111111111116 ^ i511111111111111117);
                            int i6111111111110 = i511111111111111118 & (-110);
                            int i6111111111111 = (i511111111111111118 ^ (-110)) | i6111111111110;
                            i38 = (i6111111111110 ^ i6111111111111) + ((i6111111111110 & i6111111111111) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case IMediaSession.Stub.TRANSACTION_rateWithExtras /* 51 */:
                            if (P(t, i41, i38)) {
                                double dQ = q(t, jL);
                                int i176 = b;
                                int i177 = ((i176 ^ 77) | (i176 & 77)) << 1;
                                int i178 = -((i176 & (-78)) | ((~i176) & 77));
                                int i179 = (i177 ^ i178) + ((i178 & i177) << 1);
                                a = i179 % 128;
                                int i180 = i179 % 2;
                                ((C0055l) interfaceC0051g).c(i41, dQ);
                            }
                            i2 = length;
                            entry3 = null;
                            int i511111111111111119 = (i38 & (-114)) | ((~i38) & 113);
                            int i5111111111111111110 = -(-((i38 & 113) << 1));
                            int i5111111111111111111 = ((i511111111111111119 | i5111111111111111110) << 1) - (i511111111111111119 ^ i5111111111111111110);
                            int i6111111111112 = i5111111111111111111 & (-110);
                            int i6111111111113 = (i5111111111111111111 ^ (-110)) | i6111111111112;
                            i38 = (i6111111111112 ^ i6111111111113) + ((i6111111111112 & i6111111111113) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case 52:
                            if (P(t, i41, i38)) {
                                ((C0055l) interfaceC0051g).d(i41, r(t, jL));
                            }
                            i2 = length;
                            entry3 = null;
                            int i5111111111111111112 = (i38 & (-114)) | ((~i38) & 113);
                            int i5111111111111111113 = -(-((i38 & 113) << 1));
                            int i5111111111111111114 = ((i5111111111111111112 | i5111111111111111113) << 1) - (i5111111111111111112 ^ i5111111111111111113);
                            int i6111111111114 = i5111111111111111114 & (-110);
                            int i6111111111115 = (i5111111111111111114 ^ (-110)) | i6111111111114;
                            i38 = (i6111111111114 ^ i6111111111115) + ((i6111111111114 & i6111111111115) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case 53:
                            if (P(t, i41, i38)) {
                                long jT2 = t(t, jL);
                                int i181 = b;
                                int i182 = i181 & 1;
                                int i183 = -(-((i181 ^ 1) | i182));
                                int i184 = (i182 & i183) + (i183 | i182);
                                a = i184 % 128;
                                int i185 = i184 % 2;
                                ((C0055l) interfaceC0051g).c.cr(i41, jT2);
                            }
                            i2 = length;
                            entry3 = null;
                            int i5111111111111111115 = (i38 & (-114)) | ((~i38) & 113);
                            int i5111111111111111116 = -(-((i38 & 113) << 1));
                            int i5111111111111111117 = ((i5111111111111111115 | i5111111111111111116) << 1) - (i5111111111111111115 ^ i5111111111111111116);
                            int i6111111111116 = i5111111111111111117 & (-110);
                            int i6111111111117 = (i5111111111111111117 ^ (-110)) | i6111111111116;
                            i38 = (i6111111111116 ^ i6111111111117) + ((i6111111111116 & i6111111111117) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case 54:
                            if (P(t, i41, i38)) {
                                int i186 = b;
                                int i187 = ((i186 | 39) << 1) - (i186 ^ 39);
                                a = i187 % 128;
                                int i188 = i187 % 2;
                                ((C0055l) interfaceC0051g).c.cr(i41, t(t, jL));
                            }
                            i2 = length;
                            entry3 = null;
                            int i5111111111111111118 = (i38 & (-114)) | ((~i38) & 113);
                            int i5111111111111111119 = -(-((i38 & 113) << 1));
                            int i51111111111111111110 = ((i5111111111111111118 | i5111111111111111119) << 1) - (i5111111111111111118 ^ i5111111111111111119);
                            int i6111111111118 = i51111111111111111110 & (-110);
                            int i6111111111119 = (i51111111111111111110 ^ (-110)) | i6111111111118;
                            i38 = (i6111111111118 ^ i6111111111119) + ((i6111111111118 & i6111111111119) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case 55:
                            if (!(!P(t, i41, i38))) {
                                ((C0055l) interfaceC0051g).c.ci(i41, s(t, jL));
                            }
                            i2 = length;
                            entry3 = null;
                            int i51111111111111111111 = (i38 & (-114)) | ((~i38) & 113);
                            int i51111111111111111112 = -(-((i38 & 113) << 1));
                            int i51111111111111111113 = ((i51111111111111111111 | i51111111111111111112) << 1) - (i51111111111111111111 ^ i51111111111111111112);
                            int i61111111111110 = i51111111111111111113 & (-110);
                            int i61111111111111 = (i51111111111111111113 ^ (-110)) | i61111111111110;
                            i38 = (i61111111111110 ^ i61111111111111) + ((i61111111111110 & i61111111111111) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case 56:
                            if (P(t, i41, i38)) {
                                jT = t(t, jL);
                                abstractC0064u3 = ((C0055l) interfaceC0051g).c;
                                int i189 = b;
                                i29 = (i189 ^ 15) + ((i189 & 15) << 1);
                                a = i29 % 128;
                                if (i29 % 2 != 0) {
                                    abstractC0064u3.cg(i41, jT);
                                    int i190 = 56 / 0;
                                } else {
                                    abstractC0064u3.cg(i41, jT);
                                }
                            }
                            i2 = length;
                            entry3 = null;
                            int i51111111111111111114 = (i38 & (-114)) | ((~i38) & 113);
                            int i51111111111111111115 = -(-((i38 & 113) << 1));
                            int i51111111111111111116 = ((i51111111111111111114 | i51111111111111111115) << 1) - (i51111111111111111114 ^ i51111111111111111115);
                            int i61111111111112 = i51111111111111111116 & (-110);
                            int i61111111111113 = (i51111111111111111116 ^ (-110)) | i61111111111112;
                            i38 = (i61111111111112 ^ i61111111111113) + ((i61111111111112 & i61111111111113) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case 57:
                            if (P(t, i41, i38)) {
                                int i191 = a + 105;
                                b = i191 % 128;
                                int i192 = i191 % 2;
                                ((C0055l) interfaceC0051g).c.ce(i41, s(t, jL));
                            }
                            i2 = length;
                            entry3 = null;
                            int i51111111111111111117 = (i38 & (-114)) | ((~i38) & 113);
                            int i51111111111111111118 = -(-((i38 & 113) << 1));
                            int i51111111111111111119 = ((i51111111111111111117 | i51111111111111111118) << 1) - (i51111111111111111117 ^ i51111111111111111118);
                            int i61111111111114 = i51111111111111111119 & (-110);
                            int i61111111111115 = (i51111111111111111119 ^ (-110)) | i61111111111114;
                            i38 = (i61111111111114 ^ i61111111111115) + ((i61111111111114 & i61111111111115) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case 58:
                            if (P(t, i41, i38)) {
                                ((C0055l) interfaceC0051g).c.cd(i41, p(t, jL));
                            }
                            i2 = length;
                            entry3 = null;
                            int i511111111111111111110 = (i38 & (-114)) | ((~i38) & 113);
                            int i511111111111111111111 = -(-((i38 & 113) << 1));
                            int i511111111111111111112 = ((i511111111111111111110 | i511111111111111111111) << 1) - (i511111111111111111110 ^ i511111111111111111111);
                            int i61111111111116 = i511111111111111111112 & (-110);
                            int i61111111111117 = (i511111111111111111112 ^ (-110)) | i61111111111116;
                            i38 = (i61111111111116 ^ i61111111111117) + ((i61111111111116 & i61111111111117) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case 59:
                            if (P(t, i41, i38)) {
                                int i193 = a;
                                int i194 = (((i193 | 52) << 1) - (i193 ^ 52)) - 1;
                                b = i194 % 128;
                                int i195 = i194 % 2;
                                Object object8 = unsafe.getObject(t, jL);
                                int i196 = a;
                                int i197 = i196 & 19;
                                int i198 = ((((i196 ^ 19) | i197) << 1) - (~(-((i196 | 19) & (~i197))))) - 1;
                                b = i198 % 128;
                                int i199 = i198 % 2;
                                aj(i41, object8, interfaceC0051g);
                                int i200 = a + 21;
                                b = i200 % 128;
                                int i201 = i200 % 2;
                            }
                            i2 = length;
                            entry3 = null;
                            int i511111111111111111113 = (i38 & (-114)) | ((~i38) & 113);
                            int i511111111111111111114 = -(-((i38 & 113) << 1));
                            int i511111111111111111115 = ((i511111111111111111113 | i511111111111111111114) << 1) - (i511111111111111111113 ^ i511111111111111111114);
                            int i61111111111118 = i511111111111111111115 & (-110);
                            int i61111111111119 = (i511111111111111111115 ^ (-110)) | i61111111111118;
                            i38 = (i61111111111118 ^ i61111111111119) + ((i61111111111118 & i61111111111119) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case 60:
                            if (P(t, i41, i38)) {
                                ((C0055l) interfaceC0051g).f(i41, unsafe.getObject(t, jL), K(i38));
                            }
                            i2 = length;
                            entry3 = null;
                            int i511111111111111111116 = (i38 & (-114)) | ((~i38) & 113);
                            int i511111111111111111117 = -(-((i38 & 113) << 1));
                            int i511111111111111111118 = ((i511111111111111111116 | i511111111111111111117) << 1) - (i511111111111111111116 ^ i511111111111111111117);
                            int i611111111111110 = i511111111111111111118 & (-110);
                            int i611111111111111 = (i511111111111111111118 ^ (-110)) | i611111111111110;
                            i38 = (i611111111111110 ^ i611111111111111) + ((i611111111111110 & i611111111111111) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case 61:
                            if (!(!P(t, i41, i38))) {
                                int i202 = a;
                                i30 = (-2) - ((((i202 | 14) << 1) - (i202 ^ 14)) ^ (-1));
                                b = i30 % 128;
                                if (i30 % 2 != 0) {
                                    Object obj5 = null;
                                    obj5.hashCode();
                                    throw null;
                                }
                                ((C0055l) interfaceC0051g).c.cc(i41, (AbstractC0069z) unsafe.getObject(t, jL));
                            }
                            i2 = length;
                            entry3 = null;
                            int i511111111111111111119 = (i38 & (-114)) | ((~i38) & 113);
                            int i5111111111111111111110 = -(-((i38 & 113) << 1));
                            int i5111111111111111111111 = ((i511111111111111111119 | i5111111111111111111110) << 1) - (i511111111111111111119 ^ i5111111111111111111110);
                            int i611111111111112 = i5111111111111111111111 & (-110);
                            int i611111111111113 = (i5111111111111111111111 ^ (-110)) | i611111111111112;
                            i38 = (i611111111111112 ^ i611111111111113) + ((i611111111111112 & i611111111111113) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case 62:
                            if (!(!P(t, i41, i38))) {
                                ((C0055l) interfaceC0051g).c.cq(i41, s(t, jL));
                            }
                            i2 = length;
                            entry3 = null;
                            int i5111111111111111111112 = (i38 & (-114)) | ((~i38) & 113);
                            int i5111111111111111111113 = -(-((i38 & 113) << 1));
                            int i5111111111111111111114 = ((i5111111111111111111112 | i5111111111111111111113) << 1) - (i5111111111111111111112 ^ i5111111111111111111113);
                            int i611111111111114 = i5111111111111111111114 & (-110);
                            int i611111111111115 = (i5111111111111111111114 ^ (-110)) | i611111111111114;
                            i38 = (i611111111111114 ^ i611111111111115) + ((i611111111111114 & i611111111111115) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case 63:
                            if (P(t, i41, i38)) {
                                ((C0055l) interfaceC0051g).c.ci(i41, s(t, jL));
                            }
                            i2 = length;
                            entry3 = null;
                            int i5111111111111111111115 = (i38 & (-114)) | ((~i38) & 113);
                            int i5111111111111111111116 = -(-((i38 & 113) << 1));
                            int i5111111111111111111117 = ((i5111111111111111111115 | i5111111111111111111116) << 1) - (i5111111111111111111115 ^ i5111111111111111111116);
                            int i611111111111116 = i5111111111111111111117 & (-110);
                            int i611111111111117 = (i5111111111111111111117 ^ (-110)) | i611111111111116;
                            i38 = (i611111111111116 ^ i611111111111117) + ((i611111111111116 & i611111111111117) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case 64:
                            if (P(t, i41, i38)) {
                                ((C0055l) interfaceC0051g).c.ce(i41, s(t, jL));
                            }
                            i2 = length;
                            entry3 = null;
                            int i5111111111111111111118 = (i38 & (-114)) | ((~i38) & 113);
                            int i5111111111111111111119 = -(-((i38 & 113) << 1));
                            int i51111111111111111111110 = ((i5111111111111111111118 | i5111111111111111111119) << 1) - (i5111111111111111111118 ^ i5111111111111111111119);
                            int i611111111111118 = i51111111111111111111110 & (-110);
                            int i611111111111119 = (i51111111111111111111110 ^ (-110)) | i611111111111118;
                            i38 = (i611111111111118 ^ i611111111111119) + ((i611111111111118 & i611111111111119) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case 65:
                            if (P(t, i41, i38)) {
                                ((C0055l) interfaceC0051g).c.cg(i41, t(t, jL));
                            }
                            i2 = length;
                            entry3 = null;
                            int i51111111111111111111111 = (i38 & (-114)) | ((~i38) & 113);
                            int i51111111111111111111112 = -(-((i38 & 113) << 1));
                            int i51111111111111111111113 = ((i51111111111111111111111 | i51111111111111111111112) << 1) - (i51111111111111111111111 ^ i51111111111111111111112);
                            int i6111111111111110 = i51111111111111111111113 & (-110);
                            int i6111111111111111 = (i51111111111111111111113 ^ (-110)) | i6111111111111110;
                            i38 = (i6111111111111110 ^ i6111111111111111) + ((i6111111111111110 & i6111111111111111) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case 66:
                            if (P(t, i41, i38)) {
                                ((C0055l) interfaceC0051g).g(i41, s(t, jL));
                            }
                            i2 = length;
                            entry3 = null;
                            int i51111111111111111111114 = (i38 & (-114)) | ((~i38) & 113);
                            int i51111111111111111111115 = -(-((i38 & 113) << 1));
                            int i51111111111111111111116 = ((i51111111111111111111114 | i51111111111111111111115) << 1) - (i51111111111111111111114 ^ i51111111111111111111115);
                            int i6111111111111112 = i51111111111111111111116 & (-110);
                            int i6111111111111113 = (i51111111111111111111116 ^ (-110)) | i6111111111111112;
                            i38 = (i6111111111111112 ^ i6111111111111113) + ((i6111111111111112 & i6111111111111113) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case 67:
                            if (P(t, i41, i38)) {
                                ((C0055l) interfaceC0051g).i(i41, t(t, jL));
                            }
                            i2 = length;
                            entry3 = null;
                            int i51111111111111111111117 = (i38 & (-114)) | ((~i38) & 113);
                            int i51111111111111111111118 = -(-((i38 & 113) << 1));
                            int i51111111111111111111119 = ((i51111111111111111111117 | i51111111111111111111118) << 1) - (i51111111111111111111117 ^ i51111111111111111111118);
                            int i6111111111111114 = i51111111111111111111119 & (-110);
                            int i6111111111111115 = (i51111111111111111111119 ^ (-110)) | i6111111111111114;
                            i38 = (i6111111111111114 ^ i6111111111111115) + ((i6111111111111114 & i6111111111111115) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        case 68:
                            if (P(t, i41, i38)) {
                                ((C0055l) interfaceC0051g).e(i41, unsafe.getObject(t, jL), K(i38));
                            }
                            i2 = length;
                            entry3 = null;
                            int i511111111111111111111110 = (i38 & (-114)) | ((~i38) & 113);
                            int i511111111111111111111111 = -(-((i38 & 113) << 1));
                            int i511111111111111111111112 = ((i511111111111111111111110 | i511111111111111111111111) << 1) - (i511111111111111111111110 ^ i511111111111111111111111);
                            int i6111111111111116 = i511111111111111111111112 & (-110);
                            int i6111111111111117 = (i511111111111111111111112 ^ (-110)) | i6111111111111116;
                            i38 = (i6111111111111116 ^ i6111111111111117) + ((i6111111111111116 & i6111111111111117) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                        default:
                            i2 = length;
                            entry3 = null;
                            int i511111111111111111111113 = (i38 & (-114)) | ((~i38) & 113);
                            int i511111111111111111111114 = -(-((i38 & 113) << 1));
                            int i511111111111111111111115 = ((i511111111111111111111113 | i511111111111111111111114) << 1) - (i511111111111111111111113 ^ i511111111111111111111114);
                            int i6111111111111118 = i511111111111111111111115 & (-110);
                            int i6111111111111119 = (i511111111111111111111115 ^ (-110)) | i6111111111111118;
                            i38 = (i6111111111111118 ^ i6111111111111119) + ((i6111111111111118 & i6111111111111119) << 1);
                            entry = entry2;
                            length = i2;
                            break;
                    }
                } else {
                    int i203 = a;
                    int i204 = (i203 & 39) + (i203 | 39);
                    b = i204 % 128;
                    int i205 = i204 % 2;
                    this.t.l(interfaceC0051g, entry);
                    entry = itN.hasNext() ? (Map.Entry) itN.next() : null;
                }
            }
            entry2 = entry;
            jL = l(iAg);
            switch (iV) {
                case 0:
                    i2 = length;
                    entry3 = null;
                    if ((i & i40) != 0) {
                        ((C0055l) interfaceC0051g).c(i41, ar.l(t, jL));
                    }
                    int i511111111111111111111116 = (i38 & (-114)) | ((~i38) & 113);
                    int i511111111111111111111117 = -(-((i38 & 113) << 1));
                    int i511111111111111111111118 = ((i511111111111111111111116 | i511111111111111111111117) << 1) - (i511111111111111111111116 ^ i511111111111111111111117);
                    int i61111111111111110 = i511111111111111111111118 & (-110);
                    int i61111111111111111 = (i511111111111111111111118 ^ (-110)) | i61111111111111110;
                    i38 = (i61111111111111110 ^ i61111111111111111) + ((i61111111111111110 & i61111111111111111) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case 1:
                    i2 = length;
                    if ((i & i40) != 0) {
                        int i620 = a;
                        i3 = ((i620 & (-10)) | ((~i620) & 9)) + ((i620 & 9) << 1);
                        b = i3 % 128;
                        if (i3 % 2 != 0) {
                            Object obj6 = null;
                            ar.m(t, jL);
                            obj6.hashCode();
                            throw null;
                        }
                        fM = ar.m(t, jL);
                        c0055l = (C0055l) interfaceC0051g;
                        int i621 = b;
                        int i622 = (i621 & (-116)) | ((~i621) & 115);
                        int i623 = (i621 & 115) << 1;
                        i4 = (i622 ^ i623) + ((i623 & i622) << 1);
                        a = i4 % 128;
                        if (i4 % 2 == 0) {
                            c0055l.d(i41, fM);
                            throw null;
                        }
                        c0055l.d(i41, fM);
                    }
                    entry3 = null;
                    int i511111111111111111111119 = (i38 & (-114)) | ((~i38) & 113);
                    int i5111111111111111111111110 = -(-((i38 & 113) << 1));
                    int i5111111111111111111111111 = ((i511111111111111111111119 | i5111111111111111111111110) << 1) - (i511111111111111111111119 ^ i5111111111111111111111110);
                    int i61111111111111112 = i5111111111111111111111111 & (-110);
                    int i61111111111111113 = (i5111111111111111111111111 ^ (-110)) | i61111111111111112;
                    i38 = (i61111111111111112 ^ i61111111111111113) + ((i61111111111111112 & i61111111111111113) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case 2:
                    i2 = length;
                    if ((i & i40) != 0) {
                        ((C0055l) interfaceC0051g).c.cr(i41, unsafe.getLong(t, jL));
                    }
                    entry3 = null;
                    int i5111111111111111111111112 = (i38 & (-114)) | ((~i38) & 113);
                    int i5111111111111111111111113 = -(-((i38 & 113) << 1));
                    int i5111111111111111111111114 = ((i5111111111111111111111112 | i5111111111111111111111113) << 1) - (i5111111111111111111111112 ^ i5111111111111111111111113);
                    int i61111111111111114 = i5111111111111111111111114 & (-110);
                    int i61111111111111115 = (i5111111111111111111111114 ^ (-110)) | i61111111111111114;
                    i38 = (i61111111111111114 ^ i61111111111111115) + ((i61111111111111114 & i61111111111111115) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case 3:
                    i2 = length;
                    if ((i & i40) != 0) {
                        ((C0055l) interfaceC0051g).c.cr(i41, unsafe.getLong(t, jL));
                        int i710 = a;
                        int i711 = i710 & 21;
                        int i712 = (((i710 | 21) & (~i711)) - (~(i711 << 1))) - 1;
                        b = i712 % 128;
                        int i713 = i712 % 2;
                    }
                    entry3 = null;
                    int i5111111111111111111111115 = (i38 & (-114)) | ((~i38) & 113);
                    int i5111111111111111111111116 = -(-((i38 & 113) << 1));
                    int i5111111111111111111111117 = ((i5111111111111111111111115 | i5111111111111111111111116) << 1) - (i5111111111111111111111115 ^ i5111111111111111111111116);
                    int i61111111111111116 = i5111111111111111111111117 & (-110);
                    int i61111111111111117 = (i5111111111111111111111117 ^ (-110)) | i61111111111111116;
                    i38 = (i61111111111111116 ^ i61111111111111117) + ((i61111111111111116 & i61111111111111117) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case 4:
                    i2 = length;
                    if ((i & i40) != 0) {
                        int i714 = b;
                        int i715 = i714 & 1;
                        int i716 = -(-((i714 ^ 1) | i715));
                        i5 = (i715 & i716) + (i716 | i715);
                        a = i5 % 128;
                        if (i5 % 2 != 0) {
                            i6 = unsafe.getInt(t, jL);
                            abstractC0064u = ((C0055l) interfaceC0051g).c;
                            int i717 = 38 / 0;
                        } else {
                            i6 = unsafe.getInt(t, jL);
                            abstractC0064u = ((C0055l) interfaceC0051g).c;
                        }
                        abstractC0064u.ci(i41, i6);
                    }
                    entry3 = null;
                    int i5111111111111111111111118 = (i38 & (-114)) | ((~i38) & 113);
                    int i5111111111111111111111119 = -(-((i38 & 113) << 1));
                    int i51111111111111111111111110 = ((i5111111111111111111111118 | i5111111111111111111111119) << 1) - (i5111111111111111111111118 ^ i5111111111111111111111119);
                    int i61111111111111118 = i51111111111111111111111110 & (-110);
                    int i61111111111111119 = (i51111111111111111111111110 ^ (-110)) | i61111111111111118;
                    i38 = (i61111111111111118 ^ i61111111111111119) + ((i61111111111111118 & i61111111111111119) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case 5:
                    i2 = length;
                    if ((i & i40) != 0) {
                        ((C0055l) interfaceC0051g).c.cg(i41, unsafe.getLong(t, jL));
                    }
                    entry3 = null;
                    int i51111111111111111111111111 = (i38 & (-114)) | ((~i38) & 113);
                    int i51111111111111111111111112 = -(-((i38 & 113) << 1));
                    int i51111111111111111111111113 = ((i51111111111111111111111111 | i51111111111111111111111112) << 1) - (i51111111111111111111111111 ^ i51111111111111111111111112);
                    int i611111111111111110 = i51111111111111111111111113 & (-110);
                    int i611111111111111111 = (i51111111111111111111111113 ^ (-110)) | i611111111111111110;
                    i38 = (i611111111111111110 ^ i611111111111111111) + ((i611111111111111110 & i611111111111111111) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case 6:
                    i2 = length;
                    if ((i & i40) != 0) {
                        i7 = unsafe.getInt(t, jL);
                        abstractC0064u2 = ((C0055l) interfaceC0051g).c;
                        int i718 = a;
                        int i719 = i718 & 59;
                        int i810 = (i718 | 59) & (~i719);
                        int i811 = i719 << 1;
                        i8 = (i810 ^ i811) + ((i810 & i811) << 1);
                        b = i8 % 128;
                        if (i8 % 2 == 0) {
                            abstractC0064u2.ce(i41, i7);
                            int i812 = 66 / 0;
                        } else {
                            abstractC0064u2.ce(i41, i7);
                        }
                    }
                    entry3 = null;
                    int i51111111111111111111111114 = (i38 & (-114)) | ((~i38) & 113);
                    int i51111111111111111111111115 = -(-((i38 & 113) << 1));
                    int i51111111111111111111111116 = ((i51111111111111111111111114 | i51111111111111111111111115) << 1) - (i51111111111111111111111114 ^ i51111111111111111111111115);
                    int i611111111111111112 = i51111111111111111111111116 & (-110);
                    int i611111111111111113 = (i51111111111111111111111116 ^ (-110)) | i611111111111111112;
                    i38 = (i611111111111111112 ^ i611111111111111113) + ((i611111111111111112 & i611111111111111113) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case 7:
                    i2 = length;
                    if ((i & i40) != 0) {
                        ((C0055l) interfaceC0051g).c.cd(i41, ar.h(t, jL));
                    }
                    entry3 = null;
                    int i51111111111111111111111117 = (i38 & (-114)) | ((~i38) & 113);
                    int i51111111111111111111111118 = -(-((i38 & 113) << 1));
                    int i51111111111111111111111119 = ((i51111111111111111111111117 | i51111111111111111111111118) << 1) - (i51111111111111111111111117 ^ i51111111111111111111111118);
                    int i611111111111111114 = i51111111111111111111111119 & (-110);
                    int i611111111111111115 = (i51111111111111111111111119 ^ (-110)) | i611111111111111114;
                    i38 = (i611111111111111114 ^ i611111111111111115) + ((i611111111111111114 & i611111111111111115) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case 8:
                    i2 = length;
                    if ((i & i40) != 0) {
                        int i813 = a;
                        int i814 = (((i813 ^ 3) | (i813 & 3)) << 1) - ((3 & (~i813)) | (i813 & (-4)));
                        b = i814 % 128;
                        int i815 = i814 % 2;
                        aj(i41, unsafe.getObject(t, jL), interfaceC0051g);
                    }
                    entry3 = null;
                    int i511111111111111111111111110 = (i38 & (-114)) | ((~i38) & 113);
                    int i511111111111111111111111111 = -(-((i38 & 113) << 1));
                    int i511111111111111111111111112 = ((i511111111111111111111111110 | i511111111111111111111111111) << 1) - (i511111111111111111111111110 ^ i511111111111111111111111111);
                    int i611111111111111116 = i511111111111111111111111112 & (-110);
                    int i611111111111111117 = (i511111111111111111111111112 ^ (-110)) | i611111111111111116;
                    i38 = (i611111111111111116 ^ i611111111111111117) + ((i611111111111111116 & i611111111111111117) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case 9:
                    i2 = length;
                    if ((i & i40) != 0) {
                        int i816 = a;
                        int i817 = i816 & 43;
                        int i818 = i817 + ((i816 ^ 43) | i817);
                        b = i818 % 128;
                        int i819 = i818 % 2;
                        object = unsafe.getObject(t, jL);
                        ahVarK = K(i38);
                        int i910 = b;
                        int i911 = (i910 & (-120)) | ((~i910) & 119);
                        int i912 = (i910 & 119) << 1;
                        i9 = (i911 & i912) + (i912 | i911);
                        a = i9 % 128;
                        if (i9 % 2 == 0) {
                            ((C0055l) interfaceC0051g).f(i41, object, ahVarK);
                            Object obj7 = null;
                            obj7.hashCode();
                            throw null;
                        }
                        ((C0055l) interfaceC0051g).f(i41, object, ahVarK);
                    }
                    entry3 = null;
                    int i511111111111111111111111113 = (i38 & (-114)) | ((~i38) & 113);
                    int i511111111111111111111111114 = -(-((i38 & 113) << 1));
                    int i511111111111111111111111115 = ((i511111111111111111111111113 | i511111111111111111111111114) << 1) - (i511111111111111111111111113 ^ i511111111111111111111111114);
                    int i611111111111111118 = i511111111111111111111111115 & (-110);
                    int i611111111111111119 = (i511111111111111111111111115 ^ (-110)) | i611111111111111118;
                    i38 = (i611111111111111118 ^ i611111111111111119) + ((i611111111111111118 & i611111111111111119) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case 10:
                    i2 = length;
                    if ((i & i40) != 0) {
                        abstractC0069z = (AbstractC0069z) unsafe.getObject(t, jL);
                        c0055l2 = (C0055l) interfaceC0051g;
                        int i913 = b;
                        i10 = ((i913 ^ 74) + ((i913 & 74) << 1)) - 1;
                        a = i10 % 128;
                        if (i10 % 2 != 0) {
                            c0055l2.c.cc(i41, abstractC0069z);
                            int i914 = 27 / 0;
                        } else {
                            c0055l2.c.cc(i41, abstractC0069z);
                        }
                    }
                    entry3 = null;
                    int i511111111111111111111111116 = (i38 & (-114)) | ((~i38) & 113);
                    int i511111111111111111111111117 = -(-((i38 & 113) << 1));
                    int i511111111111111111111111118 = ((i511111111111111111111111116 | i511111111111111111111111117) << 1) - (i511111111111111111111111116 ^ i511111111111111111111111117);
                    int i6111111111111111110 = i511111111111111111111111118 & (-110);
                    int i6111111111111111111 = (i511111111111111111111111118 ^ (-110)) | i6111111111111111110;
                    i38 = (i6111111111111111110 ^ i6111111111111111111) + ((i6111111111111111110 & i6111111111111111111) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case 11:
                    i2 = length;
                    if ((i & i40) != 0) {
                        int i915 = a;
                        int i916 = (((i915 ^ 67) | (i915 & 67)) << 1) - (((~i915) & 67) | (i915 & (-68)));
                        b = i916 % 128;
                        int i917 = i916 % 2;
                        ((C0055l) interfaceC0051g).c.cq(i41, unsafe.getInt(t, jL));
                    }
                    entry3 = null;
                    int i511111111111111111111111119 = (i38 & (-114)) | ((~i38) & 113);
                    int i5111111111111111111111111110 = -(-((i38 & 113) << 1));
                    int i5111111111111111111111111111 = ((i511111111111111111111111119 | i5111111111111111111111111110) << 1) - (i511111111111111111111111119 ^ i5111111111111111111111111110);
                    int i6111111111111111112 = i5111111111111111111111111111 & (-110);
                    int i6111111111111111113 = (i5111111111111111111111111111 ^ (-110)) | i6111111111111111112;
                    i38 = (i6111111111111111112 ^ i6111111111111111113) + ((i6111111111111111112 & i6111111111111111113) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case 12:
                    i2 = length;
                    if ((i & i40) != 0) {
                        ((C0055l) interfaceC0051g).c.ci(i41, unsafe.getInt(t, jL));
                    }
                    entry3 = null;
                    int i5111111111111111111111111112 = (i38 & (-114)) | ((~i38) & 113);
                    int i5111111111111111111111111113 = -(-((i38 & 113) << 1));
                    int i5111111111111111111111111114 = ((i5111111111111111111111111112 | i5111111111111111111111111113) << 1) - (i5111111111111111111111111112 ^ i5111111111111111111111111113);
                    int i6111111111111111114 = i5111111111111111111111111114 & (-110);
                    int i6111111111111111115 = (i5111111111111111111111111114 ^ (-110)) | i6111111111111111114;
                    i38 = (i6111111111111111114 ^ i6111111111111111115) + ((i6111111111111111114 & i6111111111111111115) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case 13:
                    i2 = length;
                    if ((i & i40) != 0) {
                        int i918 = a;
                        int i919 = i918 & 17;
                        int i1010 = (i918 | 17) & (~i919);
                        int i1011 = -(-(i919 << 1));
                        i11 = (i1010 ^ i1011) + ((i1010 & i1011) << 1);
                        b = i11 % 128;
                        if (i11 % 2 == 0) {
                            i12 = unsafe.getInt(t, jL);
                            c0055l3 = (C0055l) interfaceC0051g;
                            int i1012 = 26 / 0;
                        } else {
                            i12 = unsafe.getInt(t, jL);
                            c0055l3 = (C0055l) interfaceC0051g;
                        }
                        c0055l3.c.ce(i41, i12);
                        int i1013 = a;
                        int i1014 = (((i1013 | 114) << 1) - (i1013 ^ 114)) - 1;
                        b = i1014 % 128;
                        int i1015 = i1014 % 2;
                    }
                    entry3 = null;
                    int i5111111111111111111111111115 = (i38 & (-114)) | ((~i38) & 113);
                    int i5111111111111111111111111116 = -(-((i38 & 113) << 1));
                    int i5111111111111111111111111117 = ((i5111111111111111111111111115 | i5111111111111111111111111116) << 1) - (i5111111111111111111111111115 ^ i5111111111111111111111111116);
                    int i6111111111111111116 = i5111111111111111111111111117 & (-110);
                    int i6111111111111111117 = (i5111111111111111111111111117 ^ (-110)) | i6111111111111111116;
                    i38 = (i6111111111111111116 ^ i6111111111111111117) + ((i6111111111111111116 & i6111111111111111117) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case IMediaSession.Stub.TRANSACTION_playFromMediaId /* 14 */:
                    i2 = length;
                    if ((i & i40) != 0) {
                        int i1016 = b;
                        int i1017 = i1016 & 47;
                        int i1018 = -(-((i1016 ^ 47) | i1017));
                        i13 = (i1017 ^ i1018) + ((i1018 & i1017) << 1);
                        a = i13 % 128;
                        if (i13 % 2 == 0) {
                            unsafe.getLong(t, jL);
                            AbstractC0064u abstractC0064u5 = ((C0055l) interfaceC0051g).c;
                            Object obj8 = null;
                            obj8.hashCode();
                            throw null;
                        }
                        ((C0055l) interfaceC0051g).c.cg(i41, unsafe.getLong(t, jL));
                    }
                    entry3 = null;
                    int i5111111111111111111111111118 = (i38 & (-114)) | ((~i38) & 113);
                    int i5111111111111111111111111119 = -(-((i38 & 113) << 1));
                    int i51111111111111111111111111110 = ((i5111111111111111111111111118 | i5111111111111111111111111119) << 1) - (i5111111111111111111111111118 ^ i5111111111111111111111111119);
                    int i6111111111111111118 = i51111111111111111111111111110 & (-110);
                    int i6111111111111111119 = (i51111111111111111111111111110 ^ (-110)) | i6111111111111111118;
                    i38 = (i6111111111111111118 ^ i6111111111111111119) + ((i6111111111111111118 & i6111111111111111119) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case IMediaSession.Stub.TRANSACTION_playFromSearch /* 15 */:
                    i2 = length;
                    if ((i & i40) != 0) {
                        int i1019 = b;
                        int i1110 = (i1019 ^ 119) + ((i1019 & 119) << 1);
                        a = i1110 % 128;
                        int i1111 = i1110 % 2;
                        ((C0055l) interfaceC0051g).g(i41, unsafe.getInt(t, jL));
                    }
                    entry3 = null;
                    int i51111111111111111111111111111 = (i38 & (-114)) | ((~i38) & 113);
                    int i51111111111111111111111111112 = -(-((i38 & 113) << 1));
                    int i51111111111111111111111111113 = ((i51111111111111111111111111111 | i51111111111111111111111111112) << 1) - (i51111111111111111111111111111 ^ i51111111111111111111111111112);
                    int i61111111111111111110 = i51111111111111111111111111113 & (-110);
                    int i61111111111111111111 = (i51111111111111111111111111113 ^ (-110)) | i61111111111111111110;
                    i38 = (i61111111111111111110 ^ i61111111111111111111) + ((i61111111111111111110 & i61111111111111111111) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case 16:
                    if ((i & i40) != 0) {
                        j = unsafe.getLong(t, jL);
                        c0055l4 = (C0055l) interfaceC0051g;
                        int i1112 = b;
                        i2 = length;
                        int i1113 = ((~i1112) & 55) | (i1112 & (-56));
                        int i1114 = (i1112 & 55) << 1;
                        i14 = (i1113 & i1114) + (i1114 | i1113);
                        a = i14 % 128;
                        if (i14 % 2 == 0) {
                            c0055l4.i(i41, j);
                            throw null;
                        }
                        c0055l4.i(i41, j);
                    } else {
                        i2 = length;
                    }
                    entry3 = null;
                    int i51111111111111111111111111114 = (i38 & (-114)) | ((~i38) & 113);
                    int i51111111111111111111111111115 = -(-((i38 & 113) << 1));
                    int i51111111111111111111111111116 = ((i51111111111111111111111111114 | i51111111111111111111111111115) << 1) - (i51111111111111111111111111114 ^ i51111111111111111111111111115);
                    int i61111111111111111112 = i51111111111111111111111111116 & (-110);
                    int i61111111111111111113 = (i51111111111111111111111111116 ^ (-110)) | i61111111111111111112;
                    i38 = (i61111111111111111112 ^ i61111111111111111113) + ((i61111111111111111112 & i61111111111111111113) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case IMediaSession.Stub.TRANSACTION_skipToQueueItem /* 17 */:
                    if ((i & i40) != 0) {
                        int i1115 = a;
                        i15 = (i1115 & 79) + (i1115 | 79);
                        b = i15 % 128;
                        if (i15 % 2 != 0) {
                            unsafe.getObject(t, jL);
                            K(i38);
                            Object obj9 = null;
                            obj9.hashCode();
                            throw null;
                        }
                        ((C0055l) interfaceC0051g).e(i41, unsafe.getObject(t, jL), K(i38));
                    }
                    i2 = length;
                    entry3 = null;
                    int i51111111111111111111111111117 = (i38 & (-114)) | ((~i38) & 113);
                    int i51111111111111111111111111118 = -(-((i38 & 113) << 1));
                    int i51111111111111111111111111119 = ((i51111111111111111111111111117 | i51111111111111111111111111118) << 1) - (i51111111111111111111111111117 ^ i51111111111111111111111111118);
                    int i61111111111111111114 = i51111111111111111111111111119 & (-110);
                    int i61111111111111111115 = (i51111111111111111111111111119 ^ (-110)) | i61111111111111111114;
                    i38 = (i61111111111111111114 ^ i61111111111111111115) + ((i61111111111111111114 & i61111111111111111115) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case IMediaSession.Stub.TRANSACTION_pause /* 18 */:
                    z = false;
                    ak.I(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, false);
                    i2 = length;
                    entry3 = null;
                    int i511111111111111111111111111110 = (i38 & (-114)) | ((~i38) & 113);
                    int i511111111111111111111111111111 = -(-((i38 & 113) << 1));
                    int i511111111111111111111111111112 = ((i511111111111111111111111111110 | i511111111111111111111111111111) << 1) - (i511111111111111111111111111110 ^ i511111111111111111111111111111);
                    int i61111111111111111116 = i511111111111111111111111111112 & (-110);
                    int i61111111111111111117 = (i511111111111111111111111111112 ^ (-110)) | i61111111111111111116;
                    i38 = (i61111111111111111116 ^ i61111111111111111117) + ((i61111111111111111116 & i61111111111111111117) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case IMediaSession.Stub.TRANSACTION_stop /* 19 */:
                    z = false;
                    ak.L(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, false);
                    i2 = length;
                    entry3 = null;
                    int i511111111111111111111111111113 = (i38 & (-114)) | ((~i38) & 113);
                    int i511111111111111111111111111114 = -(-((i38 & 113) << 1));
                    int i511111111111111111111111111115 = ((i511111111111111111111111111113 | i511111111111111111111111111114) << 1) - (i511111111111111111111111111113 ^ i511111111111111111111111111114);
                    int i61111111111111111118 = i511111111111111111111111111115 & (-110);
                    int i61111111111111111119 = (i511111111111111111111111111115 ^ (-110)) | i61111111111111111118;
                    i38 = (i61111111111111111118 ^ i61111111111111111119) + ((i61111111111111111118 & i61111111111111111119) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case IMediaSession.Stub.TRANSACTION_next /* 20 */:
                    ak.N(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, false);
                    int i1116 = a;
                    int i1117 = (i1116 ^ 15) + ((i1116 & 15) << 1);
                    b = i1117 % 128;
                    int i1118 = i1117 % 2;
                    i2 = length;
                    entry3 = null;
                    int i511111111111111111111111111116 = (i38 & (-114)) | ((~i38) & 113);
                    int i511111111111111111111111111117 = -(-((i38 & 113) << 1));
                    int i511111111111111111111111111118 = ((i511111111111111111111111111116 | i511111111111111111111111111117) << 1) - (i511111111111111111111111111116 ^ i511111111111111111111111111117);
                    int i611111111111111111110 = i511111111111111111111111111118 & (-110);
                    int i611111111111111111111 = (i511111111111111111111111111118 ^ (-110)) | i611111111111111111110;
                    i38 = (i611111111111111111110 ^ i611111111111111111111) + ((i611111111111111111110 & i611111111111111111111) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case IMediaSession.Stub.TRANSACTION_previous /* 21 */:
                    z = false;
                    ak.V(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, false);
                    i2 = length;
                    entry3 = null;
                    int i511111111111111111111111111119 = (i38 & (-114)) | ((~i38) & 113);
                    int i5111111111111111111111111111110 = -(-((i38 & 113) << 1));
                    int i5111111111111111111111111111111 = ((i511111111111111111111111111119 | i5111111111111111111111111111110) << 1) - (i511111111111111111111111111119 ^ i5111111111111111111111111111110);
                    int i611111111111111111112 = i5111111111111111111111111111111 & (-110);
                    int i611111111111111111113 = (i5111111111111111111111111111111 ^ (-110)) | i611111111111111111112;
                    i38 = (i611111111111111111112 ^ i611111111111111111113) + ((i611111111111111111112 & i611111111111111111113) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case IMediaSession.Stub.TRANSACTION_fastForward /* 22 */:
                    z = false;
                    ak.O(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, false);
                    i2 = length;
                    entry3 = null;
                    int i5111111111111111111111111111112 = (i38 & (-114)) | ((~i38) & 113);
                    int i5111111111111111111111111111113 = -(-((i38 & 113) << 1));
                    int i5111111111111111111111111111114 = ((i5111111111111111111111111111112 | i5111111111111111111111111111113) << 1) - (i5111111111111111111111111111112 ^ i5111111111111111111111111111113);
                    int i611111111111111111114 = i5111111111111111111111111111114 & (-110);
                    int i611111111111111111115 = (i5111111111111111111111111111114 ^ (-110)) | i611111111111111111114;
                    i38 = (i611111111111111111114 ^ i611111111111111111115) + ((i611111111111111111114 & i611111111111111111115) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case IMediaSession.Stub.TRANSACTION_rewind /* 23 */:
                    z = false;
                    ak.H(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, false);
                    i2 = length;
                    entry3 = null;
                    int i5111111111111111111111111111115 = (i38 & (-114)) | ((~i38) & 113);
                    int i5111111111111111111111111111116 = -(-((i38 & 113) << 1));
                    int i5111111111111111111111111111117 = ((i5111111111111111111111111111115 | i5111111111111111111111111111116) << 1) - (i5111111111111111111111111111115 ^ i5111111111111111111111111111116);
                    int i611111111111111111116 = i5111111111111111111111111111117 & (-110);
                    int i611111111111111111117 = (i5111111111111111111111111111117 ^ (-110)) | i611111111111111111116;
                    i38 = (i611111111111111111116 ^ i611111111111111111117) + ((i611111111111111111116 & i611111111111111111117) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case IMediaSession.Stub.TRANSACTION_seekTo /* 24 */:
                    z = false;
                    ak.K(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, false);
                    i2 = length;
                    entry3 = null;
                    int i5111111111111111111111111111118 = (i38 & (-114)) | ((~i38) & 113);
                    int i5111111111111111111111111111119 = -(-((i38 & 113) << 1));
                    int i51111111111111111111111111111110 = ((i5111111111111111111111111111118 | i5111111111111111111111111111119) << 1) - (i5111111111111111111111111111118 ^ i5111111111111111111111111111119);
                    int i611111111111111111118 = i51111111111111111111111111111110 & (-110);
                    int i611111111111111111119 = (i51111111111111111111111111111110 ^ (-110)) | i611111111111111111118;
                    i38 = (i611111111111111111118 ^ i611111111111111111119) + ((i611111111111111111118 & i611111111111111111119) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case IMediaSession.Stub.TRANSACTION_rate /* 25 */:
                    i16 = this.f[i38];
                    int i1119 = b + 65;
                    a = i1119 % 128;
                    int i1210 = i1119 % 2;
                    list = (List) unsafe.getObject(t, jL);
                    i17 = b + 103;
                    a = i17 % 128;
                    if (i17 % 2 != 0) {
                        z = false;
                        ak.E(i16, list, interfaceC0051g, false);
                        i2 = length;
                        entry3 = null;
                        int i51111111111111111111111111111111 = (i38 & (-114)) | ((~i38) & 113);
                        int i51111111111111111111111111111112 = -(-((i38 & 113) << 1));
                        int i51111111111111111111111111111113 = ((i51111111111111111111111111111111 | i51111111111111111111111111111112) << 1) - (i51111111111111111111111111111111 ^ i51111111111111111111111111111112);
                        int i6111111111111111111110 = i51111111111111111111111111111113 & (-110);
                        int i6111111111111111111111 = (i51111111111111111111111111111113 ^ (-110)) | i6111111111111111111110;
                        i38 = (i6111111111111111111110 ^ i6111111111111111111111) + ((i6111111111111111111110 & i6111111111111111111111) << 1);
                        entry = entry2;
                        length = i2;
                    } else {
                        ak.E(i16, list, interfaceC0051g, true);
                        i2 = length;
                        entry3 = null;
                        int i51111111111111111111111111111114 = (i38 & (-114)) | ((~i38) & 113);
                        int i51111111111111111111111111111115 = -(-((i38 & 113) << 1));
                        int i51111111111111111111111111111116 = ((i51111111111111111111111111111114 | i51111111111111111111111111111115) << 1) - (i51111111111111111111111111111114 ^ i51111111111111111111111111111115);
                        int i6111111111111111111112 = i51111111111111111111111111111116 & (-110);
                        int i6111111111111111111113 = (i51111111111111111111111111111116 ^ (-110)) | i6111111111111111111112;
                        i38 = (i6111111111111111111112 ^ i6111111111111111111113) + ((i6111111111111111111112 & i6111111111111111111113) << 1);
                        entry = entry2;
                        length = i2;
                    }
                    break;
                case IMediaSession.Stub.TRANSACTION_sendCustomAction /* 26 */:
                    ak.U(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g);
                    i2 = length;
                    entry3 = null;
                    int i51111111111111111111111111111117 = (i38 & (-114)) | ((~i38) & 113);
                    int i51111111111111111111111111111118 = -(-((i38 & 113) << 1));
                    int i51111111111111111111111111111119 = ((i51111111111111111111111111111117 | i51111111111111111111111111111118) << 1) - (i51111111111111111111111111111117 ^ i51111111111111111111111111111118);
                    int i6111111111111111111114 = i51111111111111111111111111111119 & (-110);
                    int i6111111111111111111115 = (i51111111111111111111111111111119 ^ (-110)) | i6111111111111111111114;
                    i38 = (i6111111111111111111114 ^ i6111111111111111111115) + ((i6111111111111111111114 & i6111111111111111111115) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case IMediaSession.Stub.TRANSACTION_getMetadata /* 27 */:
                    ak.P(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, K(i38));
                    i2 = length;
                    entry3 = null;
                    int i511111111111111111111111111111110 = (i38 & (-114)) | ((~i38) & 113);
                    int i511111111111111111111111111111111 = -(-((i38 & 113) << 1));
                    int i511111111111111111111111111111112 = ((i511111111111111111111111111111110 | i511111111111111111111111111111111) << 1) - (i511111111111111111111111111111110 ^ i511111111111111111111111111111111);
                    int i6111111111111111111116 = i511111111111111111111111111111112 & (-110);
                    int i6111111111111111111117 = (i511111111111111111111111111111112 ^ (-110)) | i6111111111111111111116;
                    i38 = (i6111111111111111111116 ^ i6111111111111111111117) + ((i6111111111111111111116 & i6111111111111111111117) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case IMediaSession.Stub.TRANSACTION_getPlaybackState /* 28 */:
                    i18 = this.f[i38];
                    object2 = unsafe.getObject(t, jL);
                    int i1211 = a;
                    i19 = ((i1211 ^ 108) + ((i1211 & 108) << 1)) - 1;
                    b = i19 % 128;
                    if (i19 % 2 == 0) {
                        ak.F(i18, (List) object2, interfaceC0051g);
                        int i1212 = 26 / 0;
                    } else {
                        ak.F(i18, (List) object2, interfaceC0051g);
                    }
                    i2 = length;
                    entry3 = null;
                    int i511111111111111111111111111111113 = (i38 & (-114)) | ((~i38) & 113);
                    int i511111111111111111111111111111114 = -(-((i38 & 113) << 1));
                    int i511111111111111111111111111111115 = ((i511111111111111111111111111111113 | i511111111111111111111111111111114) << 1) - (i511111111111111111111111111111113 ^ i511111111111111111111111111111114);
                    int i6111111111111111111118 = i511111111111111111111111111111115 & (-110);
                    int i6111111111111111111119 = (i511111111111111111111111111111115 ^ (-110)) | i6111111111111111111118;
                    i38 = (i6111111111111111111118 ^ i6111111111111111111119) + ((i6111111111111111111118 & i6111111111111111111119) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case IMediaSession.Stub.TRANSACTION_getQueue /* 29 */:
                    i20 = this.f[i38];
                    list2 = (List) unsafe.getObject(t, jL);
                    int i1213 = b;
                    i21 = (i1213 ^ 119) + ((i1213 & 119) << 1);
                    a = i21 % 128;
                    if (i21 % 2 != 0) {
                        z2 = false;
                        ak.R(i20, list2, interfaceC0051g, false);
                        i2 = length;
                        entry3 = null;
                        int i511111111111111111111111111111116 = (i38 & (-114)) | ((~i38) & 113);
                        int i511111111111111111111111111111117 = -(-((i38 & 113) << 1));
                        int i511111111111111111111111111111118 = ((i511111111111111111111111111111116 | i511111111111111111111111111111117) << 1) - (i511111111111111111111111111111116 ^ i511111111111111111111111111111117);
                        int i61111111111111111111110 = i511111111111111111111111111111118 & (-110);
                        int i61111111111111111111111 = (i511111111111111111111111111111118 ^ (-110)) | i61111111111111111111110;
                        i38 = (i61111111111111111111110 ^ i61111111111111111111111) + ((i61111111111111111111110 & i61111111111111111111111) << 1);
                        entry = entry2;
                        length = i2;
                    } else {
                        ak.R(i20, list2, interfaceC0051g, true);
                        i2 = length;
                        entry3 = null;
                        int i511111111111111111111111111111119 = (i38 & (-114)) | ((~i38) & 113);
                        int i5111111111111111111111111111111110 = -(-((i38 & 113) << 1));
                        int i5111111111111111111111111111111111 = ((i511111111111111111111111111111119 | i5111111111111111111111111111111110) << 1) - (i511111111111111111111111111111119 ^ i5111111111111111111111111111111110);
                        int i61111111111111111111112 = i5111111111111111111111111111111111 & (-110);
                        int i61111111111111111111113 = (i5111111111111111111111111111111111 ^ (-110)) | i61111111111111111111112;
                        i38 = (i61111111111111111111112 ^ i61111111111111111111113) + ((i61111111111111111111112 & i61111111111111111111113) << 1);
                        entry = entry2;
                        length = i2;
                    }
                    break;
                case IMediaSession.Stub.TRANSACTION_getQueueTitle /* 30 */:
                    z = false;
                    ak.J(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, false);
                    i2 = length;
                    entry3 = null;
                    int i5111111111111111111111111111111112 = (i38 & (-114)) | ((~i38) & 113);
                    int i5111111111111111111111111111111113 = -(-((i38 & 113) << 1));
                    int i5111111111111111111111111111111114 = ((i5111111111111111111111111111111112 | i5111111111111111111111111111111113) << 1) - (i5111111111111111111111111111111112 ^ i5111111111111111111111111111111113);
                    int i61111111111111111111114 = i5111111111111111111111111111111114 & (-110);
                    int i61111111111111111111115 = (i5111111111111111111111111111111114 ^ (-110)) | i61111111111111111111114;
                    i38 = (i61111111111111111111114 ^ i61111111111111111111115) + ((i61111111111111111111114 & i61111111111111111111115) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case IMediaSession.Stub.TRANSACTION_getExtras /* 31 */:
                    i22 = this.f[i38];
                    object3 = unsafe.getObject(t, jL);
                    int i1214 = a;
                    int i1215 = (i1214 & (-44)) | ((~i1214) & 43);
                    int i1216 = -(-((i1214 & 43) << 1));
                    i23 = (i1215 & i1216) + (i1216 | i1215);
                    b = i23 % 128;
                    if (i23 % 2 == 0) {
                        z = false;
                        ak.Q(i22, (List) object3, interfaceC0051g, false);
                        i2 = length;
                        entry3 = null;
                        int i5111111111111111111111111111111115 = (i38 & (-114)) | ((~i38) & 113);
                        int i5111111111111111111111111111111116 = -(-((i38 & 113) << 1));
                        int i5111111111111111111111111111111117 = ((i5111111111111111111111111111111115 | i5111111111111111111111111111111116) << 1) - (i5111111111111111111111111111111115 ^ i5111111111111111111111111111111116);
                        int i61111111111111111111116 = i5111111111111111111111111111111117 & (-110);
                        int i61111111111111111111117 = (i5111111111111111111111111111111117 ^ (-110)) | i61111111111111111111116;
                        i38 = (i61111111111111111111116 ^ i61111111111111111111117) + ((i61111111111111111111116 & i61111111111111111111117) << 1);
                        entry = entry2;
                        length = i2;
                    } else {
                        ak.Q(i22, (List) object3, interfaceC0051g, true);
                        i2 = length;
                        entry3 = null;
                        int i5111111111111111111111111111111118 = (i38 & (-114)) | ((~i38) & 113);
                        int i5111111111111111111111111111111119 = -(-((i38 & 113) << 1));
                        int i51111111111111111111111111111111110 = ((i5111111111111111111111111111111118 | i5111111111111111111111111111111119) << 1) - (i5111111111111111111111111111111118 ^ i5111111111111111111111111111111119);
                        int i61111111111111111111118 = i51111111111111111111111111111111110 & (-110);
                        int i61111111111111111111119 = (i51111111111111111111111111111111110 ^ (-110)) | i61111111111111111111118;
                        i38 = (i61111111111111111111118 ^ i61111111111111111111119) + ((i61111111111111111111118 & i61111111111111111111119) << 1);
                        entry = entry2;
                        length = i2;
                    }
                    break;
                case IMediaSession.Stub.TRANSACTION_getRatingType /* 32 */:
                    i24 = this.f[i38];
                    list3 = (List) unsafe.getObject(t, jL);
                    int i1217 = a;
                    int i1218 = (i1217 | 65) << 1;
                    int i1219 = -(i1217 ^ 65);
                    i25 = (i1218 & i1219) + (i1219 | i1218);
                    b = i25 % 128;
                    if (i25 % 2 == 0) {
                        z2 = false;
                        ak.G(i24, list3, interfaceC0051g, false);
                        int i1310 = 81 / 0;
                    } else {
                        z2 = false;
                        ak.G(i24, list3, interfaceC0051g, false);
                    }
                    i2 = length;
                    entry3 = null;
                    int i51111111111111111111111111111111111 = (i38 & (-114)) | ((~i38) & 113);
                    int i51111111111111111111111111111111112 = -(-((i38 & 113) << 1));
                    int i51111111111111111111111111111111113 = ((i51111111111111111111111111111111111 | i51111111111111111111111111111111112) << 1) - (i51111111111111111111111111111111111 ^ i51111111111111111111111111111111112);
                    int i611111111111111111111110 = i51111111111111111111111111111111113 & (-110);
                    int i611111111111111111111111 = (i51111111111111111111111111111111113 ^ (-110)) | i611111111111111111111110;
                    i38 = (i611111111111111111111110 ^ i611111111111111111111111) + ((i611111111111111111111110 & i611111111111111111111111) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case IMediaSession.Stub.TRANSACTION_prepare /* 33 */:
                    int i1311 = this.f[i38];
                    Object object9 = unsafe.getObject(t, jL);
                    int i1312 = a;
                    int i1313 = i1312 & 41;
                    int i1314 = -(-((i1312 ^ 41) | i1313));
                    int i1315 = ((i1313 | i1314) << 1) - (i1314 ^ i1313);
                    b = i1315 % 128;
                    int i1316 = i1315 % 2;
                    ak.T(i1311, (List) object9, interfaceC0051g, false);
                    int i1317 = b + 103;
                    a = i1317 % 128;
                    int i1318 = i1317 % 2;
                    i2 = length;
                    entry3 = null;
                    int i51111111111111111111111111111111114 = (i38 & (-114)) | ((~i38) & 113);
                    int i51111111111111111111111111111111115 = -(-((i38 & 113) << 1));
                    int i51111111111111111111111111111111116 = ((i51111111111111111111111111111111114 | i51111111111111111111111111111111115) << 1) - (i51111111111111111111111111111111114 ^ i51111111111111111111111111111111115);
                    int i611111111111111111111112 = i51111111111111111111111111111111116 & (-110);
                    int i611111111111111111111113 = (i51111111111111111111111111111111116 ^ (-110)) | i611111111111111111111112;
                    i38 = (i611111111111111111111112 ^ i611111111111111111111113) + ((i611111111111111111111112 & i611111111111111111111113) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case IMediaSession.Stub.TRANSACTION_prepareFromMediaId /* 34 */:
                    int i1319 = this.f[i38];
                    List list7 = (List) unsafe.getObject(t, jL);
                    z2 = false;
                    ak.S(i1319, list7, interfaceC0051g, false);
                    i2 = length;
                    entry3 = null;
                    int i51111111111111111111111111111111117 = (i38 & (-114)) | ((~i38) & 113);
                    int i51111111111111111111111111111111118 = -(-((i38 & 113) << 1));
                    int i51111111111111111111111111111111119 = ((i51111111111111111111111111111111117 | i51111111111111111111111111111111118) << 1) - (i51111111111111111111111111111111117 ^ i51111111111111111111111111111111118);
                    int i611111111111111111111114 = i51111111111111111111111111111111119 & (-110);
                    int i611111111111111111111115 = (i51111111111111111111111111111111119 ^ (-110)) | i611111111111111111111114;
                    i38 = (i611111111111111111111114 ^ i611111111111111111111115) + ((i611111111111111111111114 & i611111111111111111111115) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case IMediaSession.Stub.TRANSACTION_prepareFromSearch /* 35 */:
                    int i1410 = this.f[i38];
                    Object object10 = unsafe.getObject(t, jL);
                    int i1411 = b;
                    int i1412 = i1411 & 5;
                    int i1413 = (i1411 ^ 5) | i1412;
                    int i1414 = ((i1412 | i1413) << 1) - (i1413 ^ i1412);
                    a = i1414 % 128;
                    int i1415 = i1414 % 2;
                    ak.I(i1410, (List) object10, interfaceC0051g, true);
                    i2 = length;
                    entry3 = null;
                    int i511111111111111111111111111111111110 = (i38 & (-114)) | ((~i38) & 113);
                    int i511111111111111111111111111111111111 = -(-((i38 & 113) << 1));
                    int i511111111111111111111111111111111112 = ((i511111111111111111111111111111111110 | i511111111111111111111111111111111111) << 1) - (i511111111111111111111111111111111110 ^ i511111111111111111111111111111111111);
                    int i611111111111111111111116 = i511111111111111111111111111111111112 & (-110);
                    int i611111111111111111111117 = (i511111111111111111111111111111111112 ^ (-110)) | i611111111111111111111116;
                    i38 = (i611111111111111111111116 ^ i611111111111111111111117) + ((i611111111111111111111116 & i611111111111111111111117) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case IMediaSession.Stub.TRANSACTION_prepareFromUri /* 36 */:
                    ak.L(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, true);
                    i2 = length;
                    entry3 = null;
                    int i511111111111111111111111111111111113 = (i38 & (-114)) | ((~i38) & 113);
                    int i511111111111111111111111111111111114 = -(-((i38 & 113) << 1));
                    int i511111111111111111111111111111111115 = ((i511111111111111111111111111111111113 | i511111111111111111111111111111111114) << 1) - (i511111111111111111111111111111111113 ^ i511111111111111111111111111111111114);
                    int i611111111111111111111118 = i511111111111111111111111111111111115 & (-110);
                    int i611111111111111111111119 = (i511111111111111111111111111111111115 ^ (-110)) | i611111111111111111111118;
                    i38 = (i611111111111111111111118 ^ i611111111111111111111119) + ((i611111111111111111111118 & i611111111111111111111119) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case IMediaSession.Stub.TRANSACTION_getRepeatMode /* 37 */:
                    ak.N(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, true);
                    int i1416 = a;
                    int i1417 = i1416 & 23;
                    int i1418 = ((i1416 ^ 23) | i1417) << 1;
                    int i1419 = -((i1416 | 23) & (~i1417));
                    int i1510 = ((i1418 | i1419) << 1) - (i1419 ^ i1418);
                    b = i1510 % 128;
                    int i1511 = i1510 % 2;
                    i2 = length;
                    entry3 = null;
                    int i511111111111111111111111111111111116 = (i38 & (-114)) | ((~i38) & 113);
                    int i511111111111111111111111111111111117 = -(-((i38 & 113) << 1));
                    int i511111111111111111111111111111111118 = ((i511111111111111111111111111111111116 | i511111111111111111111111111111111117) << 1) - (i511111111111111111111111111111111116 ^ i511111111111111111111111111111111117);
                    int i6111111111111111111111110 = i511111111111111111111111111111111118 & (-110);
                    int i6111111111111111111111111 = (i511111111111111111111111111111111118 ^ (-110)) | i6111111111111111111111110;
                    i38 = (i6111111111111111111111110 ^ i6111111111111111111111111) + ((i6111111111111111111111110 & i6111111111111111111111111) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case IMediaSession.Stub.TRANSACTION_isShuffleModeEnabledRemoved /* 38 */:
                    ak.V(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, true);
                    i2 = length;
                    entry3 = null;
                    int i511111111111111111111111111111111119 = (i38 & (-114)) | ((~i38) & 113);
                    int i5111111111111111111111111111111111110 = -(-((i38 & 113) << 1));
                    int i5111111111111111111111111111111111111 = ((i511111111111111111111111111111111119 | i5111111111111111111111111111111111110) << 1) - (i511111111111111111111111111111111119 ^ i5111111111111111111111111111111111110);
                    int i6111111111111111111111112 = i5111111111111111111111111111111111111 & (-110);
                    int i6111111111111111111111113 = (i5111111111111111111111111111111111111 ^ (-110)) | i6111111111111111111111112;
                    i38 = (i6111111111111111111111112 ^ i6111111111111111111111113) + ((i6111111111111111111111112 & i6111111111111111111111113) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case IMediaSession.Stub.TRANSACTION_setRepeatMode /* 39 */:
                    ak.O(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, true);
                    int i1512 = a;
                    int i1513 = (((i1512 | 98) << 1) - (i1512 ^ 98)) - 1;
                    b = i1513 % 128;
                    int i1514 = i1513 % 2;
                    i2 = length;
                    entry3 = null;
                    int i5111111111111111111111111111111111112 = (i38 & (-114)) | ((~i38) & 113);
                    int i5111111111111111111111111111111111113 = -(-((i38 & 113) << 1));
                    int i5111111111111111111111111111111111114 = ((i5111111111111111111111111111111111112 | i5111111111111111111111111111111111113) << 1) - (i5111111111111111111111111111111111112 ^ i5111111111111111111111111111111111113);
                    int i6111111111111111111111114 = i5111111111111111111111111111111111114 & (-110);
                    int i6111111111111111111111115 = (i5111111111111111111111111111111111114 ^ (-110)) | i6111111111111111111111114;
                    i38 = (i6111111111111111111111114 ^ i6111111111111111111111115) + ((i6111111111111111111111114 & i6111111111111111111111115) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case IMediaSession.Stub.TRANSACTION_setShuffleModeEnabledRemoved /* 40 */:
                    ak.H(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, true);
                    i2 = length;
                    entry3 = null;
                    int i5111111111111111111111111111111111115 = (i38 & (-114)) | ((~i38) & 113);
                    int i5111111111111111111111111111111111116 = -(-((i38 & 113) << 1));
                    int i5111111111111111111111111111111111117 = ((i5111111111111111111111111111111111115 | i5111111111111111111111111111111111116) << 1) - (i5111111111111111111111111111111111115 ^ i5111111111111111111111111111111111116);
                    int i6111111111111111111111116 = i5111111111111111111111111111111111117 & (-110);
                    int i6111111111111111111111117 = (i5111111111111111111111111111111111117 ^ (-110)) | i6111111111111111111111116;
                    i38 = (i6111111111111111111111116 ^ i6111111111111111111111117) + ((i6111111111111111111111116 & i6111111111111111111111117) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case IMediaSession.Stub.TRANSACTION_addQueueItem /* 41 */:
                    i26 = this.f[i38];
                    object4 = unsafe.getObject(t, jL);
                    int i1515 = b;
                    int i1516 = i1515 & 101;
                    int i1517 = (i1515 ^ 101) | i1516;
                    i27 = (i1516 ^ i1517) + ((i1517 & i1516) << 1);
                    a = i27 % 128;
                    if (i27 % 2 != 0) {
                        ak.K(i26, (List) object4, interfaceC0051g, false);
                    } else {
                        ak.K(i26, (List) object4, interfaceC0051g, true);
                    }
                    i2 = length;
                    entry3 = null;
                    int i5111111111111111111111111111111111118 = (i38 & (-114)) | ((~i38) & 113);
                    int i5111111111111111111111111111111111119 = -(-((i38 & 113) << 1));
                    int i51111111111111111111111111111111111110 = ((i5111111111111111111111111111111111118 | i5111111111111111111111111111111111119) << 1) - (i5111111111111111111111111111111111118 ^ i5111111111111111111111111111111111119);
                    int i6111111111111111111111118 = i51111111111111111111111111111111111110 & (-110);
                    int i6111111111111111111111119 = (i51111111111111111111111111111111111110 ^ (-110)) | i6111111111111111111111118;
                    i38 = (i6111111111111111111111118 ^ i6111111111111111111111119) + ((i6111111111111111111111118 & i6111111111111111111111119) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case IMediaSession.Stub.TRANSACTION_addQueueItemAt /* 42 */:
                    ak.E(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, true);
                    i2 = length;
                    entry3 = null;
                    int i51111111111111111111111111111111111111 = (i38 & (-114)) | ((~i38) & 113);
                    int i51111111111111111111111111111111111112 = -(-((i38 & 113) << 1));
                    int i51111111111111111111111111111111111113 = ((i51111111111111111111111111111111111111 | i51111111111111111111111111111111111112) << 1) - (i51111111111111111111111111111111111111 ^ i51111111111111111111111111111111111112);
                    int i61111111111111111111111110 = i51111111111111111111111111111111111113 & (-110);
                    int i61111111111111111111111111 = (i51111111111111111111111111111111111113 ^ (-110)) | i61111111111111111111111110;
                    i38 = (i61111111111111111111111110 ^ i61111111111111111111111111) + ((i61111111111111111111111110 & i61111111111111111111111111) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case IMediaSession.Stub.TRANSACTION_removeQueueItem /* 43 */:
                    ak.R(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, true);
                    i2 = length;
                    entry3 = null;
                    int i51111111111111111111111111111111111114 = (i38 & (-114)) | ((~i38) & 113);
                    int i51111111111111111111111111111111111115 = -(-((i38 & 113) << 1));
                    int i51111111111111111111111111111111111116 = ((i51111111111111111111111111111111111114 | i51111111111111111111111111111111111115) << 1) - (i51111111111111111111111111111111111114 ^ i51111111111111111111111111111111111115);
                    int i61111111111111111111111112 = i51111111111111111111111111111111111116 & (-110);
                    int i61111111111111111111111113 = (i51111111111111111111111111111111111116 ^ (-110)) | i61111111111111111111111112;
                    i38 = (i61111111111111111111111112 ^ i61111111111111111111111113) + ((i61111111111111111111111112 & i61111111111111111111111113) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case IMediaSession.Stub.TRANSACTION_removeQueueItemAt /* 44 */:
                    int i1518 = this.f[i38];
                    List list8 = (List) unsafe.getObject(t, jL);
                    int i1519 = b;
                    int i1610 = i1519 & 33;
                    int i1611 = -(-((i1519 ^ 33) | i1610));
                    int i1612 = (i1610 ^ i1611) + ((i1611 & i1610) << 1);
                    a = i1612 % 128;
                    int i1613 = i1612 % 2;
                    ak.J(i1518, list8, interfaceC0051g, true);
                    i2 = length;
                    entry3 = null;
                    int i51111111111111111111111111111111111117 = (i38 & (-114)) | ((~i38) & 113);
                    int i51111111111111111111111111111111111118 = -(-((i38 & 113) << 1));
                    int i51111111111111111111111111111111111119 = ((i51111111111111111111111111111111111117 | i51111111111111111111111111111111111118) << 1) - (i51111111111111111111111111111111111117 ^ i51111111111111111111111111111111111118);
                    int i61111111111111111111111114 = i51111111111111111111111111111111111119 & (-110);
                    int i61111111111111111111111115 = (i51111111111111111111111111111111111119 ^ (-110)) | i61111111111111111111111114;
                    i38 = (i61111111111111111111111114 ^ i61111111111111111111111115) + ((i61111111111111111111111114 & i61111111111111111111111115) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case IMediaSession.Stub.TRANSACTION_isCaptioningEnabled /* 45 */:
                    ak.Q(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, true);
                    int i1614 = b + 49;
                    a = i1614 % 128;
                    int i1615 = i1614 % 2;
                    i2 = length;
                    entry3 = null;
                    int i511111111111111111111111111111111111110 = (i38 & (-114)) | ((~i38) & 113);
                    int i511111111111111111111111111111111111111 = -(-((i38 & 113) << 1));
                    int i511111111111111111111111111111111111112 = ((i511111111111111111111111111111111111110 | i511111111111111111111111111111111111111) << 1) - (i511111111111111111111111111111111111110 ^ i511111111111111111111111111111111111111);
                    int i61111111111111111111111116 = i511111111111111111111111111111111111112 & (-110);
                    int i61111111111111111111111117 = (i511111111111111111111111111111111111112 ^ (-110)) | i61111111111111111111111116;
                    i38 = (i61111111111111111111111116 ^ i61111111111111111111111117) + ((i61111111111111111111111116 & i61111111111111111111111117) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case IMediaSession.Stub.TRANSACTION_setCaptioningEnabled /* 46 */:
                    ak.G(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, true);
                    i2 = length;
                    entry3 = null;
                    int i511111111111111111111111111111111111113 = (i38 & (-114)) | ((~i38) & 113);
                    int i511111111111111111111111111111111111114 = -(-((i38 & 113) << 1));
                    int i511111111111111111111111111111111111115 = ((i511111111111111111111111111111111111113 | i511111111111111111111111111111111111114) << 1) - (i511111111111111111111111111111111111113 ^ i511111111111111111111111111111111111114);
                    int i61111111111111111111111118 = i511111111111111111111111111111111111115 & (-110);
                    int i61111111111111111111111119 = (i511111111111111111111111111111111111115 ^ (-110)) | i61111111111111111111111118;
                    i38 = (i61111111111111111111111118 ^ i61111111111111111111111119) + ((i61111111111111111111111118 & i61111111111111111111111119) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case IMediaSession.Stub.TRANSACTION_getShuffleMode /* 47 */:
                    int i1616 = this.f[i38];
                    Object object11 = unsafe.getObject(t, jL);
                    int i1617 = a;
                    int i1618 = (((i1617 & (-4)) | (3 & (~i1617))) - (~(-(-((i1617 & 3) << 1))))) - 1;
                    b = i1618 % 128;
                    int i1619 = i1618 % 2;
                    ak.T(i1616, (List) object11, interfaceC0051g, true);
                    i2 = length;
                    entry3 = null;
                    int i511111111111111111111111111111111111116 = (i38 & (-114)) | ((~i38) & 113);
                    int i511111111111111111111111111111111111117 = -(-((i38 & 113) << 1));
                    int i511111111111111111111111111111111111118 = ((i511111111111111111111111111111111111116 | i511111111111111111111111111111111111117) << 1) - (i511111111111111111111111111111111111116 ^ i511111111111111111111111111111111111117);
                    int i611111111111111111111111110 = i511111111111111111111111111111111111118 & (-110);
                    int i611111111111111111111111111 = (i511111111111111111111111111111111111118 ^ (-110)) | i611111111111111111111111110;
                    i38 = (i611111111111111111111111110 ^ i611111111111111111111111111) + ((i611111111111111111111111110 & i611111111111111111111111111) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case IMediaSession.Stub.TRANSACTION_setShuffleMode /* 48 */:
                    ak.S(this.f[i38], (List) unsafe.getObject(t, jL), interfaceC0051g, true);
                    i2 = length;
                    entry3 = null;
                    int i511111111111111111111111111111111111119 = (i38 & (-114)) | ((~i38) & 113);
                    int i5111111111111111111111111111111111111110 = -(-((i38 & 113) << 1));
                    int i5111111111111111111111111111111111111111 = ((i511111111111111111111111111111111111119 | i5111111111111111111111111111111111111110) << 1) - (i511111111111111111111111111111111111119 ^ i5111111111111111111111111111111111111110);
                    int i611111111111111111111111112 = i5111111111111111111111111111111111111111 & (-110);
                    int i611111111111111111111111113 = (i5111111111111111111111111111111111111111 ^ (-110)) | i611111111111111111111111112;
                    i38 = (i611111111111111111111111112 ^ i611111111111111111111111113) + ((i611111111111111111111111112 & i611111111111111111111111113) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case 49:
                    int i1710 = this.f[i38];
                    int i1711 = a;
                    i28 = (i1711 ^ 123) + ((i1711 & 123) << 1);
                    b = i28 % 128;
                    if (i28 % 2 == 0) {
                        list4 = (List) unsafe.getObject(t, jL);
                        ahVarK2 = K(i38);
                        int i1712 = 46 / 0;
                    } else {
                        list4 = (List) unsafe.getObject(t, jL);
                        ahVarK2 = K(i38);
                    }
                    ak.M(i1710, list4, interfaceC0051g, ahVarK2);
                    int i1713 = a;
                    int i1714 = (i1713 ^ 39) + ((i1713 & 39) << 1);
                    b = i1714 % 128;
                    int i1715 = i1714 % 2;
                    i2 = length;
                    entry3 = null;
                    int i5111111111111111111111111111111111111112 = (i38 & (-114)) | ((~i38) & 113);
                    int i5111111111111111111111111111111111111113 = -(-((i38 & 113) << 1));
                    int i5111111111111111111111111111111111111114 = ((i5111111111111111111111111111111111111112 | i5111111111111111111111111111111111111113) << 1) - (i5111111111111111111111111111111111111112 ^ i5111111111111111111111111111111111111113);
                    int i611111111111111111111111114 = i5111111111111111111111111111111111111114 & (-110);
                    int i611111111111111111111111115 = (i5111111111111111111111111111111111111114 ^ (-110)) | i611111111111111111111111114;
                    i38 = (i611111111111111111111111114 ^ i611111111111111111111111115) + ((i611111111111111111111111114 & i611111111111111111111111115) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case 50:
                    ai(interfaceC0051g, i41, unsafe.getObject(t, jL), i38);
                    i2 = length;
                    entry3 = null;
                    int i5111111111111111111111111111111111111115 = (i38 & (-114)) | ((~i38) & 113);
                    int i5111111111111111111111111111111111111116 = -(-((i38 & 113) << 1));
                    int i5111111111111111111111111111111111111117 = ((i5111111111111111111111111111111111111115 | i5111111111111111111111111111111111111116) << 1) - (i5111111111111111111111111111111111111115 ^ i5111111111111111111111111111111111111116);
                    int i611111111111111111111111116 = i5111111111111111111111111111111111111117 & (-110);
                    int i611111111111111111111111117 = (i5111111111111111111111111111111111111117 ^ (-110)) | i611111111111111111111111116;
                    i38 = (i611111111111111111111111116 ^ i611111111111111111111111117) + ((i611111111111111111111111116 & i611111111111111111111111117) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case IMediaSession.Stub.TRANSACTION_rateWithExtras /* 51 */:
                    if (P(t, i41, i38)) {
                        double dQ2 = q(t, jL);
                        int i1716 = b;
                        int i1717 = ((i1716 ^ 77) | (i1716 & 77)) << 1;
                        int i1718 = -((i1716 & (-78)) | ((~i1716) & 77));
                        int i1719 = (i1717 ^ i1718) + ((i1718 & i1717) << 1);
                        a = i1719 % 128;
                        int i1810 = i1719 % 2;
                        ((C0055l) interfaceC0051g).c(i41, dQ2);
                    }
                    i2 = length;
                    entry3 = null;
                    int i5111111111111111111111111111111111111118 = (i38 & (-114)) | ((~i38) & 113);
                    int i5111111111111111111111111111111111111119 = -(-((i38 & 113) << 1));
                    int i51111111111111111111111111111111111111110 = ((i5111111111111111111111111111111111111118 | i5111111111111111111111111111111111111119) << 1) - (i5111111111111111111111111111111111111118 ^ i5111111111111111111111111111111111111119);
                    int i611111111111111111111111118 = i51111111111111111111111111111111111111110 & (-110);
                    int i611111111111111111111111119 = (i51111111111111111111111111111111111111110 ^ (-110)) | i611111111111111111111111118;
                    i38 = (i611111111111111111111111118 ^ i611111111111111111111111119) + ((i611111111111111111111111118 & i611111111111111111111111119) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case 52:
                    if (P(t, i41, i38)) {
                        ((C0055l) interfaceC0051g).d(i41, r(t, jL));
                    }
                    i2 = length;
                    entry3 = null;
                    int i51111111111111111111111111111111111111111 = (i38 & (-114)) | ((~i38) & 113);
                    int i51111111111111111111111111111111111111112 = -(-((i38 & 113) << 1));
                    int i51111111111111111111111111111111111111113 = ((i51111111111111111111111111111111111111111 | i51111111111111111111111111111111111111112) << 1) - (i51111111111111111111111111111111111111111 ^ i51111111111111111111111111111111111111112);
                    int i6111111111111111111111111110 = i51111111111111111111111111111111111111113 & (-110);
                    int i6111111111111111111111111111 = (i51111111111111111111111111111111111111113 ^ (-110)) | i6111111111111111111111111110;
                    i38 = (i6111111111111111111111111110 ^ i6111111111111111111111111111) + ((i6111111111111111111111111110 & i6111111111111111111111111111) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case 53:
                    if (P(t, i41, i38)) {
                        long jT3 = t(t, jL);
                        int i1811 = b;
                        int i1812 = i1811 & 1;
                        int i1813 = -(-((i1811 ^ 1) | i1812));
                        int i1814 = (i1812 & i1813) + (i1813 | i1812);
                        a = i1814 % 128;
                        int i1815 = i1814 % 2;
                        ((C0055l) interfaceC0051g).c.cr(i41, jT3);
                    }
                    i2 = length;
                    entry3 = null;
                    int i51111111111111111111111111111111111111114 = (i38 & (-114)) | ((~i38) & 113);
                    int i51111111111111111111111111111111111111115 = -(-((i38 & 113) << 1));
                    int i51111111111111111111111111111111111111116 = ((i51111111111111111111111111111111111111114 | i51111111111111111111111111111111111111115) << 1) - (i51111111111111111111111111111111111111114 ^ i51111111111111111111111111111111111111115);
                    int i6111111111111111111111111112 = i51111111111111111111111111111111111111116 & (-110);
                    int i6111111111111111111111111113 = (i51111111111111111111111111111111111111116 ^ (-110)) | i6111111111111111111111111112;
                    i38 = (i6111111111111111111111111112 ^ i6111111111111111111111111113) + ((i6111111111111111111111111112 & i6111111111111111111111111113) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case 54:
                    if (P(t, i41, i38)) {
                        int i1816 = b;
                        int i1817 = ((i1816 | 39) << 1) - (i1816 ^ 39);
                        a = i1817 % 128;
                        int i1818 = i1817 % 2;
                        ((C0055l) interfaceC0051g).c.cr(i41, t(t, jL));
                    }
                    i2 = length;
                    entry3 = null;
                    int i51111111111111111111111111111111111111117 = (i38 & (-114)) | ((~i38) & 113);
                    int i51111111111111111111111111111111111111118 = -(-((i38 & 113) << 1));
                    int i51111111111111111111111111111111111111119 = ((i51111111111111111111111111111111111111117 | i51111111111111111111111111111111111111118) << 1) - (i51111111111111111111111111111111111111117 ^ i51111111111111111111111111111111111111118);
                    int i6111111111111111111111111114 = i51111111111111111111111111111111111111119 & (-110);
                    int i6111111111111111111111111115 = (i51111111111111111111111111111111111111119 ^ (-110)) | i6111111111111111111111111114;
                    i38 = (i6111111111111111111111111114 ^ i6111111111111111111111111115) + ((i6111111111111111111111111114 & i6111111111111111111111111115) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case 55:
                    if (!(!P(t, i41, i38))) {
                        ((C0055l) interfaceC0051g).c.ci(i41, s(t, jL));
                    }
                    i2 = length;
                    entry3 = null;
                    int i511111111111111111111111111111111111111110 = (i38 & (-114)) | ((~i38) & 113);
                    int i511111111111111111111111111111111111111111 = -(-((i38 & 113) << 1));
                    int i511111111111111111111111111111111111111112 = ((i511111111111111111111111111111111111111110 | i511111111111111111111111111111111111111111) << 1) - (i511111111111111111111111111111111111111110 ^ i511111111111111111111111111111111111111111);
                    int i6111111111111111111111111116 = i511111111111111111111111111111111111111112 & (-110);
                    int i6111111111111111111111111117 = (i511111111111111111111111111111111111111112 ^ (-110)) | i6111111111111111111111111116;
                    i38 = (i6111111111111111111111111116 ^ i6111111111111111111111111117) + ((i6111111111111111111111111116 & i6111111111111111111111111117) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case 56:
                    if (P(t, i41, i38)) {
                        jT = t(t, jL);
                        abstractC0064u3 = ((C0055l) interfaceC0051g).c;
                        int i1819 = b;
                        i29 = (i1819 ^ 15) + ((i1819 & 15) << 1);
                        a = i29 % 128;
                        if (i29 % 2 != 0) {
                            abstractC0064u3.cg(i41, jT);
                            int i1910 = 56 / 0;
                        } else {
                            abstractC0064u3.cg(i41, jT);
                        }
                    }
                    i2 = length;
                    entry3 = null;
                    int i511111111111111111111111111111111111111113 = (i38 & (-114)) | ((~i38) & 113);
                    int i511111111111111111111111111111111111111114 = -(-((i38 & 113) << 1));
                    int i511111111111111111111111111111111111111115 = ((i511111111111111111111111111111111111111113 | i511111111111111111111111111111111111111114) << 1) - (i511111111111111111111111111111111111111113 ^ i511111111111111111111111111111111111111114);
                    int i6111111111111111111111111118 = i511111111111111111111111111111111111111115 & (-110);
                    int i6111111111111111111111111119 = (i511111111111111111111111111111111111111115 ^ (-110)) | i6111111111111111111111111118;
                    i38 = (i6111111111111111111111111118 ^ i6111111111111111111111111119) + ((i6111111111111111111111111118 & i6111111111111111111111111119) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case 57:
                    if (P(t, i41, i38)) {
                        int i1911 = a + 105;
                        b = i1911 % 128;
                        int i1912 = i1911 % 2;
                        ((C0055l) interfaceC0051g).c.ce(i41, s(t, jL));
                    }
                    i2 = length;
                    entry3 = null;
                    int i511111111111111111111111111111111111111116 = (i38 & (-114)) | ((~i38) & 113);
                    int i511111111111111111111111111111111111111117 = -(-((i38 & 113) << 1));
                    int i511111111111111111111111111111111111111118 = ((i511111111111111111111111111111111111111116 | i511111111111111111111111111111111111111117) << 1) - (i511111111111111111111111111111111111111116 ^ i511111111111111111111111111111111111111117);
                    int i61111111111111111111111111110 = i511111111111111111111111111111111111111118 & (-110);
                    int i61111111111111111111111111111 = (i511111111111111111111111111111111111111118 ^ (-110)) | i61111111111111111111111111110;
                    i38 = (i61111111111111111111111111110 ^ i61111111111111111111111111111) + ((i61111111111111111111111111110 & i61111111111111111111111111111) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case 58:
                    if (P(t, i41, i38)) {
                        ((C0055l) interfaceC0051g).c.cd(i41, p(t, jL));
                    }
                    i2 = length;
                    entry3 = null;
                    int i511111111111111111111111111111111111111119 = (i38 & (-114)) | ((~i38) & 113);
                    int i5111111111111111111111111111111111111111110 = -(-((i38 & 113) << 1));
                    int i5111111111111111111111111111111111111111111 = ((i511111111111111111111111111111111111111119 | i5111111111111111111111111111111111111111110) << 1) - (i511111111111111111111111111111111111111119 ^ i5111111111111111111111111111111111111111110);
                    int i61111111111111111111111111112 = i5111111111111111111111111111111111111111111 & (-110);
                    int i61111111111111111111111111113 = (i5111111111111111111111111111111111111111111 ^ (-110)) | i61111111111111111111111111112;
                    i38 = (i61111111111111111111111111112 ^ i61111111111111111111111111113) + ((i61111111111111111111111111112 & i61111111111111111111111111113) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case 59:
                    if (P(t, i41, i38)) {
                        int i1913 = a;
                        int i1914 = (((i1913 | 52) << 1) - (i1913 ^ 52)) - 1;
                        b = i1914 % 128;
                        int i1915 = i1914 % 2;
                        Object object12 = unsafe.getObject(t, jL);
                        int i1916 = a;
                        int i1917 = i1916 & 19;
                        int i1918 = ((((i1916 ^ 19) | i1917) << 1) - (~(-((i1916 | 19) & (~i1917))))) - 1;
                        b = i1918 % 128;
                        int i1919 = i1918 % 2;
                        aj(i41, object12, interfaceC0051g);
                        int i206 = a + 21;
                        b = i206 % 128;
                        int i207 = i206 % 2;
                    }
                    i2 = length;
                    entry3 = null;
                    int i5111111111111111111111111111111111111111112 = (i38 & (-114)) | ((~i38) & 113);
                    int i5111111111111111111111111111111111111111113 = -(-((i38 & 113) << 1));
                    int i5111111111111111111111111111111111111111114 = ((i5111111111111111111111111111111111111111112 | i5111111111111111111111111111111111111111113) << 1) - (i5111111111111111111111111111111111111111112 ^ i5111111111111111111111111111111111111111113);
                    int i61111111111111111111111111114 = i5111111111111111111111111111111111111111114 & (-110);
                    int i61111111111111111111111111115 = (i5111111111111111111111111111111111111111114 ^ (-110)) | i61111111111111111111111111114;
                    i38 = (i61111111111111111111111111114 ^ i61111111111111111111111111115) + ((i61111111111111111111111111114 & i61111111111111111111111111115) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case 60:
                    if (P(t, i41, i38)) {
                        ((C0055l) interfaceC0051g).f(i41, unsafe.getObject(t, jL), K(i38));
                    }
                    i2 = length;
                    entry3 = null;
                    int i5111111111111111111111111111111111111111115 = (i38 & (-114)) | ((~i38) & 113);
                    int i5111111111111111111111111111111111111111116 = -(-((i38 & 113) << 1));
                    int i5111111111111111111111111111111111111111117 = ((i5111111111111111111111111111111111111111115 | i5111111111111111111111111111111111111111116) << 1) - (i5111111111111111111111111111111111111111115 ^ i5111111111111111111111111111111111111111116);
                    int i61111111111111111111111111116 = i5111111111111111111111111111111111111111117 & (-110);
                    int i61111111111111111111111111117 = (i5111111111111111111111111111111111111111117 ^ (-110)) | i61111111111111111111111111116;
                    i38 = (i61111111111111111111111111116 ^ i61111111111111111111111111117) + ((i61111111111111111111111111116 & i61111111111111111111111111117) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case 61:
                    if (!(!P(t, i41, i38))) {
                        int i208 = a;
                        i30 = (-2) - ((((i208 | 14) << 1) - (i208 ^ 14)) ^ (-1));
                        b = i30 % 128;
                        if (i30 % 2 != 0) {
                            Object obj10 = null;
                            obj10.hashCode();
                            throw null;
                        }
                        ((C0055l) interfaceC0051g).c.cc(i41, (AbstractC0069z) unsafe.getObject(t, jL));
                    }
                    i2 = length;
                    entry3 = null;
                    int i5111111111111111111111111111111111111111118 = (i38 & (-114)) | ((~i38) & 113);
                    int i5111111111111111111111111111111111111111119 = -(-((i38 & 113) << 1));
                    int i51111111111111111111111111111111111111111110 = ((i5111111111111111111111111111111111111111118 | i5111111111111111111111111111111111111111119) << 1) - (i5111111111111111111111111111111111111111118 ^ i5111111111111111111111111111111111111111119);
                    int i61111111111111111111111111118 = i51111111111111111111111111111111111111111110 & (-110);
                    int i61111111111111111111111111119 = (i51111111111111111111111111111111111111111110 ^ (-110)) | i61111111111111111111111111118;
                    i38 = (i61111111111111111111111111118 ^ i61111111111111111111111111119) + ((i61111111111111111111111111118 & i61111111111111111111111111119) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case 62:
                    if (!(!P(t, i41, i38))) {
                        ((C0055l) interfaceC0051g).c.cq(i41, s(t, jL));
                    }
                    i2 = length;
                    entry3 = null;
                    int i51111111111111111111111111111111111111111111 = (i38 & (-114)) | ((~i38) & 113);
                    int i51111111111111111111111111111111111111111112 = -(-((i38 & 113) << 1));
                    int i51111111111111111111111111111111111111111113 = ((i51111111111111111111111111111111111111111111 | i51111111111111111111111111111111111111111112) << 1) - (i51111111111111111111111111111111111111111111 ^ i51111111111111111111111111111111111111111112);
                    int i611111111111111111111111111110 = i51111111111111111111111111111111111111111113 & (-110);
                    int i611111111111111111111111111111 = (i51111111111111111111111111111111111111111113 ^ (-110)) | i611111111111111111111111111110;
                    i38 = (i611111111111111111111111111110 ^ i611111111111111111111111111111) + ((i611111111111111111111111111110 & i611111111111111111111111111111) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case 63:
                    if (P(t, i41, i38)) {
                        ((C0055l) interfaceC0051g).c.ci(i41, s(t, jL));
                    }
                    i2 = length;
                    entry3 = null;
                    int i51111111111111111111111111111111111111111114 = (i38 & (-114)) | ((~i38) & 113);
                    int i51111111111111111111111111111111111111111115 = -(-((i38 & 113) << 1));
                    int i51111111111111111111111111111111111111111116 = ((i51111111111111111111111111111111111111111114 | i51111111111111111111111111111111111111111115) << 1) - (i51111111111111111111111111111111111111111114 ^ i51111111111111111111111111111111111111111115);
                    int i611111111111111111111111111112 = i51111111111111111111111111111111111111111116 & (-110);
                    int i611111111111111111111111111113 = (i51111111111111111111111111111111111111111116 ^ (-110)) | i611111111111111111111111111112;
                    i38 = (i611111111111111111111111111112 ^ i611111111111111111111111111113) + ((i611111111111111111111111111112 & i611111111111111111111111111113) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case 64:
                    if (P(t, i41, i38)) {
                        ((C0055l) interfaceC0051g).c.ce(i41, s(t, jL));
                    }
                    i2 = length;
                    entry3 = null;
                    int i51111111111111111111111111111111111111111117 = (i38 & (-114)) | ((~i38) & 113);
                    int i51111111111111111111111111111111111111111118 = -(-((i38 & 113) << 1));
                    int i51111111111111111111111111111111111111111119 = ((i51111111111111111111111111111111111111111117 | i51111111111111111111111111111111111111111118) << 1) - (i51111111111111111111111111111111111111111117 ^ i51111111111111111111111111111111111111111118);
                    int i611111111111111111111111111114 = i51111111111111111111111111111111111111111119 & (-110);
                    int i611111111111111111111111111115 = (i51111111111111111111111111111111111111111119 ^ (-110)) | i611111111111111111111111111114;
                    i38 = (i611111111111111111111111111114 ^ i611111111111111111111111111115) + ((i611111111111111111111111111114 & i611111111111111111111111111115) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case 65:
                    if (P(t, i41, i38)) {
                        ((C0055l) interfaceC0051g).c.cg(i41, t(t, jL));
                    }
                    i2 = length;
                    entry3 = null;
                    int i511111111111111111111111111111111111111111110 = (i38 & (-114)) | ((~i38) & 113);
                    int i511111111111111111111111111111111111111111111 = -(-((i38 & 113) << 1));
                    int i511111111111111111111111111111111111111111112 = ((i511111111111111111111111111111111111111111110 | i511111111111111111111111111111111111111111111) << 1) - (i511111111111111111111111111111111111111111110 ^ i511111111111111111111111111111111111111111111);
                    int i611111111111111111111111111116 = i511111111111111111111111111111111111111111112 & (-110);
                    int i611111111111111111111111111117 = (i511111111111111111111111111111111111111111112 ^ (-110)) | i611111111111111111111111111116;
                    i38 = (i611111111111111111111111111116 ^ i611111111111111111111111111117) + ((i611111111111111111111111111116 & i611111111111111111111111111117) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case 66:
                    if (P(t, i41, i38)) {
                        ((C0055l) interfaceC0051g).g(i41, s(t, jL));
                    }
                    i2 = length;
                    entry3 = null;
                    int i511111111111111111111111111111111111111111113 = (i38 & (-114)) | ((~i38) & 113);
                    int i511111111111111111111111111111111111111111114 = -(-((i38 & 113) << 1));
                    int i511111111111111111111111111111111111111111115 = ((i511111111111111111111111111111111111111111113 | i511111111111111111111111111111111111111111114) << 1) - (i511111111111111111111111111111111111111111113 ^ i511111111111111111111111111111111111111111114);
                    int i611111111111111111111111111118 = i511111111111111111111111111111111111111111115 & (-110);
                    int i611111111111111111111111111119 = (i511111111111111111111111111111111111111111115 ^ (-110)) | i611111111111111111111111111118;
                    i38 = (i611111111111111111111111111118 ^ i611111111111111111111111111119) + ((i611111111111111111111111111118 & i611111111111111111111111111119) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case 67:
                    if (P(t, i41, i38)) {
                        ((C0055l) interfaceC0051g).i(i41, t(t, jL));
                    }
                    i2 = length;
                    entry3 = null;
                    int i511111111111111111111111111111111111111111116 = (i38 & (-114)) | ((~i38) & 113);
                    int i511111111111111111111111111111111111111111117 = -(-((i38 & 113) << 1));
                    int i511111111111111111111111111111111111111111118 = ((i511111111111111111111111111111111111111111116 | i511111111111111111111111111111111111111111117) << 1) - (i511111111111111111111111111111111111111111116 ^ i511111111111111111111111111111111111111111117);
                    int i6111111111111111111111111111110 = i511111111111111111111111111111111111111111118 & (-110);
                    int i6111111111111111111111111111111 = (i511111111111111111111111111111111111111111118 ^ (-110)) | i6111111111111111111111111111110;
                    i38 = (i6111111111111111111111111111110 ^ i6111111111111111111111111111111) + ((i6111111111111111111111111111110 & i6111111111111111111111111111111) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                case 68:
                    if (P(t, i41, i38)) {
                        ((C0055l) interfaceC0051g).e(i41, unsafe.getObject(t, jL), K(i38));
                    }
                    i2 = length;
                    entry3 = null;
                    int i511111111111111111111111111111111111111111119 = (i38 & (-114)) | ((~i38) & 113);
                    int i5111111111111111111111111111111111111111111110 = -(-((i38 & 113) << 1));
                    int i5111111111111111111111111111111111111111111111 = ((i511111111111111111111111111111111111111111119 | i5111111111111111111111111111111111111111111110) << 1) - (i511111111111111111111111111111111111111111119 ^ i5111111111111111111111111111111111111111111110);
                    int i6111111111111111111111111111112 = i5111111111111111111111111111111111111111111111 & (-110);
                    int i6111111111111111111111111111113 = (i5111111111111111111111111111111111111111111111 ^ (-110)) | i6111111111111111111111111111112;
                    i38 = (i6111111111111111111111111111112 ^ i6111111111111111111111111111113) + ((i6111111111111111111111111111112 & i6111111111111111111111111111113) << 1);
                    entry = entry2;
                    length = i2;
                    break;
                default:
                    i2 = length;
                    entry3 = null;
                    int i5111111111111111111111111111111111111111111112 = (i38 & (-114)) | ((~i38) & 113);
                    int i5111111111111111111111111111111111111111111113 = -(-((i38 & 113) << 1));
                    int i5111111111111111111111111111111111111111111114 = ((i5111111111111111111111111111111111111111111112 | i5111111111111111111111111111111111111111111113) << 1) - (i5111111111111111111111111111111111111111111112 ^ i5111111111111111111111111111111111111111111113);
                    int i6111111111111111111111111111114 = i5111111111111111111111111111111111111111111114 & (-110);
                    int i6111111111111111111111111111115 = (i5111111111111111111111111111111111111111111114 ^ (-110)) | i6111111111111111111111111111114;
                    i38 = (i6111111111111111111111111111114 ^ i6111111111111111111111111111115) + ((i6111111111111111111111111111114 & i6111111111111111111111111111115) << 1);
                    entry = entry2;
                    length = i2;
                    break;
            }
        }
        while (entry != null) {
            int i209 = a;
            int i210 = i209 & 101;
            int i211 = -(-((i209 ^ 101) | i210));
            int i212 = (i210 & i211) + (i211 | i210);
            b = i212 % 128;
            int i213 = i212 % 2;
            this.t.l(interfaceC0051g, entry);
            entry = itN.hasNext() ? (Map.Entry) itN.next() : entry3;
        }
        o00O00<?, ?> o00o00 = this.s;
        o00o00.u(o00o00.j(t), interfaceC0051g);
    }

    /* JADX WARN: Code duplicated, block: B:97:0x028b  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean N(T t, int i) {
        boolean z;
        int i2;
        boolean z2;
        boolean z3;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 ^ 49;
        boolean z4 = true;
        int i6 = ((((i4 & 49) | i5) << 1) - (~(-i5))) - 1;
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        boolean z5 = false;
        if (!this.m) {
            int i9 = i & 2;
            int i10 = this.f[(i9 - (~(-(-((i ^ 2) | i9))))) - 1];
            int i11 = ((i7 | 43) << 1) - (i7 ^ 43);
            a = i11 % 128;
            int i12 = i11 % 2;
            if ((ar.n(t, i10 & 1048575) & (1 << (i10 >>> 20))) != 0) {
                int i13 = a;
                int i14 = i13 & 15;
                int i15 = -(-((i13 ^ 15) | i14));
                int i16 = (i14 & i15) + (i15 | i14);
                b = i16 % 128;
                int i17 = i16 % 2;
                z = true;
            } else {
                z = false;
            }
            int i18 = a;
            int i19 = ((i18 ^ 14) + ((i18 & 14) << 1)) - 1;
            b = i19 % 128;
            if (i19 % 2 == 0) {
                int i20 = 8 / 0;
            }
            return z;
        }
        int i21 = ((i4 & 2) + (i4 | 2)) - 1;
        b = i21 % 128;
        if (i21 % 2 == 0) {
            i2 = this.f[i >> 1];
        } else {
            int i22 = (i & 2) + (i | 2);
            i2 = this.f[(i22 ^ (-1)) + (i22 << 1)];
        }
        long jL = l(i2);
        Object obj = null;
        switch (v(i2)) {
            case 0:
                if (ar.l(t, jL) != 0.0d) {
                    int i23 = b;
                    int i24 = (i23 & (-108)) | ((~i23) & 107);
                    int i25 = (i23 & 107) << 1;
                    int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
                    a = i26 % 128;
                    int i27 = i26 % 2;
                    z5 = true;
                }
                int i28 = a;
                int i29 = i28 & 103;
                int i30 = ((((i28 ^ 103) | i29) << 1) - (~(-((i28 | 103) & (~i29))))) - 1;
                b = i30 % 128;
                if (i30 % 2 != 0) {
                    return z5;
                }
                throw null;
            case 1:
                if (ar.m(t, jL) == 0.0f) {
                    return false;
                }
                int i31 = b + 61;
                a = i31 % 128;
                int i32 = i31 % 2;
                return true;
            case 2:
                if (ar.p(t, jL) == 0) {
                    return false;
                }
                int i33 = b;
                int i34 = ((((i33 ^ 43) | (i33 & 43)) << 1) - (~(-(((~i33) & 43) | (i33 & (-44)))))) - 1;
                a = i34 % 128;
                int i35 = i34 % 2;
                return true;
            case 3:
                if (ar.p(t, jL) != 0) {
                    int i36 = a;
                    int i37 = (i36 ^ 49) + ((i36 & 49) << 1);
                    int i38 = i37 % 128;
                    b = i38;
                    int i39 = i37 % 2;
                    int i40 = (((i38 & (-116)) | ((~i38) & 115)) - (~(-(-((i38 & 115) << 1))))) - 1;
                    a = i40 % 128;
                    int i41 = i40 % 2;
                    z5 = true;
                }
                int i42 = a;
                int i43 = i42 & 33;
                int i44 = ((i42 ^ 33) | i43) << 1;
                int i45 = -((i42 | 33) & (~i43));
                int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
                b = i46 % 128;
                int i47 = i46 % 2;
                return z5;
            case 4:
                if (ar.n(t, jL) != 0) {
                    int i48 = a;
                    int i49 = (((i48 | 42) << 1) - (i48 ^ 42)) - 1;
                    b = i49 % 128;
                    int i50 = i49 % 2;
                    int i51 = i48 & 55;
                    int i52 = (i51 - (~((i48 ^ 55) | i51))) - 1;
                    b = i52 % 128;
                    int i53 = i52 % 2;
                } else {
                    z4 = false;
                }
                int i54 = (-2) - ((a + 66) ^ (-1));
                b = i54 % 128;
                if (i54 % 2 != 0) {
                    return z4;
                }
                throw null;
            case 5:
                if (ar.p(t, jL) != 0) {
                    int i55 = a;
                    int i56 = (((i55 | 72) << 1) - (i55 ^ 72)) - 1;
                    b = i56 % 128;
                    if (i56 % 2 == 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                } else {
                    z2 = false;
                }
                int i57 = b;
                int i58 = i57 & 21;
                int i59 = ((i57 ^ 21) | i58) << 1;
                int i60 = -((i57 | 21) & (~i58));
                int i61 = (i59 ^ i60) + ((i60 & i59) << 1);
                a = i61 % 128;
                if (i61 % 2 != 0) {
                    int i62 = 21 / 0;
                }
                return z2;
            case 6:
                if (ar.n(t, jL) != 0) {
                    int i63 = a;
                    int i64 = ((i63 & 34) + (i63 | 34)) - 1;
                    int i65 = i64 % 128;
                    b = i65;
                    int i66 = i64 % 2;
                    int i67 = i65 & 97;
                    int i68 = -(-((i65 ^ 97) | i67));
                    int i69 = (i67 & i68) + (i68 | i67);
                    a = i69 % 128;
                    int i70 = i69 % 2;
                    z5 = true;
                }
                int i71 = b;
                int i72 = ((i71 ^ 112) + ((i71 & 112) << 1)) - 1;
                a = i72 % 128;
                if (i72 % 2 == 0) {
                    return z5;
                }
                throw null;
            case 7:
                boolean zH = ar.h(t, jL);
                int i73 = (-2) - ((a + 24) ^ (-1));
                b = i73 % 128;
                if (i73 % 2 != 0) {
                    return zH;
                }
                throw null;
            case 8:
                Object objO = ar.o(t, jL);
                if (objO instanceof String) {
                    int i74 = a;
                    int i75 = ((i74 | 23) << 1) - (i74 ^ 23);
                    b = i75 % 128;
                    int i76 = i75 % 2;
                    boolean zIsEmpty = ((String) objO).isEmpty();
                    int i77 = (zIsEmpty ? 1 : 0) & 1;
                    return ((!zIsEmpty ? 1 : 0) | i77) & (~i77);
                }
                if (!(objO instanceof AbstractC0069z)) {
                    throw new IllegalArgumentException();
                }
                int i78 = b;
                int i79 = i78 & 35;
                int i80 = ((i78 ^ 35) | i79) << 1;
                int i81 = -((i78 | 35) & (~i79));
                int i82 = (i80 ^ i81) + ((i81 & i80) << 1);
                a = i82 % 128;
                if (i82 % 2 != 0) {
                    boolean zEquals = AbstractC0069z.c.equals(objO);
                    z3 = ((zEquals ? 1 : 0) & 1) | (!zEquals ? 1 : 0);
                } else {
                    boolean zEquals2 = AbstractC0069z.c.equals(objO);
                    int i83 = (zEquals2 ? 1 : 0) & 1;
                    z3 = ((!zEquals2 ? 1 : 0) | i83) & (~i83);
                }
                int i84 = a;
                int i85 = ((i84 | 9) << 1) - (i84 ^ 9);
                b = i85 % 128;
                int i86 = i85 % 2;
                return z3;
            case 9:
                if (ar.o(t, jL) == null) {
                    return false;
                }
                int i87 = b;
                int i88 = i87 + 85;
                a = i88 % 128;
                int i89 = i88 % 2;
                int i90 = i87 & 69;
                int i91 = (i87 ^ 69) | i90;
                int i92 = ((i90 | i91) << 1) - (i91 ^ i90);
                a = i92 % 128;
                int i93 = i92 % 2;
                return true;
            case 10:
                boolean zEquals3 = AbstractC0069z.c.equals(ar.o(t, jL));
                int i94 = a;
                int i95 = i94 & 97;
                int i96 = (i95 - (~(-(-((i94 ^ 97) | i95))))) - 1;
                b = i96 % 128;
                if (i96 % 2 == 0) {
                    return zEquals3;
                }
                return ((~(zEquals3 ? 1 : 0)) & 1) ^ ((zEquals3 ? 1 : 0) & (-2));
            case 11:
                if (ar.n(t, jL) == 0) {
                    return false;
                }
                int i97 = a;
                int i98 = (i97 ^ 79) + ((i97 & 79) << 1);
                int i99 = i98 % 128;
                b = i99;
                int i100 = i98 % 2;
                int i101 = i99 & 95;
                int i102 = -(-((i99 ^ 95) | i101));
                int i103 = (i101 ^ i102) + ((i102 & i101) << 1);
                a = i103 % 128;
                int i104 = i103 % 2;
                return true;
            case 12:
                if (ar.n(t, jL) != 0) {
                    int i105 = b;
                    int i106 = i105 & 101;
                    int i107 = ((i105 | 101) & (~i106)) + (i106 << 1);
                    a = i107 % 128;
                    int i108 = i107 % 2;
                    z5 = true;
                }
                int i109 = a;
                int i110 = ((((i109 ^ 89) | (i109 & 89)) << 1) - (~(-(((~i109) & 89) | (i109 & (-90)))))) - 1;
                b = i110 % 128;
                if (i110 % 2 != 0) {
                    return z5;
                }
                throw null;
            case 13:
                if (ar.n(t, jL) != 0) {
                    int i111 = a;
                    int i112 = i111 ^ 9;
                    int i113 = ((((i111 & 9) | i112) << 1) - (~(-i112))) - 1;
                    b = i113 % 128;
                    int i114 = i113 % 2;
                } else {
                    z4 = false;
                }
                int i115 = a;
                int i116 = (i115 & 7) + (i115 | 7);
                b = i116 % 128;
                if (i116 % 2 != 0) {
                    return z4;
                }
                obj.hashCode();
                throw null;
            case IMediaSession.Stub.TRANSACTION_playFromMediaId /* 14 */:
                if (ar.p(t, jL) != 0) {
                    int i117 = b + 117;
                    a = i117 % 128;
                    int i118 = i117 % 2;
                } else {
                    z4 = false;
                }
                int i119 = b;
                int i120 = i119 & 87;
                int i121 = -(-(i119 | 87));
                int i122 = (i120 & i121) + (i121 | i120);
                a = i122 % 128;
                int i123 = i122 % 2;
                return z4;
            case IMediaSession.Stub.TRANSACTION_playFromSearch /* 15 */:
                if (ar.n(t, jL) == 0) {
                    return false;
                }
                int i124 = a;
                int i125 = ((i124 & 107) - (~(i124 | 107))) - 1;
                b = i125 % 128;
                int i126 = i125 % 2;
                int i127 = (((i124 | 86) << 1) - (i124 ^ 86)) - 1;
                b = i127 % 128;
                if (i127 % 2 != 0) {
                    return true;
                }
                int i128 = 2 % 5;
                return true;
            case 16:
                if (ar.p(t, jL) == 0) {
                    return false;
                }
                int i129 = b;
                int i130 = ((i129 | 19) << 1) - (i129 ^ 19);
                int i131 = i130 % 128;
                a = i131;
                int i132 = i130 % 2;
                int i133 = (-2) - ((((i131 | 74) << 1) - (i131 ^ 74)) ^ (-1));
                b = i133 % 128;
                int i134 = i133 % 2;
                return true;
            case IMediaSession.Stub.TRANSACTION_skipToQueueItem /* 17 */:
                if (ar.o(t, jL) == null) {
                    return false;
                }
                int i135 = a;
                int i136 = (((i135 ^ 37) | (i135 & 37)) << 1) - (((~i135) & 37) | (i135 & (-38)));
                int i137 = i136 % 128;
                b = i137;
                int i138 = i136 % 2;
                int i139 = i137 & 95;
                int i140 = (i137 | 95) & (~i139);
                int i141 = -(-(i139 << 1));
                int i142 = (i140 & i141) + (i140 | i141);
                a = i142 % 128;
                int i143 = i142 % 2;
                return true;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0334  */
    /* JADX WARN: Code duplicated, block: B:106:0x0352 A[LOOP:1: B:92:0x02d8->B:106:0x0352, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x0377  */
    /* JADX WARN: Code duplicated, block: B:112:0x037e  */
    /* JADX WARN: Code duplicated, block: B:130:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x0372 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0338 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x03ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x03ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x03ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x03ad A[EDGE_INSN: B:143:0x03ad->B:114:0x03ad BREAK  A[LOOP:1: B:92:0x02d8->B:106:0x0352], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x03ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x03ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x030b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:20:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:77:0x023c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0242  */
    /* JADX WARN: Code duplicated, block: B:84:0x027b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:86:0x027d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0295  */
    /* JADX WARN: Code duplicated, block: B:90:0x029c  */
    /* JADX WARN: Code duplicated, block: B:91:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:94:0x02de  */
    /* JADX WARN: Code duplicated, block: B:98:0x031a  */
    /* JADX WARN: Code duplicated, block: B:99:0x031c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v17, types: [int] */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r3v31, types: [int] */
    /* JADX WARN: Type inference failed for: r3v47, types: [ivas.gov.bisp.enumeration.aD.ah] */
    /* JADX WARN: Type inference failed for: r3v79, types: [ivas.gov.bisp.enumeration.aD.ah] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v60, types: [ivas.gov.bisp.enumeration.aD.ah] */
    public final boolean e(T t) {
        int i;
        int i2;
        int i3;
        ?? r14;
        ?? K;
        long jL;
        ?? K2;
        long jL2;
        int i4;
        List list;
        int i5;
        ?? K3;
        int i6;
        Object obj;
        int i7;
        boolean z;
        int i8;
        int i9;
        int i10 = 2 % 2;
        int i11 = b;
        int i12 = i11 & 5;
        int i13 = -(-((i11 ^ 5) | i12));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        int i15 = i14 % 128;
        a = i15;
        int i16 = i14 % 2;
        int i17 = i15 + 85;
        b = i17 % 128;
        int i18 = i17 % 2;
        int i19 = -1;
        ?? r4 = 0;
        int i20 = -1;
        int i21 = 0;
        int i22 = 0;
        while (true) {
            Object obj2 = null;
            if (i21 >= this.f56o) {
                if (this.j) {
                    int i23 = a;
                    int i24 = i23 & 7;
                    int i25 = ((i23 ^ 7) | i24) << 1;
                    int i26 = -((i23 | 7) & (~i24));
                    int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                    b = i27 % 128;
                    if (i27 % 2 == 0) {
                        this.t.f(t).i();
                        throw null;
                    }
                    if (!this.t.f(t).i()) {
                        int i28 = a + 119;
                        b = i28 % 128;
                        int i29 = i28 % 2;
                        return false;
                    }
                }
                int i30 = b;
                int i31 = i30 & 57;
                int i32 = (i31 - (~((i30 ^ 57) | i31))) - 1;
                a = i32 % 128;
                int i33 = i32 % 2;
                return true;
            }
            int i34 = b;
            int i35 = (((i34 | 114) << 1) - (i34 ^ 114)) - 1;
            int i36 = i35 % 128;
            a = i36;
            int i37 = i35 % 2;
            int i38 = this.n[i21];
            int[] iArr = this.f;
            int i39 = i36 & 105;
            int i40 = (i36 | 105) & (~i39);
            int i41 = -(-(i39 << 1));
            int i42 = ((i40 | i41) << 1) - (i40 ^ i41);
            b = i42 % 128;
            int i43 = i42 % 2;
            int i44 = iArr[i38];
            int iAg = ag(i38);
            if (!(!this.m)) {
                int i45 = b;
                int i46 = ((i45 | 51) << 1) - (i45 ^ 51);
                a = i46 % 128;
                int i47 = i46 % 2;
                r14 = r4;
            } else {
                int i48 = b;
                int i49 = (-2) - (((i48 ^ 54) + ((i48 & 54) << 1)) ^ i19);
                a = i49 % 128;
                if (i49 % 2 != 0) {
                    i = this.f[i38 % 4];
                } else {
                    int i50 = i38 + 3;
                    i = this.f[(i50 ^ (-1)) + (i50 << 1)];
                }
                int i51 = 1048575 & i;
                i2 = 1 << (i >>> 20);
                int i52 = i48 & 69;
                int i53 = -(-((i48 ^ 69) | i52));
                int i54 = ((i52 | i53) << 1) - (i52 ^ i53);
                a = i54 % 128;
                r14 = i2;
                if (i54 % 2 != 0) {
                    ?? r3 = 29 / r4;
                    if (i51 != i20) {
                        r14 = i2;
                        i22 = d.getInt(t, i51);
                        int i55 = b;
                        i3 = ((i55 | 67) << 1) - (i55 ^ 67);
                        a = i3 % 128;
                        if (i3 % 2 == 0) {
                            obj2.hashCode();
                            throw null;
                        }
                        i20 = i51;
                        r14 = i2;
                    }
                } else if (i51 != i20) {
                    r14 = i2;
                    i22 = d.getInt(t, i51);
                    int i56 = b;
                    i3 = ((i56 | 67) << 1) - (i56 ^ 67);
                    a = i3 % 128;
                    if (i3 % 2 == 0) {
                        obj2.hashCode();
                        throw null;
                    }
                    i20 = i51;
                    r14 = i2;
                }
            }
            r14 = i2;
            if ((268435456 & iAg) != 0) {
                int i57 = a;
                int i58 = i57 & 95;
                int i59 = (i57 ^ 95) | i58;
                int i60 = ((i58 | i59) << 1) - (i59 ^ i58);
                int i61 = i60 % 128;
                b = i61;
                int i62 = i60 % 2;
                int i63 = (((i61 & (-118)) | ((~i61) & 117)) - (~(-(-((i61 & 117) << 1))))) - 1;
                a = i63 % 128;
                int i64 = i63 % 2;
                if (!Q(t, i38, i22, r14)) {
                    int i65 = a;
                    int i66 = i65 + 91;
                    b = i66 % 128;
                    int i67 = i66 % 2;
                    int i68 = (i65 & 69) + (i65 | 69);
                    b = i68 % 128;
                    if (i68 % 2 != 0) {
                        return r4;
                    }
                    throw null;
                }
            } else {
                int i69 = b;
                int i70 = (i69 | 5) << 1;
                int i71 = -(i69 ^ 5);
                int i72 = (i70 & i71) + (i71 | i70);
                a = i72 % 128;
                int i73 = i72 % 2;
            }
            int iV = v(iAg);
            if (iV != 9) {
                int i74 = b;
                int i75 = i74 & 29;
                int i76 = (i75 - (~((i74 ^ 29) | i75))) - 1;
                a = i76 % 128;
                int i77 = i76 % 2;
                if (iV != 17) {
                    int i78 = i74 ^ 113;
                    int i79 = ((i74 & 113) | i78) << 1;
                    int i80 = -i78;
                    int i81 = ((i79 | i80) << 1) - (i80 ^ i79);
                    int i82 = i81 % 128;
                    a = i82;
                    if (i81 % 2 == 0 ? iV == 27 : iV == 23) {
                        list = (List) ar.o(t, l(iAg));
                        int i83 = b;
                        int i84 = i83 & 1;
                        i5 = i84 + ((i83 ^ 1) | i84);
                        a = i5 % 128;
                        if (i5 % 2 == 0) {
                            list.isEmpty();
                            throw null;
                        }
                        if (!(!list.isEmpty())) {
                            int i85 = a;
                            int i86 = i85 & 51;
                            int i87 = i85 | 51;
                            int i88 = ((i86 | i87) << 1) - (i86 ^ i87);
                            b = i88 % 128;
                            int i89 = i88 % 2;
                            int i90 = i85 ^ 107;
                            int i91 = (((i85 & 107) | i90) << 1) - i90;
                            b = i91 % 128;
                            int i92 = i91 % 2;
                        } else {
                            K3 = K(i38);
                            int i93 = b;
                            int i94 = ((i93 ^ 41) | (i93 & 41)) << 1;
                            int i95 = -(((~i93) & 41) | (i93 & (-42)));
                            int i96 = (i94 & i95) + (i95 | i94);
                            a = i96 % 128;
                            int i97 = i96 % 2;
                            i6 = 0;
                            while (i6 < list.size()) {
                                int i98 = a;
                                int i99 = i98 ^ 69;
                                int i100 = ((i98 & 69) | i99) << 1;
                                int i101 = -i99;
                                int i102 = ((i100 | i101) << 1) - (i100 ^ i101);
                                b = i102 % 128;
                                int i103 = i102 % 2;
                                obj = list.get(i6);
                                int i104 = a;
                                int i105 = (i104 ^ 95) + ((i104 & 95) << 1);
                                b = i105 % 128;
                                int i106 = i105 % 2;
                                if (!K3.e(obj)) {
                                    int i107 = b;
                                    i7 = (i107 ^ 99) + ((i107 & 99) << 1);
                                    a = i7 % 128;
                                    if (i7 % 2 != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    int i108 = (i107 & (-58)) | ((~i107) & 57);
                                    int i109 = -(-((i107 & 57) << 1));
                                    i8 = ((i108 | i109) << 1) - (i109 ^ i108);
                                    i9 = i8 % 128;
                                    a = i9;
                                    if (i8 % 2 != 0) {
                                        int i110 = 5 / 2;
                                    }
                                    if (!z) {
                                        break;
                                    }
                                    int i111 = ((i9 | 45) << 1) - (i9 ^ 45);
                                    b = i111 % 128;
                                    int i112 = i111 % 2;
                                    int i113 = ((i9 & (-80)) | ((~i9) & 79)) + ((i9 & 79) << 1);
                                    b = i113 % 128;
                                    int i114 = i113 % 2;
                                    return false;
                                }
                                int i115 = ((i6 | 2) << 1) - (i6 ^ 2);
                                i6 = (i115 ^ (-1)) + (i115 << 1);
                                int i116 = a;
                                int i117 = (i116 & (-80)) | ((~i116) & 79);
                                int i118 = -(-((i116 & 79) << 1));
                                int i119 = (i117 & i118) + (i118 | i117);
                                b = i119 % 128;
                                int i120 = i119 % 2;
                            }
                        }
                    } else {
                        int i121 = (((i82 | 92) << 1) - (i82 ^ 92)) - 1;
                        b = i121 % 128;
                        if (i121 % 2 != 0 ? iV != 60 : iV != 73) {
                            int i122 = ((i82 | 59) << 1) - (i82 ^ 59);
                            b = i122 % 128;
                            if (i122 % 2 != 0 ? iV == 68 : iV == 28) {
                                if (P(t, i44, i38)) {
                                    int i123 = a;
                                    int i124 = (((i123 | 78) << 1) - (i123 ^ 78)) - 1;
                                    b = i124 % 128;
                                    int i125 = i124 % 2;
                                    K2 = K(i38);
                                    jL2 = l(iAg);
                                    int i126 = a + 43;
                                    b = i126 % 128;
                                    int i127 = i126 % 2;
                                    if (!K2.e(ar.o(t, jL2))) {
                                        int i128 = b;
                                        int i129 = i128 & 65;
                                        i4 = i129 + ((i128 ^ 65) | i129);
                                        a = i4 % 128;
                                        if (i4 % 2 != 0) {
                                            return true;
                                        }
                                        return false;
                                    }
                                } else {
                                    continue;
                                }
                            } else if (iV != 49) {
                                int i130 = i82 ^ 83;
                                int i131 = ((i82 & 83) | i130) << 1;
                                int i132 = -i130;
                                int i133 = (i131 & i132) + (i132 | i131);
                                b = i133 % 128;
                                int i134 = i133 % 2;
                                if (iV == 50) {
                                    int i135 = i82 & 57;
                                    int i136 = -(-((i82 ^ 57) | i135));
                                    int i137 = ((i135 | i136) << 1) - (i135 ^ i136);
                                    b = i137 % 128;
                                    if (i137 % 2 == 0) {
                                        ar.o(t, l(iAg));
                                        throw null;
                                    }
                                    if (!this.u.e(ar.o(t, l(iAg))).isEmpty()) {
                                        int i138 = a;
                                        int i139 = i138 & 91;
                                        int i140 = (i138 ^ 91) | i139;
                                        int i141 = (i139 ^ i140) + ((i140 & i139) << 1);
                                        int i142 = i141 % 128;
                                        b = i142;
                                        Object obj3 = i141 % 2 == 0 ? this.g[(i38 % 5) << 3] : this.g[(i38 / 3) * 2];
                                        int i143 = i142 & 95;
                                        int i144 = (i142 ^ 95) | i143;
                                        int i145 = ((i143 | i144) << 1) - (i144 ^ i143);
                                        a = i145 % 128;
                                        if (i145 % 2 != 0) {
                                            this.u.n(obj3);
                                            Object obj4 = null;
                                            Objects.requireNonNull(null);
                                            obj4.hashCode();
                                            throw null;
                                        }
                                        this.u.n(obj3);
                                        Objects.requireNonNull(null);
                                        int i146 = b;
                                        int i147 = i146 & 51;
                                        int i148 = (i146 | 51) & (~i147);
                                        int i149 = i147 << 1;
                                        int i150 = (i148 ^ i149) + ((i148 & i149) << 1);
                                        a = i150 % 128;
                                        int i151 = i150 % 2;
                                        throw null;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                list = (List) ar.o(t, l(iAg));
                                int i810 = b;
                                int i811 = i810 & 1;
                                i5 = i811 + ((i810 ^ 1) | i811);
                                a = i5 % 128;
                                if (i5 % 2 == 0) {
                                    list.isEmpty();
                                    throw null;
                                }
                                if (!(!list.isEmpty())) {
                                    int i812 = a;
                                    int i813 = i812 & 51;
                                    int i814 = i812 | 51;
                                    int i815 = ((i813 | i814) << 1) - (i813 ^ i814);
                                    b = i815 % 128;
                                    int i816 = i815 % 2;
                                    int i910 = i812 ^ 107;
                                    int i911 = (((i812 & 107) | i910) << 1) - i910;
                                    b = i911 % 128;
                                    int i912 = i911 % 2;
                                } else {
                                    K3 = K(i38);
                                    int i913 = b;
                                    int i914 = ((i913 ^ 41) | (i913 & 41)) << 1;
                                    int i915 = -(((~i913) & 41) | (i913 & (-42)));
                                    int i916 = (i914 & i915) + (i915 | i914);
                                    a = i916 % 128;
                                    int i917 = i916 % 2;
                                    i6 = 0;
                                    while (i6 < list.size()) {
                                        int i918 = a;
                                        int i919 = i918 ^ 69;
                                        int i1010 = ((i918 & 69) | i919) << 1;
                                        int i1011 = -i919;
                                        int i1012 = ((i1010 | i1011) << 1) - (i1010 ^ i1011);
                                        b = i1012 % 128;
                                        int i1013 = i1012 % 2;
                                        obj = list.get(i6);
                                        int i1014 = a;
                                        int i1015 = (i1014 ^ 95) + ((i1014 & 95) << 1);
                                        b = i1015 % 128;
                                        int i1016 = i1015 % 2;
                                        if (!K3.e(obj)) {
                                            int i1017 = b;
                                            i7 = (i1017 ^ 99) + ((i1017 & 99) << 1);
                                            a = i7 % 128;
                                            if (i7 % 2 != 0) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            int i1018 = (i1017 & (-58)) | ((~i1017) & 57);
                                            int i1019 = -(-((i1017 & 57) << 1));
                                            i8 = ((i1018 | i1019) << 1) - (i1019 ^ i1018);
                                            i9 = i8 % 128;
                                            a = i9;
                                            if (i8 % 2 != 0) {
                                                int i1110 = 5 / 2;
                                            }
                                            if (!z) {
                                                break;
                                                break;
                                            }
                                            int i1111 = ((i9 | 45) << 1) - (i9 ^ 45);
                                            b = i1111 % 128;
                                            int i1112 = i1111 % 2;
                                            int i1113 = ((i9 & (-80)) | ((~i9) & 79)) + ((i9 & 79) << 1);
                                            b = i1113 % 128;
                                            int i1114 = i1113 % 2;
                                            return false;
                                        }
                                        int i1115 = ((i6 | 2) << 1) - (i6 ^ 2);
                                        i6 = (i1115 ^ (-1)) + (i1115 << 1);
                                        int i1116 = a;
                                        int i1117 = (i1116 & (-80)) | ((~i1116) & 79);
                                        int i1118 = -(-((i1116 & 79) << 1));
                                        int i1119 = (i1117 & i1118) + (i1118 | i1117);
                                        b = i1119 % 128;
                                        int i1210 = i1119 % 2;
                                    }
                                }
                            }
                        } else if (P(t, i44, i38)) {
                            int i1211 = a;
                            int i1212 = (((i1211 | 78) << 1) - (i1211 ^ 78)) - 1;
                            b = i1212 % 128;
                            int i1213 = i1212 % 2;
                            K2 = K(i38);
                            jL2 = l(iAg);
                            int i1214 = a + 43;
                            b = i1214 % 128;
                            int i1215 = i1214 % 2;
                            if (!K2.e(ar.o(t, jL2))) {
                                int i1216 = b;
                                int i1217 = i1216 & 65;
                                i4 = i1217 + ((i1216 ^ 65) | i1217);
                                a = i4 % 128;
                                if (i4 % 2 != 0) {
                                    return true;
                                }
                                return false;
                            }
                        } else {
                            continue;
                        }
                    }
                } else if (!Q(t, i38, i22, r14)) {
                    continue;
                } else {
                    int i152 = a;
                    int i153 = i152 & 71;
                    int i154 = (((i152 | 71) & (~i153)) - (~(-(-(i153 << 1))))) - 1;
                    b = i154 % 128;
                    int i155 = i154 % 2;
                    K = K(i38);
                    jL = l(iAg);
                    int i156 = a + 39;
                    b = i156 % 128;
                    int i157 = i156 % 2;
                    if (!(!K.e(ar.o(t, jL)))) {
                        int i158 = b;
                        int i159 = (-2) - ((-1) ^ ((i158 ^ 68) + ((i158 & 68) << 1)));
                        a = i159 % 128;
                        int i160 = i159 % 2;
                        return false;
                    }
                }
            } else if (!Q(t, i38, i22, r14)) {
                continue;
            } else {
                int i1510 = a;
                int i1511 = i1510 & 71;
                int i1512 = (((i1510 | 71) & (~i1511)) - (~(-(-(i1511 << 1))))) - 1;
                b = i1512 % 128;
                int i1513 = i1512 % 2;
                K = K(i38);
                jL = l(iAg);
                int i1514 = a + 39;
                b = i1514 % 128;
                int i1515 = i1514 % 2;
                if (!(!K.e(ar.o(t, jL)))) {
                    int i1516 = b;
                    int i1517 = (-2) - ((-1) ^ ((i1516 ^ 68) + ((i1516 & 68) << 1)));
                    a = i1517 % 128;
                    int i161 = i1517 % 2;
                    return false;
                }
            }
            i21++;
            int i162 = b;
            int i163 = i162 & 85;
            int i164 = ((i162 ^ 85) | i163) << 1;
            int i165 = -((i162 | 85) & (~i163));
            int i166 = ((i164 | i165) << 1) - (i165 ^ i164);
            a = i166 % 128;
            int i167 = i166 % 2;
            i19 = -1;
            r4 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:160:0x04e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:163:0x050d  */
    /* JADX WARN: Code duplicated, block: B:165:0x0520  */
    /* JADX WARN: Code duplicated, block: B:166:0x0523  */
    /* JADX WARN: Code duplicated, block: B:169:0x0540  */
    /* JADX WARN: Code duplicated, block: B:16:0x0066  */
    /* JADX WARN: Code duplicated, block: B:177:0x0587  */
    /* JADX WARN: Code duplicated, block: B:179:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:180:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:183:0x0611  */
    /* JADX WARN: Code duplicated, block: B:184:0x0621  */
    /* JADX WARN: Code duplicated, block: B:186:0x0635  */
    /* JADX WARN: Code duplicated, block: B:188:0x064b  */
    /* JADX WARN: Code duplicated, block: B:191:0x0651  */
    /* JADX WARN: Code duplicated, block: B:197:0x066c  */
    /* JADX WARN: Code duplicated, block: B:199:0x0689 A[PHI: r0 r15 r19 r28 r29 r30
  0x0689: PHI (r0v144 int) = (r0v136 int), (r0v153 int) binds: [B:198:0x0687, B:182:0x060f] A[DONT_GENERATE, DONT_INLINE]
  0x0689: PHI (r15v14 int) = (r15v13 int), (r9v17 int) binds: [B:198:0x0687, B:182:0x060f] A[DONT_GENERATE, DONT_INLINE]
  0x0689: PHI (r19v19 int) = (r19v18 int), (r19v22 int) binds: [B:198:0x0687, B:182:0x060f] A[DONT_GENERATE, DONT_INLINE]
  0x0689: PHI (r28v10 int) = (r28v9 int), (r7v1 int) binds: [B:198:0x0687, B:182:0x060f] A[DONT_GENERATE, DONT_INLINE]
  0x0689: PHI (r29v9 sun.misc.Unsafe) = (r29v8 sun.misc.Unsafe), (r8v1 sun.misc.Unsafe) binds: [B:198:0x0687, B:182:0x060f] A[DONT_GENERATE, DONT_INLINE]
  0x0689: PHI (r30v9 int) = (r30v8 int), (r19v17 int) binds: [B:198:0x0687, B:182:0x060f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:201:0x06ac A[PHI: r0 r15 r19 r28 r29 r30
  0x06ac: PHI (r0v145 int) = (r0v136 int), (r0v153 int) binds: [B:198:0x0687, B:183:0x0611] A[DONT_GENERATE, DONT_INLINE]
  0x06ac: PHI (r15v15 int) = (r15v13 int), (r9v17 int) binds: [B:198:0x0687, B:183:0x0611] A[DONT_GENERATE, DONT_INLINE]
  0x06ac: PHI (r19v20 int) = (r19v18 int), (r19v22 int) binds: [B:198:0x0687, B:183:0x0611] A[DONT_GENERATE, DONT_INLINE]
  0x06ac: PHI (r28v11 int) = (r28v9 int), (r7v1 int) binds: [B:198:0x0687, B:183:0x0611] A[DONT_GENERATE, DONT_INLINE]
  0x06ac: PHI (r29v10 sun.misc.Unsafe) = (r29v8 sun.misc.Unsafe), (r8v1 sun.misc.Unsafe) binds: [B:198:0x0687, B:183:0x0611] A[DONT_GENERATE, DONT_INLINE]
  0x06ac: PHI (r30v10 int) = (r30v8 int), (r19v17 int) binds: [B:198:0x0687, B:183:0x0611] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:214:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x04eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x0659 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0659 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x0581 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x0573 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x0544 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00c0 A[PHI: r1
  0x00c0: PHI (r1v179 int) = (r1v178 int), (r1v182 int) binds: [B:29:0x00be, B:26:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:43:0x0102  */
    /* JADX WARN: Code duplicated, block: B:45:0x0138  */
    /* JADX WARN: Code duplicated, block: B:49:0x0146  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final int Z(T t, byte[] bArr, int i, int i2, C0049e.biK bik) throws C0065v {
        int i3;
        byte b2;
        int i4;
        int iT;
        int iAa;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int iV;
        long jL;
        int i13;
        int i14;
        double dLongBitsToDouble;
        int iC;
        int i15;
        int i16;
        long j;
        int i17;
        int i18;
        R.biN binG;
        int size;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        ad<T> adVar = this;
        Object obj = t;
        byte[] bArr2 = bArr;
        int i24 = i2;
        C0049e.biK bik2 = bik;
        int i25 = 2;
        int i26 = 2 % 2;
        int i27 = b;
        int i28 = ((i27 & 20) + (i27 | 20)) - 1;
        int i29 = i28 % 128;
        a = i29;
        int i30 = i28 % 2;
        Unsafe unsafe = d;
        int i31 = 1;
        int i32 = ((i29 | 21) << 1) - (i29 ^ 21);
        b = i32 % 128;
        Object obj2 = null;
        if (i32 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        int iR = i;
        int i33 = -1;
        int i34 = 0;
        while (iR < i24) {
            int i35 = a;
            int i36 = ((i35 | 41) << i31) - (i35 ^ 41);
            int i37 = i36 % 128;
            b = i37;
            if (i36 % i25 == 0) {
                b2 = bArr2[iR];
                if (b2 < 0) {
                    i3 = 0;
                    int i38 = i37 & 61;
                    int i39 = (i37 ^ 61) | i38;
                    i23 = (i38 & i39) + (i39 | i38);
                    a = i23 % 128;
                    if (i23 % i25 == 0) {
                        C0049e.t(b2, bArr2, i3, bik2);
                        obj2.hashCode();
                        throw null;
                    }
                    iT = C0049e.t(b2, bArr2, i3, bik2);
                    i4 = bik2.a;
                } else {
                    i3 = 0;
                    int i40 = i37 + 31;
                    a = i40 % 128;
                    int i41 = i40 % i25;
                    i4 = b2;
                    iT = i3;
                }
            } else {
                i3 = iR + 1;
                b2 = bArr2[iR];
                if (b2 < 0) {
                    int i310 = i37 & 61;
                    int i311 = (i37 ^ 61) | i310;
                    i23 = (i310 & i311) + (i311 | i310);
                    a = i23 % 128;
                    if (i23 % i25 == 0) {
                        C0049e.t(b2, bArr2, i3, bik2);
                        obj2.hashCode();
                        throw null;
                    }
                    iT = C0049e.t(b2, bArr2, i3, bik2);
                    i4 = bik2.a;
                } else {
                    int i42 = i37 + 31;
                    a = i42 % 128;
                    int i43 = i42 % i25;
                    i4 = b2;
                    iT = i3;
                }
            }
            int i44 = i4 >>> 3;
            int i45 = i4 & 7;
            int i46 = b;
            int i47 = (i46 & (-72)) | (71 & (~i46));
            int i48 = (i46 & 71) << i31;
            int i49 = (i47 ^ i48) + ((i48 & i47) << i31);
            int i50 = i49 % 128;
            a = i50;
            if (i49 % i25 != 0) {
                obj2.hashCode();
                throw null;
            }
            if (i44 > i33) {
                int i51 = i50 & 27;
                int i52 = (i51 - (~((i50 ^ 27) | i51))) - i31;
                b = i52 % 128;
                if (i52 % i25 == 0) {
                    i21 = ((i34 | (-2)) << i31) - (i34 ^ (-2));
                    if (i44 >= adVar.h) {
                        i22 = i50 + 35;
                        b = i22 % 128;
                        if (i22 % i25 == 0) {
                            int i53 = 8 / 0;
                            if (i44 <= adVar.i) {
                                iAa = adVar.ak(i44, i21);
                            }
                        } else if (i44 <= adVar.i) {
                            iAa = adVar.ak(i44, i21);
                        }
                        if (i5 == i6) {
                            i7 = i6;
                            i8 = i44;
                            i9 = iT;
                            i31 = i31;
                            unsafe = unsafe;
                            i10 = i25;
                            i11 = 0;
                        } else {
                            int[] iArr = adVar.f;
                            int i54 = i5 & 1;
                            int i55 = ((i5 ^ 1) | i54) << i31;
                            int i56 = -((~i54) & (i5 | 1));
                            i12 = iArr[((i55 | i56) << i31) - (i55 ^ i56)];
                            iV = v(i12);
                            jL = l(i12);
                            i13 = a;
                            i14 = (((i13 | 68) << 1) - (i13 ^ 68)) - 1;
                            int i57 = i14 % 128;
                            b = i57;
                            if (i14 % 2 == 0 ? iV <= 17 : iV <= 88) {
                                switch (iV) {
                                    case 0:
                                        i7 = -1;
                                        i8 = i44;
                                        if (i45 != i31) {
                                            int i58 = (i57 ^ 113) + ((i57 & 113) << i31);
                                            a = i58 % 128;
                                            int i59 = i58 % 2;
                                            i7 = i7;
                                            i10 = 2;
                                        } else {
                                            int i60 = ((i57 ^ 79) | (i57 & 79)) << i31;
                                            int i61 = -(((~i57) & 79) | (i57 & (-80)));
                                            int i62 = ((i60 | i61) << i31) - (i60 ^ i61);
                                            a = i62 % 128;
                                            if (i62 % 2 != 0) {
                                                dLongBitsToDouble = Double.longBitsToDouble(C0049e.e(bArr2, iT));
                                                int i63 = 6 / 0;
                                            } else {
                                                dLongBitsToDouble = Double.longBitsToDouble(C0049e.e(bArr2, iT));
                                            }
                                            int i64 = b;
                                            int i65 = i64 | 103;
                                            int i66 = i65 << 1;
                                            int i67 = -((~(i64 & 103)) & i65);
                                            int i68 = (i66 & i67) + (i67 | i66);
                                            a = i68 % 128;
                                            int i69 = i68 % 2;
                                            ar.x(obj, jL, dLongBitsToDouble);
                                            int i70 = b;
                                            int i71 = ((i70 & (-64)) | ((~i70) & 63)) + ((i70 & 63) << i31);
                                            a = i71 % 128;
                                            int i72 = i71 % 2;
                                            iR = ((((iT ^ 8) | (iT & 8)) << i31) - (~(-((iT & (-9)) | ((~iT) & 8))))) - i31;
                                            int i73 = b;
                                            int i74 = i73 & 45;
                                            int i75 = (i73 ^ 45) | i74;
                                            int i76 = ((i74 | i75) << i31) - (i75 ^ i74);
                                            a = i76 % 128;
                                            int i77 = i76 % 2;
                                            i34 = i5;
                                            i33 = i8;
                                            i25 = 2;
                                        }
                                        break;
                                    case 1:
                                        i7 = -1;
                                        i8 = i44;
                                        if (i45 != 5) {
                                            int i510 = (i57 ^ 113) + ((i57 & 113) << i31);
                                            a = i510 % 128;
                                            int i511 = i510 % 2;
                                            i7 = i7;
                                            i10 = 2;
                                        } else {
                                            float fIntBitsToFloat = Float.intBitsToFloat(C0049e.d(bArr2, iT));
                                            ar.bkn bknVar = ar.h;
                                            int i78 = b;
                                            int i79 = ((i78 & 118) + (i78 | 118)) - i31;
                                            a = i79 % 128;
                                            int i80 = i79 % 2;
                                            bknVar.o(obj, jL, fIntBitsToFloat);
                                            int i81 = iT & 89;
                                            int i82 = ((~i81) & (iT | 89)) + (i81 << i31);
                                            int i83 = i82 & (-85);
                                            iR = (((i82 ^ (-85)) | i83) << i31) - ((i82 | (-85)) & (~i83));
                                            int i84 = b + 91;
                                            a = i84 % 128;
                                            int i85 = i84 % 2;
                                            i34 = i5;
                                            i33 = i8;
                                            i25 = 2;
                                        }
                                        break;
                                    case 2:
                                    case 3:
                                        i7 = -1;
                                        i8 = i44;
                                        if (i45 != 0) {
                                            int i512 = (i57 ^ 113) + ((i57 & 113) << i31);
                                            a = i512 % 128;
                                            int i513 = i512 % 2;
                                            i7 = i7;
                                            i10 = 2;
                                        } else {
                                            int i86 = i13 + 56;
                                            int i87 = (i86 ^ (-1)) + (i86 << 1);
                                            b = i87 % 128;
                                            if (i87 % 2 == 0) {
                                                C0049e.w(bArr2, iT, bik2);
                                                obj2.hashCode();
                                                throw null;
                                            }
                                            int iW = C0049e.w(bArr2, iT, bik2);
                                            unsafe.putLong(t, jL, bik2.b);
                                            int i88 = a;
                                            int i89 = i88 & 29;
                                            int i90 = ((i88 ^ 29) | i89) << i31;
                                            int i91 = -((i88 | 29) & (~i89));
                                            int i92 = ((i90 | i91) << i31) - (i91 ^ i90);
                                            b = i92 % 128;
                                            if (i92 % 2 == 0) {
                                                int i93 = 2 % 5;
                                            }
                                            iR = iW;
                                            i34 = i5;
                                            i33 = i8;
                                            i25 = 2;
                                        }
                                        break;
                                    case 4:
                                    case 11:
                                        i7 = -1;
                                        i8 = i44;
                                        if (i45 != 0) {
                                            int i514 = (i57 ^ 113) + ((i57 & 113) << i31);
                                            a = i514 % 128;
                                            int i515 = i514 % 2;
                                            i7 = i7;
                                            i10 = 2;
                                        } else {
                                            int i94 = (((i57 ^ 85) | (i57 & 85)) << i31) - (((~i57) & 85) | (i57 & (-86)));
                                            a = i94 % 128;
                                            if (i94 % 2 != 0) {
                                                C0049e.v(bArr2, iT, bik2);
                                                obj2.hashCode();
                                                throw null;
                                            }
                                            iR = C0049e.v(bArr2, iT, bik2);
                                            int i95 = a;
                                            int i96 = (i95 & 13) + (i95 | 13);
                                            b = i96 % 128;
                                            if (i96 % 2 == 0) {
                                                unsafe.putInt(obj, jL, bik2.a);
                                                int i97 = 34 / 0;
                                            } else {
                                                unsafe.putInt(obj, jL, bik2.a);
                                            }
                                            i34 = i5;
                                            i33 = i8;
                                            i25 = 2;
                                        }
                                        break;
                                    case 5:
                                    case IMediaSession.Stub.TRANSACTION_playFromMediaId /* 14 */:
                                        i8 = i44;
                                        if (i45 != i31) {
                                            i7 = -1;
                                            int i98 = ((i13 | 23) << i31) - (i13 ^ 23);
                                            b = i98 % 128;
                                            int i99 = i98 % 2;
                                            i7 = i7;
                                            i10 = 2;
                                        } else {
                                            int i100 = i57 + 3;
                                            a = i100 % 128;
                                            if (i100 % 2 != 0) {
                                                C0049e.e(bArr2, iT);
                                                obj2.hashCode();
                                                throw null;
                                            }
                                            long jE = C0049e.e(bArr2, iT);
                                            i7 = -1;
                                            int i101 = (-2) - ((b + 78) ^ (-1));
                                            a = i101 % 128;
                                            int i102 = i101 % 2;
                                            unsafe.putLong(t, jL, jE);
                                            iR = ((((iT ^ 8) | (iT & 8)) << i31) - (~(-((iT & (-9)) | ((~iT) & 8))))) - i31;
                                            int i710 = b;
                                            int i711 = i710 & 45;
                                            int i712 = (i710 ^ 45) | i711;
                                            int i713 = ((i711 | i712) << i31) - (i712 ^ i711);
                                            a = i713 % 128;
                                            int i714 = i713 % 2;
                                            i34 = i5;
                                            i33 = i8;
                                            i25 = 2;
                                        }
                                        break;
                                    case 6:
                                    case 13:
                                        i8 = i44;
                                        if (i45 != 5) {
                                            i7 = -1;
                                            int i910 = ((i13 | 23) << i31) - (i13 ^ 23);
                                            b = i910 % 128;
                                            int i911 = i910 % 2;
                                            i7 = i7;
                                            i10 = 2;
                                        } else {
                                            unsafe.putInt(obj, jL, C0049e.d(bArr2, iT));
                                            int i103 = ((iT | (-86)) << i31) - (iT ^ (-86));
                                            iC = (i103 & 90) + (i103 | 90);
                                            iR = iC;
                                            i7 = -1;
                                            i34 = i5;
                                            i33 = i8;
                                            i25 = 2;
                                        }
                                        break;
                                    case 7:
                                        i8 = i44;
                                        if (i45 != 0) {
                                            i7 = -1;
                                            int i912 = ((i13 | 23) << i31) - (i13 ^ 23);
                                            b = i912 % 128;
                                            int i913 = i912 % 2;
                                            i7 = i7;
                                            i10 = 2;
                                        } else {
                                            int i104 = i57 + 63;
                                            a = i104 % 128;
                                            int i105 = i104 % 2;
                                            iR = C0049e.w(bArr2, iT, bik2);
                                            long j2 = bik2.b;
                                            int i106 = b;
                                            int i107 = (-2) - (((i106 ^ 34) + ((i106 & 34) << i31)) ^ (-1));
                                            a = i107 % 128;
                                            ar.h.m(obj, jL, (i107 % 2 == 0 ? j2 != 0 : j2 != 0) ? i31 : 0);
                                            i7 = -1;
                                            i34 = i5;
                                            i33 = i8;
                                            i25 = 2;
                                        }
                                        break;
                                    case 8:
                                        i8 = i44;
                                        if (i45 != 2) {
                                            i7 = -1;
                                            int i914 = ((i13 | 23) << i31) - (i13 ^ 23);
                                            b = i914 % 128;
                                            int i915 = i914 % 2;
                                            i7 = i7;
                                            i10 = 2;
                                        } else {
                                            int i108 = (i57 & 59) + (i57 | 59);
                                            int i109 = i108 % 128;
                                            a = i109;
                                            int i110 = i108 % 2;
                                            if ((536870912 & i12) == 0) {
                                                int i111 = (i109 & 39) + (i109 | 39);
                                                b = i111 % 128;
                                                if (i111 % 2 == 0) {
                                                    C0049e.q(bArr2, iT, bik2);
                                                    throw null;
                                                }
                                                iR = C0049e.q(bArr2, iT, bik2);
                                            } else {
                                                iR = C0049e.s(bArr2, iT, bik2);
                                            }
                                            unsafe.putObject(obj, jL, bik2.c);
                                            i7 = -1;
                                            i34 = i5;
                                            i33 = i8;
                                            i25 = 2;
                                        }
                                        break;
                                    case 9:
                                        i8 = i44;
                                        if (i45 != 2) {
                                            i7 = -1;
                                            int i916 = ((i13 | 23) << i31) - (i13 ^ 23);
                                            b = i916 % 128;
                                            int i917 = i916 % 2;
                                            i7 = i7;
                                            i10 = 2;
                                        } else {
                                            int i112 = (i13 & 107) + (i13 | 107);
                                            b = i112 % 128;
                                            int i113 = i112 % 2;
                                            ah ahVarK = adVar.K(i5);
                                            int i114 = a;
                                            int i115 = (i114 & 100) + (i114 | 100);
                                            int i116 = (i115 ^ (-1)) + (i115 << i31);
                                            b = i116 % 128;
                                            int i117 = i116 % 2;
                                            iR = C0049e.h(ahVarK, bArr2, iT, i24, bik2);
                                            Object object = unsafe.getObject(obj, jL);
                                            int i118 = b;
                                            int i119 = ((i118 | 105) << i31) - (i118 ^ 105);
                                            int i120 = i119 % 128;
                                            a = i120;
                                            int i121 = i119 % 2;
                                            if (object == null) {
                                                int i122 = ((i120 & 14) + (i120 | 14)) - 1;
                                                b = i122 % 128;
                                                int i123 = i122 % 2;
                                                unsafe.putObject(obj, jL, bik2.c);
                                            } else {
                                                Object objD = R.d(object, bik2.c);
                                                int i124 = b;
                                                int i125 = (((i124 ^ 61) | (i124 & 61)) << i31) - (((~i124) & 61) | (i124 & (-62)));
                                                a = i125 % 128;
                                                if (i125 % 2 != 0) {
                                                    unsafe.putObject(obj, jL, objD);
                                                    throw null;
                                                }
                                                unsafe.putObject(obj, jL, objD);
                                                int i126 = b + 39;
                                                a = i126 % 128;
                                                int i127 = i126 % 2;
                                            }
                                            i7 = -1;
                                            i34 = i5;
                                            i33 = i8;
                                            i25 = 2;
                                        }
                                        break;
                                    case 10:
                                        i8 = i44;
                                        if (i45 != 2) {
                                            i7 = -1;
                                            int i918 = ((i13 | 23) << i31) - (i13 ^ 23);
                                            b = i918 % 128;
                                            int i919 = i918 % 2;
                                            i7 = i7;
                                            i10 = 2;
                                        } else {
                                            int i128 = i57 + 67;
                                            a = i128 % 128;
                                            if (i128 % 2 != 0) {
                                                C0049e.c(bArr2, iT, bik2);
                                                obj2.hashCode();
                                                throw null;
                                            }
                                            iC = C0049e.c(bArr2, iT, bik2);
                                            unsafe.putObject(obj, jL, bik2.c);
                                            int i129 = b;
                                            int i130 = (i129 & 4) + (i129 | 4);
                                            int i131 = (i130 ^ (-1)) + (i130 << i31);
                                            a = i131 % 128;
                                            if (i131 % 2 != 0) {
                                                int i132 = 2 / 5;
                                            }
                                            iR = iC;
                                            i7 = -1;
                                            i34 = i5;
                                            i33 = i8;
                                            i25 = 2;
                                        }
                                        break;
                                    case 12:
                                        i8 = i44;
                                        if (i45 != 0) {
                                            i7 = -1;
                                            int i516 = (i57 ^ 113) + ((i57 & 113) << i31);
                                            a = i516 % 128;
                                            int i517 = i516 % 2;
                                            i7 = i7;
                                            i10 = 2;
                                        } else {
                                            iR = C0049e.v(bArr2, iT, bik2);
                                            int i133 = a;
                                            int i134 = (i133 | 29) << i31;
                                            int i135 = -(i133 ^ 29);
                                            int i136 = (i134 & i135) + (i135 | i134);
                                            b = i136 % 128;
                                            int i137 = i136 % 2;
                                            unsafe.putInt(obj, jL, bik2.a);
                                            i7 = -1;
                                            i34 = i5;
                                            i33 = i8;
                                            i25 = 2;
                                        }
                                        break;
                                    case IMediaSession.Stub.TRANSACTION_playFromSearch /* 15 */:
                                        i8 = i44;
                                        if (i45 != 0) {
                                            i7 = -1;
                                            int i518 = (i57 ^ 113) + ((i57 & 113) << i31);
                                            a = i518 % 128;
                                            int i519 = i518 % 2;
                                            i7 = i7;
                                            i10 = 2;
                                        } else {
                                            int i138 = i57 + 59;
                                            a = i138 % 128;
                                            int i139 = i138 % 2;
                                            iR = C0049e.v(bArr2, iT, bik2);
                                            int i140 = bik2.a;
                                            int i141 = a;
                                            int i142 = ((((i141 ^ 31) | (i141 & 31)) << i31) - (~(-(((~i141) & 31) | (i141 & (-32)))))) - i31;
                                            b = i142 % 128;
                                            if (i142 % 2 == 0) {
                                                unsafe.putInt(obj, jL, P.c(i140));
                                                throw null;
                                            }
                                            unsafe.putInt(obj, jL, P.c(i140));
                                            i7 = -1;
                                            i34 = i5;
                                            i33 = i8;
                                            i25 = 2;
                                        }
                                        break;
                                    case 16:
                                        if (i45 != 0) {
                                            i8 = i44;
                                            i7 = -1;
                                            int i9110 = ((i13 | 23) << i31) - (i13 ^ 23);
                                            b = i9110 % 128;
                                            int i9111 = i9110 % 2;
                                            i7 = i7;
                                            i10 = 2;
                                        } else {
                                            int iW2 = C0049e.w(bArr2, iT, bik2);
                                            i8 = i44;
                                            unsafe.putLong(t, jL, P.d(bik2.b));
                                            iR = iW2;
                                            i7 = -1;
                                            i34 = i5;
                                            i33 = i8;
                                            i25 = 2;
                                        }
                                        break;
                                    default:
                                        i8 = i44;
                                        int i143 = ((i57 ^ 108) + ((i57 & 108) << i31)) - i31;
                                        a = i143 % 128;
                                        int i144 = i143 % 2;
                                        i10 = 2;
                                        i7 = -1;
                                        break;
                                }
                            } else {
                                i7 = -1;
                                i8 = i44;
                                if (iV == 27) {
                                    if (i45 == 2) {
                                        binG = (R.biN) unsafe.getObject(obj, jL);
                                        int i145 = b;
                                        int i146 = i145 & 35;
                                        int i147 = -(-((i145 ^ 35) | i146));
                                        int i148 = (i146 ^ i147) + ((i147 & i146) << i31);
                                        a = i148 % 128;
                                        int i149 = i148 % 2;
                                        if (!binG.o()) {
                                            int i150 = a;
                                            int i151 = (i150 & 29) + (i150 | 29);
                                            b = i151 % 128;
                                            int i152 = i151 % 2;
                                            size = binG.size();
                                            if (size == 0) {
                                                i19 = 10;
                                            } else {
                                                i19 = size * 2;
                                            }
                                            binG = binG.g(i19);
                                            int i153 = b;
                                            i20 = (((i153 | 29) << i31) - (~(-((29 & (~i153)) | (i153 & (-30)))))) - i31;
                                            a = i20 % 128;
                                            if (i20 % 2 != 0) {
                                                unsafe.putObject(obj, jL, binG);
                                                throw null;
                                            }
                                            unsafe.putObject(obj, jL, binG);
                                        }
                                        R.biN bin2 = binG;
                                        ah ahVarK2 = adVar.K(i5);
                                        int i154 = b;
                                        int i155 = i154 & 27;
                                        int i156 = ((27 | i154) & (~i155)) + (i155 << 1);
                                        a = i156 % 128;
                                        int i157 = i156 % 2;
                                        iR = C0049e.g(ahVarK2, i4, bArr, iT, i2, bin2, bik);
                                        i34 = i5;
                                        i33 = i8;
                                        i25 = 2;
                                    } else {
                                        int i9112 = ((i13 | 23) << i31) - (i13 ^ 23);
                                        b = i9112 % 128;
                                        int i9113 = i9112 % 2;
                                        i7 = i7;
                                        i10 = 2;
                                    }
                                } else if (iV <= 49) {
                                    int i158 = i13 & 21;
                                    int i159 = (i158 - (~((i13 ^ 21) | i158))) - i31;
                                    b = i159 % 128;
                                    int i160 = i159 % 2;
                                    j = i12;
                                    i17 = ((i13 & 57) - (~(-(-(i13 | 57))))) - i31;
                                    b = i17 % 128;
                                    i10 = 2;
                                    if (i17 % 2 == 0) {
                                        i18 = iT;
                                        i15 = i5;
                                        iR = Y(t, bArr, iT, i2, i4, i8, i45, i5, j, iV, jL, bik);
                                        int i161 = 22 / 0;
                                    } else {
                                        i18 = iT;
                                        i15 = i5;
                                        iR = Y(t, bArr, i18, i2, i4, i8, i45, i15, j, iV, jL, bik);
                                    }
                                    if (iR != i18) {
                                        int i162 = a;
                                        int i163 = (i162 ^ 49) + ((i162 & 49) << 1);
                                        b = i163 % 128;
                                        int i164 = i163 % i10;
                                        i34 = i15;
                                    }
                                    i9 = iR;
                                    i11 = i15;
                                } else {
                                    iT = iT;
                                    i31 = i31;
                                    unsafe = unsafe;
                                    i7 = -1;
                                    i10 = 2;
                                    i15 = i5;
                                    if (iV == 50) {
                                        i16 = (((i13 ^ 53) | (i13 & 53)) << 1) - ((i13 & (-54)) | ((~i13) & 53));
                                        b = i16 % 128;
                                        if (i16 % 2 == 0) {
                                            if (i45 == 3) {
                                                V(t, bArr, iT, i2, i15, jL, bik);
                                                throw null;
                                            }
                                            i9 = iT;
                                        } else {
                                            if (i45 == 2) {
                                                V(t, bArr, iT, i2, i15, jL, bik);
                                                throw null;
                                            }
                                            i9 = iT;
                                        }
                                        i11 = i15;
                                    } else {
                                        iR = W(t, bArr, iT, i2, i4, i8, i45, i12, iV, jL, i15, bik);
                                        if (iR == iT) {
                                            i9 = iR;
                                            i11 = i15;
                                        } else {
                                            i34 = i15;
                                        }
                                    }
                                }
                                obj = t;
                                bArr2 = bArr;
                                i24 = i2;
                                bik2 = bik;
                                i25 = i10;
                                i33 = i8;
                                i31 = i31;
                                unsafe = unsafe;
                                adVar = this;
                            }
                            i15 = i5;
                            i9 = iT;
                            i11 = i15;
                        }
                        an anVarI = i(t);
                        int i165 = a;
                        int i166 = ((i165 & 95) - (~(i165 | 95))) - 1;
                        b = i166 % 128;
                        int i167 = i166 % i10;
                        iR = C0049e.r(i4, bArr, i9, i2, anVarI, bik);
                        i34 = i11;
                        obj = t;
                        bArr2 = bArr;
                        i24 = i2;
                        bik2 = bik;
                        i25 = i10;
                        i33 = i8;
                        i31 = i31;
                        unsafe = unsafe;
                        adVar = this;
                    }
                } else {
                    i21 = i34 / 3;
                    if (i44 >= adVar.h) {
                        i22 = i50 + 35;
                        b = i22 % 128;
                        if (i22 % i25 == 0) {
                            int i520 = 8 / 0;
                            if (i44 <= adVar.i) {
                                iAa = adVar.ak(i44, i21);
                            }
                        } else if (i44 <= adVar.i) {
                            iAa = adVar.ak(i44, i21);
                        }
                        if (i5 == i6) {
                            i7 = i6;
                            i8 = i44;
                            i9 = iT;
                            i31 = i31;
                            unsafe = unsafe;
                            i10 = i25;
                            i11 = 0;
                        } else {
                            int[] iArr2 = adVar.f;
                            int i521 = i5 & 1;
                            int i522 = ((i5 ^ 1) | i521) << i31;
                            int i523 = -((~i521) & (i5 | 1));
                            i12 = iArr2[((i522 | i523) << i31) - (i522 ^ i523)];
                            iV = v(i12);
                            jL = l(i12);
                            i13 = a;
                            i14 = (((i13 | 68) << 1) - (i13 ^ 68)) - 1;
                            int i524 = i14 % 128;
                            b = i524;
                            if (i14 % 2 == 0) {
                                i7 = -1;
                                i8 = i44;
                                if (iV == 27) {
                                    if (i45 == 2) {
                                        binG = (R.biN) unsafe.getObject(obj, jL);
                                        int i1410 = b;
                                        int i1411 = i1410 & 35;
                                        int i1412 = -(-((i1410 ^ 35) | i1411));
                                        int i1413 = (i1411 ^ i1412) + ((i1412 & i1411) << i31);
                                        a = i1413 % 128;
                                        int i1414 = i1413 % 2;
                                        if (!binG.o()) {
                                            int i1510 = a;
                                            int i1511 = (i1510 & 29) + (i1510 | 29);
                                            b = i1511 % 128;
                                            int i1512 = i1511 % 2;
                                            size = binG.size();
                                            if (size == 0) {
                                                i19 = 10;
                                            } else {
                                                i19 = size * 2;
                                            }
                                            binG = binG.g(i19);
                                            int i1513 = b;
                                            i20 = (((i1513 | 29) << i31) - (~(-((29 & (~i1513)) | (i1513 & (-30)))))) - i31;
                                            a = i20 % 128;
                                            if (i20 % 2 != 0) {
                                                unsafe.putObject(obj, jL, binG);
                                                throw null;
                                            }
                                            unsafe.putObject(obj, jL, binG);
                                        }
                                        R.biN bin3 = binG;
                                        ah ahVarK3 = adVar.K(i5);
                                        int i1514 = b;
                                        int i1515 = i1514 & 27;
                                        int i1516 = ((27 | i1514) & (~i1515)) + (i1515 << 1);
                                        a = i1516 % 128;
                                        int i1517 = i1516 % 2;
                                        iR = C0049e.g(ahVarK3, i4, bArr, iT, i2, bin3, bik);
                                        i34 = i5;
                                        i33 = i8;
                                        i25 = 2;
                                    } else {
                                        int i9114 = ((i13 | 23) << i31) - (i13 ^ 23);
                                        b = i9114 % 128;
                                        int i9115 = i9114 % 2;
                                        i7 = i7;
                                        i10 = 2;
                                        i15 = i5;
                                        i9 = iT;
                                        i11 = i15;
                                    }
                                } else if (iV <= 49) {
                                    int i1518 = i13 & 21;
                                    int i1519 = (i1518 - (~((i13 ^ 21) | i1518))) - i31;
                                    b = i1519 % 128;
                                    int i168 = i1519 % 2;
                                    j = i12;
                                    i17 = ((i13 & 57) - (~(-(-(i13 | 57))))) - i31;
                                    b = i17 % 128;
                                    i10 = 2;
                                    if (i17 % 2 == 0) {
                                        i18 = iT;
                                        i15 = i5;
                                        iR = Y(t, bArr, iT, i2, i4, i8, i45, i5, j, iV, jL, bik);
                                        int i169 = 22 / 0;
                                    } else {
                                        i18 = iT;
                                        i15 = i5;
                                        iR = Y(t, bArr, i18, i2, i4, i8, i45, i15, j, iV, jL, bik);
                                    }
                                    if (iR != i18) {
                                        int i1610 = a;
                                        int i1611 = (i1610 ^ 49) + ((i1610 & 49) << 1);
                                        b = i1611 % 128;
                                        int i1612 = i1611 % i10;
                                        i34 = i15;
                                    }
                                    i9 = iR;
                                    i11 = i15;
                                } else {
                                    iT = iT;
                                    i31 = i31;
                                    unsafe = unsafe;
                                    i7 = -1;
                                    i10 = 2;
                                    i15 = i5;
                                    if (iV == 50) {
                                        i16 = (((i13 ^ 53) | (i13 & 53)) << 1) - ((i13 & (-54)) | ((~i13) & 53));
                                        b = i16 % 128;
                                        if (i16 % 2 == 0) {
                                            if (i45 == 3) {
                                                V(t, bArr, iT, i2, i15, jL, bik);
                                                throw null;
                                            }
                                            i9 = iT;
                                        } else {
                                            if (i45 == 2) {
                                                V(t, bArr, iT, i2, i15, jL, bik);
                                                throw null;
                                            }
                                            i9 = iT;
                                        }
                                        i11 = i15;
                                    } else {
                                        iR = W(t, bArr, iT, i2, i4, i8, i45, i12, iV, jL, i15, bik);
                                        if (iR == iT) {
                                            i9 = iR;
                                            i11 = i15;
                                        } else {
                                            i34 = i15;
                                        }
                                    }
                                }
                                obj = t;
                                bArr2 = bArr;
                                i24 = i2;
                                bik2 = bik;
                                i25 = i10;
                                i33 = i8;
                                i31 = i31;
                                unsafe = unsafe;
                                adVar = this;
                            } else {
                                i7 = -1;
                                i8 = i44;
                                if (iV == 27) {
                                    if (i45 == 2) {
                                        binG = (R.biN) unsafe.getObject(obj, jL);
                                        int i1415 = b;
                                        int i1416 = i1415 & 35;
                                        int i1417 = -(-((i1415 ^ 35) | i1416));
                                        int i1418 = (i1416 ^ i1417) + ((i1417 & i1416) << i31);
                                        a = i1418 % 128;
                                        int i1419 = i1418 % 2;
                                        if (!binG.o()) {
                                            int i15110 = a;
                                            int i15111 = (i15110 & 29) + (i15110 | 29);
                                            b = i15111 % 128;
                                            int i15112 = i15111 % 2;
                                            size = binG.size();
                                            if (size == 0) {
                                                i19 = 10;
                                            } else {
                                                i19 = size * 2;
                                            }
                                            binG = binG.g(i19);
                                            int i15113 = b;
                                            i20 = (((i15113 | 29) << i31) - (~(-((29 & (~i15113)) | (i15113 & (-30)))))) - i31;
                                            a = i20 % 128;
                                            if (i20 % 2 != 0) {
                                                unsafe.putObject(obj, jL, binG);
                                                throw null;
                                            }
                                            unsafe.putObject(obj, jL, binG);
                                        }
                                        R.biN bin4 = binG;
                                        ah ahVarK4 = adVar.K(i5);
                                        int i15114 = b;
                                        int i15115 = i15114 & 27;
                                        int i15116 = ((27 | i15114) & (~i15115)) + (i15115 << 1);
                                        a = i15116 % 128;
                                        int i15117 = i15116 % 2;
                                        iR = C0049e.g(ahVarK4, i4, bArr, iT, i2, bin4, bik);
                                        i34 = i5;
                                        i33 = i8;
                                        i25 = 2;
                                    } else {
                                        int i9116 = ((i13 | 23) << i31) - (i13 ^ 23);
                                        b = i9116 % 128;
                                        int i9117 = i9116 % 2;
                                        i7 = i7;
                                        i10 = 2;
                                        i15 = i5;
                                        i9 = iT;
                                        i11 = i15;
                                    }
                                } else if (iV <= 49) {
                                    int i15118 = i13 & 21;
                                    int i15119 = (i15118 - (~((i13 ^ 21) | i15118))) - i31;
                                    b = i15119 % 128;
                                    int i1613 = i15119 % 2;
                                    j = i12;
                                    i17 = ((i13 & 57) - (~(-(-(i13 | 57))))) - i31;
                                    b = i17 % 128;
                                    i10 = 2;
                                    if (i17 % 2 == 0) {
                                        i18 = iT;
                                        i15 = i5;
                                        iR = Y(t, bArr, iT, i2, i4, i8, i45, i5, j, iV, jL, bik);
                                        int i1614 = 22 / 0;
                                    } else {
                                        i18 = iT;
                                        i15 = i5;
                                        iR = Y(t, bArr, i18, i2, i4, i8, i45, i15, j, iV, jL, bik);
                                    }
                                    if (iR != i18) {
                                        int i1615 = a;
                                        int i1616 = (i1615 ^ 49) + ((i1615 & 49) << 1);
                                        b = i1616 % 128;
                                        int i1617 = i1616 % i10;
                                        i34 = i15;
                                    }
                                    i9 = iR;
                                    i11 = i15;
                                } else {
                                    iT = iT;
                                    i31 = i31;
                                    unsafe = unsafe;
                                    i7 = -1;
                                    i10 = 2;
                                    i15 = i5;
                                    if (iV == 50) {
                                        i16 = (((i13 ^ 53) | (i13 & 53)) << 1) - ((i13 & (-54)) | ((~i13) & 53));
                                        b = i16 % 128;
                                        if (i16 % 2 == 0) {
                                            if (i45 == 3) {
                                                V(t, bArr, iT, i2, i15, jL, bik);
                                                throw null;
                                            }
                                            i9 = iT;
                                        } else {
                                            if (i45 == 2) {
                                                V(t, bArr, iT, i2, i15, jL, bik);
                                                throw null;
                                            }
                                            i9 = iT;
                                        }
                                        i11 = i15;
                                    } else {
                                        iR = W(t, bArr, iT, i2, i4, i8, i45, i12, iV, jL, i15, bik);
                                        if (iR == iT) {
                                            i9 = iR;
                                            i11 = i15;
                                        } else {
                                            i34 = i15;
                                        }
                                    }
                                }
                                obj = t;
                                bArr2 = bArr;
                                i24 = i2;
                                bik2 = bik;
                                i25 = i10;
                                i33 = i8;
                                i31 = i31;
                                unsafe = unsafe;
                                adVar = this;
                            }
                        }
                        an anVarI2 = i(t);
                        int i1618 = a;
                        int i1619 = ((i1618 & 95) - (~(i1618 | 95))) - 1;
                        b = i1619 % 128;
                        int i1620 = i1619 % i10;
                        iR = C0049e.r(i4, bArr, i9, i2, anVarI2, bik);
                        i34 = i11;
                        obj = t;
                        bArr2 = bArr;
                        i24 = i2;
                        bik2 = bik;
                        i25 = i10;
                        i33 = i8;
                        i31 = i31;
                        unsafe = unsafe;
                        adVar = this;
                    }
                }
                i6 = -1;
                i5 = -1;
                if (i5 == i6) {
                    i7 = i6;
                    i8 = i44;
                    i9 = iT;
                    i31 = i31;
                    unsafe = unsafe;
                    i10 = i25;
                    i11 = 0;
                } else {
                    int[] iArr3 = adVar.f;
                    int i525 = i5 & 1;
                    int i526 = ((i5 ^ 1) | i525) << i31;
                    int i527 = -((~i525) & (i5 | 1));
                    i12 = iArr3[((i526 | i527) << i31) - (i526 ^ i527)];
                    iV = v(i12);
                    jL = l(i12);
                    i13 = a;
                    i14 = (((i13 | 68) << 1) - (i13 ^ 68)) - 1;
                    int i528 = i14 % 128;
                    b = i528;
                    if (i14 % 2 == 0) {
                        i7 = -1;
                        i8 = i44;
                        if (iV == 27) {
                            if (i45 == 2) {
                                binG = (R.biN) unsafe.getObject(obj, jL);
                                int i14110 = b;
                                int i14111 = i14110 & 35;
                                int i14112 = -(-((i14110 ^ 35) | i14111));
                                int i14113 = (i14111 ^ i14112) + ((i14112 & i14111) << i31);
                                a = i14113 % 128;
                                int i14114 = i14113 % 2;
                                if (!binG.o()) {
                                    int i151110 = a;
                                    int i151111 = (i151110 & 29) + (i151110 | 29);
                                    b = i151111 % 128;
                                    int i151112 = i151111 % 2;
                                    size = binG.size();
                                    if (size == 0) {
                                        i19 = 10;
                                    } else {
                                        i19 = size * 2;
                                    }
                                    binG = binG.g(i19);
                                    int i151113 = b;
                                    i20 = (((i151113 | 29) << i31) - (~(-((29 & (~i151113)) | (i151113 & (-30)))))) - i31;
                                    a = i20 % 128;
                                    if (i20 % 2 != 0) {
                                        unsafe.putObject(obj, jL, binG);
                                        throw null;
                                    }
                                    unsafe.putObject(obj, jL, binG);
                                }
                                R.biN bin5 = binG;
                                ah ahVarK5 = adVar.K(i5);
                                int i151114 = b;
                                int i151115 = i151114 & 27;
                                int i151116 = ((27 | i151114) & (~i151115)) + (i151115 << 1);
                                a = i151116 % 128;
                                int i151117 = i151116 % 2;
                                iR = C0049e.g(ahVarK5, i4, bArr, iT, i2, bin5, bik);
                                i34 = i5;
                                i33 = i8;
                                i25 = 2;
                            } else {
                                int i9118 = ((i13 | 23) << i31) - (i13 ^ 23);
                                b = i9118 % 128;
                                int i9119 = i9118 % 2;
                                i7 = i7;
                                i10 = 2;
                                i15 = i5;
                                i9 = iT;
                                i11 = i15;
                            }
                        } else if (iV <= 49) {
                            int i151118 = i13 & 21;
                            int i151119 = (i151118 - (~((i13 ^ 21) | i151118))) - i31;
                            b = i151119 % 128;
                            int i16110 = i151119 % 2;
                            j = i12;
                            i17 = ((i13 & 57) - (~(-(-(i13 | 57))))) - i31;
                            b = i17 % 128;
                            i10 = 2;
                            if (i17 % 2 == 0) {
                                i18 = iT;
                                i15 = i5;
                                iR = Y(t, bArr, iT, i2, i4, i8, i45, i5, j, iV, jL, bik);
                                int i16111 = 22 / 0;
                            } else {
                                i18 = iT;
                                i15 = i5;
                                iR = Y(t, bArr, i18, i2, i4, i8, i45, i15, j, iV, jL, bik);
                            }
                            if (iR != i18) {
                                int i16112 = a;
                                int i16113 = (i16112 ^ 49) + ((i16112 & 49) << 1);
                                b = i16113 % 128;
                                int i16114 = i16113 % i10;
                                i34 = i15;
                            }
                            i9 = iR;
                            i11 = i15;
                        } else {
                            iT = iT;
                            i31 = i31;
                            unsafe = unsafe;
                            i7 = -1;
                            i10 = 2;
                            i15 = i5;
                            if (iV == 50) {
                                i16 = (((i13 ^ 53) | (i13 & 53)) << 1) - ((i13 & (-54)) | ((~i13) & 53));
                                b = i16 % 128;
                                if (i16 % 2 == 0) {
                                    if (i45 == 3) {
                                        V(t, bArr, iT, i2, i15, jL, bik);
                                        throw null;
                                    }
                                    i9 = iT;
                                } else {
                                    if (i45 == 2) {
                                        V(t, bArr, iT, i2, i15, jL, bik);
                                        throw null;
                                    }
                                    i9 = iT;
                                }
                                i11 = i15;
                            } else {
                                iR = W(t, bArr, iT, i2, i4, i8, i45, i12, iV, jL, i15, bik);
                                if (iR == iT) {
                                    i9 = iR;
                                    i11 = i15;
                                } else {
                                    i34 = i15;
                                }
                            }
                        }
                        obj = t;
                        bArr2 = bArr;
                        i24 = i2;
                        bik2 = bik;
                        i25 = i10;
                        i33 = i8;
                        i31 = i31;
                        unsafe = unsafe;
                        adVar = this;
                    } else {
                        i7 = -1;
                        i8 = i44;
                        if (iV == 27) {
                            if (i45 == 2) {
                                binG = (R.biN) unsafe.getObject(obj, jL);
                                int i14115 = b;
                                int i14116 = i14115 & 35;
                                int i14117 = -(-((i14115 ^ 35) | i14116));
                                int i14118 = (i14116 ^ i14117) + ((i14117 & i14116) << i31);
                                a = i14118 % 128;
                                int i14119 = i14118 % 2;
                                if (!binG.o()) {
                                    int i1511110 = a;
                                    int i1511111 = (i1511110 & 29) + (i1511110 | 29);
                                    b = i1511111 % 128;
                                    int i1511112 = i1511111 % 2;
                                    size = binG.size();
                                    if (size == 0) {
                                        i19 = 10;
                                    } else {
                                        i19 = size * 2;
                                    }
                                    binG = binG.g(i19);
                                    int i1511113 = b;
                                    i20 = (((i1511113 | 29) << i31) - (~(-((29 & (~i1511113)) | (i1511113 & (-30)))))) - i31;
                                    a = i20 % 128;
                                    if (i20 % 2 != 0) {
                                        unsafe.putObject(obj, jL, binG);
                                        throw null;
                                    }
                                    unsafe.putObject(obj, jL, binG);
                                }
                                R.biN bin6 = binG;
                                ah ahVarK6 = adVar.K(i5);
                                int i1511114 = b;
                                int i1511115 = i1511114 & 27;
                                int i1511116 = ((27 | i1511114) & (~i1511115)) + (i1511115 << 1);
                                a = i1511116 % 128;
                                int i1511117 = i1511116 % 2;
                                iR = C0049e.g(ahVarK6, i4, bArr, iT, i2, bin6, bik);
                                i34 = i5;
                                i33 = i8;
                                i25 = 2;
                            } else {
                                int i91110 = ((i13 | 23) << i31) - (i13 ^ 23);
                                b = i91110 % 128;
                                int i91111 = i91110 % 2;
                                i7 = i7;
                                i10 = 2;
                                i15 = i5;
                                i9 = iT;
                                i11 = i15;
                            }
                        } else if (iV <= 49) {
                            int i1511118 = i13 & 21;
                            int i1511119 = (i1511118 - (~((i13 ^ 21) | i1511118))) - i31;
                            b = i1511119 % 128;
                            int i16115 = i1511119 % 2;
                            j = i12;
                            i17 = ((i13 & 57) - (~(-(-(i13 | 57))))) - i31;
                            b = i17 % 128;
                            i10 = 2;
                            if (i17 % 2 == 0) {
                                i18 = iT;
                                i15 = i5;
                                iR = Y(t, bArr, iT, i2, i4, i8, i45, i5, j, iV, jL, bik);
                                int i16116 = 22 / 0;
                            } else {
                                i18 = iT;
                                i15 = i5;
                                iR = Y(t, bArr, i18, i2, i4, i8, i45, i15, j, iV, jL, bik);
                            }
                            if (iR != i18) {
                                int i16117 = a;
                                int i16118 = (i16117 ^ 49) + ((i16117 & 49) << 1);
                                b = i16118 % 128;
                                int i16119 = i16118 % i10;
                                i34 = i15;
                            }
                            i9 = iR;
                            i11 = i15;
                        } else {
                            iT = iT;
                            i31 = i31;
                            unsafe = unsafe;
                            i7 = -1;
                            i10 = 2;
                            i15 = i5;
                            if (iV == 50) {
                                i16 = (((i13 ^ 53) | (i13 & 53)) << 1) - ((i13 & (-54)) | ((~i13) & 53));
                                b = i16 % 128;
                                if (i16 % 2 == 0) {
                                    if (i45 == 3) {
                                        V(t, bArr, iT, i2, i15, jL, bik);
                                        throw null;
                                    }
                                    i9 = iT;
                                } else {
                                    if (i45 == 2) {
                                        V(t, bArr, iT, i2, i15, jL, bik);
                                        throw null;
                                    }
                                    i9 = iT;
                                }
                                i11 = i15;
                            } else {
                                iR = W(t, bArr, iT, i2, i4, i8, i45, i12, iV, jL, i15, bik);
                                if (iR == iT) {
                                    i9 = iR;
                                    i11 = i15;
                                } else {
                                    i34 = i15;
                                }
                            }
                        }
                        obj = t;
                        bArr2 = bArr;
                        i24 = i2;
                        bik2 = bik;
                        i25 = i10;
                        i33 = i8;
                        i31 = i31;
                        unsafe = unsafe;
                        adVar = this;
                    }
                }
                an anVarI3 = i(t);
                int i16120 = a;
                int i16121 = ((i16120 & 95) - (~(i16120 | 95))) - 1;
                b = i16121 % 128;
                int i1621 = i16121 % i10;
                iR = C0049e.r(i4, bArr, i9, i2, anVarI3, bik);
                i34 = i11;
                obj = t;
                bArr2 = bArr;
                i24 = i2;
                bik2 = bik;
                i25 = i10;
                i33 = i8;
                i31 = i31;
                unsafe = unsafe;
                adVar = this;
            } else {
                iAa = adVar.aa(i44);
                int i170 = a;
                int i171 = ((i170 ^ 92) + ((i170 & 92) << i31)) - i31;
                b = i171 % 128;
                int i172 = i171 % i25;
            }
            i5 = iAa;
            i6 = -1;
            if (i5 == i6) {
                i7 = i6;
                i8 = i44;
                i9 = iT;
                i31 = i31;
                unsafe = unsafe;
                i10 = i25;
                i11 = 0;
            } else {
                int[] iArr4 = adVar.f;
                int i529 = i5 & 1;
                int i5210 = ((i5 ^ 1) | i529) << i31;
                int i5211 = -((~i529) & (i5 | 1));
                i12 = iArr4[((i5210 | i5211) << i31) - (i5210 ^ i5211)];
                iV = v(i12);
                jL = l(i12);
                i13 = a;
                i14 = (((i13 | 68) << 1) - (i13 ^ 68)) - 1;
                int i5212 = i14 % 128;
                b = i5212;
                if (i14 % 2 == 0) {
                    i7 = -1;
                    i8 = i44;
                    if (iV == 27) {
                        if (i45 == 2) {
                            binG = (R.biN) unsafe.getObject(obj, jL);
                            int i141110 = b;
                            int i141111 = i141110 & 35;
                            int i141112 = -(-((i141110 ^ 35) | i141111));
                            int i141113 = (i141111 ^ i141112) + ((i141112 & i141111) << i31);
                            a = i141113 % 128;
                            int i141114 = i141113 % 2;
                            if (!binG.o()) {
                                int i15111110 = a;
                                int i15111111 = (i15111110 & 29) + (i15111110 | 29);
                                b = i15111111 % 128;
                                int i15111112 = i15111111 % 2;
                                size = binG.size();
                                if (size == 0) {
                                    i19 = 10;
                                } else {
                                    i19 = size * 2;
                                }
                                binG = binG.g(i19);
                                int i15111113 = b;
                                i20 = (((i15111113 | 29) << i31) - (~(-((29 & (~i15111113)) | (i15111113 & (-30)))))) - i31;
                                a = i20 % 128;
                                if (i20 % 2 != 0) {
                                    unsafe.putObject(obj, jL, binG);
                                    throw null;
                                }
                                unsafe.putObject(obj, jL, binG);
                            }
                            R.biN bin7 = binG;
                            ah ahVarK7 = adVar.K(i5);
                            int i15111114 = b;
                            int i15111115 = i15111114 & 27;
                            int i15111116 = ((27 | i15111114) & (~i15111115)) + (i15111115 << 1);
                            a = i15111116 % 128;
                            int i15111117 = i15111116 % 2;
                            iR = C0049e.g(ahVarK7, i4, bArr, iT, i2, bin7, bik);
                            i34 = i5;
                            i33 = i8;
                            i25 = 2;
                        } else {
                            int i91112 = ((i13 | 23) << i31) - (i13 ^ 23);
                            b = i91112 % 128;
                            int i91113 = i91112 % 2;
                            i7 = i7;
                            i10 = 2;
                            i15 = i5;
                            i9 = iT;
                            i11 = i15;
                        }
                    } else if (iV <= 49) {
                        int i15111118 = i13 & 21;
                        int i15111119 = (i15111118 - (~((i13 ^ 21) | i15111118))) - i31;
                        b = i15111119 % 128;
                        int i161110 = i15111119 % 2;
                        j = i12;
                        i17 = ((i13 & 57) - (~(-(-(i13 | 57))))) - i31;
                        b = i17 % 128;
                        i10 = 2;
                        if (i17 % 2 == 0) {
                            i18 = iT;
                            i15 = i5;
                            iR = Y(t, bArr, iT, i2, i4, i8, i45, i5, j, iV, jL, bik);
                            int i161111 = 22 / 0;
                        } else {
                            i18 = iT;
                            i15 = i5;
                            iR = Y(t, bArr, i18, i2, i4, i8, i45, i15, j, iV, jL, bik);
                        }
                        if (iR != i18) {
                            int i161112 = a;
                            int i161113 = (i161112 ^ 49) + ((i161112 & 49) << 1);
                            b = i161113 % 128;
                            int i161114 = i161113 % i10;
                            i34 = i15;
                        }
                        i9 = iR;
                        i11 = i15;
                    } else {
                        iT = iT;
                        i31 = i31;
                        unsafe = unsafe;
                        i7 = -1;
                        i10 = 2;
                        i15 = i5;
                        if (iV == 50) {
                            i16 = (((i13 ^ 53) | (i13 & 53)) << 1) - ((i13 & (-54)) | ((~i13) & 53));
                            b = i16 % 128;
                            if (i16 % 2 == 0) {
                                if (i45 == 3) {
                                    V(t, bArr, iT, i2, i15, jL, bik);
                                    throw null;
                                }
                                i9 = iT;
                            } else {
                                if (i45 == 2) {
                                    V(t, bArr, iT, i2, i15, jL, bik);
                                    throw null;
                                }
                                i9 = iT;
                            }
                            i11 = i15;
                        } else {
                            iR = W(t, bArr, iT, i2, i4, i8, i45, i12, iV, jL, i15, bik);
                            if (iR == iT) {
                                i9 = iR;
                                i11 = i15;
                            } else {
                                i34 = i15;
                            }
                        }
                    }
                    obj = t;
                    bArr2 = bArr;
                    i24 = i2;
                    bik2 = bik;
                    i25 = i10;
                    i33 = i8;
                    i31 = i31;
                    unsafe = unsafe;
                    adVar = this;
                } else {
                    i7 = -1;
                    i8 = i44;
                    if (iV == 27) {
                        if (i45 == 2) {
                            binG = (R.biN) unsafe.getObject(obj, jL);
                            int i141115 = b;
                            int i141116 = i141115 & 35;
                            int i141117 = -(-((i141115 ^ 35) | i141116));
                            int i141118 = (i141116 ^ i141117) + ((i141117 & i141116) << i31);
                            a = i141118 % 128;
                            int i141119 = i141118 % 2;
                            if (!binG.o()) {
                                int i151111110 = a;
                                int i151111111 = (i151111110 & 29) + (i151111110 | 29);
                                b = i151111111 % 128;
                                int i151111112 = i151111111 % 2;
                                size = binG.size();
                                if (size == 0) {
                                    i19 = 10;
                                } else {
                                    i19 = size * 2;
                                }
                                binG = binG.g(i19);
                                int i151111113 = b;
                                i20 = (((i151111113 | 29) << i31) - (~(-((29 & (~i151111113)) | (i151111113 & (-30)))))) - i31;
                                a = i20 % 128;
                                if (i20 % 2 != 0) {
                                    unsafe.putObject(obj, jL, binG);
                                    throw null;
                                }
                                unsafe.putObject(obj, jL, binG);
                            }
                            R.biN bin8 = binG;
                            ah ahVarK8 = adVar.K(i5);
                            int i151111114 = b;
                            int i151111115 = i151111114 & 27;
                            int i151111116 = ((27 | i151111114) & (~i151111115)) + (i151111115 << 1);
                            a = i151111116 % 128;
                            int i151111117 = i151111116 % 2;
                            iR = C0049e.g(ahVarK8, i4, bArr, iT, i2, bin8, bik);
                            i34 = i5;
                            i33 = i8;
                            i25 = 2;
                        } else {
                            int i91114 = ((i13 | 23) << i31) - (i13 ^ 23);
                            b = i91114 % 128;
                            int i91115 = i91114 % 2;
                            i7 = i7;
                            i10 = 2;
                            i15 = i5;
                            i9 = iT;
                            i11 = i15;
                        }
                    } else if (iV <= 49) {
                        int i151111118 = i13 & 21;
                        int i151111119 = (i151111118 - (~((i13 ^ 21) | i151111118))) - i31;
                        b = i151111119 % 128;
                        int i161115 = i151111119 % 2;
                        j = i12;
                        i17 = ((i13 & 57) - (~(-(-(i13 | 57))))) - i31;
                        b = i17 % 128;
                        i10 = 2;
                        if (i17 % 2 == 0) {
                            i18 = iT;
                            i15 = i5;
                            iR = Y(t, bArr, iT, i2, i4, i8, i45, i5, j, iV, jL, bik);
                            int i161116 = 22 / 0;
                        } else {
                            i18 = iT;
                            i15 = i5;
                            iR = Y(t, bArr, i18, i2, i4, i8, i45, i15, j, iV, jL, bik);
                        }
                        if (iR != i18) {
                            int i161117 = a;
                            int i161118 = (i161117 ^ 49) + ((i161117 & 49) << 1);
                            b = i161118 % 128;
                            int i161119 = i161118 % i10;
                            i34 = i15;
                        }
                        i9 = iR;
                        i11 = i15;
                    } else {
                        iT = iT;
                        i31 = i31;
                        unsafe = unsafe;
                        i7 = -1;
                        i10 = 2;
                        i15 = i5;
                        if (iV == 50) {
                            i16 = (((i13 ^ 53) | (i13 & 53)) << 1) - ((i13 & (-54)) | ((~i13) & 53));
                            b = i16 % 128;
                            if (i16 % 2 == 0) {
                                if (i45 == 3) {
                                    V(t, bArr, iT, i2, i15, jL, bik);
                                    throw null;
                                }
                                i9 = iT;
                            } else {
                                if (i45 == 2) {
                                    V(t, bArr, iT, i2, i15, jL, bik);
                                    throw null;
                                }
                                i9 = iT;
                            }
                            i11 = i15;
                        } else {
                            iR = W(t, bArr, iT, i2, i4, i8, i45, i12, iV, jL, i15, bik);
                            if (iR == iT) {
                                i9 = iR;
                                i11 = i15;
                            } else {
                                i34 = i15;
                            }
                        }
                    }
                    obj = t;
                    bArr2 = bArr;
                    i24 = i2;
                    bik2 = bik;
                    i25 = i10;
                    i33 = i8;
                    i31 = i31;
                    unsafe = unsafe;
                    adVar = this;
                }
            }
            an anVarI4 = i(t);
            int i16122 = a;
            int i16123 = ((i16122 & 95) - (~(i16122 | 95))) - 1;
            b = i16123 % 128;
            int i1622 = i16123 % i10;
            iR = C0049e.r(i4, bArr, i9, i2, anVarI4, bik);
            i34 = i11;
            obj = t;
            bArr2 = bArr;
            i24 = i2;
            bik2 = bik;
            i25 = i10;
            i33 = i8;
            i31 = i31;
            unsafe = unsafe;
            adVar = this;
        }
        int i173 = i25;
        if (iR != i24) {
            throw C0065v.j();
        }
        int i174 = b + 87;
        a = i174 % 128;
        int i175 = i174 % i173;
        return iR;
    }

    public final int o(T t) {
        int length;
        int i;
        int i2;
        int i3;
        int iC;
        int i4;
        int i5;
        long jDoubleToLongBits;
        Object objO;
        int i6 = 2 % 2;
        int i7 = b;
        int i8 = i7 & 43;
        int i9 = (i7 ^ 43) | i8;
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            length = this.f.length;
            i = 0;
            i2 = 1;
        } else {
            length = this.f.length;
            i = 0;
            i2 = 0;
        }
        while (i < length) {
            int i11 = a;
            int i12 = ((i11 ^ 35) | (i11 & 35)) << 1;
            int i13 = -(((~i11) & 35) | (i11 & (-36)));
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            b = i14 % 128;
            int i15 = i14 % 2;
            int iAg = ag(i);
            int i16 = this.f[i];
            int i17 = b;
            int i18 = i17 & 103;
            int i19 = ((i17 ^ 103) | i18) << 1;
            int i20 = -((i17 | 103) & (~i18));
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            a = i21 % 128;
            int i22 = i21 % 2;
            long jL = l(iAg);
            int iHashCode = 37;
            Object obj = null;
            switch (v(iAg)) {
                case 0:
                    i3 = i2 * 53;
                    iC = R.c(Double.doubleToLongBits(ar.l(t, jL)));
                    int i23 = iC & i3;
                    int i24 = -(-(iC | i3));
                    i4 = i23 & i24;
                    i5 = i24 | i23;
                    i2 = i5 + i4;
                    int i25 = i & (-82);
                    int i26 = (i | (-82)) & (~i25);
                    int i27 = i25 << 1;
                    int i28 = (i26 & i27) + (i26 | i27);
                    int i29 = i28 ^ 85;
                    int i30 = ((i28 & 85) | i29) << 1;
                    int i31 = -i29;
                    i = ((i31 & i30) << 1) + (i30 ^ i31);
                    break;
                case 1:
                    i3 = i2 * 53;
                    float fM = ar.m(t, jL);
                    int i32 = a;
                    int i33 = i32 & 41;
                    int i34 = (i32 ^ 41) | i33;
                    int i35 = (i33 & i34) + (i34 | i33);
                    b = i35 % 128;
                    int i36 = i35 % 2;
                    iC = Float.floatToIntBits(fM);
                    int i210 = iC & i3;
                    int i211 = -(-(iC | i3));
                    i4 = i210 & i211;
                    i5 = i211 | i210;
                    i2 = i5 + i4;
                    int i212 = i & (-82);
                    int i213 = (i | (-82)) & (~i212);
                    int i214 = i212 << 1;
                    int i215 = (i213 & i214) + (i213 | i214);
                    int i216 = i215 ^ 85;
                    int i37 = ((i215 & 85) | i216) << 1;
                    int i38 = -i216;
                    i = ((i38 & i37) << 1) + (i37 ^ i38);
                    break;
                case 2:
                    i3 = i2 * 53;
                    iC = R.c(ar.p(t, jL));
                    int i39 = a;
                    int i40 = ((i39 & (-72)) | ((~i39) & 71)) + ((i39 & 71) << 1);
                    b = i40 % 128;
                    int i41 = i40 % 2;
                    int i217 = iC & i3;
                    int i218 = -(-(iC | i3));
                    i4 = i217 & i218;
                    i5 = i218 | i217;
                    i2 = i5 + i4;
                    int i219 = i & (-82);
                    int i2110 = (i | (-82)) & (~i219);
                    int i2111 = i219 << 1;
                    int i2112 = (i2110 & i2111) + (i2110 | i2111);
                    int i2113 = i2112 ^ 85;
                    int i310 = ((i2112 & 85) | i2113) << 1;
                    int i311 = -i2113;
                    i = ((i311 & i310) << 1) + (i310 ^ i311);
                    break;
                case 3:
                    i3 = i2 * 53;
                    iC = R.c(ar.p(t, jL));
                    int i42 = a;
                    int i43 = (i42 ^ 105) + ((i42 & 105) << 1);
                    b = i43 % 128;
                    int i44 = i43 % 2;
                    int i2114 = iC & i3;
                    int i2115 = -(-(iC | i3));
                    i4 = i2114 & i2115;
                    i5 = i2115 | i2114;
                    i2 = i5 + i4;
                    int i2116 = i & (-82);
                    int i2117 = (i | (-82)) & (~i2116);
                    int i2118 = i2116 << 1;
                    int i2119 = (i2117 & i2118) + (i2117 | i2118);
                    int i21110 = i2119 ^ 85;
                    int i312 = ((i2119 & 85) | i21110) << 1;
                    int i313 = -i21110;
                    i = ((i313 & i312) << 1) + (i312 ^ i313);
                    break;
                case 4:
                    i3 = i2 * 53;
                    iC = ar.n(t, jL);
                    int i21111 = iC & i3;
                    int i21112 = -(-(iC | i3));
                    i4 = i21111 & i21112;
                    i5 = i21112 | i21111;
                    i2 = i5 + i4;
                    int i21113 = i & (-82);
                    int i21114 = (i | (-82)) & (~i21113);
                    int i21115 = i21113 << 1;
                    int i21116 = (i21114 & i21115) + (i21114 | i21115);
                    int i21117 = i21116 ^ 85;
                    int i314 = ((i21116 & 85) | i21117) << 1;
                    int i315 = -i21117;
                    i = ((i315 & i314) << 1) + (i314 ^ i315);
                    break;
                case 5:
                    i3 = i2 * 53;
                    iC = R.c(ar.p(t, jL));
                    int i45 = a + 95;
                    b = i45 % 128;
                    int i46 = i45 % 2;
                    int i21118 = iC & i3;
                    int i21119 = -(-(iC | i3));
                    i4 = i21118 & i21119;
                    i5 = i21119 | i21118;
                    i2 = i5 + i4;
                    int i211110 = i & (-82);
                    int i211111 = (i | (-82)) & (~i211110);
                    int i211112 = i211110 << 1;
                    int i211113 = (i211111 & i211112) + (i211111 | i211112);
                    int i211114 = i211113 ^ 85;
                    int i316 = ((i211113 & 85) | i211114) << 1;
                    int i317 = -i211114;
                    i = ((i317 & i316) << 1) + (i316 ^ i317);
                    break;
                case 6:
                    i3 = i2 * 53;
                    iC = ar.n(t, jL);
                    int i211115 = iC & i3;
                    int i211116 = -(-(iC | i3));
                    i4 = i211115 & i211116;
                    i5 = i211116 | i211115;
                    i2 = i5 + i4;
                    int i211117 = i & (-82);
                    int i211118 = (i | (-82)) & (~i211117);
                    int i211119 = i211117 << 1;
                    int i2111110 = (i211118 & i211119) + (i211118 | i211119);
                    int i2111111 = i2111110 ^ 85;
                    int i318 = ((i2111110 & 85) | i2111111) << 1;
                    int i319 = -i2111111;
                    i = ((i319 & i318) << 1) + (i318 ^ i319);
                    break;
                case 7:
                    i3 = i2 * 53;
                    iC = R.b(ar.h(t, jL));
                    int i47 = a;
                    int i48 = i47 & 109;
                    int i49 = (i47 ^ 109) | i48;
                    int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
                    b = i50 % 128;
                    int i51 = i50 % 2;
                    int i2111112 = iC & i3;
                    int i2111113 = -(-(iC | i3));
                    i4 = i2111112 & i2111113;
                    i5 = i2111113 | i2111112;
                    i2 = i5 + i4;
                    int i2111114 = i & (-82);
                    int i2111115 = (i | (-82)) & (~i2111114);
                    int i2111116 = i2111114 << 1;
                    int i2111117 = (i2111115 & i2111116) + (i2111115 | i2111116);
                    int i2111118 = i2111117 ^ 85;
                    int i3110 = ((i2111117 & 85) | i2111118) << 1;
                    int i3111 = -i2111118;
                    i = ((i3111 & i3110) << 1) + (i3110 ^ i3111);
                    break;
                case 8:
                    i3 = i2 * 53;
                    String str = (String) ar.o(t, jL);
                    int i52 = b + 99;
                    a = i52 % 128;
                    int i53 = i52 % 2;
                    iC = str.hashCode();
                    int i54 = b;
                    int i55 = ((i54 | 49) << 1) - (i54 ^ 49);
                    a = i55 % 128;
                    int i56 = i55 % 2;
                    int i2111119 = iC & i3;
                    int i21111110 = -(-(iC | i3));
                    i4 = i2111119 & i21111110;
                    i5 = i21111110 | i2111119;
                    i2 = i5 + i4;
                    int i21111111 = i & (-82);
                    int i21111112 = (i | (-82)) & (~i21111111);
                    int i21111113 = i21111111 << 1;
                    int i21111114 = (i21111112 & i21111113) + (i21111112 | i21111113);
                    int i21111115 = i21111114 ^ 85;
                    int i3112 = ((i21111114 & 85) | i21111115) << 1;
                    int i3113 = -i21111115;
                    i = ((i3113 & i3112) << 1) + (i3112 ^ i3113);
                    break;
                case 9:
                    Object objO2 = ar.o(t, jL);
                    if (objO2 != null) {
                        int i57 = b + 57;
                        a = i57 % 128;
                        if (i57 % 2 != 0) {
                            objO2.hashCode();
                            obj.hashCode();
                            throw null;
                        }
                        iHashCode = objO2.hashCode();
                    }
                    int i58 = i2 * 53;
                    int i59 = -(-iHashCode);
                    int i60 = i58 ^ i59;
                    int i61 = ((i58 & i59) | i60) << 1;
                    int i62 = -i60;
                    i4 = i61 ^ i62;
                    i5 = (i61 & i62) << 1;
                    i2 = i5 + i4;
                    int i21111116 = i & (-82);
                    int i21111117 = (i | (-82)) & (~i21111116);
                    int i21111118 = i21111116 << 1;
                    int i21111119 = (i21111117 & i21111118) + (i21111117 | i21111118);
                    int i211111110 = i21111119 ^ 85;
                    int i3114 = ((i21111119 & 85) | i211111110) << 1;
                    int i3115 = -i211111110;
                    i = ((i3115 & i3114) << 1) + (i3114 ^ i3115);
                    break;
                case 10:
                    i3 = i2 * 53;
                    iC = ar.o(t, jL).hashCode();
                    int i21111120 = iC & i3;
                    int i211111111 = -(-(iC | i3));
                    i4 = i21111120 & i211111111;
                    i5 = i211111111 | i21111120;
                    i2 = i5 + i4;
                    int i211111112 = i & (-82);
                    int i211111113 = (i | (-82)) & (~i211111112);
                    int i211111114 = i211111112 << 1;
                    int i211111115 = (i211111113 & i211111114) + (i211111113 | i211111114);
                    int i211111116 = i211111115 ^ 85;
                    int i3116 = ((i211111115 & 85) | i211111116) << 1;
                    int i3117 = -i211111116;
                    i = ((i3117 & i3116) << 1) + (i3116 ^ i3117);
                    break;
                case 11:
                    i3 = i2 * 53;
                    iC = ar.n(t, jL);
                    int i21111121 = iC & i3;
                    int i211111117 = -(-(iC | i3));
                    i4 = i21111121 & i211111117;
                    i5 = i211111117 | i21111121;
                    i2 = i5 + i4;
                    int i211111118 = i & (-82);
                    int i211111119 = (i | (-82)) & (~i211111118);
                    int i2111111110 = i211111118 << 1;
                    int i2111111111 = (i211111119 & i2111111110) + (i211111119 | i2111111110);
                    int i2111111112 = i2111111111 ^ 85;
                    int i3118 = ((i2111111111 & 85) | i2111111112) << 1;
                    int i3119 = -i2111111112;
                    i = ((i3119 & i3118) << 1) + (i3118 ^ i3119);
                    break;
                case 12:
                    i3 = i2 * 53;
                    iC = ar.n(t, jL);
                    int i21111122 = iC & i3;
                    int i2111111113 = -(-(iC | i3));
                    i4 = i21111122 & i2111111113;
                    i5 = i2111111113 | i21111122;
                    i2 = i5 + i4;
                    int i2111111114 = i & (-82);
                    int i2111111115 = (i | (-82)) & (~i2111111114);
                    int i2111111116 = i2111111114 << 1;
                    int i2111111117 = (i2111111115 & i2111111116) + (i2111111115 | i2111111116);
                    int i2111111118 = i2111111117 ^ 85;
                    int i31110 = ((i2111111117 & 85) | i2111111118) << 1;
                    int i31111 = -i2111111118;
                    i = ((i31111 & i31110) << 1) + (i31110 ^ i31111);
                    break;
                case 13:
                    i3 = i2 * 53;
                    iC = ar.n(t, jL);
                    int i21111123 = iC & i3;
                    int i2111111119 = -(-(iC | i3));
                    i4 = i21111123 & i2111111119;
                    i5 = i2111111119 | i21111123;
                    i2 = i5 + i4;
                    int i21111111110 = i & (-82);
                    int i21111111111 = (i | (-82)) & (~i21111111110);
                    int i21111111112 = i21111111110 << 1;
                    int i21111111113 = (i21111111111 & i21111111112) + (i21111111111 | i21111111112);
                    int i21111111114 = i21111111113 ^ 85;
                    int i31112 = ((i21111111113 & 85) | i21111111114) << 1;
                    int i31113 = -i21111111114;
                    i = ((i31113 & i31112) << 1) + (i31112 ^ i31113);
                    break;
                case IMediaSession.Stub.TRANSACTION_playFromMediaId /* 14 */:
                    i3 = i2 * 53;
                    iC = R.c(ar.p(t, jL));
                    int i63 = a + 85;
                    b = i63 % 128;
                    int i64 = i63 % 2;
                    int i21111124 = iC & i3;
                    int i21111111115 = -(-(iC | i3));
                    i4 = i21111124 & i21111111115;
                    i5 = i21111111115 | i21111124;
                    i2 = i5 + i4;
                    int i21111111116 = i & (-82);
                    int i21111111117 = (i | (-82)) & (~i21111111116);
                    int i21111111118 = i21111111116 << 1;
                    int i21111111119 = (i21111111117 & i21111111118) + (i21111111117 | i21111111118);
                    int i211111111110 = i21111111119 ^ 85;
                    int i31114 = ((i21111111119 & 85) | i211111111110) << 1;
                    int i31115 = -i211111111110;
                    i = ((i31115 & i31114) << 1) + (i31114 ^ i31115);
                    break;
                case IMediaSession.Stub.TRANSACTION_playFromSearch /* 15 */:
                    i3 = i2 * 53;
                    iC = ar.n(t, jL);
                    int i65 = b;
                    int i66 = i65 & 95;
                    int i67 = ((i65 | 95) & (~i66)) + (i66 << 1);
                    a = i67 % 128;
                    int i68 = i67 % 2;
                    int i21111125 = iC & i3;
                    int i211111111111 = -(-(iC | i3));
                    i4 = i21111125 & i211111111111;
                    i5 = i211111111111 | i21111125;
                    i2 = i5 + i4;
                    int i211111111112 = i & (-82);
                    int i211111111113 = (i | (-82)) & (~i211111111112);
                    int i211111111114 = i211111111112 << 1;
                    int i211111111115 = (i211111111113 & i211111111114) + (i211111111113 | i211111111114);
                    int i211111111116 = i211111111115 ^ 85;
                    int i31116 = ((i211111111115 & 85) | i211111111116) << 1;
                    int i31117 = -i211111111116;
                    i = ((i31117 & i31116) << 1) + (i31116 ^ i31117);
                    break;
                case 16:
                    i3 = i2 * 53;
                    iC = R.c(ar.p(t, jL));
                    int i69 = b + 29;
                    int i70 = i69 % 128;
                    a = i70;
                    int i71 = i69 % 2;
                    int i72 = i70 & 89;
                    int i73 = -(-((i70 ^ 89) | i72));
                    int i74 = (i72 ^ i73) + ((i72 & i73) << 1);
                    b = i74 % 128;
                    int i75 = i74 % 2;
                    int i21111126 = iC & i3;
                    int i211111111117 = -(-(iC | i3));
                    i4 = i21111126 & i211111111117;
                    i5 = i211111111117 | i21111126;
                    i2 = i5 + i4;
                    int i211111111118 = i & (-82);
                    int i211111111119 = (i | (-82)) & (~i211111111118);
                    int i2111111111110 = i211111111118 << 1;
                    int i2111111111111 = (i211111111119 & i2111111111110) + (i211111111119 | i2111111111110);
                    int i2111111111112 = i2111111111111 ^ 85;
                    int i31118 = ((i2111111111111 & 85) | i2111111111112) << 1;
                    int i31119 = -i2111111111112;
                    i = ((i31119 & i31118) << 1) + (i31118 ^ i31119);
                    break;
                case IMediaSession.Stub.TRANSACTION_skipToQueueItem /* 17 */:
                    Object objO3 = ar.o(t, jL);
                    if (objO3 != null) {
                        int i76 = b;
                        int i77 = ((i76 ^ 7) | (i76 & 7)) << 1;
                        int i78 = -(((~i76) & 7) | (i76 & (-8)));
                        int i79 = (i77 ^ i78) + ((i78 & i77) << 1);
                        a = i79 % 128;
                        if (i79 % 2 != 0) {
                            objO3.hashCode();
                            throw null;
                        }
                        iHashCode = objO3.hashCode();
                    }
                    int i510 = i2 * 53;
                    int i511 = -(-iHashCode);
                    int i610 = i510 ^ i511;
                    int i611 = ((i510 & i511) | i610) << 1;
                    int i612 = -i610;
                    i4 = i611 ^ i612;
                    i5 = (i611 & i612) << 1;
                    i2 = i5 + i4;
                    int i2111111111113 = i & (-82);
                    int i2111111111114 = (i | (-82)) & (~i2111111111113);
                    int i2111111111115 = i2111111111113 << 1;
                    int i2111111111116 = (i2111111111114 & i2111111111115) + (i2111111111114 | i2111111111115);
                    int i2111111111117 = i2111111111116 ^ 85;
                    int i311110 = ((i2111111111116 & 85) | i2111111111117) << 1;
                    int i311111 = -i2111111111117;
                    i = ((i311111 & i311110) << 1) + (i311110 ^ i311111);
                    break;
                case IMediaSession.Stub.TRANSACTION_pause /* 18 */:
                case IMediaSession.Stub.TRANSACTION_stop /* 19 */:
                case IMediaSession.Stub.TRANSACTION_next /* 20 */:
                case IMediaSession.Stub.TRANSACTION_previous /* 21 */:
                case IMediaSession.Stub.TRANSACTION_fastForward /* 22 */:
                case IMediaSession.Stub.TRANSACTION_rewind /* 23 */:
                case IMediaSession.Stub.TRANSACTION_seekTo /* 24 */:
                case IMediaSession.Stub.TRANSACTION_rate /* 25 */:
                case IMediaSession.Stub.TRANSACTION_sendCustomAction /* 26 */:
                case IMediaSession.Stub.TRANSACTION_getMetadata /* 27 */:
                case IMediaSession.Stub.TRANSACTION_getPlaybackState /* 28 */:
                case IMediaSession.Stub.TRANSACTION_getQueue /* 29 */:
                case IMediaSession.Stub.TRANSACTION_getQueueTitle /* 30 */:
                case IMediaSession.Stub.TRANSACTION_getExtras /* 31 */:
                case IMediaSession.Stub.TRANSACTION_getRatingType /* 32 */:
                case IMediaSession.Stub.TRANSACTION_prepare /* 33 */:
                case IMediaSession.Stub.TRANSACTION_prepareFromMediaId /* 34 */:
                case IMediaSession.Stub.TRANSACTION_prepareFromSearch /* 35 */:
                case IMediaSession.Stub.TRANSACTION_prepareFromUri /* 36 */:
                case IMediaSession.Stub.TRANSACTION_getRepeatMode /* 37 */:
                case IMediaSession.Stub.TRANSACTION_isShuffleModeEnabledRemoved /* 38 */:
                case IMediaSession.Stub.TRANSACTION_setRepeatMode /* 39 */:
                case IMediaSession.Stub.TRANSACTION_setShuffleModeEnabledRemoved /* 40 */:
                case IMediaSession.Stub.TRANSACTION_addQueueItem /* 41 */:
                case IMediaSession.Stub.TRANSACTION_addQueueItemAt /* 42 */:
                case IMediaSession.Stub.TRANSACTION_removeQueueItem /* 43 */:
                case IMediaSession.Stub.TRANSACTION_removeQueueItemAt /* 44 */:
                case IMediaSession.Stub.TRANSACTION_isCaptioningEnabled /* 45 */:
                case IMediaSession.Stub.TRANSACTION_setCaptioningEnabled /* 46 */:
                case IMediaSession.Stub.TRANSACTION_getShuffleMode /* 47 */:
                case IMediaSession.Stub.TRANSACTION_setShuffleMode /* 48 */:
                case 49:
                    i3 = i2 * 53;
                    Object objO4 = ar.o(t, jL);
                    int i80 = a;
                    int i81 = ((i80 & 58) + (i80 | 58)) - 1;
                    b = i81 % 128;
                    int i82 = i81 % 2;
                    iC = objO4.hashCode();
                    int i21111127 = iC & i3;
                    int i2111111111118 = -(-(iC | i3));
                    i4 = i21111127 & i2111111111118;
                    i5 = i2111111111118 | i21111127;
                    i2 = i5 + i4;
                    int i2111111111119 = i & (-82);
                    int i21111111111110 = (i | (-82)) & (~i2111111111119);
                    int i21111111111111 = i2111111111119 << 1;
                    int i21111111111112 = (i21111111111110 & i21111111111111) + (i21111111111110 | i21111111111111);
                    int i21111111111113 = i21111111111112 ^ 85;
                    int i311112 = ((i21111111111112 & 85) | i21111111111113) << 1;
                    int i311113 = -i21111111111113;
                    i = ((i311113 & i311112) << 1) + (i311112 ^ i311113);
                    break;
                case 50:
                    i3 = i2 * 53;
                    iC = ar.o(t, jL).hashCode();
                    int i83 = b;
                    int i84 = (i83 ^ 25) + ((i83 & 25) << 1);
                    a = i84 % 128;
                    int i85 = i84 % 2;
                    int i21111128 = iC & i3;
                    int i21111111111114 = -(-(iC | i3));
                    i4 = i21111128 & i21111111111114;
                    i5 = i21111111111114 | i21111128;
                    i2 = i5 + i4;
                    int i21111111111115 = i & (-82);
                    int i21111111111116 = (i | (-82)) & (~i21111111111115);
                    int i21111111111117 = i21111111111115 << 1;
                    int i21111111111118 = (i21111111111116 & i21111111111117) + (i21111111111116 | i21111111111117);
                    int i21111111111119 = i21111111111118 ^ 85;
                    int i311114 = ((i21111111111118 & 85) | i21111111111119) << 1;
                    int i311115 = -i21111111111119;
                    i = ((i311115 & i311114) << 1) + (i311114 ^ i311115);
                    break;
                case IMediaSession.Stub.TRANSACTION_rateWithExtras /* 51 */:
                    if (P(t, i16, i)) {
                        int i86 = a;
                        int i87 = (-2) - (((i86 & 40) + (i86 | 40)) ^ (-1));
                        b = i87 % 128;
                        if (i87 % 2 == 0) {
                            int i88 = i2 & 55;
                            int i89 = ((i2 ^ 55) | i88) << 1;
                            int i90 = -((i2 | 55) & (~i88));
                            int i91 = (i89 ^ i90) + ((i90 & i89) << 1);
                            jDoubleToLongBits = Double.doubleToLongBits(q(t, jL));
                            i3 = i91;
                        } else {
                            i3 = i2 * 53;
                            jDoubleToLongBits = Double.doubleToLongBits(q(t, jL));
                        }
                        iC = R.c(jDoubleToLongBits);
                        int i21111129 = iC & i3;
                        int i211111111111110 = -(-(iC | i3));
                        i4 = i21111129 & i211111111111110;
                        i5 = i211111111111110 | i21111129;
                        i2 = i5 + i4;
                    }
                    int i211111111111111 = i & (-82);
                    int i211111111111112 = (i | (-82)) & (~i211111111111111);
                    int i211111111111113 = i211111111111111 << 1;
                    int i211111111111114 = (i211111111111112 & i211111111111113) + (i211111111111112 | i211111111111113);
                    int i211111111111115 = i211111111111114 ^ 85;
                    int i311116 = ((i211111111111114 & 85) | i211111111111115) << 1;
                    int i311117 = -i211111111111115;
                    i = ((i311117 & i311116) << 1) + (i311116 ^ i311117);
                    break;
                case 52:
                    if (P(t, i16, i)) {
                        int i92 = a;
                        int i93 = i92 & 125;
                        int i94 = (((i92 ^ 125) | i93) << 1) - ((i92 | 125) & (~i93));
                        b = i94 % 128;
                        int i95 = i94 % 2;
                        i3 = i2 * 53;
                        float fR = r(t, jL);
                        int i96 = a;
                        int i97 = i96 ^ 103;
                        int i98 = ((((i96 & 103) | i97) << 1) - (~(-i97))) - 1;
                        b = i98 % 128;
                        if (i98 % 2 == 0) {
                            iC = Float.floatToIntBits(fR);
                            int i99 = 22 / 0;
                        } else {
                            iC = Float.floatToIntBits(fR);
                        }
                        int i211111210 = iC & i3;
                        int i211111111111116 = -(-(iC | i3));
                        i4 = i211111210 & i211111111111116;
                        i5 = i211111111111116 | i211111210;
                        i2 = i5 + i4;
                    }
                    int i211111111111117 = i & (-82);
                    int i211111111111118 = (i | (-82)) & (~i211111111111117);
                    int i211111111111119 = i211111111111117 << 1;
                    int i2111111111111110 = (i211111111111118 & i211111111111119) + (i211111111111118 | i211111111111119);
                    int i2111111111111111 = i2111111111111110 ^ 85;
                    int i311118 = ((i2111111111111110 & 85) | i2111111111111111) << 1;
                    int i311119 = -i2111111111111111;
                    i = ((i311119 & i311118) << 1) + (i311118 ^ i311119);
                    break;
                case 53:
                    if (P(t, i16, i)) {
                        int i100 = a;
                        int i101 = (i100 ^ 51) + ((i100 & 51) << 1);
                        b = i101 % 128;
                        int i102 = i101 % 2 == 0 ? i2 * 42 : i2 * 53;
                        long jT = t(t, jL);
                        i3 = i102;
                        int i103 = a;
                        int i104 = i103 & 113;
                        int i105 = (i103 ^ 113) | i104;
                        int i106 = (i104 ^ i105) + ((i105 & i104) << 1);
                        b = i106 % 128;
                        int i107 = i106 % 2;
                        iC = R.c(jT);
                        int i211111211 = iC & i3;
                        int i2111111111111112 = -(-(iC | i3));
                        i4 = i211111211 & i2111111111111112;
                        i5 = i2111111111111112 | i211111211;
                        i2 = i5 + i4;
                    }
                    int i2111111111111113 = i & (-82);
                    int i2111111111111114 = (i | (-82)) & (~i2111111111111113);
                    int i2111111111111115 = i2111111111111113 << 1;
                    int i2111111111111116 = (i2111111111111114 & i2111111111111115) + (i2111111111111114 | i2111111111111115);
                    int i2111111111111117 = i2111111111111116 ^ 85;
                    int i3111110 = ((i2111111111111116 & 85) | i2111111111111117) << 1;
                    int i3111111 = -i2111111111111117;
                    i = ((i3111111 & i3111110) << 1) + (i3111110 ^ i3111111);
                    break;
                case 54:
                    if (P(t, i16, i)) {
                        int i108 = a;
                        int i109 = ((i108 ^ 121) | (i108 & 121)) << 1;
                        int i110 = -(((~i108) & 121) | (i108 & (-122)));
                        int i111 = (i109 & i110) + (i110 | i109);
                        b = i111 % 128;
                        i3 = i111 % 2 == 0 ? (-2) - ((i2 - 39) ^ (-1)) : i2 * 53;
                        iC = R.c(t(t, jL));
                        int i112 = b;
                        int i113 = ((i112 | 81) << 1) - (i112 ^ 81);
                        a = i113 % 128;
                        if (i113 % 2 != 0) {
                            throw null;
                        }
                        int i211111212 = iC & i3;
                        int i2111111111111118 = -(-(iC | i3));
                        i4 = i211111212 & i2111111111111118;
                        i5 = i2111111111111118 | i211111212;
                        i2 = i5 + i4;
                    } else {
                        continue;
                    }
                    int i2111111111111119 = i & (-82);
                    int i21111111111111110 = (i | (-82)) & (~i2111111111111119);
                    int i21111111111111111 = i2111111111111119 << 1;
                    int i21111111111111112 = (i21111111111111110 & i21111111111111111) + (i21111111111111110 | i21111111111111111);
                    int i21111111111111113 = i21111111111111112 ^ 85;
                    int i3111112 = ((i21111111111111112 & 85) | i21111111111111113) << 1;
                    int i3111113 = -i21111111111111113;
                    i = ((i3111113 & i3111112) << 1) + (i3111112 ^ i3111113);
                    break;
                case 55:
                    if (P(t, i16, i)) {
                        int i114 = b + 125;
                        a = i114 % 128;
                        i3 = i114 % 2 != 0 ? i2 / 42 : i2 * 53;
                        iC = s(t, jL);
                        int i211111213 = iC & i3;
                        int i21111111111111114 = -(-(iC | i3));
                        i4 = i211111213 & i21111111111111114;
                        i5 = i21111111111111114 | i211111213;
                        i2 = i5 + i4;
                    }
                    int i21111111111111115 = i & (-82);
                    int i21111111111111116 = (i | (-82)) & (~i21111111111111115);
                    int i21111111111111117 = i21111111111111115 << 1;
                    int i21111111111111118 = (i21111111111111116 & i21111111111111117) + (i21111111111111116 | i21111111111111117);
                    int i21111111111111119 = i21111111111111118 ^ 85;
                    int i3111114 = ((i21111111111111118 & 85) | i21111111111111119) << 1;
                    int i3111115 = -i21111111111111119;
                    i = ((i3111115 & i3111114) << 1) + (i3111114 ^ i3111115);
                    break;
                case 56:
                    if (!(!P(t, i16, i))) {
                        int i115 = a;
                        int i116 = (((i115 | 24) << 1) - (i115 ^ 24)) - 1;
                        b = i116 % 128;
                        int i117 = i116 % 2;
                        i3 = i2 * 53;
                        iC = R.c(t(t, jL));
                        int i211111214 = iC & i3;
                        int i211111111111111110 = -(-(iC | i3));
                        i4 = i211111214 & i211111111111111110;
                        i5 = i211111111111111110 | i211111214;
                        i2 = i5 + i4;
                    }
                    int i211111111111111111 = i & (-82);
                    int i211111111111111112 = (i | (-82)) & (~i211111111111111111);
                    int i211111111111111113 = i211111111111111111 << 1;
                    int i211111111111111114 = (i211111111111111112 & i211111111111111113) + (i211111111111111112 | i211111111111111113);
                    int i211111111111111115 = i211111111111111114 ^ 85;
                    int i3111116 = ((i211111111111111114 & 85) | i211111111111111115) << 1;
                    int i3111117 = -i211111111111111115;
                    i = ((i3111117 & i3111116) << 1) + (i3111116 ^ i3111117);
                    break;
                case 57:
                    if (P(t, i16, i)) {
                        int i118 = b;
                        int i119 = (i118 ^ 35) + ((i118 & 35) << 1);
                        a = i119 % 128;
                        int i120 = i119 % 2;
                        i3 = i2 * 53;
                        iC = s(t, jL);
                        int i121 = b + 85;
                        a = i121 % 128;
                        int i122 = i121 % 2;
                        int i211111215 = iC & i3;
                        int i211111111111111116 = -(-(iC | i3));
                        i4 = i211111215 & i211111111111111116;
                        i5 = i211111111111111116 | i211111215;
                        i2 = i5 + i4;
                    }
                    int i211111111111111117 = i & (-82);
                    int i211111111111111118 = (i | (-82)) & (~i211111111111111117);
                    int i211111111111111119 = i211111111111111117 << 1;
                    int i2111111111111111110 = (i211111111111111118 & i211111111111111119) + (i211111111111111118 | i211111111111111119);
                    int i2111111111111111111 = i2111111111111111110 ^ 85;
                    int i3111118 = ((i2111111111111111110 & 85) | i2111111111111111111) << 1;
                    int i3111119 = -i2111111111111111111;
                    i = ((i3111119 & i3111118) << 1) + (i3111118 ^ i3111119);
                    break;
                case 58:
                    if (P(t, i16, i)) {
                        i3 = i2 * 53;
                        iC = R.b(p(t, jL));
                        int i123 = b;
                        int i124 = i123 ^ 59;
                        int i125 = -(-((i123 & 59) << 1));
                        int i126 = (i124 ^ i125) + ((i125 & i124) << 1);
                        int i127 = i126 % 128;
                        a = i127;
                        int i128 = i126 % 2;
                        int i129 = i127 + 86;
                        int i130 = (i129 ^ (-1)) + (i129 << 1);
                        b = i130 % 128;
                        int i131 = i130 % 2;
                        int i211111216 = iC & i3;
                        int i2111111111111111112 = -(-(iC | i3));
                        i4 = i211111216 & i2111111111111111112;
                        i5 = i2111111111111111112 | i211111216;
                        i2 = i5 + i4;
                    }
                    int i2111111111111111113 = i & (-82);
                    int i2111111111111111114 = (i | (-82)) & (~i2111111111111111113);
                    int i2111111111111111115 = i2111111111111111113 << 1;
                    int i2111111111111111116 = (i2111111111111111114 & i2111111111111111115) + (i2111111111111111114 | i2111111111111111115);
                    int i2111111111111111117 = i2111111111111111116 ^ 85;
                    int i31111110 = ((i2111111111111111116 & 85) | i2111111111111111117) << 1;
                    int i31111111 = -i2111111111111111117;
                    i = ((i31111111 & i31111110) << 1) + (i31111110 ^ i31111111);
                    break;
                case 59:
                    if (P(t, i16, i)) {
                        i3 = i2 * 53;
                        String str2 = (String) ar.o(t, jL);
                        int i132 = b;
                        int i133 = (i132 & (-88)) | ((~i132) & 87);
                        int i134 = -(-((i132 & 87) << 1));
                        int i135 = ((i133 | i134) << 1) - (i134 ^ i133);
                        a = i135 % 128;
                        int i136 = i135 % 2;
                        iC = str2.hashCode();
                        int i137 = b;
                        int i138 = i137 | 53;
                        int i139 = i138 << 1;
                        int i140 = -((~(i137 & 53)) & i138);
                        int i141 = ((i139 | i140) << 1) - (i140 ^ i139);
                        a = i141 % 128;
                        int i142 = i141 % 2;
                        int i211111217 = iC & i3;
                        int i2111111111111111118 = -(-(iC | i3));
                        i4 = i211111217 & i2111111111111111118;
                        i5 = i2111111111111111118 | i211111217;
                        i2 = i5 + i4;
                    }
                    int i2111111111111111119 = i & (-82);
                    int i21111111111111111110 = (i | (-82)) & (~i2111111111111111119);
                    int i21111111111111111111 = i2111111111111111119 << 1;
                    int i21111111111111111112 = (i21111111111111111110 & i21111111111111111111) + (i21111111111111111110 | i21111111111111111111);
                    int i21111111111111111113 = i21111111111111111112 ^ 85;
                    int i31111112 = ((i21111111111111111112 & 85) | i21111111111111111113) << 1;
                    int i31111113 = -i21111111111111111113;
                    i = ((i31111113 & i31111112) << 1) + (i31111112 ^ i31111113);
                    break;
                case 60:
                    if (!(!P(t, i16, i))) {
                        int i143 = a;
                        int i144 = i143 & 41;
                        int i145 = -(-((i143 ^ 41) | i144));
                        int i146 = (i144 ^ i145) + ((i145 & i144) << 1);
                        b = i146 % 128;
                        int i147 = i146 % 2;
                        i3 = i2 * 53;
                        iC = ar.o(t, jL).hashCode();
                        int i148 = a;
                        int i149 = ((i148 | 39) << 1) - (i148 ^ 39);
                        b = i149 % 128;
                        int i150 = i149 % 2;
                        int i151 = (((i148 | 118) << 1) - (i148 ^ 118)) - 1;
                        b = i151 % 128;
                        int i152 = i151 % 2;
                        int i211111218 = iC & i3;
                        int i21111111111111111114 = -(-(iC | i3));
                        i4 = i211111218 & i21111111111111111114;
                        i5 = i21111111111111111114 | i211111218;
                        i2 = i5 + i4;
                    }
                    int i21111111111111111115 = i & (-82);
                    int i21111111111111111116 = (i | (-82)) & (~i21111111111111111115);
                    int i21111111111111111117 = i21111111111111111115 << 1;
                    int i21111111111111111118 = (i21111111111111111116 & i21111111111111111117) + (i21111111111111111116 | i21111111111111111117);
                    int i21111111111111111119 = i21111111111111111118 ^ 85;
                    int i31111114 = ((i21111111111111111118 & 85) | i21111111111111111119) << 1;
                    int i31111115 = -i21111111111111111119;
                    i = ((i31111115 & i31111114) << 1) + (i31111114 ^ i31111115);
                    break;
                case 61:
                    if (!P(t, i16, i)) {
                        continue;
                    } else {
                        int i153 = a;
                        int i154 = (i153 & 109) + (i153 | 109);
                        b = i154 % 128;
                        int i155 = i154 % 2;
                        i3 = i2 * 53;
                        Object objO5 = ar.o(t, jL);
                        int i156 = b;
                        int i157 = (i156 | 59) << 1;
                        int i158 = -(i156 ^ 59);
                        int i159 = (i157 ^ i158) + ((i158 & i157) << 1);
                        a = i159 % 128;
                        if (i159 % 2 != 0) {
                            objO5.hashCode();
                            throw null;
                        }
                        iC = objO5.hashCode();
                        int i211111219 = iC & i3;
                        int i211111111111111111110 = -(-(iC | i3));
                        i4 = i211111219 & i211111111111111111110;
                        i5 = i211111111111111111110 | i211111219;
                        i2 = i5 + i4;
                    }
                    int i211111111111111111111 = i & (-82);
                    int i211111111111111111112 = (i | (-82)) & (~i211111111111111111111);
                    int i211111111111111111113 = i211111111111111111111 << 1;
                    int i211111111111111111114 = (i211111111111111111112 & i211111111111111111113) + (i211111111111111111112 | i211111111111111111113);
                    int i211111111111111111115 = i211111111111111111114 ^ 85;
                    int i31111116 = ((i211111111111111111114 & 85) | i211111111111111111115) << 1;
                    int i31111117 = -i211111111111111111115;
                    i = ((i31111117 & i31111116) << 1) + (i31111116 ^ i31111117);
                    break;
                case 62:
                    if (P(t, i16, i)) {
                        i3 = i2 * 53;
                        iC = s(t, jL);
                        int i2111112110 = iC & i3;
                        int i211111111111111111116 = -(-(iC | i3));
                        i4 = i2111112110 & i211111111111111111116;
                        i5 = i211111111111111111116 | i2111112110;
                        i2 = i5 + i4;
                    }
                    int i211111111111111111117 = i & (-82);
                    int i211111111111111111118 = (i | (-82)) & (~i211111111111111111117);
                    int i211111111111111111119 = i211111111111111111117 << 1;
                    int i2111111111111111111110 = (i211111111111111111118 & i211111111111111111119) + (i211111111111111111118 | i211111111111111111119);
                    int i2111111111111111111111 = i2111111111111111111110 ^ 85;
                    int i31111118 = ((i2111111111111111111110 & 85) | i2111111111111111111111) << 1;
                    int i31111119 = -i2111111111111111111111;
                    i = ((i31111119 & i31111118) << 1) + (i31111118 ^ i31111119);
                    break;
                case 63:
                    if (P(t, i16, i)) {
                        int i160 = b;
                        int i161 = i160 & 95;
                        int i162 = ((i160 ^ 95) | i161) << 1;
                        int i163 = -((i160 | 95) & (~i161));
                        int i164 = (i162 & i163) + (i163 | i162);
                        a = i164 % 128;
                        i3 = i164 % 2 != 0 ? i2 / 16 : i2 * 53;
                        iC = s(t, jL);
                        int i2111112111 = iC & i3;
                        int i2111111111111111111112 = -(-(iC | i3));
                        i4 = i2111112111 & i2111111111111111111112;
                        i5 = i2111111111111111111112 | i2111112111;
                        i2 = i5 + i4;
                    }
                    int i2111111111111111111113 = i & (-82);
                    int i2111111111111111111114 = (i | (-82)) & (~i2111111111111111111113);
                    int i2111111111111111111115 = i2111111111111111111113 << 1;
                    int i2111111111111111111116 = (i2111111111111111111114 & i2111111111111111111115) + (i2111111111111111111114 | i2111111111111111111115);
                    int i2111111111111111111117 = i2111111111111111111116 ^ 85;
                    int i311111110 = ((i2111111111111111111116 & 85) | i2111111111111111111117) << 1;
                    int i311111111 = -i2111111111111111111117;
                    i = ((i311111111 & i311111110) << 1) + (i311111110 ^ i311111111);
                    break;
                case 64:
                    if (!(!P(t, i16, i))) {
                        int i165 = a;
                        int i166 = i165 & 123;
                        int i167 = (((i165 | 123) & (~i166)) - (~(-(-(i166 << 1))))) - 1;
                        b = i167 % 128;
                        int i168 = i167 % 2;
                        i3 = i2 * 53;
                        iC = s(t, jL);
                        int i169 = a + 49;
                        b = i169 % 128;
                        int i170 = i169 % 2;
                        int i2111112112 = iC & i3;
                        int i2111111111111111111118 = -(-(iC | i3));
                        i4 = i2111112112 & i2111111111111111111118;
                        i5 = i2111111111111111111118 | i2111112112;
                        i2 = i5 + i4;
                    }
                    int i2111111111111111111119 = i & (-82);
                    int i21111111111111111111110 = (i | (-82)) & (~i2111111111111111111119);
                    int i21111111111111111111111 = i2111111111111111111119 << 1;
                    int i21111111111111111111112 = (i21111111111111111111110 & i21111111111111111111111) + (i21111111111111111111110 | i21111111111111111111111);
                    int i21111111111111111111113 = i21111111111111111111112 ^ 85;
                    int i311111112 = ((i21111111111111111111112 & 85) | i21111111111111111111113) << 1;
                    int i311111113 = -i21111111111111111111113;
                    i = ((i311111113 & i311111112) << 1) + (i311111112 ^ i311111113);
                    break;
                case 65:
                    if (P(t, i16, i)) {
                        i3 = i2 * 53;
                        iC = R.c(t(t, jL));
                        int i171 = a;
                        int i172 = i171 & 23;
                        int i173 = ((i171 ^ 23) | i172) << 1;
                        int i174 = -((i171 | 23) & (~i172));
                        int i175 = ((i173 | i174) << 1) - (i174 ^ i173);
                        b = i175 % 128;
                        if (i175 % 2 == 0) {
                            int i176 = 54 / 0;
                        }
                        int i2111112113 = iC & i3;
                        int i21111111111111111111114 = -(-(iC | i3));
                        i4 = i2111112113 & i21111111111111111111114;
                        i5 = i21111111111111111111114 | i2111112113;
                        i2 = i5 + i4;
                    }
                    int i21111111111111111111115 = i & (-82);
                    int i21111111111111111111116 = (i | (-82)) & (~i21111111111111111111115);
                    int i21111111111111111111117 = i21111111111111111111115 << 1;
                    int i21111111111111111111118 = (i21111111111111111111116 & i21111111111111111111117) + (i21111111111111111111116 | i21111111111111111111117);
                    int i21111111111111111111119 = i21111111111111111111118 ^ 85;
                    int i311111114 = ((i21111111111111111111118 & 85) | i21111111111111111111119) << 1;
                    int i311111115 = -i21111111111111111111119;
                    i = ((i311111115 & i311111114) << 1) + (i311111114 ^ i311111115);
                    break;
                case 66:
                    if (P(t, i16, i)) {
                        int i177 = b;
                        int i178 = i177 & 95;
                        int i179 = ((i177 ^ 95) | i178) << 1;
                        int i180 = -((i177 | 95) & (~i178));
                        int i181 = (i179 ^ i180) + ((i180 & i179) << 1);
                        a = i181 % 128;
                        i3 = i181 % 2 != 0 ? i2 + 94 : i2 * 53;
                        iC = s(t, jL);
                        int i2111112114 = iC & i3;
                        int i211111111111111111111110 = -(-(iC | i3));
                        i4 = i2111112114 & i211111111111111111111110;
                        i5 = i211111111111111111111110 | i2111112114;
                        i2 = i5 + i4;
                    }
                    int i211111111111111111111111 = i & (-82);
                    int i211111111111111111111112 = (i | (-82)) & (~i211111111111111111111111);
                    int i211111111111111111111113 = i211111111111111111111111 << 1;
                    int i211111111111111111111114 = (i211111111111111111111112 & i211111111111111111111113) + (i211111111111111111111112 | i211111111111111111111113);
                    int i211111111111111111111115 = i211111111111111111111114 ^ 85;
                    int i311111116 = ((i211111111111111111111114 & 85) | i211111111111111111111115) << 1;
                    int i311111117 = -i211111111111111111111115;
                    i = ((i311111117 & i311111116) << 1) + (i311111116 ^ i311111117);
                    break;
                case 67:
                    if (P(t, i16, i)) {
                        int i182 = a;
                        int i183 = (i182 ^ 97) + ((i182 & 97) << 1);
                        b = i183 % 128;
                        int i184 = i183 % 2;
                        i3 = i2 * 53;
                        iC = R.c(t(t, jL));
                        int i2111112115 = iC & i3;
                        int i211111111111111111111116 = -(-(iC | i3));
                        i4 = i2111112115 & i211111111111111111111116;
                        i5 = i211111111111111111111116 | i2111112115;
                        i2 = i5 + i4;
                    }
                    int i211111111111111111111117 = i & (-82);
                    int i211111111111111111111118 = (i | (-82)) & (~i211111111111111111111117);
                    int i211111111111111111111119 = i211111111111111111111117 << 1;
                    int i2111111111111111111111110 = (i211111111111111111111118 & i211111111111111111111119) + (i211111111111111111111118 | i211111111111111111111119);
                    int i2111111111111111111111111 = i2111111111111111111111110 ^ 85;
                    int i311111118 = ((i2111111111111111111111110 & 85) | i2111111111111111111111111) << 1;
                    int i311111119 = -i2111111111111111111111111;
                    i = ((i311111119 & i311111118) << 1) + (i311111118 ^ i311111119);
                    break;
                case 68:
                    if (P(t, i16, i)) {
                        int i185 = a;
                        int i186 = (((i185 ^ 37) | (i185 & 37)) << 1) - (((~i185) & 37) | (i185 & (-38)));
                        b = i186 % 128;
                        if (i186 % 2 == 0) {
                            objO = ar.o(t, jL);
                            int i187 = (i2 | (-97)) << 1;
                            int i188 = -(((~i2) & (-97)) | (i2 & 96));
                            i3 = (i187 ^ i188) + ((i188 & i187) << 1);
                        } else {
                            objO = ar.o(t, jL);
                            i3 = i2 * 53;
                        }
                        iC = objO.hashCode();
                        int i2111112116 = iC & i3;
                        int i2111111111111111111111112 = -(-(iC | i3));
                        i4 = i2111112116 & i2111111111111111111111112;
                        i5 = i2111111111111111111111112 | i2111112116;
                        i2 = i5 + i4;
                    }
                    int i2111111111111111111111113 = i & (-82);
                    int i2111111111111111111111114 = (i | (-82)) & (~i2111111111111111111111113);
                    int i2111111111111111111111115 = i2111111111111111111111113 << 1;
                    int i2111111111111111111111116 = (i2111111111111111111111114 & i2111111111111111111111115) + (i2111111111111111111111114 | i2111111111111111111111115);
                    int i2111111111111111111111117 = i2111111111111111111111116 ^ 85;
                    int i3111111110 = ((i2111111111111111111111116 & 85) | i2111111111111111111111117) << 1;
                    int i3111111111 = -i2111111111111111111111117;
                    i = ((i3111111111 & i3111111110) << 1) + (i3111111110 ^ i3111111111);
                    break;
                default:
                    int i189 = a;
                    int i190 = (i189 & 23) + (i189 | 23);
                    b = i190 % 128;
                    int i191 = i190 % 2;
                    int i2111111111111111111111118 = i & (-82);
                    int i2111111111111111111111119 = (i | (-82)) & (~i2111111111111111111111118);
                    int i21111111111111111111111110 = i2111111111111111111111118 << 1;
                    int i21111111111111111111111111 = (i2111111111111111111111119 & i21111111111111111111111110) + (i2111111111111111111111119 | i21111111111111111111111110);
                    int i21111111111111111111111112 = i21111111111111111111111111 ^ 85;
                    int i3111111112 = ((i21111111111111111111111111 & 85) | i21111111111111111111111112) << 1;
                    int i3111111113 = -i21111111111111111111111112;
                    i = ((i3111111113 & i3111111112) << 1) + (i3111111112 ^ i3111111113);
                    break;
            }
        }
        int iHashCode2 = this.s.j(t).hashCode();
        int i192 = a;
        int i193 = ((i192 & (-80)) | ((~i192) & 79)) + ((i192 & 79) << 1);
        b = i193 % 128;
        int i194 = i193 % 2;
        int i195 = i2 * 53;
        int i196 = iHashCode2 & i195;
        int i197 = ((iHashCode2 ^ i195) | i196) << 1;
        int i198 = -((iHashCode2 | i195) & (~i196));
        int i199 = ((i197 | i198) << 1) - (i198 ^ i197);
        if (!this.j) {
            return i199;
        }
        int i200 = i192 + 33;
        b = i200 % 128;
        int i201 = i200 % 2 == 0 ? i199 >>> 64 : i199 * 53;
        int iHashCode3 = this.t.f(t).hashCode();
        int i202 = a;
        int i203 = i202 & 27;
        int i204 = ((((i202 ^ 27) | i203) << 1) - (~(-((~i203) & (i202 | 27))))) - 1;
        b = i204 % 128;
        int i205 = i204 % 2;
        int i206 = (i201 - (~(-(-iHashCode3)))) - 1;
        int i207 = (i202 ^ 21) + ((i202 & 21) << 1);
        b = i207 % 128;
        int i208 = i207 % 2;
        return i206;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0032  */
    /* JADX WARN: Code duplicated, block: B:234:0x09c0  */
    /* JADX WARN: Code duplicated, block: B:235:0x09d5  */
    /* JADX WARN: Code duplicated, block: B:238:0x09e9  */
    /* JADX WARN: Code duplicated, block: B:241:0x09f1  */
    /* JADX WARN: Code duplicated, block: B:242:0x09f3  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    public static <T> o000O000<T> m(ac acVar, ai aiVar, AbstractC0068y abstractC0068y, o00O00<?, ?> o00o00, o0OoOo0<?> o0oooo0, X x) {
        boolean z;
        int iCharAt;
        int i;
        char cCharAt;
        int iCharAt2;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        char cCharAt2;
        int i10;
        char cCharAt3;
        int i11;
        int i12;
        int i13;
        char cCharAt4;
        int i14;
        char cCharAt5;
        int i15;
        char cCharAt6;
        int i16;
        int i17;
        int i18;
        char cCharAt7;
        int i19;
        char cCharAt8;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int[] iArr2;
        int i25;
        int[] iArr3;
        int i26;
        String str;
        int iObjectFieldOffset;
        int i27;
        int iObjectFieldOffset2;
        int i28;
        Field fieldU;
        int i29;
        char cCharAt9;
        int i30;
        int i31;
        int i32;
        int i33;
        boolean z2;
        int i34;
        Field fieldU2;
        Field fieldU3;
        int i35;
        int i36;
        int i37;
        char cCharAt10;
        int i38;
        int i39;
        char cCharAt11;
        char cCharAt12;
        int i40;
        int i41;
        int i42;
        int i43;
        char cCharAt13;
        ac acVar2 = acVar;
        int i44 = 2 % 2;
        int i45 = a + 39;
        b = i45 % 128;
        int i46 = 1;
        if (i45 % 2 == 0) {
            int i47 = acVar2.f;
            int i48 = i47 ^ 1;
            int i49 = i47 & 1;
            if (((i49 & i48) | (i48 ^ i49)) == 1) {
                int i50 = a;
                int i51 = ((i50 | 23) << 1) - (i50 ^ 23);
                b = i51 % 128;
                int i52 = i51 % 2;
                z = false;
            } else {
                z = true;
            }
        } else if ((acVar2.f & 1) == 1) {
            int i53 = a;
            int i54 = ((i53 | 23) << 1) - (i53 ^ 23);
            b = i54 % 128;
            int i55 = i54 % 2;
            z = false;
        } else {
            z = true;
        }
        String str2 = acVar2.d;
        int length = str2.length();
        int i56 = a;
        int i57 = (i56 & 109) + (i56 | 109);
        b = i57 % 128;
        char c2 = 55296;
        if (i57 % 2 != 0 ? (iCharAt = str2.charAt(0)) < 55296 : (iCharAt = str2.charAt(1)) < 55296) {
            i = 1;
        } else {
            int i58 = b;
            int i59 = (i58 & (-90)) | ((~i58) & 89);
            int i60 = -(-((i58 & 89) << 1));
            int i61 = (i59 ^ i60) + ((i60 & i59) << 1);
            a = i61 % 128;
            int i62 = i61 % 2;
            int i63 = iCharAt & 8191;
            int i64 = 1;
            int i65 = 13;
            while (true) {
                i = (i64 & 1) + (i64 | 1);
                cCharAt = str2.charAt(i64);
                if (cCharAt < 55296) {
                    break;
                }
                int i66 = (cCharAt & 8191) << i65;
                int i67 = i63 & i66;
                int i68 = (i63 | i66) & (~i67);
                i63 = (i68 & i67) | (i68 ^ i67);
                int i69 = i65 & 13;
                int i70 = (i65 | 13) & (~i69);
                int i71 = i69 << 1;
                i65 = (i70 & i71) + (i71 | i70);
                i64 = i;
            }
            int i72 = cCharAt << i65;
            int i73 = ((~i72) & i63) | ((~i63) & i72);
            int i74 = i63 & i72;
            iCharAt = (i74 & i73) | (i73 ^ i74);
            int i75 = b;
            int i76 = ((i75 ^ 6) + ((i75 & 6) << 1)) - 1;
            a = i76 % 128;
            int i77 = i76 % 2;
        }
        int i78 = i + 1;
        int iCharAt3 = str2.charAt(i);
        if (iCharAt3 >= 55296) {
            int i79 = b;
            int i80 = i79 & 11;
            int i81 = (i80 - (~((i79 ^ 11) | i80))) - 1;
            a = i81 % 128;
            if (i81 % 2 != 0) {
                int i82 = (iCharAt3 & (-27575)) | ((~iCharAt3) & 27574);
                int i83 = iCharAt3 & 27574;
                i41 = (i83 & i82) | (i82 ^ i83);
                i42 = 0;
            } else {
                i41 = iCharAt3 & 8191;
                i42 = 13;
            }
            while (true) {
                int i84 = i78 ^ 1;
                int i85 = (i78 & 1) << 1;
                i43 = (i84 | i85) + (i84 & i85);
                cCharAt13 = str2.charAt(i78);
                if (cCharAt13 < 55296) {
                    break;
                }
                int i86 = (cCharAt13 & 8191) << i42;
                i41 = (i41 ^ i86) | (i86 & i41);
                int i87 = i42 & (-90);
                int i88 = (i42 ^ (-90)) | i87;
                int i89 = (i87 & i88) + (i87 | i88);
                int i90 = i89 | 103;
                int i91 = i90 << 1;
                int i92 = -(i90 & (~(i89 & 103)));
                i42 = (i91 ^ i92) + ((i92 & i91) << 1);
                i78 = i43;
            }
            int i93 = cCharAt13 << i42;
            int i94 = i41 & i93;
            int i95 = (i93 | i41) & (~i94);
            iCharAt3 = (i95 ^ i94) | (i95 & i94);
            int i96 = a + 55;
            b = i96 % 128;
            int i97 = i96 % 2;
            i78 = i43;
        }
        if (iCharAt3 == 0) {
            int i98 = a;
            int i99 = i98 ^ 11;
            int i100 = -(-((i98 & 11) << 1));
            int i101 = ((i99 | i100) << 1) - (i100 ^ i99);
            b = i101 % 128;
            int i102 = i101 % 2;
            iArr = c;
            int i103 = i98 & 87;
            int i104 = (~i103) & (i98 | 87);
            int i105 = -(-(i103 << 1));
            int i106 = (i104 ^ i105) + ((i104 & i105) << 1);
            b = i106 % 128;
            if (i106 % 2 == 0) {
                i8 = 1;
                i40 = 1;
            } else {
                i8 = 0;
                i40 = 0;
            }
            i2 = i40;
            i7 = 0;
            i6 = 0;
            iCharAt2 = 0;
            i5 = 0;
            i4 = 0;
        } else {
            int i107 = i78 | 1;
            int i108 = i107 << 1;
            int i109 = -(i107 & (~(i78 & 1)));
            int i110 = ((i108 | i109) << 1) - (i109 ^ i108);
            int iCharAt4 = str2.charAt(i78);
            if (iCharAt4 >= 55296) {
                int i111 = iCharAt4 & 8191;
                int i112 = a + 79;
                b = i112 % 128;
                int i113 = i112 % 2;
                int i114 = 13;
                while (true) {
                    i19 = i110 + 1;
                    cCharAt8 = str2.charAt(i110);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    int i115 = (cCharAt8 & 8191) << i114;
                    int i116 = ((~i111) & i115) | ((~i115) & i111);
                    int i117 = i111 & i115;
                    i111 = (i117 & i116) | (i116 ^ i117);
                    int i118 = ((i114 & 120) - (~(i114 | 120))) - 1;
                    i114 = (((i118 | (-106)) << 1) - (i118 ^ (-106))) - 1;
                    i110 = i19;
                }
                int i119 = cCharAt8 << i114;
                iCharAt4 = (i111 & i119) | (i111 ^ i119);
                i110 = i19;
            }
            int i120 = i110 ^ 1;
            int i121 = ((i110 & 1) | i120) << 1;
            int i122 = -i120;
            int i123 = ((i121 | i122) << 1) - (i122 ^ i121);
            int iCharAt5 = str2.charAt(i110);
            if (iCharAt5 >= 55296) {
                int i124 = iCharAt5 & 8191;
                int i125 = 13;
                while (true) {
                    int i126 = i123 & 1;
                    i18 = i126 + ((i123 ^ 1) | i126);
                    cCharAt7 = str2.charAt(i123);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    int i127 = a;
                    int i128 = (i127 & (-46)) | (45 & (~i127));
                    int i129 = (i127 & 45) << 1;
                    int i130 = (i128 ^ i129) + ((i128 & i129) << 1);
                    b = i130 % 128;
                    int i131 = i130 % 2;
                    int i132 = (cCharAt7 & 8191) << i125;
                    i124 = (i124 & i132) | (i124 ^ i132);
                    int i133 = i125 | 104;
                    int i134 = i133 << 1;
                    int i135 = -((~(i125 & 104)) & i133);
                    int i136 = (i134 & i135) + (i135 | i134);
                    int i137 = i136 & (-91);
                    int i138 = (i136 | (-91)) & (~i137);
                    int i139 = -(-(i137 << 1));
                    i125 = ((i139 & i138) << 1) + (i138 ^ i139);
                    i123 = i18;
                }
                int i140 = cCharAt7 << i125;
                int i141 = i124 ^ i140;
                int i142 = i124 & i140;
                iCharAt5 = (i142 & i141) | (i141 ^ i142);
                i123 = i18;
            }
            int i143 = (((i123 | 2) << 1) - (i123 ^ 2)) - 1;
            iCharAt2 = str2.charAt(i123);
            if (iCharAt2 >= 55296) {
                int i144 = iCharAt2 & 8191;
                int i145 = 13;
                while (true) {
                    i15 = (-2) - ((((i143 | 2) << 1) - (i143 ^ 2)) ^ (-1));
                    cCharAt6 = str2.charAt(i143);
                    if (cCharAt6 < c2) {
                        break;
                    }
                    int i146 = b;
                    int i147 = i146 & 49;
                    int i148 = (~i147) & (i146 | 49);
                    int i149 = i147 << 1;
                    int i150 = ((i148 | i149) << 1) - (i148 ^ i149);
                    a = i150 % 128;
                    if (i150 % 2 != 0) {
                        i16 = ((cCharAt6 & 17226) * i145) & i144;
                        int i151 = (i145 & (-31)) + (i145 | (-31));
                        i17 = (i151 & 96) + (i151 | 96);
                    } else {
                        int i152 = (cCharAt6 & 8191) << i145;
                        i16 = (i152 & i144) | (i144 ^ i152);
                        int i153 = i145 & 90;
                        int i154 = (((~i153) & (i145 | 90)) - (~(-(-(i153 << 1))))) - 1;
                        int i155 = i154 & (-77);
                        i17 = (((i154 | (-77)) & (~i155)) - (~(i155 << 1))) - 1;
                    }
                    i144 = i16;
                    i145 = i17;
                    i143 = i15;
                    c2 = 55296;
                }
                int i156 = cCharAt6 << i145;
                iCharAt2 = ((~i156) & i144) | ((~i144) & i156) | (i156 & i144);
                i143 = i15;
            }
            int i157 = i143 & 1;
            int i158 = i157 + ((i143 ^ 1) | i157);
            int iCharAt6 = str2.charAt(i143);
            int i159 = b;
            int i160 = (i159 & (-52)) | ((~i159) & 51);
            int i161 = -(-((i159 & 51) << 1));
            int i162 = (i160 & i161) + (i161 | i160);
            a = i162 % 128;
            int i163 = i162 % 2;
            if (iCharAt6 >= 55296) {
                int i164 = iCharAt6 & 8191;
                int i165 = 13;
                while (true) {
                    int i166 = i158 + 2;
                    i14 = (i166 << 1) + (i166 ^ (-1));
                    cCharAt5 = str2.charAt(i158);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    int i167 = a;
                    int i168 = i167 & 37;
                    int i169 = (((~i168) & (i167 | 37)) - (~(-(-(i168 << 1))))) - 1;
                    b = i169 % 128;
                    int i170 = i169 % 2 == 0 ? (cCharAt5 & 16439) % i165 : (cCharAt5 & 8191) << i165;
                    int i171 = i164 & i170;
                    int i172 = (i170 | i164) & (~i171);
                    i164 = (i172 ^ i171) | (i172 & i171);
                    int i173 = i165 | 120;
                    int i174 = (i173 << 1) - (i173 & (~(i165 & 120)));
                    i165 = (((i174 | (-106)) << 1) - (i174 ^ (-106))) - 1;
                    i158 = i14;
                }
                int i175 = cCharAt5 << i165;
                int i176 = ((~i175) & i164) | ((~i164) & i175);
                int i177 = i175 & i164;
                iCharAt6 = (i176 ^ i177) | (i177 & i176);
                int i178 = a;
                int i179 = i178 ^ 13;
                int i180 = ((i178 & 13) | i179) << 1;
                int i181 = -i179;
                int i182 = (i180 ^ i181) + ((i180 & i181) << 1);
                b = i182 % 128;
                if (i182 % 2 == 0) {
                    int i183 = 4 / 0;
                }
                i158 = i14;
            }
            int i184 = ((i158 | 1) << 1) - (i158 ^ 1);
            int iCharAt7 = str2.charAt(i158);
            if (iCharAt7 >= 55296) {
                int i185 = b;
                int i186 = (i185 ^ 43) + ((i185 & 43) << 1);
                a = i186 % 128;
                if (i186 % 2 != 0) {
                    int i187 = iCharAt7 & 19633;
                    i11 = ((iCharAt7 | 19633) & (~i187)) | i187;
                    i12 = 34;
                } else {
                    i11 = iCharAt7 & 8191;
                    i12 = 13;
                }
                while (true) {
                    i13 = i184 + 1;
                    cCharAt4 = str2.charAt(i184);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    int i188 = (cCharAt4 & 8191) << i12;
                    int i189 = i11 ^ i188;
                    int i190 = i11 & i188;
                    i11 = (i190 & i189) | (i189 ^ i190);
                    int i191 = ((i12 ^ 133) + ((i12 & 133) << 1)) - 1;
                    int i192 = i191 & (-119);
                    i12 = ((((i191 ^ (-119)) | i192) << 1) - (~(-((i191 | (-119)) & (~i192))))) - 1;
                    i184 = i13;
                }
                int i193 = cCharAt4 << i12;
                int i194 = i11 & i193;
                int i195 = (i11 | i193) & (~i194);
                iCharAt7 = (i195 & i194) | (i195 ^ i194);
                int i196 = b;
                int i197 = ((i196 | 67) << 1) - (i196 ^ 67);
                a = i197 % 128;
                int i198 = i197 % 2;
                i184 = i13;
            }
            int i199 = i184 & 1;
            int i200 = (i184 ^ 1) | i199;
            int i201 = (i199 & i200) + (i199 | i200);
            char cCharAt14 = str2.charAt(i184);
            if (cCharAt14 >= 55296) {
                int i202 = cCharAt14 & 8191;
                int i203 = b;
                int i204 = i203 & 43;
                int i205 = ((i203 ^ 43) | i204) << 1;
                int i206 = -((i203 | 43) & (~i204));
                int i207 = (i205 ^ i206) + ((i206 & i205) << 1);
                a = i207 % 128;
                int i208 = i207 % 2;
                int i209 = 13;
                while (true) {
                    i10 = (i201 ^ 1) + ((i201 & 1) << i46);
                    cCharAt3 = str2.charAt(i201);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    int i210 = b;
                    int i211 = i210 & 107;
                    int i212 = iCharAt7;
                    int i213 = (~i211) & (i210 | 107);
                    int i214 = -(-(i211 << 1));
                    int i215 = (i213 & i214) + (i213 | i214);
                    a = i215 % 128;
                    int i216 = i215 % 2 != 0 ? (cCharAt3 & 5183) * i209 : (cCharAt3 & 8191) << i209;
                    int i217 = i202 & i216;
                    int i218 = (i216 | i202) & (~i217);
                    i202 = (i218 ^ i217) | (i218 & i217);
                    int i219 = (i209 | 30) << 1;
                    int i220 = -(((~i209) & 30) | (i209 & (-31)));
                    int i221 = ((i219 | i220) << 1) - (i219 ^ i220);
                    int i222 = (i221 & 16) | ((~i221) & (-17));
                    int i223 = -(-((i221 & (-17)) << 1));
                    i209 = (i222 & i223) + (i222 | i223);
                    i201 = i10;
                    iCharAt7 = i212;
                    i46 = 1;
                }
                i2 = iCharAt7;
                int i224 = cCharAt3 << i209;
                i3 = (i224 & i202) | (i202 ^ i224);
                int i225 = b;
                int i226 = i225 | 63;
                int i227 = i226 << 1;
                int i228 = -((~(i225 & 63)) & i226);
                int i229 = (i227 ^ i228) + ((i228 & i227) << 1);
                a = i229 % 128;
                int i230 = i229 % 2;
                i201 = i10;
            } else {
                i2 = iCharAt7;
                i3 = cCharAt14;
            }
            int i231 = i201 ^ 1;
            int i232 = -(-((i201 & 1) << 1));
            int i233 = ((i231 | i232) << 1) - (i231 ^ i232);
            int iCharAt8 = str2.charAt(i201);
            char c3 = 55296;
            if (iCharAt8 >= 55296) {
                int i234 = iCharAt8 & 8191;
                int i235 = 13;
                while (true) {
                    i9 = i233 + 1;
                    cCharAt2 = str2.charAt(i233);
                    if (cCharAt2 < c3) {
                        break;
                    }
                    int i236 = (cCharAt2 & 8191) << i235;
                    int i237 = i234 ^ i236;
                    int i238 = i234 & i236;
                    i234 = (i238 & i237) | (i237 ^ i238);
                    int i239 = i235 & 32;
                    int i240 = (((i235 | 32) & (~i239)) - (~(-(-(i239 << 1))))) - 1;
                    i235 = ((i240 & (-18)) + (i240 | (-18))) - 1;
                    i233 = i9;
                    c3 = 55296;
                }
                int i241 = cCharAt2 << i235;
                int i242 = ((~i241) & i234) | ((~i234) & i241);
                int i243 = i234 & i241;
                iCharAt8 = (i243 & i242) | (i242 ^ i243);
                i233 = i9;
            }
            i78 = ((i233 | 1) << 1) - (i233 ^ 1);
            int iCharAt9 = str2.charAt(i233);
            if (iCharAt9 >= 55296) {
                int i244 = a;
                int i245 = ((i244 ^ 63) | (i244 & 63)) << 1;
                int i246 = -((i244 & (-64)) | (63 & (~i244)));
                int i247 = ((i245 | i246) << 1) - (i246 ^ i245);
                b = i247 % 128;
                int i248 = i247 % 2 == 0 ? (iCharAt9 | 5701) & (~(iCharAt9 & 5701)) : iCharAt9 & 8191;
                int i249 = 13;
                while (true) {
                    int i250 = ((i78 & 2) + (i78 | 2)) - 1;
                    char cCharAt15 = str2.charAt(i78);
                    int i251 = b;
                    int i252 = (i251 ^ 51) + ((i251 & 51) << 1);
                    i4 = iCharAt6;
                    a = i252 % 128;
                    if (i252 % 2 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (cCharAt15 < 55296) {
                        int i253 = cCharAt15 << i249;
                        iCharAt9 = (i248 ^ i253) | (i253 & i248);
                        i78 = i250;
                        break;
                    }
                    int i254 = (cCharAt15 & 8191) << i249;
                    i248 = ((~i254) & i248) | ((~i248) & i254) | (i254 & i248);
                    int i255 = i249 & 13;
                    int i256 = ((i249 ^ 13) | i255) << 1;
                    int i257 = -((~i255) & (i249 | 13));
                    i249 = (i256 ^ i257) + ((i256 & i257) << 1);
                    i78 = i250;
                    iCharAt6 = i4;
                }
            } else {
                i4 = iCharAt6;
            }
            int i258 = (iCharAt9 - (~(-(~(-(-i3)))))) - 2;
            int i259 = ((i258 ^ iCharAt8) | (i258 & iCharAt8)) << 1;
            int i260 = -((iCharAt8 & (~i258)) | ((~iCharAt8) & i258));
            int[] iArr4 = new int[(i259 & i260) + (i260 | i259)];
            int i261 = iCharAt4 * 2;
            int i262 = -(-iCharAt5);
            int i263 = i261 & i262;
            int i264 = ((i261 ^ i262) | i263) << 1;
            int i265 = -((i262 | i261) & (~i263));
            int i266 = ((i264 | i265) << 1) - (i265 ^ i264);
            int i267 = b;
            int i268 = i267 & 67;
            int i269 = i267 | 67;
            int i270 = (i268 ^ i269) + ((i269 & i268) << 1);
            a = i270 % 128;
            if (i270 % 2 != 0) {
                throw null;
            }
            iArr = iArr4;
            i5 = iCharAt9;
            i6 = i3;
            i7 = iCharAt4;
            i8 = i266;
        }
        Unsafe unsafe = d;
        Object[] objArr = acVar2.e;
        Class<?> cls = acVar2.c.getClass();
        int[] iArr5 = new int[i2 * 3];
        int i271 = i8;
        int i272 = a;
        int i273 = i272 | 109;
        int i274 = i273 << 1;
        int i275 = i78;
        int i276 = -((~(i272 & 109)) & i273);
        int i277 = (i274 ^ i276) + ((i274 & i276) << 1);
        boolean z3 = z;
        b = i277 % 128;
        if (i277 % 2 == 0) {
            int i278 = (i2 & 5) + (i2 | 5);
            i20 = (i278 ^ (-1)) + (i278 << 1);
        } else {
            i20 = i2 * 2;
        }
        Object[] objArr2 = new Object[i20];
        int i279 = (i5 - (~i6)) - 1;
        int i280 = ((i272 ^ 101) | (i272 & 101)) << 1;
        int i281 = -((i272 & (-102)) | (101 & (~i272)));
        int i282 = ((i280 | i281) << 1) - (i281 ^ i280);
        b = i282 % 128;
        int i283 = i282 % 2 == 0 ? 1 : 0;
        int i284 = i279;
        int i285 = i271;
        int i286 = i275;
        int i287 = 0;
        int i288 = i5;
        while (i286 < length) {
            int i289 = length;
            int i290 = i5;
            int i291 = (((i286 & (-2)) | ((~i286) & 1)) - (~((i286 & 1) << 1))) - 1;
            int iCharAt10 = str2.charAt(i286);
            if (iCharAt10 >= 55296) {
                int i292 = a;
                int i293 = (i292 & 36) + (i292 | 36);
                int i294 = (i293 ^ (-1)) + (i293 << 1);
                b = i294 % 128;
                int i295 = i294 % 2;
                int i296 = iCharAt10 & 8191;
                int i297 = i291;
                int i298 = 13;
                while (true) {
                    i21 = (-2) - ((i297 + 2) ^ (-1));
                    cCharAt12 = str2.charAt(i297);
                    i22 = iCharAt2;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    int i299 = (cCharAt12 & 8191) << i298;
                    int i300 = i296 & i299;
                    int i301 = (~i300) & (i296 | i299);
                    i296 = (i301 ^ i300) | (i301 & i300);
                    i298 = ((i298 & 14) + (i298 | 14)) - 1;
                    i297 = i21;
                    iCharAt2 = i22;
                }
                int i302 = cCharAt12 << i298;
                int i303 = i296 & i302;
                int i304 = (i302 | i296) & (~i303);
                iCharAt10 = (i304 ^ i303) | (i304 & i303);
            } else {
                i21 = i291;
                i22 = iCharAt2;
                int i305 = b;
                int i306 = i305 & 101;
                int i307 = i306 + ((i305 ^ 101) | i306);
                a = i307 % 128;
                int i308 = i307 % 2;
            }
            int i309 = i21;
            int i310 = i309 & 1;
            int i311 = (~i310) & (i309 | 1);
            int i312 = i310 << 1;
            int i313 = (i311 ^ i312) + ((i312 & i311) << 1);
            int iCharAt11 = str2.charAt(i309);
            if (iCharAt11 >= 55296) {
                int i314 = a;
                int i315 = i314 + 43;
                b = i315 % 128;
                if (i315 % 2 == 0) {
                    i38 = ((~iCharAt11) & 14659) | (iCharAt11 & (-14660));
                    i39 = 12;
                } else {
                    i38 = iCharAt11 & 8191;
                    i39 = 13;
                }
                int i316 = (i314 | 105) << 1;
                int i317 = -((i314 & (-106)) | (105 & (~i314)));
                int i318 = (i316 & i317) + (i317 | i316);
                b = i318 % 128;
                int i319 = i318 % 2;
                int i320 = i313;
                while (true) {
                    i313 = i320 + 1;
                    cCharAt11 = str2.charAt(i320);
                    int i321 = a + 79;
                    i23 = iCharAt10;
                    b = i321 % 128;
                    if (i321 % 2 != 0) {
                        if (cCharAt11 < 55296) {
                            break;
                        }
                        int i322 = (cCharAt11 & 8191) << i39;
                        int i323 = ((~i322) & i38) | ((~i38) & i322);
                        int i324 = i38 & i322;
                        i38 = (i324 & i323) | (i323 ^ i324);
                        int i325 = i39 + 14;
                        i39 = (i325 << 1) + (i325 ^ (-1));
                        i320 = i313;
                        iCharAt10 = i23;
                    } else {
                        int i326 = 28 / 0;
                        if (cCharAt11 < 55296) {
                            break;
                        }
                        int i327 = (cCharAt11 & 8191) << i39;
                        int i328 = ((~i327) & i38) | ((~i38) & i327);
                        int i329 = i38 & i327;
                        i38 = (i329 & i328) | (i328 ^ i329);
                        int i3210 = i39 + 14;
                        i39 = (i3210 << 1) + (i3210 ^ (-1));
                        i320 = i313;
                        iCharAt10 = i23;
                    }
                }
                int i330 = cCharAt11 << i39;
                int i331 = ((~i330) & i38) | ((~i38) & i330);
                int i332 = i38 & i330;
                iCharAt11 = (i332 & i331) | (i331 ^ i332);
            } else {
                i23 = iCharAt10;
            }
            i286 = i313;
            int i333 = iCharAt11 & 255;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i283] = i287;
                i283 = ((i283 & 2) + (i283 | 2)) - 1;
            }
            if (i333 >= 51) {
                int i334 = a;
                int i335 = (i334 & 7) + (i334 | 7);
                b = i335 % 128;
                int i336 = i335 % 2;
                int i337 = (i286 ^ 1) + ((i286 & 1) << 1);
                int iCharAt12 = str2.charAt(i286);
                if (iCharAt12 >= 55296) {
                    int i338 = b;
                    int i339 = (i338 & (-84)) | (83 & (~i338));
                    int i340 = -(-((i338 & 83) << 1));
                    int i341 = (i339 ^ i340) + ((i339 & i340) << 1);
                    a = i341 % 128;
                    if (i341 % 2 != 0) {
                        i35 = ((~iCharAt12) & 18986) | (iCharAt12 & (-18987));
                        i36 = 114;
                    } else {
                        i35 = iCharAt12 & 8191;
                        i36 = 13;
                    }
                    int i342 = i36;
                    int i343 = i337;
                    while (true) {
                        i24 = i283;
                        int i344 = (i343 & (-2)) | ((~i343) & 1);
                        iArr2 = iArr5;
                        int i345 = -(-((i343 & 1) << 1));
                        i37 = (i344 & i345) + (i344 | i345);
                        cCharAt10 = str2.charAt(i343);
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        int i346 = (cCharAt10 & 8191) << i342;
                        int i347 = ((~i35) & i346) | ((~i346) & i35);
                        int i348 = i35 & i346;
                        i35 = (i348 & i347) | (i347 ^ i348);
                        int i349 = ((i342 | 92) << 1) - ((i342 & (-93)) | ((~i342) & 92));
                        int i350 = i349 ^ (-79);
                        int i351 = (i349 & (-79)) << 1;
                        i342 = (i350 ^ i351) + ((i351 & i350) << 1);
                        i343 = i37;
                        i283 = i24;
                        iArr5 = iArr2;
                    }
                    int i352 = cCharAt10 << i342;
                    int i353 = i35 & i352;
                    int i354 = (i35 | i352) & (~i353);
                    iCharAt12 = (i354 & i353) | (i354 ^ i353);
                    int i355 = a;
                    int i356 = ((i355 ^ 25) | (i355 & 25)) << 1;
                    int i357 = -(((~i355) & 25) | (i355 & (-26)));
                    int i358 = ((i356 | i357) << 1) - (i357 ^ i356);
                    b = i358 % 128;
                    int i359 = i358 % 2;
                    i337 = i37;
                } else {
                    i24 = i283;
                    iArr2 = iArr5;
                }
                int i360 = i333 - 51;
                if (i360 == 9 || i360 == 17) {
                    int i361 = (i287 / 3) * 2;
                    int i362 = ((i361 | 1) << 1) - (i361 ^ 1);
                    int i363 = b;
                    int i364 = i363 ^ 15;
                    int i365 = ((((i363 & 15) | i364) << 1) - (~(-i364))) - 1;
                    a = i365 % 128;
                    int i366 = i365 % 2;
                    objArr2[i362] = objArr[i285];
                    z2 = true;
                    int i367 = ((i285 ^ 13) - (~((i285 & 13) << 1))) - 1;
                    int i368 = i367 & (-12);
                    int i369 = ((i367 ^ (-12)) | i368) << 1;
                    int i370 = -((i367 | (-12)) & (~i368));
                    i285 = ((i369 & i370) << 1) + (i369 ^ i370);
                    i34 = 2;
                } else {
                    int i371 = b;
                    int i372 = ((i371 & 15) - (~(i371 | 15))) - 1;
                    a = i372 % 128;
                    if (i372 % 2 == 0 ? i360 == 12 : i360 == 125) {
                        if ((iCharAt & 1) == 1) {
                            objArr2[((i287 / 3) * 2) + 1] = objArr[i285];
                            int i373 = i285 ^ 1;
                            int i374 = ((i285 & 1) | i373) << 1;
                            int i375 = -i373;
                            i285 = ((i374 | i375) << 1) - (i374 ^ i375);
                        }
                    }
                    i34 = 2;
                    z2 = true;
                }
                int i376 = iCharAt12 * i34;
                Object obj2 = objArr[i376];
                if ((obj2 instanceof Field) != z2) {
                    fieldU2 = u(cls, (String) obj2);
                    int i377 = b;
                    int i378 = (i377 & 25) + (i377 | 25);
                    a = i378 % 128;
                    if (i378 % 2 != 0) {
                        objArr[i376] = fieldU2;
                        int i379 = 27 / 0;
                    } else {
                        objArr[i376] = fieldU2;
                    }
                } else {
                    fieldU2 = (Field) obj2;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldU2);
                int i380 = (i376 | 126) << 1;
                int i381 = -(i376 ^ 126);
                int i382 = ((i380 | i381) << 1) - (i381 ^ i380);
                int i383 = ((i382 ^ (-125)) | (i382 & (-125))) << 1;
                int i384 = -(((-125) & (~i382)) | (i382 & 124));
                int i385 = (i383 & i384) + (i384 | i383);
                Object obj3 = objArr[i385];
                int i386 = i285;
                if (!(obj3 instanceof Field)) {
                    fieldU3 = u(cls, (String) obj3);
                    objArr[i385] = fieldU3;
                } else {
                    fieldU3 = (Field) obj3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldU3);
                str = str2;
                i286 = i337;
                i28 = iObjectFieldOffset3;
                iArr3 = iArr;
                i25 = i386;
                i27 = 0;
            } else {
                i24 = i283;
                iArr2 = iArr5;
                i25 = ((i285 | 1) << 1) - (i285 ^ 1);
                Field fieldU4 = u(cls, (String) objArr[i285]);
                if (i333 == 9 || i333 == 17) {
                    iArr3 = iArr;
                    int i387 = (i287 / 3) * 2;
                    int i388 = (i387 & 2) + (i387 | 2);
                    i26 = 1;
                    objArr2[i388 - 1] = fieldU4.getType();
                } else if (i333 != 27) {
                    int i389 = a;
                    int i390 = i389 & 107;
                    int i391 = ((i389 | 107) & (~i390)) + (i390 << 1);
                    int i392 = i391 % 128;
                    b = i392;
                    int i393 = i391 % 2;
                    if (i333 == 49) {
                        iArr3 = iArr;
                        i30 = 1;
                    } else if (i333 != 12) {
                        int i394 = i392 & 107;
                        int i395 = -(-((i392 ^ 107) | i394));
                        int i396 = ((i394 | i395) << 1) - (i394 ^ i395);
                        int i397 = i396 % 128;
                        a = i397;
                        int i398 = i396 % 2;
                        if (i333 == 30 || i333 == 44) {
                            iArr3 = iArr;
                            i30 = 1;
                            if ((iCharAt & 1) == 1) {
                                i26 = 1;
                            }
                        } else if (i333 == 50) {
                            int i399 = (i397 & 83) + (i397 | 83);
                            b = i399 % 128;
                            if (i399 % 2 == 0) {
                                iArr[i288] = i287;
                                i31 = ((i287 & (-2)) + (i287 | (-2))) * 3;
                            } else {
                                iArr[i288] = i287;
                                i31 = (i287 / 3) * 2;
                            }
                            int i400 = i397 ^ 37;
                            int i401 = (i400 | (i397 & 37)) << 1;
                            int i402 = -i400;
                            int i403 = ((i401 | i402) << 1) - (i401 ^ i402);
                            iArr3 = iArr;
                            b = i403 % 128;
                            int i404 = i403 % 2;
                            int i405 = ((i25 ^ 2) + ((i25 & 2) << 1)) - 1;
                            Object obj4 = objArr[i25];
                            int i406 = i397 & 31;
                            int i407 = (i397 ^ 31) | i406;
                            int i408 = ((i406 | i407) << 1) - (i407 ^ i406);
                            b = i408 % 128;
                            if (i408 % 2 == 0) {
                                objArr2[i31] = obj4;
                                int i409 = (iCharAt11 & (-14073)) | ((~iCharAt11) & 14072);
                                int i410 = iCharAt11 & 14072;
                                if (((i409 & i410) | (i409 ^ i410)) != 0) {
                                    int i411 = i405 & 1;
                                    int i412 = -(-((i405 ^ 1) | i411));
                                    objArr2[i31 + 1] = objArr[i405];
                                    i25 = (i411 ^ i412) + ((i411 & i412) << 1);
                                } else {
                                    i25 = i405;
                                }
                            } else {
                                objArr2[i31] = obj4;
                                if ((iCharAt11 & 2048) != 0) {
                                    int i413 = i405 & 1;
                                    int i414 = -(-((i405 ^ 1) | i413));
                                    objArr2[i31 + 1] = objArr[i405];
                                    i25 = (i413 ^ i414) + ((i413 & i414) << 1);
                                } else {
                                    i25 = i405;
                                }
                            }
                            int i415 = i288 & 1;
                            int i416 = (~i415) & (i288 | 1);
                            int i417 = i415 << 1;
                            int i418 = (i416 & i417) + (i417 | i416);
                            i26 = 1;
                            i288 = i418;
                        } else {
                            iArr3 = iArr;
                            i26 = 1;
                        }
                    } else {
                        iArr3 = iArr;
                        i30 = 1;
                        if ((iCharAt & 1) == 1) {
                            i26 = 1;
                        }
                    }
                    int i419 = (i25 & (-2)) | ((~i25) & i30);
                    int i420 = -(-((i25 & 1) << i30));
                    objArr2[((i287 / 3) * 2) + 1] = objArr[i25];
                    i25 = ((i419 | i420) << 1) - (i419 ^ i420);
                    i26 = 1;
                } else {
                    iArr3 = iArr;
                    i30 = 1;
                    int i4110 = (i25 & (-2)) | ((~i25) & i30);
                    int i421 = -(-((i25 & 1) << i30));
                    objArr2[((i287 / 3) * 2) + 1] = objArr[i25];
                    i25 = ((i4110 | i421) << 1) - (i4110 ^ i421);
                    i26 = 1;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldU4);
                if ((iCharAt & 1) != i26 || i333 > 17) {
                    str = str2;
                    iObjectFieldOffset = 0;
                    i27 = 0;
                } else {
                    int i422 = ((i286 & 2) + (i286 | 2)) - i26;
                    int iCharAt13 = str2.charAt(i286);
                    if (iCharAt13 >= 55296) {
                        int i423 = b;
                        int i424 = i423 & 27;
                        int i425 = -(-((i423 ^ 27) | i424));
                        int i426 = (i424 & i425) + (i425 | i424);
                        int i427 = i426 % 128;
                        a = i427;
                        int i428 = i426 % 2;
                        int i429 = iCharAt13 & 8191;
                        int i430 = i427 & 43;
                        int i431 = -(-((i427 ^ 43) | i430));
                        int i432 = (i430 & i431) + (i431 | i430);
                        b = i432 % 128;
                        int i433 = i432 % 2;
                        int i434 = 13;
                        while (true) {
                            int i435 = (i422 & 2) + (i422 | 2);
                            i29 = (i435 << 1) + (i435 ^ (-1));
                            cCharAt9 = str2.charAt(i422);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            int i436 = a;
                            int i437 = i436 & 47;
                            int i438 = i437 + ((i436 ^ 47) | i437);
                            String str3 = str2;
                            b = i438 % 128;
                            int i439 = i438 % 2;
                            int i440 = (cCharAt9 & 8191) << i434;
                            i429 = ((~i440) & i429) | ((~i429) & i440) | (i440 & i429);
                            i434 = ((i434 ^ 14) + ((i434 & 14) << 1)) - 1;
                            i422 = i29;
                            str2 = str3;
                        }
                        str = str2;
                        int i441 = cCharAt9 << i434;
                        iCharAt13 = (i429 ^ i441) | (i441 & i429);
                        i422 = i29;
                    } else {
                        str = str2;
                    }
                    int i442 = iCharAt13 / 32;
                    int i443 = i7 * 2;
                    int i444 = i442 & i443;
                    int i445 = i444 + ((i442 ^ i443) | i444);
                    int i446 = a;
                    int i447 = (i446 & 111) + (i446 | 111);
                    b = i447 % 128;
                    int i448 = i447 % 2;
                    Object obj5 = objArr[i445];
                    if (!(!(obj5 instanceof Field))) {
                        fieldU = (Field) obj5;
                    } else {
                        fieldU = u(cls, (String) obj5);
                        objArr[i445] = fieldU;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldU);
                    i27 = iCharAt13 % 32;
                    i286 = i422;
                }
                if (i333 >= 18 && i333 <= 49) {
                    iArr3[i284] = iObjectFieldOffset4;
                    i284++;
                }
                int i449 = a;
                int i450 = ((i449 ^ 107) - (~(-(-((i449 & 107) << 1))))) - 1;
                b = i450 % 128;
                int i451 = i450 % 2;
                iObjectFieldOffset2 = iObjectFieldOffset;
                i28 = iObjectFieldOffset4;
            }
            int i452 = i287 + 1;
            iArr2[i287] = i23;
            int i453 = i287 + 3;
            int i454 = (i453 ^ (-1)) + (i453 << 1);
            if ((iCharAt11 & 512) != 0) {
                int i455 = a;
                int i456 = i455 & 1;
                int i457 = i455 | 1;
                int i458 = (i456 ^ i457) + ((i456 & i457) << 1);
                b = i458 % 128;
                if (i458 % 2 == 0) {
                    throw null;
                }
                i32 = 536870912;
            } else {
                i32 = 0;
            }
            if ((iCharAt11 & 256) != 0) {
                int i459 = b;
                int i460 = i459 & 13;
                int i461 = (i459 ^ 13) | i460;
                int i462 = (i460 ^ i461) + ((i461 & i460) << 1);
                a = i462 % 128;
                int i463 = i462 % 2;
                i33 = SQLiteDatabase.CREATE_IF_NECESSARY;
            } else {
                i33 = 0;
            }
            int i464 = i33 ^ i32;
            int i465 = i333 << 20;
            int i466 = ((~i464) & i465) | ((~i465) & i464);
            int i467 = i466 & i28;
            int i468 = (i466 | i28) & (~i467);
            iArr2[i452] = (i468 & i467) | (i468 ^ i467);
            int i469 = i454 & 1;
            i287 = (i469 - (~(-(-((i454 ^ 1) | i469))))) - 1;
            int i470 = a;
            int i471 = i470 & 37;
            int i472 = i470 | 37;
            int i473 = (i471 ^ i472) + ((i472 & i471) << 1);
            int i474 = i473 % 128;
            b = i474;
            int i475 = i473 % 2;
            int i476 = i27 << 20;
            iArr2[i454] = (i476 & iObjectFieldOffset2) | (iObjectFieldOffset2 ^ i476);
            int i477 = (-2) - ((i474 + 104) ^ (-1));
            a = i477 % 128;
            if (i477 % 2 != 0) {
                int i478 = 33 / 0;
            }
            acVar2 = acVar;
            i285 = i25;
            str2 = str;
            i7 = i7;
            length = i289;
            i5 = i290;
            iCharAt2 = i22;
            iArr = iArr3;
            i283 = i24;
            iArr5 = iArr2;
        }
        return new ad(iArr5, objArr2, iCharAt2, i4, acVar2.c, z3, false, iArr, i5, i279, aiVar, abstractC0068y, o00o00, o0oooo0, x);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:141:0x03df  */
    /* JADX WARN: Code duplicated, block: B:326:0x03be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:328:0x03ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:329:0x03e3 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x02b2, code lost:
    
        r13.add(ivas.gov.bisp.enumeration.aD.AbstractC0069z.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02b8, code lost:
    
        r13.add(ivas.gov.bisp.enumeration.aD.AbstractC0069z.e(r21, r1, r4));
        r6 = ivas.gov.bisp.enumeration.aD.ad.b;
        r8 = ((r6 ^ 44) + ((r6 & 44) << 1)) - 1;
        ivas.gov.bisp.enumeration.aD.ad.a = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02d3, code lost:
    
        throw ivas.gov.bisp.enumeration.aD.C0065v.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02d8, code lost:
    
        throw ivas.gov.bisp.enumeration.aD.C0065v.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02dd, code lost:
    
        throw ivas.gov.bisp.enumeration.aD.C0065v.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x041b, code lost:
    
        if (r4 >= 0) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x041e, code lost:
    
        if (r4 >= 0) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0420, code lost:
    
        if (r4 != 0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0422, code lost:
    
        r13.add(net.sqlcipher.BuildConfig.FLAVOR);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0426, code lost:
    
        r8 = ((r1 & r4) - (~(r1 | r4))) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0431, code lost:
    
        if (ivas.gov.bisp.enumeration.aD.as.f(r21, r1, r8) == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0433, code lost:
    
        r9 = new java.lang.String(r21, r1, r4, ivas.gov.bisp.enumeration.aD.R.c);
        r1 = ivas.gov.bisp.enumeration.aD.ad.b;
        r4 = (r1 & 123) + (r1 | 123);
        ivas.gov.bisp.enumeration.aD.ad.a = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0447, code lost:
    
        if ((r4 % 2) == 0) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0449, code lost:
    
        r13.add(r9);
        r1 = 57 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0450, code lost:
    
        r13.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0453, code lost:
    
        r1 = ivas.gov.bisp.enumeration.aD.ad.b;
        r4 = (((r1 & (-40)) | ((~r1) & 39)) - (~(-(-((r1 & 39) << 1))))) - 1;
        ivas.gov.bisp.enumeration.aD.ad.a = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0469, code lost:
    
        r1 = ivas.gov.bisp.enumeration.aD.ad.b;
        r4 = r1 & 105;
        r1 = (r1 ^ 105) | r4;
        r9 = ((r4 | r1) << 1) - (r1 ^ r4);
        ivas.gov.bisp.enumeration.aD.ad.a = r9 % 128;
        r9 = r9 % 2;
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x047c, code lost:
    
        if (r1 >= r23) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x047e, code lost:
    
        r4 = ivas.gov.bisp.enumeration.aD.C0049e.v(r21, r1, r33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0484, code lost:
    
        if (r24 == r33.a) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0488, code lost:
    
        r1 = ivas.gov.bisp.enumeration.aD.C0049e.v(r21, r4, r33);
        r4 = r33.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x048e, code lost:
    
        if (r4 < 0) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0490, code lost:
    
        r8 = ivas.gov.bisp.enumeration.aD.ad.a;
        r9 = r8 & 19;
        r8 = (r8 | 19) & (~r9);
        r9 = r9 << 1;
        r10 = ((r8 | r9) << 1) - (r8 ^ r9);
        ivas.gov.bisp.enumeration.aD.ad.b = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x04a4, code lost:
    
        if ((r10 % 2) == 0) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x04a6, code lost:
    
        if (r4 != 0) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x04a8, code lost:
    
        r13.add(net.sqlcipher.BuildConfig.FLAVOR);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x04ac, code lost:
    
        r8 = (r1 - (~r4)) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x04b4, code lost:
    
        if (ivas.gov.bisp.enumeration.aD.as.f(r21, r1, r8) == false) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x04b6, code lost:
    
        r9 = new java.lang.String(r21, r1, r4, ivas.gov.bisp.enumeration.aD.R.c);
        r1 = ivas.gov.bisp.enumeration.aD.ad.b;
        r4 = r1 | 33;
        r10 = r4 << 1;
        r1 = -((~(r1 & 33)) & r4);
        r4 = ((r10 | r1) << 1) - (r1 ^ r10);
        ivas.gov.bisp.enumeration.aD.ad.a = r4 % 128;
        r4 = r4 % 2;
        r13.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x04db, code lost:
    
        throw ivas.gov.bisp.enumeration.aD.C0065v.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x04dc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x04e1, code lost:
    
        throw ivas.gov.bisp.enumeration.aD.C0065v.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x04e6, code lost:
    
        throw ivas.gov.bisp.enumeration.aD.C0065v.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x04eb, code lost:
    
        throw ivas.gov.bisp.enumeration.aD.C0065v.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0272, code lost:
    
        r1 = ((((~r4) & r1) | ((~r1) & r4)) - (~(-(-((r1 & r4) << 1))))) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x047c, code lost:
    
        r1 = ivas.gov.bisp.enumeration.aD.ad.b;
        r4 = r1 & 105;
        r1 = (r1 ^ 105) | r4;
        r9 = ((r4 | r1) << 1) - (r1 ^ r4);
        ivas.gov.bisp.enumeration.aD.ad.a = r9 % 128;
        r9 = r9 % 2;
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0241, code lost:
    
        if (r4 <= (r21.length >>> r1)) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0254, code lost:
    
        if (r4 <= ((r9 & r6) + (r6 | r9))) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0256, code lost:
    
        if (r4 != 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0258, code lost:
    
        r13.add(ivas.gov.bisp.enumeration.aD.AbstractC0069z.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x025e, code lost:
    
        r13.add(ivas.gov.bisp.enumeration.aD.AbstractC0069z.e(r21, r1, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0265, code lost:
    
        r1 = ((((~r4) & r1) | ((~r1) & r4)) - (~(-(-((r1 & r4) << 1))))) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0272, code lost:
    
        if (r1 >= r23) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0274, code lost:
    
        r4 = ivas.gov.bisp.enumeration.aD.C0049e.v(r21, r1, r33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x027a, code lost:
    
        if (r24 == r33.a) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x027c, code lost:
    
        r2 = ivas.gov.bisp.enumeration.aD.ad.b;
        r3 = ((r2 | 47) << 1) - (r2 ^ 47);
        ivas.gov.bisp.enumeration.aD.ad.a = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x028c, code lost:
    
        r1 = ivas.gov.bisp.enumeration.aD.C0049e.v(r21, r4, r33);
        r4 = r33.a;
        r6 = ivas.gov.bisp.enumeration.aD.ad.a;
        r8 = (r6 & 79) + (r6 | 79);
        ivas.gov.bisp.enumeration.aD.ad.b = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x029f, code lost:
    
        if ((r8 % 2) != 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02a1, code lost:
    
        r6 = 65 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02a3, code lost:
    
        if (r4 < 0) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02a6, code lost:
    
        if (r4 < 0) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02a8, code lost:
    
        r6 = r21.length;
        r8 = -r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02ae, code lost:
    
        if (r4 > ((r6 & r8) + (r6 | r8))) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02b0, code lost:
    
        if (r4 != 0) goto L314;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int Y(T r20, byte[] r21, int r22, int r23, int r24, int r25, int r26, int r27, long r28, int r30, long r31, ivas.gov.bisp.enumeration.aD.C0049e.biK r33) throws ivas.gov.bisp.enumeration.aD.C0065v {
        /*
            Method dump skipped, instruction units count: 2044
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.ad.Y(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, ivas.gov.bisp.enumeration.aD.e$biK):int");
    }

    /* JADX WARN: Code duplicated, block: B:169:0x0525 A[PHI: r9
  0x0525: PHI (r9v68 int) = (r9v67 int), (r9v69 int) binds: [B:168:0x0523, B:165:0x051c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:171:0x0534  */
    /* JADX WARN: Code duplicated, block: B:174:0x053c  */
    /* JADX WARN: Code duplicated, block: B:176:0x0540  */
    /* JADX WARN: Multi-variable type inference failed */
    public final int L(T t) {
        int i;
        int iBA;
        int iJ;
        int iBT;
        int iBU;
        int i2;
        int i3 = 2 % 2;
        Unsafe unsafe = d;
        int i4 = 0;
        int iF = 0;
        while (i4 < this.f.length) {
            int iAg = ag(i4);
            int iV = v(iAg);
            int i5 = this.f[i4];
            long jL = l(iAg);
            int i6 = b;
            int i7 = i6 | 9;
            int i8 = i7 << 1;
            int i9 = -((~(i6 & 9)) & i7);
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
            if (iV < O.c.g || iV > O.e.g) {
                i = 0;
            } else {
                int i12 = (i4 | 2) << 1;
                int i13 = -(i4 ^ 2);
                i = this.f[(i12 & i13) + (i12 | i13)] & 1048575;
            }
            Object obj = null;
            switch (iV) {
                case 0:
                    if (!(!N(t, i4))) {
                        int i14 = a + 7;
                        b = i14 % 128;
                        iBA = AbstractC0064u.bA(i5, i14 % 2 == 0 ? 1.0d : 0.0d);
                        int i15 = iF & iBA;
                        int i16 = (iF ^ iBA) | i15;
                        iF = ((i15 | i16) << 1) - (i16 ^ i15);
                    }
                    int i17 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i18 = i17 & 59;
                    i4 = ((i17 ^ 59) | i18) + i18;
                    break;
                case 1:
                    if (!(!N(t, i4))) {
                        iBA = AbstractC0064u.bD(i5, 0.0f);
                        int i19 = iF & iBA;
                        int i110 = (iF ^ iBA) | i19;
                        iF = ((i19 | i110) << 1) - (i110 ^ i19);
                    }
                    int i111 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i112 = i111 & 59;
                    i4 = ((i111 ^ 59) | i112) + i112;
                    break;
                case 2:
                    if (N(t, i4)) {
                        int i20 = b;
                        int i21 = i20 | 115;
                        int i22 = i21 << 1;
                        int i23 = -((~(i20 & 115)) & i21);
                        int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                        a = i24 % 128;
                        if (i24 % 2 != 0) {
                            AbstractC0064u.bH(i5, ar.p(t, jL));
                            obj.hashCode();
                            throw null;
                        }
                        iBA = AbstractC0064u.bH(i5, ar.p(t, jL));
                        int i113 = iF & iBA;
                        int i114 = (iF ^ iBA) | i113;
                        iF = ((i113 | i114) << 1) - (i114 ^ i113);
                    } else {
                        continue;
                    }
                    int i115 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i116 = i115 & 59;
                    i4 = ((i115 ^ 59) | i116) + i116;
                    break;
                case 3:
                    if (N(t, i4)) {
                        iBA = AbstractC0064u.bV(i5, ar.p(t, jL));
                        int i117 = iF & iBA;
                        int i118 = (iF ^ iBA) | i117;
                        iF = ((i117 | i118) << 1) - (i118 ^ i117);
                    }
                    int i119 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i1110 = i119 & 59;
                    i4 = ((i119 ^ 59) | i1110) + i1110;
                    break;
                case 4:
                    if (N(t, i4)) {
                        iBA = AbstractC0064u.bF(i5, ar.n(t, jL));
                        int i1111 = iF & iBA;
                        int i1112 = (iF ^ iBA) | i1111;
                        iF = ((i1111 | i1112) << 1) - (i1112 ^ i1111);
                    }
                    int i1113 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i1114 = i1113 & 59;
                    i4 = ((i1113 ^ 59) | i1114) + i1114;
                    break;
                case 5:
                    if (N(t, i4)) {
                        int i25 = a;
                        int i26 = ((i25 | 119) << 1) - (i25 ^ 119);
                        b = i26 % 128;
                        int i27 = i26 % 2;
                        iBA = AbstractC0064u.bx(i5, 0L);
                        int i1115 = iF & iBA;
                        int i1116 = (iF ^ iBA) | i1115;
                        iF = ((i1115 | i1116) << 1) - (i1116 ^ i1115);
                    }
                    int i1117 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i1118 = i1117 & 59;
                    i4 = ((i1117 ^ 59) | i1118) + i1118;
                    break;
                case 6:
                    if (N(t, i4)) {
                        iBA = AbstractC0064u.bC(i5, 0);
                        int i28 = b;
                        int i29 = ((i28 ^ 110) + ((i28 & 110) << 1)) - 1;
                        a = i29 % 128;
                        int i30 = i29 % 2;
                        int i1119 = iF & iBA;
                        int i11110 = (iF ^ iBA) | i1119;
                        iF = ((i1119 | i11110) << 1) - (i11110 ^ i1119);
                    }
                    int i11111 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i11112 = i11111 & 59;
                    i4 = ((i11111 ^ 59) | i11112) + i11112;
                    break;
                case 7:
                    if (N(t, i4)) {
                        iBA = AbstractC0064u.bz(i5, true);
                        int i11113 = iF & iBA;
                        int i11114 = (iF ^ iBA) | i11113;
                        iF = ((i11113 | i11114) << 1) - (i11114 ^ i11113);
                    }
                    int i11115 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i11116 = i11115 & 59;
                    i4 = ((i11115 ^ 59) | i11116) + i11116;
                    break;
                case 8:
                    if (N(t, i4)) {
                        Object objO = ar.o(t, jL);
                        if (objO instanceof AbstractC0069z) {
                            iBA = AbstractC0064u.bE(i5, (AbstractC0069z) objO);
                            int i31 = a;
                            int i32 = ((i31 | 119) << 1) - (i31 ^ 119);
                            b = i32 % 128;
                            int i33 = i32 % 2;
                        } else {
                            iBA = AbstractC0064u.bQ(i5, (String) objO);
                        }
                        int i11117 = iF & iBA;
                        int i11118 = (iF ^ iBA) | i11117;
                        iF = ((i11117 | i11118) << 1) - (i11118 ^ i11117);
                    }
                    int i11119 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i111110 = i11119 & 59;
                    i4 = ((i11119 ^ 59) | i111110) + i111110;
                    break;
                case 9:
                    if (N(t, i4)) {
                        int i34 = b;
                        int i35 = i34 & 1;
                        int i36 = i35 + ((i34 ^ 1) | i35);
                        a = i36 % 128;
                        int i37 = i36 % 2;
                        Object objO2 = ar.o(t, jL);
                        ah ahVarK = K(i4);
                        int i38 = b;
                        int i39 = ((i38 & (-16)) | ((~i38) & 15)) + ((i38 & 15) << 1);
                        a = i39 % 128;
                        int i40 = i39 % 2;
                        iBA = ak.n(i5, objO2, ahVarK);
                        int i111111 = iF & iBA;
                        int i111112 = (iF ^ iBA) | i111111;
                        iF = ((i111111 | i111112) << 1) - (i111112 ^ i111111);
                    }
                    int i111113 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i111114 = i111113 & 59;
                    i4 = ((i111113 ^ 59) | i111114) + i111114;
                    break;
                case 10:
                    if (N(t, i4)) {
                        int i41 = a;
                        int i42 = i41 & 99;
                        int i43 = (i41 | 99) & (~i42);
                        int i44 = -(-(i42 << 1));
                        int i45 = ((i43 | i44) << 1) - (i43 ^ i44);
                        b = i45 % 128;
                        if (i45 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        iBA = AbstractC0064u.bE(i5, (AbstractC0069z) ar.o(t, jL));
                        int i111115 = iF & iBA;
                        int i111116 = (iF ^ iBA) | i111115;
                        iF = ((i111115 | i111116) << 1) - (i111116 ^ i111115);
                    } else {
                        continue;
                    }
                    int i111117 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i111118 = i111117 & 59;
                    i4 = ((i111117 ^ 59) | i111118) + i111118;
                    break;
                case 11:
                    if (N(t, i4)) {
                        int i46 = a;
                        int i47 = i46 ^ 117;
                        int i48 = -(-((i46 & 117) << 1));
                        int i49 = (i47 & i48) + (i48 | i47);
                        b = i49 % 128;
                        if (i49 % 2 == 0) {
                            AbstractC0064u.bS(i5, ar.n(t, jL));
                            obj.hashCode();
                            throw null;
                        }
                        iBA = AbstractC0064u.bS(i5, ar.n(t, jL));
                        int i111119 = iF & iBA;
                        int i1111110 = (iF ^ iBA) | i111119;
                        iF = ((i111119 | i1111110) << 1) - (i1111110 ^ i111119);
                    } else {
                        continue;
                    }
                    int i1111111 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i1111112 = i1111111 & 59;
                    i4 = ((i1111111 ^ 59) | i1111112) + i1111112;
                    break;
                case 12:
                    if (N(t, i4)) {
                        iBA = AbstractC0064u.bB(i5, ar.n(t, jL));
                        int i1111113 = iF & iBA;
                        int i1111114 = (iF ^ iBA) | i1111113;
                        iF = ((i1111113 | i1111114) << 1) - (i1111114 ^ i1111113);
                    }
                    int i1111115 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i1111116 = i1111115 & 59;
                    i4 = ((i1111115 ^ 59) | i1111116) + i1111116;
                    break;
                case 13:
                    if (N(t, i4)) {
                        iBA = AbstractC0064u.bL(i5, 0);
                        int i1111117 = iF & iBA;
                        int i1111118 = (iF ^ iBA) | i1111117;
                        iF = ((i1111117 | i1111118) << 1) - (i1111118 ^ i1111117);
                    }
                    int i1111119 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i11111110 = i1111119 & 59;
                    i4 = ((i1111119 ^ 59) | i11111110) + i11111110;
                    break;
                case IMediaSession.Stub.TRANSACTION_playFromMediaId /* 14 */:
                    if (N(t, i4)) {
                        iBA = AbstractC0064u.bM(i5, 0L);
                        int i11111111 = iF & iBA;
                        int i11111112 = (iF ^ iBA) | i11111111;
                        iF = ((i11111111 | i11111112) << 1) - (i11111112 ^ i11111111);
                    }
                    int i11111113 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i11111114 = i11111113 & 59;
                    i4 = ((i11111113 ^ 59) | i11111114) + i11111114;
                    break;
                case IMediaSession.Stub.TRANSACTION_playFromSearch /* 15 */:
                    if (!(!N(t, i4))) {
                        iBA = AbstractC0064u.bJ(i5, ar.n(t, jL));
                        int i11111115 = iF & iBA;
                        int i11111116 = (iF ^ iBA) | i11111115;
                        iF = ((i11111115 | i11111116) << 1) - (i11111116 ^ i11111115);
                    }
                    int i11111117 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i11111118 = i11111117 & 59;
                    i4 = ((i11111117 ^ 59) | i11111118) + i11111118;
                    break;
                case 16:
                    if (N(t, i4)) {
                        iBA = AbstractC0064u.bO(i5, ar.p(t, jL));
                        int i50 = a;
                        int i51 = ((i50 ^ 31) | (i50 & 31)) << 1;
                        int i52 = -(((~i50) & 31) | (i50 & (-32)));
                        int i53 = (i51 & i52) + (i52 | i51);
                        b = i53 % 128;
                        int i54 = i53 % 2;
                        int i11111119 = iF & iBA;
                        int i111111110 = (iF ^ iBA) | i11111119;
                        iF = ((i11111119 | i111111110) << 1) - (i111111110 ^ i11111119);
                    }
                    int i111111111 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i111111112 = i111111111 & 59;
                    i4 = ((i111111111 ^ 59) | i111111112) + i111111112;
                    break;
                case IMediaSession.Stub.TRANSACTION_skipToQueueItem /* 17 */:
                    if (N(t, i4)) {
                        aa aaVar = (aa) ar.o(t, jL);
                        int i55 = a;
                        int i56 = i55 & 83;
                        int i57 = -(-((i55 ^ 83) | i56));
                        int i58 = (i56 ^ i57) + ((i57 & i56) << 1);
                        b = i58 % 128;
                        if (i58 % 2 == 0) {
                            AbstractC0064u.bY(i5, aaVar, K(i4));
                            throw null;
                        }
                        iBA = AbstractC0064u.bY(i5, aaVar, K(i4));
                        int i111111113 = iF & iBA;
                        int i111111114 = (iF ^ iBA) | i111111113;
                        iF = ((i111111113 | i111111114) << 1) - (i111111114 ^ i111111113);
                    } else {
                        continue;
                    }
                    int i111111115 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i111111116 = i111111115 & 59;
                    i4 = ((i111111115 ^ 59) | i111111116) + i111111116;
                    break;
                case IMediaSession.Stub.TRANSACTION_pause /* 18 */:
                    iBA = ak.i(i5, j(t, jL), false);
                    int i111111117 = iF & iBA;
                    int i111111118 = (iF ^ iBA) | i111111117;
                    iF = ((i111111117 | i111111118) << 1) - (i111111118 ^ i111111117);
                    int i111111119 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i1111111110 = i111111119 & 59;
                    i4 = ((i111111119 ^ 59) | i1111111110) + i1111111110;
                    break;
                case IMediaSession.Stub.TRANSACTION_stop /* 19 */:
                    iBA = ak.h(i5, j(t, jL), false);
                    int i1111111111 = iF & iBA;
                    int i1111111112 = (iF ^ iBA) | i1111111111;
                    iF = ((i1111111111 | i1111111112) << 1) - (i1111111112 ^ i1111111111);
                    int i1111111113 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i1111111114 = i1111111113 & 59;
                    i4 = ((i1111111113 ^ 59) | i1111111114) + i1111111114;
                    break;
                case IMediaSession.Stub.TRANSACTION_next /* 20 */:
                    iBA = ak.m(i5, j(t, jL), false);
                    int i1111111115 = iF & iBA;
                    int i1111111116 = (iF ^ iBA) | i1111111115;
                    iF = ((i1111111115 | i1111111116) << 1) - (i1111111116 ^ i1111111115);
                    int i1111111117 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i1111111118 = i1111111117 & 59;
                    i4 = ((i1111111117 ^ 59) | i1111111118) + i1111111118;
                    break;
                case IMediaSession.Stub.TRANSACTION_previous /* 21 */:
                    iBA = ak.y(i5, j(t, jL), false);
                    int i1111111119 = iF & iBA;
                    int i11111111110 = (iF ^ iBA) | i1111111119;
                    iF = ((i1111111119 | i11111111110) << 1) - (i11111111110 ^ i1111111119);
                    int i11111111111 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i11111111112 = i11111111111 & 59;
                    i4 = ((i11111111111 ^ 59) | i11111111112) + i11111111112;
                    break;
                case IMediaSession.Stub.TRANSACTION_fastForward /* 22 */:
                    iBA = ak.k(i5, j(t, jL), false);
                    int i11111111113 = iF & iBA;
                    int i11111111114 = (iF ^ iBA) | i11111111113;
                    iF = ((i11111111113 | i11111111114) << 1) - (i11111111114 ^ i11111111113);
                    int i11111111115 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i11111111116 = i11111111115 & 59;
                    i4 = ((i11111111115 ^ 59) | i11111111116) + i11111111116;
                    break;
                case IMediaSession.Stub.TRANSACTION_rewind /* 23 */:
                    iBA = ak.i(i5, j(t, jL), false);
                    int i11111111117 = iF & iBA;
                    int i11111111118 = (iF ^ iBA) | i11111111117;
                    iF = ((i11111111117 | i11111111118) << 1) - (i11111111118 ^ i11111111117);
                    int i11111111119 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i111111111110 = i11111111119 & 59;
                    i4 = ((i11111111119 ^ 59) | i111111111110) + i111111111110;
                    break;
                case IMediaSession.Stub.TRANSACTION_seekTo /* 24 */:
                    iBA = ak.h(i5, j(t, jL), false);
                    int i111111111111 = iF & iBA;
                    int i111111111112 = (iF ^ iBA) | i111111111111;
                    iF = ((i111111111111 | i111111111112) << 1) - (i111111111112 ^ i111111111111);
                    int i111111111113 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i111111111114 = i111111111113 & 59;
                    i4 = ((i111111111113 ^ 59) | i111111111114) + i111111111114;
                    break;
                case IMediaSession.Stub.TRANSACTION_rate /* 25 */:
                    iBA = ak.c(i5, j(t, jL), false);
                    int i111111111115 = iF & iBA;
                    int i111111111116 = (iF ^ iBA) | i111111111115;
                    iF = ((i111111111115 | i111111111116) << 1) - (i111111111116 ^ i111111111115);
                    int i111111111117 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i111111111118 = i111111111117 & 59;
                    i4 = ((i111111111117 ^ 59) | i111111111118) + i111111111118;
                    break;
                case IMediaSession.Stub.TRANSACTION_sendCustomAction /* 26 */:
                    iBA = ak.w(i5, j(t, jL));
                    int i111111111119 = iF & iBA;
                    int i1111111111110 = (iF ^ iBA) | i111111111119;
                    iF = ((i111111111119 | i1111111111110) << 1) - (i1111111111110 ^ i111111111119);
                    int i1111111111111 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i1111111111112 = i1111111111111 & 59;
                    i4 = ((i1111111111111 ^ 59) | i1111111111112) + i1111111111112;
                    break;
                case IMediaSession.Stub.TRANSACTION_getMetadata /* 27 */:
                    iBA = ak.p(i5, j(t, jL), K(i4));
                    int i1111111111113 = iF & iBA;
                    int i1111111111114 = (iF ^ iBA) | i1111111111113;
                    iF = ((i1111111111113 | i1111111111114) << 1) - (i1111111111114 ^ i1111111111113);
                    int i1111111111115 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i1111111111116 = i1111111111115 & 59;
                    i4 = ((i1111111111115 ^ 59) | i1111111111116) + i1111111111116;
                    break;
                case IMediaSession.Stub.TRANSACTION_getPlaybackState /* 28 */:
                    iBA = ak.d(i5, j(t, jL));
                    int i1111111111117 = iF & iBA;
                    int i1111111111118 = (iF ^ iBA) | i1111111111117;
                    iF = ((i1111111111117 | i1111111111118) << 1) - (i1111111111118 ^ i1111111111117);
                    int i1111111111119 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i11111111111110 = i1111111111119 & 59;
                    i4 = ((i1111111111119 ^ 59) | i11111111111110) + i11111111111110;
                    break;
                case IMediaSession.Stub.TRANSACTION_getQueue /* 29 */:
                    iBA = ak.v(i5, j(t, jL), false);
                    int i11111111111111 = iF & iBA;
                    int i11111111111112 = (iF ^ iBA) | i11111111111111;
                    iF = ((i11111111111111 | i11111111111112) << 1) - (i11111111111112 ^ i11111111111111);
                    int i11111111111113 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i11111111111114 = i11111111111113 & 59;
                    i4 = ((i11111111111113 ^ 59) | i11111111111114) + i11111111111114;
                    break;
                case IMediaSession.Stub.TRANSACTION_getQueueTitle /* 30 */:
                    iBA = ak.e(i5, j(t, jL), false);
                    int i11111111111115 = iF & iBA;
                    int i11111111111116 = (iF ^ iBA) | i11111111111115;
                    iF = ((i11111111111115 | i11111111111116) << 1) - (i11111111111116 ^ i11111111111115);
                    int i11111111111117 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i11111111111118 = i11111111111117 & 59;
                    i4 = ((i11111111111117 ^ 59) | i11111111111118) + i11111111111118;
                    break;
                case IMediaSession.Stub.TRANSACTION_getExtras /* 31 */:
                    iBA = ak.h(i5, j(t, jL), false);
                    int i59 = b;
                    int i60 = i59 & 121;
                    int i61 = (((i59 ^ 121) | i60) << 1) - ((i59 | 121) & (~i60));
                    a = i61 % 128;
                    if (i61 % 2 != 0) {
                        throw null;
                    }
                    int i11111111111119 = iF & iBA;
                    int i111111111111110 = (iF ^ iBA) | i11111111111119;
                    iF = ((i11111111111119 | i111111111111110) << 1) - (i111111111111110 ^ i11111111111119);
                    int i111111111111111 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i111111111111112 = i111111111111111 & 59;
                    i4 = ((i111111111111111 ^ 59) | i111111111111112) + i111111111111112;
                    break;
                case IMediaSession.Stub.TRANSACTION_getRatingType /* 32 */:
                    iBA = ak.i(i5, j(t, jL), false);
                    int i111111111111113 = iF & iBA;
                    int i111111111111114 = (iF ^ iBA) | i111111111111113;
                    iF = ((i111111111111113 | i111111111111114) << 1) - (i111111111111114 ^ i111111111111113);
                    int i111111111111115 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i111111111111116 = i111111111111115 & 59;
                    i4 = ((i111111111111115 ^ 59) | i111111111111116) + i111111111111116;
                    break;
                case IMediaSession.Stub.TRANSACTION_prepare /* 33 */:
                    iBA = ak.q(i5, j(t, jL), false);
                    int i62 = b;
                    int i63 = i62 | 101;
                    int i64 = i63 << 1;
                    int i65 = -((~(i62 & 101)) & i63);
                    int i66 = (i64 ^ i65) + ((i65 & i64) << 1);
                    a = i66 % 128;
                    int i67 = i66 % 2;
                    int i111111111111117 = iF & iBA;
                    int i111111111111118 = (iF ^ iBA) | i111111111111117;
                    iF = ((i111111111111117 | i111111111111118) << 1) - (i111111111111118 ^ i111111111111117);
                    int i111111111111119 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i1111111111111110 = i111111111111119 & 59;
                    i4 = ((i111111111111119 ^ 59) | i1111111111111110) + i1111111111111110;
                    break;
                case IMediaSession.Stub.TRANSACTION_prepareFromMediaId /* 34 */:
                    iBA = ak.r(i5, j(t, jL), false);
                    int i1111111111111111 = iF & iBA;
                    int i1111111111111112 = (iF ^ iBA) | i1111111111111111;
                    iF = ((i1111111111111111 | i1111111111111112) << 1) - (i1111111111111112 ^ i1111111111111111);
                    int i1111111111111113 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i1111111111111114 = i1111111111111113 & 59;
                    i4 = ((i1111111111111113 ^ 59) | i1111111111111114) + i1111111111111114;
                    break;
                case IMediaSession.Stub.TRANSACTION_prepareFromSearch /* 35 */:
                    iJ = ak.j((List) unsafe.getObject(t, jL));
                    if (iJ > 0) {
                        int i68 = a;
                        int i69 = i68 | 7;
                        int i70 = i69 << 1;
                        int i71 = -(i69 & (~(i68 & 7)));
                        int i72 = ((i70 | i71) << 1) - (i71 ^ i70);
                        b = i72 % 128;
                        if (i72 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        if (this.e) {
                            int i73 = i68 + 95;
                            b = i73 % 128;
                            int i74 = i73 % 2;
                            unsafe.putInt(t, i, iJ);
                        }
                        iBT = AbstractC0064u.bT(i5);
                        iBU = AbstractC0064u.bU(iJ);
                        iF = ivas.gov.bisp.enumeration.p091n.j.f(iBU, iBT, iJ, iF);
                    } else {
                        continue;
                    }
                    int i1111111111111115 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i1111111111111116 = i1111111111111115 & 59;
                    i4 = ((i1111111111111115 ^ 59) | i1111111111111116) + i1111111111111116;
                    break;
                case IMediaSession.Stub.TRANSACTION_prepareFromUri /* 36 */:
                    iJ = ak.g((List) unsafe.getObject(t, jL));
                    int i75 = b;
                    int i76 = i75 & 85;
                    int i77 = -(-(i75 | 85));
                    int i78 = (i76 ^ i77) + ((i77 & i76) << 1);
                    a = i78 % 128;
                    if (i78 % 2 != 0) {
                        throw null;
                    }
                    if (iJ > 0) {
                        if (this.e) {
                            unsafe.putInt(t, i, iJ);
                        }
                        iBT = AbstractC0064u.bT(i5);
                        iBU = AbstractC0064u.bU(iJ);
                        iF = ivas.gov.bisp.enumeration.p091n.j.f(iBU, iBT, iJ, iF);
                    }
                    int i1111111111111117 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i1111111111111118 = i1111111111111117 & 59;
                    i4 = ((i1111111111111117 ^ 59) | i1111111111111118) + i1111111111111118;
                    break;
                    break;
                case IMediaSession.Stub.TRANSACTION_getRepeatMode /* 37 */:
                    iJ = ak.o((List) unsafe.getObject(t, jL));
                    if (iJ > 0) {
                        int i79 = b;
                        int i80 = ((i79 ^ 38) + ((i79 & 38) << 1)) - 1;
                        a = i80 % 128;
                        int i81 = i80 % 2;
                        if (!(!this.e)) {
                            unsafe.putInt(t, i, iJ);
                        }
                        iBT = AbstractC0064u.bT(i5);
                        iBU = AbstractC0064u.bU(iJ);
                        iF = ivas.gov.bisp.enumeration.p091n.j.f(iBU, iBT, iJ, iF);
                    }
                    int i1111111111111119 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i11111111111111110 = i1111111111111119 & 59;
                    i4 = ((i1111111111111119 ^ 59) | i11111111111111110) + i11111111111111110;
                    break;
                case IMediaSession.Stub.TRANSACTION_isShuffleModeEnabledRemoved /* 38 */:
                    List list = (List) unsafe.getObject(t, jL);
                    int i82 = a + 57;
                    b = i82 % 128;
                    if (i82 % 2 == 0) {
                        iJ = ak.u(list);
                        int i83 = 37 / 0;
                        if (iJ > 0) {
                            int i84 = a;
                            int i85 = i84 & 89;
                            i2 = i85 + ((i84 ^ 89) | i85);
                            b = i2 % 128;
                            if (i2 % 2 == 0) {
                                int i86 = 17 / 0;
                                if (this.e) {
                                    unsafe.putInt(t, i, iJ);
                                }
                            } else if (this.e) {
                                unsafe.putInt(t, i, iJ);
                            }
                            iBT = AbstractC0064u.bT(i5);
                            iBU = AbstractC0064u.bU(iJ);
                            iF = ivas.gov.bisp.enumeration.p091n.j.f(iBU, iBT, iJ, iF);
                        }
                    } else {
                        iJ = ak.u(list);
                        if (iJ > 0) {
                            int i87 = a;
                            int i88 = i87 & 89;
                            i2 = i88 + ((i87 ^ 89) | i88);
                            b = i2 % 128;
                            if (i2 % 2 == 0) {
                                int i89 = 17 / 0;
                                if (this.e) {
                                    unsafe.putInt(t, i, iJ);
                                }
                            } else if (this.e) {
                                unsafe.putInt(t, i, iJ);
                            }
                            iBT = AbstractC0064u.bT(i5);
                            iBU = AbstractC0064u.bU(iJ);
                            iF = ivas.gov.bisp.enumeration.p091n.j.f(iBU, iBT, iJ, iF);
                        }
                    }
                    int i11111111111111111 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i11111111111111112 = i11111111111111111 & 59;
                    i4 = ((i11111111111111111 ^ 59) | i11111111111111112) + i11111111111111112;
                    break;
                case IMediaSession.Stub.TRANSACTION_setRepeatMode /* 39 */:
                    iJ = ak.l((List) unsafe.getObject(t, jL));
                    if (iJ > 0) {
                        if (this.e) {
                            unsafe.putInt(t, i, iJ);
                        }
                        iBT = AbstractC0064u.bT(i5);
                        iBU = AbstractC0064u.bU(iJ);
                        int i90 = a;
                        int i91 = i90 & 57;
                        int i92 = (i90 ^ 57) | i91;
                        int i93 = (i91 & i92) + (i92 | i91);
                        b = i93 % 128;
                        int i94 = i93 % 2;
                        iF = ivas.gov.bisp.enumeration.p091n.j.f(iBU, iBT, iJ, iF);
                    }
                    int i11111111111111113 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i11111111111111114 = i11111111111111113 & 59;
                    i4 = ((i11111111111111113 ^ 59) | i11111111111111114) + i11111111111111114;
                    break;
                case IMediaSession.Stub.TRANSACTION_setShuffleModeEnabledRemoved /* 40 */:
                    iJ = ak.j((List) unsafe.getObject(t, jL));
                    if (iJ > 0) {
                        int i95 = b;
                        int i96 = i95 & 123;
                        int i97 = (i95 | 123) & (~i96);
                        int i98 = -(-(i96 << 1));
                        int i99 = ((i97 | i98) << 1) - (i97 ^ i98);
                        a = i99 % 128;
                        int i100 = i99 % 2;
                        if (this.e) {
                            unsafe.putInt(t, i, iJ);
                            int i101 = b;
                            int i102 = i101 & 5;
                            int i103 = ((((i101 ^ 5) | i102) << 1) - (~(-((i101 | 5) & (~i102))))) - 1;
                            a = i103 % 128;
                            int i104 = i103 % 2;
                        }
                        iBT = AbstractC0064u.bT(i5);
                        iBU = AbstractC0064u.bU(iJ);
                        iF = ivas.gov.bisp.enumeration.p091n.j.f(iBU, iBT, iJ, iF);
                    }
                    int i11111111111111115 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i11111111111111116 = i11111111111111115 & 59;
                    i4 = ((i11111111111111115 ^ 59) | i11111111111111116) + i11111111111111116;
                    break;
                case IMediaSession.Stub.TRANSACTION_addQueueItem /* 41 */:
                    iJ = ak.g((List) unsafe.getObject(t, jL));
                    if (iJ > 0) {
                        int i105 = a;
                        int i106 = (i105 & (-74)) | ((~i105) & 73);
                        int i107 = (i105 & 73) << 1;
                        int i108 = ((i106 | i107) << 1) - (i107 ^ i106);
                        b = i108 % 128;
                        int i109 = i108 % 2;
                        if (this.e) {
                            unsafe.putInt(t, i, iJ);
                        }
                        iBT = AbstractC0064u.bT(i5);
                        iBU = AbstractC0064u.bU(iJ);
                        int i120 = b;
                        int i121 = i120 & 111;
                        int i122 = -(-((i120 ^ 111) | i121));
                        int i123 = (i121 & i122) + (i122 | i121);
                        a = i123 % 128;
                        int i124 = i123 % 2;
                        iF = ivas.gov.bisp.enumeration.p091n.j.f(iBU, iBT, iJ, iF);
                    }
                    int i11111111111111117 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i11111111111111118 = i11111111111111117 & 59;
                    i4 = ((i11111111111111117 ^ 59) | i11111111111111118) + i11111111111111118;
                    break;
                case IMediaSession.Stub.TRANSACTION_addQueueItemAt /* 42 */:
                    List list2 = (List) unsafe.getObject(t, jL);
                    Class<?> cls = ak.c;
                    int i125 = b;
                    int i126 = ((i125 & 80) + (i125 | 80)) - 1;
                    a = i126 % 128;
                    int i127 = i126 % 2;
                    iJ = list2.size();
                    if (iJ > 0) {
                        if (this.e) {
                            unsafe.putInt(t, i, iJ);
                        }
                        iBT = AbstractC0064u.bT(i5);
                        iBU = AbstractC0064u.bU(iJ);
                        iF = ivas.gov.bisp.enumeration.p091n.j.f(iBU, iBT, iJ, iF);
                    }
                    int i11111111111111119 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i111111111111111110 = i11111111111111119 & 59;
                    i4 = ((i11111111111111119 ^ 59) | i111111111111111110) + i111111111111111110;
                    break;
                case IMediaSession.Stub.TRANSACTION_removeQueueItem /* 43 */:
                    iJ = ak.x((List) unsafe.getObject(t, jL));
                    if (iJ <= 0) {
                        continue;
                    } else {
                        if (this.e) {
                            int i128 = a;
                            int i129 = ((i128 | 103) << 1) - (i128 ^ 103);
                            b = i129 % 128;
                            if (i129 % 2 == 0) {
                                unsafe.putInt(t, i, iJ);
                                obj.hashCode();
                                throw null;
                            }
                            unsafe.putInt(t, i, iJ);
                        }
                        iBT = AbstractC0064u.bT(i5);
                        iBU = AbstractC0064u.bU(iJ);
                        iF = ivas.gov.bisp.enumeration.p091n.j.f(iBU, iBT, iJ, iF);
                    }
                    int i111111111111111111 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i111111111111111112 = i111111111111111111 & 59;
                    i4 = ((i111111111111111111 ^ 59) | i111111111111111112) + i111111111111111112;
                    break;
                case IMediaSession.Stub.TRANSACTION_removeQueueItemAt /* 44 */:
                    iJ = ak.f((List) unsafe.getObject(t, jL));
                    int i130 = a + 67;
                    int i131 = i130 % 128;
                    b = i131;
                    if (i130 % 2 == 0) {
                        throw null;
                    }
                    if (iJ > 0) {
                        if (this.e) {
                            int i132 = (i131 ^ 75) + ((i131 & 75) << 1);
                            a = i132 % 128;
                            int i133 = i132 % 2;
                            unsafe.putInt(t, i, iJ);
                        }
                        iBT = AbstractC0064u.bT(i5);
                        iBU = AbstractC0064u.bU(iJ);
                        int i134 = b;
                        int i135 = ((i134 | 17) << 1) - (i134 ^ 17);
                        a = i135 % 128;
                        int i136 = i135 % 2;
                        iF = ivas.gov.bisp.enumeration.p091n.j.f(iBU, iBT, iJ, iF);
                    }
                    int i111111111111111113 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i111111111111111114 = i111111111111111113 & 59;
                    i4 = ((i111111111111111113 ^ 59) | i111111111111111114) + i111111111111111114;
                    break;
                    break;
                case IMediaSession.Stub.TRANSACTION_isCaptioningEnabled /* 45 */:
                    iJ = ak.g((List) unsafe.getObject(t, jL));
                    if (iJ <= 0) {
                        continue;
                    } else {
                        if (this.e) {
                            unsafe.putInt(t, i, iJ);
                        }
                        iBT = AbstractC0064u.bT(i5);
                        iBU = AbstractC0064u.bU(iJ);
                        int i137 = a;
                        int i138 = ((i137 ^ 64) + ((i137 & 64) << 1)) - 1;
                        b = i138 % 128;
                        if (i138 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        iF = ivas.gov.bisp.enumeration.p091n.j.f(iBU, iBT, iJ, iF);
                    }
                    int i111111111111111115 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i111111111111111116 = i111111111111111115 & 59;
                    i4 = ((i111111111111111115 ^ 59) | i111111111111111116) + i111111111111111116;
                    break;
                case IMediaSession.Stub.TRANSACTION_setCaptioningEnabled /* 46 */:
                    iJ = ak.j((List) unsafe.getObject(t, jL));
                    int i139 = a;
                    int i140 = ((i139 ^ 11) | (i139 & 11)) << 1;
                    int i141 = -(((~i139) & 11) | (i139 & (-12)));
                    int i142 = (i140 & i141) + (i141 | i140);
                    b = i142 % 128;
                    int i143 = i142 % 2;
                    if (iJ > 0) {
                        if (this.e) {
                            unsafe.putInt(t, i, iJ);
                        }
                        iBT = AbstractC0064u.bT(i5);
                        iBU = AbstractC0064u.bU(iJ);
                        int i144 = b;
                        int i145 = i144 & 51;
                        int i146 = ((i144 ^ 51) | i145) << 1;
                        int i147 = -((i144 | 51) & (~i145));
                        int i148 = ((i146 | i147) << 1) - (i147 ^ i146);
                        a = i148 % 128;
                        int i149 = i148 % 2;
                        iF = ivas.gov.bisp.enumeration.p091n.j.f(iBU, iBT, iJ, iF);
                    }
                    int i111111111111111117 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i111111111111111118 = i111111111111111117 & 59;
                    i4 = ((i111111111111111117 ^ 59) | i111111111111111118) + i111111111111111118;
                    break;
                case IMediaSession.Stub.TRANSACTION_getShuffleMode /* 47 */:
                    iJ = ak.s((List) unsafe.getObject(t, jL));
                    if (iJ > 0) {
                        if (this.e) {
                            unsafe.putInt(t, i, iJ);
                        }
                        iBT = AbstractC0064u.bT(i5);
                        iBU = AbstractC0064u.bU(iJ);
                        int i150 = b;
                        int i151 = ((i150 & (-104)) | ((~i150) & 103)) + ((i150 & 103) << 1);
                        a = i151 % 128;
                        int i152 = i151 % 2;
                        iF = ivas.gov.bisp.enumeration.p091n.j.f(iBU, iBT, iJ, iF);
                    }
                    int i111111111111111119 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i1111111111111111110 = i111111111111111119 & 59;
                    i4 = ((i111111111111111119 ^ 59) | i1111111111111111110) + i1111111111111111110;
                    break;
                case IMediaSession.Stub.TRANSACTION_setShuffleMode /* 48 */:
                    iJ = ak.t((List) unsafe.getObject(t, jL));
                    if (iJ > 0) {
                        int i153 = a + 67;
                        b = i153 % 128;
                        int i154 = i153 % 2;
                        if (this.e) {
                            unsafe.putInt(t, i, iJ);
                        }
                        iBT = AbstractC0064u.bT(i5);
                        iBU = AbstractC0064u.bU(iJ);
                        iF = ivas.gov.bisp.enumeration.p091n.j.f(iBU, iBT, iJ, iF);
                    }
                    int i1111111111111111111 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i1111111111111111112 = i1111111111111111111 & 59;
                    i4 = ((i1111111111111111111 ^ 59) | i1111111111111111112) + i1111111111111111112;
                    break;
                case 49:
                    List<?> listJ = j(t, jL);
                    ah ahVarK2 = K(i4);
                    int i155 = b;
                    int i156 = (((i155 ^ 7) | (i155 & 7)) << 1) - (((~i155) & 7) | (i155 & (-8)));
                    a = i156 % 128;
                    int i157 = i156 % 2;
                    iBA = ak.b(i5, listJ, ahVarK2);
                    int i11111111111111120 = iF & iBA;
                    int i11111111111111121 = (iF ^ iBA) | i11111111111111120;
                    iF = ((i11111111111111120 | i11111111111111121) << 1) - (i11111111111111121 ^ i11111111111111120);
                    int i1111111111111111113 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i1111111111111111114 = i1111111111111111113 & 59;
                    i4 = ((i1111111111111111113 ^ 59) | i1111111111111111114) + i1111111111111111114;
                    break;
                case 50:
                    iBA = this.u.d(i5, ar.o(t, jL), I(i4));
                    int i11111111111111122 = iF & iBA;
                    int i11111111111111123 = (iF ^ iBA) | i11111111111111122;
                    iF = ((i11111111111111122 | i11111111111111123) << 1) - (i11111111111111123 ^ i11111111111111122);
                    int i1111111111111111115 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i1111111111111111116 = i1111111111111111115 & 59;
                    i4 = ((i1111111111111111115 ^ 59) | i1111111111111111116) + i1111111111111111116;
                    break;
                case IMediaSession.Stub.TRANSACTION_rateWithExtras /* 51 */:
                    if (P(t, i5, i4)) {
                        iBA = AbstractC0064u.bA(i5, 0.0d);
                        int i11111111111111124 = iF & iBA;
                        int i11111111111111125 = (iF ^ iBA) | i11111111111111124;
                        iF = ((i11111111111111124 | i11111111111111125) << 1) - (i11111111111111125 ^ i11111111111111124);
                    }
                    int i1111111111111111117 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i1111111111111111118 = i1111111111111111117 & 59;
                    i4 = ((i1111111111111111117 ^ 59) | i1111111111111111118) + i1111111111111111118;
                    break;
                case 52:
                    if (P(t, i5, i4)) {
                        int i158 = a;
                        int i159 = (i158 ^ 69) + ((i158 & 69) << 1);
                        b = i159 % 128;
                        iBA = i159 % 2 == 0 ? AbstractC0064u.bD(i5, 1.0f) : AbstractC0064u.bD(i5, 0.0f);
                        int i11111111111111126 = iF & iBA;
                        int i11111111111111127 = (iF ^ iBA) | i11111111111111126;
                        iF = ((i11111111111111126 | i11111111111111127) << 1) - (i11111111111111127 ^ i11111111111111126);
                    }
                    int i1111111111111111119 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i11111111111111111110 = i1111111111111111119 & 59;
                    i4 = ((i1111111111111111119 ^ 59) | i11111111111111111110) + i11111111111111111110;
                    break;
                case 53:
                    if (P(t, i5, i4)) {
                        iBA = AbstractC0064u.bH(i5, t(t, jL));
                        int i11111111111111128 = iF & iBA;
                        int i11111111111111129 = (iF ^ iBA) | i11111111111111128;
                        iF = ((i11111111111111128 | i11111111111111129) << 1) - (i11111111111111129 ^ i11111111111111128);
                    }
                    int i11111111111111111111 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i11111111111111111112 = i11111111111111111111 & 59;
                    i4 = ((i11111111111111111111 ^ 59) | i11111111111111111112) + i11111111111111111112;
                    break;
                case 54:
                    if (P(t, i5, i4)) {
                        int i160 = b;
                        int i161 = (-2) - (((i160 & 18) + (i160 | 18)) ^ (-1));
                        a = i161 % 128;
                        int i162 = i161 % 2;
                        iBA = AbstractC0064u.bV(i5, t(t, jL));
                        int i163 = b;
                        int i164 = (i163 & 63) + (i163 | 63);
                        a = i164 % 128;
                        int i165 = i164 % 2;
                        int i111111111111111210 = iF & iBA;
                        int i111111111111111211 = (iF ^ iBA) | i111111111111111210;
                        iF = ((i111111111111111210 | i111111111111111211) << 1) - (i111111111111111211 ^ i111111111111111210);
                    }
                    int i11111111111111111113 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i11111111111111111114 = i11111111111111111113 & 59;
                    i4 = ((i11111111111111111113 ^ 59) | i11111111111111111114) + i11111111111111111114;
                    break;
                case 55:
                    if (P(t, i5, i4)) {
                        iBA = AbstractC0064u.bF(i5, s(t, jL));
                        int i111111111111111212 = iF & iBA;
                        int i111111111111111213 = (iF ^ iBA) | i111111111111111212;
                        iF = ((i111111111111111212 | i111111111111111213) << 1) - (i111111111111111213 ^ i111111111111111212);
                    }
                    int i11111111111111111115 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i11111111111111111116 = i11111111111111111115 & 59;
                    i4 = ((i11111111111111111115 ^ 59) | i11111111111111111116) + i11111111111111111116;
                    break;
                case 56:
                    if (P(t, i5, i4)) {
                        iBA = AbstractC0064u.bx(i5, 0L);
                        int i111111111111111214 = iF & iBA;
                        int i111111111111111215 = (iF ^ iBA) | i111111111111111214;
                        iF = ((i111111111111111214 | i111111111111111215) << 1) - (i111111111111111215 ^ i111111111111111214);
                    }
                    int i11111111111111111117 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i11111111111111111118 = i11111111111111111117 & 59;
                    i4 = ((i11111111111111111117 ^ 59) | i11111111111111111118) + i11111111111111111118;
                    break;
                case 57:
                    if (P(t, i5, i4)) {
                        int i166 = b;
                        int i167 = i166 & 119;
                        int i168 = i166 | 119;
                        int i169 = ((i167 | i168) << 1) - (i168 ^ i167);
                        a = i169 % 128;
                        int i170 = i169 % 2;
                        iBA = AbstractC0064u.bC(i5, 0);
                        int i111111111111111216 = iF & iBA;
                        int i111111111111111217 = (iF ^ iBA) | i111111111111111216;
                        iF = ((i111111111111111216 | i111111111111111217) << 1) - (i111111111111111217 ^ i111111111111111216);
                    }
                    int i11111111111111111119 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i111111111111111111110 = i11111111111111111119 & 59;
                    i4 = ((i11111111111111111119 ^ 59) | i111111111111111111110) + i111111111111111111110;
                    break;
                case 58:
                    if (P(t, i5, i4)) {
                        iBA = AbstractC0064u.bz(i5, true);
                        int i111111111111111218 = iF & iBA;
                        int i111111111111111219 = (iF ^ iBA) | i111111111111111218;
                        iF = ((i111111111111111218 | i111111111111111219) << 1) - (i111111111111111219 ^ i111111111111111218);
                    }
                    int i111111111111111111111 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i111111111111111111112 = i111111111111111111111 & 59;
                    i4 = ((i111111111111111111111 ^ 59) | i111111111111111111112) + i111111111111111111112;
                    break;
                case 59:
                    if (P(t, i5, i4)) {
                        int i171 = b;
                        int i172 = i171 & 35;
                        int i173 = -(-((i171 ^ 35) | i172));
                        int i174 = (i172 ^ i173) + ((i173 & i172) << 1);
                        a = i174 % 128;
                        int i175 = i174 % 2;
                        Object objO3 = ar.o(t, jL);
                        if (objO3 instanceof AbstractC0069z) {
                            int i176 = b;
                            int i177 = (i176 ^ 16) + ((i176 & 16) << 1);
                            int i178 = (i177 ^ (-1)) + (i177 << 1);
                            a = i178 % 128;
                            int i179 = i178 % 2;
                            iBA = AbstractC0064u.bE(i5, (AbstractC0069z) objO3);
                        } else {
                            iBA = AbstractC0064u.bQ(i5, (String) objO3);
                            int i180 = b;
                            int i181 = ((i180 ^ 69) - (~(-(-((i180 & 69) << 1))))) - 1;
                            a = i181 % 128;
                            int i182 = i181 % 2;
                        }
                        int i1111111111111112110 = iF & iBA;
                        int i1111111111111112111 = (iF ^ iBA) | i1111111111111112110;
                        iF = ((i1111111111111112110 | i1111111111111112111) << 1) - (i1111111111111112111 ^ i1111111111111112110);
                    }
                    int i111111111111111111113 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i111111111111111111114 = i111111111111111111113 & 59;
                    i4 = ((i111111111111111111113 ^ 59) | i111111111111111111114) + i111111111111111111114;
                    break;
                case 60:
                    if (P(t, i5, i4)) {
                        int i183 = a;
                        int i184 = ((i183 & (-98)) | ((~i183) & 97)) + ((i183 & 97) << 1);
                        b = i184 % 128;
                        if (i184 % 2 == 0) {
                            ar.o(t, jL);
                            obj.hashCode();
                            throw null;
                        }
                        iBA = ak.n(i5, ar.o(t, jL), K(i4));
                        int i1111111111111112112 = iF & iBA;
                        int i1111111111111112113 = (iF ^ iBA) | i1111111111111112112;
                        iF = ((i1111111111111112112 | i1111111111111112113) << 1) - (i1111111111111112113 ^ i1111111111111112112);
                    } else {
                        continue;
                    }
                    int i111111111111111111115 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i111111111111111111116 = i111111111111111111115 & 59;
                    i4 = ((i111111111111111111115 ^ 59) | i111111111111111111116) + i111111111111111111116;
                    break;
                case 61:
                    if (!P(t, i5, i4)) {
                        continue;
                    } else {
                        int i185 = b;
                        int i186 = (((i185 ^ 33) | (i185 & 33)) << 1) - (((~i185) & 33) | (i185 & (-34)));
                        a = i186 % 128;
                        if (i186 % 2 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                        iBA = AbstractC0064u.bE(i5, (AbstractC0069z) ar.o(t, jL));
                        int i1111111111111112114 = iF & iBA;
                        int i1111111111111112115 = (iF ^ iBA) | i1111111111111112114;
                        iF = ((i1111111111111112114 | i1111111111111112115) << 1) - (i1111111111111112115 ^ i1111111111111112114);
                    }
                    int i111111111111111111117 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i111111111111111111118 = i111111111111111111117 & 59;
                    i4 = ((i111111111111111111117 ^ 59) | i111111111111111111118) + i111111111111111111118;
                    break;
                case 62:
                    if (P(t, i5, i4)) {
                        iBA = AbstractC0064u.bS(i5, s(t, jL));
                        int i1111111111111112116 = iF & iBA;
                        int i1111111111111112117 = (iF ^ iBA) | i1111111111111112116;
                        iF = ((i1111111111111112116 | i1111111111111112117) << 1) - (i1111111111111112117 ^ i1111111111111112116);
                    }
                    int i111111111111111111119 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i1111111111111111111110 = i111111111111111111119 & 59;
                    i4 = ((i111111111111111111119 ^ 59) | i1111111111111111111110) + i1111111111111111111110;
                    break;
                case 63:
                    if (P(t, i5, i4)) {
                        iBA = AbstractC0064u.bB(i5, s(t, jL));
                        int i1111111111111112118 = iF & iBA;
                        int i1111111111111112119 = (iF ^ iBA) | i1111111111111112118;
                        iF = ((i1111111111111112118 | i1111111111111112119) << 1) - (i1111111111111112119 ^ i1111111111111112118);
                    }
                    int i1111111111111111111111 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i1111111111111111111112 = i1111111111111111111111 & 59;
                    i4 = ((i1111111111111111111111 ^ 59) | i1111111111111111111112) + i1111111111111111111112;
                    break;
                case 64:
                    if (P(t, i5, i4)) {
                        int i187 = a;
                        int i188 = i187 & 39;
                        int i189 = -(-(i187 | 39));
                        int i190 = (i188 ^ i189) + ((i189 & i188) << 1);
                        b = i190 % 128;
                        int i191 = i190 % 2;
                        iBA = AbstractC0064u.bL(i5, 0);
                        int i11111111111111121110 = iF & iBA;
                        int i11111111111111121111 = (iF ^ iBA) | i11111111111111121110;
                        iF = ((i11111111111111121110 | i11111111111111121111) << 1) - (i11111111111111121111 ^ i11111111111111121110);
                    }
                    int i1111111111111111111113 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i1111111111111111111114 = i1111111111111111111113 & 59;
                    i4 = ((i1111111111111111111113 ^ 59) | i1111111111111111111114) + i1111111111111111111114;
                    break;
                case 65:
                    if (P(t, i5, i4)) {
                        int i192 = b;
                        int i193 = i192 & 89;
                        int i194 = -(-((i192 ^ 89) | i193));
                        int i195 = (i193 & i194) + (i194 | i193);
                        a = i195 % 128;
                        iBA = i195 % 2 != 0 ? AbstractC0064u.bM(i5, 1L) : AbstractC0064u.bM(i5, 0L);
                        int i11111111111111121112 = iF & iBA;
                        int i11111111111111121113 = (iF ^ iBA) | i11111111111111121112;
                        iF = ((i11111111111111121112 | i11111111111111121113) << 1) - (i11111111111111121113 ^ i11111111111111121112);
                    }
                    int i1111111111111111111115 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i1111111111111111111116 = i1111111111111111111115 & 59;
                    i4 = ((i1111111111111111111115 ^ 59) | i1111111111111111111116) + i1111111111111111111116;
                    break;
                case 66:
                    if (P(t, i5, i4)) {
                        int i196 = b;
                        int i197 = (i196 ^ 115) + ((i196 & 115) << 1);
                        a = i197 % 128;
                        if (i197 % 2 != 0) {
                            AbstractC0064u.bJ(i5, s(t, jL));
                            throw null;
                        }
                        iBA = AbstractC0064u.bJ(i5, s(t, jL));
                        int i11111111111111121114 = iF & iBA;
                        int i11111111111111121115 = (iF ^ iBA) | i11111111111111121114;
                        iF = ((i11111111111111121114 | i11111111111111121115) << 1) - (i11111111111111121115 ^ i11111111111111121114);
                    } else {
                        continue;
                    }
                    int i1111111111111111111117 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i1111111111111111111118 = i1111111111111111111117 & 59;
                    i4 = ((i1111111111111111111117 ^ 59) | i1111111111111111111118) + i1111111111111111111118;
                    break;
                case 67:
                    if (P(t, i5, i4)) {
                        int i198 = b;
                        int i199 = i198 & 81;
                        int i200 = ((i198 ^ 81) | i199) << 1;
                        int i201 = -((i198 | 81) & (~i199));
                        int i202 = (i200 ^ i201) + ((i201 & i200) << 1);
                        a = i202 % 128;
                        int i203 = i202 % 2;
                        iBA = AbstractC0064u.bO(i5, t(t, jL));
                        int i11111111111111121116 = iF & iBA;
                        int i11111111111111121117 = (iF ^ iBA) | i11111111111111121116;
                        iF = ((i11111111111111121116 | i11111111111111121117) << 1) - (i11111111111111121117 ^ i11111111111111121116);
                    }
                    int i1111111111111111111119 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i11111111111111111111110 = i1111111111111111111119 & 59;
                    i4 = ((i1111111111111111111119 ^ 59) | i11111111111111111111110) + i11111111111111111111110;
                    break;
                case 68:
                    if (P(t, i5, i4)) {
                        int i204 = a + 65;
                        b = i204 % 128;
                        int i205 = i204 % 2;
                        iBA = AbstractC0064u.bY(i5, (aa) ar.o(t, jL), K(i4));
                        int i11111111111111121118 = iF & iBA;
                        int i11111111111111121119 = (iF ^ iBA) | i11111111111111121118;
                        iF = ((i11111111111111121118 | i11111111111111121119) << 1) - (i11111111111111121119 ^ i11111111111111121118);
                    }
                    int i11111111111111111111111 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i11111111111111111111112 = i11111111111111111111111 & 59;
                    i4 = ((i11111111111111111111111 ^ 59) | i11111111111111111111112) + i11111111111111111111112;
                    break;
                default:
                    int i11111111111111111111113 = (-2) - ((((i4 | (-55)) << 1) - (i4 ^ (-55))) ^ (-1));
                    int i11111111111111111111114 = i11111111111111111111113 & 59;
                    i4 = ((i11111111111111111111113 ^ 59) | i11111111111111111111114) + i11111111111111111111114;
                    break;
            }
        }
        o00O00<?, ?> o00o00 = this.s;
        return (o00o00.k(o00o00.j(t)) - (~(-(-iF)))) - 1;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x039f  */
    /* JADX WARN: Code duplicated, block: B:103:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:105:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:107:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:109:0x0403  */
    /* JADX WARN: Code duplicated, block: B:110:0x040b  */
    /* JADX WARN: Code duplicated, block: B:113:0x041a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0422  */
    /* JADX WARN: Code duplicated, block: B:118:0x0449  */
    /* JADX WARN: Code duplicated, block: B:121:0x0452  */
    /* JADX WARN: Code duplicated, block: B:123:0x0458  */
    /* JADX WARN: Code duplicated, block: B:125:0x0463  */
    /* JADX WARN: Code duplicated, block: B:128:0x048b  */
    /* JADX WARN: Code duplicated, block: B:130:0x0491  */
    /* JADX WARN: Code duplicated, block: B:131:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:133:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:134:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:136:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:138:0x0512  */
    /* JADX WARN: Code duplicated, block: B:141:0x0523  */
    /* JADX WARN: Code duplicated, block: B:143:0x0529  */
    /* JADX WARN: Code duplicated, block: B:156:0x015d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x01bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x0207 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x038d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x0410 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x044e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x0482 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x0519 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x053c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x053c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x053c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x053c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x053c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x053c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x053c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x053c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x053c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x007b  */
    /* JADX WARN: Code duplicated, block: B:192:0x053c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x053c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x053c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0080  */
    /* JADX WARN: Code duplicated, block: B:201:0x053c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x053c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x053c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x053c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x053c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x053c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x053c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x053c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0087  */
    /* JADX WARN: Code duplicated, block: B:22:0x00be  */
    /* JADX WARN: Code duplicated, block: B:23:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:25:0x00da  */
    /* JADX WARN: Code duplicated, block: B:27:0x0105  */
    /* JADX WARN: Code duplicated, block: B:28:0x010c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0120  */
    /* JADX WARN: Code duplicated, block: B:32:0x0137  */
    /* JADX WARN: Code duplicated, block: B:34:0x0159  */
    /* JADX WARN: Code duplicated, block: B:37:0x0161  */
    /* JADX WARN: Code duplicated, block: B:38:0x017a  */
    /* JADX WARN: Code duplicated, block: B:39:0x018c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0192  */
    /* JADX WARN: Code duplicated, block: B:43:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:46:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:49:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:51:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:53:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:58:0x0210  */
    /* JADX WARN: Code duplicated, block: B:61:0x0218  */
    /* JADX WARN: Code duplicated, block: B:63:0x0223  */
    /* JADX WARN: Code duplicated, block: B:64:0x022e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0254  */
    /* JADX WARN: Code duplicated, block: B:68:0x025a  */
    /* JADX WARN: Code duplicated, block: B:70:0x026b  */
    /* JADX WARN: Code duplicated, block: B:72:0x028a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0299  */
    /* JADX WARN: Code duplicated, block: B:77:0x029f  */
    /* JADX WARN: Code duplicated, block: B:79:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:80:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:81:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:83:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:84:0x031c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0323  */
    /* JADX WARN: Code duplicated, block: B:88:0x0332  */
    /* JADX WARN: Code duplicated, block: B:89:0x033c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0356  */
    /* JADX WARN: Code duplicated, block: B:92:0x035b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0361  */
    /* JADX WARN: Code duplicated, block: B:96:0x0372  */
    /* JADX WARN: Code duplicated, block: B:99:0x0396  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void b(T t, T t2) {
        float fM;
        ar.bkn bknVar;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Object objO;
        ar.bkn bknVar2;
        int iN;
        ar.bkn bknVar3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int iN2;
        ar.bkn bknVar4;
        int i13;
        int i14;
        X x;
        Object objO2;
        int i15;
        int i16;
        int i17;
        int i18 = 2 % 2;
        int i19 = b;
        int i20 = i19 & 65;
        int i21 = i20 + ((i19 ^ 65) | i20);
        a = i21 % 128;
        int i22 = i21 % 2;
        Objects.requireNonNull(t2);
        int i23 = 0;
        while (true) {
            int[] iArr = this.f;
            Object obj = null;
            if (i23 >= iArr.length) {
                o00O00<?, ?> o00o00 = this.s;
                Class<?> cls = ak.c;
                Object objJ = o00o00.j(t);
                int i24 = a;
                int i25 = (((i24 ^ 37) | (i24 & 37)) << 1) - (((~i24) & 37) | (i24 & (-38)));
                b = i25 % 128;
                if (i25 % 2 == 0) {
                    o00o00.j(t2);
                    throw null;
                }
                o00o00.q(t, o00o00.m(objJ, o00o00.j(t2)));
                if (this.j) {
                    ak.B(this.t, t, t2);
                }
                int i26 = a;
                int i27 = ((i26 ^ 101) | (i26 & 101)) << 1;
                int i28 = -(((~i26) & 101) | (i26 & (-102)));
                int i29 = (i27 & i28) + (i28 | i27);
                b = i29 % 128;
                int i30 = i29 % 2;
                return;
            }
            int i31 = b;
            int i32 = ((i31 | 101) << 1) - (i31 ^ 101);
            a = i32 % 128;
            int i33 = i32 % 2 != 0 ? iArr[i23 - 1] : iArr[(i23 ^ 1) + ((i23 & 1) << 1)];
            long jL = l(i33);
            int i34 = this.f[i23];
            int i35 = a;
            int i36 = i35 & 113;
            int i37 = (i35 | 113) & (~i36);
            int i38 = -(-(i36 << 1));
            int i39 = (i37 ^ i38) + ((i37 & i38) << 1);
            b = i39 % 128;
            if (i39 % 2 == 0) {
                int i40 = 11 / 0;
                switch (v(i33)) {
                    case 0:
                        if (N(t2, i23)) {
                            int i41 = b + 115;
                            a = i41 % 128;
                            int i42 = i41 % 2;
                            ar.x(t, jL, ar.l(t2, jL));
                        }
                        break;
                    case 1:
                        if (!(!N(t2, i23))) {
                            continue;
                            continue;
                        } else {
                            int i43 = a;
                            int i44 = i43 & 47;
                            int i45 = (i44 - (~((i43 ^ 47) | i44))) - 1;
                            b = i45 % 128;
                            int i46 = i45 % 2;
                            fM = ar.m(t2, jL);
                            bknVar = ar.h;
                            int i47 = a;
                            int i48 = i47 & 107;
                            i = (((i47 ^ 107) | i48) << 1) - ((i47 | 107) & (~i48));
                            b = i % 128;
                            if (i % 2 != 0) {
                                bknVar.o(t, jL, fM);
                                ac(t, i23);
                                obj.hashCode();
                                throw null;
                            }
                            bknVar.o(t, jL, fM);
                            ac(t, i23);
                        }
                        break;
                    case 2:
                        if (N(t2, i23)) {
                            int i49 = b;
                            int i50 = ((i49 ^ 85) | (i49 & 85)) << 1;
                            int i51 = -(((~i49) & 85) | (i49 & (-86)));
                            int i52 = (i50 & i51) + (i51 | i50);
                            a = i52 % 128;
                            int i53 = i52 % 2;
                            ar.z(t, jL, ar.p(t2, jL));
                        }
                        break;
                    case 3:
                        if (N(t2, i23)) {
                            continue;
                            continue;
                        } else {
                            int i54 = a;
                            int i55 = i54 & 47;
                            int i56 = ((i54 | 47) & (~i55)) + (i55 << 1);
                            b = i56 % 128;
                            int i57 = i56 % 2;
                            ar.z(t, jL, ar.p(t2, jL));
                            ac(t, i23);
                            int i58 = a;
                            int i59 = (-2) - (((i58 & 48) + (i58 | 48)) ^ (-1));
                            b = i59 % 128;
                            int i60 = i59 % 2;
                        }
                        break;
                    case 4:
                        if (N(t2, i23)) {
                            continue;
                            continue;
                        } else {
                            i2 = b + 43;
                            a = i2 % 128;
                            if (i2 % 2 == 0) {
                                ar.n(t2, jL);
                                ar.bkn bknVar5 = ar.h;
                                obj.hashCode();
                                throw null;
                            }
                            ar.h.q(t, jL, ar.n(t2, jL));
                            ac(t, i23);
                            int i61 = b;
                            int i62 = i61 & 53;
                            int i63 = (i61 ^ 53) | i62;
                            int i64 = ((i62 | i63) << 1) - (i63 ^ i62);
                            a = i64 % 128;
                            int i65 = i64 % 2;
                        }
                        break;
                    case 5:
                        if (!N(t2, i23)) {
                            continue;
                        } else {
                            int i66 = a;
                            int i67 = ((i66 | 48) << 1) - (i66 ^ 48);
                            int i68 = (i67 ^ (-1)) + (i67 << 1);
                            b = i68 % 128;
                            int i69 = i68 % 2;
                            ar.z(t, jL, ar.p(t2, jL));
                            int i70 = a;
                            i3 = ((i70 | 65) << 1) - (i70 ^ 65);
                            b = i3 % 128;
                            if (i3 % 2 != 0) {
                                ac(t, i23);
                                throw null;
                            }
                            ac(t, i23);
                            continue;
                            continue;
                        }
                    case 6:
                        if (N(t2, i23)) {
                            continue;
                            continue;
                        } else {
                            int i71 = a + 30;
                            i4 = (i71 ^ (-1)) + (i71 << 1);
                            b = i4 % 128;
                            if (i4 % 2 != 0) {
                                ar.h.q(t, jL, ar.n(t2, jL));
                                throw null;
                            }
                            ar.h.q(t, jL, ar.n(t2, jL));
                            int i72 = a;
                            i5 = (i72 & 55) + (i72 | 55);
                            b = i5 % 128;
                            if (i5 % 2 == 0) {
                                ac(t, i23);
                            } else {
                                ac(t, i23);
                                int i73 = 84 / 0;
                            }
                        }
                        break;
                    case 7:
                        if (!N(t2, i23)) {
                            int i74 = b;
                            int i75 = i74 ^ 63;
                            int i76 = ((i74 & 63) | i75) << 1;
                            int i77 = -i75;
                            int i78 = ((i76 | i77) << 1) - (i76 ^ i77);
                            a = i78 % 128;
                            int i79 = i78 % 2;
                            ar.h.m(t, jL, ar.h(t2, jL));
                            int i80 = a;
                            int i81 = i80 & 67;
                            int i82 = ((i80 ^ 67) | i81) << 1;
                            int i83 = -((i80 | 67) & (~i81));
                            int i84 = ((i82 | i83) << 1) - (i83 ^ i82);
                            b = i84 % 128;
                            int i85 = i84 % 2;
                            ac(t, i23);
                            continue;
                            continue;
                        }
                        break;
                    case 8:
                        if (N(t2, i23)) {
                            continue;
                            continue;
                        } else {
                            int i86 = a;
                            i6 = ((i86 & (-38)) | ((~i86) & 37)) + ((i86 & 37) << 1);
                            b = i6 % 128;
                            if (i6 % 2 != 0) {
                                ar.o(t2, jL);
                                ar.bkn bknVar6 = ar.h;
                                obj.hashCode();
                                throw null;
                            }
                            Object objO3 = ar.o(t2, jL);
                            ar.bkn bknVar7 = ar.h;
                            int i87 = a;
                            int i88 = ((i87 | 55) << 1) - (i87 ^ 55);
                            b = i88 % 128;
                            int i89 = i88 % 2;
                            bknVar7.s(t, jL, objO3);
                            ac(t, i23);
                        }
                        break;
                    case 9:
                        T(t, t2, i23);
                        continue;
                        continue;
                    case 10:
                        if (!(!N(t2, i23))) {
                            continue;
                            continue;
                        } else {
                            int i90 = b;
                            i7 = ((i90 | 97) << 1) - (i90 ^ 97);
                            a = i7 % 128;
                            if (i7 % 2 != 0) {
                                objO = ar.o(t2, jL);
                                bknVar2 = ar.h;
                                int i91 = 66 / 0;
                            } else {
                                objO = ar.o(t2, jL);
                                bknVar2 = ar.h;
                            }
                            bknVar2.s(t, jL, objO);
                            ac(t, i23);
                            int i92 = a;
                            int i93 = (i92 ^ 85) + ((i92 & 85) << 1);
                            b = i93 % 128;
                            int i94 = i93 % 2;
                        }
                        break;
                    case 11:
                        if (!(!N(t2, i23))) {
                            continue;
                            continue;
                        } else {
                            int i95 = b;
                            int i96 = ((i95 & (-36)) | ((~i95) & 35)) + ((i95 & 35) << 1);
                            a = i96 % 128;
                            int i97 = i96 % 2;
                            int iN3 = ar.n(t2, jL);
                            ar.bkn bknVar8 = ar.h;
                            int i98 = b;
                            int i99 = i98 & 31;
                            int i100 = ((i98 | 31) & (~i99)) + (i99 << 1);
                            a = i100 % 128;
                            int i101 = i100 % 2;
                            bknVar8.q(t, jL, iN3);
                            ac(t, i23);
                            int i102 = a;
                            int i103 = (i102 ^ 64) + ((i102 & 64) << 1);
                            int i104 = (i103 ^ (-1)) + (i103 << 1);
                            b = i104 % 128;
                            int i105 = i104 % 2;
                        }
                        break;
                    case 12:
                        if (N(t2, i23)) {
                            continue;
                            continue;
                        } else {
                            int i106 = b;
                            int i107 = (i106 & 19) + (i106 | 19);
                            a = i107 % 128;
                            int i108 = i107 % 2;
                            iN = ar.n(t2, jL);
                            bknVar3 = ar.h;
                            int i109 = a;
                            int i110 = i109 & 115;
                            int i111 = (i109 ^ 115) | i110;
                            i8 = (i110 ^ i111) + ((i111 & i110) << 1);
                            b = i8 % 128;
                            if (i8 % 2 == 0) {
                                bknVar3.q(t, jL, iN);
                                ac(t, i23);
                            } else {
                                bknVar3.q(t, jL, iN);
                                ac(t, i23);
                                int i112 = 12 / 0;
                            }
                        }
                        break;
                    case 13:
                        if (N(t2, i23)) {
                            continue;
                            continue;
                        } else {
                            int i113 = a;
                            int i114 = i113 & 73;
                            i9 = (i114 - (~((i113 ^ 73) | i114))) - 1;
                            b = i9 % 128;
                            if (i9 % 2 != 0) {
                                ar.h.q(t, jL, ar.n(t2, jL));
                                throw null;
                            }
                            ar.h.q(t, jL, ar.n(t2, jL));
                            ac(t, i23);
                            int i115 = a;
                            i10 = (-2) - (((i115 ^ 56) + ((i115 & 56) << 1)) ^ (-1));
                            b = i10 % 128;
                            if (i10 % 2 == 0) {
                                int i116 = 3 % 5;
                            }
                        }
                        break;
                    case IMediaSession.Stub.TRANSACTION_playFromMediaId /* 14 */:
                        if (!N(t2, i23)) {
                            i11 = a + 23;
                            b = i11 % 128;
                            if (i11 % 2 == 0) {
                                ar.z(t, jL, ar.p(t2, jL));
                                int i117 = 51 / 0;
                            } else {
                                ar.z(t, jL, ar.p(t2, jL));
                            }
                            int i118 = a;
                            int i119 = ((i118 | 79) << 1) - (i118 ^ 79);
                            b = i119 % 128;
                            int i120 = i119 % 2;
                            ac(t, i23);
                            int i121 = b;
                            int i122 = ((i121 | 33) << 1) - (i121 ^ 33);
                            a = i122 % 128;
                            int i123 = i122 % 2;
                            continue;
                            continue;
                        }
                        break;
                    case IMediaSession.Stub.TRANSACTION_playFromSearch /* 15 */:
                        if (!N(t2, i23)) {
                            continue;
                        } else {
                            int i124 = b;
                            i12 = (((i124 & (-116)) | ((~i124) & 115)) - (~(-(-((i124 & 115) << 1))))) - 1;
                            a = i12 % 128;
                            if (i12 % 2 == 0) {
                                ar.n(t2, jL);
                                ar.bkn bknVar9 = ar.h;
                                obj.hashCode();
                                throw null;
                            }
                            iN2 = ar.n(t2, jL);
                            bknVar4 = ar.h;
                            int i125 = b;
                            int i126 = i125 & 63;
                            i13 = ((i125 | 63) & (~i126)) + (i126 << 1);
                            a = i13 % 128;
                            if (i13 % 2 == 0) {
                                bknVar4.q(t, jL, iN2);
                                ac(t, i23);
                                throw null;
                            }
                            bknVar4.q(t, jL, iN2);
                            ac(t, i23);
                            continue;
                            continue;
                        }
                    case 16:
                        if (N(t2, i23)) {
                            continue;
                            continue;
                        } else {
                            int i127 = a + 9;
                            b = i127 % 128;
                            int i128 = i127 % 2;
                            ar.z(t, jL, ar.p(t2, jL));
                            int i129 = a;
                            i14 = (i129 ^ 99) + ((i129 & 99) << 1);
                            b = i14 % 128;
                            if (i14 % 2 != 0) {
                                ac(t, i23);
                                throw null;
                            }
                            ac(t, i23);
                            int i130 = a + 61;
                            b = i130 % 128;
                            int i131 = i130 % 2;
                        }
                        break;
                    case IMediaSession.Stub.TRANSACTION_skipToQueueItem /* 17 */:
                        T(t, t2, i23);
                        int i132 = (-2) - ((b + 46) ^ (-1));
                        a = i132 % 128;
                        int i133 = i132 % 2;
                        continue;
                        continue;
                    case IMediaSession.Stub.TRANSACTION_pause /* 18 */:
                    case IMediaSession.Stub.TRANSACTION_stop /* 19 */:
                    case IMediaSession.Stub.TRANSACTION_next /* 20 */:
                    case IMediaSession.Stub.TRANSACTION_previous /* 21 */:
                    case IMediaSession.Stub.TRANSACTION_fastForward /* 22 */:
                    case IMediaSession.Stub.TRANSACTION_rewind /* 23 */:
                    case IMediaSession.Stub.TRANSACTION_seekTo /* 24 */:
                    case IMediaSession.Stub.TRANSACTION_rate /* 25 */:
                    case IMediaSession.Stub.TRANSACTION_sendCustomAction /* 26 */:
                    case IMediaSession.Stub.TRANSACTION_getMetadata /* 27 */:
                    case IMediaSession.Stub.TRANSACTION_getPlaybackState /* 28 */:
                    case IMediaSession.Stub.TRANSACTION_getQueue /* 29 */:
                    case IMediaSession.Stub.TRANSACTION_getQueueTitle /* 30 */:
                    case IMediaSession.Stub.TRANSACTION_getExtras /* 31 */:
                    case IMediaSession.Stub.TRANSACTION_getRatingType /* 32 */:
                    case IMediaSession.Stub.TRANSACTION_prepare /* 33 */:
                    case IMediaSession.Stub.TRANSACTION_prepareFromMediaId /* 34 */:
                    case IMediaSession.Stub.TRANSACTION_prepareFromSearch /* 35 */:
                    case IMediaSession.Stub.TRANSACTION_prepareFromUri /* 36 */:
                    case IMediaSession.Stub.TRANSACTION_getRepeatMode /* 37 */:
                    case IMediaSession.Stub.TRANSACTION_isShuffleModeEnabledRemoved /* 38 */:
                    case IMediaSession.Stub.TRANSACTION_setRepeatMode /* 39 */:
                    case IMediaSession.Stub.TRANSACTION_setShuffleModeEnabledRemoved /* 40 */:
                    case IMediaSession.Stub.TRANSACTION_addQueueItem /* 41 */:
                    case IMediaSession.Stub.TRANSACTION_addQueueItemAt /* 42 */:
                    case IMediaSession.Stub.TRANSACTION_removeQueueItem /* 43 */:
                    case IMediaSession.Stub.TRANSACTION_removeQueueItemAt /* 44 */:
                    case IMediaSession.Stub.TRANSACTION_isCaptioningEnabled /* 45 */:
                    case IMediaSession.Stub.TRANSACTION_setCaptioningEnabled /* 46 */:
                    case IMediaSession.Stub.TRANSACTION_getShuffleMode /* 47 */:
                    case IMediaSession.Stub.TRANSACTION_setShuffleMode /* 48 */:
                    case 49:
                        this.q.d(t, t2, jL);
                        int i134 = a;
                        int i135 = i134 & 63;
                        int i136 = -(-((i134 ^ 63) | i135));
                        int i137 = (i135 & i136) + (i136 | i135);
                        b = i137 % 128;
                        int i138 = i137 % 2;
                        continue;
                        continue;
                    case 50:
                        x = this.u;
                        Class<?> cls2 = ak.c;
                        objO2 = ar.o(t, jL);
                        int i139 = a;
                        i15 = (i139 ^ 55) + ((i139 & 55) << 1);
                        b = i15 % 128;
                        if (i15 % 2 != 0) {
                            ar.o(t2, jL);
                            throw null;
                        }
                        ar.h.s(t, jL, x.b(objO2, ar.o(t2, jL)));
                        int i140 = a;
                        int i141 = i140 & 121;
                        i16 = (((i140 | 121) & (~i141)) - (~(-(-(i141 << 1))))) - 1;
                        b = i16 % 128;
                        if (i16 % 2 == 0) {
                            continue;
                            continue;
                        } else {
                            int i142 = 5 % 5;
                        }
                        break;
                        break;
                    case IMediaSession.Stub.TRANSACTION_rateWithExtras /* 51 */:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!(!P(t2, i34, i23))) {
                            continue;
                            continue;
                        } else {
                            int i143 = b;
                            int i144 = i143 ^ 119;
                            int i145 = (i143 & 119) << 1;
                            int i146 = ((i144 | i145) << 1) - (i145 ^ i144);
                            a = i146 % 128;
                            int i147 = i146 % 2;
                            ar.h.s(t, jL, ar.o(t2, jL));
                            int i148 = b;
                            i17 = (((i148 | 68) << 1) - (i148 ^ 68)) - 1;
                            a = i17 % 128;
                            if (i17 % 2 != 0) {
                                af(t, i34, i23);
                                int i149 = 76 / 0;
                            } else {
                                af(t, i34, i23);
                            }
                            int i150 = b;
                            int i151 = i150 & 81;
                            int i152 = ((i150 | 81) & (~i151)) + (i151 << 1);
                            a = i152 % 128;
                            int i153 = i152 % 2;
                        }
                        break;
                    case 60:
                        S(t, t2, i23);
                        int i154 = a;
                        int i155 = i154 & 121;
                        int i156 = (i154 ^ 121) | i155;
                        int i157 = (i155 & i156) + (i156 | i155);
                        b = i157 % 128;
                        int i158 = i157 % 2;
                        continue;
                        continue;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!(!P(t2, i34, i23))) {
                            continue;
                            continue;
                        } else {
                            int i159 = a + 24;
                            int i160 = (i159 ^ (-1)) + (i159 << 1);
                            b = i160 % 128;
                            int i161 = i160 % 2;
                            ar.h.s(t, jL, ar.o(t2, jL));
                            int i162 = b + 97;
                            a = i162 % 128;
                            int i163 = i162 % 2;
                            af(t, i34, i23);
                            int i164 = a;
                            int i165 = i164 & 59;
                            int i166 = (i164 | 59) & (~i165);
                            int i167 = i165 << 1;
                            int i168 = (i166 ^ i167) + ((i166 & i167) << 1);
                            b = i168 % 128;
                            int i169 = i168 % 2;
                        }
                        break;
                    case 68:
                        S(t, t2, i23);
                        continue;
                        continue;
                    default:
                        continue;
                }
                ac(t, i23);
            } else {
                switch (v(i33)) {
                    case 0:
                        if (N(t2, i23)) {
                            int i410 = b + 115;
                            a = i410 % 128;
                            int i411 = i410 % 2;
                            ar.x(t, jL, ar.l(t2, jL));
                        }
                        break;
                    case 1:
                        if (!(!N(t2, i23))) {
                            continue;
                            continue;
                        } else {
                            int i412 = a;
                            int i413 = i412 & 47;
                            int i414 = (i413 - (~((i412 ^ 47) | i413))) - 1;
                            b = i414 % 128;
                            int i415 = i414 % 2;
                            fM = ar.m(t2, jL);
                            bknVar = ar.h;
                            int i416 = a;
                            int i417 = i416 & 107;
                            i = (((i416 ^ 107) | i417) << 1) - ((i416 | 107) & (~i417));
                            b = i % 128;
                            if (i % 2 != 0) {
                                bknVar.o(t, jL, fM);
                                ac(t, i23);
                                obj.hashCode();
                                throw null;
                            }
                            bknVar.o(t, jL, fM);
                            ac(t, i23);
                        }
                        break;
                    case 2:
                        if (N(t2, i23)) {
                            int i418 = b;
                            int i510 = ((i418 ^ 85) | (i418 & 85)) << 1;
                            int i511 = -(((~i418) & 85) | (i418 & (-86)));
                            int i512 = (i510 & i511) + (i511 | i510);
                            a = i512 % 128;
                            int i513 = i512 % 2;
                            ar.z(t, jL, ar.p(t2, jL));
                        }
                        break;
                    case 3:
                        if (N(t2, i23)) {
                            continue;
                            continue;
                        } else {
                            int i514 = a;
                            int i515 = i514 & 47;
                            int i516 = ((i514 | 47) & (~i515)) + (i515 << 1);
                            b = i516 % 128;
                            int i517 = i516 % 2;
                            ar.z(t, jL, ar.p(t2, jL));
                            ac(t, i23);
                            int i518 = a;
                            int i519 = (-2) - (((i518 & 48) + (i518 | 48)) ^ (-1));
                            b = i519 % 128;
                            int i610 = i519 % 2;
                        }
                        break;
                    case 4:
                        if (N(t2, i23)) {
                            continue;
                            continue;
                        } else {
                            i2 = b + 43;
                            a = i2 % 128;
                            if (i2 % 2 == 0) {
                                ar.n(t2, jL);
                                ar.bkn bknVar10 = ar.h;
                                obj.hashCode();
                                throw null;
                            }
                            ar.h.q(t, jL, ar.n(t2, jL));
                            ac(t, i23);
                            int i611 = b;
                            int i612 = i611 & 53;
                            int i613 = (i611 ^ 53) | i612;
                            int i614 = ((i612 | i613) << 1) - (i613 ^ i612);
                            a = i614 % 128;
                            int i615 = i614 % 2;
                        }
                        break;
                    case 5:
                        if (!N(t2, i23)) {
                            continue;
                        } else {
                            int i616 = a;
                            int i617 = ((i616 | 48) << 1) - (i616 ^ 48);
                            int i618 = (i617 ^ (-1)) + (i617 << 1);
                            b = i618 % 128;
                            int i619 = i618 % 2;
                            ar.z(t, jL, ar.p(t2, jL));
                            int i710 = a;
                            i3 = ((i710 | 65) << 1) - (i710 ^ 65);
                            b = i3 % 128;
                            if (i3 % 2 != 0) {
                                ac(t, i23);
                                throw null;
                            }
                            ac(t, i23);
                            continue;
                            continue;
                        }
                    case 6:
                        if (N(t2, i23)) {
                            continue;
                            continue;
                        } else {
                            int i711 = a + 30;
                            i4 = (i711 ^ (-1)) + (i711 << 1);
                            b = i4 % 128;
                            if (i4 % 2 != 0) {
                                ar.h.q(t, jL, ar.n(t2, jL));
                                throw null;
                            }
                            ar.h.q(t, jL, ar.n(t2, jL));
                            int i712 = a;
                            i5 = (i712 & 55) + (i712 | 55);
                            b = i5 % 128;
                            if (i5 % 2 == 0) {
                                ac(t, i23);
                            } else {
                                ac(t, i23);
                                int i713 = 84 / 0;
                            }
                        }
                        break;
                    case 7:
                        if (!N(t2, i23)) {
                            int i714 = b;
                            int i715 = i714 ^ 63;
                            int i716 = ((i714 & 63) | i715) << 1;
                            int i717 = -i715;
                            int i718 = ((i716 | i717) << 1) - (i716 ^ i717);
                            a = i718 % 128;
                            int i719 = i718 % 2;
                            ar.h.m(t, jL, ar.h(t2, jL));
                            int i810 = a;
                            int i811 = i810 & 67;
                            int i812 = ((i810 ^ 67) | i811) << 1;
                            int i813 = -((i810 | 67) & (~i811));
                            int i814 = ((i812 | i813) << 1) - (i813 ^ i812);
                            b = i814 % 128;
                            int i815 = i814 % 2;
                            ac(t, i23);
                            continue;
                            continue;
                        }
                        break;
                    case 8:
                        if (N(t2, i23)) {
                            continue;
                            continue;
                        } else {
                            int i816 = a;
                            i6 = ((i816 & (-38)) | ((~i816) & 37)) + ((i816 & 37) << 1);
                            b = i6 % 128;
                            if (i6 % 2 != 0) {
                                ar.o(t2, jL);
                                ar.bkn bknVar11 = ar.h;
                                obj.hashCode();
                                throw null;
                            }
                            Object objO4 = ar.o(t2, jL);
                            ar.bkn bknVar12 = ar.h;
                            int i817 = a;
                            int i818 = ((i817 | 55) << 1) - (i817 ^ 55);
                            b = i818 % 128;
                            int i819 = i818 % 2;
                            bknVar12.s(t, jL, objO4);
                            ac(t, i23);
                        }
                        break;
                    case 9:
                        T(t, t2, i23);
                        continue;
                        continue;
                    case 10:
                        if (!(!N(t2, i23))) {
                            continue;
                            continue;
                        } else {
                            int i910 = b;
                            i7 = ((i910 | 97) << 1) - (i910 ^ 97);
                            a = i7 % 128;
                            if (i7 % 2 != 0) {
                                objO = ar.o(t2, jL);
                                bknVar2 = ar.h;
                                int i911 = 66 / 0;
                            } else {
                                objO = ar.o(t2, jL);
                                bknVar2 = ar.h;
                            }
                            bknVar2.s(t, jL, objO);
                            ac(t, i23);
                            int i912 = a;
                            int i913 = (i912 ^ 85) + ((i912 & 85) << 1);
                            b = i913 % 128;
                            int i914 = i913 % 2;
                        }
                        break;
                    case 11:
                        if (!(!N(t2, i23))) {
                            continue;
                            continue;
                        } else {
                            int i915 = b;
                            int i916 = ((i915 & (-36)) | ((~i915) & 35)) + ((i915 & 35) << 1);
                            a = i916 % 128;
                            int i917 = i916 % 2;
                            int iN4 = ar.n(t2, jL);
                            ar.bkn bknVar13 = ar.h;
                            int i918 = b;
                            int i919 = i918 & 31;
                            int i1010 = ((i918 | 31) & (~i919)) + (i919 << 1);
                            a = i1010 % 128;
                            int i1011 = i1010 % 2;
                            bknVar13.q(t, jL, iN4);
                            ac(t, i23);
                            int i1012 = a;
                            int i1013 = (i1012 ^ 64) + ((i1012 & 64) << 1);
                            int i1014 = (i1013 ^ (-1)) + (i1013 << 1);
                            b = i1014 % 128;
                            int i1015 = i1014 % 2;
                        }
                        break;
                    case 12:
                        if (N(t2, i23)) {
                            continue;
                            continue;
                        } else {
                            int i1016 = b;
                            int i1017 = (i1016 & 19) + (i1016 | 19);
                            a = i1017 % 128;
                            int i1018 = i1017 % 2;
                            iN = ar.n(t2, jL);
                            bknVar3 = ar.h;
                            int i1019 = a;
                            int i1110 = i1019 & 115;
                            int i1111 = (i1019 ^ 115) | i1110;
                            i8 = (i1110 ^ i1111) + ((i1111 & i1110) << 1);
                            b = i8 % 128;
                            if (i8 % 2 == 0) {
                                bknVar3.q(t, jL, iN);
                                ac(t, i23);
                            } else {
                                bknVar3.q(t, jL, iN);
                                ac(t, i23);
                                int i1112 = 12 / 0;
                            }
                        }
                        break;
                    case 13:
                        if (N(t2, i23)) {
                            continue;
                            continue;
                        } else {
                            int i1113 = a;
                            int i1114 = i1113 & 73;
                            i9 = (i1114 - (~((i1113 ^ 73) | i1114))) - 1;
                            b = i9 % 128;
                            if (i9 % 2 != 0) {
                                ar.h.q(t, jL, ar.n(t2, jL));
                                throw null;
                            }
                            ar.h.q(t, jL, ar.n(t2, jL));
                            ac(t, i23);
                            int i1115 = a;
                            i10 = (-2) - (((i1115 ^ 56) + ((i1115 & 56) << 1)) ^ (-1));
                            b = i10 % 128;
                            if (i10 % 2 == 0) {
                                int i1116 = 3 % 5;
                            }
                        }
                        break;
                    case IMediaSession.Stub.TRANSACTION_playFromMediaId /* 14 */:
                        if (!N(t2, i23)) {
                            i11 = a + 23;
                            b = i11 % 128;
                            if (i11 % 2 == 0) {
                                ar.z(t, jL, ar.p(t2, jL));
                                int i1117 = 51 / 0;
                            } else {
                                ar.z(t, jL, ar.p(t2, jL));
                            }
                            int i1118 = a;
                            int i1119 = ((i1118 | 79) << 1) - (i1118 ^ 79);
                            b = i1119 % 128;
                            int i1210 = i1119 % 2;
                            ac(t, i23);
                            int i1211 = b;
                            int i1212 = ((i1211 | 33) << 1) - (i1211 ^ 33);
                            a = i1212 % 128;
                            int i1213 = i1212 % 2;
                            continue;
                            continue;
                        }
                        break;
                    case IMediaSession.Stub.TRANSACTION_playFromSearch /* 15 */:
                        if (!N(t2, i23)) {
                            continue;
                        } else {
                            int i1214 = b;
                            i12 = (((i1214 & (-116)) | ((~i1214) & 115)) - (~(-(-((i1214 & 115) << 1))))) - 1;
                            a = i12 % 128;
                            if (i12 % 2 == 0) {
                                ar.n(t2, jL);
                                ar.bkn bknVar14 = ar.h;
                                obj.hashCode();
                                throw null;
                            }
                            iN2 = ar.n(t2, jL);
                            bknVar4 = ar.h;
                            int i1215 = b;
                            int i1216 = i1215 & 63;
                            i13 = ((i1215 | 63) & (~i1216)) + (i1216 << 1);
                            a = i13 % 128;
                            if (i13 % 2 == 0) {
                                bknVar4.q(t, jL, iN2);
                                ac(t, i23);
                                throw null;
                            }
                            bknVar4.q(t, jL, iN2);
                            ac(t, i23);
                            continue;
                            continue;
                        }
                    case 16:
                        if (N(t2, i23)) {
                            continue;
                            continue;
                        } else {
                            int i1217 = a + 9;
                            b = i1217 % 128;
                            int i1218 = i1217 % 2;
                            ar.z(t, jL, ar.p(t2, jL));
                            int i1219 = a;
                            i14 = (i1219 ^ 99) + ((i1219 & 99) << 1);
                            b = i14 % 128;
                            if (i14 % 2 != 0) {
                                ac(t, i23);
                                throw null;
                            }
                            ac(t, i23);
                            int i1310 = a + 61;
                            b = i1310 % 128;
                            int i1311 = i1310 % 2;
                        }
                        break;
                    case IMediaSession.Stub.TRANSACTION_skipToQueueItem /* 17 */:
                        T(t, t2, i23);
                        int i1312 = (-2) - ((b + 46) ^ (-1));
                        a = i1312 % 128;
                        int i1313 = i1312 % 2;
                        continue;
                        continue;
                    case IMediaSession.Stub.TRANSACTION_pause /* 18 */:
                    case IMediaSession.Stub.TRANSACTION_stop /* 19 */:
                    case IMediaSession.Stub.TRANSACTION_next /* 20 */:
                    case IMediaSession.Stub.TRANSACTION_previous /* 21 */:
                    case IMediaSession.Stub.TRANSACTION_fastForward /* 22 */:
                    case IMediaSession.Stub.TRANSACTION_rewind /* 23 */:
                    case IMediaSession.Stub.TRANSACTION_seekTo /* 24 */:
                    case IMediaSession.Stub.TRANSACTION_rate /* 25 */:
                    case IMediaSession.Stub.TRANSACTION_sendCustomAction /* 26 */:
                    case IMediaSession.Stub.TRANSACTION_getMetadata /* 27 */:
                    case IMediaSession.Stub.TRANSACTION_getPlaybackState /* 28 */:
                    case IMediaSession.Stub.TRANSACTION_getQueue /* 29 */:
                    case IMediaSession.Stub.TRANSACTION_getQueueTitle /* 30 */:
                    case IMediaSession.Stub.TRANSACTION_getExtras /* 31 */:
                    case IMediaSession.Stub.TRANSACTION_getRatingType /* 32 */:
                    case IMediaSession.Stub.TRANSACTION_prepare /* 33 */:
                    case IMediaSession.Stub.TRANSACTION_prepareFromMediaId /* 34 */:
                    case IMediaSession.Stub.TRANSACTION_prepareFromSearch /* 35 */:
                    case IMediaSession.Stub.TRANSACTION_prepareFromUri /* 36 */:
                    case IMediaSession.Stub.TRANSACTION_getRepeatMode /* 37 */:
                    case IMediaSession.Stub.TRANSACTION_isShuffleModeEnabledRemoved /* 38 */:
                    case IMediaSession.Stub.TRANSACTION_setRepeatMode /* 39 */:
                    case IMediaSession.Stub.TRANSACTION_setShuffleModeEnabledRemoved /* 40 */:
                    case IMediaSession.Stub.TRANSACTION_addQueueItem /* 41 */:
                    case IMediaSession.Stub.TRANSACTION_addQueueItemAt /* 42 */:
                    case IMediaSession.Stub.TRANSACTION_removeQueueItem /* 43 */:
                    case IMediaSession.Stub.TRANSACTION_removeQueueItemAt /* 44 */:
                    case IMediaSession.Stub.TRANSACTION_isCaptioningEnabled /* 45 */:
                    case IMediaSession.Stub.TRANSACTION_setCaptioningEnabled /* 46 */:
                    case IMediaSession.Stub.TRANSACTION_getShuffleMode /* 47 */:
                    case IMediaSession.Stub.TRANSACTION_setShuffleMode /* 48 */:
                    case 49:
                        this.q.d(t, t2, jL);
                        int i1314 = a;
                        int i1315 = i1314 & 63;
                        int i1316 = -(-((i1314 ^ 63) | i1315));
                        int i1317 = (i1315 & i1316) + (i1316 | i1315);
                        b = i1317 % 128;
                        int i1318 = i1317 % 2;
                        continue;
                        continue;
                    case 50:
                        x = this.u;
                        Class<?> cls3 = ak.c;
                        objO2 = ar.o(t, jL);
                        int i1319 = a;
                        i15 = (i1319 ^ 55) + ((i1319 & 55) << 1);
                        b = i15 % 128;
                        if (i15 % 2 != 0) {
                            ar.o(t2, jL);
                            throw null;
                        }
                        ar.h.s(t, jL, x.b(objO2, ar.o(t2, jL)));
                        int i1410 = a;
                        int i1411 = i1410 & 121;
                        i16 = (((i1410 | 121) & (~i1411)) - (~(-(-(i1411 << 1))))) - 1;
                        b = i16 % 128;
                        if (i16 % 2 == 0) {
                            continue;
                            continue;
                        } else {
                            int i1412 = 5 % 5;
                        }
                        break;
                        break;
                    case IMediaSession.Stub.TRANSACTION_rateWithExtras /* 51 */:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!(!P(t2, i34, i23))) {
                            continue;
                            continue;
                        } else {
                            int i1413 = b;
                            int i1414 = i1413 ^ 119;
                            int i1415 = (i1413 & 119) << 1;
                            int i1416 = ((i1414 | i1415) << 1) - (i1415 ^ i1414);
                            a = i1416 % 128;
                            int i1417 = i1416 % 2;
                            ar.h.s(t, jL, ar.o(t2, jL));
                            int i1418 = b;
                            i17 = (((i1418 | 68) << 1) - (i1418 ^ 68)) - 1;
                            a = i17 % 128;
                            if (i17 % 2 != 0) {
                                af(t, i34, i23);
                                int i1419 = 76 / 0;
                            } else {
                                af(t, i34, i23);
                            }
                            int i1510 = b;
                            int i1511 = i1510 & 81;
                            int i1512 = ((i1510 | 81) & (~i1511)) + (i1511 << 1);
                            a = i1512 % 128;
                            int i1513 = i1512 % 2;
                        }
                        break;
                    case 60:
                        S(t, t2, i23);
                        int i1514 = a;
                        int i1515 = i1514 & 121;
                        int i1516 = (i1514 ^ 121) | i1515;
                        int i1517 = (i1515 & i1516) + (i1516 | i1515);
                        b = i1517 % 128;
                        int i1518 = i1517 % 2;
                        continue;
                        continue;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!(!P(t2, i34, i23))) {
                            continue;
                            continue;
                        } else {
                            int i1519 = a + 24;
                            int i1610 = (i1519 ^ (-1)) + (i1519 << 1);
                            b = i1610 % 128;
                            int i1611 = i1610 % 2;
                            ar.h.s(t, jL, ar.o(t2, jL));
                            int i1612 = b + 97;
                            a = i1612 % 128;
                            int i1613 = i1612 % 2;
                            af(t, i34, i23);
                            int i1614 = a;
                            int i1615 = i1614 & 59;
                            int i1616 = (i1614 | 59) & (~i1615);
                            int i1617 = i1615 << 1;
                            int i1618 = (i1616 ^ i1617) + ((i1616 & i1617) << 1);
                            b = i1618 % 128;
                            int i1619 = i1618 % 2;
                        }
                        break;
                    case 68:
                        S(t, t2, i23);
                        continue;
                        continue;
                    default:
                        continue;
                }
                ac(t, i23);
            }
            int i170 = (((i23 | 104) << 1) - (i23 ^ 104)) - 1;
            int i171 = i170 & (-100);
            int i172 = i170 | (-100);
            i23 = (i171 | i172) + (i171 & i172);
            int i173 = b;
            int i174 = (i173 ^ 100) + ((i173 & 100) << 1);
            int i175 = (i174 ^ (-1)) + (i174 << 1);
            a = i175 % 128;
            int i176 = i175 % 2;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 27241. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int X(T r34, byte[] r35, int r36, int r37, int r38, ivas.gov.bisp.enumeration.aD.C0049e.biK r39) throws ivas.gov.bisp.enumeration.aD.C0065v {
        /*
            Method dump skipped, instruction units count: 2724
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.ad.X(java.lang.Object, byte[], int, int, int, ivas.gov.bisp.enumeration.aD.e$biK):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:215:0x0554  */
    /* JADX WARN: Code duplicated, block: B:226:0x058e  */
    /* JADX WARN: Code duplicated, block: B:301:0x081d A[PHI: r8
  0x081d: PHI (r8v8 int) = 
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v9 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v10 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
  (r8v1 int)
 binds: [B:25:0x00a3, B:303:0x0822, B:295:0x07fc, B:292:0x07ea, B:285:0x07c5, B:282:0x07b8, B:277:0x0797, B:274:0x0778, B:270:0x076d, B:267:0x0760, B:264:0x0753, B:258:0x0728, B:218:0x0574, B:207:0x0530, B:198:0x04fd, B:189:0x04ae, B:178:0x0479, B:171:0x0449, B:165:0x041d, B:152:0x03d9, B:143:0x03a4, B:137:0x036d, B:128:0x0334, B:121:0x0314, B:115:0x02f6, B:113:0x02f3, B:228:0x059a, B:105:0x02ba, B:103:0x02b7, B:92:0x0255, B:89:0x0249, B:82:0x021e, B:79:0x020e, B:76:0x01f1, B:73:0x01e5, B:69:0x01d6, B:66:0x01bb, B:300:0x0813, B:60:0x019d, B:57:0x0189, B:54:0x0153, B:50:0x0141, B:47:0x0130, B:44:0x0121, B:41:0x0115, B:38:0x0105, B:35:0x00f5, B:28:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02b7, code lost:
    
        if (r4 > 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02ba, code lost:
    
        if (r4 > 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02bc, code lost:
    
        r5 = r5 + 13;
        ivas.gov.bisp.enumeration.aD.ad.a = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02c5, code lost:
    
        if (r19.e == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02c7, code lost:
    
        r3.putInt(r20, r6, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02cb, code lost:
    
        r5 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.bT(r12);
        r6 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.bU(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02f3, code lost:
    
        if (r4 > 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02f6, code lost:
    
        if (r4 > 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02fa, code lost:
    
        if (r19.e == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02fc, code lost:
    
        r3.putInt(r20, r6, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0300, code lost:
    
        r5 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.bT(r12);
        r6 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.bU(r4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int M(T r20) {
        /*
            Method dump skipped, instruction units count: 2620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.ad.M(java.lang.Object):int");
    }

    /* JADX WARN: Code duplicated, block: B:320:0x09e3 A[LOOP:3: B:318:0x09df->B:320:0x09e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:322:0x09fc  */
    /* JADX WARN: Code duplicated, block: B:325:0x0a02  */
    /* JADX WARN: Code duplicated, block: B:327:0x0a1e A[Catch: all -> 0x0a6b, TRY_ENTER, TryCatch #1 {all -> 0x0a6b, blocks: (B:3:0x0010, B:17:0x004b, B:24:0x0073, B:25:0x0077, B:26:0x0086, B:28:0x008c, B:32:0x0096, B:33:0x009a, B:20:0x0053, B:43:0x00c4, B:44:0x00c8, B:49:0x00da, B:296:0x098d, B:311:0x09cf, B:313:0x09d5, B:327:0x0a1e, B:328:0x0a24, B:329:0x0a28, B:330:0x0a29, B:51:0x00e0, B:52:0x00f4, B:53:0x0108, B:56:0x0123, B:58:0x0136, B:57:0x012f, B:59:0x013b, B:60:0x014f, B:61:0x0163, B:64:0x0181, B:67:0x0188, B:68:0x018e, B:69:0x019e, B:72:0x01c2, B:75:0x01cc, B:74:0x01c9, B:76:0x01d1, B:79:0x01ef, B:81:0x01f5, B:85:0x0236, B:82:0x0211, B:84:0x0228, B:88:0x024d, B:91:0x0266, B:92:0x026b, B:93:0x0272, B:94:0x0273, B:95:0x0287, B:98:0x029b, B:101:0x02a8, B:100:0x02a4, B:102:0x02b4, B:103:0x02c8, B:104:0x02dc, B:105:0x02f0, B:107:0x0309, B:110:0x031c, B:111:0x0325, B:112:0x032a, B:113:0x033e, B:115:0x0361, B:117:0x0369, B:118:0x037a, B:120:0x038c, B:121:0x0391, B:124:0x03b6, B:125:0x03bb, B:126:0x03c2, B:127:0x03c3, B:128:0x03d3, B:130:0x03ec, B:131:0x03f1, B:132:0x0401, B:133:0x0419, B:135:0x0437, B:136:0x043c, B:137:0x044c, B:139:0x046a, B:140:0x046f, B:143:0x0486, B:144:0x048b, B:145:0x048f, B:146:0x0490, B:149:0x04a3, B:150:0x04b0, B:154:0x04bd, B:157:0x04d2, B:158:0x04db, B:159:0x04e2, B:160:0x04e3, B:161:0x04f3, B:164:0x0516, B:165:0x051f, B:166:0x0524, B:167:0x0534, B:168:0x0544, B:169:0x0554, B:172:0x0572, B:173:0x0577, B:174:0x057e, B:175:0x057f, B:176:0x058f, B:179:0x05b6, B:180:0x05bc, B:181:0x05c0, B:182:0x05c1, B:184:0x05e1, B:186:0x05fd, B:187:0x0602, B:189:0x0615, B:191:0x062b, B:192:0x0630, B:193:0x0643, B:194:0x0649, B:197:0x065b, B:200:0x0670, B:199:0x0668, B:201:0x0675, B:202:0x0685, B:203:0x0695, B:206:0x06a8, B:208:0x06be, B:210:0x06c4, B:211:0x06c5, B:212:0x06d5, B:213:0x06e5, B:215:0x06f2, B:216:0x06ff, B:217:0x070f, B:219:0x0716, B:221:0x072b, B:224:0x073e, B:225:0x074f, B:226:0x0753, B:227:0x0754, B:229:0x076a, B:232:0x0786, B:234:0x0791, B:233:0x078e, B:235:0x0796, B:236:0x07a7, B:237:0x07b8, B:238:0x07c9, B:239:0x07da, B:241:0x07e5, B:244:0x07ec, B:245:0x07f2, B:249:0x080f, B:250:0x0813, B:251:0x0814, B:253:0x0833, B:254:0x0838, B:255:0x0849, B:257:0x0851, B:258:0x086e, B:261:0x0886, B:262:0x088e, B:263:0x0895, B:266:0x08af, B:267:0x08b7, B:271:0x08bd, B:274:0x08d4, B:275:0x08d9, B:276:0x08e0, B:277:0x08e1, B:278:0x08f2, B:279:0x0903, B:282:0x0920, B:283:0x0928, B:284:0x092c, B:287:0x0944, B:288:0x0948, B:289:0x094f, B:290:0x0950, B:292:0x0966, B:293:0x096a, B:294:0x097a), top: B:351:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:332:0x0a30  */
    /* JADX WARN: Code duplicated, block: B:336:0x0a3a A[LOOP:2: B:334:0x0a36->B:336:0x0a3a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:338:0x0a67  */
    /* JADX WARN: Code duplicated, block: B:377:0x0a00 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:378:0x09dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:382:0x0a24 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x0a34 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:454:0x09d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:469:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:470:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final <UT, UB, ET extends o00Ooo.OooO00o<ET>> void R(o00O00<UT, UB> o00o00, o0OoOo0<ET> o0oooo0, T t, ag agVar, J j) throws Throwable {
        Object obj;
        int i;
        int i2;
        int i3;
        int i4;
        List<Boolean> listE;
        int iH;
        int i5 = 2;
        int i6 = 2 % 2;
        Throwable th = null;
        Object objJ = null;
        C0056m c0056mG = null;
        while (true) {
            try {
                int iM = agVar.M();
                int iAa = aa(iM);
                if (iAa < 0) {
                    int i7 = a;
                    int i8 = i7 & 123;
                    int i9 = (i8 - (~((i7 ^ 123) | i8))) - 1;
                    b = i9 % 128;
                    if (i9 % i5 == 0) {
                        throw th;
                    }
                    if (iM == Integer.MAX_VALUE) {
                        for (int i10 = this.f56o; i10 < this.p; i10 = ((i10 & 1) << 1) + (i10 ^ 1)) {
                            H(t, this.n[i10], objJ, o00o00);
                        }
                        if (objJ != null) {
                            o00o00.o(t, objJ);
                            return;
                        }
                        return;
                    }
                    if (this.j) {
                        Object objE = o0oooo0.e(j, this.k, iM);
                        int i11 = a;
                        int i12 = i11 ^ 101;
                        int i13 = -(-((i11 & 101) << 1));
                        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                        b = i14 % 128;
                        int i15 = i14 % i5;
                        obj = objE;
                    } else {
                        obj = th;
                    }
                    if (obj != null) {
                        if (c0056mG == null) {
                            c0056mG = o0oooo0.g(t);
                        }
                        objJ = o0oooo0.j(agVar, obj, j, c0056mG, objJ, o00o00);
                    } else if (!o00o00.r(agVar)) {
                        if (objJ == null) {
                            objJ = o00o00.h(t);
                        }
                        if (!o00o00.n(objJ, agVar)) {
                        }
                    } else if (agVar.s()) {
                        i5 = 2;
                        th = null;
                    }
                } else {
                    int iAg = ag(iAa);
                    try {
                        switch (v(iAg)) {
                            case 0:
                                ar.x(t, l(iAg), agVar.readDouble());
                                ac(t, iAa);
                                i5 = 2;
                                th = null;
                                break;
                            case 1:
                                ar.w(t, l(iAg), agVar.readFloat());
                                ac(t, iAa);
                                i5 = 2;
                                th = null;
                                break;
                            case 2:
                                ar.z(t, l(iAg), agVar.E());
                                int i16 = a + 117;
                                b = i16 % 128;
                                int i17 = i16 % 2;
                                ac(t, iAa);
                                i5 = 2;
                                th = null;
                                break;
                            case 3:
                                ar.z(t, l(iAg), agVar.o());
                                int i18 = b + 61;
                                a = i18 % 128;
                                if (i18 % 2 != 0) {
                                    ac(t, iAa);
                                    Object obj2 = null;
                                    obj2.hashCode();
                                    throw null;
                                }
                                ac(t, iAa);
                                i5 = 2;
                                th = null;
                                break;
                                break;
                            case 4:
                                ar.y(t, l(iAg), agVar.h());
                                int i19 = a;
                                int i20 = ((i19 ^ 18) + ((i19 & 18) << 1)) - 1;
                                b = i20 % 128;
                                if (i20 % 2 == 0) {
                                    ac(t, iAa);
                                    int i21 = 13 / 0;
                                } else {
                                    ac(t, iAa);
                                }
                                i5 = 2;
                                th = null;
                                break;
                            case 5:
                                ar.z(t, l(iAg), agVar.p());
                                ac(t, iAa);
                                i5 = 2;
                                th = null;
                                break;
                            case 6:
                                ar.y(t, l(iAg), agVar.H());
                                ac(t, iAa);
                                i5 = 2;
                                th = null;
                                break;
                            case 7:
                                ar.r(t, l(iAg), agVar.L());
                                int i22 = a + 41;
                                b = i22 % 128;
                                if (i22 % 2 == 0) {
                                    ac(t, iAa);
                                    Object obj3 = null;
                                    obj3.hashCode();
                                    throw null;
                                }
                                ac(t, iAa);
                                i5 = 2;
                                th = null;
                                break;
                                break;
                            case 8:
                                int i23 = a;
                                int i24 = (i23 & (-28)) | (27 & (~i23));
                                int i25 = (i23 & 27) << 1;
                                int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
                                b = i26 % 128;
                                if (i26 % 2 == 0) {
                                    ae(t, iAg, agVar);
                                    throw null;
                                }
                                ae(t, iAg, agVar);
                                ac(t, iAa);
                                i5 = 2;
                                th = null;
                                break;
                                break;
                            case 9:
                                if (!(!N(t, iAa))) {
                                    ar.v(t, l(iAg), R.d(ar.o(t, l(iAg)), agVar.q(K(iAa), j)));
                                } else {
                                    long jL = l(iAg);
                                    Object objQ = agVar.q(K(iAa), j);
                                    int i27 = b + 59;
                                    a = i27 % 128;
                                    if (i27 % 2 != 0) {
                                        ar.v(t, jL, objQ);
                                        Object obj4 = null;
                                        obj4.hashCode();
                                        throw null;
                                    }
                                    ar.v(t, jL, objQ);
                                    ac(t, iAa);
                                }
                                i5 = 2;
                                th = null;
                                break;
                            case 10:
                                ar.v(t, l(iAg), agVar.d());
                                ac(t, iAa);
                                i5 = 2;
                                th = null;
                                break;
                            case 11:
                                ar.y(t, l(iAg), agVar.n());
                                int i28 = a;
                                int i29 = i28 & 105;
                                int i30 = (((i28 ^ 105) | i29) << 1) - ((i28 | 105) & (~i29));
                                b = i30 % 128;
                                int i31 = i30 % 2;
                                ac(t, iAa);
                                i5 = 2;
                                th = null;
                                break;
                            case 12:
                                int iF = agVar.f();
                                R.bkH bkhJ = J(iAa);
                                if (bkhJ == null || bkhJ.b(iF)) {
                                    ar.y(t, l(iAg), iF);
                                    int i32 = a;
                                    int i33 = i32 & 79;
                                    int i34 = (((i32 ^ 79) | i33) << 1) - ((i32 | 79) & (~i33));
                                    b = i34 % 128;
                                    if (i34 % 2 == 0) {
                                        ac(t, iAa);
                                        throw null;
                                    }
                                    ac(t, iAa);
                                } else {
                                    objJ = ak.C(iM, iF, objJ, o00o00);
                                }
                                i5 = 2;
                                th = null;
                                break;
                            case 13:
                                ar.y(t, l(iAg), agVar.x());
                                ac(t, iAa);
                                i5 = 2;
                                th = null;
                                break;
                            case IMediaSession.Stub.TRANSACTION_playFromMediaId /* 14 */:
                                ar.z(t, l(iAg), agVar.P());
                                ac(t, iAa);
                                i5 = 2;
                                th = null;
                                break;
                            case IMediaSession.Stub.TRANSACTION_playFromSearch /* 15 */:
                                ar.y(t, l(iAg), agVar.t());
                                ac(t, iAa);
                                i5 = 2;
                                th = null;
                                break;
                            case 16:
                                ar.z(t, l(iAg), agVar.y());
                                ac(t, iAa);
                                i5 = 2;
                                th = null;
                                break;
                            case IMediaSession.Stub.TRANSACTION_skipToQueueItem /* 17 */:
                                if (N(t, iAa)) {
                                    Object objO = ar.o(t, l(iAg));
                                    int i35 = b;
                                    int i36 = (i35 & 63) + (i35 | 63);
                                    a = i36 % 128;
                                    int i37 = i36 % 2;
                                    ah ahVarK = K(iAa);
                                    int i38 = a;
                                    int i39 = i38 & 35;
                                    int i40 = i39 + ((i38 ^ 35) | i39);
                                    b = i40 % 128;
                                    if (i40 % 2 == 0) {
                                        Object obj5 = null;
                                        obj5.hashCode();
                                        throw null;
                                    }
                                    ar.v(t, l(iAg), R.d(objO, agVar.e(ahVarK, j)));
                                } else {
                                    long jL2 = l(iAg);
                                    int i41 = a;
                                    int i42 = i41 ^ 11;
                                    int i43 = ((((i41 & 11) | i42) << 1) - (~(-i42))) - 1;
                                    b = i43 % 128;
                                    int i44 = i43 % 2;
                                    Object objE2 = agVar.e(K(iAa), j);
                                    int i45 = a;
                                    int i46 = (-2) - ((((i45 | 100) << 1) - (i45 ^ 100)) ^ (-1));
                                    b = i46 % 128;
                                    if (i46 % 2 == 0) {
                                        ar.v(t, jL2, objE2);
                                        int i47 = 18 / 0;
                                    } else {
                                        ar.v(t, jL2, objE2);
                                    }
                                    ac(t, iAa);
                                }
                                i5 = 2;
                                th = null;
                                break;
                            case IMediaSession.Stub.TRANSACTION_pause /* 18 */:
                                agVar.w(this.q.e(t, l(iAg)));
                                i5 = 2;
                                th = null;
                                break;
                            case IMediaSession.Stub.TRANSACTION_stop /* 19 */:
                                AbstractC0068y abstractC0068y = this.q;
                                int i48 = a + 37;
                                b = i48 % 128;
                                int i49 = i48 % 2;
                                agVar.g(abstractC0068y.e(t, l(iAg)));
                                i5 = 2;
                                th = null;
                                break;
                            case IMediaSession.Stub.TRANSACTION_next /* 20 */:
                                agVar.C(this.q.e(t, l(iAg)));
                                i5 = 2;
                                th = null;
                                break;
                            case IMediaSession.Stub.TRANSACTION_previous /* 21 */:
                                agVar.b(this.q.e(t, l(iAg)));
                                i5 = 2;
                                th = null;
                                break;
                            case IMediaSession.Stub.TRANSACTION_fastForward /* 22 */:
                                AbstractC0068y abstractC0068y2 = this.q;
                                int i50 = a;
                                int i51 = i50 & 103;
                                int i52 = i51 + ((i50 ^ 103) | i51);
                                b = i52 % 128;
                                if (i52 % 2 == 0) {
                                    throw null;
                                }
                                List<Integer> listE2 = abstractC0068y2.e(t, l(iAg));
                                int i53 = b;
                                int i54 = (i53 ^ 65) + ((i53 & 65) << 1);
                                a = i54 % 128;
                                int i55 = i54 % 2;
                                agVar.K(listE2);
                                i5 = 2;
                                th = null;
                                break;
                                break;
                            case IMediaSession.Stub.TRANSACTION_rewind /* 23 */:
                                agVar.J(this.q.e(t, l(iAg)));
                                i5 = 2;
                                th = null;
                                break;
                            case IMediaSession.Stub.TRANSACTION_seekTo /* 24 */:
                                agVar.i(this.q.e(t, l(iAg)));
                                i5 = 2;
                                th = null;
                                break;
                            case IMediaSession.Stub.TRANSACTION_rate /* 25 */:
                                AbstractC0068y abstractC0068y3 = this.q;
                                int i56 = b;
                                int i57 = (i56 & 87) + (i56 | 87);
                                a = i57 % 128;
                                if (i57 % 2 != 0) {
                                    listE = abstractC0068y3.e(t, l(iAg));
                                    int i58 = 27 / 0;
                                } else {
                                    listE = abstractC0068y3.e(t, l(iAg));
                                }
                                agVar.B(listE);
                                i5 = 2;
                                th = null;
                                break;
                            case IMediaSession.Stub.TRANSACTION_sendCustomAction /* 26 */:
                                ad(t, iAg, agVar);
                                i5 = 2;
                                th = null;
                                break;
                            case IMediaSession.Stub.TRANSACTION_getMetadata /* 27 */:
                                U(t, iAg, agVar, K(iAa), j);
                                i5 = 2;
                                th = null;
                                break;
                            case IMediaSession.Stub.TRANSACTION_getPlaybackState /* 28 */:
                                AbstractC0068y abstractC0068y4 = this.q;
                                int i59 = b;
                                int i60 = ((i59 & (-60)) | ((~i59) & 59)) + ((i59 & 59) << 1);
                                a = i60 % 128;
                                int i61 = i60 % 2;
                                List<AbstractC0069z> listE3 = abstractC0068y4.e(t, l(iAg));
                                int i62 = b;
                                int i63 = i62 & 39;
                                int i64 = i63 + ((i62 ^ 39) | i63);
                                a = i64 % 128;
                                int i65 = i64 % 2;
                                agVar.z(listE3);
                                i5 = 2;
                                th = null;
                                break;
                            case IMediaSession.Stub.TRANSACTION_getQueue /* 29 */:
                                AbstractC0068y abstractC0068y5 = this.q;
                                int i66 = a;
                                int i67 = i66 ^ 7;
                                int i68 = (i66 & 7) << 1;
                                int i69 = (i67 ^ i68) + ((i68 & i67) << 1);
                                int i70 = i69 % 128;
                                b = i70;
                                int i71 = i69 % 2;
                                int i72 = ((i70 | 101) << 1) - (i70 ^ 101);
                                a = i72 % 128;
                                int i73 = i72 % 2;
                                List<Integer> listE4 = abstractC0068y5.e(t, l(iAg));
                                int i74 = a;
                                int i75 = i74 & 3;
                                int i76 = -(-((i74 ^ 3) | i75));
                                int i77 = ((i75 | i76) << 1) - (i76 ^ i75);
                                b = i77 % 128;
                                int i78 = i77 % 2;
                                agVar.A(listE4);
                                i5 = 2;
                                th = null;
                                break;
                            case IMediaSession.Stub.TRANSACTION_getQueueTitle /* 30 */:
                                List<Integer> listE5 = this.q.e(t, l(iAg));
                                agVar.I(listE5);
                                R.bkH bkhJ2 = J(iAa);
                                int i79 = a;
                                int i80 = i79 & 117;
                                int i81 = (i79 | 117) & (~i80);
                                int i82 = i80 << 1;
                                int i83 = (i81 & i82) + (i81 | i82);
                                b = i83 % 128;
                                if (i83 % 2 == 0) {
                                    ak.A(iM, listE5, bkhJ2, objJ, o00o00);
                                    throw null;
                                }
                                objJ = ak.A(iM, listE5, bkhJ2, objJ, o00o00);
                                i5 = 2;
                                th = null;
                                break;
                                break;
                            case IMediaSession.Stub.TRANSACTION_getExtras /* 31 */:
                                agVar.j(this.q.e(t, l(iAg)));
                                i5 = 2;
                                th = null;
                                break;
                            case IMediaSession.Stub.TRANSACTION_getRatingType /* 32 */:
                                List<Long> listE6 = this.q.e(t, l(iAg));
                                int i84 = b;
                                int i85 = i84 & 27;
                                int i86 = (i84 ^ 27) | i85;
                                int i87 = (i85 & i86) + (i86 | i85);
                                a = i87 % 128;
                                if (i87 % 2 != 0) {
                                    agVar.D(listE6);
                                    Object obj6 = null;
                                    obj6.hashCode();
                                    throw null;
                                }
                                agVar.D(listE6);
                                i5 = 2;
                                th = null;
                                break;
                                break;
                            case IMediaSession.Stub.TRANSACTION_prepare /* 33 */:
                                agVar.a(this.q.e(t, l(iAg)));
                                i5 = 2;
                                th = null;
                                break;
                            case IMediaSession.Stub.TRANSACTION_prepareFromMediaId /* 34 */:
                                agVar.v(this.q.e(t, l(iAg)));
                                i5 = 2;
                                th = null;
                                break;
                            case IMediaSession.Stub.TRANSACTION_prepareFromSearch /* 35 */:
                                agVar.w(this.q.e(t, l(iAg)));
                                i5 = 2;
                                th = null;
                                break;
                            case IMediaSession.Stub.TRANSACTION_prepareFromUri /* 36 */:
                                List<Float> listE7 = this.q.e(t, l(iAg));
                                int i88 = a;
                                int i89 = (i88 & (-46)) | ((~i88) & 45);
                                int i90 = (i88 & 45) << 1;
                                int i91 = (i89 ^ i90) + ((i90 & i89) << 1);
                                b = i91 % 128;
                                if (i91 % 2 == 0) {
                                    agVar.g(listE7);
                                    int i92 = 99 / 0;
                                } else {
                                    agVar.g(listE7);
                                }
                                i5 = 2;
                                th = null;
                                break;
                            case IMediaSession.Stub.TRANSACTION_getRepeatMode /* 37 */:
                                agVar.C(this.q.e(t, l(iAg)));
                                i5 = 2;
                                th = null;
                                break;
                            case IMediaSession.Stub.TRANSACTION_isShuffleModeEnabledRemoved /* 38 */:
                                AbstractC0068y abstractC0068y6 = this.q;
                                long jL3 = l(iAg);
                                int i93 = a;
                                int i94 = (i93 & 19) + (i93 | 19);
                                b = i94 % 128;
                                if (i94 % 2 == 0) {
                                    abstractC0068y6.e(t, jL3);
                                    Object obj7 = null;
                                    obj7.hashCode();
                                    throw null;
                                }
                                agVar.b(abstractC0068y6.e(t, jL3));
                                i5 = 2;
                                th = null;
                                break;
                                break;
                            case IMediaSession.Stub.TRANSACTION_setRepeatMode /* 39 */:
                                AbstractC0068y abstractC0068y7 = this.q;
                                int i95 = b + 72;
                                int i96 = (i95 ^ (-1)) + (i95 << 1);
                                a = i96 % 128;
                                if (i96 % 2 != 0) {
                                    abstractC0068y7.e(t, l(iAg));
                                    Object obj8 = null;
                                    obj8.hashCode();
                                    throw null;
                                }
                                agVar.K(abstractC0068y7.e(t, l(iAg)));
                                i5 = 2;
                                th = null;
                                break;
                                break;
                            case IMediaSession.Stub.TRANSACTION_setShuffleModeEnabledRemoved /* 40 */:
                                List<Long> listE8 = this.q.e(t, l(iAg));
                                int i97 = b + 117;
                                a = i97 % 128;
                                if (i97 % 2 != 0) {
                                    agVar.J(listE8);
                                    throw null;
                                }
                                agVar.J(listE8);
                                i5 = 2;
                                th = null;
                                break;
                                break;
                            case IMediaSession.Stub.TRANSACTION_addQueueItem /* 41 */:
                                List<Integer> listE9 = this.q.e(t, l(iAg));
                                int i98 = b;
                                int i99 = i98 & 107;
                                int i100 = -(-((i98 ^ 107) | i99));
                                int i101 = (i99 & i100) + (i100 | i99);
                                a = i101 % 128;
                                int i102 = i101 % 2;
                                agVar.i(listE9);
                                i5 = 2;
                                th = null;
                                break;
                            case IMediaSession.Stub.TRANSACTION_addQueueItemAt /* 42 */:
                                agVar.B(this.q.e(t, l(iAg)));
                                i5 = 2;
                                th = null;
                                break;
                            case IMediaSession.Stub.TRANSACTION_removeQueueItem /* 43 */:
                                List<Integer> listE10 = this.q.e(t, l(iAg));
                                int i103 = a;
                                int i104 = i103 ^ 107;
                                int i105 = ((i103 & 107) | i104) << 1;
                                int i106 = -i104;
                                int i107 = (i105 & i106) + (i105 | i106);
                                b = i107 % 128;
                                int i108 = i107 % 2;
                                agVar.A(listE10);
                                i5 = 2;
                                th = null;
                                break;
                            case IMediaSession.Stub.TRANSACTION_removeQueueItemAt /* 44 */:
                                List<Integer> listE11 = this.q.e(t, l(iAg));
                                agVar.I(listE11);
                                objJ = ak.A(iM, listE11, J(iAa), objJ, o00o00);
                                i5 = 2;
                                th = null;
                                break;
                            case IMediaSession.Stub.TRANSACTION_isCaptioningEnabled /* 45 */:
                                agVar.j(this.q.e(t, l(iAg)));
                                i5 = 2;
                                th = null;
                                break;
                            case IMediaSession.Stub.TRANSACTION_setCaptioningEnabled /* 46 */:
                                List<Long> listE12 = this.q.e(t, l(iAg));
                                int i109 = a;
                                int i110 = (i109 ^ 31) + ((i109 & 31) << 1);
                                b = i110 % 128;
                                int i111 = i110 % 2;
                                agVar.D(listE12);
                                i5 = 2;
                                th = null;
                                break;
                            case IMediaSession.Stub.TRANSACTION_getShuffleMode /* 47 */:
                                agVar.a(this.q.e(t, l(iAg)));
                                i5 = 2;
                                th = null;
                                break;
                            case IMediaSession.Stub.TRANSACTION_setShuffleMode /* 48 */:
                                List<Long> listE13 = this.q.e(t, l(iAg));
                                int i112 = b;
                                int i113 = ((((i112 ^ 19) | (i112 & 19)) << 1) - (~(-((19 & (~i112)) | (i112 & (-20)))))) - 1;
                                a = i113 % 128;
                                if (i113 % 2 != 0) {
                                    agVar.v(listE13);
                                    Object obj9 = null;
                                    obj9.hashCode();
                                    throw null;
                                }
                                agVar.v(listE13);
                                i5 = 2;
                                th = null;
                                break;
                                break;
                            case 49:
                                ab(t, l(iAg), agVar, K(iAa), j);
                                i5 = 2;
                                th = null;
                                break;
                            case 50:
                                O(t, iAa, I(iAa), j, agVar);
                                i5 = 2;
                                th = null;
                                break;
                            case IMediaSession.Stub.TRANSACTION_rateWithExtras /* 51 */:
                                ar.v(t, l(iAg), Double.valueOf(agVar.readDouble()));
                                int i114 = a;
                                int i115 = i114 & 57;
                                int i116 = (i114 | 57) & (~i115);
                                int i117 = i115 << 1;
                                int i118 = (i116 & i117) + (i116 | i117);
                                b = i118 % 128;
                                int i119 = i118 % 2;
                                af(t, iM, iAa);
                                i5 = 2;
                                th = null;
                                break;
                            case 52:
                                ar.v(t, l(iAg), Float.valueOf(agVar.readFloat()));
                                af(t, iM, iAa);
                                i5 = 2;
                                th = null;
                                break;
                            case 53:
                                long jL4 = l(iAg);
                                long jE = agVar.E();
                                int i120 = b;
                                int i121 = i120 & 83;
                                int i122 = ((i120 | 83) & (~i121)) + (i121 << 1);
                                a = i122 % 128;
                                int i123 = i122 % 2;
                                try {
                                    ar.v(t, jL4, Long.valueOf(jE));
                                    int i124 = a + 109;
                                    b = i124 % 128;
                                    if (i124 % 2 == 0) {
                                        af(t, iM, iAa);
                                        int i125 = 78 / 0;
                                    } else {
                                        af(t, iM, iAa);
                                    }
                                } catch (oo0o0Oo.OooO00o unused) {
                                    i = 1;
                                    if (!o00o00.r(agVar)) {
                                        if (objJ == null) {
                                            int i126 = a;
                                            int i127 = ((i126 ^ 93) | (i126 & 93)) << i;
                                            int i128 = -(((~i126) & 93) | (i126 & (-94)));
                                            i4 = (i127 & i128) + (i128 | i127);
                                            b = i4 % 128;
                                            if (i4 % 2 == 0) {
                                                o00o00.h(t);
                                                throw null;
                                            }
                                            objJ = o00o00.h(t);
                                        }
                                        if (!o00o00.n(objJ, agVar)) {
                                            i3 = this.f56o;
                                            while (i3 < this.p) {
                                                int i129 = b + 15;
                                                a = i129 % 128;
                                                int i130 = i129 % 2;
                                                H(t, this.n[i3], objJ, o00o00);
                                                int i131 = i3 & 114;
                                                int i132 = (i131 - (~(-(-((i3 ^ 114) | i131))))) - i;
                                                int i133 = i132 & (-113);
                                                int i134 = (i132 | (-113)) & (~i133);
                                                int i135 = -(-(i133 << i));
                                                i3 = ((i134 | i135) << i) - (i135 ^ i134);
                                            }
                                            if (objJ != null) {
                                                o00o00.o(t, objJ);
                                                return;
                                            }
                                            return;
                                        }
                                        th = null;
                                        i5 = 2;
                                    } else if (((agVar.s() ? 1 : 0) ^ i) == i) {
                                        i2 = this.f56o;
                                        while (i2 < this.p) {
                                            H(t, this.n[i2], objJ, o00o00);
                                            i2++;
                                            int i136 = b;
                                            int i137 = (i136 & 61) + (i136 | 61);
                                            a = i137 % 128;
                                            int i138 = i137 % 2;
                                        }
                                        if (objJ != null) {
                                            o00o00.o(t, objJ);
                                            return;
                                        }
                                        return;
                                    }
                                    break;
                                }
                                i5 = 2;
                                th = null;
                                break;
                            case 54:
                                ar.v(t, l(iAg), Long.valueOf(agVar.o()));
                                af(t, iM, iAa);
                                i5 = 2;
                                th = null;
                                break;
                            case 55:
                                ar.v(t, l(iAg), Integer.valueOf(agVar.h()));
                                af(t, iM, iAa);
                                i5 = 2;
                                th = null;
                                break;
                            case 56:
                                ar.v(t, l(iAg), Long.valueOf(agVar.p()));
                                af(t, iM, iAa);
                                i5 = 2;
                                th = null;
                                break;
                            case 57:
                                long jL5 = l(iAg);
                                int i139 = (-2) - ((b + 110) ^ (-1));
                                a = i139 % 128;
                                if (i139 % 2 != 0) {
                                    iH = agVar.H();
                                    int i140 = 53 / 0;
                                } else {
                                    iH = agVar.H();
                                }
                                ar.v(t, jL5, Integer.valueOf(iH));
                                af(t, iM, iAa);
                                i5 = 2;
                                th = null;
                                break;
                            case 58:
                                ar.v(t, l(iAg), Boolean.valueOf(agVar.L()));
                                af(t, iM, iAa);
                                i5 = 2;
                                th = null;
                                break;
                            case 59:
                                int i141 = a;
                                int i142 = i141 ^ 47;
                                int i143 = ((((i141 & 47) | i142) << 1) - (~(-i142))) - 1;
                                b = i143 % 128;
                                int i144 = i143 % 2;
                                ae(t, iAg, agVar);
                                int i145 = b;
                                int i146 = (i145 & (-60)) | ((~i145) & 59);
                                int i147 = (i145 & 59) << 1;
                                int i148 = (i146 ^ i147) + ((i147 & i146) << 1);
                                a = i148 % 128;
                                if (i148 % 2 != 0) {
                                    af(t, iM, iAa);
                                    Object obj10 = null;
                                    obj10.hashCode();
                                    throw null;
                                }
                                af(t, iM, iAa);
                                i5 = 2;
                                th = null;
                                break;
                                if (!o00o00.r(agVar)) {
                                    if (objJ == null) {
                                        int i1210 = a;
                                        int i1211 = ((i1210 ^ 93) | (i1210 & 93)) << i;
                                        int i1212 = -(((~i1210) & 93) | (i1210 & (-94)));
                                        i4 = (i1211 & i1212) + (i1212 | i1211);
                                        b = i4 % 128;
                                        if (i4 % 2 == 0) {
                                            o00o00.h(t);
                                            throw null;
                                        }
                                        objJ = o00o00.h(t);
                                    }
                                    if (!o00o00.n(objJ, agVar)) {
                                        i3 = this.f56o;
                                        while (i3 < this.p) {
                                            int i1213 = b + 15;
                                            a = i1213 % 128;
                                            int i1310 = i1213 % 2;
                                            H(t, this.n[i3], objJ, o00o00);
                                            int i1311 = i3 & 114;
                                            int i1312 = (i1311 - (~(-(-((i3 ^ 114) | i1311))))) - i;
                                            int i1313 = i1312 & (-113);
                                            int i1314 = (i1312 | (-113)) & (~i1313);
                                            int i1315 = -(-(i1313 << i));
                                            i3 = ((i1314 | i1315) << i) - (i1315 ^ i1314);
                                        }
                                        if (objJ != null) {
                                            o00o00.o(t, objJ);
                                            return;
                                        }
                                        return;
                                    }
                                    th = null;
                                    i5 = 2;
                                } else {
                                    if (((agVar.s() ? 1 : 0) ^ i) == i) {
                                        i2 = this.f56o;
                                        while (i2 < this.p) {
                                            H(t, this.n[i2], objJ, o00o00);
                                            i2++;
                                            int i1316 = b;
                                            int i1317 = (i1316 & 61) + (i1316 | 61);
                                            a = i1317 % 128;
                                            int i1318 = i1317 % 2;
                                        }
                                        if (objJ != null) {
                                            o00o00.o(t, objJ);
                                            return;
                                        }
                                        return;
                                    }
                                    i5 = 2;
                                    th = null;
                                }
                                break;
                            case 60:
                                int i149 = b + 34;
                                int i150 = (i149 ^ (-1)) + (i149 << 1);
                                a = i150 % 128;
                                int i151 = i150 % 2;
                                if (P(t, iM, iAa)) {
                                    ar.v(t, l(iAg), R.d(ar.o(t, l(iAg)), agVar.q(K(iAa), j)));
                                } else {
                                    long jL6 = l(iAg);
                                    int i152 = b;
                                    int i153 = i152 & 7;
                                    int i154 = -(-(i152 | 7));
                                    int i155 = (i153 ^ i154) + ((i154 & i153) << 1);
                                    a = i155 % 128;
                                    int i156 = i155 % 2;
                                    ar.v(t, jL6, agVar.q(K(iAa), j));
                                    ac(t, iAa);
                                }
                                af(t, iM, iAa);
                                i5 = 2;
                                th = null;
                                break;
                            case 61:
                                ar.v(t, l(iAg), agVar.d());
                                af(t, iM, iAa);
                                i5 = 2;
                                th = null;
                                break;
                            case 62:
                                long jL7 = l(iAg);
                                Integer numValueOf = Integer.valueOf(agVar.n());
                                int i157 = b;
                                int i158 = i157 & 37;
                                int i159 = ((((i157 ^ 37) | i158) << 1) - (~(-((i157 | 37) & (~i158))))) - 1;
                                a = i159 % 128;
                                if (i159 % 2 != 0) {
                                    ar.v(t, jL7, numValueOf);
                                    int i160 = 5 / 0;
                                } else {
                                    ar.v(t, jL7, numValueOf);
                                }
                                af(t, iM, iAa);
                                i5 = 2;
                                th = null;
                                break;
                            case 63:
                                int iF2 = agVar.f();
                                R.bkH bkhJ3 = J(iAa);
                                if (bkhJ3 != null) {
                                    int i161 = a;
                                    int i162 = (i161 & (-36)) | ((~i161) & 35);
                                    int i163 = (35 & i161) << 1;
                                    int i164 = (i162 & i163) + (i163 | i162);
                                    b = i164 % 128;
                                    int i165 = i164 % 2;
                                    if (bkhJ3.b(iF2)) {
                                        ar.v(t, l(iAg), Integer.valueOf(iF2));
                                        af(t, iM, iAa);
                                    } else {
                                        objJ = ak.C(iM, iF2, objJ, o00o00);
                                    }
                                } else {
                                    ar.v(t, l(iAg), Integer.valueOf(iF2));
                                    af(t, iM, iAa);
                                }
                                i5 = 2;
                                th = null;
                                break;
                            case 64:
                                ar.v(t, l(iAg), Integer.valueOf(agVar.x()));
                                af(t, iM, iAa);
                                i5 = 2;
                                th = null;
                                break;
                            case 65:
                                ar.v(t, l(iAg), Long.valueOf(agVar.P()));
                                af(t, iM, iAa);
                                i5 = 2;
                                th = null;
                                break;
                            case 66:
                                long jL8 = l(iAg);
                                int iT = agVar.t();
                                int i166 = a;
                                int i167 = (((i166 | 34) << 1) - (i166 ^ 34)) - 1;
                                b = i167 % 128;
                                if (i167 % i5 == 0) {
                                    ar.v(t, jL8, Integer.valueOf(iT));
                                    int i168 = 19 / 0;
                                } else {
                                    ar.v(t, jL8, Integer.valueOf(iT));
                                }
                                af(t, iM, iAa);
                                i5 = 2;
                                th = null;
                                break;
                            case 67:
                                ar.v(t, l(iAg), Long.valueOf(agVar.y()));
                                af(t, iM, iAa);
                                i5 = 2;
                                th = null;
                                break;
                            case 68:
                                ar.v(t, l(iAg), agVar.e(K(iAa), j));
                                af(t, iM, iAa);
                                i5 = 2;
                                th = null;
                                break;
                            default:
                                i = 1;
                                if (objJ == null) {
                                    try {
                                        objJ = o00o00.p();
                                    } catch (oo0o0Oo.OooO00o unused2) {
                                        if (!o00o00.r(agVar)) {
                                            if (objJ == null) {
                                                int i1214 = a;
                                                int i1215 = ((i1214 ^ 93) | (i1214 & 93)) << i;
                                                int i1216 = -(((~i1214) & 93) | (i1214 & (-94)));
                                                i4 = (i1215 & i1216) + (i1216 | i1215);
                                                b = i4 % 128;
                                                if (i4 % 2 == 0) {
                                                    o00o00.h(t);
                                                    throw null;
                                                }
                                                objJ = o00o00.h(t);
                                            }
                                            if (!o00o00.n(objJ, agVar)) {
                                                i3 = this.f56o;
                                                while (i3 < this.p) {
                                                    int i1217 = b + 15;
                                                    a = i1217 % 128;
                                                    int i1319 = i1217 % 2;
                                                    H(t, this.n[i3], objJ, o00o00);
                                                    int i13110 = i3 & 114;
                                                    int i13111 = (i13110 - (~(-(-((i3 ^ 114) | i13110))))) - i;
                                                    int i13112 = i13111 & (-113);
                                                    int i13113 = (i13111 | (-113)) & (~i13112);
                                                    int i13114 = -(-(i13112 << i));
                                                    i3 = ((i13113 | i13114) << i) - (i13114 ^ i13113);
                                                }
                                                if (objJ != null) {
                                                    o00o00.o(t, objJ);
                                                    return;
                                                }
                                                return;
                                            }
                                            th = null;
                                            i5 = 2;
                                        } else if (((agVar.s() ? 1 : 0) ^ i) == i) {
                                            i2 = this.f56o;
                                            while (i2 < this.p) {
                                                H(t, this.n[i2], objJ, o00o00);
                                                i2++;
                                                int i13115 = b;
                                                int i13116 = (i13115 & 61) + (i13115 | 61);
                                                a = i13116 % 128;
                                                int i13117 = i13116 % 2;
                                            }
                                            if (objJ != null) {
                                                o00o00.o(t, objJ);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    break;
                                }
                                if (!o00o00.n(objJ, agVar)) {
                                    int i169 = this.f56o;
                                    while (i169 < this.p) {
                                        int i170 = a + 109;
                                        b = i170 % 128;
                                        int i171 = i170 % 2;
                                        H(t, this.n[i169], objJ, o00o00);
                                        int i172 = i169 & 1;
                                        int i173 = (i169 ^ 1) | i172;
                                        i169 = ((i173 & i172) << 1) + (i172 ^ i173);
                                    }
                                    if (objJ != null) {
                                        int i174 = a + 83;
                                        b = i174 % 128;
                                        if (i174 % 2 != 0) {
                                            o00o00.o(t, objJ);
                                            return;
                                        } else {
                                            o00o00.o(t, objJ);
                                            throw null;
                                        }
                                    }
                                    return;
                                }
                                i5 = 2;
                                th = null;
                                break;
                        }
                    } catch (oo0o0Oo.OooO00o unused3) {
                        i = 1;
                    }
                }
            } catch (Throwable th2) {
                for (int i175 = this.f56o; i175 < this.p; i175++) {
                    H(t, this.n[i175], objJ, o00o00);
                }
                if (objJ != null) {
                    o00o00.o(t, objJ);
                }
                throw th2;
            }
        }
        for (int i176 = this.f56o; i176 < this.p; i176++) {
            H(t, this.n[i176], objJ, o00o00);
        }
        if (objJ != null) {
            int i177 = a;
            int i178 = ((i177 | 79) << 1) - (i177 ^ 79);
            b = i178 % 128;
            int i179 = i178 % i5;
            o00o00.o(t, objJ);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x007c  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v154, types: [int] */
    /* JADX WARN: Type inference failed for: r13v186, types: [ivas.gov.bisp.enumeration.aD.x, ivas.gov.bisp.enumeration.o000O000.o0OoOo0<?>] */
    /* JADX WARN: Type inference failed for: r13v188, types: [ivas.gov.bisp.enumeration.aD.x, ivas.gov.bisp.enumeration.o000O000.o0OoOo0<?>] */
    /* JADX WARN: Type inference failed for: r14v58, types: [int] */
    /* JADX WARN: Type inference failed for: r4v10, types: [ivas.gov.bisp.enumeration.aD.G, ivas.gov.bisp.enumeration.o000O000.o00O00<?, ?>] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r5v96 */
    /* JADX WARN: Type inference failed for: r5v98 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r8v2, types: [ivas.gov.bisp.enumeration.aD.x, ivas.gov.bisp.enumeration.o000O000.o0OoOo0<?>] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v70 */
    public final void c(T t, InterfaceC0051g interfaceC0051g) throws Throwable {
        Iterator itN;
        Map.Entry entry;
        ?? r5;
        int i;
        boolean zH;
        ah ahVarK;
        C0055l c0055l;
        int iS;
        AbstractC0064u abstractC0064u;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 39;
        int i5 = (i3 | 39) & (~i4);
        int i6 = i4 << 1;
        int i7 = (i5 & i6) + (i5 | i6);
        b = i7 % 128;
        int i8 = i7 % 2;
        Objects.requireNonNull(interfaceC0051g);
        if (!this.m) {
            ah(t, interfaceC0051g);
            return;
        }
        Throwable th = null;
        if (this.j) {
            int i9 = a;
            int i10 = (((i9 & (-54)) | ((~i9) & 53)) - (~(-(-((i9 & 53) << 1))))) - 1;
            b = i10 % 128;
            if (i10 % 2 == 0) {
                this.t.f(t);
                th.hashCode();
                throw null;
            }
            C0056m c0056mF = this.t.f(t);
            if (c0056mF.m()) {
                itN = null;
                entry = null;
            } else {
                int i11 = a;
                int i12 = ((i11 | 93) << 1) - (i11 ^ 93);
                b = i12 % 128;
                if (i12 % 2 == 0) {
                    th.hashCode();
                    throw null;
                }
                itN = c0056mF.n();
                entry = (Map.Entry) itN.next();
            }
        } else {
            itN = null;
            entry = null;
        }
        int length = this.f.length;
        ?? r9 = 0;
        int i13 = 0;
        ?? r7 = entry;
        while (i13 < length) {
            int i14 = a;
            int i15 = ((i14 | 71) << 1) - (i14 ^ 71);
            b = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = i13;
                ag(i16);
                int i17 = this.f[i16];
                throw null;
            }
            int iAg = ag(i13);
            int i18 = this.f[i13];
            while (r7 != 0 && this.t.d(r7) <= i18) {
                this.t.l(interfaceC0051g, r7);
                r7 = itN.hasNext() ^ true ? th : (Map.Entry) itN.next();
            }
            switch (v(iAg)) {
                case 0:
                    r5 = r9;
                    i = i13;
                    if (!(!N(t, i))) {
                        int i19 = b + 23;
                        a = i19 % 128;
                        if (i19 % 2 != 0) {
                            ar.l(t, l(iAg));
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        ((C0055l) interfaceC0051g).c(i18, ar.l(t, l(iAg)));
                        int i20 = a;
                        int i21 = i20 & 37;
                        int i22 = (((i20 | 37) & (~i21)) - (~(-(-(i21 << 1))))) - 1;
                        b = i22 % 128;
                        int i23 = i22 % 2;
                    } else {
                        continue;
                    }
                    int i24 = i ^ 3;
                    i13 = (((i & 3) | i24) << 1) - i24;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case 1:
                    r5 = r9;
                    i = i13;
                    if (!(!N(t, i))) {
                        ((C0055l) interfaceC0051g).d(i18, ar.m(t, l(iAg)));
                    }
                    int i25 = i ^ 3;
                    i13 = (((i & 3) | i25) << 1) - i25;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case 2:
                    r5 = r9;
                    i = i13;
                    if (N(t, i)) {
                        ((C0055l) interfaceC0051g).c.cr(i18, ar.p(t, l(iAg)));
                    }
                    int i26 = i ^ 3;
                    i13 = (((i & 3) | i26) << 1) - i26;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case 3:
                    r5 = r9;
                    i = i13;
                    if (N(t, i)) {
                        int i27 = b;
                        int i28 = (((i27 ^ 7) | (i27 & 7)) << 1) - (((~i27) & 7) | (i27 & (-8)));
                        a = i28 % 128;
                        int i29 = i28 % 2;
                        long jP = ar.p(t, l(iAg));
                        int i30 = b;
                        int i31 = (i30 & (-116)) | ((~i30) & 115);
                        int i32 = (i30 & 115) << 1;
                        int i33 = (i31 & i32) + (i32 | i31);
                        a = i33 % 128;
                        if (i33 % 2 != 0) {
                            ((C0055l) interfaceC0051g).c.cr(i18, jP);
                            throw null;
                        }
                        ((C0055l) interfaceC0051g).c.cr(i18, jP);
                    } else {
                        continue;
                    }
                    int i210 = i ^ 3;
                    i13 = (((i & 3) | i210) << 1) - i210;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case 4:
                    r5 = r9;
                    i = i13;
                    if (N(t, i)) {
                        int i34 = a;
                        int i35 = i34 & 49;
                        int i36 = -(-(i34 | 49));
                        int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
                        b = i37 % 128;
                        int i38 = i37 % 2;
                        int iN = ar.n(t, l(iAg));
                        int i39 = b + 103;
                        a = i39 % 128;
                        if (i39 % 2 != 0) {
                            ((C0055l) interfaceC0051g).c.ci(i18, iN);
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        ((C0055l) interfaceC0051g).c.ci(i18, iN);
                    } else {
                        continue;
                    }
                    int i211 = i ^ 3;
                    i13 = (((i & 3) | i211) << 1) - i211;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case 5:
                    r5 = r9;
                    i = i13;
                    if (N(t, i)) {
                        long jP2 = ar.p(t, l(iAg));
                        AbstractC0064u abstractC0064u2 = ((C0055l) interfaceC0051g).c;
                        int i40 = b + 115;
                        a = i40 % 128;
                        int i41 = i40 % 2;
                        abstractC0064u2.cg(i18, jP2);
                        int i42 = a;
                        int i43 = i42 & 83;
                        int i44 = i42 | 83;
                        int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
                        b = i45 % 128;
                        int i46 = i45 % 2;
                    }
                    int i212 = i ^ 3;
                    i13 = (((i & 3) | i212) << 1) - i212;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case 6:
                    r5 = r9;
                    i = i13;
                    if (N(t, i)) {
                        ((C0055l) interfaceC0051g).c.ce(i18, ar.n(t, l(iAg)));
                        int i47 = a;
                        int i48 = (-2) - ((((i47 | 100) << 1) - (i47 ^ 100)) ^ (-1));
                        b = i48 % 128;
                        int i49 = i48 % 2;
                    }
                    int i213 = i ^ 3;
                    i13 = (((i & 3) | i213) << 1) - i213;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case 7:
                    i = i13;
                    if (!(!N(t, i))) {
                        int i50 = a + 39;
                        b = i50 % 128;
                        if (i50 % 2 == 0) {
                            zH = ar.h(t, l(iAg));
                            r5 = 0;
                            int i51 = 70 / 0;
                        } else {
                            r5 = 0;
                            zH = ar.h(t, l(iAg));
                        }
                        AbstractC0064u abstractC0064u3 = ((C0055l) interfaceC0051g).c;
                        int i52 = (-2) - ((a + 32) ^ (-1));
                        b = i52 % 128;
                        int i53 = i52 % 2;
                        abstractC0064u3.cd(i18, zH);
                    } else {
                        r5 = 0;
                    }
                    int i214 = i ^ 3;
                    i13 = (((i & 3) | i214) << 1) - i214;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case 8:
                    i = i13;
                    if (N(t, i)) {
                        aj(i18, ar.o(t, l(iAg)), interfaceC0051g);
                    }
                    r5 = 0;
                    int i215 = i ^ 3;
                    i13 = (((i & 3) | i215) << 1) - i215;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case 9:
                    i = i13;
                    if (N(t, i)) {
                        ((C0055l) interfaceC0051g).f(i18, ar.o(t, l(iAg)), K(i));
                    }
                    r5 = 0;
                    int i216 = i ^ 3;
                    i13 = (((i & 3) | i216) << 1) - i216;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case 10:
                    i = i13;
                    if (N(t, i)) {
                        int i54 = a;
                        int i55 = i54 & 47;
                        int i56 = (i54 | 47) & (~i55);
                        int i57 = i55 << 1;
                        int i58 = (i56 & i57) + (i56 | i57);
                        b = i58 % 128;
                        if (i58 % 2 == 0) {
                            throw null;
                        }
                        AbstractC0069z abstractC0069z = (AbstractC0069z) ar.o(t, l(iAg));
                        int i59 = a;
                        int i60 = (i59 ^ 79) + ((i59 & 79) << 1);
                        b = i60 % 128;
                        int i61 = i60 % 2;
                        ((C0055l) interfaceC0051g).c.cc(i18, abstractC0069z);
                    }
                    r5 = 0;
                    int i217 = i ^ 3;
                    i13 = (((i & 3) | i217) << 1) - i217;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case 11:
                    i = i13;
                    if (N(t, i)) {
                        int i62 = b;
                        int i63 = ((i62 ^ 54) + ((i62 & 54) << 1)) - 1;
                        a = i63 % 128;
                        if (i63 % 2 != 0) {
                            ar.n(t, l(iAg));
                            throw null;
                        }
                        ((C0055l) interfaceC0051g).c.cq(i18, ar.n(t, l(iAg)));
                    }
                    r5 = 0;
                    int i218 = i ^ 3;
                    i13 = (((i & 3) | i218) << 1) - i218;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case 12:
                    i = i13;
                    if (N(t, i)) {
                        int iN2 = ar.n(t, l(iAg));
                        int i64 = a;
                        int i65 = (i64 & (-70)) | ((~i64) & 69);
                        int i66 = (i64 & 69) << 1;
                        int i67 = (i65 ^ i66) + ((i66 & i65) << 1);
                        b = i67 % 128;
                        if (i67 % 2 == 0) {
                            ((C0055l) interfaceC0051g).c.ci(i18, iN2);
                            throw null;
                        }
                        ((C0055l) interfaceC0051g).c.ci(i18, iN2);
                    }
                    r5 = 0;
                    int i219 = i ^ 3;
                    i13 = (((i & 3) | i219) << 1) - i219;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case 13:
                    i = i13;
                    if (N(t, i)) {
                        int i68 = a;
                        int i69 = (i68 | 31) << 1;
                        int i70 = -(((~i68) & 31) | (i68 & (-32)));
                        int i71 = (i69 ^ i70) + ((i70 & i69) << 1);
                        b = i71 % 128;
                        int i72 = i71 % 2;
                        ((C0055l) interfaceC0051g).c.ce(i18, ar.n(t, l(iAg)));
                    }
                    r5 = 0;
                    int i2110 = i ^ 3;
                    i13 = (((i & 3) | i2110) << 1) - i2110;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case IMediaSession.Stub.TRANSACTION_playFromMediaId /* 14 */:
                    i = i13;
                    if (N(t, i)) {
                        int i73 = b;
                        int i74 = ((i73 ^ 123) | (i73 & 123)) << 1;
                        int i75 = -(((~i73) & 123) | (i73 & (-124)));
                        int i76 = (i74 & i75) + (i75 | i74);
                        a = i76 % 128;
                        int i77 = i76 % 2;
                        ((C0055l) interfaceC0051g).c.cg(i18, ar.p(t, l(iAg)));
                    }
                    r5 = 0;
                    int i2111 = i ^ 3;
                    i13 = (((i & 3) | i2111) << 1) - i2111;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case IMediaSession.Stub.TRANSACTION_playFromSearch /* 15 */:
                    i = i13;
                    if (N(t, i)) {
                        ((C0055l) interfaceC0051g).g(i18, ar.n(t, l(iAg)));
                    }
                    r5 = 0;
                    int i2112 = i ^ 3;
                    i13 = (((i & 3) | i2112) << 1) - i2112;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case 16:
                    i = i13;
                    if (!(!N(t, i))) {
                        long jP3 = ar.p(t, l(iAg));
                        int i78 = b;
                        int i79 = (((i78 ^ 29) | (i78 & 29)) << 1) - (((~i78) & 29) | (i78 & (-30)));
                        a = i79 % 128;
                        int i80 = i79 % 2;
                        ((C0055l) interfaceC0051g).i(i18, jP3);
                    }
                    r5 = 0;
                    int i2113 = i ^ 3;
                    i13 = (((i & 3) | i2113) << 1) - i2113;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case IMediaSession.Stub.TRANSACTION_skipToQueueItem /* 17 */:
                    i = i13;
                    if (!(!N(t, i))) {
                        int i81 = b;
                        int i82 = i81 & 117;
                        int i83 = (i82 - (~((i81 ^ 117) | i82))) - 1;
                        a = i83 % 128;
                        if (i83 % 2 != 0) {
                            ar.o(t, l(iAg));
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        ((C0055l) interfaceC0051g).e(i18, ar.o(t, l(iAg)), K(i));
                    }
                    r5 = 0;
                    int i2114 = i ^ 3;
                    i13 = (((i & 3) | i2114) << 1) - i2114;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case IMediaSession.Stub.TRANSACTION_pause /* 18 */:
                    ?? r6 = r9;
                    i = i13;
                    ak.I(this.f[i], (List) ar.o(t, l(iAg)), interfaceC0051g, r6);
                    r5 = 0;
                    int i2115 = i ^ 3;
                    i13 = (((i & 3) | i2115) << 1) - i2115;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case IMediaSession.Stub.TRANSACTION_stop /* 19 */:
                    r5 = r9;
                    i = i13;
                    ak.L(this.f[i], (List) ar.o(t, l(iAg)), interfaceC0051g, r5);
                    int i2116 = i ^ 3;
                    i13 = (((i & 3) | i2116) << 1) - i2116;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case IMediaSession.Stub.TRANSACTION_next /* 20 */:
                    i = i13;
                    int i84 = this.f[i];
                    long jL = l(iAg);
                    int i85 = b;
                    int i86 = (i85 ^ 43) + ((i85 & 43) << 1);
                    a = i86 % 128;
                    int i87 = i86 % 2;
                    List list = (List) ar.o(t, jL);
                    int i88 = (-2) - ((b + 30) ^ (-1));
                    a = i88 % 128;
                    int i89 = i88 % 2;
                    r5 = 0;
                    ak.N(i84, list, interfaceC0051g, false);
                    int i2117 = i ^ 3;
                    i13 = (((i & 3) | i2117) << 1) - i2117;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case IMediaSession.Stub.TRANSACTION_previous /* 21 */:
                    ?? r8 = r9;
                    i = i13;
                    ak.V(this.f[i], (List) ar.o(t, l(iAg)), interfaceC0051g, r8);
                    r5 = 0;
                    int i2118 = i ^ 3;
                    i13 = (((i & 3) | i2118) << 1) - i2118;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case IMediaSession.Stub.TRANSACTION_fastForward /* 22 */:
                    r5 = r9;
                    i = i13;
                    ak.O(this.f[i], (List) ar.o(t, l(iAg)), interfaceC0051g, r5);
                    int i2119 = i ^ 3;
                    i13 = (((i & 3) | i2119) << 1) - i2119;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case IMediaSession.Stub.TRANSACTION_rewind /* 23 */:
                    r5 = r9;
                    i = i13;
                    ak.H(this.f[i], (List) ar.o(t, l(iAg)), interfaceC0051g, r5);
                    int i21110 = i ^ 3;
                    i13 = (((i & 3) | i21110) << 1) - i21110;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case IMediaSession.Stub.TRANSACTION_seekTo /* 24 */:
                    r5 = r9;
                    i = i13;
                    ak.K(this.f[i], (List) ar.o(t, l(iAg)), interfaceC0051g, r5);
                    int i21111 = i ^ 3;
                    i13 = (((i & 3) | i21111) << 1) - i21111;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case IMediaSession.Stub.TRANSACTION_rate /* 25 */:
                    i = i13;
                    r5 = 0;
                    ak.E(this.f[i], (List) ar.o(t, l(iAg)), interfaceC0051g, false);
                    int i21112 = i ^ 3;
                    i13 = (((i & 3) | i21112) << 1) - i21112;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case IMediaSession.Stub.TRANSACTION_sendCustomAction /* 26 */:
                    i = i13;
                    int i90 = this.f[i];
                    List list2 = (List) ar.o(t, l(iAg));
                    int i91 = b + 67;
                    a = i91 % 128;
                    if (i91 % 2 != 0) {
                        ak.U(i90, list2, interfaceC0051g);
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                    ak.U(i90, list2, interfaceC0051g);
                    r5 = 0;
                    int i21113 = i ^ 3;
                    i13 = (((i & 3) | i21113) << 1) - i21113;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                    break;
                case IMediaSession.Stub.TRANSACTION_getMetadata /* 27 */:
                    i = i13;
                    int i92 = this.f[i];
                    int i93 = a;
                    int i94 = i93 ^ 73;
                    int i95 = (((i93 & 73) | i94) << 1) - i94;
                    b = i95 % 128;
                    int i96 = i95 % 2;
                    ak.P(i92, (List) ar.o(t, l(iAg)), interfaceC0051g, K(i));
                    r5 = 0;
                    int i21114 = i ^ 3;
                    i13 = (((i & 3) | i21114) << 1) - i21114;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case IMediaSession.Stub.TRANSACTION_getPlaybackState /* 28 */:
                    i = i13;
                    ak.F(this.f[i], (List) ar.o(t, l(iAg)), interfaceC0051g);
                    r5 = 0;
                    int i21115 = i ^ 3;
                    i13 = (((i & 3) | i21115) << 1) - i21115;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case IMediaSession.Stub.TRANSACTION_getQueue /* 29 */:
                    i = i13;
                    int i97 = this.f[i];
                    List list3 = (List) ar.o(t, l(iAg));
                    int i98 = (-2) - ((a + 70) ^ (-1));
                    b = i98 % 128;
                    int i99 = i98 % 2;
                    ak.R(i97, list3, interfaceC0051g, false);
                    r5 = 0;
                    int i21116 = i ^ 3;
                    i13 = (((i & 3) | i21116) << 1) - i21116;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case IMediaSession.Stub.TRANSACTION_getQueueTitle /* 30 */:
                    ?? r10 = r9;
                    i = i13;
                    ak.J(this.f[i], (List) ar.o(t, l(iAg)), interfaceC0051g, r10);
                    r5 = 0;
                    int i21117 = i ^ 3;
                    i13 = (((i & 3) | i21117) << 1) - i21117;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case IMediaSession.Stub.TRANSACTION_getExtras /* 31 */:
                    r5 = r9;
                    i = i13;
                    ak.Q(this.f[i], (List) ar.o(t, l(iAg)), interfaceC0051g, r5);
                    int i21118 = i ^ 3;
                    i13 = (((i & 3) | i21118) << 1) - i21118;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case IMediaSession.Stub.TRANSACTION_getRatingType /* 32 */:
                    r5 = r9;
                    i = i13;
                    ak.G(this.f[i], (List) ar.o(t, l(iAg)), interfaceC0051g, r5);
                    int i21119 = i ^ 3;
                    i13 = (((i & 3) | i21119) << 1) - i21119;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case IMediaSession.Stub.TRANSACTION_prepare /* 33 */:
                    r5 = r9;
                    i = i13;
                    ak.T(this.f[i], (List) ar.o(t, l(iAg)), interfaceC0051g, r5);
                    int i211110 = i ^ 3;
                    i13 = (((i & 3) | i211110) << 1) - i211110;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case IMediaSession.Stub.TRANSACTION_prepareFromMediaId /* 34 */:
                    i = i13;
                    r5 = 0;
                    ak.S(this.f[i], (List) ar.o(t, l(iAg)), interfaceC0051g, false);
                    int i211111 = i ^ 3;
                    i13 = (((i & 3) | i211111) << 1) - i211111;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case IMediaSession.Stub.TRANSACTION_prepareFromSearch /* 35 */:
                    i = i13;
                    ak.I(this.f[i], (List) ar.o(t, l(iAg)), interfaceC0051g, true);
                    r5 = 0;
                    int i211112 = i ^ 3;
                    i13 = (((i & 3) | i211112) << 1) - i211112;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case IMediaSession.Stub.TRANSACTION_prepareFromUri /* 36 */:
                    i = i13;
                    ak.L(this.f[i], (List) ar.o(t, l(iAg)), interfaceC0051g, true);
                    r5 = 0;
                    int i211113 = i ^ 3;
                    i13 = (((i & 3) | i211113) << 1) - i211113;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case IMediaSession.Stub.TRANSACTION_getRepeatMode /* 37 */:
                    i = i13;
                    ak.N(this.f[i], (List) ar.o(t, l(iAg)), interfaceC0051g, true);
                    r5 = 0;
                    int i211114 = i ^ 3;
                    i13 = (((i & 3) | i211114) << 1) - i211114;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case IMediaSession.Stub.TRANSACTION_isShuffleModeEnabledRemoved /* 38 */:
                    i = i13;
                    ak.V(this.f[i], (List) ar.o(t, l(iAg)), interfaceC0051g, true);
                    r5 = 0;
                    int i211115 = i ^ 3;
                    i13 = (((i & 3) | i211115) << 1) - i211115;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case IMediaSession.Stub.TRANSACTION_setRepeatMode /* 39 */:
                    i = i13;
                    ak.O(this.f[i], (List) ar.o(t, l(iAg)), interfaceC0051g, true);
                    r5 = 0;
                    int i211116 = i ^ 3;
                    i13 = (((i & 3) | i211116) << 1) - i211116;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case IMediaSession.Stub.TRANSACTION_setShuffleModeEnabledRemoved /* 40 */:
                    i = i13;
                    int i100 = this.f[i];
                    List list4 = (List) ar.o(t, l(iAg));
                    int i101 = a;
                    int i102 = (i101 & 81) + (i101 | 81);
                    b = i102 % 128;
                    int i103 = i102 % 2;
                    ak.H(i100, list4, interfaceC0051g, true);
                    r5 = 0;
                    int i211117 = i ^ 3;
                    i13 = (((i & 3) | i211117) << 1) - i211117;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case IMediaSession.Stub.TRANSACTION_addQueueItem /* 41 */:
                    i = i13;
                    int i104 = this.f[i];
                    Object objO = ar.o(t, l(iAg));
                    int i105 = b + 45;
                    a = i105 % 128;
                    int i106 = i105 % 2;
                    ak.K(i104, (List) objO, interfaceC0051g, true);
                    r5 = 0;
                    int i211118 = i ^ 3;
                    i13 = (((i & 3) | i211118) << 1) - i211118;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case IMediaSession.Stub.TRANSACTION_addQueueItemAt /* 42 */:
                    i = i13;
                    ak.E(this.f[i], (List) ar.o(t, l(iAg)), interfaceC0051g, true);
                    r5 = 0;
                    int i211119 = i ^ 3;
                    i13 = (((i & 3) | i211119) << 1) - i211119;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case IMediaSession.Stub.TRANSACTION_removeQueueItem /* 43 */:
                    i = i13;
                    ak.R(this.f[i], (List) ar.o(t, l(iAg)), interfaceC0051g, true);
                    r5 = 0;
                    int i2111110 = i ^ 3;
                    i13 = (((i & 3) | i2111110) << 1) - i2111110;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case IMediaSession.Stub.TRANSACTION_removeQueueItemAt /* 44 */:
                    i = i13;
                    ak.J(this.f[i], (List) ar.o(t, l(iAg)), interfaceC0051g, true);
                    r5 = 0;
                    int i2111111 = i ^ 3;
                    i13 = (((i & 3) | i2111111) << 1) - i2111111;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case IMediaSession.Stub.TRANSACTION_isCaptioningEnabled /* 45 */:
                    i = i13;
                    ak.Q(this.f[i], (List) ar.o(t, l(iAg)), interfaceC0051g, true);
                    r5 = 0;
                    int i2111112 = i ^ 3;
                    i13 = (((i & 3) | i2111112) << 1) - i2111112;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case IMediaSession.Stub.TRANSACTION_setCaptioningEnabled /* 46 */:
                    i = i13;
                    ak.G(this.f[i], (List) ar.o(t, l(iAg)), interfaceC0051g, true);
                    r5 = 0;
                    int i2111113 = i ^ 3;
                    i13 = (((i & 3) | i2111113) << 1) - i2111113;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case IMediaSession.Stub.TRANSACTION_getShuffleMode /* 47 */:
                    i = i13;
                    ak.T(this.f[i], (List) ar.o(t, l(iAg)), interfaceC0051g, true);
                    r5 = 0;
                    int i2111114 = i ^ 3;
                    i13 = (((i & 3) | i2111114) << 1) - i2111114;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case IMediaSession.Stub.TRANSACTION_setShuffleMode /* 48 */:
                    i = i13;
                    ak.S(this.f[i], (List) ar.o(t, l(iAg)), interfaceC0051g, true);
                    int i107 = a + 51;
                    b = i107 % 128;
                    int i108 = i107 % 2;
                    r5 = 0;
                    int i2111115 = i ^ 3;
                    i13 = (((i & 3) | i2111115) << 1) - i2111115;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case 49:
                    i = i13;
                    int i109 = this.f[i];
                    List list5 = (List) ar.o(t, l(iAg));
                    ah ahVarK2 = K(i);
                    int i110 = a;
                    int i111 = i110 & 79;
                    int i112 = ((i110 ^ 79) | i111) << 1;
                    int i113 = -((i110 | 79) & (~i111));
                    int i114 = (i112 & i113) + (i113 | i112);
                    b = i114 % 128;
                    if (i114 % 2 == 0) {
                        ak.M(i109, list5, interfaceC0051g, ahVarK2);
                        int i115 = 41 / 0;
                    } else {
                        ak.M(i109, list5, interfaceC0051g, ahVarK2);
                    }
                    r5 = 0;
                    int i2111116 = i ^ 3;
                    i13 = (((i & 3) | i2111116) << 1) - i2111116;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case 50:
                    i = i13;
                    ai(interfaceC0051g, i18, ar.o(t, l(iAg)), i);
                    r5 = 0;
                    int i2111117 = i ^ 3;
                    i13 = (((i & 3) | i2111117) << 1) - i2111117;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case IMediaSession.Stub.TRANSACTION_rateWithExtras /* 51 */:
                    i = i13;
                    if (P(t, i18, i)) {
                        ((C0055l) interfaceC0051g).c(i18, q(t, l(iAg)));
                    }
                    r5 = 0;
                    int i2111118 = i ^ 3;
                    i13 = (((i & 3) | i2111118) << 1) - i2111118;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case 52:
                    i = i13;
                    if (P(t, i18, i)) {
                        ((C0055l) interfaceC0051g).d(i18, r(t, l(iAg)));
                    }
                    r5 = 0;
                    int i2111119 = i ^ 3;
                    i13 = (((i & 3) | i2111119) << 1) - i2111119;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case 53:
                    if (!(!P(t, i18, i13))) {
                        int i116 = b;
                        int i117 = (i116 & 61) + (i116 | 61);
                        a = i117 % 128;
                        int i118 = i117 % 2;
                        int i119 = i13;
                        ((C0055l) interfaceC0051g).c.cr(i18, t(t, l(iAg)));
                        int i120 = a;
                        int i121 = i120 & 15;
                        int i122 = (((i120 | 15) & (~i121)) - (~(-(-(i121 << 1))))) - 1;
                        b = i122 % 128;
                        if (i122 % 2 == 0) {
                            int i123 = 5 / 4;
                        }
                        i = i119;
                        r5 = 0;
                    } else {
                        r5 = r9;
                        i = i13;
                    }
                    int i21111110 = i ^ 3;
                    i13 = (((i & 3) | i21111110) << 1) - i21111110;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case 54:
                    if (P(t, i18, i13)) {
                        int i124 = b;
                        int i125 = (i124 ^ 91) + ((i124 & 91) << 1);
                        a = i125 % 128;
                        int i126 = i125 % 2;
                        ((C0055l) interfaceC0051g).c.cr(i18, t(t, l(iAg)));
                    }
                    r5 = r9;
                    i = i13;
                    int i21111111 = i ^ 3;
                    i13 = (((i & 3) | i21111111) << 1) - i21111111;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case 55:
                    if (P(t, i18, i13)) {
                        int i127 = a;
                        int i128 = (i127 ^ 15) + ((i127 & 15) << 1);
                        b = i128 % 128;
                        int i129 = i128 % 2;
                        ((C0055l) interfaceC0051g).c.ci(i18, s(t, l(iAg)));
                    }
                    r5 = r9;
                    i = i13;
                    int i21111112 = i ^ 3;
                    i13 = (((i & 3) | i21111112) << 1) - i21111112;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case 56:
                    if (P(t, i18, i13)) {
                        int i130 = b;
                        int i131 = (i130 & (-4)) | ((~i130) & 3);
                        int i132 = -(-((i130 & 3) << 1));
                        int i133 = (i131 & i132) + (i132 | i131);
                        a = i133 % 128;
                        if (i133 % 2 != 0) {
                            t(t, l(iAg));
                            AbstractC0064u abstractC0064u4 = ((C0055l) interfaceC0051g).c;
                            Object obj5 = null;
                            obj5.hashCode();
                            throw null;
                        }
                        ((C0055l) interfaceC0051g).c.cg(i18, t(t, l(iAg)));
                    }
                    r5 = r9;
                    i = i13;
                    int i21111113 = i ^ 3;
                    i13 = (((i & 3) | i21111113) << 1) - i21111113;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case 57:
                    if (P(t, i18, i13)) {
                        int i134 = b + 25;
                        a = i134 % 128;
                        if (i134 % 2 != 0) {
                            s(t, l(iAg));
                            AbstractC0064u abstractC0064u5 = ((C0055l) interfaceC0051g).c;
                            Object obj6 = null;
                            obj6.hashCode();
                            throw null;
                        }
                        ((C0055l) interfaceC0051g).c.ce(i18, s(t, l(iAg)));
                    }
                    r5 = r9;
                    i = i13;
                    int i21111114 = i ^ 3;
                    i13 = (((i & 3) | i21111114) << 1) - i21111114;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case 58:
                    if (P(t, i18, i13)) {
                        int i135 = b;
                        int i136 = i135 & 61;
                        int i137 = i135 | 61;
                        int i138 = (i136 & i137) + (i137 | i136);
                        a = i138 % 128;
                        if (i138 % 2 != 0) {
                            p(t, l(iAg));
                            throw null;
                        }
                        ((C0055l) interfaceC0051g).c.cd(i18, p(t, l(iAg)));
                    }
                    r5 = r9;
                    i = i13;
                    int i21111115 = i ^ 3;
                    i13 = (((i & 3) | i21111115) << 1) - i21111115;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case 59:
                    if (P(t, i18, i13)) {
                        aj(i18, ar.o(t, l(iAg)), interfaceC0051g);
                    }
                    r5 = r9;
                    i = i13;
                    int i21111116 = i ^ 3;
                    i13 = (((i & 3) | i21111116) << 1) - i21111116;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case 60:
                    if (P(t, i18, i13)) {
                        int i139 = a;
                        int i140 = ((i139 & 42) + (i139 | 42)) - 1;
                        b = i140 % 128;
                        int i141 = i140 % 2;
                        Object objO2 = ar.o(t, l(iAg));
                        int i142 = a;
                        int i143 = i142 & 59;
                        int i144 = -(-((i142 ^ 59) | i143));
                        int i145 = (i143 ^ i144) + ((i144 & i143) << 1);
                        b = i145 % 128;
                        if (i145 % 2 == 0) {
                            ahVarK = K(i13);
                            c0055l = (C0055l) interfaceC0051g;
                            ?? r14 = 12 / r9;
                        } else {
                            ahVarK = K(i13);
                            c0055l = (C0055l) interfaceC0051g;
                        }
                        c0055l.f(i18, objO2, ahVarK);
                    }
                    r5 = r9;
                    i = i13;
                    int i21111117 = i ^ 3;
                    i13 = (((i & 3) | i21111117) << 1) - i21111117;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case 61:
                    if (!(!P(t, i18, i13))) {
                        AbstractC0069z abstractC0069z2 = (AbstractC0069z) ar.o(t, l(iAg));
                        int i146 = a;
                        int i147 = i146 & 91;
                        int i148 = (((i146 | 91) & (~i147)) - (~(-(-(i147 << 1))))) - 1;
                        b = i148 % 128;
                        int i149 = i148 % 2;
                        ((C0055l) interfaceC0051g).c.cc(i18, abstractC0069z2);
                    }
                    r5 = r9;
                    i = i13;
                    int i21111118 = i ^ 3;
                    i13 = (((i & 3) | i21111118) << 1) - i21111118;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case 62:
                    if (P(t, i18, i13)) {
                        int iS2 = s(t, l(iAg));
                        AbstractC0064u abstractC0064u6 = ((C0055l) interfaceC0051g).c;
                        int i150 = a;
                        int i151 = (i150 | 55) << 1;
                        int i152 = -((55 & (~i150)) | (i150 & (-56)));
                        int i153 = (i151 ^ i152) + ((i152 & i151) << 1);
                        b = i153 % 128;
                        if (i153 % 2 == 0) {
                            abstractC0064u6.cq(i18, iS2);
                            throw null;
                        }
                        abstractC0064u6.cq(i18, iS2);
                    }
                    r5 = r9;
                    i = i13;
                    int i21111119 = i ^ 3;
                    i13 = (((i & 3) | i21111119) << 1) - i21111119;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case 63:
                    if (P(t, i18, i13)) {
                        int iS3 = s(t, l(iAg));
                        AbstractC0064u abstractC0064u7 = ((C0055l) interfaceC0051g).c;
                        int i154 = b;
                        int i155 = (i154 & 57) + (i154 | 57);
                        a = i155 % 128;
                        int i156 = i155 % 2;
                        abstractC0064u7.ci(i18, iS3);
                    }
                    r5 = r9;
                    i = i13;
                    int i211111110 = i ^ 3;
                    i13 = (((i & 3) | i211111110) << 1) - i211111110;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case 64:
                    if (P(t, i18, i13)) {
                        int i157 = a;
                        int i158 = ((~i157) & 37) | (i157 & (-38));
                        int i159 = (i157 & 37) << 1;
                        int i160 = (i158 ^ i159) + ((i158 & i159) << 1);
                        b = i160 % 128;
                        if (i160 % 2 == 0) {
                            iS = s(t, l(iAg));
                            abstractC0064u = ((C0055l) interfaceC0051g).c;
                            ?? r13 = 51 / r9;
                        } else {
                            iS = s(t, l(iAg));
                            abstractC0064u = ((C0055l) interfaceC0051g).c;
                        }
                        int i161 = b;
                        int i162 = i161 & 119;
                        int i163 = -(-((i161 ^ 119) | i162));
                        int i164 = (i162 & i163) + (i163 | i162);
                        a = i164 % 128;
                        int i165 = i164 % 2;
                        abstractC0064u.ce(i18, iS);
                    }
                    r5 = r9;
                    i = i13;
                    int i211111111 = i ^ 3;
                    i13 = (((i & 3) | i211111111) << 1) - i211111111;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case 65:
                    if (P(t, i18, i13)) {
                        ((C0055l) interfaceC0051g).c.cg(i18, t(t, l(iAg)));
                    }
                    r5 = r9;
                    i = i13;
                    int i211111112 = i ^ 3;
                    i13 = (((i & 3) | i211111112) << 1) - i211111112;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case 66:
                    if (P(t, i18, i13)) {
                        int i166 = b;
                        int i167 = ((i166 ^ 5) | (i166 & 5)) << 1;
                        int i168 = -((i166 & (-6)) | ((~i166) & 5));
                        int i169 = (i167 & i168) + (i168 | i167);
                        a = i169 % 128;
                        int i170 = i169 % 2;
                        ((C0055l) interfaceC0051g).g(i18, s(t, l(iAg)));
                    }
                    r5 = r9;
                    i = i13;
                    int i211111113 = i ^ 3;
                    i13 = (((i & 3) | i211111113) << 1) - i211111113;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case 67:
                    if (!(!P(t, i18, i13))) {
                        int i171 = a;
                        int i172 = i171 & 107;
                        int i173 = (i171 ^ 107) | i172;
                        int i174 = (i172 ^ i173) + ((i173 & i172) << 1);
                        b = i174 % 128;
                        if (i174 % 2 == 0) {
                            t(t, l(iAg));
                            throw th;
                        }
                        ((C0055l) interfaceC0051g).i(i18, t(t, l(iAg)));
                    }
                    r5 = r9;
                    i = i13;
                    int i211111114 = i ^ 3;
                    i13 = (((i & 3) | i211111114) << 1) - i211111114;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                case 68:
                    if (P(t, i18, i13)) {
                        Object objO3 = ar.o(t, l(iAg));
                        int i175 = a;
                        int i176 = (i175 ^ 49) + ((i175 & 49) << 1);
                        b = i176 % 128;
                        if (i176 % 2 == 0) {
                            K(i13);
                            th.hashCode();
                            throw th;
                        }
                        ((C0055l) interfaceC0051g).e(i18, objO3, K(i13));
                    }
                    r5 = r9;
                    i = i13;
                    int i211111115 = i ^ 3;
                    i13 = (((i & 3) | i211111115) << 1) - i211111115;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
                default:
                    r5 = r9;
                    i = i13;
                    int i211111116 = i ^ 3;
                    i13 = (((i & 3) | i211111116) << 1) - i211111116;
                    r9 = r5;
                    th = null;
                    r7 = r7;
                    break;
            }
        }
        while (r7 != 0) {
            this.t.l(interfaceC0051g, r7);
            r7 = itN.hasNext() ? (Map.Entry) itN.next() : th;
        }
        ?? r4 = this.s;
        r4.u(r4.j(t), interfaceC0051g);
        int i177 = a;
        int i178 = (i177 ^ 29) + ((i177 & 29) << 1);
        b = i178 % 128;
        int i179 = i178 % 2;
    }
}
