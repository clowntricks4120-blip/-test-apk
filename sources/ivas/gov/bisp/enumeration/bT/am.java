package ivas.gov.bisp.enumeration.bT;

import ivas.gov.bisp.enumeration.o000ooO.o0O0O00;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class am implements o0O0O00<Object> {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ Iterator c;

    public am(Iterator it) {
        this.c = it;
    }

    public final Iterator<Object> iterator() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 50) << 1) - (i2 ^ 50)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        Iterator<Object> it = this.c;
        if (i4 == 0) {
            int i5 = 62 / 0;
        }
        return it;
    }
}
