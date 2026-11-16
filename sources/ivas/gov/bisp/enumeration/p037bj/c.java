package ivas.gov.bisp.enumeration.p037bj;

import android.content.Context;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import ivas.gov.bisp.enumeration.p086i.a;
import ivas.gov.bisp.enumeration.p100w.r;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class c {
    private static int a = 1;
    private static int b;
    public static c c;
    public static Context d;
    public boolean e = false;
    public a f = new a(d);

    public int e() {
        synchronized (this) {
            if (!this.e) {
                return -5;
            }
            a aVar = this.f;
            byte[] bArr = new byte[64];
            j jVar = (j) aVar.c;
            byte[] bArr2 = r.t;
            bArr2[6] = 0;
            bArr2[7] = 16;
            if (jVar.e(bArr2, 64) == 64) {
                int iC = ((j) aVar.c).c(bArr, 64);
                for (int i = 0; i < 64; i++) {
                    byte b2 = bArr[i];
                }
                if (iC == 64) {
                    return 1;
                }
            }
            return -1;
        }
    }

    public int g(byte[] bArr) {
        synchronized (this) {
            if (!this.e) {
                return -5;
            }
            return this.f.n(bArr);
        }
    }

    public int i(byte[] bArr) {
        synchronized (this) {
            if (!this.e) {
                return -5;
            }
            a aVar = this.f;
            byte[] bArr2 = new byte[64];
            j jVar = (j) aVar.c;
            r.f();
            byte[] bArr3 = r.t;
            bArr3[6] = 0;
            bArr3[7] = 10;
            jVar.e(bArr3, 64);
            ((j) aVar.c).c(bArr2, 64);
            if (bArr2[8] != -1) {
                return -10;
            }
            a aVar2 = this.f;
            byte[] bArr4 = new byte[64];
            j jVar2 = (j) aVar2.c;
            r.f();
            bArr3[6] = 0;
            bArr3[7] = 26;
            jVar2.e(bArr3, 64);
            ((j) aVar2.c).c(bArr4, 64);
            if (bArr4[8] != -1) {
                return -11;
            }
            this.f.m(bArr);
            byte[] bArr5 = new byte[256];
            for (int i = 0; i < 180; i = ((i | 1) << 1) - (i ^ 1)) {
                int i2 = 0;
                while (i2 < 256) {
                    int i3 = i * 256;
                    int i4 = -(-i2);
                    int i5 = ((i3 ^ i4) | (i3 & i4)) << 1;
                    int i6 = ~i4;
                    int i7 = -(((~i3) & i4) | (i3 & i6));
                    int i8 = (i5 & i7) + (i7 | i5);
                    bArr5[i] = bArr[i8];
                    int i9 = -i;
                    int i10 = i9 & 360;
                    int i11 = (i9 ^ 360) | i10;
                    int i12 = (((i10 & i11) + (i11 | i10)) - 1) * 256;
                    int i13 = -i6;
                    int i14 = (-2) - ((((i12 | i13) << 1) - (i13 ^ i12)) ^ (-1));
                    bArr[i8] = bArr[i14];
                    bArr[i14] = bArr5[i];
                    int i15 = ((i2 ^ 1) | (i2 & 1)) << 1;
                    int i16 = -(((~i2) & 1) | (i2 & (-2)));
                    i2 = ((i16 & i15) << 1) + (i15 ^ i16);
                }
            }
            return 1;
        }
    }

    public int j() {
        synchronized (this) {
            if (!this.e) {
                return -5;
            }
            int iQ = this.f.q();
            if (iQ == 1) {
                return 1;
            }
            if (iQ == -9) {
                return iQ;
            }
            return -1;
        }
    }

    public static c c(Context context) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 31;
        int i4 = ((i2 ^ 31) | i3) << 1;
        int i5 = -((i2 | 31) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        d = context;
        if (c == null) {
            c = new c();
            int i8 = a;
            int i9 = ((i8 | 77) << 1) - (i8 ^ 77);
            b = i9 % 128;
            int i10 = i9 % 2;
        }
        Objects.toString(c);
        c cVar = c;
        int i11 = b;
        int i12 = i11 & 33;
        int i13 = i12 + ((i11 ^ 33) | i12);
        a = i13 % 128;
        if (i13 % 2 != 0) {
            return cVar;
        }
        throw null;
    }

    public int d() {
        j jVar;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-52)) | ((~i2) & 51)) - (~(-(-((i2 & 51) << 1))))) - 1;
        int i4 = i3 % 128;
        b = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (!this.e) {
            int i5 = i4 ^ 27;
            int i6 = (((i4 & 27) | i5) << 1) - i5;
            int i7 = i6 % 128;
            a = i7;
            int i8 = i6 % 2 == 0 ? 32 : -5;
            int i9 = i7 & 5;
            int i10 = -(-((i7 ^ 5) | i9));
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            b = i11 % 128;
            if (i11 % 2 == 0) {
                return i8;
            }
            obj.hashCode();
            throw null;
        }
        a aVar = this.f;
        j jVar2 = (j) aVar.c;
        int i12 = b;
        int i13 = ((i12 ^ 102) + ((i12 & 102) << 1)) - 1;
        a = i13 % 128;
        if (i13 % 2 == 0) {
            jVar2.i.close();
            jVar = (j) aVar.c;
            int i14 = 69 / 0;
        } else {
            jVar2.i.close();
            jVar = (j) aVar.c;
        }
        jVar.e = null;
        this.e = false;
        int i15 = a;
        int i16 = ((i15 | 85) << 1) - (i15 ^ 85);
        b = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 65 / 0;
        }
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x013f  */
    /* JADX WARN: Code duplicated, block: B:25:0x015f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0163  */
    /* JADX WARN: Code duplicated, block: B:29:0x0175  */
    /* JADX WARN: Code duplicated, block: B:48:0x0262 A[PHI: r2
  0x0262: PHI (r2v10 byte[]) = (r2v9 byte[]), (r2v17 byte[]) binds: [B:47:0x0260, B:44:0x0254] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0272  */
    /* JADX WARN: Code duplicated, block: B:86:0x0292 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0281 A[SYNTHETIC] */
    public int h() {
        int i;
        byte b2;
        byte[] bArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = a;
        int i9 = ((i8 ^ 72) + ((i8 & 72) << 1)) - 1;
        b = i9 % 128;
        if (i9 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        a aVar = this.f;
        j jVar = (j) aVar.c;
        if (jVar.e != null) {
            int i10 = a;
            int i11 = i10 ^ 107;
            int i12 = (i10 & 107) << 1;
            int i13 = (i11 & i12) + (i12 | i11);
            b = i13 % 128;
            int i14 = i13 % 2;
            UsbManager usbManager = (UsbManager) jVar.h.getSystemService("usb");
            int i15 = b;
            int i16 = ((i15 ^ 5) | (i15 & 5)) << 1;
            int i17 = -(((~i15) & 5) | (i15 & (-6)));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            a = i18 % 128;
            int i19 = i18 % 2;
            jVar.d = usbManager;
            UsbDevice usbDevice = jVar.e;
            int i20 = a;
            int i21 = i20 & 17;
            int i22 = (((i20 | 17) & (~i21)) - (~(-(-(i21 << 1))))) - 1;
            b = i22 % 128;
            int i23 = i22 % 2;
            if (usbManager.hasPermission(usbDevice)) {
                j jVar2 = (j) aVar.c;
                Context context = jVar2.h;
                int i24 = a;
                int i25 = i24 & 1;
                int i26 = (i24 | 1) & (~i25);
                int i27 = -(-(i25 << 1));
                int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
                b = i28 % 128;
                int i29 = i28 % 2;
                jVar2.d = (UsbManager) context.getSystemService("usb");
                UsbDevice usbDevice2 = jVar2.e;
                int i30 = a;
                int i31 = (i30 ^ 85) + ((i30 & 85) << 1);
                b = i31 % 128;
                int i32 = i31 % 2;
                UsbInterface usbInterface = usbDevice2.getInterface(0);
                jVar2.g = usbInterface.getEndpoint(1);
                int i33 = b;
                int i34 = (i33 & 27) + (i33 | 27);
                a = i34 % 128;
                int i35 = i34 % 2;
                jVar2.f = usbInterface.getEndpoint(0);
                UsbDeviceConnection usbDeviceConnection = jVar2.i;
                int i36 = b;
                int i37 = i36 & 7;
                int i38 = ((i36 ^ 7) | i37) << 1;
                int i39 = -((i36 | 7) & (~i37));
                int i40 = (i38 & i39) + (i39 | i38);
                int i41 = i40 % 128;
                a = i41;
                int i42 = i40 % 2;
                if (usbDeviceConnection != null) {
                    int i43 = i41 ^ 5;
                    int i44 = (i41 & 5) << 1;
                    int i45 = (i43 & i44) + (i44 | i43);
                    b = i45 % 128;
                    int i46 = i45 % 2;
                    usbDeviceConnection.close();
                    int i47 = b;
                    int i48 = i47 & 125;
                    int i49 = (i47 ^ 125) | i48;
                    int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
                    a = i50 % 128;
                    int i51 = i50 % 2;
                }
                UsbDeviceConnection usbDeviceConnectionOpenDevice = jVar2.d.openDevice(jVar2.e);
                int i52 = a;
                int i53 = (-2) - ((((i52 | 4) << 1) - (i52 ^ 4)) ^ (-1));
                b = i53 % 128;
                if (i53 % 2 != 0) {
                    jVar2.i = usbDeviceConnectionOpenDevice;
                    if (!usbDeviceConnectionOpenDevice.claimInterface(usbInterface, false)) {
                        int i54 = b;
                        int i55 = (i54 & 32) + (i54 | 32);
                        i = (i55 ^ (-1)) + (i55 << 1);
                        a = i % 128;
                        if (i % 2 == 0) {
                            int i56 = 2 % 4;
                        }
                        b2 = -1;
                    } else {
                        int i57 = b + 87;
                        int i58 = i57 % 128;
                        a = i58;
                        int i59 = i57 % 2;
                        i6 = ((((i58 ^ 21) | (i58 & 21)) << 1) - (~(-(((~i58) & 21) | (i58 & (-22)))))) - 1;
                        b = i6 % 128;
                        if (i6 % 2 != 0) {
                            int i60 = 2 % 5;
                        }
                        b2 = 1;
                    }
                } else {
                    jVar2.i = usbDeviceConnectionOpenDevice;
                    if (!usbDeviceConnectionOpenDevice.claimInterface(usbInterface, true)) {
                        int i510 = b;
                        int i511 = (i510 & 32) + (i510 | 32);
                        i = (i511 ^ (-1)) + (i511 << 1);
                        a = i % 128;
                        if (i % 2 == 0) {
                            int i512 = 2 % 4;
                        }
                        b2 = -1;
                    } else {
                        int i513 = b + 87;
                        int i514 = i513 % 128;
                        a = i514;
                        int i515 = i513 % 2;
                        i6 = ((((i514 ^ 21) | (i514 & 21)) << 1) - (~(-(((~i514) & 21) | (i514 & (-22)))))) - 1;
                        b = i6 % 128;
                        if (i6 % 2 != 0) {
                            int i61 = 2 % 5;
                        }
                        b2 = 1;
                    }
                }
            } else {
                int i62 = b;
                int i63 = i62 ^ 89;
                int i64 = (((i62 & 89) | i63) << 1) - i63;
                a = i64 % 128;
                b2 = i64 % 2 == 0 ? (byte) 20 : (byte) -2;
            }
        } else {
            int i516 = b;
            int i517 = (i516 & 32) + (i516 | 32);
            i = (i517 ^ (-1)) + (i517 << 1);
            a = i % 128;
            if (i % 2 == 0) {
                int i518 = 2 % 4;
            }
            b2 = -1;
        }
        if (b2 == -1) {
            int i65 = b;
            int i66 = i65 & 43;
            int i67 = (((i65 | 43) & (~i66)) - (~(i66 << 1))) - 1;
            int i68 = i67 % 128;
            a = i68;
            int i69 = i67 % 2 == 0 ? 46 : -4;
            int i70 = i68 + 99;
            b = i70 % 128;
            int i71 = i70 % 2;
            return i69;
        }
        if (b2 == -2) {
            int i72 = b;
            int i73 = i72 & 3;
            int i74 = (~i73) & (i72 | 3);
            int i75 = i73 << 1;
            int i76 = (i74 & i75) + (i75 | i74);
            a = i76 % 128;
            int i77 = i76 % 2;
            int i78 = i72 & 67;
            int i79 = -(-((i72 ^ 67) | i78));
            int i80 = (i78 & i79) + (i79 | i78);
            a = i80 % 128;
            int i81 = i80 % 2;
            return -12;
        }
        a aVar2 = this.f;
        byte[] bArr2 = new byte[64];
        j jVar3 = (j) aVar2.c;
        int i82 = b;
        int i83 = ((i82 & 81) - (~(i82 | 81))) - 1;
        a = i83 % 128;
        int i84 = i83 % 2;
        Objects.requireNonNull(jVar3);
        UsbDeviceConnection usbDeviceConnection2 = jVar3.i;
        byte[] bArr3 = j.c;
        int i85 = b;
        int i86 = i85 & 33;
        int i87 = -(-((i85 ^ 33) | i86));
        int i88 = ((i86 | i87) << 1) - (i86 ^ i87);
        a = i88 % 128;
        int i89 = i88 % 2;
        int length = bArr3.length;
        int i90 = i85 & 43;
        int i91 = (i85 ^ 43) | i90;
        int i92 = (i90 ^ i91) + ((i91 & i90) << 1);
        a = i92 % 128;
        int i93 = i92 % 2;
        usbDeviceConnection2.controlTransfer(65, 6, 9472, 0, bArr3, length, 100);
        j jVar4 = (j) aVar2.c;
        Objects.requireNonNull(jVar4);
        int i94 = b;
        int i95 = i94 | 29;
        int i96 = i95 << 1;
        int i97 = -((~(i94 & 29)) & i95);
        int i98 = (i96 & i97) + (i97 | i96);
        a = i98 % 128;
        int i99 = i98 % 2;
        UsbDeviceConnection usbDeviceConnection3 = jVar4.i;
        int i100 = b;
        int i101 = ((i100 | 109) << 1) - (i100 ^ 109);
        a = i101 % 128;
        if (i101 % 2 == 0) {
            bArr = bArr2;
            if (usbDeviceConnection3.controlTransfer(129, 6, 9216, 0, bArr2, 33, 52) == -1) {
                int i102 = a + 7;
                b = i102 % 128;
                int i103 = i102 % 2;
                j jVar5 = (j) aVar2.c;
                i2 = 0;
                while (i2 < 64) {
                    int i104 = b;
                    i3 = (i104 ^ 81) + ((i104 & 81) << 1);
                    a = i3 % 128;
                    if (i3 % 2 == 0) {
                        r.t[i2] = -1;
                        int i105 = i2 & 86;
                        i2 = (((i2 | 86) & (~i105)) - (~(-(-(i105 << 1))))) - 1;
                    } else {
                        r.t[i2] = -1;
                        int i106 = i2 + 5;
                        i2 = ((((i106 ^ (-4)) | (i106 & (-4))) << 1) - (~(-(((~i106) & (-4)) | (i106 & 3))))) - 1;
                    }
                }
                jVar5.d(r.t, 64);
                int i107 = b;
                int i108 = (i107 ^ 21) + ((i107 & 21) << 1);
                a = i108 % 128;
                int i109 = i108 % 2;
                j jVar6 = (j) aVar2.c;
                Objects.requireNonNull(jVar6);
                int i110 = a;
                int i111 = ((i110 & (-34)) | ((~i110) & 33)) + ((i110 & 33) << 1);
                b = i111 % 128;
                int i112 = i111 % 2;
                UsbDeviceConnection usbDeviceConnection4 = jVar6.i;
                UsbEndpoint usbEndpoint = jVar6.f;
                int i113 = (-2) - ((a + 30) ^ (-1));
                b = i113 % 128;
                int i114 = i113 % 2;
                usbDeviceConnection4.bulkTransfer(usbEndpoint, bArr, 64, 18000);
                int i115 = b;
                int i116 = i115 ^ 81;
                int i117 = -(-((i115 & 81) << 1));
                int i118 = (i116 & i117) + (i117 | i116);
                a = i118 % 128;
                int i119 = i118 % 2;
            }
        } else {
            bArr = bArr2;
            if (usbDeviceConnection3.controlTransfer(129, 6, 9216, 0, bArr2, 64, 100) == -1) {
                int i1010 = a + 7;
                b = i1010 % 128;
                int i1011 = i1010 % 2;
                j jVar7 = (j) aVar2.c;
                i2 = 0;
                while (i2 < 64) {
                    int i1012 = b;
                    i3 = (i1012 ^ 81) + ((i1012 & 81) << 1);
                    a = i3 % 128;
                    if (i3 % 2 == 0) {
                        r.t[i2] = -1;
                        int i1013 = i2 & 86;
                        i2 = (((i2 | 86) & (~i1013)) - (~(-(-(i1013 << 1))))) - 1;
                    } else {
                        r.t[i2] = -1;
                        int i1014 = i2 + 5;
                        i2 = ((((i1014 ^ (-4)) | (i1014 & (-4))) << 1) - (~(-(((~i1014) & (-4)) | (i1014 & 3))))) - 1;
                    }
                }
                jVar7.d(r.t, 64);
                int i1015 = b;
                int i1016 = (i1015 ^ 21) + ((i1015 & 21) << 1);
                a = i1016 % 128;
                int i1017 = i1016 % 2;
                j jVar8 = (j) aVar2.c;
                Objects.requireNonNull(jVar8);
                int i1110 = a;
                int i1111 = ((i1110 & (-34)) | ((~i1110) & 33)) + ((i1110 & 33) << 1);
                b = i1111 % 128;
                int i1112 = i1111 % 2;
                UsbDeviceConnection usbDeviceConnection5 = jVar8.i;
                UsbEndpoint usbEndpoint2 = jVar8.f;
                int i1113 = (-2) - ((a + 30) ^ (-1));
                b = i1113 % 128;
                int i1114 = i1113 % 2;
                usbDeviceConnection5.bulkTransfer(usbEndpoint2, bArr, 64, 18000);
                int i1115 = b;
                int i1116 = i1115 ^ 81;
                int i1117 = -(-((i1115 & 81) << 1));
                int i1118 = (i1116 & i1117) + (i1117 | i1116);
                a = i1118 % 128;
                int i1119 = i1118 % 2;
            }
        }
        int i120 = a;
        int i121 = (((i120 | 32) << 1) - (i120 ^ 32)) - 1;
        b = i121 % 128;
        int i122 = i121 % 2;
        int i123 = 0;
        while (i123 < 6) {
            int i124 = b;
            int i125 = ((i124 | 37) << 1) - (i124 ^ 37);
            a = i125 % 128;
            if (i125 % 2 == 0) {
                r.t[i123] = bArr[i123];
                int i126 = i123 & 107;
                int i127 = ((i123 ^ 107) | i126) << 1;
                int i128 = -((i123 | 107) & (~i126));
                i123 = (i127 & i128) + (i128 | i127);
            } else {
                r.t[i123] = bArr[i123];
                i123 = (-2) - (((i123 ^ 2) + ((i123 & 2) << 1)) ^ (-1));
            }
        }
        int i129 = 0;
        while (i129 < 64) {
            int i130 = b;
            int i131 = (i130 & 89) + (i130 | 89);
            a = i131 % 128;
            if (i131 % 2 == 0) {
                byte b3 = bArr[i129];
                int i132 = (i129 ^ (-9)) + ((i129 & (-9)) << 1);
                i4 = i132 & 66;
                i5 = i132 | 66;
            } else {
                byte b4 = bArr[i129];
                int i133 = ((i129 | (-36)) << 1) - (i129 ^ (-36));
                i4 = i133 & 37;
                i5 = i133 | 37;
            }
            i129 = i4 + i5;
        }
        this.e = true;
        int i134 = a;
        int i135 = (((i134 | 121) << 1) - (~(-(i134 ^ 121)))) - 1;
        b = i135 % 128;
        if (i135 % 2 == 0) {
            return 1;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:19:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:21:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:24:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:26:0x00da  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0079 A[SYNTHETIC] */
    public int f() {
        UsbManager usbManager;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 13) + ((i3 & 13) << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        a aVar = this.f;
        j jVar = (j) aVar.c;
        int i6 = b;
        int i7 = (i6 & 73) + (i6 | 73);
        a = i7 % 128;
        Object obj = null;
        if (i7 % 2 == 0) {
            jVar.e = null;
            Context context = jVar.h;
            obj.hashCode();
            throw null;
        }
        jVar.e = null;
        Context context2 = jVar.h;
        int i8 = b;
        int i9 = (i8 & 1) + (i8 | 1);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            ((UsbManager) context2.getSystemService("usb")).getDeviceList().values().iterator();
            obj.hashCode();
            throw null;
        }
        Iterator<UsbDevice> it = ((UsbManager) context2.getSystemService("usb")).getDeviceList().values().iterator();
        int i10 = a;
        int i11 = ((i10 ^ 61) | (i10 & 61)) << 1;
        int i12 = -(((~i10) & 61) | (i10 & (-62)));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = i13 % 128;
        b = i14;
        int i15 = i13 % 2;
        int i16 = i14 & 109;
        int i17 = (i14 ^ 109) | i16;
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        a = i18 % 128;
        if (i18 % 2 == 0) {
            int i19 = 5 / 4;
        }
        while (!(!it.hasNext())) {
            int i20 = b;
            int i21 = ((i20 & (-68)) | ((~i20) & 67)) + ((i20 & 67) << 1);
            a = i21 % 128;
            if (i21 % 2 == 0) {
                it.next().getVendorId();
                throw null;
            }
            UsbDevice next = it.next();
            int vendorId = next.getVendorId();
            int productId = next.getProductId();
            if (vendorId == 10015) {
                int i22 = a;
                int i23 = i22 & 83;
                int i24 = ((i22 | 83) & (~i23)) + (i23 << 1);
                b = i24 % 128;
                int i25 = i24 % 2;
                if (productId != 3075) {
                    if (vendorId == 1921) {
                        int i26 = b;
                        int i27 = (i26 & (-84)) | ((~i26) & 83);
                        int i28 = (i26 & 83) << 1;
                        i = (i27 & i28) + (i28 | i27);
                        a = i % 128;
                        if (i % 2 == 0) {
                            if (productId != 19310) {
                                if (vendorId == 11576) {
                                    int i29 = b;
                                    int i30 = i29 & 47;
                                    int i31 = ((i29 ^ 47) | i30) << 1;
                                    int i32 = -((i29 | 47) & (~i30));
                                    int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                                    a = i33 % 128;
                                    int i34 = i33 % 2;
                                    if (productId == 2010) {
                                    }
                                }
                            }
                        } else if (productId != 21904) {
                            if (vendorId == 11576) {
                                int i210 = b;
                                int i35 = i210 & 47;
                                int i36 = ((i210 ^ 47) | i35) << 1;
                                int i37 = -((i210 | 47) & (~i35));
                                int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                                a = i38 % 128;
                                int i39 = i38 % 2;
                                if (productId == 2010) {
                                }
                            }
                        }
                    } else if (vendorId == 11576) {
                        int i211 = b;
                        int i310 = i211 & 47;
                        int i311 = ((i211 ^ 47) | i310) << 1;
                        int i312 = -((i211 | 47) & (~i310));
                        int i313 = (i311 ^ i312) + ((i312 & i311) << 1);
                        a = i313 % 128;
                        int i314 = i313 % 2;
                        if (productId == 2010) {
                        }
                    }
                }
                ((j) aVar.c).e = next;
                int i40 = b + 79;
                a = i40 % 128;
                int i41 = i40 % 2;
            } else if (vendorId == 1921) {
                int i212 = b;
                int i213 = (i212 & (-84)) | ((~i212) & 83);
                int i214 = (i212 & 83) << 1;
                i = (i213 & i214) + (i214 | i213);
                a = i % 128;
                if (i % 2 == 0) {
                    if (productId != 19310) {
                        if (vendorId == 11576) {
                            int i215 = b;
                            int i315 = i215 & 47;
                            int i316 = ((i215 ^ 47) | i315) << 1;
                            int i317 = -((i215 | 47) & (~i315));
                            int i318 = (i316 ^ i317) + ((i317 & i316) << 1);
                            a = i318 % 128;
                            int i319 = i318 % 2;
                            if (productId == 2010) {
                            }
                        }
                    }
                } else if (productId != 21904) {
                    if (vendorId == 11576) {
                        int i216 = b;
                        int i3110 = i216 & 47;
                        int i3111 = ((i216 ^ 47) | i3110) << 1;
                        int i3112 = -((i216 | 47) & (~i3110));
                        int i3113 = (i3111 ^ i3112) + ((i3112 & i3111) << 1);
                        a = i3113 % 128;
                        int i3114 = i3113 % 2;
                        if (productId == 2010) {
                        }
                    }
                }
                ((j) aVar.c).e = next;
                int i42 = b + 79;
                a = i42 % 128;
                int i43 = i42 % 2;
            } else if (vendorId == 11576) {
                int i217 = b;
                int i3115 = i217 & 47;
                int i3116 = ((i217 ^ 47) | i3115) << 1;
                int i3117 = -((i217 | 47) & (~i3115));
                int i3118 = (i3116 ^ i3117) + ((i3117 & i3116) << 1);
                a = i3118 % 128;
                int i3119 = i3118 % 2;
                if (productId == 2010) {
                    ((j) aVar.c).e = next;
                    int i44 = b + 79;
                    a = i44 % 128;
                    int i45 = i44 % 2;
                }
            }
        }
        if (((j) aVar.c).e == null) {
            int i46 = a;
            int i47 = i46 ^ 37;
            int i48 = (((i46 & 37) | i47) << 1) - i47;
            b = i48 % 128;
            int i49 = i48 % 2;
            return -4;
        }
        int i50 = a;
        int i51 = ((i50 & (-32)) | ((~i50) & 31)) + ((i50 & 31) << 1);
        b = i51 % 128;
        int i52 = i51 % 2;
        a aVar2 = this.f;
        j jVar2 = (j) aVar2.c;
        int i53 = a + 97;
        b = i53 % 128;
        if (i53 % 2 != 0) {
            usbManager = (UsbManager) jVar2.h.getSystemService("usb");
            int i54 = 40 / 0;
        } else {
            usbManager = (UsbManager) jVar2.h.getSystemService("usb");
        }
        jVar2.d = usbManager;
        if (!usbManager.hasPermission(jVar2.e)) {
            int i55 = b + 13;
            a = i55 % 128;
            int i56 = i55 % 2;
            j jVar3 = (j) aVar2.c;
            UsbManager usbManager2 = jVar3.d;
            int i57 = b;
            int i58 = (i57 ^ 25) + ((i57 & 25) << 1);
            a = i58 % 128;
            int i59 = i58 % 2;
            usbManager2.requestPermission(jVar3.e, jVar3.j);
            if (i59 == 0) {
                int i60 = 44 / 0;
            }
        }
        int i61 = b;
        int i62 = ((i61 | 47) << 1) - (i61 ^ 47);
        a = i62 % 128;
        int i63 = i62 % 2;
        return 1;
    }
}
