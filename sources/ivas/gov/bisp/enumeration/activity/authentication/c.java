package ivas.gov.bisp.enumeration.activity.authentication;

import ivas.gov.bisp.enumeration.utils.SessionManager;

/* JADX INFO: loaded from: classes.dex */
public class c implements Runnable {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ Authentication.OooOOO c;

    public c(Authentication.OooOOO oooOOO) {
        this.c = oooOOO;
    }

    @Override // java.lang.Runnable
    public void run() {
        SessionManager sessionManager;
        int i;
        SessionManager sessionManager2;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 61;
        int i5 = (i3 ^ 61) | i4;
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        Authentication authentication = Authentication.this;
        int i8 = Authentication.ac;
        SessionManager sessionManager3 = authentication.T;
        int i9 = b;
        int i10 = ((i9 ^ 51) | (i9 & 51)) << 1;
        int i11 = -((i9 & (-52)) | ((~i9) & 51));
        int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
        a = i12 % 128;
        int i13 = i12 % 2;
        Object obj = null;
        if (sessionManager3 == null) {
            authentication.T = new SessionManager(authentication);
            Authentication authentication2 = Authentication.this;
            int i14 = b;
            int i15 = i14 & 109;
            int i16 = ((i14 ^ 109) | i15) << 1;
            int i17 = -((i14 | 109) & (~i15));
            int i18 = (i16 & i17) + (i17 | i16);
            a = i18 % 128;
            if (i18 % 2 == 0) {
                authentication2.T.S(authentication2.al);
                Authentication authentication3 = Authentication.this;
                obj.hashCode();
                throw null;
            }
            authentication2.T.S(authentication2.al);
            Authentication authentication4 = Authentication.this;
            int i19 = a;
            int i20 = i19 & 103;
            int i21 = (i19 ^ 103) | i20;
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            b = i22 % 128;
            if (i22 % 2 != 0) {
                authentication4.T.L(authentication4.ao);
                Authentication authentication5 = Authentication.this;
                throw null;
            }
            authentication4.T.L(authentication4.ao);
            Authentication authentication6 = Authentication.this;
            authentication6.T.F(authentication6.an);
            Authentication authentication7 = Authentication.this;
            int i23 = a;
            int i24 = ((i23 ^ 33) | (i23 & 33)) << 1;
            int i25 = -(((~i23) & 33) | (i23 & (-34)));
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            b = i26 % 128;
            if (i26 % 2 != 0) {
                authentication7.T.Q(authentication7.ax);
                Authentication authentication8 = Authentication.this;
                throw null;
            }
            authentication7.T.Q(authentication7.ax);
            Authentication authentication9 = Authentication.this;
            int i27 = b + 79;
            a = i27 % 128;
            if (i27 % 2 == 0) {
                authentication9.T.R(authentication9.aD);
                Authentication authentication10 = Authentication.this;
                throw null;
            }
            authentication9.T.R(authentication9.aD);
            Authentication authentication11 = Authentication.this;
            int i28 = b + 101;
            a = i28 % 128;
            int i29 = i28 % 2;
            authentication11.T.K(Integer.valueOf(authentication11.aq));
            Authentication.OooOOO oooOOO = this.c;
            int i30 = a + 45;
            b = i30 % 128;
            (i30 % 2 != 0 ? Authentication.this : Authentication.this).T.H(true);
            return;
        }
        int i31 = i9 + 125;
        a = i31 % 128;
        int i32 = i31 % 2;
        sessionManager3.S(authentication.al);
        Authentication authentication12 = Authentication.this;
        int i33 = a + 99;
        b = i33 % 128;
        int i34 = i33 % 2;
        authentication12.T.L(authentication12.ao);
        Authentication authentication13 = Authentication.this;
        int i35 = a;
        int i36 = (((i35 ^ 119) | (i35 & 119)) << 1) - (((~i35) & 119) | (i35 & (-120)));
        b = i36 % 128;
        if (i36 % 2 != 0) {
            authentication13.T.F(authentication13.an);
            throw null;
        }
        authentication13.T.F(authentication13.an);
        Authentication authentication14 = Authentication.this;
        authentication14.T.Q(authentication14.ax);
        int i37 = b;
        int i38 = ((i37 ^ 28) + ((i37 & 28) << 1)) - 1;
        a = i38 % 128;
        if (i38 % 2 == 0) {
            Authentication authentication15 = Authentication.this;
            authentication15.T.R(authentication15.aD);
            obj.hashCode();
            throw null;
        }
        Authentication authentication16 = Authentication.this;
        authentication16.T.R(authentication16.aD);
        int i39 = b;
        int i40 = (i39 & 95) + (i39 | 95);
        a = i40 % 128;
        if (i40 % 2 == 0) {
            Authentication authentication17 = Authentication.this;
            sessionManager = authentication17.T;
            i = authentication17.aq;
            int i41 = 48 / 0;
        } else {
            Authentication authentication18 = Authentication.this;
            sessionManager = authentication18.T;
            i = authentication18.aq;
        }
        int i42 = a;
        int i43 = i42 & 85;
        int i44 = (((i42 | 85) & (~i43)) - (~(-(-(i43 << 1))))) - 1;
        b = i44 % 128;
        if (i44 % 2 != 0) {
            sessionManager.K(Integer.valueOf(i));
            sessionManager2 = Authentication.this.T;
            int i45 = 56 / 0;
        } else {
            sessionManager.K(Integer.valueOf(i));
            sessionManager2 = Authentication.this.T;
        }
        sessionManager2.H(true);
        int i46 = b;
        int i47 = (-2) - ((((i46 | 66) << 1) - (i46 ^ 66)) ^ (-1));
        a = i47 % 128;
        if (i47 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
