package org.acra.collector;

import android.content.Context;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.bD.T;
import ivas.gov.bisp.enumeration.bY.b;
import ivas.gov.bisp.enumeration.p059ce.j;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import org.acra.ReportField;

/* JADX INFO: loaded from: classes.dex */
public class TimeCollector extends BaseReportFieldCollector implements ApplicationStartupCollector {
    private Calendar appStartDate;
    private final SimpleDateFormat dateFormat;

    public final /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ReportField.values().length];
            iArr[ReportField.USER_APP_START_DATE.ordinal()] = 1;
            iArr[ReportField.USER_CRASH_DATE.ordinal()] = 2;
            a = iArr;
        }
    }

    public TimeCollector() {
        super(ReportField.USER_APP_START_DATE, ReportField.USER_CRASH_DATE);
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ", Locale.ENGLISH);
    }

    private String getTimeString(Calendar calendar) {
        String str = this.dateFormat.format(Long.valueOf(calendar.getTimeInMillis()));
        r.m(str, "dateFormat.format(time.timeInMillis)");
        return str;
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    public void collect(ReportField reportField, Context context, ivas.gov.bisp.enumeration.aB.r rVar, b bVar, j jVar) {
        Calendar gregorianCalendar;
        r.n(reportField, "reportField");
        r.n(context, "context");
        r.n(rVar, "config");
        r.n(bVar, "reportBuilder");
        r.n(jVar, "target");
        int i = OooO00o.a[reportField.ordinal()];
        if (i == 1) {
            gregorianCalendar = this.appStartDate;
        } else {
            if (i != 2) {
                throw new IllegalArgumentException();
            }
            gregorianCalendar = new GregorianCalendar();
        }
        r.l(gregorianCalendar);
        jVar.g(reportField, getTimeString(gregorianCalendar));
    }

    @Override // org.acra.collector.ApplicationStartupCollector
    public void collectApplicationStartUp(Context context, ivas.gov.bisp.enumeration.aB.r rVar) {
        r.n(context, "context");
        r.n(rVar, "config");
        if (rVar.i.contains(ReportField.USER_APP_START_DATE)) {
            this.appStartDate = new GregorianCalendar();
        }
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
}
