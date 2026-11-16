package ivas.gov.bisp.enumeration.bM;

import android.annotation.SuppressLint;
import android.text.Editable;
import ivas.gov.bisp.enumeration.p013am.l;

/* JADX INFO: loaded from: classes.dex */
public final class R extends Editable.Factory {
    private static int a = 0x00000001;
    private static int b;
    public static final Object c = new Object();
    public static volatile Editable.Factory d;
    public static Class<?> e;

    static {
        int i = b;
        int i2 = ((i & (-90)) | ((~i) & 89)) + ((i & 89) << 1);
        a = i2 % 128;
        int i3 = i2 % 2;
    }

    @SuppressLint({"PrivateApi"})
    public R() {
        try {
            e = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, R.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = (-2) - ((b + 94) ^ (-1));
        a = i2 % 128;
        int i3 = i2 % 2;
        Class<?> cls = e;
        if (cls == null) {
            Editable editableNewEditable = super.newEditable(charSequence);
            int i4 = b;
            int i5 = (((i4 & (-2)) | ((~i4) & 1)) - (~((i4 & 1) << 1))) - 1;
            a = i5 % 128;
            int i6 = i5 % 2;
            return editableNewEditable;
        }
        l lVar = new l(cls, charSequence);
        int i7 = a;
        int i8 = (i7 & (-102)) | ((~i7) & 101);
        int i9 = (i7 & 101) << 1;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        b = i10 % 128;
        if (i10 % 2 == 0) {
            return lVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
