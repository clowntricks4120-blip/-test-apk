package ivas.gov.bisp.enumeration.p057cc;

import ivas.gov.bisp.enumeration.O.i;
import ivas.gov.bisp.enumeration.aB.r;
import ivas.gov.bisp.enumeration.aO.j;
import ivas.gov.bisp.enumeration.bX.P;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes.dex */
public final class h implements c {
    private static int a = 1;
    private static int b;

    @Override // ivas.gov.bisp.enumeration.p057cc.c
    public final <T extends j> List<T> i(r rVar, Class<T> cls) {
        Iterator it;
        int i = 2 % 2;
        ivas.gov.bisp.enumeration.O.r.n(rVar, "config");
        ArrayList arrayList = new ArrayList();
        int i2 = a;
        int i3 = i2 & 97;
        int i4 = (i2 | 97) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(cls, h.class.getClassLoader());
        int i8 = b;
        int i9 = i8 & 19;
        int i10 = -(-(i8 | 19));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        a = i11 % 128;
        if (i11 % 2 == 0) {
            j jVar = P.c;
            it = serviceLoaderLoad.iterator();
            int i12 = 27 / 0;
        } else {
            j jVar2 = P.c;
            it = serviceLoaderLoad.iterator();
        }
        ivas.gov.bisp.enumeration.O.r.m(it, "serviceLoader.iterator()");
        int i13 = a + 9;
        b = i13 % 128;
        int i14 = i13 % 2;
        while (it.hasNext()) {
            try {
                int i15 = b;
                int i16 = (i15 & (-2)) | ((~i15) & 1);
                int i17 = (i15 & 1) << 1;
                int i18 = (i16 & i17) + (i17 | i16);
                a = i18 % 128;
                if (i18 % 2 == 0) {
                    throw null;
                }
                try {
                    j jVar3 = (j) it.next();
                    ivas.gov.bisp.enumeration.O.r.n(jVar3, "it");
                    if (!jVar3.enabled(rVar)) {
                        j jVar4 = P.c;
                        int i19 = b;
                        int i20 = (i19 ^ 9) + ((i19 & 9) << 1);
                        a = i20 % 128;
                        int i21 = i20 % 2;
                    } else {
                        int i22 = a;
                        int i23 = (i22 & (-68)) | ((~i22) & 67);
                        int i24 = (i22 & 67) << 1;
                        int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                        b = i25 % 128;
                        int i26 = i25 % 2;
                        j jVar5 = P.c;
                        arrayList.add(jVar3);
                        int i27 = b;
                        int i28 = i27 & 101;
                        int i29 = (i27 ^ 101) | i28;
                        int i30 = (i28 & i29) + (i29 | i28);
                        a = i30 % 128;
                        int i31 = i30 % 2;
                    }
                } catch (ServiceConfigurationError e) {
                    j jVar6 = P.c;
                    j jVar7 = P.c;
                    ((i) jVar6).w("OooOOO", ivas.gov.bisp.enumeration.p091n.j.r("Unable to load ", cls.getSimpleName()), e);
                }
                j jVar8 = P.c;
                j jVar9 = P.c;
                ((i) jVar8).w("OooOOO", ivas.gov.bisp.enumeration.p091n.j.r("Unable to load ", cls.getSimpleName()), e);
            } catch (ServiceConfigurationError e2) {
                j jVar10 = P.c;
                j jVar11 = P.c;
                ((i) jVar10).w("OooOOO", ivas.gov.bisp.enumeration.p091n.j.r("Broken ServiceLoader for ", cls.getSimpleName()), e2);
            }
        }
        int i32 = b;
        int i33 = i32 & 19;
        int i34 = (i32 | 19) & (~i33);
        int i35 = -(-(i33 << 1));
        int i36 = (i34 & i35) + (i34 | i35);
        a = i36 % 128;
        if (i36 % 2 != 0) {
            return arrayList;
        }
        throw null;
    }
}
