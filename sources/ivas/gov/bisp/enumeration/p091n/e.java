package ivas.gov.bisp.enumeration.p091n;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
public class e extends h {
    private static int a = 1;
    private static int b;
    public aPE p;
    public boolean q;

    public static class aPE extends h.aPC {
        private static int a = 0;
        private static int b = 1;
        public int[][] L;

        public aPE(aPE ape, e eVar, Resources resources) {
            super(ape, eVar, resources);
            if (ape != null) {
                this.L = ape.L;
                int i = a;
                int i2 = ((i | 13) << 1) - (i ^ 13);
                b = i2 % 128;
                if (i2 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.L = new int[this.j.length][];
            int i3 = b;
            int i4 = i3 ^ 121;
            int i5 = ((i3 & 121) | i4) << 1;
            int i6 = -i4;
            int i7 = (i5 & i6) + (i5 | i6);
            a = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 75 / 0;
            }
        }

        @Override // ivas.gov.bisp.enumeration.n.h.aPC
        public void h() {
            int[] iArr;
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 69) - (~(-(-((i2 & 69) << 1))))) - 1;
            int i4 = i3 % 128;
            b = i4;
            Object obj = null;
            if (i3 % 2 == 0) {
                int[][] iArr2 = this.L;
                int[][] iArr3 = new int[iArr2.length][];
                int length = iArr2.length;
                obj.hashCode();
                throw null;
            }
            int[][] iArr4 = this.L;
            int[][] iArr5 = new int[iArr4.length][];
            int length2 = iArr4.length;
            int i5 = i4 + 43;
            a = i5 % 128;
            int i6 = i5 % 2;
            int i7 = length2 - 1;
            int i8 = (i4 & (-106)) | ((~i4) & 105);
            int i9 = (i4 & 105) << 1;
            int i10 = (i8 & i9) + (i9 | i8);
            a = i10 % 128;
            int i11 = i10 % 2;
            while (i7 >= 0) {
                int i12 = b;
                int i13 = (-2) - (((i12 & 42) + (i12 | 42)) ^ (-1));
                int i14 = i13 % 128;
                a = i14;
                if (i13 % 2 != 0) {
                    int[] iArr6 = this.L[i7];
                    throw null;
                }
                int[] iArr7 = this.L[i7];
                if (iArr7 != null) {
                    iArr = (int[]) iArr7.clone();
                    int i15 = a + 115;
                    b = i15 % 128;
                    int i16 = i15 % 2;
                } else {
                    int i17 = i14 & 61;
                    int i18 = i14 | 61;
                    int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
                    b = i19 % 128;
                    int i20 = i19 % 2;
                    iArr = null;
                }
                iArr5[i7] = iArr;
                i7--;
                int i21 = a;
                int i22 = i21 & 61;
                int i23 = i22 + ((i21 ^ 61) | i22);
                b = i23 % 128;
                int i24 = i23 % 2;
            }
            this.L = iArr5;
            int i25 = b;
            int i26 = (-2) - (((i25 ^ 52) + ((i25 & 52) << 1)) ^ (-1));
            a = i26 % 128;
            if (i26 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            int i = 2 % 2;
            e eVar = new e(this, null);
            int i2 = a;
            int i3 = ((i2 ^ 70) + ((i2 & 70) << 1)) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            return eVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            int i = 2 % 2;
            e eVar = new e(this, resources);
            int i2 = b;
            int i3 = i2 ^ 63;
            int i4 = ((((i2 & 63) | i3) << 1) - (~(-i3))) - 1;
            a = i4 % 128;
            int i5 = i4 % 2;
            return eVar;
        }

