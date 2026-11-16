package org.acra.collector;

import android.content.Context;
import android.text.TextUtils;
import ivas.gov.bisp.enumeration.bD.T;
import ivas.gov.bisp.enumeration.bY.b;
import ivas.gov.bisp.enumeration.p059ce.j;
import ivas.gov.bisp.enumeration.p100w.r;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.acra.ReportField;

/* JADX INFO: loaded from: classes.dex */
public class StacktraceCollector extends BaseReportFieldCollector {
    public StacktraceCollector() {
        super(ReportField.STACK_TRACE, ReportField.STACK_TRACE_HASH);
    }

    private String getStackTrace(String str, Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    printWriter.println(str);
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    r.k(printWriter, th2);
                    throw th3;
                }
            }
        }
        if (th != null) {
            th.printStackTrace(printWriter);
        }
        String string = stringWriter.toString();
        r.k(printWriter, null);
        return string;
    }

    private String getStackTraceHash(Throwable th) {
        StringBuilder sb = new StringBuilder();
        while (th != null) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            ivas.gov.bisp.enumeration.O.r.m(stackTrace, "stackTraceElements");
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb.append(stackTraceElement.getClassName());
                sb.append(stackTraceElement.getMethodName());
            }
            th = th.getCause();
        }
        String hexString = Integer.toHexString(sb.toString().hashCode());
        ivas.gov.bisp.enumeration.O.r.m(hexString, "toHexString(res.toString().hashCode())");
        return hexString;
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    public void collect(ReportField reportField, Context context, ivas.gov.bisp.enumeration.aB.r rVar, b bVar, j jVar) {
        ivas.gov.bisp.enumeration.O.r.n(reportField, "reportField");
        ivas.gov.bisp.enumeration.O.r.n(context, "context");
        ivas.gov.bisp.enumeration.O.r.n(rVar, "config");
        ivas.gov.bisp.enumeration.O.r.n(bVar, "reportBuilder");
        throw null;
    }

    @Override // org.acra.collector.BaseReportFieldCollector, org.acra.collector.Collector, ivas.gov.bisp.enumeration.p057cc.j
    public /* synthetic */ boolean enabled(ivas.gov.bisp.enumeration.aB.r rVar) {
        T.b(rVar);
        return true;
    }

    @Override // org.acra.collector.BaseReportFieldCollector, org.acra.collector.Collector
    public Collector.Order getOrder() {
        return Collector.Order.FIRST;
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    public boolean shouldCollect(Context context, ivas.gov.bisp.enumeration.aB.r rVar, ReportField reportField, b bVar) {
        ivas.gov.bisp.enumeration.O.r.n(context, "context");
        ivas.gov.bisp.enumeration.O.r.n(rVar, "config");
        ivas.gov.bisp.enumeration.O.r.n(reportField, "collect");
        ivas.gov.bisp.enumeration.O.r.n(bVar, "reportBuilder");
        throw null;
    }
}
