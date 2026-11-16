package ivas.gov.bisp.enumeration.p011ak;

import android.support.v4.media.session.IMediaSession;

/* JADX INFO: loaded from: classes.dex */
public final class s {
    private static int a = 1;
    private static int b;
    public static final C c = new aWe(null, false);
    public static final C d = new aWe(null, true);
    public static final C e;
    public static final C f;

    public interface aWa {
        int b(CharSequence charSequence, int i, int i2);
    }

    public static class aWb implements aWa {
        private static int a = 1;
        private static int b;
        public static final aWb c = new aWb();

        static {
            int i = a;
            int i2 = i & 25;
            int i3 = -(-((i ^ 25) | i2));
            int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
            b = i4 % 128;
            int i5 = i4 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0054  */
        /* JADX WARN: Code duplicated, block: B:14:0x0072  */
        /* JADX WARN: Code duplicated, block: B:16:0x0087  */
        /* JADX WARN: Code duplicated, block: B:27:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:28:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:29:0x00ca  */
        /* JADX WARN: Code duplicated, block: B:40:0x0108 A[SYNTHETIC] */
        @Override // ivas.gov.bisp.enumeration.ak.s.aWa
        public int b(CharSequence charSequence, int i, int i2) {
            int i3;
            byte directionality;
            int i4;
            int i5;
            int i6 = 2 % 2;
            int i7 = b;
            int i8 = (i7 & (-98)) | ((~i7) & 97);
            int i9 = (i7 & 97) << 1;
            int i10 = (i8 & i9) + (i9 | i8);
            a = i10 % 128;
            int i11 = i10 % 2;
            int i12 = i;
            int i13 = 2;
            while (true) {
                int i14 = i2 & i;
                int i15 = ((i2 ^ i) | i14) << 1;
                int i16 = -((~i14) & (i2 | i));
                if (i12 < (i15 ^ i16) + ((i15 & i16) << 1)) {
                    int i17 = a;
                    int i18 = i17 & 111;
                    int i19 = (((i17 | 111) & (~i18)) - (~(i18 << 1))) - 1;
                    int i20 = i19 % 128;
                    b = i20;
                    if (i19 % 2 != 0) {
                        if (i13 != 3) {
                        }
                        int i21 = i20 ^ 11;
                        i3 = (((i20 & 11) | i21) << 1) - i21;
                        a = i3 % 128;
                        if (i3 % 2 != 0) {
                            Character.getDirectionality(charSequence.charAt(i12));
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        directionality = Character.getDirectionality(charSequence.charAt(i12));
                        int i22 = a;
                        int i23 = i22 ^ 85;
                        int i24 = ((i22 & 85) | i23) << 1;
                        int i25 = -i23;
                        int i26 = (i24 & i25) + (i24 | i25);
                        b = i26 % 128;
                        int i27 = i26 % 2;
                        C c2 = s.c;
                        if (directionality != 0) {
                            int i28 = b;
                            int i29 = (i28 | 93) << 1;
                            int i30 = -(i28 ^ 93);
                            int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
                            i4 = i31 % 128;
                            a = i4;
                            int i32 = i31 % 2;
                            if (directionality != 1) {
                                int i33 = i4 & 29;
                                i5 = (i33 - (~(-(-((i4 ^ 29) | i33))))) - 1;
                                int i34 = i5 % 128;
                                b = i34;
                                if (i5 % 2 != 0 ? directionality != 2 : directionality != 3) {
                                    int i35 = i34 + 110;
                                    int i36 = (i35 ^ (-1)) + (i35 << 1);
                                    int i37 = i36 % 128;
                                    a = i37;
                                    if (i36 % 2 != 0) {
                                        switch (directionality) {
                                            case IMediaSession.Stub.TRANSACTION_playFromMediaId /* 14 */:
                                            case IMediaSession.Stub.TRANSACTION_playFromSearch /* 15 */:
                                                int i38 = b;
                                                int i39 = ((i38 ^ 117) | (i38 & 117)) << 1;
                                                int i40 = -(((~i38) & 117) | (i38 & (-118)));
                                                int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
                                                a = i41 % 128;
                                                int i42 = i41 % 2;
                                                i13 = 1;
                                                break;
                                            case 16:
                                            case IMediaSession.Stub.TRANSACTION_skipToQueueItem /* 17 */:
                                                int i43 = a + 97;
                                                b = i43 % 128;
                                                int i44 = i43 % 2;
                                                i13 = 0;
                                                break;
                                            default:
                                                int i45 = i37 + 79;
                                                b = i45 % 128;
                                                int i46 = i45 % 2;
                                                i13 = 2;
                                                break;
                                        }
                                    } else {
                                        int i47 = 42 / 0;
                                        switch (directionality) {
                                            case IMediaSession.Stub.TRANSACTION_playFromMediaId /* 14 */:
                                            case IMediaSession.Stub.TRANSACTION_playFromSearch /* 15 */:
                                                int i310 = b;
                                                int i311 = ((i310 ^ 117) | (i310 & 117)) << 1;
                                                int i48 = -(((~i310) & 117) | (i310 & (-118)));
                                                int i49 = ((i311 | i48) << 1) - (i48 ^ i311);
                                                a = i49 % 128;
                                                int i410 = i49 % 2;
                                                i13 = 1;
                                                break;
                                            case 16:
                                            case IMediaSession.Stub.TRANSACTION_skipToQueueItem /* 17 */:
                                                int i411 = a + 97;
                                                b = i411 % 128;
                                                int i412 = i411 % 2;
                                                i13 = 0;
                                                break;
                                            default:
                                                int i413 = i37 + 79;
                                                b = i413 % 128;
                                                int i414 = i413 % 2;
                                                i13 = 2;
                                                break;
                                        }
                                    }
                                } else {
                                    int i415 = a + 97;
                                    b = i415 % 128;
                                    int i416 = i415 % 2;
                                    i13 = 0;
                                }
                            } else {
                                int i417 = a + 97;
                                b = i417 % 128;
                                int i418 = i417 % 2;
                                i13 = 0;
                            }
                        } else {
                            int i312 = b;
                            int i313 = ((i312 ^ 117) | (i312 & 117)) << 1;
                            int i419 = -(((~i312) & 117) | (i312 & (-118)));
                            int i420 = ((i313 | i419) << 1) - (i419 ^ i313);
                            a = i420 % 128;
                            int i4110 = i420 % 2;
                            i13 = 1;
                        }
                        int i50 = (((i12 | (-70)) << 1) - (i12 ^ (-70))) - 1;
                        int i51 = (i50 & (-73)) | ((~i50) & 72);
                        int i52 = (i50 & 72) << 1;
                        i12 = ((i51 & i52) << 1) + (i51 ^ i52);
                        int i53 = a;
                        int i54 = i53 & 99;
                        int i55 = i54 + ((i53 ^ 99) | i54);
                        b = i55 % 128;
                        int i56 = i55 % 2;
                    } else {
                        if (i13 != 2) {
                        }
                        int i210 = i20 ^ 11;
                        i3 = (((i20 & 11) | i210) << 1) - i210;
                        a = i3 % 128;
                        if (i3 % 2 != 0) {
                            Character.getDirectionality(charSequence.charAt(i12));
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        directionality = Character.getDirectionality(charSequence.charAt(i12));
                        int i211 = a;
                        int i212 = i211 ^ 85;
                        int i213 = ((i211 & 85) | i212) << 1;
                        int i214 = -i212;
                        int i215 = (i213 & i214) + (i213 | i214);
                        b = i215 % 128;
                        int i216 = i215 % 2;
                        C c3 = s.c;
                        if (directionality != 0) {
                            int i217 = b;
                            int i218 = (i217 | 93) << 1;
                            int i314 = -(i217 ^ 93);
                            int i315 = (i218 ^ i314) + ((i314 & i218) << 1);
                            i4 = i315 % 128;
                            a = i4;
                            int i316 = i315 % 2;
                            if (directionality != 1) {
                                int i317 = i4 & 29;
                                i5 = (i317 - (~(-(-((i4 ^ 29) | i317))))) - 1;
                                int i318 = i5 % 128;
                                b = i318;
                                if (i5 % 2 != 0) {
                                }
                                int i4111 = a + 97;
                                b = i4111 % 128;
                                int i4112 = i4111 % 2;
                                i13 = 0;
                            } else {
                                int i4113 = a + 97;
                                b = i4113 % 128;
                                int i4114 = i4113 % 2;
                                i13 = 0;
                            }
                        } else {
                            int i319 = b;
                            int i3110 = ((i319 ^ 117) | (i319 & 117)) << 1;
                            int i4115 = -(((~i319) & 117) | (i319 & (-118)));
                            int i421 = ((i3110 | i4115) << 1) - (i4115 ^ i3110);
                            a = i421 % 128;
                            int i4116 = i421 % 2;
                            i13 = 1;
                        }
                        int i57 = (((i12 | (-70)) << 1) - (i12 ^ (-70))) - 1;
                        int i58 = (i57 & (-73)) | ((~i57) & 72);
                        int i59 = (i57 & 72) << 1;
                        i12 = ((i58 & i59) << 1) + (i58 ^ i59);
                        int i510 = a;
                        int i511 = i510 & 99;
                        int i512 = i511 + ((i510 ^ 99) | i511);
                        b = i512 % 128;
                        int i513 = i512 % 2;
                    }
                }
            }
            int i60 = a + 57;
            b = i60 % 128;
            if (i60 % 2 != 0) {
                int i61 = 3 / 0;
            }
            return i13;
        }
    }

    public static class aWe extends aWd {
        private static int a = 1;
        private static int b;
        public final boolean d;

        public aWe(aWa awa, boolean z) {
            super(awa);
            this.d = z;
        }

        @Override // ivas.gov.bisp.enumeration.ak.s.aWd
        public boolean c() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 61) << 1) - (i2 ^ 61);
            a = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.d;
            if (i4 == 0) {
                int i5 = 53 / 0;
            }
            return z;
        }
    }

