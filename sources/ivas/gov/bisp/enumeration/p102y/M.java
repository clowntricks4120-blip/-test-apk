package ivas.gov.bisp.enumeration.p102y;

import ivas.gov.bisp.enumeration.p096p.h;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class M extends h {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ Method d;
    public final /* synthetic */ Object e;

    public M(Method method, Object obj) {
        this.d = method;
        this.e = obj;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public <T> T aC(Class<T> cls) {
        Method method;
        Object obj;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 99;
        int i4 = (i2 ^ 99) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            h.d(cls);
            method = this.d;
            obj = this.e;
            int i6 = 95 / 0;
        } else {
            h.d(cls);
            method = this.d;
            obj = this.e;
        }
        Object[] objArr = {cls};
        int i7 = a;
        int i8 = i7 | 11;
        int i9 = ((i8 << 1) - (~(-((~(i7 & 11)) & i8)))) - 1;
        b = i9 % 128;
        int i10 = i9 % 2;
        T t = (T) method.invoke(obj, objArr);
        if (i10 != 0) {
            int i11 = 45 / 0;
        }
        int i12 = a;
        int i13 = i12 ^ 21;
        int i14 = (i12 & 21) << 1;
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        b = i15 % 128;
        int i16 = i15 % 2;
        return t;
    }
}
