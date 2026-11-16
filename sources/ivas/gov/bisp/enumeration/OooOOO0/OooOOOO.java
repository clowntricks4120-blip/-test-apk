package ivas.gov.bisp.enumeration.OooOOO0;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.bM.L;
import ivas.gov.bisp.enumeration.p012al.X;
import ivas.gov.bisp.enumeration.p012al.Y;
import ivas.gov.bisp.enumeration.p012al.Z;
import ivas.gov.bisp.enumeration.p012al.q;
import ivas.gov.bisp.enumeration.p081d.J;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p081d.h;
import ivas.gov.bisp.enumeration.p088k.C0321u;
import ivas.gov.bisp.enumeration.p088k.C0322v;
import ivas.gov.bisp.enumeration.p088k.Q;
import ivas.gov.bisp.enumeration.p088k.ad;
import ivas.gov.bisp.enumeration.p088k.ai;
import ivas.gov.bisp.enumeration.p088k.r;
import ivas.gov.bisp.enumeration.p089l.a;
import ivas.gov.bisp.enumeration.p089l.l;

/* JADX INFO: loaded from: classes.dex */
public class OooOOOO extends EditText implements J {
    private static int a = 0;
    private static int b = 1;
    public final r c;
    public final C0322v d;
    public final C0321u e;
    public final C0321u f;
    public final a g;

