package ivas.gov.bisp.enumeration.p023aw;

import android.content.Context;
import ivas.gov.bisp.enumeration.p022av.C0093l;
import ivas.gov.bisp.enumeration.p022av.N;
import ivas.gov.bisp.enumeration.p022av.i;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private static int a = 0;
    private static int b = 1;

    /* JADX WARN: Code duplicated, block: B:19:0x00a0 A[PHI: r7
  0x00a0: PHI (r7v14 ivas.gov.bisp.enumeration.av.l) = (r7v10 ivas.gov.bisp.enumeration.av.l), (r7v19 ivas.gov.bisp.enumeration.av.l) binds: [B:18:0x009e, B:15:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    public static N b(Context context) {
        C0093l c0093l;
        int i = 2 % 2;
        N n = new N(new h(new l(context.getApplicationContext())), new j(new i()));
        int i2 = b;
        int i3 = (i2 & 87) + (i2 | 87);
        a = i3 % 128;
        if (i3 % 2 != 0) {
            i iVar = n.a;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        i iVar2 = n.a;
        if (iVar2 != null) {
            int i4 = a;
            int i5 = i4 ^ 89;
            int i6 = ((i4 & 89) | i5) << 1;
            int i7 = -i5;
            int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
            iVar2.g = true;
            iVar2.interrupt();
            int i10 = b;
            int i11 = i10 & 33;
            int i12 = (i10 | 33) & (~i11);
            int i13 = -(-(i11 << 1));
            int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
            a = i14 % 128;
            int i15 = i14 % 2;
        }
        C0093l[] c0093lArr = n.i;
        int length = c0093lArr.length;
        int i16 = b;
        int i17 = ((i16 & 19) - (~(-(-(i16 | 19))))) - 1;
        a = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = 5 / 2;
        }
        int i19 = 0;
        while (i19 < length) {
            int i20 = a;
            int i21 = i20 & 7;
            int i22 = ((i20 ^ 7) | i21) << 1;
            int i23 = -((~i21) & (i20 | 7));
            int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
            b = i24 % 128;
            if (i24 % 2 == 0) {
                c0093l = c0093lArr[i19];
                int i25 = 13 / 0;
                if (c0093l != null) {
                    int i26 = i20 & 23;
                    int i27 = i20 | 23;
                    int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
                    b = i28 % 128;
                    int i29 = i28 % 2;
                    c0093l.f = true;
                    c0093l.interrupt();
                    int i30 = b;
                    int i31 = i30 & 13;
                    int i32 = (i31 - (~(-(-((i30 ^ 13) | i31))))) - 1;
                    a = i32 % 128;
                    int i33 = i32 % 2;
                }
            } else {
                c0093l = c0093lArr[i19];
                if (c0093l != null) {
                    int i210 = i20 & 23;
                    int i211 = i20 | 23;
                    int i212 = ((i210 | i211) << 1) - (i211 ^ i210);
                    b = i212 % 128;
                    int i213 = i212 % 2;
                    c0093l.f = true;
                    c0093l.interrupt();
                    int i34 = b;
                    int i35 = i34 & 13;
                    int i36 = (i35 - (~(-(-((i34 ^ 13) | i35))))) - 1;
                    a = i36 % 128;
                    int i37 = i36 % 2;
                }
            }
            int i38 = i19 & 1;
            i19 = (i38 - (~(-(-((i19 ^ 1) | i38))))) - 1;
            int i39 = a;
            int i40 = i39 & 7;
            int i41 = ((i39 ^ 7) | i40) << 1;
            int i42 = -((i39 | 7) & (~i40));
            int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
            b = i43 % 128;
            int i44 = i43 % 2;
        }
        i iVar3 = new i(n.d, n.e, n.g, n.h);
        int i45 = b + 97;
        a = i45 % 128;
        int i46 = i45 % 2;
        n.a = iVar3;
        iVar3.start();
        int i47 = b;
        int i48 = ((i47 | 29) << 1) - (i47 ^ 29);
        a = i48 % 128;
        int i49 = i48 % 2;
        int i50 = 0;
        while (i50 < n.i.length) {
            C0093l c0093l2 = new C0093l(n.e, n.f, n.g, n.h);
            int i51 = a;
            int i52 = i51 & 119;
            int i53 = -(-((i51 ^ 119) | i52));
            int i54 = (i52 & i53) + (i53 | i52);
            b = i54 % 128;
            if (i54 % 2 == 0) {
                n.i[i50] = c0093l2;
                c0093l2.start();
                int i55 = (((i50 & (-116)) | ((~i50) & 115)) - (~((i50 & 115) << 1))) - 1;
                i50 = ((i55 & (-89)) - (~(-(-(i55 | (-89)))))) - 1;
            } else {
                n.i[i50] = c0093l2;
                c0093l2.start();
                i50 = (((i50 | 2) << 1) - (i50 ^ 2)) - 1;
            }
        }
        int i56 = a + 57;
        b = i56 % 128;
        if (i56 % 2 == 0) {
            int i57 = 76 / 0;
        }
        return n;
    }
}
