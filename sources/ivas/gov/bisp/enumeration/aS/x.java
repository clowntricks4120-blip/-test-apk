package ivas.gov.bisp.enumeration.aS;

import ivas.gov.bisp.enumeration.aC.A;
import ivas.gov.bisp.enumeration.aC.D;
import ivas.gov.bisp.enumeration.aC.EnumC0042v;
import ivas.gov.bisp.enumeration.aC.V;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class x {
    private static int b = 1;
    private static int c;
    public final V.bcp e;
    public static final byte[] a = {31, -71, -46, 85, -6, 24, -18, -48, 72, -11, 1, 21, 0, -6, 14, 8, -72, 40, 21, 1, 21, 0, -10, -16, 18, 16, -7, 14, 1};
    public static final int d = 69;

    public x(V.bcp bcpVar) {
        this.e = bcpVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0097  */
    /* JADX WARN: Code duplicated, block: B:26:0x009b A[Catch: all -> 0x0228, TRY_ENTER, TryCatch #0 {all -> 0x0228, blocks: (B:5:0x001a, B:7:0x0033, B:11:0x004b, B:17:0x006f, B:26:0x009b, B:27:0x009e, B:28:0x009f, B:31:0x00b8, B:34:0x00d6, B:36:0x00e8, B:51:0x01ea, B:20:0x0082), top: B:59:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00b8 A[Catch: all -> 0x0228, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0228, blocks: (B:5:0x001a, B:7:0x0033, B:11:0x004b, B:17:0x006f, B:26:0x009b, B:27:0x009e, B:28:0x009f, B:31:0x00b8, B:34:0x00d6, B:36:0x00e8, B:51:0x01ea, B:20:0x0082), top: B:59:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00d6 A[Catch: all -> 0x0228, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0228, blocks: (B:5:0x001a, B:7:0x0033, B:11:0x004b, B:17:0x006f, B:26:0x009b, B:27:0x009e, B:28:0x009f, B:31:0x00b8, B:34:0x00d6, B:36:0x00e8, B:51:0x01ea, B:20:0x0082), top: B:59:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00e8 A[Catch: all -> 0x0228, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0228, blocks: (B:5:0x001a, B:7:0x0033, B:11:0x004b, B:17:0x006f, B:26:0x009b, B:27:0x009e, B:28:0x009f, B:31:0x00b8, B:34:0x00d6, B:36:0x00e8, B:51:0x01ea, B:20:0x0082), top: B:59:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0110  */
    /* JADX WARN: Code duplicated, block: B:41:0x0135  */
    /* JADX WARN: Code duplicated, block: B:42:0x0148  */
    /* JADX WARN: Code duplicated, block: B:45:0x017d  */
    /* JADX WARN: Code duplicated, block: B:46:0x019d  */
    /* JADX WARN: Code duplicated, block: B:50:0x01d3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x01ec -> B:53:0x0200). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:31:0x00b8
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static int d() {
        /*
            Method dump skipped, instruction units count: 561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aS.x.d():int");
    }

    @Deprecated
    public final int e(A a2, boolean z) {
        int iA;
        synchronized (this) {
            V.bcq bcqVarH = h(a2);
            V.bcp bcpVar = this.e;
            bcpVar.f();
            V.v(bcpVar.d, bcqVarH);
            if (z) {
                V.bcp bcpVar2 = this.e;
                int iA2 = bcqVarH.A();
                bcpVar2.f();
                V.t(bcpVar2.d, iA2);
            }
            iA = bcqVarH.A();
        }
        return iA;
    }

    public final J f() {
        J jC;
        synchronized (this) {
            jC = J.c((V) this.e.c());
        }
        return jC;
    }

    public final boolean g(int i) {
        synchronized (this) {
            Iterator it = Collections.unmodifiableList(this.e.d.F()).iterator();
            while (it.hasNext()) {
                if (((V.bcq) it.next()).A() == i) {
                    return true;
                }
            }
            return false;
        }
    }

    public final V.bcq h(A a2) {
        ivas.gov.bisp.enumeration.aC.R rH;
        int iD;
        synchronized (this) {
            rH = R.h(a2);
            synchronized (this) {
                iD = d();
                while (g(iD)) {
                    iD = d();
                }
            }
            return (V.bcq) bcrVarY.c();
        }
        D dE = a2.E();
        if (dE == D.d) {
            dE = D.e;
        }
        V.bcq.bcr bcrVarY = V.bcq.y();
        bcrVarY.f();
        V.bcq.t(bcrVarY.d, rH);
        bcrVarY.f();
        V.bcq.x(bcrVarY.d, iD);
        EnumC0042v enumC0042v = EnumC0042v.d;
        bcrVarY.f();
        V.bcq.v(bcrVarY.d, enumC0042v);
        bcrVarY.f();
        V.bcq.w(bcrVarY.d, dE);
        return (V.bcq) bcrVarY.c();
    }

    public static x c(J j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-8)) | ((~i2) & 7);
        int i4 = (i2 & 7) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        c = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            V v = j.c;
            ivas.gov.bisp.enumeration.aD.S.bkM bkm = ivas.gov.bisp.enumeration.aD.S.bkM.g;
            obj.hashCode();
            throw null;
        }
        V v2 = j.c;
        ivas.gov.bisp.enumeration.aD.S.bbs bbsVar = (ivas.gov.bisp.enumeration.aD.S.bbs) v2.C(ivas.gov.bisp.enumeration.aD.S.bkM.g, null, null);
        bbsVar.f();
        bbsVar.h(bbsVar.d, v2);
        x xVar = new x((V.bcp) bbsVar);
        int i6 = c + 13;
        b = i6 % 128;
        int i7 = i6 % 2;
        return xVar;
    }
}
