package ivas.gov.bisp.enumeration.p023aw;

import ivas.gov.bisp.enumeration.o0ooOO0.o00O0O;
import ivas.gov.bisp.enumeration.o0ooOO0.o00Ooo;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p022av.C0095o;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public class u extends o00O0O<String> {
    private static int a = 0;
    private static int b = 1;
    public final Object p;
    public o00Ooo.OooO0O0<String> q;

    public u(int i, String str, o00Ooo.OooO0O0<String> oooO0O0, C0094m.bas basVar) {
        super(i, str, basVar);
        this.p = new Object();
        this.q = oooO0O0;
    }

    public void e(Object obj) {
        o00Ooo.OooO0O0<String> oooO0O0;
        String str = (String) obj;
        synchronized (this.p) {
            oooO0O0 = this.q;
        }
        if (oooO0O0 != null) {
            oooO0O0.b(str);
        }
    }

    public o00Ooo<String> p(C0095o c0095o) {
        String str;
        int i = 2 % 2;
        try {
            str = new String(c0095o.d, r.d(c0095o.e, "ISO-8859-1"));
            int i2 = b;
            int i3 = i2 & 51;
            int i4 = -(-((i2 ^ 51) | i3));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
        } catch (UnsupportedEncodingException unused) {
            str = new String(c0095o.d);
        }
        C0094m c0094m = new C0094m(str, r.c(c0095o));
        int i7 = a;
        int i8 = ((i7 & 122) + (i7 | 122)) - 1;
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return c0094m;
        }
        throw null;
    }
}
