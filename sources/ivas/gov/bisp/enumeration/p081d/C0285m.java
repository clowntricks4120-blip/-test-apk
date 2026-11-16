package ivas.gov.bisp.enumeration.p081d;

import android.view.View;
import ivas.gov.bisp.enumeration.Oooo0o.o0ooOOo;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.d.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0285m extends o0ooOOo.OooO0O0<Boolean> {
    private static int a = 0;
    private static int b = 1;

    public C0285m(int i, Class cls, int i2) {
        super(i, cls, i2);
    }

    public Object e(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 65) << 1) - (i2 ^ 65);
        b = i3 % 128;
        int i4 = i3 % 2;
        Boolean boolValueOf = Boolean.valueOf(T.aXh.f(view));
        int i5 = b;
        int i6 = (i5 & 105) + (i5 | 105);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 26 / 0;
        }
        return boolValueOf;
    }

    public void f(View view, Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-112)) | ((~i2) & 111);
        int i4 = (i2 & 111) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        T.aXh.b(view, ((Boolean) obj).booleanValue());
        int i7 = a;
        int i8 = i7 & 93;
        int i9 = (((i7 ^ 93) | i8) << 1) - ((i7 | 93) & (~i8));
        b = i9 % 128;
        int i10 = i9 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean h(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 63) + (i2 | 63);
        a = i3 % 128;
        int i4 = i3 % 2;
        boolean zD = d((Boolean) obj, (Boolean) obj2);
        int i5 = b + 29;
        a = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        int i6 = (zD ? 1 : 0) & 1;
        return ((!zD ? 1 : 0) | i6) & (~i6);
    }
}
