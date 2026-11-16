package ivas.gov.bisp.enumeration.p102y;

import ivas.gov.bisp.enumeration.o000O0O.o0OoOo0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class t implements o0OoOo0<Object> {
    private static int a = 1;
    private static int b;

    public t(r rVar) {
    }

    public Object d() {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int i2 = a;
        int i3 = (i2 ^ 33) + ((i2 & 33) << 1);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 48 / 0;
        }
        return arrayList;
    }
}
