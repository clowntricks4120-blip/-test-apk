package ivas.gov.bisp.enumeration.p037bj;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbManager;

/* JADX INFO: loaded from: classes.dex */
public class j {
    private static int a = 0;
    private static int b = 1;
    public static byte[] c = new byte[56];
    public UsbManager d;
    public UsbDevice e;
    public UsbEndpoint f;
    public UsbEndpoint g;
    public Context h;
    public UsbDeviceConnection i;
    public PendingIntent j;

    static {
        int i = 1 + 75;
        a = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public j(Context context) {
        this.h = context;
        this.j = PendingIntent.getBroadcast(context, 0, new Intent("permission"), 0);
    }

    public int c(byte[] bArr, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 47) << 1) - (i3 ^ 47);
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        UsbDeviceConnection usbDeviceConnection = this.i;
        int i7 = (-2) - ((((i5 | 78) << 1) - (i5 ^ 78)) ^ (-1));
        a = i7 % 128;
        int i8 = i7 % 2;
        int iControlTransfer = usbDeviceConnection.controlTransfer(129, 6, 9216, 0, bArr, i, 18000);
        int i9 = a;
        int i10 = (i9 & 23) + (i9 | 23);
        b = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 76 / 0;
        }
        return iControlTransfer;
    }

    public int d(byte[] bArr, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 ^ 39) | (i3 & 39)) << 1;
        int i5 = -(((~i3) & 39) | (i3 & (-40)));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        int iBulkTransfer = this.i.bulkTransfer(this.g, bArr, i, 18000);
        int i8 = b + 45;
        a = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 61 / 0;
        }
        return iBulkTransfer;
    }

    public int e(byte[] bArr, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 51;
        a = i4 % 128;
        int i5 = i4 % 2;
        UsbDeviceConnection usbDeviceConnection = this.i;
        int i6 = ((i3 & 118) + (i3 | 118)) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        int iControlTransfer = usbDeviceConnection.controlTransfer(65, 6, 9216, 0, bArr, i, 18000);
        int i8 = a + 115;
        b = i8 % 128;
        int i9 = i8 % 2;
        return iControlTransfer;
    }
}
