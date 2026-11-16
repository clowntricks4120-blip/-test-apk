package ivas.gov.bisp.enumeration.P;

import android.graphics.PorterDuff;
import android.support.v4.media.session.IMediaSession;
import android.view.View;
import ivas.gov.bisp.enumeration.p081d.InterfaceC0282a;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p081d.am;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class J {
    private static int a = 1;
    private static int b;

    public interface bdL {
        am b(View view, am amVar, beS bes);
    }

    public static final class beR implements InterfaceC0282a {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ bdL c;
        public final /* synthetic */ beS d;

        public beR(bdL bdl, beS bes) {
            this.c = bdl;
            this.d = bes;
        }

        @Override // ivas.gov.bisp.enumeration.p081d.InterfaceC0282a
        public final am b(View view, am amVar) {
            int i = 2 % 2;
            bdL bdl = this.c;
            beS bes = new beS(this.d);
            int i2 = a;
            int i3 = i2 & 83;
            int i4 = (i2 | 83) & (~i3);
            int i5 = i3 << 1;
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                return bdl.b(view, amVar, bes);
            }
            bdl.b(view, amVar, bes);
            throw null;
        }
    }

    public static boolean c(View view) {
        boolean z;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - (((i2 ^ 86) + ((i2 & 86) << 1)) ^ (-1));
        a = i3 % 128;
        int i4 = i3 % 2;
        WeakHashMap<View, R> weakHashMap = T.c;
        int iF = T.aWY.f(view);
        int i5 = b;
        int i6 = i5 ^ 85;
        int i7 = (i5 & 85) << 1;
        int i8 = (i6 & i7) + (i6 | i7);
        a = i8 % 128;
        int i9 = i8 % 2;
        if (iF != 1) {
            int i10 = (i5 | 47) << 1;
            int i11 = -((i5 & (-48)) | ((~i5) & 47));
            int i12 = (i10 & i11) + (i10 | i11);
            a = i12 % 128;
            z = i12 % 2 == 0;
            int i13 = i5 ^ 75;
            int i14 = ((i5 & 75) | i13) << 1;
            int i15 = -i13;
            int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
            a = i16 % 128;
            int i17 = i16 % 2;
        } else {
            z = true;
        }
        int i18 = a;
        int i19 = i18 & 123;
        int i20 = (i18 ^ 123) | i19;
        int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
        b = i21 % 128;
        int i22 = i21 % 2;
        return z;
    }

    public static class beS {
        public int a;
        public int b;
        public int c;
        public int d;

        public beS(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public beS(beS bes) {
            this.a = bes.a;
            this.b = bes.b;
            this.c = bes.c;
            this.d = bes.d;
        }
    }

    public static PorterDuff.Mode d(int i, PorterDuff.Mode mode) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 5;
        int i5 = (i4 - (~((i3 ^ 5) | i4))) - 1;
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        if (i == 3) {
            PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_OVER;
            int i8 = b;
            int i9 = i8 & 111;
            int i10 = ((((i8 ^ 111) | i9) << 1) - (~(-((i8 | 111) & (~i9))))) - 1;
            a = i10 % 128;
            int i11 = i10 % 2;
            return mode2;
        }
        int i12 = i6 | 121;
        int i13 = i12 << 1;
        int i14 = -((~(i6 & 121)) & i12);
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        int i16 = i15 % 128;
        a = i16;
        if (i15 % 2 != 0 ? i == 5 : i == 2) {
            PorterDuff.Mode mode3 = PorterDuff.Mode.SRC_IN;
            int i17 = a;
            int i18 = (i17 & 19) + (i17 | 19);
            b = i18 % 128;
            int i19 = i18 % 2;
            return mode3;
        }
        int i20 = i16 & 125;
        int i21 = i20 + ((i16 ^ 125) | i20);
        int i22 = i21 % 128;
        b = i22;
        Object obj = null;
        if (i21 % 2 == 0 ? i == 9 : i == 122) {
            PorterDuff.Mode mode4 = PorterDuff.Mode.SRC_ATOP;
            int i23 = a;
            int i24 = i23 & 75;
            int i25 = (i23 | 75) & (~i24);
            int i26 = -(-(i24 << 1));
            int i27 = (i25 & i26) + (i25 | i26);
            b = i27 % 128;
            if (i27 % 2 == 0) {
                return mode4;
            }
            throw null;
        }
        switch (i) {
            case IMediaSession.Stub.TRANSACTION_playFromMediaId /* 14 */:
                PorterDuff.Mode mode5 = PorterDuff.Mode.MULTIPLY;
                int i28 = b + 13;
                a = i28 % 128;
                int i29 = i28 % 2;
                return mode5;
            case IMediaSession.Stub.TRANSACTION_playFromSearch /* 15 */:
                PorterDuff.Mode mode6 = PorterDuff.Mode.SCREEN;
                int i30 = b;
                int i31 = (i30 ^ 52) + ((i30 & 52) << 1);
                int i32 = (i31 ^ (-1)) + (i31 << 1);
                a = i32 % 128;
                int i33 = i32 % 2;
                return mode6;
            case 16:
                PorterDuff.Mode mode7 = PorterDuff.Mode.ADD;
                int i34 = a + 103;
                b = i34 % 128;
                if (i34 % 2 == 0) {
                    return mode7;
                }
                obj.hashCode();
                throw null;
            default:
                int i35 = (((i22 | 98) << 1) - (i22 ^ 98)) - 1;
                a = i35 % 128;
                if (i35 % 2 == 0) {
                    int i36 = 21 / 0;
                }
                return mode;
        }
    }

    public static void b(View view, bdL bdl) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 47;
        int i4 = (i2 | 47) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            WeakHashMap<View, R> weakHashMap = T.c;
            T.aWY.g(view);
            view.getPaddingTop();
            obj.hashCode();
            throw null;
        }
        WeakHashMap<View, R> weakHashMap2 = T.c;
        beR ber = new beR(bdl, new beS(T.aWY.g(view), view.getPaddingTop(), T.aWY.h(view), view.getPaddingBottom()));
        int i7 = b + 97;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            T.aXb.v(view, ber);
            T.aXa.c(view);
            obj.hashCode();
            throw null;
        }
        T.aXb.v(view, ber);
        if (T.aXa.c(view)) {
            int i8 = b;
            int i9 = (((i8 & (-94)) | ((~i8) & 93)) - (~((i8 & 93) << 1))) - 1;
            a = i9 % 128;
            if (i9 % 2 != 0) {
                T.aXd.d(view);
                return;
            } else {
                T.aXd.d(view);
                obj.hashCode();
                throw null;
            }
        }
        view.addOnAttachStateChangeListener(new x());
        int i10 = a;
        int i11 = ((i10 ^ 53) | (i10 & 53)) << 1;
        int i12 = -(((~i10) & 53) | (i10 & (-54)));
        int i13 = (i11 & i12) + (i12 | i11);
        b = i13 % 128;
        int i14 = i13 % 2;
    }
}
