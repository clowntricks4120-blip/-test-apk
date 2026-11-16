package org.acra.collector;

import android.content.Context;
import ivas.gov.bisp.enumeration.aB.r;
import ivas.gov.bisp.enumeration.bD.T;
import ivas.gov.bisp.enumeration.bY.b;
import ivas.gov.bisp.enumeration.p059ce.j;
import org.acra.ReportField;

/* JADX INFO: loaded from: classes.dex */
public class LogFileCollector extends BaseReportFieldCollector {
    public LogFileCollector() {
        super(ReportField.APPLICATION_LOG);
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    public void collect(ReportField reportField, Context context, r rVar, b bVar, j jVar) {
        ivas.gov.bisp.enumeration.O.r.n(reportField, "reportField");
        ivas.gov.bisp.enumeration.O.r.n(context, "context");
        ivas.gov.bisp.enumeration.O.r.n(rVar, "config");
        ivas.gov.bisp.enumeration.O.r.n(bVar, "reportBuilder");
        ivas.gov.bisp.enumeration.O.r.n(jVar, "target");
        ReportField reportField2 = ReportField.APPLICATION_LOG;
        ivas.gov.bisp.enumeration.p006af.j jVar2 = new ivas.gov.bisp.enumeration.p006af.j(rVar.r.getFile(context, rVar.q));
        jVar2.d = rVar.s;
        jVar.g(reportField2, jVar2.d());
    }

    @Override // org.acra.collector.BaseReportFieldCollector, org.acra.collector.Collector, ivas.gov.bisp.enumeration.p057cc.j
    public /* synthetic */ boolean enabled(r rVar) {
        T.b(rVar);
        return true;
    }

    @Override // org.acra.collector.BaseReportFieldCollector, org.acra.collector.Collector
    public Collector.Order getOrder() {
        return Collector.Order.LATE;
    }
}
