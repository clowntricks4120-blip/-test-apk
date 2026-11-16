package org.acra.scheduler;

import android.content.Context;
import ivas.gov.bisp.enumeration.aB.r;
import ivas.gov.bisp.enumeration.p057cc.j;

/* JADX INFO: loaded from: classes.dex */
public interface SenderSchedulerFactory extends j {
    ivas.gov.bisp.enumeration.p060cf.j create(Context context, r rVar);

    @Override // ivas.gov.bisp.enumeration.p057cc.j
    /* bridge */ /* synthetic */ boolean enabled(r rVar);
}
