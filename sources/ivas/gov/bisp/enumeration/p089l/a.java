package ivas.gov.bisp.enumeration.p089l;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.p081d.InterfaceC0286o;
import ivas.gov.bisp.enumeration.p081d.h;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a implements InterfaceC0286o {
    private static int a = 0;
    private static int b = 1;

    @Override // ivas.gov.bisp.enumeration.p081d.InterfaceC0286o
    public final h b(View view, h hVar) {
        int flags;
        TextView textView;
        CharSequence text;
        CharSequence charSequenceCoerceToStyledText;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 95;
        int i4 = (i2 | 95) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        if (Log.isLoggable("ReceiveContent", 3)) {
            int i8 = b;
            int i9 = ((i8 ^ 45) - (~(-(-((i8 & 45) << 1))))) - 1;
            a = i9 % 128;
            int i10 = i9 % 2;
            Objects.toString(hVar);
            if (i10 != 0) {
                int i11 = 8 / 0;
            }
            int i12 = b;
            int i13 = (i12 & 111) + (i12 | 111);
            a = i13 % 128;
            int i14 = i13 % 2;
        }
        if (hVar.c.c() == 2) {
            int i15 = a;
            int i16 = ((i15 ^ 3) | (i15 & 3)) << 1;
            int i17 = -((3 & (~i15)) | (i15 & (-4)));
            int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
            b = i18 % 128;
            int i19 = i18 % 2;
            int i20 = i15 + 11;
            b = i20 % 128;
            if (i20 % 2 == 0) {
                int i21 = 79 / 0;
            }
            return hVar;
        }
        ClipData clipDataB = hVar.c.b();
        h.aWp awp = hVar.c;
        int i22 = b;
        int i23 = i22 & 107;
        int i24 = -(-(i22 | 107));
        int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
        a = i25 % 128;
        if (i25 % 2 != 0) {
            flags = awp.getFlags();
            textView = (TextView) view;
            text = textView.getText();
            int i26 = 46 / 0;
        } else {
            flags = awp.getFlags();
            textView = (TextView) view;
            text = textView.getText();
        }
        int i27 = b;
        int i28 = ((i27 ^ 67) | (i27 & 67)) << 1;
        int i29 = 67;
        int i30 = -(((~i27) & 67) | (i27 & (-68)));
        int i31 = (i28 ^ i30) + ((i30 & i28) << 1);
        a = i31 % 128;
        int i32 = i31 % 2;
        Editable editable = (Editable) text;
        Context context = textView.getContext();
        int i33 = b;
        int i34 = i33 ^ 119;
        int i35 = (((i33 & 119) | i34) << 1) - i34;
        a = i35 % 128;
        int i36 = i35 % 2;
        int i37 = 0;
        boolean z = false;
        while (true) {
            Object obj = null;
            if (i37 >= clipDataB.getItemCount()) {
                int i38 = b;
                int i39 = (i38 | 65) << 1;
                int i40 = -(((~i38) & 65) | (i38 & (-66)));
                int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
                a = i41 % 128;
                if (i41 % 2 != 0) {
                    int i42 = 11 / 0;
                }
                return null;
            }
            int i43 = a;
            int i44 = i43 & 123;
            int i45 = -(-((i43 ^ 123) | i44));
            int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
            b = i46 % 128;
            int i47 = i46 % 2;
            ClipData.Item itemAt = clipDataB.getItemAt(i37);
            if ((flags & 1) != 0) {
                int i48 = b;
                int i49 = ((i48 ^ 67) | (i48 & 67)) << 1;
                int i50 = -((i48 & (-68)) | ((~i48) & i29));
                int i51 = (i49 ^ i50) + ((i50 & i49) << 1);
                a = i51 % 128;
                int i52 = i51 % 2;
                charSequenceCoerceToStyledText = itemAt.coerceToText(context);
                if (charSequenceCoerceToStyledText instanceof Spanned) {
                    int i53 = b;
                    int i54 = ((~i53) & 11) | (i53 & (-12));
                    int i55 = (11 & i53) << 1;
                    int i56 = ((i54 | i55) << 1) - (i54 ^ i55);
                    a = i56 % 128;
                    if (i56 % 2 != 0) {
                        charSequenceCoerceToStyledText = charSequenceCoerceToStyledText.toString();
                        int i57 = 38 / 0;
                    } else {
                        charSequenceCoerceToStyledText = charSequenceCoerceToStyledText.toString();
                    }
                }
            } else {
                charSequenceCoerceToStyledText = itemAt.coerceToStyledText(context);
                int i58 = b;
                int i59 = i58 & 49;
                int i60 = (i59 - (~(-(-((i58 ^ 49) | i59))))) - 1;
                a = i60 % 128;
                int i61 = i60 % 2;
            }
            if (charSequenceCoerceToStyledText != null) {
                int i62 = a;
                int i63 = i62 + 17;
                b = i63 % 128;
                int i64 = i63 % 2;
                if (z) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    int i65 = a;
                    int i66 = (-2) - (((i65 ^ 50) + ((i65 & 50) << 1)) ^ (-1));
                    b = i66 % 128;
                    if (i66 % 2 == 0) {
                        editable.insert(Selection.getSelectionEnd(editable), charSequenceCoerceToStyledText);
                        obj.hashCode();
                        throw null;
                    }
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceCoerceToStyledText);
                    int i67 = b;
                    int i68 = ((i67 ^ 79) | (i67 & 79)) << 1;
                    int i69 = -(((~i67) & 79) | (i67 & (-80)));
                    int i70 = (i68 ^ i69) + ((i69 & i68) << 1);
                    a = i70 % 128;
                    int i71 = i70 % 2;
                } else {
                    int i72 = ((i62 | 72) << 1) - (i62 ^ 72);
                    int i73 = (i72 ^ (-1)) + (i72 << 1);
                    b = i73 % 128;
                    if (i73 % 2 == 0) {
                        Selection.getSelectionStart(editable);
                        Selection.getSelectionEnd(editable);
                        throw null;
                    }
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int i74 = a;
                    int i75 = i74 & 97;
                    int i76 = (i74 | 97) & (~i75);
                    int i77 = i75 << 1;
                    int i78 = (i76 ^ i77) + ((i76 & i77) << 1);
                    b = i78 % 128;
                    int i79 = i78 % 2;
                    int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    int i80 = a;
                    int i81 = (i80 & (-98)) | ((~i80) & 97);
                    int i82 = -(-((i80 & 97) << 1));
                    int i83 = (i81 & i82) + (i82 | i81);
                    b = i83 % 128;
                    int i84 = i83 % 2;
                    Selection.setSelection(editable, iMax2);
                    editable.replace(iMax, iMax2, charSequenceCoerceToStyledText);
                    int i85 = a;
                    int i86 = i85 & 117;
                    int i87 = i86 + ((i85 ^ 117) | i86);
                    b = i87 % 128;
                    int i88 = i87 % 2;
                    int i89 = i85 + 37;
                    b = i89 % 128;
                    int i90 = i89 % 2;
                    z = true;
                }
            }
            int i91 = i37 ^ (-111);
            int i92 = -(-((i37 & (-111)) << 1));
            int i93 = ((i91 | i92) << 1) - (i92 ^ i91);
            int i94 = i93 & 112;
            int i95 = (i93 ^ 112) | i94;
            i37 = ((i94 & i95) << 1) + (i94 ^ i95);
            int i96 = a;
            int i97 = ((i96 ^ 98) + ((i96 & 98) << 1)) - 1;
            b = i97 % 128;
            int i98 = i97 % 2;
            i29 = 67;
        }
    }
}
