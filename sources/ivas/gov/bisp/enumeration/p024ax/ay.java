package ivas.gov.bisp.enumeration.p024ax;

import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p022av.T;

/* JADX INFO: loaded from: classes.dex */
public class ay implements C0094m.bas {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ aE c;

    public ay(aE aEVar) {
        this.c = aEVar;
    }

    @Override // ivas.gov.bisp.enumeration.p022av.C0094m.bas
    public void b(T t) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 73;
        int i4 = -(-((i2 ^ 73) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.c.onError(ag.e(t));
        int i7 = a;
        int i8 = ((i7 & (-82)) | ((~i7) & 81)) + ((i7 & 81) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
    }
}
