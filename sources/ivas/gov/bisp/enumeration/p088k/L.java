package ivas.gov.bisp.enumeration.p088k;

import android.annotation.SuppressLint;
import android.view.View;
import ivas.gov.bisp.enumeration.OooOOO0.o0OO00O;
import ivas.gov.bisp.enumeration.p097r.o;

/* JADX INFO: loaded from: classes.dex */
public class L extends AbstractViewOnTouchListenerC0317n {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ o0OO00O.aST l;
    public final /* synthetic */ o0OO00O m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(o0OO00O o0oo00o, View view, o0OO00O.aST ast) {
        super(view);
        this.m = o0oo00o;
        this.l = ast;
    }

    @Override // ivas.gov.bisp.enumeration.p088k.AbstractViewOnTouchListenerC0317n
    public o d() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 27;
        int i4 = (~i3) & (i2 | 27);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        o0OO00O.aST ast = this.l;
        int i8 = (i2 & 117) + (i2 | 117);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            return ast;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p088k.AbstractViewOnTouchListenerC0317n
    @SuppressLint({"SyntheticAccessor"})
    public boolean e() {
        int i = 2 % 2;
        int i2 = b + 62;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.m.getInternalPopup().e();
            obj.hashCode();
            throw null;
        }
        if (!this.m.getInternalPopup().e()) {
            int i4 = a + 35;
            b = i4 % 128;
            int i5 = i4 % 2;
            this.m.d();
            int i6 = a;
            int i7 = (((i6 | 77) << 1) - (~(-(((~i6) & 77) | (i6 & (-78)))))) - 1;
            b = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = b + 115;
        a = i9 % 128;
        if (i9 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
