package org.acra.collector;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.DropBoxManager;
import ivas.gov.bisp.enumeration.O.i;
import ivas.gov.bisp.enumeration.aB.r;
import ivas.gov.bisp.enumeration.bD.T;
import ivas.gov.bisp.enumeration.bN.C0130y;
import ivas.gov.bisp.enumeration.bN.D;
import ivas.gov.bisp.enumeration.bO.u;
import ivas.gov.bisp.enumeration.bX.P;
import ivas.gov.bisp.enumeration.bY.b;
import ivas.gov.bisp.enumeration.bZ.ag;
import ivas.gov.bisp.enumeration.p059ce.j;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import org.acra.ReportField;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class DropBoxCollector extends BaseReportFieldCollector {
    public static final OooO00o Companion = new OooO00o(null);
    private static final String[] SYSTEM_TAGS = {"system_app_anr", "system_app_wtf", "system_app_crash", "system_server_anr", "system_server_wtf", "system_server_crash", "BATTERY_DISCHARGE_INFO", "SYSTEM_RECOVERY_LOG", "SYSTEM_BOOT", "SYSTEM_LAST_KMSG", "APANIC_CONSOLE", "APANIC_THREADS", "SYSTEM_RESTART", "SYSTEM_TOMBSTONE", "data_app_strictmode"};
    private final SimpleDateFormat dateFormat;

    public static final class OooO00o {
        public OooO00o(u uVar) {
        }
    }

    public DropBoxCollector() {
        super(ReportField.DROPBOX);
        this.dateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss", Locale.getDefault());
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    @SuppressLint({"MissingPermission"})
    public void collect(ReportField reportField, Context context, r rVar, b bVar, j jVar) throws ag {
        ivas.gov.bisp.enumeration.O.r.n(reportField, "reportField");
        ivas.gov.bisp.enumeration.O.r.n(context, "context");
        ivas.gov.bisp.enumeration.O.r.n(rVar, "config");
        ivas.gov.bisp.enumeration.O.r.n(bVar, "reportBuilder");
        ivas.gov.bisp.enumeration.O.r.n(jVar, "target");
        Object systemService = context.getSystemService("dropbox");
        if (systemService == null) {
            throw new ag(ivas.gov.bisp.enumeration.p091n.j.r("Unable to load SystemService ", "dropbox"));
        }
        DropBoxManager dropBoxManager = (DropBoxManager) systemService;
        Calendar calendar = Calendar.getInstance();
        calendar.roll(12, -rVar.h);
        long timeInMillis = calendar.getTimeInMillis();
        this.dateFormat.format(calendar.getTime());
        ArrayList<String> arrayList = new ArrayList();
        if (rVar.e) {
            String[] strArr = SYSTEM_TAGS;
            ivas.gov.bisp.enumeration.O.r.n(strArr, "elements");
            arrayList.addAll(C0130y.am(strArr));
        }
        List listAq = D.aq(rVar.f);
        if (!listAq.isEmpty()) {
            arrayList.addAll(listAq);
        }
        if (!arrayList.isEmpty()) {
            JSONObject jSONObject = new JSONObject();
            for (String str : arrayList) {
                StringBuilder sb = new StringBuilder();
                DropBoxManager.Entry nextEntry = dropBoxManager.getNextEntry(str, timeInMillis);
                if (nextEntry == null) {
                    sb.append("Nothing.");
                    sb.append('\n');
                } else {
                    while (nextEntry != null) {
                        long timeMillis = nextEntry.getTimeMillis();
                        calendar.setTimeInMillis(timeMillis);
                        sb.append('@');
                        sb.append(this.dateFormat.format(calendar.getTime()));
                        sb.append('\n');
                        String text = nextEntry.getText(500);
                        if (text != null) {
                            sb.append("Text: ");
                            sb.append(text);
                            sb.append('\n');
                        } else {
                            sb.append("Not Text!");
                            sb.append('\n');
                        }
                        nextEntry.close();
                        nextEntry = dropBoxManager.getNextEntry(str, timeMillis);
                    }
                    try {
                        jSONObject.put(str, sb.toString());
                    } catch (JSONException e) {
                        ivas.gov.bisp.enumeration.aO.j jVar2 = P.c;
                        ivas.gov.bisp.enumeration.aO.j jVar3 = P.c;
                        ((i) jVar2).y("OooOOO", ivas.gov.bisp.enumeration.p091n.j.r("Failed to collect data for tag ", str), e);
                    }
                }
            }
            jVar.i(ReportField.DROPBOX, jSONObject);
        }
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