    static {
        aWb awb = aWb.c;
        e = new aWe(awb, false);
        f = new aWe(awb, true);
        int i = a;
        int i2 = ((i & 6) + (i | 6)) - 1;
        b = i2 % 128;
        int i3 = i2 % 2;
    }

    public static abstract class aWd implements C {
        private static int a = 0;
        private static int b = 1;
        public final aWa c;

        public aWd(aWa awa) {
            this.c = awa;
        }

        public abstract boolean c();

        public boolean d(CharSequence charSequence, int i, int i2) {
            boolean zC;
            int i3 = 2 % 2;
            int i4 = a;
            int i5 = (i4 & 49) + (i4 | 49);
            b = i5 % 128;
            int i6 = i5 % 2;
            if (i >= 0) {
                int i7 = i4 & 53;
                int i8 = (i4 ^ 53) | i7;
                int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
                b = i9 % 128;
                Object obj = null;
                if (i9 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                if (i2 >= 0) {
                    int i10 = (i4 & 53) + (i4 | 53);
                    b = i10 % 128;
                    int i11 = i10 % 2;
                    int length = charSequence.length();
                    int i12 = -i2;
                    int i13 = length & i12;
                    int i14 = (length | i12) & (~i13);
                    int i15 = i13 << 1;
                    if ((i14 & i15) + (i14 | i15) >= i) {
                        int i16 = b;
                        int i17 = i16 + 45;
                        a = i17 % 128;
                        int i18 = i17 % 2;
                        aWa awa = this.c;
                        if (awa == null) {
                            int i19 = i16 + 45;
                            a = i19 % 128;
                            int i20 = i19 % 2;
                            boolean zC2 = c();
                            int i21 = a;
                            int i22 = i21 & 31;
                            int i23 = i22 + ((i21 ^ 31) | i22);
                            b = i23 % 128;
                            if (i23 % 2 != 0) {
                                return zC2;
                            }
                            throw null;
                        }
                        int iB = awa.b(charSequence, i, i2);
                        int i24 = a;
                        int i25 = i24 & 3;
                        int i26 = (i25 - (~(-(-((i24 ^ 3) | i25))))) - 1;
                        int i27 = i26 % 128;
                        b = i27;
                        if (i26 % 2 != 0 ? iB == 0 : iB == 0) {
                            zC = true;
                        } else {
                            int i28 = (((i27 & (-68)) | ((~i27) & 67)) - (~((i27 & 67) << 1))) - 1;
                            a = i28 % 128;
                            if (i28 % 2 == 0 ? iB == 1 : iB == 1) {
                                int i29 = i27 & 81;
                                int i30 = (((i27 | 81) & (~i29)) - (~(-(-(i29 << 1))))) - 1;
                                a = i30 % 128;
                                int i31 = i30 % 2;
                                zC = false;
                            } else {
                                zC = c();
                                int i32 = a;
                                int i33 = (((i32 ^ 55) | (i32 & 55)) << 1) - (((~i32) & 55) | (i32 & (-56)));
                                b = i33 % 128;
                                int i34 = i33 % 2;
                            }
                        }
                        int i35 = a;
                        int i36 = (((i35 ^ 65) | (i35 & 65)) << 1) - (((~i35) & 65) | (i35 & (-66)));
                        b = i36 % 128;
                        if (i36 % 2 != 0) {
                            return zC;
                        }
                        throw null;
                    }
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
