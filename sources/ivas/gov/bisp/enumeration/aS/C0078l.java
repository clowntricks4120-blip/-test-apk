package ivas.gov.bisp.enumeration.aS;

import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.aa;
import ivas.gov.bisp.enumeration.o0000o0o.OooOo00;
import ivas.gov.bisp.enumeration.o0000o0o.Oooo0;
import ivas.gov.bisp.enumeration.o000O000.oo0o0Oo;
import ivas.gov.bisp.enumeration.p091n.j;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aS.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0078l<PrimitiveT, KeyProtoT extends aa> implements OooOo00<PrimitiveT> {
    private static int a = 1;
    private static int b;
    public final Oooo0<KeyProtoT> c;
    public final Class<PrimitiveT> d;

    public C0078l(Oooo0<KeyProtoT> oooo0, Class<PrimitiveT> cls) {
        Object[] objArr;
        if (oooo0.d.keySet().contains(cls) || !(!Void.class.equals(cls))) {
            this.c = oooo0;
            this.d = cls;
            int i = b;
            int i2 = (-2) - (((i ^ 60) + ((i & 60) << 1)) ^ (-1));
            a = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = b;
        int i5 = ((i4 ^ 77) | (i4 & 77)) << 1;
        int i6 = -(((~i4) & 77) | (i4 & (-78)));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            objArr = new Object[4];
            objArr[0] = oooo0.toString();
        } else {
            objArr = new Object[2];
            objArr[0] = oooo0.toString();
        }
        objArr[1] = cls.getName();
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", objArr));
    }

    public final ivas.gov.bisp.enumeration.aC.R e(AbstractC0069z abstractC0069z) throws GeneralSecurityException {
        AbstractC0080o.bgb bgbVarE;
        aa aaVarD;
        ivas.gov.bisp.enumeration.aC.R.bdk bdkVarY;
        String strC;
        int i = 2 % 2;
        int i2 = b + 99;
        a = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                bgbVarE = this.c.e();
                aaVarD = bgbVarE.d(abstractC0069z);
                int i3 = 55 / 0;
            } else {
                bgbVarE = this.c.e();
                aaVarD = bgbVarE.d(abstractC0069z);
            }
            bgbVarE.e(aaVarD);
            aa aaVar = (aa) bgbVarE.c(aaVarD);
            int i4 = b;
            int i5 = i4 & 41;
            int i6 = -(-((i4 ^ 41) | i5));
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            a = i7 % 128;
            if (i7 % 2 == 0) {
                bdkVarY = ivas.gov.bisp.enumeration.aC.R.y();
                strC = this.c.c();
                bdkVarY.f();
                int i8 = 87 / 0;
            } else {
                bdkVarY = ivas.gov.bisp.enumeration.aC.R.y();
                strC = this.c.c();
                bdkVarY.f();
            }
            int i9 = b;
            int i10 = i9 & 99;
            int i11 = -(-((i9 ^ 99) | i10));
            int i12 = (i10 & i11) + (i11 | i10);
            a = i12 % 128;
            int i13 = i12 % 2;
            ivas.gov.bisp.enumeration.aC.R.t(bdkVarY.d, strC);
            AbstractC0069z abstractC0069zG = aaVar.g();
            int i14 = a;
            int i15 = (((i14 | 92) << 1) - (i14 ^ 92)) - 1;
            b = i15 % 128;
            int i16 = i15 % 2;
            bdkVarY.f();
            ivas.gov.bisp.enumeration.aC.R.w(bdkVarY.d, abstractC0069zG);
            int i17 = a;
            int i18 = (i17 & (-36)) | ((~i17) & 35);
            int i19 = -(-((i17 & 35) << 1));
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            b = i20 % 128;
            int i21 = i20 % 2;
            ivas.gov.bisp.enumeration.aC.R.bdl bdlVarF = this.c.f();
            bdkVarY.f();
            int i22 = b;
            int i23 = i22 & 107;
            int i24 = -(-((i22 ^ 107) | i23));
            int i25 = (i23 & i24) + (i24 | i23);
            a = i25 % 128;
            int i26 = i25 % 2;
            ivas.gov.bisp.enumeration.aC.R.v(bdkVarY.d, bdlVarF);
            ivas.gov.bisp.enumeration.aD.S sC = bdkVarY.c();
            int i27 = b;
            int i28 = ((i27 | 81) << 1) - (i27 ^ 81);
            int i29 = i28 % 128;
            a = i29;
            int i30 = i28 % 2;
            ivas.gov.bisp.enumeration.aC.R r = (ivas.gov.bisp.enumeration.aC.R) sC;
            int i31 = i29 + 77;
            b = i31 % 128;
            if (i31 % 2 == 0) {
                return r;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (oo0o0Oo e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [ivas.gov.bisp.enumeration.aS.o, ivas.gov.bisp.enumeration.o0000o0o.Oooo0<KeyProtoT extends ivas.gov.bisp.enumeration.aD.aa>] */
    /* JADX WARN: Type inference failed for: r1v18, types: [ivas.gov.bisp.enumeration.aS.o] */
    /* JADX WARN: Type inference failed for: r1v25, types: [ivas.gov.bisp.enumeration.aS.o, ivas.gov.bisp.enumeration.o0000o0o.Oooo0<KeyProtoT extends ivas.gov.bisp.enumeration.aD.aa>] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    public final PrimitiveT c(AbstractC0069z abstractC0069z) throws GeneralSecurityException {
        ?? r1;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 66) << 1) - (i2 ^ 66)) - 1;
        b = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                this.c.h(abstractC0069z);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            aa aaVarH = this.c.h(abstractC0069z);
            if (!(!Void.class.equals(this.d))) {
                throw new GeneralSecurityException("Cannot create a primitive for Void");
            }
            int i4 = b;
            int i5 = i4 & 1;
            int i6 = i5 + ((i4 ^ 1) | i5);
            a = i6 % 128;
            if (i6 % 2 == 0) {
                this.c.g(aaVarH);
                int i7 = 77 / 0;
                r1 = this.c;
            } else {
                this.c.g(aaVarH);
                r1 = this.c;
            }
            PrimitiveT primitivet = (PrimitiveT) r1.d(aaVarH, this.d);
            int i8 = b;
            int i9 = i8 & 107;
            int i10 = (((i8 | 107) & (~i9)) - (~(i9 << 1))) - 1;
            a = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 94 / 0;
            }
            return primitivet;
        } catch (oo0o0Oo e) {
            StringBuilder sbW = j.w("Failures parsing proto of type ");
            sbW.append(this.c.c.getName());
            throw new GeneralSecurityException(sbW.toString(), e);
        }
    }

    public final aa d(AbstractC0069z abstractC0069z) throws GeneralSecurityException {
        AbstractC0080o.bgb bgbVarE;
        aa aaVarD;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-72)) | ((~i2) & 71);
        int i4 = -(-((i2 & 71) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        try {
            if (i5 % 2 != 0) {
                bgbVarE = this.c.e();
                aaVarD = bgbVarE.d(abstractC0069z);
                int i6 = 21 / 0;
            } else {
                bgbVarE = this.c.e();
                aaVarD = bgbVarE.d(abstractC0069z);
            }
            bgbVarE.e(aaVarD);
            aa aaVar = (aa) bgbVarE.c(aaVarD);
            int i7 = a;
            int i8 = i7 & 57;
            int i9 = ((i7 ^ 57) | i8) << 1;
            int i10 = -((~i8) & (i7 | 57));
            int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
            b = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 69 / 0;
            }
            int i13 = i7 & 65;
            int i14 = -(-((i7 ^ 65) | i13));
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            b = i15 % 128;
            if (i15 % 2 == 0) {
                return aaVar;
            }
            throw null;
        } catch (oo0o0Oo e) {
            StringBuilder sbW = j.w("Failures parsing proto of type ");
            sbW.append(this.c.e().a.getName());
            throw new GeneralSecurityException(sbW.toString(), e);
        }
    }
}
