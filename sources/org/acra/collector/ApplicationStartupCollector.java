package org.acra.collector;

import android.content.Context;
import ivas.gov.bisp.enumeration.aB.r;

/* JADX INFO: loaded from: classes.dex */
public interface ApplicationStartupCollector extends Collector {
    void collectApplicationStartUp(Context context, r rVar);

    @Override // org.acra.collector.Collector, ivas.gov.bisp.enumeration.p057cc.j
    /* bridge */ /* synthetic */ boolean enabled(r rVar);
}
