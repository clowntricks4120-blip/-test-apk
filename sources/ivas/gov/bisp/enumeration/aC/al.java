package ivas.gov.bisp.enumeration.aC;

import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.ab;
import ivas.gov.bisp.enumeration.aD.ac;
import ivas.gov.bisp.enumeration.o000O000.o000O0;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class al extends o0OOO0o<al, bcF> implements ab {
    private static final al DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile o000O0<al> PARSER = null;
    private static int d = 1;
    private static int e;
    private A dekTemplate_;
    private String kekUri_ = BuildConfig.FLAVOR;

    public static final class bcF extends o0OOO0o.OooO00o<al, bcF> implements ab {
        public bcF(bcE bce) {
            super(al.u());
        }
    }

    static {
        al alVar = new al();
        DEFAULT_INSTANCE = alVar;
        int i = d;
        int i2 = i & 117;
        int i3 = (i | 117) & (~i2);
        int i4 = i2 << 1;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        e = i5 % 128;
        int i6 = i5 % 2;
        ivas.gov.bisp.enumeration.aD.S.s(al.class, alVar);
        int i7 = e;
        int i8 = i7 & 75;
        int i9 = (i7 | 75) & (~i8);
        int i10 = i8 << 1;
        int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
        d = i11 % 128;
        int i12 = i11 % 2;
    }

    public static al t() {
        int i = 2 % 2;
        int i2 = e;
        int i3 = ((i2 | 123) << 1) - (i2 ^ 123);
        d = i3 % 128;
        if (i3 % 2 != 0) {
            return DEFAULT_INSTANCE;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ al u() {
        int i = 2 % 2;
        int i2 = e;
        int i3 = i2 & 125;
        int i4 = (~i3) & (i2 | 125);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        d = i6 % 128;
        int i7 = i6 % 2;
        al alVar = DEFAULT_INSTANCE;
        if (i7 == 0) {
            int i8 = 44 / 0;
        }
        int i9 = i2 + 119;
        d = i9 % 128;
        int i10 = i9 % 2;
        return alVar;
    }

    public static al v(AbstractC0069z abstractC0069z, ivas.gov.bisp.enumeration.aD.J j) {
        int i = 2 % 2;
        int i2 = e;
        int i3 = (i2 & 107) + (i2 | 107);
        d = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        al alVar = (al) ivas.gov.bisp.enumeration.aD.S.p(DEFAULT_INSTANCE, abstractC0069z, j);
        int i4 = d;
        int i5 = (i4 & 97) + (i4 | 97);
        e = i5 % 128;
        int i6 = i5 % 2;
        return alVar;
    }

    public final Object C(ivas.gov.bisp.enumeration.aD.S.bkM bkm, Object obj, Object obj2) {
        ivas.gov.bisp.enumeration.aD.S.bkI bki;
        switch (bkm.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ac(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"kekUri_", "dekTemplate_"});
            case 3:
                return new al();
            case 4:
                return new bcF(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o000O0<al> o000o0 = PARSER;
                if (o000o0 != null) {
                    return o000o0;
                }
                synchronized (al.class) {
                    bki = PARSER;
                    if (bki == null) {
                        bki = new ivas.gov.bisp.enumeration.aD.S.bkI(DEFAULT_INSTANCE);
                        PARSER = bki;
                    }
                    break;
                }
                return bki;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final String x() {
        int i = 2 % 2;
        int i2 = e;
        int i3 = i2 ^ 97;
        int i4 = ((i2 & 97) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        d = i6 % 128;
        if (i6 % 2 != 0) {
            return this.kekUri_;
        }
        int i7 = 1 / 0;
        return this.kekUri_;
    }

    public final A y() {
        int i = 2 % 2;
        int i2 = e;
        int i3 = (-2) - ((i2 + 10) ^ (-1));
        d = i3 % 128;
        int i4 = i3 % 2;
        A aX = this.dekTemplate_;
        if (aX == null) {
            int i5 = i2 + 35;
            d = i5 % 128;
            int i6 = i5 % 2;
            aX = A.x();
            int i7 = d + 7;
            e = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = d;
        int i10 = ((i9 & 95) - (~(i9 | 95))) - 1;
        e = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 2 / 0;
        }
        return aX;
    }
}
