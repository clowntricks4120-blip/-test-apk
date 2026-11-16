package ivas.gov.bisp.enumeration.aS;

import ivas.gov.bisp.enumeration.o0000o0o.OooOo00;
import java.security.GeneralSecurityException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class S implements R.bgZ {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ AbstractC0080o c;

    public S(AbstractC0080o abstractC0080o) {
        this.c = abstractC0080o;
    }

    @Override // ivas.gov.bisp.enumeration.aS.R.bgZ
    public <Q> OooOo00<Q> b(Class<Q> cls) throws GeneralSecurityException {
        int i = 2 % 2;
        try {
            C0078l c0078l = new C0078l(this.c, cls);
            int i2 = b;
            int i3 = i2 & 93;
            int i4 = (i2 ^ 93) | i3;
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            return c0078l;
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // ivas.gov.bisp.enumeration.aS.R.bgZ
    public OooOo00<?> c() {
        int i = 2 % 2;
        AbstractC0080o abstractC0080o = this.c;
        C0078l c0078l = new C0078l(abstractC0080o, abstractC0080o.e);
        int i2 = a;
        int i3 = ((i2 ^ 45) - (~(-(-((i2 & 45) << 1))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        return c0078l;
    }

    @Override // ivas.gov.bisp.enumeration.aS.R.bgZ
    public Class<?> d() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 103;
        int i4 = (i3 - (~(-(-((i2 ^ 103) | i3))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        Class<?> cls = this.c.getClass();
        if (i5 != 0) {
            int i6 = 12 / 0;
        }
        int i7 = a;
        int i8 = i7 | 87;
        int i9 = (i8 << 1) - ((~(i7 & 87)) & i8);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 44 / 0;
        }
        return cls;
    }

    @Override // ivas.gov.bisp.enumeration.aS.R.bgZ
    public Set<Class<?>> e() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 84) + (i2 | 84);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            this.c.d.keySet();
            throw null;
        }
        Set<Class<?>> setKeySet = this.c.d.keySet();
        int i5 = a;
        int i6 = ((i5 ^ 65) | (i5 & 65)) << 1;
        int i7 = -(((~i5) & 65) | (i5 & (-66)));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        return setKeySet;
    }
}
