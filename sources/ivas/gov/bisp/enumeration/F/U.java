package ivas.gov.bisp.enumeration.F;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.c;
import androidx.lifecycle.d;
import androidx.savedstate.b;
import androidx.savedstate.e;
import ivas.gov.bisp.enumeration.p027b.InterfaceC0106f;
import ivas.gov.bisp.enumeration.p027b.an;
import ivas.gov.bisp.enumeration.p082e.g;

/* JADX INFO: loaded from: classes.dex */
public class U implements g, InterfaceC0106f {
    private static int a = 1;
    private static int b;
    public final an c;
    public c d = null;
    public e e = null;

    public U(Fragment fragment, an anVar) {
        this.c = anVar;
    }

    public void c(d.aLZ alz) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 47;
        int i4 = i3 + ((i2 ^ 47) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        c cVar = this.d;
        cVar.i("handleLifecycleEvent");
        int i6 = a;
        int i7 = i6 & 85;
        int i8 = -(-((i6 ^ 85) | i7));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        cVar.k(alz.f());
        int i11 = b;
        int i12 = i11 & 21;
        int i13 = (i11 | 21) & (~i12);
        int i14 = i12 << 1;
        int i15 = (i13 & i14) + (i13 | i14);
        a = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 56 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p082e.g
    public b getSavedStateRegistry() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 57) << 1) - (i2 ^ 57);
        a = i3 % 128;
        int i4 = i3 % 2;
        d();
        b bVar = this.e.b;
        int i5 = a;
        int i6 = ((((i5 ^ 19) | (i5 & 19)) << 1) - (~(-(((~i5) & 19) | (i5 & (-20)))))) - 1;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 67 / 0;
        }
        return bVar;
    }

    public void d() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 ^ 91) | (i2 & 91)) << 1) - (((~i2) & 91) | (i2 & (-92)));
        b = i3 % 128;
        int i4 = i3 % 2;
        if (this.d == null) {
            this.d = new c(this);
            this.e = new e(this);
            int i5 = a;
            int i6 = ((i5 ^ 27) - (~((i5 & 27) << 1))) - 1;
            b = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 4 / 2;
            }
        }
        int i8 = a + 67;
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p027b.d
    public d getLifecycle() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 125;
        int i4 = ((i2 & 125) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            d();
            throw null;
        }
        d();
        c cVar = this.d;
        int i7 = a;
        int i8 = i7 & 107;
        int i9 = i7 | 107;
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        b = i10 % 128;
        if (i10 % 2 == 0) {
            return cVar;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p027b.InterfaceC0106f
    public an getViewModelStore() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 17;
        int i4 = ((i2 ^ 17) | i3) << 1;
        int i5 = -((i2 | 17) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        d();
        an anVar = this.c;
        int i8 = b + 29;
        a = i8 % 128;
        if (i8 % 2 != 0) {
            return anVar;
        }
        throw null;
    }
}
