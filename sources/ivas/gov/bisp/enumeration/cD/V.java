package ivas.gov.bisp.enumeration.cD;

import ivas.gov.bisp.enumeration.p003ac.P;
import ivas.gov.bisp.enumeration.p073cs.h;
import ivas.gov.bisp.enumeration.p091n.j;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class V extends Provider implements h {
    private static int a = 0;
    private static int b = 1;
    public static final String[] c;

    public class bDt implements PrivilegedAction {
        private static int a = 0;
        private static int b = 1;

        public bDt() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 | 97) << 1) - (i2 ^ 97);
            b = i3 % 128;
            int i4 = i3 % 2;
            V v = V.this;
            Objects.requireNonNull(v);
            String[] strArr = V.c;
            int i5 = a;
            int i6 = i5 & 113;
            int i7 = (((i5 ^ 113) | i6) << 1) - ((i5 | 113) & (~i6));
            int i8 = i7 % 128;
            b = i8;
            int i9 = i7 % 2 == 0 ? 1 : 0;
            int i10 = i8 + 107;
            a = i10 % 128;
            int i11 = i10 % 2;
            while (true) {
                Class<?> clsLoadClass = null;
                if (i9 == strArr.length) {
                    break;
                }
                int i12 = a;
                int i13 = i12 & 3;
                int i14 = i13 + ((i12 ^ 3) | i13);
                b = i14 % 128;
                int i15 = i14 % 2;
                String strU = j.u(j.w("org.bouncycastle.pqc.jcajce.provider."), strArr[i9], "$Mappings");
                int i16 = b;
                int i17 = i16 & 111;
                int i18 = -(-((i16 ^ 111) | i17));
                int i19 = (i17 & i18) + (i18 | i17);
                a = i19 % 128;
                int i20 = i19 % 2;
                try {
                    ClassLoader classLoader = V.class.getClassLoader();
                    if (classLoader != null) {
                        int i21 = a;
                        int i22 = (i21 & (-74)) | ((~i21) & 73);
                        int i23 = -(-((i21 & 73) << 1));
                        int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                        b = i24 % 128;
                        int i25 = i24 % 2;
                        clsLoadClass = classLoader.loadClass(strU);
                        int i26 = a;
                        int i27 = i26 & 111;
                        int i28 = (i26 | 111) & (~i27);
                        int i29 = i27 << 1;
                        int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
                        b = i30 % 128;
                        int i31 = i30 % 2;
                    } else {
                        C c = new C(strU);
                        int i32 = b;
                        int i33 = i32 ^ 125;
                        int i34 = ((i32 & 125) | i33) << 1;
                        int i35 = -i33;
                        int i36 = (i34 & i35) + (i34 | i35);
                        a = i36 % 128;
                        int i37 = i36 % 2;
                        Class<?> cls = (Class) AccessController.doPrivileged(c);
                        int i38 = b;
                        int i39 = i38 & 5;
                        int i40 = -(-((i38 ^ 5) | i39));
                        int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
                        a = i41 % 128;
                        int i42 = i41 % 2;
                        clsLoadClass = cls;
                    }
                } catch (ClassNotFoundException unused) {
                }
                if (clsLoadClass != null) {
                    int i43 = b + 93;
                    a = i43 % 128;
                    int i44 = i43 % 2;
                    try {
                        ((ivas.gov.bisp.enumeration.cF.j) clsLoadClass.newInstance()).c(v);
                        int i45 = b;
                        int i46 = ((i45 & (-72)) | ((~i45) & 71)) + ((i45 & 71) << 1);
                        a = i46 % 128;
                        if (i46 % 2 != 0) {
                            int i47 = 2 / 4;
                        }
                    } catch (Exception e) {
                        StringBuilder sbB = P.b("cannot create instance of ", "org.bouncycastle.pqc.jcajce.provider.");
                        sbB.append(strArr[i9]);
                        sbB.append("$Mappings : ");
                        sbB.append(e);
                        throw new InternalError(sbB.toString());
                    }
                }
                i9 = ((i9 ^ 106) + ((i9 & 106) << 1)) - 105;
                int i48 = b;
                int i49 = i48 & 113;
                int i50 = -(-(i48 | 113));
                int i51 = (i49 & i50) + (i50 | i49);
                a = i51 % 128;
                int i52 = i51 % 2;
            }
            int i53 = b;
            int i54 = i53 & 51;
            int i55 = ((i53 ^ 51) | i54) << 1;
            int i56 = -((i53 | 51) & (~i54));
            int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
            a = i57 % 128;
            if (i57 % 2 != 0) {
                int i58 = 56 / 0;
            }
            return null;
        }
    }

    static {
        char c2;
        new HashMap();
        String[] strArr = new String[7];
        int i = a;
        int i2 = i & 115;
        int i3 = i2 + ((i ^ 115) | i2);
        b = i3 % 128;
        int i4 = i3 % 2;
        strArr[0] = "Rainbow";
        strArr[1] = "McEliece";
        int i5 = i | 105;
        int i6 = i5 << 1;
        int i7 = -((~(i & 105)) & i5);
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        int i9 = i8 % 128;
        b = i9;
        int i10 = i8 % 2;
        strArr[2] = "SPHINCS";
        strArr[3] = "LMS";
        int i11 = i9 & 81;
        int i12 = (i9 ^ 81) | i11;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        int i14 = i13 % 128;
        a = i14;
        if (i13 % 2 != 0) {
            strArr[4] = "NH";
            strArr[3] = "XMSS";
            c2 = '6';
        } else {
            strArr[4] = "NH";
            strArr[5] = "XMSS";
            c2 = 6;
        }
        strArr[c2] = "QTESLA";
        c = strArr;
        int i15 = i14 & 17;
        int i16 = ((i14 | 17) & (~i15)) + (i15 << 1);
        b = i16 % 128;
        if (i16 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public V() {
        super("BCPQC", 1.67d, "BouncyCastle Post-Quantum Security Provider v1.67");
        AccessController.doPrivileged(new bDt());
    }
}
