package ivas.gov.bisp.enumeration.p013am;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.p014an.ar;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class t extends ReplacementSpan {
    private static int a = 1;
    private static int b;
    public final P d;
    public final Paint.FontMetricsInt c = new Paint.FontMetricsInt();
    public short e = -1;
    public float f = 1.0f;

    public t(P p) {
        r.k(p, "metadata cannot be null");
        this.d = p;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int iAbs;
        int iC;
        short s;
        int i3 = 2 % 2;
        int i4 = b + 31;
        a = i4 % 128;
        int i5 = i4 % 2;
        paint.getFontMetricsInt(this.c);
        Paint.FontMetricsInt fontMetricsInt2 = this.c;
        int i6 = a;
        int i7 = i6 & 25;
        int i8 = ((i6 | 25) & (~i7)) + (i7 << 1);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            iAbs = Math.abs(fontMetricsInt2.descent >>> fontMetricsInt2.ascent);
        } else {
            int i9 = fontMetricsInt2.descent;
            int i10 = -fontMetricsInt2.ascent;
            int i11 = i9 & i10;
            iAbs = Math.abs(i11 + ((i10 ^ i9) | i11));
        }
        float f = iAbs;
        int i12 = b + 65;
        a = i12 % 128;
        int i13 = i12 % 2;
        this.f = (f * 1.0f) / this.d.e();
        int i14 = b;
        int i15 = i14 & 87;
        int i16 = i15 + ((i14 ^ 87) | i15);
        a = i16 % 128;
        Object obj = null;
        if (i16 % 2 == 0) {
            this.d.e();
            this.d.g();
            obj.hashCode();
            throw null;
        }
        this.d.e();
        ar arVarG = this.d.g();
        int i17 = b;
        int i18 = i17 | 113;
        int i19 = i18 << 1;
        int i20 = -((~(i17 & 113)) & i18);
        int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
        a = i21 % 128;
        if (i21 % 2 != 0 ? (iC = arVarG.c(12)) == 0 : (iC = arVarG.c(25)) == 0) {
            int i22 = b;
            int i23 = (i22 & (-4)) | ((~i22) & 3);
            int i24 = (i22 & 3) << 1;
            int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
            a = i25 % 128;
            int i26 = i25 % 2;
            s = 0;
        } else {
            int i27 = b;
            int i28 = (i27 ^ 59) + ((i27 & 59) << 1);
            a = i28 % 128;
            if (i28 % 2 == 0) {
                ByteBuffer byteBuffer = arVarG.d;
                int i29 = (iC - (~(-(~(-arVarG.c))))) - 1;
                s = byteBuffer.getShort((i29 ^ (-1)) + (i29 << 1));
            } else {
                ByteBuffer byteBuffer2 = arVarG.d;
                int i30 = -(~arVarG.c);
                s = byteBuffer2.getShort((-2) - (((iC & i30) + (i30 | iC)) ^ (-1)));
            }
            int i31 = a;
            int i32 = i31 & 41;
            int i33 = (((i31 ^ 41) | i32) << 1) - ((i31 | 41) & (~i32));
            b = i33 % 128;
            if (i33 % 2 != 0) {
                int i34 = 2 % 4;
            }
        }
        short s2 = (short) (s * this.f);
        this.e = s2;
        int i35 = a;
        int i36 = (i35 ^ 77) + ((i35 & 77) << 1);
        int i37 = i36 % 128;
        b = i37;
        int i38 = i36 % 2;
        if (fontMetricsInt != null) {
            int i39 = i37 ^ 37;
            int i40 = ((i37 & 37) | i39) << 1;
            int i41 = -i39;
            int i42 = (i40 ^ i41) + ((i40 & i41) << 1);
            a = i42 % 128;
            if (i42 % 2 == 0) {
                fontMetricsInt.ascent = this.c.ascent;
                throw null;
            }
            Paint.FontMetricsInt fontMetricsInt3 = this.c;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            int i43 = fontMetricsInt3.top;
            int i44 = b;
            int i45 = ((i44 & 4) + (i44 | 4)) - 1;
            a = i45 % 128;
            int i46 = i45 % 2;
            fontMetricsInt.top = i43;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
            int i47 = a;
            int i48 = i47 & 43;
            int i49 = -(-(i47 | 43));
            int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
            b = i50 % 128;
            int i51 = i50 % 2;
        }
        int i52 = b + 48;
        int i53 = (i52 ^ (-1)) + (i52 << 1);
        a = i53 % 128;
        if (i53 % 2 != 0) {
            return s2;
        }
        obj.hashCode();
        throw null;
    }
}
