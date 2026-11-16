package ivas.gov.bisp.enumeration.P;

import android.view.View;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class x implements View.OnAttachStateChangeListener {
    private static int a = 1;
    private static int b;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((((i2 ^ 81) | (i2 & 81)) << 1) - (~(-(((~i2) & 81) | (i2 & (-82)))))) - 1;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 123) + ((i2 & 123) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap<View, R> weakHashMap = T.c;
        T.aXd.d(view);
        int i5 = b;
        int i6 = ((i5 & (-122)) | ((~i5) & 121)) + ((i5 & 121) << 1);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
