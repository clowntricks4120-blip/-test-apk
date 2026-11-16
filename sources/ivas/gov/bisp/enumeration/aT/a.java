package ivas.gov.bisp.enumeration.aT;

import ivas.gov.bisp.enumeration.aC.R;
import ivas.gov.bisp.enumeration.aC.W;
import ivas.gov.bisp.enumeration.aC.al;
import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.J;
import ivas.gov.bisp.enumeration.aD.aa;
import ivas.gov.bisp.enumeration.aS.C0079m;
import ivas.gov.bisp.enumeration.aS.N;
import ivas.gov.bisp.enumeration.o0000o0o.Oooo0;
import ivas.gov.bisp.enumeration.p053bz.T;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class a extends Oooo0<W> {
    private static int a = 1;
    private static int b;

    public class bgH extends Oooo0.OooO00o<al, W> {
        private static int b = 0;
        private static int c = 1;

        public bgH(Class cls) {
            super(cls);
        }

        public /* synthetic */ void e(aa aaVar) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 33;
            int i4 = (i2 ^ 33) | i3;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            c = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public aa d(AbstractC0069z abstractC0069z) {
            int i = 2 % 2;
            int i2 = c;
            int i3 = i2 & 37;
            int i4 = ((i2 | 37) & (~i3)) + (i3 << 1);
            b = i4 % 128;
            int i5 = i4 % 2;
            al alVarV = al.v(abstractC0069z, J.d());
            int i6 = b;
            int i7 = i6 & 3;
            int i8 = (i7 - (~((i6 ^ 3) | i7))) - 1;
            c = i8 % 128;
            if (i8 % 2 != 0) {
                return alVarV;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public Object c(aa aaVar) {
            int i = 2 % 2;
            int i2 = (-2) - ((c + 4) ^ (-1));
            b = i2 % 128;
            int i3 = i2 % 2;
            al alVar = (al) aaVar;
            W.bcz bczVarX = W.x();
            bczVarX.f();
            W w = bczVarX.d;
            int i4 = b + 61;
            c = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                W.v(w, alVar);
                Objects.requireNonNull(a.this);
                throw null;
            }
            W.v(w, alVar);
            Objects.requireNonNull(a.this);
            int i5 = b;
            int i6 = ((i5 | 81) << 1) - (i5 ^ 81);
            c = i6 % 128;
            int i7 = i6 % 2;
            bczVarX.f();
            W.t(bczVarX.d, 0);
            int i8 = c + 35;
            b = i8 % 128;
            if (i8 % 2 == 0) {
                return (W) bczVarX.c();
            }
            obj.hashCode();
            throw null;
        }
    }

    public a() {
        super(W.class, new bgG(ivas.gov.bisp.enumeration.aS.z.class));
    }

    public String c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 55) | (i2 & 55)) << 1;
        int i4 = -((i2 & (-56)) | ((~i2) & 55));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = ((i2 & 12) + (i2 | 12)) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    public Oooo0.OooO00o<al, W> e() {
        int i = 2 % 2;
        bgH bgh = new bgH(al.class);
        int i2 = b;
        int i3 = i2 | 27;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 27)) & i3);
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 89 / 0;
        }
        return bgh;
    }

    public R.bdl f() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 93;
        int i4 = ((i2 | 93) & (~i3)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return R.bdl.h;
        }
        R.bdl bdlVar = R.bdl.h;
        throw null;
    }

    public aa h(AbstractC0069z abstractC0069z) {
        int i = 2 % 2;
        int i2 = b + 123;
        a = i2 % 128;
        int i3 = i2 % 2;
        W w = W.w(abstractC0069z, J.d());
        int i4 = a;
        int i5 = ((i4 & 13) - (~(i4 | 13))) - 1;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return w;
        }
        throw null;
    }

    public void g(aa aaVar) throws GeneralSecurityException {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 49) - (~(-(-((i2 & 49) << 1))))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        T.d(((W) aaVar).A(), 0);
        int i5 = a + 9;
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    public class bgG extends Oooo0.OooO0O0<ivas.gov.bisp.enumeration.aS.z, W> {
        private static int b = 0;
        private static int c = 1;

        public bgG(Class cls) {
            super(cls);
        }

        public Object c(Object obj) throws GeneralSecurityException {
            W w;
            String strX;
            N nB;
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & 54) + (i2 | 54)) - 1;
            c = i3 % 128;
            if (i3 % 2 == 0) {
                w = (W) obj;
                strX = w.z().x();
                nB = C0079m.b(strX);
                int i4 = 81 / 0;
            } else {
                w = (W) obj;
                strX = w.z().x();
                nB = C0079m.b(strX);
            }
            l lVar = new l(w.z().y(), nB.b(strX));
            int i5 = b + 21;
            c = i5 % 128;
            int i6 = i5 % 2;
            return lVar;
        }
    }
}
