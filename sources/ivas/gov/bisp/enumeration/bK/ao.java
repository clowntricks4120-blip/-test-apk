package ivas.gov.bisp.enumeration.bK;

import android.app.Activity;
import android.os.Build;
import android.provider.Settings;
import androidx.appcompat.app.AlertController;
import ivas.gov.bisp.enumeration.p043bp.DialogInterfaceOnClickListenerC0204j;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class ao {
    private static int a = 1;
    private static int b;

    public static void c(Activity activity, String str) {
        int i = 2 % 2;
        androidx.appcompat.app.b.aIz aiz = new androidx.appcompat.app.b.aIz(activity);
        AlertController.OooO0O0 oooO0O0 = aiz.a;
        int i2 = a;
        int i3 = ((i2 ^ 9) - (~(-(-((i2 & 9) << 1))))) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            oooO0O0.e = "Security Alert";
            oooO0O0.f = str;
            int i4 = 43 / 0;
        } else {
            oooO0O0.e = "Security Alert";
            oooO0O0.f = str;
        }
        oooO0O0.k = false;
        DialogInterfaceOnClickListenerC0204j dialogInterfaceOnClickListenerC0204j = new DialogInterfaceOnClickListenerC0204j(activity, 7);
        int i5 = b;
        int i6 = i5 & 11;
        int i7 = (i5 ^ 11) | i6;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        oooO0O0.h = "OK";
        oooO0O0.i = dialogInterfaceOnClickListenerC0204j;
        int i10 = b;
        int i11 = (-2) - (((i10 & 126) + (i10 | 126)) ^ (-1));
        a = i11 % 128;
        int i12 = i11 % 2;
        aiz.d();
        int i13 = a;
        int i14 = (i13 & (-8)) | ((~i13) & 7);
        int i15 = -(-((i13 & 7) << 1));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        b = i16 % 128;
        int i17 = i16 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0060  */
    /* JADX WARN: Code duplicated, block: B:21:0x0073  */
    /* JADX WARN: Code duplicated, block: B:23:0x007a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0089  */
    /* JADX WARN: Code duplicated, block: B:26:0x008b  */
    /* JADX WARN: Code duplicated, block: B:28:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:38:0x010a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0126 A[LOOP:0: B:37:0x0108->B:41:0x0126, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x014f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0171 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x0172  */
    /* JADX WARN: Code duplicated, block: B:51:0x0182  */
    /* JADX WARN: Code duplicated, block: B:53:0x0196  */
    /* JADX WARN: Code duplicated, block: B:54:0x0198  */
    /* JADX WARN: Code duplicated, block: B:56:0x019b  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:61:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:63:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:73:0x0176 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0117 A[SYNTHETIC] */
    public static boolean b(Activity activity) {
        String str;
        int i;
        int i2;
        int i3;
        boolean z;
        String[] strArr;
        int i4;
        int i5;
        int i6;
        boolean z2;
        int i7;
        int i8;
        int i9;
        boolean z3;
        int i10;
        int i11 = 2 % 2;
        int i12 = b;
        int i13 = (i12 ^ 100) + ((i12 & 100) << 1);
        int i14 = (i13 ^ (-1)) + (i13 << 1);
        a = i14 % 128;
        Object obj = null;
        if (i14 % 2 != 0 ? Build.VERSION.SDK_INT != 24 : Build.VERSION.SDK_INT != 18) {
            int i15 = b;
            int i16 = i15 & 73;
            int i17 = ((((i15 ^ 73) | i16) << 1) - (~(-((i15 | 73) & (~i16))))) - 1;
            a = i17 % 128;
            int i18 = i17 % 2;
        } else {
            int i19 = a;
            int i20 = (i19 & 68) + (i19 | 68);
            int i21 = (i20 ^ (-1)) + (i20 << 1);
            b = i21 % 128;
            int i22 = i21 % 2;
            int i23 = ((i19 | 25) << 1) - (i19 ^ 25);
            b = i23 % 128;
            if (i23 % 2 != 0) {
                int i24 = 58 / 0;
                if ("S70V2".equalsIgnoreCase(Build.MODEL)) {
                    str = Build.DISPLAY;
                    if (str != null) {
                        int i25 = a;
                        i = ((i25 ^ 77) - (~((i25 & 77) << 1))) - 1;
                        b = i % 128;
                        if (i % 2 == 0) {
                            str.contains("S70V2-20200616-EN-S");
                            throw null;
                        }
                        if (!(!str.contains("S70V2-20200616-EN-S"))) {
                            i2 = b;
                            int i26 = i2 & 59;
                            i3 = i26 + ((i2 ^ 59) | i26);
                            a = i3 % 128;
                            if (i3 % 2 == 0) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z) {
                                int i27 = ((i2 ^ 97) | (i2 & 97)) << 1;
                                int i28 = -((i2 & (-98)) | ((~i2) & 97));
                                int i29 = (i27 & i28) + (i27 | i28);
                                a = i29 % 128;
                                int i30 = i29 % 2;
                                strArr = new String[7];
                                strArr[0] = "/system/app/Superuser.apk";
                                int i31 = i2 + 91;
                                a = i31 % 128;
                                int i32 = i31 % 2;
                                strArr[1] = "/sbin/su";
                                strArr[2] = "/system/bin/su";
                                int i33 = i2 & 39;
                                i4 = (i33 - (~((i2 ^ 39) | i33))) - 1;
                                a = i4 % 128;
                                if (i4 % 2 == 0) {
                                    strArr[3] = "/system/xbin/su";
                                    strArr[4] = "/data/local/xbin/su";
                                    strArr[4] = "/data/local/bin/su";
                                } else {
                                    strArr[3] = "/system/xbin/su";
                                    strArr[4] = "/data/local/xbin/su";
                                    strArr[5] = "/data/local/bin/su";
                                }
                                i5 = ((i2 & 58) + (i2 | 58)) - 1;
                                int i34 = i5 % 128;
                                a = i34;
                                if (i5 % 2 == 0) {
                                    strArr[9] = "/system/sd/xbin/su";
                                } else {
                                    strArr[6] = "/system/sd/xbin/su";
                                }
                                int i35 = i34 & 47;
                                int i36 = -(-((i34 ^ 47) | i35));
                                int i37 = (i35 & i36) + (i36 | i35);
                                b = i37 % 128;
                                int i38 = i37 % 2;
                                i6 = 0;
                                while (true) {
                                    if (i6 < 7) {
                                        int i39 = a;
                                        int i40 = (i39 ^ 51) + ((i39 & 51) << 1);
                                        b = i40 % 128;
                                        int i41 = i40 % 2;
                                        z2 = false;
                                        break;
                                    }
                                    if (new File(strArr[i6]).exists()) {
                                        int i42 = a;
                                        int i43 = (i42 ^ 19) + ((i42 & 19) << 1);
                                        b = i43 % 128;
                                        int i44 = i43 % 2;
                                        z2 = true;
                                        break;
                                    }
                                    i6 = (((i6 | 2) << 1) - (i6 ^ 2)) - 1;
                                    int i45 = a;
                                    int i46 = i45 & 53;
                                    int i47 = i45 | 53;
                                    int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
                                    b = i48 % 128;
                                    int i49 = i48 % 2;
                                }
                                if (z2) {
                                    int i50 = b;
                                    int i51 = (i50 & 63) + (i50 | 63);
                                    a = i51 % 128;
                                    int i52 = i51 % 2;
                                    c(activity, "This app cannot run on rooted devices.");
                                    int i53 = b;
                                    int i54 = i53 | 7;
                                    i10 = (i54 << 1) - ((~(i53 & 7)) & i54);
                                    a = i10 % 128;
                                    if (i10 % 2 != 0) {
                                        return false;
                                    }
                                    obj.hashCode();
                                    throw null;
                                }
                                try {
                                    if (Settings.Secure.getInt(activity.getContentResolver(), "mock_location", 0) != 0) {
                                        int i55 = a;
                                        int i56 = (i55 | 21) << 1;
                                        int i57 = -(i55 ^ 21);
                                        i8 = (i56 ^ i57) + ((i57 & i56) << 1);
                                        i9 = i8 % 128;
                                        b = i9;
                                        if (i8 % 2 != 0) {
                                            z3 = false;
                                        } else {
                                            z3 = true;
                                        }
                                        if (z3) {
                                            int i58 = ((i9 | 65) << 1) - (i9 ^ 65);
                                            a = i58 % 128;
                                            int i59 = i58 % 2;
                                            c(activity, "Please disbale mock location. Fake GPS is not allowed.");
                                            int i60 = a;
                                            int i61 = (i60 & 65) + (i60 | 65);
                                            b = i61 % 128;
                                            int i62 = i61 % 2;
                                            return false;
                                        }
                                    } else {
                                        int i63 = b;
                                        int i64 = i63 & 73;
                                        int i65 = (((i63 | 73) & (~i64)) - (~(i64 << 1))) - 1;
                                        a = i65 % 128;
                                        int i66 = i65 % 2;
                                    }
                                } catch (Exception unused) {
                                }
                                int i67 = b;
                                int i68 = (i67 & (-16)) | ((~i67) & 15);
                                int i69 = (i67 & 15) << 1;
                                i7 = (i68 ^ i69) + ((i69 & i68) << 1);
                                a = i7 % 128;
                                if (i7 % 2 == 0) {
                                    int i70 = 71 / 0;
                                }
                                return true;
                            }
                        } else {
                            int i71 = a;
                            int i72 = (i71 & 51) + (i71 | 51);
                            b = i72 % 128;
                            int i73 = i72 % 2;
                        }
                    } else {
                        int i74 = a;
                        int i75 = (i74 & 51) + (i74 | 51);
                        b = i75 % 128;
                        int i76 = i75 % 2;
                    }
                }
            } else if (!(!"S70V2".equalsIgnoreCase(Build.MODEL))) {
                str = Build.DISPLAY;
                if (str != null) {
                    int i210 = a;
                    i = ((i210 ^ 77) - (~((i210 & 77) << 1))) - 1;
                    b = i % 128;
                    if (i % 2 == 0) {
                        str.contains("S70V2-20200616-EN-S");
                        throw null;
                    }
                    if (!(!str.contains("S70V2-20200616-EN-S"))) {
                        i2 = b;
                        int i211 = i2 & 59;
                        i3 = i211 + ((i2 ^ 59) | i211);
                        a = i3 % 128;
                        if (i3 % 2 == 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            int i212 = ((i2 ^ 97) | (i2 & 97)) << 1;
                            int i213 = -((i2 & (-98)) | ((~i2) & 97));
                            int i214 = (i212 & i213) + (i212 | i213);
                            a = i214 % 128;
                            int i310 = i214 % 2;
                            strArr = new String[7];
                            strArr[0] = "/system/app/Superuser.apk";
                            int i311 = i2 + 91;
                            a = i311 % 128;
                            int i312 = i311 % 2;
                            strArr[1] = "/sbin/su";
                            strArr[2] = "/system/bin/su";
                            int i313 = i2 & 39;
                            i4 = (i313 - (~((i2 ^ 39) | i313))) - 1;
                            a = i4 % 128;
                            if (i4 % 2 == 0) {
                                strArr[3] = "/system/xbin/su";
                                strArr[4] = "/data/local/xbin/su";
                                strArr[4] = "/data/local/bin/su";
                            } else {
                                strArr[3] = "/system/xbin/su";
                                strArr[4] = "/data/local/xbin/su";
                                strArr[5] = "/data/local/bin/su";
                            }
                            i5 = ((i2 & 58) + (i2 | 58)) - 1;
                            int i314 = i5 % 128;
                            a = i314;
                            if (i5 % 2 == 0) {
                                strArr[9] = "/system/sd/xbin/su";
                            } else {
                                strArr[6] = "/system/sd/xbin/su";
                            }
                            int i315 = i314 & 47;
                            int i316 = -(-((i314 ^ 47) | i315));
                            int i317 = (i315 & i316) + (i316 | i315);
                            b = i317 % 128;
                            int i318 = i317 % 2;
                            i6 = 0;
                            while (true) {
                                if (i6 < 7) {
                                    int i319 = a;
                                    int i410 = (i319 ^ 51) + ((i319 & 51) << 1);
                                    b = i410 % 128;
                                    int i411 = i410 % 2;
                                    z2 = false;
                                    break;
                                }
                                if (new File(strArr[i6]).exists()) {
                                    int i412 = a;
                                    int i413 = (i412 ^ 19) + ((i412 & 19) << 1);
                                    b = i413 % 128;
                                    int i414 = i413 % 2;
                                    z2 = true;
                                    break;
                                }
                                i6 = (((i6 | 2) << 1) - (i6 ^ 2)) - 1;
                                int i415 = a;
                                int i416 = i415 & 53;
                                int i417 = i415 | 53;
                                int i418 = (i416 ^ i417) + ((i417 & i416) << 1);
                                b = i418 % 128;
                                int i419 = i418 % 2;
                            }
                            if (z2) {
                                int i510 = b;
                                int i511 = (i510 & 63) + (i510 | 63);
                                a = i511 % 128;
                                int i512 = i511 % 2;
                                c(activity, "This app cannot run on rooted devices.");
                                int i513 = b;
                                int i514 = i513 | 7;
                                i10 = (i514 << 1) - ((~(i513 & 7)) & i514);
                                a = i10 % 128;
                                if (i10 % 2 != 0) {
                                    return false;
                                }
                                obj.hashCode();
                                throw null;
                            }
                            if (Settings.Secure.getInt(activity.getContentResolver(), "mock_location", 0) != 0) {
                                int i515 = a;
                                int i516 = (i515 | 21) << 1;
                                int i517 = -(i515 ^ 21);
                                i8 = (i516 ^ i517) + ((i517 & i516) << 1);
                                i9 = i8 % 128;
                                b = i9;
                                if (i8 % 2 != 0) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                if (z3) {
                                    int i518 = ((i9 | 65) << 1) - (i9 ^ 65);
                                    a = i518 % 128;
                                    int i519 = i518 % 2;
                                    c(activity, "Please disbale mock location. Fake GPS is not allowed.");
                                    int i610 = a;
                                    int i611 = (i610 & 65) + (i610 | 65);
                                    b = i611 % 128;
                                    int i612 = i611 % 2;
                                    return false;
                                }
                            } else {
                                int i613 = b;
                                int i614 = i613 & 73;
                                int i615 = (((i613 | 73) & (~i614)) - (~(i614 << 1))) - 1;
                                a = i615 % 128;
                                int i616 = i615 % 2;
                            }
                            int i617 = b;
                            int i618 = (i617 & (-16)) | ((~i617) & 15);
                            int i619 = (i617 & 15) << 1;
                            i7 = (i618 ^ i619) + ((i619 & i618) << 1);
                            a = i7 % 128;
                            if (i7 % 2 == 0) {
                                int i77 = 71 / 0;
                            }
                            return true;
                        }
                    } else {
                        int i78 = a;
                        int i79 = (i78 & 51) + (i78 | 51);
                        b = i79 % 128;
                        int i710 = i79 % 2;
                    }
                } else {
                    int i711 = a;
                    int i712 = (i711 & 51) + (i711 | 51);
                    b = i712 % 128;
                    int i713 = i712 % 2;
                }
            }
        }
        c(activity, "This application is authorized only for official Amber S70V2 devices.");
        int i80 = b;
        int i81 = (i80 & (-60)) | ((~i80) & 59);
        int i82 = (i80 & 59) << 1;
        int i83 = (i81 & i82) + (i82 | i81);
        a = i83 % 128;
        if (i83 % 2 != 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }
}
