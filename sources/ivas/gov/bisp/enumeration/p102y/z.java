package ivas.gov.bisp.enumeration.p102y;

import ivas.gov.bisp.enumeration.o000O0O.o0OoOo0;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public class z implements o0OoOo0<Object> {
    private static int a = 0;
    private static int b = 1;

    public z(r rVar) {
    }

    public Object d() {
        int i = 2 % 2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i2 = a;
        int i3 = i2 & 9;
        int i4 = i3 + ((i2 ^ 9) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        return linkedHashSet;
    }
}
