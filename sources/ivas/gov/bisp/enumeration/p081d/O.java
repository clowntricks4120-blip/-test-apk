package ivas.gov.bisp.enumeration.p081d;

import android.text.TextUtils;
import android.view.View;
import ivas.gov.bisp.enumeration.Oooo0o.o0ooOOo;

/* JADX INFO: loaded from: classes.dex */
public class O extends o0ooOOo.OooO0O0<CharSequence> {
    private static int a = 0;
    private static int b = 1;

    public O(int i, Class cls, int i2, int i3) {
        super(i, cls, i2, i3);
    }

    public Object e(View view) {
        int i = 2 % 2;
        int i2 = b + 57;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            return T.aXh.d(view);
        }
        T.aXh.d(view);
        throw null;
    }

    public void f(View view, Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 37;
        int i4 = (i2 ^ 37) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            T.aXh.j(view, (CharSequence) obj);
            return;
        }
        T.aXh.j(view, (CharSequence) obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean h(Object obj, Object obj2) {
        CharSequence charSequence;
        CharSequence charSequence2;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 119) << 1) - (i2 ^ 119);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            charSequence = (CharSequence) obj;
            charSequence2 = (CharSequence) obj2;
            int i4 = 45 / 0;
        } else {
            charSequence = (CharSequence) obj;
            charSequence2 = (CharSequence) obj2;
        }
        boolean zEquals = TextUtils.equals(charSequence, charSequence2);
        int i5 = (zEquals ? 1 : 0) & 1;
        boolean z = ((!zEquals ? 1 : 0) | i5) & (~i5);
        int i6 = a;
        int i7 = (i6 | 21) << 1;
        int i8 = -(((~i6) & 21) | (i6 & (-22)));
        int i9 = (i7 & i8) + (i8 | i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        return z;
    }
}
