package ivas.gov.bisp.enumeration.p087j;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import ivas.gov.bisp.enumeration.OooOOoo.OooOO0;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p081d.e;
import ivas.gov.bisp.enumeration.p099u.j;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.j.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogC0311m extends Dialog implements InterfaceC0310l {
    private static int a = 1;
    private static int b;
    public a c;
    public final e.aIl d;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.j.m$aQF */
    public class aQF implements e.aIl {
        private static int a = 1;
        private static int b;

        public aQF() {
        }

        @Override // ivas.gov.bisp.enumeration.d.e.aIl
        public boolean a(KeyEvent keyEvent) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 57) | (i2 & 57)) << 1;
            int i4 = -(((~i2) & 57) | (i2 & (-58)));
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            boolean zE = DialogC0311m.this.e(keyEvent);
            int i7 = a;
            int i8 = ((i7 | 95) << 1) - (((~i7) & 95) | (i7 & (-96)));
            b = i8 % 128;
            int i9 = i8 % 2;
            return zE;
        }
    }

    public DialogC0311m(Context context, int i) {
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            int i3 = b;
            int i4 = (i3 ^ 1) + ((i3 & 1) << 1);
            a = i4 % 128;
            int i5 = i4 % 2;
            theme.resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
            int i6 = b;
            int i7 = (i6 & (-30)) | ((~i6) & 29);
            int i8 = (i6 & 29) << 1;
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            a = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
        } else {
            int i12 = b;
            int i13 = (i12 | 97) << 1;
            int i14 = -(((~i12) & 97) | (i12 & (-98)));
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            a = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 2 % 2;
            }
            i2 = i;
        }
        super(context, i2);
        this.d = new aQF();
        a aVarD = d();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            int i17 = b;
            int i18 = i17 & 83;
            int i19 = -(-((i17 ^ 83) | i18));
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            a = i20 % 128;
            if (i20 % 2 == 0) {
                theme2.resolveAttribute(R.attr.dialogTheme, typedValue2, false);
            } else {
                theme2.resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            }
            i = typedValue2.resourceId;
            int i21 = a;
            int i22 = (-2) - ((i21 + 52) ^ (-1));
            b = i22 % 128;
            int i23 = i22 % 2;
            int i24 = i21 ^ 59;
            int i25 = ((i21 & 59) | i24) << 1;
            int i26 = -i24;
            int i27 = (i25 & i26) + (i25 | i26);
            b = i27 % 128;
            if (i27 % 2 == 0) {
                int i28 = 2 % 2;
            }
        }
        aVarD.z(i);
        aVarD.m(null);
        int i29 = b + 37;
        a = i29 % 128;
        int i30 = i29 % 2;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 59) << 1) - (i2 ^ 59);
        a = i3 % 128;
        int i4 = i3 % 2;
        d().e(view, layoutParams);
        int i5 = b;
        int i6 = i5 & 113;
        int i7 = -(-((i5 ^ 113) | i6));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p087j.InterfaceC0310l
    public void b(j jVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 ^ 111) | (i2 & 111)) << 1) - (((~i2) & 111) | (i2 & (-112)));
        b = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView;
        e.aIl ail;
        int i = 2 % 2;
        int i2 = b + 21;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            decorView = getWindow().getDecorView();
            ail = this.d;
            int i3 = 0 / 0;
        } else {
            decorView = getWindow().getDecorView();
            ail = this.d;
        }
        boolean zC = e.c(ail, decorView, this, keyEvent);
        int i4 = a;
        int i5 = i4 & 49;
        int i6 = (i5 - (~(-(-((i4 ^ 49) | i5))))) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        return zC;
    }

    public boolean e(KeyEvent keyEvent) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 83) + (i2 | 83);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        super.dispatchKeyEvent(keyEvent);
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p087j.InterfaceC0310l
    public void f(j jVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 81) << 1) - (i2 ^ 81);
        b = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (((i3 & (-84)) | ((~i3) & 83)) - (~((i3 & 83) << 1))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        T t = (T) d().h(i);
        int i6 = b;
        int i7 = i6 & 87;
        int i8 = -(-((i6 ^ 87) | i7));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        a = i9 % 128;
        int i10 = i9 % 2;
        return t;
    }

    @Override // ivas.gov.bisp.enumeration.p087j.InterfaceC0310l
    public j g(j.aQr aqr) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 5;
        int i4 = ((((i2 ^ 5) | i3) << 1) - (~(-((i2 | 5) & (~i3))))) - 1;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        int i5 = 87 / 0;
        return null;
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 89;
        int i4 = (i3 - (~((i2 ^ 89) | i3))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        d().k();
        if (i5 != 0) {
            int i6 = 23 / 0;
        }
        int i7 = a;
        int i8 = i7 ^ 63;
        int i9 = ((i7 & 63) | i8) << 1;
        int i10 = -i8;
        int i11 = (i9 & i10) + (i9 | i10);
        b = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 79) + (i3 | 79);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            d().u(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        d().u(i);
        int i5 = b;
        int i6 = (i5 & 37) + (i5 | 37);
        a = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 37;
        int i4 = (((i2 & 37) | i3) << 1) - i3;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            super.dismiss();
            d().o();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        super.dismiss();
        d().o();
        int i5 = a;
        int i6 = (i5 & 91) + (i5 | 91);
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.app.Dialog
    public void onStop() {
        int i = 2 % 2;
        int i2 = b + 81;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            super.onStop();
            d().r();
            int i3 = 48 / 0;
        } else {
            super.onStop();
            d().r();
        }
        int i4 = a;
        int i5 = i4 & 37;
        int i6 = (i4 | 37) & (~i5);
        int i7 = i5 << 1;
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 14) + (i2 | 14)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        d().w(view);
        int i5 = b;
        int i6 = i5 & 63;
        int i7 = (i5 | 63) & (~i6);
        int i8 = -(-(i6 << 1));
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 5;
        int i4 = (i2 ^ 5) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            super.setTitle(charSequence);
            d().y(charSequence);
        } else {
            super.setTitle(charSequence);
            d().y(charSequence);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = a + 23;
        b = i2 % 128;
        int i3 = i2 % 2;
        d().d();
        super.onCreate(bundle);
        int i4 = b;
        int i5 = i4 | 105;
        int i6 = (i5 << 1) - ((~(i4 & 105)) & i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        d().m(bundle);
        if (i7 == 0) {
            int i8 = 73 / 0;
        }
        int i9 = b + 105;
        a = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 19;
        int i4 = (i2 ^ 19) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        d().x(view, layoutParams);
        int i7 = a;
        int i8 = ((i7 | 121) << 1) - (i7 ^ 121);
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        a aVarD;
        Context context;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 86) + (i3 | 86);
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            super.setTitle(i);
            aVarD = d();
            context = getContext();
            int i6 = 94 / 0;
        } else {
            super.setTitle(i);
            aVarD = d();
            context = getContext();
        }
        int i7 = b;
        int i8 = ((i7 ^ 108) + ((i7 & 108) << 1)) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
        aVarD.y(context.getString(i));
        int i10 = a;
        int i11 = i10 & 59;
        int i12 = (i11 - (~(-(-((i10 ^ 59) | i11))))) - 1;
        b = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public a d() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-118)) | ((~i2) & 117)) - (~((i2 & 117) << 1))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (this.c == null) {
            OooOO0<WeakReference<a>> oooOO0 = a.c;
            LayoutInflaterFactory2C0312o layoutInflaterFactory2C0312o = new LayoutInflaterFactory2C0312o(getContext(), getWindow(), this, this);
            int i5 = b;
            int i6 = (i5 & (-110)) | ((~i5) & 109);
            int i7 = -(-((i5 & 109) << 1));
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            a = i8 % 128;
            int i9 = i8 % 2;
            this.c = layoutInflaterFactory2C0312o;
            if (i9 == 0) {
                obj.hashCode();
                throw null;
            }
        }
        a aVar = this.c;
        int i10 = a;
        int i11 = (((i10 | 126) << 1) - (i10 ^ 126)) - 1;
        b = i11 % 128;
        if (i11 % 2 == 0) {
            return aVar;
        }
        throw null;
    }
}
