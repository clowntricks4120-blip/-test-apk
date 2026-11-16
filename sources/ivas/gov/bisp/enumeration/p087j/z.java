package ivas.gov.bisp.enumeration.p087j;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import ivas.gov.bisp.enumeration.p006af.h;
import ivas.gov.bisp.enumeration.p099u.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    private static int a = 0;
    private static int b = 1;

    public interface aQf {
        void b(boolean z);
    }

    @Deprecated
    public static abstract class aQg {
        public abstract void a();
    }

    public abstract boolean c(int i, KeyEvent keyEvent);

    public boolean d() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 106) << 1) - (i2 ^ 106)) - 1;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        int i6 = (i4 & 5) + (i4 | 5);
        a = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public abstract boolean e();

    public abstract void f(boolean z);

    public abstract int g();

    public boolean h() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-96)) | ((~i2) & 95)) + ((i2 & 95) << 1);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        int i6 = i4 & 69;
        int i7 = ((i4 ^ 69) | i6) << 1;
        int i8 = -((i4 | 69) & (~i6));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public abstract Context i();

    public abstract void j(Configuration configuration);

    public void k() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 35;
        int i4 = i2 | 35;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
    }

    public boolean l(KeyEvent keyEvent) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 ^ 27) | (i2 & 27)) << 1) - ((i2 & (-28)) | ((~i2) & 27));
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 ^ 43;
        int i6 = ((i2 & 43) | i5) << 1;
        int i7 = -i5;
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public boolean m() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 85) << 1) - (i2 ^ 85);
        a = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public abstract void n(boolean z);

    public abstract void o(boolean z);

    public abstract void p(boolean z);

    public abstract void q(CharSequence charSequence);

    public abstract void r(CharSequence charSequence);

    public j s(j.aQr aqr) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 | 91;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 91)) & i3);
        int i6 = (i4 & i5) + (i5 | i4);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        int i9 = ((i7 ^ 104) + ((i7 & 104) << 1)) - 1;
        a = i9 % 128;
        if (i9 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static class aJI extends ViewGroup.MarginLayoutParams {
        public int a;

        public aJI(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.e);
            this.a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public aJI(int i, int i2) {
            super(i, i2);
            this.a = 8388627;
        }

        public aJI(aJI aji) {
            super((ViewGroup.MarginLayoutParams) aji);
            this.a = 0;
            this.a = aji.a;
        }

        public aJI(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }
    }
}
