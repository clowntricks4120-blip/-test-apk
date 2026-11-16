package ivas.gov.bisp.enumeration.p050bw;

import com.google.gson.reflect.TypeToken;
import ivas.gov.bisp.enumeration.o000O0o.o000O000;
import ivas.gov.bisp.enumeration.p003ac.P;
import ivas.gov.bisp.enumeration.p032be.c;
import ivas.gov.bisp.enumeration.p032be.j;
import ivas.gov.bisp.enumeration.p035bh.C;
import ivas.gov.bisp.enumeration.p035bh.E;
import ivas.gov.bisp.enumeration.p035bh.ad;
import ivas.gov.bisp.enumeration.p102y.J;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class z extends o000O000<Object> {
    private static int a = 1;
    private static int b;
    public static final E c = new bsf();
    public final C d;

    public class bsf implements E {
        private static int a = 1;
        private static int b;

        @Override // ivas.gov.bisp.enumeration.p035bh.E
        public <T> o000O000<T> b(C c, TypeToken<T> typeToken) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 117) | (i2 & 117)) << 1;
            int i4 = -(((~i2) & 117) | (i2 & (-118)));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            if (typeToken.a != Object.class) {
                int i7 = b;
                int i8 = ((i7 & (-46)) | ((~i7) & 45)) + ((i7 & 45) << 1);
                a = i8 % 128;
                int i9 = i8 % 2;
                return null;
            }
            z zVar = new z(c);
            int i10 = b;
            int i11 = (((i10 & (-94)) | ((~i10) & 93)) - (~((i10 & 93) << 1))) - 1;
            a = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 50 / 0;
            }
            return zVar;
        }
    }

    static {
        int i = a;
        int i2 = i & 3;
        int i3 = ((i ^ 3) | i2) << 1;
        int i4 = -((i | 3) & (~i2));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    public z(C c2) {
        this.d = c2;
    }

    public final void d(c cVar, Object obj) throws IOException {
        int i = 2 % 2;
        int i2 = b + 23;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        Object obj2 = null;
        if (obj == null) {
            int i5 = i3 + 5;
            b = i5 % 128;
            if (i5 % 2 == 0) {
                cVar.c();
                return;
            } else {
                cVar.c();
                obj2.hashCode();
                throw null;
            }
        }
        C c2 = this.d;
        Class<?> cls = obj.getClass();
        Objects.requireNonNull(c2);
        TypeToken typeToken = new TypeToken(cls);
        int i6 = a + 27;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            boolean z = c2.h(typeToken) instanceof z;
            throw null;
        }
        ad adVarH = c2.h(typeToken);
        if (!(adVarH instanceof z)) {
            adVarH.d(cVar, obj);
            int i7 = b;
            int i8 = i7 & 87;
            int i9 = i8 + ((i7 ^ 87) | i8);
            a = i9 % 128;
            int i10 = i9 % 2;
            return;
        }
        int i11 = a;
        int i12 = ((i11 & (-24)) | ((~i11) & 23)) + ((i11 & 23) << 1);
        b = i12 % 128;
        int i13 = i12 % 2;
        cVar.f();
        cVar.h();
        int i14 = a;
        int i15 = ((((i14 ^ 77) | (i14 & 77)) << 1) - (~(-(((~i14) & 77) | (i14 & (-78)))))) - 1;
        b = i15 % 128;
        int i16 = i15 % 2;
    }

    public final Object c(j jVar) {
        int i = 2 % 2;
        int i2 = b + 123;
        a = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            P.c(jVar.y());
            throw null;
        }
        int iC = P.c(jVar.y());
        if (iC != 0) {
            int i3 = b;
            int i4 = (((i3 | 108) << 1) - (i3 ^ 108)) - 1;
            a = i4 % 128;
            if (i4 % 2 != 0 ? iC == 2 : iC == 2) {
                J j = new J();
                jVar.e();
                int i5 = b;
                int i6 = i5 & 1;
                int i7 = (i5 ^ 1) | i6;
                int i8 = (i6 & i7) + (i7 | i6);
                a = i8 % 128;
                int i9 = i8 % 2;
                while (jVar.c()) {
                    int i10 = b;
                    int i11 = (i10 & 1) + (i10 | 1);
                    a = i11 % 128;
                    int i12 = i11 % 2;
                    j.put(jVar.r(), c(jVar));
                    int i13 = a;
                    int i14 = (i13 & 45) + (i13 | 45);
                    b = i14 % 128;
                    int i15 = i14 % 2;
                }
                jVar.h();
                int i16 = a;
                int i17 = i16 & 27;
                int i18 = i17 + ((i16 ^ 27) | i17);
                b = i18 % 128;
                if (i18 % 2 == 0) {
                    return j;
                }
                throw null;
            }
            if (iC == 5) {
                String strX = jVar.x();
                int i19 = b;
                int i20 = i19 ^ 47;
                int i21 = -(-((i19 & 47) << 1));
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                a = i22 % 128;
                int i23 = i22 % 2;
                return strX;
            }
            int i24 = i3 + 87;
            a = i24 % 128;
            if (i24 % 2 != 0 ? iC == 6 : iC == 20) {
                Double dValueOf = Double.valueOf(jVar.p());
                int i25 = a;
                int i26 = i25 | 53;
                int i27 = i26 << 1;
                int i28 = -((~(i25 & 53)) & i26);
                int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                b = i29 % 128;
                if (i29 % 2 != 0) {
                    int i30 = 14 / 0;
                }
                return dValueOf;
            }
            int i31 = i3 + 5;
            int i32 = i31 % 128;
            a = i32;
            if (i31 % 2 != 0 ? iC == 7 : iC == 4) {
                Boolean boolValueOf = Boolean.valueOf(jVar.n());
                int i33 = b;
                int i34 = ((i33 ^ 7) | (i33 & 7)) << 1;
                int i35 = -(((~i33) & 7) | (i33 & (-8)));
                int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
                a = i36 % 128;
                if (i36 % 2 != 0) {
                    return boolValueOf;
                }
                obj.hashCode();
                throw null;
            }
            if (iC != 8) {
                throw new IllegalStateException();
            }
            int i37 = ((i32 & (-104)) | ((~i32) & 103)) + ((i32 & 103) << 1);
            b = i37 % 128;
            if (i37 % 2 != 0) {
                jVar.s();
                throw null;
            }
            jVar.s();
            int i38 = a + 107;
            b = i38 % 128;
            int i39 = i38 % 2;
            return null;
        }
        ArrayList arrayList = new ArrayList();
        jVar.d();
        int i40 = b;
        int i41 = ((i40 | 43) << 1) - (i40 ^ 43);
        a = i41 % 128;
        while (true) {
            int i42 = i41 % 2;
            if (!jVar.c()) {
                jVar.i();
                int i43 = b;
                int i44 = (i43 & 14) + (i43 | 14);
                int i45 = (i44 ^ (-1)) + (i44 << 1);
                a = i45 % 128;
                int i46 = i45 % 2;
                return arrayList;
            }
            int i47 = a;
            int i48 = (-2) - ((((i47 | 96) << 1) - (i47 ^ 96)) ^ (-1));
            b = i48 % 128;
            int i49 = i48 % 2;
            arrayList.add(c(jVar));
            int i50 = a;
            int i51 = i50 & 1;
            i41 = i51 + ((i50 ^ 1) | i51);
            b = i41 % 128;
        }
    }
}
