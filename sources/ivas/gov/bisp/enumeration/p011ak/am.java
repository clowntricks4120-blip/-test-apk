package ivas.gov.bisp.enumeration.p011ak;

import android.support.v4.media.session.IMediaSession;
import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class am {
    private static int a = 1;
    private static int b;
    public static final C c;
    public static final String d;
    public static final String e;
    public static final am f;
    public static final am g;
    public final boolean h;
    public final int i;
    public final C j;

    public static class aWj {
        private static int a = 1;
        private static int b;
        public static final byte[] c = new byte[1792];
        public final CharSequence d;
        public final int e;
        public int f;
        public char g;

        public aWj(CharSequence charSequence, boolean z) {
            this.d = charSequence;
            this.e = charSequence.length();
        }

        static {
            int i = (1 ^ 21) + ((1 & 21) << 1);
            b = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
            int i4 = 0;
            while (i4 < 1792) {
                int i5 = b;
                int i6 = i5 | 117;
                int i7 = i6 << 1;
                int i8 = -((~(i5 & 117)) & i6);
                int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                a = i9 % 128;
                int i10 = i9 % 2;
                c[i4] = Character.getDirectionality(i4);
                int i11 = i4 & 1;
                i4 = (i11 - (~((i4 ^ 1) | i11))) - 1;
                int i12 = a;
                int i13 = i12 & 3;
                int i14 = (i12 ^ 3) | i13;
                int i15 = (i13 & i14) + (i14 | i13);
                b = i15 % 128;
                int i16 = i15 % 2;
            }
            int i17 = a;
            int i18 = (i17 ^ 121) + ((i17 & 121) << 1);
            b = i18 % 128;
            int i19 = i18 % 2;
        }

        public byte c() {
            char cCharAt;
            int iCodePointBefore;
            int i;
            byte directionality;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = ((i3 ^ 87) | (i3 & 87)) << 1;
            int i5 = -(((~i3) & 87) | (i3 & (-88)));
            int i6 = (i4 & i5) + (i5 | i4);
            b = i6 % 128;
            if (i6 % 2 != 0) {
                cCharAt = this.d.charAt((-2) - (~this.f));
            } else {
                CharSequence charSequence = this.d;
                int i7 = this.f;
                cCharAt = charSequence.charAt((((i7 ^ (-1)) | i7) << 1) - (~i7));
            }
            int i8 = a + 125;
            b = i8 % 128;
            int i9 = i8 % 2;
            this.g = cCharAt;
            if (!(!Character.isLowSurrogate(cCharAt))) {
                int i10 = b;
                int i11 = ((i10 ^ 37) | (i10 & 37)) << 1;
                int i12 = -(((~i10) & 37) | (i10 & (-38)));
                int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                a = i13 % 128;
                if (i13 % 2 == 0) {
                    iCodePointBefore = Character.codePointBefore(this.d, this.f);
                    i = this.f;
                    int i14 = 66 / 0;
                } else {
                    iCodePointBefore = Character.codePointBefore(this.d, this.f);
                    i = this.f;
                }
                int i15 = -Character.charCount(iCodePointBefore);
                int i16 = i ^ i15;
                this.f = (((i & i15) | i16) << 1) - i16;
                byte directionality2 = Character.getDirectionality(iCodePointBefore);
                int i17 = a;
                int i18 = ((i17 & 84) + (i17 | 84)) - 1;
                b = i18 % 128;
                if (i18 % 2 == 0) {
                    return directionality2;
                }
                throw null;
            }
            int i19 = this.f;
            int i20 = i19 ^ (-1);
            int i21 = (i19 | i20) << 1;
            int i22 = -i20;
            this.f = (i21 ^ i22) + ((i21 & i22) << 1);
            int i23 = a;
            int i24 = ((i23 & 96) + (i23 | 96)) - 1;
            int i25 = i24 % 128;
            b = i25;
            int i26 = i24 % 2;
            char c2 = this.g;
            if (c2 < 1792) {
                int i27 = i25 & 43;
                int i28 = (((~i27) & (i25 | 43)) - (~(i27 << 1))) - 1;
                a = i28 % 128;
                if (i28 % 2 == 0) {
                    byte b2 = c[c2];
                    throw null;
                }
                directionality = c[c2];
                int i29 = (i25 ^ 51) + ((i25 & 51) << 1);
                a = i29 % 128;
                if (i29 % 2 == 0) {
                    int i30 = 4 % 5;
                }
            } else {
                directionality = Character.getDirectionality(c2);
                int i31 = a;
                int i32 = i31 & 93;
                int i33 = -(-(i31 | 93));
                int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
                b = i34 % 128;
                int i35 = i34 % 2;
            }
            int i36 = b + 71;
            a = i36 % 128;
            int i37 = i36 % 2;
            return directionality;
        }
    }

    static {
        char c2;
        C c3 = s.e;
        c = c3;
        String string = Character.toString((char) 8206);
        int i = b;
        int i2 = i & 81;
        int i3 = (i ^ 81) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            e = string;
            c2 = 24510;
        } else {
            e = string;
            c2 = 8207;
        }
        d = Character.toString(c2);
        f = new am(false, 2, c3);
        g = new am(true, 2, c3);
        int i5 = a;
        int i6 = ((i5 ^ 123) - (~(-(-((i5 & 123) << 1))))) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    public am(boolean z, int i, C c2) {
        this.h = z;
        this.i = i;
        this.j = c2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0064  */
    /* JADX WARN: Code duplicated, block: B:16:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0099  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x003a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x003a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x003a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x003a A[SYNTHETIC] */
    public static int d(CharSequence charSequence) {
        byte bC;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        aWj awj = new aWj(charSequence, false);
        int i7 = awj.e;
        int i8 = -1;
        int i9 = (-2) - ((a + 80) ^ (-1));
        b = i9 % 128;
        int i10 = i9 % 2;
        awj.f = i7;
        int i11 = b;
        int i12 = ((i11 & 2) + (i11 | 2)) - 1;
        a = i12 % 128;
        int i13 = i12 % 2;
        int i14 = 0;
        while (true) {
            int i15 = a;
            int i16 = i15 & 45;
            int i17 = (i16 - (~(-(-((i15 ^ 45) | i16))))) - 1;
            b = i17 % 128;
            int i18 = i17 % 2;
            int i19 = i14;
            while (true) {
                if (awj.f > 0) {
                    int i20 = b;
                    int i21 = i20 & 85;
                    int i22 = (((i20 ^ 85) | i21) << 1) - ((i20 | 85) & (~i21));
                    a = i22 % 128;
                    if (i22 % 2 == 0) {
                        bC = awj.c();
                        int i23 = 43 / 0;
                        if (bC != 0) {
                            if (bC != 1) {
                                i = b;
                                int i24 = i & 59;
                                i2 = (i24 - (~((i ^ 59) | i24))) - 1;
                                a = i2 % 128;
                                if (i2 % 2 == 0) {
                                    if (bC != 2) {
                                        int i25 = ((i | 83) << 1) - (i ^ 83);
                                        i3 = i25 % 128;
                                        a = i3;
                                        int i26 = i25 % 2;
                                        if (bC != 9) {
                                            int i27 = i3 & 57;
                                            i4 = ((~i27) & (i3 | 57)) + (i27 << 1);
                                            i5 = i4 % 128;
                                            b = i5;
                                            if (i4 % 2 == 0) {
                                                throw null;
                                            }
                                            switch (bC) {
                                                case IMediaSession.Stub.TRANSACTION_playFromMediaId /* 14 */:
                                                case IMediaSession.Stub.TRANSACTION_playFromSearch /* 15 */:
                                                    if (i14 == i19) {
                                                        int i28 = a;
                                                        int i29 = (i28 & 43) + (i28 | 43);
                                                        b = i29 % 128;
                                                        int i30 = i29 % 2;
                                                    }
                                                    i19 = (-110) - (((i19 & 108) + (i19 | 108)) ^ (-1));
                                                    int i31 = i3 & 35;
                                                    int i32 = -(-((i3 ^ 35) | i31));
                                                    int i33 = ((i31 | i32) << 1) - (i31 ^ i32);
                                                    b = i33 % 128;
                                                    int i34 = i33 % 2;
                                                    break;
                                                case 16:
                                                case IMediaSession.Stub.TRANSACTION_skipToQueueItem /* 17 */:
                                                    if (i14 == i19) {
                                                        int i35 = i5 + 107;
                                                        a = i35 % 128;
                                                        int i36 = i35 % 2;
                                                        int i37 = a;
                                                        int i38 = i37 & 101;
                                                        int i39 = (i37 | 101) & (~i38);
                                                        int i40 = -(-(i38 << 1));
                                                        int i41 = (i39 ^ i40) + ((i39 & i40) << 1);
                                                        b = i41 % 128;
                                                        int i42 = i41 % 2;
                                                        i8 = 1;
                                                    }
                                                    i19 = (-110) - (((i19 & 108) + (i19 | 108)) ^ (-1));
                                                    int i310 = i3 & 35;
                                                    int i311 = -(-((i3 ^ 35) | i310));
                                                    int i312 = ((i310 | i311) << 1) - (i310 ^ i311);
                                                    b = i312 % 128;
                                                    int i313 = i312 % 2;
                                                    break;
                                                case IMediaSession.Stub.TRANSACTION_pause /* 18 */:
                                                    i19++;
                                                    int i43 = i3 + 107;
                                                    b = i43 % 128;
                                                    int i44 = i43 % 2;
                                                    break;
                                                default:
                                                    if (i14 == 0) {
                                                        int i45 = (((i3 | 114) << 1) - (i3 ^ 114)) - 1;
                                                        b = i45 % 128;
                                                        int i46 = i45 % 2;
                                                        int i47 = b + 99;
                                                        a = i47 % 128;
                                                        int i48 = i47 % 2;
                                                        i14 = i19;
                                                    }
                                                    break;
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                } else if (bC != 2) {
                                    int i210 = ((i | 83) << 1) - (i ^ 83);
                                    i3 = i210 % 128;
                                    a = i3;
                                    int i211 = i210 % 2;
                                    if (bC != 9) {
                                        int i212 = i3 & 57;
                                        i4 = ((~i212) & (i3 | 57)) + (i212 << 1);
                                        i5 = i4 % 128;
                                        b = i5;
                                        if (i4 % 2 == 0) {
                                            throw null;
                                        }
                                        switch (bC) {
                                            case IMediaSession.Stub.TRANSACTION_playFromMediaId /* 14 */:
                                            case IMediaSession.Stub.TRANSACTION_playFromSearch /* 15 */:
                                                if (i14 == i19) {
                                                    int i213 = a;
                                                    int i214 = (i213 & 43) + (i213 | 43);
                                                    b = i214 % 128;
                                                    int i314 = i214 % 2;
                                                }
                                                i19 = (-110) - (((i19 & 108) + (i19 | 108)) ^ (-1));
                                                int i315 = i3 & 35;
                                                int i316 = -(-((i3 ^ 35) | i315));
                                                int i317 = ((i315 | i316) << 1) - (i315 ^ i316);
                                                b = i317 % 128;
                                                int i318 = i317 % 2;
                                                break;
                                            case 16:
                                            case IMediaSession.Stub.TRANSACTION_skipToQueueItem /* 17 */:
                                                if (i14 == i19) {
                                                    int i319 = i5 + 107;
                                                    a = i319 % 128;
                                                    int i320 = i319 % 2;
                                                    int i321 = a;
                                                    int i322 = i321 & 101;
                                                    int i323 = (i321 | 101) & (~i322);
                                                    int i49 = -(-(i322 << 1));
                                                    int i410 = (i323 ^ i49) + ((i323 & i49) << 1);
                                                    b = i410 % 128;
                                                    int i411 = i410 % 2;
                                                    i8 = 1;
                                                }
                                                i19 = (-110) - (((i19 & 108) + (i19 | 108)) ^ (-1));
                                                int i3110 = i3 & 35;
                                                int i3111 = -(-((i3 ^ 35) | i3110));
                                                int i3112 = ((i3110 | i3111) << 1) - (i3110 ^ i3111);
                                                b = i3112 % 128;
                                                int i3113 = i3112 % 2;
                                                break;
                                            case IMediaSession.Stub.TRANSACTION_pause /* 18 */:
                                                i19++;
                                                int i412 = i3 + 107;
                                                b = i412 % 128;
                                                int i413 = i412 % 2;
                                                break;
                                            default:
                                                if (i14 == 0) {
                                                    int i414 = (((i3 | 114) << 1) - (i3 ^ 114)) - 1;
                                                    b = i414 % 128;
                                                    int i415 = i414 % 2;
                                                    int i416 = b + 99;
                                                    a = i416 % 128;
                                                    int i417 = i416 % 2;
                                                    i14 = i19;
                                                }
                                                break;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            if (i19 == 0) {
                                int i324 = a;
                                int i325 = i324 & 101;
                                int i326 = (i324 | 101) & (~i325);
                                int i418 = -(-(i325 << 1));
                                int i419 = (i326 ^ i418) + ((i326 & i418) << 1);
                                b = i419 % 128;
                                int i4110 = i419 % 2;
                                i8 = 1;
                            } else if (i14 == 0) {
                                int i50 = a;
                                int i51 = ((i50 ^ 68) + ((i50 & 68) << 1)) - 1;
                                b = i51 % 128;
                                int i52 = i51 % 2;
                                int i4111 = b + 99;
                                a = i4111 % 128;
                                int i4112 = i4111 % 2;
                                i14 = i19;
                            }
                        } else if (i19 == 0) {
                            int i215 = a;
                            int i216 = (i215 & 43) + (i215 | 43);
                            b = i216 % 128;
                            int i3114 = i216 % 2;
                        } else if (i14 == 0) {
                            int i4113 = b + 99;
                            a = i4113 % 128;
                            int i4114 = i4113 % 2;
                            i14 = i19;
                        }
                    } else {
                        bC = awj.c();
                        if (bC != 0) {
                            if (bC != 1) {
                                i = b;
                                int i217 = i & 59;
                                i2 = (i217 - (~((i ^ 59) | i217))) - 1;
                                a = i2 % 128;
                                if (i2 % 2 == 0) {
                                    if (bC != 2) {
                                        int i218 = ((i | 83) << 1) - (i ^ 83);
                                        i3 = i218 % 128;
                                        a = i3;
                                        int i219 = i218 % 2;
                                        if (bC != 9) {
                                            int i2110 = i3 & 57;
                                            i4 = ((~i2110) & (i3 | 57)) + (i2110 << 1);
                                            i5 = i4 % 128;
                                            b = i5;
                                            if (i4 % 2 == 0) {
                                                throw null;
                                            }
                                            switch (bC) {
                                                case IMediaSession.Stub.TRANSACTION_playFromMediaId /* 14 */:
                                                case IMediaSession.Stub.TRANSACTION_playFromSearch /* 15 */:
                                                    if (i14 == i19) {
                                                        int i2111 = a;
                                                        int i2112 = (i2111 & 43) + (i2111 | 43);
                                                        b = i2112 % 128;
                                                        int i3115 = i2112 % 2;
                                                    }
                                                    i19 = (-110) - (((i19 & 108) + (i19 | 108)) ^ (-1));
                                                    int i3116 = i3 & 35;
                                                    int i3117 = -(-((i3 ^ 35) | i3116));
                                                    int i3118 = ((i3116 | i3117) << 1) - (i3116 ^ i3117);
                                                    b = i3118 % 128;
                                                    int i3119 = i3118 % 2;
                                                    break;
                                                case 16:
                                                case IMediaSession.Stub.TRANSACTION_skipToQueueItem /* 17 */:
                                                    if (i14 == i19) {
                                                        int i3120 = i5 + 107;
                                                        a = i3120 % 128;
                                                        int i327 = i3120 % 2;
                                                        int i328 = a;
                                                        int i329 = i328 & 101;
                                                        int i3210 = (i328 | 101) & (~i329);
                                                        int i4115 = -(-(i329 << 1));
                                                        int i4116 = (i3210 ^ i4115) + ((i3210 & i4115) << 1);
                                                        b = i4116 % 128;
                                                        int i4117 = i4116 % 2;
                                                        i8 = 1;
                                                    }
                                                    i19 = (-110) - (((i19 & 108) + (i19 | 108)) ^ (-1));
                                                    int i31110 = i3 & 35;
                                                    int i31111 = -(-((i3 ^ 35) | i31110));
                                                    int i31112 = ((i31110 | i31111) << 1) - (i31110 ^ i31111);
                                                    b = i31112 % 128;
                                                    int i31113 = i31112 % 2;
                                                    break;
                                                case IMediaSession.Stub.TRANSACTION_pause /* 18 */:
                                                    i19++;
                                                    int i4118 = i3 + 107;
                                                    b = i4118 % 128;
                                                    int i4119 = i4118 % 2;
                                                    break;
                                                default:
                                                    if (i14 == 0) {
                                                        int i4120 = (((i3 | 114) << 1) - (i3 ^ 114)) - 1;
                                                        b = i4120 % 128;
                                                        int i4121 = i4120 % 2;
                                                        int i41110 = b + 99;
                                                        a = i41110 % 128;
                                                        int i41111 = i41110 % 2;
                                                        i14 = i19;
                                                    }
                                                    break;
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                } else if (bC != 2) {
                                    int i2113 = ((i | 83) << 1) - (i ^ 83);
                                    i3 = i2113 % 128;
                                    a = i3;
                                    int i2114 = i2113 % 2;
                                    if (bC != 9) {
                                        int i2115 = i3 & 57;
                                        i4 = ((~i2115) & (i3 | 57)) + (i2115 << 1);
                                        i5 = i4 % 128;
                                        b = i5;
                                        if (i4 % 2 == 0) {
                                            throw null;
                                        }
                                        switch (bC) {
                                            case IMediaSession.Stub.TRANSACTION_playFromMediaId /* 14 */:
                                            case IMediaSession.Stub.TRANSACTION_playFromSearch /* 15 */:
                                                if (i14 == i19) {
                                                    int i2116 = a;
                                                    int i2117 = (i2116 & 43) + (i2116 | 43);
                                                    b = i2117 % 128;
                                                    int i31114 = i2117 % 2;
                                                }
                                                i19 = (-110) - (((i19 & 108) + (i19 | 108)) ^ (-1));
                                                int i31115 = i3 & 35;
                                                int i31116 = -(-((i3 ^ 35) | i31115));
                                                int i31117 = ((i31115 | i31116) << 1) - (i31115 ^ i31116);
                                                b = i31117 % 128;
                                                int i31118 = i31117 % 2;
                                                break;
                                            case 16:
                                            case IMediaSession.Stub.TRANSACTION_skipToQueueItem /* 17 */:
                                                if (i14 == i19) {
                                                    int i3121 = i5 + 107;
                                                    a = i3121 % 128;
                                                    int i3211 = i3121 % 2;
                                                    int i3212 = a;
                                                    int i3213 = i3212 & 101;
                                                    int i3214 = (i3212 | 101) & (~i3213);
                                                    int i41112 = -(-(i3213 << 1));
                                                    int i41113 = (i3214 ^ i41112) + ((i3214 & i41112) << 1);
                                                    b = i41113 % 128;
                                                    int i41114 = i41113 % 2;
                                                    i8 = 1;
                                                }
                                                i19 = (-110) - (((i19 & 108) + (i19 | 108)) ^ (-1));
                                                int i31119 = i3 & 35;
                                                int i311110 = -(-((i3 ^ 35) | i31119));
                                                int i311111 = ((i31119 | i311110) << 1) - (i31119 ^ i311110);
                                                b = i311111 % 128;
                                                int i311112 = i311111 % 2;
                                                break;
                                            case IMediaSession.Stub.TRANSACTION_pause /* 18 */:
                                                i19++;
                                                int i41115 = i3 + 107;
                                                b = i41115 % 128;
                                                int i41116 = i41115 % 2;
                                                break;
                                            default:
                                                if (i14 == 0) {
                                                    int i4122 = (((i3 | 114) << 1) - (i3 ^ 114)) - 1;
                                                    b = i4122 % 128;
                                                    int i4123 = i4122 % 2;
                                                    int i41117 = b + 99;
                                                    a = i41117 % 128;
                                                    int i41118 = i41117 % 2;
                                                    i14 = i19;
                                                }
                                                break;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            if (i19 == 0) {
                                int i3215 = a;
                                int i3216 = i3215 & 101;
                                int i3217 = (i3215 | 101) & (~i3216);
                                int i41119 = -(-(i3216 << 1));
                                int i411110 = (i3217 ^ i41119) + ((i3217 & i41119) << 1);
                                b = i411110 % 128;
                                int i411111 = i411110 % 2;
                                i8 = 1;
                            } else if (i14 == 0) {
                                int i53 = a;
                                int i54 = ((i53 ^ 68) + ((i53 & 68) << 1)) - 1;
                                b = i54 % 128;
                                int i55 = i54 % 2;
                                int i411112 = b + 99;
                                a = i411112 % 128;
                                int i411113 = i411112 % 2;
                                i14 = i19;
                            }
                        } else if (i19 == 0) {
                            int i2118 = a;
                            int i2119 = (i2118 & 43) + (i2118 | 43);
                            b = i2119 % 128;
                            int i311113 = i2119 % 2;
                        } else if (i14 == 0) {
                            int i411114 = b + 99;
                            a = i411114 % 128;
                            int i411115 = i411114 % 2;
                            i14 = i19;
                        }
                    }
                } else {
                    i8 = 0;
                }
            }
        }
        int i56 = b;
        int i57 = (i56 | 111) << 1;
        int i58 = -(i56 ^ 111);
        int i59 = ((i57 | i58) << 1) - (i58 ^ i57);
        a = i59 % 128;
        if (i59 % 2 == 0) {
            int i60 = 44 / 0;
        }
        return i8;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x0026 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0026 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x027f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0291 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0135  */
    /* JADX WARN: Code duplicated, block: B:30:0x0142  */
    /* JADX WARN: Code duplicated, block: B:80:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:87:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x01ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x015d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:65:0x025d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:68:0x0265. Please report as an issue. */
    public static int c(CharSequence charSequence) {
        int i;
        byte directionality;
        int i2;
        int i3;
        int i4 = 2 % 2;
        aWj awj = new aWj(charSequence, false);
        awj.f = 0;
        int i5 = a;
        int i6 = i5 + 91;
        b = i6 % 128;
        int i7 = i6 % 2;
        int i8 = (((i5 | 12) << 1) - (i5 ^ 12)) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = awj.f;
            if (i13 < awj.e) {
                int i14 = b;
                int i15 = i14 + 123;
                a = i15 % 128;
                int i16 = i15 % 2;
                if (i10 == 0) {
                    int i17 = i14 & 9;
                    int i18 = -(-((i14 ^ 9) | i17));
                    int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                    a = i19 % 128;
                    int i20 = i19 % 2;
                    char cCharAt = awj.d.charAt(i13);
                    int i21 = a;
                    int i22 = ((i21 | 37) << 1) - (i21 ^ 37);
                    b = i22 % 128;
                    Object obj = null;
                    if (i22 % 2 != 0) {
                        awj.g = cCharAt;
                        Character.isHighSurrogate(cCharAt);
                        obj.hashCode();
                        throw null;
                    }
                    awj.g = cCharAt;
                    if (!Character.isHighSurrogate(cCharAt)) {
                        int i23 = awj.f;
                        int i24 = i23 | 1;
                        int i25 = i24 << 1;
                        int i26 = -((~(i23 & 1)) & i24);
                        awj.f = (i25 & i26) + (i26 | i25);
                        char c2 = awj.g;
                        int i27 = a;
                        int i28 = (((i27 | 72) << 1) - (i27 ^ 72)) - 1;
                        int i29 = i28 % 128;
                        b = i29;
                        int i30 = i28 % 2;
                        if (c2 < 1792) {
                            int i31 = (-2) - ((((i29 | 40) << 1) - (i29 ^ 40)) ^ (-1));
                            a = i31 % 128;
                            if (i31 % 2 == 0) {
                                byte b2 = aWj.c[c2];
                                obj.hashCode();
                                throw null;
                            }
                            directionality = aWj.c[c2];
                            int i32 = b;
                            int i33 = ((i32 | 101) << 1) - (i32 ^ 101);
                            a = i33 % 128;
                            int i34 = i33 % 2;
                        } else {
                            directionality = Character.getDirectionality(c2);
                            int i35 = a + 111;
                            b = i35 % 128;
                            int i36 = i35 % 2;
                        }
                    } else {
                        int i37 = b + 103;
                        a = i37 % 128;
                        int i38 = i37 % 2;
                        int iCodePointAt = Character.codePointAt(awj.d, awj.f);
                        int i39 = awj.f;
                        int i40 = b;
                        int i41 = i40 & 121;
                        int i42 = (i40 ^ 121) | i41;
                        int i43 = (i41 & i42) + (i42 | i41);
                        a = i43 % 128;
                        int i44 = i43 % 2;
                        int iCharCount = Character.charCount(iCodePointAt);
                        int i45 = ((iCharCount ^ i39) | (iCharCount & i39)) << 1;
                        int i46 = -((i39 & (~iCharCount)) | ((~i39) & iCharCount));
                        awj.f = (i45 ^ i46) + ((i46 & i45) << 1);
                        directionality = Character.getDirectionality(iCodePointAt);
                        int i47 = a;
                        int i48 = i47 + 27;
                        b = i48 % 128;
                        if (i48 % 2 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                        int i49 = (i47 | 101) << 1;
                        int i50 = -(((~i47) & 101) | (i47 & (-102)));
                        int i51 = (i49 ^ i50) + ((i49 & i50) << 1);
                        b = i51 % 128;
                        int i52 = i51 % 2;
                    }
                    if (directionality != 0) {
                        int i53 = a;
                        int i54 = i53 + 87;
                        b = i54 % 128;
                        if (i54 % 2 != 0) {
                            if (directionality != 1) {
                                int i55 = i53 & 19;
                                int i56 = i55 + ((i53 ^ 19) | i55);
                                b = i56 % 128;
                                int i57 = i56 % 2;
                                if (directionality != 2) {
                                    int i58 = i53 & 35;
                                    int i59 = -(-((i53 ^ 35) | i58));
                                    i2 = (i58 ^ i59) + ((i58 & i59) << 1);
                                    i3 = i2 % 128;
                                    b = i3;
                                    if (i2 % 2 != 0) {
                                        if (directionality != 3) {
                                            switch (directionality) {
                                                case IMediaSession.Stub.TRANSACTION_playFromMediaId /* 14 */:
                                                case IMediaSession.Stub.TRANSACTION_playFromSearch /* 15 */:
                                                    int i60 = (-2) - ((i11 + 93) ^ (-1));
                                                    int i61 = i60 & (-91);
                                                    i11 = (((i60 ^ (-91)) | i61) << 1) - ((i60 | (-91)) & (~i61));
                                                    int i62 = i53 + 101;
                                                    b = i62 % 128;
                                                    int i63 = i62 % 2;
                                                    i12 = -1;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                case 16:
                                                case IMediaSession.Stub.TRANSACTION_skipToQueueItem /* 17 */:
                                                    int i64 = i11 & (-15);
                                                    int i65 = -(-((i11 ^ (-15)) | i64));
                                                    int i66 = ((i64 | i65) << 1) - (i65 ^ i64);
                                                    int i67 = i66 & 16;
                                                    int i68 = (~i67) & (i66 | 16);
                                                    int i69 = i67 << 1;
                                                    i11 = (i69 | i68) + (i68 & i69);
                                                    int i70 = i3 & 109;
                                                    int i71 = (i3 ^ 109) | i70;
                                                    int i72 = (i70 & i71) + (i70 | i71);
                                                    a = i72 % 128;
                                                    int i73 = i72 % 2;
                                                    i12 = 1;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                case IMediaSession.Stub.TRANSACTION_pause /* 18 */:
                                                    int i74 = ((i11 & (-98)) + (i11 | (-98))) - 1;
                                                    i11 = (((i74 & (-99)) | ((~i74) & 98)) - (~((i74 & 98) << 1))) - 1;
                                                    int i75 = i53 + 23;
                                                    b = i75 % 128;
                                                    int i76 = i75 % 2;
                                                    i12 = 0;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                default:
                                                    int i77 = i53 + 19;
                                                    b = i77 % 128;
                                                    int i78 = i77 % 2;
                                                    break;
                                            }
                                        }
                                    } else if (directionality != 9) {
                                        switch (directionality) {
                                            case IMediaSession.Stub.TRANSACTION_playFromMediaId /* 14 */:
                                            case IMediaSession.Stub.TRANSACTION_playFromSearch /* 15 */:
                                                int i610 = (-2) - ((i11 + 93) ^ (-1));
                                                int i611 = i610 & (-91);
                                                i11 = (((i610 ^ (-91)) | i611) << 1) - ((i610 | (-91)) & (~i611));
                                                int i612 = i53 + 101;
                                                b = i612 % 128;
                                                int i613 = i612 % 2;
                                                i12 = -1;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                            case 16:
                                            case IMediaSession.Stub.TRANSACTION_skipToQueueItem /* 17 */:
                                                int i614 = i11 & (-15);
                                                int i615 = -(-((i11 ^ (-15)) | i614));
                                                int i616 = ((i614 | i615) << 1) - (i615 ^ i614);
                                                int i617 = i616 & 16;
                                                int i618 = (~i617) & (i616 | 16);
                                                int i619 = i617 << 1;
                                                i11 = (i619 | i618) + (i618 & i619);
                                                int i79 = i3 & 109;
                                                int i710 = (i3 ^ 109) | i79;
                                                int i711 = (i79 & i710) + (i79 | i710);
                                                a = i711 % 128;
                                                int i712 = i711 % 2;
                                                i12 = 1;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                            case IMediaSession.Stub.TRANSACTION_pause /* 18 */:
                                                int i713 = ((i11 & (-98)) + (i11 | (-98))) - 1;
                                                i11 = (((i713 & (-99)) | ((~i713) & 98)) - (~((i713 & 98) << 1))) - 1;
                                                int i714 = i53 + 23;
                                                b = i714 % 128;
                                                int i715 = i714 % 2;
                                                i12 = 0;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                            default:
                                                int i716 = i53 + 19;
                                                b = i716 % 128;
                                                int i717 = i716 % 2;
                                                break;
                                        }
                                    }
                                }
                            }
                        } else if (directionality != 1) {
                            int i510 = i53 & 19;
                            int i511 = i510 + ((i53 ^ 19) | i510);
                            b = i511 % 128;
                            int i512 = i511 % 2;
                            if (directionality != 2) {
                                int i513 = i53 & 35;
                                int i514 = -(-((i53 ^ 35) | i513));
                                i2 = (i513 ^ i514) + ((i513 & i514) << 1);
                                i3 = i2 % 128;
                                b = i3;
                                if (i2 % 2 != 0) {
                                    if (directionality != 3) {
                                        switch (directionality) {
                                            case IMediaSession.Stub.TRANSACTION_playFromMediaId /* 14 */:
                                            case IMediaSession.Stub.TRANSACTION_playFromSearch /* 15 */:
                                                int i6110 = (-2) - ((i11 + 93) ^ (-1));
                                                int i6111 = i6110 & (-91);
                                                i11 = (((i6110 ^ (-91)) | i6111) << 1) - ((i6110 | (-91)) & (~i6111));
                                                int i6112 = i53 + 101;
                                                b = i6112 % 128;
                                                int i6113 = i6112 % 2;
                                                i12 = -1;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                            case 16:
                                            case IMediaSession.Stub.TRANSACTION_skipToQueueItem /* 17 */:
                                                int i6114 = i11 & (-15);
                                                int i6115 = -(-((i11 ^ (-15)) | i6114));
                                                int i6116 = ((i6114 | i6115) << 1) - (i6115 ^ i6114);
                                                int i6117 = i6116 & 16;
                                                int i6118 = (~i6117) & (i6116 | 16);
                                                int i6119 = i6117 << 1;
                                                i11 = (i6119 | i6118) + (i6118 & i6119);
                                                int i718 = i3 & 109;
                                                int i719 = (i3 ^ 109) | i718;
                                                int i7110 = (i718 & i719) + (i718 | i719);
                                                a = i7110 % 128;
                                                int i7111 = i7110 % 2;
                                                i12 = 1;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                            case IMediaSession.Stub.TRANSACTION_pause /* 18 */:
                                                int i7112 = ((i11 & (-98)) + (i11 | (-98))) - 1;
                                                i11 = (((i7112 & (-99)) | ((~i7112) & 98)) - (~((i7112 & 98) << 1))) - 1;
                                                int i7113 = i53 + 23;
                                                b = i7113 % 128;
                                                int i7114 = i7113 % 2;
                                                i12 = 0;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                            default:
                                                int i7115 = i53 + 19;
                                                b = i7115 % 128;
                                                int i7116 = i7115 % 2;
                                                break;
                                        }
                                    }
                                } else if (directionality != 9) {
                                    switch (directionality) {
                                        case IMediaSession.Stub.TRANSACTION_playFromMediaId /* 14 */:
                                        case IMediaSession.Stub.TRANSACTION_playFromSearch /* 15 */:
                                            int i61110 = (-2) - ((i11 + 93) ^ (-1));
                                            int i61111 = i61110 & (-91);
                                            i11 = (((i61110 ^ (-91)) | i61111) << 1) - ((i61110 | (-91)) & (~i61111));
                                            int i61112 = i53 + 101;
                                            b = i61112 % 128;
                                            int i61113 = i61112 % 2;
                                            i12 = -1;
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                        case 16:
                                        case IMediaSession.Stub.TRANSACTION_skipToQueueItem /* 17 */:
                                            int i61114 = i11 & (-15);
                                            int i61115 = -(-((i11 ^ (-15)) | i61114));
                                            int i61116 = ((i61114 | i61115) << 1) - (i61115 ^ i61114);
                                            int i61117 = i61116 & 16;
                                            int i61118 = (~i61117) & (i61116 | 16);
                                            int i61119 = i61117 << 1;
                                            i11 = (i61119 | i61118) + (i61118 & i61119);
                                            int i7117 = i3 & 109;
                                            int i7118 = (i3 ^ 109) | i7117;
                                            int i7119 = (i7117 & i7118) + (i7117 | i7118);
                                            a = i7119 % 128;
                                            int i71110 = i7119 % 2;
                                            i12 = 1;
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                        case IMediaSession.Stub.TRANSACTION_pause /* 18 */:
                                            int i71111 = ((i11 & (-98)) + (i11 | (-98))) - 1;
                                            i11 = (((i71111 & (-99)) | ((~i71111) & 98)) - (~((i71111 & 98) << 1))) - 1;
                                            int i71112 = i53 + 23;
                                            b = i71112 % 128;
                                            int i71113 = i71112 % 2;
                                            i12 = 0;
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                        default:
                                            int i71114 = i53 + 19;
                                            b = i71114 % 128;
                                            int i71115 = i71114 % 2;
                                            break;
                                    }
                                }
                            }
                        }
                        if (i11 == 0) {
                            int i80 = b;
                            int i81 = i80 & 123;
                            int i82 = (i81 - (~(-(-((i80 ^ 123) | i81))))) - 1;
                            a = i82 % 128;
                            int i83 = i82 % 2;
                            int i84 = b;
                            int i85 = ((i84 & 29) - (~(i84 | 29))) - 1;
                            a = i85 % 128;
                            int i86 = i85 % 2;
                            i12 = 1;
                            int i87 = a;
                            i = (((i87 | 110) << 1) - (i87 ^ 110)) - 1;
                            b = i % 128;
                            if (i % 2 != 0) {
                                int i88 = 12 / 0;
                            }
                            return i12;
                        }
                    } else if (i11 == 0) {
                        int i89 = a;
                        int i90 = (i89 & 7) + (i89 | 7);
                        b = i90 % 128;
                        int i91 = i90 % 2;
                        i12 = -1;
                        int i810 = a;
                        i = (((i810 | 110) << 1) - (i810 ^ 110)) - 1;
                        b = i % 128;
                        if (i % 2 != 0) {
                            int i811 = 12 / 0;
                        }
                        return i12;
                    }
                    int i92 = b;
                    int i93 = i92 & 81;
                    int i94 = -(-((i92 ^ 81) | i93));
                    int i95 = ((i93 | i94) << 1) - (i94 ^ i93);
                    a = i95 % 128;
                    int i96 = i95 % 2;
                    i10 = i11;
                }
            }
            if (i10 == 0) {
                int i97 = b;
                int i98 = (i97 ^ 3) + ((i97 & 3) << 1);
                a = i98 % 128;
                i12 = i98 % 2 == 0 ? 1 : 0;
                int i99 = i97 & 37;
                int i100 = i99 + ((i97 ^ 37) | i99);
                a = i100 % 128;
                int i101 = i100 % 2;
            } else if (i12 != 0) {
                int i102 = a;
                int i103 = i102 & 95;
                int i104 = ((i102 ^ 95) | i103) << 1;
                int i105 = -((i102 | 95) & (~i103));
                int i106 = ((i104 | i105) << 1) - (i105 ^ i104);
                b = i106 % 128;
                if (i106 % 2 != 0) {
                    int i107 = 20 / 0;
                }
            } else {
                while (true) {
                    if (awj.f > 0) {
                        int i108 = a;
                        int i109 = ((i108 | 83) << 1) - (i108 ^ 83);
                        b = i109 % 128;
                        if (i109 % 2 != 0) {
                            int i110 = 80 / 0;
                            switch (awj.c()) {
                                case IMediaSession.Stub.TRANSACTION_playFromMediaId /* 14 */:
                                case IMediaSession.Stub.TRANSACTION_playFromSearch /* 15 */:
                                    if (i10 == i11) {
                                        int i812 = a;
                                        int i910 = (i812 & 7) + (i812 | 7);
                                        b = i910 % 128;
                                        int i911 = i910 % 2;
                                        i12 = -1;
                                    }
                                    int i111 = i11 & 59;
                                    int i112 = ((i11 ^ 59) | i111) << 1;
                                    int i113 = -((i11 | 59) & (~i111));
                                    int i114 = (i112 ^ i113) + ((i113 & i112) << 1);
                                    int i115 = i114 & (-60);
                                    int i116 = (i114 ^ (-60)) | i115;
                                    i11 = (i115 | i116) + (i115 & i116);
                                    int i117 = a;
                                    int i118 = i117 & 65;
                                    int i119 = i118 + ((i117 ^ 65) | i118);
                                    b = i119 % 128;
                                    int i120 = i119 % 2;
                                    break;
                                case 16:
                                case IMediaSession.Stub.TRANSACTION_skipToQueueItem /* 17 */:
                                    if (i10 == i11) {
                                        int i813 = b;
                                        int i814 = ((i813 & 29) - (~(i813 | 29))) - 1;
                                        a = i814 % 128;
                                        int i815 = i814 % 2;
                                        i12 = 1;
                                    }
                                    int i1110 = i11 & 59;
                                    int i1111 = ((i11 ^ 59) | i1110) << 1;
                                    int i1112 = -((i11 | 59) & (~i1110));
                                    int i1113 = (i1111 ^ i1112) + ((i1112 & i1111) << 1);
                                    int i1114 = i1113 & (-60);
                                    int i1115 = (i1113 ^ (-60)) | i1114;
                                    i11 = (i1114 | i1115) + (i1114 & i1115);
                                    int i1116 = a;
                                    int i1117 = i1116 & 65;
                                    int i1118 = i1117 + ((i1116 ^ 65) | i1117);
                                    b = i1118 % 128;
                                    int i121 = i1118 % 2;
                                    break;
                                case IMediaSession.Stub.TRANSACTION_pause /* 18 */:
                                    int i122 = (i11 & (-11)) + (i11 | (-11));
                                    i11 = (i122 & 12) + (i122 | 12);
                                    int i123 = b + 83;
                                    a = i123 % 128;
                                    int i124 = i123 % 2;
                                    break;
                                default:
                                    int i125 = a;
                                    int i126 = i125 & 89;
                                    int i127 = (i125 | 89) & (~i126);
                                    int i128 = -(-(i126 << 1));
                                    int i129 = ((i127 | i128) << 1) - (i127 ^ i128);
                                    b = i129 % 128;
                                    int i130 = i129 % 2;
                                    break;
                            }
                        } else {
                            switch (awj.c()) {
                                case IMediaSession.Stub.TRANSACTION_playFromMediaId /* 14 */:
                                case IMediaSession.Stub.TRANSACTION_playFromSearch /* 15 */:
                                    if (i10 == i11) {
                                        int i816 = a;
                                        int i912 = (i816 & 7) + (i816 | 7);
                                        b = i912 % 128;
                                        int i913 = i912 % 2;
                                        i12 = -1;
                                    }
                                    int i1119 = i11 & 59;
                                    int i11110 = ((i11 ^ 59) | i1119) << 1;
                                    int i11111 = -((i11 | 59) & (~i1119));
                                    int i11112 = (i11110 ^ i11111) + ((i11111 & i11110) << 1);
                                    int i11113 = i11112 & (-60);
                                    int i11114 = (i11112 ^ (-60)) | i11113;
                                    i11 = (i11113 | i11114) + (i11113 & i11114);
                                    int i11115 = a;
                                    int i11116 = i11115 & 65;
                                    int i11117 = i11116 + ((i11115 ^ 65) | i11116);
                                    b = i11117 % 128;
                                    int i1210 = i11117 % 2;
                                    break;
                                case 16:
                                case IMediaSession.Stub.TRANSACTION_skipToQueueItem /* 17 */:
                                    if (i10 == i11) {
                                        int i817 = b;
                                        int i818 = ((i817 & 29) - (~(i817 | 29))) - 1;
                                        a = i818 % 128;
                                        int i819 = i818 % 2;
                                        i12 = 1;
                                    }
                                    int i11118 = i11 & 59;
                                    int i11119 = ((i11 ^ 59) | i11118) << 1;
                                    int i111110 = -((i11 | 59) & (~i11118));
                                    int i111111 = (i11119 ^ i111110) + ((i111110 & i11119) << 1);
                                    int i111112 = i111111 & (-60);
                                    int i111113 = (i111111 ^ (-60)) | i111112;
                                    i11 = (i111112 | i111113) + (i111112 & i111113);
                                    int i111114 = a;
                                    int i111115 = i111114 & 65;
                                    int i111116 = i111115 + ((i111114 ^ 65) | i111115);
                                    b = i111116 % 128;
                                    int i1211 = i111116 % 2;
                                    break;
                                case IMediaSession.Stub.TRANSACTION_pause /* 18 */:
                                    int i1212 = (i11 & (-11)) + (i11 | (-11));
                                    i11 = (i1212 & 12) + (i1212 | 12);
                                    int i1213 = b + 83;
                                    a = i1213 % 128;
                                    int i1214 = i1213 % 2;
                                    break;
                                default:
                                    int i1215 = a;
                                    int i1216 = i1215 & 89;
                                    int i1217 = (i1215 | 89) & (~i1216);
                                    int i1218 = -(-(i1216 << 1));
                                    int i1219 = ((i1217 | i1218) << 1) - (i1217 ^ i1218);
                                    b = i1219 % 128;
                                    int i131 = i1219 % 2;
                                    break;
                            }
                        }
                    } else {
                        i12 = 0;
                    }
                }
            }
            int i8110 = a;
            i = (((i8110 | 110) << 1) - (i8110 ^ 110)) - 1;
            b = i % 128;
            if (i % 2 != 0) {
                int i8111 = 12 / 0;
            }
            return i12;
        }
    }

    public static am e() {
        boolean z;
        am amVar;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 38) << 1) - (i2 ^ 38);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            Locale locale = Locale.getDefault();
            int i5 = y.c;
            TextUtils.getLayoutDirectionFromLocale(locale);
            obj.hashCode();
            throw null;
        }
        Locale locale2 = Locale.getDefault();
        int i6 = y.c;
        int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale(locale2);
        int i7 = b;
        int i8 = i7 & 93;
        int i9 = (((i7 ^ 93) | i8) << 1) - ((i7 | 93) & (~i8));
        int i10 = i9 % 128;
        a = i10;
        int i11 = i9 % 2;
        if (layoutDirectionFromLocale != 1) {
            int i12 = i10 & 113;
            int i13 = -(-(i10 | 113));
            int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
            b = i14 % 128;
            int i15 = i14 % 2;
            int i16 = (i10 ^ 54) + ((i10 & 54) << 1);
            int i17 = (i16 ^ (-1)) + (i16 << 1);
            b = i17 % 128;
            int i18 = i17 % 2;
            z = false;
        } else {
            z = true;
        }
        int i19 = ((i10 & (-36)) | ((~i10) & 35)) + ((i10 & 35) << 1);
        int i20 = i19 % 128;
        b = i20;
        if (i19 % 2 != 0) {
            throw null;
        }
        if (z) {
            int i21 = i20 + 91;
            a = i21 % 128;
            if (i21 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            amVar = g;
        } else {
            amVar = f;
            int i22 = i10 & 63;
            int i23 = (i10 ^ 63) | i22;
            int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
            b = i24 % 128;
            int i25 = i24 % 2;
        }
        int i26 = b;
        int i27 = i26 & 67;
        int i28 = (i26 | 67) & (~i27);
        int i29 = -(-(i27 << 1));
        int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
        a = i30 % 128;
        int i31 = i30 % 2;
        return amVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        r3 = ((ivas.gov.bisp.enumeration.ak.s.aWd) r19).d(r18, 0, r18.length());
        r4 = new android.text.SpannableStringBuilder();
        r9 = ivas.gov.bisp.enumeration.p011ak.am.a;
        r10 = r9 & 105;
        r9 = (r9 ^ 105) | r10;
        r11 = (r10 & r9) + (r9 | r10);
        r9 = r11 % 128;
        ivas.gov.bisp.enumeration.p011ak.am.b = r9;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        if ((r17.i & 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0064, code lost:
    
        r10 = (r9 & 27) + (r9 | 27);
        ivas.gov.bisp.enumeration.p011ak.am.a = r10 % 128;
        r10 = r10 % 2;
        r10 = ((r9 ^ 33) | (r9 & 33)) << 1;
        r9 = -(((~r9) & 33) | (r9 & (-34)));
        r12 = ((r10 | r9) << 1) - (r9 ^ r10);
        ivas.gov.bisp.enumeration.p011ak.am.a = r12 % 128;
        r12 = r12 % 2;
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0088, code lost:
    
        r9 = (-2) - (((r9 & 12) + (r9 | 12)) ^ (-1));
        ivas.gov.bisp.enumeration.p011ak.am.a = r9 % 128;
        r9 = r9 % 2;
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0097, code lost:
    
        r10 = net.sqlcipher.BuildConfig.FLAVOR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009a, code lost:
    
        if (r9 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009c, code lost:
    
        r9 = ivas.gov.bisp.enumeration.p011ak.am.a;
        r13 = ((r9 & 34) + (r9 | 34)) - 1;
        ivas.gov.bisp.enumeration.p011ak.am.b = r13 % 128;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a9, code lost:
    
        if (r20 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        r13 = r9 & 77;
        r14 = (~r13) & (r9 | 77);
        r13 = -(-(r13 << 1));
        r15 = (r14 ^ r13) + ((r13 & r14) << 1);
        ivas.gov.bisp.enumeration.p011ak.am.b = r15 % 128;
        r15 = r15 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c0, code lost:
    
        if ((!r3) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c2, code lost:
    
        r9 = ivas.gov.bisp.enumeration.p011ak.s.c;
        r13 = ivas.gov.bisp.enumeration.p011ak.am.a;
        r14 = ((r13 & 114) + (r13 | 114)) - 1;
        ivas.gov.bisp.enumeration.p011ak.am.b = r14 % 128;
        r14 = r14 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d2, code lost:
    
        r13 = (r9 | 41) << 1;
        r9 = -(((~r9) & 41) | (r9 & (-42)));
        r14 = (r13 & r9) + (r9 | r13);
        ivas.gov.bisp.enumeration.p011ak.am.b = r14 % 128;
        r14 = r14 % 2;
        r9 = ivas.gov.bisp.enumeration.p011ak.s.d;
        r13 = (-2) - ((ivas.gov.bisp.enumeration.p011ak.am.a + 94) ^ (-1));
        ivas.gov.bisp.enumeration.p011ak.am.b = r13 % 128;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f3, code lost:
    
        r13 = r18.length();
        r14 = ivas.gov.bisp.enumeration.p011ak.am.b;
        r15 = r14 & 85;
        r14 = -(-(r14 | 85));
        r14 = (r15 ^ r14) + ((r14 & r15) << 1);
        ivas.gov.bisp.enumeration.p011ak.am.a = r14 % 128;
        r14 = r14 % 2;
        r9 = ((ivas.gov.bisp.enumeration.ak.s.aWd) r9).d(r18, 0, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0112, code lost:
    
        if (r17.h != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0114, code lost:
    
        r13 = ivas.gov.bisp.enumeration.p011ak.am.b;
        r14 = r13 | 107;
        r15 = ((r14 << 1) - (~(-((~(r13 & 107)) & r14)))) - 1;
        r13 = r15 % 128;
        ivas.gov.bisp.enumeration.p011ak.am.a = r13;
        r15 = r15 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0127, code lost:
    
        if (r9 == true) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0129, code lost:
    
        r14 = r13 & 125;
        r13 = (r13 ^ 125) | r14;
        r15 = (r14 ^ r13) + ((r13 & r14) << 1);
        ivas.gov.bisp.enumeration.p011ak.am.b = r15 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0138, code lost:
    
        if ((r15 % 2) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x013e, code lost:
    
        if (c(r18) != 1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0145, code lost:
    
        if (c(r18) != 1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0147, code lost:
    
        r9 = ivas.gov.bisp.enumeration.p011ak.am.e;
        r13 = ivas.gov.bisp.enumeration.p011ak.am.b;
        r14 = ((r13 | 63) << 1) - (r13 ^ 63);
        ivas.gov.bisp.enumeration.p011ak.am.a = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0156, code lost:
    
        if ((r14 % 2) != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0158, code lost:
    
        r13 = 3 % 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x015d, code lost:
    
        if (r17.h == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x015f, code lost:
    
        r13 = ivas.gov.bisp.enumeration.p011ak.am.a;
        r14 = ((r13 & 43) - (~(-(-(r13 | 43))))) - 1;
        ivas.gov.bisp.enumeration.p011ak.am.b = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x016f, code lost:
    
        if ((r14 % 2) != 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0171, code lost:
    
        if (r9 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0173, code lost:
    
        r9 = r13 & 105;
        r13 = (r13 | 105) & (~r9);
        r9 = -(-(r9 << 1));
        r14 = (r13 & r9) + (r9 | r13);
        ivas.gov.bisp.enumeration.p011ak.am.b = r14 % 128;
        r14 = r14 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0189, code lost:
    
        if (c(r18) != (-1)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x018b, code lost:
    
        r9 = ivas.gov.bisp.enumeration.p011ak.am.d;
        r13 = ivas.gov.bisp.enumeration.p011ak.am.b;
        r14 = r13 & 73;
        r13 = r13 | 73;
        r15 = (r14 ^ r13) + ((r13 & r14) << 1);
        ivas.gov.bisp.enumeration.p011ak.am.a = r15 % 128;
        r15 = r15 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x019e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x019f, code lost:
    
        r9 = ivas.gov.bisp.enumeration.p011ak.am.a;
        r14 = r9 & 37;
        r13 = ((r9 ^ 37) | r14) << 1;
        r9 = -((r9 | 37) & (~r14));
        r14 = ((r13 | r9) << 1) - (r9 ^ r13);
        ivas.gov.bisp.enumeration.p011ak.am.b = r14 % 128;
        r14 = r14 % 2;
        r9 = net.sqlcipher.BuildConfig.FLAVOR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01b7, code lost:
    
        r4.append((java.lang.CharSequence) r9);
        r9 = ivas.gov.bisp.enumeration.p011ak.am.b;
        r13 = ((r9 ^ 17) | (r9 & 17)) << 1;
        r5 = -((17 & (~r9)) | (r9 & (-18)));
        r9 = (r13 & r5) + (r5 | r13);
        ivas.gov.bisp.enumeration.p011ak.am.a = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01d3, code lost:
    
        if (r3 == r17.h) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01d5, code lost:
    
        r5 = ivas.gov.bisp.enumeration.p011ak.am.a;
        r9 = (r5 | 29) << 1;
        r5 = -(((~r5) & 29) | (r5 & (-30)));
        r13 = (r9 ^ r5) + ((r5 & r9) << 1);
        r5 = r13 % 128;
        ivas.gov.bisp.enumeration.p011ak.am.b = r5;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01ec, code lost:
    
        if (r3 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01ee, code lost:
    
        r9 = r5 & 51;
        r5 = -(-((r5 ^ 51) | r9));
        r13 = ((r9 | r5) << 1) - (r5 ^ r9);
        ivas.gov.bisp.enumeration.p011ak.am.a = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01ff, code lost:
    
        if ((r13 % 2) != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0201, code lost:
    
        r5 = 29355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0204, code lost:
    
        r5 = 8235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0207, code lost:
    
        r5 = r5 + 45;
        ivas.gov.bisp.enumeration.p011ak.am.a = r5 % 128;
        r5 = r5 % 2;
        r5 = 8234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0210, code lost:
    
        r4.append(r5);
        r4.append(r18);
        r5 = ivas.gov.bisp.enumeration.p011ak.am.a;
        r9 = (r5 ^ 101) + ((r5 & 101) << 1);
        ivas.gov.bisp.enumeration.p011ak.am.b = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0223, code lost:
    
        if ((r9 % 2) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0225, code lost:
    
        r5 = 25499;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0228, code lost:
    
        r5 = 8236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (r18 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x022a, code lost:
    
        r4.append(r5);
        r5 = ivas.gov.bisp.enumeration.p011ak.am.b;
        r9 = ((r5 ^ 114) + ((r5 & 114) << 1)) - 1;
        ivas.gov.bisp.enumeration.p011ak.am.a = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x023c, code lost:
    
        r4.append(r18);
        r5 = ivas.gov.bisp.enumeration.p011ak.am.a;
        r9 = (r5 | 51) << 1;
        r5 = -(r5 ^ 51);
        r13 = (r9 & r5) + (r5 | r9);
        ivas.gov.bisp.enumeration.p011ak.am.b = r13 % 128;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0250, code lost:
    
        if (r20 == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0252, code lost:
    
        r5 = ivas.gov.bisp.enumeration.p011ak.am.a;
        r9 = r5 & 47;
        r9 = r9 + ((r5 ^ 47) | r9);
        r5 = r9 % 128;
        ivas.gov.bisp.enumeration.p011ak.am.b = r5;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0260, code lost:
    
        if ((!r3) == true) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0262, code lost:
    
        r3 = (-2) - (((r5 ^ 118) + ((r5 & 118) << 1)) ^ (-1));
        ivas.gov.bisp.enumeration.p011ak.am.a = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0270, code lost:
    
        if ((r3 % 2) == 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0272, code lost:
    
        r3 = ivas.gov.bisp.enumeration.p011ak.s.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0275, code lost:
    
        r1 = ivas.gov.bisp.enumeration.p011ak.s.d;
        r8.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x027a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x027b, code lost:
    
        r3 = ivas.gov.bisp.enumeration.p011ak.s.c;
        r5 = ivas.gov.bisp.enumeration.p011ak.am.b;
        r9 = r5 & 83;
        r9 = (r9 - (~((r5 ^ 83) | r9))) - 1;
        ivas.gov.bisp.enumeration.p011ak.am.a = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x028c, code lost:
    
        r5 = r18.length();
        r3 = (ivas.gov.bisp.enumeration.ak.s.aWd) r3;
        r9 = ivas.gov.bisp.enumeration.p011ak.am.a;
        r13 = r9 & 79;
        r9 = -(-((r9 ^ 79) | r13));
        r14 = ((r13 | r9) << 1) - (r9 ^ r13);
        ivas.gov.bisp.enumeration.p011ak.am.b = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02a5, code lost:
    
        if ((r14 % 2) != 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02a7, code lost:
    
        r3 = r3.d(r18, 0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02ae, code lost:
    
        if ((!r17.h) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02b0, code lost:
    
        r5 = ivas.gov.bisp.enumeration.p011ak.am.b;
        r7 = r5 & 87;
        r5 = (r5 ^ 87) | r7;
        r9 = (r7 & r5) + (r5 | r7);
        r5 = r9 % 128;
        ivas.gov.bisp.enumeration.p011ak.am.a = r5;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02c2, code lost:
    
        if ((!r3) == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02c4, code lost:
    
        r5 = r5 + 53;
        ivas.gov.bisp.enumeration.p011ak.am.b = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02cf, code lost:
    
        if (d(r18) != 1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02d1, code lost:
    
        r10 = ivas.gov.bisp.enumeration.p011ak.am.e;
        r1 = ivas.gov.bisp.enumeration.p011ak.am.b + 113;
        ivas.gov.bisp.enumeration.p011ak.am.a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (r18 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02df, code lost:
    
        if (r17.h == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02e1, code lost:
    
        r5 = ivas.gov.bisp.enumeration.p011ak.am.a;
        r7 = (((r5 | 52) << 1) - (r5 ^ 52)) - 1;
        r5 = r7 % 128;
        ivas.gov.bisp.enumeration.p011ak.am.b = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02ef, code lost:
    
        if ((r7 % 2) != 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02f1, code lost:
    
        if (r3 == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02f3, code lost:
    
        r3 = ((r5 ^ 107) | (r5 & 107)) << 1;
        r5 = -(((~r5) & 107) | (r5 & (-108)));
        r7 = (r3 ^ r5) + ((r3 & r5) << 1);
        ivas.gov.bisp.enumeration.p011ak.am.a = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x030e, code lost:
    
        if (d(r18) != (-1)) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0310, code lost:
    
        r10 = ivas.gov.bisp.enumeration.p011ak.am.d;
        r1 = ivas.gov.bisp.enumeration.p011ak.am.a;
        r3 = r1 & 113;
        r3 = (r3 - (~(-(-((r1 ^ 113) | r3))))) - 1;
        ivas.gov.bisp.enumeration.p011ak.am.b = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0323, code lost:
    
        if ((r3 % 2) == 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0325, code lost:
    
        r1 = 5 / 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        r1 = (r3 | 1) << 1;
        r3 = -(((~r3) & 1) | (r3 & (-2)));
        r4 = (r1 ^ r3) + ((r1 & r3) << 1);
        r1 = r4 % 128;
        ivas.gov.bisp.enumeration.p011ak.am.b = r1;
        r4 = r4 % 2;
        r1 = r1 + 119;
        ivas.gov.bisp.enumeration.p011ak.am.a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0328, code lost:
    
        r8.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x032b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x032c, code lost:
    
        r4.append((java.lang.CharSequence) r10);
        r1 = ivas.gov.bisp.enumeration.p011ak.am.a;
        r3 = ((r1 & 86) + (r1 | 86)) - 1;
        ivas.gov.bisp.enumeration.p011ak.am.b = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x033c, code lost:
    
        if ((r3 % 2) == 0) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x033e, code lost:
    
        r12 = 5 % 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0340, code lost:
    
        r3.d(r18, 0, r5);
        r8.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0346, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0347, code lost:
    
        r1 = ivas.gov.bisp.enumeration.p011ak.am.a;
        r3 = r1 & 85;
        r1 = -(-((r1 ^ 85) | r3));
        r5 = (r3 & r1) + (r1 | r3);
        ivas.gov.bisp.enumeration.p011ak.am.b = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0359, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence f(java.lang.CharSequence r18, ivas.gov.bisp.enumeration.p011ak.C r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 858
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p011ak.am.f(java.lang.CharSequence, ivas.gov.bisp.enumeration.ak.C, boolean):java.lang.CharSequence");
    }
}