    public OooOOOO(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    @Override // ivas.gov.bisp.enumeration.p081d.J
    public h b(h hVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 19;
        int i4 = (((i2 ^ 19) | i3) << 1) - ((i2 | 19) & (~i3));
        b = i4 % 128;
        int i5 = i4 % 2;
        h hVarB = this.g.b(this, hVar);
        int i6 = a + 119;
        b = i6 % 128;
        int i7 = i6 % 2;
        return hVarB;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 79;
        int i4 = (((i2 | 79) & (~i3)) - (~(i3 << 1))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        ActionMode.Callback callbackF = l.f(super.getCustomSelectionActionModeCallback());
        int i6 = a + 117;
        b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 32 / 0;
        }
        return callbackF;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public /* bridge */ /* synthetic */ CharSequence getText() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 87;
        int i4 = (((i2 | 87) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return getText();
        }
        getText();
        throw null;
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        int i = 2 % 2;
        int i2 = b + 73;
        a = i2 % 128;
        int i3 = i2 % 2;
        super.setKeyListener(this.f.k(keyListener));
        int i4 = a;
        int i5 = i4 & 49;
        int i6 = ((((i4 ^ 49) | i5) << 1) - (~(-((i4 | 49) & (~i5))))) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ai.b(context);
        ad.b(this, getContext());
        r rVar = new r(this);
        this.c = rVar;
        rVar.g(attributeSet, i);
        C0322v c0322v = new C0322v(this);
        this.d = c0322v;
        c0322v.i(attributeSet, i);
        c0322v.f();
        this.e = new C0321u((TextView) this);
        this.g = new a();
        C0321u c0321u = new C0321u((EditText) this);
        this.f = c0321u;
        c0321u.l(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        boolean z = keyListener instanceof NumberKeyListener;
        if ((((z ? 1 : 0) | 1) & (~((z ? 1 : 0) & 1))) != 0) {
            boolean zIsFocusable = super.isFocusable();
            int inputType = super.getInputType();
            KeyListener keyListenerK = c0321u.k(keyListener);
            int i2 = b + 11;
            int i3 = i2 % 128;
            a = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (keyListenerK != keyListener) {
                int i4 = (i3 ^ 26) + ((i3 & 26) << 1);
                int i5 = (i4 ^ (-1)) + (i4 << 1);
                b = i5 % 128;
                if (i5 % 2 == 0) {
                    super.setKeyListener(keyListenerK);
                    super.setRawInputType(inputType);
                    super.setFocusable(zIsFocusable);
                    obj.hashCode();
                    throw null;
                }
                super.setKeyListener(keyListenerK);
                super.setRawInputType(inputType);
                super.setFocusable(zIsFocusable);
                int i6 = 2 % 2;
            }
        }
        int i7 = b + 63;
        a = i7 % 128;
        int i8 = i7 % 2;
    }

    public ColorStateList getSupportBackgroundTintList() {
        ColorStateList colorStateListE;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-40)) | ((~i2) & 39);
        int i4 = -(-((i2 & 39) << 1));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        int i6 = i5 % 128;
        b = i6;
        if (i5 % 2 == 0) {
            throw null;
        }
        r rVar = this.c;
        if (rVar != null) {
            int i7 = (i2 ^ 37) + ((i2 & 37) << 1);
            b = i7 % 128;
            if (i7 % 2 == 0) {
                colorStateListE = rVar.e();
                int i8 = 83 / 0;
            } else {
                colorStateListE = rVar.e();
            }
        } else {
            int i9 = i6 & 33;
            int i10 = ((i6 | 33) & (~i9)) + (i9 << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
            colorStateListE = null;
        }
        int i12 = b + 37;
        a = i12 % 128;
        if (i12 % 2 == 0) {
            return colorStateListE;
        }
        throw null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        PorterDuff.Mode modeF;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 15;
        int i4 = i3 + ((i2 ^ 15) | i3);
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        r rVar = this.c;
        if (rVar != null) {
            int i7 = i5 & 75;
            int i8 = ((i5 | 75) & (~i7)) + (i7 << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
            modeF = rVar.f();
            int i10 = b;
            int i11 = ((i10 | 105) << 1) - (i10 ^ 105);
            a = i11 % 128;
            int i12 = i11 % 2;
        } else {
            int i13 = i5 + 107;
            b = i13 % 128;
            int i14 = i13 % 2;
            modeF = null;
        }
        int i15 = a;
        int i16 = i15 & 11;
        int i17 = (i15 | 11) & (~i16);
        int i18 = i16 << 1;
        int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
        b = i19 % 128;
        int i20 = i19 % 2;
        return modeF;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        int i = 2 % 2;
        int i2 = b + 47;
        a = i2 % 128;
        int i3 = i2 % 2;
        if (Build.VERSION.SDK_INT < 28) {
            Editable editableText = super.getEditableText();
            int i4 = b;
            int i5 = (i4 & 121) + (i4 | 121);
            a = i5 % 128;
            int i6 = i5 % 2;
            return editableText;
        }
        int i7 = a + 27;
        b = i7 % 128;
        int i8 = i7 % 2;
        Editable text = super.getText();
        int i9 = a;
        int i10 = i9 | 23;
        int i11 = i10 << 1;
        int i12 = -((~(i9 & 23)) & i10);
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        b = i13 % 128;
        int i14 = i13 % 2;
        return text;
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        int i = 2 % 2;
        int i2 = a + 51;
        b = i2 % 128;
        int i3 = i2 % 2;
        if (Build.VERSION.SDK_INT < 28) {
            int i4 = a;
            int i5 = i4 & 97;
            int i6 = (~i5) & (i4 | 97);
            int i7 = i5 << 1;
            int i8 = (i6 & i7) + (i7 | i6);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            C0321u c0321u = this.e;
            if (c0321u != null) {
                int i9 = ((i4 ^ 36) + ((i4 & 36) << 1)) - 1;
                b = i9 % 128;
                int i10 = i9 % 2;
                TextClassifier textClassifierM = c0321u.m();
                int i11 = b;
                int i12 = ((i11 | 83) << 1) - (((~i11) & 83) | (i11 & (-84)));
                a = i12 % 128;
                int i13 = i12 % 2;
                return textClassifierM;
            }
        }
        TextClassifier textClassifier = super.getTextClassifier();
        int i14 = b;
        int i15 = i14 & 83;
        int i16 = ((i14 ^ 83) | i15) << 1;
        int i17 = -((i14 | 83) & (~i15));
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        a = i18 % 128;
        int i19 = i18 % 2;
        return textClassifier;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0182  */
    /* JADX WARN: Code duplicated, block: B:57:0x0185  */
    /* JADX WARN: Code duplicated, block: B:59:0x0198  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a8  */
    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        int i;
        boolean zB;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 29) << 1) - (i3 ^ 29);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            i = Build.VERSION.SDK_INT;
            if (i >= 32) {
                zB = true;
            }
            if (!zB) {
                boolean zOnDragEvent = super.onDragEvent(dragEvent);
                int i5 = a;
                int i6 = (i5 ^ 88) + ((i5 & 88) << 1);
                int i7 = (i6 ^ (-1)) + (i6 << 1);
                b = i7 % 128;
                int i8 = i7 % 2;
                return zOnDragEvent;
            }
            int i9 = a;
            int i10 = (-2) - ((((i9 | 10) << 1) - (i9 ^ 10)) ^ (-1));
            b = i10 % 128;
            boolean z = i10 % 2 != 0;
            int i11 = (-2) - (((i9 & 80) + (i9 | 80)) ^ (-1));
            b = i11 % 128;
            int i12 = i11 % 2;
            return z;
        }
        i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            zB = false;
        }
        if (!zB) {
            boolean zOnDragEvent2 = super.onDragEvent(dragEvent);
            int i13 = a;
            int i14 = (i13 ^ 88) + ((i13 & 88) << 1);
            int i15 = (i14 ^ (-1)) + (i14 << 1);
            b = i15 % 128;
            int i16 = i15 % 2;
            return zOnDragEvent2;
        }
        int i17 = a;
        int i18 = (-2) - ((((i17 | 10) << 1) - (i17 ^ 10)) ^ (-1));
        b = i18 % 128;
        if (i18 % 2 != 0) {
        }
        int i19 = (-2) - (((i17 & 80) + (i17 | 80)) ^ (-1));
        b = i19 % 128;
        int i110 = i19 % 2;
        return z;
        if (i >= 24) {
            int i20 = a;
            int i21 = i20 & 121;
            int i22 = ((i20 ^ 121) | i21) << 1;
            int i23 = -((i20 | 121) & (~i21));
            int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
            b = i24 % 128;
            int i25 = i24 % 2;
            if (dragEvent.getLocalState() == null) {
                int i26 = a;
                int i27 = (i26 & (-68)) | ((~i26) & 67);
                int i28 = (i26 & 67) << 1;
                int i29 = (i27 & i28) + (i28 | i27);
                b = i29 % 128;
                Activity activity = null;
                if (i29 % 2 == 0) {
                    T.b(this);
                    throw null;
                }
                if (T.b(this) == null) {
                    int i30 = a;
                    int i31 = i30 & 23;
                    int i32 = ((~i31) & (i30 | 23)) + (i31 << 1);
                    b = i32 % 128;
                    int i33 = i32 % 2;
                    int i34 = i30 + 61;
                    b = i34 % 128;
                    if (i34 % 2 == 0) {
                        int i35 = 4 / 3;
                    }
                } else {
                    Context context = getContext();
                    int i36 = b;
                    int i37 = i36 ^ 73;
                    int i38 = ((((i36 & 73) | i37) << 1) - (~(-i37))) - 1;
                    a = i38 % 128;
                    int i39 = i38 % 2;
                    while (true) {
                        if (!(context instanceof ContextWrapper)) {
                            int i40 = a;
                            int i41 = ((i40 & 22) + (i40 | 22)) - 1;
                            b = i41 % 128;
                            if (i41 % 2 != 0) {
                                break;
                            }
                            int i42 = 5 / 4;
                            break;
                        }
                        int i43 = a;
                        int i44 = ((i43 & 44) + (i43 | 44)) - 1;
                        b = i44 % 128;
                        if (i44 % 2 == 0) {
                            boolean z2 = context instanceof Activity;
                            activity.hashCode();
                            throw null;
                        }
                        if (!(!(context instanceof Activity))) {
                            int i45 = (((i43 & (-90)) | ((~i43) & 89)) - (~(-(-((i43 & 89) << 1))))) - 1;
                            int i46 = i45 % 128;
                            b = i46;
                            int i47 = i45 % 2;
                            activity = (Activity) context;
                            int i48 = ((i46 & (-52)) | ((~i46) & 51)) + ((i46 & 51) << 1);
                            a = i48 % 128;
                            int i49 = i48 % 2;
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                        int i50 = b;
                        int i51 = (-2) - (((i50 ^ 96) + ((i50 & 96) << 1)) ^ (-1));
                        a = i51 % 128;
                        if (i51 % 2 != 0) {
                            int i52 = 4 % 3;
                        }
                    }
                    if (activity == null) {
                        int i53 = a;
                        int i54 = i53 & 41;
                        int i55 = (((i53 ^ 41) | i54) << 1) - ((i53 | 41) & (~i54));
                        b = i55 % 128;
                        zB = !(i55 % 2 != 0);
                    } else if (dragEvent.getAction() == 1) {
                        int i56 = a;
                        int i57 = (i56 & (-86)) | ((~i56) & 85);
                        int i58 = -(-((i56 & 85) << 1));
                        int i59 = (i57 ^ i58) + ((i57 & i58) << 1);
                        b = i59 % 128;
                        int i60 = i59 % 2;
                        int i61 = ((i56 | 41) << 1) - (i56 ^ 41);
                        b = i61 % 128;
                        int i62 = i61 % 2;
                    } else if (dragEvent.getAction() == 3) {
                        int i63 = b;
                        int i64 = ((i63 & 16) + (i63 | 16)) - 1;
                        a = i64 % 128;
                        if (i64 % 2 != 0) {
                            zB = Q.b(dragEvent, this, activity);
                            int i65 = 48 / 0;
                        } else {
                            zB = Q.b(dragEvent, this, activity);
                        }
                        int i66 = b;
                        int i67 = ((i66 | 5) << 1) - (i66 ^ 5);
                        a = i67 % 128;
                        int i68 = i67 % 2;
                    }
                }
                zB = false;
            } else {
                zB = false;
            }
        } else {
            zB = false;
        }
        if (!zB) {
            boolean zOnDragEvent3 = super.onDragEvent(dragEvent);
            int i111 = a;
            int i112 = (i111 ^ 88) + ((i111 & 88) << 1);
            int i113 = (i112 ^ (-1)) + (i112 << 1);
            b = i113 % 128;
            int i114 = i113 % 2;
            return zOnDragEvent3;
        }
        int i115 = a;
        int i116 = (-2) - ((((i115 | 10) << 1) - (i115 ^ 10)) ^ (-1));
        b = i116 % 128;
        if (i116 % 2 != 0) {
        }
        int i117 = (-2) - (((i115 & 80) + (i115 | 80)) ^ (-1));
        b = i117 % 128;
        int i118 = i117 % 2;
        return z;
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 47;
        int i4 = (i2 | 47) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        super.setCustomSelectionActionModeCallback(l.h(this, callback));
        int i8 = b;
        int i9 = i8 & 53;
        int i10 = (i9 - (~((i8 ^ 53) | i9))) - 1;
        a = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003b  */
    /* JADX WARN: Code duplicated, block: B:9:0x001b A[PHI: r1
  0x001b: PHI (r1v5 ivas.gov.bisp.enumeration.k.r) = (r1v4 ivas.gov.bisp.enumeration.k.r), (r1v10 ivas.gov.bisp.enumeration.k.r) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar;
        int i;
        int i2 = 2 % 2;
        int i3 = b + 97;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            rVar = this.c;
            int i4 = 82 / 0;
            if (rVar != null) {
                rVar.k(colorStateList);
                int i5 = b;
                int i6 = ((i5 ^ 11) | (i5 & 11)) << 1;
                int i7 = -(((~i5) & 11) | (i5 & (-12)));
                i = (i6 ^ i7) + ((i7 & i6) << 1);
                a = i % 128;
                if (i % 2 != 0) {
                    int i8 = 3 / 3;
                }
            }
        } else {
            rVar = this.c;
            if (rVar != null) {
                rVar.k(colorStateList);
                int i9 = b;
                int i10 = ((i9 ^ 11) | (i9 & 11)) << 1;
                int i11 = -(((~i9) & 11) | (i9 & (-12)));
                i = (i10 ^ i11) + ((i11 & i10) << 1);
                a = i % 128;
                if (i % 2 != 0) {
                    int i12 = 3 / 3;
                }
            }
        }
        int i13 = b + 21;
        a = i13 % 128;
        int i14 = i13 % 2;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 41) << 1;
        int i4 = -(i2 ^ 41);
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        r rVar = this.c;
        if (rVar != null) {
            rVar.c(mode);
            int i6 = b;
            int i7 = (i6 & (-120)) | ((~i6) & 119);
            int i8 = (i6 & 119) << 1;
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            a = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = b;
        int i12 = i11 & 81;
        int i13 = -(-((i11 ^ 81) | i12));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        a = i14 % 128;
        int i15 = i14 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0028 A[PHI: r1
  0x0028: PHI (r1v7 ivas.gov.bisp.enumeration.k.v) = (r1v6 ivas.gov.bisp.enumeration.k.v), (r1v12 ivas.gov.bisp.enumeration.k.v) binds: [B:8:0x0026, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        C0322v c0322v;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 57;
        int i5 = (i3 ^ 57) | i4;
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            super.setTextAppearance(context, i);
            c0322v = this.d;
            int i7 = 56 / 0;
            if (c0322v != null) {
                int i8 = b;
                int i9 = (i8 & (-62)) | ((~i8) & 61);
                int i10 = -(-((i8 & 61) << 1));
                int i11 = (i9 & i10) + (i10 | i9);
                a = i11 % 128;
                int i12 = i11 % 2;
                c0322v.h(context, i);
                int i13 = b;
                int i14 = ((i13 | 45) << 1) - (i13 ^ 45);
                a = i14 % 128;
                int i15 = i14 % 2;
            }
        } else {
            super.setTextAppearance(context, i);
            c0322v = this.d;
            if (c0322v != null) {
                int i16 = b;
                int i17 = (i16 & (-62)) | ((~i16) & 61);
                int i18 = -(-((i16 & 61) << 1));
                int i19 = (i17 & i18) + (i18 | i17);
                a = i19 % 128;
                int i110 = i19 % 2;
                c0322v.h(context, i);
                int i111 = b;
                int i112 = ((i111 | 45) << 1) - (i111 ^ 45);
                a = i112 % 128;
                int i113 = i112 % 2;
            }
        }
        int i20 = b;
        int i21 = i20 & 37;
        int i22 = (i20 ^ 37) | i21;
        int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
        a = i23 % 128;
        int i24 = i23 % 2;
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 67;
        int i4 = (i3 - (~(-(-((i2 ^ 67) | i3))))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        if (Build.VERSION.SDK_INT < 28) {
            int i6 = a;
            int i7 = i6 & 35;
            int i8 = (i6 ^ 35) | i7;
            int i9 = (i7 & i8) + (i8 | i7);
            b = i9 % 128;
            if (i9 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            C0321u c0321u = this.e;
            if (c0321u != null) {
                c0321u.d = textClassifier;
                int i10 = a;
                int i11 = i10 & 83;
                int i12 = -(-((i10 ^ 83) | i11));
                int i13 = (i11 & i12) + (i12 | i11);
                b = i13 % 128;
                if (i13 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        }
        super.setTextClassifier(textClassifier);
        int i14 = a;
        int i15 = (i14 & 53) + (i14 | 53);
        b = i15 % 128;
        if (i15 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0166  */
    /* JADX WARN: Code duplicated, block: B:53:0x017e  */
    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection;
        C0322v c0322v;
        int i;
        String[] stringArray;
        InputConnection qVar;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 73) | (i3 & 73)) << 1;
        int i5 = -(((~i3) & 73) | (i3 & (-74)));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            c0322v = this.d;
            int i7 = 97 / 0;
        } else {
            inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            c0322v = this.d;
        }
        c0322v.j(this, inputConnectionOnCreateInputConnection, editorInfo);
        ivas.gov.bisp.enumeration.O.r.x(inputConnectionOnCreateInputConnection, editorInfo, this);
        int i8 = b;
        int i9 = ((i8 | 5) << 1) - (i8 ^ 5);
        a = i9 % 128;
        int i10 = i9 % 2;
        Object obj = null;
        if (inputConnectionOnCreateInputConnection != null) {
            int i11 = (-2) - (((i8 & 96) + (i8 | 96)) ^ (-1));
            a = i11 % 128;
            if (i11 % 2 == 0 ? (i = Build.VERSION.SDK_INT) <= 30 : (i = Build.VERSION.SDK_INT) <= 95) {
                String[] strArrB = T.b(this);
                if (strArrB != null) {
                    int i12 = b;
                    int i13 = ((i12 ^ 41) | (i12 & 41)) << 1;
                    int i14 = -((i12 & (-42)) | ((~i12) & 41));
                    int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
                    a = i15 % 128;
                    int i16 = i15 % 2;
                    if (i >= 25) {
                        int i17 = ((i12 & 72) + (i12 | 72)) - 1;
                        a = i17 % 128;
                        int i18 = i17 % 2;
                        editorInfo.contentMimeTypes = strArrB;
                        if (i18 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                    } else {
                        if (editorInfo.extras == null) {
                            editorInfo.extras = new Bundle();
                            int i19 = b;
                            int i20 = i19 & 11;
                            int i21 = -(-(i19 | 11));
                            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                            a = i22 % 128;
                            int i23 = i22 % 2;
                        }
                        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrB);
                        Bundle bundle = editorInfo.extras;
                        int i24 = b;
                        int i25 = i24 & 67;
                        int i26 = -(-((i24 ^ 67) | i25));
                        int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                        a = i27 % 128;
                        int i28 = i27 % 2;
                        bundle.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrB);
                        int i29 = a + 27;
                        b = i29 % 128;
                        int i30 = i29 % 2;
                    }
                    Z z = new Z(this);
                    if (i >= 25) {
                        qVar = new Y(inputConnectionOnCreateInputConnection, false, z);
                        int i31 = b;
                        int i32 = ((i31 & (-58)) | ((~i31) & 57)) + ((i31 & 57) << 1);
                        a = i32 % 128;
                        if (i32 % 2 != 0) {
                            int i33 = 78 / 0;
                        }
                    } else {
                        if (i >= 25) {
                            int i34 = a;
                            int i35 = i34 & 39;
                            int i36 = (i34 | 39) & (~i35);
                            int i37 = -(-(i35 << 1));
                            int i38 = (i36 & i37) + (i36 | i37);
                            b = i38 % 128;
                            if (i38 % 2 == 0) {
                                String[] strArr = editorInfo.contentMimeTypes;
                                obj.hashCode();
                                throw null;
                            }
                            stringArray = editorInfo.contentMimeTypes;
                            if (stringArray == null) {
                                int i39 = a + 97;
                                b = i39 % 128;
                                int i40 = i39 % 2;
                                stringArray = X.c;
                                int i41 = b + 21;
                                a = i41 % 128;
                                int i42 = i41 % 2;
                            }
                        } else {
                            Bundle bundle2 = editorInfo.extras;
                            if (bundle2 != null) {
                                int i43 = b;
                                int i44 = (((i43 | 57) << 1) - (~(-((57 & (~i43)) | (i43 & (-58)))))) - 1;
                                a = i44 % 128;
                                if (i44 % 2 != 0) {
                                    stringArray = bundle2.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                                    int i45 = 76 / 0;
                                    if (stringArray == null) {
                                        stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                                        int i46 = a;
                                        int i47 = ((i46 ^ 122) + ((i46 & 122) << 1)) - 1;
                                        b = i47 % 128;
                                        int i48 = i47 % 2;
                                    }
                                } else {
                                    stringArray = bundle2.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                                    if (stringArray == null) {
                                        stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                                        int i49 = a;
                                        int i410 = ((i49 ^ 122) + ((i49 & 122) << 1)) - 1;
                                        b = i410 % 128;
                                        int i411 = i410 % 2;
                                    }
                                }
                                if (stringArray == null) {
                                    stringArray = X.c;
                                    int i412 = b + 21;
                                    a = i412 % 128;
                                    int i413 = i412 % 2;
                                }
                            } else {
                                stringArray = X.c;
                                int i414 = b + 21;
                                a = i414 % 128;
                                int i415 = i414 % 2;
                            }
                        }
                        if (stringArray.length == 0) {
                            int i50 = a;
                            int i51 = i50 & 41;
                            int i52 = (i50 ^ 41) | i51;
                            int i53 = ((i51 | i52) << 1) - (i51 ^ i52);
                            b = i53 % 128;
                            int i54 = i53 % 2;
                            int i55 = i50 + 107;
                            b = i55 % 128;
                            int i56 = i55 % 2;
                        } else {
                            qVar = new q(inputConnectionOnCreateInputConnection, false, z);
                            int i57 = a;
                            int i58 = (((i57 & (-64)) | ((~i57) & 63)) - (~((i57 & 63) << 1))) - 1;
                            b = i58 % 128;
                            if (i58 % 2 == 0) {
                                throw null;
                            }
                        }
                    }
                    inputConnectionOnCreateInputConnection = qVar;
                }
            }
        }
        InputConnection inputConnectionO = this.f.o(inputConnectionOnCreateInputConnection, editorInfo);
        int i59 = b;
        int i60 = (i59 & (-10)) | ((~i59) & 9);
        int i61 = (i59 & 9) << 1;
        int i62 = ((i60 | i61) << 1) - (i61 ^ i60);
        a = i62 % 128;
        if (i62 % 2 == 0) {
            return inputConnectionO;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-116)) | ((~i2) & 115);
        int i4 = (i2 & 115) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        super.setBackgroundDrawable(drawable);
        r rVar = this.c;
        Object obj = null;
        if (rVar != null) {
            int i7 = a + 49;
            b = i7 % 128;
            int i8 = i7 % 2;
            rVar.i();
            if (i8 == 0) {
                obj.hashCode();
                throw null;
            }
            int i9 = b;
            int i10 = i9 & 117;
            int i11 = ((i9 ^ 117) | i10) << 1;
            int i12 = -((i9 | 117) & (~i10));
            int i13 = (i11 & i12) + (i12 | i11);
            a = i13 % 128;
            int i14 = i13 % 2;
        }
        int i15 = a;
        int i16 = i15 & 29;
        int i17 = (i16 - (~(-(-((i15 ^ 29) | i16))))) - 1;
        b = i17 % 128;
        if (i17 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 55) << 1) - (i3 ^ 55);
        b = i4 % 128;
        int i5 = i4 % 2;
        super.setBackgroundResource(i);
        r rVar = this.c;
        if (rVar != null) {
            int i6 = a;
            int i7 = i6 & 27;
            int i8 = (i6 ^ 27) | i7;
            int i9 = (i7 & i8) + (i8 | i7);
            b = i9 % 128;
            if (i9 % 2 == 0) {
                rVar.h(i);
                throw null;
            }
            rVar.h(i);
        }
        int i10 = b;
        int i11 = ((i10 ^ 60) + ((i10 & 60) << 1)) - 1;
        a = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 93;
        int i4 = i3 + ((i2 ^ 93) | i3);
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            L.bxT bxt = ((L) this.f.d).a;
            throw null;
        }
        L.bxT bxt2 = ((L) this.f.d).a;
        int i5 = b;
        int i6 = i5 & 111;
        int i7 = (i5 | 111) & (~i6);
        int i8 = -(-(i6 << 1));
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        bxt2.e(z);
        int i11 = b + 111;
        a = i11 % 128;
        if (i11 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 123;
        int i4 = (i2 ^ 123) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        super.drawableStateChanged();
        r rVar = this.c;
        if (rVar != null) {
            int i7 = a;
            int i8 = ((i7 ^ 114) + ((i7 & 114) << 1)) - 1;
            b = i8 % 128;
            int i9 = i8 % 2;
            rVar.d();
            int i10 = a;
            int i11 = i10 & 21;
            int i12 = (i10 ^ 21) | i11;
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            b = i13 % 128;
            int i14 = i13 % 2;
        }
        C0322v c0322v = this.d;
        if (c0322v != null) {
            int i15 = a + 115;
            b = i15 % 128;
            int i16 = i15 % 2;
            c0322v.f();
            int i17 = a;
            int i18 = i17 & 39;
            int i19 = ((((i17 ^ 39) | i18) << 1) - (~(-((i17 | 39) & (~i18))))) - 1;
            b = i19 % 128;
            int i20 = i19 % 2;
        }
        int i21 = a + 117;
        b = i21 % 128;
        if (i21 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0175  */
    /* JADX WARN: Code duplicated, block: B:47:0x018b  */
    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        ClipData primaryClip;
        h.aWm awn;
        int i2;
        h hVarB;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = i5 & 11;
        int i7 = -(-((i5 ^ 11) | i6));
        int i8 = (i6 & i7) + (i7 | i6);
        b = i8 % 128;
        int i9 = i8 % 2;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31) {
            int i11 = a;
            int i12 = i11 ^ 71;
            int i13 = (i11 & 71) << 1;
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            b = i14 % 128;
            if (i14 % 2 != 0 ? T.b(this) != null : T.b(this) != null) {
                if (i != 16908322) {
                    int i15 = b;
                    int i16 = ((i15 & (-30)) | ((~i15) & 29)) + ((i15 & 29) << 1);
                    a = i16 % 128;
                    int i17 = i16 % 2;
                    if (i != 16908337) {
                        int i18 = i15 & 63;
                        int i19 = (i15 ^ 63) | i18;
                        int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
                        a = i20 % 128;
                        int i21 = i20 % 2;
                        int i22 = i15 & 121;
                        int i23 = (i15 ^ 121) | i22;
                        int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
                        a = i24 % 128;
                        int i25 = i24 % 2;
                    }
                }
                ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
                int i26 = a;
                int i27 = i26 & 113;
                int i28 = ((i26 ^ 113) | i27) << 1;
                int i29 = -((i26 | 113) & (~i27));
                int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                int i31 = i30 % 128;
                b = i31;
                Object obj = null;
                if (i30 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                if (clipboardManager == null) {
                    int i32 = (i31 & (-108)) | ((~i31) & 107);
                    int i33 = -(-((i31 & 107) << 1));
                    int i34 = (i32 & i33) + (i32 | i33);
                    a = i34 % 128;
                    int i35 = i34 % 2;
                    primaryClip = null;
                } else {
                    primaryClip = clipboardManager.getPrimaryClip();
                    int i36 = b;
                    int i37 = ((i36 & (-100)) | ((~i36) & 99)) + ((i36 & 99) << 1);
                    a = i37 % 128;
                    int i38 = i37 % 2;
                }
                if (primaryClip != null) {
                    int i39 = b + 97;
                    a = i39 % 128;
                    if (i39 % 2 != 0) {
                        primaryClip.getItemCount();
                        throw null;
                    }
                    if (primaryClip.getItemCount() > 0) {
                        int i40 = b;
                        int i41 = i40 & 99;
                        int i42 = i40 | 99;
                        int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                        a = i43 % 128;
                        if (i43 % 2 == 0 ? i10 < 31 : i10 < 45) {
                            awn = new h.aWo(primaryClip, 1);
                            int i44 = b;
                            int i45 = (((i44 ^ 5) | (i44 & 5)) << 1) - (((~i44) & 5) | (i44 & (-6)));
                            a = i45 % 128;
                            int i46 = i45 % 2;
                        } else {
                            awn = new h.aWn(primaryClip, 1);
                            int i47 = a;
                            int i48 = (((i47 & (-114)) | ((~i47) & 113)) - (~((i47 & 113) << 1))) - 1;
                            b = i48 % 128;
                            if (i48 % 2 == 0) {
                                int i49 = 3 % 5;
                            }
                        }
                        if (i == 16908322) {
                            int i50 = a;
                            int i51 = (i50 | 5) << 1;
                            int i52 = -(((~i50) & 5) | (i50 & (-6)));
                            int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
                            b = i53 % 128;
                            if (i53 % 2 != 0) {
                                i2 = 0;
                            }
                            awn.setFlags(i2);
                            hVarB = awn.b();
                            int i54 = b;
                            i3 = (((i54 | 22) << 1) - (i54 ^ 22)) - 1;
                            a = i3 % 128;
                            if (i3 % 2 == 0) {
                                T.m(this, hVarB);
                                obj.hashCode();
                                throw null;
                            }
                            T.m(this, hVarB);
                            int i55 = a;
                            int i56 = (i55 | 125) << 1;
                            int i57 = -(i55 ^ 125);
                            int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
                            b = i58 % 128;
                            int i59 = i58 % 2;
                        } else {
                            int i60 = a;
                            int i61 = i60 & 115;
                            int i62 = (i60 | 115) & (~i61);
                            int i63 = -(-(i61 << 1));
                            int i64 = ((i62 | i63) << 1) - (i62 ^ i63);
                            b = i64 % 128;
                            int i65 = i64 % 2;
                        }
                        i2 = 1;
                        awn.setFlags(i2);
                        hVarB = awn.b();
                        int i510 = b;
                        i3 = (((i510 | 22) << 1) - (i510 ^ 22)) - 1;
                        a = i3 % 128;
                        if (i3 % 2 == 0) {
                            T.m(this, hVarB);
                            obj.hashCode();
                            throw null;
                        }
                        T.m(this, hVarB);
                        int i511 = a;
                        int i512 = (i511 | 125) << 1;
                        int i513 = -(i511 ^ 125);
                        int i514 = ((i512 | i513) << 1) - (i513 ^ i512);
                        b = i514 % 128;
                        int i515 = i514 % 2;
                    }
                }
                int i66 = a;
                int i67 = i66 & 107;
                int i68 = ((((i66 ^ 107) | i67) << 1) - (~(-((~i67) & (i66 | 107))))) - 1;
                b = i68 % 128;
                int i69 = i68 % 2;
                int i70 = i66 ^ 55;
                int i71 = -(-((i66 & 55) << 1));
                int i72 = ((i70 | i71) << 1) - (i70 ^ i71);
                b = i72 % 128;
                boolean z = !(i72 % 2 == 0);
                int i73 = ((i66 & 93) - (~(i66 | 93))) - 1;
                b = i73 % 128;
                if (i73 % 2 != 0) {
                    return z;
                }
                throw null;
            }
        }
        boolean zOnTextContextMenuItem = super.onTextContextMenuItem(i);
        int i74 = b;
        int i75 = i74 & 77;
        int i76 = i75 + ((i74 ^ 77) | i75);
        a = i76 % 128;
        if (i76 % 2 != 0) {
            int i77 = 28 / 0;
        }
        return zOnTextContextMenuItem;
    }
}
