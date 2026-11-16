package ivas.gov.bisp.enumeration.bM;

import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.b;
import ivas.gov.bisp.enumeration.p013am.t;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bM.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0129v extends InputConnectionWrapper {
    private static int a = 0;
    private static int b = 1;
    public final TextView c;
    public final bxW d;

    /* JADX WARN: Code duplicated, block: B:13:0x0045  */
    /* JADX WARN: Code duplicated, block: B:15:0x0049  */
    /* JADX WARN: Code duplicated, block: B:18:0x0062  */
    /* JADX WARN: Code duplicated, block: B:22:0x0081  */
    public C0129v(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i;
        int i2;
        bxW bxw = new bxW();
        super(inputConnection, false);
        this.c = textView;
        this.d = bxw;
        if (b.d()) {
            b bVarC = b.c();
            if (!(!bVarC.g())) {
                int i3 = a;
                int i4 = ((i3 ^ 11) | (i3 & 11)) << 1;
                int i5 = -(((~i3) & 11) | (i3 & (-12)));
                int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
                b = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 11 / 0;
                    if (editorInfo != null) {
                        if (editorInfo.extras == null) {
                            editorInfo.extras = new Bundle();
                            int i8 = b;
                            int i9 = i8 ^ 43;
                            i2 = (((i8 & 43) | i9) << 1) - i9;
                            a = i2 % 128;
                            if (i2 % 2 == 0) {
                                int i10 = 2 % 2;
                            }
                        }
                        bVarC.i.d(editorInfo);
                        int i11 = b;
                        i = (((i11 ^ 101) | (i11 & 101)) << 1) - (((~i11) & 101) | (i11 & (-102)));
                        a = i % 128;
                        if (i % 2 == 0) {
                            int i12 = 2 % 2;
                        }
                    }
                } else if (editorInfo != null) {
                    if (editorInfo.extras == null) {
                        editorInfo.extras = new Bundle();
                        int i13 = b;
                        int i14 = i13 ^ 43;
                        i2 = (((i13 & 43) | i14) << 1) - i14;
                        a = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i15 = 2 % 2;
                        }
                    }
                    bVarC.i.d(editorInfo);
                    int i16 = b;
                    i = (((i16 ^ 101) | (i16 & 101)) << 1) - (((~i16) & 101) | (i16 & (-102)));
                    a = i % 128;
                    if (i % 2 == 0) {
                        int i17 = 2 % 2;
                    }
                }
            }
        }
        int i18 = a;
        int i19 = i18 & 9;
        int i20 = -(-((i18 ^ 9) | i19));
        int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
        b = i21 % 128;
        int i22 = i21 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0071  */
    /* JADX WARN: Code duplicated, block: B:20:0x0093  */
    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = b;
        boolean z = true;
        int i5 = (((i4 | 94) << 1) - (i4 ^ 94)) - 1;
        a = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            this.c.getEditableText();
            obj.hashCode();
            throw null;
        }
        bxW bxw = this.d;
        Editable editableText = this.c.getEditableText();
        int i6 = b;
        int i7 = i6 | 45;
        int i8 = i7 << 1;
        int i9 = -((~(i6 & 45)) & i7);
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        a = i10 % 128;
        if (i10 % 2 == 0 ? !(!bxw.c(this, editableText, i, i2, false)) : bxw.c(this, editableText, i, i2, true)) {
            int i11 = a;
            int i12 = (i11 & 99) + (i11 | 99);
            b = i12 % 128;
            int i13 = i12 % 2;
        } else {
            int i14 = b;
            int i15 = i14 & 21;
            int i16 = -(-((i14 ^ 21) | i15));
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            a = i17 % 128;
            if (i17 % 2 != 0) {
                boolean zDeleteSurroundingText = super.deleteSurroundingText(i, i2);
                int i18 = 57 / 0;
                if (zDeleteSurroundingText) {
                    int i19 = a;
                    int i110 = (i19 & 99) + (i19 | 99);
                    b = i110 % 128;
                    int i111 = i110 % 2;
                } else {
                    int i20 = b;
                    int i21 = (((i20 ^ 51) | (i20 & 51)) << 1) - (((~i20) & 51) | (i20 & (-52)));
                    int i22 = i21 % 128;
                    a = i22;
                    int i23 = i21 % 2;
                    int i24 = (i22 ^ 71) + ((i22 & 71) << 1);
                    b = i24 % 128;
                    int i25 = i24 % 2;
                    z = false;
                }
            } else if (super.deleteSurroundingText(i, i2)) {
                int i112 = a;
                int i113 = (i112 & 99) + (i112 | 99);
                b = i113 % 128;
                int i114 = i113 % 2;
            } else {
                int i26 = b;
                int i27 = (((i26 ^ 51) | (i26 & 51)) << 1) - (((~i26) & 51) | (i26 & (-52)));
                int i28 = i27 % 128;
                a = i28;
                int i29 = i27 % 2;
                int i210 = (i28 ^ 71) + ((i28 & 71) << 1);
                b = i210 % 128;
                int i211 = i210 % 2;
                z = false;
            }
        }
        int i30 = a;
        int i31 = i30 & 45;
        int i32 = i31 + ((i30 ^ 45) | i31);
        b = i32 % 128;
        if (i32 % 2 != 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0078  */
    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 51;
        int i6 = (((i4 ^ 51) | i5) << 1) - ((i4 | 51) & (~i5));
        b = i6 % 128;
        int i7 = i6 % 2;
        bxW bxw = this.d;
        Editable editableText = this.c.getEditableText();
        int i8 = a;
        int i9 = i8 & 45;
        int i10 = ((i8 ^ 45) | i9) << 1;
        int i11 = -((i8 | 45) & (~i9));
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        b = i12 % 128;
        int i13 = i12 % 2;
        if (bxw.c(this, editableText, i, i2, true)) {
            int i14 = (-2) - ((b + 54) ^ (-1));
            a = i14 % 128;
            int i15 = i14 % 2;
            z = true;
        } else {
            int i16 = a;
            int i17 = ((i16 & (-48)) | ((~i16) & 47)) + ((i16 & 47) << 1);
            b = i17 % 128;
            int i18 = i17 % 2;
            if (super.deleteSurroundingTextInCodePoints(i, i2)) {
                int i19 = (-2) - ((b + 54) ^ (-1));
                a = i19 % 128;
                int i110 = i19 % 2;
                z = true;
            } else {
                int i20 = a;
                int i21 = ((i20 ^ 87) | (i20 & 87)) << 1;
                int i22 = -((i20 & (-88)) | ((~i20) & 87));
                int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
                b = i23 % 128;
                int i24 = i23 % 2;
                int i25 = i20 + 41;
                b = i25 % 128;
                int i26 = i25 % 2;
                z = false;
            }
        }
        int i27 = a;
        int i28 = i27 & 13;
        int i29 = (i27 | 13) & (~i28);
        int i30 = i28 << 1;
        int i31 = (i29 ^ i30) + ((i29 & i30) << 1);
        b = i31 % 128;
        int i32 = i31 % 2;
        return z;
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bM.v$bxW */
    public static class bxW {
        private static int a = 1;
        private static int b;

        /* JADX WARN: Code duplicated, block: B:101:0x031e  */
        /* JADX WARN: Code duplicated, block: B:102:0x0335  */
        /* JADX WARN: Code duplicated, block: B:106:0x036b  */
        /* JADX WARN: Code duplicated, block: B:110:0x038e A[EDGE_INSN: B:110:0x038e->B:111:0x038f BREAK  A[LOOP:3: B:81:0x025b->B:173:0x025b, LOOP_LABEL: LOOP:3: B:81:0x025b->B:173:0x025b]] */
        /* JADX WARN: Code duplicated, block: B:112:0x0391  */
        /* JADX WARN: Code duplicated, block: B:114:0x03a3 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:115:0x03a5  */
        /* JADX WARN: Code duplicated, block: B:118:0x03ce  */
        /* JADX WARN: Code duplicated, block: B:11:0x003e A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:120:0x03e0  */
        /* JADX WARN: Code duplicated, block: B:122:0x03ed  */
        /* JADX WARN: Code duplicated, block: B:123:0x03f0  */
        /* JADX WARN: Code duplicated, block: B:126:0x0407  */
        /* JADX WARN: Code duplicated, block: B:128:0x0435  */
        /* JADX WARN: Code duplicated, block: B:129:0x043d  */
        /* JADX WARN: Code duplicated, block: B:12:0x0040  */
        /* JADX WARN: Code duplicated, block: B:133:0x046c  */
        /* JADX WARN: Code duplicated, block: B:134:0x0493  */
        /* JADX WARN: Code duplicated, block: B:136:0x049d  */
        /* JADX WARN: Code duplicated, block: B:137:0x049e  */
        /* JADX WARN: Code duplicated, block: B:139:0x04a2  */
        /* JADX WARN: Code duplicated, block: B:141:0x04a6  */
        /* JADX WARN: Code duplicated, block: B:142:0x04a7  */
        /* JADX WARN: Code duplicated, block: B:143:0x04b4  */
        /* JADX WARN: Code duplicated, block: B:145:0x04bb  */
        /* JADX WARN: Code duplicated, block: B:14:0x0053  */
        /* JADX WARN: Code duplicated, block: B:150:0x04db  */
        /* JADX WARN: Code duplicated, block: B:166:0x038e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:167:0x038c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:168:0x0388 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:169:0x0281 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:16:0x0061  */
        /* JADX WARN: Code duplicated, block: B:170:0x038e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:171:0x02ec A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:172:0x02c7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:176:0x0365 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:177:0x029e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:178:0x0302 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:18:0x006b  */
        /* JADX WARN: Code duplicated, block: B:20:0x0083 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:21:0x0085  */
        /* JADX WARN: Code duplicated, block: B:23:0x0092 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:24:0x0094  */
        /* JADX WARN: Code duplicated, block: B:26:0x009d  */
        /* JADX WARN: Code duplicated, block: B:29:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:30:0x00ec  */
        /* JADX WARN: Code duplicated, block: B:32:0x010d  */
        /* JADX WARN: Code duplicated, block: B:48:0x015f  */
        /* JADX WARN: Code duplicated, block: B:50:0x0172 A[EDGE_INSN: B:50:0x0172->B:71:0x0219 BREAK  A[LOOP:1: B:37:0x011c->B:59:0x0198, LOOP_LABEL: LOOP:1: B:37:0x011c->B:59:0x0198]] */
        /* JADX WARN: Code duplicated, block: B:51:0x0175 A[EDGE_INSN: B:51:0x0175->B:71:0x0219 BREAK  A[LOOP:1: B:37:0x011c->B:59:0x0198, LOOP_LABEL: LOOP:1: B:37:0x011c->B:59:0x0198]] */
        /* JADX WARN: Code duplicated, block: B:70:0x020b A[EDGE_INSN: B:70:0x020b->B:71:0x0219 BREAK  A[LOOP:1: B:37:0x011c->B:59:0x0198, LOOP_LABEL: LOOP:1: B:37:0x011c->B:59:0x0198]] */
        /* JADX WARN: Code duplicated, block: B:73:0x0230  */
        /* JADX WARN: Code duplicated, block: B:75:0x0241  */
        /* JADX WARN: Code duplicated, block: B:78:0x0247 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:79:0x0249  */
        /* JADX WARN: Code duplicated, block: B:81:0x025b A[LOOP:3: B:81:0x025b->B:173:0x025b, LOOP_LABEL: LOOP:3: B:81:0x025b->B:173:0x025b, LOOP_START, PHI: r2 r9
  0x025b: PHI (r2v9 int) = (r2v1 int), (r2v28 int) binds: [B:80:0x0259, B:173:0x025b] A[DONT_GENERATE, DONT_INLINE]
  0x025b: PHI (r9v16 int) = (r9v14 int), (r9v24 int) binds: [B:80:0x0259, B:173:0x025b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:83:0x026b  */
        /* JADX WARN: Code duplicated, block: B:85:0x027f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:87:0x0283  */
        /* JADX WARN: Code duplicated, block: B:88:0x0295 A[EDGE_INSN: B:88:0x0295->B:111:0x038f BREAK  A[LOOP:3: B:81:0x025b->B:173:0x025b, LOOP_LABEL: LOOP:3: B:81:0x025b->B:173:0x025b]] */
        /* JADX WARN: Code duplicated, block: B:89:0x0298  */
        /* JADX WARN: Code duplicated, block: B:93:0x02b2  */
        /* JADX WARN: Code duplicated, block: B:97:0x02fc  */
        /* JADX WARN: Code duplicated, block: B:9:0x002a  */
        public boolean c(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
            int i3;
            int i4;
            Object obj;
            int i5;
            int selectionStart;
            int selectionEnd;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int iMin;
            int iMax;
            int length;
            int i12;
            int iMax2;
            int i13;
            int i14;
            int i15;
            int i16;
            boolean z2;
            int i17;
            int i18;
            char cCharAt;
            int i19;
            int i20;
            int i21;
            t[] tVarArr;
            int i22;
            int i23;
            int length2;
            int i24;
            int iMax3;
            int iMin2;
            int i25;
            boolean z3;
            int spanStart;
            int i26;
            int i27;
            int i28 = 2 % 2;
            int i29 = b;
            int i30 = i29 & 33;
            int i31 = (i29 ^ 33) | i30;
            int i32 = (i30 & i31) + (i31 | i30);
            a = i32 % 128;
            if (i32 % 2 != 0) {
                Object obj2 = b.a;
                if (editable != null) {
                    i3 = b;
                    int i33 = (i3 ^ 120) + ((i3 & 120) << 1);
                    i4 = (i33 ^ (-1)) + (i33 << 1);
                    a = i4 % 128;
                    obj = null;
                    if (i4 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (i >= 0) {
                        int i34 = i3 & 43;
                        int i35 = (~i34) & (i3 | 43);
                        int i36 = i34 << 1;
                        int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
                        a = i37 % 128;
                        int i38 = i37 % 2;
                        if (i2 >= 0) {
                            i5 = (((i3 | 44) << 1) - (i3 ^ 44)) - 1;
                            a = i5 % 128;
                            if (i5 % 2 != 0) {
                                Selection.getSelectionStart(editable);
                                Selection.getSelectionEnd(editable);
                                throw null;
                            }
                            selectionStart = Selection.getSelectionStart(editable);
                            selectionEnd = Selection.getSelectionEnd(editable);
                            if (selectionStart != -1) {
                                i6 = a;
                                int i39 = (i6 & (-104)) | ((~i6) & 103);
                                int i40 = (i6 & 103) << 1;
                                i7 = (i39 ^ i40) + ((i39 & i40) << 1);
                                b = i7 % 128;
                                if (i7 % 2 == 0) {
                                    throw null;
                                }
                                if (selectionEnd != -1) {
                                    i8 = (i6 ^ 47) + ((i6 & 47) << 1);
                                    b = i8 % 128;
                                    if (i8 % 2 == 0) {
                                        obj.hashCode();
                                        throw null;
                                    }
                                    if (selectionStart == selectionEnd) {
                                        i9 = i6 + 43;
                                        int i41 = i9 % 128;
                                        b = i41;
                                        if (i9 % 2 != 0) {
                                            int i42 = 4 / 3;
                                        }
                                        int i43 = i41 ^ 27;
                                        int i44 = (i41 & 27) << 1;
                                        int i45 = (i43 ^ i44) + ((i43 & i44) << 1);
                                        i10 = i45 % 128;
                                        a = i10;
                                        int i46 = i45 % 2;
                                        if (!z) {
                                            int i47 = -i;
                                            int i48 = selectionStart & i47;
                                            iMin = Math.max(((i47 | selectionStart) & (~i48)) + (i48 << 1), 0);
                                            int i49 = -(-i2);
                                            int i50 = selectionEnd & i49;
                                            int i51 = ((selectionEnd ^ i49) | i50) << 1;
                                            int i52 = -((i49 | selectionEnd) & (~i50));
                                            int i53 = (i51 & i52) + (i52 | i51);
                                            int length3 = editable.length();
                                            int i54 = b + 17;
                                            a = i54 % 128;
                                            int i55 = i54 % 2;
                                            iMax2 = Math.min(i53, length3);
                                            int i56 = a + 113;
                                            b = i56 % 128;
                                            int i57 = i56 % 2;
                                        } else {
                                            int i58 = (-2) - ((i10 + 50) ^ (-1));
                                            b = i58 % 128;
                                            int i59 = i58 % 2;
                                            int iMax4 = Math.max(i, 0);
                                            int length4 = editable.length();
                                            int i60 = b;
                                            int i61 = i60 & 31;
                                            i11 = i61 + ((i60 ^ 31) | i61);
                                            a = i11 % 128;
                                            if (i11 % 2 != 0) {
                                                obj.hashCode();
                                                throw null;
                                            }
                                            if (selectionStart < 0) {
                                                int i62 = a + 62;
                                                int i63 = (i62 ^ (-1)) + (i62 << 1);
                                                b = i63 % 128;
                                                int i64 = i63 % 2;
                                                iMin = -1;
                                                break loop1;
                                            }
                                            int i65 = a + 62;
                                            int i66 = (i65 ^ (-1)) + (i65 << 1);
                                            b = i66 % 128;
                                            int i67 = i66 % 2;
                                            iMin = -1;
                                            break loop1;
                                            iMax = Math.max(i2, 0);
                                            length = editable.length();
                                            int i68 = a + 12;
                                            int i69 = (i68 ^ (-1)) + (i68 << 1);
                                            i12 = i69 % 128;
                                            b = i12;
                                            int i70 = i69 % 2;
                                            if (selectionEnd >= 0) {
                                                iMax2 = -1;
                                                break loop3;
                                            }
                                            int i71 = ((i12 | 52) << 1) - (i12 ^ 52);
                                            i15 = (i71 ^ (-1)) + (i71 << 1);
                                            i16 = i15 % 128;
                                            a = i16;
                                            if (i15 % 2 == 0) {
                                                if (length >= selectionEnd) {
                                                    int i72 = i16 & 7;
                                                    int i73 = -(-(i16 | 7));
                                                    int i74 = ((i72 | i73) << 1) - (i72 ^ i73);
                                                    b = i74 % 128;
                                                    int i75 = i74 % 2;
                                                    if (iMax >= 0) {
                                                        loop3: while (true) {
                                                            int i76 = b;
                                                            int i77 = ((i76 | 45) << 1) - (i76 ^ 45);
                                                            a = i77 % 128;
                                                            int i78 = i77 % 2;
                                                            z2 = false;
                                                            while (true) {
                                                                if (iMax != 0) {
                                                                    iMax2 = selectionEnd;
                                                                    break loop3;
                                                                }
                                                                i17 = a;
                                                                int i79 = i17 & 23;
                                                                i18 = (((i17 ^ 23) | i79) << 1) - ((~i79) & (i17 | 23));
                                                                b = i18 % 128;
                                                                if (i18 % 2 == 0) {
                                                                    obj.hashCode();
                                                                    throw null;
                                                                }
                                                                if (selectionEnd >= length) {
                                                                    cCharAt = editable.charAt(selectionEnd);
                                                                    if (z2) {
                                                                        int i80 = b;
                                                                        int i81 = ((i80 & 26) + (i80 | 26)) - 1;
                                                                        a = i81 % 128;
                                                                        int i82 = i81 % 2;
                                                                        if (Character.isLowSurrogate(cCharAt)) {
                                                                            int i83 = b;
                                                                            int i84 = i83 ^ 29;
                                                                            int i85 = -(-((i83 & 29) << 1));
                                                                            i19 = ((i84 | i85) << 1) - (i85 ^ i84);
                                                                            a = i19 % 128;
                                                                            if (i19 % 2 == 0) {
                                                                                int i86 = (iMax | 110) << 1;
                                                                                int i87 = -(iMax ^ 110);
                                                                                int i88 = ((i86 | i87) << 1) - (i87 ^ i86);
                                                                                int i89 = (i88 & 60) | ((~i88) & (-61));
                                                                                int i90 = (i88 & (-61)) << 1;
                                                                                selectionEnd = (((selectionEnd | 7) << 1) - (selectionEnd ^ 7)) - 1;
                                                                                iMax = ((i89 | i90) << 1) - (i89 ^ i90);
                                                                            } else {
                                                                                selectionEnd = ((selectionEnd ^ 2) + ((selectionEnd & 2) << 1)) - 1;
                                                                                iMax = (iMax ^ (-1)) + (iMax << 1);
                                                                            }
                                                                        }
                                                                    } else if (!Character.isSurrogate(cCharAt)) {
                                                                        int i91 = b;
                                                                        int i92 = ((i91 ^ 125) | (i91 & 125)) << 1;
                                                                        int i93 = -(((~i91) & 125) | (i91 & (-126)));
                                                                        i20 = (i92 ^ i93) + ((i93 & i92) << 1);
                                                                        int i94 = i20 % 128;
                                                                        a = i94;
                                                                        if (i20 % 2 == 0) {
                                                                            int i95 = selectionEnd & 126;
                                                                            selectionEnd = ((((selectionEnd ^ 126) | i95) << 1) - (~(-((selectionEnd | 126) & (~i95))))) - 1;
                                                                            iMax = ((iMax | 75) << 1) - (iMax ^ 75);
                                                                        } else {
                                                                            int i96 = (iMax & 37) + (iMax | 37);
                                                                            int i97 = (i96 ^ (-1)) + (i96 << 1);
                                                                            iMax = (-2) - ((((i97 | (-36)) << 1) - (i97 ^ (-36))) ^ (-1));
                                                                            selectionEnd = ((selectionEnd & 1) - (~(-(-(selectionEnd | 1))))) - 1;
                                                                        }
                                                                        int i98 = (i94 & (-104)) | ((~i94) & 103);
                                                                        int i99 = (i94 & 103) << 1;
                                                                        int i100 = (i98 & i99) + (i99 | i98);
                                                                        b = i100 % 128;
                                                                        int i101 = i100 % 2;
                                                                    } else if (!Character.isLowSurrogate(cCharAt)) {
                                                                        int i102 = a;
                                                                        int i103 = ((i102 | 23) << 1) - (i102 ^ 23);
                                                                        int i104 = i103 % 128;
                                                                        b = i104;
                                                                        int i105 = i103 % 2;
                                                                        selectionEnd++;
                                                                        int i106 = ((i104 | 105) << 1) - (i104 ^ 105);
                                                                        a = i106 % 128;
                                                                        int i107 = i106 % 2;
                                                                        z2 = true;
                                                                    }
                                                                } else {
                                                                    if (z2) {
                                                                        iMax2 = length;
                                                                        break loop3;
                                                                    }
                                                                    int i108 = i17 & 109;
                                                                    int i109 = (~i108) & (i17 | 109);
                                                                    int i110 = i108 << 1;
                                                                    int i111 = (i109 & i110) + (i110 | i109);
                                                                    b = i111 % 128;
                                                                    int i112 = i111 % 2;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                int i113 = 47 / 0;
                                                if (length >= selectionEnd) {
                                                    int i710 = i16 & 7;
                                                    int i711 = -(-(i16 | 7));
                                                    int i712 = ((i710 | i711) << 1) - (i710 ^ i711);
                                                    b = i712 % 128;
                                                    int i713 = i712 % 2;
                                                    if (iMax >= 0) {
                                                        loop3: while (true) {
                                                            int i714 = b;
                                                            int i715 = ((i714 | 45) << 1) - (i714 ^ 45);
                                                            a = i715 % 128;
                                                            int i716 = i715 % 2;
                                                            z2 = false;
                                                            while (true) {
                                                                if (iMax != 0) {
                                                                    iMax2 = selectionEnd;
                                                                    break loop3;
                                                                }
                                                                i17 = a;
                                                                int i717 = i17 & 23;
                                                                i18 = (((i17 ^ 23) | i717) << 1) - ((~i717) & (i17 | 23));
                                                                b = i18 % 128;
                                                                if (i18 % 2 == 0) {
                                                                    obj.hashCode();
                                                                    throw null;
                                                                }
                                                                if (selectionEnd >= length) {
                                                                    cCharAt = editable.charAt(selectionEnd);
                                                                    if (z2) {
                                                                        int i810 = b;
                                                                        int i811 = ((i810 & 26) + (i810 | 26)) - 1;
                                                                        a = i811 % 128;
                                                                        int i812 = i811 % 2;
                                                                        if (Character.isLowSurrogate(cCharAt)) {
                                                                            int i813 = b;
                                                                            int i814 = i813 ^ 29;
                                                                            int i815 = -(-((i813 & 29) << 1));
                                                                            i19 = ((i814 | i815) << 1) - (i815 ^ i814);
                                                                            a = i19 % 128;
                                                                            if (i19 % 2 == 0) {
                                                                                int i816 = (iMax | 110) << 1;
                                                                                int i817 = -(iMax ^ 110);
                                                                                int i818 = ((i816 | i817) << 1) - (i817 ^ i816);
                                                                                int i819 = (i818 & 60) | ((~i818) & (-61));
                                                                                int i910 = (i818 & (-61)) << 1;
                                                                                selectionEnd = (((selectionEnd | 7) << 1) - (selectionEnd ^ 7)) - 1;
                                                                                iMax = ((i819 | i910) << 1) - (i819 ^ i910);
                                                                            } else {
                                                                                selectionEnd = ((selectionEnd ^ 2) + ((selectionEnd & 2) << 1)) - 1;
                                                                                iMax = (iMax ^ (-1)) + (iMax << 1);
                                                                            }
                                                                        }
                                                                    } else if (!Character.isSurrogate(cCharAt)) {
                                                                        int i911 = b;
                                                                        int i912 = ((i911 ^ 125) | (i911 & 125)) << 1;
                                                                        int i913 = -(((~i911) & 125) | (i911 & (-126)));
                                                                        i20 = (i912 ^ i913) + ((i913 & i912) << 1);
                                                                        int i914 = i20 % 128;
                                                                        a = i914;
                                                                        if (i20 % 2 == 0) {
                                                                            int i915 = selectionEnd & 126;
                                                                            selectionEnd = ((((selectionEnd ^ 126) | i915) << 1) - (~(-((selectionEnd | 126) & (~i915))))) - 1;
                                                                            iMax = ((iMax | 75) << 1) - (iMax ^ 75);
                                                                        } else {
                                                                            int i916 = (iMax & 37) + (iMax | 37);
                                                                            int i917 = (i916 ^ (-1)) + (i916 << 1);
                                                                            iMax = (-2) - ((((i917 | (-36)) << 1) - (i917 ^ (-36))) ^ (-1));
                                                                            selectionEnd = ((selectionEnd & 1) - (~(-(-(selectionEnd | 1))))) - 1;
                                                                        }
                                                                        int i918 = (i914 & (-104)) | ((~i914) & 103);
                                                                        int i919 = (i914 & 103) << 1;
                                                                        int i1010 = (i918 & i919) + (i919 | i918);
                                                                        b = i1010 % 128;
                                                                        int i1011 = i1010 % 2;
                                                                    } else if (!Character.isLowSurrogate(cCharAt)) {
                                                                        int i1012 = a;
                                                                        int i1013 = ((i1012 | 23) << 1) - (i1012 ^ 23);
                                                                        int i1014 = i1013 % 128;
                                                                        b = i1014;
                                                                        int i1015 = i1013 % 2;
                                                                        selectionEnd++;
                                                                        int i1016 = ((i1014 | 105) << 1) - (i1014 ^ 105);
                                                                        a = i1016 % 128;
                                                                        int i1017 = i1016 % 2;
                                                                        z2 = true;
                                                                    }
                                                                } else {
                                                                    if (z2) {
                                                                        iMax2 = length;
                                                                        break loop3;
                                                                    }
                                                                    int i1018 = i17 & 109;
                                                                    int i1019 = (~i1018) & (i17 | 109);
                                                                    int i114 = i1018 << 1;
                                                                    int i115 = (i1019 & i114) + (i114 | i1019);
                                                                    b = i115 % 128;
                                                                    int i116 = i115 % 2;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            iMax2 = -1;
                                            break loop3;
                                            if (iMin != -1) {
                                                int i117 = a;
                                                int i118 = i117 & 75;
                                                int i119 = i117 | 75;
                                                i13 = (i118 ^ i119) + ((i119 & i118) << 1);
                                                i14 = i13 % 128;
                                                b = i14;
                                                if (i13 % 2 == 0) {
                                                    throw null;
                                                }
                                                if (iMax2 == -1) {
                                                    int i120 = (i14 | 19) << 1;
                                                    int i121 = -((i14 & (-20)) | ((~i14) & 19));
                                                    int i122 = (i120 ^ i121) + ((i120 & i121) << 1);
                                                    a = i122 % 128;
                                                    int i123 = i122 % 2;
                                                }
                                            }
                                        }
                                        tVarArr = (t[]) editable.getSpans(iMin, iMax2, t.class);
                                        int i124 = b + 59;
                                        i22 = i124 % 128;
                                        a = i22;
                                        int i125 = i124 % 2;
                                        if (tVarArr != null) {
                                            int i126 = ((i22 ^ 85) - (~(-(-((i22 & 85) << 1))))) - 1;
                                            b = i126 % 128;
                                            int i127 = i126 % 2;
                                            if (tVarArr.length > 0) {
                                                int i128 = i22 & 75;
                                                i23 = i128 + ((i22 ^ 75) | i128);
                                                b = i23 % 128;
                                                if (i23 % 2 != 0) {
                                                    length2 = tVarArr.length;
                                                    i24 = 1;
                                                } else {
                                                    length2 = tVarArr.length;
                                                    i24 = 0;
                                                }
                                                int i129 = (i22 & (-60)) | ((~i22) & 59);
                                                int i130 = (i22 & 59) << 1;
                                                int i131 = (i129 ^ i130) + ((i130 & i129) << 1);
                                                b = i131 % 128;
                                                int i132 = i131 % 2;
                                                while (i24 < length2) {
                                                    int i133 = b + 57;
                                                    a = i133 % 128;
                                                    int i134 = i133 % 2;
                                                    t tVar = tVarArr[i24];
                                                    spanStart = editable.getSpanStart(tVar);
                                                    int i135 = b;
                                                    int i136 = (i135 & 81) + (i135 | 81);
                                                    a = i136 % 128;
                                                    int i137 = i136 % 2;
                                                    int spanEnd = editable.getSpanEnd(tVar);
                                                    int i138 = a;
                                                    i26 = ((i138 | 115) << 1) - (i138 ^ 115);
                                                    b = i26 % 128;
                                                    if (i26 % 2 != 0) {
                                                        iMin = Math.min(spanStart, iMin);
                                                        int i139 = 44 / 0;
                                                    } else {
                                                        iMin = Math.min(spanStart, iMin);
                                                    }
                                                    iMax2 = Math.max(spanEnd, iMax2);
                                                    int i140 = i24 & 109;
                                                    int i141 = i140 + ((i24 ^ 109) | i140);
                                                    i24 = ((i141 & (-107)) + (i141 | (-107))) - 1;
                                                }
                                                iMax3 = Math.max(iMin, 0);
                                                iMin2 = Math.min(iMax2, editable.length());
                                                i25 = (-2) - ((-1) ^ (b + 32));
                                                a = i25 % 128;
                                                if (i25 % 2 != 0) {
                                                    inputConnection.beginBatchEdit();
                                                    editable.delete(iMax3, iMin2);
                                                    obj.hashCode();
                                                    throw null;
                                                }
                                                inputConnection.beginBatchEdit();
                                                editable.delete(iMax3, iMin2);
                                                int i142 = b;
                                                int i143 = i142 & 29;
                                                int i144 = (i142 | 29) & (~i143);
                                                int i145 = i143 << 1;
                                                int i146 = ((i144 | i145) << 1) - (i144 ^ i145);
                                                a = i146 % 128;
                                                int i147 = i146 % 2;
                                                inputConnection.endBatchEdit();
                                                int i148 = b + 33;
                                                a = i148 % 128;
                                                int i149 = i148 % 2;
                                                z3 = true;
                                            }
                                        }
                                    } else {
                                        int i150 = a;
                                        int i151 = (i150 & 43) + (i150 | 43);
                                        b = i151 % 128;
                                        int i152 = i151 % 2;
                                    }
                                } else {
                                    int i153 = a;
                                    int i154 = (i153 & 43) + (i153 | 43);
                                    b = i154 % 128;
                                    int i155 = i154 % 2;
                                }
                            } else {
                                int i156 = a;
                                int i157 = (i156 & 43) + (i156 | 43);
                                b = i157 % 128;
                                int i158 = i157 % 2;
                            }
                        }
                    }
                }
                int i159 = a + 36;
                i27 = (i159 ^ (-1)) + (i159 << 1);
                b = i27 % 128;
                if (i27 % 2 != 0) {
                    int i160 = 22 / 0;
                }
                return z3;
            }
            Object obj3 = b.a;
            int i161 = 56 / 0;
            if (editable != null) {
                i3 = b;
                int i310 = (i3 ^ 120) + ((i3 & 120) << 1);
                i4 = (i310 ^ (-1)) + (i310 << 1);
                a = i4 % 128;
                obj = null;
                if (i4 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                if (i >= 0) {
                    int i311 = i3 & 43;
                    int i312 = (~i311) & (i3 | 43);
                    int i313 = i311 << 1;
                    int i314 = ((i312 | i313) << 1) - (i313 ^ i312);
                    a = i314 % 128;
                    int i315 = i314 % 2;
                    if (i2 >= 0) {
                        i5 = (((i3 | 44) << 1) - (i3 ^ 44)) - 1;
                        a = i5 % 128;
                        if (i5 % 2 != 0) {
                            Selection.getSelectionStart(editable);
                            Selection.getSelectionEnd(editable);
                            throw null;
                        }
                        selectionStart = Selection.getSelectionStart(editable);
                        selectionEnd = Selection.getSelectionEnd(editable);
                        if (selectionStart != -1) {
                            i6 = a;
                            int i316 = (i6 & (-104)) | ((~i6) & 103);
                            int i410 = (i6 & 103) << 1;
                            i7 = (i316 ^ i410) + ((i316 & i410) << 1);
                            b = i7 % 128;
                            if (i7 % 2 == 0) {
                                throw null;
                            }
                            if (selectionEnd != -1) {
                                i8 = (i6 ^ 47) + ((i6 & 47) << 1);
                                b = i8 % 128;
                                if (i8 % 2 == 0) {
                                    obj.hashCode();
                                    throw null;
                                }
                                if (selectionStart == selectionEnd) {
                                    i9 = i6 + 43;
                                    int i411 = i9 % 128;
                                    b = i411;
                                    if (i9 % 2 != 0) {
                                        int i412 = 4 / 3;
                                    }
                                    int i413 = i411 ^ 27;
                                    int i414 = (i411 & 27) << 1;
                                    int i415 = (i413 ^ i414) + ((i413 & i414) << 1);
                                    i10 = i415 % 128;
                                    a = i10;
                                    int i416 = i415 % 2;
                                    if (!z) {
                                        int i417 = -i;
                                        int i418 = selectionStart & i417;
                                        iMin = Math.max(((i417 | selectionStart) & (~i418)) + (i418 << 1), 0);
                                        int i419 = -(-i2);
                                        int i510 = selectionEnd & i419;
                                        int i511 = ((selectionEnd ^ i419) | i510) << 1;
                                        int i512 = -((i419 | selectionEnd) & (~i510));
                                        int i513 = (i511 & i512) + (i512 | i511);
                                        int length5 = editable.length();
                                        int i514 = b + 17;
                                        a = i514 % 128;
                                        int i515 = i514 % 2;
                                        iMax2 = Math.min(i513, length5);
                                        int i516 = a + 113;
                                        b = i516 % 128;
                                        int i517 = i516 % 2;
                                    } else {
                                        int i518 = (-2) - ((i10 + 50) ^ (-1));
                                        b = i518 % 128;
                                        int i519 = i518 % 2;
                                        int iMax5 = Math.max(i, 0);
                                        int length6 = editable.length();
                                        int i610 = b;
                                        int i611 = i610 & 31;
                                        i11 = i611 + ((i610 ^ 31) | i611);
                                        a = i11 % 128;
                                        if (i11 % 2 != 0) {
                                            obj.hashCode();
                                            throw null;
                                        }
                                        if (selectionStart < 0 || length6 < selectionStart) {
                                            int i612 = a + 62;
                                            int i613 = (i612 ^ (-1)) + (i612 << 1);
                                            b = i613 % 128;
                                            int i614 = i613 % 2;
                                            iMin = -1;
                                            break loop1;
                                        }
                                        int i162 = i610 + 47;
                                        a = i162 % 128;
                                        if (i162 % 2 == 0) {
                                            throw null;
                                        }
                                        if (iMax5 < 0) {
                                            int i615 = a + 62;
                                            int i616 = (i615 ^ (-1)) + (i615 << 1);
                                            b = i616 % 128;
                                            int i617 = i616 % 2;
                                            iMin = -1;
                                            break loop1;
                                        }
                                        loop1: while (true) {
                                            int i163 = b;
                                            int i164 = i163 & 27;
                                            int i165 = (i163 | 27) & (~i164);
                                            int i166 = i164 << 1;
                                            int i167 = (i165 ^ i166) + ((i165 & i166) << 1);
                                            a = i167 % 128;
                                            int i168 = i167 % 2;
                                            boolean z4 = false;
                                            while (true) {
                                                if (iMax5 == 0) {
                                                    iMin = selectionStart;
                                                    break loop1;
                                                }
                                                int i169 = b;
                                                int i170 = i169 & 111;
                                                int i171 = (i170 - (~((i169 ^ 111) | i170))) - 1;
                                                a = i171 % 128;
                                                int i172 = i171 % 2;
                                                selectionStart--;
                                                if (selectionStart < 0) {
                                                    int i173 = (i169 & 32) + (i169 | 32);
                                                    int i174 = (i173 ^ (-1)) + (i173 << 1);
                                                    int i175 = i174 % 128;
                                                    a = i175;
                                                    if (i174 % 2 != 0) {
                                                        if (!z4) {
                                                            int i176 = i175 & 37;
                                                            int i177 = -(-((i175 ^ 37) | i176));
                                                            i21 = (i176 ^ i177) + ((i177 & i176) << 1);
                                                            b = i21 % 128;
                                                            if (i21 % 2 != 0) {
                                                                iMin = 0;
                                                                break loop1;
                                                            }
                                                            iMin = 1;
                                                            break loop1;
                                                        }
                                                        break loop1;
                                                    }
                                                    int i178 = 74 / 0;
                                                    if (!z4) {
                                                        int i179 = i175 & 37;
                                                        int i1710 = -(-((i175 ^ 37) | i179));
                                                        i21 = (i179 ^ i1710) + ((i1710 & i179) << 1);
                                                        b = i21 % 128;
                                                        if (i21 % 2 != 0) {
                                                            iMin = 0;
                                                            break loop1;
                                                        }
                                                        iMin = 1;
                                                        break loop1;
                                                    }
                                                } else {
                                                    char cCharAt2 = editable.charAt(selectionStart);
                                                    if (z4) {
                                                        int i180 = b;
                                                        int i181 = i180 & 39;
                                                        int i182 = (i181 - (~((i180 ^ 39) | i181))) - 1;
                                                        a = i182 % 128;
                                                        if (i182 % 2 == 0) {
                                                            Character.isHighSurrogate(cCharAt2);
                                                            throw null;
                                                        }
                                                        if (!(!Character.isHighSurrogate(cCharAt2))) {
                                                            int i183 = (iMax5 & 77) | ((~iMax5) & (-78));
                                                            int i184 = -(-((iMax5 & (-78)) << 1));
                                                            int i185 = (i183 ^ i184) + ((i184 & i183) << 1);
                                                            int i186 = i185 & 77;
                                                            iMax5 = (i186 - (~(-(-((i185 ^ 77) | i186))))) - 1;
                                                            int i187 = a;
                                                            int i188 = i187 & 19;
                                                            int i189 = -(-((i187 ^ 19) | i188));
                                                            int i190 = ((i188 | i189) << 1) - (i189 ^ i188);
                                                            b = i190 % 128;
                                                            int i191 = i190 % 2;
                                                        }
                                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                                        int i192 = a;
                                                        int i193 = ((i192 ^ 85) - (~((i192 & 85) << 1))) - 1;
                                                        b = i193 % 128;
                                                        int i194 = i193 % 2;
                                                        int i195 = ~iMax5;
                                                        int i196 = (iMax5 | i195) << 1;
                                                        int i197 = -i195;
                                                        iMax5 = ((i196 & i197) << 1) + (i196 ^ i197);
                                                        int i198 = ((i192 | 69) << 1) - (i192 ^ 69);
                                                        b = i198 % 128;
                                                        int i199 = i198 % 2;
                                                    } else if (!Character.isHighSurrogate(cCharAt2)) {
                                                        int i200 = b + 105;
                                                        a = i200 % 128;
                                                        int i201 = i200 % 2;
                                                        z4 = true;
                                                    }
                                                }
                                                int i618 = a + 62;
                                                int i619 = (i618 ^ (-1)) + (i618 << 1);
                                                b = i619 % 128;
                                                int i6110 = i619 % 2;
                                                iMin = -1;
                                                break loop1;
                                            }
                                        }
                                        iMax = Math.max(i2, 0);
                                        length = editable.length();
                                        int i620 = a + 12;
                                        int i621 = (i620 ^ (-1)) + (i620 << 1);
                                        i12 = i621 % 128;
                                        b = i12;
                                        int i718 = i621 % 2;
                                        if (selectionEnd >= 0) {
                                            iMax2 = -1;
                                            break loop3;
                                        }
                                        int i719 = ((i12 | 52) << 1) - (i12 ^ 52);
                                        i15 = (i719 ^ (-1)) + (i719 << 1);
                                        i16 = i15 % 128;
                                        a = i16;
                                        if (i15 % 2 == 0) {
                                            if (length >= selectionEnd) {
                                                int i7110 = i16 & 7;
                                                int i7111 = -(-(i16 | 7));
                                                int i7112 = ((i7110 | i7111) << 1) - (i7110 ^ i7111);
                                                b = i7112 % 128;
                                                int i7113 = i7112 % 2;
                                                if (iMax >= 0) {
                                                    loop3: while (true) {
                                                        int i7114 = b;
                                                        int i7115 = ((i7114 | 45) << 1) - (i7114 ^ 45);
                                                        a = i7115 % 128;
                                                        int i7116 = i7115 % 2;
                                                        z2 = false;
                                                        while (true) {
                                                            if (iMax != 0) {
                                                                iMax2 = selectionEnd;
                                                                break loop3;
                                                            }
                                                            i17 = a;
                                                            int i7117 = i17 & 23;
                                                            i18 = (((i17 ^ 23) | i7117) << 1) - ((~i7117) & (i17 | 23));
                                                            b = i18 % 128;
                                                            if (i18 % 2 == 0) {
                                                                obj.hashCode();
                                                                throw null;
                                                            }
                                                            if (selectionEnd >= length) {
                                                                cCharAt = editable.charAt(selectionEnd);
                                                                if (z2) {
                                                                    int i8110 = b;
                                                                    int i8111 = ((i8110 & 26) + (i8110 | 26)) - 1;
                                                                    a = i8111 % 128;
                                                                    int i8112 = i8111 % 2;
                                                                    if (Character.isLowSurrogate(cCharAt)) {
                                                                        int i8113 = b;
                                                                        int i8114 = i8113 ^ 29;
                                                                        int i8115 = -(-((i8113 & 29) << 1));
                                                                        i19 = ((i8114 | i8115) << 1) - (i8115 ^ i8114);
                                                                        a = i19 % 128;
                                                                        if (i19 % 2 == 0) {
                                                                            int i8116 = (iMax | 110) << 1;
                                                                            int i8117 = -(iMax ^ 110);
                                                                            int i8118 = ((i8116 | i8117) << 1) - (i8117 ^ i8116);
                                                                            int i8119 = (i8118 & 60) | ((~i8118) & (-61));
                                                                            int i9110 = (i8118 & (-61)) << 1;
                                                                            selectionEnd = (((selectionEnd | 7) << 1) - (selectionEnd ^ 7)) - 1;
                                                                            iMax = ((i8119 | i9110) << 1) - (i8119 ^ i9110);
                                                                        } else {
                                                                            selectionEnd = ((selectionEnd ^ 2) + ((selectionEnd & 2) << 1)) - 1;
                                                                            iMax = (iMax ^ (-1)) + (iMax << 1);
                                                                        }
                                                                    }
                                                                } else if (!Character.isSurrogate(cCharAt)) {
                                                                    int i9111 = b;
                                                                    int i9112 = ((i9111 ^ 125) | (i9111 & 125)) << 1;
                                                                    int i9113 = -(((~i9111) & 125) | (i9111 & (-126)));
                                                                    i20 = (i9112 ^ i9113) + ((i9113 & i9112) << 1);
                                                                    int i9114 = i20 % 128;
                                                                    a = i9114;
                                                                    if (i20 % 2 == 0) {
                                                                        int i9115 = selectionEnd & 126;
                                                                        selectionEnd = ((((selectionEnd ^ 126) | i9115) << 1) - (~(-((selectionEnd | 126) & (~i9115))))) - 1;
                                                                        iMax = ((iMax | 75) << 1) - (iMax ^ 75);
                                                                    } else {
                                                                        int i9116 = (iMax & 37) + (iMax | 37);
                                                                        int i9117 = (i9116 ^ (-1)) + (i9116 << 1);
                                                                        iMax = (-2) - ((((i9117 | (-36)) << 1) - (i9117 ^ (-36))) ^ (-1));
                                                                        selectionEnd = ((selectionEnd & 1) - (~(-(-(selectionEnd | 1))))) - 1;
                                                                    }
                                                                    int i9118 = (i9114 & (-104)) | ((~i9114) & 103);
                                                                    int i9119 = (i9114 & 103) << 1;
                                                                    int i10110 = (i9118 & i9119) + (i9119 | i9118);
                                                                    b = i10110 % 128;
                                                                    int i10111 = i10110 % 2;
                                                                } else if (!Character.isLowSurrogate(cCharAt)) {
                                                                    int i10112 = a;
                                                                    int i10113 = ((i10112 | 23) << 1) - (i10112 ^ 23);
                                                                    int i10114 = i10113 % 128;
                                                                    b = i10114;
                                                                    int i10115 = i10113 % 2;
                                                                    selectionEnd++;
                                                                    int i10116 = ((i10114 | 105) << 1) - (i10114 ^ 105);
                                                                    a = i10116 % 128;
                                                                    int i10117 = i10116 % 2;
                                                                    z2 = true;
                                                                }
                                                            } else {
                                                                if (z2) {
                                                                    iMax2 = length;
                                                                    break loop3;
                                                                }
                                                                int i10118 = i17 & 109;
                                                                int i10119 = (~i10118) & (i17 | 109);
                                                                int i1110 = i10118 << 1;
                                                                int i1111 = (i10119 & i1110) + (i1110 | i10119);
                                                                b = i1111 % 128;
                                                                int i1112 = i1111 % 2;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            int i1113 = 47 / 0;
                                            if (length >= selectionEnd) {
                                                int i7118 = i16 & 7;
                                                int i7119 = -(-(i16 | 7));
                                                int i71110 = ((i7118 | i7119) << 1) - (i7118 ^ i7119);
                                                b = i71110 % 128;
                                                int i71111 = i71110 % 2;
                                                if (iMax >= 0) {
                                                    loop3: while (true) {
                                                        int i71112 = b;
                                                        int i71113 = ((i71112 | 45) << 1) - (i71112 ^ 45);
                                                        a = i71113 % 128;
                                                        int i71114 = i71113 % 2;
                                                        z2 = false;
                                                        while (true) {
                                                            if (iMax != 0) {
                                                                iMax2 = selectionEnd;
                                                                break loop3;
                                                            }
                                                            i17 = a;
                                                            int i71115 = i17 & 23;
                                                            i18 = (((i17 ^ 23) | i71115) << 1) - ((~i71115) & (i17 | 23));
                                                            b = i18 % 128;
                                                            if (i18 % 2 == 0) {
                                                                obj.hashCode();
                                                                throw null;
                                                            }
                                                            if (selectionEnd >= length) {
                                                                cCharAt = editable.charAt(selectionEnd);
                                                                if (z2) {
                                                                    int i81110 = b;
                                                                    int i81111 = ((i81110 & 26) + (i81110 | 26)) - 1;
                                                                    a = i81111 % 128;
                                                                    int i81112 = i81111 % 2;
                                                                    if (Character.isLowSurrogate(cCharAt)) {
                                                                        int i81113 = b;
                                                                        int i81114 = i81113 ^ 29;
                                                                        int i81115 = -(-((i81113 & 29) << 1));
                                                                        i19 = ((i81114 | i81115) << 1) - (i81115 ^ i81114);
                                                                        a = i19 % 128;
                                                                        if (i19 % 2 == 0) {
                                                                            int i81116 = (iMax | 110) << 1;
                                                                            int i81117 = -(iMax ^ 110);
                                                                            int i81118 = ((i81116 | i81117) << 1) - (i81117 ^ i81116);
                                                                            int i81119 = (i81118 & 60) | ((~i81118) & (-61));
                                                                            int i91110 = (i81118 & (-61)) << 1;
                                                                            selectionEnd = (((selectionEnd | 7) << 1) - (selectionEnd ^ 7)) - 1;
                                                                            iMax = ((i81119 | i91110) << 1) - (i81119 ^ i91110);
                                                                        } else {
                                                                            selectionEnd = ((selectionEnd ^ 2) + ((selectionEnd & 2) << 1)) - 1;
                                                                            iMax = (iMax ^ (-1)) + (iMax << 1);
                                                                        }
                                                                    }
                                                                } else if (!Character.isSurrogate(cCharAt)) {
                                                                    int i91111 = b;
                                                                    int i91112 = ((i91111 ^ 125) | (i91111 & 125)) << 1;
                                                                    int i91113 = -(((~i91111) & 125) | (i91111 & (-126)));
                                                                    i20 = (i91112 ^ i91113) + ((i91113 & i91112) << 1);
                                                                    int i91114 = i20 % 128;
                                                                    a = i91114;
                                                                    if (i20 % 2 == 0) {
                                                                        int i91115 = selectionEnd & 126;
                                                                        selectionEnd = ((((selectionEnd ^ 126) | i91115) << 1) - (~(-((selectionEnd | 126) & (~i91115))))) - 1;
                                                                        iMax = ((iMax | 75) << 1) - (iMax ^ 75);
                                                                    } else {
                                                                        int i91116 = (iMax & 37) + (iMax | 37);
                                                                        int i91117 = (i91116 ^ (-1)) + (i91116 << 1);
                                                                        iMax = (-2) - ((((i91117 | (-36)) << 1) - (i91117 ^ (-36))) ^ (-1));
                                                                        selectionEnd = ((selectionEnd & 1) - (~(-(-(selectionEnd | 1))))) - 1;
                                                                    }
                                                                    int i91118 = (i91114 & (-104)) | ((~i91114) & 103);
                                                                    int i91119 = (i91114 & 103) << 1;
                                                                    int i101110 = (i91118 & i91119) + (i91119 | i91118);
                                                                    b = i101110 % 128;
                                                                    int i101111 = i101110 % 2;
                                                                } else if (!Character.isLowSurrogate(cCharAt)) {
                                                                    int i101112 = a;
                                                                    int i101113 = ((i101112 | 23) << 1) - (i101112 ^ 23);
                                                                    int i101114 = i101113 % 128;
                                                                    b = i101114;
                                                                    int i101115 = i101113 % 2;
                                                                    selectionEnd++;
                                                                    int i101116 = ((i101114 | 105) << 1) - (i101114 ^ 105);
                                                                    a = i101116 % 128;
                                                                    int i101117 = i101116 % 2;
                                                                    z2 = true;
                                                                }
                                                            } else {
                                                                if (z2) {
                                                                    iMax2 = length;
                                                                    break loop3;
                                                                }
                                                                int i101118 = i17 & 109;
                                                                int i101119 = (~i101118) & (i17 | 109);
                                                                int i1114 = i101118 << 1;
                                                                int i1115 = (i101119 & i1114) + (i1114 | i101119);
                                                                b = i1115 % 128;
                                                                int i1116 = i1115 % 2;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        iMax2 = -1;
                                        break loop3;
                                        if (iMin != -1) {
                                            int i1117 = a;
                                            int i1118 = i1117 & 75;
                                            int i1119 = i1117 | 75;
                                            i13 = (i1118 ^ i1119) + ((i1119 & i1118) << 1);
                                            i14 = i13 % 128;
                                            b = i14;
                                            if (i13 % 2 == 0) {
                                                throw null;
                                            }
                                            if (iMax2 == -1) {
                                                int i1210 = (i14 | 19) << 1;
                                                int i1211 = -((i14 & (-20)) | ((~i14) & 19));
                                                int i1212 = (i1210 ^ i1211) + ((i1210 & i1211) << 1);
                                                a = i1212 % 128;
                                                int i1213 = i1212 % 2;
                                            }
                                        }
                                    }
                                    tVarArr = (t[]) editable.getSpans(iMin, iMax2, t.class);
                                    int i1214 = b + 59;
                                    i22 = i1214 % 128;
                                    a = i22;
                                    int i1215 = i1214 % 2;
                                    if (tVarArr != null) {
                                        int i1216 = ((i22 ^ 85) - (~(-(-((i22 & 85) << 1))))) - 1;
                                        b = i1216 % 128;
                                        int i1217 = i1216 % 2;
                                        if (tVarArr.length > 0) {
                                            int i1218 = i22 & 75;
                                            i23 = i1218 + ((i22 ^ 75) | i1218);
                                            b = i23 % 128;
                                            if (i23 % 2 != 0) {
                                                length2 = tVarArr.length;
                                                i24 = 1;
                                            } else {
                                                length2 = tVarArr.length;
                                                i24 = 0;
                                            }
                                            int i1219 = (i22 & (-60)) | ((~i22) & 59);
                                            int i1310 = (i22 & 59) << 1;
                                            int i1311 = (i1219 ^ i1310) + ((i1310 & i1219) << 1);
                                            b = i1311 % 128;
                                            int i1312 = i1311 % 2;
                                            while (i24 < length2) {
                                                int i1313 = b + 57;
                                                a = i1313 % 128;
                                                int i1314 = i1313 % 2;
                                                t tVar2 = tVarArr[i24];
                                                spanStart = editable.getSpanStart(tVar2);
                                                int i1315 = b;
                                                int i1316 = (i1315 & 81) + (i1315 | 81);
                                                a = i1316 % 128;
                                                int i1317 = i1316 % 2;
                                                int spanEnd2 = editable.getSpanEnd(tVar2);
                                                int i1318 = a;
                                                i26 = ((i1318 | 115) << 1) - (i1318 ^ 115);
                                                b = i26 % 128;
                                                if (i26 % 2 != 0) {
                                                    iMin = Math.min(spanStart, iMin);
                                                    int i1319 = 44 / 0;
                                                } else {
                                                    iMin = Math.min(spanStart, iMin);
                                                }
                                                iMax2 = Math.max(spanEnd2, iMax2);
                                                int i1410 = i24 & 109;
                                                int i1411 = i1410 + ((i24 ^ 109) | i1410);
                                                i24 = ((i1411 & (-107)) + (i1411 | (-107))) - 1;
                                            }
                                            iMax3 = Math.max(iMin, 0);
                                            iMin2 = Math.min(iMax2, editable.length());
                                            i25 = (-2) - ((-1) ^ (b + 32));
                                            a = i25 % 128;
                                            if (i25 % 2 != 0) {
                                                inputConnection.beginBatchEdit();
                                                editable.delete(iMax3, iMin2);
                                                obj.hashCode();
                                                throw null;
                                            }
                                            inputConnection.beginBatchEdit();
                                            editable.delete(iMax3, iMin2);
                                            int i1412 = b;
                                            int i1413 = i1412 & 29;
                                            int i1414 = (i1412 | 29) & (~i1413);
                                            int i1415 = i1413 << 1;
                                            int i1416 = ((i1414 | i1415) << 1) - (i1414 ^ i1415);
                                            a = i1416 % 128;
                                            int i1417 = i1416 % 2;
                                            inputConnection.endBatchEdit();
                                            int i1418 = b + 33;
                                            a = i1418 % 128;
                                            int i1419 = i1418 % 2;
                                            z3 = true;
                                        }
                                    }
                                } else {
                                    int i1510 = a;
                                    int i1511 = (i1510 & 43) + (i1510 | 43);
                                    b = i1511 % 128;
                                    int i1512 = i1511 % 2;
                                }
                            } else {
                                int i1513 = a;
                                int i1514 = (i1513 & 43) + (i1513 | 43);
                                b = i1514 % 128;
                                int i1515 = i1514 % 2;
                            }
                        } else {
                            int i1516 = a;
                            int i1517 = (i1516 & 43) + (i1516 | 43);
                            b = i1517 % 128;
                            int i1518 = i1517 % 2;
                        }
                    }
                }
            }
            int i1519 = a + 36;
            i27 = (i1519 ^ (-1)) + (i1519 << 1);
            b = i27 % 128;
            if (i27 % 2 != 0) {
                int i1610 = 22 / 0;
            }
            return z3;
            int i202 = (-2) - ((a + 12) ^ (-1));
            b = i202 % 128;
            int i203 = i202 % 2;
            z3 = false;
            int i15110 = a + 36;
            i27 = (i15110 ^ (-1)) + (i15110 << 1);
            b = i27 % 128;
            if (i27 % 2 != 0) {
                int i1611 = 22 / 0;
            }
            return z3;
        }
    }
}
