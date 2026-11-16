package ivas.gov.bisp.enumeration.bT;

import ivas.gov.bisp.enumeration.O.i;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class V extends i {
    private static int a = 0;
    private static int b = 1;

    public static final A b(Iterator it) {
        int i = 2 % 2;
        C0131v c0131v = new C0131v(new am(it));
        int i2 = a;
        int i3 = (i2 & 91) + (i2 | 91);
        b = i3 % 128;
        int i4 = i3 % 2;
        return c0131v;
    }
}
