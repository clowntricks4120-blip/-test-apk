package ivas.gov.bisp.enumeration.dj;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import ivas.gov.bisp.enumeration.otp.OtpVerificationActivity;
import java.util.Objects;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class J implements View.OnKeyListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ J(Object obj, int i, int i2) {
        this.c = i2;
        this.e = obj;
        this.d = i;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0088  */
    /* JADX WARN: Code duplicated, block: B:17:0x0097  */
    /* JADX WARN: Code duplicated, block: B:19:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:20:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:30:0x0116  */
    /* JADX WARN: Code duplicated, block: B:38:0x0140  */
    /* JADX WARN: Code duplicated, block: B:41:0x0151  */
    /* JADX WARN: Code duplicated, block: B:43:0x015f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0161  */
    /* JADX WARN: Code duplicated, block: B:46:0x0192  */
    /* JADX WARN: Code duplicated, block: B:47:0x019a  */
    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 2 % 2;
        int i11 = b;
        int i12 = ((i11 & 62) + (i11 | 62)) - 1;
        int i13 = i12 % 128;
        a = i13;
        int i14 = i12 % 2;
        if (this.c != 0) {
            int i15 = ((((i13 ^ 57) | (i13 & 57)) << 1) - (~(-(((~i13) & 57) | (i13 & (-58)))))) - 1;
            int i16 = i15 % 128;
            b = i16;
            int i17 = i15 % 2;
            EditText[] editTextArr = (EditText[]) this.e;
            int i18 = this.d;
            int i19 = i16 & 37;
            int i20 = ((i16 ^ 37) | i19) << 1;
            int i21 = -((i16 | 37) & (~i19));
            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
            a = i22 % 128;
            int i23 = i22 % 2;
            if (keyEvent.getAction() == 0) {
                int i24 = b;
                int i25 = (i24 ^ 105) + ((i24 & 105) << 1);
                int i26 = i25 % 128;
                a = i26;
                int i27 = i25 % 2;
                if (i == 67) {
                    int i28 = (i26 ^ 49) + ((i26 & 49) << 1);
                    b = i28 % 128;
                    if (i28 % 2 != 0) {
                        int i29 = 99 / 0;
                        if (editTextArr[i18].getText().length() == 0) {
                            int i30 = b;
                            int i31 = i30 & 115;
                            int i32 = i31 + ((i30 ^ 115) | i31);
                            i7 = i32 % 128;
                            a = i7;
                            int i33 = i32 % 2;
                            if (i18 > 0) {
                                int i34 = (((i7 ^ 27) | (i7 & 27)) << 1) - (((~i7) & 27) | (i7 & (-28)));
                                b = i34 % 128;
                                int i35 = i34 % 2;
                                int i36 = ~i18;
                                int i37 = -(-(i18 << 1));
                                i8 = ((i36 | i37) << 1) - (i36 ^ i37);
                                editTextArr[i8].requestFocus();
                                int i38 = b;
                                int i39 = i38 & 3;
                                i9 = (i39 - (~(-(-((i38 ^ 3) | i39))))) - 1;
                                a = i9 % 128;
                                if (i9 % 2 == 0) {
                                    editTextArr[i8].setText(BuildConfig.FLAVOR);
                                    int i40 = 61 / 0;
                                } else {
                                    editTextArr[i8].setText(BuildConfig.FLAVOR);
                                }
                            }
                        }
                    } else if (editTextArr[i18].getText().length() == 0) {
                        int i310 = b;
                        int i311 = i310 & 115;
                        int i312 = i311 + ((i310 ^ 115) | i311);
                        i7 = i312 % 128;
                        a = i7;
                        int i313 = i312 % 2;
                        if (i18 > 0) {
                            int i314 = (((i7 ^ 27) | (i7 & 27)) << 1) - (((~i7) & 27) | (i7 & (-28)));
                            b = i314 % 128;
                            int i315 = i314 % 2;
                            int i316 = ~i18;
                            int i317 = -(-(i18 << 1));
                            i8 = ((i316 | i317) << 1) - (i316 ^ i317);
                            editTextArr[i8].requestFocus();
                            int i318 = b;
                            int i319 = i318 & 3;
                            i9 = (i319 - (~(-(-((i318 ^ 3) | i319))))) - 1;
                            a = i9 % 128;
                            if (i9 % 2 == 0) {
                                editTextArr[i8].setText(BuildConfig.FLAVOR);
                                int i41 = 61 / 0;
                            } else {
                                editTextArr[i8].setText(BuildConfig.FLAVOR);
                            }
                        }
                    }
                }
            }
            int i42 = b;
            int i43 = ((i42 & (-2)) | ((~i42) & 1)) + ((i42 & 1) << 1);
            a = i43 % 128;
            int i44 = i43 % 2;
            return false;
        }
        OtpVerificationActivity otpVerificationActivity = (OtpVerificationActivity) this.e;
        int i45 = this.d;
        int i46 = ((i13 | 83) << 1) - (i13 ^ 83);
        b = i46 % 128;
        if (i46 % 2 != 0) {
            OtpVerificationActivity.OooO0O0 oooO0O0 = OtpVerificationActivity.r;
            Objects.requireNonNull(otpVerificationActivity);
            int i47 = 57 / 0;
            if (keyEvent.getAction() == 0) {
                int i48 = b;
                int i49 = i48 & 49;
                int i50 = (i48 | 49) & (~i49);
                int i51 = i49 << 1;
                i2 = (i50 ^ i51) + ((i50 & i51) << 1);
                i3 = i2 % 128;
                a = i3;
                if (i2 % 2 == 0 ? i == 67 : i == 66) {
                    int i52 = i3 ^ 47;
                    i4 = (((i3 & 47) | i52) << 1) - i52;
                    b = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i53 = 1 / 0;
                        if (otpVerificationActivity.t[i45].getText().length() == 0) {
                            if (i45 > 0) {
                                int i54 = a;
                                int i55 = i54 & 85;
                                int i56 = (i54 | 85) & (~i55);
                                int i57 = -(-(i55 << 1));
                                int i58 = (i56 & i57) + (i56 | i57);
                                b = i58 % 128;
                                int i59 = i58 % 2;
                                EditText[] editTextArr2 = otpVerificationActivity.t;
                                int i60 = ~i45;
                                int i61 = -(-(i45 << 1));
                                i5 = (i60 & i61) + (i60 | i61);
                                editTextArr2[i5].requestFocus();
                                int i62 = a;
                                i6 = (i62 & 67) + (i62 | 67);
                                b = i6 % 128;
                                if (i6 % 2 == 0) {
                                    otpVerificationActivity.t[i5].setText(BuildConfig.FLAVOR);
                                    Object obj = null;
                                    obj.hashCode();
                                    throw null;
                                }
                                otpVerificationActivity.t[i5].setText(BuildConfig.FLAVOR);
                            }
                        }
                    } else if (otpVerificationActivity.t[i45].getText().length() == 0) {
                        if (i45 > 0) {
                            int i510 = a;
                            int i511 = i510 & 85;
                            int i512 = (i510 | 85) & (~i511);
                            int i513 = -(-(i511 << 1));
                            int i514 = (i512 & i513) + (i512 | i513);
                            b = i514 % 128;
                            int i515 = i514 % 2;
                            EditText[] editTextArr3 = otpVerificationActivity.t;
                            int i63 = ~i45;
                            int i64 = -(-(i45 << 1));
                            i5 = (i63 & i64) + (i63 | i64);
                            editTextArr3[i5].requestFocus();
                            int i65 = a;
                            i6 = (i65 & 67) + (i65 | 67);
                            b = i6 % 128;
                            if (i6 % 2 == 0) {
                                otpVerificationActivity.t[i5].setText(BuildConfig.FLAVOR);
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            otpVerificationActivity.t[i5].setText(BuildConfig.FLAVOR);
                        }
                    }
                }
            }
        } else {
            OtpVerificationActivity.OooO0O0 oooO0O1 = OtpVerificationActivity.r;
            Objects.requireNonNull(otpVerificationActivity);
            if (keyEvent.getAction() == 0) {
                int i410 = b;
                int i411 = i410 & 49;
                int i516 = (i410 | 49) & (~i411);
                int i517 = i411 << 1;
                i2 = (i516 ^ i517) + ((i516 & i517) << 1);
                i3 = i2 % 128;
                a = i3;
                if (i2 % 2 == 0) {
                    int i518 = i3 ^ 47;
                    i4 = (((i3 & 47) | i518) << 1) - i518;
                    b = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i519 = 1 / 0;
                        if (otpVerificationActivity.t[i45].getText().length() == 0) {
                            if (i45 > 0) {
                                int i5110 = a;
                                int i5111 = i5110 & 85;
                                int i5112 = (i5110 | 85) & (~i5111);
                                int i5113 = -(-(i5111 << 1));
                                int i5114 = (i5112 & i5113) + (i5112 | i5113);
                                b = i5114 % 128;
                                int i5115 = i5114 % 2;
                                EditText[] editTextArr4 = otpVerificationActivity.t;
                                int i66 = ~i45;
                                int i67 = -(-(i45 << 1));
                                i5 = (i66 & i67) + (i66 | i67);
                                editTextArr4[i5].requestFocus();
                                int i68 = a;
                                i6 = (i68 & 67) + (i68 | 67);
                                b = i6 % 128;
                                if (i6 % 2 == 0) {
                                    otpVerificationActivity.t[i5].setText(BuildConfig.FLAVOR);
                                    Object obj3 = null;
                                    obj3.hashCode();
                                    throw null;
                                }
                                otpVerificationActivity.t[i5].setText(BuildConfig.FLAVOR);
                            }
                        }
                    } else if (otpVerificationActivity.t[i45].getText().length() == 0) {
                        if (i45 > 0) {
                            int i5116 = a;
                            int i5117 = i5116 & 85;
                            int i5118 = (i5116 | 85) & (~i5117);
                            int i5119 = -(-(i5117 << 1));
                            int i51110 = (i5118 & i5119) + (i5118 | i5119);
                            b = i51110 % 128;
                            int i51111 = i51110 % 2;
                            EditText[] editTextArr5 = otpVerificationActivity.t;
                            int i69 = ~i45;
                            int i610 = -(-(i45 << 1));
                            i5 = (i69 & i610) + (i69 | i610);
                            editTextArr5[i5].requestFocus();
                            int i611 = a;
                            i6 = (i611 & 67) + (i611 | 67);
                            b = i6 % 128;
                            if (i6 % 2 == 0) {
                                otpVerificationActivity.t[i5].setText(BuildConfig.FLAVOR);
                                Object obj4 = null;
                                obj4.hashCode();
                                throw null;
                            }
                            otpVerificationActivity.t[i5].setText(BuildConfig.FLAVOR);
                        }
                    }
                } else {
                    int i5120 = i3 ^ 47;
                    i4 = (((i3 & 47) | i5120) << 1) - i5120;
                    b = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5121 = 1 / 0;
                        if (otpVerificationActivity.t[i45].getText().length() == 0) {
                            if (i45 > 0) {
                                int i51112 = a;
                                int i51113 = i51112 & 85;
                                int i51114 = (i51112 | 85) & (~i51113);
                                int i51115 = -(-(i51113 << 1));
                                int i51116 = (i51114 & i51115) + (i51114 | i51115);
                                b = i51116 % 128;
                                int i51117 = i51116 % 2;
                                EditText[] editTextArr6 = otpVerificationActivity.t;
                                int i612 = ~i45;
                                int i613 = -(-(i45 << 1));
                                i5 = (i612 & i613) + (i612 | i613);
                                editTextArr6[i5].requestFocus();
                                int i614 = a;
                                i6 = (i614 & 67) + (i614 | 67);
                                b = i6 % 128;
                                if (i6 % 2 == 0) {
                                    otpVerificationActivity.t[i5].setText(BuildConfig.FLAVOR);
                                    Object obj5 = null;
                                    obj5.hashCode();
                                    throw null;
                                }
                                otpVerificationActivity.t[i5].setText(BuildConfig.FLAVOR);
                            }
                        }
                    } else if (otpVerificationActivity.t[i45].getText().length() == 0) {
                        if (i45 > 0) {
                            int i51118 = a;
                            int i51119 = i51118 & 85;
                            int i511110 = (i51118 | 85) & (~i51119);
                            int i511111 = -(-(i51119 << 1));
                            int i511112 = (i511110 & i511111) + (i511110 | i511111);
                            b = i511112 % 128;
                            int i511113 = i511112 % 2;
                            EditText[] editTextArr7 = otpVerificationActivity.t;
                            int i615 = ~i45;
                            int i616 = -(-(i45 << 1));
                            i5 = (i615 & i616) + (i615 | i616);
                            editTextArr7[i5].requestFocus();
                            int i617 = a;
                            i6 = (i617 & 67) + (i617 | 67);
                            b = i6 % 128;
                            if (i6 % 2 == 0) {
                                otpVerificationActivity.t[i5].setText(BuildConfig.FLAVOR);
                                Object obj6 = null;
                                obj6.hashCode();
                                throw null;
                            }
                            otpVerificationActivity.t[i5].setText(BuildConfig.FLAVOR);
                        }
                    }
                }
            }
        }
        int i70 = b + 37;
        a = i70 % 128;
        if (i70 % 2 == 0) {
            int i71 = 56 / 0;
        }
        return false;
    }
}
