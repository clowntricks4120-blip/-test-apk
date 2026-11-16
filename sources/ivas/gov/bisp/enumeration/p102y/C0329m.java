package ivas.gov.bisp.enumeration.p102y;

import ivas.gov.bisp.enumeration.p096p.h;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.y.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0329m extends h {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ Method d;

    public C0329m(Method method) {
        this.d = method;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public <T> T aC(Class<T> cls) {
        Method method;
        Object[] objArr;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 89) + ((i2 & 89) << 1);
        a = i3 % 128;
        if (i3 % 2 != 0) {
            h.d(cls);
            method = this.d;
            objArr = new Object[3];
        } else {
            h.d(cls);
            method = this.d;
            objArr = new Object[2];
        }
        int i4 = b;
        int i5 = i4 & 11;
        int i6 = -(-(i4 | 11));
        int i7 = (i5 & i6) + (i5 | i6);
        a = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = cls;
        objArr[1] = Object.class;
        int i9 = ((i4 & (-118)) | ((~i4) & 117)) + ((i4 & 117) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        T t = (T) method.invoke(null, objArr);
        int i11 = a;
        int i12 = ((i11 & 75) - (~(-(-(i11 | 75))))) - 1;
        b = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 77 / 0;
        }
        return t;
    }
}
