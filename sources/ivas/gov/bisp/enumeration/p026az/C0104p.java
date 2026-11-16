package ivas.gov.bisp.enumeration.p026az;

import android.content.Context;
import android.content.DialogInterface;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.az.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0104p {
    private static int a = 0;
    private static int b = 1;
    public static C0104p c;

    public static C0104p c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 41;
        int i4 = ((i2 & 41) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
        if (c == null) {
            c = new C0104p();
            int i7 = a;
            int i8 = i7 & 35;
            int i9 = (((i7 ^ 35) | i8) << 1) - ((i7 | 35) & (~i8));
            b = i9 % 128;
            int i10 = i9 % 2;
        }
        C0104p c0104p = c;
        int i11 = b;
        int i12 = i11 & 39;
        int i13 = -(-((i11 ^ 39) | i12));
        int i14 = (i12 & i13) + (i13 | i12);
        a = i14 % 128;
        int i15 = i14 % 2;
        return c0104p;
    }

    public void d(Context context, String str, String str2, DialogInterface.OnClickListener onClickListener, boolean z) {
        int i = 2 % 2;
        try {
            b.aIz aiz = new b.aIz(context);
            int i2 = a;
            int i3 = i2 & 41;
            int i4 = (i2 ^ 41) | i3;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            Object obj = null;
            if (i5 % 2 == 0) {
                aiz.b().setCancelable(z);
                throw null;
            }
            b bVarB = aiz.b();
            bVarB.setCancelable(z);
            int i6 = b;
            int i7 = i6 & 77;
            int i8 = -(-((i6 ^ 77) | i7));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            a = i9 % 128;
            if (i9 % 2 != 0) {
                bVarB.setTitle(str);
                AlertController alertController = bVarB.a;
                throw null;
            }
            bVarB.setTitle(str);
            AlertController alertController2 = bVarB.a;
            alertController2.f = str2;
            TextView textView = alertController2.H;
            if (textView != null) {
                int i10 = b + 29;
                a = i10 % 128;
                if (i10 % 2 != 0) {
                    textView.setText(str2);
                    int i11 = 12 / 0;
                } else {
                    textView.setText(str2);
                }
                int i12 = b;
                int i13 = i12 & 109;
                int i14 = -(-((i12 ^ 109) | i13));
                int i15 = (i13 & i14) + (i14 | i13);
                a = i15 % 128;
                int i16 = i15 % 2;
            }
            bVarB.setCanceledOnTouchOutside(z);
            int i17 = b;
            int i18 = (i17 | 15) << 1;
            int i19 = -(((~i17) & 15) | (i17 & (-16)));
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            a = i20 % 128;
            int i21 = i20 % 2;
            bVarB.i(-1, "Ok", onClickListener);
            bVarB.show();
            int i22 = a + 91;
            b = i22 % 128;
            if (i22 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    public void f(Context context, String str, String str2, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        int i = 2 % 2;
        try {
            b bVarB = new b.aIz(context).b();
            int i2 = a + 37;
            b = i2 % 128;
            if (i2 % 2 == 0) {
                bVarB.setCancelable(true);
            } else {
                bVarB.setCancelable(false);
            }
            bVarB.setTitle(str);
            AlertController alertController = bVarB.a;
            int i3 = a;
            int i4 = ((i3 & (-84)) | ((~i3) & 83)) + ((i3 & 83) << 1);
            b = i4 % 128;
            if (i4 % 2 == 0) {
                alertController.f = str2;
                TextView textView = alertController.H;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            alertController.f = str2;
            TextView textView2 = alertController.H;
            if (textView2 != null) {
                int i5 = b;
                int i6 = i5 & 53;
                int i7 = -(-((i5 ^ 53) | i6));
                int i8 = (i6 & i7) + (i7 | i6);
                a = i8 % 128;
                int i9 = i8 % 2;
                textView2.setText(str2);
                int i10 = b;
                int i11 = (((i10 | 74) << 1) - (i10 ^ 74)) - 1;
                a = i11 % 128;
                int i12 = i11 % 2;
            }
            bVarB.setCanceledOnTouchOutside(false);
            bVarB.i(-1, "OK", onClickListener);
            int i13 = b;
            int i14 = (i13 & (-30)) | ((~i13) & 29);
            int i15 = -(-((i13 & 29) << 1));
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            a = i16 % 128;
            if (i16 % 2 != 0) {
                bVarB.i(-2, "Sync", onClickListener2);
                bVarB.show();
                int i17 = 63 / 0;
            } else {
                bVarB.i(-2, "Sync", onClickListener2);
                bVarB.show();
            }
            int i18 = a;
            int i19 = i18 & 47;
            int i20 = ((i18 | 47) & (~i19)) + (i19 << 1);
            b = i20 % 128;
            int i21 = i20 % 2;
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    public void g(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnClickListener onClickListener3, boolean z) {
        int i = 2 % 2;
        try {
            b.aIz aiz = new b.aIz(context);
            int i2 = a;
            int i3 = i2 ^ 1;
            int i4 = (i2 & 1) << 1;
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            Object obj = null;
            if (i5 % 2 == 0) {
                aiz.b().setCancelable(z);
                obj.hashCode();
                throw null;
            }
            b bVarB = aiz.b();
            bVarB.setCancelable(z);
            bVarB.setTitle(str);
            AlertController alertController = bVarB.a;
            int i6 = b;
            int i7 = (((i6 | 84) << 1) - (i6 ^ 84)) - 1;
            a = i7 % 128;
            int i8 = i7 % 2;
            alertController.f = str2;
            TextView textView = alertController.H;
            if (textView != null) {
                int i9 = b;
                int i10 = i9 & 55;
                int i11 = ((i9 | 55) & (~i10)) + (i10 << 1);
                a = i11 % 128;
                if (i11 % 2 != 0) {
                    textView.setText(str2);
                    int i12 = 12 / 0;
                } else {
                    textView.setText(str2);
                }
                int i13 = b;
                int i14 = i13 & 41;
                int i15 = ((i13 ^ 41) | i14) << 1;
                int i16 = -((i13 | 41) & (~i14));
                int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                a = i17 % 128;
                int i18 = i17 % 2;
            }
            bVarB.setCanceledOnTouchOutside(z);
            int i19 = a;
            int i20 = (i19 & (-66)) | ((~i19) & 65);
            int i21 = (i19 & 65) << 1;
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            b = i22 % 128;
            if (i22 % 2 == 0) {
                bVarB.i(-1, "Yes", onClickListener);
                bVarB.i(33, "No", null);
            } else {
                bVarB.i(-1, "Yes", onClickListener);
                bVarB.i(-2, "No", null);
            }
            bVarB.i(-3, str3, onClickListener3);
            int i23 = b;
            int i24 = ((i23 ^ 45) | (i23 & 45)) << 1;
            int i25 = -(((~i23) & 45) | (i23 & (-46)));
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            a = i26 % 128;
            int i27 = i26 % 2;
            bVarB.show();
            int i28 = a;
            int i29 = ((i28 & 75) - (~(i28 | 75))) - 1;
            b = i29 % 128;
            if (i29 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    public void h(Context context, String str, String str2, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, boolean z) {
        int i = 2 % 2;
        try {
            b.aIz aiz = new b.aIz(context);
            int i2 = b;
            int i3 = i2 ^ 51;
            int i4 = (((i2 & 51) | i3) << 1) - i3;
            a = i4 % 128;
            int i5 = i4 % 2;
            b bVarB = aiz.b();
            bVarB.setCancelable(z);
            int i6 = a - (-1);
            b = i6 % 128;
            Object obj = null;
            if (i6 % 2 == 0) {
                bVarB.setTitle(str);
                bVarB.a.f = str2;
                obj.hashCode();
                throw null;
            }
            bVarB.setTitle(str);
            AlertController alertController = bVarB.a;
            alertController.f = str2;
            TextView textView = alertController.H;
            if (textView != null) {
                int i7 = a;
                int i8 = i7 | 121;
                int i9 = (i8 << 1) - ((~(i7 & 121)) & i8);
                b = i9 % 128;
                if (i9 % 2 == 0) {
                    textView.setText(str2);
                    int i10 = 5 / 0;
                } else {
                    textView.setText(str2);
                }
            }
            bVarB.setCanceledOnTouchOutside(z);
            bVarB.i(-1, "Yes", onClickListener);
            int i11 = a + 87;
            b = i11 % 128;
            int i12 = i11 % 2;
            bVarB.i(-2, "No", onClickListener2);
            bVarB.show();
            int i13 = b;
            int i14 = (i13 & 91) + (i13 | 91);
            a = i14 % 128;
            if (i14 % 2 != 0) {
                throw null;
            }
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    public void e(Context context, String str, String str2, DialogInterface.OnClickListener onClickListener, boolean z) {
        int i = 2 % 2;
        try {
            b bVarB = new b.aIz(context).b();
            int i2 = b;
            int i3 = i2 & 83;
            int i4 = (i3 - (~(-(-((i2 ^ 83) | i3))))) - 1;
            a = i4 % 128;
            if (i4 % 2 != 0) {
                bVarB.setCancelable(z);
                bVarB.setTitle(str);
                try {
                    throw null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            bVarB.setCancelable(z);
            bVarB.setTitle(str);
            AlertController alertController = bVarB.a;
            alertController.f = str2;
            TextView textView = alertController.H;
            int i5 = b;
            int i6 = i5 & 49;
            int i7 = ((((i5 ^ 49) | i6) << 1) - (~(-((i5 | 49) & (~i6))))) - 1;
            int i8 = i7 % 128;
            a = i8;
            int i9 = i7 % 2;
            if (textView != null) {
                int i10 = (i8 & (-34)) | ((~i8) & 33);
                int i11 = (i8 & 33) << 1;
                int i12 = (i10 & i11) + (i11 | i10);
                b = i12 % 128;
                int i13 = i12 % 2;
                textView.setText(str2);
                int i14 = b + 7;
                a = i14 % 128;
                int i15 = i14 % 2;
            }
            bVarB.setCanceledOnTouchOutside(z);
            bVarB.i(-1, "OK", onClickListener);
            int i16 = b;
            int i17 = ((i16 ^ 76) + ((i16 & 76) << 1)) - 1;
            a = i17 % 128;
            if (i17 % 2 == 0) {
                bVarB.show();
            } else {
                bVarB.show();
                int i18 = 52 / 0;
            }
        } catch (WindowManager.BadTokenException unused) {
        }
    }
}
