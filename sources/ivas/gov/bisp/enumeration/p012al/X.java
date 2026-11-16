package ivas.gov.bisp.enumeration.p012al;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.inputmethod.EditorInfo;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class X {
    private static int a = 0;
    public static final String[] c = new String[0];
    private static int b = 83 % 128;

    static {
        int i = 83 % 2;
    }

    public static boolean b(CharSequence charSequence, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = ((i4 ^ 32) + ((i4 & 32) << 1)) - 1;
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        if (i2 == 0) {
            boolean zIsLowSurrogate = Character.isLowSurrogate(charSequence.charAt(i));
            int i8 = b;
            int i9 = i8 & 47;
            int i10 = (i8 | 47) & (~i9);
            int i11 = -(-(i9 << 1));
            int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
            a = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 66 / 0;
            }
            return zIsLowSurrogate;
        }
        int i14 = (-2) - ((((i6 | 72) << 1) - (i6 ^ 72)) ^ (-1));
        a = i14 % 128;
        if (i14 % 2 == 0 ? i2 == 1 : i2 == 1) {
            boolean zIsHighSurrogate = Character.isHighSurrogate(charSequence.charAt(i));
            int i15 = b + 85;
            a = i15 % 128;
            if (i15 % 2 == 0) {
                return zIsHighSurrogate;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i16 = i6 + 8;
        int i17 = (i16 ^ (-1)) + (i16 << 1);
        int i18 = i17 % 128;
        a = i18;
        int i19 = i17 % 2;
        int i20 = (i18 ^ 47) + ((i18 & 47) << 1);
        b = i20 % 128;
        int i21 = i20 % 2;
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    public static void c(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        SpannableStringBuilder spannableStringBuilder;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 109;
        int i6 = (((i4 ^ 109) | i5) << 1) - ((i4 | 109) & (~i5));
        b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 64 / 0;
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
                int i8 = b;
                int i9 = i8 & 7;
                int i10 = ((i8 ^ 7) | i9) << 1;
                int i11 = -((i8 | 7) & (~i9));
                int i12 = (i10 & i11) + (i11 | i10);
                a = i12 % 128;
                int i13 = i12 % 2;
            }
        } else if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
            int i14 = b;
            int i15 = i14 & 7;
            int i16 = ((i14 ^ 7) | i15) << 1;
            int i17 = -((i14 | 7) & (~i15));
            int i18 = (i16 & i17) + (i17 | i16);
            a = i18 % 128;
            int i19 = i18 % 2;
        }
        Object obj = null;
        if (charSequence != null) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
            int i20 = a;
            int i21 = (i20 & 123) + (i20 | 123);
            b = i21 % 128;
            int i22 = i21 % 2;
        } else {
            int i23 = b;
            int i24 = i23 & 81;
            int i25 = i24 + ((i23 ^ 81) | i24);
            a = i25 % 128;
            int i26 = i25 % 2;
            spannableStringBuilder = null;
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", spannableStringBuilder);
        Bundle bundle = editorInfo.extras;
        int i27 = b + 111;
        a = i27 % 128;
        int i28 = i27 % 2;
        bundle.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
        int i29 = a + 63;
        b = i29 % 128;
        if (i29 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
