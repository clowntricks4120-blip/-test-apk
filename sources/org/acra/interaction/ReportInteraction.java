package org.acra.interaction;

import android.content.Context;
import ivas.gov.bisp.enumeration.aB.r;
import ivas.gov.bisp.enumeration.p057cc.j;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public interface ReportInteraction extends j {
    @Override // ivas.gov.bisp.enumeration.p057cc.j
    /* bridge */ /* synthetic */ boolean enabled(r rVar);

    boolean performInteraction(Context context, r rVar, File file);
}
