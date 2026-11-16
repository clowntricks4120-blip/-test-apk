package org.acra.collector;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import ivas.gov.bisp.enumeration.O.i;
import ivas.gov.bisp.enumeration.aB.r;
import ivas.gov.bisp.enumeration.bD.T;
import ivas.gov.bisp.enumeration.bX.P;
import ivas.gov.bisp.enumeration.bY.b;
import ivas.gov.bisp.enumeration.bZ.ag;
import ivas.gov.bisp.enumeration.p059ce.j;
import org.acra.ReportField;

/* JADX INFO: loaded from: classes.dex */
public class PackageManagerCollector extends BaseReportFieldCollector {

    public final /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ReportField.values().length];
            iArr[ReportField.APP_VERSION_NAME.ordinal()] = 1;
            iArr[ReportField.APP_VERSION_CODE.ordinal()] = 2;
            a = iArr;
        }
    }

    public PackageManagerCollector() {
        super(ReportField.APP_VERSION_NAME, ReportField.APP_VERSION_CODE);
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    public void collect(ReportField reportField, Context context, r rVar, b bVar, j jVar) throws ag {
        ivas.gov.bisp.enumeration.O.r.n(reportField, "reportField");
        ivas.gov.bisp.enumeration.O.r.n(context, "context");
        ivas.gov.bisp.enumeration.O.r.n(rVar, "config");
        ivas.gov.bisp.enumeration.O.r.n(bVar, "reportBuilder");
        ivas.gov.bisp.enumeration.O.r.n(jVar, "target");
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = null;
        if (packageManager != null) {
            try {
                packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused) {
                ivas.gov.bisp.enumeration.aO.j jVar2 = P.c;
                ivas.gov.bisp.enumeration.aO.j jVar3 = P.c;
                ((i) jVar2).x("OooOOO", ivas.gov.bisp.enumeration.p091n.j.r("Failed to find PackageInfo for current App : ", context.getPackageName()));
            } catch (Exception unused2) {
            }
        }
        if (packageInfo == null) {
            throw new ag("Failed to get package info");
        }
        int i = OooO00o.a[reportField.ordinal()];
        if (i == 1) {
            jVar.g(ReportField.APP_VERSION_NAME, packageInfo.versionName);
            return;
        }
        if (i != 2) {
            throw new IllegalArgumentException();
        }
        ReportField reportField2 = ReportField.APP_VERSION_CODE;
        int i2 = packageInfo.versionCode;
        synchronized (jVar) {
            ivas.gov.bisp.enumeration.O.r.n(reportField2, "key");
            jVar.c(reportField2.toString(), i2);
        }
    }

    @Override // org.acra.collector.BaseReportFieldCollector, org.acra.collector.Collector, ivas.gov.bisp.enumeration.p057cc.j
    public /* synthetic */ boolean enabled(r rVar) {
        T.b(rVar);
        return true;
    }
}
