package org.acra.collector;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import ivas.gov.bisp.enumeration.aB.r;
import ivas.gov.bisp.enumeration.bD.T;
import ivas.gov.bisp.enumeration.bY.b;
import ivas.gov.bisp.enumeration.bZ.ag;
import ivas.gov.bisp.enumeration.p059ce.j;
import org.acra.ReportField;

/* JADX INFO: loaded from: classes.dex */
public class DeviceIdCollector extends BaseReportFieldCollector {
    public DeviceIdCollector() {
        super(ReportField.DEVICE_ID);
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    @SuppressLint({"MissingPermission", "HardwareIds"})
    public void collect(ReportField reportField, Context context, r rVar, b bVar, j jVar) throws ag {
        String deviceId;
        ivas.gov.bisp.enumeration.O.r.n(reportField, "reportField");
        ivas.gov.bisp.enumeration.O.r.n(context, "context");
        ivas.gov.bisp.enumeration.O.r.n(rVar, "config");
        ivas.gov.bisp.enumeration.O.r.n(bVar, "reportBuilder");
        ivas.gov.bisp.enumeration.O.r.n(jVar, "target");
        if (Build.VERSION.SDK_INT <= 28) {
            Object systemService = context.getSystemService("phone");
            if (systemService == null) {
                throw new ag(ivas.gov.bisp.enumeration.p091n.j.r("Unable to load SystemService ", "phone"));
            }
            deviceId = ((TelephonyManager) systemService).getDeviceId();
        } else {
            deviceId = null;
        }
        jVar.g(ReportField.DEVICE_ID, deviceId);
    }

    @Override // org.acra.collector.BaseReportFieldCollector, org.acra.collector.Collector, ivas.gov.bisp.enumeration.p057cc.j
    public /* synthetic */ boolean enabled(r rVar) {
        T.b(rVar);
        return true;
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
