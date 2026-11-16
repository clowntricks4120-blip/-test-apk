package ivas.gov.bisp.enumeration.p102y;

import ivas.gov.bisp.enumeration.o000O0O.o0OoOo0;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public class i implements o0OoOo0<Object> {
    private static int a = 1;
    private static int b;

    public i(r rVar) {
    }

    public Object d() {
        int i = 2 % 2;
        TreeSet treeSet = new TreeSet();
        int i2 = a;
        int i3 = (i2 & 117) + (i2 | 117);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 67 / 0;
        }
        return treeSet;
    }
}
