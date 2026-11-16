package ivas.gov.bisp.enumeration.bM;

import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.emoji2.text.b;
import ivas.gov.bisp.enumeration.O.r;
import java.util.Objects;
import java.util.concurrent.locks.ReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class L {
    public final bxT a;

    public static class bxT {
        private static int a = 0;
        private static int b = 1;

        public KeyListener c(KeyListener keyListener) {
            int i = 2 % 2;
            int i2 = b + 19;
            a = i2 % 128;
            int i3 = i2 % 2;
            throw null;
        }

        public InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 65) + (i2 | 65);
            b = i3 % 128;
            int i4 = i3 % 2;
            throw null;
        }

        public void e(boolean z) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & (-4)) | ((~i2) & 3);
            int i4 = (i2 & 3) << 1;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            throw null;
        }
    }

    public static class bxU extends bxT {
        private static int a = 1;
        private static int b;
        public final EditText c;
        public final C d;

        public bxU(EditText editText, boolean z) {
            this.c = editText;
            C c = new C(editText, z);
            this.d = c;
            editText.addTextChangedListener(c);
            if (R.d == null) {
                synchronized (R.c) {
                    if (R.d == null) {
                        R.d = new R();
                    }
                }
            }
            editText.setEditableFactory(R.d);
        }

        @Override // ivas.gov.bisp.enumeration.bM.L.bxT
        public KeyListener c(KeyListener keyListener) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 71;
            int i4 = ((i2 ^ 71) | i3) << 1;
            int i5 = -((~i3) & (i2 | 71));
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            int i7 = i6 % 128;
            a = i7;
            int i8 = i6 % 2;
            if (keyListener instanceof am) {
                int i9 = (i2 ^ 41) + ((i2 & 41) << 1);
                a = i9 % 128;
                int i10 = i9 % 2;
                int i11 = ((i2 ^ 47) | (i2 & 47)) << 1;
                int i12 = -(((~i2) & 47) | (i2 & (-48)));
                int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                a = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 31 / 0;
                }
                return keyListener;
            }
            if (keyListener == null) {
                int i15 = i7 + 15;
                b = i15 % 128;
                if (i15 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            am amVar = new am(keyListener);
            int i16 = (-2) - ((b + 54) ^ (-1));
            a = i16 % 128;
            int i17 = i16 % 2;
            return amVar;
        }

        @Override // ivas.gov.bisp.enumeration.bM.L.bxT
        public InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 25) + (i2 | 25);
            int i4 = i3 % 128;
            b = i4;
            int i5 = i3 % 2;
            if (!(inputConnection instanceof C0129v)) {
                C0129v c0129v = new C0129v(this.c, inputConnection, editorInfo);
                int i6 = b;
                int i7 = (-2) - (((i6 & 24) + (i6 | 24)) ^ (-1));
                a = i7 % 128;
                if (i7 % 2 != 0) {
                    return c0129v;
                }
                throw null;
            }
            int i8 = (i4 ^ 103) + ((i4 & 103) << 1);
            int i9 = i8 % 128;
            a = i9;
            int i10 = i8 % 2;
            int i11 = (((i9 ^ 51) | (i9 & 51)) << 1) - (((~i9) & 51) | (i9 & (-52)));
            b = i11 % 128;
            int i12 = i11 % 2;
            return inputConnection;
        }

        @Override // ivas.gov.bisp.enumeration.bM.L.bxT
        public void e(boolean z) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 43) << 1) - (i2 ^ 43);
            a = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                boolean z2 = this.d.f;
                throw null;
            }
            C c = this.d;
            if (c.f != z) {
                int i4 = b;
                int i5 = i4 & 43;
                int i6 = (i4 | 43) & (~i5);
                int i7 = -(-(i5 << 1));
                int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
                a = i8 % 128;
                int i9 = i8 % 2;
                if (c.e != null) {
                    int i10 = a;
                    int i11 = ((i10 & 126) + (i10 | 126)) - 1;
                    b = i11 % 128;
                    if (i11 % 2 != 0) {
                        b bVarC = b.c();
                        b.aKp akp = c.e;
                        Objects.requireNonNull(bVarC);
                        obj.hashCode();
                        throw null;
                    }
                    b bVarC2 = b.c();
                    b.aKp akp2 = c.e;
                    Objects.requireNonNull(bVarC2);
                    r.k(akp2, "initCallback cannot be null");
                    bVarC2.d.writeLock().lock();
                    int i12 = a;
                    int i13 = ((i12 | 61) << 1) - (i12 ^ 61);
                    b = i13 % 128;
                    int i14 = i13 % 2;
                    try {
                        bVarC2.e.remove(akp2);
                        ReadWriteLock readWriteLock = bVarC2.d;
                        int i15 = b;
                        int i16 = (i15 ^ 101) + ((i15 & 101) << 1);
                        a = i16 % 128;
                        int i17 = i16 % 2;
                        readWriteLock.writeLock().unlock();
                        int i18 = b;
                        int i19 = ((i18 | 91) << 1) - (i18 ^ 91);
                        a = i19 % 128;
                        int i20 = i19 % 2;
                    } catch (Throwable th) {
                        bVarC2.d.writeLock().unlock();
                        throw th;
                    }
                }
                c.f = z;
                if (z) {
                    int i21 = b;
                    int i22 = i21 & 91;
                    int i23 = ((i21 ^ 91) | i22) << 1;
                    int i24 = -((i21 | 91) & (~i22));
                    int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                    a = i25 % 128;
                    int i26 = i25 % 2;
                    C.c(c.c, b.c().f());
                    int i27 = b;
                    int i28 = i27 & 77;
                    int i29 = ((i27 ^ 77) | i28) << 1;
                    int i30 = -((i27 | 77) & (~i28));
                    int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
                    a = i31 % 128;
                    if (i31 % 2 == 0) {
                        int i32 = 4 / 5;
                    }
                }
            }
            int i33 = a;
            int i34 = i33 & 83;
            int i35 = (i33 ^ 83) | i34;
            int i36 = (i34 & i35) + (i35 | i34);
            b = i36 % 128;
            int i37 = i36 % 2;
        }
    }

    public L(EditText editText, boolean z) {
        r.k(editText, "editText cannot be null");
        this.a = new bxU(editText, z);
    }
}
