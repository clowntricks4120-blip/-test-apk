package ivas.gov.bisp.enumeration.p050bw;

import com.google.gson.reflect.TypeToken;
import ivas.gov.bisp.enumeration.o000O0o.o000O000;
import ivas.gov.bisp.enumeration.p032be.c;
import ivas.gov.bisp.enumeration.p032be.j;
import ivas.gov.bisp.enumeration.p035bh.C;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes.dex */
public final class o<T> extends o000O000<T> {
    private static int a = 1;
    private static int b;
    public final C c;
    public final o000O000<T> d;
    public final Type e;

    public o(C c, o000O000<T> o000o000, Type type) {
        this.c = c;
        this.d = o000o000;
        this.e = type;
    }

    public final T c(j jVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 125) | (i2 & 125)) << 1;
        int i4 = -(((~i2) & 125) | (i2 & (-126)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            this.d.c(jVar);
            throw null;
        }
        T t = (T) this.d.c(jVar);
        int i6 = a;
        int i7 = (i6 ^ 111) + ((i6 & 111) << 1);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            return t;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0067  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bd A[PHI: r1
  0x00bd: PHI (r1v18 ivas.gov.bisp.enumeration.o000O0o.o000O000<T>) = (r1v17 ivas.gov.bisp.enumeration.o000O0o.o000O000<T>), (r1v23 ivas.gov.bisp.enumeration.o000O0o.o000O000<T>) binds: [B:28:0x00bb, B:25:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    public final void d(c cVar, T t) {
        o000O000<T> o000o000;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 59) + ((i2 & 59) << 1);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        o000O000<T> o000o000H = this.d;
        Type type = this.e;
        int i6 = (((i4 | 53) << 1) - (~(-(((~i4) & 53) | (i4 & (-54)))))) - 1;
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        Object obj = null;
        if (t != null) {
            int i9 = i7 & 79;
            int i10 = (((i7 ^ 79) | i9) << 1) - ((~i9) & (i7 | 79));
            b = i10 % 128;
            int i11 = i10 % 2;
            if (type != Object.class) {
                int i12 = (i7 | 71) << 1;
                int i13 = -(((~i7) & 71) | (i7 & (-72)));
                int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                b = i14 % 128;
                if (i14 % 2 != 0) {
                    boolean z = type instanceof TypeVariable;
                    throw null;
                }
                if ((type instanceof TypeVariable) || (type instanceof Class)) {
                    type = t.getClass();
                    int i15 = b;
                    int i16 = (i15 & 123) + (i15 | 123);
                    a = i16 % 128;
                    int i17 = i16 % 2;
                }
            } else {
                type = t.getClass();
                int i18 = b;
                int i19 = (i18 & 123) + (i18 | 123);
                a = i19 % 128;
                int i110 = i19 % 2;
            }
        }
        if (type != this.e) {
            C c = this.c;
            TypeToken<T> typeToken = new TypeToken<>(type);
            int i20 = a;
            int i21 = i20 ^ 27;
            int i22 = ((i20 & 27) | i21) << 1;
            int i23 = -i21;
            int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
            b = i24 % 128;
            if (i24 % 2 != 0) {
                boolean z2 = c.h(typeToken) instanceof t.bsj;
                throw null;
            }
            o000o000H = c.h(typeToken);
            if (o000o000H instanceof t.bsj) {
                int i25 = b + 45;
                int i26 = i25 % 128;
                a = i26;
                if (i25 % 2 == 0) {
                    o000o000 = this.d;
                    int i27 = 73 / 0;
                    if (!(o000o000 instanceof t.bsj)) {
                        o000o000H = o000o000;
                        int i28 = (i26 | 35) << 1;
                        int i29 = -(((~i26) & 35) | (i26 & (-36)));
                        int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
                        b = i30 % 128;
                        int i31 = i30 % 2;
                    }
                } else {
                    o000o000 = this.d;
                    if (!(o000o000 instanceof t.bsj)) {
                        o000o000H = o000o000;
                        int i210 = (i26 | 35) << 1;
                        int i211 = -(((~i26) & 35) | (i26 & (-36)));
                        int i32 = ((i210 | i211) << 1) - (i210 ^ i211);
                        b = i32 % 128;
                        int i33 = i32 % 2;
                    }
                }
            }
        }
        o000o000H.d(cVar, t);
        int i34 = b;
        int i35 = (i34 & 97) + (i34 | 97);
        a = i35 % 128;
        if (i35 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
