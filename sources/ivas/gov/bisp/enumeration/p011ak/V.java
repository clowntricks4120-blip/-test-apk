package ivas.gov.bisp.enumeration.p011ak;

import android.graphics.Typeface;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class V implements Spannable {
    private static int a = 0;
    private static int b = 1;

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (((i3 | 19) << 1) - (~(-(((~i3) & 19) | (i3 & (-20)))))) - 1;
        b = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            throw null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 105) + ((i2 & 105) << 1);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = 74 / 0;
        throw null;
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 35;
        int i4 = -(-((i2 ^ 35) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        throw null;
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        int i = 2 % 2;
        int i2 = b + 105;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = 80 / 0;
        throw null;
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = ((i4 ^ 38) + ((i4 & 38) << 1)) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        if (Build.VERSION.SDK_INT < 29) {
            throw null;
        }
        int i7 = a;
        int i8 = ((i7 ^ 113) | (i7 & 113)) << 1;
        int i9 = -(((~i7) & 113) | (i7 & (-114)));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
        throw null;
    }

    @Override // java.lang.CharSequence
    public int length() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 27) + (i2 | 27);
        a = i3 % 128;
        int i4 = i3 % 2;
        throw null;
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (((i4 | 27) << 1) - (~(-(i4 ^ 27)))) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        throw null;
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 116) << 1) - (i2 ^ 116)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        int i5 = i2 | 123;
        int i6 = (i5 << 1) - (i5 & (~(i2 & 123)));
        a = i6 % 128;
        int i7 = i6 % 2;
        if (Build.VERSION.SDK_INT < 29) {
            throw null;
        }
        int i8 = a + 71;
        b = i8 % 128;
        int i9 = i8 % 2;
        throw null;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (((i4 | 16) << 1) - (i4 ^ 16)) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        throw null;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 41) + ((i2 & 41) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        throw null;
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = b + 49;
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        int i8 = i6 ^ 13;
        int i9 = (i6 & 13) << 1;
        int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
        b = i10 % 128;
        int i11 = i10 % 2;
        if (Build.VERSION.SDK_INT < 29) {
            throw null;
        }
        int i12 = (-2) - ((a + 6) ^ (-1));
        b = i12 % 128;
        int i13 = i12 % 2;
        throw null;
    }

    public static final class aWg {
        private static int a = 1;
        private static int b;
        public final TextPaint c;
        public final TextDirectionHeuristic d;
        public final int e;
        public final int f;

        public aWg(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                PrecomputedText.Params.Builder breakStrategy = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i);
                int i3 = a;
                int i4 = (i3 | 113) << 1;
                int i5 = -(((~i3) & 113) | (i3 & (-114)));
                int i6 = (i4 & i5) + (i5 | i4);
                b = i6 % 128;
                int i7 = i6 % 2;
                breakStrategy.setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
                int i8 = b;
                int i9 = i8 ^ 35;
                int i10 = (((i8 & 35) | i9) << 1) - i9;
                a = i10 % 128;
                int i11 = i10 % 2;
                int i12 = 2 % 2;
            }
            this.c = textPaint;
            this.d = textDirectionHeuristic;
            this.e = i;
            int i13 = a;
            int i14 = ((i13 ^ 124) + ((i13 & 124) << 1)) - 1;
            b = i14 % 128;
            if (i14 % 2 == 0) {
                this.f = i2;
            } else {
                this.f = i2;
                int i15 = 14 / 0;
            }
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 ^ 88) + ((i2 & 88) << 1)) - 1;
            a = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (obj == this) {
                int i4 = ((i2 | 65) << 1) - (i2 ^ 65);
                a = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
            if (!(obj instanceof aWg)) {
                int i6 = i2 & 83;
                int i7 = -(-((i2 ^ 83) | i6));
                int i8 = (i6 & i7) + (i6 | i7);
                int i9 = i8 % 128;
                a = i9;
                int i10 = i8 % 2;
                int i11 = (((i9 ^ 67) | (i9 & 67)) << 1) - (((~i9) & 67) | (i9 & (-68)));
                b = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 90 / 0;
                }
                return false;
            }
            aWg awg = (aWg) obj;
            if (!d(awg)) {
                int i13 = b;
                int i14 = ((i13 | 25) << 1) - (i13 ^ 25);
                int i15 = i14 % 128;
                a = i15;
                int i16 = i14 % 2;
                int i17 = i15 & 111;
                int i18 = ((i15 | 111) & (~i17)) + (i17 << 1);
                b = i18 % 128;
                if (i18 % 2 == 0) {
                    return false;
                }
                throw null;
            }
            if (this.d == awg.d) {
                int i19 = b;
                int i20 = i19 & 49;
                int i21 = -(-((i19 ^ 49) | i20));
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                a = i22 % 128;
                int i23 = i22 % 2;
                return true;
            }
            int i24 = a;
            int i25 = ((i24 & (-64)) | ((~i24) & 63)) + ((i24 & 63) << 1);
            int i26 = i25 % 128;
            b = i26;
            int i27 = i25 % 2;
            int i28 = i26 & 89;
            int i29 = -(-((i26 ^ 89) | i28));
            int i30 = (i28 & i29) + (i29 | i28);
            a = i30 % 128;
            if (i30 % 2 == 0) {
                int i31 = 65 / 0;
            }
            return false;
        }

        public final int hashCode() {
            TextPaint textPaint;
            TextPaint textPaint2;
            int i;
            Object[] objArr;
            Float fValueOf;
            int i2;
            int i3 = 2 % 2;
            int i4 = b + 125;
            a = i4 % 128;
            int i5 = i4 % 2;
            char c = '\n';
            char c2 = 3;
            if (Build.VERSION.SDK_INT >= 24) {
                int i6 = b + 23;
                a = i6 % 128;
                if (i6 % 2 == 0) {
                    objArr = new Object[13];
                    objArr[1] = Float.valueOf(this.c.getTextSize());
                } else {
                    objArr = new Object[11];
                    objArr[0] = Float.valueOf(this.c.getTextSize());
                }
                int i7 = a;
                int i8 = (i7 ^ 53) + ((i7 & 53) << 1);
                b = i8 % 128;
                int i9 = i8 % 2;
                objArr[1] = Float.valueOf(this.c.getTextScaleX());
                TextPaint textPaint3 = this.c;
                int i10 = b;
                int i11 = i10 & 115;
                int i12 = (i11 - (~((i10 ^ 115) | i11))) - 1;
                a = i12 % 128;
                if (i12 % 2 == 0) {
                    objArr[5] = Float.valueOf(textPaint3.getTextSkewX());
                    fValueOf = Float.valueOf(this.c.getLetterSpacing());
                    c2 = 5;
                } else {
                    objArr[2] = Float.valueOf(textPaint3.getTextSkewX());
                    fValueOf = Float.valueOf(this.c.getLetterSpacing());
                }
                objArr[c2] = fValueOf;
                objArr[4] = Integer.valueOf(this.c.getFlags());
                TextPaint textPaint4 = this.c;
                int i13 = b;
                int i14 = (i13 & (-116)) | ((~i13) & 115);
                int i15 = (i13 & 115) << 1;
                int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                a = i16 % 128;
                if (i16 % 2 == 0) {
                    objArr[5] = textPaint4.getTextLocales();
                    objArr[1] = this.c.getTypeface();
                } else {
                    objArr[5] = textPaint4.getTextLocales();
                    objArr[6] = this.c.getTypeface();
                }
                objArr[7] = Boolean.valueOf(this.c.isElegantTextHeight());
                TextDirectionHeuristic textDirectionHeuristic = this.d;
                int i17 = a;
                int i18 = (i17 ^ 73) + ((i17 & 73) << 1);
                b = i18 % 128;
                if (i18 % 2 != 0) {
                    objArr[8] = textDirectionHeuristic;
                    objArr[37] = Integer.valueOf(this.e);
                    i2 = this.f;
                    c = 18;
                } else {
                    objArr[8] = textDirectionHeuristic;
                    objArr[9] = Integer.valueOf(this.e);
                    i2 = this.f;
                }
                objArr[c] = Integer.valueOf(i2);
                int iHash = Objects.hash(objArr);
                int i19 = b;
                int i20 = (i19 & (-78)) | ((~i19) & 77);
                int i21 = -(-((i19 & 77) << 1));
                int i22 = (i20 & i21) + (i21 | i20);
                a = i22 % 128;
                int i23 = i22 % 2;
                return iHash;
            }
            Object[] objArr2 = new Object[11];
            objArr2[0] = Float.valueOf(this.c.getTextSize());
            int i24 = b + 30;
            int i25 = (i24 ^ (-1)) + (i24 << 1);
            a = i25 % 128;
            if (i25 % 2 == 0) {
                objArr2[0] = Float.valueOf(this.c.getTextScaleX());
                textPaint = this.c;
            } else {
                objArr2[1] = Float.valueOf(this.c.getTextScaleX());
                textPaint = this.c;
            }
            int i26 = b;
            int i27 = i26 & 39;
            int i28 = (((i26 | 39) & (~i27)) - (~(i27 << 1))) - 1;
            a = i28 % 128;
            int i29 = i28 % 2;
            objArr2[2] = Float.valueOf(textPaint.getTextSkewX());
            Float fValueOf2 = Float.valueOf(this.c.getLetterSpacing());
            int i30 = a;
            int i31 = (i30 | 123) << 1;
            int i32 = -(((~i30) & 123) | (i30 & (-124)));
            int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
            b = i33 % 128;
            if (i33 % 2 != 0) {
                objArr2[3] = fValueOf2;
                objArr2[3] = Integer.valueOf(this.c.getFlags());
                textPaint2 = this.c;
            } else {
                objArr2[3] = fValueOf2;
                objArr2[4] = Integer.valueOf(this.c.getFlags());
                textPaint2 = this.c;
            }
            int i34 = a;
            int i35 = i34 & 95;
            int i36 = -(-((i34 ^ 95) | i35));
            int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
            b = i37 % 128;
            int i38 = i37 % 2;
            objArr2[5] = textPaint2.getTextLocale();
            objArr2[6] = this.c.getTypeface();
            int i39 = a + 77;
            b = i39 % 128;
            int i40 = i39 % 2;
            objArr2[7] = Boolean.valueOf(this.c.isElegantTextHeight());
            TextDirectionHeuristic textDirectionHeuristic2 = this.d;
            int i41 = a;
            int i42 = ((i41 ^ 71) - (~(-(-((i41 & 71) << 1))))) - 1;
            b = i42 % 128;
            if (i42 % 2 != 0) {
                objArr2[8] = textDirectionHeuristic2;
                objArr2[23] = Integer.valueOf(this.e);
                i = this.f;
                c = ';';
            } else {
                objArr2[8] = textDirectionHeuristic2;
                objArr2[9] = Integer.valueOf(this.e);
                i = this.f;
            }
            objArr2[c] = Integer.valueOf(i);
            int iHash2 = Objects.hash(objArr2);
            int i43 = b;
            int i44 = (i43 & 53) + (i43 | 53);
            a = i44 % 128;
            int i45 = i44 % 2;
            return iHash2;
        }

        public final String toString() {
            int i;
            int i2 = 2 % 2;
            StringBuilder sb = new StringBuilder("{");
            StringBuilder sbW = j.w("textSize=");
            sbW.append(this.c.getTextSize());
            sb.append(sbW.toString());
            StringBuilder sb2 = new StringBuilder();
            int i3 = b;
            int i4 = i3 & 103;
            int i5 = ((i3 | 103) & (~i4)) + (i4 << 1);
            a = i5 % 128;
            Object obj = null;
            if (i5 % 2 == 0) {
                sb2.append(", textScaleX=");
                sb2.append(this.c.getTextScaleX());
                sb.append(sb2.toString());
                throw null;
            }
            sb2.append(", textScaleX=");
            sb2.append(this.c.getTextScaleX());
            sb.append(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(", textSkewX=");
            float textSkewX = this.c.getTextSkewX();
            int i6 = a;
            int i7 = (i6 ^ 55) + ((i6 & 55) << 1);
            b = i7 % 128;
            int i8 = i7 % 2;
            sb3.append(textSkewX);
            sb.append(sb3.toString());
            int i9 = Build.VERSION.SDK_INT;
            StringBuilder sbW2 = j.w(", letterSpacing=");
            sbW2.append(this.c.getLetterSpacing());
            sb.append(sbW2.toString());
            StringBuilder sb4 = new StringBuilder();
            int i10 = a + 25;
            b = i10 % 128;
            if (i10 % 2 != 0) {
                sb4.append(", elegantTextHeight=");
                sb4.append(this.c.isElegantTextHeight());
                sb4.toString();
                throw null;
            }
            sb4.append(", elegantTextHeight=");
            sb4.append(this.c.isElegantTextHeight());
            sb.append(sb4.toString());
            if (i9 >= 24) {
                int i11 = a;
                int i12 = i11 & 5;
                int i13 = i11 | 5;
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                b = i14 % 128;
                if (i14 % 2 != 0) {
                    j.w(", textLocale=").append(this.c.getTextLocales());
                    throw null;
                }
                StringBuilder sbW3 = j.w(", textLocale=");
                sbW3.append(this.c.getTextLocales());
                int i15 = a;
                int i16 = i15 & 25;
                int i17 = -(-((i15 ^ 25) | i16));
                int i18 = (i16 & i17) + (i17 | i16);
                b = i18 % 128;
                if (i18 % 2 != 0) {
                    sb.append(sbW3.toString());
                    int i19 = 42 / 0;
                } else {
                    sb.append(sbW3.toString());
                }
            } else {
                StringBuilder sbW4 = j.w(", textLocale=");
                TextPaint textPaint = this.c;
                int i20 = a;
                int i21 = (i20 ^ 120) + ((i20 & 120) << 1);
                int i22 = (i21 ^ (-1)) + (i21 << 1);
                b = i22 % 128;
                if (i22 % 2 != 0) {
                    sbW4.append(textPaint.getTextLocale());
                    sbW4.toString();
                    throw null;
                }
                sbW4.append(textPaint.getTextLocale());
                sb.append(sbW4.toString());
                int i23 = a;
                int i24 = (((i23 & (-88)) | ((~i23) & 87)) - (~((i23 & 87) << 1))) - 1;
                b = i24 % 128;
                int i25 = i24 % 2;
            }
            StringBuilder sbW5 = j.w(", typeface=");
            Typeface typeface = this.c.getTypeface();
            int i26 = a + 89;
            b = i26 % 128;
            int i27 = i26 % 2;
            sbW5.append(typeface);
            sb.append(sbW5.toString());
            int i28 = b;
            int i29 = i28 & 33;
            int i30 = ((~i29) & (i28 | 33)) + (i29 << 1);
            a = i30 % 128;
            if (i30 % 2 != 0 ? i9 >= 26 : i9 >= 80) {
                int i31 = ((i28 | 56) << 1) - (i28 ^ 56);
                int i32 = (i31 ^ (-1)) + (i31 << 1);
                a = i32 % 128;
                if (i32 % 2 == 0) {
                    j.w(", variationSettings=");
                    this.c.getFontVariationSettings();
                    obj.hashCode();
                    throw null;
                }
                StringBuilder sbW6 = j.w(", variationSettings=");
                String fontVariationSettings = this.c.getFontVariationSettings();
                int i33 = a;
                int i34 = (i33 & (-10)) | ((~i33) & 9);
                int i35 = (i33 & 9) << 1;
                int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                b = i36 % 128;
                int i37 = i36 % 2;
                sbW6.append(fontVariationSettings);
                sb.append(sbW6.toString());
                int i38 = a;
                int i39 = i38 + 65;
                b = i39 % 128;
                int i40 = i39 % 2;
                int i41 = ((i38 | 39) << 1) - (i38 ^ 39);
                b = i41 % 128;
                int i42 = i41 % 2;
            }
            StringBuilder sbW7 = j.w(", textDir=");
            sbW7.append(this.d);
            sb.append(sbW7.toString());
            StringBuilder sb5 = new StringBuilder();
            int i43 = b;
            int i44 = (((i43 | 108) << 1) - (i43 ^ 108)) - 1;
            a = i44 % 128;
            if (i44 % 2 == 0) {
                sb5.append(", breakStrategy=");
                i = this.e;
                int i45 = 69 / 0;
            } else {
                sb5.append(", breakStrategy=");
                i = this.e;
            }
            sb5.append(i);
            sb.append(sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append(", hyphenationFrequency=");
            int i46 = b;
            int i47 = ((i46 | 41) << 1) - (i46 ^ 41);
            a = i47 % 128;
            int i48 = i47 % 2;
            sb6.append(this.f);
            String string = sb6.toString();
            int i49 = b;
            int i50 = ((i49 | 13) << 1) - (i49 ^ 13);
            a = i50 % 128;
            int i51 = i50 % 2;
            sb.append(string);
            sb.append("}");
            String string2 = sb.toString();
            int i52 = b;
            int i53 = (i52 | 69) << 1;
            int i54 = -(i52 ^ 69);
            int i55 = ((i53 | i54) << 1) - (i54 ^ i53);
            a = i55 % 128;
            if (i55 % 2 != 0) {
                return string2;
            }
            obj.hashCode();
            throw null;
        }

        public aWg(PrecomputedText.Params params) {
            this.c = params.getTextPaint();
            this.d = params.getTextDirection();
            this.e = params.getBreakStrategy();
            this.f = params.getHyphenationFrequency();
        }

        /* JADX WARN: Code restructure failed: missing block: B:100:0x02dc, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:101:?, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
        
            if ((r2 % 2) != 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
        
            r11 = 55 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        
            if (r10.f == r11.f) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
        
            r11 = ivas.gov.bisp.enumeration.ak.V.aWg.b;
            r2 = r11 ^ 3;
            r4 = (((r11 & 3) | r2) << 1) - r2;
            ivas.gov.bisp.enumeration.ak.V.aWg.a = r4 % 128;
            r4 = r4 % 2;
            r2 = (r11 ^ 111) + ((r11 & 111) << 1);
            ivas.gov.bisp.enumeration.ak.V.aWg.a = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
        
            r4 = r10.c.getTextSize();
            r5 = r11.c;
            r6 = ivas.gov.bisp.enumeration.ak.V.aWg.a;
            r7 = ((r6 | 51) << 1) - (r6 ^ 51);
            ivas.gov.bisp.enumeration.ak.V.aWg.b = r7 % 128;
            r6 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
        
            if ((r7 % 2) != 0) goto L99;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
        
            if (r4 == r5.getTextSize()) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
        
            r11 = ivas.gov.bisp.enumeration.ak.V.aWg.b;
            r2 = ((r11 ^ 107) | (r11 & 107)) << 1;
            r11 = -(((~r11) & 107) | (r11 & (-108)));
            r3 = ((r2 | r11) << 1) - (r11 ^ r2);
            ivas.gov.bisp.enumeration.ak.V.aWg.a = r3 % 128;
            r3 = r3 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0094, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0095, code lost:
        
            r4 = r10.c.getTextScaleX();
            r5 = r11.c;
            r7 = ivas.gov.bisp.enumeration.ak.V.aWg.a;
            r9 = r7 & 55;
            r8 = ((((r7 ^ 55) | r9) << 1) - (~(-((r7 | 55) & (~r9))))) - 1;
            ivas.gov.bisp.enumeration.ak.V.aWg.b = r8 % 128;
            r8 = r8 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00b8, code lost:
        
            if (r4 == r5.getTextScaleX()) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00ba, code lost:
        
            r11 = ivas.gov.bisp.enumeration.ak.V.aWg.b;
            r2 = (((r11 & (-82)) | ((~r11) & 81)) - (~(-(-((r11 & 81) << 1))))) - 1;
            r11 = r2 % 128;
            ivas.gov.bisp.enumeration.ak.V.aWg.a = r11;
            r2 = r2 % 2;
            r11 = r11 + 37;
            ivas.gov.bisp.enumeration.ak.V.aWg.b = r11 % 128;
            r11 = r11 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00d6, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00d7, code lost:
        
            r4 = r10.c.getTextSkewX();
            r5 = r11.c;
            r7 = ivas.gov.bisp.enumeration.ak.V.aWg.b;
            r8 = r7 ^ 99;
            r7 = -(-((r7 & 99) << 1));
            r9 = ((r8 | r7) << 1) - (r7 ^ r8);
            ivas.gov.bisp.enumeration.ak.V.aWg.a = r9 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00f2, code lost:
        
            if ((r9 % 2) == 0) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00fa, code lost:
        
            if (r4 == r5.getTextSkewX()) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00fc, code lost:
        
            r11 = ivas.gov.bisp.enumeration.ak.V.aWg.b + 53;
            r2 = r11 % 128;
            ivas.gov.bisp.enumeration.ak.V.aWg.a = r2;
            r11 = r11 % 2;
            r11 = ((r2 & 122) + (r2 | 122)) - 1;
            ivas.gov.bisp.enumeration.ak.V.aWg.b = r11 % 128;
            r11 = r11 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0111, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0112, code lost:
        
            r4 = r10.c.getLetterSpacing();
            r5 = r11.c;
            r7 = ivas.gov.bisp.enumeration.ak.V.aWg.b;
            r8 = r7 & 15;
            r8 = (r8 - (~(-(-((r7 ^ 15) | r8))))) - 1;
            ivas.gov.bisp.enumeration.ak.V.aWg.a = r8 % 128;
            r8 = r8 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0131, code lost:
        
            if (r4 == r5.getLetterSpacing()) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0133, code lost:
        
            r11 = ivas.gov.bisp.enumeration.ak.V.aWg.a;
            r2 = (((r11 ^ 59) | (r11 & 59)) << 1) - (((~r11) & 59) | (r11 & (-60)));
            ivas.gov.bisp.enumeration.ak.V.aWg.b = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0147, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0148, code lost:
        
            r4 = r10.c.getFontFeatureSettings();
            r5 = r11.c.getFontFeatureSettings();
            r7 = ivas.gov.bisp.enumeration.ak.V.aWg.a;
            r8 = (r7 ^ 115) + ((r7 & 115) << 1);
            ivas.gov.bisp.enumeration.ak.V.aWg.b = r8 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0161, code lost:
        
            if ((r8 % 2) != 0) goto L95;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0167, code lost:
        
            if (android.text.TextUtils.equals(r4, r5) == true) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0169, code lost:
        
            r11 = ivas.gov.bisp.enumeration.ak.V.aWg.b + 13;
            r2 = r11 % 128;
            ivas.gov.bisp.enumeration.ak.V.aWg.a = r2;
            r11 = r11 % 2;
            r11 = ((r2 | 81) << 1) - (r2 ^ 81);
            ivas.gov.bisp.enumeration.ak.V.aWg.b = r11 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x017d, code lost:
        
            if ((r11 % 2) == 0) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x017f, code lost:
        
            r11 = 81 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0182, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0183, code lost:
        
            r4 = r10.c.getFlags();
            r5 = r11.c;
            r7 = ivas.gov.bisp.enumeration.ak.V.aWg.b;
            r8 = r7 & 79;
            r7 = -(-((r7 ^ 79) | r8));
            r9 = (r8 ^ r7) + ((r7 & r8) << 1);
            ivas.gov.bisp.enumeration.ak.V.aWg.a = r9 % 128;
            r9 = r9 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x01a2, code lost:
        
            if (r4 == r5.getFlags()) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x01a4, code lost:
        
            r11 = ivas.gov.bisp.enumeration.ak.V.aWg.b;
            r2 = r11 & 77;
            r2 = r2 + ((r11 ^ 77) | r2);
            ivas.gov.bisp.enumeration.ak.V.aWg.a = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x01b1, code lost:
        
            if ((r2 % 2) != 0) goto L101;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x01b4, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x01b7, code lost:
        
            if (r2 < 24) goto L65;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x01b9, code lost:
        
            r2 = ivas.gov.bisp.enumeration.ak.V.aWg.a;
            r4 = (r2 & 99) + (r2 | 99);
            ivas.gov.bisp.enumeration.ak.V.aWg.b = r4 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x01c5, code lost:
        
            if ((r4 % 2) == 0) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x01c7, code lost:
        
            r2 = r10.c.getTextLocales();
            r4 = r11.c;
            r5 = 7 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x01d2, code lost:
        
            r2 = r10.c.getTextLocales();
            r4 = r11.c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x01e2, code lost:
        
            if (r2.equals(r4.getTextLocales()) != false) goto L71;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x01e4, code lost:
        
            r11 = ivas.gov.bisp.enumeration.ak.V.aWg.a;
            r11 = (-2) - (((r11 & 62) + (r11 | 62)) ^ (-1));
            ivas.gov.bisp.enumeration.ak.V.aWg.b = r11 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
        
            if (r10.e != r11.e) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x01f4, code lost:
        
            if ((r11 % 2) == 0) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x01f7, code lost:
        
            r1 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x01fa, code lost:
        
            return !r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x01fb, code lost:
        
            r2 = r10.c.getTextLocale();
            r4 = r11.c;
            r5 = ivas.gov.bisp.enumeration.ak.V.aWg.a;
            r7 = (r5 ^ 69) + ((r5 & 69) << 1);
            ivas.gov.bisp.enumeration.ak.V.aWg.b = r7 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x0210, code lost:
        
            if ((r7 % 2) != 0) goto L93;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x021a, code lost:
        
            if (r2.equals(r4.getTextLocale()) != false) goto L71;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x021c, code lost:
        
            r11 = ivas.gov.bisp.enumeration.ak.V.aWg.b;
            r2 = ((r11 ^ 74) + ((r11 & 74) << 1)) - 1;
            ivas.gov.bisp.enumeration.ak.V.aWg.a = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x022a, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x0231, code lost:
        
            if (r10.c.getTypeface() != null) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x0233, code lost:
        
            r2 = ivas.gov.bisp.enumeration.ak.V.aWg.a;
            r4 = r2 & 27;
            r2 = -(-((r2 ^ 27) | r4));
            r5 = (r4 ^ r2) + ((r2 & r4) << 1);
            ivas.gov.bisp.enumeration.ak.V.aWg.b = r5 % 128;
            r5 = r5 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x024c, code lost:
        
            if (r11.c.getTypeface() == null) goto L89;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x024e, code lost:
        
            r11 = ivas.gov.bisp.enumeration.ak.V.aWg.a;
            r11 = (-2) - ((((r11 | 28) << 1) - (r11 ^ 28)) ^ (-1));
            r2 = r11 % 128;
            ivas.gov.bisp.enumeration.ak.V.aWg.b = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x025f, code lost:
        
            if ((r11 % 2) == 0) goto L78;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x0261, code lost:
        
            r11 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x0263, code lost:
        
            r11 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x0264, code lost:
        
            r4 = r2 & 109;
            r4 = (r4 - (~(-(-((r2 ^ 109) | r4))))) - 1;
            ivas.gov.bisp.enumeration.ak.V.aWg.a = r4 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x0273, code lost:
        
            if ((r4 % 2) != 0) goto L82;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x0275, code lost:
        
            r0 = 8 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x0278, code lost:
        
            return r11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x0279, code lost:
        
            r2 = r10.c.getTypeface();
            r11 = r11.c;
            r4 = ivas.gov.bisp.enumeration.ak.V.aWg.a;
            r5 = ((r4 ^ 26) + ((r4 & 26) << 1)) - 1;
            ivas.gov.bisp.enumeration.ak.V.aWg.b = r5 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x0290, code lost:
        
            if ((r5 % 2) != 0) goto L91;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x029b, code lost:
        
            if ((!r2.equals(r11.getTypeface())) == false) goto L89;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x029d, code lost:
        
            r11 = ivas.gov.bisp.enumeration.ak.V.aWg.a;
            r2 = ((r11 ^ 115) - (~((r11 & 115) << 1))) - 1;
            ivas.gov.bisp.enumeration.ak.V.aWg.b = r2 % 128;
            r2 = r2 % 2;
            r11 = r11 + 97;
            ivas.gov.bisp.enumeration.ak.V.aWg.b = r11 % 128;
            r11 = r11 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x02b3, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x02b4, code lost:
        
            r11 = ivas.gov.bisp.enumeration.ak.V.aWg.a + 111;
            ivas.gov.bisp.enumeration.ak.V.aWg.b = r11 % 128;
            r11 = r11 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        
            if (r10.e != r11.e) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x02bd, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x02be, code lost:
        
            r2.equals(r11.getTypeface());
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x02c5, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x02c6, code lost:
        
            r2.equals(r4.getTextLocale());
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x02cd, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x02ce, code lost:
        
            android.text.TextUtils.equals(r4, r5);
            r6.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x02d4, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x02d5, code lost:
        
            r5.getTextSkewX();
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x02d8, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x02d9, code lost:
        
            r5.getTextSize();
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
        
            r11 = ivas.gov.bisp.enumeration.ak.V.aWg.b;
            r2 = (r11 ^ 11) + ((r11 & 11) << 1);
            ivas.gov.bisp.enumeration.ak.V.aWg.a = r2 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean d(ivas.gov.bisp.enumeration.ak.V.aWg r11) {
            /*
                Method dump skipped, instruction units count: 733
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.ak.V.aWg.d(ivas.gov.bisp.enumeration.ak.V$aWg):boolean");
        }
    }
}
