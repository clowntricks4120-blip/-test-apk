package ivas.gov.bisp.enumeration.p081d;

import android.view.View;
import ivas.gov.bisp.enumeration.Oooo0o.o0ooOOo;

/* JADX INFO: loaded from: classes.dex */
public class Q extends o0ooOOo.OooO0O0<Boolean> {
    private static int a = 0;
    private static int b = 1;

    public Q(int i, Class cls, int i2) {
        super(i, cls, i2);
    }

    public Object e(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 23) + ((i2 & 23) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        boolean zE = T.aXh.e(view);
        if (i4 == 0) {
            Boolean.valueOf(zE);
            obj.hashCode();
            throw null;
        }
        Boolean boolValueOf = Boolean.valueOf(zE);
        int i5 = a;
        int i6 = (((i5 & (-30)) | ((~i5) & 29)) - (~((i5 & 29) << 1))) - 1;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return boolValueOf;
        }
        throw null;
    }

    public void f(View view, Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 75;
        int i4 = i3 + ((i2 ^ 75) | i3);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            T.aXh.i(view, ((Boolean) obj).booleanValue());
        } else {
            T.aXh.i(view, ((Boolean) obj).booleanValue());
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean h(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - ((i2 + 46) ^ (-1));
        b = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int i4 = i2 ^ 93;
        int i5 = ((i2 & 93) | i4) << 1;
        int i6 = -i4;
        int i7 = (i5 & i6) + (i5 | i6);
        b = i7 % 128;
        int i8 = i7 % 2;
        boolean zD = d((Boolean) obj, (Boolean) obj2);
        if (i8 == 0) {
            return zD;
        }
        return ((zD ? 1 : 0) | 1) & (~((zD ? 1 : 0) & 1));
    }
}
