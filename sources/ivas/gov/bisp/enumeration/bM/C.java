package ivas.gov.bisp.enumeration.bM;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.b;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class C implements TextWatcher {
    private static int a = 0;
    private static int b = 1;
    public final EditText c;
    public final boolean d;
    public b.aKp e;
    public boolean f = true;

    public static class bxL extends b.aKp {
        private static int a = 1;
        private static int b;
        public final Reference<EditText> c;

        public bxL(EditText editText) {
            this.c = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.b.aKp
        public void b() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 91) + (i2 | 91);
            b = i3 % 128;
            int i4 = i3 % 2;
            C.c(this.c.get(), 1);
            int i5 = b;
            int i6 = ((i5 & 18) + (i5 | 18)) - 1;
            a = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
        }
    }

    public C(EditText editText, boolean z) {
        this.c = editText;
        this.d = z;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 60) << 1) - (i2 ^ 60)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = (i5 & (-118)) | ((~i5) & 117);
        int i7 = -(-((i5 & 117) << 1));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0187  */
    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = b + 24;
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        Object obj = null;
        if (!this.c.isInEditMode()) {
            int i8 = a;
            int i9 = i8 & 97;
            int i10 = (i8 | 97) & (~i9);
            int i11 = -(-(i9 << 1));
            int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
            int i13 = i12 % 128;
            b = i13;
            int i14 = i12 % 2;
            if (this.f) {
                int i15 = (i13 ^ 5) + ((i13 & 5) << 1);
                int i16 = i15 % 128;
                a = i16;
                int i17 = i15 % 2;
                if (!this.d) {
                    int i18 = i16 & 67;
                    int i19 = i18 + ((i16 ^ 67) | i18);
                    b = i19 % 128;
                    if (i19 % 2 == 0) {
                        int i20 = 59 / 0;
                        if (!b.d()) {
                            int i21 = a + 119;
                            b = i21 % 128;
                            int i22 = i21 % 2;
                        }
                    } else if (!b.d()) {
                        int i23 = a + 119;
                        b = i23 % 128;
                        int i24 = i23 % 2;
                    }
                }
                int i25 = a;
                int i26 = i25 & 29;
                int i27 = ((~i26) & (i25 | 29)) + (i26 << 1);
                b = i27 % 128;
                int i28 = i27 % 2;
                int i29 = (i25 ^ 15) + ((i25 & 15) << 1);
                int i30 = i29 % 128;
                b = i30;
                if (i29 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                if (i2 <= i3 && (charSequence instanceof Spannable)) {
                    int i31 = ((((i30 ^ 43) | (i30 & 43)) << 1) - (~(-(((~i30) & 43) | (i30 & (-44)))))) - 1;
                    a = i31 % 128;
                    int i32 = i31 % 2;
                    int iF = b.c().f();
                    if (iF != 0) {
                        int i33 = b;
                        int i34 = ((i33 & 106) + (i33 | 106)) - 1;
                        int i35 = i34 % 128;
                        a = i35;
                        if (i34 % 2 == 0 ? iF == 1 : iF == 1) {
                            b bVarC = b.c();
                            int i36 = i & i3;
                            int i37 = (i36 << 1) + ((i | i3) & (~i36));
                            int i38 = a;
                            int i39 = (((i38 | 26) << 1) - (i38 ^ 26)) - 1;
                            b = i39 % 128;
                            int i40 = i39 % 2;
                            bVarC.e((Spannable) charSequence, i, i37, Integer.MAX_VALUE, 0);
                            int i41 = b;
                            int i42 = i41 & 59;
                            int i43 = ((i41 ^ 59) | i42) << 1;
                            int i44 = -((i41 | 59) & (~i42));
                            int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
                            a = i45 % 128;
                            if (i45 % 2 == 0) {
                                return;
                            }
                            obj.hashCode();
                            throw null;
                        }
                        int i46 = (((i35 ^ 107) | (i35 & 107)) << 1) - ((i35 & (-108)) | ((~i35) & 107));
                        int i47 = i46 % 128;
                        b = i47;
                        if (i46 % 2 != 0 ? iF != 3 : iF != 3) {
                            int i48 = ((i47 | 56) << 1) - (i47 ^ 56);
                            int i49 = (i48 ^ (-1)) + (i48 << 1);
                            a = i49 % 128;
                            int i50 = i49 % 2;
                            return;
                        }
                    }
                    b bVarC2 = b.c();
                    if (this.e == null) {
                        bxL bxl = new bxL(this.c);
                        int i51 = a;
                        int i52 = i51 & 45;
                        int i53 = ((((i51 ^ 45) | i52) << 1) - (~(-((i51 | 45) & (~i52))))) - 1;
                        int i54 = i53 % 128;
                        b = i54;
                        if (i53 % 2 == 0) {
                            this.e = bxl;
                            obj.hashCode();
                            throw null;
                        }
                        this.e = bxl;
                        int i55 = ((i54 & 80) + (i54 | 80)) - 1;
                        a = i55 % 128;
                        int i56 = i55 % 2;
                    }
                    bVarC2.l(this.e);
                    int i57 = a;
                    int i58 = i57 & 69;
                    int i59 = ((i57 ^ 69) | i58) << 1;
                    int i60 = -((i57 | 69) & (~i58));
                    int i61 = ((i59 | i60) << 1) - (i60 ^ i59);
                    b = i61 % 128;
                    int i62 = i61 % 2;
                }
            } else {
                int i210 = a + 119;
                b = i210 % 128;
                int i211 = i210 % 2;
            }
        }
        int i63 = b + 53;
        a = i63 % 128;
        if (i63 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0055  */
    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    /* JADX WARN: Code duplicated, block: B:22:0x008d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x009b  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00db  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ff  */
    public static void c(EditText editText, int i) {
        int i2;
        Editable editableText;
        int selectionStart;
        int selectionEnd;
        int i3;
        Object obj;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        int i9 = b;
        int i10 = ((i9 | 17) << 1) - (i9 ^ 17);
        int i11 = i10 % 128;
        a = i11;
        if (i10 % 2 == 0 ? i == 1 : i == 1) {
            int i12 = i11 + 29;
            int i13 = i12 % 128;
            b = i13;
            int i14 = i12 % 2;
            if (editText != null) {
                int i15 = i13 + 99;
                a = i15 % 128;
                if (i15 % 2 != 0) {
                    int i16 = 60 / 0;
                    if (editText.isAttachedToWindow()) {
                        int i17 = b;
                        int i18 = i17 & 59;
                        int i19 = ((i17 ^ 59) | i18) << 1;
                        int i20 = -((i17 | 59) & (~i18));
                        i2 = (i19 & i20) + (i20 | i19);
                        a = i2 % 128;
                        if (i2 % 2 != 0) {
                            editableText = editText.getEditableText();
                            selectionStart = Selection.getSelectionStart(editableText);
                            int i21 = 71 / 0;
                        } else {
                            editableText = editText.getEditableText();
                            selectionStart = Selection.getSelectionStart(editableText);
                        }
                        selectionEnd = Selection.getSelectionEnd(editableText);
                        b.c().k(editableText);
                        i3 = b;
                        int i22 = (i3 & (-106)) | ((~i3) & 105);
                        int i23 = (i3 & 105) << 1;
                        int i24 = (i22 & i23) + (i22 | i23);
                        a = i24 % 128;
                        int i25 = i24 % 2;
                        obj = null;
                        if (selectionStart >= 0) {
                            i6 = (i3 & 69) + (i3 | 69);
                            a = i6 % 128;
                            if (i6 % 2 == 0) {
                                obj.hashCode();
                                throw null;
                            }
                            if (selectionEnd >= 0) {
                                Selection.setSelection(editableText, selectionStart, selectionEnd);
                                int i26 = b;
                                int i27 = i26 & 75;
                                int i28 = (i26 ^ 75) | i27;
                                i7 = (i27 ^ i28) + ((i28 & i27) << 1);
                                a = i7 % 128;
                                if (i7 % 2 == 0) {
                                    throw null;
                                }
                                return;
                            }
                        }
                        if (selectionStart >= 0) {
                            int i29 = a;
                            int i30 = i29 & 19;
                            int i31 = -(-((i29 ^ 19) | i30));
                            i5 = (i30 ^ i31) + ((i31 & i30) << 1);
                            b = i5 % 128;
                            if (i5 % 2 != 0) {
                                Selection.setSelection(editableText, selectionStart);
                                return;
                            } else {
                                Selection.setSelection(editableText, selectionStart);
                                obj.hashCode();
                                throw null;
                            }
                        }
                        if (selectionEnd >= 0) {
                            i4 = (((i3 & (-18)) | ((~i3) & 17)) - (~(-(-((i3 & 17) << 1))))) - 1;
                            a = i4 % 128;
                            if (i4 % 2 == 0) {
                                Selection.setSelection(editableText, selectionEnd);
                                obj.hashCode();
                                throw null;
                            }
                            Selection.setSelection(editableText, selectionEnd);
                            int i32 = b;
                            int i33 = ((i32 | 79) << 1) - (i32 ^ 79);
                            a = i33 % 128;
                            int i34 = i33 % 2;
                        }
                    }
                } else if (!(!editText.isAttachedToWindow())) {
                    int i110 = b;
                    int i111 = i110 & 59;
                    int i112 = ((i110 ^ 59) | i111) << 1;
                    int i210 = -((i110 | 59) & (~i111));
                    i2 = (i112 & i210) + (i210 | i112);
                    a = i2 % 128;
                    if (i2 % 2 != 0) {
                        editableText = editText.getEditableText();
                        selectionStart = Selection.getSelectionStart(editableText);
                        int i211 = 71 / 0;
                    } else {
                        editableText = editText.getEditableText();
                        selectionStart = Selection.getSelectionStart(editableText);
                    }
                    selectionEnd = Selection.getSelectionEnd(editableText);
                    b.c().k(editableText);
                    i3 = b;
                    int i212 = (i3 & (-106)) | ((~i3) & 105);
                    int i213 = (i3 & 105) << 1;
                    int i214 = (i212 & i213) + (i212 | i213);
                    a = i214 % 128;
                    int i215 = i214 % 2;
                    obj = null;
                    if (selectionStart >= 0) {
                        i6 = (i3 & 69) + (i3 | 69);
                        a = i6 % 128;
                        if (i6 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        if (selectionEnd >= 0) {
                            Selection.setSelection(editableText, selectionStart, selectionEnd);
                            int i216 = b;
                            int i217 = i216 & 75;
                            int i218 = (i216 ^ 75) | i217;
                            i7 = (i217 ^ i218) + ((i218 & i217) << 1);
                            a = i7 % 128;
                            if (i7 % 2 == 0) {
                                throw null;
                            }
                            return;
                        }
                    }
                    if (selectionStart >= 0) {
                        int i219 = a;
                        int i35 = i219 & 19;
                        int i36 = -(-((i219 ^ 19) | i35));
                        i5 = (i35 ^ i36) + ((i36 & i35) << 1);
                        b = i5 % 128;
                        if (i5 % 2 != 0) {
                            Selection.setSelection(editableText, selectionStart);
                            return;
                        } else {
                            Selection.setSelection(editableText, selectionStart);
                            obj.hashCode();
                            throw null;
                        }
                    }
                    if (selectionEnd >= 0) {
                        i4 = (((i3 & (-18)) | ((~i3) & 17)) - (~(-(-((i3 & 17) << 1))))) - 1;
                        a = i4 % 128;
                        if (i4 % 2 == 0) {
                            Selection.setSelection(editableText, selectionEnd);
                            obj.hashCode();
                            throw null;
                        }
                        Selection.setSelection(editableText, selectionEnd);
                        int i37 = b;
                        int i38 = ((i37 | 79) << 1) - (i37 ^ 79);
                        a = i38 % 128;
                        int i39 = i38 % 2;
                    }
                }
            }
        }
        int i40 = b;
        int i41 = i40 ^ 17;
        int i42 = (i40 & 17) << 1;
        int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
        a = i43 % 128;
        int i44 = i43 % 2;
    }
}