        public int i(int[] iArr) {
            int[][] iArr2;
            int i;
            int i2;
            int i3 = 2 % 2;
            int i4 = (-2) - ((a + 20) ^ (-1));
            b = i4 % 128;
            if (i4 % 2 == 0) {
                iArr2 = this.L;
                i = this.k;
                i2 = 1;
            } else {
                iArr2 = this.L;
                i = this.k;
                i2 = 0;
            }
            int i5 = a;
            int i6 = ((((i5 ^ 71) | (i5 & 71)) << 1) - (~(-(((~i5) & 71) | (i5 & (-72)))))) - 1;
            b = i6 % 128;
            int i7 = i6 % 2;
            while (i2 < i) {
                int i8 = a;
                int i9 = i8 & 17;
                int i10 = (i8 | 17) & (~i9);
                int i11 = -(-(i9 << 1));
                int i12 = (i10 & i11) + (i10 | i11);
                b = i12 % 128;
                if (i12 % 2 == 0) {
                    StateSet.stateSetMatches(iArr2[i2], iArr);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                    int i13 = a + 91;
                    int i14 = i13 % 128;
                    b = i14;
                    int i15 = i13 % 2;
                    int i16 = i14 ^ 101;
                    int i17 = -(-((i14 & 101) << 1));
                    int i18 = (i16 & i17) + (i16 | i17);
                    a = i18 % 128;
                    int i19 = i18 % 2;
                    return i2;
                }
                int i20 = ((i2 ^ (-109)) - (~((i2 & (-109)) << 1))) - 1;
                int i21 = i20 & 110;
                i2 = (((i20 | 110) & (~i21)) - (~(i21 << 1))) - 1;
                int i22 = a;
                int i23 = i22 & 59;
                int i24 = (i22 ^ 59) | i23;
                int i25 = (i23 & i24) + (i24 | i23);
                b = i25 % 128;
                int i26 = i25 % 2;
            }
            int i27 = a;
            int i28 = i27 & 91;
            int i29 = (i27 ^ 91) | i28;
            int i30 = (i28 & i29) + (i29 | i28);
            b = i30 % 128;
            int i31 = i30 % 2;
            return -1;
        }
    }

    public e(aPE ape, Resources resources) {
        g(new aPE(ape, this, resources));
        onStateChange(getState());
    }

