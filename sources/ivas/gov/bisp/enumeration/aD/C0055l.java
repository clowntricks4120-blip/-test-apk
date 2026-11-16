package ivas.gov.bisp.enumeration.aD;

import java.nio.charset.Charset;
import java.util.Objects;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0055l implements InterfaceC0051g {
    private static int a = 1;
    private static int b;
    public final AbstractC0064u c;

    public C0055l(AbstractC0064u abstractC0064u) {
        Charset charset = R.c;
        this.c = abstractC0064u;
        abstractC0064u.f = this;
    }

    public final void f(int i, Object obj, ah ahVar) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 47;
        int i5 = -(-((i3 ^ 47) | i4));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            this.c.cl(i, (aa) obj, ahVar);
            int i7 = 79 / 0;
        } else {
            this.c.cl(i, (aa) obj, ahVar);
        }
        int i8 = a;
        int i9 = i8 ^ 73;
        int i10 = ((i8 & 73) | i9) << 1;
        int i11 = -i9;
        int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
        b = i12 % 128;
        int i13 = i12 % 2;
    }

    public final void i(int i, long j) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 | 71;
        int i5 = (i4 << 1) - ((~(i3 & 71)) & i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        this.c.cr(i, AbstractC0064u.bW(j));
        int i7 = b;
        int i8 = (((i7 | 98) << 1) - (i7 ^ 98)) - 1;
        a = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void c(int i, double d) {
        AbstractC0064u abstractC0064u;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 35;
        int i5 = i3 | 35;
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            abstractC0064u = this.c;
            Objects.requireNonNull(abstractC0064u);
            int i7 = 34 / 0;
        } else {
            abstractC0064u = this.c;
            Objects.requireNonNull(abstractC0064u);
        }
        abstractC0064u.cg(i, Double.doubleToRawLongBits(d));
        int i8 = a;
        int i9 = i8 & 45;
        int i10 = ((i8 ^ 45) | i9) << 1;
        int i11 = -((i8 | 45) & (~i9));
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        b = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public final void d(int i, float f) {
        AbstractC0064u abstractC0064u;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 | 21) << 1;
        int i5 = -(((~i3) & 21) | (i3 & (-22)));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            abstractC0064u = this.c;
            Objects.requireNonNull(abstractC0064u);
            int i7 = 29 / 0;
        } else {
            abstractC0064u = this.c;
            Objects.requireNonNull(abstractC0064u);
        }
        int i8 = b;
        int i9 = (i8 & 33) + (i8 | 33);
        a = i9 % 128;
        int i10 = i9 % 2;
        abstractC0064u.ce(i, Float.floatToRawIntBits(f));
        int i11 = b + 99;
        a = i11 % 128;
        int i12 = i11 % 2;
    }

    public final void e(int i, Object obj, ah ahVar) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 45;
        int i5 = ((i3 ^ 45) | i4) << 1;
        int i6 = -((~i4) & (i3 | 45));
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        AbstractC0064u abstractC0064u = this.c;
        int i9 = ((i3 ^ 113) - (~((i3 & 113) << 1))) - 1;
        b = i9 % 128;
        int i10 = i9 % 2;
        abstractC0064u.co(i, 3);
        ahVar.c((aa) obj, abstractC0064u.f);
        int i11 = b + 125;
        a = i11 % 128;
        int i12 = i11 % 2;
        abstractC0064u.co(i, 4);
        int i13 = b;
        int i14 = i13 & 101;
        int i15 = i14 + ((i13 ^ 101) | i14);
        a = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 49 / 0;
        }
    }

    public final void g(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = ((i4 & 58) + (i4 | 58)) - 1;
        a = i5 % 128;
        if (i5 % 2 == 0) {
            this.c.cq(i, AbstractC0064u.bX(i2));
            throw null;
        }
        this.c.cq(i, AbstractC0064u.bX(i2));
        int i6 = b;
        int i7 = ((((i6 ^ 69) | (i6 & 69)) << 1) - (~(-(((~i6) & 69) | (i6 & (-70)))))) - 1;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public final void h(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = b + 45;
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        if (!(obj instanceof AbstractC0069z)) {
            this.c.ch(i, (aa) obj);
            int i6 = a;
            int i7 = (i6 & 122) + (i6 | 122);
            int i8 = (i7 ^ (-1)) + (i7 << 1);
            b = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i9 = i4 + 3;
        b = i9 % 128;
        int i10 = i9 % 2;
        this.c.cn(i, (AbstractC0069z) obj);
        int i11 = a;
        int i12 = (((i11 ^ 23) | (i11 & 23)) << 1) - (((~i11) & 23) | (i11 & (-24)));
        b = i12 % 128;
        int i13 = i12 % 2;
    }
}
