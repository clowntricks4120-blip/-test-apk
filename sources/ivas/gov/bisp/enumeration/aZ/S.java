package ivas.gov.bisp.enumeration.aZ;

import android.content.Context;
import ivas.gov.bisp.enumeration.aC.C;
import ivas.gov.bisp.enumeration.aC.EnumC0042v;
import ivas.gov.bisp.enumeration.aC.O;
import ivas.gov.bisp.enumeration.aC.V;
import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aS.J;
import ivas.gov.bisp.enumeration.aS.M;
import ivas.gov.bisp.enumeration.aS.a;
import ivas.gov.bisp.enumeration.aS.x;
import ivas.gov.bisp.enumeration.aS.z;
import ivas.gov.bisp.enumeration.o000O000.oo0o0Oo;
import ivas.gov.bisp.enumeration.p088k.C0321u;
import ivas.gov.bisp.enumeration.p100w.r;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;

/* JADX INFO: loaded from: classes.dex */
public final class S {
    public static final /* synthetic */ int a = 0;
    public final z b;
    public x c;

    public S(bhE bhe, bhD bhd) {
        this.b = bhe.f;
        this.c = bhe.g;
    }

    public static final class bhE {
        private static int a = 0;
        private static int b = 1;
        public x g;
        public C0321u c = null;
        public M d = null;
        public String e = null;
        public z f = null;
        public a h = null;

        public final S c() {
            S s;
            synchronized (this) {
                if (this.e != null) {
                    this.f = e();
                }
                this.g = d();
                s = new S(this, null);
            }
            return s;
        }

        public final x d() throws GeneralSecurityException, IOException {
            try {
                z zVar = this.f;
                if (zVar != null) {
                    try {
                        return x.c(J.d(this.c, zVar));
                    } catch (oo0o0Oo | GeneralSecurityException unused) {
                        int i = S.a;
                    }
                }
                return x.c(J.c(V.x(this.c.g(), ivas.gov.bisp.enumeration.aD.J.d())));
            } catch (FileNotFoundException unused2) {
                int i2 = S.a;
                if (this.h == null) {
                    throw new GeneralSecurityException("cannot read or generate keyset");
                }
                x xVar = new x(V.w());
                a aVar = this.h;
                synchronized (xVar) {
                    xVar.e(aVar.c, false);
                    int iA = ivas.gov.bisp.enumeration.aS.v.b(xVar.f().c).y(0).A();
                    synchronized (xVar) {
                        int i3 = 0;
                        while (i3 < xVar.e.d.A()) {
                            V.bcq bcqVarZ = xVar.e.d.z(i3);
                            if (bcqVarZ.A() == iA) {
                                if (!bcqVarZ.G().equals(EnumC0042v.d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("cannot set key as primary because it's not enabled: ");
                                    sb.append(iA);
                                    throw new GeneralSecurityException(sb.toString());
                                }
                                V.bcp bcpVar = xVar.e;
                                bcpVar.f();
                                V.t(bcpVar.d, iA);
                                if (this.f != null) {
                                    J jF = xVar.f();
                                    M m = this.d;
                                    z zVar2 = this.f;
                                    V v = jF.c;
                                    byte[] bArrB = zVar2.b(v.e(), new byte[0]);
                                    try {
                                        if (!V.x(zVar2.e(bArrB, new byte[0]), ivas.gov.bisp.enumeration.aD.J.d()).equals(v)) {
                                            throw new GeneralSecurityException("cannot encrypt keyset");
                                        }
                                        O.bdA bdaW = O.w();
                                        AbstractC0069z abstractC0069zD = AbstractC0069z.d(bArrB);
                                        bdaW.f();
                                        O.t(bdaW.d, abstractC0069zD);
                                        C cB = ivas.gov.bisp.enumeration.aS.v.b(v);
                                        bdaW.f();
                                        O.v(bdaW.d, cB);
                                        v vVar = (v) m;
                                        if (!vVar.c.putString(vVar.d, r.A(((O) bdaW.c()).e())).commit()) {
                                            throw new IOException("Failed to write to SharedPreferences");
                                        }
                                    } catch (oo0o0Oo unused3) {
                                        throw new GeneralSecurityException("invalid keyset, corrupted key material");
                                    }
                                } else {
                                    J jF2 = xVar.f();
                                    v vVar2 = (v) this.d;
                                    if (!vVar2.c.putString(vVar2.d, r.A(jF2.c.e())).commit()) {
                                        throw new IOException("Failed to write to SharedPreferences");
                                    }
                                }
                                return xVar;
                            }
                            int i4 = ((i3 ^ 24) + ((i3 & 24) << 1)) - 1;
                            int i5 = i4 & (-22);
                            int i6 = (i4 ^ (-22)) | i5;
                            i3 = (i5 | i6) + (i5 & i6);
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("key not found: ");
                        sb2.append(iA);
                        throw new GeneralSecurityException(sb2.toString());
                    }
                }
            }
        }

        public final bhE f(Context context, String str, String str2) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 109) + (i2 | 109);
            b = i3 % 128;
            int i4 = i3 % 2;
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            this.c = new C0321u(context, str, str2);
            this.d = new v(context, str, str2);
            int i5 = a;
            int i6 = (-2) - ((((i5 | 64) << 1) - (i5 ^ 64)) ^ (-1));
            b = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 69 / 0;
            }
            return this;
        }

        public final z e() throws KeyStoreException {
            int i = 2 % 2;
            int i2 = S.a;
            R r = new R();
            int i3 = b;
            int i4 = i3 & 11;
            int i5 = -(-((i3 ^ 11) | i4));
            int i6 = (i4 & i5) + (i5 | i4);
            a = i6 % 128;
            int i7 = i6 % 2;
            boolean zF = r.f(this.e);
            if (!zF) {
                int i8 = b;
                int i9 = i8 & 37;
                int i10 = (i8 | 37) & (~i9);
                int i11 = -(-(i9 << 1));
                int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
                a = i12 % 128;
                try {
                    if (i12 % 2 != 0) {
                        R.c(this.e);
                        throw null;
                    }
                    R.c(this.e);
                    int i13 = a + 15;
                    b = i13 % 128;
                    int i14 = i13 % 2;
                } catch (GeneralSecurityException | ProviderException unused) {
                    int i15 = S.a;
                    return null;
                }
            }
            try {
                z zVarB = r.b(this.e);
                int i16 = a;
                int i17 = (i16 & 31) + (i16 | 31);
                b = i17 % 128;
                int i18 = i17 % 2;
                return zVarB;
            } catch (GeneralSecurityException | ProviderException e) {
                if (zF) {
                    throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.e), e);
                }
                int i19 = a + 35;
                b = i19 % 128;
                int i20 = i19 % 2;
                int i21 = S.a;
                int i22 = b;
                int i23 = (i22 ^ 109) + ((i22 & 109) << 1);
                a = i23 % 128;
                if (i23 % 2 == 0) {
                    return null;
                }
                throw null;
            }
        }
    }
}
