package org.acra.startup;

import android.content.Context;
import ivas.gov.bisp.enumeration.aB.r;
import ivas.gov.bisp.enumeration.p057cc.j;
import ivas.gov.bisp.enumeration.p062ch.p;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface StartupProcessor extends j {
    @Override // ivas.gov.bisp.enumeration.p057cc.j
    /* bridge */ /* synthetic */ boolean enabled(r rVar);

    void processReports(Context context, r rVar, List<p> list);
}
