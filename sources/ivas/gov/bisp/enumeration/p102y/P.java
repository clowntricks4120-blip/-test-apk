package ivas.gov.bisp.enumeration.p102y;

import ivas.gov.bisp.enumeration.o000O0O.o0OoOo0;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public class P implements o0OoOo0<Object> {
    private static int a = 1;
    private static int b;

    public P(r rVar) {
    }

    public Object d() {
        int i = 2 % 2;
        ArrayDeque arrayDeque = new ArrayDeque();
        int i2 = a;
        int i3 = (i2 & (-2)) | ((~i2) & 1);
        int i4 = (i2 & 1) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        return arrayDeque;
    }
}
