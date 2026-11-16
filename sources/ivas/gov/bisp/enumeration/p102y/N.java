package ivas.gov.bisp.enumeration.p102y;

import ivas.gov.bisp.enumeration.p096p.h;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class N extends h {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ Method d;
    public final /* synthetic */ int e;

    public N(Method method, int i) {
        this.d = method;
        this.e = i;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public <T> T aC(Class<T> cls) {
        Method method;
        Object[] objArr;
        char c;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 62) << 1) - (i2 ^ 62)) - 1;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            h.d(cls);
            method = this.d;
            objArr = new Object[3];
            c = 1;
        } else {
            h.d(cls);
            method = this.d;
            objArr = new Object[2];
            c = 0;
        }
        objArr[c] = cls;
        objArr[1] = Integer.valueOf(this.e);
        Object obj = null;
        T t = (T) method.invoke(null, objArr);
        int i4 = a;
        int i5 = (-2) - (((i4 & 66) + (i4 | 66)) ^ (-1));
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return t;
        }
        obj.hashCode();
        throw null;
    }
}
