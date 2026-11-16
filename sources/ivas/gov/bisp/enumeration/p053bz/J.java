package ivas.gov.bisp.enumeration.p053bz;

import ivas.gov.bisp.enumeration.o000OoO.o000oOoO;
import ivas.gov.bisp.enumeration.o000OoO.o0OoOo0;
import ivas.gov.bisp.enumeration.p100w.r;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public final class J<T_WRAPPER extends o0OoOo0<T_ENGINE>, T_ENGINE> {
    private static int a = 1;
    private static int b;
    public static final Logger c = Logger.getLogger(J.class.getName());
    public static final List<Provider> d;
    public static final o000oOoO<x.btV, Mac> e;
    public static final o000oOoO<x.btU, Cipher> f;
    public T_WRAPPER g;
    public List<Provider> h = d;

    static {
        Object obj = null;
        if (r.R()) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            int i = b + 99;
            int i2 = i % 128;
            a = i2;
            int i3 = i % 2;
            int i4 = (i2 ^ 13) + ((i2 & 13) << 1);
            b = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
            int i6 = 0;
            while (i6 < 2) {
                int i7 = b + 51;
                a = i7 % 128;
                int i8 = i7 % 2;
                String str = strArr[i6];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    int i9 = b;
                    int i10 = ((i9 | 51) << 1) - (i9 ^ 51);
                    a = i10 % 128;
                    int i11 = i10 % 2;
                    arrayList.add(provider);
                    int i12 = a;
                    int i13 = ((i12 | 91) << 1) - (i12 ^ 91);
                    b = i13 % 128;
                    if (i13 % 2 != 0) {
                        int i14 = 4 / 3;
                    } else {
                        int i15 = 2 % 2;
                    }
                } else {
                    Logger logger = c;
                    int i16 = a;
                    int i17 = ((((i16 ^ 85) | (i16 & 85)) << 1) - (~(-(((~i16) & 85) | (i16 & (-86)))))) - 1;
                    b = i17 % 128;
                    int i18 = i17 % 2;
                    String str2 = String.format("Provider %s not available", str);
                    int i19 = (-2) - ((b + 28) ^ (-1));
                    a = i19 % 128;
                    if (i19 % 2 == 0) {
                        logger.info(str2);
                        obj.hashCode();
                        throw null;
                    }
                    logger.info(str2);
                    int i20 = 2 % 2;
                }
                int i21 = i6 ^ 1;
                int i22 = ((i6 & 1) | i21) << 1;
                int i23 = -i21;
                i6 = ((i22 | i23) << 1) - (i22 ^ i23);
                int i24 = b;
                int i25 = i24 & 11;
                int i26 = ((((i24 ^ 11) | i25) << 1) - (~(-((i24 | 11) & (~i25))))) - 1;
                a = i26 % 128;
                if (i26 % 2 != 0) {
                    int i27 = 2 % 2;
                }
            }
            d = arrayList;
            int i28 = a;
            int i29 = ((i28 & 72) + (i28 | 72)) - 1;
            b = i29 % 128;
            int i30 = i29 % 2;
            int i31 = 2 % 2;
        } else {
            d = new ArrayList();
            int i32 = b + 88;
            int i33 = (i32 ^ (-1)) + (i32 << 1);
            a = i33 % 128;
            int i34 = i33 % 2;
            int i35 = 2 % 2;
        }
        f = new J(new x.btU());
        J j = new J(new x.btV());
        int i36 = a;
        int i37 = i36 & 23;
        int i38 = (i36 | 23) & (~i37);
        int i39 = -(-(i37 << 1));
        int i40 = (i38 ^ i39) + ((i38 & i39) << 1);
        b = i40 % 128;
        if (i40 % 2 == 0) {
            e = j;
        } else {
            e = j;
            obj.hashCode();
            throw null;
        }
    }

    public J(T_WRAPPER t_wrapper) {
        this.g = t_wrapper;
    }

    public final T_ENGINE c(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 11;
        int i4 = (((i2 | 11) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        Iterator<Provider> it = this.h.iterator();
        int i6 = a;
        int i7 = (i6 | 73) << 1;
        int i8 = -(i6 ^ 73);
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        Object obj = null;
        Exception exc = null;
        while (it.hasNext()) {
            int i11 = a + 109;
            b = i11 % 128;
            try {
                if (i11 % 2 != 0) {
                    it.next();
                    obj.hashCode();
                    throw null;
                }
                T_ENGINE t_engine = (T_ENGINE) this.g.b(str, it.next());
                int i12 = a;
                int i13 = i12 & 65;
                int i14 = (i12 ^ 65) | i13;
                int i15 = (i13 & i14) + (i14 | i13);
                b = i15 % 128;
                if (i15 % 2 != 0) {
                    int i16 = 62 / 0;
                }
                return t_engine;
            } catch (Exception e2) {
                if (exc == null) {
                    int i17 = a;
                    int i18 = ((i17 ^ 37) | (i17 & 37)) << 1;
                    int i19 = -(((~i17) & 37) | (i17 & (-38)));
                    int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                    b = i20 % 128;
                    if (i20 % 2 != 0) {
                        int i21 = 4 / 2;
                    }
                    exc = e2;
                }
            }
        }
        T_ENGINE t_engine2 = (T_ENGINE) this.g.b(str, null);
        int i22 = a;
        int i23 = i22 & 61;
        int i24 = i23 + ((i22 ^ 61) | i23);
        b = i24 % 128;
        if (i24 % 2 != 0) {
            int i25 = 1 / 0;
        }
        return t_engine2;
    }
}
