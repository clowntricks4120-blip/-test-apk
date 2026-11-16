package ivas.gov.bisp.enumeration.p001aa;

import ivas.gov.bisp.enumeration.OooOOoo.OooOOO;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class e extends OooOOO<Object, Object> {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ i f;

    public e(i iVar) {
        this.f = iVar;
    }

    public Object e(int i, Object obj) {
        int i2 = 2 % 2;
        throw new UnsupportedOperationException("not a map");
    }

    public void f() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 27) + ((i2 & 27) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        this.f.clear();
        int i5 = b + 55;
        a = i5 % 128;
        int i6 = i5 % 2;
    }

    public Object g(int i, int i2) {
        Object obj;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 77;
        int i6 = i5 + ((i4 ^ 77) | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        Object[] objArr = this.f.j;
        if (i7 == 0) {
            obj = objArr[i];
            int i8 = 96 / 0;
        } else {
            obj = objArr[i];
        }
        int i9 = b;
        int i10 = i9 & 9;
        int i11 = (i10 - (~(-(-((i9 ^ 9) | i10))))) - 1;
        a = i11 % 128;
        if (i11 % 2 == 0) {
            return obj;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public Map<Object, Object> h() {
        int i = 2 % 2;
        throw new UnsupportedOperationException("not a map");
    }

    public int i() {
        int i = 2 % 2;
        int i2 = a + 43;
        b = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.f.k;
        if (i3 != 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int j(Object obj) {
        int iIndexOf;
        int i = 2 % 2;
        int i2 = a + 49;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            iIndexOf = this.f.indexOf(obj);
            int i3 = 38 / 0;
        } else {
            iIndexOf = this.f.indexOf(obj);
        }
        int i4 = a;
        int i5 = i4 & 51;
        int i6 = ((((i4 ^ 51) | i5) << 1) - (~(-((i4 | 51) & (~i5))))) - 1;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return iIndexOf;
        }
        throw null;
    }

    public int k(Object obj) {
        int iIndexOf;
        int i = 2 % 2;
        int i2 = a + 113;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            iIndexOf = this.f.indexOf(obj);
            int i3 = 77 / 0;
        } else {
            iIndexOf = this.f.indexOf(obj);
        }
        int i4 = b;
        int i5 = ((i4 | 31) << 1) - (i4 ^ 31);
        a = i5 % 128;
        int i6 = i5 % 2;
        return iIndexOf;
    }

    public void l(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 21;
        int i4 = -(-((i2 & 21) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            this.f.add(obj);
            throw null;
        }
        this.f.add(obj);
        int i6 = b;
        int i7 = (i6 ^ 43) + ((i6 & 43) << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
    }

    public void m(int i) {
        int i2 = 2 % 2;
        int i3 = a + 123;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.f.g(i);
        int i5 = a;
        int i6 = (i5 & 1) + (i5 | 1);
        b = i6 % 128;
        int i7 = i6 % 2;
    }
}
