package ivas.gov.bisp.enumeration.p087j;

import android.os.Build;
import android.view.View;
import ivas.gov.bisp.enumeration.p007ag.c;
import ivas.gov.bisp.enumeration.p081d.InterfaceC0282a;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p081d.am;

/* JADX INFO: loaded from: classes.dex */
public class J implements InterfaceC0282a {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ LayoutInflaterFactory2C0312o c;

    public J(LayoutInflaterFactory2C0312o layoutInflaterFactory2C0312o) {
        this.c = layoutInflaterFactory2C0312o;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:19:0x00e8  */
    @Override // ivas.gov.bisp.enumeration.p081d.InterfaceC0282a
    public am b(View view, am amVar) {
        am.aWz awa;
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = i5 & 63;
        int i7 = (i5 ^ 63) | i6;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        int iJ = amVar.j();
        Object obj = null;
        int iY = this.c.Y(amVar, null);
        int i10 = b;
        int i11 = (i10 & 107) + (i10 | 107);
        int i12 = i11 % 128;
        a = i12;
        int i13 = i11 % 2;
        if (iJ != iY) {
            int i14 = ((i12 ^ 41) | (i12 & 41)) << 1;
            int i15 = -(((~i12) & 41) | (i12 & (-42)));
            int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
            b = i16 % 128;
            if (i16 % 2 != 0) {
                amVar.h();
                amVar.i();
                throw null;
            }
            int iH = amVar.h();
            int i17 = amVar.i();
            int i18 = a;
            int i19 = (i18 & 55) + (i18 | 55);
            b = i19 % 128;
            if (i19 % 2 != 0) {
                amVar.g();
                int i20 = Build.VERSION.SDK_INT;
                obj.hashCode();
                throw null;
            }
            int iG = amVar.g();
            int i21 = Build.VERSION.SDK_INT;
            if (i21 >= 30) {
                awa = new am.aWC(amVar);
                int i22 = a;
                int i23 = i22 | 23;
                i = (i23 << 1) - ((~(i22 & 23)) & i23);
                i2 = i % 128;
            } else {
                if (i21 >= 29) {
                    awa = new am.aWB(amVar);
                    int i24 = a;
                    int i25 = i24 | 13;
                    int i26 = ((i25 << 1) - (~(-((~(i24 & 13)) & i25)))) - 1;
                    b = i26 % 128;
                    int i27 = i26 % 2;
                } else {
                    awa = new am.aWA(amVar);
                    int i28 = a;
                    int i29 = (i28 | 85) << 1;
                    int i30 = -(i28 ^ 85);
                    i = (i29 & i30) + (i30 | i29);
                    i2 = i % 128;
                }
                awa.g(c.c(iH, iY, i17, iG));
                int i31 = a;
                i3 = (i31 ^ 15) + ((i31 & 15) << 1);
                b = i3 % 128;
                if (i3 % 2 == 0) {
                    awa.e();
                    obj.hashCode();
                    throw null;
                }
                amVar = awa.e();
                int i32 = b;
                int i33 = i32 & 57;
                int i34 = ((i32 ^ 57) | i33) << 1;
                int i35 = -((i32 | 57) & (~i33));
                int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
                a = i36 % 128;
                int i37 = i36 % 2;
            }
            b = i2;
            int i38 = i % 2;
            awa.g(c.c(iH, iY, i17, iG));
            int i39 = a;
            i3 = (i39 ^ 15) + ((i39 & 15) << 1);
            b = i3 % 128;
            if (i3 % 2 == 0) {
                awa.e();
                obj.hashCode();
                throw null;
            }
            amVar = awa.e();
            int i310 = b;
            int i311 = i310 & 57;
            int i312 = ((i310 ^ 57) | i311) << 1;
            int i313 = -((i310 | 57) & (~i311));
            int i314 = (i312 ^ i313) + ((i313 & i312) << 1);
            a = i314 % 128;
            int i315 = i314 % 2;
        }
        am amVarL = T.l(view, amVar);
        int i40 = a + 59;
        b = i40 % 128;
        if (i40 % 2 == 0) {
            return amVarL;
        }
        throw null;
    }
}
