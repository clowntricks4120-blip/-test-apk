package ivas.gov.bisp.enumeration.bV;

import ivas.gov.bisp.enumeration.O.r;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class U {
    private static int a = 1;
    private static int b;
    public static final Charset c;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        r.m(charsetForName, "forName(\"UTF-8\")");
        int i = b + 65;
        a = i % 128;
        if (i % 2 == 0) {
            c = charsetForName;
            r.m(Charset.forName("UTF-16"), "forName(\"UTF-16\")");
            int i2 = 45 / 0;
        } else {
            c = charsetForName;
            r.m(Charset.forName("UTF-16"), "forName(\"UTF-16\")");
        }
        r.m(Charset.forName("UTF-16BE"), "forName(\"UTF-16BE\")");
        Charset charsetForName2 = Charset.forName("UTF-16LE");
        int i3 = b;
        int i4 = i3 ^ 117;
        int i5 = -(-((i3 & 117) << 1));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        r.m(charsetForName2, "forName(\"UTF-16LE\")");
        r.m(Charset.forName("US-ASCII"), "forName(\"US-ASCII\")");
        int i8 = b;
        int i9 = (i8 | 97) << 1;
        int i10 = -(((~i8) & 97) | (i8 & (-98)));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        a = i11 % 128;
        if (i11 % 2 != 0) {
            r.m(Charset.forName("ISO-8859-1"), "forName(\"ISO-8859-1\")");
            return;
        }
        r.m(Charset.forName("ISO-8859-1"), "forName(\"ISO-8859-1\")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
