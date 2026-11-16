package ivas.gov.bisp.enumeration.aB;

import android.content.Context;
import ivas.gov.bisp.enumeration.bD.T;
import ivas.gov.bisp.enumeration.bY.af;
import ivas.gov.bisp.enumeration.bY.b;
import org.acra.config.ReportingAdministrator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p {
    private static int a = 0;
    private static int b = 1;

    public static /* bridge */ /* synthetic */ boolean b(ReportingAdministrator reportingAdministrator, r rVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 119) << 1) - (i2 ^ 119);
        a = i3 % 128;
        int i4 = i3 % 2;
        T.b(rVar);
        int i5 = a;
        int i6 = (i5 & 97) + (i5 | 97);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public static void c(ReportingAdministrator reportingAdministrator, Context context, r rVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 115;
        int i4 = (i3 - (~((i2 ^ 115) | i3))) - 1;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            ivas.gov.bisp.enumeration.O.r.n(context, "context");
            ivas.gov.bisp.enumeration.O.r.n(rVar, "config");
        } else {
            ivas.gov.bisp.enumeration.O.r.n(context, "context");
            ivas.gov.bisp.enumeration.O.r.n(rVar, "config");
            throw null;
        }
    }

    public static boolean d(ReportingAdministrator reportingAdministrator, Context context, r rVar, af afVar) {
        int i = 2 % 2;
        int i2 = a + 103;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            ivas.gov.bisp.enumeration.O.r.n(context, "context");
            ivas.gov.bisp.enumeration.O.r.n(rVar, "config");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ivas.gov.bisp.enumeration.O.r.n(context, "context");
        ivas.gov.bisp.enumeration.O.r.n(rVar, "config");
        int i3 = a;
        int i4 = (i3 ^ 47) + ((i3 & 47) << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        ivas.gov.bisp.enumeration.O.r.n(afVar, "lastActivityManager");
        boolean z = i5 != 0;
        int i6 = b + 87;
        a = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    public static boolean e(ReportingAdministrator reportingAdministrator, Context context, r rVar, b bVar, ivas.gov.bisp.enumeration.p059ce.j jVar) {
        int i = 2 % 2;
        int i2 = b + 85;
        a = i2 % 128;
        int i3 = i2 % 2;
        ivas.gov.bisp.enumeration.O.r.n(context, "context");
        ivas.gov.bisp.enumeration.O.r.n(rVar, "config");
        int i4 = a + 41;
        b = i4 % 128;
        int i5 = i4 % 2;
        ivas.gov.bisp.enumeration.O.r.n(bVar, "reportBuilder");
        int i6 = b;
        int i7 = (i6 ^ 91) + ((i6 & 91) << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public static boolean f(ReportingAdministrator reportingAdministrator, Context context, r rVar, b bVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 13;
        int i4 = (i3 - (~(-(-((i2 ^ 13) | i3))))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        ivas.gov.bisp.enumeration.O.r.n(context, "context");
        ivas.gov.bisp.enumeration.O.r.n(rVar, "config");
        ivas.gov.bisp.enumeration.O.r.n(bVar, "reportBuilder");
        int i6 = a;
        int i7 = i6 & 61;
        int i8 = i7 + ((i6 ^ 61) | i7);
        int i9 = i8 % 128;
        b = i9;
        int i10 = i8 % 2;
        int i11 = ((i9 & (-122)) | ((~i9) & 121)) + ((i9 & 121) << 1);
        a = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 41 / 0;
        }
        return true;
    }

    public static boolean g(ReportingAdministrator reportingAdministrator, Context context, r rVar, ivas.gov.bisp.enumeration.p059ce.j jVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 107;
        int i4 = (i2 | 107) & (~i3);
        boolean z = true;
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        ivas.gov.bisp.enumeration.O.r.n(context, "context");
        ivas.gov.bisp.enumeration.O.r.n(rVar, "config");
        int i8 = a + 41;
        b = i8 % 128;
        if (i8 % 2 == 0) {
            ivas.gov.bisp.enumeration.O.r.n(jVar, "crashReportData");
            z = false;
        } else {
            ivas.gov.bisp.enumeration.O.r.n(jVar, "crashReportData");
        }
        int i9 = b;
        int i10 = i9 & 23;
        int i11 = (i9 ^ 23) | i10;
        int i12 = (i10 & i11) + (i11 | i10);
        a = i12 % 128;
        if (i12 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
