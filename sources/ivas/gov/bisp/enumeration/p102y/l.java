package ivas.gov.bisp.enumeration.p102y;

import com.google.gson.reflect.TypeToken;
import ivas.gov.bisp.enumeration.o000O0o.o000O000;
import ivas.gov.bisp.enumeration.p032be.j;
import ivas.gov.bisp.enumeration.p035bh.C;
import ivas.gov.bisp.enumeration.p035bh.E;
import ivas.gov.bisp.enumeration.p035bh.T;
import ivas.gov.bisp.enumeration.p035bh.ad;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l implements E, Cloneable {
    private static int a = 0;
    private static int b = 1;
    public static final l c = new l();
    public List<T> d = Collections.emptyList();
    public List<T> e = Collections.emptyList();

    static {
        int i = a;
        int i2 = ((i | 82) << 1) - (i ^ 82);
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Code duplicated, block: B:9:0x002f  */
    public final boolean d(Class<?> cls, boolean z) {
        List<T> list;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 54) + (i2 | 54);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        int i5 = i4 % 128;
        b = i5;
        if (i4 % 2 == 0) {
            int i6 = 37 / 0;
            if (z) {
                list = this.d;
                int i7 = i5 + 95;
                a = i7 % 128;
                int i8 = i7 % 2;
            } else {
                list = this.e;
                int i9 = ((i2 ^ 14) + ((i2 & 14) << 1)) - 1;
                b = i9 % 128;
                int i10 = i9 % 2;
            }
        } else if (!z) {
            list = this.e;
            int i11 = ((i2 ^ 14) + ((i2 & 14) << 1)) - 1;
            b = i11 % 128;
            int i12 = i11 % 2;
        } else {
            list = this.d;
            int i13 = i5 + 95;
            a = i13 % 128;
            int i14 = i13 % 2;
        }
        Iterator<T> it = list.iterator();
        int i15 = b + 111;
        a = i15 % 128;
        int i16 = i15 % 2;
        while (it.hasNext()) {
            int i17 = a;
            int i18 = (i17 ^ 3) + ((i17 & 3) << 1);
            b = i18 % 128;
            Object obj = null;
            if (i18 % 2 == 0) {
                it.next().b(cls);
                throw null;
            }
            if (it.next().b(cls)) {
                int i19 = a;
                int i20 = ((i19 & 105) - (~(-(-(i19 | 105))))) - 1;
                int i21 = i20 % 128;
                b = i21;
                int i22 = i20 % 2;
                int i23 = (i21 & (-112)) | ((~i21) & 111);
                int i24 = (i21 & 111) << 1;
                int i25 = (i23 & i24) + (i24 | i23);
                a = i25 % 128;
                if (i25 % 2 == 0) {
                    return true;
                }
                obj.hashCode();
                throw null;
            }
        }
        int i26 = b;
        int i27 = (i26 ^ 104) + ((i26 & 104) << 1);
        int i28 = (i27 ^ (-1)) + (i27 << 1);
        a = i28 % 128;
        int i29 = i28 % 2;
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0045  */
    public final boolean e(Class<?> cls) {
        boolean z;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 94) + ((i2 & 94) << 1)) - 1;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            Enum.class.isAssignableFrom(cls);
            throw null;
        }
        if (Enum.class.isAssignableFrom(cls)) {
            int i4 = a + 97;
            b = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        } else {
            if (!cls.isAnonymousClass()) {
                int i6 = b;
                int i7 = i6 & 97;
                int i8 = (i6 | 97) & (~i7);
                int i9 = -(-(i7 << 1));
                int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
                a = i10 % 128;
                if (i10 % 2 != 0) {
                    cls.isLocalClass();
                    throw null;
                }
                if (!cls.isLocalClass()) {
                    int i11 = a + 97;
                    b = i11 % 128;
                    int i12 = i11 % 2;
                    z = false;
                }
            }
            int i13 = a;
            int i14 = ((i13 ^ 33) | (i13 & 33)) << 1;
            int i15 = -(((~i13) & 33) | (i13 & (-34)));
            int i16 = (i14 & i15) + (i15 | i14);
            b = i16 % 128;
            int i17 = i16 % 2;
            z = true;
        }
        int i18 = b;
        int i19 = i18 & 49;
        int i20 = ((i18 | 49) & (~i19)) + (i19 << 1);
        a = i20 % 128;
        if (i20 % 2 != 0) {
            int i21 = 23 / 0;
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0097  */
    /* JADX WARN: Code duplicated, block: B:9:0x005a  */
    @Override // ivas.gov.bisp.enumeration.p035bh.E
    public final <T> o000O000<T> b(C c2, TypeToken<T> typeToken) {
        boolean z;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 23;
        int i4 = ((((i2 & 23) | i3) << 1) - (~(-i3))) - 1;
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            e(typeToken.a);
            obj.hashCode();
            throw null;
        }
        Class<? super T> cls = typeToken.a;
        boolean zE = e(cls);
        boolean z2 = false;
        if (!zE) {
            int i5 = b;
            int i6 = i5 & 59;
            int i7 = ((i5 ^ 59) | i6) << 1;
            int i8 = -((i5 | 59) & (~i6));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            a = i9 % 128;
            int i10 = i9 % 2;
            if (d(cls, true)) {
                int i11 = b;
                int i12 = (i11 & 113) + (i11 | 113);
                a = i12 % 128;
                int i13 = i12 % 2;
                z = true;
            } else {
                int i14 = b;
                int i15 = i14 & 65;
                int i16 = i15 + ((i14 ^ 65) | i15);
                int i17 = i16 % 128;
                a = i17;
                int i18 = i16 % 2;
                int i19 = ((i17 ^ 67) - (~((i17 & 67) << 1))) - 1;
                b = i19 % 128;
                int i20 = i19 % 2;
                z = false;
            }
        } else {
            int i110 = b;
            int i111 = (i110 & 113) + (i110 | 113);
            a = i111 % 128;
            int i112 = i111 % 2;
            z = true;
        }
        if (zE) {
            int i21 = a;
            int i22 = ((i21 | 27) << 1) - (i21 ^ 27);
            b = i22 % 128;
            int i23 = i22 % 2;
            z2 = true;
        } else {
            int i24 = a;
            int i25 = (i24 ^ 1) + ((i24 & 1) << 1);
            b = i25 % 128;
            int i26 = i25 % 2;
            if (d(cls, false)) {
                int i27 = a;
                int i28 = ((i27 | 27) << 1) - (i27 ^ 27);
                b = i28 % 128;
                int i29 = i28 % 2;
                z2 = true;
            } else {
                int i30 = a;
                int i31 = (i30 ^ 47) + ((i30 & 47) << 1);
                b = i31 % 128;
                int i32 = i31 % 2;
                int i33 = i30 & 9;
                int i34 = (i30 ^ 9) | i33;
                int i35 = (i33 & i34) + (i34 | i33);
                b = i35 % 128;
                int i36 = i35 % 2;
            }
        }
        if (!z) {
            int i37 = a;
            int i38 = i37 & 101;
            int i39 = (i38 - (~((i37 ^ 101) | i38))) - 1;
            b = i39 % 128;
            if (i39 % 2 == 0) {
                throw null;
            }
            if (!z2) {
                int i40 = i37 + 31;
                int i41 = i40 % 128;
                b = i41;
                int i42 = i40 % 2;
                int i43 = i41 + 63;
                a = i43 % 128;
                int i44 = i43 % 2;
                return null;
            }
        }
        blu bluVar = new blu(z2, z, c2, typeToken);
        int i45 = a;
        int i46 = i45 & 119;
        int i47 = i46 + ((i45 ^ 119) | i46);
        b = i47 % 128;
        if (i47 % 2 != 0) {
            return bluVar;
        }
        obj.hashCode();
        throw null;
    }

    public final Object clone() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 85;
        int i4 = (i2 | 85) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        try {
            l lVar = (l) super.clone();
            int i8 = a;
            int i9 = (i8 & (-86)) | ((~i8) & 85);
            int i10 = -(-((i8 & 85) << 1));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            b = i11 % 128;
            int i12 = i11 % 2;
            return lVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class blu<T> extends o000O000<T> {
        private static int a = 0;
        private static int b = 1;
        public o000O000<T> c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ C f;
        public final /* synthetic */ TypeToken h;

        public blu(boolean z, boolean z2, C c, TypeToken typeToken) {
            this.d = z;
            this.e = z2;
            this.f = c;
            this.h = typeToken;
        }

        public T c(j jVar) throws IOException {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 77) + (i2 | 77);
            b = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this.d) {
                int i4 = (i2 ^ 65) + ((i2 & 65) << 1);
                b = i4 % 128;
                if (i4 % 2 != 0) {
                    jVar.C();
                    return null;
                }
                jVar.C();
                obj.hashCode();
                throw null;
            }
            ad adVarJ = this.c;
            if (adVarJ == null) {
                int i5 = i2 & 47;
                int i6 = ((i2 ^ 47) | i5) << 1;
                int i7 = -((i2 | 47) & (~i5));
                int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
                b = i8 % 128;
                int i9 = i8 % 2;
                adVarJ = this.f.j(l.this, this.h);
                int i10 = b;
                int i11 = i10 & 3;
                int i12 = (~i11) & (i10 | 3);
                int i13 = -(-(i11 << 1));
                int i14 = (i12 & i13) + (i13 | i12);
                a = i14 % 128;
                if (i14 % 2 != 0) {
                    this.c = adVarJ;
                    int i15 = 22 / 0;
                } else {
                    this.c = adVarJ;
                }
                int i16 = i10 & 7;
                int i17 = ((i10 | 7) & (~i16)) + (i16 << 1);
                a = i17 % 128;
                int i18 = i17 % 2;
            }
            T t = (T) adVarJ.c(jVar);
            int i19 = a + 124;
            int i20 = (i19 ^ (-1)) + (i19 << 1);
            b = i20 % 128;
            int i21 = i20 % 2;
            return t;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0056, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0057, code lost:
        
            r2 = r6.c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
        
            if (r2 != null) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
        
            r1 = r1 + 45;
            r2 = r1 % 128;
            ivas.gov.bisp.enumeration.y.l.blu.b = r2;
            r1 = r1 % 2;
            r1 = r6.f;
            r3 = r6.g;
            r4 = r6.h;
            r5 = ((r2 | 91) << 1) - (r2 ^ 91);
            ivas.gov.bisp.enumeration.y.l.blu.a = r5 % 128;
            r5 = r5 % 2;
            r2 = r1.j(r3, r4);
            r6.c = r2;
            r1 = ivas.gov.bisp.enumeration.y.l.blu.a;
            r3 = r1 & 125;
            r1 = (r1 | 125) & (~r3);
            r3 = -(-(r3 << 1));
            r4 = (r1 ^ r3) + ((r1 & r3) << 1);
            ivas.gov.bisp.enumeration.y.l.blu.b = r4 % 128;
            r4 = r4 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0091, code lost:
        
            r2.d(r7, r8);
            r7 = ivas.gov.bisp.enumeration.y.l.blu.a;
            r8 = (r7 & (-56)) | ((~r7) & 55);
            r7 = (r7 & 55) << 1;
            r1 = (r8 & r7) + (r7 | r8);
            ivas.gov.bisp.enumeration.y.l.blu.b = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x00a9, code lost:
        
            if ((r1 % 2) != 0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x00ab, code lost:
        
            r7 = 90 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00af, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
        
            if (r6.e != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
        
            if (r6.e != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
        
            r8 = (r1 & (-84)) | ((~r1) & 83);
            r1 = (r1 & 83) << 1;
            r2 = ((r8 | r1) << 1) - (r8 ^ r1);
            ivas.gov.bisp.enumeration.y.l.blu.b = r2 % 128;
            r2 = r2 % 2;
            r7.c();
            r7 = ivas.gov.bisp.enumeration.y.l.blu.a;
            r8 = (((r7 & (-52)) | ((~r7) & 51)) - (~((r7 & 51) << 1))) - 1;
            ivas.gov.bisp.enumeration.y.l.blu.b = r8 % 128;
            r8 = r8 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void d(ivas.gov.bisp.enumeration.p032be.c r7, T r8) throws java.io.IOException {
            /*
                r6 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = ivas.gov.bisp.enumeration.y.l.blu.b
                r2 = r1 ^ 121(0x79, float:1.7E-43)
                r3 = r1 & 121(0x79, float:1.7E-43)
                r2 = r2 | r3
                int r2 = r2 << 1
                int r3 = ~r3
                r1 = r1 | 121(0x79, float:1.7E-43)
                r1 = r1 & r3
                int r1 = -r1
                r3 = r2 & r1
                r1 = r1 | r2
                int r3 = r3 + r1
                int r1 = r3 % 128
                ivas.gov.bisp.enumeration.y.l.blu.a = r1
                int r3 = r3 % r0
                if (r3 == 0) goto L25
                boolean r2 = r6.e
                r3 = 46
                int r3 = r3 / 0
                if (r2 == 0) goto L57
                goto L29
            L25:
                boolean r2 = r6.e
                if (r2 == 0) goto L57
            L29:
                r8 = r1 & (-84)
                int r2 = ~r1
                r2 = r2 & 83
                r8 = r8 | r2
                r1 = r1 & 83
                int r1 = r1 << 1
                r2 = r8 | r1
                int r2 = r2 << 1
                r8 = r8 ^ r1
                int r2 = r2 - r8
                int r8 = r2 % 128
                ivas.gov.bisp.enumeration.y.l.blu.b = r8
                int r2 = r2 % r0
                r7.c()
                int r7 = ivas.gov.bisp.enumeration.y.l.blu.a
                r8 = r7 & (-52)
                int r1 = ~r7
                r2 = 51
                r1 = r1 & r2
                r8 = r8 | r1
                r7 = r7 & r2
                int r7 = r7 << 1
                int r7 = ~r7
                int r8 = r8 - r7
                int r8 = r8 + (-1)
                int r7 = r8 % 128
                ivas.gov.bisp.enumeration.y.l.blu.b = r7
                int r8 = r8 % r0
                return
            L57:
                ivas.gov.bisp.enumeration.o000O0o.o000O000<T> r2 = r6.c
                if (r2 != 0) goto L91
                int r1 = r1 + 45
                int r2 = r1 % 128
                ivas.gov.bisp.enumeration.y.l.blu.b = r2
                int r1 = r1 % r0
                ivas.gov.bisp.enumeration.bh.C r1 = r6.f
                ivas.gov.bisp.enumeration.y.l r3 = ivas.gov.bisp.enumeration.p102y.l.this
                com.google.gson.reflect.TypeToken r4 = r6.h
                r5 = r2 | 91
                int r5 = r5 << 1
                r2 = r2 ^ 91
                int r5 = r5 - r2
                int r2 = r5 % 128
                ivas.gov.bisp.enumeration.y.l.blu.a = r2
                int r5 = r5 % r0
                ivas.gov.bisp.enumeration.bh.ad r2 = r1.j(r3, r4)
                r6.c = r2
                int r1 = ivas.gov.bisp.enumeration.y.l.blu.a
                r3 = r1 & 125(0x7d, float:1.75E-43)
                int r4 = ~r3
                r1 = r1 | 125(0x7d, float:1.75E-43)
                r1 = r1 & r4
                int r3 = r3 << 1
                int r3 = -r3
                int r3 = -r3
                r4 = r1 ^ r3
                r1 = r1 & r3
                int r1 = r1 << 1
                int r4 = r4 + r1
                int r1 = r4 % 128
                ivas.gov.bisp.enumeration.y.l.blu.b = r1
                int r4 = r4 % r0
            L91:
                r2.d(r7, r8)
                int r7 = ivas.gov.bisp.enumeration.y.l.blu.a
                r8 = r7 & (-56)
                int r1 = ~r7
                r2 = 55
                r1 = r1 & r2
                r8 = r8 | r1
                r7 = r7 & r2
                int r7 = r7 << 1
                r1 = r8 & r7
                r7 = r7 | r8
                int r1 = r1 + r7
                int r7 = r1 % 128
                ivas.gov.bisp.enumeration.y.l.blu.b = r7
                int r1 = r1 % r0
                if (r1 != 0) goto Laf
                r7 = 90
                int r7 = r7 / 0
            Laf:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.y.l.blu.d(ivas.gov.bisp.enumeration.be.c, java.lang.Object):void");
        }
    }
}
