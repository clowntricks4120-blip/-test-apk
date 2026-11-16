package ivas.gov.bisp.enumeration.cP;

import ivas.gov.bisp.enumeration.p096p.h;
import java.lang.reflect.Method;
import java.text.DateFormatSymbols;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class u {
    private static int a = 1;
    private static int b;
    public static final AtomicReference<Map<String, AbstractC0242a>> c = new AtomicReference<>();

    static {
        int i = a + 9;
        b = i % 128;
        if (i % 2 != 0) {
            int i2 = 2 / 0;
        }
    }

    public static final h b(h hVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 99;
        int i4 = -(-((i2 ^ 99) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (hVar == null) {
            hVar = ivas.gov.bisp.enumeration.cR.N.bz();
            int i6 = a;
            int i7 = i6 & 123;
            int i8 = (i6 ^ 123) | i7;
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            b = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = b;
        int i12 = i11 & 19;
        int i13 = (i12 - (~(-(-((i11 ^ 19) | i12))))) - 1;
        a = i13 % 128;
        int i14 = i13 % 2;
        return hVar;
    }

    public static final AbstractC0242a d(AbstractC0242a abstractC0242a) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((((i2 ^ 21) | (i2 & 21)) << 1) - (~(-((i2 & (-22)) | ((~i2) & 21))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        if (abstractC0242a == null) {
            int i5 = i2 | 71;
            int i6 = (i5 << 1) - (i5 & (~(i2 & 71)));
            b = i6 % 128;
            if (i6 % 2 != 0) {
                abstractC0242a = AbstractC0242a.f();
                int i7 = 78 / 0;
            } else {
                abstractC0242a = AbstractC0242a.f();
            }
        }
        int i8 = a;
        int i9 = ((i8 | 99) << 1) - (i8 ^ 99);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            return abstractC0242a;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void e(Map<String, AbstractC0242a> map, String str, String str2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 89;
        int i4 = (i2 & 89) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        try {
            map.put(str, AbstractC0242a.d(str2));
            int i7 = a;
            int i8 = i7 & 19;
            int i9 = ((i7 ^ 19) | i8) << 1;
            int i10 = -((i7 | 19) & (~i8));
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            b = i11 % 128;
            int i12 = i11 % 2;
        } catch (RuntimeException unused) {
        }
    }

    public static final DateFormatSymbols c(Locale locale) {
        Method method;
        Object[] objArr;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 11) + ((i2 & 11) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        try {
            Class[] clsArr = {Locale.class};
            int i5 = (i2 ^ 53) + ((i2 & 53) << 1);
            b = i5 % 128;
            if (i5 % 2 != 0) {
                method = DateFormatSymbols.class.getMethod("getInstance", clsArr);
                objArr = new Object[0];
            } else {
                method = DateFormatSymbols.class.getMethod("getInstance", clsArr);
                objArr = new Object[1];
            }
            objArr[0] = locale;
            DateFormatSymbols dateFormatSymbols = (DateFormatSymbols) method.invoke(null, objArr);
            int i6 = b;
            int i7 = i6 + 50;
            int i8 = (i7 ^ (-1)) + (i7 << 1);
            a = i8 % 128;
            int i9 = i8 % 2;
            int i10 = ((i6 | 118) << 1) - (i6 ^ 118);
            int i11 = (i10 ^ (-1)) + (i10 << 1);
            a = i11 % 128;
            int i12 = i11 % 2;
            return dateFormatSymbols;
        } catch (Exception unused) {
            return new DateFormatSymbols(locale);
        }
    }
}
