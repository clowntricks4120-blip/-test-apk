package ivas.gov.bisp.enumeration.bM;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.b;
import androidx.emoji2.text.c;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class am implements KeyListener {
    private static int a = 1;
    private static int b;
    public final KeyListener c;
    public final bxO d;

    public static class bxO {
    }

    public am(KeyListener keyListener) {
        bxO bxo = new bxO();
        this.c = keyListener;
        this.d = bxo;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 111;
        int i5 = -(-(i3 | 111));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        this.c.clearMetaKeyState(view, editable, i);
        if (i7 == 0) {
            int i8 = 6 / 0;
        }
        int i9 = a;
        int i10 = (i9 & 80) + (i9 | 80);
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        b = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 87;
        int i4 = (i3 - (~((i2 ^ 87) | i3))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        int inputType = this.c.getInputType();
        int i6 = a + 8;
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        return inputType;
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 119) + ((i2 & 119) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        boolean zOnKeyOther = this.c.onKeyOther(view, editable, keyEvent);
        int i5 = a;
        int i6 = (i5 & (-126)) | ((~i5) & 125);
        int i7 = -(-((i5 & 125) << 1));
        int i8 = (i6 & i7) + (i7 | i6);
        b = i8 % 128;
        int i9 = i8 % 2;
        return zOnKeyOther;
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 & 96) + (i3 | 96)) - 1;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            return this.c.onKeyUp(view, editable, i, keyEvent);
        }
        boolean zOnKeyUp = this.c.onKeyUp(view, editable, i, keyEvent);
        int i5 = 75 / 0;
        return zOnKeyUp;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0099  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ca  */
    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean zB;
        KeyListener keyListener;
        int i2;
        boolean zOnKeyDown;
        int i3 = 2 % 2;
        int i4 = a + 73;
        b = i4 % 128;
        int i5 = i4 % 2;
        Objects.requireNonNull(this.d);
        Object obj = b.a;
        boolean z = false;
        if (i != 67) {
            int i6 = a;
            int i7 = (((i6 | 44) << 1) - (i6 ^ 44)) - 1;
            int i8 = i7 % 128;
            b = i8;
            if (i7 % 2 == 0 ? i == 112 : i == 112) {
                zB = c.b(editable, keyEvent, true);
                int i9 = b;
                int i10 = ((i9 | 89) << 1) - (i9 ^ 89);
                a = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 3 / 2;
                }
            } else {
                int i12 = ((((i8 ^ 97) | (i8 & 97)) << 1) - (~(-(((~i8) & 97) | (i8 & (-98)))))) - 1;
                a = i12 % 128;
                int i13 = i12 % 2;
            }
            int i14 = a;
            int i15 = (i14 ^ 73) + ((i14 & 73) << 1);
            int i16 = i15 % 128;
            b = i16;
            int i17 = i15 % 2;
            int i18 = (((i16 | 44) << 1) - (i16 ^ 44)) - 1;
            int i19 = i18 % 128;
            a = i19;
            int i20 = i18 % 2;
            keyListener = this.c;
            i2 = i19 + 105;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                zOnKeyDown = keyListener.onKeyDown(view, editable, i, keyEvent);
                int i21 = 94 / 0;
                if (zOnKeyDown) {
                    int i22 = b;
                    int i23 = i22 & 59;
                    int i24 = (i22 | 59) & (~i23);
                    int i25 = i23 << 1;
                    int i26 = (i24 & i25) + (i24 | i25);
                    a = i26 % 128;
                    int i27 = i26 % 2;
                    z = true;
                }
            } else if (keyListener.onKeyDown(view, editable, i, keyEvent)) {
                int i28 = b;
                int i29 = i28 & 59;
                int i210 = (i28 | 59) & (~i29);
                int i211 = i29 << 1;
                int i212 = (i210 & i211) + (i210 | i211);
                a = i212 % 128;
                int i213 = i212 % 2;
                z = true;
            }
            int i30 = b + 20;
            int i31 = (i30 ^ (-1)) + (i30 << 1);
            a = i31 % 128;
            int i32 = i31 % 2;
            return z;
        }
        zB = c.b(editable, keyEvent, false);
        int i33 = a;
        int i34 = i33 ^ 115;
        int i35 = ((((i33 & 115) | i34) << 1) - (~(-i34))) - 1;
        b = i35 % 128;
        int i36 = i35 % 2;
        if (!zB) {
            int i110 = a;
            int i111 = (i110 ^ 73) + ((i110 & 73) << 1);
            int i112 = i111 % 128;
            b = i112;
            int i113 = i111 % 2;
            int i114 = (((i112 | 44) << 1) - (i112 ^ 44)) - 1;
            int i115 = i114 % 128;
            a = i115;
            int i214 = i114 % 2;
            keyListener = this.c;
            i2 = i115 + 105;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                zOnKeyDown = keyListener.onKeyDown(view, editable, i, keyEvent);
                int i215 = 94 / 0;
                if (zOnKeyDown) {
                }
            } else if (keyListener.onKeyDown(view, editable, i, keyEvent)) {
            }
            int i37 = b + 20;
            int i38 = (i37 ^ (-1)) + (i37 << 1);
            a = i38 % 128;
            int i39 = i38 % 2;
            return z;
        }
        int i40 = b;
        int i41 = i40 ^ 79;
        int i42 = (i40 & 79) << 1;
        int i43 = (i41 & i42) + (i42 | i41);
        a = i43 % 128;
        int i44 = i43 % 2;
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        int i45 = b + 102;
        int i46 = (i45 ^ (-1)) + (i45 << 1);
        a = i46 % 128;
        int i47 = i46 % 2;
        int i216 = b;
        int i217 = i216 & 59;
        int i218 = (i216 | 59) & (~i217);
        int i219 = i217 << 1;
        int i2110 = (i218 & i219) + (i218 | i219);
        a = i2110 % 128;
        int i2111 = i2110 % 2;
        z = true;
        int i310 = b + 20;
        int i311 = (i310 ^ (-1)) + (i310 << 1);
        a = i311 % 128;
        int i312 = i311 % 2;
        return z;
    }
}
