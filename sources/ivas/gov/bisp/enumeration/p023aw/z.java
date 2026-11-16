package ivas.gov.bisp.enumeration.p023aw;

import android.util.Log;
import ivas.gov.bisp.enumeration.o0ooOO0.o00O0O;
import ivas.gov.bisp.enumeration.o0ooOO0.o00Ooo;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p022av.S;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public abstract class z<T> extends o00O0O<T> {
    private static int a = 1;
    private static int b;
    public static final String p;
    public final Object q;
    public o00Ooo.OooO0O0<T> r;
    public final String s;

    static {
        Object[] objArr = {"utf-8"};
        int i = (0 - (-11)) - 2;
        a = i % 128;
        if (i % 2 != 0) {
            p = String.format("application/json; charset=%s", objArr);
        } else {
            p = String.format("application/json; charset=%s", objArr);
            throw null;
        }
    }

    public z(int i, String str, String str2, o00Ooo.OooO0O0<T> oooO0O0, C0094m.bas basVar) {
        super(i, str, basVar);
        this.q = new Object();
        this.r = oooO0O0;
        this.s = str2;
    }

    public void e(T t) {
        o00Ooo.OooO0O0<T> oooO0O0;
        synchronized (this.q) {
            oooO0O0 = this.r;
        }
        if (oooO0O0 != null) {
            oooO0O0.b(t);
        }
    }

    public byte[] f() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & (-6)) | ((~i2) & 5)) + ((i2 & 5) << 1);
        int i4 = i3 % 128;
        b = i4;
        byte[] bytes = null;
        if (i3 % 2 != 0) {
            bytes.hashCode();
            throw null;
        }
        try {
            String str = this.s;
            if (str != null) {
                int i5 = i4 & 109;
                int i6 = (i4 | 109) & (~i5);
                int i7 = i5 << 1;
                int i8 = (i6 & i7) + (i6 | i7);
                a = i8 % 128;
                if (i8 % 2 == 0) {
                    str.getBytes("utf-8");
                    bytes.hashCode();
                    throw null;
                }
                bytes = str.getBytes("utf-8");
                int i9 = b;
                int i10 = i9 & 17;
                int i11 = ((i9 ^ 17) | i10) << 1;
                int i12 = -((i9 | 17) & (~i10));
                int i13 = (i11 & i12) + (i12 | i11);
                a = i13 % 128;
                int i14 = i13 % 2;
            }
            int i15 = b;
            int i16 = i15 & 17;
            int i17 = -(-((i15 ^ 17) | i16));
            int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
            a = i18 % 128;
            int i19 = i18 % 2;
            return bytes;
        } catch (UnsupportedEncodingException unused) {
            Log.wtf("Volley", S.c("Unsupported Encoding while trying to get the bytes of %s using %s", this.s, "utf-8"));
            return null;
        }
    }

    public String g() {
        int i = 2 % 2;
        int i2 = a + 7;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return p;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public byte[] k() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 25;
        int i4 = (i2 | 25) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        byte[] bArrF = f();
        int i8 = a;
        int i9 = i8 & 33;
        int i10 = (i9 - (~(-(-((i8 ^ 33) | i9))))) - 1;
        b = i10 % 128;
        int i11 = i10 % 2;
        return bArrF;
    }
}
