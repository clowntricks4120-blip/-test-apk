package org.acra.collector;

import android.content.Context;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.bD.T;
import ivas.gov.bisp.enumeration.bO.u;
import ivas.gov.bisp.enumeration.bY.b;
import ivas.gov.bisp.enumeration.p059ce.j;
import org.acra.ReportField;

/* JADX INFO: loaded from: classes.dex */
public class SimpleValuesCollector extends BaseReportFieldCollector {
    public static final OooO00o Companion = new OooO00o(null);

    public static final class OooO00o {
        public OooO00o(u uVar) {
        }
    }

    private String getApplicationFilePath(Context context) {
        String absolutePath = context.getFilesDir().getAbsolutePath();
        r.m(absolutePath, "context.filesDir.absolutePath");
        return absolutePath;
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    public void collect(ReportField reportField, Context context, ivas.gov.bisp.enumeration.aB.r rVar, b bVar, j jVar) {
        r.n(reportField, "reportField");
        r.n(context, "context");
        r.n(rVar, "config");
        r.n(bVar, "reportBuilder");
        throw null;
    }

    @Override // org.acra.collector.BaseReportFieldCollector, org.acra.collector.Collector, ivas.gov.bisp.enumeration.p057cc.j
    public /* synthetic */ boolean enabled(ivas.gov.bisp.enumeration.aB.r rVar) {
        T.b(rVar);
        return true;
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    public boolean shouldCollect(Context context, ivas.gov.bisp.enumeration.aB.r rVar, ReportField reportField, b bVar) {
        r.n(context, "context");
        r.n(rVar, "config");
        r.n(reportField, "collect");
        r.n(bVar, "reportBuilder");
        throw null;
    }

    public SimpleValuesCollector() {
        super(ReportField.IS_SILENT, ReportField.REPORT_ID, ReportField.INSTALLATION_ID, ReportField.PACKAGE_NAME, ReportField.PHONE_MODEL, ReportField.ANDROID_VERSION, ReportField.BRAND, ReportField.PRODUCT, ReportField.FILE_PATH, ReportField.USER_IP);
    }
}