    @Override // ivas.gov.bisp.enumeration.p091n.h
    public /* synthetic */ h.aPC d() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 63;
        int i4 = (((i2 & 63) | i3) << 1) - i3;
        a = i4 % 128;
        int i5 = i4 % 2;
        aPE apeH = h();
        int i6 = b;
        int i7 = i6 & 99;
        int i8 = ((i6 ^ 99) | i7) << 1;
        int i9 = -((i6 | 99) & (~i7));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        a = i10 % 128;
        int i11 = i10 % 2;
        return apeH;
    }

    public aPE h() {
        int i = 2 % 2;
        Object obj = null;
        aPE ape = new aPE(this.p, this, null);
        int i2 = b;
        int i3 = i2 & 37;
        int i4 = i3 + ((i2 ^ 37) | i3);
        a = i4 % 128;
        if (i4 % 2 != 0) {
            return ape;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        int i = 2 % 2;
        int i2 = b + 5;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        int i5 = (i3 ^ 71) + ((i3 & 71) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035  */
    /* JADX WARN: Code duplicated, block: B:13:0x0040  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // ivas.gov.bisp.enumeration.p091n.h, android.graphics.drawable.Drawable
    public Drawable mutate() {
        int i;
        aPE ape;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 102) + ((i3 & 102) << 1)) - 1;
        int i5 = i4 % 128;
        a = i5;
        if (i4 % 2 == 0) {
            int i6 = 50 / 0;
            if (!this.q) {
                int i7 = i5 ^ 95;
                int i8 = -(-((i5 & 95) << 1));
                i = (i7 ^ i8) + ((i8 & i7) << 1);
                b = i % 128;
                if (i % 2 != 0) {
                    super.mutate();
                    ape = this.p;
                } else {
                    super.mutate();
                    ape = this.p;
                }
                ape.h();
                this.q = true;
            }
        } else if (!this.q) {
            int i9 = i5 ^ 95;
            int i10 = -(-((i5 & 95) << 1));
            i = (i9 ^ i10) + ((i10 & i9) << 1);
            b = i % 128;
            if (i % 2 != 0) {
                super.mutate();
                ape = this.p;
            } else {
                super.mutate();
                ape = this.p;
            }
            ape.h();
            this.q = true;
        }
        int i11 = b;
        int i12 = (i11 ^ 74) + ((i11 & 74) << 1);
        int i13 = (i12 ^ (-1)) + (i12 << 1);
        a = i13 % 128;
        int i14 = i13 % 2;
        return this;
    }

    @Override // ivas.gov.bisp.enumeration.p091n.h, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 43;
        int i4 = i2 | 43;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            super.applyTheme(theme);
            onStateChange(getState());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        super.applyTheme(theme);
        onStateChange(getState());
        int i6 = b;
        int i7 = (i6 & (-60)) | ((~i6) & 59);
        int i8 = (i6 & 59) << 1;
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        a = i9 % 128;
        int i10 = i9 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0070  */
    /* JADX WARN: Code duplicated, block: B:18:0x007b  */
    @Override // ivas.gov.bisp.enumeration.p091n.h, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z;
        int i = 2 % 2;
        int i2 = a + 101;
        b = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnStateChange = super.onStateChange(iArr);
        aPE ape = this.p;
        int i4 = a;
        int i5 = i4 & 89;
        int i6 = (i4 ^ 89) | i5;
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            ape.i(iArr);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i8 = ape.i(iArr);
        if (i8 < 0) {
            i8 = this.p.i(StateSet.WILD_CARD);
            int i9 = b;
            int i10 = ((i9 ^ 97) | (i9 & 97)) << 1;
            int i11 = -(((~i9) & 97) | (i9 & (-98)));
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            a = i12 % 128;
            int i13 = i12 % 2;
        }
        if (f(i8)) {
            int i14 = b;
            int i15 = (((i14 | 112) << 1) - (i14 ^ 112)) - 1;
            a = i15 % 128;
            int i16 = i15 % 2;
            z = true;
        } else {
            int i17 = b;
            int i18 = i17 & 49;
            int i19 = (i17 ^ 49) | i18;
            int i20 = (i18 & i19) + (i19 | i18);
            int i21 = i20 % 128;
            a = i21;
            z = false;
            if (i20 % 2 == 0) {
                int i22 = 14 / 0;
                if (zOnStateChange) {
                    int i110 = b;
                    int i111 = (((i110 | 112) << 1) - (i110 ^ 112)) - 1;
                    a = i111 % 128;
                    int i112 = i111 % 2;
                    z = true;
                } else {
                    int i23 = (i21 & 95) + (i21 | 95);
                    b = i23 % 128;
                    int i24 = i23 % 2;
                }
            } else if (!(!zOnStateChange)) {
                int i113 = b;
                int i114 = (((i113 | 112) << 1) - (i113 ^ 112)) - 1;
                a = i114 % 128;
                int i115 = i114 % 2;
                z = true;
            } else {
                int i25 = (i21 & 95) + (i21 | 95);
                b = i25 % 128;
                int i26 = i25 % 2;
            }
        }
        int i27 = b;
        int i28 = i27 & 59;
        int i29 = -(-(i27 | 59));
        int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
        a = i30 % 128;
        int i31 = i30 % 2;
        return z;
    }

    public e(aPE ape) {
    }

    @Override // ivas.gov.bisp.enumeration.p091n.h
    public void g(h.aPC apc) {
        int i = 2 % 2;
        int i2 = b + 61;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            this.e = apc;
            int i3 = this.k;
            throw null;
        }
        this.e = apc;
        int i4 = this.k;
        if (i4 >= 0) {
            Drawable drawableF = apc.f(i4);
            this.g = drawableF;
            if (drawableF != null) {
                int i5 = b + 49;
                a = i5 % 128;
                if (i5 % 2 == 0) {
                    e(drawableF);
                    int i6 = 24 / 0;
                } else {
                    e(drawableF);
                }
            }
        }
        this.i = null;
        if (apc instanceof aPE) {
            int i7 = a + 5;
            int i8 = i7 % 128;
            b = i8;
            int i9 = i7 % 2;
            this.p = (aPE) apc;
            int i10 = ((i8 | 47) << 1) - (i8 ^ 47);
            a = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 3 % 5;
            }
        }
        int i12 = a;
        int i13 = i12 & 93;
        int i14 = (i12 | 93) & (~i13);
        int i15 = i13 << 1;
        int i16 = (i14 & i15) + (i14 | i15);
        b = i16 % 128;
        if (i16 % 2 != 0) {
            throw null;
        }
    }
}
