package ivas.gov.bisp.enumeration.I;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import ivas.gov.bisp.enumeration.OooO0o0.OooO0o;

/* JADX INFO: loaded from: classes.dex */
public abstract class r<I, O> {
    private static int a = 1;
    private static int b;

    public static final class aQb<T> {

        @SuppressLint({"UnknownNullness"})
        public final T a;

        public aQb(@SuppressLint({"UnknownNullness"}) T t) {
            this.a = t;
        }
    }

    public abstract Intent c(Context context, @SuppressLint({"UnknownNullness"}) I i);

    public OooO0o.OooO00o<O> d(Context context, @SuppressLint({"UnknownNullness"}) I i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 21;
        int i5 = ((~i4) & (i3 | 21)) + (i4 << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        int i7 = (i3 & (-2)) | ((~i3) & 1);
        int i8 = -(-((i3 & 1) << 1));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        return null;
    }

    @SuppressLint({"UnknownNullness"})
    public abstract O e(int i, Intent intent);
}
