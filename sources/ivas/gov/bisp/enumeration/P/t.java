package ivas.gov.bisp.enumeration.P;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class t {
    private static int a = 1;
    private static int b;
    public float e;
    public ivas.gov.bisp.enumeration.aL.r g;
    public WeakReference<aNV> h;
    public final TextPaint c = new TextPaint(1);
    public final ivas.gov.bisp.enumeration.p096p.h d = new beL();
    public boolean f = true;

    public interface aNV {
        void b();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public t(aNV anv) {
        this.h = new WeakReference<>(null);
        this.h = new WeakReference<>(anv);
    }

    public float c(String str) {
        float fMeasureText;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 29) << 1) - ((i2 & (-30)) | ((~i2) & 29));
        int i4 = i3 % 128;
        a = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (!this.f) {
            float f = this.e;
            int i5 = i4 + 81;
            b = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }
        if (str == null) {
            int i7 = (i2 ^ 81) + ((i2 & 81) << 1);
            a = i7 % 128;
            int i8 = i7 % 2;
            int i9 = (-2) - ((i2 + 106) ^ (-1));
            a = i9 % 128;
            int i10 = i9 % 2;
            fMeasureText = 0.0f;
        } else {
            fMeasureText = this.c.measureText((CharSequence) str, 0, str.length());
            int i11 = b;
            int i12 = i11 & 93;
            int i13 = ((i11 ^ 93) | i12) << 1;
            int i14 = -((~i12) & (i11 | 93));
            int i15 = (i13 & i14) + (i13 | i14);
            a = i15 % 128;
            int i16 = i15 % 2;
            int i17 = i11 & 117;
            int i18 = (i11 | 117) & (~i17);
            int i19 = i17 << 1;
            int i20 = (i18 & i19) + (i18 | i19);
            a = i20 % 128;
            int i21 = i20 % 2;
        }
        this.e = fMeasureText;
        this.f = false;
        int i22 = a;
        int i23 = (i22 & (-118)) | ((~i22) & 117);
        int i24 = (i22 & 117) << 1;
        int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
        b = i25 % 128;
        if (i25 % 2 == 0) {
            return fMeasureText;
        }
        obj.hashCode();
        throw null;
    }

    public class beL extends ivas.gov.bisp.enumeration.p096p.h {
        private static int a = 1;
        private static int b;

        public beL() {
        }

        @Override // ivas.gov.bisp.enumeration.p096p.h
        public void aG(Typeface typeface, boolean z) {
            int i = 2 % 2;
            int i2 = b + 103;
            int i3 = i2 % 128;
            a = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (z) {
                int i4 = i3 + 43;
                b = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            t tVar = t.this;
            tVar.f = true;
            WeakReference<aNV> weakReference = tVar.h;
            int i5 = b;
            int i6 = i5 | 9;
            int i7 = ((i6 << 1) - (~(-((~(i5 & 9)) & i6)))) - 1;
            a = i7 % 128;
            int i8 = i7 % 2;
            aNV anv = weakReference.get();
            if (anv != null) {
                int i9 = a;
                int i10 = ((i9 ^ 123) - (~((i9 & 123) << 1))) - 1;
                b = i10 % 128;
                int i11 = i10 % 2;
                anv.b();
                int i12 = a + 123;
                b = i12 % 128;
                int i13 = i12 % 2;
            }
            int i14 = a;
            int i15 = i14 & 41;
            int i16 = i15 + ((i14 ^ 41) | i15);
            b = i16 % 128;
            int i17 = i16 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.p096p.h
        public void aH(int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 55;
            int i5 = i3 | 55;
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            a = i6 % 128;
            int i7 = i6 % 2;
            t tVar = t.this;
            tVar.f = true;
            WeakReference<aNV> weakReference = tVar.h;
            int i8 = b + 43;
            a = i8 % 128;
            int i9 = i8 % 2;
            aNV anv = weakReference.get();
            if (anv != null) {
                int i10 = b;
                int i11 = (-2) - (((i10 ^ 116) + ((i10 & 116) << 1)) ^ (-1));
                a = i11 % 128;
                int i12 = i11 % 2;
                anv.b();
                if (i12 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i13 = a;
                int i14 = i13 ^ 7;
                int i15 = ((i13 & 7) | i14) << 1;
                int i16 = -i14;
                int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
                b = i17 % 128;
                if (i17 % 2 != 0) {
                    int i18 = 2 / 2;
                }
            }
            int i19 = b;
            int i20 = i19 & 77;
            int i21 = (i19 ^ 77) | i20;
            int i22 = (i20 & i21) + (i21 | i20);
            a = i22 % 128;
            if (i22 % 2 == 0) {
                int i23 = 61 / 0;
            }
        }
    }

    public void d(ivas.gov.bisp.enumeration.aL.r rVar, Context context) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 25;
        int i4 = (i2 & 25) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        if (this.g != rVar) {
            int i8 = (i6 & (-116)) | ((~i6) & 115);
            int i9 = -(-((i6 & 115) << 1));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            int i11 = i10 % 128;
            a = i11;
            int i12 = i10 % 2;
            this.g = rVar;
            if (rVar != null) {
                int i13 = ((i11 | 13) << 1) - (i11 ^ 13);
                b = i13 % 128;
                if (i13 % 2 != 0) {
                    rVar.g(context, this.c, this.d);
                    throw null;
                }
                rVar.g(context, this.c, this.d);
                aNV anv = this.h.get();
                if (anv != null) {
                    int i14 = a;
                    int i15 = i14 | 53;
                    int i16 = i15 << 1;
                    int i17 = -((~(i14 & 53)) & i15);
                    int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                    b = i18 % 128;
                    if (i18 % 2 != 0) {
                        this.c.drawableState = anv.getState();
                        int i19 = 2 / 0;
                    } else {
                        this.c.drawableState = anv.getState();
                    }
                }
                rVar.h(context, this.c, this.d);
                int i20 = b;
                int i21 = i20 ^ 43;
                int i22 = ((((i20 & 43) | i21) << 1) - (~(-i21))) - 1;
                int i23 = i22 % 128;
                a = i23;
                if (i22 % 2 == 0) {
                    this.f = true;
                } else {
                    this.f = true;
                }
                int i24 = i23 + 109;
                b = i24 % 128;
                int i25 = i24 % 2;
            }
            aNV anv2 = this.h.get();
            int i26 = a;
            int i27 = i26 + 67;
            b = i27 % 128;
            int i28 = i27 % 2;
            if (anv2 != null) {
                int i29 = (((i26 & (-124)) | ((~i26) & 123)) - (~(-(-((i26 & 123) << 1))))) - 1;
                b = i29 % 128;
                if (i29 % 2 != 0) {
                    anv2.b();
                    anv2.getState();
                    throw null;
                }
                anv2.b();
                int[] state = anv2.getState();
                int i30 = a;
                int i31 = i30 & 81;
                int i32 = -(-((i30 ^ 81) | i31));
                int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
                b = i33 % 128;
                if (i33 % 2 != 0) {
                    anv2.onStateChange(state);
                    int i34 = 10 / 0;
                } else {
                    anv2.onStateChange(state);
                }
            }
        }
        int i35 = b;
        int i36 = ((i35 ^ 105) | (i35 & 105)) << 1;
        int i37 = -(((~i35) & 105) | (i35 & (-106)));
        int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
        a = i38 % 128;
        int i39 = i38 % 2;
    }
}
