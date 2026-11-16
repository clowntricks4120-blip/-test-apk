package org.acra.config;

import android.content.Context;
import ivas.gov.bisp.enumeration.aB.r;
import ivas.gov.bisp.enumeration.bY.af;
import ivas.gov.bisp.enumeration.bY.b;
import ivas.gov.bisp.enumeration.p057cc.j;

/* JADX INFO: loaded from: classes.dex */
public interface ReportingAdministrator extends j {
    @Override // ivas.gov.bisp.enumeration.p057cc.j
    /* bridge */ /* synthetic */ boolean enabled(r rVar);

    void notifyReportDropped(Context context, r rVar);

    boolean shouldFinishActivity(Context context, r rVar, af afVar);

    boolean shouldKillApplication(Context context, r rVar, b bVar, ivas.gov.bisp.enumeration.p059ce.j jVar);

    boolean shouldSendReport(Context context, r rVar, ivas.gov.bisp.enumeration.p059ce.j jVar);

    boolean shouldStartCollecting(Context context, r rVar, b bVar);
}
