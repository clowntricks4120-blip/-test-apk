package org.acra.collector;

import android.content.Context;
import android.os.Process;
import ivas.gov.bisp.enumeration.aB.r;
import ivas.gov.bisp.enumeration.aO.j;
import ivas.gov.bisp.enumeration.bD.T;
import ivas.gov.bisp.enumeration.bN.D;
import ivas.gov.bisp.enumeration.bO.u;
import ivas.gov.bisp.enumeration.bX.P;
import ivas.gov.bisp.enumeration.bY.b;
import ivas.gov.bisp.enumeration.o000oo0o.o0OoOoOo;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.acra.ReportField;

/* JADX INFO: loaded from: classes.dex */
public class LogCatCollector extends BaseReportFieldCollector {
    public static final OooO00o Companion = new OooO00o(null);
    private static final int READ_TIMEOUT = 3000;

    public static final class OooO00o {
        public OooO00o(u uVar) {
        }
    }

    public final /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ReportField.values().length];
            iArr[ReportField.LOGCAT.ordinal()] = 1;
            iArr[ReportField.EVENTSLOG.ordinal()] = 2;
            iArr[ReportField.RADIOLOG.ordinal()] = 3;
            a = iArr;
        }
    }

    public LogCatCollector() {
        super(ReportField.LOGCAT, ReportField.EVENTSLOG, ReportField.RADIOLOG);
    }

    private String collectLogCat(r rVar, String str) throws IOException {
        Process.myPid();
        ArrayList arrayList = new ArrayList();
        arrayList.add("logcat");
        if (str != null) {
            arrayList.add("-b");
            arrayList.add(str);
        }
        List listAq = D.aq(rVar.g);
        int iIndexOf = listAq.indexOf("-t");
        int i = -1;
        if (iIndexOf >= 0 && iIndexOf < listAq.size()) {
            i = Integer.parseInt((String) listAq.get(iIndexOf + 1));
        }
        arrayList.addAll(listAq);
        Process processStart = new ProcessBuilder(new String[0]).command(arrayList).redirectErrorStream(true).start();
        j jVar = P.c;
        try {
            InputStream inputStream = processStart.getInputStream();
            ivas.gov.bisp.enumeration.O.r.m(inputStream, "process.inputStream");
            return streamToString(rVar, inputStream, null, i);
        } finally {
            processStart.destroy();
        }
    }

    private String streamToString(r rVar, InputStream inputStream, o0OoOoOo<? super String, Boolean> o0oooooo, int i) {
        ivas.gov.bisp.enumeration.p006af.j jVar = new ivas.gov.bisp.enumeration.p006af.j(inputStream, 0, 0, null, 14);
        jVar.f = o0oooooo;
        jVar.d = i;
        if (rVar.l) {
            jVar.e = READ_TIMEOUT;
        }
        return jVar.d();
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    public void collect(ReportField reportField, Context context, r rVar, b bVar, ivas.gov.bisp.enumeration.p059ce.j jVar) {
        String str;
        ivas.gov.bisp.enumeration.O.r.n(reportField, "reportField");
        ivas.gov.bisp.enumeration.O.r.n(context, "context");
        ivas.gov.bisp.enumeration.O.r.n(rVar, "config");
        ivas.gov.bisp.enumeration.O.r.n(bVar, "reportBuilder");
        ivas.gov.bisp.enumeration.O.r.n(jVar, "target");
        int i = OooO0O0.a[reportField.ordinal()];
        if (i == 1) {
            str = null;
        } else if (i == 2) {
            str = "events";
        } else {
            if (i != 3) {
                throw new IllegalArgumentException();
            }
            str = "radio";
        }
        jVar.g(reportField, collectLogCat(rVar, str));
    }

    @Override // org.acra.collector.BaseReportFieldCollector, org.acra.collector.Collector, ivas.gov.bisp.enumeration.p057cc.j
    public /* synthetic */ boolean enabled(r rVar) {
        T.b(rVar);
        return true;
    }

    @Override // org.acra.collector.BaseReportFieldCollector, org.acra.collector.Collector
    public Collector.Order getOrder() {
        return Collector.Order.FIRST;
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    public boolean shouldCollect(Context context, r rVar, ReportField reportField, b bVar) {
        ivas.gov.bisp.enumeration.O.r.n(context, "context");
        ivas.gov.bisp.enumeration.O.r.n(rVar, "config");
        ivas.gov.bisp.enumeration.O.r.n(reportField, "collect");
        ivas.gov.bisp.enumeration.O.r.n(bVar, "reportBuilder");
        throw null;
    }
}
