package ivas.gov.bisp.enumeration.aE;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public class h implements ViewTreeObserver.OnPreDrawListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ com.google.android.material.floatingactionbutton.r c;

    public h(com.google.android.material.floatingactionbutton.r rVar) {
        this.c = rVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-114)) | ((~i2) & 113);
        int i4 = (i2 & 113) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        com.google.android.material.floatingactionbutton.r rVar = this.c;
        float rotation = rVar.E.getRotation();
        float f = rVar.w;
        int i7 = a;
        int i8 = (i7 & 81) + (i7 | 81);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (f != rotation) {
            rVar.w = rotation;
            rVar.y();
            int i9 = a;
            int i10 = ((i9 ^ 74) + ((i9 & 74) << 1)) - 1;
            b = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = a;
        int i13 = i12 & 41;
        int i14 = (i13 - (~((i12 ^ 41) | i13))) - 1;
        b = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 45 / 0;
        }
        return true;
    }
}
