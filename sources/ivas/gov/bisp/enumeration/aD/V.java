package ivas.gov.bisp.enumeration.aD;

import ivas.gov.bisp.enumeration.o000O000.oo0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public class V {
    private static int a = 1;
    private static int b;
    public volatile aa c;
    public volatile AbstractC0069z d;

    static {
        J.d();
        int i = b;
        int i2 = i & 87;
        int i3 = (((i ^ 87) | i2) << 1) - ((i | 87) & (~i2));
        a = i3 % 128;
        int i4 = i3 % 2;
    }

    public aa c(aa aaVar) {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    try {
                        this.c = aaVar;
                        this.d = AbstractC0069z.c;
                    } catch (oo0o0Oo unused) {
                        this.c = aaVar;
                        this.d = AbstractC0069z.c;
                    }
                }
            }
        }
        return this.c;
    }

    public AbstractC0069z d() {
        if (this.d != null) {
            return this.d;
        }
        synchronized (this) {
            if (this.d != null) {
                return this.d;
            }
            if (this.c == null) {
                this.d = AbstractC0069z.c;
            } else {
                this.d = this.c.g();
            }
            return this.d;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 65;
        int i4 = (~i3) & (i2 | 65);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        int i8 = (i2 ^ 125) + ((i2 & 125) << 1);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            return 1;
        }
        throw null;
    }

    public boolean equals(Object obj) {
        aa aaVarC;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 6) + (i2 | 6);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        if (this == obj) {
            int i7 = i2 & 11;
            int i8 = (i7 - (~(-(-((i2 ^ 11) | i7))))) - 1;
            b = i8 % 128;
            int i9 = i8 % 2;
            int i10 = i2 + 41;
            b = i10 % 128;
            int i11 = i10 % 2;
            return true;
        }
        if (!(obj instanceof V)) {
            int i12 = (i5 ^ 65) + ((i5 & 65) << 1);
            a = i12 % 128;
            return i12 % 2 == 0;
        }
        V v = (V) obj;
        aa aaVar = this.c;
        int i13 = b;
        int i14 = i13 & 27;
        int i15 = ((i13 ^ 27) | i14) << 1;
        int i16 = -((i13 | 27) & (~i14));
        int i17 = (i15 & i16) + (i16 | i15);
        a = i17 % 128;
        Object obj2 = null;
        if (i17 % 2 == 0) {
            aa aaVar2 = v.c;
            throw null;
        }
        aa aaVar3 = v.c;
        if (aaVar == null) {
            int i18 = a;
            int i19 = i18 ^ 17;
            int i20 = ((i18 & 17) | i19) << 1;
            int i21 = -i19;
            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
            b = i22 % 128;
            if (i22 % 2 != 0) {
                throw null;
            }
            if (aaVar3 == null) {
                int i23 = ((i18 ^ 80) + ((i18 & 80) << 1)) - 1;
                b = i23 % 128;
                if (i23 % 2 == 0) {
                    return d().equals(v.d());
                }
                d().equals(v.d());
                throw null;
            }
        }
        if (aaVar != null) {
            int i24 = b;
            int i25 = ((i24 & 95) - (~(i24 | 95))) - 1;
            a = i25 % 128;
            int i26 = i25 % 2;
            if (aaVar3 != null) {
                int i27 = ((i24 | 33) << 1) - (i24 ^ 33);
                a = i27 % 128;
                int i28 = i27 % 2;
                boolean zEquals = aaVar.equals(aaVar3);
                int i29 = b + 7;
                a = i29 % 128;
                if (i29 % 2 == 0) {
                    int i30 = 79 / 0;
                }
                return zEquals;
            }
        }
        if (aaVar == null) {
            boolean zEquals2 = c(aaVar3.a()).equals(aaVar3);
            int i31 = b;
            int i32 = (-2) - (((i31 & 60) + (i31 | 60)) ^ (-1));
            a = i32 % 128;
            if (i32 % 2 == 0) {
                int i33 = 45 / 0;
            }
            return zEquals2;
        }
        int i34 = b;
        int i35 = i34 | 85;
        int i36 = i35 << 1;
        int i37 = -((~(i34 & 85)) & i35);
        int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
        a = i38 % 128;
        if (i38 % 2 == 0) {
            aaVarC = v.c(aaVar.a());
            int i39 = 14 / 0;
        } else {
            aaVarC = v.c(aaVar.a());
        }
        boolean zEquals3 = aaVar.equals(aaVarC);
        int i40 = b;
        int i41 = (-2) - ((((i40 | 72) << 1) - (i40 ^ 72)) ^ (-1));
        a = i41 % 128;
        if (i41 % 2 != 0) {
            return zEquals3;
        }
        obj2.hashCode();
        throw null;
    }
}
