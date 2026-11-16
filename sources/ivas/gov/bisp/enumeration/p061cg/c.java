package ivas.gov.bisp.enumeration.p061cg;

import android.content.Context;
import android.os.Bundle;
import ivas.gov.bisp.enumeration.O.i;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.bX.P;
import ivas.gov.bisp.enumeration.p059ce.j;

/* JADX INFO: loaded from: classes.dex */
public class c implements r {
    private static int a = 0;
    private static int b = 1;

    @Override // ivas.gov.bisp.enumeration.p061cg.r
    public void b(Context context, j jVar, Bundle bundle) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 40) << 1) - (i2 ^ 40)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        r.n(context, "context");
        r.n(jVar, "errorContent");
        int i5 = a;
        int i6 = i5 ^ 31;
        int i7 = ((((i5 & 31) | i6) << 1) - (~(-i6))) - 1;
        b = i7 % 128;
        if (i7 % 2 != 0) {
            r.n(bundle, "extras");
            f(context, jVar);
        } else {
            r.n(bundle, "extras");
            f(context, jVar);
            int i8 = 66 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p061cg.r
    public /* synthetic */ boolean e() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 49) | (i2 & 49)) << 1;
        int i4 = -(((~i2) & 49) | (i2 & (-50)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        int i8 = i6 & 85;
        int i9 = (i8 - (~(-(-((i6 ^ 85) | i8))))) - 1;
        a = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public void f(Context context, j jVar) {
        int i = 2 % 2;
        int i2 = a + 21;
        b = i2 % 128;
        int i3 = i2 % 2;
        ivas.gov.bisp.enumeration.aO.j jVar2 = P.c;
        ivas.gov.bisp.enumeration.aO.j jVar3 = P.c;
        String packageName = context.getPackageName();
        int i4 = b + 17;
        a = i4 % 128;
        int i5 = i4 % 2;
        ((i) jVar2).x("OooOOO", ivas.gov.bisp.enumeration.p091n.j.r(packageName, " reports will NOT be sent - no valid ReportSender was found!"));
        int i6 = a;
        int i7 = i6 & 35;
        int i8 = (((i6 ^ 35) | i7) << 1) - ((~i7) & (i6 | 35));
        b = i8 % 128;
        int i9 = i8 % 2;
        int i10 = i6 & 43;
        int i11 = i10 + ((i6 ^ 43) | i10);
        b = i11 % 128;
        int i12 = i11 % 2;
    }
}
