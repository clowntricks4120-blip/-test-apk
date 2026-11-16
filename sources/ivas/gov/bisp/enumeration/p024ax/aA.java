package ivas.gov.bisp.enumeration.p024ax;

import ivas.gov.bisp.enumeration.activity.authentication.Authentication;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p022av.T;

/* JADX INFO: loaded from: classes.dex */
public class aA implements C0094m.bas {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ aF c;

    public aA(aF aFVar) {
        this.c = aFVar;
    }

    @Override // ivas.gov.bisp.enumeration.p022av.C0094m.bas
    public void b(T t) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 99;
        int i4 = (((i2 ^ 99) | i3) << 1) - ((i2 | 99) & (~i3));
        a = i4 % 128;
        int i5 = i4 % 2;
        ((Authentication.OooO0OO) this.c).c(ag.e(t));
        int i6 = b;
        int i7 = i6 & 81;
        int i8 = ((i6 ^ 81) | i7) << 1;
        int i9 = -((i6 | 81) & (~i7));
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 5 / 0;
        }
    }
}
