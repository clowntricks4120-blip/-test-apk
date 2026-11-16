package ivas.gov.bisp.enumeration.p050bw;

import com.google.gson.reflect.TypeToken;
import ivas.gov.bisp.enumeration.o000O0.OooO0OO;
import ivas.gov.bisp.enumeration.o000O0o.o0000O;
import ivas.gov.bisp.enumeration.o000O0o.o0000Ooo;
import ivas.gov.bisp.enumeration.o000O0o.o000O000;
import ivas.gov.bisp.enumeration.o000Oo0.Oooo000;
import ivas.gov.bisp.enumeration.p032be.c;
import ivas.gov.bisp.enumeration.p032be.j;
import ivas.gov.bisp.enumeration.p035bh.C;
import ivas.gov.bisp.enumeration.p035bh.E;
import ivas.gov.bisp.enumeration.p035bh.K;
import ivas.gov.bisp.enumeration.p035bh.X;
import ivas.gov.bisp.enumeration.p035bh.Y;
import ivas.gov.bisp.enumeration.p035bh.ad;
import ivas.gov.bisp.enumeration.p035bh.al;
import ivas.gov.bisp.enumeration.p035bh.n;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class a<T> extends o000O000<T> {
    private static int a = 0;
    private static int b = 1;
    public final o0000O<T> c;
    public final o0000Ooo<T> d;
    public final C e;
    public final TypeToken<T> f;
    public o000O000<T> g;
    public final Oooo000<T>.OooO0O0 h = new bsq(this, null);

    public final class bsq implements K, al {
        public bsq(a aVar, bsp bspVar) {
        }
    }

    public a(o0000O<T> o0000o, o0000Ooo<T> o0000ooo, C c, TypeToken<T> typeToken, E e) {
        this.c = o0000o;
        this.d = o0000ooo;
        this.e = c;
        this.f = typeToken;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    /* JADX WARN: Code duplicated, block: B:13:0x0044  */
    /* JADX WARN: Code duplicated, block: B:15:0x005d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0070  */
    /* JADX WARN: Code duplicated, block: B:18:0x0073  */
    /* JADX WARN: Code duplicated, block: B:20:0x0076  */
    public final T c(j jVar) {
        n nVarE;
        o000O000<T> o000o000J;
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = i6 + 121;
        a = i7 % 128;
        int i8 = i7 % 2;
        boolean z = false;
        Object obj = null;
        if (this.d == null) {
            int i9 = (((i6 ^ 93) | (i6 & 93)) << 1) - (((~i6) & 93) | (i6 & (-94)));
            int i10 = i9 % 128;
            a = i10;
            if (i9 % 2 != 0) {
                o000o000J = this.g;
                int i11 = 65 / 0;
                if (o000o000J == null) {
                    i = (-2) - (((i10 & 46) + (i10 | 46)) ^ (-1));
                    b = i % 128;
                    if (i % 2 != 0) {
                        this.e.j(null, this.f);
                        obj.hashCode();
                        throw null;
                    }
                    o000o000J = this.e.j(null, this.f);
                    i2 = b;
                    int i12 = i2 & 33;
                    i3 = ((~i12) & (i2 | 33)) + (i12 << 1);
                    a = i3 % 128;
                    if (i3 % 2 == 0) {
                        this.g = o000o000J;
                        throw null;
                    }
                    this.g = o000o000J;
                    int i13 = ((i2 | 88) << 1) - (i2 ^ 88);
                    i4 = (i13 ^ (-1)) + (i13 << 1);
                    a = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i14 = 4 % 2;
                    }
                }
            } else {
                o000o000J = this.g;
                if (o000o000J == null) {
                    i = (-2) - (((i10 & 46) + (i10 | 46)) ^ (-1));
                    b = i % 128;
                    if (i % 2 != 0) {
                        this.e.j(null, this.f);
                        obj.hashCode();
                        throw null;
                    }
                    o000o000J = this.e.j(null, this.f);
                    i2 = b;
                    int i15 = i2 & 33;
                    i3 = ((~i15) & (i2 | 33)) + (i15 << 1);
                    a = i3 % 128;
                    if (i3 % 2 == 0) {
                        this.g = o000o000J;
                        throw null;
                    }
                    this.g = o000o000J;
                    int i16 = ((i2 | 88) << 1) - (i2 ^ 88);
                    i4 = (i16 ^ (-1)) + (i16 << 1);
                    a = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i17 = 4 % 2;
                    }
                }
            }
            T t = (T) o000o000J.c(jVar);
            int i18 = b;
            int i19 = i18 & 17;
            int i20 = ((i18 ^ 17) | i19) << 1;
            int i21 = -((i18 | 17) & (~i19));
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            a = i22 % 128;
            if (i22 % 2 != 0) {
                int i23 = 1 / 0;
            }
            return t;
        }
        try {
            try {
                jVar.y();
                try {
                    J.bsQ bsq2 = J.D;
                    int i24 = b;
                    int i25 = ((i24 & 76) + (i24 | 76)) - 1;
                    a = i25 % 128;
                    int i26 = i25 % 2;
                    nVarE = bsq2.e(jVar);
                    int i27 = a;
                    int i28 = (i27 ^ 61) + ((i27 & 61) << 1);
                    b = i28 % 128;
                    int i29 = i28 % 2;
                } catch (EOFException e) {
                    e = e;
                    if (!z) {
                        throw new X(e);
                    }
                    int i30 = b;
                    int i31 = i30 & 57;
                    int i32 = -(-((i30 ^ 57) | i31));
                    int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                    a = i33 % 128;
                    int i34 = i33 % 2;
                    nVarE = Y.c;
                    if (i34 != 0) {
                        throw null;
                    }
                    int i35 = a;
                    int i36 = i35 & 113;
                    int i37 = (i35 | 113) & (~i36);
                    int i38 = i36 << 1;
                    int i39 = (i37 ^ i38) + ((i37 & i38) << 1);
                    b = i39 % 128;
                    int i40 = i39 % 2;
                }
            } catch (OooO0OO e2) {
                throw new X((Throwable) e2);
            } catch (IOException e3) {
                throw new X(e3);
            } catch (NumberFormatException e4) {
                throw new X(e4);
            }
        } catch (EOFException e5) {
            e = e5;
            z = true;
        }
        if (nVarE instanceof Y) {
            int i41 = b;
            int i42 = ((i41 | 119) << 1) - (i41 ^ 119);
            a = i42 % 128;
            if (i42 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i43 = i41 & 89;
            int i44 = (i43 - (~((i41 ^ 89) | i43))) - 1;
            a = i44 % 128;
            if (i44 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        o0000Ooo<T> o0000ooo = this.d;
        Type type = this.f.b;
        int i45 = a;
        int i46 = ((i45 | 99) << 1) - (i45 ^ 99);
        b = i46 % 128;
        if (i46 % 2 == 0) {
            o0000ooo.b(nVarE, type, this.h);
            throw null;
        }
        T t2 = (T) o0000ooo.b(nVarE, type, this.h);
        int i47 = a;
        int i48 = i47 & 115;
        int i49 = (i47 ^ 115) | i48;
        int i50 = ((i48 | i49) << 1) - (i49 ^ i48);
        b = i50 % 128;
        int i51 = i50 % 2;
        return t2;
    }

    public final void d(c cVar, T t) throws IOException {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 65;
        int i4 = (~i3) & (i2 | 65);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        o0000O<T> o0000o = this.c;
        if (o0000o == null) {
            int i9 = i7 & 73;
            int i10 = (((~i9) & (i7 | 73)) - (~(-(-(i9 << 1))))) - 1;
            b = i10 % 128;
            int i11 = i10 % 2;
            ad adVarJ = this.g;
            if (adVarJ == null) {
                int i12 = ((i7 & (-98)) | ((~i7) & 97)) + ((i7 & 97) << 1);
                b = i12 % 128;
                int i13 = i12 % 2;
                adVarJ = this.e.j(null, this.f);
                this.g = adVarJ;
                int i14 = a;
                int i15 = ((i14 ^ 29) | (i14 & 29)) << 1;
                int i16 = -(((~i14) & 29) | (i14 & (-30)));
                int i17 = (i15 & i16) + (i16 | i15);
                b = i17 % 128;
                int i18 = i17 % 2;
            }
            adVarJ.d(cVar, t);
            int i19 = a;
            int i20 = (i19 ^ 33) + ((i19 & 33) << 1);
            b = i20 % 128;
            int i21 = i20 % 2;
            return;
        }
        if (t == null) {
            int i22 = i2 & 107;
            int i23 = (i2 | 107) & (~i22);
            int i24 = -(-(i22 << 1));
            int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
            a = i25 % 128;
            int i26 = i25 % 2;
            cVar.c();
            if (i26 != 0) {
                throw null;
            }
            return;
        }
        Type type = this.f.b;
        int i27 = b;
        int i28 = i27 & 57;
        int i29 = -(-(i27 | 57));
        int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
        a = i30 % 128;
        int i31 = i30 % 2;
        n nVarB = o0000o.b(t, type, this.h);
        J.bsQ bsq2 = J.D;
        int i32 = b;
        int i33 = i32 & 75;
        int i34 = (i32 | 75) & (~i33);
        int i35 = -(-(i33 << 1));
        int i36 = (i34 ^ i35) + ((i34 & i35) << 1);
        a = i36 % 128;
        int i37 = i36 % 2;
        bsq2.f(cVar, nVarB);
        int i38 = b + 29;
        a = i38 % 128;
        int i39 = i38 % 2;
    }
}
