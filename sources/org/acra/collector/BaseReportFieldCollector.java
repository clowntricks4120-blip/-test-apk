package org.acra.collector;

import android.content.Context;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.bD.T;
import ivas.gov.bisp.enumeration.bY.b;
import ivas.gov.bisp.enumeration.bZ.ac;
import ivas.gov.bisp.enumeration.p059ce.j;
import org.acra.ReportField;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseReportFieldCollector implements Collector {
    private final ReportField[] reportFields;

    public BaseReportFieldCollector(ReportField... reportFieldArr) {
        r.n(reportFieldArr, "reportFields");
        this.reportFields = reportFieldArr;
    }

    @Override // org.acra.collector.Collector
    public void collect(Context context, ivas.gov.bisp.enumeration.aB.r rVar, b bVar, j jVar) {
        r.n(context, "context");
        r.n(rVar, "config");
        r.n(bVar, "reportBuilder");
        throw null;
    }

    public abstract void collect(ReportField reportField, Context context, ivas.gov.bisp.enumeration.aB.r rVar, b bVar, j jVar);

    @Override // org.acra.collector.Collector, ivas.gov.bisp.enumeration.p057cc.j
    public /* synthetic */ boolean enabled(ivas.gov.bisp.enumeration.aB.r rVar) {
        T.b(rVar);
        return true;
    }

    @Override // org.acra.collector.Collector
    public /* synthetic */ Collector.Order getOrder() {
        return ac.c(this);
    }

    public boolean shouldCollect(Context context, ivas.gov.bisp.enumeration.aB.r rVar, ReportField reportField, b bVar) {
        r.n(context, "context");
        r.n(rVar, "config");
        r.n(reportField, "collect");
        r.n(bVar, "reportBuilder");
        return rVar.i.contains(reportField);
    }
}
