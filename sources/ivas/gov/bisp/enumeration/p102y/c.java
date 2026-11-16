package ivas.gov.bisp.enumeration.p102y;

import ivas.gov.bisp.enumeration.o000O0O.o0OoOo0;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class c implements o0OoOo0<Object> {
    private static int a = 0;
    private static int b = 1;

    public c(r rVar) {
    }

    public Object d() {
        int i = 2 % 2;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        int i2 = a;
        int i3 = ((i2 ^ 17) | (i2 & 17)) << 1;
        int i4 = -(((~i2) & 17) | (i2 & (-18)));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        return concurrentHashMap;
    }
}
