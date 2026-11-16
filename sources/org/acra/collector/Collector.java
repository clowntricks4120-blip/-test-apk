package org.acra.collector;

import android.content.Context;
import ivas.gov.bisp.enumeration.aB.r;
import ivas.gov.bisp.enumeration.bY.b;
import ivas.gov.bisp.enumeration.p057cc.j;

/* JADX INFO: loaded from: classes.dex */
public interface Collector extends j {

    public enum Order {
        FIRST,
        EARLY,
        NORMAL,
        LATE,
        LAST
    }

    void collect(Context context, r rVar, b bVar, ivas.gov.bisp.enumeration.p059ce.j jVar);

    @Override // ivas.gov.bisp.enumeration.p057cc.j
    /* bridge */ /* synthetic */ boolean enabled(r rVar);

    Order getOrder();
}
