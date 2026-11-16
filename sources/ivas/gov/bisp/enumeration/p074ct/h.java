package ivas.gov.bisp.enumeration.p074ct;

import ivas.gov.bisp.enumeration.p073cs.r;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class h {
    private static int a = 0;
    private static int b = 1;

    static {
        new r("BC", "threadLocalEcImplicitlyCa");
        new r("BC", "ecImplicitlyCa");
        new r("BC", "threadLocalDhDefaultParams");
        new r("BC", "DhDefaultParams");
        new r("BC", "acceptableEcCurves");
        new r("BC", "additionalEcParameters");
        int i = a;
        int i2 = i ^ 111;
        int i3 = -(-((i & 111) << 1));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    public h() {
        new HashSet();
        new HashMap();
    }
}
